package p333t1;

/* renamed from: t1.i */
/* loaded from: classes.dex */
public class C6105i extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ p319s.C5934a f23601a;

    /* renamed from: b */
    public final /* synthetic */ p333t1.AbstractC6104h f23602b;

    public C6105i(p333t1.AbstractC6104h r1, p319s.C5934a r2) {
            r0 = this;
            r0.f23602b = r1
            r0.f23601a = r2
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            s.a r0 = r1.f23601a
            r0.remove(r2)
            t1.h r0 = r1.f23602b
            java.util.ArrayList<android.animation.Animator> r0 = r0.f23588k0
            r0.remove(r2)
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r2) {
            r1 = this;
            t1.h r0 = r1.f23602b
            java.util.ArrayList<android.animation.Animator> r0 = r0.f23588k0
            r0.add(r2)
            return
    }
}
