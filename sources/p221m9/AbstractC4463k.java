package p221m9;

/* renamed from: m9.k */
/* loaded from: classes.dex */
public abstract class AbstractC4463k extends p211m.AbstractC4310c {

    /* renamed from: b */
    public static final java.util.logging.Logger f18182b = null;

    /* renamed from: c */
    public static final boolean f18183c = false;

    /* renamed from: a */
    public p221m9.C4466l f18184a;

    /* renamed from: m9.k$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: m9.k$b */
    public static class b extends p221m9.AbstractC4463k {

        /* renamed from: d */
        public final byte[] f18185d;

        /* renamed from: e */
        public final int f18186e;

        /* renamed from: f */
        public int f18187f;

        public b(byte[] r4, int r5, int r6) {
                r3 = this;
                r0 = 0
                r3.<init>(r0)
                java.lang.String r0 = "buffer"
                java.util.Objects.requireNonNull(r4, r0)
                r0 = r5 | r6
                int r1 = r4.length
                int r2 = r5 + r6
                int r1 = r1 - r2
                r0 = r0 | r1
                if (r0 < 0) goto L19
                r3.f18185d = r4
                r3.f18187f = r5
                r3.f18186e = r2
                return
            L19:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                int r4 = r4.length
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r1[r2] = r4
                r4 = 1
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r1[r4] = r5
                r4 = 2
                java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
                r1[r4] = r5
                java.lang.String r4 = "Array range is invalid. Buffer.length=%d, offset=%d, length=%d"
                java.lang.String r4 = java.lang.String.format(r4, r1)
                r0.<init>(r4)
                throw r0
        }

        @Override // p221m9.AbstractC4463k
        /* renamed from: M */
        public final int mo10155M() {
                r2 = this;
                int r0 = r2.f18186e
                int r1 = r2.f18187f
                int r0 = r0 - r1
                return r0
        }

        @Override // p221m9.AbstractC4463k
        /* renamed from: N */
        public final void mo10156N(byte r5) {
                r4 = this;
                byte[] r0 = r4.f18185d     // Catch: java.lang.IndexOutOfBoundsException -> Lb
                int r1 = r4.f18187f     // Catch: java.lang.IndexOutOfBoundsException -> Lb
                int r2 = r1 + 1
                r4.f18187f = r2     // Catch: java.lang.IndexOutOfBoundsException -> Lb
                r0[r1] = r5     // Catch: java.lang.IndexOutOfBoundsException -> Lb
                return
            Lb:
                r5 = move-exception
                m9.k$c r0 = new m9.k$c
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                int r3 = r4.f18187f
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                int r2 = r4.f18186e
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 1
                r1[r3] = r2
                r2 = 2
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                java.lang.String r2 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1, r5)
                throw r0
        }

        @Override // p221m9.AbstractC4463k
        /* renamed from: O */
        public final void mo10157O(int r1, boolean r2) {
                r0 = this;
                int r1 = r1 << 3
                r1 = r1 | 0
                r0.mo10171c0(r1)
                byte r1 = (byte) r2
                r0.mo10156N(r1)
                return
        }

        @Override // p221m9.AbstractC4463k
        /* renamed from: P */
        public final void mo10158P(int r1, p221m9.AbstractC4454h r2) {
                r0 = this;
                int r1 = r1 << 3
                r1 = r1 | 2
                r0.mo10171c0(r1)
                r0.m10175g0(r2)
                return
        }

        @Override // p221m9.AbstractC4463k
        /* renamed from: Q */
        public final void mo10159Q(int r1, int r2) {
                r0 = this;
                int r1 = r1 << 3
                r1 = r1 | 5
                r0.mo10171c0(r1)
                r0.mo10160R(r2)
                return
        }

        @Override // p221m9.AbstractC4463k
        /* renamed from: R */
        public final void mo10160R(int r5) {
                r4 = this;
                byte[] r0 = r4.f18185d     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                int r1 = r4.f18187f     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                int r2 = r1 + 1
                r4.f18187f = r2     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                r3 = r5 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                int r1 = r2 + 1
                r4.f18187f = r1     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                int r3 = r5 >> 8
                r3 = r3 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                r0[r2] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                int r2 = r1 + 1
                r4.f18187f = r2     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                int r3 = r5 >> 16
                r3 = r3 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                int r1 = r2 + 1
                r4.f18187f = r1     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                int r5 = r5 >> 24
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                r0[r2] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                return
            L2f:
                r5 = move-exception
                m9.k$c r0 = new m9.k$c
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                int r3 = r4.f18187f
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                int r2 = r4.f18186e
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 1
                r1[r3] = r2
                r2 = 2
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                java.lang.String r2 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1, r5)
                throw r0
        }

        @Override // p221m9.AbstractC4463k
        /* renamed from: S */
        public final void mo10161S(int r1, long r2) {
                r0 = this;
                int r1 = r1 << 3
                r1 = r1 | 1
                r0.mo10171c0(r1)
                r0.mo10162T(r2)
                return
        }

        @Override // p221m9.AbstractC4463k
        /* renamed from: T */
        public final void mo10162T(long r6) {
                r5 = this;
                byte[] r0 = r5.f18185d     // Catch: java.lang.IndexOutOfBoundsException -> L70
                int r1 = r5.f18187f     // Catch: java.lang.IndexOutOfBoundsException -> L70
                int r2 = r1 + 1
                r5.f18187f = r2     // Catch: java.lang.IndexOutOfBoundsException -> L70
                int r3 = (int) r6     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r3 = r3 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                int r1 = r2 + 1
                r5.f18187f = r1     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r3 = 8
                long r3 = r6 >> r3
                int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r3 = r4 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r0[r2] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                int r2 = r1 + 1
                r5.f18187f = r2     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r3 = 16
                long r3 = r6 >> r3
                int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r3 = r4 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                int r1 = r2 + 1
                r5.f18187f = r1     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r3 = 24
                long r3 = r6 >> r3
                int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r3 = r4 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r0[r2] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                int r2 = r1 + 1
                r5.f18187f = r2     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r3 = 32
                long r3 = r6 >> r3
                int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r3 = r4 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                int r1 = r2 + 1
                r5.f18187f = r1     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r3 = 40
                long r3 = r6 >> r3
                int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r3 = r4 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r0[r2] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                int r2 = r1 + 1
                r5.f18187f = r2     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r3 = 48
                long r3 = r6 >> r3
                int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r3 = r4 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                int r1 = r2 + 1
                r5.f18187f = r1     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r1 = 56
                long r6 = r6 >> r1
                int r7 = (int) r6     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r6 = r7 & 255(0xff, float:3.57E-43)
                byte r6 = (byte) r6     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r0[r2] = r6     // Catch: java.lang.IndexOutOfBoundsException -> L70
                return
            L70:
                r6 = move-exception
                m9.k$c r7 = new m9.k$c
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                int r2 = r5.f18187f
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r1] = r2
                int r1 = r5.f18186e
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 1
                r0[r2] = r1
                r1 = 2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r1] = r2
                java.lang.String r1 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                r7.<init>(r0, r6)
                throw r7
        }

        @Override // p221m9.AbstractC4463k
        /* renamed from: U */
        public final void mo10163U(int r1, int r2) {
                r0 = this;
                int r1 = r1 << 3
                r1 = r1 | 0
                r0.mo10171c0(r1)
                if (r2 < 0) goto Ld
                r0.mo10171c0(r2)
                goto L11
            Ld:
                long r1 = (long) r2
                r0.mo10173e0(r1)
            L11:
                return
        }

        @Override // p221m9.AbstractC4463k
        /* renamed from: V */
        public final void mo10164V(int r3) {
                r2 = this;
                if (r3 < 0) goto L6
                r2.mo10171c0(r3)
                goto La
            L6:
                long r0 = (long) r3
                r2.mo10173e0(r0)
            La:
                return
        }

        @Override // p221m9.AbstractC4463k
        /* renamed from: W */
        public final void mo10165W(int r1, p221m9.InterfaceC4482q0 r2, p221m9.InterfaceC4447e1 r3) {
                r0 = this;
                int r1 = r1 << 3
                r1 = r1 | 2
                r0.mo10171c0(r1)
                r1 = r2
                m9.a r1 = (p221m9.AbstractC4433a) r1
                int r1 = r1.m9892i(r3)
                r0.mo10171c0(r1)
                m9.l r1 = r0.f18184a
                r3.mo9987b(r2, r1)
                return
        }

        @Override // p221m9.AbstractC4463k
        /* renamed from: X */
        public final void mo10166X(int r3, p221m9.InterfaceC4482q0 r4) {
                r2 = this;
                r0 = 1
                r1 = 3
                r2.mo10169a0(r0, r1)
                r1 = 2
                r2.mo10170b0(r1, r3)
                r3 = 26
                r2.mo10171c0(r3)
                int r3 = r4.mo10233a()
                r2.mo10171c0(r3)
                r4.mo10235d(r2)
                r3 = 4
                r2.mo10169a0(r0, r3)
                return
        }

        @Override // p221m9.AbstractC4463k
        /* renamed from: Y */
        public final void mo10167Y(int r4, p221m9.AbstractC4454h r5) {
                r3 = this;
                r0 = 1
                r1 = 3
                r3.mo10169a0(r0, r1)
                r2 = 2
                r3.mo10170b0(r2, r4)
                r3.mo10158P(r1, r5)
                r4 = 4
                r3.mo10169a0(r0, r4)
                return
        }

        @Override // p221m9.AbstractC4463k
        /* renamed from: Z */
        public final void mo10168Z(int r1, java.lang.String r2) {
                r0 = this;
                int r1 = r1 << 3
                r1 = r1 | 2
                r0.mo10171c0(r1)
                r0.m10176h0(r2)
                return
        }

        @Override // p221m9.AbstractC4463k
        /* renamed from: a0 */
        public final void mo10169a0(int r1, int r2) {
                r0 = this;
                int r1 = r1 << 3
                r1 = r1 | r2
                r0.mo10171c0(r1)
                return
        }

        @Override // p221m9.AbstractC4463k
        /* renamed from: b0 */
        public final void mo10170b0(int r1, int r2) {
                r0 = this;
                int r1 = r1 << 3
                r1 = r1 | 0
                r0.mo10171c0(r1)
                r0.mo10171c0(r2)
                return
        }

        @Override // p221m9.AbstractC4463k
        /* renamed from: c0 */
        public final void mo10171c0(int r5) {
                r4 = this;
                boolean r0 = p221m9.AbstractC4463k.f18183c
                if (r0 == 0) goto Lab
                boolean r0 = p221m9.C4442d.m9915a()
                if (r0 != 0) goto Lab
                int r0 = r4.mo10155M()
                r1 = 5
                if (r0 < r1) goto Lab
                r0 = r5 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto L23
                byte[] r0 = r4.f18185d
                int r1 = r4.f18187f
                int r2 = r1 + 1
                r4.f18187f = r2
                long r1 = (long) r1
                byte r5 = (byte) r5
                p221m9.C4483q1.m10253q(r0, r1, r5)
                return
            L23:
                byte[] r0 = r4.f18185d
                int r1 = r4.f18187f
                int r2 = r1 + 1
                r4.f18187f = r2
                long r1 = (long) r1
                r3 = r5 | 128(0x80, float:1.8E-43)
                byte r3 = (byte) r3
                p221m9.C4483q1.m10253q(r0, r1, r3)
                int r5 = r5 >>> 7
                r0 = r5 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto L46
                byte[] r0 = r4.f18185d
                int r1 = r4.f18187f
                int r2 = r1 + 1
                r4.f18187f = r2
                long r1 = (long) r1
                byte r5 = (byte) r5
                p221m9.C4483q1.m10253q(r0, r1, r5)
                return
            L46:
                byte[] r0 = r4.f18185d
                int r1 = r4.f18187f
                int r2 = r1 + 1
                r4.f18187f = r2
                long r1 = (long) r1
                r3 = r5 | 128(0x80, float:1.8E-43)
                byte r3 = (byte) r3
                p221m9.C4483q1.m10253q(r0, r1, r3)
                int r5 = r5 >>> 7
                r0 = r5 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto L69
                byte[] r0 = r4.f18185d
                int r1 = r4.f18187f
                int r2 = r1 + 1
                r4.f18187f = r2
                long r1 = (long) r1
                byte r5 = (byte) r5
                p221m9.C4483q1.m10253q(r0, r1, r5)
                return
            L69:
                byte[] r0 = r4.f18185d
                int r1 = r4.f18187f
                int r2 = r1 + 1
                r4.f18187f = r2
                long r1 = (long) r1
                r3 = r5 | 128(0x80, float:1.8E-43)
                byte r3 = (byte) r3
                p221m9.C4483q1.m10253q(r0, r1, r3)
                int r5 = r5 >>> 7
                r0 = r5 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto L8c
                byte[] r0 = r4.f18185d
                int r1 = r4.f18187f
                int r2 = r1 + 1
                r4.f18187f = r2
                long r1 = (long) r1
                byte r5 = (byte) r5
                p221m9.C4483q1.m10253q(r0, r1, r5)
                return
            L8c:
                byte[] r0 = r4.f18185d
                int r1 = r4.f18187f
                int r2 = r1 + 1
                r4.f18187f = r2
                long r1 = (long) r1
                r3 = r5 | 128(0x80, float:1.8E-43)
                byte r3 = (byte) r3
                p221m9.C4483q1.m10253q(r0, r1, r3)
                int r5 = r5 >>> 7
                byte[] r0 = r4.f18185d
                int r1 = r4.f18187f
                int r2 = r1 + 1
                r4.f18187f = r2
                long r1 = (long) r1
                byte r5 = (byte) r5
                p221m9.C4483q1.m10253q(r0, r1, r5)
                return
            Lab:
                r0 = r5 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto Lbb
                byte[] r0 = r4.f18185d     // Catch: java.lang.IndexOutOfBoundsException -> Lcd
                int r1 = r4.f18187f     // Catch: java.lang.IndexOutOfBoundsException -> Lcd
                int r2 = r1 + 1
                r4.f18187f = r2     // Catch: java.lang.IndexOutOfBoundsException -> Lcd
                byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> Lcd
                r0[r1] = r5     // Catch: java.lang.IndexOutOfBoundsException -> Lcd
                return
            Lbb:
                byte[] r0 = r4.f18185d     // Catch: java.lang.IndexOutOfBoundsException -> Lcd
                int r1 = r4.f18187f     // Catch: java.lang.IndexOutOfBoundsException -> Lcd
                int r2 = r1 + 1
                r4.f18187f = r2     // Catch: java.lang.IndexOutOfBoundsException -> Lcd
                r2 = r5 & 127(0x7f, float:1.78E-43)
                r2 = r2 | 128(0x80, float:1.8E-43)
                byte r2 = (byte) r2     // Catch: java.lang.IndexOutOfBoundsException -> Lcd
                r0[r1] = r2     // Catch: java.lang.IndexOutOfBoundsException -> Lcd
                int r5 = r5 >>> 7
                goto Lab
            Lcd:
                r5 = move-exception
                m9.k$c r0 = new m9.k$c
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                int r3 = r4.f18187f
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                int r2 = r4.f18186e
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 1
                r1[r3] = r2
                r2 = 2
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                java.lang.String r2 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1, r5)
                throw r0
        }

        @Override // p221m9.AbstractC4463k
        /* renamed from: d0 */
        public final void mo10172d0(int r1, long r2) {
                r0 = this;
                int r1 = r1 << 3
                r1 = r1 | 0
                r0.mo10171c0(r1)
                r0.mo10173e0(r2)
                return
        }

        @Override // p221m9.AbstractC4463k
        /* renamed from: e0 */
        public final void mo10173e0(long r10) {
                r9 = this;
                boolean r0 = p221m9.AbstractC4463k.f18183c
                r1 = 7
                r2 = 0
                r4 = -128(0xffffffffffffff80, double:NaN)
                if (r0 == 0) goto L3a
                int r0 = r9.mo10155M()
                r6 = 10
                if (r0 < r6) goto L3a
            L11:
                long r6 = r10 & r4
                int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r0 != 0) goto L26
                byte[] r0 = r9.f18185d
                int r1 = r9.f18187f
                int r2 = r1 + 1
                r9.f18187f = r2
                long r1 = (long) r1
                int r11 = (int) r10
                byte r10 = (byte) r11
                p221m9.C4483q1.m10253q(r0, r1, r10)
                return
            L26:
                byte[] r0 = r9.f18185d
                int r6 = r9.f18187f
                int r7 = r6 + 1
                r9.f18187f = r7
                long r6 = (long) r6
                int r8 = (int) r10
                r8 = r8 & 127(0x7f, float:1.78E-43)
                r8 = r8 | 128(0x80, float:1.8E-43)
                byte r8 = (byte) r8
                p221m9.C4483q1.m10253q(r0, r6, r8)
                long r10 = r10 >>> r1
                goto L11
            L3a:
                long r6 = r10 & r4
                int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r0 != 0) goto L4d
                byte[] r0 = r9.f18185d     // Catch: java.lang.IndexOutOfBoundsException -> L5f
                int r1 = r9.f18187f     // Catch: java.lang.IndexOutOfBoundsException -> L5f
                int r2 = r1 + 1
                r9.f18187f = r2     // Catch: java.lang.IndexOutOfBoundsException -> L5f
                int r11 = (int) r10     // Catch: java.lang.IndexOutOfBoundsException -> L5f
                byte r10 = (byte) r11     // Catch: java.lang.IndexOutOfBoundsException -> L5f
                r0[r1] = r10     // Catch: java.lang.IndexOutOfBoundsException -> L5f
                return
            L4d:
                byte[] r0 = r9.f18185d     // Catch: java.lang.IndexOutOfBoundsException -> L5f
                int r6 = r9.f18187f     // Catch: java.lang.IndexOutOfBoundsException -> L5f
                int r7 = r6 + 1
                r9.f18187f = r7     // Catch: java.lang.IndexOutOfBoundsException -> L5f
                int r7 = (int) r10     // Catch: java.lang.IndexOutOfBoundsException -> L5f
                r7 = r7 & 127(0x7f, float:1.78E-43)
                r7 = r7 | 128(0x80, float:1.8E-43)
                byte r7 = (byte) r7     // Catch: java.lang.IndexOutOfBoundsException -> L5f
                r0[r6] = r7     // Catch: java.lang.IndexOutOfBoundsException -> L5f
                long r10 = r10 >>> r1
                goto L3a
            L5f:
                r10 = move-exception
                m9.k$c r11 = new m9.k$c
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                int r2 = r9.f18187f
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r1] = r2
                int r1 = r9.f18186e
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 1
                r0[r2] = r1
                r1 = 2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r1] = r2
                java.lang.String r1 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                r11.<init>(r0, r10)
                throw r11
        }

        /* renamed from: f0 */
        public final void m10174f0(byte[] r4, int r5, int r6) {
                r3 = this;
                byte[] r0 = r3.f18185d     // Catch: java.lang.IndexOutOfBoundsException -> Ld
                int r1 = r3.f18187f     // Catch: java.lang.IndexOutOfBoundsException -> Ld
                java.lang.System.arraycopy(r4, r5, r0, r1, r6)     // Catch: java.lang.IndexOutOfBoundsException -> Ld
                int r4 = r3.f18187f     // Catch: java.lang.IndexOutOfBoundsException -> Ld
                int r4 = r4 + r6
                r3.f18187f = r4     // Catch: java.lang.IndexOutOfBoundsException -> Ld
                return
            Ld:
                r4 = move-exception
                m9.k$c r5 = new m9.k$c
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                int r2 = r3.f18187f
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r1] = r2
                r1 = 1
                int r2 = r3.f18186e
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r1] = r2
                r1 = 2
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r0[r1] = r6
                java.lang.String r6 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r6 = java.lang.String.format(r6, r0)
                r5.<init>(r6, r4)
                throw r5
        }

        /* renamed from: g0 */
        public final void m10175g0(p221m9.AbstractC4454h r2) {
                r1 = this;
                int r0 = r2.size()
                r1.mo10171c0(r0)
                r2.mo10055A(r1)
                return
        }

        /* renamed from: h0 */
        public final void m10176h0(java.lang.String r7) {
                r6 = this;
                int r0 = r6.f18187f
                int r1 = r7.length()     // Catch: java.lang.IndexOutOfBoundsException -> L47 p221m9.C4486r1.d -> L4e
                int r1 = r1 * 3
                int r1 = p221m9.AbstractC4463k.m10133H(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L47 p221m9.C4486r1.d -> L4e
                int r2 = r7.length()     // Catch: java.lang.IndexOutOfBoundsException -> L47 p221m9.C4486r1.d -> L4e
                int r2 = p221m9.AbstractC4463k.m10133H(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L47 p221m9.C4486r1.d -> L4e
                if (r2 != r1) goto L2f
                int r1 = r0 + r2
                r6.f18187f = r1     // Catch: java.lang.IndexOutOfBoundsException -> L47 p221m9.C4486r1.d -> L4e
                byte[] r3 = r6.f18185d     // Catch: java.lang.IndexOutOfBoundsException -> L47 p221m9.C4486r1.d -> L4e
                int r4 = r6.mo10155M()     // Catch: java.lang.IndexOutOfBoundsException -> L47 p221m9.C4486r1.d -> L4e
                m9.r1$b r5 = p221m9.C4486r1.f18221a     // Catch: java.lang.IndexOutOfBoundsException -> L47 p221m9.C4486r1.d -> L4e
                int r1 = r5.mo10292b(r7, r3, r1, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L47 p221m9.C4486r1.d -> L4e
                r6.f18187f = r0     // Catch: java.lang.IndexOutOfBoundsException -> L47 p221m9.C4486r1.d -> L4e
                int r3 = r1 - r0
                int r3 = r3 - r2
                r6.mo10171c0(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L47 p221m9.C4486r1.d -> L4e
                goto L44
            L2f:
                int r1 = p221m9.C4486r1.m10283c(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L47 p221m9.C4486r1.d -> L4e
                r6.mo10171c0(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L47 p221m9.C4486r1.d -> L4e
                byte[] r1 = r6.f18185d     // Catch: java.lang.IndexOutOfBoundsException -> L47 p221m9.C4486r1.d -> L4e
                int r2 = r6.f18187f     // Catch: java.lang.IndexOutOfBoundsException -> L47 p221m9.C4486r1.d -> L4e
                int r3 = r6.mo10155M()     // Catch: java.lang.IndexOutOfBoundsException -> L47 p221m9.C4486r1.d -> L4e
                m9.r1$b r4 = p221m9.C4486r1.f18221a     // Catch: java.lang.IndexOutOfBoundsException -> L47 p221m9.C4486r1.d -> L4e
                int r1 = r4.mo10292b(r7, r1, r2, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L47 p221m9.C4486r1.d -> L4e
            L44:
                r6.f18187f = r1     // Catch: java.lang.IndexOutOfBoundsException -> L47 p221m9.C4486r1.d -> L4e
                goto L69
            L47:
                r7 = move-exception
                m9.k$c r0 = new m9.k$c
                r0.<init>(r7)
                throw r0
            L4e:
                r1 = move-exception
                r6.f18187f = r0
                java.util.logging.Logger r0 = p221m9.AbstractC4463k.f18182b
                java.util.logging.Level r2 = java.util.logging.Level.WARNING
                java.lang.String r3 = "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"
                r0.log(r2, r3, r1)
                java.nio.charset.Charset r0 = p221m9.C4505z.f18308a
                byte[] r7 = r7.getBytes(r0)
                int r0 = r7.length     // Catch: p221m9.AbstractC4463k.c -> L6a java.lang.IndexOutOfBoundsException -> L6c
                r6.mo10171c0(r0)     // Catch: p221m9.AbstractC4463k.c -> L6a java.lang.IndexOutOfBoundsException -> L6c
                r0 = 0
                int r1 = r7.length     // Catch: p221m9.AbstractC4463k.c -> L6a java.lang.IndexOutOfBoundsException -> L6c
                r6.m10174f0(r7, r0, r1)     // Catch: p221m9.AbstractC4463k.c -> L6a java.lang.IndexOutOfBoundsException -> L6c
            L69:
                return
            L6a:
                r7 = move-exception
                throw r7
            L6c:
                r7 = move-exception
                m9.k$c r0 = new m9.k$c
                r0.<init>(r7)
                throw r0
        }
    }

    /* renamed from: m9.k$c */
    public static class c extends java.io.IOException {
        public c(java.lang.String r2, java.lang.Throwable r3) {
                r1 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                java.lang.String r2 = p064e.C1493g.m4049a(r0, r2)
                r1.<init>(r2, r3)
                return
        }

        public c(java.lang.Throwable r2) {
                r1 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space."
                r1.<init>(r0, r2)
                return
        }
    }

    static {
            java.lang.Class<m9.k> r0 = p221m9.AbstractC4463k.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            p221m9.AbstractC4463k.f18182b = r0
            boolean r0 = p221m9.C4483q1.f18217h
            p221m9.AbstractC4463k.f18183c = r0
            return
    }

    public AbstractC4463k() {
            r1 = this;
            r0 = 2
            r1.<init>(r0)
            return
    }

    public AbstractC4463k(p221m9.AbstractC4463k.a r1) {
            r0 = this;
            r1 = 2
            r0.<init>(r1)
            return
    }

    /* renamed from: A */
    public static int m10126A(int r0) {
            int r0 = m10136K(r0)
            int r0 = m10133H(r0)
            return r0
    }

    /* renamed from: B */
    public static int m10127B(int r0, long r1) {
            int r0 = m10131F(r0)
            int r1 = m10128C(r1)
            int r1 = r1 + r0
            return r1
    }

    /* renamed from: C */
    public static int m10128C(long r0) {
            long r0 = m10137L(r0)
            int r0 = m10135J(r0)
            return r0
    }

    /* renamed from: D */
    public static int m10129D(int r0, java.lang.String r1) {
            int r0 = m10131F(r0)
            int r1 = m10130E(r1)
            int r1 = r1 + r0
            return r1
    }

    /* renamed from: E */
    public static int m10130E(java.lang.String r1) {
            int r1 = p221m9.C4486r1.m10283c(r1)     // Catch: p221m9.C4486r1.d -> L5
            goto Lc
        L5:
            java.nio.charset.Charset r0 = p221m9.C4505z.f18308a
            byte[] r1 = r1.getBytes(r0)
            int r1 = r1.length
        Lc:
            int r1 = m10151w(r1)
            return r1
    }

    /* renamed from: F */
    public static int m10131F(int r0) {
            int r0 = r0 << 3
            r0 = r0 | 0
            int r0 = m10133H(r0)
            return r0
    }

    /* renamed from: G */
    public static int m10132G(int r0, int r1) {
            int r0 = m10131F(r0)
            int r1 = m10133H(r1)
            int r1 = r1 + r0
            return r1
    }

    /* renamed from: H */
    public static int m10133H(int r1) {
            r0 = r1 & (-128(0xffffffffffffff80, float:NaN))
            if (r0 != 0) goto L6
            r1 = 1
            return r1
        L6:
            r0 = r1 & (-16384(0xffffffffffffc000, float:NaN))
            if (r0 != 0) goto Lc
            r1 = 2
            return r1
        Lc:
            r0 = -2097152(0xffffffffffe00000, float:NaN)
            r0 = r0 & r1
            if (r0 != 0) goto L13
            r1 = 3
            return r1
        L13:
            r0 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r1 = r1 & r0
            if (r1 != 0) goto L1a
            r1 = 4
            return r1
        L1a:
            r1 = 5
            return r1
    }

    /* renamed from: I */
    public static int m10134I(int r0, long r1) {
            int r0 = m10131F(r0)
            int r1 = m10135J(r1)
            int r1 = r1 + r0
            return r1
    }

    /* renamed from: J */
    public static int m10135J(long r6) {
            r0 = -128(0xffffffffffffff80, double:NaN)
            long r0 = r0 & r6
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            r6 = 1
            return r6
        Lb:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L12
            r6 = 10
            return r6
        L12:
            r0 = -34359738368(0xfffffff800000000, double:NaN)
            long r0 = r0 & r6
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L21
            r0 = 6
            r1 = 28
            long r6 = r6 >>> r1
            goto L22
        L21:
            r0 = 2
        L22:
            r4 = -2097152(0xffffffffffe00000, double:NaN)
            long r4 = r4 & r6
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L2f
            int r0 = r0 + 2
            r1 = 14
            long r6 = r6 >>> r1
        L2f:
            r4 = -16384(0xffffffffffffc000, double:NaN)
            long r6 = r6 & r4
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 == 0) goto L38
            int r0 = r0 + 1
        L38:
            return r0
    }

    /* renamed from: K */
    public static int m10136K(int r1) {
            int r0 = r1 << 1
            int r1 = r1 >> 31
            r1 = r1 ^ r0
            return r1
    }

    /* renamed from: L */
    public static long m10137L(long r3) {
            r0 = 1
            long r0 = r3 << r0
            r2 = 63
            long r3 = r3 >> r2
            long r3 = r3 ^ r0
            return r3
    }

    /* renamed from: j */
    public static int m10138j(int r0, boolean r1) {
            int r0 = m10131F(r0)
            int r0 = r0 + 1
            return r0
    }

    /* renamed from: k */
    public static int m10139k(int r0, p221m9.AbstractC4454h r1) {
            int r0 = m10131F(r0)
            int r1 = r1.size()
            int r1 = m10151w(r1)
            int r0 = r0 + r1
            return r0
    }

    /* renamed from: l */
    public static int m10140l(p221m9.AbstractC4454h r0) {
            int r0 = r0.size()
            int r0 = m10151w(r0)
            return r0
    }

    /* renamed from: m */
    public static int m10141m(int r0, double r1) {
            int r0 = m10131F(r0)
            int r0 = r0 + 8
            return r0
    }

    /* renamed from: n */
    public static int m10142n(int r0, int r1) {
            int r0 = m10131F(r0)
            int r1 = m10148t(r1)
            int r0 = r0 + r1
            return r0
    }

    /* renamed from: o */
    public static int m10143o(int r0, int r1) {
            int r0 = m10131F(r0)
            int r0 = r0 + 4
            return r0
    }

    /* renamed from: p */
    public static int m10144p(int r0, long r1) {
            int r0 = m10131F(r0)
            int r0 = r0 + 8
            return r0
    }

    /* renamed from: q */
    public static int m10145q(int r0, float r1) {
            int r0 = m10131F(r0)
            int r0 = r0 + 4
            return r0
    }

    @java.lang.Deprecated
    /* renamed from: r */
    public static int m10146r(int r0, p221m9.InterfaceC4482q0 r1, p221m9.InterfaceC4447e1 r2) {
            int r0 = m10131F(r0)
            int r0 = r0 * 2
            m9.a r1 = (p221m9.AbstractC4433a) r1
            int r1 = r1.m9892i(r2)
            int r0 = r0 + r1
            return r0
    }

    /* renamed from: s */
    public static int m10147s(int r0, int r1) {
            int r0 = m10131F(r0)
            int r1 = m10148t(r1)
            int r1 = r1 + r0
            return r1
    }

    /* renamed from: t */
    public static int m10148t(int r0) {
            if (r0 < 0) goto L7
            int r0 = m10133H(r0)
            return r0
        L7:
            r0 = 10
            return r0
    }

    /* renamed from: u */
    public static int m10149u(int r0, long r1) {
            int r0 = m10131F(r0)
            int r1 = m10135J(r1)
            int r0 = r0 + r1
            return r0
    }

    /* renamed from: v */
    public static int m10150v(p221m9.C4443d0 r1) {
            m9.h r0 = r1.f18121b
            if (r0 == 0) goto Lb
            m9.h r1 = r1.f18121b
            int r1 = r1.size()
            goto L17
        Lb:
            m9.q0 r0 = r1.f18120a
            if (r0 == 0) goto L16
            m9.q0 r1 = r1.f18120a
            int r1 = r1.mo10233a()
            goto L17
        L16:
            r1 = 0
        L17:
            int r1 = m10151w(r1)
            return r1
    }

    /* renamed from: w */
    public static int m10151w(int r1) {
            int r0 = m10133H(r1)
            int r0 = r0 + r1
            return r0
    }

    /* renamed from: x */
    public static int m10152x(int r0, int r1) {
            int r0 = m10131F(r0)
            int r0 = r0 + 4
            return r0
    }

    /* renamed from: y */
    public static int m10153y(int r0, long r1) {
            int r0 = m10131F(r0)
            int r0 = r0 + 8
            return r0
    }

    /* renamed from: z */
    public static int m10154z(int r0, int r1) {
            int r0 = m10131F(r0)
            int r1 = m10126A(r1)
            int r1 = r1 + r0
            return r1
    }

    /* renamed from: M */
    public abstract int mo10155M();

    /* renamed from: N */
    public abstract void mo10156N(byte r1);

    /* renamed from: O */
    public abstract void mo10157O(int r1, boolean r2);

    /* renamed from: P */
    public abstract void mo10158P(int r1, p221m9.AbstractC4454h r2);

    /* renamed from: Q */
    public abstract void mo10159Q(int r1, int r2);

    /* renamed from: R */
    public abstract void mo10160R(int r1);

    /* renamed from: S */
    public abstract void mo10161S(int r1, long r2);

    /* renamed from: T */
    public abstract void mo10162T(long r1);

    /* renamed from: U */
    public abstract void mo10163U(int r1, int r2);

    /* renamed from: V */
    public abstract void mo10164V(int r1);

    /* renamed from: W */
    public abstract void mo10165W(int r1, p221m9.InterfaceC4482q0 r2, p221m9.InterfaceC4447e1 r3);

    /* renamed from: X */
    public abstract void mo10166X(int r1, p221m9.InterfaceC4482q0 r2);

    /* renamed from: Y */
    public abstract void mo10167Y(int r1, p221m9.AbstractC4454h r2);

    /* renamed from: Z */
    public abstract void mo10168Z(int r1, java.lang.String r2);

    /* renamed from: a0 */
    public abstract void mo10169a0(int r1, int r2);

    /* renamed from: b0 */
    public abstract void mo10170b0(int r1, int r2);

    /* renamed from: c0 */
    public abstract void mo10171c0(int r1);

    /* renamed from: d0 */
    public abstract void mo10172d0(int r1, long r2);

    /* renamed from: e0 */
    public abstract void mo10173e0(long r1);
}
