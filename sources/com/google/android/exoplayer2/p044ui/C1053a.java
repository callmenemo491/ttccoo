package com.google.android.exoplayer2.p044ui;

/* renamed from: com.google.android.exoplayer2.ui.a */
/* loaded from: classes.dex */
public final class C1053a extends android.view.View implements com.google.android.exoplayer2.p044ui.SubtitleView.InterfaceC1049a {

    /* renamed from: a0 */
    public final java.util.List<p337t5.C6176f> f5312a0;

    /* renamed from: b0 */
    public java.util.List<p143i5.C3077a> f5313b0;

    /* renamed from: c0 */
    public int f5314c0;

    /* renamed from: d0 */
    public float f5315d0;

    /* renamed from: e0 */
    public p337t5.C6171a f5316e0;

    /* renamed from: f0 */
    public float f5317f0;

    public C1053a(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f5312a0 = r1
            java.util.List r1 = java.util.Collections.emptyList()
            r0.f5313b0 = r1
            r1 = 0
            r0.f5314c0 = r1
            r1 = 1029329178(0x3d5a511a, float:0.0533)
            r0.f5315d0 = r1
            t5.a r1 = p337t5.C6171a.f23900g
            r0.f5316e0 = r1
            r1 = 1034147594(0x3da3d70a, float:0.08)
            r0.f5317f0 = r1
            return
    }

    @Override // com.google.android.exoplayer2.p044ui.SubtitleView.InterfaceC1049a
    /* renamed from: a */
    public void mo2917a(java.util.List<p143i5.C3077a> r1, p337t5.C6171a r2, float r3, int r4, float r5) {
            r0 = this;
            r0.f5313b0 = r1
            r0.f5316e0 = r2
            r0.f5315d0 = r3
            r0.f5314c0 = r4
            r0.f5317f0 = r5
        La:
            java.util.List<t5.f> r2 = r0.f5312a0
            int r2 = r2.size()
            int r3 = r1.size()
            if (r2 >= r3) goto L25
            java.util.List<t5.f> r2 = r0.f5312a0
            t5.f r3 = new t5.f
            android.content.Context r4 = r0.getContext()
            r3.<init>(r4)
            r2.add(r3)
            goto La
        L25:
            r0.invalidate()
            return
    }

    @Override // android.view.View
    public void dispatchDraw(android.graphics.Canvas r40) {
            r39 = this;
            r0 = r39
            r1 = r40
            java.util.List<i5.a> r2 = r0.f5313b0
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto Ld
            return
        Ld:
            int r3 = r39.getHeight()
            int r4 = r39.getPaddingLeft()
            int r5 = r39.getPaddingTop()
            int r6 = r39.getWidth()
            int r7 = r39.getPaddingRight()
            int r6 = r6 - r7
            int r7 = r39.getPaddingBottom()
            int r7 = r3 - r7
            if (r7 <= r5) goto L4d6
            if (r6 > r4) goto L2e
            goto L4d6
        L2e:
            int r8 = r7 - r5
            int r9 = r0.f5314c0
            float r10 = r0.f5315d0
            float r9 = p337t5.C6178h.m12747b(r9, r10, r3, r8)
            r10 = 0
            int r11 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r11 > 0) goto L3e
            return
        L3e:
            int r11 = r2.size()
            r13 = 0
        L43:
            if (r13 >= r11) goto L4d6
            java.lang.Object r14 = r2.get(r13)
            i5.a r14 = (p143i5.C3077a) r14
            int r15 = r14.f12401n0
            r16 = 1065353216(0x3f800000, float:1.0)
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r15 == r10) goto L8a
            i5.a$b r15 = r14.m7534a()
            r12 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r15.f12410h = r12
            r15.f12411i = r10
            r10 = 0
            r15.f12405c = r10
            int r10 = r14.f12391d0
            if (r10 != 0) goto L6d
            float r10 = r14.f12390c0
            float r10 = r16 - r10
            r15.f12407e = r10
            r10 = 0
            goto L75
        L6d:
            float r10 = r14.f12390c0
            float r10 = -r10
            float r10 = r10 - r16
            r15.f12407e = r10
            r10 = 1
        L75:
            r15.f12408f = r10
            int r10 = r14.f12392e0
            if (r10 == 0) goto L83
            r12 = 2
            if (r10 == r12) goto L7f
            goto L86
        L7f:
            r10 = 0
            r15.f12409g = r10
            goto L86
        L83:
            r12 = 2
            r15.f12409g = r12
        L86:
            i5.a r14 = r15.m7535a()
        L8a:
            int r10 = r14.f12399l0
            float r12 = r14.f12400m0
            float r10 = p337t5.C6178h.m12747b(r10, r12, r3, r8)
            java.util.List<t5.f> r12 = r0.f5312a0
            java.lang.Object r12 = r12.get(r13)
            t5.f r12 = (p337t5.C6176f) r12
            t5.a r15 = r0.f5316e0
            r19 = r2
            float r2 = r0.f5317f0
            java.util.Objects.requireNonNull(r12)
            android.graphics.Bitmap r0 = r14.f12389b0
            if (r0 != 0) goto La9
            r0 = 1
            goto Laa
        La9:
            r0 = 0
        Laa:
            r20 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r21 = r3
            if (r0 == 0) goto Ld9
            java.lang.CharSequence r3 = r14.f12386Y
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto Lcd
            r0 = r1
            r31 = r4
            r32 = r5
            r33 = r6
            r34 = r7
            r20 = r8
            r35 = r9
            r22 = r11
        Lc7:
            r36 = r13
            r7 = 0
            r9 = 0
            goto L4bc
        Lcd:
            boolean r3 = r14.f12397j0
            if (r3 == 0) goto Ld4
            int r3 = r14.f12398k0
            goto Ld6
        Ld4:
            int r3 = r15.f23903c
        Ld6:
            r20 = r8
            goto Ldd
        Ld9:
            r20 = r8
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        Ldd:
            java.lang.CharSequence r8 = r12.f23965i
            r22 = r11
            java.lang.CharSequence r11 = r14.f12386Y
            if (r8 == r11) goto Lf0
            if (r8 == 0) goto Lee
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto Lee
            goto Lf0
        Lee:
            r8 = 0
            goto Lf1
        Lf0:
            r8 = 1
        Lf1:
            if (r8 == 0) goto L1a9
            android.text.Layout$Alignment r8 = r12.f23966j
            android.text.Layout$Alignment r11 = r14.f12387Z
            boolean r8 = p371v5.C6552b0.m13308a(r8, r11)
            if (r8 == 0) goto L1a9
            android.graphics.Bitmap r8 = r12.f23967k
            android.graphics.Bitmap r11 = r14.f12389b0
            if (r8 != r11) goto L1a9
            float r8 = r12.f23968l
            float r11 = r14.f12390c0
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 != 0) goto L1a9
            int r8 = r12.f23969m
            int r11 = r14.f12391d0
            if (r8 != r11) goto L1a9
            int r8 = r12.f23970n
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r11 = r14.f12392e0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r8 = p371v5.C6552b0.m13308a(r8, r11)
            if (r8 == 0) goto L1a9
            float r8 = r12.f23971o
            float r11 = r14.f12393f0
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 != 0) goto L1a9
            int r8 = r12.f23972p
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r11 = r14.f12394g0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r8 = p371v5.C6552b0.m13308a(r8, r11)
            if (r8 == 0) goto L1a9
            float r8 = r12.f23973q
            float r11 = r14.f12395h0
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 != 0) goto L1a9
            float r8 = r12.f23974r
            float r11 = r14.f12396i0
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 != 0) goto L1a9
            int r8 = r12.f23975s
            int r11 = r15.f23901a
            if (r8 != r11) goto L1a9
            int r8 = r12.f23976t
            int r11 = r15.f23902b
            if (r8 != r11) goto L1a9
            int r8 = r12.f23977u
            if (r8 != r3) goto L1a9
            int r8 = r12.f23979w
            int r11 = r15.f23904d
            if (r8 != r11) goto L1a9
            int r8 = r12.f23978v
            int r11 = r15.f23905e
            if (r8 != r11) goto L1a9
            android.text.TextPaint r8 = r12.f23962f
            android.graphics.Typeface r8 = r8.getTypeface()
            android.graphics.Typeface r11 = r15.f23906f
            boolean r8 = p371v5.C6552b0.m13308a(r8, r11)
            if (r8 == 0) goto L1a9
            float r8 = r12.f23980x
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 != 0) goto L1a9
            float r8 = r12.f23981y
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L1a9
            float r8 = r12.f23982z
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 != 0) goto L1a9
            int r8 = r12.f23947A
            if (r8 != r4) goto L1a9
            int r8 = r12.f23948B
            if (r8 != r5) goto L1a9
            int r8 = r12.f23949C
            if (r8 != r6) goto L1a9
            int r8 = r12.f23950D
            if (r8 != r7) goto L1a9
            r12.m12745a(r1, r0)
            r0 = r1
            r31 = r4
            r32 = r5
            r33 = r6
            r34 = r7
            r35 = r9
            goto Lc7
        L1a9:
            java.lang.CharSequence r8 = r14.f12386Y
            r12.f23965i = r8
            android.text.Layout$Alignment r8 = r14.f12387Z
            r12.f23966j = r8
            android.graphics.Bitmap r8 = r14.f12389b0
            r12.f23967k = r8
            float r8 = r14.f12390c0
            r12.f23968l = r8
            int r8 = r14.f12391d0
            r12.f23969m = r8
            int r8 = r14.f12392e0
            r12.f23970n = r8
            float r8 = r14.f12393f0
            r12.f23971o = r8
            int r8 = r14.f12394g0
            r12.f23972p = r8
            float r8 = r14.f12395h0
            r12.f23973q = r8
            float r8 = r14.f12396i0
            r12.f23974r = r8
            int r8 = r15.f23901a
            r12.f23975s = r8
            int r8 = r15.f23902b
            r12.f23976t = r8
            r12.f23977u = r3
            int r3 = r15.f23904d
            r12.f23979w = r3
            int r3 = r15.f23905e
            r12.f23978v = r3
            android.text.TextPaint r3 = r12.f23962f
            android.graphics.Typeface r8 = r15.f23906f
            r3.setTypeface(r8)
            r12.f23980x = r9
            r12.f23981y = r10
            r12.f23982z = r2
            r12.f23947A = r4
            r12.f23948B = r5
            r12.f23949C = r6
            r12.f23950D = r7
            if (r0 == 0) goto L435
            java.lang.CharSequence r2 = r12.f23965i
            java.util.Objects.requireNonNull(r2)
            java.lang.CharSequence r2 = r12.f23965i
            boolean r3 = r2 instanceof android.text.SpannableStringBuilder
            if (r3 == 0) goto L208
            android.text.SpannableStringBuilder r2 = (android.text.SpannableStringBuilder) r2
            goto L20f
        L208:
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r3 = r12.f23965i
            r2.<init>(r3)
        L20f:
            int r3 = r12.f23949C
            int r8 = r12.f23947A
            int r3 = r3 - r8
            int r8 = r12.f23950D
            int r10 = r12.f23948B
            int r8 = r8 - r10
            android.text.TextPaint r10 = r12.f23962f
            float r11 = r12.f23980x
            r10.setTextSize(r11)
            float r10 = r12.f23980x
            r11 = 1040187392(0x3e000000, float:0.125)
            float r10 = r10 * r11
            r11 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 + r11
            int r10 = (int) r10
            int r11 = r10 * 2
            int r14 = r3 - r11
            float r15 = r12.f23973q
            r18 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r23 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r23 == 0) goto L23b
            float r14 = (float) r14
            float r14 = r14 * r15
            int r14 = (int) r14
        L23b:
            java.lang.String r15 = "SubtitlePainter"
            if (r14 > 0) goto L259
            java.lang.String r2 = "Skipped drawing subtitle cue (insufficient space)"
            android.util.Log.w(r15, r2)
            r31 = r4
            r32 = r5
            r33 = r6
            r34 = r7
            r35 = r9
            r36 = r13
            r7 = 0
            r9 = 0
            r38 = r1
            r1 = r0
            r0 = r38
            goto L4b9
        L259:
            r31 = r4
            float r4 = r12.f23981y
            r32 = r5
            r17 = 0
            int r4 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r4 <= 0) goto L27c
            android.text.style.AbsoluteSizeSpan r4 = new android.text.style.AbsoluteSizeSpan
            float r5 = r12.f23981y
            int r5 = (int) r5
            r4.<init>(r5)
            int r5 = r2.length()
            r33 = r6
            r34 = r7
            r6 = 16711680(0xff0000, float:2.3418052E-38)
            r7 = 0
            r2.setSpan(r4, r7, r5, r6)
            goto L281
        L27c:
            r33 = r6
            r34 = r7
            r7 = 0
        L281:
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>(r2)
            int r5 = r12.f23979w
            r6 = 1
            if (r5 != r6) goto L2a7
            int r5 = r4.length()
            java.lang.Class<android.text.style.ForegroundColorSpan> r6 = android.text.style.ForegroundColorSpan.class
            java.lang.Object[] r5 = r4.getSpans(r7, r5, r6)
            android.text.style.ForegroundColorSpan[] r5 = (android.text.style.ForegroundColorSpan[]) r5
            int r6 = r5.length
            r7 = 0
        L299:
            if (r7 >= r6) goto L2a7
            r24 = r6
            r6 = r5[r7]
            r4.removeSpan(r6)
            int r7 = r7 + 1
            r6 = r24
            goto L299
        L2a7:
            int r5 = r12.f23976t
            int r5 = android.graphics.Color.alpha(r5)
            if (r5 <= 0) goto L2df
            int r5 = r12.f23979w
            if (r5 == 0) goto L2cb
            r6 = 2
            if (r5 != r6) goto L2b7
            goto L2cb
        L2b7:
            android.text.style.BackgroundColorSpan r5 = new android.text.style.BackgroundColorSpan
            int r6 = r12.f23976t
            r5.<init>(r6)
            int r6 = r4.length()
            r35 = r9
            r7 = 16711680(0xff0000, float:2.3418052E-38)
            r9 = 0
            r4.setSpan(r5, r9, r6, r7)
            goto L2e1
        L2cb:
            r35 = r9
            r7 = 16711680(0xff0000, float:2.3418052E-38)
            r9 = 0
            android.text.style.BackgroundColorSpan r5 = new android.text.style.BackgroundColorSpan
            int r6 = r12.f23976t
            r5.<init>(r6)
            int r6 = r2.length()
            r2.setSpan(r5, r9, r6, r7)
            goto L2e1
        L2df:
            r35 = r9
        L2e1:
            android.text.Layout$Alignment r5 = r12.f23966j
            if (r5 != 0) goto L2e7
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
        L2e7:
            android.text.StaticLayout r6 = new android.text.StaticLayout
            android.text.TextPaint r7 = r12.f23962f
            float r9 = r12.f23960d
            r36 = r13
            float r13 = r12.f23961e
            r30 = 1
            r23 = r6
            r24 = r2
            r25 = r7
            r26 = r14
            r27 = r5
            r28 = r9
            r29 = r13
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            r12.f23951E = r6
            int r6 = r6.getHeight()
            android.text.StaticLayout r7 = r12.f23951E
            int r7 = r7.getLineCount()
            r9 = 0
            r13 = 0
        L312:
            if (r9 >= r7) goto L331
            r23 = r7
            android.text.StaticLayout r7 = r12.f23951E
            float r7 = r7.getLineWidth(r9)
            r37 = r0
            double r0 = (double) r7
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            int r13 = java.lang.Math.max(r0, r13)
            int r9 = r9 + 1
            r1 = r40
            r7 = r23
            r0 = r37
            goto L312
        L331:
            r37 = r0
            float r0 = r12.f23973q
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L33f
            if (r13 >= r14) goto L33f
            goto L340
        L33f:
            r14 = r13
        L340:
            int r14 = r14 + r11
            float r0 = r12.f23971o
            int r7 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r7 == 0) goto L36d
            float r1 = (float) r3
            float r1 = r1 * r0
            int r0 = java.lang.Math.round(r1)
            int r1 = r12.f23947A
            int r0 = r0 + r1
            int r3 = r12.f23972p
            r7 = 1
            if (r3 == r7) goto L35c
            r7 = 2
            if (r3 == r7) goto L35a
            goto L361
        L35a:
            int r0 = r0 - r14
            goto L361
        L35c:
            r7 = 2
            int r0 = r0 * 2
            int r0 = r0 - r14
            int r0 = r0 / r7
        L361:
            int r0 = java.lang.Math.max(r0, r1)
            int r14 = r14 + r0
            int r1 = r12.f23949C
            int r1 = java.lang.Math.min(r14, r1)
            goto L375
        L36d:
            r7 = 2
            int r3 = r3 - r14
            int r3 = r3 / r7
            int r0 = r12.f23947A
            int r0 = r0 + r3
            int r1 = r0 + r14
        L375:
            int r1 = r1 - r0
            if (r1 > 0) goto L385
            java.lang.String r0 = "Skipped drawing subtitle cue (invalid horizontal positioning)"
            android.util.Log.w(r15, r0)
            r0 = r40
            r1 = r37
            r7 = 0
            r9 = 0
            goto L4b9
        L385:
            float r3 = r12.f23968l
            r7 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L3e9
            int r7 = r12.f23969m
            if (r7 != 0) goto L3ae
            float r7 = (float) r8
            float r7 = r7 * r3
            int r3 = java.lang.Math.round(r7)
            int r7 = r12.f23948B
            int r3 = r3 + r7
            int r7 = r12.f23970n
            r8 = 2
            if (r7 != r8) goto L3a4
            r7 = 0
            r9 = 0
            goto L3da
        L3a4:
            r9 = 1
            if (r7 != r9) goto L3ab
            int r3 = r3 * 2
            int r3 = r3 - r6
            int r3 = r3 / r8
        L3ab:
            r7 = 0
            r9 = 0
            goto L3db
        L3ae:
            android.text.StaticLayout r3 = r12.f23951E
            r7 = 0
            int r3 = r3.getLineBottom(r7)
            android.text.StaticLayout r8 = r12.f23951E
            int r8 = r8.getLineTop(r7)
            int r3 = r3 - r8
            float r8 = r12.f23968l
            r9 = 0
            int r11 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r11 < 0) goto L3ce
            float r3 = (float) r3
            float r8 = r8 * r3
            int r3 = java.lang.Math.round(r8)
            int r8 = r12.f23948B
            int r3 = r3 + r8
            goto L3db
        L3ce:
            float r8 = r8 + r16
            float r3 = (float) r3
            float r8 = r8 * r3
            int r3 = java.lang.Math.round(r8)
            int r8 = r12.f23950D
            int r3 = r3 + r8
        L3da:
            int r3 = r3 - r6
        L3db:
            int r8 = r3 + r6
            int r11 = r12.f23950D
            if (r8 <= r11) goto L3e4
            int r3 = r11 - r6
            goto L3f5
        L3e4:
            int r6 = r12.f23948B
            if (r3 >= r6) goto L3f5
            goto L3f6
        L3e9:
            r7 = 0
            r9 = 0
            int r3 = r12.f23950D
            int r3 = r3 - r6
            float r6 = (float) r8
            float r8 = r12.f23982z
            float r6 = r6 * r8
            int r6 = (int) r6
            int r3 = r3 - r6
        L3f5:
            r6 = r3
        L3f6:
            android.text.StaticLayout r3 = new android.text.StaticLayout
            android.text.TextPaint r8 = r12.f23962f
            float r11 = r12.f23960d
            float r13 = r12.f23961e
            r14 = 1
            r30 = 1
            r23 = r3
            r24 = r2
            r25 = r8
            r26 = r1
            r27 = r5
            r28 = r11
            r29 = r13
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            r12.f23951E = r3
            android.text.StaticLayout r2 = new android.text.StaticLayout
            android.text.TextPaint r3 = r12.f23962f
            float r8 = r12.f23960d
            float r11 = r12.f23961e
            r23 = r2
            r24 = r4
            r25 = r3
            r28 = r8
            r29 = r11
            r30 = r14
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            r12.f23952F = r2
            r12.f23953G = r0
            r12.f23954H = r6
            r12.f23955I = r10
            goto L4b5
        L435:
            r37 = r0
            r31 = r4
            r32 = r5
            r33 = r6
            r34 = r7
            r35 = r9
            r36 = r13
            r7 = 0
            r9 = 0
            android.graphics.Bitmap r0 = r12.f23967k
            java.util.Objects.requireNonNull(r0)
            android.graphics.Bitmap r0 = r12.f23967k
            int r1 = r12.f23949C
            int r2 = r12.f23947A
            int r1 = r1 - r2
            int r3 = r12.f23950D
            int r4 = r12.f23948B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r12.f23971o
            float r5 = r5 * r1
            float r5 = r5 + r2
            float r2 = (float) r4
            float r3 = (float) r3
            float r4 = r12.f23968l
            float r4 = r4 * r3
            float r4 = r4 + r2
            float r2 = r12.f23973q
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            float r2 = r12.f23974r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 == 0) goto L476
            goto L482
        L476:
            float r2 = (float) r1
            int r3 = r0.getHeight()
            float r3 = (float) r3
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r3 = r3 / r0
        L482:
            float r3 = r3 * r2
            int r0 = java.lang.Math.round(r3)
            int r2 = r12.f23972p
            r3 = 2
            if (r2 != r3) goto L48f
            float r2 = (float) r1
            goto L495
        L48f:
            r3 = 1
            if (r2 != r3) goto L496
            int r2 = r1 / 2
            float r2 = (float) r2
        L495:
            float r5 = r5 - r2
        L496:
            int r2 = java.lang.Math.round(r5)
            int r3 = r12.f23970n
            r5 = 2
            if (r3 != r5) goto L4a1
            float r3 = (float) r0
            goto L4a7
        L4a1:
            r5 = 1
            if (r3 != r5) goto L4a8
            int r3 = r0 / 2
            float r3 = (float) r3
        L4a7:
            float r4 = r4 - r3
        L4a8:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r12.f23956J = r4
        L4b5:
            r0 = r40
            r1 = r37
        L4b9:
            r12.m12745a(r0, r1)
        L4bc:
            int r13 = r36 + 1
            r1 = r0
            r2 = r19
            r8 = r20
            r3 = r21
            r11 = r22
            r4 = r31
            r5 = r32
            r6 = r33
            r7 = r34
            r9 = r35
            r10 = 0
            r0 = r39
            goto L43
        L4d6:
            return
    }
}
