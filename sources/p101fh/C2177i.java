package p101fh;

/* renamed from: fh.i */
/* loaded from: classes.dex */
public final class C2177i implements p101fh.InterfaceC2175g, java.io.Serializable {

    /* renamed from: Y */
    public static final p101fh.C2177i f9918Y = null;

    static {
            fh.i r0 = new fh.i
            r0.<init>()
            p101fh.C2177i.f9918Y = r0
            return
    }

    public C2177i() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p101fh.InterfaceC2175g
    public <R> R fold(R r2, mh.InterfaceC4624p<? super R, ? super p101fh.InterfaceC2175g.a, ? extends R> r3) {
            r1 = this;
            java.lang.String r0 = "operation"
            p214m2.C4339q.m9706k(r3, r0)
            return r2
    }

    @Override // p101fh.InterfaceC2175g
    public <E extends p101fh.InterfaceC2175g.a> E get(p101fh.InterfaceC2175g.b<E> r2) {
            r1 = this;
            java.lang.String r0 = "key"
            p214m2.C4339q.m9706k(r2, r0)
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p101fh.InterfaceC2175g
    public p101fh.InterfaceC2175g minusKey(p101fh.InterfaceC2175g.b<?> r2) {
            r1 = this;
            java.lang.String r0 = "key"
            p214m2.C4339q.m9706k(r2, r0)
            return r1
    }

    @Override // p101fh.InterfaceC2175g
    public p101fh.InterfaceC2175g plus(p101fh.InterfaceC2175g r2) {
            r1 = this;
            java.lang.String r0 = "context"
            p214m2.C4339q.m9706k(r2, r0)
            return r2
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "EmptyCoroutineContext"
            return r0
    }
}
