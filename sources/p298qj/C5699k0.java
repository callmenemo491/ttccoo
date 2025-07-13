package p298qj;

/* renamed from: qj.k0 */
/* loaded from: classes.dex */
public class C5699k0 extends p240nj.AbstractC4846d.b {

    /* renamed from: Z */
    public static final java.math.BigInteger f22050Z = null;

    /* renamed from: Y */
    public int[] f22051Y;

    static {
            java.math.BigInteger r0 = p298qj.C5691i0.f22030j
            p298qj.C5699k0.f22050Z = r0
            return
    }

    public C5699k0() {
            r1 = this;
            r1.<init>()
            r0 = 8
            int[] r0 = new int[r0]
            r1.f22051Y = r0
            return
    }

    public C5699k0(java.math.BigInteger r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L2b
            int r0 = r3.signum()
            if (r0 < 0) goto L2b
            java.math.BigInteger r0 = p298qj.C5699k0.f22050Z
            int r0 = r3.compareTo(r0)
            if (r0 >= 0) goto L2b
            int[] r3 = tj.AbstractC6255a.m12857n(r3)
            r0 = 7
            r0 = r3[r0]
            r1 = -1
            if (r0 != r1) goto L28
            int[] r0 = p298qj.C5695j0.f22035a
            boolean r1 = tj.AbstractC6255a.m12861r(r3, r0)
            if (r1 == 0) goto L28
            tj.AbstractC6255a.m12840H(r0, r3)
        L28:
            r2.f22051Y = r3
            return
        L2b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "x value invalid for SecP256R1FieldElement"
            r3.<init>(r0)
            throw r3
    }

    public C5699k0(int[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22051Y = r1
            return
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: a */
    public p240nj.AbstractC4846d mo10893a(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = r2.f22051Y
            qj.k0 r3 = (p298qj.C5699k0) r3
            int[] r3 = r3.f22051Y
            p298qj.C5695j0.m11989a(r1, r3, r0)
            qj.k0 r3 = new qj.k0
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: b */
    public p240nj.AbstractC4846d mo10894b() {
            r3 = this;
            r0 = 8
            int[] r1 = new int[r0]
            int[] r2 = r3.f22051Y
            int r0 = p085f1.AbstractC1972m.m4966A(r0, r2, r1)
            if (r0 != 0) goto L1a
            r0 = 7
            r0 = r1[r0]
            r2 = -1
            if (r0 != r2) goto L1d
            int[] r0 = p298qj.C5695j0.f22035a
            boolean r0 = tj.AbstractC6255a.m12861r(r1, r0)
            if (r0 == 0) goto L1d
        L1a:
            p298qj.C5695j0.m11990b(r1)
        L1d:
            qj.k0 r0 = new qj.k0
            r0.<init>(r1)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: d */
    public p240nj.AbstractC4846d mo10896d(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = p298qj.C5695j0.f22035a
            qj.k0 r3 = (p298qj.C5699k0) r3
            int[] r3 = r3.f22051Y
            p446z3.AbstractC7246d.m14327m(r1, r3, r0)
            int[] r3 = r2.f22051Y
            p298qj.C5695j0.m11991c(r0, r3, r0)
            qj.k0 r3 = new qj.k0
            r3.<init>(r0)
            return r3
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p298qj.C5699k0
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            qj.k0 r2 = (p298qj.C5699k0) r2
            int[] r0 = r1.f22051Y
            int[] r2 = r2.f22051Y
            boolean r2 = tj.AbstractC6255a.m12855l(r0, r2)
            return r2
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: f */
    public int mo10898f() {
            r1 = this;
            java.math.BigInteger r0 = p298qj.C5699k0.f22050Z
            int r0 = r0.bitLength()
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: g */
    public p240nj.AbstractC4846d mo10899g() {
            r3 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = p298qj.C5695j0.f22035a
            int[] r2 = r3.f22051Y
            p446z3.AbstractC7246d.m14327m(r1, r2, r0)
            qj.k0 r1 = new qj.k0
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: h */
    public boolean mo10900h() {
            r1 = this;
            int[] r0 = r1.f22051Y
            boolean r0 = tj.AbstractC6255a.m12863t(r0)
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.math.BigInteger r0 = p298qj.C5699k0.f22050Z
            int r0 = r0.hashCode()
            int[] r1 = r4.f22051Y
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
            int[] r0 = r1.f22051Y
            boolean r0 = tj.AbstractC6255a.m12866w(r0)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: j */
    public p240nj.AbstractC4846d mo10902j(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = r2.f22051Y
            qj.k0 r3 = (p298qj.C5699k0) r3
            int[] r3 = r3.f22051Y
            p298qj.C5695j0.m11991c(r1, r3, r0)
            qj.k0 r3 = new qj.k0
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: m */
    public p240nj.AbstractC4846d mo10905m() {
            r3 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = r3.f22051Y
            boolean r2 = tj.AbstractC6255a.m12866w(r1)
            if (r2 == 0) goto L10
            tj.AbstractC6255a.m12843K(r0)
            goto L15
        L10:
            int[] r2 = p298qj.C5695j0.f22035a
            tj.AbstractC6255a.m12839G(r2, r1, r0)
        L15:
            qj.k0 r1 = new qj.k0
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: n */
    public p240nj.AbstractC4846d mo10906n() {
            r6 = this;
            int[] r0 = r6.f22051Y
            boolean r1 = tj.AbstractC6255a.m12866w(r0)
            if (r1 != 0) goto L8b
            boolean r1 = tj.AbstractC6255a.m12863t(r0)
            if (r1 == 0) goto L10
            goto L8b
        L10:
            r1 = 8
            int[] r2 = new int[r1]
            int[] r3 = new int[r1]
            r4 = 16
            int[] r5 = new int[r4]
            tj.AbstractC6255a.m12836D(r0, r5)
            p298qj.C5695j0.m11992d(r5, r2)
            int[] r5 = new int[r4]
            tj.AbstractC6255a.m12833A(r2, r0, r5)
            p298qj.C5695j0.m11992d(r5, r2)
            r5 = 2
            p298qj.C5695j0.m11995g(r2, r5, r3)
            int[] r5 = new int[r4]
            tj.AbstractC6255a.m12833A(r3, r2, r5)
            p298qj.C5695j0.m11992d(r5, r3)
            r5 = 4
            p298qj.C5695j0.m11995g(r3, r5, r2)
            int[] r5 = new int[r4]
            tj.AbstractC6255a.m12833A(r2, r3, r5)
            p298qj.C5695j0.m11992d(r5, r2)
            p298qj.C5695j0.m11995g(r2, r1, r3)
            int[] r1 = new int[r4]
            tj.AbstractC6255a.m12833A(r3, r2, r1)
            p298qj.C5695j0.m11992d(r1, r3)
            p298qj.C5695j0.m11995g(r3, r4, r2)
            int[] r1 = new int[r4]
            tj.AbstractC6255a.m12833A(r2, r3, r1)
            p298qj.C5695j0.m11992d(r1, r2)
            r1 = 32
            p298qj.C5695j0.m11995g(r2, r1, r2)
            int[] r1 = new int[r4]
            tj.AbstractC6255a.m12833A(r2, r0, r1)
            p298qj.C5695j0.m11992d(r1, r2)
            r1 = 96
            p298qj.C5695j0.m11995g(r2, r1, r2)
            int[] r1 = new int[r4]
            tj.AbstractC6255a.m12833A(r2, r0, r1)
            p298qj.C5695j0.m11992d(r1, r2)
            r1 = 94
            p298qj.C5695j0.m11995g(r2, r1, r2)
            int[] r1 = new int[r4]
            tj.AbstractC6255a.m12836D(r2, r1)
            p298qj.C5695j0.m11992d(r1, r3)
            boolean r0 = tj.AbstractC6255a.m12855l(r0, r3)
            if (r0 == 0) goto L89
            qj.k0 r0 = new qj.k0
            r0.<init>(r2)
            goto L8a
        L89:
            r0 = 0
        L8a:
            return r0
        L8b:
            return r6
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: o */
    public p240nj.AbstractC4846d mo10907o() {
            r2 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = r2.f22051Y
            p298qj.C5695j0.m11994f(r1, r0)
            qj.k0 r1 = new qj.k0
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: r */
    public p240nj.AbstractC4846d mo10910r(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = r2.f22051Y
            qj.k0 r3 = (p298qj.C5699k0) r3
            int[] r3 = r3.f22051Y
            p298qj.C5695j0.m11996h(r1, r3, r0)
            qj.k0 r3 = new qj.k0
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: s */
    public boolean mo10911s() {
            r3 = this;
            int[] r0 = r3.f22051Y
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
            int[] r0 = r1.f22051Y
            java.math.BigInteger r0 = tj.AbstractC6255a.m12841I(r0)
            return r0
    }
}
