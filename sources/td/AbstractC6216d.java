package td;

import p383w1.InterfaceC6776a;

/* renamed from: td.d */
/* loaded from: classes.dex */
public abstract class AbstractC6216d<T extends p383w1.InterfaceC6776a> extends androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l {

    /* renamed from: k1 */
    public T f24171k1;

    public AbstractC6216d() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: L0 */
    public void mo6087L0() {
            r0 = this;
            return
    }

    /* renamed from: M0 */
    public abstract void mo6088M0();

    /* renamed from: N0 */
    public abstract mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, T> mo6089N0();

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: W */
    public android.view.View mo1317W(android.view.LayoutInflater r2, android.view.ViewGroup r3, android.os.Bundle r4) {
            r1 = this;
            java.lang.String r4 = "inflater"
            p214m2.C4339q.m9706k(r2, r4)
            mh.q r4 = r1.mo6089N0()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Object r2 = r4.mo115i(r2, r3, r0)
            w1.a r2 = (p383w1.InterfaceC6776a) r2
            r1.f24171k1 = r2
            r1.mo6088M0()
            r1.mo6087L0()
            T extends w1.a r2 = r1.f24171k1
            p214m2.C4339q.m9704i(r2)
            android.view.View r2 = r2.mo1053b()
            return r2
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: Y */
    public void mo1231Y() {
            r1 = this;
            super.mo1231Y()
            r0 = 0
            r1.f24171k1 = r0
            return
    }
}
