package p098fe;

/* renamed from: fe.h */
/* loaded from: classes.dex */
public final class C2147h extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.lang.String, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ io.tacocrypto.app.p156ui.settings.SettingsFragment f9849Z;

    public C2147h(io.tacocrypto.app.p156ui.settings.SettingsFragment r1) {
            r0 = this;
            r0.f9849Z = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4620l
    /* renamed from: b */
    public ch.C0985l mo107b(java.lang.String r9) {
            r8 = this;
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r0 = "it"
            p214m2.C4339q.m9706k(r9, r0)
            io.tacocrypto.app.ui.settings.SettingsFragment r0 = r8.f9849Z
            int r1 = io.tacocrypto.app.p156ui.settings.SettingsFragment.f14359Y0
            fe.j r0 = r0.m7738I0()
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "baseUrl"
            p214m2.C4339q.m9706k(r9, r1)
            nd.v0 r2 = p238nd.C4781v0.f19121e
            java.lang.String r3 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r2, r3)
            p214m2.C4339q.m9704i(r2)
            p214m2.C4339q.m9706k(r9, r1)
            java.lang.String r1 = vg.C6672m.m13529p(r9)
            nd.v0$a[] r3 = p238nd.C4781v0.a.values()
            int r4 = r3.length
            r5 = 0
        L2e:
            if (r5 >= r4) goto L3e
            r6 = r3[r5]
            java.lang.String r7 = r6.f19146Y
            boolean r7 = p214m2.C4339q.m9702c(r7, r1)
            if (r7 == 0) goto L3b
            goto L3f
        L3b:
            int r5 = r5 + 1
            goto L2e
        L3e:
            r6 = 0
        L3f:
            if (r6 != 0) goto L42
            goto L5b
        L42:
            r2.f19125d = r6
            nd.j1 r1 = r2.f19122a
            android.content.SharedPreferences r1 = r1.m10820a()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = java.lang.String.valueOf(r6)
            java.lang.String r3 = "atomicSelected"
            android.content.SharedPreferences$Editor r1 = r1.putString(r3, r2)
            r1.apply()
        L5b:
            androidx.lifecycle.d0<java.lang.String> r0 = r0.f9852A
            r0.mo7l(r9)
            ch.l r9 = ch.C0985l.f5061a
            return r9
    }
}
