package p185k7;

/* renamed from: k7.v4 */
/* loaded from: classes.dex */
public final class C4012v4<T> implements p185k7.InterfaceC3986t4<T> {

    /* renamed from: Y */
    public volatile p185k7.InterfaceC3986t4<T> f16902Y;

    /* renamed from: Z */
    public volatile boolean f16903Z;

    /* renamed from: a0 */
    public T f16904a0;

    public C4012v4(p185k7.InterfaceC3986t4<T> r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.f16902Y = r1
            return
    }

    @Override // p185k7.InterfaceC3986t4
    /* renamed from: a */
    public final T mo8217a() {
            r2 = this;
            boolean r0 = r2.f16903Z
            if (r0 != 0) goto L21
            monitor-enter(r2)
            boolean r0 = r2.f16903Z     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L1c
            k7.t4<T> r0 = r2.f16902Y     // Catch: java.lang.Throwable -> L1e
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r0 = r0.mo8217a()     // Catch: java.lang.Throwable -> L1e
            r2.f16904a0 = r0     // Catch: java.lang.Throwable -> L1e
            r1 = 1
            r2.f16903Z = r1     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            r2.f16902Y = r1     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            return r0
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            goto L21
        L1e:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1e
            throw r0
        L21:
            T r0 = r2.f16904a0
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            k7.t4<T> r0 = r4.f16902Y
            if (r0 != 0) goto L1d
            T r0 = r4.f16904a0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 25
            r2.<init>(r1)
            java.lang.String r1 = "<supplier that returned "
            java.lang.String r3 = ">"
            java.lang.String r0 = p083f.C1932s.m4774a(r2, r1, r0, r3)
        L1d:
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
