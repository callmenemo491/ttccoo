package p092f8;

/* renamed from: f8.a */
/* loaded from: classes.dex */
public final class C2079a extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ p092f8.InterfaceC2082d f9495a;

    public C2079a(p092f8.InterfaceC2082d r1) {
            r0 = this;
            r0.f9495a = r1
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r1) {
            r0 = this;
            f8.d r1 = r0.f9495a
            r1.mo5504a()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            f8.d r1 = r0.f9495a
            r1.mo5505b()
            return
    }
}
