package p298qj;

/* renamed from: qj.c0 */
/* loaded from: classes.dex */
public class C5667c0 extends p240nj.AbstractC4846d.b {

    /* renamed from: Z */
    public static final java.math.BigInteger f21980Z = null;

    /* renamed from: Y */
    public int[] f21981Y;

    static {
            java.math.BigInteger r0 = p298qj.C5659a0.f21960j
            p298qj.C5667c0.f21980Z = r0
            return
    }

    public C5667c0() {
            r1 = this;
            r1.<init>()
            r0 = 7
            int[] r0 = new int[r0]
            r1.f21981Y = r0
            return
    }

    public C5667c0(java.math.BigInteger r13) {
            r12 = this;
            r12.<init>()
            if (r13 == 0) goto L9e
            int r0 = r13.signum()
            if (r0 < 0) goto L9e
            java.math.BigInteger r0 = p298qj.C5667c0.f21980Z
            int r0 = r13.compareTo(r0)
            if (r0 >= 0) goto L9e
            int[] r13 = p446z3.AbstractC7246d.m14321g(r13)
            r0 = 6
            r1 = r13[r0]
            r2 = -1
            if (r1 != r2) goto L9b
            int[] r1 = p298qj.C5663b0.f21970a
            boolean r2 = p446z3.AbstractC7246d.m14323i(r13, r1)
            if (r2 == 0) goto L9b
            r2 = 0
            r3 = r13[r2]
            long r3 = (long) r3
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            r7 = r1[r2]
            long r7 = (long) r7
            long r7 = r7 & r5
            long r3 = r3 - r7
            r7 = 0
            long r3 = r3 + r7
            int r7 = (int) r3
            r13[r2] = r7
            r2 = 32
            long r3 = r3 >> r2
            r7 = 1
            r8 = r13[r7]
            long r8 = (long) r8
            long r8 = r8 & r5
            r10 = r1[r7]
            long r10 = (long) r10
            long r10 = r10 & r5
            long r8 = r8 - r10
            long r8 = r8 + r3
            int r3 = (int) r8
            r13[r7] = r3
            long r3 = r8 >> r2
            r7 = 2
            r8 = r13[r7]
            long r8 = (long) r8
            long r8 = r8 & r5
            r10 = r1[r7]
            long r10 = (long) r10
            long r10 = r10 & r5
            long r8 = r8 - r10
            long r8 = r8 + r3
            int r3 = (int) r8
            r13[r7] = r3
            long r3 = r8 >> r2
            r7 = 3
            r8 = r13[r7]
            long r8 = (long) r8
            long r8 = r8 & r5
            r10 = r1[r7]
            long r10 = (long) r10
            long r10 = r10 & r5
            long r8 = r8 - r10
            long r8 = r8 + r3
            int r3 = (int) r8
            r13[r7] = r3
            long r3 = r8 >> r2
            r7 = 4
            r8 = r13[r7]
            long r8 = (long) r8
            long r8 = r8 & r5
            r10 = r1[r7]
            long r10 = (long) r10
            long r10 = r10 & r5
            long r8 = r8 - r10
            long r8 = r8 + r3
            int r3 = (int) r8
            r13[r7] = r3
            long r3 = r8 >> r2
            r7 = 5
            r8 = r13[r7]
            long r8 = (long) r8
            long r8 = r8 & r5
            r10 = r1[r7]
            long r10 = (long) r10
            long r10 = r10 & r5
            long r8 = r8 - r10
            long r8 = r8 + r3
            int r3 = (int) r8
            r13[r7] = r3
            long r2 = r8 >> r2
            r4 = r13[r0]
            long r7 = (long) r4
            long r7 = r7 & r5
            r1 = r1[r0]
            long r9 = (long) r1
            long r4 = r9 & r5
            long r7 = r7 - r4
            long r7 = r7 + r2
            int r1 = (int) r7
            r13[r0] = r1
        L9b:
            r12.f21981Y = r13
            return
        L9e:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "x value invalid for SecP224R1FieldElement"
            r13.<init>(r0)
            throw r13
    }

    public C5667c0(int[] r1) {
            r0 = this;
            r0.<init>()
            r0.f21981Y = r1
            return
    }

    /* renamed from: u */
    public static void m11967u(int[] r2, int[] r3, int[] r4, int[] r5) {
            r0 = 14
            int[] r1 = new int[r0]
            p446z3.AbstractC7246d.m14332r(r3, r2, r1)
            p298qj.C5663b0.m11962f(r1, r3)
            p298qj.C5663b0.m11966j(r3, r3)
            int[] r3 = new int[r0]
            p446z3.AbstractC7246d.m14334t(r2, r3)
            p298qj.C5663b0.m11962f(r3, r5)
            p298qj.C5663b0.m11957a(r4, r5, r2)
            int[] r2 = new int[r0]
            p446z3.AbstractC7246d.m14332r(r4, r5, r2)
            p298qj.C5663b0.m11962f(r2, r4)
            r2 = 7
            r3 = 2
            r5 = 0
            int r2 = p085f1.AbstractC1972m.m4979N(r2, r4, r3, r5)
            p298qj.C5663b0.m11963g(r2, r4)
            return
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: a */
    public p240nj.AbstractC4846d mo10893a(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 7
            int[] r0 = new int[r0]
            int[] r1 = r2.f21981Y
            qj.c0 r3 = (p298qj.C5667c0) r3
            int[] r3 = r3.f21981Y
            p298qj.C5663b0.m11957a(r1, r3, r0)
            qj.c0 r3 = new qj.c0
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: b */
    public p240nj.AbstractC4846d mo10894b() {
            r2 = this;
            r0 = 7
            int[] r0 = new int[r0]
            int[] r1 = r2.f21981Y
            p298qj.C5663b0.m11958b(r1, r0)
            qj.c0 r1 = new qj.c0
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: d */
    public p240nj.AbstractC4846d mo10896d(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 7
            int[] r0 = new int[r0]
            int[] r1 = p298qj.C5663b0.f21970a
            qj.c0 r3 = (p298qj.C5667c0) r3
            int[] r3 = r3.f21981Y
            p446z3.AbstractC7246d.m14327m(r1, r3, r0)
            int[] r3 = r2.f21981Y
            p298qj.C5663b0.m11960d(r0, r3, r0)
            qj.c0 r3 = new qj.c0
            r3.<init>(r0)
            return r3
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p298qj.C5667c0
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            qj.c0 r2 = (p298qj.C5667c0) r2
            int[] r0 = r1.f21981Y
            int[] r2 = r2.f21981Y
            boolean r2 = p446z3.AbstractC7246d.m14320f(r0, r2)
            return r2
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: f */
    public int mo10898f() {
            r1 = this;
            java.math.BigInteger r0 = p298qj.C5667c0.f21980Z
            int r0 = r0.bitLength()
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: g */
    public p240nj.AbstractC4846d mo10899g() {
            r3 = this;
            r0 = 7
            int[] r0 = new int[r0]
            int[] r1 = p298qj.C5663b0.f21970a
            int[] r2 = r3.f21981Y
            p446z3.AbstractC7246d.m14327m(r1, r2, r0)
            qj.c0 r1 = new qj.c0
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: h */
    public boolean mo10900h() {
            r1 = this;
            int[] r0 = r1.f21981Y
            boolean r0 = p446z3.AbstractC7246d.m14328n(r0)
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.math.BigInteger r0 = p298qj.C5667c0.f21980Z
            int r0 = r0.hashCode()
            int[] r1 = r4.f21981Y
            r2 = 0
            r3 = 7
            int r1 = p400wj.C6888a.m13954f(r1, r2, r3)
            r0 = r0 ^ r1
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: i */
    public boolean mo10901i() {
            r1 = this;
            int[] r0 = r1.f21981Y
            boolean r0 = p446z3.AbstractC7246d.m14329o(r0)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: j */
    public p240nj.AbstractC4846d mo10902j(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 7
            int[] r0 = new int[r0]
            int[] r1 = r2.f21981Y
            qj.c0 r3 = (p298qj.C5667c0) r3
            int[] r3 = r3.f21981Y
            p298qj.C5663b0.m11960d(r1, r3, r0)
            qj.c0 r3 = new qj.c0
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: m */
    public p240nj.AbstractC4846d mo10905m() {
            r2 = this;
            r0 = 7
            int[] r0 = new int[r0]
            int[] r1 = r2.f21981Y
            p298qj.C5663b0.m11961e(r1, r0)
            qj.c0 r1 = new qj.c0
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: n */
    public p240nj.AbstractC4846d mo10906n() {
            r17 = this;
            r0 = r17
            int[] r1 = r0.f21981Y
            boolean r2 = p446z3.AbstractC7246d.m14329o(r1)
            if (r2 != 0) goto L142
            boolean r2 = p446z3.AbstractC7246d.m14328n(r1)
            if (r2 == 0) goto L12
            goto L142
        L12:
            r2 = 7
            int[] r3 = new int[r2]
            p298qj.C5663b0.m11961e(r1, r3)
            int[] r4 = p298qj.C5663b0.f21970a
            int r5 = r4.length
            java.util.Random r6 = new java.util.Random
            r6.<init>()
            int[] r7 = new int[r5]
            int r8 = r5 + (-1)
            r9 = r4[r8]
            int r10 = r9 >>> 1
            r9 = r9 | r10
            int r10 = r9 >>> 2
            r9 = r9 | r10
            int r10 = r9 >>> 4
            r9 = r9 | r10
            int r10 = r9 >>> 8
            r9 = r9 | r10
            int r10 = r9 >>> 16
            r9 = r9 | r10
        L35:
            r10 = 0
            r11 = 0
        L37:
            if (r11 == r5) goto L42
            int r12 = r6.nextInt()
            r7[r11] = r12
            int r11 = r11 + 1
            goto L37
        L42:
            r11 = r7[r8]
            r11 = r11 & r9
            r7[r8] = r11
            boolean r11 = p085f1.AbstractC1972m.m5019x(r5, r7, r4)
            if (r11 != 0) goto L35
            int[] r4 = new int[r2]
            int[] r5 = new int[r2]
            int[] r6 = new int[r2]
            p446z3.AbstractC7246d.m14318d(r1, r5)
            r8 = 0
        L57:
            r9 = 14
            r11 = 1
            if (r8 >= r2) goto L78
            p446z3.AbstractC7246d.m14318d(r5, r6)
            int r11 = r11 << r8
            int[] r12 = new int[r9]
        L62:
            p446z3.AbstractC7246d.m14334t(r5, r12)
            p298qj.C5663b0.m11962f(r12, r5)
            int r11 = r11 + (-1)
            if (r11 <= 0) goto L6d
            goto L62
        L6d:
            int[] r9 = new int[r9]
            p446z3.AbstractC7246d.m14332r(r5, r6, r9)
            p298qj.C5663b0.m11962f(r9, r5)
            int r8 = r8 + 1
            goto L57
        L78:
            r6 = 95
            int[] r8 = new int[r9]
        L7c:
            p446z3.AbstractC7246d.m14334t(r5, r8)
            p298qj.C5663b0.m11962f(r8, r5)
            int r6 = r6 + (-1)
            if (r6 <= 0) goto L87
            goto L7c
        L87:
            boolean r5 = p446z3.AbstractC7246d.m14328n(r5)
            r6 = 0
            if (r5 != 0) goto L8f
            return r6
        L8f:
            int[] r5 = new int[r2]
            p446z3.AbstractC7246d.m14318d(r7, r5)
            int[] r8 = new int[r2]
            r8[r10] = r11
            int[] r12 = new int[r2]
            p446z3.AbstractC7246d.m14318d(r3, r12)
            int[] r13 = new int[r2]
            int[] r14 = new int[r2]
            r15 = 0
        La2:
            if (r15 >= r2) goto Lf9
            p446z3.AbstractC7246d.m14318d(r5, r13)
            p446z3.AbstractC7246d.m14318d(r8, r14)
            int r16 = r11 << r15
        Lac:
            int r16 = r16 + (-1)
            if (r16 < 0) goto Lb4
            m11967u(r5, r8, r12, r4)
            goto Lac
        Lb4:
            int[] r6 = new int[r9]
            p446z3.AbstractC7246d.m14332r(r8, r14, r6)
            p298qj.C5663b0.m11962f(r6, r4)
            int[] r6 = new int[r9]
            p446z3.AbstractC7246d.m14332r(r4, r3, r6)
            p298qj.C5663b0.m11962f(r6, r4)
            int[] r6 = new int[r9]
            p446z3.AbstractC7246d.m14332r(r5, r13, r6)
            p298qj.C5663b0.m11962f(r6, r12)
            p298qj.C5663b0.m11957a(r12, r4, r12)
            int[] r6 = new int[r9]
            p446z3.AbstractC7246d.m14332r(r5, r14, r6)
            p298qj.C5663b0.m11962f(r6, r4)
            p446z3.AbstractC7246d.m14318d(r12, r5)
            int[] r6 = new int[r9]
            p446z3.AbstractC7246d.m14332r(r8, r13, r6)
            p298qj.C5663b0.m11962f(r6, r8)
            p298qj.C5663b0.m11957a(r8, r4, r8)
            int[] r6 = new int[r9]
            p446z3.AbstractC7246d.m14334t(r8, r6)
            p298qj.C5663b0.m11962f(r6, r12)
            int[] r6 = new int[r9]
            p446z3.AbstractC7246d.m14332r(r12, r3, r6)
            p298qj.C5663b0.m11962f(r6, r12)
            int r15 = r15 + 1
            r6 = 0
            goto La2
        Lf9:
            int[] r6 = new int[r2]
            int[] r13 = new int[r2]
            r14 = 1
        Lfe:
            r15 = 96
            if (r14 >= r15) goto L123
            p446z3.AbstractC7246d.m14318d(r5, r6)
            p446z3.AbstractC7246d.m14318d(r8, r13)
            m11967u(r5, r8, r12, r4)
            boolean r15 = p446z3.AbstractC7246d.m14329o(r5)
            if (r15 == 0) goto L120
            int[] r5 = p298qj.C5663b0.f21970a
            p446z3.AbstractC7246d.m14327m(r5, r13, r4)
            int[] r5 = new int[r9]
            p446z3.AbstractC7246d.m14332r(r4, r6, r5)
            p298qj.C5663b0.m11962f(r5, r4)
            r5 = 1
            goto L124
        L120:
            int r14 = r14 + 1
            goto Lfe
        L123:
            r5 = 0
        L124:
            if (r5 != 0) goto L12c
            p298qj.C5663b0.m11958b(r7, r7)
            r6 = 0
            goto L8f
        L12c:
            int[] r2 = new int[r9]
            p446z3.AbstractC7246d.m14334t(r4, r2)
            p298qj.C5663b0.m11962f(r2, r7)
            boolean r1 = p446z3.AbstractC7246d.m14320f(r1, r7)
            if (r1 == 0) goto L140
            qj.c0 r6 = new qj.c0
            r6.<init>(r4)
            goto L141
        L140:
            r6 = 0
        L141:
            return r6
        L142:
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: o */
    public p240nj.AbstractC4846d mo10907o() {
            r2 = this;
            r0 = 7
            int[] r0 = new int[r0]
            int[] r1 = r2.f21981Y
            p298qj.C5663b0.m11964h(r1, r0)
            qj.c0 r1 = new qj.c0
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: r */
    public p240nj.AbstractC4846d mo10910r(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 7
            int[] r0 = new int[r0]
            int[] r1 = r2.f21981Y
            qj.c0 r3 = (p298qj.C5667c0) r3
            int[] r3 = r3.f21981Y
            p298qj.C5663b0.m11965i(r1, r3, r0)
            qj.c0 r3 = new qj.c0
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: s */
    public boolean mo10911s() {
            r3 = this;
            int[] r0 = r3.f21981Y
            r1 = 0
            int r0 = p446z3.AbstractC7246d.m14322h(r0, r1)
            r2 = 1
            if (r0 != r2) goto Lb
            r1 = 1
        Lb:
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: t */
    public java.math.BigInteger mo10912t() {
            r1 = this;
            int[] r0 = r1.f21981Y
            java.math.BigInteger r0 = p446z3.AbstractC7246d.m14336v(r0)
            return r0
    }
}
