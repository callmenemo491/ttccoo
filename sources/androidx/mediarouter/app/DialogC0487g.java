package androidx.mediarouter.app;

/* renamed from: androidx.mediarouter.app.g */
/* loaded from: classes.dex */
public class DialogC0487g extends androidx.appcompat.app.DialogC0204b {

    /* renamed from: j1 */
    public static final boolean f2668j1 = false;

    /* renamed from: k1 */
    public static final int f2669k1 = 0;

    /* renamed from: A0 */
    public java.util.List<p085f1.C1974o.i> f2670A0;

    /* renamed from: B0 */
    public java.util.Set<p085f1.C1974o.i> f2671B0;

    /* renamed from: C0 */
    public java.util.Set<p085f1.C1974o.i> f2672C0;

    /* renamed from: D0 */
    public java.util.Set<p085f1.C1974o.i> f2673D0;

    /* renamed from: E0 */
    public android.widget.SeekBar f2674E0;

    /* renamed from: F0 */
    public androidx.mediarouter.app.DialogC0487g.l f2675F0;

    /* renamed from: G0 */
    public p085f1.C1974o.i f2676G0;

    /* renamed from: H0 */
    public int f2677H0;

    /* renamed from: I0 */
    public int f2678I0;

    /* renamed from: J0 */
    public int f2679J0;

    /* renamed from: K0 */
    public final int f2680K0;

    /* renamed from: L0 */
    public java.util.Map<p085f1.C1974o.i, android.widget.SeekBar> f2681L0;

    /* renamed from: M0 */
    public android.support.v4.media.session.MediaControllerCompat f2682M0;

    /* renamed from: N0 */
    public androidx.mediarouter.app.DialogC0487g.j f2683N0;

    /* renamed from: O0 */
    public android.support.v4.media.session.PlaybackStateCompat f2684O0;

    /* renamed from: P0 */
    public android.support.v4.media.MediaDescriptionCompat f2685P0;

    /* renamed from: Q0 */
    public androidx.mediarouter.app.DialogC0487g.i f2686Q0;

    /* renamed from: R0 */
    public android.graphics.Bitmap f2687R0;

    /* renamed from: S0 */
    public android.net.Uri f2688S0;

    /* renamed from: T0 */
    public boolean f2689T0;

    /* renamed from: U0 */
    public android.graphics.Bitmap f2690U0;

    /* renamed from: V0 */
    public int f2691V0;

    /* renamed from: W0 */
    public boolean f2692W0;

    /* renamed from: X0 */
    public boolean f2693X0;

    /* renamed from: Y0 */
    public boolean f2694Y0;

    /* renamed from: Z0 */
    public boolean f2695Z0;

    /* renamed from: a1 */
    public boolean f2696a1;

    /* renamed from: b0 */
    public final p085f1.C1974o f2697b0;

    /* renamed from: b1 */
    public int f2698b1;

    /* renamed from: c0 */
    public final androidx.mediarouter.app.DialogC0487g.k f2699c0;

    /* renamed from: c1 */
    public int f2700c1;

    /* renamed from: d0 */
    public final p085f1.C1974o.i f2701d0;

    /* renamed from: d1 */
    public int f2702d1;

    /* renamed from: e0 */
    public android.content.Context f2703e0;

    /* renamed from: e1 */
    public android.view.animation.Interpolator f2704e1;

    /* renamed from: f0 */
    public boolean f2705f0;

    /* renamed from: f1 */
    public android.view.animation.Interpolator f2706f1;

    /* renamed from: g0 */
    public boolean f2707g0;

    /* renamed from: g1 */
    public android.view.animation.Interpolator f2708g1;

    /* renamed from: h0 */
    public int f2709h0;

    /* renamed from: h1 */
    public final android.view.accessibility.AccessibilityManager f2710h1;

    /* renamed from: i0 */
    public android.widget.Button f2711i0;

    /* renamed from: i1 */
    public java.lang.Runnable f2712i1;

    /* renamed from: j0 */
    public android.widget.Button f2713j0;

    /* renamed from: k0 */
    public android.widget.ImageButton f2714k0;

    /* renamed from: l0 */
    public androidx.mediarouter.app.MediaRouteExpandCollapseButton f2715l0;

    /* renamed from: m0 */
    public android.widget.FrameLayout f2716m0;

    /* renamed from: n0 */
    public android.widget.LinearLayout f2717n0;

    /* renamed from: o0 */
    public android.widget.FrameLayout f2718o0;

    /* renamed from: p0 */
    public android.widget.ImageView f2719p0;

    /* renamed from: q0 */
    public android.widget.TextView f2720q0;

    /* renamed from: r0 */
    public android.widget.TextView f2721r0;

    /* renamed from: s0 */
    public android.widget.TextView f2722s0;

    /* renamed from: t0 */
    public boolean f2723t0;

    /* renamed from: u0 */
    public android.widget.LinearLayout f2724u0;

    /* renamed from: v0 */
    public android.widget.RelativeLayout f2725v0;

    /* renamed from: w0 */
    public android.widget.LinearLayout f2726w0;

    /* renamed from: x0 */
    public android.view.View f2727x0;

    /* renamed from: y0 */
    public androidx.mediarouter.app.OverlayListView f2728y0;

    /* renamed from: z0 */
    public androidx.mediarouter.app.DialogC0487g.m f2729z0;

    /* renamed from: androidx.mediarouter.app.g$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.mediarouter.app.DialogC0487g f2730Y;

        public a(androidx.mediarouter.app.DialogC0487g r1) {
                r0 = this;
                r0.f2730Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.mediarouter.app.g r0 = r3.f2730Y
                r1 = 1
                r0.m1501g(r1)
                androidx.mediarouter.app.OverlayListView r1 = r0.f2728y0
                r1.requestLayout()
                androidx.mediarouter.app.OverlayListView r1 = r0.f2728y0
                android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                androidx.mediarouter.app.e r2 = new androidx.mediarouter.app.e
                r2.<init>(r0)
                r1.addOnGlobalLayoutListener(r2)
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.g$b */
    public class b implements android.view.View.OnClickListener {

        /* renamed from: Y */
        public final /* synthetic */ androidx.mediarouter.app.DialogC0487g f2731Y;

        public b(androidx.mediarouter.app.DialogC0487g r1) {
                r0 = this;
                r0.f2731Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                androidx.mediarouter.app.g r1 = r0.f2731Y
                r1.dismiss()
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.g$c */
    public class c implements android.view.View.OnClickListener {
        public c(androidx.mediarouter.app.DialogC0487g r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.g$d */
    public class d implements android.view.View.OnClickListener {

        /* renamed from: Y */
        public final /* synthetic */ androidx.mediarouter.app.DialogC0487g f2732Y;

        public d(androidx.mediarouter.app.DialogC0487g r1) {
                r0 = this;
                r0.f2732Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                androidx.mediarouter.app.g r2 = r1.f2732Y
                android.support.v4.media.session.MediaControllerCompat r2 = r2.f2682M0
                if (r2 == 0) goto L31
                android.support.v4.media.session.MediaControllerCompat$b r2 = r2.f505a
                android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 r2 = (android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21) r2
                android.media.session.MediaController r2 = r2.f507a
                android.app.PendingIntent r2 = r2.getSessionActivity()
                if (r2 == 0) goto L31
                r2.send()     // Catch: android.app.PendingIntent.CanceledException -> L1b
                androidx.mediarouter.app.g r0 = r1.f2732Y     // Catch: android.app.PendingIntent.CanceledException -> L1b
                r0.dismiss()     // Catch: android.app.PendingIntent.CanceledException -> L1b
                goto L31
            L1b:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                java.lang.String r2 = " was not sent, it had been canceled."
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                java.lang.String r0 = "MediaRouteCtrlDialog"
                android.util.Log.e(r0, r2)
            L31:
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.g$e */
    public class e implements android.view.View.OnClickListener {

        /* renamed from: Y */
        public final /* synthetic */ androidx.mediarouter.app.DialogC0487g f2733Y;

        public e(androidx.mediarouter.app.DialogC0487g r1) {
                r0 = this;
                r0.f2733Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                androidx.mediarouter.app.g r3 = r2.f2733Y
                boolean r0 = r3.f2694Y0
                r1 = 1
                r0 = r0 ^ r1
                r3.f2694Y0 = r0
                if (r0 == 0) goto L10
                androidx.mediarouter.app.OverlayListView r3 = r3.f2728y0
                r0 = 0
                r3.setVisibility(r0)
            L10:
                androidx.mediarouter.app.g r3 = r2.f2733Y
                boolean r0 = r3.f2694Y0
                if (r0 == 0) goto L19
                android.view.animation.Interpolator r0 = r3.f2706f1
                goto L1b
            L19:
                android.view.animation.Interpolator r0 = r3.f2708g1
            L1b:
                r3.f2704e1 = r0
                r3.m1512x(r1)
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.g$f */
    public class f implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: Y */
        public final /* synthetic */ boolean f2734Y;

        /* renamed from: Z */
        public final /* synthetic */ androidx.mediarouter.app.DialogC0487g f2735Z;

        public f(androidx.mediarouter.app.DialogC0487g r1, boolean r2) {
                r0 = this;
                r0.f2735Z = r1
                r0.f2734Y = r2
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
                r16 = this;
                r0 = r16
                androidx.mediarouter.app.g r1 = r0.f2735Z
                android.widget.FrameLayout r1 = r1.f2718o0
                android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                r1.removeGlobalOnLayoutListener(r0)
                androidx.mediarouter.app.g r1 = r0.f2735Z
                boolean r2 = r1.f2695Z0
                r3 = 1
                if (r2 == 0) goto L18
                r1.f2696a1 = r3
                goto L292
            L18:
                boolean r2 = r0.f2734Y
                android.widget.LinearLayout r4 = r1.f2724u0
                int r4 = androidx.mediarouter.app.DialogC0487g.m1496k(r4)
                android.widget.LinearLayout r5 = r1.f2724u0
                r6 = -1
                androidx.mediarouter.app.DialogC0487g.m1498s(r5, r6)
                boolean r5 = r1.m1500f()
                r1.m1513y(r5)
                android.view.Window r5 = r1.getWindow()
                android.view.View r5 = r5.getDecorView()
                android.view.Window r6 = r1.getWindow()
                android.view.WindowManager$LayoutParams r6 = r6.getAttributes()
                int r6 = r6.width
                r7 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
                r7 = 0
                r5.measure(r6, r7)
                android.widget.LinearLayout r6 = r1.f2724u0
                androidx.mediarouter.app.DialogC0487g.m1498s(r6, r4)
                android.widget.ImageView r4 = r1.f2719p0
                android.graphics.drawable.Drawable r4 = r4.getDrawable()
                boolean r4 = r4 instanceof android.graphics.drawable.BitmapDrawable
                if (r4 == 0) goto L87
                android.widget.ImageView r4 = r1.f2719p0
                android.graphics.drawable.Drawable r4 = r4.getDrawable()
                android.graphics.drawable.BitmapDrawable r4 = (android.graphics.drawable.BitmapDrawable) r4
                android.graphics.Bitmap r4 = r4.getBitmap()
                if (r4 == 0) goto L87
                int r6 = r4.getWidth()
                int r8 = r4.getHeight()
                int r6 = r1.m1503j(r6, r8)
                android.widget.ImageView r8 = r1.f2719p0
                int r9 = r4.getWidth()
                int r4 = r4.getHeight()
                if (r9 < r4) goto L81
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.FIT_XY
                goto L83
            L81:
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.FIT_CENTER
            L83:
                r8.setScaleType(r4)
                goto L88
            L87:
                r6 = 0
            L88:
                boolean r4 = r1.m1500f()
                int r4 = r1.m1504m(r4)
                java.util.List<f1.o$i> r8 = r1.f2670A0
                int r8 = r8.size()
                f1.o$i r9 = r1.f2701d0
                boolean r9 = r9.m5067f()
                if (r9 == 0) goto Lad
                int r9 = r1.f2678I0
                f1.o$i r10 = r1.f2701d0
                java.util.List r10 = r10.m5064c()
                int r10 = r10.size()
                int r10 = r10 * r9
                goto Lae
            Lad:
                r10 = 0
            Lae:
                if (r8 <= 0) goto Lb3
                int r8 = r1.f2680K0
                int r10 = r10 + r8
            Lb3:
                int r8 = r1.f2679J0
                int r8 = java.lang.Math.min(r10, r8)
                boolean r9 = r1.f2694Y0
                if (r9 == 0) goto Lbe
                goto Lbf
            Lbe:
                r8 = 0
            Lbf:
                int r9 = java.lang.Math.max(r6, r8)
                int r9 = r9 + r4
                android.graphics.Rect r10 = new android.graphics.Rect
                r10.<init>()
                r5.getWindowVisibleDisplayFrame(r10)
                android.widget.LinearLayout r5 = r1.f2717n0
                int r5 = r5.getMeasuredHeight()
                android.widget.FrameLayout r11 = r1.f2718o0
                int r11 = r11.getMeasuredHeight()
                int r5 = r5 - r11
                int r11 = r10.height()
                int r11 = r11 - r5
                r5 = 8
                if (r6 <= 0) goto Lef
                if (r9 > r11) goto Lef
                android.widget.ImageView r4 = r1.f2719p0
                r4.setVisibility(r7)
                android.widget.ImageView r4 = r1.f2719p0
                androidx.mediarouter.app.DialogC0487g.m1498s(r4, r6)
                goto L10c
            Lef:
                androidx.mediarouter.app.OverlayListView r6 = r1.f2728y0
                int r6 = androidx.mediarouter.app.DialogC0487g.m1496k(r6)
                android.widget.LinearLayout r9 = r1.f2724u0
                int r9 = r9.getMeasuredHeight()
                int r9 = r9 + r6
                android.widget.FrameLayout r6 = r1.f2718o0
                int r6 = r6.getMeasuredHeight()
                if (r9 < r6) goto L109
                android.widget.ImageView r6 = r1.f2719p0
                r6.setVisibility(r5)
            L109:
                int r9 = r8 + r4
                r6 = 0
            L10c:
                boolean r4 = r1.m1500f()
                if (r4 == 0) goto L11a
                if (r9 > r11) goto L11a
                android.widget.RelativeLayout r4 = r1.f2725v0
                r4.setVisibility(r7)
                goto L11f
            L11a:
                android.widget.RelativeLayout r4 = r1.f2725v0
                r4.setVisibility(r5)
            L11f:
                android.widget.RelativeLayout r4 = r1.f2725v0
                int r4 = r4.getVisibility()
                if (r4 != 0) goto L129
                r4 = 1
                goto L12a
            L129:
                r4 = 0
            L12a:
                r1.m1513y(r4)
                android.widget.RelativeLayout r4 = r1.f2725v0
                int r4 = r4.getVisibility()
                if (r4 != 0) goto L137
                r4 = 1
                goto L138
            L137:
                r4 = 0
            L138:
                int r4 = r1.m1504m(r4)
                int r5 = java.lang.Math.max(r6, r8)
                int r5 = r5 + r4
                if (r5 <= r11) goto L146
                int r5 = r5 - r11
                int r8 = r8 - r5
                goto L147
            L146:
                r11 = r5
            L147:
                android.widget.LinearLayout r5 = r1.f2724u0
                r5.clearAnimation()
                androidx.mediarouter.app.OverlayListView r5 = r1.f2728y0
                r5.clearAnimation()
                android.widget.FrameLayout r5 = r1.f2718o0
                r5.clearAnimation()
                android.widget.LinearLayout r5 = r1.f2724u0
                if (r2 == 0) goto L168
                r1.m1499e(r5, r4)
                androidx.mediarouter.app.OverlayListView r4 = r1.f2728y0
                r1.m1499e(r4, r8)
                android.widget.FrameLayout r4 = r1.f2718o0
                r1.m1499e(r4, r11)
                goto L175
            L168:
                androidx.mediarouter.app.DialogC0487g.m1498s(r5, r4)
                androidx.mediarouter.app.OverlayListView r4 = r1.f2728y0
                androidx.mediarouter.app.DialogC0487g.m1498s(r4, r8)
                android.widget.FrameLayout r4 = r1.f2718o0
                androidx.mediarouter.app.DialogC0487g.m1498s(r4, r11)
            L175:
                android.widget.FrameLayout r4 = r1.f2716m0
                int r5 = r10.height()
                androidx.mediarouter.app.DialogC0487g.m1498s(r4, r5)
                f1.o$i r4 = r1.f2701d0
                java.util.List r4 = r4.m5064c()
                boolean r5 = r4.isEmpty()
                if (r5 == 0) goto L190
                java.util.List<f1.o$i> r2 = r1.f2670A0
                r2.clear()
                goto L1a2
            L190:
                java.util.List<f1.o$i> r5 = r1.f2670A0
                java.util.HashSet r6 = new java.util.HashSet
                r6.<init>(r5)
                java.util.HashSet r5 = new java.util.HashSet
                r5.<init>(r4)
                boolean r5 = r6.equals(r5)
                if (r5 == 0) goto L1a9
            L1a2:
                androidx.mediarouter.app.g$m r1 = r1.f2729z0
                r1.notifyDataSetChanged()
                goto L292
            L1a9:
                if (r2 == 0) goto L1e5
                androidx.mediarouter.app.OverlayListView r6 = r1.f2728y0
                androidx.mediarouter.app.g$m r8 = r1.f2729z0
                java.util.HashMap r9 = new java.util.HashMap
                r9.<init>()
                int r10 = r6.getFirstVisiblePosition()
                r11 = 0
            L1b9:
                int r12 = r6.getChildCount()
                if (r11 >= r12) goto L1e6
                int r12 = r10 + r11
                java.lang.Object r12 = r8.getItem(r12)
                android.view.View r13 = r6.getChildAt(r11)
                android.graphics.Rect r14 = new android.graphics.Rect
                int r15 = r13.getLeft()
                int r5 = r13.getTop()
                int r3 = r13.getRight()
                int r13 = r13.getBottom()
                r14.<init>(r15, r5, r3, r13)
                r9.put(r12, r14)
                int r11 = r11 + 1
                r3 = 1
                goto L1b9
            L1e5:
                r9 = 0
            L1e6:
                if (r2 == 0) goto L22e
                android.content.Context r3 = r1.f2703e0
                androidx.mediarouter.app.OverlayListView r5 = r1.f2728y0
                androidx.mediarouter.app.g$m r6 = r1.f2729z0
                java.util.HashMap r8 = new java.util.HashMap
                r8.<init>()
                int r10 = r5.getFirstVisiblePosition()
                r11 = 0
            L1f8:
                int r12 = r5.getChildCount()
                if (r11 >= r12) goto L22f
                int r12 = r10 + r11
                java.lang.Object r12 = r6.getItem(r12)
                android.view.View r13 = r5.getChildAt(r11)
                int r14 = r13.getWidth()
                int r15 = r13.getHeight()
                android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
                android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r14, r15, r7)
                android.graphics.Canvas r14 = new android.graphics.Canvas
                r14.<init>(r7)
                r13.draw(r14)
                android.graphics.drawable.BitmapDrawable r13 = new android.graphics.drawable.BitmapDrawable
                android.content.res.Resources r14 = r3.getResources()
                r13.<init>(r14, r7)
                r8.put(r12, r13)
                int r11 = r11 + 1
                r7 = 0
                goto L1f8
            L22e:
                r8 = 0
            L22f:
                java.util.List<f1.o$i> r3 = r1.f2670A0
                java.util.HashSet r5 = new java.util.HashSet
                r5.<init>(r4)
                r5.removeAll(r3)
                r1.f2671B0 = r5
                java.util.List<f1.o$i> r3 = r1.f2670A0
                java.util.HashSet r5 = new java.util.HashSet
                r5.<init>(r3)
                r5.removeAll(r4)
                r1.f2672C0 = r5
                java.util.List<f1.o$i> r3 = r1.f2670A0
                java.util.Set<f1.o$i> r4 = r1.f2671B0
                r5 = 0
                r3.addAll(r5, r4)
                java.util.List<f1.o$i> r3 = r1.f2670A0
                java.util.Set<f1.o$i> r4 = r1.f2672C0
                r3.removeAll(r4)
                androidx.mediarouter.app.g$m r3 = r1.f2729z0
                r3.notifyDataSetChanged()
                if (r2 == 0) goto L28d
                boolean r2 = r1.f2694Y0
                if (r2 == 0) goto L28d
                java.util.Set<f1.o$i> r2 = r1.f2671B0
                int r2 = r2.size()
                java.util.Set<f1.o$i> r3 = r1.f2672C0
                int r3 = r3.size()
                int r3 = r3 + r2
                if (r3 <= 0) goto L28d
                androidx.mediarouter.app.OverlayListView r2 = r1.f2728y0
                r3 = 0
                r2.setEnabled(r3)
                androidx.mediarouter.app.OverlayListView r2 = r1.f2728y0
                r2.requestLayout()
                r2 = 1
                r1.f2695Z0 = r2
                androidx.mediarouter.app.OverlayListView r2 = r1.f2728y0
                android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
                androidx.mediarouter.app.h r3 = new androidx.mediarouter.app.h
                r3.<init>(r1, r9, r8)
                r2.addOnGlobalLayoutListener(r3)
                goto L292
            L28d:
                r2 = 0
                r1.f2671B0 = r2
                r1.f2672C0 = r2
            L292:
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.g$g */
    public class g extends android.view.animation.Animation {

        /* renamed from: Y */
        public final /* synthetic */ int f2736Y;

        /* renamed from: Z */
        public final /* synthetic */ int f2737Z;

        /* renamed from: a0 */
        public final /* synthetic */ android.view.View f2738a0;

        public g(androidx.mediarouter.app.DialogC0487g r1, int r2, int r3, android.view.View r4) {
                r0 = this;
                r0.f2736Y = r2
                r0.f2737Z = r3
                r0.f2738a0 = r4
                r0.<init>()
                return
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float r2, android.view.animation.Transformation r3) {
                r1 = this;
                int r3 = r1.f2736Y
                int r0 = r1.f2737Z
                int r0 = r3 - r0
                float r0 = (float) r0
                float r0 = r0 * r2
                int r2 = (int) r0
                int r3 = r3 - r2
                android.view.View r2 = r1.f2738a0
                androidx.mediarouter.app.DialogC0487g.m1498s(r2, r3)
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.g$h */
    public final class h implements android.view.View.OnClickListener {

        /* renamed from: Y */
        public final /* synthetic */ androidx.mediarouter.app.DialogC0487g f2739Y;

        public h(androidx.mediarouter.app.DialogC0487g r1) {
                r0 = this;
                r0.f2739Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r5) {
                r4 = this;
                int r5 = r5.getId()
                r0 = 1
                r1 = 16908313(0x1020019, float:2.38773E-38)
                if (r5 == r1) goto Lc1
                r2 = 16908314(0x102001a, float:2.3877302E-38)
                if (r5 != r2) goto L11
                goto Lc1
            L11:
                r1 = 2131362390(0x7f0a0256, float:1.834456E38)
                if (r5 != r1) goto Lbb
                androidx.mediarouter.app.g r5 = r4.f2739Y
                android.support.v4.media.session.MediaControllerCompat r1 = r5.f2682M0
                if (r1 == 0) goto Lda
                android.support.v4.media.session.PlaybackStateCompat r1 = r5.f2684O0
                if (r1 == 0) goto Lda
                int r1 = r1.f564Y
                r2 = 3
                r3 = 0
                if (r1 != r2) goto L27
                goto L28
            L27:
                r0 = 0
            L28:
                if (r0 == 0) goto L43
                boolean r5 = r5.m1505p()
                if (r5 == 0) goto L43
                androidx.mediarouter.app.g r5 = r4.f2739Y
                android.support.v4.media.session.MediaControllerCompat r5 = r5.f2682M0
                android.support.v4.media.session.MediaControllerCompat$e r5 = r5.m261c()
                android.support.v4.media.session.MediaControllerCompat$f r5 = (android.support.v4.media.session.MediaControllerCompat.C0153f) r5
                android.media.session.MediaController$TransportControls r5 = r5.f520a
                r5.pause()
                r3 = 2131951893(0x7f130115, float:1.9540213E38)
                goto L7c
            L43:
                if (r0 == 0) goto L60
                androidx.mediarouter.app.g r5 = r4.f2739Y
                boolean r5 = r5.m1507r()
                if (r5 == 0) goto L60
                androidx.mediarouter.app.g r5 = r4.f2739Y
                android.support.v4.media.session.MediaControllerCompat r5 = r5.f2682M0
                android.support.v4.media.session.MediaControllerCompat$e r5 = r5.m261c()
                android.support.v4.media.session.MediaControllerCompat$f r5 = (android.support.v4.media.session.MediaControllerCompat.C0153f) r5
                android.media.session.MediaController$TransportControls r5 = r5.f520a
                r5.stop()
                r3 = 2131951895(0x7f130117, float:1.9540217E38)
                goto L7c
            L60:
                if (r0 != 0) goto L7c
                androidx.mediarouter.app.g r5 = r4.f2739Y
                boolean r5 = r5.m1506q()
                if (r5 == 0) goto L7c
                androidx.mediarouter.app.g r5 = r4.f2739Y
                android.support.v4.media.session.MediaControllerCompat r5 = r5.f2682M0
                android.support.v4.media.session.MediaControllerCompat$e r5 = r5.m261c()
                android.support.v4.media.session.MediaControllerCompat$f r5 = (android.support.v4.media.session.MediaControllerCompat.C0153f) r5
                android.media.session.MediaController$TransportControls r5 = r5.f520a
                r5.play()
                r3 = 2131951894(0x7f130116, float:1.9540215E38)
            L7c:
                androidx.mediarouter.app.g r5 = r4.f2739Y
                android.view.accessibility.AccessibilityManager r5 = r5.f2710h1
                if (r5 == 0) goto Lda
                boolean r5 = r5.isEnabled()
                if (r5 == 0) goto Lda
                if (r3 == 0) goto Lda
                r5 = 16384(0x4000, float:2.2959E-41)
                android.view.accessibility.AccessibilityEvent r5 = android.view.accessibility.AccessibilityEvent.obtain(r5)
                androidx.mediarouter.app.g r0 = r4.f2739Y
                android.content.Context r0 = r0.f2703e0
                java.lang.String r0 = r0.getPackageName()
                r5.setPackageName(r0)
                java.lang.Class<androidx.mediarouter.app.g$h> r0 = androidx.mediarouter.app.DialogC0487g.h.class
                java.lang.String r0 = r0.getName()
                r5.setClassName(r0)
                java.util.List r0 = r5.getText()
                androidx.mediarouter.app.g r1 = r4.f2739Y
                android.content.Context r1 = r1.f2703e0
                java.lang.String r1 = r1.getString(r3)
                r0.add(r1)
                androidx.mediarouter.app.g r0 = r4.f2739Y
                android.view.accessibility.AccessibilityManager r0 = r0.f2710h1
                r0.sendAccessibilityEvent(r5)
                goto Lda
            Lbb:
                r0 = 2131362388(0x7f0a0254, float:1.8344555E38)
                if (r5 != r0) goto Lda
                goto Ld5
            Lc1:
                androidx.mediarouter.app.g r2 = r4.f2739Y
                f1.o$i r2 = r2.f2701d0
                boolean r2 = r2.m5069h()
                if (r2 == 0) goto Ld5
                androidx.mediarouter.app.g r2 = r4.f2739Y
                f1.o r2 = r2.f2697b0
                if (r5 != r1) goto Ld2
                r0 = 2
            Ld2:
                r2.m5035k(r0)
            Ld5:
                androidx.mediarouter.app.g r5 = r4.f2739Y
                r5.dismiss()
            Lda:
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.g$i */
    public class i extends android.os.AsyncTask<java.lang.Void, java.lang.Void, android.graphics.Bitmap> {

        /* renamed from: a */
        public final android.graphics.Bitmap f2740a;

        /* renamed from: b */
        public final android.net.Uri f2741b;

        /* renamed from: c */
        public int f2742c;

        /* renamed from: d */
        public long f2743d;

        /* renamed from: e */
        public final /* synthetic */ androidx.mediarouter.app.DialogC0487g f2744e;

        public i(androidx.mediarouter.app.DialogC0487g r4) {
                r3 = this;
                r3.f2744e = r4
                r3.<init>()
                android.support.v4.media.MediaDescriptionCompat r0 = r4.f2685P0
                r1 = 0
                if (r0 != 0) goto Lc
                r0 = r1
                goto Le
            Lc:
                android.graphics.Bitmap r0 = r0.f489c0
            Le:
                boolean r2 = androidx.mediarouter.app.DialogC0487g.m1497o(r0)
                if (r2 == 0) goto L1c
                java.lang.String r0 = "MediaRouteCtrlDialog"
                java.lang.String r2 = "Can't fetch the given art bitmap because it's already recycled."
                android.util.Log.w(r0, r2)
                r0 = r1
            L1c:
                r3.f2740a = r0
                android.support.v4.media.MediaDescriptionCompat r4 = r4.f2685P0
                if (r4 != 0) goto L23
                goto L25
            L23:
                android.net.Uri r1 = r4.f490d0
            L25:
                r3.f2741b = r1
                return
        }

        /* renamed from: a */
        public final java.io.InputStream m1514a(android.net.Uri r3) {
                r2 = this;
                java.lang.String r0 = r3.getScheme()
                java.lang.String r0 = r0.toLowerCase()
                java.lang.String r1 = "android.resource"
                boolean r1 = r1.equals(r0)
                if (r1 != 0) goto L3b
                java.lang.String r1 = "content"
                boolean r1 = r1.equals(r0)
                if (r1 != 0) goto L3b
                java.lang.String r1 = "file"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L21
                goto L3b
            L21:
                java.net.URL r0 = new java.net.URL
                java.lang.String r3 = r3.toString()
                r0.<init>(r3)
                java.net.URLConnection r3 = r0.openConnection()
                int r0 = androidx.mediarouter.app.DialogC0487g.f2669k1
                r3.setConnectTimeout(r0)
                r3.setReadTimeout(r0)
                java.io.InputStream r3 = r3.getInputStream()
                goto L47
            L3b:
                androidx.mediarouter.app.g r0 = r2.f2744e
                android.content.Context r0 = r0.f2703e0
                android.content.ContentResolver r0 = r0.getContentResolver()
                java.io.InputStream r3 = r0.openInputStream(r3)
            L47:
                if (r3 != 0) goto L4b
                r3 = 0
                goto L51
            L4b:
                java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
                r0.<init>(r3)
                r3 = r0
            L51:
                return r3
        }

        @Override // android.os.AsyncTask
        public android.graphics.Bitmap doInBackground(java.lang.Void[] r10) {
                r9 = this;
                java.lang.Void[] r10 = (java.lang.Void[]) r10
                java.lang.String r10 = "Unable to open: "
                android.graphics.Bitmap r0 = r9.f2740a
                r1 = 0
                r2 = 1
                java.lang.String r3 = "MediaRouteCtrlDialog"
                r4 = 0
                if (r0 == 0) goto Lf
                goto Lc0
            Lf:
                android.net.Uri r0 = r9.f2741b
                if (r0 == 0) goto Lbf
                java.io.InputStream r0 = r9.m1514a(r0)     // Catch: java.lang.Throwable -> L9b java.io.IOException -> L9d
                if (r0 != 0) goto L34
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                r5.<init>()     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                r5.append(r10)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                android.net.Uri r6 = r9.f2741b     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                r5.append(r6)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                android.util.Log.w(r3, r5)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                if (r0 == 0) goto L10c
            L2f:
                r0.close()     // Catch: java.io.IOException -> L10c
                goto L10c
            L34:
                android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                r5.<init>()     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                r5.inJustDecodeBounds = r2     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                android.graphics.BitmapFactory.decodeStream(r0, r4, r5)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                int r6 = r5.outWidth     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                if (r6 == 0) goto L2f
                int r6 = r5.outHeight     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                if (r6 != 0) goto L47
                goto L2f
            L47:
                r0.reset()     // Catch: java.io.IOException -> L4b java.lang.Throwable -> L96
                goto L6d
            L4b:
                r0.close()     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                android.net.Uri r6 = r9.f2741b     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                java.io.InputStream r0 = r9.m1514a(r6)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                if (r0 != 0) goto L6d
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                r5.<init>()     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                r5.append(r10)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                android.net.Uri r6 = r9.f2741b     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                r5.append(r6)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                android.util.Log.w(r3, r5)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                if (r0 == 0) goto L10c
                goto L2f
            L6d:
                r5.inJustDecodeBounds = r1     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                androidx.mediarouter.app.g r6 = r9.f2744e     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                int r7 = r5.outWidth     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                int r8 = r5.outHeight     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                int r6 = r6.m1503j(r7, r8)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                int r7 = r5.outHeight     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                int r7 = r7 / r6
                int r6 = java.lang.Integer.highestOneBit(r7)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                int r6 = java.lang.Math.max(r2, r6)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                r5.inSampleSize = r6     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                boolean r6 = r9.isCancelled()     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                if (r6 == 0) goto L8d
                goto L2f
            L8d:
                android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeStream(r0, r4, r5)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L99
                r0.close()     // Catch: java.io.IOException -> L94
            L94:
                r0 = r10
                goto Lc0
            L96:
                r10 = move-exception
                r4 = r0
                goto Lb9
            L99:
                r5 = move-exception
                goto L9f
            L9b:
                r10 = move-exception
                goto Lb9
            L9d:
                r5 = move-exception
                r0 = r4
            L9f:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L96
                r6.<init>()     // Catch: java.lang.Throwable -> L96
                r6.append(r10)     // Catch: java.lang.Throwable -> L96
                android.net.Uri r10 = r9.f2741b     // Catch: java.lang.Throwable -> L96
                r6.append(r10)     // Catch: java.lang.Throwable -> L96
                java.lang.String r10 = r6.toString()     // Catch: java.lang.Throwable -> L96
                android.util.Log.w(r3, r10, r5)     // Catch: java.lang.Throwable -> L96
                if (r0 == 0) goto Lbf
                r0.close()     // Catch: java.io.IOException -> Lbf
                goto Lbf
            Lb9:
                if (r4 == 0) goto Lbe
                r4.close()     // Catch: java.io.IOException -> Lbe
            Lbe:
                throw r10
            Lbf:
                r0 = r4
            Lc0:
                boolean r10 = androidx.mediarouter.app.DialogC0487g.m1497o(r0)
                if (r10 == 0) goto Ldb
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r1 = "Can't use recycled bitmap: "
                r10.append(r1)
                r10.append(r0)
                java.lang.String r10 = r10.toString()
                android.util.Log.w(r3, r10)
                goto L10c
            Ldb:
                if (r0 == 0) goto L10b
                int r10 = r0.getWidth()
                int r3 = r0.getHeight()
                if (r10 >= r3) goto L10b
                h1.b$b r10 = new h1.b$b
                r10.<init>(r0)
                r10.f10894c = r2
                h1.b r10 = r10.m6184a()
                java.util.List r2 = r10.m6182a()
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto Lfd
                goto L109
            Lfd:
                java.util.List r10 = r10.m6182a()
                java.lang.Object r10 = r10.get(r1)
                h1.b$d r10 = (p118h1.C2437b.d) r10
                int r1 = r10.f10901d
            L109:
                r9.f2742c = r1
            L10b:
                r4 = r0
            L10c:
                return r4
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(android.graphics.Bitmap r7) {
                r6 = this;
                android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
                androidx.mediarouter.app.g r0 = r6.f2744e
                r1 = 0
                r0.f2686Q0 = r1
                android.graphics.Bitmap r0 = r0.f2687R0
                android.graphics.Bitmap r1 = r6.f2740a
                boolean r0 = java.util.Objects.equals(r0, r1)
                if (r0 == 0) goto L1d
                androidx.mediarouter.app.g r0 = r6.f2744e
                android.net.Uri r0 = r0.f2688S0
                android.net.Uri r1 = r6.f2741b
                boolean r0 = java.util.Objects.equals(r0, r1)
                if (r0 != 0) goto L44
            L1d:
                androidx.mediarouter.app.g r0 = r6.f2744e
                android.graphics.Bitmap r1 = r6.f2740a
                r0.f2687R0 = r1
                r0.f2690U0 = r7
                android.net.Uri r7 = r6.f2741b
                r0.f2688S0 = r7
                int r7 = r6.f2742c
                r0.f2691V0 = r7
                r7 = 1
                r0.f2689T0 = r7
                long r0 = android.os.SystemClock.uptimeMillis()
                long r2 = r6.f2743d
                long r0 = r0 - r2
                androidx.mediarouter.app.g r2 = r6.f2744e
                r3 = 120(0x78, double:5.93E-322)
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 <= 0) goto L40
                goto L41
            L40:
                r7 = 0
            L41:
                r2.m1509u(r7)
            L44:
                return
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
                r3 = this;
                long r0 = android.os.SystemClock.uptimeMillis()
                r3.f2743d = r0
                androidx.mediarouter.app.g r0 = r3.f2744e
                r1 = 0
                r0.f2689T0 = r1
                r2 = 0
                r0.f2690U0 = r2
                r0.f2691V0 = r1
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.g$j */
    public final class j extends android.support.v4.media.session.MediaControllerCompat.AbstractC0148a {

        /* renamed from: d */
        public final /* synthetic */ androidx.mediarouter.app.DialogC0487g f2745d;

        public j(androidx.mediarouter.app.DialogC0487g r1) {
                r0 = this;
                r0.f2745d = r1
                r0.<init>()
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0148a
        /* renamed from: a */
        public void mo272a(android.support.v4.media.MediaMetadataCompat r2) {
                r1 = this;
                androidx.mediarouter.app.g r0 = r1.f2745d
                if (r2 != 0) goto L6
                r2 = 0
                goto La
            L6:
                android.support.v4.media.MediaDescriptionCompat r2 = r2.m230d()
            La:
                r0.f2685P0 = r2
                androidx.mediarouter.app.g r2 = r1.f2745d
                r2.m1510v()
                androidx.mediarouter.app.g r2 = r1.f2745d
                r0 = 0
                r2.m1509u(r0)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0148a
        /* renamed from: b */
        public void mo273b(android.support.v4.media.session.PlaybackStateCompat r2) {
                r1 = this;
                androidx.mediarouter.app.g r0 = r1.f2745d
                r0.f2684O0 = r2
                r2 = 0
                r0.m1509u(r2)
                return
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0148a
        /* renamed from: d */
        public void mo275d() {
                r2 = this;
                androidx.mediarouter.app.g r0 = r2.f2745d
                android.support.v4.media.session.MediaControllerCompat r1 = r0.f2682M0
                if (r1 == 0) goto L10
                androidx.mediarouter.app.g$j r0 = r0.f2683N0
                r1.m263e(r0)
                androidx.mediarouter.app.g r0 = r2.f2745d
                r1 = 0
                r0.f2682M0 = r1
            L10:
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.g$k */
    public final class k extends p085f1.C1974o.b {

        /* renamed from: a */
        public final /* synthetic */ androidx.mediarouter.app.DialogC0487g f2746a;

        public k(androidx.mediarouter.app.DialogC0487g r1) {
                r0 = this;
                r0.f2746a = r1
                r0.<init>()
                return
        }

        @Override // p085f1.C1974o.b
        /* renamed from: e */
        public void mo1489e(p085f1.C1974o r1, p085f1.C1974o.i r2) {
                r0 = this;
                androidx.mediarouter.app.g r1 = r0.f2746a
                r2 = 1
                r1.m1509u(r2)
                return
        }

        @Override // p085f1.C1974o.b
        /* renamed from: i */
        public void mo1492i(p085f1.C1974o r1, p085f1.C1974o.i r2) {
                r0 = this;
                androidx.mediarouter.app.g r1 = r0.f2746a
                r2 = 0
                r1.m1509u(r2)
                return
        }

        @Override // p085f1.C1974o.b
        /* renamed from: k */
        public void mo1515k(p085f1.C1974o r4, p085f1.C1974o.i r5) {
                r3 = this;
                androidx.mediarouter.app.g r4 = r3.f2746a
                java.util.Map<f1.o$i, android.widget.SeekBar> r4 = r4.f2681L0
                java.lang.Object r4 = r4.get(r5)
                android.widget.SeekBar r4 = (android.widget.SeekBar) r4
                int r0 = r5.f8747o
                boolean r1 = androidx.mediarouter.app.DialogC0487g.f2668j1
                if (r1 == 0) goto L26
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onRouteVolumeChanged(), route.getVolume:"
                r1.append(r2)
                r1.append(r0)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "MediaRouteCtrlDialog"
                android.util.Log.d(r2, r1)
            L26:
                if (r4 == 0) goto L31
                androidx.mediarouter.app.g r1 = r3.f2746a
                f1.o$i r1 = r1.f2676G0
                if (r1 == r5) goto L31
                r4.setProgress(r0)
            L31:
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.g$l */
    public class l implements android.widget.SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        public final java.lang.Runnable f2747a;

        /* renamed from: b */
        public final /* synthetic */ androidx.mediarouter.app.DialogC0487g f2748b;

        /* renamed from: androidx.mediarouter.app.g$l$a */
        public class a implements java.lang.Runnable {

            /* renamed from: Y */
            public final /* synthetic */ androidx.mediarouter.app.DialogC0487g.l f2749Y;

            public a(androidx.mediarouter.app.DialogC0487g.l r1) {
                    r0 = this;
                    r0.f2749Y = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    androidx.mediarouter.app.g$l r0 = r2.f2749Y
                    androidx.mediarouter.app.g r0 = r0.f2748b
                    f1.o$i r1 = r0.f2676G0
                    if (r1 == 0) goto L14
                    r1 = 0
                    r0.f2676G0 = r1
                    boolean r1 = r0.f2692W0
                    if (r1 == 0) goto L14
                    boolean r1 = r0.f2693X0
                    r0.m1509u(r1)
                L14:
                    return
            }
        }

        public l(androidx.mediarouter.app.DialogC0487g r1) {
                r0 = this;
                r0.f2748b = r1
                r0.<init>()
                androidx.mediarouter.app.g$l$a r1 = new androidx.mediarouter.app.g$l$a
                r1.<init>(r0)
                r0.f2747a = r1
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar r2, int r3, boolean r4) {
                r1 = this;
                if (r4 == 0) goto L2a
                java.lang.Object r2 = r2.getTag()
                f1.o$i r2 = (p085f1.C1974o.i) r2
                boolean r4 = androidx.mediarouter.app.DialogC0487g.f2668j1
                if (r4 == 0) goto L27
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = "onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume("
                r4.append(r0)
                r4.append(r3)
                java.lang.String r0 = ")"
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                java.lang.String r0 = "MediaRouteCtrlDialog"
                android.util.Log.d(r0, r4)
            L27:
                r2.m5072k(r3)
            L2a:
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(android.widget.SeekBar r3) {
                r2 = this;
                androidx.mediarouter.app.g r0 = r2.f2748b
                f1.o$i r1 = r0.f2676G0
                if (r1 == 0) goto Ld
                android.widget.SeekBar r0 = r0.f2674E0
                java.lang.Runnable r1 = r2.f2747a
                r0.removeCallbacks(r1)
            Ld:
                androidx.mediarouter.app.g r0 = r2.f2748b
                java.lang.Object r3 = r3.getTag()
                f1.o$i r3 = (p085f1.C1974o.i) r3
                r0.f2676G0 = r3
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(android.widget.SeekBar r4) {
                r3 = this;
                androidx.mediarouter.app.g r4 = r3.f2748b
                android.widget.SeekBar r4 = r4.f2674E0
                java.lang.Runnable r0 = r3.f2747a
                r1 = 500(0x1f4, double:2.47E-321)
                r4.postDelayed(r0, r1)
                return
        }
    }

    /* renamed from: androidx.mediarouter.app.g$m */
    public class m extends android.widget.ArrayAdapter<p085f1.C1974o.i> {

        /* renamed from: Y */
        public final float f2750Y;

        /* renamed from: Z */
        public final /* synthetic */ androidx.mediarouter.app.DialogC0487g f2751Z;

        public m(androidx.mediarouter.app.DialogC0487g r1, android.content.Context r2, java.util.List<p085f1.C1974o.i> r3) {
                r0 = this;
                r0.f2751Z = r1
                r1 = 0
                r0.<init>(r2, r1, r3)
                float r1 = androidx.mediarouter.app.C0498r.m1552d(r2)
                r0.f2750Y = r1
                return
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
                r6 = this;
                r0 = 0
                r1 = 2131362412(0x7f0a026c, float:1.8344604E38)
                r2 = 2131362763(0x7f0a03cb, float:1.8345316E38)
                if (r8 != 0) goto L19
                android.content.Context r8 = r9.getContext()
                android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)
                r3 = 2131558515(0x7f0d0073, float:1.8742348E38)
                android.view.View r8 = r8.inflate(r3, r9, r0)
                goto L3a
            L19:
                androidx.mediarouter.app.g r3 = r6.f2751Z
                java.util.Objects.requireNonNull(r3)
                android.view.View r4 = r8.findViewById(r2)
                android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
                int r5 = r3.f2678I0
                androidx.mediarouter.app.DialogC0487g.m1498s(r4, r5)
                android.view.View r4 = r8.findViewById(r1)
                android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
                int r3 = r3.f2677H0
                r5.width = r3
                r5.height = r3
                r4.setLayoutParams(r5)
            L3a:
                java.lang.Object r7 = r6.getItem(r7)
                f1.o$i r7 = (p085f1.C1974o.i) r7
                if (r7 == 0) goto Lf6
                boolean r3 = r7.f8739g
                r4 = 2131362401(0x7f0a0261, float:1.8344582E38)
                android.view.View r4 = r8.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r4.setEnabled(r3)
                java.lang.String r5 = r7.f8736d
                r4.setText(r5)
                r4 = 2131362413(0x7f0a026d, float:1.8344606E38)
                android.view.View r4 = r8.findViewById(r4)
                androidx.mediarouter.app.MediaRouteVolumeSlider r4 = (androidx.mediarouter.app.MediaRouteVolumeSlider) r4
                android.content.Context r9 = r9.getContext()
                androidx.mediarouter.app.g r5 = r6.f2751Z
                androidx.mediarouter.app.OverlayListView r5 = r5.f2728y0
                androidx.mediarouter.app.C0498r.m1561m(r9, r4, r5)
                r4.setTag(r7)
                androidx.mediarouter.app.g r9 = r6.f2751Z
                java.util.Map<f1.o$i, android.widget.SeekBar> r9 = r9.f2681L0
                r9.put(r7, r4)
                r9 = r3 ^ 1
                r4.m1477b(r9)
                r4.setEnabled(r3)
                r9 = 1
                if (r3 == 0) goto Laa
                androidx.mediarouter.app.g r5 = r6.f2751Z
                boolean r5 = r5.f2723t0
                if (r5 == 0) goto L8a
                int r5 = r7.f8746n
                if (r5 != r9) goto L8a
                r5 = 1
                goto L8b
            L8a:
                r5 = 0
            L8b:
                if (r5 == 0) goto L9f
                int r5 = r7.f8748p
                r4.setMax(r5)
                int r5 = r7.f8747o
                r4.setProgress(r5)
                androidx.mediarouter.app.g r5 = r6.f2751Z
                androidx.mediarouter.app.g$l r5 = r5.f2675F0
                r4.setOnSeekBarChangeListener(r5)
                goto Laa
            L9f:
                r5 = 100
                r4.setMax(r5)
                r4.setProgress(r5)
                r4.setEnabled(r0)
            Laa:
                android.view.View r1 = r8.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                if (r3 == 0) goto Lb5
                r3 = 255(0xff, float:3.57E-43)
                goto Lbc
            Lb5:
                r3 = 1132396544(0x437f0000, float:255.0)
                float r4 = r6.f2750Y
                float r4 = r4 * r3
                int r3 = (int) r4
            Lbc:
                r1.setAlpha(r3)
                android.view.View r1 = r8.findViewById(r2)
                android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
                androidx.mediarouter.app.g r2 = r6.f2751Z
                java.util.Set<f1.o$i> r2 = r2.f2673D0
                boolean r2 = r2.contains(r7)
                if (r2 == 0) goto Ld0
                r0 = 4
            Ld0:
                r1.setVisibility(r0)
                androidx.mediarouter.app.g r0 = r6.f2751Z
                java.util.Set<f1.o$i> r0 = r0.f2671B0
                if (r0 == 0) goto Lf6
                boolean r7 = r0.contains(r7)
                if (r7 == 0) goto Lf6
                android.view.animation.AlphaAnimation r7 = new android.view.animation.AlphaAnimation
                r0 = 0
                r7.<init>(r0, r0)
                r0 = 0
                r7.setDuration(r0)
                r7.setFillEnabled(r9)
                r7.setFillAfter(r9)
                r8.clearAnimation()
                r8.startAnimation(r7)
            Lf6:
                return r8
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    static {
            java.lang.String r0 = "MediaRouteCtrlDialog"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            androidx.mediarouter.app.DialogC0487g.f2668j1 = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 30
            long r0 = r0.toMillis(r1)
            int r1 = (int) r0
            androidx.mediarouter.app.DialogC0487g.f2669k1 = r1
            return
    }

    public DialogC0487g(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            android.content.Context r3 = androidx.mediarouter.app.C0498r.m1549a(r3, r0, r1)
            int r0 = androidx.mediarouter.app.C0498r.m1550b(r3)
            r2.<init>(r3, r0)
            r2.f2723t0 = r1
            androidx.mediarouter.app.g$a r0 = new androidx.mediarouter.app.g$a
            r0.<init>(r2)
            r2.f2712i1 = r0
            android.content.Context r0 = r2.getContext()
            r2.f2703e0 = r0
            androidx.mediarouter.app.g$j r0 = new androidx.mediarouter.app.g$j
            r0.<init>(r2)
            r2.f2683N0 = r0
            android.content.Context r0 = r2.f2703e0
            f1.o r0 = p085f1.C1974o.m5026d(r0)
            r2.f2697b0 = r0
            androidx.mediarouter.app.g$k r1 = new androidx.mediarouter.app.g$k
            r1.<init>(r2)
            r2.f2699c0 = r1
            f1.o$i r1 = r0.m5031g()
            r2.f2701d0 = r1
            android.support.v4.media.session.MediaSessionCompat$Token r0 = r0.m5029e()
            r2.m1508t(r0)
            android.content.Context r0 = r2.f2703e0
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131165459(0x7f070113, float:1.7945136E38)
            int r0 = r0.getDimensionPixelSize(r1)
            r2.f2680K0 = r0
            android.content.Context r0 = r2.f2703e0
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r2.f2710h1 = r0
            r0 = 2131492872(0x7f0c0008, float:1.8609208E38)
            android.view.animation.Interpolator r0 = android.view.animation.AnimationUtils.loadInterpolator(r3, r0)
            r2.f2706f1 = r0
            r0 = 2131492871(0x7f0c0007, float:1.8609206E38)
            android.view.animation.Interpolator r3 = android.view.animation.AnimationUtils.loadInterpolator(r3, r0)
            r2.f2708g1 = r3
            android.view.animation.AccelerateDecelerateInterpolator r3 = new android.view.animation.AccelerateDecelerateInterpolator
            r3.<init>()
            return
    }

    /* renamed from: k */
    public static int m1496k(android.view.View r0) {
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r0 = r0.height
            return r0
    }

    /* renamed from: o */
    public static boolean m1497o(android.graphics.Bitmap r0) {
            if (r0 == 0) goto La
            boolean r0 = r0.isRecycled()
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    /* renamed from: s */
    public static void m1498s(android.view.View r1, int r2) {
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r0.height = r2
            r1.setLayoutParams(r0)
            return
    }

    /* renamed from: e */
    public final void m1499e(android.view.View r5, int r6) {
            r4 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            int r0 = r0.height
            androidx.mediarouter.app.g$g r1 = new androidx.mediarouter.app.g$g
            r1.<init>(r4, r0, r6, r5)
            int r6 = r4.f2698b1
            long r2 = (long) r6
            r1.setDuration(r2)
            android.view.animation.Interpolator r6 = r4.f2704e1
            r1.setInterpolator(r6)
            r5.startAnimation(r1)
            return
    }

    /* renamed from: f */
    public final boolean m1500f() {
            r1 = this;
            android.support.v4.media.MediaDescriptionCompat r0 = r1.f2685P0
            if (r0 != 0) goto Lb
            android.support.v4.media.session.PlaybackStateCompat r0 = r1.f2684O0
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    /* renamed from: g */
    public void m1501g(boolean r11) {
            r10 = this;
            androidx.mediarouter.app.OverlayListView r0 = r10.f2728y0
            int r0 = r0.getFirstVisiblePosition()
            r1 = 0
            r2 = 0
        L8:
            androidx.mediarouter.app.OverlayListView r3 = r10.f2728y0
            int r3 = r3.getChildCount()
            r4 = 1
            if (r2 >= r3) goto L66
            androidx.mediarouter.app.OverlayListView r3 = r10.f2728y0
            android.view.View r3 = r3.getChildAt(r2)
            int r5 = r0 + r2
            androidx.mediarouter.app.g$m r6 = r10.f2729z0
            java.lang.Object r5 = r6.getItem(r5)
            f1.o$i r5 = (p085f1.C1974o.i) r5
            if (r11 == 0) goto L2e
            java.util.Set<f1.o$i> r6 = r10.f2671B0
            if (r6 == 0) goto L2e
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L2e
            goto L63
        L2e:
            r5 = 2131362763(0x7f0a03cb, float:1.8345316E38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r5.setVisibility(r1)
            android.view.animation.AnimationSet r5 = new android.view.animation.AnimationSet
            r5.<init>(r4)
            android.view.animation.AlphaAnimation r6 = new android.view.animation.AlphaAnimation
            r7 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r7, r7)
            r7 = 0
            r6.setDuration(r7)
            r5.addAnimation(r6)
            android.view.animation.TranslateAnimation r6 = new android.view.animation.TranslateAnimation
            r9 = 0
            r6.<init>(r9, r9, r9, r9)
            r6.setDuration(r7)
            r5.setFillAfter(r4)
            r5.setFillEnabled(r4)
            r3.clearAnimation()
            r3.startAnimation(r5)
        L63:
            int r2 = r2 + 1
            goto L8
        L66:
            androidx.mediarouter.app.OverlayListView r0 = r10.f2728y0
            java.util.List<androidx.mediarouter.app.OverlayListView$a> r0 = r0.f2603a0
            java.util.Iterator r0 = r0.iterator()
        L6e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L95
            java.lang.Object r2 = r0.next()
            androidx.mediarouter.app.OverlayListView$a r2 = (androidx.mediarouter.app.OverlayListView.C0480a) r2
            r2.f2614k = r4
            r2.f2615l = r4
            androidx.mediarouter.app.OverlayListView$a$a r2 = r2.f2616m
            if (r2 == 0) goto L6e
            androidx.mediarouter.app.d r2 = (androidx.mediarouter.app.C0484d) r2
            androidx.mediarouter.app.g r3 = r2.f2665b
            java.util.Set<f1.o$i> r3 = r3.f2673D0
            f1.o$i r5 = r2.f2664a
            r3.remove(r5)
            androidx.mediarouter.app.g r2 = r2.f2665b
            androidx.mediarouter.app.g$m r2 = r2.f2729z0
            r2.notifyDataSetChanged()
            goto L6e
        L95:
            if (r11 != 0) goto L9a
            r10.m1502i(r1)
        L9a:
            return
    }

    /* renamed from: i */
    public void m1502i(boolean r3) {
            r2 = this;
            r0 = 0
            r2.f2671B0 = r0
            r2.f2672C0 = r0
            r0 = 0
            r2.f2695Z0 = r0
            boolean r1 = r2.f2696a1
            if (r1 == 0) goto L11
            r2.f2696a1 = r0
            r2.m1512x(r3)
        L11:
            androidx.mediarouter.app.OverlayListView r3 = r2.f2728y0
            r0 = 1
            r3.setEnabled(r0)
            return
    }

    /* renamed from: j */
    public int m1503j(int r3, int r4) {
            r2 = this;
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r3 < r4) goto Lf
            int r1 = r2.f2709h0
            float r1 = (float) r1
            float r4 = (float) r4
            float r1 = r1 * r4
            float r3 = (float) r3
            float r1 = r1 / r3
            float r1 = r1 + r0
            int r3 = (int) r1
            return r3
        Lf:
            int r3 = r2.f2709h0
            float r3 = (float) r3
            r4 = 1091567616(0x41100000, float:9.0)
            float r3 = r3 * r4
            r4 = 1098907648(0x41800000, float:16.0)
            float r3 = r3 / r4
            float r3 = r3 + r0
            int r3 = (int) r3
            return r3
    }

    /* renamed from: m */
    public final int m1504m(boolean r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto Lb
            android.widget.LinearLayout r1 = r3.f2726w0
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L44
        Lb:
            android.widget.LinearLayout r1 = r3.f2724u0
            int r1 = r1.getPaddingTop()
            android.widget.LinearLayout r2 = r3.f2724u0
            int r2 = r2.getPaddingBottom()
            int r2 = r2 + r1
            int r2 = r2 + r0
            if (r4 == 0) goto L22
            android.widget.RelativeLayout r0 = r3.f2725v0
            int r0 = r0.getMeasuredHeight()
            int r2 = r2 + r0
        L22:
            android.widget.LinearLayout r0 = r3.f2726w0
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L32
            android.widget.LinearLayout r0 = r3.f2726w0
            int r0 = r0.getMeasuredHeight()
            int r0 = r0 + r2
            goto L33
        L32:
            r0 = r2
        L33:
            if (r4 == 0) goto L44
            android.widget.LinearLayout r4 = r3.f2726w0
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L44
            android.view.View r4 = r3.f2727x0
            int r4 = r4.getMeasuredHeight()
            int r0 = r0 + r4
        L44:
            return r0
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
            r4 = this;
            super.onAttachedToWindow()
            r0 = 1
            r4.f2707g0 = r0
            f1.o r0 = r4.f2697b0
            f1.n r1 = p085f1.C1973n.f8666c
            androidx.mediarouter.app.g$k r2 = r4.f2699c0
            r3 = 2
            r0.m5027a(r1, r2, r3)
            f1.o r0 = r4.f2697b0
            android.support.v4.media.session.MediaSessionCompat$Token r0 = r0.m5029e()
            r4.m1508t(r0)
            return
    }

    @Override // androidx.appcompat.app.DialogC0204b, p083f.DialogC1929p, android.app.Dialog
    public void onCreate(android.os.Bundle r11) {
            r10 = this;
            super.onCreate(r11)
            android.view.Window r11 = r10.getWindow()
            r0 = 17170445(0x106000d, float:2.461195E-38)
            r11.setBackgroundDrawableResource(r0)
            r11 = 2131558514(0x7f0d0072, float:1.8742346E38)
            r10.setContentView(r11)
            r11 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r11 = r10.findViewById(r11)
            r0 = 8
            r11.setVisibility(r0)
            androidx.mediarouter.app.g$h r11 = new androidx.mediarouter.app.g$h
            r11.<init>(r10)
            r1 = 2131362397(0x7f0a025d, float:1.8344573E38)
            android.view.View r1 = r10.findViewById(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r10.f2716m0 = r1
            androidx.mediarouter.app.g$b r2 = new androidx.mediarouter.app.g$b
            r2.<init>(r10)
            r1.setOnClickListener(r2)
            r1 = 2131362396(0x7f0a025c, float:1.8344571E38)
            android.view.View r1 = r10.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r10.f2717n0 = r1
            androidx.mediarouter.app.g$c r2 = new androidx.mediarouter.app.g$c
            r2.<init>(r10)
            r1.setOnClickListener(r2)
            android.content.Context r1 = r10.f2703e0
            r2 = 0
            r3 = 2130968831(0x7f0400ff, float:1.7546327E38)
            int r4 = androidx.mediarouter.app.C0498r.m1556h(r1, r2, r3)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            int r5 = androidx.mediarouter.app.C0498r.m1556h(r1, r2, r5)
            double r5 = p084f0.C1938a.m4818c(r4, r5)
            r7 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L6c
            r4 = 2130968818(0x7f0400f2, float:1.75463E38)
            int r4 = androidx.mediarouter.app.C0498r.m1556h(r1, r2, r4)
        L6c:
            r1 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r1 = r10.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r10.f2711i0 = r1
            r5 = 2131951889(0x7f130111, float:1.9540205E38)
            r1.setText(r5)
            android.widget.Button r1 = r10.f2711i0
            r1.setTextColor(r4)
            android.widget.Button r1 = r10.f2711i0
            r1.setOnClickListener(r11)
            r1 = 16908313(0x1020019, float:2.38773E-38)
            android.view.View r1 = r10.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r10.f2713j0 = r1
            r5 = 2131951896(0x7f130118, float:1.954022E38)
            r1.setText(r5)
            android.widget.Button r1 = r10.f2713j0
            r1.setTextColor(r4)
            android.widget.Button r1 = r10.f2713j0
            r1.setOnClickListener(r11)
            r1 = 2131362401(0x7f0a0261, float:1.8344582E38)
            android.view.View r1 = r10.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r10.f2722s0 = r1
            r1 = 2131362388(0x7f0a0254, float:1.8344555E38)
            android.view.View r1 = r10.findViewById(r1)
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1
            r1.setOnClickListener(r11)
            r1 = 2131362394(0x7f0a025a, float:1.8344567E38)
            android.view.View r1 = r10.findViewById(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r1 = 2131362395(0x7f0a025b, float:1.834457E38)
            android.view.View r1 = r10.findViewById(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r10.f2718o0 = r1
            androidx.mediarouter.app.g$d r1 = new androidx.mediarouter.app.g$d
            r1.<init>(r10)
            r4 = 2131362361(0x7f0a0239, float:1.83445E38)
            android.view.View r4 = r10.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r10.f2719p0 = r4
            r4.setOnClickListener(r1)
            r4 = 2131362393(0x7f0a0259, float:1.8344565E38)
            android.view.View r4 = r10.findViewById(r4)
            r4.setOnClickListener(r1)
            r1 = 2131362400(0x7f0a0260, float:1.834458E38)
            android.view.View r1 = r10.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r10.f2724u0 = r1
            r1 = 2131362389(0x7f0a0255, float:1.8344557E38)
            android.view.View r1 = r10.findViewById(r1)
            r10.f2727x0 = r1
            r1 = 2131362408(0x7f0a0268, float:1.8344596E38)
            android.view.View r1 = r10.findViewById(r1)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r10.f2725v0 = r1
            r1 = 2131362392(0x7f0a0258, float:1.8344563E38)
            android.view.View r1 = r10.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r10.f2720q0 = r1
            r1 = 2131362391(0x7f0a0257, float:1.8344561E38)
            android.view.View r1 = r10.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r10.f2721r0 = r1
            r1 = 2131362390(0x7f0a0256, float:1.834456E38)
            android.view.View r1 = r10.findViewById(r1)
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1
            r10.f2714k0 = r1
            r1.setOnClickListener(r11)
            r11 = 2131362410(0x7f0a026a, float:1.83446E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            r10.f2726w0 = r11
            r11.setVisibility(r0)
            r11 = 2131362413(0x7f0a026d, float:1.8344606E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.SeekBar r11 = (android.widget.SeekBar) r11
            r10.f2674E0 = r11
            f1.o$i r0 = r10.f2701d0
            r11.setTag(r0)
            androidx.mediarouter.app.g$l r11 = new androidx.mediarouter.app.g$l
            r11.<init>(r10)
            r10.f2675F0 = r11
            android.widget.SeekBar r0 = r10.f2674E0
            r0.setOnSeekBarChangeListener(r11)
            r11 = 2131362411(0x7f0a026b, float:1.8344602E38)
            android.view.View r11 = r10.findViewById(r11)
            androidx.mediarouter.app.OverlayListView r11 = (androidx.mediarouter.app.OverlayListView) r11
            r10.f2728y0 = r11
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r10.f2670A0 = r11
            androidx.mediarouter.app.g$m r11 = new androidx.mediarouter.app.g$m
            androidx.mediarouter.app.OverlayListView r0 = r10.f2728y0
            android.content.Context r0 = r0.getContext()
            java.util.List<f1.o$i> r1 = r10.f2670A0
            r11.<init>(r10, r0, r1)
            r10.f2729z0 = r11
            androidx.mediarouter.app.OverlayListView r0 = r10.f2728y0
            r0.setAdapter(r11)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            r10.f2673D0 = r11
            android.content.Context r11 = r10.f2703e0
            android.widget.LinearLayout r0 = r10.f2724u0
            androidx.mediarouter.app.OverlayListView r1 = r10.f2728y0
            f1.o$i r4 = r10.f2701d0
            boolean r4 = r4.m5067f()
            int r3 = androidx.mediarouter.app.C0498r.m1556h(r11, r2, r3)
            r5 = 2130968832(0x7f040100, float:1.7546329E38)
            int r5 = androidx.mediarouter.app.C0498r.m1556h(r11, r2, r5)
            if (r4 == 0) goto L1a8
            int r11 = androidx.mediarouter.app.C0498r.m1551c(r11, r2)
            r2 = -570425344(0xffffffffde000000, float:-2.305843E18)
            if (r11 != r2) goto L1a8
            r11 = -1
            r5 = r3
            r3 = -1
        L1a8:
            r0.setBackgroundColor(r3)
            r1.setBackgroundColor(r5)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            r0.setTag(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            r1.setTag(r11)
            android.content.Context r11 = r10.f2703e0
            android.widget.SeekBar r0 = r10.f2674E0
            androidx.mediarouter.app.MediaRouteVolumeSlider r0 = (androidx.mediarouter.app.MediaRouteVolumeSlider) r0
            android.widget.LinearLayout r1 = r10.f2724u0
            androidx.mediarouter.app.C0498r.m1561m(r11, r0, r1)
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            r10.f2681L0 = r11
            f1.o$i r0 = r10.f2701d0
            android.widget.SeekBar r1 = r10.f2674E0
            r11.put(r0, r1)
            r11 = 2131362398(0x7f0a025e, float:1.8344575E38)
            android.view.View r11 = r10.findViewById(r11)
            androidx.mediarouter.app.MediaRouteExpandCollapseButton r11 = (androidx.mediarouter.app.MediaRouteExpandCollapseButton) r11
            r10.f2715l0 = r11
            androidx.mediarouter.app.g$e r0 = new androidx.mediarouter.app.g$e
            r0.<init>(r10)
            r11.setOnClickListener(r0)
            boolean r11 = r10.f2694Y0
            if (r11 == 0) goto L1ef
            android.view.animation.Interpolator r11 = r10.f2706f1
            goto L1f1
        L1ef:
            android.view.animation.Interpolator r11 = r10.f2708g1
        L1f1:
            r10.f2704e1 = r11
            android.content.Context r11 = r10.f2703e0
            android.content.res.Resources r11 = r11.getResources()
            r0 = 2131427353(0x7f0b0019, float:1.847632E38)
            int r11 = r11.getInteger(r0)
            r10.f2698b1 = r11
            android.content.Context r11 = r10.f2703e0
            android.content.res.Resources r11 = r11.getResources()
            r0 = 2131427354(0x7f0b001a, float:1.8476322E38)
            int r11 = r11.getInteger(r0)
            r10.f2700c1 = r11
            android.content.Context r11 = r10.f2703e0
            android.content.res.Resources r11 = r11.getResources()
            r0 = 2131427355(0x7f0b001b, float:1.8476324E38)
            int r11 = r11.getInteger(r0)
            r10.f2702d1 = r11
            r11 = 1
            r10.f2705f0 = r11
            r10.m1511w()
            return
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
            r2 = this;
            f1.o r0 = r2.f2697b0
            androidx.mediarouter.app.g$k r1 = r2.f2699c0
            r0.m5033i(r1)
            r0 = 0
            r2.m1508t(r0)
            r0 = 0
            r2.f2707g0 = r0
            super.onDetachedFromWindow()
            return
    }

    @Override // androidx.appcompat.app.DialogC0204b, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r3, android.view.KeyEvent r4) {
            r2 = this;
            r0 = 25
            if (r3 == r0) goto Le
            r1 = 24
            if (r3 != r1) goto L9
            goto Le
        L9:
            boolean r3 = super.onKeyDown(r3, r4)
            return r3
        Le:
            f1.o$i r4 = r2.f2701d0
            r1 = 1
            if (r3 != r0) goto L15
            r3 = -1
            goto L16
        L15:
            r3 = 1
        L16:
            r4.m5073l(r3)
            return r1
    }

    @Override // androidx.appcompat.app.DialogC0204b, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int r2, android.view.KeyEvent r3) {
            r1 = this;
            r0 = 25
            if (r2 == r0) goto Le
            r0 = 24
            if (r2 != r0) goto L9
            goto Le
        L9:
            boolean r2 = super.onKeyUp(r2, r3)
            return r2
        Le:
            r2 = 1
            return r2
    }

    /* renamed from: p */
    public boolean m1505p() {
            r5 = this;
            android.support.v4.media.session.PlaybackStateCompat r0 = r5.f2684O0
            long r0 = r0.f568c0
            r2 = 514(0x202, double:2.54E-321)
            long r0 = r0 & r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    /* renamed from: q */
    public boolean m1506q() {
            r5 = this;
            android.support.v4.media.session.PlaybackStateCompat r0 = r5.f2684O0
            long r0 = r0.f568c0
            r2 = 516(0x204, double:2.55E-321)
            long r0 = r0 & r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    /* renamed from: r */
    public boolean m1507r() {
            r5 = this;
            android.support.v4.media.session.PlaybackStateCompat r0 = r5.f2684O0
            long r0 = r0.f568c0
            r2 = 1
            long r0 = r0 & r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    /* renamed from: t */
    public final void m1508t(android.support.v4.media.session.MediaSessionCompat.Token r4) {
            r3 = this;
            android.support.v4.media.session.MediaControllerCompat r0 = r3.f2682M0
            r1 = 0
            if (r0 == 0) goto Lc
            androidx.mediarouter.app.g$j r2 = r3.f2683N0
            r0.m263e(r2)
            r3.f2682M0 = r1
        Lc:
            if (r4 != 0) goto Lf
            return
        Lf:
            boolean r0 = r3.f2707g0
            if (r0 != 0) goto L14
            return
        L14:
            android.support.v4.media.session.MediaControllerCompat r0 = new android.support.v4.media.session.MediaControllerCompat
            android.content.Context r2 = r3.f2703e0
            r0.<init>(r2, r4)
            r3.f2682M0 = r0
            androidx.mediarouter.app.g$j r4 = r3.f2683N0
            r0.m262d(r4)
            android.support.v4.media.session.MediaControllerCompat r4 = r3.f2682M0
            android.support.v4.media.MediaMetadataCompat r4 = r4.m259a()
            if (r4 != 0) goto L2b
            goto L2f
        L2b:
            android.support.v4.media.MediaDescriptionCompat r1 = r4.m230d()
        L2f:
            r3.f2685P0 = r1
            android.support.v4.media.session.MediaControllerCompat r4 = r3.f2682M0
            android.support.v4.media.session.PlaybackStateCompat r4 = r4.m260b()
            r3.f2684O0 = r4
            r3.m1510v()
            r4 = 0
            r3.m1509u(r4)
            return
    }

    /* renamed from: u */
    public void m1509u(boolean r9) {
            r8 = this;
            f1.o$i r0 = r8.f2676G0
            r1 = 1
            if (r0 == 0) goto Ld
            r8.f2692W0 = r1
            boolean r0 = r8.f2693X0
            r9 = r9 | r0
            r8.f2693X0 = r9
            return
        Ld:
            r0 = 0
            r8.f2692W0 = r0
            r8.f2693X0 = r0
            f1.o$i r2 = r8.f2701d0
            boolean r2 = r2.m5069h()
            if (r2 == 0) goto L19a
            f1.o$i r2 = r8.f2701d0
            boolean r2 = r2.m5066e()
            if (r2 == 0) goto L24
            goto L19a
        L24:
            boolean r2 = r8.f2705f0
            if (r2 != 0) goto L29
            return
        L29:
            android.widget.TextView r2 = r8.f2722s0
            f1.o$i r3 = r8.f2701d0
            java.lang.String r3 = r3.f8736d
            r2.setText(r3)
            android.widget.Button r2 = r8.f2711i0
            f1.o$i r3 = r8.f2701d0
            boolean r3 = r3.f8741i
            r4 = 8
            if (r3 == 0) goto L3e
            r3 = 0
            goto L40
        L3e:
            r3 = 8
        L40:
            r2.setVisibility(r3)
            r2 = 0
            boolean r3 = r8.f2689T0
            if (r3 == 0) goto L79
            android.graphics.Bitmap r3 = r8.f2690U0
            boolean r3 = m1497o(r3)
            if (r3 == 0) goto L65
            java.lang.String r3 = "Can't set artwork image with recycled bitmap: "
            java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
            android.graphics.Bitmap r5 = r8.f2690U0
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "MediaRouteCtrlDialog"
            android.util.Log.w(r5, r3)
            goto L73
        L65:
            android.widget.ImageView r3 = r8.f2719p0
            android.graphics.Bitmap r5 = r8.f2690U0
            r3.setImageBitmap(r5)
            android.widget.ImageView r3 = r8.f2719p0
            int r5 = r8.f2691V0
            r3.setBackgroundColor(r5)
        L73:
            r8.f2689T0 = r0
            r8.f2690U0 = r2
            r8.f2691V0 = r0
        L79:
            f1.o$i r3 = r8.f2701d0
            boolean r5 = r8.f2723t0
            if (r5 == 0) goto L85
            int r3 = r3.f8746n
            if (r3 != r1) goto L85
            r3 = 1
            goto L86
        L85:
            r3 = 0
        L86:
            android.widget.LinearLayout r5 = r8.f2726w0
            if (r3 == 0) goto Lb9
            int r3 = r5.getVisibility()
            if (r3 != r4) goto Lbc
            android.widget.LinearLayout r3 = r8.f2726w0
            r3.setVisibility(r0)
            android.widget.SeekBar r3 = r8.f2674E0
            f1.o$i r4 = r8.f2701d0
            int r4 = r4.f8748p
            r3.setMax(r4)
            android.widget.SeekBar r3 = r8.f2674E0
            f1.o$i r4 = r8.f2701d0
            int r4 = r4.f8747o
            r3.setProgress(r4)
            androidx.mediarouter.app.MediaRouteExpandCollapseButton r3 = r8.f2715l0
            f1.o$i r4 = r8.f2701d0
            boolean r4 = r4.m5067f()
            if (r4 == 0) goto Lb3
            r4 = 0
            goto Lb5
        Lb3:
            r4 = 8
        Lb5:
            r3.setVisibility(r4)
            goto Lbc
        Lb9:
            r5.setVisibility(r4)
        Lbc:
            boolean r3 = r8.m1500f()
            if (r3 == 0) goto L196
            android.support.v4.media.MediaDescriptionCompat r3 = r8.f2685P0
            if (r3 != 0) goto Lc8
            r3 = r2
            goto Lca
        Lc8:
            java.lang.CharSequence r3 = r3.f486Z
        Lca:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r4 = r4 ^ r1
            android.support.v4.media.MediaDescriptionCompat r5 = r8.f2685P0
            if (r5 != 0) goto Ld4
            goto Ld6
        Ld4:
            java.lang.CharSequence r2 = r5.f487a0
        Ld6:
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            r5 = r5 ^ r1
            f1.o$i r6 = r8.f2701d0
            int r6 = r6.f8749q
            r7 = -1
            if (r6 == r7) goto Le8
            android.widget.TextView r2 = r8.f2720q0
            r3 = 2131951886(0x7f13010e, float:1.95402E38)
            goto L113
        Le8:
            android.support.v4.media.session.PlaybackStateCompat r6 = r8.f2684O0
            if (r6 == 0) goto L10e
            int r6 = r6.f564Y
            if (r6 != 0) goto Lf1
            goto L10e
        Lf1:
            if (r4 != 0) goto Lfb
            if (r5 != 0) goto Lfb
            android.widget.TextView r2 = r8.f2720q0
            r3 = 2131951891(0x7f130113, float:1.954021E38)
            goto L113
        Lfb:
            if (r4 == 0) goto L104
            android.widget.TextView r4 = r8.f2720q0
            r4.setText(r3)
            r3 = 1
            goto L105
        L104:
            r3 = 0
        L105:
            if (r5 == 0) goto L117
            android.widget.TextView r4 = r8.f2721r0
            r4.setText(r2)
            r2 = 1
            goto L118
        L10e:
            android.widget.TextView r2 = r8.f2720q0
            r3 = 2131951892(0x7f130114, float:1.9540211E38)
        L113:
            r2.setText(r3)
            r3 = 1
        L117:
            r2 = 0
        L118:
            android.widget.TextView r4 = r8.f2720q0
            if (r3 == 0) goto L11e
            r3 = 0
            goto L120
        L11e:
            r3 = 8
        L120:
            r4.setVisibility(r3)
            android.widget.TextView r3 = r8.f2721r0
            if (r2 == 0) goto L129
            r2 = 0
            goto L12b
        L129:
            r2 = 8
        L12b:
            r3.setVisibility(r2)
            android.support.v4.media.session.PlaybackStateCompat r2 = r8.f2684O0
            if (r2 == 0) goto L196
            int r2 = r2.f564Y
            r3 = 6
            if (r2 == r3) goto L13d
            r3 = 3
            if (r2 != r3) goto L13b
            goto L13d
        L13b:
            r2 = 0
            goto L13e
        L13d:
            r2 = 1
        L13e:
            android.widget.ImageButton r3 = r8.f2714k0
            android.content.Context r3 = r3.getContext()
            if (r2 == 0) goto L153
            boolean r4 = r8.m1505p()
            if (r4 == 0) goto L153
            r2 = 2130969262(0x7f0402ae, float:1.75472E38)
            r4 = 2131951893(0x7f130115, float:1.9540213E38)
            goto L174
        L153:
            if (r2 == 0) goto L162
            boolean r4 = r8.m1507r()
            if (r4 == 0) goto L162
            r2 = 2130969266(0x7f0402b2, float:1.754721E38)
            r4 = 2131951895(0x7f130117, float:1.9540217E38)
            goto L174
        L162:
            if (r2 != 0) goto L171
            boolean r2 = r8.m1506q()
            if (r2 == 0) goto L171
            r2 = 2130969263(0x7f0402af, float:1.7547203E38)
            r4 = 2131951894(0x7f130116, float:1.9540215E38)
            goto L174
        L171:
            r1 = 0
            r2 = 0
            r4 = 0
        L174:
            android.widget.ImageButton r5 = r8.f2714k0
            if (r1 == 0) goto L179
            goto L17b
        L179:
            r0 = 8
        L17b:
            r5.setVisibility(r0)
            if (r1 == 0) goto L196
            android.widget.ImageButton r0 = r8.f2714k0
            int r1 = androidx.mediarouter.app.C0498r.m1557i(r3, r2)
            r0.setImageResource(r1)
            android.widget.ImageButton r0 = r8.f2714k0
            android.content.res.Resources r1 = r3.getResources()
            java.lang.CharSequence r1 = r1.getText(r4)
            r0.setContentDescription(r1)
        L196:
            r8.m1512x(r9)
            return
        L19a:
            r8.dismiss()
            return
    }

    /* renamed from: v */
    public void m1510v() {
            r6 = this;
            android.support.v4.media.MediaDescriptionCompat r0 = r6.f2685P0
            r1 = 0
            if (r0 != 0) goto L7
            r2 = r1
            goto L9
        L7:
            android.graphics.Bitmap r2 = r0.f489c0
        L9:
            if (r0 != 0) goto Lc
            goto Le
        Lc:
            android.net.Uri r1 = r0.f490d0
        Le:
            androidx.mediarouter.app.g$i r0 = r6.f2686Q0
            if (r0 != 0) goto L15
            android.graphics.Bitmap r3 = r6.f2687R0
            goto L17
        L15:
            android.graphics.Bitmap r3 = r0.f2740a
        L17:
            if (r0 != 0) goto L1c
            android.net.Uri r0 = r6.f2688S0
            goto L1e
        L1c:
            android.net.Uri r0 = r0.f2741b
        L1e:
            r4 = 1
            r5 = 0
            if (r3 == r2) goto L23
            goto L37
        L23:
            if (r3 != 0) goto L39
            if (r0 == 0) goto L2e
            boolean r2 = r0.equals(r1)
            if (r2 == 0) goto L2e
            goto L32
        L2e:
            if (r0 != 0) goto L34
            if (r1 != 0) goto L34
        L32:
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            if (r0 != 0) goto L39
        L37:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            if (r0 != 0) goto L3d
            goto L50
        L3d:
            androidx.mediarouter.app.g$i r0 = r6.f2686Q0
            if (r0 == 0) goto L44
            r0.cancel(r4)
        L44:
            androidx.mediarouter.app.g$i r0 = new androidx.mediarouter.app.g$i
            r0.<init>(r6)
            r6.f2686Q0 = r0
            java.lang.Void[] r1 = new java.lang.Void[r5]
            r0.execute(r1)
        L50:
            return
    }

    /* renamed from: w */
    public void m1511w() {
            r3 = this;
            android.content.Context r0 = r3.f2703e0
            int r0 = androidx.mediarouter.app.C0492l.m1516a(r0)
            android.view.Window r1 = r3.getWindow()
            r2 = -2
            r1.setLayout(r0, r2)
            android.view.Window r1 = r3.getWindow()
            android.view.View r1 = r1.getDecorView()
            int r2 = r1.getPaddingLeft()
            int r0 = r0 - r2
            int r1 = r1.getPaddingRight()
            int r0 = r0 - r1
            r3.f2709h0 = r0
            android.content.Context r0 = r3.f2703e0
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131165457(0x7f070111, float:1.7945132E38)
            int r1 = r0.getDimensionPixelSize(r1)
            r3.f2677H0 = r1
            r1 = 2131165456(0x7f070110, float:1.794513E38)
            int r1 = r0.getDimensionPixelSize(r1)
            r3.f2678I0 = r1
            r1 = 2131165458(0x7f070112, float:1.7945134E38)
            int r0 = r0.getDimensionPixelSize(r1)
            r3.f2679J0 = r0
            r0 = 0
            r3.f2687R0 = r0
            r3.f2688S0 = r0
            r3.m1510v()
            r0 = 0
            r3.m1509u(r0)
            return
    }

    /* renamed from: x */
    public void m1512x(boolean r3) {
            r2 = this;
            android.widget.FrameLayout r0 = r2.f2718o0
            r0.requestLayout()
            android.widget.FrameLayout r0 = r2.f2718o0
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            androidx.mediarouter.app.g$f r1 = new androidx.mediarouter.app.g$f
            r1.<init>(r2, r3)
            r0.addOnGlobalLayoutListener(r1)
            return
    }

    /* renamed from: y */
    public final void m1513y(boolean r5) {
            r4 = this;
            android.view.View r0 = r4.f2727x0
            android.widget.LinearLayout r1 = r4.f2726w0
            int r1 = r1.getVisibility()
            r2 = 0
            r3 = 8
            if (r1 != 0) goto L11
            if (r5 == 0) goto L11
            r1 = 0
            goto L13
        L11:
            r1 = 8
        L13:
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r4.f2724u0
            android.widget.LinearLayout r1 = r4.f2726w0
            int r1 = r1.getVisibility()
            if (r1 != r3) goto L24
            if (r5 != 0) goto L24
            r2 = 8
        L24:
            r0.setVisibility(r2)
            return
    }
}
