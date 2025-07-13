package p203l8;

/* renamed from: l8.b */
/* loaded from: classes.dex */
public class ViewTreeObserverOnPreDrawListenerC4195b implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: Y */
    public final /* synthetic */ com.google.android.material.floatingactionbutton.C1193d f17360Y;

    public ViewTreeObserverOnPreDrawListenerC4195b(com.google.android.material.floatingactionbutton.C1193d r1) {
            r0 = this;
            r0.f17360Y = r1
            r0.<init>()
            return
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
            r3 = this;
            com.google.android.material.floatingactionbutton.d r0 = r3.f17360Y
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r0.f6203s
            float r1 = r1.getRotation()
            float r2 = r0.f6197m
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 == 0) goto L13
            r0.f6197m = r1
            r0.mo3489r()
        L13:
            r0 = 1
            return r0
    }
}
