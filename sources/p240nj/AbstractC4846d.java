package p240nj;

/* renamed from: nj.d */
/* loaded from: classes.dex */
public abstract class AbstractC4846d implements p240nj.InterfaceC4844b {

    /* renamed from: nj.d$a */
    public static abstract class a extends p240nj.AbstractC4846d {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: u */
        public int mo10913u() {
                r5 = this;
                int r0 = r5.mo10898f()
                r1 = 1
                r3 = r5
                r4 = r3
                r2 = 1
            L8:
                if (r2 >= r0) goto L15
                nj.d r4 = r4.mo10907o()
                nj.d r3 = r3.mo10893a(r4)
                int r2 = r2 + 1
                goto L8
            L15:
                boolean r0 = r3.mo10901i()
                if (r0 == 0) goto L1d
                r0 = 0
                return r0
            L1d:
                boolean r0 = r3.mo10900h()
                if (r0 == 0) goto L24
                return r1
            L24:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Internal error in trace calculation"
                r0.<init>(r1)
                throw r0
        }
    }

    /* renamed from: nj.d$b */
    public static abstract class b extends p240nj.AbstractC4846d {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: nj.d$c */
    public static class c extends p240nj.AbstractC4846d.a {

        /* renamed from: Y */
        public int f19278Y;

        /* renamed from: Z */
        public int f19279Z;

        /* renamed from: a0 */
        public int[] f19280a0;

        /* renamed from: b0 */
        public p240nj.C4854l f19281b0;

        public c(int r5, int r6, int r7, int r8, java.math.BigInteger r9) {
                r4 = this;
                r4.<init>()
                if (r9 == 0) goto L4c
                int r0 = r9.signum()
                if (r0 < 0) goto L4c
                int r0 = r9.bitLength()
                if (r0 > r5) goto L4c
                r0 = 0
                r1 = 1
                r2 = 2
                if (r7 != 0) goto L21
                if (r8 != 0) goto L21
                r4.f19278Y = r2
                int[] r7 = new int[r1]
                r7[r0] = r6
                r4.f19280a0 = r7
                goto L32
            L21:
                if (r7 >= r8) goto L44
                if (r7 <= 0) goto L3c
                r3 = 3
                r4.f19278Y = r3
                int[] r3 = new int[r3]
                r3[r0] = r6
                r3[r1] = r7
                r3[r2] = r8
                r4.f19280a0 = r3
            L32:
                r4.f19279Z = r5
                nj.l r5 = new nj.l
                r5.<init>(r9)
                r4.f19281b0 = r5
                return
            L3c:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r6 = "k2 must be larger than 0"
                r5.<init>(r6)
                throw r5
            L44:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r6 = "k2 must be smaller than k3"
                r5.<init>(r6)
                throw r5
            L4c:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r6 = "x value invalid in F2m field element"
                r5.<init>(r6)
                throw r5
        }

        public c(int r2, int[] r3, p240nj.C4854l r4) {
                r1 = this;
                r1.<init>()
                r1.f19279Z = r2
                int r2 = r3.length
                r0 = 1
                if (r2 != r0) goto Lb
                r2 = 2
                goto Lc
            Lb:
                r2 = 3
            Lc:
                r1.f19278Y = r2
                r1.f19280a0 = r3
                r1.f19281b0 = r4
                return
        }

        /* renamed from: v */
        public static void m10914v(p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3) {
                boolean r0 = r2 instanceof p240nj.AbstractC4846d.c
                if (r0 == 0) goto L33
                boolean r0 = r3 instanceof p240nj.AbstractC4846d.c
                if (r0 == 0) goto L33
                nj.d$c r2 = (p240nj.AbstractC4846d.c) r2
                nj.d$c r3 = (p240nj.AbstractC4846d.c) r3
                int r0 = r2.f19278Y
                int r1 = r3.f19278Y
                if (r0 != r1) goto L2b
                int r0 = r2.f19279Z
                int r1 = r3.f19279Z
                if (r0 != r1) goto L23
                int[] r2 = r2.f19280a0
                int[] r3 = r3.f19280a0
                boolean r2 = p400wj.C6888a.m13950b(r2, r3)
                if (r2 == 0) goto L23
                return
            L23:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Field elements are not elements of the same field F2m"
                r2.<init>(r3)
                throw r2
            L2b:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "One of the F2m field elements has incorrect representation"
                r2.<init>(r3)
                throw r2
            L33:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Field elements are not both instances of ECFieldElement.F2m"
                r2.<init>(r3)
                throw r2
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: a */
        public p240nj.AbstractC4846d mo10893a(p240nj.AbstractC4846d r4) {
                r3 = this;
                nj.l r0 = r3.f19281b0
                java.lang.Object r0 = r0.clone()
                nj.l r0 = (p240nj.C4854l) r0
                nj.d$c r4 = (p240nj.AbstractC4846d.c) r4
                nj.l r4 = r4.f19281b0
                r1 = 0
                r0.m10968e(r4, r1)
                nj.d$c r4 = new nj.d$c
                int r1 = r3.f19279Z
                int[] r2 = r3.f19280a0
                r4.<init>(r1, r2, r0)
                return r4
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: b */
        public p240nj.AbstractC4846d mo10894b() {
                r10 = this;
                nj.d$c r0 = new nj.d$c
                int r1 = r10.f19279Z
                int[] r2 = r10.f19280a0
                nj.l r3 = r10.f19281b0
                long[] r4 = r3.f19304Y
                int r4 = r4.length
                r5 = 1
                r7 = 1
                r8 = 0
                if (r4 != 0) goto L1b
                nj.l r3 = new nj.l
                long[] r4 = new long[r7]
                r4[r8] = r5
                r3.<init>(r4)
                goto L39
            L1b:
                int r4 = r3.m10971q()
                int r4 = java.lang.Math.max(r7, r4)
                long[] r7 = new long[r4]
                long[] r3 = r3.f19304Y
                int r9 = r3.length
                int r4 = java.lang.Math.min(r9, r4)
                java.lang.System.arraycopy(r3, r8, r7, r8, r4)
                r3 = r7[r8]
                long r3 = r3 ^ r5
                r7[r8] = r3
                nj.l r3 = new nj.l
                r3.<init>(r7)
            L39:
                r0.<init>(r1, r2, r3)
                return r0
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: c */
        public int mo10895c() {
                r1 = this;
                nj.l r0 = r1.f19281b0
                int r0 = r0.m10969j()
                return r0
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: d */
        public p240nj.AbstractC4846d mo10896d(p240nj.AbstractC4846d r1) {
                r0 = this;
                nj.d r1 = r1.mo10899g()
                nj.d r1 = r0.mo10902j(r1)
                return r1
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof p240nj.AbstractC4846d.c
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                nj.d$c r5 = (p240nj.AbstractC4846d.c) r5
                int r1 = r4.f19279Z
                int r3 = r5.f19279Z
                if (r1 != r3) goto L2d
                int r1 = r4.f19278Y
                int r3 = r5.f19278Y
                if (r1 != r3) goto L2d
                int[] r1 = r4.f19280a0
                int[] r3 = r5.f19280a0
                boolean r1 = p400wj.C6888a.m13950b(r1, r3)
                if (r1 == 0) goto L2d
                nj.l r1 = r4.f19281b0
                nj.l r5 = r5.f19281b0
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L2d
                goto L2e
            L2d:
                r0 = 0
            L2e:
                return r0
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: f */
        public int mo10898f() {
                r1 = this;
                int r0 = r1.f19279Z
                return r0
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: g */
        public p240nj.AbstractC4846d mo10899g() {
                r15 = this;
                nj.d$c r0 = new nj.d$c
                int r1 = r15.f19279Z
                int[] r2 = r15.f19280a0
                nj.l r3 = r15.f19281b0
                int r4 = r3.m10969j()
                if (r4 == 0) goto L9a
                r5 = 1
                if (r4 != r5) goto L12
                goto L7b
            L12:
                java.lang.Object r3 = r3.clone()
                nj.l r3 = (p240nj.C4854l) r3
                int r6 = r1 + 63
                int r6 = r6 >>> 6
                nj.l r7 = new nj.l
                r7.<init>(r6)
                long[] r8 = r7.f19304Y
                r9 = 0
                p240nj.C4854l.m10964x(r8, r9, r1, r1, r2)
                nj.l r8 = new nj.l
                r8.<init>(r6)
                long[] r10 = r8.f19304Y
                r11 = 1
                r10[r9] = r11
                nj.l r10 = new nj.l
                r10.<init>(r6)
                r6 = 2
                int[] r11 = new int[r6]
                r11[r9] = r4
                int r4 = r1 + 1
                r11[r5] = r4
                nj.l[] r4 = new p240nj.C4854l[r6]
                r4[r9] = r3
                r4[r5] = r7
                int[] r3 = new int[r6]
                r3 = {x00a0: FILL_ARRAY_DATA , data: [1, 0} // fill-array
                nj.l[] r6 = new p240nj.C4854l[r6]
                r6[r9] = r8
                r6[r5] = r10
                r7 = r11[r5]
                r8 = r3[r5]
                r9 = r11[r9]
                int r9 = r7 - r9
            L59:
                if (r9 >= 0) goto L66
                int r9 = -r9
                r11[r5] = r7
                r3[r5] = r8
                int r5 = 1 - r5
                r7 = r11[r5]
                r8 = r3[r5]
            L66:
                r10 = r4[r5]
                int r12 = 1 - r5
                r13 = r4[r12]
                r14 = r11[r12]
                r10.m10967d(r13, r14, r9)
                r10 = r4[r5]
                int r10 = r10.m10970k(r7)
                if (r10 != 0) goto L7f
                r3 = r6[r12]
            L7b:
                r0.<init>(r1, r2, r3)
                return r0
            L7f:
                r13 = r3[r12]
                r14 = r6[r5]
                r12 = r6[r12]
                r14.m10967d(r12, r13, r9)
                int r13 = r13 + r9
                if (r13 <= r8) goto L8d
                r8 = r13
                goto L95
            L8d:
                if (r13 != r8) goto L95
                r12 = r6[r5]
                int r8 = r12.m10970k(r8)
            L95:
                int r7 = r10 - r7
                int r9 = r9 + r7
                r7 = r10
                goto L59
            L9a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: h */
        public boolean mo10900h() {
                r1 = this;
                nj.l r0 = r1.f19281b0
                boolean r0 = r0.m10972s()
                return r0
        }

        public int hashCode() {
                r2 = this;
                nj.l r0 = r2.f19281b0
                int r0 = r0.hashCode()
                int r1 = r2.f19279Z
                r0 = r0 ^ r1
                int[] r1 = r2.f19280a0
                int r1 = p400wj.C6888a.m13953e(r1)
                r0 = r0 ^ r1
                return r0
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: i */
        public boolean mo10901i() {
                r1 = this;
                nj.l r0 = r1.f19281b0
                boolean r0 = r0.m10973t()
                return r0
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: j */
        public p240nj.AbstractC4846d mo10902j(p240nj.AbstractC4846d r28) {
                r27 = this;
                r0 = r27
                nj.d$c r1 = new nj.d$c
                int r2 = r0.f19279Z
                int[] r3 = r0.f19280a0
                nj.l r4 = r0.f19281b0
                r5 = r28
                nj.d$c r5 = (p240nj.AbstractC4846d.c) r5
                nj.l r5 = r5.f19281b0
                int r6 = r4.m10969j()
                if (r6 != 0) goto L18
                goto L116
            L18:
                int r7 = r5.m10969j()
                if (r7 != 0) goto L21
            L1e:
                r4 = r5
                goto L116
            L21:
                if (r6 <= r7) goto L29
                r26 = r7
                r7 = r6
                r6 = r26
                goto L2e
            L29:
                r26 = r5
                r5 = r4
                r4 = r26
            L2e:
                int r8 = r6 + 63
                int r8 = r8 >>> 6
                int r9 = r7 + 63
                int r13 = r9 >>> 6
                int r6 = r6 + r7
                int r6 = r6 + 62
                int r6 = r6 >>> 6
                r9 = 0
                r10 = 1
                if (r8 != r10) goto L60
                long[] r5 = r5.f19304Y
                r10 = r5[r9]
                r7 = 1
                int r5 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r5 != 0) goto L4b
                goto L116
            L4b:
                long[] r5 = new long[r6]
                long[] r12 = r4.f19304Y
                r15 = 0
                r14 = r5
                p240nj.C4854l.m10963v(r10, r12, r13, r14, r15)
                int r4 = p240nj.C4854l.m10965y(r5, r9, r6, r2, r3)
                nj.l r6 = new nj.l
                r6.<init>(r5, r9, r4)
                r4 = r6
                goto L116
            L60:
                int r7 = r7 + 7
                int r7 = r7 + 63
                int r7 = r7 >>> 6
                r11 = 16
                int[] r12 = new int[r11]
                int r15 = r7 << 4
                long[] r14 = new long[r15]
                r12[r10] = r7
                long[] r4 = r4.f19304Y
                java.lang.System.arraycopy(r4, r9, r14, r7, r13)
                r4 = 2
                r10 = r7
            L77:
                if (r4 >= r11) goto Lab
                int r10 = r10 + r7
                r12[r4] = r10
                r13 = r4 & 1
                if (r13 != 0) goto L92
                int r13 = r10 >>> 1
                r19 = 1
                r21 = r14
                r11 = r15
                r15 = r13
                r16 = r21
                r17 = r10
                r18 = r7
                p240nj.C4854l.m10966z(r14, r15, r16, r17, r18, r19)
                goto La3
            L92:
                r21 = r14
                r11 = r15
                int r17 = r10 - r7
                r15 = r7
                r16 = r21
                r18 = r21
                r19 = r10
                r20 = r7
                p240nj.C4854l.m10955b(r14, r15, r16, r17, r18, r19, r20)
            La3:
                int r4 = r4 + 1
                r15 = r11
                r14 = r21
                r11 = 16
                goto L77
            Lab:
                r21 = r14
                r11 = r15
                long[] r4 = new long[r11]
                r15 = 0
                r17 = 0
                r19 = 4
                r16 = r4
                r18 = r11
                p240nj.C4854l.m10966z(r14, r15, r16, r17, r18, r19)
                long[] r5 = r5.f19304Y
                int r10 = r6 << 3
                long[] r11 = new long[r10]
                r13 = 0
            Lc3:
                if (r13 >= r8) goto Lf8
                r14 = r5[r13]
                r22 = r13
            Lc9:
                int r9 = (int) r14
                r9 = r9 & 15
                r23 = 4
                long r14 = r14 >>> r23
                int r0 = (int) r14
                r0 = r0 & 15
                r17 = r12[r9]
                r19 = r12[r0]
                r24 = r14
                r14 = r11
                r15 = r22
                r16 = r21
                r18 = r4
                r20 = r7
                p240nj.C4854l.m10956c(r14, r15, r16, r17, r18, r19, r20)
                long r14 = r24 >>> r23
                r16 = 0
                int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r0 != 0) goto Lf3
                int r13 = r13 + 1
                r0 = r27
                r9 = 0
                goto Lc3
            Lf3:
                int r22 = r22 + r6
                r0 = r27
                goto Lc9
            Lf8:
                int r10 = r10 - r6
                if (r10 == 0) goto L10a
                int r15 = r10 - r6
                r19 = 8
                r14 = r11
                r16 = r11
                r17 = r10
                r18 = r6
                p240nj.C4854l.m10957f(r14, r15, r16, r17, r18, r19)
                goto Lf8
            L10a:
                r0 = 0
                int r4 = p240nj.C4854l.m10965y(r11, r0, r6, r2, r3)
                nj.l r5 = new nj.l
                r5.<init>(r11, r0, r4)
                goto L1e
            L116:
                r1.<init>(r2, r3, r4)
                return r1
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: k */
        public p240nj.AbstractC4846d mo10903k(p240nj.AbstractC4846d r1, p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3) {
                r0 = this;
                nj.d r1 = r0.mo10904l(r1, r2, r3)
                return r1
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: l */
        public p240nj.AbstractC4846d mo10904l(p240nj.AbstractC4846d r3, p240nj.AbstractC4846d r4, p240nj.AbstractC4846d r5) {
                r2 = this;
                nj.l r0 = r2.f19281b0
                nj.d$c r3 = (p240nj.AbstractC4846d.c) r3
                nj.l r3 = r3.f19281b0
                nj.d$c r4 = (p240nj.AbstractC4846d.c) r4
                nj.l r4 = r4.f19281b0
                nj.d$c r5 = (p240nj.AbstractC4846d.c) r5
                nj.l r5 = r5.f19281b0
                nj.l r1 = r0.m10974u(r3)
                nj.l r4 = r4.m10974u(r5)
                if (r1 == r0) goto L1a
                if (r1 != r3) goto L21
            L1a:
                java.lang.Object r3 = r1.clone()
                r1 = r3
                nj.l r1 = (p240nj.C4854l) r1
            L21:
                r3 = 0
                r1.m10968e(r4, r3)
                int r3 = r2.f19279Z
                int[] r4 = r2.f19280a0
                r1.m10975w(r3, r4)
                nj.d$c r3 = new nj.d$c
                int r4 = r2.f19279Z
                int[] r5 = r2.f19280a0
                r3.<init>(r4, r5, r1)
                return r3
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: m */
        public p240nj.AbstractC4846d mo10905m() {
                r0 = this;
                return r0
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: n */
        public p240nj.AbstractC4846d mo10906n() {
                r1 = this;
                nj.l r0 = r1.f19281b0
                boolean r0 = r0.m10973t()
                if (r0 != 0) goto L1a
                nj.l r0 = r1.f19281b0
                boolean r0 = r0.m10972s()
                if (r0 == 0) goto L11
                goto L1a
            L11:
                int r0 = r1.f19279Z
                int r0 = r0 + (-1)
                nj.d r0 = r1.mo10909q(r0)
                goto L1b
            L1a:
                r0 = r1
            L1b:
                return r0
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: o */
        public p240nj.AbstractC4846d mo10907o() {
                r13 = this;
                nj.d$c r0 = new nj.d$c
                int r1 = r13.f19279Z
                int[] r2 = r13.f19280a0
                nj.l r3 = r13.f19281b0
                int r4 = r3.m10971q()
                if (r4 != 0) goto Lf
                goto L3c
            Lf:
                int r4 = r4 << 1
                long[] r5 = new long[r4]
                r6 = 0
                r7 = 0
            L15:
                if (r7 >= r4) goto L33
                long[] r8 = r3.f19304Y
                int r9 = r7 >>> 1
                r9 = r8[r9]
                int r8 = r7 + 1
                int r11 = (int) r9
                long r11 = p240nj.C4854l.m10962r(r11)
                r5[r7] = r11
                int r7 = r8 + 1
                r11 = 32
                long r9 = r9 >>> r11
                int r10 = (int) r9
                long r9 = p240nj.C4854l.m10962r(r10)
                r5[r8] = r9
                goto L15
            L33:
                nj.l r3 = new nj.l
                int r4 = p240nj.C4854l.m10965y(r5, r6, r4, r1, r2)
                r3.<init>(r5, r6, r4)
            L3c:
                r0.<init>(r1, r2, r3)
                return r0
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: p */
        public p240nj.AbstractC4846d mo10908p(p240nj.AbstractC4846d r11, p240nj.AbstractC4846d r12) {
                r10 = this;
                nj.l r0 = r10.f19281b0
                nj.d$c r11 = (p240nj.AbstractC4846d.c) r11
                nj.l r11 = r11.f19281b0
                nj.d$c r12 = (p240nj.AbstractC4846d.c) r12
                nj.l r12 = r12.f19281b0
                int r1 = r0.m10971q()
                r2 = 0
                if (r1 != 0) goto L13
                r4 = r0
                goto L3b
            L13:
                int r1 = r1 << 1
                long[] r3 = new long[r1]
                r4 = 0
            L18:
                if (r4 >= r1) goto L36
                long[] r5 = r0.f19304Y
                int r6 = r4 >>> 1
                r6 = r5[r6]
                int r5 = r4 + 1
                int r8 = (int) r6
                long r8 = p240nj.C4854l.m10962r(r8)
                r3[r4] = r8
                int r4 = r5 + 1
                r8 = 32
                long r6 = r6 >>> r8
                int r7 = (int) r6
                long r6 = p240nj.C4854l.m10962r(r7)
                r3[r5] = r6
                goto L18
            L36:
                nj.l r4 = new nj.l
                r4.<init>(r3, r2, r1)
            L3b:
                nj.l r11 = r11.m10974u(r12)
                if (r4 != r0) goto L48
                java.lang.Object r12 = r4.clone()
                r4 = r12
                nj.l r4 = (p240nj.C4854l) r4
            L48:
                r4.m10968e(r11, r2)
                int r11 = r10.f19279Z
                int[] r12 = r10.f19280a0
                r4.m10975w(r11, r12)
                nj.d$c r11 = new nj.d$c
                int r12 = r10.f19279Z
                int[] r0 = r10.f19280a0
                r11.<init>(r12, r0, r4)
                return r11
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: q */
        public p240nj.AbstractC4846d mo10909q(int r13) {
                r12 = this;
                r0 = 1
                if (r13 >= r0) goto L5
                r1 = r12
                goto L52
            L5:
                nj.d$c r1 = new nj.d$c
                int r2 = r12.f19279Z
                int[] r3 = r12.f19280a0
                nj.l r4 = r12.f19281b0
                int r5 = r4.m10971q()
                if (r5 != 0) goto L14
                goto L4f
            L14:
                int r6 = r2 + 63
                int r6 = r6 >>> 6
                int r0 = r6 << 1
                long[] r6 = new long[r0]
                long[] r4 = r4.f19304Y
                r7 = 0
                java.lang.System.arraycopy(r4, r7, r6, r7, r5)
            L22:
                int r13 = r13 + (-1)
                if (r13 < 0) goto L4a
                int r4 = r5 << 1
            L28:
                int r5 = r5 + (-1)
                if (r5 < 0) goto L45
                r8 = r6[r5]
                int r4 = r4 + (-1)
                r10 = 32
                long r10 = r8 >>> r10
                int r11 = (int) r10
                long r10 = p240nj.C4854l.m10962r(r11)
                r6[r4] = r10
                int r4 = r4 + (-1)
                int r9 = (int) r8
                long r8 = p240nj.C4854l.m10962r(r9)
                r6[r4] = r8
                goto L28
            L45:
                int r5 = p240nj.C4854l.m10965y(r6, r7, r0, r2, r3)
                goto L22
            L4a:
                nj.l r4 = new nj.l
                r4.<init>(r6, r7, r5)
            L4f:
                r1.<init>(r2, r3, r4)
            L52:
                return r1
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: r */
        public p240nj.AbstractC4846d mo10910r(p240nj.AbstractC4846d r1) {
                r0 = this;
                nj.d r1 = r0.mo10893a(r1)
                return r1
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: s */
        public boolean mo10911s() {
                r6 = this;
                nj.l r0 = r6.f19281b0
                long[] r0 = r0.f19304Y
                int r1 = r0.length
                r2 = 0
                if (r1 <= 0) goto L14
                r3 = r0[r2]
                r0 = 1
                long r0 = r0 & r3
                r3 = 0
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 == 0) goto L14
                r2 = 1
            L14:
                return r2
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: t */
        public java.math.BigInteger mo10912t() {
                r15 = this;
                nj.l r0 = r15.f19281b0
                int r1 = r0.m10971q()
                if (r1 != 0) goto Lb
                java.math.BigInteger r0 = p240nj.InterfaceC4844b.f19243R
                goto L5f
            Lb:
                long[] r2 = r0.f19304Y
                int r3 = r1 + (-1)
                r4 = r2[r3]
                r2 = 8
                byte[] r6 = new byte[r2]
                r7 = 7
                r8 = 0
                r9 = 7
                r10 = 0
                r11 = 0
            L1a:
                r12 = 1
                if (r9 < 0) goto L30
                int r13 = r9 * 8
                long r13 = r4 >>> r13
                int r14 = (int) r13
                byte r13 = (byte) r14
                if (r11 != 0) goto L27
                if (r13 == 0) goto L2d
            L27:
                int r11 = r10 + 1
                r6[r10] = r13
                r10 = r11
                r11 = 1
            L2d:
                int r9 = r9 + (-1)
                goto L1a
            L30:
                int r3 = r3 * 8
                int r3 = r3 + r10
                byte[] r2 = new byte[r3]
            L35:
                if (r8 >= r10) goto L3e
                r3 = r6[r8]
                r2[r8] = r3
                int r8 = r8 + 1
                goto L35
            L3e:
                int r1 = r1 + (-2)
            L40:
                if (r1 < 0) goto L5a
                long[] r3 = r0.f19304Y
                r4 = r3[r1]
                r3 = 7
            L47:
                if (r3 < 0) goto L57
                int r6 = r10 + 1
                int r8 = r3 * 8
                long r8 = r4 >>> r8
                int r9 = (int) r8
                byte r8 = (byte) r9
                r2[r10] = r8
                int r3 = r3 + (-1)
                r10 = r6
                goto L47
            L57:
                int r1 = r1 + (-1)
                goto L40
            L5a:
                java.math.BigInteger r0 = new java.math.BigInteger
                r0.<init>(r12, r2)
            L5f:
                return r0
        }
    }

    /* renamed from: nj.d$d */
    public static class d extends p240nj.AbstractC4846d.b {

        /* renamed from: Y */
        public java.math.BigInteger f19282Y;

        /* renamed from: Z */
        public java.math.BigInteger f19283Z;

        /* renamed from: a0 */
        public java.math.BigInteger f19284a0;

        public d(java.math.BigInteger r2, java.math.BigInteger r3, java.math.BigInteger r4) {
                r1 = this;
                r1.<init>()
                if (r4 == 0) goto L18
                int r0 = r4.signum()
                if (r0 < 0) goto L18
                int r0 = r4.compareTo(r2)
                if (r0 >= 0) goto L18
                r1.f19282Y = r2
                r1.f19283Z = r3
                r1.f19284a0 = r4
                return
            L18:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "x value invalid in Fp field element"
                r2.<init>(r3)
                throw r2
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: a */
        public p240nj.AbstractC4846d mo10893a(p240nj.AbstractC4846d r5) {
                r4 = this;
                nj.d$d r0 = new nj.d$d
                java.math.BigInteger r1 = r4.f19282Y
                java.math.BigInteger r2 = r4.f19283Z
                java.math.BigInteger r3 = r4.f19284a0
                java.math.BigInteger r5 = r5.mo10912t()
                java.math.BigInteger r5 = r3.add(r5)
                java.math.BigInteger r3 = r4.f19282Y
                int r3 = r5.compareTo(r3)
                if (r3 < 0) goto L1e
                java.math.BigInteger r3 = r4.f19282Y
                java.math.BigInteger r5 = r5.subtract(r3)
            L1e:
                r0.<init>(r1, r2, r5)
                return r0
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: b */
        public p240nj.AbstractC4846d mo10894b() {
                r4 = this;
                java.math.BigInteger r0 = r4.f19284a0
                java.math.BigInteger r1 = p240nj.InterfaceC4844b.f19244S
                java.math.BigInteger r0 = r0.add(r1)
                java.math.BigInteger r1 = r4.f19282Y
                int r1 = r0.compareTo(r1)
                if (r1 != 0) goto L12
                java.math.BigInteger r0 = p240nj.InterfaceC4844b.f19243R
            L12:
                nj.d$d r1 = new nj.d$d
                java.math.BigInteger r2 = r4.f19282Y
                java.math.BigInteger r3 = r4.f19283Z
                r1.<init>(r2, r3, r0)
                return r1
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: d */
        public p240nj.AbstractC4846d mo10896d(p240nj.AbstractC4846d r5) {
                r4 = this;
                nj.d$d r0 = new nj.d$d
                java.math.BigInteger r1 = r4.f19282Y
                java.math.BigInteger r2 = r4.f19283Z
                java.math.BigInteger r3 = r4.f19284a0
                java.math.BigInteger r5 = r5.mo10912t()
                java.math.BigInteger r5 = r4.m10917w(r5)
                java.math.BigInteger r5 = r3.multiply(r5)
                java.math.BigInteger r5 = r4.m10919y(r5)
                r0.<init>(r1, r2, r5)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof p240nj.AbstractC4846d.d
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                nj.d$d r5 = (p240nj.AbstractC4846d.d) r5
                java.math.BigInteger r1 = r4.f19282Y
                java.math.BigInteger r3 = r5.f19282Y
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L21
                java.math.BigInteger r1 = r4.f19284a0
                java.math.BigInteger r5 = r5.f19284a0
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L21
                goto L22
            L21:
                r0 = 0
            L22:
                return r0
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: f */
        public int mo10898f() {
                r1 = this;
                java.math.BigInteger r0 = r1.f19282Y
                int r0 = r0.bitLength()
                return r0
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: g */
        public p240nj.AbstractC4846d mo10899g() {
                r4 = this;
                nj.d$d r0 = new nj.d$d
                java.math.BigInteger r1 = r4.f19282Y
                java.math.BigInteger r2 = r4.f19283Z
                java.math.BigInteger r3 = r4.f19284a0
                java.math.BigInteger r3 = r4.m10917w(r3)
                r0.<init>(r1, r2, r3)
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.math.BigInteger r0 = r2.f19282Y
                int r0 = r0.hashCode()
                java.math.BigInteger r1 = r2.f19284a0
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                return r0
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: j */
        public p240nj.AbstractC4846d mo10902j(p240nj.AbstractC4846d r5) {
                r4 = this;
                nj.d$d r0 = new nj.d$d
                java.math.BigInteger r1 = r4.f19282Y
                java.math.BigInteger r2 = r4.f19283Z
                java.math.BigInteger r3 = r4.f19284a0
                java.math.BigInteger r5 = r5.mo10912t()
                java.math.BigInteger r5 = r4.m10918x(r3, r5)
                r0.<init>(r1, r2, r5)
                return r0
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: k */
        public p240nj.AbstractC4846d mo10903k(p240nj.AbstractC4846d r3, p240nj.AbstractC4846d r4, p240nj.AbstractC4846d r5) {
                r2 = this;
                java.math.BigInteger r0 = r2.f19284a0
                java.math.BigInteger r3 = r3.mo10912t()
                java.math.BigInteger r4 = r4.mo10912t()
                java.math.BigInteger r5 = r5.mo10912t()
                java.math.BigInteger r3 = r0.multiply(r3)
                java.math.BigInteger r4 = r4.multiply(r5)
                nj.d$d r5 = new nj.d$d
                java.math.BigInteger r0 = r2.f19282Y
                java.math.BigInteger r1 = r2.f19283Z
                java.math.BigInteger r3 = r3.subtract(r4)
                java.math.BigInteger r3 = r2.m10919y(r3)
                r5.<init>(r0, r1, r3)
                return r5
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: l */
        public p240nj.AbstractC4846d mo10904l(p240nj.AbstractC4846d r3, p240nj.AbstractC4846d r4, p240nj.AbstractC4846d r5) {
                r2 = this;
                java.math.BigInteger r0 = r2.f19284a0
                java.math.BigInteger r3 = r3.mo10912t()
                java.math.BigInteger r4 = r4.mo10912t()
                java.math.BigInteger r5 = r5.mo10912t()
                java.math.BigInteger r3 = r0.multiply(r3)
                java.math.BigInteger r4 = r4.multiply(r5)
                nj.d$d r5 = new nj.d$d
                java.math.BigInteger r0 = r2.f19282Y
                java.math.BigInteger r1 = r2.f19283Z
                java.math.BigInteger r3 = r3.add(r4)
                java.math.BigInteger r3 = r2.m10919y(r3)
                r5.<init>(r0, r1, r3)
                return r5
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: m */
        public p240nj.AbstractC4846d mo10905m() {
                r4 = this;
                java.math.BigInteger r0 = r4.f19284a0
                int r0 = r0.signum()
                if (r0 != 0) goto La
                r0 = r4
                goto L19
            La:
                nj.d$d r0 = new nj.d$d
                java.math.BigInteger r1 = r4.f19282Y
                java.math.BigInteger r2 = r4.f19283Z
                java.math.BigInteger r3 = r4.f19284a0
                java.math.BigInteger r3 = r1.subtract(r3)
                r0.<init>(r1, r2, r3)
            L19:
                return r0
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: n */
        public p240nj.AbstractC4846d mo10906n() {
                r17 = this;
                r0 = r17
                boolean r1 = r17.mo10901i()
                if (r1 != 0) goto L22c
                boolean r1 = r17.mo10900h()
                if (r1 == 0) goto L10
                goto L22c
            L10:
                java.math.BigInteger r1 = r0.f19282Y
                r2 = 0
                boolean r1 = r1.testBit(r2)
                if (r1 == 0) goto L224
                java.math.BigInteger r1 = r0.f19282Y
                r3 = 1
                boolean r1 = r1.testBit(r3)
                r4 = 2
                if (r1 == 0) goto L43
                java.math.BigInteger r1 = r0.f19282Y
                java.math.BigInteger r1 = r1.shiftRight(r4)
                java.math.BigInteger r2 = p240nj.InterfaceC4844b.f19244S
                java.math.BigInteger r1 = r1.add(r2)
                nj.d$d r2 = new nj.d$d
                java.math.BigInteger r3 = r0.f19282Y
                java.math.BigInteger r4 = r0.f19283Z
                java.math.BigInteger r5 = r0.f19284a0
                java.math.BigInteger r1 = r5.modPow(r1, r3)
                r2.<init>(r3, r4, r1)
                nj.d r1 = r0.m10915u(r2)
                return r1
            L43:
                java.math.BigInteger r1 = r0.f19282Y
                boolean r1 = r1.testBit(r4)
                if (r1 == 0) goto L9e
                java.math.BigInteger r1 = r0.f19284a0
                java.math.BigInteger r2 = r0.f19282Y
                r3 = 3
                java.math.BigInteger r2 = r2.shiftRight(r3)
                java.math.BigInteger r3 = r0.f19282Y
                java.math.BigInteger r1 = r1.modPow(r2, r3)
                java.math.BigInteger r2 = r0.f19284a0
                java.math.BigInteger r2 = r0.m10918x(r1, r2)
                java.math.BigInteger r1 = r2.multiply(r1)
                java.math.BigInteger r1 = r0.m10919y(r1)
                java.math.BigInteger r3 = p240nj.InterfaceC4844b.f19244S
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L7e
                nj.d$d r1 = new nj.d$d
                java.math.BigInteger r3 = r0.f19282Y
                java.math.BigInteger r4 = r0.f19283Z
                r1.<init>(r3, r4, r2)
                nj.d r1 = r0.m10915u(r1)
                return r1
            L7e:
                java.math.BigInteger r1 = p240nj.InterfaceC4844b.f19245T
                java.math.BigInteger r3 = r0.f19282Y
                java.math.BigInteger r3 = r3.shiftRight(r4)
                java.math.BigInteger r4 = r0.f19282Y
                java.math.BigInteger r1 = r1.modPow(r3, r4)
                java.math.BigInteger r1 = r0.m10918x(r2, r1)
                nj.d$d r2 = new nj.d$d
                java.math.BigInteger r3 = r0.f19282Y
                java.math.BigInteger r4 = r0.f19283Z
                r2.<init>(r3, r4, r1)
                nj.d r1 = r0.m10915u(r2)
                return r1
            L9e:
                java.math.BigInteger r1 = r0.f19282Y
                java.math.BigInteger r1 = r1.shiftRight(r3)
                java.math.BigInteger r5 = r0.f19284a0
                java.math.BigInteger r6 = r0.f19282Y
                java.math.BigInteger r5 = r5.modPow(r1, r6)
                java.math.BigInteger r6 = p240nj.InterfaceC4844b.f19244S
                boolean r5 = r5.equals(r6)
                r7 = 0
                if (r5 != 0) goto Lb6
                return r7
            Lb6:
                java.math.BigInteger r5 = r0.f19284a0
                java.math.BigInteger r8 = r0.m10916v(r5)
                java.math.BigInteger r8 = r0.m10916v(r8)
                java.math.BigInteger r9 = r1.add(r6)
                java.math.BigInteger r10 = r0.f19282Y
                java.math.BigInteger r6 = r10.subtract(r6)
                java.util.Random r10 = new java.util.Random
                r10.<init>()
            Lcf:
                java.math.BigInteger r11 = new java.math.BigInteger
                java.math.BigInteger r12 = r0.f19282Y
                int r12 = r12.bitLength()
                r11.<init>(r12, r10)
                java.math.BigInteger r12 = r0.f19282Y
                int r12 = r11.compareTo(r12)
                if (r12 >= 0) goto L21f
                java.math.BigInteger r12 = r11.multiply(r11)
                java.math.BigInteger r12 = r12.subtract(r8)
                java.math.BigInteger r12 = r0.m10919y(r12)
                java.math.BigInteger r13 = r0.f19282Y
                java.math.BigInteger r12 = r12.modPow(r1, r13)
                boolean r12 = r12.equals(r6)
                if (r12 == 0) goto L21f
                int r12 = r9.bitLength()
                int r13 = r9.getLowestSetBit()
                java.math.BigInteger r14 = p240nj.InterfaceC4844b.f19244S
                java.math.BigInteger r15 = p240nj.InterfaceC4844b.f19245T
                int r12 = r12 - r3
                r4 = r11
                r7 = r14
                r2 = r15
                r15 = r7
            L10b:
                int r3 = r13 + 1
                if (r12 < r3) goto L183
                java.math.BigInteger r14 = r0.m10918x(r14, r15)
                boolean r3 = r9.testBit(r12)
                if (r3 == 0) goto L14b
                java.math.BigInteger r3 = r14.multiply(r5)
                java.math.BigInteger r3 = r0.m10919y(r3)
                java.math.BigInteger r7 = r0.m10918x(r7, r4)
                java.math.BigInteger r2 = r4.multiply(r2)
                java.math.BigInteger r15 = r11.multiply(r14)
                java.math.BigInteger r2 = r2.subtract(r15)
                java.math.BigInteger r2 = r0.m10919y(r2)
                java.math.BigInteger r4 = r4.multiply(r4)
                r16 = r1
                r15 = 1
                java.math.BigInteger r1 = r3.shiftLeft(r15)
                java.math.BigInteger r1 = r4.subtract(r1)
                java.math.BigInteger r1 = r0.m10919y(r1)
                r4 = r1
                r15 = r3
                goto L17d
            L14b:
                r16 = r1
                java.math.BigInteger r1 = r7.multiply(r2)
                java.math.BigInteger r1 = r1.subtract(r14)
                java.math.BigInteger r1 = r0.m10919y(r1)
                java.math.BigInteger r3 = r4.multiply(r2)
                java.math.BigInteger r4 = r11.multiply(r14)
                java.math.BigInteger r3 = r3.subtract(r4)
                java.math.BigInteger r3 = r0.m10919y(r3)
                java.math.BigInteger r2 = r2.multiply(r2)
                r4 = 1
                java.math.BigInteger r7 = r14.shiftLeft(r4)
                java.math.BigInteger r2 = r2.subtract(r7)
                java.math.BigInteger r2 = r0.m10919y(r2)
                r7 = r1
                r4 = r3
                r15 = r14
            L17d:
                int r12 = r12 + (-1)
                r1 = r16
                r3 = 1
                goto L10b
            L183:
                r16 = r1
                java.math.BigInteger r1 = r0.m10918x(r14, r15)
                java.math.BigInteger r3 = r1.multiply(r5)
                java.math.BigInteger r3 = r0.m10919y(r3)
                java.math.BigInteger r7 = r7.multiply(r2)
                java.math.BigInteger r7 = r7.subtract(r1)
                java.math.BigInteger r7 = r0.m10919y(r7)
                java.math.BigInteger r2 = r4.multiply(r2)
                java.math.BigInteger r4 = r11.multiply(r1)
                java.math.BigInteger r2 = r2.subtract(r4)
                java.math.BigInteger r2 = r0.m10919y(r2)
                java.math.BigInteger r1 = r0.m10918x(r1, r3)
                r3 = 1
            L1b2:
                if (r3 > r13) goto L1d4
                java.math.BigInteger r7 = r0.m10918x(r7, r2)
                java.math.BigInteger r2 = r2.multiply(r2)
                r4 = 1
                java.math.BigInteger r11 = r1.shiftLeft(r4)
                java.math.BigInteger r2 = r2.subtract(r11)
                java.math.BigInteger r2 = r0.m10919y(r2)
                java.math.BigInteger r1 = r1.multiply(r1)
                java.math.BigInteger r1 = r0.m10919y(r1)
                int r3 = r3 + 1
                goto L1b2
            L1d4:
                r1 = 2
                r4 = 1
                java.math.BigInteger[] r3 = new java.math.BigInteger[r1]
                r11 = 0
                r3[r11] = r7
                r3[r4] = r2
                r2 = r3[r11]
                r3 = r3[r4]
                java.math.BigInteger r4 = r0.m10918x(r3, r3)
                boolean r4 = r4.equals(r8)
                if (r4 == 0) goto L206
                nj.d$d r1 = new nj.d$d
                java.math.BigInteger r2 = r0.f19282Y
                java.math.BigInteger r4 = r0.f19283Z
                boolean r5 = r3.testBit(r11)
                if (r5 == 0) goto L1fd
                java.math.BigInteger r5 = r0.f19282Y
                java.math.BigInteger r3 = r5.subtract(r3)
            L1fd:
                r7 = 1
                java.math.BigInteger r3 = r3.shiftRight(r7)
                r1.<init>(r2, r4, r3)
                return r1
            L206:
                r7 = 1
                java.math.BigInteger r3 = p240nj.InterfaceC4844b.f19244S
                boolean r3 = r2.equals(r3)
                if (r3 != 0) goto L217
                boolean r2 = r2.equals(r6)
                if (r2 != 0) goto L217
                r2 = 0
                return r2
            L217:
                r1 = r16
                r2 = 0
                r3 = 1
                r4 = 2
                r7 = 0
                goto Lcf
            L21f:
                r2 = r7
                r11 = 0
                r2 = 0
                goto Lcf
            L224:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "not done yet"
                r1.<init>(r2)
                throw r1
            L22c:
                return r0
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: o */
        public p240nj.AbstractC4846d mo10907o() {
                r4 = this;
                nj.d$d r0 = new nj.d$d
                java.math.BigInteger r1 = r4.f19282Y
                java.math.BigInteger r2 = r4.f19283Z
                java.math.BigInteger r3 = r4.f19284a0
                java.math.BigInteger r3 = r4.m10918x(r3, r3)
                r0.<init>(r1, r2, r3)
                return r0
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: p */
        public p240nj.AbstractC4846d mo10908p(p240nj.AbstractC4846d r4, p240nj.AbstractC4846d r5) {
                r3 = this;
                java.math.BigInteger r0 = r3.f19284a0
                java.math.BigInteger r4 = r4.mo10912t()
                java.math.BigInteger r5 = r5.mo10912t()
                java.math.BigInteger r0 = r0.multiply(r0)
                java.math.BigInteger r4 = r4.multiply(r5)
                nj.d$d r5 = new nj.d$d
                java.math.BigInteger r1 = r3.f19282Y
                java.math.BigInteger r2 = r3.f19283Z
                java.math.BigInteger r4 = r0.add(r4)
                java.math.BigInteger r4 = r3.m10919y(r4)
                r5.<init>(r1, r2, r4)
                return r5
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: r */
        public p240nj.AbstractC4846d mo10910r(p240nj.AbstractC4846d r5) {
                r4 = this;
                nj.d$d r0 = new nj.d$d
                java.math.BigInteger r1 = r4.f19282Y
                java.math.BigInteger r2 = r4.f19283Z
                java.math.BigInteger r3 = r4.f19284a0
                java.math.BigInteger r5 = r5.mo10912t()
                java.math.BigInteger r5 = r3.subtract(r5)
                int r3 = r5.signum()
                if (r3 >= 0) goto L1c
                java.math.BigInteger r3 = r4.f19282Y
                java.math.BigInteger r5 = r5.add(r3)
            L1c:
                r0.<init>(r1, r2, r5)
                return r0
        }

        @Override // p240nj.AbstractC4846d
        /* renamed from: t */
        public java.math.BigInteger mo10912t() {
                r1 = this;
                java.math.BigInteger r0 = r1.f19284a0
                return r0
        }

        /* renamed from: u */
        public final p240nj.AbstractC4846d m10915u(p240nj.AbstractC4846d r2) {
                r1 = this;
                nj.d r0 = r2.mo10907o()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto Lb
                goto Lc
            Lb:
                r2 = 0
            Lc:
                return r2
        }

        /* renamed from: v */
        public java.math.BigInteger m10916v(java.math.BigInteger r2) {
                r1 = this;
                r0 = 1
                java.math.BigInteger r2 = r2.shiftLeft(r0)
                java.math.BigInteger r0 = r1.f19282Y
                int r0 = r2.compareTo(r0)
                if (r0 < 0) goto L13
                java.math.BigInteger r0 = r1.f19282Y
                java.math.BigInteger r2 = r2.subtract(r0)
            L13:
                return r2
        }

        /* renamed from: w */
        public java.math.BigInteger m10917w(java.math.BigInteger r4) {
                r3 = this;
                int r0 = r3.mo10898f()
                int r1 = r0 + 31
                int r1 = r1 >> 5
                java.math.BigInteger r2 = r3.f19282Y
                int[] r2 = p085f1.AbstractC1972m.m5014s(r0, r2)
                int[] r4 = p085f1.AbstractC1972m.m5014s(r0, r4)
                int[] r0 = new int[r1]
                p446z3.AbstractC7246d.m14327m(r2, r4, r0)
                java.math.BigInteger r4 = p085f1.AbstractC1972m.m4991Z(r1, r0)
                return r4
        }

        /* renamed from: x */
        public java.math.BigInteger m10918x(java.math.BigInteger r1, java.math.BigInteger r2) {
                r0 = this;
                java.math.BigInteger r1 = r1.multiply(r2)
                java.math.BigInteger r1 = r0.m10919y(r1)
                return r1
        }

        /* renamed from: y */
        public java.math.BigInteger m10919y(java.math.BigInteger r6) {
                r5 = this;
                java.math.BigInteger r0 = r5.f19283Z
                if (r0 == 0) goto L60
                int r0 = r6.signum()
                if (r0 >= 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                if (r0 == 0) goto L13
                java.math.BigInteger r6 = r6.abs()
            L13:
                java.math.BigInteger r1 = r5.f19282Y
                int r1 = r1.bitLength()
                java.math.BigInteger r2 = r5.f19283Z
                java.math.BigInteger r3 = p240nj.InterfaceC4844b.f19244S
                boolean r2 = r2.equals(r3)
            L21:
                int r3 = r6.bitLength()
                int r4 = r1 + 1
                if (r3 <= r4) goto L42
                java.math.BigInteger r3 = r6.shiftRight(r1)
                java.math.BigInteger r4 = r3.shiftLeft(r1)
                java.math.BigInteger r6 = r6.subtract(r4)
                if (r2 != 0) goto L3d
                java.math.BigInteger r4 = r5.f19283Z
                java.math.BigInteger r3 = r3.multiply(r4)
            L3d:
                java.math.BigInteger r6 = r3.add(r6)
                goto L21
            L42:
                java.math.BigInteger r1 = r5.f19282Y
                int r1 = r6.compareTo(r1)
                if (r1 < 0) goto L51
                java.math.BigInteger r1 = r5.f19282Y
                java.math.BigInteger r6 = r6.subtract(r1)
                goto L42
            L51:
                if (r0 == 0) goto L66
                int r0 = r6.signum()
                if (r0 == 0) goto L66
                java.math.BigInteger r0 = r5.f19282Y
                java.math.BigInteger r6 = r0.subtract(r6)
                goto L66
            L60:
                java.math.BigInteger r0 = r5.f19282Y
                java.math.BigInteger r6 = r6.mod(r0)
            L66:
                return r6
        }
    }

    public AbstractC4846d() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract p240nj.AbstractC4846d mo10893a(p240nj.AbstractC4846d r1);

    /* renamed from: b */
    public abstract p240nj.AbstractC4846d mo10894b();

    /* renamed from: c */
    public int mo10895c() {
            r1 = this;
            java.math.BigInteger r0 = r1.mo10912t()
            int r0 = r0.bitLength()
            return r0
    }

    /* renamed from: d */
    public abstract p240nj.AbstractC4846d mo10896d(p240nj.AbstractC4846d r1);

    /* renamed from: e */
    public byte[] m10897e() {
            r5 = this;
            int r0 = r5.mo10898f()
            int r0 = r0 + 7
            int r0 = r0 / 8
            java.math.BigInteger r1 = r5.mo10912t()
            java.math.BigInteger r2 = p400wj.C6889b.f26791a
            byte[] r1 = r1.toByteArray()
            int r2 = r1.length
            if (r2 != r0) goto L16
            goto L27
        L16:
            r2 = 0
            r3 = r1[r2]
            if (r3 != 0) goto L1c
            r2 = 1
        L1c:
            int r3 = r1.length
            int r3 = r3 - r2
            if (r3 > r0) goto L28
            byte[] r4 = new byte[r0]
            int r0 = r0 - r3
            java.lang.System.arraycopy(r1, r2, r4, r0, r3)
            r1 = r4
        L27:
            return r1
        L28:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "standard length exceeded for value"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: f */
    public abstract int mo10898f();

    /* renamed from: g */
    public abstract p240nj.AbstractC4846d mo10899g();

    /* renamed from: h */
    public boolean mo10900h() {
            r2 = this;
            int r0 = r2.mo10895c()
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    /* renamed from: i */
    public boolean mo10901i() {
            r1 = this;
            java.math.BigInteger r0 = r1.mo10912t()
            int r0 = r0.signum()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    /* renamed from: j */
    public abstract p240nj.AbstractC4846d mo10902j(p240nj.AbstractC4846d r1);

    /* renamed from: k */
    public p240nj.AbstractC4846d mo10903k(p240nj.AbstractC4846d r1, p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3) {
            r0 = this;
            nj.d r1 = r0.mo10902j(r1)
            nj.d r2 = r2.mo10902j(r3)
            nj.d r1 = r1.mo10910r(r2)
            return r1
    }

    /* renamed from: l */
    public p240nj.AbstractC4846d mo10904l(p240nj.AbstractC4846d r1, p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3) {
            r0 = this;
            nj.d r1 = r0.mo10902j(r1)
            nj.d r2 = r2.mo10902j(r3)
            nj.d r1 = r1.mo10893a(r2)
            return r1
    }

    /* renamed from: m */
    public abstract p240nj.AbstractC4846d mo10905m();

    /* renamed from: n */
    public abstract p240nj.AbstractC4846d mo10906n();

    /* renamed from: o */
    public abstract p240nj.AbstractC4846d mo10907o();

    /* renamed from: p */
    public p240nj.AbstractC4846d mo10908p(p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3) {
            r1 = this;
            nj.d r0 = r1.mo10907o()
            nj.d r2 = r2.mo10902j(r3)
            nj.d r2 = r0.mo10893a(r2)
            return r2
    }

    /* renamed from: q */
    public p240nj.AbstractC4846d mo10909q(int r3) {
            r2 = this;
            r0 = 0
            r1 = r2
        L2:
            if (r0 >= r3) goto Lb
            nj.d r1 = r1.mo10907o()
            int r0 = r0 + 1
            goto L2
        Lb:
            return r1
    }

    /* renamed from: r */
    public abstract p240nj.AbstractC4846d mo10910r(p240nj.AbstractC4846d r1);

    /* renamed from: s */
    public boolean mo10911s() {
            r2 = this;
            java.math.BigInteger r0 = r2.mo10912t()
            r1 = 0
            boolean r0 = r0.testBit(r1)
            return r0
    }

    /* renamed from: t */
    public abstract java.math.BigInteger mo10912t();

    public java.lang.String toString() {
            r2 = this;
            java.math.BigInteger r0 = r2.mo10912t()
            r1 = 16
            java.lang.String r0 = r0.toString(r1)
            return r0
    }
}
