package p057db;

/* renamed from: db.e0 */
/* loaded from: classes.dex */
public final class C1396e0 {

    /* renamed from: d */
    public static java.lang.ref.WeakReference<p057db.C1396e0> f7020d;

    /* renamed from: a */
    public final android.content.SharedPreferences f7021a;

    /* renamed from: b */
    public p057db.C1390b0 f7022b;

    /* renamed from: c */
    public final java.util.concurrent.Executor f7023c;

    public C1396e0(android.content.SharedPreferences r1, java.util.concurrent.Executor r2) {
            r0 = this;
            r0.<init>()
            r0.f7023c = r2
            r0.f7021a = r1
            return
    }

    /* renamed from: a */
    public synchronized p057db.C1394d0 m3916a() {
            r4 = this;
            monitor-enter(r4)
            db.b0 r0 = r4.f7022b     // Catch: java.lang.Throwable -> L35
            java.util.ArrayDeque<java.lang.String> r1 = r0.f7005d     // Catch: java.lang.Throwable -> L35
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L35
            java.util.ArrayDeque<java.lang.String> r0 = r0.f7005d     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = r0.peek()     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L32
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            java.util.regex.Pattern r1 = p057db.C1394d0.f7015d     // Catch: java.lang.Throwable -> L35
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L35
            r2 = 0
            if (r1 == 0) goto L19
            goto L30
        L19:
            r1 = -1
            java.lang.String r3 = "!"
            java.lang.String[] r0 = r0.split(r3, r1)     // Catch: java.lang.Throwable -> L35
            int r1 = r0.length     // Catch: java.lang.Throwable -> L35
            r3 = 2
            if (r1 == r3) goto L25
            goto L30
        L25:
            db.d0 r2 = new db.d0     // Catch: java.lang.Throwable -> L35
            r1 = 0
            r1 = r0[r1]     // Catch: java.lang.Throwable -> L35
            r3 = 1
            r0 = r0[r3]     // Catch: java.lang.Throwable -> L35
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L35
        L30:
            monitor-exit(r4)
            return r2
        L32:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            throw r0     // Catch: java.lang.Throwable -> L35
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }
}
