package io.tacocrypto.app.p156ui.transfer;

/* loaded from: classes.dex */
public final class TransferFragment extends td.AbstractC6215c<p171jd.AbstractC3555s> implements p359ud.C6379b.b, p041ce.InterfaceC0954e {

    /* renamed from: W0 */
    public static final /* synthetic */ int f14509W0 = 0;

    /* renamed from: V0 */
    public final ch.InterfaceC0977d f14510V0;

    /* renamed from: io.tacocrypto.app.ui.transfer.TransferFragment$a */
    public static final class C3359a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.util.List<? extends p255od.C5194b0>, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.transfer.TransferFragment f14511Z;

        public C3359a(io.tacocrypto.app.p156ui.transfer.TransferFragment r1) {
                r0 = this;
                r0.f14511Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(java.util.List<? extends p255od.C5194b0> r6) {
                r5 = this;
                java.util.List r6 = (java.util.List) r6
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r6, r0)
                io.tacocrypto.app.ui.transfer.TransferFragment r0 = r5.f14511Z
                T extends w1.a r0 = r0.f24170U0
                p214m2.C4339q.m9704i(r0)
                jd.s r0 = (p171jd.AbstractC3555s) r0
                androidx.appcompat.widget.AppCompatTextView r0 = r0.f15497B
                java.lang.String r1 = "binding.selectedTokenText"
                p214m2.C4339q.m9705j(r0, r1)
                io.tacocrypto.app.ui.transfer.a r1 = new io.tacocrypto.app.ui.transfer.a
                io.tacocrypto.app.ui.transfer.TransferFragment r2 = r5.f14511Z
                r1.<init>(r2)
                java.lang.String r2 = "anchor"
                p214m2.C4339q.m9706k(r0, r2)
                java.lang.String r2 = "list"
                p214m2.C4339q.m9706k(r6, r2)
                java.lang.String r2 = "callback"
                p214m2.C4339q.m9706k(r1, r2)
                p315rg.C5847c.f22621b = r1
                p315rg.C5847c.f22620a = r6
                androidx.appcompat.widget.j0 r1 = new androidx.appcompat.widget.j0
                android.content.Context r2 = r0.getContext()
                android.content.Context r2 = r2.getApplicationContext()
                r1.<init>(r2)
                android.content.Context r2 = r0.getContext()
                android.content.Context r2 = r2.getApplicationContext()
                java.lang.Object r3 = p046d0.C1259a.f6733a
                r3 = 2131099741(0x7f06005d, float:1.7811844E38)
                android.graphics.drawable.Drawable r2 = p046d0.C1259a.b.m3710b(r2, r3)
                android.widget.PopupWindow r3 = r1.f1351w0
                r3.setBackgroundDrawable(r2)
                rg.b r2 = new rg.b
                android.content.Context r3 = r0.getContext()
                android.content.Context r3 = r3.getApplicationContext()
                java.lang.String r4 = "anchor.context.applicationContext"
                p214m2.C4339q.m9705j(r3, r4)
                r2.<init>(r3, r6)
                r1.f1341m0 = r0
                r1.mo738p(r2)
                r6 = 400(0x190, float:5.6E-43)
                r1.f1331c0 = r6
                wf.d0 r6 = new wf.d0
                r0 = 1
                r6.<init>(r1, r0)
                r1.f1342n0 = r6
                r1.mo475d()
                ch.l r6 = ch.C0985l.f5061a
                return r6
        }
    }

    /* renamed from: io.tacocrypto.app.ui.transfer.TransferFragment$b */
    public static final class C3360b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<ch.C0985l, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.transfer.TransferFragment f14512Z;

        public C3360b(io.tacocrypto.app.p156ui.transfer.TransferFragment r1) {
                r0 = this;
                r0.f14512Z = r1
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
                io.tacocrypto.app.ui.transfer.TransferFragment r2 = r1.f14512Z
                T extends w1.a r2 = r2.f24170U0
                p214m2.C4339q.m9704i(r2)
                jd.s r2 = (p171jd.AbstractC3555s) r2
                com.google.android.material.textfield.MaterialAutoCompleteTextView r2 = r2.f15500r
                r2.dismissDropDown()
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: io.tacocrypto.app.ui.transfer.TransferFragment$c */
    public static final class C3361c extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<ch.C0978e<? extends java.lang.Boolean, ? extends java.lang.String>, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.transfer.TransferFragment f14513Z;

        public C3361c(io.tacocrypto.app.p156ui.transfer.TransferFragment r1) {
                r0 = this;
                r0.f14513Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(ch.C0978e<? extends java.lang.Boolean, ? extends java.lang.String> r5) {
                r4 = this;
                ch.e r5 = (ch.C0978e) r5
                java.lang.String r0 = "<name for destructuring parameter 0>"
                p214m2.C4339q.m9706k(r5, r0)
                A r0 = r5.f5050Y
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                B r5 = r5.f5051Z
                java.lang.String r5 = (java.lang.String) r5
                io.tacocrypto.app.ui.transfer.TransferFragment r1 = r4.f14513Z
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "success: "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = ", username: "
                r2.append(r0)
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r0 = 0
                r2 = 2
                vg.C6664e.m13512m(r1, r5, r0, r2)
                ch.l r5 = ch.C0985l.f5061a
                return r5
        }
    }

    /* renamed from: io.tacocrypto.app.ui.transfer.TransferFragment$d */
    public static final class C3362d extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p013ah.C0100a, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.transfer.TransferFragment f14514Z;

        public C3362d(io.tacocrypto.app.p156ui.transfer.TransferFragment r1) {
                r0 = this;
                r0.f14514Z = r1
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
                io.tacocrypto.app.ui.transfer.TransferFragment r0 = r1.f14514Z
                p458zg.C7331c.m14402a(r0, r2)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: io.tacocrypto.app.ui.transfer.TransferFragment$e */
    public static final class C3363e extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.lang.String, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.transfer.TransferFragment f14515Z;

        public C3363e(io.tacocrypto.app.p156ui.transfer.TransferFragment r1) {
                r0 = this;
                r0.f14515Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(java.lang.String r4) {
                r3 = this;
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r4, r0)
                io.tacocrypto.app.ui.transfer.TransferFragment r0 = r3.f14515Z
                r1 = 2131952009(0x7f130189, float:1.9540449E38)
                java.lang.String r1 = r0.m1309M(r1)
                java.lang.String r2 = "getString(R.string.wait)"
                p214m2.C4339q.m9705j(r1, r2)
                p458zg.C7331c.m14403b(r0, r1, r4)
                ch.l r4 = ch.C0985l.f5061a
                return r4
        }
    }

    /* renamed from: io.tacocrypto.app.ui.transfer.TransferFragment$f */
    public static final class C3364f extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.transfer.TransferFragment f14516Z;

        public C3364f(io.tacocrypto.app.p156ui.transfer.TransferFragment r1) {
                r0 = this;
                r0.f14516Z = r1
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
                io.tacocrypto.app.ui.transfer.TransferFragment r2 = r1.f14516Z
                androidx.fragment.app.d0 r2 = r2.m1337u()
                java.lang.String r0 = "childFragmentManager"
                p214m2.C4339q.m9705j(r2, r0)
                p359ud.C6379b.m13021P0(r2)
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: io.tacocrypto.app.ui.transfer.TransferFragment$g */
    public static final class C3365g extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.transfer.TransferFragment f14517Z;

        public C3365g(io.tacocrypto.app.p156ui.transfer.TransferFragment r1) {
                r0 = this;
                r0.f14517Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r11) {
                r10 = this;
                android.view.View r11 = (android.view.View) r11
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r11, r0)
                io.tacocrypto.app.ui.transfer.TransferFragment r11 = r10.f14517Z
                int r0 = io.tacocrypto.app.p156ui.transfer.TransferFragment.f14509W0
                rg.f r11 = r11.m7749H0()
                io.tacocrypto.app.ui.transfer.TransferFragment r0 = r10.f14517Z
                android.content.Context r0 = r0.m1334s0()
                java.util.Objects.requireNonNull(r11)
                java.lang.String r1 = "context"
                p214m2.C4339q.m9706k(r0, r1)
                androidx.lifecycle.d0<od.b0> r1 = r11.f22634k
                java.lang.Object r1 = r1.m1411d()
                od.b0 r1 = (p255od.C5194b0) r1
                if (r1 != 0) goto L29
                goto La2
            L29:
                od.r r8 = new od.r
                androidx.lifecycle.d0<java.lang.String> r2 = r11.f22639p
                java.lang.Object r2 = r2.m1411d()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r3 = ""
                if (r2 != 0) goto L39
                r4 = r3
                goto L3a
            L39:
                r4 = r2
            L3a:
                androidx.lifecycle.d0<java.lang.String> r2 = r11.f22638o
                java.lang.Object r2 = r2.m1411d()
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L59
                java.lang.Double r2 = p362uh.C6462h.m13048E(r2)
                if (r2 == 0) goto L59
                double r5 = r2.doubleValue()
                int r2 = r1.getDecimals()
                r7 = 0
                r9 = 2
                java.lang.String r2 = vg.C6672m.m13535v(r5, r2, r7, r9)
                goto L5a
            L59:
                r2 = 0
            L5a:
                if (r2 != 0) goto L5e
                r5 = r3
                goto L5f
            L5e:
                r5 = r2
            L5f:
                java.lang.String r6 = r1.getCurrency()
                androidx.lifecycle.d0<java.lang.String> r2 = r11.f22640q
                java.lang.Object r2 = r2.m1411d()
                java.lang.String r2 = (java.lang.String) r2
                if (r2 != 0) goto L6f
                r7 = r3
                goto L70
            L6f:
                r7 = r2
            L70:
                java.lang.String r1 = r1.getContract()
                r2 = r8
                r3 = r4
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                ch.e r1 = r8.isValid()
                A r2 = r1.f5050Y
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L98
                androidx.lifecycle.d0<vg.b<java.lang.String>> r11 = r11.f22637n
                vg.b r0 = new vg.b
                B r1 = r1.f5051Z
                r0.<init>(r1)
                r11.mo7l(r0)
                goto La2
            L98:
                nd.b0 r1 = r11.f22626c
                rg.g r2 = new rg.g
                r2.<init>(r11)
                r1.m10806t(r0, r8, r2)
            La2:
                ch.l r11 = ch.C0985l.f5061a
                return r11
        }
    }

    /* renamed from: io.tacocrypto.app.ui.transfer.TransferFragment$h */
    public static final class C3366h extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.transfer.TransferFragment f14518Z;

        public C3366h(io.tacocrypto.app.p156ui.transfer.TransferFragment r1) {
                r0 = this;
                r0.f14518Z = r1
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
                io.tacocrypto.app.ui.transfer.TransferFragment r3 = r2.f14518Z
                androidx.fragment.app.d0 r3 = r3.m1337u()
                java.lang.String r0 = "childFragmentManager"
                p214m2.C4339q.m9705j(r3, r0)
                java.lang.String r0 = "fragmentManager"
                p214m2.C4339q.m9706k(r3, r0)
                ce.d r0 = new ce.d
                r0.<init>()
                r1 = 0
                r0.mo1229K0(r3, r1)
                ch.l r3 = ch.C0985l.f5061a
                return r3
        }
    }

    /* renamed from: io.tacocrypto.app.ui.transfer.TransferFragment$i */
    public static final class C3367i extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.transfer.TransferFragment f14519Z;

        public C3367i(io.tacocrypto.app.p156ui.transfer.TransferFragment r1) {
                r0 = this;
                r0.f14519Z = r1
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
                io.tacocrypto.app.ui.transfer.TransferFragment r3 = r2.f14519Z
                androidx.fragment.app.d0 r3 = r3.m1337u()
                java.lang.String r0 = "childFragmentManager"
                p214m2.C4339q.m9705j(r3, r0)
                java.lang.String r0 = "fragmentManager"
                p214m2.C4339q.m9706k(r3, r0)
                be.f r0 = new be.f
                r0.<init>()
                r1 = 0
                r0.mo1229K0(r3, r1)
                ch.l r3 = ch.C0985l.f5061a
                return r3
        }
    }

    /* renamed from: io.tacocrypto.app.ui.transfer.TransferFragment$j */
    public static final class C3368j extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f14520Z;

        public C3368j(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f14520Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f14520Z
                return r0
        }
    }

    /* renamed from: io.tacocrypto.app.ui.transfer.TransferFragment$k */
    public static final class C3369k extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f14521Z;

        public C3369k(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f14521Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f14521Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: io.tacocrypto.app.ui.transfer.TransferFragment$l */
    public /* synthetic */ class C3370l extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.AbstractC3555s> {

        /* renamed from: g0 */
        public static final io.tacocrypto.app.p156ui.transfer.TransferFragment.C3370l f14522g0 = null;

        static {
                io.tacocrypto.app.ui.transfer.TransferFragment$l r0 = new io.tacocrypto.app.ui.transfer.TransferFragment$l
                r0.<init>()
                io.tacocrypto.app.p156ui.transfer.TransferFragment.C3370l.f14522g0 = r0
                return
        }

        public C3370l() {
                r6 = this;
                java.lang.Class<jd.s> r2 = p171jd.AbstractC3555s.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/FragmentTransferBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.AbstractC3555s mo115i(android.view.LayoutInflater r3, android.view.ViewGroup r4, java.lang.Boolean r5) {
                r2 = this;
                android.view.LayoutInflater r3 = (android.view.LayoutInflater) r3
                android.view.ViewGroup r4 = (android.view.ViewGroup) r4
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                java.lang.String r0 = "p0"
                p214m2.C4339q.m9706k(r3, r0)
                int r0 = p171jd.AbstractC3555s.f15495E
                androidx.databinding.d r0 = androidx.databinding.C0359f.f2019a
                r0 = 2131558485(0x7f0d0055, float:1.8742287E38)
                r1 = 0
                androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.m1048h(r3, r0, r4, r5, r1)
                jd.s r3 = (p171jd.AbstractC3555s) r3
                return r3
        }
    }

    /* renamed from: io.tacocrypto.app.ui.transfer.TransferFragment$m */
    public static final class C3371m extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.transfer.TransferFragment f14523Z;

        public C3371m(io.tacocrypto.app.p156ui.transfer.TransferFragment r1) {
                r0 = this;
                r0.f14523Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                io.tacocrypto.app.ui.transfer.TransferFragment r0 = r1.f14523Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    public TransferFragment() {
            r4 = this;
            r4.<init>()
            io.tacocrypto.app.ui.transfer.TransferFragment$m r0 = new io.tacocrypto.app.ui.transfer.TransferFragment$m
            r0.<init>(r4)
            io.tacocrypto.app.ui.transfer.TransferFragment$j r1 = new io.tacocrypto.app.ui.transfer.TransferFragment$j
            r1.<init>(r4)
            java.lang.Class<rg.f> r2 = p315rg.C5850f.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            io.tacocrypto.app.ui.transfer.TransferFragment$k r3 = new io.tacocrypto.app.ui.transfer.TransferFragment$k
            r3.<init>(r1)
            ch.d r0 = androidx.fragment.app.C0420z0.m1404a(r4, r2, r3, r0)
            r4.f14510V0 = r0
            return
    }

    @Override // td.AbstractC6215c
    /* renamed from: D0 */
    public void mo7720D0() {
            r4 = this;
            rg.f r0 = r4.m7749H0()
            androidx.lifecycle.LiveData<ch.e<id.b, java.lang.Boolean>> r0 = r0.f22628e
            androidx.lifecycle.v r1 = r4.m1311O()
            rg.e r2 = new rg.e
            r3 = 0
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            rg.f r0 = r4.m7749H0()
            io.tacocrypto.app.database.AppDatabase r0 = r0.f22627d
            hd.b r0 = r0.mo7712o()
            androidx.lifecycle.LiveData r0 = r0.mo7435b()
            androidx.lifecycle.v r1 = r4.m1311O()
            rg.e r2 = new rg.e
            r3 = 1
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            rg.f r0 = r4.m7749H0()
            androidx.lifecycle.LiveData<vg.b<java.util.List<od.b0>>> r0 = r0.f22632i
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            io.tacocrypto.app.ui.transfer.TransferFragment$a r3 = new io.tacocrypto.app.ui.transfer.TransferFragment$a
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            rg.f r0 = r4.m7749H0()
            androidx.lifecycle.d0<vg.b<ch.l>> r0 = r0.f22633j
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            io.tacocrypto.app.ui.transfer.TransferFragment$b r3 = new io.tacocrypto.app.ui.transfer.TransferFragment$b
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            rg.f r0 = r4.m7749H0()
            androidx.lifecycle.d0<od.b0> r0 = r0.f22634k
            androidx.lifecycle.v r1 = r4.m1311O()
            rg.e r2 = new rg.e
            r3 = 2
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            rg.f r0 = r4.m7749H0()
            androidx.lifecycle.d0<vg.b<ch.e<java.lang.Boolean, java.lang.String>>> r0 = r0.f22635l
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            io.tacocrypto.app.ui.transfer.TransferFragment$c r3 = new io.tacocrypto.app.ui.transfer.TransferFragment$c
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            rg.f r0 = r4.m7749H0()
            androidx.lifecycle.d0<vg.b<ah.a>> r0 = r0.f22636m
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            io.tacocrypto.app.ui.transfer.TransferFragment$d r3 = new io.tacocrypto.app.ui.transfer.TransferFragment$d
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            rg.f r0 = r4.m7749H0()
            androidx.lifecycle.d0<vg.b<java.lang.String>> r0 = r0.f22637n
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            io.tacocrypto.app.ui.transfer.TransferFragment$e r3 = new io.tacocrypto.app.ui.transfer.TransferFragment$e
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            return
    }

    @Override // td.AbstractC6215c
    /* renamed from: F0 */
    public void mo7721F0() {
            r4 = this;
            T extends w1.a r0 = r4.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.s r0 = (p171jd.AbstractC3555s) r0
            rg.f r1 = r4.m7749H0()
            r0.mo8006r(r1)
            T extends w1.a r0 = r4.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.s r0 = (p171jd.AbstractC3555s) r0
            androidx.lifecycle.v r1 = r4.m1311O()
            r0.m1060p(r1)
            T extends w1.a r0 = r4.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.s r0 = (p171jd.AbstractC3555s) r0
            com.google.android.material.textfield.MaterialAutoCompleteTextView r0 = r0.f15500r
            r1 = 2131099741(0x7f06005d, float:1.7811844E38)
            r0.setDropDownBackgroundResource(r1)
            T extends w1.a r0 = r4.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.s r0 = (p171jd.AbstractC3555s) r0
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f15497B
            rg.d r1 = new rg.d
            r2 = 0
            r1.<init>(r4, r2)
            r0.setOnClickListener(r1)
            T extends w1.a r0 = r4.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.s r0 = (p171jd.AbstractC3555s) r0
            androidx.appcompat.widget.LinearLayoutCompat r0 = r0.f15505w
            rg.d r1 = new rg.d
            r3 = 1
            r1.<init>(r4, r3)
            r0.setOnClickListener(r1)
            T extends w1.a r0 = r4.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.s r0 = (p171jd.AbstractC3555s) r0
            androidx.appcompat.widget.AppCompatImageView r0 = r0.f15504v
            java.lang.String r1 = "binding.contactsIcon"
            p214m2.C4339q.m9705j(r0, r1)
            io.tacocrypto.app.ui.transfer.TransferFragment$f r1 = new io.tacocrypto.app.ui.transfer.TransferFragment$f
            r1.<init>(r4)
            vg.C6664e.m13509j(r0, r2, r1, r3)
            T extends w1.a r0 = r4.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.s r0 = (p171jd.AbstractC3555s) r0
            com.google.android.material.button.MaterialButton r0 = r0.f15503u
            java.lang.String r1 = "binding.buttonSend"
            p214m2.C4339q.m9705j(r0, r1)
            io.tacocrypto.app.ui.transfer.TransferFragment$g r1 = new io.tacocrypto.app.ui.transfer.TransferFragment$g
            r1.<init>(r4)
            vg.C6664e.m13509j(r0, r2, r1, r3)
            T extends w1.a r0 = r4.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.s r0 = (p171jd.AbstractC3555s) r0
            androidx.appcompat.widget.AppCompatImageView r0 = r0.f15506x
            java.lang.String r1 = "binding.iconQrCode"
            p214m2.C4339q.m9705j(r0, r1)
            io.tacocrypto.app.ui.transfer.TransferFragment$h r1 = new io.tacocrypto.app.ui.transfer.TransferFragment$h
            r1.<init>(r4)
            vg.C6664e.m13509j(r0, r2, r1, r3)
            T extends w1.a r0 = r4.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.s r0 = (p171jd.AbstractC3555s) r0
            com.google.android.material.button.MaterialButton r0 = r0.f15502t
            java.lang.String r1 = "binding.buttonRequest"
            p214m2.C4339q.m9705j(r0, r1)
            io.tacocrypto.app.ui.transfer.TransferFragment$i r1 = new io.tacocrypto.app.ui.transfer.TransferFragment$i
            r1.<init>(r4)
            vg.C6664e.m13509j(r0, r2, r1, r3)
            T extends w1.a r0 = r4.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.s r0 = (p171jd.AbstractC3555s) r0
            com.google.android.material.textfield.MaterialAutoCompleteTextView r0 = r0.f15500r
            be.a r1 = new be.a
            r1.<init>(r4)
            r0.setOnItemClickListener(r1)
            return
    }

    @Override // td.AbstractC6215c
    /* renamed from: G0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.AbstractC3555s> mo7722G0() {
            r2 = this;
            io.tacocrypto.app.ui.transfer.TransferFragment$l r0 = io.tacocrypto.app.p156ui.transfer.TransferFragment.C3370l.f14522g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    /* renamed from: H0 */
    public final p315rg.C5850f m7749H0() {
            r1 = this;
            ch.d r0 = r1.f14510V0
            java.lang.Object r0 = r0.getValue()
            rg.f r0 = (p315rg.C5850f) r0
            return r0
    }

    @Override // p359ud.C6379b.b
    /* renamed from: c */
    public void mo2349c(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "address"
            p214m2.C4339q.m9706k(r3, r0)
            rg.f r0 = r2.m7749H0()
            java.util.Objects.requireNonNull(r0)
            androidx.lifecycle.d0<java.lang.String> r1 = r0.f22639p
            r1.mo7l(r3)
            androidx.lifecycle.d0<vg.b<ch.l>> r3 = r0.f22633j
            vg.b r0 = new vg.b
            ch.l r1 = ch.C0985l.f5061a
            r0.<init>(r1)
            r3.mo7l(r0)
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: e0 */
    public void mo1322e0() {
            r1 = this;
            r0 = 1
            r1.f2258A0 = r0
            rg.f r0 = r1.m7749H0()
            r0.m12201d()
            return
    }

    @Override // p041ce.InterfaceC0954e
    /* renamed from: m */
    public void mo2676m(p041ce.C0955f r5) {
            r4 = this;
            androidx.fragment.app.d0 r0 = r4.m1337u()
            java.lang.String r1 = "childFragmentManager"
            p214m2.C4339q.m9705j(r0, r1)
            zd.f r1 = new zd.f
            r1.<init>()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "transferRequest"
            r2.putSerializable(r3, r5)
            r1.m1344x0(r2)
            r5 = 0
            r1.mo1229K0(r0, r5)
            return
    }
}
