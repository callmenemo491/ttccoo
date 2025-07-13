package p250o8;

/* renamed from: o8.r */
/* loaded from: classes.dex */
public class C5174r extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ p250o8.C5175s f20291a;

    public C5174r(p250o8.C5175s r1) {
            r0 = this;
            r0.f20291a = r1
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            super.onAnimationEnd(r2)
            o8.s r2 = r1.f20291a
            boolean r0 = r2.f20301j
            if (r0 == 0) goto L1f
            android.animation.ObjectAnimator r2 = r2.f20295d
            r0 = -1
            r2.setRepeatCount(r0)
            o8.s r2 = r1.f20291a
            u1.b r0 = r2.f20302k
            java.lang.Object r2 = r2.f17200a
            o8.n r2 = (p250o8.C5170n) r2
            r0.mo11469a(r2)
            o8.s r2 = r1.f20291a
            r0 = 0
            r2.f20301j = r0
        L1f:
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator r4) {
            r3 = this;
            super.onAnimationRepeat(r4)
            o8.s r4 = r3.f20291a
            int r0 = r4.f20298g
            r1 = 1
            int r0 = r0 + r1
            o8.c r2 = r4.f20297f
            int[] r2 = r2.f20231c
            int r2 = r2.length
            int r0 = r0 % r2
            r4.f20298g = r0
            r4.f20299h = r1
            return
    }
}
