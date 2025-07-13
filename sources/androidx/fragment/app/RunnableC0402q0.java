package androidx.fragment.app;

/* renamed from: androidx.fragment.app.q0 */
/* loaded from: classes.dex */
public class RunnableC0402q0 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ java.lang.Object f2338Y;

    /* renamed from: Z */
    public final /* synthetic */ androidx.fragment.app.AbstractC0412v0 f2339Z;

    /* renamed from: a0 */
    public final /* synthetic */ android.view.View f2340a0;

    /* renamed from: b0 */
    public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f2341b0;

    /* renamed from: c0 */
    public final /* synthetic */ java.util.ArrayList f2342c0;

    /* renamed from: d0 */
    public final /* synthetic */ java.util.ArrayList f2343d0;

    /* renamed from: e0 */
    public final /* synthetic */ java.util.ArrayList f2344e0;

    /* renamed from: f0 */
    public final /* synthetic */ java.lang.Object f2345f0;

    public RunnableC0402q0(java.lang.Object r1, androidx.fragment.app.AbstractC0412v0 r2, android.view.View r3, androidx.fragment.app.ComponentCallbacksC0395n r4, java.util.ArrayList r5, java.util.ArrayList r6, java.util.ArrayList r7, java.lang.Object r8) {
            r0 = this;
            r0.f2338Y = r1
            r0.f2339Z = r2
            r0.f2340a0 = r3
            r0.f2341b0 = r4
            r0.f2342c0 = r5
            r0.f2343d0 = r6
            r0.f2344e0 = r7
            r0.f2345f0 = r8
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r5 = this;
            java.lang.Object r0 = r5.f2338Y
            if (r0 == 0) goto L1e
            androidx.fragment.app.v0 r1 = r5.f2339Z
            android.view.View r2 = r5.f2340a0
            r1.mo1380o(r0, r2)
            androidx.fragment.app.v0 r0 = r5.f2339Z
            java.lang.Object r1 = r5.f2338Y
            androidx.fragment.app.n r2 = r5.f2341b0
            java.util.ArrayList r3 = r5.f2342c0
            android.view.View r4 = r5.f2340a0
            java.util.ArrayList r0 = androidx.fragment.app.C0408t0.m1363h(r0, r1, r2, r3, r4)
            java.util.ArrayList r1 = r5.f2343d0
            r1.addAll(r0)
        L1e:
            java.util.ArrayList r0 = r5.f2344e0
            if (r0 == 0) goto L45
            java.lang.Object r0 = r5.f2345f0
            if (r0 == 0) goto L39
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.View r1 = r5.f2340a0
            r0.add(r1)
            androidx.fragment.app.v0 r1 = r5.f2339Z
            java.lang.Object r2 = r5.f2345f0
            java.util.ArrayList r3 = r5.f2344e0
            r1.mo1381p(r2, r3, r0)
        L39:
            java.util.ArrayList r0 = r5.f2344e0
            r0.clear()
            java.util.ArrayList r0 = r5.f2344e0
            android.view.View r1 = r5.f2340a0
            r0.add(r1)
        L45:
            return
    }
}
