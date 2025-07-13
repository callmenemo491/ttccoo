package sd;

@android.annotation.SuppressLint({"NotifyDataSetChanged"})
/* renamed from: sd.a */
/* loaded from: classes.dex */
public final class C6031a extends androidx.recyclerview.widget.RecyclerView.AbstractC0549e<androidx.recyclerview.widget.RecyclerView.AbstractC0546b0> {

    /* renamed from: d */
    public final mh.InterfaceC4620l<sd.C6034d.a, ch.C0985l> f23243d;

    /* renamed from: e */
    public sd.C6034d.b f23244e;

    /* renamed from: f */
    public sd.C6034d.b f23245f;

    /* renamed from: g */
    public java.util.List<sd.C6034d.a> f23246g;

    /* renamed from: h */
    public boolean f23247h;

    /* renamed from: i */
    public boolean f23248i;

    /* renamed from: j */
    public io.tacocrypto.app.p156ui.balance.EnumC3214d f23249j;

    /* renamed from: sd.a$a */
    public static final class a extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {
        public a(android.view.View r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* renamed from: sd.a$b */
    public static final class b extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {
        public b(android.view.View r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* renamed from: sd.a$c */
    public static final class c extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ sd.C6031a f23250Z;

        /* renamed from: a0 */
        public final /* synthetic */ int f23251a0;

        public c(sd.C6031a r1, int r2) {
                r0 = this;
                r0.f23250Z = r1
                r0.f23251a0 = r2
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r4) {
                r3 = this;
                android.view.View r4 = (android.view.View) r4
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r4, r0)
                sd.a r4 = r3.f23250Z
                mh.l<sd.d$a, ch.l> r0 = r4.f23243d
                java.util.List<sd.d$a> r1 = r4.f23246g
                int r2 = r3.f23251a0
                int r4 = r4.m12512i()
                int r2 = r2 - r4
                java.lang.Object r4 = r1.get(r2)
                r0.mo107b(r4)
                ch.l r4 = ch.C0985l.f5061a
                return r4
        }
    }

    public C6031a(mh.InterfaceC4620l<? super sd.C6034d.a, ch.C0985l> r1) {
            r0 = this;
            r0.<init>()
            r0.f23243d = r1
            dh.k r1 = p062dh.C1475k.f7237Y
            r0.f23246g = r1
            r1 = 1
            r0.f23247h = r1
            io.tacocrypto.app.ui.balance.d r1 = io.tacocrypto.app.p156ui.balance.EnumC3214d.f14269Y
            r0.f23249j = r1
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: b */
    public int mo1521b() {
            r2 = this;
            int r0 = r2.m12512i()
            java.util.List<sd.d$a> r1 = r2.f23246g
            int r1 = r1.size()
            int r1 = r1 + r0
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: d */
    public int mo1522d(int r2) {
            r1 = this;
            int r0 = r1.m12512i()
            if (r2 >= r0) goto L8
            r2 = 0
            goto L9
        L8:
            r2 = 1
        L9:
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: e */
    public void mo1523e(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r24, int r25) {
            r23 = this;
            r1 = r23
            r0 = r24
            r2 = r25
            java.lang.String r3 = "holder"
            p214m2.C4339q.m9706k(r0, r3)
            boolean r3 = r0 instanceof sd.C6031a.b
            r4 = 1
            r5 = 0
            r6 = 8
            r7 = 2
            r8 = 2131099749(0x7f060065, float:1.781186E38)
            r9 = 2131231350(0x7f080276, float:1.8078779E38)
            if (r3 == 0) goto Lb2
            if (r2 != 0) goto L29
            sd.d$b r2 = r1.f23244e
            if (r2 == 0) goto L25
            boolean r3 = r2.f23293a
            if (r3 != r4) goto L25
            goto L26
        L25:
            r4 = 0
        L26:
            if (r4 == 0) goto L29
            goto L2b
        L29:
            sd.d$b r2 = r1.f23245f
        L2b:
            p214m2.C4339q.m9704i(r2)
            sd.a$b r0 = (sd.C6031a.b) r0
            boolean r3 = r1.f23247h
            android.view.View r0 = r0.f3208a
            jd.g0 r0 = p171jd.C3512g0.m7982a(r0)
            androidx.appcompat.widget.AppCompatTextView r4 = r0.f15180i
            java.lang.String r10 = r2.f23294b
            r4.setText(r10)
            androidx.appcompat.widget.AppCompatTextView r4 = r0.f15175d
            java.lang.String r10 = r2.f23295c
            r4.setText(r10)
            androidx.appcompat.widget.AppCompatTextView r4 = r0.f15176e
            java.lang.Double r10 = r2.f23297e
            if (r10 == 0) goto L55
            double r10 = r10.doubleValue()
            java.lang.String r5 = vg.C6672m.m13535v(r10, r6, r5, r7)
            goto L57
        L55:
            java.lang.String r5 = "---"
        L57:
            r4.setText(r5)
            androidx.appcompat.widget.AppCompatImageView r4 = r0.f15177f
            com.bumptech.glide.j r4 = com.bumptech.glide.ComponentCallbacks2C0999c.m2737f(r4)
            java.lang.String r5 = r2.f23296d
            com.bumptech.glide.i r4 = r4.mo2771t(r5)
            c3.a r4 = r4.mo2546v(r9)
            com.bumptech.glide.i r4 = (com.bumptech.glide.C1005i) r4
            c3.a r4 = r4.mo2536g(r9)
            com.bumptech.glide.i r4 = (com.bumptech.glide.C1005i) r4
            androidx.appcompat.widget.AppCompatImageView r5 = r0.f15177f
            r4.m2753O(r5)
            java.lang.Object r4 = r0.f15181j
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            if (r3 == 0) goto L84
            java.lang.Double r2 = r2.f23297e
            java.lang.String r2 = vg.C6672m.m13536w(r2)
            goto L86
        L84:
            java.lang.String r2 = r2.f23298f
        L86:
            r4.setText(r2)
            androidx.appcompat.widget.AppCompatImageView r2 = r0.f15179h
            java.lang.String r3 = "swapIcon"
            p214m2.C4339q.m9705j(r2, r3)
            r2.setVisibility(r6)
            androidx.constraintlayout.widget.ConstraintLayout r2 = r0.m7983c()
            r2.setBackgroundResource(r8)
            java.lang.Object r2 = r0.f15178g
            com.github.mikephil.charting.charts.LineChart r2 = (com.github.mikephil.charting.charts.LineChart) r2
            java.lang.String r3 = "lineChart"
            p214m2.C4339q.m9705j(r2, r3)
            r2.setVisibility(r6)
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f15174c
            java.lang.String r2 = "chartDiffText"
            p214m2.C4339q.m9705j(r0, r2)
            r0.setVisibility(r6)
            goto L2ef
        Lb2:
            boolean r3 = r0 instanceof sd.C6031a.a
            if (r3 == 0) goto L2ef
            r3 = r0
            sd.a$a r3 = (sd.C6031a.a) r3
            java.util.List<sd.d$a> r10 = r1.f23246g
            int r11 = r23.m12512i()
            int r11 = r2 - r11
            java.lang.Object r10 = r10.get(r11)
            sd.d$a r10 = (sd.C6034d.a) r10
            boolean r11 = r1.f23247h
            boolean r12 = r1.f23248i
            io.tacocrypto.app.ui.balance.d r13 = r1.f23249j
            java.lang.String r14 = "item"
            p214m2.C4339q.m9706k(r10, r14)
            java.lang.String r14 = "graphType"
            p214m2.C4339q.m9706k(r13, r14)
            android.view.View r14 = r3.f3208a
            jd.g0 r14 = p171jd.C3512g0.m7982a(r14)
            androidx.appcompat.widget.AppCompatTextView r15 = r14.f15180i
            od.b0 r6 = r10.f23286a
            java.lang.String r6 = r6.getCurrency()
            r15.setText(r6)
            androidx.appcompat.widget.AppCompatTextView r6 = r14.f15175d
            od.b0 r15 = r10.f23286a
            java.lang.String r15 = r15.getContract()
            r6.setText(r15)
            androidx.appcompat.widget.AppCompatTextView r6 = r14.f15176e
            od.b0 r15 = r10.f23286a
            java.lang.String r15 = r15.getAmountString()
            r6.setText(r15)
            androidx.appcompat.widget.AppCompatImageView r6 = r14.f15177f
            com.bumptech.glide.j r6 = com.bumptech.glide.ComponentCallbacks2C0999c.m2737f(r6)
            od.b0 r15 = r10.f23286a
            java.lang.String r15 = r15.getImage()
            com.bumptech.glide.i r6 = r6.mo2771t(r15)
            c3.a r6 = r6.mo2546v(r9)
            com.bumptech.glide.i r6 = (com.bumptech.glide.C1005i) r6
            c3.a r6 = r6.mo2536g(r9)
            com.bumptech.glide.i r6 = (com.bumptech.glide.C1005i) r6
            androidx.appcompat.widget.AppCompatImageView r9 = r14.f15177f
            r6.m2753O(r9)
            java.lang.Object r6 = r14.f15181j
            androidx.appcompat.widget.AppCompatTextView r6 = (androidx.appcompat.widget.AppCompatTextView) r6
            if (r11 == 0) goto L12c
            java.lang.Double r9 = r10.f23287b
            java.lang.String r9 = vg.C6672m.m13536w(r9)
            goto L12e
        L12c:
            java.lang.String r9 = r10.f23291f
        L12e:
            r6.setText(r9)
            androidx.appcompat.widget.AppCompatImageView r6 = r14.f15179h
            java.lang.String r9 = "swapIcon"
            p214m2.C4339q.m9705j(r6, r9)
            boolean r9 = r10.f23288c
            if (r9 == 0) goto L13e
            r9 = 0
            goto L140
        L13e:
            r9 = 8
        L140:
            r6.setVisibility(r9)
            boolean r6 = r10.f23292g
            if (r6 == 0) goto L172
            od.b0 r6 = r10.f23286a
            double r16 = r6.getAmount()
            r18 = 0
            int r6 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r6 >= 0) goto L163
            androidx.appcompat.widget.AppCompatTextView r6 = r14.f15176e
            java.lang.String r9 = "---"
            r6.setText(r9)
            java.lang.Object r6 = r14.f15181j
            androidx.appcompat.widget.AppCompatTextView r6 = (androidx.appcompat.widget.AppCompatTextView) r6
            java.lang.String r9 = "---"
            r6.setText(r9)
        L163:
            androidx.appcompat.widget.AppCompatTextView r6 = r14.f15175d
            java.lang.String r9 = "staked"
            r6.setText(r9)
            androidx.constraintlayout.widget.ConstraintLayout r6 = r14.m7983c()
            r6.setBackgroundResource(r8)
            goto L179
        L172:
            androidx.constraintlayout.widget.ConstraintLayout r6 = r14.m7983c()
            r6.setBackgroundResource(r5)
        L179:
            java.lang.Object r6 = r14.f15178g
            com.github.mikephil.charting.charts.LineChart r6 = (com.github.mikephil.charting.charts.LineChart) r6
            java.lang.String r8 = "lineChart"
            p214m2.C4339q.m9705j(r6, r8)
            r6.setDragEnabled(r5)
            r6.setScaleEnabled(r5)
            r6.setPinchZoom(r5)
            r8 = 1133903872(0x43960000, float:300.0)
            r6.setMaxHighlightDistance(r8)
            k3.h r8 = r6.getXAxis()
            r8.f16271a = r5
            k3.i r8 = r6.getAxisRight()
            r8.f16271a = r5
            k3.i r8 = r6.getAxisLeft()
            r8.f16271a = r5
            k3.e r8 = r6.getLegend()
            r8.f16271a = r5
            r6.setDrawGridBackground(r5)
            r6.setTouchEnabled(r5)
            java.lang.String r8 = ""
            r6.setNoDataText(r8)
            k3.c r8 = r6.getDescription()
            r8.f16271a = r5
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r6.f14624i1 = r4
            j3.a r8 = new j3.a
            r16 = r8
            r17 = r6
            r16.<init>(r17, r18, r19, r20, r21)
            r6.post(r8)
            if (r12 == 0) goto L2c7
            android.view.View r3 = r3.f3208a
            android.content.Context r3 = r3.getContext()
            java.lang.String r6 = "itemView.context"
            p214m2.C4339q.m9705j(r3, r6)
            nd.c r6 = p238nd.C4730c.f18962j
            r8 = 0
            if (r6 != 0) goto L1fd
            java.lang.Class<nd.c> r6 = p238nd.C4730c.class
            monitor-enter(r6)
            nd.c r9 = p238nd.C4730c.f18962j     // Catch: java.lang.Throwable -> L1fa
            if (r9 != 0) goto L1f8
            nd.c r9 = new nd.c     // Catch: java.lang.Throwable -> L1fa
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r11 = "context.applicationContext"
            p214m2.C4339q.m9705j(r3, r11)     // Catch: java.lang.Throwable -> L1fa
            r9.<init>(r3, r8)     // Catch: java.lang.Throwable -> L1fa
            p238nd.C4730c.f18962j = r9     // Catch: java.lang.Throwable -> L1fa
        L1f8:
            monitor-exit(r6)
            goto L1fd
        L1fa:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L1fd:
            nd.c r3 = p238nd.C4730c.f18962j
            p214m2.C4339q.m9704i(r3)
            java.lang.Object r6 = r14.f15178g
            com.github.mikephil.charting.charts.LineChart r6 = (com.github.mikephil.charting.charts.LineChart) r6
            androidx.appcompat.widget.AppCompatTextView r9 = r14.f15174c
            java.lang.String r11 = r10.f23289d
            java.lang.Boolean r10 = r10.f23290e
            java.lang.String r12 = ""
            if (r11 == 0) goto L2b8
            if (r10 != 0) goto L214
            goto L2b8
        L214:
            java.util.Map<java.lang.String, nd.c$a> r14 = r3.f18970h
            java.lang.Object r14 = r14.get(r11)
            nd.c$a r14 = (p238nd.C4730c.a) r14
            if (r14 == 0) goto L27c
            int r15 = r14.f18976e
            int r4 = r13.m7724e()
            if (r15 != r4) goto L27c
            if (r6 != 0) goto L229
            goto L22c
        L229:
            r6.setVisibility(r5)
        L22c:
            if (r6 != 0) goto L22f
            goto L234
        L22f:
            l3.g r4 = r14.f18972a
            r6.setData(r4)
        L234:
            boolean r4 = r14.f18975d
            if (r4 == 0) goto L23c
            if (r9 != 0) goto L2c3
            goto L2df
        L23c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            double r10 = r14.f18973b
            java.lang.String r6 = vg.C6672m.m13535v(r10, r7, r5, r7)
            r4.append(r6)
            r6 = 37
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            if (r9 != 0) goto L256
            goto L259
        L256:
            r9.setText(r4)
        L259:
            if (r9 == 0) goto L2df
            boolean r4 = r14.f18974c
            if (r4 == 0) goto L26c
            ch.d r3 = r3.f18967e
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            goto L278
        L26c:
            ch.d r3 = r3.f18968f
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
        L278:
            r9.setTextColor(r3)
            goto L2df
        L27c:
            if (r6 != 0) goto L27f
            goto L284
        L27f:
            r4 = 8
            r6.setVisibility(r4)
        L284:
            if (r9 != 0) goto L287
            goto L28a
        L287:
            r9.setText(r12)
        L28a:
            r10.booleanValue()
            java.util.Set<java.lang.String> r4 = r3.f18971i
            java.lang.String r6 = r13.toString()
            boolean r4 = r4.contains(r6)
            if (r4 == 0) goto L29a
            goto L2df
        L29a:
            java.util.Set<java.lang.String> r4 = r3.f18971i
            java.lang.String r6 = r13.toString()
            r4.add(r6)
            vh.v0 r17 = p379vh.C6746v0.f26044Y
            r18 = 0
            nd.h r4 = new nd.h
            r4.<init>(r3, r13, r11, r8)
            r21 = 3
            r22 = 0
            r19 = 0
            r20 = r4
            p101fh.C2174f.m5714d(r17, r18, r19, r20, r21, r22)
            goto L2df
        L2b8:
            if (r6 != 0) goto L2bb
            goto L2c0
        L2bb:
            r3 = 8
            r6.setVisibility(r3)
        L2c0:
            if (r9 != 0) goto L2c3
            goto L2df
        L2c3:
            r9.setText(r12)
            goto L2df
        L2c7:
            r3 = 8
            java.lang.Object r4 = r14.f15178g
            com.github.mikephil.charting.charts.LineChart r4 = (com.github.mikephil.charting.charts.LineChart) r4
            java.lang.String r6 = "lineChart"
            p214m2.C4339q.m9705j(r4, r6)
            r4.setVisibility(r3)
            androidx.appcompat.widget.AppCompatTextView r4 = r14.f15174c
            java.lang.String r6 = "chartDiffText"
            p214m2.C4339q.m9705j(r4, r6)
            r4.setVisibility(r3)
        L2df:
            android.view.View r0 = r0.f3208a
            java.lang.String r3 = "holder.itemView"
            p214m2.C4339q.m9705j(r0, r3)
            sd.a$c r3 = new sd.a$c
            r3.<init>(r1, r2)
            r2 = 1
            vg.C6664e.m13509j(r0, r5, r3, r2)
        L2ef:
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
            r1 = 2131558594(0x7f0d00c2, float:1.8742508E38)
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            java.lang.String r0 = "view"
            if (r5 != 0) goto L22
            sd.a$b r5 = new sd.a$b
            p214m2.C4339q.m9705j(r4, r0)
            r5.<init>(r4)
            goto L2a
        L22:
            sd.a$a r5 = new sd.a$a
            p214m2.C4339q.m9705j(r4, r0)
            r5.<init>(r4)
        L2a:
            return r5
    }

    /* renamed from: i */
    public final int m12512i() {
            r4 = this;
            sd.d$b r0 = r4.f23245f
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lc
            boolean r0 = r0.f23293a
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            sd.d$b r3 = r4.f23244e
            if (r3 == 0) goto L16
            boolean r3 = r3.f23293a
            if (r3 != r1) goto L16
            goto L17
        L16:
            r1 = 0
        L17:
            int r0 = r0 + r1
            return r0
    }
}
