package androidx.fragment.app;

/* renamed from: androidx.fragment.app.s */
/* loaded from: classes.dex */
public class ActivityC0405s extends androidx.activity.ComponentActivity implements p030c0.C0814a.b, p030c0.C0814a.c {

    /* renamed from: f0 */
    public final androidx.fragment.app.C0417y f2354f0;

    /* renamed from: g0 */
    public final androidx.lifecycle.C0472w f2355g0;

    /* renamed from: h0 */
    public boolean f2356h0;

    /* renamed from: i0 */
    public boolean f2357i0;

    /* renamed from: j0 */
    public boolean f2358j0;

    /* renamed from: androidx.fragment.app.s$a */
    public class a extends androidx.fragment.app.AbstractC0366a0<androidx.fragment.app.ActivityC0405s> implements androidx.lifecycle.InterfaceC0469t0, androidx.activity.InterfaceC0187c, androidx.activity.result.InterfaceC0197e, androidx.fragment.app.InterfaceC0384h0 {

        /* renamed from: c0 */
        public final /* synthetic */ androidx.fragment.app.ActivityC0405s f2359c0;

        public a(androidx.fragment.app.ActivityC0405s r1) {
                r0 = this;
                r0.f2359c0 = r1
                r0.<init>(r1)
                return
        }

        @Override // androidx.fragment.app.InterfaceC0384h0
        /* renamed from: a */
        public void mo1197a(androidx.fragment.app.AbstractC0375d0 r1, androidx.fragment.app.ComponentCallbacksC0395n r2) {
                r0 = this;
                androidx.fragment.app.s r1 = r0.f2359c0
                java.util.Objects.requireNonNull(r1)
                return
        }

        @Override // androidx.lifecycle.InterfaceC0471v
        /* renamed from: b */
        public androidx.lifecycle.AbstractC0458o mo428b() {
                r1 = this;
                androidx.fragment.app.s r0 = r1.f2359c0
                androidx.lifecycle.w r0 = r0.f2355g0
                return r0
        }

        @Override // androidx.fragment.app.AbstractC0415x
        /* renamed from: c */
        public android.view.View mo1240c(int r2) {
                r1 = this;
                androidx.fragment.app.s r0 = r1.f2359c0
                android.view.View r2 = r0.findViewById(r2)
                return r2
        }

        @Override // androidx.fragment.app.AbstractC0415x
        /* renamed from: d */
        public boolean mo1241d() {
                r1 = this;
                androidx.fragment.app.s r0 = r1.f2359c0
                android.view.Window r0 = r0.getWindow()
                if (r0 == 0) goto L10
                android.view.View r0 = r0.peekDecorView()
                if (r0 == 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }

        @Override // androidx.activity.InterfaceC0187c
        /* renamed from: e */
        public androidx.activity.OnBackPressedDispatcher mo429e() {
                r1 = this;
                androidx.fragment.app.s r0 = r1.f2359c0
                androidx.activity.OnBackPressedDispatcher r0 = r0.f589d0
                return r0
        }

        @Override // androidx.fragment.app.AbstractC0366a0
        /* renamed from: g */
        public androidx.fragment.app.ActivityC0405s mo1088g() {
                r1 = this;
                androidx.fragment.app.s r0 = r1.f2359c0
                return r0
        }

        @Override // androidx.fragment.app.AbstractC0366a0
        /* renamed from: h */
        public android.view.LayoutInflater mo1089h() {
                r2 = this;
                androidx.fragment.app.s r0 = r2.f2359c0
                android.view.LayoutInflater r0 = r0.getLayoutInflater()
                androidx.fragment.app.s r1 = r2.f2359c0
                android.view.LayoutInflater r0 = r0.cloneInContext(r1)
                return r0
        }

        @Override // androidx.fragment.app.AbstractC0366a0
        /* renamed from: i */
        public boolean mo1090i(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                androidx.fragment.app.s r1 = r0.f2359c0
                boolean r1 = r1.isFinishing()
                r1 = r1 ^ 1
                return r1
        }

        @Override // androidx.fragment.app.AbstractC0366a0
        /* renamed from: j */
        public void mo1091j() {
                r1 = this;
                androidx.fragment.app.s r0 = r1.f2359c0
                r0.mo1355v()
                return
        }

        @Override // androidx.activity.result.InterfaceC0197e
        /* renamed from: m */
        public androidx.activity.result.ActivityResultRegistry mo431m() {
                r1 = this;
                androidx.fragment.app.s r0 = r1.f2359c0
                androidx.activity.result.ActivityResultRegistry r0 = r0.f590e0
                return r0
        }

        @Override // androidx.lifecycle.InterfaceC0469t0
        /* renamed from: o */
        public androidx.lifecycle.C0467s0 mo432o() {
                r1 = this;
                androidx.fragment.app.s r0 = r1.f2359c0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                return r0
        }
    }

    public ActivityC0405s() {
            r3 = this;
            r3.<init>()
            androidx.fragment.app.s$a r0 = new androidx.fragment.app.s$a
            r0.<init>(r3)
            androidx.fragment.app.y r1 = new androidx.fragment.app.y
            java.lang.String r2 = "callbacks == null"
            p064e.C1487a.m4027e(r0, r2)
            r1.<init>(r0)
            r3.f2354f0 = r1
            androidx.lifecycle.w r0 = new androidx.lifecycle.w
            r0.<init>(r3)
            r3.f2355g0 = r0
            r0 = 1
            r3.f2358j0 = r0
            androidx.savedstate.b r0 = r3.f587b0
            androidx.savedstate.a r0 = r0.f3684b
            androidx.fragment.app.q r1 = new androidx.fragment.app.q
            r1.<init>(r3)
            java.lang.String r2 = "android:support:fragments"
            r0.m2154b(r2, r1)
            androidx.fragment.app.r r0 = new androidx.fragment.app.r
            r0.<init>(r3)
            c.a r1 = r3.f585Z
            android.content.Context r2 = r1.f4420b
            if (r2 == 0) goto L3c
            android.content.Context r2 = r1.f4420b
            r0.mo1351a(r2)
        L3c:
            java.util.Set<c.b> r1 = r1.f4419a
            r1.add(r0)
            return
    }

    /* renamed from: u */
    public static boolean m1352u(androidx.fragment.app.AbstractC0375d0 r7, androidx.lifecycle.AbstractC0458o.c r8) {
            androidx.lifecycle.o$c r0 = androidx.lifecycle.AbstractC0458o.c.f2549b0
            java.util.List r7 = r7.m1143L()
            java.util.Iterator r7 = r7.iterator()
            r1 = 0
            r2 = 0
        Lc:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r7.next()
            androidx.fragment.app.n r3 = (androidx.fragment.app.ComponentCallbacksC0395n) r3
            if (r3 != 0) goto L1b
            goto Lc
        L1b:
            androidx.fragment.app.a0<?> r4 = r3.f2295q0
            if (r4 != 0) goto L21
            r4 = 0
            goto L25
        L21:
            java.lang.Object r4 = r4.mo1088g()
        L25:
            if (r4 == 0) goto L30
            androidx.fragment.app.d0 r4 = r3.m1337u()
            boolean r4 = m1352u(r4, r8)
            r2 = r2 | r4
        L30:
            androidx.fragment.app.y0 r4 = r3.f2270M0
            java.lang.String r5 = "setCurrentState"
            r6 = 1
            if (r4 == 0) goto L54
            r4.m1401c()
            androidx.lifecycle.w r4 = r4.f2422Z
            androidx.lifecycle.o$c r4 = r4.f2564c
            int r4 = r4.compareTo(r0)
            if (r4 < 0) goto L46
            r4 = 1
            goto L47
        L46:
            r4 = 0
        L47:
            if (r4 == 0) goto L54
            androidx.fragment.app.y0 r2 = r3.f2270M0
            androidx.lifecycle.w r2 = r2.f2422Z
            r2.m1461d(r5)
            r2.m1463g(r8)
            r2 = 1
        L54:
            androidx.lifecycle.w r4 = r3.f2269L0
            androidx.lifecycle.o$c r4 = r4.f2564c
            int r4 = r4.compareTo(r0)
            if (r4 < 0) goto L60
            r4 = 1
            goto L61
        L60:
            r4 = 0
        L61:
            if (r4 == 0) goto Lc
            androidx.lifecycle.w r2 = r3.f2269L0
            r2.m1461d(r5)
            r2.m1463g(r8)
            r2 = 1
            goto Lc
        L6d:
            return r2
    }

    @Override // p030c0.C0814a.c
    @java.lang.Deprecated
    /* renamed from: c */
    public final void mo1353c(int r1) {
            r0 = this;
            return
    }

    @Override // android.app.Activity
    public void dump(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
            r2 = this;
            super.dump(r3, r4, r5, r6)
            r5.print(r3)
            java.lang.String r0 = "Local FragmentActivity "
            r5.print(r0)
            int r0 = java.lang.System.identityHashCode(r2)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " State:"
            r5.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.print(r0)
            java.lang.String r1 = "mCreated="
            r5.print(r1)
            boolean r1 = r2.f2356h0
            r5.print(r1)
            java.lang.String r1 = " mResumed="
            r5.print(r1)
            boolean r1 = r2.f2357i0
            r5.print(r1)
            java.lang.String r1 = " mStopped="
            r5.print(r1)
            boolean r1 = r2.f2358j0
            r5.print(r1)
            android.app.Application r1 = r2.getApplication()
            if (r1 == 0) goto L5a
            a1.a r1 = p002a1.AbstractC0002a.m2b(r2)
            r1.mo3a(r0, r4, r5, r6)
        L5a:
            androidx.fragment.app.y r0 = r2.f2354f0
            androidx.fragment.app.a0<?> r0 = r0.f2420a
            androidx.fragment.app.d0 r0 = r0.f2036b0
            r0.m1192y(r3, r4, r5, r6)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            androidx.fragment.app.y r0 = r1.f2354f0
            r0.m1399a()
            super.onActivityResult(r2, r3, r4)
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            androidx.fragment.app.y r0 = r1.f2354f0
            r0.m1399a()
            androidx.fragment.app.y r0 = r1.f2354f0
            androidx.fragment.app.a0<?> r0 = r0.f2420a
            androidx.fragment.app.d0 r0 = r0.f2036b0
            r0.m1177k(r2)
            return
    }

    @Override // androidx.activity.ComponentActivity, p030c0.ActivityC0820g, android.app.Activity
    public void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            androidx.lifecycle.w r2 = r1.f2355g0
            androidx.lifecycle.o$b r0 = androidx.lifecycle.AbstractC0458o.b.ON_CREATE
            r2.m1462e(r0)
            androidx.fragment.app.y r2 = r1.f2354f0
            androidx.fragment.app.a0<?> r2 = r2.f2420a
            androidx.fragment.app.d0 r2 = r2.f2036b0
            r2.m1180m()
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int r3, android.view.Menu r4) {
            r2 = this;
            if (r3 != 0) goto L16
            boolean r3 = super.onCreatePanelMenu(r3, r4)
            androidx.fragment.app.y r0 = r2.f2354f0
            android.view.MenuInflater r1 = r2.getMenuInflater()
            androidx.fragment.app.a0<?> r0 = r0.f2420a
            androidx.fragment.app.d0 r0 = r0.f2036b0
            boolean r4 = r0.m1181n(r4, r1)
            r3 = r3 | r4
            return r3
        L16:
            boolean r3 = super.onCreatePanelMenu(r3, r4)
            return r3
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public android.view.View onCreateView(android.view.View r2, java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
            r1 = this;
            androidx.fragment.app.y r0 = r1.f2354f0
            androidx.fragment.app.a0<?> r0 = r0.f2420a
            androidx.fragment.app.d0 r0 = r0.f2036b0
            androidx.fragment.app.b0 r0 = r0.f2118f
            android.view.View r0 = r0.onCreateView(r2, r3, r4, r5)
            if (r0 != 0) goto L13
            android.view.View r2 = super.onCreateView(r2, r3, r4, r5)
            return r2
        L13:
            return r0
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
            r2 = this;
            androidx.fragment.app.y r0 = r2.f2354f0
            androidx.fragment.app.a0<?> r0 = r0.f2420a
            androidx.fragment.app.d0 r0 = r0.f2036b0
            androidx.fragment.app.b0 r0 = r0.f2118f
            r1 = 0
            android.view.View r0 = r0.onCreateView(r1, r3, r4, r5)
            if (r0 != 0) goto L14
            android.view.View r3 = super.onCreateView(r3, r4, r5)
            return r3
        L14:
            return r0
    }

    @Override // android.app.Activity
    public void onDestroy() {
            r2 = this;
            super.onDestroy()
            androidx.fragment.app.y r0 = r2.f2354f0
            androidx.fragment.app.a0<?> r0 = r0.f2420a
            androidx.fragment.app.d0 r0 = r0.f2036b0
            r0.m1182o()
            androidx.lifecycle.w r0 = r2.f2355g0
            androidx.lifecycle.o$b r1 = androidx.lifecycle.AbstractC0458o.b.ON_DESTROY
            r0.m1462e(r1)
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
            r1 = this;
            super.onLowMemory()
            androidx.fragment.app.y r0 = r1.f2354f0
            androidx.fragment.app.a0<?> r0 = r0.f2420a
            androidx.fragment.app.d0 r0 = r0.f2036b0
            r0.m1183p()
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r2, android.view.MenuItem r3) {
            r1 = this;
            boolean r0 = super.onMenuItemSelected(r2, r3)
            if (r0 == 0) goto L8
            r2 = 1
            return r2
        L8:
            if (r2 == 0) goto L1a
            r0 = 6
            if (r2 == r0) goto Lf
            r2 = 0
            return r2
        Lf:
            androidx.fragment.app.y r2 = r1.f2354f0
            androidx.fragment.app.a0<?> r2 = r2.f2420a
            androidx.fragment.app.d0 r2 = r2.f2036b0
            boolean r2 = r2.m1179l(r3)
            return r2
        L1a:
            androidx.fragment.app.y r2 = r1.f2354f0
            androidx.fragment.app.a0<?> r2 = r2.f2420a
            androidx.fragment.app.d0 r2 = r2.f2036b0
            boolean r2 = r2.m1185r(r3)
            return r2
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean r2) {
            r1 = this;
            androidx.fragment.app.y r0 = r1.f2354f0
            androidx.fragment.app.a0<?> r0 = r0.f2420a
            androidx.fragment.app.d0 r0 = r0.f2036b0
            r0.m1184q(r2)
            return
    }

    @Override // android.app.Activity
    public void onNewIntent(@android.annotation.SuppressLint({"UnknownNullness"}) android.content.Intent r1) {
            r0 = this;
            super.onNewIntent(r1)
            androidx.fragment.app.y r1 = r0.f2354f0
            r1.m1399a()
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r2, android.view.Menu r3) {
            r1 = this;
            if (r2 != 0) goto Lb
            androidx.fragment.app.y r0 = r1.f2354f0
            androidx.fragment.app.a0<?> r0 = r0.f2420a
            androidx.fragment.app.d0 r0 = r0.f2036b0
            r0.m1186s(r3)
        Lb:
            super.onPanelClosed(r2, r3)
            return
    }

    @Override // android.app.Activity
    public void onPause() {
            r2 = this;
            super.onPause()
            r0 = 0
            r2.f2357i0 = r0
            androidx.fragment.app.y r0 = r2.f2354f0
            androidx.fragment.app.a0<?> r0 = r0.f2420a
            androidx.fragment.app.d0 r0 = r0.f2036b0
            r1 = 5
            r0.m1190w(r1)
            androidx.lifecycle.w r0 = r2.f2355g0
            androidx.lifecycle.o$b r1 = androidx.lifecycle.AbstractC0458o.b.ON_PAUSE
            r0.m1462e(r1)
            return
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean r2) {
            r1 = this;
            androidx.fragment.app.y r0 = r1.f2354f0
            androidx.fragment.app.a0<?> r0 = r0.f2420a
            androidx.fragment.app.d0 r0 = r0.f2036b0
            r0.m1188u(r2)
            return
    }

    @Override // android.app.Activity
    public void onPostResume() {
            r3 = this;
            super.onPostResume()
            androidx.lifecycle.w r0 = r3.f2355g0
            androidx.lifecycle.o$b r1 = androidx.lifecycle.AbstractC0458o.b.ON_RESUME
            r0.m1462e(r1)
            androidx.fragment.app.y r0 = r3.f2354f0
            androidx.fragment.app.a0<?> r0 = r0.f2420a
            androidx.fragment.app.d0 r0 = r0.f2036b0
            r1 = 0
            r0.f2103C = r1
            r0.f2104D = r1
            androidx.fragment.app.g0 r2 = r0.f2111K
            r2.f2178h = r1
            r1 = 7
            r0.m1190w(r1)
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int r1, android.view.View r2, android.view.Menu r3) {
            r0 = this;
            if (r1 != 0) goto L13
            r1 = 0
            boolean r1 = super.onPreparePanel(r1, r2, r3)
            androidx.fragment.app.y r2 = r0.f2354f0
            androidx.fragment.app.a0<?> r2 = r2.f2420a
            androidx.fragment.app.d0 r2 = r2.f2036b0
            boolean r2 = r2.m1189v(r3)
            r1 = r1 | r2
            return r1
        L13:
            boolean r1 = super.onPreparePanel(r1, r2, r3)
            return r1
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int r2, java.lang.String[] r3, int[] r4) {
            r1 = this;
            androidx.fragment.app.y r0 = r1.f2354f0
            r0.m1399a()
            super.onRequestPermissionsResult(r2, r3, r4)
            return
    }

    @Override // android.app.Activity
    public void onResume() {
            r2 = this;
            super.onResume()
            r0 = 1
            r2.f2357i0 = r0
            androidx.fragment.app.y r1 = r2.f2354f0
            r1.m1399a()
            androidx.fragment.app.y r1 = r2.f2354f0
            androidx.fragment.app.a0<?> r1 = r1.f2420a
            androidx.fragment.app.d0 r1 = r1.f2036b0
            r1.m1134C(r0)
            return
    }

    @Override // android.app.Activity
    public void onStart() {
            r4 = this;
            super.onStart()
            r0 = 0
            r4.f2358j0 = r0
            boolean r1 = r4.f2356h0
            r2 = 1
            if (r1 != 0) goto L1f
            r4.f2356h0 = r2
            androidx.fragment.app.y r1 = r4.f2354f0
            androidx.fragment.app.a0<?> r1 = r1.f2420a
            androidx.fragment.app.d0 r1 = r1.f2036b0
            r1.f2103C = r0
            r1.f2104D = r0
            androidx.fragment.app.g0 r3 = r1.f2111K
            r3.f2178h = r0
            r3 = 4
            r1.m1190w(r3)
        L1f:
            androidx.fragment.app.y r1 = r4.f2354f0
            r1.m1399a()
            androidx.fragment.app.y r1 = r4.f2354f0
            androidx.fragment.app.a0<?> r1 = r1.f2420a
            androidx.fragment.app.d0 r1 = r1.f2036b0
            r1.m1134C(r2)
            androidx.lifecycle.w r1 = r4.f2355g0
            androidx.lifecycle.o$b r2 = androidx.lifecycle.AbstractC0458o.b.ON_START
            r1.m1462e(r2)
            androidx.fragment.app.y r1 = r4.f2354f0
            androidx.fragment.app.a0<?> r1 = r1.f2420a
            androidx.fragment.app.d0 r1 = r1.f2036b0
            r1.f2103C = r0
            r1.f2104D = r0
            androidx.fragment.app.g0 r2 = r1.f2111K
            r2.f2178h = r0
            r0 = 5
            r1.m1190w(r0)
            return
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
            r1 = this;
            androidx.fragment.app.y r0 = r1.f2354f0
            r0.m1399a()
            return
    }

    @Override // android.app.Activity
    public void onStop() {
            r3 = this;
            super.onStop()
            r0 = 1
            r3.f2358j0 = r0
        L6:
            androidx.fragment.app.d0 r1 = r3.m1354t()
            androidx.lifecycle.o$c r2 = androidx.lifecycle.AbstractC0458o.c.f2548a0
            boolean r1 = m1352u(r1, r2)
            if (r1 != 0) goto L6
            androidx.fragment.app.y r1 = r3.f2354f0
            androidx.fragment.app.a0<?> r1 = r1.f2420a
            androidx.fragment.app.d0 r1 = r1.f2036b0
            r1.f2104D = r0
            androidx.fragment.app.g0 r2 = r1.f2111K
            r2.f2178h = r0
            r0 = 4
            r1.m1190w(r0)
            androidx.lifecycle.w r0 = r3.f2355g0
            androidx.lifecycle.o$b r1 = androidx.lifecycle.AbstractC0458o.b.ON_STOP
            r0.m1462e(r1)
            return
    }

    /* renamed from: t */
    public androidx.fragment.app.AbstractC0375d0 m1354t() {
            r1 = this;
            androidx.fragment.app.y r0 = r1.f2354f0
            androidx.fragment.app.a0<?> r0 = r0.f2420a
            androidx.fragment.app.d0 r0 = r0.f2036b0
            return r0
    }

    @java.lang.Deprecated
    /* renamed from: v */
    public void mo1355v() {
            r0 = this;
            r0.invalidateOptionsMenu()
            return
    }
}
