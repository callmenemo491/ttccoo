package gg;

/* renamed from: gg.e */
/* loaded from: classes.dex */
public final class C2367e extends td.AbstractC6218f<p171jd.C3506e2> {

    /* renamed from: o1 */
    public static final /* synthetic */ int f10694o1 = 0;

    /* renamed from: m1 */
    public final boolean f10695m1;

    /* renamed from: n1 */
    public final ch.InterfaceC0977d f10696n1;

    /* renamed from: gg.e$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.lang.String, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ gg.C2367e f10697Z;

        public a(gg.C2367e r1) {
                r0 = this;
                r0.f10697Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(java.lang.String r3) {
                r2 = this;
                java.lang.String r3 = (java.lang.String) r3
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r3, r0)
                gg.e r0 = r2.f10697Z
                gg.d r1 = new gg.d
                r1.<init>(r3, r0)
                p458zg.C7331c.m14405d(r0, r1)
                ch.l r3 = ch.C0985l.f5061a
                return r3
        }
    }

    /* renamed from: gg.e$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p013ah.C0100a, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ gg.C2367e f10698Z;

        public b(gg.C2367e r1) {
                r0 = this;
                r0.f10698Z = r1
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
                gg.e r0 = r1.f10698Z
                p458zg.C7331c.m14402a(r0, r2)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: gg.e$c */
    public static final class c extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ gg.C2367e f10699Z;

        public c(gg.C2367e r1) {
                r0 = this;
                r0.f10699Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r3) {
                r2 = this;
                android.view.View r3 = (android.view.View) r3
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r3, r0)
                gg.e r3 = r2.f10699Z
                int r0 = gg.C2367e.f10694o1
                gg.g r3 = r3.m6102Q0()
                gg.e r0 = r2.f10699Z
                android.content.Context r0 = r0.m1334s0()
                r1 = 0
                r3.m6107h(r0, r1)
                ch.l r3 = ch.C0985l.f5061a
                return r3
        }
    }

    /* renamed from: gg.e$d */
    public static final class d extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ gg.C2367e f10700Z;

        public d(gg.C2367e r1) {
                r0 = this;
                r0.f10700Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r8) {
                r7 = this;
                android.view.View r8 = (android.view.View) r8
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r8, r0)
                gg.e r8 = r7.f10700Z
                int r0 = gg.C2367e.f10694o1
                gg.g r8 = r8.m6102Q0()
                gg.e r0 = r7.f10700Z
                android.content.Context r0 = r0.m1334s0()
                java.util.Objects.requireNonNull(r8)
                java.lang.String r1 = "context"
                p214m2.C4339q.m9706k(r0, r1)
                gg.i r1 = new gg.i
                r1.<init>(r8, r0)
                nd.b0 r0 = r8.f10708c
                id.b r0 = r0.m10795h()
                if (r0 != 0) goto L2b
                goto L6c
            L2b:
                androidx.lifecycle.d0<java.lang.Boolean> r2 = r8.f10714i
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                r2.mo7l(r3)
                h2.j r2 = new h2.j
                r3 = 0
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                nd.v0 r5 = p238nd.C4781v0.f19121e
                java.lang.String r6 = "Please for EndpointManager us initialize() before getting the instance."
                java.util.Objects.requireNonNull(r5, r6)
                p214m2.C4339q.m9704i(r5)
                java.lang.String r5 = r5.m10837a()
                r4.append(r5)
                java.lang.String r5 = "/v1/assets?owner="
                r4.append(r5)
                java.lang.String r0 = r0.f12559a
                java.lang.String r5 = "&collection_name=rplanet&schema_name=lands%2Clands2%2Clands3&page=1&limit=1000&order=desc&sort=asset_id"
                java.lang.String r0 = p346u.C6269n.m12888a(r4, r0, r5)
                pe.h r4 = new pe.h
                r4.<init>(r8, r1)
                wd.g r1 = new wd.g
                r1.<init>(r8)
                r2.<init>(r3, r0, r4, r1)
                g2.o r8 = r8.m6108i()
                r8.m5814a(r2)
            L6c:
                ch.l r8 = ch.C0985l.f5061a
                return r8
        }
    }

    /* renamed from: gg.e$e */
    public static final class e extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public static final gg.C2367e.e f10701Z = null;

        static {
                gg.e$e r0 = new gg.e$e
                r0.<init>()
                gg.C2367e.e.f10701Z = r0
                return
        }

        public e() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r2) {
                r1 = this;
                android.view.View r2 = (android.view.View) r2
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r2, r0)
                android.content.Context r2 = r2.getContext()
                java.lang.String r0 = "it.context"
                p214m2.C4339q.m9705j(r2, r0)
                java.lang.String r0 = "https://rplanet.io/staking"
                vg.C6672m.m13528o(r2, r0)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: gg.e$f */
    public static final class f extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f10702Z;

        public f(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f10702Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f10702Z
                return r0
        }
    }

    /* renamed from: gg.e$g */
    public static final class g extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f10703Z;

        public g(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f10703Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f10703Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: gg.e$h */
    public /* synthetic */ class h extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3506e2> {

        /* renamed from: g0 */
        public static final gg.C2367e.h f10704g0 = null;

        static {
                gg.e$h r0 = new gg.e$h
                r0.<init>()
                gg.C2367e.h.f10704g0 = r0
                return
        }

        public h() {
                r6 = this;
                java.lang.Class<jd.e2> r2 = p171jd.C3506e2.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/ToolRplanetFragmentBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.C3506e2 mo115i(android.view.LayoutInflater r28, android.view.ViewGroup r29, java.lang.Boolean r30) {
                r27 = this;
                r0 = r28
                android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
                r1 = r29
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                r2 = r30
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                java.lang.String r3 = "p0"
                p214m2.C4339q.m9706k(r0, r3)
                r3 = 2131558686(0x7f0d011e, float:1.8742695E38)
                r4 = 0
                android.view.View r0 = r0.inflate(r3, r1, r4)
                if (r2 == 0) goto L22
                r1.addView(r0)
            L22:
                r1 = 2131361945(0x7f0a0099, float:1.8343657E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r5 = r2
                com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
                if (r5 == 0) goto L141
                r1 = 2131361946(0x7f0a009a, float:1.8343659E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r6 = r2
                com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
                if (r6 == 0) goto L141
                r1 = 2131361955(0x7f0a00a3, float:1.8343677E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r7 = r2
                com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
                if (r7 == 0) goto L141
                r1 = 2131361981(0x7f0a00bd, float:1.834373E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r8 = r2
                androidx.appcompat.widget.AppCompatImageView r8 = (androidx.appcompat.widget.AppCompatImageView) r8
                if (r8 == 0) goto L141
                r1 = 2131361985(0x7f0a00c1, float:1.8343738E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                if (r2 == 0) goto L141
                jd.d0 r9 = p171jd.C3500d0.m7975d(r2)
                r1 = 2131362033(0x7f0a00f1, float:1.8343835E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r10 = r2
                androidx.appcompat.widget.AppCompatTextView r10 = (androidx.appcompat.widget.AppCompatTextView) r10
                if (r10 == 0) goto L141
                r1 = 2131362133(0x7f0a0155, float:1.8344038E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                if (r2 == 0) goto L141
                jd.d0 r11 = p171jd.C3500d0.m7975d(r2)
                r1 = 2131362218(0x7f0a01aa, float:1.834421E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r12 = r2
                android.widget.GridLayout r12 = (android.widget.GridLayout) r12
                if (r12 == 0) goto L141
                r1 = 2131362225(0x7f0a01b1, float:1.8344225E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r13 = r2
                com.google.android.material.card.MaterialCardView r13 = (com.google.android.material.card.MaterialCardView) r13
                if (r13 == 0) goto L141
                r1 = 2131362258(0x7f0a01d2, float:1.8344292E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r14 = r2
                com.google.android.material.imageview.ShapeableImageView r14 = (com.google.android.material.imageview.ShapeableImageView) r14
                if (r14 == 0) goto L141
                r1 = 2131362260(0x7f0a01d4, float:1.8344296E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r15 = r2
                androidx.appcompat.widget.AppCompatImageView r15 = (androidx.appcompat.widget.AppCompatImageView) r15
                if (r15 == 0) goto L141
                r1 = 2131362261(0x7f0a01d5, float:1.8344298E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r16 = r2
                com.google.android.material.imageview.ShapeableImageView r16 = (com.google.android.material.imageview.ShapeableImageView) r16
                if (r16 == 0) goto L141
                r1 = 2131362347(0x7f0a022b, float:1.8344472E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r17 = r2
                androidx.appcompat.widget.AppCompatTextView r17 = (androidx.appcompat.widget.AppCompatTextView) r17
                if (r17 == 0) goto L141
                r1 = 2131362348(0x7f0a022c, float:1.8344474E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r18 = r2
                androidx.appcompat.widget.AppCompatTextView r18 = (androidx.appcompat.widget.AppCompatTextView) r18
                if (r18 == 0) goto L141
                r1 = 2131362532(0x7f0a02e4, float:1.8344847E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r19 = r2
                androidx.appcompat.widget.AppCompatTextView r19 = (androidx.appcompat.widget.AppCompatTextView) r19
                if (r19 == 0) goto L141
                r1 = 2131362533(0x7f0a02e5, float:1.834485E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r20 = r2
                androidx.appcompat.widget.AppCompatTextView r20 = (androidx.appcompat.widget.AppCompatTextView) r20
                if (r20 == 0) goto L141
                r1 = 2131362544(0x7f0a02f0, float:1.8344872E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r21 = r2
                com.google.android.material.card.MaterialCardView r21 = (com.google.android.material.card.MaterialCardView) r21
                if (r21 == 0) goto L141
                r1 = 2131362646(0x7f0a0356, float:1.8345078E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r22 = r2
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r22 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r22
                if (r22 == 0) goto L141
                r1 = 2131362710(0x7f0a0396, float:1.8345208E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r23 = r2
                androidx.appcompat.widget.AppCompatTextView r23 = (androidx.appcompat.widget.AppCompatTextView) r23
                if (r23 == 0) goto L141
                r1 = 2131362749(0x7f0a03bd, float:1.8345287E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r24 = r2
                androidx.appcompat.widget.AppCompatTextView r24 = (androidx.appcompat.widget.AppCompatTextView) r24
                if (r24 == 0) goto L141
                r1 = 2131362769(0x7f0a03d1, float:1.8345328E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                if (r2 == 0) goto L141
                jd.d0 r25 = p171jd.C3500d0.m7975d(r2)
                r1 = 2131362772(0x7f0a03d4, float:1.8345334E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                if (r2 == 0) goto L141
                jd.d0 r26 = p171jd.C3500d0.m7975d(r2)
                jd.e2 r1 = new jd.e2
                r3 = r1
                r4 = r0
                androidx.appcompat.widget.LinearLayoutCompat r4 = (androidx.appcompat.widget.LinearLayoutCompat) r4
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                return r1
            L141:
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r0 = r0.getResourceName(r1)
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "Missing required view with ID: "
                java.lang.String r0 = r2.concat(r0)
                r1.<init>(r0)
                throw r1
        }
    }

    /* renamed from: gg.e$i */
    public static final class i extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ gg.C2367e f10705Z;

        public i(gg.C2367e r1) {
                r0 = this;
                r0.f10705Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                gg.e r0 = r1.f10705Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    public C2367e() {
            r4 = this;
            r4.<init>()
            r0 = 1
            r4.f10695m1 = r0
            gg.e$i r0 = new gg.e$i
            r0.<init>(r4)
            gg.e$f r1 = new gg.e$f
            r1.<init>(r4)
            java.lang.Class<gg.g> r2 = gg.C2369g.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            gg.e$g r3 = new gg.e$g
            r3.<init>(r1)
            ch.d r0 = androidx.fragment.app.C0420z0.m1404a(r4, r2, r3, r0)
            r4.f10696n1 = r0
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: L0 */
    public void mo108L0() {
            r4 = this;
            gg.g r0 = r4.m6102Q0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f10711f
            androidx.lifecycle.v r1 = r4.m1311O()
            gg.b r2 = new gg.b
            r3 = 0
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            gg.g r0 = r4.m6102Q0()
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r0.f10714i
            androidx.lifecycle.v r1 = r4.m1311O()
            gg.b r2 = new gg.b
            r3 = 1
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            gg.g r0 = r4.m6102Q0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f10718m
            androidx.lifecycle.v r1 = r4.m1311O()
            gg.b r2 = new gg.b
            r3 = 2
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            gg.g r0 = r4.m6102Q0()
            androidx.lifecycle.d0<java.lang.Double> r0 = r0.f10712g
            androidx.lifecycle.v r1 = r4.m1311O()
            gg.b r2 = new gg.b
            r3 = 3
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            gg.g r0 = r4.m6102Q0()
            androidx.lifecycle.d0<java.lang.Double> r0 = r0.f10713h
            androidx.lifecycle.v r1 = r4.m1311O()
            gg.b r2 = new gg.b
            r3 = 4
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            gg.g r0 = r4.m6102Q0()
            androidx.lifecycle.d0<java.lang.Double> r0 = r0.f10716k
            androidx.lifecycle.v r1 = r4.m1311O()
            gg.b r2 = new gg.b
            r3 = 5
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            gg.g r0 = r4.m6102Q0()
            androidx.lifecycle.d0<java.lang.Long> r0 = r0.f10717l
            androidx.lifecycle.v r1 = r4.m1311O()
            gg.b r2 = new gg.b
            r3 = 6
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            gg.g r0 = r4.m6102Q0()
            androidx.lifecycle.d0<java.util.List<od.h0>> r0 = r0.f10715j
            androidx.lifecycle.v r1 = r4.m1311O()
            gg.b r2 = new gg.b
            r3 = 7
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            gg.g r0 = r4.m6102Q0()
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r0.f10719n
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            gg.e$b r3 = new gg.e$b
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            gg.g r0 = r4.m6102Q0()
            androidx.lifecycle.d0<vg.b<java.lang.String>> r0 = r0.f10720o
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            gg.e$a r3 = new gg.e$a
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
            jd.e2 r0 = (p171jd.C3506e2) r0
            androidx.appcompat.widget.AppCompatImageView r1 = r0.f15126e
            gg.a r2 = new gg.a
            r2.<init>(r5)
            r1.setOnClickListener(r2)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f15136o
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 2131951965(0x7f13015d, float:1.954036E38)
            java.lang.String r3 = r5.m1309M(r3)
            r2.append(r3)
            java.lang.String r3 = " Tool"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.setText(r2)
            T extends w1.a r1 = r5.f24168k1
            p214m2.C4339q.m9704i(r1)
            jd.e2 r1 = (p171jd.C3506e2) r1
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1 = r1.f15135n
            of.e r2 = new of.e
            r2.<init>(r5)
            r1.setOnRefreshListener(r2)
            com.google.android.material.button.MaterialButton r1 = r0.f15123b
            java.lang.String r2 = "buttonClaim"
            p214m2.C4339q.m9705j(r1, r2)
            gg.e$c r2 = new gg.e$c
            r2.<init>(r5)
            r3 = 0
            r4 = 1
            vg.C6664e.m13509j(r1, r3, r2, r4)
            com.google.android.material.button.MaterialButton r1 = r0.f15124c
            java.lang.String r2 = "buttonClaimLands"
            p214m2.C4339q.m9705j(r1, r2)
            gg.e$d r2 = new gg.e$d
            r2.<init>(r5)
            vg.C6664e.m13509j(r1, r3, r2, r4)
            com.google.android.material.button.MaterialButton r1 = r0.f15125d
            java.lang.String r2 = "buttonIncrease"
            p214m2.C4339q.m9705j(r1, r2)
            gg.e$e r2 = gg.C2367e.e.f10701Z
            vg.C6664e.m13509j(r1, r3, r2, r4)
            com.google.android.material.imageview.ShapeableImageView r1 = r0.f15130i
            java.lang.String r2 = "imageToken"
            p214m2.C4339q.m9705j(r1, r2)
            io.tacocrypto.app.a r2 = io.tacocrypto.app.EnumC3199a.f14220e0
            java.lang.String r3 = p097fd.C2139a.m5697a(r2)
            vg.C6672m.m13521h(r1, r3)
            androidx.appcompat.widget.AppCompatImageView r1 = r0.f15131j
            java.lang.String r3 = "imageToken2"
            p214m2.C4339q.m9705j(r1, r3)
            java.lang.String r3 = p097fd.C2139a.m5697a(r2)
            vg.C6672m.m13521h(r1, r3)
            com.google.android.material.imageview.ShapeableImageView r0 = r0.f15132k
            java.lang.String r1 = "imageToken3"
            p214m2.C4339q.m9705j(r0, r1)
            java.lang.String r1 = p097fd.C2139a.m5697a(r2)
            vg.C6672m.m13521h(r0, r1)
            T extends w1.a r0 = r5.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.e2 r0 = (p171jd.C3506e2) r0
            jd.d0 r0 = r0.f15127f
            java.lang.Object r0 = r0.f15081c
            com.google.android.material.imageview.ShapeableImageView r0 = (com.google.android.material.imageview.ShapeableImageView) r0
            java.lang.String r1 = "binding.caponium.imageView"
            p214m2.C4339q.m9705j(r0, r1)
            io.tacocrypto.app.a r1 = io.tacocrypto.app.EnumC3199a.f14221f0
            java.lang.String r1 = p097fd.C2139a.m5697a(r1)
            vg.C6672m.m13521h(r0, r1)
            T extends w1.a r0 = r5.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.e2 r0 = (p171jd.C3506e2) r0
            jd.d0 r0 = r0.f15129h
            java.lang.Object r0 = r0.f15081c
            com.google.android.material.imageview.ShapeableImageView r0 = (com.google.android.material.imageview.ShapeableImageView) r0
            java.lang.String r1 = "binding.enefterium.imageView"
            p214m2.C4339q.m9705j(r0, r1)
            io.tacocrypto.app.a r1 = io.tacocrypto.app.EnumC3199a.f14224i0
            java.lang.String r1 = p097fd.C2139a.m5697a(r1)
            vg.C6672m.m13521h(r0, r1)
            T extends w1.a r0 = r5.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.e2 r0 = (p171jd.C3506e2) r0
            jd.d0 r0 = r0.f15138q
            java.lang.Object r0 = r0.f15081c
            com.google.android.material.imageview.ShapeableImageView r0 = (com.google.android.material.imageview.ShapeableImageView) r0
            java.lang.String r1 = "binding.waxon.imageView"
            p214m2.C4339q.m9705j(r0, r1)
            io.tacocrypto.app.a r1 = io.tacocrypto.app.EnumC3199a.f14223h0
            java.lang.String r1 = p097fd.C2139a.m5697a(r1)
            vg.C6672m.m13521h(r0, r1)
            T extends w1.a r0 = r5.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.e2 r0 = (p171jd.C3506e2) r0
            jd.d0 r0 = r0.f15139r
            java.lang.Object r0 = r0.f15081c
            com.google.android.material.imageview.ShapeableImageView r0 = (com.google.android.material.imageview.ShapeableImageView) r0
            java.lang.String r1 = "binding.wecan.imageView"
            p214m2.C4339q.m9705j(r0, r1)
            io.tacocrypto.app.a r1 = io.tacocrypto.app.EnumC3199a.f14222g0
            java.lang.String r1 = p097fd.C2139a.m5697a(r1)
            vg.C6672m.m13521h(r0, r1)
            T extends w1.a r0 = r5.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.e2 r0 = (p171jd.C3506e2) r0
            jd.d0 r0 = r0.f15127f
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f15083e
            java.lang.String r1 = "caponium"
            r0.setText(r1)
            T extends w1.a r0 = r5.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.e2 r0 = (p171jd.C3506e2) r0
            jd.d0 r0 = r0.f15129h
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f15083e
            java.lang.String r1 = "enefterium"
            r0.setText(r1)
            T extends w1.a r0 = r5.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.e2 r0 = (p171jd.C3506e2) r0
            jd.d0 r0 = r0.f15138q
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f15083e
            java.lang.String r1 = "waxon"
            r0.setText(r1)
            T extends w1.a r0 = r5.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.e2 r0 = (p171jd.C3506e2) r0
            jd.d0 r0 = r0.f15139r
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f15083e
            java.lang.String r1 = "wecan"
            r0.setText(r1)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: N0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3506e2> mo110N0() {
            r2 = this;
            gg.e$h r0 = gg.C2367e.h.f10704g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    @Override // td.AbstractC6218f
    /* renamed from: O0 */
    public boolean mo111O0() {
            r1 = this;
            boolean r0 = r1.f10695m1
            return r0
    }

    /* renamed from: P0 */
    public final java.lang.String m6101P0(java.lang.Double r6) {
            r5 = this;
            if (r6 == 0) goto L19
            double r0 = r6.doubleValue()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto Ld
            goto L19
        Ld:
            double r0 = r6.doubleValue()
            r6 = 1
            r2 = 0
            r3 = 2
            java.lang.String r6 = vg.C6672m.m13535v(r0, r6, r2, r3)
            goto L1b
        L19:
            java.lang.String r6 = "---"
        L1b:
            return r6
    }

    /* renamed from: Q0 */
    public final gg.C2369g m6102Q0() {
            r1 = this;
            ch.d r0 = r1.f10696n1
            java.lang.Object r0 = r0.getValue()
            gg.g r0 = (gg.C2369g) r0
            return r0
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r2) {
            r1 = this;
            super.mo114V(r2)
            gg.g r2 = r1.m6102Q0()
            r2.m6109j()
            android.os.CountDownTimer r0 = r2.f10721p
            if (r0 == 0) goto L11
            r0.cancel()
        L11:
            gg.a0 r0 = new gg.a0
            r0.<init>(r2)
            android.os.CountDownTimer r0 = r0.start()
            r2.f10721p = r0
            return
    }
}
