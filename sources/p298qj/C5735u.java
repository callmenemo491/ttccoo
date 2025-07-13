package p298qj;

/* renamed from: qj.u */
/* loaded from: classes.dex */
public class C5735u extends p240nj.AbstractC4846d.b {

    /* renamed from: Z */
    public static final java.math.BigInteger f22123Z = null;

    /* renamed from: Y */
    public int[] f22124Y;

    static {
            java.math.BigInteger r0 = p298qj.C5729s.f22108j
            p298qj.C5735u.f22123Z = r0
            return
    }

    public C5735u() {
            r1 = this;
            r1.<init>()
            r0 = 6
            int[] r0 = new int[r0]
            r1.f22124Y = r0
            return
    }

    public C5735u(java.math.BigInteger r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L2b
            int r0 = r3.signum()
            if (r0 < 0) goto L2b
            java.math.BigInteger r0 = p298qj.C5735u.f22123Z
            int r0 = r3.compareTo(r0)
            if (r0 >= 0) goto L2b
            int[] r3 = p085f1.AbstractC1972m.m5015t(r3)
            r0 = 5
            r0 = r3[r0]
            r1 = -1
            if (r0 != r1) goto L28
            int[] r0 = p298qj.C5732t.f22116a
            boolean r1 = p085f1.AbstractC1972m.m5020y(r3, r0)
            if (r1 == 0) goto L28
            p085f1.AbstractC1972m.m4990Y(r0, r3)
        L28:
            r2.f22124Y = r3
            return
        L2b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "x value invalid for SecP192R1FieldElement"
            r3.<init>(r0)
            throw r3
    }

    public C5735u(int[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22124Y = r1
            return
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: a */
    public p240nj.AbstractC4846d mo10893a(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 6
            int[] r0 = new int[r0]
            int[] r1 = r2.f22124Y
            qj.u r3 = (p298qj.C5735u) r3
            int[] r3 = r3.f22124Y
            p298qj.C5732t.m12044a(r1, r3, r0)
            qj.u r3 = new qj.u
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: b */
    public p240nj.AbstractC4846d mo10894b() {
            r3 = this;
            r0 = 6
            int[] r1 = new int[r0]
            int[] r2 = r3.f22124Y
            int r0 = p085f1.AbstractC1972m.m4966A(r0, r2, r1)
            if (r0 != 0) goto L19
            r0 = 5
            r0 = r1[r0]
            r2 = -1
            if (r0 != r2) goto L1c
            int[] r0 = p298qj.C5732t.f22116a
            boolean r0 = p085f1.AbstractC1972m.m5020y(r1, r0)
            if (r0 == 0) goto L1c
        L19:
            p298qj.C5732t.m12045b(r1)
        L1c:
            qj.u r0 = new qj.u
            r0.<init>(r1)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: d */
    public p240nj.AbstractC4846d mo10896d(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 6
            int[] r0 = new int[r0]
            int[] r1 = p298qj.C5732t.f22116a
            qj.u r3 = (p298qj.C5735u) r3
            int[] r3 = r3.f22124Y
            p446z3.AbstractC7246d.m14327m(r1, r3, r0)
            int[] r3 = r2.f22124Y
            p298qj.C5732t.m12046c(r0, r3, r0)
            qj.u r3 = new qj.u
            r3.<init>(r0)
            return r3
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p298qj.C5735u
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            qj.u r2 = (p298qj.C5735u) r2
            int[] r0 = r1.f22124Y
            int[] r2 = r2.f22124Y
            boolean r2 = p085f1.AbstractC1972m.m5012q(r0, r2)
            return r2
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: f */
    public int mo10898f() {
            r1 = this;
            java.math.BigInteger r0 = p298qj.C5735u.f22123Z
            int r0 = r0.bitLength()
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: g */
    public p240nj.AbstractC4846d mo10899g() {
            r3 = this;
            r0 = 6
            int[] r0 = new int[r0]
            int[] r1 = p298qj.C5732t.f22116a
            int[] r2 = r3.f22124Y
            p446z3.AbstractC7246d.m14327m(r1, r2, r0)
            qj.u r1 = new qj.u
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: h */
    public boolean mo10900h() {
            r1 = this;
            int[] r0 = r1.f22124Y
            boolean r0 = p085f1.AbstractC1972m.m4970E(r0)
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.math.BigInteger r0 = p298qj.C5735u.f22123Z
            int r0 = r0.hashCode()
            int[] r1 = r4.f22124Y
            r2 = 0
            r3 = 6
            int r1 = p400wj.C6888a.m13954f(r1, r2, r3)
            r0 = r0 ^ r1
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: i */
    public boolean mo10901i() {
            r1 = this;
            int[] r0 = r1.f22124Y
            boolean r0 = p085f1.AbstractC1972m.m4973H(r0)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: j */
    public p240nj.AbstractC4846d mo10902j(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 6
            int[] r0 = new int[r0]
            int[] r1 = r2.f22124Y
            qj.u r3 = (p298qj.C5735u) r3
            int[] r3 = r3.f22124Y
            p298qj.C5732t.m12046c(r1, r3, r0)
            qj.u r3 = new qj.u
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: m */
    public p240nj.AbstractC4846d mo10905m() {
            r3 = this;
            r0 = 6
            int[] r0 = new int[r0]
            int[] r1 = r3.f22124Y
            boolean r2 = p085f1.AbstractC1972m.m4973H(r1)
            if (r2 == 0) goto Lf
            p085f1.AbstractC1972m.m4999d0(r0)
            goto L14
        Lf:
            int[] r2 = p298qj.C5732t.f22116a
            p085f1.AbstractC1972m.m4986U(r2, r1, r0)
        L14:
            qj.u r1 = new qj.u
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: n */
    public p240nj.AbstractC4846d mo10906n() {
            r5 = this;
            int[] r0 = r5.f22124Y
            boolean r1 = p085f1.AbstractC1972m.m4973H(r0)
            if (r1 != 0) goto L8e
            boolean r1 = p085f1.AbstractC1972m.m4970E(r0)
            if (r1 == 0) goto L10
            goto L8e
        L10:
            r1 = 6
            int[] r2 = new int[r1]
            int[] r1 = new int[r1]
            r3 = 12
            int[] r4 = new int[r3]
            p085f1.AbstractC1972m.m4982Q(r0, r4)
            p298qj.C5732t.m12047d(r4, r2)
            int[] r4 = new int[r3]
            p085f1.AbstractC1972m.m4975J(r2, r0, r4)
            p298qj.C5732t.m12047d(r4, r2)
            r4 = 2
            p298qj.C5732t.m12050g(r2, r4, r1)
            int[] r4 = new int[r3]
            p085f1.AbstractC1972m.m4975J(r1, r2, r4)
            p298qj.C5732t.m12047d(r4, r1)
            r4 = 4
            p298qj.C5732t.m12050g(r1, r4, r2)
            int[] r4 = new int[r3]
            p085f1.AbstractC1972m.m4975J(r2, r1, r4)
            p298qj.C5732t.m12047d(r4, r2)
            r4 = 8
            p298qj.C5732t.m12050g(r2, r4, r1)
            int[] r4 = new int[r3]
            p085f1.AbstractC1972m.m4975J(r1, r2, r4)
            p298qj.C5732t.m12047d(r4, r1)
            r4 = 16
            p298qj.C5732t.m12050g(r1, r4, r2)
            int[] r4 = new int[r3]
            p085f1.AbstractC1972m.m4975J(r2, r1, r4)
            p298qj.C5732t.m12047d(r4, r2)
            r4 = 32
            p298qj.C5732t.m12050g(r2, r4, r1)
            int[] r4 = new int[r3]
            p085f1.AbstractC1972m.m4975J(r1, r2, r4)
            p298qj.C5732t.m12047d(r4, r1)
            r4 = 64
            p298qj.C5732t.m12050g(r1, r4, r2)
            int[] r4 = new int[r3]
            p085f1.AbstractC1972m.m4975J(r2, r1, r4)
            p298qj.C5732t.m12047d(r4, r2)
            r4 = 62
            p298qj.C5732t.m12050g(r2, r4, r2)
            int[] r3 = new int[r3]
            p085f1.AbstractC1972m.m4982Q(r2, r3)
            p298qj.C5732t.m12047d(r3, r1)
            boolean r0 = p085f1.AbstractC1972m.m5012q(r0, r1)
            if (r0 == 0) goto L8c
            qj.u r0 = new qj.u
            r0.<init>(r2)
            goto L8d
        L8c:
            r0 = 0
        L8d:
            return r0
        L8e:
            return r5
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: o */
    public p240nj.AbstractC4846d mo10907o() {
            r2 = this;
            r0 = 6
            int[] r0 = new int[r0]
            int[] r1 = r2.f22124Y
            p298qj.C5732t.m12049f(r1, r0)
            qj.u r1 = new qj.u
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: r */
    public p240nj.AbstractC4846d mo10910r(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 6
            int[] r0 = new int[r0]
            int[] r1 = r2.f22124Y
            qj.u r3 = (p298qj.C5735u) r3
            int[] r3 = r3.f22124Y
            p298qj.C5732t.m12051h(r1, r3, r0)
            qj.u r3 = new qj.u
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: s */
    public boolean mo10911s() {
            r3 = this;
            int[] r0 = r3.f22124Y
            r1 = 0
            int r0 = p085f1.AbstractC1972m.m5017v(r0, r1)
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
            int[] r0 = r1.f22124Y
            java.math.BigInteger r0 = p085f1.AbstractC1972m.m4993a0(r0)
            return r0
    }
}
