package bg;

/* renamed from: bg.b */
/* loaded from: classes.dex */
public final class C0758b extends td.AbstractC6218f<p171jd.C3498c2> {

    /* renamed from: o1 */
    public static final /* synthetic */ int f4097o1 = 0;

    /* renamed from: m1 */
    public final boolean f4098m1;

    /* renamed from: n1 */
    public final ch.InterfaceC0977d f4099n1;

    /* renamed from: bg.b$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p013ah.C0100a, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ bg.C0758b f4100Z;

        public a(bg.C0758b r1) {
                r0 = this;
                r0.f4100Z = r1
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
                bg.b r0 = r1.f4100Z
                p458zg.C7331c.m14402a(r0, r2)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: bg.b$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ bg.C0758b f4101Z;

        public b(bg.C0758b r1) {
                r0 = this;
                r0.f4101Z = r1
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
                bg.b r10 = r9.f4101Z
                int r0 = bg.C0758b.f4097o1
                bg.k r10 = r10.m2356P0()
                bg.b r0 = r9.f4101Z
                android.content.Context r0 = r0.m1334s0()
                java.util.Objects.requireNonNull(r10)
                java.lang.String r1 = "context"
                p214m2.C4339q.m9706k(r0, r1)
                nd.b0 r2 = r10.f4113c
                bg.e r3 = new bg.e
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
                pd.p0 r6 = new pd.p0
                r6.<init>(r1)
                java.util.List r1 = p074e9.C1805a.m4528m(r3)
                java.lang.String r7 = "olivelandstk"
                java.lang.String r8 = "claim"
                r4.<init>(r7, r8, r6, r1)
                r5.m2208c(r4)
                nd.a r1 = p238nd.EnumC4724a.f18879i0
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

    /* renamed from: bg.b$c */
    public static final class c extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ bg.C0758b f4102Z;

        public c(bg.C0758b r1) {
                r0 = this;
                r0.f4102Z = r1
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
                bg.b r10 = r9.f4102Z
                int r0 = bg.C0758b.f4097o1
                bg.k r10 = r10.m2356P0()
                bg.b r0 = r9.f4102Z
                android.content.Context r0 = r0.m1334s0()
                java.util.Objects.requireNonNull(r10)
                java.lang.String r1 = "context"
                p214m2.C4339q.m9706k(r0, r1)
                androidx.lifecycle.d0<java.util.List<java.lang.String>> r2 = r10.f4115e
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
                r10.m2357d()
                androidx.lifecycle.d0<vg.b<ah.a>> r10 = r10.f4120j
                java.lang.String r0 = "Ops"
                zg.d r1 = p458zg.EnumC7332d.f28069a0
                java.lang.String r2 = "title"
                p214m2.C4339q.m9706k(r0, r2)
                java.lang.String r2 = "image"
                p214m2.C4339q.m9706k(r1, r2)
                vg.b r2 = new vg.b
                ah.a r3 = new ah.a
                java.lang.String r4 = "You don't have any assets to stake!"
                r3.<init>(r0, r4, r1)
                r2.<init>(r3)
                r10.mo7l(r2)
                goto Lad
            L58:
                nd.b0 r5 = r10.f4113c
                bg.l r6 = new bg.l
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
                pd.c2 r7 = new pd.c2
                r7.<init>(r2, r1)
                java.util.List r1 = p074e9.C1805a.m4528m(r3)
                java.lang.String r2 = "olivelandstk"
                java.lang.String r8 = "stakeassets"
                r4.<init>(r2, r8, r7, r1)
                r6.m2208c(r4)
                nd.a r1 = p238nd.EnumC4724a.f18880j0
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

    /* renamed from: bg.b$d */
    public static final class d extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f4103Z;

        public d(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f4103Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f4103Z
                return r0
        }
    }

    /* renamed from: bg.b$e */
    public static final class e extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f4104Z;

        public e(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f4104Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f4104Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: bg.b$f */
    public /* synthetic */ class f extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3498c2> {

        /* renamed from: g0 */
        public static final bg.C0758b.f f4105g0 = null;

        static {
                bg.b$f r0 = new bg.b$f
                r0.<init>()
                bg.C0758b.f.f4105g0 = r0
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

    /* renamed from: bg.b$g */
    public static final class g extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ bg.C0758b f4106Z;

        public g(bg.C0758b r1) {
                r0 = this;
                r0.f4106Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                bg.b r0 = r1.f4106Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    public C0758b() {
            r4 = this;
            r4.<init>()
            r0 = 1
            r4.f4098m1 = r0
            bg.b$g r0 = new bg.b$g
            r0.<init>(r4)
            bg.b$d r1 = new bg.b$d
            r1.<init>(r4)
            java.lang.Class<bg.k> r2 = bg.C0767k.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            bg.b$e r3 = new bg.b$e
            r3.<init>(r1)
            ch.d r0 = androidx.fragment.app.C0420z0.m1404a(r4, r2, r3, r0)
            r4.f4099n1 = r0
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: L0 */
    public void mo108L0() {
            r4 = this;
            bg.k r0 = r4.m2356P0()
            androidx.lifecycle.LiveData<java.lang.Integer> r0 = r0.f4119i
            androidx.lifecycle.v r1 = r4.m1311O()
            bg.a r2 = new bg.a
            r3 = 0
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            bg.k r0 = r4.m2356P0()
            androidx.lifecycle.LiveData<java.lang.Double> r0 = r0.f4118h
            androidx.lifecycle.v r1 = r4.m1311O()
            bg.a r2 = new bg.a
            r3 = 1
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            bg.k r0 = r4.m2356P0()
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r0.f4120j
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            bg.b$a r3 = new bg.b$a
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
            r3 = 2131951954(0x7f130152, float:1.9540337E38)
            java.lang.String r3 = r5.m1309M(r3)
            r2.append(r3)
            java.lang.String r3 = " Tool"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.setText(r2)
            com.google.android.material.button.MaterialButton r1 = r0.f15058b
            java.lang.String r2 = "Claim OLV"
            r1.setText(r2)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f15067k
            java.lang.String r2 = "OLV to claim"
            r1.setText(r2)
            com.google.android.material.imageview.ShapeableImageView r1 = r0.f15062f
            java.lang.String r2 = "imageToken"
            p214m2.C4339q.m9705j(r1, r2)
            io.tacocrypto.app.a r2 = io.tacocrypto.app.EnumC3199a.f14225j0
            java.lang.String r2 = p097fd.C2139a.m5697a(r2)
            vg.C6672m.m13521h(r1, r2)
            com.google.android.material.button.MaterialButton r1 = r0.f15058b
            java.lang.String r2 = "buttonClaim"
            p214m2.C4339q.m9705j(r1, r2)
            bg.b$b r2 = new bg.b$b
            r2.<init>(r5)
            r3 = 0
            r4 = 1
            vg.C6664e.m13509j(r1, r3, r2, r4)
            com.google.android.material.button.MaterialButton r0 = r0.f15059c
            java.lang.String r1 = "buttonStakeAll"
            p214m2.C4339q.m9705j(r0, r1)
            bg.b$c r1 = new bg.b$c
            r1.<init>(r5)
            vg.C6664e.m13509j(r0, r3, r1, r4)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: N0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3498c2> mo110N0() {
            r2 = this;
            bg.b$f r0 = bg.C0758b.f.f4105g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    @Override // td.AbstractC6218f
    /* renamed from: O0 */
    public boolean mo111O0() {
            r1 = this;
            boolean r0 = r1.f4098m1
            return r0
    }

    /* renamed from: P0 */
    public final bg.C0767k m2356P0() {
            r1 = this;
            ch.d r0 = r1.f4099n1
            java.lang.Object r0 = r0.getValue()
            bg.k r0 = (bg.C0767k) r0
            return r0
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r1) {
            r0 = this;
            super.mo114V(r1)
            bg.k r1 = r0.m2356P0()
            r1.m2359f()
            return
    }
}
