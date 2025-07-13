package androidx.core.widget;

/* loaded from: classes.dex */
public class NestedScrollView extends android.widget.FrameLayout implements p227n0.InterfaceC4651j, p227n0.InterfaceC4648g {

    /* renamed from: A0 */
    public static final androidx.core.widget.NestedScrollView.C0346a f1966A0 = null;

    /* renamed from: B0 */
    public static final int[] f1967B0 = null;

    /* renamed from: a0 */
    public long f1968a0;

    /* renamed from: b0 */
    public final android.graphics.Rect f1969b0;

    /* renamed from: c0 */
    public android.widget.OverScroller f1970c0;

    /* renamed from: d0 */
    public android.widget.EdgeEffect f1971d0;

    /* renamed from: e0 */
    public android.widget.EdgeEffect f1972e0;

    /* renamed from: f0 */
    public int f1973f0;

    /* renamed from: g0 */
    public boolean f1974g0;

    /* renamed from: h0 */
    public boolean f1975h0;

    /* renamed from: i0 */
    public android.view.View f1976i0;

    /* renamed from: j0 */
    public boolean f1977j0;

    /* renamed from: k0 */
    public android.view.VelocityTracker f1978k0;

    /* renamed from: l0 */
    public boolean f1979l0;

    /* renamed from: m0 */
    public boolean f1980m0;

    /* renamed from: n0 */
    public int f1981n0;

    /* renamed from: o0 */
    public int f1982o0;

    /* renamed from: p0 */
    public int f1983p0;

    /* renamed from: q0 */
    public int f1984q0;

    /* renamed from: r0 */
    public final int[] f1985r0;

    /* renamed from: s0 */
    public final int[] f1986s0;

    /* renamed from: t0 */
    public int f1987t0;

    /* renamed from: u0 */
    public int f1988u0;

    /* renamed from: v0 */
    public androidx.core.widget.NestedScrollView.C0348c f1989v0;

    /* renamed from: w0 */
    public final p227n0.C4652k f1990w0;

    /* renamed from: x0 */
    public final p227n0.C4649h f1991x0;

    /* renamed from: y0 */
    public float f1992y0;

    /* renamed from: z0 */
    public androidx.core.widget.NestedScrollView.InterfaceC0347b f1993z0;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    public static class C0346a extends p227n0.C4641a {
        public C0346a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p227n0.C4641a
        /* renamed from: c */
        public void mo1039c(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                android.view.View$AccessibilityDelegate r0 = r1.f18502a
                r0.onInitializeAccessibilityEvent(r2, r3)
                androidx.core.widget.NestedScrollView r2 = (androidx.core.widget.NestedScrollView) r2
                java.lang.Class<android.widget.ScrollView> r0 = android.widget.ScrollView.class
                java.lang.String r0 = r0.getName()
                r3.setClassName(r0)
                int r0 = r2.getScrollRange()
                if (r0 <= 0) goto L18
                r0 = 1
                goto L19
            L18:
                r0 = 0
            L19:
                r3.setScrollable(r0)
                int r0 = r2.getScrollX()
                r3.setScrollX(r0)
                int r0 = r2.getScrollY()
                r3.setScrollY(r0)
                int r0 = r2.getScrollX()
                r3.setMaxScrollX(r0)
                int r2 = r2.getScrollRange()
                r3.setMaxScrollY(r2)
                return
        }

        @Override // p227n0.C4641a
        /* renamed from: d */
        public void mo1040d(android.view.View r4, p242o0.C4868b r5) {
                r3 = this;
                android.view.View$AccessibilityDelegate r0 = r3.f18502a
                android.view.accessibility.AccessibilityNodeInfo r1 = r5.f19337a
                r0.onInitializeAccessibilityNodeInfo(r4, r1)
                androidx.core.widget.NestedScrollView r4 = (androidx.core.widget.NestedScrollView) r4
                java.lang.Class<android.widget.ScrollView> r0 = android.widget.ScrollView.class
                java.lang.String r0 = r0.getName()
                android.view.accessibility.AccessibilityNodeInfo r1 = r5.f19337a
                r1.setClassName(r0)
                boolean r0 = r4.isEnabled()
                if (r0 == 0) goto L46
                int r0 = r4.getScrollRange()
                if (r0 <= 0) goto L46
                r1 = 1
                android.view.accessibility.AccessibilityNodeInfo r2 = r5.f19337a
                r2.setScrollable(r1)
                int r1 = r4.getScrollY()
                if (r1 <= 0) goto L36
                o0.b$a r1 = p242o0.C4868b.a.f19342g
                r5.m10990a(r1)
                o0.b$a r1 = p242o0.C4868b.a.f19346k
                r5.m10990a(r1)
            L36:
                int r4 = r4.getScrollY()
                if (r4 >= r0) goto L46
                o0.b$a r4 = p242o0.C4868b.a.f19341f
                r5.m10990a(r4)
                o0.b$a r4 = p242o0.C4868b.a.f19347l
                r5.m10990a(r4)
            L46:
                return
        }

        @Override // p227n0.C4641a
        /* renamed from: g */
        public boolean mo1041g(android.view.View r4, int r5, android.os.Bundle r6) {
                r3 = this;
                boolean r6 = super.mo1041g(r4, r5, r6)
                r0 = 1
                if (r6 == 0) goto L8
                return r0
            L8:
                androidx.core.widget.NestedScrollView r4 = (androidx.core.widget.NestedScrollView) r4
                boolean r6 = r4.isEnabled()
                r1 = 0
                if (r6 != 0) goto L12
                return r1
            L12:
                r6 = 4096(0x1000, float:5.74E-42)
                r2 = 250(0xfa, float:3.5E-43)
                if (r5 == r6) goto L53
                r6 = 8192(0x2000, float:1.148E-41)
                if (r5 == r6) goto L27
                r6 = 16908344(0x1020038, float:2.3877386E-38)
                if (r5 == r6) goto L27
                r6 = 16908346(0x102003a, float:2.3877392E-38)
                if (r5 == r6) goto L53
                return r1
            L27:
                int r5 = r4.getHeight()
                int r6 = r4.getPaddingBottom()
                int r5 = r5 - r6
                int r6 = r4.getPaddingTop()
                int r5 = r5 - r6
                int r6 = r4.getScrollY()
                int r6 = r6 - r5
                int r5 = java.lang.Math.max(r6, r1)
                int r6 = r4.getScrollY()
                if (r5 == r6) goto L52
            L44:
                int r6 = r4.getScrollX()
                int r1 = r1 - r6
                int r6 = r4.getScrollY()
                int r5 = r5 - r6
                r4.m1038z(r1, r5, r2, r0)
                return r0
            L52:
                return r1
            L53:
                int r5 = r4.getHeight()
                int r6 = r4.getPaddingBottom()
                int r5 = r5 - r6
                int r6 = r4.getPaddingTop()
                int r5 = r5 - r6
                int r6 = r4.getScrollY()
                int r6 = r6 + r5
                int r5 = r4.getScrollRange()
                int r5 = java.lang.Math.min(r6, r5)
                int r6 = r4.getScrollY()
                if (r5 == r6) goto L75
                goto L44
            L75:
                return r1
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public interface InterfaceC0347b {
        /* renamed from: a */
        void mo1042a(androidx.core.widget.NestedScrollView r1, int r2, int r3, int r4, int r5);
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    public static class C0348c extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.core.widget.NestedScrollView.C0348c> CREATOR = null;

        /* renamed from: Y */
        public int f1994Y;

        /* renamed from: androidx.core.widget.NestedScrollView$c$a */
        public class a implements android.os.Parcelable.Creator<androidx.core.widget.NestedScrollView.C0348c> {
            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public androidx.core.widget.NestedScrollView.C0348c createFromParcel(android.os.Parcel r2) {
                    r1 = this;
                    androidx.core.widget.NestedScrollView$c r0 = new androidx.core.widget.NestedScrollView$c
                    r0.<init>(r2)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public androidx.core.widget.NestedScrollView.C0348c[] newArray(int r1) {
                    r0 = this;
                    androidx.core.widget.NestedScrollView$c[] r1 = new androidx.core.widget.NestedScrollView.C0348c[r1]
                    return r1
            }
        }

        static {
                androidx.core.widget.NestedScrollView$c$a r0 = new androidx.core.widget.NestedScrollView$c$a
                r0.<init>()
                androidx.core.widget.NestedScrollView.C0348c.CREATOR = r0
                return
        }

        public C0348c(android.os.Parcel r1) {
                r0 = this;
                r0.<init>(r1)
                int r1 = r1.readInt()
                r0.f1994Y = r1
                return
        }

        public C0348c(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "HorizontalScrollView.SavedState{"
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                int r1 = java.lang.System.identityHashCode(r3)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = " scrollPosition="
                r0.append(r1)
                int r1 = r3.f1994Y
                java.lang.String r2 = "}"
                java.lang.String r0 = p381w.C6764e.m13690a(r0, r1, r2)
                return r0
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.f1994Y
                r1.writeInt(r2)
                return
        }
    }

    static {
            androidx.core.widget.NestedScrollView$a r0 = new androidx.core.widget.NestedScrollView$a
            r0.<init>()
            androidx.core.widget.NestedScrollView.f1966A0 = r0
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16843130(0x101017a, float:2.3694617E-38)
            r0[r1] = r2
            androidx.core.widget.NestedScrollView.f1967B0 = r0
            return
    }

    public NestedScrollView(android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            r0 = 2130969315(0x7f0402e3, float:1.7547308E38)
            r5.<init>(r6, r7, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r5.f1969b0 = r1
            r1 = 1
            r5.f1974g0 = r1
            r2 = 0
            r5.f1975h0 = r2
            r3 = 0
            r5.f1976i0 = r3
            r5.f1977j0 = r2
            r5.f1980m0 = r1
            r3 = -1
            r5.f1984q0 = r3
            r3 = 2
            int[] r4 = new int[r3]
            r5.f1985r0 = r4
            int[] r3 = new int[r3]
            r5.f1986s0 = r3
            boolean r3 = p158j0.C3379a.m7754a()
            if (r3 == 0) goto L31
            android.widget.EdgeEffect r3 = p280q0.C5537d.a.m11807a(r6, r7)
            goto L36
        L31:
            android.widget.EdgeEffect r3 = new android.widget.EdgeEffect
            r3.<init>(r6)
        L36:
            r5.f1971d0 = r3
            boolean r3 = p158j0.C3379a.m7754a()
            if (r3 == 0) goto L43
            android.widget.EdgeEffect r3 = p280q0.C5537d.a.m11807a(r6, r7)
            goto L48
        L43:
            android.widget.EdgeEffect r3 = new android.widget.EdgeEffect
            r3.<init>(r6)
        L48:
            r5.f1972e0 = r3
            android.widget.OverScroller r3 = new android.widget.OverScroller
            android.content.Context r4 = r5.getContext()
            r3.<init>(r4)
            r5.f1970c0 = r3
            r5.setFocusable(r1)
            r3 = 262144(0x40000, float:3.67342E-40)
            r5.setDescendantFocusability(r3)
            r5.setWillNotDraw(r2)
            android.content.Context r3 = r5.getContext()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r4 = r3.getScaledTouchSlop()
            r5.f1981n0 = r4
            int r4 = r3.getScaledMinimumFlingVelocity()
            r5.f1982o0 = r4
            int r3 = r3.getScaledMaximumFlingVelocity()
            r5.f1983p0 = r3
            int[] r3 = androidx.core.widget.NestedScrollView.f1967B0
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r3, r0, r2)
            boolean r7 = r6.getBoolean(r2, r2)
            r5.setFillViewport(r7)
            r6.recycle()
            n0.k r6 = new n0.k
            r6.<init>()
            r5.f1990w0 = r6
            n0.h r6 = new n0.h
            r6.<init>(r5)
            r5.f1991x0 = r6
            r5.setNestedScrollingEnabled(r1)
            androidx.core.widget.NestedScrollView$a r6 = androidx.core.widget.NestedScrollView.f1966A0
            p227n0.C4661t.m10546v(r5, r6)
            return
    }

    /* renamed from: d */
    public static int m1016d(int r1, int r2, int r3) {
            if (r2 >= r3) goto Lc
            if (r1 >= 0) goto L5
            goto Lc
        L5:
            int r0 = r2 + r1
            if (r0 <= r3) goto Lb
            int r3 = r3 - r2
            return r3
        Lb:
            return r1
        Lc:
            r1 = 0
            return r1
    }

    private float getVerticalScrollFactorCompat() {
            r5 = this;
            float r0 = r5.f1992y0
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L35
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r5.getContext()
            android.content.res.Resources$Theme r2 = r1.getTheme()
            r3 = 16842829(0x101004d, float:2.3693774E-38)
            r4 = 1
            boolean r2 = r2.resolveAttribute(r3, r0, r4)
            if (r2 == 0) goto L2d
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r0 = r0.getDimension(r1)
            r5.f1992y0 = r0
            goto L35
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expected theme to define listPreferredItemHeight."
            r0.<init>(r1)
            throw r0
        L35:
            float r0 = r5.f1992y0
            return r0
    }

    /* renamed from: q */
    public static boolean m1017q(android.view.View r2, android.view.View r3) {
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            android.view.ViewParent r2 = r2.getParent()
            boolean r1 = r2 instanceof android.view.ViewGroup
            if (r1 == 0) goto L15
            android.view.View r2 = (android.view.View) r2
            boolean r2 = m1017q(r2, r3)
            if (r2 == 0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    /* renamed from: A */
    public boolean m1018A(int r2, int r3) {
            r1 = this;
            n0.h r0 = r1.f1991x0
            boolean r2 = r0.m10514l(r2, r3)
            return r2
    }

    /* renamed from: B */
    public final boolean m1019B(android.view.MotionEvent r6) {
            r5 = this;
            android.widget.EdgeEffect r0 = r5.f1971d0
            float r0 = p280q0.C5537d.m11805a(r0)
            r1 = 1
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1d
            android.widget.EdgeEffect r0 = r5.f1971d0
            float r3 = r6.getY()
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r3 = r3 / r4
            p280q0.C5537d.m11806b(r0, r2, r3)
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            android.widget.EdgeEffect r3 = r5.f1972e0
            float r3 = p280q0.C5537d.m11805a(r3)
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L3b
            android.widget.EdgeEffect r0 = r5.f1972e0
            r3 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6.getY()
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r6 = r6 / r4
            float r3 = r3 - r6
            p280q0.C5537d.m11806b(r0, r2, r3)
            goto L3c
        L3b:
            r1 = r0
        L3c:
            return r1
    }

    /* renamed from: C */
    public void m1020C(int r2) {
            r1 = this;
            n0.h r0 = r1.f1991x0
            r0.m10515m(r2)
            return
    }

    /* renamed from: a */
    public final void m1021a() {
            r2 = this;
            android.widget.OverScroller r0 = r2.f1970c0
            r0.abortAnimation()
            n0.h r0 = r2.f1991x0
            r1 = 1
            r0.m10515m(r1)
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r2) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2)
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "ScrollView can host only one direct child"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r2, int r3) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2, r3)
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "ScrollView can host only one direct child"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2, r3, r4)
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "ScrollView can host only one direct child"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2, r3)
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "ScrollView can host only one direct child"
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: b */
    public boolean m1022b(int r8) {
            r7 = this;
            android.view.View r0 = r7.findFocus()
            if (r0 != r7) goto L7
            r0 = 0
        L7:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r7, r0, r8)
            int r2 = r7.getMaxScrollAmount()
            r3 = 0
            if (r1 == 0) goto L37
            int r4 = r7.getHeight()
            boolean r4 = r7.m1030r(r1, r2, r4)
            if (r4 == 0) goto L37
            android.graphics.Rect r2 = r7.f1969b0
            r1.getDrawingRect(r2)
            android.graphics.Rect r2 = r7.f1969b0
            r7.offsetDescendantRectToMyCoords(r1, r2)
            android.graphics.Rect r2 = r7.f1969b0
            int r2 = r7.m1023e(r2)
            r7.m1025g(r2)
            r1.requestFocus(r8)
            goto L7e
        L37:
            r1 = 33
            r4 = 130(0x82, float:1.82E-43)
            if (r8 != r1) goto L48
            int r1 = r7.getScrollY()
            if (r1 >= r2) goto L48
            int r2 = r7.getScrollY()
            goto L74
        L48:
            if (r8 != r4) goto L74
            int r1 = r7.getChildCount()
            if (r1 <= 0) goto L74
            android.view.View r1 = r7.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r5 = (android.widget.FrameLayout.LayoutParams) r5
            int r1 = r1.getBottom()
            int r5 = r5.bottomMargin
            int r1 = r1 + r5
            int r5 = r7.getScrollY()
            int r6 = r7.getHeight()
            int r6 = r6 + r5
            int r5 = r7.getPaddingBottom()
            int r6 = r6 - r5
            int r1 = r1 - r6
            int r2 = java.lang.Math.min(r1, r2)
        L74:
            if (r2 != 0) goto L77
            return r3
        L77:
            if (r8 != r4) goto L7a
            goto L7b
        L7a:
            int r2 = -r2
        L7b:
            r7.m1025g(r2)
        L7e:
            r8 = 1
            if (r0 == 0) goto La1
            boolean r1 = r0.isFocused()
            if (r1 == 0) goto La1
            int r1 = r7.getHeight()
            boolean r0 = r7.m1030r(r0, r3, r1)
            r0 = r0 ^ r8
            if (r0 == 0) goto La1
            int r0 = r7.getDescendantFocusability()
            r1 = 131072(0x20000, float:1.83671E-40)
            r7.setDescendantFocusability(r1)
            r7.requestFocus()
            r7.setDescendantFocusability(r0)
        La1:
            return r8
    }

    @Override // p227n0.InterfaceC4650i
    /* renamed from: c */
    public void mo554c(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            n0.k r1 = r0.f1990w0
            r2 = 1
            if (r4 != r2) goto L8
            r1.f18564b = r3
            goto La
        L8:
            r1.f18563a = r3
        La:
            r1 = 2
            r0.m1018A(r1, r4)
            return
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
            r1 = this;
            int r0 = super.computeHorizontalScrollExtent()
            return r0
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
            r1 = this;
            int r0 = super.computeHorizontalScrollOffset()
            return r0
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
            r1 = this;
            int r0 = super.computeHorizontalScrollRange()
            return r0
    }

    @Override // android.view.View
    public void computeScroll() {
            r14 = this;
            android.widget.OverScroller r0 = r14.f1970c0
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L9
            return
        L9:
            android.widget.OverScroller r0 = r14.f1970c0
            r0.computeScrollOffset()
            android.widget.OverScroller r0 = r14.f1970c0
            int r0 = r0.getCurrY()
            int r1 = r14.f1988u0
            int r6 = r0 - r1
            r14.f1988u0 = r0
            int[] r3 = r14.f1986s0
            r9 = 0
            r10 = 1
            r3[r10] = r9
            r1 = 0
            r4 = 0
            r5 = 1
            r0 = r14
            r2 = r6
            r0.m1024f(r1, r2, r3, r4, r5)
            int[] r0 = r14.f1986s0
            r0 = r0[r10]
            int r11 = r6 - r0
            int r12 = r14.getScrollRange()
            if (r11 == 0) goto L62
            int r13 = r14.getScrollY()
            r1 = 0
            int r3 = r14.getScrollX()
            r5 = 0
            r7 = 0
            r8 = 0
            r0 = r14
            r2 = r11
            r4 = r13
            r6 = r12
            r0.m1033u(r1, r2, r3, r4, r5, r6, r7, r8)
            int r0 = r14.getScrollY()
            int r3 = r0 - r13
            int r11 = r11 - r3
            int[] r8 = r14.f1986s0
            r8[r10] = r9
            r2 = 0
            r4 = 0
            int[] r6 = r14.f1985r0
            r7 = 1
            n0.h r1 = r14.f1991x0
            r5 = r11
            r1.m10509g(r2, r3, r4, r5, r6, r7, r8)
            int[] r0 = r14.f1986s0
            r0 = r0[r10]
            int r11 = r11 - r0
        L62:
            if (r11 == 0) goto L95
            int r0 = r14.getOverScrollMode()
            if (r0 == 0) goto L6e
            if (r0 != r10) goto L6f
            if (r12 <= 0) goto L6f
        L6e:
            r9 = 1
        L6f:
            if (r9 == 0) goto L92
            if (r11 >= 0) goto L7e
            android.widget.EdgeEffect r0 = r14.f1971d0
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L92
            android.widget.EdgeEffect r0 = r14.f1971d0
            goto L88
        L7e:
            android.widget.EdgeEffect r0 = r14.f1972e0
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L92
            android.widget.EdgeEffect r0 = r14.f1972e0
        L88:
            android.widget.OverScroller r1 = r14.f1970c0
            float r1 = r1.getCurrVelocity()
            int r1 = (int) r1
            r0.onAbsorb(r1)
        L92:
            r14.m1021a()
        L95:
            android.widget.OverScroller r0 = r14.f1970c0
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto La3
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10563k(r14)
            goto La8
        La3:
            n0.h r0 = r14.f1991x0
            r0.m10515m(r10)
        La8:
            return
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
            r1 = this;
            int r0 = super.computeVerticalScrollExtent()
            return r0
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
            r2 = this;
            int r0 = super.computeVerticalScrollOffset()
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
            r4 = this;
            int r0 = r4.getChildCount()
            int r1 = r4.getHeight()
            int r2 = r4.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r4.getPaddingTop()
            int r1 = r1 - r2
            if (r0 != 0) goto L15
            return r1
        L15:
            r0 = 0
            android.view.View r2 = r4.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r2 = r2.getBottom()
            int r3 = r3.bottomMargin
            int r2 = r2 + r3
            int r3 = r4.getScrollY()
            int r1 = r2 - r1
            int r0 = java.lang.Math.max(r0, r1)
            if (r3 >= 0) goto L35
            int r2 = r2 - r3
            goto L39
        L35:
            if (r3 <= r0) goto L39
            int r3 = r3 - r0
            int r2 = r2 + r3
        L39:
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            boolean r0 = super.dispatchKeyEvent(r2)
            if (r0 != 0) goto Lf
            boolean r2 = r1.m1026h(r2)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            return r2
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float r2, float r3, boolean r4) {
            r1 = this;
            n0.h r0 = r1.f1991x0
            boolean r2 = r0.m10503a(r2, r3, r4)
            return r2
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float r2, float r3) {
            r1 = this;
            n0.h r0 = r1.f1991x0
            boolean r2 = r0.m10504b(r2, r3)
            return r2
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            boolean r7 = r0.m1024f(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int r7, int r8, int r9, int r10, int[] r11) {
            r6 = this;
            n0.h r0 = r6.f1991x0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.m10508f(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r10) {
            r9 = this;
            super.draw(r10)
            int r0 = r9.getScrollY()
            android.widget.EdgeEffect r1 = r9.f1971d0
            boolean r1 = r1.isFinished()
            r2 = 0
            if (r1 != 0) goto L66
            int r1 = r10.save()
            int r3 = r9.getWidth()
            int r4 = r9.getHeight()
            int r5 = java.lang.Math.min(r2, r0)
            boolean r6 = r9.getClipToPadding()
            if (r6 == 0) goto L36
            int r6 = r9.getPaddingLeft()
            int r7 = r9.getPaddingRight()
            int r7 = r7 + r6
            int r3 = r3 - r7
            int r6 = r9.getPaddingLeft()
            int r6 = r6 + r2
            goto L37
        L36:
            r6 = 0
        L37:
            boolean r7 = r9.getClipToPadding()
            if (r7 == 0) goto L4c
            int r7 = r9.getPaddingTop()
            int r8 = r9.getPaddingBottom()
            int r8 = r8 + r7
            int r4 = r4 - r8
            int r7 = r9.getPaddingTop()
            int r5 = r5 + r7
        L4c:
            float r6 = (float) r6
            float r5 = (float) r5
            r10.translate(r6, r5)
            android.widget.EdgeEffect r5 = r9.f1971d0
            r5.setSize(r3, r4)
            android.widget.EdgeEffect r3 = r9.f1971d0
            boolean r3 = r3.draw(r10)
            if (r3 == 0) goto L63
            java.util.WeakHashMap<android.view.View, n0.w> r3 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10563k(r9)
        L63:
            r10.restoreToCount(r1)
        L66:
            android.widget.EdgeEffect r1 = r9.f1972e0
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto Lcf
            int r1 = r10.save()
            int r3 = r9.getWidth()
            int r4 = r9.getHeight()
            int r5 = r9.getScrollRange()
            int r0 = java.lang.Math.max(r5, r0)
            int r0 = r0 + r4
            boolean r5 = r9.getClipToPadding()
            if (r5 == 0) goto L98
            int r5 = r9.getPaddingLeft()
            int r6 = r9.getPaddingRight()
            int r6 = r6 + r5
            int r3 = r3 - r6
            int r5 = r9.getPaddingLeft()
            int r2 = r2 + r5
        L98:
            boolean r5 = r9.getClipToPadding()
            if (r5 == 0) goto Lad
            int r5 = r9.getPaddingTop()
            int r6 = r9.getPaddingBottom()
            int r6 = r6 + r5
            int r4 = r4 - r6
            int r5 = r9.getPaddingBottom()
            int r0 = r0 - r5
        Lad:
            int r2 = r2 - r3
            float r2 = (float) r2
            float r0 = (float) r0
            r10.translate(r2, r0)
            r0 = 1127481344(0x43340000, float:180.0)
            float r2 = (float) r3
            r5 = 0
            r10.rotate(r0, r2, r5)
            android.widget.EdgeEffect r0 = r9.f1972e0
            r0.setSize(r3, r4)
            android.widget.EdgeEffect r0 = r9.f1972e0
            boolean r0 = r0.draw(r10)
            if (r0 == 0) goto Lcc
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10563k(r9)
        Lcc:
            r10.restoreToCount(r1)
        Lcf:
            return
    }

    /* renamed from: e */
    public int m1023e(android.graphics.Rect r11) {
            r10 = this;
            int r0 = r10.getChildCount()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r10.getHeight()
            int r2 = r10.getScrollY()
            int r3 = r2 + r0
            int r4 = r10.getVerticalFadingEdgeLength()
            int r5 = r11.top
            if (r5 <= 0) goto L1b
            int r2 = r2 + r4
        L1b:
            android.view.View r5 = r10.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r6 = (android.widget.FrameLayout.LayoutParams) r6
            int r7 = r11.bottom
            int r8 = r5.getHeight()
            int r9 = r6.topMargin
            int r8 = r8 + r9
            int r9 = r6.bottomMargin
            int r8 = r8 + r9
            if (r7 >= r8) goto L36
            int r4 = r3 - r4
            goto L37
        L36:
            r4 = r3
        L37:
            int r7 = r11.bottom
            if (r7 <= r4) goto L5a
            int r8 = r11.top
            if (r8 <= r2) goto L5a
            int r7 = r11.height()
            if (r7 <= r0) goto L49
            int r11 = r11.top
            int r11 = r11 - r2
            goto L4c
        L49:
            int r11 = r11.bottom
            int r11 = r11 - r4
        L4c:
            int r11 = r11 + r1
            int r0 = r5.getBottom()
            int r1 = r6.bottomMargin
            int r0 = r0 + r1
            int r0 = r0 - r3
            int r1 = java.lang.Math.min(r11, r0)
            goto L78
        L5a:
            int r3 = r11.top
            if (r3 >= r2) goto L78
            if (r7 >= r4) goto L78
            int r3 = r11.height()
            if (r3 <= r0) goto L6b
            int r11 = r11.bottom
            int r4 = r4 - r11
            int r1 = r1 - r4
            goto L6f
        L6b:
            int r11 = r11.top
            int r2 = r2 - r11
            int r1 = r1 - r2
        L6f:
            int r11 = r10.getScrollY()
            int r11 = -r11
            int r1 = java.lang.Math.max(r1, r11)
        L78:
            return r1
    }

    /* renamed from: f */
    public boolean m1024f(int r7, int r8, int[] r9, int[] r10, int r11) {
            r6 = this;
            n0.h r0 = r6.f1991x0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.m10506d(r1, r2, r3, r4, r5)
            return r7
    }

    /* renamed from: g */
    public final void m1025g(int r3) {
            r2 = this;
            if (r3 == 0) goto L10
            boolean r0 = r2.f1980m0
            r1 = 0
            if (r0 == 0) goto Ld
            r0 = 250(0xfa, float:3.5E-43)
            r2.m1038z(r1, r3, r0, r1)
            goto L10
        Ld:
            r2.scrollBy(r1, r3)
        L10:
            return
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
            r5 = this;
            int r0 = r5.getChildCount()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = 0
            android.view.View r0 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r2 = r5.getVerticalFadingEdgeLength()
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r5.getScrollY()
            int r0 = r0 - r1
            int r0 = r0 - r3
            if (r0 >= r2) goto L33
            float r0 = (float) r0
            float r1 = (float) r2
            float r0 = r0 / r1
            return r0
        L33:
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
    }

    public int getMaxScrollAmount() {
            r2 = this;
            int r0 = r2.getHeight()
            float r0 = (float) r0
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            int r0 = (int) r0
            return r0
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
            r1 = this;
            n0.k r0 = r1.f1990w0
            int r0 = r0.m10516a()
            return r0
    }

    public int getScrollRange() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L2e
            android.view.View r0 = r4.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r0.getHeight()
            int r3 = r2.topMargin
            int r0 = r0 + r3
            int r2 = r2.bottomMargin
            int r0 = r0 + r2
            int r2 = r4.getHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            int r0 = r0 - r2
            int r1 = java.lang.Math.max(r1, r0)
        L2e:
            return r1
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
            r2 = this;
            int r0 = r2.getChildCount()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r2.getVerticalFadingEdgeLength()
            int r1 = r2.getScrollY()
            if (r1 >= r0) goto L16
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            return r1
        L16:
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
    }

    /* renamed from: h */
    public boolean m1026h(android.view.KeyEvent r7) {
            r6 = this;
            android.graphics.Rect r0 = r6.f1969b0
            r0.setEmpty()
            int r0 = r6.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L33
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r6.getHeight()
            int r4 = r6.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r6.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L33
            r0 = 1
            goto L34
        L33:
            r0 = 0
        L34:
            r3 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L62
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L61
            int r7 = r7.getKeyCode()
            r0 = 4
            if (r7 == r0) goto L61
            android.view.View r7 = r6.findFocus()
            if (r7 != r6) goto L4c
            r7 = 0
        L4c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r7 = r0.findNextFocus(r6, r7, r3)
            if (r7 == 0) goto L5f
            if (r7 == r6) goto L5f
            boolean r7 = r7.requestFocus(r3)
            if (r7 == 0) goto L5f
            goto L60
        L5f:
            r1 = 0
        L60:
            return r1
        L61:
            return r2
        L62:
            int r0 = r7.getAction()
            if (r0 != 0) goto Lfb
            int r0 = r7.getKeyCode()
            r4 = 19
            r5 = 33
            if (r0 == r4) goto Lec
            r4 = 20
            if (r0 == r4) goto Ldc
            r4 = 62
            if (r0 == r4) goto L7c
            goto Lfb
        L7c:
            boolean r7 = r7.isShiftPressed()
            if (r7 == 0) goto L83
            goto L85
        L83:
            r5 = 130(0x82, float:1.82E-43)
        L85:
            if (r5 != r3) goto L89
            r7 = 1
            goto L8a
        L89:
            r7 = 0
        L8a:
            int r0 = r6.getHeight()
            if (r7 == 0) goto Lbf
            android.graphics.Rect r7 = r6.f1969b0
            int r3 = r6.getScrollY()
            int r3 = r3 + r0
            r7.top = r3
            int r7 = r6.getChildCount()
            if (r7 <= 0) goto Ld1
            int r7 = r7 - r1
            android.view.View r7 = r6.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r7 = r7.getBottom()
            int r1 = r1.bottomMargin
            int r7 = r7 + r1
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r7
            android.graphics.Rect r7 = r6.f1969b0
            int r3 = r7.top
            int r3 = r3 + r0
            if (r3 <= r1) goto Ld1
            int r1 = r1 - r0
            goto Lcf
        Lbf:
            android.graphics.Rect r7 = r6.f1969b0
            int r1 = r6.getScrollY()
            int r1 = r1 - r0
            r7.top = r1
            android.graphics.Rect r7 = r6.f1969b0
            int r1 = r7.top
            if (r1 >= 0) goto Ld1
            r1 = 0
        Lcf:
            r7.top = r1
        Ld1:
            android.graphics.Rect r7 = r6.f1969b0
            int r1 = r7.top
            int r0 = r0 + r1
            r7.bottom = r0
            r6.m1036x(r5, r1, r0)
            goto Lfb
        Ldc:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto Le7
            boolean r2 = r6.m1022b(r3)
            goto Lfb
        Le7:
            boolean r2 = r6.m1028l(r3)
            goto Lfb
        Lec:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto Lf7
            boolean r2 = r6.m1022b(r5)
            goto Lfb
        Lf7:
            boolean r2 = r6.m1028l(r5)
        Lfb:
            return r2
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
            r1 = this;
            r0 = 0
            boolean r0 = r1.m1029p(r0)
            return r0
    }

    @Override // p227n0.InterfaceC4650i
    /* renamed from: i */
    public void mo560i(android.view.View r3, int r4) {
            r2 = this;
            n0.k r3 = r2.f1990w0
            r0 = 0
            r1 = 1
            if (r4 != r1) goto L9
            r3.f18564b = r0
            goto Lb
        L9:
            r3.f18563a = r0
        Lb:
            r2.m1020C(r4)
            return
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
            r1 = this;
            n0.h r0 = r1.f1991x0
            boolean r0 = r0.f18561d
            return r0
    }

    @Override // p227n0.InterfaceC4650i
    /* renamed from: j */
    public void mo561j(android.view.View r7, int r8, int r9, int[] r10, int r11) {
            r6 = this;
            r4 = 0
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r11
            r0.m1024f(r1, r2, r3, r4, r5)
            return
    }

    /* renamed from: k */
    public void m1027k(int r13) {
            r12 = this;
            int r0 = r12.getChildCount()
            if (r0 <= 0) goto L22
            android.widget.OverScroller r1 = r12.f1970c0
            int r2 = r12.getScrollX()
            int r3 = r12.getScrollY()
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 2147483647(0x7fffffff, float:NaN)
            r10 = 0
            r11 = 0
            r5 = r13
            r1.fling(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13 = 1
            r12.m1035w(r13)
        L22:
            return
    }

    /* renamed from: l */
    public boolean m1028l(int r6) {
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 130(0x82, float:1.82E-43)
            if (r6 != r2) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            int r3 = r5.getHeight()
            android.graphics.Rect r4 = r5.f1969b0
            r4.top = r1
            r4.bottom = r3
            if (r2 == 0) goto L3d
            int r1 = r5.getChildCount()
            if (r1 <= 0) goto L3d
            int r1 = r1 - r0
            android.view.View r0 = r5.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            android.graphics.Rect r2 = r5.f1969b0
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r5.getPaddingBottom()
            int r1 = r1 + r0
            r2.bottom = r1
            android.graphics.Rect r0 = r5.f1969b0
            int r1 = r0.bottom
            int r1 = r1 - r3
            r0.top = r1
        L3d:
            android.graphics.Rect r0 = r5.f1969b0
            int r1 = r0.top
            int r0 = r0.bottom
            boolean r6 = r5.m1036x(r6, r1, r0)
            return r6
    }

    @Override // p227n0.InterfaceC4651j
    /* renamed from: m */
    public void mo564m(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
            r0 = this;
            r0.m1031s(r5, r6, r7)
            return
    }

    @Override // android.view.ViewGroup
    public void measureChild(android.view.View r3, int r4, int r5) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            int r0 = r2.getPaddingLeft()
            int r1 = r2.getPaddingRight()
            int r1 = r1 + r0
            int r5 = r5.width
            int r4 = android.widget.FrameLayout.getChildMeasureSpec(r4, r1, r5)
            r5 = 0
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r5)
            r3.measure(r4, r5)
            return
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(android.view.View r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            int r6 = r1.getPaddingLeft()
            int r0 = r1.getPaddingRight()
            int r0 = r0 + r6
            int r6 = r5.leftMargin
            int r0 = r0 + r6
            int r6 = r5.rightMargin
            int r0 = r0 + r6
            int r0 = r0 + r4
            int r4 = r5.width
            int r3 = android.widget.FrameLayout.getChildMeasureSpec(r3, r0, r4)
            int r4 = r5.topMargin
            int r5 = r5.bottomMargin
            int r4 = r4 + r5
            r5 = 0
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5)
            r2.measure(r3, r4)
            return
    }

    @Override // p227n0.InterfaceC4650i
    /* renamed from: n */
    public void mo565n(android.view.View r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            r1 = 0
            r0.m1031s(r5, r6, r1)
            return
    }

    @Override // p227n0.InterfaceC4650i
    /* renamed from: o */
    public boolean mo566o(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            r1 = r3 & 2
            if (r1 == 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 0
            r1.f1975h0 = r0
            return
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getSource()
            r0 = r0 & 2
            r1 = 0
            if (r0 == 0) goto L45
            int r0 = r4.getAction()
            r2 = 8
            if (r0 == r2) goto L12
            goto L45
        L12:
            boolean r0 = r3.f1977j0
            if (r0 != 0) goto L45
            r0 = 9
            float r4 = r4.getAxisValue(r0)
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L45
            float r0 = r3.getVerticalScrollFactorCompat()
            float r4 = r4 * r0
            int r4 = (int) r4
            int r0 = r3.getScrollRange()
            int r2 = r3.getScrollY()
            int r4 = r2 - r4
            if (r4 >= 0) goto L36
            r0 = 0
            goto L3a
        L36:
            if (r4 <= r0) goto L39
            goto L3a
        L39:
            r0 = r4
        L3a:
            if (r0 == r2) goto L45
            int r4 = r3.getScrollX()
            super.scrollTo(r4, r0)
            r4 = 1
            return r4
        L45:
            return r1
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
            r11 = this;
            int r0 = r12.getAction()
            r1 = 1
            r2 = 2
            if (r0 != r2) goto Ld
            boolean r3 = r11.f1977j0
            if (r3 == 0) goto Ld
            return r1
        Ld:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            if (r0 == 0) goto Laf
            r4 = -1
            if (r0 == r1) goto L85
            if (r0 == r2) goto L24
            r1 = 3
            if (r0 == r1) goto L85
            r1 = 6
            if (r0 == r1) goto L1f
            goto L131
        L1f:
            r11.m1032t(r12)
            goto L131
        L24:
            int r0 = r11.f1984q0
            if (r0 != r4) goto L2a
            goto L131
        L2a:
            int r5 = r12.findPointerIndex(r0)
            if (r5 != r4) goto L4d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r12.append(r1)
            r12.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r12)
            goto L131
        L4d:
            float r0 = r12.getY(r5)
            int r0 = (int) r0
            int r4 = r11.f1973f0
            int r4 = r0 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r11.f1981n0
            if (r4 <= r5) goto L131
            int r4 = r11.getNestedScrollAxes()
            r2 = r2 & r4
            if (r2 != 0) goto L131
            r11.f1977j0 = r1
            r11.f1973f0 = r0
            android.view.VelocityTracker r0 = r11.f1978k0
            if (r0 != 0) goto L73
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.f1978k0 = r0
        L73:
            android.view.VelocityTracker r0 = r11.f1978k0
            r0.addMovement(r12)
            r11.f1987t0 = r3
            android.view.ViewParent r12 = r11.getParent()
            if (r12 == 0) goto L131
            r12.requestDisallowInterceptTouchEvent(r1)
            goto L131
        L85:
            r11.f1977j0 = r3
            r11.f1984q0 = r4
            r11.m1034v()
            android.widget.OverScroller r4 = r11.f1970c0
            int r5 = r11.getScrollX()
            int r6 = r11.getScrollY()
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r11.getScrollRange()
            boolean r12 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto La8
            java.util.WeakHashMap<android.view.View, n0.w> r12 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10563k(r11)
        La8:
            n0.h r12 = r11.f1991x0
            r12.m10515m(r3)
            goto L131
        Laf:
            float r0 = r12.getY()
            int r0 = (int) r0
            float r4 = r12.getX()
            int r4 = (int) r4
            int r5 = r11.getChildCount()
            if (r5 <= 0) goto Le3
            int r5 = r11.getScrollY()
            android.view.View r6 = r11.getChildAt(r3)
            int r7 = r6.getTop()
            int r7 = r7 - r5
            if (r0 < r7) goto Le3
            int r7 = r6.getBottom()
            int r7 = r7 - r5
            if (r0 >= r7) goto Le3
            int r5 = r6.getLeft()
            if (r4 < r5) goto Le3
            int r5 = r6.getRight()
            if (r4 >= r5) goto Le3
            r4 = 1
            goto Le4
        Le3:
            r4 = 0
        Le4:
            if (r4 != 0) goto Lfc
            boolean r12 = r11.m1019B(r12)
            if (r12 != 0) goto Lf6
            android.widget.OverScroller r12 = r11.f1970c0
            boolean r12 = r12.isFinished()
            if (r12 != 0) goto Lf5
            goto Lf6
        Lf5:
            r1 = 0
        Lf6:
            r11.f1977j0 = r1
            r11.m1034v()
            goto L131
        Lfc:
            r11.f1973f0 = r0
            int r0 = r12.getPointerId(r3)
            r11.f1984q0 = r0
            android.view.VelocityTracker r0 = r11.f1978k0
            if (r0 != 0) goto L10f
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.f1978k0 = r0
            goto L112
        L10f:
            r0.clear()
        L112:
            android.view.VelocityTracker r0 = r11.f1978k0
            r0.addMovement(r12)
            android.widget.OverScroller r0 = r11.f1970c0
            r0.computeScrollOffset()
            boolean r12 = r11.m1019B(r12)
            if (r12 != 0) goto L12c
            android.widget.OverScroller r12 = r11.f1970c0
            boolean r12 = r12.isFinished()
            if (r12 != 0) goto L12b
            goto L12c
        L12b:
            r1 = 0
        L12c:
            r11.f1977j0 = r1
            r11.m1018A(r2, r3)
        L131:
            boolean r12 = r11.f1977j0
            return r12
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            r2 = 0
            r1.f1974g0 = r2
            android.view.View r3 = r1.f1976i0
            if (r3 == 0) goto L15
            boolean r3 = m1017q(r3, r1)
            if (r3 == 0) goto L15
            android.view.View r3 = r1.f1976i0
            r1.m1037y(r3)
        L15:
            r3 = 0
            r1.f1976i0 = r3
            boolean r5 = r1.f1975h0
            if (r5 != 0) goto L63
            androidx.core.widget.NestedScrollView$c r5 = r1.f1989v0
            if (r5 == 0) goto L2d
            int r5 = r1.getScrollX()
            androidx.core.widget.NestedScrollView$c r0 = r1.f1989v0
            int r0 = r0.f1994Y
            r1.scrollTo(r5, r0)
            r1.f1989v0 = r3
        L2d:
            int r3 = r1.getChildCount()
            if (r3 <= 0) goto L47
            android.view.View r2 = r1.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r2 = r2.getMeasuredHeight()
            int r5 = r3.topMargin
            int r2 = r2 + r5
            int r3 = r3.bottomMargin
            int r2 = r2 + r3
        L47:
            int r6 = r6 - r4
            int r3 = r1.getPaddingTop()
            int r6 = r6 - r3
            int r3 = r1.getPaddingBottom()
            int r6 = r6 - r3
            int r3 = r1.getScrollY()
            int r2 = m1016d(r3, r6, r2)
            if (r2 == r3) goto L63
            int r3 = r1.getScrollX()
            r1.scrollTo(r3, r2)
        L63:
            int r2 = r1.getScrollX()
            int r3 = r1.getScrollY()
            r1.scrollTo(r2, r3)
            r2 = 1
            r1.f1975h0 = r2
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int r5, int r6) {
            r4 = this;
            super.onMeasure(r5, r6)
            boolean r0 = r4.f1979l0
            if (r0 != 0) goto L8
            return
        L8:
            int r6 = android.view.View.MeasureSpec.getMode(r6)
            if (r6 != 0) goto Lf
            return
        Lf:
            int r6 = r4.getChildCount()
            if (r6 <= 0) goto L58
            r6 = 0
            android.view.View r6 = r4.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r6.getMeasuredHeight()
            int r2 = r4.getMeasuredHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            int r3 = r0.topMargin
            int r2 = r2 - r3
            int r3 = r0.bottomMargin
            int r2 = r2 - r3
            if (r1 >= r2) goto L58
            int r1 = r4.getPaddingLeft()
            int r3 = r4.getPaddingRight()
            int r3 = r3 + r1
            int r1 = r0.leftMargin
            int r3 = r3 + r1
            int r1 = r0.rightMargin
            int r3 = r3 + r1
            int r0 = r0.width
            int r5 = android.widget.FrameLayout.getChildMeasureSpec(r5, r3, r0)
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r6.measure(r5, r0)
        L58:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(android.view.View r1, float r2, float r3, boolean r4) {
            r0 = this;
            if (r4 != 0) goto Lc
            r1 = 0
            r2 = 1
            r0.dispatchNestedFling(r1, r3, r2)
            int r1 = (int) r3
            r0.m1027k(r1)
            return r2
        Lc:
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(android.view.View r1, float r2, float r3) {
            r0 = this;
            boolean r1 = r0.dispatchNestedPreFling(r2, r3)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(android.view.View r7, int r8, int r9, int[] r10) {
            r6 = this;
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r0.m1024f(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r1 = 0
            r2 = 0
            r0.m1031s(r5, r1, r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
            r0 = this;
            n0.k r1 = r0.f1990w0
            r1.f18563a = r3
            r1 = 2
            r2 = 0
            r0.m1018A(r1, r2)
            return
    }

    @Override // android.view.View
    public void onOverScrolled(int r1, int r2, boolean r3, boolean r4) {
            r0 = this;
            super.scrollTo(r1, r2)
            return
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int r5, android.graphics.Rect r6) {
            r4 = this;
            r0 = 1
            r1 = 2
            if (r5 != r1) goto L7
            r5 = 130(0x82, float:1.82E-43)
            goto Lb
        L7:
            if (r5 != r0) goto Lb
            r5 = 33
        Lb:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            if (r6 != 0) goto L17
            r2 = 0
            android.view.View r1 = r1.findNextFocus(r4, r2, r5)
            goto L1b
        L17:
            android.view.View r1 = r1.findNextFocusFromRect(r4, r6, r5)
        L1b:
            r2 = 0
            if (r1 != 0) goto L1f
            return r2
        L1f:
            int r3 = r4.getHeight()
            boolean r3 = r4.m1030r(r1, r2, r3)
            r0 = r0 ^ r3
            if (r0 == 0) goto L2b
            return r2
        L2b:
            boolean r5 = r1.requestFocus(r5, r6)
            return r5
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.core.widget.NestedScrollView.C0348c
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            androidx.core.widget.NestedScrollView$c r2 = (androidx.core.widget.NestedScrollView.C0348c) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            r1.f1989v0 = r2
            r1.requestLayout()
            return
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.core.widget.NestedScrollView$c r1 = new androidx.core.widget.NestedScrollView$c
            r1.<init>(r0)
            int r0 = r2.getScrollY()
            r1.f1994Y = r0
            return r1
    }

    @Override // android.view.View
    public void onScrollChanged(int r7, int r8, int r9, int r10) {
            r6 = this;
            super.onScrollChanged(r7, r8, r9, r10)
            androidx.core.widget.NestedScrollView$b r0 = r6.f1993z0
            if (r0 == 0) goto Lf
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.mo1042a(r1, r2, r3, r4, r5)
        Lf:
            return
    }

    @Override // android.view.View
    public void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            android.view.View r1 = r0.findFocus()
            if (r1 == 0) goto L26
            if (r0 != r1) goto Lc
            goto L26
        Lc:
            r2 = 0
            boolean r2 = r0.m1030r(r1, r2, r4)
            if (r2 == 0) goto L26
            android.graphics.Rect r2 = r0.f1969b0
            r1.getDrawingRect(r2)
            android.graphics.Rect r2 = r0.f1969b0
            r0.offsetDescendantRectToMyCoords(r1, r2)
            android.graphics.Rect r1 = r0.f1969b0
            int r1 = r0.m1023e(r1)
            r0.m1025g(r1)
        L26:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(android.view.View r1, android.view.View r2, int r3) {
            r0 = this;
            r1 = r3 & 2
            if (r1 == 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(android.view.View r2) {
            r1 = this;
            n0.k r2 = r1.f1990w0
            r0 = 0
            r2.f18563a = r0
            r1.m1020C(r0)
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r31) {
            r30 = this;
            r9 = r30
            r10 = r31
            android.view.VelocityTracker r0 = r9.f1978k0
            if (r0 != 0) goto Le
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r9.f1978k0 = r0
        Le:
            int r0 = r31.getActionMasked()
            r11 = 0
            if (r0 != 0) goto L17
            r9.f1987t0 = r11
        L17:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r31)
            int r1 = r9.f1987t0
            float r1 = (float) r1
            r2 = 0
            r12.offsetLocation(r2, r1)
            r1 = 2
            r13 = 1
            if (r0 == 0) goto L2bc
            r3 = -1
            if (r0 == r13) goto L23b
            if (r0 == r1) goto L81
            r1 = 3
            if (r0 == r1) goto L5b
            r1 = 5
            if (r0 == r1) goto L48
            r1 = 6
            if (r0 == r1) goto L36
            goto L2eb
        L36:
            r30.m1032t(r31)
            int r0 = r9.f1984q0
            int r0 = r10.findPointerIndex(r0)
            float r0 = r10.getY(r0)
            int r0 = (int) r0
            r9.f1973f0 = r0
            goto L2eb
        L48:
            int r0 = r31.getActionIndex()
            float r1 = r10.getY(r0)
            int r1 = (int) r1
            r9.f1973f0 = r1
            int r0 = r10.getPointerId(r0)
            r9.f1984q0 = r0
            goto L2eb
        L5b:
            boolean r0 = r9.f1977j0
            if (r0 == 0) goto L2a5
            int r0 = r30.getChildCount()
            if (r0 <= 0) goto L2a5
            android.widget.OverScroller r14 = r9.f1970c0
            int r15 = r30.getScrollX()
            int r16 = r30.getScrollY()
            r17 = 0
            r18 = 0
            r19 = 0
            int r20 = r30.getScrollRange()
            boolean r0 = r14.springBack(r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L2a5
            goto L2a0
        L81:
            int r0 = r9.f1984q0
            int r14 = r10.findPointerIndex(r0)
            if (r14 != r3) goto La4
            java.lang.String r0 = "Invalid pointerId="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r9.f1984q0
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NestedScrollView"
            android.util.Log.e(r1, r0)
            goto L2eb
        La4:
            float r0 = r10.getY(r14)
            int r6 = (int) r0
            int r0 = r9.f1973f0
            int r0 = r0 - r6
            float r1 = r10.getX(r14)
            int r3 = r30.getWidth()
            float r3 = (float) r3
            float r1 = r1 / r3
            float r3 = (float) r0
            int r4 = r30.getHeight()
            float r4 = (float) r4
            float r3 = r3 / r4
            android.widget.EdgeEffect r4 = r9.f1971d0
            float r4 = p280q0.C5537d.m11805a(r4)
            r5 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto Le0
            android.widget.EdgeEffect r4 = r9.f1971d0
            float r3 = -r3
            float r1 = p280q0.C5537d.m11806b(r4, r3, r1)
            float r1 = -r1
            android.widget.EdgeEffect r3 = r9.f1971d0
            float r3 = p280q0.C5537d.m11805a(r3)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto Lde
            android.widget.EdgeEffect r2 = r9.f1971d0
            goto Lfd
        Lde:
            r2 = r1
            goto L101
        Le0:
            android.widget.EdgeEffect r4 = r9.f1972e0
            float r4 = p280q0.C5537d.m11805a(r4)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L101
            android.widget.EdgeEffect r4 = r9.f1972e0
            float r5 = r5 - r1
            float r1 = p280q0.C5537d.m11806b(r4, r3, r5)
            android.widget.EdgeEffect r3 = r9.f1972e0
            float r3 = p280q0.C5537d.m11805a(r3)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto Lde
            android.widget.EdgeEffect r2 = r9.f1972e0
        Lfd:
            r2.onRelease()
            goto Lde
        L101:
            int r1 = r30.getHeight()
            float r1 = (float) r1
            float r2 = r2 * r1
            int r1 = java.lang.Math.round(r2)
            if (r1 == 0) goto L111
            r30.invalidate()
        L111:
            int r0 = r0 - r1
            boolean r1 = r9.f1977j0
            if (r1 != 0) goto L130
            int r1 = java.lang.Math.abs(r0)
            int r2 = r9.f1981n0
            if (r1 <= r2) goto L130
            android.view.ViewParent r1 = r30.getParent()
            if (r1 == 0) goto L127
            r1.requestDisallowInterceptTouchEvent(r13)
        L127:
            r9.f1977j0 = r13
            int r1 = r9.f1981n0
            if (r0 <= 0) goto L12f
            int r0 = r0 - r1
            goto L130
        L12f:
            int r0 = r0 + r1
        L130:
            r7 = r0
            boolean r0 = r9.f1977j0
            if (r0 == 0) goto L2eb
            r1 = 0
            int[] r3 = r9.f1986s0
            int[] r4 = r9.f1985r0
            r5 = 0
            r0 = r30
            r2 = r7
            boolean r0 = r0.m1024f(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L152
            int[] r0 = r9.f1986s0
            r0 = r0[r13]
            int r7 = r7 - r0
            int r0 = r9.f1987t0
            int[] r1 = r9.f1985r0
            r1 = r1[r13]
            int r0 = r0 + r1
            r9.f1987t0 = r0
        L152:
            r15 = r7
            int[] r0 = r9.f1985r0
            r0 = r0[r13]
            int r6 = r6 - r0
            r9.f1973f0 = r6
            int r16 = r30.getScrollY()
            int r8 = r30.getScrollRange()
            int r0 = r30.getOverScrollMode()
            if (r0 == 0) goto L171
            if (r0 != r13) goto L16d
            if (r8 <= 0) goto L16d
            goto L171
        L16d:
            r0 = 0
            r17 = 0
            goto L174
        L171:
            r0 = 1
            r17 = 1
        L174:
            r1 = 0
            r3 = 0
            int r4 = r30.getScrollY()
            r5 = 0
            r7 = 0
            r18 = 0
            r0 = r30
            r2 = r15
            r6 = r8
            r21 = r8
            r8 = r18
            boolean r0 = r0.m1033u(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L194
            boolean r0 = r9.m1029p(r11)
            if (r0 != 0) goto L194
            r0 = 1
            goto L195
        L194:
            r0 = 0
        L195:
            int r1 = r30.getScrollY()
            int r24 = r1 - r16
            int r26 = r15 - r24
            int[] r1 = r9.f1986s0
            r1[r13] = r11
            r23 = 0
            r25 = 0
            int[] r2 = r9.f1985r0
            r28 = 0
            n0.h r3 = r9.f1991x0
            r22 = r3
            r27 = r2
            r29 = r1
            r22.m10509g(r23, r24, r25, r26, r27, r28, r29)
            int r1 = r9.f1973f0
            int[] r2 = r9.f1985r0
            r3 = r2[r13]
            int r1 = r1 - r3
            r9.f1973f0 = r1
            int r1 = r9.f1987t0
            r2 = r2[r13]
            int r1 = r1 + r2
            r9.f1987t0 = r1
            if (r17 == 0) goto L231
            int[] r1 = r9.f1986s0
            r1 = r1[r13]
            int r15 = r15 - r1
            int r1 = r16 + r15
            if (r1 >= 0) goto L1f1
            android.widget.EdgeEffect r1 = r9.f1971d0
            int r2 = -r15
            float r2 = (float) r2
            int r3 = r30.getHeight()
            float r3 = (float) r3
            float r2 = r2 / r3
            float r3 = r10.getX(r14)
            int r4 = r30.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            p280q0.C5537d.m11806b(r1, r2, r3)
            android.widget.EdgeEffect r1 = r9.f1972e0
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L21b
            android.widget.EdgeEffect r1 = r9.f1972e0
            goto L218
        L1f1:
            r2 = r21
            if (r1 <= r2) goto L21b
            android.widget.EdgeEffect r1 = r9.f1972e0
            float r2 = (float) r15
            int r3 = r30.getHeight()
            float r3 = (float) r3
            float r2 = r2 / r3
            float r3 = r10.getX(r14)
            int r4 = r30.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            r4 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r3
            p280q0.C5537d.m11806b(r1, r2, r4)
            android.widget.EdgeEffect r1 = r9.f1971d0
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L21b
            android.widget.EdgeEffect r1 = r9.f1971d0
        L218:
            r1.onRelease()
        L21b:
            android.widget.EdgeEffect r1 = r9.f1971d0
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto L22b
            android.widget.EdgeEffect r1 = r9.f1972e0
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L231
        L22b:
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10563k(r30)
            goto L232
        L231:
            r11 = r0
        L232:
            if (r11 == 0) goto L2eb
            android.view.VelocityTracker r0 = r9.f1978k0
            r0.clear()
            goto L2eb
        L23b:
            android.view.VelocityTracker r0 = r9.f1978k0
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r9.f1983p0
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            int r1 = r9.f1984q0
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r9.f1982o0
            if (r1 < r4) goto L286
            android.widget.EdgeEffect r1 = r9.f1971d0
            float r1 = p280q0.C5537d.m11805a(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L262
            android.widget.EdgeEffect r1 = r9.f1971d0
            r4 = r0
            goto L26f
        L262:
            android.widget.EdgeEffect r1 = r9.f1972e0
            float r1 = p280q0.C5537d.m11805a(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L274
            android.widget.EdgeEffect r1 = r9.f1972e0
            int r4 = -r0
        L26f:
            r1.onAbsorb(r4)
            r1 = 1
            goto L275
        L274:
            r1 = 0
        L275:
            if (r1 != 0) goto L2a5
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r9.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L2a5
            r9.dispatchNestedFling(r2, r1, r13)
            r9.m1027k(r0)
            goto L2a5
        L286:
            android.widget.OverScroller r14 = r9.f1970c0
            int r15 = r30.getScrollX()
            int r16 = r30.getScrollY()
            r17 = 0
            r18 = 0
            r19 = 0
            int r20 = r30.getScrollRange()
            boolean r0 = r14.springBack(r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L2a5
        L2a0:
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10563k(r30)
        L2a5:
            r9.f1984q0 = r3
            r9.f1977j0 = r11
            r30.m1034v()
            n0.h r0 = r9.f1991x0
            r0.m10515m(r11)
            android.widget.EdgeEffect r0 = r9.f1971d0
            r0.onRelease()
            android.widget.EdgeEffect r0 = r9.f1972e0
            r0.onRelease()
            goto L2eb
        L2bc:
            int r0 = r30.getChildCount()
            if (r0 != 0) goto L2c3
            return r11
        L2c3:
            boolean r0 = r9.f1977j0
            if (r0 == 0) goto L2d0
            android.view.ViewParent r0 = r30.getParent()
            if (r0 == 0) goto L2d0
            r0.requestDisallowInterceptTouchEvent(r13)
        L2d0:
            android.widget.OverScroller r0 = r9.f1970c0
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L2db
            r30.m1021a()
        L2db:
            float r0 = r31.getY()
            int r0 = (int) r0
            r9.f1973f0 = r0
            int r0 = r10.getPointerId(r11)
            r9.f1984q0 = r0
            r9.m1018A(r1, r11)
        L2eb:
            android.view.VelocityTracker r0 = r9.f1978k0
            if (r0 == 0) goto L2f2
            r0.addMovement(r12)
        L2f2:
            r12.recycle()
            return r13
    }

    /* renamed from: p */
    public boolean m1029p(int r2) {
            r1 = this;
            n0.h r0 = r1.f1991x0
            android.view.ViewParent r2 = r0.m10510h(r2)
            if (r2 == 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    /* renamed from: r */
    public final boolean m1030r(android.view.View r2, int r3, int r4) {
            r1 = this;
            android.graphics.Rect r0 = r1.f1969b0
            r2.getDrawingRect(r0)
            android.graphics.Rect r0 = r1.f1969b0
            r1.offsetDescendantRectToMyCoords(r2, r0)
            android.graphics.Rect r2 = r1.f1969b0
            int r2 = r2.bottom
            int r2 = r2 + r3
            int r0 = r1.getScrollY()
            if (r2 < r0) goto L23
            android.graphics.Rect r2 = r1.f1969b0
            int r2 = r2.top
            int r2 = r2 - r3
            int r3 = r1.getScrollY()
            int r3 = r3 + r4
            if (r2 > r3) goto L23
            r2 = 1
            goto L24
        L23:
            r2 = 0
        L24:
            return r2
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View r2, android.view.View r3) {
            r1 = this;
            boolean r0 = r1.f1974g0
            if (r0 != 0) goto L8
            r1.m1037y(r3)
            goto La
        L8:
            r1.f1976i0 = r3
        La:
            super.requestChildFocus(r2, r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View r3, android.graphics.Rect r4, boolean r5) {
            r2 = this;
            int r0 = r3.getLeft()
            int r1 = r3.getScrollX()
            int r0 = r0 - r1
            int r1 = r3.getTop()
            int r3 = r3.getScrollY()
            int r1 = r1 - r3
            r4.offset(r0, r1)
            int r3 = r2.m1023e(r4)
            r4 = 0
            if (r3 == 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 == 0) goto L2c
            if (r5 == 0) goto L27
            r2.scrollBy(r4, r3)
            goto L2c
        L27:
            r5 = 250(0xfa, float:3.5E-43)
            r2.m1038z(r4, r3, r5, r4)
        L2c:
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r0.m1034v()
        L5:
            super.requestDisallowInterceptTouchEvent(r1)
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
            r1 = this;
            r0 = 1
            r1.f1974g0 = r0
            super.requestLayout()
            return
    }

    /* renamed from: s */
    public final void m1031s(int r11, int r12, int[] r13) {
            r10 = this;
            int r0 = r10.getScrollY()
            r1 = 0
            r10.scrollBy(r1, r11)
            int r1 = r10.getScrollY()
            int r4 = r1 - r0
            if (r13 == 0) goto L16
            r0 = 1
            r1 = r13[r0]
            int r1 = r1 + r4
            r13[r0] = r1
        L16:
            int r6 = r11 - r4
            n0.h r2 = r10.f1991x0
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = r12
            r9 = r13
            r2.m10507e(r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // android.view.View
    public void scrollTo(int r7, int r8) {
            r6 = this;
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L58
            r0 = 0
            android.view.View r0 = r6.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r2 = r6.getWidth()
            int r3 = r6.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r6.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r0.getWidth()
            int r4 = r1.leftMargin
            int r3 = r3 + r4
            int r4 = r1.rightMargin
            int r3 = r3 + r4
            int r4 = r6.getHeight()
            int r5 = r6.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r6.getPaddingBottom()
            int r4 = r4 - r5
            int r0 = r0.getHeight()
            int r5 = r1.topMargin
            int r0 = r0 + r5
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r7 = m1016d(r7, r2, r3)
            int r8 = m1016d(r8, r4, r0)
            int r0 = r6.getScrollX()
            if (r7 != r0) goto L55
            int r0 = r6.getScrollY()
            if (r8 == r0) goto L58
        L55:
            super.scrollTo(r7, r8)
        L58:
            return
    }

    public void setFillViewport(boolean r2) {
            r1 = this;
            boolean r0 = r1.f1979l0
            if (r2 == r0) goto L9
            r1.f1979l0 = r2
            r1.requestLayout()
        L9:
            return
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean r4) {
            r3 = this;
            n0.h r0 = r3.f1991x0
            boolean r1 = r0.f18561d
            if (r1 == 0) goto Ld
            android.view.View r1 = r0.f18560c
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            p227n0.C4661t.h.m10621z(r1)
        Ld:
            r0.f18561d = r4
            return
    }

    public void setOnScrollChangeListener(androidx.core.widget.NestedScrollView.InterfaceC0347b r1) {
            r0 = this;
            r0.f1993z0 = r1
            return
    }

    public void setSmoothScrollingEnabled(boolean r1) {
            r0 = this;
            r0.f1980m0 = r1
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // android.view.View
    public boolean startNestedScroll(int r3) {
            r2 = this;
            n0.h r0 = r2.f1991x0
            r1 = 0
            boolean r3 = r0.m10514l(r3, r1)
            return r3
    }

    @Override // android.view.View
    public void stopNestedScroll() {
            r2 = this;
            n0.h r0 = r2.f1991x0
            r1 = 0
            r0.m10515m(r1)
            return
    }

    /* renamed from: t */
    public final void m1032t(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionIndex()
            int r1 = r4.getPointerId(r0)
            int r2 = r3.f1984q0
            if (r1 != r2) goto L25
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            float r1 = r4.getY(r0)
            int r1 = (int) r1
            r3.f1973f0 = r1
            int r4 = r4.getPointerId(r0)
            r3.f1984q0 = r4
            android.view.VelocityTracker r4 = r3.f1978k0
            if (r4 == 0) goto L25
            r4.clear()
        L25:
            return
    }

    /* renamed from: u */
    public boolean m1033u(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20) {
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = 0
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = 0
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r3 = r2
        L4e:
            r2 = 1
            goto L55
        L50:
            if (r3 >= r7) goto L54
            r3 = r7
            goto L4e
        L54:
            r2 = 0
        L55:
            if (r6 <= r1) goto L5a
            r6 = r1
        L58:
            r1 = 1
            goto L5f
        L5a:
            if (r6 >= r8) goto L5e
            r6 = r8
            goto L58
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L7e
            boolean r7 = r12.m1029p(r5)
            if (r7 != 0) goto L7e
            android.widget.OverScroller r7 = r0.f1970c0
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L7e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L85
            if (r1 == 0) goto L86
        L85:
            r4 = 1
        L86:
            return r4
    }

    /* renamed from: v */
    public final void m1034v() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.f1978k0
            if (r0 == 0) goto La
            r0.recycle()
            r0 = 0
            r1.f1978k0 = r0
        La:
            return
    }

    /* renamed from: w */
    public final void m1035w(boolean r2) {
            r1 = this;
            r0 = 1
            if (r2 == 0) goto L8
            r2 = 2
            r1.m1018A(r2, r0)
            goto Ld
        L8:
            n0.h r2 = r1.f1991x0
            r2.m10515m(r0)
        Ld:
            int r2 = r1.getScrollY()
            r1.f1988u0 = r2
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10563k(r1)
            return
    }

    /* renamed from: x */
    public final boolean m1036x(int r18, int r19, int r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r17.getHeight()
            int r5 = r17.getScrollY()
            int r4 = r4 + r5
            r8 = 33
            if (r1 != r8) goto L17
            r8 = 1
            goto L18
        L17:
            r8 = 0
        L18:
            r9 = 2
            java.util.ArrayList r9 = r0.getFocusables(r9)
            int r10 = r9.size()
            r11 = 0
            r12 = 0
            r13 = 0
        L24:
            if (r12 >= r10) goto L6c
            java.lang.Object r14 = r9.get(r12)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r6 = r14.getBottom()
            if (r2 >= r6) goto L69
            if (r15 >= r3) goto L69
            if (r2 >= r15) goto L3f
            if (r6 >= r3) goto L3f
            r16 = 1
            goto L41
        L3f:
            r16 = 0
        L41:
            if (r11 != 0) goto L47
            r11 = r14
            r13 = r16
            goto L69
        L47:
            if (r8 == 0) goto L4f
            int r7 = r11.getTop()
            if (r15 < r7) goto L57
        L4f:
            if (r8 != 0) goto L59
            int r7 = r11.getBottom()
            if (r6 <= r7) goto L59
        L57:
            r6 = 1
            goto L5a
        L59:
            r6 = 0
        L5a:
            if (r13 == 0) goto L61
            if (r16 == 0) goto L69
            if (r6 == 0) goto L69
            goto L68
        L61:
            if (r16 == 0) goto L66
            r11 = r14
            r13 = 1
            goto L69
        L66:
            if (r6 == 0) goto L69
        L68:
            r11 = r14
        L69:
            int r12 = r12 + 1
            goto L24
        L6c:
            if (r11 != 0) goto L6f
            r11 = r0
        L6f:
            if (r2 < r5) goto L75
            if (r3 > r4) goto L75
            r6 = 0
            goto L7f
        L75:
            if (r8 == 0) goto L79
            int r2 = r2 - r5
            goto L7b
        L79:
            int r2 = r3 - r4
        L7b:
            r0.m1025g(r2)
            r6 = 1
        L7f:
            android.view.View r2 = r17.findFocus()
            if (r11 == r2) goto L88
            r11.requestFocus(r1)
        L88:
            return r6
    }

    /* renamed from: y */
    public final void m1037y(android.view.View r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.f1969b0
            r2.getDrawingRect(r0)
            android.graphics.Rect r0 = r1.f1969b0
            r1.offsetDescendantRectToMyCoords(r2, r0)
            android.graphics.Rect r2 = r1.f1969b0
            int r2 = r1.m1023e(r2)
            if (r2 == 0) goto L16
            r0 = 0
            r1.scrollBy(r0, r2)
        L16:
            return
    }

    /* renamed from: z */
    public final void m1038z(int r9, int r10, int r11, boolean r12) {
            r8 = this;
            int r0 = r8.getChildCount()
            if (r0 != 0) goto L7
            return
        L7:
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r2 = r8.f1968a0
            long r0 = r0 - r2
            r2 = 250(0xfa, double:1.235E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L5a
            r9 = 0
            android.view.View r0 = r8.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r0.getHeight()
            int r2 = r1.topMargin
            int r0 = r0 + r2
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r8.getHeight()
            int r2 = r8.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r8.getPaddingBottom()
            int r1 = r1 - r2
            int r4 = r8.getScrollY()
            int r0 = r0 - r1
            int r0 = java.lang.Math.max(r9, r0)
            int r10 = r10 + r4
            int r10 = java.lang.Math.min(r10, r0)
            int r9 = java.lang.Math.max(r9, r10)
            int r6 = r9 - r4
            android.widget.OverScroller r2 = r8.f1970c0
            int r3 = r8.getScrollX()
            r5 = 0
            r7 = r11
            r2.startScroll(r3, r4, r5, r6, r7)
            r8.m1035w(r12)
            goto L68
        L5a:
            android.widget.OverScroller r11 = r8.f1970c0
            boolean r11 = r11.isFinished()
            if (r11 != 0) goto L65
            r8.m1021a()
        L65:
            r8.scrollBy(r9, r10)
        L68:
            long r9 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r8.f1968a0 = r9
            return
    }
}
