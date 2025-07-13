package p223mf;

/* renamed from: mf.c */
/* loaded from: classes.dex */
public final class C4598c extends td.AbstractC6218f<p171jd.C3541n1> {

    /* renamed from: p1 */
    public static final /* synthetic */ int f18442p1 = 0;

    /* renamed from: m1 */
    public final boolean f18443m1;

    /* renamed from: n1 */
    public final ch.InterfaceC0977d f18444n1;

    /* renamed from: o1 */
    public final p019b2.InterfaceC0655a<java.lang.Object> f18445o1;

    /* renamed from: mf.c$a */
    public final class a extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {

        /* renamed from: u */
        public final p171jd.C3500d0 f18446u;

        public a(p223mf.C4598c r4, android.view.View r5) {
                r3 = this;
                r3.<init>(r5)
                r4 = 2131362262(0x7f0a01d6, float:1.83443E38)
                android.view.View r0 = p064e.C1494h.m4055f(r5, r4)
                com.google.android.material.imageview.ShapeableImageView r0 = (com.google.android.material.imageview.ShapeableImageView) r0
                if (r0 == 0) goto L2e
                r4 = 2131362637(0x7f0a034d, float:1.834506E38)
                android.view.View r1 = p064e.C1494h.m4055f(r5, r4)
                androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
                if (r1 == 0) goto L2e
                r4 = 2131362710(0x7f0a0396, float:1.8345208E38)
                android.view.View r2 = p064e.C1494h.m4055f(r5, r4)
                androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
                if (r2 == 0) goto L2e
                jd.d0 r4 = new jd.d0
                com.google.android.material.card.MaterialCardView r5 = (com.google.android.material.card.MaterialCardView) r5
                r4.<init>(r5, r0, r1, r2)
                r3.f18446u = r4
                return
            L2e:
                android.content.res.Resources r5 = r5.getResources()
                java.lang.String r4 = r5.getResourceName(r4)
                java.lang.NullPointerException r5 = new java.lang.NullPointerException
                java.lang.String r0 = "Missing required view with ID: "
                java.lang.String r4 = r0.concat(r4)
                r5.<init>(r4)
                throw r5
        }
    }

    /* renamed from: mf.c$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p013ah.C0100a, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p223mf.C4598c f18447Z;

        public b(p223mf.C4598c r1) {
                r0 = this;
                r0.f18447Z = r1
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
                mf.c r0 = r1.f18447Z
                p458zg.C7331c.m14402a(r0, r2)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: mf.c$c */
    public static final class c extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.lang.String, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p223mf.C4598c f18448Z;

        public c(p223mf.C4598c r1) {
                r0 = this;
                r0.f18448Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(java.lang.String r4) {
                r3 = this;
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r4, r0)
                mf.c r0 = r3.f18448Z
                r1 = 0
                r2 = 2
                vg.C6664e.m13512m(r0, r4, r1, r2)
                ch.l r4 = ch.C0985l.f5061a
                return r4
        }
    }

    /* renamed from: mf.c$d */
    public static final class d extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p223mf.C4598c f18449Z;

        public d(p223mf.C4598c r1) {
                r0 = this;
                r0.f18449Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r10) {
                r9 = this;
                android.view.View r10 = (android.view.View) r10
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r10, r0)
                mf.c r10 = r9.f18449Z
                int r0 = p223mf.C4598c.f18442p1
                mf.f r10 = r10.m10449P0()
                mf.c r0 = r9.f18449Z
                android.content.Context r0 = r0.m1334s0()
                java.util.Objects.requireNonNull(r10)
                java.lang.String r1 = "context"
                p214m2.C4339q.m9706k(r0, r1)
                nd.b0 r2 = r10.f18456c
                mf.g r3 = new mf.g
                r3.<init>(r10)
                java.util.Objects.requireNonNull(r2)
                p214m2.C4339q.m9706k(r0, r1)
                java.lang.String r10 = "completion"
                p214m2.C4339q.m9706k(r3, r10)
                r2.f18918n = r3
                id.b r10 = r2.m10795h()
                if (r10 != 0) goto L38
                goto L70
            L38:
                java.lang.String r1 = r10.f12559a
                int r3 = r1.length()
                r4 = 1
                if (r3 != 0) goto L43
                r3 = 1
                goto L44
            L43:
                r3 = 0
            L44:
                if (r3 != 0) goto L73
                one.block.eosiojava.models.rpcProvider.Authorization r3 = new one.block.eosiojava.models.rpcProvider.Authorization
                java.lang.String r5 = r2.f18911g
                r3.<init>(r1, r5)
                b3.b r5 = new b3.b
                r5.<init>(r4)
                nd.w0 r4 = new nd.w0
                pd.k2 r6 = new pd.k2
                r6.<init>(r1)
                java.util.List r1 = p074e9.C1805a.m4528m(r3)
                java.lang.String r7 = "farminggame2"
                java.lang.String r8 = "sellproducts"
                r4.<init>(r7, r8, r6, r1)
                r5.m2208c(r4)
                nd.a r1 = p238nd.EnumC4724a.f18893w0
                r5.m2209d(r1, r3)
                r1 = 0
                r2.m10804r(r0, r10, r5, r1)
            L70:
                ch.l r10 = ch.C0985l.f5061a
                return r10
            L73:
                java.lang.Exception r10 = new java.lang.Exception
                java.lang.String r0 = "USER_NOT_SIGNED"
                r10.<init>(r0)
                throw r10
        }
    }

    /* renamed from: mf.c$e */
    public static final class e extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p003a2.C0005b, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p223mf.C4598c f18450Z;

        public e(p223mf.C4598c r1) {
                r0 = this;
                r0.f18450Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(p003a2.C0005b r5) {
                r4 = this;
                a2.b r5 = (p003a2.C0005b) r5
                java.lang.String r0 = "$this$setup"
                p214m2.C4339q.m9706k(r5, r0)
                mf.c r0 = r4.f18450Z
                b2.a<java.lang.Object> r0 = r0.f18445o1
                r5.m14b(r0)
                r0 = 2131558600(0x7f0d00c8, float:1.874252E38)
                mf.c r1 = r4.f18450Z
                java.lang.Class<mf.f$a> r2 = p223mf.C4601f.a.class
                java.lang.String r2 = r2.getName()
                e2.d r3 = new e2.d
                r3.<init>(r5, r2)
                java.lang.String r2 = "$this$withItem"
                p214m2.C4339q.m9706k(r3, r2)
                mf.d r2 = new mf.d
                r2.<init>(r1)
                mf.e r1 = p223mf.C4600e.f18455Z
                r3.mo12c(r2, r1)
                r5.m13a(r0, r3)
                ch.l r5 = ch.C0985l.f5061a
                return r5
        }
    }

    /* renamed from: mf.c$f */
    public static final class f extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f18451Z;

        public f(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f18451Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f18451Z
                return r0
        }
    }

    /* renamed from: mf.c$g */
    public static final class g extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f18452Z;

        public g(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f18452Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f18452Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: mf.c$h */
    public /* synthetic */ class h extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3541n1> {

        /* renamed from: g0 */
        public static final p223mf.C4598c.h f18453g0 = null;

        static {
                mf.c$h r0 = new mf.c$h
                r0.<init>()
                p223mf.C4598c.h.f18453g0 = r0
                return
        }

        public h() {
                r6 = this;
                java.lang.Class<jd.n1> r2 = p171jd.C3541n1.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/ToolFarmingtalesBarnFragmentBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.C3541n1 mo115i(android.view.LayoutInflater r12, android.view.ViewGroup r13, java.lang.Boolean r14) {
                r11 = this;
                android.view.LayoutInflater r12 = (android.view.LayoutInflater) r12
                android.view.ViewGroup r13 = (android.view.ViewGroup) r13
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r14 = r14.booleanValue()
                java.lang.String r0 = "p0"
                p214m2.C4339q.m9706k(r12, r0)
                r0 = 2131558670(0x7f0d010e, float:1.8742662E38)
                r1 = 0
                android.view.View r12 = r12.inflate(r0, r13, r1)
                if (r14 == 0) goto L1c
                r13.addView(r12)
            L1c:
                r13 = 2131361894(0x7f0a0066, float:1.8343553E38)
                android.view.View r14 = p064e.C1494h.m4055f(r12, r13)
                r2 = r14
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                if (r2 == 0) goto L93
                r13 = 2131361918(0x7f0a007e, float:1.8343602E38)
                android.view.View r14 = p064e.C1494h.m4055f(r12, r13)
                if (r14 == 0) goto L93
                jd.d0 r3 = p171jd.C3500d0.m7975d(r14)
                r13 = 2131361962(0x7f0a00aa, float:1.8343691E38)
                android.view.View r14 = p064e.C1494h.m4055f(r12, r13)
                r4 = r14
                com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
                if (r4 == 0) goto L93
                r13 = 2131361981(0x7f0a00bd, float:1.834373E38)
                android.view.View r14 = p064e.C1494h.m4055f(r12, r13)
                r5 = r14
                androidx.appcompat.widget.AppCompatImageView r5 = (androidx.appcompat.widget.AppCompatImageView) r5
                if (r5 == 0) goto L93
                r13 = 2131362127(0x7f0a014f, float:1.8344026E38)
                android.view.View r14 = p064e.C1494h.m4055f(r12, r13)
                r6 = r14
                androidx.appcompat.widget.AppCompatTextView r6 = (androidx.appcompat.widget.AppCompatTextView) r6
                if (r6 == 0) goto L93
                r13 = 2131362225(0x7f0a01b1, float:1.8344225E38)
                android.view.View r14 = p064e.C1494h.m4055f(r12, r13)
                r7 = r14
                com.google.android.material.card.MaterialCardView r7 = (com.google.android.material.card.MaterialCardView) r7
                if (r7 == 0) goto L93
                r13 = 2131362298(0x7f0a01fa, float:1.8344373E38)
                android.view.View r14 = p064e.C1494h.m4055f(r12, r13)
                r8 = r14
                androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
                if (r8 == 0) goto L93
                r13 = 2131362500(0x7f0a02c4, float:1.8344782E38)
                android.view.View r14 = p064e.C1494h.m4055f(r12, r13)
                r9 = r14
                com.google.android.material.progressindicator.CircularProgressIndicator r9 = (com.google.android.material.progressindicator.CircularProgressIndicator) r9
                if (r9 == 0) goto L93
                r13 = 2131362710(0x7f0a0396, float:1.8345208E38)
                android.view.View r14 = p064e.C1494h.m4055f(r12, r13)
                r10 = r14
                androidx.appcompat.widget.AppCompatTextView r10 = (androidx.appcompat.widget.AppCompatTextView) r10
                if (r10 == 0) goto L93
                jd.n1 r13 = new jd.n1
                r1 = r12
                androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
                r0 = r13
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r13
            L93:
                android.content.res.Resources r12 = r12.getResources()
                java.lang.String r12 = r12.getResourceName(r13)
                java.lang.NullPointerException r13 = new java.lang.NullPointerException
                java.lang.String r14 = "Missing required view with ID: "
                java.lang.String r12 = r14.concat(r12)
                r13.<init>(r12)
                throw r13
        }
    }

    /* renamed from: mf.c$i */
    public static final class i extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ p223mf.C4598c f18454Z;

        public i(p223mf.C4598c r1) {
                r0 = this;
                r0.f18454Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                mf.c r0 = r1.f18454Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    public C4598c() {
            r4 = this;
            r4.<init>()
            r0 = 1
            r4.f18443m1 = r0
            mf.c$i r0 = new mf.c$i
            r0.<init>(r4)
            mf.c$f r1 = new mf.c$f
            r1.<init>(r4)
            java.lang.Class<mf.f> r2 = p223mf.C4601f.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            mf.c$g r3 = new mf.c$g
            r3.<init>(r1)
            ch.d r0 = androidx.fragment.app.C0420z0.m1404a(r4, r2, r3, r0)
            r4.f18444n1 = r0
            b2.a r0 = p064e.C1492f.m4043c()
            r4.f18445o1 = r0
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: L0 */
    public void mo108L0() {
            r4 = this;
            mf.f r0 = r4.m10449P0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f18460g
            androidx.lifecycle.v r1 = r4.m1311O()
            mf.b r2 = new mf.b
            r3 = 0
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            mf.f r0 = r4.m10449P0()
            androidx.lifecycle.LiveData<java.util.List<mf.f$a>> r0 = r0.f18462i
            androidx.lifecycle.v r1 = r4.m1311O()
            mf.b r2 = new mf.b
            r3 = 1
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            mf.f r0 = r4.m10449P0()
            androidx.lifecycle.LiveData<ch.e<java.lang.Integer, java.lang.Integer>> r0 = r0.f18464k
            androidx.lifecycle.v r1 = r4.m1311O()
            mf.b r2 = new mf.b
            r3 = 2
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            mf.f r0 = r4.m10449P0()
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r0.f18465l
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            mf.c$b r3 = new mf.c$b
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            mf.f r0 = r4.m10449P0()
            androidx.lifecycle.d0<vg.b<java.lang.String>> r0 = r0.f18466m
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            mf.c$c r3 = new mf.c$c
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: M0 */
    public void mo109M0() {
            r5 = this;
            T extends w1.a r0 = r5.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.n1 r0 = (p171jd.C3541n1) r0
            androidx.appcompat.widget.AppCompatImageView r1 = r0.f15372d
            ud.a r2 = new ud.a
            r2.<init>(r5)
            r1.setOnClickListener(r2)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f15376h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            io.tacocrypto.app.ui.secret.c r3 = io.tacocrypto.app.p156ui.secret.EnumC3251c.f14336c0
            java.lang.String r4 = " Tool"
            p206le.C4271b.m9585a(r3, r2, r4, r1)
            jd.d0 r1 = r0.f15370b
            java.lang.Object r1 = r1.f15081c
            com.google.android.material.imageview.ShapeableImageView r1 = (com.google.android.material.imageview.ShapeableImageView) r1
            java.lang.String r2 = "barnInfo.imageView"
            p214m2.C4339q.m9705j(r1, r2)
            java.lang.String r2 = "https://ipfs.io/ipfs/QmPNjFhVDKgzBNNfhG2Ydy9u6BLdZ6eDPNUA6HU5kg33ce"
            vg.C6672m.m13521h(r1, r2)
            jd.d0 r1 = r0.f15370b
            java.lang.Object r1 = r1.f15082d
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            java.lang.String r2 = "Barn"
            r1.setText(r2)
            com.google.android.material.button.MaterialButton r0 = r0.f15371c
            java.lang.String r1 = "buttonSellAll"
            p214m2.C4339q.m9705j(r0, r1)
            r1 = 0
            mf.c$d r2 = new mf.c$d
            r2.<init>(r5)
            r3 = 1
            vg.C6664e.m13509j(r0, r1, r2, r3)
            T extends w1.a r0 = r5.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.n1 r0 = (p171jd.C3541n1) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15374f
            java.lang.String r1 = "binding.list"
            p214m2.C4339q.m9705j(r0, r1)
            mf.c$e r1 = new mf.c$e
            r1.<init>(r5)
            p064e.C1487a.m4032j(r0, r1)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: N0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3541n1> mo110N0() {
            r2 = this;
            mf.c$h r0 = p223mf.C4598c.h.f18453g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    @Override // td.AbstractC6218f
    /* renamed from: O0 */
    public boolean mo111O0() {
            r1 = this;
            boolean r0 = r1.f18443m1
            return r0
    }

    /* renamed from: P0 */
    public final p223mf.C4601f m10449P0() {
            r1 = this;
            ch.d r0 = r1.f18444n1
            java.lang.Object r0 = r0.getValue()
            mf.f r0 = (p223mf.C4601f) r0
            return r0
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r1) {
            r0 = this;
            super.mo114V(r1)
            mf.f r1 = r0.m10449P0()
            r1.m10450d()
            return
    }
}
