package com.google.android.material.transformation;

/* renamed from: com.google.android.material.transformation.a */
/* loaded from: classes.dex */
public class C1237a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ android.view.View f6573a;

    public C1237a(com.google.android.material.transformation.FabTransformationBehavior r1, android.view.View r2) {
            r0 = this;
            r0.f6573a = r2
            r0.<init>()
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator r1) {
            r0 = this;
            android.view.View r1 = r0.f6573a
            r1.invalidate()
            return
    }
}
