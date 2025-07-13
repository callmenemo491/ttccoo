package p108g5;

/* renamed from: g5.m */
/* loaded from: classes.dex */
public final class C2278m extends p108g5.AbstractC2262d<java.lang.Void> {

    /* renamed from: j */
    public final p108g5.InterfaceC2283r f10395j;

    /* renamed from: k */
    public final boolean f10396k;

    /* renamed from: l */
    public final p088f4.AbstractC2031n1.d f10397l;

    /* renamed from: m */
    public final p088f4.AbstractC2031n1.b f10398m;

    /* renamed from: n */
    public p108g5.C2278m.a f10399n;

    /* renamed from: o */
    public p108g5.C2277l f10400o;

    /* renamed from: p */
    public boolean f10401p;

    /* renamed from: q */
    public boolean f10402q;

    /* renamed from: r */
    public boolean f10403r;

    /* renamed from: g5.m$a */
    public static final class a extends p108g5.AbstractC2272i {

        /* renamed from: c0 */
        public static final java.lang.Object f10404c0 = null;

        /* renamed from: a0 */
        public final java.lang.Object f10405a0;

        /* renamed from: b0 */
        public final java.lang.Object f10406b0;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                p108g5.C2278m.a.f10404c0 = r0
                return
        }

        public a(p088f4.AbstractC2031n1 r1, java.lang.Object r2, java.lang.Object r3) {
                r0 = this;
                r0.<init>(r1)
                r0.f10405a0 = r2
                r0.f10406b0 = r3
                return
        }

        @Override // p108g5.AbstractC2272i, p088f4.AbstractC2031n1
        /* renamed from: c */
        public int mo5086c(java.lang.Object r3) {
                r2 = this;
                f4.n1 r0 = r2.f10375Z
                java.lang.Object r1 = p108g5.C2278m.a.f10404c0
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto Lf
                java.lang.Object r1 = r2.f10406b0
                if (r1 == 0) goto Lf
                r3 = r1
            Lf:
                int r3 = r0.mo5086c(r3)
                return r3
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: h */
        public p088f4.AbstractC2031n1.b mo5089h(int r2, p088f4.AbstractC2031n1.b r3, boolean r4) {
                r1 = this;
                f4.n1 r0 = r1.f10375Z
                r0.mo5089h(r2, r3, r4)
                java.lang.Object r2 = r3.f9226Z
                java.lang.Object r0 = r1.f10406b0
                boolean r2 = p371v5.C6552b0.m13308a(r2, r0)
                if (r2 == 0) goto L15
                if (r4 == 0) goto L15
                java.lang.Object r2 = p108g5.C2278m.a.f10404c0
                r3.f9226Z = r2
            L15:
                return r3
        }

        @Override // p108g5.AbstractC2272i, p088f4.AbstractC2031n1
        /* renamed from: n */
        public java.lang.Object mo5092n(int r2) {
                r1 = this;
                f4.n1 r0 = r1.f10375Z
                java.lang.Object r2 = r0.mo5092n(r2)
                java.lang.Object r0 = r1.f10406b0
                boolean r0 = p371v5.C6552b0.m13308a(r2, r0)
                if (r0 == 0) goto L10
                java.lang.Object r2 = p108g5.C2278m.a.f10404c0
            L10:
                return r2
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: p */
        public p088f4.AbstractC2031n1.d mo5093p(int r2, p088f4.AbstractC2031n1.d r3, long r4) {
                r1 = this;
                f4.n1 r0 = r1.f10375Z
                r0.mo5093p(r2, r3, r4)
                java.lang.Object r2 = r3.f9240Y
                java.lang.Object r4 = r1.f10405a0
                boolean r2 = p371v5.C6552b0.m13308a(r2, r4)
                if (r2 == 0) goto L13
                java.lang.Object r2 = p088f4.AbstractC2031n1.d.f9236p0
                r3.f9240Y = r2
            L13:
                return r3
        }
    }

    /* renamed from: g5.m$b */
    public static final class b extends p088f4.AbstractC2031n1 {

        /* renamed from: Z */
        public final p088f4.C2018j0 f10407Z;

        public b(p088f4.C2018j0 r1) {
                r0 = this;
                r0.<init>()
                r0.f10407Z = r1
                return
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: c */
        public int mo5086c(java.lang.Object r2) {
                r1 = this;
                java.lang.Object r0 = p108g5.C2278m.a.f10404c0
                if (r2 != r0) goto L6
                r2 = 0
                goto L7
            L6:
                r2 = -1
            L7:
                return r2
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: h */
        public p088f4.AbstractC2031n1.b mo5089h(int r12, p088f4.AbstractC2031n1.b r13, boolean r14) {
                r11 = this;
                r12 = 0
                if (r14 == 0) goto La
                r0 = 0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2 = r0
                goto Lb
            La:
                r2 = r12
            Lb:
                if (r14 == 0) goto Lf
                java.lang.Object r12 = p108g5.C2278m.a.f10404c0
            Lf:
                r3 = r12
                r4 = 0
                r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r7 = 0
                h5.a r9 = p122h5.C2486a.f11231e0
                r10 = 1
                r1 = r13
                r1.m5351g(r2, r3, r4, r5, r7, r9, r10)
                return r13
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: j */
        public int mo5179j() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: n */
        public java.lang.Object mo5092n(int r1) {
                r0 = this;
                java.lang.Object r1 = p108g5.C2278m.a.f10404c0
                return r1
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: p */
        public p088f4.AbstractC2031n1.d mo5093p(int r22, p088f4.AbstractC2031n1.d r23, long r24) {
                r21 = this;
                r15 = r23
                r0 = r23
                java.lang.Object r1 = p088f4.AbstractC2031n1.d.f9236p0
                r13 = r21
                f4.j0 r2 = r13.f10407Z
                r3 = 0
                r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r10 = 0
                r11 = 1
                r12 = 0
                r16 = 0
                r13 = r16
                r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r15 = r16
                r17 = 0
                r18 = 0
                r19 = 0
                r0.m5356e(r1, r2, r3, r4, r6, r8, r10, r11, r12, r13, r15, r17, r18, r19)
                r0 = 1
                r1 = r23
                r1.f9251j0 = r0
                return r1
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: q */
        public int mo5180q() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    public C2278m(p108g5.InterfaceC2283r r3, boolean r4) {
            r2 = this;
            r2.<init>()
            r2.f10395j = r3
            r0 = 1
            if (r4 == 0) goto L10
            boolean r4 = r3.mo5930e()
            if (r4 == 0) goto L10
            r4 = 1
            goto L11
        L10:
            r4 = 0
        L11:
            r2.f10396k = r4
            f4.n1$d r4 = new f4.n1$d
            r4.<init>()
            r2.f10397l = r4
            f4.n1$b r4 = new f4.n1$b
            r4.<init>()
            r2.f10398m = r4
            f4.n1 r4 = r3.mo5931f()
            if (r4 == 0) goto L32
            g5.m$a r3 = new g5.m$a
            r1 = 0
            r3.<init>(r4, r1, r1)
            r2.f10399n = r3
            r2.f10403r = r0
            goto L46
        L32:
            f4.j0 r3 = r3.mo6009a()
            g5.m$a r4 = new g5.m$a
            g5.m$b r0 = new g5.m$b
            r0.<init>(r3)
            java.lang.Object r3 = p088f4.AbstractC2031n1.d.f9236p0
            java.lang.Object r1 = p108g5.C2278m.a.f10404c0
            r4.<init>(r0, r3, r1)
            r2.f10399n = r4
        L46:
            return
    }

    @Override // p108g5.InterfaceC2283r
    /* renamed from: a */
    public p088f4.C2018j0 mo6009a() {
            r1 = this;
            g5.r r0 = r1.f10395j
            f4.j0 r0 = r0.mo6009a()
            return r0
    }

    @Override // p108g5.InterfaceC2283r
    /* renamed from: c */
    public /* bridge */ /* synthetic */ p108g5.InterfaceC2280o mo6010c(p108g5.InterfaceC2283r.a r1, p352u5.C6324m r2, long r3) {
            r0 = this;
            g5.l r1 = r0.m6026x(r1, r2, r3)
            return r1
    }

    @Override // p108g5.AbstractC2262d, p108g5.InterfaceC2283r
    /* renamed from: d */
    public void mo5989d() {
            r0 = this;
            return
    }

    @Override // p108g5.InterfaceC2283r
    /* renamed from: n */
    public void mo6011n(p108g5.InterfaceC2280o r3) {
            r2 = this;
            r0 = r3
            g5.l r0 = (p108g5.C2277l) r0
            g5.o r1 = r0.f10392c0
            if (r1 == 0) goto L11
            g5.r r1 = r0.f10391b0
            java.util.Objects.requireNonNull(r1)
            g5.o r0 = r0.f10392c0
            r1.mo6011n(r0)
        L11:
            g5.l r0 = r2.f10400o
            if (r3 != r0) goto L18
            r3 = 0
            r2.f10400o = r3
        L18:
            return
    }

    @Override // p108g5.AbstractC2256a
    /* renamed from: q */
    public void mo5941q(p352u5.InterfaceC6317g0 r2) {
            r1 = this;
            r1.f10320i = r2
            android.os.Handler r2 = p371v5.C6552b0.m13317j()
            r1.f10319h = r2
            boolean r2 = r1.f10396k
            if (r2 != 0) goto L15
            r2 = 1
            r1.f10401p = r2
            r2 = 0
            g5.r r0 = r1.f10395j
            r1.m5993w(r2, r0)
        L15:
            return
    }

    @Override // p108g5.AbstractC2262d, p108g5.AbstractC2256a
    /* renamed from: s */
    public void mo5943s() {
            r1 = this;
            r0 = 0
            r1.f10402q = r0
            r1.f10401p = r0
            super.mo5943s()
            return
    }

    @Override // p108g5.AbstractC2262d
    /* renamed from: t */
    public p108g5.InterfaceC2283r.a mo5990t(java.lang.Void r2, p108g5.InterfaceC2283r.a r3) {
            r1 = this;
            java.lang.Void r2 = (java.lang.Void) r2
            java.lang.Object r2 = r3.f10415a
            g5.m$a r0 = r1.f10399n
            java.lang.Object r0 = r0.f10406b0
            if (r0 == 0) goto L12
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L12
            java.lang.Object r2 = p108g5.C2278m.a.f10404c0
        L12:
            g5.r$a r2 = r3.m6031b(r2)
            return r2
    }

    @Override // p108g5.AbstractC2262d
    /* renamed from: v */
    public void mo5992v(java.lang.Void r10, p108g5.InterfaceC2283r r11, p088f4.AbstractC2031n1 r12) {
            r9 = this;
            r0 = r10
            java.lang.Void r0 = (java.lang.Void) r0
            boolean r0 = r9.f10402q
            if (r0 == 0) goto L1f
            g5.m$a r0 = r9.f10399n
            g5.m$a r1 = new g5.m$a
            java.lang.Object r2 = r0.f10405a0
            java.lang.Object r0 = r0.f10406b0
            r1.<init>(r12, r2, r0)
            r9.f10399n = r1
            g5.l r0 = r9.f10400o
            if (r0 == 0) goto Lc4
            long r0 = r0.f10394e0
            r9.m6027y(r0)
            goto Lc4
        L1f:
            boolean r0 = r12.m5344r()
            if (r0 == 0) goto L43
            boolean r0 = r9.f10403r
            if (r0 == 0) goto L35
            g5.m$a r0 = r9.f10399n
            g5.m$a r1 = new g5.m$a
            java.lang.Object r2 = r0.f10405a0
            java.lang.Object r0 = r0.f10406b0
            r1.<init>(r12, r2, r0)
            goto L3f
        L35:
            java.lang.Object r0 = p088f4.AbstractC2031n1.d.f9236p0
            java.lang.Object r1 = p108g5.C2278m.a.f10404c0
            g5.m$a r2 = new g5.m$a
            r2.<init>(r12, r0, r1)
            r1 = r2
        L3f:
            r9.f10399n = r1
            goto Lc4
        L43:
            f4.n1$d r0 = r9.f10397l
            r1 = 0
            r12.m5343o(r1, r0)
            f4.n1$d r0 = r9.f10397l
            long r2 = r0.f9252k0
            java.lang.Object r6 = r0.f9240Y
            g5.l r0 = r9.f10400o
            if (r0 == 0) goto L75
            long r4 = r0.f10389Z
            g5.m$a r7 = r9.f10399n
            g5.r$a r0 = r0.f10388Y
            java.lang.Object r0 = r0.f10415a
            f4.n1$b r8 = r9.f10398m
            r7.mo5090i(r0, r8)
            f4.n1$b r0 = r9.f10398m
            long r7 = r0.f9229c0
            long r7 = r7 + r4
            g5.m$a r0 = r9.f10399n
            f4.n1$d r4 = r9.f10397l
            f4.n1$d r0 = r0.m5343o(r1, r4)
            long r0 = r0.f9252k0
            int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r4 == 0) goto L75
            r4 = r7
            goto L76
        L75:
            r4 = r2
        L76:
            f4.n1$d r1 = r9.f10397l
            f4.n1$b r2 = r9.f10398m
            r3 = 0
            r0 = r12
            android.util.Pair r0 = r0.m5341k(r1, r2, r3, r4)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r9.f10403r
            if (r0 == 0) goto L9a
            g5.m$a r0 = r9.f10399n
            g5.m$a r1 = new g5.m$a
            java.lang.Object r4 = r0.f10405a0
            java.lang.Object r0 = r0.f10406b0
            r1.<init>(r12, r4, r0)
            goto La0
        L9a:
            g5.m$a r0 = new g5.m$a
            r0.<init>(r12, r6, r1)
            r1 = r0
        La0:
            r9.f10399n = r1
            g5.l r0 = r9.f10400o
            if (r0 == 0) goto Lc4
            r9.m6027y(r2)
            g5.r$a r0 = r0.f10388Y
            java.lang.Object r1 = r0.f10415a
            g5.m$a r2 = r9.f10399n
            java.lang.Object r2 = r2.f10406b0
            if (r2 == 0) goto Lbf
            java.lang.Object r2 = p108g5.C2278m.a.f10404c0
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Lbf
            g5.m$a r1 = r9.f10399n
            java.lang.Object r1 = r1.f10406b0
        Lbf:
            g5.r$a r0 = r0.m6031b(r1)
            goto Lc5
        Lc4:
            r0 = 0
        Lc5:
            r1 = 1
            r9.f10403r = r1
            r9.f10402q = r1
            g5.m$a r1 = r9.f10399n
            r9.m5942r(r1)
            if (r0 == 0) goto Ld9
            g5.l r1 = r9.f10400o
            java.util.Objects.requireNonNull(r1)
            r1.m6025d(r0)
        Ld9:
            return
    }

    /* renamed from: x */
    public p108g5.C2277l m6026x(p108g5.InterfaceC2283r.a r2, p352u5.C6324m r3, long r4) {
            r1 = this;
            g5.l r0 = new g5.l
            r0.<init>(r2, r3, r4)
            g5.r r3 = r1.f10395j
            g5.r r4 = r0.f10391b0
            r5 = 1
            if (r4 != 0) goto Le
            r4 = 1
            goto Lf
        Le:
            r4 = 0
        Lf:
            p371v5.C6549a.m13291e(r4)
            r0.f10391b0 = r3
            boolean r3 = r1.f10402q
            if (r3 == 0) goto L34
            java.lang.Object r3 = r2.f10415a
            g5.m$a r4 = r1.f10399n
            java.lang.Object r4 = r4.f10406b0
            if (r4 == 0) goto L2c
            java.lang.Object r4 = p108g5.C2278m.a.f10404c0
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L2c
            g5.m$a r3 = r1.f10399n
            java.lang.Object r3 = r3.f10406b0
        L2c:
            g5.r$a r2 = r2.m6031b(r3)
            r0.m6025d(r2)
            goto L42
        L34:
            r1.f10400o = r0
            boolean r2 = r1.f10401p
            if (r2 != 0) goto L42
            r1.f10401p = r5
            r2 = 0
            g5.r r3 = r1.f10395j
            r1.m5993w(r2, r3)
        L42:
            return r0
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    /* renamed from: y */
    public final void m6027y(long r7) {
            r6 = this;
            g5.l r0 = r6.f10400o
            g5.m$a r1 = r6.f10399n
            g5.r$a r2 = r0.f10388Y
            java.lang.Object r2 = r2.f10415a
            int r1 = r1.mo5086c(r2)
            r2 = -1
            if (r1 != r2) goto L10
            return
        L10:
            g5.m$a r2 = r6.f10399n
            f4.n1$b r3 = r6.f10398m
            f4.n1$b r1 = r2.m5340g(r1, r3)
            long r1 = r1.f9228b0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L30
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 < 0) goto L30
            r7 = 0
            r3 = 1
            long r1 = r1 - r3
            long r7 = java.lang.Math.max(r7, r1)
        L30:
            r0.f10394e0 = r7
            return
    }
}
