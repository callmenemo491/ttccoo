package com.google.android.material.bottomsheet;

/* renamed from: com.google.android.material.bottomsheet.b */
/* loaded from: classes.dex */
public class C1135b extends p083f.C1930q {
    public C1135b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l
    /* renamed from: D0 */
    public void mo1222D0() {
            r2 = this;
            android.app.Dialog r0 = r2.f2218f1
            boolean r1 = r0 instanceof com.google.android.material.bottomsheet.DialogC1134a
            if (r1 == 0) goto L13
            com.google.android.material.bottomsheet.a r0 = (com.google.android.material.bottomsheet.DialogC1134a) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r1 = r0.f5882a0
            if (r1 != 0) goto Lf
            r0.m3303d()
        Lf:
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r0 = r0.f5882a0
            boolean r0 = r0.f5820C
        L13:
            r0 = 0
            r2.m1223E0(r0, r0)
            return
    }

    @Override // p083f.C1930q, androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l
    /* renamed from: G0 */
    public android.app.Dialog mo1225G0(android.os.Bundle r3) {
            r2 = this;
            com.google.android.material.bottomsheet.a r3 = new com.google.android.material.bottomsheet.a
            android.content.Context r0 = r2.m1339v()
            int r1 = r2.mo1224F0()
            r3.<init>(r0, r1)
            return r3
    }
}
