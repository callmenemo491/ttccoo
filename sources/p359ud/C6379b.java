package p359ud;

/* renamed from: ud.b */
/* loaded from: classes.dex */
public final class C6379b extends td.AbstractC6213a<p171jd.AbstractC3523j> {

    /* renamed from: o1 */
    public static final /* synthetic */ int f24858o1 = 0;

    /* renamed from: l1 */
    public final ch.InterfaceC0977d f24859l1;

    /* renamed from: m1 */
    public final p019b2.InterfaceC0655a<java.lang.Object> f24860m1;

    /* renamed from: n1 */
    public p359ud.C6379b.b f24861n1;

    /* renamed from: ud.b$a */
    public static final class a extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {
        public a(android.view.View r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* renamed from: ud.b$b */
    public interface b {
        /* renamed from: c */
        void mo2349c(java.lang.String r1);
    }

    /* renamed from: ud.b$c */
    public static final class c extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {

        /* renamed from: u */
        public final p171jd.C3570x f24862u;

        public c(android.view.View r9) {
                r8 = this;
                r8.<init>(r9)
                r0 = 2131361879(0x7f0a0057, float:1.8343523E38)
                android.view.View r1 = p064e.C1494h.m4055f(r9, r0)
                r4 = r1
                androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
                if (r4 == 0) goto L3f
                r0 = 2131362262(0x7f0a01d6, float:1.83443E38)
                android.view.View r1 = p064e.C1494h.m4055f(r9, r0)
                r5 = r1
                androidx.appcompat.widget.AppCompatImageView r5 = (androidx.appcompat.widget.AppCompatImageView) r5
                if (r5 == 0) goto L3f
                r0 = 2131362358(0x7f0a0236, float:1.8344494E38)
                android.view.View r1 = p064e.C1494h.m4055f(r9, r0)
                r6 = r1
                androidx.appcompat.widget.AppCompatImageView r6 = (androidx.appcompat.widget.AppCompatImageView) r6
                if (r6 == 0) goto L3f
                r0 = 2131362710(0x7f0a0396, float:1.8345208E38)
                android.view.View r1 = p064e.C1494h.m4055f(r9, r0)
                r7 = r1
                androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
                if (r7 == 0) goto L3f
                jd.x r0 = new jd.x
                r3 = r9
                androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7)
                r8.f24862u = r0
                return
            L3f:
                android.content.res.Resources r9 = r9.getResources()
                java.lang.String r9 = r9.getResourceName(r0)
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "Missing required view with ID: "
                java.lang.String r9 = r1.concat(r9)
                r0.<init>(r9)
                throw r0
        }
    }

    /* renamed from: ud.b$d */
    public static final class d extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p359ud.C6379b f24863Z;

        public d(p359ud.C6379b r1) {
                r0 = this;
                r0.f24863Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public ch.C0985l mo15e() {
                r2 = this;
                ud.b r0 = r2.f24863Z
                androidx.fragment.app.s r0 = r0.m1333s()
                ud.b r1 = r2.f24863Z
                T extends w1.a r1 = r1.f24168k1
                p214m2.C4339q.m9704i(r1)
                jd.j r1 = (p171jd.AbstractC3523j) r1
                com.google.android.material.textfield.TextInputEditText r1 = r1.f15243s
                vg.C6664e.m13505f(r0, r1)
                ch.l r0 = ch.C0985l.f5061a
                return r0
        }
    }

    /* renamed from: ud.b$e */
    public static final class e extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p003a2.C0005b, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ p359ud.C6379b f24864Z;

        public e(p359ud.C6379b r1) {
                r0 = this;
                r0.f24864Z = r1
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
                ud.b r0 = r4.f24864Z
                b2.a<java.lang.Object> r0 = r0.f24860m1
                r5.m14b(r0)
                r0 = 2131558589(0x7f0d00bd, float:1.8742498E38)
                ud.h r1 = new ud.h
                ud.b r2 = r4.f24864Z
                r1.<init>(r2)
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                java.lang.String r2 = r2.getName()
                e2.d r3 = new e2.d
                r3.<init>(r5, r2)
                r1.mo107b(r3)
                r5.m13a(r0, r3)
                r0 = 2131558598(0x7f0d00c6, float:1.8742516E38)
                ud.p r1 = new ud.p
                ud.b r2 = r4.f24864Z
                r1.<init>(r2)
                java.lang.Class<id.a> r2 = id.C3130a.class
                java.lang.String r2 = r2.getName()
                e2.d r3 = new e2.d
                r3.<init>(r5, r2)
                r1.mo107b(r3)
                r5.m13a(r0, r3)
                ch.l r5 = ch.C0985l.f5061a
                return r5
        }
    }

    /* renamed from: ud.b$f */
    public static final class f extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f24865Z;

        public f(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f24865Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f24865Z
                return r0
        }
    }

    /* renamed from: ud.b$g */
    public static final class g extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f24866Z;

        public g(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f24866Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f24866Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: ud.b$h */
    public /* synthetic */ class h extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.AbstractC3523j> {

        /* renamed from: g0 */
        public static final p359ud.C6379b.h f24867g0 = null;

        static {
                ud.b$h r0 = new ud.b$h
                r0.<init>()
                p359ud.C6379b.h.f24867g0 = r0
                return
        }

        public h() {
                r6 = this;
                java.lang.Class<jd.j> r2 = p171jd.AbstractC3523j.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/ContactsDialogFragmentBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.AbstractC3523j mo115i(android.view.LayoutInflater r3, android.view.ViewGroup r4, java.lang.Boolean r5) {
                r2 = this;
                android.view.LayoutInflater r3 = (android.view.LayoutInflater) r3
                android.view.ViewGroup r4 = (android.view.ViewGroup) r4
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                java.lang.String r0 = "p0"
                p214m2.C4339q.m9706k(r3, r0)
                int r0 = p171jd.AbstractC3523j.f15241v
                androidx.databinding.d r0 = androidx.databinding.C0359f.f2019a
                r0 = 2131558446(0x7f0d002e, float:1.8742208E38)
                r1 = 0
                androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.m1048h(r3, r0, r4, r5, r1)
                jd.j r3 = (p171jd.AbstractC3523j) r3
                return r3
        }
    }

    /* renamed from: ud.b$i */
    public static final class i extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ p359ud.C6379b f24868Z;

        public i(p359ud.C6379b r1) {
                r0 = this;
                r0.f24868Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                ud.b r0 = r1.f24868Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    public C6379b() {
            r4 = this;
            r4.<init>()
            ud.b$i r0 = new ud.b$i
            r0.<init>(r4)
            ud.b$f r1 = new ud.b$f
            r1.<init>(r4)
            java.lang.Class<ud.q> r2 = p359ud.C6394q.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            ud.b$g r3 = new ud.b$g
            r3.<init>(r1)
            ch.d r0 = androidx.fragment.app.C0420z0.m1404a(r4, r2, r3, r0)
            r4.f24859l1 = r0
            b2.a r0 = p064e.C1492f.m4043c()
            r4.f24860m1 = r0
            return
    }

    /* renamed from: P0 */
    public static final void m13021P0(androidx.fragment.app.AbstractC0375d0 r2) {
            ud.b r0 = new ud.b
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0.m1344x0(r1)
            r1 = 0
            r0.mo1229K0(r2, r1)
            return
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l
    /* renamed from: F0 */
    public int mo1224F0() {
            r1 = this;
            r0 = 2132017160(0x7f140008, float:1.967259E38)
            return r0
    }

    @Override // com.google.android.material.bottomsheet.C1135b, p083f.C1930q, androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l
    /* renamed from: G0 */
    public android.app.Dialog mo1225G0(android.os.Bundle r2) {
            r1 = this;
            android.app.Dialog r2 = super.mo1225G0(r2)
            td.e r0 = new td.e
            r0.<init>(r1)
            r2.setOnShowListener(r0)
            return r2
    }

    @Override // td.AbstractC6213a
    /* renamed from: L0 */
    public void mo108L0() {
            r3 = this;
            ud.q r0 = r3.m13022O0()
            androidx.lifecycle.LiveData<java.util.List<id.a>> r0 = r0.f24886e
            androidx.lifecycle.v r1 = r3.m1311O()
            nd.x r2 = new nd.x
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
            jd.j r0 = (p171jd.AbstractC3523j) r0
            ud.q r1 = r6.m13022O0()
            r0.mo7992r(r1)
            T extends w1.a r0 = r6.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.j r0 = (p171jd.AbstractC3523j) r0
            androidx.lifecycle.v r1 = r6.m1311O()
            r0.m1060p(r1)
            T extends w1.a r0 = r6.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.j r0 = (p171jd.AbstractC3523j) r0
            androidx.appcompat.widget.AppCompatImageView r0 = r0.f15242r
            ud.a r1 = new ud.a
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            T extends w1.a r0 = r6.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.j r0 = (p171jd.AbstractC3523j) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15244t
            vg.t r1 = new vg.t
            android.content.Context r2 = r6.m1334s0()
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r3 = "requireContext().applicationContext"
            p214m2.C4339q.m9705j(r2, r3)
            r3 = 2131231394(0x7f0802a2, float:1.8078868E38)
            r4 = 0
            r5 = 4
            r1.<init>(r2, r3, r4, r5)
            r0.m1754g(r1)
            T extends w1.a r0 = r6.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.j r0 = (p171jd.AbstractC3523j) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15244t
            java.lang.String r1 = "binding.list"
            p214m2.C4339q.m9705j(r0, r1)
            ud.b$d r2 = new ud.b$d
            r2.<init>(r6)
            java.lang.String r3 = "<this>"
            p214m2.C4339q.m9706k(r0, r3)
            vg.d r3 = new vg.d
            r3.<init>(r0, r2)
            r0.m1756h(r3)
            T extends w1.a r0 = r6.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.j r0 = (p171jd.AbstractC3523j) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15244t
            fe.a r2 = new fe.a
            android.content.Context r3 = r6.m1334s0()
            android.content.Context r3 = r3.getApplicationContext()
            r4 = 2131165694(0x7f0701fe, float:1.7945612E38)
            r2.<init>(r3, r4)
            r0.m1754g(r2)
            T extends w1.a r0 = r6.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.j r0 = (p171jd.AbstractC3523j) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15244t
            p214m2.C4339q.m9705j(r0, r1)
            ud.b$e r1 = new ud.b$e
            r1.<init>(r6)
            p064e.C1487a.m4032j(r0, r1)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: N0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.AbstractC3523j> mo110N0() {
            r2 = this;
            ud.b$h r0 = p359ud.C6379b.h.f24867g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    /* renamed from: O0 */
    public final p359ud.C6394q m13022O0() {
            r1 = this;
            ch.d r0 = r1.f24859l1
            java.lang.Object r0 = r0.getValue()
            ud.q r0 = (p359ud.C6394q) r0
            return r0
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: T */
    public void mo1230T(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "context"
            p214m2.C4339q.m9706k(r4, r0)
            super.mo1230T(r4)
            androidx.fragment.app.n r0 = r3.f2297s0
            boolean r1 = r0 instanceof p359ud.C6379b.b
            r2 = 0
            if (r1 == 0) goto L17
            boolean r4 = r0 instanceof p359ud.C6379b.b
            if (r4 == 0) goto L20
            r2 = r0
            ud.b$b r2 = (p359ud.C6379b.b) r2
            goto L20
        L17:
            boolean r0 = r4 instanceof p359ud.C6379b.b
            if (r0 == 0) goto L20
            if (r0 == 0) goto L20
            r2 = r4
            ud.b$b r2 = (p359ud.C6379b.b) r2
        L20:
            r3.f24861n1 = r2
            return
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: Z */
    public void mo1232Z() {
            r1 = this;
            super.mo1232Z()
            r0 = 0
            r1.f24861n1 = r0
            return
    }
}
