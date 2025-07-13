package p261oj;

/* renamed from: oj.c */
/* loaded from: classes.dex */
public class C5307c extends p240nj.AbstractC4846d.b {

    /* renamed from: Z */
    public static final java.math.BigInteger f20557Z = null;

    /* renamed from: a0 */
    public static final int[] f20558a0 = null;

    /* renamed from: Y */
    public int[] f20559Y;

    static {
            java.math.BigInteger r0 = p261oj.C5305a.f20550j
            p261oj.C5307c.f20557Z = r0
            r0 = 8
            int[] r0 = new int[r0]
            r0 = {x000e: FILL_ARRAY_DATA , data: [1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848} // fill-array
            p261oj.C5307c.f20558a0 = r0
            return
    }

    public C5307c() {
            r1 = this;
            r1.<init>()
            r0 = 8
            int[] r0 = new int[r0]
            r1.f20559Y = r0
            return
    }

    public C5307c(java.math.BigInteger r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L26
            int r0 = r3.signum()
            if (r0 < 0) goto L26
            java.math.BigInteger r0 = p261oj.C5307c.f20557Z
            int r0 = r3.compareTo(r0)
            if (r0 >= 0) goto L26
            int[] r3 = tj.AbstractC6255a.m12857n(r3)
        L17:
            int[] r0 = p261oj.C5306b.f20555a
            boolean r1 = tj.AbstractC6255a.m12861r(r3, r0)
            if (r1 == 0) goto L23
            tj.AbstractC6255a.m12840H(r0, r3)
            goto L17
        L23:
            r2.f20559Y = r3
            return
        L26:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "x value invalid for Curve25519FieldElement"
            r3.<init>(r0)
            throw r3
    }

    public C5307c(int[] r1) {
            r0 = this;
            r0.<init>()
            r0.f20559Y = r1
            return
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: a */
    public p240nj.AbstractC4846d mo10893a(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = r2.f20559Y
            oj.c r3 = (p261oj.C5307c) r3
            int[] r3 = r3.f20559Y
            tj.AbstractC6255a.m12844a(r1, r3, r0)
            int[] r3 = p261oj.C5306b.f20555a
            boolean r3 = tj.AbstractC6255a.m12861r(r0, r3)
            if (r3 == 0) goto L18
            p261oj.C5306b.m11618f(r0)
        L18:
            oj.c r3 = new oj.c
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: b */
    public p240nj.AbstractC4846d mo10894b() {
            r3 = this;
            r0 = 8
            int[] r1 = new int[r0]
            int[] r2 = r3.f20559Y
            p085f1.AbstractC1972m.m4966A(r0, r2, r1)
            int[] r0 = p261oj.C5306b.f20555a
            boolean r0 = tj.AbstractC6255a.m12861r(r1, r0)
            if (r0 == 0) goto L14
            p261oj.C5306b.m11618f(r1)
        L14:
            oj.c r0 = new oj.c
            r0.<init>(r1)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: d */
    public p240nj.AbstractC4846d mo10896d(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = p261oj.C5306b.f20555a
            oj.c r3 = (p261oj.C5307c) r3
            int[] r3 = r3.f20559Y
            p446z3.AbstractC7246d.m14327m(r1, r3, r0)
            int[] r3 = r2.f20559Y
            p261oj.C5306b.m11613a(r0, r3, r0)
            oj.c r3 = new oj.c
            r3.<init>(r0)
            return r3
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p261oj.C5307c
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            oj.c r2 = (p261oj.C5307c) r2
            int[] r0 = r1.f20559Y
            int[] r2 = r2.f20559Y
            boolean r2 = tj.AbstractC6255a.m12855l(r0, r2)
            return r2
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: f */
    public int mo10898f() {
            r1 = this;
            java.math.BigInteger r0 = p261oj.C5307c.f20557Z
            int r0 = r0.bitLength()
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: g */
    public p240nj.AbstractC4846d mo10899g() {
            r3 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = p261oj.C5306b.f20555a
            int[] r2 = r3.f20559Y
            p446z3.AbstractC7246d.m14327m(r1, r2, r0)
            oj.c r1 = new oj.c
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: h */
    public boolean mo10900h() {
            r1 = this;
            int[] r0 = r1.f20559Y
            boolean r0 = tj.AbstractC6255a.m12863t(r0)
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.math.BigInteger r0 = p261oj.C5307c.f20557Z
            int r0 = r0.hashCode()
            int[] r1 = r4.f20559Y
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
            int[] r0 = r1.f20559Y
            boolean r0 = tj.AbstractC6255a.m12866w(r0)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: j */
    public p240nj.AbstractC4846d mo10902j(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = r2.f20559Y
            oj.c r3 = (p261oj.C5307c) r3
            int[] r3 = r3.f20559Y
            p261oj.C5306b.m11613a(r1, r3, r0)
            oj.c r3 = new oj.c
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: m */
    public p240nj.AbstractC4846d mo10905m() {
            r3 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = r3.f20559Y
            boolean r2 = tj.AbstractC6255a.m12866w(r1)
            if (r2 == 0) goto L10
            tj.AbstractC6255a.m12843K(r0)
            goto L15
        L10:
            int[] r2 = p261oj.C5306b.f20555a
            tj.AbstractC6255a.m12839G(r2, r1, r0)
        L15:
            oj.c r1 = new oj.c
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: n */
    public p240nj.AbstractC4846d mo10906n() {
            r7 = this;
            int[] r0 = r7.f20559Y
            boolean r1 = tj.AbstractC6255a.m12866w(r0)
            if (r1 != 0) goto Le5
            boolean r1 = tj.AbstractC6255a.m12863t(r0)
            if (r1 == 0) goto L10
            goto Le5
        L10:
            r1 = 8
            int[] r2 = new int[r1]
            r3 = 16
            int[] r4 = new int[r3]
            tj.AbstractC6255a.m12836D(r0, r4)
            p261oj.C5306b.m11614b(r4, r2)
            int[] r4 = new int[r3]
            tj.AbstractC6255a.m12833A(r2, r0, r4)
            p261oj.C5306b.m11614b(r4, r2)
            int[] r4 = new int[r3]
            tj.AbstractC6255a.m12836D(r2, r4)
            p261oj.C5306b.m11614b(r4, r2)
            int[] r4 = new int[r3]
            tj.AbstractC6255a.m12833A(r2, r0, r4)
            p261oj.C5306b.m11614b(r4, r2)
            int[] r4 = new int[r1]
            int[] r5 = new int[r3]
            tj.AbstractC6255a.m12836D(r2, r5)
            p261oj.C5306b.m11614b(r5, r4)
            int[] r5 = new int[r3]
            tj.AbstractC6255a.m12833A(r4, r0, r5)
            p261oj.C5306b.m11614b(r5, r4)
            int[] r1 = new int[r1]
            r5 = 3
            p261oj.C5306b.m11617e(r4, r5, r1)
            int[] r5 = new int[r3]
            tj.AbstractC6255a.m12833A(r1, r2, r5)
            p261oj.C5306b.m11614b(r5, r1)
            r5 = 4
            p261oj.C5306b.m11617e(r1, r5, r2)
            int[] r6 = new int[r3]
            tj.AbstractC6255a.m12833A(r2, r4, r6)
            p261oj.C5306b.m11614b(r6, r2)
            p261oj.C5306b.m11617e(r2, r5, r1)
            int[] r5 = new int[r3]
            tj.AbstractC6255a.m12833A(r1, r4, r5)
            p261oj.C5306b.m11614b(r5, r1)
            r5 = 15
            p261oj.C5306b.m11617e(r1, r5, r4)
            int[] r5 = new int[r3]
            tj.AbstractC6255a.m12833A(r4, r1, r5)
            p261oj.C5306b.m11614b(r5, r4)
            r5 = 30
            p261oj.C5306b.m11617e(r4, r5, r1)
            int[] r5 = new int[r3]
            tj.AbstractC6255a.m12833A(r1, r4, r5)
            p261oj.C5306b.m11614b(r5, r1)
            r5 = 60
            p261oj.C5306b.m11617e(r1, r5, r4)
            int[] r5 = new int[r3]
            tj.AbstractC6255a.m12833A(r4, r1, r5)
            p261oj.C5306b.m11614b(r5, r4)
            r5 = 11
            p261oj.C5306b.m11617e(r4, r5, r1)
            int[] r5 = new int[r3]
            tj.AbstractC6255a.m12833A(r1, r2, r5)
            p261oj.C5306b.m11614b(r5, r1)
            r5 = 120(0x78, float:1.68E-43)
            p261oj.C5306b.m11617e(r1, r5, r2)
            int[] r1 = new int[r3]
            tj.AbstractC6255a.m12833A(r2, r4, r1)
            p261oj.C5306b.m11614b(r1, r2)
            int[] r1 = new int[r3]
            tj.AbstractC6255a.m12836D(r2, r1)
            p261oj.C5306b.m11614b(r1, r2)
            int[] r1 = new int[r3]
            tj.AbstractC6255a.m12836D(r2, r1)
            p261oj.C5306b.m11614b(r1, r4)
            boolean r1 = tj.AbstractC6255a.m12855l(r0, r4)
            if (r1 == 0) goto Lca
            oj.c r0 = new oj.c
            r0.<init>(r2)
            return r0
        Lca:
            int[] r1 = p261oj.C5307c.f20558a0
            p261oj.C5306b.m11613a(r2, r1, r2)
            int[] r1 = new int[r3]
            tj.AbstractC6255a.m12836D(r2, r1)
            p261oj.C5306b.m11614b(r1, r4)
            boolean r0 = tj.AbstractC6255a.m12855l(r0, r4)
            if (r0 == 0) goto Le3
            oj.c r0 = new oj.c
            r0.<init>(r2)
            return r0
        Le3:
            r0 = 0
            return r0
        Le5:
            return r7
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: o */
    public p240nj.AbstractC4846d mo10907o() {
            r2 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = r2.f20559Y
            p261oj.C5306b.m11616d(r1, r0)
            oj.c r1 = new oj.c
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: r */
    public p240nj.AbstractC4846d mo10910r(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 8
            int[] r0 = new int[r0]
            int[] r1 = r2.f20559Y
            oj.c r3 = (p261oj.C5307c) r3
            int[] r3 = r3.f20559Y
            p261oj.C5306b.m11619g(r1, r3, r0)
            oj.c r3 = new oj.c
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: s */
    public boolean mo10911s() {
            r3 = this;
            int[] r0 = r3.f20559Y
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
            int[] r0 = r1.f20559Y
            java.math.BigInteger r0 = tj.AbstractC6255a.m12841I(r0)
            return r0
    }
}
