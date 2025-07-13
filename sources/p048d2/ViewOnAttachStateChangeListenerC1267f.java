package p048d2;

/* renamed from: d2.f */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1267f implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: Y */
    public final /* synthetic */ mh.InterfaceC4620l f6748Y;

    public ViewOnAttachStateChangeListenerC1267f(mh.InterfaceC4620l r1) {
            r0 = this;
            r0.f6748Y = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "v"
            p214m2.C4339q.m9707l(r2, r0)
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "v"
            p214m2.C4339q.m9707l(r2, r0)
            mh.l r0 = r1.f6748Y
            r0.mo107b(r2)
            return
    }
}
