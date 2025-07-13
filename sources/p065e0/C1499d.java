package p065e0;

/* renamed from: e0.d */
/* loaded from: classes.dex */
public final class C1499d {

    /* renamed from: a */
    public static final java.lang.ThreadLocal<android.util.TypedValue> f7297a = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            p065e0.C1499d.f7297a = r0
            return
    }

    /* renamed from: a */
    public static android.content.res.ColorStateList m4072a(android.content.res.Resources r4, org.xmlpull.v1.XmlPullParser r5, android.content.res.Resources.Theme r6) {
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L4:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto Lf
            r3 = 1
            if (r1 == r3) goto Lf
            goto L4
        Lf:
            if (r1 != r2) goto L16
            android.content.res.ColorStateList r4 = m4073b(r4, r5, r0, r6)
            return r4
        L16:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
    }

    /* renamed from: b */
    public static android.content.res.ColorStateList m4073b(android.content.res.Resources r30, org.xmlpull.v1.XmlPullParser r31, android.util.AttributeSet r32, android.content.res.Resources.Theme r33) {
            r0 = r30
            r1 = r32
            r2 = r33
            java.lang.String r3 = r31.getName()
            java.lang.String r4 = "selector"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L34a
            int r3 = r31.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r7 = 0
            r8 = 0
        L20:
            int r9 = r31.next()
            if (r9 == r4) goto L337
            int r10 = r31.getDepth()
            r11 = 3
            if (r10 >= r3) goto L2f
            if (r9 == r11) goto L337
        L2f:
            r12 = 2
            if (r9 != r12) goto L325
            if (r10 > r3) goto L325
            java.lang.String r9 = r31.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L42
            goto L325
        L42:
            int[] r9 = p017b0.C0653a.f3794a
            if (r2 != 0) goto L4b
            android.content.res.TypedArray r9 = r0.obtainAttributes(r1, r9)
            goto L4f
        L4b:
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r1, r9, r7, r7)
        L4f:
            r10 = -1
            int r13 = r9.getResourceId(r7, r10)
            r14 = -65281(0xffffffffffff00ff, float:NaN)
            if (r13 == r10) goto L8a
            java.lang.ThreadLocal<android.util.TypedValue> r10 = p065e0.C1499d.f7297a
            java.lang.Object r15 = r10.get()
            android.util.TypedValue r15 = (android.util.TypedValue) r15
            if (r15 != 0) goto L6b
            android.util.TypedValue r15 = new android.util.TypedValue
            r15.<init>()
            r10.set(r15)
        L6b:
            r0.getValue(r13, r15, r4)
            int r10 = r15.type
            r15 = 28
            if (r10 < r15) goto L7a
            r15 = 31
            if (r10 > r15) goto L7a
            r10 = 1
            goto L7b
        L7a:
            r10 = 0
        L7b:
            if (r10 != 0) goto L8a
            android.content.res.XmlResourceParser r10 = r0.getXml(r13)     // Catch: java.lang.Exception -> L8a
            android.content.res.ColorStateList r10 = m4072a(r0, r10, r2)     // Catch: java.lang.Exception -> L8a
            int r7 = r10.getDefaultColor()     // Catch: java.lang.Exception -> L8a
            goto L8e
        L8a:
            int r7 = r9.getColor(r7, r14)
        L8e:
            boolean r10 = r9.hasValue(r4)
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r10 == 0) goto L9b
            float r4 = r9.getFloat(r4, r13)
            goto La8
        L9b:
            boolean r4 = r9.hasValue(r11)
            if (r4 == 0) goto La6
            float r4 = r9.getFloat(r11, r13)
            goto La8
        La6:
            r4 = 1065353216(0x3f800000, float:1.0)
        La8:
            boolean r10 = p158j0.C3379a.m7754a()
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            r13 = 4
            if (r10 == 0) goto Lbc
            boolean r10 = r9.hasValue(r12)
            if (r10 == 0) goto Lbc
            float r10 = r9.getFloat(r12, r11)
            goto Lc0
        Lbc:
            float r10 = r9.getFloat(r13, r11)
        Lc0:
            r9.recycle()
            int r9 = r32.getAttributeCount()
            int[] r11 = new int[r9]
            r12 = 0
            r13 = 0
        Lcb:
            if (r12 >= r9) goto Lf8
            int r14 = r1.getAttributeNameResource(r12)
            r15 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r14 == r15) goto Lf3
            r15 = 16843551(0x101031f, float:2.3695797E-38)
            if (r14 == r15) goto Lf3
            r15 = 2130968625(0x7f040031, float:1.7545909E38)
            if (r14 == r15) goto Lf3
            r15 = 2130969121(0x7f040221, float:1.7546915E38)
            if (r14 == r15) goto Lf3
            int r15 = r13 + 1
            r0 = 0
            boolean r0 = r1.getAttributeBooleanValue(r12, r0)
            if (r0 == 0) goto Lef
            goto Lf0
        Lef:
            int r14 = -r14
        Lf0:
            r11[r13] = r14
            r13 = r15
        Lf3:
            int r12 = r12 + 1
            r0 = r30
            goto Lcb
        Lf8:
            int[] r0 = android.util.StateSet.trimStateSet(r11, r13)
            r9 = 1120403456(0x42c80000, float:100.0)
            r11 = 0
            int r12 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r12 < 0) goto L109
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 > 0) goto L109
            r9 = 1
            goto L10a
        L109:
            r9 = 0
        L10a:
            r12 = 1065353216(0x3f800000, float:1.0)
            int r12 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r12 != 0) goto L11a
            if (r9 != 0) goto L11a
            r18 = r0
            r21 = r3
            r9 = r5
            r11 = r6
            goto L2e7
        L11a:
            int r12 = android.graphics.Color.alpha(r7)
            float r12 = (float) r12
            float r12 = r12 * r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r4
            int r4 = (int) r12
            r12 = 255(0xff, float:3.57E-43)
            r13 = 0
            int r4 = p064e.C1492f.m4042b(r4, r13, r12)
            if (r9 == 0) goto L2d9
            e0.b r7 = p065e0.C1497b.m4064a(r7)
            float r9 = r7.f7284a
            float r7 = r7.f7285b
            e0.k r12 = p065e0.C1506k.f7328k
            double r13 = (double) r7
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 < 0) goto L2ce
            int r13 = java.lang.Math.round(r10)
            double r13 = (double) r13
            r15 = 0
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 <= 0) goto L2ce
            int r13 = java.lang.Math.round(r10)
            double r13 = (double) r13
            r15 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 < 0) goto L157
            goto L2ce
        L157:
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L15d
            r9 = 0
            goto L163
        L15d:
            r11 = 1135869952(0x43b40000, float:360.0)
            float r9 = java.lang.Math.min(r11, r9)
        L163:
            r11 = 0
            r13 = 1
            r14 = 0
            r13 = r11
            r14 = 1
            r15 = 0
            r11 = r7
        L16a:
            float r16 = r15 - r7
            float r16 = java.lang.Math.abs(r16)
            r17 = 1053609165(0x3ecccccd, float:0.4)
            int r16 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r16 < 0) goto L2c0
            r16 = 1148846080(0x447a0000, float:1000.0)
            r17 = 1148846080(0x447a0000, float:1000.0)
            r18 = 0
            r19 = 1120403456(0x42c80000, float:100.0)
            r20 = 0
            r1 = 0
            r2 = 1120403456(0x42c80000, float:100.0)
        L184:
            float r18 = r1 - r2
            float r18 = java.lang.Math.abs(r18)
            r19 = 1008981770(0x3c23d70a, float:0.01)
            r21 = r3
            r3 = 1073741824(0x40000000, float:2.0)
            int r18 = (r18 > r19 ? 1 : (r18 == r19 ? 0 : -1))
            if (r18 <= 0) goto L288
            r18 = r0
            float r0 = p065e0.C1496a.m4063a(r2, r1, r3, r1)
            e0.b r3 = p065e0.C1497b.m4065b(r0, r11, r9)
            r22 = r0
            e0.k r0 = p065e0.C1506k.f7328k
            int r0 = r3.m4068e(r0)
            int r3 = android.graphics.Color.red(r0)
            float r3 = p065e0.C1498c.m4070b(r3)
            int r23 = android.graphics.Color.green(r0)
            float r23 = p065e0.C1498c.m4070b(r23)
            int r24 = android.graphics.Color.blue(r0)
            float r24 = p065e0.C1498c.m4070b(r24)
            float[][] r25 = p065e0.C1498c.f7296d
            r26 = 1
            r27 = r25[r26]
            r28 = 0
            r27 = r27[r28]
            float r3 = r3 * r27
            r27 = r25[r26]
            r27 = r27[r26]
            float r23 = r23 * r27
            float r23 = r23 + r3
            r3 = r25[r26]
            r25 = 2
            r3 = r3[r25]
            float r24 = r24 * r3
            float r24 = r24 + r23
            r3 = 1120403456(0x42c80000, float:100.0)
            float r3 = r24 / r3
            r23 = 1007753895(0x3c111aa7, float:0.008856452)
            int r23 = (r3 > r23 ? 1 : (r3 == r23 ? 0 : -1))
            if (r23 > 0) goto L1f2
            r23 = 1147261687(0x4461d2f7, float:903.2963)
            float r3 = r3 * r23
            r23 = r1
            r24 = r2
            goto L204
        L1f2:
            r23 = r1
            r24 = r2
            double r1 = (double) r3
            double r1 = java.lang.Math.cbrt(r1)
            float r1 = (float) r1
            r2 = 1122500608(0x42e80000, float:116.0)
            float r1 = r1 * r2
            r2 = 1098907648(0x41800000, float:16.0)
            float r3 = r1 - r2
        L204:
            float r1 = r10 - r3
            float r1 = java.lang.Math.abs(r1)
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L25f
            e0.b r0 = p065e0.C1497b.m4064a(r0)
            float r2 = r0.f7286c
            r25 = r1
            float r1 = r0.f7285b
            e0.b r1 = p065e0.C1497b.m4065b(r2, r1, r9)
            float r2 = r0.f7290g
            r26 = r9
            float r9 = r1.f7290g
            float r2 = r2 - r9
            float r9 = r0.f7291h
            r27 = r11
            float r11 = r1.f7291h
            float r9 = r9 - r11
            float r11 = r0.f7292i
            float r1 = r1.f7292i
            float r11 = r11 - r1
            float r2 = r2 * r2
            float r9 = r9 * r9
            float r9 = r9 + r2
            float r11 = r11 * r11
            float r11 = r11 + r9
            double r1 = (double) r11
            double r1 = java.lang.Math.sqrt(r1)
            r28 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            r9 = r5
            r11 = r6
            r5 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r1 = java.lang.Math.pow(r1, r5)
            double r1 = r1 * r28
            float r1 = (float) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 > 0) goto L265
            r20 = r0
            r17 = r1
            r16 = r25
            goto L265
        L25f:
            r26 = r9
            r27 = r11
            r9 = r5
            r11 = r6
        L265:
            r0 = 0
            int r1 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r1 != 0) goto L26f
            int r0 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r0 != 0) goto L26f
            goto L290
        L26f:
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 >= 0) goto L278
            r1 = r22
            r2 = r24
            goto L27c
        L278:
            r2 = r22
            r1 = r23
        L27c:
            r5 = r9
            r6 = r11
            r0 = r18
            r3 = r21
            r9 = r26
            r11 = r27
            goto L184
        L288:
            r18 = r0
            r26 = r9
            r27 = r11
            r9 = r5
            r11 = r6
        L290:
            r0 = r20
            if (r14 == 0) goto L2b1
            if (r0 == 0) goto L29b
            int r7 = r0.m4068e(r12)
            goto L2df
        L29b:
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = p065e0.C1496a.m4063a(r7, r15, r1, r15)
            r14 = 0
        L2a2:
            r1 = r32
            r2 = r33
            r5 = r9
            r6 = r11
            r3 = r21
            r9 = r26
            r11 = r0
            r0 = r18
            goto L16a
        L2b1:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != 0) goto L2b8
            r7 = r27
            goto L2bb
        L2b8:
            r13 = r0
            r15 = r27
        L2bb:
            float r0 = p065e0.C1496a.m4063a(r7, r15, r1, r15)
            goto L2a2
        L2c0:
            r18 = r0
            r21 = r3
            r9 = r5
            r11 = r6
            if (r13 != 0) goto L2c9
            goto L2d4
        L2c9:
            int r7 = r13.m4068e(r12)
            goto L2df
        L2ce:
            r18 = r0
            r21 = r3
            r9 = r5
            r11 = r6
        L2d4:
            int r7 = p065e0.C1498c.m4069a(r10)
            goto L2df
        L2d9:
            r18 = r0
            r21 = r3
            r9 = r5
            r11 = r6
        L2df:
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r7
            int r1 = r4 << 24
            r7 = r0 | r1
        L2e7:
            int r0 = r8 + 1
            int r1 = r9.length
            r2 = 8
            if (r0 <= r1) goto L2fe
            r1 = 4
            if (r8 > r1) goto L2f4
            r1 = 8
            goto L2f6
        L2f4:
            int r1 = r8 * 2
        L2f6:
            int[] r1 = new int[r1]
            r3 = 0
            java.lang.System.arraycopy(r9, r3, r1, r3, r8)
            r5 = r1
            goto L2ff
        L2fe:
            r5 = r9
        L2ff:
            r5[r8] = r7
            int r1 = r11.length
            if (r0 <= r1) goto L31e
            java.lang.Class r1 = r11.getClass()
            java.lang.Class r1 = r1.getComponentType()
            r3 = 4
            if (r8 > r3) goto L310
            goto L312
        L310:
            int r2 = r8 * 2
        L312:
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r2 = 0
            java.lang.System.arraycopy(r11, r2, r1, r2, r8)
            r6 = r1
            goto L31f
        L31e:
            r6 = r11
        L31f:
            r6[r8] = r18
            int[][] r6 = (int[][]) r6
            r8 = r0
            goto L32b
        L325:
            r21 = r3
            r9 = r5
            r11 = r6
            r5 = r9
            r6 = r11
        L32b:
            r4 = 1
            r7 = 0
            r0 = r30
            r1 = r32
            r2 = r33
            r3 = r21
            goto L20
        L337:
            r9 = r5
            r11 = r6
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8][]
            r2 = 0
            java.lang.System.arraycopy(r9, r2, r0, r2, r8)
            java.lang.System.arraycopy(r11, r2, r1, r2, r8)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        L34a:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r31.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid color state list tag "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
