package ye;

/* renamed from: ye.f */
/* loaded from: classes.dex */
public final class C7173f extends p239nh.AbstractC4830j implements mh.InterfaceC4625q<ye.C7165b.a, java.lang.Integer, p456ze.C7313f, ch.C0985l> {

    /* renamed from: Z */
    public static final ye.C7173f f27666Z = null;

    static {
            ye.f r0 = new ye.f
            r0.<init>()
            ye.C7173f.f27666Z = r0
            return
    }

    public C7173f() {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            return
    }

    @Override // mh.InterfaceC4625q
    /* renamed from: i */
    public ch.C0985l mo115i(ye.C7165b.a r8, java.lang.Integer r9, p456ze.C7313f r10) {
            r7 = this;
            ye.b$a r8 = (ye.C7165b.a) r8
            java.lang.Number r9 = (java.lang.Number) r9
            r9.intValue()
            ze.f r10 = (p456ze.C7313f) r10
            java.lang.String r9 = "$this$onBind"
            p214m2.C4339q.m9706k(r8, r9)
            java.lang.String r9 = "item"
            p214m2.C4339q.m9706k(r10, r9)
            p214m2.C4339q.m9706k(r10, r9)
            android.view.View r8 = r8.f3208a
            r9 = 2131361925(0x7f0a0085, float:1.8343616E38)
            android.view.View r0 = p064e.C1494h.m4055f(r8, r9)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            if (r0 == 0) goto Lc7
            r9 = 2131362259(0x7f0a01d3, float:1.8344294E38)
            android.view.View r1 = p064e.C1494h.m4055f(r8, r9)
            com.google.android.material.imageview.ShapeableImageView r1 = (com.google.android.material.imageview.ShapeableImageView) r1
            if (r1 == 0) goto Lc7
            r9 = 2131362260(0x7f0a01d4, float:1.8344296E38)
            android.view.View r2 = p064e.C1494h.m4055f(r8, r9)
            com.google.android.material.imageview.ShapeableImageView r2 = (com.google.android.material.imageview.ShapeableImageView) r2
            if (r2 == 0) goto Lc7
            r9 = 2131362283(0x7f0a01eb, float:1.8344342E38)
            android.view.View r3 = p064e.C1494h.m4055f(r8, r9)
            androidx.appcompat.widget.AppCompatTextView r3 = (androidx.appcompat.widget.AppCompatTextView) r3
            if (r3 == 0) goto Lc7
            r9 = 2131362285(0x7f0a01ed, float:1.8344346E38)
            android.view.View r3 = p064e.C1494h.m4055f(r8, r9)
            androidx.appcompat.widget.AppCompatTextView r3 = (androidx.appcompat.widget.AppCompatTextView) r3
            if (r3 == 0) goto Lc7
            r9 = 2131362439(0x7f0a0287, float:1.8344659E38)
            android.view.View r3 = p064e.C1494h.m4055f(r8, r9)
            androidx.appcompat.widget.AppCompatTextView r3 = (androidx.appcompat.widget.AppCompatTextView) r3
            if (r3 == 0) goto Lc7
            r9 = 2131362489(0x7f0a02b9, float:1.834476E38)
            android.view.View r4 = p064e.C1494h.m4055f(r8, r9)
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            if (r4 == 0) goto Lc7
            r9 = 2131362492(0x7f0a02bc, float:1.8344766E38)
            android.view.View r5 = p064e.C1494h.m4055f(r8, r9)
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            if (r5 == 0) goto Lc7
            com.google.android.material.card.MaterialCardView r8 = (com.google.android.material.card.MaterialCardView) r8
            java.lang.String r8 = "imageToken1"
            p214m2.C4339q.m9705j(r1, r8)
            java.lang.String r8 = r10.getImageToken()
            vg.C6672m.m13521h(r1, r8)
            java.lang.String r8 = "imageToken2"
            p214m2.C4339q.m9705j(r2, r8)
            io.tacocrypto.app.a r8 = io.tacocrypto.app.EnumC3199a.f14238w0
            java.lang.String r8 = p097fd.C2139a.m5697a(r8)
            vg.C6672m.m13521h(r2, r8)
            java.lang.String r8 = r10.getName()
            r3.setText(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            double r1 = r10.getPercentage()
            r9 = 4
            r3 = 0
            r6 = 2
            java.lang.String r1 = vg.C6672m.m13535v(r1, r9, r3, r6)
            r8.append(r1)
            r1 = 37
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            r4.setText(r8)
            double r1 = r10.getBluEarned()
            java.lang.String r8 = vg.C6672m.m13535v(r1, r9, r3, r6)
            r0.setText(r8)
            java.lang.String r8 = r10.getStaked()
            r5.setText(r8)
            ch.l r8 = ch.C0985l.f5061a
            return r8
        Lc7:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r9)
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "Missing required view with ID: "
            java.lang.String r8 = r10.concat(r8)
            r9.<init>(r8)
            throw r9
    }
}
