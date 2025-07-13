package io.tacocrypto.app.p156ui.tools.nftwallet.collections;

/* renamed from: io.tacocrypto.app.ui.tools.nftwallet.collections.c */
/* loaded from: classes.dex */
public final class C3305c extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<p086f2.InterfaceC1987b<? extends tf.C6230c.a>, java.lang.Integer, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ io.tacocrypto.app.p156ui.tools.nftwallet.collections.NFTCollectionsFragment f14427Z;

    public C3305c(io.tacocrypto.app.p156ui.tools.nftwallet.collections.NFTCollectionsFragment r1) {
            r0 = this;
            r0.f14427Z = r1
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public ch.C0985l mo122l(p086f2.InterfaceC1987b<? extends tf.C6230c.a> r4, java.lang.Integer r5) {
            r3 = this;
            f2.b r4 = (p086f2.InterfaceC1987b) r4
            java.lang.Number r5 = (java.lang.Number) r5
            r5.intValue()
            java.lang.String r5 = "$this$onClickAvoidReclick"
            p214m2.C4339q.m9706k(r4, r5)
            io.tacocrypto.app.ui.tools.nftwallet.collections.NFTCollectionsFragment r5 = r3.f14427Z
            androidx.fragment.app.s r5 = r5.m1333s()
            boolean r0 = r5 instanceof io.tacocrypto.app.p156ui.tools.nftwallet.NFTWalletActivity
            if (r0 == 0) goto L19
            io.tacocrypto.app.ui.tools.nftwallet.NFTWalletActivity r5 = (io.tacocrypto.app.p156ui.tools.nftwallet.NFTWalletActivity) r5
            goto L1a
        L19:
            r5 = 0
        L1a:
            if (r5 == 0) goto L5e
            io.tacocrypto.app.ui.tools.nftwallet.NFTWalletActivity$a r5 = r5.f14397m0
            if (r5 != 0) goto L21
            goto L5e
        L21:
            io.tacocrypto.app.ui.tools.nftwallet.collections.NFTCollectionsFragment r0 = r3.f14427Z
            tf.c r0 = r0.m7743H0()
            java.lang.Object r4 = r4.getItem()
            tf.c$a r4 = (tf.C6230c.a) r4
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "nftDataUi"
            p214m2.C4339q.m9706k(r4, r1)
            java.lang.String r1 = "assetList"
            p214m2.C4339q.m9706k(r5, r1)
            io.tacocrypto.app.ui.tools.nftwallet.model.CollectionDataUi r4 = p417xf.C7053g.toCollectionDataUi(r4)
            java.util.Map<java.lang.String, ? extends java.util.List<xf.d>> r1 = r0.f24192q
            java.lang.String r2 = r4.getCollectionName()
            java.lang.Object r1 = r1.get(r2)
            p214m2.C4339q.m9704i(r1)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = "<set-?>"
            p214m2.C4339q.m9706k(r1, r2)
            r5.f14398a = r1
            androidx.lifecycle.d0<vg.b<io.tacocrypto.app.ui.tools.nftwallet.model.CollectionDataUi>> r5 = r0.f24193r
            vg.b r0 = new vg.b
            r0.<init>(r4)
            r5.mo7l(r0)
        L5e:
            ch.l r4 = ch.C0985l.f5061a
            return r4
    }
}
