package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ActionBarContainer extends android.widget.FrameLayout {

    /* renamed from: a0 */
    public boolean f903a0;

    /* renamed from: b0 */
    public android.view.View f904b0;

    /* renamed from: c0 */
    public android.view.View f905c0;

    /* renamed from: d0 */
    public android.view.View f906d0;

    /* renamed from: e0 */
    public android.graphics.drawable.Drawable f907e0;

    /* renamed from: f0 */
    public android.graphics.drawable.Drawable f908f0;

    /* renamed from: g0 */
    public android.graphics.drawable.Drawable f909g0;

    /* renamed from: h0 */
    public boolean f910h0;

    /* renamed from: i0 */
    public boolean f911i0;

    /* renamed from: j0 */
    public int f912j0;

    public ActionBarContainer(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r3.<init>(r4, r5)
            androidx.appcompat.widget.b r0 = new androidx.appcompat.widget.b
            r0.<init>(r3)
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10569q(r3, r0)
            int[] r0 = p064e.C1495i.f7258a
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r0)
            r5 = 0
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r5)
            r3.f907e0 = r0
            r0 = 2
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r0)
            r3.f908f0 = r0
            r0 = 13
            r1 = -1
            int r0 = r4.getDimensionPixelSize(r0, r1)
            r3.f912j0 = r0
            int r0 = r3.getId()
            r1 = 2131362611(0x7f0a0333, float:1.8345007E38)
            r2 = 1
            if (r0 != r1) goto L3c
            r3.f910h0 = r2
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r2)
            r3.f909g0 = r0
        L3c:
            r4.recycle()
            boolean r4 = r3.f910h0
            if (r4 == 0) goto L49
            android.graphics.drawable.Drawable r4 = r3.f909g0
            if (r4 != 0) goto L52
        L47:
            r5 = 1
            goto L52
        L49:
            android.graphics.drawable.Drawable r4 = r3.f907e0
            if (r4 != 0) goto L52
            android.graphics.drawable.Drawable r4 = r3.f908f0
            if (r4 != 0) goto L52
            goto L47
        L52:
            r3.setWillNotDraw(r5)
            return
    }

    /* renamed from: a */
    public final int m547a(android.view.View r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r3 = r3.getMeasuredHeight()
            int r1 = r0.topMargin
            int r3 = r3 + r1
            int r0 = r0.bottomMargin
            int r3 = r3 + r0
            return r3
    }

    /* renamed from: b */
    public final boolean m548b(android.view.View r3) {
            r2 = this;
            if (r3 == 0) goto L13
            int r0 = r3.getVisibility()
            r1 = 8
            if (r0 == r1) goto L13
            int r3 = r3.getMeasuredHeight()
            if (r3 != 0) goto L11
            goto L13
        L11:
            r3 = 0
            goto L14
        L13:
            r3 = 1
        L14:
            return r3
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
            r2 = this;
            super.drawableStateChanged()
            android.graphics.drawable.Drawable r0 = r2.f907e0
            if (r0 == 0) goto L16
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L16
            android.graphics.drawable.Drawable r0 = r2.f907e0
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L16:
            android.graphics.drawable.Drawable r0 = r2.f908f0
            if (r0 == 0) goto L29
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L29
            android.graphics.drawable.Drawable r0 = r2.f908f0
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L29:
            android.graphics.drawable.Drawable r0 = r2.f909g0
            if (r0 == 0) goto L3c
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L3c
            android.graphics.drawable.Drawable r0 = r2.f909g0
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L3c:
            return
    }

    public android.view.View getTabContainer() {
            r1 = this;
            android.view.View r0 = r1.f904b0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            android.graphics.drawable.Drawable r0 = r1.f907e0
            if (r0 == 0) goto La
            r0.jumpToCurrentState()
        La:
            android.graphics.drawable.Drawable r0 = r1.f908f0
            if (r0 == 0) goto L11
            r0.jumpToCurrentState()
        L11:
            android.graphics.drawable.Drawable r0 = r1.f909g0
            if (r0 == 0) goto L18
            r0.jumpToCurrentState()
        L18:
            return
    }

    @Override // android.view.View
    public void onFinishInflate() {
            r1 = this;
            super.onFinishInflate()
            r0 = 2131361850(0x7f0a003a, float:1.8343464E38)
            android.view.View r0 = r1.findViewById(r0)
            r1.f905c0 = r0
            r0 = 2131361858(0x7f0a0042, float:1.834348E38)
            android.view.View r0 = r1.findViewById(r0)
            r1.f906d0 = r0
            return
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r1) {
            r0 = this;
            super.onHoverEvent(r1)
            r1 = 1
            return r1
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            boolean r0 = r1.f903a0
            if (r0 != 0) goto Ld
            boolean r2 = super.onInterceptTouchEvent(r2)
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            return r2
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f904b0
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L13
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            if (r5 == 0) goto L33
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L33
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L33:
            boolean r6 = r4.f910h0
            if (r6 == 0) goto L4a
            android.graphics.drawable.Drawable r5 = r4.f909g0
            if (r5 == 0) goto L48
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto Lb8
        L48:
            r9 = 0
            goto Lb8
        L4a:
            android.graphics.drawable.Drawable r6 = r4.f907e0
            if (r6 == 0) goto L9b
            android.view.View r6 = r4.f905c0
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L74
            android.graphics.drawable.Drawable r6 = r4.f907e0
            android.view.View r7 = r4.f905c0
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f905c0
            int r8 = r8.getTop()
            android.view.View r0 = r4.f905c0
            int r0 = r0.getRight()
            android.view.View r2 = r4.f905c0
        L6c:
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L9a
        L74:
            android.view.View r6 = r4.f906d0
            if (r6 == 0) goto L95
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L95
            android.graphics.drawable.Drawable r6 = r4.f907e0
            android.view.View r7 = r4.f906d0
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f906d0
            int r8 = r8.getTop()
            android.view.View r0 = r4.f906d0
            int r0 = r0.getRight()
            android.view.View r2 = r4.f906d0
            goto L6c
        L95:
            android.graphics.drawable.Drawable r6 = r4.f907e0
            r6.setBounds(r0, r0, r0, r0)
        L9a:
            r0 = 1
        L9b:
            r4.f911i0 = r1
            if (r1 == 0) goto Lb7
            android.graphics.drawable.Drawable r6 = r4.f908f0
            if (r6 == 0) goto Lb7
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
            goto Lb8
        Lb7:
            r9 = r0
        Lb8:
            if (r9 == 0) goto Lbd
            r4.invalidate()
        Lbd:
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int r4, int r5) {
            r3 = this;
            android.view.View r0 = r3.f905c0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.f912j0
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f905c0
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f904b0
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.f905c0
            boolean r0 = r3.m548b(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.f905c0
        L42:
            int r0 = r3.m547a(r0)
            goto L53
        L47:
            android.view.View r0 = r3.f906d0
            boolean r0 = r3.m548b(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.f906d0
            goto L42
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f904b0
            int r1 = r3.m547a(r1)
            int r1 = r1 + r0
            int r4 = java.lang.Math.min(r1, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            super.onTouchEvent(r1)
            r1 = 1
            return r1
    }

    public void setPrimaryBackground(android.graphics.drawable.Drawable r5) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f907e0
            if (r0 == 0) goto Ld
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r4.f907e0
            r4.unscheduleDrawable(r0)
        Ld:
            r4.f907e0 = r5
            if (r5 == 0) goto L33
            r5.setCallback(r4)
            android.view.View r5 = r4.f905c0
            if (r5 == 0) goto L33
            android.graphics.drawable.Drawable r0 = r4.f907e0
            int r5 = r5.getLeft()
            android.view.View r1 = r4.f905c0
            int r1 = r1.getTop()
            android.view.View r2 = r4.f905c0
            int r2 = r2.getRight()
            android.view.View r3 = r4.f905c0
            int r3 = r3.getBottom()
            r0.setBounds(r5, r1, r2, r3)
        L33:
            boolean r5 = r4.f910h0
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L3e
            android.graphics.drawable.Drawable r5 = r4.f909g0
            if (r5 != 0) goto L47
            goto L48
        L3e:
            android.graphics.drawable.Drawable r5 = r4.f907e0
            if (r5 != 0) goto L47
            android.graphics.drawable.Drawable r5 = r4.f908f0
            if (r5 != 0) goto L47
            goto L48
        L47:
            r0 = 0
        L48:
            r4.setWillNotDraw(r0)
            r4.invalidate()
            r4.invalidateOutline()
            return
    }

    public void setSplitBackground(android.graphics.drawable.Drawable r4) {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.f909g0
            if (r0 == 0) goto Ld
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r3.f909g0
            r3.unscheduleDrawable(r0)
        Ld:
            r3.f909g0 = r4
            r0 = 0
            if (r4 == 0) goto L28
            r4.setCallback(r3)
            boolean r4 = r3.f910h0
            if (r4 == 0) goto L28
            android.graphics.drawable.Drawable r4 = r3.f909g0
            if (r4 == 0) goto L28
            int r1 = r3.getMeasuredWidth()
            int r2 = r3.getMeasuredHeight()
            r4.setBounds(r0, r0, r1, r2)
        L28:
            boolean r4 = r3.f910h0
            r1 = 1
            if (r4 == 0) goto L33
            android.graphics.drawable.Drawable r4 = r3.f909g0
            if (r4 != 0) goto L3c
        L31:
            r0 = 1
            goto L3c
        L33:
            android.graphics.drawable.Drawable r4 = r3.f907e0
            if (r4 != 0) goto L3c
            android.graphics.drawable.Drawable r4 = r3.f908f0
            if (r4 != 0) goto L3c
            goto L31
        L3c:
            r3.setWillNotDraw(r0)
            r3.invalidate()
            r3.invalidateOutline()
            return
    }

    public void setStackedBackground(android.graphics.drawable.Drawable r5) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f908f0
            if (r0 == 0) goto Ld
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r4.f908f0
            r4.unscheduleDrawable(r0)
        Ld:
            r4.f908f0 = r5
            if (r5 == 0) goto L37
            r5.setCallback(r4)
            boolean r5 = r4.f911i0
            if (r5 == 0) goto L37
            android.graphics.drawable.Drawable r5 = r4.f908f0
            if (r5 == 0) goto L37
            android.view.View r0 = r4.f904b0
            int r0 = r0.getLeft()
            android.view.View r1 = r4.f904b0
            int r1 = r1.getTop()
            android.view.View r2 = r4.f904b0
            int r2 = r2.getRight()
            android.view.View r3 = r4.f904b0
            int r3 = r3.getBottom()
            r5.setBounds(r0, r1, r2, r3)
        L37:
            boolean r5 = r4.f910h0
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L42
            android.graphics.drawable.Drawable r5 = r4.f909g0
            if (r5 != 0) goto L4b
            goto L4c
        L42:
            android.graphics.drawable.Drawable r5 = r4.f907e0
            if (r5 != 0) goto L4b
            android.graphics.drawable.Drawable r5 = r4.f908f0
            if (r5 != 0) goto L4b
            goto L4c
        L4b:
            r0 = 0
        L4c:
            r4.setWillNotDraw(r0)
            r4.invalidate()
            r4.invalidateOutline()
            return
    }

    public void setTabContainer(androidx.appcompat.widget.C0296p0 r3) {
            r2 = this;
            android.view.View r0 = r2.f904b0
            if (r0 == 0) goto L7
            r2.removeView(r0)
        L7:
            r2.f904b0 = r3
            if (r3 == 0) goto L1c
            r2.addView(r3)
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            r1 = -1
            r0.width = r1
            r1 = -2
            r0.height = r1
            r0 = 0
            r3.setAllowCollapse(r0)
        L1c:
            return
    }

    public void setTransitioning(boolean r1) {
            r0 = this;
            r0.f903a0 = r1
            if (r1 == 0) goto L7
            r1 = 393216(0x60000, float:5.51013E-40)
            goto L9
        L7:
            r1 = 262144(0x40000, float:3.67342E-40)
        L9:
            r0.setDescendantFocusability(r1)
            return
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
            r2 = this;
            super.setVisibility(r3)
            r0 = 0
            if (r3 != 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            android.graphics.drawable.Drawable r1 = r2.f907e0
            if (r1 == 0) goto L10
            r1.setVisible(r3, r0)
        L10:
            android.graphics.drawable.Drawable r1 = r2.f908f0
            if (r1 == 0) goto L17
            r1.setVisible(r3, r0)
        L17:
            android.graphics.drawable.Drawable r1 = r2.f909g0
            if (r1 == 0) goto L1e
            r1.setVisible(r3, r0)
        L1e:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ActionMode startActionModeForChild(android.view.View r1, android.view.ActionMode.Callback r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ActionMode startActionModeForChild(android.view.View r1, android.view.ActionMode.Callback r2, int r3) {
            r0 = this;
            if (r3 == 0) goto L7
            android.view.ActionMode r1 = super.startActionModeForChild(r1, r2, r3)
            return r1
        L7:
            r1 = 0
            return r1
    }

    @Override // android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f907e0
            if (r2 != r0) goto L8
            boolean r0 = r1.f910h0
            if (r0 == 0) goto L1e
        L8:
            android.graphics.drawable.Drawable r0 = r1.f908f0
            if (r2 != r0) goto L10
            boolean r0 = r1.f911i0
            if (r0 != 0) goto L1e
        L10:
            android.graphics.drawable.Drawable r0 = r1.f909g0
            if (r2 != r0) goto L18
            boolean r0 = r1.f910h0
            if (r0 != 0) goto L1e
        L18:
            boolean r2 = super.verifyDrawable(r2)
            if (r2 == 0) goto L20
        L1e:
            r2 = 1
            goto L21
        L20:
            r2 = 0
        L21:
            return r2
    }
}
