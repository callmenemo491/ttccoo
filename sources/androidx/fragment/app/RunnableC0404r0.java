package androidx.fragment.app;

/* renamed from: androidx.fragment.app.r0 */
/* loaded from: classes.dex */
public class RunnableC0404r0 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f2347Y;

    /* renamed from: Z */
    public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f2348Z;

    /* renamed from: a0 */
    public final /* synthetic */ boolean f2349a0;

    /* renamed from: b0 */
    public final /* synthetic */ p319s.C5934a f2350b0;

    /* renamed from: c0 */
    public final /* synthetic */ android.view.View f2351c0;

    /* renamed from: d0 */
    public final /* synthetic */ androidx.fragment.app.AbstractC0412v0 f2352d0;

    /* renamed from: e0 */
    public final /* synthetic */ android.graphics.Rect f2353e0;

    public RunnableC0404r0(androidx.fragment.app.ComponentCallbacksC0395n r1, androidx.fragment.app.ComponentCallbacksC0395n r2, boolean r3, p319s.C5934a r4, android.view.View r5, androidx.fragment.app.AbstractC0412v0 r6, android.graphics.Rect r7) {
            r0 = this;
            r0.f2347Y = r1
            r0.f2348Z = r2
            r0.f2349a0 = r3
            r0.f2350b0 = r4
            r0.f2351c0 = r5
            r0.f2352d0 = r6
            r0.f2353e0 = r7
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r5 = this;
            androidx.fragment.app.n r0 = r5.f2347Y
            androidx.fragment.app.n r1 = r5.f2348Z
            boolean r2 = r5.f2349a0
            s.a r3 = r5.f2350b0
            r4 = 0
            androidx.fragment.app.C0408t0.m1358c(r0, r1, r2, r3, r4)
            android.view.View r0 = r5.f2351c0
            if (r0 == 0) goto L17
            androidx.fragment.app.v0 r1 = r5.f2352d0
            android.graphics.Rect r2 = r5.f2353e0
            r1.m1395j(r0, r2)
        L17:
            return
    }
}
