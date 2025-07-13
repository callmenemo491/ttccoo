package p298qj;

/* renamed from: qj.q */
/* loaded from: classes.dex */
public class C5722q extends p240nj.AbstractC4846d.b {

    /* renamed from: Z */
    public static final java.math.BigInteger f22096Z = null;

    /* renamed from: Y */
    public int[] f22097Y;

    static {
            java.math.BigInteger r0 = p298qj.C5714o.f22076j
            p298qj.C5722q.f22096Z = r0
            return
    }

    public C5722q() {
            r1 = this;
            r1.<init>()
            r0 = 6
            int[] r0 = new int[r0]
            r1.f22097Y = r0
            return
    }

    public C5722q(java.math.BigInteger r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L2b
            int r0 = r3.signum()
            if (r0 < 0) goto L2b
            java.math.BigInteger r0 = p298qj.C5722q.f22096Z
            int r0 = r3.compareTo(r0)
            if (r0 >= 0) goto L2b
            int[] r3 = p085f1.AbstractC1972m.m5015t(r3)
            r0 = 5
            r0 = r3[r0]
            r1 = -1
            if (r0 != r1) goto L28
            int[] r0 = p298qj.C5718p.f22087a
            boolean r1 = p085f1.AbstractC1972m.m5020y(r3, r0)
            if (r1 == 0) goto L28
            p085f1.AbstractC1972m.m4990Y(r0, r3)
        L28:
            r2.f22097Y = r3
            return
        L2b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "x value invalid for SecP192K1FieldElement"
            r3.<init>(r0)
            throw r3
    }

    public C5722q(int[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22097Y = r1
            return
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: a */
    public p240nj.AbstractC4846d mo10893a(p240nj.AbstractC4846d r4) {
            r3 = this;
            r0 = 6
            int[] r1 = new int[r0]
            int[] r2 = r3.f22097Y
            qj.q r4 = (p298qj.C5722q) r4
            int[] r4 = r4.f22097Y
            int r4 = p085f1.AbstractC1972m.m4994b(r2, r4, r1)
            if (r4 != 0) goto L1d
            r4 = 5
            r4 = r1[r4]
            r2 = -1
            if (r4 != r2) goto L22
            int[] r4 = p298qj.C5718p.f22087a
            boolean r4 = p085f1.AbstractC1972m.m5020y(r1, r4)
            if (r4 == 0) goto L22
        L1d:
            r4 = 4553(0x11c9, float:6.38E-42)
            p085f1.AbstractC1972m.m4996c(r0, r4, r1)
        L22:
            qj.q r4 = new qj.q
            r4.<init>(r1)
            return r4
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: b */
    public p240nj.AbstractC4846d mo10894b() {
            r4 = this;
            r0 = 6
            int[] r1 = new int[r0]
            int[] r2 = r4.f22097Y
            int r2 = p085f1.AbstractC1972m.m4966A(r0, r2, r1)
            if (r2 != 0) goto L19
            r2 = 5
            r2 = r1[r2]
            r3 = -1
            if (r2 != r3) goto L1e
            int[] r2 = p298qj.C5718p.f22087a
            boolean r2 = p085f1.AbstractC1972m.m5020y(r1, r2)
            if (r2 == 0) goto L1e
        L19:
            r2 = 4553(0x11c9, float:6.38E-42)
            p085f1.AbstractC1972m.m4996c(r0, r2, r1)
        L1e:
            qj.q r0 = new qj.q
            r0.<init>(r1)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: d */
    public p240nj.AbstractC4846d mo10896d(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 6
            int[] r0 = new int[r0]
            int[] r1 = p298qj.C5718p.f22087a
            qj.q r3 = (p298qj.C5722q) r3
            int[] r3 = r3.f22097Y
            p446z3.AbstractC7246d.m14327m(r1, r3, r0)
            int[] r3 = r2.f22097Y
            p298qj.C5718p.m12031a(r0, r3, r0)
            qj.q r3 = new qj.q
            r3.<init>(r0)
            return r3
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p298qj.C5722q
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            qj.q r2 = (p298qj.C5722q) r2
            int[] r0 = r1.f22097Y
            int[] r2 = r2.f22097Y
            boolean r2 = p085f1.AbstractC1972m.m5012q(r0, r2)
            return r2
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: f */
    public int mo10898f() {
            r1 = this;
            java.math.BigInteger r0 = p298qj.C5722q.f22096Z
            int r0 = r0.bitLength()
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: g */
    public p240nj.AbstractC4846d mo10899g() {
            r3 = this;
            r0 = 6
            int[] r0 = new int[r0]
            int[] r1 = p298qj.C5718p.f22087a
            int[] r2 = r3.f22097Y
            p446z3.AbstractC7246d.m14327m(r1, r2, r0)
            qj.q r1 = new qj.q
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: h */
    public boolean mo10900h() {
            r1 = this;
            int[] r0 = r1.f22097Y
            boolean r0 = p085f1.AbstractC1972m.m4970E(r0)
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.math.BigInteger r0 = p298qj.C5722q.f22096Z
            int r0 = r0.hashCode()
            int[] r1 = r4.f22097Y
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
            int[] r0 = r1.f22097Y
            boolean r0 = p085f1.AbstractC1972m.m4973H(r0)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: j */
    public p240nj.AbstractC4846d mo10902j(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 6
            int[] r0 = new int[r0]
            int[] r1 = r2.f22097Y
            qj.q r3 = (p298qj.C5722q) r3
            int[] r3 = r3.f22097Y
            p298qj.C5718p.m12031a(r1, r3, r0)
            qj.q r3 = new qj.q
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: m */
    public p240nj.AbstractC4846d mo10905m() {
            r3 = this;
            r0 = 6
            int[] r0 = new int[r0]
            int[] r1 = r3.f22097Y
            boolean r2 = p085f1.AbstractC1972m.m4973H(r1)
            if (r2 == 0) goto Lf
            p085f1.AbstractC1972m.m4999d0(r0)
            goto L14
        Lf:
            int[] r2 = p298qj.C5718p.f22087a
            p085f1.AbstractC1972m.m4986U(r2, r1, r0)
        L14:
            qj.q r1 = new qj.q
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: n */
    public p240nj.AbstractC4846d mo10906n() {
            r8 = this;
            int[] r0 = r8.f22097Y
            boolean r1 = p085f1.AbstractC1972m.m4973H(r0)
            if (r1 != 0) goto Le1
            boolean r1 = p085f1.AbstractC1972m.m4970E(r0)
            if (r1 == 0) goto L10
            goto Le1
        L10:
            r1 = 6
            int[] r2 = new int[r1]
            r3 = 12
            int[] r4 = new int[r3]
            p085f1.AbstractC1972m.m4982Q(r0, r4)
            p298qj.C5718p.m12032b(r4, r2)
            int[] r4 = new int[r3]
            p085f1.AbstractC1972m.m4975J(r2, r0, r4)
            p298qj.C5718p.m12032b(r4, r2)
            int[] r4 = new int[r1]
            int[] r5 = new int[r3]
            p085f1.AbstractC1972m.m4982Q(r2, r5)
            p298qj.C5718p.m12032b(r5, r4)
            int[] r5 = new int[r3]
            p085f1.AbstractC1972m.m4975J(r4, r0, r5)
            p298qj.C5718p.m12032b(r5, r4)
            int[] r5 = new int[r1]
            r6 = 3
            p298qj.C5718p.m12035e(r4, r6, r5)
            int[] r7 = new int[r3]
            p085f1.AbstractC1972m.m4975J(r5, r4, r7)
            p298qj.C5718p.m12032b(r7, r5)
            r7 = 2
            p298qj.C5718p.m12035e(r5, r7, r5)
            int[] r7 = new int[r3]
            p085f1.AbstractC1972m.m4975J(r5, r2, r7)
            p298qj.C5718p.m12032b(r7, r5)
            r7 = 8
            p298qj.C5718p.m12035e(r5, r7, r2)
            int[] r7 = new int[r3]
            p085f1.AbstractC1972m.m4975J(r2, r5, r7)
            p298qj.C5718p.m12032b(r7, r2)
            p298qj.C5718p.m12035e(r2, r6, r5)
            int[] r6 = new int[r3]
            p085f1.AbstractC1972m.m4975J(r5, r4, r6)
            p298qj.C5718p.m12032b(r6, r5)
            int[] r6 = new int[r1]
            r7 = 16
            p298qj.C5718p.m12035e(r5, r7, r6)
            int[] r7 = new int[r3]
            p085f1.AbstractC1972m.m4975J(r6, r2, r7)
            p298qj.C5718p.m12032b(r7, r6)
            r7 = 35
            p298qj.C5718p.m12035e(r6, r7, r2)
            int[] r7 = new int[r3]
            p085f1.AbstractC1972m.m4975J(r2, r6, r7)
            p298qj.C5718p.m12032b(r7, r2)
            r7 = 70
            p298qj.C5718p.m12035e(r2, r7, r6)
            int[] r7 = new int[r3]
            p085f1.AbstractC1972m.m4975J(r6, r2, r7)
            p298qj.C5718p.m12032b(r7, r6)
            r7 = 19
            p298qj.C5718p.m12035e(r6, r7, r2)
            int[] r6 = new int[r3]
            p085f1.AbstractC1972m.m4975J(r2, r5, r6)
            p298qj.C5718p.m12032b(r6, r2)
            r6 = 20
            p298qj.C5718p.m12035e(r2, r6, r2)
            int[] r6 = new int[r3]
            p085f1.AbstractC1972m.m4975J(r2, r5, r6)
            p298qj.C5718p.m12032b(r6, r2)
            r5 = 4
            p298qj.C5718p.m12035e(r2, r5, r2)
            int[] r5 = new int[r3]
            p085f1.AbstractC1972m.m4975J(r2, r4, r5)
            p298qj.C5718p.m12032b(r5, r2)
            p298qj.C5718p.m12035e(r2, r1, r2)
            int[] r1 = new int[r3]
            p085f1.AbstractC1972m.m4975J(r2, r4, r1)
            p298qj.C5718p.m12032b(r1, r2)
            int[] r1 = new int[r3]
            p085f1.AbstractC1972m.m4982Q(r2, r1)
            p298qj.C5718p.m12032b(r1, r2)
            int[] r1 = new int[r3]
            p085f1.AbstractC1972m.m4982Q(r2, r1)
            p298qj.C5718p.m12032b(r1, r4)
            boolean r0 = p085f1.AbstractC1972m.m5012q(r0, r4)
            if (r0 == 0) goto Ldf
            qj.q r0 = new qj.q
            r0.<init>(r2)
            goto Le0
        Ldf:
            r0 = 0
        Le0:
            return r0
        Le1:
            return r8
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: o */
    public p240nj.AbstractC4846d mo10907o() {
            r2 = this;
            r0 = 6
            int[] r0 = new int[r0]
            int[] r1 = r2.f22097Y
            p298qj.C5718p.m12034d(r1, r0)
            qj.q r1 = new qj.q
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: r */
    public p240nj.AbstractC4846d mo10910r(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 6
            int[] r0 = new int[r0]
            int[] r1 = r2.f22097Y
            qj.q r3 = (p298qj.C5722q) r3
            int[] r3 = r3.f22097Y
            p298qj.C5718p.m12036f(r1, r3, r0)
            qj.q r3 = new qj.q
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: s */
    public boolean mo10911s() {
            r3 = this;
            int[] r0 = r3.f22097Y
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
            int[] r0 = r1.f22097Y
            java.math.BigInteger r0 = p085f1.AbstractC1972m.m4993a0(r0)
            return r0
    }
}
