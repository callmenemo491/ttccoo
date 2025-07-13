package p298qj;

/* renamed from: qj.c */
/* loaded from: classes.dex */
public class C5666c extends p240nj.AbstractC4846d.b {

    /* renamed from: Z */
    public static final java.math.BigInteger f21978Z = null;

    /* renamed from: Y */
    public int[] f21979Y;

    static {
            java.math.BigInteger r0 = p298qj.C5658a.f21955j
            p298qj.C5666c.f21978Z = r0
            return
    }

    public C5666c() {
            r1 = this;
            r1.<init>()
            r0 = 4
            int[] r0 = new int[r0]
            r1.f21979Y = r0
            return
    }

    public C5666c(java.math.BigInteger r14) {
            r13 = this;
            r13.<init>()
            if (r14 == 0) goto L98
            int r0 = r14.signum()
            if (r0 < 0) goto L98
            java.math.BigInteger r0 = p298qj.C5666c.f21978Z
            int r0 = r14.compareTo(r0)
            if (r0 >= 0) goto L98
            int r0 = r14.signum()
            if (r0 < 0) goto L92
            int r0 = r14.bitLength()
            r1 = 128(0x80, float:1.8E-43)
            if (r0 > r1) goto L92
            r0 = 4
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 0
        L26:
            int r3 = r14.signum()
            r4 = 32
            if (r3 == 0) goto L3c
            int r3 = r2 + 1
            int r5 = r14.intValue()
            r0[r2] = r5
            java.math.BigInteger r14 = r14.shiftRight(r4)
            r2 = r3
            goto L26
        L3c:
            r14 = 3
            r2 = r0[r14]
            r3 = 1
            int r2 = r2 >>> r3
            r5 = 2147483646(0x7ffffffe, float:NaN)
            if (r2 < r5) goto L8f
            int[] r2 = p298qj.C5662b.f21967a
            boolean r5 = tj.AbstractC6255a.m12860q(r0, r2)
            if (r5 == 0) goto L8f
            r5 = r0[r1]
            long r5 = (long) r5
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            r9 = r2[r1]
            long r9 = (long) r9
            long r9 = r9 & r7
            long r5 = r5 - r9
            r9 = 0
            long r5 = r5 + r9
            int r9 = (int) r5
            r0[r1] = r9
            long r5 = r5 >> r4
            r1 = r0[r3]
            long r9 = (long) r1
            long r9 = r9 & r7
            r1 = r2[r3]
            long r11 = (long) r1
            long r11 = r11 & r7
            long r9 = r9 - r11
            long r9 = r9 + r5
            int r1 = (int) r9
            r0[r3] = r1
            long r5 = r9 >> r4
            r1 = 2
            r3 = r0[r1]
            long r9 = (long) r3
            long r9 = r9 & r7
            r3 = r2[r1]
            long r11 = (long) r3
            long r11 = r11 & r7
            long r9 = r9 - r11
            long r9 = r9 + r5
            int r3 = (int) r9
            r0[r1] = r3
            long r3 = r9 >> r4
            r1 = r0[r14]
            long r5 = (long) r1
            long r5 = r5 & r7
            r1 = r2[r14]
            long r1 = (long) r1
            long r1 = r1 & r7
            long r5 = r5 - r1
            long r5 = r5 + r3
            int r1 = (int) r5
            r0[r14] = r1
        L8f:
            r13.f21979Y = r0
            return
        L92:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>()
            throw r14
        L98:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "x value invalid for SecP128R1FieldElement"
            r14.<init>(r0)
            throw r14
    }

    public C5666c(int[] r1) {
            r0 = this;
            r0.<init>()
            r0.f21979Y = r1
            return
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: a */
    public p240nj.AbstractC4846d mo10893a(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 4
            int[] r0 = new int[r0]
            int[] r1 = r2.f21979Y
            qj.c r3 = (p298qj.C5666c) r3
            int[] r3 = r3.f21979Y
            p298qj.C5662b.m11948a(r1, r3, r0)
            qj.c r3 = new qj.c
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: b */
    public p240nj.AbstractC4846d mo10894b() {
            r3 = this;
            r0 = 4
            int[] r1 = new int[r0]
            int[] r2 = r3.f21979Y
            int r0 = p085f1.AbstractC1972m.m4966A(r0, r2, r1)
            if (r0 != 0) goto L1d
            r0 = 3
            r0 = r1[r0]
            int r0 = r0 >>> 1
            r2 = 2147483646(0x7ffffffe, float:NaN)
            if (r0 < r2) goto L20
            int[] r0 = p298qj.C5662b.f21967a
            boolean r0 = tj.AbstractC6255a.m12860q(r1, r0)
            if (r0 == 0) goto L20
        L1d:
            p298qj.C5662b.m11949b(r1)
        L20:
            qj.c r0 = new qj.c
            r0.<init>(r1)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: d */
    public p240nj.AbstractC4846d mo10896d(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 4
            int[] r0 = new int[r0]
            int[] r1 = p298qj.C5662b.f21967a
            qj.c r3 = (p298qj.C5666c) r3
            int[] r3 = r3.f21979Y
            p446z3.AbstractC7246d.m14327m(r1, r3, r0)
            int[] r3 = r2.f21979Y
            p298qj.C5662b.m11950c(r0, r3, r0)
            qj.c r3 = new qj.c
            r3.<init>(r0)
            return r3
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p298qj.C5666c
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            qj.c r2 = (p298qj.C5666c) r2
            int[] r0 = r1.f21979Y
            int[] r2 = r2.f21979Y
            boolean r2 = tj.AbstractC6255a.m12854k(r0, r2)
            return r2
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: f */
    public int mo10898f() {
            r1 = this;
            java.math.BigInteger r0 = p298qj.C5666c.f21978Z
            int r0 = r0.bitLength()
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: g */
    public p240nj.AbstractC4846d mo10899g() {
            r3 = this;
            r0 = 4
            int[] r0 = new int[r0]
            int[] r1 = p298qj.C5662b.f21967a
            int[] r2 = r3.f21979Y
            p446z3.AbstractC7246d.m14327m(r1, r2, r0)
            qj.c r1 = new qj.c
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: h */
    public boolean mo10900h() {
            r1 = this;
            int[] r0 = r1.f21979Y
            boolean r0 = tj.AbstractC6255a.m12862s(r0)
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.math.BigInteger r0 = p298qj.C5666c.f21978Z
            int r0 = r0.hashCode()
            int[] r1 = r4.f21979Y
            r2 = 0
            r3 = 4
            int r1 = p400wj.C6888a.m13954f(r1, r2, r3)
            r0 = r0 ^ r1
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: i */
    public boolean mo10901i() {
            r1 = this;
            int[] r0 = r1.f21979Y
            boolean r0 = tj.AbstractC6255a.m12865v(r0)
            return r0
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: j */
    public p240nj.AbstractC4846d mo10902j(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 4
            int[] r0 = new int[r0]
            int[] r1 = r2.f21979Y
            qj.c r3 = (p298qj.C5666c) r3
            int[] r3 = r3.f21979Y
            p298qj.C5662b.m11950c(r1, r3, r0)
            qj.c r3 = new qj.c
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: m */
    public p240nj.AbstractC4846d mo10905m() {
            r2 = this;
            r0 = 4
            int[] r0 = new int[r0]
            int[] r1 = r2.f21979Y
            p298qj.C5662b.m11951d(r1, r0)
            qj.c r1 = new qj.c
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: n */
    public p240nj.AbstractC4846d mo10906n() {
            r7 = this;
            int[] r0 = r7.f21979Y
            boolean r1 = tj.AbstractC6255a.m12865v(r0)
            if (r1 != 0) goto L8e
            boolean r1 = tj.AbstractC6255a.m12862s(r0)
            if (r1 == 0) goto L10
            goto L8e
        L10:
            r1 = 4
            int[] r2 = new int[r1]
            r3 = 8
            int[] r4 = new int[r3]
            tj.AbstractC6255a.m12835C(r0, r4)
            p298qj.C5662b.m11952e(r4, r2)
            int[] r4 = new int[r3]
            tj.AbstractC6255a.m12869z(r2, r0, r4)
            p298qj.C5662b.m11952e(r4, r2)
            int[] r4 = new int[r1]
            r5 = 2
            p298qj.C5662b.m11955h(r2, r5, r4)
            int[] r6 = new int[r3]
            tj.AbstractC6255a.m12869z(r4, r2, r6)
            p298qj.C5662b.m11952e(r6, r4)
            int[] r6 = new int[r1]
            p298qj.C5662b.m11955h(r4, r1, r6)
            int[] r1 = new int[r3]
            tj.AbstractC6255a.m12869z(r6, r4, r1)
            p298qj.C5662b.m11952e(r1, r6)
            p298qj.C5662b.m11955h(r6, r5, r4)
            int[] r1 = new int[r3]
            tj.AbstractC6255a.m12869z(r4, r2, r1)
            p298qj.C5662b.m11952e(r1, r4)
            r1 = 10
            p298qj.C5662b.m11955h(r4, r1, r2)
            int[] r5 = new int[r3]
            tj.AbstractC6255a.m12869z(r2, r4, r5)
            p298qj.C5662b.m11952e(r5, r2)
            p298qj.C5662b.m11955h(r2, r1, r6)
            int[] r1 = new int[r3]
            tj.AbstractC6255a.m12869z(r6, r4, r1)
            p298qj.C5662b.m11952e(r1, r6)
            int[] r1 = new int[r3]
            tj.AbstractC6255a.m12835C(r6, r1)
            p298qj.C5662b.m11952e(r1, r4)
            int[] r1 = new int[r3]
            tj.AbstractC6255a.m12869z(r4, r0, r1)
            p298qj.C5662b.m11952e(r1, r4)
            r1 = 95
            p298qj.C5662b.m11955h(r4, r1, r4)
            int[] r1 = new int[r3]
            tj.AbstractC6255a.m12835C(r4, r1)
            p298qj.C5662b.m11952e(r1, r6)
            boolean r0 = tj.AbstractC6255a.m12854k(r0, r6)
            if (r0 == 0) goto L8c
            qj.c r0 = new qj.c
            r0.<init>(r4)
            goto L8d
        L8c:
            r0 = 0
        L8d:
            return r0
        L8e:
            return r7
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: o */
    public p240nj.AbstractC4846d mo10907o() {
            r2 = this;
            r0 = 4
            int[] r0 = new int[r0]
            int[] r1 = r2.f21979Y
            p298qj.C5662b.m11954g(r1, r0)
            qj.c r1 = new qj.c
            r1.<init>(r0)
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: r */
    public p240nj.AbstractC4846d mo10910r(p240nj.AbstractC4846d r3) {
            r2 = this;
            r0 = 4
            int[] r0 = new int[r0]
            int[] r1 = r2.f21979Y
            qj.c r3 = (p298qj.C5666c) r3
            int[] r3 = r3.f21979Y
            p298qj.C5662b.m11956i(r1, r3, r0)
            qj.c r3 = new qj.c
            r3.<init>(r0)
            return r3
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: s */
    public boolean mo10911s() {
            r3 = this;
            int[] r0 = r3.f21979Y
            r1 = 0
            r0 = r0[r1]
            r2 = 1
            r0 = r0 & r2
            if (r0 != r2) goto La
            r1 = 1
        La:
            return r1
    }

    @Override // p240nj.AbstractC4846d
    /* renamed from: t */
    public java.math.BigInteger mo10912t() {
            r5 = this;
            int[] r0 = r5.f21979Y
            r1 = 16
            byte[] r1 = new byte[r1]
            r2 = 0
        L7:
            r3 = 4
            if (r2 >= r3) goto L18
            r3 = r0[r2]
            if (r3 == 0) goto L15
            int r4 = 3 - r2
            int r4 = r4 << 2
            p446z3.AbstractC7246d.m14324j(r3, r1, r4)
        L15:
            int r2 = r2 + 1
            goto L7
        L18:
            java.math.BigInteger r0 = new java.math.BigInteger
            r2 = 1
            r0.<init>(r2, r1)
            return r0
    }
}
