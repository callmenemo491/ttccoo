package p439yh;

/* renamed from: yh.d */
/* loaded from: classes.dex */
public final class C7207d implements p101fh.InterfaceC2175g.a {

    /* renamed from: Z */
    public static final p439yh.C7207d.a f27747Z = null;

    /* renamed from: Y */
    public final java.lang.Throwable f27748Y;

    /* renamed from: yh.d$a */
    public static final class a implements p101fh.InterfaceC2175g.b<p439yh.C7207d> {
        public a(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            yh.d$a r0 = new yh.d$a
            r1 = 0
            r0.<init>(r1)
            p439yh.C7207d.f27747Z = r0
            return
    }

    public C7207d(java.lang.Throwable r1) {
            r0 = this;
            r0.<init>()
            r0.f27748Y = r1
            return
    }

    @Override // p101fh.InterfaceC2175g
    public <R> R fold(R r1, mh.InterfaceC4624p<? super R, ? super p101fh.InterfaceC2175g.a, ? extends R> r2) {
            r0 = this;
            java.lang.Object r1 = p101fh.InterfaceC2175g.a.C7391a.m5737a(r0, r1, r2)
            return r1
    }

    @Override // p101fh.InterfaceC2175g.a, p101fh.InterfaceC2175g
    public <E extends p101fh.InterfaceC2175g.a> E get(p101fh.InterfaceC2175g.b<E> r1) {
            r0 = this;
            fh.g$a r1 = p101fh.InterfaceC2175g.a.C7391a.m5738b(r0, r1)
            return r1
    }

    @Override // p101fh.InterfaceC2175g.a
    public p101fh.InterfaceC2175g.b<?> getKey() {
            r1 = this;
            yh.d$a r0 = p439yh.C7207d.f27747Z
            return r0
    }

    @Override // p101fh.InterfaceC2175g
    public p101fh.InterfaceC2175g minusKey(p101fh.InterfaceC2175g.b<?> r1) {
            r0 = this;
            fh.g r1 = p101fh.InterfaceC2175g.a.C7391a.m5739c(r0, r1)
            return r1
    }

    @Override // p101fh.InterfaceC2175g
    public p101fh.InterfaceC2175g plus(p101fh.InterfaceC2175g r1) {
            r0 = this;
            fh.g r1 = p101fh.InterfaceC2175g.a.C7391a.m5740d(r0, r1)
            return r1
    }
}
