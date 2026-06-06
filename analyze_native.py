import angr
import os

def analyze_so(path):
    print(f"\n--- Analyzing {os.path.basename(path)} ---")
    try:
        p = angr.Project(path, auto_load_libs=False)
        cfg = p.analyses.CFGFast()

        print(f"Functions found: {len(cfg.kb.functions)}")

        # Get exported symbols
        exports = [s.name for s in p.loader.main_object.symbols if s.is_export]
        print(f"Exports count: {len(exports)}")
        for e in exports[:20]:
            print(f"  Export: {e}")

        # Look for JNI functions specifically
        jni_funcs = [f for f in cfg.kb.functions if "Java_" in f or "JNI_" in f]
        print(f"JNI functions found: {len(jni_funcs)}")
        for f in jni_funcs:
            print(f"  JNI Func: {f}")

    except Exception as e:
        print(f"Error analyzing {path}: {e}")

analyze_so("mundo-premium-sdk/src/main/jni/arm64-v8a/libqbyr5rthukuw.so")
analyze_so("mundo-premium-sdk/src/main/jni/arm64-v8a/libmsaoaidsec.so")
