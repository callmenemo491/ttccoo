package io.tacocrypto.app.p156ui.settings;

/* loaded from: classes.dex */
public final class SettingsFragment extends td.AbstractC6215c<p171jd.C3552r> {

    /* renamed from: Y0 */
    public static final /* synthetic */ int f14359Y0 = 0;

    /* renamed from: V0 */
    public final ch.InterfaceC0977d f14360V0;

    /* renamed from: W0 */
    public final p019b2.InterfaceC0655a<java.lang.Object> f14361W0;

    /* renamed from: X0 */
    public final p019b2.InterfaceC0655a<ch.C0981h<java.lang.String, java.lang.Integer, java.lang.String>> f14362X0;

    /* renamed from: io.tacocrypto.app.ui.settings.SettingsFragment$a */
    public static final class C3252a extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {

        /* renamed from: u */
        public final p171jd.C3500d0 f14363u;

        public C3252a(android.view.View r1) {
                r0 = this;
                r0.<init>(r1)
                jd.d0 r1 = p171jd.C3500d0.m7973a(r1)
                r0.f14363u = r1
                return
        }
    }

    /* renamed from: io.tacocrypto.app.ui.settings.SettingsFragment$b */
    public static final class C3253b extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {
        public C3253b(android.view.View r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* renamed from: io.tacocrypto.app.ui.settings.SettingsFragment$c */
    public static final class C3254c extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p013ah.C0100a, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.settings.SettingsFragment f14364Z;

        public C3254c(io.tacocrypto.app.p156ui.settings.SettingsFragment r1) {
                r0 = this;
                r0.f14364Z = r1
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
                io.tacocrypto.app.ui.settings.SettingsFragment r0 = r1.f14364Z
                p458zg.C7331c.m14402a(r0, r2)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: io.tacocrypto.app.ui.settings.SettingsFragment$d */
    public static final class C3255d extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.lang.Double, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.settings.SettingsFragment f14365Z;

        public C3255d(io.tacocrypto.app.p156ui.settings.SettingsFragment r1) {
                r0 = this;
                r0.f14365Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(java.lang.Double r6) {
                r5 = this;
                java.lang.Number r6 = (java.lang.Number) r6
                double r0 = r6.doubleValue()
                r2 = 0
                r6 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto Lf
                r2 = 1
                goto L10
            Lf:
                r2 = 0
            L10:
                if (r2 == 0) goto L1b
                io.tacocrypto.app.ui.settings.SettingsFragment r0 = r5.f14365Z
                r1 = 2
                java.lang.String r2 = "You have no WAX"
                vg.C6664e.m13512m(r0, r2, r6, r1)
                goto L41
            L1b:
                io.tacocrypto.app.ui.settings.SettingsFragment r6 = r5.f14365Z
                androidx.fragment.app.d0 r6 = r6.m1337u()
                java.lang.String r2 = "childFragmentManager"
                p214m2.C4339q.m9705j(r6, r2)
                java.lang.String r2 = "fragmentManager"
                p214m2.C4339q.m9706k(r6, r2)
                ge.d r2 = new ge.d
                r2.<init>()
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                java.lang.String r4 = "waxBalance"
                r3.putDouble(r4, r0)
                r2.m1344x0(r3)
                r0 = 0
                r2.mo1229K0(r6, r0)
            L41:
                ch.l r6 = ch.C0985l.f5061a
                return r6
        }
    }

    /* renamed from: io.tacocrypto.app.ui.settings.SettingsFragment$e */
    public static final class C3256e extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.lang.Boolean, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.settings.SettingsFragment f14366Z;

        public C3256e(io.tacocrypto.app.p156ui.settings.SettingsFragment r1) {
                r0 = this;
                r0.f14366Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(java.lang.Boolean r3) {
                r2 = this;
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                io.tacocrypto.app.ui.settings.SettingsFragment r0 = r2.f14366Z
                androidx.fragment.app.d0 r0 = r0.m1337u()
                java.lang.String r1 = "childFragmentManager"
                p214m2.C4339q.m9705j(r0, r1)
                tg.C6240a.m12826P0(r0, r3)
                ch.l r3 = ch.C0985l.f5061a
                return r3
        }
    }

    /* renamed from: io.tacocrypto.app.ui.settings.SettingsFragment$f */
    public static final class C3257f extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.settings.SettingsFragment f14367Z;

        public C3257f(io.tacocrypto.app.p156ui.settings.SettingsFragment r1) {
                r0 = this;
                r0.f14367Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r7) {
                r6 = this;
                android.view.View r7 = (android.view.View) r7
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r7, r0)
                io.tacocrypto.app.ui.settings.SettingsFragment r7 = r6.f14367Z
                int r0 = io.tacocrypto.app.p156ui.settings.SettingsFragment.f14359Y0
                fe.j r7 = r7.m7738I0()
                nd.b0 r0 = r7.f9854d
                androidx.lifecycle.LiveData<java.util.List<id.b>> r0 = r0.f18925u
                java.lang.Object r0 = r0.m1411d()
                java.util.List r0 = (java.util.List) r0
                if (r0 != 0) goto L1c
                goto L4f
            L1c:
                java.util.Iterator r0 = r0.iterator()
            L20:
                boolean r1 = r0.hasNext()
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L3b
                java.lang.Object r1 = r0.next()
                r4 = r1
                id.b r4 = (id.C3131b) r4
                od.v0 r4 = r4.f12560b
                od.v0 r5 = p255od.EnumC5234v0.WAX_CLOUD_WALLET
                if (r4 != r5) goto L37
                r4 = 1
                goto L38
            L37:
                r4 = 0
            L38:
                if (r4 == 0) goto L20
                goto L3c
            L3b:
                r1 = 0
            L3c:
                if (r1 == 0) goto L3f
                r2 = 1
            L3f:
                androidx.lifecycle.d0<vg.b<java.lang.Boolean>> r7 = r7.f9864n
                vg.b r0 = new vg.b
                r1 = r2 ^ 1
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0.<init>(r1)
                r7.mo7l(r0)
            L4f:
                ch.l r7 = ch.C0985l.f5061a
                return r7
        }
    }

    /* renamed from: io.tacocrypto.app.ui.settings.SettingsFragment$g */
    public static final class C3258g extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.settings.SettingsFragment f14368Z;

        public C3258g(io.tacocrypto.app.p156ui.settings.SettingsFragment r1) {
                r0 = this;
                r0.f14368Z = r1
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
                io.tacocrypto.app.ui.settings.SettingsFragment r5 = r4.f14368Z
                int r0 = io.tacocrypto.app.p156ui.settings.SettingsFragment.f14359Y0
                fe.j r5 = r5.m7738I0()
                androidx.lifecycle.d0<md.a> r0 = r5.f9873w
                java.lang.Object r0 = r0.m1411d()
                md.a r0 = (md.C4536a) r0
                if (r0 == 0) goto L1e
                java.lang.String r0 = r0.getCoreLiquidBalance()
                goto L1f
            L1e:
                r0 = 0
            L1f:
                if (r0 != 0) goto L25
                r5.m5700e()
                goto L49
            L25:
                java.lang.String r1 = " "
                java.lang.String[] r1 = new java.lang.String[]{r1}
                r2 = 6
                r3 = 0
                java.util.List r0 = p362uh.C6467m.m13080k0(r0, r1, r3, r3, r2)
                java.lang.Object r0 = p062dh.C1473i.m3995G(r0)
                java.lang.String r0 = (java.lang.String) r0
                double r0 = java.lang.Double.parseDouble(r0)
                androidx.lifecycle.d0<vg.b<java.lang.Double>> r5 = r5.f9863m
                vg.b r2 = new vg.b
                java.lang.Double r0 = java.lang.Double.valueOf(r0)
                r2.<init>(r0)
                r5.mo7l(r2)
            L49:
                ch.l r5 = ch.C0985l.f5061a
                return r5
        }
    }

    /* renamed from: io.tacocrypto.app.ui.settings.SettingsFragment$h */
    public static final class C3259h extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.settings.SettingsFragment f14369Z;

        public C3259h(io.tacocrypto.app.p156ui.settings.SettingsFragment r1) {
                r0 = this;
                r0.f14369Z = r1
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
                io.tacocrypto.app.ui.settings.SettingsFragment r2 = r1.f14369Z
                android.content.Context r2 = r2.m1334s0()
                java.lang.String r0 = "https://swap.tacocrypto.io/cpu-rent"
                vg.C6672m.m13528o(r2, r0)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: io.tacocrypto.app.ui.settings.SettingsFragment$i */
    public static final class C3260i extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p003a2.C0005b, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.settings.SettingsFragment f14370Z;

        public C3260i(io.tacocrypto.app.p156ui.settings.SettingsFragment r1) {
                r0 = this;
                r0.f14370Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(p003a2.C0005b r8) {
                r7 = this;
                a2.b r8 = (p003a2.C0005b) r8
                java.lang.String r0 = "$this$setup"
                p214m2.C4339q.m9706k(r8, r0)
                io.tacocrypto.app.ui.settings.SettingsFragment r0 = r7.f14370Z
                b2.a<java.lang.Object> r0 = r0.f14361W0
                r8.m14b(r0)
                r0 = 2131558588(0x7f0d00bc, float:1.8742496E38)
                io.tacocrypto.app.ui.settings.SettingsFragment r1 = r7.f14370Z
                java.lang.Class<id.b> r2 = id.C3131b.class
                java.lang.String r2 = r2.getName()
                e2.d r3 = new e2.d
                r3.<init>(r8, r2)
                java.lang.String r2 = "$this$withItem"
                p214m2.C4339q.m9706k(r3, r2)
                io.tacocrypto.app.ui.settings.a r2 = io.tacocrypto.app.p156ui.settings.C3266a.f14376g0
                io.tacocrypto.app.ui.settings.b r4 = io.tacocrypto.app.p156ui.settings.C3267b.f14377Z
                r3.mo12c(r2, r4)
                io.tacocrypto.app.ui.settings.c r2 = io.tacocrypto.app.p156ui.settings.C3268c.f14378e0
                io.tacocrypto.app.ui.settings.d r4 = new io.tacocrypto.app.ui.settings.d
                r4.<init>(r1)
                e2.d r1 = p067e2.C1509b.m4097b(r3)
                java.util.List<e2.d$a<?, ?, ?>> r1 = r1.f7350e
                e2.d$a r5 = new e2.d$a
                java.lang.Class<io.tacocrypto.app.ui.settings.SettingsFragment$a> r6 = io.tacocrypto.app.p156ui.settings.SettingsFragment.C3252a.class
                r5.<init>(r6, r2, r4)
                r1.add(r5)
                r8.m13a(r0, r3)
                ch.l r8 = ch.C0985l.f5061a
                return r8
        }
    }

    /* renamed from: io.tacocrypto.app.ui.settings.SettingsFragment$j */
    public static final class C3261j extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p003a2.C0005b, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.settings.SettingsFragment f14371Z;

        public C3261j(io.tacocrypto.app.p156ui.settings.SettingsFragment r1) {
                r0 = this;
                r0.f14371Z = r1
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
                io.tacocrypto.app.ui.settings.SettingsFragment r0 = r4.f14371Z
                b2.a<ch.h<java.lang.String, java.lang.Integer, java.lang.String>> r0 = r0.f14362X0
                r5.m14b(r0)
                r0 = 2131558607(0x7f0d00cf, float:1.8742535E38)
                io.tacocrypto.app.ui.settings.i r1 = new io.tacocrypto.app.ui.settings.i
                io.tacocrypto.app.ui.settings.SettingsFragment r2 = r4.f14371Z
                r1.<init>(r2)
                java.lang.Class<ch.h> r2 = ch.C0981h.class
                java.lang.String r2 = r2.getName()
                e2.d r3 = new e2.d
                r3.<init>(r5, r2)
                r1.mo107b(r3)
                r5.m13a(r0, r3)
                ch.l r5 = ch.C0985l.f5061a
                return r5
        }
    }

    /* renamed from: io.tacocrypto.app.ui.settings.SettingsFragment$k */
    public static final class C3262k extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f14372Z;

        public C3262k(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f14372Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f14372Z
                return r0
        }
    }

    /* renamed from: io.tacocrypto.app.ui.settings.SettingsFragment$l */
    public static final class C3263l extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f14373Z;

        public C3263l(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f14373Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f14373Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: io.tacocrypto.app.ui.settings.SettingsFragment$m */
    public /* synthetic */ class C3264m extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3552r> {

        /* renamed from: g0 */
        public static final io.tacocrypto.app.p156ui.settings.SettingsFragment.C3264m f14374g0 = null;

        static {
                io.tacocrypto.app.ui.settings.SettingsFragment$m r0 = new io.tacocrypto.app.ui.settings.SettingsFragment$m
                r0.<init>()
                io.tacocrypto.app.p156ui.settings.SettingsFragment.C3264m.f14374g0 = r0
                return
        }

        public C3264m() {
                r6 = this;
                java.lang.Class<jd.r> r2 = p171jd.C3552r.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/FragmentSettingsBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.C3552r mo115i(android.view.LayoutInflater r35, android.view.ViewGroup r36, java.lang.Boolean r37) {
                r34 = this;
                r0 = r35
                android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
                r1 = r36
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                r2 = r37
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                java.lang.String r3 = "p0"
                p214m2.C4339q.m9706k(r0, r3)
                r3 = 2131558484(0x7f0d0054, float:1.8742285E38)
                r4 = 0
                android.view.View r0 = r0.inflate(r3, r1, r4)
                if (r2 == 0) goto L22
                r1.addView(r0)
            L22:
                r1 = 2131361845(0x7f0a0035, float:1.8343454E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r5 = r2
                androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
                if (r5 == 0) goto L198
                r1 = 2131361906(0x7f0a0072, float:1.8343578E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r6 = r2
                androidx.appcompat.widget.AppCompatTextView r6 = (androidx.appcompat.widget.AppCompatTextView) r6
                if (r6 == 0) goto L198
                r1 = 2131361977(0x7f0a00b9, float:1.8343722E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r7 = r2
                com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
                if (r7 == 0) goto L198
                r1 = 2131362054(0x7f0a0106, float:1.8343878E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r8 = r2
                android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
                if (r8 == 0) goto L198
                r1 = 2131362055(0x7f0a0107, float:1.834388E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r9 = r2
                android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
                if (r9 == 0) goto L198
                r1 = 2131362058(0x7f0a010a, float:1.8343886E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r10 = r2
                androidx.appcompat.widget.LinearLayoutCompat r10 = (androidx.appcompat.widget.LinearLayoutCompat) r10
                if (r10 == 0) goto L198
                r1 = 2131362074(0x7f0a011a, float:1.8343918E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                if (r2 == 0) goto L198
                jd.d0 r11 = p171jd.C3500d0.m7974c(r2)
                r1 = 2131362094(0x7f0a012e, float:1.8343959E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r12 = r2
                androidx.appcompat.widget.AppCompatTextView r12 = (androidx.appcompat.widget.AppCompatTextView) r12
                if (r12 == 0) goto L198
                r1 = 2131362095(0x7f0a012f, float:1.834396E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r13 = r2
                androidx.appcompat.widget.AppCompatTextView r13 = (androidx.appcompat.widget.AppCompatTextView) r13
                if (r13 == 0) goto L198
                r1 = 2131362196(0x7f0a0194, float:1.8344166E38)
                android.view.View r14 = p064e.C1494h.m4055f(r0, r1)
                if (r14 == 0) goto L198
                r1 = 2131362239(0x7f0a01bf, float:1.8344253E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r15 = r2
                androidx.appcompat.widget.AppCompatImageView r15 = (androidx.appcompat.widget.AppCompatImageView) r15
                if (r15 == 0) goto L198
                r1 = 2131362242(0x7f0a01c2, float:1.834426E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r16 = r2
                androidx.appcompat.widget.AppCompatImageView r16 = (androidx.appcompat.widget.AppCompatImageView) r16
                if (r16 == 0) goto L198
                r1 = 2131362298(0x7f0a01fa, float:1.8344373E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r17 = r2
                androidx.recyclerview.widget.RecyclerView r17 = (androidx.recyclerview.widget.RecyclerView) r17
                if (r17 == 0) goto L198
                r1 = 2131362302(0x7f0a01fe, float:1.834438E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r18 = r2
                androidx.recyclerview.widget.RecyclerView r18 = (androidx.recyclerview.widget.RecyclerView) r18
                if (r18 == 0) goto L198
                r1 = 2131362459(0x7f0a029b, float:1.83447E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                if (r2 == 0) goto L198
                jd.d0 r19 = p171jd.C3500d0.m7974c(r2)
                r1 = 2131362462(0x7f0a029e, float:1.8344705E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r20 = r2
                androidx.appcompat.widget.AppCompatTextView r20 = (androidx.appcompat.widget.AppCompatTextView) r20
                if (r20 == 0) goto L198
                r1 = 2131362502(0x7f0a02c6, float:1.8344786E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r21 = r2
                com.google.android.material.progressindicator.LinearProgressIndicator r21 = (com.google.android.material.progressindicator.LinearProgressIndicator) r21
                if (r21 == 0) goto L198
                r1 = 2131362504(0x7f0a02c8, float:1.834479E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r22 = r2
                com.google.android.material.progressindicator.LinearProgressIndicator r22 = (com.google.android.material.progressindicator.LinearProgressIndicator) r22
                if (r22 == 0) goto L198
                r1 = 2131362505(0x7f0a02c9, float:1.8344792E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r23 = r2
                com.google.android.material.progressindicator.LinearProgressIndicator r23 = (com.google.android.material.progressindicator.LinearProgressIndicator) r23
                if (r23 == 0) goto L198
                r1 = 2131362516(0x7f0a02d4, float:1.8344815E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                if (r2 == 0) goto L198
                jd.d0 r24 = p171jd.C3500d0.m7974c(r2)
                r1 = 2131362529(0x7f0a02e1, float:1.8344841E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r25 = r2
                com.google.android.material.button.MaterialButton r25 = (com.google.android.material.button.MaterialButton) r25
                if (r25 == 0) goto L198
                r1 = 2131362589(0x7f0a031d, float:1.8344963E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r26 = r2
                com.google.android.material.switchmaterial.SwitchMaterial r26 = (com.google.android.material.switchmaterial.SwitchMaterial) r26
                if (r26 == 0) goto L198
                r1 = 2131362590(0x7f0a031e, float:1.8344965E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r27 = r2
                com.google.android.material.switchmaterial.SwitchMaterial r27 = (com.google.android.material.switchmaterial.SwitchMaterial) r27
                if (r27 == 0) goto L198
                r1 = 2131362591(0x7f0a031f, float:1.8344967E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r28 = r2
                com.google.android.material.switchmaterial.SwitchMaterial r28 = (com.google.android.material.switchmaterial.SwitchMaterial) r28
                if (r28 == 0) goto L198
                r1 = 2131362592(0x7f0a0320, float:1.8344969E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r29 = r2
                com.google.android.material.switchmaterial.SwitchMaterial r29 = (com.google.android.material.switchmaterial.SwitchMaterial) r29
                if (r29 == 0) goto L198
                r1 = 2131362605(0x7f0a032d, float:1.8344995E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r30 = r2
                android.widget.Space r30 = (android.widget.Space) r30
                if (r30 == 0) goto L198
                r1 = 2131362646(0x7f0a0356, float:1.8345078E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r31 = r2
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r31 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r31
                if (r31 == 0) goto L198
                r1 = 2131362710(0x7f0a0396, float:1.8345208E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r32 = r2
                androidx.appcompat.widget.AppCompatTextView r32 = (androidx.appcompat.widget.AppCompatTextView) r32
                if (r32 == 0) goto L198
                r1 = 2131362751(0x7f0a03bf, float:1.8345291E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r33 = r2
                androidx.appcompat.widget.AppCompatTextView r33 = (androidx.appcompat.widget.AppCompatTextView) r33
                if (r33 == 0) goto L198
                jd.r r1 = new jd.r
                r3 = r1
                r4 = r0
                androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
                return r1
            L198:
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r0 = r0.getResourceName(r1)
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "Missing required view with ID: "
                java.lang.String r0 = r2.concat(r0)
                r1.<init>(r0)
                throw r1
        }
    }

    /* renamed from: io.tacocrypto.app.ui.settings.SettingsFragment$n */
    public static final class C3265n extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.settings.SettingsFragment f14375Z;

        public C3265n(io.tacocrypto.app.p156ui.settings.SettingsFragment r1) {
                r0 = this;
                r0.f14375Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                io.tacocrypto.app.ui.settings.SettingsFragment r0 = r1.f14375Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    public SettingsFragment() {
            r4 = this;
            r4.<init>()
            io.tacocrypto.app.ui.settings.SettingsFragment$n r0 = new io.tacocrypto.app.ui.settings.SettingsFragment$n
            r0.<init>(r4)
            io.tacocrypto.app.ui.settings.SettingsFragment$k r1 = new io.tacocrypto.app.ui.settings.SettingsFragment$k
            r1.<init>(r4)
            java.lang.Class<fe.j> r2 = p098fe.C2149j.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            io.tacocrypto.app.ui.settings.SettingsFragment$l r3 = new io.tacocrypto.app.ui.settings.SettingsFragment$l
            r3.<init>(r1)
            ch.d r0 = androidx.fragment.app.C0420z0.m1404a(r4, r2, r3, r0)
            r4.f14360V0 = r0
            b2.a r0 = p064e.C1492f.m4043c()
            r4.f14361W0 = r0
            b2.c r0 = new b2.c
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2)
            r4.f14362X0 = r0
            return
    }

    @Override // td.AbstractC6215c
    /* renamed from: D0 */
    public void mo7720D0() {
            r4 = this;
            fe.j r0 = r4.m7738I0()
            androidx.lifecycle.LiveData<ch.e<id.b, java.lang.Boolean>> r0 = r0.f9860j
            androidx.lifecycle.v r1 = r4.m1311O()
            fe.d r2 = new fe.d
            r3 = 0
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            fe.j r0 = r4.m7738I0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f9862l
            androidx.lifecycle.v r1 = r4.m1311O()
            fe.d r2 = new fe.d
            r3 = 3
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            fe.j r0 = r4.m7738I0()
            androidx.lifecycle.d0<java.lang.String> r0 = r0.f9876z
            androidx.lifecycle.v r1 = r4.m1311O()
            fe.d r2 = new fe.d
            r3 = 4
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            fe.j r0 = r4.m7738I0()
            androidx.lifecycle.d0<java.lang.String> r0 = r0.f9852A
            androidx.lifecycle.v r1 = r4.m1311O()
            fe.d r2 = new fe.d
            r3 = 5
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            fe.j r0 = r4.m7738I0()
            io.tacocrypto.app.database.AppDatabase r0 = r0.f9855e
            hd.d r0 = r0.mo7713p()
            androidx.lifecycle.LiveData r0 = r0.mo7441a()
            androidx.lifecycle.v r1 = r4.m1311O()
            fe.d r2 = new fe.d
            r3 = 6
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            fe.j r0 = r4.m7738I0()
            androidx.lifecycle.d0<vg.b<java.lang.Double>> r0 = r0.f9863m
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            io.tacocrypto.app.ui.settings.SettingsFragment$d r3 = new io.tacocrypto.app.ui.settings.SettingsFragment$d
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            fe.j r0 = r4.m7738I0()
            androidx.lifecycle.d0<vg.b<java.lang.Boolean>> r0 = r0.f9864n
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            io.tacocrypto.app.ui.settings.SettingsFragment$e r3 = new io.tacocrypto.app.ui.settings.SettingsFragment$e
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            fe.j r0 = r4.m7738I0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f9866p
            androidx.lifecycle.v r1 = r4.m1311O()
            fe.d r2 = new fe.d
            r3 = 7
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            fe.j r0 = r4.m7738I0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f9868r
            androidx.lifecycle.v r1 = r4.m1311O()
            fe.d r2 = new fe.d
            r3 = 8
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            fe.j r0 = r4.m7738I0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f9870t
            androidx.lifecycle.v r1 = r4.m1311O()
            fe.d r2 = new fe.d
            r3 = 9
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            fe.j r0 = r4.m7738I0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f9872v
            androidx.lifecycle.v r1 = r4.m1311O()
            fe.d r2 = new fe.d
            r3 = 10
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            fe.j r0 = r4.m7738I0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f9874x
            androidx.lifecycle.v r1 = r4.m1311O()
            fe.d r2 = new fe.d
            r3 = 11
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            fe.j r0 = r4.m7738I0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f9875y
            androidx.lifecycle.v r1 = r4.m1311O()
            fe.d r2 = new fe.d
            r3 = 1
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            fe.j r0 = r4.m7738I0()
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r0.f9853B
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            io.tacocrypto.app.ui.settings.SettingsFragment$c r3 = new io.tacocrypto.app.ui.settings.SettingsFragment$c
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            fe.j r0 = r4.m7738I0()
            androidx.lifecycle.d0<md.a> r0 = r0.f9873w
            androidx.lifecycle.v r1 = r4.m1311O()
            fe.d r2 = new fe.d
            r3 = 2
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            return
    }

    @Override // td.AbstractC6215c
    /* renamed from: F0 */
    public void mo7721F0() {
            r10 = this;
            T extends w1.a r0 = r10.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.r r0 = (p171jd.C3552r) r0
            androidx.appcompat.widget.LinearLayoutCompat r0 = r0.f15463f
            fe.b r1 = new fe.b
            r2 = 0
            r1.<init>(r10, r2)
            r0.setOnClickListener(r1)
            T extends w1.a r0 = r10.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.r r0 = (p171jd.C3552r) r0
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = r0.f15482y
            u3.b r1 = new u3.b
            r1.<init>(r10)
            r0.setOnRefreshListener(r1)
            T extends w1.a r0 = r10.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.r r0 = (p171jd.C3552r) r0
            com.google.android.material.button.MaterialButton r0 = r0.f15460c
            java.lang.String r1 = "binding.buyStakeButton"
            p214m2.C4339q.m9705j(r0, r1)
            io.tacocrypto.app.ui.settings.SettingsFragment$g r1 = new io.tacocrypto.app.ui.settings.SettingsFragment$g
            r1.<init>(r10)
            r3 = 1
            vg.C6664e.m13509j(r0, r2, r1, r3)
            T extends w1.a r0 = r10.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.r r0 = (p171jd.C3552r) r0
            com.google.android.material.button.MaterialButton r0 = r0.f15477t
            java.lang.String r1 = "binding.rentCPUButton"
            p214m2.C4339q.m9705j(r0, r1)
            io.tacocrypto.app.ui.settings.SettingsFragment$h r1 = new io.tacocrypto.app.ui.settings.SettingsFragment$h
            r1.<init>(r10)
            vg.C6664e.m13509j(r0, r2, r1, r3)
            T extends w1.a r0 = r10.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.r r0 = (p171jd.C3552r) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15469l
            java.lang.String r1 = "binding.list"
            p214m2.C4339q.m9705j(r0, r1)
            io.tacocrypto.app.ui.settings.SettingsFragment$i r1 = new io.tacocrypto.app.ui.settings.SettingsFragment$i
            r1.<init>(r10)
            p064e.C1487a.m4032j(r0, r1)
            T extends w1.a r0 = r10.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.r r0 = (p171jd.C3552r) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15470m
            java.lang.String r1 = "binding.listLinks"
            p214m2.C4339q.m9705j(r0, r1)
            io.tacocrypto.app.ui.settings.SettingsFragment$j r1 = new io.tacocrypto.app.ui.settings.SettingsFragment$j
            r1.<init>(r10)
            p064e.C1487a.m4032j(r0, r1)
            T extends w1.a r0 = r10.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.r r0 = (p171jd.C3552r) r0
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.f15481x
            fe.c r1 = new fe.c
            r1.<init>(r10, r2)
            r0.setOnCheckedChangeListener(r1)
            T extends w1.a r0 = r10.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.r r0 = (p171jd.C3552r) r0
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.f15480w
            fe.c r1 = new fe.c
            r1.<init>(r10, r3)
            r0.setOnCheckedChangeListener(r1)
            T extends w1.a r0 = r10.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.r r0 = (p171jd.C3552r) r0
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.f15479v
            fe.c r1 = new fe.c
            r4 = 2
            r1.<init>(r10, r4)
            r0.setOnCheckedChangeListener(r1)
            T extends w1.a r0 = r10.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.r r0 = (p171jd.C3552r) r0
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.f15478u
            fe.c r1 = new fe.c
            r5 = 3
            r1.<init>(r10, r5)
            r0.setOnCheckedChangeListener(r1)
            T extends w1.a r0 = r10.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.r r0 = (p171jd.C3552r) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15469l
            vg.t r1 = new vg.t
            android.content.Context r5 = r10.m1334s0()
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "requireContext().applicationContext"
            p214m2.C4339q.m9705j(r5, r6)
            r7 = 2131231394(0x7f0802a2, float:1.8078868E38)
            r8 = 4
            r1.<init>(r5, r7, r2, r8)
            r0.m1754g(r1)
            T extends w1.a r0 = r10.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.r r0 = (p171jd.C3552r) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15469l
            fe.a r1 = new fe.a
            android.content.Context r5 = r10.m1334s0()
            android.content.Context r5 = r5.getApplicationContext()
            r9 = 2131165694(0x7f0701fe, float:1.7945612E38)
            r1.<init>(r5, r9)
            r0.m1754g(r1)
            T extends w1.a r0 = r10.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.r r0 = (p171jd.C3552r) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15470m
            vg.t r1 = new vg.t
            android.content.Context r5 = r10.m1334s0()
            android.content.Context r5 = r5.getApplicationContext()
            p214m2.C4339q.m9705j(r5, r6)
            r1.<init>(r5, r7, r2, r8)
            r0.m1754g(r1)
            T extends w1.a r0 = r10.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.r r0 = (p171jd.C3552r) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15470m
            fe.a r1 = new fe.a
            android.content.Context r5 = r10.m1334s0()
            android.content.Context r5 = r5.getApplicationContext()
            r1.<init>(r5, r9)
            r0.m1754g(r1)
            T extends w1.a r0 = r10.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.r r0 = (p171jd.C3552r) r0
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f15472o
            fe.b r1 = new fe.b
            r1.<init>(r10, r3)
            r0.setOnClickListener(r1)
            T extends w1.a r0 = r10.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.r r0 = (p171jd.C3552r) r0
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f15459b
            fe.b r1 = new fe.b
            r1.<init>(r10, r4)
            r0.setOnClickListener(r1)
            T extends w1.a r0 = r10.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.r r0 = (p171jd.C3552r) r0
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f15457A
            java.lang.String r1 = "v.1.1.2"
            r0.setText(r1)
            T extends w1.a r0 = r10.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.r r0 = (p171jd.C3552r) r0
            androidx.appcompat.widget.AppCompatImageView r0 = r0.f15467j
            java.lang.String r1 = "binding.iconAdd"
            p214m2.C4339q.m9705j(r0, r1)
            io.tacocrypto.app.ui.settings.SettingsFragment$f r1 = new io.tacocrypto.app.ui.settings.SettingsFragment$f
            r1.<init>(r10)
            vg.C6664e.m13509j(r0, r2, r1, r3)
            return
    }

    @Override // td.AbstractC6215c
    /* renamed from: G0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3552r> mo7722G0() {
            r2 = this;
            io.tacocrypto.app.ui.settings.SettingsFragment$m r0 = io.tacocrypto.app.p156ui.settings.SettingsFragment.C3264m.f14374g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    /* renamed from: H0 */
    public final double m7737H0(double r4, double r6) {
            r3 = this;
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto Le
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto Lf
        Le:
            double r4 = r4 / r6
        Lf:
            return r4
    }

    /* renamed from: I0 */
    public final p098fe.C2149j m7738I0() {
            r1 = this;
            ch.d r0 = r1.f14360V0
            java.lang.Object r0 = r0.getValue()
            fe.j r0 = (p098fe.C2149j) r0
            return r0
    }

    /* renamed from: J0 */
    public final java.lang.String m7739J0(long r9) {
            r8 = this;
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 > 0) goto L9
            java.lang.String r9 = "0"
            return r9
        L9:
            java.lang.String r0 = "B"
            java.lang.String r1 = "KB"
            java.lang.String r2 = "MB"
            java.lang.String r3 = "GB"
            java.lang.String r4 = "TB"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4}
            double r9 = (double) r9
            double r1 = java.lang.Math.log10(r9)
            r3 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r5 = java.lang.Math.log10(r3)
            double r1 = r1 / r5
            int r1 = (int) r1
            java.text.DecimalFormat r2 = new java.text.DecimalFormat
            java.lang.String r5 = "0.##"
            r2.<init>(r5)
            java.util.Locale r5 = java.util.Locale.ENGLISH
            java.text.DecimalFormatSymbols r5 = java.text.DecimalFormatSymbols.getInstance(r5)
            r2.setDecimalFormatSymbols(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            double r6 = (double) r1
            double r3 = java.lang.Math.pow(r3, r6)
            double r9 = r9 / r3
            java.lang.String r9 = r2.format(r9)
            r5.append(r9)
            r9 = 32
            r5.append(r9)
            r9 = r0[r1]
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            return r9
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r7) {
            r6 = this;
            super.mo114V(r7)
            b2.a<ch.h<java.lang.String, java.lang.Integer, java.lang.String>> r0 = r6.f14362X0
            r7 = 7
            ch.h[] r7 = new ch.C0981h[r7]
            ch.h r1 = new ch.h
            r2 = 2131231271(0x7f080227, float:1.8078618E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "Taco Universe App"
            java.lang.String r4 = "https://play.google.com/store/apps/details?id=io.tacocrypto.universe"
            r1.<init>(r3, r2, r4)
            r2 = 0
            r7[r2] = r1
            ch.h r1 = new ch.h
            r2 = 2131231267(0x7f080223, float:1.807861E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "Telegram"
            java.lang.String r4 = "https://t.me/tacowax"
            r1.<init>(r3, r2, r4)
            r2 = 1
            r7[r2] = r1
            ch.h r1 = new ch.h
            r2 = 2131231269(0x7f080225, float:1.8078614E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "Twitter"
            java.lang.String r4 = "https://twitter.com/tacowax"
            r1.<init>(r3, r2, r4)
            r2 = 2
            r7[r2] = r1
            ch.h r1 = new ch.h
            r2 = 2131231033(0x7f080139, float:1.8078136E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "Discord"
            java.lang.String r4 = "https://discord.gg/tacocrypto"
            r1.<init>(r3, r2, r4)
            r2 = 3
            r7[r2] = r1
            ch.h r1 = new ch.h
            r2 = 2131231080(0x7f080168, float:1.807823E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "Instagram"
            java.lang.String r4 = "https://instagram.com/taco.wax/"
            r1.<init>(r3, r2, r4)
            r2 = 4
            r7[r2] = r1
            ch.h r1 = new ch.h
            r2 = 2131231285(0x7f080235, float:1.8078647E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "Website"
            java.lang.String r4 = "https://tacocrypto.io"
            r1.<init>(r3, r2, r4)
            r2 = 5
            r7[r2] = r1
            ch.h r1 = new ch.h
            r2 = 2131231257(0x7f080219, float:1.807859E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "Status Page"
            java.lang.String r4 = "https://status.tacocrypto.io"
            r1.<init>(r3, r2, r4)
            r2 = 6
            r7[r2] = r1
            java.util.List r1 = p074e9.C1805a.m4529n(r7)
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            p019b2.InterfaceC0655a.a.m2204a(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: e0 */
    public void mo1322e0() {
            r5 = this;
            r0 = 1
            r5.f2258A0 = r0
            fe.j r0 = r5.m7738I0()
            androidx.lifecycle.d0<java.lang.Boolean> r1 = r0.f9865o
            nd.j1 r2 = r0.f9856f
            boolean r2 = r2.m10823d()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.mo7l(r2)
            androidx.lifecycle.d0<java.lang.Boolean> r1 = r0.f9867q
            nd.j1 r2 = r0.f9856f
            boolean r2 = r2.m10822c()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.mo7l(r2)
            androidx.lifecycle.d0<java.lang.Boolean> r1 = r0.f9869s
            nd.j1 r2 = r0.f9856f
            boolean r2 = r2.m10821b()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.mo7l(r2)
            androidx.lifecycle.d0<java.lang.Boolean> r1 = r0.f9871u
            nd.j1 r2 = r0.f9856f
            android.content.SharedPreferences r2 = r2.m10820a()
            r3 = 0
            java.lang.String r4 = "showNFTPlayerValue"
            boolean r2 = r2.getBoolean(r4, r3)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.mo7l(r2)
            r0.m5700e()
            return
    }
}
