package androidx.fragment.app;

/* loaded from: classes.dex */
public final class FragmentContainerView extends android.widget.FrameLayout {

    /* renamed from: a0 */
    public java.util.ArrayList<android.view.View> f2026a0;

    /* renamed from: b0 */
    public java.util.ArrayList<android.view.View> f2027b0;

    /* renamed from: c0 */
    public android.view.View.OnApplyWindowInsetsListener f2028c0;

    /* renamed from: d0 */
    public boolean f2029d0;

    public FragmentContainerView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.f2029d0 = r1
            return
    }

    public FragmentContainerView(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 0
            r3.<init>(r4, r5, r0)
            r1 = 1
            r3.f2029d0 = r1
            if (r5 == 0) goto L4e
            java.lang.String r1 = r5.getClassAttribute()
            int[] r2 = p402x0.C6909a.f26865b
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2)
            if (r1 != 0) goto L1c
            java.lang.String r1 = r4.getString(r0)
            java.lang.String r5 = "android:name"
            goto L1e
        L1c:
            java.lang.String r5 = "class"
        L1e:
            r4.recycle()
            if (r1 == 0) goto L4e
            boolean r4 = r3.isInEditMode()
            if (r4 == 0) goto L2a
            goto L4e
        L2a:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "FragmentContainerView must be within a FragmentActivity to use "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = "=\""
            r0.append(r5)
            r0.append(r1)
            java.lang.String r5 = "\""
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        L4e:
            return
    }

    public FragmentContainerView(android.content.Context r7, android.util.AttributeSet r8, androidx.fragment.app.AbstractC0375d0 r9) {
            r6 = this;
            r6.<init>(r7, r8)
            r0 = 1
            r6.f2029d0 = r0
            java.lang.String r1 = r8.getClassAttribute()
            int[] r2 = p402x0.C6909a.f26865b
            android.content.res.TypedArray r2 = r7.obtainStyledAttributes(r8, r2)
            r3 = 0
            if (r1 != 0) goto L17
            java.lang.String r1 = r2.getString(r3)
        L17:
            java.lang.String r4 = r2.getString(r0)
            r2.recycle()
            int r2 = r6.getId()
            androidx.fragment.app.n r5 = r9.m1139H(r2)
            if (r1 == 0) goto L77
            if (r5 != 0) goto L77
            if (r2 > 0) goto L43
            if (r4 == 0) goto L35
            java.lang.String r7 = " with tag "
            java.lang.String r7 = p064e.C1493g.m4049a(r7, r4)
            goto L37
        L35:
            java.lang.String r7 = ""
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "FragmentContainerView must have an android:id to add Fragment "
            java.lang.String r7 = android.support.v4.media.C0145d.m257a(r9, r1, r7)
            r8.<init>(r7)
            throw r8
        L43:
            androidx.fragment.app.z r2 = r9.m1142K()
            java.lang.ClassLoader r5 = r7.getClassLoader()
            androidx.fragment.app.n r1 = r2.mo1196a(r5, r1)
            r2 = 0
            r1.mo1319b0(r7, r8, r2)
            androidx.fragment.app.a r7 = new androidx.fragment.app.a
            r7.<init>(r9)
            r7.f2248p = r0
            r1.f2259B0 = r6
            int r8 = r6.getId()
            r7.m1081k(r8, r1, r4, r0)
            boolean r8 = r7.f2239g
            if (r8 != 0) goto L6f
            r7.f2240h = r3
            androidx.fragment.app.d0 r8 = r7.f2030q
            r8.m1135D(r7, r0)
            goto L77
        L6f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "This transaction is already being added to the back stack"
            r7.<init>(r8)
            throw r7
        L77:
            androidx.fragment.app.l0 r7 = r9.f2115c
            java.util.List r7 = r7.m1287w()
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.util.Iterator r7 = r7.iterator()
        L83:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto La9
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.j0 r8 = (androidx.fragment.app.C0388j0) r8
            androidx.fragment.app.n r9 = r8.f2202c
            int r0 = r9.f2299u0
            int r1 = r6.getId()
            if (r0 != r1) goto L83
            android.view.View r0 = r9.f2260C0
            if (r0 == 0) goto L83
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L83
            r9.f2259B0 = r6
            r8.m1205b()
            goto L83
        La9:
            return
    }

    /* renamed from: a */
    public final void m1072a(android.view.View r2) {
            r1 = this;
            java.util.ArrayList<android.view.View> r0 = r1.f2027b0
            if (r0 == 0) goto L1a
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L1a
            java.util.ArrayList<android.view.View> r0 = r1.f2026a0
            if (r0 != 0) goto L15
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2026a0 = r0
        L15:
            java.util.ArrayList<android.view.View> r0 = r1.f2026a0
            r0.add(r2)
        L1a:
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r3, int r4, android.view.ViewGroup.LayoutParams r5) {
            r2 = this;
            r0 = 2131362208(0x7f0a01a0, float:1.834419E38)
            java.lang.Object r0 = r3.getTag(r0)
            boolean r1 = r0 instanceof androidx.fragment.app.ComponentCallbacksC0395n
            if (r1 == 0) goto Le
            androidx.fragment.app.n r0 = (androidx.fragment.app.ComponentCallbacksC0395n) r0
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L15
            super.addView(r3, r4, r5)
            return
        L15:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Views added to a FragmentContainerView must be associated with a Fragment. View "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = " is not associated with a Fragment."
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(android.view.View r3, int r4, android.view.ViewGroup.LayoutParams r5, boolean r6) {
            r2 = this;
            r0 = 2131362208(0x7f0a01a0, float:1.834419E38)
            java.lang.Object r0 = r3.getTag(r0)
            boolean r1 = r0 instanceof androidx.fragment.app.ComponentCallbacksC0395n
            if (r1 == 0) goto Le
            androidx.fragment.app.n r0 = (androidx.fragment.app.ComponentCallbacksC0395n) r0
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L16
            boolean r3 = super.addViewInLayout(r3, r4, r5, r6)
            return r3
        L16:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Views added to a FragmentContainerView must be associated with a Fragment. View "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = " is not associated with a Fragment."
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // android.view.ViewGroup, android.view.View
    public android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets r5) {
            r4 = this;
            r0 = 0
            n0.a0 r0 = p227n0.C4642a0.m10464i(r5, r0)
            android.view.View$OnApplyWindowInsetsListener r1 = r4.f2028c0
            if (r1 == 0) goto L12
            android.view.WindowInsets r0 = r1.onApplyWindowInsets(r4, r5)
            n0.a0 r0 = p227n0.C4642a0.m10463h(r0)
            goto L16
        L12:
            n0.a0 r0 = p227n0.C4661t.m10540p(r4, r0)
        L16:
            boolean r1 = r0.m10469f()
            if (r1 != 0) goto L2d
            int r1 = r4.getChildCount()
            r2 = 0
        L21:
            if (r2 >= r1) goto L2d
            android.view.View r3 = r4.getChildAt(r2)
            p227n0.C4661t.m10529e(r3, r0)
            int r2 = r2 + 1
            goto L21
        L2d:
            return r5
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas r5) {
            r4 = this;
            boolean r0 = r4.f2029d0
            if (r0 == 0) goto L23
            java.util.ArrayList<android.view.View> r0 = r4.f2026a0
            if (r0 == 0) goto L23
            r0 = 0
        L9:
            java.util.ArrayList<android.view.View> r1 = r4.f2026a0
            int r1 = r1.size()
            if (r0 >= r1) goto L23
            java.util.ArrayList<android.view.View> r1 = r4.f2026a0
            java.lang.Object r1 = r1.get(r0)
            android.view.View r1 = (android.view.View) r1
            long r2 = r4.getDrawingTime()
            super.drawChild(r5, r1, r2)
            int r0 = r0 + 1
            goto L9
        L23:
            super.dispatchDraw(r5)
            return
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas r2, android.view.View r3, long r4) {
            r1 = this;
            boolean r0 = r1.f2029d0
            if (r0 == 0) goto L18
            java.util.ArrayList<android.view.View> r0 = r1.f2026a0
            if (r0 == 0) goto L18
            int r0 = r0.size()
            if (r0 <= 0) goto L18
            java.util.ArrayList<android.view.View> r0 = r1.f2026a0
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L18
            r2 = 0
            return r2
        L18:
            boolean r2 = super.drawChild(r2, r3, r4)
            return r2
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(android.view.View r2) {
            r1 = this;
            java.util.ArrayList<android.view.View> r0 = r1.f2027b0
            if (r0 == 0) goto L14
            r0.remove(r2)
            java.util.ArrayList<android.view.View> r0 = r1.f2026a0
            if (r0 == 0) goto L14
            boolean r0 = r0.remove(r2)
            if (r0 == 0) goto L14
            r0 = 1
            r1.f2029d0 = r0
        L14:
            super.endViewTransition(r2)
            return
    }

    @Override // android.view.View
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r1) {
            r0 = this;
            return r1
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
            r2 = this;
            int r0 = r2.getChildCount()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L12
            android.view.View r1 = r2.getChildAt(r0)
            r2.m1072a(r1)
            int r0 = r0 + (-1)
            goto L6
        L12:
            super.removeAllViewsInLayout()
            return
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(android.view.View r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L5
            r0.m1072a(r1)
        L5:
            super.removeDetachedView(r1, r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View r1) {
            r0 = this;
            r0.m1072a(r1)
            super.removeView(r1)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int r2) {
            r1 = this;
            android.view.View r0 = r1.getChildAt(r2)
            r1.m1072a(r0)
            super.removeViewAt(r2)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(android.view.View r1) {
            r0 = this;
            r0.m1072a(r1)
            super.removeViewInLayout(r1)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViews(int r3, int r4) {
            r2 = this;
            r0 = r3
        L1:
            int r1 = r3 + r4
            if (r0 >= r1) goto Lf
            android.view.View r1 = r2.getChildAt(r0)
            r2.m1072a(r1)
            int r0 = r0 + 1
            goto L1
        Lf:
            super.removeViews(r3, r4)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int r3, int r4) {
            r2 = this;
            r0 = r3
        L1:
            int r1 = r3 + r4
            if (r0 >= r1) goto Lf
            android.view.View r1 = r2.getChildAt(r0)
            r2.m1072a(r1)
            int r0 = r0 + 1
            goto L1
        Lf:
            super.removeViewsInLayout(r3, r4)
            return
    }

    public void setDrawDisappearingViewsLast(boolean r1) {
            r0 = this;
            r0.f2029d0 = r1
            return
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(android.animation.LayoutTransition r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\"."
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(android.view.View.OnApplyWindowInsetsListener r1) {
            r0 = this;
            r0.f2028c0 = r1
            return
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(android.view.View r2) {
            r1 = this;
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != r1) goto L16
            java.util.ArrayList<android.view.View> r0 = r1.f2027b0
            if (r0 != 0) goto L11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2027b0 = r0
        L11:
            java.util.ArrayList<android.view.View> r0 = r1.f2027b0
            r0.add(r2)
        L16:
            super.startViewTransition(r2)
            return
    }
}
