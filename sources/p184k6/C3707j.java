package p184k6;

/* renamed from: k6.j */
/* loaded from: classes.dex */
public class C3707j extends androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l {

    /* renamed from: k1 */
    public android.app.Dialog f16418k1;

    /* renamed from: l1 */
    public android.content.DialogInterface.OnCancelListener f16419l1;

    /* renamed from: m1 */
    public android.app.Dialog f16420m1;

    public C3707j() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l
    /* renamed from: G0 */
    public android.app.Dialog mo1225G0(android.os.Bundle r2) {
            r1 = this;
            android.app.Dialog r2 = r1.f16418k1
            if (r2 != 0) goto L1c
            r2 = 0
            r1.f2214b1 = r2
            android.app.Dialog r2 = r1.f16420m1
            if (r2 != 0) goto L1a
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            androidx.fragment.app.s r0 = r1.m1333s()
            r2.<init>(r0)
            android.app.AlertDialog r2 = r2.create()
            r1.f16420m1 = r2
        L1a:
            android.app.Dialog r2 = r1.f16420m1
        L1c:
            return r2
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l
    /* renamed from: K0 */
    public void mo1229K0(@androidx.annotation.RecentlyNonNull androidx.fragment.app.AbstractC0375d0 r1, java.lang.String r2) {
            r0 = this;
            super.mo1229K0(r1, r2)
            return
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, android.content.DialogInterface.OnCancelListener
    public void onCancel(@androidx.annotation.RecentlyNonNull android.content.DialogInterface r2) {
            r1 = this;
            android.content.DialogInterface$OnCancelListener r0 = r1.f16419l1
            if (r0 == 0) goto L7
            r0.onCancel(r2)
        L7:
            return
    }
}
