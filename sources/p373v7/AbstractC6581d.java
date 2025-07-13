package p373v7;

/* renamed from: v7.d */
/* loaded from: classes.dex */
public abstract class AbstractC6581d extends p373v7.C6582e<android.view.View> {

    /* renamed from: c */
    public final android.graphics.Rect f25744c;

    /* renamed from: d */
    public final android.graphics.Rect f25745d;

    /* renamed from: e */
    public int f25746e;

    /* renamed from: f */
    public int f25747f;

    public AbstractC6581d() {
            r1 = this;
            r1.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f25744c = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f25745d = r0
            r0 = 0
            r1.f25746e = r0
            return
    }

    public AbstractC6581d(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f25744c = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f25745d = r1
            r1 = 0
            r0.f25746e = r1
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: i */
    public boolean mo993i(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10, int r11, int r12, int r13) {
            r7 = this;
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            int r0 = r0.height
            r1 = -1
            if (r0 == r1) goto Lc
            r2 = -2
            if (r0 != r2) goto L5b
        Lc:
            java.util.List r2 = r8.m968e(r9)
            r3 = r7
            com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r3 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r3
            com.google.android.material.appbar.AppBarLayout r2 = r3.m3257w(r2)
            if (r2 == 0) goto L5b
            int r12 = android.view.View.MeasureSpec.getSize(r12)
            if (r12 <= 0) goto L38
            java.util.WeakHashMap<android.view.View, n0.w> r3 = p227n0.C4661t.f18570a
            boolean r3 = p227n0.C4661t.c.m10554b(r2)
            if (r3 == 0) goto L3c
            n0.a0 r3 = r8.getLastWindowInsets()
            if (r3 == 0) goto L3c
            int r4 = r3.m10468d()
            int r3 = r3.m10465a()
            int r3 = r3 + r4
            int r12 = r12 + r3
            goto L3c
        L38:
            int r12 = r8.getHeight()
        L3c:
            int r3 = r2.getTotalScrollRange()
            int r12 = r12 + r3
            int r2 = r2.getMeasuredHeight()
            int r12 = r12 - r2
            if (r0 != r1) goto L4b
            r0 = 1073741824(0x40000000, float:2.0)
            goto L4d
        L4b:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L4d:
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r0)
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r1.m977s(r2, r3, r4, r5, r6)
            r8 = 1
            return r8
        L5b:
            r8 = 0
            return r8
    }

    @Override // p373v7.C6582e
    /* renamed from: t */
    public void mo13450t(androidx.coordinatorlayout.widget.CoordinatorLayout r9, android.view.View r10, int r11) {
            r8 = this;
            java.util.List r0 = r9.m968e(r10)
            r1 = r8
            com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r1 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r1
            com.google.android.material.appbar.AppBarLayout r0 = r1.m3257w(r0)
            if (r0 == 0) goto L9d
            android.view.ViewGroup$LayoutParams r1 = r10.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r1
            android.graphics.Rect r5 = r8.f25744c
            int r2 = r9.getPaddingLeft()
            int r3 = r1.leftMargin
            int r2 = r2 + r3
            int r3 = r0.getBottom()
            int r4 = r1.topMargin
            int r3 = r3 + r4
            int r4 = r9.getWidth()
            int r6 = r9.getPaddingRight()
            int r4 = r4 - r6
            int r6 = r1.rightMargin
            int r4 = r4 - r6
            int r6 = r9.getHeight()
            int r7 = r0.getBottom()
            int r7 = r7 + r6
            int r6 = r9.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r1.bottomMargin
            int r7 = r7 - r6
            r5.set(r2, r3, r4, r7)
            n0.a0 r2 = r9.getLastWindowInsets()
            if (r2 == 0) goto L69
            java.util.WeakHashMap<android.view.View, n0.w> r3 = p227n0.C4661t.f18570a
            boolean r9 = p227n0.C4661t.c.m10554b(r9)
            if (r9 == 0) goto L69
            boolean r9 = p227n0.C4661t.c.m10554b(r10)
            if (r9 != 0) goto L69
            int r9 = r5.left
            int r3 = r2.m10466b()
            int r3 = r3 + r9
            r5.left = r3
            int r9 = r5.right
            int r2 = r2.m10467c()
            int r9 = r9 - r2
            r5.right = r9
        L69:
            android.graphics.Rect r9 = r8.f25745d
            int r1 = r1.f1932c
            if (r1 != 0) goto L76
            r1 = 8388659(0x800033, float:1.1755015E-38)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            goto L77
        L76:
            r2 = r1
        L77:
            int r3 = r10.getMeasuredWidth()
            int r4 = r10.getMeasuredHeight()
            r6 = r9
            r7 = r11
            android.view.Gravity.apply(r2, r3, r4, r5, r6, r7)
            int r11 = r8.m13451v(r0)
            int r1 = r9.left
            int r2 = r9.top
            int r2 = r2 - r11
            int r3 = r9.right
            int r4 = r9.bottom
            int r4 = r4 - r11
            r10.layout(r1, r2, r3, r4)
            int r9 = r9.top
            int r10 = r0.getBottom()
            int r9 = r9 - r10
            goto La1
        L9d:
            r9.m976r(r10, r11)
            r9 = 0
        La1:
            r8.f25746e = r9
            return
    }

    /* renamed from: v */
    public final int m13451v(android.view.View r6) {
            r5 = this;
            int r0 = r5.f25747f
            r1 = 0
            if (r0 != 0) goto L6
            goto L43
        L6:
            boolean r0 = r6 instanceof com.google.android.material.appbar.AppBarLayout
            r2 = 0
            if (r0 == 0) goto L39
            com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
            int r0 = r6.getTotalScrollRange()
            int r3 = r6.getDownNestedPreScrollRange()
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f1930a
            boolean r4 = r6 instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior
            if (r4 == 0) goto L28
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r6 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r6
            int r6 = r6.mo3254v()
            goto L29
        L28:
            r6 = 0
        L29:
            if (r3 == 0) goto L30
            int r4 = r0 + r6
            if (r4 > r3) goto L30
            goto L39
        L30:
            int r0 = r0 - r3
            if (r0 == 0) goto L39
            r2 = 1065353216(0x3f800000, float:1.0)
            float r6 = (float) r6
            float r0 = (float) r0
            float r6 = r6 / r0
            float r2 = r2 + r6
        L39:
            int r6 = r5.f25747f
            float r0 = (float) r6
            float r2 = r2 * r0
            int r0 = (int) r2
            int r1 = p064e.C1492f.m4042b(r0, r1, r6)
        L43:
            return r1
    }
}
