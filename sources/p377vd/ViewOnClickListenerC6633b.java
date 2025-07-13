package p377vd;

/* renamed from: vd.b */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC6633b implements android.view.View.OnClickListener {

    /* renamed from: Y */
    public final /* synthetic */ int f25822Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.Object f25823Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.Object f25824a0;

    public /* synthetic */ ViewOnClickListenerC6633b(androidx.appcompat.app.DialogC0204b r2, mh.InterfaceC4609a r3) {
            r1 = this;
            r0 = 1
            r1.f25822Y = r0
            r1.<init>()
            r1.f25823Z = r2
            r1.f25824a0 = r3
            return
    }

    public /* synthetic */ ViewOnClickListenerC6633b(io.tacocrypto.app.p156ui.home.HomeFragment r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.f25822Y = r0
            r1.<init>()
            r1.f25823Z = r2
            r1.f25824a0 = r3
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r2.f25822Y
            switch(r3) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L1d
        L6:
            java.lang.Object r3 = r2.f25823Z
            io.tacocrypto.app.ui.home.HomeFragment r3 = (io.tacocrypto.app.p156ui.home.HomeFragment) r3
            java.lang.Object r0 = r2.f25824a0
            java.lang.String r0 = (java.lang.String) r0
            int r1 = io.tacocrypto.app.p156ui.home.HomeFragment.f14287W0
            java.lang.String r1 = "this$0"
            p214m2.C4339q.m9706k(r3, r1)
            androidx.fragment.app.s r3 = r3.m1330q0()
            vg.C6672m.m13528o(r3, r0)
            return
        L1d:
            java.lang.Object r3 = r2.f25823Z
            androidx.appcompat.app.b r3 = (androidx.appcompat.app.DialogC0204b) r3
            java.lang.Object r0 = r2.f25824a0
            mh.a r0 = (mh.InterfaceC4609a) r0
            java.lang.String r1 = "$dialog"
            p214m2.C4339q.m9706k(r3, r1)
            java.lang.String r1 = "$callback"
            p214m2.C4339q.m9706k(r0, r1)
            r3.dismiss()
            r0.mo15e()
            return
    }
}
