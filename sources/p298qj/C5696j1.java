package p298qj;

/* renamed from: qj.j1 */
/* loaded from: classes.dex */
public class C5696j1 extends p240nj.AbstractC4845c.b {

    /* renamed from: j */
    public p298qj.C5700k1 f22037j;

    /* renamed from: qj.j1$a */
    public class a implements p240nj.InterfaceC4847e {

        /* renamed from: a */
        public final /* synthetic */ int f22038a;

        /* renamed from: b */
        public final /* synthetic */ long[] f22039b;

        /* renamed from: c */
        public final /* synthetic */ p298qj.C5696j1 f22040c;

        public a(p298qj.C5696j1 r1, int r2, long[] r3) {
                r0 = this;
                r0.f22040c = r1
                r0.f22038a = r2
                r0.f22039b = r3
                r0.<init>()
                return
        }

        @Override // p240nj.InterfaceC4847e
        /* renamed from: a */
        public int mo10888a() {
                r1 = this;
                int r0 = r1.f22038a
                return r0
        }

        @Override // p240nj.InterfaceC4847e
        /* renamed from: b */
        public p240nj.AbstractC4848f mo10889b(int r15) {
                r14 = this;
                r0 = 3
                long[] r1 = new long[r0]
                long[] r2 = new long[r0]
                r3 = 0
                r4 = 0
                r5 = 0
            L8:
                int r6 = r14.f22038a
                if (r4 >= r6) goto L36
                r6 = r4 ^ r15
                int r6 = r6 + (-1)
                int r6 = r6 >> 31
                long r6 = (long) r6
                r8 = 0
            L14:
                if (r8 >= r0) goto L31
                r9 = r1[r8]
                long[] r11 = r14.f22039b
                int r12 = r5 + r8
                r12 = r11[r12]
                long r12 = r12 & r6
                long r9 = r9 ^ r12
                r1[r8] = r9
                r9 = r2[r8]
                int r12 = r5 + 3
                int r12 = r12 + r8
                r12 = r11[r12]
                long r11 = r12 & r6
                long r9 = r9 ^ r11
                r2[r8] = r9
                int r8 = r8 + 1
                goto L14
            L31:
                int r5 = r5 + 6
                int r4 = r4 + 1
                goto L8
            L36:
                qj.j1 r15 = r14.f22040c
                qj.g1 r0 = new qj.g1
                r0.<init>(r1)
                qj.g1 r1 = new qj.g1
                r1.<init>(r2)
                java.util.Objects.requireNonNull(r15)
                qj.k1 r2 = new qj.k1
                r2.<init>(r15, r0, r1, r3)
                return r2
        }
    }

    public C5696j1() {
            r4 = this;
            r0 = 163(0xa3, float:2.28E-43)
            r1 = 3
            r2 = 6
            r3 = 7
            r4.<init>(r0, r1, r2, r3)
            qj.k1 r0 = new qj.k1
            r1 = 0
            r3 = 0
            r0.<init>(r4, r3, r3, r1)
            r4.f22037j = r0
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "07B6882CAAEFA84F9554FF8428BD88E246D2782AE2"
            byte[] r1 = p421xj.C7089e.m14194a(r1)
            r3 = 1
            r0.<init>(r3, r1)
            qj.g1 r1 = new qj.g1
            r1.<init>(r0)
            r4.f19249b = r1
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9"
            byte[] r1 = p421xj.C7089e.m14194a(r1)
            r0.<init>(r3, r1)
            qj.g1 r1 = new qj.g1
            r1.<init>(r0)
            r4.f19250c = r1
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B"
            byte[] r1 = p421xj.C7089e.m14194a(r1)
            r0.<init>(r3, r1)
            r4.f19251d = r0
            r0 = 2
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            r4.f19252e = r0
            r4.f19253f = r2
            return
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: a */
    public p240nj.AbstractC4845c mo10868a() {
            r1 = this;
            qj.j1 r0 = new qj.j1
            r0.<init>()
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: c */
    public p240nj.InterfaceC4847e mo10870c(p240nj.AbstractC4848f[] r7, int r8, int r9) {
            r6 = this;
            int r0 = r9 * 3
            int r0 = r0 * 2
            long[] r0 = new long[r0]
            r1 = 0
            r2 = 0
            r3 = 0
        L9:
            if (r2 >= r9) goto L28
            int r4 = r8 + r2
            r4 = r7[r4]
            nj.d r5 = r4.f19287b
            qj.g1 r5 = (p298qj.C5684g1) r5
            long[] r5 = r5.f22015Y
            p085f1.AbstractC1972m.m5008m(r5, r1, r0, r3)
            int r3 = r3 + 3
            nj.d r4 = r4.f19288c
            qj.g1 r4 = (p298qj.C5684g1) r4
            long[] r4 = r4.f22015Y
            p085f1.AbstractC1972m.m5008m(r4, r1, r0, r3)
            int r3 = r3 + 3
            int r2 = r2 + 1
            goto L9
        L28:
            qj.j1$a r7 = new qj.j1$a
            r7.<init>(r6, r9, r0)
            return r7
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: g */
    public p240nj.AbstractC4848f mo10874g(p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3, boolean r4) {
            r1 = this;
            qj.k1 r0 = new qj.k1
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: h */
    public p240nj.AbstractC4848f mo10875h(p240nj.AbstractC4846d r8, p240nj.AbstractC4846d r9, p240nj.AbstractC4846d[] r10, boolean r11) {
            r7 = this;
            qj.k1 r6 = new qj.k1
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
            qj.g1 r0 = new qj.g1
            r0.<init>(r2)
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: m */
    public int mo10880m() {
            r1 = this;
            r0 = 163(0xa3, float:2.28E-43)
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: n */
    public p240nj.AbstractC4848f mo10881n() {
            r1 = this;
            qj.k1 r0 = r1.f22037j
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: s */
    public boolean mo10886s(int r2) {
            r1 = this;
            r0 = 6
            if (r2 == r0) goto L5
            r2 = 0
            return r2
        L5:
            r2 = 1
            return r2
    }

    @Override // p240nj.AbstractC4845c.b
    /* renamed from: u */
    public boolean mo10890u() {
            r1 = this;
            r0 = 0
            return r0
    }
}
