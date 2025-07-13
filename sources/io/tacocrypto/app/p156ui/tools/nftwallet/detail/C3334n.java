package io.tacocrypto.app.p156ui.tools.nftwallet.detail;

/* renamed from: io.tacocrypto.app.ui.tools.nftwallet.detail.n */
/* loaded from: classes.dex */
public final class C3334n extends p239nh.AbstractC4830j implements mh.InterfaceC4625q<io.tacocrypto.app.p156ui.tools.nftwallet.detail.NFTDetailFragment.C3308b, java.lang.Integer, p417xf.C7069w, ch.C0985l> {

    /* renamed from: Z */
    public static final io.tacocrypto.app.p156ui.tools.nftwallet.detail.C3334n f14462Z = null;

    static {
            io.tacocrypto.app.ui.tools.nftwallet.detail.n r0 = new io.tacocrypto.app.ui.tools.nftwallet.detail.n
            r0.<init>()
            io.tacocrypto.app.p156ui.tools.nftwallet.detail.C3334n.f14462Z = r0
            return
    }

    public C3334n() {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            return
    }

    @Override // mh.InterfaceC4625q
    /* renamed from: i */
    public ch.C0985l mo115i(io.tacocrypto.app.p156ui.tools.nftwallet.detail.NFTDetailFragment.C3308b r4, java.lang.Integer r5, p417xf.C7069w r6) {
            r3 = this;
            io.tacocrypto.app.ui.tools.nftwallet.detail.NFTDetailFragment$b r4 = (io.tacocrypto.app.p156ui.tools.nftwallet.detail.NFTDetailFragment.C3308b) r4
            java.lang.Number r5 = (java.lang.Number) r5
            r5.intValue()
            xf.w r6 = (p417xf.C7069w) r6
            java.lang.String r5 = "$this$onBind"
            p214m2.C4339q.m9706k(r4, r5)
            java.lang.String r5 = "item"
            p214m2.C4339q.m9706k(r6, r5)
            p214m2.C4339q.m9706k(r6, r5)
            android.view.View r4 = r4.f3208a
            r5 = 2131361898(0x7f0a006a, float:1.8343561E38)
            android.view.View r0 = p064e.C1494h.m4055f(r4, r5)
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            if (r0 == 0) goto L87
            r5 = 2131362084(0x7f0a0124, float:1.8343939E38)
            android.view.View r0 = p064e.C1494h.m4055f(r4, r5)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            if (r0 == 0) goto L87
            r5 = 2131362210(0x7f0a01a2, float:1.8344194E38)
            android.view.View r1 = p064e.C1494h.m4055f(r4, r5)
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            if (r1 == 0) goto L87
            r5 = 2131362715(0x7f0a039b, float:1.8345218E38)
            android.view.View r2 = p064e.C1494h.m4055f(r4, r5)
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            if (r2 == 0) goto L87
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            java.lang.String r4 = r6.getSender_name()
            java.lang.String r5 = "--"
            if (r4 == 0) goto L4f
            goto L50
        L4f:
            r4 = r5
        L50:
            r1.setText(r4)
            java.lang.String r4 = r6.getRecipient_name()
            if (r4 == 0) goto L5a
            r5 = r4
        L5a:
            r2.setText(r5)
            java.lang.String r4 = r6.getCreated_at_time()
            r5 = 0
            if (r4 == 0) goto L81
            java.lang.Long r4 = p362uh.C6462h.m13050G(r4)
            if (r4 == 0) goto L81
            long r1 = r4.longValue()
            java.lang.String r4 = "MMM dd, yyyy hh:mm:ss aaa"
            java.lang.String r6 = "format"
            p214m2.C4339q.m9706k(r4, r6)
            java.util.Calendar r6 = java.util.Calendar.getInstance()     // Catch: java.lang.Exception -> L81
            r6.setTimeInMillis(r1)     // Catch: java.lang.Exception -> L81
            r1 = 2
            java.lang.String r5 = vg.C6664e.m13504e(r6, r4, r5, r1)     // Catch: java.lang.Exception -> L81
        L81:
            r0.setText(r5)
            ch.l r4 = ch.C0985l.f5061a
            return r4
        L87:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r5)
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "Missing required view with ID: "
            java.lang.String r4 = r6.concat(r4)
            r5.<init>(r4)
            throw r5
    }
}
