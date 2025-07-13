package p360ue;

/* renamed from: ue.b */
/* loaded from: classes.dex */
public final class C6401b extends td.AbstractC6218f<p171jd.C3493b1> implements p416xe.InterfaceC7046d, ve.InterfaceC6655d {

    /* renamed from: q1 */
    public static final /* synthetic */ int f24901q1 = 0;

    /* renamed from: m1 */
    public final boolean f24902m1;

    /* renamed from: n1 */
    public final ch.InterfaceC0977d f24903n1;

    /* renamed from: o1 */
    public final p020b3.C0660b f24904o1;

    /* renamed from: p1 */
    public final p360ue.C6412g0 f24905p1;

    /* renamed from: ue.b$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p360ue.C6404c0, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p360ue.C6401b f24906Z;

        public a(p360ue.C6401b r1) {
                r0 = this;
                r0.f24906Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(p360ue.C6404c0 r10) {
                r9 = this;
                ue.c0 r10 = (p360ue.C6404c0) r10
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r10, r0)
                ue.b r0 = r9.f24906Z
                int r1 = p360ue.C6401b.f24901q1
                ue.b0 r0 = r0.m13025P0()
                ue.b r1 = r9.f24906Z
                android.content.Context r1 = r1.m1334s0()
                java.util.Objects.requireNonNull(r0)
                java.lang.String r2 = "context"
                p214m2.C4339q.m9706k(r1, r2)
                java.lang.String r3 = "brawlerUI"
                p214m2.C4339q.m9706k(r10, r3)
                nd.b0 r3 = r0.f24916c
                java.lang.String r10 = r10.f24942d0
                ue.x r4 = new ue.x
                r4.<init>(r0)
                java.util.Objects.requireNonNull(r3)
                p214m2.C4339q.m9706k(r1, r2)
                java.lang.String r0 = "slot_id"
                p214m2.C4339q.m9706k(r10, r0)
                java.lang.String r0 = "completion"
                p214m2.C4339q.m9706k(r4, r0)
                r3.f18918n = r4
                id.b r0 = r3.m10795h()
                if (r0 != 0) goto L44
                goto L7c
            L44:
                java.lang.String r2 = r0.f12559a
                int r4 = r2.length()
                r5 = 1
                if (r4 != 0) goto L4f
                r4 = 1
                goto L50
            L4f:
                r4 = 0
            L50:
                if (r4 != 0) goto L7f
                one.block.eosiojava.models.rpcProvider.Authorization r4 = new one.block.eosiojava.models.rpcProvider.Authorization
                java.lang.String r6 = r3.f18911g
                r4.<init>(r2, r6)
                b3.b r6 = new b3.b
                r6.<init>(r5)
                nd.w0 r5 = new nd.w0
                pd.p r7 = new pd.p
                r7.<init>(r2, r10)
                java.util.List r10 = p074e9.C1805a.m4528m(r4)
                java.lang.String r2 = "bcbrawlers"
                java.lang.String r8 = "brawl"
                r5.<init>(r2, r8, r7, r10)
                r6.m2208c(r5)
                nd.a r10 = p238nd.EnumC4724a.f18863V0
                r6.m2209d(r10, r4)
                r10 = 0
                r3.m10804r(r1, r0, r6, r10)
            L7c:
                ch.l r10 = ch.C0985l.f5061a
                return r10
            L7f:
                java.lang.Exception r10 = new java.lang.Exception
                java.lang.String r0 = "USER_NOT_SIGNED"
                r10.<init>(r0)
                throw r10
        }
    }

    /* renamed from: ue.b$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p360ue.C6404c0, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p360ue.C6401b f24907Z;

        public b(p360ue.C6401b r1) {
                r0 = this;
                r0.f24907Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(p360ue.C6404c0 r5) {
                r4 = this;
                ue.c0 r5 = (p360ue.C6404c0) r5
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r5, r0)
                ue.b r0 = r4.f24907Z
                androidx.fragment.app.d0 r0 = r0.m1337u()
                java.lang.String r1 = "childFragmentManager"
                p214m2.C4339q.m9705j(r0, r1)
                java.lang.String r1 = "fragmentManager"
                p214m2.C4339q.m9706k(r0, r1)
                java.lang.String r1 = "brawlerUI"
                p214m2.C4339q.m9706k(r5, r1)
                ve.a r2 = new ve.a
                r2.<init>()
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                r3.putSerializable(r1, r5)
                r2.m1344x0(r3)
                r5 = 0
                r2.mo1229K0(r0, r5)
                ch.l r5 = ch.C0985l.f5061a
                return r5
        }
    }

    /* renamed from: ue.b$c */
    public static final class c extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<ch.C0981h<? extends java.lang.Boolean, ? extends java.lang.Double, ? extends java.lang.Float>, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p360ue.C6401b f24908Z;

        public c(p360ue.C6401b r1) {
                r0 = this;
                r0.f24908Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(ch.C0981h<? extends java.lang.Boolean, ? extends java.lang.Double, ? extends java.lang.Float> r8) {
                r7 = this;
                ch.h r8 = (ch.C0981h) r8
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r8, r0)
                ue.b r0 = r7.f24908Z
                androidx.fragment.app.d0 r0 = r0.m1337u()
                java.lang.String r1 = "childFragmentManager"
                p214m2.C4339q.m9705j(r0, r1)
                A r1 = r8.f5057Y
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                B r2 = r8.f5058Z
                java.lang.Number r2 = (java.lang.Number) r2
                double r2 = r2.doubleValue()
                C r8 = r8.f5059a0
                java.lang.Number r8 = (java.lang.Number) r8
                float r8 = r8.floatValue()
                java.lang.String r4 = "fragmentManager"
                p214m2.C4339q.m9706k(r0, r4)
                xe.a r4 = new xe.a
                r4.<init>()
                android.os.Bundle r5 = new android.os.Bundle
                r5.<init>()
                java.lang.String r6 = "isDeposit"
                r5.putBoolean(r6, r1)
                java.lang.String r1 = "deposited"
                r5.putDouble(r1, r2)
                java.lang.String r1 = "fee"
                r5.putFloat(r1, r8)
                r4.m1344x0(r5)
                r8 = 0
                r4.mo1229K0(r0, r8)
                ch.l r8 = ch.C0985l.f5061a
                return r8
        }
    }

    /* renamed from: ue.b$d */
    public static final class d extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p013ah.C0100a, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p360ue.C6401b f24909Z;

        public d(p360ue.C6401b r1) {
                r0 = this;
                r0.f24909Z = r1
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
                ue.b r0 = r1.f24909Z
                p458zg.C7331c.m14402a(r0, r2)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: ue.b$e */
    public static final class e extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p360ue.C6401b f24910Z;

        public e(p360ue.C6401b r1) {
                r0 = this;
                r0.f24910Z = r1
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
                ue.b r2 = r1.f24910Z
                int r0 = p360ue.C6401b.f24901q1
                ue.b0 r2 = r2.m13025P0()
                r0 = 1
                r2.m13035k(r0)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: ue.b$f */
    public static final class f extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p360ue.C6401b f24911Z;

        public f(p360ue.C6401b r1) {
                r0 = this;
                r0.f24911Z = r1
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
                ue.b r2 = r1.f24911Z
                int r0 = p360ue.C6401b.f24901q1
                ue.b0 r2 = r2.m13025P0()
                r0 = 0
                r2.m13035k(r0)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: ue.b$g */
    public static final class g extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f24912Z;

        public g(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f24912Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f24912Z
                return r0
        }
    }

    /* renamed from: ue.b$h */
    public static final class h extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f24913Z;

        public h(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f24913Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f24913Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: ue.b$i */
    public /* synthetic */ class i extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3493b1> {

        /* renamed from: g0 */
        public static final p360ue.C6401b.i f24914g0 = null;

        static {
                ue.b$i r0 = new ue.b$i
                r0.<init>()
                p360ue.C6401b.i.f24914g0 = r0
                return
        }

        public i() {
                r6 = this;
                java.lang.Class<jd.b1> r2 = p171jd.C3493b1.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/ToolBcbrawlersFragmentBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.C3493b1 mo115i(android.view.LayoutInflater r18, android.view.ViewGroup r19, java.lang.Boolean r20) {
                r17 = this;
                r0 = r18
                android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
                r1 = r19
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                r2 = r20
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                java.lang.String r3 = "p0"
                p214m2.C4339q.m9706k(r0, r3)
                r3 = 2131558660(0x7f0d0104, float:1.8742642E38)
                r4 = 0
                android.view.View r0 = r0.inflate(r3, r1, r4)
                if (r2 == 0) goto L22
                r1.addView(r0)
            L22:
                r1 = 2131361894(0x7f0a0066, float:1.8343553E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r5 = r2
                com.google.android.material.appbar.AppBarLayout r5 = (com.google.android.material.appbar.AppBarLayout) r5
                if (r5 == 0) goto Lbe
                r1 = 2131361923(0x7f0a0083, float:1.8343612E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r6 = r2
                io.tacocrypto.app.utils.view.BlockParentScrollLayout r6 = (io.tacocrypto.app.utils.view.BlockParentScrollLayout) r6
                if (r6 == 0) goto Lbe
                r1 = 2131361951(0x7f0a009f, float:1.8343669E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r7 = r2
                com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
                if (r7 == 0) goto Lbe
                r1 = 2131361971(0x7f0a00b3, float:1.834371E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r8 = r2
                com.google.android.material.button.MaterialButton r8 = (com.google.android.material.button.MaterialButton) r8
                if (r8 == 0) goto Lbe
                r1 = 2131361981(0x7f0a00bd, float:1.834373E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r9 = r2
                androidx.appcompat.widget.AppCompatImageView r9 = (androidx.appcompat.widget.AppCompatImageView) r9
                if (r9 == 0) goto Lbe
                r1 = 2131362093(0x7f0a012d, float:1.8343957E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                if (r2 == 0) goto Lbe
                jd.d0 r10 = p171jd.C3500d0.m7975d(r2)
                r1 = 2131362127(0x7f0a014f, float:1.8344026E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r11 = r2
                androidx.appcompat.widget.AppCompatTextView r11 = (androidx.appcompat.widget.AppCompatTextView) r11
                if (r11 == 0) goto Lbe
                r1 = 2131362225(0x7f0a01b1, float:1.8344225E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r12 = r2
                com.google.android.material.card.MaterialCardView r12 = (com.google.android.material.card.MaterialCardView) r12
                if (r12 == 0) goto Lbe
                r1 = 2131362298(0x7f0a01fa, float:1.8344373E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r13 = r2
                androidx.recyclerview.widget.RecyclerView r13 = (androidx.recyclerview.widget.RecyclerView) r13
                if (r13 == 0) goto Lbe
                r1 = 2131362500(0x7f0a02c4, float:1.8344782E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r14 = r2
                com.google.android.material.progressindicator.CircularProgressIndicator r14 = (com.google.android.material.progressindicator.CircularProgressIndicator) r14
                if (r14 == 0) goto Lbe
                r1 = 2131362710(0x7f0a0396, float:1.8345208E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r15 = r2
                androidx.appcompat.widget.AppCompatTextView r15 = (androidx.appcompat.widget.AppCompatTextView) r15
                if (r15 == 0) goto Lbe
                r1 = 2131362717(0x7f0a039d, float:1.8345222E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r16 = r2
                androidx.appcompat.widget.LinearLayoutCompat r16 = (androidx.appcompat.widget.LinearLayoutCompat) r16
                if (r16 == 0) goto Lbe
                jd.b1 r1 = new jd.b1
                r4 = r0
                androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return r1
            Lbe:
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r0 = r0.getResourceName(r1)
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "Missing required view with ID: "
                java.lang.String r0 = r2.concat(r0)
                r1.<init>(r0)
                throw r1
        }
    }

    /* renamed from: ue.b$j */
    public static final class j extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ p360ue.C6401b f24915Z;

        public j(p360ue.C6401b r1) {
                r0 = this;
                r0.f24915Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                ue.b r0 = r1.f24915Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    public C6401b() {
            r4 = this;
            r4.<init>()
            r0 = 1
            r4.f24902m1 = r0
            ue.b$j r0 = new ue.b$j
            r0.<init>(r4)
            ue.b$g r1 = new ue.b$g
            r1.<init>(r4)
            java.lang.Class<ue.b0> r2 = p360ue.C6402b0.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            ue.b$h r3 = new ue.b$h
            r3.<init>(r1)
            ch.d r0 = androidx.fragment.app.C0420z0.m1404a(r4, r2, r3, r0)
            r4.f24903n1 = r0
            b3.b r0 = new b3.b
            r1 = 2
            r0.<init>(r1)
            r4.f24904o1 = r0
            ue.g0 r1 = new ue.g0
            ue.b$a r2 = new ue.b$a
            r2.<init>(r4)
            ue.b$b r3 = new ue.b$b
            r3.<init>(r4)
            r1.<init>(r0, r2, r3)
            r4.f24905p1 = r1
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: L0 */
    public void mo108L0() {
            r4 = this;
            ue.b0 r0 = r4.m13025P0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f24919f
            androidx.lifecycle.v r1 = r4.m1311O()
            ue.a r2 = new ue.a
            r3 = 0
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            ue.b0 r0 = r4.m13025P0()
            androidx.lifecycle.LiveData<java.lang.Double> r0 = r0.f24923j
            androidx.lifecycle.v r1 = r4.m1311O()
            ue.a r2 = new ue.a
            r3 = 1
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            ue.b0 r0 = r4.m13025P0()
            androidx.lifecycle.LiveData<java.util.List<ue.c0>> r0 = r0.f24921h
            androidx.lifecycle.v r1 = r4.m1311O()
            ue.a r2 = new ue.a
            r3 = 2
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            ue.b0 r0 = r4.m13025P0()
            androidx.lifecycle.d0<vg.b<ch.h<java.lang.Boolean, java.lang.Double, java.lang.Float>>> r0 = r0.f24925l
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            ue.b$c r3 = new ue.b$c
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            ue.b0 r0 = r4.m13025P0()
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r0.f24924k
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            ue.b$d r3 = new ue.b$d
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
            jd.b1 r0 = (p171jd.C3493b1) r0
            androidx.appcompat.widget.AppCompatImageView r1 = r0.f15030d
            ud.a r2 = new ud.a
            r2.<init>(r5)
            r1.setOnClickListener(r2)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f15034h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            io.tacocrypto.app.ui.secret.c r3 = io.tacocrypto.app.p156ui.secret.EnumC3251c.f14337d0
            java.lang.String r4 = " Tool"
            p206le.C4271b.m9585a(r3, r2, r4, r1)
            jd.d0 r1 = r0.f15031e
            java.lang.Object r1 = r1.f15081c
            com.google.android.material.imageview.ShapeableImageView r1 = (com.google.android.material.imageview.ShapeableImageView) r1
            java.lang.String r2 = "depositBRWL.imageView"
            p214m2.C4339q.m9705j(r1, r2)
            io.tacocrypto.app.a r2 = io.tacocrypto.app.EnumC3199a.f14241z0
            java.lang.String r2 = p097fd.C2139a.m5697a(r2)
            vg.C6672m.m13521h(r1, r2)
            jd.d0 r1 = r0.f15031e
            androidx.appcompat.widget.AppCompatTextView r1 = r1.f15083e
            java.lang.String r2 = "BRWL"
            r1.setText(r2)
            com.google.android.material.button.MaterialButton r1 = r0.f15028b
            java.lang.String r2 = "buttonDeposit"
            p214m2.C4339q.m9705j(r1, r2)
            ue.b$e r2 = new ue.b$e
            r2.<init>(r5)
            r3 = 0
            r4 = 1
            vg.C6664e.m13509j(r1, r3, r2, r4)
            com.google.android.material.button.MaterialButton r1 = r0.f15029c
            java.lang.String r2 = "buttonWithdraw"
            p214m2.C4339q.m9705j(r1, r2)
            ue.b$f r2 = new ue.b$f
            r2.<init>(r5)
            vg.C6664e.m13509j(r1, r3, r2, r4)
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15032f
            ue.g0 r1 = r5.f24905p1
            r0.setAdapter(r1)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: N0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3493b1> mo110N0() {
            r2 = this;
            ue.b$i r0 = p360ue.C6401b.i.f24914g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    @Override // td.AbstractC6218f
    /* renamed from: O0 */
    public boolean mo111O0() {
            r1 = this;
            boolean r0 = r1.f24902m1
            return r0
    }

    /* renamed from: P0 */
    public final p360ue.C6402b0 m13025P0() {
            r1 = this;
            ch.d r0 = r1.f24903n1
            java.lang.Object r0 = r0.getValue()
            ue.b0 r0 = (p360ue.C6402b0) r0
            return r0
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r1) {
            r0 = this;
            super.mo114V(r1)
            ue.b0 r1 = r0.m13025P0()
            r1.m13034j()
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: X */
    public void mo1318X() {
            r1 = this;
            r0 = 1
            r1.f2258A0 = r0
            b3.b r0 = r1.f24904o1
            r0.m2210e()
            return
    }

    @Override // td.AbstractC6213a, androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: Y */
    public void mo1231Y() {
            r1 = this;
            super.mo1231Y()
            b3.b r0 = r1.f24904o1
            r0.m2210e()
            return
    }

    @Override // p416xe.InterfaceC7046d
    /* renamed from: g */
    public void mo13026g(boolean r17, double r18) {
            r16 = this;
            ue.b0 r0 = r16.m13025P0()
            android.content.Context r1 = r16.m1334s0()
            java.util.Objects.requireNonNull(r0)
            java.lang.String r2 = "context"
            p214m2.C4339q.m9706k(r1, r2)
            r7 = 2
            r5 = 4
            r6 = 0
            if (r17 == 0) goto L34
            od.r r2 = new od.r
            r3 = r18
            java.lang.String r10 = vg.C6672m.m13535v(r3, r5, r6, r7)
            java.lang.String r9 = "bcbrawlers"
            java.lang.String r11 = "BRWL"
            java.lang.String r12 = ""
            java.lang.String r13 = "brawlertoken"
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13)
            nd.b0 r3 = r0.f24916c
            ue.z r4 = new ue.z
            r4.<init>(r0)
            r3.m10806t(r1, r2, r4)
            goto L9c
        L34:
            r3 = r18
            nd.b0 r10 = r0.f24916c
            float r11 = r0.f24926m
            ue.a0 r8 = new ue.a0
            r8.<init>(r0)
            java.util.Objects.requireNonNull(r10)
            p214m2.C4339q.m9706k(r1, r2)
            java.lang.String r0 = "completion"
            p214m2.C4339q.m9706k(r8, r0)
            r10.f18918n = r8
            id.b r0 = r10.m10795h()
            if (r0 != 0) goto L53
            goto L9c
        L53:
            java.lang.String r2 = r0.f12559a
            int r8 = r2.length()
            r9 = 1
            if (r8 != 0) goto L5e
            r8 = 1
            goto L5f
        L5e:
            r8 = 0
        L5f:
            if (r8 != 0) goto L9d
            one.block.eosiojava.models.rpcProvider.Authorization r12 = new one.block.eosiojava.models.rpcProvider.Authorization
            java.lang.String r8 = r10.f18911g
            r12.<init>(r2, r8)
            b3.b r13 = new b3.b
            r13.<init>(r9)
            nd.w0 r14 = new nd.w0
            pd.t r15 = new pd.t
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = " BRWL"
            r3 = r18
            java.lang.String r3 = p238nd.C4786y.m10840a(r3, r5, r6, r7, r8, r9)
            java.lang.String r4 = java.lang.String.valueOf(r11)
            r15.<init>(r2, r3, r4)
            java.util.List r2 = p074e9.C1805a.m4528m(r12)
            java.lang.String r3 = "bcbrawlers"
            java.lang.String r4 = "wdrawbrwl"
            r14.<init>(r3, r4, r15, r2)
            r13.m2208c(r14)
            nd.a r2 = p238nd.EnumC4724a.f18864W0
            r13.m2209d(r2, r12)
            r2 = 0
            r10.m10804r(r1, r0, r13, r2)
        L9c:
            return
        L9d:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "USER_NOT_SIGNED"
            r0.<init>(r1)
            throw r0
    }

    @Override // ve.InterfaceC6655d
    /* renamed from: i */
    public void mo13027i(java.lang.String r9, java.lang.String r10) {
            r8 = this;
            java.lang.String r0 = "brawlerId"
            p214m2.C4339q.m9706k(r9, r0)
            ue.b0 r0 = r8.m13025P0()
            android.content.Context r1 = r8.m1334s0()
            java.util.Objects.requireNonNull(r0)
            nd.b0 r2 = r0.f24916c
            ue.y r3 = new ue.y
            r3.<init>(r0)
            java.util.Objects.requireNonNull(r2)
            r2.f18918n = r3
            id.b r0 = r2.m10795h()
            if (r0 != 0) goto L23
            goto L5d
        L23:
            java.lang.String r3 = r0.f12559a
            int r4 = r3.length()
            r5 = 1
            if (r4 != 0) goto L2e
            r4 = 1
            goto L2f
        L2e:
            r4 = 0
        L2f:
            if (r4 != 0) goto L5e
            one.block.eosiojava.models.rpcProvider.Authorization r4 = new one.block.eosiojava.models.rpcProvider.Authorization
            java.lang.String r6 = r2.f18911g
            r4.<init>(r3, r6)
            b3.b r6 = new b3.b
            r6.<init>(r5)
            nd.w0 r5 = new nd.w0
            pd.r r7 = new pd.r
            r7.<init>(r3, r9, r10)
            java.util.List r9 = p074e9.C1805a.m4528m(r4)
            java.lang.String r10 = "bcbrawlers"
            java.lang.String r3 = "heal"
            r5.<init>(r10, r3, r7, r9)
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r9 = r6.f3814a
            r9.add(r5)
            nd.a r9 = p238nd.EnumC4724a.f18865X0
            r6.m2209d(r9, r4)
            r9 = 0
            r2.m10804r(r1, r0, r6, r9)
        L5d:
            return
        L5e:
            java.lang.Exception r9 = new java.lang.Exception
            java.lang.String r10 = "USER_NOT_SIGNED"
            r9.<init>(r10)
            throw r9
    }
}
