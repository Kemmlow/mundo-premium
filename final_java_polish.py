import os
import re
import shutil

internal_dir = "mundo-premium-sdk/src/main/java/net/bienvenido/mundo/sdk/internal/"
target_dir = "mundo-premium-sdk/src/main/java/net/mundo/premium/core/"

# We'll map the remaining jumbled files in internal to core with better names
remaining = [f for f in os.listdir(internal_dir) if f.endswith(".java")]

for f in remaining:
    old_path = os.path.join(internal_dir, f)
    # Give them a prefix based on Mundo and keep the original for uniqueness if we can't infer more
    new_name = "Mundo" + f[0].upper() + f[1:]
    new_path = os.path.join(target_dir, new_name)

    print(f"Final polish: {f} -> {new_name}")

    with open(old_path, 'r') as file:
        content = file.read()

    content = content.replace("package net.bienvenido.mundo.sdk.internal;", "package net.mundo.premium.core;")
    # Update class name
    old_class = f.replace(".java", "")
    new_class = new_name.replace(".java", "")
    content = re.sub(rf'\b{old_class}\b', new_class, content)

    with open(old_path, 'w') as file:
        file.write(content)

    shutil.move(old_path, new_path)

# Remove the old directory if it's empty
if os.path.exists(internal_dir) and not os.listdir(internal_dir):
    os.rmdir(internal_dir)
