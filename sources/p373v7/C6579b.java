package p373v7;

/* renamed from: v7.b */
/* loaded from: classes.dex */
public class C6579b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ p340t8.C6189f f25733a;

    public C6579b(com.google.android.material.appbar.AppBarLayout r1, p340t8.C6189f r2) {
            r0 = this;
            r0.f25733a = r2
            r0.<init>()
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator r2) {
            r1 = this;
            t8.f r0 = r1.f25733a
            java.lang.Object r2 = r2.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r0.m12772p(r2)
            return
    }
}
