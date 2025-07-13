package p088f4;

/* renamed from: f4.z */
/* loaded from: classes.dex */
public final class C2057z extends p088f4.AbstractC2005f {

    /* renamed from: H */
    public static final /* synthetic */ int f9393H = 0;

    /* renamed from: A */
    public p108g5.InterfaceC2265e0 f9394A;

    /* renamed from: B */
    public p088f4.InterfaceC2054x0.b f9395B;

    /* renamed from: C */
    public p088f4.C2021k0 f9396C;

    /* renamed from: D */
    public p088f4.C2021k0 f9397D;

    /* renamed from: E */
    public p088f4.C2050v0 f9398E;

    /* renamed from: F */
    public int f9399F;

    /* renamed from: G */
    public long f9400G;

    /* renamed from: b */
    public final p325s5.C5974n f9401b;

    /* renamed from: c */
    public final p088f4.InterfaceC2054x0.b f9402c;

    /* renamed from: d */
    public final p088f4.InterfaceC2004e1[] f9403d;

    /* renamed from: e */
    public final p325s5.AbstractC5973m f9404e;

    /* renamed from: f */
    public final p371v5.InterfaceC6563m f9405f;

    /* renamed from: g */
    public final p088f4.C1994b0.e f9406g;

    /* renamed from: h */
    public final p088f4.C1994b0 f9407h;

    /* renamed from: i */
    public final p371v5.C6564n<p088f4.InterfaceC2054x0.c> f9408i;

    /* renamed from: j */
    public final java.util.concurrent.CopyOnWriteArraySet<p088f4.InterfaceC2043s.a> f9409j;

    /* renamed from: k */
    public final p088f4.AbstractC2031n1.b f9410k;

    /* renamed from: l */
    public final java.util.List<p088f4.C2057z.a> f9411l;

    /* renamed from: m */
    public final boolean f9412m;

    /* renamed from: n */
    public final p108g5.InterfaceC2287v f9413n;

    /* renamed from: o */
    public final p107g4.C2254p f9414o;

    /* renamed from: p */
    public final android.os.Looper f9415p;

    /* renamed from: q */
    public final p352u5.InterfaceC6308c f9416q;

    /* renamed from: r */
    public final long f9417r;

    /* renamed from: s */
    public final long f9418s;

    /* renamed from: t */
    public final p371v5.InterfaceC6553c f9419t;

    /* renamed from: u */
    public int f9420u;

    /* renamed from: v */
    public boolean f9421v;

    /* renamed from: w */
    public int f9422w;

    /* renamed from: x */
    public int f9423x;

    /* renamed from: y */
    public boolean f9424y;

    /* renamed from: z */
    public int f9425z;

    /* renamed from: f4.z$a */
    public static final class a implements p088f4.InterfaceC2036p0 {

        /* renamed from: a */
        public final java.lang.Object f9426a;

        /* renamed from: b */
        public p088f4.AbstractC2031n1 f9427b;

        public a(java.lang.Object r1, p088f4.AbstractC2031n1 r2) {
                r0 = this;
                r0.<init>()
                r0.f9426a = r1
                r0.f9427b = r2
                return
        }

        @Override // p088f4.InterfaceC2036p0
        /* renamed from: a */
        public java.lang.Object mo5378a() {
                r1 = this;
                java.lang.Object r0 = r1.f9426a
                return r0
        }

        @Override // p088f4.InterfaceC2036p0
        /* renamed from: b */
        public p088f4.AbstractC2031n1 mo5379b() {
                r1 = this;
                f4.n1 r0 = r1.f9427b
                return r0
        }
    }

    static {
            java.lang.String r0 = "goog.exo.exoplayer"
            p088f4.C1997c0.m5181a(r0)
            return
    }

    @android.annotation.SuppressLint({"HandlerLeak"})
    public C2057z(p088f4.InterfaceC2004e1[] r19, p325s5.AbstractC5973m r20, p108g5.InterfaceC2287v r21, p088f4.InterfaceC2015i0 r22, p352u5.InterfaceC6308c r23, p107g4.C2254p r24, boolean r25, p088f4.C2016i1 r26, long r27, long r29, p088f4.InterfaceC2012h0 r31, long r32, boolean r34, p371v5.InterfaceC6553c r35, android.os.Looper r36, p088f4.InterfaceC2054x0 r37, p088f4.InterfaceC2054x0.b r38) {
            r18 = this;
            r0 = r18
            r2 = r19
            r3 = r20
            r6 = r23
            r9 = r24
            r15 = r35
            r14 = r36
            r1 = r37
            r18.<init>()
            int r4 = java.lang.System.identityHashCode(r18)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            java.lang.String r5 = p371v5.C6552b0.f25628e
            r7 = 30
            int r7 = p064e.C1489c.m4038a(r4, r7)
            int r7 = p064e.C1489c.m4038a(r5, r7)
            java.lang.String r8 = "Init "
            java.lang.String r10 = " ["
            java.lang.String r11 = "ExoPlayerLib/2.16.1"
            java.lang.StringBuilder r4 = p064e.C1491e.m4040a(r7, r8, r4, r10, r11)
            java.lang.String r7 = "] ["
            r4.append(r7)
            r4.append(r5)
            java.lang.String r5 = "]"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "ExoPlayerImpl"
            android.util.Log.i(r5, r4)
            int r4 = r2.length
            r5 = 0
            r7 = 1
            if (r4 <= 0) goto L4e
            r4 = 1
            goto L4f
        L4e:
            r4 = 0
        L4f:
            p371v5.C6549a.m13291e(r4)
            r0.f9403d = r2
            java.util.Objects.requireNonNull(r20)
            r0.f9404e = r3
            r4 = r21
            r0.f9413n = r4
            r0.f9416q = r6
            r0.f9414o = r9
            r4 = r25
            r0.f9412m = r4
            r10 = r27
            r0.f9417r = r10
            r10 = r29
            r0.f9418s = r10
            r0.f9415p = r14
            r0.f9419t = r15
            r0.f9420u = r5
            v5.n r4 = new v5.n
            u3.b r8 = new u3.b
            r8.<init>(r1)
            r4.<init>(r14, r15, r8)
            r0.f9408i = r4
            java.util.concurrent.CopyOnWriteArraySet r4 = new java.util.concurrent.CopyOnWriteArraySet
            r4.<init>()
            r0.f9409j = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.f9411l = r4
            g5.e0$a r4 = new g5.e0$a
            r4.<init>(r5)
            r0.f9394A = r4
            s5.n r4 = new s5.n
            int r8 = r2.length
            f4.g1[] r8 = new p088f4.C2010g1[r8]
            int r10 = r2.length
            s5.f[] r10 = new p325s5.InterfaceC5966f[r10]
            f4.o1 r11 = p088f4.C2034o1.f9273Z
            r12 = 0
            r4.<init>(r8, r10, r11, r12)
            r0.f9401b = r4
            f4.n1$b r8 = new f4.n1$b
            r8.<init>()
            r0.f9410k = r8
            android.util.SparseBooleanArray r8 = new android.util.SparseBooleanArray
            r8.<init>()
            r10 = 12
            int[] r11 = new int[r10]
            r11 = {x01c8: FILL_ARRAY_DATA , data: [1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30} // fill-array
            r13 = 0
        Lb8:
            if (r13 >= r10) goto Lcb
            r10 = r11[r13]
            r16 = 0
            r16 = r16 ^ 1
            p371v5.C6549a.m13291e(r16)
            r8.append(r10, r7)
            int r13 = r13 + 1
            r10 = 12
            goto Lb8
        Lcb:
            r10 = 29
            boolean r11 = r3 instanceof p325s5.C5964d
            if (r11 == 0) goto Ld9
            r11 = 0
            r11 = r11 ^ r7
            p371v5.C6549a.m13291e(r11)
            r8.append(r10, r7)
        Ld9:
            r10 = r38
            v5.k r10 = r10.f9379Y
            r11 = 0
        Lde:
            int r13 = r10.m13347c()
            if (r11 >= r13) goto Lf5
            int r13 = r10.m13346b(r11)
            r16 = 0
            r16 = r16 ^ 1
            p371v5.C6549a.m13291e(r16)
            r8.append(r13, r7)
            int r11 = r11 + 1
            goto Lde
        Lf5:
            f4.x0$b r10 = new f4.x0$b
            r11 = r7 ^ 0
            p371v5.C6549a.m13291e(r11)
            v5.k r11 = new v5.k
            r11.<init>(r8, r12)
            r10.<init>(r11, r12)
            r0.f9402c = r10
            android.util.SparseBooleanArray r8 = new android.util.SparseBooleanArray
            r8.<init>()
            r10 = 0
        L10c:
            int r13 = r11.m13347c()
            if (r10 >= r13) goto L123
            int r13 = r11.m13346b(r10)
            r16 = 0
            r16 = r16 ^ 1
            p371v5.C6549a.m13291e(r16)
            r8.append(r13, r7)
            int r10 = r10 + 1
            goto L10c
        L123:
            r10 = 4
            r11 = r7 ^ 0
            p371v5.C6549a.m13291e(r11)
            r8.append(r10, r7)
            r10 = 10
            r11 = r7 ^ 0
            p371v5.C6549a.m13291e(r11)
            r8.append(r10, r7)
            f4.x0$b r10 = new f4.x0$b
            r7 = r7 ^ 0
            p371v5.C6549a.m13291e(r7)
            v5.k r7 = new v5.k
            r7.<init>(r8, r12)
            r10.<init>(r7, r12)
            r0.f9395B = r10
            f4.k0 r7 = p088f4.C2021k0.f9094F0
            r0.f9396C = r7
            r0.f9397D = r7
            r7 = -1
            r0.f9399F = r7
            v5.m r7 = r15.mo13335b(r14, r12)
            r0.f9405f = r7
            f4.v r13 = new f4.v
            r13.<init>(r0, r5)
            r0.f9406g = r13
            f4.v0 r7 = p088f4.C2050v0.m5410i(r4)
            r0.f9398E = r7
            if (r9 == 0) goto L19e
            f4.x0 r7 = r9.f10236e0
            if (r7 == 0) goto L173
            g4.p$a r7 = r9.f10233b0
            b9.n<g5.r$a> r7 = r7.f10240b
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L174
        L173:
            r5 = 1
        L174:
            p371v5.C6549a.m13291e(r5)
            r9.f10236e0 = r1
            v5.c r5 = r9.f10230Y
            v5.m r5 = r5.mo13335b(r14, r12)
            r9.f10237f0 = r5
            v5.n<g4.q> r5 = r9.f10235d0
            f1.g0 r7 = new f1.g0
            r7.<init>(r9, r1)
            v5.n r1 = new v5.n
            java.util.concurrent.CopyOnWriteArraySet<v5.n$c<T>> r8 = r5.f25662d
            v5.c r5 = r5.f25659a
            r1.<init>(r8, r14, r5, r7)
            r9.f10235d0 = r1
            r0.m5448g0(r9)
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r14)
            r6.mo12945e(r1, r9)
        L19e:
            f4.b0 r12 = new f4.b0
            r1 = r12
            int r7 = r0.f9420u
            boolean r8 = r0.f9421v
            r2 = r19
            r3 = r20
            r5 = r22
            r6 = r23
            r9 = r24
            r10 = r26
            r11 = r31
            r0 = r12
            r17 = r13
            r12 = r32
            r14 = r34
            r15 = r36
            r16 = r35
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17)
            r1 = r0
            r0 = r18
            r0.f9407h = r1
            return
    }

    /* renamed from: m0 */
    public static long m5446m0(p088f4.C2050v0 r7) {
            f4.n1$d r0 = new f4.n1$d
            r0.<init>()
            f4.n1$b r1 = new f4.n1$b
            r1.<init>()
            f4.n1 r2 = r7.f9350a
            g5.r$a r3 = r7.f9351b
            java.lang.Object r3 = r3.f10415a
            r2.mo5090i(r3, r1)
            long r2 = r7.f9352c
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L29
            f4.n1 r7 = r7.f9350a
            int r1 = r1.f9227a0
            f4.n1$d r7 = r7.m5343o(r1, r0)
            long r0 = r7.f9252k0
            goto L2c
        L29:
            long r0 = r1.f9229c0
            long r0 = r0 + r2
        L2c:
            return r0
    }

    /* renamed from: n0 */
    public static boolean m5447n0(p088f4.C2050v0 r2) {
            int r0 = r2.f9354e
            r1 = 3
            if (r0 != r1) goto Lf
            boolean r0 = r2.f9361l
            if (r0 == 0) goto Lf
            int r2 = r2.f9362m
            if (r2 != 0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            return r2
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: A */
    public int mo2821A() {
            r1 = this;
            int r0 = r1.f9420u
            return r0
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: C */
    public int mo2822C() {
            r2 = this;
            f4.v0 r0 = r2.f9398E
            f4.n1 r0 = r0.f9350a
            boolean r0 = r0.m5344r()
            if (r0 == 0) goto Lc
            r0 = 0
            return r0
        Lc:
            f4.v0 r0 = r2.f9398E
            f4.n1 r1 = r0.f9350a
            g5.r$a r0 = r0.f9351b
            java.lang.Object r0 = r0.f10415a
            int r0 = r1.mo5086c(r0)
            return r0
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: E */
    public int mo2823E() {
            r1 = this;
            boolean r0 = r1.mo2840h()
            if (r0 == 0) goto Ld
            f4.v0 r0 = r1.f9398E
            g5.r$a r0 = r0.f9351b
            int r0 = r0.f10416b
            goto Le
        Ld:
            r0 = -1
        Le:
            return r0
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: F */
    public int mo2824F() {
            r2 = this;
            int r0 = r2.m5452k0()
            r1 = -1
            if (r0 != r1) goto L8
            r0 = 0
        L8:
            return r0
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: H */
    public void mo2825H(p088f4.InterfaceC2054x0.e r2) {
            r1 = this;
            v5.n<f4.x0$c> r0 = r1.f9408i
            r0.m13367d(r2)
            return
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: I */
    public int mo2826I() {
            r1 = this;
            boolean r0 = r1.mo2840h()
            if (r0 == 0) goto Ld
            f4.v0 r0 = r1.f9398E
            g5.r$a r0 = r0.f9351b
            int r0 = r0.f10417c
            goto Le
        Ld:
            r0 = -1
        Le:
            return r0
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: K */
    public int mo2827K() {
            r1 = this;
            f4.v0 r0 = r1.f9398E
            int r0 = r0.f9362m
            return r0
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: L */
    public long mo2828L() {
            r4 = this;
            boolean r0 = r4.mo2840h()
            if (r0 == 0) goto L22
            f4.v0 r0 = r4.f9398E
            g5.r$a r1 = r0.f9351b
            f4.n1 r0 = r0.f9350a
            java.lang.Object r2 = r1.f10415a
            f4.n1$b r3 = r4.f9410k
            r0.mo5090i(r2, r3)
            f4.n1$b r0 = r4.f9410k
            int r2 = r1.f10416b
            int r1 = r1.f10417c
            long r0 = r0.m5346a(r2, r1)
            long r0 = p371v5.C6552b0.m13307K(r0)
            return r0
        L22:
            long r0 = r4.m5224Y()
            return r0
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: M */
    public p088f4.AbstractC2031n1 mo2829M() {
            r1 = this;
            f4.v0 r0 = r1.f9398E
            f4.n1 r0 = r0.f9350a
            return r0
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: N */
    public android.os.Looper mo2830N() {
            r1 = this;
            android.os.Looper r0 = r1.f9415p
            return r0
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: O */
    public boolean mo2831O() {
            r1 = this;
            boolean r0 = r1.f9421v
            return r0
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: P */
    public void mo2832P(int r11, int r12) {
            r10 = this;
            java.util.List<f4.z$a> r0 = r10.f9411l
            int r0 = r0.size()
            int r12 = java.lang.Math.min(r12, r0)
            f4.v0 r1 = r10.m5456q0(r11, r12)
            g5.r$a r11 = r1.f9351b
            java.lang.Object r11 = r11.f10415a
            f4.v0 r12 = r10.f9398E
            g5.r$a r12 = r12.f9351b
            java.lang.Object r12 = r12.f10415a
            boolean r11 = r11.equals(r12)
            r5 = r11 ^ 1
            r2 = 0
            r3 = 1
            r4 = 0
            r6 = 4
            long r7 = r10.m5451j0(r1)
            r9 = -1
            r0 = r10
            r0.m5461v0(r1, r2, r3, r4, r5, r6, r7, r9)
            return
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: Q */
    public void mo2833Q(p088f4.InterfaceC2054x0.e r1) {
            r0 = this;
            r0.m5448g0(r1)
            return
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: W */
    public long mo2834W() {
            r2 = this;
            f4.v0 r0 = r2.f9398E
            long r0 = r2.m5451j0(r0)
            long r0 = p371v5.C6552b0.m13307K(r0)
            return r0
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: X */
    public long mo2835X() {
            r2 = this;
            long r0 = r2.f9417r
            return r0
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: c */
    public void mo2836c(p088f4.C2052w0 r12) {
            r11 = this;
            if (r12 != 0) goto L4
            f4.w0 r12 = p088f4.C2052w0.f9371b0
        L4:
            f4.v0 r0 = r11.f9398E
            f4.w0 r0 = r0.f9363n
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto Lf
            return
        Lf:
            f4.v0 r0 = r11.f9398E
            f4.v0 r2 = r0.m5416f(r12)
            int r0 = r11.f9422w
            int r0 = r0 + 1
            r11.f9422w = r0
            f4.b0 r0 = r11.f9407h
            v5.m r0 = r0.f8812f0
            r1 = 4
            v5.m$a r12 = r0.mo13360h(r1, r12)
            v5.x$b r12 = (p371v5.C6574x.b) r12
            r12.m13428b()
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 5
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = -1
            r1 = r11
            r1.m5461v0(r2, r3, r4, r5, r6, r7, r8, r10)
            return
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: e */
    public p088f4.C2052w0 mo2837e() {
            r1 = this;
            f4.v0 r0 = r1.f9398E
            f4.w0 r0 = r0.f9363n
            return r0
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: f */
    public p088f4.C2048u0 mo2838f() {
            r1 = this;
            f4.v0 r0 = r1.f9398E
            f4.q r0 = r0.f9355f
            return r0
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: g */
    public void mo2839g(boolean r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.m5458s0(r3, r0, r1)
            return
    }

    /* renamed from: g0 */
    public void m5448g0(p088f4.InterfaceC2054x0.c r3) {
            r2 = this;
            v5.n<f4.x0$c> r0 = r2.f9408i
            boolean r1 = r0.f25665g
            if (r1 == 0) goto L7
            goto L14
        L7:
            java.util.Objects.requireNonNull(r3)
            java.util.concurrent.CopyOnWriteArraySet<v5.n$c<T>> r0 = r0.f25662d
            v5.n$c r1 = new v5.n$c
            r1.<init>(r3)
            r0.add(r1)
        L14:
            return
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: h */
    public boolean mo2840h() {
            r1 = this;
            f4.v0 r0 = r1.f9398E
            g5.r$a r0 = r0.f9351b
            boolean r0 = r0.m6028a()
            return r0
    }

    /* renamed from: h0 */
    public final p088f4.C2021k0 m5449h0() {
            r4 = this;
            f4.j0 r0 = r4.mo5237w()
            if (r0 != 0) goto L9
            f4.k0 r0 = r4.f9397D
            return r0
        L9:
            f4.k0 r1 = r4.f9397D
            f4.k0$b r1 = r1.m5311a()
            f4.k0 r0 = r0.f8973b0
            if (r0 != 0) goto L15
            goto Ldf
        L15:
            java.lang.CharSequence r2 = r0.f9101Y
            if (r2 == 0) goto L1b
            r1.f9135a = r2
        L1b:
            java.lang.CharSequence r2 = r0.f9102Z
            if (r2 == 0) goto L21
            r1.f9136b = r2
        L21:
            java.lang.CharSequence r2 = r0.f9103a0
            if (r2 == 0) goto L27
            r1.f9137c = r2
        L27:
            java.lang.CharSequence r2 = r0.f9104b0
            if (r2 == 0) goto L2d
            r1.f9138d = r2
        L2d:
            java.lang.CharSequence r2 = r0.f9105c0
            if (r2 == 0) goto L33
            r1.f9139e = r2
        L33:
            java.lang.CharSequence r2 = r0.f9106d0
            if (r2 == 0) goto L39
            r1.f9140f = r2
        L39:
            java.lang.CharSequence r2 = r0.f9107e0
            if (r2 == 0) goto L3f
            r1.f9141g = r2
        L3f:
            android.net.Uri r2 = r0.f9108f0
            if (r2 == 0) goto L45
            r1.f9142h = r2
        L45:
            f4.c1 r2 = r0.f9109g0
            if (r2 == 0) goto L4b
            r1.f9143i = r2
        L4b:
            f4.c1 r2 = r0.f9110h0
            if (r2 == 0) goto L51
            r1.f9144j = r2
        L51:
            byte[] r2 = r0.f9111i0
            if (r2 == 0) goto L61
            java.lang.Integer r3 = r0.f9112j0
            java.lang.Object r2 = r2.clone()
            byte[] r2 = (byte[]) r2
            r1.f9145k = r2
            r1.f9146l = r3
        L61:
            android.net.Uri r2 = r0.f9113k0
            if (r2 == 0) goto L67
            r1.f9147m = r2
        L67:
            java.lang.Integer r2 = r0.f9114l0
            if (r2 == 0) goto L6d
            r1.f9148n = r2
        L6d:
            java.lang.Integer r2 = r0.f9115m0
            if (r2 == 0) goto L73
            r1.f9149o = r2
        L73:
            java.lang.Integer r2 = r0.f9116n0
            if (r2 == 0) goto L79
            r1.f9150p = r2
        L79:
            java.lang.Boolean r2 = r0.f9117o0
            if (r2 == 0) goto L7f
            r1.f9151q = r2
        L7f:
            java.lang.Integer r2 = r0.f9118p0
            if (r2 == 0) goto L85
            r1.f9152r = r2
        L85:
            java.lang.Integer r2 = r0.f9119q0
            if (r2 == 0) goto L8b
            r1.f9152r = r2
        L8b:
            java.lang.Integer r2 = r0.f9120r0
            if (r2 == 0) goto L91
            r1.f9153s = r2
        L91:
            java.lang.Integer r2 = r0.f9121s0
            if (r2 == 0) goto L97
            r1.f9154t = r2
        L97:
            java.lang.Integer r2 = r0.f9122t0
            if (r2 == 0) goto L9d
            r1.f9155u = r2
        L9d:
            java.lang.Integer r2 = r0.f9123u0
            if (r2 == 0) goto La3
            r1.f9156v = r2
        La3:
            java.lang.Integer r2 = r0.f9124v0
            if (r2 == 0) goto La9
            r1.f9157w = r2
        La9:
            java.lang.CharSequence r2 = r0.f9125w0
            if (r2 == 0) goto Laf
            r1.f9158x = r2
        Laf:
            java.lang.CharSequence r2 = r0.f9126x0
            if (r2 == 0) goto Lb5
            r1.f9159y = r2
        Lb5:
            java.lang.CharSequence r2 = r0.f9127y0
            if (r2 == 0) goto Lbb
            r1.f9160z = r2
        Lbb:
            java.lang.Integer r2 = r0.f9128z0
            if (r2 == 0) goto Lc1
            r1.f9129A = r2
        Lc1:
            java.lang.Integer r2 = r0.f9096A0
            if (r2 == 0) goto Lc7
            r1.f9130B = r2
        Lc7:
            java.lang.CharSequence r2 = r0.f9097B0
            if (r2 == 0) goto Lcd
            r1.f9131C = r2
        Lcd:
            java.lang.CharSequence r2 = r0.f9098C0
            if (r2 == 0) goto Ld3
            r1.f9132D = r2
        Ld3:
            java.lang.CharSequence r2 = r0.f9099D0
            if (r2 == 0) goto Ld9
            r1.f9133E = r2
        Ld9:
            android.os.Bundle r0 = r0.f9100E0
            if (r0 == 0) goto Ldf
            r1.f9134F = r0
        Ldf:
            f4.k0 r0 = r1.m5312a()
            return r0
    }

    /* renamed from: i0 */
    public p088f4.C1992a1 m5450i0(p088f4.C1992a1.b r9) {
            r8 = this;
            f4.a1 r7 = new f4.a1
            f4.b0 r1 = r8.f9407h
            f4.v0 r0 = r8.f9398E
            f4.n1 r3 = r0.f9350a
            int r4 = r8.mo2824F()
            v5.c r5 = r8.f9419t
            f4.b0 r0 = r8.f9407h
            android.os.Looper r6 = r0.f8814h0
            r0 = r7
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    /* renamed from: j0 */
    public final long m5451j0(p088f4.C2050v0 r5) {
            r4 = this;
            f4.n1 r0 = r5.f9350a
            boolean r0 = r0.m5344r()
            if (r0 == 0) goto Lf
            long r0 = r4.f9400G
            long r0 = p371v5.C6552b0.m13297A(r0)
            return r0
        Lf:
            g5.r$a r0 = r5.f9351b
            boolean r0 = r0.m6028a()
            if (r0 == 0) goto L1a
            long r0 = r5.f9368s
            return r0
        L1a:
            f4.n1 r0 = r5.f9350a
            g5.r$a r1 = r5.f9351b
            long r2 = r5.f9368s
            long r0 = r4.m5455p0(r0, r1, r2)
            return r0
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: k */
    public long mo2844k() {
            r2 = this;
            long r0 = r2.f9418s
            return r0
    }

    /* renamed from: k0 */
    public final int m5452k0() {
            r3 = this;
            f4.v0 r0 = r3.f9398E
            f4.n1 r0 = r0.f9350a
            boolean r0 = r0.m5344r()
            if (r0 == 0) goto Ld
            int r0 = r3.f9399F
            return r0
        Ld:
            f4.v0 r0 = r3.f9398E
            f4.n1 r1 = r0.f9350a
            g5.r$a r0 = r0.f9351b
            java.lang.Object r0 = r0.f10415a
            f4.n1$b r2 = r3.f9410k
            f4.n1$b r0 = r1.mo5090i(r0, r2)
            int r0 = r0.f9227a0
            return r0
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: l */
    public long mo2846l() {
            r6 = this;
            boolean r0 = r6.mo2840h()
            if (r0 == 0) goto L43
            f4.v0 r0 = r6.f9398E
            f4.n1 r1 = r0.f9350a
            g5.r$a r0 = r0.f9351b
            java.lang.Object r0 = r0.f10415a
            f4.n1$b r2 = r6.f9410k
            r1.mo5090i(r0, r2)
            f4.v0 r0 = r6.f9398E
            long r1 = r0.f9352c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L31
            f4.n1 r0 = r0.f9350a
            int r1 = r6.mo2824F()
            f4.n1$d r2 = r6.f8943a
            f4.n1$d r0 = r0.m5343o(r1, r2)
            long r0 = r0.m5353a()
            goto L42
        L31:
            f4.n1$b r0 = r6.f9410k
            long r0 = r0.f9229c0
            long r0 = p371v5.C6552b0.m13307K(r0)
            f4.v0 r2 = r6.f9398E
            long r2 = r2.f9352c
            long r2 = p371v5.C6552b0.m13307K(r2)
            long r0 = r0 + r2
        L42:
            return r0
        L43:
            long r0 = r6.mo2834W()
            return r0
    }

    /* renamed from: l0 */
    public final android.util.Pair<java.lang.Object, java.lang.Long> m5453l0(p088f4.AbstractC2031n1 r7, int r8, long r9) {
            r6 = this;
            boolean r0 = r7.m5344r()
            if (r0 == 0) goto L17
            r6.f9399F = r8
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 != 0) goto L13
            r9 = 0
        L13:
            r6.f9400G = r9
            r7 = 0
            return r7
        L17:
            r0 = -1
            if (r8 == r0) goto L20
            int r0 = r7.mo5180q()
            if (r8 < r0) goto L30
        L20:
            boolean r8 = r6.f9421v
            int r8 = r7.mo5085b(r8)
            f4.n1$d r9 = r6.f8943a
            f4.n1$d r9 = r7.m5343o(r8, r9)
            long r9 = r9.m5353a()
        L30:
            r3 = r8
            f4.n1$d r1 = r6.f8943a
            f4.n1$b r2 = r6.f9410k
            long r4 = p371v5.C6552b0.m13297A(r9)
            r0 = r7
            android.util.Pair r7 = r0.m5341k(r1, r2, r3, r4)
            return r7
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: m */
    public long mo2848m() {
            r2 = this;
            f4.v0 r0 = r2.f9398E
            long r0 = r0.f9367r
            long r0 = p371v5.C6552b0.m13307K(r0)
            return r0
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: n */
    public int mo2850n() {
            r1 = this;
            f4.v0 r0 = r1.f9398E
            int r0 = r0.f9354e
            return r0
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: o */
    public void mo2852o() {
            r13 = this;
            f4.v0 r0 = r13.f9398E
            int r1 = r0.f9354e
            r2 = 1
            if (r1 == r2) goto L8
            return
        L8:
            r1 = 0
            f4.v0 r0 = r0.m5415e(r1)
            f4.n1 r1 = r0.f9350a
            boolean r1 = r1.m5344r()
            if (r1 == 0) goto L17
            r1 = 4
            goto L18
        L17:
            r1 = 2
        L18:
            f4.v0 r4 = r0.m5417g(r1)
            int r0 = r13.f9422w
            int r0 = r0 + r2
            r13.f9422w = r0
            f4.b0 r0 = r13.f9407h
            v5.m r0 = r0.f8812f0
            r1 = 0
            v5.m$a r0 = r0.mo13363k(r1)
            v5.x$b r0 = (p371v5.C6574x.b) r0
            r0.m13428b()
            r5 = 1
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 5
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = -1
            r3 = r13
            r3.m5461v0(r4, r5, r6, r7, r8, r9, r10, r12)
            return
    }

    /* renamed from: o0 */
    public final p088f4.C2050v0 m5454o0(p088f4.C2050v0 r20, p088f4.AbstractC2031n1 r21, android.util.Pair<java.lang.Object, java.lang.Long> r22) {
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = r22
            boolean r3 = r21.m5344r()
            r4 = 1
            if (r3 != 0) goto L12
            if (r2 == 0) goto L10
            goto L12
        L10:
            r3 = 0
            goto L13
        L12:
            r3 = 1
        L13:
            p371v5.C6549a.m13288b(r3)
            r3 = r20
            f4.n1 r5 = r3.f9350a
            f4.v0 r6 = r20.m5418h(r21)
            boolean r3 = r21.m5344r()
            if (r3 == 0) goto L4a
            g5.r$a r1 = p088f4.C2050v0.f9349t
            g5.r$a r1 = p088f4.C2050v0.f9349t
            long r2 = r0.f9400G
            long r12 = p371v5.C6552b0.m13297A(r2)
            r14 = 0
            g5.i0 r16 = p108g5.C2273i0.f10376b0
            s5.n r2 = r0.f9401b
            b9.a<java.lang.Object> r3 = p026b9.AbstractC0714n.f3979Z
            b9.n<java.lang.Object> r18 = p026b9.C0693c0.f3898c0
            r7 = r1
            r8 = r12
            r10 = r12
            r17 = r2
            f4.v0 r2 = r6.m5412b(r7, r8, r10, r12, r14, r16, r17, r18)
            f4.v0 r1 = r2.m5411a(r1)
            long r2 = r1.f9368s
            r1.f9366q = r2
            return r1
        L4a:
            g5.r$a r3 = r6.f9351b
            java.lang.Object r3 = r3.f10415a
            int r7 = p371v5.C6552b0.f25624a
            java.lang.Object r7 = r2.first
            boolean r7 = r3.equals(r7)
            r7 = r7 ^ r4
            if (r7 == 0) goto L61
            g5.r$a r8 = new g5.r$a
            java.lang.Object r9 = r2.first
            r8.<init>(r9)
            goto L63
        L61:
            g5.r$a r8 = r6.f9351b
        L63:
            r14 = r8
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r12 = r2.longValue()
            long r8 = r19.mo2846l()
            long r8 = p371v5.C6552b0.m13297A(r8)
            boolean r2 = r5.m5344r()
            if (r2 != 0) goto L83
            f4.n1$b r2 = r0.f9410k
            f4.n1$b r2 = r5.mo5090i(r3, r2)
            long r2 = r2.f9229c0
            long r8 = r8 - r2
        L83:
            if (r7 != 0) goto L12b
            int r2 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r2 >= 0) goto L8b
            goto L12b
        L8b:
            if (r2 != 0) goto Lf0
            g5.r$a r2 = r6.f9360k
            java.lang.Object r2 = r2.f10415a
            int r2 = r1.mo5086c(r2)
            r3 = -1
            if (r2 == r3) goto Lac
            f4.n1$b r3 = r0.f9410k
            f4.n1$b r2 = r1.m5340g(r2, r3)
            int r2 = r2.f9227a0
            java.lang.Object r3 = r14.f10415a
            f4.n1$b r4 = r0.f9410k
            f4.n1$b r3 = r1.mo5090i(r3, r4)
            int r3 = r3.f9227a0
            if (r2 == r3) goto L161
        Lac:
            java.lang.Object r2 = r14.f10415a
            f4.n1$b r3 = r0.f9410k
            r1.mo5090i(r2, r3)
            boolean r1 = r14.m6028a()
            if (r1 == 0) goto Lc4
            f4.n1$b r1 = r0.f9410k
            int r2 = r14.f10416b
            int r3 = r14.f10417c
            long r1 = r1.m5346a(r2, r3)
            goto Lc8
        Lc4:
            f4.n1$b r1 = r0.f9410k
            long r1 = r1.f9228b0
        Lc8:
            long r8 = r6.f9368s
            long r10 = r6.f9368s
            long r12 = r6.f9353d
            long r3 = r6.f9368s
            long r3 = r1 - r3
            g5.i0 r5 = r6.f9357h
            s5.n r15 = r6.f9358i
            java.util.List<y4.a> r7 = r6.f9359j
            r18 = r7
            r7 = r14
            r20 = r1
            r1 = r14
            r2 = r15
            r14 = r3
            r16 = r5
            r17 = r2
            f4.v0 r2 = r6.m5412b(r7, r8, r10, r12, r14, r16, r17, r18)
            f4.v0 r1 = r2.m5411a(r1)
            r6 = r1
            r1 = r20
            goto L128
        Lf0:
            r1 = r14
            boolean r2 = r1.m6028a()
            r2 = r2 ^ r4
            p371v5.C6549a.m13291e(r2)
            r2 = 0
            long r4 = r6.f9367r
            long r7 = r12 - r8
            long r4 = r4 - r7
            long r14 = java.lang.Math.max(r2, r4)
            long r2 = r6.f9366q
            g5.r$a r4 = r6.f9360k
            g5.r$a r5 = r6.f9351b
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L112
            long r2 = r12 + r14
        L112:
            g5.i0 r4 = r6.f9357h
            s5.n r5 = r6.f9358i
            java.util.List<y4.a> r10 = r6.f9359j
            r7 = r1
            r8 = r12
            r1 = r10
            r10 = r12
            r16 = r4
            r17 = r5
            r18 = r1
            f4.v0 r1 = r6.m5412b(r7, r8, r10, r12, r14, r16, r17, r18)
            r6 = r1
            r1 = r2
        L128:
            r6.f9366q = r1
            goto L161
        L12b:
            r1 = r14
            boolean r2 = r1.m6028a()
            r2 = r2 ^ r4
            p371v5.C6549a.m13291e(r2)
            r14 = 0
            if (r7 == 0) goto L13b
            g5.i0 r2 = p108g5.C2273i0.f10376b0
            goto L13d
        L13b:
            g5.i0 r2 = r6.f9357h
        L13d:
            r16 = r2
            if (r7 == 0) goto L144
            s5.n r2 = r0.f9401b
            goto L146
        L144:
            s5.n r2 = r6.f9358i
        L146:
            r17 = r2
            if (r7 == 0) goto L14f
            b9.a<java.lang.Object> r2 = p026b9.AbstractC0714n.f3979Z
            b9.n<java.lang.Object> r2 = p026b9.C0693c0.f3898c0
            goto L151
        L14f:
            java.util.List<y4.a> r2 = r6.f9359j
        L151:
            r18 = r2
            r7 = r1
            r8 = r12
            r10 = r12
            r2 = r12
            f4.v0 r4 = r6.m5412b(r7, r8, r10, r12, r14, r16, r17, r18)
            f4.v0 r6 = r4.m5411a(r1)
            r6.f9366q = r2
        L161:
            return r6
    }

    /* renamed from: p0 */
    public final long m5455p0(p088f4.AbstractC2031n1 r2, p108g5.InterfaceC2283r.a r3, long r4) {
            r1 = this;
            java.lang.Object r3 = r3.f10415a
            f4.n1$b r0 = r1.f9410k
            r2.mo5090i(r3, r0)
            f4.n1$b r2 = r1.f9410k
            long r2 = r2.f9229c0
            long r4 = r4 + r2
            return r4
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: q */
    public void mo2855q(int r5) {
            r4 = this;
            int r0 = r4.f9420u
            if (r0 == r5) goto L2b
            r4.f9420u = r5
            f4.b0 r0 = r4.f9407h
            v5.m r0 = r0.f8812f0
            r1 = 11
            r2 = 0
            v5.m$a r0 = r0.mo13354b(r1, r5, r2)
            v5.x$b r0 = (p371v5.C6574x.b) r0
            r0.m13428b()
            v5.n<f4.x0$c> r0 = r4.f9408i
            r1 = 8
            k1.f r2 = new k1.f
            r3 = 1
            r2.<init>(r5, r3)
            r0.m13365b(r1, r2)
            r4.m5460u0()
            v5.n<f4.x0$c> r5 = r4.f9408i
            r5.m13364a()
        L2b:
            return
    }

    /* renamed from: q0 */
    public final p088f4.C2050v0 m5456q0(int r22, int r23) {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r4 = 1
            if (r1 < 0) goto L15
            if (r2 < r1) goto L15
            java.util.List<f4.z$a> r5 = r0.f9411l
            int r5 = r5.size()
            if (r2 > r5) goto L15
            r5 = 1
            goto L16
        L15:
            r5 = 0
        L16:
            p371v5.C6549a.m13288b(r5)
            int r5 = r21.mo2824F()
            f4.v0 r6 = r0.f9398E
            f4.n1 r6 = r6.f9350a
            java.util.List<f4.z$a> r7 = r0.f9411l
            int r14 = r7.size()
            int r7 = r0.f9422w
            int r7 = r7 + r4
            r0.f9422w = r7
            r21.m5457r0(r22, r23)
            f4.b1 r15 = new f4.b1
            java.util.List<f4.z$a> r7 = r0.f9411l
            g5.e0 r8 = r0.f9394A
            r15.<init>(r7, r8)
            f4.v0 r13 = r0.f9398E
            long r7 = r21.mo2846l()
            boolean r9 = r6.m5344r()
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11 = -1
            if (r9 != 0) goto La1
            boolean r9 = r15.m5344r()
            if (r9 == 0) goto L51
            goto La1
        L51:
            int r10 = r21.mo2824F()
            f4.n1$d r9 = r0.f8943a
            f4.n1$b r12 = r0.f9410k
            long r18 = p371v5.C6552b0.m13297A(r7)
            r7 = r6
            r8 = r9
            r9 = r12
            r3 = -1
            r11 = r18
            android.util.Pair r7 = r7.m5341k(r8, r9, r10, r11)
            java.lang.Object r11 = r7.first
            int r8 = r15.mo5086c(r11)
            if (r8 == r3) goto L71
            r9 = r13
            goto Lc2
        L71:
            f4.n1$d r7 = r0.f8943a
            f4.n1$b r8 = r0.f9410k
            int r9 = r0.f9420u
            boolean r10 = r0.f9421v
            r12 = r6
            r6 = r13
            r13 = r15
            java.lang.Object r7 = p088f4.C1994b0.m5112N(r7, r8, r9, r10, r11, r12, r13)
            if (r7 == 0) goto L98
            f4.n1$b r3 = r0.f9410k
            r15.mo5090i(r7, r3)
            f4.n1$b r3 = r0.f9410k
            int r11 = r3.f9227a0
            f4.n1$d r3 = r0.f8943a
            f4.n1$d r3 = r15.m5343o(r11, r3)
            long r16 = r3.m5353a()
            r7 = r16
            goto L9b
        L98:
            r7 = r16
            r11 = -1
        L9b:
            android.util.Pair r7 = r0.m5453l0(r15, r11, r7)
            r9 = r6
            goto Lc2
        La1:
            r9 = r13
            r3 = -1
            boolean r6 = r6.m5344r()
            if (r6 != 0) goto Lb1
            boolean r6 = r15.m5344r()
            if (r6 == 0) goto Lb1
            r6 = 1
            goto Lb2
        Lb1:
            r6 = 0
        Lb2:
            if (r6 == 0) goto Lb6
            r11 = -1
            goto Lba
        Lb6:
            int r11 = r21.m5452k0()
        Lba:
            if (r6 == 0) goto Lbe
            r7 = r16
        Lbe:
            android.util.Pair r7 = r0.m5453l0(r15, r11, r7)
        Lc2:
            f4.v0 r3 = r0.m5454o0(r9, r15, r7)
            int r6 = r3.f9354e
            r7 = 4
            if (r6 == r4) goto Ldc
            if (r6 == r7) goto Ldc
            if (r1 >= r2) goto Ldc
            if (r2 != r14) goto Ldc
            f4.n1 r6 = r3.f9350a
            int r6 = r6.mo5180q()
            if (r5 < r6) goto Ldc
            r20 = 1
            goto Lde
        Ldc:
            r20 = 0
        Lde:
            if (r20 == 0) goto Le4
            f4.v0 r3 = r3.m5417g(r7)
        Le4:
            f4.b0 r4 = r0.f9407h
            g5.e0 r5 = r0.f9394A
            v5.m r4 = r4.f8812f0
            r6 = 20
            v5.m$a r1 = r4.mo13356d(r6, r1, r2, r5)
            v5.x$b r1 = (p371v5.C6574x.b) r1
            r1.m13428b()
            return r3
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: r */
    public void mo2857r(int r14, long r15) {
            r13 = this;
            r10 = r13
            r0 = r14
            r1 = r15
            f4.v0 r3 = r10.f9398E
            f4.n1 r3 = r3.f9350a
            if (r0 < 0) goto L87
            boolean r4 = r3.m5344r()
            if (r4 != 0) goto L15
            int r4 = r3.mo5180q()
            if (r0 >= r4) goto L87
        L15:
            int r4 = r10.f9422w
            r5 = 1
            int r4 = r4 + r5
            r10.f9422w = r4
            boolean r4 = r13.mo2840h()
            if (r4 == 0) goto L43
            java.lang.String r0 = "ExoPlayerImpl"
            java.lang.String r1 = "seekTo ignored because an ad is playing"
            android.util.Log.w(r0, r1)
            f4.b0$d r0 = new f4.b0$d
            f4.v0 r1 = r10.f9398E
            r0.<init>(r1)
            r0.m5178a(r5)
            f4.b0$e r1 = r10.f9406g
            f4.v r1 = (p088f4.C2049v) r1
            f4.z r1 = r1.f9348Z
            v5.m r2 = r1.f9405f
            a4.c r3 = new a4.c
            r3.<init>(r1, r0)
            r2.mo13362j(r3)
            return
        L43:
            f4.v0 r4 = r10.f9398E
            int r4 = r4.f9354e
            if (r4 != r5) goto L4a
            goto L4b
        L4a:
            r5 = 2
        L4b:
            int r9 = r13.mo2824F()
            f4.v0 r4 = r10.f9398E
            f4.v0 r4 = r4.m5417g(r5)
            android.util.Pair r5 = r13.m5453l0(r3, r14, r1)
            f4.v0 r4 = r13.m5454o0(r4, r3, r5)
            f4.b0 r5 = r10.f9407h
            long r1 = p371v5.C6552b0.m13297A(r15)
            v5.m r5 = r5.f8812f0
            f4.b0$g r6 = new f4.b0$g
            r6.<init>(r3, r14, r1)
            r0 = 3
            v5.m$a r0 = r5.mo13360h(r0, r6)
            v5.x$b r0 = (p371v5.C6574x.b) r0
            r0.m13428b()
            r2 = 0
            r3 = 1
            r5 = 1
            r6 = 1
            r7 = 1
            long r11 = r13.m5451j0(r4)
            r0 = r13
            r1 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r11
            r0.m5461v0(r1, r2, r3, r4, r5, r6, r7, r9)
            return
        L87:
            f4.g0 r4 = new f4.g0
            r4.<init>(r3, r14, r1)
            throw r4
    }

    /* renamed from: r0 */
    public final void m5457r0(int r3, int r4) {
            r2 = this;
            int r0 = r4 + (-1)
        L2:
            if (r0 < r3) goto Lc
            java.util.List<f4.z$a> r1 = r2.f9411l
            r1.remove(r0)
            int r0 = r0 + (-1)
            goto L2
        Lc:
            g5.e0 r0 = r2.f9394A
            g5.e0 r3 = r0.mo5997b(r3, r4)
            r2.f9394A = r3
            return
    }

    @Override // p088f4.InterfaceC2054x0
    public void release() {
            r8 = this;
            java.lang.String r0 = "ExoPlayerImpl"
            int r1 = java.lang.System.identityHashCode(r8)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.lang.String r2 = p371v5.C6552b0.f25628e
            java.util.HashSet<java.lang.String> r3 = p088f4.C1997c0.f8866a
            java.lang.Class<f4.c0> r3 = p088f4.C1997c0.class
            monitor-enter(r3)
            java.lang.String r4 = p088f4.C1997c0.f8867b     // Catch: java.lang.Throwable -> La6
            monitor-exit(r3)
            r3 = 36
            int r3 = p064e.C1489c.m4038a(r1, r3)
            int r3 = p064e.C1489c.m4038a(r2, r3)
            int r3 = p064e.C1489c.m4038a(r4, r3)
            java.lang.String r5 = "Release "
            java.lang.String r6 = " ["
            java.lang.String r7 = "ExoPlayerLib/2.16.1"
            java.lang.StringBuilder r1 = p064e.C1491e.m4040a(r3, r5, r1, r6, r7)
            java.lang.String r3 = "] ["
            java.lang.String r5 = "] ["
            p179k1.C3661s.m8090a(r1, r3, r2, r5, r4)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.i(r0, r1)
            f4.b0 r0 = r8.f9407h
            monitor-enter(r0)
            boolean r1 = r0.f8830x0     // Catch: java.lang.Throwable -> La3
            r2 = 1
            if (r1 != 0) goto L64
            android.os.HandlerThread r1 = r0.f8813g0     // Catch: java.lang.Throwable -> La3
            boolean r1 = r1.isAlive()     // Catch: java.lang.Throwable -> La3
            if (r1 != 0) goto L50
            goto L64
        L50:
            v5.m r1 = r0.f8812f0     // Catch: java.lang.Throwable -> La3
            r3 = 7
            r1.mo13355c(r3)     // Catch: java.lang.Throwable -> La3
            f4.u r1 = new f4.u     // Catch: java.lang.Throwable -> La3
            r1.<init>(r0)     // Catch: java.lang.Throwable -> La3
            long r3 = r0.f8826t0     // Catch: java.lang.Throwable -> La3
            r0.m5167o0(r1, r3)     // Catch: java.lang.Throwable -> La3
            boolean r1 = r0.f8830x0     // Catch: java.lang.Throwable -> La3
            monitor-exit(r0)
            goto L66
        L64:
            monitor-exit(r0)
            r1 = 1
        L66:
            if (r1 != 0) goto L74
            v5.n<f4.x0$c> r0 = r8.f9408i
            r1 = 10
            k1.c r3 = p179k1.C3644c.f16082d0
            r0.m13365b(r1, r3)
            r0.m13364a()
        L74:
            v5.n<f4.x0$c> r0 = r8.f9408i
            r0.m13366c()
            v5.m r0 = r8.f9405f
            r1 = 0
            r0.mo13361i(r1)
            g4.p r0 = r8.f9414o
            if (r0 == 0) goto L88
            u5.c r1 = r8.f9416q
            r1.mo12946g(r0)
        L88:
            f4.v0 r0 = r8.f9398E
            f4.v0 r0 = r0.m5417g(r2)
            r8.f9398E = r0
            g5.r$a r1 = r0.f9351b
            f4.v0 r0 = r0.m5411a(r1)
            r8.f9398E = r0
            long r1 = r0.f9368s
            r0.f9366q = r1
            f4.v0 r0 = r8.f9398E
            r1 = 0
            r0.f9367r = r1
            return
        La3:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        La6:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: s */
    public p088f4.InterfaceC2054x0.b mo2859s() {
            r1 = this;
            f4.x0$b r0 = r1.f9395B
            return r0
    }

    /* renamed from: s0 */
    public void m5458s0(boolean r11, int r12, int r13) {
            r10 = this;
            f4.v0 r2 = r10.f9398E
            boolean r3 = r2.f9361l
            if (r3 != r11) goto Lb
            int r3 = r2.f9362m
            if (r3 != r12) goto Lb
            return
        Lb:
            int r3 = r10.f9422w
            r4 = 1
            int r3 = r3 + r4
            r10.f9422w = r3
            f4.v0 r2 = r2.m5414d(r11, r12)
            f4.b0 r3 = r10.f9407h
            v5.m r3 = r3.f8812f0
            v5.m$a r0 = r3.mo13354b(r4, r11, r12)
            v5.x$b r0 = (p371v5.C6574x.b) r0
            r0.m13428b()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 5
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -1
            r0 = r10
            r1 = r2
            r2 = r3
            r3 = r13
            r0.m5461v0(r1, r2, r3, r4, r5, r6, r7, r9)
            return
    }

    @Override // p088f4.InterfaceC2054x0
    public void stop() {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.m5459t0(r1, r0)
            return
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: t */
    public long mo2861t() {
            r6 = this;
            boolean r0 = r6.mo2840h()
            if (r0 == 0) goto L20
            f4.v0 r0 = r6.f9398E
            g5.r$a r1 = r0.f9360k
            g5.r$a r0 = r0.f9351b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1b
            f4.v0 r0 = r6.f9398E
            long r0 = r0.f9366q
            long r0 = p371v5.C6552b0.m13307K(r0)
            goto L1f
        L1b:
            long r0 = r6.mo2828L()
        L1f:
            return r0
        L20:
            f4.v0 r0 = r6.f9398E
            f4.n1 r0 = r0.f9350a
            boolean r0 = r0.m5344r()
            if (r0 == 0) goto L2d
            long r0 = r6.f9400G
            goto L88
        L2d:
            f4.v0 r0 = r6.f9398E
            g5.r$a r1 = r0.f9360k
            long r1 = r1.f10418d
            g5.r$a r3 = r0.f9351b
            long r3 = r3.f10418d
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L4c
            f4.n1 r0 = r0.f9350a
            int r1 = r6.mo2824F()
            f4.n1$d r2 = r6.f8943a
            f4.n1$d r0 = r0.m5343o(r1, r2)
            long r0 = r0.m5354b()
            goto L88
        L4c:
            long r0 = r0.f9366q
            f4.v0 r2 = r6.f9398E
            g5.r$a r2 = r2.f9360k
            boolean r2 = r2.m6028a()
            if (r2 == 0) goto L7a
            f4.v0 r0 = r6.f9398E
            f4.n1 r1 = r0.f9350a
            g5.r$a r0 = r0.f9360k
            java.lang.Object r0 = r0.f10415a
            f4.n1$b r2 = r6.f9410k
            f4.n1$b r0 = r1.mo5090i(r0, r2)
            f4.v0 r1 = r6.f9398E
            g5.r$a r1 = r1.f9360k
            int r1 = r1.f10416b
            long r1 = r0.m5348c(r1)
            r3 = -9223372036854775808
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L79
            long r0 = r0.f9228b0
            goto L7a
        L79:
            r0 = r1
        L7a:
            f4.v0 r2 = r6.f9398E
            f4.n1 r3 = r2.f9350a
            g5.r$a r2 = r2.f9360k
            long r0 = r6.m5455p0(r3, r2, r0)
            long r0 = p371v5.C6552b0.m13307K(r0)
        L88:
            return r0
    }

    /* renamed from: t0 */
    public void m5459t0(boolean r13, p088f4.C2038q r14) {
            r12 = this;
            r0 = 0
            if (r13 == 0) goto L13
            java.util.List<f4.z$a> r13 = r12.f9411l
            int r13 = r13.size()
            f4.v0 r13 = r12.m5456q0(r0, r13)
            r1 = 0
            f4.v0 r13 = r13.m5415e(r1)
            goto L23
        L13:
            f4.v0 r13 = r12.f9398E
            g5.r$a r1 = r13.f9351b
            f4.v0 r13 = r13.m5411a(r1)
            long r1 = r13.f9368s
            r13.f9366q = r1
            r1 = 0
            r13.f9367r = r1
        L23:
            r1 = 1
            f4.v0 r13 = r13.m5417g(r1)
            if (r14 == 0) goto L2e
            f4.v0 r13 = r13.m5415e(r14)
        L2e:
            r3 = r13
            int r13 = r12.f9422w
            int r13 = r13 + r1
            r12.f9422w = r13
            f4.b0 r13 = r12.f9407h
            v5.m r13 = r13.f8812f0
            r14 = 6
            v5.m$a r13 = r13.mo13363k(r14)
            v5.x$b r13 = (p371v5.C6574x.b) r13
            r13.m13428b()
            f4.n1 r13 = r3.f9350a
            boolean r13 = r13.m5344r()
            if (r13 == 0) goto L56
            f4.v0 r13 = r12.f9398E
            f4.n1 r13 = r13.f9350a
            boolean r13 = r13.m5344r()
            if (r13 != 0) goto L56
            r7 = 1
            goto L57
        L56:
            r7 = 0
        L57:
            r4 = 0
            r5 = 1
            r6 = 0
            r8 = 4
            long r9 = r12.m5451j0(r3)
            r11 = -1
            r2 = r12
            r2.m5461v0(r3, r4, r5, r6, r7, r8, r9, r11)
            return
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: u */
    public boolean mo2862u() {
            r1 = this;
            f4.v0 r0 = r1.f9398E
            boolean r0 = r0.f9361l
            return r0
    }

    /* renamed from: u0 */
    public final void m5460u0() {
            r4 = this;
            f4.x0$b r0 = r4.f9395B
            f4.x0$b r1 = r4.f9402c
            f4.x0$b r1 = r4.m5229d(r1)
            r4.f9395B = r1
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L1d
            v5.n<f4.x0$c> r0 = r4.f9408i
            r1 = 13
            f4.v r2 = new f4.v
            r3 = 2
            r2.<init>(r4, r3)
            r0.m13365b(r1, r2)
        L1d:
            return
    }

    /* renamed from: v0 */
    public final void m5461v0(p088f4.C2050v0 r39, int r40, int r41, boolean r42, boolean r43, int r44, long r45, int r47) {
            r38 = this;
            r0 = r38
            r1 = r39
            r2 = r44
            f4.v0 r3 = r0.f9398E
            r0.f9398E = r1
            f4.n1 r4 = r3.f9350a
            f4.n1 r5 = r1.f9350a
            boolean r4 = r4.equals(r5)
            r5 = 1
            r4 = r4 ^ r5
            f4.n1 r6 = r3.f9350a
            f4.n1 r7 = r1.f9350a
            boolean r8 = r7.m5344r()
            r9 = -1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r12 = 0
            r13 = 3
            if (r8 == 0) goto L34
            boolean r8 = r6.m5344r()
            if (r8 == 0) goto L34
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.<init>(r6, r10)
            goto Lbe
        L34:
            boolean r8 = r7.m5344r()
            boolean r14 = r6.m5344r()
            if (r8 == r14) goto L4b
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            r4.<init>(r6, r7)
            goto Lbe
        L4b:
            g5.r$a r8 = r3.f9351b
            java.lang.Object r8 = r8.f10415a
            f4.n1$b r14 = r0.f9410k
            f4.n1$b r8 = r6.mo5090i(r8, r14)
            int r8 = r8.f9227a0
            f4.n1$d r14 = r0.f8943a
            f4.n1$d r6 = r6.m5343o(r8, r14)
            java.lang.Object r6 = r6.f9240Y
            g5.r$a r8 = r1.f9351b
            java.lang.Object r8 = r8.f10415a
            f4.n1$b r14 = r0.f9410k
            f4.n1$b r8 = r7.mo5090i(r8, r14)
            int r8 = r8.f9227a0
            f4.n1$d r14 = r0.f8943a
            f4.n1$d r7 = r7.m5343o(r8, r14)
            java.lang.Object r7 = r7.f9240Y
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L9b
            if (r43 == 0) goto L7f
            if (r2 != 0) goto L7f
            r4 = 1
            goto L88
        L7f:
            if (r43 == 0) goto L85
            if (r2 != r5) goto L85
            r4 = 2
            goto L88
        L85:
            if (r4 == 0) goto L95
            r4 = 3
        L88:
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.<init>(r7, r4)
            r4 = r6
            goto Lbe
        L95:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L9b:
            if (r43 == 0) goto Lb7
            if (r2 != 0) goto Lb7
            g5.r$a r4 = r3.f9351b
            long r6 = r4.f10418d
            g5.r$a r4 = r1.f9351b
            long r14 = r4.f10418d
            int r4 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r4 >= 0) goto Lb7
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r4.<init>(r6, r7)
            goto Lbe
        Lb7:
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.<init>(r6, r10)
        Lbe:
            java.lang.Object r6 = r4.first
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            f4.k0 r7 = r0.f9396C
            if (r6 == 0) goto Lf9
            f4.n1 r10 = r1.f9350a
            boolean r10 = r10.m5344r()
            if (r10 != 0) goto Lf3
            f4.n1 r10 = r1.f9350a
            g5.r$a r14 = r1.f9351b
            java.lang.Object r14 = r14.f10415a
            f4.n1$b r15 = r0.f9410k
            f4.n1$b r10 = r10.mo5090i(r14, r15)
            int r10 = r10.f9227a0
            f4.n1 r14 = r1.f9350a
            f4.n1$d r15 = r0.f8943a
            f4.n1$d r10 = r14.m5343o(r10, r15)
            f4.j0 r10 = r10.f9242a0
            goto Lf4
        Lf3:
            r10 = 0
        Lf4:
            f4.k0 r14 = p088f4.C2021k0.f9094F0
            r0.f9397D = r14
            goto Lfa
        Lf9:
            r10 = 0
        Lfa:
            if (r6 != 0) goto L106
            java.util.List<y4.a> r14 = r3.f9359j
            java.util.List<y4.a> r15 = r1.f9359j
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L139
        L106:
            f4.k0 r7 = r0.f9397D
            f4.k0$b r7 = r7.m5311a()
            java.util.List<y4.a> r14 = r1.f9359j
            r15 = 0
        L10f:
            int r8 = r14.size()
            if (r15 >= r8) goto L12f
            java.lang.Object r8 = r14.get(r15)
            y4.a r8 = (p427y4.C7110a) r8
            r13 = 0
        L11c:
            y4.a$b[] r11 = r8.f27506Y
            int r9 = r11.length
            if (r13 >= r9) goto L12a
            r9 = r11[r13]
            r9.mo32p(r7)
            int r13 = r13 + 1
            r9 = -1
            goto L11c
        L12a:
            int r15 = r15 + 1
            r9 = -1
            r13 = 3
            goto L10f
        L12f:
            f4.k0 r7 = r7.m5312a()
            r0.f9397D = r7
            f4.k0 r7 = r38.m5449h0()
        L139:
            f4.k0 r8 = r0.f9396C
            boolean r8 = r7.equals(r8)
            r8 = r8 ^ r5
            r0.f9396C = r7
            f4.n1 r7 = r3.f9350a
            f4.n1 r9 = r1.f9350a
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L158
            v5.n<f4.x0$c> r7 = r0.f9408i
            f4.x r9 = new f4.x
            r11 = r40
            r9.<init>(r1, r11, r12)
            r7.m13365b(r12, r9)
        L158:
            if (r43 == 0) goto L280
            f4.n1$b r7 = new f4.n1$b
            r7.<init>()
            f4.n1 r9 = r3.f9350a
            boolean r9 = r9.m5344r()
            if (r9 != 0) goto L191
            g5.r$a r9 = r3.f9351b
            java.lang.Object r9 = r9.f10415a
            f4.n1 r11 = r3.f9350a
            r11.mo5090i(r9, r7)
            int r11 = r7.f9227a0
            f4.n1 r13 = r3.f9350a
            int r13 = r13.mo5086c(r9)
            f4.n1 r14 = r3.f9350a
            f4.n1$d r15 = r0.f8943a
            f4.n1$d r14 = r14.m5343o(r11, r15)
            java.lang.Object r14 = r14.f9240Y
            f4.n1$d r15 = r0.f8943a
            f4.j0 r15 = r15.f9242a0
            r20 = r9
            r18 = r11
            r21 = r13
            r17 = r14
            r19 = r15
            goto L19b
        L191:
            r18 = r47
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = -1
        L19b:
            if (r2 != 0) goto L1ce
            long r13 = r7.f9229c0
            r11 = r6
            long r5 = r7.f9228b0
            long r13 = r13 + r5
            g5.r$a r5 = r3.f9351b
            boolean r5 = r5.m6028a()
            if (r5 == 0) goto L1b6
            g5.r$a r5 = r3.f9351b
            int r6 = r5.f10416b
            int r5 = r5.f10417c
            long r5 = r7.m5346a(r6, r5)
            goto L1d9
        L1b6:
            g5.r$a r5 = r3.f9351b
            int r5 = r5.f10419e
            r6 = -1
            if (r5 == r6) goto L1e3
            f4.v0 r5 = r0.f9398E
            g5.r$a r5 = r5.f9351b
            boolean r5 = r5.m6028a()
            if (r5 == 0) goto L1e3
            f4.v0 r5 = r0.f9398E
            long r13 = m5446m0(r5)
            goto L1e3
        L1ce:
            r11 = r6
            g5.r$a r5 = r3.f9351b
            boolean r5 = r5.m6028a()
            if (r5 == 0) goto L1de
            long r5 = r3.f9368s
        L1d9:
            long r13 = m5446m0(r3)
            goto L1e4
        L1de:
            long r5 = r7.f9229c0
            long r13 = r3.f9368s
            long r13 = r13 + r5
        L1e3:
            r5 = r13
        L1e4:
            f4.x0$f r7 = new f4.x0$f
            long r22 = p371v5.C6552b0.m13307K(r5)
            long r24 = p371v5.C6552b0.m13307K(r13)
            g5.r$a r5 = r3.f9351b
            int r6 = r5.f10416b
            int r5 = r5.f10417c
            r16 = r7
            r26 = r6
            r27 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r24, r26, r27)
            int r5 = r38.mo2824F()
            f4.v0 r6 = r0.f9398E
            f4.n1 r6 = r6.f9350a
            boolean r6 = r6.m5344r()
            if (r6 != 0) goto L239
            f4.v0 r6 = r0.f9398E
            g5.r$a r13 = r6.f9351b
            java.lang.Object r13 = r13.f10415a
            f4.n1 r6 = r6.f9350a
            f4.n1$b r14 = r0.f9410k
            r6.mo5090i(r13, r14)
            f4.v0 r6 = r0.f9398E
            f4.n1 r6 = r6.f9350a
            int r6 = r6.mo5086c(r13)
            f4.v0 r14 = r0.f9398E
            f4.n1 r14 = r14.f9350a
            f4.n1$d r15 = r0.f8943a
            f4.n1$d r14 = r14.m5343o(r5, r15)
            java.lang.Object r14 = r14.f9240Y
            f4.n1$d r15 = r0.f8943a
            f4.j0 r15 = r15.f9242a0
            r31 = r6
            r30 = r13
            r27 = r14
            r29 = r15
            goto L241
        L239:
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = -1
        L241:
            long r32 = p371v5.C6552b0.m13307K(r45)
            f4.x0$f r6 = new f4.x0$f
            f4.v0 r13 = r0.f9398E
            g5.r$a r13 = r13.f9351b
            boolean r13 = r13.m6028a()
            if (r13 == 0) goto L25e
            f4.v0 r13 = r0.f9398E
            long r13 = m5446m0(r13)
            long r13 = p371v5.C6552b0.m13307K(r13)
            r34 = r13
            goto L260
        L25e:
            r34 = r32
        L260:
            f4.v0 r13 = r0.f9398E
            g5.r$a r13 = r13.f9351b
            int r14 = r13.f10416b
            int r13 = r13.f10417c
            r26 = r6
            r28 = r5
            r36 = r14
            r37 = r13
            r26.<init>(r27, r28, r29, r30, r31, r32, r34, r36, r37)
            v5.n<f4.x0$c> r5 = r0.f9408i
            r13 = 11
            a4.e r14 = new a4.e
            r14.<init>(r2, r7, r6)
            r5.m13365b(r13, r14)
            goto L281
        L280:
            r11 = r6
        L281:
            if (r11 == 0) goto L28e
            v5.n<f4.x0$c> r2 = r0.f9408i
            f4.x r5 = new f4.x
            r5.<init>(r10, r4)
            r4 = 1
            r2.m13365b(r4, r5)
        L28e:
            f4.q r2 = r3.f9355f
            f4.q r4 = r1.f9355f
            r5 = 5
            r6 = 4
            if (r2 == r4) goto L2b0
            v5.n<f4.x0$c> r2 = r0.f9408i
            f4.w r4 = new f4.w
            r4.<init>(r1, r6)
            r7 = 10
            r2.m13365b(r7, r4)
            f4.q r2 = r1.f9355f
            if (r2 == 0) goto L2b0
            v5.n<f4.x0$c> r2 = r0.f9408i
            f4.w r4 = new f4.w
            r4.<init>(r1, r5)
            r2.m13365b(r7, r4)
        L2b0:
            s5.n r2 = r3.f9358i
            s5.n r4 = r1.f9358i
            r7 = 6
            if (r2 == r4) goto L2dc
            s5.m r2 = r0.f9404e
            java.lang.Object r4 = r4.f23072e
            r2.mo12436a(r4)
            s5.j r2 = new s5.j
            s5.n r4 = r1.f9358i
            s5.f[] r4 = r4.f23070c
            r2.<init>(r4)
            v5.n<f4.x0$c> r4 = r0.f9408i
            f1.g0 r10 = new f1.g0
            r10.<init>(r1, r2)
            r2 = 2
            r4.m13365b(r2, r10)
            v5.n<f4.x0$c> r4 = r0.f9408i
            f4.w r10 = new f4.w
            r10.<init>(r1, r7)
            r4.m13365b(r2, r10)
        L2dc:
            if (r8 == 0) goto L2ec
            f4.k0 r2 = r0.f9396C
            v5.n<f4.x0$c> r4 = r0.f9408i
            r8 = 14
            u3.b r10 = new u3.b
            r10.<init>(r2)
            r4.m13365b(r8, r10)
        L2ec:
            boolean r2 = r3.f9356g
            boolean r4 = r1.f9356g
            r8 = 7
            if (r2 == r4) goto L2fe
            v5.n<f4.x0$c> r2 = r0.f9408i
            f4.w r4 = new f4.w
            r4.<init>(r1, r8)
            r10 = 3
            r2.m13365b(r10, r4)
        L2fe:
            int r2 = r3.f9354e
            int r4 = r1.f9354e
            if (r2 != r4) goto L30a
            boolean r2 = r3.f9361l
            boolean r4 = r1.f9361l
            if (r2 == r4) goto L317
        L30a:
            v5.n<f4.x0$c> r2 = r0.f9408i
            f4.w r4 = new f4.w
            r10 = 8
            r4.<init>(r1, r10)
            r10 = -1
            r2.m13365b(r10, r4)
        L317:
            int r2 = r3.f9354e
            int r4 = r1.f9354e
            if (r2 == r4) goto L327
            v5.n<f4.x0$c> r2 = r0.f9408i
            f4.w r4 = new f4.w
            r4.<init>(r1, r12)
            r2.m13365b(r6, r4)
        L327:
            boolean r2 = r3.f9361l
            boolean r4 = r1.f9361l
            if (r2 == r4) goto L33b
            v5.n<f4.x0$c> r2 = r0.f9408i
            f4.x r4 = new f4.x
            r6 = r41
            r9 = 1
            r4.<init>(r1, r6, r9)
            r2.m13365b(r5, r4)
            goto L33c
        L33b:
            r9 = 1
        L33c:
            int r2 = r3.f9362m
            int r4 = r1.f9362m
            if (r2 == r4) goto L34c
            v5.n<f4.x0$c> r2 = r0.f9408i
            f4.w r4 = new f4.w
            r4.<init>(r1, r9)
            r2.m13365b(r7, r4)
        L34c:
            boolean r2 = m5447n0(r3)
            boolean r4 = m5447n0(r39)
            if (r2 == r4) goto L361
            v5.n<f4.x0$c> r2 = r0.f9408i
            f4.w r4 = new f4.w
            r5 = 2
            r4.<init>(r1, r5)
            r2.m13365b(r8, r4)
        L361:
            f4.w0 r2 = r3.f9363n
            f4.w0 r4 = r1.f9363n
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L378
            v5.n<f4.x0$c> r2 = r0.f9408i
            r4 = 12
            f4.w r5 = new f4.w
            r6 = 3
            r5.<init>(r1, r6)
            r2.m13365b(r4, r5)
        L378:
            if (r42 == 0) goto L382
            v5.n<f4.x0$c> r2 = r0.f9408i
            k1.d r4 = p179k1.C3646d.f16115d0
            r5 = -1
            r2.m13365b(r5, r4)
        L382:
            r38.m5460u0()
            v5.n<f4.x0$c> r2 = r0.f9408i
            r2.m13364a()
            boolean r2 = r3.f9364o
            boolean r4 = r1.f9364o
            if (r2 == r4) goto L3a8
            java.util.concurrent.CopyOnWriteArraySet<f4.s$a> r2 = r0.f9409j
            java.util.Iterator r2 = r2.iterator()
        L396:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L3a8
            java.lang.Object r4 = r2.next()
            f4.s$a r4 = (p088f4.InterfaceC2043s.a) r4
            boolean r5 = r1.f9364o
            r4.mo5301p(r5)
            goto L396
        L3a8:
            boolean r2 = r3.f9365p
            boolean r3 = r1.f9365p
            if (r2 == r3) goto L3c6
            java.util.concurrent.CopyOnWriteArraySet<f4.s$a> r2 = r0.f9409j
            java.util.Iterator r2 = r2.iterator()
        L3b4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3c6
            java.lang.Object r3 = r2.next()
            f4.s$a r3 = (p088f4.InterfaceC2043s.a) r3
            boolean r4 = r1.f9365p
            r3.mo5304s(r4)
            goto L3b4
        L3c6:
            return
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: x */
    public void mo2863x(boolean r5) {
            r4 = this;
            boolean r0 = r4.f9421v
            if (r0 == r5) goto L2a
            r4.f9421v = r5
            f4.b0 r0 = r4.f9407h
            v5.m r0 = r0.f8812f0
            r1 = 12
            r2 = 0
            v5.m$a r0 = r0.mo13354b(r1, r5, r2)
            v5.x$b r0 = (p371v5.C6574x.b) r0
            r0.m13428b()
            v5.n<f4.x0$c> r0 = r4.f9408i
            r1 = 9
            f4.y r3 = new f4.y
            r3.<init>(r5, r2)
            r0.m13365b(r1, r3)
            r4.m5460u0()
            v5.n<f4.x0$c> r5 = r4.f9408i
            r5.m13364a()
        L2a:
            return
    }

    @Override // p088f4.InterfaceC2054x0
    @java.lang.Deprecated
    /* renamed from: y */
    public void mo2864y(boolean r2) {
            r1 = this;
            r0 = 0
            r1.m5459t0(r2, r0)
            return
    }

    @Override // p088f4.InterfaceC2054x0
    /* renamed from: z */
    public long mo2865z() {
            r2 = this;
            r0 = 3000(0xbb8, double:1.482E-320)
            return r0
    }
}
