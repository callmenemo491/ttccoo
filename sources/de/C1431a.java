package de;

/* renamed from: de.a */
/* loaded from: classes.dex */
public final class C1431a extends androidx.recyclerview.widget.AbstractC0613x<de.C1444n, de.C1440j> {

    /* renamed from: f */
    public final mh.InterfaceC4620l<de.C1444n, ch.C0985l> f7115f;

    /* renamed from: g */
    public final mh.InterfaceC4620l<de.C1444n, ch.C0985l> f7116g;

    public C1431a(mh.InterfaceC4620l<? super de.C1444n, ch.C0985l> r2, mh.InterfaceC4620l<? super de.C1444n, ch.C0985l> r3) {
            r1 = this;
            androidx.recyclerview.widget.o$e<de.n> r0 = de.C1444n.f7162d
            r1.<init>(r0)
            r1.f7115f = r2
            r1.f7116g = r3
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: e */
    public void mo1523e(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r14, int r15) {
            r13 = this;
            de.j r14 = (de.C1440j) r14
            java.lang.String r0 = "holder"
            p214m2.C4339q.m9706k(r14, r0)
            androidx.recyclerview.widget.e<T> r0 = r13.f3640d
            java.util.List<T> r0 = r0.f3398f
            java.lang.Object r15 = r0.get(r15)
            java.lang.String r0 = "getItem(position)"
            p214m2.C4339q.m9705j(r15, r0)
            de.n r15 = (de.C1444n) r15
            mh.l<de.n, ch.l> r0 = r13.f7115f
            mh.l<de.n, ch.l> r1 = r13.f7116g
            java.lang.String r2 = "item"
            p214m2.C4339q.m9706k(r15, r2)
            java.lang.String r2 = "itemClickedListener"
            p214m2.C4339q.m9706k(r0, r2)
            java.lang.String r2 = "infoClickedListener"
            p214m2.C4339q.m9706k(r1, r2)
            jd.h0 r14 = r14.f7131u
            androidx.appcompat.widget.AppCompatTextView r2 = r14.f15203g
            io.tacocrypto.app.ui.secret.c r3 = r15.f7163a
            java.lang.String r3 = r3.m7732g()
            r2.setText(r3)
            java.lang.Object r2 = r14.f15200d
            r3 = r2
            androidx.appcompat.widget.AppCompatImageView r3 = (androidx.appcompat.widget.AppCompatImageView) r3
            java.lang.String r2 = "imageView"
            p214m2.C4339q.m9705j(r3, r2)
            io.tacocrypto.app.ui.secret.c r2 = r15.f7163a
            java.lang.String r4 = r2.m7731e()
            r5 = 0
            r2 = 44
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r7 = 0
            r8 = 8
            vg.C6672m.m13523j(r3, r4, r5, r6, r7, r8)
            java.lang.Object r2 = r14.f15206j
            androidx.appcompat.widget.AppCompatImageView r2 = (androidx.appcompat.widget.AppCompatImageView) r2
            java.lang.String r3 = "iconInfo"
            p214m2.C4339q.m9705j(r2, r3)
            de.f r4 = new de.f
            r4.<init>(r1, r15)
            r1 = 0
            r5 = 1
            vg.C6664e.m13509j(r2, r1, r4, r5)
            io.tacocrypto.app.ui.secret.b r2 = r15.f7164b
            int r2 = r2.ordinal()
            java.lang.String r4 = "root"
            java.lang.String r6 = "openText"
            java.lang.String r7 = "priceText"
            java.lang.String r8 = "unlockText"
            java.lang.String r9 = "cardButton"
            r10 = 8
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L156
            r12 = 2131099722(0x7f06004a, float:1.7811805E38)
            if (r2 == r5) goto Lcf
            r11 = 2
            if (r2 == r11) goto L86
            goto L1a4
        L86:
            com.google.android.material.card.MaterialCardView r2 = r14.f15198b
            p214m2.C4339q.m9705j(r2, r9)
            vg.C6664e.m13507h(r2, r12)
            java.lang.Object r2 = r14.f15205i
            androidx.appcompat.widget.LinearLayoutCompat r2 = (androidx.appcompat.widget.LinearLayoutCompat) r2
            r9 = 1059481190(0x3f266666, float:0.65)
            r2.setAlpha(r9)
            androidx.appcompat.widget.AppCompatTextView r2 = r14.f15204h
            p214m2.C4339q.m9705j(r2, r8)
            r2.setVisibility(r1)
            androidx.appcompat.widget.AppCompatTextView r2 = r14.f15202f
            p214m2.C4339q.m9705j(r2, r7)
            r2.setVisibility(r1)
            androidx.appcompat.widget.AppCompatTextView r2 = r14.f15199c
            p214m2.C4339q.m9705j(r2, r6)
            r2.setVisibility(r10)
            androidx.appcompat.widget.AppCompatTextView r2 = r14.f15202f
            java.lang.String r6 = "(coming soon)"
            r2.setText(r6)
            java.lang.Object r2 = r14.f15206j
            androidx.appcompat.widget.AppCompatImageView r2 = (androidx.appcompat.widget.AppCompatImageView) r2
            p214m2.C4339q.m9705j(r2, r3)
            r2.setVisibility(r1)
            java.lang.Object r2 = r14.f15205i
            androidx.appcompat.widget.LinearLayoutCompat r2 = (androidx.appcompat.widget.LinearLayoutCompat) r2
            p214m2.C4339q.m9705j(r2, r4)
            de.i r3 = new de.i
            r3.<init>(r0, r15)
            goto L196
        Lcf:
            com.google.android.material.card.MaterialCardView r2 = r14.f15198b
            p214m2.C4339q.m9705j(r2, r9)
            vg.C6664e.m13507h(r2, r12)
            java.lang.Object r2 = r14.f15205i
            androidx.appcompat.widget.LinearLayoutCompat r2 = (androidx.appcompat.widget.LinearLayoutCompat) r2
            r2.setAlpha(r11)
            androidx.appcompat.widget.AppCompatTextView r2 = r14.f15204h
            p214m2.C4339q.m9705j(r2, r8)
            r2.setVisibility(r1)
            androidx.appcompat.widget.AppCompatTextView r2 = r14.f15202f
            p214m2.C4339q.m9705j(r2, r7)
            r2.setVisibility(r1)
            androidx.appcompat.widget.AppCompatTextView r2 = r14.f15199c
            p214m2.C4339q.m9705j(r2, r6)
            r2.setVisibility(r10)
            androidx.appcompat.widget.AppCompatTextView r2 = r14.f15202f
            r4 = 40
            java.lang.StringBuilder r4 = p367v1.C6487a.m13176a(r4)
            md.t0 r6 = r15.f7165c
            if (r6 == 0) goto L120
            double r6 = r6.getCost()
            java.text.DecimalFormat r8 = new java.text.DecimalFormat
            java.lang.String r10 = "0.##"
            r8.<init>(r10)
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.text.DecimalFormatSymbols r10 = java.text.DecimalFormatSymbols.getInstance(r10)
            r8.setDecimalFormatSymbols(r10)
            java.lang.String r6 = r8.format(r6)
            java.lang.String r7 = "precision.format(this)"
            p214m2.C4339q.m9705j(r6, r7)
            goto L122
        L120:
            java.lang.String r6 = "--"
        L122:
            r4.append(r6)
            java.lang.String r6 = " TACO)"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r2.setText(r4)
            java.lang.Object r2 = r14.f15206j
            androidx.appcompat.widget.AppCompatImageView r2 = (androidx.appcompat.widget.AppCompatImageView) r2
            p214m2.C4339q.m9705j(r2, r3)
            r2.setVisibility(r1)
            java.lang.Object r2 = r14.f15205i
            androidx.appcompat.widget.LinearLayoutCompat r2 = (androidx.appcompat.widget.LinearLayoutCompat) r2
            r3 = 0
            r2.setOnClickListener(r3)
            com.google.android.material.card.MaterialCardView r2 = r14.f15198b
            p214m2.C4339q.m9705j(r2, r9)
            de.h r3 = new de.h
            r3.<init>(r0, r15)
            vg.C6664e.m13509j(r2, r1, r3, r5)
            com.google.android.material.card.MaterialCardView r14 = r14.f15198b
            r14.setClickable(r5)
            goto L1a4
        L156:
            com.google.android.material.card.MaterialCardView r2 = r14.f15198b
            p214m2.C4339q.m9705j(r2, r9)
            r9 = 2131099683(0x7f060023, float:1.7811726E38)
            vg.C6664e.m13507h(r2, r9)
            java.lang.Object r2 = r14.f15205i
            androidx.appcompat.widget.LinearLayoutCompat r2 = (androidx.appcompat.widget.LinearLayoutCompat) r2
            r2.setAlpha(r11)
            androidx.appcompat.widget.AppCompatTextView r2 = r14.f15204h
            p214m2.C4339q.m9705j(r2, r8)
            r2.setVisibility(r10)
            androidx.appcompat.widget.AppCompatTextView r2 = r14.f15202f
            p214m2.C4339q.m9705j(r2, r7)
            r2.setVisibility(r10)
            androidx.appcompat.widget.AppCompatTextView r2 = r14.f15199c
            p214m2.C4339q.m9705j(r2, r6)
            r2.setVisibility(r1)
            java.lang.Object r2 = r14.f15206j
            androidx.appcompat.widget.AppCompatImageView r2 = (androidx.appcompat.widget.AppCompatImageView) r2
            p214m2.C4339q.m9705j(r2, r3)
            r2.setVisibility(r10)
            java.lang.Object r2 = r14.f15205i
            androidx.appcompat.widget.LinearLayoutCompat r2 = (androidx.appcompat.widget.LinearLayoutCompat) r2
            p214m2.C4339q.m9705j(r2, r4)
            de.g r3 = new de.g
            r3.<init>(r0, r15)
        L196:
            vg.C6664e.m13509j(r2, r1, r3, r5)
            com.google.android.material.card.MaterialCardView r15 = r14.f15198b
            r0 = 0
            r15.setOnClickListener(r0)
            com.google.android.material.card.MaterialCardView r14 = r14.f15198b
            r14.setClickable(r1)
        L1a4:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: g */
    public androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 mo1524g(android.view.ViewGroup r12, int r13) {
            r11 = this;
            java.lang.String r13 = "parent"
            p214m2.C4339q.m9706k(r12, r13)
            android.content.Context r13 = r12.getContext()
            android.view.LayoutInflater r13 = android.view.LayoutInflater.from(r13)
            r0 = 2131558618(0x7f0d00da, float:1.8742557E38)
            r1 = 0
            android.view.View r12 = r13.inflate(r0, r12, r1)
            r13 = 2131361990(0x7f0a00c6, float:1.8343748E38)
            android.view.View r0 = p064e.C1494h.m4055f(r12, r13)
            r3 = r0
            com.google.android.material.card.MaterialCardView r3 = (com.google.android.material.card.MaterialCardView) r3
            if (r3 == 0) goto L84
            r13 = 2131362240(0x7f0a01c0, float:1.8344255E38)
            android.view.View r0 = p064e.C1494h.m4055f(r12, r13)
            r4 = r0
            androidx.appcompat.widget.AppCompatImageView r4 = (androidx.appcompat.widget.AppCompatImageView) r4
            if (r4 == 0) goto L84
            r13 = 2131362262(0x7f0a01d6, float:1.83443E38)
            android.view.View r0 = p064e.C1494h.m4055f(r12, r13)
            r5 = r0
            androidx.appcompat.widget.AppCompatImageView r5 = (androidx.appcompat.widget.AppCompatImageView) r5
            if (r5 == 0) goto L84
            r13 = 2131362265(0x7f0a01d9, float:1.8344306E38)
            android.view.View r0 = p064e.C1494h.m4055f(r12, r13)
            r6 = r0
            androidx.cardview.widget.CardView r6 = (androidx.cardview.widget.CardView) r6
            if (r6 == 0) goto L84
            r13 = 2131362473(0x7f0a02a9, float:1.8344728E38)
            android.view.View r0 = p064e.C1494h.m4055f(r12, r13)
            r7 = r0
            androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
            if (r7 == 0) goto L84
            r13 = 2131362499(0x7f0a02c3, float:1.834478E38)
            android.view.View r0 = p064e.C1494h.m4055f(r12, r13)
            r8 = r0
            androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
            if (r8 == 0) goto L84
            r13 = 2131362710(0x7f0a0396, float:1.8345208E38)
            android.view.View r0 = p064e.C1494h.m4055f(r12, r13)
            r9 = r0
            androidx.appcompat.widget.AppCompatTextView r9 = (androidx.appcompat.widget.AppCompatTextView) r9
            if (r9 == 0) goto L84
            r13 = 2131362745(0x7f0a03b9, float:1.834528E38)
            android.view.View r0 = p064e.C1494h.m4055f(r12, r13)
            r10 = r0
            androidx.appcompat.widget.AppCompatTextView r10 = (androidx.appcompat.widget.AppCompatTextView) r10
            if (r10 == 0) goto L84
            jd.h0 r13 = new jd.h0
            r2 = r12
            androidx.appcompat.widget.LinearLayoutCompat r2 = (androidx.appcompat.widget.LinearLayoutCompat) r2
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            de.j r12 = new de.j
            r12.<init>(r13)
            return r12
        L84:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r13)
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r0 = "Missing required view with ID: "
            java.lang.String r12 = r0.concat(r12)
            r13.<init>(r12)
            throw r13
    }
}
