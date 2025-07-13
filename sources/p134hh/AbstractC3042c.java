package p134hh;

/* renamed from: hh.c */
/* loaded from: classes.dex */
public abstract class AbstractC3042c extends p134hh.AbstractC3040a {

    /* renamed from: Z */
    public final p101fh.InterfaceC2175g f12244Z;

    /* renamed from: a0 */
    public transient p101fh.InterfaceC2172d<java.lang.Object> f12245a0;

    public AbstractC3042c(p101fh.InterfaceC2172d<java.lang.Object> r2) {
            r1 = this;
            if (r2 == 0) goto L7
            fh.g r0 = r2.mo5706c()
            goto L8
        L7:
            r0 = 0
        L8:
            r1.<init>(r2)
            r1.f12244Z = r0
            return
    }

    public AbstractC3042c(p101fh.InterfaceC2172d<java.lang.Object> r1, p101fh.InterfaceC2175g r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f12244Z = r2
            return
    }

    @Override // p101fh.InterfaceC2172d
    /* renamed from: c */
    public p101fh.InterfaceC2175g mo5706c() {
            r1 = this;
            fh.g r0 = r1.f12244Z
            p214m2.C4339q.m9704i(r0)
            return r0
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: s */
    public void mo7450s() {
            r3 = this;
            fh.d<java.lang.Object> r0 = r3.f12245a0
            if (r0 == 0) goto L1a
            if (r0 == r3) goto L1a
            fh.g r1 = r3.mo5706c()
            int r2 = p101fh.InterfaceC2173e.f9915a
            fh.e$a r2 = p101fh.InterfaceC2173e.a.f9916Y
            fh.g$a r1 = r1.get(r2)
            p214m2.C4339q.m9704i(r1)
            fh.e r1 = (p101fh.InterfaceC2173e) r1
            r1.mo5709i0(r0)
        L1a:
            hh.b r0 = p134hh.C3041b.f12243Y
            r3.f12245a0 = r0
            return
    }
}
