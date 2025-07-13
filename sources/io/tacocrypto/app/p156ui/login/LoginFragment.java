package io.tacocrypto.app.p156ui.login;

/* loaded from: classes.dex */
public final class LoginFragment extends td.AbstractC6215c<p171jd.C3546p> {

    /* renamed from: W0 */
    public static final /* synthetic */ int f14295W0 = 0;

    /* renamed from: V0 */
    public final ch.InterfaceC0977d f14296V0;

    /* renamed from: io.tacocrypto.app.ui.login.LoginFragment$a */
    public static final class C3224a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<ch.C0978e<? extends java.lang.Boolean, ? extends java.lang.String>, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.login.LoginFragment f14297Z;

        public C3224a(io.tacocrypto.app.p156ui.login.LoginFragment r1) {
                r0 = this;
                r0.f14297Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(ch.C0978e<? extends java.lang.Boolean, ? extends java.lang.String> r3) {
                r2 = this;
                ch.e r3 = (ch.C0978e) r3
                java.lang.String r0 = "<name for destructuring parameter 0>"
                p214m2.C4339q.m9706k(r3, r0)
                A r3 = r3.f5050Y
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto L24
                io.tacocrypto.app.ui.login.LoginFragment r3 = r2.f14297Z
                androidx.fragment.app.s r3 = r3.m1330q0()
                android.content.Intent r0 = new android.content.Intent
                java.lang.Class<io.tacocrypto.app.ui.main.MainActivity> r1 = io.tacocrypto.app.p156ui.main.MainActivity.class
                r0.<init>(r3, r1)
                r3.startActivity(r0)
                r3.finish()
            L24:
                ch.l r3 = ch.C0985l.f5061a
                return r3
        }
    }

    /* renamed from: io.tacocrypto.app.ui.login.LoginFragment$b */
    public static final class C3225b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.login.LoginFragment f14298Z;

        public C3225b(io.tacocrypto.app.p156ui.login.LoginFragment r1) {
                r0 = this;
                r0.f14298Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r5) {
                r4 = this;
                android.view.View r5 = (android.view.View) r5
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r5, r0)
                io.tacocrypto.app.ui.login.LoginFragment r5 = r4.f14298Z
                ch.d r5 = r5.f14296V0
                java.lang.Object r5 = r5.getValue()
                xd.b r5 = (p415xd.C7042b) r5
                io.tacocrypto.app.ui.login.LoginFragment r0 = r4.f14298Z
                android.content.Context r0 = r0.m1334s0()
                od.v0 r1 = p255od.EnumC5234v0.WAX_CLOUD_WALLET
                java.util.Objects.requireNonNull(r5)
                java.lang.String r2 = "context"
                p214m2.C4339q.m9706k(r0, r2)
                java.lang.String r2 = "type"
                p214m2.C4339q.m9706k(r1, r2)
                nd.b0 r2 = r5.f27359c
                xd.a r3 = new xd.a
                r3.<init>(r5)
                r2.m10803q(r0, r1, r3)
                ch.l r5 = ch.C0985l.f5061a
                return r5
        }
    }

    /* renamed from: io.tacocrypto.app.ui.login.LoginFragment$c */
    public static final class C3226c extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.login.LoginFragment f14299Z;

        public C3226c(io.tacocrypto.app.p156ui.login.LoginFragment r1) {
                r0 = this;
                r0.f14299Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r5) {
                r4 = this;
                android.view.View r5 = (android.view.View) r5
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r5, r0)
                io.tacocrypto.app.ui.login.LoginFragment r5 = r4.f14299Z
                ch.d r5 = r5.f14296V0
                java.lang.Object r5 = r5.getValue()
                xd.b r5 = (p415xd.C7042b) r5
                io.tacocrypto.app.ui.login.LoginFragment r0 = r4.f14299Z
                android.content.Context r0 = r0.m1334s0()
                od.v0 r1 = p255od.EnumC5234v0.ANCHOR
                java.util.Objects.requireNonNull(r5)
                java.lang.String r2 = "context"
                p214m2.C4339q.m9706k(r0, r2)
                java.lang.String r2 = "type"
                p214m2.C4339q.m9706k(r1, r2)
                nd.b0 r2 = r5.f27359c
                xd.a r3 = new xd.a
                r3.<init>(r5)
                r2.m10803q(r0, r1, r3)
                ch.l r5 = ch.C0985l.f5061a
                return r5
        }
    }

    /* renamed from: io.tacocrypto.app.ui.login.LoginFragment$d */
    public static final class C3227d extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.login.LoginFragment f14300Z;

        public C3227d(io.tacocrypto.app.p156ui.login.LoginFragment r1) {
                r0 = this;
                r0.f14300Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r2) {
                r1 = this;
                android.view.View r2 = (android.view.View) r2
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r2, r0)
                io.tacocrypto.app.ui.login.LoginFragment r2 = r1.f14300Z
                android.content.Context r2 = r2.m1334s0()
                java.lang.String r0 = "https://www.mycloudwallet.com/"
                vg.C6672m.m13520g(r2, r0)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: io.tacocrypto.app.ui.login.LoginFragment$e */
    public static final class C3228e extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f14301Z;

        public C3228e(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f14301Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f14301Z
                return r0
        }
    }

    /* renamed from: io.tacocrypto.app.ui.login.LoginFragment$f */
    public static final class C3229f extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f14302Z;

        public C3229f(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f14302Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f14302Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: io.tacocrypto.app.ui.login.LoginFragment$g */
    public /* synthetic */ class C3230g extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3546p> {

        /* renamed from: g0 */
        public static final io.tacocrypto.app.p156ui.login.LoginFragment.C3230g f14303g0 = null;

        static {
                io.tacocrypto.app.ui.login.LoginFragment$g r0 = new io.tacocrypto.app.ui.login.LoginFragment$g
                r0.<init>()
                io.tacocrypto.app.p156ui.login.LoginFragment.C3230g.f14303g0 = r0
                return
        }

        public C3230g() {
                r6 = this;
                java.lang.Class<jd.p> r2 = p171jd.C3546p.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/FragmentLoginBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.C3546p mo115i(android.view.LayoutInflater r10, android.view.ViewGroup r11, java.lang.Boolean r12) {
                r9 = this;
                android.view.LayoutInflater r10 = (android.view.LayoutInflater) r10
                android.view.ViewGroup r11 = (android.view.ViewGroup) r11
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                java.lang.String r0 = "p0"
                p214m2.C4339q.m9706k(r10, r0)
                r0 = 2131558482(0x7f0d0052, float:1.8742281E38)
                r1 = 0
                android.view.View r10 = r10.inflate(r0, r11, r1)
                if (r12 == 0) goto L1c
                r11.addView(r10)
            L1c:
                r11 = 2131361941(0x7f0a0095, float:1.8343649E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                if (r12 == 0) goto L6b
                jd.c r4 = new jd.c
                androidx.cardview.widget.CardView r12 = (androidx.cardview.widget.CardView) r12
                r4.<init>(r12, r1)
                r11 = 2131361948(0x7f0a009c, float:1.8343663E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                if (r12 == 0) goto L6b
                jd.c r5 = new jd.c
                androidx.cardview.widget.CardView r12 = (androidx.cardview.widget.CardView) r12
                r11 = 1
                r5.<init>(r12, r11)
                r11 = 2131362050(0x7f0a0102, float:1.834387E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r6 = r12
                android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
                if (r6 == 0) goto L6b
                r11 = 2131362526(0x7f0a02de, float:1.8344835E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r7 = r12
                androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
                if (r7 == 0) goto L6b
                r11 = 2131362710(0x7f0a0396, float:1.8345208E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r8 = r12
                androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
                if (r8 == 0) goto L6b
                jd.p r11 = new jd.p
                r3 = r10
                androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
                r2 = r11
                r2.<init>(r3, r4, r5, r6, r7, r8)
                return r11
            L6b:
                android.content.res.Resources r10 = r10.getResources()
                java.lang.String r10 = r10.getResourceName(r11)
                java.lang.NullPointerException r11 = new java.lang.NullPointerException
                java.lang.String r12 = "Missing required view with ID: "
                java.lang.String r10 = r12.concat(r10)
                r11.<init>(r10)
                throw r11
        }
    }

    /* renamed from: io.tacocrypto.app.ui.login.LoginFragment$h */
    public static final class C3231h extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.login.LoginFragment f14304Z;

        public C3231h(io.tacocrypto.app.p156ui.login.LoginFragment r1) {
                r0 = this;
                r0.f14304Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                io.tacocrypto.app.ui.login.LoginFragment r0 = r1.f14304Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    public LoginFragment() {
            r4 = this;
            r4.<init>()
            io.tacocrypto.app.ui.login.LoginFragment$h r0 = new io.tacocrypto.app.ui.login.LoginFragment$h
            r0.<init>(r4)
            io.tacocrypto.app.ui.login.LoginFragment$e r1 = new io.tacocrypto.app.ui.login.LoginFragment$e
            r1.<init>(r4)
            java.lang.Class<xd.b> r2 = p415xd.C7042b.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            io.tacocrypto.app.ui.login.LoginFragment$f r3 = new io.tacocrypto.app.ui.login.LoginFragment$f
            r3.<init>(r1)
            ch.d r0 = androidx.fragment.app.C0420z0.m1404a(r4, r2, r3, r0)
            r4.f14296V0 = r0
            ug.a r0 = new ug.a
            r0.<init>()
            u3.b r1 = new u3.b
            r1.<init>(r4)
            r4.m1328p0(r0, r1)
            return
    }

    @Override // td.AbstractC6215c
    /* renamed from: D0 */
    public void mo7720D0() {
            r4 = this;
            ch.d r0 = r4.f14296V0
            java.lang.Object r0 = r0.getValue()
            xd.b r0 = (p415xd.C7042b) r0
            androidx.lifecycle.d0<vg.b<ch.e<java.lang.Boolean, java.lang.String>>> r0 = r0.f27360d
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            io.tacocrypto.app.ui.login.LoginFragment$a r3 = new io.tacocrypto.app.ui.login.LoginFragment$a
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            return
    }

    @Override // td.AbstractC6215c
    /* renamed from: F0 */
    public void mo7721F0() {
            r5 = this;
            T extends w1.a r0 = r5.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.p r0 = (p171jd.C3546p) r0
            jd.c r1 = r0.f15419c
            androidx.cardview.widget.CardView r1 = r1.m7969c()
            java.lang.String r2 = "buttonCloudWallet.root"
            p214m2.C4339q.m9705j(r1, r2)
            io.tacocrypto.app.ui.login.LoginFragment$b r2 = new io.tacocrypto.app.ui.login.LoginFragment$b
            r2.<init>(r5)
            r3 = 0
            r4 = 1
            vg.C6664e.m13509j(r1, r3, r2, r4)
            jd.c r0 = r0.f15418b
            androidx.cardview.widget.CardView r0 = r0.m7969c()
            java.lang.String r1 = "buttonAnchor.root"
            p214m2.C4339q.m9705j(r0, r1)
            io.tacocrypto.app.ui.login.LoginFragment$c r1 = new io.tacocrypto.app.ui.login.LoginFragment$c
            r1.<init>(r5)
            vg.C6664e.m13509j(r0, r3, r1, r4)
            T extends w1.a r0 = r5.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.p r0 = (p171jd.C3546p) r0
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f15420d
            java.lang.String r1 = "binding.registerAccount"
            p214m2.C4339q.m9705j(r0, r1)
            io.tacocrypto.app.ui.login.LoginFragment$d r1 = new io.tacocrypto.app.ui.login.LoginFragment$d
            r1.<init>(r5)
            vg.C6664e.m13509j(r0, r3, r1, r4)
            return
    }

    @Override // td.AbstractC6215c
    /* renamed from: G0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3546p> mo7722G0() {
            r2 = this;
            io.tacocrypto.app.ui.login.LoginFragment$g r0 = io.tacocrypto.app.p156ui.login.LoginFragment.C3230g.f14303g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }
}
