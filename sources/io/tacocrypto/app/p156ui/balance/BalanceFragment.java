package io.tacocrypto.app.p156ui.balance;

/* loaded from: classes.dex */
public final class BalanceFragment extends td.AbstractC6215c<p171jd.C3539n> {

    /* renamed from: X0 */
    public static final /* synthetic */ int f14253X0 = 0;

    /* renamed from: V0 */
    public final ch.InterfaceC0977d f14254V0;

    /* renamed from: W0 */
    public final sd.C6031a f14255W0;

    /* renamed from: io.tacocrypto.app.ui.balance.BalanceFragment$a */
    public static final class C3201a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<sd.C6034d.a, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.balance.BalanceFragment f14256Z;

        public C3201a(io.tacocrypto.app.p156ui.balance.BalanceFragment r1) {
                r0 = this;
                r0.f14256Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(sd.C6034d.a r5) {
                r4 = this;
                sd.d$a r5 = (sd.C6034d.a) r5
                java.lang.String r0 = "item"
                p214m2.C4339q.m9706k(r5, r0)
                boolean r0 = r5.f23288c
                if (r0 == 0) goto L36
                io.tacocrypto.app.ui.balance.BalanceFragment r0 = r4.f14256Z
                androidx.fragment.app.d0 r0 = r0.m1337u()
                java.lang.String r1 = "childFragmentManager"
                p214m2.C4339q.m9705j(r0, r1)
                od.b0 r5 = r5.f23286a
                java.lang.String r1 = "fragmentManager"
                p214m2.C4339q.m9706k(r0, r1)
                java.lang.String r1 = "balance"
                p214m2.C4339q.m9706k(r5, r1)
                je.e r2 = new je.e
                r2.<init>()
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                r3.putSerializable(r1, r5)
                r2.m1344x0(r3)
                r5 = 0
                r2.mo1229K0(r0, r5)
            L36:
                ch.l r5 = ch.C0985l.f5061a
                return r5
        }
    }

    /* renamed from: io.tacocrypto.app.ui.balance.BalanceFragment$b */
    public static final class C3202b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<ch.C0985l, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.balance.BalanceFragment f14257Z;

        public C3202b(io.tacocrypto.app.p156ui.balance.BalanceFragment r1) {
                r0 = this;
                r0.f14257Z = r1
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
                io.tacocrypto.app.ui.balance.BalanceFragment r2 = r1.f14257Z
                sd.a r2 = r2.f14255W0
                androidx.recyclerview.widget.RecyclerView$f r2 = r2.f3228a
                r2.m1813b()
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: io.tacocrypto.app.ui.balance.BalanceFragment$c */
    public static final class C3203c extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.balance.BalanceFragment f14258Z;

        public C3203c(io.tacocrypto.app.p156ui.balance.BalanceFragment r1) {
                r0 = this;
                r0.f14258Z = r1
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
                io.tacocrypto.app.ui.balance.BalanceFragment r2 = r1.f14258Z
                androidx.fragment.app.s r2 = r2.m1333s()
                boolean r0 = r2 instanceof io.tacocrypto.app.p156ui.main.MainActivity
                if (r0 == 0) goto L14
                io.tacocrypto.app.ui.main.MainActivity r2 = (io.tacocrypto.app.p156ui.main.MainActivity) r2
                goto L15
            L14:
                r2 = 0
            L15:
                if (r2 == 0) goto L26
                T extends w1.a r2 = r2.f24169l0
                p214m2.C4339q.m9704i(r2)
                jd.b r2 = (p171jd.C3491b) r2
                com.google.android.material.bottomnavigation.BottomNavigationView r2 = r2.f15011b
                r0 = 2131362443(0x7f0a028b, float:1.8344667E38)
                r2.setSelectedItemId(r0)
            L26:
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    /* renamed from: io.tacocrypto.app.ui.balance.BalanceFragment$d */
    public static final class C3204d extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.balance.BalanceFragment f14259Z;

        public C3204d(io.tacocrypto.app.p156ui.balance.BalanceFragment r1) {
                r0 = this;
                r0.f14259Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r9) {
                r8 = this;
                r1 = r9
                android.view.View r1 = (android.view.View) r1
                java.lang.String r9 = "card"
                p214m2.C4339q.m9706k(r1, r9)
                y.e r0 = new y.e
                r9 = 26
                r0.<init>(r9)
                io.tacocrypto.app.ui.balance.f[] r9 = io.tacocrypto.app.p156ui.balance.EnumC3216f.values()
                java.util.List r2 = p062dh.C1468d.m3991M(r9)
                io.tacocrypto.app.ui.balance.a r3 = new io.tacocrypto.app.ui.balance.a
                io.tacocrypto.app.ui.balance.BalanceFragment r9 = r8.f14259Z
                r3.<init>(r9)
                int r9 = r1.getWidth()
                r4 = 400(0x190, float:5.6E-43)
                int r5 = java.lang.Math.max(r9, r4)
                r4 = 0
                r6 = 0
                r7 = 40
                p422y.C7095e.m14212i(r0, r1, r2, r3, r4, r5, r6, r7)
                ch.l r9 = ch.C0985l.f5061a
                return r9
        }
    }

    /* renamed from: io.tacocrypto.app.ui.balance.BalanceFragment$e */
    public static final class C3205e extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.balance.BalanceFragment f14260Z;

        public C3205e(io.tacocrypto.app.p156ui.balance.BalanceFragment r1) {
                r0 = this;
                r0.f14260Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r9) {
                r8 = this;
                r1 = r9
                android.view.View r1 = (android.view.View) r1
                java.lang.String r9 = "card"
                p214m2.C4339q.m9706k(r1, r9)
                y.e r0 = new y.e
                r9 = 26
                r0.<init>(r9)
                io.tacocrypto.app.ui.balance.d[] r9 = io.tacocrypto.app.p156ui.balance.EnumC3214d.values()
                java.util.List r2 = p062dh.C1468d.m3991M(r9)
                io.tacocrypto.app.ui.balance.b r3 = new io.tacocrypto.app.ui.balance.b
                io.tacocrypto.app.ui.balance.BalanceFragment r9 = r8.f14260Z
                r3.<init>(r9)
                int r5 = r1.getWidth()
                r4 = 0
                r6 = 0
                r7 = 40
                p422y.C7095e.m14212i(r0, r1, r2, r3, r4, r5, r6, r7)
                ch.l r9 = ch.C0985l.f5061a
                return r9
        }
    }

    /* renamed from: io.tacocrypto.app.ui.balance.BalanceFragment$f */
    public static final class C3206f extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.balance.BalanceFragment f14261Z;

        public C3206f(io.tacocrypto.app.p156ui.balance.BalanceFragment r1) {
                r0 = this;
                r0.f14261Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r9) {
                r8 = this;
                r1 = r9
                android.view.View r1 = (android.view.View) r1
                java.lang.String r9 = "card"
                p214m2.C4339q.m9706k(r1, r9)
                y.e r0 = new y.e
                r9 = 26
                r0.<init>(r9)
                io.tacocrypto.app.ui.balance.e[] r9 = io.tacocrypto.app.p156ui.balance.EnumC3215e.values()
                java.util.List r2 = p062dh.C1468d.m3991M(r9)
                io.tacocrypto.app.ui.balance.c r3 = new io.tacocrypto.app.ui.balance.c
                io.tacocrypto.app.ui.balance.BalanceFragment r9 = r8.f14261Z
                r3.<init>(r9)
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 56
                p422y.C7095e.m14212i(r0, r1, r2, r3, r4, r5, r6, r7)
                ch.l r9 = ch.C0985l.f5061a
                return r9
        }
    }

    /* renamed from: io.tacocrypto.app.ui.balance.BalanceFragment$g */
    public static final class C3207g extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f14262Z;

        public C3207g(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f14262Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f14262Z
                return r0
        }
    }

    /* renamed from: io.tacocrypto.app.ui.balance.BalanceFragment$h */
    public static final class C3208h extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f14263Z;

        public C3208h(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f14263Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f14263Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: io.tacocrypto.app.ui.balance.BalanceFragment$i */
    public /* synthetic */ class C3209i extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3539n> {

        /* renamed from: g0 */
        public static final io.tacocrypto.app.p156ui.balance.BalanceFragment.C3209i f14264g0 = null;

        static {
                io.tacocrypto.app.ui.balance.BalanceFragment$i r0 = new io.tacocrypto.app.ui.balance.BalanceFragment$i
                r0.<init>()
                io.tacocrypto.app.p156ui.balance.BalanceFragment.C3209i.f14264g0 = r0
                return
        }

        public C3209i() {
                r6 = this;
                java.lang.Class<jd.n> r2 = p171jd.C3539n.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/FragmentBalanceBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.C3539n mo115i(android.view.LayoutInflater r31, android.view.ViewGroup r32, java.lang.Boolean r33) {
                r30 = this;
                r0 = r31
                android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
                r1 = r32
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                r2 = r33
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                java.lang.String r3 = "p0"
                p214m2.C4339q.m9706k(r0, r3)
                r3 = 2131558480(0x7f0d0050, float:1.8742277E38)
                r4 = 0
                android.view.View r0 = r0.inflate(r3, r1, r4)
                if (r2 == 0) goto L22
                r1.addView(r0)
            L22:
                r1 = 2131361845(0x7f0a0035, float:1.8343454E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r5 = r2
                androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
                if (r5 == 0) goto L156
                r1 = 2131361894(0x7f0a0066, float:1.8343553E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r6 = r2
                com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
                if (r6 == 0) goto L156
                r1 = 2131361947(0x7f0a009b, float:1.834366E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r7 = r2
                com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
                if (r7 == 0) goto L156
                r1 = 2131361992(0x7f0a00c8, float:1.8343752E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                if (r2 == 0) goto L156
                jd.h r8 = p171jd.C3515h.m7984a(r2)
                r1 = 2131361993(0x7f0a00c9, float:1.8343754E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                if (r2 == 0) goto L156
                jd.h r9 = p171jd.C3515h.m7984a(r2)
                r1 = 2131361998(0x7f0a00ce, float:1.8343764E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                if (r2 == 0) goto L156
                jd.h r10 = p171jd.C3515h.m7984a(r2)
                r11 = r0
                androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
                r1 = 2131362051(0x7f0a0103, float:1.8343872E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r12 = r2
                androidx.appcompat.widget.LinearLayoutCompat r12 = (androidx.appcompat.widget.LinearLayoutCompat) r12
                if (r12 == 0) goto L156
                r1 = 2131362058(0x7f0a010a, float:1.8343886E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r13 = r2
                androidx.appcompat.widget.LinearLayoutCompat r13 = (androidx.appcompat.widget.LinearLayoutCompat) r13
                if (r13 == 0) goto L156
                r1 = 2131362059(0x7f0a010b, float:1.8343888E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r14 = r2
                androidx.appcompat.widget.LinearLayoutCompat r14 = (androidx.appcompat.widget.LinearLayoutCompat) r14
                if (r14 == 0) goto L156
                r1 = 2131362060(0x7f0a010c, float:1.834389E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r15 = r2
                androidx.appcompat.widget.LinearLayoutCompat r15 = (androidx.appcompat.widget.LinearLayoutCompat) r15
                if (r15 == 0) goto L156
                r1 = 2131362068(0x7f0a0114, float:1.8343906E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r16 = r2
                androidx.coordinatorlayout.widget.CoordinatorLayout r16 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r16
                if (r16 == 0) goto L156
                r1 = 2131362075(0x7f0a011b, float:1.834392E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r17 = r2
                androidx.appcompat.widget.AppCompatImageView r17 = (androidx.appcompat.widget.AppCompatImageView) r17
                if (r17 == 0) goto L156
                r1 = 2131362076(0x7f0a011c, float:1.8343922E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r18 = r2
                androidx.appcompat.widget.AppCompatTextView r18 = (androidx.appcompat.widget.AppCompatTextView) r18
                if (r18 == 0) goto L156
                r1 = 2131362127(0x7f0a014f, float:1.8344026E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r19 = r2
                androidx.appcompat.widget.LinearLayoutCompat r19 = (androidx.appcompat.widget.LinearLayoutCompat) r19
                if (r19 == 0) goto L156
                r1 = 2131362196(0x7f0a0194, float:1.8344166E38)
                android.view.View r20 = p064e.C1494h.m4055f(r0, r1)
                if (r20 == 0) goto L156
                r1 = 2131362237(0x7f0a01bd, float:1.8344249E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r21 = r2
                android.widget.HorizontalScrollView r21 = (android.widget.HorizontalScrollView) r21
                if (r21 == 0) goto L156
                r1 = 2131362242(0x7f0a01c2, float:1.834426E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r22 = r2
                androidx.appcompat.widget.AppCompatImageView r22 = (androidx.appcompat.widget.AppCompatImageView) r22
                if (r22 == 0) goto L156
                r1 = 2131362298(0x7f0a01fa, float:1.8344373E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r23 = r2
                androidx.recyclerview.widget.RecyclerView r23 = (androidx.recyclerview.widget.RecyclerView) r23
                if (r23 == 0) goto L156
                r1 = 2131362568(0x7f0a0308, float:1.834492E38)
                android.view.View r24 = p064e.C1494h.m4055f(r0, r1)
                if (r24 == 0) goto L156
                r1 = 2131362605(0x7f0a032d, float:1.8344995E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r25 = r2
                android.widget.Space r25 = (android.widget.Space) r25
                if (r25 == 0) goto L156
                r1 = 2131362646(0x7f0a0356, float:1.8345078E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r26 = r2
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r26 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r26
                if (r26 == 0) goto L156
                r1 = 2131362710(0x7f0a0396, float:1.8345208E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r27 = r2
                androidx.appcompat.widget.AppCompatTextView r27 = (androidx.appcompat.widget.AppCompatTextView) r27
                if (r27 == 0) goto L156
                r1 = 2131362718(0x7f0a039e, float:1.8345224E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r28 = r2
                androidx.appcompat.widget.AppCompatTextView r28 = (androidx.appcompat.widget.AppCompatTextView) r28
                if (r28 == 0) goto L156
                r1 = 2131362767(0x7f0a03cf, float:1.8345324E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r29 = r2
                androidx.appcompat.widget.AppCompatTextView r29 = (androidx.appcompat.widget.AppCompatTextView) r29
                if (r29 == 0) goto L156
                jd.n r0 = new jd.n
                r3 = r0
                r4 = r11
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
                return r0
            L156:
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r0 = r0.getResourceName(r1)
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "Missing required view with ID: "
                java.lang.String r0 = r2.concat(r0)
                r1.<init>(r0)
                throw r1
        }
    }

    /* renamed from: io.tacocrypto.app.ui.balance.BalanceFragment$j */
    public static final class C3210j extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.balance.BalanceFragment f14265Z;

        public C3210j(io.tacocrypto.app.p156ui.balance.BalanceFragment r1) {
                r0 = this;
                r0.f14265Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                io.tacocrypto.app.ui.balance.BalanceFragment r0 = r1.f14265Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    public BalanceFragment() {
            r4 = this;
            r4.<init>()
            io.tacocrypto.app.ui.balance.BalanceFragment$j r0 = new io.tacocrypto.app.ui.balance.BalanceFragment$j
            r0.<init>(r4)
            io.tacocrypto.app.ui.balance.BalanceFragment$g r1 = new io.tacocrypto.app.ui.balance.BalanceFragment$g
            r1.<init>(r4)
            java.lang.Class<sd.d> r2 = sd.C6034d.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            io.tacocrypto.app.ui.balance.BalanceFragment$h r3 = new io.tacocrypto.app.ui.balance.BalanceFragment$h
            r3.<init>(r1)
            ch.d r0 = androidx.fragment.app.C0420z0.m1404a(r4, r2, r3, r0)
            r4.f14254V0 = r0
            sd.a r0 = new sd.a
            io.tacocrypto.app.ui.balance.BalanceFragment$a r1 = new io.tacocrypto.app.ui.balance.BalanceFragment$a
            r1.<init>(r4)
            r0.<init>(r1)
            r4.f14255W0 = r0
            return
    }

    @Override // td.AbstractC6215c
    /* renamed from: D0 */
    public void mo7720D0() {
            r4 = this;
            sd.d r0 = r4.m7723H0()
            androidx.lifecycle.LiveData<ch.e<id.b, java.lang.Boolean>> r0 = r0.f23270k
            androidx.lifecycle.v r1 = r4.m1311O()
            sd.c r2 = new sd.c
            r3 = 0
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            sd.d r0 = r4.m7723H0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f23269j
            androidx.lifecycle.v r1 = r4.m1311O()
            sd.c r2 = new sd.c
            r3 = 2
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            sd.d r0 = r4.m7723H0()
            androidx.lifecycle.LiveData<java.util.List<sd.d$a>> r0 = r0.f23284y
            androidx.lifecycle.v r1 = r4.m1311O()
            sd.c r2 = new sd.c
            r3 = 3
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            sd.d r0 = r4.m7723H0()
            androidx.lifecycle.LiveData<io.tacocrypto.app.ui.balance.f> r0 = r0.f23256A
            androidx.lifecycle.v r1 = r4.m1311O()
            sd.c r2 = new sd.c
            r3 = 4
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            sd.d r0 = r4.m7723H0()
            androidx.lifecycle.LiveData<io.tacocrypto.app.ui.balance.d> r0 = r0.f23258C
            androidx.lifecycle.v r1 = r4.m1311O()
            sd.c r2 = new sd.c
            r3 = 5
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            sd.d r0 = r4.m7723H0()
            androidx.lifecycle.LiveData<io.tacocrypto.app.ui.balance.e> r0 = r0.f23260E
            androidx.lifecycle.v r1 = r4.m1311O()
            sd.c r2 = new sd.c
            r3 = 6
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            sd.d r0 = r4.m7723H0()
            androidx.lifecycle.LiveData<sd.d$b> r0 = r0.f23278s
            androidx.lifecycle.v r1 = r4.m1311O()
            sd.c r2 = new sd.c
            r3 = 7
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            sd.d r0 = r4.m7723H0()
            androidx.lifecycle.LiveData<sd.d$b> r0 = r0.f23276q
            androidx.lifecycle.v r1 = r4.m1311O()
            sd.c r2 = new sd.c
            r3 = 8
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            sd.d r0 = r4.m7723H0()
            androidx.lifecycle.LiveData<java.lang.String> r0 = r0.f23261F
            androidx.lifecycle.v r1 = r4.m1311O()
            sd.c r2 = new sd.c
            r3 = 9
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            sd.d r0 = r4.m7723H0()
            androidx.lifecycle.LiveData<io.tacocrypto.app.ui.balance.g> r0 = r0.f23280u
            androidx.lifecycle.v r1 = r4.m1311O()
            sd.c r2 = new sd.c
            r3 = 10
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            sd.d r0 = r4.m7723H0()
            androidx.lifecycle.LiveData<java.lang.String> r0 = r0.f23272m
            androidx.lifecycle.v r1 = r4.m1311O()
            sd.c r2 = new sd.c
            r3 = 1
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            sd.d r0 = r4.m7723H0()
            androidx.lifecycle.LiveData<vg.b<ch.l>> r0 = r0.f23267h
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            io.tacocrypto.app.ui.balance.BalanceFragment$b r3 = new io.tacocrypto.app.ui.balance.BalanceFragment$b
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            return
    }

    @Override // td.AbstractC6215c
    /* renamed from: F0 */
    public void mo7721F0() {
            r7 = this;
            T extends w1.a r0 = r7.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.n r0 = (p171jd.C3539n) r0
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = r0.f15362o
            u3.b r1 = new u3.b
            r1.<init>(r7)
            r0.setOnRefreshListener(r1)
            T extends w1.a r0 = r7.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.n r0 = (p171jd.C3539n) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15360m
            java.lang.String r1 = "binding.list"
            p214m2.C4339q.m9705j(r0, r1)
            java.lang.String r1 = "<this>"
            p214m2.C4339q.m9706k(r0, r1)
            androidx.recyclerview.widget.RecyclerView$j r0 = r0.getItemAnimator()
            boolean r1 = r0 instanceof androidx.recyclerview.widget.AbstractC0596j0
            if (r1 == 0) goto L2f
            androidx.recyclerview.widget.j0 r0 = (androidx.recyclerview.widget.AbstractC0596j0) r0
            goto L30
        L2f:
            r0 = 0
        L30:
            r1 = 0
            if (r0 != 0) goto L34
            goto L36
        L34:
            r0.f3452g = r1
        L36:
            T extends w1.a r0 = r7.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.n r0 = (p171jd.C3539n) r0
            androidx.appcompat.widget.LinearLayoutCompat r0 = r0.f15354g
            sd.b r2 = new sd.b
            r2.<init>(r7, r1)
            r0.setOnClickListener(r2)
            T extends w1.a r0 = r7.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.n r0 = (p171jd.C3539n) r0
            android.view.View r0 = r0.f15361n
            sd.b r2 = new sd.b
            r3 = 1
            r2.<init>(r7, r3)
            r0.setOnClickListener(r2)
            T extends w1.a r0 = r7.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.n r0 = (p171jd.C3539n) r0
            com.google.android.material.button.MaterialButton r0 = r0.f15349b
            java.lang.String r2 = "binding.buttonClaimTaco"
            p214m2.C4339q.m9705j(r0, r2)
            io.tacocrypto.app.ui.balance.BalanceFragment$c r2 = new io.tacocrypto.app.ui.balance.BalanceFragment$c
            r2.<init>(r7)
            vg.C6664e.m13509j(r0, r1, r2, r3)
            T extends w1.a r0 = r7.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.n r0 = (p171jd.C3539n) r0
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f15357j
            sd.b r2 = new sd.b
            r4 = 2
            r2.<init>(r7, r4)
            r0.setOnClickListener(r2)
            T extends w1.a r0 = r7.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.n r0 = (p171jd.C3539n) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15360m
            vg.t r2 = new vg.t
            android.content.Context r4 = r7.m1334s0()
            android.content.Context r4 = r4.getApplicationContext()
            java.lang.String r5 = "requireContext().applicationContext"
            p214m2.C4339q.m9705j(r4, r5)
            r5 = 2131231395(0x7f0802a3, float:1.807887E38)
            r6 = 4
            r2.<init>(r4, r5, r1, r6)
            r0.m1754g(r2)
            T extends w1.a r0 = r7.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.n r0 = (p171jd.C3539n) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15360m
            sd.a r2 = r7.f14255W0
            r0.setAdapter(r2)
            T extends w1.a r0 = r7.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.n r0 = (p171jd.C3539n) r0
            jd.h r0 = r0.f15352e
            java.lang.Object r0 = r0.f15195c
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            r2 = 2131231255(0x7f080217, float:1.8078586E38)
            r0.setImageResource(r2)
            T extends w1.a r0 = r7.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.n r0 = (p171jd.C3539n) r0
            jd.h r0 = r0.f15350c
            java.lang.Object r0 = r0.f15195c
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            r2 = 2131231038(0x7f08013e, float:1.8078146E38)
            r0.setImageResource(r2)
            T extends w1.a r0 = r7.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.n r0 = (p171jd.C3539n) r0
            jd.h r0 = r0.f15351d
            java.lang.Object r0 = r0.f15195c
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            r2 = 2131231073(0x7f080161, float:1.8078217E38)
            r0.setImageResource(r2)
            T extends w1.a r0 = r7.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.n r0 = (p171jd.C3539n) r0
            jd.h r0 = r0.f15352e
            com.google.android.material.card.MaterialCardView r0 = r0.m7988f()
            java.lang.String r2 = "binding.cardSort.root"
            p214m2.C4339q.m9705j(r0, r2)
            io.tacocrypto.app.ui.balance.BalanceFragment$d r2 = new io.tacocrypto.app.ui.balance.BalanceFragment$d
            r2.<init>(r7)
            vg.C6664e.m13509j(r0, r1, r2, r3)
            T extends w1.a r0 = r7.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.n r0 = (p171jd.C3539n) r0
            jd.h r0 = r0.f15350c
            com.google.android.material.card.MaterialCardView r0 = r0.m7988f()
            java.lang.String r2 = "binding.cardGraph.root"
            p214m2.C4339q.m9705j(r0, r2)
            io.tacocrypto.app.ui.balance.BalanceFragment$e r2 = new io.tacocrypto.app.ui.balance.BalanceFragment$e
            r2.<init>(r7)
            vg.C6664e.m13509j(r0, r1, r2, r3)
            T extends w1.a r0 = r7.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.n r0 = (p171jd.C3539n) r0
            jd.h r0 = r0.f15351d
            com.google.android.material.card.MaterialCardView r0 = r0.m7988f()
            java.lang.String r2 = "binding.cardHide.root"
            p214m2.C4339q.m9705j(r0, r2)
            io.tacocrypto.app.ui.balance.BalanceFragment$f r2 = new io.tacocrypto.app.ui.balance.BalanceFragment$f
            r2.<init>(r7)
            vg.C6664e.m13509j(r0, r1, r2, r3)
            return
    }

    @Override // td.AbstractC6215c
    /* renamed from: G0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3539n> mo7722G0() {
            r2 = this;
            io.tacocrypto.app.ui.balance.BalanceFragment$i r0 = io.tacocrypto.app.p156ui.balance.BalanceFragment.C3209i.f14264g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    /* renamed from: H0 */
    public final sd.C6034d m7723H0() {
            r1 = this;
            ch.d r0 = r1.f14254V0
            java.lang.Object r0 = r0.getValue()
            sd.d r0 = (sd.C6034d) r0
            return r0
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r3) {
            r2 = this;
            super.mo114V(r3)
            sd.d r3 = r2.m7723H0()
            nd.j1 r0 = r3.f23264e
            boolean r0 = r0.m10823d()
            r3.f23273n = r0
            nd.j1 r0 = r3.f23264e
            boolean r0 = r0.m10821b()
            r3.f23274o = r0
            sd.d r3 = r2.m7723H0()
            r3.m12516g()
            io.tacocrypto.app.TacoApplication r3 = vg.C6672m.m13530q(r2)
            nd.j1 r3 = r3.m7710e()
            boolean r3 = r3.m10822c()
            sd.a r0 = r2.f14255W0
            boolean r1 = r0.f23248i
            if (r1 == r3) goto L37
            r0.f23248i = r3
            androidx.recyclerview.widget.RecyclerView$f r3 = r0.f3228a
            r3.m1813b()
        L37:
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: e0 */
    public void mo1322e0() {
            r14 = this;
            r0 = 1
            r14.f2258A0 = r0
            sd.d r1 = r14.m7723H0()
            nd.j1 r2 = r1.f23264e
            boolean r2 = r2.m10823d()
            r1.f23273n = r2
            nd.j1 r2 = r1.f23264e
            boolean r2 = r2.m10821b()
            r1.f23274o = r2
            androidx.lifecycle.d0<sd.d$b> r2 = r1.f23275p
            java.lang.Object r2 = r2.m1411d()
            sd.d$b r2 = (sd.C6034d.b) r2
            r3 = 0
            if (r2 == 0) goto L2a
            boolean r4 = r1.f23273n
            boolean r2 = r2.f23293a
            if (r4 != r2) goto L2a
            r2 = 1
            goto L2b
        L2a:
            r2 = 0
        L2b:
            r4 = 0
            if (r2 != 0) goto L52
            androidx.lifecycle.d0<sd.d$b> r2 = r1.f23275p
            boolean r6 = r1.f23273n
            sd.d$b r13 = new sd.d$b
            io.tacocrypto.app.a r5 = io.tacocrypto.app.EnumC3199a.f14216a0
            java.lang.String r9 = p097fd.C2139a.m5697a(r5)
            r10 = 0
            r11 = 0
            r12 = 48
            java.lang.String r7 = "WAX"
            java.lang.String r8 = "staked"
            r5 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r2.mo7l(r13)
            boolean r2 = r1.f23273n
            if (r2 != 0) goto L52
            androidx.lifecycle.d0<sd.d$b> r2 = r1.f23275p
            r2.mo7l(r4)
        L52:
            androidx.lifecycle.d0<sd.d$b> r2 = r1.f23277r
            java.lang.Object r2 = r2.m1411d()
            sd.d$b r2 = (sd.C6034d.b) r2
            if (r2 == 0) goto L63
            boolean r5 = r1.f23274o
            boolean r2 = r2.f23293a
            if (r5 != r2) goto L63
            goto L64
        L63:
            r0 = 0
        L64:
            if (r0 != 0) goto L8a
            androidx.lifecycle.d0<sd.d$b> r0 = r1.f23277r
            boolean r6 = r1.f23274o
            sd.d$b r2 = new sd.d$b
            io.tacocrypto.app.ui.secret.c r3 = io.tacocrypto.app.p156ui.secret.EnumC3251c.f14333Z
            java.lang.String r9 = r3.m7731e()
            r10 = 0
            r11 = 0
            r12 = 48
            java.lang.String r7 = "WAX"
            java.lang.String r8 = "NFT est. value"
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0.mo7l(r2)
            boolean r0 = r1.f23274o
            if (r0 != 0) goto L8a
            androidx.lifecycle.d0<sd.d$b> r0 = r1.f23277r
            r0.mo7l(r4)
        L8a:
            r1.m12516g()
            io.tacocrypto.app.TacoApplication r0 = vg.C6672m.m13530q(r14)
            nd.j1 r0 = r0.m7710e()
            boolean r0 = r0.m10822c()
            sd.a r1 = r14.f14255W0
            boolean r2 = r1.f23248i
            if (r2 == r0) goto La6
            r1.f23248i = r0
            androidx.recyclerview.widget.RecyclerView$f r0 = r1.f3228a
            r0.m1813b()
        La6:
            return
    }
}
