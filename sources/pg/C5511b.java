package pg;

/* renamed from: pg.b */
/* loaded from: classes.dex */
public final class C5511b extends td.AbstractC6218f<p171jd.C3498c2> {

    /* renamed from: o1 */
    public static final /* synthetic */ int f21487o1 = 0;

    /* renamed from: m1 */
    public final boolean f21488m1;

    /* renamed from: n1 */
    public final ch.InterfaceC0977d f21489n1;

    /* renamed from: pg.b$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p013ah.C0100a, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ pg.C5511b f21490Z;

        public a(pg.C5511b r1) {
                r0 = this;
                r0.f21490Z = r1
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
                pg.b r0 = r1.f21490Z
                p458zg.C7331c.m14402a(r0, r2)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: pg.b$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ pg.C5511b f21491Z;

        public b(pg.C5511b r1) {
                r0 = this;
                r0.f21491Z = r1
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
                pg.b r10 = r9.f21491Z
                int r0 = pg.C5511b.f21487o1
                pg.m r10 = r10.m11778P0()
                pg.b r0 = r9.f21491Z
                android.content.Context r0 = r0.m1334s0()
                java.util.Objects.requireNonNull(r10)
                java.lang.String r1 = "context"
                p214m2.C4339q.m9706k(r0, r1)
                nd.b0 r2 = r10.f21505c
                pg.d r3 = new pg.d
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
                pd.m2 r6 = new pd.m2
                r6.<init>(r1)
                java.util.List r1 = p074e9.C1805a.m4528m(r3)
                java.lang.String r7 = "dreamstaking"
                java.lang.String r8 = "claim"
                r4.<init>(r7, r8, r6, r1)
                r5.m2208c(r4)
                nd.a r1 = p238nd.EnumC4724a.f18881k0
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

    /* renamed from: pg.b$c */
    public static final class c extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ pg.C5511b f21492Z;

        public c(pg.C5511b r1) {
                r0 = this;
                r0.f21492Z = r1
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
                pg.b r10 = r9.f21492Z
                int r0 = pg.C5511b.f21487o1
                pg.m r10 = r10.m11778P0()
                pg.b r0 = r9.f21492Z
                android.content.Context r0 = r0.m1334s0()
                java.util.Objects.requireNonNull(r10)
                java.lang.String r1 = "context"
                p214m2.C4339q.m9706k(r0, r1)
                nd.b0 r2 = r10.f21505c
                pg.n r3 = new pg.n
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
                pd.m2 r6 = new pd.m2
                r6.<init>(r1)
                java.util.List r1 = p074e9.C1805a.m4528m(r3)
                java.lang.String r7 = "dreamstaking"
                java.lang.String r8 = "stakeall"
                r4.<init>(r7, r8, r6, r1)
                r5.m2208c(r4)
                nd.a r1 = p238nd.EnumC4724a.f18882l0
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

    /* renamed from: pg.b$d */
    public static final class d extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f21493Z;

        public d(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f21493Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f21493Z
                return r0
        }
    }

    /* renamed from: pg.b$e */
    public static final class e extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f21494Z;

        public e(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f21494Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f21494Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: pg.b$f */
    public /* synthetic */ class f extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3498c2> {

        /* renamed from: g0 */
        public static final pg.C5511b.f f21495g0 = null;

        static {
                pg.b$f r0 = new pg.b$f
                r0.<init>()
                pg.C5511b.f.f21495g0 = r0
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

    /* renamed from: pg.b$g */
    public static final class g extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ pg.C5511b f21496Z;

        public g(pg.C5511b r1) {
                r0 = this;
                r0.f21496Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                pg.b r0 = r1.f21496Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    public C5511b() {
            r4 = this;
            r4.<init>()
            r0 = 1
            r4.f21488m1 = r0
            pg.b$g r0 = new pg.b$g
            r0.<init>(r4)
            pg.b$d r1 = new pg.b$d
            r1.<init>(r4)
            java.lang.Class<pg.m> r2 = pg.C5522m.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            pg.b$e r3 = new pg.b$e
            r3.<init>(r1)
            ch.d r0 = androidx.fragment.app.C0420z0.m1404a(r4, r2, r3, r0)
            r4.f21489n1 = r0
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: L0 */
    public void mo108L0() {
            r4 = this;
            pg.m r0 = r4.m11778P0()
            androidx.lifecycle.LiveData<java.lang.Integer> r0 = r0.f21512j
            androidx.lifecycle.v r1 = r4.m1311O()
            pg.a r2 = new pg.a
            r3 = 0
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            pg.m r0 = r4.m11778P0()
            androidx.lifecycle.LiveData<java.lang.Double> r0 = r0.f21510h
            androidx.lifecycle.v r1 = r4.m1311O()
            pg.a r2 = new pg.a
            r3 = 1
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            pg.m r0 = r4.m11778P0()
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r0.f21513k
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            pg.b$a r3 = new pg.b$a
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
            gg.a r2 = new gg.a
            r2.<init>(r5)
            r1.setOnClickListener(r2)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f15068l
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            io.tacocrypto.app.ui.secret.c r3 = io.tacocrypto.app.p156ui.secret.EnumC3251c.f14357x0
            java.lang.String r4 = " Tool"
            p206le.C4271b.m9585a(r3, r2, r4, r1)
            com.google.android.material.button.MaterialButton r1 = r0.f15058b
            java.lang.String r2 = "Claim DREAM"
            r1.setText(r2)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f15067k
            java.lang.String r2 = "DREAM to claim"
            r1.setText(r2)
            com.google.android.material.imageview.ShapeableImageView r1 = r0.f15062f
            java.lang.String r2 = "imageToken"
            p214m2.C4339q.m9705j(r1, r2)
            io.tacocrypto.app.a r2 = io.tacocrypto.app.EnumC3199a.f14234s0
            java.lang.String r2 = p097fd.C2139a.m5697a(r2)
            vg.C6672m.m13521h(r1, r2)
            com.google.android.material.button.MaterialButton r1 = r0.f15058b
            java.lang.String r2 = "buttonClaim"
            p214m2.C4339q.m9705j(r1, r2)
            pg.b$b r2 = new pg.b$b
            r2.<init>(r5)
            r3 = 0
            r4 = 1
            vg.C6664e.m13509j(r1, r3, r2, r4)
            com.google.android.material.button.MaterialButton r0 = r0.f15059c
            java.lang.String r1 = "buttonStakeAll"
            p214m2.C4339q.m9705j(r0, r1)
            pg.b$c r1 = new pg.b$c
            r1.<init>(r5)
            vg.C6664e.m13509j(r0, r3, r1, r4)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: N0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3498c2> mo110N0() {
            r2 = this;
            pg.b$f r0 = pg.C5511b.f.f21495g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    @Override // td.AbstractC6218f
    /* renamed from: O0 */
    public boolean mo111O0() {
            r1 = this;
            boolean r0 = r1.f21488m1
            return r0
    }

    /* renamed from: P0 */
    public final pg.C5522m m11778P0() {
            r1 = this;
            ch.d r0 = r1.f21489n1
            java.lang.Object r0 = r0.getValue()
            pg.m r0 = (pg.C5522m) r0
            return r0
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r1) {
            r0 = this;
            super.mo114V(r1)
            pg.m r1 = r0.m11778P0()
            r1.m11781f()
            return
    }
}
