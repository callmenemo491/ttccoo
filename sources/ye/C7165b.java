package ye;

/* renamed from: ye.b */
/* loaded from: classes.dex */
public final class C7165b extends td.AbstractC6218f<p171jd.C3497c1> {

    /* renamed from: p1 */
    public static final /* synthetic */ int f27645p1 = 0;

    /* renamed from: m1 */
    public final boolean f27646m1;

    /* renamed from: n1 */
    public final ch.InterfaceC0977d f27647n1;

    /* renamed from: o1 */
    public final p019b2.InterfaceC0655a<java.lang.Object> f27648o1;

    /* renamed from: ye.b$a */
    public static final class a extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {
        public a(android.view.View r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* renamed from: ye.b$b */
    public static final class b extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {
        public b(android.view.View r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* renamed from: ye.b$c */
    public static final class c extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<ch.C0978e<? extends java.lang.String, ? extends java.util.List<? extends p192kf.C4118o>>, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ ye.C7165b f27649Z;

        public c(ye.C7165b r1) {
                r0 = this;
                r0.f27649Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(ch.C0978e<? extends java.lang.String, ? extends java.util.List<? extends p192kf.C4118o>> r4) {
                r3 = this;
                ch.e r4 = (ch.C0978e) r4
                java.lang.String r0 = "<name for destructuring parameter 0>"
                p214m2.C4339q.m9706k(r4, r0)
                A r0 = r4.f5050Y
                java.lang.String r0 = (java.lang.String) r0
                B r4 = r4.f5051Z
                java.util.List r4 = (java.util.List) r4
                ye.b r1 = r3.f27649Z
                androidx.fragment.app.d0 r1 = r1.m1337u()
                java.lang.String r2 = "childFragmentManager"
                p214m2.C4339q.m9705j(r1, r2)
                p207lf.C4291d.m9590P0(r1, r0, r4)
                ch.l r4 = ch.C0985l.f5061a
                return r4
        }
    }

    /* renamed from: ye.b$d */
    public static final class d extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p013ah.C0100a, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ ye.C7165b f27650Z;

        public d(ye.C7165b r1) {
                r0 = this;
                r0.f27650Z = r1
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
                ye.b r0 = r1.f27650Z
                p458zg.C7331c.m14402a(r0, r2)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: ye.b$e */
    public static final class e extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ ye.C7165b f27651Z;

        public e(ye.C7165b r1) {
                r0 = this;
                r0.f27651Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r20) {
                r19 = this;
                r0 = r19
                r1 = r20
                android.view.View r1 = (android.view.View) r1
                java.lang.String r2 = "it"
                p214m2.C4339q.m9706k(r1, r2)
                ye.b r1 = r0.f27651Z
                int r2 = ye.C7165b.f27645p1
                ye.g0 r1 = r1.m14272P0()
                ye.b r2 = r0.f27651Z
                android.content.Context r2 = r2.m1334s0()
                java.util.Objects.requireNonNull(r1)
                java.lang.String r3 = "context"
                p214m2.C4339q.m9706k(r2, r3)
                androidx.lifecycle.d0<java.lang.Double> r4 = r1.f27675i
                java.lang.Object r4 = r4.m1411d()
                java.lang.Double r4 = (java.lang.Double) r4
                if (r4 != 0) goto L31
                r4 = 0
                java.lang.Double r4 = java.lang.Double.valueOf(r4)
            L31:
                double r5 = r4.doubleValue()
                nd.b0 r4 = r1.f27669c
                ye.h0 r7 = new ye.h0
                r7.<init>(r1)
                java.util.Objects.requireNonNull(r4)
                p214m2.C4339q.m9706k(r2, r3)
                java.lang.String r1 = "completion"
                p214m2.C4339q.m9706k(r7, r1)
                r4.f18918n = r7
                id.b r1 = r4.m10795h()
                if (r1 != 0) goto L50
                goto Lbb
            L50:
                java.lang.String r3 = r1.f12559a
                int r7 = r3.length()
                r8 = 0
                r9 = 1
                if (r7 != 0) goto L5c
                r7 = 1
                goto L5d
            L5c:
                r7 = 0
            L5d:
                if (r7 != 0) goto Lbe
                one.block.eosiojava.models.rpcProvider.Authorization r12 = new one.block.eosiojava.models.rpcProvider.Authorization
                java.lang.String r7 = r4.f18911g
                r12.<init>(r3, r7)
                b3.b r13 = new b3.b
                r13.<init>(r9)
                nd.w0 r7 = new nd.w0
                pd.u1 r9 = new pd.u1
                java.lang.String r10 = "4,BLU"
                r9.<init>(r3, r10, r3)
                java.util.List r10 = p074e9.C1805a.m4528m(r12)
                java.lang.String r14 = "bludactokens"
                java.lang.String r11 = "open"
                r7.<init>(r14, r11, r9, r10)
                r13.m2208c(r7)
                nd.w0 r15 = new nd.w0
                pd.o2 r11 = new pd.o2
                pd.x0 r10 = new pd.x0
                java.lang.StringBuilder r16 = new java.lang.StringBuilder
                r16.<init>()
                r7 = 4
                r9 = 2
                java.lang.String r17 = " BLU"
                r18 = r10
                r10 = r16
                r0 = r11
                r11 = r17
                java.lang.String r5 = p238nd.C4786y.m10840a(r5, r7, r8, r9, r10, r11)
                r6 = r18
                r6.<init>(r5, r14)
                r0.<init>(r3, r6)
                java.util.List r3 = p074e9.C1805a.m4528m(r12)
                java.lang.String r5 = "bludacmining"
                java.lang.String r6 = "wdbank"
                r15.<init>(r5, r6, r0, r3)
                r13.m2208c(r15)
                nd.a r0 = p238nd.EnumC4724a.f18853L0
                r13.m2209d(r0, r12)
                r0 = 0
                r4.m10804r(r2, r1, r13, r0)
            Lbb:
                ch.l r0 = ch.C0985l.f5061a
                return r0
            Lbe:
                java.lang.Exception r0 = new java.lang.Exception
                java.lang.String r1 = "USER_NOT_SIGNED"
                r0.<init>(r1)
                throw r0
        }
    }

    /* renamed from: ye.b$f */
    public static final class f extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ ye.C7165b f27652Z;

        public f(ye.C7165b r1) {
                r0 = this;
                r0.f27652Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r12) {
                r11 = this;
                android.view.View r12 = (android.view.View) r12
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r12, r0)
                ye.b r12 = r11.f27652Z
                int r0 = ye.C7165b.f27645p1
                ye.g0 r12 = r12.m14272P0()
                ye.b r0 = r11.f27652Z
                android.content.Context r0 = r0.m1334s0()
                java.util.Objects.requireNonNull(r12)
                java.lang.String r1 = "context"
                p214m2.C4339q.m9706k(r0, r1)
                nd.b0 r2 = r12.f27669c
                java.util.List<java.lang.String> r3 = r12.f27681o
                ye.f0 r4 = new ye.f0
                r4.<init>(r12)
                java.util.Objects.requireNonNull(r2)
                p214m2.C4339q.m9706k(r0, r1)
                java.lang.String r12 = "mineList"
                p214m2.C4339q.m9706k(r3, r12)
                java.lang.String r12 = "completion"
                p214m2.C4339q.m9706k(r4, r12)
                r2.f18918n = r4
                id.b r12 = r2.m10795h()
                if (r12 != 0) goto L3f
                goto L88
            L3f:
                java.lang.String r1 = r12.f12559a
                int r4 = r1.length()
                r5 = 1
                if (r4 != 0) goto L4a
                r4 = 1
                goto L4b
            L4a:
                r4 = 0
            L4b:
                if (r4 != 0) goto L8b
                one.block.eosiojava.models.rpcProvider.Authorization r4 = new one.block.eosiojava.models.rpcProvider.Authorization
                java.lang.String r6 = r2.f18911g
                r4.<init>(r1, r6)
                b3.b r6 = new b3.b
                r6.<init>(r5)
                java.util.Iterator r3 = r3.iterator()
            L5d:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L7f
                java.lang.Object r5 = r3.next()
                java.lang.String r5 = (java.lang.String) r5
                nd.w0 r7 = new nd.w0
                pd.r1 r8 = new pd.r1
                r8.<init>(r1, r5)
                java.util.List r5 = p074e9.C1805a.m4528m(r4)
                java.lang.String r9 = "bludacmining"
                java.lang.String r10 = "claim"
                r7.<init>(r9, r10, r8, r5)
                r6.m2208c(r7)
                goto L5d
            L7f:
                nd.a r1 = p238nd.EnumC4724a.f18854M0
                r6.m2209d(r1, r4)
                r1 = 0
                r2.m10804r(r0, r12, r6, r1)
            L88:
                ch.l r12 = ch.C0985l.f5061a
                return r12
            L8b:
                java.lang.Exception r12 = new java.lang.Exception
                java.lang.String r0 = "USER_NOT_SIGNED"
                r12.<init>(r0)
                throw r12
        }
    }

    /* renamed from: ye.b$g */
    public static final class g extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p003a2.C0005b, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ ye.C7165b f27653Z;

        public g(ye.C7165b r1) {
                r0 = this;
                r0.f27653Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(p003a2.C0005b r6) {
                r5 = this;
                a2.b r6 = (p003a2.C0005b) r6
                java.lang.String r0 = "$this$setup"
                p214m2.C4339q.m9706k(r6, r0)
                ye.b r0 = r5.f27653Z
                b2.a<java.lang.Object> r0 = r0.f27648o1
                r6.m14b(r0)
                r0 = 2131558622(0x7f0d00de, float:1.8742565E38)
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                java.lang.String r1 = r1.getName()
                e2.d r2 = new e2.d
                r2.<init>(r6, r1)
                java.lang.String r1 = "$this$withItem"
                p214m2.C4339q.m9706k(r2, r1)
                ye.c r3 = ye.C7167c.f27658g0
                ye.d r4 = ye.C7169d.f27661Z
                r2.mo12c(r3, r4)
                r6.m13a(r0, r2)
                r0 = 2131558595(0x7f0d00c3, float:1.874251E38)
                java.lang.Class<ze.f> r2 = p456ze.C7313f.class
                java.lang.String r2 = r2.getName()
                e2.d r3 = new e2.d
                r3.<init>(r6, r2)
                p214m2.C4339q.m9706k(r3, r1)
                ye.e r1 = ye.C7171e.f27663g0
                ye.f r2 = ye.C7173f.f27666Z
                r3.mo12c(r1, r2)
                r6.m13a(r0, r3)
                ch.l r6 = ch.C0985l.f5061a
                return r6
        }
    }

    /* renamed from: ye.b$h */
    public static final class h extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f27654Z;

        public h(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f27654Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f27654Z
                return r0
        }
    }

    /* renamed from: ye.b$i */
    public static final class i extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f27655Z;

        public i(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f27655Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f27655Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: ye.b$j */
    public /* synthetic */ class j extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3497c1> {

        /* renamed from: g0 */
        public static final ye.C7165b.j f27656g0 = null;

        static {
                ye.b$j r0 = new ye.b$j
                r0.<init>()
                ye.C7165b.j.f27656g0 = r0
                return
        }

        public j() {
                r6 = this;
                java.lang.Class<jd.c1> r2 = p171jd.C3497c1.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/ToolBludacFragmentBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.C3497c1 mo115i(android.view.LayoutInflater r17, android.view.ViewGroup r18, java.lang.Boolean r19) {
                r16 = this;
                r0 = r17
                android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
                r1 = r18
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                r2 = r19
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                java.lang.String r3 = "p0"
                p214m2.C4339q.m9706k(r0, r3)
                r3 = 2131558661(0x7f0d0105, float:1.8742644E38)
                r4 = 0
                android.view.View r0 = r0.inflate(r3, r1, r4)
                if (r2 == 0) goto L22
                r1.addView(r0)
            L22:
                r1 = 2131361894(0x7f0a0066, float:1.8343553E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r5 = r2
                com.google.android.material.appbar.AppBarLayout r5 = (com.google.android.material.appbar.AppBarLayout) r5
                if (r5 == 0) goto Lb0
                r1 = 2131361954(0x7f0a00a2, float:1.8343675E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r6 = r2
                com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
                if (r6 == 0) goto Lb0
                r1 = 2131361971(0x7f0a00b3, float:1.834371E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r7 = r2
                com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
                if (r7 == 0) goto Lb0
                r1 = 2131361981(0x7f0a00bd, float:1.834373E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r8 = r2
                androidx.appcompat.widget.AppCompatImageView r8 = (androidx.appcompat.widget.AppCompatImageView) r8
                if (r8 == 0) goto Lb0
                r1 = 2131362127(0x7f0a014f, float:1.8344026E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r9 = r2
                androidx.appcompat.widget.AppCompatTextView r9 = (androidx.appcompat.widget.AppCompatTextView) r9
                if (r9 == 0) goto Lb0
                r1 = 2131362225(0x7f0a01b1, float:1.8344225E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r10 = r2
                com.google.android.material.card.MaterialCardView r10 = (com.google.android.material.card.MaterialCardView) r10
                if (r10 == 0) goto Lb0
                r1 = 2131362258(0x7f0a01d2, float:1.8344292E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r11 = r2
                com.google.android.material.imageview.ShapeableImageView r11 = (com.google.android.material.imageview.ShapeableImageView) r11
                if (r11 == 0) goto Lb0
                r1 = 2131362298(0x7f0a01fa, float:1.8344373E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r12 = r2
                androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
                if (r12 == 0) goto Lb0
                r1 = 2131362646(0x7f0a0356, float:1.8345078E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r13 = r2
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r13 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r13
                if (r13 == 0) goto Lb0
                r1 = 2131362710(0x7f0a0396, float:1.8345208E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r14 = r2
                androidx.appcompat.widget.AppCompatTextView r14 = (androidx.appcompat.widget.AppCompatTextView) r14
                if (r14 == 0) goto Lb0
                r1 = 2131362749(0x7f0a03bd, float:1.8345287E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r15 = r2
                androidx.appcompat.widget.AppCompatTextView r15 = (androidx.appcompat.widget.AppCompatTextView) r15
                if (r15 == 0) goto Lb0
                jd.c1 r1 = new jd.c1
                r4 = r0
                androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return r1
            Lb0:
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r0 = r0.getResourceName(r1)
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "Missing required view with ID: "
                java.lang.String r0 = r2.concat(r0)
                r1.<init>(r0)
                throw r1
        }
    }

    /* renamed from: ye.b$k */
    public static final class k extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ ye.C7165b f27657Z;

        public k(ye.C7165b r1) {
                r0 = this;
                r0.f27657Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                ye.b r0 = r1.f27657Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    public C7165b() {
            r4 = this;
            r4.<init>()
            r0 = 1
            r4.f27646m1 = r0
            ye.b$k r0 = new ye.b$k
            r0.<init>(r4)
            ye.b$h r1 = new ye.b$h
            r1.<init>(r4)
            java.lang.Class<ye.g0> r2 = ye.C7176g0.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            ye.b$i r3 = new ye.b$i
            r3.<init>(r1)
            ch.d r0 = androidx.fragment.app.C0420z0.m1404a(r4, r2, r3, r0)
            r4.f27647n1 = r0
            b2.a r0 = p064e.C1492f.m4043c()
            r4.f27648o1 = r0
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: L0 */
    public void mo108L0() {
            r4 = this;
            ye.g0 r0 = r4.m14272P0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f27672f
            androidx.lifecycle.v r1 = r4.m1311O()
            ye.a r2 = new ye.a
            r3 = 0
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            ye.g0 r0 = r4.m14272P0()
            androidx.lifecycle.LiveData<java.util.List<java.lang.Object>> r0 = r0.f27674h
            androidx.lifecycle.v r1 = r4.m1311O()
            ye.a r2 = new ye.a
            r3 = 1
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            ye.g0 r0 = r4.m14272P0()
            androidx.lifecycle.LiveData<java.lang.Double> r0 = r0.f27676j
            androidx.lifecycle.v r1 = r4.m1311O()
            ye.a r2 = new ye.a
            r3 = 2
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            ye.g0 r0 = r4.m14272P0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f27677k
            androidx.lifecycle.v r1 = r4.m1311O()
            ye.a r2 = new ye.a
            r3 = 3
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            ye.g0 r0 = r4.m14272P0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f27679m
            androidx.lifecycle.v r1 = r4.m1311O()
            ye.a r2 = new ye.a
            r3 = 4
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            ye.g0 r0 = r4.m14272P0()
            androidx.lifecycle.d0<vg.b<ch.e<java.lang.String, java.util.List<kf.o>>>> r0 = r0.f27680n
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            ye.b$c r3 = new ye.b$c
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            ye.g0 r0 = r4.m14272P0()
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r0.f27682p
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            ye.b$d r3 = new ye.b$d
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
            jd.c1 r0 = (p171jd.C3497c1) r0
            androidx.appcompat.widget.AppCompatImageView r1 = r0.f15051d
            ud.a r2 = new ud.a
            r2.<init>(r5)
            r1.setOnClickListener(r2)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f15055h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            io.tacocrypto.app.ui.secret.c r3 = io.tacocrypto.app.p156ui.secret.EnumC3251c.f14355v0
            java.lang.String r4 = " Tool"
            p206le.C4271b.m9585a(r3, r2, r4, r1)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1 = r0.f15054g
            u3.b r2 = new u3.b
            r2.<init>(r5)
            r1.setOnRefreshListener(r2)
            com.google.android.material.imageview.ShapeableImageView r1 = r0.f15052e
            java.lang.String r2 = "imageToken"
            p214m2.C4339q.m9705j(r1, r2)
            io.tacocrypto.app.a r2 = io.tacocrypto.app.EnumC3199a.f14238w0
            java.lang.String r2 = p097fd.C2139a.m5697a(r2)
            vg.C6672m.m13521h(r1, r2)
            com.google.android.material.button.MaterialButton r1 = r0.f15050c
            java.lang.String r2 = "buttonWithdraw"
            p214m2.C4339q.m9705j(r1, r2)
            r2 = 0
            ye.b$e r3 = new ye.b$e
            r3.<init>(r5)
            r4 = 1
            vg.C6664e.m13509j(r1, r2, r3, r4)
            com.google.android.material.button.MaterialButton r0 = r0.f15049b
            java.lang.String r1 = "buttonHarvestAll"
            p214m2.C4339q.m9705j(r0, r1)
            r1 = 1000(0x3e8, float:1.401E-42)
            ye.b$f r2 = new ye.b$f
            r2.<init>(r5)
            vg.C6664e.m13508i(r0, r1, r2)
            T extends w1.a r0 = r5.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.c1 r0 = (p171jd.C3497c1) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15053f
            java.lang.String r1 = "binding.list"
            p214m2.C4339q.m9705j(r0, r1)
            ye.b$g r1 = new ye.b$g
            r1.<init>(r5)
            p064e.C1487a.m4032j(r0, r1)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: N0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3497c1> mo110N0() {
            r2 = this;
            ye.b$j r0 = ye.C7165b.j.f27656g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    @Override // td.AbstractC6218f
    /* renamed from: O0 */
    public boolean mo111O0() {
            r1 = this;
            boolean r0 = r1.f27646m1
            return r0
    }

    /* renamed from: P0 */
    public final ye.C7176g0 m14272P0() {
            r1 = this;
            ch.d r0 = r1.f27647n1
            java.lang.Object r0 = r0.getValue()
            ye.g0 r0 = (ye.C7176g0) r0
            return r0
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r1) {
            r0 = this;
            super.mo114V(r1)
            ye.g0 r1 = r0.m14272P0()
            r1.m14281l()
            return
    }
}
