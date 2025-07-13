package androidx.lifecycle;

/* renamed from: androidx.lifecycle.s0 */
/* loaded from: classes.dex */
public class C0467s0 {

    /* renamed from: a */
    public final java.util.HashMap<java.lang.String, androidx.lifecycle.AbstractC0457n0> f2562a;

    public C0467s0() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f2562a = r0
            return
    }

    /* renamed from: a */
    public final void m1458a() {
            r6 = this;
            java.util.HashMap<java.lang.String, androidx.lifecycle.n0> r0 = r6.f2562a
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r0.next()
            androidx.lifecycle.n0 r1 = (androidx.lifecycle.AbstractC0457n0) r1
            r2 = 1
            r1.f2542b = r2
            java.util.Map<java.lang.String, java.lang.Object> r2 = r1.f2541a
            if (r2 == 0) goto L48
            monitor-enter(r2)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r1.f2541a     // Catch: java.lang.Throwable -> L45
            java.util.Collection r3 = r3.values()     // Catch: java.lang.Throwable -> L45
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L45
        L28:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L43
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L45
            boolean r5 = r4 instanceof java.io.Closeable     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto L28
            java.io.Closeable r4 = (java.io.Closeable) r4     // Catch: java.io.IOException -> L3c java.lang.Throwable -> L45
            r4.close()     // Catch: java.io.IOException -> L3c java.lang.Throwable -> L45
            goto L28
        L3c:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L45
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L45
            throw r1     // Catch: java.lang.Throwable -> L45
        L43:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L45
            goto L48
        L45:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L45
            throw r0
        L48:
            r1.mo8b()
            goto La
        L4c:
            java.util.HashMap<java.lang.String, androidx.lifecycle.n0> r0 = r6.f2562a
            r0.clear()
            return
    }
}
