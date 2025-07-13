package p298qj;

/* renamed from: qj.b2 */
/* loaded from: classes.dex */
public class C5665b2 extends p240nj.AbstractC4846d.a {

    /* renamed from: Y */
    public long[] f21977Y;

    public C5665b2() {
            r1 = this;
            r1.<init>()
            r0 = 5
            long[] r0 = new long[r0]
            r1.f21977Y = r0
            return
    }

    public C5665b2(java.math.BigInteger r14) {
            r13 = this;
            r13.<init>()
            if (r14 == 0) goto L63
            int r0 = r14.signum()
            if (r0 < 0) goto L63
            int r0 = r14.bitLength()
            r1 = 283(0x11b, float:3.97E-43)
            if (r0 > r1) goto L63
            int r0 = r14.signum()
            if (r0 < 0) goto L5d
            int r0 = r14.bitLength()
            r1 = 320(0x140, float:4.48E-43)
            if (r0 > r1) goto L5d
            r0 = 5
            long[] r1 = new long[r0]
            r2 = 0
            r3 = 0
        L26:
            int r4 = r14.signum()
            if (r4 == 0) goto L3c
            int r4 = r3 + 1
            long r5 = r14.longValue()
            r1[r3] = r5
            r3 = 64
            java.math.BigInteger r14 = r14.shiftRight(r3)
            r3 = r4
            goto L26
        L3c:
            r14 = 4
            r3 = r1[r14]
            r5 = 27
            long r5 = r3 >>> r5
            r7 = r1[r2]
            long r9 = r5 << r0
            long r9 = r9 ^ r5
            r0 = 7
            long r11 = r5 << r0
            long r9 = r9 ^ r11
            r0 = 12
            long r5 = r5 << r0
            long r5 = r5 ^ r9
            long r5 = r5 ^ r7
            r1[r2] = r5
            r5 = 134217727(0x7ffffff, double:6.6312368E-316)
            long r2 = r3 & r5
            r1[r14] = r2
            r13.f21977Y = r1
            return
        L5d:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>()
            throw r14
        L63:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "x value invalid for SecT283FieldElement"
            r14.<init>(r0)
            throw r14
    }

    public C5665b2(long[] r1) {
            r0 = this;
            r0.<init>()
            r0.f21977Y = r1
            return
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: a */
    public p240nj.AbstractC4846d mo10893a(p240nj.AbstractC4846d r8) {
            r7 = this;
            r0 = 5
            long[] r0 = new long[r0]
            long[] r1 = r7.f21977Y
            qj.b2 r8 = (p298qj.C5665b2) r8
            long[] r8 = r8.f21977Y
            r2 = 0
            r3 = r1[r2]
            r5 = r8[r2]
            long r3 = r3 ^ r5
            r0[r2] = r3
            r2 = 1
            r3 = r1[r2]
            r5 = r8[r2]
            long r3 = r3 ^ r5
            r0[r2] = r3
            r2 = 2
            r3 = r1[r2]
            r5 = r8[r2]
            long r3 = r3 ^ r5
            r0[r2] = r3
            r2 = 3
            r3 = r1[r2]
            r5 = r8[r2]
            long r3 = r3 ^ r5
            r0[r2] = r3
            r2 = 4
            r3 = r1[r2]
            r5 = r8[r2]
            long r3 = r3 ^ r5
            r0[r2] = r3
            qj.b2 r8 = new qj.b2
            r8.<init>(r0)
            return r8
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: b */
    public p240nj.AbstractC4846d mo10894b() {
            r7 = this;
            r0 = 5
            long[] r0 = new long[r0]
            long[] r1 = r7.f21977Y
            r2 = 0
            r3 = r1[r2]
            r5 = 1
            long r3 = r3 ^ r5
            r0[r2] = r3
            r2 = 1
            r3 = r1[r2]
            r0[r2] = r3
            r2 = 2
            r3 = r1[r2]
            r0[r2] = r3
            r2 = 3
            r3 = r1[r2]
            r0[r2] = r3
            r2 = 4
            r3 = r1[r2]
            r0[r2] = r3
            qj.b2 r1 = new qj.b2
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: d */
    public p240nj.AbstractC4846d mo10896d(p240nj.AbstractC4846d r1) {
            r0 = this;
            nj.d r1 = r1.mo10899g()
            nj.d r1 = r0.mo10902j(r1)
            return r1
    }

    public boolean equals(java.lang.Object r10) {
            r9 = this;
            r0 = 1
            if (r10 != r9) goto L4
            return r0
        L4:
            boolean r1 = r10 instanceof p298qj.C5665b2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qj.b2 r10 = (p298qj.C5665b2) r10
            long[] r1 = r9.f21977Y
            long[] r10 = r10.f21977Y
            r3 = 4
        L11:
            if (r3 < 0) goto L20
            r4 = r1[r3]
            r6 = r10[r3]
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L1d
            r0 = 0
            goto L20
        L1d:
            int r3 = r3 + (-1)
            goto L11
        L20:
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: f */
    public int mo10898f() {
            r1 = this;
            r0 = 283(0x11b, float:3.97E-43)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: g */
    public p240nj.AbstractC4846d mo10899g() {
            r7 = this;
            r0 = 5
            long[] r1 = new long[r0]
            long[] r2 = r7.f21977Y
            boolean r3 = p139i1.AbstractC3061d.m7482l(r2)
            if (r3 != 0) goto Lba
            long[] r3 = new long[r0]
            long[] r0 = new long[r0]
            r4 = 9
            long[] r5 = new long[r4]
            p298qj.C5661a2.m11942e(r2, r5)
            p298qj.C5661a2.m11945h(r5, r3)
            r5 = 10
            long[] r6 = new long[r5]
            p298qj.C5661a2.m11940c(r3, r2, r6)
            p298qj.C5661a2.m11945h(r6, r3)
            r6 = 2
            p298qj.C5661a2.m11947j(r3, r6, r0)
            long[] r6 = new long[r5]
            p298qj.C5661a2.m11940c(r0, r3, r6)
            p298qj.C5661a2.m11945h(r6, r0)
            r6 = 4
            p298qj.C5661a2.m11947j(r0, r6, r3)
            long[] r6 = new long[r5]
            p298qj.C5661a2.m11940c(r3, r0, r6)
            p298qj.C5661a2.m11945h(r6, r3)
            r6 = 8
            p298qj.C5661a2.m11947j(r3, r6, r0)
            long[] r6 = new long[r5]
            p298qj.C5661a2.m11940c(r0, r3, r6)
            p298qj.C5661a2.m11945h(r6, r0)
            long[] r6 = new long[r4]
            p298qj.C5661a2.m11942e(r0, r6)
            p298qj.C5661a2.m11945h(r6, r0)
            long[] r6 = new long[r5]
            p298qj.C5661a2.m11940c(r0, r2, r6)
            p298qj.C5661a2.m11945h(r6, r0)
            r6 = 17
            p298qj.C5661a2.m11947j(r0, r6, r3)
            long[] r6 = new long[r5]
            p298qj.C5661a2.m11940c(r3, r0, r6)
            p298qj.C5661a2.m11945h(r6, r3)
            long[] r6 = new long[r4]
            p298qj.C5661a2.m11942e(r3, r6)
            p298qj.C5661a2.m11945h(r6, r3)
            long[] r6 = new long[r5]
            p298qj.C5661a2.m11940c(r3, r2, r6)
            p298qj.C5661a2.m11945h(r6, r3)
            r6 = 35
            p298qj.C5661a2.m11947j(r3, r6, r0)
            long[] r6 = new long[r5]
            p298qj.C5661a2.m11940c(r0, r3, r6)
            p298qj.C5661a2.m11945h(r6, r0)
            r6 = 70
            p298qj.C5661a2.m11947j(r0, r6, r3)
            long[] r6 = new long[r5]
            p298qj.C5661a2.m11940c(r3, r0, r6)
            p298qj.C5661a2.m11945h(r6, r3)
            long[] r6 = new long[r4]
            p298qj.C5661a2.m11942e(r3, r6)
            p298qj.C5661a2.m11945h(r6, r3)
            long[] r6 = new long[r5]
            p298qj.C5661a2.m11940c(r3, r2, r6)
            p298qj.C5661a2.m11945h(r6, r3)
            r2 = 141(0x8d, float:1.98E-43)
            p298qj.C5661a2.m11947j(r3, r2, r0)
            long[] r2 = new long[r5]
            p298qj.C5661a2.m11940c(r0, r3, r2)
            p298qj.C5661a2.m11945h(r2, r0)
            long[] r2 = new long[r4]
            p298qj.C5661a2.m11942e(r0, r2)
            p298qj.C5661a2.m11945h(r2, r1)
            qj.b2 r0 = new qj.b2
            r0.<init>(r1)
            return r0
        Lba:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: h */
    public boolean mo10900h() {
            r9 = this;
            long[] r0 = r9.f21977Y
            r1 = 0
            r2 = r0[r1]
            r4 = 1
            r6 = 1
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto Ld
            goto L1e
        Ld:
            r2 = 1
        Le:
            r3 = 5
            if (r2 >= r3) goto L1d
            r3 = r0[r2]
            r7 = 0
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 == 0) goto L1a
            goto L1e
        L1a:
            int r2 = r2 + 1
            goto Le
        L1d:
            r1 = 1
        L1e:
            return r1
    }

    public int hashCode() {
            r3 = this;
            long[] r0 = r3.f21977Y
            r1 = 0
            r2 = 5
            int r0 = p400wj.C6888a.m13955g(r0, r1, r2)
            r1 = 2831275(0x2b33ab, float:3.967461E-39)
            r0 = r0 ^ r1
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: i */
    public boolean mo10901i() {
            r1 = this;
            long[] r0 = r1.f21977Y
            boolean r0 = p139i1.AbstractC3061d.m7482l(r0)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: j */
    public p240nj.AbstractC4846d mo10902j(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 5
            long[] r0 = new long[r0]
            long[] r1 = r2.f21977Y
            qj.b2 r3 = (p298qj.C5665b2) r3
            long[] r3 = r3.f21977Y
            p298qj.C5661a2.m11943f(r1, r3, r0)
            qj.b2 r3 = new qj.b2
            r3.<init>(r0)
            return r3
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
            long[] r0 = r2.f21977Y
            qj.b2 r3 = (p298qj.C5665b2) r3
            long[] r3 = r3.f21977Y
            qj.b2 r4 = (p298qj.C5665b2) r4
            long[] r4 = r4.f21977Y
            qj.b2 r5 = (p298qj.C5665b2) r5
            long[] r5 = r5.f21977Y
            r1 = 9
            long[] r1 = new long[r1]
            p298qj.C5661a2.m11944g(r0, r3, r1)
            p298qj.C5661a2.m11944g(r4, r5, r1)
            r3 = 5
            long[] r3 = new long[r3]
            p298qj.C5661a2.m11945h(r1, r3)
            qj.b2 r4 = new qj.b2
            r4.<init>(r3)
            return r4
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
            r23 = this;
            r0 = 5
            long[] r1 = new long[r0]
            r2 = r23
            long[] r3 = r2.f21977Y
            long[] r0 = new long[r0]
            r4 = 0
            r5 = r3[r4]
            long r5 = gh.C2390b.m6110A(r5)
            r7 = 1
            r8 = r3[r7]
            long r8 = gh.C2390b.m6110A(r8)
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r5 & r10
            r14 = 32
            long r15 = r8 << r14
            long r12 = r12 | r15
            long r5 = r5 >>> r14
            r15 = -4294967296(0xffffffff00000000, double:NaN)
            long r8 = r8 & r15
            long r5 = r5 | r8
            r0[r4] = r5
            r5 = 2
            r8 = r3[r5]
            long r8 = gh.C2390b.m6110A(r8)
            r6 = 3
            r17 = r3[r6]
            long r17 = gh.C2390b.m6110A(r17)
            long r19 = r8 & r10
            long r21 = r17 << r14
            long r19 = r19 | r21
            long r8 = r8 >>> r14
            long r15 = r17 & r15
            long r8 = r8 | r15
            r0[r7] = r8
            r6 = 4
            r8 = r3[r6]
            long r8 = gh.C2390b.m6110A(r8)
            long r10 = r10 & r8
            long r8 = r8 >>> r14
            r0[r5] = r8
            long[] r3 = p298qj.C5661a2.f21966a
            r6 = 10
            long[] r6 = new long[r6]
            p298qj.C5661a2.m11940c(r0, r3, r6)
            p298qj.C5661a2.m11945h(r6, r1)
            r8 = r1[r4]
            long r8 = r8 ^ r12
            r1[r4] = r8
            r3 = r1[r7]
            long r3 = r3 ^ r19
            r1[r7] = r3
            r3 = r1[r5]
            long r3 = r3 ^ r10
            r1[r5] = r3
            qj.b2 r0 = new qj.b2
            r0.<init>(r1)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: o */
    public p240nj.AbstractC4846d mo10907o() {
            r2 = this;
            r0 = 5
            long[] r0 = new long[r0]
            long[] r1 = r2.f21977Y
            p298qj.C5661a2.m11946i(r1, r0)
            qj.b2 r1 = new qj.b2
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: p */
    public p240nj.AbstractC4846d mo10908p(p240nj.AbstractC4846d r4, p240nj.AbstractC4846d r5) {
            r3 = this;
            long[] r0 = r3.f21977Y
            qj.b2 r4 = (p298qj.C5665b2) r4
            long[] r4 = r4.f21977Y
            qj.b2 r5 = (p298qj.C5665b2) r5
            long[] r5 = r5.f21977Y
            r1 = 9
            long[] r2 = new long[r1]
            long[] r1 = new long[r1]
            p298qj.C5661a2.m11942e(r0, r1)
            p298qj.C5661a2.m11938a(r2, r1, r2)
            p298qj.C5661a2.m11944g(r4, r5, r2)
            r4 = 5
            long[] r4 = new long[r4]
            p298qj.C5661a2.m11945h(r2, r4)
            qj.b2 r5 = new qj.b2
            r5.<init>(r4)
            return r5
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: q */
    public p240nj.AbstractC4846d mo10909q(int r3) {
            r2 = this;
            r0 = 1
            if (r3 >= r0) goto L4
            return r2
        L4:
            r0 = 5
            long[] r0 = new long[r0]
            long[] r1 = r2.f21977Y
            p298qj.C5661a2.m11947j(r1, r3, r0)
            qj.b2 r3 = new qj.b2
            r3.<init>(r0)
            return r3
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
            long[] r0 = r6.f21977Y
            r1 = 0
            r2 = r0[r1]
            r4 = 1
            long r2 = r2 & r4
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto Lf
            r1 = 1
        Lf:
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: t */
    public java.math.BigInteger mo10912t() {
            r8 = this;
            long[] r0 = r8.f21977Y
            r1 = 40
            byte[] r1 = new byte[r1]
            r2 = 0
        L7:
            r3 = 5
            if (r2 >= r3) goto L1c
            r3 = r0[r2]
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L19
            int r5 = 4 - r2
            int r5 = r5 << 3
            p446z3.AbstractC7246d.m14331q(r3, r1, r5)
        L19:
            int r2 = r2 + 1
            goto L7
        L1c:
            java.math.BigInteger r0 = new java.math.BigInteger
            r2 = 1
            r0.<init>(r2, r1)
            return r0
    }

    @Override // p240nj.AbstractC4846d.a
    /* renamed from: u */
    public int mo10913u() {
            r5 = this;
            long[] r0 = r5.f21977Y
            r1 = 0
            r1 = r0[r1]
            r3 = 4
            r3 = r0[r3]
            r0 = 15
            long r3 = r3 >>> r0
            long r0 = r1 ^ r3
            int r1 = (int) r0
            r0 = r1 & 1
            return r0
    }
}
