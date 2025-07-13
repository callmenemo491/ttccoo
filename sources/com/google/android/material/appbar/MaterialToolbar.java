package com.google.android.material.appbar;

/* loaded from: classes.dex */
public class MaterialToolbar extends androidx.appcompat.widget.Toolbar {

    /* renamed from: N0 */
    public java.lang.Integer f5770N0;

    /* renamed from: O0 */
    public boolean f5771O0;

    /* renamed from: P0 */
    public boolean f5772P0;

    public MaterialToolbar(android.content.Context r9, android.util.AttributeSet r10) {
            r8 = this;
            r0 = 2132018012(0x7f14035c, float:1.9674319E38)
            r1 = 2130969610(0x7f04040a, float:1.7547907E38)
            android.content.Context r9 = p431y8.C7133a.m14245a(r9, r10, r1, r0)
            r8.<init>(r9, r10, r1)
            android.content.Context r9 = r8.getContext()
            int[] r4 = p339t7.C6183a.f23991D
            r0 = 0
            int[] r7 = new int[r0]
            r6 = 2132018012(0x7f14035c, float:1.9674319E38)
            r5 = 2130969610(0x7f04040a, float:1.7547907E38)
            r2 = r9
            r3 = r10
            android.content.res.TypedArray r10 = p220m8.C4429m.m9881d(r2, r3, r4, r5, r6, r7)
            boolean r1 = r10.hasValue(r0)
            if (r1 == 0) goto L30
            r1 = -1
            int r1 = r10.getColor(r0, r1)
            r8.setNavigationIconTint(r1)
        L30:
            r1 = 2
            boolean r1 = r10.getBoolean(r1, r0)
            r8.f5771O0 = r1
            r1 = 1
            boolean r1 = r10.getBoolean(r1, r0)
            r8.f5772P0 = r1
            r10.recycle()
            android.graphics.drawable.Drawable r10 = r8.getBackground()
            if (r10 == 0) goto L4c
            boolean r1 = r10 instanceof android.graphics.drawable.ColorDrawable
            if (r1 != 0) goto L4c
            goto L78
        L4c:
            t8.f r1 = new t8.f
            r1.<init>()
            if (r10 == 0) goto L59
            android.graphics.drawable.ColorDrawable r10 = (android.graphics.drawable.ColorDrawable) r10
            int r0 = r10.getColor()
        L59:
            android.content.res.ColorStateList r10 = android.content.res.ColorStateList.valueOf(r0)
            r1.m12773q(r10)
            t8.f$b r10 = r1.f24036Y
            j8.a r0 = new j8.a
            r0.<init>(r9)
            r10.f24060b = r0
            r1.m12781y()
            java.util.WeakHashMap<android.view.View, n0.w> r9 = p227n0.C4661t.f18570a
            float r9 = p227n0.C4661t.h.m10604i(r8)
            r1.m12772p(r9)
            p227n0.C4661t.c.m10569q(r8, r1)
        L78:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            boolean r1 = r0 instanceof p340t8.C6189f
            if (r1 == 0) goto L10
            t8.f r0 = (p340t8.C6189f) r0
            p185k7.C3828h5.m8575D(r2, r0)
        L10:
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            boolean r5 = r4.f5771O0
            if (r5 != 0) goto Ld
            boolean r5 = r4.f5772P0
            if (r5 != 0) goto Ld
            goto L8a
        Ld:
            java.lang.CharSequence r5 = r4.getTitle()
            android.widget.TextView r5 = p124h7.C2939x3.m7287m(r4, r5)
            java.lang.CharSequence r6 = r4.getSubtitle()
            android.widget.TextView r6 = p124h7.C2939x3.m7287m(r4, r6)
            if (r5 != 0) goto L22
            if (r6 != 0) goto L22
            goto L8a
        L22:
            int r7 = r4.getMeasuredWidth()
            int r8 = r7 / 2
            int r9 = r4.getPaddingLeft()
            int r0 = r4.getPaddingRight()
            int r7 = r7 - r0
            r0 = 0
        L32:
            int r1 = r4.getChildCount()
            if (r0 >= r1) goto L6b
            android.view.View r1 = r4.getChildAt(r0)
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 == r3) goto L68
            if (r1 == r5) goto L68
            if (r1 == r6) goto L68
            int r2 = r1.getRight()
            if (r2 >= r8) goto L58
            int r2 = r1.getRight()
            if (r2 <= r9) goto L58
            int r9 = r1.getRight()
        L58:
            int r2 = r1.getLeft()
            if (r2 <= r8) goto L68
            int r2 = r1.getLeft()
            if (r2 >= r7) goto L68
            int r7 = r1.getLeft()
        L68:
            int r0 = r0 + 1
            goto L32
        L6b:
            android.util.Pair r8 = new android.util.Pair
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8.<init>(r9, r7)
            boolean r7 = r4.f5771O0
            if (r7 == 0) goto L81
            if (r5 == 0) goto L81
            r4.m3258w(r5, r8)
        L81:
            boolean r5 = r4.f5772P0
            if (r5 == 0) goto L8a
            if (r6 == 0) goto L8a
            r4.m3258w(r6, r8)
        L8a:
            return
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            p185k7.C3828h5.m8574C(r0, r1)
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L13
            java.lang.Integer r0 = r1.f5770N0
            if (r0 == 0) goto L13
            android.graphics.drawable.Drawable r2 = p103g0.C2200a.m5792h(r2)
            java.lang.Integer r0 = r1.f5770N0
            int r0 = r0.intValue()
            r2.setTint(r0)
        L13:
            super.setNavigationIcon(r2)
            return
    }

    public void setNavigationIconTint(int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f5770N0 = r1
            android.graphics.drawable.Drawable r1 = r0.getNavigationIcon()
            if (r1 == 0) goto Lf
            r0.setNavigationIcon(r1)
        Lf:
            return
    }

    public void setSubtitleCentered(boolean r2) {
            r1 = this;
            boolean r0 = r1.f5772P0
            if (r0 == r2) goto L9
            r1.f5772P0 = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setTitleCentered(boolean r2) {
            r1 = this;
            boolean r0 = r1.f5771O0
            if (r0 == r2) goto L9
            r1.f5771O0 = r2
            r1.requestLayout()
        L9:
            return
    }

    /* renamed from: w */
    public final void m3258w(android.view.View r5, android.util.Pair<java.lang.Integer, java.lang.Integer> r6) {
            r4 = this;
            int r0 = r4.getMeasuredWidth()
            int r1 = r5.getMeasuredWidth()
            int r0 = r0 / 2
            int r2 = r1 / 2
            int r0 = r0 - r2
            int r1 = r1 + r0
            java.lang.Object r2 = r6.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r2 = r2 - r0
            r3 = 0
            int r2 = java.lang.Math.max(r2, r3)
            java.lang.Object r6 = r6.second
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r6 = r1 - r6
            int r6 = java.lang.Math.max(r6, r3)
            int r6 = java.lang.Math.max(r2, r6)
            if (r6 <= 0) goto L41
            int r0 = r0 + r6
            int r1 = r1 - r6
            int r6 = r1 - r0
            r2 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r2)
            int r2 = r5.getMeasuredHeightAndState()
            r5.measure(r6, r2)
        L41:
            int r6 = r5.getTop()
            int r2 = r5.getBottom()
            r5.layout(r0, r6, r1, r2)
            return
    }
}
