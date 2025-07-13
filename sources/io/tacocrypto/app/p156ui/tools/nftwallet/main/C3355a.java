package io.tacocrypto.app.p156ui.tools.nftwallet.main;

/* renamed from: io.tacocrypto.app.ui.tools.nftwallet.main.a */
/* loaded from: classes.dex */
public final class C3355a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<wf.C6859f, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTMainFragment f14502Z;

    public C3355a(io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTMainFragment r1) {
            r0 = this;
            r0.f14502Z = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4620l
    /* renamed from: b */
    public ch.C0985l mo107b(wf.C6859f r4) {
            r3 = this;
            wf.f r4 = (wf.C6859f) r4
            java.lang.String r0 = "it"
            p214m2.C4339q.m9706k(r4, r0)
            io.tacocrypto.app.ui.tools.nftwallet.main.NFTMainFragment r0 = r3.f14502Z
            int r1 = io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTMainFragment.f14489X0
            wf.k r0 = r0.m7747H0()
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "collection"
            p214m2.C4339q.m9706k(r4, r1)
            androidx.lifecycle.d0<wf.f> r1 = r0.f26639q
            boolean r2 = r4.f26618e
            if (r2 == 0) goto L1e
            r4 = 0
        L1e:
            r1.mo7l(r4)
            r0.m13923i()
            r4 = 0
            r0.m13926l(r4)
            ch.l r4 = ch.C0985l.f5061a
            return r4
    }
}
