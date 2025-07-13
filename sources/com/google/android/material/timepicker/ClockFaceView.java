package com.google.android.material.timepicker;

/* loaded from: classes.dex */
class ClockFaceView extends com.google.android.material.timepicker.C1228c implements com.google.android.material.timepicker.ClockHandView.InterfaceC1224c {

    /* renamed from: A0 */
    public final float[] f6505A0;

    /* renamed from: B0 */
    public final int f6506B0;

    /* renamed from: C0 */
    public final int f6507C0;

    /* renamed from: D0 */
    public final int f6508D0;

    /* renamed from: E0 */
    public final int f6509E0;

    /* renamed from: F0 */
    public java.lang.String[] f6510F0;

    /* renamed from: G0 */
    public float f6511G0;

    /* renamed from: H0 */
    public final android.content.res.ColorStateList f6512H0;

    /* renamed from: u0 */
    public final com.google.android.material.timepicker.ClockHandView f6513u0;

    /* renamed from: v0 */
    public final android.graphics.Rect f6514v0;

    /* renamed from: w0 */
    public final android.graphics.RectF f6515w0;

    /* renamed from: x0 */
    public final android.util.SparseArray<android.widget.TextView> f6516x0;

    /* renamed from: y0 */
    public final p227n0.C4641a f6517y0;

    /* renamed from: z0 */
    public final int[] f6518z0;

    public ClockFaceView(android.content.Context r10, android.util.AttributeSet r11) {
            r9 = this;
            r0 = 2130969239(0x7f040297, float:1.7547154E38)
            r9.<init>(r10, r11, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r9.f6514v0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r9.f6515w0 = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r9.f6516x0 = r1
            r2 = 3
            float[] r3 = new float[r2]
            r3 = {x0132: FILL_ARRAY_DATA , data: [0, 1063675494, 1065353216} // fill-array
            r9.f6505A0 = r3
            int[] r3 = p339t7.C6183a.f24014k
            r4 = 2132018007(0x7f140357, float:1.9674308E38)
            android.content.res.TypedArray r11 = r10.obtainStyledAttributes(r11, r3, r0, r4)
            android.content.res.Resources r0 = r9.getResources()
            r3 = 1
            android.content.res.ColorStateList r4 = p288q8.C5599c.m11875a(r10, r11, r3)
            r9.f6512H0 = r4
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r10)
            r6 = 2131558498(0x7f0d0062, float:1.8742314E38)
            r5.inflate(r6, r9, r3)
            r5 = 2131362322(0x7f0a0212, float:1.8344421E38)
            android.view.View r5 = r9.findViewById(r5)
            com.google.android.material.timepicker.ClockHandView r5 = (com.google.android.material.timepicker.ClockHandView) r5
            r9.f6513u0 = r5
            r6 = 2131165420(0x7f0700ec, float:1.7945057E38)
            int r6 = r0.getDimensionPixelSize(r6)
            r9.f6506B0 = r6
            int[] r6 = new int[r3]
            r7 = 16842913(0x10100a1, float:2.369401E-38)
            r8 = 0
            r6[r8] = r7
            int r7 = r4.getDefaultColor()
            int r6 = r4.getColorForState(r6, r7)
            int[] r2 = new int[r2]
            r2[r8] = r6
            r2[r3] = r6
            int r4 = r4.getDefaultColor()
            r6 = 2
            r2[r6] = r4
            r9.f6518z0 = r2
            java.util.List<com.google.android.material.timepicker.ClockHandView$c> r2 = r5.f6524e0
            r2.add(r9)
            r2 = 2131099850(0x7f0600ca, float:1.7812065E38)
            android.content.res.ColorStateList r2 = p102g.C2199a.m5783a(r10, r2)
            int r2 = r2.getDefaultColor()
            android.content.res.ColorStateList r10 = p288q8.C5599c.m11875a(r10, r11, r8)
            if (r10 != 0) goto L8b
            goto L8f
        L8b:
            int r2 = r10.getDefaultColor()
        L8f:
            r9.setBackgroundColor(r2)
            android.view.ViewTreeObserver r10 = r9.getViewTreeObserver()
            com.google.android.material.timepicker.a r2 = new com.google.android.material.timepicker.a
            r2.<init>(r9)
            r10.addOnPreDrawListener(r2)
            r9.setFocusable(r3)
            r11.recycle()
            com.google.android.material.timepicker.b r10 = new com.google.android.material.timepicker.b
            r10.<init>(r9)
            r9.f6517y0 = r10
            r10 = 12
            java.lang.String[] r10 = new java.lang.String[r10]
            java.lang.String r11 = ""
            java.util.Arrays.fill(r10, r11)
            r9.f6510F0 = r10
            android.content.Context r10 = r9.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            int r11 = r1.size()
            r1 = 0
        Lc3:
            java.lang.String[] r2 = r9.f6510F0
            int r2 = r2.length
            int r2 = java.lang.Math.max(r2, r11)
            if (r1 >= r2) goto L116
            android.util.SparseArray<android.widget.TextView> r2 = r9.f6516x0
            java.lang.Object r2 = r2.get(r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String[] r3 = r9.f6510F0
            int r3 = r3.length
            if (r1 < r3) goto Le2
            r9.removeView(r2)
            android.util.SparseArray<android.widget.TextView> r2 = r9.f6516x0
            r2.remove(r1)
            goto L113
        Le2:
            if (r2 != 0) goto Lf5
            r2 = 2131558497(0x7f0d0061, float:1.8742311E38)
            android.view.View r2 = r10.inflate(r2, r9, r8)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.util.SparseArray<android.widget.TextView> r3 = r9.f6516x0
            r3.put(r1, r2)
            r9.addView(r2)
        Lf5:
            r2.setVisibility(r8)
            java.lang.String[] r3 = r9.f6510F0
            r3 = r3[r1]
            r2.setText(r3)
            r3 = 2131362338(0x7f0a0222, float:1.8344454E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r2.setTag(r3, r4)
            n0.a r3 = r9.f6517y0
            p227n0.C4661t.m10546v(r2, r3)
            android.content.res.ColorStateList r3 = r9.f6512H0
            r2.setTextColor(r3)
        L113:
            int r1 = r1 + 1
            goto Lc3
        L116:
            r10 = 2131165448(0x7f070108, float:1.7945113E38)
            int r10 = r0.getDimensionPixelSize(r10)
            r9.f6507C0 = r10
            r10 = 2131165449(0x7f070109, float:1.7945115E38)
            int r10 = r0.getDimensionPixelSize(r10)
            r9.f6508D0 = r10
            r10 = 2131165426(0x7f0700f2, float:1.7945069E38)
            int r10 = r0.getDimensionPixelSize(r10)
            r9.f6509E0 = r10
            return
    }

    @Override // com.google.android.material.timepicker.ClockHandView.InterfaceC1224c
    /* renamed from: a */
    public void mo3608a(float r2, boolean r3) {
            r1 = this;
            float r3 = r1.f6511G0
            float r3 = r3 - r2
            float r3 = java.lang.Math.abs(r3)
            r0 = 981668463(0x3a83126f, float:0.001)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L13
            r1.f6511G0 = r2
            r1.m3609t()
        L13:
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r4) {
            r3 = this;
            super.onInitializeAccessibilityNodeInfo(r4)
            java.lang.String[] r0 = r3.f6510F0
            int r0 = r0.length
            r1 = 0
            r2 = 1
            o0.b$b r0 = p242o0.C4868b.b.m11001a(r2, r0, r1, r2)
            java.lang.Object r0 = r0.f19352a
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r0 = (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) r0
            r4.setCollectionInfo(r0)
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r0.m3609t()
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int r3, int r4) {
            r2 = this;
            android.content.res.Resources r3 = r2.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r4 = r3.heightPixels
            float r4 = (float) r4
            int r3 = r3.widthPixels
            float r3 = (float) r3
            int r0 = r2.f6509E0
            float r0 = (float) r0
            int r1 = r2.f6507C0
            float r1 = (float) r1
            float r1 = r1 / r4
            int r4 = r2.f6508D0
            float r4 = (float) r4
            float r4 = r4 / r3
            float r3 = java.lang.Math.max(r1, r4)
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = java.lang.Math.max(r3, r4)
            float r0 = r0 / r3
            int r3 = (int) r0
            r4 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4)
            r2.setMeasuredDimension(r3, r3)
            super.onMeasure(r4, r4)
            return
    }

    /* renamed from: t */
    public final void m3609t() {
            r11 = this;
            com.google.android.material.timepicker.ClockHandView r0 = r11.f6513u0
            android.graphics.RectF r0 = r0.f6528i0
            r1 = 0
        L5:
            android.util.SparseArray<android.widget.TextView> r2 = r11.f6516x0
            int r2 = r2.size()
            if (r1 >= r2) goto L75
            android.util.SparseArray<android.widget.TextView> r2 = r11.f6516x0
            java.lang.Object r2 = r2.get(r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 != 0) goto L18
            goto L72
        L18:
            android.graphics.Rect r3 = r11.f6514v0
            r2.getDrawingRect(r3)
            android.graphics.Rect r3 = r11.f6514v0
            int r4 = r2.getPaddingLeft()
            int r5 = r2.getPaddingTop()
            r3.offset(r4, r5)
            android.graphics.Rect r3 = r11.f6514v0
            r11.offsetDescendantRectToMyCoords(r2, r3)
            android.graphics.RectF r3 = r11.f6515w0
            android.graphics.Rect r4 = r11.f6514v0
            r3.set(r4)
            android.graphics.RectF r3 = r11.f6515w0
            boolean r3 = android.graphics.RectF.intersects(r0, r3)
            if (r3 != 0) goto L40
            r3 = 0
            goto L68
        L40:
            android.graphics.RadialGradient r3 = new android.graphics.RadialGradient
            float r4 = r0.centerX()
            android.graphics.RectF r5 = r11.f6515w0
            float r5 = r5.left
            float r5 = r4 - r5
            float r4 = r0.centerY()
            android.graphics.RectF r6 = r11.f6515w0
            float r6 = r6.top
            float r6 = r4 - r6
            float r4 = r0.width()
            r7 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 * r4
            int[] r8 = r11.f6518z0
            float[] r9 = r11.f6505A0
            android.graphics.Shader$TileMode r10 = android.graphics.Shader.TileMode.CLAMP
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10)
        L68:
            android.text.TextPaint r4 = r2.getPaint()
            r4.setShader(r3)
            r2.invalidate()
        L72:
            int r1 = r1 + 1
            goto L5
        L75:
            return
    }
}
