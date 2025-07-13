package p298qj;

/* renamed from: qj.u0 */
/* loaded from: classes.dex */
public class C5736u0 extends p240nj.AbstractC4846d.a {

    /* renamed from: Y */
    public long[] f22125Y;

    public C5736u0() {
            r1 = this;
            r1.<init>()
            r0 = 2
            long[] r0 = new long[r0]
            r1.f22125Y = r0
            return
    }

    public C5736u0(java.math.BigInteger r11) {
            r10 = this;
            r10.<init>()
            if (r11 == 0) goto L5f
            int r0 = r11.signum()
            if (r0 < 0) goto L5f
            int r0 = r11.bitLength()
            r1 = 113(0x71, float:1.58E-43)
            if (r0 > r1) goto L5f
            int r0 = r11.signum()
            if (r0 < 0) goto L59
            int r0 = r11.bitLength()
            r1 = 128(0x80, float:1.8E-43)
            if (r0 > r1) goto L59
            r0 = 2
            long[] r0 = new long[r0]
            r1 = 0
            r2 = 0
        L26:
            int r3 = r11.signum()
            if (r3 == 0) goto L3c
            int r3 = r2 + 1
            long r4 = r11.longValue()
            r0[r2] = r4
            r2 = 64
            java.math.BigInteger r11 = r11.shiftRight(r2)
            r2 = r3
            goto L26
        L3c:
            r11 = 1
            r2 = r0[r11]
            r4 = 49
            long r4 = r2 >>> r4
            r6 = r0[r1]
            r8 = 9
            long r8 = r4 << r8
            long r4 = r4 ^ r8
            long r4 = r4 ^ r6
            r0[r1] = r4
            r4 = 562949953421311(0x1ffffffffffff, double:2.781342323133997E-309)
            long r1 = r2 & r4
            r0[r11] = r1
            r10.f22125Y = r0
            return
        L59:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>()
            throw r11
        L5f:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "x value invalid for SecT113FieldElement"
            r11.<init>(r0)
            throw r11
    }

    public C5736u0(long[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22125Y = r1
            return
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: a */
    public p240nj.AbstractC4846d mo10893a(p240nj.AbstractC4846d r8) {
            r7 = this;
            r0 = 2
            long[] r0 = new long[r0]
            long[] r1 = r7.f22125Y
            qj.u0 r8 = (p298qj.C5736u0) r8
            long[] r8 = r8.f22125Y
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
            qj.u0 r8 = new qj.u0
            r8.<init>(r0)
            return r8
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: b */
    public p240nj.AbstractC4846d mo10894b() {
            r7 = this;
            r0 = 2
            long[] r0 = new long[r0]
            long[] r1 = r7.f22125Y
            r2 = 0
            r3 = r1[r2]
            r5 = 1
            long r3 = r3 ^ r5
            r0[r2] = r3
            r2 = 1
            r3 = r1[r2]
            r0[r2] = r3
            qj.u0 r1 = new qj.u0
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
            boolean r1 = r10 instanceof p298qj.C5736u0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qj.u0 r10 = (p298qj.C5736u0) r10
            long[] r1 = r9.f22125Y
            long[] r10 = r10.f22125Y
            r3 = 1
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
            r0 = 113(0x71, float:1.58E-43)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: g */
    public p240nj.AbstractC4846d mo10899g() {
            r6 = this;
            r0 = 2
            long[] r1 = new long[r0]
            long[] r2 = r6.f22125Y
            boolean r3 = tj.AbstractC6255a.m12867x(r2)
            if (r3 != 0) goto L8d
            long[] r3 = new long[r0]
            long[] r0 = new long[r0]
            r4 = 4
            long[] r5 = new long[r4]
            p209lh.C4304a.m9626t(r2, r5)
            p209lh.C4304a.m9596B(r5, r3)
            long[] r5 = new long[r4]
            p209lh.C4304a.m9623q(r3, r2, r5)
            p209lh.C4304a.m9596B(r5, r3)
            long[] r5 = new long[r4]
            p209lh.C4304a.m9626t(r3, r5)
            p209lh.C4304a.m9596B(r5, r3)
            long[] r5 = new long[r4]
            p209lh.C4304a.m9623q(r3, r2, r5)
            p209lh.C4304a.m9596B(r5, r3)
            r5 = 3
            p209lh.C4304a.m9599E(r3, r5, r0)
            long[] r5 = new long[r4]
            p209lh.C4304a.m9623q(r0, r3, r5)
            p209lh.C4304a.m9596B(r5, r0)
            long[] r5 = new long[r4]
            p209lh.C4304a.m9626t(r0, r5)
            p209lh.C4304a.m9596B(r5, r0)
            long[] r5 = new long[r4]
            p209lh.C4304a.m9623q(r0, r2, r5)
            p209lh.C4304a.m9596B(r5, r0)
            r2 = 7
            p209lh.C4304a.m9599E(r0, r2, r3)
            long[] r2 = new long[r4]
            p209lh.C4304a.m9623q(r3, r0, r2)
            p209lh.C4304a.m9596B(r2, r3)
            r2 = 14
            p209lh.C4304a.m9599E(r3, r2, r0)
            long[] r2 = new long[r4]
            p209lh.C4304a.m9623q(r0, r3, r2)
            p209lh.C4304a.m9596B(r2, r0)
            r2 = 28
            p209lh.C4304a.m9599E(r0, r2, r3)
            long[] r2 = new long[r4]
            p209lh.C4304a.m9623q(r3, r0, r2)
            p209lh.C4304a.m9596B(r2, r3)
            r2 = 56
            p209lh.C4304a.m9599E(r3, r2, r0)
            long[] r2 = new long[r4]
            p209lh.C4304a.m9623q(r0, r3, r2)
            p209lh.C4304a.m9596B(r2, r0)
            long[] r2 = new long[r4]
            p209lh.C4304a.m9626t(r0, r2)
            p209lh.C4304a.m9596B(r2, r1)
            qj.u0 r0 = new qj.u0
            r0.<init>(r1)
            return r0
        L8d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: h */
    public boolean mo10900h() {
            r9 = this;
            long[] r0 = r9.f22125Y
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
            r3 = 2
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
            long[] r0 = r3.f22125Y
            r1 = 0
            r2 = 2
            int r0 = p400wj.C6888a.m13955g(r0, r1, r2)
            r1 = 113009(0x1b971, float:1.5836E-40)
            r0 = r0 ^ r1
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: i */
    public boolean mo10901i() {
            r1 = this;
            long[] r0 = r1.f22125Y
            boolean r0 = tj.AbstractC6255a.m12867x(r0)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: j */
    public p240nj.AbstractC4846d mo10902j(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 2
            long[] r0 = new long[r0]
            long[] r1 = r2.f22125Y
            qj.u0 r3 = (p298qj.C5736u0) r3
            long[] r3 = r3.f22125Y
            p209lh.C4304a.m9629w(r1, r3, r0)
            qj.u0 r3 = new qj.u0
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
            long[] r0 = r2.f22125Y
            qj.u0 r3 = (p298qj.C5736u0) r3
            long[] r3 = r3.f22125Y
            qj.u0 r4 = (p298qj.C5736u0) r4
            long[] r4 = r4.f22125Y
            qj.u0 r5 = (p298qj.C5736u0) r5
            long[] r5 = r5.f22125Y
            r1 = 4
            long[] r1 = new long[r1]
            p209lh.C4304a.m9631y(r0, r3, r1)
            p209lh.C4304a.m9631y(r4, r5, r1)
            r3 = 2
            long[] r3 = new long[r3]
            p209lh.C4304a.m9596B(r1, r3)
            qj.u0 r4 = new qj.u0
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
            r12 = this;
            r0 = 2
            long[] r0 = new long[r0]
            long[] r1 = r12.f22125Y
            r2 = 0
            r3 = r1[r2]
            long r3 = gh.C2390b.m6110A(r3)
            r5 = 1
            r6 = r1[r5]
            long r6 = gh.C2390b.m6110A(r6)
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r3
            r1 = 32
            long r10 = r6 << r1
            long r8 = r8 | r10
            long r3 = r3 >>> r1
            r10 = -4294967296(0xffffffff00000000, double:NaN)
            long r6 = r6 & r10
            long r3 = r3 | r6
            r1 = 57
            long r6 = r3 << r1
            long r6 = r6 ^ r8
            r1 = 5
            long r8 = r3 << r1
            long r6 = r6 ^ r8
            r0[r2] = r6
            r1 = 7
            long r1 = r3 >>> r1
            r6 = 59
            long r3 = r3 >>> r6
            long r1 = r1 ^ r3
            r0[r5] = r1
            qj.u0 r1 = new qj.u0
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: o */
    public p240nj.AbstractC4846d mo10907o() {
            r2 = this;
            r0 = 2
            long[] r0 = new long[r0]
            long[] r1 = r2.f22125Y
            p209lh.C4304a.m9598D(r1, r0)
            qj.u0 r1 = new qj.u0
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: p */
    public p240nj.AbstractC4846d mo10908p(p240nj.AbstractC4846d r4, p240nj.AbstractC4846d r5) {
            r3 = this;
            long[] r0 = r3.f22125Y
            qj.u0 r4 = (p298qj.C5736u0) r4
            long[] r4 = r4.f22125Y
            qj.u0 r5 = (p298qj.C5736u0) r5
            long[] r5 = r5.f22125Y
            r1 = 4
            long[] r2 = new long[r1]
            long[] r1 = new long[r1]
            p209lh.C4304a.m9626t(r0, r1)
            p209lh.C4304a.m9608b(r2, r1, r2)
            p209lh.C4304a.m9631y(r4, r5, r2)
            r4 = 2
            long[] r4 = new long[r4]
            p209lh.C4304a.m9596B(r2, r4)
            qj.u0 r5 = new qj.u0
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
            r0 = 2
            long[] r0 = new long[r0]
            long[] r1 = r2.f22125Y
            p209lh.C4304a.m9599E(r1, r3, r0)
            qj.u0 r3 = new qj.u0
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
            long[] r0 = r6.f22125Y
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
            long[] r0 = r8.f22125Y
            r1 = 16
            byte[] r1 = new byte[r1]
            r2 = 0
        L7:
            r3 = 2
            if (r2 >= r3) goto L1c
            r3 = r0[r2]
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L19
            int r5 = 1 - r2
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
            long[] r0 = r3.f22125Y
            r1 = 0
            r1 = r0[r1]
            int r0 = (int) r1
            r0 = r0 & 1
            return r0
    }
}
