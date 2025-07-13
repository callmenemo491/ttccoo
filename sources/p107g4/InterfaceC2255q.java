package p107g4;

/* renamed from: g4.q */
/* loaded from: classes.dex */
public interface InterfaceC2255q {

    /* renamed from: g4.q$a */
    public static final class a {

        /* renamed from: a */
        public final long f10245a;

        /* renamed from: b */
        public final p088f4.AbstractC2031n1 f10246b;

        /* renamed from: c */
        public final int f10247c;

        /* renamed from: d */
        public final p108g5.InterfaceC2283r.a f10248d;

        /* renamed from: e */
        public final long f10249e;

        /* renamed from: f */
        public final p088f4.AbstractC2031n1 f10250f;

        /* renamed from: g */
        public final int f10251g;

        /* renamed from: h */
        public final p108g5.InterfaceC2283r.a f10252h;

        /* renamed from: i */
        public final long f10253i;

        /* renamed from: j */
        public final long f10254j;

        public a(long r1, p088f4.AbstractC2031n1 r3, int r4, p108g5.InterfaceC2283r.a r5, long r6, p088f4.AbstractC2031n1 r8, int r9, p108g5.InterfaceC2283r.a r10, long r11, long r13) {
                r0 = this;
                r0.<init>()
                r0.f10245a = r1
                r0.f10246b = r3
                r0.f10247c = r4
                r0.f10248d = r5
                r0.f10249e = r6
                r0.f10250f = r8
                r0.f10251g = r9
                r0.f10252h = r10
                r0.f10253i = r11
                r0.f10254j = r13
                return
        }

        public boolean equals(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                r1 = 0
                if (r8 == 0) goto L69
                java.lang.Class<g4.q$a> r2 = p107g4.InterfaceC2255q.a.class
                java.lang.Class r3 = r8.getClass()
                if (r2 == r3) goto L10
                goto L69
            L10:
                g4.q$a r8 = (p107g4.InterfaceC2255q.a) r8
                long r2 = r7.f10245a
                long r4 = r8.f10245a
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L67
                int r2 = r7.f10247c
                int r3 = r8.f10247c
                if (r2 != r3) goto L67
                long r2 = r7.f10249e
                long r4 = r8.f10249e
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L67
                int r2 = r7.f10251g
                int r3 = r8.f10251g
                if (r2 != r3) goto L67
                long r2 = r7.f10253i
                long r4 = r8.f10253i
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L67
                long r2 = r7.f10254j
                long r4 = r8.f10254j
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L67
                f4.n1 r2 = r7.f10246b
                f4.n1 r3 = r8.f10246b
                boolean r2 = p185k7.C3836i.m8619d(r2, r3)
                if (r2 == 0) goto L67
                g5.r$a r2 = r7.f10248d
                g5.r$a r3 = r8.f10248d
                boolean r2 = p185k7.C3836i.m8619d(r2, r3)
                if (r2 == 0) goto L67
                f4.n1 r2 = r7.f10250f
                f4.n1 r3 = r8.f10250f
                boolean r2 = p185k7.C3836i.m8619d(r2, r3)
                if (r2 == 0) goto L67
                g5.r$a r2 = r7.f10252h
                g5.r$a r8 = r8.f10252h
                boolean r8 = p185k7.C3836i.m8619d(r2, r8)
                if (r8 == 0) goto L67
                goto L68
            L67:
                r0 = 0
            L68:
                return r0
            L69:
                return r1
        }

        public int hashCode() {
                r3 = this;
                r0 = 10
                java.lang.Object[] r0 = new java.lang.Object[r0]
                long r1 = r3.f10245a
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                f4.n1 r1 = r3.f10246b
                r2 = 1
                r0[r2] = r1
                int r1 = r3.f10247c
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 2
                r0[r2] = r1
                g5.r$a r1 = r3.f10248d
                r2 = 3
                r0[r2] = r1
                long r1 = r3.f10249e
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 4
                r0[r2] = r1
                f4.n1 r1 = r3.f10250f
                r2 = 5
                r0[r2] = r1
                int r1 = r3.f10251g
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 6
                r0[r2] = r1
                g5.r$a r1 = r3.f10252h
                r2 = 7
                r0[r2] = r1
                long r1 = r3.f10253i
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 8
                r0[r2] = r1
                long r1 = r3.f10254j
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 9
                r0[r2] = r1
                int r0 = java.util.Arrays.hashCode(r0)
                return r0
        }
    }

    /* renamed from: A */
    void m5861A();

    /* renamed from: B */
    void m5862B();

    @java.lang.Deprecated
    /* renamed from: C */
    void m5863C();

    /* renamed from: D */
    void m5864D();

    @java.lang.Deprecated
    /* renamed from: E */
    void m5865E();

    /* renamed from: F */
    void m5866F();

    /* renamed from: G */
    void m5867G();

    @java.lang.Deprecated
    /* renamed from: H */
    void m5868H();

    /* renamed from: I */
    void m5869I();

    /* renamed from: J */
    void m5870J();

    /* renamed from: K */
    void m5871K();

    /* renamed from: L */
    void m5872L();

    /* renamed from: M */
    void m5873M();

    /* renamed from: N */
    void m5874N();

    /* renamed from: O */
    void m5875O();

    /* renamed from: P */
    void m5876P();

    /* renamed from: Q */
    void m5877Q();

    /* renamed from: R */
    void m5878R();

    /* renamed from: S */
    void m5879S();

    @java.lang.Deprecated
    /* renamed from: T */
    void m5880T();

    /* renamed from: U */
    void m5881U();

    /* renamed from: V */
    void m5882V();

    @java.lang.Deprecated
    /* renamed from: W */
    void m5883W();

    /* renamed from: X */
    void m5884X();

    /* renamed from: Y */
    void m5885Y();

    /* renamed from: Z */
    void m5886Z();

    /* renamed from: a */
    void m5887a();

    @java.lang.Deprecated
    /* renamed from: a0 */
    void m5888a0();

    @java.lang.Deprecated
    /* renamed from: b */
    void m5889b();

    /* renamed from: b0 */
    void m5890b0();

    /* renamed from: c */
    void m5891c();

    /* renamed from: c0 */
    void m5892c0();

    /* renamed from: d */
    void m5893d();

    @java.lang.Deprecated
    /* renamed from: d0 */
    void m5894d0();

    /* renamed from: e */
    void m5895e();

    @java.lang.Deprecated
    /* renamed from: e0 */
    void m5896e0();

    /* renamed from: f */
    void m5897f();

    @java.lang.Deprecated
    /* renamed from: f0 */
    void m5898f0();

    /* renamed from: g */
    void m5899g();

    /* renamed from: g0 */
    void m5900g0();

    /* renamed from: h */
    void m5901h();

    /* renamed from: h0 */
    void m5902h0();

    /* renamed from: i */
    void m5903i();

    /* renamed from: i0 */
    void m5904i0();

    @java.lang.Deprecated
    /* renamed from: j */
    void m5905j();

    @java.lang.Deprecated
    /* renamed from: j0 */
    void m5906j0();

    /* renamed from: k */
    void m5907k();

    /* renamed from: k0 */
    void m5908k0();

    @java.lang.Deprecated
    /* renamed from: l */
    void m5909l();

    /* renamed from: l0 */
    void m5910l0();

    /* renamed from: m */
    void m5911m();

    /* renamed from: m0 */
    void m5912m0();

    /* renamed from: n */
    void m5913n();

    @java.lang.Deprecated
    /* renamed from: n0 */
    void m5914n0();

    /* renamed from: o */
    void m5915o();

    @java.lang.Deprecated
    /* renamed from: o0 */
    void m5916o0();

    /* renamed from: p */
    void m5917p();

    @java.lang.Deprecated
    /* renamed from: p0 */
    void m5918p0();

    /* renamed from: q */
    void m5919q();

    /* renamed from: r */
    void m5920r();

    /* renamed from: s */
    void m5921s();

    /* renamed from: t */
    void m5922t();

    /* renamed from: u */
    void m5923u();

    /* renamed from: v */
    void m5924v();

    /* renamed from: w */
    void m5925w();

    /* renamed from: x */
    void m5926x();

    /* renamed from: y */
    void m5927y();

    /* renamed from: z */
    void m5928z();
}
