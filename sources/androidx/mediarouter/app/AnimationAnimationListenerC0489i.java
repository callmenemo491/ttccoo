package androidx.mediarouter.app;

/* renamed from: androidx.mediarouter.app.i */
/* loaded from: classes.dex */
public class AnimationAnimationListenerC0489i implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ androidx.mediarouter.app.DialogC0487g f2755a;

    public AnimationAnimationListenerC0489i(androidx.mediarouter.app.DialogC0487g r1) {
            r0 = this;
            r0.f2755a = r1
            r0.<init>()
            return
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation r1) {
            r0 = this;
            return
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation r1) {
            r0 = this;
            return
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation r5) {
            r4 = this;
            androidx.mediarouter.app.g r5 = r4.f2755a
            androidx.mediarouter.app.OverlayListView r5 = r5.f2728y0
            java.util.List<androidx.mediarouter.app.OverlayListView$a> r0 = r5.f2603a0
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            androidx.mediarouter.app.OverlayListView$a r1 = (androidx.mediarouter.app.OverlayListView.C0480a) r1
            boolean r2 = r1.f2614k
            if (r2 != 0) goto La
            long r2 = r5.getDrawingTime()
            r1.f2613j = r2
            r2 = 1
            r1.f2614k = r2
            goto La
        L24:
            androidx.mediarouter.app.g r5 = r4.f2755a
            androidx.mediarouter.app.OverlayListView r0 = r5.f2728y0
            java.lang.Runnable r1 = r5.f2712i1
            int r5 = r5.f2698b1
            long r2 = (long) r5
            r0.postDelayed(r1, r2)
            return
    }
}
