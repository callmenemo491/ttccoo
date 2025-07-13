package p298qj;

/* renamed from: qj.s0 */
/* loaded from: classes.dex */
public class C5730s0 extends p240nj.AbstractC4846d.b {

    /* renamed from: Z */
    public static final java.math.BigInteger f22113Z = null;

    /* renamed from: Y */
    public int[] f22114Y;

    static {
            java.math.BigInteger r0 = p298qj.C5723q0.f22098j
            p298qj.C5730s0.f22113Z = r0
            return
    }

    public C5730s0() {
            r1 = this;
            r1.<init>()
            r0 = 17
            int[] r0 = new int[r0]
            r1.f22114Y = r0
            return
    }

    public C5730s0(java.math.BigInteger r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L29
            int r0 = r3.signum()
            if (r0 < 0) goto L29
            java.math.BigInteger r0 = p298qj.C5730s0.f22113Z
            int r0 = r3.compareTo(r0)
            if (r0 >= 0) goto L29
            r0 = 521(0x209, float:7.3E-43)
            int[] r3 = p085f1.AbstractC1972m.m5014s(r0, r3)
            int[] r0 = p298qj.C5727r0.f22107a
            r1 = 17
            boolean r0 = p085f1.AbstractC1972m.m5011p(r1, r3, r0)
            if (r0 == 0) goto L26
            p085f1.AbstractC1972m.m4997c0(r1, r3)
        L26:
            r2.f22114Y = r3
            return
        L29:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "x value invalid for SecP521R1FieldElement"
            r3.<init>(r0)
            throw r3
    }

    public C5730s0(int[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22114Y = r1
            return
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: a */
    public p240nj.AbstractC4846d mo10893a(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 17
            int[] r0 = new int[r0]
            int[] r1 = r2.f22114Y
            qj.s0 r3 = (p298qj.C5730s0) r3
            int[] r3 = r3.f22114Y
            p298qj.C5727r0.m12037a(r1, r3, r0)
            qj.s0 r3 = new qj.s0
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: b */
    public p240nj.AbstractC4846d mo10894b() {
            r5 = this;
            r0 = 17
            int[] r0 = new int[r0]
            int[] r1 = r5.f22114Y
            r2 = 16
            int r3 = p085f1.AbstractC1972m.m4966A(r2, r1, r0)
            r1 = r1[r2]
            int r3 = r3 + r1
            r1 = 511(0x1ff, float:7.16E-43)
            if (r3 > r1) goto L1d
            if (r3 != r1) goto L24
            int[] r4 = p298qj.C5727r0.f22107a
            boolean r4 = p085f1.AbstractC1972m.m5011p(r2, r0, r4)
            if (r4 == 0) goto L24
        L1d:
            int r4 = p085f1.AbstractC1972m.m5021z(r2, r0)
            int r4 = r4 + r3
            r3 = r4 & 511(0x1ff, float:7.16E-43)
        L24:
            r0[r2] = r3
            qj.s0 r1 = new qj.s0
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: d */
    public p240nj.AbstractC4846d mo10896d(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 17
            int[] r0 = new int[r0]
            int[] r1 = p298qj.C5727r0.f22107a
            qj.s0 r3 = (p298qj.C5730s0) r3
            int[] r3 = r3.f22114Y
            p446z3.AbstractC7246d.m14327m(r1, r3, r0)
            int[] r3 = r2.f22114Y
            p298qj.C5727r0.m12039c(r0, r3, r0)
            qj.s0 r3 = new qj.s0
            r3.<init>(r0)
            return r3
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L4
            r3 = 1
            return r3
        L4:
            boolean r0 = r3 instanceof p298qj.C5730s0
            if (r0 != 0) goto La
            r3 = 0
            return r3
        La:
            qj.s0 r3 = (p298qj.C5730s0) r3
            r0 = 17
            int[] r1 = r2.f22114Y
            int[] r3 = r3.f22114Y
            boolean r3 = p085f1.AbstractC1972m.m5011p(r0, r1, r3)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: f */
    public int mo10898f() {
            r1 = this;
            java.math.BigInteger r0 = p298qj.C5730s0.f22113Z
            int r0 = r0.bitLength()
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: g */
    public p240nj.AbstractC4846d mo10899g() {
            r3 = this;
            r0 = 17
            int[] r0 = new int[r0]
            int[] r1 = p298qj.C5727r0.f22107a
            int[] r2 = r3.f22114Y
            p446z3.AbstractC7246d.m14327m(r1, r2, r0)
            qj.s0 r1 = new qj.s0
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: h */
    public boolean mo10900h() {
            r2 = this;
            int[] r0 = r2.f22114Y
            r1 = 17
            boolean r0 = p085f1.AbstractC1972m.m4969D(r1, r0)
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.math.BigInteger r0 = p298qj.C5730s0.f22113Z
            int r0 = r0.hashCode()
            int[] r1 = r4.f22114Y
            r2 = 0
            r3 = 17
            int r1 = p400wj.C6888a.m13954f(r1, r2, r3)
            r0 = r0 ^ r1
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: i */
    public boolean mo10901i() {
            r2 = this;
            int[] r0 = r2.f22114Y
            r1 = 17
            boolean r0 = p085f1.AbstractC1972m.m4972G(r1, r0)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: j */
    public p240nj.AbstractC4846d mo10902j(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 17
            int[] r0 = new int[r0]
            int[] r1 = r2.f22114Y
            qj.s0 r3 = (p298qj.C5730s0) r3
            int[] r3 = r3.f22114Y
            p298qj.C5727r0.m12039c(r1, r3, r0)
            qj.s0 r3 = new qj.s0
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: m */
    public p240nj.AbstractC4846d mo10905m() {
            r4 = this;
            r0 = 17
            int[] r1 = new int[r0]
            int[] r2 = r4.f22114Y
            boolean r3 = p085f1.AbstractC1972m.m4972G(r0, r2)
            if (r3 == 0) goto L10
            p085f1.AbstractC1972m.m4997c0(r0, r1)
            goto L15
        L10:
            int[] r3 = p298qj.C5727r0.f22107a
            p085f1.AbstractC1972m.m4984S(r0, r3, r2, r1)
        L15:
            qj.s0 r0 = new qj.s0
            r0.<init>(r1)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: n */
    public p240nj.AbstractC4846d mo10906n() {
            r7 = this;
            int[] r0 = r7.f22114Y
            r1 = 17
            boolean r2 = p085f1.AbstractC1972m.m4972G(r1, r0)
            if (r2 != 0) goto L3f
            boolean r2 = p085f1.AbstractC1972m.m4969D(r1, r0)
            if (r2 == 0) goto L11
            goto L3f
        L11:
            int[] r2 = new int[r1]
            int[] r3 = new int[r1]
            r4 = 519(0x207, float:7.27E-43)
            r5 = 33
            int[] r6 = new int[r5]
            p298qj.C5727r0.m12038b(r0, r6)
        L1e:
            p298qj.C5727r0.m12040d(r6, r2)
            int r4 = r4 + (-1)
            if (r4 <= 0) goto L29
            p298qj.C5727r0.m12038b(r2, r6)
            goto L1e
        L29:
            int[] r4 = new int[r5]
            p298qj.C5727r0.m12038b(r2, r4)
            p298qj.C5727r0.m12040d(r4, r3)
            boolean r0 = p085f1.AbstractC1972m.m5011p(r1, r0, r3)
            if (r0 == 0) goto L3d
            qj.s0 r0 = new qj.s0
            r0.<init>(r2)
            goto L3e
        L3d:
            r0 = 0
        L3e:
            return r0
        L3f:
            return r7
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: o */
    public p240nj.AbstractC4846d mo10907o() {
            r2 = this;
            r0 = 17
            int[] r0 = new int[r0]
            int[] r1 = r2.f22114Y
            p298qj.C5727r0.m12042f(r1, r0)
            qj.s0 r1 = new qj.s0
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: r */
    public p240nj.AbstractC4846d mo10910r(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 17
            int[] r0 = new int[r0]
            int[] r1 = r2.f22114Y
            qj.s0 r3 = (p298qj.C5730s0) r3
            int[] r3 = r3.f22114Y
            p298qj.C5727r0.m12043g(r1, r3, r0)
            qj.s0 r3 = new qj.s0
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: s */
    public boolean mo10911s() {
            r3 = this;
            int[] r0 = r3.f22114Y
            r1 = 0
            int r0 = p085f1.AbstractC1972m.m5018w(r0, r1)
            r2 = 1
            if (r0 != r2) goto Lb
            r1 = 1
        Lb:
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: t */
    public java.math.BigInteger mo10912t() {
            r2 = this;
            int[] r0 = r2.f22114Y
            r1 = 17
            java.math.BigInteger r0 = p085f1.AbstractC1972m.m4991Z(r1, r0)
            return r0
    }
}
