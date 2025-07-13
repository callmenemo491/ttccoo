package p108g5;

/* renamed from: g5.d */
/* loaded from: classes.dex */
public abstract class AbstractC2262d<T> extends p108g5.AbstractC2256a {

    /* renamed from: g */
    public final java.util.HashMap<T, p108g5.AbstractC2262d.b<T>> f10318g;

    /* renamed from: h */
    public android.os.Handler f10319h;

    /* renamed from: i */
    public p352u5.InterfaceC6317g0 f10320i;

    /* renamed from: g5.d$a */
    public final class a implements p108g5.InterfaceC2286u, p162j4.InterfaceC3403h {

        /* renamed from: Y */
        public final T f10321Y;

        /* renamed from: Z */
        public p108g5.InterfaceC2286u.a f10322Z;

        /* renamed from: a0 */
        public p162j4.InterfaceC3403h.a f10323a0;

        /* renamed from: b0 */
        public final /* synthetic */ p108g5.AbstractC2262d f10324b0;

        public a(p108g5.AbstractC2262d r6, T r7) {
                r5 = this;
                r5.f10324b0 = r6
                r5.<init>()
                g5.u$a r0 = r6.f10257c
                r1 = 0
                r2 = 0
                r3 = 0
                g5.u$a r0 = r0.m6038g(r1, r2, r3)
                r5.f10322Z = r0
                j4.h$a r6 = r6.f10258d
                j4.h$a r6 = r6.m7829g(r1, r2)
                r5.f10323a0 = r6
                r5.f10321Y = r7
                return
        }

        @Override // p108g5.InterfaceC2286u
        /* renamed from: D */
        public void mo5395D(int r1, p108g5.InterfaceC2283r.a r2, p108g5.C2276k r3, p108g5.C2279n r4) {
                r0 = this;
                boolean r1 = r0.m5994a(r1, r2)
                if (r1 == 0) goto Lf
                g5.u$a r1 = r0.f10322Z
                g5.n r2 = r0.m5995b(r4)
                r1.m6037f(r3, r2)
            Lf:
                return
        }

        @Override // p162j4.InterfaceC3403h
        /* renamed from: E */
        public void mo5396E(int r1, p108g5.InterfaceC2283r.a r2) {
                r0 = this;
                boolean r1 = r0.m5994a(r1, r2)
                if (r1 == 0) goto Lb
                j4.h$a r1 = r0.f10323a0
                r1.m7825c()
            Lb:
                return
        }

        @Override // p162j4.InterfaceC3403h
        /* renamed from: P */
        public void mo5397P(int r1, p108g5.InterfaceC2283r.a r2) {
                r0 = this;
                boolean r1 = r0.m5994a(r1, r2)
                if (r1 == 0) goto Lb
                j4.h$a r1 = r0.f10323a0
                r1.m7828f()
            Lb:
                return
        }

        /* renamed from: a */
        public final boolean m5994a(int r4, p108g5.InterfaceC2283r.a r5) {
                r3 = this;
                if (r5 == 0) goto Le
                g5.d r0 = r3.f10324b0
                T r1 = r3.f10321Y
                g5.r$a r5 = r0.mo5990t(r1, r5)
                if (r5 != 0) goto Lf
                r4 = 0
                return r4
            Le:
                r5 = 0
            Lf:
                g5.d r0 = r3.f10324b0
                T r1 = r3.f10321Y
                int r4 = r0.mo5991u(r1, r4)
                g5.u$a r0 = r3.f10322Z
                int r1 = r0.f10431a
                if (r1 != r4) goto L25
                g5.r$a r0 = r0.f10432b
                boolean r0 = p371v5.C6552b0.m13308a(r0, r5)
                if (r0 != 0) goto L31
            L25:
                g5.d r0 = r3.f10324b0
                r1 = 0
                g5.u$a r0 = r0.f10257c
                g5.u$a r0 = r0.m6038g(r4, r5, r1)
                r3.f10322Z = r0
            L31:
                j4.h$a r0 = r3.f10323a0
                int r1 = r0.f14743a
                if (r1 != r4) goto L3f
                g5.r$a r0 = r0.f14744b
                boolean r0 = p371v5.C6552b0.m13308a(r0, r5)
                if (r0 != 0) goto L4c
            L3f:
                g5.d r0 = r3.f10324b0
                j4.h$a r0 = r0.f10258d
                j4.h$a r1 = new j4.h$a
                java.util.concurrent.CopyOnWriteArrayList<j4.h$a$a> r0 = r0.f14745c
                r1.<init>(r0, r4, r5)
                r3.f10323a0 = r1
            L4c:
                r4 = 1
                return r4
        }

        /* renamed from: b */
        public final p108g5.C2279n m5995b(p108g5.C2279n r12) {
                r11 = this;
                g5.d r0 = r11.f10324b0
                long r7 = r12.f10413f
                java.util.Objects.requireNonNull(r0)
                g5.d r0 = r11.f10324b0
                long r9 = r12.f10414g
                java.util.Objects.requireNonNull(r0)
                long r0 = r12.f10413f
                int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r2 != 0) goto L1b
                long r0 = r12.f10414g
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 != 0) goto L1b
                return r12
            L1b:
                g5.n r0 = new g5.n
                int r2 = r12.f10408a
                int r3 = r12.f10409b
                f4.e0 r4 = r12.f10410c
                int r5 = r12.f10411d
                java.lang.Object r6 = r12.f10412e
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r9)
                return r0
        }

        @Override // p162j4.InterfaceC3403h
        /* renamed from: e0 */
        public void mo5399e0(int r1, p108g5.InterfaceC2283r.a r2) {
                r0 = this;
                boolean r1 = r0.m5994a(r1, r2)
                if (r1 == 0) goto Lb
                j4.h$a r1 = r0.f10323a0
                r1.m7823a()
            Lb:
                return
        }

        @Override // p162j4.InterfaceC3403h
        /* renamed from: g0 */
        public void mo5400g0(int r1, p108g5.InterfaceC2283r.a r2) {
                r0 = this;
                boolean r1 = r0.m5994a(r1, r2)
                if (r1 == 0) goto Lb
                j4.h$a r1 = r0.f10323a0
                r1.m7824b()
            Lb:
                return
        }

        @Override // p108g5.InterfaceC2286u
        /* renamed from: i */
        public void mo5401i(int r1, p108g5.InterfaceC2283r.a r2, p108g5.C2276k r3, p108g5.C2279n r4) {
                r0 = this;
                boolean r1 = r0.m5994a(r1, r2)
                if (r1 == 0) goto Lf
                g5.u$a r1 = r0.f10322Z
                g5.n r2 = r0.m5995b(r4)
                r1.m6034c(r3, r2)
            Lf:
                return
        }

        @Override // p162j4.InterfaceC3403h
        /* renamed from: o */
        public void mo5402o(int r1, p108g5.InterfaceC2283r.a r2, int r3) {
                r0 = this;
                boolean r1 = r0.m5994a(r1, r2)
                if (r1 == 0) goto Lb
                j4.h$a r1 = r0.f10323a0
                r1.m7826d(r3)
            Lb:
                return
        }

        @Override // p108g5.InterfaceC2286u
        /* renamed from: p */
        public void mo5403p(int r1, p108g5.InterfaceC2283r.a r2, p108g5.C2279n r3) {
                r0 = this;
                boolean r1 = r0.m5994a(r1, r2)
                if (r1 == 0) goto Lf
                g5.u$a r1 = r0.f10322Z
                g5.n r2 = r0.m5995b(r3)
                r1.m6033b(r2)
            Lf:
                return
        }

        @Override // p108g5.InterfaceC2286u
        /* renamed from: s */
        public void mo5404s(int r1, p108g5.InterfaceC2283r.a r2, p108g5.C2276k r3, p108g5.C2279n r4, java.io.IOException r5, boolean r6) {
                r0 = this;
                boolean r1 = r0.m5994a(r1, r2)
                if (r1 == 0) goto Lf
                g5.u$a r1 = r0.f10322Z
                g5.n r2 = r0.m5995b(r4)
                r1.m6036e(r3, r2, r5, r6)
            Lf:
                return
        }

        @Override // p108g5.InterfaceC2286u
        /* renamed from: w */
        public void mo5405w(int r1, p108g5.InterfaceC2283r.a r2, p108g5.C2276k r3, p108g5.C2279n r4) {
                r0 = this;
                boolean r1 = r0.m5994a(r1, r2)
                if (r1 == 0) goto Lf
                g5.u$a r1 = r0.f10322Z
                g5.n r2 = r0.m5995b(r4)
                r1.m6035d(r3, r2)
            Lf:
                return
        }

        @Override // p162j4.InterfaceC3403h
        /* renamed from: x */
        public void mo5406x(int r1, p108g5.InterfaceC2283r.a r2, java.lang.Exception r3) {
                r0 = this;
                boolean r1 = r0.m5994a(r1, r2)
                if (r1 == 0) goto Lb
                j4.h$a r1 = r0.f10323a0
                r1.m7827e(r3)
            Lb:
                return
        }
    }

    /* renamed from: g5.d$b */
    public static final class b<T> {

        /* renamed from: a */
        public final p108g5.InterfaceC2283r f10325a;

        /* renamed from: b */
        public final p108g5.InterfaceC2283r.b f10326b;

        /* renamed from: c */
        public final p108g5.AbstractC2262d<T>.a f10327c;

        public b(p108g5.InterfaceC2283r r1, p108g5.InterfaceC2283r.b r2, p108g5.AbstractC2262d<T>.a r3) {
                r0 = this;
                r0.<init>()
                r0.f10325a = r1
                r0.f10326b = r2
                r0.f10327c = r3
                return
        }
    }

    public AbstractC2262d() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f10318g = r0
            return
    }

    @Override // p108g5.InterfaceC2283r
    /* renamed from: d */
    public void mo5989d() {
            r2 = this;
            java.util.HashMap<T, g5.d$b<T>> r0 = r2.f10318g
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            g5.d$b r1 = (p108g5.AbstractC2262d.b) r1
            g5.r r1 = r1.f10325a
            r1.mo5989d()
            goto La
        L1c:
            return
    }

    @Override // p108g5.AbstractC2256a
    /* renamed from: o */
    public void mo5939o() {
            r3 = this;
            java.util.HashMap<T, g5.d$b<T>> r0 = r3.f10318g
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            g5.d$b r1 = (p108g5.AbstractC2262d.b) r1
            g5.r r2 = r1.f10325a
            g5.r$b r1 = r1.f10326b
            r2.mo5933h(r1)
            goto La
        L1e:
            return
    }

    @Override // p108g5.AbstractC2256a
    /* renamed from: p */
    public void mo5940p() {
            r3 = this;
            java.util.HashMap<T, g5.d$b<T>> r0 = r3.f10318g
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            g5.d$b r1 = (p108g5.AbstractC2262d.b) r1
            g5.r r2 = r1.f10325a
            g5.r$b r1 = r1.f10326b
            r2.mo5932g(r1)
            goto La
        L1e:
            return
    }

    @Override // p108g5.AbstractC2256a
    /* renamed from: s */
    public void mo5943s() {
            r4 = this;
            java.util.HashMap<T, g5.d$b<T>> r0 = r4.f10318g
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            g5.d$b r1 = (p108g5.AbstractC2262d.b) r1
            g5.r r2 = r1.f10325a
            g5.r$b r3 = r1.f10326b
            r2.mo5934i(r3)
            g5.r r2 = r1.f10325a
            g5.d<T>$a r3 = r1.f10327c
            r2.mo5937l(r3)
            g5.r r2 = r1.f10325a
            g5.d<T>$a r1 = r1.f10327c
            r2.mo5936k(r1)
            goto La
        L2c:
            java.util.HashMap<T, g5.d$b<T>> r0 = r4.f10318g
            r0.clear()
            return
    }

    /* renamed from: t */
    public abstract p108g5.InterfaceC2283r.a mo5990t(T r1, p108g5.InterfaceC2283r.a r2);

    /* renamed from: u */
    public int mo5991u(T r1, int r2) {
            r0 = this;
            return r2
    }

    /* renamed from: v */
    public abstract void mo5992v(T r1, p108g5.InterfaceC2283r r2, p088f4.AbstractC2031n1 r3);

    /* renamed from: w */
    public final void m5993w(T r5, p108g5.InterfaceC2283r r6) {
            r4 = this;
            java.util.HashMap<T, g5.d$b<T>> r0 = r4.f10318g
            boolean r0 = r0.containsKey(r5)
            r0 = r0 ^ 1
            p371v5.C6549a.m13288b(r0)
            g5.c r0 = new g5.c
            r0.<init>(r4, r5)
            g5.d$a r1 = new g5.d$a
            r1.<init>(r4, r5)
            java.util.HashMap<T, g5.d$b<T>> r2 = r4.f10318g
            g5.d$b r3 = new g5.d$b
            r3.<init>(r6, r0, r1)
            r2.put(r5, r3)
            android.os.Handler r5 = r4.f10319h
            java.util.Objects.requireNonNull(r5)
            r6.mo5938m(r5, r1)
            android.os.Handler r5 = r4.f10319h
            java.util.Objects.requireNonNull(r5)
            r6.mo5929b(r5, r1)
            u5.g0 r5 = r4.f10320i
            r6.mo5935j(r0, r5)
            java.util.HashSet<g5.r$b> r5 = r4.f10256b
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ 1
            if (r5 != 0) goto L41
            r6.mo5933h(r0)
        L41:
            return
    }
}
