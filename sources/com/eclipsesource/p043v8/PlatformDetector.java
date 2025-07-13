package com.eclipsesource.p043v8;

/* loaded from: classes.dex */
public class PlatformDetector {

    public static class Arch {
        public Arch() {
                r0 = this;
                r0.<init>()
                return
        }

        public static java.lang.String getName() {
                java.lang.String r0 = "os.arch"
                java.lang.String r0 = java.lang.System.getProperty(r0)
                java.lang.String r1 = com.eclipsesource.p043v8.PlatformDetector.access$000(r0)
                java.lang.String r2 = "unknown"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L13
                return r1
            L13:
                java.lang.UnsatisfiedLinkError r1 = new java.lang.UnsatisfiedLinkError
                java.lang.String r2 = "Unsupported arch: "
                java.lang.String r0 = p064e.C1493g.m4049a(r2, r0)
                r1.<init>(r0)
                throw r1
        }
    }

    /* renamed from: com.eclipsesource.v8.PlatformDetector$OS */
    public static class C1030OS {
        public C1030OS() {
                r0 = this;
                r0.<init>()
                return
        }

        public static java.lang.String getLibFileExtension() {
                boolean r0 = isWindows()
                if (r0 == 0) goto L9
                java.lang.String r0 = "dll"
                return r0
            L9:
                boolean r0 = isMac()
                if (r0 == 0) goto L12
                java.lang.String r0 = "dylib"
                return r0
            L12:
                boolean r0 = isLinux()
                if (r0 != 0) goto L3c
                boolean r0 = isAndroid()
                if (r0 != 0) goto L3c
                boolean r0 = isNativeClient()
                if (r0 == 0) goto L25
                goto L3c
            L25:
                java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError
                java.lang.String r1 = "Unsupported platform library-extension for: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r2 = getName()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L3c:
                java.lang.String r0 = "so"
                return r0
        }

        public static java.lang.String getName() {
                java.lang.String r0 = "os.name"
                java.lang.String r0 = java.lang.System.getProperty(r0)
                java.lang.String r1 = com.eclipsesource.p043v8.PlatformDetector.access$100(r0)
                java.lang.String r2 = "java.specification.vendor"
                java.lang.String r2 = java.lang.System.getProperty(r2)
                java.lang.String r3 = com.eclipsesource.p043v8.PlatformDetector.access$200(r2)
                java.lang.String r4 = "android"
                boolean r3 = r3.contains(r4)
                if (r3 != 0) goto L4b
                boolean r3 = r1.contains(r4)
                if (r3 == 0) goto L23
                goto L4b
            L23:
                java.lang.String r3 = "unknown"
                boolean r3 = r1.equals(r3)
                if (r3 != 0) goto L2c
                return r1
            L2c:
                java.lang.UnsatisfiedLinkError r1 = new java.lang.UnsatisfiedLinkError
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Unsupported platform/vendor: "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = " / "
                r3.append(r0)
                r3.append(r2)
                java.lang.String r0 = r3.toString()
                r1.<init>(r0)
                throw r1
            L4b:
                return r4
        }

        public static boolean isAndroid() {
                java.lang.String r0 = getName()
                java.lang.String r1 = "android"
                boolean r0 = r0.equals(r1)
                return r0
        }

        public static boolean isLinux() {
                java.lang.String r0 = getName()
                java.lang.String r1 = "linux"
                boolean r0 = r0.equals(r1)
                return r0
        }

        public static boolean isMac() {
                java.lang.String r0 = getName()
                java.lang.String r1 = "macosx"
                boolean r0 = r0.equals(r1)
                return r0
        }

        public static boolean isNativeClient() {
                java.lang.String r0 = getName()
                java.lang.String r1 = "nacl"
                boolean r0 = r0.equals(r1)
                return r0
        }

        public static boolean isWindows() {
                java.lang.String r0 = getName()
                java.lang.String r1 = "windows"
                boolean r0 = r0.equals(r1)
                return r0
        }
    }

    public static class Vendor {
        private static final java.lang.String LINUX_ID_PREFIX = "ID=";
        private static final java.lang.String[] LINUX_OS_RELEASE_FILES = null;
        private static final java.lang.String REDHAT_RELEASE_FILE = "/etc/redhat-release";

        static {
                java.lang.String r0 = "/etc/os-release"
                java.lang.String r1 = "/usr/lib/os-release"
                java.lang.String[] r0 = new java.lang.String[]{r0, r1}
                com.eclipsesource.v8.PlatformDetector.Vendor.LINUX_OS_RELEASE_FILES = r0
                return
        }

        public Vendor() {
                r0 = this;
                r0.<init>()
                return
        }

        private static void closeQuietly(java.io.Closeable r0) {
                if (r0 == 0) goto L5
                r0.close()     // Catch: java.io.IOException -> L5
            L5:
                return
        }

        private static java.lang.String getLinuxOsReleaseId() {
                java.lang.String[] r0 = com.eclipsesource.v8.PlatformDetector.Vendor.LINUX_OS_RELEASE_FILES
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L1b
                r3 = r0[r2]
                java.io.File r4 = new java.io.File
                r4.<init>(r3)
                boolean r3 = r4.exists()
                if (r3 == 0) goto L18
                java.lang.String r0 = parseLinuxOsReleaseFile(r4)
                return r0
            L18:
                int r2 = r2 + 1
                goto L4
            L1b:
                java.io.File r0 = new java.io.File
                java.lang.String r1 = "/etc/redhat-release"
                r0.<init>(r1)
                boolean r1 = r0.exists()
                if (r1 == 0) goto L2d
                java.lang.String r0 = parseLinuxRedhatReleaseFile(r0)
                return r0
            L2d:
                java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError
                java.lang.String r1 = "Unsupported linux vendor: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r2 = getName()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public static java.lang.String getName() {
                boolean r0 = com.eclipsesource.p043v8.PlatformDetector.C1030OS.isWindows()
                if (r0 == 0) goto L9
                java.lang.String r0 = "microsoft"
                return r0
            L9:
                boolean r0 = com.eclipsesource.p043v8.PlatformDetector.C1030OS.isMac()
                if (r0 == 0) goto L12
                java.lang.String r0 = "apple"
                return r0
            L12:
                boolean r0 = com.eclipsesource.p043v8.PlatformDetector.C1030OS.isLinux()
                if (r0 == 0) goto L1d
                java.lang.String r0 = getLinuxOsReleaseId()
                return r0
            L1d:
                boolean r0 = com.eclipsesource.p043v8.PlatformDetector.C1030OS.isAndroid()
                if (r0 == 0) goto L26
                java.lang.String r0 = "google"
                return r0
            L26:
                java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError
                java.lang.String r1 = "Unsupported vendor: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r2 = getName()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        private static java.lang.String parseLinuxOsReleaseFile(java.io.File r4) {
                r0 = 0
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                java.lang.String r4 = "utf-8"
                r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L35
            L12:
                java.lang.String r4 = r1.readLine()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L36
                if (r4 == 0) goto L29
                java.lang.String r2 = "ID="
                boolean r2 = r4.startsWith(r2)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L36
                if (r2 == 0) goto L12
                r2 = 3
                java.lang.String r4 = r4.substring(r2)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L36
                java.lang.String r0 = com.eclipsesource.p043v8.PlatformDetector.access$300(r4)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L36
            L29:
                closeQuietly(r1)
                return r0
            L2d:
                r4 = move-exception
                r0 = r1
                goto L31
            L30:
                r4 = move-exception
            L31:
                closeQuietly(r0)
                throw r4
            L35:
                r1 = r0
            L36:
                closeQuietly(r1)
                return r0
        }

        private static java.lang.String parseLinuxRedhatReleaseFile(java.io.File r5) {
                java.lang.String r0 = "centos"
                r1 = 0
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4b
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4b
                java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4b
                r4.<init>(r5)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4b
                java.lang.String r5 = "utf-8"
                r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4b
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4b
                java.lang.String r5 = r2.readLine()     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L4c
                if (r5 == 0) goto L4c
                java.util.Locale r3 = java.util.Locale.US     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L4c
                java.lang.String r5 = r5.toLowerCase(r3)     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L4c
                boolean r3 = r5.contains(r0)     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L4c
                java.lang.String r4 = "fedora"
                if (r3 == 0) goto L29
                goto L3b
            L29:
                boolean r0 = r5.contains(r4)     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L4c
                if (r0 == 0) goto L31
                r0 = r4
                goto L3b
            L31:
                java.lang.String r0 = "red hat enterprise linux"
                boolean r5 = r5.contains(r0)     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L4c
                if (r5 == 0) goto L3f
                java.lang.String r0 = "rhel"
            L3b:
                closeQuietly(r2)
                return r0
            L3f:
                closeQuietly(r2)
                return r1
            L43:
                r5 = move-exception
                r1 = r2
                goto L47
            L46:
                r5 = move-exception
            L47:
                closeQuietly(r1)
                throw r5
            L4b:
                r2 = r1
            L4c:
                closeQuietly(r2)
                return r1
        }
    }

    public PlatformDetector() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.String access$000(java.lang.String r0) {
            java.lang.String r0 = normalizeArch(r0)
            return r0
    }

    public static /* synthetic */ java.lang.String access$100(java.lang.String r0) {
            java.lang.String r0 = normalizeOs(r0)
            return r0
    }

    public static /* synthetic */ java.lang.String access$200(java.lang.String r0) {
            java.lang.String r0 = normalize(r0)
            return r0
    }

    public static /* synthetic */ java.lang.String access$300(java.lang.String r0) {
            java.lang.String r0 = normalizeOsReleaseValue(r0)
            return r0
    }

    private static java.lang.String normalize(java.lang.String r2) {
            java.lang.String r0 = ""
            if (r2 != 0) goto L5
            return r0
        L5:
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r1)
            java.lang.String r1 = "[^a-z0-9]+"
            java.lang.String r2 = r2.replaceAll(r1, r0)
            return r2
    }

    private static java.lang.String normalizeArch(java.lang.String r1) {
            java.lang.String r1 = normalize(r1)
            java.lang.String r0 = "^(x8664|amd64|ia32e|em64t|x64)$"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto Lf
            java.lang.String r1 = "x86_64"
            return r1
        Lf:
            java.lang.String r0 = "^(x8632|x86|i[3-6]86|ia32|x32)$"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L1a
            java.lang.String r1 = "x86_32"
            return r1
        L1a:
            java.lang.String r0 = "^(ia64|itanium64)$"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L25
            java.lang.String r1 = "itanium_64"
            return r1
        L25:
            java.lang.String r0 = "^(sparc|sparc32)$"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L30
            java.lang.String r1 = "sparc_32"
            return r1
        L30:
            java.lang.String r0 = "^(sparcv9|sparc64)$"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L3b
            java.lang.String r1 = "sparc_64"
            return r1
        L3b:
            java.lang.String r0 = "^(arm|arm32)$"
            boolean r0 = r1.matches(r0)
            if (r0 != 0) goto L9a
            java.lang.String r0 = "armv7"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L4c
            goto L9a
        L4c:
            java.lang.String r0 = "aarch64"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L97
            java.lang.String r0 = "armv8"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L5d
            goto L97
        L5d:
            java.lang.String r0 = "^(ppc|ppc32)$"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L68
            java.lang.String r1 = "ppc_32"
            return r1
        L68:
            java.lang.String r0 = "ppc64"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L73
            java.lang.String r1 = "ppc_64"
            return r1
        L73:
            java.lang.String r0 = "ppc64le"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7e
            java.lang.String r1 = "ppcle_64"
            return r1
        L7e:
            java.lang.String r0 = "s390"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L89
            java.lang.String r1 = "s390_32"
            return r1
        L89:
            java.lang.String r0 = "s390x"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L94
            java.lang.String r1 = "s390_64"
            return r1
        L94:
            java.lang.String r1 = "unknown"
            return r1
        L97:
            java.lang.String r1 = "aarch_64"
            return r1
        L9a:
            java.lang.String r1 = "arm_32"
            return r1
    }

    private static java.lang.String normalizeOs(java.lang.String r3) {
            java.lang.String r3 = normalize(r3)
            java.lang.String r0 = "aix"
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto Ld
            return r0
        Ld:
            java.lang.String r0 = "hpux"
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto L16
            return r0
        L16:
            java.lang.String r0 = "os400"
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto L30
            int r1 = r3.length()
            r2 = 5
            if (r1 <= r2) goto L2f
            char r1 = r3.charAt(r2)
            boolean r1 = java.lang.Character.isDigit(r1)
            if (r1 != 0) goto L30
        L2f:
            return r0
        L30:
            java.lang.String r0 = "android"
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto L39
            return r0
        L39:
            java.lang.String r0 = "linux"
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto L42
            return r0
        L42:
            java.lang.String r0 = "nacl"
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto L4b
            return r0
        L4b:
            java.lang.String r0 = "macosx"
            boolean r1 = r3.startsWith(r0)
            if (r1 != 0) goto L95
            java.lang.String r1 = "osx"
            boolean r1 = r3.startsWith(r1)
            if (r1 == 0) goto L5c
            goto L95
        L5c:
            java.lang.String r0 = "freebsd"
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto L65
            return r0
        L65:
            java.lang.String r0 = "openbsd"
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto L6e
            return r0
        L6e:
            java.lang.String r0 = "netbsd"
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto L77
            return r0
        L77:
            java.lang.String r0 = "solaris"
            boolean r0 = r3.startsWith(r0)
            java.lang.String r1 = "sunos"
            if (r0 != 0) goto L94
            boolean r0 = r3.startsWith(r1)
            if (r0 == 0) goto L88
            goto L94
        L88:
            java.lang.String r0 = "windows"
            boolean r3 = r3.startsWith(r0)
            if (r3 == 0) goto L91
            return r0
        L91:
            java.lang.String r3 = "unknown"
            return r3
        L94:
            return r1
        L95:
            return r0
    }

    private static java.lang.String normalizeOsReleaseValue(java.lang.String r2) {
            java.lang.String r2 = r2.trim()
            java.lang.String r0 = "\""
            java.lang.String r1 = ""
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }
}
