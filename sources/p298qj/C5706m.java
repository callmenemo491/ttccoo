package p298qj;

/* renamed from: qj.m */
/* loaded from: classes.dex */
public class C5706m extends p240nj.AbstractC4846d.b {

    /* renamed from: Z */
    public static final java.math.BigInteger f22060Z = null;

    /* renamed from: Y */
    public int[] f22061Y;

    static {
            java.math.BigInteger r0 = p298qj.C5698k.f22045j
            p298qj.C5706m.f22060Z = r0
            return
    }

    public C5706m() {
            r1 = this;
            r1.<init>()
            r0 = 5
            int[] r0 = new int[r0]
            r1.f22061Y = r0
            return
    }

    public C5706m(java.math.BigInteger r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L2b
            int r0 = r3.signum()
            if (r0 < 0) goto L2b
            java.math.BigInteger r0 = p298qj.C5706m.f22060Z
            int r0 = r3.compareTo(r0)
            if (r0 >= 0) goto L2b
            int[] r3 = p139i1.AbstractC3061d.m7477g(r3)
            r0 = 4
            r0 = r3[r0]
            r1 = -1
            if (r0 != r1) goto L28
            int[] r0 = p298qj.C5702l.f22052a
            boolean r1 = p139i1.AbstractC3061d.m7479i(r3, r0)
            if (r1 == 0) goto L28
            p139i1.AbstractC3061d.m7488r(r0, r3)
        L28:
            r2.f22061Y = r3
            return
        L2b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "x value invalid for SecP160R2FieldElement"
            r3.<init>(r0)
            throw r3
    }

    public C5706m(int[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22061Y = r1
            return
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: a */
    public p240nj.AbstractC4846d mo10893a(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 5
            int[] r0 = new int[r0]
            int[] r1 = r2.f22061Y
            qj.m r3 = (p298qj.C5706m) r3
            int[] r3 = r3.f22061Y
            p298qj.C5702l.m11997a(r1, r3, r0)
            qj.m r3 = new qj.m
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: b */
    public p240nj.AbstractC4846d mo10894b() {
            r4 = this;
            r0 = 5
            int[] r1 = new int[r0]
            int[] r2 = r4.f22061Y
            int r2 = p085f1.AbstractC1972m.m4966A(r0, r2, r1)
            if (r2 != 0) goto L19
            r2 = 4
            r2 = r1[r2]
            r3 = -1
            if (r2 != r3) goto L1e
            int[] r2 = p298qj.C5702l.f22052a
            boolean r2 = p139i1.AbstractC3061d.m7479i(r1, r2)
            if (r2 == 0) goto L1e
        L19:
            r2 = 21389(0x538d, float:2.9972E-41)
            p085f1.AbstractC1972m.m4996c(r0, r2, r1)
        L1e:
            qj.m r0 = new qj.m
            r0.<init>(r1)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: d */
    public p240nj.AbstractC4846d mo10896d(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 5
            int[] r0 = new int[r0]
            int[] r1 = p298qj.C5702l.f22052a
            qj.m r3 = (p298qj.C5706m) r3
            int[] r3 = r3.f22061Y
            p446z3.AbstractC7246d.m14327m(r1, r3, r0)
            int[] r3 = r2.f22061Y
            p298qj.C5702l.m11998b(r0, r3, r0)
            qj.m r3 = new qj.m
            r3.<init>(r0)
            return r3
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p298qj.C5706m
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            qj.m r2 = (p298qj.C5706m) r2
            int[] r0 = r1.f22061Y
            int[] r2 = r2.f22061Y
            boolean r2 = p139i1.AbstractC3061d.m7476f(r0, r2)
            return r2
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: f */
    public int mo10898f() {
            r1 = this;
            java.math.BigInteger r0 = p298qj.C5706m.f22060Z
            int r0 = r0.bitLength()
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: g */
    public p240nj.AbstractC4846d mo10899g() {
            r3 = this;
            r0 = 5
            int[] r0 = new int[r0]
            int[] r1 = p298qj.C5702l.f22052a
            int[] r2 = r3.f22061Y
            p446z3.AbstractC7246d.m14327m(r1, r2, r0)
            qj.m r1 = new qj.m
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: h */
    public boolean mo10900h() {
            r1 = this;
            int[] r0 = r1.f22061Y
            boolean r0 = p139i1.AbstractC3061d.m7480j(r0)
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.math.BigInteger r0 = p298qj.C5706m.f22060Z
            int r0 = r0.hashCode()
            int[] r1 = r4.f22061Y
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
            int[] r0 = r1.f22061Y
            boolean r0 = p139i1.AbstractC3061d.m7481k(r0)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: j */
    public p240nj.AbstractC4846d mo10902j(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 5
            int[] r0 = new int[r0]
            int[] r1 = r2.f22061Y
            qj.m r3 = (p298qj.C5706m) r3
            int[] r3 = r3.f22061Y
            p298qj.C5702l.m11998b(r1, r3, r0)
            qj.m r3 = new qj.m
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: m */
    public p240nj.AbstractC4846d mo10905m() {
            r2 = this;
            r0 = 5
            int[] r0 = new int[r0]
            int[] r1 = r2.f22061Y
            p298qj.C5702l.m12000d(r1, r0)
            qj.m r1 = new qj.m
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: n */
    public p240nj.AbstractC4846d mo10906n() {
            r9 = this;
            int[] r0 = r9.f22061Y
            boolean r1 = p139i1.AbstractC3061d.m7481k(r0)
            if (r1 != 0) goto Lf3
            boolean r1 = p139i1.AbstractC3061d.m7480j(r0)
            if (r1 == 0) goto L10
            goto Lf3
        L10:
            r1 = 5
            int[] r2 = new int[r1]
            r3 = 10
            int[] r4 = new int[r3]
            p139i1.AbstractC3061d.m7486p(r0, r4)
            p298qj.C5702l.m12001e(r4, r2)
            int[] r4 = new int[r3]
            p139i1.AbstractC3061d.m7484n(r2, r0, r4)
            p298qj.C5702l.m12001e(r4, r2)
            int[] r4 = new int[r1]
            int[] r5 = new int[r3]
            p139i1.AbstractC3061d.m7486p(r2, r5)
            p298qj.C5702l.m12001e(r5, r4)
            int[] r5 = new int[r3]
            p139i1.AbstractC3061d.m7484n(r4, r0, r5)
            p298qj.C5702l.m12001e(r5, r4)
            int[] r5 = new int[r1]
            int[] r6 = new int[r3]
            p139i1.AbstractC3061d.m7486p(r4, r6)
            p298qj.C5702l.m12001e(r6, r5)
            int[] r6 = new int[r3]
            p139i1.AbstractC3061d.m7484n(r5, r0, r6)
            p298qj.C5702l.m12001e(r6, r5)
            int[] r6 = new int[r1]
            r7 = 3
            p298qj.C5702l.m12004h(r5, r7, r6)
            int[] r8 = new int[r3]
            p139i1.AbstractC3061d.m7484n(r6, r4, r8)
            p298qj.C5702l.m12001e(r8, r6)
            r8 = 7
            p298qj.C5702l.m12004h(r6, r8, r5)
            int[] r8 = new int[r3]
            p139i1.AbstractC3061d.m7484n(r5, r6, r8)
            p298qj.C5702l.m12001e(r8, r5)
            p298qj.C5702l.m12004h(r5, r7, r6)
            int[] r8 = new int[r3]
            p139i1.AbstractC3061d.m7484n(r6, r4, r8)
            p298qj.C5702l.m12001e(r8, r6)
            int[] r1 = new int[r1]
            r8 = 14
            p298qj.C5702l.m12004h(r6, r8, r1)
            int[] r8 = new int[r3]
            p139i1.AbstractC3061d.m7484n(r1, r5, r8)
            p298qj.C5702l.m12001e(r8, r1)
            r8 = 31
            p298qj.C5702l.m12004h(r1, r8, r5)
            int[] r8 = new int[r3]
            p139i1.AbstractC3061d.m7484n(r5, r1, r8)
            p298qj.C5702l.m12001e(r8, r5)
            r8 = 62
            p298qj.C5702l.m12004h(r5, r8, r1)
            int[] r8 = new int[r3]
            p139i1.AbstractC3061d.m7484n(r1, r5, r8)
            p298qj.C5702l.m12001e(r8, r1)
            p298qj.C5702l.m12004h(r1, r7, r5)
            int[] r1 = new int[r3]
            p139i1.AbstractC3061d.m7484n(r5, r4, r1)
            p298qj.C5702l.m12001e(r1, r5)
            r1 = 18
            p298qj.C5702l.m12004h(r5, r1, r5)
            int[] r1 = new int[r3]
            p139i1.AbstractC3061d.m7484n(r5, r6, r1)
            p298qj.C5702l.m12001e(r1, r5)
            r1 = 2
            p298qj.C5702l.m12004h(r5, r1, r5)
            int[] r6 = new int[r3]
            p139i1.AbstractC3061d.m7484n(r5, r0, r6)
            p298qj.C5702l.m12001e(r6, r5)
            p298qj.C5702l.m12004h(r5, r7, r5)
            int[] r6 = new int[r3]
            p139i1.AbstractC3061d.m7484n(r5, r2, r6)
            p298qj.C5702l.m12001e(r6, r5)
            r6 = 6
            p298qj.C5702l.m12004h(r5, r6, r5)
            int[] r6 = new int[r3]
            p139i1.AbstractC3061d.m7484n(r5, r4, r6)
            p298qj.C5702l.m12001e(r6, r5)
            p298qj.C5702l.m12004h(r5, r1, r5)
            int[] r1 = new int[r3]
            p139i1.AbstractC3061d.m7484n(r5, r0, r1)
            p298qj.C5702l.m12001e(r1, r5)
            int[] r1 = new int[r3]
            p139i1.AbstractC3061d.m7486p(r5, r1)
            p298qj.C5702l.m12001e(r1, r2)
            boolean r0 = p139i1.AbstractC3061d.m7476f(r0, r2)
            if (r0 == 0) goto Lf1
            qj.m r0 = new qj.m
            r0.<init>(r5)
            goto Lf2
        Lf1:
            r0 = 0
        Lf2:
            return r0
        Lf3:
            return r9
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: o */
    public p240nj.AbstractC4846d mo10907o() {
            r2 = this;
            r0 = 5
            int[] r0 = new int[r0]
            int[] r1 = r2.f22061Y
            p298qj.C5702l.m12003g(r1, r0)
            qj.m r1 = new qj.m
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: r */
    public p240nj.AbstractC4846d mo10910r(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 5
            int[] r0 = new int[r0]
            int[] r1 = r2.f22061Y
            qj.m r3 = (p298qj.C5706m) r3
            int[] r3 = r3.f22061Y
            p298qj.C5702l.m12005i(r1, r3, r0)
            qj.m r3 = new qj.m
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: s */
    public boolean mo10911s() {
            r3 = this;
            int[] r0 = r3.f22061Y
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
            int[] r0 = r1.f22061Y
            java.math.BigInteger r0 = p139i1.AbstractC3061d.m7489s(r0)
            return r0
    }
}
