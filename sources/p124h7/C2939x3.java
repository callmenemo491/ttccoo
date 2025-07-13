package p124h7;

/* renamed from: h7.x3 */
/* loaded from: classes.dex */
public /* synthetic */ class C2939x3 {
    /* renamed from: A */
    public static int m7251A(p365v.C6476c r5) {
            java.lang.String r0 = "runtime.counter"
            k7.o r1 = r5.m13119k(r0)
            java.lang.Double r1 = r1.mo8355g()
            double r1 = r1.doubleValue()
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r1 = r1 + r3
            int r1 = m7296v(r1)
            r2 = 1000000(0xf4240, float:1.401298E-39)
            if (r1 > r2) goto L28
            k7.g r2 = new k7.g
            double r3 = (double) r1
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r2.<init>(r3)
            r5.m13121m(r0, r2)
            return r1
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Instructions allowed exceeded"
            r5.<init>(r0)
            throw r5
    }

    /* renamed from: B */
    public static byte[] m7252B(byte[]... r7) {
            int r0 = r7.length
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            if (r2 >= r0) goto L1b
            r4 = r7[r2]
            int r4 = r4.length
            r5 = 2147483647(0x7fffffff, float:NaN)
            int r5 = r5 - r4
            if (r3 > r5) goto L13
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L4
        L13:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r0 = "exceeded size limit"
            r7.<init>(r0)
            throw r7
        L1b:
            byte[] r0 = new byte[r3]
            int r2 = r7.length
            r3 = 0
            r4 = 0
        L20:
            if (r3 >= r2) goto L2c
            r5 = r7[r3]
            int r6 = r5.length
            java.lang.System.arraycopy(r5, r1, r0, r4, r6)
            int r4 = r4 + r6
            int r3 = r3 + 1
            goto L20
        L2c:
            return r0
    }

    /* renamed from: C */
    public static int m7253C(p185k7.InterfaceC3950q7 r6, byte[] r7, int r8, int r9, p124h7.C2915vf r10) {
            int r0 = r8 + 1
            r8 = r7[r8]
            if (r8 >= 0) goto Lc
            int r0 = m7269S(r8, r7, r0, r10)
            int r8 = r10.f11968a
        Lc:
            r3 = r0
            if (r8 < 0) goto L25
            int r9 = r9 - r3
            if (r8 > r9) goto L25
            java.lang.Object r9 = r6.mo8685d()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo8690i(r1, r2, r3, r4, r5)
            r6.mo8684c(r9)
            r10.f11970c = r9
            return r8
        L25:
            k7.m6 r6 = p185k7.C3897m6.m8829d()
            throw r6
    }

    /* renamed from: D */
    public static long m7254D(double r2) {
            int r2 = m7296v(r2)
            long r2 = (long) r2
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            return r2
    }

    /* renamed from: E */
    public static final byte[] m7255E(byte[] r2, byte[] r3) {
            int r0 = r2.length
            int r1 = r3.length
            if (r0 != r1) goto La
            r1 = 0
            byte[] r2 = m7258H(r2, r1, r3, r1, r0)
            return r2
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The lengths of x and y should match."
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: F */
    public static int m7256F(p185k7.InterfaceC3950q7<?> r2, int r3, byte[] r4, int r5, int r6, p185k7.InterfaceC3857j6<?> r7, p124h7.C2915vf r8) {
            int r5 = m7253C(r2, r4, r5, r6, r8)
        L4:
            java.lang.Object r0 = r8.f11970c
            r7.add(r0)
            if (r5 >= r6) goto L19
            int r0 = m7267Q(r4, r5, r8)
            int r1 = r8.f11968a
            if (r3 == r1) goto L14
            goto L19
        L14:
            int r5 = m7253C(r2, r4, r0, r6, r8)
            goto L4
        L19:
            return r5
    }

    /* renamed from: G */
    public static p185k7.EnumC3739b0 m7257G(java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto L1b
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L1b
            int r0 = java.lang.Integer.parseInt(r3)
            java.util.Map<java.lang.Integer, k7.b0> r1 = p185k7.EnumC3739b0.f16510j1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r0 = r1.get(r0)
            k7.b0 r0 = (p185k7.EnumC3739b0) r0
        L1b:
            if (r0 == 0) goto L1e
            return r0
        L1e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.String r3 = "Unsupported commandId %s"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.<init>(r3)
            throw r0
    }

    /* renamed from: H */
    public static final byte[] m7258H(byte[] r4, int r5, byte[] r6, int r7, int r8) {
            int r0 = r4.length
            int r0 = r0 - r8
            if (r0 < r5) goto L1d
            int r0 = r6.length
            int r0 = r0 - r8
            if (r0 < r7) goto L1d
            byte[] r0 = new byte[r8]
            r1 = 0
        Lb:
            if (r1 >= r8) goto L1c
            int r2 = r1 + r5
            r2 = r4[r2]
            int r3 = r1 + r7
            r3 = r6[r3]
            r2 = r2 ^ r3
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto Lb
        L1c:
            return r0
        L1d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "That combination of buffers, offsets and length to xor result in out-of-bond accesses."
            r4.<init>(r5)
            throw r4
    }

    /* renamed from: I */
    public static int m7259I(byte[] r2, int r3, p185k7.InterfaceC3857j6<?> r4, p124h7.C2915vf r5) {
            k7.f6 r4 = (p185k7.C3801f6) r4
            int r3 = m7267Q(r2, r3, r5)
            int r0 = r5.f11968a
            int r0 = r0 + r3
        L9:
            if (r3 >= r0) goto L15
            int r3 = m7267Q(r2, r3, r5)
            int r1 = r5.f11968a
            r4.m8538i(r1)
            goto L9
        L15:
            if (r3 != r0) goto L18
            return r3
        L18:
            k7.m6 r2 = p185k7.C3897m6.m8829d()
            throw r2
    }

    /* renamed from: J */
    public static java.lang.Object m7260J(p185k7.InterfaceC3916o r2) {
            k7.o r0 = p185k7.InterfaceC3916o.f16783H
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto La
            r2 = 0
            return r2
        La:
            k7.o r0 = p185k7.InterfaceC3916o.f16782G
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L15
            java.lang.String r2 = ""
            return r2
        L15:
            boolean r0 = r2 instanceof p185k7.C3877l
            if (r0 == 0) goto L20
            k7.l r2 = (p185k7.C3877l) r2
            java.util.Map r2 = m7262L(r2)
            return r2
        L20:
            boolean r0 = r2 instanceof p185k7.C3766d
            if (r0 == 0) goto L4a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            k7.d r2 = (p185k7.C3766d) r2
            java.util.Objects.requireNonNull(r2)
            k7.q r1 = new k7.q
            r1.<init>(r2)
        L33:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r1.next()
            k7.o r2 = (p185k7.InterfaceC3916o) r2
            java.lang.Object r2 = m7260J(r2)
            if (r2 == 0) goto L33
            r0.add(r2)
            goto L33
        L49:
            return r0
        L4a:
            java.lang.Double r0 = r2.mo8355g()
            boolean r0 = r0.isNaN()
            if (r0 != 0) goto L59
            java.lang.Double r2 = r2.mo8355g()
            return r2
        L59:
            java.lang.String r2 = r2.mo8357i()
            return r2
    }

    /* renamed from: K */
    public static int m7261K(byte[] r3, int r4, p124h7.C2915vf r5) {
            int r4 = m7267Q(r3, r4, r5)
            int r0 = r5.f11968a
            if (r0 < 0) goto L1a
            if (r0 != 0) goto Lf
            java.lang.String r3 = ""
            r5.f11970c = r3
            return r4
        Lf:
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = p185k7.C3871k6.f16722a
            r1.<init>(r3, r4, r0, r2)
            r5.f11970c = r1
            int r4 = r4 + r0
            return r4
        L1a:
            k7.m6 r3 = p185k7.C3897m6.m8827b()
            throw r3
    }

    /* renamed from: L */
    public static java.util.Map<java.lang.String, java.lang.Object> m7262L(p185k7.C3877l r4) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Objects.requireNonNull(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Map<java.lang.String, k7.o> r2 = r4.f16729Y
            java.util.Set r2 = r2.keySet()
            r1.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            k7.o r3 = r4.mo8358l(r2)
            java.lang.Object r3 = m7260J(r3)
            if (r3 == 0) goto L17
            r0.put(r2, r3)
            goto L17
        L31:
            return r0
    }

    /* renamed from: M */
    public static int m7263M(byte[] r10, int r11, p124h7.C2915vf r12) {
            int r11 = m7267Q(r10, r11, r12)
            int r0 = r12.f11968a
            if (r0 < 0) goto L15c
            if (r0 != 0) goto Lf
            java.lang.String r10 = ""
            r12.f11970c = r10
            return r11
        Lf:
            k7.k8 r1 = p185k7.C3899m8.f16749a
            int r1 = r10.length
            r2 = r11 | r0
            int r3 = r1 - r11
            int r3 = r3 - r0
            r2 = r2 | r3
            r3 = 0
            if (r2 < 0) goto L139
            int r1 = r11 + r0
            char[] r0 = new char[r0]
            r2 = 0
        L20:
            if (r11 >= r1) goto L34
            r4 = r10[r11]
            boolean r5 = p185k7.C3836i.m8637v(r4)
            if (r5 != 0) goto L2b
            goto L34
        L2b:
            int r11 = r11 + 1
            int r5 = r2 + 1
            char r4 = (char) r4
            r0[r2] = r4
            r2 = r5
            goto L20
        L34:
            if (r11 >= r1) goto L131
            int r4 = r11 + 1
            r11 = r10[r11]
            boolean r5 = p185k7.C3836i.m8637v(r11)
            if (r5 == 0) goto L5a
            int r5 = r2 + 1
            char r11 = (char) r11
            r0[r2] = r11
            r11 = r4
        L46:
            r2 = r5
            if (r11 >= r1) goto L34
            r4 = r10[r11]
            boolean r5 = p185k7.C3836i.m8637v(r4)
            if (r5 != 0) goto L52
            goto L34
        L52:
            int r11 = r11 + 1
            int r5 = r2 + 1
            char r4 = (char) r4
            r0[r2] = r4
            goto L46
        L5a:
            r5 = -32
            if (r11 >= r5) goto L87
            if (r4 >= r1) goto L82
            int r5 = r4 + 1
            int r6 = r2 + 1
            r4 = r10[r4]
            r7 = -62
            if (r11 < r7) goto L7d
            boolean r7 = p185k7.C3836i.m8638w(r4)
            if (r7 != 0) goto L7d
            r11 = r11 & 31
            int r11 = r11 << 6
            r4 = r4 & 63
            r11 = r11 | r4
            char r11 = (char) r11
            r0[r2] = r11
            r11 = r5
            r2 = r6
            goto L34
        L7d:
            k7.m6 r10 = p185k7.C3897m6.m8826a()
            throw r10
        L82:
            k7.m6 r10 = p185k7.C3897m6.m8826a()
            throw r10
        L87:
            r6 = -16
            if (r11 >= r6) goto Ld2
            int r6 = r1 + (-1)
            if (r4 >= r6) goto Lcd
            int r6 = r4 + 1
            int r7 = r6 + 1
            int r8 = r2 + 1
            r4 = r10[r4]
            r6 = r10[r6]
            boolean r9 = p185k7.C3836i.m8638w(r4)
            if (r9 != 0) goto Lc8
            r9 = -96
            if (r11 != r5) goto La7
            if (r4 < r9) goto Lc8
            r11 = -32
        La7:
            r5 = -19
            if (r11 != r5) goto Laf
            if (r4 >= r9) goto Lc8
            r11 = -19
        Laf:
            boolean r5 = p185k7.C3836i.m8638w(r6)
            if (r5 != 0) goto Lc8
            r11 = r11 & 15
            int r11 = r11 << 12
            r4 = r4 & 63
            int r4 = r4 << 6
            r11 = r11 | r4
            r4 = r6 & 63
            r11 = r11 | r4
            char r11 = (char) r11
            r0[r2] = r11
            r11 = r7
            r2 = r8
            goto L34
        Lc8:
            k7.m6 r10 = p185k7.C3897m6.m8826a()
            throw r10
        Lcd:
            k7.m6 r10 = p185k7.C3897m6.m8826a()
            throw r10
        Ld2:
            int r5 = r1 + (-2)
            if (r4 >= r5) goto L12c
            int r5 = r4 + 1
            int r6 = r5 + 1
            int r7 = r6 + 1
            r4 = r10[r4]
            r5 = r10[r5]
            r6 = r10[r6]
            boolean r8 = p185k7.C3836i.m8638w(r4)
            if (r8 != 0) goto L127
            int r8 = r11 << 28
            int r9 = r4 + 112
            int r9 = r9 + r8
            int r8 = r9 >> 30
            if (r8 != 0) goto L127
            boolean r8 = p185k7.C3836i.m8638w(r5)
            if (r8 != 0) goto L127
            boolean r8 = p185k7.C3836i.m8638w(r6)
            if (r8 != 0) goto L127
            r11 = r11 & 7
            int r11 = r11 << 18
            r4 = r4 & 63
            int r4 = r4 << 12
            r11 = r11 | r4
            r4 = r5 & 63
            int r4 = r4 << 6
            r11 = r11 | r4
            r4 = r6 & 63
            r11 = r11 | r4
            int r4 = r11 >>> 10
            r5 = 55232(0xd7c0, float:7.7397E-41)
            int r4 = r4 + r5
            char r4 = (char) r4
            r0[r2] = r4
            int r4 = r2 + 1
            r11 = r11 & 1023(0x3ff, float:1.434E-42)
            r5 = 56320(0xdc00, float:7.8921E-41)
            int r11 = r11 + r5
            char r11 = (char) r11
            r0[r4] = r11
            int r2 = r2 + 2
            r11 = r7
            goto L34
        L127:
            k7.m6 r10 = p185k7.C3897m6.m8826a()
            throw r10
        L12c:
            k7.m6 r10 = p185k7.C3897m6.m8826a()
            throw r10
        L131:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r2)
            r12.f11970c = r10
            return r1
        L139:
            java.lang.ArrayIndexOutOfBoundsException r10 = new java.lang.ArrayIndexOutOfBoundsException
            r12 = 3
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12[r3] = r1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r1 = 1
            r12[r1] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r0 = 2
            r12[r0] = r11
            java.lang.String r11 = "buffer length=%d, index=%d, size=%d"
            java.lang.String r11 = java.lang.String.format(r11, r12)
            r10.<init>(r11)
            throw r10
        L15c:
            k7.m6 r10 = p185k7.C3897m6.m8827b()
            throw r10
    }

    /* renamed from: N */
    public static void m7264N(java.lang.String r3, int r4, java.util.List<p185k7.InterfaceC3916o> r5) {
            int r0 = r5.size()
            if (r0 != r4) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r3] = r4
            r3 = 2
            int r4 = r5.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r3] = r4
            java.lang.String r3 = "%s operation requires %s parameters found %s"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.<init>(r3)
            throw r0
    }

    /* renamed from: O */
    public static int m7265O(int r9, byte[] r10, int r11, int r12, p185k7.C3775d8 r13, p124h7.C2915vf r14) {
            int r0 = r9 >>> 3
            java.lang.String r1 = "Protocol message contained an invalid tag (zero)."
            if (r0 == 0) goto L99
            r0 = r9 & 7
            if (r0 == 0) goto L8b
            r2 = 1
            if (r0 == r2) goto L7d
            r2 = 2
            if (r0 == r2) goto L59
            r2 = 3
            if (r0 == r2) goto L2a
            r12 = 5
            if (r0 != r12) goto L24
            int r10 = m7297w(r10, r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r13.m8504c(r9, r10)
            int r11 = r11 + 4
            return r11
        L24:
            k7.m6 r9 = new k7.m6
            r9.<init>(r1)
            throw r9
        L2a:
            r0 = r9 & (-8)
            r0 = r0 | 4
            k7.d8 r7 = p185k7.C3775d8.m8502b()
            r1 = 0
        L33:
            if (r11 >= r12) goto L4c
            int r3 = m7267Q(r10, r11, r14)
            int r11 = r14.f11968a
            r1 = r11
            if (r11 != r0) goto L40
            r11 = r3
            goto L4c
        L40:
            r2 = r10
            r4 = r12
            r5 = r7
            r6 = r14
            int r1 = m7265O(r1, r2, r3, r4, r5, r6)
            r8 = r1
            r1 = r11
            r11 = r8
            goto L33
        L4c:
            if (r11 > r12) goto L54
            if (r1 != r0) goto L54
            r13.m8504c(r9, r7)
            return r11
        L54:
            k7.m6 r9 = p185k7.C3897m6.m8828c()
            throw r9
        L59:
            int r11 = m7267Q(r10, r11, r14)
            int r12 = r14.f11968a
            if (r12 < 0) goto L78
            int r14 = r10.length
            int r14 = r14 - r11
            if (r12 > r14) goto L73
            if (r12 != 0) goto L6a
            k7.i5 r10 = p185k7.AbstractC3842i5.f16678Z
            goto L6e
        L6a:
            k7.i5 r10 = p185k7.AbstractC3842i5.m8662u(r10, r11, r12)
        L6e:
            r13.m8504c(r9, r10)
            int r11 = r11 + r12
            return r11
        L73:
            k7.m6 r9 = p185k7.C3897m6.m8829d()
            throw r9
        L78:
            k7.m6 r9 = p185k7.C3897m6.m8827b()
            throw r9
        L7d:
            long r0 = m7274X(r10, r11)
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            r13.m8504c(r9, r10)
            int r11 = r11 + 8
            return r11
        L8b:
            int r10 = m7273W(r10, r11, r14)
            long r11 = r14.f11969b
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r13.m8504c(r9, r11)
            return r10
        L99:
            k7.m6 r9 = new k7.m6
            r9.<init>(r1)
            throw r9
    }

    /* renamed from: P */
    public static void m7266P(java.lang.String r3, int r4, java.util.List<p185k7.InterfaceC3916o> r5) {
            int r0 = r5.size()
            if (r0 < r4) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r3] = r4
            r3 = 2
            int r4 = r5.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r3] = r4
            java.lang.String r3 = "%s operation requires at least %s parameters found %s"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.<init>(r3)
            throw r0
    }

    /* renamed from: Q */
    public static int m7267Q(byte[] r1, int r2, p124h7.C2915vf r3) {
            int r0 = r2 + 1
            r2 = r1[r2]
            if (r2 < 0) goto L9
            r3.f11968a = r2
            return r0
        L9:
            int r1 = m7269S(r2, r1, r0, r3)
            return r1
    }

    /* renamed from: R */
    public static void m7268R(java.lang.String r3, int r4, java.util.List<p185k7.InterfaceC3916o> r5) {
            int r0 = r5.size()
            if (r0 > r4) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r3] = r4
            r3 = 2
            int r4 = r5.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r3] = r4
            java.lang.String r3 = "%s operation requires at most %s parameters found %s"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.<init>(r3)
            throw r0
    }

    /* renamed from: S */
    public static int m7269S(int r1, byte[] r2, int r3, p124h7.C2915vf r4) {
            r1 = r1 & 127(0x7f, float:1.78E-43)
            int r0 = r3 + 1
            r3 = r2[r3]
            if (r3 < 0) goto Lb
            int r2 = r3 << 7
            goto L26
        Lb:
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r3 = r3 << 7
            r1 = r1 | r3
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L19
            int r2 = r0 << 14
            goto L37
        L19:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r0 << 14
            r1 = r1 | r0
            int r0 = r3 + 1
            r3 = r2[r3]
            if (r3 < 0) goto L2a
            int r2 = r3 << 21
        L26:
            r1 = r1 | r2
            r4.f11968a = r1
            return r0
        L2a:
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r3 = r3 << 21
            r1 = r1 | r3
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L3b
            int r2 = r0 << 28
        L37:
            r1 = r1 | r2
            r4.f11968a = r1
            return r3
        L3b:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r0 << 28
            r1 = r1 | r0
        L40:
            int r0 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L48
            r3 = r0
            goto L40
        L48:
            r4.f11968a = r1
            return r0
    }

    /* renamed from: T */
    public static boolean m7270T(p185k7.InterfaceC3916o r6) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.lang.Double r6 = r6.mo8355g()
            boolean r1 = r6.isNaN()
            if (r1 != 0) goto L2c
            double r1 = r6.doubleValue()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L2c
            double r1 = r6.doubleValue()
            double r1 = java.lang.Math.floor(r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L2c
            r6 = 1
            return r6
        L2c:
            return r0
    }

    /* renamed from: U */
    public static int m7271U(int r2, byte[] r3, int r4, int r5, p185k7.InterfaceC3857j6<?> r6, p124h7.C2915vf r7) {
            k7.f6 r6 = (p185k7.C3801f6) r6
            int r4 = m7267Q(r3, r4, r7)
        L6:
            int r0 = r7.f11968a
            r6.m8538i(r0)
            if (r4 >= r5) goto L1b
            int r0 = m7267Q(r3, r4, r7)
            int r1 = r7.f11968a
            if (r2 == r1) goto L16
            goto L1b
        L16:
            int r4 = m7267Q(r3, r0, r7)
            goto L6
        L1b:
            return r4
    }

    /* renamed from: V */
    public static boolean m7272V(p185k7.InterfaceC3916o r4, p185k7.InterfaceC3916o r5) {
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r1 = r5.getClass()
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            boolean r0 = r4 instanceof p185k7.C3968s
            r2 = 1
            if (r0 != 0) goto L6f
            boolean r0 = r4 instanceof p185k7.C3890m
            if (r0 == 0) goto L1a
            goto L6f
        L1a:
            boolean r0 = r4 instanceof p185k7.C3808g
            if (r0 == 0) goto L49
            java.lang.Double r0 = r4.mo8355g()
            double r2 = r0.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r2)
            if (r0 != 0) goto L48
            java.lang.Double r0 = r5.mo8355g()
            double r2 = r0.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r2)
            if (r0 == 0) goto L3b
            goto L48
        L3b:
            java.lang.Double r4 = r4.mo8355g()
            java.lang.Double r5 = r5.mo8355g()
            boolean r4 = r4.equals(r5)
            return r4
        L48:
            return r1
        L49:
            boolean r0 = r4 instanceof p185k7.C3955r
            if (r0 == 0) goto L5a
            java.lang.String r4 = r4.mo8357i()
            java.lang.String r5 = r5.mo8357i()
            boolean r4 = r4.equals(r5)
            return r4
        L5a:
            boolean r0 = r4 instanceof p185k7.C3780e
            if (r0 == 0) goto L6b
            java.lang.Boolean r4 = r4.mo8353e()
            java.lang.Boolean r5 = r5.mo8353e()
            boolean r4 = r4.equals(r5)
            return r4
        L6b:
            if (r4 != r5) goto L6e
            return r2
        L6e:
            return r1
        L6f:
            return r2
    }

    /* renamed from: W */
    public static int m7273W(byte[] r9, int r10, p124h7.C2915vf r11) {
            int r0 = r10 + 1
            r10 = r9[r10]
            long r1 = (long) r10
            r3 = 0
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 >= 0) goto L2c
            int r10 = r0 + 1
            r0 = r9[r0]
            r3 = 127(0x7f, double:6.27E-322)
            long r1 = r1 & r3
            r3 = r0 & 127(0x7f, float:1.78E-43)
            long r3 = (long) r3
            r5 = 7
            long r3 = r3 << r5
            long r1 = r1 | r3
            r3 = 7
        L19:
            if (r0 >= 0) goto L29
            int r0 = r10 + 1
            r10 = r9[r10]
            int r3 = r3 + r5
            r4 = r10 & 127(0x7f, float:1.78E-43)
            long r6 = (long) r4
            long r6 = r6 << r3
            long r1 = r1 | r6
            r8 = r0
            r0 = r10
            r10 = r8
            goto L19
        L29:
            r11.f11969b = r1
            return r10
        L2c:
            r11.f11969b = r1
            return r0
    }

    /* renamed from: X */
    public static long m7274X(byte[] r7, int r8) {
            r0 = r7[r8]
            long r0 = (long) r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            int r4 = r8 + 1
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 8
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 2
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 16
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 3
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 24
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 4
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 32
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 5
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 40
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 6
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 48
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r8 = r8 + 7
            r7 = r7[r8]
            long r7 = (long) r7
            long r7 = r7 & r2
            r2 = 56
            long r7 = r7 << r2
            long r7 = r7 | r0
            return r7
    }

    /* renamed from: a */
    public static java.lang.String m7275a(int r4, int r5, java.lang.String r6) {
            r0 = 1
            r1 = 0
            r2 = 2
            if (r4 >= 0) goto L16
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r1] = r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r0] = r4
            java.lang.String r4 = "%s (%s) must not be negative"
            java.lang.String r4 = p185k7.C3828h5.m8609x(r4, r5)
            return r4
        L16:
            if (r5 < 0) goto L30
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r0] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r3[r2] = r4
            java.lang.String r4 = "%s (%s) must not be greater than size (%s)"
            java.lang.String r4 = p185k7.C3828h5.m8609x(r4, r3)
            return r4
        L30:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "negative size: "
            java.lang.String r5 = android.support.v4.media.C0142a.m254a(r6, r5)
            r4.<init>(r5)
            throw r4
    }

    /* renamed from: b */
    public static void m7276b(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    /* renamed from: c */
    public static void m7277c(boolean r0, java.lang.Object r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: d */
    public static void m7278d(boolean r2, java.lang.String r3, char r4) {
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r0[r1] = r4
            java.lang.String r3 = p185k7.C3828h5.m8609x(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: e */
    public static void m7279e(boolean r2, java.lang.String r3, java.lang.Object r4) {
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r3 = p185k7.C3828h5.m8609x(r3, r0)
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: f */
    public static int m7280f(int r6, int r7) {
            if (r6 < 0) goto L6
            if (r6 < r7) goto L5
            goto L6
        L5:
            return r6
        L6:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r1 = 1
            r2 = 0
            r3 = 2
            java.lang.String r4 = "index"
            if (r6 < 0) goto L35
            if (r7 < 0) goto L29
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r1] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r5[r3] = r6
            java.lang.String r6 = "%s (%s) must be less than size (%s)"
            java.lang.String r6 = p185k7.C3828h5.m8609x(r6, r5)
            goto L45
        L29:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "negative size: "
            java.lang.String r7 = android.support.v4.media.C0142a.m254a(r0, r7)
            r6.<init>(r7)
            throw r6
        L35:
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r2] = r4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7[r1] = r6
            java.lang.String r6 = "%s (%s) must not be negative"
            java.lang.String r6 = p185k7.C3828h5.m8609x(r6, r7)
        L45:
            r0.<init>(r6)
            throw r0
    }

    /* renamed from: g */
    public static <T> T m7281g(T r0, java.lang.Object r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: h */
    public static int m7282h(int r2, int r3) {
            if (r2 < 0) goto L5
            if (r2 > r3) goto L5
            return r2
        L5:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "index"
            java.lang.String r2 = m7275a(r2, r3, r1)
            r0.<init>(r2)
            throw r0
    }

    /* renamed from: i */
    public static void m7283i(int r2, int r3, int r4) {
            if (r2 < 0) goto L8
            if (r3 < r2) goto L8
            if (r3 <= r4) goto L7
            goto L8
        L7:
            return
        L8:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            if (r2 < 0) goto L32
            if (r2 > r4) goto L32
            if (r3 < 0) goto L2b
            if (r3 <= r4) goto L13
            goto L2b
        L13:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r1 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r1] = r3
            r3 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r3] = r2
            java.lang.String r2 = "end index (%s) must not be less than start index (%s)"
            java.lang.String r2 = p185k7.C3828h5.m8609x(r2, r4)
            goto L38
        L2b:
            java.lang.String r2 = "end index"
            java.lang.String r2 = m7275a(r3, r4, r2)
            goto L38
        L32:
            java.lang.String r3 = "start index"
            java.lang.String r2 = m7275a(r2, r4, r3)
        L38:
            r0.<init>(r2)
            throw r0
    }

    /* renamed from: j */
    public static int m7284j(int r1, int r2) {
            int r0 = android.graphics.Color.alpha(r1)
            int r0 = r0 * r2
            int r0 = r0 / 255
            int r1 = p084f0.C1938a.m4825j(r1, r0)
            return r1
    }

    /* renamed from: k */
    public static int m7285k(android.content.Context r0, int r1, int r2) {
            android.util.TypedValue r0 = p288q8.C5598b.m11872a(r0, r1)
            if (r0 == 0) goto L9
            int r0 = r0.data
            return r0
        L9:
            return r2
    }

    /* renamed from: l */
    public static int m7286l(android.view.View r1, int r2) {
            android.content.Context r0 = r1.getContext()
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            int r1 = p288q8.C5598b.m11874c(r0, r2, r1)
            return r1
    }

    /* renamed from: m */
    public static android.widget.TextView m7287m(androidx.appcompat.widget.Toolbar r3, java.lang.CharSequence r4) {
            r0 = 0
        L1:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L1f
            android.view.View r1 = r3.getChildAt(r0)
            boolean r2 = r1 instanceof android.widget.TextView
            if (r2 == 0) goto L1c
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.CharSequence r2 = r1.getText()
            boolean r2 = android.text.TextUtils.equals(r2, r4)
            if (r2 == 0) goto L1c
            return r1
        L1c:
            int r0 = r0 + 1
            goto L1
        L1f:
            r3 = 0
            return r3
    }

    /* renamed from: n */
    public static int m7288n(int r1, int r2, float r3) {
            int r0 = android.graphics.Color.alpha(r2)
            float r0 = (float) r0
            float r0 = r0 * r3
            int r3 = java.lang.Math.round(r0)
            int r2 = p084f0.C1938a.m4825j(r2, r3)
            int r1 = p084f0.C1938a.m4821f(r2, r1)
            return r1
    }

    /* renamed from: o */
    public static int m7289o(int r4) {
            long r0 = (long) r4
            r2 = -862048943(0xffffffffcc9e2d51, double:NaN)
            long r0 = r0 * r2
            int r4 = (int) r0
            r0 = 15
            int r4 = java.lang.Integer.rotateLeft(r4, r0)
            long r0 = (long) r4
            r2 = 461845907(0x1b873593, double:2.281821963E-315)
            long r0 = r0 * r2
            int r4 = (int) r0
            return r4
    }

    /* renamed from: p */
    public static double m7290p(double r3) {
            boolean r0 = java.lang.Double.isNaN(r3)
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            boolean r0 = java.lang.Double.isInfinite(r3)
            if (r0 != 0) goto L26
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L26
            if (r0 != 0) goto L16
            goto L26
        L16:
            if (r0 <= 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = -1
        L1b:
            double r0 = (double) r0
            double r3 = java.lang.Math.abs(r3)
            double r3 = java.lang.Math.floor(r3)
            double r3 = r3 * r0
        L26:
            return r3
    }

    /* renamed from: q */
    public static int m7291q(byte[] r2, int r3, p124h7.C2915vf r4) {
            int r3 = m7267Q(r2, r3, r4)
            int r0 = r4.f11968a
            if (r0 < 0) goto L20
            int r1 = r2.length
            int r1 = r1 - r3
            if (r0 > r1) goto L1b
            if (r0 != 0) goto L13
            k7.i5 r2 = p185k7.AbstractC3842i5.f16678Z
            r4.f11970c = r2
            return r3
        L13:
            k7.i5 r2 = p185k7.AbstractC3842i5.m8662u(r2, r3, r0)
            r4.f11970c = r2
            int r3 = r3 + r0
            return r3
        L1b:
            k7.m6 r2 = p185k7.C3897m6.m8829d()
            throw r2
        L20:
            k7.m6 r2 = p185k7.C3897m6.m8827b()
            throw r2
    }

    /* renamed from: r */
    public static <T> T m7292r(android.os.Bundle r2, java.lang.String r3, java.lang.Class<T> r4, T r5) {
            java.lang.Object r2 = r2.get(r3)
            if (r2 != 0) goto L7
            return r5
        L7:
            java.lang.Class r5 = r2.getClass()
            boolean r5 = r4.isAssignableFrom(r5)
            if (r5 == 0) goto L12
            return r2
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            java.lang.String r4 = r4.getCanonicalName()
            r0[r3] = r4
            r3 = 2
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getCanonicalName()
            r0[r3] = r2
            java.lang.String r2 = "Invalid conditional user property field type. '%s' expected [%s] but was [%s]"
            java.lang.String r2 = java.lang.String.format(r2, r0)
            r5.<init>(r2)
            throw r5
    }

    /* renamed from: s */
    public static java.lang.String m7293s(java.lang.String r7) {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "android.os.SystemProperties"
            r2 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L2c
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L2c
            r5 = 0
            r4[r5] = r0     // Catch: java.lang.Exception -> L2c
            java.lang.String r6 = "get"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r6, r4)     // Catch: java.lang.Exception -> L2c
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L2c
            r3[r5] = r7     // Catch: java.lang.Exception -> L2c
            java.lang.Object r7 = r1.invoke(r2, r3)     // Catch: java.lang.Exception -> L2c
            if (r7 == 0) goto L2c
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.Exception -> L2c
            boolean r0 = r0.isAssignableFrom(r1)     // Catch: java.lang.Exception -> L2c
            if (r0 == 0) goto L2c
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L2c
            return r7
        L2c:
            return r2
    }

    /* renamed from: t */
    public static void m7294t(java.lang.String r7, p124h7.InterfaceC2534ad r8, p124h7.InterfaceC2697jd r9, java.lang.reflect.Type r10, p124h7.C2607ed r11) {
            java.net.URL r0 = new java.net.URL     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            r0.<init>(r7)     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            java.net.URLConnection r7 = r0.openConnection()     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            r0 = 1
            r7.setDoOutput(r0)     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            java.lang.String r8 = r8.mo27a()     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            byte[] r8 = r8.getBytes(r1)     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            int r1 = r8.length     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            r7.setFixedLengthStreamingMode(r1)     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/json"
            r7.setRequestProperty(r2, r3)     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            r2 = 60000(0xea60, float:8.4078E-41)
            r7.setConnectTimeout(r2)     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            r11.m6647a(r7)     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            java.io.BufferedOutputStream r11 = new java.io.BufferedOutputStream     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            java.io.OutputStream r2 = r7.getOutputStream()     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            r11.<init>(r2, r1)     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            r2 = 0
            r11.write(r8, r2, r1)     // Catch: java.lang.Throwable -> La3
            r11.close()     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            int r8 = r7.getResponseCode()     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            r11 = 300(0x12c, float:4.2E-43)
            r1 = 200(0xc8, float:2.8E-43)
            if (r8 < r1) goto L4d
            if (r8 >= r11) goto L4d
            r3 = 1
            goto L4e
        L4d:
            r3 = 0
        L4e:
            if (r3 == 0) goto L55
            java.io.InputStream r7 = r7.getInputStream()     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            goto L59
        L55:
            java.io.InputStream r7 = r7.getErrorStream()     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
        L59:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            r3.<init>()     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            java.lang.String r6 = "UTF-8"
            r5.<init>(r7, r6)     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            r4.<init>(r5)     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
        L6a:
            java.lang.String r7 = r4.readLine()     // Catch: java.lang.Throwable -> L99
            if (r7 == 0) goto L74
            r3.append(r7)     // Catch: java.lang.Throwable -> L99
            goto L6a
        L74:
            r4.close()     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            java.lang.String r7 = r3.toString()     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            if (r8 < r1) goto L80
            if (r8 >= r11) goto L80
            goto L81
        L80:
            r0 = 0
        L81:
            if (r0 != 0) goto L8f
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.Object r7 = p124h7.C2984zc.m7358a(r7, r8)     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            java.lang.String r7 = (java.lang.String) r7     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            r9.mo29e(r7)     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            return
        L8f:
            java.lang.Object r7 = p124h7.C2984zc.m7358a(r7, r10)     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            h7.bd r7 = (p124h7.InterfaceC2553bd) r7     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            r9.mo28b(r7)     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
            return
        L99:
            r7 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L9e
            goto La2
        L9e:
            r8 = move-exception
            r7.addSuppressed(r8)     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
        La2:
            throw r7     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
        La3:
            r7 = move-exception
            r11.close()     // Catch: java.lang.Throwable -> La8
            goto Lac
        La8:
            r8 = move-exception
            r7.addSuppressed(r8)     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
        Lac:
            throw r7     // Catch: p124h7.C2713kb -> Lad org.json.JSONException -> Laf java.io.IOException -> Lb1 java.net.UnknownHostException -> Lb7 java.net.SocketTimeoutException -> Lba
        Lad:
            r7 = move-exception
            goto Lb2
        Laf:
            r7 = move-exception
            goto Lb2
        Lb1:
            r7 = move-exception
        Lb2:
            java.lang.String r7 = r7.getMessage()
            goto Lbc
        Lb7:
            java.lang.String r7 = "<<Network Error>>"
            goto Lbc
        Lba:
            java.lang.String r7 = "TIMEOUT"
        Lbc:
            r9.mo29e(r7)
            return
    }

    /* renamed from: u */
    public static final void m7295u(java.nio.ByteBuffer r3, java.nio.ByteBuffer r4, java.nio.ByteBuffer r5, int r6) {
            if (r6 < 0) goto L28
            int r0 = r4.remaining()
            if (r0 < r6) goto L28
            int r0 = r5.remaining()
            if (r0 < r6) goto L28
            int r0 = r3.remaining()
            if (r0 < r6) goto L28
            r0 = 0
        L15:
            if (r0 >= r6) goto L27
            byte r1 = r4.get()
            byte r2 = r5.get()
            r1 = r1 ^ r2
            byte r1 = (byte) r1
            r3.put(r1)
            int r0 = r0 + 1
            goto L15
        L27:
            return
        L28:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "That combination of buffers, offsets and length to xor result in out-of-bond accesses."
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: v */
    public static int m7296v(double r3) {
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 != 0) goto L29
            boolean r0 = java.lang.Double.isInfinite(r3)
            if (r0 != 0) goto L29
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L13
            goto L29
        L13:
            if (r2 <= 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = -1
        L18:
            double r0 = (double) r0
            double r3 = java.lang.Math.abs(r3)
            double r3 = java.lang.Math.floor(r3)
            double r3 = r3 * r0
            r0 = 4751297606875873280(0x41f0000000000000, double:4.294967296E9)
            double r3 = r3 % r0
            long r3 = (long) r3
            int r4 = (int) r3
            return r4
        L29:
            r3 = 0
            return r3
    }

    /* renamed from: w */
    public static int m7297w(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    /* renamed from: x */
    public static void m7298x(android.os.Bundle r4, java.lang.Object r5) {
            boolean r0 = r5 instanceof java.lang.Double
            java.lang.String r1 = "value"
            if (r0 == 0) goto L10
            java.lang.Double r5 = (java.lang.Double) r5
            double r2 = r5.doubleValue()
            r4.putDouble(r1, r2)
            return
        L10:
            boolean r0 = r5 instanceof java.lang.Long
            if (r0 == 0) goto L1e
            java.lang.Long r5 = (java.lang.Long) r5
            long r2 = r5.longValue()
            r4.putLong(r1, r2)
            return
        L1e:
            java.lang.String r5 = r5.toString()
            r4.putString(r1, r5)
            return
    }

    /* renamed from: y */
    public static final boolean m7299y(byte[] r5, byte[] r6) {
            r0 = 0
            if (r5 == 0) goto L1c
            if (r6 != 0) goto L6
            goto L1c
        L6:
            int r1 = r5.length
            int r2 = r6.length
            if (r1 != r2) goto L1c
            r1 = 0
            r2 = 0
        Lc:
            int r3 = r5.length
            if (r1 >= r3) goto L18
            r3 = r5[r1]
            r4 = r6[r1]
            r3 = r3 ^ r4
            r2 = r2 | r3
            int r1 = r1 + 1
            goto Lc
        L18:
            if (r2 != 0) goto L1c
            r5 = 1
            return r5
        L1c:
            return r0
    }

    /* renamed from: z */
    public static int m7300z(p185k7.InterfaceC3950q7 r8, byte[] r9, int r10, int r11, int r12, p124h7.C2915vf r13) {
            k7.i7 r8 = (p185k7.C3844i7) r8
            k7.f7 r0 = r8.f16686e
            k7.d6 r0 = (p185k7.AbstractC3773d6) r0
            r1 = 4
            r2 = 0
            java.lang.Object r7 = r0.mo8189r(r1, r2, r2)
            r0 = r8
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            int r9 = r0.m8673A(r1, r2, r3, r4, r5, r6)
            r8.mo8684c(r7)
            r13.f11970c = r7
            return r9
    }
}
