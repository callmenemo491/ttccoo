package io.tacocrypto.app.p156ui.splash;

/* loaded from: classes.dex */
public final class SplashActivity extends p083f.ActivityC1921h {

    /* renamed from: n0 */
    public static final /* synthetic */ int f14385n0 = 0;

    /* renamed from: l0 */
    public final ch.InterfaceC0977d f14386l0;

    /* renamed from: m0 */
    public vg.C6678s f14387m0;

    /* renamed from: io.tacocrypto.app.ui.splash.SplashActivity$a */
    public static final class C3275a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.lang.Boolean, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.splash.SplashActivity f14388Z;

        /* renamed from: a0 */
        public final /* synthetic */ java.lang.String f14389a0;

        public C3275a(io.tacocrypto.app.p156ui.splash.SplashActivity r1, java.lang.String r2) {
                r0 = this;
                r0.f14388Z = r1
                r0.f14389a0 = r2
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(java.lang.Boolean r19) {
                r18 = this;
                r0 = r18
                r1 = r19
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                r1.booleanValue()
                io.tacocrypto.app.ui.splash.SplashActivity r1 = r0.f14388Z
                io.tacocrypto.app.ui.splash.a r2 = new io.tacocrypto.app.ui.splash.a
                java.lang.String r3 = r0.f14389a0
                r2.<init>(r1, r3)
                vg.s r3 = r1.f14387m0
                r4 = 0
                if (r3 == 0) goto Lbb
                gb.c r3 = r3.f25948a
                java.lang.String r5 = "version"
                ha.b r3 = p074e9.C1805a.m4525j(r3, r5)
                java.lang.String r3 = r3.m7366a()
                java.lang.String r5 = "remoteConfig[VERSION_KEY].asString()"
                p214m2.C4339q.m9705j(r3, r5)
                java.lang.Integer r5 = p362uh.C6462h.m13049F(r3)
                if (r5 == 0) goto L33
                int r5 = r5.intValue()
                goto L34
            L33:
                r5 = -1
            L34:
                java.lang.String r6 = "RemoteConfigUtils"
                hk.a$b r6 = hk.C3053a.m7466a(r6)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "version: value: "
                r7.append(r8)
                r7.append(r3)
                java.lang.String r3 = ", result: "
                r7.append(r3)
                r7.append(r5)
                java.lang.String r3 = r7.toString()
                r7 = 0
                java.lang.Object[] r7 = new java.lang.Object[r7]
                r6.mo7467a(r3, r7)
                r3 = 105(0x69, float:1.47E-43)
                if (r5 <= r3) goto Lb5
                androidx.lifecycle.w r3 = r1.f586a0
                java.lang.String r5 = "lifecycle"
                p214m2.C4339q.m9705j(r3, r5)
            L64:
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r5 = r3.f2543a
                java.lang.Object r5 = r5.get()
                androidx.lifecycle.LifecycleCoroutineScopeImpl r5 = (androidx.lifecycle.LifecycleCoroutineScopeImpl) r5
                if (r5 == 0) goto L70
            L6e:
                r12 = r5
                goto La1
            L70:
                androidx.lifecycle.LifecycleCoroutineScopeImpl r5 = new androidx.lifecycle.LifecycleCoroutineScopeImpl
                r6 = 1
                vh.r r6 = p209lh.C4304a.m9607a(r4, r6)
                vh.z r7 = p379vh.C6716l0.f26007a
                vh.k1 r7 = p459zh.C7346l.f28106a
                vh.k1 r8 = r7.mo13640z0()
                vh.g1 r6 = (p379vh.C6702g1) r6
                fh.g r6 = p101fh.InterfaceC2175g.a.C7391a.m5740d(r6, r8)
                r5.<init>(r3, r6)
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r6 = r3.f2543a
                boolean r6 = r6.compareAndSet(r4, r5)
                if (r6 == 0) goto L64
                vh.k1 r7 = r7.mo13640z0()
                androidx.lifecycle.r r9 = new androidx.lifecycle.r
                r9.<init>(r5, r4)
                r10 = 2
                r11 = 0
                r8 = 0
                r6 = r5
                p101fh.C2174f.m5728r(r6, r7, r8, r9, r10, r11)
                goto L6e
            La1:
                ie.b r3 = new ie.b
                r3.<init>(r1, r2, r4)
                androidx.lifecycle.p r15 = new androidx.lifecycle.p
                r15.<init>(r12, r3, r4)
                r13 = 0
                r16 = 3
                r17 = 0
                r14 = 0
                p101fh.C2174f.m5728r(r12, r13, r14, r15, r16, r17)
                goto Lb8
            Lb5:
                r2.mo15e()
            Lb8:
                ch.l r1 = ch.C0985l.f5061a
                return r1
            Lbb:
                java.lang.String r1 = "remoteConfigUtils"
                p214m2.C4339q.m9713w(r1)
                throw r4
        }
    }

    /* renamed from: io.tacocrypto.app.ui.splash.SplashActivity$b */
    public static final class C3276b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<ch.C0985l, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.splash.SplashActivity f14390Z;

        public C3276b(io.tacocrypto.app.p156ui.splash.SplashActivity r1) {
                r0 = this;
                r0.f14390Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(ch.C0985l r4) {
                r3 = this;
                ch.l r4 = (ch.C0985l) r4
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r4, r0)
                io.tacocrypto.app.ui.splash.SplashActivity r4 = r3.f14390Z
                r0 = 0
                r1 = 2
                java.lang.String r2 = "Cannot connect to Internet...Please check your connection!"
                vg.C6664e.m13511l(r4, r2, r0, r1)
                io.tacocrypto.app.ui.splash.SplashActivity r4 = r3.f14390Z
                r4.finish()
                ch.l r4 = ch.C0985l.f5061a
                return r4
        }
    }

    /* renamed from: io.tacocrypto.app.ui.splash.SplashActivity$c */
    public static final class C3277c extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<ch.C0985l, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.splash.SplashActivity f14391Z;

        public C3277c(io.tacocrypto.app.p156ui.splash.SplashActivity r1) {
                r0 = this;
                r0.f14391Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(ch.C0985l r4) {
                r3 = this;
                ch.l r4 = (ch.C0985l) r4
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r4, r0)
                io.tacocrypto.app.ui.splash.SplashActivity r4 = r3.f14391Z
                android.content.Intent r0 = new android.content.Intent
                io.tacocrypto.app.ui.splash.SplashActivity r1 = r3.f14391Z
                java.lang.Class<io.tacocrypto.app.ui.login.LoginActivity> r2 = io.tacocrypto.app.p156ui.login.LoginActivity.class
                r0.<init>(r1, r2)
                r4.startActivity(r0)
                io.tacocrypto.app.ui.splash.SplashActivity r4 = r3.f14391Z
                r4.finish()
                ch.l r4 = ch.C0985l.f5061a
                return r4
        }
    }

    /* renamed from: io.tacocrypto.app.ui.splash.SplashActivity$d */
    public static final class C3278d extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<ch.C0985l, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.splash.SplashActivity f14392Z;

        public C3278d(io.tacocrypto.app.p156ui.splash.SplashActivity r1) {
                r0 = this;
                r0.f14392Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(ch.C0985l r4) {
                r3 = this;
                ch.l r4 = (ch.C0985l) r4
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r4, r0)
                io.tacocrypto.app.ui.splash.SplashActivity r4 = r3.f14392Z
                android.content.Intent r0 = new android.content.Intent
                io.tacocrypto.app.ui.splash.SplashActivity r1 = r3.f14392Z
                java.lang.Class<io.tacocrypto.app.ui.main.MainActivity> r2 = io.tacocrypto.app.p156ui.main.MainActivity.class
                r0.<init>(r1, r2)
                io.tacocrypto.app.ui.splash.SplashActivity r1 = r3.f14392Z
                android.content.Intent r1 = r1.getIntent()
                android.os.Bundle r1 = r1.getExtras()
                if (r1 == 0) goto L21
                r0.putExtras(r1)
            L21:
                r4.startActivity(r0)
                io.tacocrypto.app.ui.splash.SplashActivity r4 = r3.f14392Z
                r4.finish()
                ch.l r4 = ch.C0985l.f5061a
                return r4
        }
    }

    /* renamed from: io.tacocrypto.app.ui.splash.SplashActivity$e */
    public static final class C3279e extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.activity.ComponentActivity f14393Z;

        public C3279e(androidx.activity.ComponentActivity r1) {
                r0 = this;
                r0.f14393Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                androidx.activity.ComponentActivity r0 = r2.f14393Z
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: io.tacocrypto.app.ui.splash.SplashActivity$f */
    public static final class C3280f extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.splash.SplashActivity f14394Z;

        public C3280f(io.tacocrypto.app.p156ui.splash.SplashActivity r1) {
                r0 = this;
                r0.f14394Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                io.tacocrypto.app.ui.splash.SplashActivity r0 = r1.f14394Z
                vg.i r0 = p185k7.C3828h5.m8600o(r0)
                return r0
        }
    }

    public SplashActivity() {
            r4 = this;
            r4.<init>()
            io.tacocrypto.app.ui.splash.SplashActivity$f r0 = new io.tacocrypto.app.ui.splash.SplashActivity$f
            r0.<init>(r4)
            androidx.lifecycle.o0 r1 = new androidx.lifecycle.o0
            java.lang.Class<ie.e> r2 = ie.C3136e.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            io.tacocrypto.app.ui.splash.SplashActivity$e r3 = new io.tacocrypto.app.ui.splash.SplashActivity$e
            r3.<init>(r4)
            r1.<init>(r2, r3, r0)
            r4.f14386l0 = r1
            return
    }

    @Override // androidx.fragment.app.ActivityC0405s, androidx.activity.ComponentActivity, p030c0.ActivityC0820g, android.app.Activity
    public void onCreate(android.os.Bundle r7) {
            r6 = this;
            super.onCreate(r7)
            android.content.Intent r7 = r6.getIntent()
            r0 = 0
            if (r7 == 0) goto Lf
            java.lang.String r1 = r7.getAction()
            goto L10
        Lf:
            r1 = r0
        L10:
            if (r7 == 0) goto L17
            android.net.Uri r7 = r7.getData()
            goto L18
        L17:
            r7 = r0
        L18:
            java.lang.String r2 = "android.intent.action.VIEW"
            boolean r1 = p214m2.C4339q.m9702c(r2, r1)
            r2 = 1
            if (r1 == 0) goto L46
            if (r7 == 0) goto L46
            java.lang.String r1 = r7.getSchemeSpecificPart()
            java.lang.String r3 = "appLinkData.schemeSpecificPart"
            p214m2.C4339q.m9705j(r1, r3)
            r3 = 0
            r4 = 2
            java.lang.String r5 = "signed"
            boolean r1 = p362uh.C6467m.m13064U(r1, r5, r3, r4)
            if (r1 == 0) goto L46
            java.lang.String r7 = r7.getLastPathSegment()
            if (r7 != 0) goto L3e
            java.lang.String r7 = ""
        L3e:
            boolean r1 = p362uh.C6463i.m13054K(r7)
            r1 = r1 ^ r2
            if (r1 == 0) goto L46
            r0 = r7
        L46:
            vg.s r7 = new vg.s
            r7.<init>(r2)
            r6.f14387m0 = r7
            io.tacocrypto.app.ui.splash.SplashActivity$a r1 = new io.tacocrypto.app.ui.splash.SplashActivity$a
            r1.<init>(r6, r0)
            java.util.Objects.requireNonNull(r7)
            java.lang.String r0 = "callback"
            p214m2.C4339q.m9706k(r1, r0)
            gb.c r7 = r7.f25948a
            s7.i r7 = r7.m6076a()
            vg.o r0 = new vg.o
            r0.<init>(r1)
            r7.mo12444b(r0)
            ie.e r7 = r6.m7740z()
            androidx.lifecycle.d0<vg.b<ch.l>> r7 = r7.f12574h
            vg.c r0 = new vg.c
            io.tacocrypto.app.ui.splash.SplashActivity$b r1 = new io.tacocrypto.app.ui.splash.SplashActivity$b
            r1.<init>(r6)
            r0.<init>(r1)
            r7.m1413f(r6, r0)
            ie.e r7 = r6.m7740z()
            androidx.lifecycle.d0<vg.b<ch.l>> r7 = r7.f12573g
            vg.c r0 = new vg.c
            io.tacocrypto.app.ui.splash.SplashActivity$c r1 = new io.tacocrypto.app.ui.splash.SplashActivity$c
            r1.<init>(r6)
            r0.<init>(r1)
            r7.m1413f(r6, r0)
            ie.e r7 = r6.m7740z()
            androidx.lifecycle.d0<vg.b<ch.l>> r7 = r7.f12572f
            vg.c r0 = new vg.c
            io.tacocrypto.app.ui.splash.SplashActivity$d r1 = new io.tacocrypto.app.ui.splash.SplashActivity$d
            r1.<init>(r6)
            r0.<init>(r1)
            r7.m1413f(r6, r0)
            return
    }

    /* renamed from: z */
    public final ie.C3136e m7740z() {
            r1 = this;
            ch.d r0 = r1.f14386l0
            java.lang.Object r0 = r0.getValue()
            ie.e r0 = (ie.C3136e) r0
            return r0
    }
}
