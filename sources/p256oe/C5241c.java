package p256oe;

/* renamed from: oe.c */
/* loaded from: classes.dex */
public final class C5241c extends td.AbstractC6218f<p171jd.AbstractC3571x0> {

    /* renamed from: p1 */
    public static final /* synthetic */ int f20358p1 = 0;

    /* renamed from: m1 */
    public final boolean f20359m1;

    /* renamed from: n1 */
    public final ch.InterfaceC0977d f20360n1;

    /* renamed from: o1 */
    public final ch.InterfaceC0977d f20361o1;

    /* renamed from: oe.c$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<me.C4595c> {

        /* renamed from: Z */
        public final /* synthetic */ p256oe.C5241c f20362Z;

        public a(p256oe.C5241c r1) {
                r0 = this;
                r0.f20362Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public me.C4595c mo15e() {
                r2 = this;
                oe.c r0 = r2.f20362Z
                android.os.Bundle r0 = r0.m1332r0()
                java.lang.String r1 = "poolDataWithMy"
                java.io.Serializable r0 = r0.getSerializable(r1)
                java.lang.String r1 = "null cannot be cast to non-null type io.tacocrypto.app.ui.tools.alcor.model.PoolDataWithMy"
                java.util.Objects.requireNonNull(r0, r1)
                me.c r0 = (me.C4595c) r0
                return r0
        }
    }

    /* renamed from: oe.c$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p013ah.C0100a, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p256oe.C5241c f20363Z;

        public b(p256oe.C5241c r1) {
                r0 = this;
                r0.f20363Z = r1
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
                oe.c r0 = r1.f20363Z
                p458zg.C7331c.m14402a(r0, r2)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: oe.c$c */
    public static final class c extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<ch.C0985l, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p256oe.C5241c f20364Z;

        public c(p256oe.C5241c r1) {
                r0 = this;
                r0.f20364Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(ch.C0985l r2) {
                r1 = this;
                ch.l r2 = (ch.C0985l) r2
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r2, r0)
                oe.c r2 = r1.f20364Z
                oe.e r0 = new oe.e
                r0.<init>(r2)
                p458zg.C7331c.m14405d(r2, r0)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: oe.c$d */
    public static final class d implements android.widget.SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        public final /* synthetic */ p256oe.C5241c f20365a;

        public d(p256oe.C5241c r1) {
                r0 = this;
                r0.f20365a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar r7, int r8, boolean r9) {
                r6 = this;
                oe.c r7 = r6.f20365a
                int r9 = p256oe.C5241c.f20358p1
                oe.h r7 = r7.m11510P0()
                androidx.lifecycle.d0<java.lang.String> r9 = r7.f20382j
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                r1 = 37
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r9.mo7l(r0)
                androidx.lifecycle.d0<java.lang.String> r9 = r7.f20381i
                me.c r0 = r7.m11511d()
                double r0 = r0.getTotalMySupplyAmount()
                double r2 = (double) r8
                r4 = 4636737291354636288(0x4059000000000000, double:100.0)
                double r2 = r2 / r4
                double r2 = r2 * r0
                me.c r7 = r7.m11511d()
                int r7 = r7.getPrecision()
                r8 = 0
                r0 = 2
                java.lang.String r7 = vg.C6672m.m13535v(r2, r7, r8, r0)
                r9.mo7l(r7)
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(android.widget.SeekBar r1) {
                r0 = this;
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(android.widget.SeekBar r1) {
                r0 = this;
                return
        }
    }

    /* renamed from: oe.c$e */
    public static final class e extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f20366Z;

        public e(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f20366Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f20366Z
                return r0
        }
    }

    /* renamed from: oe.c$f */
    public static final class f extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f20367Z;

        public f(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f20367Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f20367Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: oe.c$g */
    public /* synthetic */ class g extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.AbstractC3571x0> {

        /* renamed from: g0 */
        public static final p256oe.C5241c.g f20368g0 = null;

        static {
                oe.c$g r0 = new oe.c$g
                r0.<init>()
                p256oe.C5241c.g.f20368g0 = r0
                return
        }

        public g() {
                r6 = this;
                java.lang.Class<jd.x0> r2 = p171jd.AbstractC3571x0.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/ToolAlcorWithdrawFragmentBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.AbstractC3571x0 mo115i(android.view.LayoutInflater r3, android.view.ViewGroup r4, java.lang.Boolean r5) {
                r2 = this;
                android.view.LayoutInflater r3 = (android.view.LayoutInflater) r3
                android.view.ViewGroup r4 = (android.view.ViewGroup) r4
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                java.lang.String r0 = "p0"
                p214m2.C4339q.m9706k(r3, r0)
                int r0 = p171jd.AbstractC3571x0.f15632C
                androidx.databinding.d r0 = androidx.databinding.C0359f.f2019a
                r0 = 2131558657(0x7f0d0101, float:1.8742636E38)
                r1 = 0
                androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.m1048h(r3, r0, r4, r5, r1)
                jd.x0 r3 = (p171jd.AbstractC3571x0) r3
                return r3
        }
    }

    /* renamed from: oe.c$h */
    public static final class h extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ p256oe.C5241c f20369Z;

        public h(p256oe.C5241c r1) {
                r0 = this;
                r0.f20369Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                oe.c r0 = r1.f20369Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    public C5241c() {
            r4 = this;
            r4.<init>()
            r0 = 1
            r4.f20359m1 = r0
            oe.c$h r0 = new oe.c$h
            r0.<init>(r4)
            oe.c$e r1 = new oe.c$e
            r1.<init>(r4)
            java.lang.Class<oe.h> r2 = p256oe.C5246h.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            oe.c$f r3 = new oe.c$f
            r3.<init>(r1)
            ch.d r0 = androidx.fragment.app.C0420z0.m1404a(r4, r2, r3, r0)
            r4.f20360n1 = r0
            oe.c$a r0 = new oe.c$a
            r0.<init>(r4)
            ch.d r0 = p185k7.C4038x4.m9096i(r0)
            r4.f20361o1 = r0
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: L0 */
    public void mo108L0() {
            r4 = this;
            oe.h r0 = r4.m11510P0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f20376d
            androidx.lifecycle.v r1 = r4.m1311O()
            be.c r2 = be.C0736c.f4018c
            r0.m1413f(r1, r2)
            oe.h r0 = r4.m11510P0()
            androidx.lifecycle.d0<java.lang.String> r0 = r0.f20382j
            androidx.lifecycle.v r1 = r4.m1311O()
            oe.b r2 = new oe.b
            r3 = 0
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            oe.h r0 = r4.m11510P0()
            androidx.lifecycle.LiveData<java.lang.String> r0 = r0.f20383k
            androidx.lifecycle.v r1 = r4.m1311O()
            oe.b r2 = new oe.b
            r3 = 1
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            oe.h r0 = r4.m11510P0()
            androidx.lifecycle.LiveData<java.lang.String> r0 = r0.f20384l
            androidx.lifecycle.v r1 = r4.m1311O()
            oe.b r2 = new oe.b
            r3 = 2
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            oe.h r0 = r4.m11510P0()
            androidx.lifecycle.LiveData<me.c> r0 = r0.f20380h
            androidx.lifecycle.v r1 = r4.m1311O()
            oe.b r2 = new oe.b
            r3 = 3
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            oe.h r0 = r4.m11510P0()
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r0.f20377e
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            oe.c$b r3 = new oe.c$b
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            oe.h r0 = r4.m11510P0()
            androidx.lifecycle.d0<vg.b<ch.l>> r0 = r0.f20378f
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            oe.c$c r3 = new oe.c$c
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: M0 */
    public void mo109M0() {
            r4 = this;
            T extends w1.a r0 = r4.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.x0 r0 = (p171jd.AbstractC3571x0) r0
            oe.h r1 = r4.m11510P0()
            r0.mo8014r(r1)
            T extends w1.a r0 = r4.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.x0 r0 = (p171jd.AbstractC3571x0) r0
            androidx.lifecycle.v r1 = r4.m1311O()
            r0.m1060p(r1)
            T extends w1.a r0 = r4.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.x0 r0 = (p171jd.AbstractC3571x0) r0
            androidx.appcompat.widget.AppCompatImageView r1 = r0.f15638u
            oe.a r2 = new oe.a
            r3 = 0
            r2.<init>(r4, r3)
            r1.setOnClickListener(r2)
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f15633A
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            io.tacocrypto.app.ui.secret.c r2 = io.tacocrypto.app.p156ui.secret.EnumC3251c.f14345l0
            java.lang.String r3 = " Tool"
            p206le.C4271b.m9585a(r2, r1, r3, r0)
            T extends w1.a r0 = r4.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.x0 r0 = (p171jd.AbstractC3571x0) r0
            androidx.appcompat.widget.AppCompatSeekBar r0 = r0.f15641x
            oe.c$d r1 = new oe.c$d
            r1.<init>(r4)
            r0.setOnSeekBarChangeListener(r1)
            T extends w1.a r0 = r4.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.x0 r0 = (p171jd.AbstractC3571x0) r0
            com.google.android.material.button.MaterialButton r0 = r0.f15637t
            oe.a r1 = new oe.a
            r2 = 1
            r1.<init>(r4, r2)
            r0.setOnClickListener(r1)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: N0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.AbstractC3571x0> mo110N0() {
            r2 = this;
            oe.c$g r0 = p256oe.C5241c.g.f20368g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    @Override // td.AbstractC6218f
    /* renamed from: O0 */
    public boolean mo111O0() {
            r1 = this;
            boolean r0 = r1.f20359m1
            return r0
    }

    /* renamed from: P0 */
    public final p256oe.C5246h m11510P0() {
            r1 = this;
            ch.d r0 = r1.f20360n1
            java.lang.Object r0 = r0.getValue()
            oe.h r0 = (p256oe.C5246h) r0
            return r0
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r3) {
            r2 = this;
            super.mo114V(r3)
            oe.h r3 = r2.m11510P0()
            ch.d r0 = r2.f20361o1
            java.lang.Object r0 = r0.getValue()
            me.c r0 = (me.C4595c) r0
            java.util.Objects.requireNonNull(r3)
            java.lang.String r1 = "poolDataWithMy"
            p214m2.C4339q.m9706k(r0, r1)
            java.lang.String r1 = "<set-?>"
            p214m2.C4339q.m9706k(r0, r1)
            r3.f20385m = r0
            androidx.lifecycle.d0<me.c> r3 = r3.f20379g
            r3.mo7l(r0)
            return
    }
}
