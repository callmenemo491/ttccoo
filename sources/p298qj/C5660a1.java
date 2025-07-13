package p298qj;

/* renamed from: qj.a1 */
/* loaded from: classes.dex */
public class C5660a1 extends p240nj.AbstractC4846d.a {

    /* renamed from: Y */
    public long[] f21965Y;

    public C5660a1() {
            r1 = this;
            r1.<init>()
            r0 = 3
            long[] r0 = new long[r0]
            r1.f21965Y = r0
            return
    }

    public C5660a1(java.math.BigInteger r14) {
            r13 = this;
            r13.<init>()
            if (r14 == 0) goto L3f
            int r0 = r14.signum()
            if (r0 < 0) goto L3f
            int r0 = r14.bitLength()
            r1 = 131(0x83, float:1.84E-43)
            if (r0 > r1) goto L3f
            long[] r14 = p085f1.AbstractC1972m.m5016u(r14)
            r0 = 2
            r1 = r14[r0]
            r3 = 3
            long r4 = r1 >>> r3
            r6 = 0
            r7 = r14[r6]
            long r9 = r4 << r0
            long r9 = r9 ^ r4
            long r11 = r4 << r3
            long r9 = r9 ^ r11
            r3 = 8
            long r11 = r4 << r3
            long r9 = r9 ^ r11
            long r7 = r7 ^ r9
            r14[r6] = r7
            r3 = 1
            r6 = r14[r3]
            r8 = 56
            long r4 = r4 >>> r8
            long r4 = r4 ^ r6
            r14[r3] = r4
            r3 = 7
            long r1 = r1 & r3
            r14[r0] = r1
            r13.f21965Y = r14
            return
        L3f:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "x value invalid for SecT131FieldElement"
            r14.<init>(r0)
            throw r14
    }

    public C5660a1(long[] r1) {
            r0 = this;
            r0.<init>()
            r0.f21965Y = r1
            return
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: a */
    public p240nj.AbstractC4846d mo10893a(p240nj.AbstractC4846d r8) {
            r7 = this;
            r0 = 3
            long[] r0 = new long[r0]
            long[] r1 = r7.f21965Y
            qj.a1 r8 = (p298qj.C5660a1) r8
            long[] r8 = r8.f21965Y
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
            qj.a1 r8 = new qj.a1
            r8.<init>(r0)
            return r8
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: b */
    public p240nj.AbstractC4846d mo10894b() {
            r7 = this;
            r0 = 3
            long[] r0 = new long[r0]
            long[] r1 = r7.f21965Y
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
            qj.a1 r1 = new qj.a1
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

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p298qj.C5660a1
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            qj.a1 r2 = (p298qj.C5660a1) r2
            long[] r0 = r1.f21965Y
            long[] r2 = r2.f21965Y
            boolean r2 = p085f1.AbstractC1972m.m5013r(r0, r2)
            return r2
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: f */
    public int mo10898f() {
            r1 = this;
            r0 = 131(0x83, float:1.84E-43)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: g */
    public p240nj.AbstractC4846d mo10899g() {
            r7 = this;
            r0 = 3
            long[] r1 = new long[r0]
            long[] r2 = r7.f21965Y
            boolean r3 = p085f1.AbstractC1972m.m4974I(r2)
            if (r3 != 0) goto L8b
            long[] r3 = new long[r0]
            long[] r0 = new long[r0]
            r4 = 5
            long[] r5 = new long[r4]
            p298qj.C5751z0.m12061d(r2, r5)
            p298qj.C5751z0.m12064g(r5, r3)
            r5 = 6
            long[] r6 = new long[r5]
            p298qj.C5751z0.m12059b(r3, r2, r6)
            p298qj.C5751z0.m12064g(r6, r3)
            r6 = 2
            p298qj.C5751z0.m12066i(r3, r6, r0)
            long[] r6 = new long[r5]
            p298qj.C5751z0.m12059b(r0, r3, r6)
            p298qj.C5751z0.m12064g(r6, r0)
            r6 = 4
            p298qj.C5751z0.m12066i(r0, r6, r3)
            long[] r6 = new long[r5]
            p298qj.C5751z0.m12059b(r3, r0, r6)
            p298qj.C5751z0.m12064g(r6, r3)
            r6 = 8
            p298qj.C5751z0.m12066i(r3, r6, r0)
            long[] r6 = new long[r5]
            p298qj.C5751z0.m12059b(r0, r3, r6)
            p298qj.C5751z0.m12064g(r6, r0)
            r6 = 16
            p298qj.C5751z0.m12066i(r0, r6, r3)
            long[] r6 = new long[r5]
            p298qj.C5751z0.m12059b(r3, r0, r6)
            p298qj.C5751z0.m12064g(r6, r3)
            r6 = 32
            p298qj.C5751z0.m12066i(r3, r6, r0)
            long[] r6 = new long[r5]
            p298qj.C5751z0.m12059b(r0, r3, r6)
            p298qj.C5751z0.m12064g(r6, r0)
            long[] r6 = new long[r4]
            p298qj.C5751z0.m12061d(r0, r6)
            p298qj.C5751z0.m12064g(r6, r0)
            long[] r6 = new long[r5]
            p298qj.C5751z0.m12059b(r0, r2, r6)
            p298qj.C5751z0.m12064g(r6, r0)
            r2 = 65
            p298qj.C5751z0.m12066i(r0, r2, r3)
            long[] r2 = new long[r5]
            p298qj.C5751z0.m12059b(r3, r0, r2)
            p298qj.C5751z0.m12064g(r2, r3)
            long[] r0 = new long[r4]
            p298qj.C5751z0.m12061d(r3, r0)
            p298qj.C5751z0.m12064g(r0, r1)
            qj.a1 r0 = new qj.a1
            r0.<init>(r1)
            return r0
        L8b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: h */
    public boolean mo10900h() {
            r1 = this;
            long[] r0 = r1.f21965Y
            boolean r0 = p085f1.AbstractC1972m.m4971F(r0)
            return r0
    }

    public int hashCode() {
            r3 = this;
            long[] r0 = r3.f21965Y
            r1 = 0
            r2 = 3
            int r0 = p400wj.C6888a.m13955g(r0, r1, r2)
            r1 = 131832(0x202f8, float:1.84736E-40)
            r0 = r0 ^ r1
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: i */
    public boolean mo10901i() {
            r1 = this;
            long[] r0 = r1.f21965Y
            boolean r0 = p085f1.AbstractC1972m.m4974I(r0)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: j */
    public p240nj.AbstractC4846d mo10902j(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 3
            long[] r0 = new long[r0]
            long[] r1 = r2.f21965Y
            qj.a1 r3 = (p298qj.C5660a1) r3
            long[] r3 = r3.f21965Y
            p298qj.C5751z0.m12062e(r1, r3, r0)
            qj.a1 r3 = new qj.a1
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
            long[] r0 = r2.f21965Y
            qj.a1 r3 = (p298qj.C5660a1) r3
            long[] r3 = r3.f21965Y
            qj.a1 r4 = (p298qj.C5660a1) r4
            long[] r4 = r4.f21965Y
            qj.a1 r5 = (p298qj.C5660a1) r5
            long[] r5 = r5.f21965Y
            r1 = 5
            long[] r1 = new long[r1]
            p298qj.C5751z0.m12063f(r0, r3, r1)
            p298qj.C5751z0.m12063f(r4, r5, r1)
            r3 = 3
            long[] r3 = new long[r3]
            p298qj.C5751z0.m12064g(r1, r3)
            qj.a1 r4 = new qj.a1
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
            r17 = this;
            r0 = 3
            long[] r1 = new long[r0]
            r2 = r17
            long[] r3 = r2.f21965Y
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
            r5 = r3[r5]
            long r5 = gh.C2390b.m6110A(r5)
            long r8 = r5 & r10
            long r5 = r5 >>> r14
            r0[r7] = r5
            long[] r3 = p298qj.C5751z0.f22154a
            r5 = 6
            long[] r5 = new long[r5]
            p298qj.C5751z0.m12059b(r0, r3, r5)
            p298qj.C5751z0.m12064g(r5, r1)
            r5 = r1[r4]
            long r5 = r5 ^ r12
            r1[r4] = r5
            r3 = r1[r7]
            long r3 = r3 ^ r8
            r1[r7] = r3
            qj.a1 r0 = new qj.a1
            r0.<init>(r1)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: o */
    public p240nj.AbstractC4846d mo10907o() {
            r2 = this;
            r0 = 3
            long[] r0 = new long[r0]
            long[] r1 = r2.f21965Y
            p298qj.C5751z0.m12065h(r1, r0)
            qj.a1 r1 = new qj.a1
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: p */
    public p240nj.AbstractC4846d mo10908p(p240nj.AbstractC4846d r4, p240nj.AbstractC4846d r5) {
            r3 = this;
            long[] r0 = r3.f21965Y
            qj.a1 r4 = (p298qj.C5660a1) r4
            long[] r4 = r4.f21965Y
            qj.a1 r5 = (p298qj.C5660a1) r5
            long[] r5 = r5.f21965Y
            r1 = 5
            long[] r2 = new long[r1]
            long[] r1 = new long[r1]
            p298qj.C5751z0.m12061d(r0, r1)
            p298qj.C5751z0.m12058a(r2, r1, r2)
            p298qj.C5751z0.m12063f(r4, r5, r2)
            r4 = 3
            long[] r4 = new long[r4]
            p298qj.C5751z0.m12064g(r2, r4)
            qj.a1 r5 = new qj.a1
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
            r0 = 3
            long[] r0 = new long[r0]
            long[] r1 = r2.f21965Y
            p298qj.C5751z0.m12066i(r1, r3, r0)
            qj.a1 r3 = new qj.a1
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
            long[] r0 = r6.f21965Y
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
            r1 = this;
            long[] r0 = r1.f21965Y
            java.math.BigInteger r0 = p085f1.AbstractC1972m.m4995b0(r0)
            return r0
    }

    @Override // p240nj.AbstractC4846d.a
    /* renamed from: u */
    public int mo10913u() {
            r7 = this;
            long[] r0 = r7.f21965Y
            r1 = 0
            r1 = r0[r1]
            r3 = 1
            r4 = r0[r3]
            r6 = 59
            long r4 = r4 >>> r6
            long r1 = r1 ^ r4
            r4 = 2
            r4 = r0[r4]
            long r4 = r4 >>> r3
            long r0 = r1 ^ r4
            int r1 = (int) r0
            r0 = r1 & 1
            return r0
    }
}
