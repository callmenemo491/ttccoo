package p208lg;

/* renamed from: lg.b */
/* loaded from: classes.dex */
public final class C4294b extends td.AbstractC6218f<p171jd.C3514g2> {

    /* renamed from: p1 */
    public static final /* synthetic */ int f17533p1 = 0;

    /* renamed from: m1 */
    public final p019b2.InterfaceC0655a<java.lang.Object> f17534m1;

    /* renamed from: n1 */
    public final boolean f17535n1;

    /* renamed from: o1 */
    public final ch.InterfaceC0977d f17536o1;

    /* renamed from: lg.b$a */
    public static final class a extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {

        /* renamed from: u */
        public final android.view.View f17537u;

        public a(android.view.View r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 2131362729(0x7f0a03a9, float:1.8345247E38)
                android.view.View r2 = r2.findViewById(r0)
                java.lang.String r0 = "itemView.findViewById(R.id.transactionUrlText)"
                p214m2.C4339q.m9705j(r2, r0)
                r1.f17537u = r2
                return
        }
    }

    /* renamed from: lg.b$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p013ah.C0100a, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p208lg.C4294b f17538Z;

        public b(p208lg.C4294b r1) {
                r0 = this;
                r0.f17538Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(p013ah.C0100a r2) {
                r1 = this;
                ah.a r2 = (p013ah.C0100a) r2
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r2, r0)
                lg.b r0 = r1.f17538Z
                p458zg.C7331c.m14402a(r0, r2)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: lg.b$c */
    public static final class c extends androidx.recyclerview.widget.RecyclerView.AbstractC0562r {

        /* renamed from: a */
        public final /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager f17539a;

        /* renamed from: b */
        public final /* synthetic */ p208lg.C4294b f17540b;

        public c(androidx.recyclerview.widget.LinearLayoutManager r1, p208lg.C4294b r2) {
                r0 = this;
                r0.f17539a = r1
                r0.f17540b = r2
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562r
        /* renamed from: b */
        public void mo1906b(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
                r0 = this;
                androidx.recyclerview.widget.LinearLayoutManager r1 = r0.f17539a
                int r1 = r1.m1891z()
                androidx.recyclerview.widget.LinearLayoutManager r2 = r0.f17539a
                int r2 = r2.m1858J()
                androidx.recyclerview.widget.LinearLayoutManager r3 = r0.f17539a
                int r3 = r3.m1674X0()
                int r1 = r1 + r3
                if (r1 < r2) goto L24
                if (r3 < 0) goto L24
                lg.b r1 = r0.f17540b
                int r2 = p208lg.C4294b.f17533p1
                lg.k r1 = r1.m9591P0()
                r2 = 0
                r3 = 1
                p208lg.C4303k.m9593f(r1, r2, r3)
            L24:
                return
        }
    }

    /* renamed from: lg.b$d */
    public static final class d extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p003a2.C0005b, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p208lg.C4294b f17541Z;

        public d(p208lg.C4294b r1) {
                r0 = this;
                r0.f17541Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(p003a2.C0005b r8) {
                r7 = this;
                a2.b r8 = (p003a2.C0005b) r8
                java.lang.String r0 = "$this$setup"
                p214m2.C4339q.m9706k(r8, r0)
                lg.b r0 = r7.f17541Z
                b2.a<java.lang.Object> r0 = r0.f17534m1
                r8.m14b(r0)
                r0 = 2131558628(0x7f0d00e4, float:1.8742577E38)
                lg.b r1 = r7.f17541Z
                java.lang.Class<mg.c> r2 = mg.C4605c.class
                java.lang.String r2 = r2.getName()
                e2.d r3 = new e2.d
                r3.<init>(r8, r2)
                java.lang.String r2 = "$this$withItem"
                p214m2.C4339q.m9706k(r3, r2)
                lg.c r2 = p208lg.C4295c.f17546g0
                lg.d r4 = p208lg.C4296d.f17547Z
                r3.mo12c(r2, r4)
                lg.e r2 = p208lg.C4297e.f17548Z
                lg.f r4 = new lg.f
                r4.<init>(r1)
                e2.d r1 = p067e2.C1509b.m4097b(r3)
                java.util.List<e2.d$a<?, ?, ?>> r1 = r1.f7350e
                e2.d$a r5 = new e2.d$a
                java.lang.Class<lg.b$a> r6 = p208lg.C4294b.a.class
                r5.<init>(r6, r2, r4)
                r1.add(r5)
                r8.m13a(r0, r3)
                ch.l r8 = ch.C0985l.f5061a
                return r8
        }
    }

    /* renamed from: lg.b$e */
    public static final class e extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f17542Z;

        public e(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f17542Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f17542Z
                return r0
        }
    }

    /* renamed from: lg.b$f */
    public static final class f extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f17543Z;

        public f(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f17543Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f17543Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: lg.b$g */
    public /* synthetic */ class g extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3514g2> {

        /* renamed from: g0 */
        public static final p208lg.C4294b.g f17544g0 = null;

        static {
                lg.b$g r0 = new lg.b$g
                r0.<init>()
                p208lg.C4294b.g.f17544g0 = r0
                return
        }

        public g() {
                r6 = this;
                java.lang.Class<jd.g2> r2 = p171jd.C3514g2.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/ToolTransactionsFragmentBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.C3514g2 mo115i(android.view.LayoutInflater r8, android.view.ViewGroup r9, java.lang.Boolean r10) {
                r7 = this;
                android.view.LayoutInflater r8 = (android.view.LayoutInflater) r8
                android.view.ViewGroup r9 = (android.view.ViewGroup) r9
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                java.lang.String r0 = "p0"
                p214m2.C4339q.m9706k(r8, r0)
                r0 = 2131558688(0x7f0d0120, float:1.8742699E38)
                r1 = 0
                android.view.View r8 = r8.inflate(r0, r9, r1)
                if (r10 == 0) goto L1c
                r9.addView(r8)
            L1c:
                r9 = 2131361981(0x7f0a00bd, float:1.834373E38)
                android.view.View r10 = p064e.C1494h.m4055f(r8, r9)
                r2 = r10
                androidx.appcompat.widget.AppCompatImageView r2 = (androidx.appcompat.widget.AppCompatImageView) r2
                if (r2 == 0) goto L62
                r9 = 2131362225(0x7f0a01b1, float:1.8344225E38)
                android.view.View r10 = p064e.C1494h.m4055f(r8, r9)
                r3 = r10
                com.google.android.material.card.MaterialCardView r3 = (com.google.android.material.card.MaterialCardView) r3
                if (r3 == 0) goto L62
                r9 = 2131362298(0x7f0a01fa, float:1.8344373E38)
                android.view.View r10 = p064e.C1494h.m4055f(r8, r9)
                r4 = r10
                androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
                if (r4 == 0) goto L62
                r9 = 2131362646(0x7f0a0356, float:1.8345078E38)
                android.view.View r10 = p064e.C1494h.m4055f(r8, r9)
                r5 = r10
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r5 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r5
                if (r5 == 0) goto L62
                r9 = 2131362710(0x7f0a0396, float:1.8345208E38)
                android.view.View r10 = p064e.C1494h.m4055f(r8, r9)
                r6 = r10
                androidx.appcompat.widget.AppCompatTextView r6 = (androidx.appcompat.widget.AppCompatTextView) r6
                if (r6 == 0) goto L62
                jd.g2 r9 = new jd.g2
                r1 = r8
                androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
                r0 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r9
            L62:
                android.content.res.Resources r8 = r8.getResources()
                java.lang.String r8 = r8.getResourceName(r9)
                java.lang.NullPointerException r9 = new java.lang.NullPointerException
                java.lang.String r10 = "Missing required view with ID: "
                java.lang.String r8 = r10.concat(r8)
                r9.<init>(r8)
                throw r9
        }
    }

    /* renamed from: lg.b$h */
    public static final class h extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ p208lg.C4294b f17545Z;

        public h(p208lg.C4294b r1) {
                r0 = this;
                r0.f17545Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                lg.b r0 = r1.f17545Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    public C4294b() {
            r4 = this;
            r4.<init>()
            b2.a r0 = p064e.C1492f.m4043c()
            r4.f17534m1 = r0
            r0 = 1
            r4.f17535n1 = r0
            lg.b$h r0 = new lg.b$h
            r0.<init>(r4)
            lg.b$e r1 = new lg.b$e
            r1.<init>(r4)
            java.lang.Class<lg.k> r2 = p208lg.C4303k.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            lg.b$f r3 = new lg.b$f
            r3.<init>(r1)
            ch.d r0 = androidx.fragment.app.C0420z0.m1404a(r4, r2, r3, r0)
            r4.f17536o1 = r0
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: L0 */
    public void mo108L0() {
            r4 = this;
            lg.k r0 = r4.m9591P0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f17555e
            androidx.lifecycle.v r1 = r4.m1311O()
            lg.a r2 = new lg.a
            r3 = 0
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            lg.k r0 = r4.m9591P0()
            androidx.lifecycle.d0<java.util.List<mg.c>> r0 = r0.f17556f
            androidx.lifecycle.v r1 = r4.m1311O()
            lg.a r2 = new lg.a
            r3 = 1
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            lg.k r0 = r4.m9591P0()
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r0.f17557g
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            lg.b$b r3 = new lg.b$b
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: M0 */
    public void mo109M0() {
            r6 = this;
            T extends w1.a r0 = r6.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.g2 r0 = (p171jd.C3514g2) r0
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1 = r0.f15191d
            of.e r2 = new of.e
            r2.<init>(r6)
            r1.setOnRefreshListener(r2)
            androidx.appcompat.widget.AppCompatImageView r1 = r0.f15189b
            gg.a r2 = new gg.a
            r2.<init>(r6)
            r1.setOnClickListener(r2)
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f15192e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            io.tacocrypto.app.ui.secret.c r2 = io.tacocrypto.app.p156ui.secret.EnumC3251c.f14334a0
            java.lang.String r3 = " Tool"
            p206le.C4271b.m9585a(r2, r1, r3, r0)
            T extends w1.a r0 = r6.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.g2 r0 = (p171jd.C3514g2) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15190c
            vg.t r1 = new vg.t
            android.content.Context r2 = r6.m1334s0()
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r3 = "requireContext().applicationContext"
            p214m2.C4339q.m9705j(r2, r3)
            r3 = 2131231394(0x7f0802a2, float:1.8078868E38)
            r4 = 4
            r5 = 0
            r1.<init>(r2, r3, r5, r4)
            r0.m1754g(r1)
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r6.m1330q0()
            r1 = 1
            r0.<init>(r1, r5)
            T extends w1.a r1 = r6.f24168k1
            p214m2.C4339q.m9704i(r1)
            jd.g2 r1 = (p171jd.C3514g2) r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.f15190c
            r1.setLayoutManager(r0)
            T extends w1.a r1 = r6.f24168k1
            p214m2.C4339q.m9704i(r1)
            jd.g2 r1 = (p171jd.C3514g2) r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.f15190c
            lg.b$c r2 = new lg.b$c
            r2.<init>(r0, r6)
            r1.m1756h(r2)
            T extends w1.a r0 = r6.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.g2 r0 = (p171jd.C3514g2) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15190c
            java.lang.String r1 = "binding.list"
            p214m2.C4339q.m9705j(r0, r1)
            lg.b$d r1 = new lg.b$d
            r1.<init>(r6)
            p064e.C1487a.m4032j(r0, r1)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: N0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3514g2> mo110N0() {
            r2 = this;
            lg.b$g r0 = p208lg.C4294b.g.f17544g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    @Override // td.AbstractC6218f
    /* renamed from: O0 */
    public boolean mo111O0() {
            r1 = this;
            boolean r0 = r1.f17535n1
            return r0
    }

    /* renamed from: P0 */
    public final p208lg.C4303k m9591P0() {
            r1 = this;
            ch.d r0 = r1.f17536o1
            java.lang.Object r0 = r0.getValue()
            lg.k r0 = (p208lg.C4303k) r0
            return r0
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r2) {
            r1 = this;
            super.mo114V(r2)
            lg.k r2 = r1.m9591P0()
            r0 = 0
            r2.m9594e(r0)
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: e0 */
    public void mo1322e0() {
            r3 = this;
            r0 = 1
            r3.f2258A0 = r0
            lg.k r1 = r3.m9591P0()
            r2 = 0
            p208lg.C4303k.m9593f(r1, r2, r0)
            return
    }
}
