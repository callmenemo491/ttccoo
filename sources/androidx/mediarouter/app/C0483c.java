package androidx.mediarouter.app;

/* renamed from: androidx.mediarouter.app.c */
/* loaded from: classes.dex */
public class C0483c extends androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l {

    /* renamed from: k1 */
    public boolean f2661k1;

    /* renamed from: l1 */
    public android.app.Dialog f2662l1;

    /* renamed from: m1 */
    public p085f1.C1973n f2663m1;

    public C0483c() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f2661k1 = r0
            r0 = 1
            r2.f2213a1 = r0
            android.app.Dialog r1 = r2.f2218f1
            if (r1 == 0) goto L10
            r1.setCancelable(r0)
        L10:
            return
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l
    /* renamed from: G0 */
    public android.app.Dialog mo1225G0(android.os.Bundle r2) {
            r1 = this;
            boolean r2 = r1.f2661k1
            if (r2 == 0) goto L18
            android.content.Context r2 = r1.m1339v()
            androidx.mediarouter.app.m r0 = new androidx.mediarouter.app.m
            r0.<init>(r2)
            r1.f2662l1 = r0
            r1.m1495L0()
            f1.n r2 = r1.f2663m1
            r0.m1519e(r2)
            goto L2b
        L18:
            android.content.Context r2 = r1.m1339v()
            androidx.mediarouter.app.b r0 = new androidx.mediarouter.app.b
            r0.<init>(r2)
            r1.f2662l1 = r0
            r1.m1495L0()
            f1.n r2 = r1.f2663m1
            r0.m1494e(r2)
        L2b:
            android.app.Dialog r2 = r1.f2662l1
            return r2
    }

    /* renamed from: L0 */
    public final void m1495L0() {
            r2 = this;
            f1.n r0 = r2.f2663m1
            if (r0 != 0) goto L1c
            android.os.Bundle r0 = r2.f2282d0
            if (r0 == 0) goto L14
            java.lang.String r1 = "selector"
            android.os.Bundle r0 = r0.getBundle(r1)
            f1.n r0 = p085f1.C1973n.m5022b(r0)
            r2.f2663m1 = r0
        L14:
            f1.n r0 = r2.f2663m1
            if (r0 != 0) goto L1c
            f1.n r0 = p085f1.C1973n.f8666c
            r2.f2663m1 = r0
        L1c:
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r3) {
            r2 = this;
            r3 = 1
            r2.f2258A0 = r3
            android.app.Dialog r3 = r2.f2662l1
            if (r3 != 0) goto L8
            return
        L8:
            boolean r0 = r2.f2661k1
            if (r0 == 0) goto L12
            androidx.mediarouter.app.m r3 = (androidx.mediarouter.app.DialogC0493m) r3
            r3.m1520f()
            goto L24
        L12:
            androidx.mediarouter.app.b r3 = (androidx.mediarouter.app.DialogC0482b) r3
            android.view.Window r0 = r3.getWindow()
            android.content.Context r3 = r3.getContext()
            int r3 = androidx.mediarouter.app.C0492l.m1516a(r3)
            r1 = -2
            r0.setLayout(r3, r1)
        L24:
            return
    }
}
