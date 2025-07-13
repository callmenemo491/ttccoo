package p220m8;

/* renamed from: m8.o */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC4431o implements android.view.View.OnAttachStateChangeListener {
    public ViewOnAttachStateChangeListenerC4431o() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View r2) {
            r1 = this;
            r2.removeOnAttachStateChangeListener(r1)
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            p227n0.C4661t.g.m10595c(r2)
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            return
    }
}
