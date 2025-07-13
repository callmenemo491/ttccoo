package p250o8;

/* renamed from: o8.k */
/* loaded from: classes.dex */
public class C5167k extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ p250o8.AbstractC5168l f20264a;

    public C5167k(p250o8.AbstractC5168l r1) {
            r0 = this;
            r0.f20264a = r1
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r3) {
            r2 = this;
            super.onAnimationEnd(r3)
            o8.l r3 = r2.f20264a
            r0 = 0
            p250o8.AbstractC5168l.m11481a(r3, r0, r0)
            o8.l r3 = r2.f20264a
            java.util.List<u1.b> r0 = r3.f20271d0
            if (r0 == 0) goto L27
            boolean r1 = r3.f20272e0
            if (r1 != 0) goto L27
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            u1.b r1 = (p348u1.AbstractC6284b) r1
            r1.mo11469a(r3)
            goto L17
        L27:
            return
    }
}
