package p317ri;

/* renamed from: ri.n */
/* loaded from: classes.dex */
public class C5897n extends p317ri.AbstractC5912s {

    /* renamed from: a0 */
    public static final java.util.concurrent.ConcurrentMap<p317ri.C5897n.a, p317ri.C5897n> f22718a0 = null;

    /* renamed from: Y */
    public final java.lang.String f22719Y;

    /* renamed from: Z */
    public byte[] f22720Z;

    /* renamed from: ri.n$a */
    public static class a {

        /* renamed from: a */
        public final int f22721a;

        /* renamed from: b */
        public final byte[] f22722b;

        public a(byte[] r2) {
                r1 = this;
                r1.<init>()
                int r0 = p400wj.C6888a.m13952d(r2)
                r1.f22721a = r0
                r1.f22722b = r2
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof p317ri.C5897n.a
                if (r0 == 0) goto Lf
                byte[] r0 = r1.f22722b
                ri.n$a r2 = (p317ri.C5897n.a) r2
                byte[] r2 = r2.f22722b
                boolean r2 = p400wj.C6888a.m13949a(r0, r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                int r0 = r1.f22721a
                return r0
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p317ri.C5897n.f22718a0 = r0
            return
    }

    public C5897n(java.lang.String r4) {
            r3 = this;
            r3.<init>()
            int r0 = r4.length()
            r1 = 0
            r2 = 3
            if (r0 < r2) goto L27
            r0 = 1
            char r0 = r4.charAt(r0)
            r2 = 46
            if (r0 == r2) goto L15
            goto L27
        L15:
            char r0 = r4.charAt(r1)
            r2 = 48
            if (r0 < r2) goto L27
            r2 = 50
            if (r0 <= r2) goto L22
            goto L27
        L22:
            r0 = 2
            boolean r1 = m12250I(r4, r0)
        L27:
            if (r1 == 0) goto L2c
            r3.f22719Y = r4
            return
        L2c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "string "
            java.lang.String r2 = " not an OID"
            java.lang.String r4 = android.support.v4.media.C0145d.m257a(r1, r4, r2)
            r0.<init>(r4)
            throw r0
    }

    public C5897n(p317ri.C5897n r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            boolean r0 = m12250I(r4, r0)
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r3.f22719Y
            java.lang.String r1 = "."
            java.lang.String r3 = p083f.C1932s.m4774a(r0, r3, r1, r4)
            r2.f22719Y = r3
            return
        L1a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "string "
            java.lang.String r1 = " not a valid OID branch"
            java.lang.String r4 = android.support.v4.media.C0145d.m257a(r0, r4, r1)
            r3.<init>(r4)
            throw r3
    }

    public C5897n(byte[] r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            r19.<init>()
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r3 = 1
            r6 = 0
            r9 = r6
            r8 = 0
            r11 = 0
        L12:
            int r12 = r1.length
            if (r8 == r12) goto L8d
            r12 = r1[r8]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r13 = 72057594037927808(0xffffffffffff80, double:7.291122019556294E-304)
            r15 = 50
            r4 = 46
            r5 = 7
            r16 = 80
            int r18 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r18 > 0) goto L5a
            r13 = r12 & 127(0x7f, float:1.78E-43)
            long r13 = (long) r13
            long r9 = r9 + r13
            r12 = r12 & 128(0x80, float:1.8E-43)
            if (r12 != 0) goto L58
            if (r3 == 0) goto L50
            r12 = 40
            int r3 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r3 >= 0) goto L3f
            r3 = 48
            r2.append(r3)
            goto L4f
        L3f:
            int r3 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r3 >= 0) goto L4a
            r3 = 49
            r2.append(r3)
            long r9 = r9 - r12
            goto L4f
        L4a:
            r2.append(r15)
            long r9 = r9 - r16
        L4f:
            r3 = 0
        L50:
            r2.append(r4)
            r2.append(r9)
            r9 = r6
            goto L8a
        L58:
            long r9 = r9 << r5
            goto L8a
        L5a:
            if (r11 != 0) goto L60
            java.math.BigInteger r11 = java.math.BigInteger.valueOf(r9)
        L60:
            r13 = r12 & 127(0x7f, float:1.78E-43)
            long r13 = (long) r13
            java.math.BigInteger r13 = java.math.BigInteger.valueOf(r13)
            java.math.BigInteger r11 = r11.or(r13)
            r12 = r12 & 128(0x80, float:1.8E-43)
            if (r12 != 0) goto L86
            if (r3 == 0) goto L7d
            r2.append(r15)
            java.math.BigInteger r3 = java.math.BigInteger.valueOf(r16)
            java.math.BigInteger r11 = r11.subtract(r3)
            r3 = 0
        L7d:
            r2.append(r4)
            r2.append(r11)
            r9 = r6
            r11 = 0
            goto L8a
        L86:
            java.math.BigInteger r11 = r11.shiftLeft(r5)
        L8a:
            int r8 = r8 + 1
            goto L12
        L8d:
            java.lang.String r2 = r2.toString()
            r0.f22719Y = r2
            byte[] r1 = p400wj.C6888a.m13951c(r20)
            r0.f22720Z = r1
            return
    }

    /* renamed from: D */
    public static p317ri.C5897n m12248D(byte[] r2) {
            ri.n$a r0 = new ri.n$a
            r0.<init>(r2)
            java.util.concurrent.ConcurrentMap<ri.n$a, ri.n> r1 = p317ri.C5897n.f22718a0
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r0 = r1.get(r0)
            ri.n r0 = (p317ri.C5897n) r0
            if (r0 != 0) goto L16
            ri.n r0 = new ri.n
            r0.<init>(r2)
        L16:
            return r0
    }

    /* renamed from: F */
    public static p317ri.C5897n m12249F(java.lang.Object r2) {
            if (r2 == 0) goto L59
            boolean r0 = r2 instanceof p317ri.C5897n
            if (r0 == 0) goto L7
            goto L59
        L7:
            boolean r0 = r2 instanceof p317ri.InterfaceC5870e
            if (r0 == 0) goto L19
            r0 = r2
            ri.e r0 = (p317ri.InterfaceC5870e) r0
            ri.s r0 = r0.mo168e()
            boolean r1 = r0 instanceof p317ri.C5897n
            if (r1 == 0) goto L19
            ri.n r0 = (p317ri.C5897n) r0
            return r0
        L19:
            boolean r0 = r2 instanceof byte[]
            if (r0 == 0) goto L3e
            byte[] r2 = (byte[]) r2
            ri.s r2 = p317ri.AbstractC5912s.m12271u(r2)     // Catch: java.io.IOException -> L26
            ri.n r2 = (p317ri.C5897n) r2     // Catch: java.io.IOException -> L26
            return r2
        L26:
            r2 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "failed to construct object identifier from byte[]: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = r2.getMessage()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
        L3e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "illegal object in getInstance: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
        L59:
            ri.n r2 = (p317ri.C5897n) r2
            return r2
    }

    /* renamed from: I */
    public static boolean m12250I(java.lang.String r5, int r6) {
            int r0 = r5.length()
            r1 = 0
        L5:
            r2 = 0
        L6:
            int r0 = r0 + (-1)
            if (r0 < r6) goto L1f
            char r3 = r5.charAt(r0)
            r4 = 48
            if (r4 > r3) goto L18
            r4 = 57
            if (r3 > r4) goto L18
            r2 = 1
            goto L6
        L18:
            r4 = 46
            if (r3 != r4) goto L1e
            if (r2 != 0) goto L5
        L1e:
            return r1
        L1f:
            return r2
    }

    /* renamed from: C */
    public final void m12251C(java.io.ByteArrayOutputStream r8) {
            r7 = this;
            ha.b r0 = new ha.b
            java.lang.String r1 = r7.f22719Y
            r0.<init>(r1)
            java.lang.String r1 = r0.m7367b()
            int r1 = java.lang.Integer.parseInt(r1)
            int r1 = r1 * 40
            java.lang.String r2 = r0.m7367b()
            int r3 = r2.length()
            r4 = 18
            if (r3 > r4) goto L26
            long r5 = (long) r1
            long r1 = java.lang.Long.parseLong(r2)
            long r1 = r1 + r5
            r2 = r1
            r1 = r7
            goto L50
        L26:
            java.math.BigInteger r3 = new java.math.BigInteger
            r3.<init>(r2)
            long r1 = (long) r1
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            java.math.BigInteger r1 = r3.add(r1)
            r7.m12255L(r8, r1)
            r1 = r7
        L38:
            int r2 = r0.f12087a
            r3 = -1
            if (r2 == r3) goto L3f
            r2 = 1
            goto L40
        L3f:
            r2 = 0
        L40:
            if (r2 == 0) goto L5d
            java.lang.String r2 = r0.m7367b()
            int r3 = r2.length()
            if (r3 > r4) goto L54
            long r2 = java.lang.Long.parseLong(r2)
        L50:
            r1.m12254K(r8, r2)
            goto L38
        L54:
            java.math.BigInteger r3 = new java.math.BigInteger
            r3.<init>(r2)
            r1.m12255L(r8, r3)
            goto L38
        L5d:
            return
    }

    /* renamed from: E */
    public final synchronized byte[] m12252E() {
            r1 = this;
            monitor-enter(r1)
            byte[] r0 = r1.f22720Z     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L13
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
            r1.m12251C(r0)     // Catch: java.lang.Throwable -> L17
            byte[] r0 = r0.toByteArray()     // Catch: java.lang.Throwable -> L17
            r1.f22720Z = r0     // Catch: java.lang.Throwable -> L17
        L13:
            byte[] r0 = r1.f22720Z     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    /* renamed from: H */
    public p317ri.C5897n m12253H() {
            r3 = this;
            ri.n$a r0 = new ri.n$a
            byte[] r1 = r3.m12252E()
            r0.<init>(r1)
            java.util.concurrent.ConcurrentMap<ri.n$a, ri.n> r1 = p317ri.C5897n.f22718a0
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r2 = r1.get(r0)
            ri.n r2 = (p317ri.C5897n) r2
            if (r2 != 0) goto L1f
            java.lang.Object r0 = r1.putIfAbsent(r0, r3)
            r2 = r0
            ri.n r2 = (p317ri.C5897n) r2
            if (r2 != 0) goto L1f
            r2 = r3
        L1f:
            return r2
    }

    /* renamed from: K */
    public final void m12254K(java.io.ByteArrayOutputStream r6, long r7) {
            r5 = this;
            r0 = 9
            byte[] r0 = new byte[r0]
            int r1 = (int) r7
            r1 = r1 & 127(0x7f, float:1.78E-43)
            byte r1 = (byte) r1
            r2 = 8
            r0[r2] = r1
        Lc:
            r3 = 128(0x80, double:6.3E-322)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 < 0) goto L1f
            r1 = 7
            long r7 = r7 >> r1
            int r2 = r2 + (-1)
            int r1 = (int) r7
            r1 = r1 & 127(0x7f, float:1.78E-43)
            r1 = r1 | 128(0x80, float:1.8E-43)
            byte r1 = (byte) r1
            r0[r2] = r1
            goto Lc
        L1f:
            int r7 = 9 - r2
            r6.write(r0, r2, r7)
            return
    }

    /* renamed from: L */
    public final void m12255L(java.io.ByteArrayOutputStream r8, java.math.BigInteger r9) {
            r7 = this;
            int r0 = r9.bitLength()
            int r0 = r0 + 6
            r1 = 7
            int r0 = r0 / r1
            r2 = 0
            if (r0 != 0) goto Lf
            r8.write(r2)
            goto L32
        Lf:
            byte[] r3 = new byte[r0]
            int r4 = r0 + (-1)
            r5 = r4
        L14:
            if (r5 < 0) goto L28
            int r6 = r9.intValue()
            r6 = r6 & 127(0x7f, float:1.78E-43)
            r6 = r6 | 128(0x80, float:1.8E-43)
            byte r6 = (byte) r6
            r3[r5] = r6
            java.math.BigInteger r9 = r9.shiftRight(r1)
            int r5 = r5 + (-1)
            goto L14
        L28:
            r9 = r3[r4]
            r9 = r9 & 127(0x7f, float:1.78E-43)
            byte r9 = (byte) r9
            r3[r4] = r9
            r8.write(r3, r2, r0)
        L32:
            return
    }

    @Override // p317ri.AbstractC5894m
    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f22719Y
            int r0 = r0.hashCode()
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: n */
    public boolean mo12203n(p317ri.AbstractC5912s r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p317ri.C5897n
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            java.lang.String r0 = r1.f22719Y
            ri.n r2 = (p317ri.C5897n) r2
            java.lang.String r2 = r2.f22719Y
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: p */
    public void mo12204p(p317ri.C5906q r3) {
            r2 = this;
            byte[] r0 = r2.m12252E()
            r1 = 6
            r3.mo12264c(r1)
            int r1 = r0.length
            r3.m12268g(r1)
            java.io.OutputStream r3 = r3.f22730a
            r3.write(r0)
            return
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: q */
    public int mo12205q() {
            r2 = this;
            byte[] r0 = r2.m12252E()
            int r0 = r0.length
            int r1 = p317ri.C5923v1.m12290a(r0)
            int r1 = r1 + 1
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f22719Y
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: w */
    public boolean mo12206w() {
            r1 = this;
            r0 = 0
            return r0
    }
}
