package androidx.fragment.app;

/* renamed from: androidx.fragment.app.l */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0391l extends androidx.fragment.app.ComponentCallbacksC0395n implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener {

    /* renamed from: U0 */
    public android.os.Handler f2207U0;

    /* renamed from: V0 */
    public java.lang.Runnable f2208V0;

    /* renamed from: W0 */
    public android.content.DialogInterface.OnCancelListener f2209W0;

    /* renamed from: X0 */
    public android.content.DialogInterface.OnDismissListener f2210X0;

    /* renamed from: Y0 */
    public int f2211Y0;

    /* renamed from: Z0 */
    public int f2212Z0;

    /* renamed from: a1 */
    public boolean f2213a1;

    /* renamed from: b1 */
    public boolean f2214b1;

    /* renamed from: c1 */
    public int f2215c1;

    /* renamed from: d1 */
    public boolean f2216d1;

    /* renamed from: e1 */
    public androidx.lifecycle.InterfaceC0439e0<androidx.lifecycle.InterfaceC0471v> f2217e1;

    /* renamed from: f1 */
    public android.app.Dialog f2218f1;

    /* renamed from: g1 */
    public boolean f2219g1;

    /* renamed from: h1 */
    public boolean f2220h1;

    /* renamed from: i1 */
    public boolean f2221i1;

    /* renamed from: j1 */
    public boolean f2222j1;

    /* renamed from: androidx.fragment.app.l$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l f2223Y;

        public a(androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l r1) {
                r0 = this;
                r0.f2223Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        @android.annotation.SuppressLint({"SyntheticAccessor"})
        public void run() {
                r2 = this;
                androidx.fragment.app.l r0 = r2.f2223Y
                android.content.DialogInterface$OnDismissListener r1 = r0.f2210X0
                android.app.Dialog r0 = r0.f2218f1
                r1.onDismiss(r0)
                return
        }
    }

    /* renamed from: androidx.fragment.app.l$b */
    public class b implements android.content.DialogInterface.OnCancelListener {

        /* renamed from: Y */
        public final /* synthetic */ androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l f2224Y;

        public b(androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l r1) {
                r0 = this;
                r0.f2224Y = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @android.annotation.SuppressLint({"SyntheticAccessor"})
        public void onCancel(android.content.DialogInterface r2) {
                r1 = this;
                androidx.fragment.app.l r2 = r1.f2224Y
                android.app.Dialog r0 = r2.f2218f1
                if (r0 == 0) goto L9
                r2.onCancel(r0)
            L9:
                return
        }
    }

    /* renamed from: androidx.fragment.app.l$c */
    public class c implements android.content.DialogInterface.OnDismissListener {

        /* renamed from: Y */
        public final /* synthetic */ androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l f2225Y;

        public c(androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l r1) {
                r0 = this;
                r0.f2225Y = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @android.annotation.SuppressLint({"SyntheticAccessor"})
        public void onDismiss(android.content.DialogInterface r2) {
                r1 = this;
                androidx.fragment.app.l r2 = r1.f2225Y
                android.app.Dialog r0 = r2.f2218f1
                if (r0 == 0) goto L9
                r2.onDismiss(r0)
            L9:
                return
        }
    }

    /* renamed from: androidx.fragment.app.l$d */
    public class d implements androidx.lifecycle.InterfaceC0439e0<androidx.lifecycle.InterfaceC0471v> {

        /* renamed from: a */
        public final /* synthetic */ androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l f2226a;

        public d(androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l r1) {
                r0 = this;
                r0.f2226a = r1
                r0.<init>()
                return
        }

        @Override // androidx.lifecycle.InterfaceC0439e0
        @android.annotation.SuppressLint({"SyntheticAccessor"})
        /* renamed from: d */
        public void mo124d(androidx.lifecycle.InterfaceC0471v r3) {
                r2 = this;
                androidx.lifecycle.v r3 = (androidx.lifecycle.InterfaceC0471v) r3
                if (r3 == 0) goto L53
                androidx.fragment.app.l r3 = r2.f2226a
                boolean r0 = r3.f2214b1
                if (r0 == 0) goto L53
                android.view.View r3 = r3.m1336t0()
                android.view.ViewParent r0 = r3.getParent()
                if (r0 != 0) goto L4b
                androidx.fragment.app.l r0 = r2.f2226a
                android.app.Dialog r0 = r0.f2218f1
                if (r0 == 0) goto L53
                r0 = 3
                boolean r0 = androidx.fragment.app.AbstractC0375d0.m1131O(r0)
                if (r0 == 0) goto L43
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "DialogFragment "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r1 = " setting the content view on "
                r0.append(r1)
                androidx.fragment.app.l r1 = r2.f2226a
                android.app.Dialog r1 = r1.f2218f1
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "FragmentManager"
                android.util.Log.d(r1, r0)
            L43:
                androidx.fragment.app.l r0 = r2.f2226a
                android.app.Dialog r0 = r0.f2218f1
                r0.setContentView(r3)
                goto L53
            L4b:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "DialogFragment can not be attached to a container view"
                r3.<init>(r0)
                throw r3
            L53:
                return
        }
    }

    /* renamed from: androidx.fragment.app.l$e */
    public class e extends androidx.fragment.app.AbstractC0415x {

        /* renamed from: a */
        public final /* synthetic */ androidx.fragment.app.AbstractC0415x f2227a;

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l f2228b;

        public e(androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l r1, androidx.fragment.app.AbstractC0415x r2) {
                r0 = this;
                r0.f2228b = r1
                r0.f2227a = r2
                r0.<init>()
                return
        }

        @Override // androidx.fragment.app.AbstractC0415x
        /* renamed from: c */
        public android.view.View mo1240c(int r2) {
                r1 = this;
                androidx.fragment.app.x r0 = r1.f2227a
                boolean r0 = r0.mo1241d()
                if (r0 == 0) goto Lf
                androidx.fragment.app.x r0 = r1.f2227a
                android.view.View r2 = r0.mo1240c(r2)
                return r2
            Lf:
                androidx.fragment.app.l r0 = r1.f2228b
                android.app.Dialog r0 = r0.f2218f1
                if (r0 == 0) goto L1a
                android.view.View r2 = r0.findViewById(r2)
                goto L1b
            L1a:
                r2 = 0
            L1b:
                return r2
        }

        @Override // androidx.fragment.app.AbstractC0415x
        /* renamed from: d */
        public boolean mo1241d() {
                r1 = this;
                androidx.fragment.app.x r0 = r1.f2227a
                boolean r0 = r0.mo1241d()
                if (r0 != 0) goto L11
                androidx.fragment.app.l r0 = r1.f2228b
                boolean r0 = r0.f2222j1
                if (r0 == 0) goto Lf
                goto L11
            Lf:
                r0 = 0
                goto L12
            L11:
                r0 = 1
            L12:
                return r0
        }
    }

    public DialogInterfaceOnCancelListenerC0391l() {
            r2 = this;
            r2.<init>()
            androidx.fragment.app.l$a r0 = new androidx.fragment.app.l$a
            r0.<init>(r2)
            r2.f2208V0 = r0
            androidx.fragment.app.l$b r0 = new androidx.fragment.app.l$b
            r0.<init>(r2)
            r2.f2209W0 = r0
            androidx.fragment.app.l$c r0 = new androidx.fragment.app.l$c
            r0.<init>(r2)
            r2.f2210X0 = r0
            r0 = 0
            r2.f2211Y0 = r0
            r2.f2212Z0 = r0
            r1 = 1
            r2.f2213a1 = r1
            r2.f2214b1 = r1
            r1 = -1
            r2.f2215c1 = r1
            androidx.fragment.app.l$d r1 = new androidx.fragment.app.l$d
            r1.<init>(r2)
            r2.f2217e1 = r1
            r2.f2222j1 = r0
            return
    }

    /* renamed from: D0 */
    public void mo1222D0() {
            r1 = this;
            r0 = 0
            r1.m1223E0(r0, r0)
            return
    }

    /* renamed from: E0 */
    public final void m1223E0(boolean r5, boolean r6) {
            r4 = this;
            boolean r0 = r4.f2220h1
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f2220h1 = r0
            r1 = 0
            r4.f2221i1 = r1
            android.app.Dialog r2 = r4.f2218f1
            r3 = 0
            if (r2 == 0) goto L33
            r2.setOnDismissListener(r3)
            android.app.Dialog r2 = r4.f2218f1
            r2.dismiss()
            if (r6 != 0) goto L33
            android.os.Looper r6 = android.os.Looper.myLooper()
            android.os.Handler r2 = r4.f2207U0
            android.os.Looper r2 = r2.getLooper()
            if (r6 != r2) goto L2c
            android.app.Dialog r6 = r4.f2218f1
            r4.onDismiss(r6)
            goto L33
        L2c:
            android.os.Handler r6 = r4.f2207U0
            java.lang.Runnable r2 = r4.f2208V0
            r6.post(r2)
        L33:
            r4.f2219g1 = r0
            int r6 = r4.f2215c1
            if (r6 < 0) goto L59
            androidx.fragment.app.d0 r5 = r4.m1300D()
            int r6 = r4.f2215c1
            if (r6 < 0) goto L4d
            androidx.fragment.app.d0$o r2 = new androidx.fragment.app.d0$o
            r2.<init>(r5, r3, r6, r0)
            r5.m1132A(r2, r1)
            r5 = -1
            r4.f2215c1 = r5
            goto L99
        L4d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Bad id: "
            java.lang.String r6 = android.support.v4.media.C0142a.m254a(r0, r6)
            r5.<init>(r6)
            throw r5
        L59:
            androidx.fragment.app.d0 r6 = r4.m1300D()
            androidx.fragment.app.a r0 = new androidx.fragment.app.a
            r0.<init>(r6)
            androidx.fragment.app.d0 r6 = r4.f2294p0
            if (r6 == 0) goto L87
            androidx.fragment.app.d0 r1 = r0.f2030q
            if (r6 != r1) goto L6b
            goto L87
        L6b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Cannot remove Fragment attached to a different FragmentManager. Fragment "
            java.lang.StringBuilder r6 = android.support.v4.media.C0144c.m256a(r6)
            java.lang.String r0 = r4.toString()
            r6.append(r0)
            java.lang.String r0 = " is already attached to a FragmentManager."
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L87:
            androidx.fragment.app.m0$a r6 = new androidx.fragment.app.m0$a
            r1 = 3
            r6.<init>(r1, r4)
            r0.m1292c(r6)
            if (r5 == 0) goto L96
            r0.m1077g()
            goto L99
        L96:
            r0.mo1075e()
        L99:
            return
    }

    /* renamed from: F0 */
    public int mo1224F0() {
            r1 = this;
            int r0 = r1.f2212Z0
            return r0
    }

    /* renamed from: G0 */
    public android.app.Dialog mo1225G0(android.os.Bundle r3) {
            r2 = this;
            r3 = 3
            boolean r3 = androidx.fragment.app.AbstractC0375d0.m1131O(r3)
            if (r3 == 0) goto L1d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "onCreateDialog called for DialogFragment "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r3)
        L1d:
            android.app.Dialog r3 = new android.app.Dialog
            android.content.Context r0 = r2.m1334s0()
            int r1 = r2.mo1224F0()
            r3.<init>(r0, r1)
            return r3
    }

    /* renamed from: H0 */
    public final android.app.Dialog m1226H0() {
            r3 = this;
            android.app.Dialog r0 = r3.f2218f1
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "DialogFragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " does not have a Dialog."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: I0 */
    public void m1227I0(int r4, int r5) {
            r3 = this;
            r0 = 2
            boolean r1 = androidx.fragment.app.AbstractC0375d0.m1131O(r0)
            if (r1 == 0) goto L2d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Setting style and theme for DialogFragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " to "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r1)
        L2d:
            r3.f2211Y0 = r4
            if (r4 == r0) goto L34
            r0 = 3
            if (r4 != r0) goto L39
        L34:
            r4 = 16973913(0x1030059, float:2.406115E-38)
            r3.f2212Z0 = r4
        L39:
            if (r5 == 0) goto L3d
            r3.f2212Z0 = r5
        L3d:
            return
    }

    /* renamed from: J0 */
    public void mo1228J0(android.app.Dialog r3, int r4) {
            r2 = this;
            r0 = 1
            if (r4 == r0) goto L15
            r1 = 2
            if (r4 == r1) goto L15
            r1 = 3
            if (r4 == r1) goto La
            goto L18
        La:
            android.view.Window r4 = r3.getWindow()
            if (r4 == 0) goto L15
            r1 = 24
            r4.addFlags(r1)
        L15:
            r3.requestWindowFeature(r0)
        L18:
            return
    }

    /* renamed from: K0 */
    public void mo1229K0(androidx.fragment.app.AbstractC0375d0 r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
            r3.f2220h1 = r0
            r1 = 1
            r3.f2221i1 = r1
            androidx.fragment.app.a r2 = new androidx.fragment.app.a
            r2.<init>(r4)
            r2.m1081k(r0, r3, r5, r1)
            r2.mo1075e()
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: T */
    public void mo1230T(android.content.Context r2) {
            r1 = this;
            super.mo1230T(r2)
            androidx.lifecycle.d0<androidx.lifecycle.v> r2 = r1.f2271N0
            androidx.lifecycle.e0<androidx.lifecycle.v> r0 = r1.f2217e1
            r2.m1414g(r0)
            boolean r2 = r1.f2221i1
            if (r2 != 0) goto L11
            r2 = 0
            r1.f2220h1 = r2
        L11:
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r4) {
            r3 = this;
            super.mo114V(r4)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r3.f2207U0 = r0
            int r0 = r3.f2299u0
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            r3.f2214b1 = r0
            if (r4 == 0) goto L42
            java.lang.String r0 = "android:style"
            int r0 = r4.getInt(r0, r2)
            r3.f2211Y0 = r0
            java.lang.String r0 = "android:theme"
            int r0 = r4.getInt(r0, r2)
            r3.f2212Z0 = r0
            java.lang.String r0 = "android:cancelable"
            boolean r0 = r4.getBoolean(r0, r1)
            r3.f2213a1 = r0
            boolean r0 = r3.f2214b1
            java.lang.String r1 = "android:showsDialog"
            boolean r0 = r4.getBoolean(r1, r0)
            r3.f2214b1 = r0
            r0 = -1
            java.lang.String r1 = "android:backStackId"
            int r4 = r4.getInt(r1, r0)
            r3.f2215c1 = r4
        L42:
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: Y */
    public void mo1231Y() {
            r2 = this;
            r0 = 1
            r2.f2258A0 = r0
            android.app.Dialog r1 = r2.f2218f1
            if (r1 == 0) goto L20
            r2.f2219g1 = r0
            r0 = 0
            r1.setOnDismissListener(r0)
            android.app.Dialog r1 = r2.f2218f1
            r1.dismiss()
            boolean r1 = r2.f2220h1
            if (r1 != 0) goto L1b
            android.app.Dialog r1 = r2.f2218f1
            r2.onDismiss(r1)
        L1b:
            r2.f2218f1 = r0
            r0 = 0
            r2.f2222j1 = r0
        L20:
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: Z */
    public void mo1232Z() {
            r2 = this;
            r0 = 1
            r2.f2258A0 = r0
            boolean r1 = r2.f2221i1
            if (r1 != 0) goto Ld
            boolean r1 = r2.f2220h1
            if (r1 != 0) goto Ld
            r2.f2220h1 = r0
        Ld:
            androidx.lifecycle.d0<androidx.lifecycle.v> r0 = r2.f2271N0
            androidx.lifecycle.e0<androidx.lifecycle.v> r1 = r2.f2217e1
            r0.mo6k(r1)
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: a0 */
    public android.view.LayoutInflater mo1233a0(android.os.Bundle r7) {
            r6 = this;
            android.view.LayoutInflater r0 = super.mo1233a0(r7)
            boolean r1 = r6.f2214b1
            r2 = 2
            java.lang.String r3 = "FragmentManager"
            if (r1 == 0) goto L88
            boolean r4 = r6.f2216d1
            if (r4 == 0) goto L11
            goto L88
        L11:
            if (r1 != 0) goto L14
            goto L5c
        L14:
            boolean r1 = r6.f2222j1
            if (r1 != 0) goto L5c
            r1 = 0
            r4 = 1
            r6.f2216d1 = r4     // Catch: java.lang.Throwable -> L58
            android.app.Dialog r7 = r6.mo1225G0(r7)     // Catch: java.lang.Throwable -> L58
            r6.f2218f1 = r7     // Catch: java.lang.Throwable -> L58
            boolean r5 = r6.f2214b1     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L52
            int r5 = r6.f2211Y0     // Catch: java.lang.Throwable -> L58
            r6.mo1228J0(r7, r5)     // Catch: java.lang.Throwable -> L58
            android.content.Context r7 = r6.m1339v()     // Catch: java.lang.Throwable -> L58
            boolean r5 = r7 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L3a
            android.app.Dialog r5 = r6.f2218f1     // Catch: java.lang.Throwable -> L58
            android.app.Activity r7 = (android.app.Activity) r7     // Catch: java.lang.Throwable -> L58
            r5.setOwnerActivity(r7)     // Catch: java.lang.Throwable -> L58
        L3a:
            android.app.Dialog r7 = r6.f2218f1     // Catch: java.lang.Throwable -> L58
            boolean r5 = r6.f2213a1     // Catch: java.lang.Throwable -> L58
            r7.setCancelable(r5)     // Catch: java.lang.Throwable -> L58
            android.app.Dialog r7 = r6.f2218f1     // Catch: java.lang.Throwable -> L58
            android.content.DialogInterface$OnCancelListener r5 = r6.f2209W0     // Catch: java.lang.Throwable -> L58
            r7.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L58
            android.app.Dialog r7 = r6.f2218f1     // Catch: java.lang.Throwable -> L58
            android.content.DialogInterface$OnDismissListener r5 = r6.f2210X0     // Catch: java.lang.Throwable -> L58
            r7.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L58
            r6.f2222j1 = r4     // Catch: java.lang.Throwable -> L58
            goto L55
        L52:
            r7 = 0
            r6.f2218f1 = r7     // Catch: java.lang.Throwable -> L58
        L55:
            r6.f2216d1 = r1
            goto L5c
        L58:
            r7 = move-exception
            r6.f2216d1 = r1
            throw r7
        L5c:
            boolean r7 = androidx.fragment.app.AbstractC0375d0.m1131O(r2)
            if (r7 == 0) goto L7b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "get layout inflater for DialogFragment "
            r7.append(r1)
            r7.append(r6)
            java.lang.String r1 = " from dialog context"
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r3, r7)
        L7b:
            android.app.Dialog r7 = r6.f2218f1
            if (r7 == 0) goto L87
            android.content.Context r7 = r7.getContext()
            android.view.LayoutInflater r0 = r0.cloneInContext(r7)
        L87:
            return r0
        L88:
            boolean r7 = androidx.fragment.app.AbstractC0375d0.m1131O(r2)
            if (r7 == 0) goto Lbf
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "getting layout inflater for DialogFragment "
            r7.append(r1)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            boolean r1 = r6.f2214b1
            if (r1 != 0) goto Lab
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "mShowsDialog = false: "
            goto Lb2
        Lab:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "mCreatingDialog = true: "
        Lb2:
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            android.util.Log.d(r3, r7)
        Lbf:
            return r0
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: f0 */
    public void mo1234f0(android.os.Bundle r4) {
            r3 = this;
            android.app.Dialog r0 = r3.f2218f1
            if (r0 == 0) goto L13
            android.os.Bundle r0 = r0.onSaveInstanceState()
            r1 = 0
            java.lang.String r2 = "android:dialogShowing"
            r0.putBoolean(r2, r1)
            java.lang.String r1 = "android:savedDialogState"
            r4.putBundle(r1, r0)
        L13:
            int r0 = r3.f2211Y0
            if (r0 == 0) goto L1c
            java.lang.String r1 = "android:style"
            r4.putInt(r1, r0)
        L1c:
            int r0 = r3.f2212Z0
            if (r0 == 0) goto L25
            java.lang.String r1 = "android:theme"
            r4.putInt(r1, r0)
        L25:
            boolean r0 = r3.f2213a1
            if (r0 != 0) goto L2e
            java.lang.String r1 = "android:cancelable"
            r4.putBoolean(r1, r0)
        L2e:
            boolean r0 = r3.f2214b1
            if (r0 != 0) goto L37
            java.lang.String r1 = "android:showsDialog"
            r4.putBoolean(r1, r0)
        L37:
            int r0 = r3.f2215c1
            r1 = -1
            if (r0 == r1) goto L41
            java.lang.String r1 = "android:backStackId"
            r4.putInt(r1, r0)
        L41:
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: g0 */
    public void mo1235g0() {
            r2 = this;
            r0 = 1
            r2.f2258A0 = r0
            android.app.Dialog r0 = r2.f2218f1
            if (r0 == 0) goto L29
            r1 = 0
            r2.f2219g1 = r1
            r0.show()
            android.app.Dialog r0 = r2.f2218f1
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = 2131362755(0x7f0a03c3, float:1.83453E38)
            r0.setTag(r1, r2)
            r1 = 2131362757(0x7f0a03c5, float:1.8345304E38)
            r0.setTag(r1, r2)
            r1 = 2131362756(0x7f0a03c4, float:1.8345302E38)
            r0.setTag(r1, r2)
        L29:
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: h0 */
    public void mo1236h0() {
            r1 = this;
            r0 = 1
            r1.f2258A0 = r0
            android.app.Dialog r0 = r1.f2218f1
            if (r0 == 0) goto La
            r0.hide()
        La:
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: j0 */
    public void mo1237j0(android.os.Bundle r2) {
            r1 = this;
            r0 = 1
            r1.f2258A0 = r0
            android.app.Dialog r0 = r1.f2218f1
            if (r0 == 0) goto L16
            if (r2 == 0) goto L16
            java.lang.String r0 = "android:savedDialogState"
            android.os.Bundle r2 = r2.getBundle(r0)
            if (r2 == 0) goto L16
            android.app.Dialog r0 = r1.f2218f1
            r0.onRestoreInstanceState(r2)
        L16:
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: k0 */
    public void mo1238k0(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
            r0 = this;
            super.mo1238k0(r1, r2, r3)
            android.view.View r1 = r0.f2260C0
            if (r1 != 0) goto L1a
            android.app.Dialog r1 = r0.f2218f1
            if (r1 == 0) goto L1a
            if (r3 == 0) goto L1a
            java.lang.String r1 = "android:savedDialogState"
            android.os.Bundle r1 = r3.getBundle(r1)
            if (r1 == 0) goto L1a
            android.app.Dialog r2 = r0.f2218f1
            r2.onRestoreInstanceState(r1)
        L1a:
            return
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface r1) {
            r0 = this;
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface r2) {
            r1 = this;
            boolean r2 = r1.f2219g1
            if (r2 != 0) goto L25
            r2 = 3
            boolean r2 = androidx.fragment.app.AbstractC0375d0.m1131O(r2)
            if (r2 == 0) goto L21
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "onDismiss called for DialogFragment "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r2)
        L21:
            r2 = 1
            r1.m1223E0(r2, r2)
        L25:
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: p */
    public androidx.fragment.app.AbstractC0415x mo1239p() {
            r2 = this;
            androidx.fragment.app.n$b r0 = new androidx.fragment.app.n$b
            r0.<init>(r2)
            androidx.fragment.app.l$e r1 = new androidx.fragment.app.l$e
            r1.<init>(r2, r0)
            return r1
    }
}
