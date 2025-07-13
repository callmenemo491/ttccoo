package io.tacocrypto.app.p156ui.tools.nftwallet.assets;

/* renamed from: io.tacocrypto.app.ui.tools.nftwallet.assets.c */
/* loaded from: classes.dex */
public final class C3293c extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<p086f2.InterfaceC1987b<? extends ch.C0978e<? extends p417xf.C7050d, ? extends p417xf.C7062p>>, java.lang.Integer, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ io.tacocrypto.app.p156ui.tools.nftwallet.assets.NFTAssetsFragment f14413Z;

    public C3293c(io.tacocrypto.app.p156ui.tools.nftwallet.assets.NFTAssetsFragment r1) {
            r0 = this;
            r0.f14413Z = r1
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public ch.C0985l mo122l(p086f2.InterfaceC1987b<? extends ch.C0978e<? extends p417xf.C7050d, ? extends p417xf.C7062p>> r3, java.lang.Integer r4) {
            r2 = this;
            f2.b r3 = (p086f2.InterfaceC1987b) r3
            java.lang.Number r4 = (java.lang.Number) r4
            r4.intValue()
            java.lang.String r4 = "$this$onClickAvoidReclick"
            p214m2.C4339q.m9706k(r3, r4)
            io.tacocrypto.app.ui.tools.nftwallet.assets.NFTAssetsFragment r4 = r2.f14413Z
            androidx.fragment.app.s r4 = r4.m1333s()
            boolean r0 = r4 instanceof io.tacocrypto.app.p156ui.tools.nftwallet.NFTWalletActivity
            if (r0 == 0) goto L19
            io.tacocrypto.app.ui.tools.nftwallet.NFTWalletActivity r4 = (io.tacocrypto.app.p156ui.tools.nftwallet.NFTWalletActivity) r4
            goto L1a
        L19:
            r4 = 0
        L1a:
            if (r4 == 0) goto L44
            io.tacocrypto.app.ui.tools.nftwallet.NFTWalletActivity$a r4 = r4.f14397m0
            if (r4 != 0) goto L21
            goto L44
        L21:
            java.lang.Object r3 = r3.getItem()
            ch.e r3 = (ch.C0978e) r3
            A r0 = r3.f5050Y
            B r3 = r3.f5051Z
            xf.p r3 = (p417xf.C7062p) r3
            if (r3 != 0) goto L30
            goto L44
        L30:
            ch.e r1 = new ch.e
            r1.<init>(r0, r3)
            r4.f14399b = r1
            io.tacocrypto.app.ui.tools.nftwallet.assets.NFTAssetsFragment r3 = r2.f14413Z
            androidx.navigation.a r4 = new androidx.navigation.a
            r0 = 2131361847(0x7f0a0037, float:1.8343458E38)
            r4.<init>(r0)
            r3.m12822E0(r4)
        L44:
            ch.l r3 = ch.C0985l.f5061a
            return r3
    }
}
