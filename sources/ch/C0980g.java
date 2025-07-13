package ch;

/* renamed from: ch.g */
/* loaded from: classes.dex */
public final class C0980g<T> implements ch.InterfaceC0977d<T>, java.io.Serializable {

    /* renamed from: Y */
    public mh.InterfaceC4609a<? extends T> f5054Y;

    /* renamed from: Z */
    public volatile java.lang.Object f5055Z;

    /* renamed from: a0 */
    public final java.lang.Object f5056a0;

    public C0980g(mh.InterfaceC4609a r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f5054Y = r1
            ch.j r1 = ch.C0983j.f5060a
            r0.f5055Z = r1
            r0.f5056a0 = r0
            return
    }

    @Override // ch.InterfaceC0977d
    public T getValue() {
            r3 = this;
            java.lang.Object r0 = r3.f5055Z
            ch.j r1 = ch.C0983j.f5060a
            if (r0 == r1) goto L7
            return r0
        L7:
            java.lang.Object r0 = r3.f5056a0
            monitor-enter(r0)
            java.lang.Object r2 = r3.f5055Z     // Catch: java.lang.Throwable -> L1f
            if (r2 == r1) goto Lf
            goto L1d
        Lf:
            mh.a<? extends T> r1 = r3.f5054Y     // Catch: java.lang.Throwable -> L1f
            p214m2.C4339q.m9704i(r1)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r2 = r1.mo15e()     // Catch: java.lang.Throwable -> L1f
            r3.f5055Z = r2     // Catch: java.lang.Throwable -> L1f
            r1 = 0
            r3.f5054Y = r1     // Catch: java.lang.Throwable -> L1f
        L1d:
            monitor-exit(r0)
            return r2
        L1f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.Object r0 = r2.f5055Z
            ch.j r1 = ch.C0983j.f5060a
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L14
            java.lang.Object r0 = r2.getValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L16
        L14:
            java.lang.String r0 = "Lazy value not initialized yet."
        L16:
            return r0
    }
}
