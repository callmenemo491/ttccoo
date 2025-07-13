package p152ig;

/* renamed from: ig.c */
/* loaded from: classes.dex */
public final class C3146c extends td.AbstractC6218f<p171jd.C3510f2> {

    /* renamed from: q1 */
    public static final p152ig.C3146c.b f12587q1 = null;

    /* renamed from: m1 */
    public final boolean f12588m1;

    /* renamed from: n1 */
    public final ch.InterfaceC0977d f12589n1;

    /* renamed from: o1 */
    public final p019b2.InterfaceC0655a<java.lang.Object> f12590o1;

    /* renamed from: p1 */
    public final p019b2.InterfaceC0655a<java.lang.Object> f12591p1;

    /* renamed from: ig.c$a */
    public static final class a extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {
        public a(android.view.View r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* renamed from: ig.c$b */
    public static final class b {
        public b(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public static final java.lang.String m7600a(p152ig.C3146c.b r1, double r2) {
                java.text.DecimalFormat r1 = new java.text.DecimalFormat
                java.lang.String r0 = "0.###"
                r1.<init>(r0)
                java.util.Locale r0 = java.util.Locale.ENGLISH
                java.text.DecimalFormatSymbols r0 = java.text.DecimalFormatSymbols.getInstance(r0)
                r1.setDecimalFormatSymbols(r0)
                java.lang.String r1 = r1.format(r2)
                java.lang.String r2 = "precision.format(this)"
                p214m2.C4339q.m9705j(r1, r2)
                return r1
        }
    }

    /* renamed from: ig.c$c */
    public static final class c extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {
        public c(android.view.View r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* renamed from: ig.c$d */
    public static final class d extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p013ah.C0100a, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p152ig.C3146c f12592Z;

        public d(p152ig.C3146c r1) {
                r0 = this;
                r0.f12592Z = r1
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
                ig.c r0 = r1.f12592Z
                p458zg.C7331c.m14402a(r0, r2)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: ig.c$e */
    public static final class e extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p152ig.C3146c f12593Z;

        public e(p152ig.C3146c r1) {
                r0 = this;
                r0.f12593Z = r1
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
                ig.c r10 = r9.f12593Z
                ig.c$b r0 = p152ig.C3146c.f12587q1
                ig.h r10 = r10.m7599P0()
                ig.c r0 = r9.f12593Z
                android.content.Context r0 = r0.m1334s0()
                java.util.Objects.requireNonNull(r10)
                java.lang.String r1 = "context"
                p214m2.C4339q.m9706k(r0, r1)
                nd.b0 r2 = r10.f12607c
                ig.j r3 = new ig.j
                r3.<init>(r10)
                java.util.Objects.requireNonNull(r2)
                p214m2.C4339q.m9706k(r0, r1)
                java.lang.String r10 = "completion"
                p214m2.C4339q.m9706k(r3, r10)
                r2.f18918n = r3
                id.b r10 = r2.m10795h()
                if (r10 != 0) goto L38
                goto L7e
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
                if (r3 != 0) goto L81
                one.block.eosiojava.models.rpcProvider.Authorization r3 = new one.block.eosiojava.models.rpcProvider.Authorization
                java.lang.String r5 = r2.f18911g
                r3.<init>(r1, r5)
                java.util.List r3 = p074e9.C1805a.m4528m(r3)
                b3.b r5 = new b3.b
                r5.<init>(r4)
                nd.w0 r4 = new nd.w0
                pd.u1 r6 = new pd.u1
                java.lang.String r7 = "4,SHING"
                r6.<init>(r1, r7, r1)
                java.lang.String r7 = "t.taco"
                java.lang.String r8 = "open"
                r4.<init>(r7, r8, r6, r3)
                r5.m2208c(r4)
                nd.w0 r4 = new nd.w0
                pd.w1 r6 = new pd.w1
                r6.<init>(r1)
                java.lang.String r1 = "g.taco"
                java.lang.String r7 = "extrclaim"
                r4.<init>(r1, r7, r6, r3)
                r5.m2208c(r4)
                r1 = 0
                r2.m10804r(r0, r10, r5, r1)
            L7e:
                ch.l r10 = ch.C0985l.f5061a
                return r10
            L81:
                java.lang.Exception r10 = new java.lang.Exception
                java.lang.String r0 = "USER_NOT_SIGNED"
                r10.<init>(r0)
                throw r10
        }
    }

    /* renamed from: ig.c$f */
    public static final class f extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p152ig.C3146c f12594Z;

        public f(p152ig.C3146c r1) {
                r0 = this;
                r0.f12594Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r9) {
                r8 = this;
                android.view.View r9 = (android.view.View) r9
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r9, r0)
                ig.c r9 = r8.f12594Z
                ig.c$b r0 = p152ig.C3146c.f12587q1
                ig.h r9 = r9.m7599P0()
                ig.c r0 = r8.f12594Z
                android.content.Context r0 = r0.m1334s0()
                java.util.Objects.requireNonNull(r9)
                java.lang.String r1 = "context"
                p214m2.C4339q.m9706k(r0, r1)
                java.util.List<java.lang.String> r2 = r9.f12616l
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L45
                androidx.lifecycle.d0<vg.b<ah.a>> r9 = r9.f12615k
                java.lang.String r0 = "Wait"
                zg.d r1 = p458zg.EnumC7332d.f28069a0
                java.lang.String r2 = "title"
                p214m2.C4339q.m9706k(r0, r2)
                java.lang.String r2 = "image"
                p214m2.C4339q.m9706k(r1, r2)
                vg.b r2 = new vg.b
                ah.a r3 = new ah.a
                java.lang.String r4 = "All bonus assets are already staked"
                r3.<init>(r0, r4, r1)
                r2.<init>(r3)
                r9.mo7l(r2)
                goto L9a
            L45:
                nd.b0 r2 = r9.f12607c
                java.util.List<java.lang.String> r3 = r9.f12616l
                ig.c0 r4 = new ig.c0
                r4.<init>(r9)
                java.util.Objects.requireNonNull(r2)
                p214m2.C4339q.m9706k(r0, r1)
                java.lang.String r9 = "bonuses"
                p214m2.C4339q.m9706k(r3, r9)
                java.lang.String r9 = "completion"
                p214m2.C4339q.m9706k(r4, r9)
                r2.f18918n = r4
                id.b r9 = r2.m10795h()
                if (r9 != 0) goto L67
                goto L9a
            L67:
                java.lang.String r1 = r9.f12559a
                int r4 = r1.length()
                r5 = 1
                if (r4 != 0) goto L72
                r4 = 1
                goto L73
            L72:
                r4 = 0
            L73:
                if (r4 != 0) goto L9d
                one.block.eosiojava.models.rpcProvider.Authorization r4 = new one.block.eosiojava.models.rpcProvider.Authorization
                java.lang.String r6 = r2.f18911g
                r4.<init>(r1, r6)
                b3.b r6 = new b3.b
                r6.<init>(r5)
                nd.w0 r5 = new nd.w0
                pd.e2 r7 = new pd.e2
                r7.<init>(r3, r1)
                java.util.List r1 = p074e9.C1805a.m4528m(r4)
                java.lang.String r3 = "g.taco"
                java.lang.String r4 = "stakebonus"
                r5.<init>(r3, r4, r7, r1)
                r6.m2208c(r5)
                r1 = 0
                r2.m10804r(r0, r9, r6, r1)
            L9a:
                ch.l r9 = ch.C0985l.f5061a
                return r9
            L9d:
                java.lang.Exception r9 = new java.lang.Exception
                java.lang.String r0 = "USER_NOT_SIGNED"
                r9.<init>(r0)
                throw r9
        }
    }

    /* renamed from: ig.c$g */
    public static final class g extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p003a2.C0005b, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p152ig.C3146c f12595Z;

        public g(p152ig.C3146c r1) {
                r0 = this;
                r0.f12595Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(p003a2.C0005b r5) {
                r4 = this;
                a2.b r5 = (p003a2.C0005b) r5
                java.lang.String r0 = "$this$setup"
                p214m2.C4339q.m9706k(r5, r0)
                ig.c r0 = r4.f12595Z
                b2.a<java.lang.Object> r0 = r0.f12590o1
                r5.m14b(r0)
                r0 = 2131558625(0x7f0d00e1, float:1.8742571E38)
                java.lang.Class<jg.a> r1 = p173jg.C3609a.class
                java.lang.String r1 = r1.getName()
                e2.d r2 = new e2.d
                r2.<init>(r5, r1)
                java.lang.String r1 = "$this$withItem"
                p214m2.C4339q.m9706k(r2, r1)
                ig.d r1 = p152ig.C3148d.f12602g0
                ig.e r3 = p152ig.C3150e.f12604Z
                r2.mo12c(r1, r3)
                r5.m13a(r0, r2)
                ch.l r5 = ch.C0985l.f5061a
                return r5
        }
    }

    /* renamed from: ig.c$h */
    public static final class h extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p003a2.C0005b, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p152ig.C3146c f12596Z;

        public h(p152ig.C3146c r1) {
                r0 = this;
                r0.f12596Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(p003a2.C0005b r5) {
                r4 = this;
                a2.b r5 = (p003a2.C0005b) r5
                java.lang.String r0 = "$this$setup"
                p214m2.C4339q.m9706k(r5, r0)
                ig.c r0 = r4.f12596Z
                b2.a<java.lang.Object> r0 = r0.f12591p1
                r5.m14b(r0)
                r0 = 2131558625(0x7f0d00e1, float:1.8742571E38)
                java.lang.Class<jg.a> r1 = p173jg.C3609a.class
                java.lang.String r1 = r1.getName()
                e2.d r2 = new e2.d
                r2.<init>(r5, r1)
                java.lang.String r1 = "$this$withItem"
                p214m2.C4339q.m9706k(r2, r1)
                ig.f r1 = p152ig.C3151f.f12605g0
                ig.g r3 = p152ig.C3152g.f12606Z
                r2.mo12c(r1, r3)
                r5.m13a(r0, r2)
                ch.l r5 = ch.C0985l.f5061a
                return r5
        }
    }

    /* renamed from: ig.c$i */
    public static final class i extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f12597Z;

        public i(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f12597Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f12597Z
                return r0
        }
    }

    /* renamed from: ig.c$j */
    public static final class j extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f12598Z;

        public j(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f12598Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f12598Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: ig.c$k */
    public /* synthetic */ class k extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3510f2> {

        /* renamed from: g0 */
        public static final p152ig.C3146c.k f12599g0 = null;

        static {
                ig.c$k r0 = new ig.c$k
                r0.<init>()
                p152ig.C3146c.k.f12599g0 = r0
                return
        }

        public k() {
                r6 = this;
                java.lang.Class<jd.f2> r2 = p171jd.C3510f2.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/ToolTacoUniverseFragmentBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.C3510f2 mo115i(android.view.LayoutInflater r23, android.view.ViewGroup r24, java.lang.Boolean r25) {
                r22 = this;
                r0 = r23
                android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
                r1 = r24
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                r2 = r25
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                java.lang.String r3 = "p0"
                p214m2.C4339q.m9706k(r0, r3)
                r3 = 2131558687(0x7f0d011f, float:1.8742697E38)
                r4 = 0
                android.view.View r0 = r0.inflate(r3, r1, r4)
                if (r2 == 0) goto L22
                r1.addView(r0)
            L22:
                r1 = 2131361923(0x7f0a0083, float:1.8343612E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r5 = r2
                io.tacocrypto.app.utils.view.BlockParentScrollLayout r5 = (io.tacocrypto.app.utils.view.BlockParentScrollLayout) r5
                if (r5 == 0) goto L100
                r1 = 2131361945(0x7f0a0099, float:1.8343657E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r6 = r2
                com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
                if (r6 == 0) goto L100
                r1 = 2131361965(0x7f0a00ad, float:1.8343697E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r7 = r2
                com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
                if (r7 == 0) goto L100
                r1 = 2131361981(0x7f0a00bd, float:1.834373E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r8 = r2
                androidx.appcompat.widget.AppCompatImageView r8 = (androidx.appcompat.widget.AppCompatImageView) r8
                if (r8 == 0) goto L100
                r1 = 2131361989(0x7f0a00c5, float:1.8343746E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                if (r2 == 0) goto L100
                jd.x r9 = p171jd.C3570x.m8011a(r2)
                r1 = 2131361991(0x7f0a00c7, float:1.834375E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                if (r2 == 0) goto L100
                jd.x r10 = p171jd.C3570x.m8011a(r2)
                r1 = 2131362127(0x7f0a014f, float:1.8344026E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r11 = r2
                androidx.appcompat.widget.AppCompatTextView r11 = (androidx.appcompat.widget.AppCompatTextView) r11
                if (r11 == 0) goto L100
                r1 = 2131362225(0x7f0a01b1, float:1.8344225E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r12 = r2
                com.google.android.material.card.MaterialCardView r12 = (com.google.android.material.card.MaterialCardView) r12
                if (r12 == 0) goto L100
                r1 = 2131362258(0x7f0a01d2, float:1.8344292E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r13 = r2
                com.google.android.material.imageview.ShapeableImageView r13 = (com.google.android.material.imageview.ShapeableImageView) r13
                if (r13 == 0) goto L100
                r1 = 2131362297(0x7f0a01f9, float:1.834437E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r14 = r2
                androidx.appcompat.widget.LinearLayoutCompat r14 = (androidx.appcompat.widget.LinearLayoutCompat) r14
                if (r14 == 0) goto L100
                r1 = 2131362299(0x7f0a01fb, float:1.8344375E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r15 = r2
                androidx.recyclerview.widget.RecyclerView r15 = (androidx.recyclerview.widget.RecyclerView) r15
                if (r15 == 0) goto L100
                r1 = 2131362300(0x7f0a01fc, float:1.8344377E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r16 = r2
                androidx.recyclerview.widget.RecyclerView r16 = (androidx.recyclerview.widget.RecyclerView) r16
                if (r16 == 0) goto L100
                r1 = 2131362646(0x7f0a0356, float:1.8345078E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r17 = r2
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r17 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r17
                if (r17 == 0) goto L100
                r1 = 2131362705(0x7f0a0391, float:1.8345198E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                if (r2 == 0) goto L100
                jd.h r18 = p171jd.C3515h.m7986d(r2)
                r1 = 2131362709(0x7f0a0395, float:1.8345206E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                if (r2 == 0) goto L100
                jd.h r19 = p171jd.C3515h.m7986d(r2)
                r1 = 2131362710(0x7f0a0396, float:1.8345208E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r20 = r2
                androidx.appcompat.widget.AppCompatTextView r20 = (androidx.appcompat.widget.AppCompatTextView) r20
                if (r20 == 0) goto L100
                r1 = 2131362749(0x7f0a03bd, float:1.8345287E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r21 = r2
                androidx.appcompat.widget.AppCompatTextView r21 = (androidx.appcompat.widget.AppCompatTextView) r21
                if (r21 == 0) goto L100
                jd.f2 r1 = new jd.f2
                r3 = r1
                r4 = r0
                androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                return r1
            L100:
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r0 = r0.getResourceName(r1)
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "Missing required view with ID: "
                java.lang.String r0 = r2.concat(r0)
                r1.<init>(r0)
                throw r1
        }
    }

    /* renamed from: ig.c$l */
    public static final class l extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ p152ig.C3146c f12600Z;

        public l(p152ig.C3146c r1) {
                r0 = this;
                r0.f12600Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                ig.c r0 = r1.f12600Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    static {
            ig.c$b r0 = new ig.c$b
            r1 = 0
            r0.<init>(r1)
            p152ig.C3146c.f12587q1 = r0
            return
    }

    public C3146c() {
            r4 = this;
            r4.<init>()
            r0 = 1
            r4.f12588m1 = r0
            ig.c$l r0 = new ig.c$l
            r0.<init>(r4)
            ig.c$i r1 = new ig.c$i
            r1.<init>(r4)
            java.lang.Class<ig.h> r2 = p152ig.C3153h.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            ig.c$j r3 = new ig.c$j
            r3.<init>(r1)
            ch.d r0 = androidx.fragment.app.C0420z0.m1404a(r4, r2, r3, r0)
            r4.f12589n1 = r0
            b2.a r0 = p064e.C1492f.m4043c()
            r4.f12590o1 = r0
            b2.a r0 = p064e.C1492f.m4043c()
            r4.f12591p1 = r0
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: L0 */
    public void mo108L0() {
            r4 = this;
            ig.h r0 = r4.m7599P0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f12610f
            androidx.lifecycle.v r1 = r4.m1311O()
            ig.b r2 = new ig.b
            r3 = 0
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            ig.h r0 = r4.m7599P0()
            androidx.lifecycle.LiveData<ig.a> r0 = r0.f12612h
            androidx.lifecycle.v r1 = r4.m1311O()
            ig.b r2 = new ig.b
            r3 = 1
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            ig.h r0 = r4.m7599P0()
            androidx.lifecycle.LiveData<java.lang.Double> r0 = r0.f12614j
            androidx.lifecycle.v r1 = r4.m1311O()
            ig.b r2 = new ig.b
            r3 = 2
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            ig.h r0 = r4.m7599P0()
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r0.f12615k
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            ig.c$d r3 = new ig.c$d
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: M0 */
    public void mo109M0() {
            r6 = this;
            T extends w1.a r0 = r6.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.f2 r0 = (p171jd.C3510f2) r0
            androidx.appcompat.widget.AppCompatImageView r1 = r0.f15155d
            gg.a r2 = new gg.a
            r2.<init>(r6)
            r1.setOnClickListener(r2)
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f15165n
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            io.tacocrypto.app.ui.secret.c r3 = io.tacocrypto.app.p156ui.secret.EnumC3251c.f14335b0
            java.lang.String r4 = " Tool"
            p206le.C4271b.m9585a(r3, r2, r4, r1)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1 = r0.f15162k
            of.e r2 = new of.e
            r2.<init>(r6)
            r1.setOnRefreshListener(r2)
            com.google.android.material.imageview.ShapeableImageView r1 = r0.f15158g
            r2 = 2131231397(0x7f0802a5, float:1.8078874E38)
            r1.setImageResource(r2)
            com.google.android.material.button.MaterialButton r1 = r0.f15153b
            java.lang.String r3 = "buttonClaim"
            p214m2.C4339q.m9705j(r1, r3)
            ig.c$e r3 = new ig.c$e
            r3.<init>(r6)
            r4 = 0
            r5 = 1
            vg.C6664e.m13509j(r1, r4, r3, r5)
            com.google.android.material.button.MaterialButton r0 = r0.f15154c
            java.lang.String r1 = "buttonStakeAll"
            p214m2.C4339q.m9705j(r0, r1)
            ig.c$f r1 = new ig.c$f
            r1.<init>(r6)
            vg.C6664e.m13509j(r0, r4, r1, r5)
            T extends w1.a r0 = r6.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.f2 r0 = (p171jd.C3510f2) r0
            jd.x r0 = r0.f15157f
            java.lang.Object r0 = r0.f15630e
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            r0.setImageResource(r2)
            T extends w1.a r0 = r6.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.f2 r0 = (p171jd.C3510f2) r0
            jd.x r0 = r0.f15156e
            java.lang.Object r0 = r0.f15630e
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            r1 = 2131231017(0x7f080129, float:1.8078103E38)
            r0.setImageResource(r1)
            T extends w1.a r0 = r6.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.f2 r0 = (p171jd.C3510f2) r0
            jd.h r0 = r0.f15164m
            java.lang.Object r2 = r0.f15196d
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            java.lang.String r3 = "Assets"
            r2.setText(r3)
            java.lang.Object r0 = r0.f15195c
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2 = 2131231013(0x7f080125, float:1.8078095E38)
            r0.setImageResource(r2)
            T extends w1.a r0 = r6.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.f2 r0 = (p171jd.C3510f2) r0
            jd.h r0 = r0.f15163l
            java.lang.Object r2 = r0.f15196d
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            java.lang.String r3 = "Bonus claim"
            r2.setText(r3)
            java.lang.Object r0 = r0.f15195c
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageResource(r1)
            T extends w1.a r0 = r6.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.f2 r0 = (p171jd.C3510f2) r0
            jd.x r0 = r0.f15157f
            java.lang.Object r0 = r0.f15628c
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            java.lang.String r1 = "SHING/h"
            r0.setText(r1)
            T extends w1.a r0 = r6.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.f2 r0 = (p171jd.C3510f2) r0
            jd.x r0 = r0.f15156e
            java.lang.Object r0 = r0.f15628c
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            java.lang.String r1 = "total bonus"
            r0.setText(r1)
            T extends w1.a r0 = r6.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.f2 r0 = (p171jd.C3510f2) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15161j
            java.lang.String r1 = "binding.listExtractors"
            p214m2.C4339q.m9705j(r0, r1)
            ig.c$g r1 = new ig.c$g
            r1.<init>(r6)
            p064e.C1487a.m4032j(r0, r1)
            T extends w1.a r0 = r6.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.f2 r0 = (p171jd.C3510f2) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15160i
            java.lang.String r1 = "binding.listBonuses"
            p214m2.C4339q.m9705j(r0, r1)
            ig.c$h r1 = new ig.c$h
            r1.<init>(r6)
            p064e.C1487a.m4032j(r0, r1)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: N0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3510f2> mo110N0() {
            r2 = this;
            ig.c$k r0 = p152ig.C3146c.k.f12599g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    @Override // td.AbstractC6218f
    /* renamed from: O0 */
    public boolean mo111O0() {
            r1 = this;
            boolean r0 = r1.f12588m1
            return r0
    }

    /* renamed from: P0 */
    public final p152ig.C3153h m7599P0() {
            r1 = this;
            ch.d r0 = r1.f12589n1
            java.lang.Object r0 = r0.getValue()
            ig.h r0 = (p152ig.C3153h) r0
            return r0
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r1) {
            r0 = this;
            super.mo114V(r1)
            ig.h r1 = r0.m7599P0()
            r1.m7608k()
            return
    }
}
