package p036c6;

/* renamed from: c6.q0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0906q0 {
    /* renamed from: a */
    public static p124h7.C2713kb m2613a(java.lang.Exception r6, java.lang.String r7, java.lang.String r8) {
            java.lang.String r0 = r6.getMessage()
            int r1 = r7.length()
            java.lang.String r2 = java.lang.String.valueOf(r8)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 47
            int r1 = androidx.appcompat.widget.C0267d.m705a(r1, r5, r2, r3)
            r4.<init>(r1)
            java.lang.String r1 = "Failed to parse "
            java.lang.String r2 = " for string ["
            p179k1.C3661s.m8090a(r4, r1, r7, r2, r8)
            java.lang.String r3 = "] with exception: "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.e(r7, r0)
            h7.kb r0 = new h7.kb
            int r3 = r7.length()
            java.lang.String r4 = java.lang.String.valueOf(r8)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 30
            int r3 = r3 + r4
            r5.<init>(r3)
            p179k1.C3661s.m8090a(r5, r1, r7, r2, r8)
            java.lang.String r7 = "]"
            r5.append(r7)
            java.lang.String r7 = r5.toString()
            r0.<init>(r7, r6)
            return r0
    }

    /* renamed from: b */
    public static java.lang.String m2614b(p124h7.EnumC2977z5 r3) {
            int r0 = r3.ordinal()
            r1 = 1
            if (r0 == r1) goto L3a
            r1 = 2
            if (r0 == r1) goto L37
            r1 = 3
            if (r0 == r1) goto L34
            r1 = 4
            if (r0 == r1) goto L31
            r1 = 5
            if (r0 != r1) goto L16
            java.lang.String r3 = "HmacSha224"
            return r3
        L16:
            java.security.NoSuchAlgorithmException r0 = new java.security.NoSuchAlgorithmException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r1 = r3.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 27
            r2.<init>(r1)
            java.lang.String r1 = "hash unsupported for HMAC: "
            java.lang.String r3 = p346u.C6269n.m12888a(r2, r1, r3)
            r0.<init>(r3)
            throw r0
        L31:
            java.lang.String r3 = "HmacSha512"
            return r3
        L34:
            java.lang.String r3 = "HmacSha256"
            return r3
        L37:
            java.lang.String r3 = "HmacSha384"
            return r3
        L3a:
            java.lang.String r3 = "HmacSha1"
            return r3
    }

    /* renamed from: c */
    public static java.lang.String m2615c(p124h7.AbstractC2574cg r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.mo6474h()
            r0.<init>(r1)
            r1 = 0
        La:
            int r2 = r5.mo6474h()
            if (r1 >= r2) goto L70
            byte r2 = r5.mo6472a(r1)
            r3 = 34
            if (r2 == r3) goto L6a
            r3 = 39
            if (r2 == r3) goto L67
            r3 = 92
            if (r2 == r3) goto L64
            switch(r2) {
                case 7: goto L5e;
                case 8: goto L5b;
                case 9: goto L58;
                case 10: goto L55;
                case 11: goto L52;
                case 12: goto L4f;
                case 13: goto L4c;
                default: goto L23;
            }
        L23:
            r4 = 32
            if (r2 < r4) goto L2c
            r4 = 126(0x7e, float:1.77E-43)
            if (r2 > r4) goto L2c
            goto L47
        L2c:
            r0.append(r3)
            int r3 = r2 >>> 6
            r3 = r3 & 3
            int r3 = r3 + 48
            char r3 = (char) r3
            r0.append(r3)
            int r3 = r2 >>> 3
            r3 = r3 & 7
            int r3 = r3 + 48
            char r3 = (char) r3
            r0.append(r3)
            r2 = r2 & 7
            int r2 = r2 + 48
        L47:
            char r2 = (char) r2
            r0.append(r2)
            goto L6d
        L4c:
            java.lang.String r2 = "\\r"
            goto L60
        L4f:
            java.lang.String r2 = "\\f"
            goto L60
        L52:
            java.lang.String r2 = "\\v"
            goto L60
        L55:
            java.lang.String r2 = "\\n"
            goto L60
        L58:
            java.lang.String r2 = "\\t"
            goto L60
        L5b:
            java.lang.String r2 = "\\b"
            goto L60
        L5e:
            java.lang.String r2 = "\\a"
        L60:
            r0.append(r2)
            goto L6d
        L64:
            java.lang.String r2 = "\\\\"
            goto L60
        L67:
            java.lang.String r2 = "\\'"
            goto L60
        L6a:
            java.lang.String r2 = "\\\""
            goto L60
        L6d:
            int r1 = r1 + 1
            goto La
        L70:
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* renamed from: d */
    public static java.lang.String m2616d(byte[] r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            int r2 = r1 + r1
            r0.<init>(r2)
            r2 = 0
        L9:
            if (r2 >= r1) goto L26
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r4 = "0123456789abcdef"
            int r5 = r3 >> 4
            char r5 = r4.charAt(r5)
            r0.append(r5)
            r3 = r3 & 15
            char r3 = r4.charAt(r3)
            r0.append(r3)
            int r2 = r2 + 1
            goto L9
        L26:
            java.lang.String r6 = r0.toString()
            return r6
    }

    /* renamed from: e */
    public static byte[] m2617e(byte[] r2) {
            int r0 = r2.length
            r1 = 16
            if (r0 >= r1) goto Le
            byte[] r2 = java.util.Arrays.copyOf(r2, r1)
            r1 = -128(0xffffffffffffff80, float:NaN)
            r2[r0] = r1
            return r2
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "x must be smaller than a block."
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: f */
    public static java.lang.String m2618f(java.lang.String r11, java.lang.Object... r12) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r12.length
            if (r1 >= r2) goto L99
            r2 = r12[r1]
            if (r2 != 0) goto Ld
            java.lang.String r2 = "null"
            goto L93
        Ld:
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L13
            goto L93
        L13:
            r9 = move-exception
            java.lang.Class r3 = r2.getClass()
            java.lang.String r3 = r3.getName()
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            int r4 = r3.length()
            java.lang.String r5 = java.lang.String.valueOf(r2)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 1
            int r4 = r4 + r5
            r6.<init>(r4)
            r6.append(r3)
            r3 = 64
            r6.append(r3)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            java.lang.String r3 = "com.google.common.base.Strings"
            java.util.logging.Logger r3 = java.util.logging.Logger.getLogger(r3)
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            java.lang.String r5 = "Exception during lenientFormat for "
            int r6 = r2.length()
            if (r6 == 0) goto L5d
            java.lang.String r5 = r5.concat(r2)
            r7 = r5
            goto L63
        L5d:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r5)
            r7 = r6
        L63:
            java.lang.String r5 = "com.google.common.base.Strings"
            java.lang.String r6 = "lenientToString"
            r8 = r9
            r3.logp(r4, r5, r6, r7, r8)
            java.lang.Class r3 = r9.getClass()
            java.lang.String r3 = r3.getName()
            int r4 = r3.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r6 = r2.length()
            int r6 = r6 + 9
            int r6 = r6 + r4
            r5.<init>(r6)
            java.lang.String r4 = "<"
            java.lang.String r6 = " threw "
            p179k1.C3661s.m8090a(r5, r4, r2, r6, r3)
            java.lang.String r2 = ">"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
        L93:
            r12[r1] = r2
            int r1 = r1 + 1
            goto L2
        L99:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r3 = r11.length()
            int r2 = r2 * 16
            int r2 = r2 + r3
            r1.<init>(r2)
            r2 = 0
        La6:
            int r3 = r12.length
            if (r0 >= r3) goto Lc3
            java.lang.String r4 = "%s"
            int r4 = r11.indexOf(r4, r2)
            r5 = -1
            if (r4 != r5) goto Lb3
            goto Lc3
        Lb3:
            r1.append(r11, r2, r4)
            int r2 = r0 + 1
            r0 = r12[r0]
            r1.append(r0)
            int r0 = r4 + 2
            r10 = r2
            r2 = r0
            r0 = r10
            goto La6
        Lc3:
            int r4 = r11.length()
            r1.append(r11, r2, r4)
            if (r0 >= r3) goto Lee
            java.lang.String r11 = " ["
            r1.append(r11)
            int r11 = r0 + 1
            r0 = r12[r0]
            r1.append(r0)
        Ld8:
            int r0 = r12.length
            if (r11 >= r0) goto Le9
            java.lang.String r0 = ", "
            r1.append(r0)
            int r0 = r11 + 1
            r11 = r12[r11]
            r1.append(r11)
            r11 = r0
            goto Ld8
        Le9:
            r11 = 93
            r1.append(r11)
        Lee:
            java.lang.String r11 = r1.toString()
            return r11
    }

    /* renamed from: g */
    public static java.math.BigInteger m2619g(java.security.spec.EllipticCurve r1) {
            java.security.spec.ECField r1 = r1.getField()
            boolean r0 = r1 instanceof java.security.spec.ECFieldFp
            if (r0 == 0) goto Lf
            java.security.spec.ECFieldFp r1 = (java.security.spec.ECFieldFp) r1
            java.math.BigInteger r1 = r1.getP()
            return r1
        Lf:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Only curves over prime order fields are supported"
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: h */
    public static java.util.List<java.lang.String> m2620h(org.json.JSONArray r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L1e
            int r1 = r3.length()
            if (r1 == 0) goto L1e
            r1 = 0
        Le:
            int r2 = r3.length()
            if (r1 >= r2) goto L1e
            java.lang.String r2 = r3.getString(r1)
            r0.add(r2)
            int r1 = r1 + 1
            goto Le
        L1e:
            return r0
    }

    /* renamed from: i */
    public static void m2621i(p124h7.C2797p5 r2) {
            h7.v5 r0 = r2.m7047x()
            h7.w5 r0 = r0.m7209v()
            int r0 = m2625m(r0)
            m2630r(r0)
            h7.v5 r0 = r2.m7047x()
            h7.z5 r0 = r0.m7210w()
            m2614b(r0)
            h7.i5 r0 = r2.m7045r()
            h7.i5 r1 = p124h7.EnumC2671i5.f11610Z
            if (r0 == r1) goto L2e
            h7.k5 r2 = r2.m7046s()
            h7.m6 r2 = r2.m6947v()
            p124h7.C2650h2.m6770a(r2)
            return
        L2e:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r0 = "unknown EC point format"
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: j */
    public static boolean m2622j() {
            r0 = 0
            java.lang.String r1 = "android.app.Application"
            r2 = 0
            java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.Exception -> L8
            r0 = 1
        L8:
            return r0
    }

    /* renamed from: k */
    public static byte[] m2623k(byte[] r6) {
            int r0 = r6.length
            r1 = 16
            if (r0 != r1) goto L34
            byte[] r0 = new byte[r1]
            r2 = 0
            r3 = 0
        L9:
            r4 = 15
            if (r3 >= r1) goto L26
            r5 = r6[r3]
            int r5 = r5 + r5
            r5 = r5 & 254(0xfe, float:3.56E-43)
            byte r5 = (byte) r5
            r0[r3] = r5
            if (r3 >= r4) goto L23
            int r4 = r3 + 1
            r4 = r6[r4]
            int r4 = r4 >> 7
            r4 = r4 & 1
            r4 = r4 | r5
            byte r4 = (byte) r4
            r0[r3] = r4
        L23:
            int r3 = r3 + 1
            goto L9
        L26:
            r1 = r0[r4]
            r6 = r6[r2]
            int r6 = r6 >> 7
            r6 = r6 & 135(0x87, float:1.89E-43)
            byte r6 = (byte) r6
            r6 = r6 ^ r1
            byte r6 = (byte) r6
            r0[r4] = r6
            return r0
        L34:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "value must be a block."
            r6.<init>(r0)
            throw r6
    }

    /* renamed from: l */
    public static java.lang.String m2624l(java.lang.String r11, java.lang.Object... r12) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r12.length
            if (r1 >= r2) goto La0
            r2 = r12[r1]
            if (r2 != 0) goto Ld
            java.lang.String r2 = "null"
            goto L9a
        Ld:
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L13
            goto L9a
        L13:
            r9 = move-exception
            java.lang.Class r3 = r2.getClass()
            java.lang.String r3 = r3.getName()
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            int r4 = r3.length()
            java.lang.String r5 = java.lang.String.valueOf(r2)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 1
            int r4 = r4 + r5
            r6.<init>(r4)
            r6.append(r3)
            r3 = 64
            r6.append(r3)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            java.lang.String r3 = "com.google.common.base.Strings"
            java.util.logging.Logger r3 = java.util.logging.Logger.getLogger(r3)
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            java.lang.String r5 = java.lang.String.valueOf(r2)
            java.lang.String r6 = "Exception during lenientFormat for "
            int r7 = r5.length()
            if (r7 == 0) goto L60
            java.lang.String r5 = r6.concat(r5)
            goto L65
        L60:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r6)
        L65:
            r7 = r5
            java.lang.String r5 = "com.google.common.base.Strings"
            java.lang.String r6 = "lenientToString"
            r8 = r9
            r3.logp(r4, r5, r6, r7, r8)
            java.lang.Class r3 = r9.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            int r5 = r3.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 9
            int r4 = r4 + r5
            r6.<init>(r4)
            java.lang.String r4 = "<"
            java.lang.String r5 = " threw "
            p179k1.C3661s.m8090a(r6, r4, r2, r5, r3)
            java.lang.String r2 = ">"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
        L9a:
            r12[r1] = r2
            int r1 = r1 + 1
            goto L2
        La0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r3 = r11.length()
            int r2 = r2 * 16
            int r2 = r2 + r3
            r1.<init>(r2)
            r2 = 0
        Lad:
            int r3 = r12.length
            if (r0 >= r3) goto Lca
            java.lang.String r4 = "%s"
            int r4 = r11.indexOf(r4, r2)
            r5 = -1
            if (r4 != r5) goto Lba
            goto Lca
        Lba:
            r1.append(r11, r2, r4)
            int r2 = r0 + 1
            r0 = r12[r0]
            r1.append(r0)
            int r0 = r4 + 2
            r10 = r2
            r2 = r0
            r0 = r10
            goto Lad
        Lca:
            int r4 = r11.length()
            r1.append(r11, r2, r4)
            if (r0 >= r3) goto Lf5
            java.lang.String r11 = " ["
            r1.append(r11)
            int r11 = r0 + 1
            r0 = r12[r0]
            r1.append(r0)
        Ldf:
            int r0 = r12.length
            if (r11 >= r0) goto Lf0
            java.lang.String r0 = ", "
            r1.append(r0)
            int r0 = r11 + 1
            r11 = r12[r11]
            r1.append(r11)
            r11 = r0
            goto Ldf
        Lf0:
            r11 = 93
            r1.append(r11)
        Lf5:
            java.lang.String r11 = r1.toString()
            return r11
    }

    /* renamed from: m */
    public static int m2625m(p124h7.EnumC2923w5 r3) {
            int r0 = r3.ordinal()
            r1 = 1
            if (r0 == r1) goto L29
            r1 = 2
            if (r0 == r1) goto L29
            r1 = 3
            if (r0 != r1) goto Le
            return r1
        Le:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r1 = r3.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 20
            r2.<init>(r1)
            java.lang.String r1 = "unknown curve type: "
            java.lang.String r3 = p346u.C6269n.m12888a(r2, r1, r3)
            r0.<init>(r3)
            throw r0
        L29:
            return r1
    }

    /* renamed from: n */
    public static java.math.BigInteger m2626n(java.math.BigInteger r10, boolean r11, java.security.spec.EllipticCurve r12) {
            java.math.BigInteger r0 = m2619g(r12)
            java.math.BigInteger r1 = r12.getA()
            java.math.BigInteger r12 = r12.getB()
            java.math.BigInteger r2 = r10.multiply(r10)
            java.math.BigInteger r1 = r2.add(r1)
            java.math.BigInteger r10 = r1.multiply(r10)
            java.math.BigInteger r10 = r10.add(r12)
            java.math.BigInteger r10 = r10.mod(r0)
            int r12 = r0.signum()
            r1 = 1
            if (r12 != r1) goto L141
            java.math.BigInteger r10 = r10.mod(r0)
            java.math.BigInteger r12 = java.math.BigInteger.ZERO
            boolean r2 = r10.equals(r12)
            r3 = 0
            if (r2 == 0) goto L36
            goto L131
        L36:
            boolean r12 = r0.testBit(r3)
            r2 = 0
            if (r12 == 0) goto L54
            boolean r12 = r0.testBit(r1)
            if (r12 == 0) goto L54
            java.math.BigInteger r12 = java.math.BigInteger.ONE
            java.math.BigInteger r12 = r0.add(r12)
            r1 = 2
            java.math.BigInteger r12 = r12.shiftRight(r1)
            java.math.BigInteger r12 = r10.modPow(r12, r0)
            goto L118
        L54:
            boolean r12 = r0.testBit(r3)
            if (r12 == 0) goto L117
            boolean r12 = r0.testBit(r1)
            if (r12 != 0) goto L117
            java.math.BigInteger r12 = java.math.BigInteger.ONE
            java.math.BigInteger r2 = r0.subtract(r12)
            java.math.BigInteger r2 = r2.shiftRight(r1)
            r4 = 0
        L6b:
            java.math.BigInteger r5 = r12.multiply(r12)
            java.math.BigInteger r5 = r5.subtract(r10)
            java.math.BigInteger r5 = r5.mod(r0)
            java.math.BigInteger r6 = java.math.BigInteger.ZERO
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L131
            java.math.BigInteger r6 = r5.modPow(r2, r0)
            java.math.BigInteger r7 = java.math.BigInteger.ONE
            java.math.BigInteger r8 = r6.add(r7)
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto Lf0
            java.math.BigInteger r2 = r0.add(r7)
            java.math.BigInteger r1 = r2.shiftRight(r1)
            int r2 = r1.bitLength()
            int r2 = r2 + (-2)
            r4 = r12
        L9e:
            if (r2 < 0) goto Lee
            java.math.BigInteger r6 = r4.multiply(r7)
            java.math.BigInteger r4 = r4.multiply(r4)
            java.math.BigInteger r7 = r7.multiply(r7)
            java.math.BigInteger r7 = r7.mod(r0)
            java.math.BigInteger r7 = r7.multiply(r5)
            java.math.BigInteger r4 = r4.add(r7)
            java.math.BigInteger r4 = r4.mod(r0)
            java.math.BigInteger r6 = r6.add(r6)
            java.math.BigInteger r6 = r6.mod(r0)
            boolean r7 = r1.testBit(r2)
            if (r7 == 0) goto Lea
            java.math.BigInteger r7 = r4.multiply(r12)
            java.math.BigInteger r8 = r6.multiply(r5)
            java.math.BigInteger r7 = r7.add(r8)
            java.math.BigInteger r7 = r7.mod(r0)
            java.math.BigInteger r6 = r12.multiply(r6)
            java.math.BigInteger r4 = r6.add(r4)
            java.math.BigInteger r4 = r4.mod(r0)
            r9 = r7
            r7 = r4
            r4 = r9
            goto Leb
        Lea:
            r7 = r6
        Leb:
            int r2 = r2 + (-1)
            goto L9e
        Lee:
            r12 = r4
            goto L118
        Lf0:
            boolean r5 = r6.equals(r7)
            java.lang.String r6 = "p is not prime"
            if (r5 == 0) goto L111
            java.math.BigInteger r12 = r12.add(r7)
            int r4 = r4 + r1
            r5 = 128(0x80, float:1.8E-43)
            if (r4 != r5) goto L6b
            r5 = 80
            boolean r5 = r0.isProbablePrime(r5)
            if (r5 == 0) goto L10b
            goto L6b
        L10b:
            java.security.InvalidAlgorithmParameterException r10 = new java.security.InvalidAlgorithmParameterException
            r10.<init>(r6)
            throw r10
        L111:
            java.security.InvalidAlgorithmParameterException r10 = new java.security.InvalidAlgorithmParameterException
            r10.<init>(r6)
            throw r10
        L117:
            r12 = r2
        L118:
            if (r12 == 0) goto L131
            java.math.BigInteger r1 = r12.multiply(r12)
            java.math.BigInteger r1 = r1.mod(r0)
            int r10 = r1.compareTo(r10)
            if (r10 != 0) goto L129
            goto L131
        L129:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "Could not find a modular square root"
            r10.<init>(r11)
            throw r10
        L131:
            boolean r10 = r12.testBit(r3)
            if (r11 == r10) goto L140
            java.math.BigInteger r10 = r0.subtract(r12)
            java.math.BigInteger r10 = r10.mod(r0)
            return r10
        L140:
            return r12
        L141:
            java.security.InvalidAlgorithmParameterException r10 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r11 = "p must be positive"
            r10.<init>(r11)
            throw r10
    }

    /* renamed from: o */
    public static int m2627o(p124h7.EnumC2671i5 r3) {
            int r0 = r3.ordinal()
            r1 = 1
            if (r0 == r1) goto L29
            r1 = 2
            if (r0 == r1) goto L29
            r1 = 3
            if (r0 != r1) goto Le
            return r1
        Le:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r1 = r3.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 22
            r2.<init>(r1)
            java.lang.String r1 = "unknown point format: "
            java.lang.String r3 = p346u.C6269n.m12888a(r2, r1, r3)
            r0.<init>(r3)
            throw r0
        L29:
            return r1
    }

    /* renamed from: p */
    public static void m2628p(java.security.spec.ECPoint r4, java.security.spec.EllipticCurve r5) {
            java.math.BigInteger r0 = m2619g(r5)
            java.math.BigInteger r1 = r4.getAffineX()
            java.math.BigInteger r4 = r4.getAffineY()
            if (r1 == 0) goto L6c
            if (r4 == 0) goto L6c
            int r2 = r1.signum()
            r3 = -1
            if (r2 == r3) goto L64
            int r2 = r1.compareTo(r0)
            if (r2 >= 0) goto L64
            int r2 = r4.signum()
            if (r2 == r3) goto L5c
            int r2 = r4.compareTo(r0)
            if (r2 >= 0) goto L5c
            java.math.BigInteger r4 = r4.multiply(r4)
            java.math.BigInteger r4 = r4.mod(r0)
            java.math.BigInteger r2 = r1.multiply(r1)
            java.math.BigInteger r3 = r5.getA()
            java.math.BigInteger r2 = r2.add(r3)
            java.math.BigInteger r1 = r2.multiply(r1)
            java.math.BigInteger r5 = r5.getB()
            java.math.BigInteger r5 = r1.add(r5)
            java.math.BigInteger r5 = r5.mod(r0)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L54
            return
        L54:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "Point is not on curve"
            r4.<init>(r5)
            throw r4
        L5c:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "y is out of range"
            r4.<init>(r5)
            throw r4
        L64:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "x is out of range"
            r4.<init>(r5)
            throw r4
        L6c:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "point is at infinity"
            r4.<init>(r5)
            throw r4
    }

    /* renamed from: q */
    public static boolean m2629q(java.lang.String r1) {
            int r0 = p124h7.C2896ue.f11946a
            if (r1 == 0) goto Ld
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            goto Le
        Ld:
            r1 = 1
        Le:
            return r1
    }

    /* renamed from: r */
    public static java.security.spec.ECParameterSpec m2630r(int r4) {
            int r4 = r4 + (-1)
            if (r4 == 0) goto L21
            r0 = 1
            if (r4 == r0) goto L16
            java.lang.String r4 = "6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151"
            java.lang.String r0 = "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449"
            java.lang.String r1 = "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00"
            java.lang.String r2 = "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66"
            java.lang.String r3 = "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650"
        L11:
            java.security.spec.ECParameterSpec r4 = m2631s(r4, r0, r1, r2, r3)
            return r4
        L16:
            java.lang.String r4 = "39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319"
            java.lang.String r0 = "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643"
            java.lang.String r1 = "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef"
            java.lang.String r2 = "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7"
            java.lang.String r3 = "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f"
            goto L11
        L21:
            java.lang.String r4 = "115792089210356248762697446949407573530086143415290314195533631308867097853951"
            java.lang.String r0 = "115792089210356248762697446949407573529996955224135760342422259061068512044369"
            java.lang.String r1 = "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b"
            java.lang.String r2 = "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296"
            java.lang.String r3 = "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5"
            goto L11
    }

    /* renamed from: s */
    public static java.security.spec.ECParameterSpec m2631s(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r3)
            java.math.BigInteger r3 = new java.math.BigInteger
            r3.<init>(r4)
            java.math.BigInteger r4 = new java.math.BigInteger
            java.lang.String r1 = "3"
            r4.<init>(r1)
            java.math.BigInteger r4 = r0.subtract(r4)
            java.math.BigInteger r1 = new java.math.BigInteger
            r2 = 16
            r1.<init>(r5, r2)
            java.math.BigInteger r5 = new java.math.BigInteger
            r5.<init>(r6, r2)
            java.math.BigInteger r6 = new java.math.BigInteger
            r6.<init>(r7, r2)
            java.security.spec.ECFieldFp r7 = new java.security.spec.ECFieldFp
            r7.<init>(r0)
            java.security.spec.EllipticCurve r0 = new java.security.spec.EllipticCurve
            r0.<init>(r7, r4, r1)
            java.security.spec.ECPoint r4 = new java.security.spec.ECPoint
            r4.<init>(r5, r6)
            java.security.spec.ECParameterSpec r5 = new java.security.spec.ECParameterSpec
            r6 = 1
            r5.<init>(r0, r4, r3, r6)
            return r5
    }
}
