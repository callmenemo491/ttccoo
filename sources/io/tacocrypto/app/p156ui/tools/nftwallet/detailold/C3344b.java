package io.tacocrypto.app.p156ui.tools.nftwallet.detailold;

/* renamed from: io.tacocrypto.app.ui.tools.nftwallet.detailold.b */
/* loaded from: classes.dex */
public final class C3344b extends p239nh.AbstractC4830j implements mh.InterfaceC4625q<io.tacocrypto.app.p156ui.tools.nftwallet.detailold.NFTDetailOldFragment.C3336a, java.lang.Integer, ch.C0978e<? extends java.lang.String, ? extends java.lang.Object>, ch.C0985l> {

    /* renamed from: Z */
    public static final io.tacocrypto.app.p156ui.tools.nftwallet.detailold.C3344b f14478Z = null;

    static {
            io.tacocrypto.app.ui.tools.nftwallet.detailold.b r0 = new io.tacocrypto.app.ui.tools.nftwallet.detailold.b
            r0.<init>()
            io.tacocrypto.app.p156ui.tools.nftwallet.detailold.C3344b.f14478Z = r0
            return
    }

    public C3344b() {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            return
    }

    @Override // mh.InterfaceC4625q
    /* renamed from: i */
    public ch.C0985l mo115i(io.tacocrypto.app.p156ui.tools.nftwallet.detailold.NFTDetailOldFragment.C3336a r4, java.lang.Integer r5, ch.C0978e<? extends java.lang.String, ? extends java.lang.Object> r6) {
            r3 = this;
            io.tacocrypto.app.ui.tools.nftwallet.detailold.NFTDetailOldFragment$a r4 = (io.tacocrypto.app.p156ui.tools.nftwallet.detailold.NFTDetailOldFragment.C3336a) r4
            java.lang.Number r5 = (java.lang.Number) r5
            r5.intValue()
            ch.e r6 = (ch.C0978e) r6
            java.lang.String r5 = "$this$onBind"
            p214m2.C4339q.m9706k(r4, r5)
            java.lang.String r5 = "item"
            p214m2.C4339q.m9706k(r6, r5)
            p214m2.C4339q.m9706k(r6, r5)
            android.view.View r4 = r4.f3208a
            jd.f0 r4 = p171jd.C3508f0.m7980c(r4)
            androidx.appcompat.widget.AppCompatTextView r5 = r4.f15144c
            A r0 = r6.f5050Y
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r5.setText(r0)
            B r5 = r6.f5051Z
            java.lang.String r5 = r5.toString()
            java.lang.CharSequence r5 = p362uh.C6467m.m13083n0(r5)
            java.lang.String r5 = r5.toString()
            r6 = 0
            r0 = 2
            java.lang.String r1 = "http"
            boolean r1 = p362uh.C6463i.m13061R(r5, r1, r6, r0)
            r2 = 0
            if (r1 == 0) goto L40
            r6 = r5
            goto L50
        L40:
            java.lang.String r1 = "Qm"
            boolean r6 = p362uh.C6463i.m13061R(r5, r1, r6, r0)
            if (r6 == 0) goto L4f
            java.lang.String r6 = "https://cdn.tacocrypto.io/default/resize:fit:400:400:0/plain/"
            java.lang.String r6 = p064e.C1493g.m4049a(r6, r5)
            goto L50
        L4f:
            r6 = r2
        L50:
            androidx.appcompat.widget.AppCompatTextView r0 = r4.f15145d
            r0.setText(r5)
            androidx.appcompat.widget.LinearLayoutCompat r5 = r4.m7981d()
            if (r6 == 0) goto L72
            uf.j r0 = new uf.j
            r1 = 1
            r0.<init>(r6, r1)
            r5.setOnClickListener(r0)
            androidx.appcompat.widget.AppCompatTextView r4 = r4.f15145d
            java.lang.String r5 = "valueText"
            p214m2.C4339q.m9705j(r4, r5)
            r5 = 2131099722(0x7f06004a, float:1.7811805E38)
            vg.C6664e.m13510k(r4, r5)
            goto L7b
        L72:
            r5.setOnClickListener(r2)
            androidx.appcompat.widget.AppCompatTextView r4 = r4.f15145d
            r5 = -1
            r4.setTextColor(r5)
        L7b:
            ch.l r4 = ch.C0985l.f5061a
            return r4
    }
}
