package p298qj;

/* renamed from: qj.i */
/* loaded from: classes.dex */
public class C5690i extends p240nj.AbstractC4846d.b {

    /* renamed from: Z */
    public static final java.math.BigInteger f22028Z = null;

    /* renamed from: Y */
    public int[] f22029Y;

    static {
            java.math.BigInteger r0 = p298qj.C5682g.f22008j
            p298qj.C5690i.f22028Z = r0
            return
    }

    public C5690i() {
            r1 = this;
            r1.<init>()
            r0 = 5
            int[] r0 = new int[r0]
            r1.f22029Y = r0
            return
    }

    public C5690i(java.math.BigInteger r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L2b
            int r0 = r3.signum()
            if (r0 < 0) goto L2b
            java.math.BigInteger r0 = p298qj.C5690i.f22028Z
            int r0 = r3.compareTo(r0)
            if (r0 >= 0) goto L2b
            int[] r3 = p139i1.AbstractC3061d.m7477g(r3)
            r0 = 4
            r0 = r3[r0]
            r1 = -1
            if (r0 != r1) goto L28
            int[] r0 = p298qj.C5686h.f22017a
            boolean r1 = p139i1.AbstractC3061d.m7479i(r3, r0)
            if (r1 == 0) goto L28
            p139i1.AbstractC3061d.m7488r(r0, r3)
        L28:
            r2.f22029Y = r3
            return
        L2b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "x value invalid for SecP160R1FieldElement"
            r3.<init>(r0)
            throw r3
    }

    public C5690i(int[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22029Y = r1
            return
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: a */
    public p240nj.AbstractC4846d mo10893a(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 5
            int[] r0 = new int[r0]
            int[] r1 = r2.f22029Y
            qj.i r3 = (p298qj.C5690i) r3
            int[] r3 = r3.f22029Y
            p298qj.C5686h.m11982a(r1, r3, r0)
            qj.i r3 = new qj.i
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: b */
    public p240nj.AbstractC4846d mo10894b() {
            r4 = this;
            r0 = 5
            int[] r1 = new int[r0]
            int[] r2 = r4.f22029Y
            int r2 = p085f1.AbstractC1972m.m4966A(r0, r2, r1)
            if (r2 != 0) goto L19
            r2 = 4
            r2 = r1[r2]
            r3 = -1
            if (r2 != r3) goto L1f
            int[] r2 = p298qj.C5686h.f22017a
            boolean r2 = p139i1.AbstractC3061d.m7479i(r1, r2)
            if (r2 == 0) goto L1f
        L19:
            r2 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            p085f1.AbstractC1972m.m5006k(r0, r2, r1)
        L1f:
            qj.i r0 = new qj.i
            r0.<init>(r1)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: d */
    public p240nj.AbstractC4846d mo10896d(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 5
            int[] r0 = new int[r0]
            int[] r1 = p298qj.C5686h.f22017a
            qj.i r3 = (p298qj.C5690i) r3
            int[] r3 = r3.f22029Y
            p446z3.AbstractC7246d.m14327m(r1, r3, r0)
            int[] r3 = r2.f22029Y
            p298qj.C5686h.m11983b(r0, r3, r0)
            qj.i r3 = new qj.i
            r3.<init>(r0)
            return r3
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p298qj.C5690i
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            qj.i r2 = (p298qj.C5690i) r2
            int[] r0 = r1.f22029Y
            int[] r2 = r2.f22029Y
            boolean r2 = p139i1.AbstractC3061d.m7476f(r0, r2)
            return r2
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: f */
    public int mo10898f() {
            r1 = this;
            java.math.BigInteger r0 = p298qj.C5690i.f22028Z
            int r0 = r0.bitLength()
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: g */
    public p240nj.AbstractC4846d mo10899g() {
            r3 = this;
            r0 = 5
            int[] r0 = new int[r0]
            int[] r1 = p298qj.C5686h.f22017a
            int[] r2 = r3.f22029Y
            p446z3.AbstractC7246d.m14327m(r1, r2, r0)
            qj.i r1 = new qj.i
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: h */
    public boolean mo10900h() {
            r1 = this;
            int[] r0 = r1.f22029Y
            boolean r0 = p139i1.AbstractC3061d.m7480j(r0)
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.math.BigInteger r0 = p298qj.C5690i.f22028Z
            int r0 = r0.hashCode()
            int[] r1 = r4.f22029Y
            r2 = 0
            r3 = 5
            int r1 = p400wj.C6888a.m13954f(r1, r2, r3)
            r0 = r0 ^ r1
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: i */
    public boolean mo10901i() {
            r1 = this;
            int[] r0 = r1.f22029Y
            boolean r0 = p139i1.AbstractC3061d.m7481k(r0)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: j */
    public p240nj.AbstractC4846d mo10902j(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 5
            int[] r0 = new int[r0]
            int[] r1 = r2.f22029Y
            qj.i r3 = (p298qj.C5690i) r3
            int[] r3 = r3.f22029Y
            p298qj.C5686h.m11983b(r1, r3, r0)
            qj.i r3 = new qj.i
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: m */
    public p240nj.AbstractC4846d mo10905m() {
            r3 = this;
            r0 = 5
            int[] r0 = new int[r0]
            int[] r1 = r3.f22029Y
            boolean r2 = p139i1.AbstractC3061d.m7481k(r1)
            if (r2 == 0) goto Lf
            p139i1.AbstractC3061d.m7490t(r0)
            goto L14
        Lf:
            int[] r2 = p298qj.C5686h.f22017a
            p139i1.AbstractC3061d.m7487q(r2, r1, r0)
        L14:
            qj.i r1 = new qj.i
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: n */
    public p240nj.AbstractC4846d mo10906n() {
            r5 = this;
            int[] r0 = r5.f22029Y
            boolean r1 = p139i1.AbstractC3061d.m7481k(r0)
            if (r1 != 0) goto L9e
            boolean r1 = p139i1.AbstractC3061d.m7480j(r0)
            if (r1 == 0) goto L10
            goto L9e
        L10:
            r1 = 5
            int[] r2 = new int[r1]
            r3 = 10
            int[] r4 = new int[r3]
            p139i1.AbstractC3061d.m7486p(r0, r4)
            p298qj.C5686h.m11984c(r4, r2)
            int[] r4 = new int[r3]
            p139i1.AbstractC3061d.m7484n(r2, r0, r4)
            p298qj.C5686h.m11984c(r4, r2)
            int[] r1 = new int[r1]
            r4 = 2
            p298qj.C5686h.m11987f(r2, r4, r1)
            int[] r4 = new int[r3]
            p139i1.AbstractC3061d.m7484n(r1, r2, r4)
            p298qj.C5686h.m11984c(r4, r1)
            r4 = 4
            p298qj.C5686h.m11987f(r1, r4, r2)
            int[] r4 = new int[r3]
            p139i1.AbstractC3061d.m7484n(r2, r1, r4)
            p298qj.C5686h.m11984c(r4, r2)
            r4 = 8
            p298qj.C5686h.m11987f(r2, r4, r1)
            int[] r4 = new int[r3]
            p139i1.AbstractC3061d.m7484n(r1, r2, r4)
            p298qj.C5686h.m11984c(r4, r1)
            r4 = 16
            p298qj.C5686h.m11987f(r1, r4, r2)
            int[] r4 = new int[r3]
            p139i1.AbstractC3061d.m7484n(r2, r1, r4)
            p298qj.C5686h.m11984c(r4, r2)
            r4 = 32
            p298qj.C5686h.m11987f(r2, r4, r1)
            int[] r4 = new int[r3]
            p139i1.AbstractC3061d.m7484n(r1, r2, r4)
            p298qj.C5686h.m11984c(r4, r1)
            r4 = 64
            p298qj.C5686h.m11987f(r1, r4, r2)
            int[] r4 = new int[r3]
            p139i1.AbstractC3061d.m7484n(r2, r1, r4)
            p298qj.C5686h.m11984c(r4, r2)
            int[] r4 = new int[r3]
            p139i1.AbstractC3061d.m7486p(r2, r4)
            p298qj.C5686h.m11984c(r4, r1)
            int[] r4 = new int[r3]
            p139i1.AbstractC3061d.m7484n(r1, r0, r4)
            p298qj.C5686h.m11984c(r4, r1)
            r4 = 29
            p298qj.C5686h.m11987f(r1, r4, r1)
            int[] r3 = new int[r3]
            p139i1.AbstractC3061d.m7486p(r1, r3)
            p298qj.C5686h.m11984c(r3, r2)
            boolean r0 = p139i1.AbstractC3061d.m7476f(r0, r2)
            if (r0 == 0) goto L9c
            qj.i r0 = new qj.i
            r0.<init>(r1)
            goto L9d
        L9c:
            r0 = 0
        L9d:
            return r0
        L9e:
            return r5
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: o */
    public p240nj.AbstractC4846d mo10907o() {
            r2 = this;
            r0 = 5
            int[] r0 = new int[r0]
            int[] r1 = r2.f22029Y
            p298qj.C5686h.m11986e(r1, r0)
            qj.i r1 = new qj.i
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: r */
    public p240nj.AbstractC4846d mo10910r(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 5
            int[] r0 = new int[r0]
            int[] r1 = r2.f22029Y
            qj.i r3 = (p298qj.C5690i) r3
            int[] r3 = r3.f22029Y
            p298qj.C5686h.m11988g(r1, r3, r0)
            qj.i r3 = new qj.i
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: s */
    public boolean mo10911s() {
            r3 = this;
            int[] r0 = r3.f22029Y
            r1 = 0
            int r0 = p139i1.AbstractC3061d.m7478h(r0, r1)
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
            int[] r0 = r1.f22029Y
            java.math.BigInteger r0 = p139i1.AbstractC3061d.m7489s(r0)
            return r0
    }
}
