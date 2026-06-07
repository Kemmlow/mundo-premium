cmake_minimum_required(VERSION 3.10.2)
project("mundo-core")

if(NOT MUNDO_LIB_NAME)
    execute_process(
        COMMAND python3 -c "import random, string; print('q' + ''.join(random.choice(string.ascii_lowercase + string.digits) for _ in range(11)))"
        OUTPUT_VARIABLE MUNDO_LIB_NAME
        OUTPUT_STRIP_TRAILING_WHITESPACE
    )
endif()

add_definitions(-DMUNDO_LIB_NAME="${MUNDO_LIB_NAME}")

add_library(${MUNDO_LIB_NAME} SHARED main.cpp)
target_link_libraries(${MUNDO_LIB_NAME} log dl)

set_target_properties(${MUNDO_LIB_NAME} PROPERTIES
    CXX_STANDARD 20
    CXX_STANDARD_REQUIRED ON
    C_VISIBILITY_PRESET hidden
    CXX_VISIBILITY_PRESET hidden
)
