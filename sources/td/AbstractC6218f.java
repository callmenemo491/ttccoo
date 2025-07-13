package td;

import p383w1.InterfaceC6776a;

/* renamed from: td.f */
/* loaded from: classes.dex */
public abstract class AbstractC6218f<T extends p383w1.InterfaceC6776a> extends td.AbstractC6213a<T> {

    /* renamed from: l1 */
    public static final /* synthetic */ int f24174l1 = 0;

    public AbstractC6218f() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l
    /* renamed from: F0 */
    public int mo1224F0() {
            r1 = this;
            r0 = 2132017161(0x7f140009, float:1.9672593E38)
            return r0
    }

    @Override // com.google.android.material.bottomsheet.C1135b, p083f.C1930q, androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l
    /* renamed from: G0 */
    public android.app.Dialog mo1225G0(android.os.Bundle r2) {
            r1 = this;
            android.app.Dialog r2 = super.mo1225G0(r2)
            td.e r0 = new td.e
            r0.<init>(r1)
            r2.setOnShowListener(r0)
            return r2
    }

    /* renamed from: O0 */
    public abstract boolean mo111O0();
}
