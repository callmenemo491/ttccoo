package p088f4;

/* renamed from: f4.x0 */
/* loaded from: classes.dex */
public interface InterfaceC2054x0 {

    /* renamed from: f4.x0$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: f4.x0$b */
    public static final class b implements p088f4.InterfaceC2014i {

        /* renamed from: Z */
        public static final p088f4.InterfaceC2054x0.b f9378Z = null;

        /* renamed from: Y */
        public final p371v5.C6561k f9379Y;

        /* renamed from: f4.x0$b$a */
        public static final class a {

            /* renamed from: a */
            public final p371v5.C6561k.b f9380a;

            public a() {
                    r1 = this;
                    r1.<init>()
                    v5.k$b r0 = new v5.k$b
                    r0.<init>()
                    r1.f9380a = r0
                    return
            }

            /* renamed from: a */
            public p088f4.InterfaceC2054x0.b.a m5419a(p088f4.InterfaceC2054x0.b r4) {
                    r3 = this;
                    v5.k$b r0 = r3.f9380a
                    v5.k r4 = r4.f9379Y
                    java.util.Objects.requireNonNull(r0)
                    r1 = 0
                L8:
                    int r2 = r4.m13347c()
                    if (r1 >= r2) goto L18
                    int r2 = r4.m13346b(r1)
                    r0.m13348a(r2)
                    int r1 = r1 + 1
                    goto L8
                L18:
                    return r3
            }

            /* renamed from: b */
            public p088f4.InterfaceC2054x0.b.a m5420b(int r3, boolean r4) {
                    r2 = this;
                    v5.k$b r0 = r2.f9380a
                    java.util.Objects.requireNonNull(r0)
                    if (r4 == 0) goto L13
                    boolean r4 = r0.f25657b
                    r1 = 1
                    r4 = r4 ^ r1
                    p371v5.C6549a.m13291e(r4)
                    android.util.SparseBooleanArray r4 = r0.f25656a
                    r4.append(r3, r1)
                L13:
                    return r2
            }

            /* renamed from: c */
            public p088f4.InterfaceC2054x0.b m5421c() {
                    r3 = this;
                    f4.x0$b r0 = new f4.x0$b
                    v5.k$b r1 = r3.f9380a
                    v5.k r1 = r1.m13349b()
                    r2 = 0
                    r0.<init>(r1, r2)
                    return r0
            }
        }

        static {
                v5.k$b r0 = new v5.k$b
                r0.<init>()
                f4.x0$b r1 = new f4.x0$b
                v5.k r0 = r0.m13349b()
                r2 = 0
                r1.<init>(r0, r2)
                p088f4.InterfaceC2054x0.b.f9378Z = r1
                return
        }

        public b(p371v5.C6561k r1, p088f4.InterfaceC2054x0.a r2) {
                r0 = this;
                r0.<init>()
                r0.f9379Y = r1
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                if (r1 != r2) goto L4
                r2 = 1
                return r2
            L4:
                boolean r0 = r2 instanceof p088f4.InterfaceC2054x0.b
                if (r0 != 0) goto La
                r2 = 0
                return r2
            La:
                f4.x0$b r2 = (p088f4.InterfaceC2054x0.b) r2
                v5.k r0 = r1.f9379Y
                v5.k r2 = r2.f9379Y
                boolean r2 = r0.equals(r2)
                return r2
        }

        public int hashCode() {
                r1 = this;
                v5.k r0 = r1.f9379Y
                int r0 = r0.hashCode()
                return r0
        }
    }

    @java.lang.Deprecated
    /* renamed from: f4.x0$c */
    public interface c {
        /* renamed from: N */
        void mo2887N(int r1);

        /* renamed from: O */
        void mo2888O(boolean r1, int r2);

        /* renamed from: Q */
        void mo2889Q(p088f4.InterfaceC2054x0.f r1, p088f4.InterfaceC2054x0.f r2, int r3);

        /* renamed from: R */
        void mo2890R(p088f4.InterfaceC2054x0 r1, p088f4.InterfaceC2054x0.d r2);

        /* renamed from: S */
        void mo2891S(p088f4.InterfaceC2054x0.b r1);

        /* renamed from: T */
        void mo2892T(p088f4.C2034o1 r1);

        @java.lang.Deprecated
        /* renamed from: U */
        void mo2893U(p108g5.C2273i0 r1, p325s5.C5970j r2);

        /* renamed from: X */
        void mo2894X(boolean r1);

        /* renamed from: Y */
        void mo2895Y(p088f4.C2048u0 r1);

        /* renamed from: a0 */
        void mo2898a0(p088f4.C2018j0 r1, int r2);

        @java.lang.Deprecated
        /* renamed from: b */
        void mo2899b();

        /* renamed from: f0 */
        void mo2904f0(p088f4.C2052w0 r1);

        /* renamed from: g */
        void mo2905g(int r1);

        @java.lang.Deprecated
        /* renamed from: h */
        void mo2906h(boolean r1, int r2);

        @java.lang.Deprecated
        /* renamed from: j */
        void mo2909j(boolean r1);

        /* renamed from: j0 */
        void mo2910j0(boolean r1);

        @java.lang.Deprecated
        /* renamed from: k */
        void mo2911k(int r1);

        /* renamed from: n */
        void mo2912n(p088f4.C2021k0 r1);

        /* renamed from: t */
        void mo2913t(p088f4.AbstractC2031n1 r1, int r2);

        /* renamed from: u */
        void mo2914u(int r1);

        /* renamed from: v */
        void mo2915v(boolean r1);

        /* renamed from: y */
        void mo2916y(p088f4.C2048u0 r1);
    }

    /* renamed from: f4.x0$d */
    public static final class d {

        /* renamed from: a */
        public final p371v5.C6561k f9381a;

        public d(p371v5.C6561k r1) {
                r0 = this;
                r0.<init>()
                r0.f9381a = r1
                return
        }

        /* renamed from: a */
        public boolean m5422a(int... r6) {
                r5 = this;
                v5.k r0 = r5.f9381a
                java.util.Objects.requireNonNull(r0)
                int r1 = r6.length
                r2 = 0
                r3 = 0
            L8:
                if (r3 >= r1) goto L17
                r4 = r6[r3]
                boolean r4 = r0.m13345a(r4)
                if (r4 == 0) goto L14
                r2 = 1
                goto L17
            L14:
                int r3 = r3 + 1
                goto L8
            L17:
                return r2
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                if (r1 != r2) goto L4
                r2 = 1
                return r2
            L4:
                boolean r0 = r2 instanceof p088f4.InterfaceC2054x0.d
                if (r0 != 0) goto La
                r2 = 0
                return r2
            La:
                f4.x0$d r2 = (p088f4.InterfaceC2054x0.d) r2
                v5.k r0 = r1.f9381a
                v5.k r2 = r2.f9381a
                boolean r2 = r0.equals(r2)
                return r2
        }

        public int hashCode() {
                r1 = this;
                v5.k r0 = r1.f9381a
                int r0 = r0.hashCode()
                return r0
        }
    }

    /* renamed from: f4.x0$e */
    public interface e extends p088f4.InterfaceC2054x0.c {
        /* renamed from: F */
        void mo2885F(p121h4.C2461d r1);

        /* renamed from: M */
        void mo2886M(p088f4.C2032o r1);

        /* renamed from: Z */
        void mo2896Z(int r1, int r2);

        /* renamed from: a */
        void mo2897a();

        /* renamed from: c */
        void mo2900c(boolean r1);

        /* renamed from: d */
        void mo2901d(java.util.List<p143i5.C3077a> r1);

        /* renamed from: e */
        void mo2902e(p387w5.C6813p r1);

        /* renamed from: f */
        void mo2903f(p427y4.C7110a r1);

        /* renamed from: i0 */
        void mo2908i0(int r1, boolean r2);
    }

    /* renamed from: f4.x0$f */
    public static final class f implements p088f4.InterfaceC2014i {

        /* renamed from: Y */
        public final java.lang.Object f9382Y;

        /* renamed from: Z */
        public final int f9383Z;

        /* renamed from: a0 */
        public final p088f4.C2018j0 f9384a0;

        /* renamed from: b0 */
        public final java.lang.Object f9385b0;

        /* renamed from: c0 */
        public final int f9386c0;

        /* renamed from: d0 */
        public final long f9387d0;

        /* renamed from: e0 */
        public final long f9388e0;

        /* renamed from: f0 */
        public final int f9389f0;

        /* renamed from: g0 */
        public final int f9390g0;

        static {
                k1.d r0 = p179k1.C3646d.f16118g0
                return
        }

        public f(java.lang.Object r1, int r2, p088f4.C2018j0 r3, java.lang.Object r4, int r5, long r6, long r8, int r10, int r11) {
                r0 = this;
                r0.<init>()
                r0.f9382Y = r1
                r0.f9383Z = r2
                r0.f9384a0 = r3
                r0.f9385b0 = r4
                r0.f9386c0 = r5
                r0.f9387d0 = r6
                r0.f9388e0 = r8
                r0.f9389f0 = r10
                r0.f9390g0 = r11
                return
        }

        /* renamed from: a */
        public static java.lang.String m5423a(int r1) {
                r0 = 36
                java.lang.String r1 = java.lang.Integer.toString(r1, r0)
                return r1
        }

        public boolean equals(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                r1 = 0
                if (r8 == 0) goto L5b
                java.lang.Class<f4.x0$f> r2 = p088f4.InterfaceC2054x0.f.class
                java.lang.Class r3 = r8.getClass()
                if (r2 == r3) goto L10
                goto L5b
            L10:
                f4.x0$f r8 = (p088f4.InterfaceC2054x0.f) r8
                int r2 = r7.f9383Z
                int r3 = r8.f9383Z
                if (r2 != r3) goto L59
                int r2 = r7.f9386c0
                int r3 = r8.f9386c0
                if (r2 != r3) goto L59
                long r2 = r7.f9387d0
                long r4 = r8.f9387d0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L59
                long r2 = r7.f9388e0
                long r4 = r8.f9388e0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L59
                int r2 = r7.f9389f0
                int r3 = r8.f9389f0
                if (r2 != r3) goto L59
                int r2 = r7.f9390g0
                int r3 = r8.f9390g0
                if (r2 != r3) goto L59
                java.lang.Object r2 = r7.f9382Y
                java.lang.Object r3 = r8.f9382Y
                boolean r2 = p185k7.C3836i.m8619d(r2, r3)
                if (r2 == 0) goto L59
                java.lang.Object r2 = r7.f9385b0
                java.lang.Object r3 = r8.f9385b0
                boolean r2 = p185k7.C3836i.m8619d(r2, r3)
                if (r2 == 0) goto L59
                f4.j0 r2 = r7.f9384a0
                f4.j0 r8 = r8.f9384a0
                boolean r8 = p185k7.C3836i.m8619d(r2, r8)
                if (r8 == 0) goto L59
                goto L5a
            L59:
                r0 = 0
            L5a:
                return r0
            L5b:
                return r1
        }

        public int hashCode() {
                r3 = this;
                r0 = 9
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Object r1 = r3.f9382Y
                r2 = 0
                r0[r2] = r1
                int r1 = r3.f9383Z
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 1
                r0[r2] = r1
                f4.j0 r1 = r3.f9384a0
                r2 = 2
                r0[r2] = r1
                java.lang.Object r1 = r3.f9385b0
                r2 = 3
                r0[r2] = r1
                int r1 = r3.f9386c0
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 4
                r0[r2] = r1
                long r1 = r3.f9387d0
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 5
                r0[r2] = r1
                long r1 = r3.f9388e0
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 6
                r0[r2] = r1
                int r1 = r3.f9389f0
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 7
                r0[r2] = r1
                int r1 = r3.f9390g0
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 8
                r0[r2] = r1
                int r0 = java.util.Arrays.hashCode(r0)
                return r0
        }
    }

    /* renamed from: A */
    int mo2821A();

    /* renamed from: B */
    boolean mo5215B();

    /* renamed from: C */
    int mo2822C();

    /* renamed from: D */
    void mo5216D();

    /* renamed from: E */
    int mo2823E();

    /* renamed from: F */
    int mo2824F();

    /* renamed from: G */
    boolean mo5217G(int r1);

    /* renamed from: H */
    void mo2825H(p088f4.InterfaceC2054x0.e r1);

    /* renamed from: I */
    int mo2826I();

    /* renamed from: J */
    boolean mo5218J();

    /* renamed from: K */
    int mo2827K();

    /* renamed from: L */
    long mo2828L();

    /* renamed from: M */
    p088f4.AbstractC2031n1 mo2829M();

    /* renamed from: N */
    android.os.Looper mo2830N();

    /* renamed from: O */
    boolean mo2831O();

    /* renamed from: P */
    void mo2832P(int r1, int r2);

    /* renamed from: Q */
    void mo2833Q(p088f4.InterfaceC2054x0.e r1);

    @java.lang.Deprecated
    /* renamed from: R */
    int mo5219R();

    /* renamed from: S */
    void mo5220S();

    /* renamed from: T */
    void mo5221T();

    /* renamed from: U */
    void mo5222U();

    /* renamed from: V */
    void mo5223V();

    /* renamed from: W */
    long mo2834W();

    /* renamed from: X */
    long mo2835X();

    /* renamed from: c */
    void mo2836c(p088f4.C2052w0 r1);

    /* renamed from: e */
    p088f4.C2052w0 mo2837e();

    /* renamed from: f */
    p088f4.C2048u0 mo2838f();

    /* renamed from: g */
    void mo2839g(boolean r1);

    /* renamed from: h */
    boolean mo2840h();

    /* renamed from: i */
    void mo5233i(int r1);

    /* renamed from: j */
    void mo5234j();

    /* renamed from: k */
    long mo2844k();

    /* renamed from: l */
    long mo2846l();

    /* renamed from: m */
    long mo2848m();

    /* renamed from: n */
    int mo2850n();

    /* renamed from: o */
    void mo2852o();

    /* renamed from: p */
    void mo5235p();

    /* renamed from: q */
    void mo2855q(int r1);

    /* renamed from: r */
    void mo2857r(int r1, long r2);

    void release();

    /* renamed from: s */
    p088f4.InterfaceC2054x0.b mo2859s();

    void stop();

    /* renamed from: t */
    long mo2861t();

    /* renamed from: u */
    boolean mo2862u();

    /* renamed from: v */
    void mo5236v();

    /* renamed from: w */
    p088f4.C2018j0 mo5237w();

    /* renamed from: x */
    void mo2863x(boolean r1);

    @java.lang.Deprecated
    /* renamed from: y */
    void mo2864y(boolean r1);

    /* renamed from: z */
    long mo2865z();
}
