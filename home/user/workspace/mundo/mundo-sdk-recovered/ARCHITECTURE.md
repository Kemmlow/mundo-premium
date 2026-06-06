/**
 * Mundo SDK - Production-Grade AAR Recovery
 *
 * A standalone Gradle library project that recreates mundo-premium.aar
 * from decompiled and deobfuscated source code.
 *
 * Architecture Overview:
 * 1. Meta* classes (net.bienvenido.mundo.sdk.external) - Public API surface
 * 2. Service Proxies (IMundoActivityManager, IMundoPackageManager, etc.) - Internal binder interfaces
 * 3. Service Managers - Handle binder lifecycle, registration, and hidden API bypass
 * 4. Virtual File System - Manages isolated storage paths for sandboxed apps
 * 5. Native Libraries (libqbyr5rthukuw.so, libmsaoaidsec.so) - Low-level ART hooks
 * 6. Manifest Components - Stub Activities, Services, Providers, Receivers
 *
 * Deobfuscation Mapping:
 * - a5/g4/f18xaa30c2c7 -> MundoPackageManagerService proxy
 * - b4/g4/f5xaa30c2c7 -> MundoActivityManagerService proxy
 * - f6/g4/f18xaa30c2c7 -> MundoWindowManagerService proxy
 * - lsparanoid Chinese names -> sensitive hooking/anti-detection classes
 */
