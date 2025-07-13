package androidx.mediarouter.app;

/* renamed from: androidx.mediarouter.app.e */
/* loaded from: classes.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC0485e implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: Y */
    public final /* synthetic */ androidx.mediarouter.app.DialogC0487g f2666Y;

    public ViewTreeObserverOnGlobalLayoutListenerC0485e(androidx.mediarouter.app.DialogC0487g r1) {
            r0 = this;
            r0.f2666Y = r1
            r0.<init>()
            return
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
            r10 = this;
            androidx.mediarouter.app.g r0 = r10.f2666Y
            androidx.mediarouter.app.OverlayListView r0 = r0.f2728y0
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeGlobalOnLayoutListener(r10)
            androidx.mediarouter.app.g r0 = r10.f2666Y
            java.util.Set<f1.o$i> r1 = r0.f2671B0
            r2 = 1
            if (r1 == 0) goto L68
            int r1 = r1.size()
            if (r1 == 0) goto L68
            androidx.mediarouter.app.f r1 = new androidx.mediarouter.app.f
            r1.<init>(r0)
            androidx.mediarouter.app.OverlayListView r3 = r0.f2728y0
            int r3 = r3.getFirstVisiblePosition()
            r4 = 0
            r5 = 0
        L25:
            androidx.mediarouter.app.OverlayListView r6 = r0.f2728y0
            int r6 = r6.getChildCount()
            if (r4 >= r6) goto L6b
            androidx.mediarouter.app.OverlayListView r6 = r0.f2728y0
            android.view.View r6 = r6.getChildAt(r4)
            int r7 = r3 + r4
            androidx.mediarouter.app.g$m r8 = r0.f2729z0
            java.lang.Object r7 = r8.getItem(r7)
            f1.o$i r7 = (p085f1.C1974o.i) r7
            java.util.Set<f1.o$i> r8 = r0.f2671B0
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L65
            android.view.animation.AlphaAnimation r7 = new android.view.animation.AlphaAnimation
            r8 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            r7.<init>(r8, r9)
            int r8 = r0.f2700c1
            long r8 = (long) r8
            r7.setDuration(r8)
            r7.setFillEnabled(r2)
            r7.setFillAfter(r2)
            if (r5 != 0) goto L5f
            r7.setAnimationListener(r1)
            r5 = 1
        L5f:
            r6.clearAnimation()
            r6.startAnimation(r7)
        L65:
            int r4 = r4 + 1
            goto L25
        L68:
            r0.m1502i(r2)
        L6b:
            return
    }
}
