package p373v7;

import android.view.View;

/* renamed from: v7.c */
/* loaded from: classes.dex */
public abstract class AbstractC6580c<V extends android.view.View> extends p373v7.C6582e<V> {

    /* renamed from: c */
    public java.lang.Runnable f25734c;

    /* renamed from: d */
    public android.widget.OverScroller f25735d;

    /* renamed from: e */
    public boolean f25736e;

    /* renamed from: f */
    public int f25737f;

    /* renamed from: g */
    public int f25738g;

    /* renamed from: h */
    public int f25739h;

    /* renamed from: i */
    public android.view.VelocityTracker f25740i;

    /* renamed from: v7.c$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final androidx.coordinatorlayout.widget.CoordinatorLayout f25741Y;

        /* renamed from: Z */
        public final V f25742Z;

        /* renamed from: a0 */
        public final /* synthetic */ p373v7.AbstractC6580c f25743a0;

        public a(p373v7.AbstractC6580c r1, androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3) {
                r0 = this;
                r0.f25743a0 = r1
                r0.<init>()
                r0.f25741Y = r2
                r0.f25742Z = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                V extends android.view.View r0 = r4.f25742Z
                if (r0 == 0) goto L44
                v7.c r0 = r4.f25743a0
                android.widget.OverScroller r0 = r0.f25735d
                if (r0 == 0) goto L44
                boolean r0 = r0.computeScrollOffset()
                if (r0 == 0) goto L25
                v7.c r0 = r4.f25743a0
                androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r4.f25741Y
                V extends android.view.View r2 = r4.f25742Z
                android.widget.OverScroller r3 = r0.f25735d
                int r3 = r3.getCurrY()
                r0.m13449x(r1, r2, r3)
                V extends android.view.View r0 = r4.f25742Z
                p227n0.C4661t.c.m10565m(r0, r4)
                goto L44
            L25:
                v7.c r0 = r4.f25743a0
                androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r4.f25741Y
                V extends android.view.View r2 = r4.f25742Z
                com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r0
                java.util.Objects.requireNonNull(r0)
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                r0.m3251D(r1, r2)
                boolean r3 = r2.f5752j0
                if (r3 == 0) goto L44
                android.view.View r0 = r0.m3249B(r1)
                boolean r0 = r2.m3244d(r0)
                r2.m3243c(r0)
            L44:
                return
        }
    }

    public AbstractC6580c() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f25737f = r0
            r1.f25739h = r0
            return
    }

    public AbstractC6580c(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = -1
            r0.f25737f = r1
            r0.f25739h = r1
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: g */
    public boolean mo991g(androidx.coordinatorlayout.widget.CoordinatorLayout r8, V r9, android.view.MotionEvent r10) {
            r7 = this;
            int r0 = r7.f25739h
            if (r0 >= 0) goto L12
            android.content.Context r0 = r8.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r7.f25739h = r0
        L12:
            int r0 = r10.getActionMasked()
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L40
            boolean r0 = r7.f25736e
            if (r0 == 0) goto L40
            int r0 = r7.f25737f
            if (r0 != r2) goto L25
            return r3
        L25:
            int r0 = r10.findPointerIndex(r0)
            if (r0 != r2) goto L2c
            return r3
        L2c:
            float r0 = r10.getY(r0)
            int r0 = (int) r0
            int r1 = r7.f25738g
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r5 = r7.f25739h
            if (r1 <= r5) goto L40
            r7.f25738g = r0
            return r4
        L40:
            int r0 = r10.getActionMasked()
            if (r0 != 0) goto La5
            r7.f25737f = r2
            float r0 = r10.getX()
            int r0 = (int) r0
            float r1 = r10.getY()
            int r1 = (int) r1
            r5 = r7
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r5 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r5
            r6 = r9
            com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
            java.lang.ref.WeakReference<android.view.View> r5 = r5.f5764p
            if (r5 == 0) goto L73
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L71
            boolean r6 = r5.isShown()
            if (r6 == 0) goto L71
            boolean r2 = r5.canScrollVertically(r2)
            if (r2 != 0) goto L71
            goto L73
        L71:
            r2 = 0
            goto L74
        L73:
            r2 = 1
        L74:
            if (r2 == 0) goto L7e
            boolean r8 = r8.m974p(r9, r0, r1)
            if (r8 == 0) goto L7e
            r8 = 1
            goto L7f
        L7e:
            r8 = 0
        L7f:
            r7.f25736e = r8
            if (r8 == 0) goto La5
            r7.f25738g = r1
            int r8 = r10.getPointerId(r3)
            r7.f25737f = r8
            android.view.VelocityTracker r8 = r7.f25740i
            if (r8 != 0) goto L95
            android.view.VelocityTracker r8 = android.view.VelocityTracker.obtain()
            r7.f25740i = r8
        L95:
            android.widget.OverScroller r8 = r7.f25735d
            if (r8 == 0) goto La5
            boolean r8 = r8.isFinished()
            if (r8 != 0) goto La5
            android.widget.OverScroller r8 = r7.f25735d
            r8.abortAnimation()
            return r4
        La5:
            android.view.VelocityTracker r8 = r7.f25740i
            if (r8 == 0) goto Lac
            r8.addMovement(r10)
        Lac:
            return r3
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: r */
    public boolean mo1002r(androidx.coordinatorlayout.widget.CoordinatorLayout r21, V r22, android.view.MotionEvent r23) {
            r20 = this;
            r6 = r20
            r1 = r21
            r2 = r22
            r7 = r23
            int r0 = r23.getActionMasked()
            r8 = 1
            r9 = 0
            r3 = 0
            r4 = -1
            if (r0 == r8) goto L5e
            r5 = 2
            if (r0 == r5) goto L36
            r1 = 3
            if (r0 == r1) goto Ld7
            r1 = 6
            if (r0 == r1) goto L1c
            goto L5b
        L1c:
            int r0 = r23.getActionIndex()
            if (r0 != 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            int r1 = r7.getPointerId(r0)
            r6.f25737f = r1
            float r0 = r7.getY(r0)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r6.f25738g = r0
            goto L5b
        L36:
            int r0 = r6.f25737f
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r4) goto L3f
            return r9
        L3f:
            float r0 = r7.getY(r0)
            int r0 = (int) r0
            int r3 = r6.f25738g
            int r3 = r3 - r0
            r6.f25738g = r0
            r0 = r2
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            int r0 = r0.getDownNestedScrollRange()
            int r4 = -r0
            r5 = 0
            r0 = r20
            r1 = r21
            r2 = r22
            r0.m13448w(r1, r2, r3, r4, r5)
        L5b:
            r0 = 0
            goto Le5
        L5e:
            android.view.VelocityTracker r0 = r6.f25740i
            if (r0 == 0) goto Ld7
            r0.addMovement(r7)
            android.view.VelocityTracker r0 = r6.f25740i
            r5 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r5)
            android.view.VelocityTracker r0 = r6.f25740i
            int r5 = r6.f25737f
            float r0 = r0.getYVelocity(r5)
            r5 = r2
            com.google.android.material.appbar.AppBarLayout r5 = (com.google.android.material.appbar.AppBarLayout) r5
            int r10 = r5.getTotalScrollRange()
            int r10 = -r10
            r19 = 0
            java.lang.Runnable r11 = r6.f25734c
            if (r11 == 0) goto L87
            r2.removeCallbacks(r11)
            r6.f25734c = r3
        L87:
            android.widget.OverScroller r11 = r6.f25735d
            if (r11 != 0) goto L96
            android.widget.OverScroller r11 = new android.widget.OverScroller
            android.content.Context r12 = r22.getContext()
            r11.<init>(r12)
            r6.f25735d = r11
        L96:
            android.widget.OverScroller r11 = r6.f25735d
            r12 = 0
            int r13 = r20.m13452s()
            r14 = 0
            int r15 = java.lang.Math.round(r0)
            r16 = 0
            r17 = 0
            r18 = r10
            r11.fling(r12, r13, r14, r15, r16, r17, r18, r19)
            android.widget.OverScroller r0 = r6.f25735d
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto Lc0
            v7.c$a r0 = new v7.c$a
            r0.<init>(r6, r1, r2)
            r6.f25734c = r0
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10565m(r2, r0)
            goto Ld5
        Lc0:
            r0 = r6
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r0
            r0.m3251D(r1, r5)
            boolean r2 = r5.f5752j0
            if (r2 == 0) goto Ld5
            android.view.View r0 = r0.m3249B(r1)
            boolean r0 = r5.m3244d(r0)
            r5.m3243c(r0)
        Ld5:
            r0 = 1
            goto Ld8
        Ld7:
            r0 = 0
        Ld8:
            r6.f25736e = r9
            r6.f25737f = r4
            android.view.VelocityTracker r1 = r6.f25740i
            if (r1 == 0) goto Le5
            r1.recycle()
            r6.f25740i = r3
        Le5:
            android.view.VelocityTracker r1 = r6.f25740i
            if (r1 == 0) goto Lec
            r1.addMovement(r7)
        Lec:
            boolean r1 = r6.f25736e
            if (r1 != 0) goto Lf4
            if (r0 == 0) goto Lf3
            goto Lf4
        Lf3:
            r8 = 0
        Lf4:
            return r8
    }

    /* renamed from: v */
    public abstract int mo3254v();

    /* renamed from: w */
    public final int m13448w(androidx.coordinatorlayout.widget.CoordinatorLayout r8, V r9, int r10, int r11, int r12) {
            r7 = this;
            int r0 = r7.mo3254v()
            int r4 = r0 - r10
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            int r8 = r1.mo3255y(r2, r3, r4, r5, r6)
            return r8
    }

    /* renamed from: x */
    public int m13449x(androidx.coordinatorlayout.widget.CoordinatorLayout r7, V r8, int r9) {
            r6 = this;
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2147483647(0x7fffffff, float:NaN)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            int r7 = r0.mo3255y(r1, r2, r3, r4, r5)
            return r7
    }

    /* renamed from: y */
    public abstract int mo3255y(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, int r3, int r4, int r5);
}
