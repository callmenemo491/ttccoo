package eg;

/* renamed from: eg.d */
/* loaded from: classes.dex */
public final class C1840d extends p239nh.AbstractC4830j implements mh.InterfaceC4625q<eg.C1838b.a, java.lang.Integer, ch.C0978e<? extends p100fg.C2162a, ? extends p100fg.C2166e>, ch.C0985l> {

    /* renamed from: Z */
    public static final eg.C1840d f8013Z = null;

    static {
            eg.d r0 = new eg.d
            r0.<init>()
            eg.C1840d.f8013Z = r0
            return
    }

    public C1840d() {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            return
    }

    @Override // mh.InterfaceC4625q
    /* renamed from: i */
    public ch.C0985l mo115i(eg.C1838b.a r5, java.lang.Integer r6, ch.C0978e<? extends p100fg.C2162a, ? extends p100fg.C2166e> r7) {
            r4 = this;
            eg.b$a r5 = (eg.C1838b.a) r5
            java.lang.Number r6 = (java.lang.Number) r6
            r6.intValue()
            ch.e r7 = (ch.C0978e) r7
            java.lang.String r6 = "$this$onBind"
            p214m2.C4339q.m9706k(r5, r6)
            java.lang.String r6 = "item"
            p214m2.C4339q.m9706k(r7, r6)
            p214m2.C4339q.m9706k(r7, r6)
            android.view.View r5 = r5.f3208a
            r6 = 2131362439(0x7f0a0287, float:1.8344659E38)
            android.view.View r0 = p064e.C1494h.m4055f(r5, r6)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            if (r0 == 0) goto L98
            r6 = 2131362477(0x7f0a02ad, float:1.8344736E38)
            android.view.View r1 = p064e.C1494h.m4055f(r5, r6)
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            if (r1 == 0) goto L98
            r6 = 2131362545(0x7f0a02f1, float:1.8344874E38)
            android.view.View r2 = p064e.C1494h.m4055f(r5, r6)
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            if (r2 == 0) goto L98
            r6 = 2131362546(0x7f0a02f2, float:1.8344876E38)
            android.view.View r3 = p064e.C1494h.m4055f(r5, r6)
            androidx.appcompat.widget.AppCompatTextView r3 = (androidx.appcompat.widget.AppCompatTextView) r3
            if (r3 == 0) goto L98
            com.google.android.material.card.MaterialCardView r5 = (com.google.android.material.card.MaterialCardView) r5
            B r5 = r7.f5051Z
            fg.e r5 = (p100fg.C2166e) r5
            java.lang.String r5 = r5.getName()
            r0.setText(r5)
            A r5 = r7.f5050Y
            fg.a r5 = (p100fg.C2162a) r5
            int r5 = r5.getAssetsNumber()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r1.setText(r5)
            java.text.DecimalFormat r5 = new java.text.DecimalFormat
            java.lang.String r6 = "0.##"
            r5.<init>(r6)
            java.math.RoundingMode r6 = java.math.RoundingMode.DOWN
            r5.setRoundingMode(r6)
            B r6 = r7.f5051Z
            fg.e r6 = (p100fg.C2166e) r6
            double r0 = r6.getRplmValue()
            java.lang.String r6 = r5.format(r0)
            r3.setText(r6)
            A r6 = r7.f5050Y
            fg.a r6 = (p100fg.C2162a) r6
            int r6 = r6.getAssetsNumber()
            double r0 = (double) r6
            B r6 = r7.f5051Z
            fg.e r6 = (p100fg.C2166e) r6
            double r6 = r6.getRplmValue()
            double r6 = r6 * r0
            java.lang.String r5 = r5.format(r6)
            r2.setText(r5)
            ch.l r5 = ch.C0985l.f5061a
            return r5
        L98:
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r5 = r5.getResourceName(r6)
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "Missing required view with ID: "
            java.lang.String r5 = r7.concat(r5)
            r6.<init>(r5)
            throw r6
    }
}
