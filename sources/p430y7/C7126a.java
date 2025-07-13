package p430y7;

/* renamed from: y7.a */
/* loaded from: classes.dex */
public class C7126a extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.material.bottomappbar.BottomAppBar f27535a;

    public C7126a(com.google.android.material.bottomappbar.BottomAppBar r1) {
            r0 = this;
            r0.f27535a = r1
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBar r2 = r1.f27535a
            com.google.android.material.bottomappbar.BottomAppBar.m3270w(r2)
            com.google.android.material.bottomappbar.BottomAppBar r2 = r1.f27535a
            r0 = 0
            r2.f5802N0 = r0
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r2) {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBar r2 = r1.f27535a
            int r0 = r2.f5807S0
            int r0 = r0 + 1
            r2.f5807S0 = r0
            return
    }
}
