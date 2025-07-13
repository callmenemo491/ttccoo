package p301r1;

/* renamed from: r1.b */
/* loaded from: classes.dex */
public class C5762b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ p301r1.C5764d.a f22183a;

    /* renamed from: b */
    public final /* synthetic */ p301r1.C5764d f22184b;

    public C5762b(p301r1.C5764d r1, p301r1.C5764d.a r2) {
            r0 = this;
            r0.f22184b = r1
            r0.f22183a = r2
            r0.<init>()
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator r4) {
            r3 = this;
            java.lang.Object r4 = r4.getAnimatedValue()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r1.d r0 = r3.f22184b
            r1.d$a r1 = r3.f22183a
            r0.m12082f(r4, r1)
            r1.d r0 = r3.f22184b
            r1.d$a r1 = r3.f22183a
            r2 = 0
            r0.m12077a(r4, r1, r2)
            r1.d r4 = r3.f22184b
            r4.invalidateSelf()
            return
    }
}
