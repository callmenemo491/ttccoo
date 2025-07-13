package p361uf;

/* renamed from: uf.j */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC6441j implements android.view.View.OnClickListener {

    /* renamed from: Y */
    public final /* synthetic */ int f24989Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.String f24990Z;

    public /* synthetic */ ViewOnClickListenerC6441j(java.lang.String r1, int r2) {
            r0 = this;
            r0.f24989Y = r2
            r0.<init>()
            r0.f24990Z = r1
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r4) {
            r3 = this;
            int r0 = r3.f24989Y
            java.lang.String r1 = "it.context"
            switch(r0) {
                case 0: goto L8;
                default: goto L7;
            }
        L7:
            goto L15
        L8:
            java.lang.String r0 = r3.f24990Z
            android.content.Context r4 = r4.getContext()
            p214m2.C4339q.m9705j(r4, r1)
            vg.C6672m.m13528o(r4, r0)
            return
        L15:
            java.lang.String r0 = r3.f24990Z
            int r2 = io.tacocrypto.app.p156ui.tools.nftwallet.detailold.NFTDetailOldFragment.C3336a.f14470u
            android.content.Context r4 = r4.getContext()
            p214m2.C4339q.m9705j(r4, r1)
            vg.C6672m.m13528o(r4, r0)
            return
    }
}
