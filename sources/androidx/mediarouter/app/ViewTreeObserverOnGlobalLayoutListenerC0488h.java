package androidx.mediarouter.app;

/* renamed from: androidx.mediarouter.app.h */
/* loaded from: classes.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC0488h implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: Y */
    public final /* synthetic */ java.util.Map f2752Y;

    /* renamed from: Z */
    public final /* synthetic */ java.util.Map f2753Z;

    /* renamed from: a0 */
    public final /* synthetic */ androidx.mediarouter.app.DialogC0487g f2754a0;

    public ViewTreeObserverOnGlobalLayoutListenerC0488h(androidx.mediarouter.app.DialogC0487g r1, java.util.Map r2, java.util.Map r3) {
            r0 = this;
            r0.f2754a0 = r1
            r0.f2752Y = r2
            r0.f2753Z = r3
            r0.<init>()
            return
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
            r17 = this;
            r0 = r17
            androidx.mediarouter.app.g r1 = r0.f2754a0
            androidx.mediarouter.app.OverlayListView r1 = r1.f2728y0
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r1.removeGlobalOnLayoutListener(r0)
            androidx.mediarouter.app.g r1 = r0.f2754a0
            java.util.Map r2 = r0.f2752Y
            java.util.Map r3 = r0.f2753Z
            java.util.Set<f1.o$i> r4 = r1.f2671B0
            if (r4 == 0) goto L129
            java.util.Set<f1.o$i> r5 = r1.f2672C0
            if (r5 != 0) goto L1d
            goto L129
        L1d:
            int r4 = r4.size()
            java.util.Set<f1.o$i> r5 = r1.f2672C0
            int r5 = r5.size()
            int r4 = r4 - r5
            androidx.mediarouter.app.i r5 = new androidx.mediarouter.app.i
            r5.<init>(r1)
            androidx.mediarouter.app.OverlayListView r6 = r1.f2728y0
            int r6 = r6.getFirstVisiblePosition()
            r7 = 0
            r8 = 0
        L35:
            androidx.mediarouter.app.OverlayListView r9 = r1.f2728y0
            int r9 = r9.getChildCount()
            r10 = 0
            if (r7 >= r9) goto Lbb
            androidx.mediarouter.app.OverlayListView r9 = r1.f2728y0
            android.view.View r9 = r9.getChildAt(r7)
            int r11 = r6 + r7
            androidx.mediarouter.app.g$m r12 = r1.f2729z0
            java.lang.Object r11 = r12.getItem(r11)
            f1.o$i r11 = (p085f1.C1974o.i) r11
            java.lang.Object r12 = r2.get(r11)
            android.graphics.Rect r12 = (android.graphics.Rect) r12
            int r13 = r9.getTop()
            if (r12 == 0) goto L5d
            int r12 = r12.top
            goto L62
        L5d:
            int r12 = r1.f2678I0
            int r12 = r12 * r4
            int r12 = r12 + r13
        L62:
            android.view.animation.AnimationSet r14 = new android.view.animation.AnimationSet
            r15 = 1
            r14.<init>(r15)
            java.util.Set<f1.o$i> r15 = r1.f2671B0
            if (r15 == 0) goto L84
            boolean r15 = r15.contains(r11)
            if (r15 == 0) goto L84
            android.view.animation.AlphaAnimation r12 = new android.view.animation.AlphaAnimation
            r12.<init>(r10, r10)
            int r15 = r1.f2700c1
            r16 = r11
            long r10 = (long) r15
            r12.setDuration(r10)
            r14.addAnimation(r12)
            r12 = r13
            goto L86
        L84:
            r16 = r11
        L86:
            android.view.animation.TranslateAnimation r10 = new android.view.animation.TranslateAnimation
            int r12 = r12 - r13
            float r11 = (float) r12
            r12 = 0
            r10.<init>(r12, r12, r11, r12)
            int r11 = r1.f2698b1
            long r11 = (long) r11
            r10.setDuration(r11)
            r14.addAnimation(r10)
            r10 = 1
            r14.setFillAfter(r10)
            r14.setFillEnabled(r10)
            android.view.animation.Interpolator r11 = r1.f2704e1
            r14.setInterpolator(r11)
            if (r8 != 0) goto La9
            r14.setAnimationListener(r5)
            r8 = 1
        La9:
            r9.clearAnimation()
            r9.startAnimation(r14)
            r11 = r16
            r2.remove(r11)
            r3.remove(r11)
            int r7 = r7 + 1
            goto L35
        Lbb:
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        Lc3:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L129
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            f1.o$i r6 = (p085f1.C1974o.i) r6
            java.lang.Object r5 = r5.getValue()
            android.graphics.drawable.BitmapDrawable r5 = (android.graphics.drawable.BitmapDrawable) r5
            java.lang.Object r7 = r2.get(r6)
            android.graphics.Rect r7 = (android.graphics.Rect) r7
            java.util.Set<f1.o$i> r8 = r1.f2672C0
            boolean r8 = r8.contains(r6)
            if (r8 == 0) goto Lff
            androidx.mediarouter.app.OverlayListView$a r6 = new androidx.mediarouter.app.OverlayListView$a
            r6.<init>(r5, r7)
            r5 = 1065353216(0x3f800000, float:1.0)
            r6.f2611h = r5
            r8 = 0
            r6.f2612i = r8
            int r5 = r1.f2702d1
            long r9 = (long) r5
            r6.f2608e = r9
            android.view.animation.Interpolator r5 = r1.f2704e1
            r6.f2607d = r5
            goto L121
        Lff:
            r8 = 0
            int r9 = r1.f2678I0
            int r9 = r9 * r4
            androidx.mediarouter.app.OverlayListView$a r10 = new androidx.mediarouter.app.OverlayListView$a
            r10.<init>(r5, r7)
            r10.f2610g = r9
            int r5 = r1.f2698b1
            long r11 = (long) r5
            r10.f2608e = r11
            android.view.animation.Interpolator r5 = r1.f2704e1
            r10.f2607d = r5
            androidx.mediarouter.app.d r5 = new androidx.mediarouter.app.d
            r5.<init>(r1, r6)
            r10.f2616m = r5
            java.util.Set<f1.o$i> r5 = r1.f2673D0
            r5.add(r6)
            r6 = r10
        L121:
            androidx.mediarouter.app.OverlayListView r5 = r1.f2728y0
            java.util.List<androidx.mediarouter.app.OverlayListView$a> r5 = r5.f2603a0
            r5.add(r6)
            goto Lc3
        L129:
            return
    }
}
