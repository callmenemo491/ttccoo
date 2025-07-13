package p298qj;

/* renamed from: qj.n2 */
/* loaded from: classes.dex */
public class C5713n2 extends p240nj.AbstractC4845c.b {

    /* renamed from: j */
    public p298qj.C5717o2 f22072j;

    /* renamed from: qj.n2$a */
    public class a implements p240nj.InterfaceC4847e {

        /* renamed from: a */
        public final /* synthetic */ int f22073a;

        /* renamed from: b */
        public final /* synthetic */ long[] f22074b;

        /* renamed from: c */
        public final /* synthetic */ p298qj.C5713n2 f22075c;

        public a(p298qj.C5713n2 r1, int r2, long[] r3) {
                r0 = this;
                r0.f22075c = r1
                r0.f22073a = r2
                r0.f22074b = r3
                r0.<init>()
                return
        }

        @Override // p240nj.InterfaceC4847e
        /* renamed from: a */
        public int mo10888a() {
                r1 = this;
                int r0 = r1.f22073a
                return r0
        }

        @Override // p240nj.InterfaceC4847e
        /* renamed from: b */
        public p240nj.AbstractC4848f mo10889b(int r15) {
                r14 = this;
                r0 = 9
                long[] r1 = new long[r0]
                long[] r2 = new long[r0]
                r3 = 0
                r4 = 0
                r5 = 0
            L9:
                int r6 = r14.f22073a
                if (r4 >= r6) goto L37
                r6 = r4 ^ r15
                int r6 = r6 + (-1)
                int r6 = r6 >> 31
                long r6 = (long) r6
                r8 = 0
            L15:
                if (r8 >= r0) goto L32
                r9 = r1[r8]
                long[] r11 = r14.f22074b
                int r12 = r5 + r8
                r12 = r11[r12]
                long r12 = r12 & r6
                long r9 = r9 ^ r12
                r1[r8] = r9
                r9 = r2[r8]
                int r12 = r5 + 9
                int r12 = r12 + r8
                r12 = r11[r12]
                long r11 = r12 & r6
                long r9 = r9 ^ r11
                r2[r8] = r9
                int r8 = r8 + 1
                goto L15
            L32:
                int r5 = r5 + 18
                int r4 = r4 + 1
                goto L9
            L37:
                qj.n2 r15 = r14.f22075c
                qj.m2 r0 = new qj.m2
                r0.<init>(r1)
                qj.m2 r1 = new qj.m2
                r1.<init>(r2)
                java.util.Objects.requireNonNull(r15)
                qj.o2 r2 = new qj.o2
                r2.<init>(r15, r0, r1, r3)
                return r2
        }
    }

    public C5713n2() {
            r4 = this;
            r0 = 571(0x23b, float:8.0E-43)
            r1 = 2
            r2 = 5
            r3 = 10
            r4.<init>(r0, r1, r2, r3)
            qj.o2 r0 = new qj.o2
            r1 = 0
            r2 = 0
            r0.<init>(r4, r2, r2, r1)
            r4.f22072j = r0
            r0 = 0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            qj.m2 r1 = new qj.m2
            r1.<init>(r0)
            r4.f19249b = r1
            r0 = 1
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            qj.m2 r1 = new qj.m2
            r1.<init>(r0)
            r4.f19250c = r1
            java.math.BigInteger r0 = new java.math.BigInteger
            r1 = 1
            java.lang.String r2 = "020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001"
            byte[] r2 = p421xj.C7089e.m14194a(r2)
            r0.<init>(r1, r2)
            r4.f19251d = r0
            r0 = 4
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
            qj.n2 r0 = new qj.n2
            r0.<init>()
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: c */
    public p240nj.InterfaceC4847e mo10870c(p240nj.AbstractC4848f[] r7, int r8, int r9) {
            r6 = this;
            int r0 = r9 * 9
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
            qj.m2 r5 = (p298qj.C5709m2) r5
            long[] r5 = r5.f22067Y
            p139i1.AbstractC3061d.m7475e(r5, r1, r0, r3)
            int r3 = r3 + 9
            nj.d r4 = r4.f19288c
            qj.m2 r4 = (p298qj.C5709m2) r4
            long[] r4 = r4.f22067Y
            p139i1.AbstractC3061d.m7475e(r4, r1, r0, r3)
            int r3 = r3 + 9
            int r2 = r2 + 1
            goto L9
        L28:
            qj.n2$a r7 = new qj.n2$a
            r7.<init>(r6, r9, r0)
            return r7
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: d */
    public p124h7.AbstractC2947xb mo10871d() {
            r1 = this;
            nj.v r0 = new nj.v
            r0.<init>()
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: g */
    public p240nj.AbstractC4848f mo10874g(p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3, boolean r4) {
            r1 = this;
            qj.o2 r0 = new qj.o2
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: h */
    public p240nj.AbstractC4848f mo10875h(p240nj.AbstractC4846d r8, p240nj.AbstractC4846d r9, p240nj.AbstractC4846d[] r10, boolean r11) {
            r7 = this;
            qj.o2 r6 = new qj.o2
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
            qj.m2 r0 = new qj.m2
            r0.<init>(r2)
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: m */
    public int mo10880m() {
            r1 = this;
            r0 = 571(0x23b, float:8.0E-43)
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: n */
    public p240nj.AbstractC4848f mo10881n() {
            r1 = this;
            qj.o2 r0 = r1.f22072j
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
            r0 = 1
            return r0
    }
}
