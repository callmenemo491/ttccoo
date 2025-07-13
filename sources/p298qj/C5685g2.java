package p298qj;

/* renamed from: qj.g2 */
/* loaded from: classes.dex */
public class C5685g2 extends p240nj.AbstractC4846d.a {

    /* renamed from: Y */
    public long[] f22016Y;

    public C5685g2() {
            r1 = this;
            r1.<init>()
            r0 = 7
            long[] r0 = new long[r0]
            r1.f22016Y = r0
            return
    }

    public C5685g2(java.math.BigInteger r10) {
            r9 = this;
            r9.<init>()
            if (r10 == 0) goto L61
            int r0 = r10.signum()
            if (r0 < 0) goto L61
            int r0 = r10.bitLength()
            r1 = 409(0x199, float:5.73E-43)
            if (r0 > r1) goto L61
            int r0 = r10.signum()
            if (r0 < 0) goto L5b
            int r0 = r10.bitLength()
            r1 = 448(0x1c0, float:6.28E-43)
            if (r0 > r1) goto L5b
            r0 = 7
            long[] r0 = new long[r0]
            r1 = 0
            r2 = 0
        L26:
            int r3 = r10.signum()
            if (r3 == 0) goto L3c
            int r3 = r2 + 1
            long r4 = r10.longValue()
            r0[r2] = r4
            r2 = 64
            java.math.BigInteger r10 = r10.shiftRight(r2)
            r2 = r3
            goto L26
        L3c:
            r10 = 6
            r2 = r0[r10]
            r4 = 25
            long r4 = r2 >>> r4
            r6 = r0[r1]
            long r6 = r6 ^ r4
            r0[r1] = r6
            r1 = 1
            r6 = r0[r1]
            r8 = 23
            long r4 = r4 << r8
            long r4 = r4 ^ r6
            r0[r1] = r4
            r4 = 33554431(0x1ffffff, double:1.65780916E-316)
            long r1 = r2 & r4
            r0[r10] = r1
            r9.f22016Y = r0
            return
        L5b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>()
            throw r10
        L61:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "x value invalid for SecT409FieldElement"
            r10.<init>(r0)
            throw r10
    }

    public C5685g2(long[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22016Y = r1
            return
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: a */
    public p240nj.AbstractC4846d mo10893a(p240nj.AbstractC4846d r8) {
            r7 = this;
            r0 = 7
            long[] r0 = new long[r0]
            long[] r1 = r7.f22016Y
            qj.g2 r8 = (p298qj.C5685g2) r8
            long[] r8 = r8.f22016Y
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
            r2 = 5
            r3 = r1[r2]
            r5 = r8[r2]
            long r3 = r3 ^ r5
            r0[r2] = r3
            r2 = 6
            r3 = r1[r2]
            r5 = r8[r2]
            long r3 = r3 ^ r5
            r0[r2] = r3
            qj.g2 r8 = new qj.g2
            r8.<init>(r0)
            return r8
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: b */
    public p240nj.AbstractC4846d mo10894b() {
            r7 = this;
            r0 = 7
            long[] r0 = new long[r0]
            long[] r1 = r7.f22016Y
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
            r2 = 5
            r3 = r1[r2]
            r0[r2] = r3
            r2 = 6
            r3 = r1[r2]
            r0[r2] = r3
            qj.g2 r1 = new qj.g2
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
            boolean r1 = r10 instanceof p298qj.C5685g2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qj.g2 r10 = (p298qj.C5685g2) r10
            long[] r1 = r9.f22016Y
            long[] r10 = r10.f22016Y
            r3 = 6
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
            r0 = 409(0x199, float:5.73E-43)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: g */
    public p240nj.AbstractC4846d mo10899g() {
            r7 = this;
            r0 = 7
            long[] r1 = new long[r0]
            long[] r2 = r7.f22016Y
            boolean r3 = p446z3.AbstractC7246d.m14330p(r2)
            if (r3 != 0) goto L9e
            long[] r3 = new long[r0]
            long[] r4 = new long[r0]
            long[] r0 = new long[r0]
            r5 = 13
            long[] r5 = new long[r5]
            p209lh.C4304a.m9627u(r2, r5)
            p209lh.C4304a.m9597C(r5, r3)
            r2 = 1
            p209lh.C4304a.m9600F(r3, r2, r4)
            r5 = 14
            long[] r6 = new long[r5]
            p209lh.C4304a.m9624r(r3, r4, r6)
            p209lh.C4304a.m9597C(r6, r3)
            p209lh.C4304a.m9600F(r4, r2, r4)
            long[] r2 = new long[r5]
            p209lh.C4304a.m9624r(r3, r4, r2)
            p209lh.C4304a.m9597C(r2, r3)
            r2 = 3
            p209lh.C4304a.m9600F(r3, r2, r4)
            long[] r2 = new long[r5]
            p209lh.C4304a.m9624r(r3, r4, r2)
            p209lh.C4304a.m9597C(r2, r3)
            r2 = 6
            p209lh.C4304a.m9600F(r3, r2, r4)
            long[] r2 = new long[r5]
            p209lh.C4304a.m9624r(r3, r4, r2)
            p209lh.C4304a.m9597C(r2, r3)
            r2 = 12
            p209lh.C4304a.m9600F(r3, r2, r4)
            long[] r2 = new long[r5]
            p209lh.C4304a.m9624r(r3, r4, r2)
            p209lh.C4304a.m9597C(r2, r0)
            r2 = 24
            p209lh.C4304a.m9600F(r0, r2, r3)
            p209lh.C4304a.m9600F(r3, r2, r4)
            long[] r2 = new long[r5]
            p209lh.C4304a.m9624r(r3, r4, r2)
            p209lh.C4304a.m9597C(r2, r3)
            r2 = 48
            p209lh.C4304a.m9600F(r3, r2, r4)
            long[] r2 = new long[r5]
            p209lh.C4304a.m9624r(r3, r4, r2)
            p209lh.C4304a.m9597C(r2, r3)
            r2 = 96
            p209lh.C4304a.m9600F(r3, r2, r4)
            long[] r2 = new long[r5]
            p209lh.C4304a.m9624r(r3, r4, r2)
            p209lh.C4304a.m9597C(r2, r3)
            r2 = 192(0xc0, float:2.69E-43)
            p209lh.C4304a.m9600F(r3, r2, r4)
            long[] r2 = new long[r5]
            p209lh.C4304a.m9624r(r3, r4, r2)
            p209lh.C4304a.m9597C(r2, r3)
            long[] r2 = new long[r5]
            p209lh.C4304a.m9624r(r3, r0, r2)
            p209lh.C4304a.m9597C(r2, r1)
            qj.g2 r0 = new qj.g2
            r0.<init>(r1)
            return r0
        L9e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: h */
    public boolean mo10900h() {
            r9 = this;
            long[] r0 = r9.f22016Y
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
            r3 = 7
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
            long[] r0 = r3.f22016Y
            r1 = 0
            r2 = 7
            int r0 = p400wj.C6888a.m13955g(r0, r1, r2)
            r1 = 4090087(0x3e68e7, float:5.731433E-39)
            r0 = r0 ^ r1
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: i */
    public boolean mo10901i() {
            r1 = this;
            long[] r0 = r1.f22016Y
            boolean r0 = p446z3.AbstractC7246d.m14330p(r0)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: j */
    public p240nj.AbstractC4846d mo10902j(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 7
            long[] r0 = new long[r0]
            long[] r1 = r2.f22016Y
            qj.g2 r3 = (p298qj.C5685g2) r3
            long[] r3 = r3.f22016Y
            p209lh.C4304a.m9630x(r1, r3, r0)
            qj.g2 r3 = new qj.g2
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
            long[] r0 = r2.f22016Y
            qj.g2 r3 = (p298qj.C5685g2) r3
            long[] r3 = r3.f22016Y
            qj.g2 r4 = (p298qj.C5685g2) r4
            long[] r4 = r4.f22016Y
            qj.g2 r5 = (p298qj.C5685g2) r5
            long[] r5 = r5.f22016Y
            r1 = 13
            long[] r1 = new long[r1]
            p209lh.C4304a.m9632z(r0, r3, r1)
            p209lh.C4304a.m9632z(r4, r5, r1)
            r3 = 7
            long[] r3 = new long[r3]
            p209lh.C4304a.m9597C(r1, r3)
            qj.g2 r4 = new qj.g2
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
            r30 = this;
            r0 = 7
            long[] r0 = new long[r0]
            r1 = r30
            long[] r2 = r1.f22016Y
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
            r16 = r2[r7]
            long r16 = gh.C2390b.m6110A(r16)
            r8 = 3
            r18 = r2[r8]
            long r18 = gh.C2390b.m6110A(r18)
            long r20 = r16 & r9
            long r22 = r18 << r13
            long r20 = r20 | r22
            long r16 = r16 >>> r13
            long r18 = r18 & r14
            long r16 = r16 | r18
            r18 = 4
            r22 = r2[r18]
            long r22 = gh.C2390b.m6110A(r22)
            r19 = 5
            r24 = r2[r19]
            long r24 = gh.C2390b.m6110A(r24)
            long r26 = r22 & r9
            long r28 = r24 << r13
            long r26 = r26 | r28
            long r22 = r22 >>> r13
            long r14 = r24 & r14
            long r14 = r22 | r14
            r22 = 6
            r23 = r2[r22]
            long r23 = gh.C2390b.m6110A(r23)
            long r9 = r23 & r9
            long r23 = r23 >>> r13
            r2 = 44
            long r28 = r4 << r2
            long r11 = r11 ^ r28
            r0[r3] = r11
            long r11 = r16 << r2
            long r11 = r20 ^ r11
            r3 = 20
            long r20 = r4 >>> r3
            long r11 = r11 ^ r20
            r0[r6] = r11
            long r11 = r14 << r2
            long r11 = r26 ^ r11
            long r20 = r16 >>> r3
            long r11 = r11 ^ r20
            r0[r7] = r11
            long r6 = r23 << r2
            long r6 = r6 ^ r9
            long r9 = r14 >>> r3
            long r6 = r6 ^ r9
            r2 = 13
            long r9 = r4 << r2
            long r6 = r6 ^ r9
            r0[r8] = r6
            long r6 = r23 >>> r3
            long r8 = r16 << r2
            long r6 = r6 ^ r8
            r3 = 51
            long r4 = r4 >>> r3
            long r4 = r4 ^ r6
            r0[r18] = r4
            long r4 = r14 << r2
            long r6 = r16 >>> r3
            long r4 = r4 ^ r6
            r0[r19] = r4
            long r4 = r23 << r2
            long r2 = r14 >>> r3
            long r2 = r2 ^ r4
            r0[r22] = r2
            qj.g2 r2 = new qj.g2
            r2.<init>(r0)
            return r2
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: o */
    public p240nj.AbstractC4846d mo10907o() {
            r3 = this;
            r0 = 7
            long[] r0 = new long[r0]
            long[] r1 = r3.f22016Y
            r2 = 13
            long[] r2 = new long[r2]
            p209lh.C4304a.m9627u(r1, r2)
            p209lh.C4304a.m9597C(r2, r0)
            qj.g2 r1 = new qj.g2
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: p */
    public p240nj.AbstractC4846d mo10908p(p240nj.AbstractC4846d r9, p240nj.AbstractC4846d r10) {
            r8 = this;
            long[] r0 = r8.f22016Y
            qj.g2 r9 = (p298qj.C5685g2) r9
            long[] r9 = r9.f22016Y
            qj.g2 r10 = (p298qj.C5685g2) r10
            long[] r10 = r10.f22016Y
            r1 = 13
            long[] r2 = new long[r1]
            long[] r3 = new long[r1]
            p209lh.C4304a.m9627u(r0, r3)
            r0 = 0
        L14:
            if (r0 >= r1) goto L20
            r4 = r2[r0]
            r6 = r3[r0]
            long r4 = r4 ^ r6
            r2[r0] = r4
            int r0 = r0 + 1
            goto L14
        L20:
            p209lh.C4304a.m9632z(r9, r10, r2)
            r9 = 7
            long[] r9 = new long[r9]
            p209lh.C4304a.m9597C(r2, r9)
            qj.g2 r10 = new qj.g2
            r10.<init>(r9)
            return r10
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: q */
    public p240nj.AbstractC4846d mo10909q(int r3) {
            r2 = this;
            r0 = 1
            if (r3 >= r0) goto L4
            return r2
        L4:
            r0 = 7
            long[] r0 = new long[r0]
            long[] r1 = r2.f22016Y
            p209lh.C4304a.m9600F(r1, r3, r0)
            qj.g2 r3 = new qj.g2
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
            long[] r0 = r6.f22016Y
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
            long[] r0 = r8.f22016Y
            r1 = 56
            byte[] r1 = new byte[r1]
            r2 = 0
        L7:
            r3 = 7
            if (r2 >= r3) goto L1c
            r3 = r0[r2]
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L19
            int r5 = 6 - r2
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
            r3 = this;
            long[] r0 = r3.f22016Y
            r1 = 0
            r1 = r0[r1]
            int r0 = (int) r1
            r0 = r0 & 1
            return r0
    }
}
