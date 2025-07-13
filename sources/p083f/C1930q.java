package p083f;

/* renamed from: f.q */
/* loaded from: classes.dex */
public class C1930q extends androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l {
    public C1930q() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l
    /* renamed from: G0 */
    public android.app.Dialog mo1225G0(android.os.Bundle r3) {
            r2 = this;
            f.p r3 = new f.p
            android.content.Context r0 = r2.m1339v()
            int r1 = r2.mo1224F0()
            r3.<init>(r0, r1)
            return r3
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l
    /* renamed from: J0 */
    public void mo1228J0(android.app.Dialog r4, int r5) {
            r3 = this;
            boolean r0 = r4 instanceof p083f.DialogC1929p
            if (r0 == 0) goto L1e
            r0 = r4
            f.p r0 = (p083f.DialogC1929p) r0
            r1 = 1
            if (r5 == r1) goto L1a
            r2 = 2
            if (r5 == r2) goto L1a
            r2 = 3
            if (r5 == r2) goto L11
            goto L21
        L11:
            android.view.Window r4 = r4.getWindow()
            r5 = 24
            r4.addFlags(r5)
        L1a:
            r0.m4771c(r1)
            goto L21
        L1e:
            super.mo1228J0(r4, r5)
        L21:
            return
    }
}
