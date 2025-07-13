package androidx.mediarouter.app;

/* renamed from: androidx.mediarouter.app.a */
/* loaded from: classes.dex */
public class C0481a extends android.view.View {

    /* renamed from: p0 */
    public static androidx.mediarouter.app.C0481a.a f2617p0;

    /* renamed from: q0 */
    public static final android.util.SparseArray<android.graphics.drawable.Drawable.ConstantState> f2618q0 = null;

    /* renamed from: r0 */
    public static final int[] f2619r0 = null;

    /* renamed from: s0 */
    public static final int[] f2620s0 = null;

    /* renamed from: a0 */
    public final p085f1.C1974o f2621a0;

    /* renamed from: b0 */
    public final androidx.mediarouter.app.C0481a.b f2622b0;

    /* renamed from: c0 */
    public p085f1.C1973n f2623c0;

    /* renamed from: d0 */
    public androidx.mediarouter.app.C0491k f2624d0;

    /* renamed from: e0 */
    public boolean f2625e0;

    /* renamed from: f0 */
    public int f2626f0;

    /* renamed from: g0 */
    public androidx.mediarouter.app.C0481a.c f2627g0;

    /* renamed from: h0 */
    public android.graphics.drawable.Drawable f2628h0;

    /* renamed from: i0 */
    public int f2629i0;

    /* renamed from: j0 */
    public int f2630j0;

    /* renamed from: k0 */
    public android.content.res.ColorStateList f2631k0;

    /* renamed from: l0 */
    public int f2632l0;

    /* renamed from: m0 */
    public int f2633m0;

    /* renamed from: n0 */
    public boolean f2634n0;

    /* renamed from: o0 */
    public boolean f2635o0;

    /* renamed from: androidx.mediarouter.app.a$a */
    public static final class a extends android.content.BroadcastReceiver {

        /* renamed from: a */
        public final android.content.Context f2636a;

        /* renamed from: b */
        public boolean f2637b;

        /* renamed from: c */
        public java.util.List<androidx.mediarouter.app.C0481a> f2638c;

        public a(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.f2637b = r0
                r1.f2636a = r2
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.f2638c = r2
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r2, android.content.Intent r3) {
                r1 = this;
                java.lang.String r2 = r3.getAction()
                java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto L31
                r2 = 0
                java.lang.String r0 = "noConnectivity"
                boolean r2 = r3.getBooleanExtra(r0, r2)
                r2 = r2 ^ 1
                boolean r3 = r1.f2637b
                if (r3 == r2) goto L31
                r1.f2637b = r2
                java.util.List<androidx.mediarouter.app.a> r2 = r1.f2638c
                java.util.Iterator r2 = r2.iterator()
            L21:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L31
                java.lang.Object r3 = r2.next()
                androidx.mediarouter.app.a r3 = (androidx.mediarouter.app.C0481a) r3
                r3.m1480c()
                goto L21
            L31:
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.a$b */
    public final class b extends p085f1.C1974o.b {

        /* renamed from: a */
        public final /* synthetic */ androidx.mediarouter.app.C0481a f2639a;

        public b(androidx.mediarouter.app.C0481a r1) {
                r0 = this;
                r0.f2639a = r1
                r0.<init>()
                return
        }

        @Override // p085f1.C1974o.b
        /* renamed from: a */
        public void mo1485a(p085f1.C1974o r1, p085f1.C1974o.h r2) {
                r0 = this;
                androidx.mediarouter.app.a r1 = r0.f2639a
                r1.m1479b()
                return
        }

        @Override // p085f1.C1974o.b
        /* renamed from: b */
        public void mo1486b(p085f1.C1974o r1, p085f1.C1974o.h r2) {
                r0 = this;
                androidx.mediarouter.app.a r1 = r0.f2639a
                r1.m1479b()
                return
        }

        @Override // p085f1.C1974o.b
        /* renamed from: c */
        public void mo1487c(p085f1.C1974o r1, p085f1.C1974o.h r2) {
                r0 = this;
                androidx.mediarouter.app.a r1 = r0.f2639a
                r1.m1479b()
                return
        }

        @Override // p085f1.C1974o.b
        /* renamed from: d */
        public void mo1488d(p085f1.C1974o r1, p085f1.C1974o.i r2) {
                r0 = this;
                androidx.mediarouter.app.a r1 = r0.f2639a
                r1.m1479b()
                return
        }

        @Override // p085f1.C1974o.b
        /* renamed from: e */
        public void mo1489e(p085f1.C1974o r1, p085f1.C1974o.i r2) {
                r0 = this;
                androidx.mediarouter.app.a r1 = r0.f2639a
                r1.m1479b()
                return
        }

        @Override // p085f1.C1974o.b
        /* renamed from: f */
        public void mo1490f(p085f1.C1974o r1, p085f1.C1974o.i r2) {
                r0 = this;
                androidx.mediarouter.app.a r1 = r0.f2639a
                r1.m1479b()
                return
        }

        @Override // p085f1.C1974o.b
        /* renamed from: g */
        public void mo1491g(p085f1.C1974o r1, p085f1.C1974o.i r2) {
                r0 = this;
                androidx.mediarouter.app.a r1 = r0.f2639a
                r1.m1479b()
                return
        }

        @Override // p085f1.C1974o.b
        /* renamed from: i */
        public void mo1492i(p085f1.C1974o r1, p085f1.C1974o.i r2) {
                r0 = this;
                androidx.mediarouter.app.a r1 = r0.f2639a
                r1.m1479b()
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.a$c */
    public final class c extends android.os.AsyncTask<java.lang.Void, java.lang.Void, android.graphics.drawable.Drawable> {

        /* renamed from: a */
        public final int f2640a;

        /* renamed from: b */
        public final android.content.Context f2641b;

        /* renamed from: c */
        public final /* synthetic */ androidx.mediarouter.app.C0481a f2642c;

        public c(androidx.mediarouter.app.C0481a r1, int r2, android.content.Context r3) {
                r0 = this;
                r0.f2642c = r1
                r0.<init>()
                r0.f2640a = r2
                r0.f2641b = r3
                return
        }

        @Override // android.os.AsyncTask
        public android.graphics.drawable.Drawable doInBackground(java.lang.Void[] r2) {
                r1 = this;
                java.lang.Void[] r2 = (java.lang.Void[]) r2
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r2 = androidx.mediarouter.app.C0481a.f2618q0
                int r0 = r1.f2640a
                java.lang.Object r2 = r2.get(r0)
                android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
                if (r2 != 0) goto L1b
                android.content.Context r2 = r1.f2641b
                android.content.res.Resources r2 = r2.getResources()
                int r0 = r1.f2640a
                android.graphics.drawable.Drawable r2 = r2.getDrawable(r0)
                goto L1c
            L1b:
                r2 = 0
            L1c:
                return r2
        }

        @Override // android.os.AsyncTask
        public void onCancelled(android.graphics.drawable.Drawable r3) {
                r2 = this;
                android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
                if (r3 == 0) goto Lf
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r0 = androidx.mediarouter.app.C0481a.f2618q0
                int r1 = r2.f2640a
                android.graphics.drawable.Drawable$ConstantState r3 = r3.getConstantState()
                r0.put(r1, r3)
            Lf:
                androidx.mediarouter.app.a r3 = r2.f2642c
                r0 = 0
                r3.f2627g0 = r0
                return
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(android.graphics.drawable.Drawable r5) {
                r4 = this;
                android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
                r0 = 0
                if (r5 == 0) goto L15
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r1 = androidx.mediarouter.app.C0481a.f2618q0
                int r2 = r4.f2640a
                android.graphics.drawable.Drawable$ConstantState r3 = r5.getConstantState()
                r1.put(r2, r3)
                androidx.mediarouter.app.a r1 = r4.f2642c
                r1.f2627g0 = r0
                goto L29
            L15:
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r1 = androidx.mediarouter.app.C0481a.f2618q0
                int r2 = r4.f2640a
                java.lang.Object r1 = r1.get(r2)
                android.graphics.drawable.Drawable$ConstantState r1 = (android.graphics.drawable.Drawable.ConstantState) r1
                if (r1 == 0) goto L25
                android.graphics.drawable.Drawable r5 = r1.newDrawable()
            L25:
                androidx.mediarouter.app.a r1 = r4.f2642c
                r1.f2627g0 = r0
            L29:
                androidx.mediarouter.app.a r0 = r4.f2642c
                r0.m1484x9b648342(r5)
                return
        }
    }

    static {
            android.util.SparseArray r0 = new android.util.SparseArray
            r1 = 2
            r0.<init>(r1)
            androidx.mediarouter.app.C0481a.f2618q0 = r0
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r3 = 0
            r1[r3] = r2
            androidx.mediarouter.app.C0481a.f2619r0 = r1
            int[] r0 = new int[r0]
            r1 = 16842911(0x101009f, float:2.3694004E-38)
            r0[r3] = r1
            androidx.mediarouter.app.C0481a.f2620s0 = r0
            return
    }

    public C0481a(android.content.Context r11) {
            r10 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = androidx.mediarouter.app.C0498r.m1555g(r11)
            r0.<init>(r11, r1)
            r11 = 2130969267(0x7f0402b3, float:1.7547211E38)
            int r11 = androidx.mediarouter.app.C0498r.m1557i(r0, r11)
            if (r11 == 0) goto L18
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r1.<init>(r0, r11)
            r0 = r1
        L18:
            r11 = 2130969255(0x7f0402a7, float:1.7547187E38)
            r1 = 0
            r10.<init>(r0, r1, r11)
            f1.n r0 = p085f1.C1973n.f8666c
            r10.f2623c0 = r0
            androidx.mediarouter.app.k r0 = androidx.mediarouter.app.C0491k.f2759a
            r10.f2624d0 = r0
            r0 = 0
            r10.f2626f0 = r0
            android.content.Context r9 = r10.getContext()
            int[] r4 = p066e1.C1507a.f7339a
            android.content.res.TypedArray r11 = r9.obtainStyledAttributes(r1, r4, r11, r0)
            r8 = 0
            r7 = 2130969255(0x7f0402a7, float:1.7547187E38)
            r5 = 0
            r2 = r10
            r3 = r9
            r6 = r11
            p227n0.C4661t.m10545u(r2, r3, r4, r5, r6, r7, r8)
            boolean r2 = r10.isInEditMode()
            r3 = 3
            if (r2 == 0) goto L5a
            r10.f2621a0 = r1
            r10.f2622b0 = r1
            int r11 = r11.getResourceId(r3, r0)
            android.content.res.Resources r0 = r10.getResources()
            android.graphics.drawable.Drawable r11 = r0.getDrawable(r11)
            r10.f2628h0 = r11
            goto Le1
        L5a:
            f1.o r1 = p085f1.C1974o.m5026d(r9)
            r10.f2621a0 = r1
            androidx.mediarouter.app.a$b r1 = new androidx.mediarouter.app.a$b
            r1.<init>(r10)
            r10.f2622b0 = r1
            androidx.mediarouter.app.a$a r1 = androidx.mediarouter.app.C0481a.f2617p0
            if (r1 != 0) goto L76
            androidx.mediarouter.app.a$a r1 = new androidx.mediarouter.app.a$a
            android.content.Context r2 = r9.getApplicationContext()
            r1.<init>(r2)
            androidx.mediarouter.app.C0481a.f2617p0 = r1
        L76:
            r1 = 4
            android.content.res.ColorStateList r1 = r11.getColorStateList(r1)
            r10.f2631k0 = r1
            int r1 = r11.getDimensionPixelSize(r0, r0)
            r10.f2632l0 = r1
            r1 = 1
            int r2 = r11.getDimensionPixelSize(r1, r0)
            r10.f2633m0 = r2
            int r2 = r11.getResourceId(r3, r0)
            r3 = 2
            int r3 = r11.getResourceId(r3, r0)
            r10.f2629i0 = r3
            r11.recycle()
            int r11 = r10.f2629i0
            if (r11 == 0) goto Lad
            android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r3 = androidx.mediarouter.app.C0481a.f2618q0
            java.lang.Object r11 = r3.get(r11)
            android.graphics.drawable.Drawable$ConstantState r11 = (android.graphics.drawable.Drawable.ConstantState) r11
            if (r11 == 0) goto Lad
            android.graphics.drawable.Drawable r11 = r11.newDrawable()
            r10.setRemoteIndicatorDrawable(r11)
        Lad:
            android.graphics.drawable.Drawable r11 = r10.f2628h0
            if (r11 != 0) goto Ldb
            if (r2 == 0) goto Ld8
            android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r11 = androidx.mediarouter.app.C0481a.f2618q0
            java.lang.Object r11 = r11.get(r2)
            android.graphics.drawable.Drawable$ConstantState r11 = (android.graphics.drawable.Drawable.ConstantState) r11
            if (r11 == 0) goto Lc5
            android.graphics.drawable.Drawable r11 = r11.newDrawable()
            r10.m1484x9b648342(r11)
            goto Ldb
        Lc5:
            androidx.mediarouter.app.a$c r11 = new androidx.mediarouter.app.a$c
            android.content.Context r3 = r10.getContext()
            r11.<init>(r10, r2, r3)
            r10.f2627g0 = r11
            java.util.concurrent.Executor r2 = android.os.AsyncTask.SERIAL_EXECUTOR
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r11.executeOnExecutor(r2, r0)
            goto Ldb
        Ld8:
            r10.m1478a()
        Ldb:
            r10.m1483f()
            r10.setClickable(r1)
        Le1:
            return
    }

    private android.app.Activity getActivity() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
        L4:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L16
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto Lf
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
        Lf:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L4
        L16:
            r0 = 0
            return r0
    }

    private androidx.fragment.app.AbstractC0375d0 getFragmentManager() {
            r2 = this;
            android.app.Activity r0 = r2.getActivity()
            boolean r1 = r0 instanceof androidx.fragment.app.ActivityC0405s
            if (r1 == 0) goto Lf
            androidx.fragment.app.s r0 = (androidx.fragment.app.ActivityC0405s) r0
            androidx.fragment.app.d0 r0 = r0.m1354t()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    /* renamed from: a */
    public final void m1478a() {
            r4 = this;
            int r0 = r4.f2629i0
            if (r0 <= 0) goto L22
            androidx.mediarouter.app.a$c r0 = r4.f2627g0
            r1 = 0
            if (r0 == 0) goto Lc
            r0.cancel(r1)
        Lc:
            androidx.mediarouter.app.a$c r0 = new androidx.mediarouter.app.a$c
            int r2 = r4.f2629i0
            android.content.Context r3 = r4.getContext()
            r0.<init>(r4, r2, r3)
            r4.f2627g0 = r0
            r4.f2629i0 = r1
            java.util.concurrent.Executor r2 = android.os.AsyncTask.SERIAL_EXECUTOR
            java.lang.Void[] r1 = new java.lang.Void[r1]
            r0.executeOnExecutor(r2, r1)
        L22:
            return
    }

    /* renamed from: b */
    public void m1479b() {
            r6 = this;
            f1.o r0 = r6.f2621a0
            f1.o$i r0 = r0.m5031g()
            boolean r1 = r0.m5066e()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L18
            f1.n r1 = r6.f2623c0
            boolean r1 = r0.m5070i(r1)
            if (r1 == 0) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            if (r1 == 0) goto L1e
            int r0 = r0.f8740h
            goto L1f
        L1e:
            r0 = 0
        L1f:
            int r1 = r6.f2630j0
            if (r1 == r0) goto L27
            r6.f2630j0 = r0
            r1 = 1
            goto L28
        L27:
            r1 = 0
        L28:
            if (r1 == 0) goto L30
            r6.m1483f()
            r6.refreshDrawableState()
        L30:
            if (r0 != r3) goto L35
            r6.m1478a()
        L35:
            boolean r4 = r6.f2625e0
            if (r4 == 0) goto L4b
            boolean r4 = r6.f2634n0
            if (r4 != 0) goto L47
            f1.o r4 = r6.f2621a0
            f1.n r5 = r6.f2623c0
            boolean r4 = r4.m5032h(r5, r3)
            if (r4 == 0) goto L48
        L47:
            r2 = 1
        L48:
            r6.setEnabled(r2)
        L4b:
            android.graphics.drawable.Drawable r2 = r6.f2628h0
            if (r2 == 0) goto L85
            android.graphics.drawable.Drawable r2 = r2.getCurrent()
            boolean r2 = r2 instanceof android.graphics.drawable.AnimationDrawable
            if (r2 == 0) goto L85
            android.graphics.drawable.Drawable r2 = r6.f2628h0
            android.graphics.drawable.Drawable r2 = r2.getCurrent()
            android.graphics.drawable.AnimationDrawable r2 = (android.graphics.drawable.AnimationDrawable) r2
            boolean r4 = r6.f2625e0
            if (r4 == 0) goto L71
            if (r1 != 0) goto L67
            if (r0 != r3) goto L85
        L67:
            boolean r0 = r2.isRunning()
            if (r0 != 0) goto L85
            r2.start()
            goto L85
        L71:
            r1 = 2
            if (r0 != r1) goto L85
            boolean r0 = r2.isRunning()
            if (r0 == 0) goto L7d
            r2.stop()
        L7d:
            int r0 = r2.getNumberOfFrames()
            int r0 = r0 - r3
            r2.selectDrawable(r0)
        L85:
            return
    }

    /* renamed from: c */
    public void m1480c() {
            r3 = this;
            int r0 = r3.f2626f0
            if (r0 != 0) goto Lf
            boolean r1 = r3.f2634n0
            if (r1 != 0) goto Lf
            androidx.mediarouter.app.a$a r1 = androidx.mediarouter.app.C0481a.f2617p0
            boolean r1 = r1.f2637b
            if (r1 != 0) goto Lf
            r0 = 4
        Lf:
            super.setVisibility(r0)
            android.graphics.drawable.Drawable r0 = r3.f2628h0
            if (r0 == 0) goto L23
            int r1 = r3.getVisibility()
            r2 = 0
            if (r1 != 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            r0.setVisible(r1, r2)
        L23:
            return
    }

    /* renamed from: d */
    public boolean m1481d() {
            r7 = this;
            boolean r0 = r7.f2625e0
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            f1.o r0 = r7.f2621a0
            java.util.Objects.requireNonNull(r0)
            p085f1.C1974o.m5025b()
            f1.o$e r0 = p085f1.C1974o.f8670d
            f1.c0 r2 = r0.f8694n
            r3 = 1
            if (r2 == 0) goto L77
            boolean r4 = r2.f8515b
            if (r4 == 0) goto L70
            boolean r0 = r0.f8682b
            if (r0 == 0) goto L70
            android.content.Context r0 = r7.getContext()
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r5 = "com.android.settings.panel.action.MEDIA_OUTPUT"
            android.content.Intent r4 = r4.setAction(r5)
            java.lang.String r5 = r0.getPackageName()
            java.lang.String r6 = "com.android.settings.panel.extra.PACKAGE_NAME"
            android.content.Intent r4 = r4.putExtra(r6, r5)
            f1.o r5 = r7.f2621a0
            android.support.v4.media.session.MediaSessionCompat$Token r5 = r5.m5029e()
            java.lang.String r6 = "key_media_session_token"
            android.content.Intent r4 = r4.putExtra(r6, r5)
            android.content.pm.PackageManager r5 = r0.getPackageManager()
            java.util.List r5 = r5.queryIntentActivities(r4, r1)
            java.util.Iterator r5 = r5.iterator()
        L4e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L6d
            java.lang.Object r6 = r5.next()
            android.content.pm.ResolveInfo r6 = (android.content.pm.ResolveInfo) r6
            android.content.pm.ActivityInfo r6 = r6.activityInfo
            if (r6 == 0) goto L4e
            android.content.pm.ApplicationInfo r6 = r6.applicationInfo
            if (r6 != 0) goto L63
            goto L4e
        L63:
            int r6 = r6.flags
            r6 = r6 & 129(0x81, float:1.81E-43)
            if (r6 == 0) goto L4e
            r0.startActivity(r4)
            r1 = 1
        L6d:
            if (r1 == 0) goto L70
            return r3
        L70:
            int r0 = r2.f8514a
            boolean r0 = r7.m1482e(r0)
            return r0
        L77:
            boolean r0 = r7.m1482e(r3)
            return r0
    }

    @Override // android.view.View
    public void drawableStateChanged() {
            r2 = this;
            super.drawableStateChanged()
            android.graphics.drawable.Drawable r0 = r2.f2628h0
            if (r0 == 0) goto L13
            int[] r0 = r2.getDrawableState()
            android.graphics.drawable.Drawable r1 = r2.f2628h0
            r1.setState(r0)
            r2.invalidate()
        L13:
            return
    }

    /* renamed from: e */
    public final boolean m1482e(int r12) {
            r11 = this;
            androidx.fragment.app.d0 r0 = r11.getFragmentManager()
            if (r0 == 0) goto L10b
            f1.o r1 = r11.f2621a0
            f1.o$i r1 = r1.m5031g()
            boolean r2 = r1.m5066e()
            java.lang.String r3 = "This must be called before creating dialog"
            java.lang.String r4 = "MediaRouteButton"
            r5 = 2
            java.lang.String r6 = "selector"
            java.lang.String r7 = "selector must not be null"
            r8 = 0
            r9 = 1
            if (r2 != 0) goto La0
            f1.n r2 = r11.f2623c0
            boolean r1 = r1.m5070i(r2)
            if (r1 != 0) goto L27
            goto La0
        L27:
            java.lang.String r1 = "android.support.v7.mediarouter:MediaRouteControllerDialogFragment"
            androidx.fragment.app.n r2 = r0.m1140I(r1)
            if (r2 == 0) goto L35
            java.lang.String r12 = "showDialog(): Route controller dialog already showing!"
        L31:
            android.util.Log.w(r4, r12)
            return r8
        L35:
            androidx.mediarouter.app.k r2 = r11.f2624d0
            java.util.Objects.requireNonNull(r2)
            androidx.mediarouter.app.j r2 = new androidx.mediarouter.app.j
            r2.<init>()
            f1.n r4 = r11.f2623c0
            if (r4 == 0) goto L9a
            f1.n r7 = r2.f2758m1
            if (r7 != 0) goto L5d
            android.os.Bundle r7 = r2.f2282d0
            if (r7 == 0) goto L55
            android.os.Bundle r7 = r7.getBundle(r6)
            f1.n r7 = p085f1.C1973n.m5022b(r7)
            r2.f2758m1 = r7
        L55:
            f1.n r7 = r2.f2758m1
            if (r7 != 0) goto L5d
            f1.n r7 = p085f1.C1973n.f8666c
            r2.f2758m1 = r7
        L5d:
            f1.n r7 = r2.f2758m1
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L85
            r2.f2758m1 = r4
            android.os.Bundle r7 = r2.f2282d0
            if (r7 != 0) goto L70
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
        L70:
            android.os.Bundle r10 = r4.f8667a
            r7.putBundle(r6, r10)
            r2.m1344x0(r7)
            android.app.Dialog r6 = r2.f2757l1
            if (r6 == 0) goto L85
            boolean r7 = r2.f2756k1
            if (r7 == 0) goto L85
            androidx.mediarouter.app.o r6 = (androidx.mediarouter.app.DialogC0495o) r6
            r6.m1531j(r4)
        L85:
            if (r12 != r5) goto L94
            android.app.Dialog r12 = r2.f2757l1
            if (r12 != 0) goto L8e
            r2.f2756k1 = r9
            goto L94
        L8e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>(r3)
            throw r12
        L94:
            androidx.fragment.app.a r12 = new androidx.fragment.app.a
            r12.<init>(r0)
            goto Lfe
        L9a:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>(r7)
            throw r12
        La0:
            java.lang.String r1 = "android.support.v7.mediarouter:MediaRouteChooserDialogFragment"
            androidx.fragment.app.n r2 = r0.m1140I(r1)
            if (r2 == 0) goto Lab
            java.lang.String r12 = "showDialog(): Route chooser dialog already showing!"
            goto L31
        Lab:
            androidx.mediarouter.app.k r2 = r11.f2624d0
            java.util.Objects.requireNonNull(r2)
            androidx.mediarouter.app.c r2 = new androidx.mediarouter.app.c
            r2.<init>()
            f1.n r4 = r11.f2623c0
            if (r4 == 0) goto L105
            r2.m1495L0()
            f1.n r7 = r2.f2663m1
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto Lea
            r2.f2663m1 = r4
            android.os.Bundle r7 = r2.f2282d0
            if (r7 != 0) goto Lcf
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
        Lcf:
            android.os.Bundle r10 = r4.f8667a
            r7.putBundle(r6, r10)
            r2.m1344x0(r7)
            android.app.Dialog r6 = r2.f2662l1
            if (r6 == 0) goto Lea
            boolean r7 = r2.f2661k1
            if (r7 == 0) goto Le5
            androidx.mediarouter.app.m r6 = (androidx.mediarouter.app.DialogC0493m) r6
            r6.m1519e(r4)
            goto Lea
        Le5:
            androidx.mediarouter.app.b r6 = (androidx.mediarouter.app.DialogC0482b) r6
            r6.m1494e(r4)
        Lea:
            if (r12 != r5) goto Lf9
            android.app.Dialog r12 = r2.f2662l1
            if (r12 != 0) goto Lf3
            r2.f2661k1 = r9
            goto Lf9
        Lf3:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>(r3)
            throw r12
        Lf9:
            androidx.fragment.app.a r12 = new androidx.fragment.app.a
            r12.<init>(r0)
        Lfe:
            r12.m1081k(r8, r2, r1, r9)
            r12.m1077g()
            return r9
        L105:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>(r7)
            throw r12
        L10b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "The activity must be a subclass of FragmentActivity"
            r12.<init>(r0)
            throw r12
    }

    /* renamed from: f */
    public final void m1483f() {
            r2 = this;
            int r0 = r2.f2630j0
            r1 = 1
            if (r0 == r1) goto L10
            r1 = 2
            if (r0 == r1) goto Lc
            r0 = 2131951881(0x7f130109, float:1.954019E38)
            goto L13
        Lc:
            r0 = 2131951879(0x7f130107, float:1.9540185E38)
            goto L13
        L10:
            r0 = 2131951880(0x7f130108, float:1.9540187E38)
        L13:
            android.content.Context r1 = r2.getContext()
            java.lang.String r0 = r1.getString(r0)
            r2.setContentDescription(r0)
            boolean r1 = r2.f2635o0
            if (r1 == 0) goto L29
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L29
            goto L2a
        L29:
            r0 = 0
        L2a:
            androidx.appcompat.widget.C0263b1.m693a(r2, r0)
            return
    }

    public androidx.mediarouter.app.C0491k getDialogFactory() {
            r1 = this;
            androidx.mediarouter.app.k r0 = r1.f2624d0
            return r0
    }

    public p085f1.C1973n getRouteSelector() {
            r1 = this;
            f1.n r0 = r1.f2623c0
            return r0
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            android.graphics.drawable.Drawable r0 = r1.f2628h0
            if (r0 == 0) goto La
            r0.jumpToCurrentState()
        La:
            return
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
            r4 = this;
            super.onAttachedToWindow()
            boolean r0 = r4.isInEditMode()
            if (r0 == 0) goto La
            return
        La:
            r0 = 1
            r4.f2625e0 = r0
            f1.n r0 = r4.f2623c0
            boolean r0 = r0.m5024c()
            if (r0 != 0) goto L1f
            f1.o r0 = r4.f2621a0
            f1.n r1 = r4.f2623c0
            androidx.mediarouter.app.a$b r2 = r4.f2622b0
            r3 = 0
            r0.m5027a(r1, r2, r3)
        L1f:
            r4.m1479b()
            androidx.mediarouter.app.a$a r0 = androidx.mediarouter.app.C0481a.f2617p0
            java.util.List<androidx.mediarouter.app.a> r1 = r0.f2638c
            int r1 = r1.size()
            if (r1 != 0) goto L3b
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>()
            java.lang.String r2 = "android.net.conn.CONNECTIVITY_CHANGE"
            r1.addAction(r2)
            android.content.Context r2 = r0.f2636a
            r2.registerReceiver(r0, r1)
        L3b:
            java.util.List<androidx.mediarouter.app.a> r0 = r0.f2638c
            r0.add(r4)
            return
    }

    @Override // android.view.View
    public int[] onCreateDrawableState(int r4) {
            r3 = this;
            r0 = 1
            int r4 = r4 + r0
            int[] r4 = super.onCreateDrawableState(r4)
            f1.o r1 = r3.f2621a0
            if (r1 != 0) goto Lb
            return r4
        Lb:
            p085f1.C1974o.m5025b()
            f1.o$e r1 = p085f1.C1974o.f8670d
            f1.c0 r1 = r1.f8694n
            r2 = 0
            if (r1 == 0) goto L1d
            android.os.Bundle r1 = r1.f8517d
            java.lang.String r2 = "androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON"
            boolean r2 = r1.getBoolean(r2)
        L1d:
            if (r2 == 0) goto L20
            return r4
        L20:
            int r1 = r3.f2630j0
            if (r1 == r0) goto L2e
            r0 = 2
            if (r1 == r0) goto L28
            goto L33
        L28:
            int[] r0 = androidx.mediarouter.app.C0481a.f2619r0
            android.view.View.mergeDrawableStates(r4, r0)
            goto L33
        L2e:
            int[] r0 = androidx.mediarouter.app.C0481a.f2620s0
            android.view.View.mergeDrawableStates(r4, r0)
        L33:
            return r4
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
            r2 = this;
            boolean r0 = r2.isInEditMode()
            if (r0 != 0) goto L2c
            r0 = 0
            r2.f2625e0 = r0
            f1.n r0 = r2.f2623c0
            boolean r0 = r0.m5024c()
            if (r0 != 0) goto L18
            f1.o r0 = r2.f2621a0
            androidx.mediarouter.app.a$b r1 = r2.f2622b0
            r0.m5033i(r1)
        L18:
            androidx.mediarouter.app.a$a r0 = androidx.mediarouter.app.C0481a.f2617p0
            java.util.List<androidx.mediarouter.app.a> r1 = r0.f2638c
            r1.remove(r2)
            java.util.List<androidx.mediarouter.app.a> r1 = r0.f2638c
            int r1 = r1.size()
            if (r1 != 0) goto L2c
            android.content.Context r1 = r0.f2636a
            r1.unregisterReceiver(r0)
        L2c:
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r7) {
            r6 = this;
            super.onDraw(r7)
            android.graphics.drawable.Drawable r0 = r6.f2628h0
            if (r0 == 0) goto L43
            int r0 = r6.getPaddingLeft()
            int r1 = r6.getWidth()
            int r2 = r6.getPaddingRight()
            int r1 = r1 - r2
            int r2 = r6.getPaddingTop()
            int r3 = r6.getHeight()
            int r4 = r6.getPaddingBottom()
            int r3 = r3 - r4
            android.graphics.drawable.Drawable r4 = r6.f2628h0
            int r4 = r4.getIntrinsicWidth()
            android.graphics.drawable.Drawable r5 = r6.f2628h0
            int r5 = r5.getIntrinsicHeight()
            int r1 = r1 - r0
            int r1 = r1 - r4
            int r1 = r1 / 2
            int r1 = r1 + r0
            int r3 = r3 - r2
            int r3 = r3 - r5
            int r3 = r3 / 2
            int r3 = r3 + r2
            android.graphics.drawable.Drawable r0 = r6.f2628h0
            int r4 = r4 + r1
            int r5 = r5 + r3
            r0.setBounds(r1, r3, r4, r5)
            android.graphics.drawable.Drawable r0 = r6.f2628h0
            r0.draw(r7)
        L43:
            return
    }

    @Override // android.view.View
    public void onMeasure(int r7, int r8) {
            r6 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r7 = android.view.View.MeasureSpec.getMode(r7)
            int r8 = android.view.View.MeasureSpec.getMode(r8)
            int r2 = r6.f2632l0
            android.graphics.drawable.Drawable r3 = r6.f2628h0
            r4 = 0
            if (r3 == 0) goto L26
            int r3 = r3.getIntrinsicWidth()
            int r5 = r6.getPaddingLeft()
            int r5 = r5 + r3
            int r3 = r6.getPaddingRight()
            int r3 = r3 + r5
            goto L27
        L26:
            r3 = 0
        L27:
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r6.f2633m0
            android.graphics.drawable.Drawable r5 = r6.f2628h0
            if (r5 == 0) goto L3f
            int r4 = r5.getIntrinsicHeight()
            int r5 = r6.getPaddingTop()
            int r5 = r5 + r4
            int r4 = r6.getPaddingBottom()
            int r4 = r4 + r5
        L3f:
            int r3 = java.lang.Math.max(r3, r4)
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == r5) goto L4d
            if (r7 == r4) goto L51
            r0 = r2
            goto L51
        L4d:
            int r0 = java.lang.Math.min(r0, r2)
        L51:
            if (r8 == r5) goto L57
            if (r8 == r4) goto L5b
            r1 = r3
            goto L5b
        L57:
            int r1 = java.lang.Math.min(r1, r3)
        L5b:
            r6.setMeasuredDimension(r0, r1)
            return
    }

    @Override // android.view.View
    public boolean performClick() {
            r3 = this;
            boolean r0 = super.performClick()
            r1 = 0
            if (r0 != 0) goto La
            r3.playSoundEffect(r1)
        La:
            r3.m1478a()
            boolean r2 = r3.m1481d()
            if (r2 != 0) goto L15
            if (r0 == 0) goto L16
        L15:
            r1 = 1
        L16:
            return r1
    }

    public void setAlwaysVisible(boolean r2) {
            r1 = this;
            boolean r0 = r1.f2634n0
            if (r2 == r0) goto Lc
            r1.f2634n0 = r2
            r1.m1480c()
            r1.m1479b()
        Lc:
            return
    }

    public void setCheatSheetEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.f2635o0
            if (r2 == r0) goto L9
            r1.f2635o0 = r2
            r1.m1483f()
        L9:
            return
    }

    public void setDialogFactory(androidx.mediarouter.app.C0491k r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.f2624d0 = r2
            return
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "factory must not be null"
            r2.<init>(r0)
            throw r2
    }

    public void setRemoteIndicatorDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = 0
            r1.f2629i0 = r0
            r1.m1484x9b648342(r2)
            return
    }

    /* renamed from: setRemoteIndicatorDrawableInternal */
    public void m1484x9b648342(android.graphics.drawable.Drawable r4) {
            r3 = this;
            androidx.mediarouter.app.a$c r0 = r3.f2627g0
            r1 = 0
            if (r0 == 0) goto L8
            r0.cancel(r1)
        L8:
            android.graphics.drawable.Drawable r0 = r3.f2628h0
            if (r0 == 0) goto L15
            r2 = 0
            r0.setCallback(r2)
            android.graphics.drawable.Drawable r0 = r3.f2628h0
            r3.unscheduleDrawable(r0)
        L15:
            r0 = 1
            if (r4 == 0) goto L3f
            android.content.res.ColorStateList r2 = r3.f2631k0
            if (r2 == 0) goto L29
            android.graphics.drawable.Drawable r4 = r4.mutate()
            android.graphics.drawable.Drawable r4 = p103g0.C2200a.m5792h(r4)
            android.content.res.ColorStateList r2 = r3.f2631k0
            r4.setTintList(r2)
        L29:
            r4.setCallback(r3)
            int[] r2 = r3.getDrawableState()
            r4.setState(r2)
            int r2 = r3.getVisibility()
            if (r2 != 0) goto L3b
            r2 = 1
            goto L3c
        L3b:
            r2 = 0
        L3c:
            r4.setVisible(r2, r1)
        L3f:
            r3.f2628h0 = r4
            r3.refreshDrawableState()
            boolean r4 = r3.f2625e0
            if (r4 == 0) goto L7e
            android.graphics.drawable.Drawable r4 = r3.f2628h0
            if (r4 == 0) goto L7e
            android.graphics.drawable.Drawable r4 = r4.getCurrent()
            boolean r4 = r4 instanceof android.graphics.drawable.AnimationDrawable
            if (r4 == 0) goto L7e
            android.graphics.drawable.Drawable r4 = r3.f2628h0
            android.graphics.drawable.Drawable r4 = r4.getCurrent()
            android.graphics.drawable.AnimationDrawable r4 = (android.graphics.drawable.AnimationDrawable) r4
            int r1 = r3.f2630j0
            if (r1 != r0) goto L6a
            boolean r0 = r4.isRunning()
            if (r0 != 0) goto L7e
            r4.start()
            goto L7e
        L6a:
            r2 = 2
            if (r1 != r2) goto L7e
            boolean r1 = r4.isRunning()
            if (r1 == 0) goto L76
            r4.stop()
        L76:
            int r1 = r4.getNumberOfFrames()
            int r1 = r1 - r0
            r4.selectDrawable(r1)
        L7e:
            return
    }

    public void setRouteSelector(p085f1.C1973n r4) {
            r3 = this;
            if (r4 == 0) goto L31
            f1.n r0 = r3.f2623c0
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L30
            boolean r0 = r3.f2625e0
            if (r0 == 0) goto L2b
            f1.n r0 = r3.f2623c0
            boolean r0 = r0.m5024c()
            if (r0 != 0) goto L1d
            f1.o r0 = r3.f2621a0
            androidx.mediarouter.app.a$b r1 = r3.f2622b0
            r0.m5033i(r1)
        L1d:
            boolean r0 = r4.m5024c()
            if (r0 != 0) goto L2b
            f1.o r0 = r3.f2621a0
            androidx.mediarouter.app.a$b r1 = r3.f2622b0
            r2 = 0
            r0.m5027a(r4, r1, r2)
        L2b:
            r3.f2623c0 = r4
            r3.m1479b()
        L30:
            return
        L31:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "selector must not be null"
            r4.<init>(r0)
            throw r4
    }

    @Override // android.view.View
    public void setVisibility(int r1) {
            r0 = this;
            r0.f2626f0 = r1
            r0.m1480c()
            return
    }

    @Override // android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto Ld
            android.graphics.drawable.Drawable r0 = r1.f2628h0
            if (r2 != r0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            return r2
    }
}
