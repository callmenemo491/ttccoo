package io.tacocrypto.app.p156ui.main;

/* loaded from: classes.dex */
public final class MainActivity extends td.AbstractActivityC6214b<p171jd.C3491b> {

    /* renamed from: n0 */
    public static final /* synthetic */ int f14305n0 = 0;

    /* renamed from: m0 */
    public final ch.InterfaceC0977d f14306m0;

    /* renamed from: io.tacocrypto.app.ui.main.MainActivity$a */
    public static final class C3232a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.activity.ComponentActivity f14307Z;

        public C3232a(androidx.activity.ComponentActivity r1) {
                r0 = this;
                r0.f14307Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                androidx.activity.ComponentActivity r0 = r2.f14307Z
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: io.tacocrypto.app.ui.main.MainActivity$b */
    public static final class C3233b extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.main.MainActivity f14308Z;

        public C3233b(io.tacocrypto.app.p156ui.main.MainActivity r1) {
                r0 = this;
                r0.f14308Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                io.tacocrypto.app.ui.main.MainActivity r0 = r1.f14308Z
                vg.i r0 = p185k7.C3828h5.m8600o(r0)
                return r0
        }
    }

    public MainActivity() {
            r4 = this;
            r4.<init>()
            io.tacocrypto.app.ui.main.MainActivity$b r0 = new io.tacocrypto.app.ui.main.MainActivity$b
            r0.<init>(r4)
            androidx.lifecycle.o0 r1 = new androidx.lifecycle.o0
            java.lang.Class<yd.f> r2 = p436yd.C7161f.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            io.tacocrypto.app.ui.main.MainActivity$a r3 = new io.tacocrypto.app.ui.main.MainActivity$a
            r3.<init>(r4)
            r1.<init>(r2, r3, r0)
            r4.f14306m0 = r1
            return
    }

    /* renamed from: A */
    public final p436yd.C7161f m7727A() {
            r1 = this;
            ch.d r0 = r1.f14306m0
            java.lang.Object r0 = r0.getValue()
            yd.f r0 = (p436yd.C7161f) r0
            return r0
    }

    /* renamed from: B */
    public final void m7728B(android.content.Intent r12) {
            r11 = this;
            if (r12 == 0) goto L13
            android.os.Bundle r0 = r12.getExtras()
            if (r0 == 0) goto L13
            java.lang.String r1 = "url"
            java.lang.String r0 = r0.getString(r1)
            if (r0 == 0) goto L13
            vg.C6672m.m13520g(r11, r0)
        L13:
            r0 = 0
            if (r12 == 0) goto L1b
            java.lang.String r1 = r12.getAction()
            goto L1c
        L1b:
            r1 = r0
        L1c:
            if (r12 == 0) goto L23
            android.net.Uri r2 = r12.getData()
            goto L24
        L23:
            r2 = r0
        L24:
            java.lang.String r3 = "android.intent.action.VIEW"
            boolean r1 = p214m2.C4339q.m9702c(r3, r1)
            java.lang.String r4 = "jkhlguyf"
            r5 = 2
            java.lang.String r6 = "appLinkData.toString()"
            r7 = 0
            if (r1 == 0) goto La0
            if (r2 == 0) goto La0
            java.lang.String r1 = r2.toString()
            p214m2.C4339q.m9705j(r1, r6)
            hk.a$b r8 = hk.C3053a.m7466a(r4)
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r8.mo7467a(r1, r9)
            java.lang.String r8 = "taco://signtransaction"
            boolean r1 = p362uh.C6463i.m13061R(r1, r8, r7, r5)
            if (r1 != 0) goto L4d
            goto La0
        L4d:
            java.lang.String r1 = "sig"
            java.lang.String r1 = r2.getQueryParameter(r1)
            if (r1 == 0) goto L5e
            boolean r2 = p362uh.C6463i.m13054K(r1)
            if (r2 == 0) goto L5c
            goto L5e
        L5c:
            r2 = 0
            goto L5f
        L5e:
            r2 = 1
        L5f:
            if (r2 != 0) goto La0
            android.app.Application r2 = r11.getApplication()
            boolean r8 = r2 instanceof io.tacocrypto.app.TacoApplication
            if (r8 == 0) goto L6c
            io.tacocrypto.app.TacoApplication r2 = (io.tacocrypto.app.TacoApplication) r2
            goto L6d
        L6c:
            r2 = r0
        L6d:
            if (r2 == 0) goto La0
            nd.b0 r2 = r2.m7708c()
            java.lang.String r8 = "firstSign"
            p214m2.C4339q.m9706k(r1, r8)
            od.u0 r8 = r2.f18920p
            mh.p<? super java.lang.Boolean, ? super java.lang.String, ch.l> r9 = r2.f18918n
            if (r9 != 0) goto La0
            mh.q<? super java.lang.Boolean, ? super java.lang.String, ? super od.t0, ch.l> r9 = r2.f18919o
            if (r9 == 0) goto La0
            if (r8 == 0) goto La0
            java.math.BigInteger r9 = r8.getBlock_num()
            java.lang.String r8 = r8.getSerializedTx()
            java.util.List r1 = p074e9.C1805a.m4528m(r1)
            od.t0 r10 = new od.t0
            r10.<init>(r9, r1, r8)
            mh.q<? super java.lang.Boolean, ? super java.lang.String, ? super od.t0, ch.l> r1 = r2.f18919o
            if (r1 == 0) goto La0
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r8 = "Transaction completed!"
            r1.mo115i(r2, r8, r10)
        La0:
            if (r12 == 0) goto La7
            java.lang.String r1 = r12.getAction()
            goto La8
        La7:
            r1 = r0
        La8:
            if (r12 == 0) goto Laf
            android.net.Uri r2 = r12.getData()
            goto Lb0
        Laf:
            r2 = r0
        Lb0:
            boolean r1 = p214m2.C4339q.m9702c(r3, r1)
            if (r1 == 0) goto L114
            if (r2 == 0) goto L114
            java.lang.String r1 = r2.toString()
            p214m2.C4339q.m9705j(r1, r6)
            hk.a$b r4 = hk.C3053a.m7466a(r4)
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r4.mo7467a(r1, r8)
            java.lang.String r4 = "taco://transfer"
            boolean r1 = p362uh.C6463i.m13061R(r1, r4, r7, r5)
            if (r1 != 0) goto Ld1
            goto L114
        Ld1:
            java.lang.String r1 = "tx"
            java.lang.String r1 = r2.getQueryParameter(r1)
            java.lang.String r4 = "bn"
            java.lang.String r2 = r2.getQueryParameter(r4)
            if (r1 == 0) goto Le8
            boolean r1 = p362uh.C6463i.m13054K(r1)
            if (r1 == 0) goto Le6
            goto Le8
        Le6:
            r1 = 0
            goto Le9
        Le8:
            r1 = 1
        Le9:
            if (r1 != 0) goto L114
            if (r2 == 0) goto Lf6
            boolean r1 = p362uh.C6463i.m13054K(r2)
            if (r1 == 0) goto Lf4
            goto Lf6
        Lf4:
            r1 = 0
            goto Lf7
        Lf6:
            r1 = 1
        Lf7:
            if (r1 != 0) goto L114
            android.app.Application r1 = r11.getApplication()
            boolean r2 = r1 instanceof io.tacocrypto.app.TacoApplication
            if (r2 == 0) goto L104
            io.tacocrypto.app.TacoApplication r1 = (io.tacocrypto.app.TacoApplication) r1
            goto L105
        L104:
            r1 = r0
        L105:
            if (r1 == 0) goto L114
            nd.b0 r1 = r1.m7708c()
            mh.p<? super java.lang.Boolean, ? super java.lang.String, ch.l> r1 = r1.f18918n
            if (r1 == 0) goto L114
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.mo122l(r2, r0)
        L114:
            if (r12 == 0) goto L11b
            java.lang.String r1 = r12.getAction()
            goto L11c
        L11b:
            r1 = r0
        L11c:
            if (r12 == 0) goto L122
            android.net.Uri r0 = r12.getData()
        L122:
            boolean r12 = p214m2.C4339q.m9702c(r3, r1)
            if (r12 == 0) goto L16b
            if (r0 == 0) goto L16b
            java.lang.String r12 = r0.toString()
            p214m2.C4339q.m9705j(r12, r6)
            java.lang.String r0 = "stringValue"
            p214m2.C4339q.m9706k(r12, r0)
            java.lang.String r0 = "https://tacocrypto.io/transfer/request?data="
            boolean r0 = p362uh.C6463i.m13061R(r12, r0, r7, r5)
            if (r0 == 0) goto L16b
            ce.f r12 = p185k7.C3836i.m8622g(r12)     // Catch: java.lang.Throwable -> L143
            goto L148
        L143:
            r12 = move-exception
            java.lang.Object r12 = p074e9.C1805a.m4520e(r12)
        L148:
            boolean r0 = r12 instanceof ch.C0979f.a
            r0 = r0 ^ 1
            if (r0 == 0) goto L15d
            r0 = r12
            ce.f r0 = (p041ce.C0955f) r0
            androidx.fragment.app.d0 r1 = r11.m1354t()
            java.lang.String r2 = "supportFragmentManager"
            p214m2.C4339q.m9705j(r1, r2)
            p455zd.C7301f.m14396Q0(r1, r0)
        L15d:
            java.lang.Throwable r12 = ch.C0979f.m2690b(r12)
            if (r12 == 0) goto L16b
            yd.c r0 = new yd.c
            r0.<init>(r12)
            p458zg.C7331c.m14404c(r11, r0)
        L16b:
            return
    }

    /* renamed from: C */
    public final void m7729C() {
            r21 = this;
            r0 = 5
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            r1 = 2131755009(0x7f100001, float:1.9140885E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            r1 = 2131755008(0x7f100000, float:1.9140883E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            r1 = 2131755014(0x7f100006, float:1.9140895E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            r1 = 2131755012(0x7f100004, float:1.9140891E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            r1 = 2131755013(0x7f100005, float:1.9140893E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            java.util.List r0 = p074e9.C1805a.m4529n(r0)
            r1 = r21
            T extends w1.a r2 = r1.f24169l0
            p214m2.C4339q.m9704i(r2)
            jd.b r2 = (p171jd.C3491b) r2
            com.google.android.material.bottomnavigation.BottomNavigationView r7 = r2.f15011b
            java.lang.String r2 = "binding.bottomNav"
            p214m2.C4339q.m9705j(r7, r2)
            androidx.fragment.app.d0 r2 = r21.m1354t()
            java.lang.String r3 = "supportFragmentManager"
            p214m2.C4339q.m9705j(r2, r3)
            r3 = 2131362444(0x7f0a028c, float:1.8344669E38)
            android.content.Intent r4 = r21.getIntent()
            java.lang.String r5 = "intent"
            p214m2.C4339q.m9705j(r4, r5)
            r15 = 0
            java.lang.String r6 = "<this>"
            p214m2.C4339q.m9706k(r7, r6)
            java.lang.String r6 = "navGraphIds"
            p214m2.C4339q.m9706k(r0, r6)
            java.lang.String r6 = "fragmentManager"
            p214m2.C4339q.m9706k(r2, r6)
            p214m2.C4339q.m9706k(r4, r5)
            s.i r5 = new s.i
            r5.<init>()
            androidx.lifecycle.d0 r6 = new androidx.lifecycle.d0
            r6.<init>()
            nh.o r14 = new nh.o
            r14.<init>()
            java.util.Iterator r8 = r0.iterator()
            r9 = 0
        L84:
            boolean r10 = r8.hasNext()
            java.lang.String r13 = "bottomNavigation#"
            r16 = 0
            if (r10 == 0) goto Lf5
            java.lang.Object r10 = r8.next()
            int r11 = r9 + 1
            if (r9 < 0) goto Lf1
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            java.lang.String r12 = android.support.v4.media.C0142a.m254a(r13, r9)
            androidx.navigation.fragment.NavHostFragment r10 = p185k7.C3836i.m8627l(r2, r12, r10, r3)
            androidx.navigation.NavController r13 = r10.m1584E0()
            androidx.navigation.o r13 = r13.m1565d()
            int r13 = r13.f2973a0
            if (r9 != 0) goto Lb2
            r14.f19230Y = r13
        Lb2:
            r5.m12351g(r13, r12)
            r5.m12351g(r13, r12)
            int r12 = r7.getSelectedItemId()
            if (r12 != r13) goto Le1
            androidx.navigation.NavController r12 = r10.m1584E0()
            r6.mo7l(r12)
            if (r9 != 0) goto Lc9
            r9 = 1
            goto Lca
        Lc9:
            r9 = 0
        Lca:
            androidx.fragment.app.a r12 = new androidx.fragment.app.a
            r12.<init>(r2)
            androidx.fragment.app.m0$a r13 = new androidx.fragment.app.m0$a
            r3 = 7
            r13.<init>(r3, r10)
            r12.m1292c(r13)
            if (r9 == 0) goto Ldd
            r12.m1087q(r10)
        Ldd:
            r12.m1079i()
            goto Lec
        Le1:
            androidx.fragment.app.a r3 = new androidx.fragment.app.a
            r3.<init>(r2)
            r3.m1080j(r10)
            r3.m1079i()
        Lec:
            r9 = r11
            r3 = 2131362444(0x7f0a028c, float:1.8344669E38)
            goto L84
        Lf1:
            p074e9.C1805a.m4539x()
            throw r16
        Lf5:
            nh.q r11 = new nh.q
            r11.<init>()
            int r3 = r7.getSelectedItemId()
            java.lang.Object r3 = r5.m12348d(r3)
            r11.f19232Y = r3
            int r3 = r14.f19230Y
            java.lang.Object r3 = r5.m12348d(r3)
            p214m2.C4339q.m9704i(r3)
            java.lang.String r3 = (java.lang.String) r3
            nh.n r12 = new nh.n
            r12.<init>()
            T r8 = r11.f19232Y
            boolean r8 = p214m2.C4339q.m9702c(r8, r3)
            r12.f19229Y = r8
            vg.k r10 = new vg.k
            r8 = r10
            r9 = r2
            r18 = r10
            r10 = r5
            r17 = r12
            r12 = r3
            r19 = r13
            r13 = r17
            r20 = r14
            r14 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r8 = r18
            r7.setOnItemSelectedListener(r8)
            f1.g0 r8 = new f1.g0
            r8.<init>(r5, r2)
            r7.setOnItemReselectedListener(r8)
            java.util.Iterator r0 = r0.iterator()
            r5 = 0
        L142:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L19d
            java.lang.Object r8 = r0.next()
            int r9 = r5 + 1
            if (r5 < 0) goto L199
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r11 = r19
            r10.append(r11)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            r10 = 2131362444(0x7f0a028c, float:1.8344669E38)
            androidx.navigation.fragment.NavHostFragment r5 = p185k7.C3836i.m8627l(r2, r5, r8, r10)
            androidx.navigation.NavController r8 = r5.m1584E0()
            boolean r8 = r8.m1566e(r4)
            if (r8 == 0) goto L195
            int r8 = r7.getSelectedItemId()
            androidx.navigation.NavController r10 = r5.m1584E0()
            androidx.navigation.o r10 = r10.m1565d()
            int r10 = r10.f2973a0
            if (r8 == r10) goto L195
            androidx.navigation.NavController r5 = r5.m1584E0()
            androidx.navigation.o r5 = r5.m1565d()
            int r5 = r5.f2973a0
            r7.setSelectedItemId(r5)
        L195:
            r5 = r9
            r19 = r11
            goto L142
        L199:
            p074e9.C1805a.m4539x()
            throw r16
        L19d:
            vg.j r0 = new vg.j
            r8 = r3
            r3 = r0
            r4 = r17
            r5 = r2
            r9 = r6
            r6 = r8
            r8 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.util.ArrayList<androidx.fragment.app.d0$m> r3 = r2.f2124l
            if (r3 != 0) goto L1b6
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f2124l = r3
        L1b6:
            java.util.ArrayList<androidx.fragment.app.d0$m> r2 = r2.f2124l
            r2.add(r0)
            return
    }

    @Override // td.AbstractActivityC6214b, androidx.fragment.app.ActivityC0405s, androidx.activity.ComponentActivity, p030c0.ActivityC0820g, android.app.Activity
    public void onCreate(android.os.Bundle r5) {
            r4 = this;
            super.onCreate(r5)
            java.lang.String r0 = "null cannot be cast to non-null type io.tacocrypto.app.TacoApplication"
            r1 = 0
            r2 = 1
            if (r5 != 0) goto Ld
            r4.m7729C()
            goto L3e
        Ld:
            android.app.Application r5 = r4.getApplication()
            java.util.Objects.requireNonNull(r5, r0)
            io.tacocrypto.app.TacoApplication r5 = (io.tacocrypto.app.TacoApplication) r5
            nd.b0 r5 = r5.m7708c()
            androidx.lifecycle.LiveData<java.util.List<id.b>> r5 = r5.f18925u
            java.lang.Object r5 = r5.m1411d()
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L2d
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L2b
            goto L2d
        L2b:
            r5 = 0
            goto L2e
        L2d:
            r5 = 1
        L2e:
            if (r5 == 0) goto L3e
            android.content.Intent r5 = new android.content.Intent
            java.lang.Class<io.tacocrypto.app.ui.splash.SplashActivity> r0 = io.tacocrypto.app.p156ui.splash.SplashActivity.class
            r5.<init>(r4, r0)
            r4.startActivity(r5)
            r4.finish()
            return
        L3e:
            android.app.Application r5 = r4.getApplication()
            java.util.Objects.requireNonNull(r5, r0)
            io.tacocrypto.app.TacoApplication r5 = (io.tacocrypto.app.TacoApplication) r5
            nd.b0 r5 = r5.m7708c()
            androidx.lifecycle.LiveData<java.util.List<id.b>> r5 = r5.f18925u
            yd.b r0 = new yd.b
            r0.<init>(r4, r1)
            r5.m1413f(r4, r0)
            yd.f r5 = r4.m7727A()
            nd.b0 r0 = r5.f27624d
            androidx.lifecycle.LiveData<java.util.List<id.b>> r0 = r0.f18925u
            java.lang.Object r0 = r0.m1411d()
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L67
            dh.k r0 = p062dh.C1475k.f7237Y
        L67:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L7b
            nd.b0 r0 = r5.f27624d
            androidx.lifecycle.LiveData<java.util.List<id.b>> r0 = r0.f18925u
            mh.l<java.util.List<id.b>, ch.l> r5 = r5.f27626f
            yd.d r3 = new yd.d
            r3.<init>(r5, r2)
            r0.m1414g(r3)
        L7b:
            android.content.Intent r5 = r4.getIntent()
            r4.m7728B(r5)
            T extends w1.a r5 = r4.f24169l0
            p214m2.C4339q.m9704i(r5)
            jd.b r5 = (p171jd.C3491b) r5
            com.google.android.material.card.MaterialCardView r5 = r5.f15012c
            yd.a r0 = new yd.a
            r0.<init>(r4, r1)
            r5.setOnClickListener(r0)
            T extends w1.a r5 = r4.f24169l0
            p214m2.C4339q.m9704i(r5)
            jd.b r5 = (p171jd.C3491b) r5
            androidx.appcompat.widget.AppCompatImageView r5 = r5.f15017h
            yd.a r0 = new yd.a
            r0.<init>(r4, r2)
            r5.setOnClickListener(r0)
            T extends w1.a r5 = r4.f24169l0
            p214m2.C4339q.m9704i(r5)
            jd.b r5 = (p171jd.C3491b) r5
            androidx.appcompat.widget.AppCompatImageView r5 = r5.f15015f
            yd.a r0 = new yd.a
            r1 = 2
            r0.<init>(r4, r1)
            r5.setOnClickListener(r0)
            T extends w1.a r5 = r4.f24169l0
            p214m2.C4339q.m9704i(r5)
            jd.b r5 = (p171jd.C3491b) r5
            androidx.appcompat.widget.AppCompatImageView r5 = r5.f15016g
            yd.a r0 = new yd.a
            r3 = 3
            r0.<init>(r4, r3)
            r5.setOnClickListener(r0)
            yd.f r5 = r4.m7727A()
            androidx.lifecycle.d0<cg.l$a> r5 = r5.f27628h
            yd.b r0 = new yd.b
            r0.<init>(r4, r2)
            r5.m1413f(r4, r0)
            yd.f r5 = r4.m7727A()
            androidx.lifecycle.d0<java.lang.Boolean> r5 = r5.f27629i
            yd.b r0 = new yd.b
            r0.<init>(r4, r1)
            r5.m1413f(r4, r0)
            yd.f r5 = r4.m7727A()
            androidx.lifecycle.LiveData<java.lang.Boolean> r5 = r5.f27632l
            yd.b r0 = new yd.b
            r0.<init>(r4, r3)
            r5.m1413f(r4, r0)
            yd.f r5 = r4.m7727A()
            androidx.lifecycle.LiveData<java.lang.Boolean> r5 = r5.f27634n
            yd.b r0 = new yd.b
            r1 = 4
            r0.<init>(r4, r1)
            r5.m1413f(r4, r0)
            return
    }

    @Override // androidx.fragment.app.ActivityC0405s, android.app.Activity
    public void onNewIntent(android.content.Intent r1) {
            r0 = this;
            super.onNewIntent(r1)
            r0.m7728B(r1)
            return
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle r2) {
            r1 = this;
            java.lang.String r0 = "savedInstanceState"
            p214m2.C4339q.m9706k(r2, r0)
            super.onRestoreInstanceState(r2)
            r1.m7729C()
            return
    }

    @Override // androidx.fragment.app.ActivityC0405s, android.app.Activity
    public void onResume() {
            r1 = this;
            super.onResume()
            yd.f r0 = r1.m7727A()
            nd.u r0 = r0.f27625e
            r0.m10833a()
            return
    }

    @Override // td.AbstractActivityC6214b
    /* renamed from: z */
    public p383w1.InterfaceC6776a mo7726z() {
            r15 = this;
            android.view.LayoutInflater r0 = r15.getLayoutInflater()
            r1 = 2131558429(0x7f0d001d, float:1.8742174E38)
            r2 = 0
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r1 = 2131361931(0x7f0a008b, float:1.8343628E38)
            android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
            r5 = r2
            com.google.android.material.bottomnavigation.BottomNavigationView r5 = (com.google.android.material.bottomnavigation.BottomNavigationView) r5
            if (r5 == 0) goto L8f
            r1 = 2131361994(0x7f0a00ca, float:1.8343756E38)
            android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
            r6 = r2
            androidx.cardview.widget.CardView r6 = (androidx.cardview.widget.CardView) r6
            if (r6 == 0) goto L8f
            r1 = 2131361995(0x7f0a00cb, float:1.8343758E38)
            android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
            r7 = r2
            com.google.android.material.card.MaterialCardView r7 = (com.google.android.material.card.MaterialCardView) r7
            if (r7 == 0) goto L8f
            r1 = 2131362057(0x7f0a0109, float:1.8343884E38)
            android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
            r8 = r2
            androidx.appcompat.widget.LinearLayoutCompat r8 = (androidx.appcompat.widget.LinearLayoutCompat) r8
            if (r8 == 0) goto L8f
            r1 = 2131362262(0x7f0a01d6, float:1.83443E38)
            android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
            r9 = r2
            androidx.appcompat.widget.AppCompatImageView r9 = (androidx.appcompat.widget.AppCompatImageView) r9
            if (r9 == 0) goto L8f
            r1 = 2131362440(0x7f0a0288, float:1.834466E38)
            android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
            r10 = r2
            androidx.appcompat.widget.AppCompatTextView r10 = (androidx.appcompat.widget.AppCompatTextView) r10
            if (r10 == 0) goto L8f
            r1 = 2131362444(0x7f0a028c, float:1.8344669E38)
            android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
            r11 = r2
            androidx.fragment.app.FragmentContainerView r11 = (androidx.fragment.app.FragmentContainerView) r11
            if (r11 == 0) goto L8f
            r1 = 2131362494(0x7f0a02be, float:1.834477E38)
            android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
            r12 = r2
            androidx.appcompat.widget.AppCompatImageView r12 = (androidx.appcompat.widget.AppCompatImageView) r12
            if (r12 == 0) goto L8f
            r1 = 2131362595(0x7f0a0323, float:1.8344975E38)
            android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
            r13 = r2
            androidx.appcompat.widget.AppCompatImageView r13 = (androidx.appcompat.widget.AppCompatImageView) r13
            if (r13 == 0) goto L8f
            r1 = 2131362632(0x7f0a0348, float:1.834505E38)
            android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
            r14 = r2
            androidx.appcompat.widget.AppCompatImageView r14 = (androidx.appcompat.widget.AppCompatImageView) r14
            if (r14 == 0) goto L8f
            jd.b r1 = new jd.b
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r1
        L8f:
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
    }
}
