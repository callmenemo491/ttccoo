package p301r1;

/* renamed from: r1.c */
/* loaded from: classes.dex */
public class C5763c implements android.animation.Animator.AnimatorListener {

    /* renamed from: a */
    public final /* synthetic */ p301r1.C5764d.a f22185a;

    /* renamed from: b */
    public final /* synthetic */ p301r1.C5764d f22186b;

    public C5763c(p301r1.C5764d r1, p301r1.C5764d.a r2) {
            r0 = this;
            r0.f22186b = r1
            r0.f22185a = r2
            r0.<init>()
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator r1) {
            r0 = this;
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r1) {
            r0 = this;
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator r5) {
            r4 = this;
            r1.d r0 = r4.f22186b
            r1.d$a r1 = r4.f22185a
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            r0.m12077a(r2, r1, r3)
            r1.d$a r0 = r4.f22185a
            float r1 = r0.f22200e
            r0.f22206k = r1
            float r1 = r0.f22201f
            r0.f22207l = r1
            float r1 = r0.f22202g
            r0.f22208m = r1
            int r1 = r0.f22205j
            int r1 = r1 + r3
            int[] r3 = r0.f22204i
            int r3 = r3.length
            int r1 = r1 % r3
            r0.m12083a(r1)
            r1.d r0 = r4.f22186b
            boolean r1 = r0.f22195d0
            if (r1 == 0) goto L3c
            r1 = 0
            r0.f22195d0 = r1
            r5.cancel()
            r2 = 1332(0x534, double:6.58E-321)
            r5.setDuration(r2)
            r5.start()
            r1.d$a r5 = r4.f22185a
            r5.m12084b(r1)
            goto L41
        L3c:
            float r5 = r0.f22194c0
            float r5 = r5 + r2
            r0.f22194c0 = r5
        L41:
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r2) {
            r1 = this;
            r1.d r2 = r1.f22186b
            r0 = 0
            r2.f22194c0 = r0
            return
    }
}
