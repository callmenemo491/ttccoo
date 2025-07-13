package p359ud;

/* renamed from: ud.o */
/* loaded from: classes.dex */
public final class C6392o extends p239nh.AbstractC4830j implements mh.InterfaceC4625q<p086f2.InterfaceC1987b<? extends id.C3130a>, java.lang.Integer, android.view.View, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ p359ud.C6379b f24882Z;

    public C6392o(p359ud.C6379b r1) {
            r0 = this;
            r0.f24882Z = r1
            r1 = 3
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4625q
    /* renamed from: i */
    public ch.C0985l mo115i(p086f2.InterfaceC1987b<? extends id.C3130a> r9, java.lang.Integer r10, android.view.View r11) {
            r8 = this;
            f2.b r9 = (p086f2.InterfaceC1987b) r9
            java.lang.Number r10 = (java.lang.Number) r10
            r10.intValue()
            android.view.View r11 = (android.view.View) r11
            java.lang.String r10 = "$this$onChildViewClick"
            p214m2.C4339q.m9706k(r9, r10)
            java.lang.String r10 = "view"
            p214m2.C4339q.m9706k(r11, r10)
            java.lang.Object r9 = r9.getItem()
            id.a r9 = (id.C3130a) r9
            ud.m r0 = new ud.m
            ud.b r1 = r8.f24882Z
            r0.<init>(r1)
            ud.n r1 = new ud.n
            ud.b r2 = r8.f24882Z
            r1.<init>(r2)
            p214m2.C4339q.m9706k(r11, r10)
            java.lang.String r10 = "contact"
            p214m2.C4339q.m9706k(r9, r10)
            java.lang.String r10 = "editCallback"
            p214m2.C4339q.m9706k(r0, r10)
            java.lang.String r10 = "deleteCallback"
            p214m2.C4339q.m9706k(r1, r10)
            p359ud.C6398u.f24897a = r9
            android.content.Context r10 = r11.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r2 = 2131558567(0x7f0d00a7, float:1.8742453E38)
            r3 = 0
            r4 = 0
            android.view.View r10 = r10.inflate(r2, r3, r4)
            r2 = -2
            r10.measure(r2, r2)
            int r3 = r10.getMeasuredHeight()
            if (r3 > 0) goto L57
            r3 = -2
        L57:
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            r6 = 1
            r5.<init>(r10, r2, r3, r6)
            r2 = 1090519040(0x41000000, float:8.0)
            r5.setElevation(r2)
            r5.showAsDropDown(r11)
            r11 = 2131362090(0x7f0a012a, float:1.834395E38)
            android.view.View r2 = p064e.C1494h.m4055f(r10, r11)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            if (r2 == 0) goto Lad
            r11 = 2131362122(0x7f0a014a, float:1.8344016E38)
            android.view.View r3 = p064e.C1494h.m4055f(r10, r11)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            if (r3 == 0) goto Lad
            r11 = 2131362569(0x7f0a0309, float:1.8344922E38)
            android.view.View r7 = p064e.C1494h.m4055f(r10, r11)
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            if (r7 == 0) goto Lad
            r11 = 2131362703(0x7f0a038f, float:1.8345194E38)
            android.view.View r7 = p064e.C1494h.m4055f(r10, r11)
            androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
            if (r7 == 0) goto Lad
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            java.lang.String r9 = r9.m7598a()
            r7.setText(r9)
            ud.t r9 = new ud.t
            r9.<init>(r5, r0, r4)
            r3.setOnClickListener(r9)
            ud.t r9 = new ud.t
            r9.<init>(r5, r1, r6)
            r2.setOnClickListener(r9)
            ch.l r9 = ch.C0985l.f5061a
            return r9
        Lad:
            android.content.res.Resources r9 = r10.getResources()
            java.lang.String r9 = r9.getResourceName(r11)
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r11 = "Missing required view with ID: "
            java.lang.String r9 = r11.concat(r9)
            r10.<init>(r9)
            throw r10
    }
}
