package p227n0;

/* renamed from: n0.o */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC4656o implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {

    /* renamed from: Y */
    public final android.view.View f18565Y;

    /* renamed from: Z */
    public android.view.ViewTreeObserver f18566Z;

    /* renamed from: a0 */
    public final java.lang.Runnable f18567a0;

    public ViewTreeObserverOnPreDrawListenerC4656o(android.view.View r1, java.lang.Runnable r2) {
            r0 = this;
            r0.<init>()
            r0.f18565Y = r1
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r0.f18566Z = r1
            r0.f18567a0 = r2
            return
    }

    /* renamed from: a */
    public static p227n0.ViewTreeObserverOnPreDrawListenerC4656o m10519a(android.view.View r1, java.lang.Runnable r2) {
            java.lang.String r0 = "view == null"
            java.util.Objects.requireNonNull(r1, r0)
            n0.o r0 = new n0.o
            r0.<init>(r1, r2)
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            r2.addOnPreDrawListener(r0)
            r1.addOnAttachStateChangeListener(r0)
            return r0
    }

    /* renamed from: b */
    public void m10520b() {
            r1 = this;
            android.view.ViewTreeObserver r0 = r1.f18566Z
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto Lb
            android.view.ViewTreeObserver r0 = r1.f18566Z
            goto L11
        Lb:
            android.view.View r0 = r1.f18565Y
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
        L11:
            r0.removeOnPreDrawListener(r1)
            android.view.View r0 = r1.f18565Y
            r0.removeOnAttachStateChangeListener(r1)
            return
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
            r1 = this;
            r1.m10520b()
            java.lang.Runnable r0 = r1.f18567a0
            r0.run()
            r0 = 1
            return r0
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r0.f18566Z = r1
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            r0.m10520b()
            return
    }
}
