package io.tacocrypto.app.p156ui.splash;

/* renamed from: io.tacocrypto.app.ui.splash.a */
/* loaded from: classes.dex */
public final class C3281a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ io.tacocrypto.app.p156ui.splash.SplashActivity f14395Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.String f14396a0;

    public C3281a(io.tacocrypto.app.p156ui.splash.SplashActivity r1, java.lang.String r2) {
            r0 = this;
            r0.f14395Z = r1
            r0.f14396a0 = r2
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4609a
    /* renamed from: e */
    public ch.C0985l mo15e() {
            r12 = this;
            io.tacocrypto.app.ui.splash.SplashActivity r0 = r12.f14395Z
            java.lang.String r1 = "context"
            p214m2.C4339q.m9706k(r0, r1)
            java.lang.String r1 = "sec"
            java.lang.String r2 = "QUl6YVN5QnBBamJnTFg3TkVLNkt2YjRibTJzaWd2TExLcmV1NFlZ"
            java.lang.String r5 = vg.C6681v.m13539a(r2)     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = "ApiKey must be set."
            com.google.android.gms.common.internal.C1101a.m3101f(r5, r2)     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = "MToxMDA3MDcwNzM3NjQ2OmFuZHJvaWQ6YTM4Y2QwNWIxMzZiYzczYjc5NmZmZg--"
            java.lang.String r4 = vg.C6681v.m13539a(r2)     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = "ApplicationId must be set."
            com.google.android.gms.common.internal.C1101a.m3101f(r4, r2)     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = "YmxvY2stOTQ2M2U-"
            java.lang.String r10 = vg.C6681v.m13539a(r2)     // Catch: java.lang.Throwable -> L37
            o9.h r2 = new o9.h     // Catch: java.lang.Throwable -> L37
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L37
            p251o9.C5180d.m11496g(r0, r2, r1)     // Catch: java.lang.Throwable -> L37
            o9.d r0 = p251o9.C5180d.m11495d(r1)     // Catch: java.lang.Throwable -> L37
            goto L3c
        L37:
            r0 = move-exception
            java.lang.Object r0 = p074e9.C1805a.m4520e(r0)
        L3c:
            boolean r1 = r0 instanceof ch.C0979f.a
            r2 = 0
            if (r1 == 0) goto L42
            r0 = r2
        L42:
            o9.d r0 = (p251o9.C5180d) r0
            if (r0 == 0) goto L83
            java.lang.Class<gb.l> r1 = gb.C2322l.class
            r0.m11497a()
            y9.i r0 = r0.f20315d
            java.lang.Object r0 = r0.mo14246a(r1)
            gb.l r0 = (gb.C2322l) r0
            gb.c r0 = r0.m6081c()
            java.lang.String r1 = "FirebaseRemoteConfig.getInstance(app)"
            p214m2.C4339q.m9703h(r0, r1)
            s7.i r1 = r0.m6076a()
            vg.u r3 = vg.C6680u.f25951a
            r1.mo12444b(r3)
            java.lang.String r1 = "intro"
            ha.b r0 = p074e9.C1805a.m4525j(r0, r1)
            java.lang.String r0 = r0.m7366a()
            java.lang.String r1 = "this[\"intro\"].asString()"
            p214m2.C4339q.m9705j(r0, r1)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 != 0) goto L7b
            goto L83
        L7b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View android.widget.LinearLayout{c18b33b V.E...... ......ID 0,0-338,85} has already been added to the window manager"
            r0.<init>(r1)
            throw r0
        L83:
            io.tacocrypto.app.ui.splash.SplashActivity r0 = r12.f14395Z
            int r1 = io.tacocrypto.app.p156ui.splash.SplashActivity.f14385n0
            ie.e r0 = r0.m7740z()
            java.lang.String r1 = r12.f14396a0
            nd.k1 r3 = r0.f12571e
            io.tacocrypto.app.ui.secret.c r4 = io.tacocrypto.app.p156ui.secret.EnumC3251c.f14333Z
            nd.j1 r5 = r3.f19058a
            java.util.Set r5 = r5.m10824e()
            java.util.Set r5 = p062dh.C1473i.m4010V(r5)
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto Lb6
            r5 = 2
            io.tacocrypto.app.ui.secret.c[] r5 = new io.tacocrypto.app.p156ui.secret.EnumC3251c[r5]
            r6 = 0
            r5[r6] = r4
            r4 = 1
            io.tacocrypto.app.ui.secret.c r6 = io.tacocrypto.app.p156ui.secret.EnumC3251c.f14335b0
            r5[r4] = r6
            java.util.Set r4 = p185k7.C3828h5.m8573B(r5)
            nd.j1 r3 = r3.f19058a
            r3.m10826g(r4)
            goto Lc4
        Lb6:
            boolean r6 = r5.contains(r4)
            if (r6 != 0) goto Lc4
            r5.add(r4)
            nd.j1 r3 = r3.f19058a
            r3.m10826g(r5)
        Lc4:
            vh.b0 r6 = p064e.C1488b.m4037d(r0)
            r7 = 0
            ie.f r9 = new ie.f
            r9.<init>(r0, r1, r2)
            r10 = 3
            r11 = 0
            r8 = 0
            p101fh.C2174f.m5728r(r6, r7, r8, r9, r10, r11)
            ch.l r0 = ch.C0985l.f5061a
            return r0
    }
}
