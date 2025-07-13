package pe;

/* renamed from: pe.d */
/* loaded from: classes.dex */
public final class C5482d extends p239nh.AbstractC4830j implements mh.InterfaceC4625q<pe.C5480b.a, java.lang.Integer, p293qe.C5632e, ch.C0985l> {

    /* renamed from: Z */
    public static final pe.C5482d f21413Z = null;

    static {
            pe.d r0 = new pe.d
            r0.<init>()
            pe.C5482d.f21413Z = r0
            return
    }

    public C5482d() {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            return
    }

    @Override // mh.InterfaceC4625q
    /* renamed from: i */
    public ch.C0985l mo115i(pe.C5480b.a r4, java.lang.Integer r5, p293qe.C5632e r6) {
            r3 = this;
            pe.b$a r4 = (pe.C5480b.a) r4
            java.lang.Number r5 = (java.lang.Number) r5
            r5.intValue()
            qe.e r6 = (p293qe.C5632e) r6
            java.lang.String r5 = "$this$onBind"
            p214m2.C4339q.m9706k(r4, r5)
            java.lang.String r5 = "item"
            p214m2.C4339q.m9706k(r6, r5)
            p214m2.C4339q.m9706k(r6, r5)
            android.view.View r4 = r4.f3208a
            r5 = 2131362262(0x7f0a01d6, float:1.83443E38)
            android.view.View r0 = p064e.C1494h.m4055f(r4, r5)
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            if (r0 == 0) goto L60
            r5 = 2131362439(0x7f0a0287, float:1.8344659E38)
            android.view.View r1 = p064e.C1494h.m4055f(r4, r5)
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            if (r1 == 0) goto L60
            r5 = 2131362517(0x7f0a02d5, float:1.8344817E38)
            android.view.View r2 = p064e.C1494h.m4055f(r4, r5)
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            if (r2 == 0) goto L60
            com.google.android.material.card.MaterialCardView r4 = (com.google.android.material.card.MaterialCardView) r4
            java.lang.String r4 = "imageView"
            p214m2.C4339q.m9705j(r0, r4)
            qe.d r4 = r6.getImmutable_data()
            java.lang.String r4 = r4.getImageURL()
            vg.C6672m.m13521h(r0, r4)
            java.lang.String r4 = r6.getName()
            r1.setText(r4)
            qe.d r4 = r6.getImmutable_data()
            java.lang.String r4 = r4.getRarity()
            r2.setText(r4)
            ch.l r4 = ch.C0985l.f5061a
            return r4
        L60:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r5)
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "Missing required view with ID: "
            java.lang.String r4 = r6.concat(r4)
            r5.<init>(r4)
            throw r5
    }
}
