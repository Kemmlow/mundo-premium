LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

ifeq ($(MUNDO_LIB_NAME),)
  MUNDO_LIB_NAME := $(shell python3 -c "import random, string; print('q' + ''.join(random.choice(string.ascii_lowercase + string.digits) for _ in range(11)))")
endif

LOCAL_MODULE := $(MUNDO_LIB_NAME)
LOCAL_SRC_FILES := ../cpp/main.cpp
LOCAL_CFLAGS += -Wall -Wextra -Wno-unused-parameter -fvisibility=hidden -ffunction-sections -fdata-sections -fno-exceptions -fno-rtti -DMUNDO_LIB_NAME=\"$(MUNDO_LIB_NAME)\"
LOCAL_LDFLAGS += -Wl,--gc-sections -Wl,--exclude-libs,ALL
LOCAL_LDLIBS += -llog -ldl

include $(BUILD_SHARED_LIBRARY)
