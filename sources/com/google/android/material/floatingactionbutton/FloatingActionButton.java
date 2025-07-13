package com.google.android.material.floatingactionbutton;

/* loaded from: classes.dex */
public class FloatingActionButton extends p220m8.C4432p implements p186k8.InterfaceC4072a, p340t8.InterfaceC6196m, androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0337b {

    /* renamed from: b0 */
    public android.content.res.ColorStateList f6154b0;

    /* renamed from: c0 */
    public android.graphics.PorterDuff.Mode f6155c0;

    /* renamed from: d0 */
    public android.content.res.ColorStateList f6156d0;

    /* renamed from: e0 */
    public android.graphics.PorterDuff.Mode f6157e0;

    /* renamed from: f0 */
    public android.content.res.ColorStateList f6158f0;

    /* renamed from: g0 */
    public int f6159g0;

    /* renamed from: h0 */
    public int f6160h0;

    /* renamed from: i0 */
    public int f6161i0;

    /* renamed from: j0 */
    public boolean f6162j0;

    /* renamed from: k0 */
    public com.google.android.material.floatingactionbutton.C1193d f6163k0;

    public static class BaseBehavior<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> extends androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c<T> {

        /* renamed from: a */
        public android.graphics.Rect f6164a;

        /* renamed from: b */
        public boolean f6165b;

        public BaseBehavior() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.f6165b = r0
                return
        }

        public BaseBehavior(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                r1.<init>(r2, r3)
                int[] r0 = p339t7.C6183a.f24017n
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
                r3 = 0
                r0 = 1
                boolean r3 = r2.getBoolean(r3, r0)
                r1.f6165b = r3
                r2.recycle()
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
        /* renamed from: a */
        public boolean mo985a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.graphics.Rect r3) {
                r0 = this;
                com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
                r2.getLeft()
                r1 = 0
                throw r1
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
        /* renamed from: c */
        public void mo987c(androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f r2) {
                r1 = this;
                int r0 = r2.f1937h
                if (r0 != 0) goto L8
                r0 = 80
                r2.f1937h = r0
            L8:
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
        /* renamed from: d */
        public boolean mo988d(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5) {
                r2 = this;
                com.google.android.material.floatingactionbutton.FloatingActionButton r4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r4
                boolean r0 = r5 instanceof com.google.android.material.appbar.AppBarLayout
                r1 = 0
                if (r0 == 0) goto Ld
                com.google.android.material.appbar.AppBarLayout r5 = (com.google.android.material.appbar.AppBarLayout) r5
                r2.m3466t(r3, r5, r4)
                goto L22
            Ld:
                android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
                boolean r0 = r3 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f
                if (r0 == 0) goto L1c
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r3
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r3 = r3.f1930a
                boolean r3 = r3 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
                goto L1d
            L1c:
                r3 = 0
            L1d:
                if (r3 == 0) goto L22
                r2.m3467u(r5, r4)
            L22:
                return r1
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
        /* renamed from: h */
        public boolean mo992h(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10) {
                r7 = this;
                com.google.android.material.floatingactionbutton.FloatingActionButton r9 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r9
                java.util.List r0 = r8.m968e(r9)
                int r1 = r0.size()
                r2 = 0
                r3 = 0
            Lc:
                if (r3 >= r1) goto L3d
                java.lang.Object r4 = r0.get(r3)
                android.view.View r4 = (android.view.View) r4
                boolean r5 = r4 instanceof com.google.android.material.appbar.AppBarLayout
                if (r5 == 0) goto L21
                com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
                boolean r4 = r7.m3466t(r8, r4, r9)
                if (r4 == 0) goto L3a
                goto L3d
            L21:
                android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
                boolean r6 = r5 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f
                if (r6 == 0) goto L30
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r5 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r5
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r5 = r5.f1930a
                boolean r5 = r5 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
                goto L31
            L30:
                r5 = 0
            L31:
                if (r5 == 0) goto L3a
                boolean r4 = r7.m3467u(r4, r9)
                if (r4 == 0) goto L3a
                goto L3d
            L3a:
                int r3 = r3 + 1
                goto Lc
            L3d:
                r8.m976r(r9, r10)
                r8 = 1
                return r8
        }

        /* renamed from: s */
        public final boolean m3465s(android.view.View r4, com.google.android.material.floatingactionbutton.FloatingActionButton r5) {
                r3 = this;
                android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r0
                boolean r1 = r3.f6165b
                r2 = 0
                if (r1 != 0) goto Lc
                return r2
            Lc:
                int r0 = r0.f1935f
                int r4 = r4.getId()
                if (r0 == r4) goto L15
                return r2
            L15:
                int r4 = r5.getUserSetVisibility()
                if (r4 == 0) goto L1c
                return r2
            L1c:
                r4 = 1
                return r4
        }

        /* renamed from: t */
        public final boolean m3466t(androidx.coordinatorlayout.widget.CoordinatorLayout r3, com.google.android.material.appbar.AppBarLayout r4, com.google.android.material.floatingactionbutton.FloatingActionButton r5) {
                r2 = this;
                boolean r0 = r2.m3465s(r4, r5)
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                android.graphics.Rect r0 = r2.f6164a
                if (r0 != 0) goto L13
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r2.f6164a = r0
            L13:
                android.graphics.Rect r0 = r2.f6164a
                p220m8.C4420d.m9868a(r3, r4, r0)
                int r3 = r0.bottom
                int r4 = r4.m3247xbdc95208()
                r0 = 0
                if (r3 > r4) goto L25
                r5.m3457i(r0, r1)
                goto L28
            L25:
                r5.m3461m(r0, r1)
            L28:
                r3 = 1
                return r3
        }

        /* renamed from: u */
        public final boolean m3467u(android.view.View r4, com.google.android.material.floatingactionbutton.FloatingActionButton r5) {
                r3 = this;
                boolean r0 = r3.m3465s(r4, r5)
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r0
                int r4 = r4.getTop()
                int r2 = r5.getHeight()
                int r2 = r2 / 2
                int r0 = r0.topMargin
                int r2 = r2 + r0
                r0 = 0
                if (r4 >= r2) goto L22
                r5.m3457i(r0, r1)
                goto L25
            L22:
                r5.m3461m(r0, r1)
            L25:
                r4 = 1
                return r4
        }
    }

    public static class Behavior extends com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior<com.google.android.material.floatingactionbutton.FloatingActionButton> {
        public Behavior() {
                r0 = this;
                r0.<init>()
                return
        }

        public Behavior(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    public static abstract class AbstractC1187a {
        public AbstractC1187a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public void mo3468a(com.google.android.material.floatingactionbutton.FloatingActionButton r1) {
                r0 = this;
                return
        }

        /* renamed from: b */
        public void mo3469b(com.google.android.material.floatingactionbutton.FloatingActionButton r1) {
                r0 = this;
                return
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public class C1188b implements p328s8.InterfaceC5996b {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.material.floatingactionbutton.FloatingActionButton f6166a;

        public C1188b(com.google.android.material.floatingactionbutton.FloatingActionButton r1) {
                r0 = this;
                r0.f6166a = r1
                r0.<init>()
                return
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    public class C1189c<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> implements com.google.android.material.floatingactionbutton.C1193d.e {

        /* renamed from: a */
        public final p354u7.InterfaceC6359j<T> f6167a;

        /* renamed from: b */
        public final /* synthetic */ com.google.android.material.floatingactionbutton.FloatingActionButton f6168b;

        public C1189c(com.google.android.material.floatingactionbutton.FloatingActionButton r1, p354u7.InterfaceC6359j<T> r2) {
                r0 = this;
                r0.f6168b = r1
                r0.<init>()
                r0.f6167a = r2
                return
        }

        @Override // com.google.android.material.floatingactionbutton.C1193d.e
        /* renamed from: a */
        public void mo3470a() {
                r2 = this;
                u7.j<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> r0 = r2.f6167a
                com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r2.f6168b
                r0.m13012a(r1)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.C1193d.e
        /* renamed from: b */
        public void mo3471b() {
                r2 = this;
                u7.j<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> r0 = r2.f6167a
                com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r2.f6168b
                r0.m13013b(r1)
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton.C1189c
                if (r0 == 0) goto L12
                com.google.android.material.floatingactionbutton.FloatingActionButton$c r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton.C1189c) r2
                u7.j<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> r2 = r2.f6167a
                u7.j<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> r0 = r1.f6167a
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }

        public int hashCode() {
                r1 = this;
                u7.j<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> r0 = r1.f6167a
                int r0 = r0.hashCode()
                return r0
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m3449c(com.google.android.material.floatingactionbutton.FloatingActionButton r0, android.graphics.drawable.Drawable r1) {
            super.setBackgroundDrawable(r1)
            return
    }

    private com.google.android.material.floatingactionbutton.C1193d getImpl() {
            r2 = this;
            com.google.android.material.floatingactionbutton.d r0 = r2.f6163k0
            if (r0 != 0) goto L10
            l8.c r0 = new l8.c
            com.google.android.material.floatingactionbutton.FloatingActionButton$b r1 = new com.google.android.material.floatingactionbutton.FloatingActionButton$b
            r1.<init>(r2)
            r0.<init>(r2, r1)
            r2.f6163k0 = r0
        L10:
            com.google.android.material.floatingactionbutton.d r0 = r2.f6163k0
            return r0
    }

    @Override // p186k8.InterfaceC4072a
    /* renamed from: a */
    public boolean mo3450a() {
            r1 = this;
            r0 = 0
            throw r0
    }

    /* renamed from: d */
    public void m3451d(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.d r2 = r1.getImpl()
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r0 = r2.f6201q
            if (r0 != 0) goto Lf
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f6201q = r0
        Lf:
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r2 = r2.f6201q
            r0 = 0
            r2.add(r0)
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
            r2 = this;
            super.drawableStateChanged()
            com.google.android.material.floatingactionbutton.d r0 = r2.getImpl()
            int[] r1 = r2.getDrawableState()
            r0.mo3480i(r1)
            return
    }

    /* renamed from: e */
    public void m3452e(android.animation.Animator.AnimatorListener r3) {
            r2 = this;
            com.google.android.material.floatingactionbutton.d r0 = r2.getImpl()
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r1 = r0.f6200p
            if (r1 != 0) goto Lf
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f6200p = r1
        Lf:
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r0 = r0.f6200p
            r0.add(r3)
            return
    }

    /* renamed from: f */
    public void m3453f(p354u7.InterfaceC6359j<? extends com.google.android.material.floatingactionbutton.FloatingActionButton> r3) {
            r2 = this;
            com.google.android.material.floatingactionbutton.d r3 = r2.getImpl()
            com.google.android.material.floatingactionbutton.FloatingActionButton$c r0 = new com.google.android.material.floatingactionbutton.FloatingActionButton$c
            r1 = 0
            r0.<init>(r2, r1)
            java.util.ArrayList<com.google.android.material.floatingactionbutton.d$e> r1 = r3.f6202r
            if (r1 != 0) goto L15
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.f6202r = r1
        L15:
            java.util.ArrayList<com.google.android.material.floatingactionbutton.d$e> r3 = r3.f6202r
            r3.add(r0)
            return
    }

    @java.lang.Deprecated
    /* renamed from: g */
    public boolean m3454g(android.graphics.Rect r4) {
            r3 = this;
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            boolean r0 = p227n0.C4661t.f.m10588c(r3)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            int r0 = r3.getWidth()
            int r2 = r3.getHeight()
            r4.set(r1, r1, r0, r2)
            r4 = 0
            throw r4
    }

    @Override // android.view.View
    public android.content.res.ColorStateList getBackgroundTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f6154b0
            return r0
    }

    @Override // android.view.View
    public android.graphics.PorterDuff.Mode getBackgroundTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f6155c0
            return r0
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0337b
    public androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c<com.google.android.material.floatingactionbutton.FloatingActionButton> getBehavior() {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton$Behavior r0 = new com.google.android.material.floatingactionbutton.FloatingActionButton$Behavior
            r0.<init>()
            return r0
    }

    public float getCompatElevation() {
            r1 = this;
            com.google.android.material.floatingactionbutton.d r0 = r1.getImpl()
            float r0 = r0.mo3474c()
            return r0
    }

    /* renamed from: getCompatHoveredFocusedTranslationZ */
    public float m3455x95210a9d() {
            r1 = this;
            com.google.android.material.floatingactionbutton.d r0 = r1.getImpl()
            float r0 = r0.f6189e
            return r0
    }

    public float getCompatPressedTranslationZ() {
            r1 = this;
            com.google.android.material.floatingactionbutton.d r0 = r1.getImpl()
            float r0 = r0.f6190f
            return r0
    }

    public android.graphics.drawable.Drawable getContentBackground() {
            r1 = this;
            com.google.android.material.floatingactionbutton.d r0 = r1.getImpl()
            java.util.Objects.requireNonNull(r0)
            r0 = 0
            return r0
    }

    public int getCustomSize() {
            r1 = this;
            int r0 = r1.f6160h0
            return r0
    }

    public int getExpandedComponentIdHint() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public p354u7.C6356g getHideMotionSpec() {
            r1 = this;
            com.google.android.material.floatingactionbutton.d r0 = r1.getImpl()
            u7.g r0 = r0.f6196l
            return r0
    }

    @java.lang.Deprecated
    public int getRippleColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f6158f0
            if (r0 == 0) goto L9
            int r0 = r0.getDefaultColor()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public android.content.res.ColorStateList getRippleColorStateList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f6158f0
            return r0
    }

    public p340t8.C6192i getShapeAppearanceModel() {
            r1 = this;
            com.google.android.material.floatingactionbutton.d r0 = r1.getImpl()
            t8.i r0 = r0.f6185a
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    public p354u7.C6356g getShowMotionSpec() {
            r1 = this;
            com.google.android.material.floatingactionbutton.d r0 = r1.getImpl()
            u7.g r0 = r0.f6195k
            return r0
    }

    public int getSize() {
            r1 = this;
            int r0 = r1.f6159g0
            return r0
    }

    public int getSizeDimension() {
            r1 = this;
            int r0 = r1.f6159g0
            int r0 = r1.m3456h(r0)
            return r0
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.getBackgroundTintList()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.getBackgroundTintMode()
            return r0
    }

    public android.content.res.ColorStateList getSupportImageTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f6156d0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportImageTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f6157e0
            return r0
    }

    public boolean getUseCompatPadding() {
            r1 = this;
            boolean r0 = r1.f6162j0
            return r0
    }

    /* renamed from: h */
    public final int m3456h(int r4) {
            r3 = this;
            int r0 = r3.f6160h0
            if (r0 == 0) goto L5
            return r0
        L5:
            android.content.res.Resources r0 = r3.getResources()
            r1 = -1
            r2 = 1
            if (r4 == r1) goto L1b
            if (r4 == r2) goto L17
            r4 = 2131165339(0x7f07009b, float:1.7944892E38)
        L12:
            int r4 = r0.getDimensionPixelSize(r4)
            return r4
        L17:
            r4 = 2131165338(0x7f07009a, float:1.794489E38)
            goto L12
        L1b:
            android.content.res.Configuration r4 = r0.getConfiguration()
            int r4 = r4.screenWidthDp
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenHeightDp
            int r4 = java.lang.Math.max(r4, r0)
            r0 = 470(0x1d6, float:6.59E-43)
            if (r4 >= r0) goto L34
            int r4 = r3.m3456h(r2)
            goto L39
        L34:
            r4 = 0
            int r4 = r3.m3456h(r4)
        L39:
            return r4
    }

    /* renamed from: i */
    public void m3457i(com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC1187a r4, boolean r5) {
            r3 = this;
            com.google.android.material.floatingactionbutton.d r0 = r3.getImpl()
            if (r4 != 0) goto L8
            r4 = 0
            goto Le
        L8:
            com.google.android.material.floatingactionbutton.a r1 = new com.google.android.material.floatingactionbutton.a
            r1.<init>(r3, r4)
            r4 = r1
        Le:
            boolean r1 = r0.m3476e()
            if (r1 == 0) goto L15
            goto L7c
        L15:
            android.animation.Animator r1 = r0.f6194j
            if (r1 == 0) goto L1c
            r1.cancel()
        L1c:
            boolean r1 = r0.m3487p()
            if (r1 == 0) goto L68
            u7.g r1 = r0.f6196l
            if (r1 == 0) goto L27
            goto L3f
        L27:
            u7.g r1 = r0.f6193i
            if (r1 != 0) goto L3a
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r0.f6203s
            android.content.Context r1 = r1.getContext()
            r2 = 2130837505(0x7f020001, float:1.7279966E38)
            u7.g r1 = p354u7.C6356g.m13007b(r1, r2)
            r0.f6193i = r1
        L3a:
            u7.g r1 = r0.f6193i
            java.util.Objects.requireNonNull(r1)
        L3f:
            r2 = 0
            android.animation.AnimatorSet r1 = r0.m3472a(r1, r2, r2, r2)
            com.google.android.material.floatingactionbutton.b r2 = new com.google.android.material.floatingactionbutton.b
            r2.<init>(r0, r5, r4)
            r1.addListener(r2)
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r4 = r0.f6201q
            if (r4 == 0) goto L64
            java.util.Iterator r4 = r4.iterator()
        L54:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L64
            java.lang.Object r5 = r4.next()
            android.animation.Animator$AnimatorListener r5 = (android.animation.Animator.AnimatorListener) r5
            r1.addListener(r5)
            goto L54
        L64:
            r1.start()
            goto L7c
        L68:
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r0.f6203s
            if (r5 == 0) goto L6f
            r1 = 8
            goto L70
        L6f:
            r1 = 4
        L70:
            r0.m9888b(r1, r5)
            if (r4 == 0) goto L7c
            com.google.android.material.floatingactionbutton.FloatingActionButton$a r5 = r4.f6169a
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = r4.f6170b
            r5.mo3468a(r4)
        L7c:
            return
    }

    /* renamed from: j */
    public boolean m3458j() {
            r1 = this;
            com.google.android.material.floatingactionbutton.d r0 = r1.getImpl()
            boolean r0 = r0.m3476e()
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            com.google.android.material.floatingactionbutton.d r0 = r1.getImpl()
            r0.mo3478g()
            return
    }

    /* renamed from: k */
    public boolean m3459k() {
            r1 = this;
            com.google.android.material.floatingactionbutton.d r0 = r1.getImpl()
            boolean r0 = r0.m3477f()
            return r0
    }

    /* renamed from: l */
    public final void m3460l() {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.getDrawable()
            if (r0 != 0) goto L7
            return
        L7:
            android.content.res.ColorStateList r1 = r4.f6156d0
            if (r1 != 0) goto Lf
            p103g0.C2200a.m5785a(r0)
            return
        Lf:
            int[] r2 = r4.getDrawableState()
            r3 = 0
            int r1 = r1.getColorForState(r2, r3)
            android.graphics.PorterDuff$Mode r2 = r4.f6157e0
            if (r2 != 0) goto L1e
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
        L1e:
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.graphics.PorterDuffColorFilter r1 = androidx.appcompat.widget.C0285k.m743c(r1, r2)
            r0.setColorFilter(r1)
            return
    }

    /* renamed from: m */
    public void m3461m(com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC1187a r5, boolean r6) {
            r4 = this;
            com.google.android.material.floatingactionbutton.d r0 = r4.getImpl()
            if (r5 != 0) goto L8
            r5 = 0
            goto Le
        L8:
            com.google.android.material.floatingactionbutton.a r1 = new com.google.android.material.floatingactionbutton.a
            r1.<init>(r4, r5)
            r5 = r1
        Le:
            boolean r1 = r0.m3477f()
            if (r1 == 0) goto L16
            goto La6
        L16:
            android.animation.Animator r1 = r0.f6194j
            if (r1 == 0) goto L1d
            r1.cancel()
        L1d:
            boolean r1 = r0.m3487p()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L85
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r0.f6203s
            int r1 = r1.getVisibility()
            if (r1 == 0) goto L40
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r0.f6203s
            r3 = 0
            r1.setAlpha(r3)
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r0.f6203s
            r1.setScaleY(r3)
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r0.f6203s
            r1.setScaleX(r3)
            r0.m3484m(r3)
        L40:
            u7.g r1 = r0.f6195k
            if (r1 == 0) goto L45
            goto L5d
        L45:
            u7.g r1 = r0.f6192h
            if (r1 != 0) goto L58
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r0.f6203s
            android.content.Context r1 = r1.getContext()
            r3 = 2130837506(0x7f020002, float:1.7279968E38)
            u7.g r1 = p354u7.C6356g.m13007b(r1, r3)
            r0.f6192h = r1
        L58:
            u7.g r1 = r0.f6192h
            java.util.Objects.requireNonNull(r1)
        L5d:
            android.animation.AnimatorSet r1 = r0.m3472a(r1, r2, r2, r2)
            com.google.android.material.floatingactionbutton.c r2 = new com.google.android.material.floatingactionbutton.c
            r2.<init>(r0, r6, r5)
            r1.addListener(r2)
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r5 = r0.f6200p
            if (r5 == 0) goto L81
            java.util.Iterator r5 = r5.iterator()
        L71:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L81
            java.lang.Object r6 = r5.next()
            android.animation.Animator$AnimatorListener r6 = (android.animation.Animator.AnimatorListener) r6
            r1.addListener(r6)
            goto L71
        L81:
            r1.start()
            goto La6
        L85:
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r0.f6203s
            r3 = 0
            r1.m9888b(r3, r6)
            com.google.android.material.floatingactionbutton.FloatingActionButton r6 = r0.f6203s
            r6.setAlpha(r2)
            com.google.android.material.floatingactionbutton.FloatingActionButton r6 = r0.f6203s
            r6.setScaleY(r2)
            com.google.android.material.floatingactionbutton.FloatingActionButton r6 = r0.f6203s
            r6.setScaleX(r2)
            r0.m3484m(r2)
            if (r5 == 0) goto La6
            com.google.android.material.floatingactionbutton.FloatingActionButton$a r6 = r5.f6169a
            com.google.android.material.floatingactionbutton.FloatingActionButton r5 = r5.f6170b
            r6.mo3469b(r5)
        La6:
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
            r3 = this;
            super.onAttachedToWindow()
            com.google.android.material.floatingactionbutton.d r0 = r3.getImpl()
            java.util.Objects.requireNonNull(r0)
            boolean r1 = r0 instanceof p203l8.C4196c
            r1 = r1 ^ 1
            if (r1 == 0) goto L26
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r0.f6203s
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r2 = r0.f6207w
            if (r2 != 0) goto L21
            l8.b r2 = new l8.b
            r2.<init>(r0)
            r0.f6207w = r2
        L21:
            android.view.ViewTreeObserver$OnPreDrawListener r0 = r0.f6207w
            r1.addOnPreDrawListener(r0)
        L26:
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
            r3 = this;
            super.onDetachedFromWindow()
            com.google.android.material.floatingactionbutton.d r0 = r3.getImpl()
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r0.f6203s
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r2 = r0.f6207w
            if (r2 == 0) goto L17
            r1.removeOnPreDrawListener(r2)
            r1 = 0
            r0.f6207w = r1
        L17:
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int r1, int r2) {
            r0 = this;
            int r1 = r0.getSizeDimension()
            int r1 = r1 + 0
            int r1 = r1 / 2
            r0.f6161i0 = r1
            com.google.android.material.floatingactionbutton.d r1 = r0.getImpl()
            r1.m3490s()
            r1 = 0
            throw r1
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r3) {
            r2 = this;
            boolean r0 = r3 instanceof p374v8.C6585a
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r3)
            return
        L8:
            v8.a r3 = (p374v8.C6585a) r3
            android.os.Parcelable r0 = r3.f22819Y
            super.onRestoreInstanceState(r0)
            s.h<java.lang.String, android.os.Bundle> r3 = r3.f25756a0
            java.lang.String r0 = "expandableWidgetHelper"
            r1 = 0
            java.lang.Object r3 = r3.getOrDefault(r0, r1)
            java.util.Objects.requireNonNull(r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            throw r1
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r1 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            if (r0 != 0) goto Lb
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        Lb:
            r0 = 0
            throw r0
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            int r0 = r2.getAction()
            if (r0 != 0) goto La
            r0 = 0
            r1.m3454g(r0)
        La:
            boolean r2 = super.onTouchEvent(r2)
            return r2
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
            r1 = this;
            java.lang.String r2 = "FloatingActionButton"
            java.lang.String r0 = "Setting a custom background is not supported."
            android.util.Log.i(r2, r0)
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            java.lang.String r2 = "FloatingActionButton"
            java.lang.String r0 = "Setting a custom background is not supported."
            android.util.Log.i(r2, r0)
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            java.lang.String r2 = "FloatingActionButton"
            java.lang.String r0 = "Setting a custom background is not supported."
            android.util.Log.i(r2, r0)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f6154b0
            if (r0 == r2) goto Ld
            r1.f6154b0 = r2
            com.google.android.material.floatingactionbutton.d r2 = r1.getImpl()
            java.util.Objects.requireNonNull(r2)
        Ld:
            return
    }

    @Override // android.view.View
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f6155c0
            if (r0 == r2) goto Ld
            r1.f6155c0 = r2
            com.google.android.material.floatingactionbutton.d r2 = r1.getImpl()
            java.util.Objects.requireNonNull(r2)
        Ld:
            return
    }

    public void setCompatElevation(float r4) {
            r3 = this;
            com.google.android.material.floatingactionbutton.d r0 = r3.getImpl()
            float r1 = r0.f6188d
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L13
            r0.f6188d = r4
            float r1 = r0.f6189e
            float r2 = r0.f6190f
            r0.mo3481j(r4, r1, r2)
        L13:
            return
    }

    public void setCompatElevationResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            float r2 = r0.getDimension(r2)
            r1.setCompatElevation(r2)
            return
    }

    /* renamed from: setCompatHoveredFocusedTranslationZ */
    public void m3462x674a07a9(float r4) {
            r3 = this;
            com.google.android.material.floatingactionbutton.d r0 = r3.getImpl()
            float r1 = r0.f6189e
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L13
            r0.f6189e = r4
            float r1 = r0.f6188d
            float r2 = r0.f6190f
            r0.mo3481j(r1, r4, r2)
        L13:
            return
    }

    /* renamed from: setCompatHoveredFocusedTranslationZResource */
    public void m3463x2d0676d7(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            float r2 = r0.getDimension(r2)
            r1.m3462x674a07a9(r2)
            return
    }

    public void setCompatPressedTranslationZ(float r4) {
            r3 = this;
            com.google.android.material.floatingactionbutton.d r0 = r3.getImpl()
            float r1 = r0.f6190f
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L13
            r0.f6190f = r4
            float r1 = r0.f6188d
            float r2 = r0.f6189e
            r0.mo3481j(r1, r2, r4)
        L13:
            return
    }

    /* renamed from: setCompatPressedTranslationZResource */
    public void m3464x3ce61915(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            float r2 = r0.getDimension(r2)
            r1.setCompatPressedTranslationZ(r2)
            return
    }

    public void setCustomSize(int r2) {
            r1 = this;
            if (r2 < 0) goto Lc
            int r0 = r1.f6160h0
            if (r2 == r0) goto Lb
            r1.f6160h0 = r2
            r1.requestLayout()
        Lb:
            return
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Custom size must be non-negative"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            com.google.android.material.floatingactionbutton.d r1 = r0.getImpl()
            java.util.Objects.requireNonNull(r1)
            return
    }

    public void setEnsureMinTouchTargetSize(boolean r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.d r0 = r1.getImpl()
            boolean r0 = r0.f6186b
            if (r2 == r0) goto L11
            com.google.android.material.floatingactionbutton.d r0 = r1.getImpl()
            r0.f6186b = r2
            r1.requestLayout()
        L11:
            return
    }

    public void setExpandedComponentIdHint(int r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void setHideMotionSpec(p354u7.C6356g r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.d r0 = r1.getImpl()
            r0.f6196l = r2
            return
    }

    public void setHideMotionSpecResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            u7.g r2 = p354u7.C6356g.m13007b(r0, r2)
            r1.setHideMotionSpec(r2)
            return
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.getDrawable()
            if (r0 == r2) goto L19
            super.setImageDrawable(r2)
            com.google.android.material.floatingactionbutton.d r2 = r1.getImpl()
            float r0 = r2.f6198n
            r2.m3484m(r0)
            android.content.res.ColorStateList r2 = r1.f6156d0
            if (r2 == 0) goto L19
            r1.m3460l()
        L19:
            return
    }

    @Override // android.widget.ImageView
    public void setImageResource(int r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void setRippleColor(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setRippleColor(r1)
            return
    }

    public void setRippleColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f6158f0
            if (r0 == r2) goto Lf
            r1.f6158f0 = r2
            com.google.android.material.floatingactionbutton.d r2 = r1.getImpl()
            android.content.res.ColorStateList r0 = r1.f6158f0
            r2.mo3485n(r0)
        Lf:
            return
    }

    @Override // android.view.View
    public void setScaleX(float r1) {
            r0 = this;
            super.setScaleX(r1)
            com.google.android.material.floatingactionbutton.d r1 = r0.getImpl()
            r1.m3482k()
            return
    }

    @Override // android.view.View
    public void setScaleY(float r1) {
            r0 = this;
            super.setScaleY(r1)
            com.google.android.material.floatingactionbutton.d r1 = r0.getImpl()
            r1.m3482k()
            return
    }

    public void setShadowPaddingEnabled(boolean r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.d r0 = r1.getImpl()
            r0.f6187c = r2
            r0.m3490s()
            r2 = 0
            throw r2
    }

    @Override // p340t8.InterfaceC6196m
    public void setShapeAppearanceModel(p340t8.C6192i r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.d r0 = r1.getImpl()
            r0.f6185a = r2
            return
    }

    public void setShowMotionSpec(p354u7.C6356g r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.d r0 = r1.getImpl()
            r0.f6195k = r2
            return
    }

    public void setShowMotionSpecResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            u7.g r2 = p354u7.C6356g.m13007b(r0, r2)
            r1.setShowMotionSpec(r2)
            return
    }

    public void setSize(int r2) {
            r1 = this;
            r0 = 0
            r1.f6160h0 = r0
            int r0 = r1.f6159g0
            if (r2 == r0) goto Lc
            r1.f6159g0 = r2
            r1.requestLayout()
        Lc:
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.setBackgroundTintList(r1)
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.setBackgroundTintMode(r1)
            return
    }

    public void setSupportImageTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f6156d0
            if (r0 == r2) goto L9
            r1.f6156d0 = r2
            r1.m3460l()
        L9:
            return
    }

    public void setSupportImageTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f6157e0
            if (r0 == r2) goto L9
            r1.f6157e0 = r2
            r1.m3460l()
        L9:
            return
    }

    @Override // android.view.View
    public void setTranslationX(float r1) {
            r0 = this;
            super.setTranslationX(r1)
            com.google.android.material.floatingactionbutton.d r1 = r0.getImpl()
            r1.m3483l()
            return
    }

    @Override // android.view.View
    public void setTranslationY(float r1) {
            r0 = this;
            super.setTranslationY(r1)
            com.google.android.material.floatingactionbutton.d r1 = r0.getImpl()
            r1.m3483l()
            return
    }

    @Override // android.view.View
    public void setTranslationZ(float r1) {
            r0 = this;
            super.setTranslationZ(r1)
            com.google.android.material.floatingactionbutton.d r1 = r0.getImpl()
            r1.m3483l()
            return
    }

    public void setUseCompatPadding(boolean r2) {
            r1 = this;
            boolean r0 = r1.f6162j0
            if (r0 == r2) goto Ld
            r1.f6162j0 = r2
            com.google.android.material.floatingactionbutton.d r2 = r1.getImpl()
            r2.mo3479h()
        Ld:
            return
    }

    @Override // p220m8.C4432p, android.widget.ImageView, android.view.View
    public void setVisibility(int r1) {
            r0 = this;
            super.setVisibility(r1)
            return
    }
}
