package p099ff;

/* renamed from: ff.b */
/* loaded from: classes.dex */
public final class C2156b extends td.AbstractC6218f<p171jd.C3513g1> {

    /* renamed from: o1 */
    public static final /* synthetic */ int f9888o1 = 0;

    /* renamed from: m1 */
    public final boolean f9889m1;

    /* renamed from: n1 */
    public final ch.InterfaceC0977d f9890n1;

    /* renamed from: ff.b$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p013ah.C0100a, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p099ff.C2156b f9891Z;

        public a(p099ff.C2156b r1) {
                r0 = this;
                r0.f9891Z = r1
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
                ff.b r0 = r1.f9891Z
                p458zg.C7331c.m14402a(r0, r2)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: ff.b$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p099ff.C2156b f9892Z;

        public b(p099ff.C2156b r1) {
                r0 = this;
                r0.f9892Z = r1
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
                ff.b r10 = r9.f9892Z
                int r0 = p099ff.C2156b.f9888o1
                ff.g r10 = r10.m5703P0()
                ff.b r0 = r9.f9892Z
                android.content.Context r0 = r0.m1334s0()
                java.util.Objects.requireNonNull(r10)
                java.lang.String r1 = "context"
                p214m2.C4339q.m9706k(r0, r1)
                nd.b0 r2 = r10.f9903c
                ff.d r3 = new ff.d
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
                pd.f0 r6 = new pd.f0
                r6.<init>(r1)
                java.util.List r1 = p074e9.C1805a.m4528m(r3)
                java.lang.String r7 = "stk.pirates"
                java.lang.String r8 = "stakerclaim"
                r4.<init>(r7, r8, r6, r1)
                r5.m2208c(r4)
                nd.a r1 = p238nd.EnumC4724a.f18851J0
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

    /* renamed from: ff.b$c */
    public static final class c extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f9893Z;

        public c(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f9893Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f9893Z
                return r0
        }
    }

    /* renamed from: ff.b$d */
    public static final class d extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f9894Z;

        public d(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f9894Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f9894Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: ff.b$e */
    public /* synthetic */ class e extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3513g1> {

        /* renamed from: g0 */
        public static final p099ff.C2156b.e f9895g0 = null;

        static {
                ff.b$e r0 = new ff.b$e
                r0.<init>()
                p099ff.C2156b.e.f9895g0 = r0
                return
        }

        public e() {
                r6 = this;
                java.lang.Class<jd.g1> r2 = p171jd.C3513g1.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/ToolCoinpiratesFragmentBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.C3513g1 mo115i(android.view.LayoutInflater r10, android.view.ViewGroup r11, java.lang.Boolean r12) {
                r9 = this;
                android.view.LayoutInflater r10 = (android.view.LayoutInflater) r10
                android.view.ViewGroup r11 = (android.view.ViewGroup) r11
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                java.lang.String r0 = "p0"
                p214m2.C4339q.m9706k(r10, r0)
                r0 = 2131558665(0x7f0d0109, float:1.8742652E38)
                r1 = 0
                android.view.View r10 = r10.inflate(r0, r11, r1)
                if (r12 == 0) goto L1c
                r11.addView(r10)
            L1c:
                r11 = 2131361945(0x7f0a0099, float:1.8343657E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r2 = r12
                com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
                if (r2 == 0) goto L7a
                r11 = 2131361981(0x7f0a00bd, float:1.834373E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r3 = r12
                androidx.appcompat.widget.AppCompatImageView r3 = (androidx.appcompat.widget.AppCompatImageView) r3
                if (r3 == 0) goto L7a
                r11 = 2131362225(0x7f0a01b1, float:1.8344225E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r4 = r12
                com.google.android.material.card.MaterialCardView r4 = (com.google.android.material.card.MaterialCardView) r4
                if (r4 == 0) goto L7a
                r11 = 2131362258(0x7f0a01d2, float:1.8344292E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r5 = r12
                com.google.android.material.imageview.ShapeableImageView r5 = (com.google.android.material.imageview.ShapeableImageView) r5
                if (r5 == 0) goto L7a
                r11 = 2131362706(0x7f0a0392, float:1.83452E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r6 = r12
                androidx.appcompat.widget.AppCompatTextView r6 = (androidx.appcompat.widget.AppCompatTextView) r6
                if (r6 == 0) goto L7a
                r11 = 2131362710(0x7f0a0396, float:1.8345208E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r7 = r12
                androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
                if (r7 == 0) goto L7a
                r11 = 2131362749(0x7f0a03bd, float:1.8345287E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r8 = r12
                androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
                if (r8 == 0) goto L7a
                jd.g1 r11 = new jd.g1
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

    /* renamed from: ff.b$f */
    public static final class f extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ p099ff.C2156b f9896Z;

        public f(p099ff.C2156b r1) {
                r0 = this;
                r0.f9896Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                ff.b r0 = r1.f9896Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    public C2156b() {
            r4 = this;
            r4.<init>()
            r0 = 1
            r4.f9889m1 = r0
            ff.b$f r0 = new ff.b$f
            r0.<init>(r4)
            ff.b$c r1 = new ff.b$c
            r1.<init>(r4)
            java.lang.Class<ff.g> r2 = p099ff.C2161g.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            ff.b$d r3 = new ff.b$d
            r3.<init>(r1)
            ch.d r0 = androidx.fragment.app.C0420z0.m1404a(r4, r2, r3, r0)
            r4.f9890n1 = r0
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: L0 */
    public void mo108L0() {
            r4 = this;
            ff.g r0 = r4.m5703P0()
            androidx.lifecycle.LiveData<java.lang.Double> r0 = r0.f9906f
            androidx.lifecycle.v r1 = r4.m1311O()
            ff.a r2 = new ff.a
            r3 = 0
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            ff.g r0 = r4.m5703P0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f9907g
            androidx.lifecycle.v r1 = r4.m1311O()
            ff.a r2 = new ff.a
            r3 = 1
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            ff.g r0 = r4.m5703P0()
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r0.f9908h
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            ff.b$a r3 = new ff.b$a
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
            jd.g1 r0 = (p171jd.C3513g1) r0
            androidx.appcompat.widget.AppCompatImageView r1 = r0.f15184c
            ud.a r2 = new ud.a
            r2.<init>(r5)
            r1.setOnClickListener(r2)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f15186e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            io.tacocrypto.app.ui.secret.c r3 = io.tacocrypto.app.p156ui.secret.EnumC3251c.f14350q0
            java.lang.String r4 = " Tool"
            p206le.C4271b.m9585a(r3, r2, r4, r1)
            com.google.android.material.imageview.ShapeableImageView r1 = r0.f15185d
            java.lang.String r2 = "imageToken"
            p214m2.C4339q.m9705j(r1, r2)
            io.tacocrypto.app.a r2 = io.tacocrypto.app.EnumC3199a.f14226k0
            java.lang.String r2 = p097fd.C2139a.m5697a(r2)
            vg.C6672m.m13521h(r1, r2)
            com.google.android.material.button.MaterialButton r0 = r0.f15183b
            java.lang.String r1 = "buttonClaim"
            p214m2.C4339q.m9705j(r0, r1)
            r1 = 0
            ff.b$b r2 = new ff.b$b
            r2.<init>(r5)
            r3 = 1
            vg.C6664e.m13509j(r0, r1, r2, r3)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: N0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3513g1> mo110N0() {
            r2 = this;
            ff.b$e r0 = p099ff.C2156b.e.f9895g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    @Override // td.AbstractC6218f
    /* renamed from: O0 */
    public boolean mo111O0() {
            r1 = this;
            boolean r0 = r1.f9889m1
            return r0
    }

    /* renamed from: P0 */
    public final p099ff.C2161g m5703P0() {
            r1 = this;
            ch.d r0 = r1.f9890n1
            java.lang.Object r0 = r0.getValue()
            ff.g r0 = (p099ff.C2161g) r0
            return r0
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r1) {
            r0 = this;
            super.mo114V(r1)
            ff.g r1 = r0.m5703P0()
            r1.m5704d()
            return
    }
}
