package p065e0;

/* renamed from: e0.e */
/* loaded from: classes.dex */
public final class C1500e {

    /* renamed from: a */
    public final android.graphics.Shader f7298a;

    /* renamed from: b */
    public final android.content.res.ColorStateList f7299b;

    /* renamed from: c */
    public int f7300c;

    public C1500e(android.graphics.Shader r1, android.content.res.ColorStateList r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f7298a = r1
            r0.f7299b = r2
            r0.f7300c = r3
            return
    }

    /* renamed from: a */
    public static p065e0.C1500e m4074a(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
            r0 = r29
            r1 = r31
            android.content.res.XmlResourceParser r2 = r29.getXml(r30)
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r2)
        Lc:
            int r4 = r2.next()
            r5 = 2
            r6 = 1
            if (r4 == r5) goto L17
            if (r4 == r6) goto L17
            goto Lc
        L17:
            if (r4 != r5) goto L278
            java.lang.String r4 = r2.getName()
            java.util.Objects.requireNonNull(r4)
            java.lang.String r7 = "gradient"
            boolean r8 = r4.equals(r7)
            r9 = 0
            if (r8 != 0) goto L5d
            java.lang.String r5 = "selector"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L3f
            android.content.res.ColorStateList r0 = p065e0.C1499d.m4073b(r0, r2, r3, r1)
            e0.e r1 = new e0.e
            int r2 = r0.getDefaultColor()
            r1.<init>(r9, r0, r2)
            return r1
        L3f:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": unsupported complex color tag "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5d:
            java.lang.String r4 = r2.getName()
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L25a
            int[] r4 = p017b0.C0653a.f3797d
            android.content.res.TypedArray r4 = p065e0.C1505j.m4095i(r0, r1, r3, r4)
            r7 = 8
            java.lang.String r8 = "startX"
            boolean r8 = p065e0.C1505j.m4094h(r2, r8)
            r10 = 0
            if (r8 != 0) goto L7a
            r12 = 0
            goto L7f
        L7a:
            float r7 = r4.getFloat(r7, r10)
            r12 = r7
        L7f:
            r7 = 9
            java.lang.String r8 = "startY"
            boolean r8 = p065e0.C1505j.m4094h(r2, r8)
            if (r8 != 0) goto L8b
            r13 = 0
            goto L90
        L8b:
            float r7 = r4.getFloat(r7, r10)
            r13 = r7
        L90:
            r7 = 10
            java.lang.String r8 = "endX"
            boolean r8 = p065e0.C1505j.m4094h(r2, r8)
            if (r8 != 0) goto L9c
            r14 = 0
            goto La1
        L9c:
            float r7 = r4.getFloat(r7, r10)
            r14 = r7
        La1:
            r7 = 11
            java.lang.String r8 = "endY"
            boolean r8 = p065e0.C1505j.m4094h(r2, r8)
            if (r8 != 0) goto Lad
            r15 = 0
            goto Lb2
        Lad:
            float r7 = r4.getFloat(r7, r10)
            r15 = r7
        Lb2:
            java.lang.String r7 = "centerX"
            boolean r7 = p065e0.C1505j.m4094h(r2, r7)
            r8 = 3
            if (r7 != 0) goto Lbd
            r7 = 0
            goto Lc1
        Lbd:
            float r7 = r4.getFloat(r8, r10)
        Lc1:
            r11 = 4
            java.lang.String r9 = "centerY"
            boolean r9 = p065e0.C1505j.m4094h(r2, r9)
            if (r9 != 0) goto Lcc
            r9 = 0
            goto Ld0
        Lcc:
            float r9 = r4.getFloat(r11, r10)
        Ld0:
            java.lang.String r11 = "type"
            boolean r11 = p065e0.C1505j.m4094h(r2, r11)
            r8 = 0
            if (r11 != 0) goto Ldb
            r11 = 0
            goto Ldf
        Ldb:
            int r11 = r4.getInt(r5, r8)
        Ldf:
            java.lang.String r5 = "startColor"
            boolean r5 = p065e0.C1505j.m4094h(r2, r5)
            if (r5 != 0) goto Le9
            r5 = 0
            goto Led
        Le9:
            int r5 = r4.getColor(r8, r8)
        Led:
            java.lang.String r10 = "centerColor"
            boolean r19 = p065e0.C1505j.m4094h(r2, r10)
            r6 = 7
            boolean r10 = p065e0.C1505j.m4094h(r2, r10)
            if (r10 != 0) goto Lfc
            r6 = 0
            goto L100
        Lfc:
            int r6 = r4.getColor(r6, r8)
        L100:
            java.lang.String r10 = "endColor"
            boolean r10 = p065e0.C1505j.m4094h(r2, r10)
            if (r10 != 0) goto L10a
            r10 = 0
            goto L111
        L10a:
            r10 = 1
            int r21 = r4.getColor(r10, r8)
            r10 = r21
        L111:
            java.lang.String r8 = "tileMode"
            boolean r8 = p065e0.C1505j.m4094h(r2, r8)
            r21 = r7
            r7 = 0
            if (r8 != 0) goto L11d
            goto L123
        L11d:
            r8 = 6
            int r8 = r4.getInt(r8, r7)
            r7 = r8
        L123:
            java.lang.String r8 = "gradientRadius"
            boolean r8 = p065e0.C1505j.m4094h(r2, r8)
            if (r8 != 0) goto L12f
            r22 = r9
            r8 = 0
            goto L137
        L12f:
            r8 = 5
            r22 = r9
            r9 = 0
            float r8 = r4.getFloat(r8, r9)
        L137:
            r4.recycle()
            int r4 = r2.getDepth()
            r9 = 1
            int r4 = r4 + r9
            java.util.ArrayList r9 = new java.util.ArrayList
            r23 = r8
            r8 = 20
            r9.<init>(r8)
            r24 = r15
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r8)
        L150:
            int r8 = r2.next()
            r25 = r14
            r14 = 1
            if (r8 == r14) goto L1c7
            int r14 = r2.getDepth()
            r26 = r13
            if (r14 >= r4) goto L164
            r13 = 3
            if (r8 == r13) goto L1c9
        L164:
            r13 = 2
            if (r8 == r13) goto L168
            goto L1c2
        L168:
            if (r14 > r4) goto L1c2
            java.lang.String r8 = r2.getName()
            java.lang.String r13 = "item"
            boolean r8 = r8.equals(r13)
            if (r8 != 0) goto L177
            goto L1c2
        L177:
            int[] r8 = p017b0.C0653a.f3798e
            android.content.res.TypedArray r8 = p065e0.C1505j.m4095i(r0, r1, r3, r8)
            r13 = 0
            boolean r14 = r8.hasValue(r13)
            r13 = 1
            boolean r20 = r8.hasValue(r13)
            if (r14 == 0) goto L1a7
            if (r20 == 0) goto L1a7
            r14 = 0
            int r27 = r8.getColor(r14, r14)
            r14 = 0
            float r28 = r8.getFloat(r13, r14)
            r8.recycle()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r27)
            r15.add(r8)
            java.lang.Float r8 = java.lang.Float.valueOf(r28)
            r9.add(r8)
            goto L1c2
        L1a7:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1c2:
            r14 = r25
            r13 = r26
            goto L150
        L1c7:
            r26 = r13
        L1c9:
            int r0 = r15.size()
            if (r0 <= 0) goto L1d5
            e0.g r0 = new e0.g
            r0.<init>(r15, r9)
            goto L1d6
        L1d5:
            r0 = 0
        L1d6:
            if (r0 == 0) goto L1da
        L1d8:
            r1 = 1
            goto L1e6
        L1da:
            e0.g r0 = new e0.g
            if (r19 == 0) goto L1e2
            r0.<init>(r5, r6, r10)
            goto L1d8
        L1e2:
            r0.<init>(r5, r10)
            goto L1d8
        L1e6:
            if (r11 == r1) goto L21c
            r2 = 2
            if (r11 == r2) goto L20e
            android.graphics.LinearGradient r3 = new android.graphics.LinearGradient
            int[] r4 = r0.f7312a
            float[] r0 = r0.f7313b
            if (r7 == r1) goto L1fb
            if (r7 == r2) goto L1f8
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
            goto L1fd
        L1f8:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.MIRROR
            goto L1fd
        L1fb:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.REPEAT
        L1fd:
            r18 = r1
            r11 = r3
            r13 = r26
            r14 = r25
            r15 = r24
            r16 = r4
            r17 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            goto L24a
        L20e:
            android.graphics.SweepGradient r3 = new android.graphics.SweepGradient
            int[] r1 = r0.f7312a
            float[] r0 = r0.f7313b
            r10 = r21
            r9 = r22
            r3.<init>(r10, r9, r1, r0)
            goto L24a
        L21c:
            r10 = r21
            r9 = r22
            r1 = 0
            int r1 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1))
            if (r1 <= 0) goto L252
            android.graphics.RadialGradient r3 = new android.graphics.RadialGradient
            int[] r1 = r0.f7312a
            float[] r0 = r0.f7313b
            r2 = 1
            if (r7 == r2) goto L237
            r2 = 2
            if (r7 == r2) goto L234
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.CLAMP
            goto L239
        L234:
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.MIRROR
            goto L239
        L237:
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.REPEAT
        L239:
            r22 = r2
            r16 = r3
            r17 = r10
            r18 = r9
            r19 = r23
            r20 = r1
            r21 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)
        L24a:
            e0.e r0 = new e0.e
            r1 = 0
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
        L252:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r1)
            throw r0
        L25a:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid gradient color tag "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L278:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: b */
    public boolean m4075b() {
            r1 = this;
            android.graphics.Shader r0 = r1.f7298a
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* renamed from: c */
    public boolean m4076c() {
            r1 = this;
            android.graphics.Shader r0 = r1.f7298a
            if (r0 != 0) goto L10
            android.content.res.ColorStateList r0 = r1.f7299b
            if (r0 == 0) goto L10
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    /* renamed from: d */
    public boolean m4077d(int[] r3) {
            r2 = this;
            boolean r0 = r2.m4076c()
            if (r0 == 0) goto L18
            android.content.res.ColorStateList r0 = r2.f7299b
            int r1 = r0.getDefaultColor()
            int r3 = r0.getColorForState(r3, r1)
            int r0 = r2.f7300c
            if (r3 == r0) goto L18
            r0 = 1
            r2.f7300c = r3
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }
}
