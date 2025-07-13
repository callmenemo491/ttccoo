package androidx.lifecycle;

/* renamed from: androidx.lifecycle.n0 */
/* loaded from: classes.dex */
public abstract class AbstractC0457n0 {

    /* renamed from: a */
    public final java.util.Map<java.lang.String, java.lang.Object> f2541a;

    /* renamed from: b */
    public volatile boolean f2542b;

    public AbstractC0457n0() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f2541a = r0
            r0 = 0
            r1.f2542b = r0
            return
    }

    /* renamed from: a */
    public <T> T m1452a(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f2541a
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.f2541a     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r3
        Lf:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    /* renamed from: b */
    public void mo8b() {
            r0 = this;
            return
    }

    /* renamed from: c */
    public <T> T m1453c(java.lang.String r4, T r5) {
            r3 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.f2541a
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.f2541a     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto L10
            java.util.Map<java.lang.String, java.lang.Object> r2 = r3.f2541a     // Catch: java.lang.Throwable -> L2c
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> L2c
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto L14
            goto L15
        L14:
            r5 = r1
        L15:
            boolean r4 = r3.f2542b
            if (r4 == 0) goto L2b
            boolean r4 = r5 instanceof java.io.Closeable
            if (r4 == 0) goto L2b
            r4 = r5
            java.io.Closeable r4 = (java.io.Closeable) r4     // Catch: java.io.IOException -> L24
            r4.close()     // Catch: java.io.IOException -> L24
            goto L2b
        L24:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            throw r5
        L2b:
            return r5
        L2c:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r4
    }
}
