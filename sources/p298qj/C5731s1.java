package p298qj;

/* renamed from: qj.s1 */
/* loaded from: classes.dex */
public class C5731s1 extends p240nj.AbstractC4846d.a {

    /* renamed from: Y */
    public long[] f22115Y;

    public C5731s1() {
            r1 = this;
            r1.<init>()
            r0 = 4
            long[] r0 = new long[r0]
            r1.f22115Y = r0
            return
    }

    public C5731s1(java.math.BigInteger r10) {
            r9 = this;
            r9.<init>()
            if (r10 == 0) goto L38
            int r0 = r10.signum()
            if (r0 < 0) goto L38
            int r0 = r10.bitLength()
            r1 = 233(0xe9, float:3.27E-43)
            if (r0 > r1) goto L38
            long[] r10 = tj.AbstractC6255a.m12858o(r10)
            r0 = 3
            r1 = r10[r0]
            r3 = 41
            long r3 = r1 >>> r3
            r5 = 0
            r6 = r10[r5]
            long r6 = r6 ^ r3
            r10[r5] = r6
            r5 = 1
            r6 = r10[r5]
            r8 = 10
            long r3 = r3 << r8
            long r3 = r3 ^ r6
            r10[r5] = r3
            r3 = 2199023255551(0x1ffffffffff, double:1.0864618449737E-311)
            long r1 = r1 & r3
            r10[r0] = r1
            r9.f22115Y = r10
            return
        L38:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "x value invalid for SecT233FieldElement"
            r10.<init>(r0)
            throw r10
    }

    public C5731s1(long[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22115Y = r1
            return
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: a */
    public p240nj.AbstractC4846d mo10893a(p240nj.AbstractC4846d r8) {
            r7 = this;
            r0 = 4
            long[] r0 = new long[r0]
            long[] r1 = r7.f22115Y
            qj.s1 r8 = (p298qj.C5731s1) r8
            long[] r8 = r8.f22115Y
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
            qj.s1 r8 = new qj.s1
            r8.<init>(r0)
            return r8
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: b */
    public p240nj.AbstractC4846d mo10894b() {
            r7 = this;
            r0 = 4
            long[] r0 = new long[r0]
            long[] r1 = r7.f22115Y
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
            qj.s1 r1 = new qj.s1
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
            boolean r0 = r2 instanceof p298qj.C5731s1
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            qj.s1 r2 = (p298qj.C5731s1) r2
            long[] r0 = r1.f22115Y
            long[] r2 = r2.f22115Y
            boolean r2 = tj.AbstractC6255a.m12856m(r0, r2)
            return r2
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: f */
    public int mo10898f() {
            r1 = this;
            r0 = 233(0xe9, float:3.27E-43)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: g */
    public p240nj.AbstractC4846d mo10899g() {
            r6 = this;
            r0 = 4
            long[] r1 = new long[r0]
            long[] r2 = r6.f22115Y
            boolean r3 = tj.AbstractC6255a.m12868y(r2)
            if (r3 != 0) goto Lab
            long[] r3 = new long[r0]
            long[] r0 = new long[r0]
            r4 = 8
            long[] r5 = new long[r4]
            p080ei.C1854b.m4607i(r2, r5)
            p080ei.C1854b.m4610l(r5, r3)
            long[] r5 = new long[r4]
            p080ei.C1854b.m4605g(r3, r2, r5)
            p080ei.C1854b.m4610l(r5, r3)
            long[] r5 = new long[r4]
            p080ei.C1854b.m4607i(r3, r5)
            p080ei.C1854b.m4610l(r5, r3)
            long[] r5 = new long[r4]
            p080ei.C1854b.m4605g(r3, r2, r5)
            p080ei.C1854b.m4610l(r5, r3)
            r5 = 3
            p080ei.C1854b.m4612n(r3, r5, r0)
            long[] r5 = new long[r4]
            p080ei.C1854b.m4605g(r0, r3, r5)
            p080ei.C1854b.m4610l(r5, r0)
            long[] r5 = new long[r4]
            p080ei.C1854b.m4607i(r0, r5)
            p080ei.C1854b.m4610l(r5, r0)
            long[] r5 = new long[r4]
            p080ei.C1854b.m4605g(r0, r2, r5)
            p080ei.C1854b.m4610l(r5, r0)
            r5 = 7
            p080ei.C1854b.m4612n(r0, r5, r3)
            long[] r5 = new long[r4]
            p080ei.C1854b.m4605g(r3, r0, r5)
            p080ei.C1854b.m4610l(r5, r3)
            r5 = 14
            p080ei.C1854b.m4612n(r3, r5, r0)
            long[] r5 = new long[r4]
            p080ei.C1854b.m4605g(r0, r3, r5)
            p080ei.C1854b.m4610l(r5, r0)
            long[] r5 = new long[r4]
            p080ei.C1854b.m4607i(r0, r5)
            p080ei.C1854b.m4610l(r5, r0)
            long[] r5 = new long[r4]
            p080ei.C1854b.m4605g(r0, r2, r5)
            p080ei.C1854b.m4610l(r5, r0)
            r2 = 29
            p080ei.C1854b.m4612n(r0, r2, r3)
            long[] r2 = new long[r4]
            p080ei.C1854b.m4605g(r3, r0, r2)
            p080ei.C1854b.m4610l(r2, r3)
            r2 = 58
            p080ei.C1854b.m4612n(r3, r2, r0)
            long[] r2 = new long[r4]
            p080ei.C1854b.m4605g(r0, r3, r2)
            p080ei.C1854b.m4610l(r2, r0)
            r2 = 116(0x74, float:1.63E-43)
            p080ei.C1854b.m4612n(r0, r2, r3)
            long[] r2 = new long[r4]
            p080ei.C1854b.m4605g(r3, r0, r2)
            p080ei.C1854b.m4610l(r2, r3)
            long[] r0 = new long[r4]
            p080ei.C1854b.m4607i(r3, r0)
            p080ei.C1854b.m4610l(r0, r1)
            qj.s1 r0 = new qj.s1
            r0.<init>(r1)
            return r0
        Lab:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: h */
    public boolean mo10900h() {
            r1 = this;
            long[] r0 = r1.f22115Y
            boolean r0 = tj.AbstractC6255a.m12864u(r0)
            return r0
    }

    public int hashCode() {
            r3 = this;
            long[] r0 = r3.f22115Y
            r1 = 0
            r2 = 4
            int r0 = p400wj.C6888a.m13955g(r0, r1, r2)
            r1 = 2330074(0x238dda, float:3.265129E-39)
            r0 = r0 ^ r1
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: i */
    public boolean mo10901i() {
            r1 = this;
            long[] r0 = r1.f22115Y
            boolean r0 = tj.AbstractC6255a.m12868y(r0)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: j */
    public p240nj.AbstractC4846d mo10902j(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 4
            long[] r0 = new long[r0]
            long[] r1 = r2.f22115Y
            qj.s1 r3 = (p298qj.C5731s1) r3
            long[] r3 = r3.f22115Y
            p080ei.C1854b.m4608j(r1, r3, r0)
            qj.s1 r3 = new qj.s1
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
            long[] r0 = r2.f22115Y
            qj.s1 r3 = (p298qj.C5731s1) r3
            long[] r3 = r3.f22115Y
            qj.s1 r4 = (p298qj.C5731s1) r4
            long[] r4 = r4.f22115Y
            qj.s1 r5 = (p298qj.C5731s1) r5
            long[] r5 = r5.f22115Y
            r1 = 8
            long[] r1 = new long[r1]
            p080ei.C1854b.m4609k(r0, r3, r1)
            p080ei.C1854b.m4609k(r4, r5, r1)
            r3 = 4
            long[] r3 = new long[r3]
            p080ei.C1854b.m4610l(r1, r3)
            qj.s1 r4 = new qj.s1
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
            r26 = this;
            r0 = 4
            long[] r0 = new long[r0]
            r1 = r26
            long[] r2 = r1.f22115Y
            r3 = 0
            r4 = r2[r3]
            long r4 = gh.C2390b.m6110A(r4)
            r6 = 1
            r7 = r2[r6]
            long r7 = gh.C2390b.m6110A(r7)
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r4 & r9
            r13 = 32
            long r14 = r7 << r13
            long r11 = r11 | r14
            long r4 = r4 >>> r13
            r14 = -4294967296(0xffffffff00000000, double:NaN)
            long r7 = r7 & r14
            long r4 = r4 | r7
            r7 = 2
            r7 = r2[r7]
            long r7 = gh.C2390b.m6110A(r7)
            r6 = 3
            r16 = r2[r6]
            long r16 = gh.C2390b.m6110A(r16)
            long r9 = r9 & r7
            long r18 = r16 << r13
            long r9 = r9 | r18
            long r7 = r7 >>> r13
            long r13 = r16 & r14
            long r7 = r7 | r13
            r2 = 27
            long r13 = r7 >>> r2
            long r16 = r4 >>> r2
            r2 = 37
            long r18 = r7 << r2
            long r16 = r16 | r18
            long r7 = r7 ^ r16
            long r16 = r4 << r2
            long r4 = r4 ^ r16
            r2 = 8
            long[] r2 = new long[r2]
            int[] r15 = new int[r6]
            r15 = {x00b0: FILL_ARRAY_DATA , data: [32, 117, 191} // fill-array
        L5b:
            if (r3 >= r6) goto L9a
            r17 = r15[r3]
            int r17 = r17 >>> 6
            r18 = r15[r3]
            r6 = r18 & 63
            r20 = r2[r17]
            long r22 = r4 << r6
            long r20 = r20 ^ r22
            r2[r17] = r20
            int r18 = r17 + 1
            r20 = r2[r18]
            long r22 = r7 << r6
            int r1 = -r6
            long r24 = r4 >>> r1
            long r22 = r22 | r24
            long r20 = r20 ^ r22
            r2[r18] = r20
            int r18 = r17 + 2
            r20 = r2[r18]
            long r22 = r13 << r6
            long r24 = r7 >>> r1
            long r22 = r22 | r24
            long r20 = r20 ^ r22
            r2[r18] = r20
            r6 = 3
            int r17 = r17 + 3
            r18 = r2[r17]
            long r20 = r13 >>> r1
            long r18 = r18 ^ r20
            r2[r17] = r18
            int r3 = r3 + 1
            r1 = r26
            goto L5b
        L9a:
            p080ei.C1854b.m4610l(r2, r0)
            r1 = 0
            r2 = r0[r1]
            long r2 = r2 ^ r11
            r0[r1] = r2
            r1 = 1
            r2 = r0[r1]
            long r2 = r2 ^ r9
            r0[r1] = r2
            qj.s1 r1 = new qj.s1
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: o */
    public p240nj.AbstractC4846d mo10907o() {
            r2 = this;
            r0 = 4
            long[] r0 = new long[r0]
            long[] r1 = r2.f22115Y
            p080ei.C1854b.m4611m(r1, r0)
            qj.s1 r1 = new qj.s1
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: p */
    public p240nj.AbstractC4846d mo10908p(p240nj.AbstractC4846d r4, p240nj.AbstractC4846d r5) {
            r3 = this;
            long[] r0 = r3.f22115Y
            qj.s1 r4 = (p298qj.C5731s1) r4
            long[] r4 = r4.f22115Y
            qj.s1 r5 = (p298qj.C5731s1) r5
            long[] r5 = r5.f22115Y
            r1 = 8
            long[] r2 = new long[r1]
            long[] r1 = new long[r1]
            p080ei.C1854b.m4607i(r0, r1)
            p080ei.C1854b.m4600b(r2, r1, r2)
            p080ei.C1854b.m4609k(r4, r5, r2)
            r4 = 4
            long[] r4 = new long[r4]
            p080ei.C1854b.m4610l(r2, r4)
            qj.s1 r5 = new qj.s1
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
            r0 = 4
            long[] r0 = new long[r0]
            long[] r1 = r2.f22115Y
            p080ei.C1854b.m4612n(r1, r3, r0)
            qj.s1 r3 = new qj.s1
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
            long[] r0 = r6.f22115Y
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
            long[] r0 = r1.f22115Y
            java.math.BigInteger r0 = tj.AbstractC6255a.m12842J(r0)
            return r0
    }

    @Override // p240nj.AbstractC4846d.a
    /* renamed from: u */
    public int mo10913u() {
            r5 = this;
            long[] r0 = r5.f22115Y
            r1 = 0
            r1 = r0[r1]
            r3 = 2
            r3 = r0[r3]
            r0 = 31
            long r3 = r3 >>> r0
            long r0 = r1 ^ r3
            int r1 = (int) r0
            r0 = r1 & 1
            return r0
    }
}
