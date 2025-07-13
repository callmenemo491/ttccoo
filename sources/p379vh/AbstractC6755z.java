package p379vh;

/* renamed from: vh.z */
/* loaded from: classes.dex */
public abstract class AbstractC6755z extends p101fh.AbstractC2169a implements p101fh.InterfaceC2173e {

    /* renamed from: Y */
    public static final p379vh.AbstractC6755z.a f26051Y = null;

    /* renamed from: vh.z$a */
    public static final class a extends p101fh.AbstractC2170b<p101fh.InterfaceC2173e, p379vh.AbstractC6755z> {
        public a(p239nh.C4826f r2) {
                r1 = this;
                int r2 = p101fh.InterfaceC2173e.f9915a
                fh.e$a r2 = p101fh.InterfaceC2173e.a.f9916Y
                vh.y r0 = p379vh.C6753y.f26049Z
                r1.<init>(r2, r0)
                return
        }
    }

    static {
            vh.z$a r0 = new vh.z$a
            r1 = 0
            r0.<init>(r1)
            p379vh.AbstractC6755z.f26051Y = r0
            return
    }

    public AbstractC6755z() {
            r1 = this;
            fh.e$a r0 = p101fh.InterfaceC2173e.a.f9916Y
            r1.<init>(r0)
            return
    }

    @Override // p101fh.InterfaceC2173e
    /* renamed from: V */
    public final <T> p101fh.InterfaceC2172d<T> mo5708V(p101fh.InterfaceC2172d<? super T> r2) {
            r1 = this;
            zh.e r0 = new zh.e
            r0.<init>(r1, r2)
            return r0
    }

    @Override // p101fh.AbstractC2169a, p101fh.InterfaceC2175g.a, p101fh.InterfaceC2175g
    public <E extends p101fh.InterfaceC2175g.a> E get(p101fh.InterfaceC2175g.b<E> r4) {
            r3 = this;
            java.lang.String r0 = "key"
            p214m2.C4339q.m9706k(r4, r0)
            boolean r1 = r4 instanceof p101fh.AbstractC2170b
            r2 = 0
            if (r1 == 0) goto L32
            fh.b r4 = (p101fh.AbstractC2170b) r4
            fh.g$b r1 = r3.getKey()
            p214m2.C4339q.m9706k(r1, r0)
            if (r1 == r4) goto L1c
            fh.g$b<?> r0 = r4.f9911Z
            if (r0 != r1) goto L1a
            goto L1c
        L1a:
            r0 = 0
            goto L1d
        L1c:
            r0 = 1
        L1d:
            if (r0 == 0) goto L37
            java.lang.String r0 = "element"
            p214m2.C4339q.m9706k(r3, r0)
            mh.l<fh.g$a, E extends B> r4 = r4.f9910Y
            java.lang.Object r4 = r4.mo107b(r3)
            fh.g$a r4 = (p101fh.InterfaceC2175g.a) r4
            boolean r0 = r4 instanceof p101fh.InterfaceC2175g.a
            if (r0 == 0) goto L37
            r2 = r4
            goto L37
        L32:
            fh.e$a r0 = p101fh.InterfaceC2173e.a.f9916Y
            if (r0 != r4) goto L37
            r2 = r3
        L37:
            return r2
    }

    @Override // p101fh.InterfaceC2173e
    /* renamed from: i0 */
    public final void mo5709i0(p101fh.InterfaceC2172d<?> r1) {
            r0 = this;
            zh.e r1 = (p459zh.C7339e) r1
            r1.m14415o()
            return
    }

    @Override // p101fh.AbstractC2169a, p101fh.InterfaceC2175g
    public p101fh.InterfaceC2175g minusKey(p101fh.InterfaceC2175g.b<?> r3) {
            r2 = this;
            java.lang.String r0 = "key"
            p214m2.C4339q.m9706k(r3, r0)
            boolean r1 = r3 instanceof p101fh.AbstractC2170b
            if (r1 == 0) goto L32
            fh.b r3 = (p101fh.AbstractC2170b) r3
            fh.g$b r1 = r2.getKey()
            p214m2.C4339q.m9706k(r1, r0)
            if (r1 == r3) goto L1b
            fh.g$b<?> r0 = r3.f9911Z
            if (r0 != r1) goto L19
            goto L1b
        L19:
            r0 = 0
            goto L1c
        L1b:
            r0 = 1
        L1c:
            if (r0 == 0) goto L30
            java.lang.String r0 = "element"
            p214m2.C4339q.m9706k(r2, r0)
            mh.l<fh.g$a, E extends B> r3 = r3.f9910Y
            java.lang.Object r3 = r3.mo107b(r2)
            fh.g$a r3 = (p101fh.InterfaceC2175g.a) r3
            if (r3 == 0) goto L30
        L2d:
            fh.i r3 = p101fh.C2177i.f9918Y
            goto L37
        L30:
            r3 = r2
            goto L37
        L32:
            fh.e$a r0 = p101fh.InterfaceC2173e.a.f9916Y
            if (r0 != r3) goto L30
            goto L2d
        L37:
            return r3
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = gh.C2390b.m6121k(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* renamed from: x0 */
    public abstract void mo156x0(p101fh.InterfaceC2175g r1, java.lang.Runnable r2);

    /* renamed from: y0 */
    public boolean mo1433y0(p101fh.InterfaceC2175g r1) {
            r0 = this;
            boolean r0 = r0 instanceof p379vh.C6741t1
            r0 = r0 ^ 1
            return r0
    }
}
