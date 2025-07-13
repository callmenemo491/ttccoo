package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.j0 */
/* loaded from: classes.dex */
public class C0284j0 implements p194l.InterfaceC4155f {

    /* renamed from: x0 */
    public static java.lang.reflect.Method f1324x0;

    /* renamed from: y0 */
    public static java.lang.reflect.Method f1325y0;

    /* renamed from: z0 */
    public static java.lang.reflect.Method f1326z0;

    /* renamed from: Y */
    public android.content.Context f1327Y;

    /* renamed from: Z */
    public android.widget.ListAdapter f1328Z;

    /* renamed from: a0 */
    public androidx.appcompat.widget.C0274f0 f1329a0;

    /* renamed from: b0 */
    public int f1330b0;

    /* renamed from: c0 */
    public int f1331c0;

    /* renamed from: d0 */
    public int f1332d0;

    /* renamed from: e0 */
    public int f1333e0;

    /* renamed from: f0 */
    public int f1334f0;

    /* renamed from: g0 */
    public boolean f1335g0;

    /* renamed from: h0 */
    public boolean f1336h0;

    /* renamed from: i0 */
    public boolean f1337i0;

    /* renamed from: j0 */
    public int f1338j0;

    /* renamed from: k0 */
    public int f1339k0;

    /* renamed from: l0 */
    public android.database.DataSetObserver f1340l0;

    /* renamed from: m0 */
    public android.view.View f1341m0;

    /* renamed from: n0 */
    public android.widget.AdapterView.OnItemClickListener f1342n0;

    /* renamed from: o0 */
    public final androidx.appcompat.widget.C0284j0.e f1343o0;

    /* renamed from: p0 */
    public final androidx.appcompat.widget.C0284j0.d f1344p0;

    /* renamed from: q0 */
    public final androidx.appcompat.widget.C0284j0.c f1345q0;

    /* renamed from: r0 */
    public final androidx.appcompat.widget.C0284j0.a f1346r0;

    /* renamed from: s0 */
    public final android.os.Handler f1347s0;

    /* renamed from: t0 */
    public final android.graphics.Rect f1348t0;

    /* renamed from: u0 */
    public android.graphics.Rect f1349u0;

    /* renamed from: v0 */
    public boolean f1350v0;

    /* renamed from: w0 */
    public android.widget.PopupWindow f1351w0;

    /* renamed from: androidx.appcompat.widget.j0$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.widget.C0284j0 f1352Y;

        public a(androidx.appcompat.widget.C0284j0 r1) {
                r0 = this;
                r0.f1352Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.appcompat.widget.j0 r0 = r2.f1352Y
                androidx.appcompat.widget.f0 r0 = r0.f1329a0
                if (r0 == 0) goto Ld
                r1 = 1
                r0.setListSelectionHidden(r1)
                r0.requestLayout()
            Ld:
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$b */
    public class b extends android.database.DataSetObserver {

        /* renamed from: a */
        public final /* synthetic */ androidx.appcompat.widget.C0284j0 f1353a;

        public b(androidx.appcompat.widget.C0284j0 r1) {
                r0 = this;
                r0.f1353a = r1
                r0.<init>()
                return
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
                r1 = this;
                androidx.appcompat.widget.j0 r0 = r1.f1353a
                boolean r0 = r0.mo473b()
                if (r0 == 0) goto Ld
                androidx.appcompat.widget.j0 r0 = r1.f1353a
                r0.mo475d()
            Ld:
                return
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
                r1 = this;
                androidx.appcompat.widget.j0 r0 = r1.f1353a
                r0.dismiss()
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$c */
    public class c implements android.widget.AbsListView.OnScrollListener {

        /* renamed from: a */
        public final /* synthetic */ androidx.appcompat.widget.C0284j0 f1354a;

        public c(androidx.appcompat.widget.C0284j0 r1) {
                r0 = this;
                r0.f1354a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(android.widget.AbsListView r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(android.widget.AbsListView r2, int r3) {
                r1 = this;
                r2 = 1
                if (r3 != r2) goto L2c
                androidx.appcompat.widget.j0 r3 = r1.f1354a
                android.widget.PopupWindow r3 = r3.f1351w0
                int r3 = r3.getInputMethodMode()
                r0 = 2
                if (r3 != r0) goto Lf
                goto L10
            Lf:
                r2 = 0
            L10:
                if (r2 != 0) goto L2c
                androidx.appcompat.widget.j0 r2 = r1.f1354a
                android.widget.PopupWindow r2 = r2.f1351w0
                android.view.View r2 = r2.getContentView()
                if (r2 == 0) goto L2c
                androidx.appcompat.widget.j0 r2 = r1.f1354a
                android.os.Handler r3 = r2.f1347s0
                androidx.appcompat.widget.j0$e r2 = r2.f1343o0
                r3.removeCallbacks(r2)
                androidx.appcompat.widget.j0 r2 = r1.f1354a
                androidx.appcompat.widget.j0$e r2 = r2.f1343o0
                r2.run()
            L2c:
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$d */
    public class d implements android.view.View.OnTouchListener {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.widget.C0284j0 f1355Y;

        public d(androidx.appcompat.widget.C0284j0 r1) {
                r0 = this;
                r0.f1355Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View r3, android.view.MotionEvent r4) {
                r2 = this;
                int r3 = r4.getAction()
                float r0 = r4.getX()
                int r0 = (int) r0
                float r4 = r4.getY()
                int r4 = (int) r4
                if (r3 != 0) goto L40
                androidx.appcompat.widget.j0 r1 = r2.f1355Y
                android.widget.PopupWindow r1 = r1.f1351w0
                if (r1 == 0) goto L40
                boolean r1 = r1.isShowing()
                if (r1 == 0) goto L40
                if (r0 < 0) goto L40
                androidx.appcompat.widget.j0 r1 = r2.f1355Y
                android.widget.PopupWindow r1 = r1.f1351w0
                int r1 = r1.getWidth()
                if (r0 >= r1) goto L40
                if (r4 < 0) goto L40
                androidx.appcompat.widget.j0 r0 = r2.f1355Y
                android.widget.PopupWindow r0 = r0.f1351w0
                int r0 = r0.getHeight()
                if (r4 >= r0) goto L40
                androidx.appcompat.widget.j0 r3 = r2.f1355Y
                android.os.Handler r4 = r3.f1347s0
                androidx.appcompat.widget.j0$e r3 = r3.f1343o0
                r0 = 250(0xfa, double:1.235E-321)
                r4.postDelayed(r3, r0)
                goto L4c
            L40:
                r4 = 1
                if (r3 != r4) goto L4c
                androidx.appcompat.widget.j0 r3 = r2.f1355Y
                android.os.Handler r4 = r3.f1347s0
                androidx.appcompat.widget.j0$e r3 = r3.f1343o0
                r4.removeCallbacks(r3)
            L4c:
                r3 = 0
                return r3
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$e */
    public class e implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.widget.C0284j0 f1356Y;

        public e(androidx.appcompat.widget.C0284j0 r1) {
                r0 = this;
                r0.f1356Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.appcompat.widget.j0 r0 = r3.f1356Y
                androidx.appcompat.widget.f0 r0 = r0.f1329a0
                if (r0 == 0) goto L39
                java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
                boolean r0 = p227n0.C4661t.f.m10587b(r0)
                if (r0 == 0) goto L39
                androidx.appcompat.widget.j0 r0 = r3.f1356Y
                androidx.appcompat.widget.f0 r0 = r0.f1329a0
                int r0 = r0.getCount()
                androidx.appcompat.widget.j0 r1 = r3.f1356Y
                androidx.appcompat.widget.f0 r1 = r1.f1329a0
                int r1 = r1.getChildCount()
                if (r0 <= r1) goto L39
                androidx.appcompat.widget.j0 r0 = r3.f1356Y
                androidx.appcompat.widget.f0 r0 = r0.f1329a0
                int r0 = r0.getChildCount()
                androidx.appcompat.widget.j0 r1 = r3.f1356Y
                int r2 = r1.f1339k0
                if (r0 > r2) goto L39
                android.widget.PopupWindow r0 = r1.f1351w0
                r1 = 2
                r0.setInputMethodMode(r1)
                androidx.appcompat.widget.j0 r0 = r3.f1356Y
                r0.mo475d()
            L39:
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 1
            java.lang.String r3 = "ListPopupWindow"
            r4 = 28
            if (r0 > r4) goto L36
            java.lang.Class<android.widget.PopupWindow> r0 = android.widget.PopupWindow.class
            java.lang.String r4 = "setClipToScreenEnabled"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1b
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L1b
            r5[r1] = r6     // Catch: java.lang.NoSuchMethodException -> L1b
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L1b
            androidx.appcompat.widget.C0284j0.f1324x0 = r0     // Catch: java.lang.NoSuchMethodException -> L1b
            goto L20
        L1b:
            java.lang.String r0 = "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well."
            android.util.Log.i(r3, r0)
        L20:
            java.lang.Class<android.widget.PopupWindow> r0 = android.widget.PopupWindow.class
            java.lang.String r4 = "setEpicenterBounds"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L31
            java.lang.Class<android.graphics.Rect> r6 = android.graphics.Rect.class
            r5[r1] = r6     // Catch: java.lang.NoSuchMethodException -> L31
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L31
            androidx.appcompat.widget.C0284j0.f1326z0 = r0     // Catch: java.lang.NoSuchMethodException -> L31
            goto L36
        L31:
            java.lang.String r0 = "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well."
            android.util.Log.i(r3, r0)
        L36:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r0 > r4) goto L5c
            java.lang.Class<android.widget.PopupWindow> r0 = android.widget.PopupWindow.class
            java.lang.String r4 = "getMaxAvailableHeight"
            r5 = 3
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L57
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r5[r1] = r6     // Catch: java.lang.NoSuchMethodException -> L57
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L57
            r5[r2] = r1     // Catch: java.lang.NoSuchMethodException -> L57
            r1 = 2
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L57
            r5[r1] = r2     // Catch: java.lang.NoSuchMethodException -> L57
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L57
            androidx.appcompat.widget.C0284j0.f1325y0 = r0     // Catch: java.lang.NoSuchMethodException -> L57
            goto L5c
        L57:
            java.lang.String r0 = "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well."
            android.util.Log.i(r3, r0)
        L5c:
            return
    }

    public C0284j0(android.content.Context r4) {
            r3 = this;
            r0 = 0
            r1 = 2130969205(0x7f040275, float:1.7547085E38)
            r2 = 0
            r3.<init>(r4, r0, r1, r2)
            return
    }

    public C0284j0(android.content.Context r4, android.util.AttributeSet r5, int r6, int r7) {
            r3 = this;
            r3.<init>()
            r0 = -2
            r3.f1330b0 = r0
            r3.f1331c0 = r0
            r0 = 1002(0x3ea, float:1.404E-42)
            r3.f1334f0 = r0
            r0 = 0
            r3.f1338j0 = r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r3.f1339k0 = r1
            androidx.appcompat.widget.j0$e r1 = new androidx.appcompat.widget.j0$e
            r1.<init>(r3)
            r3.f1343o0 = r1
            androidx.appcompat.widget.j0$d r1 = new androidx.appcompat.widget.j0$d
            r1.<init>(r3)
            r3.f1344p0 = r1
            androidx.appcompat.widget.j0$c r1 = new androidx.appcompat.widget.j0$c
            r1.<init>(r3)
            r3.f1345q0 = r1
            androidx.appcompat.widget.j0$a r1 = new androidx.appcompat.widget.j0$a
            r1.<init>(r3)
            r3.f1346r0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r3.f1348t0 = r1
            r3.f1327Y = r4
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = r4.getMainLooper()
            r1.<init>(r2)
            r3.f1347s0 = r1
            int[] r1 = p064e.C1495i.f7271n
            android.content.res.TypedArray r1 = r4.obtainStyledAttributes(r5, r1, r6, r7)
            int r2 = r1.getDimensionPixelOffset(r0, r0)
            r3.f1332d0 = r2
            r2 = 1
            int r0 = r1.getDimensionPixelOffset(r2, r0)
            r3.f1333e0 = r0
            if (r0 == 0) goto L5b
            r3.f1335g0 = r2
        L5b:
            r1.recycle()
            androidx.appcompat.widget.p r0 = new androidx.appcompat.widget.p
            r0.<init>(r4, r5, r6, r7)
            r3.f1351w0 = r0
            r0.setInputMethodMode(r2)
            return
    }

    @Override // p194l.InterfaceC4155f
    /* renamed from: b */
    public boolean mo473b() {
            r1 = this;
            android.widget.PopupWindow r0 = r1.f1351w0
            boolean r0 = r0.isShowing()
            return r0
    }

    /* renamed from: c */
    public int m732c() {
            r1 = this;
            int r0 = r1.f1332d0
            return r0
    }

    @Override // p194l.InterfaceC4155f
    /* renamed from: d */
    public void mo475d() {
            r14 = this;
            androidx.appcompat.widget.f0 r0 = r14.f1329a0
            r1 = 1
            if (r0 != 0) goto L3f
            android.content.Context r0 = r14.f1327Y
            boolean r2 = r14.f1350v0
            r2 = r2 ^ r1
            androidx.appcompat.widget.f0 r0 = r14.mo739q(r0, r2)
            r14.f1329a0 = r0
            android.widget.ListAdapter r2 = r14.f1328Z
            r0.setAdapter(r2)
            androidx.appcompat.widget.f0 r0 = r14.f1329a0
            android.widget.AdapterView$OnItemClickListener r2 = r14.f1342n0
            r0.setOnItemClickListener(r2)
            androidx.appcompat.widget.f0 r0 = r14.f1329a0
            r0.setFocusable(r1)
            androidx.appcompat.widget.f0 r0 = r14.f1329a0
            r0.setFocusableInTouchMode(r1)
            androidx.appcompat.widget.f0 r0 = r14.f1329a0
            androidx.appcompat.widget.i0 r2 = new androidx.appcompat.widget.i0
            r2.<init>(r14)
            r0.setOnItemSelectedListener(r2)
            androidx.appcompat.widget.f0 r0 = r14.f1329a0
            androidx.appcompat.widget.j0$c r2 = r14.f1345q0
            r0.setOnScrollListener(r2)
            androidx.appcompat.widget.f0 r0 = r14.f1329a0
            android.widget.PopupWindow r2 = r14.f1351w0
            r2.setContentView(r0)
            goto L47
        L3f:
            android.widget.PopupWindow r0 = r14.f1351w0
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L47:
            android.widget.PopupWindow r0 = r14.f1351w0
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r2 = 0
            if (r0 == 0) goto L64
            android.graphics.Rect r3 = r14.f1348t0
            r0.getPadding(r3)
            android.graphics.Rect r0 = r14.f1348t0
            int r3 = r0.top
            int r0 = r0.bottom
            int r0 = r0 + r3
            boolean r4 = r14.f1335g0
            if (r4 != 0) goto L6a
            int r3 = -r3
            r14.f1333e0 = r3
            goto L6a
        L64:
            android.graphics.Rect r0 = r14.f1348t0
            r0.setEmpty()
            r0 = 0
        L6a:
            android.widget.PopupWindow r3 = r14.f1351w0
            int r3 = r3.getInputMethodMode()
            r4 = 2
            if (r3 != r4) goto L75
            r3 = 1
            goto L76
        L75:
            r3 = 0
        L76:
            android.view.View r5 = r14.f1341m0
            int r6 = r14.f1333e0
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 23
            java.lang.String r9 = "ListPopupWindow"
            if (r7 > r8) goto Lb0
            java.lang.reflect.Method r7 = androidx.appcompat.widget.C0284j0.f1325y0
            if (r7 == 0) goto La9
            android.widget.PopupWindow r8 = r14.f1351w0     // Catch: java.lang.Exception -> La4
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.Exception -> La4
            r10[r2] = r5     // Catch: java.lang.Exception -> La4
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> La4
            r10[r1] = r11     // Catch: java.lang.Exception -> La4
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> La4
            r10[r4] = r3     // Catch: java.lang.Exception -> La4
            java.lang.Object r3 = r7.invoke(r8, r10)     // Catch: java.lang.Exception -> La4
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> La4
            int r3 = r3.intValue()     // Catch: java.lang.Exception -> La4
            goto Lb6
        La4:
            java.lang.String r3 = "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version."
            android.util.Log.i(r9, r3)
        La9:
            android.widget.PopupWindow r3 = r14.f1351w0
            int r3 = r3.getMaxAvailableHeight(r5, r6)
            goto Lb6
        Lb0:
            android.widget.PopupWindow r7 = r14.f1351w0
            int r3 = r7.getMaxAvailableHeight(r5, r6, r3)
        Lb6:
            int r5 = r14.f1330b0
            r6 = -2
            r7 = -1
            if (r5 != r7) goto Lbe
            int r3 = r3 + r0
            goto L111
        Lbe:
            int r5 = r14.f1331c0
            if (r5 == r6) goto Ldc
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 == r7) goto Lc7
            goto Lf2
        Lc7:
            android.content.Context r5 = r14.f1327Y
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r5 = r5.widthPixels
            android.graphics.Rect r10 = r14.f1348t0
            int r11 = r10.left
            int r10 = r10.right
            int r11 = r11 + r10
            int r5 = r5 - r11
            goto Lf2
        Ldc:
            android.content.Context r5 = r14.f1327Y
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r5 = r5.widthPixels
            android.graphics.Rect r8 = r14.f1348t0
            int r10 = r8.left
            int r8 = r8.right
            int r10 = r10 + r8
            int r5 = r5 - r10
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
        Lf2:
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            androidx.appcompat.widget.f0 r8 = r14.f1329a0
            int r3 = r3 - r2
            int r3 = r8.m720a(r5, r3, r7)
            if (r3 <= 0) goto L10f
            androidx.appcompat.widget.f0 r5 = r14.f1329a0
            int r5 = r5.getPaddingTop()
            androidx.appcompat.widget.f0 r8 = r14.f1329a0
            int r8 = r8.getPaddingBottom()
            int r8 = r8 + r5
            int r8 = r8 + r0
            int r8 = r8 + r2
            goto L110
        L10f:
            r8 = 0
        L110:
            int r3 = r3 + r8
        L111:
            android.widget.PopupWindow r0 = r14.f1351w0
            int r0 = r0.getInputMethodMode()
            if (r0 != r4) goto L11b
            r0 = 1
            goto L11c
        L11b:
            r0 = 0
        L11c:
            android.widget.PopupWindow r4 = r14.f1351w0
            int r5 = r14.f1334f0
            p280q0.C5539f.m11811b(r4, r5)
            android.widget.PopupWindow r4 = r14.f1351w0
            boolean r4 = r4.isShowing()
            if (r4 == 0) goto L190
            android.view.View r4 = r14.f1341m0
            java.util.WeakHashMap<android.view.View, n0.w> r5 = p227n0.C4661t.f18570a
            boolean r4 = p227n0.C4661t.f.m10587b(r4)
            if (r4 != 0) goto L136
            return
        L136:
            int r4 = r14.f1331c0
            if (r4 != r7) goto L13c
            r4 = -1
            goto L144
        L13c:
            if (r4 != r6) goto L144
            android.view.View r4 = r14.f1341m0
            int r4 = r4.getWidth()
        L144:
            int r5 = r14.f1330b0
            if (r5 != r7) goto L170
            if (r0 == 0) goto L14b
            goto L14c
        L14b:
            r3 = -1
        L14c:
            if (r0 == 0) goto L160
            android.widget.PopupWindow r0 = r14.f1351w0
            int r5 = r14.f1331c0
            if (r5 != r7) goto L156
            r5 = -1
            goto L157
        L156:
            r5 = 0
        L157:
            r0.setWidth(r5)
            android.widget.PopupWindow r0 = r14.f1351w0
            r0.setHeight(r2)
            goto L174
        L160:
            android.widget.PopupWindow r0 = r14.f1351w0
            int r5 = r14.f1331c0
            if (r5 != r7) goto L167
            r2 = -1
        L167:
            r0.setWidth(r2)
            android.widget.PopupWindow r0 = r14.f1351w0
            r0.setHeight(r7)
            goto L174
        L170:
            if (r5 != r6) goto L173
            goto L174
        L173:
            r3 = r5
        L174:
            android.widget.PopupWindow r0 = r14.f1351w0
            r0.setOutsideTouchable(r1)
            android.widget.PopupWindow r8 = r14.f1351w0
            android.view.View r9 = r14.f1341m0
            int r10 = r14.f1332d0
            int r11 = r14.f1333e0
            if (r4 >= 0) goto L185
            r12 = -1
            goto L186
        L185:
            r12 = r4
        L186:
            if (r3 >= 0) goto L18a
            r13 = -1
            goto L18b
        L18a:
            r13 = r3
        L18b:
            r8.update(r9, r10, r11, r12, r13)
            goto L23f
        L190:
            int r0 = r14.f1331c0
            if (r0 != r7) goto L196
            r0 = -1
            goto L19e
        L196:
            if (r0 != r6) goto L19e
            android.view.View r0 = r14.f1341m0
            int r0 = r0.getWidth()
        L19e:
            int r4 = r14.f1330b0
            if (r4 != r7) goto L1a4
            r3 = -1
            goto L1a8
        L1a4:
            if (r4 != r6) goto L1a7
            goto L1a8
        L1a7:
            r3 = r4
        L1a8:
            android.widget.PopupWindow r4 = r14.f1351w0
            r4.setWidth(r0)
            android.widget.PopupWindow r0 = r14.f1351w0
            r0.setHeight(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r0 > r3) goto L1ce
            java.lang.reflect.Method r0 = androidx.appcompat.widget.C0284j0.f1324x0
            if (r0 == 0) goto L1d3
            android.widget.PopupWindow r4 = r14.f1351w0     // Catch: java.lang.Exception -> L1c8
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L1c8
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L1c8
            r5[r2] = r6     // Catch: java.lang.Exception -> L1c8
            r0.invoke(r4, r5)     // Catch: java.lang.Exception -> L1c8
            goto L1d3
        L1c8:
            java.lang.String r0 = "Could not call setClipToScreenEnabled() on PopupWindow. Oh well."
            android.util.Log.i(r9, r0)
            goto L1d3
        L1ce:
            android.widget.PopupWindow r0 = r14.f1351w0
            r0.setIsClippedToScreen(r1)
        L1d3:
            android.widget.PopupWindow r0 = r14.f1351w0
            r0.setOutsideTouchable(r1)
            android.widget.PopupWindow r0 = r14.f1351w0
            androidx.appcompat.widget.j0$d r4 = r14.f1344p0
            r0.setTouchInterceptor(r4)
            boolean r0 = r14.f1337i0
            if (r0 == 0) goto L1ea
            android.widget.PopupWindow r0 = r14.f1351w0
            boolean r4 = r14.f1336h0
            p280q0.C5539f.m11810a(r0, r4)
        L1ea:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 > r3) goto L205
            java.lang.reflect.Method r0 = androidx.appcompat.widget.C0284j0.f1326z0
            if (r0 == 0) goto L20c
            android.widget.PopupWindow r3 = r14.f1351w0     // Catch: java.lang.Exception -> L1fe
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L1fe
            android.graphics.Rect r5 = r14.f1349u0     // Catch: java.lang.Exception -> L1fe
            r4[r2] = r5     // Catch: java.lang.Exception -> L1fe
            r0.invoke(r3, r4)     // Catch: java.lang.Exception -> L1fe
            goto L20c
        L1fe:
            r0 = move-exception
            java.lang.String r2 = "Could not invoke setEpicenterBounds on PopupWindow"
            android.util.Log.e(r9, r2, r0)
            goto L20c
        L205:
            android.widget.PopupWindow r0 = r14.f1351w0
            android.graphics.Rect r2 = r14.f1349u0
            r0.setEpicenterBounds(r2)
        L20c:
            android.widget.PopupWindow r0 = r14.f1351w0
            android.view.View r2 = r14.f1341m0
            int r3 = r14.f1332d0
            int r4 = r14.f1333e0
            int r5 = r14.f1338j0
            p280q0.C5539f.a.m11812a(r0, r2, r3, r4, r5)
            androidx.appcompat.widget.f0 r0 = r14.f1329a0
            r0.setSelection(r7)
            boolean r0 = r14.f1350v0
            if (r0 == 0) goto L22a
            androidx.appcompat.widget.f0 r0 = r14.f1329a0
            boolean r0 = r0.isInTouchMode()
            if (r0 == 0) goto L234
        L22a:
            androidx.appcompat.widget.f0 r0 = r14.f1329a0
            if (r0 == 0) goto L234
            r0.setListSelectionHidden(r1)
            r0.requestLayout()
        L234:
            boolean r0 = r14.f1350v0
            if (r0 != 0) goto L23f
            android.os.Handler r0 = r14.f1347s0
            androidx.appcompat.widget.j0$a r1 = r14.f1346r0
            r0.post(r1)
        L23f:
            return
    }

    @Override // p194l.InterfaceC4155f
    public void dismiss() {
            r2 = this;
            android.widget.PopupWindow r0 = r2.f1351w0
            r0.dismiss()
            android.widget.PopupWindow r0 = r2.f1351w0
            r1 = 0
            r0.setContentView(r1)
            r2.f1329a0 = r1
            android.os.Handler r0 = r2.f1347s0
            androidx.appcompat.widget.j0$e r1 = r2.f1343o0
            r0.removeCallbacks(r1)
            return
    }

    /* renamed from: f */
    public android.graphics.drawable.Drawable m733f() {
            r1 = this;
            android.widget.PopupWindow r0 = r1.f1351w0
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            return r0
    }

    @Override // p194l.InterfaceC4155f
    /* renamed from: g */
    public android.widget.ListView mo477g() {
            r1 = this;
            androidx.appcompat.widget.f0 r0 = r1.f1329a0
            return r0
    }

    /* renamed from: i */
    public void m734i(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.widget.PopupWindow r0 = r1.f1351w0
            r0.setBackgroundDrawable(r2)
            return
    }

    /* renamed from: j */
    public void m735j(int r1) {
            r0 = this;
            r0.f1333e0 = r1
            r1 = 1
            r0.f1335g0 = r1
            return
    }

    /* renamed from: l */
    public void m736l(int r1) {
            r0 = this;
            r0.f1332d0 = r1
            return
    }

    /* renamed from: n */
    public int m737n() {
            r1 = this;
            boolean r0 = r1.f1335g0
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r1.f1333e0
            return r0
    }

    /* renamed from: p */
    public void mo738p(android.widget.ListAdapter r3) {
            r2 = this;
            android.database.DataSetObserver r0 = r2.f1340l0
            if (r0 != 0) goto Lc
            androidx.appcompat.widget.j0$b r0 = new androidx.appcompat.widget.j0$b
            r0.<init>(r2)
            r2.f1340l0 = r0
            goto L13
        Lc:
            android.widget.ListAdapter r1 = r2.f1328Z
            if (r1 == 0) goto L13
            r1.unregisterDataSetObserver(r0)
        L13:
            r2.f1328Z = r3
            if (r3 == 0) goto L1c
            android.database.DataSetObserver r0 = r2.f1340l0
            r3.registerDataSetObserver(r0)
        L1c:
            androidx.appcompat.widget.f0 r3 = r2.f1329a0
            if (r3 == 0) goto L25
            android.widget.ListAdapter r0 = r2.f1328Z
            r3.setAdapter(r0)
        L25:
            return
    }

    /* renamed from: q */
    public androidx.appcompat.widget.C0274f0 mo739q(android.content.Context r2, boolean r3) {
            r1 = this;
            androidx.appcompat.widget.f0 r0 = new androidx.appcompat.widget.f0
            r0.<init>(r2, r3)
            return r0
    }

    /* renamed from: r */
    public void m740r(int r3) {
            r2 = this;
            android.widget.PopupWindow r0 = r2.f1351w0
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L18
            android.graphics.Rect r1 = r2.f1348t0
            r0.getPadding(r1)
            android.graphics.Rect r0 = r2.f1348t0
            int r1 = r0.left
            int r0 = r0.right
            int r1 = r1 + r0
            int r1 = r1 + r3
            r2.f1331c0 = r1
            goto L1a
        L18:
            r2.f1331c0 = r3
        L1a:
            return
    }

    /* renamed from: s */
    public void m741s(boolean r2) {
            r1 = this;
            r1.f1350v0 = r2
            android.widget.PopupWindow r0 = r1.f1351w0
            r0.setFocusable(r2)
            return
    }
}
