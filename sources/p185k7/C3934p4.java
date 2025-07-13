package p185k7;

/* renamed from: k7.p4 */
/* loaded from: classes.dex */
public final class C3934p4 implements p185k7.InterfaceC3743b4 {

    /* renamed from: a */
    public static final java.util.Map<java.lang.String, p185k7.C3934p4> f16827a = null;

    static {
            s.a r0 = new s.a
            r0.<init>()
            p185k7.C3934p4.f16827a = r0
            return
    }

    /* renamed from: a */
    public static p185k7.C3934p4 m8877a(android.content.Context r1, java.lang.String r2) {
            boolean r1 = p185k7.C4011v3.m9072a()
            r2 = 0
            if (r1 != 0) goto L25
            java.lang.Class<k7.p4> r1 = p185k7.C3934p4.class
            monitor-enter(r1)
            java.util.Map<java.lang.String, k7.p4> r0 = p185k7.C3934p4.f16827a     // Catch: java.lang.Throwable -> L22
            s.h r0 = (p319s.C5941h) r0     // Catch: java.lang.Throwable -> L22
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L22
            k7.p4 r0 = (p185k7.C3934p4) r0     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L18
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            return r0
        L18:
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L22
            throw r2     // Catch: java.lang.Throwable -> L1d
        L1d:
            r2 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L22
            throw r2     // Catch: java.lang.Throwable -> L22
        L22:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            throw r2
        L25:
            throw r2
    }

    /* renamed from: b */
    public static synchronized void m8878b() {
            java.lang.Class<k7.p4> r0 = p185k7.C3934p4.class
            monitor-enter(r0)
            java.util.Map<java.lang.String, k7.p4> r1 = p185k7.C3934p4.f16827a     // Catch: java.lang.Throwable -> L28
            r2 = r1
            s.a r2 = (p319s.C5934a) r2     // Catch: java.lang.Throwable -> L28
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L28
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L28
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L28
            if (r3 != 0) goto L1d
            s.h r1 = (p319s.C5941h) r1     // Catch: java.lang.Throwable -> L28
            r1.clear()     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)
            return
        L1d:
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L28
            k7.p4 r1 = (p185k7.C3934p4) r1     // Catch: java.lang.Throwable -> L28
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> L28
            r1 = 0
            throw r1     // Catch: java.lang.Throwable -> L28
        L28:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // p185k7.InterfaceC3743b4
    /* renamed from: f */
    public final java.lang.Object mo8224f(java.lang.String r1) {
            r0 = this;
            r1 = 0
            throw r1
    }
}
