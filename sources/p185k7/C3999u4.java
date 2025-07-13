package p185k7;

/* renamed from: k7.u4 */
/* loaded from: classes.dex */
public final class C3999u4<T> implements java.io.Serializable, p185k7.InterfaceC3986t4 {

    /* renamed from: Y */
    public final p185k7.InterfaceC3986t4<T> f16889Y;

    /* renamed from: Z */
    public volatile transient boolean f16890Z;

    /* renamed from: a0 */
    public transient T f16891a0;

    public C3999u4(p185k7.InterfaceC3986t4<T> r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.f16889Y = r1
            return
    }

    @Override // p185k7.InterfaceC3986t4
    /* renamed from: a */
    public final T mo8217a() {
            r2 = this;
            boolean r0 = r2.f16890Z
            if (r0 != 0) goto L1b
            monitor-enter(r2)
            boolean r0 = r2.f16890Z     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L16
            k7.t4<T> r0 = r2.f16889Y     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = r0.mo8217a()     // Catch: java.lang.Throwable -> L18
            r2.f16891a0 = r0     // Catch: java.lang.Throwable -> L18
            r1 = 1
            r2.f16890Z = r1     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            return r0
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            goto L1b
        L18:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r0
        L1b:
            T r0 = r2.f16891a0
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            boolean r0 = r4.f16890Z
            if (r0 == 0) goto L1e
            T r0 = r4.f16891a0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 25
            r2.<init>(r1)
            java.lang.String r1 = "<supplier that returned "
            java.lang.String r3 = ">"
            java.lang.String r0 = p083f.C1932s.m4774a(r2, r1, r0, r3)
            goto L20
        L1e:
            k7.t4<T> r0 = r4.f16889Y
        L20:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 19
            r2.<init>(r1)
            java.lang.String r1 = "Suppliers.memoize("
            java.lang.String r3 = ")"
            java.lang.String r0 = p083f.C1932s.m4774a(r2, r1, r0, r3)
            return r0
    }
}
