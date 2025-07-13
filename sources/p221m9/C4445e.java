package p221m9;

/* renamed from: m9.e */
/* loaded from: classes.dex */
public final class C4445e {

    /* renamed from: m9.e$a */
    public static final class a {

        /* renamed from: a */
        public int f18122a;

        /* renamed from: b */
        public long f18123b;

        /* renamed from: c */
        public java.lang.Object f18124c;

        /* renamed from: d */
        public final p221m9.C4478p f18125d;

        public a(p221m9.C4478p r1) {
                r0 = this;
                r0.<init>()
                java.util.Objects.requireNonNull(r1)
                r0.f18125d = r1
                return
        }
    }

    /* renamed from: a */
    public static int m9958a(byte[] r2, int r3, p221m9.C4445e.a r4) {
            int r3 = m9977t(r2, r3, r4)
            int r0 = r4.f18122a
            if (r0 < 0) goto L20
            int r1 = r2.length
            int r1 = r1 - r3
            if (r0 > r1) goto L1b
            if (r0 != 0) goto L13
            m9.h r2 = p221m9.AbstractC4454h.f18139Z
            r4.f18124c = r2
            return r3
        L13:
            m9.h r2 = p221m9.AbstractC4454h.m10054i(r2, r3, r0)
            r4.f18124c = r2
            int r3 = r3 + r0
            return r3
        L1b:
            m9.a0 r2 = p221m9.C4434a0.m9902h()
            throw r2
        L20:
            m9.a0 r2 = p221m9.C4434a0.m9900f()
            throw r2
    }

    /* renamed from: b */
    public static int m9959b(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    /* renamed from: c */
    public static long m9960c(byte[] r7, int r8) {
            r0 = r7[r8]
            long r0 = (long) r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            int r4 = r8 + 1
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 8
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 2
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 16
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 3
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 24
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 4
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 32
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 5
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 40
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 6
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 48
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r8 = r8 + 7
            r7 = r7[r8]
            long r7 = (long) r7
            long r7 = r7 & r2
            r2 = 56
            long r7 = r7 << r2
            long r7 = r7 | r0
            return r7
    }

    /* renamed from: d */
    public static int m9961d(p221m9.InterfaceC4447e1 r8, byte[] r9, int r10, int r11, int r12, p221m9.C4445e.a r13) {
            m9.t0 r8 = (p221m9.C4491t0) r8
            java.lang.Object r7 = r8.mo9993h()
            r0 = r8
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            int r9 = r0.m10333J(r1, r2, r3, r4, r5, r6)
            r8.mo9989d(r7)
            r13.f18124c = r7
            return r9
    }

    /* renamed from: e */
    public static int m9962e(p221m9.InterfaceC4447e1 r6, byte[] r7, int r8, int r9, p221m9.C4445e.a r10) {
            int r0 = r8 + 1
            r8 = r7[r8]
            if (r8 >= 0) goto Lc
            int r0 = m9976s(r8, r7, r0, r10)
            int r8 = r10.f18122a
        Lc:
            r3 = r0
            if (r8 < 0) goto L25
            int r9 = r9 - r3
            if (r8 > r9) goto L25
            java.lang.Object r9 = r6.mo9993h()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo9988c(r1, r2, r3, r4, r5)
            r6.mo9989d(r9)
            r10.f18124c = r9
            return r8
        L25:
            m9.a0 r6 = p221m9.C4434a0.m9902h()
            throw r6
    }

    /* renamed from: f */
    public static int m9963f(p221m9.InterfaceC4447e1<?> r2, int r3, byte[] r4, int r5, int r6, p221m9.C4505z.c<?> r7, p221m9.C4445e.a r8) {
            int r5 = m9962e(r2, r4, r5, r6, r8)
        L4:
            java.lang.Object r0 = r8.f18124c
            r7.add(r0)
            if (r5 >= r6) goto L19
            int r0 = m9977t(r4, r5, r8)
            int r1 = r8.f18122a
            if (r3 == r1) goto L14
            goto L19
        L14:
            int r5 = m9962e(r2, r4, r0, r6, r8)
            goto L4
        L19:
            return r5
    }

    /* renamed from: g */
    public static int m9964g(byte[] r6, int r7, p221m9.C4505z.c<?> r8, p221m9.C4445e.a r9) {
            m9.f r8 = (p221m9.C4448f) r8
            int r7 = m9977t(r6, r7, r9)
            int r0 = r9.f18122a
            int r0 = r0 + r7
        L9:
            if (r7 >= r0) goto L1e
            int r7 = m9979v(r6, r7, r9)
            long r1 = r9.f18123b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L19
            r1 = 1
            goto L1a
        L19:
            r1 = 0
        L1a:
            r8.m9996e(r1)
            goto L9
        L1e:
            if (r7 != r0) goto L21
            return r7
        L21:
            m9.a0 r6 = p221m9.C4434a0.m9902h()
            throw r6
    }

    /* renamed from: h */
    public static int m9965h(byte[] r2, int r3, p221m9.C4505z.c<?> r4, p221m9.C4445e.a r5) {
            m9.m r4 = (p221m9.C4469m) r4
            int r3 = m9977t(r2, r3, r5)
            int r5 = r5.f18122a
            int r5 = r5 + r3
        L9:
            if (r3 >= r5) goto L19
            long r0 = m9960c(r2, r3)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            r4.m10195e(r0)
            int r3 = r3 + 8
            goto L9
        L19:
            if (r3 != r5) goto L1c
            return r3
        L1c:
            m9.a0 r2 = p221m9.C4434a0.m9902h()
            throw r2
    }

    /* renamed from: i */
    public static int m9966i(byte[] r1, int r2, p221m9.C4505z.c<?> r3, p221m9.C4445e.a r4) {
            m9.y r3 = (p221m9.C4503y) r3
            int r2 = m9977t(r1, r2, r4)
            int r4 = r4.f18122a
            int r4 = r4 + r2
        L9:
            if (r2 >= r4) goto L15
            int r0 = m9959b(r1, r2)
            r3.m10381e(r0)
            int r2 = r2 + 4
            goto L9
        L15:
            if (r2 != r4) goto L18
            return r2
        L18:
            m9.a0 r1 = p221m9.C4434a0.m9902h()
            throw r1
    }

    /* renamed from: j */
    public static int m9967j(byte[] r2, int r3, p221m9.C4505z.c<?> r4, p221m9.C4445e.a r5) {
            m9.h0 r4 = (p221m9.C4455h0) r4
            int r3 = m9977t(r2, r3, r5)
            int r5 = r5.f18122a
            int r5 = r5 + r3
        L9:
            if (r3 >= r5) goto L15
            long r0 = m9960c(r2, r3)
            r4.m10067e(r0)
            int r3 = r3 + 8
            goto L9
        L15:
            if (r3 != r5) goto L18
            return r3
        L18:
            m9.a0 r2 = p221m9.C4434a0.m9902h()
            throw r2
    }

    /* renamed from: k */
    public static int m9968k(byte[] r1, int r2, p221m9.C4505z.c<?> r3, p221m9.C4445e.a r4) {
            m9.v r3 = (p221m9.C4496v) r3
            int r2 = m9977t(r1, r2, r4)
            int r4 = r4.f18122a
            int r4 = r4 + r2
        L9:
            if (r2 >= r4) goto L19
            int r0 = m9959b(r1, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r3.m10362e(r0)
            int r2 = r2 + 4
            goto L9
        L19:
            if (r2 != r4) goto L1c
            return r2
        L1c:
            m9.a0 r1 = p221m9.C4434a0.m9902h()
            throw r1
    }

    /* renamed from: l */
    public static int m9969l(byte[] r2, int r3, p221m9.C4505z.c<?> r4, p221m9.C4445e.a r5) {
            m9.y r4 = (p221m9.C4503y) r4
            int r3 = m9977t(r2, r3, r5)
            int r0 = r5.f18122a
            int r0 = r0 + r3
        L9:
            if (r3 >= r0) goto L19
            int r3 = m9977t(r2, r3, r5)
            int r1 = r5.f18122a
            int r1 = p221m9.AbstractC4457i.m10072b(r1)
            r4.m10381e(r1)
            goto L9
        L19:
            if (r3 != r0) goto L1c
            return r3
        L1c:
            m9.a0 r2 = p221m9.C4434a0.m9902h()
            throw r2
    }

    /* renamed from: m */
    public static int m9970m(byte[] r3, int r4, p221m9.C4505z.c<?> r5, p221m9.C4445e.a r6) {
            m9.h0 r5 = (p221m9.C4455h0) r5
            int r4 = m9977t(r3, r4, r6)
            int r0 = r6.f18122a
            int r0 = r0 + r4
        L9:
            if (r4 >= r0) goto L19
            int r4 = m9979v(r3, r4, r6)
            long r1 = r6.f18123b
            long r1 = p221m9.AbstractC4457i.m10073c(r1)
            r5.m10067e(r1)
            goto L9
        L19:
            if (r4 != r0) goto L1c
            return r4
        L1c:
            m9.a0 r3 = p221m9.C4434a0.m9902h()
            throw r3
    }

    /* renamed from: n */
    public static int m9971n(byte[] r2, int r3, p221m9.C4505z.c<?> r4, p221m9.C4445e.a r5) {
            m9.y r4 = (p221m9.C4503y) r4
            int r3 = m9977t(r2, r3, r5)
            int r0 = r5.f18122a
            int r0 = r0 + r3
        L9:
            if (r3 >= r0) goto L15
            int r3 = m9977t(r2, r3, r5)
            int r1 = r5.f18122a
            r4.m10381e(r1)
            goto L9
        L15:
            if (r3 != r0) goto L18
            return r3
        L18:
            m9.a0 r2 = p221m9.C4434a0.m9902h()
            throw r2
    }

    /* renamed from: o */
    public static int m9972o(byte[] r3, int r4, p221m9.C4505z.c<?> r5, p221m9.C4445e.a r6) {
            m9.h0 r5 = (p221m9.C4455h0) r5
            int r4 = m9977t(r3, r4, r6)
            int r0 = r6.f18122a
            int r0 = r0 + r4
        L9:
            if (r4 >= r0) goto L15
            int r4 = m9979v(r3, r4, r6)
            long r1 = r6.f18123b
            r5.m10067e(r1)
            goto L9
        L15:
            if (r4 != r0) goto L18
            return r4
        L18:
            m9.a0 r3 = p221m9.C4434a0.m9902h()
            throw r3
    }

    /* renamed from: p */
    public static int m9973p(byte[] r3, int r4, p221m9.C4445e.a r5) {
            int r4 = m9977t(r3, r4, r5)
            int r0 = r5.f18122a
            if (r0 < 0) goto L1a
            if (r0 != 0) goto Lf
            java.lang.String r3 = ""
            r5.f18124c = r3
            return r4
        Lf:
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = p221m9.C4505z.f18308a
            r1.<init>(r3, r4, r0, r2)
            r5.f18124c = r1
            int r4 = r4 + r0
            return r4
        L1a:
            m9.a0 r3 = p221m9.C4434a0.m9900f()
            throw r3
    }

    /* renamed from: q */
    public static int m9974q(byte[] r2, int r3, p221m9.C4445e.a r4) {
            int r3 = m9977t(r2, r3, r4)
            int r0 = r4.f18122a
            if (r0 < 0) goto L19
            if (r0 != 0) goto Lf
            java.lang.String r2 = ""
            r4.f18124c = r2
            return r3
        Lf:
            m9.r1$b r1 = p221m9.C4486r1.f18221a
            java.lang.String r2 = r1.mo10291a(r2, r3, r0)
            r4.f18124c = r2
            int r3 = r3 + r0
            return r3
        L19:
            m9.a0 r2 = p221m9.C4434a0.m9900f()
            throw r2
    }

    /* renamed from: r */
    public static int m9975r(int r9, byte[] r10, int r11, int r12, p221m9.C4474n1 r13, p221m9.C4445e.a r14) {
            int r0 = r9 >>> 3
            if (r0 == 0) goto L96
            r0 = r9 & 7
            if (r0 == 0) goto L88
            r1 = 1
            if (r0 == r1) goto L7a
            r1 = 2
            if (r0 == r1) goto L56
            r1 = 3
            if (r0 == r1) goto L27
            r12 = 5
            if (r0 != r12) goto L22
            int r10 = m9959b(r10, r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r13.m10220c(r9, r10)
            int r11 = r11 + 4
            return r11
        L22:
            m9.a0 r9 = p221m9.C4434a0.m9896b()
            throw r9
        L27:
            m9.n1 r6 = p221m9.C4474n1.m10217b()
            r0 = r9 & (-8)
            r7 = r0 | 4
            r0 = 0
        L30:
            if (r11 >= r12) goto L49
            int r2 = m9977t(r10, r11, r14)
            int r11 = r14.f18122a
            r0 = r11
            if (r11 != r7) goto L3d
            r11 = r2
            goto L49
        L3d:
            r1 = r10
            r3 = r12
            r4 = r6
            r5 = r14
            int r0 = m9975r(r0, r1, r2, r3, r4, r5)
            r8 = r0
            r0 = r11
            r11 = r8
            goto L30
        L49:
            if (r11 > r12) goto L51
            if (r0 != r7) goto L51
            r13.m10220c(r9, r6)
            return r11
        L51:
            m9.a0 r9 = p221m9.C4434a0.m9901g()
            throw r9
        L56:
            int r11 = m9977t(r10, r11, r14)
            int r12 = r14.f18122a
            if (r12 < 0) goto L75
            int r14 = r10.length
            int r14 = r14 - r11
            if (r12 > r14) goto L70
            if (r12 != 0) goto L67
            m9.h r10 = p221m9.AbstractC4454h.f18139Z
            goto L6b
        L67:
            m9.h r10 = p221m9.AbstractC4454h.m10054i(r10, r11, r12)
        L6b:
            r13.m10220c(r9, r10)
            int r11 = r11 + r12
            return r11
        L70:
            m9.a0 r9 = p221m9.C4434a0.m9902h()
            throw r9
        L75:
            m9.a0 r9 = p221m9.C4434a0.m9900f()
            throw r9
        L7a:
            long r0 = m9960c(r10, r11)
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            r13.m10220c(r9, r10)
            int r11 = r11 + 8
            return r11
        L88:
            int r10 = m9979v(r10, r11, r14)
            long r11 = r14.f18123b
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r13.m10220c(r9, r11)
            return r10
        L96:
            m9.a0 r9 = p221m9.C4434a0.m9896b()
            throw r9
    }

    /* renamed from: s */
    public static int m9976s(int r1, byte[] r2, int r3, p221m9.C4445e.a r4) {
            r1 = r1 & 127(0x7f, float:1.78E-43)
            int r0 = r3 + 1
            r3 = r2[r3]
            if (r3 < 0) goto Lb
            int r2 = r3 << 7
            goto L26
        Lb:
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r3 = r3 << 7
            r1 = r1 | r3
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L19
            int r2 = r0 << 14
            goto L37
        L19:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r0 << 14
            r1 = r1 | r0
            int r0 = r3 + 1
            r3 = r2[r3]
            if (r3 < 0) goto L2a
            int r2 = r3 << 21
        L26:
            r1 = r1 | r2
            r4.f18122a = r1
            return r0
        L2a:
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r3 = r3 << 21
            r1 = r1 | r3
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L3b
            int r2 = r0 << 28
        L37:
            r1 = r1 | r2
            r4.f18122a = r1
            return r3
        L3b:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r0 << 28
            r1 = r1 | r0
        L40:
            int r0 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L48
            r3 = r0
            goto L40
        L48:
            r4.f18122a = r1
            return r0
    }

    /* renamed from: t */
    public static int m9977t(byte[] r1, int r2, p221m9.C4445e.a r3) {
            int r0 = r2 + 1
            r2 = r1[r2]
            if (r2 < 0) goto L9
            r3.f18122a = r2
            return r0
        L9:
            int r1 = m9976s(r2, r1, r0, r3)
            return r1
    }

    /* renamed from: u */
    public static int m9978u(int r2, byte[] r3, int r4, int r5, p221m9.C4505z.c<?> r6, p221m9.C4445e.a r7) {
            m9.y r6 = (p221m9.C4503y) r6
            int r4 = m9977t(r3, r4, r7)
        L6:
            int r0 = r7.f18122a
            r6.m10381e(r0)
            if (r4 >= r5) goto L1b
            int r0 = m9977t(r3, r4, r7)
            int r1 = r7.f18122a
            if (r2 == r1) goto L16
            goto L1b
        L16:
            int r4 = m9977t(r3, r0, r7)
            goto L6
        L1b:
            return r4
    }

    /* renamed from: v */
    public static int m9979v(byte[] r9, int r10, p221m9.C4445e.a r11) {
            int r0 = r10 + 1
            r10 = r9[r10]
            long r1 = (long) r10
            r3 = 0
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 < 0) goto Le
            r11.f18123b = r1
            return r0
        Le:
            r3 = 127(0x7f, double:6.27E-322)
            long r1 = r1 & r3
            int r10 = r0 + 1
            r0 = r9[r0]
            r3 = r0 & 127(0x7f, float:1.78E-43)
            long r3 = (long) r3
            r5 = 7
            long r3 = r3 << r5
            long r1 = r1 | r3
            r3 = 7
        L1c:
            if (r0 >= 0) goto L2c
            int r0 = r10 + 1
            r10 = r9[r10]
            int r3 = r3 + r5
            r4 = r10 & 127(0x7f, float:1.78E-43)
            long r6 = (long) r4
            long r6 = r6 << r3
            long r1 = r1 | r6
            r8 = r0
            r0 = r10
            r10 = r8
            goto L1c
        L2c:
            r11.f18123b = r1
            return r10
    }

    /* renamed from: w */
    public static int m9980w(int r2, byte[] r3, int r4, int r5, p221m9.C4445e.a r6) {
            int r0 = r2 >>> 3
            if (r0 == 0) goto L4b
            r0 = r2 & 7
            if (r0 == 0) goto L46
            r1 = 1
            if (r0 == r1) goto L43
            r1 = 2
            if (r0 == r1) goto L3b
            r1 = 3
            if (r0 == r1) goto L1c
            r2 = 5
            if (r0 != r2) goto L17
            int r4 = r4 + 4
            return r4
        L17:
            m9.a0 r2 = p221m9.C4434a0.m9896b()
            throw r2
        L1c:
            r2 = r2 & (-8)
            r2 = r2 | 4
            r0 = 0
        L21:
            if (r4 >= r5) goto L31
            int r4 = m9977t(r3, r4, r6)
            int r0 = r6.f18122a
            if (r0 != r2) goto L2c
            goto L31
        L2c:
            int r4 = m9980w(r0, r3, r4, r5, r6)
            goto L21
        L31:
            if (r4 > r5) goto L36
            if (r0 != r2) goto L36
            return r4
        L36:
            m9.a0 r2 = p221m9.C4434a0.m9901g()
            throw r2
        L3b:
            int r2 = m9977t(r3, r4, r6)
            int r3 = r6.f18122a
            int r2 = r2 + r3
            return r2
        L43:
            int r4 = r4 + 8
            return r4
        L46:
            int r2 = m9979v(r3, r4, r6)
            return r2
        L4b:
            m9.a0 r2 = p221m9.C4434a0.m9896b()
            throw r2
    }
}
