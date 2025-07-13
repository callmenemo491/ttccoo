package sg;

/* renamed from: sg.c */
/* loaded from: classes.dex */
public final class C6068c extends p239nh.AbstractC4830j implements mh.InterfaceC4625q<sg.C6066a.a, java.lang.Integer, sg.C6071f.a, ch.C0985l> {

    /* renamed from: Z */
    public static final sg.C6068c f23428Z = null;

    static {
            sg.c r0 = new sg.c
            r0.<init>()
            sg.C6068c.f23428Z = r0
            return
    }

    public C6068c() {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            return
    }

    @Override // mh.InterfaceC4625q
    /* renamed from: i */
    public ch.C0985l mo115i(sg.C6066a.a r7, java.lang.Integer r8, sg.C6071f.a r9) {
            r6 = this;
            sg.a$a r7 = (sg.C6066a.a) r7
            java.lang.Number r8 = (java.lang.Number) r8
            r8.intValue()
            sg.f$a r9 = (sg.C6071f.a) r9
            java.lang.String r8 = "$this$onBind"
            p214m2.C4339q.m9706k(r7, r8)
            java.lang.String r8 = "item"
            p214m2.C4339q.m9706k(r9, r8)
            p214m2.C4339q.m9706k(r9, r8)
            android.view.View r7 = r7.f3208a
            r8 = 2131361877(0x7f0a0055, float:1.8343519E38)
            android.view.View r0 = p064e.C1494h.m4055f(r7, r8)
            com.google.android.material.card.MaterialCardView r0 = (com.google.android.material.card.MaterialCardView) r0
            r1 = 2131362022(0x7f0a00e6, float:1.8343813E38)
            r2 = 2131362262(0x7f0a01d6, float:1.83443E38)
            r3 = 2131362710(0x7f0a0396, float:1.8345208E38)
            if (r0 == 0) goto Lab
            r8 = r7
            com.google.android.material.card.MaterialCardView r8 = (com.google.android.material.card.MaterialCardView) r8
            android.view.View r4 = p064e.C1494h.m4055f(r7, r1)
            androidx.appcompat.widget.AppCompatImageView r4 = (androidx.appcompat.widget.AppCompatImageView) r4
            if (r4 == 0) goto La8
            android.view.View r1 = p064e.C1494h.m4055f(r7, r2)
            androidx.appcompat.widget.AppCompatImageView r1 = (androidx.appcompat.widget.AppCompatImageView) r1
            if (r1 == 0) goto La4
            android.view.View r2 = p064e.C1494h.m4055f(r7, r3)
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            if (r2 == 0) goto La0
            java.lang.String r7 = "imageView"
            p214m2.C4339q.m9705j(r1, r7)
            boolean r7 = r9.f23438c
            r7 = r7 ^ 1
            r3 = 8
            r5 = 0
            if (r7 == 0) goto L57
            r7 = 0
            goto L59
        L57:
            r7 = 8
        L59:
            r1.setVisibility(r7)
            java.lang.String r7 = "addView"
            p214m2.C4339q.m9705j(r0, r7)
            boolean r7 = r9.f23438c
            if (r7 == 0) goto L67
            r7 = 0
            goto L69
        L67:
            r7 = 8
        L69:
            r0.setVisibility(r7)
            java.lang.String r7 = "check"
            p214m2.C4339q.m9705j(r4, r7)
            boolean r7 = r9.f23437b
            if (r7 == 0) goto L76
            r3 = 0
        L76:
            r4.setVisibility(r3)
            boolean r7 = r9.f23438c
            if (r7 == 0) goto L80
            java.lang.String r7 = "ADD ACCOUNT"
            goto L8a
        L80:
            id.b r7 = r9.f23436a
            if (r7 == 0) goto L88
            java.lang.String r7 = r7.f12559a
            if (r7 != 0) goto L8a
        L88:
            java.lang.String r7 = "all accounts"
        L8a:
            r2.setText(r7)
            boolean r7 = r9.f23437b
            if (r7 == 0) goto L9a
            r7 = 2
            int r7 = vg.C6664e.m13501b(r7)
            r8.setStrokeWidth(r7)
            goto L9d
        L9a:
            r8.setStrokeWidth(r5)
        L9d:
            ch.l r7 = ch.C0985l.f5061a
            return r7
        La0:
            r8 = 2131362710(0x7f0a0396, float:1.8345208E38)
            goto Lab
        La4:
            r8 = 2131362262(0x7f0a01d6, float:1.83443E38)
            goto Lab
        La8:
            r8 = 2131362022(0x7f0a00e6, float:1.8343813E38)
        Lab:
            android.content.res.Resources r7 = r7.getResources()
            java.lang.String r7 = r7.getResourceName(r8)
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "Missing required view with ID: "
            java.lang.String r7 = r9.concat(r7)
            r8.<init>(r7)
            throw r8
    }
}
