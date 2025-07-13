package p298qj;

/* renamed from: qj.o0 */
/* loaded from: classes.dex */
public class C5715o0 extends p240nj.AbstractC4846d.b {

    /* renamed from: Z */
    public static final java.math.BigInteger f22081Z = null;

    /* renamed from: Y */
    public int[] f22082Y;

    static {
            java.math.BigInteger r0 = p298qj.C5707m0.f22062j
            p298qj.C5715o0.f22081Z = r0
            return
    }

    public C5715o0() {
            r1 = this;
            r1.<init>()
            r0 = 12
            int[] r0 = new int[r0]
            r1.f22082Y = r0
            return
    }

    public C5715o0(java.math.BigInteger r4) {
            r3 = this;
            r3.<init>()
            if (r4 == 0) goto L30
            int r0 = r4.signum()
            if (r0 < 0) goto L30
            java.math.BigInteger r0 = p298qj.C5715o0.f22081Z
            int r0 = r4.compareTo(r0)
            if (r0 >= 0) goto L30
            r0 = 384(0x180, float:5.38E-43)
            int[] r4 = p085f1.AbstractC1972m.m5014s(r0, r4)
            r0 = 11
            r0 = r4[r0]
            r1 = -1
            if (r0 != r1) goto L2d
            int[] r0 = p298qj.C5711n0.f22068a
            r1 = 12
            boolean r2 = p085f1.AbstractC1972m.m5019x(r1, r4, r0)
            if (r2 == 0) goto L2d
            p085f1.AbstractC1972m.m4989X(r1, r0, r4)
        L2d:
            r3.f22082Y = r4
            return
        L30:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "x value invalid for SecP384R1FieldElement"
            r4.<init>(r0)
            throw r4
    }

    public C5715o0(int[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22082Y = r1
            return
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: a */
    public p240nj.AbstractC4846d mo10893a(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 12
            int[] r0 = new int[r0]
            int[] r1 = r2.f22082Y
            qj.o0 r3 = (p298qj.C5715o0) r3
            int[] r3 = r3.f22082Y
            p298qj.C5711n0.m12023a(r1, r3, r0)
            qj.o0 r3 = new qj.o0
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: b */
    public p240nj.AbstractC4846d mo10894b() {
            r4 = this;
            r0 = 12
            int[] r1 = new int[r0]
            int[] r2 = r4.f22082Y
            int r2 = p085f1.AbstractC1972m.m4966A(r0, r2, r1)
            if (r2 != 0) goto L1b
            r2 = 11
            r2 = r1[r2]
            r3 = -1
            if (r2 != r3) goto L1e
            int[] r2 = p298qj.C5711n0.f22068a
            boolean r0 = p085f1.AbstractC1972m.m5019x(r0, r1, r2)
            if (r0 == 0) goto L1e
        L1b:
            p298qj.C5711n0.m12024b(r1)
        L1e:
            qj.o0 r0 = new qj.o0
            r0.<init>(r1)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: d */
    public p240nj.AbstractC4846d mo10896d(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 12
            int[] r0 = new int[r0]
            int[] r1 = p298qj.C5711n0.f22068a
            qj.o0 r3 = (p298qj.C5715o0) r3
            int[] r3 = r3.f22082Y
            p446z3.AbstractC7246d.m14327m(r1, r3, r0)
            int[] r3 = r2.f22082Y
            p298qj.C5711n0.m12025c(r0, r3, r0)
            qj.o0 r3 = new qj.o0
            r3.<init>(r0)
            return r3
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L4
            r3 = 1
            return r3
        L4:
            boolean r0 = r3 instanceof p298qj.C5715o0
            if (r0 != 0) goto La
            r3 = 0
            return r3
        La:
            qj.o0 r3 = (p298qj.C5715o0) r3
            r0 = 12
            int[] r1 = r2.f22082Y
            int[] r3 = r3.f22082Y
            boolean r3 = p085f1.AbstractC1972m.m5011p(r0, r1, r3)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: f */
    public int mo10898f() {
            r1 = this;
            java.math.BigInteger r0 = p298qj.C5715o0.f22081Z
            int r0 = r0.bitLength()
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: g */
    public p240nj.AbstractC4846d mo10899g() {
            r3 = this;
            r0 = 12
            int[] r0 = new int[r0]
            int[] r1 = p298qj.C5711n0.f22068a
            int[] r2 = r3.f22082Y
            p446z3.AbstractC7246d.m14327m(r1, r2, r0)
            qj.o0 r1 = new qj.o0
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: h */
    public boolean mo10900h() {
            r2 = this;
            int[] r0 = r2.f22082Y
            r1 = 12
            boolean r0 = p085f1.AbstractC1972m.m4969D(r1, r0)
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.math.BigInteger r0 = p298qj.C5715o0.f22081Z
            int r0 = r0.hashCode()
            int[] r1 = r4.f22082Y
            r2 = 0
            r3 = 12
            int r1 = p400wj.C6888a.m13954f(r1, r2, r3)
            r0 = r0 ^ r1
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: i */
    public boolean mo10901i() {
            r2 = this;
            int[] r0 = r2.f22082Y
            r1 = 12
            boolean r0 = p085f1.AbstractC1972m.m4972G(r1, r0)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: j */
    public p240nj.AbstractC4846d mo10902j(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 12
            int[] r0 = new int[r0]
            int[] r1 = r2.f22082Y
            qj.o0 r3 = (p298qj.C5715o0) r3
            int[] r3 = r3.f22082Y
            p298qj.C5711n0.m12025c(r1, r3, r0)
            qj.o0 r3 = new qj.o0
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: m */
    public p240nj.AbstractC4846d mo10905m() {
            r4 = this;
            r0 = 12
            int[] r1 = new int[r0]
            int[] r2 = r4.f22082Y
            boolean r3 = p085f1.AbstractC1972m.m4972G(r0, r2)
            if (r3 == 0) goto L10
            p085f1.AbstractC1972m.m4997c0(r0, r1)
            goto L15
        L10:
            int[] r3 = p298qj.C5711n0.f22068a
            p085f1.AbstractC1972m.m4984S(r0, r3, r2, r1)
        L15:
            qj.o0 r0 = new qj.o0
            r0.<init>(r1)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: n */
    public p240nj.AbstractC4846d mo10906n() {
            r10 = this;
            int[] r0 = r10.f22082Y
            r1 = 12
            boolean r2 = p085f1.AbstractC1972m.m4972G(r1, r0)
            if (r2 != 0) goto Lde
            boolean r2 = p085f1.AbstractC1972m.m4969D(r1, r0)
            if (r2 == 0) goto L12
            goto Lde
        L12:
            int[] r2 = new int[r1]
            int[] r3 = new int[r1]
            int[] r4 = new int[r1]
            int[] r5 = new int[r1]
            r6 = 24
            int[] r7 = new int[r6]
            p085f1.AbstractC1972m.m4983R(r0, r7)
            p298qj.C5711n0.m12026d(r7, r2)
            int[] r7 = new int[r6]
            p085f1.AbstractC1972m.m4976K(r2, r0, r7)
            p298qj.C5711n0.m12026d(r7, r2)
            r7 = 2
            p298qj.C5711n0.m12029g(r2, r7, r3)
            int[] r8 = new int[r6]
            p085f1.AbstractC1972m.m4976K(r3, r2, r8)
            p298qj.C5711n0.m12026d(r8, r3)
            int[] r8 = new int[r6]
            p085f1.AbstractC1972m.m4983R(r3, r8)
            p298qj.C5711n0.m12026d(r8, r3)
            int[] r8 = new int[r6]
            p085f1.AbstractC1972m.m4976K(r3, r0, r8)
            p298qj.C5711n0.m12026d(r8, r3)
            r8 = 5
            p298qj.C5711n0.m12029g(r3, r8, r4)
            int[] r9 = new int[r6]
            p085f1.AbstractC1972m.m4976K(r4, r3, r9)
            p298qj.C5711n0.m12026d(r9, r4)
            p298qj.C5711n0.m12029g(r4, r8, r5)
            int[] r8 = new int[r6]
            p085f1.AbstractC1972m.m4976K(r5, r3, r8)
            p298qj.C5711n0.m12026d(r8, r5)
            r8 = 15
            p298qj.C5711n0.m12029g(r5, r8, r3)
            int[] r9 = new int[r6]
            p085f1.AbstractC1972m.m4976K(r3, r5, r9)
            p298qj.C5711n0.m12026d(r9, r3)
            p298qj.C5711n0.m12029g(r3, r7, r4)
            int[] r7 = new int[r6]
            p085f1.AbstractC1972m.m4976K(r2, r4, r7)
            p298qj.C5711n0.m12026d(r7, r2)
            r7 = 28
            p298qj.C5711n0.m12029g(r4, r7, r4)
            int[] r7 = new int[r6]
            p085f1.AbstractC1972m.m4976K(r3, r4, r7)
            p298qj.C5711n0.m12026d(r7, r3)
            r7 = 60
            p298qj.C5711n0.m12029g(r3, r7, r4)
            int[] r7 = new int[r6]
            p085f1.AbstractC1972m.m4976K(r4, r3, r7)
            p298qj.C5711n0.m12026d(r7, r4)
            r7 = 120(0x78, float:1.68E-43)
            p298qj.C5711n0.m12029g(r4, r7, r3)
            int[] r7 = new int[r6]
            p085f1.AbstractC1972m.m4976K(r3, r4, r7)
            p298qj.C5711n0.m12026d(r7, r3)
            p298qj.C5711n0.m12029g(r3, r8, r3)
            int[] r4 = new int[r6]
            p085f1.AbstractC1972m.m4976K(r3, r5, r4)
            p298qj.C5711n0.m12026d(r4, r3)
            r4 = 33
            p298qj.C5711n0.m12029g(r3, r4, r3)
            int[] r4 = new int[r6]
            p085f1.AbstractC1972m.m4976K(r3, r2, r4)
            p298qj.C5711n0.m12026d(r4, r3)
            r4 = 64
            p298qj.C5711n0.m12029g(r3, r4, r3)
            int[] r4 = new int[r6]
            p085f1.AbstractC1972m.m4976K(r3, r0, r4)
            p298qj.C5711n0.m12026d(r4, r3)
            r4 = 30
            p298qj.C5711n0.m12029g(r3, r4, r2)
            int[] r4 = new int[r6]
            p085f1.AbstractC1972m.m4983R(r2, r4)
            p298qj.C5711n0.m12026d(r4, r3)
            boolean r0 = p085f1.AbstractC1972m.m5011p(r1, r0, r3)
            if (r0 == 0) goto Ldc
            qj.o0 r0 = new qj.o0
            r0.<init>(r2)
            goto Ldd
        Ldc:
            r0 = 0
        Ldd:
            return r0
        Lde:
            return r10
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: o */
    public p240nj.AbstractC4846d mo10907o() {
            r2 = this;
            r0 = 12
            int[] r0 = new int[r0]
            int[] r1 = r2.f22082Y
            p298qj.C5711n0.m12028f(r1, r0)
            qj.o0 r1 = new qj.o0
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: r */
    public p240nj.AbstractC4846d mo10910r(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 12
            int[] r0 = new int[r0]
            int[] r1 = r2.f22082Y
            qj.o0 r3 = (p298qj.C5715o0) r3
            int[] r3 = r3.f22082Y
            p298qj.C5711n0.m12030h(r1, r3, r0)
            qj.o0 r3 = new qj.o0
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: s */
    public boolean mo10911s() {
            r3 = this;
            int[] r0 = r3.f22082Y
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
            int[] r0 = r2.f22082Y
            r1 = 12
            java.math.BigInteger r0 = p085f1.AbstractC1972m.m4991Z(r1, r0)
            return r0
    }
}
