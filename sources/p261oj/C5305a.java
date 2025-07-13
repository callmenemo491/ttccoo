package p261oj;

/* renamed from: oj.a */
/* loaded from: classes.dex */
public class C5305a extends p240nj.AbstractC4845c.c {

    /* renamed from: j */
    public static final java.math.BigInteger f20550j = null;

    /* renamed from: i */
    public p261oj.C5308d f20551i;

    /* renamed from: oj.a$a */
    public class a implements p240nj.InterfaceC4847e {

        /* renamed from: a */
        public final /* synthetic */ int f20552a;

        /* renamed from: b */
        public final /* synthetic */ int[] f20553b;

        /* renamed from: c */
        public final /* synthetic */ p261oj.C5305a f20554c;

        public a(p261oj.C5305a r1, int r2, int[] r3) {
                r0 = this;
                r0.f20554c = r1
                r0.f20552a = r2
                r0.f20553b = r3
                r0.<init>()
                return
        }

        @Override // p240nj.InterfaceC4847e
        /* renamed from: a */
        public int mo10888a() {
                r1 = this;
                int r0 = r1.f20552a
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
                int r6 = r11.f20552a
                if (r4 >= r6) goto L35
                r6 = r4 ^ r12
                int r6 = r6 + (-1)
                int r6 = r6 >> 31
                r7 = 0
            L14:
                if (r7 >= r0) goto L30
                r8 = r1[r7]
                int[] r9 = r11.f20553b
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
                oj.a r12 = r11.f20554c
                oj.c r0 = new oj.c
                r0.<init>(r1)
                oj.c r1 = new oj.c
                r1.<init>(r2)
                java.util.Objects.requireNonNull(r12)
                oj.d r2 = new oj.d
                r2.<init>(r12, r0, r1, r3)
                return r2
        }
    }

    static {
            int[] r0 = p261oj.C5306b.f20555a
            java.math.BigInteger r0 = tj.AbstractC6255a.m12841I(r0)
            p261oj.C5305a.f20550j = r0
            return
    }

    public C5305a() {
            r3 = this;
            java.math.BigInteger r0 = p261oj.C5305a.f20550j
            r3.<init>(r0)
            oj.d r0 = new oj.d
            r1 = 0
            r2 = 0
            r0.<init>(r3, r2, r2, r1)
            r3.f20551i = r0
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144"
            byte[] r1 = p421xj.C7089e.m14194a(r1)
            r2 = 1
            r0.<init>(r2, r1)
            oj.c r1 = new oj.c
            r1.<init>(r0)
            r3.f19249b = r1
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864"
            byte[] r1 = p421xj.C7089e.m14194a(r1)
            r0.<init>(r2, r1)
            oj.c r1 = new oj.c
            r1.<init>(r0)
            r3.f19250c = r1
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"
            byte[] r1 = p421xj.C7089e.m14194a(r1)
            r0.<init>(r2, r1)
            r3.f19251d = r0
            r0 = 8
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            r3.f19252e = r0
            r0 = 4
            r3.f19253f = r0
            return
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: a */
    public p240nj.AbstractC4845c mo10868a() {
            r1 = this;
            oj.a r0 = new oj.a
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
            oj.c r5 = (p261oj.C5307c) r5
            int[] r5 = r5.f20559Y
            tj.AbstractC6255a.m12850g(r5, r1, r0, r3)
            int r3 = r3 + 8
            nj.d r4 = r4.f19288c
            oj.c r4 = (p261oj.C5307c) r4
            int[] r4 = r4.f20559Y
            tj.AbstractC6255a.m12850g(r4, r1, r0, r3)
            int r3 = r3 + 8
            int r2 = r2 + 1
            goto L9
        L28:
            oj.a$a r7 = new oj.a$a
            r7.<init>(r6, r9, r0)
            return r7
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: g */
    public p240nj.AbstractC4848f mo10874g(p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3, boolean r4) {
            r1 = this;
            oj.d r0 = new oj.d
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: h */
    public p240nj.AbstractC4848f mo10875h(p240nj.AbstractC4846d r8, p240nj.AbstractC4846d r9, p240nj.AbstractC4846d[] r10, boolean r11) {
            r7 = this;
            oj.d r6 = new oj.d
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
            oj.c r0 = new oj.c
            r0.<init>(r2)
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: m */
    public int mo10880m() {
            r1 = this;
            java.math.BigInteger r0 = p261oj.C5305a.f20550j
            int r0 = r0.bitLength()
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: n */
    public p240nj.AbstractC4848f mo10881n() {
            r1 = this;
            oj.d r0 = r1.f20551i
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: s */
    public boolean mo10886s(int r2) {
            r1 = this;
            r0 = 4
            if (r2 == r0) goto L5
            r2 = 0
            return r2
        L5:
            r2 = 1
            return r2
    }
}
