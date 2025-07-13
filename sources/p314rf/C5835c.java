package p314rf;

/* renamed from: rf.c */
/* loaded from: classes.dex */
public final class C5835c extends td.AbstractC6218f<p171jd.C3548p1> {

    /* renamed from: o1 */
    public static final /* synthetic */ int f22590o1 = 0;

    /* renamed from: m1 */
    public final boolean f22591m1;

    /* renamed from: n1 */
    public final ch.InterfaceC0977d f22592n1;

    /* renamed from: rf.c$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p013ah.C0100a, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p314rf.C5835c f22593Z;

        public a(p314rf.C5835c r1) {
                r0 = this;
                r0.f22593Z = r1
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
                rf.c r0 = r1.f22593Z
                p458zg.C7331c.m14402a(r0, r2)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: rf.c$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p314rf.C5835c f22594Z;

        public b(p314rf.C5835c r1) {
                r0 = this;
                r0.f22594Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r13) {
                r12 = this;
                android.view.View r13 = (android.view.View) r13
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r13, r0)
                rf.c r13 = r12.f22594Z
                int r0 = p314rf.C5835c.f22590o1
                rf.l r13 = r13.m12197P0()
                rf.c r0 = r12.f22594Z
                android.content.Context r0 = r0.m1334s0()
                java.util.Objects.requireNonNull(r13)
                java.lang.String r1 = "context"
                p214m2.C4339q.m9706k(r0, r1)
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                androidx.lifecycle.d0<java.lang.Double> r3 = r13.f22607e
                java.lang.Object r3 = r3.m1411d()
                java.lang.Double r3 = (java.lang.Double) r3
                r4 = 0
                java.lang.Double r6 = java.lang.Double.valueOf(r4)
                if (r3 != 0) goto L33
                r3 = r6
            L33:
                double r7 = r3.doubleValue()
                int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r3 <= 0) goto L40
                rf.a r3 = p314rf.EnumC5833a.f22584Y
                r2.add(r3)
            L40:
                androidx.lifecycle.d0<java.lang.Double> r3 = r13.f22608f
                java.lang.Object r3 = r3.m1411d()
                java.lang.Double r3 = (java.lang.Double) r3
                if (r3 != 0) goto L4b
                r3 = r6
            L4b:
                double r7 = r3.doubleValue()
                int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r3 <= 0) goto L58
                rf.a r3 = p314rf.EnumC5833a.f22585Z
                r2.add(r3)
            L58:
                androidx.lifecycle.d0<java.lang.Double> r3 = r13.f22609g
                java.lang.Object r3 = r3.m1411d()
                java.lang.Double r3 = (java.lang.Double) r3
                if (r3 != 0) goto L63
                goto L64
            L63:
                r6 = r3
            L64:
                double r6 = r6.doubleValue()
                int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r3 <= 0) goto L71
                rf.a r3 = p314rf.EnumC5833a.f22586a0
                r2.add(r3)
            L71:
                boolean r3 = r2.isEmpty()
                if (r3 == 0) goto L8e
                androidx.lifecycle.d0<vg.b<ah.a>> r13 = r13.f22612j
                vg.b r0 = new vg.b
                ah.a r1 = new ah.a
                zg.d r2 = p458zg.EnumC7332d.f28068Z
                java.lang.String r3 = "Error"
                java.lang.String r4 = "Nothing to claim"
                r1.<init>(r3, r4, r2)
                r0.<init>(r1)
                r13.mo7l(r0)
                goto L13b
            L8e:
                nd.b0 r3 = r13.f22605c
                rf.e r4 = new rf.e
                r4.<init>(r13)
                java.util.Objects.requireNonNull(r3)
                p214m2.C4339q.m9706k(r0, r1)
                java.lang.String r13 = "list"
                p214m2.C4339q.m9706k(r2, r13)
                java.lang.String r13 = "completion"
                p214m2.C4339q.m9706k(r4, r13)
                r3.f18918n = r4
                id.b r13 = r3.m10795h()
                if (r13 != 0) goto Laf
                goto L13b
            Laf:
                java.lang.String r1 = r13.f12559a
                int r4 = r1.length()
                r5 = 1
                if (r4 != 0) goto Lba
                r4 = 1
                goto Lbb
            Lba:
                r4 = 0
            Lbb:
                if (r4 != 0) goto L13e
                one.block.eosiojava.models.rpcProvider.Authorization r4 = new one.block.eosiojava.models.rpcProvider.Authorization
                java.lang.String r6 = r3.f18911g
                r4.<init>(r1, r6)
                java.util.ArrayList r6 = new java.util.ArrayList
                r7 = 10
                int r7 = p062dh.C1469e.m3992D(r2, r7)
                r6.<init>(r7)
                java.util.Iterator r2 = r2.iterator()
            Ld3:
                boolean r7 = r2.hasNext()
                if (r7 == 0) goto L12a
                java.lang.Object r7 = r2.next()
                rf.a r7 = (p314rf.EnumC5833a) r7
                int r7 = r7.ordinal()
                java.lang.String r8 = "claim"
                if (r7 == 0) goto L116
                java.lang.String r9 = "driveless.gr"
                if (r7 == r5) goto L105
                r10 = 2
                if (r7 != r10) goto Lff
                nd.w0 r7 = new nd.w0
                pd.j0 r10 = new pd.j0
                java.lang.String r11 = "nvenomsnftzs"
                r10.<init>(r1, r11)
                java.util.List r11 = p074e9.C1805a.m4528m(r4)
                r7.<init>(r9, r8, r10, r11)
                goto L126
            Lff:
                e7.y7 r13 = new e7.y7
                r13.<init>(r10)
                throw r13
            L105:
                nd.w0 r7 = new nd.w0
                pd.j0 r10 = new pd.j0
                java.lang.String r11 = "greenrabbit"
                r10.<init>(r1, r11)
                java.util.List r11 = p074e9.C1805a.m4528m(r4)
                r7.<init>(r9, r8, r10, r11)
                goto L126
            L116:
                nd.w0 r7 = new nd.w0
                pd.l0 r9 = new pd.l0
                r9.<init>(r1)
                java.util.List r10 = p074e9.C1805a.m4528m(r4)
                java.lang.String r11 = "staking.gr"
                r7.<init>(r11, r8, r9, r10)
            L126:
                r6.add(r7)
                goto Ld3
            L12a:
                b3.b r1 = new b3.b
                r1.<init>(r5)
                r1.m2207b(r6)
                nd.a r2 = p238nd.EnumC4724a.f18857P0
                r1.m2209d(r2, r4)
                r2 = 0
                r3.m10804r(r0, r13, r1, r2)
            L13b:
                ch.l r13 = ch.C0985l.f5061a
                return r13
            L13e:
                java.lang.Exception r13 = new java.lang.Exception
                java.lang.String r0 = "USER_NOT_SIGNED"
                r13.<init>(r0)
                throw r13
        }
    }

    /* renamed from: rf.c$c */
    public static final class c extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f22595Z;

        public c(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f22595Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f22595Z
                return r0
        }
    }

    /* renamed from: rf.c$d */
    public static final class d extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f22596Z;

        public d(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f22596Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f22596Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: rf.c$e */
    public /* synthetic */ class e extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3548p1> {

        /* renamed from: g0 */
        public static final p314rf.C5835c.e f22597g0 = null;

        static {
                rf.c$e r0 = new rf.c$e
                r0.<init>()
                p314rf.C5835c.e.f22597g0 = r0
                return
        }

        public e() {
                r6 = this;
                java.lang.Class<jd.p1> r2 = p171jd.C3548p1.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/ToolGreenrabbitFragmentBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.C3548p1 mo115i(android.view.LayoutInflater r10, android.view.ViewGroup r11, java.lang.Boolean r12) {
                r9 = this;
                android.view.LayoutInflater r10 = (android.view.LayoutInflater) r10
                android.view.ViewGroup r11 = (android.view.ViewGroup) r11
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                java.lang.String r0 = "p0"
                p214m2.C4339q.m9706k(r10, r0)
                r0 = 2131558672(0x7f0d0110, float:1.8742666E38)
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
                jd.p1 r11 = new jd.p1
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

    /* renamed from: rf.c$f */
    public static final class f extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ p314rf.C5835c f22598Z;

        public f(p314rf.C5835c r1) {
                r0 = this;
                r0.f22598Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                rf.c r0 = r1.f22598Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    public C5835c() {
            r4 = this;
            r4.<init>()
            r0 = 1
            r4.f22591m1 = r0
            rf.c$f r0 = new rf.c$f
            r0.<init>(r4)
            rf.c$c r1 = new rf.c$c
            r1.<init>(r4)
            java.lang.Class<rf.l> r2 = p314rf.C5844l.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            rf.c$d r3 = new rf.c$d
            r3.<init>(r1)
            ch.d r0 = androidx.fragment.app.C0420z0.m1404a(r4, r2, r3, r0)
            r4.f22592n1 = r0
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: L0 */
    public void mo108L0() {
            r4 = this;
            rf.l r0 = r4.m12197P0()
            androidx.lifecycle.LiveData<java.lang.Double> r0 = r0.f22610h
            androidx.lifecycle.v r1 = r4.m1311O()
            rf.b r2 = new rf.b
            r3 = 0
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            rf.l r0 = r4.m12197P0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f22611i
            androidx.lifecycle.v r1 = r4.m1311O()
            rf.b r2 = new rf.b
            r3 = 1
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            rf.l r0 = r4.m12197P0()
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r0.f22612j
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            rf.c$a r3 = new rf.c$a
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
            jd.p1 r0 = (p171jd.C3548p1) r0
            androidx.appcompat.widget.AppCompatImageView r1 = r0.f15426c
            ud.a r2 = new ud.a
            r2.<init>(r5)
            r1.setOnClickListener(r2)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f15428e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            io.tacocrypto.app.ui.secret.c r3 = io.tacocrypto.app.p156ui.secret.EnumC3251c.f14348o0
            java.lang.String r4 = " Tool"
            p206le.C4271b.m9585a(r3, r2, r4, r1)
            com.google.android.material.imageview.ShapeableImageView r1 = r0.f15427d
            java.lang.String r2 = "imageToken"
            p214m2.C4339q.m9705j(r1, r2)
            io.tacocrypto.app.a r2 = io.tacocrypto.app.EnumC3199a.f14219d0
            java.lang.String r2 = p097fd.C2139a.m5697a(r2)
            vg.C6672m.m13521h(r1, r2)
            com.google.android.material.button.MaterialButton r0 = r0.f15425b
            java.lang.String r1 = "buttonClaim"
            p214m2.C4339q.m9705j(r0, r1)
            r1 = 0
            rf.c$b r2 = new rf.c$b
            r2.<init>(r5)
            r3 = 1
            vg.C6664e.m13509j(r0, r1, r2, r3)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: N0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3548p1> mo110N0() {
            r2 = this;
            rf.c$e r0 = p314rf.C5835c.e.f22597g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    @Override // td.AbstractC6218f
    /* renamed from: O0 */
    public boolean mo111O0() {
            r1 = this;
            boolean r0 = r1.f22591m1
            return r0
    }

    /* renamed from: P0 */
    public final p314rf.C5844l m12197P0() {
            r1 = this;
            ch.d r0 = r1.f22592n1
            java.lang.Object r0 = r0.getValue()
            rf.l r0 = (p314rf.C5844l) r0
            return r0
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r1) {
            r0 = this;
            super.mo114V(r1)
            rf.l r1 = r0.m12197P0()
            r1.m12199e()
            return
    }
}
