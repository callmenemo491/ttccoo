package p298qj;

/* renamed from: qj.m0 */
/* loaded from: classes.dex */
public class C5707m0 extends p240nj.AbstractC4845c.c {

    /* renamed from: j */
    public static final java.math.BigInteger f22062j = null;

    /* renamed from: i */
    public p298qj.C5719p0 f22063i;

    /* renamed from: qj.m0$a */
    public class a implements p240nj.InterfaceC4847e {

        /* renamed from: a */
        public final /* synthetic */ int f22064a;

        /* renamed from: b */
        public final /* synthetic */ int[] f22065b;

        /* renamed from: c */
        public final /* synthetic */ p298qj.C5707m0 f22066c;

        public a(p298qj.C5707m0 r1, int r2, int[] r3) {
                r0 = this;
                r0.f22066c = r1
                r0.f22064a = r2
                r0.f22065b = r3
                r0.<init>()
                return
        }

        @Override // p240nj.InterfaceC4847e
        /* renamed from: a */
        public int mo10888a() {
                r1 = this;
                int r0 = r1.f22064a
                return r0
        }

        @Override // p240nj.InterfaceC4847e
        /* renamed from: b */
        public p240nj.AbstractC4848f mo10889b(int r12) {
                r11 = this;
                r0 = 12
                int[] r1 = new int[r0]
                int[] r2 = new int[r0]
                r3 = 0
                r4 = 0
                r5 = 0
            L9:
                int r6 = r11.f22064a
                if (r4 >= r6) goto L35
                r6 = r4 ^ r12
                int r6 = r6 + (-1)
                int r6 = r6 >> 31
                r7 = 0
            L14:
                if (r7 >= r0) goto L30
                r8 = r1[r7]
                int[] r9 = r11.f22065b
                int r10 = r5 + r7
                r10 = r9[r10]
                r10 = r10 & r6
                r8 = r8 ^ r10
                r1[r7] = r8
                r8 = r2[r7]
                int r10 = r5 + 12
                int r10 = r10 + r7
                r9 = r9[r10]
                r9 = r9 & r6
                r8 = r8 ^ r9
                r2[r7] = r8
                int r7 = r7 + 1
                goto L14
            L30:
                int r5 = r5 + 24
                int r4 = r4 + 1
                goto L9
            L35:
                qj.m0 r12 = r11.f22066c
                qj.o0 r0 = new qj.o0
                r0.<init>(r1)
                qj.o0 r1 = new qj.o0
                r1.<init>(r2)
                java.util.Objects.requireNonNull(r12)
                qj.p0 r2 = new qj.p0
                r2.<init>(r12, r0, r1, r3)
                return r2
        }
    }

    static {
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF"
            byte[] r1 = p421xj.C7089e.m14194a(r1)
            r2 = 1
            r0.<init>(r2, r1)
            p298qj.C5707m0.f22062j = r0
            return
    }

    public C5707m0() {
            r3 = this;
            java.math.BigInteger r0 = p298qj.C5707m0.f22062j
            r3.<init>(r0)
            qj.p0 r0 = new qj.p0
            r1 = 0
            r2 = 0
            r0.<init>(r3, r2, r2, r1)
            r3.f22063i = r0
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC"
            byte[] r1 = p421xj.C7089e.m14194a(r1)
            r2 = 1
            r0.<init>(r2, r1)
            qj.o0 r1 = new qj.o0
            r1.<init>(r0)
            r3.f19249b = r1
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF"
            byte[] r1 = p421xj.C7089e.m14194a(r1)
            r0.<init>(r2, r1)
            qj.o0 r1 = new qj.o0
            r1.<init>(r0)
            r3.f19250c = r1
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973"
            byte[] r1 = p421xj.C7089e.m14194a(r1)
            r0.<init>(r2, r1)
            r3.f19251d = r0
            r0 = 1
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            r3.f19252e = r0
            r0 = 2
            r3.f19253f = r0
            return
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: a */
    public p240nj.AbstractC4845c mo10868a() {
            r1 = this;
            qj.m0 r0 = new qj.m0
            r0.<init>()
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: c */
    public p240nj.InterfaceC4847e mo10870c(p240nj.AbstractC4848f[] r8, int r9, int r10) {
            r7 = this;
            int r0 = r10 * 12
            int r0 = r0 * 2
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 0
            r3 = 0
        L9:
            if (r2 >= r10) goto L2a
            int r4 = r9 + r2
            r4 = r8[r4]
            nj.d r5 = r4.f19287b
            qj.o0 r5 = (p298qj.C5715o0) r5
            int[] r5 = r5.f22082Y
            r6 = 12
            java.lang.System.arraycopy(r5, r1, r0, r3, r6)
            int r3 = r3 + 12
            nj.d r4 = r4.f19288c
            qj.o0 r4 = (p298qj.C5715o0) r4
            int[] r4 = r4.f22082Y
            java.lang.System.arraycopy(r4, r1, r0, r3, r6)
            int r3 = r3 + 12
            int r2 = r2 + 1
            goto L9
        L2a:
            qj.m0$a r8 = new qj.m0$a
            r8.<init>(r7, r10, r0)
            return r8
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: g */
    public p240nj.AbstractC4848f mo10874g(p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3, boolean r4) {
            r1 = this;
            qj.p0 r0 = new qj.p0
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: h */
    public p240nj.AbstractC4848f mo10875h(p240nj.AbstractC4846d r8, p240nj.AbstractC4846d r9, p240nj.AbstractC4846d[] r10, boolean r11) {
            r7 = this;
            qj.p0 r6 = new qj.p0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: l */
    public p240nj.AbstractC4846d mo10879l(java.math.BigInteger r2) {
            r1 = this;
            qj.o0 r0 = new qj.o0
            r0.<init>(r2)
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: m */
    public int mo10880m() {
            r1 = this;
            java.math.BigInteger r0 = p298qj.C5707m0.f22062j
            int r0 = r0.bitLength()
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: n */
    public p240nj.AbstractC4848f mo10881n() {
            r1 = this;
            qj.p0 r0 = r1.f22063i
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: s */
    public boolean mo10886s(int r2) {
            r1 = this;
            r0 = 2
            if (r2 == r0) goto L5
            r2 = 0
            return r2
        L5:
            r2 = 1
            return r2
    }
}
