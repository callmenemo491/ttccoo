package p275pc;

/* renamed from: pc.d */
/* loaded from: classes.dex */
public final class C5384d {

    /* renamed from: a */
    public static final byte[] f21386a = null;

    /* renamed from: b */
    public static final byte[] f21387b = null;

    /* renamed from: c */
    public static final byte[] f21388c = null;

    /* renamed from: d */
    public static final byte[] f21389d = null;

    /* renamed from: e */
    public static final java.nio.charset.Charset f21390e = null;

    static {
            r0 = 30
            byte[] r1 = new byte[r0]
            r1 = {x0050: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0} // fill-array
            p275pc.C5384d.f21386a = r1
            byte[] r0 = new byte[r0]
            r0 = {x0064: FILL_ARRAY_DATA , data: [59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0} // fill-array
            p275pc.C5384d.f21387b = r0
            r0 = 128(0x80, float:1.8E-43)
            byte[] r1 = new byte[r0]
            p275pc.C5384d.f21388c = r1
            byte[] r0 = new byte[r0]
            p275pc.C5384d.f21389d = r0
            java.lang.String r0 = "ISO-8859-1"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            p275pc.C5384d.f21390e = r0
            r0 = -1
            java.util.Arrays.fill(r1, r0)
            r1 = 0
            r2 = 0
        L28:
            byte[] r3 = p275pc.C5384d.f21386a
            int r4 = r3.length
            if (r2 >= r4) goto L39
            r3 = r3[r2]
            if (r3 <= 0) goto L36
            byte[] r4 = p275pc.C5384d.f21388c
            byte r5 = (byte) r2
            r4[r3] = r5
        L36:
            int r2 = r2 + 1
            goto L28
        L39:
            byte[] r2 = p275pc.C5384d.f21389d
            java.util.Arrays.fill(r2, r0)
        L3e:
            byte[] r0 = p275pc.C5384d.f21387b
            int r2 = r0.length
            if (r1 >= r2) goto L4f
            r0 = r0[r1]
            if (r0 <= 0) goto L4c
            byte[] r2 = p275pc.C5384d.f21389d
            byte r3 = (byte) r1
            r2[r0] = r3
        L4c:
            int r1 = r1 + 1
            goto L3e
        L4f:
            return
    }

    /* renamed from: a */
    public static void m11734a(byte[] r10, int r11, int r12, int r13, java.lang.StringBuilder r14) {
            r0 = 1
            if (r12 != r0) goto L8
            if (r13 != 0) goto L8
            r13 = 913(0x391, float:1.28E-42)
            goto L11
        L8:
            int r13 = r12 % 6
            if (r13 != 0) goto Lf
            r13 = 924(0x39c, float:1.295E-42)
            goto L11
        Lf:
            r13 = 901(0x385, float:1.263E-42)
        L11:
            r14.append(r13)
            r13 = 6
            if (r12 < r13) goto L50
            r0 = 5
            char[] r1 = new char[r0]
            r2 = r11
        L1b:
            int r3 = r11 + r12
            int r3 = r3 - r2
            if (r3 < r13) goto L51
            r3 = 0
            r5 = 0
            r6 = 0
        L24:
            if (r6 >= r13) goto L34
            r7 = 8
            long r3 = r3 << r7
            int r7 = r2 + r6
            r7 = r10[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            long r7 = (long) r7
            long r3 = r3 + r7
            int r6 = r6 + 1
            goto L24
        L34:
            if (r5 >= r0) goto L42
            r6 = 900(0x384, double:4.447E-321)
            long r8 = r3 % r6
            int r9 = (int) r8
            char r8 = (char) r9
            r1[r5] = r8
            long r3 = r3 / r6
            int r5 = r5 + 1
            goto L34
        L42:
            r3 = 4
        L43:
            if (r3 < 0) goto L4d
            char r4 = r1[r3]
            r14.append(r4)
            int r3 = r3 + (-1)
            goto L43
        L4d:
            int r2 = r2 + 6
            goto L1b
        L50:
            r2 = r11
        L51:
            int r13 = r11 + r12
            if (r2 >= r13) goto L60
            r13 = r10[r2]
            r13 = r13 & 255(0xff, float:3.57E-43)
            char r13 = (char) r13
            r14.append(r13)
            int r2 = r2 + 1
            goto L51
        L60:
            return
    }

    /* renamed from: b */
    public static void m11735b(java.lang.String r9, int r10, int r11, java.lang.StringBuilder r12) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r11 / 3
            int r1 = r1 + 1
            r0.<init>(r1)
            r1 = 900(0x384, double:4.447E-321)
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            r2 = 0
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r2)
            r3 = 0
            r4 = 0
        L17:
            if (r4 >= r11) goto L67
            r0.setLength(r3)
            r5 = 44
            int r6 = r11 - r4
            int r5 = java.lang.Math.min(r5, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "1"
            r6.<init>(r7)
            int r7 = r10 + r4
            int r8 = r7 + r5
            java.lang.String r7 = r9.substring(r7, r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.math.BigInteger r7 = new java.math.BigInteger
            r7.<init>(r6)
        L3f:
            java.math.BigInteger r6 = r7.mod(r1)
            int r6 = r6.intValue()
            char r6 = (char) r6
            r0.append(r6)
            java.math.BigInteger r7 = r7.divide(r1)
            boolean r6 = r7.equals(r2)
            if (r6 == 0) goto L3f
            int r6 = r0.length()
        L59:
            int r6 = r6 + (-1)
            if (r6 < 0) goto L65
            char r7 = r0.charAt(r6)
            r12.append(r7)
            goto L59
        L65:
            int r4 = r4 + r5
            goto L17
        L67:
            return
    }

    /* renamed from: c */
    public static int m11736c(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = r20
            r8 = 0
        L11:
            int r9 = r17 + r8
            char r10 = r0.charAt(r9)
            r11 = 26
            r12 = 32
            r13 = 28
            r14 = 27
            r15 = 29
            if (r7 == 0) goto La0
            if (r7 == r6) goto L7b
            r11 = -1
            if (r7 == r4) goto L3b
            byte[] r9 = p275pc.C5384d.f21389d
            r12 = r9[r10]
            if (r12 == r11) goto L30
            r11 = 1
            goto L31
        L30:
            r11 = 0
        L31:
            if (r11 == 0) goto L37
            r9 = r9[r10]
            goto Lcf
        L37:
            r3.append(r15)
            goto L50
        L3b:
            boolean r12 = m11740g(r10)
            if (r12 == 0) goto L47
            byte[] r9 = p275pc.C5384d.f21388c
            r9 = r9[r10]
            goto Lcf
        L47:
            boolean r12 = m11738e(r10)
            if (r12 == 0) goto L52
            r3.append(r13)
        L50:
            r7 = 0
            goto L11
        L52:
            boolean r12 = m11737d(r10)
            if (r12 == 0) goto L59
            goto Lb6
        L59:
            int r9 = r9 + 1
            if (r9 >= r1) goto L73
            char r9 = r0.charAt(r9)
            byte[] r12 = p275pc.C5384d.f21389d
            r9 = r12[r9]
            if (r9 == r11) goto L69
            r9 = 1
            goto L6a
        L69:
            r9 = 0
        L6a:
            if (r9 == 0) goto L73
            r7 = 3
            r9 = 25
            r3.append(r9)
            goto L11
        L73:
            r3.append(r15)
            byte[] r9 = p275pc.C5384d.f21389d
            r9 = r9[r10]
            goto Lcf
        L7b:
            boolean r9 = m11737d(r10)
            if (r9 == 0) goto L87
            if (r10 != r12) goto L84
            goto La8
        L84:
            int r10 = r10 + (-97)
            goto Lae
        L87:
            boolean r9 = m11738e(r10)
            if (r9 == 0) goto L91
            r3.append(r14)
            goto Lac
        L91:
            boolean r9 = m11740g(r10)
            if (r9 == 0) goto L98
            goto Lc2
        L98:
            r3.append(r15)
            byte[] r9 = p275pc.C5384d.f21389d
            r9 = r9[r10]
            goto Lcf
        La0:
            boolean r9 = m11738e(r10)
            if (r9 == 0) goto Lb0
            if (r10 != r12) goto Lac
        La8:
            r3.append(r11)
            goto Ld3
        Lac:
            int r10 = r10 + (-65)
        Lae:
            char r9 = (char) r10
            goto Ld0
        Lb0:
            boolean r9 = m11737d(r10)
            if (r9 == 0) goto Lbc
        Lb6:
            r3.append(r14)
            r7 = 1
            goto L11
        Lbc:
            boolean r9 = m11740g(r10)
            if (r9 == 0) goto Lc8
        Lc2:
            r3.append(r13)
            r7 = 2
            goto L11
        Lc8:
            r3.append(r15)
            byte[] r9 = p275pc.C5384d.f21389d
            r9 = r9[r10]
        Lcf:
            char r9 = (char) r9
        Ld0:
            r3.append(r9)
        Ld3:
            int r8 = r8 + 1
            if (r8 < r1) goto L11
            int r0 = r3.length()
            r1 = 0
            r8 = 0
        Ldd:
            if (r1 >= r0) goto Lfb
            int r9 = r1 % 2
            if (r9 == 0) goto Le5
            r9 = 1
            goto Le6
        Le5:
            r9 = 0
        Le6:
            if (r9 == 0) goto Lf4
            int r8 = r8 * 30
            char r9 = r3.charAt(r1)
            int r9 = r9 + r8
            char r8 = (char) r9
            r2.append(r8)
            goto Lf8
        Lf4:
            char r8 = r3.charAt(r1)
        Lf8:
            int r1 = r1 + 1
            goto Ldd
        Lfb:
            int r0 = r0 % r4
            if (r0 == 0) goto L105
            int r8 = r8 * 30
            int r8 = r8 + r15
            char r0 = (char) r8
            r2.append(r0)
        L105:
            return r7
    }

    /* renamed from: d */
    public static boolean m11737d(char r1) {
            r0 = 32
            if (r1 == r0) goto Lf
            r0 = 97
            if (r1 < r0) goto Ld
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 > r0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    /* renamed from: e */
    public static boolean m11738e(char r1) {
            r0 = 32
            if (r1 == r0) goto Lf
            r0 = 65
            if (r1 < r0) goto Ld
            r0 = 90
            if (r1 > r0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    /* renamed from: f */
    public static boolean m11739f(char r1) {
            r0 = 48
            if (r1 < r0) goto La
            r0 = 57
            if (r1 > r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    /* renamed from: g */
    public static boolean m11740g(char r1) {
            byte[] r0 = p275pc.C5384d.f21388c
            r1 = r0[r1]
            r0 = -1
            if (r1 == r0) goto L9
            r1 = 1
            return r1
        L9:
            r1 = 0
            return r1
    }
}
