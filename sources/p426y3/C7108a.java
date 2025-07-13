package p426y3;

/* renamed from: y3.a */
/* loaded from: classes.dex */
public final class C7108a<T> implements bh.InterfaceC0769a<T> {

    /* renamed from: a0 */
    public static final java.lang.Object f27502a0 = null;

    /* renamed from: Y */
    public volatile bh.InterfaceC0769a<T> f27503Y;

    /* renamed from: Z */
    public volatile java.lang.Object f27504Z;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p426y3.C7108a.f27502a0 = r0
            return
    }

    public C7108a(bh.InterfaceC0769a<T> r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = p426y3.C7108a.f27502a0
            r1.f27504Z = r0
            r1.f27503Y = r2
            return
    }

    /* renamed from: a */
    public static java.lang.Object m14219a(java.lang.Object r3, java.lang.Object r4) {
            java.lang.Object r0 = p426y3.C7108a.f27502a0
            if (r3 == r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto L30
            if (r3 != r4) goto Lc
            goto L30
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Scoped provider was invoked recursively returning different results: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " & "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ". This is likely due to a circular dependency."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L30:
            return r4
    }

    @Override // bh.InterfaceC0769a
    public T get() {
            r2 = this;
            java.lang.Object r0 = r2.f27504Z
            java.lang.Object r1 = p426y3.C7108a.f27502a0
            if (r0 != r1) goto L20
            monitor-enter(r2)
            java.lang.Object r0 = r2.f27504Z     // Catch: java.lang.Throwable -> L1d
            if (r0 != r1) goto L1b
            bh.a<T> r0 = r2.f27503Y     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r1 = r2.f27504Z     // Catch: java.lang.Throwable -> L1d
            m14219a(r1, r0)     // Catch: java.lang.Throwable -> L1d
            r2.f27504Z = r0     // Catch: java.lang.Throwable -> L1d
            r1 = 0
            r2.f27503Y = r1     // Catch: java.lang.Throwable -> L1d
        L1b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            goto L20
        L1d:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r0
        L20:
            return r0
    }
}
