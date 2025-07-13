package com.google.android.material.appbar;

/* renamed from: com.google.android.material.appbar.a */
/* loaded from: classes.dex */
public class C1118a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout f5773a;

    /* renamed from: b */
    public final /* synthetic */ com.google.android.material.appbar.AppBarLayout f5774b;

    /* renamed from: c */
    public final /* synthetic */ com.google.android.material.appbar.AppBarLayout.BaseBehavior f5775c;

    public C1118a(com.google.android.material.appbar.AppBarLayout.BaseBehavior r1, androidx.coordinatorlayout.widget.CoordinatorLayout r2, com.google.android.material.appbar.AppBarLayout r3) {
            r0 = this;
            r0.f5775c = r1
            r0.f5773a = r2
            r0.f5774b = r3
            r0.<init>()
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator r4) {
            r3 = this;
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = r3.f5775c
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r3.f5773a
            com.google.android.material.appbar.AppBarLayout r2 = r3.f5774b
            java.lang.Object r4 = r4.getAnimatedValue()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.m13449x(r1, r2, r4)
            return
    }
}
