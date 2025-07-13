package com.google.android.material.card;

/* loaded from: classes.dex */
public class MaterialCardView extends androidx.cardview.widget.CardView implements android.widget.Checkable, p340t8.InterfaceC6196m {

    /* renamed from: o0 */
    public static final int[] f5935o0 = null;

    /* renamed from: p0 */
    public static final int[] f5936p0 = null;

    /* renamed from: q0 */
    public static final int[] f5937q0 = null;

    /* renamed from: j0 */
    public final p038c8.C0935a f5938j0;

    /* renamed from: k0 */
    public boolean f5939k0;

    /* renamed from: l0 */
    public boolean f5940l0;

    /* renamed from: m0 */
    public boolean f5941m0;

    /* renamed from: n0 */
    public com.google.android.material.card.MaterialCardView.InterfaceC1145a f5942n0;

    /* renamed from: com.google.android.material.card.MaterialCardView$a */
    public interface InterfaceC1145a {
        /* renamed from: a */
        void m3326a(com.google.android.material.card.MaterialCardView r1, boolean r2);
    }

    static {
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16842911(0x101009f, float:2.3694004E-38)
            r3 = 0
            r1[r3] = r2
            com.google.android.material.card.MaterialCardView.f5935o0 = r1
            int[] r1 = new int[r0]
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r1[r3] = r2
            com.google.android.material.card.MaterialCardView.f5936p0 = r1
            int[] r0 = new int[r0]
            r1 = 2130969480(0x7f040388, float:1.7547643E38)
            r0[r3] = r1
            com.google.android.material.card.MaterialCardView.f5937q0 = r0
            return
    }

    public MaterialCardView(android.content.Context r10, android.util.AttributeSet r11) {
            r9 = this;
            r0 = 2132017930(0x7f14030a, float:1.9674152E38)
            r1 = 2130969237(0x7f040295, float:1.754715E38)
            android.content.Context r10 = p431y8.C7133a.m14245a(r10, r11, r1, r0)
            r9.<init>(r10, r11, r1)
            r10 = 0
            r9.f5940l0 = r10
            r9.f5941m0 = r10
            r2 = 1
            r9.f5939k0 = r2
            android.content.Context r3 = r9.getContext()
            int[] r5 = p339t7.C6183a.f24027x
            int[] r8 = new int[r10]
            r7 = 2132017930(0x7f14030a, float:1.9674152E38)
            r6 = 2130969237(0x7f040295, float:1.754715E38)
            r4 = r11
            android.content.res.TypedArray r3 = p220m8.C4429m.m9881d(r3, r4, r5, r6, r7, r8)
            c8.a r4 = new c8.a
            r4.<init>(r9, r11, r1, r0)
            r9.f5938j0 = r4
            android.content.res.ColorStateList r11 = super.getCardBackgroundColor()
            t8.f r0 = r4.f4885c
            r0.m12773q(r11)
            int r11 = super.getContentPaddingLeft()
            int r0 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r5 = super.getContentPaddingBottom()
            android.graphics.Rect r6 = r4.f4884b
            r6.set(r11, r0, r1, r5)
            r4.m2650k()
            com.google.android.material.card.MaterialCardView r11 = r4.f4883a
            android.content.Context r11 = r11.getContext()
            r0 = 10
            android.content.res.ColorStateList r11 = p288q8.C5599c.m11875a(r11, r3, r0)
            r4.f4895m = r11
            if (r11 != 0) goto L67
            r11 = -1
            android.content.res.ColorStateList r11 = android.content.res.ColorStateList.valueOf(r11)
            r4.f4895m = r11
        L67:
            r11 = 11
            int r11 = r3.getDimensionPixelSize(r11, r10)
            r4.f4889g = r11
            boolean r11 = r3.getBoolean(r10, r10)
            r4.f4901s = r11
            com.google.android.material.card.MaterialCardView r0 = r4.f4883a
            r0.setLongClickable(r11)
            com.google.android.material.card.MaterialCardView r11 = r4.f4883a
            android.content.Context r11 = r11.getContext()
            r0 = 5
            android.content.res.ColorStateList r11 = p288q8.C5599c.m11875a(r11, r3, r0)
            r4.f4893k = r11
            com.google.android.material.card.MaterialCardView r11 = r4.f4883a
            android.content.Context r11 = r11.getContext()
            r0 = 2
            android.graphics.drawable.Drawable r11 = p288q8.C5599c.m11878d(r11, r3, r0)
            r4.m2646g(r11)
            r11 = 4
            int r11 = r3.getDimensionPixelSize(r11, r10)
            r4.f4888f = r11
            r11 = 3
            int r11 = r3.getDimensionPixelSize(r11, r10)
            r4.f4887e = r11
            com.google.android.material.card.MaterialCardView r11 = r4.f4883a
            android.content.Context r11 = r11.getContext()
            r0 = 6
            android.content.res.ColorStateList r11 = p288q8.C5599c.m11875a(r11, r3, r0)
            r4.f4892j = r11
            if (r11 != 0) goto Lc1
            com.google.android.material.card.MaterialCardView r11 = r4.f4883a
            r0 = 2130968822(0x7f0400f6, float:1.7546308E38)
            int r11 = p124h7.C2939x3.m7286l(r11, r0)
            android.content.res.ColorStateList r11 = android.content.res.ColorStateList.valueOf(r11)
            r4.f4892j = r11
        Lc1:
            com.google.android.material.card.MaterialCardView r11 = r4.f4883a
            android.content.Context r11 = r11.getContext()
            android.content.res.ColorStateList r11 = p288q8.C5599c.m11875a(r11, r3, r2)
            t8.f r0 = r4.f4886d
            if (r11 != 0) goto Ld3
            android.content.res.ColorStateList r11 = android.content.res.ColorStateList.valueOf(r10)
        Ld3:
            r0.m12773q(r11)
            r4.m2652m()
            t8.f r10 = r4.f4885c
            com.google.android.material.card.MaterialCardView r11 = r4.f4883a
            float r11 = r11.getCardElevation()
            r10.m12772p(r11)
            r4.m2653n()
            com.google.android.material.card.MaterialCardView r10 = r4.f4883a
            t8.f r11 = r4.f4885c
            android.graphics.drawable.Drawable r11 = r4.m2645f(r11)
            r10.setBackgroundInternal(r11)
            com.google.android.material.card.MaterialCardView r10 = r4.f4883a
            boolean r10 = r10.isClickable()
            if (r10 == 0) goto Lff
            android.graphics.drawable.Drawable r10 = r4.m2644e()
            goto L101
        Lff:
            t8.f r10 = r4.f4886d
        L101:
            r4.f4890h = r10
            com.google.android.material.card.MaterialCardView r11 = r4.f4883a
            android.graphics.drawable.Drawable r10 = r4.m2645f(r10)
            r11.setForeground(r10)
            r3.recycle()
            return
    }

    private android.graphics.RectF getBoundsAsRectF() {
            r2 = this;
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            c8.a r1 = r2.f5938j0
            t8.f r1 = r1.f4885c
            android.graphics.Rect r1 = r1.getBounds()
            r0.set(r1)
            return r0
    }

    /* renamed from: d */
    public final void m3324d() {
            r8 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 <= r1) goto L2a
            c8.a r0 = r8.f5938j0
            android.graphics.drawable.Drawable r1 = r0.f4896n
            if (r1 == 0) goto L2a
            android.graphics.Rect r1 = r1.getBounds()
            int r2 = r1.bottom
            android.graphics.drawable.Drawable r3 = r0.f4896n
            int r4 = r1.left
            int r5 = r1.top
            int r6 = r1.right
            int r7 = r2 + (-1)
            r3.setBounds(r4, r5, r6, r7)
            android.graphics.drawable.Drawable r0 = r0.f4896n
            int r3 = r1.left
            int r4 = r1.top
            int r1 = r1.right
            r0.setBounds(r3, r4, r1, r2)
        L2a:
            return
    }

    /* renamed from: e */
    public boolean m3325e() {
            r1 = this;
            c8.a r0 = r1.f5938j0
            if (r0 == 0) goto La
            boolean r0 = r0.f4901s
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // androidx.cardview.widget.CardView
    public android.content.res.ColorStateList getCardBackgroundColor() {
            r1 = this;
            c8.a r0 = r1.f5938j0
            t8.f r0 = r0.f4885c
            t8.f$b r0 = r0.f24036Y
            android.content.res.ColorStateList r0 = r0.f24062d
            return r0
    }

    public android.content.res.ColorStateList getCardForegroundColor() {
            r1 = this;
            c8.a r0 = r1.f5938j0
            t8.f r0 = r0.f4886d
            t8.f$b r0 = r0.f24036Y
            android.content.res.ColorStateList r0 = r0.f24062d
            return r0
    }

    public float getCardViewRadius() {
            r1 = this;
            float r0 = super.getRadius()
            return r0
    }

    public android.graphics.drawable.Drawable getCheckedIcon() {
            r1 = this;
            c8.a r0 = r1.f5938j0
            android.graphics.drawable.Drawable r0 = r0.f4891i
            return r0
    }

    public int getCheckedIconMargin() {
            r1 = this;
            c8.a r0 = r1.f5938j0
            int r0 = r0.f4887e
            return r0
    }

    public int getCheckedIconSize() {
            r1 = this;
            c8.a r0 = r1.f5938j0
            int r0 = r0.f4888f
            return r0
    }

    public android.content.res.ColorStateList getCheckedIconTint() {
            r1 = this;
            c8.a r0 = r1.f5938j0
            android.content.res.ColorStateList r0 = r0.f4893k
            return r0
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
            r1 = this;
            c8.a r0 = r1.f5938j0
            android.graphics.Rect r0 = r0.f4884b
            int r0 = r0.bottom
            return r0
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
            r1 = this;
            c8.a r0 = r1.f5938j0
            android.graphics.Rect r0 = r0.f4884b
            int r0 = r0.left
            return r0
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
            r1 = this;
            c8.a r0 = r1.f5938j0
            android.graphics.Rect r0 = r0.f4884b
            int r0 = r0.right
            return r0
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
            r1 = this;
            c8.a r0 = r1.f5938j0
            android.graphics.Rect r0 = r0.f4884b
            int r0 = r0.top
            return r0
    }

    public float getProgress() {
            r1 = this;
            c8.a r0 = r1.f5938j0
            t8.f r0 = r0.f4885c
            t8.f$b r0 = r0.f24036Y
            float r0 = r0.f24069k
            return r0
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
            r1 = this;
            c8.a r0 = r1.f5938j0
            t8.f r0 = r0.f4885c
            float r0 = r0.m12768l()
            return r0
    }

    public android.content.res.ColorStateList getRippleColor() {
            r1 = this;
            c8.a r0 = r1.f5938j0
            android.content.res.ColorStateList r0 = r0.f4892j
            return r0
    }

    public p340t8.C6192i getShapeAppearanceModel() {
            r1 = this;
            c8.a r0 = r1.f5938j0
            t8.i r0 = r0.f4894l
            return r0
    }

    @java.lang.Deprecated
    public int getStrokeColor() {
            r1 = this;
            c8.a r0 = r1.f5938j0
            android.content.res.ColorStateList r0 = r0.f4895m
            if (r0 != 0) goto L8
            r0 = -1
            goto Lc
        L8:
            int r0 = r0.getDefaultColor()
        Lc:
            return r0
    }

    public android.content.res.ColorStateList getStrokeColorStateList() {
            r1 = this;
            c8.a r0 = r1.f5938j0
            android.content.res.ColorStateList r0 = r0.f4895m
            return r0
    }

    public int getStrokeWidth() {
            r1 = this;
            c8.a r0 = r1.f5938j0
            int r0 = r0.f4889g
            return r0
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
            r1 = this;
            boolean r0 = r1.f5940l0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            c8.a r0 = r1.f5938j0
            t8.f r0 = r0.f4885c
            p185k7.C3828h5.m8575D(r1, r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 3
            int[] r2 = super.onCreateDrawableState(r2)
            boolean r0 = r1.m3325e()
            if (r0 == 0) goto L11
            int[] r0 = com.google.android.material.card.MaterialCardView.f5935o0
            android.widget.FrameLayout.mergeDrawableStates(r2, r0)
        L11:
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto L1c
            int[] r0 = com.google.android.material.card.MaterialCardView.f5936p0
            android.widget.FrameLayout.mergeDrawableStates(r2, r0)
        L1c:
            boolean r0 = r1.f5941m0
            if (r0 == 0) goto L25
            int[] r0 = com.google.android.material.card.MaterialCardView.f5937q0
            android.widget.FrameLayout.mergeDrawableStates(r2, r0)
        L25:
            return r2
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            java.lang.String r0 = "androidx.cardview.widget.CardView"
            r2.setClassName(r0)
            boolean r0 = r1.isChecked()
            r2.setChecked(r0)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2)
            java.lang.String r0 = "androidx.cardview.widget.CardView"
            r2.setClassName(r0)
            boolean r0 = r1.m3325e()
            r2.setCheckable(r0)
            boolean r0 = r1.isClickable()
            r2.setClickable(r0)
            boolean r0 = r1.isChecked()
            r2.setChecked(r0)
            return
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int r7, int r8) {
            r6 = this;
            super.onMeasure(r7, r8)
            c8.a r7 = r6.f5938j0
            int r8 = r6.getMeasuredWidth()
            int r0 = r6.getMeasuredHeight()
            android.graphics.drawable.LayerDrawable r1 = r7.f4897o
            if (r1 == 0) goto L58
            int r1 = r7.f4887e
            int r8 = r8 - r1
            int r2 = r7.f4888f
            int r8 = r8 - r2
            int r0 = r0 - r1
            int r0 = r0 - r2
            com.google.android.material.card.MaterialCardView r1 = r7.f4883a
            boolean r1 = r1.getUseCompatPadding()
            if (r1 == 0) goto L3d
            float r1 = r7.m2643d()
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r2
            double r3 = (double) r1
            double r3 = java.lang.Math.ceil(r3)
            int r1 = (int) r3
            int r0 = r0 - r1
            float r1 = r7.m2642c()
            float r1 = r1 * r2
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            int r8 = r8 - r1
        L3d:
            r5 = r0
            int r0 = r7.f4887e
            com.google.android.material.card.MaterialCardView r1 = r7.f4883a
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            int r1 = p227n0.C4661t.d.m10575d(r1)
            r2 = 1
            if (r1 != r2) goto L4e
            r4 = r8
            r2 = r0
            goto L50
        L4e:
            r2 = r8
            r4 = r0
        L50:
            android.graphics.drawable.LayerDrawable r0 = r7.f4897o
            r1 = 2
            int r3 = r7.f4887e
            r0.setLayerInset(r1, r2, r3, r4, r5)
        L58:
            return
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.setBackgroundDrawable(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            boolean r0 = r2.f5939k0
            if (r0 == 0) goto L19
            c8.a r0 = r2.f5938j0
            boolean r0 = r0.f4900r
            if (r0 != 0) goto L16
            java.lang.String r0 = "MaterialCardView"
            java.lang.String r1 = "Setting a custom background is not supported."
            android.util.Log.i(r0, r1)
            c8.a r0 = r2.f5938j0
            r1 = 1
            r0.f4900r = r1
        L16:
            super.setBackgroundDrawable(r3)
        L19:
            return
    }

    public void setBackgroundInternal(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            return
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int r2) {
            r1 = this;
            c8.a r0 = r1.f5938j0
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            t8.f r0 = r0.f4885c
            r0.m12773q(r2)
            return
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(android.content.res.ColorStateList r2) {
            r1 = this;
            c8.a r0 = r1.f5938j0
            t8.f r0 = r0.f4885c
            r0.m12773q(r2)
            return
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float r2) {
            r1 = this;
            super.setCardElevation(r2)
            c8.a r2 = r1.f5938j0
            t8.f r0 = r2.f4885c
            com.google.android.material.card.MaterialCardView r2 = r2.f4883a
            float r2 = r2.getCardElevation()
            r0.m12772p(r2)
            return
    }

    public void setCardForegroundColor(android.content.res.ColorStateList r2) {
            r1 = this;
            c8.a r0 = r1.f5938j0
            t8.f r0 = r0.f4886d
            if (r2 != 0) goto Lb
            r2 = 0
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
        Lb:
            r0.m12773q(r2)
            return
    }

    public void setCheckable(boolean r2) {
            r1 = this;
            c8.a r0 = r1.f5938j0
            r0.f4901s = r2
            return
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean r2) {
            r1 = this;
            boolean r0 = r1.f5940l0
            if (r0 == r2) goto L7
            r1.toggle()
        L7:
            return
    }

    public void setCheckedIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            c8.a r0 = r1.f5938j0
            r0.m2646g(r2)
            return
    }

    public void setCheckedIconMargin(int r2) {
            r1 = this;
            c8.a r0 = r1.f5938j0
            r0.f4887e = r2
            return
    }

    public void setCheckedIconMarginResource(int r3) {
            r2 = this;
            r0 = -1
            if (r3 == r0) goto Lf
            c8.a r0 = r2.f5938j0
            android.content.res.Resources r1 = r2.getResources()
            int r3 = r1.getDimensionPixelSize(r3)
            r0.f4887e = r3
        Lf:
            return
    }

    public void setCheckedIconResource(int r3) {
            r2 = this;
            c8.a r0 = r2.f5938j0
            android.content.Context r1 = r2.getContext()
            android.graphics.drawable.Drawable r3 = p102g.C2199a.m5784b(r1, r3)
            r0.m2646g(r3)
            return
    }

    public void setCheckedIconSize(int r2) {
            r1 = this;
            c8.a r0 = r1.f5938j0
            r0.f4888f = r2
            return
    }

    public void setCheckedIconSizeResource(int r3) {
            r2 = this;
            if (r3 == 0) goto Le
            c8.a r0 = r2.f5938j0
            android.content.res.Resources r1 = r2.getResources()
            int r3 = r1.getDimensionPixelSize(r3)
            r0.f4888f = r3
        Le:
            return
    }

    public void setCheckedIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            c8.a r0 = r1.f5938j0
            r0.f4893k = r2
            android.graphics.drawable.Drawable r0 = r0.f4891i
            if (r0 == 0) goto Lb
            r0.setTintList(r2)
        Lb:
            return
    }

    @Override // android.view.View
    public void setClickable(boolean r4) {
            r3 = this;
            super.setClickable(r4)
            c8.a r4 = r3.f5938j0
            if (r4 == 0) goto L41
            android.graphics.drawable.Drawable r0 = r4.f4890h
            com.google.android.material.card.MaterialCardView r1 = r4.f4883a
            boolean r1 = r1.isClickable()
            if (r1 == 0) goto L16
            android.graphics.drawable.Drawable r1 = r4.m2644e()
            goto L18
        L16:
            t8.f r1 = r4.f4886d
        L18:
            r4.f4890h = r1
            if (r0 == r1) goto L41
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L38
            com.google.android.material.card.MaterialCardView r0 = r4.f4883a
            android.graphics.drawable.Drawable r0 = r0.getForeground()
            boolean r0 = r0 instanceof android.graphics.drawable.InsetDrawable
            if (r0 == 0) goto L38
            com.google.android.material.card.MaterialCardView r4 = r4.f4883a
            android.graphics.drawable.Drawable r4 = r4.getForeground()
            android.graphics.drawable.InsetDrawable r4 = (android.graphics.drawable.InsetDrawable) r4
            r4.setDrawable(r1)
            goto L41
        L38:
            com.google.android.material.card.MaterialCardView r0 = r4.f4883a
            android.graphics.drawable.Drawable r4 = r4.m2645f(r1)
            r0.setForeground(r4)
        L41:
            return
    }

    public void setDragged(boolean r2) {
            r1 = this;
            boolean r0 = r1.f5941m0
            if (r0 == r2) goto Lf
            r1.f5941m0 = r2
            r1.refreshDrawableState()
            r1.m3324d()
            r1.invalidate()
        Lf:
            return
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float r1) {
            r0 = this;
            super.setMaxCardElevation(r1)
            c8.a r1 = r0.f5938j0
            r1.m2651l()
            return
    }

    public void setOnCheckedChangeListener(com.google.android.material.card.MaterialCardView.InterfaceC1145a r1) {
            r0 = this;
            r0.f5942n0 = r1
            return
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean r1) {
            r0 = this;
            super.setPreventCornerOverlap(r1)
            c8.a r1 = r0.f5938j0
            r1.m2651l()
            c8.a r1 = r0.f5938j0
            r1.m2650k()
            return
    }

    public void setProgress(float r3) {
            r2 = this;
            c8.a r0 = r2.f5938j0
            t8.f r1 = r0.f4885c
            r1.m12774r(r3)
            t8.f r1 = r0.f4886d
            if (r1 == 0) goto Le
            r1.m12774r(r3)
        Le:
            t8.f r0 = r0.f4899q
            if (r0 == 0) goto L15
            r0.m12774r(r3)
        L15:
            return
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float r3) {
            r2 = this;
            super.setRadius(r3)
            c8.a r0 = r2.f5938j0
            t8.i r1 = r0.f4894l
            t8.i r3 = r1.m12786e(r3)
            r0.m2647h(r3)
            android.graphics.drawable.Drawable r3 = r0.f4890h
            r3.invalidateSelf()
            boolean r3 = r0.m2649j()
            if (r3 != 0) goto L1f
            boolean r3 = r0.m2648i()
            if (r3 == 0) goto L22
        L1f:
            r0.m2650k()
        L22:
            boolean r3 = r0.m2649j()
            if (r3 == 0) goto L2b
            r0.m2651l()
        L2b:
            return
    }

    public void setRippleColor(android.content.res.ColorStateList r2) {
            r1 = this;
            c8.a r0 = r1.f5938j0
            r0.f4892j = r2
            r0.m2652m()
            return
    }

    public void setRippleColorResource(int r3) {
            r2 = this;
            c8.a r0 = r2.f5938j0
            android.content.Context r1 = r2.getContext()
            android.content.res.ColorStateList r3 = p102g.C2199a.m5783a(r1, r3)
            r0.f4892j = r3
            r0.m2652m()
            return
    }

    @Override // p340t8.InterfaceC6196m
    public void setShapeAppearanceModel(p340t8.C6192i r2) {
            r1 = this;
            android.graphics.RectF r0 = r1.getBoundsAsRectF()
            boolean r0 = r2.m12785d(r0)
            r1.setClipToOutline(r0)
            c8.a r0 = r1.f5938j0
            r0.m2647h(r2)
            return
    }

    public void setStrokeColor(int r3) {
            r2 = this;
            c8.a r0 = r2.f5938j0
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r3)
            android.content.res.ColorStateList r1 = r0.f4895m
            if (r1 != r3) goto Lb
            goto L10
        Lb:
            r0.f4895m = r3
            r0.m2653n()
        L10:
            return
    }

    public void setStrokeColor(android.content.res.ColorStateList r3) {
            r2 = this;
            c8.a r0 = r2.f5938j0
            android.content.res.ColorStateList r1 = r0.f4895m
            if (r1 != r3) goto L7
            goto Lc
        L7:
            r0.f4895m = r3
            r0.m2653n()
        Lc:
            return
    }

    public void setStrokeWidth(int r3) {
            r2 = this;
            c8.a r0 = r2.f5938j0
            int r1 = r0.f4889g
            if (r3 != r1) goto L7
            goto Lc
        L7:
            r0.f4889g = r3
            r0.m2653n()
        Lc:
            return
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean r1) {
            r0 = this;
            super.setUseCompatPadding(r1)
            c8.a r1 = r0.f5938j0
            r1.m2651l()
            c8.a r1 = r0.f5938j0
            r1.m2650k()
            return
    }

    @Override // android.widget.Checkable
    public void toggle() {
            r2 = this;
            boolean r0 = r2.m3325e()
            if (r0 == 0) goto L21
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto L21
            boolean r0 = r2.f5940l0
            r0 = r0 ^ 1
            r2.f5940l0 = r0
            r2.refreshDrawableState()
            r2.m3324d()
            com.google.android.material.card.MaterialCardView$a r0 = r2.f5942n0
            if (r0 == 0) goto L21
            boolean r1 = r2.f5940l0
            r0.m3326a(r2, r1)
        L21:
            return
    }
}
