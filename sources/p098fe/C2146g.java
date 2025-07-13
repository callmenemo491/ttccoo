package p098fe;

/* renamed from: fe.g */
/* loaded from: classes.dex */
public final class C2146g extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.lang.String, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ io.tacocrypto.app.p156ui.settings.SettingsFragment f9848Z;

    public C2146g(io.tacocrypto.app.p156ui.settings.SettingsFragment r1) {
            r0 = this;
            r0.f9848Z = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4620l
    /* renamed from: b */
    public ch.C0985l mo107b(java.lang.String r5) {
            r4 = this;
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r0 = "it"
            p214m2.C4339q.m9706k(r5, r0)
            io.tacocrypto.app.ui.settings.SettingsFragment r0 = r4.f9848Z
            int r1 = io.tacocrypto.app.p156ui.settings.SettingsFragment.f14359Y0
            fe.j r0 = r0.m7738I0()
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "node"
            p214m2.C4339q.m9706k(r5, r1)
            nd.v0 r2 = p238nd.C4781v0.f19121e
            java.lang.String r3 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r2, r3)
            p214m2.C4339q.m9704i(r2)
            p214m2.C4339q.m9706k(r5, r1)
            r2.f19124c = r5
            nd.j1 r1 = r2.f19122a
            android.content.SharedPreferences r1 = r1.m10820a()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = "nodeSelected"
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r5)
            r1.apply()
            androidx.lifecycle.d0<java.lang.String> r0 = r0.f9876z
            r0.mo7l(r5)
            ch.l r5 = ch.C0985l.f5061a
            return r5
    }
}
