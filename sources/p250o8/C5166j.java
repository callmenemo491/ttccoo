package p250o8;

/* renamed from: o8.j */
/* loaded from: classes.dex */
public class C5166j extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ p250o8.AbstractC5168l f20263a;

    public C5166j(p250o8.AbstractC5168l r1) {
            r0 = this;
            r0.f20263a = r1
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r2) {
            r1 = this;
            super.onAnimationStart(r2)
            o8.l r2 = r1.f20263a
            java.util.List<u1.b> r0 = r2.f20271d0
            if (r0 == 0) goto L21
            boolean r2 = r2.f20272e0
            if (r2 != 0) goto L21
            java.util.Iterator r2 = r0.iterator()
        L11:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r0 = r2.next()
            u1.b r0 = (p348u1.AbstractC6284b) r0
            java.util.Objects.requireNonNull(r0)
            goto L11
        L21:
            return
    }
}
