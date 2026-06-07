import angr
import archinfo

def find_reg_natives(path):
    print(f"Analyzing {path} for RegisterNatives...")
    p = angr.Project(path, auto_load_libs=False)
    cfg = p.analyses.CFGFast()

    # RegisterNatives usually takes (JNIEnv*, jclass, const JNINativeMethod*, jint)
    # We look for calls to RegisterNatives or for the JNINativeMethod structures

    for func in cfg.kb.functions.values():
        if "RegisterNatives" in func.name:
            print(f"Found RegisterNatives at {hex(func.addr)}")

    # Also look for JNI_OnLoad
    if "JNI_OnLoad" in cfg.kb.functions:
        onload = cfg.kb.functions["JNI_OnLoad"]
        print(f"Found JNI_OnLoad at {hex(onload.addr)}")

find_reg_natives("mundo-premium-sdk/src/main/jni/arm64-v8a/libqbyr5rthukuw.so")
find_reg_natives("mundo-premium-sdk/src/main/jni/arm64-v8a/libmsaoaidsec.so")
