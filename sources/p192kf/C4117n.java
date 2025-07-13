package p192kf;

/* renamed from: kf.n */
/* loaded from: classes.dex */
public final class C4117n extends androidx.recyclerview.widget.RecyclerView.AbstractC0549e<p192kf.C4117n.a> {

    /* renamed from: d */
    public final p020b3.C0660b f17101d;

    /* renamed from: e */
    public final java.util.List<p192kf.C4118o> f17102e;

    /* renamed from: f */
    public final boolean f17103f;

    /* renamed from: g */
    public final java.lang.String f17104g;

    /* renamed from: h */
    public final java.lang.String f17105h;

    /* renamed from: i */
    public final mh.InterfaceC4624p<p192kf.C4118o, java.lang.String, ch.C0985l> f17106i;

    /* renamed from: j */
    public final mh.InterfaceC4625q<java.lang.String, java.lang.String, java.lang.Boolean, ch.C0985l> f17107j;

    /* renamed from: k */
    public final mh.InterfaceC4620l<p192kf.C4118o, ch.C0985l> f17108k;

    /* renamed from: l */
    public final java.util.List<android.os.CountDownTimer> f17109l;

    /* renamed from: kf.n$a */
    public final class a extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {

        /* renamed from: u */
        public final p171jd.C3504e0 f17110u;

        /* renamed from: v */
        public final /* synthetic */ p192kf.C4117n f17111v;

        public a(p192kf.C4117n r1, p171jd.C3504e0 r2) {
                r0 = this;
                r0.f17111v = r1
                java.lang.Object r1 = r2.f15112h
                androidx.appcompat.widget.LinearLayoutCompat r1 = (androidx.appcompat.widget.LinearLayoutCompat) r1
                r0.<init>(r1)
                r0.f17110u = r2
                return
        }
    }

    public C4117n(p020b3.C0660b r2, java.util.List<p192kf.C4118o> r3, boolean r4, java.lang.String r5, java.lang.String r6, mh.InterfaceC4624p<? super p192kf.C4118o, ? super java.lang.String, ch.C0985l> r7, mh.InterfaceC4625q<? super java.lang.String, ? super java.lang.String, ? super java.lang.Boolean, ch.C0985l> r8, mh.InterfaceC4620l<? super p192kf.C4118o, ch.C0985l> r9) {
            r1 = this;
            java.lang.String r0 = "countDownManager"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "list"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "buildingAssetId"
            p214m2.C4339q.m9706k(r5, r0)
            java.lang.String r0 = "buildingTemplateId"
            p214m2.C4339q.m9706k(r6, r0)
            r1.<init>()
            r1.f17101d = r2
            r1.f17102e = r3
            r1.f17103f = r4
            r1.f17104g = r5
            r1.f17105h = r6
            r1.f17106i = r7
            r1.f17107j = r8
            r1.f17108k = r9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f17109l = r2
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: b */
    public int mo1521b() {
            r1 = this;
            java.util.List<kf.o> r0 = r1.f17102e
            int r0 = r0.size()
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: e */
    public void mo1523e(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r17, int r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            kf.n$a r1 = (p192kf.C4117n.a) r1
            java.lang.String r2 = "holder"
            p214m2.C4339q.m9706k(r1, r2)
            java.util.List<kf.o> r2 = r0.f17102e
            r3 = r18
            java.lang.Object r2 = r2.get(r3)
            kf.o r2 = (p192kf.C4118o) r2
            java.lang.String r3 = r0.f17104g
            java.lang.String r4 = r0.f17105h
            mh.p<kf.o, java.lang.String, ch.l> r5 = r0.f17106i
            mh.q<java.lang.String, java.lang.String, java.lang.Boolean, ch.l> r6 = r0.f17107j
            mh.l<kf.o, ch.l> r7 = r0.f17108k
            java.lang.String r8 = "buildingAssetId"
            p214m2.C4339q.m9706k(r3, r8)
            java.lang.String r8 = "buildingTemplateId"
            p214m2.C4339q.m9706k(r4, r8)
            java.lang.String r8 = "removeClick"
            p214m2.C4339q.m9706k(r5, r8)
            java.lang.String r8 = "addClick"
            p214m2.C4339q.m9706k(r6, r8)
            java.lang.String r8 = "harvestAnimal"
            p214m2.C4339q.m9706k(r7, r8)
            jd.e0 r8 = r1.f17110u
            kf.n r1 = r1.f17111v
            java.lang.String r9 = "subtitleText"
            java.lang.String r10 = "addView"
            java.lang.String r11 = "harvestButton"
            java.lang.String r12 = "imageView"
            java.lang.String r13 = "removeView"
            r14 = 8
            r15 = 0
            if (r2 != 0) goto La3
            java.lang.Object r2 = r8.f15109e
            com.google.android.material.card.MaterialCardView r2 = (com.google.android.material.card.MaterialCardView) r2
            p214m2.C4339q.m9705j(r2, r13)
            r2.setVisibility(r14)
            java.lang.Object r2 = r8.f15106b
            com.google.android.material.card.MaterialCardView r2 = (com.google.android.material.card.MaterialCardView) r2
            p214m2.C4339q.m9705j(r2, r10)
            r2.setVisibility(r15)
            java.lang.Object r2 = r8.f15112h
            androidx.appcompat.widget.LinearLayoutCompat r2 = (androidx.appcompat.widget.LinearLayoutCompat) r2
            java.lang.String r5 = "root"
            p214m2.C4339q.m9705j(r2, r5)
            kf.j r5 = new kf.j
            r5.<init>(r6, r3, r4, r1)
            r1 = 1
            vg.C6664e.m13509j(r2, r15, r5, r1)
            java.lang.Object r2 = r8.f15112h
            androidx.appcompat.widget.LinearLayoutCompat r2 = (androidx.appcompat.widget.LinearLayoutCompat) r2
            r2.setClickable(r1)
            java.lang.Object r1 = r8.f15111g
            com.google.android.material.imageview.ShapeableImageView r1 = (com.google.android.material.imageview.ShapeableImageView) r1
            r2 = 0
            r1.setImageDrawable(r2)
            java.lang.Object r1 = r8.f15111g
            com.google.android.material.imageview.ShapeableImageView r1 = (com.google.android.material.imageview.ShapeableImageView) r1
            p214m2.C4339q.m9705j(r1, r12)
            r1.setVisibility(r14)
            androidx.appcompat.widget.AppCompatTextView r1 = r8.f15110f
            java.lang.String r2 = "ADD"
            r1.setText(r2)
            androidx.appcompat.widget.AppCompatTextView r1 = r8.f15107c
            p214m2.C4339q.m9705j(r1, r9)
            r1.setVisibility(r14)
            com.google.android.material.button.MaterialButton r1 = r8.f15108d
            p214m2.C4339q.m9705j(r1, r11)
            r1.setVisibility(r14)
            goto L1b3
        La3:
            java.lang.Object r4 = r8.f15106b
            com.google.android.material.card.MaterialCardView r4 = (com.google.android.material.card.MaterialCardView) r4
            p214m2.C4339q.m9705j(r4, r10)
            r4.setVisibility(r14)
            java.lang.Object r4 = r8.f15109e
            com.google.android.material.card.MaterialCardView r4 = (com.google.android.material.card.MaterialCardView) r4
            p214m2.C4339q.m9705j(r4, r13)
            boolean r6 = r1.f17103f
            if (r6 == 0) goto Lb9
            r14 = 0
        Lb9:
            r4.setVisibility(r14)
            java.lang.Object r4 = r8.f15109e
            com.google.android.material.card.MaterialCardView r4 = (com.google.android.material.card.MaterialCardView) r4
            p214m2.C4339q.m9705j(r4, r13)
            kf.k r6 = new kf.k
            r6.<init>(r5, r2, r3)
            r3 = 1
            vg.C6664e.m13509j(r4, r15, r6, r3)
            java.lang.Object r3 = r8.f15112h
            androidx.appcompat.widget.LinearLayoutCompat r3 = (androidx.appcompat.widget.LinearLayoutCompat) r3
            r4 = 0
            r3.setOnClickListener(r4)
            java.lang.Object r3 = r8.f15112h
            androidx.appcompat.widget.LinearLayoutCompat r3 = (androidx.appcompat.widget.LinearLayoutCompat) r3
            r3.setClickable(r15)
            java.lang.Object r3 = r8.f15111g
            com.google.android.material.imageview.ShapeableImageView r3 = (com.google.android.material.imageview.ShapeableImageView) r3
            p214m2.C4339q.m9705j(r3, r12)
            r3.setVisibility(r15)
            java.lang.Object r3 = r8.f15111g
            com.google.android.material.imageview.ShapeableImageView r3 = (com.google.android.material.imageview.ShapeableImageView) r3
            p214m2.C4339q.m9705j(r3, r12)
            java.lang.String r4 = r2.f17115d
            vg.C6672m.m13524k(r3, r4)
            androidx.appcompat.widget.AppCompatTextView r3 = r8.f15110f
            java.lang.String r4 = r2.f17114c
            r3.setText(r4)
            androidx.appcompat.widget.AppCompatTextView r3 = r8.f15107c
            p214m2.C4339q.m9705j(r3, r9)
            r3.setVisibility(r15)
            boolean r3 = r1.f17103f
            java.lang.String r4 = " | "
            if (r3 == 0) goto L120
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = r2.f17116e
            r3.append(r5)
            r3.append(r4)
            java.lang.Integer r4 = r2.f17119h
            r3.append(r4)
            r4 = 32
            r3.append(r4)
            java.lang.String r4 = r2.f17118g
            goto L134
        L120:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = r2.f17116e
            r3.append(r5)
            r3.append(r4)
            int r4 = r2.f17117f
            r3.append(r4)
            java.lang.String r4 = " SEST"
        L134:
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            androidx.appcompat.widget.AppCompatTextView r4 = r8.f15107c
            r4.setText(r3)
            com.google.android.material.button.MaterialButton r3 = r8.f15108d
            p214m2.C4339q.m9705j(r3, r11)
            r3.setVisibility(r15)
            com.google.android.material.button.MaterialButton r3 = r8.f15108d
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.setAlpha(r4)
            com.google.android.material.button.MaterialButton r3 = r8.f15108d
            p214m2.C4339q.m9705j(r3, r11)
            kf.l r5 = new kf.l
            r5.<init>(r7, r2)
            r6 = 1
            vg.C6664e.m13509j(r3, r15, r5, r6)
            java.lang.String r3 = "UTC"
            java.util.TimeZone r3 = java.util.TimeZone.getTimeZone(r3)
            java.util.Calendar r3 = java.util.Calendar.getInstance(r3)
            long r5 = r3.getTimeInMillis()
            long r9 = r2.f17121j
            int r2 = r2.f17120i
            long r2 = (long) r2
            long r9 = r9 + r2
            r2 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r2
            long r9 = r9 * r2
            long r9 = r9 - r5
            r2 = 1000(0x3e8, double:4.94E-321)
            int r5 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            com.google.android.material.button.MaterialButton r2 = r8.f15108d
            if (r5 <= 0) goto L1a3
            r2.setEnabled(r15)
            com.google.android.material.button.MaterialButton r2 = r8.f15108d
            r3 = 1058642330(0x3f19999a, float:0.6)
            r2.setAlpha(r3)
            kf.m r2 = new kf.m
            r2.<init>(r9, r8)
            android.os.CountDownTimer r2 = r2.start()
            b3.b r3 = r1.f17101d
            java.lang.String r4 = "it"
            p214m2.C4339q.m9705j(r2, r4)
            r3.m2206a(r2)
            java.util.List<android.os.CountDownTimer> r1 = r1.f17109l
            r1.add(r2)
            goto L1b3
        L1a3:
            java.lang.String r1 = "harvest"
            r2.setText(r1)
            com.google.android.material.button.MaterialButton r1 = r8.f15108d
            r2 = 1
            r1.setEnabled(r2)
            com.google.android.material.button.MaterialButton r1 = r8.f15108d
            r1.setAlpha(r4)
        L1b3:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: g */
    public androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 mo1524g(android.view.ViewGroup r10, int r11) {
            r9 = this;
            java.lang.String r11 = "parent"
            p214m2.C4339q.m9706k(r10, r11)
            android.content.Context r11 = r10.getContext()
            android.view.LayoutInflater r11 = android.view.LayoutInflater.from(r11)
            r0 = 2131558602(0x7f0d00ca, float:1.8742524E38)
            r1 = 0
            android.view.View r10 = r11.inflate(r0, r10, r1)
            r11 = 2131361877(0x7f0a0055, float:1.8343519E38)
            android.view.View r0 = p064e.C1494h.m4055f(r10, r11)
            r3 = r0
            com.google.android.material.card.MaterialCardView r3 = (com.google.android.material.card.MaterialCardView) r3
            if (r3 == 0) goto L6c
            r11 = 2131362224(0x7f0a01b0, float:1.8344223E38)
            android.view.View r0 = p064e.C1494h.m4055f(r10, r11)
            r4 = r0
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            if (r4 == 0) goto L6c
            r11 = 2131362262(0x7f0a01d6, float:1.83443E38)
            android.view.View r0 = p064e.C1494h.m4055f(r10, r11)
            r5 = r0
            com.google.android.material.imageview.ShapeableImageView r5 = (com.google.android.material.imageview.ShapeableImageView) r5
            if (r5 == 0) goto L6c
            r11 = 2131362528(0x7f0a02e0, float:1.834484E38)
            android.view.View r0 = p064e.C1494h.m4055f(r10, r11)
            r6 = r0
            com.google.android.material.card.MaterialCardView r6 = (com.google.android.material.card.MaterialCardView) r6
            if (r6 == 0) goto L6c
            r11 = 2131362637(0x7f0a034d, float:1.834506E38)
            android.view.View r0 = p064e.C1494h.m4055f(r10, r11)
            r7 = r0
            androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
            if (r7 == 0) goto L6c
            r11 = 2131362710(0x7f0a0396, float:1.8345208E38)
            android.view.View r0 = p064e.C1494h.m4055f(r10, r11)
            r8 = r0
            androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
            if (r8 == 0) goto L6c
            jd.e0 r11 = new jd.e0
            r2 = r10
            androidx.appcompat.widget.LinearLayoutCompat r2 = (androidx.appcompat.widget.LinearLayoutCompat) r2
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            kf.n$a r10 = new kf.n$a
            r10.<init>(r9, r11)
            return r10
        L6c:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r11)
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r0 = "Missing required view with ID: "
            java.lang.String r10 = r0.concat(r10)
            r11.<init>(r10)
            throw r11
    }
}
