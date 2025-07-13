package androidx.appcompat.widget;

@android.annotation.SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends android.view.ViewGroup implements androidx.appcompat.widget.InterfaceC0265c0, p227n0.InterfaceC4650i, p227n0.InterfaceC4651j {

    /* renamed from: B0 */
    public static final int[] f926B0 = null;

    /* renamed from: A0 */
    public final p227n0.C4652k f927A0;

    /* renamed from: a0 */
    public int f928a0;

    /* renamed from: b0 */
    public int f929b0;

    /* renamed from: c0 */
    public androidx.appcompat.widget.ContentFrameLayout f930c0;

    /* renamed from: d0 */
    public androidx.appcompat.widget.ActionBarContainer f931d0;

    /* renamed from: e0 */
    public androidx.appcompat.widget.InterfaceC0268d0 f932e0;

    /* renamed from: f0 */
    public android.graphics.drawable.Drawable f933f0;

    /* renamed from: g0 */
    public boolean f934g0;

    /* renamed from: h0 */
    public boolean f935h0;

    /* renamed from: i0 */
    public boolean f936i0;

    /* renamed from: j0 */
    public boolean f937j0;

    /* renamed from: k0 */
    public boolean f938k0;

    /* renamed from: l0 */
    public int f939l0;

    /* renamed from: m0 */
    public int f940m0;

    /* renamed from: n0 */
    public final android.graphics.Rect f941n0;

    /* renamed from: o0 */
    public final android.graphics.Rect f942o0;

    /* renamed from: p0 */
    public final android.graphics.Rect f943p0;

    /* renamed from: q0 */
    public p227n0.C4642a0 f944q0;

    /* renamed from: r0 */
    public p227n0.C4642a0 f945r0;

    /* renamed from: s0 */
    public p227n0.C4642a0 f946s0;

    /* renamed from: t0 */
    public p227n0.C4642a0 f947t0;

    /* renamed from: u0 */
    public androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0223d f948u0;

    /* renamed from: v0 */
    public android.widget.OverScroller f949v0;

    /* renamed from: w0 */
    public android.view.ViewPropertyAnimator f950w0;

    /* renamed from: x0 */
    public final android.animation.AnimatorListenerAdapter f951x0;

    /* renamed from: y0 */
    public final java.lang.Runnable f952y0;

    /* renamed from: z0 */
    public final java.lang.Runnable f953z0;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    public class C0220a extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ androidx.appcompat.widget.ActionBarOverlayLayout f954a;

        public C0220a(androidx.appcompat.widget.ActionBarOverlayLayout r1) {
                r0 = this;
                r0.f954a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r2) {
                r1 = this;
                androidx.appcompat.widget.ActionBarOverlayLayout r2 = r1.f954a
                r0 = 0
                r2.f950w0 = r0
                r0 = 0
                r2.f938k0 = r0
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                androidx.appcompat.widget.ActionBarOverlayLayout r2 = r1.f954a
                r0 = 0
                r2.f950w0 = r0
                r0 = 0
                r2.f938k0 = r0
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    public class RunnableC0221b implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.widget.ActionBarOverlayLayout f955Y;

        public RunnableC0221b(androidx.appcompat.widget.ActionBarOverlayLayout r1) {
                r0 = this;
                r0.f955Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.appcompat.widget.ActionBarOverlayLayout r0 = r3.f955Y
                r0.m568q()
                androidx.appcompat.widget.ActionBarOverlayLayout r0 = r3.f955Y
                androidx.appcompat.widget.ActionBarContainer r1 = r0.f931d0
                android.view.ViewPropertyAnimator r1 = r1.animate()
                r2 = 0
                android.view.ViewPropertyAnimator r1 = r1.translationY(r2)
                androidx.appcompat.widget.ActionBarOverlayLayout r2 = r3.f955Y
                android.animation.AnimatorListenerAdapter r2 = r2.f951x0
                android.view.ViewPropertyAnimator r1 = r1.setListener(r2)
                r0.f950w0 = r1
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    public class RunnableC0222c implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.widget.ActionBarOverlayLayout f956Y;

        public RunnableC0222c(androidx.appcompat.widget.ActionBarOverlayLayout r1) {
                r0 = this;
                r0.f956Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.appcompat.widget.ActionBarOverlayLayout r0 = r3.f956Y
                r0.m568q()
                androidx.appcompat.widget.ActionBarOverlayLayout r0 = r3.f956Y
                androidx.appcompat.widget.ActionBarContainer r1 = r0.f931d0
                android.view.ViewPropertyAnimator r1 = r1.animate()
                androidx.appcompat.widget.ActionBarOverlayLayout r2 = r3.f956Y
                androidx.appcompat.widget.ActionBarContainer r2 = r2.f931d0
                int r2 = r2.getHeight()
                int r2 = -r2
                float r2 = (float) r2
                android.view.ViewPropertyAnimator r1 = r1.translationY(r2)
                androidx.appcompat.widget.ActionBarOverlayLayout r2 = r3.f956Y
                android.animation.AnimatorListenerAdapter r2 = r2.f951x0
                android.view.ViewPropertyAnimator r1 = r1.setListener(r2)
                r0.f950w0 = r1
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface InterfaceC0223d {
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0224e extends android.view.ViewGroup.MarginLayoutParams {
        public C0224e(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public C0224e(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public C0224e(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    static {
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [2130968580, 16842841} // fill-array
            androidx.appcompat.widget.ActionBarOverlayLayout.f926B0 = r0
            return
    }

    public ActionBarOverlayLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r2 = 0
            r0.f929b0 = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f941n0 = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f942o0 = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f943p0 = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            n0.a0 r2 = p227n0.C4642a0.f18505b
            r0.f944q0 = r2
            r0.f945r0 = r2
            r0.f946s0 = r2
            r0.f947t0 = r2
            androidx.appcompat.widget.ActionBarOverlayLayout$a r2 = new androidx.appcompat.widget.ActionBarOverlayLayout$a
            r2.<init>(r0)
            r0.f951x0 = r2
            androidx.appcompat.widget.ActionBarOverlayLayout$b r2 = new androidx.appcompat.widget.ActionBarOverlayLayout$b
            r2.<init>(r0)
            r0.f952y0 = r2
            androidx.appcompat.widget.ActionBarOverlayLayout$c r2 = new androidx.appcompat.widget.ActionBarOverlayLayout$c
            r2.<init>(r0)
            r0.f953z0 = r2
            r0.m569r(r1)
            n0.k r1 = new n0.k
            r1.<init>()
            r0.f927A0 = r1
            return
    }

    @Override // androidx.appcompat.widget.InterfaceC0265c0
    /* renamed from: a */
    public void mo552a(android.view.Menu r2, androidx.appcompat.view.menu.InterfaceC0215i.a r3) {
            r1 = this;
            r1.m570s()
            androidx.appcompat.widget.d0 r0 = r1.f932e0
            r0.mo668a(r2, r3)
            return
    }

    @Override // androidx.appcompat.widget.InterfaceC0265c0
    /* renamed from: b */
    public boolean mo553b() {
            r1 = this;
            r1.m570s()
            androidx.appcompat.widget.d0 r0 = r1.f932e0
            boolean r0 = r0.mo669b()
            return r0
    }

    @Override // p227n0.InterfaceC4650i
    /* renamed from: c */
    public void mo554c(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            if (r4 != 0) goto L5
            r0.onNestedScrollAccepted(r1, r2, r3)
        L5:
            return
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.appcompat.widget.ActionBarOverlayLayout.C0224e
            return r1
    }

    @Override // androidx.appcompat.widget.InterfaceC0265c0
    /* renamed from: d */
    public void mo555d() {
            r1 = this;
            r1.m570s()
            androidx.appcompat.widget.d0 r0 = r1.f932e0
            r0.mo671d()
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r6) {
            r5 = this;
            super.draw(r6)
            android.graphics.drawable.Drawable r0 = r5.f933f0
            if (r0 == 0) goto L3d
            boolean r0 = r5.f934g0
            if (r0 != 0) goto L3d
            androidx.appcompat.widget.ActionBarContainer r0 = r5.f931d0
            int r0 = r0.getVisibility()
            r1 = 0
            if (r0 != 0) goto L27
            androidx.appcompat.widget.ActionBarContainer r0 = r5.f931d0
            int r0 = r0.getBottom()
            float r0 = (float) r0
            androidx.appcompat.widget.ActionBarContainer r2 = r5.f931d0
            float r2 = r2.getTranslationY()
            float r2 = r2 + r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r0 = (int) r2
            goto L28
        L27:
            r0 = 0
        L28:
            android.graphics.drawable.Drawable r2 = r5.f933f0
            int r3 = r5.getWidth()
            android.graphics.drawable.Drawable r4 = r5.f933f0
            int r4 = r4.getIntrinsicHeight()
            int r4 = r4 + r0
            r2.setBounds(r1, r0, r3, r4)
            android.graphics.drawable.Drawable r0 = r5.f933f0
            r0.draw(r6)
        L3d:
            return
    }

    @Override // androidx.appcompat.widget.InterfaceC0265c0
    /* renamed from: e */
    public boolean mo556e() {
            r1 = this;
            r1.m570s()
            androidx.appcompat.widget.d0 r0 = r1.f932e0
            boolean r0 = r0.mo672e()
            return r0
    }

    @Override // androidx.appcompat.widget.InterfaceC0265c0
    /* renamed from: f */
    public boolean mo557f() {
            r1 = this;
            r1.m570s()
            androidx.appcompat.widget.d0 r0 = r1.f932e0
            boolean r0 = r0.mo673f()
            return r0
    }

    @Override // android.view.View
    public boolean fitSystemWindows(android.graphics.Rect r1) {
            r0 = this;
            boolean r1 = super.fitSystemWindows(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.InterfaceC0265c0
    /* renamed from: g */
    public boolean mo558g() {
            r1 = this;
            r1.m570s()
            androidx.appcompat.widget.d0 r0 = r1.f932e0
            boolean r0 = r0.mo674g()
            return r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$e
            r1 = -1
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$e
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$e
            r0.<init>(r2)
            return r0
    }

    public int getActionBarHideOffset() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r1.f931d0
            if (r0 == 0) goto Lb
            float r0 = r0.getTranslationY()
            int r0 = (int) r0
            int r0 = -r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
            r1 = this;
            n0.k r0 = r1.f927A0
            int r0 = r0.m10516a()
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            r1.m570s()
            androidx.appcompat.widget.d0 r0 = r1.f932e0
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // androidx.appcompat.widget.InterfaceC0265c0
    /* renamed from: h */
    public boolean mo559h() {
            r1 = this;
            r1.m570s()
            androidx.appcompat.widget.d0 r0 = r1.f932e0
            boolean r0 = r0.mo675h()
            return r0
    }

    @Override // p227n0.InterfaceC4650i
    /* renamed from: i */
    public void mo560i(android.view.View r1, int r2) {
            r0 = this;
            if (r2 != 0) goto L5
            r0.onStopNestedScroll(r1)
        L5:
            return
    }

    @Override // p227n0.InterfaceC4650i
    /* renamed from: j */
    public void mo561j(android.view.View r1, int r2, int r3, int[] r4, int r5) {
            r0 = this;
            if (r5 != 0) goto L5
            r0.onNestedPreScroll(r1, r2, r3, r4)
        L5:
            return
    }

    @Override // androidx.appcompat.widget.InterfaceC0265c0
    /* renamed from: k */
    public void mo562k(int r2) {
            r1 = this;
            r1.m570s()
            r0 = 2
            if (r2 == r0) goto L19
            r0 = 5
            if (r2 == r0) goto L13
            r0 = 109(0x6d, float:1.53E-43)
            if (r2 == r0) goto Le
            goto L1e
        Le:
            r2 = 1
            r1.setOverlayMode(r2)
            goto L1e
        L13:
            androidx.appcompat.widget.d0 r2 = r1.f932e0
            r2.mo688u()
            goto L1e
        L19:
            androidx.appcompat.widget.d0 r2 = r1.f932e0
            r2.mo687t()
        L1e:
            return
    }

    @Override // androidx.appcompat.widget.InterfaceC0265c0
    /* renamed from: l */
    public void mo563l() {
            r1 = this;
            r1.m570s()
            androidx.appcompat.widget.d0 r0 = r1.f932e0
            r0.mo676i()
            return
    }

    @Override // p227n0.InterfaceC4651j
    /* renamed from: m */
    public void mo564m(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
            r0 = this;
            if (r6 != 0) goto L5
            r0.onNestedScroll(r1, r2, r3, r4, r5)
        L5:
            return
    }

    @Override // p227n0.InterfaceC4650i
    /* renamed from: n */
    public void mo565n(android.view.View r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            if (r6 != 0) goto L5
            r0.onNestedScroll(r1, r2, r3, r4, r5)
        L5:
            return
    }

    @Override // p227n0.InterfaceC4650i
    /* renamed from: o */
    public boolean mo566o(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            if (r4 != 0) goto La
            boolean r1 = r0.onStartNestedScroll(r1, r2, r3)
            if (r1 == 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    @Override // android.view.View
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r8) {
            r7 = this;
            r7.m570s()
            n0.a0 r8 = p227n0.C4642a0.m10464i(r8, r7)
            android.graphics.Rect r2 = new android.graphics.Rect
            int r0 = r8.m10466b()
            int r1 = r8.m10468d()
            int r3 = r8.m10467c()
            int r4 = r8.m10465a()
            r2.<init>(r0, r1, r3, r4)
            androidx.appcompat.widget.ActionBarContainer r1 = r7.f931d0
            r3 = 1
            r4 = 1
            r5 = 0
            r6 = 1
            r0 = r7
            boolean r0 = r0.m567p(r1, r2, r3, r4, r5, r6)
            android.graphics.Rect r1 = r7.f941n0
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            p227n0.C4661t.h.m10597b(r7, r8, r1)
            android.graphics.Rect r1 = r7.f941n0
            int r2 = r1.left
            int r3 = r1.top
            int r4 = r1.right
            int r1 = r1.bottom
            n0.a0$k r5 = r8.f18506a
            n0.a0 r1 = r5.mo10479i(r2, r3, r4, r1)
            r7.f944q0 = r1
            n0.a0 r2 = r7.f945r0
            boolean r1 = r2.equals(r1)
            r2 = 1
            if (r1 != 0) goto L4e
            n0.a0 r0 = r7.f944q0
            r7.f945r0 = r0
            r0 = 1
        L4e:
            android.graphics.Rect r1 = r7.f942o0
            android.graphics.Rect r3 = r7.f941n0
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L60
            android.graphics.Rect r0 = r7.f942o0
            android.graphics.Rect r1 = r7.f941n0
            r0.set(r1)
            goto L61
        L60:
            r2 = r0
        L61:
            if (r2 == 0) goto L66
            r7.requestLayout()
        L66:
            n0.a0$k r8 = r8.f18506a
            n0.a0 r8 = r8.mo10490a()
            n0.a0$k r8 = r8.f18506a
            n0.a0 r8 = r8.mo10486c()
            n0.a0$k r8 = r8.f18506a
            n0.a0 r8 = r8.mo10485b()
            android.view.WindowInsets r8 = r8.m10470g()
            return r8
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            android.content.Context r1 = r0.getContext()
            r0.m569r(r1)
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            p227n0.C4661t.g.m10595c(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.m568q()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            int r5 = r4.getChildCount()
            int r6 = r4.getPaddingLeft()
            int r7 = r4.getPaddingTop()
            r8 = 0
        Ld:
            if (r8 >= r5) goto L37
            android.view.View r9 = r4.getChildAt(r8)
            int r0 = r9.getVisibility()
            r1 = 8
            if (r0 == r1) goto L34
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0224e) r0
            int r1 = r9.getMeasuredWidth()
            int r2 = r9.getMeasuredHeight()
            int r3 = r0.leftMargin
            int r3 = r3 + r6
            int r0 = r0.topMargin
            int r0 = r0 + r7
            int r1 = r1 + r3
            int r2 = r2 + r0
            r9.layout(r3, r0, r1, r2)
        L34:
            int r8 = r8 + 1
            goto Ld
        L37:
            return
    }

    @Override // android.view.View
    public void onMeasure(int r12, int r13) {
            r11 = this;
            r11.m570s()
            androidx.appcompat.widget.ActionBarContainer r1 = r11.f931d0
            r3 = 0
            r5 = 0
            r0 = r11
            r2 = r12
            r4 = r13
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionBarContainer r0 = r11.f931d0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0224e) r0
            androidx.appcompat.widget.ActionBarContainer r1 = r11.f931d0
            int r1 = r1.getMeasuredWidth()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            androidx.appcompat.widget.ActionBarContainer r3 = r11.f931d0
            int r3 = r3.getMeasuredHeight()
            int r4 = r0.topMargin
            int r3 = r3 + r4
            int r0 = r0.bottomMargin
            int r3 = r3 + r0
            int r0 = java.lang.Math.max(r2, r3)
            androidx.appcompat.widget.ActionBarContainer r3 = r11.f931d0
            int r3 = r3.getMeasuredState()
            int r3 = android.view.View.combineMeasuredStates(r2, r3)
            java.util.WeakHashMap<android.view.View, n0.w> r4 = p227n0.C4661t.f18570a
            int r4 = p227n0.C4661t.c.m10559g(r11)
            r4 = r4 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L4c
            r4 = 1
            goto L4d
        L4c:
            r4 = 0
        L4d:
            if (r4 == 0) goto L61
            int r5 = r11.f928a0
            boolean r6 = r11.f936i0
            if (r6 == 0) goto L73
            androidx.appcompat.widget.ActionBarContainer r6 = r11.f931d0
            android.view.View r6 = r6.getTabContainer()
            if (r6 == 0) goto L73
            int r6 = r11.f928a0
            int r5 = r5 + r6
            goto L73
        L61:
            androidx.appcompat.widget.ActionBarContainer r5 = r11.f931d0
            int r5 = r5.getVisibility()
            r6 = 8
            if (r5 == r6) goto L72
            androidx.appcompat.widget.ActionBarContainer r5 = r11.f931d0
            int r5 = r5.getMeasuredHeight()
            goto L73
        L72:
            r5 = 0
        L73:
            android.graphics.Rect r6 = r11.f943p0
            android.graphics.Rect r7 = r11.f941n0
            r6.set(r7)
            n0.a0 r6 = r11.f944q0
            r11.f946s0 = r6
            boolean r7 = r11.f935h0
            if (r7 != 0) goto L97
            if (r4 != 0) goto L97
            android.graphics.Rect r4 = r11.f943p0
            int r7 = r4.top
            int r7 = r7 + r5
            r4.top = r7
            int r7 = r4.bottom
            int r7 = r7 + r2
            r4.bottom = r7
            n0.a0$k r4 = r6.f18506a
            n0.a0 r2 = r4.mo10479i(r2, r5, r2, r2)
            goto Ld7
        L97:
            int r4 = r6.m10466b()
            n0.a0 r6 = r11.f946s0
            int r6 = r6.m10468d()
            int r6 = r6 + r5
            n0.a0 r5 = r11.f946s0
            int r5 = r5.m10467c()
            n0.a0 r7 = r11.f946s0
            int r7 = r7.m10465a()
            int r7 = r7 + r2
            f0.c r2 = p084f0.C1940c.m4827a(r4, r6, r5, r7)
            n0.a0 r4 = r11.f946s0
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 30
            if (r5 < r6) goto Lc1
            n0.a0$d r5 = new n0.a0$d
            r5.<init>(r4)
            goto Ld0
        Lc1:
            r6 = 29
            if (r5 < r6) goto Lcb
            n0.a0$c r5 = new n0.a0$c
            r5.<init>(r4)
            goto Ld0
        Lcb:
            n0.a0$b r5 = new n0.a0$b
            r5.<init>(r4)
        Ld0:
            r5.mo10474d(r2)
            n0.a0 r2 = r5.mo10472b()
        Ld7:
            r11.f946s0 = r2
            androidx.appcompat.widget.ContentFrameLayout r5 = r11.f930c0
            android.graphics.Rect r6 = r11.f943p0
            r7 = 1
            r8 = 1
            r9 = 1
            r10 = 1
            r4 = r11
            r4.m567p(r5, r6, r7, r8, r9, r10)
            n0.a0 r2 = r11.f947t0
            n0.a0 r4 = r11.f946s0
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto Lf8
            n0.a0 r2 = r11.f946s0
            r11.f947t0 = r2
            androidx.appcompat.widget.ContentFrameLayout r4 = r11.f930c0
            p227n0.C4661t.m10529e(r4, r2)
        Lf8:
            androidx.appcompat.widget.ContentFrameLayout r6 = r11.f930c0
            r8 = 0
            r10 = 0
            r5 = r11
            r7 = r12
            r9 = r13
            r5.measureChildWithMargins(r6, r7, r8, r9, r10)
            androidx.appcompat.widget.ContentFrameLayout r2 = r11.f930c0
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r2 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0224e) r2
            androidx.appcompat.widget.ContentFrameLayout r4 = r11.f930c0
            int r4 = r4.getMeasuredWidth()
            int r5 = r2.leftMargin
            int r4 = r4 + r5
            int r5 = r2.rightMargin
            int r4 = r4 + r5
            int r1 = java.lang.Math.max(r1, r4)
            androidx.appcompat.widget.ContentFrameLayout r4 = r11.f930c0
            int r4 = r4.getMeasuredHeight()
            int r5 = r2.topMargin
            int r4 = r4 + r5
            int r2 = r2.bottomMargin
            int r4 = r4 + r2
            int r0 = java.lang.Math.max(r0, r4)
            androidx.appcompat.widget.ContentFrameLayout r2 = r11.f930c0
            int r2 = r2.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r3, r2)
            int r3 = r11.getPaddingLeft()
            int r4 = r11.getPaddingRight()
            int r4 = r4 + r3
            int r4 = r4 + r1
            int r1 = r11.getPaddingTop()
            int r3 = r11.getPaddingBottom()
            int r3 = r3 + r1
            int r3 = r3 + r0
            int r0 = r11.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r3, r0)
            int r1 = r11.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r4, r1)
            int r12 = android.view.View.resolveSizeAndState(r1, r12, r2)
            int r1 = r2 << 16
            int r13 = android.view.View.resolveSizeAndState(r0, r13, r1)
            r11.setMeasuredDimension(r12, r13)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(android.view.View r10, float r11, float r12, boolean r13) {
            r9 = this;
            boolean r10 = r9.f937j0
            r11 = 0
            if (r10 == 0) goto L3e
            if (r13 != 0) goto L8
            goto L3e
        L8:
            android.widget.OverScroller r0 = r9.f949v0
            int r4 = (int) r12
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r0.fling(r1, r2, r3, r4, r5, r6, r7, r8)
            android.widget.OverScroller r10 = r9.f949v0
            int r10 = r10.getFinalY()
            androidx.appcompat.widget.ActionBarContainer r12 = r9.f931d0
            int r12 = r12.getHeight()
            r13 = 1
            if (r10 <= r12) goto L28
            r11 = 1
        L28:
            if (r11 == 0) goto L33
            r9.m568q()
            java.lang.Runnable r10 = r9.f953z0
            r10.run()
            goto L3b
        L33:
            r9.m568q()
            java.lang.Runnable r10 = r9.f952y0
            r10.run()
        L3b:
            r9.f938k0 = r13
            return r13
        L3e:
            return r11
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(android.view.View r1, float r2, float r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(android.view.View r1, int r2, int r3, int[] r4) {
            r0 = this;
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            int r1 = r0.f939l0
            int r1 = r1 + r3
            r0.f939l0 = r1
            r0.setActionBarHideOffset(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
            r0 = this;
            n0.k r1 = r0.f927A0
            r1.f18563a = r3
            int r1 = r0.getActionBarHideOffset()
            r0.f939l0 = r1
            r0.m568q()
            androidx.appcompat.widget.ActionBarOverlayLayout$d r1 = r0.f948u0
            if (r1 == 0) goto L1d
            f.x r1 = (p083f.C1937x) r1
            k.g r2 = r1.f8465t
            if (r2 == 0) goto L1d
            r2.m8069a()
            r2 = 0
            r1.f8465t = r2
        L1d:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(android.view.View r1, android.view.View r2, int r3) {
            r0 = this;
            r1 = r3 & 2
            if (r1 == 0) goto L10
            androidx.appcompat.widget.ActionBarContainer r1 = r0.f931d0
            int r1 = r1.getVisibility()
            if (r1 == 0) goto Ld
            goto L10
        Ld:
            boolean r1 = r0.f937j0
            return r1
        L10:
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(android.view.View r4) {
            r3 = this;
            boolean r4 = r3.f937j0
            if (r4 == 0) goto L25
            boolean r4 = r3.f938k0
            if (r4 != 0) goto L25
            int r4 = r3.f939l0
            androidx.appcompat.widget.ActionBarContainer r0 = r3.f931d0
            int r0 = r0.getHeight()
            r1 = 600(0x258, double:2.964E-321)
            if (r4 > r0) goto L1d
            r3.m568q()
            java.lang.Runnable r4 = r3.f952y0
            r3.postDelayed(r4, r1)
            goto L25
        L1d:
            r3.m568q()
            java.lang.Runnable r4 = r3.f953z0
            r3.postDelayed(r4, r1)
        L25:
            androidx.appcompat.widget.ActionBarOverlayLayout$d r4 = r3.f948u0
            if (r4 == 0) goto L2c
            java.util.Objects.requireNonNull(r4)
        L2c:
            return
    }

    @Override // android.view.View
    @java.lang.Deprecated
    public void onWindowSystemUiVisibilityChanged(int r8) {
            r7 = this;
            super.onWindowSystemUiVisibilityChanged(r8)
            r7.m570s()
            int r0 = r7.f940m0
            r0 = r0 ^ r8
            r7.f940m0 = r8
            r1 = r8 & 4
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            r8 = r8 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L1a
            r8 = 1
            goto L1b
        L1a:
            r8 = 0
        L1b:
            androidx.appcompat.widget.ActionBarOverlayLayout$d r4 = r7.f948u0
            if (r4 == 0) goto L42
            r5 = r8 ^ 1
            r6 = r4
            f.x r6 = (p083f.C1937x) r6
            r6.f8461p = r5
            if (r1 != 0) goto L37
            if (r8 != 0) goto L2b
            goto L37
        L2b:
            f.x r4 = (p083f.C1937x) r4
            boolean r8 = r4.f8462q
            if (r8 != 0) goto L42
            r4.f8462q = r3
            r4.m4801g(r3)
            goto L42
        L37:
            f.x r4 = (p083f.C1937x) r4
            boolean r8 = r4.f8462q
            if (r8 == 0) goto L42
            r4.f8462q = r2
            r4.m4801g(r3)
        L42:
            r8 = r0 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L4f
            androidx.appcompat.widget.ActionBarOverlayLayout$d r8 = r7.f948u0
            if (r8 == 0) goto L4f
            java.util.WeakHashMap<android.view.View, n0.w> r8 = p227n0.C4661t.f18570a
            p227n0.C4661t.g.m10595c(r7)
        L4f:
            return
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int r2) {
            r1 = this;
            super.onWindowVisibilityChanged(r2)
            r1.f929b0 = r2
            androidx.appcompat.widget.ActionBarOverlayLayout$d r0 = r1.f948u0
            if (r0 == 0) goto Ld
            f.x r0 = (p083f.C1937x) r0
            r0.f8460o = r2
        Ld:
            return
    }

    /* renamed from: p */
    public final boolean m567p(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0224e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
    }

    /* renamed from: q */
    public void m568q() {
            r1 = this;
            java.lang.Runnable r0 = r1.f952y0
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.f953z0
            r1.removeCallbacks(r0)
            android.view.ViewPropertyAnimator r0 = r1.f950w0
            if (r0 == 0) goto L11
            r0.cancel()
        L11:
            return
    }

    /* renamed from: r */
    public final void m569r(android.content.Context r5) {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int[] r1 = androidx.appcompat.widget.ActionBarOverlayLayout.f926B0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            r1 = 0
            int r2 = r0.getDimensionPixelSize(r1, r1)
            r4.f928a0 = r2
            r2 = 1
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r2)
            r4.f933f0 = r3
            if (r3 != 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            r4.setWillNotDraw(r3)
            r0.recycle()
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            r3 = 19
            if (r0 >= r3) goto L32
            r1 = 1
        L32:
            r4.f934g0 = r1
            android.widget.OverScroller r0 = new android.widget.OverScroller
            r0.<init>(r5)
            r4.f949v0 = r0
            return
    }

    /* renamed from: s */
    public void m570s() {
            r3 = this;
            androidx.appcompat.widget.ContentFrameLayout r0 = r3.f930c0
            if (r0 != 0) goto L50
            r0 = 2131361851(0x7f0a003b, float:1.8343466E38)
            android.view.View r0 = r3.findViewById(r0)
            androidx.appcompat.widget.ContentFrameLayout r0 = (androidx.appcompat.widget.ContentFrameLayout) r0
            r3.f930c0 = r0
            r0 = 2131361852(0x7f0a003c, float:1.8343468E38)
            android.view.View r0 = r3.findViewById(r0)
            androidx.appcompat.widget.ActionBarContainer r0 = (androidx.appcompat.widget.ActionBarContainer) r0
            r3.f931d0 = r0
            r0 = 2131361850(0x7f0a003a, float:1.8343464E38)
            android.view.View r0 = r3.findViewById(r0)
            boolean r1 = r0 instanceof androidx.appcompat.widget.InterfaceC0268d0
            if (r1 == 0) goto L28
            androidx.appcompat.widget.d0 r0 = (androidx.appcompat.widget.InterfaceC0268d0) r0
            goto L32
        L28:
            boolean r1 = r0 instanceof androidx.appcompat.widget.Toolbar
            if (r1 == 0) goto L35
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            androidx.appcompat.widget.d0 r0 = r0.getWrapper()
        L32:
            r3.f932e0 = r0
            goto L50
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Can't make a decor toolbar out of "
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L50:
            return
    }

    public void setActionBarHideOffset(int r2) {
            r1 = this;
            r1.m568q()
            androidx.appcompat.widget.ActionBarContainer r0 = r1.f931d0
            int r0 = r0.getHeight()
            int r2 = java.lang.Math.min(r2, r0)
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            androidx.appcompat.widget.ActionBarContainer r0 = r1.f931d0
            int r2 = -r2
            float r2 = (float) r2
            r0.setTranslationY(r2)
            return
    }

    public void setActionBarVisibilityCallback(androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0223d r2) {
            r1 = this;
            r1.f948u0 = r2
            android.os.IBinder r2 = r1.getWindowToken()
            if (r2 == 0) goto L1c
            androidx.appcompat.widget.ActionBarOverlayLayout$d r2 = r1.f948u0
            int r0 = r1.f929b0
            f.x r2 = (p083f.C1937x) r2
            r2.f8460o = r0
            int r2 = r1.f940m0
            if (r2 == 0) goto L1c
            r1.onWindowSystemUiVisibilityChanged(r2)
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            p227n0.C4661t.g.m10595c(r1)
        L1c:
            return
    }

    public void setHasNonEmbeddedTabs(boolean r1) {
            r0 = this;
            r0.f936i0 = r1
            return
    }

    public void setHideOnContentScrollEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.f937j0
            if (r2 == r0) goto Lf
            r1.f937j0 = r2
            if (r2 != 0) goto Lf
            r1.m568q()
            r2 = 0
            r1.setActionBarHideOffset(r2)
        Lf:
            return
    }

    public void setIcon(int r2) {
            r1 = this;
            r1.m570s()
            androidx.appcompat.widget.d0 r0 = r1.f932e0
            r0.setIcon(r2)
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.m570s()
            androidx.appcompat.widget.d0 r0 = r1.f932e0
            r0.setIcon(r2)
            return
    }

    public void setLogo(int r2) {
            r1 = this;
            r1.m570s()
            androidx.appcompat.widget.d0 r0 = r1.f932e0
            r0.mo684q(r2)
            return
    }

    public void setOverlayMode(boolean r2) {
            r1 = this;
            r1.f935h0 = r2
            if (r2 == 0) goto L14
            android.content.Context r2 = r1.getContext()
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            int r2 = r2.targetSdkVersion
            r0 = 19
            if (r2 >= r0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            r1.f934g0 = r2
            return
    }

    public void setShowingForActionMode(boolean r1) {
            r0 = this;
            return
    }

    public void setUiOptions(int r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.widget.InterfaceC0265c0
    public void setWindowCallback(android.view.Window.Callback r2) {
            r1 = this;
            r1.m570s()
            androidx.appcompat.widget.d0 r0 = r1.f932e0
            r0.setWindowCallback(r2)
            return
    }

    @Override // androidx.appcompat.widget.InterfaceC0265c0
    public void setWindowTitle(java.lang.CharSequence r2) {
            r1 = this;
            r1.m570s()
            androidx.appcompat.widget.d0 r0 = r1.f932e0
            r0.setWindowTitle(r2)
            return
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }
}
