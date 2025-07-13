package p458zg;

/* renamed from: zg.e */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC7333e implements android.view.View.OnClickListener {

    /* renamed from: Y */
    public final /* synthetic */ int f28074Y;

    /* renamed from: Z */
    public final /* synthetic */ mh.InterfaceC4609a f28075Z;

    /* renamed from: a0 */
    public final /* synthetic */ p458zg.C7334f f28076a0;

    public /* synthetic */ ViewOnClickListenerC7333e(mh.InterfaceC4609a r1, p458zg.C7334f r2, int r3) {
            r0 = this;
            r0.f28074Y = r3
            r0.<init>()
            r0.f28075Z = r1
            r0.f28076a0 = r2
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r2.f28074Y
            java.lang.String r0 = "this$0"
            switch(r3) {
                case 0: goto L8;
                default: goto L7;
            }
        L7:
            goto L1a
        L8:
            mh.a r3 = r2.f28075Z
            zg.f r1 = r2.f28076a0
            p214m2.C4339q.m9706k(r1, r0)
            if (r3 == 0) goto L14
            r3.mo15e()
        L14:
            androidx.appcompat.app.b r3 = r1.f28077a
            r3.dismiss()
            return
        L1a:
            mh.a r3 = r2.f28075Z
            zg.f r1 = r2.f28076a0
            p214m2.C4339q.m9706k(r1, r0)
            if (r3 == 0) goto L26
            r3.mo15e()
        L26:
            androidx.appcompat.app.b r3 = r1.f28077a
            r3.dismiss()
            return
    }
}
