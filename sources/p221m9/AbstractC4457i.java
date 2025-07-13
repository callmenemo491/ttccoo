package p221m9;

/* renamed from: m9.i */
/* loaded from: classes.dex */
public abstract class AbstractC4457i {

    /* renamed from: a */
    public int f18147a;

    /* renamed from: b */
    public int f18148b;

    /* renamed from: c */
    public p221m9.C4460j f18149c;

    /* renamed from: m9.i$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: m9.i$b */
    public static final class b extends p221m9.AbstractC4457i {

        /* renamed from: d */
        public final byte[] f18150d;

        /* renamed from: e */
        public final boolean f18151e;

        /* renamed from: f */
        public int f18152f;

        /* renamed from: g */
        public int f18153g;

        /* renamed from: h */
        public int f18154h;

        /* renamed from: i */
        public int f18155i;

        /* renamed from: j */
        public int f18156j;

        /* renamed from: k */
        public int f18157k;

        public b(byte[] r1, int r2, int r3, boolean r4, p221m9.AbstractC4457i.a r5) {
                r0 = this;
                r5 = 0
                r0.<init>(r5)
                r5 = 2147483647(0x7fffffff, float:NaN)
                r0.f18157k = r5
                r0.f18150d = r1
                int r3 = r3 + r2
                r0.f18152f = r3
                r0.f18154h = r2
                r0.f18155i = r2
                r0.f18151e = r4
                return
        }

        @Override // p221m9.AbstractC4457i
        /* renamed from: A */
        public boolean mo10075A(int r6) {
                r5 = this;
                r0 = r6 & 7
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L3c
                if (r0 == r2) goto L39
                r3 = 2
                if (r0 == r3) goto L31
                r3 = 4
                r4 = 3
                if (r0 == r4) goto L1e
                if (r0 == r3) goto L1d
                r6 = 5
                if (r0 != r6) goto L18
                r5.m10106I(r3)
                return r2
            L18:
                m9.a0$a r6 = p221m9.C4434a0.m9898d()
                throw r6
            L1d:
                return r1
            L1e:
                int r0 = r5.mo10096x()
                if (r0 == 0) goto L2a
                boolean r0 = r5.mo10075A(r0)
                if (r0 != 0) goto L1e
            L2a:
                int r6 = r6 >>> r4
                int r6 = r6 << r4
                r6 = r6 | r3
                r5.mo10076a(r6)
                return r2
            L31:
                int r6 = r5.m10102E()
            L35:
                r5.m10106I(r6)
                return r2
            L39:
                r6 = 8
                goto L35
            L3c:
                int r6 = r5.f18152f
                int r0 = r5.f18154h
                int r6 = r6 - r0
                r0 = 10
                if (r6 < r0) goto L5c
            L45:
                if (r1 >= r0) goto L57
                byte[] r6 = r5.f18150d
                int r3 = r5.f18154h
                int r4 = r3 + 1
                r5.f18154h = r4
                r6 = r6[r3]
                if (r6 < 0) goto L54
                goto L64
            L54:
                int r1 = r1 + 1
                goto L45
            L57:
                m9.a0 r6 = p221m9.C4434a0.m9899e()
                throw r6
            L5c:
                if (r1 >= r0) goto L68
                byte r6 = r5.m10099B()
                if (r6 < 0) goto L65
            L64:
                return r2
            L65:
                int r1 = r1 + 1
                goto L5c
            L68:
                m9.a0 r6 = p221m9.C4434a0.m9899e()
                throw r6
        }

        /* renamed from: B */
        public byte m10099B() {
                r3 = this;
                int r0 = r3.f18154h
                int r1 = r3.f18152f
                if (r0 == r1) goto Lf
                byte[] r1 = r3.f18150d
                int r2 = r0 + 1
                r3.f18154h = r2
                r0 = r1[r0]
                return r0
            Lf:
                m9.a0 r0 = p221m9.C4434a0.m9902h()
                throw r0
        }

        /* renamed from: C */
        public int m10100C() {
                r4 = this;
                int r0 = r4.f18154h
                int r1 = r4.f18152f
                int r1 = r1 - r0
                r2 = 4
                if (r1 < r2) goto L2e
                byte[] r1 = r4.f18150d
                int r2 = r0 + 4
                r4.f18154h = r2
                r2 = r1[r0]
                r2 = r2 & 255(0xff, float:3.57E-43)
                int r3 = r0 + 1
                r3 = r1[r3]
                r3 = r3 & 255(0xff, float:3.57E-43)
                int r3 = r3 << 8
                r2 = r2 | r3
                int r3 = r0 + 2
                r3 = r1[r3]
                r3 = r3 & 255(0xff, float:3.57E-43)
                int r3 = r3 << 16
                r2 = r2 | r3
                int r0 = r0 + 3
                r0 = r1[r0]
                r0 = r0 & 255(0xff, float:3.57E-43)
                int r0 = r0 << 24
                r0 = r0 | r2
                return r0
            L2e:
                m9.a0 r0 = p221m9.C4434a0.m9902h()
                throw r0
        }

        /* renamed from: D */
        public long m10101D() {
                r9 = this;
                int r0 = r9.f18154h
                int r1 = r9.f18152f
                int r1 = r1 - r0
                r2 = 8
                if (r1 < r2) goto L5b
                byte[] r1 = r9.f18150d
                int r3 = r0 + 8
                r9.f18154h = r3
                r3 = r1[r0]
                long r3 = (long) r3
                r5 = 255(0xff, double:1.26E-321)
                long r3 = r3 & r5
                int r7 = r0 + 1
                r7 = r1[r7]
                long r7 = (long) r7
                long r7 = r7 & r5
                long r7 = r7 << r2
                long r2 = r3 | r7
                int r4 = r0 + 2
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 16
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 3
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 24
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 4
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 32
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 5
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 40
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 6
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 48
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r0 = r0 + 7
                r0 = r1[r0]
                long r0 = (long) r0
                long r0 = r0 & r5
                r4 = 56
                long r0 = r0 << r4
                long r0 = r0 | r2
                return r0
            L5b:
                m9.a0 r0 = p221m9.C4434a0.m9902h()
                throw r0
        }

        /* renamed from: E */
        public int m10102E() {
                r5 = this;
                int r0 = r5.f18154h
                int r1 = r5.f18152f
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f18150d
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f18154h = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.m10104G()
                int r1 = (int) r0
                return r1
            L70:
                r5.f18154h = r1
                return r0
        }

        /* renamed from: F */
        public long m10103F() {
                r11 = this;
                int r0 = r11.f18154h
                int r1 = r11.f18152f
                if (r1 != r0) goto L8
                goto Lb6
            L8:
                byte[] r2 = r11.f18150d
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L14
                r11.f18154h = r3
                long r0 = (long) r0
                return r0
            L14:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L1b
                goto Lb6
            L1b:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L29
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            L26:
                long r2 = (long) r0
                goto Lbd
            L29:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L3a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto Lbd
            L3a:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L48
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L26
            L48:
                long r3 = (long) r0
                int r0 = r1 + 1
                r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L5f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L5b:
                long r2 = r3 ^ r1
                r1 = r0
                goto Lbd
            L5f:
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L74
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L71:
                long r2 = r3 ^ r5
                goto Lbd
            L74:
                int r0 = r1 + 1
                r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L87
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L5b
            L87:
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L9a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L71
            L9a:
                int r0 = r1 + 1
                r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto Lbb
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto Lbc
            Lb6:
                long r0 = r11.m10104G()
                return r0
            Lbb:
                r1 = r0
            Lbc:
                r2 = r3
            Lbd:
                r11.f18154h = r1
                return r2
        }

        /* renamed from: G */
        public long m10104G() {
                r6 = this;
                r0 = 0
                r2 = 0
            L3:
                r3 = 64
                if (r2 >= r3) goto L18
                byte r3 = r6.m10099B()
                r4 = r3 & 127(0x7f, float:1.78E-43)
                long r4 = (long) r4
                long r4 = r4 << r2
                long r0 = r0 | r4
                r3 = r3 & 128(0x80, float:1.8E-43)
                if (r3 != 0) goto L15
                return r0
            L15:
                int r2 = r2 + 7
                goto L3
            L18:
                m9.a0 r0 = p221m9.C4434a0.m9899e()
                throw r0
        }

        /* renamed from: H */
        public final void m10105H() {
                r3 = this;
                int r0 = r3.f18152f
                int r1 = r3.f18153g
                int r0 = r0 + r1
                r3.f18152f = r0
                int r1 = r3.f18155i
                int r1 = r0 - r1
                int r2 = r3.f18157k
                if (r1 <= r2) goto L16
                int r1 = r1 - r2
                r3.f18153g = r1
                int r0 = r0 - r1
                r3.f18152f = r0
                goto L19
            L16:
                r0 = 0
                r3.f18153g = r0
            L19:
                return
        }

        /* renamed from: I */
        public void m10106I(int r3) {
                r2 = this;
                if (r3 < 0) goto Ld
                int r0 = r2.f18152f
                int r1 = r2.f18154h
                int r0 = r0 - r1
                if (r3 > r0) goto Ld
                int r1 = r1 + r3
                r2.f18154h = r1
                return
            Ld:
                if (r3 >= 0) goto L14
                m9.a0 r3 = p221m9.C4434a0.m9900f()
                throw r3
            L14:
                m9.a0 r3 = p221m9.C4434a0.m9902h()
                throw r3
        }

        @Override // p221m9.AbstractC4457i
        /* renamed from: a */
        public void mo10076a(int r2) {
                r1 = this;
                int r0 = r1.f18156j
                if (r0 != r2) goto L5
                return
            L5:
                m9.a0 r2 = p221m9.C4434a0.m9895a()
                throw r2
        }

        @Override // p221m9.AbstractC4457i
        /* renamed from: d */
        public int mo10077d() {
                r2 = this;
                int r0 = r2.f18154h
                int r1 = r2.f18155i
                int r0 = r0 - r1
                return r0
        }

        @Override // p221m9.AbstractC4457i
        /* renamed from: e */
        public boolean mo10078e() {
                r2 = this;
                int r0 = r2.f18154h
                int r1 = r2.f18152f
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // p221m9.AbstractC4457i
        /* renamed from: g */
        public void mo10079g(int r1) {
                r0 = this;
                r0.f18157k = r1
                r0.m10105H()
                return
        }

        @Override // p221m9.AbstractC4457i
        /* renamed from: h */
        public int mo10080h(int r2) {
                r1 = this;
                if (r2 < 0) goto L16
                int r0 = r1.mo10077d()
                int r0 = r0 + r2
                int r2 = r1.f18157k
                if (r0 > r2) goto L11
                r1.f18157k = r0
                r1.m10105H()
                return r2
            L11:
                m9.a0 r2 = p221m9.C4434a0.m9902h()
                throw r2
            L16:
                m9.a0 r2 = p221m9.C4434a0.m9900f()
                throw r2
        }

        @Override // p221m9.AbstractC4457i
        /* renamed from: i */
        public boolean mo10081i() {
                r5 = this;
                long r0 = r5.m10103F()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // p221m9.AbstractC4457i
        /* renamed from: j */
        public p221m9.AbstractC4454h mo10082j() {
                r3 = this;
                int r0 = r3.m10102E()
                if (r0 <= 0) goto L19
                int r1 = r3.f18152f
                int r2 = r3.f18154h
                int r1 = r1 - r2
                if (r0 > r1) goto L19
                byte[] r1 = r3.f18150d
                m9.h r1 = p221m9.AbstractC4454h.m10054i(r1, r2, r0)
                int r2 = r3.f18154h
                int r2 = r2 + r0
                r3.f18154h = r2
                return r1
            L19:
                if (r0 != 0) goto L1e
                m9.h r0 = p221m9.AbstractC4454h.f18139Z
                return r0
            L1e:
                if (r0 <= 0) goto L31
                int r1 = r3.f18152f
                int r2 = r3.f18154h
                int r1 = r1 - r2
                if (r0 > r1) goto L31
                int r0 = r0 + r2
                r3.f18154h = r0
                byte[] r1 = r3.f18150d
                byte[] r0 = java.util.Arrays.copyOfRange(r1, r2, r0)
                goto L37
            L31:
                if (r0 > 0) goto L44
                if (r0 != 0) goto L3f
                byte[] r0 = p221m9.C4505z.f18309b
            L37:
                m9.h r1 = p221m9.AbstractC4454h.f18139Z
                m9.h$f r1 = new m9.h$f
                r1.<init>(r0)
                return r1
            L3f:
                m9.a0 r0 = p221m9.C4434a0.m9900f()
                throw r0
            L44:
                m9.a0 r0 = p221m9.C4434a0.m9902h()
                throw r0
        }

        @Override // p221m9.AbstractC4457i
        /* renamed from: k */
        public double mo10083k() {
                r2 = this;
                long r0 = r2.m10101D()
                double r0 = java.lang.Double.longBitsToDouble(r0)
                return r0
        }

        @Override // p221m9.AbstractC4457i
        /* renamed from: l */
        public int mo10084l() {
                r1 = this;
                int r0 = r1.m10102E()
                return r0
        }

        @Override // p221m9.AbstractC4457i
        /* renamed from: m */
        public int mo10085m() {
                r1 = this;
                int r0 = r1.m10100C()
                return r0
        }

        @Override // p221m9.AbstractC4457i
        /* renamed from: n */
        public long mo10086n() {
                r2 = this;
                long r0 = r2.m10101D()
                return r0
        }

        @Override // p221m9.AbstractC4457i
        /* renamed from: o */
        public float mo10087o() {
                r1 = this;
                int r0 = r1.m10100C()
                float r0 = java.lang.Float.intBitsToFloat(r0)
                return r0
        }

        @Override // p221m9.AbstractC4457i
        /* renamed from: p */
        public int mo10088p() {
                r1 = this;
                int r0 = r1.m10102E()
                return r0
        }

        @Override // p221m9.AbstractC4457i
        /* renamed from: q */
        public long mo10089q() {
                r2 = this;
                long r0 = r2.m10103F()
                return r0
        }

        @Override // p221m9.AbstractC4457i
        /* renamed from: r */
        public int mo10090r() {
                r1 = this;
                int r0 = r1.m10100C()
                return r0
        }

        @Override // p221m9.AbstractC4457i
        /* renamed from: s */
        public long mo10091s() {
                r2 = this;
                long r0 = r2.m10101D()
                return r0
        }

        @Override // p221m9.AbstractC4457i
        /* renamed from: t */
        public int mo10092t() {
                r1 = this;
                int r0 = r1.m10102E()
                int r0 = p221m9.AbstractC4457i.m10072b(r0)
                return r0
        }

        @Override // p221m9.AbstractC4457i
        /* renamed from: u */
        public long mo10093u() {
                r2 = this;
                long r0 = r2.m10103F()
                long r0 = p221m9.AbstractC4457i.m10073c(r0)
                return r0
        }

        @Override // p221m9.AbstractC4457i
        /* renamed from: v */
        public java.lang.String mo10094v() {
                r5 = this;
                int r0 = r5.m10102E()
                if (r0 <= 0) goto L1c
                int r1 = r5.f18152f
                int r2 = r5.f18154h
                int r1 = r1 - r2
                if (r0 > r1) goto L1c
                java.lang.String r1 = new java.lang.String
                byte[] r3 = r5.f18150d
                java.nio.charset.Charset r4 = p221m9.C4505z.f18308a
                r1.<init>(r3, r2, r0, r4)
                int r2 = r5.f18154h
                int r2 = r2 + r0
                r5.f18154h = r2
                return r1
            L1c:
                if (r0 != 0) goto L21
                java.lang.String r0 = ""
                return r0
            L21:
                if (r0 >= 0) goto L28
                m9.a0 r0 = p221m9.C4434a0.m9900f()
                throw r0
            L28:
                m9.a0 r0 = p221m9.C4434a0.m9902h()
                throw r0
        }

        @Override // p221m9.AbstractC4457i
        /* renamed from: w */
        public java.lang.String mo10095w() {
                r4 = this;
                int r0 = r4.m10102E()
                if (r0 <= 0) goto L1b
                int r1 = r4.f18152f
                int r2 = r4.f18154h
                int r1 = r1 - r2
                if (r0 > r1) goto L1b
                byte[] r1 = r4.f18150d
                m9.r1$b r3 = p221m9.C4486r1.f18221a
                java.lang.String r1 = r3.mo10291a(r1, r2, r0)
                int r2 = r4.f18154h
                int r2 = r2 + r0
                r4.f18154h = r2
                return r1
            L1b:
                if (r0 != 0) goto L20
                java.lang.String r0 = ""
                return r0
            L20:
                if (r0 > 0) goto L27
                m9.a0 r0 = p221m9.C4434a0.m9900f()
                throw r0
            L27:
                m9.a0 r0 = p221m9.C4434a0.m9902h()
                throw r0
        }

        @Override // p221m9.AbstractC4457i
        /* renamed from: x */
        public int mo10096x() {
                r2 = this;
                boolean r0 = r2.mo10078e()
                if (r0 == 0) goto La
                r0 = 0
                r2.f18156j = r0
                return r0
            La:
                int r0 = r2.m10102E()
                r2.f18156j = r0
                int r1 = r0 >>> 3
                if (r1 == 0) goto L15
                return r0
            L15:
                m9.a0 r0 = p221m9.C4434a0.m9896b()
                throw r0
        }

        @Override // p221m9.AbstractC4457i
        /* renamed from: y */
        public int mo10097y() {
                r1 = this;
                int r0 = r1.m10102E()
                return r0
        }

        @Override // p221m9.AbstractC4457i
        /* renamed from: z */
        public long mo10098z() {
                r2 = this;
                long r0 = r2.m10103F()
                return r0
        }
    }

    public AbstractC4457i(p221m9.AbstractC4457i.a r1) {
            r0 = this;
            r0.<init>()
            r1 = 100
            r0.f18148b = r1
            return
    }

    /* renamed from: b */
    public static int m10072b(int r1) {
            int r0 = r1 >>> 1
            r1 = r1 & 1
            int r1 = -r1
            r1 = r1 ^ r0
            return r1
    }

    /* renamed from: c */
    public static long m10073c(long r4) {
            r0 = 1
            long r0 = r4 >>> r0
            r2 = 1
            long r4 = r4 & r2
            long r4 = -r4
            long r4 = r4 ^ r0
            return r4
    }

    /* renamed from: f */
    public static p221m9.AbstractC4457i m10074f(byte[] r7, int r8, int r9, boolean r10) {
            m9.i$b r6 = new m9.i$b
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo10080h(r9)     // Catch: p221m9.C4434a0 -> Lf
            return r6
        Lf:
            r7 = move-exception
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r7)
            throw r8
    }

    /* renamed from: A */
    public abstract boolean mo10075A(int r1);

    /* renamed from: a */
    public abstract void mo10076a(int r1);

    /* renamed from: d */
    public abstract int mo10077d();

    /* renamed from: e */
    public abstract boolean mo10078e();

    /* renamed from: g */
    public abstract void mo10079g(int r1);

    /* renamed from: h */
    public abstract int mo10080h(int r1);

    /* renamed from: i */
    public abstract boolean mo10081i();

    /* renamed from: j */
    public abstract p221m9.AbstractC4454h mo10082j();

    /* renamed from: k */
    public abstract double mo10083k();

    /* renamed from: l */
    public abstract int mo10084l();

    /* renamed from: m */
    public abstract int mo10085m();

    /* renamed from: n */
    public abstract long mo10086n();

    /* renamed from: o */
    public abstract float mo10087o();

    /* renamed from: p */
    public abstract int mo10088p();

    /* renamed from: q */
    public abstract long mo10089q();

    /* renamed from: r */
    public abstract int mo10090r();

    /* renamed from: s */
    public abstract long mo10091s();

    /* renamed from: t */
    public abstract int mo10092t();

    /* renamed from: u */
    public abstract long mo10093u();

    /* renamed from: v */
    public abstract java.lang.String mo10094v();

    /* renamed from: w */
    public abstract java.lang.String mo10095w();

    /* renamed from: x */
    public abstract int mo10096x();

    /* renamed from: y */
    public abstract int mo10097y();

    /* renamed from: z */
    public abstract long mo10098z();
}
