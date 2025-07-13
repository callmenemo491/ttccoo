package p084f0;

/* renamed from: f0.a */
/* loaded from: classes.dex */
public final class C1938a {

    /* renamed from: a */
    public static final java.lang.ThreadLocal<double[]> f8479a = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            p084f0.C1938a.f8479a = r0
            return
    }

    /* renamed from: a */
    public static void m4816a(int r7, int r8, int r9, float[] r10) {
            float r7 = (float) r7
            r0 = 1132396544(0x437f0000, float:255.0)
            float r7 = r7 / r0
            float r8 = (float) r8
            float r8 = r8 / r0
            float r9 = (float) r9
            float r9 = r9 / r0
            float r0 = java.lang.Math.max(r8, r9)
            float r0 = java.lang.Math.max(r7, r0)
            float r1 = java.lang.Math.min(r8, r9)
            float r1 = java.lang.Math.min(r7, r1)
            float r2 = r0 - r1
            float r3 = r0 + r1
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L29
            r7 = 0
            r8 = 0
            goto L4e
        L29:
            int r1 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r1 != 0) goto L34
            float r8 = r8 - r9
            float r8 = r8 / r2
            r7 = 1086324736(0x40c00000, float:6.0)
            float r8 = r8 % r7
            r7 = r8
            goto L43
        L34:
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 != 0) goto L3d
            float r7 = p065e0.C1496a.m4063a(r9, r7, r2, r4)
            goto L43
        L3d:
            r9 = 1082130432(0x40800000, float:4.0)
            float r7 = p065e0.C1496a.m4063a(r7, r8, r2, r9)
        L43:
            float r4 = r4 * r3
            float r4 = r4 - r5
            float r8 = java.lang.Math.abs(r4)
            float r8 = r5 - r8
            float r8 = r2 / r8
        L4e:
            r9 = 1114636288(0x42700000, float:60.0)
            float r7 = r7 * r9
            r9 = 1135869952(0x43b40000, float:360.0)
            float r7 = r7 % r9
            int r0 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r0 >= 0) goto L5a
            float r7 = r7 + r9
        L5a:
            r0 = 0
            float r7 = m4823h(r7, r6, r9)
            r10[r0] = r7
            r7 = 1
            float r8 = m4823h(r8, r6, r5)
            r10[r7] = r8
            r7 = 2
            float r8 = m4823h(r3, r6, r5)
            r10[r7] = r8
            return
    }

    /* renamed from: b */
    public static int m4817b(double r17, double r19, double r21) {
            r0 = 4614479601276245823(0x4009ecbfb15b573f, double:3.2406)
            double r0 = r0 * r17
            r2 = -4613770284334934970(0xbff8985f06f69446, double:-1.5372)
            double r2 = r2 * r19
            double r2 = r2 + r0
            r0 = -4620718437840042171(0xbfdfe90ff9724745, double:-0.4986)
            double r0 = r0 * r21
            double r0 = r0 + r2
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 / r2
            r4 = -4616469741951580845(0xbfef013a92a30553, double:-0.9689)
            double r4 = r4 * r17
            r6 = 4611126671353668488(0x3ffe0346dc5d6388, double:1.8758)
            double r6 = r6 * r19
            double r6 = r6 + r4
            r4 = 4586141601340942451(0x3fa53f7ced916873, double:0.0415)
            double r4 = r4 * r21
            double r4 = r4 + r6
            double r4 = r4 / r2
            r6 = 4588188037011619604(0x3fac84b5dcc63f14, double:0.0557)
            double r6 = r6 * r17
            r8 = -4626854141972371735(0xbfca1cac083126e9, double:-0.204)
            double r8 = r8 * r19
            double r8 = r8 + r6
            r6 = 4607439123978777526(0x3ff0e978d4fdf3b6, double:1.057)
            double r6 = r6 * r21
            double r6 = r6 + r8
            double r6 = r6 / r2
            r2 = 4588087156379966505(0x3fac28f5c28f5c29, double:0.055)
            r8 = 4601177619296856747(0x3fdaaaaaaaaaaaab, double:0.4166666666666667)
            r10 = 4607430116779522785(0x3ff0e147ae147ae1, double:1.055)
            r12 = 4623462931452961751(0x4029d70a3d70a3d7, double:12.92)
            r14 = 4569365555819558681(0x3f69a5c37387b719, double:0.0031308)
            int r16 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r16 <= 0) goto L6f
            double r0 = java.lang.Math.pow(r0, r8)
            double r0 = r0 * r10
            double r0 = r0 - r2
            goto L71
        L6f:
            double r0 = r0 * r12
        L71:
            int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r16 <= 0) goto L7d
            double r4 = java.lang.Math.pow(r4, r8)
            double r4 = r4 * r10
            double r4 = r4 - r2
            goto L7f
        L7d:
            double r4 = r4 * r12
        L7f:
            int r16 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r16 <= 0) goto L8b
            double r6 = java.lang.Math.pow(r6, r8)
            double r6 = r6 * r10
            double r6 = r6 - r2
            goto L8d
        L8b:
            double r6 = r6 * r12
        L8d:
            r2 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r0 = r0 * r2
            long r0 = java.lang.Math.round(r0)
            int r1 = (int) r0
            r0 = 0
            r8 = 255(0xff, float:3.57E-43)
            int r1 = m4824i(r1, r0, r8)
            double r4 = r4 * r2
            long r4 = java.lang.Math.round(r4)
            int r5 = (int) r4
            int r4 = m4824i(r5, r0, r8)
            double r6 = r6 * r2
            long r2 = java.lang.Math.round(r6)
            int r3 = (int) r2
            int r0 = m4824i(r3, r0, r8)
            int r0 = android.graphics.Color.rgb(r1, r4, r0)
            return r0
    }

    /* renamed from: c */
    public static double m4818c(int r4, int r5) {
            int r0 = android.graphics.Color.alpha(r5)
            r1 = 255(0xff, float:3.57E-43)
            if (r0 != r1) goto L2b
            int r0 = android.graphics.Color.alpha(r4)
            if (r0 >= r1) goto L12
            int r4 = m4821f(r4, r5)
        L12:
            double r0 = m4819d(r4)
            r2 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            double r0 = r0 + r2
            double r4 = m4819d(r5)
            double r4 = r4 + r2
            double r2 = java.lang.Math.max(r0, r4)
            double r4 = java.lang.Math.min(r0, r4)
            double r2 = r2 / r4
            return r2
        L2b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "background can not be translucent: #"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r5 = java.lang.Integer.toHexString(r5)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
    }

    /* renamed from: d */
    public static double m4819d(int r19) {
            java.lang.ThreadLocal<double[]> r0 = p084f0.C1938a.f8479a
            java.lang.Object r1 = r0.get()
            double[] r1 = (double[]) r1
            r2 = 3
            if (r1 != 0) goto L10
            double[] r1 = new double[r2]
            r0.set(r1)
        L10:
            int r0 = android.graphics.Color.red(r19)
            int r3 = android.graphics.Color.green(r19)
            int r4 = android.graphics.Color.blue(r19)
            int r5 = r1.length
            if (r5 != r2) goto Lcd
            double r5 = (double) r0
            r7 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r5 = r5 / r7
            r9 = 4623462931452961751(0x4029d70a3d70a3d7, double:12.92)
            r11 = 4588087156379966505(0x3fac28f5c28f5c29, double:0.055)
            r13 = 4585990280393462802(0x3fa4b5dcc63f1412, double:0.04045)
            r15 = 4607430116779522785(0x3ff0e147ae147ae1, double:1.055)
            r7 = 4612586738352862003(0x4003333333333333, double:2.4)
            int r0 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r0 >= 0) goto L45
            double r5 = r5 / r9
            goto L4b
        L45:
            double r5 = r5 + r11
            double r5 = r5 / r15
            double r5 = java.lang.Math.pow(r5, r7)
        L4b:
            double r2 = (double) r3
            r17 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r2 = r2 / r17
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 >= 0) goto L59
            double r2 = r2 / r9
            goto L5f
        L59:
            double r2 = r2 + r11
            double r2 = r2 / r15
            double r2 = java.lang.Math.pow(r2, r7)
        L5f:
            double r7 = (double) r4
            double r7 = r7 / r17
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 >= 0) goto L68
            double r7 = r7 / r9
            goto L73
        L68:
            double r7 = r7 + r11
            double r7 = r7 / r15
            r9 = 4612586738352862003(0x4003333333333333, double:2.4)
            double r7 = java.lang.Math.pow(r7, r9)
        L73:
            r0 = 0
            r9 = 4601100757863216290(0x3fda64c2f837b4a2, double:0.4124)
            double r9 = r9 * r5
            r11 = 4600113568824896677(0x3fd6e2eb1c432ca5, double:0.3576)
            double r11 = r11 * r2
            double r11 = r11 + r9
            r9 = 4595671218152458420(0x3fc71a9fbe76c8b4, double:0.1805)
            double r9 = r9 * r7
            double r9 = r9 + r11
            r11 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r9 = r9 * r11
            r1[r0] = r9
            r9 = 4596827742536767164(0x3fcb367a0f9096bc, double:0.2126)
            double r9 = r9 * r5
            r13 = 4604617168452267173(0x3fe6e2eb1c432ca5, double:0.7152)
            double r13 = r13 * r2
            double r13 = r13 + r9
            r9 = 4589866978952703325(0x3fb27bb2fec56d5d, double:0.0722)
            double r9 = r9 * r7
            double r9 = r9 + r13
            double r9 = r9 * r11
            r0 = 1
            r1[r0] = r9
            r4 = 2
            r9 = 4581220067668151973(0x3f93c36113404ea5, double:0.0193)
            double r5 = r5 * r9
            r9 = 4593253685872485938(0x3fbe83e425aee632, double:0.1192)
            double r2 = r2 * r9
            double r2 = r2 + r5
            r5 = 4606736562436907729(0x3fee6a7ef9db22d1, double:0.9505)
            double r7 = r7 * r5
            double r7 = r7 + r2
            double r7 = r7 * r11
            r1[r4] = r7
            r0 = r1[r0]
            double r0 = r0 / r11
            return r0
        Lcd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "outXyz must have a length of 3."
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: e */
    public static int m4820e(int r8, int r9, float r10) {
            int r0 = android.graphics.Color.alpha(r9)
            r1 = 255(0xff, float:3.57E-43)
            if (r0 != r1) goto L39
            int r0 = m4825j(r8, r1)
            double r2 = m4818c(r0, r9)
            double r4 = (double) r10
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 >= 0) goto L17
            r8 = -1
            return r8
        L17:
            r10 = 0
            r0 = 0
        L19:
            r2 = 10
            if (r10 > r2) goto L38
            int r2 = r1 - r0
            r3 = 1
            if (r2 <= r3) goto L38
            int r2 = r0 + r1
            int r2 = r2 / 2
            int r3 = m4825j(r8, r2)
            double r6 = m4818c(r3, r9)
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 >= 0) goto L34
            r0 = r2
            goto L35
        L34:
            r1 = r2
        L35:
            int r10 = r10 + 1
            goto L19
        L38:
            return r1
        L39:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "background can not be translucent: #"
            java.lang.StringBuilder r10 = android.support.v4.media.C0144c.m256a(r10)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
    }

    /* renamed from: f */
    public static int m4821f(int r6, int r7) {
            int r0 = android.graphics.Color.alpha(r7)
            int r1 = android.graphics.Color.alpha(r6)
            int r2 = 255 - r0
            int r3 = 255 - r1
            int r3 = r3 * r2
            int r3 = r3 / 255
            int r2 = 255 - r3
            int r3 = android.graphics.Color.red(r6)
            int r4 = android.graphics.Color.red(r7)
            int r3 = m4822g(r3, r1, r4, r0, r2)
            int r4 = android.graphics.Color.green(r6)
            int r5 = android.graphics.Color.green(r7)
            int r4 = m4822g(r4, r1, r5, r0, r2)
            int r6 = android.graphics.Color.blue(r6)
            int r7 = android.graphics.Color.blue(r7)
            int r6 = m4822g(r6, r1, r7, r0, r2)
            int r6 = android.graphics.Color.argb(r2, r3, r4, r6)
            return r6
    }

    /* renamed from: g */
    public static int m4822g(int r0, int r1, int r2, int r3, int r4) {
            if (r4 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r0 = r0 * 255
            int r0 = r0 * r1
            int r2 = r2 * r3
            int r1 = 255 - r1
            int r1 = r1 * r2
            int r1 = r1 + r0
            int r4 = r4 * 255
            int r1 = r1 / r4
            return r1
    }

    /* renamed from: h */
    public static float m4823h(float r1, float r2, float r3) {
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L6
            r1 = r2
            goto Lb
        L6:
            int r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r2 <= 0) goto Lb
            r1 = r3
        Lb:
            return r1
    }

    /* renamed from: i */
    public static int m4824i(int r0, int r1, int r2) {
            if (r0 >= r1) goto L4
            r0 = r1
            goto L7
        L4:
            if (r0 <= r2) goto L7
            r0 = r2
        L7:
            return r0
    }

    /* renamed from: j */
    public static int m4825j(int r1, int r2) {
            if (r2 < 0) goto Le
            r0 = 255(0xff, float:3.57E-43)
            if (r2 > r0) goto Le
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            int r2 = r2 << 24
            r1 = r1 | r2
            return r1
        Le:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "alpha must be between 0 and 255."
            r1.<init>(r2)
            throw r1
    }
}
