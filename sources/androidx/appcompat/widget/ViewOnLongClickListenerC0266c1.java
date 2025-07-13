package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.c1 */
/* loaded from: classes.dex */
public class ViewOnLongClickListenerC0266c1 implements android.view.View.OnLongClickListener, android.view.View.OnHoverListener, android.view.View.OnAttachStateChangeListener {

    /* renamed from: h0 */
    public static androidx.appcompat.widget.ViewOnLongClickListenerC0266c1 f1249h0;

    /* renamed from: i0 */
    public static androidx.appcompat.widget.ViewOnLongClickListenerC0266c1 f1250i0;

    /* renamed from: Y */
    public final android.view.View f1251Y;

    /* renamed from: Z */
    public final java.lang.CharSequence f1252Z;

    /* renamed from: a0 */
    public final int f1253a0;

    /* renamed from: b0 */
    public final java.lang.Runnable f1254b0;

    /* renamed from: c0 */
    public final java.lang.Runnable f1255c0;

    /* renamed from: d0 */
    public int f1256d0;

    /* renamed from: e0 */
    public int f1257e0;

    /* renamed from: f0 */
    public androidx.appcompat.widget.C0269d1 f1258f0;

    /* renamed from: g0 */
    public boolean f1259g0;

    /* renamed from: androidx.appcompat.widget.c1$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.widget.ViewOnLongClickListenerC0266c1 f1260Y;

        public a(androidx.appcompat.widget.ViewOnLongClickListenerC0266c1 r1) {
                r0 = this;
                r0.f1260Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.appcompat.widget.c1 r0 = r2.f1260Y
                r1 = 0
                r0.m704d(r1)
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.c1$b */
    public class b implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.widget.ViewOnLongClickListenerC0266c1 f1261Y;

        public b(androidx.appcompat.widget.ViewOnLongClickListenerC0266c1 r1) {
                r0 = this;
                r0.f1261Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                androidx.appcompat.widget.c1 r0 = r1.f1261Y
                r0.m703b()
                return
        }
    }

    public ViewOnLongClickListenerC0266c1(android.view.View r3, java.lang.CharSequence r4) {
            r2 = this;
            r2.<init>()
            androidx.appcompat.widget.c1$a r0 = new androidx.appcompat.widget.c1$a
            r0.<init>(r2)
            r2.f1254b0 = r0
            androidx.appcompat.widget.c1$b r0 = new androidx.appcompat.widget.c1$b
            r0.<init>(r2)
            r2.f1255c0 = r0
            r2.f1251Y = r3
            r2.f1252Z = r4
            android.content.Context r4 = r3.getContext()
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            java.lang.reflect.Method r0 = p227n0.C4663v.f18589a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L2a
            int r4 = r4.getScaledHoverSlop()
            goto L30
        L2a:
            int r4 = r4.getScaledTouchSlop()
            int r4 = r4 / 2
        L30:
            r2.f1253a0 = r4
            r2.m702a()
            r3.setOnLongClickListener(r2)
            r3.setOnHoverListener(r2)
            return
    }

    /* renamed from: c */
    public static void m701c(androidx.appcompat.widget.ViewOnLongClickListenerC0266c1 r3) {
            androidx.appcompat.widget.c1 r0 = androidx.appcompat.widget.ViewOnLongClickListenerC0266c1.f1249h0
            if (r0 == 0) goto Lb
            android.view.View r1 = r0.f1251Y
            java.lang.Runnable r0 = r0.f1254b0
            r1.removeCallbacks(r0)
        Lb:
            androidx.appcompat.widget.ViewOnLongClickListenerC0266c1.f1249h0 = r3
            if (r3 == 0) goto L1b
            android.view.View r0 = r3.f1251Y
            java.lang.Runnable r3 = r3.f1254b0
            int r1 = android.view.ViewConfiguration.getLongPressTimeout()
            long r1 = (long) r1
            r0.postDelayed(r3, r1)
        L1b:
            return
    }

    /* renamed from: a */
    public final void m702a() {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.f1256d0 = r0
            r1.f1257e0 = r0
            return
    }

    /* renamed from: b */
    public void m703b() {
            r3 = this;
            androidx.appcompat.widget.c1 r0 = androidx.appcompat.widget.ViewOnLongClickListenerC0266c1.f1250i0
            r1 = 0
            if (r0 != r3) goto L20
            androidx.appcompat.widget.ViewOnLongClickListenerC0266c1.f1250i0 = r1
            androidx.appcompat.widget.d1 r0 = r3.f1258f0
            if (r0 == 0) goto L19
            r0.m706a()
            r3.f1258f0 = r1
            r3.m702a()
            android.view.View r0 = r3.f1251Y
            r0.removeOnAttachStateChangeListener(r3)
            goto L20
        L19:
            java.lang.String r0 = "TooltipCompatHandler"
            java.lang.String r2 = "sActiveHandler.mPopup == null"
            android.util.Log.e(r0, r2)
        L20:
            androidx.appcompat.widget.c1 r0 = androidx.appcompat.widget.ViewOnLongClickListenerC0266c1.f1249h0
            if (r0 != r3) goto L27
            m701c(r1)
        L27:
            android.view.View r0 = r3.f1251Y
            java.lang.Runnable r1 = r3.f1255c0
            r0.removeCallbacks(r1)
            return
    }

    /* renamed from: d */
    public void m704d(boolean r17) {
            r16 = this;
            r0 = r16
            android.view.View r1 = r0.f1251Y
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            boolean r1 = p227n0.C4661t.f.m10587b(r1)
            if (r1 != 0) goto Ld
            return
        Ld:
            r1 = 0
            m701c(r1)
            androidx.appcompat.widget.c1 r1 = androidx.appcompat.widget.ViewOnLongClickListenerC0266c1.f1250i0
            if (r1 == 0) goto L18
            r1.m703b()
        L18:
            androidx.appcompat.widget.ViewOnLongClickListenerC0266c1.f1250i0 = r0
            r1 = r17
            r0.f1259g0 = r1
            androidx.appcompat.widget.d1 r1 = new androidx.appcompat.widget.d1
            android.view.View r2 = r0.f1251Y
            android.content.Context r2 = r2.getContext()
            r1.<init>(r2)
            r0.f1258f0 = r1
            android.view.View r2 = r0.f1251Y
            int r3 = r0.f1256d0
            int r4 = r0.f1257e0
            boolean r5 = r0.f1259g0
            java.lang.CharSequence r6 = r0.f1252Z
            android.view.View r7 = r1.f1263b
            android.view.ViewParent r7 = r7.getParent()
            r8 = 0
            r9 = 1
            if (r7 == 0) goto L41
            r7 = 1
            goto L42
        L41:
            r7 = 0
        L42:
            if (r7 == 0) goto L47
            r1.m706a()
        L47:
            android.widget.TextView r7 = r1.f1264c
            r7.setText(r6)
            android.view.WindowManager$LayoutParams r6 = r1.f1265d
            android.os.IBinder r7 = r2.getApplicationWindowToken()
            r6.token = r7
            android.content.Context r7 = r1.f1262a
            android.content.res.Resources r7 = r7.getResources()
            r10 = 2131165712(0x7f070210, float:1.7945649E38)
            int r7 = r7.getDimensionPixelOffset(r10)
            int r10 = r2.getWidth()
            r11 = 2
            if (r10 < r7) goto L69
            goto L6e
        L69:
            int r3 = r2.getWidth()
            int r3 = r3 / r11
        L6e:
            int r10 = r2.getHeight()
            if (r10 < r7) goto L85
            android.content.Context r7 = r1.f1262a
            android.content.res.Resources r7 = r7.getResources()
            r10 = 2131165711(0x7f07020f, float:1.7945647E38)
            int r7 = r7.getDimensionPixelOffset(r10)
            int r10 = r4 + r7
            int r4 = r4 - r7
            goto L8a
        L85:
            int r10 = r2.getHeight()
            r4 = 0
        L8a:
            r7 = 49
            r6.gravity = r7
            android.content.Context r7 = r1.f1262a
            android.content.res.Resources r7 = r7.getResources()
            if (r5 == 0) goto L9a
            r12 = 2131165715(0x7f070213, float:1.7945655E38)
            goto L9d
        L9a:
            r12 = 2131165714(0x7f070212, float:1.7945653E38)
        L9d:
            int r7 = r7.getDimensionPixelOffset(r12)
            android.view.View r12 = r2.getRootView()
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            boolean r14 = r13 instanceof android.view.WindowManager.LayoutParams
            if (r14 == 0) goto Lb4
            android.view.WindowManager$LayoutParams r13 = (android.view.WindowManager.LayoutParams) r13
            int r13 = r13.type
            if (r13 != r11) goto Lb4
            goto Ld2
        Lb4:
            android.content.Context r13 = r2.getContext()
        Lb8:
            boolean r14 = r13 instanceof android.content.ContextWrapper
            if (r14 == 0) goto Ld2
            boolean r14 = r13 instanceof android.app.Activity
            if (r14 == 0) goto Lcb
            android.app.Activity r13 = (android.app.Activity) r13
            android.view.Window r12 = r13.getWindow()
            android.view.View r12 = r12.getDecorView()
            goto Ld2
        Lcb:
            android.content.ContextWrapper r13 = (android.content.ContextWrapper) r13
            android.content.Context r13 = r13.getBaseContext()
            goto Lb8
        Ld2:
            if (r12 != 0) goto Ldd
            java.lang.String r2 = "TooltipPopup"
            java.lang.String r3 = "Cannot find app view"
            android.util.Log.e(r2, r3)
            goto L166
        Ldd:
            android.graphics.Rect r13 = r1.f1266e
            r12.getWindowVisibleDisplayFrame(r13)
            android.graphics.Rect r13 = r1.f1266e
            int r14 = r13.left
            if (r14 >= 0) goto L111
            int r13 = r13.top
            if (r13 >= 0) goto L111
            android.content.Context r13 = r1.f1262a
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r14 = "status_bar_height"
            java.lang.String r15 = "dimen"
            java.lang.String r11 = "android"
            int r11 = r13.getIdentifier(r14, r15, r11)
            if (r11 == 0) goto L103
            int r11 = r13.getDimensionPixelSize(r11)
            goto L104
        L103:
            r11 = 0
        L104:
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            android.graphics.Rect r14 = r1.f1266e
            int r15 = r13.widthPixels
            int r13 = r13.heightPixels
            r14.set(r8, r11, r15, r13)
        L111:
            int[] r11 = r1.f1268g
            r12.getLocationOnScreen(r11)
            int[] r11 = r1.f1267f
            r2.getLocationOnScreen(r11)
            int[] r2 = r1.f1267f
            r11 = r2[r8]
            int[] r13 = r1.f1268g
            r14 = r13[r8]
            int r11 = r11 - r14
            r2[r8] = r11
            r11 = r2[r9]
            r13 = r13[r9]
            int r11 = r11 - r13
            r2[r9] = r11
            r2 = r2[r8]
            int r2 = r2 + r3
            int r3 = r12.getWidth()
            r11 = 2
            int r3 = r3 / r11
            int r2 = r2 - r3
            r6.x = r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r8)
            android.view.View r3 = r1.f1263b
            r3.measure(r2, r2)
            android.view.View r2 = r1.f1263b
            int r2 = r2.getMeasuredHeight()
            int[] r3 = r1.f1267f
            r8 = r3[r9]
            int r8 = r8 + r4
            int r8 = r8 - r7
            int r8 = r8 - r2
            r3 = r3[r9]
            int r3 = r3 + r10
            int r3 = r3 + r7
            if (r5 == 0) goto L158
            if (r8 < 0) goto L161
            goto L164
        L158:
            int r2 = r2 + r3
            android.graphics.Rect r4 = r1.f1266e
            int r4 = r4.height()
            if (r2 > r4) goto L164
        L161:
            r6.y = r3
            goto L166
        L164:
            r6.y = r8
        L166:
            android.content.Context r2 = r1.f1262a
            java.lang.String r3 = "window"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            android.view.View r3 = r1.f1263b
            android.view.WindowManager$LayoutParams r1 = r1.f1265d
            r2.addView(r3, r1)
            android.view.View r1 = r0.f1251Y
            r1.addOnAttachStateChangeListener(r0)
            boolean r1 = r0.f1259g0
            if (r1 == 0) goto L183
            r1 = 2500(0x9c4, double:1.235E-320)
            goto L197
        L183:
            android.view.View r1 = r0.f1251Y
            int r1 = p227n0.C4661t.c.m10559g(r1)
            r1 = r1 & r9
            if (r1 != r9) goto L18f
            r1 = 3000(0xbb8, double:1.482E-320)
            goto L191
        L18f:
            r1 = 15000(0x3a98, double:7.411E-320)
        L191:
            int r3 = android.view.ViewConfiguration.getLongPressTimeout()
            long r3 = (long) r3
            long r1 = r1 - r3
        L197:
            android.view.View r3 = r0.f1251Y
            java.lang.Runnable r4 = r0.f1255c0
            r3.removeCallbacks(r4)
            android.view.View r3 = r0.f1251Y
            java.lang.Runnable r4 = r0.f1255c0
            r3.postDelayed(r4, r1)
            return
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
            r3 = this;
            androidx.appcompat.widget.d1 r4 = r3.f1258f0
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.f1259g0
            if (r4 == 0) goto La
            return r0
        La:
            android.view.View r4 = r3.f1251Y
            android.content.Context r4 = r4.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r4 = r4.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r4 = (android.view.accessibility.AccessibilityManager) r4
            boolean r1 = r4.isEnabled()
            if (r1 == 0) goto L25
            boolean r4 = r4.isTouchExplorationEnabled()
            if (r4 == 0) goto L25
            return r0
        L25:
            int r4 = r5.getAction()
            r1 = 7
            if (r4 == r1) goto L38
            r5 = 10
            if (r4 == r5) goto L31
            goto L72
        L31:
            r3.m702a()
            r3.m703b()
            goto L72
        L38:
            android.view.View r4 = r3.f1251Y
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L72
            androidx.appcompat.widget.d1 r4 = r3.f1258f0
            if (r4 != 0) goto L72
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            int r1 = r3.f1256d0
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f1253a0
            if (r1 > r2) goto L68
            int r1 = r3.f1257e0
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f1253a0
            if (r1 > r2) goto L68
            r4 = 0
            goto L6d
        L68:
            r3.f1256d0 = r4
            r3.f1257e0 = r5
            r4 = 1
        L6d:
            if (r4 == 0) goto L72
            m701c(r3)
        L72:
            return r0
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View r2) {
            r1 = this;
            int r0 = r2.getWidth()
            int r0 = r0 / 2
            r1.f1256d0 = r0
            int r2 = r2.getHeight()
            int r2 = r2 / 2
            r1.f1257e0 = r2
            r2 = 1
            r1.m704d(r2)
            return r2
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            r0.m703b()
            return
    }
}
