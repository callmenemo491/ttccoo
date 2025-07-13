package p082ek;

/* renamed from: ek.k */
/* loaded from: classes.dex */
public final class C1898k extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.lang.Throwable, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ p082ek.InterfaceC1884b f8182Z;

    public C1898k(p082ek.InterfaceC1884b r1) {
            r0 = this;
            r0.f8182Z = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4620l
    /* renamed from: b */
    public ch.C0985l mo107b(java.lang.Throwable r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            ek.b r1 = r0.f8182Z
            r1.cancel()
            ch.l r1 = ch.C0985l.f5061a
            return r1
    }
}
