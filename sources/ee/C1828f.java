package ee;

/* renamed from: ee.f */
/* loaded from: classes.dex */
public final class C1828f extends td.AbstractC6218f<p171jd.C3540n0> {

    /* renamed from: r1 */
    public static final /* synthetic */ int f7959r1 = 0;

    /* renamed from: m1 */
    public final boolean f7960m1;

    /* renamed from: n1 */
    public final ch.InterfaceC0977d f7961n1;

    /* renamed from: o1 */
    public final ch.InterfaceC0977d f7962o1;

    /* renamed from: p1 */
    public final ee.C1827e f7963p1;

    /* renamed from: q1 */
    public ee.InterfaceC1823a f7964q1;

    /* renamed from: ee.f$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<androidx.recyclerview.widget.RecyclerView.AbstractC0546b0, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ ee.C1828f f7965Z;

        public a(ee.C1828f r1) {
                r0 = this;
                r0.f7965Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r4) {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView$b0 r4 = (androidx.recyclerview.widget.RecyclerView.AbstractC0546b0) r4
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r4, r0)
                ee.f r0 = r3.f7965Z
                ch.d r0 = r0.f7962o1
                java.lang.Object r0 = r0.getValue()
                androidx.recyclerview.widget.t r0 = (androidx.recyclerview.widget.C0609t) r0
                androidx.recyclerview.widget.t$d r1 = r0.f3580m
                androidx.recyclerview.widget.RecyclerView r2 = r0.f3585r
                int r1 = r1.m2132d(r2, r4)
                r2 = 16711680(0xff0000, float:2.3418052E-38)
                r1 = r1 & r2
                if (r1 == 0) goto L20
                r1 = 1
                goto L21
            L20:
                r1 = 0
            L21:
                if (r1 != 0) goto L26
                java.lang.String r4 = "Start drag has been called but dragging is not enabled"
                goto L32
            L26:
                android.view.View r1 = r4.f3208a
                android.view.ViewParent r1 = r1.getParent()
                androidx.recyclerview.widget.RecyclerView r2 = r0.f3585r
                if (r1 == r2) goto L38
                java.lang.String r4 = "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper."
            L32:
                java.lang.String r0 = "ItemTouchHelper"
                android.util.Log.e(r0, r4)
                goto L4e
            L38:
                android.view.VelocityTracker r1 = r0.f3587t
                if (r1 == 0) goto L3f
                r1.recycle()
            L3f:
                android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
                r0.f3587t = r1
                r1 = 0
                r0.f3576i = r1
                r0.f3575h = r1
                r1 = 2
                r0.m2127r(r4, r1)
            L4e:
                ch.l r4 = ch.C0985l.f5061a
                return r4
        }
    }

    /* renamed from: ee.f$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.util.Set<? extends io.tacocrypto.app.p156ui.secret.EnumC3251c>, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ ee.C1828f f7966Z;

        public b(ee.C1828f r1) {
                r0 = this;
                r0.f7966Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(java.util.Set<? extends io.tacocrypto.app.p156ui.secret.EnumC3251c> r3) {
                r2 = this;
                java.util.Set r3 = (java.util.Set) r3
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r3, r0)
                ee.f r0 = r2.f7966Z
                ee.e r0 = r0.f7963p1
                java.util.Objects.requireNonNull(r0)
                java.lang.String r1 = "set"
                p214m2.C4339q.m9706k(r3, r1)
                java.util.Set r3 = p062dh.C1473i.m4010V(r3)
                r0.f7956e = r3
                androidx.recyclerview.widget.RecyclerView$f r3 = r0.f3228a
                r3.m1813b()
                ch.l r3 = ch.C0985l.f5061a
                return r3
        }
    }

    /* renamed from: ee.f$c */
    public static final class c extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p013ah.C0100a, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ ee.C1828f f7967Z;

        public c(ee.C1828f r1) {
                r0 = this;
                r0.f7967Z = r1
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
                ee.f r0 = r1.f7967Z
                p458zg.C7331c.m14402a(r0, r2)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: ee.f$d */
    public static final class d extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.recyclerview.widget.C0609t> {

        /* renamed from: Z */
        public static final ee.C1828f.d f7968Z = null;

        static {
                ee.f$d r0 = new ee.f$d
                r0.<init>()
                ee.C1828f.d.f7968Z = r0
                return
        }

        public d() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.recyclerview.widget.C0609t mo15e() {
                r2 = this;
                ee.b r0 = new ee.b
                r1 = 3
                r0.<init>(r1)
                androidx.recyclerview.widget.t r1 = new androidx.recyclerview.widget.t
                r1.<init>(r0)
                return r1
        }
    }

    /* renamed from: ee.f$e */
    public static final class e extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f7969Z;

        public e(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f7969Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f7969Z
                return r0
        }
    }

    /* renamed from: ee.f$f */
    public static final class f extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f7970Z;

        public f(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f7970Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f7970Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: ee.f$g */
    public /* synthetic */ class g extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3540n0> {

        /* renamed from: g0 */
        public static final ee.C1828f.g f7971g0 = null;

        static {
                ee.f$g r0 = new ee.f$g
                r0.<init>()
                ee.C1828f.g.f7971g0 = r0
                return
        }

        public g() {
                r6 = this;
                java.lang.Class<jd.n0> r2 = p171jd.C3540n0.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/SecretSortFragmentBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.C3540n0 mo115i(android.view.LayoutInflater r7, android.view.ViewGroup r8, java.lang.Boolean r9) {
                r6 = this;
                android.view.LayoutInflater r7 = (android.view.LayoutInflater) r7
                android.view.ViewGroup r8 = (android.view.ViewGroup) r8
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                java.lang.String r0 = "p0"
                p214m2.C4339q.m9706k(r7, r0)
                r0 = 2131558630(0x7f0d00e6, float:1.8742581E38)
                r1 = 0
                android.view.View r7 = r7.inflate(r0, r8, r1)
                if (r9 == 0) goto L1c
                r8.addView(r7)
            L1c:
                r8 = 2131361981(0x7f0a00bd, float:1.834373E38)
                android.view.View r9 = p064e.C1494h.m4055f(r7, r8)
                r2 = r9
                androidx.appcompat.widget.AppCompatImageView r2 = (androidx.appcompat.widget.AppCompatImageView) r2
                if (r2 == 0) goto L56
                r8 = 2131362225(0x7f0a01b1, float:1.8344225E38)
                android.view.View r9 = p064e.C1494h.m4055f(r7, r8)
                r3 = r9
                com.google.android.material.card.MaterialCardView r3 = (com.google.android.material.card.MaterialCardView) r3
                if (r3 == 0) goto L56
                r8 = 2131362298(0x7f0a01fa, float:1.8344373E38)
                android.view.View r9 = p064e.C1494h.m4055f(r7, r8)
                r4 = r9
                androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
                if (r4 == 0) goto L56
                r8 = 2131362710(0x7f0a0396, float:1.8345208E38)
                android.view.View r9 = p064e.C1494h.m4055f(r7, r8)
                r5 = r9
                androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
                if (r5 == 0) goto L56
                jd.n0 r8 = new jd.n0
                r1 = r7
                androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return r8
            L56:
                android.content.res.Resources r7 = r7.getResources()
                java.lang.String r7 = r7.getResourceName(r8)
                java.lang.NullPointerException r8 = new java.lang.NullPointerException
                java.lang.String r9 = "Missing required view with ID: "
                java.lang.String r7 = r9.concat(r7)
                r8.<init>(r7)
                throw r8
        }
    }

    /* renamed from: ee.f$h */
    public static final class h extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ ee.C1828f f7972Z;

        public h(ee.C1828f r1) {
                r0 = this;
                r0.f7972Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                ee.f r0 = r1.f7972Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    public C1828f() {
            r4 = this;
            r4.<init>()
            r0 = 1
            r4.f7960m1 = r0
            ee.f$h r0 = new ee.f$h
            r0.<init>(r4)
            ee.f$e r1 = new ee.f$e
            r1.<init>(r4)
            java.lang.Class<ee.g> r2 = ee.C1829g.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            ee.f$f r3 = new ee.f$f
            r3.<init>(r1)
            ch.d r0 = androidx.fragment.app.C0420z0.m1404a(r4, r2, r3, r0)
            r4.f7961n1 = r0
            ee.f$d r0 = ee.C1828f.d.f7968Z
            ch.d r0 = p185k7.C4038x4.m9096i(r0)
            r4.f7962o1 = r0
            ee.e r0 = new ee.e
            ee.f$a r1 = new ee.f$a
            r1.<init>(r4)
            r0.<init>(r1)
            r4.f7963p1 = r0
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: L0 */
    public void mo108L0() {
            r4 = this;
            ee.g r0 = r4.m4589P0()
            androidx.lifecycle.d0<vg.b<java.util.Set<io.tacocrypto.app.ui.secret.c>>> r0 = r0.f7976f
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            ee.f$b r3 = new ee.f$b
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            ee.g r0 = r4.m4589P0()
            androidx.lifecycle.d0<java.util.List<io.tacocrypto.app.ui.secret.c>> r0 = r0.f7975e
            androidx.lifecycle.v r1 = r4.m1311O()
            nd.x r2 = new nd.x
            r2.<init>(r4)
            r0.m1413f(r1, r2)
            ee.g r0 = r4.m4589P0()
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r0.f7977g
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            ee.f$c r3 = new ee.f$c
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: M0 */
    public void mo109M0() {
            r8 = this;
            T extends w1.a r0 = r8.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.n0 r0 = (p171jd.C3540n0) r0
            androidx.appcompat.widget.AppCompatImageView r0 = r0.f15367b
            ud.a r1 = new ud.a
            r1.<init>(r8)
            r0.setOnClickListener(r1)
            T extends w1.a r0 = r8.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.n0 r0 = (p171jd.C3540n0) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15368c
            ee.e r1 = r8.f7963p1
            r0.setAdapter(r1)
            ch.d r0 = r8.f7962o1
            java.lang.Object r0 = r0.getValue()
            androidx.recyclerview.widget.t r0 = (androidx.recyclerview.widget.C0609t) r0
            T extends w1.a r1 = r8.f24168k1
            p214m2.C4339q.m9704i(r1)
            jd.n0 r1 = (p171jd.C3540n0) r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.f15368c
            androidx.recyclerview.widget.RecyclerView r2 = r0.f3585r
            r3 = 0
            if (r2 != r1) goto L37
            goto Lf5
        L37:
            if (r2 == 0) goto L95
            r2.m1749b0(r0)
            androidx.recyclerview.widget.RecyclerView r2 = r0.f3585r
            androidx.recyclerview.widget.RecyclerView$q r4 = r0.f3593z
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$q> r5 = r2.f3180q0
            r5.remove(r4)
            androidx.recyclerview.widget.RecyclerView$q r5 = r2.f3182r0
            r6 = 0
            if (r5 != r4) goto L4c
            r2.f3182r0 = r6
        L4c:
            androidx.recyclerview.widget.RecyclerView r2 = r0.f3585r
            java.util.List<androidx.recyclerview.widget.RecyclerView$o> r2 = r2.f3124C0
            if (r2 != 0) goto L53
            goto L56
        L53:
            r2.remove(r0)
        L56:
            java.util.List<androidx.recyclerview.widget.t$f> r2 = r0.f3583p
            int r2 = r2.size()
        L5c:
            int r2 = r2 + (-1)
            if (r2 < 0) goto L77
            java.util.List<androidx.recyclerview.widget.t$f> r4 = r0.f3583p
            java.lang.Object r4 = r4.get(r3)
            androidx.recyclerview.widget.t$f r4 = (androidx.recyclerview.widget.C0609t.f) r4
            android.animation.ValueAnimator r5 = r4.f3610g
            r5.cancel()
            androidx.recyclerview.widget.t$d r5 = r0.f3580m
            androidx.recyclerview.widget.RecyclerView r7 = r0.f3585r
            androidx.recyclerview.widget.RecyclerView$b0 r4 = r4.f3608e
            r5.mo2130a(r7, r4)
            goto L5c
        L77:
            java.util.List<androidx.recyclerview.widget.t$f> r2 = r0.f3583p
            r2.clear()
            r0.f3590w = r6
            android.view.VelocityTracker r2 = r0.f3587t
            if (r2 == 0) goto L87
            r2.recycle()
            r0.f3587t = r6
        L87:
            androidx.recyclerview.widget.t$e r2 = r0.f3592y
            if (r2 == 0) goto L8f
            r2.f3602Y = r3
            r0.f3592y = r6
        L8f:
            n0.e r2 = r0.f3591x
            if (r2 == 0) goto L95
            r0.f3591x = r6
        L95:
            r0.f3585r = r1
            if (r1 == 0) goto Lf5
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165415(0x7f0700e7, float:1.7945046E38)
            float r2 = r1.getDimension(r2)
            r0.f3573f = r2
            r2 = 2131165414(0x7f0700e6, float:1.7945044E38)
            float r1 = r1.getDimension(r2)
            r0.f3574g = r1
            androidx.recyclerview.widget.RecyclerView r1 = r0.f3585r
            android.content.Context r1 = r1.getContext()
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            int r1 = r1.getScaledTouchSlop()
            r0.f3584q = r1
            androidx.recyclerview.widget.RecyclerView r1 = r0.f3585r
            r1.m1754g(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r0.f3585r
            androidx.recyclerview.widget.RecyclerView$q r2 = r0.f3593z
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$q> r1 = r1.f3180q0
            r1.add(r2)
            androidx.recyclerview.widget.RecyclerView r1 = r0.f3585r
            java.util.List<androidx.recyclerview.widget.RecyclerView$o> r2 = r1.f3124C0
            if (r2 != 0) goto Lda
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f3124C0 = r2
        Lda:
            java.util.List<androidx.recyclerview.widget.RecyclerView$o> r1 = r1.f3124C0
            r1.add(r0)
            androidx.recyclerview.widget.t$e r1 = new androidx.recyclerview.widget.t$e
            r1.<init>(r0)
            r0.f3592y = r1
            n0.e r1 = new n0.e
            androidx.recyclerview.widget.RecyclerView r2 = r0.f3585r
            android.content.Context r2 = r2.getContext()
            androidx.recyclerview.widget.t$e r4 = r0.f3592y
            r1.<init>(r2, r4)
            r0.f3591x = r1
        Lf5:
            T extends w1.a r0 = r8.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.n0 r0 = (p171jd.C3540n0) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15368c
            vg.t r1 = new vg.t
            android.content.Context r2 = r8.m1334s0()
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r4 = "requireContext().applicationContext"
            p214m2.C4339q.m9705j(r2, r4)
            r4 = 2131231394(0x7f0802a2, float:1.8078868E38)
            r5 = 4
            r1.<init>(r2, r4, r3, r5)
            r0.m1754g(r1)
            T extends w1.a r0 = r8.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.n0 r0 = (p171jd.C3540n0) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15368c
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r8.m1330q0()
            r2 = 1
            r1.<init>(r2, r3)
            r0.setLayoutManager(r1)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: N0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3540n0> mo110N0() {
            r2 = this;
            ee.f$g r0 = ee.C1828f.g.f7971g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    @Override // td.AbstractC6218f
    /* renamed from: O0 */
    public boolean mo111O0() {
            r1 = this;
            boolean r0 = r1.f7960m1
            return r0
    }

    /* renamed from: P0 */
    public final ee.C1829g m4589P0() {
            r1 = this;
            ch.d r0 = r1.f7961n1
            java.lang.Object r0 = r0.getValue()
            ee.g r0 = (ee.C1829g) r0
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
            boolean r1 = r0 instanceof ee.InterfaceC1823a
            r2 = 0
            if (r1 == 0) goto L17
            boolean r4 = r0 instanceof ee.InterfaceC1823a
            if (r4 == 0) goto L1e
            r2 = r0
            ee.a r2 = (ee.InterfaceC1823a) r2
            goto L1e
        L17:
            boolean r0 = r4 instanceof ee.InterfaceC1823a
            if (r0 == 0) goto L1e
            r2 = r4
            ee.a r2 = (ee.InterfaceC1823a) r2
        L1e:
            r3.f7964q1 = r2
            return
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r7) {
            r6 = this;
            super.mo114V(r7)
            ee.g r7 = r6.m4589P0()
            androidx.lifecycle.d0<vg.b<java.util.Set<io.tacocrypto.app.ui.secret.c>>> r0 = r7.f7976f
            vg.b r1 = new vg.b
            nd.j1 r2 = r7.f7973c
            java.util.Set r2 = r2.m10824e()
            r1.<init>(r2)
            r0.mo7l(r1)
            androidx.lifecycle.d0<java.util.List<io.tacocrypto.app.ui.secret.c>> r0 = r7.f7975e
            io.tacocrypto.app.ui.secret.c$a r1 = io.tacocrypto.app.p156ui.secret.EnumC3251c.f14332Y
            io.tacocrypto.app.ui.secret.c[] r2 = io.tacocrypto.app.p156ui.secret.EnumC3251c.values()
            java.util.List r2 = p062dh.C1468d.m3991M(r2)
            o9.d r3 = p251o9.C5180d.m11494c()
            java.lang.Class<gb.l> r4 = gb.C2322l.class
            r3.m11497a()
            y9.i r3 = r3.f20315d
            java.lang.Object r3 = r3.mo14246a(r4)
            gb.l r3 = (gb.C2322l) r3
            gb.c r3 = r3.m6081c()
            java.lang.String r4 = "FirebaseRemoteConfig.getInstance()"
            p214m2.C4339q.m9703h(r3, r4)
            java.lang.String r4 = "tools"
            ha.b r3 = p074e9.C1805a.m4525j(r3, r4)
            java.lang.String r3 = r3.m7366a()
            java.lang.String r4 = "remoteConfig[TOOLS_KEY].asString()"
            p214m2.C4339q.m9705j(r3, r4)
            vg.r r4 = new vg.r
            r4.<init>()
            java.lang.reflect.Type r4 = r4.f21382b
            java.lang.Object r3 = p238nd.C4776t.m10832a(r3, r4)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L5d
            dh.k r3 = p062dh.C1475k.f7237Y
        L5d:
            nd.k1 r4 = r7.f7974d
            java.util.Set<? extends io.tacocrypto.app.ui.secret.c> r4 = r4.f19062e
            java.util.List r1 = r1.m7736a(r2, r3, r4)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L70:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L8c
            java.lang.Object r3 = r1.next()
            r4 = r3
            ch.h r4 = (ch.C0981h) r4
            B r4 = r4.f5058Z
            io.tacocrypto.app.ui.secret.b r5 = io.tacocrypto.app.p156ui.secret.EnumC3250b.f14330a0
            if (r4 == r5) goto L85
            r4 = 1
            goto L86
        L85:
            r4 = 0
        L86:
            if (r4 == 0) goto L70
            r2.add(r3)
            goto L70
        L8c:
            nd.j1 r7 = r7.f7973c
            java.util.List r7 = r7.m10825f()
            java.lang.String r1 = "<this>"
            p214m2.C4339q.m9706k(r2, r1)
            java.lang.String r1 = "toolsSorted"
            p214m2.C4339q.m9706k(r7, r1)
            de.m r1 = new de.m
            r1.<init>(r7)
            java.util.List r7 = p062dh.C1473i.m4004P(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = p062dh.C1469e.m3992D(r7, r2)
            r1.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
        Lb4:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto Lc8
            java.lang.Object r2 = r7.next()
            ch.h r2 = (ch.C0981h) r2
            A r2 = r2.f5057Y
            io.tacocrypto.app.ui.secret.c r2 = (io.tacocrypto.app.p156ui.secret.EnumC3251c) r2
            r1.add(r2)
            goto Lb4
        Lc8:
            r0.mo7l(r1)
            return
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: Z */
    public void mo1232Z() {
            r1 = this;
            super.mo1232Z()
            r0 = 0
            r1.f7964q1 = r0
            return
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface r12) {
            r11 = this;
            java.lang.String r0 = "dialog"
            p214m2.C4339q.m9706k(r12, r0)
            ee.g r0 = r11.m4589P0()
            ee.e r1 = r11.f7963p1
            java.util.Set<io.tacocrypto.app.ui.secret.c> r2 = r1.f7956e
            java.util.List<io.tacocrypto.app.ui.secret.c> r3 = r1.f7957f
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "toolsFavorites"
            p214m2.C4339q.m9706k(r2, r1)
            java.lang.String r1 = "toolsSorted"
            p214m2.C4339q.m9706k(r3, r1)
            nd.j1 r4 = r0.f7973c
            r4.m10826g(r2)
            nd.j1 r0 = r0.f7973c
            java.util.Objects.requireNonNull(r0)
            android.content.SharedPreferences r0 = r0.m10820a()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            nd.i1 r9 = p238nd.C4750i1.f19054Z
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 30
            java.lang.String r4 = ","
            java.lang.String r2 = p062dh.C1473i.m4000L(r3, r4, r5, r6, r7, r8, r9, r10)
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)
            r0.apply()
            ee.a r0 = r11.f7964q1
            if (r0 == 0) goto L50
            ee.e r1 = r11.f7963p1
            java.util.Set<io.tacocrypto.app.ui.secret.c> r2 = r1.f7956e
            java.util.List<io.tacocrypto.app.ui.secret.c> r1 = r1.f7957f
            r0.mo4588a(r2, r1)
        L50:
            super.onDismiss(r12)
            return
    }
}
