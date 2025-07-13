package io.tacocrypto.app.p156ui.balance;

/* renamed from: io.tacocrypto.app.ui.balance.b */
/* loaded from: classes.dex */
public final class C3212b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<io.tacocrypto.app.p156ui.balance.EnumC3214d, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ io.tacocrypto.app.p156ui.balance.BalanceFragment f14267Z;

    public C3212b(io.tacocrypto.app.p156ui.balance.BalanceFragment r1) {
            r0 = this;
            r0.f14267Z = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4620l
    /* renamed from: b */
    public ch.C0985l mo107b(io.tacocrypto.app.p156ui.balance.EnumC3214d r6) {
            r5 = this;
            io.tacocrypto.app.ui.balance.d r6 = (io.tacocrypto.app.p156ui.balance.EnumC3214d) r6
            java.lang.String r0 = "it"
            p214m2.C4339q.m9706k(r6, r0)
            io.tacocrypto.app.ui.balance.BalanceFragment r0 = r5.f14267Z
            int r1 = io.tacocrypto.app.p156ui.balance.BalanceFragment.f14253X0
            sd.d r0 = r0.m7723H0()
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "balanceGraphTime"
            p214m2.C4339q.m9706k(r6, r1)
            android.app.Application r1 = r0.f23262c
            java.lang.String r2 = "context"
            p214m2.C4339q.m9706k(r1, r2)
            nd.c r2 = p238nd.C4730c.f18962j
            if (r2 != 0) goto L3f
            java.lang.Class<nd.c> r2 = p238nd.C4730c.class
            monitor-enter(r2)
            nd.c r3 = p238nd.C4730c.f18962j     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L3a
            nd.c r3 = new nd.c     // Catch: java.lang.Throwable -> L3c
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = "context.applicationContext"
            p214m2.C4339q.m9705j(r1, r4)     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            r3.<init>(r1, r4)     // Catch: java.lang.Throwable -> L3c
            p238nd.C4730c.f18962j = r3     // Catch: java.lang.Throwable -> L3c
        L3a:
            monitor-exit(r2)
            goto L3f
        L3c:
            r6 = move-exception
            monitor-exit(r2)
            throw r6
        L3f:
            nd.c r1 = p238nd.C4730c.f18962j
            p214m2.C4339q.m9704i(r1)
            r1.m10814d()
            androidx.lifecycle.d0<io.tacocrypto.app.ui.balance.d> r1 = r0.f23257B
            r1.mo7l(r6)
            nd.j1 r0 = r0.f23264e
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "value"
            p214m2.C4339q.m9706k(r6, r1)
            android.content.SharedPreferences r0 = r0.m10820a()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            int r6 = r6.ordinal()
            java.lang.String r1 = "balanceGraphType"
            android.content.SharedPreferences$Editor r6 = r0.putInt(r1, r6)
            r6.apply()
            ch.l r6 = ch.C0985l.f5061a
            return r6
    }
}
