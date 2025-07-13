package p298qj;

/* renamed from: qj.n1 */
/* loaded from: classes.dex */
public class C5712n1 extends p240nj.AbstractC4846d.a {

    /* renamed from: Y */
    public long[] f22071Y;

    public C5712n1() {
            r1 = this;
            r1.<init>()
            r0 = 4
            long[] r0 = new long[r0]
            r1.f22071Y = r0
            return
    }

    public C5712n1(java.math.BigInteger r12) {
            r11 = this;
            r11.<init>()
            if (r12 == 0) goto L38
            int r0 = r12.signum()
            if (r0 < 0) goto L38
            int r0 = r12.bitLength()
            r1 = 193(0xc1, float:2.7E-43)
            if (r0 > r1) goto L38
            long[] r12 = tj.AbstractC6255a.m12858o(r12)
            r0 = 3
            r1 = r12[r0]
            r3 = 1
            long r4 = r1 >>> r3
            r6 = 0
            r7 = r12[r6]
            r9 = 15
            long r9 = r4 << r9
            long r9 = r9 ^ r4
            long r7 = r7 ^ r9
            r12[r6] = r7
            r6 = r12[r3]
            r8 = 49
            long r4 = r4 >>> r8
            long r4 = r4 ^ r6
            r12[r3] = r4
            r3 = 1
            long r1 = r1 & r3
            r12[r0] = r1
            r11.f22071Y = r12
            return
        L38:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "x value invalid for SecT193FieldElement"
            r12.<init>(r0)
            throw r12
    }

    public C5712n1(long[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22071Y = r1
            return
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: a */
    public p240nj.AbstractC4846d mo10893a(p240nj.AbstractC4846d r8) {
            r7 = this;
            r0 = 4
            long[] r0 = new long[r0]
            long[] r1 = r7.f22071Y
            qj.n1 r8 = (p298qj.C5712n1) r8
            long[] r8 = r8.f22071Y
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
            qj.n1 r8 = new qj.n1
            r8.<init>(r0)
            return r8
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: b */
    public p240nj.AbstractC4846d mo10894b() {
            r7 = this;
            r0 = 4
            long[] r0 = new long[r0]
            long[] r1 = r7.f22071Y
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
            qj.n1 r1 = new qj.n1
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
            boolean r0 = r2 instanceof p298qj.C5712n1
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            qj.n1 r2 = (p298qj.C5712n1) r2
            long[] r0 = r1.f22071Y
            long[] r2 = r2.f22071Y
            boolean r2 = tj.AbstractC6255a.m12856m(r0, r2)
            return r2
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: f */
    public int mo10898f() {
            r1 = this;
            r0 = 193(0xc1, float:2.7E-43)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: g */
    public p240nj.AbstractC4846d mo10899g() {
            r6 = this;
            r0 = 4
            long[] r1 = new long[r0]
            long[] r2 = r6.f22071Y
            boolean r3 = tj.AbstractC6255a.m12868y(r2)
            if (r3 != 0) goto L82
            long[] r3 = new long[r0]
            long[] r0 = new long[r0]
            r4 = 8
            long[] r5 = new long[r4]
            gh.C2390b.m6126p(r2, r5)
            gh.C2390b.m6131u(r5, r3)
            r2 = 1
            gh.C2390b.m6133w(r3, r2, r0)
            long[] r5 = new long[r4]
            gh.C2390b.m6124n(r3, r0, r5)
            gh.C2390b.m6131u(r5, r3)
            gh.C2390b.m6133w(r0, r2, r0)
            long[] r2 = new long[r4]
            gh.C2390b.m6124n(r3, r0, r2)
            gh.C2390b.m6131u(r2, r3)
            r2 = 3
            gh.C2390b.m6133w(r3, r2, r0)
            long[] r2 = new long[r4]
            gh.C2390b.m6124n(r3, r0, r2)
            gh.C2390b.m6131u(r2, r3)
            r2 = 6
            gh.C2390b.m6133w(r3, r2, r0)
            long[] r2 = new long[r4]
            gh.C2390b.m6124n(r3, r0, r2)
            gh.C2390b.m6131u(r2, r3)
            r2 = 12
            gh.C2390b.m6133w(r3, r2, r0)
            long[] r2 = new long[r4]
            gh.C2390b.m6124n(r3, r0, r2)
            gh.C2390b.m6131u(r2, r3)
            r2 = 24
            gh.C2390b.m6133w(r3, r2, r0)
            long[] r2 = new long[r4]
            gh.C2390b.m6124n(r3, r0, r2)
            gh.C2390b.m6131u(r2, r3)
            r2 = 48
            gh.C2390b.m6133w(r3, r2, r0)
            long[] r2 = new long[r4]
            gh.C2390b.m6124n(r3, r0, r2)
            gh.C2390b.m6131u(r2, r3)
            r2 = 96
            gh.C2390b.m6133w(r3, r2, r0)
            long[] r2 = new long[r4]
            gh.C2390b.m6124n(r3, r0, r2)
            gh.C2390b.m6131u(r2, r1)
            qj.n1 r0 = new qj.n1
            r0.<init>(r1)
            return r0
        L82:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: h */
    public boolean mo10900h() {
            r1 = this;
            long[] r0 = r1.f22071Y
            boolean r0 = tj.AbstractC6255a.m12864u(r0)
            return r0
    }

    public int hashCode() {
            r3 = this;
            long[] r0 = r3.f22071Y
            r1 = 0
            r2 = 4
            int r0 = p400wj.C6888a.m13955g(r0, r1, r2)
            r1 = 1930015(0x1d731f, float:2.704527E-39)
            r0 = r0 ^ r1
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: i */
    public boolean mo10901i() {
            r1 = this;
            long[] r0 = r1.f22071Y
            boolean r0 = tj.AbstractC6255a.m12868y(r0)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: j */
    public p240nj.AbstractC4846d mo10902j(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 4
            long[] r0 = new long[r0]
            long[] r1 = r2.f22071Y
            qj.n1 r3 = (p298qj.C5712n1) r3
            long[] r3 = r3.f22071Y
            gh.C2390b.m6129s(r1, r3, r0)
            qj.n1 r3 = new qj.n1
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
            long[] r0 = r2.f22071Y
            qj.n1 r3 = (p298qj.C5712n1) r3
            long[] r3 = r3.f22071Y
            qj.n1 r4 = (p298qj.C5712n1) r4
            long[] r4 = r4.f22071Y
            qj.n1 r5 = (p298qj.C5712n1) r5
            long[] r5 = r5.f22071Y
            r1 = 8
            long[] r1 = new long[r1]
            gh.C2390b.m6130t(r0, r3, r1)
            gh.C2390b.m6130t(r4, r5, r1)
            r3 = 4
            long[] r3 = new long[r3]
            gh.C2390b.m6131u(r1, r3)
            qj.n1 r4 = new qj.n1
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
            r18 = this;
            r0 = 4
            long[] r0 = new long[r0]
            r1 = r18
            long[] r2 = r1.f22071Y
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
            r14 = r2[r7]
            long r14 = gh.C2390b.m6110A(r14)
            long r8 = r14 & r9
            r10 = 3
            r16 = r2[r10]
            long r16 = r16 << r13
            long r8 = r8 ^ r16
            long r13 = r14 >>> r13
            r2 = 8
            long r15 = r4 << r2
            long r11 = r11 ^ r15
            r0[r3] = r11
            long r2 = r13 << r2
            long r2 = r2 ^ r8
            r8 = 56
            long r11 = r4 >>> r8
            long r2 = r2 ^ r11
            r9 = 33
            long r11 = r4 << r9
            long r2 = r2 ^ r11
            r0[r6] = r2
            long r2 = r13 >>> r8
            long r8 = r13 << r9
            long r2 = r2 ^ r8
            r6 = 31
            long r4 = r4 >>> r6
            long r2 = r2 ^ r4
            r0[r7] = r2
            long r2 = r13 >>> r6
            r0[r10] = r2
            qj.n1 r2 = new qj.n1
            r2.<init>(r0)
            return r2
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: o */
    public p240nj.AbstractC4846d mo10907o() {
            r3 = this;
            r0 = 4
            long[] r0 = new long[r0]
            long[] r1 = r3.f22071Y
            r2 = 8
            long[] r2 = new long[r2]
            gh.C2390b.m6126p(r1, r2)
            gh.C2390b.m6131u(r2, r0)
            qj.n1 r1 = new qj.n1
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: p */
    public p240nj.AbstractC4846d mo10908p(p240nj.AbstractC4846d r4, p240nj.AbstractC4846d r5) {
            r3 = this;
            long[] r0 = r3.f22071Y
            qj.n1 r4 = (p298qj.C5712n1) r4
            long[] r4 = r4.f22071Y
            qj.n1 r5 = (p298qj.C5712n1) r5
            long[] r5 = r5.f22071Y
            r1 = 8
            long[] r2 = new long[r1]
            long[] r1 = new long[r1]
            gh.C2390b.m6126p(r0, r1)
            gh.C2390b.m6111a(r2, r1, r2)
            gh.C2390b.m6130t(r4, r5, r2)
            r4 = 4
            long[] r4 = new long[r4]
            gh.C2390b.m6131u(r2, r4)
            qj.n1 r5 = new qj.n1
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
            long[] r1 = r2.f22071Y
            gh.C2390b.m6133w(r1, r3, r0)
            qj.n1 r3 = new qj.n1
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
            long[] r0 = r6.f22071Y
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
            long[] r0 = r1.f22071Y
            java.math.BigInteger r0 = tj.AbstractC6255a.m12842J(r0)
            return r0
    }

    @Override // p240nj.AbstractC4846d.a
    /* renamed from: u */
    public int mo10913u() {
            r3 = this;
            long[] r0 = r3.f22071Y
            r1 = 0
            r1 = r0[r1]
            int r0 = (int) r1
            r0 = r0 & 1
            return r0
    }
}
