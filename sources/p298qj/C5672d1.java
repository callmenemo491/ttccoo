package p298qj;

/* renamed from: qj.d1 */
/* loaded from: classes.dex */
public class C5672d1 extends p240nj.AbstractC4845c.b {

    /* renamed from: j */
    public p298qj.C5676e1 f21986j;

    /* renamed from: qj.d1$a */
    public class a implements p240nj.InterfaceC4847e {

        /* renamed from: a */
        public final /* synthetic */ int f21987a;

        /* renamed from: b */
        public final /* synthetic */ long[] f21988b;

        /* renamed from: c */
        public final /* synthetic */ p298qj.C5672d1 f21989c;

        public a(p298qj.C5672d1 r1, int r2, long[] r3) {
                r0 = this;
                r0.f21989c = r1
                r0.f21987a = r2
                r0.f21988b = r3
                r0.<init>()
                return
        }

        @Override // p240nj.InterfaceC4847e
        /* renamed from: a */
        public int mo10888a() {
                r1 = this;
                int r0 = r1.f21987a
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
                int r6 = r14.f21987a
                if (r4 >= r6) goto L36
                r6 = r4 ^ r15
                int r6 = r6 + (-1)
                int r6 = r6 >> 31
                long r6 = (long) r6
                r8 = 0
            L14:
                if (r8 >= r0) goto L31
                r9 = r1[r8]
                long[] r11 = r14.f21988b
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
                qj.d1 r15 = r14.f21989c
                qj.a1 r0 = new qj.a1
                r0.<init>(r1)
                qj.a1 r1 = new qj.a1
                r1.<init>(r2)
                java.util.Objects.requireNonNull(r15)
                qj.e1 r2 = new qj.e1
                r2.<init>(r15, r0, r1, r3)
                return r2
        }
    }

    public C5672d1() {
            r4 = this;
            r0 = 131(0x83, float:1.84E-43)
            r1 = 2
            r2 = 3
            r3 = 8
            r4.<init>(r0, r1, r2, r3)
            qj.e1 r0 = new qj.e1
            r1 = 0
            r2 = 0
            r0.<init>(r4, r2, r2, r1)
            r4.f21986j = r0
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "03E5A88919D7CAFCBF415F07C2176573B2"
            byte[] r1 = p421xj.C7089e.m14194a(r1)
            r2 = 1
            r0.<init>(r2, r1)
            qj.a1 r1 = new qj.a1
            r1.<init>(r0)
            r4.f19249b = r1
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "04B8266A46C55657AC734CE38F018F2192"
            byte[] r1 = p421xj.C7089e.m14194a(r1)
            r0.<init>(r2, r1)
            qj.a1 r1 = new qj.a1
            r1.<init>(r0)
            r4.f19250c = r1
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "0400000000000000016954A233049BA98F"
            byte[] r1 = p421xj.C7089e.m14194a(r1)
            r0.<init>(r2, r1)
            r4.f19251d = r0
            r0 = 2
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            r4.f19252e = r0
            r0 = 6
            r4.f19253f = r0
            return
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: a */
    public p240nj.AbstractC4845c mo10868a() {
            r1 = this;
            qj.d1 r0 = new qj.d1
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
            qj.a1 r5 = (p298qj.C5660a1) r5
            long[] r5 = r5.f21965Y
            p085f1.AbstractC1972m.m5008m(r5, r1, r0, r3)
            int r3 = r3 + 3
            nj.d r4 = r4.f19288c
            qj.a1 r4 = (p298qj.C5660a1) r4
            long[] r4 = r4.f21965Y
            p085f1.AbstractC1972m.m5008m(r4, r1, r0, r3)
            int r3 = r3 + 3
            int r2 = r2 + 1
            goto L9
        L28:
            qj.d1$a r7 = new qj.d1$a
            r7.<init>(r6, r9, r0)
            return r7
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: g */
    public p240nj.AbstractC4848f mo10874g(p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3, boolean r4) {
            r1 = this;
            qj.e1 r0 = new qj.e1
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: h */
    public p240nj.AbstractC4848f mo10875h(p240nj.AbstractC4846d r8, p240nj.AbstractC4846d r9, p240nj.AbstractC4846d[] r10, boolean r11) {
            r7 = this;
            qj.e1 r6 = new qj.e1
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
            qj.a1 r0 = new qj.a1
            r0.<init>(r2)
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: m */
    public int mo10880m() {
            r1 = this;
            r0 = 131(0x83, float:1.84E-43)
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: n */
    public p240nj.AbstractC4848f mo10881n() {
            r1 = this;
            qj.e1 r0 = r1.f21986j
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
