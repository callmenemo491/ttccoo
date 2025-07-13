package p124h7;

/* renamed from: h7.dd */
/* loaded from: classes.dex */
public final class C2589dd extends p124h7.AbstractC2715kd {

    /* renamed from: a */
    public p124h7.C2894uc f11457a;

    /* renamed from: b */
    public p124h7.C2912vc f11458b;

    /* renamed from: c */
    public p124h7.C2751md f11459c;

    /* renamed from: d */
    public final p124h7.C2571cd f11460d;

    /* renamed from: e */
    public final android.content.Context f11461e;

    /* renamed from: f */
    public final java.lang.String f11462f;

    /* renamed from: g */
    public p124h7.C2607ed f11463g;

    public C2589dd(android.content.Context r4, java.lang.String r5, p124h7.C2571cd r6) {
            r3 = this;
            r3.<init>()
            android.content.Context r4 = r4.getApplicationContext()
            r3.f11461e = r4
            com.google.android.gms.common.internal.C1101a.m3100e(r5)
            r3.f11462f = r5
            r3.f11460d = r6
            r4 = 0
            r3.f11459c = r4
            r3.f11457a = r4
            r3.f11458b = r4
            java.lang.String r6 = "firebear.secureToken"
            java.lang.String r6 = p124h7.C2939x3.m7293s(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L3f
            java.util.Map<java.lang.String, h7.sd> r0 = p124h7.C2877td.f11926a
            monitor-enter(r0)
            r6 = r0
            s.h r6 = (p319s.C5941h) r6     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r6 = r6.getOrDefault(r5, r4)     // Catch: java.lang.Throwable -> L3c
            h7.sd r6 = (p124h7.C2859sd) r6     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            if (r6 != 0) goto L3b
            java.lang.String r6 = "https://"
            java.lang.String r0 = "securetoken.googleapis.com/v1"
            java.lang.String r6 = r6.concat(r0)
            goto L5a
        L3b:
            throw r4
        L3c:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            throw r4
        L3f:
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "Found hermetic configuration for secureToken URL: "
            int r2 = r0.length()
            if (r2 == 0) goto L50
            java.lang.String r0 = r1.concat(r0)
            goto L55
        L50:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L55:
            java.lang.String r1 = "LocalClient"
            android.util.Log.e(r1, r0)
        L5a:
            h7.md r0 = r3.f11459c
            if (r0 != 0) goto L69
            h7.md r0 = new h7.md
            h7.ed r1 = r3.m6617u()
            r0.<init>(r6, r1)
            r3.f11459c = r0
        L69:
            java.lang.String r6 = "firebear.identityToolkit"
            java.lang.String r6 = p124h7.C2939x3.m7293s(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L7a
            java.lang.String r6 = p124h7.C2877td.m7173a(r5)
            goto L95
        L7a:
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "Found hermetic configuration for identityToolkit URL: "
            int r2 = r0.length()
            if (r2 == 0) goto L8b
            java.lang.String r0 = r1.concat(r0)
            goto L90
        L8b:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L90:
            java.lang.String r1 = "LocalClient"
            android.util.Log.e(r1, r0)
        L95:
            h7.uc r0 = r3.f11457a
            if (r0 != 0) goto La4
            h7.uc r0 = new h7.uc
            h7.ed r1 = r3.m6617u()
            r0.<init>(r6, r1)
            r3.f11457a = r0
        La4:
            java.lang.String r6 = "firebear.identityToolkitV2"
            java.lang.String r6 = p124h7.C2939x3.m7293s(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto Lcc
            java.util.Map<java.lang.String, h7.sd> r0 = p124h7.C2877td.f11926a
            monitor-enter(r0)
            r6 = r0
            s.h r6 = (p319s.C5941h) r6     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r6 = r6.getOrDefault(r5, r4)     // Catch: java.lang.Throwable -> Lc9
            h7.sd r6 = (p124h7.C2859sd) r6     // Catch: java.lang.Throwable -> Lc9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc9
            if (r6 != 0) goto Lc8
            java.lang.String r4 = "https://"
            java.lang.String r6 = "identitytoolkit.googleapis.com/v2/accounts"
            java.lang.String r6 = r4.concat(r6)
            goto Le7
        Lc8:
            throw r4
        Lc9:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc9
            throw r4
        Lcc:
            java.lang.String r4 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "Found hermetic configuration for identityToolkitV2 URL: "
            int r1 = r4.length()
            if (r1 == 0) goto Ldd
            java.lang.String r4 = r0.concat(r4)
            goto Le2
        Ldd:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0)
        Le2:
            java.lang.String r0 = "LocalClient"
            android.util.Log.e(r0, r4)
        Le7:
            h7.vc r4 = r3.f11458b
            if (r4 != 0) goto Lf6
            h7.vc r4 = new h7.vc
            h7.ed r0 = r3.m6617u()
            r4.<init>(r6, r0)
            r3.f11458b = r4
        Lf6:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<h7.dd>> r4 = p124h7.C2877td.f11927b
            monitor-enter(r4)
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L106
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L106
            r0 = r4
            s.h r0 = (p319s.C5941h) r0     // Catch: java.lang.Throwable -> L106
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> L106
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L106
            return
        L106:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L106
            throw r5
    }

    @Override // p124h7.AbstractC2715kd
    /* renamed from: a */
    public final void mo6597a(p124h7.C2913vd r4, p124h7.InterfaceC2697jd<p124h7.C2931wd> r5) {
            r3 = this;
            h7.uc r0 = r3.f11457a
            java.lang.String r1 = r3.f11462f
            java.lang.String r2 = "/createAuthUri"
            java.lang.String r1 = r0.m6805c(r2, r1)
            java.lang.Class<h7.wd> r2 = p124h7.C2931wd.class
            s7.j<ResultT> r0 = r0.f11590a0
            h7.ed r0 = (p124h7.C2607ed) r0
            p124h7.C2939x3.m7294t(r1, r4, r5, r2, r0)
            return
    }

    @Override // p124h7.AbstractC2715kd
    /* renamed from: b */
    public final void mo6598b(p124h7.C2625fd r4, p124h7.InterfaceC2697jd<java.lang.Void> r5) {
            r3 = this;
            h7.uc r0 = r3.f11457a
            java.lang.String r1 = r3.f11462f
            java.lang.String r2 = "/deleteAccount"
            java.lang.String r1 = r0.m6805c(r2, r1)
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            s7.j<ResultT> r0 = r0.f11590a0
            h7.ed r0 = (p124h7.C2607ed) r0
            p124h7.C2939x3.m7294t(r1, r4, r5, r2, r0)
            return
    }

    @Override // p124h7.AbstractC2715kd
    /* renamed from: c */
    public final void mo6599c(p124h7.C2967yd r4, p124h7.InterfaceC2697jd<p124h7.C2985zd> r5) {
            r3 = this;
            h7.uc r0 = r3.f11457a
            java.lang.String r1 = r3.f11462f
            java.lang.String r2 = "/emailLinkSignin"
            java.lang.String r1 = r0.m6805c(r2, r1)
            java.lang.Class<h7.zd> r2 = p124h7.C2985zd.class
            s7.j<ResultT> r0 = r0.f11590a0
            h7.ed r0 = (p124h7.C2607ed) r0
            p124h7.C2939x3.m7294t(r1, r4, r5, r2, r0)
            return
    }

    @Override // p124h7.AbstractC2715kd
    /* renamed from: d */
    public final void mo6600d(android.content.Context r3, p124h7.C2535ae r4, p124h7.InterfaceC2697jd<p124h7.C2554be> r5) {
            r2 = this;
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r4, r3)
            h7.vc r3 = r2.f11458b
            java.lang.String r0 = r2.f11462f
            java.lang.String r1 = "/mfaEnrollment:finalize"
            java.lang.String r0 = r3.m6805c(r1, r0)
            java.lang.Class<h7.be> r1 = p124h7.C2554be.class
            s7.j<ResultT> r3 = r3.f11590a0
            h7.ed r3 = (p124h7.C2607ed) r3
            p124h7.C2939x3.m7294t(r0, r4, r5, r1, r3)
            return
    }

    @Override // p124h7.AbstractC2715kd
    /* renamed from: e */
    public final void mo6601e(android.content.Context r3, p365v.C6476c r4, p124h7.InterfaceC2697jd<p124h7.C2572ce> r5) {
            r2 = this;
            h7.vc r3 = r2.f11458b
            java.lang.String r0 = r2.f11462f
            java.lang.String r1 = "/mfaSignIn:finalize"
            java.lang.String r0 = r3.m6805c(r1, r0)
            java.lang.Class<h7.ce> r1 = p124h7.C2572ce.class
            s7.j<ResultT> r3 = r3.f11590a0
            h7.ed r3 = (p124h7.C2607ed) r3
            p124h7.C2939x3.m7294t(r0, r4, r5, r1, r3)
            return
    }

    @Override // p124h7.AbstractC2715kd
    /* renamed from: f */
    public final void mo6602f(p124h7.C2590de r4, p124h7.InterfaceC2697jd<p124h7.C2752me> r5) {
            r3 = this;
            h7.md r0 = r3.f11459c
            java.lang.String r1 = r3.f11462f
            java.lang.String r2 = "/token"
            java.lang.String r1 = r0.m6805c(r2, r1)
            java.lang.Class<h7.me> r2 = p124h7.C2752me.class
            s7.j<ResultT> r0 = r0.f11590a0
            h7.ed r0 = (p124h7.C2607ed) r0
            p124h7.C2939x3.m7294t(r1, r4, r5, r2, r0)
            return
    }

    @Override // p124h7.AbstractC2715kd
    /* renamed from: g */
    public final void mo6603g(p124h7.C2625fd r4, p124h7.InterfaceC2697jd<p124h7.C2608ee> r5) {
            r3 = this;
            h7.uc r0 = r3.f11457a
            java.lang.String r1 = r3.f11462f
            java.lang.String r2 = "/getAccountInfo"
            java.lang.String r1 = r0.m6805c(r2, r1)
            java.lang.Class<h7.ee> r2 = p124h7.C2608ee.class
            s7.j<ResultT> r0 = r0.f11590a0
            h7.ed r0 = (p124h7.C2607ed) r0
            p124h7.C2939x3.m7294t(r1, r4, r5, r2, r0)
            return
    }

    @Override // p124h7.AbstractC2715kd
    /* renamed from: h */
    public final void mo6604h(p124h7.C2705k3 r4, p124h7.InterfaceC2697jd<p124h7.C2716ke> r5) {
            r3 = this;
            java.lang.Object r0 = r4.f11696c0
            v9.a r0 = (p375v9.C6586a) r0
            if (r0 == 0) goto L12
            h7.ed r0 = r3.m6617u()
            java.lang.Object r1 = r4.f11696c0
            v9.a r1 = (p375v9.C6586a) r1
            java.lang.String r1 = r1.f25764f0
            r0.f11488e = r1
        L12:
            h7.uc r0 = r3.f11457a
            java.lang.String r1 = r3.f11462f
            java.lang.String r2 = "/getOobConfirmationCode"
            java.lang.String r1 = r0.m6805c(r2, r1)
            java.lang.Class<h7.ke> r2 = p124h7.C2716ke.class
            s7.j<ResultT> r0 = r0.f11590a0
            h7.ed r0 = (p124h7.C2607ed) r0
            p124h7.C2939x3.m7294t(r1, r4, r5, r2, r0)
            return
    }

    @Override // p124h7.AbstractC2715kd
    /* renamed from: i */
    public final void mo6605i(p124h7.C2913vd r4, p124h7.InterfaceC2697jd<p124h7.C2914ve> r5) {
            r3 = this;
            h7.uc r0 = r3.f11457a
            java.lang.String r1 = r3.f11462f
            java.lang.String r2 = "/resetPassword"
            java.lang.String r1 = r0.m6805c(r2, r1)
            java.lang.Class<h7.ve> r2 = p124h7.C2914ve.class
            s7.j<ResultT> r0 = r0.f11590a0
            h7.ed r0 = (p124h7.C2607ed) r0
            p124h7.C2939x3.m7294t(r1, r4, r5, r2, r0)
            return
    }

    @Override // p124h7.AbstractC2715kd
    /* renamed from: j */
    public final void mo6606j(p124h7.C2950xe r4, p124h7.InterfaceC2697jd<p124h7.C2986ze> r5) {
            r3 = this;
            java.lang.String r0 = r4.f12026b0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L10
            h7.ed r0 = r3.m6617u()
            java.lang.String r1 = r4.f12026b0
            r0.f11488e = r1
        L10:
            h7.uc r0 = r3.f11457a
            java.lang.String r1 = r3.f11462f
            java.lang.String r2 = "/sendVerificationCode"
            java.lang.String r1 = r0.m6805c(r2, r1)
            java.lang.Class<h7.ze> r2 = p124h7.C2986ze.class
            s7.j<ResultT> r0 = r0.f11590a0
            h7.ed r0 = (p124h7.C2607ed) r0
            p124h7.C2939x3.m7294t(r1, r4, r5, r2, r0)
            return
    }

    @Override // p124h7.AbstractC2715kd
    /* renamed from: k */
    public final void mo6607k(p124h7.C2536af r4, p124h7.InterfaceC2697jd<p124h7.C2555bf> r5) {
            r3 = this;
            h7.uc r0 = r3.f11457a
            java.lang.String r1 = r3.f11462f
            java.lang.String r2 = "/setAccountInfo"
            java.lang.String r1 = r0.m6805c(r2, r1)
            java.lang.Class<h7.bf> r2 = p124h7.C2555bf.class
            s7.j<ResultT> r0 = r0.f11590a0
            h7.ed r0 = (p124h7.C2607ed) r0
            p124h7.C2939x3.m7294t(r1, r4, r5, r2, r0)
            return
    }

    @Override // p124h7.AbstractC2715kd
    /* renamed from: l */
    public final void mo6608l(java.lang.String r2, p124h7.InterfaceC2697jd<java.lang.Void> r3) {
            r1 = this;
            h7.ed r0 = r1.m6617u()
            java.util.Objects.requireNonNull(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r2 = r2 ^ 1
            r0.f11487d = r2
            h7.eb r3 = (p124h7.C2605eb) r3
            h7.fc r2 = r3.f11481Y
            r2.m6719g()
            return
    }

    @Override // p124h7.AbstractC2715kd
    /* renamed from: m */
    public final void mo6609m(p124h7.C2913vd r4, p124h7.InterfaceC2697jd<p124h7.C2573cf> r5) {
            r3 = this;
            h7.uc r0 = r3.f11457a
            java.lang.String r1 = r3.f11462f
            java.lang.String r2 = "/signupNewUser"
            java.lang.String r1 = r0.m6805c(r2, r1)
            java.lang.Class<h7.cf> r2 = p124h7.C2573cf.class
            s7.j<ResultT> r0 = r0.f11590a0
            h7.ed r0 = (p124h7.C2607ed) r0
            p124h7.C2939x3.m7294t(r1, r4, r5, r2, r0)
            return
    }

    @Override // p124h7.AbstractC2715kd
    /* renamed from: n */
    public final void mo6610n(p005a4.C0021j r4, p124h7.InterfaceC2697jd<p124h7.C2591df> r5) {
            r3 = this;
            bh.a<a4.l> r0 = r4.f47b0
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L14
            h7.ed r0 = r3.m6617u()
            bh.a<a4.l> r1 = r4.f47b0
            java.lang.String r1 = (java.lang.String) r1
            r0.f11488e = r1
        L14:
            h7.vc r0 = r3.f11458b
            java.lang.String r1 = r3.f11462f
            java.lang.String r2 = "/mfaEnrollment:start"
            java.lang.String r1 = r0.m6805c(r2, r1)
            java.lang.Class<h7.df> r2 = p124h7.C2591df.class
            s7.j<ResultT> r0 = r0.f11590a0
            h7.ed r0 = (p124h7.C2607ed) r0
            p124h7.C2939x3.m7294t(r1, r4, r5, r2, r0)
            return
    }

    @Override // p124h7.AbstractC2715kd
    /* renamed from: o */
    public final void mo6611o(p124h7.C2609ef r4, p124h7.InterfaceC2697jd<p124h7.C2627ff> r5) {
            r3 = this;
            java.lang.Object r0 = r4.f11494b0
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L14
            h7.ed r0 = r3.m6617u()
            java.lang.Object r1 = r4.f11494b0
            java.lang.String r1 = (java.lang.String) r1
            r0.f11488e = r1
        L14:
            h7.vc r0 = r3.f11458b
            java.lang.String r1 = r3.f11462f
            java.lang.String r2 = "/mfaSignIn:start"
            java.lang.String r1 = r0.m6805c(r2, r1)
            java.lang.Class<h7.ff> r2 = p124h7.C2627ff.class
            s7.j<ResultT> r0 = r0.f11590a0
            h7.ed r0 = (p124h7.C2607ed) r0
            p124h7.C2939x3.m7294t(r1, r4, r5, r2, r0)
            return
    }

    @Override // p124h7.AbstractC2715kd
    /* renamed from: p */
    public final void mo6612p(android.content.Context r3, p124h7.C2681if r4, p124h7.InterfaceC2697jd<p124h7.C2717kf> r5) {
            r2 = this;
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r4, r3)
            h7.uc r3 = r2.f11457a
            java.lang.String r0 = r2.f11462f
            java.lang.String r1 = "/verifyAssertion"
            java.lang.String r0 = r3.m6805c(r1, r0)
            java.lang.Class<h7.kf> r1 = p124h7.C2717kf.class
            s7.j<ResultT> r3 = r3.f11590a0
            h7.ed r3 = (p124h7.C2607ed) r3
            p124h7.C2939x3.m7294t(r0, r4, r5, r1, r3)
            return
    }

    @Override // p124h7.AbstractC2715kd
    /* renamed from: q */
    public final void mo6613q(p124h7.C2590de r4, p124h7.InterfaceC2697jd<p124h7.C2735lf> r5) {
            r3 = this;
            h7.uc r0 = r3.f11457a
            java.lang.String r1 = r3.f11462f
            java.lang.String r2 = "/verifyCustomToken"
            java.lang.String r1 = r0.m6805c(r2, r1)
            java.lang.Class<h7.lf> r2 = p124h7.C2735lf.class
            s7.j<ResultT> r0 = r0.f11590a0
            h7.ed r0 = (p124h7.C2607ed) r0
            p124h7.C2939x3.m7294t(r1, r4, r5, r2, r0)
            return
    }

    @Override // p124h7.AbstractC2715kd
    /* renamed from: r */
    public final void mo6614r(android.content.Context r3, p124h7.C2913vd r4, p124h7.InterfaceC2697jd<p124h7.C2771nf> r5) {
            r2 = this;
            h7.uc r3 = r2.f11457a
            java.lang.String r0 = r2.f11462f
            java.lang.String r1 = "/verifyPassword"
            java.lang.String r0 = r3.m6805c(r1, r0)
            java.lang.Class<h7.nf> r1 = p124h7.C2771nf.class
            s7.j<ResultT> r3 = r3.f11590a0
            h7.ed r3 = (p124h7.C2607ed) r3
            p124h7.C2939x3.m7294t(r0, r4, r5, r1, r3)
            return
    }

    @Override // p124h7.AbstractC2715kd
    /* renamed from: s */
    public final void mo6615s(android.content.Context r3, p124h7.C2789of r4, p124h7.InterfaceC2697jd<p124h7.C2807pf> r5) {
            r2 = this;
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r4, r3)
            h7.uc r3 = r2.f11457a
            java.lang.String r0 = r2.f11462f
            java.lang.String r1 = "/verifyPhoneNumber"
            java.lang.String r0 = r3.m6805c(r1, r0)
            java.lang.Class<h7.pf> r1 = p124h7.C2807pf.class
            s7.j<ResultT> r3 = r3.f11590a0
            h7.ed r3 = (p124h7.C2607ed) r3
            p124h7.C2939x3.m7294t(r0, r4, r5, r1, r3)
            return
    }

    @Override // p124h7.AbstractC2715kd
    /* renamed from: t */
    public final void mo6616t(p124h7.C2590de r4, p124h7.InterfaceC2697jd<p124h7.C2825qf> r5) {
            r3 = this;
            h7.vc r0 = r3.f11458b
            java.lang.String r1 = r3.f11462f
            java.lang.String r2 = "/mfaEnrollment:withdraw"
            java.lang.String r1 = r0.m6805c(r2, r1)
            java.lang.Class<h7.qf> r2 = p124h7.C2825qf.class
            s7.j<ResultT> r0 = r0.f11590a0
            h7.ed r0 = (p124h7.C2607ed) r0
            p124h7.C2939x3.m7294t(r1, r4, r5, r2, r0)
            return
    }

    /* renamed from: u */
    public final p124h7.C2607ed m6617u() {
            r3 = this;
            h7.ed r0 = r3.f11463g
            if (r0 != 0) goto L13
            h7.ed r0 = new h7.ed
            android.content.Context r1 = r3.f11461e
            h7.cd r2 = r3.f11460d
            java.lang.String r2 = r2.m6533a()
            r0.<init>(r1, r2)
            r3.f11463g = r0
        L13:
            h7.ed r0 = r3.f11463g
            return r0
    }
}
