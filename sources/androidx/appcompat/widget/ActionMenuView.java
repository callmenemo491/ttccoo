package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ActionMenuView extends androidx.appcompat.widget.LinearLayoutCompat implements androidx.appcompat.view.menu.C0211e.b, androidx.appcompat.view.menu.InterfaceC0216j {

    /* renamed from: A0 */
    public androidx.appcompat.widget.ActionMenuView.InterfaceC0229e f957A0;

    /* renamed from: p0 */
    public androidx.appcompat.view.menu.C0211e f958p0;

    /* renamed from: q0 */
    public android.content.Context f959q0;

    /* renamed from: r0 */
    public int f960r0;

    /* renamed from: s0 */
    public boolean f961s0;

    /* renamed from: t0 */
    public androidx.appcompat.widget.C0264c f962t0;

    /* renamed from: u0 */
    public androidx.appcompat.view.menu.InterfaceC0215i.a f963u0;

    /* renamed from: v0 */
    public androidx.appcompat.view.menu.C0211e.a f964v0;

    /* renamed from: w0 */
    public boolean f965w0;

    /* renamed from: x0 */
    public int f966x0;

    /* renamed from: y0 */
    public int f967y0;

    /* renamed from: z0 */
    public int f968z0;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface InterfaceC0225a {
        /* renamed from: a */
        boolean mo456a();

        /* renamed from: b */
        boolean mo457b();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    public static class C0226b implements androidx.appcompat.view.menu.InterfaceC0215i.a {
        public C0226b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0215i.a
        /* renamed from: a */
        public void mo525a(androidx.appcompat.view.menu.C0211e r1, boolean r2) {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0215i.a
        /* renamed from: b */
        public boolean mo526b(androidx.appcompat.view.menu.C0211e r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0227c extends androidx.appcompat.widget.LinearLayoutCompat.C0231a {

        /* renamed from: a */
        @android.view.ViewDebug.ExportedProperty
        public boolean f969a;

        /* renamed from: b */
        @android.view.ViewDebug.ExportedProperty
        public int f970b;

        /* renamed from: c */
        @android.view.ViewDebug.ExportedProperty
        public int f971c;

        /* renamed from: d */
        @android.view.ViewDebug.ExportedProperty
        public boolean f972d;

        /* renamed from: e */
        @android.view.ViewDebug.ExportedProperty
        public boolean f973e;

        /* renamed from: f */
        public boolean f974f;

        public C0227c(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.f969a = r1
                return
        }

        public C0227c(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public C0227c(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public C0227c(androidx.appcompat.widget.ActionMenuView.C0227c r1) {
                r0 = this;
                r0.<init>(r1)
                boolean r1 = r1.f969a
                r0.f969a = r1
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public class C0228d implements androidx.appcompat.view.menu.C0211e.a {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.widget.ActionMenuView f975Y;

        public C0228d(androidx.appcompat.widget.ActionMenuView r1) {
                r0 = this;
                r0.f975Y = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.C0211e.a
        /* renamed from: a */
        public boolean mo523a(androidx.appcompat.view.menu.C0211e r2, android.view.MenuItem r3) {
                r1 = this;
                androidx.appcompat.widget.ActionMenuView r2 = r1.f975Y
                androidx.appcompat.widget.ActionMenuView$e r2 = r2.f957A0
                r0 = 0
                if (r2 == 0) goto L18
                androidx.appcompat.widget.Toolbar$a r2 = (androidx.appcompat.widget.Toolbar.C0250a) r2
                androidx.appcompat.widget.Toolbar r2 = r2.f1163a
                androidx.appcompat.widget.Toolbar$f r2 = r2.f1130G0
                if (r2 == 0) goto L14
                boolean r2 = r2.onMenuItemClick(r3)
                goto L15
            L14:
                r2 = 0
            L15:
                if (r2 == 0) goto L18
                r0 = 1
            L18:
                return r0
        }

        @Override // androidx.appcompat.view.menu.C0211e.a
        /* renamed from: b */
        public void mo524b(androidx.appcompat.view.menu.C0211e r2) {
                r1 = this;
                androidx.appcompat.widget.ActionMenuView r0 = r1.f975Y
                androidx.appcompat.view.menu.e$a r0 = r0.f964v0
                if (r0 == 0) goto L9
                r0.mo524b(r2)
            L9:
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface InterfaceC0229e {
    }

    public ActionMenuView(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r4 = 0
            r2.setBaselineAligned(r4)
            android.content.res.Resources r0 = r3.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1113587712(0x42600000, float:56.0)
            float r1 = r1 * r0
            int r1 = (int) r1
            r2.f967y0 = r1
            r1 = 1082130432(0x40800000, float:4.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            r2.f968z0 = r0
            r2.f959q0 = r3
            r2.f960r0 = r4
            return
    }

    /* renamed from: o */
    public static int m571o(android.view.View r5, int r6, int r7, int r8, int r9) {
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r0 = (androidx.appcompat.widget.ActionMenuView.C0227c) r0
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = r1 - r9
            int r8 = android.view.View.MeasureSpec.getMode(r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            boolean r9 = r5 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r9 == 0) goto L1b
            r9 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r9 = (androidx.appcompat.view.menu.ActionMenuItemView) r9
            goto L1c
        L1b:
            r9 = 0
        L1c:
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L28
            boolean r9 = r9.m458c()
            if (r9 == 0) goto L28
            r9 = 1
            goto L29
        L28:
            r9 = 0
        L29:
            r3 = 2
            if (r7 <= 0) goto L4d
            if (r9 == 0) goto L30
            if (r7 < r3) goto L4d
        L30:
            int r7 = r7 * r6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r5.measure(r7, r8)
            int r7 = r5.getMeasuredWidth()
            int r4 = r7 / r6
            int r7 = r7 % r6
            if (r7 == 0) goto L46
            int r4 = r4 + 1
        L46:
            if (r9 == 0) goto L4b
            if (r4 >= r3) goto L4b
            goto L4e
        L4b:
            r3 = r4
            goto L4e
        L4d:
            r3 = 0
        L4e:
            boolean r7 = r0.f969a
            if (r7 != 0) goto L55
            if (r9 == 0) goto L55
            r1 = 1
        L55:
            r0.f972d = r1
            r0.f970b = r3
            int r6 = r6 * r3
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r5.measure(r6, r8)
            return r3
    }

    @Override // androidx.appcompat.view.menu.C0211e.b
    /* renamed from: a */
    public boolean mo464a(androidx.appcompat.view.menu.C0213g r4) {
            r3 = this;
            androidx.appcompat.view.menu.e r0 = r3.f958p0
            r1 = 0
            r2 = 0
            boolean r4 = r0.m515r(r4, r1, r2)
            return r4
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0216j
    /* renamed from: b */
    public void mo465b(androidx.appcompat.view.menu.C0211e r1) {
            r0 = this;
            r0.f958p0 = r1
            return
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.appcompat.widget.ActionMenuView.C0227c
            return r1
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuView$c r0 = r1.m575l()
            return r0
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.appcompat.widget.ActionMenuView$c r0 = new androidx.appcompat.widget.ActionMenuView$c
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.appcompat.widget.ActionMenuView$c r1 = r0.m576m(r1)
            return r1
    }

    public android.view.Menu getMenu() {
            r3 = this;
            androidx.appcompat.view.menu.e r0 = r3.f958p0
            if (r0 != 0) goto L3d
            android.content.Context r0 = r3.getContext()
            androidx.appcompat.view.menu.e r1 = new androidx.appcompat.view.menu.e
            r1.<init>(r0)
            r3.f958p0 = r1
            androidx.appcompat.widget.ActionMenuView$d r2 = new androidx.appcompat.widget.ActionMenuView$d
            r2.<init>(r3)
            r1.f812e = r2
            androidx.appcompat.widget.c r1 = new androidx.appcompat.widget.c
            r1.<init>(r0)
            r3.f962t0 = r1
            r0 = 1
            r1.f1227k0 = r0
            r1.f1228l0 = r0
            androidx.appcompat.view.menu.i$a r0 = r3.f963u0
            if (r0 == 0) goto L27
            goto L2c
        L27:
            androidx.appcompat.widget.ActionMenuView$b r0 = new androidx.appcompat.widget.ActionMenuView$b
            r0.<init>()
        L2c:
            r1.f752c0 = r0
            androidx.appcompat.view.menu.e r0 = r3.f958p0
            android.content.Context r2 = r3.f959q0
            r0.m499b(r1, r2)
            androidx.appcompat.widget.c r0 = r3.f962t0
            r0.f755f0 = r3
            androidx.appcompat.view.menu.e r0 = r0.f750a0
            r3.f958p0 = r0
        L3d:
            androidx.appcompat.view.menu.e r0 = r3.f958p0
            return r0
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
            r2 = this;
            r2.getMenu()
            androidx.appcompat.widget.c r0 = r2.f962t0
            androidx.appcompat.widget.c$d r1 = r0.f1224h0
            if (r1 == 0) goto Le
            android.graphics.drawable.Drawable r0 = r1.getDrawable()
            goto L16
        Le:
            boolean r1 = r0.f1226j0
            if (r1 == 0) goto L15
            android.graphics.drawable.Drawable r0 = r0.f1225i0
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    public int getPopupTheme() {
            r1 = this;
            int r0 = r1.f960r0
            return r0
    }

    public int getWindowAnimations() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: h */
    public /* bridge */ /* synthetic */ androidx.appcompat.widget.LinearLayoutCompat.C0231a mo572h() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuView$c r0 = r1.m575l()
            return r0
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: i */
    public androidx.appcompat.widget.LinearLayoutCompat.C0231a mo573i(android.util.AttributeSet r3) {
            r2 = this;
            androidx.appcompat.widget.ActionMenuView$c r0 = new androidx.appcompat.widget.ActionMenuView$c
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: j */
    public /* bridge */ /* synthetic */ androidx.appcompat.widget.LinearLayoutCompat.C0231a mo574j(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.appcompat.widget.ActionMenuView$c r1 = r0.m576m(r1)
            return r1
    }

    /* renamed from: l */
    public androidx.appcompat.widget.ActionMenuView.C0227c m575l() {
            r2 = this;
            androidx.appcompat.widget.ActionMenuView$c r0 = new androidx.appcompat.widget.ActionMenuView$c
            r1 = -2
            r0.<init>(r1, r1)
            r1 = 16
            r0.gravity = r1
            return r0
    }

    /* renamed from: m */
    public androidx.appcompat.widget.ActionMenuView.C0227c m576m(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            if (r2 == 0) goto L1c
            boolean r0 = r2 instanceof androidx.appcompat.widget.ActionMenuView.C0227c
            if (r0 == 0) goto Le
            androidx.appcompat.widget.ActionMenuView$c r0 = new androidx.appcompat.widget.ActionMenuView$c
            androidx.appcompat.widget.ActionMenuView$c r2 = (androidx.appcompat.widget.ActionMenuView.C0227c) r2
            r0.<init>(r2)
            goto L13
        Le:
            androidx.appcompat.widget.ActionMenuView$c r0 = new androidx.appcompat.widget.ActionMenuView$c
            r0.<init>(r2)
        L13:
            int r2 = r0.gravity
            if (r2 > 0) goto L1b
            r2 = 16
            r0.gravity = r2
        L1b:
            return r0
        L1c:
            androidx.appcompat.widget.ActionMenuView$c r2 = r1.m575l()
            return r2
    }

    /* renamed from: n */
    public boolean m577n(int r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r5 + (-1)
            android.view.View r1 = r4.getChildAt(r1)
            android.view.View r2 = r4.getChildAt(r5)
            int r3 = r4.getChildCount()
            if (r5 >= r3) goto L1f
            boolean r3 = r1 instanceof androidx.appcompat.widget.ActionMenuView.InterfaceC0225a
            if (r3 == 0) goto L1f
            androidx.appcompat.widget.ActionMenuView$a r1 = (androidx.appcompat.widget.ActionMenuView.InterfaceC0225a) r1
            boolean r1 = r1.mo456a()
            r0 = r0 | r1
        L1f:
            if (r5 <= 0) goto L2c
            boolean r5 = r2 instanceof androidx.appcompat.widget.ActionMenuView.InterfaceC0225a
            if (r5 == 0) goto L2c
            androidx.appcompat.widget.ActionMenuView$a r2 = (androidx.appcompat.widget.ActionMenuView.InterfaceC0225a) r2
            boolean r5 = r2.mo457b()
            r0 = r0 | r5
        L2c:
            return r0
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            androidx.appcompat.widget.c r2 = r1.f962t0
            if (r2 == 0) goto L1d
            r0 = 0
            r2.mo487v(r0)
            androidx.appcompat.widget.c r2 = r1.f962t0
            boolean r2 = r2.m698f()
            if (r2 == 0) goto L1d
            androidx.appcompat.widget.c r2 = r1.f962t0
            r2.m696d()
            androidx.appcompat.widget.c r2 = r1.f962t0
            r2.m699g()
        L1d:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            androidx.appcompat.widget.c r0 = r1.f962t0
            if (r0 == 0) goto La
            r0.m694b()
        La:
            return
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
            r9 = this;
            boolean r0 = r9.f965w0
            if (r0 != 0) goto L8
            super.onLayout(r10, r11, r12, r13, r14)
            return
        L8:
            int r10 = r9.getChildCount()
            int r14 = r14 - r12
            int r14 = r14 / 2
            int r12 = r9.getDividerWidth()
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r11 = r13 - r11
            int r0 = r9.getPaddingLeft()
            int r11 = r11 - r0
            boolean r0 = androidx.appcompat.widget.C0275f1.m724b(r9)
            r1 = 0
            r2 = 0
            r3 = 0
        L26:
            r4 = 8
            r5 = 1
            if (r1 >= r10) goto L88
            android.view.View r5 = r9.getChildAt(r1)
            int r6 = r5.getVisibility()
            if (r6 != r4) goto L36
            goto L85
        L36:
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r4 = (androidx.appcompat.widget.ActionMenuView.C0227c) r4
            boolean r6 = r4.f969a
            if (r6 == 0) goto L75
            int r2 = r5.getMeasuredWidth()
            boolean r6 = r9.m577n(r1)
            if (r6 == 0) goto L4b
            int r2 = r2 + r12
        L4b:
            int r6 = r5.getMeasuredHeight()
            if (r0 == 0) goto L5b
            int r7 = r9.getPaddingLeft()
            int r4 = r4.leftMargin
            int r7 = r7 + r4
            int r4 = r7 + r2
            goto L6a
        L5b:
            int r7 = r9.getWidth()
            int r8 = r9.getPaddingRight()
            int r7 = r7 - r8
            int r4 = r4.rightMargin
            int r4 = r7 - r4
            int r7 = r4 - r2
        L6a:
            int r8 = r6 / 2
            int r8 = r14 - r8
            int r6 = r6 + r8
            r5.layout(r7, r8, r4, r6)
            int r11 = r11 - r2
            r2 = 1
            goto L85
        L75:
            int r5 = r5.getMeasuredWidth()
            int r6 = r4.leftMargin
            int r5 = r5 + r6
            int r4 = r4.rightMargin
            int r5 = r5 + r4
            int r11 = r11 - r5
            r9.m577n(r1)
            int r3 = r3 + 1
        L85:
            int r1 = r1 + 1
            goto L26
        L88:
            if (r10 != r5) goto La7
            if (r2 != 0) goto La7
            r10 = 0
            android.view.View r10 = r9.getChildAt(r10)
            int r11 = r10.getMeasuredWidth()
            int r12 = r10.getMeasuredHeight()
            int r13 = r13 / 2
            int r0 = r11 / 2
            int r13 = r13 - r0
            int r0 = r12 / 2
            int r14 = r14 - r0
            int r11 = r11 + r13
            int r12 = r12 + r14
            r10.layout(r13, r14, r11, r12)
            return
        La7:
            r12 = r2 ^ 1
            int r3 = r3 - r12
            if (r3 <= 0) goto Lae
            int r11 = r11 / r3
            goto Laf
        Lae:
            r11 = 0
        Laf:
            r12 = 0
            int r11 = java.lang.Math.max(r12, r11)
            if (r0 == 0) goto Lf4
            int r12 = r9.getWidth()
            int r13 = r9.getPaddingRight()
            int r12 = r12 - r13
            r13 = 0
        Lc0:
            if (r13 >= r10) goto L12e
            android.view.View r0 = r9.getChildAt(r13)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r1 = (androidx.appcompat.widget.ActionMenuView.C0227c) r1
            int r2 = r0.getVisibility()
            if (r2 == r4) goto Lf1
            boolean r2 = r1.f969a
            if (r2 == 0) goto Ld7
            goto Lf1
        Ld7:
            int r2 = r1.rightMargin
            int r12 = r12 - r2
            int r2 = r0.getMeasuredWidth()
            int r3 = r0.getMeasuredHeight()
            int r5 = r3 / 2
            int r5 = r14 - r5
            int r6 = r12 - r2
            int r3 = r3 + r5
            r0.layout(r6, r5, r12, r3)
            int r0 = r1.leftMargin
            int r2 = r2 + r0
            int r2 = r2 + r11
            int r12 = r12 - r2
        Lf1:
            int r13 = r13 + 1
            goto Lc0
        Lf4:
            int r12 = r9.getPaddingLeft()
            r13 = 0
        Lf9:
            if (r13 >= r10) goto L12e
            android.view.View r0 = r9.getChildAt(r13)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r1 = (androidx.appcompat.widget.ActionMenuView.C0227c) r1
            int r2 = r0.getVisibility()
            if (r2 == r4) goto L12b
            boolean r2 = r1.f969a
            if (r2 == 0) goto L110
            goto L12b
        L110:
            int r2 = r1.leftMargin
            int r12 = r12 + r2
            int r2 = r0.getMeasuredWidth()
            int r3 = r0.getMeasuredHeight()
            int r5 = r3 / 2
            int r5 = r14 - r5
            int r6 = r12 + r2
            int r3 = r3 + r5
            r0.layout(r12, r5, r6, r3)
            int r0 = r1.rightMargin
            int r12 = androidx.appcompat.widget.C0267d.m705a(r2, r0, r11, r12)
        L12b:
            int r13 = r13 + 1
            goto Lf9
        L12e:
            return
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int r30, int r31) {
            r29 = this;
            r0 = r29
            boolean r1 = r0.f965w0
            int r2 = android.view.View.MeasureSpec.getMode(r30)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            r0.f965w0 = r2
            if (r1 == r2) goto L17
            r0.f966x0 = r4
        L17:
            int r1 = android.view.View.MeasureSpec.getSize(r30)
            boolean r2 = r0.f965w0
            if (r2 == 0) goto L2c
            androidx.appcompat.view.menu.e r2 = r0.f958p0
            if (r2 == 0) goto L2c
            int r6 = r0.f966x0
            if (r1 == r6) goto L2c
            r0.f966x0 = r1
            r2.m513p(r5)
        L2c:
            int r1 = r29.getChildCount()
            boolean r2 = r0.f965w0
            if (r2 == 0) goto L292
            if (r1 <= 0) goto L292
            int r1 = android.view.View.MeasureSpec.getMode(r31)
            int r2 = android.view.View.MeasureSpec.getSize(r30)
            int r6 = android.view.View.MeasureSpec.getSize(r31)
            int r7 = r29.getPaddingLeft()
            int r8 = r29.getPaddingRight()
            int r8 = r8 + r7
            int r7 = r29.getPaddingTop()
            int r9 = r29.getPaddingBottom()
            int r9 = r9 + r7
            r7 = -2
            r10 = r31
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r10, r9, r7)
            int r2 = r2 - r8
            int r8 = r0.f967y0
            int r10 = r2 / r8
            int r11 = r2 % r8
            if (r10 != 0) goto L69
            r0.setMeasuredDimension(r2, r4)
            goto L2ac
        L69:
            int r11 = r11 / r10
            int r11 = r11 + r8
            int r8 = r29.getChildCount()
            r3 = 0
            r5 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L77:
            if (r14 >= r8) goto Lf3
            android.view.View r4 = r0.getChildAt(r14)
            r18 = r6
            int r6 = r4.getVisibility()
            r19 = r2
            r2 = 8
            if (r6 != r2) goto L8a
            goto Leb
        L8a:
            boolean r2 = r4 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            int r3 = r3 + 1
            if (r2 == 0) goto L99
            int r6 = r0.f968z0
            r20 = r3
            r3 = 0
            r4.setPadding(r6, r3, r6, r3)
            goto L9c
        L99:
            r20 = r3
            r3 = 0
        L9c:
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r6 = (androidx.appcompat.widget.ActionMenuView.C0227c) r6
            r6.f974f = r3
            r6.f971c = r3
            r6.f970b = r3
            r6.f972d = r3
            r6.leftMargin = r3
            r6.rightMargin = r3
            if (r2 == 0) goto Lbb
            r2 = r4
            androidx.appcompat.view.menu.ActionMenuItemView r2 = (androidx.appcompat.view.menu.ActionMenuItemView) r2
            boolean r2 = r2.m458c()
            if (r2 == 0) goto Lbb
            r2 = 1
            goto Lbc
        Lbb:
            r2 = 0
        Lbc:
            r6.f973e = r2
            boolean r2 = r6.f969a
            if (r2 == 0) goto Lc4
            r2 = 1
            goto Lc5
        Lc4:
            r2 = r10
        Lc5:
            int r2 = m571o(r4, r11, r2, r7, r9)
            int r12 = java.lang.Math.max(r12, r2)
            boolean r3 = r6.f972d
            if (r3 == 0) goto Ld3
            int r13 = r13 + 1
        Ld3:
            boolean r3 = r6.f969a
            if (r3 == 0) goto Ld8
            r15 = 1
        Ld8:
            int r10 = r10 - r2
            int r3 = r4.getMeasuredHeight()
            int r5 = java.lang.Math.max(r5, r3)
            r3 = 1
            if (r2 != r3) goto Le9
            int r2 = r3 << r14
            long r2 = (long) r2
            long r16 = r16 | r2
        Le9:
            r3 = r20
        Leb:
            int r14 = r14 + 1
            r6 = r18
            r2 = r19
            r4 = 0
            goto L77
        Lf3:
            r19 = r2
            r18 = r6
            r2 = 2
            if (r15 == 0) goto Lfe
            if (r3 != r2) goto Lfe
            r4 = 1
            goto Lff
        Lfe:
            r4 = 0
        Lff:
            r6 = 0
        L100:
            r20 = 1
            if (r13 <= 0) goto L19a
            if (r10 <= 0) goto L19a
            r9 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            r14 = 0
            r22 = 0
        L10d:
            if (r2 >= r8) goto L13e
            android.view.View r24 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r24 = r24.getLayoutParams()
            r25 = r5
            r5 = r24
            androidx.appcompat.widget.ActionMenuView$c r5 = (androidx.appcompat.widget.ActionMenuView.C0227c) r5
            r24 = r6
            boolean r6 = r5.f972d
            if (r6 != 0) goto L124
            goto L137
        L124:
            int r5 = r5.f970b
            if (r5 >= r9) goto L12d
            long r22 = r20 << r2
            r9 = r5
            r14 = 1
            goto L137
        L12d:
            if (r5 != r9) goto L137
            long r5 = r20 << r2
            long r5 = r22 | r5
            int r14 = r14 + 1
            r22 = r5
        L137:
            int r2 = r2 + 1
            r6 = r24
            r5 = r25
            goto L10d
        L13e:
            r25 = r5
            r24 = r6
            long r16 = r16 | r22
            if (r14 <= r10) goto L147
            goto L19e
        L147:
            int r9 = r9 + 1
            r2 = 0
        L14a:
            if (r2 >= r8) goto L194
            android.view.View r5 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r6 = (androidx.appcompat.widget.ActionMenuView.C0227c) r6
            r26 = r13
            r14 = 1
            int r13 = r14 << r2
            long r13 = (long) r13
            long r20 = r22 & r13
            r27 = 0
            int r24 = (r20 > r27 ? 1 : (r20 == r27 ? 0 : -1))
            if (r24 != 0) goto L16d
            int r5 = r6.f970b
            if (r5 != r9) goto L16a
            long r16 = r16 | r13
        L16a:
            r27 = r4
            goto L18d
        L16d:
            if (r4 == 0) goto L181
            boolean r13 = r6.f973e
            if (r13 == 0) goto L181
            r13 = 1
            if (r10 != r13) goto L181
            int r14 = r0.f968z0
            int r13 = r14 + r11
            r27 = r4
            r4 = 0
            r5.setPadding(r13, r4, r14, r4)
            goto L183
        L181:
            r27 = r4
        L183:
            int r4 = r6.f970b
            r5 = 1
            int r4 = r4 + r5
            r6.f970b = r4
            r6.f974f = r5
            int r10 = r10 + (-1)
        L18d:
            int r2 = r2 + 1
            r13 = r26
            r4 = r27
            goto L14a
        L194:
            r5 = r25
            r2 = 2
            r6 = 1
            goto L100
        L19a:
            r25 = r5
            r24 = r6
        L19e:
            r2 = 1
            if (r15 != 0) goto L1a5
            if (r3 != r2) goto L1a5
            r4 = 1
            goto L1a6
        L1a5:
            r4 = 0
        L1a6:
            if (r10 <= 0) goto L256
            r5 = 0
            int r9 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r9 == 0) goto L256
            int r3 = r3 - r2
            if (r10 < r3) goto L1b5
            if (r4 != 0) goto L1b5
            if (r12 <= r2) goto L256
        L1b5:
            int r2 = java.lang.Long.bitCount(r16)
            float r2 = (float) r2
            if (r4 != 0) goto L1f3
            long r3 = r16 & r20
            r5 = 1056964608(0x3f000000, float:0.5)
            r12 = 0
            int r6 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r6 == 0) goto L1d6
            r3 = 0
            android.view.View r4 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r3 = (androidx.appcompat.widget.ActionMenuView.C0227c) r3
            boolean r3 = r3.f973e
            if (r3 != 0) goto L1d6
            float r2 = r2 - r5
        L1d6:
            int r3 = r8 + (-1)
            r4 = 1
            int r6 = r4 << r3
            long r12 = (long) r6
            long r12 = r16 & r12
            r14 = 0
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 == 0) goto L1f3
            android.view.View r3 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r3 = (androidx.appcompat.widget.ActionMenuView.C0227c) r3
            boolean r3 = r3.f973e
            if (r3 != 0) goto L1f3
            float r2 = r2 - r5
        L1f3:
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L1fe
            int r10 = r10 * r11
            float r3 = (float) r10
            float r3 = r3 / r2
            int r3 = (int) r3
            goto L1ff
        L1fe:
            r3 = 0
        L1ff:
            r2 = 0
        L200:
            if (r2 >= r8) goto L256
            r4 = 1
            int r5 = r4 << r2
            long r4 = (long) r5
            long r4 = r16 & r4
            r9 = 0
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 != 0) goto L211
            r4 = 1
            r12 = 2
            goto L253
        L211:
            android.view.View r4 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r5 = (androidx.appcompat.widget.ActionMenuView.C0227c) r5
            boolean r4 = r4 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r4 == 0) goto L232
            r5.f971c = r3
            r4 = 1
            r5.f974f = r4
            if (r2 != 0) goto L22f
            boolean r4 = r5.f973e
            if (r4 != 0) goto L22f
            int r4 = -r3
            r6 = 2
            int r4 = r4 / r6
            r5.leftMargin = r4
        L22f:
            r4 = 1
            r12 = 2
            goto L240
        L232:
            boolean r4 = r5.f969a
            if (r4 == 0) goto L243
            r5.f971c = r3
            r4 = 1
            r5.f974f = r4
            int r6 = -r3
            r12 = 2
            int r6 = r6 / r12
            r5.rightMargin = r6
        L240:
            r24 = 1
            goto L253
        L243:
            r4 = 1
            r12 = 2
            if (r2 == 0) goto L24b
            int r6 = r3 / 2
            r5.leftMargin = r6
        L24b:
            int r6 = r8 + (-1)
            if (r2 == r6) goto L253
            int r6 = r3 / 2
            r5.rightMargin = r6
        L253:
            int r2 = r2 + 1
            goto L200
        L256:
            r6 = r24
            if (r6 == 0) goto L281
            r4 = 0
        L25b:
            if (r4 >= r8) goto L281
            android.view.View r2 = r0.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r3 = (androidx.appcompat.widget.ActionMenuView.C0227c) r3
            boolean r5 = r3.f974f
            if (r5 != 0) goto L26e
            r3 = 1073741824(0x40000000, float:2.0)
            goto L27e
        L26e:
            int r5 = r3.f970b
            int r5 = r5 * r11
            int r3 = r3.f971c
            int r5 = r5 + r3
            r3 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r3)
            r2.measure(r5, r7)
        L27e:
            int r4 = r4 + 1
            goto L25b
        L281:
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r3) goto L28a
            r2 = r19
            r6 = r25
            goto L28e
        L28a:
            r6 = r18
            r2 = r19
        L28e:
            r0.setMeasuredDimension(r2, r6)
            goto L2ac
        L292:
            r10 = r31
            r3 = 0
        L295:
            if (r3 >= r1) goto L2a9
            android.view.View r2 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r2 = (androidx.appcompat.widget.ActionMenuView.C0227c) r2
            r4 = 0
            r2.rightMargin = r4
            r2.leftMargin = r4
            int r3 = r3 + 1
            goto L295
        L2a9:
            super.onMeasure(r30, r31)
        L2ac:
            return
    }

    public void setExpandedActionViewsExclusive(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.c r0 = r1.f962t0
            r0.f1232p0 = r2
            return
    }

    public void setOnMenuItemClickListener(androidx.appcompat.widget.ActionMenuView.InterfaceC0229e r1) {
            r0 = this;
            r0.f957A0 = r1
            return
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable r3) {
            r2 = this;
            r2.getMenu()
            androidx.appcompat.widget.c r0 = r2.f962t0
            androidx.appcompat.widget.c$d r1 = r0.f1224h0
            if (r1 == 0) goto Ld
            r1.setImageDrawable(r3)
            goto L12
        Ld:
            r1 = 1
            r0.f1226j0 = r1
            r0.f1225i0 = r3
        L12:
            return
    }

    public void setOverflowReserved(boolean r1) {
            r0 = this;
            r0.f961s0 = r1
            return
    }

    public void setPopupTheme(int r3) {
            r2 = this;
            int r0 = r2.f960r0
            if (r0 == r3) goto L1a
            r2.f960r0 = r3
            if (r3 != 0) goto Lf
            android.content.Context r3 = r2.getContext()
            r2.f959q0 = r3
            goto L1a
        Lf:
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            r2.f959q0 = r0
        L1a:
            return
    }

    public void setPresenter(androidx.appcompat.widget.C0264c r1) {
            r0 = this;
            r0.f962t0 = r1
            r1.f755f0 = r0
            androidx.appcompat.view.menu.e r1 = r1.f750a0
            r0.f958p0 = r1
            return
    }
}
