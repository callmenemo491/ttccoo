package p020b3;

/* renamed from: b3.e */
/* loaded from: classes.dex */
public class C0663e {

    /* renamed from: a */
    public final java.util.List<p020b3.C0663e.a<?>> f3823a;

    /* renamed from: b3.e$a */
    public static final class a<T> {

        /* renamed from: a */
        public final java.lang.Class<T> f3824a;

        /* renamed from: b */
        public final p180k2.InterfaceC3675g<T> f3825b;

        public a(java.lang.Class<T> r1, p180k2.InterfaceC3675g<T> r2) {
                r0 = this;
                r0.<init>()
                r0.f3824a = r1
                r0.f3825b = r2
                return
        }
    }

    public C0663e() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3823a = r0
            return
    }

    /* renamed from: a */
    public synchronized <Z> p180k2.InterfaceC3675g<Z> m2215a(java.lang.Class<Z> r5) {
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            java.util.List<b3.e$a<?>> r1 = r4.f3823a     // Catch: java.lang.Throwable -> L24
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L24
        L8:
            if (r0 >= r1) goto L21
            java.util.List<b3.e$a<?>> r2 = r4.f3823a     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L24
            b3.e$a r2 = (p020b3.C0663e.a) r2     // Catch: java.lang.Throwable -> L24
            java.lang.Class<T> r3 = r2.f3824a     // Catch: java.lang.Throwable -> L24
            boolean r3 = r3.isAssignableFrom(r5)     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L1e
            k2.g<T> r5 = r2.f3825b     // Catch: java.lang.Throwable -> L24
            monitor-exit(r4)
            return r5
        L1e:
            int r0 = r0 + 1
            goto L8
        L21:
            r5 = 0
            monitor-exit(r4)
            return r5
        L24:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }
}
