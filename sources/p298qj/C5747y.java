package p298qj;

/* renamed from: qj.y */
/* loaded from: classes.dex */
public class C5747y extends p240nj.AbstractC4846d.b {

    /* renamed from: Z */
    public static final java.math.BigInteger f22147Z = null;

    /* renamed from: a0 */
    public static final int[] f22148a0 = null;

    /* renamed from: Y */
    public int[] f22149Y;

    static {
            java.math.BigInteger r0 = p298qj.C5741w.f22134j
            p298qj.C5747y.f22147Z = r0
            r0 = 7
            int[] r0 = new int[r0]
            r0 = {x000e: FILL_ARRAY_DATA , data: [868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644} // fill-array
            p298qj.C5747y.f22148a0 = r0
            return
    }

    public C5747y() {
            r1 = this;
            r1.<init>()
            r0 = 7
            int[] r0 = new int[r0]
            r1.f22149Y = r0
            return
    }

    public C5747y(java.math.BigInteger r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L2e
            int r0 = r3.signum()
            if (r0 < 0) goto L2e
            java.math.BigInteger r0 = p298qj.C5747y.f22147Z
            int r0 = r3.compareTo(r0)
            if (r0 >= 0) goto L2e
            int[] r3 = p446z3.AbstractC7246d.m14321g(r3)
            r0 = 6
            r0 = r3[r0]
            r1 = -1
            if (r0 != r1) goto L2b
            int[] r0 = p298qj.C5744x.f22139a
            boolean r0 = p446z3.AbstractC7246d.m14323i(r3, r0)
            if (r0 == 0) goto L2b
            r0 = 7
            r1 = 6803(0x1a93, float:9.533E-42)
            p085f1.AbstractC1972m.m4996c(r0, r1, r3)
        L2b:
            r2.f22149Y = r3
            return
        L2e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "x value invalid for SecP224K1FieldElement"
            r3.<init>(r0)
            throw r3
    }

    public C5747y(int[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22149Y = r1
            return
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: a */
    public p240nj.AbstractC4846d mo10893a(p240nj.AbstractC4846d r4) {
            r3 = this;
            r0 = 7
            int[] r1 = new int[r0]
            int[] r2 = r3.f22149Y
            qj.y r4 = (p298qj.C5747y) r4
            int[] r4 = r4.f22149Y
            int r4 = p446z3.AbstractC7246d.m14315a(r2, r4, r1)
            if (r4 != 0) goto L1d
            r4 = 6
            r4 = r1[r4]
            r2 = -1
            if (r4 != r2) goto L22
            int[] r4 = p298qj.C5744x.f22139a
            boolean r4 = p446z3.AbstractC7246d.m14323i(r1, r4)
            if (r4 == 0) goto L22
        L1d:
            r4 = 6803(0x1a93, float:9.533E-42)
            p085f1.AbstractC1972m.m4996c(r0, r4, r1)
        L22:
            qj.y r4 = new qj.y
            r4.<init>(r1)
            return r4
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: b */
    public p240nj.AbstractC4846d mo10894b() {
            r4 = this;
            r0 = 7
            int[] r1 = new int[r0]
            int[] r2 = r4.f22149Y
            int r2 = p085f1.AbstractC1972m.m4966A(r0, r2, r1)
            if (r2 != 0) goto L19
            r2 = 6
            r2 = r1[r2]
            r3 = -1
            if (r2 != r3) goto L1e
            int[] r2 = p298qj.C5744x.f22139a
            boolean r2 = p446z3.AbstractC7246d.m14323i(r1, r2)
            if (r2 == 0) goto L1e
        L19:
            r2 = 6803(0x1a93, float:9.533E-42)
            p085f1.AbstractC1972m.m4996c(r0, r2, r1)
        L1e:
            qj.y r0 = new qj.y
            r0.<init>(r1)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: d */
    public p240nj.AbstractC4846d mo10896d(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 7
            int[] r0 = new int[r0]
            int[] r1 = p298qj.C5744x.f22139a
            qj.y r3 = (p298qj.C5747y) r3
            int[] r3 = r3.f22149Y
            p446z3.AbstractC7246d.m14327m(r1, r3, r0)
            int[] r3 = r2.f22149Y
            p298qj.C5744x.m12052a(r0, r3, r0)
            qj.y r3 = new qj.y
            r3.<init>(r0)
            return r3
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p298qj.C5747y
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            qj.y r2 = (p298qj.C5747y) r2
            int[] r0 = r1.f22149Y
            int[] r2 = r2.f22149Y
            boolean r2 = p446z3.AbstractC7246d.m14320f(r0, r2)
            return r2
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: f */
    public int mo10898f() {
            r1 = this;
            java.math.BigInteger r0 = p298qj.C5747y.f22147Z
            int r0 = r0.bitLength()
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: g */
    public p240nj.AbstractC4846d mo10899g() {
            r3 = this;
            r0 = 7
            int[] r0 = new int[r0]
            int[] r1 = p298qj.C5744x.f22139a
            int[] r2 = r3.f22149Y
            p446z3.AbstractC7246d.m14327m(r1, r2, r0)
            qj.y r1 = new qj.y
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: h */
    public boolean mo10900h() {
            r1 = this;
            int[] r0 = r1.f22149Y
            boolean r0 = p446z3.AbstractC7246d.m14328n(r0)
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.math.BigInteger r0 = p298qj.C5747y.f22147Z
            int r0 = r0.hashCode()
            int[] r1 = r4.f22149Y
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
            int[] r0 = r1.f22149Y
            boolean r0 = p446z3.AbstractC7246d.m14329o(r0)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: j */
    public p240nj.AbstractC4846d mo10902j(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 7
            int[] r0 = new int[r0]
            int[] r1 = r2.f22149Y
            qj.y r3 = (p298qj.C5747y) r3
            int[] r3 = r3.f22149Y
            p298qj.C5744x.m12052a(r1, r3, r0)
            qj.y r3 = new qj.y
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: m */
    public p240nj.AbstractC4846d mo10905m() {
            r3 = this;
            r0 = 7
            int[] r0 = new int[r0]
            int[] r1 = r3.f22149Y
            boolean r2 = p446z3.AbstractC7246d.m14329o(r1)
            if (r2 == 0) goto Lf
            p446z3.AbstractC7246d.m14337w(r0)
            goto L14
        Lf:
            int[] r2 = p298qj.C5744x.f22139a
            p446z3.AbstractC7246d.m14335u(r2, r1, r0)
        L14:
            qj.y r1 = new qj.y
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: n */
    public p240nj.AbstractC4846d mo10906n() {
            r10 = this;
            int[] r0 = r10.f22149Y
            boolean r1 = p446z3.AbstractC7246d.m14329o(r0)
            if (r1 != 0) goto L117
            boolean r1 = p446z3.AbstractC7246d.m14328n(r0)
            if (r1 == 0) goto L10
            goto L117
        L10:
            r1 = 7
            int[] r2 = new int[r1]
            r3 = 14
            int[] r4 = new int[r3]
            p446z3.AbstractC7246d.m14334t(r0, r4)
            p298qj.C5744x.m12053b(r4, r2)
            int[] r4 = new int[r3]
            p446z3.AbstractC7246d.m14332r(r2, r0, r4)
            p298qj.C5744x.m12053b(r4, r2)
            int[] r4 = new int[r3]
            p446z3.AbstractC7246d.m14334t(r2, r4)
            p298qj.C5744x.m12053b(r4, r2)
            int[] r4 = new int[r3]
            p446z3.AbstractC7246d.m14332r(r2, r0, r4)
            p298qj.C5744x.m12053b(r4, r2)
            int[] r4 = new int[r1]
            int[] r5 = new int[r3]
            p446z3.AbstractC7246d.m14334t(r2, r5)
            p298qj.C5744x.m12053b(r5, r4)
            int[] r5 = new int[r3]
            p446z3.AbstractC7246d.m14332r(r4, r0, r5)
            p298qj.C5744x.m12053b(r5, r4)
            int[] r5 = new int[r1]
            r6 = 4
            p298qj.C5744x.m12056e(r4, r6, r5)
            int[] r7 = new int[r3]
            p446z3.AbstractC7246d.m14332r(r5, r4, r7)
            p298qj.C5744x.m12053b(r7, r5)
            int[] r7 = new int[r1]
            r8 = 3
            p298qj.C5744x.m12056e(r5, r8, r7)
            int[] r9 = new int[r3]
            p446z3.AbstractC7246d.m14332r(r7, r2, r9)
            p298qj.C5744x.m12053b(r9, r7)
            r9 = 8
            p298qj.C5744x.m12056e(r7, r9, r7)
            int[] r9 = new int[r3]
            p446z3.AbstractC7246d.m14332r(r7, r5, r9)
            p298qj.C5744x.m12053b(r9, r7)
            p298qj.C5744x.m12056e(r7, r6, r5)
            int[] r9 = new int[r3]
            p446z3.AbstractC7246d.m14332r(r5, r4, r9)
            p298qj.C5744x.m12053b(r9, r5)
            r9 = 19
            p298qj.C5744x.m12056e(r5, r9, r4)
            int[] r9 = new int[r3]
            p446z3.AbstractC7246d.m14332r(r4, r7, r9)
            p298qj.C5744x.m12053b(r9, r4)
            int[] r1 = new int[r1]
            r9 = 42
            p298qj.C5744x.m12056e(r4, r9, r1)
            int[] r9 = new int[r3]
            p446z3.AbstractC7246d.m14332r(r1, r4, r9)
            p298qj.C5744x.m12053b(r9, r1)
            r9 = 23
            p298qj.C5744x.m12056e(r1, r9, r4)
            int[] r9 = new int[r3]
            p446z3.AbstractC7246d.m14332r(r4, r5, r9)
            p298qj.C5744x.m12053b(r9, r4)
            r9 = 84
            p298qj.C5744x.m12056e(r4, r9, r5)
            int[] r4 = new int[r3]
            p446z3.AbstractC7246d.m14332r(r5, r1, r4)
            p298qj.C5744x.m12053b(r4, r5)
            r4 = 20
            p298qj.C5744x.m12056e(r5, r4, r5)
            int[] r4 = new int[r3]
            p446z3.AbstractC7246d.m14332r(r5, r7, r4)
            p298qj.C5744x.m12053b(r4, r5)
            p298qj.C5744x.m12056e(r5, r8, r5)
            int[] r4 = new int[r3]
            p446z3.AbstractC7246d.m14332r(r5, r0, r4)
            p298qj.C5744x.m12053b(r4, r5)
            r4 = 2
            p298qj.C5744x.m12056e(r5, r4, r5)
            int[] r4 = new int[r3]
            p446z3.AbstractC7246d.m14332r(r5, r0, r4)
            p298qj.C5744x.m12053b(r4, r5)
            p298qj.C5744x.m12056e(r5, r6, r5)
            int[] r4 = new int[r3]
            p446z3.AbstractC7246d.m14332r(r5, r2, r4)
            p298qj.C5744x.m12053b(r4, r5)
            int[] r2 = new int[r3]
            p446z3.AbstractC7246d.m14334t(r5, r2)
            p298qj.C5744x.m12053b(r2, r5)
            int[] r2 = new int[r3]
            p446z3.AbstractC7246d.m14334t(r5, r2)
            p298qj.C5744x.m12053b(r2, r1)
            boolean r2 = p446z3.AbstractC7246d.m14320f(r0, r1)
            if (r2 == 0) goto Lfc
            qj.y r0 = new qj.y
            r0.<init>(r5)
            return r0
        Lfc:
            int[] r2 = p298qj.C5747y.f22148a0
            p298qj.C5744x.m12052a(r5, r2, r5)
            int[] r2 = new int[r3]
            p446z3.AbstractC7246d.m14334t(r5, r2)
            p298qj.C5744x.m12053b(r2, r1)
            boolean r0 = p446z3.AbstractC7246d.m14320f(r0, r1)
            if (r0 == 0) goto L115
            qj.y r0 = new qj.y
            r0.<init>(r5)
            return r0
        L115:
            r0 = 0
            return r0
        L117:
            return r10
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: o */
    public p240nj.AbstractC4846d mo10907o() {
            r2 = this;
            r0 = 7
            int[] r0 = new int[r0]
            int[] r1 = r2.f22149Y
            p298qj.C5744x.m12055d(r1, r0)
            qj.y r1 = new qj.y
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: r */
    public p240nj.AbstractC4846d mo10910r(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 7
            int[] r0 = new int[r0]
            int[] r1 = r2.f22149Y
            qj.y r3 = (p298qj.C5747y) r3
            int[] r3 = r3.f22149Y
            p298qj.C5744x.m12057f(r1, r3, r0)
            qj.y r3 = new qj.y
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: s */
    public boolean mo10911s() {
            r3 = this;
            int[] r0 = r3.f22149Y
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
            int[] r0 = r1.f22149Y
            java.math.BigInteger r0 = p446z3.AbstractC7246d.m14336v(r0)
            return r0
    }
}
