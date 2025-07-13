package p298qj;

/* renamed from: qj.e2 */
/* loaded from: classes.dex */
public class C5677e2 extends p240nj.AbstractC4845c.b {

    /* renamed from: j */
    public p298qj.C5681f2 f22000j;

    /* renamed from: qj.e2$a */
    public class a implements p240nj.InterfaceC4847e {

        /* renamed from: a */
        public final /* synthetic */ int f22001a;

        /* renamed from: b */
        public final /* synthetic */ long[] f22002b;

        /* renamed from: c */
        public final /* synthetic */ p298qj.C5677e2 f22003c;

        public a(p298qj.C5677e2 r1, int r2, long[] r3) {
                r0 = this;
                r0.f22003c = r1
                r0.f22001a = r2
                r0.f22002b = r3
                r0.<init>()
                return
        }

        @Override // p240nj.InterfaceC4847e
        /* renamed from: a */
        public int mo10888a() {
                r1 = this;
                int r0 = r1.f22001a
                return r0
        }

        @Override // p240nj.InterfaceC4847e
        /* renamed from: b */
        public p240nj.AbstractC4848f mo10889b(int r15) {
                r14 = this;
                r0 = 5
                long[] r1 = new long[r0]
                long[] r2 = new long[r0]
                r3 = 0
                r4 = 0
                r5 = 0
            L8:
                int r6 = r14.f22001a
                if (r4 >= r6) goto L36
                r6 = r4 ^ r15
                int r6 = r6 + (-1)
                int r6 = r6 >> 31
                long r6 = (long) r6
                r8 = 0
            L14:
                if (r8 >= r0) goto L31
                r9 = r1[r8]
                long[] r11 = r14.f22002b
                int r12 = r5 + r8
                r12 = r11[r12]
                long r12 = r12 & r6
                long r9 = r9 ^ r12
                r1[r8] = r9
                r9 = r2[r8]
                int r12 = r5 + 5
                int r12 = r12 + r8
                r12 = r11[r12]
                long r11 = r12 & r6
                long r9 = r9 ^ r11
                r2[r8] = r9
                int r8 = r8 + 1
                goto L14
            L31:
                int r5 = r5 + 10
                int r4 = r4 + 1
                goto L8
            L36:
                qj.e2 r15 = r14.f22003c
                qj.b2 r0 = new qj.b2
                r0.<init>(r1)
                qj.b2 r1 = new qj.b2
                r1.<init>(r2)
                java.util.Objects.requireNonNull(r15)
                qj.f2 r2 = new qj.f2
                r2.<init>(r15, r0, r1, r3)
                return r2
        }
    }

    public C5677e2() {
            r4 = this;
            r0 = 283(0x11b, float:3.97E-43)
            r1 = 5
            r2 = 7
            r3 = 12
            r4.<init>(r0, r1, r2, r3)
            qj.f2 r0 = new qj.f2
            r1 = 0
            r2 = 0
            r0.<init>(r4, r2, r2, r1)
            r4.f22000j = r0
            r0 = 1
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            qj.b2 r1 = new qj.b2
            r1.<init>(r0)
            r4.f19249b = r1
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "027B680AC8B8596DA5A4AF8A19A0303FCA97FD7645309FA2A581485AF6263E313B79A2F5"
            byte[] r1 = p421xj.C7089e.m14194a(r1)
            r2 = 1
            r0.<init>(r2, r1)
            qj.b2 r1 = new qj.b2
            r1.<init>(r0)
            r4.f19250c = r1
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEF90399660FC938A90165B042A7CEFADB307"
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
            qj.e2 r0 = new qj.e2
            r0.<init>()
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: c */
    public p240nj.InterfaceC4847e mo10870c(p240nj.AbstractC4848f[] r7, int r8, int r9) {
            r6 = this;
            int r0 = r9 * 5
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
            qj.b2 r5 = (p298qj.C5665b2) r5
            long[] r5 = r5.f21977Y
            p139i1.AbstractC3061d.m7474d(r5, r1, r0, r3)
            int r3 = r3 + 5
            nj.d r4 = r4.f19288c
            qj.b2 r4 = (p298qj.C5665b2) r4
            long[] r4 = r4.f21977Y
            p139i1.AbstractC3061d.m7474d(r4, r1, r0, r3)
            int r3 = r3 + 5
            int r2 = r2 + 1
            goto L9
        L28:
            qj.e2$a r7 = new qj.e2$a
            r7.<init>(r6, r9, r0)
            return r7
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: g */
    public p240nj.AbstractC4848f mo10874g(p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3, boolean r4) {
            r1 = this;
            qj.f2 r0 = new qj.f2
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: h */
    public p240nj.AbstractC4848f mo10875h(p240nj.AbstractC4846d r8, p240nj.AbstractC4846d r9, p240nj.AbstractC4846d[] r10, boolean r11) {
            r7 = this;
            qj.f2 r6 = new qj.f2
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
            qj.b2 r0 = new qj.b2
            r0.<init>(r2)
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: m */
    public int mo10880m() {
            r1 = this;
            r0 = 283(0x11b, float:3.97E-43)
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: n */
    public p240nj.AbstractC4848f mo10881n() {
            r1 = this;
            qj.f2 r0 = r1.f22000j
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
