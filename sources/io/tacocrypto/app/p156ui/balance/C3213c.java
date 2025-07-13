package io.tacocrypto.app.p156ui.balance;

/* renamed from: io.tacocrypto.app.ui.balance.c */
/* loaded from: classes.dex */
public final class C3213c extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<io.tacocrypto.app.p156ui.balance.EnumC3215e, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ io.tacocrypto.app.p156ui.balance.BalanceFragment f14268Z;

    public C3213c(io.tacocrypto.app.p156ui.balance.BalanceFragment r1) {
            r0 = this;
            r0.f14268Z = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4620l
    /* renamed from: b */
    public ch.C0985l mo107b(io.tacocrypto.app.p156ui.balance.EnumC3215e r4) {
            r3 = this;
            io.tacocrypto.app.ui.balance.e r4 = (io.tacocrypto.app.p156ui.balance.EnumC3215e) r4
            java.lang.String r0 = "it"
            p214m2.C4339q.m9706k(r4, r0)
            io.tacocrypto.app.ui.balance.BalanceFragment r0 = r3.f14268Z
            int r1 = io.tacocrypto.app.p156ui.balance.BalanceFragment.f14253X0
            sd.d r0 = r0.m7723H0()
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "balanceHide"
            p214m2.C4339q.m9706k(r4, r1)
            androidx.lifecycle.d0<io.tacocrypto.app.ui.balance.e> r2 = r0.f23259D
            r2.mo7l(r4)
            java.util.List<sd.d$a> r2 = r0.f23282w
            r0.m12515f(r2)
            nd.j1 r0 = r0.f23264e
            java.util.Objects.requireNonNull(r0)
            java.lang.String r2 = "value"
            p214m2.C4339q.m9706k(r4, r2)
            android.content.SharedPreferences r0 = r0.m10820a()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            int r4 = r4.ordinal()
            android.content.SharedPreferences$Editor r4 = r0.putInt(r1, r4)
            r4.apply()
            ch.l r4 = ch.C0985l.f5061a
            return r4
    }
}
