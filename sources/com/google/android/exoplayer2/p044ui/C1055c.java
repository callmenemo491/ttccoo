package com.google.android.exoplayer2.p044ui;

/* renamed from: com.google.android.exoplayer2.ui.c */
/* loaded from: classes.dex */
public final class C1055c extends android.widget.FrameLayout implements com.google.android.exoplayer2.p044ui.SubtitleView.InterfaceC1049a {

    /* renamed from: a0 */
    public final com.google.android.exoplayer2.p044ui.C1053a f5329a0;

    /* renamed from: b0 */
    public final android.webkit.WebView f5330b0;

    /* renamed from: c0 */
    public java.util.List<p143i5.C3077a> f5331c0;

    /* renamed from: d0 */
    public p337t5.C6171a f5332d0;

    /* renamed from: e0 */
    public float f5333e0;

    /* renamed from: f0 */
    public int f5334f0;

    /* renamed from: g0 */
    public float f5335g0;

    /* renamed from: com.google.android.exoplayer2.ui.c$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5336a = null;

        static {
                android.text.Layout$Alignment[] r0 = android.text.Layout.Alignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.android.exoplayer2.p044ui.C1055c.a.f5336a = r0
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.android.exoplayer2.p044ui.C1055c.a.f5336a     // Catch: java.lang.NoSuchFieldError -> L1d
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.android.exoplayer2.p044ui.C1055c.a.f5336a     // Catch: java.lang.NoSuchFieldError -> L28
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public C1055c(android.content.Context r5) {
            r4 = this;
            r0 = 0
            r4.<init>(r5, r0)
            java.util.List r1 = java.util.Collections.emptyList()
            r4.f5331c0 = r1
            t5.a r1 = p337t5.C6171a.f23900g
            r4.f5332d0 = r1
            r1 = 1029329178(0x3d5a511a, float:0.0533)
            r4.f5333e0 = r1
            r1 = 0
            r4.f5334f0 = r1
            r2 = 1034147594(0x3da3d70a, float:0.08)
            r4.f5335g0 = r2
            com.google.android.exoplayer2.ui.a r2 = new com.google.android.exoplayer2.ui.a
            r2.<init>(r5, r0)
            r4.f5329a0 = r2
            t5.j r3 = new t5.j
            r3.<init>(r5, r0)
            r4.f5330b0 = r3
            r3.setBackgroundColor(r1)
            r4.addView(r2)
            r4.addView(r3)
            return
    }

    /* renamed from: b */
    public static int m2921b(int r1) {
            r0 = 1
            if (r1 == r0) goto Lb
            r0 = 2
            if (r1 == r0) goto L8
            r1 = 0
            return r1
        L8:
            r1 = -100
            return r1
        Lb:
            r1 = -50
            return r1
    }

    /* renamed from: c */
    public static java.lang.String m2922c(android.text.Layout.Alignment r2) {
            java.lang.String r0 = "center"
            if (r2 != 0) goto L5
            return r0
        L5:
            int[] r1 = com.google.android.exoplayer2.p044ui.C1055c.a.f5336a
            int r2 = r2.ordinal()
            r2 = r1[r2]
            r1 = 1
            if (r2 == r1) goto L17
            r1 = 2
            if (r2 == r1) goto L14
            return r0
        L14:
            java.lang.String r2 = "end"
            return r2
        L17:
            java.lang.String r2 = "start"
            return r2
    }

    @Override // com.google.android.exoplayer2.p044ui.SubtitleView.InterfaceC1049a
    /* renamed from: a */
    public void mo2917a(java.util.List<p143i5.C3077a> r7, p337t5.C6171a r8, float r9, int r10, float r11) {
            r6 = this;
            r6.f5332d0 = r8
            r6.f5333e0 = r9
            r6.f5334f0 = r10
            r6.f5335g0 = r11
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2 = 0
        L13:
            int r3 = r7.size()
            if (r2 >= r3) goto L2d
            java.lang.Object r3 = r7.get(r2)
            i5.a r3 = (p143i5.C3077a) r3
            android.graphics.Bitmap r4 = r3.f12389b0
            if (r4 == 0) goto L27
            r1.add(r3)
            goto L2a
        L27:
            r0.add(r3)
        L2a:
            int r2 = r2 + 1
            goto L13
        L2d:
            java.util.List<i5.a> r7 = r6.f5331c0
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L3b
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto L40
        L3b:
            r6.f5331c0 = r0
            r6.m2924e()
        L40:
            com.google.android.exoplayer2.ui.a r0 = r6.f5329a0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.mo2917a(r1, r2, r3, r4, r5)
            r6.invalidate()
            return
    }

    /* renamed from: d */
    public final java.lang.String m2923d(int r4, float r5) {
            r3 = this;
            int r0 = r3.getHeight()
            int r1 = r3.getHeight()
            int r2 = r3.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r3.getPaddingBottom()
            int r1 = r1 - r2
            float r4 = p337t5.C6178h.m12747b(r4, r5, r0, r1)
            r5 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 != 0) goto L20
            java.lang.String r4 = "unset"
            return r4
        L20:
            android.content.Context r5 = r3.getContext()
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r4 = r4 / r5
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r0 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r5[r0] = r4
            java.lang.String r4 = "%.2fpx"
            java.lang.String r4 = p371v5.C6552b0.m13318k(r4, r5)
            return r4
    }

    /* renamed from: e */
    public final void m2924e() {
            r43 = this;
            r0 = r43
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 4
            java.lang.Object[] r3 = new java.lang.Object[r2]
            t5.a r4 = r0.f5332d0
            int r4 = r4.f23901a
            java.lang.String r4 = p064e.C1487a.m4033k(r4)
            r5 = 0
            r3[r5] = r4
            int r4 = r0.f5334f0
            float r6 = r0.f5333e0
            java.lang.String r4 = r0.m2923d(r4, r6)
            r6 = 1
            r3[r6] = r4
            r4 = 1067030938(0x3f99999a, float:1.2)
            java.lang.Float r7 = java.lang.Float.valueOf(r4)
            r8 = 2
            r3[r8] = r7
            t5.a r7 = r0.f5332d0
            int r9 = r7.f23904d
            java.lang.String r10 = "unset"
            r11 = 3
            if (r9 == r6) goto L6e
            if (r9 == r8) goto L5d
            if (r9 == r11) goto L4c
            if (r9 == r2) goto L3b
            r2 = r10
            goto L7e
        L3b:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            int r7 = r7.f23905e
            java.lang.String r7 = p064e.C1487a.m4033k(r7)
            r2[r5] = r7
            java.lang.String r7 = "-0.05em -0.05em 0.15em %s"
            java.lang.String r2 = p371v5.C6552b0.m13318k(r7, r2)
            goto L7e
        L4c:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            int r7 = r7.f23905e
            java.lang.String r7 = p064e.C1487a.m4033k(r7)
            r2[r5] = r7
            java.lang.String r7 = "0.06em 0.08em 0.15em %s"
            java.lang.String r2 = p371v5.C6552b0.m13318k(r7, r2)
            goto L7e
        L5d:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            int r7 = r7.f23905e
            java.lang.String r7 = p064e.C1487a.m4033k(r7)
            r2[r5] = r7
            java.lang.String r7 = "0.1em 0.12em 0.15em %s"
            java.lang.String r2 = p371v5.C6552b0.m13318k(r7, r2)
            goto L7e
        L6e:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            int r7 = r7.f23905e
            java.lang.String r7 = p064e.C1487a.m4033k(r7)
            r2[r5] = r7
            java.lang.String r7 = "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s"
            java.lang.String r2 = p371v5.C6552b0.m13318k(r7, r2)
        L7e:
            r3[r11] = r2
            java.lang.String r2 = "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>"
            java.lang.String r2 = p371v5.C6552b0.m13318k(r2, r3)
            r1.append(r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "default_bg"
            java.lang.String r7 = p064e.C1487a.m4028f(r3)
            java.lang.Object[] r8 = new java.lang.Object[r6]
            t5.a r9 = r0.f5332d0
            int r9 = r9.f23902b
            java.lang.String r9 = p064e.C1487a.m4033k(r9)
            r8[r5] = r9
            java.lang.String r9 = "background-color:%s;"
            java.lang.String r8 = p371v5.C6552b0.m13318k(r9, r8)
            r2.put(r7, r8)
            r7 = 0
        Laa:
            java.util.List<i5.a> r8 = r0.f5331c0
            int r8 = r8.size()
            if (r7 >= r8) goto L672
            java.util.List<i5.a> r8 = r0.f5331c0
            java.lang.Object r8 = r8.get(r7)
            i5.a r8 = (p143i5.C3077a) r8
            float r11 = r8.f12393f0
            r12 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r13 = 1120403456(0x42c80000, float:100.0)
            int r14 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r14 == 0) goto Lc8
            float r11 = r11 * r13
            goto Lca
        Lc8:
            r11 = 1112014848(0x42480000, float:50.0)
        Lca:
            int r14 = r8.f12394g0
            int r14 = m2921b(r14)
            float r15 = r8.f12390c0
            r16 = 0
            r17 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r13 = "%.2f%%"
            int r12 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r12 == 0) goto L130
            int r12 = r8.f12391d0
            if (r12 == r6) goto L104
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r12 = 1120403456(0x42c80000, float:100.0)
            float r15 = r15 * r12
            java.lang.Float r12 = java.lang.Float.valueOf(r15)
            r4[r5] = r12
            java.lang.String r4 = p371v5.C6552b0.m13318k(r13, r4)
            int r12 = r8.f12401n0
            if (r12 != r6) goto Lfc
            int r12 = r8.f12392e0
            int r12 = m2921b(r12)
            int r12 = -r12
            goto L102
        Lfc:
            int r12 = r8.f12392e0
            int r12 = m2921b(r12)
        L102:
            r15 = 0
            goto L148
        L104:
            java.lang.String r5 = "%.2fem"
            int r12 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r12 < 0) goto L11b
            java.lang.Object[] r12 = new java.lang.Object[r6]
            float r15 = r15 * r4
            java.lang.Float r4 = java.lang.Float.valueOf(r15)
            r15 = 0
            r12[r15] = r4
            java.lang.String r4 = p371v5.C6552b0.m13318k(r5, r12)
            r5 = 0
            goto L12e
        L11b:
            java.lang.Object[] r12 = new java.lang.Object[r6]
            float r15 = -r15
            float r15 = r15 - r17
            float r15 = r15 * r4
            java.lang.Float r4 = java.lang.Float.valueOf(r15)
            r15 = 0
            r12[r15] = r4
            java.lang.String r4 = p371v5.C6552b0.m13318k(r5, r12)
            r5 = 1
        L12e:
            r12 = 0
            goto L148
        L130:
            r15 = 0
            java.lang.Object[] r4 = new java.lang.Object[r6]
            float r5 = r0.f5335g0
            float r17 = r17 - r5
            r5 = 1120403456(0x42c80000, float:100.0)
            float r17 = r17 * r5
            java.lang.Float r5 = java.lang.Float.valueOf(r17)
            r4[r15] = r5
            java.lang.String r4 = p371v5.C6552b0.m13318k(r13, r4)
            r12 = -100
            r5 = 0
        L148:
            r17 = r10
            float r10 = r8.f12395h0
            r19 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r19 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r19 == 0) goto L166
            r19 = r12
            java.lang.Object[] r12 = new java.lang.Object[r6]
            r18 = 1120403456(0x42c80000, float:100.0)
            float r10 = r10 * r18
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            r12[r15] = r10
            java.lang.String r10 = p371v5.C6552b0.m13318k(r13, r12)
            goto L16a
        L166:
            r19 = r12
            java.lang.String r10 = "fit-content"
        L16a:
            android.text.Layout$Alignment r12 = r8.f12387Z
            java.lang.String r12 = m2922c(r12)
            int r13 = r8.f12401n0
            if (r13 == r6) goto L17d
            r6 = 2
            if (r13 == r6) goto L17a
            java.lang.String r6 = "horizontal-tb"
            goto L17f
        L17a:
            java.lang.String r6 = "vertical-lr"
            goto L17f
        L17d:
            java.lang.String r6 = "vertical-rl"
        L17f:
            int r13 = r8.f12399l0
            float r15 = r8.f12400m0
            java.lang.String r13 = r0.m2923d(r13, r15)
            boolean r15 = r8.f12397j0
            if (r15 == 0) goto L18e
            int r15 = r8.f12398k0
            goto L192
        L18e:
            t5.a r15 = r0.f5332d0
            int r15 = r15.f23903c
        L192:
            java.lang.String r15 = p064e.C1487a.m4033k(r15)
            r20 = r14
            int r14 = r8.f12401n0
            java.lang.String r21 = "right"
            java.lang.String r22 = "left"
            java.lang.String r23 = "top"
            r0 = 1
            if (r14 == r0) goto L1af
            r0 = 2
            if (r14 == r0) goto L1ac
            if (r5 == 0) goto L1aa
            java.lang.String r23 = "bottom"
        L1aa:
            r0 = 2
            goto L1b8
        L1ac:
            if (r5 == 0) goto L1b1
            goto L1b3
        L1af:
            if (r5 == 0) goto L1b3
        L1b1:
            r21 = r22
        L1b3:
            r0 = 2
            r22 = r23
            r23 = r21
        L1b8:
            if (r14 == r0) goto L1c3
            r0 = 1
            if (r14 != r0) goto L1be
            goto L1c3
        L1be:
            java.lang.String r0 = "width"
            r14 = r20
            goto L1c9
        L1c3:
            java.lang.String r0 = "height"
            r14 = r19
            r19 = r20
        L1c9:
            java.lang.CharSequence r5 = r8.f12386Y
            android.content.Context r20 = r43.getContext()
            android.content.res.Resources r20 = r20.getResources()
            r21 = r3
            android.util.DisplayMetrics r3 = r20.getDisplayMetrics()
            float r3 = r3.density
            java.util.regex.Pattern r20 = com.google.android.exoplayer2.p044ui.C1054b.f5318a
            r20 = r1
            java.lang.String r1 = ""
            r24 = r8
            java.lang.String r8 = "</span>"
            r25 = r8
            r8 = 0
            if (r5 != 0) goto L1f4
            com.google.android.exoplayer2.ui.b$b r3 = new com.google.android.exoplayer2.ui.b$b
            b9.o<java.lang.Object, java.lang.Object> r5 = p026b9.C0695d0.f3901e0
            r3.<init>(r1, r5, r8)
            r26 = r1
            goto L206
        L1f4:
            boolean r8 = r5 instanceof android.text.Spanned
            if (r8 != 0) goto L216
            com.google.android.exoplayer2.ui.b$b r3 = new com.google.android.exoplayer2.ui.b$b
            java.lang.String r5 = com.google.android.exoplayer2.p044ui.C1054b.m2920a(r5)
            b9.o<java.lang.Object, java.lang.Object> r8 = p026b9.C0695d0.f3901e0
            r26 = r1
            r1 = 0
            r3.<init>(r5, r8, r1)
        L206:
            r33 = r6
            r29 = r9
            r36 = r10
            r35 = r12
            r32 = r13
            r27 = r14
            r28 = r15
            goto L576
        L216:
            r26 = r1
            android.text.Spanned r5 = (android.text.Spanned) r5
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            int r8 = r5.length()
            r27 = r14
            java.lang.Class<android.text.style.BackgroundColorSpan> r14 = android.text.style.BackgroundColorSpan.class
            r28 = r15
            r15 = 0
            java.lang.Object[] r8 = r5.getSpans(r15, r8, r14)
            android.text.style.BackgroundColorSpan[] r8 = (android.text.style.BackgroundColorSpan[]) r8
            int r14 = r8.length
        L231:
            if (r15 >= r14) goto L247
            r29 = r8[r15]
            int r29 = r29.getBackgroundColor()
            r30 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r29)
            r1.add(r8)
            int r15 = r15 + 1
            r8 = r30
            goto L231
        L247:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.Iterator r1 = r1.iterator()
        L250:
            boolean r14 = r1.hasNext()
            if (r14 == 0) goto L28e
            java.lang.Object r14 = r1.next()
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r29 = r1
            r1 = 14
            r15.<init>(r1)
            java.lang.String r1 = "bg_"
            r15.append(r1)
            r15.append(r14)
            java.lang.String r1 = r15.toString()
            java.lang.String r1 = p064e.C1487a.m4028f(r1)
            r15 = 1
            java.lang.Object[] r15 = new java.lang.Object[r15]
            java.lang.String r14 = p064e.C1487a.m4033k(r14)
            r30 = 0
            r15[r30] = r14
            java.lang.String r14 = p371v5.C6552b0.m13318k(r9, r15)
            r8.put(r1, r14)
            r1 = r29
            goto L250
        L28e:
            r1 = 0
            android.util.SparseArray r14 = new android.util.SparseArray
            r14.<init>()
            int r15 = r5.length()
            r29 = r9
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            java.lang.Object[] r1 = r5.getSpans(r1, r15, r9)
            int r9 = r1.length
            r15 = 0
        L2a2:
            if (r15 >= r9) goto L4e9
            r30 = r9
            r9 = r1[r15]
            r31 = r1
            boolean r1 = r9 instanceof android.text.style.StrikethroughSpan
            if (r1 == 0) goto L2c0
            java.lang.String r32 = "<span style='text-decoration:line-through;'>"
            r34 = r3
            r33 = r6
            r36 = r10
            r35 = r12
            r6 = r32
            r18 = 1120403456(0x42c80000, float:100.0)
            r32 = r13
            goto L418
        L2c0:
            r32 = r13
            boolean r13 = r9 instanceof android.text.style.ForegroundColorSpan
            if (r13 == 0) goto L2e4
            r13 = r9
            android.text.style.ForegroundColorSpan r13 = (android.text.style.ForegroundColorSpan) r13
            r33 = r6
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            int r13 = r13.getForegroundColor()
            java.lang.String r13 = p064e.C1487a.m4033k(r13)
            r34 = 0
            r6[r34] = r13
            java.lang.String r13 = "<span style='color:%s;'>"
            java.lang.String r6 = p371v5.C6552b0.m13318k(r13, r6)
        L2e0:
            r18 = 1120403456(0x42c80000, float:100.0)
            goto L3b3
        L2e4:
            r33 = r6
            r6 = 1
            boolean r13 = r9 instanceof android.text.style.BackgroundColorSpan
            if (r13 == 0) goto L303
            r13 = r9
            android.text.style.BackgroundColorSpan r13 = (android.text.style.BackgroundColorSpan) r13
            java.lang.Object[] r6 = new java.lang.Object[r6]
            int r13 = r13.getBackgroundColor()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r34 = 0
            r6[r34] = r13
            java.lang.String r13 = "<span class='bg_%s'>"
            java.lang.String r6 = p371v5.C6552b0.m13318k(r13, r6)
            goto L2e0
        L303:
            boolean r6 = r9 instanceof p217m5.C4382a
            if (r6 == 0) goto L30a
            java.lang.String r6 = "<span style='text-combine-upright:all;'>"
            goto L2e0
        L30a:
            boolean r6 = r9 instanceof android.text.style.AbsoluteSizeSpan
            if (r6 == 0) goto L330
            r6 = r9
            android.text.style.AbsoluteSizeSpan r6 = (android.text.style.AbsoluteSizeSpan) r6
            boolean r13 = r6.getDip()
            int r6 = r6.getSize()
            float r6 = (float) r6
            if (r13 == 0) goto L31d
            goto L31e
        L31d:
            float r6 = r6 / r3
        L31e:
            r13 = 1
            java.lang.Object[] r13 = new java.lang.Object[r13]
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r34 = 0
            r13[r34] = r6
            java.lang.String r6 = "<span style='font-size:%.2fpx;'>"
            java.lang.String r6 = p371v5.C6552b0.m13318k(r6, r13)
            goto L2e0
        L330:
            r6 = 1
            boolean r13 = r9 instanceof android.text.style.RelativeSizeSpan
            if (r13 == 0) goto L352
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r13 = r9
            android.text.style.RelativeSizeSpan r13 = (android.text.style.RelativeSizeSpan) r13
            float r13 = r13.getSizeChange()
            r18 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 * r18
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r34 = 0
            r6[r34] = r13
            java.lang.String r13 = "<span style='font-size:%.2f%%;'>"
            java.lang.String r6 = p371v5.C6552b0.m13318k(r13, r6)
            goto L3b3
        L352:
            r18 = 1120403456(0x42c80000, float:100.0)
            r34 = 0
            boolean r6 = r9 instanceof android.text.style.TypefaceSpan
            if (r6 == 0) goto L371
            r6 = r9
            android.text.style.TypefaceSpan r6 = (android.text.style.TypefaceSpan) r6
            java.lang.String r6 = r6.getFamily()
            if (r6 == 0) goto L36f
            r13 = 1
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r13[r34] = r6
            java.lang.String r6 = "<span style='font-family:\"%s\";'>"
            java.lang.String r6 = p371v5.C6552b0.m13318k(r6, r13)
            goto L3b3
        L36f:
            r6 = 0
            goto L3b3
        L371:
            r6 = 1
            boolean r13 = r9 instanceof android.text.style.StyleSpan
            if (r13 == 0) goto L390
            r13 = r9
            android.text.style.StyleSpan r13 = (android.text.style.StyleSpan) r13
            int r13 = r13.getStyle()
            if (r13 == r6) goto L38d
            r6 = 2
            if (r13 == r6) goto L38a
            r6 = 3
            if (r13 == r6) goto L387
            goto L41b
        L387:
            java.lang.String r6 = "<b><i>"
            goto L3b3
        L38a:
            java.lang.String r6 = "<i>"
            goto L3b3
        L38d:
            java.lang.String r6 = "<b>"
            goto L3b3
        L390:
            boolean r6 = r9 instanceof p217m5.C4384c
            if (r6 == 0) goto L3ad
            r6 = r9
            m5.c r6 = (p217m5.C4384c) r6
            int r6 = r6.f17947b
            r13 = -1
            if (r6 == r13) goto L3aa
            r13 = 1
            if (r6 == r13) goto L3a7
            r13 = 2
            if (r6 == r13) goto L3a4
            goto L41b
        L3a4:
            java.lang.String r6 = "<ruby style='ruby-position:under;'>"
            goto L3b3
        L3a7:
            java.lang.String r6 = "<ruby style='ruby-position:over;'>"
            goto L3b3
        L3aa:
            java.lang.String r6 = "<ruby style='ruby-position:unset;'>"
            goto L3b3
        L3ad:
            boolean r6 = r9 instanceof android.text.style.UnderlineSpan
            if (r6 == 0) goto L3ba
            java.lang.String r6 = "<u>"
        L3b3:
            r34 = r3
            r36 = r10
            r35 = r12
            goto L418
        L3ba:
            boolean r6 = r9 instanceof p217m5.C4385d
            if (r6 == 0) goto L41b
            r6 = r9
            m5.d r6 = (p217m5.C4385d) r6
            int r13 = r6.f17948a
            r34 = r3
            int r3 = r6.f17949b
            r35 = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r36 = r10
            r10 = 1
            if (r3 == r10) goto L3da
            r10 = 2
            if (r3 == r10) goto L3d7
            goto L3e0
        L3d7:
            java.lang.String r3 = "open "
            goto L3dd
        L3da:
            r10 = 2
            java.lang.String r3 = "filled "
        L3dd:
            r12.append(r3)
        L3e0:
            if (r13 == 0) goto L3f6
            r3 = 1
            if (r13 == r3) goto L3f3
            if (r13 == r10) goto L3f0
            r3 = 3
            if (r13 == r3) goto L3ed
            r3 = r17
            goto L3f8
        L3ed:
            java.lang.String r3 = "sesame"
            goto L3f8
        L3f0:
            java.lang.String r3 = "dot"
            goto L3f8
        L3f3:
            java.lang.String r3 = "circle"
            goto L3f8
        L3f6:
            java.lang.String r3 = "none"
        L3f8:
            r12.append(r3)
            java.lang.String r3 = r12.toString()
            int r6 = r6.f17950c
            r10 = 2
            if (r6 == r10) goto L407
            java.lang.String r6 = "over right"
            goto L409
        L407:
            java.lang.String r6 = "under left"
        L409:
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r12 = 0
            r10[r12] = r3
            r3 = 1
            r10[r3] = r6
            java.lang.String r3 = "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>"
            java.lang.String r3 = p371v5.C6552b0.m13318k(r3, r10)
            r6 = r3
        L418:
            r40 = r6
            goto L423
        L41b:
            r34 = r3
            r36 = r10
            r35 = r12
            r6 = 0
            goto L418
        L423:
            if (r1 != 0) goto L491
            boolean r1 = r9 instanceof android.text.style.ForegroundColorSpan
            if (r1 != 0) goto L491
            boolean r1 = r9 instanceof android.text.style.BackgroundColorSpan
            if (r1 != 0) goto L491
            boolean r1 = r9 instanceof p217m5.C4382a
            if (r1 != 0) goto L491
            boolean r1 = r9 instanceof android.text.style.AbsoluteSizeSpan
            if (r1 != 0) goto L491
            boolean r1 = r9 instanceof android.text.style.RelativeSizeSpan
            if (r1 != 0) goto L491
            boolean r1 = r9 instanceof p217m5.C4385d
            if (r1 == 0) goto L43e
            goto L491
        L43e:
            boolean r1 = r9 instanceof android.text.style.TypefaceSpan
            if (r1 == 0) goto L44c
            r1 = r9
            android.text.style.TypefaceSpan r1 = (android.text.style.TypefaceSpan) r1
            java.lang.String r1 = r1.getFamily()
            if (r1 == 0) goto L48d
            goto L491
        L44c:
            boolean r1 = r9 instanceof android.text.style.StyleSpan
            if (r1 == 0) goto L46a
            r1 = r9
            android.text.style.StyleSpan r1 = (android.text.style.StyleSpan) r1
            int r1 = r1.getStyle()
            r3 = 1
            if (r1 == r3) goto L467
            r3 = 2
            if (r1 == r3) goto L464
            r3 = 3
            if (r1 == r3) goto L461
            goto L48d
        L461:
            java.lang.String r1 = "</i></b>"
            goto L48e
        L464:
            java.lang.String r1 = "</i>"
            goto L48e
        L467:
            java.lang.String r1 = "</b>"
            goto L48e
        L46a:
            boolean r1 = r9 instanceof p217m5.C4384c
            if (r1 == 0) goto L486
            r1 = r9
            m5.c r1 = (p217m5.C4384c) r1
            java.lang.String r1 = r1.f17946a
            java.lang.String r1 = com.google.android.exoplayer2.p044ui.C1054b.m2920a(r1)
            r3 = 16
            int r3 = p064e.C1489c.m4038a(r1, r3)
            java.lang.String r6 = "<rt>"
            java.lang.String r10 = "</rt></ruby>"
            java.lang.String r1 = p088f4.C2035p.m5377a(r3, r6, r1, r10)
            goto L48e
        L486:
            boolean r1 = r9 instanceof android.text.style.UnderlineSpan
            if (r1 == 0) goto L48d
            java.lang.String r1 = "</u>"
            goto L48e
        L48d:
            r1 = 0
        L48e:
            r41 = r1
            goto L493
        L491:
            r41 = r25
        L493:
            int r1 = r5.getSpanStart(r9)
            int r3 = r5.getSpanEnd(r9)
            if (r40 == 0) goto L4d7
            java.util.Objects.requireNonNull(r41)
            com.google.android.exoplayer2.ui.b$c r6 = new com.google.android.exoplayer2.ui.b$c
            r42 = 0
            r37 = r6
            r38 = r1
            r39 = r3
            r37.<init>(r38, r39, r40, r41, r42)
            java.lang.Object r9 = r14.get(r1)
            com.google.android.exoplayer2.ui.b$d r9 = (com.google.android.exoplayer2.p044ui.C1054b.d) r9
            if (r9 != 0) goto L4bd
            com.google.android.exoplayer2.ui.b$d r9 = new com.google.android.exoplayer2.ui.b$d
            r9.<init>()
            r14.put(r1, r9)
        L4bd:
            java.util.List<com.google.android.exoplayer2.ui.b$c> r1 = r9.f5327a
            r1.add(r6)
            java.lang.Object r1 = r14.get(r3)
            com.google.android.exoplayer2.ui.b$d r1 = (com.google.android.exoplayer2.p044ui.C1054b.d) r1
            if (r1 != 0) goto L4d2
            com.google.android.exoplayer2.ui.b$d r1 = new com.google.android.exoplayer2.ui.b$d
            r1.<init>()
            r14.put(r3, r1)
        L4d2:
            java.util.List<com.google.android.exoplayer2.ui.b$c> r1 = r1.f5328b
            r1.add(r6)
        L4d7:
            int r15 = r15 + 1
            r9 = r30
            r1 = r31
            r13 = r32
            r6 = r33
            r3 = r34
            r12 = r35
            r10 = r36
            goto L2a2
        L4e9:
            r33 = r6
            r36 = r10
            r35 = r12
            r32 = r13
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r3 = r5.length()
            r1.<init>(r3)
            r3 = 0
            r6 = 0
        L4fc:
            int r9 = r14.size()
            if (r3 >= r9) goto L55d
            int r9 = r14.keyAt(r3)
            java.lang.CharSequence r6 = r5.subSequence(r6, r9)
            java.lang.String r6 = com.google.android.exoplayer2.p044ui.C1054b.m2920a(r6)
            r1.append(r6)
            java.lang.Object r6 = r14.get(r9)
            com.google.android.exoplayer2.ui.b$d r6 = (com.google.android.exoplayer2.p044ui.C1054b.d) r6
            java.util.List<com.google.android.exoplayer2.ui.b$c> r10 = r6.f5328b
            java.util.Comparator<com.google.android.exoplayer2.ui.b$c> r12 = com.google.android.exoplayer2.p044ui.C1054b.c.f5321e
            java.util.Comparator<com.google.android.exoplayer2.ui.b$c> r12 = com.google.android.exoplayer2.p044ui.C1054b.c.f5322f
            java.util.Collections.sort(r10, r12)
            java.util.List<com.google.android.exoplayer2.ui.b$c> r10 = r6.f5328b
            java.util.Iterator r10 = r10.iterator()
        L526:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L538
            java.lang.Object r12 = r10.next()
            com.google.android.exoplayer2.ui.b$c r12 = (com.google.android.exoplayer2.p044ui.C1054b.c) r12
            java.lang.String r12 = r12.f5326d
            r1.append(r12)
            goto L526
        L538:
            java.util.List<com.google.android.exoplayer2.ui.b$c> r10 = r6.f5327a
            java.util.Comparator<com.google.android.exoplayer2.ui.b$c> r12 = com.google.android.exoplayer2.p044ui.C1054b.c.f5321e
            java.util.Comparator<com.google.android.exoplayer2.ui.b$c> r12 = com.google.android.exoplayer2.p044ui.C1054b.c.f5321e
            java.util.Collections.sort(r10, r12)
            java.util.List<com.google.android.exoplayer2.ui.b$c> r6 = r6.f5327a
            java.util.Iterator r6 = r6.iterator()
        L547:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L559
            java.lang.Object r10 = r6.next()
            com.google.android.exoplayer2.ui.b$c r10 = (com.google.android.exoplayer2.p044ui.C1054b.c) r10
            java.lang.String r10 = r10.f5325c
            r1.append(r10)
            goto L547
        L559:
            int r3 = r3 + 1
            r6 = r9
            goto L4fc
        L55d:
            int r3 = r5.length()
            java.lang.CharSequence r3 = r5.subSequence(r6, r3)
            java.lang.String r3 = com.google.android.exoplayer2.p044ui.C1054b.m2920a(r3)
            r1.append(r3)
            com.google.android.exoplayer2.ui.b$b r3 = new com.google.android.exoplayer2.ui.b$b
            java.lang.String r1 = r1.toString()
            r5 = 0
            r3.<init>(r1, r8, r5)
        L576:
            java.util.Set r1 = r2.keySet()
            java.util.Iterator r1 = r1.iterator()
        L57e:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L5aa
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r2.put(r5, r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L5a5
            java.lang.Object r5 = r2.get(r5)
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L5a3
            goto L5a5
        L5a3:
            r5 = 0
            goto L5a6
        L5a5:
            r5 = 1
        L5a6:
            p371v5.C6549a.m13291e(r5)
            goto L57e
        L5aa:
            r1 = 14
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r6 = 0
            r1[r6] = r5
            r5 = 1
            r1[r5] = r22
            java.lang.Float r5 = java.lang.Float.valueOf(r11)
            r6 = 2
            r1[r6] = r5
            r5 = 3
            r1[r5] = r23
            r5 = 4
            r1[r5] = r4
            r4 = 5
            r1[r4] = r0
            r0 = 6
            r1[r0] = r36
            r0 = 7
            r1[r0] = r35
            r0 = 8
            r1[r0] = r33
            r0 = 9
            r1[r0] = r32
            r0 = 10
            r1[r0] = r28
            r0 = 11
            java.lang.Integer r4 = java.lang.Integer.valueOf(r27)
            r1[r0] = r4
            r0 = 12
            java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
            r1[r0] = r4
            r0 = 13
            r8 = r24
            float r4 = r8.f12402o0
            int r5 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r5 == 0) goto L614
            int r5 = r8.f12401n0
            r6 = 2
            r9 = 1
            if (r5 == r6) goto L600
            if (r5 != r9) goto L5fd
            goto L600
        L5fd:
            java.lang.String r5 = "skewX"
            goto L602
        L600:
            java.lang.String r5 = "skewY"
        L602:
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r10 = 0
            r6[r10] = r5
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r6[r9] = r4
            java.lang.String r4 = "%s(%.2fdeg)"
            java.lang.String r4 = p371v5.C6552b0.m13318k(r4, r6)
            goto L617
        L614:
            r9 = 1
            r4 = r26
        L617:
            r1[r0] = r4
            java.lang.String r0 = "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>"
            java.lang.String r0 = p371v5.C6552b0.m13318k(r0, r1)
            r1 = r20
            r1.append(r0)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r4 = 0
            r0[r4] = r21
            java.lang.String r5 = "<span class='%s'>"
            java.lang.String r0 = p371v5.C6552b0.m13318k(r5, r0)
            r1.append(r0)
            android.text.Layout$Alignment r0 = r8.f12388a0
            if (r0 == 0) goto L652
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.String r0 = m2922c(r0)
            r5[r4] = r0
            java.lang.String r0 = "<span style='display:inline-block; text-align:%s;'>"
            java.lang.String r0 = p371v5.C6552b0.m13318k(r0, r5)
            r1.append(r0)
            java.lang.String r0 = r3.f5319a
            r1.append(r0)
            r0 = r25
            r1.append(r0)
            goto L659
        L652:
            r0 = r25
            java.lang.String r3 = r3.f5319a
            r1.append(r3)
        L659:
            r1.append(r0)
            java.lang.String r0 = "</div>"
            r1.append(r0)
            int r7 = r7 + 1
            r4 = 1067030938(0x3f99999a, float:1.2)
            r5 = 0
            r6 = 1
            r0 = r43
            r10 = r17
            r3 = r21
            r9 = r29
            goto Laa
        L672:
            java.lang.String r0 = "</div></body></html>"
            r1.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "<html><head><style>"
            r0.append(r3)
            java.util.Set r3 = r2.keySet()
            java.util.Iterator r3 = r3.iterator()
        L689:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L6ac
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            java.lang.String r5 = "{"
            r0.append(r5)
            java.lang.Object r4 = r2.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            java.lang.String r4 = "}"
            r0.append(r4)
            goto L689
        L6ac:
            java.lang.String r2 = "</style></head>"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = 0
            r1.insert(r2, r0)
            r0 = r43
            android.webkit.WebView r2 = r0.f5330b0
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r3 = p010a9.C0035c.f82c
            byte[] r1 = r1.getBytes(r3)
            r3 = 1
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r3)
            java.lang.String r3 = "text/html"
            java.lang.String r4 = "base64"
            r2.loadData(r1, r3, r4)
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            if (r1 == 0) goto L10
            java.util.List<i5.a> r1 = r0.f5331c0
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L10
            r0.m2924e()
        L10:
            return
    }
}
