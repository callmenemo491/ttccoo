package p459zh;

/* renamed from: zh.o */
/* loaded from: classes.dex */
public class C7349o<T> extends p379vh.AbstractC6682a<T> implements p134hh.InterfaceC3043d {

    /* renamed from: a0 */
    public final p101fh.InterfaceC2172d<T> f28108a0;

    public C7349o(p101fh.InterfaceC2175g r2, p101fh.InterfaceC2172d<? super T> r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r0)
            r1.f28108a0 = r3
            return
    }

    @Override // p379vh.C6702g1
    /* renamed from: G */
    public final boolean mo13576G() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // p379vh.AbstractC6682a
    /* renamed from: Y */
    public void mo13543Y(java.lang.Object r2) {
            r1 = this;
            fh.d<T> r0 = r1.f28108a0
            java.lang.Object r2 = p209lh.C4304a.m9595A(r2, r0)
            r0.mo5707k(r2)
            return
    }

    @Override // p379vh.C6702g1
    /* renamed from: e */
    public void mo13589e(java.lang.Object r4) {
            r3 = this;
            fh.d<T> r0 = r3.f28108a0
            fh.d r0 = gh.C2390b.m6127q(r0)
            fh.d<T> r1 = r3.f28108a0
            java.lang.Object r4 = p209lh.C4304a.m9595A(r4, r1)
            r1 = 0
            r2 = 2
            p459zh.C7340f.m14418b(r0, r4, r1, r2)
            return
    }

    @Override // p134hh.InterfaceC3043d
    /* renamed from: j */
    public final p134hh.InterfaceC3043d mo5742j() {
            r2 = this;
            fh.d<T> r0 = r2.f28108a0
            boolean r1 = r0 instanceof p134hh.InterfaceC3043d
            if (r1 == 0) goto L9
            hh.d r0 = (p134hh.InterfaceC3043d) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }
}
