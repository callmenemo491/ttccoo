package androidx.mediarouter.app;

/* renamed from: androidx.mediarouter.app.j */
/* loaded from: classes.dex */
public class C0490j extends androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l {

    /* renamed from: k1 */
    public boolean f2756k1;

    /* renamed from: l1 */
    public android.app.Dialog f2757l1;

    /* renamed from: m1 */
    public p085f1.C1973n f2758m1;

    public C0490j() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f2756k1 = r0
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
            boolean r2 = r1.f2756k1
            if (r2 == 0) goto L17
            android.content.Context r2 = r1.m1339v()
            androidx.mediarouter.app.o r0 = new androidx.mediarouter.app.o
            r0.<init>(r2)
            r1.f2757l1 = r0
            androidx.mediarouter.app.o r0 = (androidx.mediarouter.app.DialogC0495o) r0
            f1.n r2 = r1.f2758m1
            r0.m1531j(r2)
            goto L22
        L17:
            android.content.Context r2 = r1.m1339v()
            androidx.mediarouter.app.g r0 = new androidx.mediarouter.app.g
            r0.<init>(r2)
            r1.f2757l1 = r0
        L22:
            android.app.Dialog r2 = r1.f2757l1
            return r2
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: h0 */
    public void mo1236h0() {
            r2 = this;
            super.mo1236h0()
            android.app.Dialog r0 = r2.f2757l1
            if (r0 == 0) goto L11
            boolean r1 = r2.f2756k1
            if (r1 != 0) goto L11
            androidx.mediarouter.app.g r0 = (androidx.mediarouter.app.DialogC0487g) r0
            r1 = 0
            r0.m1501g(r1)
        L11:
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            r2 = 1
            r1.f2258A0 = r2
            android.app.Dialog r2 = r1.f2757l1
            if (r2 == 0) goto L16
            boolean r0 = r1.f2756k1
            if (r0 == 0) goto L11
            androidx.mediarouter.app.o r2 = (androidx.mediarouter.app.DialogC0495o) r2
            r2.m1533m()
            goto L16
        L11:
            androidx.mediarouter.app.g r2 = (androidx.mediarouter.app.DialogC0487g) r2
            r2.m1511w()
        L16:
            return
    }
}
