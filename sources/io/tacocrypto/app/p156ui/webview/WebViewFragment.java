package io.tacocrypto.app.p156ui.webview;

/* loaded from: classes.dex */
public final class WebViewFragment extends td.AbstractC6215c<p171jd.C3561u> implements p238nd.InterfaceC4727b {

    /* renamed from: W0 */
    public static final /* synthetic */ int f14525W0 = 0;

    /* renamed from: V0 */
    public final ch.InterfaceC0977d f14526V0;

    /* renamed from: io.tacocrypto.app.ui.webview.WebViewFragment$a */
    public static final class C3373a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.lang.Boolean, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.webview.WebViewFragment f14527Z;

        public C3373a(io.tacocrypto.app.p156ui.webview.WebViewFragment r1) {
                r0 = this;
                r0.f14527Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(java.lang.Boolean r1) {
                r0 = this;
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L13
                io.tacocrypto.app.ui.webview.WebViewFragment r1 = r0.f14527Z
                androidx.fragment.app.s r1 = r1.m1333s()
                if (r1 == 0) goto L13
                r1.finish()
            L13:
                ch.l r1 = ch.C0985l.f5061a
                return r1
        }
    }

    /* renamed from: io.tacocrypto.app.ui.webview.WebViewFragment$b */
    public static final class C3374b extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f14528Z;

        public C3374b(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f14528Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f14528Z
                return r0
        }
    }

    /* renamed from: io.tacocrypto.app.ui.webview.WebViewFragment$c */
    public static final class C3375c extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f14529Z;

        public C3375c(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f14529Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f14529Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: io.tacocrypto.app.ui.webview.WebViewFragment$d */
    public /* synthetic */ class C3376d extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3561u> {

        /* renamed from: g0 */
        public static final io.tacocrypto.app.p156ui.webview.WebViewFragment.C3376d f14530g0 = null;

        static {
                io.tacocrypto.app.ui.webview.WebViewFragment$d r0 = new io.tacocrypto.app.ui.webview.WebViewFragment$d
                r0.<init>()
                io.tacocrypto.app.p156ui.webview.WebViewFragment.C3376d.f14530g0 = r0
                return
        }

        public C3376d() {
                r6 = this;
                java.lang.Class<jd.u> r2 = p171jd.C3561u.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/FragmentWebviewBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.C3561u mo115i(android.view.LayoutInflater r10, android.view.ViewGroup r11, java.lang.Boolean r12) {
                r9 = this;
                android.view.LayoutInflater r10 = (android.view.LayoutInflater) r10
                android.view.ViewGroup r11 = (android.view.ViewGroup) r11
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                java.lang.String r0 = "p0"
                p214m2.C4339q.m9706k(r10, r0)
                r0 = 2131558486(0x7f0d0056, float:1.874229E38)
                r1 = 0
                android.view.View r10 = r10.inflate(r0, r11, r1)
                if (r12 == 0) goto L1c
                r11.addView(r10)
            L1c:
                r11 = 2131361981(0x7f0a00bd, float:1.834373E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r2 = r12
                androidx.appcompat.widget.AppCompatImageView r2 = (androidx.appcompat.widget.AppCompatImageView) r2
                if (r2 == 0) goto L7a
                r11 = 2131362049(0x7f0a0101, float:1.8343868E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r3 = r12
                android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
                if (r3 == 0) goto L7a
                r11 = 2131362225(0x7f0a01b1, float:1.8344225E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r4 = r12
                com.google.android.material.card.MaterialCardView r4 = (com.google.android.material.card.MaterialCardView) r4
                if (r4 == 0) goto L7a
                r11 = 2131362500(0x7f0a02c4, float:1.8344782E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r5 = r12
                com.google.android.material.progressindicator.CircularProgressIndicator r5 = (com.google.android.material.progressindicator.CircularProgressIndicator) r5
                if (r5 == 0) goto L7a
                r11 = 2131362525(0x7f0a02dd, float:1.8344833E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r6 = r12
                androidx.appcompat.widget.AppCompatImageView r6 = (androidx.appcompat.widget.AppCompatImageView) r6
                if (r6 == 0) goto L7a
                r11 = 2131362710(0x7f0a0396, float:1.8345208E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r7 = r12
                androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
                if (r7 == 0) goto L7a
                r11 = 2131362770(0x7f0a03d2, float:1.834533E38)
                android.view.View r12 = p064e.C1494h.m4055f(r10, r11)
                r8 = r12
                android.webkit.WebView r8 = (android.webkit.WebView) r8
                if (r8 == 0) goto L7a
                jd.u r11 = new jd.u
                r1 = r10
                androidx.appcompat.widget.LinearLayoutCompat r1 = (androidx.appcompat.widget.LinearLayoutCompat) r1
                r0 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r11
            L7a:
                android.content.res.Resources r10 = r10.getResources()
                java.lang.String r10 = r10.getResourceName(r11)
                java.lang.NullPointerException r11 = new java.lang.NullPointerException
                java.lang.String r12 = "Missing required view with ID: "
                java.lang.String r10 = r12.concat(r10)
                r11.<init>(r10)
                throw r11
        }
    }

    /* renamed from: io.tacocrypto.app.ui.webview.WebViewFragment$e */
    public static final class C3377e extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ io.tacocrypto.app.p156ui.webview.WebViewFragment f14531Z;

        public C3377e(io.tacocrypto.app.p156ui.webview.WebViewFragment r1) {
                r0 = this;
                r0.f14531Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                io.tacocrypto.app.ui.webview.WebViewFragment r0 = r1.f14531Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    public WebViewFragment() {
            r4 = this;
            r4.<init>()
            io.tacocrypto.app.ui.webview.WebViewFragment$e r0 = new io.tacocrypto.app.ui.webview.WebViewFragment$e
            r0.<init>(r4)
            io.tacocrypto.app.ui.webview.WebViewFragment$b r1 = new io.tacocrypto.app.ui.webview.WebViewFragment$b
            r1.<init>(r4)
            java.lang.Class<ug.c> r2 = ug.C6454c.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            io.tacocrypto.app.ui.webview.WebViewFragment$c r3 = new io.tacocrypto.app.ui.webview.WebViewFragment$c
            r3.<init>(r1)
            ch.d r0 = androidx.fragment.app.C0420z0.m1404a(r4, r2, r3, r0)
            r4.f14526V0 = r0
            return
    }

    @Override // td.AbstractC6215c
    /* renamed from: F0 */
    public void mo7721F0() {
            r4 = this;
            T extends w1.a r0 = r4.f24170U0
            p214m2.C4339q.m9704i(r0)
            jd.u r0 = (p171jd.C3561u) r0
            androidx.appcompat.widget.AppCompatImageView r1 = r0.f15551b
            ug.b r2 = new ug.b
            r3 = 0
            r2.<init>(r4, r3)
            r1.setOnClickListener(r2)
            androidx.appcompat.widget.AppCompatImageView r0 = r0.f15553d
            ug.b r1 = new ug.b
            r2 = 1
            r1.<init>(r4, r2)
            r0.setOnClickListener(r1)
            ug.c r0 = r4.m7750H0()
            nd.b0 r0 = r0.f25032c
            T extends w1.a r1 = r4.f24170U0
            p214m2.C4339q.m9704i(r1)
            jd.u r1 = (p171jd.C3561u) r1
            android.webkit.WebView r1 = r1.f15554e
            java.lang.String r2 = "binding.webView"
            p214m2.C4339q.m9705j(r1, r2)
            java.util.Objects.requireNonNull(r0)
            r0.f18916l = r1
            r0.f18917m = r4
            mh.a<ch.l> r1 = r0.f18924t
            if (r1 == 0) goto L3f
            r1.mo15e()
        L3f:
            r1 = 0
            r0.f18924t = r1
            ug.c r0 = r4.m7750H0()
            nd.b0 r0 = r0.f25032c
            androidx.lifecycle.d0<vg.b<java.lang.Boolean>> r0 = r0.f18923s
            androidx.lifecycle.v r1 = r4.m1311O()
            vg.c r2 = new vg.c
            io.tacocrypto.app.ui.webview.WebViewFragment$a r3 = new io.tacocrypto.app.ui.webview.WebViewFragment$a
            r3.<init>(r4)
            r2.<init>(r3)
            r0.m1413f(r1, r2)
            return
    }

    @Override // td.AbstractC6215c
    /* renamed from: G0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3561u> mo7722G0() {
            r2 = this;
            io.tacocrypto.app.ui.webview.WebViewFragment$d r0 = io.tacocrypto.app.p156ui.webview.WebViewFragment.C3376d.f14530g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    /* renamed from: H0 */
    public final ug.C6454c m7750H0() {
            r1 = this;
            ch.d r0 = r1.f14526V0
            java.lang.Object r0 = r0.getValue()
            ug.c r0 = (ug.C6454c) r0
            return r0
    }

    @Override // p238nd.InterfaceC4727b
    /* renamed from: h */
    public void mo7751h(android.view.View r2) {
            r1 = this;
            T extends w1.a r0 = r1.f24170U0     // Catch: java.lang.Throwable -> Ld
            p214m2.C4339q.m9704i(r0)     // Catch: java.lang.Throwable -> Ld
            jd.u r0 = (p171jd.C3561u) r0     // Catch: java.lang.Throwable -> Ld
            android.widget.FrameLayout r0 = r0.f15552c     // Catch: java.lang.Throwable -> Ld
            r0.removeView(r2)     // Catch: java.lang.Throwable -> Ld
            goto L11
        Ld:
            r2 = move-exception
            p074e9.C1805a.m4520e(r2)
        L11:
            return
    }

    @Override // p238nd.InterfaceC4727b
    /* renamed from: n */
    public void mo7752n(android.view.View r2) {
            r1 = this;
            T extends w1.a r0 = r1.f24170U0     // Catch: java.lang.Throwable -> Ld
            p214m2.C4339q.m9704i(r0)     // Catch: java.lang.Throwable -> Ld
            jd.u r0 = (p171jd.C3561u) r0     // Catch: java.lang.Throwable -> Ld
            android.widget.FrameLayout r0 = r0.f15552c     // Catch: java.lang.Throwable -> Ld
            r0.addView(r2)     // Catch: java.lang.Throwable -> Ld
            goto L11
        Ld:
            r2 = move-exception
            p074e9.C1805a.m4520e(r2)
        L11:
            return
    }
}
