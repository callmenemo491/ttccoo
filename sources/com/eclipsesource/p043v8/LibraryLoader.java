package com.eclipsesource.p043v8;

/* loaded from: classes.dex */
class LibraryLoader {
    public static final java.lang.String DELIMITER = null;
    public static final java.lang.String SEPARATOR = null;
    public static final java.lang.String SWT_LIB_DIR = ".j2v8";

    static {
            java.lang.String r0 = "line.separator"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            com.eclipsesource.p043v8.LibraryLoader.DELIMITER = r0
            java.lang.String r0 = "file.separator"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            com.eclipsesource.p043v8.LibraryLoader.SEPARATOR = r0
            return
    }

    public LibraryLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void chmod(java.lang.String r4, java.lang.String r5) {
            boolean r0 = com.eclipsesource.p043v8.PlatformDetector.C1030OS.isWindows()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L20
            r1 = 3
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L20
            r2 = 0
            java.lang.String r3 = "chmod"
            r1[r2] = r3     // Catch: java.lang.Throwable -> L20
            r2 = 1
            r1[r2] = r4     // Catch: java.lang.Throwable -> L20
            r4 = 2
            r1[r4] = r5     // Catch: java.lang.Throwable -> L20
            java.lang.Process r4 = r0.exec(r1)     // Catch: java.lang.Throwable -> L20
            r4.waitFor()     // Catch: java.lang.Throwable -> L20
        L20:
            return
    }

    public static java.lang.String computeLibraryFullName(boolean r1) {
            java.lang.String r0 = "lib"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = computeLibraryShortName(r1)
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            java.lang.String r1 = com.eclipsesource.p043v8.PlatformDetector.C1030OS.getLibFileExtension()
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String computeLibraryShortName(boolean r4) {
            if (r4 == 0) goto Ld
            boolean r4 = com.eclipsesource.p043v8.PlatformDetector.C1030OS.isLinux()
            if (r4 == 0) goto Ld
            java.lang.String r4 = com.eclipsesource.v8.PlatformDetector.Vendor.getName()
            goto Le
        Ld:
            r4 = 0
        Le:
            java.lang.String r0 = com.eclipsesource.p043v8.PlatformDetector.C1030OS.getName()
            java.lang.String r1 = com.eclipsesource.v8.PlatformDetector.Arch.getName()
            java.lang.String r2 = "j2v8"
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.String r3 = "-"
            if (r4 == 0) goto L25
            java.lang.String r4 = p064e.C1493g.m4049a(r3, r4)
            goto L27
        L25:
            java.lang.String r4 = ""
        L27:
            p179k1.C3661s.m8090a(r2, r4, r3, r0, r3)
            r2.append(r1)
            java.lang.String r4 = r2.toString()
            return r4
    }

    public static boolean extract(java.lang.String r7, java.lang.String r8, java.lang.StringBuffer r9) {
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            r1 = 1
            r2 = 0
            r3 = 0
            boolean r4 = r0.exists()     // Catch: java.lang.Throwable -> L52
            if (r4 == 0) goto L11
            r0.delete()     // Catch: java.lang.Throwable -> L52
        L11:
            java.lang.Class<com.eclipsesource.v8.LibraryLoader> r4 = com.eclipsesource.p043v8.LibraryLoader.class
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r5.<init>()     // Catch: java.lang.Throwable -> L52
            java.lang.String r6 = "/"
            r5.append(r6)     // Catch: java.lang.Throwable -> L52
            r5.append(r8)     // Catch: java.lang.Throwable -> L52
            java.lang.String r8 = r5.toString()     // Catch: java.lang.Throwable -> L52
            java.io.InputStream r8 = r4.getResourceAsStream(r8)     // Catch: java.lang.Throwable -> L52
            if (r8 == 0) goto L6d
            r4 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L54
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L54
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L54
        L33:
            int r2 = r8.read(r4)     // Catch: java.lang.Throwable -> L50
            r6 = -1
            if (r2 == r6) goto L3e
            r5.write(r4, r3, r2)     // Catch: java.lang.Throwable -> L50
            goto L33
        L3e:
            r5.close()     // Catch: java.lang.Throwable -> L50
            r8.close()     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = "755"
            chmod(r2, r7)     // Catch: java.lang.Throwable -> L50
            boolean r7 = load(r7, r9)     // Catch: java.lang.Throwable -> L50
            if (r7 == 0) goto L6d
            return r1
        L50:
            r2 = r5
            goto L54
        L52:
            r8 = r2
            r1 = 0
        L54:
            if (r2 == 0) goto L5b
            r2.close()     // Catch: java.io.IOException -> L5a
            goto L5b
        L5a:
        L5b:
            if (r8 == 0) goto L62
            r8.close()     // Catch: java.io.IOException -> L61
            goto L62
        L61:
        L62:
            if (r1 == 0) goto L6d
            boolean r7 = r0.exists()
            if (r7 == 0) goto L6d
            r0.delete()
        L6d:
            return r3
    }

    public static boolean extract(java.lang.String r1, boolean r2, java.lang.StringBuffer r3) {
            java.lang.String r2 = computeLibraryFullName(r2)
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r0 = com.eclipsesource.p043v8.LibraryLoader.SEPARATOR
            java.lang.String r1 = p346u.C6269n.m12888a(r1, r0, r2)
            boolean r1 = extract(r1, r2, r3)
            return r1
    }

    public static boolean load(java.lang.String r2, java.lang.StringBuffer r3) {
            java.lang.String r0 = com.eclipsesource.p043v8.LibraryLoader.SEPARATOR     // Catch: java.lang.UnsatisfiedLinkError -> L12
            int r0 = r2.indexOf(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L12
            r1 = -1
            if (r0 == r1) goto Ld
            java.lang.System.load(r2)     // Catch: java.lang.UnsatisfiedLinkError -> L12
            goto L10
        Ld:
            java.lang.System.loadLibrary(r2)     // Catch: java.lang.UnsatisfiedLinkError -> L12
        L10:
            r2 = 1
            return r2
        L12:
            r2 = move-exception
            int r0 = r3.length()
            if (r0 != 0) goto L1e
            java.lang.String r0 = com.eclipsesource.p043v8.LibraryLoader.DELIMITER
            r3.append(r0)
        L1e:
            r0 = 9
            r3.append(r0)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = com.eclipsesource.p043v8.LibraryLoader.DELIMITER
            r3.append(r2)
            r2 = 0
            return r2
    }

    public static void loadLibrary(java.lang.String r4) {
            boolean r0 = com.eclipsesource.p043v8.PlatformDetector.C1030OS.isAndroid()
            if (r0 == 0) goto Lc
            java.lang.String r4 = "j2v8"
            java.lang.System.loadLibrary(r4)
            return
        Lc:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 1
            boolean r2 = tryLoad(r1, r0)
            if (r2 == 0) goto L19
            return
        L19:
            r2 = 0
            boolean r3 = tryLoad(r2, r0)
            if (r3 == 0) goto L21
            return
        L21:
            if (r4 == 0) goto L24
            goto L2a
        L24:
            java.lang.String r4 = "java.io.tmpdir"
            java.lang.String r4 = java.lang.System.getProperty(r4)
        L2a:
            boolean r1 = extract(r4, r1, r0)
            if (r1 == 0) goto L31
            return
        L31:
            boolean r4 = extract(r4, r2, r0)
            if (r4 == 0) goto L38
            return
        L38:
            java.lang.UnsatisfiedLinkError r4 = new java.lang.UnsatisfiedLinkError
            java.lang.String r1 = "Could not load J2V8 library. Reasons: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
    }

    public static boolean tryLoad(boolean r4, java.lang.StringBuffer r5) {
            java.lang.String r0 = computeLibraryShortName(r4)
            java.lang.String r4 = computeLibraryFullName(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "user.dir"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            r1.append(r2)
            java.lang.String r2 = com.eclipsesource.p043v8.LibraryLoader.SEPARATOR
            r1.append(r2)
            java.lang.String r3 = "jni"
            r1.append(r3)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            boolean r4 = load(r4, r5)
            r2 = 1
            if (r4 == 0) goto L32
            return r2
        L32:
            boolean r4 = load(r0, r5)
            if (r4 == 0) goto L39
            return r2
        L39:
            java.io.File r4 = new java.io.File
            r4.<init>(r1)
            boolean r4 = r4.exists()
            if (r4 == 0) goto L4b
            boolean r4 = load(r1, r5)
            if (r4 == 0) goto L4b
            return r2
        L4b:
            r4 = 0
            return r4
    }
}
