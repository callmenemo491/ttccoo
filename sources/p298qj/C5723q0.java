package p298qj;

/* renamed from: qj.q0 */
/* loaded from: classes.dex */
public class C5723q0 extends p240nj.AbstractC4845c.c {

    /* renamed from: j */
    public static final java.math.BigInteger f22098j = null;

    /* renamed from: i */
    public p298qj.C5733t0 f22099i;

    /* renamed from: qj.q0$a */
    public class a implements p240nj.InterfaceC4847e {

        /* renamed from: a */
        public final /* synthetic */ int f22100a;

        /* renamed from: b */
        public final /* synthetic */ int[] f22101b;

        /* renamed from: c */
        public final /* synthetic */ p298qj.C5723q0 f22102c;

        public a(p298qj.C5723q0 r1, int r2, int[] r3) {
                r0 = this;
                r0.f22102c = r1
                r0.f22100a = r2
                r0.f22101b = r3
                r0.<init>()
                return
        }

        @Override // p240nj.InterfaceC4847e
        /* renamed from: a */
        public int mo10888a() {
                r1 = this;
                int r0 = r1.f22100a
                return r0
        }

        @Override // p240nj.InterfaceC4847e
        /* renamed from: b */
        public p240nj.AbstractC4848f mo10889b(int r12) {
                r11 = this;
                r0 = 17
                int[] r1 = new int[r0]
                int[] r2 = new int[r0]
                r3 = 0
                r4 = 0
                r5 = 0
            L9:
                int r6 = r11.f22100a
                if (r4 >= r6) goto L35
                r6 = r4 ^ r12
                int r6 = r6 + (-1)
                int r6 = r6 >> 31
                r7 = 0
            L14:
                if (r7 >= r0) goto L30
                r8 = r1[r7]
                int[] r9 = r11.f22101b
                int r10 = r5 + r7
                r10 = r9[r10]
                r10 = r10 & r6
                r8 = r8 ^ r10
                r1[r7] = r8
                r8 = r2[r7]
                int r10 = r5 + 17
                int r10 = r10 + r7
                r9 = r9[r10]
                r9 = r9 & r6
                r8 = r8 ^ r9
                r2[r7] = r8
                int r7 = r7 + 1
                goto L14
            L30:
                int r5 = r5 + 34
                int r4 = r4 + 1
                goto L9
            L35:
                qj.q0 r12 = r11.f22102c
                qj.s0 r0 = new qj.s0
                r0.<init>(r1)
                qj.s0 r1 = new qj.s0
                r1.<init>(r2)
                java.util.Objects.requireNonNull(r12)
                qj.t0 r2 = new qj.t0
                r2.<init>(r12, r0, r1, r3)
                return r2
        }
    }

    static {
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"
            byte[] r1 = p421xj.C7089e.m14194a(r1)
            r2 = 1
            r0.<init>(r2, r1)
            p298qj.C5723q0.f22098j = r0
            return
    }

    public C5723q0() {
            r3 = this;
            java.math.BigInteger r0 = p298qj.C5723q0.f22098j
            r3.<init>(r0)
            qj.t0 r0 = new qj.t0
            r1 = 0
            r2 = 0
            r0.<init>(r3, r2, r2, r1)
            r3.f22099i = r0
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC"
            byte[] r1 = p421xj.C7089e.m14194a(r1)
            r2 = 1
            r0.<init>(r2, r1)
            qj.s0 r1 = new qj.s0
            r1.<init>(r0)
            r3.f19249b = r1
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00"
            byte[] r1 = p421xj.C7089e.m14194a(r1)
            r0.<init>(r2, r1)
            qj.s0 r1 = new qj.s0
            r1.<init>(r0)
            r3.f19250c = r1
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409"
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
            qj.q0 r0 = new qj.q0
            r0.<init>()
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: c */
    public p240nj.InterfaceC4847e mo10870c(p240nj.AbstractC4848f[] r8, int r9, int r10) {
            r7 = this;
            int r0 = r10 * 17
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
            qj.s0 r5 = (p298qj.C5730s0) r5
            int[] r5 = r5.f22114Y
            r6 = 17
            java.lang.System.arraycopy(r5, r1, r0, r3, r6)
            int r3 = r3 + 17
            nj.d r4 = r4.f19288c
            qj.s0 r4 = (p298qj.C5730s0) r4
            int[] r4 = r4.f22114Y
            java.lang.System.arraycopy(r4, r1, r0, r3, r6)
            int r3 = r3 + 17
            int r2 = r2 + 1
            goto L9
        L2a:
            qj.q0$a r8 = new qj.q0$a
            r8.<init>(r7, r10, r0)
            return r8
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: g */
    public p240nj.AbstractC4848f mo10874g(p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3, boolean r4) {
            r1 = this;
            qj.t0 r0 = new qj.t0
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: h */
    public p240nj.AbstractC4848f mo10875h(p240nj.AbstractC4846d r8, p240nj.AbstractC4846d r9, p240nj.AbstractC4846d[] r10, boolean r11) {
            r7 = this;
            qj.t0 r6 = new qj.t0
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
            qj.s0 r0 = new qj.s0
            r0.<init>(r2)
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: m */
    public int mo10880m() {
            r1 = this;
            java.math.BigInteger r0 = p298qj.C5723q0.f22098j
            int r0 = r0.bitLength()
            return r0
    }

    @Override // p240nj.AbstractC4845c
    /* renamed from: n */
    public p240nj.AbstractC4848f mo10881n() {
            r1 = this;
            qj.t0 r0 = r1.f22099i
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
