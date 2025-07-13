package com.google.android.material.imageview;

/* loaded from: classes.dex */
public class ShapeableImageView extends androidx.appcompat.widget.AppCompatImageView implements p340t8.InterfaceC6196m {

    /* renamed from: c0 */
    public final p340t8.C6193j f6214c0;

    /* renamed from: d0 */
    public final android.graphics.RectF f6215d0;

    /* renamed from: e0 */
    public final android.graphics.RectF f6216e0;

    /* renamed from: f0 */
    public final android.graphics.Paint f6217f0;

    /* renamed from: g0 */
    public final android.graphics.Paint f6218g0;

    /* renamed from: h0 */
    public final android.graphics.Path f6219h0;

    /* renamed from: i0 */
    public android.content.res.ColorStateList f6220i0;

    /* renamed from: j0 */
    public p340t8.C6189f f6221j0;

    /* renamed from: k0 */
    public p340t8.C6192i f6222k0;

    /* renamed from: l0 */
    public float f6223l0;

    /* renamed from: m0 */
    public android.graphics.Path f6224m0;

    /* renamed from: n0 */
    public int f6225n0;

    /* renamed from: o0 */
    public int f6226o0;

    /* renamed from: p0 */
    public int f6227p0;

    /* renamed from: q0 */
    public int f6228q0;

    /* renamed from: r0 */
    public int f6229r0;

    /* renamed from: s0 */
    public int f6230s0;

    /* renamed from: t0 */
    public boolean f6231t0;

    @android.annotation.TargetApi(21)
    /* renamed from: com.google.android.material.imageview.ShapeableImageView$a */
    public class C1194a extends android.view.ViewOutlineProvider {

        /* renamed from: a */
        public final android.graphics.Rect f6232a;

        /* renamed from: b */
        public final /* synthetic */ com.google.android.material.imageview.ShapeableImageView f6233b;

        public C1194a(com.google.android.material.imageview.ShapeableImageView r1) {
                r0 = this;
                r0.f6233b = r1
                r0.<init>()
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.f6232a = r1
                return
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(android.view.View r3, android.graphics.Outline r4) {
                r2 = this;
                com.google.android.material.imageview.ShapeableImageView r3 = r2.f6233b
                t8.i r0 = r3.f6222k0
                if (r0 != 0) goto L7
                return
            L7:
                t8.f r0 = r3.f6221j0
                if (r0 != 0) goto L16
                t8.f r0 = new t8.f
                com.google.android.material.imageview.ShapeableImageView r1 = r2.f6233b
                t8.i r1 = r1.f6222k0
                r0.<init>(r1)
                r3.f6221j0 = r0
            L16:
                com.google.android.material.imageview.ShapeableImageView r3 = r2.f6233b
                android.graphics.RectF r3 = r3.f6215d0
                android.graphics.Rect r0 = r2.f6232a
                r3.round(r0)
                com.google.android.material.imageview.ShapeableImageView r3 = r2.f6233b
                t8.f r3 = r3.f6221j0
                android.graphics.Rect r0 = r2.f6232a
                r3.setBounds(r0)
                com.google.android.material.imageview.ShapeableImageView r3 = r2.f6233b
                t8.f r3 = r3.f6221j0
                r3.getOutline(r4)
                return
        }
    }

    public ShapeableImageView(android.content.Context r7, android.util.AttributeSet r8) {
            r6 = this;
            r0 = 2132017984(0x7f140340, float:1.9674262E38)
            r1 = 0
            android.content.Context r7 = p431y8.C7133a.m14245a(r7, r8, r1, r0)
            r6.<init>(r7, r8, r1)
            t8.j r7 = p340t8.C6193j.a.f24118a
            r6.f6214c0 = r7
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r6.f6219h0 = r7
            r6.f6231t0 = r1
            android.content.Context r7 = r6.getContext()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r6.f6218g0 = r2
            r3 = 1
            r2.setAntiAlias(r3)
            r4 = -1
            r2.setColor(r4)
            android.graphics.PorterDuffXfermode r4 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.DST_OUT
            r4.<init>(r5)
            r2.setXfermode(r4)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f6215d0 = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f6216e0 = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r6.f6224m0 = r2
            int[] r2 = p339t7.C6183a.f23996I
            android.content.res.TypedArray r2 = r7.obtainStyledAttributes(r8, r2, r1, r0)
            r4 = 9
            android.content.res.ColorStateList r4 = p288q8.C5599c.m11875a(r7, r2, r4)
            r6.f6220i0 = r4
            r4 = 10
            int r4 = r2.getDimensionPixelSize(r4, r1)
            float r4 = (float) r4
            r6.f6223l0 = r4
            int r4 = r2.getDimensionPixelSize(r1, r1)
            r6.f6225n0 = r4
            r6.f6226o0 = r4
            r6.f6227p0 = r4
            r6.f6228q0 = r4
            r5 = 3
            int r5 = r2.getDimensionPixelSize(r5, r4)
            r6.f6225n0 = r5
            r5 = 6
            int r5 = r2.getDimensionPixelSize(r5, r4)
            r6.f6226o0 = r5
            r5 = 4
            int r5 = r2.getDimensionPixelSize(r5, r4)
            r6.f6227p0 = r5
            int r4 = r2.getDimensionPixelSize(r3, r4)
            r6.f6228q0 = r4
            r4 = 5
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            int r4 = r2.getDimensionPixelSize(r4, r5)
            r6.f6229r0 = r4
            r4 = 2
            int r4 = r2.getDimensionPixelSize(r4, r5)
            r6.f6230s0 = r4
            r2.recycle()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r6.f6217f0 = r2
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r4)
            r2.setAntiAlias(r3)
            t8.i$b r7 = p340t8.C6192i.m12783b(r7, r8, r1, r0)
            t8.i r7 = r7.m12788a()
            r6.f6222k0 = r7
            com.google.android.material.imageview.ShapeableImageView$a r7 = new com.google.android.material.imageview.ShapeableImageView$a
            r7.<init>(r6)
            r6.setOutlineProvider(r7)
            return
    }

    /* renamed from: c */
    public final boolean m3492c() {
            r2 = this;
            int r0 = r2.f6229r0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto Ld
            int r0 = r2.f6230s0
            if (r0 == r1) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    /* renamed from: d */
    public final boolean m3493d() {
            r2 = this;
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    /* renamed from: e */
    public final void m3494e(int r12, int r13) {
            r11 = this;
            android.graphics.RectF r0 = r11.f6215d0
            int r1 = r11.getPaddingLeft()
            float r1 = (float) r1
            int r2 = r11.getPaddingTop()
            float r2 = (float) r2
            int r3 = r11.getPaddingRight()
            int r3 = r12 - r3
            float r3 = (float) r3
            int r4 = r11.getPaddingBottom()
            int r4 = r13 - r4
            float r4 = (float) r4
            r0.set(r1, r2, r3, r4)
            t8.j r5 = r11.f6214c0
            t8.i r6 = r11.f6222k0
            android.graphics.RectF r8 = r11.f6215d0
            android.graphics.Path r10 = r11.f6219h0
            r7 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r5.m12794a(r6, r7, r8, r9, r10)
            android.graphics.Path r0 = r11.f6224m0
            r0.rewind()
            android.graphics.Path r0 = r11.f6224m0
            android.graphics.Path r1 = r11.f6219h0
            r0.addPath(r1)
            android.graphics.RectF r0 = r11.f6216e0
            float r12 = (float) r12
            float r13 = (float) r13
            r1 = 0
            r0.set(r1, r1, r12, r13)
            android.graphics.Path r12 = r11.f6224m0
            android.graphics.RectF r13 = r11.f6216e0
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CCW
            r12.addRect(r13, r0)
            return
    }

    public int getContentPaddingBottom() {
            r1 = this;
            int r0 = r1.f6228q0
            return r0
    }

    public final int getContentPaddingEnd() {
            r2 = this;
            int r0 = r2.f6230s0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            return r0
        L7:
            boolean r0 = r2.m3493d()
            if (r0 == 0) goto L10
            int r0 = r2.f6225n0
            goto L12
        L10:
            int r0 = r2.f6227p0
        L12:
            return r0
    }

    public int getContentPaddingLeft() {
            r2 = this;
            boolean r0 = r2.m3492c()
            if (r0 == 0) goto L1e
            boolean r0 = r2.m3493d()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L13
            int r0 = r2.f6230s0
            if (r0 == r1) goto L13
            return r0
        L13:
            boolean r0 = r2.m3493d()
            if (r0 != 0) goto L1e
            int r0 = r2.f6229r0
            if (r0 == r1) goto L1e
            return r0
        L1e:
            int r0 = r2.f6225n0
            return r0
    }

    public int getContentPaddingRight() {
            r2 = this;
            boolean r0 = r2.m3492c()
            if (r0 == 0) goto L1e
            boolean r0 = r2.m3493d()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L13
            int r0 = r2.f6229r0
            if (r0 == r1) goto L13
            return r0
        L13:
            boolean r0 = r2.m3493d()
            if (r0 != 0) goto L1e
            int r0 = r2.f6230s0
            if (r0 == r1) goto L1e
            return r0
        L1e:
            int r0 = r2.f6227p0
            return r0
    }

    public final int getContentPaddingStart() {
            r2 = this;
            int r0 = r2.f6229r0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            return r0
        L7:
            boolean r0 = r2.m3493d()
            if (r0 == 0) goto L10
            int r0 = r2.f6227p0
            goto L12
        L10:
            int r0 = r2.f6225n0
        L12:
            return r0
    }

    public int getContentPaddingTop() {
            r1 = this;
            int r0 = r1.f6226o0
            return r0
    }

    @Override // android.view.View
    public int getPaddingBottom() {
            r2 = this;
            int r0 = super.getPaddingBottom()
            int r1 = r2.getContentPaddingBottom()
            int r0 = r0 - r1
            return r0
    }

    @Override // android.view.View
    public int getPaddingEnd() {
            r2 = this;
            int r0 = super.getPaddingEnd()
            int r1 = r2.getContentPaddingEnd()
            int r0 = r0 - r1
            return r0
    }

    @Override // android.view.View
    public int getPaddingLeft() {
            r2 = this;
            int r0 = super.getPaddingLeft()
            int r1 = r2.getContentPaddingLeft()
            int r0 = r0 - r1
            return r0
    }

    @Override // android.view.View
    public int getPaddingRight() {
            r2 = this;
            int r0 = super.getPaddingRight()
            int r1 = r2.getContentPaddingRight()
            int r0 = r0 - r1
            return r0
    }

    @Override // android.view.View
    public int getPaddingStart() {
            r2 = this;
            int r0 = super.getPaddingStart()
            int r1 = r2.getContentPaddingStart()
            int r0 = r0 - r1
            return r0
    }

    @Override // android.view.View
    public int getPaddingTop() {
            r2 = this;
            int r0 = super.getPaddingTop()
            int r1 = r2.getContentPaddingTop()
            int r0 = r0 - r1
            return r0
    }

    public p340t8.C6192i getShapeAppearanceModel() {
            r1 = this;
            t8.i r0 = r1.f6222k0
            return r0
    }

    public android.content.res.ColorStateList getStrokeColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f6220i0
            return r0
    }

    public float getStrokeWidth() {
            r1 = this;
            float r0 = r1.f6223l0
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            r0 = 2
            r1 = 0
            r2.setLayerType(r0, r1)
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.setLayerType(r0, r1)
            super.onDetachedFromWindow()
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas r4) {
            r3 = this;
            super.onDraw(r4)
            android.graphics.Path r0 = r3.f6224m0
            android.graphics.Paint r1 = r3.f6218g0
            r4.drawPath(r0, r1)
            android.content.res.ColorStateList r0 = r3.f6220i0
            if (r0 != 0) goto Lf
            goto L3b
        Lf:
            android.graphics.Paint r0 = r3.f6217f0
            float r1 = r3.f6223l0
            r0.setStrokeWidth(r1)
            android.content.res.ColorStateList r0 = r3.f6220i0
            int[] r1 = r3.getDrawableState()
            android.content.res.ColorStateList r2 = r3.f6220i0
            int r2 = r2.getDefaultColor()
            int r0 = r0.getColorForState(r1, r2)
            float r1 = r3.f6223l0
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L3b
            if (r0 == 0) goto L3b
            android.graphics.Paint r1 = r3.f6217f0
            r1.setColor(r0)
            android.graphics.Path r0 = r3.f6219h0
            android.graphics.Paint r1 = r3.f6217f0
            r4.drawPath(r0, r1)
        L3b:
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int r3, int r4) {
            r2 = this;
            super.onMeasure(r3, r4)
            boolean r3 = r2.f6231t0
            if (r3 == 0) goto L8
            return
        L8:
            boolean r3 = r2.isLayoutDirectionResolved()
            if (r3 != 0) goto Lf
            return
        Lf:
            r3 = 1
            r2.f6231t0 = r3
            boolean r3 = r2.isPaddingRelative()
            if (r3 != 0) goto L33
            boolean r3 = r2.m3492c()
            if (r3 == 0) goto L1f
            goto L33
        L1f:
            int r3 = super.getPaddingLeft()
            int r4 = super.getPaddingTop()
            int r0 = super.getPaddingRight()
            int r1 = super.getPaddingBottom()
            r2.setPadding(r3, r4, r0, r1)
            return
        L33:
            int r3 = super.getPaddingStart()
            int r4 = super.getPaddingTop()
            int r0 = super.getPaddingEnd()
            int r1 = super.getPaddingBottom()
            r2.setPaddingRelative(r3, r4, r0, r1)
            return
    }

    @Override // android.view.View
    public void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            r0.m3494e(r1, r2)
            return
    }

    @Override // android.view.View
    public void setPadding(int r2, int r3, int r4, int r5) {
            r1 = this;
            int r0 = r1.getContentPaddingLeft()
            int r0 = r0 + r2
            int r2 = r1.getContentPaddingTop()
            int r2 = r2 + r3
            int r3 = r1.getContentPaddingRight()
            int r3 = r3 + r4
            int r4 = r1.getContentPaddingBottom()
            int r4 = r4 + r5
            super.setPadding(r0, r2, r3, r4)
            return
    }

    @Override // android.view.View
    public void setPaddingRelative(int r2, int r3, int r4, int r5) {
            r1 = this;
            int r0 = r1.getContentPaddingStart()
            int r0 = r0 + r2
            int r2 = r1.getContentPaddingTop()
            int r2 = r2 + r3
            int r3 = r1.getContentPaddingEnd()
            int r3 = r3 + r4
            int r4 = r1.getContentPaddingBottom()
            int r4 = r4 + r5
            super.setPaddingRelative(r0, r2, r3, r4)
            return
    }

    @Override // p340t8.InterfaceC6196m
    public void setShapeAppearanceModel(p340t8.C6192i r3) {
            r2 = this;
            r2.f6222k0 = r3
            t8.f r0 = r2.f6221j0
            if (r0 == 0) goto Ld
            t8.f$b r1 = r0.f24036Y
            r1.f24059a = r3
            r0.invalidateSelf()
        Ld:
            int r3 = r2.getWidth()
            int r0 = r2.getHeight()
            r2.m3494e(r3, r0)
            r2.invalidate()
            r2.invalidateOutline()
            return
    }

    public void setStrokeColor(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.f6220i0 = r1
            r0.invalidate()
            return
    }

    public void setStrokeColorResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = p102g.C2199a.m5783a(r0, r2)
            r1.setStrokeColor(r2)
            return
    }

    public void setStrokeWidth(float r2) {
            r1 = this;
            float r0 = r1.f6223l0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.f6223l0 = r2
            r1.invalidate()
        Lb:
            return
    }

    public void setStrokeWidthResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            float r2 = (float) r2
            r1.setStrokeWidth(r2)
            return
    }
}
