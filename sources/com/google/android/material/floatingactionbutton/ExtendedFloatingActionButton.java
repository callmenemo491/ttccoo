package com.google.android.material.floatingactionbutton;

/* loaded from: classes.dex */
public class ExtendedFloatingActionButton extends com.google.android.material.button.MaterialButton implements androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0337b {

    /* renamed from: s0 */
    public static final /* synthetic */ int f6149s0 = 0;

    /* renamed from: r0 */
    public boolean f6150r0;

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior */
    public static class C1182x7eb6f299<T extends com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton> extends androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c<T> {

        /* renamed from: a */
        public android.graphics.Rect f6151a;

        /* renamed from: b */
        public boolean f6152b;

        /* renamed from: c */
        public boolean f6153c;

        public C1182x7eb6f299() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f6152b = r0
                r0 = 1
                r1.f6153c = r0
                return
        }

        public C1182x7eb6f299(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                r1.<init>(r2, r3)
                int[] r0 = p339t7.C6183a.f24016m
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
                r3 = 0
                boolean r3 = r2.getBoolean(r3, r3)
                r1.f6152b = r3
                r3 = 1
                boolean r3 = r2.getBoolean(r3, r3)
                r1.f6153c = r3
                r2.recycle()
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo985a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.graphics.Rect r3) {
                r0 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) r2
                r1 = 0
                return r1
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
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r4 = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) r4
                boolean r0 = r5 instanceof com.google.android.material.appbar.AppBarLayout
                r1 = 0
                if (r0 == 0) goto Ld
                com.google.android.material.appbar.AppBarLayout r5 = (com.google.android.material.appbar.AppBarLayout) r5
                r2.m3447t(r3, r5, r4)
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
                r2.m3448u(r5, r4)
            L22:
                return r1
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
        /* renamed from: h */
        public boolean mo992h(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10) {
                r7 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r9 = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) r9
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
                boolean r4 = r7.m3447t(r8, r4, r9)
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
                boolean r4 = r7.m3448u(r4, r9)
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
        public final boolean m3446s(android.view.View r3, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r4) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r4
                boolean r0 = r2.f6152b
                r1 = 0
                if (r0 != 0) goto L10
                boolean r0 = r2.f6153c
                if (r0 != 0) goto L10
                return r1
            L10:
                int r4 = r4.f1935f
                int r3 = r3.getId()
                if (r4 == r3) goto L19
                return r1
            L19:
                r3 = 1
                return r3
        }

        /* renamed from: t */
        public final boolean m3447t(androidx.coordinatorlayout.widget.CoordinatorLayout r1, com.google.android.material.appbar.AppBarLayout r2, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r3) {
                r0 = this;
                boolean r3 = r0.m3446s(r2, r3)
                if (r3 != 0) goto L8
                r1 = 0
                return r1
            L8:
                android.graphics.Rect r3 = r0.f6151a
                if (r3 != 0) goto L13
                android.graphics.Rect r3 = new android.graphics.Rect
                r3.<init>()
                r0.f6151a = r3
            L13:
                android.graphics.Rect r3 = r0.f6151a
                p220m8.C4420d.m9868a(r1, r2, r3)
                int r1 = r3.bottom
                int r2 = r2.m3247xbdc95208()
                r3 = 0
                if (r1 > r2) goto L24
                int r1 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.f6149s0
                throw r3
            L24:
                int r1 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.f6149s0
                throw r3
        }

        /* renamed from: u */
        public final boolean m3448u(android.view.View r2, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r3) {
                r1 = this;
                boolean r0 = r1.m3446s(r2, r3)
                if (r0 != 0) goto L8
                r2 = 0
                return r2
            L8:
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r0
                int r2 = r2.getTop()
                int r3 = r3.getHeight()
                int r3 = r3 / 2
                int r0 = r0.topMargin
                int r3 = r3 + r0
                r0 = 0
                if (r2 >= r3) goto L21
                int r2 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.f6149s0
                throw r0
            L21:
                int r2 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.f6149s0
                throw r0
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    public static class C1183a extends android.util.Property<android.view.View, java.lang.Float> {
        public C1183a(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.util.Property
        public java.lang.Float get(android.view.View r1) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                int r1 = r1.width
                float r1 = (float) r1
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                return r1
        }

        @Override // android.util.Property
        public void set(android.view.View r2, java.lang.Float r3) {
                r1 = this;
                android.view.View r2 = (android.view.View) r2
                java.lang.Float r3 = (java.lang.Float) r3
                android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
                int r3 = r3.intValue()
                r0.width = r3
                r2.requestLayout()
                return
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    public static class C1184b extends android.util.Property<android.view.View, java.lang.Float> {
        public C1184b(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.util.Property
        public java.lang.Float get(android.view.View r1) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                int r1 = r1.height
                float r1 = (float) r1
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                return r1
        }

        @Override // android.util.Property
        public void set(android.view.View r2, java.lang.Float r3) {
                r1 = this;
                android.view.View r2 = (android.view.View) r2
                java.lang.Float r3 = (java.lang.Float) r3
                android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
                int r3 = r3.intValue()
                r0.height = r3
                r2.requestLayout()
                return
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    public static class C1185c extends android.util.Property<android.view.View, java.lang.Float> {
        public C1185c(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.util.Property
        public java.lang.Float get(android.view.View r2) {
                r1 = this;
                android.view.View r2 = (android.view.View) r2
                java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
                int r2 = p227n0.C4661t.d.m10577f(r2)
                float r2 = (float) r2
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                return r2
        }

        @Override // android.util.Property
        public void set(android.view.View r4, java.lang.Float r5) {
                r3 = this;
                android.view.View r4 = (android.view.View) r4
                java.lang.Float r5 = (java.lang.Float) r5
                int r5 = r5.intValue()
                int r0 = r4.getPaddingTop()
                java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
                int r1 = p227n0.C4661t.d.m10576e(r4)
                int r2 = r4.getPaddingBottom()
                p227n0.C4661t.d.m10582k(r4, r5, r0, r1, r2)
                return
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    public static class C1186d extends android.util.Property<android.view.View, java.lang.Float> {
        public C1186d(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.util.Property
        public java.lang.Float get(android.view.View r2) {
                r1 = this;
                android.view.View r2 = (android.view.View) r2
                java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
                int r2 = p227n0.C4661t.d.m10576e(r2)
                float r2 = (float) r2
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                return r2
        }

        @Override // android.util.Property
        public void set(android.view.View r4, java.lang.Float r5) {
                r3 = this;
                android.view.View r4 = (android.view.View) r4
                java.lang.Float r5 = (java.lang.Float) r5
                java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
                int r0 = p227n0.C4661t.d.m10577f(r4)
                int r1 = r4.getPaddingTop()
                int r5 = r5.intValue()
                int r2 = r4.getPaddingBottom()
                p227n0.C4661t.d.m10582k(r4, r0, r1, r5, r2)
                return
        }
    }

    static {
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a
            java.lang.String r2 = "width"
            r1.<init>(r0, r2)
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b
            java.lang.String r2 = "height"
            r1.<init>(r0, r2)
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c
            java.lang.String r2 = "paddingStart"
            r1.<init>(r0, r2)
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d
            java.lang.String r2 = "paddingEnd"
            r1.<init>(r0, r2)
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0337b
    public androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c<com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton> getBehavior() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int getCollapsedPadding() {
            r2 = this;
            int r0 = r2.getCollapsedSize()
            int r1 = r2.getIconSize()
            int r0 = r0 - r1
            int r0 = r0 / 2
            return r0
    }

    public int getCollapsedSize() {
            r1 = this;
            r0 = 0
            return r0
    }

    public p354u7.C6356g getExtendMotionSpec() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public p354u7.C6356g getHideMotionSpec() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public p354u7.C6356g getShowMotionSpec() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public p354u7.C6356g getShrinkMotionSpec() {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            return
    }

    public void setAnimateShowBeforeLayout(boolean r1) {
            r0 = this;
            r0.f6150r0 = r1
            return
    }

    public void setExtendMotionSpec(p354u7.C6356g r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void setExtendMotionSpecResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            u7.g r2 = p354u7.C6356g.m13007b(r0, r2)
            r1.setExtendMotionSpec(r2)
            return
    }

    public void setExtended(boolean r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            r1 = 0
            throw r1
    }

    public void setHideMotionSpec(p354u7.C6356g r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void setHideMotionSpecResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            u7.g r2 = p354u7.C6356g.m13007b(r0, r2)
            r1.setHideMotionSpec(r2)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.setPadding(r1, r2, r3, r4)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.setPaddingRelative(r1, r2, r3, r4)
            return
    }

    public void setShowMotionSpec(p354u7.C6356g r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void setShowMotionSpecResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            u7.g r2 = p354u7.C6356g.m13007b(r0, r2)
            r1.setShowMotionSpec(r2)
            return
    }

    public void setShrinkMotionSpec(p354u7.C6356g r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void setShrinkMotionSpecResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            u7.g r2 = p354u7.C6356g.m13007b(r0, r2)
            r1.setShrinkMotionSpec(r2)
            return
    }

    @Override // android.widget.TextView
    public void setTextColor(int r1) {
            r0 = this;
            super.setTextColor(r1)
            r0.getTextColors()
            return
    }

    @Override // android.widget.TextView
    public void setTextColor(android.content.res.ColorStateList r1) {
            r0 = this;
            super.setTextColor(r1)
            r0.getTextColors()
            return
    }
}
