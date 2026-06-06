#!/usr/bin/env python3
"""
Mundo SDK - Complete Deobfuscation & Recovery Script
"""

import os
import re
import json
import shutil
from pathlib import Path

SRC_DIR = 'decompiled_java/sources'
OUT_DIR = 'mundo-sdk-recovered/src/main/java'

# Load mappings
with open('mundo-sdk-recovered/deobfuscation_mappings.json', 'r', encoding='utf-8') as f:
    mappings = json.load(f)

CLASS_RENAMES = mappings['class_renames']
METHOD_RENAMES = mappings['method_renames']
FIELD_RENAMES = mappings['field_renames']
CHINESE_NAME_MAP = mappings['chinese_name_map']

os.makedirs(OUT_DIR, exist_ok=True)

def rename_chinese_identifiers(content):
    result = content
    for chinese_name, clean_name in CHINESE_NAME_MAP.items():
        if chinese_name in result:
            escaped = re.escape(chinese_name)
            result = re.sub(escaped, clean_name, result)
    return result

def rename_classes(content):
    result = content
    for obf_name, clean_name in CLASS_RENAMES.items():
        pattern = r'\b' + re.escape(obf_name) + r'\b'
        result = re.sub(pattern, clean_name, result)
    return result

def rename_methods(content):
    result = content
    for obf_name, clean_name in METHOD_RENAMES.items():
        pattern = r'\b' + re.escape(obf_name) + r'\b'
        result = re.sub(pattern, clean_name, result)
    return result

def rename_fields(content):
    result = content
    for obf_name, clean_name in FIELD_RENAMES.items():
        pattern = r'\b' + re.escape(obf_name) + r'\b'
        result = re.sub(pattern, clean_name, result)
    return result

def clean_comments(content):
    result = re.sub(r'\s*/\*\s*reason: contains not printable characters\s*\*/\s*', '', content)
    result = re.sub(r'\s*/\*\s*renamed from:.*?\s*\*/\s*', '', content)
    result = re.sub(r'\s*//\s*from class:\s*top\.bienvenido\.date_24323\.\w+', '', content)
    result = re.sub(r'\s*/\*\s*loaded from:\s*\w+\.class\s*\*/\s*', '', content)
    return result

def rename_file_content(content, filepath):
    result = content
    result = rename_chinese_identifiers(result)
    result = rename_classes(result)
    result = rename_methods(result)
    result = rename_fields(result)
    result = clean_comments(result)
    
    # Package renames
    result = re.sub(r'package\s+top\.bienvenido\.date_24323\s*;', 'package net.bienvenido.mundo.sdk.internal;', result)
    result = re.sub(r'import\s+top\.bienvenido\.date_24323\.', 'import net.bienvenido.mundo.sdk.internal.', result)
    result = re.sub(r'import\s+net_62v\.external\.', 'import net.bienvenido.mundo.sdk.external.', result)
    result = re.sub(r'package\s+net_62v\.external\s*;', 'package net.bienvenido.mundo.sdk.external;', result)
    result = re.sub(r'package\s+top\.bienvenido\.mundo\.', 'package net.bienvenido.mundo.sdk.', result)
    result = re.sub(r'import\s+top\.bienvenido\.mundo\.', 'import net.bienvenido.mundo.sdk.', result)
    
    # Remove Jadx comments
    result = re.sub(r'\n/\*\s*loaded from:.*?\s*\*/\s*\n', '\n', result)
    
    return result

def get_new_filename(filepath):
    basename = os.path.basename(filepath)
    name_without_ext = os.path.splitext(basename)[0]
    
    if name_without_ext in CLASS_RENAMES:
        return CLASS_RENAMES[name_without_ext] + '.java'
    
    if '$' in name_without_ext:
        outer_class, inner_num = name_without_ext.rsplit('$', 1)
        if outer_class in CLASS_RENAMES:
            return CLASS_RENAMES[outer_class] + '$' + inner_num + '.java'
    
    return basename

def process_file(filepath):
    with open(filepath, 'r', encoding='utf-8', errors='replace') as f:
        content = f.read()
    
    renamed_content = rename_file_content(content, filepath)
    
    rel_path = os.path.relpath(filepath, SRC_DIR)
    new_filename = get_new_filename(filepath)
    new_rel_path = os.path.join(os.path.dirname(rel_path), new_filename)
    
    output_path = os.path.join(OUT_DIR, new_rel_path)
    os.makedirs(os.path.dirname(output_path), exist_ok=True)
    
    with open(output_path, 'w', encoding='utf-8') as f:
        f.write(renamed_content)
    
    return output_path

print("Starting deobfuscation process...")
file_count = 0
for root, dirs, files in os.walk(SRC_DIR):
    for fname in sorted(files):
        if fname.endswith('.java'):
            filepath = os.path.join(root, fname)
            try:
                process_file(filepath)
                file_count += 1
                if file_count % 50 == 0:
                    print(f"  Processed {file_count} files...")
            except Exception as e:
                print(f"  ERROR processing {filepath}: {e}")

print(f"\nDeobfuscation complete! {file_count} files processed.")
print(f"Output directory: {OUT_DIR}")
