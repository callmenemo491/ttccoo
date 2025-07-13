package p298qj;

/* renamed from: qj.x1 */
/* loaded from: classes.dex */
public class C5746x1 extends p240nj.AbstractC4846d.a {

    /* renamed from: Y */
    public long[] f22146Y;

    public C5746x1() {
            r1 = this;
            r1.<init>()
            r0 = 4
            long[] r0 = new long[r0]
            r1.f22146Y = r0
            return
    }

    public C5746x1(java.math.BigInteger r10) {
            r9 = this;
            r9.<init>()
            if (r10 == 0) goto L38
            int r0 = r10.signum()
            if (r0 < 0) goto L38
            int r0 = r10.bitLength()
            r1 = 239(0xef, float:3.35E-43)
            if (r0 > r1) goto L38
            long[] r10 = tj.AbstractC6255a.m12858o(r10)
            r0 = 3
            r1 = r10[r0]
            r3 = 47
            long r3 = r1 >>> r3
            r5 = 0
            r6 = r10[r5]
            long r6 = r6 ^ r3
            r10[r5] = r6
            r5 = 2
            r6 = r10[r5]
            r8 = 30
            long r3 = r3 << r8
            long r3 = r3 ^ r6
            r10[r5] = r3
            r3 = 140737488355327(0x7fffffffffff, double:6.95335580783495E-310)
            long r1 = r1 & r3
            r10[r0] = r1
            r9.f22146Y = r10
            return
        L38:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "x value invalid for SecT239FieldElement"
            r10.<init>(r0)
            throw r10
    }

    public C5746x1(long[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22146Y = r1
            return
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: a */
    public p240nj.AbstractC4846d mo10893a(p240nj.AbstractC4846d r8) {
            r7 = this;
            r0 = 4
            long[] r0 = new long[r0]
            long[] r1 = r7.f22146Y
            qj.x1 r8 = (p298qj.C5746x1) r8
            long[] r8 = r8.f22146Y
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
            qj.x1 r8 = new qj.x1
            r8.<init>(r0)
            return r8
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: b */
    public p240nj.AbstractC4846d mo10894b() {
            r7 = this;
            r0 = 4
            long[] r0 = new long[r0]
            long[] r1 = r7.f22146Y
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
            qj.x1 r1 = new qj.x1
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
            boolean r0 = r2 instanceof p298qj.C5746x1
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            qj.x1 r2 = (p298qj.C5746x1) r2
            long[] r0 = r1.f22146Y
            long[] r2 = r2.f22146Y
            boolean r2 = tj.AbstractC6255a.m12856m(r0, r2)
            return r2
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: f */
    public int mo10898f() {
            r1 = this;
            r0 = 239(0xef, float:3.35E-43)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: g */
    public p240nj.AbstractC4846d mo10899g() {
            r6 = this;
            r0 = 4
            long[] r1 = new long[r0]
            long[] r2 = r6.f22146Y
            boolean r3 = tj.AbstractC6255a.m12868y(r2)
            if (r3 != 0) goto Lcb
            long[] r3 = new long[r0]
            long[] r0 = new long[r0]
            r4 = 8
            long[] r5 = new long[r4]
            p101fh.C2174f.m5725o(r2, r5)
            p101fh.C2174f.m5731u(r5, r3)
            long[] r5 = new long[r4]
            p101fh.C2174f.m5723m(r3, r2, r5)
            p101fh.C2174f.m5731u(r5, r3)
            long[] r5 = new long[r4]
            p101fh.C2174f.m5725o(r3, r5)
            p101fh.C2174f.m5731u(r5, r3)
            long[] r5 = new long[r4]
            p101fh.C2174f.m5723m(r3, r2, r5)
            p101fh.C2174f.m5731u(r5, r3)
            r5 = 3
            p101fh.C2174f.m5736z(r3, r5, r0)
            long[] r5 = new long[r4]
            p101fh.C2174f.m5723m(r0, r3, r5)
            p101fh.C2174f.m5731u(r5, r0)
            long[] r5 = new long[r4]
            p101fh.C2174f.m5725o(r0, r5)
            p101fh.C2174f.m5731u(r5, r0)
            long[] r5 = new long[r4]
            p101fh.C2174f.m5723m(r0, r2, r5)
            p101fh.C2174f.m5731u(r5, r0)
            r5 = 7
            p101fh.C2174f.m5736z(r0, r5, r3)
            long[] r5 = new long[r4]
            p101fh.C2174f.m5723m(r3, r0, r5)
            p101fh.C2174f.m5731u(r5, r3)
            r5 = 14
            p101fh.C2174f.m5736z(r3, r5, r0)
            long[] r5 = new long[r4]
            p101fh.C2174f.m5723m(r0, r3, r5)
            p101fh.C2174f.m5731u(r5, r0)
            long[] r5 = new long[r4]
            p101fh.C2174f.m5725o(r0, r5)
            p101fh.C2174f.m5731u(r5, r0)
            long[] r5 = new long[r4]
            p101fh.C2174f.m5723m(r0, r2, r5)
            p101fh.C2174f.m5731u(r5, r0)
            r5 = 29
            p101fh.C2174f.m5736z(r0, r5, r3)
            long[] r5 = new long[r4]
            p101fh.C2174f.m5723m(r3, r0, r5)
            p101fh.C2174f.m5731u(r5, r3)
            long[] r5 = new long[r4]
            p101fh.C2174f.m5725o(r3, r5)
            p101fh.C2174f.m5731u(r5, r3)
            long[] r5 = new long[r4]
            p101fh.C2174f.m5723m(r3, r2, r5)
            p101fh.C2174f.m5731u(r5, r3)
            r5 = 59
            p101fh.C2174f.m5736z(r3, r5, r0)
            long[] r5 = new long[r4]
            p101fh.C2174f.m5723m(r0, r3, r5)
            p101fh.C2174f.m5731u(r5, r0)
            long[] r5 = new long[r4]
            p101fh.C2174f.m5725o(r0, r5)
            p101fh.C2174f.m5731u(r5, r0)
            long[] r5 = new long[r4]
            p101fh.C2174f.m5723m(r0, r2, r5)
            p101fh.C2174f.m5731u(r5, r0)
            r2 = 119(0x77, float:1.67E-43)
            p101fh.C2174f.m5736z(r0, r2, r3)
            long[] r2 = new long[r4]
            p101fh.C2174f.m5723m(r3, r0, r2)
            p101fh.C2174f.m5731u(r2, r3)
            long[] r0 = new long[r4]
            p101fh.C2174f.m5725o(r3, r0)
            p101fh.C2174f.m5731u(r0, r1)
            qj.x1 r0 = new qj.x1
            r0.<init>(r1)
            return r0
        Lcb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: h */
    public boolean mo10900h() {
            r1 = this;
            long[] r0 = r1.f22146Y
            boolean r0 = tj.AbstractC6255a.m12864u(r0)
            return r0
    }

    public int hashCode() {
            r3 = this;
            long[] r0 = r3.f22146Y
            r1 = 0
            r2 = 4
            int r0 = p400wj.C6888a.m13955g(r0, r1, r2)
            r1 = 23900158(0x16caffe, float:4.3472622E-38)
            r0 = r0 ^ r1
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: i */
    public boolean mo10901i() {
            r1 = this;
            long[] r0 = r1.f22146Y
            boolean r0 = tj.AbstractC6255a.m12868y(r0)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: j */
    public p240nj.AbstractC4846d mo10902j(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 4
            long[] r0 = new long[r0]
            long[] r1 = r2.f22146Y
            qj.x1 r3 = (p298qj.C5746x1) r3
            long[] r3 = r3.f22146Y
            p101fh.C2174f.m5729s(r1, r3, r0)
            qj.x1 r3 = new qj.x1
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
            long[] r0 = r2.f22146Y
            qj.x1 r3 = (p298qj.C5746x1) r3
            long[] r3 = r3.f22146Y
            qj.x1 r4 = (p298qj.C5746x1) r4
            long[] r4 = r4.f22146Y
            qj.x1 r5 = (p298qj.C5746x1) r5
            long[] r5 = r5.f22146Y
            r1 = 8
            long[] r1 = new long[r1]
            p101fh.C2174f.m5730t(r0, r3, r1)
            p101fh.C2174f.m5730t(r4, r5, r1)
            r3 = 4
            long[] r3 = new long[r3]
            p101fh.C2174f.m5731u(r1, r3)
            qj.x1 r4 = new qj.x1
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
            r29 = this;
            r0 = 4
            long[] r1 = new long[r0]
            r2 = r29
            long[] r3 = r2.f22146Y
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
            r8 = 2
            r17 = r3[r8]
            long r17 = gh.C2390b.m6110A(r17)
            r9 = 3
            r19 = r3[r9]
            long r19 = gh.C2390b.m6110A(r19)
            long r9 = r17 & r10
            long r21 = r19 << r14
            long r9 = r9 | r21
            long r17 = r17 >>> r14
            long r14 = r19 & r15
            long r14 = r14 | r17
            r3 = 49
            long r16 = r14 >>> r3
            long r18 = r5 >>> r3
            r3 = 15
            long r20 = r14 << r3
            long r18 = r18 | r20
            long r20 = r5 << r3
            long r14 = r14 ^ r20
            r3 = 8
            long[] r3 = new long[r3]
            int[] r11 = new int[r8]
            r11 = {x00be: FILL_ARRAY_DATA , data: [39, 120} // fill-array
            r7 = 0
        L5d:
            if (r7 >= r8) goto La9
            r21 = r11[r7]
            int r21 = r21 >>> 6
            r22 = r11[r7]
            r8 = r22 & 63
            r23 = r3[r21]
            long r25 = r5 << r8
            long r23 = r23 ^ r25
            r3[r21] = r23
            int r22 = r21 + 1
            r23 = r3[r22]
            long r25 = r14 << r8
            int r4 = -r8
            long r27 = r5 >>> r4
            long r25 = r25 | r27
            long r23 = r23 ^ r25
            r3[r22] = r23
            int r22 = r21 + 2
            r23 = r3[r22]
            long r25 = r18 << r8
            long r27 = r14 >>> r4
            long r25 = r25 | r27
            long r23 = r23 ^ r25
            r3[r22] = r23
            int r22 = r21 + 3
            r23 = r3[r22]
            long r25 = r16 << r8
            long r27 = r18 >>> r4
            long r25 = r25 | r27
            long r23 = r23 ^ r25
            r3[r22] = r23
            int r21 = r21 + 4
            r23 = r3[r21]
            long r25 = r16 >>> r4
            long r23 = r23 ^ r25
            r3[r21] = r23
            int r7 = r7 + 1
            r4 = 0
            r8 = 2
            goto L5d
        La9:
            p101fh.C2174f.m5731u(r3, r1)
            r0 = 0
            r3 = r1[r0]
            long r3 = r3 ^ r12
            r1[r0] = r3
            r0 = 1
            r3 = r1[r0]
            long r3 = r3 ^ r9
            r1[r0] = r3
            qj.x1 r0 = new qj.x1
            r0.<init>(r1)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: o */
    public p240nj.AbstractC4846d mo10907o() {
            r2 = this;
            r0 = 4
            long[] r0 = new long[r0]
            long[] r1 = r2.f22146Y
            p101fh.C2174f.m5735y(r1, r0)
            qj.x1 r1 = new qj.x1
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: p */
    public p240nj.AbstractC4846d mo10908p(p240nj.AbstractC4846d r4, p240nj.AbstractC4846d r5) {
            r3 = this;
            long[] r0 = r3.f22146Y
            qj.x1 r4 = (p298qj.C5746x1) r4
            long[] r4 = r4.f22146Y
            qj.x1 r5 = (p298qj.C5746x1) r5
            long[] r5 = r5.f22146Y
            r1 = 8
            long[] r2 = new long[r1]
            long[] r1 = new long[r1]
            p101fh.C2174f.m5725o(r0, r1)
            p101fh.C2174f.m5712b(r2, r1, r2)
            p101fh.C2174f.m5730t(r4, r5, r2)
            r4 = 4
            long[] r4 = new long[r4]
            p101fh.C2174f.m5731u(r2, r4)
            qj.x1 r5 = new qj.x1
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
            long[] r1 = r2.f22146Y
            p101fh.C2174f.m5736z(r1, r3, r0)
            qj.x1 r3 = new qj.x1
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
            long[] r0 = r6.f22146Y
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
            long[] r0 = r1.f22146Y
            java.math.BigInteger r0 = tj.AbstractC6255a.m12842J(r0)
            return r0
    }

    @Override // p240nj.AbstractC4846d.a
    /* renamed from: u */
    public int mo10913u() {
            r7 = this;
            long[] r0 = r7.f22146Y
            r1 = 0
            r1 = r0[r1]
            r3 = 1
            r4 = r0[r3]
            r6 = 17
            long r4 = r4 >>> r6
            long r1 = r1 ^ r4
            r4 = 2
            r4 = r0[r4]
            r0 = 34
            long r4 = r4 >>> r0
            long r0 = r1 ^ r4
            int r1 = (int) r0
            r0 = r1 & 1
            return r0
    }
}
