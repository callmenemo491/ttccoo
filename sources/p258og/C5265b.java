package p258og;

/* renamed from: og.b */
/* loaded from: classes.dex */
public final class C5265b extends td.AbstractC6218f<p171jd.C3518h2> {

    /* renamed from: o1 */
    public static final /* synthetic */ int f20434o1 = 0;

    /* renamed from: m1 */
    public final boolean f20435m1;

    /* renamed from: n1 */
    public final ch.InterfaceC0977d f20436n1;

    /* renamed from: og.b$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p013ah.C0100a, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p258og.C5265b f20437Z;

        public a(p258og.C5265b r1) {
                r0 = this;
                r0.f20437Z = r1
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
                og.b r0 = r1.f20437Z
                p458zg.C7331c.m14402a(r0, r2)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: og.b$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<ch.C0985l, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p258og.C5265b f20438Z;

        public b(p258og.C5265b r1) {
                r0 = this;
                r0.f20438Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(ch.C0985l r3) {
                r2 = this;
                ch.l r3 = (ch.C0985l) r3
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r3, r0)
                og.b r3 = r2.f20438Z
                java.lang.String r0 = "Ooops"
                java.lang.String r1 = "Sorry, Uplift on Anchor is not supported yet (we're working on it)"
                p458zg.C7331c.m14403b(r3, r0, r1)
                ch.l r3 = ch.C0985l.f5061a
                return r3
        }
    }

    /* renamed from: og.b$c */
    public static final class c extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p258og.C5265b f20439Z;

        public c(p258og.C5265b r1) {
                r0 = this;
                r0.f20439Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r14) {
                r13 = this;
                android.view.View r14 = (android.view.View) r14
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r14, r0)
                og.b r14 = r13.f20439Z
                int r0 = p258og.C5265b.f20434o1
                og.d r14 = r14.m11518P0()
                og.b r0 = r13.f20439Z
                android.content.Context r6 = r0.m1334s0()
                java.util.Objects.requireNonNull(r14)
                nd.b0 r0 = r14.f20446c
                id.b r0 = r0.m10795h()
                r1 = 0
                if (r0 == 0) goto L24
                od.v0 r0 = r0.f12560b
                goto L25
            L24:
                r0 = r1
            L25:
                od.v0 r2 = p255od.EnumC5234v0.ANCHOR
                if (r0 != r2) goto L37
                androidx.lifecycle.d0<vg.b<ch.l>> r14 = r14.f20456m
                vg.b r0 = new vg.b
                ch.l r1 = ch.C0985l.f5061a
                r0.<init>(r1)
                r14.mo7l(r0)
                goto Ld6
            L37:
                nd.b0 r4 = r14.f20446c
                og.e r0 = new og.e
                r0.<init>(r14)
                java.util.Objects.requireNonNull(r4)
                r4.f18918n = r1
                r4.f18919o = r0
                r4.f18920p = r1
                id.b r14 = r4.m10795h()
                if (r14 != 0) goto L4f
                goto Ld6
            L4f:
                java.lang.String r0 = r14.f12559a
                int r1 = r0.length()
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L5b
                r1 = 1
                goto L5c
            L5b:
                r1 = 0
            L5c:
                if (r1 != 0) goto Ld9
                one.block.eosiojava.models.rpcProvider.Authorization r1 = new one.block.eosiojava.models.rpcProvider.Authorization
                java.lang.String r5 = r4.f18911g
                r1.<init>(r0, r5)
                b3.b r5 = new b3.b
                r5.<init>(r3)
                nd.w0 r0 = new nd.w0
                pd.n r7 = new pd.n
                java.lang.String r8 = "23849328"
                r7.<init>(r8)
                java.util.List r1 = p074e9.C1805a.m4528m(r1)
                java.lang.String r8 = "atomictoolsx"
                java.lang.String r9 = "auth"
                r0.<init>(r8, r9, r7, r1)
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r1 = r5.f3814a
                r1.add(r0)
                od.v0 r14 = r14.f12560b
                int[] r0 = p238nd.C4728b0.c.f18932a
                int r14 = r14.ordinal()
                r14 = r0[r14]
                if (r14 == r3) goto La9
                r0 = 2
                if (r14 == r0) goto L93
                goto Ld6
            L93:
                nd.f0 r14 = new nd.f0
                r14.<init>(r4)
                r4.f18924t = r14
                r4.m10805s(r6)
                java.util.List r14 = r5.m2211g()
                nd.i0 r0 = new nd.i0
                r0.<init>(r4, r14)
                r4.f18913i = r0
                goto Ld6
            La9:
                one.block.eosiojava.session.TransactionSession r14 = r4.m10796i()
                if (r14 != 0) goto Lb8
                java.lang.Object[] r0 = new java.lang.Object[r2]
                hk.a$b r1 = hk.C3053a.f12282b
                java.lang.String r2 = "ERROR: No TransactionSession found."
                r1.mo7467a(r2, r0)
            Lb8:
                if (r14 != 0) goto Lbb
                goto Ld6
            Lbb:
                one.block.eosiojava.session.TransactionProcessor r2 = r14.getTransactionProcessor()
                r4.f18915k = r2
                java.util.List r3 = r5.m2211g()
                vh.v0 r14 = p379vh.C6746v0.f26044Y
                r8 = 0
                nd.e0 r10 = new nd.e0
                r7 = 0
                r1 = r10
                r1.<init>(r2, r3, r4, r5, r6, r7)
                r11 = 3
                r12 = 0
                r9 = 0
                r7 = r14
                p101fh.C2174f.m5714d(r7, r8, r9, r10, r11, r12)
            Ld6:
                ch.l r14 = ch.C0985l.f5061a
                return r14
            Ld9:
                java.lang.Exception r14 = new java.lang.Exception
                java.lang.String r0 = "USER_NOT_SIGNED"
                r14.<init>(r0)
                throw r14
        }
    }

    /* renamed from: og.b$d */
    public static final class d extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f20440Z;

        public d(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f20440Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f20440Z
                return r0
        }
    }

    /* renamed from: og.b$e */
    public static final class e extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f20441Z;

        public e(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f20441Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f20441Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: og.b$f */
    public /* synthetic */ class f extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3518h2> {

        /* renamed from: g0 */
        public static final p258og.C5265b.f f20442g0 = null;

        static {
                og.b$f r0 = new og.b$f
                r0.<init>()
                p258og.C5265b.f.f20442g0 = r0
                return
        }

        public f() {
                r6 = this;
                java.lang.Class<jd.h2> r2 = p171jd.C3518h2.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/ToolUpliftFragmentBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.C3518h2 mo115i(android.view.LayoutInflater r11, android.view.ViewGroup r12, java.lang.Boolean r13) {
                r10 = this;
                android.view.LayoutInflater r11 = (android.view.LayoutInflater) r11
                android.view.ViewGroup r12 = (android.view.ViewGroup) r12
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                java.lang.String r0 = "p0"
                p214m2.C4339q.m9706k(r11, r0)
                r0 = 2131558689(0x7f0d0121, float:1.87427E38)
                r1 = 0
                android.view.View r11 = r11.inflate(r0, r12, r1)
                if (r13 == 0) goto L1c
                r12.addView(r11)
            L1c:
                r12 = 2131361945(0x7f0a0099, float:1.8343657E38)
                android.view.View r13 = p064e.C1494h.m4055f(r11, r12)
                r2 = r13
                com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
                if (r2 == 0) goto L86
                r12 = 2131361981(0x7f0a00bd, float:1.834373E38)
                android.view.View r13 = p064e.C1494h.m4055f(r11, r12)
                r3 = r13
                androidx.appcompat.widget.AppCompatImageView r3 = (androidx.appcompat.widget.AppCompatImageView) r3
                if (r3 == 0) goto L86
                r12 = 2131362225(0x7f0a01b1, float:1.8344225E38)
                android.view.View r13 = p064e.C1494h.m4055f(r11, r12)
                r4 = r13
                com.google.android.material.card.MaterialCardView r4 = (com.google.android.material.card.MaterialCardView) r4
                if (r4 == 0) goto L86
                r12 = 2131362262(0x7f0a01d6, float:1.83443E38)
                android.view.View r13 = p064e.C1494h.m4055f(r11, r12)
                r5 = r13
                com.google.android.material.imageview.ShapeableImageView r5 = (com.google.android.material.imageview.ShapeableImageView) r5
                if (r5 == 0) goto L86
                r12 = 2131362500(0x7f0a02c4, float:1.8344782E38)
                android.view.View r13 = p064e.C1494h.m4055f(r11, r12)
                r6 = r13
                com.google.android.material.progressindicator.CircularProgressIndicator r6 = (com.google.android.material.progressindicator.CircularProgressIndicator) r6
                if (r6 == 0) goto L86
                r12 = 2131362637(0x7f0a034d, float:1.834506E38)
                android.view.View r13 = p064e.C1494h.m4055f(r11, r12)
                r7 = r13
                androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
                if (r7 == 0) goto L86
                r12 = 2131362710(0x7f0a0396, float:1.8345208E38)
                android.view.View r13 = p064e.C1494h.m4055f(r11, r12)
                r8 = r13
                androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
                if (r8 == 0) goto L86
                r12 = 2131362749(0x7f0a03bd, float:1.8345287E38)
                android.view.View r13 = p064e.C1494h.m4055f(r11, r12)
                r9 = r13
                androidx.appcompat.widget.AppCompatTextView r9 = (androidx.appcompat.widget.AppCompatTextView) r9
                if (r9 == 0) goto L86
                jd.h2 r12 = new jd.h2
                r1 = r11
                androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
                r0 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return r12
            L86:
                android.content.res.Resources r11 = r11.getResources()
                java.lang.String r11 = r11.getResourceName(r12)
                java.lang.NullPointerException r12 = new java.lang.NullPointerException
                java.lang.String r13 = "Missing required view with ID: "
                java.lang.String r11 = r13.concat(r11)
                r12.<init>(r11)
                throw r12
        }
    }

    /* renamed from: og.b$g */
    public static final class g extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ p258og.C5265b f20443Z;

        public g(p258og.C5265b r1) {
                r0 = this;
                r0.f20443Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                og.b r0 = r1.f20443Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    public C5265b() {
            r4 = this;
            r4.<init>()
            r0 = 1
            r4.f20435m1 = r0
            og.b$g r0 = new og.b$g
            r0.<init>(r4)
            og.b$d r1 = new og.b$d
            r1.<init>(r4)
            java.lang.Class<og.d> r2 = p258og.C5267d.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            og.b$e r3 = new og.b$e
            r3.<init>(r1)
            ch.d r0 = androidx.fragment.app.C0420z0.m1404a(r4, r2, r3, r0)
            r4.f20436n1 = r0
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: L0 */
    public void mo108L0() {
            r4 = this;
            og.d r0 = r4.m11518P0()
            androidx.lifecycle.LiveData<java.lang.Double> r0 = r0.f20451h
            androidx.lifecycle.v r1 = r4.m1311O()
            og.a r2 = new og.a
            r3 = 0
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            og.d r0 = r4.m11518P0()
            androidx.lifecycle.LiveData<java.lang.Double> r0 = r0.f20453j
            androidx.lifecycle.v r1 = r4.m1311O()
            og.a r2 = new og.a
            r3 = 1
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            og.d r0 = r4.m11518P0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f20454k
            androidx.lifecycle.v r1 = r4.m1311O()
            og.a r2 = new og.a
            r3 = 2
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            og.d r0 = r4.m11518P0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f20449f
            androidx.lifecycle.v r1 = r4.m1311O()
            og.a r2 = new og.a
            r3 = 3
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            og.d r0 = r4.m11518P0()
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r0.f20455l
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            og.b$a r3 = new og.b$a
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            og.d r0 = r4.m11518P0()
            androidx.lifecycle.d0<vg.b<ch.l>> r0 = r0.f20456m
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            og.b$b r3 = new og.b$b
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
            jd.h2 r0 = (p171jd.C3518h2) r0
            androidx.appcompat.widget.AppCompatImageView r1 = r0.f15217c
            gg.a r2 = new gg.a
            r2.<init>(r5)
            r1.setOnClickListener(r2)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f15221g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            io.tacocrypto.app.ui.secret.c r3 = io.tacocrypto.app.p156ui.secret.EnumC3251c.f14349p0
            java.lang.String r4 = " Tool"
            p206le.C4271b.m9585a(r3, r2, r4, r1)
            com.google.android.material.imageview.ShapeableImageView r1 = r0.f15218d
            java.lang.String r2 = "imageView"
            p214m2.C4339q.m9705j(r1, r2)
            java.lang.String r2 = "https://assets.tacostudios.io/logo/upliftium.png"
            vg.C6672m.m13521h(r1, r2)
            com.google.android.material.button.MaterialButton r0 = r0.f15216b
            java.lang.String r1 = "buttonClaim"
            p214m2.C4339q.m9705j(r0, r1)
            r1 = 0
            og.b$c r2 = new og.b$c
            r2.<init>(r5)
            r3 = 1
            vg.C6664e.m13509j(r0, r1, r2, r3)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: N0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3518h2> mo110N0() {
            r2 = this;
            og.b$f r0 = p258og.C5265b.f.f20442g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    @Override // td.AbstractC6218f
    /* renamed from: O0 */
    public boolean mo111O0() {
            r1 = this;
            boolean r0 = r1.f20435m1
            return r0
    }

    /* renamed from: P0 */
    public final p258og.C5267d m11518P0() {
            r1 = this;
            ch.d r0 = r1.f20436n1
            java.lang.Object r0 = r0.getValue()
            og.d r0 = (p258og.C5267d) r0
            return r0
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r1) {
            r0 = this;
            super.mo114V(r1)
            og.d r1 = r0.m11518P0()
            r1.m11523h()
            return
    }
}
