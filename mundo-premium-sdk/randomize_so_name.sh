#!/bin/bash
# Generate a random 12-character name starting with 'q'
RANDOM_BASE="q$(cat /dev/urandom | tr -dc 'a-z0-9' | fold -w 11 | head -n 1)"

# Update NativeConfig.java
sed -i "s/LIB_PROTECT_NAME = \".*\";/LIB_PROTECT_NAME = \"${RANDOM_BASE}\";/" mundo-premium-sdk/src/main/java/top/bienvenido/mundo/common/initialize/NativeConfig.java

# Update CMakeLists.txt (replacing the default set if it exists, though we use dynamic gen now)
# We'll just rely on the dynamic gen in CMake but this syncs the Java side.

echo "${RANDOM_BASE}"
