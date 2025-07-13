package ag;

/* renamed from: ag.b */
/* loaded from: classes.dex */
public final class C0089b extends td.AbstractC6218f<p171jd.C3498c2> {

    /* renamed from: o1 */
    public static final /* synthetic */ int f304o1 = 0;

    /* renamed from: m1 */
    public final boolean f305m1;

    /* renamed from: n1 */
    public final ch.InterfaceC0977d f306n1;

    /* renamed from: ag.b$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p013ah.C0100a, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ ag.C0089b f307Z;

        public a(ag.C0089b r1) {
                r0 = this;
                r0.f307Z = r1
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
                ag.b r0 = r1.f307Z
                p458zg.C7331c.m14402a(r0, r2)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: ag.b$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ ag.C0089b f308Z;

        public b(ag.C0089b r1) {
                r0 = this;
                r0.f308Z = r1
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
                ag.b r10 = r9.f308Z
                int r0 = ag.C0089b.f304o1
                ag.k r10 = r10.m132P0()
                ag.b r0 = r9.f308Z
                android.content.Context r0 = r0.m1334s0()
                java.util.Objects.requireNonNull(r10)
                java.lang.String r1 = "context"
                p214m2.C4339q.m9706k(r0, r1)
                nd.b0 r2 = r10.f320c
                ag.e r3 = new ag.e
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
                pd.n0 r6 = new pd.n0
                r6.<init>(r1)
                java.util.List r1 = p074e9.C1805a.m4528m(r3)
                java.lang.String r7 = "novarallysnk"
                java.lang.String r8 = "claim"
                r4.<init>(r7, r8, r6, r1)
                r5.m2208c(r4)
                nd.a r1 = p238nd.EnumC4724a.f18877g0
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

    /* renamed from: ag.b$c */
    public static final class c extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ ag.C0089b f309Z;

        public c(ag.C0089b r1) {
                r0 = this;
                r0.f309Z = r1
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
                ag.b r10 = r9.f309Z
                int r0 = ag.C0089b.f304o1
                ag.k r10 = r10.m132P0()
                ag.b r0 = r9.f309Z
                android.content.Context r0 = r0.m1334s0()
                java.util.Objects.requireNonNull(r10)
                java.lang.String r1 = "context"
                p214m2.C4339q.m9706k(r0, r1)
                androidx.lifecycle.d0<java.util.List<java.lang.String>> r2 = r10.f322e
                java.lang.Object r2 = r2.m1411d()
                java.util.List r2 = (java.util.List) r2
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L32
                boolean r5 = r2.isEmpty()
                if (r5 == 0) goto L30
                goto L32
            L30:
                r5 = 0
                goto L33
            L32:
                r5 = 1
            L33:
                if (r5 == 0) goto L58
                r10.m133d()
                androidx.lifecycle.d0<vg.b<ah.a>> r10 = r10.f328k
                java.lang.String r0 = "Ops"
                zg.d r1 = p458zg.EnumC7332d.f28069a0
                java.lang.String r2 = "title"
                p214m2.C4339q.m9706k(r0, r2)
                java.lang.String r2 = "image"
                p214m2.C4339q.m9706k(r1, r2)
                vg.b r2 = new vg.b
                ah.a r3 = new ah.a
                java.lang.String r4 = "You don't have any assets to snake!"
                r3.<init>(r0, r4, r1)
                r2.<init>(r3)
                r10.mo7l(r2)
                goto Lad
            L58:
                nd.b0 r5 = r10.f320c
                ag.l r6 = new ag.l
                r6.<init>(r10)
                java.util.Objects.requireNonNull(r5)
                p214m2.C4339q.m9706k(r0, r1)
                java.lang.String r10 = "listAssets"
                p214m2.C4339q.m9706k(r2, r10)
                java.lang.String r10 = "completion"
                p214m2.C4339q.m9706k(r6, r10)
                r5.f18918n = r6
                id.b r10 = r5.m10795h()
                if (r10 != 0) goto L78
                goto Lad
            L78:
                java.lang.String r1 = r10.f12559a
                int r6 = r1.length()
                if (r6 != 0) goto L81
                r3 = 1
            L81:
                if (r3 != 0) goto Lb0
                one.block.eosiojava.models.rpcProvider.Authorization r3 = new one.block.eosiojava.models.rpcProvider.Authorization
                java.lang.String r6 = r5.f18911g
                r3.<init>(r1, r6)
                b3.b r6 = new b3.b
                r6.<init>(r4)
                nd.w0 r4 = new nd.w0
                pd.a2 r7 = new pd.a2
                r7.<init>(r2, r1)
                java.util.List r1 = p074e9.C1805a.m4528m(r3)
                java.lang.String r2 = "novarallysnk"
                java.lang.String r8 = "stakeassets"
                r4.<init>(r2, r8, r7, r1)
                r6.m2208c(r4)
                nd.a r1 = p238nd.EnumC4724a.f18878h0
                r6.m2209d(r1, r3)
                r1 = 0
                r5.m10804r(r0, r10, r6, r1)
            Lad:
                ch.l r10 = ch.C0985l.f5061a
                return r10
            Lb0:
                java.lang.Exception r10 = new java.lang.Exception
                java.lang.String r0 = "USER_NOT_SIGNED"
                r10.<init>(r0)
                throw r10
        }
    }

    /* renamed from: ag.b$d */
    public static final class d extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f310Z;

        public d(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f310Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f310Z
                return r0
        }
    }

    /* renamed from: ag.b$e */
    public static final class e extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f311Z;

        public e(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f311Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f311Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: ag.b$f */
    public /* synthetic */ class f extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3498c2> {

        /* renamed from: g0 */
        public static final ag.C0089b.f f312g0 = null;

        static {
                ag.b$f r0 = new ag.b$f
                r0.<init>()
                ag.C0089b.f.f312g0 = r0
                return
        }

        public f() {
                r6 = this;
                java.lang.Class<jd.c2> r2 = p171jd.C3498c2.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/ToolNovarallyFragmentBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.C3498c2 mo115i(android.view.LayoutInflater r2, android.view.ViewGroup r3, java.lang.Boolean r4) {
                r1 = this;
                android.view.LayoutInflater r2 = (android.view.LayoutInflater) r2
                android.view.ViewGroup r3 = (android.view.ViewGroup) r3
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                java.lang.String r0 = "p0"
                p214m2.C4339q.m9706k(r2, r0)
                jd.c2 r2 = p171jd.C3498c2.m7971a(r2, r3, r4)
                return r2
        }
    }

    /* renamed from: ag.b$g */
    public static final class g extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ ag.C0089b f313Z;

        public g(ag.C0089b r1) {
                r0 = this;
                r0.f313Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                ag.b r0 = r1.f313Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    public C0089b() {
            r4 = this;
            r4.<init>()
            r0 = 1
            r4.f305m1 = r0
            ag.b$g r0 = new ag.b$g
            r0.<init>(r4)
            ag.b$d r1 = new ag.b$d
            r1.<init>(r4)
            java.lang.Class<ag.k> r2 = ag.C0098k.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            ag.b$e r3 = new ag.b$e
            r3.<init>(r1)
            ch.d r0 = androidx.fragment.app.C0420z0.m1404a(r4, r2, r3, r0)
            r4.f306n1 = r0
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: L0 */
    public void mo108L0() {
            r4 = this;
            ag.k r0 = r4.m132P0()
            androidx.lifecycle.LiveData<java.lang.Integer> r0 = r0.f327j
            androidx.lifecycle.v r1 = r4.m1311O()
            ag.a r2 = new ag.a
            r3 = 0
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            ag.k r0 = r4.m132P0()
            androidx.lifecycle.LiveData<java.lang.Double> r0 = r0.f325h
            androidx.lifecycle.v r1 = r4.m1311O()
            ag.a r2 = new ag.a
            r3 = 1
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            ag.k r0 = r4.m132P0()
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r0.f328k
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            ag.b$a r3 = new ag.b$a
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
            jd.c2 r0 = (p171jd.C3498c2) r0
            androidx.appcompat.widget.AppCompatImageView r1 = r0.f15060d
            ud.a r2 = new ud.a
            r2.<init>(r5)
            r1.setOnClickListener(r2)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f15068l
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 2131951952(0x7f130150, float:1.9540333E38)
            java.lang.String r3 = r5.m1309M(r3)
            r2.append(r3)
            java.lang.String r3 = " Tool"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.setText(r2)
            com.google.android.material.button.MaterialButton r1 = r0.f15058b
            java.lang.String r2 = "Claim SNAKOIL/BOOST"
            r1.setText(r2)
            com.google.android.material.button.MaterialButton r1 = r0.f15059c
            java.lang.String r2 = "Snake All Assets"
            r1.setText(r2)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f15067k
            java.lang.String r2 = "SNAKOIL to claim"
            r1.setText(r2)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f15063g
            java.lang.String r2 = "Snaked assets: "
            r1.setText(r2)
            com.google.android.material.imageview.ShapeableImageView r1 = r0.f15062f
            java.lang.String r2 = "imageToken"
            p214m2.C4339q.m9705j(r1, r2)
            io.tacocrypto.app.a r2 = io.tacocrypto.app.EnumC3199a.f14227l0
            java.lang.String r2 = p097fd.C2139a.m5697a(r2)
            vg.C6672m.m13521h(r1, r2)
            com.google.android.material.button.MaterialButton r1 = r0.f15058b
            java.lang.String r2 = "buttonClaim"
            p214m2.C4339q.m9705j(r1, r2)
            ag.b$b r2 = new ag.b$b
            r2.<init>(r5)
            r3 = 0
            r4 = 1
            vg.C6664e.m13509j(r1, r3, r2, r4)
            com.google.android.material.button.MaterialButton r0 = r0.f15059c
            java.lang.String r1 = "buttonStakeAll"
            p214m2.C4339q.m9705j(r0, r1)
            ag.b$c r1 = new ag.b$c
            r1.<init>(r5)
            vg.C6664e.m13509j(r0, r3, r1, r4)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: N0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3498c2> mo110N0() {
            r2 = this;
            ag.b$f r0 = ag.C0089b.f.f312g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    @Override // td.AbstractC6218f
    /* renamed from: O0 */
    public boolean mo111O0() {
            r1 = this;
            boolean r0 = r1.f305m1
            return r0
    }

    /* renamed from: P0 */
    public final ag.C0098k m132P0() {
            r1 = this;
            ch.d r0 = r1.f306n1
            java.lang.Object r0 = r0.getValue()
            ag.k r0 = (ag.C0098k) r0
            return r0
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r1) {
            r0 = this;
            super.mo114V(r1)
            ag.k r1 = r0.m132P0()
            r1.m135f()
            return
    }
}
