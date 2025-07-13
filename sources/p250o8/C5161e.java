package p250o8;

/* renamed from: o8.e */
/* loaded from: classes.dex */
public class C5161e extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ p250o8.C5163g f20239a;

    public C5161e(p250o8.C5163g r1) {
            r0 = this;
            r0.f20239a = r1
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator r3) {
            r2 = this;
            super.onAnimationRepeat(r3)
            o8.g r3 = r2.f20239a
            int r0 = r3.f20250h
            int r0 = r0 + 4
            o8.c r1 = r3.f20249g
            int[] r1 = r1.f20231c
            int r1 = r1.length
            int r0 = r0 % r1
            r3.f20250h = r0
            return
    }
}
