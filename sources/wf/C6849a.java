package wf;

/* renamed from: wf.a */
/* loaded from: classes.dex */
public final class C6849a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ wf.C6851b f26602Z;

    /* renamed from: a0 */
    public final /* synthetic */ int f26603a0;

    public C6849a(wf.C6851b r1, int r2) {
            r0 = this;
            r0.f26602Z = r1
            r0.f26603a0 = r2
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4620l
    /* renamed from: b */
    public ch.C0985l mo107b(android.view.View r3) {
            r2 = this;
            android.view.View r3 = (android.view.View) r3
            java.lang.String r0 = "it"
            p214m2.C4339q.m9706k(r3, r0)
            wf.b r3 = r2.f26602Z
            mh.l<io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI, ch.l> r0 = r3.f26604d
            java.util.List<io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI> r3 = r3.f26606f
            int r1 = r2.f26603a0
            java.lang.Object r3 = r3.get(r1)
            r0.mo107b(r3)
            ch.l r3 = ch.C0985l.f5061a
            return r3
    }
}
