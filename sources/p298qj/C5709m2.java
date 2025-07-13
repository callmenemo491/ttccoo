package p298qj;

/* renamed from: qj.m2 */
/* loaded from: classes.dex */
public class C5709m2 extends p240nj.AbstractC4846d.a {

    /* renamed from: Y */
    public long[] f22067Y;

    public C5709m2() {
            r1 = this;
            r1.<init>()
            r0 = 9
            long[] r0 = new long[r0]
            r1.f22067Y = r0
            return
    }

    public C5709m2(java.math.BigInteger r7) {
            r6 = this;
            r6.<init>()
            if (r7 == 0) goto L49
            int r0 = r7.signum()
            if (r0 < 0) goto L49
            int r0 = r7.bitLength()
            r1 = 571(0x23b, float:8.0E-43)
            if (r0 > r1) goto L49
            int r0 = r7.signum()
            if (r0 < 0) goto L43
            int r0 = r7.bitLength()
            r1 = 576(0x240, float:8.07E-43)
            if (r0 > r1) goto L43
            r0 = 9
            long[] r0 = new long[r0]
            r1 = 0
            r2 = 0
        L27:
            int r3 = r7.signum()
            if (r3 == 0) goto L3d
            int r3 = r2 + 1
            long r4 = r7.longValue()
            r0[r2] = r4
            r2 = 64
            java.math.BigInteger r7 = r7.shiftRight(r2)
            r2 = r3
            goto L27
        L3d:
            p298qj.C5705l2.m12019m(r0, r1)
            r6.f22067Y = r0
            return
        L43:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        L49:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "x value invalid for SecT571FieldElement"
            r7.<init>(r0)
            throw r7
    }

    public C5709m2(long[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22067Y = r1
            return
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: a */
    public p240nj.AbstractC4846d mo10893a(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 9
            long[] r0 = new long[r0]
            long[] r1 = r2.f22067Y
            qj.m2 r3 = (p298qj.C5709m2) r3
            long[] r3 = r3.f22067Y
            p298qj.C5705l2.m12007a(r1, r3, r0)
            qj.m2 r3 = new qj.m2
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: b */
    public p240nj.AbstractC4846d mo10894b() {
            r2 = this;
            r0 = 9
            long[] r0 = new long[r0]
            long[] r1 = r2.f22067Y
            p298qj.C5705l2.m12011e(r1, r0)
            qj.m2 r1 = new qj.m2
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
            boolean r1 = r10 instanceof p298qj.C5709m2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qj.m2 r10 = (p298qj.C5709m2) r10
            long[] r1 = r9.f22067Y
            long[] r10 = r10.f22067Y
            r3 = 8
        L12:
            if (r3 < 0) goto L21
            r4 = r1[r3]
            r6 = r10[r3]
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L1e
            r0 = 0
            goto L21
        L1e:
            int r3 = r3 + (-1)
            goto L12
        L21:
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: f */
    public int mo10898f() {
            r1 = this;
            r0 = 571(0x23b, float:8.0E-43)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: g */
    public p240nj.AbstractC4846d mo10899g() {
            r5 = this;
            r0 = 9
            long[] r1 = new long[r0]
            long[] r2 = r5.f22067Y
            boolean r3 = p139i1.AbstractC3061d.m7483m(r2)
            if (r3 != 0) goto L6d
            long[] r3 = new long[r0]
            long[] r4 = new long[r0]
            long[] r0 = new long[r0]
            p298qj.C5705l2.m12020n(r2, r0)
            p298qj.C5705l2.m12020n(r0, r3)
            p298qj.C5705l2.m12020n(r3, r4)
            p298qj.C5705l2.m12014h(r3, r4, r3)
            r2 = 2
            p298qj.C5705l2.m12022p(r3, r2, r4)
            p298qj.C5705l2.m12014h(r3, r4, r3)
            p298qj.C5705l2.m12014h(r3, r0, r3)
            r2 = 5
            p298qj.C5705l2.m12022p(r3, r2, r4)
            p298qj.C5705l2.m12014h(r3, r4, r3)
            p298qj.C5705l2.m12022p(r4, r2, r4)
            p298qj.C5705l2.m12014h(r3, r4, r3)
            r2 = 15
            p298qj.C5705l2.m12022p(r3, r2, r4)
            p298qj.C5705l2.m12014h(r3, r4, r0)
            r2 = 30
            p298qj.C5705l2.m12022p(r0, r2, r3)
            p298qj.C5705l2.m12022p(r3, r2, r4)
            p298qj.C5705l2.m12014h(r3, r4, r3)
            r2 = 60
            p298qj.C5705l2.m12022p(r3, r2, r4)
            p298qj.C5705l2.m12014h(r3, r4, r3)
            p298qj.C5705l2.m12022p(r4, r2, r4)
            p298qj.C5705l2.m12014h(r3, r4, r3)
            r2 = 180(0xb4, float:2.52E-43)
            p298qj.C5705l2.m12022p(r3, r2, r4)
            p298qj.C5705l2.m12014h(r3, r4, r3)
            p298qj.C5705l2.m12022p(r4, r2, r4)
            p298qj.C5705l2.m12014h(r3, r4, r3)
            p298qj.C5705l2.m12014h(r3, r0, r1)
            qj.m2 r0 = new qj.m2
            r0.<init>(r1)
            return r0
        L6d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: h */
    public boolean mo10900h() {
            r9 = this;
            long[] r0 = r9.f22067Y
            r1 = 0
            r2 = r0[r1]
            r4 = 1
            r6 = 1
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto Ld
            goto L1f
        Ld:
            r2 = 1
        Le:
            r3 = 9
            if (r2 >= r3) goto L1e
            r3 = r0[r2]
            r7 = 0
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 == 0) goto L1b
            goto L1f
        L1b:
            int r2 = r2 + 1
            goto Le
        L1e:
            r1 = 1
        L1f:
            return r1
    }

    public int hashCode() {
            r3 = this;
            long[] r0 = r3.f22067Y
            r1 = 0
            r2 = 9
            int r0 = p400wj.C6888a.m13955g(r0, r1, r2)
            r1 = 5711052(0x5724cc, float:8.002888E-39)
            r0 = r0 ^ r1
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: i */
    public boolean mo10901i() {
            r1 = this;
            long[] r0 = r1.f22067Y
            boolean r0 = p139i1.AbstractC3061d.m7483m(r0)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: j */
    public p240nj.AbstractC4846d mo10902j(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 9
            long[] r0 = new long[r0]
            long[] r1 = r2.f22067Y
            qj.m2 r3 = (p298qj.C5709m2) r3
            long[] r3 = r3.f22067Y
            p298qj.C5705l2.m12014h(r1, r3, r0)
            qj.m2 r3 = new qj.m2
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
            long[] r0 = r2.f22067Y
            qj.m2 r3 = (p298qj.C5709m2) r3
            long[] r3 = r3.f22067Y
            qj.m2 r4 = (p298qj.C5709m2) r4
            long[] r4 = r4.f22067Y
            qj.m2 r5 = (p298qj.C5709m2) r5
            long[] r5 = r5.f22067Y
            r1 = 18
            long[] r1 = new long[r1]
            p298qj.C5705l2.m12015i(r0, r3, r1)
            p298qj.C5705l2.m12015i(r4, r5, r1)
            r3 = 9
            long[] r3 = new long[r3]
            p298qj.C5705l2.m12018l(r1, r3)
            qj.m2 r4 = new qj.m2
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
            r0 = 9
            long[] r1 = new long[r0]
            r2 = r17
            long[] r3 = r2.f22067Y
            long[] r4 = new long[r0]
            long[] r0 = new long[r0]
            r5 = 0
            r6 = 0
        Le:
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r9 = 32
            r10 = 4
            if (r5 >= r10) goto L3c
            int r10 = r6 + 1
            r11 = r3[r6]
            long r11 = gh.C2390b.m6110A(r11)
            int r6 = r10 + 1
            r13 = r3[r10]
            long r13 = gh.C2390b.m6110A(r13)
            long r7 = r7 & r11
            long r15 = r13 << r9
            long r7 = r7 | r15
            r4[r5] = r7
            long r7 = r11 >>> r9
            r9 = -4294967296(0xffffffff00000000, double:NaN)
            long r9 = r9 & r13
            long r7 = r7 | r9
            r0[r5] = r7
            int r5 = r5 + 1
            goto Le
        L3c:
            r5 = r3[r6]
            long r5 = gh.C2390b.m6110A(r5)
            long r7 = r7 & r5
            r4[r10] = r7
            long r5 = r5 >>> r9
            r0[r10] = r5
            long[] r3 = p298qj.C5705l2.f22059a
            p298qj.C5705l2.m12014h(r0, r3, r1)
            p298qj.C5705l2.m12007a(r1, r4, r1)
            qj.m2 r0 = new qj.m2
            r0.<init>(r1)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: o */
    public p240nj.AbstractC4846d mo10907o() {
            r2 = this;
            r0 = 9
            long[] r0 = new long[r0]
            long[] r1 = r2.f22067Y
            p298qj.C5705l2.m12020n(r1, r0)
            qj.m2 r1 = new qj.m2
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: p */
    public p240nj.AbstractC4846d mo10908p(p240nj.AbstractC4846d r3, p240nj.AbstractC4846d r4) {
            r2 = this;
            long[] r0 = r2.f22067Y
            qj.m2 r3 = (p298qj.C5709m2) r3
            long[] r3 = r3.f22067Y
            qj.m2 r4 = (p298qj.C5709m2) r4
            long[] r4 = r4.f22067Y
            r1 = 18
            long[] r1 = new long[r1]
            p298qj.C5705l2.m12021o(r0, r1)
            p298qj.C5705l2.m12015i(r3, r4, r1)
            r3 = 9
            long[] r3 = new long[r3]
            p298qj.C5705l2.m12018l(r1, r3)
            qj.m2 r4 = new qj.m2
            r4.<init>(r3)
            return r4
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: q */
    public p240nj.AbstractC4846d mo10909q(int r3) {
            r2 = this;
            r0 = 1
            if (r3 >= r0) goto L4
            return r2
        L4:
            r0 = 9
            long[] r0 = new long[r0]
            long[] r1 = r2.f22067Y
            p298qj.C5705l2.m12022p(r1, r3, r0)
            qj.m2 r3 = new qj.m2
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
            long[] r0 = r6.f22067Y
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
            long[] r0 = r8.f22067Y
            r1 = 72
            byte[] r1 = new byte[r1]
            r2 = 0
        L7:
            r3 = 9
            if (r2 >= r3) goto L1d
            r3 = r0[r2]
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L1a
            int r5 = 8 - r2
            int r5 = r5 << 3
            p446z3.AbstractC7246d.m14331q(r3, r1, r5)
        L1a:
            int r2 = r2 + 1
            goto L7
        L1d:
            java.math.BigInteger r0 = new java.math.BigInteger
            r2 = 1
            r0.<init>(r2, r1)
            return r0
    }

    @Override // p240nj.AbstractC4846d.a
    /* renamed from: u */
    public int mo10913u() {
            r7 = this;
            long[] r0 = r7.f22067Y
            r1 = 0
            r1 = r0[r1]
            r3 = 8
            r4 = r0[r3]
            r6 = 49
            long r4 = r4 >>> r6
            long r1 = r1 ^ r4
            r3 = r0[r3]
            r0 = 57
            long r3 = r3 >>> r0
            long r0 = r1 ^ r3
            int r1 = (int) r0
            r0 = r1 & 1
            return r0
    }
}
