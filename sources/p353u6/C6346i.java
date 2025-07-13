package p353u6;

/* renamed from: u6.i */
/* loaded from: classes.dex */
public class C6346i {

    /* renamed from: a */
    public static java.lang.String f24797a;

    /* renamed from: b */
    public static int f24798b;

    @androidx.annotation.RecentlyNullable
    /* renamed from: a */
    public static java.lang.String m12996a() {
            java.lang.String r0 = p353u6.C6346i.f24797a
            if (r0 != 0) goto L57
            int r0 = p353u6.C6346i.f24798b
            if (r0 != 0) goto Le
            int r0 = android.os.Process.myPid()
            p353u6.C6346i.f24798b = r0
        Le:
            int r0 = p353u6.C6346i.f24798b
            r1 = 0
            if (r0 > 0) goto L14
            goto L55
        L14:
            r2 = 25
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4f
            java.lang.String r2 = "/proc/"
            r3.append(r2)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4f
            r3.append(r0)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4f
            java.lang.String r0 = "/cmdline"
            r3.append(r0)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4f
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4f
            java.io.BufferedReader r0 = m12997b(r0)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4f
            java.lang.String r2 = r0.readLine()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L46
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r2, r3)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L46
            java.lang.String r1 = r2.trim()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L46
            r0.close()     // Catch: java.io.IOException -> L55
            goto L55
        L41:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L49
        L46:
            goto L50
        L48:
            r0 = move-exception
        L49:
            if (r1 == 0) goto L4e
            r1.close()     // Catch: java.io.IOException -> L4e
        L4e:
            throw r0
        L4f:
            r0 = r1
        L50:
            if (r0 == 0) goto L55
            r0.close()     // Catch: java.io.IOException -> L55
        L55:
            p353u6.C6346i.f24797a = r1
        L57:
            java.lang.String r0 = p353u6.C6346i.f24797a
            return r0
    }

    /* renamed from: b */
    public static java.io.BufferedReader m12997b(java.lang.String r3) {
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L12
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L12
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L12
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L12
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L12:
            r3 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r3
    }
}
