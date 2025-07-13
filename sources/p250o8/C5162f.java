package p250o8;

/* renamed from: o8.f */
/* loaded from: classes.dex */
public class C5162f extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ p250o8.C5163g f20240a;

    public C5162f(p250o8.C5163g r1) {
            r0 = this;
            r0.f20240a = r1
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            super.onAnimationEnd(r2)
            o8.g r2 = r1.f20240a
            r2.mo9197c()
            o8.g r2 = r1.f20240a
            u1.b r0 = r2.f20253k
            java.lang.Object r2 = r2.f17200a
            o8.n r2 = (p250o8.C5170n) r2
            r0.mo11469a(r2)
            return
    }
}
