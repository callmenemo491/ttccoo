package p250o8;

/* renamed from: o8.p */
/* loaded from: classes.dex */
public class C5172p extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ p250o8.C5173q f20283a;

    public C5172p(p250o8.C5173q r1) {
            r0 = this;
            r0.f20283a = r1
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator r4) {
            r3 = this;
            super.onAnimationRepeat(r4)
            o8.q r4 = r3.f20283a
            int r0 = r4.f20288g
            r1 = 1
            int r0 = r0 + r1
            o8.c r2 = r4.f20287f
            int[] r2 = r2.f20231c
            int r2 = r2.length
            int r0 = r0 % r2
            r4.f20288g = r0
            r4.f20289h = r1
            return
    }
}
