package mc;

/* renamed from: mc.d */
/* loaded from: classes.dex */
public final class C4532d {

    /* renamed from: a */
    public static final char[] f18433a = null;

    /* renamed from: b */
    public static final char[] f18434b = null;

    /* renamed from: c */
    public static final java.nio.charset.Charset f18435c = null;

    /* renamed from: d */
    public static final java.math.BigInteger[] f18436d = null;

    static {
            java.lang.String r0 = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'"
            char[] r0 = r0.toCharArray()
            mc.C4532d.f18433a = r0
            java.lang.String r0 = "0123456789&\r\t,:#-.$/+%*=^"
            char[] r0 = r0.toCharArray()
            mc.C4532d.f18434b = r0
            java.lang.String r0 = "ISO-8859-1"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            mc.C4532d.f18435c = r0
            r0 = 16
            java.math.BigInteger[] r0 = new java.math.BigInteger[r0]
            mc.C4532d.f18436d = r0
            java.math.BigInteger r1 = java.math.BigInteger.ONE
            r2 = 0
            r0[r2] = r1
            r1 = 900(0x384, double:4.447E-321)
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            r0 = 2
        L2d:
            java.math.BigInteger[] r2 = mc.C4532d.f18436d
            int r3 = r2.length
            if (r0 >= r3) goto L3f
            int r3 = r0 + (-1)
            r3 = r2[r3]
            java.math.BigInteger r3 = r3.multiply(r1)
            r2[r0] = r3
            int r0 = r0 + 1
            goto L2d
        L3f:
            return
    }

    /* renamed from: a */
    public static java.lang.String m10439a(int[] r6, int r7) {
            java.math.BigInteger r0 = java.math.BigInteger.ZERO
            r1 = 0
            r2 = 0
        L4:
            r3 = 1
            if (r2 >= r7) goto L20
            java.math.BigInteger[] r4 = mc.C4532d.f18436d
            int r5 = r7 - r2
            int r5 = r5 - r3
            r3 = r4[r5]
            r4 = r6[r2]
            long r4 = (long) r4
            java.math.BigInteger r4 = java.math.BigInteger.valueOf(r4)
            java.math.BigInteger r3 = r3.multiply(r4)
            java.math.BigInteger r0 = r0.add(r3)
            int r2 = r2 + 1
            goto L4
        L20:
            java.lang.String r6 = r0.toString()
            char r7 = r6.charAt(r1)
            r0 = 49
            if (r7 != r0) goto L31
            java.lang.String r6 = r6.substring(r3)
            return r6
        L31:
            sb.f r6 = sb.C6012f.m12491a()
            throw r6
    }

    /* renamed from: b */
    public static int m10440b(int[] r17, int r18, java.lang.StringBuilder r19) {
            r0 = r19
            r1 = 0
            r2 = r17[r1]
            int r2 = r2 - r18
            r3 = 1
            int r2 = r2 << r3
            int[] r2 = new int[r2]
            r4 = r17[r1]
            int r4 = r4 - r18
            int r4 = r4 << r3
            int[] r4 = new int[r4]
            r5 = r18
            r6 = 0
            r7 = 0
        L16:
            r8 = r17[r1]
            r9 = 913(0x391, float:1.28E-42)
            r10 = 900(0x384, float:1.261E-42)
            if (r5 >= r8) goto L56
            if (r6 != 0) goto L56
            int r8 = r5 + 1
            r5 = r17[r5]
            if (r5 >= r10) goto L34
            int r9 = r5 / 30
            r2[r7] = r9
            int r9 = r7 + 1
            int r5 = r5 % 30
            r2[r9] = r5
            int r7 = r7 + 2
        L32:
            r5 = r8
            goto L16
        L34:
            if (r5 == r9) goto L4b
            r9 = 928(0x3a0, float:1.3E-42)
            if (r5 == r9) goto L47
            switch(r5) {
                case 900: goto L41;
                case 901: goto L47;
                case 902: goto L47;
                default: goto L3d;
            }
        L3d:
            switch(r5) {
                case 922: goto L47;
                case 923: goto L47;
                case 924: goto L47;
                default: goto L40;
            }
        L40:
            goto L32
        L41:
            int r5 = r7 + 1
            r2[r7] = r10
            r7 = r5
            goto L32
        L47:
            int r5 = r8 + (-1)
            r6 = 1
            goto L16
        L4b:
            r2[r7] = r9
            int r5 = r8 + 1
            r8 = r17[r8]
            r4[r7] = r8
            int r7 = r7 + 1
            goto L16
        L56:
            r8 = 0
            r11 = 1
            r12 = 1
        L59:
            if (r8 >= r7) goto L18a
            r13 = r2[r8]
            int r14 = p365v.C6480g.m13148b(r11)
            r1 = 5
            r6 = 4
            r15 = 3
            r10 = 2
            r16 = 32
            r9 = 29
            if (r14 == 0) goto L133
            if (r14 == r3) goto L108
            if (r14 == r10) goto Ld1
            if (r14 == r15) goto Lb0
            if (r14 == r6) goto L94
            if (r14 == r1) goto L78
        L75:
            r1 = 913(0x391, float:1.28E-42)
            goto Lac
        L78:
            if (r13 >= r9) goto L81
            char[] r1 = mc.C4532d.f18433a
            char r16 = r1[r13]
            r11 = r12
            goto Ld9
        L81:
            if (r13 != r9) goto L84
            goto Ld0
        L84:
            r1 = 913(0x391, float:1.28E-42)
            if (r13 != r1) goto L8f
            r1 = r4[r8]
            char r1 = (char) r1
            r0.append(r1)
            goto La9
        L8f:
            r1 = 900(0x384, float:1.261E-42)
            if (r13 != r1) goto La9
            goto Lb9
        L94:
            r1 = 900(0x384, float:1.261E-42)
            r6 = 26
            if (r13 >= r6) goto La1
            int r13 = r13 + 65
            char r6 = (char) r13
            r9 = r6
            r11 = r12
            goto L13b
        La1:
            if (r13 != r6) goto La6
            r11 = r12
            goto L142
        La6:
            if (r13 != r1) goto La9
            goto Lb9
        La9:
            r11 = r12
            r1 = 913(0x391, float:1.28E-42)
        Lac:
            r6 = 900(0x384, float:1.261E-42)
            goto L17b
        Lb0:
            if (r13 >= r9) goto Lb7
            char[] r1 = mc.C4532d.f18433a
            char r16 = r1[r13]
            goto Ld9
        Lb7:
            if (r13 != r9) goto Lc1
        Lb9:
            r1 = 913(0x391, float:1.28E-42)
            r6 = 900(0x384, float:1.261E-42)
        Lbd:
            r9 = 0
            r11 = 1
            goto L17c
        Lc1:
            r1 = 913(0x391, float:1.28E-42)
            if (r13 != r1) goto Lcc
            r1 = r4[r8]
        Lc7:
            char r1 = (char) r1
            r0.append(r1)
            goto L75
        Lcc:
            r1 = 900(0x384, float:1.261E-42)
            if (r13 != r1) goto L75
        Ld0:
            goto Lb9
        Ld1:
            r1 = 25
            if (r13 >= r1) goto Ldd
            char[] r1 = mc.C4532d.f18434b
            char r16 = r1[r13]
        Ld9:
            r9 = r16
            goto L13b
        Ldd:
            if (r13 != r1) goto Le7
            r1 = 913(0x391, float:1.28E-42)
            r6 = 900(0x384, float:1.261E-42)
            r9 = 0
            r11 = 4
            goto L17c
        Le7:
            r1 = 26
            if (r13 != r1) goto Led
            goto L142
        Led:
            r1 = 27
            if (r13 != r1) goto Lf3
            goto L14d
        Lf3:
            r1 = 28
            if (r13 != r1) goto Lf8
            goto Lb9
        Lf8:
            if (r13 != r9) goto Lfc
            goto L161
        Lfc:
            r1 = 913(0x391, float:1.28E-42)
            if (r13 != r1) goto L103
            r1 = r4[r8]
            goto Lc7
        L103:
            r1 = 900(0x384, float:1.261E-42)
            if (r13 != r1) goto L75
            goto Ld0
        L108:
            r6 = 26
            if (r13 >= r6) goto L10f
            int r13 = r13 + 97
            goto L139
        L10f:
            if (r13 != r6) goto L112
            goto L142
        L112:
            r6 = 27
            if (r13 != r6) goto L11f
            r12 = r11
            r1 = 913(0x391, float:1.28E-42)
            r6 = 900(0x384, float:1.261E-42)
            r9 = 0
            r11 = 5
            goto L17c
        L11f:
            r1 = 28
            if (r13 != r1) goto L124
            goto L158
        L124:
            if (r13 != r9) goto L127
            goto L161
        L127:
            r1 = 913(0x391, float:1.28E-42)
            if (r13 != r1) goto L12e
            r1 = r4[r8]
            goto Lc7
        L12e:
            r1 = 900(0x384, float:1.261E-42)
            if (r13 != r1) goto L75
            goto Lb9
        L133:
            r1 = 26
            if (r13 >= r1) goto L140
            int r13 = r13 + 65
        L139:
            char r1 = (char) r13
            r9 = r1
        L13b:
            r1 = 913(0x391, float:1.28E-42)
            r6 = 900(0x384, float:1.261E-42)
            goto L17c
        L140:
            if (r13 != r1) goto L149
        L142:
            r1 = 913(0x391, float:1.28E-42)
            r6 = 900(0x384, float:1.261E-42)
            r9 = 32
            goto L17c
        L149:
            r1 = 27
            if (r13 != r1) goto L154
        L14d:
            r1 = 913(0x391, float:1.28E-42)
            r6 = 900(0x384, float:1.261E-42)
            r9 = 0
            r11 = 2
            goto L17c
        L154:
            r1 = 28
            if (r13 != r1) goto L15f
        L158:
            r1 = 913(0x391, float:1.28E-42)
            r6 = 900(0x384, float:1.261E-42)
            r9 = 0
            r11 = 3
            goto L17c
        L15f:
            if (r13 != r9) goto L169
        L161:
            r12 = r11
            r1 = 913(0x391, float:1.28E-42)
            r6 = 900(0x384, float:1.261E-42)
            r9 = 0
            r11 = 6
            goto L17c
        L169:
            r1 = 913(0x391, float:1.28E-42)
            if (r13 != r1) goto L175
            r6 = r4[r8]
            char r6 = (char) r6
            r0.append(r6)
            goto Lac
        L175:
            r6 = 900(0x384, float:1.261E-42)
            if (r13 != r6) goto L17b
            goto Lbd
        L17b:
            r9 = 0
        L17c:
            if (r9 == 0) goto L181
            r0.append(r9)
        L181:
            int r8 = r8 + 1
            r1 = 0
            r9 = 913(0x391, float:1.28E-42)
            r10 = 900(0x384, float:1.261E-42)
            goto L59
        L18a:
            return r5
    }
}
