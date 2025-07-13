package com.google.android.material.transformation;

/* renamed from: com.google.android.material.transformation.c */
/* loaded from: classes.dex */
public class C1239c extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ p092f8.InterfaceC2082d f6576a;

    public C1239c(com.google.android.material.transformation.FabTransformationBehavior r1, p092f8.InterfaceC2082d r2) {
            r0 = this;
            r0.f6576a = r2
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            f8.d r2 = r1.f6576a
            f8.d$e r2 = r2.getRevealInfo()
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2.f9502c = r0
            f8.d r0 = r1.f6576a
            r0.setRevealInfo(r2)
            return
    }
}
