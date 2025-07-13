package p098fe;

/* renamed from: fe.e */
/* loaded from: classes.dex */
public final class C2144e extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ io.tacocrypto.app.p156ui.settings.SettingsFragment f9844Z;

    /* renamed from: a0 */
    public final /* synthetic */ id.C3131b f9845a0;

    public C2144e(io.tacocrypto.app.p156ui.settings.SettingsFragment r1, id.C3131b r2) {
            r0 = this;
            r0.f9844Z = r1
            r0.f9845a0 = r2
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4609a
    /* renamed from: e */
    public ch.C0985l mo15e() {
            r12 = this;
            io.tacocrypto.app.ui.settings.SettingsFragment r0 = r12.f9844Z
            int r1 = io.tacocrypto.app.p156ui.settings.SettingsFragment.f14359Y0
            fe.j r0 = r0.m7738I0()
            id.b r1 = r12.f9845a0
            java.util.Objects.requireNonNull(r0)
            java.lang.String r2 = "wallet"
            p214m2.C4339q.m9706k(r1, r2)
            nd.b0 r2 = r0.f9854d
            android.app.Application r0 = r0.f2471c
            java.util.Objects.requireNonNull(r2)
            od.v0 r3 = r1.f12560b
            od.v0 r4 = p255od.EnumC5234v0.WAX_CLOUD_WALLET
            r5 = 0
            if (r3 != r4) goto L53
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 22
            if (r3 < r4) goto L35
            android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()
            r0.removeAllCookies(r5)
            android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()
            r0.flush()
            goto L53
        L35:
            if (r0 == 0) goto L53
            android.webkit.CookieSyncManager r0 = android.webkit.CookieSyncManager.createInstance(r0)
            r0.startSync()
            android.webkit.CookieManager r3 = android.webkit.CookieManager.getInstance()
            java.lang.String r4 = "getInstance()"
            p214m2.C4339q.m9705j(r3, r4)
            r3.removeAllCookie()
            r3.removeSessionCookie()
            r0.stopSync()
            r0.sync()
        L53:
            vh.v0 r6 = p379vh.C6746v0.f26044Y
            r7 = 0
            nd.t0 r9 = new nd.t0
            r9.<init>(r2, r1, r5)
            r10 = 3
            r11 = 0
            r8 = 0
            p101fh.C2174f.m5728r(r6, r7, r8, r9, r10, r11)
            ch.l r0 = ch.C0985l.f5061a
            return r0
    }
}
