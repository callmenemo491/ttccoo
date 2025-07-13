package p298qj;

/* renamed from: qj.g0 */
/* loaded from: classes.dex */
public class C5683g0 extends p240nj.AbstractC4846d.b {

    /* renamed from: Z */
    public static final java.math.BigInteger f22013Z = null;

    /* renamed from: Y */
    public int[] f22014Y;

    static {
            java.math.BigInteger r0 = p298qj.C5675e0.f21995j
            p298qj.C5683g0.f22013Z = r0
            return
    }

    public C5683g0() {
            r1 = this;
            r1.<init>()
            r0 = 8
            int[] r0 = new int[r0]
            r1.f22014Y = r0
            return
    }

    public C5683g0(java.math.BigInteger r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L2b
            int r0 = r3.signum()
            if (r0 < 0) goto L2b
            java.math.BigInteger r0 = p298qj.C5683g0.f22013Z
            int r0 = r3.compareTo(r0)
            if (r0 >= 0) goto L2b
            int[] r3 = tj.AbstractC6255a.m12857n(r3)
            r0 = 7
            r0 = r3[r0]
            r1 = -1
            if (r0 != r1) goto L28
            int[] r0 = p298qj.C5679f0.f22004a
            boolean r1 = tj.AbstractC6255a.m12861r(r3, r0)
            if (r1 == 0) goto L28
            tj.AbstractC6255a.m12840H(r0, r3)
        L28:
            r2.f22014Y = r3
            return
        L2b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "x value invalid for SecP256K1FieldElement"
            r3.<init>(r0)
            throw r3
    }

    public C5683g0(int[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22014Y = r1
            return
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: a */
    public p240nj.AbstractC4846d mo10893a(p240nj.AbstractC4846d r4) {
            r3 = this;
            r0 = 8
            int[] r1 = new int[r0]
            int[] r2 = r3.f22014Y
            qj.g0 r4 = (p298qj.C5683g0) r4
            int[] r4 = r4.f22014Y
            int r4 = tj.AbstractC6255a.m12844a(r2, r4, r1)
            if (r4 != 0) goto L1e
            r4 = 7
            r4 = r1[r4]
            r2 = -1
            if (r4 != r2) goto L23
            int[] r4 = p298qj.C5679f0.f22004a
            boolean r4 = tj.AbstractC6255a.m12861r(r1, r4)
            if (r4 == 0) goto L23
        L1e:
            r4 = 977(0x3d1, float:1.369E-42)
            p085f1.AbstractC1972m.m4996c(r0, r4, r1)
        L23:
            qj.g0 r4 = new qj.g0
            r4.<init>(r1)
            return r4
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: b */
    public p240nj.AbstractC4846d mo10894b() {
            r4 = this;
            r0 = 8
            int[] r1 = new int[r0]
            int[] r2 = r4.f22014Y
            int r2 = p085f1.AbstractC1972m.m4966A(r0, r2, r1)
            if (r2 != 0) goto L1a
            r2 = 7
            r2 = r1[r2]
            r3 = -1
            if (r2 != r3) goto L1f
            int[] r2 = p298qj.C5679f0.f22004a
            boolean r2 = tj.AbstractC6255a.m12861r(r1, r2)
            if (r2 == 0) goto L1f
        L1a:
            r2 = 977(0x3d1, float:1.369E-42)
            p085f1.AbstractC1972m.m4996c(r0, r2, r1)
        L1f:
            qj.g0 r0 = new qj.g0
            r0.<init>(r1)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: d */
    public p240nj.AbstractC4846d mo10896d(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = p298qj.C5679f0.f22004a
            qj.g0 r3 = (p298qj.C5683g0) r3
            int[] r3 = r3.f22014Y
            p446z3.AbstractC7246d.m14327m(r1, r3, r0)
            int[] r3 = r2.f22014Y
            p298qj.C5679f0.m11968a(r0, r3, r0)
            qj.g0 r3 = new qj.g0
            r3.<init>(r0)
            return r3
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p298qj.C5683g0
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            qj.g0 r2 = (p298qj.C5683g0) r2
            int[] r0 = r1.f22014Y
            int[] r2 = r2.f22014Y
            boolean r2 = tj.AbstractC6255a.m12855l(r0, r2)
            return r2
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: f */
    public int mo10898f() {
            r1 = this;
            java.math.BigInteger r0 = p298qj.C5683g0.f22013Z
            int r0 = r0.bitLength()
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: g */
    public p240nj.AbstractC4846d mo10899g() {
            r3 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = p298qj.C5679f0.f22004a
            int[] r2 = r3.f22014Y
            p446z3.AbstractC7246d.m14327m(r1, r2, r0)
            qj.g0 r1 = new qj.g0
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: h */
    public boolean mo10900h() {
            r1 = this;
            int[] r0 = r1.f22014Y
            boolean r0 = tj.AbstractC6255a.m12863t(r0)
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.math.BigInteger r0 = p298qj.C5683g0.f22013Z
            int r0 = r0.hashCode()
            int[] r1 = r4.f22014Y
            r2 = 0
            r3 = 8
            int r1 = p400wj.C6888a.m13954f(r1, r2, r3)
            r0 = r0 ^ r1
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: i */
    public boolean mo10901i() {
            r1 = this;
            int[] r0 = r1.f22014Y
            boolean r0 = tj.AbstractC6255a.m12866w(r0)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: j */
    public p240nj.AbstractC4846d mo10902j(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = r2.f22014Y
            qj.g0 r3 = (p298qj.C5683g0) r3
            int[] r3 = r3.f22014Y
            p298qj.C5679f0.m11968a(r1, r3, r0)
            qj.g0 r3 = new qj.g0
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: m */
    public p240nj.AbstractC4846d mo10905m() {
            r3 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = r3.f22014Y
            boolean r2 = tj.AbstractC6255a.m12866w(r1)
            if (r2 == 0) goto L10
            tj.AbstractC6255a.m12843K(r0)
            goto L15
        L10:
            int[] r2 = p298qj.C5679f0.f22004a
            tj.AbstractC6255a.m12839G(r2, r1, r0)
        L15:
            qj.g0 r1 = new qj.g0
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: n */
    public p240nj.AbstractC4846d mo10906n() {
            r12 = this;
            int[] r0 = r12.f22014Y
            boolean r1 = tj.AbstractC6255a.m12866w(r0)
            if (r1 != 0) goto Ldf
            boolean r1 = tj.AbstractC6255a.m12863t(r0)
            if (r1 == 0) goto L10
            goto Ldf
        L10:
            r1 = 8
            int[] r2 = new int[r1]
            r3 = 16
            int[] r4 = new int[r3]
            tj.AbstractC6255a.m12836D(r0, r4)
            p298qj.C5679f0.m11969b(r4, r2)
            int[] r4 = new int[r3]
            tj.AbstractC6255a.m12833A(r2, r0, r4)
            p298qj.C5679f0.m11969b(r4, r2)
            int[] r4 = new int[r1]
            int[] r5 = new int[r3]
            tj.AbstractC6255a.m12836D(r2, r5)
            p298qj.C5679f0.m11969b(r5, r4)
            int[] r5 = new int[r3]
            tj.AbstractC6255a.m12833A(r4, r0, r5)
            p298qj.C5679f0.m11969b(r5, r4)
            int[] r5 = new int[r1]
            r6 = 3
            p298qj.C5679f0.m11972e(r4, r6, r5)
            int[] r7 = new int[r3]
            tj.AbstractC6255a.m12833A(r5, r4, r7)
            p298qj.C5679f0.m11969b(r7, r5)
            p298qj.C5679f0.m11972e(r5, r6, r5)
            int[] r7 = new int[r3]
            tj.AbstractC6255a.m12833A(r5, r4, r7)
            p298qj.C5679f0.m11969b(r7, r5)
            r7 = 2
            p298qj.C5679f0.m11972e(r5, r7, r5)
            int[] r8 = new int[r3]
            tj.AbstractC6255a.m12833A(r5, r2, r8)
            p298qj.C5679f0.m11969b(r8, r5)
            int[] r8 = new int[r1]
            r9 = 11
            p298qj.C5679f0.m11972e(r5, r9, r8)
            int[] r9 = new int[r3]
            tj.AbstractC6255a.m12833A(r8, r5, r9)
            p298qj.C5679f0.m11969b(r9, r8)
            r9 = 22
            p298qj.C5679f0.m11972e(r8, r9, r5)
            int[] r9 = new int[r3]
            tj.AbstractC6255a.m12833A(r5, r8, r9)
            p298qj.C5679f0.m11969b(r9, r5)
            int[] r9 = new int[r1]
            r10 = 44
            p298qj.C5679f0.m11972e(r5, r10, r9)
            int[] r11 = new int[r3]
            tj.AbstractC6255a.m12833A(r9, r5, r11)
            p298qj.C5679f0.m11969b(r11, r9)
            int[] r1 = new int[r1]
            r11 = 88
            p298qj.C5679f0.m11972e(r9, r11, r1)
            int[] r11 = new int[r3]
            tj.AbstractC6255a.m12833A(r1, r9, r11)
            p298qj.C5679f0.m11969b(r11, r1)
            p298qj.C5679f0.m11972e(r1, r10, r9)
            int[] r1 = new int[r3]
            tj.AbstractC6255a.m12833A(r9, r5, r1)
            p298qj.C5679f0.m11969b(r1, r9)
            p298qj.C5679f0.m11972e(r9, r6, r5)
            int[] r1 = new int[r3]
            tj.AbstractC6255a.m12833A(r5, r4, r1)
            p298qj.C5679f0.m11969b(r1, r5)
            r1 = 23
            p298qj.C5679f0.m11972e(r5, r1, r5)
            int[] r1 = new int[r3]
            tj.AbstractC6255a.m12833A(r5, r8, r1)
            p298qj.C5679f0.m11969b(r1, r5)
            r1 = 6
            p298qj.C5679f0.m11972e(r5, r1, r5)
            int[] r1 = new int[r3]
            tj.AbstractC6255a.m12833A(r5, r2, r1)
            p298qj.C5679f0.m11969b(r1, r5)
            p298qj.C5679f0.m11972e(r5, r7, r5)
            int[] r1 = new int[r3]
            tj.AbstractC6255a.m12836D(r5, r1)
            p298qj.C5679f0.m11969b(r1, r2)
            boolean r0 = tj.AbstractC6255a.m12855l(r0, r2)
            if (r0 == 0) goto Ldd
            qj.g0 r0 = new qj.g0
            r0.<init>(r5)
            goto Lde
        Ldd:
            r0 = 0
        Lde:
            return r0
        Ldf:
            return r12
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: o */
    public p240nj.AbstractC4846d mo10907o() {
            r2 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = r2.f22014Y
            p298qj.C5679f0.m11971d(r1, r0)
            qj.g0 r1 = new qj.g0
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: r */
    public p240nj.AbstractC4846d mo10910r(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = r2.f22014Y
            qj.g0 r3 = (p298qj.C5683g0) r3
            int[] r3 = r3.f22014Y
            p298qj.C5679f0.m11973f(r1, r3, r0)
            qj.g0 r3 = new qj.g0
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: s */
    public boolean mo10911s() {
            r3 = this;
            int[] r0 = r3.f22014Y
            r1 = 0
            int r0 = tj.AbstractC6255a.m12859p(r0, r1)
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
            int[] r0 = r1.f22014Y
            java.math.BigInteger r0 = tj.AbstractC6255a.m12841I(r0)
            return r0
    }
}
