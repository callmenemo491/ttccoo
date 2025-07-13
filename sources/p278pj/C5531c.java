package p278pj;

/* renamed from: pj.c */
/* loaded from: classes.dex */
public class C5531c extends p240nj.AbstractC4846d.b {

    /* renamed from: Z */
    public static final java.math.BigInteger f21536Z = null;

    /* renamed from: Y */
    public int[] f21537Y;

    static {
            java.math.BigInteger r0 = p278pj.C5529a.f21529j
            p278pj.C5531c.f21536Z = r0
            return
    }

    public C5531c() {
            r1 = this;
            r1.<init>()
            r0 = 8
            int[] r0 = new int[r0]
            r1.f21537Y = r0
            return
    }

    public C5531c(java.math.BigInteger r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L2f
            int r0 = r3.signum()
            if (r0 < 0) goto L2f
            java.math.BigInteger r0 = p278pj.C5531c.f21536Z
            int r0 = r3.compareTo(r0)
            if (r0 >= 0) goto L2f
            int[] r3 = tj.AbstractC6255a.m12857n(r3)
            r0 = 7
            r0 = r3[r0]
            int r0 = r0 >>> 1
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 < r1) goto L2c
            int[] r0 = p278pj.C5530b.f21534a
            boolean r1 = tj.AbstractC6255a.m12861r(r3, r0)
            if (r1 == 0) goto L2c
            tj.AbstractC6255a.m12840H(r0, r3)
        L2c:
            r2.f21537Y = r3
            return
        L2f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "x value invalid for SM2P256V1FieldElement"
            r3.<init>(r0)
            throw r3
    }

    public C5531c(int[] r1) {
            r0 = this;
            r0.<init>()
            r0.f21537Y = r1
            return
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: a */
    public p240nj.AbstractC4846d mo10893a(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = r2.f21537Y
            pj.c r3 = (p278pj.C5531c) r3
            int[] r3 = r3.f21537Y
            p278pj.C5530b.m11790a(r1, r3, r0)
            pj.c r3 = new pj.c
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: b */
    public p240nj.AbstractC4846d mo10894b() {
            r3 = this;
            r0 = 8
            int[] r1 = new int[r0]
            int[] r2 = r3.f21537Y
            int r0 = p085f1.AbstractC1972m.m4966A(r0, r2, r1)
            if (r0 != 0) goto L1e
            r0 = 7
            r0 = r1[r0]
            int r0 = r0 >>> 1
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r0 < r2) goto L21
            int[] r0 = p278pj.C5530b.f21534a
            boolean r0 = tj.AbstractC6255a.m12861r(r1, r0)
            if (r0 == 0) goto L21
        L1e:
            p278pj.C5530b.m11791b(r1)
        L21:
            pj.c r0 = new pj.c
            r0.<init>(r1)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: d */
    public p240nj.AbstractC4846d mo10896d(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = p278pj.C5530b.f21534a
            pj.c r3 = (p278pj.C5531c) r3
            int[] r3 = r3.f21537Y
            p446z3.AbstractC7246d.m14327m(r1, r3, r0)
            int[] r3 = r2.f21537Y
            p278pj.C5530b.m11792c(r0, r3, r0)
            pj.c r3 = new pj.c
            r3.<init>(r0)
            return r3
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p278pj.C5531c
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            pj.c r2 = (p278pj.C5531c) r2
            int[] r0 = r1.f21537Y
            int[] r2 = r2.f21537Y
            boolean r2 = tj.AbstractC6255a.m12855l(r0, r2)
            return r2
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: f */
    public int mo10898f() {
            r1 = this;
            java.math.BigInteger r0 = p278pj.C5531c.f21536Z
            int r0 = r0.bitLength()
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: g */
    public p240nj.AbstractC4846d mo10899g() {
            r3 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = p278pj.C5530b.f21534a
            int[] r2 = r3.f21537Y
            p446z3.AbstractC7246d.m14327m(r1, r2, r0)
            pj.c r1 = new pj.c
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: h */
    public boolean mo10900h() {
            r1 = this;
            int[] r0 = r1.f21537Y
            boolean r0 = tj.AbstractC6255a.m12863t(r0)
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.math.BigInteger r0 = p278pj.C5531c.f21536Z
            int r0 = r0.hashCode()
            int[] r1 = r4.f21537Y
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
            int[] r0 = r1.f21537Y
            boolean r0 = tj.AbstractC6255a.m12866w(r0)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: j */
    public p240nj.AbstractC4846d mo10902j(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = r2.f21537Y
            pj.c r3 = (p278pj.C5531c) r3
            int[] r3 = r3.f21537Y
            p278pj.C5530b.m11792c(r1, r3, r0)
            pj.c r3 = new pj.c
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: m */
    public p240nj.AbstractC4846d mo10905m() {
            r3 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = r3.f21537Y
            boolean r2 = tj.AbstractC6255a.m12866w(r1)
            if (r2 == 0) goto L10
            tj.AbstractC6255a.m12843K(r0)
            goto L15
        L10:
            int[] r2 = p278pj.C5530b.f21534a
            tj.AbstractC6255a.m12839G(r2, r1, r0)
        L15:
            pj.c r1 = new pj.c
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: n */
    public p240nj.AbstractC4846d mo10906n() {
            r8 = this;
            int[] r0 = r8.f21537Y
            boolean r1 = tj.AbstractC6255a.m12866w(r0)
            if (r1 != 0) goto Lce
            boolean r1 = tj.AbstractC6255a.m12863t(r0)
            if (r1 == 0) goto L10
            goto Lce
        L10:
            r1 = 8
            int[] r2 = new int[r1]
            r3 = 16
            int[] r4 = new int[r3]
            tj.AbstractC6255a.m12836D(r0, r4)
            p278pj.C5530b.m11793d(r4, r2)
            int[] r4 = new int[r3]
            tj.AbstractC6255a.m12833A(r2, r0, r4)
            p278pj.C5530b.m11793d(r4, r2)
            int[] r4 = new int[r1]
            r5 = 2
            p278pj.C5530b.m11796g(r2, r5, r4)
            int[] r6 = new int[r3]
            tj.AbstractC6255a.m12833A(r4, r2, r6)
            p278pj.C5530b.m11793d(r6, r4)
            int[] r6 = new int[r1]
            p278pj.C5530b.m11796g(r4, r5, r6)
            int[] r5 = new int[r3]
            tj.AbstractC6255a.m12833A(r6, r2, r5)
            p278pj.C5530b.m11793d(r5, r6)
            r5 = 6
            p278pj.C5530b.m11796g(r6, r5, r2)
            int[] r7 = new int[r3]
            tj.AbstractC6255a.m12833A(r2, r6, r7)
            p278pj.C5530b.m11793d(r7, r2)
            int[] r1 = new int[r1]
            r7 = 12
            p278pj.C5530b.m11796g(r2, r7, r1)
            int[] r7 = new int[r3]
            tj.AbstractC6255a.m12833A(r1, r2, r7)
            p278pj.C5530b.m11793d(r7, r1)
            p278pj.C5530b.m11796g(r1, r5, r2)
            int[] r5 = new int[r3]
            tj.AbstractC6255a.m12833A(r2, r6, r5)
            p278pj.C5530b.m11793d(r5, r2)
            int[] r5 = new int[r3]
            tj.AbstractC6255a.m12836D(r2, r5)
            p278pj.C5530b.m11793d(r5, r6)
            int[] r5 = new int[r3]
            tj.AbstractC6255a.m12833A(r6, r0, r5)
            p278pj.C5530b.m11793d(r5, r6)
            r5 = 31
            p278pj.C5530b.m11796g(r6, r5, r1)
            int[] r5 = new int[r3]
            tj.AbstractC6255a.m12833A(r1, r6, r5)
            p278pj.C5530b.m11793d(r5, r2)
            r5 = 32
            p278pj.C5530b.m11796g(r1, r5, r1)
            int[] r6 = new int[r3]
            tj.AbstractC6255a.m12833A(r1, r2, r6)
            p278pj.C5530b.m11793d(r6, r1)
            r6 = 62
            p278pj.C5530b.m11796g(r1, r6, r1)
            int[] r7 = new int[r3]
            tj.AbstractC6255a.m12833A(r1, r2, r7)
            p278pj.C5530b.m11793d(r7, r1)
            r2 = 4
            p278pj.C5530b.m11796g(r1, r2, r1)
            int[] r2 = new int[r3]
            tj.AbstractC6255a.m12833A(r1, r4, r2)
            p278pj.C5530b.m11793d(r2, r1)
            p278pj.C5530b.m11796g(r1, r5, r1)
            int[] r2 = new int[r3]
            tj.AbstractC6255a.m12833A(r1, r0, r2)
            p278pj.C5530b.m11793d(r2, r1)
            p278pj.C5530b.m11796g(r1, r6, r1)
            int[] r2 = new int[r3]
            tj.AbstractC6255a.m12836D(r1, r2)
            p278pj.C5530b.m11793d(r2, r4)
            boolean r0 = tj.AbstractC6255a.m12855l(r0, r4)
            if (r0 == 0) goto Lcc
            pj.c r0 = new pj.c
            r0.<init>(r1)
            goto Lcd
        Lcc:
            r0 = 0
        Lcd:
            return r0
        Lce:
            return r8
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: o */
    public p240nj.AbstractC4846d mo10907o() {
            r2 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = r2.f21537Y
            p278pj.C5530b.m11795f(r1, r0)
            pj.c r1 = new pj.c
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: r */
    public p240nj.AbstractC4846d mo10910r(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = r2.f21537Y
            pj.c r3 = (p278pj.C5531c) r3
            int[] r3 = r3.f21537Y
            p278pj.C5530b.m11797h(r1, r3, r0)
            pj.c r3 = new pj.c
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: s */
    public boolean mo10911s() {
            r3 = this;
            int[] r0 = r3.f21537Y
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
            int[] r0 = r1.f21537Y
            java.math.BigInteger r0 = tj.AbstractC6255a.m12841I(r0)
            return r0
    }
}
