package com.google.android.material.behavior;

import android.view.View;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c<V> {

    /* renamed from: a */
    public int f5783a;

    /* renamed from: b */
    public int f5784b;

    /* renamed from: c */
    public int f5785c;

    /* renamed from: d */
    public android.view.ViewPropertyAnimator f5786d;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    public class C1121a extends android.animation.AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ com.google.android.material.behavior.HideBottomViewOnScrollBehavior f5787a;

        public C1121a(com.google.android.material.behavior.HideBottomViewOnScrollBehavior r1) {
                r0 = this;
                r0.f5787a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                com.google.android.material.behavior.HideBottomViewOnScrollBehavior r2 = r1.f5787a
                r0 = 0
                r2.f5786d = r0
                return
        }
    }

    public HideBottomViewOnScrollBehavior() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f5783a = r0
            r1 = 2
            r2.f5784b = r1
            r2.f5785c = r0
            return
    }

    public HideBottomViewOnScrollBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.f5783a = r1
            r2 = 2
            r0.f5784b = r2
            r0.f5785c = r1
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: h */
    public boolean mo992h(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, int r3) {
            r0 = this;
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r2 = r2.getMeasuredHeight()
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r0.f5783a = r2
            r1 = 0
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: l */
    public void mo996l(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, int r4, int r5, int r6, int r7, int r8, int[] r9) {
            r0 = this;
            if (r5 <= 0) goto L24
            int r1 = r0.f5784b
            r3 = 1
            if (r1 != r3) goto L8
            goto L42
        L8:
            android.view.ViewPropertyAnimator r1 = r0.f5786d
            if (r1 == 0) goto L12
            r1.cancel()
            r2.clearAnimation()
        L12:
            r0.f5784b = r3
            int r1 = r0.f5783a
            int r3 = r0.f5785c
            int r6 = r1 + r3
            r7 = 175(0xaf, double:8.65E-322)
            android.animation.TimeInterpolator r9 = p354u7.C6350a.f24805c
            r4 = r0
            r5 = r2
            r4.m3259s(r5, r6, r7, r9)
            goto L42
        L24:
            if (r5 >= 0) goto L42
            int r1 = r0.f5784b
            r3 = 2
            if (r1 != r3) goto L2c
            goto L42
        L2c:
            android.view.ViewPropertyAnimator r1 = r0.f5786d
            if (r1 == 0) goto L36
            r1.cancel()
            r2.clearAnimation()
        L36:
            r0.f5784b = r3
            r6 = 0
            r7 = 225(0xe1, double:1.11E-321)
            android.animation.TimeInterpolator r9 = p354u7.C6350a.f24806d
            r4 = r0
            r5 = r2
            r4.m3259s(r5, r6, r7, r9)
        L42:
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0338c
    /* renamed from: p */
    public boolean mo1000p(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, android.view.View r4, int r5, int r6) {
            r0 = this;
            r1 = 2
            if (r5 != r1) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            return r1
    }

    /* renamed from: s */
    public final void m3259s(V r1, int r2, long r3, android.animation.TimeInterpolator r5) {
            r0 = this;
            android.view.ViewPropertyAnimator r1 = r1.animate()
            float r2 = (float) r2
            android.view.ViewPropertyAnimator r1 = r1.translationY(r2)
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r5)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r3)
            com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a r2 = new com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a
            r2.<init>(r0)
            android.view.ViewPropertyAnimator r1 = r1.setListener(r2)
            r0.f5786d = r1
            return
    }
}
