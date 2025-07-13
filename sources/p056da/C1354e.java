package p056da;

/* renamed from: da.e */
/* loaded from: classes.dex */
public class C1354e {

    /* renamed from: a */
    public static final char[] f6891a = null;

    /* renamed from: b */
    public static long f6892b;

    /* renamed from: da.e$a */
    public enum a extends java.lang.Enum<p056da.C1354e.a> {

        /* renamed from: Y */
        public static final p056da.C1354e.a f6893Y = null;

        /* renamed from: Z */
        public static final java.util.Map<java.lang.String, p056da.C1354e.a> f6894Z = null;

        /* renamed from: a0 */
        public static final /* synthetic */ p056da.C1354e.a[] f6895a0 = null;

        static {
                da.e$a r0 = new da.e$a
                java.lang.String r1 = "X86_32"
                r2 = 0
                r0.<init>(r1, r2)
                da.e$a r1 = new da.e$a
                java.lang.String r3 = "X86_64"
                r4 = 1
                r1.<init>(r3, r4)
                da.e$a r3 = new da.e$a
                java.lang.String r5 = "ARM_UNKNOWN"
                r6 = 2
                r3.<init>(r5, r6)
                da.e$a r5 = new da.e$a
                java.lang.String r7 = "PPC"
                r8 = 3
                r5.<init>(r7, r8)
                da.e$a r7 = new da.e$a
                java.lang.String r9 = "PPC64"
                r10 = 4
                r7.<init>(r9, r10)
                da.e$a r9 = new da.e$a
                java.lang.String r11 = "ARMV6"
                r12 = 5
                r9.<init>(r11, r12)
                da.e$a r11 = new da.e$a
                java.lang.String r13 = "ARMV7"
                r14 = 6
                r11.<init>(r13, r14)
                da.e$a r13 = new da.e$a
                java.lang.String r15 = "UNKNOWN"
                r14 = 7
                r13.<init>(r15, r14)
                p056da.C1354e.a.f6893Y = r13
                da.e$a r15 = new da.e$a
                java.lang.String r14 = "ARMV7S"
                r12 = 8
                r15.<init>(r14, r12)
                da.e$a r14 = new da.e$a
                java.lang.String r12 = "ARM64"
                r10 = 9
                r14.<init>(r12, r10)
                r12 = 10
                da.e$a[] r12 = new p056da.C1354e.a[r12]
                r12[r2] = r0
                r12[r4] = r1
                r12[r6] = r3
                r12[r8] = r5
                r1 = 4
                r12[r1] = r7
                r2 = 5
                r12[r2] = r9
                r2 = 6
                r12[r2] = r11
                r2 = 7
                r12[r2] = r13
                r2 = 8
                r12[r2] = r15
                r12[r10] = r14
                p056da.C1354e.a.f6895a0 = r12
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>(r1)
                p056da.C1354e.a.f6894Z = r2
                java.lang.String r1 = "armeabi-v7a"
                r2.put(r1, r11)
                java.lang.String r1 = "armeabi"
                r2.put(r1, r9)
                java.lang.String r1 = "arm64-v8a"
                r2.put(r1, r14)
                java.lang.String r1 = "x86"
                r2.put(r1, r0)
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static p056da.C1354e.a valueOf(java.lang.String r1) {
                java.lang.Class<da.e$a> r0 = p056da.C1354e.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                da.e$a r1 = (p056da.C1354e.a) r1
                return r1
        }

        public static p056da.C1354e.a[] values() {
                da.e$a[] r0 = p056da.C1354e.a.f6895a0
                java.lang.Object r0 = r0.clone()
                da.e$a[] r0 = (p056da.C1354e.a[]) r0
                return r0
        }
    }

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000e: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            p056da.C1354e.f6891a = r0
            r0 = -1
            p056da.C1354e.f6892b = r0
            return
    }

    /* renamed from: a */
    public static void m3857a(java.io.Closeable r1, java.lang.String r2) {
            if (r1 == 0) goto Lc
            r1.close()     // Catch: java.io.IOException -> L6
            goto Lc
        L6:
            r1 = move-exception
            java.lang.String r0 = "FirebaseCrashlytics"
            android.util.Log.e(r0, r2, r1)
        Lc:
            return
    }

    /* renamed from: b */
    public static long m3858b(java.lang.String r2, java.lang.String r3, int r4) {
            java.lang.String[] r2 = r2.split(r3)
            r3 = 0
            r2 = r2[r3]
            java.lang.String r2 = r2.trim()
            long r2 = java.lang.Long.parseLong(r2)
            long r0 = (long) r4
            long r2 = r2 * r0
            return r2
    }

    /* renamed from: c */
    public static java.lang.String m3859c(java.io.File r6, java.lang.String r7) {
            java.lang.String r0 = "Failed to close system file reader."
            boolean r1 = r6.exists()
            r2 = 0
            if (r1 == 0) goto L5d
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
        L15:
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L57
            if (r3 == 0) goto L53
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L57
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L57
            int r4 = r3.length     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L57
            r5 = 1
            if (r4 <= r5) goto L15
            r4 = 0
            r4 = r3[r4]     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L57
            boolean r4 = r4.equals(r7)     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L57
            if (r4 == 0) goto L15
            r6 = r3[r5]     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L57
            r2 = r6
            goto L53
        L37:
            r7 = move-exception
            goto L3d
        L39:
            r6 = move-exception
            goto L59
        L3b:
            r7 = move-exception
            r1 = r2
        L3d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r3.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "Error parsing "
            r3.append(r4)     // Catch: java.lang.Throwable -> L57
            r3.append(r6)     // Catch: java.lang.Throwable -> L57
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = "FirebaseCrashlytics"
            android.util.Log.e(r3, r6, r7)     // Catch: java.lang.Throwable -> L57
        L53:
            m3857a(r1, r0)
            goto L5d
        L57:
            r6 = move-exception
            r2 = r1
        L59:
            m3857a(r2, r0)
            throw r6
        L5d:
            return r2
    }

    /* renamed from: d */
    public static boolean m3860d(android.content.Context r2, java.lang.String r3, boolean r4) {
            if (r2 == 0) goto L26
            android.content.res.Resources r0 = r2.getResources()
            if (r0 == 0) goto L26
            java.lang.String r1 = "bool"
            int r1 = m3863g(r2, r3, r1)
            if (r1 <= 0) goto L15
            boolean r2 = r0.getBoolean(r1)
            return r2
        L15:
            java.lang.String r0 = "string"
            int r3 = m3863g(r2, r3, r0)
            if (r3 <= 0) goto L26
            java.lang.String r2 = r2.getString(r3)
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            return r2
        L26:
            return r4
    }

    /* renamed from: e */
    public static int m3861e(android.content.Context r1) {
            boolean r0 = m3867k(r1)
            boolean r1 = m3868l(r1)
            if (r1 == 0) goto Lc
            r0 = r0 | 2
        Lc:
            boolean r1 = android.os.Debug.isDebuggerConnected()
            if (r1 != 0) goto L1b
            boolean r1 = android.os.Debug.waitingForDebugger()
            if (r1 == 0) goto L19
            goto L1b
        L19:
            r1 = 0
            goto L1c
        L1b:
            r1 = 1
        L1c:
            if (r1 == 0) goto L20
            r0 = r0 | 4
        L20:
            return r0
    }

    /* renamed from: f */
    public static java.lang.String m3862f(android.content.Context r2) {
            java.lang.String r0 = "com.google.firebase.crashlytics.mapping_file_id"
            java.lang.String r1 = "string"
            int r0 = m3863g(r2, r0, r1)
            if (r0 != 0) goto L10
            java.lang.String r0 = "com.crashlytics.android.build_id"
            int r0 = m3863g(r2, r0, r1)
        L10:
            if (r0 == 0) goto L1b
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r2 = r2.getString(r0)
            goto L1c
        L1b:
            r2 = 0
        L1c:
            return r2
    }

    /* renamed from: g */
    public static int m3863g(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
            android.content.res.Resources r0 = r3.getResources()
            android.content.Context r1 = r3.getApplicationContext()
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()
            int r1 = r1.icon
            if (r1 <= 0) goto L25
            android.content.res.Resources r2 = r3.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L25
            java.lang.String r1 = r2.getResourcePackageName(r1)     // Catch: android.content.res.Resources.NotFoundException -> L25
            java.lang.String r2 = "android"
            boolean r2 = r2.equals(r1)     // Catch: android.content.res.Resources.NotFoundException -> L25
            if (r2 == 0) goto L29
            java.lang.String r1 = r3.getPackageName()     // Catch: android.content.res.Resources.NotFoundException -> L25
            goto L29
        L25:
            java.lang.String r1 = r3.getPackageName()
        L29:
            int r3 = r0.getIdentifier(r4, r5, r1)
            return r3
    }

    /* renamed from: h */
    public static android.content.SharedPreferences m3864h(android.content.Context r2) {
            java.lang.String r0 = "com.google.firebase.crashlytics"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            return r2
    }

    /* renamed from: i */
    public static synchronized long m3865i() {
            java.lang.Class<da.e> r0 = p056da.C1354e.class
            monitor-enter(r0)
            long r1 = p056da.C1354e.f6892b     // Catch: java.lang.Throwable -> L8e
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L8a
            r1 = 0
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L8e
            java.lang.String r4 = "/proc/meminfo"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r4 = "MemTotal"
            java.lang.String r3 = m3859c(r3, r4)     // Catch: java.lang.Throwable -> L8e
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L8e
            if (r4 != 0) goto L88
            java.util.Locale r4 = java.util.Locale.US     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = r3.toUpperCase(r4)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r4 = "KB"
            boolean r4 = r3.endsWith(r4)     // Catch: java.lang.NumberFormatException -> L71 java.lang.Throwable -> L8e
            if (r4 == 0) goto L37
            java.lang.String r4 = "KB"
            r5 = 1024(0x400, float:1.435E-42)
            long r1 = m3858b(r3, r4, r5)     // Catch: java.lang.NumberFormatException -> L71 java.lang.Throwable -> L8e
            goto L88
        L37:
            java.lang.String r4 = "MB"
            boolean r4 = r3.endsWith(r4)     // Catch: java.lang.NumberFormatException -> L71 java.lang.Throwable -> L8e
            if (r4 == 0) goto L48
            java.lang.String r4 = "MB"
            r5 = 1048576(0x100000, float:1.469368E-39)
            long r1 = m3858b(r3, r4, r5)     // Catch: java.lang.NumberFormatException -> L71 java.lang.Throwable -> L8e
            goto L88
        L48:
            java.lang.String r4 = "GB"
            boolean r4 = r3.endsWith(r4)     // Catch: java.lang.NumberFormatException -> L71 java.lang.Throwable -> L8e
            if (r4 == 0) goto L59
            java.lang.String r4 = "GB"
            r5 = 1073741824(0x40000000, float:2.0)
            long r1 = m3858b(r3, r4, r5)     // Catch: java.lang.NumberFormatException -> L71 java.lang.Throwable -> L8e
            goto L88
        L59:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L71 java.lang.Throwable -> L8e
            r4.<init>()     // Catch: java.lang.NumberFormatException -> L71 java.lang.Throwable -> L8e
            java.lang.String r5 = "Unexpected meminfo format while computing RAM: "
            r4.append(r5)     // Catch: java.lang.NumberFormatException -> L71 java.lang.Throwable -> L8e
            r4.append(r3)     // Catch: java.lang.NumberFormatException -> L71 java.lang.Throwable -> L8e
            java.lang.String r4 = r4.toString()     // Catch: java.lang.NumberFormatException -> L71 java.lang.Throwable -> L8e
            java.lang.String r5 = "FirebaseCrashlytics"
            r6 = 0
            android.util.Log.w(r5, r4, r6)     // Catch: java.lang.NumberFormatException -> L71 java.lang.Throwable -> L8e
            goto L88
        L71:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r5.<init>()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = "Unexpected meminfo format while computing RAM: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L8e
            r5.append(r3)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r5 = "FirebaseCrashlytics"
            android.util.Log.e(r5, r3, r4)     // Catch: java.lang.Throwable -> L8e
        L88:
            p056da.C1354e.f6892b = r1     // Catch: java.lang.Throwable -> L8e
        L8a:
            long r1 = p056da.C1354e.f6892b     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r0)
            return r1
        L8e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* renamed from: j */
    public static java.lang.String m3866j(byte[] r6) {
            int r0 = r6.length
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            r1 = 0
        L6:
            int r2 = r6.length
            if (r1 >= r2) goto L22
            r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 * 2
            char[] r4 = p056da.C1354e.f6891a
            int r5 = r2 >>> 4
            char r5 = r4[r5]
            r0[r3] = r5
            int r3 = r3 + 1
            r2 = r2 & 15
            char r2 = r4[r2]
            r0[r3] = r2
            int r1 = r1 + 1
            goto L6
        L22:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
            return r6
    }

    /* renamed from: k */
    public static boolean m3867k(android.content.Context r2) {
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r0 = "android_id"
            java.lang.String r2 = android.provider.Settings.Secure.getString(r2, r0)
            java.lang.String r0 = android.os.Build.PRODUCT
            java.lang.String r1 = "sdk"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L2b
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "goldfish"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L2b
            java.lang.String r1 = "ranchu"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L2b
            if (r2 != 0) goto L29
            goto L2b
        L29:
            r2 = 0
            goto L2c
        L2b:
            r2 = 1
        L2c:
            return r2
    }

    /* renamed from: l */
    public static boolean m3868l(android.content.Context r3) {
            boolean r3 = m3867k(r3)
            java.lang.String r0 = android.os.Build.TAGS
            r1 = 1
            if (r3 != 0) goto L14
            if (r0 == 0) goto L14
            java.lang.String r2 = "test-keys"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L14
            return r1
        L14:
            java.io.File r0 = new java.io.File
            java.lang.String r2 = "/system/app/Superuser.apk"
            r0.<init>(r2)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L22
            return r1
        L22:
            java.io.File r0 = new java.io.File
            java.lang.String r2 = "/system/xbin/su"
            r0.<init>(r2)
            if (r3 != 0) goto L32
            boolean r3 = r0.exists()
            if (r3 == 0) goto L32
            return r1
        L32:
            r3 = 0
            return r3
    }

    /* renamed from: m */
    public static java.lang.String m3869m(java.lang.String r2) {
            java.lang.String r0 = "SHA-1"
            byte[] r2 = r2.getBytes()
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L16
            r0.update(r2)
            byte[] r2 = r0.digest()
            java.lang.String r2 = m3866j(r2)
            goto L20
        L16:
            r2 = move-exception
            java.lang.String r0 = "FirebaseCrashlytics"
            java.lang.String r1 = "Could not create hashing algorithm: SHA-1, returning empty string."
            android.util.Log.e(r0, r1, r2)
            java.lang.String r2 = ""
        L20:
            return r2
    }

    /* renamed from: n */
    public static java.lang.String m3870n(java.io.InputStream r1) {
            java.util.Scanner r0 = new java.util.Scanner
            r0.<init>(r1)
            java.lang.String r1 = "\\A"
            java.util.Scanner r1 = r0.useDelimiter(r1)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L16
            java.lang.String r1 = r1.next()
            goto L18
        L16:
            java.lang.String r1 = ""
        L18:
            return r1
    }
}
