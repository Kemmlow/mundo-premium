#!/usr/bin/env python3
"""
Mundo SDK - Complete Deobfuscation & Recovery Script

This script takes the Jadx-decompiled source and produces clean, readable,
production-grade Java source with all obfuscated names replaced with
meaningful identifiers.

Based on analysis of:
- lsparanoid obfuscation patterns (Chinese insult names as identifiers)
- BlackBox SDK reference architecture
- AIDL interface method signatures
- Cross-reference analysis of usage patterns
"""

import os
import re
import json
import shutil
from pathlib import Path

# Load mappings
with open('mundo-sdk-recovered/deobfuscation_mappings.json', 'r') as f:
    mappings = json.load(f)

CLASS_RENAMES = mappings['class_renames']
METHOD_RENAMES = mappings['method_renames']
FIELD_RENAMES = mappings['field_renames']
CHINESE_NAME_MAP = mappings['chinese_name_map']

SRC_DIR = 'decompiled_java/sources'
OUT_DIR = 'mundo-sdk-recovered/src/main/java'

# Ensure output dir exists
os.makedirs(OUT_DIR, exist_ok=True)

def rename_chinese_identifiers(content):
    """Replace all Chinese obfuscated identifiers with meaningful names."""
    result = content
    
    # Replace field/method names that are pure Chinese strings
    # Pattern: Chinese characters used as identifiers
    # These appear in: field declarations, method declarations, method calls, field accesses
    
    for chinese_name, clean_name in CHINESE_NAME_MAP.items():
        if chinese_name in result:
            # Escape special regex characters in the Chinese name
            escaped = re.escape(chinese_name)
            result = re.sub(escaped, clean_name, result)
    
    return result

def rename_classes(content):
    """Replace obfuscated class names with meaningful names."""
    result = content
    for obf_name, clean_name in CLASS_RENAMES.items():
        # Match class name as a word boundary
        pattern = r'\b' + re.escape(obf_name) + r'\b'
        result = re.sub(pattern, clean_name, result)
    return result

def rename_methods(content):
    """Replace obfuscated method names with meaningful names."""
    result = content
    for obf_name, clean_name in METHOD_RENAMES.items():
        # Match method names (with word boundary to avoid partial matches)
        pattern = r'\b' + re.escape(obf_name) + r'\b'
        result = re.sub(pattern, clean_name, result)
    return result

def rename_fields(content):
    """Replace obfuscated field names with meaningful names."""
    result = content
    for obf_name, clean_name in FIELD_RENAMES.items():
        pattern = r'\b' + re.escape(obf_name) + r'\b'
        result = re.sub(pattern, clean_name, result)
    return result

def clean_comments(content):
    """Clean up Jadx-generated comments about obfuscation."""
    # Remove "reason: contains not printable characters" comments
    result = re.sub(r'\s*/\*\s*reason: contains not printable characters\s*\*/\s*', '', content)
    # Remove "renamed from: ChineseName" comments
    result = re.sub(r'\s*/\*\s*renamed from:.*?\s*\*/\s*', '', content)
    # Remove "from class: top.bienvenido.date_24323.xxx" comments
    result = re.sub(r'\s*//\s*from class:\s*top\.bienvenido\.date_24323\.\w+', '', content)
    # Remove "loaded from: xxx.class" comments
    result = re.sub(r'\s*/\*\s*loaded from:\s*\w+\.class\s*\*/\s*', '', content)
    return result

def rename_file(filepath, content):
    """Apply all renaming transformations."""
    result = content
    result = rename_chinese_identifiers(result)
    result = rename_classes(result)
    result = rename_methods(result)
    result = rename_fields(result)
    result = clean_comments(result)
    return result

def rename_filename(filepath):
    """Determine the new filename based on class renames."""
    basename = os.path.basename(filepath)
    name_without_ext = os.path.splitext(basename)[0]
    
    if name_without_ext in CLASS_RENAMES:
        return CLASS_RENAMES[name_without_ext] + '.java'
    
    # Handle inner classes (e.g., b6$1 -> MundoCoreReflection$1)
    if '$' in name_without_ext:
        outer_class, inner_num = name_without_ext.rsplit('$', 1)
        if outer_class in CLASS_RENAMES:
            return CLASS_RENAMES[outer_class] + '$' + inner_num + '.java'
    
    return basename

def process_file(filepath):
    """Process a single Java file."""
    with open(filepath, 'r', encoding='utf-8', errors='replace') as f:
        content = f.read()
    
    # Apply all transformations
    renamed_content = rename_file(filepath, content)
    
    # Determine output path
    rel_path = os.path.relpath(filepath, SRC_DIR)
    new_filename = rename_filename(filepath)
    new_rel_path = os.path.join(os.path.dirname(rel_path), new_filename)
    
    # Update package declaration for internal classes
    # top.bienvenido.date_24323 -> net.bienvenido.mundo.sdk.internal
    renamed_content = re.sub(
        r'package\s+top\.bienvenido\.date_24323\s*;',
        'package net.bienvenido.mundo.sdk.internal;',
        renamed_content
    )
    
    # Update import declarations
    renamed_content = re.sub(
        r'import\s+top\.bienvenido\.date_24323\.',
        'import net.bienvenido.mundo.sdk.internal.',
        renamed_content
    )
    renamed_content = re.sub(
        r'import\s+net_62v\.external\.',
        'import net.bienvenido.mundo.sdk.external.',
        renamed_content
    )
    
    # Update package declaration for external classes
    renamed_content = re.sub(
        r'package\s+net_62v\.external\s*;',
        'package net.bienvenido.mundo.sdk.external;',
        renamed_content
    )
    
    # Update package declaration for mundo classes
    renamed_content = re.sub(
        r'package\s+top\.bienvenido\.mundo\.',
        'package net.bienvenido.mundo.sdk.',
        renamed_content
    )
    renamed_content = re.sub(
        r'import\s+top\.bienvenido\.mundo\.',
        'import net.bienvenido.mundo.sdk.',
        renamed_content
    )
    
    # Remove "loaded from: xxx.class" Jadx comments
    renamed_content = re.sub(r'\n/\*\s*loaded from:.*?\s*\*/\s*\n', '\n', renamed_content)
    
    output_path = os.path.join(OUT_DIR, new_rel_path)
    os.makedirs(os.path.dirname(output_path), exist_ok=True)
    
    with open(output_path, 'w', encoding='utf-8') as f:
        f.write(renamed_content)
    
    return output_path

# Process all Java files
print("Starting deobfuscation process...")
file_count = 0
for root, dirs, files in os.walk(SRC_DIR):
    for fname in sorted(files):
        if fname.endswith('.java'):
            filepath = os.path.join(root, fname)
            try:
                output_path = process_file(filepath)
                file_count += 1
                if file_count % 50 == 0:
                    print(f"  Processed {file_count} files...")
            except Exception as e:
                print(f"  ERROR processing {filepath}: {e}")

print(f"\nDeobfuscation complete! {file_count} files processed.")
print(f"Output directory: {OUT_DIR}")
