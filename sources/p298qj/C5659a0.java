package p298qj;

/* renamed from: qj.a0 */
/* loaded from: classes.dex */
public class C5659a0 extends p240nj.AbstractC4845c.c {

    /* renamed from: j */
    public static final java.math.BigInteger f21960j = null;

    /* renamed from: i */
    public p298qj.C5671d0 f21961i;

    /* renamed from: qj.a0$a */
    public class a implements p240nj.InterfaceC4847e {

        /* renamed from: a */
        public final /* synthetic */ int f21962a;

        /* renamed from: b */
        public final /* synthetic */ int[] f21963b;

        /* renamed from: c */
        public final /* synthetic */ p298qj.C5659a0 f21964c;

        public a(p298qj.C5659a0 r1, int r2, int[] r3) {
                r0 = this;
                r0.f21964c = r1
                r0.f21962a = r2
                r0.f21963b = r3
                r0.<init>()
                return
        }

        @Override // p240nj.InterfaceC4847e
        /* renamed from: a */
        public int mo10888a() {
                r1 = this;
                int r0 = r1.f21962a
                return r0
        }

        @Override // p240nj.InterfaceC4847e
        /* renamed from: b */
        public p240nj.AbstractC4848f mo10889b(int r12) {
                r11 = this;
                r0 = 7
                int[] r1 = new int[r0]
                int[] r2 = new int[r0]
                r3 = 0
                r4 = 0
                r5 = 0
            L8:
                int r6 = r11.f21962a
                if (r4 >= r6) goto L34
                r6 = r4 ^ r12
                int r6 = r6 + (-1)
                int r6 = r6 >> 31
                r7 = 0
            L13:
                if (r7 >= r0) goto L2f
                r8 = r1[r7]
                int[] r9 = r11.f21963b
                int r10 = r5 + r7
                r10 = r9[r10]
                r10 = r10 & r6
                r8 = r8 ^ r10
                r1[r7] = r8
                r8 = r2[r7]
                int r10 = r5 + 7
                int r10 = r10 + r7
                r9 = r9[r10]
                r9 = r9 & r6
                r8 = r8 ^ r9
                r2[r7] = r8
                int r7 = r7 + 1
                goto L13
            L2f:
                int r5 = r5 + 14
                int r4 = r4 + 1
                goto L8
            L34:
                qj.a0 r12 = r11.f21964c
                qj.c0 r0 = new qj.c0
                r0.<init>(r1)
                qj.c0 r1 = new qj.c0
                r1.<init>(r2)
                java.util.Objects.requireNonNull(r12)
                qj.d0 r2 = new qj.d0
                r2.<init>(r12, r0, r1, r3)
                return r2
        }
    }

    static {
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001"
            byte[] r1 = p421xj.C7089e.m14194a(r1)
            r2 = 1
            r0.<init>(r2, r1)
            p298qj.C5659a0.f21960j = r0
            return
    }

    public C5659a0() {
            r3 = this;
            java.math.BigInteger r0 = p298qj.C5659a0.f21960j
            r3.<init>(r0)
            qj.d0 r0 = new qj.d0
            r1 = 0
            r2 = 0
            r0.<init>(r3, r2, r2, r1)
            r3.f21961i = r0
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE"
            byte[] r1 = p421xj.C7089e.m14194a(r1)
            r2 = 1
            r0.<init>(r2, r1)
            qj.c0 r1 = new qj.c0
            r1.<init>(r0)
            r3.f19249b = r1
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4"
            byte[] r1 = p421xj.C7089e.m14194a(r1)
            r0.<init>(r2, r1)
            qj.c0 r1 = new qj.c0
            r1.<init>(r0)
            r3.f19250c = r1
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D"
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
            qj.a0 r0 = new qj.a0
            r0.<init>()
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: c */
    public p240nj.InterfaceC4847e mo10870c(p240nj.AbstractC4848f[] r7, int r8, int r9) {
            r6 = this;
            int r0 = r9 * 7
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
            qj.c0 r5 = (p298qj.C5667c0) r5
            int[] r5 = r5.f21981Y
            p446z3.AbstractC7246d.m14317c(r5, r1, r0, r3)
            int r3 = r3 + 7
            nj.d r4 = r4.f19288c
            qj.c0 r4 = (p298qj.C5667c0) r4
            int[] r4 = r4.f21981Y
            p446z3.AbstractC7246d.m14317c(r4, r1, r0, r3)
            int r3 = r3 + 7
            int r2 = r2 + 1
            goto L9
        L28:
            qj.a0$a r7 = new qj.a0$a
            r7.<init>(r6, r9, r0)
            return r7
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: g */
    public p240nj.AbstractC4848f mo10874g(p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3, boolean r4) {
            r1 = this;
            qj.d0 r0 = new qj.d0
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: h */
    public p240nj.AbstractC4848f mo10875h(p240nj.AbstractC4846d r8, p240nj.AbstractC4846d r9, p240nj.AbstractC4846d[] r10, boolean r11) {
            r7 = this;
            qj.d0 r6 = new qj.d0
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
            qj.c0 r0 = new qj.c0
            r0.<init>(r2)
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: m */
    public int mo10880m() {
            r1 = this;
            java.math.BigInteger r0 = p298qj.C5659a0.f21960j
            int r0 = r0.bitLength()
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: n */
    public p240nj.AbstractC4848f mo10881n() {
            r1 = this;
            qj.d0 r0 = r1.f21961i
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
