package androidx.fragment.app;

/* renamed from: androidx.fragment.app.i */
/* loaded from: classes.dex */
public class RunnableC0385i implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ androidx.fragment.app.AbstractC0412v0 f2183Y;

    /* renamed from: Z */
    public final /* synthetic */ android.view.View f2184Z;

    /* renamed from: a0 */
    public final /* synthetic */ android.graphics.Rect f2185a0;

    public RunnableC0385i(androidx.fragment.app.C0371c r1, androidx.fragment.app.AbstractC0412v0 r2, android.view.View r3, android.graphics.Rect r4) {
            r0 = this;
            r0.f2183Y = r2
            r0.f2184Z = r3
            r0.f2185a0 = r4
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            androidx.fragment.app.v0 r0 = r3.f2183Y
            android.view.View r1 = r3.f2184Z
            android.graphics.Rect r2 = r3.f2185a0
            r0.m1395j(r1, r2)
            return
    }
}
