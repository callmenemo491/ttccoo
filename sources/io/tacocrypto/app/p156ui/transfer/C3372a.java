package io.tacocrypto.app.p156ui.transfer;

/* renamed from: io.tacocrypto.app.ui.transfer.a */
/* loaded from: classes.dex */
public final class C3372a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p255od.C5194b0, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ io.tacocrypto.app.p156ui.transfer.TransferFragment f14524Z;

    public C3372a(io.tacocrypto.app.p156ui.transfer.TransferFragment r1) {
            r0 = this;
            r0.f14524Z = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4620l
    /* renamed from: b */
    public ch.C0985l mo107b(p255od.C5194b0 r3) {
            r2 = this;
            od.b0 r3 = (p255od.C5194b0) r3
            java.lang.String r0 = "it"
            p214m2.C4339q.m9706k(r3, r0)
            io.tacocrypto.app.ui.transfer.TransferFragment r0 = r2.f14524Z
            int r1 = io.tacocrypto.app.p156ui.transfer.TransferFragment.f14509W0
            rg.f r0 = r0.m7749H0()
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "balance"
            p214m2.C4339q.m9706k(r3, r1)
            androidx.lifecycle.d0<od.b0> r1 = r0.f22634k
            r1.mo7l(r3)
            androidx.lifecycle.d0<java.lang.String> r3 = r0.f22638o
            java.lang.String r0 = ""
            r3.mo7l(r0)
            ch.l r3 = ch.C0985l.f5061a
            return r3
    }
}
