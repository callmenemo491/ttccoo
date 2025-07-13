package p101fh;

/* renamed from: fh.a */
/* loaded from: classes.dex */
public abstract class AbstractC2169a implements p101fh.InterfaceC2175g.a {
    private final p101fh.InterfaceC2175g.b<?> key;

    public AbstractC2169a(p101fh.InterfaceC2175g.b<?> r2) {
            r1 = this;
            java.lang.String r0 = "key"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.key = r2
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
            fh.g$b<?> r0 = r1.key
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
