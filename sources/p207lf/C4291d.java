package p207lf;

/* renamed from: lf.d */
/* loaded from: classes.dex */
public final class C4291d extends td.AbstractC6218f<p171jd.C3537m1> {

    /* renamed from: q1 */
    public static java.util.List<p192kf.C4118o> f17523q1;

    /* renamed from: m1 */
    public final boolean f17524m1;

    /* renamed from: n1 */
    public p207lf.InterfaceC4288a f17525n1;

    /* renamed from: o1 */
    public final ch.InterfaceC0977d f17526o1;

    /* renamed from: p1 */
    public final p207lf.C4290c f17527p1;

    /* renamed from: lf.d$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p192kf.C4118o, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p207lf.C4291d f17528Z;

        public a(p207lf.C4291d r1) {
                r0 = this;
                r0.f17528Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(p192kf.C4118o r3) {
                r2 = this;
                kf.o r3 = (p192kf.C4118o) r3
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r3, r0)
                lf.d r0 = r2.f17528Z
                lf.a r1 = r0.f17525n1
                if (r1 == 0) goto L18
                ch.d r0 = r0.f17526o1
                java.lang.Object r0 = r0.getValue()
                java.lang.String r0 = (java.lang.String) r0
                r1.mo8020d(r0, r3)
            L18:
                lf.d r3 = r2.f17528Z
                r3.mo1222D0()
                ch.l r3 = ch.C0985l.f5061a
                return r3
        }
    }

    /* renamed from: lf.d$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<java.lang.String> {

        /* renamed from: Z */
        public final /* synthetic */ p207lf.C4291d f17529Z;

        public b(p207lf.C4291d r1) {
                r0 = this;
                r0.f17529Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public java.lang.String mo15e() {
                r2 = this;
                lf.d r0 = r2.f17529Z
                android.os.Bundle r0 = r0.m1332r0()
                java.lang.String r1 = "buildingAssetId"
                java.lang.String r0 = r0.getString(r1)
                p214m2.C4339q.m9704i(r0)
                return r0
        }
    }

    /* renamed from: lf.d$c */
    public /* synthetic */ class c extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3537m1> {

        /* renamed from: g0 */
        public static final p207lf.C4291d.c f17530g0 = null;

        static {
                lf.d$c r0 = new lf.d$c
                r0.<init>()
                p207lf.C4291d.c.f17530g0 = r0
                return
        }

        public c() {
                r6 = this;
                java.lang.Class<jd.m1> r2 = p171jd.C3537m1.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/ToolFarmingtalesAddFragmentBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.C3537m1 mo115i(android.view.LayoutInflater r10, android.view.ViewGroup r11, java.lang.Boolean r12) {
                r9 = this;
                android.view.LayoutInflater r10 = (android.view.LayoutInflater) r10
                android.view.ViewGroup r11 = (android.view.ViewGroup) r11
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                java.lang.String r0 = "p0"
                p214m2.C4339q.m9706k(r10, r0)
                r0 = 2131558669(0x7f0d010d, float:1.874266E38)
                r1 = 0
                android.view.View r10 = r10.inflate(r0, r11, r1)
                if (r12 == 0) goto L1c
                r11.addView(r10)
            L1c:
                r11 = 2131361894(0x7f0a0066, float:1.8343553E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r2 = r12
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                if (r2 == 0) goto L7a
                r11 = 2131361981(0x7f0a00bd, float:1.834373E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r3 = r12
                androidx.appcompat.widget.AppCompatImageView r3 = (androidx.appcompat.widget.AppCompatImageView) r3
                if (r3 == 0) goto L7a
                r11 = 2131362127(0x7f0a014f, float:1.8344026E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r4 = r12
                androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
                if (r4 == 0) goto L7a
                r11 = 2131362225(0x7f0a01b1, float:1.8344225E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r5 = r12
                com.google.android.material.card.MaterialCardView r5 = (com.google.android.material.card.MaterialCardView) r5
                if (r5 == 0) goto L7a
                r11 = 2131362298(0x7f0a01fa, float:1.8344373E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r6 = r12
                androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
                if (r6 == 0) goto L7a
                r11 = 2131362646(0x7f0a0356, float:1.8345078E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r7 = r12
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r7 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r7
                if (r7 == 0) goto L7a
                r11 = 2131362710(0x7f0a0396, float:1.8345208E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r8 = r12
                androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
                if (r8 == 0) goto L7a
                jd.m1 r11 = new jd.m1
                r1 = r10
                androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
                r0 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r11
            L7a:
                android.content.res.Resources r10 = r10.getResources()
                java.lang.String r10 = r10.getResourceName(r11)
                java.lang.NullPointerException r11 = new java.lang.NullPointerException
                java.lang.String r12 = "Missing required view with ID: "
                java.lang.String r10 = r12.concat(r10)
                r11.<init>(r10)
                throw r11
        }
    }

    public C4291d() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f17524m1 = r0
            lf.d$b r0 = new lf.d$b
            r0.<init>(r2)
            ch.d r0 = p185k7.C4038x4.m9096i(r0)
            r2.f17526o1 = r0
            lf.c r0 = new lf.c
            lf.d$a r1 = new lf.d$a
            r1.<init>(r2)
            r0.<init>(r1)
            r2.f17527p1 = r0
            return
    }

    /* renamed from: P0 */
    public static final void m9590P0(androidx.fragment.app.AbstractC0375d0 r2, java.lang.String r3, java.util.List<p192kf.C4118o> r4) {
            java.lang.String r0 = "buildingAssetId"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r1 = "list"
            p214m2.C4339q.m9706k(r4, r1)
            p207lf.C4291d.f17523q1 = r4
            lf.d r4 = new lf.d
            r4.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r1.putString(r0, r3)
            r4.m1344x0(r1)
            r3 = 0
            r4.mo1229K0(r2, r3)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: M0 */
    public void mo109M0() {
            r5 = this;
            T extends w1.a r0 = r5.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.m1 r0 = (p171jd.C3537m1) r0
            androidx.appcompat.widget.AppCompatImageView r1 = r0.f15341b
            ud.a r2 = new ud.a
            r2.<init>(r5)
            r1.setOnClickListener(r2)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f15344e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            io.tacocrypto.app.ui.secret.c r3 = io.tacocrypto.app.p156ui.secret.EnumC3251c.f14336c0
            java.lang.String r4 = " Tool"
            p206le.C4271b.m9585a(r3, r2, r4, r1)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1 = r0.f15343d
            r2 = 0
            r1.setEnabled(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15342c
            lf.c r1 = r5.f17527p1
            r0.setAdapter(r1)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: N0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3537m1> mo110N0() {
            r2 = this;
            lf.d$c r0 = p207lf.C4291d.c.f17530g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    @Override // td.AbstractC6218f
    /* renamed from: O0 */
    public boolean mo111O0() {
            r1 = this;
            boolean r0 = r1.f17524m1
            return r0
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: T */
    public void mo1230T(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "context"
            p214m2.C4339q.m9706k(r4, r0)
            super.mo1230T(r4)
            androidx.fragment.app.n r0 = r3.f2297s0
            boolean r1 = r0 instanceof p207lf.InterfaceC4288a
            r2 = 0
            if (r1 == 0) goto L17
            boolean r4 = r0 instanceof p207lf.InterfaceC4288a
            if (r4 == 0) goto L20
            r2 = r0
            lf.a r2 = (p207lf.InterfaceC4288a) r2
            goto L20
        L17:
            boolean r0 = r4 instanceof p207lf.InterfaceC4288a
            if (r0 == 0) goto L20
            if (r0 == 0) goto L20
            r2 = r4
            lf.a r2 = (p207lf.InterfaceC4288a) r2
        L20:
            r3.f17525n1 = r2
            return
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r3) {
            r2 = this;
            super.mo114V(r3)
            java.util.List<kf.o> r3 = p207lf.C4291d.f17523q1
            if (r3 == 0) goto L10
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto Le
            goto L10
        Le:
            r3 = 0
            goto L11
        L10:
            r3 = 1
        L11:
            if (r3 == 0) goto L17
            r2.mo1222D0()
            goto L2d
        L17:
            lf.c r3 = r2.f17527p1
            java.util.List<kf.o> r0 = p207lf.C4291d.f17523q1
            p214m2.C4339q.m9704i(r0)
            java.util.Objects.requireNonNull(r3)
            java.lang.String r1 = "list"
            p214m2.C4339q.m9706k(r0, r1)
            r3.f17521e = r0
            androidx.recyclerview.widget.RecyclerView$f r3 = r3.f3228a
            r3.m1813b()
        L2d:
            return
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: Z */
    public void mo1232Z() {
            r1 = this;
            super.mo1232Z()
            r0 = 0
            r1.f17525n1 = r0
            p207lf.C4291d.f17523q1 = r0
            return
    }
}
