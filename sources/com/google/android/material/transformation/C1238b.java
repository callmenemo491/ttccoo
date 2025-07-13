package com.google.android.material.transformation;

/* renamed from: com.google.android.material.transformation.b */
/* loaded from: classes.dex */
public class C1238b extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ p092f8.InterfaceC2082d f6574a;

    /* renamed from: b */
    public final /* synthetic */ android.graphics.drawable.Drawable f6575b;

    public C1238b(com.google.android.material.transformation.FabTransformationBehavior r1, p092f8.InterfaceC2082d r2, android.graphics.drawable.Drawable r3) {
            r0 = this;
            r0.f6574a = r2
            r0.f6575b = r3
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            f8.d r2 = r1.f6574a
            r0 = 0
            r2.setCircularRevealOverlayDrawable(r0)
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r2) {
            r1 = this;
            f8.d r2 = r1.f6574a
            android.graphics.drawable.Drawable r0 = r1.f6575b
            r2.setCircularRevealOverlayDrawable(r0)
            return
    }
}
