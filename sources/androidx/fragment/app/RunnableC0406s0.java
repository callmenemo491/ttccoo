package androidx.fragment.app;

/* renamed from: androidx.fragment.app.s0 */
/* loaded from: classes.dex */
public class RunnableC0406s0 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ androidx.fragment.app.AbstractC0412v0 f2360Y;

    /* renamed from: Z */
    public final /* synthetic */ p319s.C5934a f2361Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.Object f2362a0;

    /* renamed from: b0 */
    public final /* synthetic */ androidx.fragment.app.C0408t0.b f2363b0;

    /* renamed from: c0 */
    public final /* synthetic */ java.util.ArrayList f2364c0;

    /* renamed from: d0 */
    public final /* synthetic */ android.view.View f2365d0;

    /* renamed from: e0 */
    public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f2366e0;

    /* renamed from: f0 */
    public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f2367f0;

    /* renamed from: g0 */
    public final /* synthetic */ boolean f2368g0;

    /* renamed from: h0 */
    public final /* synthetic */ java.util.ArrayList f2369h0;

    /* renamed from: i0 */
    public final /* synthetic */ java.lang.Object f2370i0;

    /* renamed from: j0 */
    public final /* synthetic */ android.graphics.Rect f2371j0;

    public RunnableC0406s0(androidx.fragment.app.AbstractC0412v0 r1, p319s.C5934a r2, java.lang.Object r3, androidx.fragment.app.C0408t0.b r4, java.util.ArrayList r5, android.view.View r6, androidx.fragment.app.ComponentCallbacksC0395n r7, androidx.fragment.app.ComponentCallbacksC0395n r8, boolean r9, java.util.ArrayList r10, java.lang.Object r11, android.graphics.Rect r12) {
            r0 = this;
            r0.f2360Y = r1
            r0.f2361Z = r2
            r0.f2362a0 = r3
            r0.f2363b0 = r4
            r0.f2364c0 = r5
            r0.f2365d0 = r6
            r0.f2366e0 = r7
            r0.f2367f0 = r8
            r0.f2368g0 = r9
            r0.f2369h0 = r10
            r0.f2370i0 = r11
            r0.f2371j0 = r12
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r5 = this;
            androidx.fragment.app.v0 r0 = r5.f2360Y
            s.a r1 = r5.f2361Z
            java.lang.Object r2 = r5.f2362a0
            androidx.fragment.app.t0$b r3 = r5.f2363b0
            s.a r0 = androidx.fragment.app.C0408t0.m1360e(r0, r1, r2, r3)
            if (r0 == 0) goto L1e
            java.util.ArrayList r1 = r5.f2364c0
            java.util.Collection r2 = r0.values()
            r1.addAll(r2)
            java.util.ArrayList r1 = r5.f2364c0
            android.view.View r2 = r5.f2365d0
            r1.add(r2)
        L1e:
            androidx.fragment.app.n r1 = r5.f2366e0
            androidx.fragment.app.n r2 = r5.f2367f0
            boolean r3 = r5.f2368g0
            r4 = 0
            androidx.fragment.app.C0408t0.m1358c(r1, r2, r3, r0, r4)
            java.lang.Object r1 = r5.f2362a0
            if (r1 == 0) goto L48
            androidx.fragment.app.v0 r2 = r5.f2360Y
            java.util.ArrayList r3 = r5.f2369h0
            java.util.ArrayList r4 = r5.f2364c0
            r2.mo1388x(r1, r3, r4)
            androidx.fragment.app.t0$b r1 = r5.f2363b0
            java.lang.Object r2 = r5.f2370i0
            boolean r3 = r5.f2368g0
            android.view.View r0 = androidx.fragment.app.C0408t0.m1366k(r0, r1, r2, r3)
            if (r0 == 0) goto L48
            androidx.fragment.app.v0 r1 = r5.f2360Y
            android.graphics.Rect r2 = r5.f2371j0
            r1.m1395j(r0, r2)
        L48:
            return
    }
}
