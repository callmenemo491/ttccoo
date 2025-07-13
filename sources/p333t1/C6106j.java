package p333t1;

/* renamed from: t1.j */
/* loaded from: classes.dex */
public class C6106j extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ p333t1.AbstractC6104h f23603a;

    public C6106j(p333t1.AbstractC6104h r1) {
            r0 = this;
            r0.f23603a = r1
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            t1.h r0 = r1.f23603a
            r0.m12624q()
            r2.removeListener(r1)
            return
    }
}
