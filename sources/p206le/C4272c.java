package p206le;

/* renamed from: le.c */
/* loaded from: classes.dex */
public final class C4272c extends td.AbstractC6218f<p171jd.C3562u0> {

    /* renamed from: p1 */
    public static final /* synthetic */ int f17471p1 = 0;

    /* renamed from: m1 */
    public final p019b2.InterfaceC0655a<java.lang.Object> f17472m1;

    /* renamed from: n1 */
    public final boolean f17473n1;

    /* renamed from: o1 */
    public final ch.InterfaceC0977d f17474o1;

    /* renamed from: le.c$a */
    public static final class a extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {

        /* renamed from: u */
        public final android.view.View f17475u;

        /* renamed from: v */
        public final android.view.View f17476v;

        public a(android.view.View r3) {
                r2 = this;
                r2.<init>(r3)
                r0 = 2131361877(0x7f0a0055, float:1.8343519E38)
                android.view.View r0 = r3.findViewById(r0)
                java.lang.String r1 = "itemView.findViewById(R.id.addView)"
                p214m2.C4339q.m9705j(r0, r1)
                r2.f17475u = r0
                r0 = 2131362528(0x7f0a02e0, float:1.834484E38)
                android.view.View r3 = r3.findViewById(r0)
                java.lang.String r0 = "itemView.findViewById(R.id.removeView)"
                p214m2.C4339q.m9705j(r3, r0)
                r2.f17476v = r3
                return
        }
    }

    /* renamed from: le.c$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p013ah.C0100a, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p206le.C4272c f17477Z;

        public b(p206le.C4272c r1) {
                r0 = this;
                r0.f17477Z = r1
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
                le.c r0 = r1.f17477Z
                p458zg.C7331c.m14402a(r0, r2)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: le.c$c */
    public static final class c extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p003a2.C0005b, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p206le.C4272c f17478Z;

        public c(p206le.C4272c r1) {
                r0 = this;
                r0.f17478Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(p003a2.C0005b r9) {
                r8 = this;
                a2.b r9 = (p003a2.C0005b) r9
                java.lang.String r0 = "$this$setup"
                p214m2.C4339q.m9706k(r9, r0)
                le.c r0 = r8.f17478Z
                b2.a<java.lang.Object> r0 = r0.f17472m1
                r9.m14b(r0)
                r0 = 2131558590(0x7f0d00be, float:1.87425E38)
                le.c r1 = r8.f17478Z
                java.lang.Class<me.c> r2 = me.C4595c.class
                java.lang.String r2 = r2.getName()
                e2.d r3 = new e2.d
                r3.<init>(r9, r2)
                java.lang.Class<le.c$a> r2 = p206le.C4272c.a.class
                java.lang.String r4 = "$this$withItem"
                p214m2.C4339q.m9706k(r3, r4)
                le.d r4 = p206le.C4273d.f17483g0
                le.e r5 = p206le.C4274e.f17484Z
                r3.mo12c(r4, r5)
                le.f r4 = p206le.C4275f.f17485Z
                le.g r5 = new le.g
                r5.<init>(r1)
                e2.d r6 = p067e2.C1509b.m4097b(r3)
                java.util.List<e2.d$a<?, ?, ?>> r6 = r6.f7350e
                e2.d$a r7 = new e2.d$a
                r7.<init>(r2, r4, r5)
                r6.add(r7)
                le.h r4 = p206le.C4277h.f17487Z
                le.i r5 = new le.i
                r5.<init>(r1)
                e2.d r1 = p067e2.C1509b.m4097b(r3)
                java.util.List<e2.d$a<?, ?, ?>> r1 = r1.f7350e
                e2.d$a r6 = new e2.d$a
                r6.<init>(r2, r4, r5)
                r1.add(r6)
                r9.m13a(r0, r3)
                ch.l r9 = ch.C0985l.f5061a
                return r9
        }
    }

    /* renamed from: le.c$d */
    public static final class d extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f17479Z;

        public d(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f17479Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f17479Z
                return r0
        }
    }

    /* renamed from: le.c$e */
    public static final class e extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f17480Z;

        public e(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f17480Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f17480Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: le.c$f */
    public /* synthetic */ class f extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3562u0> {

        /* renamed from: g0 */
        public static final p206le.C4272c.f f17481g0 = null;

        static {
                le.c$f r0 = new le.c$f
                r0.<init>()
                p206le.C4272c.f.f17481g0 = r0
                return
        }

        public f() {
                r6 = this;
                java.lang.Class<jd.u0> r2 = p171jd.C3562u0.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/ToolAlcorFragmentBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.C3562u0 mo115i(android.view.LayoutInflater r9, android.view.ViewGroup r10, java.lang.Boolean r11) {
                r8 = this;
                android.view.LayoutInflater r9 = (android.view.LayoutInflater) r9
                android.view.ViewGroup r10 = (android.view.ViewGroup) r10
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                java.lang.String r0 = "p0"
                p214m2.C4339q.m9706k(r9, r0)
                r0 = 2131558655(0x7f0d00ff, float:1.8742632E38)
                r1 = 0
                android.view.View r9 = r9.inflate(r0, r10, r1)
                if (r11 == 0) goto L1c
                r10.addView(r9)
            L1c:
                r10 = 2131361981(0x7f0a00bd, float:1.834373E38)
                android.view.View r11 = p064e.C1494h.m4055f(r9, r10)
                r2 = r11
                androidx.appcompat.widget.AppCompatImageView r2 = (androidx.appcompat.widget.AppCompatImageView) r2
                if (r2 == 0) goto L6e
                r10 = 2131362127(0x7f0a014f, float:1.8344026E38)
                android.view.View r11 = p064e.C1494h.m4055f(r9, r10)
                r3 = r11
                androidx.appcompat.widget.AppCompatTextView r3 = (androidx.appcompat.widget.AppCompatTextView) r3
                if (r3 == 0) goto L6e
                r10 = 2131362225(0x7f0a01b1, float:1.8344225E38)
                android.view.View r11 = p064e.C1494h.m4055f(r9, r10)
                r4 = r11
                com.google.android.material.card.MaterialCardView r4 = (com.google.android.material.card.MaterialCardView) r4
                if (r4 == 0) goto L6e
                r10 = 2131362298(0x7f0a01fa, float:1.8344373E38)
                android.view.View r11 = p064e.C1494h.m4055f(r9, r10)
                r5 = r11
                androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
                if (r5 == 0) goto L6e
                r10 = 2131362646(0x7f0a0356, float:1.8345078E38)
                android.view.View r11 = p064e.C1494h.m4055f(r9, r10)
                r6 = r11
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r6 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r6
                if (r6 == 0) goto L6e
                r10 = 2131362710(0x7f0a0396, float:1.8345208E38)
                android.view.View r11 = p064e.C1494h.m4055f(r9, r10)
                r7 = r11
                androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
                if (r7 == 0) goto L6e
                jd.u0 r10 = new jd.u0
                r1 = r9
                androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
                r0 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r10
            L6e:
                android.content.res.Resources r9 = r9.getResources()
                java.lang.String r9 = r9.getResourceName(r10)
                java.lang.NullPointerException r10 = new java.lang.NullPointerException
                java.lang.String r11 = "Missing required view with ID: "
                java.lang.String r9 = r11.concat(r9)
                r10.<init>(r9)
                throw r10
        }
    }

    /* renamed from: le.c$g */
    public static final class g extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ p206le.C4272c f17482Z;

        public g(p206le.C4272c r1) {
                r0 = this;
                r0.f17482Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                le.c r0 = r1.f17482Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    public C4272c() {
            r4 = this;
            r4.<init>()
            b2.a r0 = p064e.C1492f.m4043c()
            r4.f17472m1 = r0
            r0 = 1
            r4.f17473n1 = r0
            le.c$g r0 = new le.c$g
            r0.<init>(r4)
            le.c$d r1 = new le.c$d
            r1.<init>(r4)
            java.lang.Class<le.r> r2 = p206le.C4287r.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            le.c$e r3 = new le.c$e
            r3.<init>(r1)
            ch.d r0 = androidx.fragment.app.C0420z0.m1404a(r4, r2, r3, r0)
            r4.f17474o1 = r0
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: L0 */
    public void mo108L0() {
            r4 = this;
            le.r r0 = r4.m9586P0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f17496f
            androidx.lifecycle.v r1 = r4.m1311O()
            le.a r2 = new le.a
            r3 = 0
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            le.r r0 = r4.m9586P0()
            androidx.lifecycle.d0<java.util.List<me.c>> r0 = r0.f17497g
            androidx.lifecycle.v r1 = r4.m1311O()
            le.a r2 = new le.a
            r3 = 1
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            le.r r0 = r4.m9586P0()
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r0.f17498h
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            le.c$b r3 = new le.c$b
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
            jd.u0 r0 = (p171jd.C3562u0) r0
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1 = r0.f15559e
            u3.b r2 = new u3.b
            r2.<init>(r6)
            r1.setOnRefreshListener(r2)
            androidx.appcompat.widget.AppCompatImageView r1 = r0.f15556b
            ud.a r2 = new ud.a
            r2.<init>(r6)
            r1.setOnClickListener(r2)
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f15560f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            io.tacocrypto.app.ui.secret.c r2 = io.tacocrypto.app.p156ui.secret.EnumC3251c.f14345l0
            java.lang.String r3 = " Tool"
            p206le.C4271b.m9585a(r2, r1, r3, r0)
            T extends w1.a r0 = r6.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.u0 r0 = (p171jd.C3562u0) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15558d
            vg.t r1 = new vg.t
            android.content.Context r2 = r6.m1334s0()
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r3 = "requireContext().applicationContext"
            p214m2.C4339q.m9705j(r2, r3)
            r3 = 2131231394(0x7f0802a2, float:1.8078868E38)
            r4 = 0
            r5 = 4
            r1.<init>(r2, r3, r4, r5)
            r0.m1754g(r1)
            T extends w1.a r0 = r6.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.u0 r0 = (p171jd.C3562u0) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15558d
            java.lang.String r1 = "binding.list"
            p214m2.C4339q.m9705j(r0, r1)
            le.c$c r1 = new le.c$c
            r1.<init>(r6)
            p064e.C1487a.m4032j(r0, r1)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: N0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3562u0> mo110N0() {
            r2 = this;
            le.c$f r0 = p206le.C4272c.f.f17481g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    @Override // td.AbstractC6218f
    /* renamed from: O0 */
    public boolean mo111O0() {
            r1 = this;
            boolean r0 = r1.f17473n1
            return r0
    }

    /* renamed from: P0 */
    public final p206le.C4287r m9586P0() {
            r1 = this;
            ch.d r0 = r1.f17474o1
            java.lang.Object r0 = r0.getValue()
            le.r r0 = (p206le.C4287r) r0
            return r0
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r1) {
            r0 = this;
            super.mo114V(r1)
            le.r r1 = r0.m9586P0()
            r1.m9589f()
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: e0 */
    public void mo1322e0() {
            r1 = this;
            r0 = 1
            r1.f2258A0 = r0
            le.r r0 = r1.m9586P0()
            r0.m9589f()
            return
    }
}
