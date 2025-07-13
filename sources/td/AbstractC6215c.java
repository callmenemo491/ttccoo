package td;

import p383w1.InterfaceC6776a;

/* renamed from: td.c */
/* loaded from: classes.dex */
public abstract class AbstractC6215c<T extends p383w1.InterfaceC6776a> extends androidx.fragment.app.ComponentCallbacksC0395n {

    /* renamed from: U0 */
    public T f24170U0;

    public AbstractC6215c() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: D0 */
    public void mo7720D0() {
            r0 = this;
            return
    }

    /* renamed from: E0 */
    public final void m12822E0(androidx.navigation.InterfaceC0519n r3) {
            r2 = this;
            androidx.navigation.NavController r0 = androidx.navigation.fragment.NavHostFragment.m1583D0(r2)
            java.lang.String r1 = "NavHostFragment.findNavController(this)"
            p214m2.C4339q.m9703h(r0, r1)
            int r1 = r3.mo1576b()
            android.os.Bundle r3 = r3.mo1575a()
            r0.m1567f(r1, r3)
            return
    }

    /* renamed from: F0 */
    public abstract void mo7721F0();

    /* renamed from: G0 */
    public abstract mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, T> mo7722G0();

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: W */
    public android.view.View mo1317W(android.view.LayoutInflater r2, android.view.ViewGroup r3, android.os.Bundle r4) {
            r1 = this;
            java.lang.String r4 = "inflater"
            p214m2.C4339q.m9706k(r2, r4)
            mh.q r4 = r1.mo7722G0()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Object r2 = r4.mo115i(r2, r3, r0)
            w1.a r2 = (p383w1.InterfaceC6776a) r2
            r1.f24170U0 = r2
            r1.mo7721F0()
            r1.mo7720D0()
            T extends w1.a r2 = r1.f24170U0
            p214m2.C4339q.m9704i(r2)
            android.view.View r2 = r2.mo1053b()
            return r2
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: Y */
    public void mo1231Y() {
            r1 = this;
            r0 = 1
            r1.f2258A0 = r0
            r0 = 0
            r1.f24170U0 = r0
            return
    }
}
