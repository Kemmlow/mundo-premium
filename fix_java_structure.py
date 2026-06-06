import os
import shutil

src_dir = "mundo-premium-sdk/src/main/java"

def fix_recursive(current_dir):
    # Get the list of entries first because we might modify the directory structure
    try:
        entries = os.listdir(current_dir)
    except OSError:
        return

    for entry in entries:
        full_path = os.path.join(current_dir, entry)
        if os.path.isdir(full_path):
            fix_recursive(full_path)

            # Check if this directory ends with .java and contains a file with the same name
            if entry.endswith(".java"):
                java_file_within = os.path.join(full_path, entry)
                if os.path.isfile(java_file_within):
                    # We want to move the file out and remove the directory
                    # But the file already has the name of the directory.
                    # We move it to a temporary location, delete the dir, then move it back.
                    temp_location = os.path.join(current_dir, entry + ".tmp_fix")
                    shutil.move(java_file_within, temp_location)

                    # Remove the now-empty (hopefully) directory
                    try:
                        os.rmdir(full_path)
                    except OSError:
                        # If not empty, move everything else out too?
                        # For now, let's just move the main file.
                        print(f"Warning: Directory {full_path} not empty.")
                        for sub_entry in os.listdir(full_path):
                            shutil.move(os.path.join(full_path, sub_entry), os.path.join(current_dir, sub_entry))
                        os.rmdir(full_path)

                    os.rename(temp_location, full_path)
                    print(f"Fixed: {full_path}")

fix_recursive(src_dir)
