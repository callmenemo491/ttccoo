package p092f8;

/* renamed from: f8.b */
/* loaded from: classes.dex */
public final class C2080b {
    /* renamed from: a */
    public static android.animation.Animator m5503a(p092f8.InterfaceC2082d r6, float r7, float r8, float r9) {
            android.util.Property<f8.d, f8.d$e> r0 = p092f8.InterfaceC2082d.c.f9498a
            android.animation.TypeEvaluator<f8.d$e> r1 = p092f8.InterfaceC2082d.b.f9496b
            r2 = 1
            f8.d$e[] r3 = new p092f8.InterfaceC2082d.e[r2]
            f8.d$e r4 = new f8.d$e
            r4.<init>(r7, r8, r9)
            r5 = 0
            r3[r5] = r4
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofObject(r6, r0, r1, r3)
            f8.d$e r1 = r6.getRevealInfo()
            if (r1 == 0) goto L33
            float r1 = r1.f9502c
            android.view.View r6 = (android.view.View) r6
            int r7 = (int) r7
            int r8 = (int) r8
            android.animation.Animator r6 = android.view.ViewAnimationUtils.createCircularReveal(r6, r7, r8, r1, r9)
            android.animation.AnimatorSet r7 = new android.animation.AnimatorSet
            r7.<init>()
            r8 = 2
            android.animation.Animator[] r8 = new android.animation.Animator[r8]
            r8[r5] = r0
            r8[r2] = r6
            r7.playTogether(r8)
            return r7
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Caller must set a non-null RevealInfo before calling this."
            r6.<init>(r7)
            throw r6
    }
}
