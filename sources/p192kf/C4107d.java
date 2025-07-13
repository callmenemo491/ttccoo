package p192kf;

/* renamed from: kf.d */
/* loaded from: classes.dex */
public final class C4107d extends androidx.recyclerview.widget.RecyclerView.AbstractC0549e<androidx.recyclerview.widget.RecyclerView.AbstractC0546b0> {

    /* renamed from: d */
    public final p020b3.C0660b f17067d;

    /* renamed from: e */
    public final mh.InterfaceC4620l<java.lang.String, ch.C0985l> f17068e;

    /* renamed from: f */
    public final mh.InterfaceC4620l<p192kf.C4120q, ch.C0985l> f17069f;

    /* renamed from: g */
    public final mh.InterfaceC4624p<p192kf.C4118o, java.lang.String, ch.C0985l> f17070g;

    /* renamed from: h */
    public final mh.InterfaceC4625q<java.lang.String, java.lang.String, java.lang.Boolean, ch.C0985l> f17071h;

    /* renamed from: i */
    public final mh.InterfaceC4620l<p192kf.C4118o, ch.C0985l> f17072i;

    /* renamed from: j */
    public final mh.InterfaceC4620l<p192kf.C4120q, ch.C0985l> f17073j;

    /* renamed from: k */
    public final mh.InterfaceC4620l<java.lang.Boolean, ch.C0985l> f17074k;

    /* renamed from: l */
    public java.util.List<? extends java.lang.Object> f17075l;

    /* renamed from: kf.d$a */
    public final class a extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {

        /* renamed from: u */
        public final p171jd.C3504e0 f17076u;

        /* renamed from: v */
        public final /* synthetic */ p192kf.C4107d f17077v;

        public a(p192kf.C4107d r1, p171jd.C3504e0 r2) {
                r0 = this;
                r0.f17077v = r1
                com.google.android.material.card.MaterialCardView r1 = r2.m7978a()
                r0.<init>(r1)
                r0.f17076u = r2
                return
        }
    }

    /* renamed from: kf.d$b */
    public final class b extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {

        /* renamed from: u */
        public final p171jd.C3504e0 f17078u;

        /* renamed from: v */
        public android.os.CountDownTimer f17079v;

        /* renamed from: w */
        public final /* synthetic */ p192kf.C4107d f17080w;

        public b(p192kf.C4107d r1, p171jd.C3504e0 r2) {
                r0 = this;
                r0.f17080w = r1
                com.google.android.material.card.MaterialCardView r1 = r2.m7978a()
                r0.<init>(r1)
                r0.f17078u = r2
                return
        }
    }

    /* renamed from: kf.d$c */
    public static final class c extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {

        /* renamed from: u */
        public final p171jd.C3570x f17081u;

        public c(p171jd.C3570x r2) {
                r1 = this;
                com.google.android.material.card.MaterialCardView r0 = r2.m8013c()
                r1.<init>(r0)
                r1.f17081u = r2
                return
        }
    }

    /* renamed from: kf.d$d */
    public static final class d extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {

        /* renamed from: u */
        public final p171jd.C3515h f17082u;

        public d(p171jd.C3515h r2) {
                r1 = this;
                com.google.android.material.card.MaterialCardView r0 = r2.m7988f()
                r1.<init>(r0)
                r1.f17082u = r2
                return
        }
    }

    /* renamed from: kf.d$e */
    public static final class e extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {

        /* renamed from: u */
        public final p171jd.C3520i0 f17083u;

        public e(p171jd.C3520i0 r2) {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r2.m7990a()
                r1.<init>(r0)
                r1.f17083u = r2
                return
        }
    }

    public C4107d(p020b3.C0660b r1, mh.InterfaceC4620l<? super java.lang.String, ch.C0985l> r2, mh.InterfaceC4620l<? super p192kf.C4120q, ch.C0985l> r3, mh.InterfaceC4624p<? super p192kf.C4118o, ? super java.lang.String, ch.C0985l> r4, mh.InterfaceC4625q<? super java.lang.String, ? super java.lang.String, ? super java.lang.Boolean, ch.C0985l> r5, mh.InterfaceC4620l<? super p192kf.C4118o, ch.C0985l> r6, mh.InterfaceC4620l<? super p192kf.C4120q, ch.C0985l> r7, mh.InterfaceC4620l<? super java.lang.Boolean, ch.C0985l> r8) {
            r0 = this;
            r0.<init>()
            r0.f17067d = r1
            r0.f17068e = r2
            r0.f17069f = r3
            r0.f17070g = r4
            r0.f17071h = r5
            r0.f17072i = r6
            r0.f17073j = r7
            r0.f17074k = r8
            dh.k r1 = p062dh.C1475k.f7237Y
            r0.f17075l = r1
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: b */
    public int mo1521b() {
            r1 = this;
            java.util.List<? extends java.lang.Object> r0 = r1.f17075l
            int r0 = r0.size()
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: d */
    public int mo1522d(int r2) {
            r1 = this;
            java.util.List<? extends java.lang.Object> r0 = r1.f17075l
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto Lc
            r2 = 0
            goto L23
        Lc:
            boolean r0 = r2 instanceof p192kf.C4119p
            if (r0 == 0) goto L12
            r2 = 1
            goto L23
        L12:
            boolean r0 = r2 instanceof p192kf.C4120q
            if (r0 == 0) goto L18
            r2 = 2
            goto L23
        L18:
            boolean r0 = r2 instanceof p192kf.C4104a
            if (r0 == 0) goto L1e
            r2 = 3
            goto L23
        L1e:
            boolean r2 = r2 instanceof p192kf.C4105b
            if (r2 == 0) goto L24
            r2 = 4
        L23:
            return r2
        L24:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "item not found"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: e */
    public void mo1523e(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r22, int r23) {
            r21 = this;
            r0 = r21
            r1 = r22
            java.lang.String r2 = "holder"
            p214m2.C4339q.m9706k(r1, r2)
            java.util.List<? extends java.lang.Object> r2 = r0.f17075l
            r3 = r23
            java.lang.Object r2 = r2.get(r3)
            boolean r3 = r1 instanceof p192kf.C4107d.e
            java.lang.String r4 = "item"
            if (r3 == 0) goto L27
            kf.d$e r1 = (p192kf.C4107d.e) r1
            java.lang.String r2 = (java.lang.String) r2
            p214m2.C4339q.m9706k(r2, r4)
            jd.i0 r1 = r1.f17083u
            androidx.appcompat.widget.AppCompatTextView r1 = r1.f15229c
            r1.setText(r2)
            goto L390
        L27:
            boolean r3 = r1 instanceof p192kf.C4107d.a
            java.lang.String r5 = "removeView"
            java.lang.String r6 = " SEST"
            java.lang.String r7 = " | "
            java.lang.String r8 = "harvestButton"
            java.lang.String r9 = "list"
            java.lang.String r10 = "clickUnstake"
            java.lang.String r11 = "imageView"
            if (r3 == 0) goto L161
            kf.d$a r1 = (p192kf.C4107d.a) r1
            kf.p r2 = (p192kf.C4119p) r2
            mh.l<java.lang.String, ch.l> r3 = r0.f17068e
            mh.p<kf.o, java.lang.String, ch.l> r15 = r0.f17070g
            mh.q<java.lang.String, java.lang.String, java.lang.Boolean, ch.l> r14 = r0.f17071h
            mh.l<kf.o, ch.l> r13 = r0.f17072i
            p214m2.C4339q.m9706k(r2, r4)
            p214m2.C4339q.m9706k(r3, r10)
            java.lang.String r4 = "removeClick"
            p214m2.C4339q.m9706k(r15, r4)
            java.lang.String r4 = "addClick"
            p214m2.C4339q.m9706k(r14, r4)
            java.lang.String r4 = "harvestAnimal"
            p214m2.C4339q.m9706k(r13, r4)
            jd.e0 r4 = r1.f17076u
            kf.d r10 = r1.f17077v
            java.lang.Object r12 = r4.f15111g
            androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
            androidx.recyclerview.widget.RecyclerView$e r12 = r12.getAdapter()
            r16 = r13
            boolean r13 = r12 instanceof p192kf.C4117n
            if (r13 == 0) goto L6f
            kf.n r12 = (p192kf.C4117n) r12
            goto L70
        L6f:
            r12 = 0
        L70:
            if (r12 == 0) goto L9f
            b3.b r13 = r10.f17067d
            java.util.List<android.os.CountDownTimer> r12 = r12.f17109l
            java.util.Objects.requireNonNull(r13)
            p214m2.C4339q.m9706k(r12, r9)
            java.util.Iterator r12 = r12.iterator()
        L80:
            boolean r17 = r12.hasNext()
            if (r17 == 0) goto L9f
            java.lang.Object r17 = r12.next()
            r22 = r12
            r12 = r17
            android.os.CountDownTimer r12 = (android.os.CountDownTimer) r12
            r17 = r14
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r14 = r13.f3814a
            r14.remove(r12)
            r12.cancel()
            r12 = r22
            r14 = r17
            goto L80
        L9f:
            r17 = r14
            com.google.android.material.button.MaterialButton r12 = r4.f15108d
            p214m2.C4339q.m9705j(r12, r8)
            r8 = 8
            r12.setVisibility(r8)
            java.lang.Object r8 = r4.f15112h
            com.google.android.material.imageview.ShapeableImageView r8 = (com.google.android.material.imageview.ShapeableImageView) r8
            p214m2.C4339q.m9705j(r8, r11)
            java.lang.String r11 = r2.f17126d
            vg.C6672m.m13524k(r8, r11)
            androidx.appcompat.widget.AppCompatTextView r8 = r4.f15110f
            java.lang.String r11 = r2.f17125c
            r8.setText(r11)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = r2.f17127e
            r8.append(r11)
            r8.append(r7)
            java.util.List<kf.o> r7 = r2.f17129g
            java.util.Iterator r7 = r7.iterator()
            r11 = 0
        Ld2:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto Le6
            java.lang.Object r12 = r7.next()
            kf.o r12 = (p192kf.C4118o) r12
            if (r12 == 0) goto Le3
            int r12 = r12.f17117f
            goto Le4
        Le3:
            r12 = 0
        Le4:
            int r11 = r11 + r12
            goto Ld2
        Le6:
            java.lang.String r6 = p381w.C6764e.m13690a(r8, r11, r6)
            androidx.appcompat.widget.AppCompatTextView r7 = r4.f15107c
            r7.setText(r6)
            java.lang.Object r6 = r4.f15109e
            com.google.android.material.card.MaterialCardView r6 = (com.google.android.material.card.MaterialCardView) r6
            p214m2.C4339q.m9705j(r6, r5)
            kf.c r5 = new kf.c
            r5.<init>(r3, r2)
            r3 = 1
            r7 = 0
            vg.C6664e.m13509j(r6, r7, r5, r3)
            java.lang.Object r3 = r4.f15111g
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            p214m2.C4339q.m9705j(r3, r9)
            r3.setVisibility(r7)
            java.lang.Object r3 = r4.f15111g
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            kf.n r5 = new kf.n
            b3.b r13 = r10.f17067d
            java.util.List<kf.o> r14 = r2.f17129g
            boolean r6 = r2.f17131i
            java.lang.String r7 = r2.f17123a
            java.lang.String r2 = r2.f17124b
            r12 = r5
            r8 = r16
            r9 = r17
            r10 = r15
            r15 = r6
            r16 = r7
            r17 = r2
            r18 = r10
            r19 = r9
            r20 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r3.setAdapter(r5)
            java.lang.Object r2 = r4.f15111g
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            int r2 = r2.getItemDecorationCount()
            if (r2 != 0) goto L390
            java.lang.Object r2 = r4.f15111g
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            vg.t r3 = new vg.t
            jd.e0 r1 = r1.f17076u
            com.google.android.material.card.MaterialCardView r1 = r1.m7978a()
            android.content.Context r1 = r1.getContext()
            android.content.Context r1 = r1.getApplicationContext()
            java.lang.String r4 = "binding.root.context.applicationContext"
            p214m2.C4339q.m9705j(r1, r4)
            r4 = 2131231394(0x7f0802a2, float:1.8078868E38)
            r5 = 4
            r6 = 0
            r3.<init>(r1, r4, r6, r5)
            r2.m1754g(r3)
            goto L390
        L161:
            boolean r3 = r1 instanceof p192kf.C4107d.b
            if (r3 == 0) goto L273
            kf.d$b r1 = (p192kf.C4107d.b) r1
            kf.q r2 = (p192kf.C4120q) r2
            mh.l<kf.q, ch.l> r3 = r0.f17069f
            mh.l<kf.q, ch.l> r12 = r0.f17073j
            p214m2.C4339q.m9706k(r2, r4)
            p214m2.C4339q.m9706k(r3, r10)
            java.lang.String r4 = "harvestGarden"
            p214m2.C4339q.m9706k(r12, r4)
            jd.e0 r4 = r1.f17078u
            kf.d r10 = r1.f17080w
            com.google.android.material.button.MaterialButton r13 = r4.f15108d
            p214m2.C4339q.m9705j(r13, r8)
            r14 = 0
            r13.setVisibility(r14)
            java.lang.Object r13 = r4.f15112h
            com.google.android.material.imageview.ShapeableImageView r13 = (com.google.android.material.imageview.ShapeableImageView) r13
            p214m2.C4339q.m9705j(r13, r11)
            java.lang.String r11 = r2.f17134c
            vg.C6672m.m13524k(r13, r11)
            androidx.appcompat.widget.AppCompatTextView r11 = r4.f15110f
            java.lang.String r13 = r2.f17133b
            r11.setText(r13)
            int r11 = r2.f17136e
            if (r11 <= 0) goto L1af
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = r2.f17135d
            r11.append(r13)
            r11.append(r7)
            int r7 = r2.f17136e
            r11.append(r7)
            goto L1c7
        L1af:
            int r6 = r2.f17137f
            if (r6 <= 0) goto L1cf
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r6 = r2.f17135d
            r11.append(r6)
            r11.append(r7)
            int r6 = r2.f17137f
            r11.append(r6)
            java.lang.String r6 = " CBIT"
        L1c7:
            r11.append(r6)
            java.lang.String r6 = r11.toString()
            goto L1d1
        L1cf:
            java.lang.String r6 = r2.f17135d
        L1d1:
            androidx.appcompat.widget.AppCompatTextView r7 = r4.f15107c
            r7.setText(r6)
            java.lang.Object r6 = r4.f15111g
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            p214m2.C4339q.m9705j(r6, r9)
            r7 = 8
            r6.setVisibility(r7)
            java.lang.Object r6 = r4.f15109e
            com.google.android.material.card.MaterialCardView r6 = (com.google.android.material.card.MaterialCardView) r6
            p214m2.C4339q.m9705j(r6, r5)
            kf.e r5 = new kf.e
            r5.<init>(r3, r2)
            r3 = 1
            r7 = 0
            vg.C6664e.m13509j(r6, r7, r5, r3)
            com.google.android.material.button.MaterialButton r5 = r4.f15108d
            p214m2.C4339q.m9705j(r5, r8)
            kf.f r6 = new kf.f
            r6.<init>(r12, r2)
            vg.C6664e.m13509j(r5, r7, r6, r3)
            android.os.CountDownTimer r3 = r1.f17079v
            if (r3 == 0) goto L207
            r3.cancel()
        L207:
            b3.b r3 = r10.f17067d
            android.os.CountDownTimer r5 = r1.f17079v
            java.util.Objects.requireNonNull(r3)
            if (r5 == 0) goto L218
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r3 = r3.f3814a
            r3.remove(r5)
            r5.cancel()
        L218:
            java.lang.String r3 = "UTC"
            java.util.TimeZone r3 = java.util.TimeZone.getTimeZone(r3)
            java.util.Calendar r3 = java.util.Calendar.getInstance(r3)
            long r5 = r3.getTimeInMillis()
            long r7 = r2.f17139h
            int r2 = r2.f17138g
            long r2 = (long) r2
            long r7 = r7 + r2
            r2 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r2
            long r7 = r7 * r2
            long r7 = r7 - r5
            r2 = 1000(0x3e8, double:4.94E-321)
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r5 <= 0) goto L25d
            com.google.android.material.button.MaterialButton r2 = r4.f15108d
            r3 = 0
            r2.setEnabled(r3)
            com.google.android.material.button.MaterialButton r2 = r4.f15108d
            r3 = 1058642330(0x3f19999a, float:0.6)
            r2.setAlpha(r3)
            kf.g r2 = new kf.g
            r2.<init>(r7, r4)
            android.os.CountDownTimer r2 = r2.start()
            b3.b r3 = r10.f17067d
            java.lang.String r4 = "it"
            p214m2.C4339q.m9705j(r2, r4)
            r3.m2206a(r2)
            r1.f17079v = r2
            goto L390
        L25d:
            com.google.android.material.button.MaterialButton r1 = r4.f15108d
            java.lang.String r2 = "harvest"
            r1.setText(r2)
            com.google.android.material.button.MaterialButton r1 = r4.f15108d
            r2 = 1
            r1.setEnabled(r2)
            com.google.android.material.button.MaterialButton r1 = r4.f15108d
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r2)
            goto L390
        L273:
            boolean r3 = r1 instanceof p192kf.C4107d.c
            if (r3 == 0) goto L2a2
            kf.d$c r1 = (p192kf.C4107d.c) r1
            kf.a r2 = (p192kf.C4104a) r2
            p214m2.C4339q.m9706k(r2, r4)
            jd.x r1 = r1.f17081u
            java.lang.Object r2 = r1.f15628c
            com.google.android.material.imageview.ShapeableImageView r2 = (com.google.android.material.imageview.ShapeableImageView) r2
            p214m2.C4339q.m9705j(r2, r11)
            r3 = 0
            vg.C6672m.m13524k(r2, r3)
            java.lang.Object r2 = r1.f15629d
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            r2.setText(r3)
            java.lang.Object r1 = r1.f15630e
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            java.lang.String r2 = "buttonStake"
            p214m2.C4339q.m9705j(r1, r2)
            r2 = 8
            r1.setVisibility(r2)
            goto L390
        L2a2:
            boolean r3 = r1 instanceof p192kf.C4107d.d
            if (r3 == 0) goto L390
            kf.d$d r1 = (p192kf.C4107d.d) r1
            kf.b r2 = (p192kf.C4105b) r2
            mh.l<java.lang.Boolean, ch.l> r3 = r0.f17074k
            p214m2.C4339q.m9706k(r2, r4)
            java.lang.String r4 = "clickRefill"
            p214m2.C4339q.m9706k(r3, r4)
            jd.h r1 = r1.f17082u
            java.lang.Object r4 = r1.f15196d
            jd.l r4 = (p171jd.C3531l) r4
            java.lang.Object r4 = r4.f15306g
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            java.lang.String r5 = "water"
            r4.setText(r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = r2.f17061a
            r4.append(r5)
            r5 = 47
            r4.append(r5)
            int r6 = r2.f17062b
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.Object r6 = r1.f15196d
            jd.l r6 = (p171jd.C3531l) r6
            java.lang.Object r6 = r6.f15303d
            androidx.appcompat.widget.AppCompatTextView r6 = (androidx.appcompat.widget.AppCompatTextView) r6
            r6.setText(r4)
            java.lang.Object r4 = r1.f15196d
            jd.l r4 = (p171jd.C3531l) r4
            java.lang.Object r4 = r4.f15305f
            com.google.android.material.progressindicator.LinearProgressIndicator r4 = (com.google.android.material.progressindicator.LinearProgressIndicator) r4
            int r6 = r2.f17061a
            double r6 = (double) r6
            r8 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r6 = r6 * r8
            int r10 = r2.f17062b
            double r10 = (double) r10
            double r6 = vg.C6664e.m13506g(r6, r10)
            int r6 = (int) r6
            r4.setProgress(r6)
            java.lang.Object r4 = r1.f15196d
            jd.l r4 = (p171jd.C3531l) r4
            java.lang.Object r4 = r4.f15304e
            com.google.android.material.imageview.ShapeableImageView r4 = (com.google.android.material.imageview.ShapeableImageView) r4
            r6 = 2131231001(0x7f080119, float:1.807807E38)
            r4.setImageResource(r6)
            java.lang.Object r4 = r1.f15196d
            jd.l r4 = (p171jd.C3531l) r4
            java.lang.Object r4 = r4.f15302c
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            java.lang.String r6 = "water.harvestButton"
            p214m2.C4339q.m9705j(r4, r6)
            kf.h r6 = new kf.h
            r6.<init>(r3)
            r7 = 1
            r10 = 0
            vg.C6664e.m13509j(r4, r10, r6, r7)
            java.lang.Object r4 = r1.f15195c
            jd.l r4 = (p171jd.C3531l) r4
            java.lang.Object r4 = r4.f15306g
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            java.lang.String r6 = "food"
            r4.setText(r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r6 = r2.f17063c
            r4.append(r6)
            r4.append(r5)
            int r5 = r2.f17064d
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.Object r5 = r1.f15195c
            jd.l r5 = (p171jd.C3531l) r5
            java.lang.Object r5 = r5.f15303d
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            r5.setText(r4)
            java.lang.Object r4 = r1.f15195c
            jd.l r4 = (p171jd.C3531l) r4
            java.lang.Object r4 = r4.f15305f
            com.google.android.material.progressindicator.LinearProgressIndicator r4 = (com.google.android.material.progressindicator.LinearProgressIndicator) r4
            int r5 = r2.f17063c
            double r5 = (double) r5
            double r5 = r5 * r8
            int r2 = r2.f17064d
            double r7 = (double) r2
            double r5 = vg.C6664e.m13506g(r5, r7)
            int r2 = (int) r5
            r4.setProgress(r2)
            java.lang.Object r2 = r1.f15195c
            jd.l r2 = (p171jd.C3531l) r2
            java.lang.Object r2 = r2.f15304e
            com.google.android.material.imageview.ShapeableImageView r2 = (com.google.android.material.imageview.ShapeableImageView) r2
            r4 = 2131231000(0x7f080118, float:1.8078069E38)
            r2.setImageResource(r4)
            java.lang.Object r1 = r1.f15195c
            jd.l r1 = (p171jd.C3531l) r1
            java.lang.Object r1 = r1.f15302c
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            java.lang.String r2 = "food.harvestButton"
            p214m2.C4339q.m9705j(r1, r2)
            kf.i r2 = new kf.i
            r2.<init>(r3)
            r3 = 1
            r4 = 0
            vg.C6664e.m13509j(r1, r4, r2, r3)
        L390:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: g */
    public androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 mo1524g(android.view.ViewGroup r4, int r5) {
            r3 = this;
            java.lang.String r0 = "parent"
            p214m2.C4339q.m9706k(r4, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 0
            if (r5 == 0) goto L87
            r2 = 1
            if (r5 == r2) goto L7d
            r2 = 2
            if (r5 == r2) goto L73
            r2 = 3
            if (r5 == r2) goto L69
            r2 = 4
            if (r5 != r2) goto L61
            r5 = 2131558601(0x7f0d00c9, float:1.8742522E38)
            android.view.View r4 = r0.inflate(r5, r4, r1)
            r5 = 2131362206(0x7f0a019e, float:1.8344186E38)
            android.view.View r0 = p064e.C1494h.m4055f(r4, r5)
            r1 = 2131362766(0x7f0a03ce, float:1.8345322E38)
            if (r0 == 0) goto L4d
            jd.l r5 = p171jd.C3531l.m7999c(r0)
            android.view.View r0 = p064e.C1494h.m4055f(r4, r1)
            if (r0 == 0) goto L4a
            jd.l r0 = p171jd.C3531l.m7999c(r0)
            jd.h r1 = new jd.h
            com.google.android.material.card.MaterialCardView r4 = (com.google.android.material.card.MaterialCardView) r4
            r1.<init>(r4, r5, r0)
            kf.d$d r4 = new kf.d$d
            r4.<init>(r1)
            goto L91
        L4a:
            r5 = 2131362766(0x7f0a03ce, float:1.8345322E38)
        L4d:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r5)
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "Missing required view with ID: "
            java.lang.String r4 = r0.concat(r4)
            r5.<init>(r4)
            throw r5
        L61:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Item adapter UNKNOWN"
            r4.<init>(r5)
            throw r4
        L69:
            jd.x r4 = p171jd.C3570x.m8012d(r0, r4, r1)
            kf.d$c r5 = new kf.d$c
            r5.<init>(r4)
            goto L90
        L73:
            jd.e0 r4 = p171jd.C3504e0.m7977c(r0, r4, r1)
            kf.d$b r5 = new kf.d$b
            r5.<init>(r3, r4)
            goto L90
        L7d:
            jd.e0 r4 = p171jd.C3504e0.m7977c(r0, r4, r1)
            kf.d$a r5 = new kf.d$a
            r5.<init>(r3, r4)
            goto L90
        L87:
            jd.i0 r4 = p171jd.C3520i0.m7989c(r0, r4, r1)
            kf.d$e r5 = new kf.d$e
            r5.<init>(r4)
        L90:
            r4 = r5
        L91:
            return r4
    }
}
