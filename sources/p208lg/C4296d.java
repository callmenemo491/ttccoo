package p208lg;

/* renamed from: lg.d */
/* loaded from: classes.dex */
public final class C4296d extends p239nh.AbstractC4830j implements mh.InterfaceC4625q<p208lg.C4294b.a, java.lang.Integer, mg.C4605c, ch.C0985l> {

    /* renamed from: Z */
    public static final p208lg.C4296d f17547Z = null;

    static {
            lg.d r0 = new lg.d
            r0.<init>()
            p208lg.C4296d.f17547Z = r0
            return
    }

    public C4296d() {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            return
    }

    @Override // mh.InterfaceC4625q
    /* renamed from: i */
    public ch.C0985l mo115i(p208lg.C4294b.a r10, java.lang.Integer r11, mg.C4605c r12) {
            r9 = this;
            lg.b$a r10 = (p208lg.C4294b.a) r10
            java.lang.Number r11 = (java.lang.Number) r11
            r11.intValue()
            mg.c r12 = (mg.C4605c) r12
            java.lang.String r11 = "$this$onBind"
            p214m2.C4339q.m9706k(r10, r11)
            java.lang.String r11 = "item"
            p214m2.C4339q.m9706k(r12, r11)
            p214m2.C4339q.m9706k(r12, r11)
            android.view.View r10 = r10.f3208a
            r11 = 2131361927(0x7f0a0087, float:1.834362E38)
            android.view.View r0 = p064e.C1494h.m4055f(r10, r11)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            if (r0 == 0) goto L145
            r11 = 2131361967(0x7f0a00af, float:1.8343701E38)
            android.view.View r1 = p064e.C1494h.m4055f(r10, r11)
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            if (r1 == 0) goto L145
            r11 = 2131361969(0x7f0a00b1, float:1.8343705E38)
            android.view.View r2 = p064e.C1494h.m4055f(r10, r11)
            com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
            if (r2 == 0) goto L145
            r11 = 2131362084(0x7f0a0124, float:1.8343939E38)
            android.view.View r3 = p064e.C1494h.m4055f(r10, r11)
            androidx.appcompat.widget.AppCompatTextView r3 = (androidx.appcompat.widget.AppCompatTextView) r3
            if (r3 == 0) goto L145
            r11 = 2131362258(0x7f0a01d2, float:1.8344292E38)
            android.view.View r4 = p064e.C1494h.m4055f(r10, r11)
            androidx.appcompat.widget.AppCompatImageView r4 = (androidx.appcompat.widget.AppCompatImageView) r4
            if (r4 == 0) goto L145
            r11 = 2131362729(0x7f0a03a9, float:1.8345247E38)
            android.view.View r5 = p064e.C1494h.m4055f(r10, r11)
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            if (r5 == 0) goto L145
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            ng.b r10 = r12.getType()
            int r10 = r10.ordinal()
            r11 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r10 == 0) goto L83
            if (r10 == r8) goto L80
            if (r10 == r7) goto L7d
            if (r10 == r6) goto L7a
            if (r10 != r11) goto L74
            r10 = 0
            goto L85
        L74:
            e7.y7 r10 = new e7.y7
            r10.<init>(r7)
            throw r10
        L7a:
            java.lang.String r10 = "Send Token"
            goto L85
        L7d:
            java.lang.String r10 = "Receive Token"
            goto L85
        L80:
            java.lang.String r10 = "Send NFT"
            goto L85
        L83:
            java.lang.String r10 = "Receive NFT"
        L85:
            if (r10 == 0) goto L88
            goto L8c
        L88:
            java.lang.String r10 = r12.getActionName()
        L8c:
            r2.setText(r10)
            ng.b r10 = r12.getType()
            int r10 = r10.ordinal()
            if (r10 == 0) goto Laf
            if (r10 == r8) goto Lab
            if (r10 == r7) goto Laf
            if (r10 == r6) goto Lab
            if (r10 != r11) goto La5
            r10 = 2131099956(0x7f060134, float:1.781228E38)
            goto Lb2
        La5:
            e7.y7 r10 = new e7.y7
            r10.<init>(r7)
            throw r10
        Lab:
            r10 = 2131099732(0x7f060054, float:1.7811826E38)
            goto Lb2
        Laf:
            r10 = 2131099731(0x7f060053, float:1.7811823E38)
        Lb2:
            r2.setStrokeColorResource(r10)
            java.lang.String r11 = "buttonType"
            p214m2.C4339q.m9705j(r2, r11)
            vg.C6664e.m13510k(r2, r10)
            ng.b r10 = r12.getType()
            ng.b r11 = ng.EnumC4820b.f19210b0
            java.lang.String r2 = "buttonTransfer"
            java.lang.String r6 = "imageToken"
            r7 = 8
            if (r10 == r11) goto Le1
            ng.b r10 = r12.getType()
            ng.b r11 = ng.EnumC4820b.f19209a0
            if (r10 != r11) goto Ld4
            goto Le1
        Ld4:
            p214m2.C4339q.m9705j(r1, r2)
            r1.setVisibility(r7)
            p214m2.C4339q.m9705j(r4, r6)
            r4.setVisibility(r7)
            goto L121
        Le1:
            p214m2.C4339q.m9705j(r1, r2)
            r10 = 0
            r1.setVisibility(r10)
            java.lang.String r11 = r12.getQuantity()
            if (r11 != 0) goto Lf0
            java.lang.String r11 = ""
        Lf0:
            r1.setText(r11)
            p214m2.C4339q.m9705j(r4, r6)
            java.lang.String r11 = r12.getTokenImageURL()
            vg.C6672m.m13521h(r4, r11)
            com.bumptech.glide.j r11 = com.bumptech.glide.ComponentCallbacks2C0999c.m2737f(r4)
            java.lang.String r1 = r12.getTokenImageURL()
            com.bumptech.glide.i r11 = r11.mo2771t(r1)
            c3.a r11 = r11.mo2538k()
            com.bumptech.glide.i r11 = (com.bumptech.glide.C1005i) r11
            r1 = 2131231350(0x7f080276, float:1.8078779E38)
            c3.a r11 = r11.mo2536g(r1)
            com.bumptech.glide.i r11 = (com.bumptech.glide.C1005i) r11
            r11.m2753O(r4)
            p214m2.C4339q.m9705j(r4, r6)
            r4.setVisibility(r10)
        L121:
            android.text.SpannableStringBuilder r10 = r12.getBody()
            r0.setText(r10)
            java.lang.String r10 = r12.getId()
            java.lang.String r10 = p362uh.C6469o.m13084o0(r10, r7)
            r5.setText(r10)
            int r10 = r5.getPaintFlags()
            r10 = r10 | r7
            r5.setPaintFlags(r10)
            java.lang.String r10 = r12.getDate()
            r3.setText(r10)
            ch.l r10 = ch.C0985l.f5061a
            return r10
        L145:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r11)
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r12 = "Missing required view with ID: "
            java.lang.String r10 = r12.concat(r10)
            r11.<init>(r10)
            throw r11
    }
}
