package p278pj;

/* renamed from: pj.a */
/* loaded from: classes.dex */
public class C5529a extends p240nj.AbstractC4845c.c {

    /* renamed from: j */
    public static final java.math.BigInteger f21529j = null;

    /* renamed from: i */
    public p278pj.C5532d f21530i;

    /* renamed from: pj.a$a */
    public class a implements p240nj.InterfaceC4847e {

        /* renamed from: a */
        public final /* synthetic */ int f21531a;

        /* renamed from: b */
        public final /* synthetic */ int[] f21532b;

        /* renamed from: c */
        public final /* synthetic */ p278pj.C5529a f21533c;

        public a(p278pj.C5529a r1, int r2, int[] r3) {
                r0 = this;
                r0.f21533c = r1
                r0.f21531a = r2
                r0.f21532b = r3
                r0.<init>()
                return
        }

        @Override // p240nj.InterfaceC4847e
        /* renamed from: a */
        public int mo10888a() {
                r1 = this;
                int r0 = r1.f21531a
                return r0
        }

        @Override // p240nj.InterfaceC4847e
        /* renamed from: b */
        public p240nj.AbstractC4848f mo10889b(int r12) {
                r11 = this;
                r0 = 8
                int[] r1 = new int[r0]
                int[] r2 = new int[r0]
                r3 = 0
                r4 = 0
                r5 = 0
            L9:
                int r6 = r11.f21531a
                if (r4 >= r6) goto L35
                r6 = r4 ^ r12
                int r6 = r6 + (-1)
                int r6 = r6 >> 31
                r7 = 0
            L14:
                if (r7 >= r0) goto L30
                r8 = r1[r7]
                int[] r9 = r11.f21532b
                int r10 = r5 + r7
                r10 = r9[r10]
                r10 = r10 & r6
                r8 = r8 ^ r10
                r1[r7] = r8
                r8 = r2[r7]
                int r10 = r5 + 8
                int r10 = r10 + r7
                r9 = r9[r10]
                r9 = r9 & r6
                r8 = r8 ^ r9
                r2[r7] = r8
                int r7 = r7 + 1
                goto L14
            L30:
                int r5 = r5 + 16
                int r4 = r4 + 1
                goto L9
            L35:
                pj.a r12 = r11.f21533c
                pj.c r0 = new pj.c
                r0.<init>(r1)
                pj.c r1 = new pj.c
                r1.<init>(r2)
                java.util.Objects.requireNonNull(r12)
                pj.d r2 = new pj.d
                r2.<init>(r12, r0, r1, r3)
                return r2
        }
    }

    static {
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF"
            byte[] r1 = p421xj.C7089e.m14194a(r1)
            r2 = 1
            r0.<init>(r2, r1)
            p278pj.C5529a.f21529j = r0
            return
    }

    public C5529a() {
            r3 = this;
            java.math.BigInteger r0 = p278pj.C5529a.f21529j
            r3.<init>(r0)
            pj.d r0 = new pj.d
            r1 = 0
            r2 = 0
            r0.<init>(r3, r2, r2, r1)
            r3.f21530i = r0
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC"
            byte[] r1 = p421xj.C7089e.m14194a(r1)
            r2 = 1
            r0.<init>(r2, r1)
            pj.c r1 = new pj.c
            r1.<init>(r0)
            r3.f19249b = r1
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93"
            byte[] r1 = p421xj.C7089e.m14194a(r1)
            r0.<init>(r2, r1)
            pj.c r1 = new pj.c
            r1.<init>(r0)
            r3.f19250c = r1
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123"
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
            pj.a r0 = new pj.a
            r0.<init>()
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: c */
    public p240nj.InterfaceC4847e mo10870c(p240nj.AbstractC4848f[] r7, int r8, int r9) {
            r6 = this;
            int r0 = r9 * 8
            int r0 = r0 * 2
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 0
            r3 = 0
        L9:
            if (r2 >= r9) goto L28
            int r4 = r8 + r2
            r4 = r7[r4]
            nj.d r5 = r4.f19287b
            pj.c r5 = (p278pj.C5531c) r5
            int[] r5 = r5.f21537Y
            tj.AbstractC6255a.m12850g(r5, r1, r0, r3)
            int r3 = r3 + 8
            nj.d r4 = r4.f19288c
            pj.c r4 = (p278pj.C5531c) r4
            int[] r4 = r4.f21537Y
            tj.AbstractC6255a.m12850g(r4, r1, r0, r3)
            int r3 = r3 + 8
            int r2 = r2 + 1
            goto L9
        L28:
            pj.a$a r7 = new pj.a$a
            r7.<init>(r6, r9, r0)
            return r7
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: g */
    public p240nj.AbstractC4848f mo10874g(p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3, boolean r4) {
            r1 = this;
            pj.d r0 = new pj.d
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: h */
    public p240nj.AbstractC4848f mo10875h(p240nj.AbstractC4846d r8, p240nj.AbstractC4846d r9, p240nj.AbstractC4846d[] r10, boolean r11) {
            r7 = this;
            pj.d r6 = new pj.d
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
            pj.c r0 = new pj.c
            r0.<init>(r2)
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: m */
    public int mo10880m() {
            r1 = this;
            java.math.BigInteger r0 = p278pj.C5529a.f21529j
            int r0 = r0.bitLength()
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: n */
    public p240nj.AbstractC4848f mo10881n() {
            r1 = this;
            pj.d r0 = r1.f21530i
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
