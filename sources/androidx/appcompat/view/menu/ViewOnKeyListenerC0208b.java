package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.b */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0208b extends p194l.AbstractC4153d implements android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener {

    /* renamed from: Z */
    public final android.content.Context f757Z;

    /* renamed from: a0 */
    public final int f758a0;

    /* renamed from: b0 */
    public final int f759b0;

    /* renamed from: c0 */
    public final int f760c0;

    /* renamed from: d0 */
    public final boolean f761d0;

    /* renamed from: e0 */
    public final android.os.Handler f762e0;

    /* renamed from: f0 */
    public final java.util.List<androidx.appcompat.view.menu.C0211e> f763f0;

    /* renamed from: g0 */
    public final java.util.List<androidx.appcompat.view.menu.ViewOnKeyListenerC0208b.d> f764g0;

    /* renamed from: h0 */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f765h0;

    /* renamed from: i0 */
    public final android.view.View.OnAttachStateChangeListener f766i0;

    /* renamed from: j0 */
    public final androidx.appcompat.widget.InterfaceC0286k0 f767j0;

    /* renamed from: k0 */
    public int f768k0;

    /* renamed from: l0 */
    public int f769l0;

    /* renamed from: m0 */
    public android.view.View f770m0;

    /* renamed from: n0 */
    public android.view.View f771n0;

    /* renamed from: o0 */
    public int f772o0;

    /* renamed from: p0 */
    public boolean f773p0;

    /* renamed from: q0 */
    public boolean f774q0;

    /* renamed from: r0 */
    public int f775r0;

    /* renamed from: s0 */
    public int f776s0;

    /* renamed from: t0 */
    public boolean f777t0;

    /* renamed from: u0 */
    public boolean f778u0;

    /* renamed from: v0 */
    public androidx.appcompat.view.menu.InterfaceC0215i.a f779v0;

    /* renamed from: w0 */
    public android.view.ViewTreeObserver f780w0;

    /* renamed from: x0 */
    public android.widget.PopupWindow.OnDismissListener f781x0;

    /* renamed from: y0 */
    public boolean f782y0;

    /* renamed from: androidx.appcompat.view.menu.b$a */
    public class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.view.menu.ViewOnKeyListenerC0208b f783Y;

        public a(androidx.appcompat.view.menu.ViewOnKeyListenerC0208b r1) {
                r0 = this;
                r0.f783Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
                r2 = this;
                androidx.appcompat.view.menu.b r0 = r2.f783Y
                boolean r0 = r0.mo473b()
                if (r0 == 0) goto L4f
                androidx.appcompat.view.menu.b r0 = r2.f783Y
                java.util.List<androidx.appcompat.view.menu.b$d> r0 = r0.f764g0
                int r0 = r0.size()
                if (r0 <= 0) goto L4f
                androidx.appcompat.view.menu.b r0 = r2.f783Y
                java.util.List<androidx.appcompat.view.menu.b$d> r0 = r0.f764g0
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                androidx.appcompat.view.menu.b$d r0 = (androidx.appcompat.view.menu.ViewOnKeyListenerC0208b.d) r0
                androidx.appcompat.widget.l0 r0 = r0.f790a
                boolean r0 = r0.f1350v0
                if (r0 != 0) goto L4f
                androidx.appcompat.view.menu.b r0 = r2.f783Y
                android.view.View r0 = r0.f771n0
                if (r0 == 0) goto L4a
                boolean r0 = r0.isShown()
                if (r0 != 0) goto L30
                goto L4a
            L30:
                androidx.appcompat.view.menu.b r0 = r2.f783Y
                java.util.List<androidx.appcompat.view.menu.b$d> r0 = r0.f764g0
                java.util.Iterator r0 = r0.iterator()
            L38:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L4f
                java.lang.Object r1 = r0.next()
                androidx.appcompat.view.menu.b$d r1 = (androidx.appcompat.view.menu.ViewOnKeyListenerC0208b.d) r1
                androidx.appcompat.widget.l0 r1 = r1.f790a
                r1.mo475d()
                goto L38
            L4a:
                androidx.appcompat.view.menu.b r0 = r2.f783Y
                r0.dismiss()
            L4f:
                return
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b */
    public class b implements android.view.View.OnAttachStateChangeListener {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.view.menu.ViewOnKeyListenerC0208b f784Y;

        public b(androidx.appcompat.view.menu.ViewOnKeyListenerC0208b r1) {
                r0 = this;
                r0.f784Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View r1) {
                r0 = this;
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View r3) {
                r2 = this;
                androidx.appcompat.view.menu.b r0 = r2.f784Y
                android.view.ViewTreeObserver r0 = r0.f780w0
                if (r0 == 0) goto L1d
                boolean r0 = r0.isAlive()
                if (r0 != 0) goto L14
                androidx.appcompat.view.menu.b r0 = r2.f784Y
                android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
                r0.f780w0 = r1
            L14:
                androidx.appcompat.view.menu.b r0 = r2.f784Y
                android.view.ViewTreeObserver r1 = r0.f780w0
                android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r0.f765h0
                r1.removeGlobalOnLayoutListener(r0)
            L1d:
                r3.removeOnAttachStateChangeListener(r2)
                return
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$c */
    public class c implements androidx.appcompat.widget.InterfaceC0286k0 {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.view.menu.ViewOnKeyListenerC0208b f785Y;

        /* renamed from: androidx.appcompat.view.menu.b$c$a */
        public class a implements java.lang.Runnable {

            /* renamed from: Y */
            public final /* synthetic */ androidx.appcompat.view.menu.ViewOnKeyListenerC0208b.d f786Y;

            /* renamed from: Z */
            public final /* synthetic */ android.view.MenuItem f787Z;

            /* renamed from: a0 */
            public final /* synthetic */ androidx.appcompat.view.menu.C0211e f788a0;

            /* renamed from: b0 */
            public final /* synthetic */ androidx.appcompat.view.menu.ViewOnKeyListenerC0208b.c f789b0;

            public a(androidx.appcompat.view.menu.ViewOnKeyListenerC0208b.c r1, androidx.appcompat.view.menu.ViewOnKeyListenerC0208b.d r2, android.view.MenuItem r3, androidx.appcompat.view.menu.C0211e r4) {
                    r0 = this;
                    r0.f789b0 = r1
                    r0.f786Y = r2
                    r0.f787Z = r3
                    r0.f788a0 = r4
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r3 = this;
                    androidx.appcompat.view.menu.b$d r0 = r3.f786Y
                    if (r0 == 0) goto L17
                    androidx.appcompat.view.menu.b$c r1 = r3.f789b0
                    androidx.appcompat.view.menu.b r1 = r1.f785Y
                    r2 = 1
                    r1.f782y0 = r2
                    androidx.appcompat.view.menu.e r0 = r0.f791b
                    r1 = 0
                    r0.m500c(r1)
                    androidx.appcompat.view.menu.b$c r0 = r3.f789b0
                    androidx.appcompat.view.menu.b r0 = r0.f785Y
                    r0.f782y0 = r1
                L17:
                    android.view.MenuItem r0 = r3.f787Z
                    boolean r0 = r0.isEnabled()
                    if (r0 == 0) goto L2f
                    android.view.MenuItem r0 = r3.f787Z
                    boolean r0 = r0.hasSubMenu()
                    if (r0 == 0) goto L2f
                    androidx.appcompat.view.menu.e r0 = r3.f788a0
                    android.view.MenuItem r1 = r3.f787Z
                    r2 = 4
                    r0.m514q(r1, r2)
                L2f:
                    return
            }
        }

        public c(androidx.appcompat.view.menu.ViewOnKeyListenerC0208b r1) {
                r0 = this;
                r0.f785Y = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.InterfaceC0286k0
        /* renamed from: a */
        public void mo490a(androidx.appcompat.view.menu.C0211e r6, android.view.MenuItem r7) {
                r5 = this;
                androidx.appcompat.view.menu.b r0 = r5.f785Y
                android.os.Handler r0 = r0.f762e0
                r1 = 0
                r0.removeCallbacksAndMessages(r1)
                androidx.appcompat.view.menu.b r0 = r5.f785Y
                java.util.List<androidx.appcompat.view.menu.b$d> r0 = r0.f764g0
                int r0 = r0.size()
                r2 = 0
            L11:
                r3 = -1
                if (r2 >= r0) goto L26
                androidx.appcompat.view.menu.b r4 = r5.f785Y
                java.util.List<androidx.appcompat.view.menu.b$d> r4 = r4.f764g0
                java.lang.Object r4 = r4.get(r2)
                androidx.appcompat.view.menu.b$d r4 = (androidx.appcompat.view.menu.ViewOnKeyListenerC0208b.d) r4
                androidx.appcompat.view.menu.e r4 = r4.f791b
                if (r6 != r4) goto L23
                goto L27
            L23:
                int r2 = r2 + 1
                goto L11
            L26:
                r2 = -1
            L27:
                if (r2 != r3) goto L2a
                return
            L2a:
                int r2 = r2 + 1
                androidx.appcompat.view.menu.b r0 = r5.f785Y
                java.util.List<androidx.appcompat.view.menu.b$d> r0 = r0.f764g0
                int r0 = r0.size()
                if (r2 >= r0) goto L41
                androidx.appcompat.view.menu.b r0 = r5.f785Y
                java.util.List<androidx.appcompat.view.menu.b$d> r0 = r0.f764g0
                java.lang.Object r0 = r0.get(r2)
                r1 = r0
                androidx.appcompat.view.menu.b$d r1 = (androidx.appcompat.view.menu.ViewOnKeyListenerC0208b.d) r1
            L41:
                androidx.appcompat.view.menu.b$c$a r0 = new androidx.appcompat.view.menu.b$c$a
                r0.<init>(r5, r1, r7, r6)
                long r1 = android.os.SystemClock.uptimeMillis()
                r3 = 200(0xc8, double:9.9E-322)
                long r1 = r1 + r3
                androidx.appcompat.view.menu.b r7 = r5.f785Y
                android.os.Handler r7 = r7.f762e0
                r7.postAtTime(r0, r6, r1)
                return
        }

        @Override // androidx.appcompat.widget.InterfaceC0286k0
        /* renamed from: e */
        public void mo491e(androidx.appcompat.view.menu.C0211e r1, android.view.MenuItem r2) {
                r0 = this;
                androidx.appcompat.view.menu.b r2 = r0.f785Y
                android.os.Handler r2 = r2.f762e0
                r2.removeCallbacksAndMessages(r1)
                return
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$d */
    public static class d {

        /* renamed from: a */
        public final androidx.appcompat.widget.C0288l0 f790a;

        /* renamed from: b */
        public final androidx.appcompat.view.menu.C0211e f791b;

        /* renamed from: c */
        public final int f792c;

        public d(androidx.appcompat.widget.C0288l0 r1, androidx.appcompat.view.menu.C0211e r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.f790a = r1
                r0.f791b = r2
                r0.f792c = r3
                return
        }
    }

    public ViewOnKeyListenerC0208b(android.content.Context r2, android.view.View r3, int r4, int r5, boolean r6) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f763f0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f764g0 = r0
            androidx.appcompat.view.menu.b$a r0 = new androidx.appcompat.view.menu.b$a
            r0.<init>(r1)
            r1.f765h0 = r0
            androidx.appcompat.view.menu.b$b r0 = new androidx.appcompat.view.menu.b$b
            r0.<init>(r1)
            r1.f766i0 = r0
            androidx.appcompat.view.menu.b$c r0 = new androidx.appcompat.view.menu.b$c
            r0.<init>(r1)
            r1.f767j0 = r0
            r0 = 0
            r1.f768k0 = r0
            r1.f769l0 = r0
            r1.f757Z = r2
            r1.f770m0 = r3
            r1.f759b0 = r4
            r1.f760c0 = r5
            r1.f761d0 = r6
            r1.f777t0 = r0
            java.util.WeakHashMap<android.view.View, n0.w> r4 = p227n0.C4661t.f18570a
            int r3 = p227n0.C4661t.d.m10575d(r3)
            r4 = 1
            if (r3 != r4) goto L41
            goto L42
        L41:
            r0 = 1
        L42:
            r1.f772o0 = r0
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r3 = r2.getDisplayMetrics()
            int r3 = r3.widthPixels
            int r3 = r3 / 2
            r4 = 2131165207(0x7f070017, float:1.7944625E38)
            int r2 = r2.getDimensionPixelSize(r4)
            int r2 = java.lang.Math.max(r3, r2)
            r1.f758a0 = r2
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            r1.f762e0 = r2
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: A */
    public void mo468A(androidx.appcompat.view.menu.InterfaceC0215i.a r1) {
            r0 = this;
            r0.f779v0 = r1
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: a */
    public void mo472a(androidx.appcompat.view.menu.C0211e r7, boolean r8) {
            r6 = this;
            java.util.List<androidx.appcompat.view.menu.b$d> r0 = r6.f764g0
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L1a
            java.util.List<androidx.appcompat.view.menu.b$d> r3 = r6.f764g0
            java.lang.Object r3 = r3.get(r2)
            androidx.appcompat.view.menu.b$d r3 = (androidx.appcompat.view.menu.ViewOnKeyListenerC0208b.d) r3
            androidx.appcompat.view.menu.e r3 = r3.f791b
            if (r7 != r3) goto L17
            goto L1b
        L17:
            int r2 = r2 + 1
            goto L8
        L1a:
            r2 = -1
        L1b:
            if (r2 >= 0) goto L1e
            return
        L1e:
            int r0 = r2 + 1
            java.util.List<androidx.appcompat.view.menu.b$d> r3 = r6.f764g0
            int r3 = r3.size()
            if (r0 >= r3) goto L35
            java.util.List<androidx.appcompat.view.menu.b$d> r3 = r6.f764g0
            java.lang.Object r0 = r3.get(r0)
            androidx.appcompat.view.menu.b$d r0 = (androidx.appcompat.view.menu.ViewOnKeyListenerC0208b.d) r0
            androidx.appcompat.view.menu.e r0 = r0.f791b
            r0.m500c(r1)
        L35:
            java.util.List<androidx.appcompat.view.menu.b$d> r0 = r6.f764g0
            java.lang.Object r0 = r0.remove(r2)
            androidx.appcompat.view.menu.b$d r0 = (androidx.appcompat.view.menu.ViewOnKeyListenerC0208b.d) r0
            androidx.appcompat.view.menu.e r2 = r0.f791b
            r2.m517t(r6)
            boolean r2 = r6.f782y0
            r3 = 0
            if (r2 == 0) goto L5e
            androidx.appcompat.widget.l0 r2 = r0.f790a
            java.util.Objects.requireNonNull(r2)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 < r5) goto L57
            android.widget.PopupWindow r2 = r2.f1351w0
            r2.setExitTransition(r3)
        L57:
            androidx.appcompat.widget.l0 r2 = r0.f790a
            android.widget.PopupWindow r2 = r2.f1351w0
            r2.setAnimationStyle(r1)
        L5e:
            androidx.appcompat.widget.l0 r0 = r0.f790a
            r0.dismiss()
            java.util.List<androidx.appcompat.view.menu.b$d> r0 = r6.f764g0
            int r0 = r0.size()
            r2 = 1
            if (r0 <= 0) goto L79
            java.util.List<androidx.appcompat.view.menu.b$d> r4 = r6.f764g0
            int r5 = r0 + (-1)
            java.lang.Object r4 = r4.get(r5)
            androidx.appcompat.view.menu.b$d r4 = (androidx.appcompat.view.menu.ViewOnKeyListenerC0208b.d) r4
            int r4 = r4.f792c
            goto L86
        L79:
            android.view.View r4 = r6.f770m0
            java.util.WeakHashMap<android.view.View, n0.w> r5 = p227n0.C4661t.f18570a
            int r4 = p227n0.C4661t.d.m10575d(r4)
            if (r4 != r2) goto L85
            r4 = 0
            goto L86
        L85:
            r4 = 1
        L86:
            r6.f772o0 = r4
            if (r0 != 0) goto Lb4
            r6.dismiss()
            androidx.appcompat.view.menu.i$a r8 = r6.f779v0
            if (r8 == 0) goto L94
            r8.mo525a(r7, r2)
        L94:
            android.view.ViewTreeObserver r7 = r6.f780w0
            if (r7 == 0) goto La7
            boolean r7 = r7.isAlive()
            if (r7 == 0) goto La5
            android.view.ViewTreeObserver r7 = r6.f780w0
            android.view.ViewTreeObserver$OnGlobalLayoutListener r8 = r6.f765h0
            r7.removeGlobalOnLayoutListener(r8)
        La5:
            r6.f780w0 = r3
        La7:
            android.view.View r7 = r6.f771n0
            android.view.View$OnAttachStateChangeListener r8 = r6.f766i0
            r7.removeOnAttachStateChangeListener(r8)
            android.widget.PopupWindow$OnDismissListener r7 = r6.f781x0
            r7.onDismiss()
            goto Lc3
        Lb4:
            if (r8 == 0) goto Lc3
            java.util.List<androidx.appcompat.view.menu.b$d> r7 = r6.f764g0
            java.lang.Object r7 = r7.get(r1)
            androidx.appcompat.view.menu.b$d r7 = (androidx.appcompat.view.menu.ViewOnKeyListenerC0208b.d) r7
            androidx.appcompat.view.menu.e r7 = r7.f791b
            r7.m500c(r1)
        Lc3:
            return
    }

    @Override // p194l.InterfaceC4155f
    /* renamed from: b */
    public boolean mo473b() {
            r2 = this;
            java.util.List<androidx.appcompat.view.menu.b$d> r0 = r2.f764g0
            int r0 = r0.size()
            r1 = 0
            if (r0 <= 0) goto L1a
            java.util.List<androidx.appcompat.view.menu.b$d> r0 = r2.f764g0
            java.lang.Object r0 = r0.get(r1)
            androidx.appcompat.view.menu.b$d r0 = (androidx.appcompat.view.menu.ViewOnKeyListenerC0208b.d) r0
            androidx.appcompat.widget.l0 r0 = r0.f790a
            boolean r0 = r0.mo473b()
            if (r0 == 0) goto L1a
            r1 = 1
        L1a:
            return r1
    }

    @Override // p194l.AbstractC4153d
    /* renamed from: c */
    public void mo474c(androidx.appcompat.view.menu.C0211e r2) {
            r1 = this;
            android.content.Context r0 = r1.f757Z
            r2.m499b(r1, r0)
            boolean r0 = r1.mo473b()
            if (r0 == 0) goto Lf
            r1.m484o(r2)
            goto L14
        Lf:
            java.util.List<androidx.appcompat.view.menu.e> r0 = r1.f763f0
            r0.add(r2)
        L14:
            return
    }

    @Override // p194l.InterfaceC4155f
    /* renamed from: d */
    public void mo475d() {
            r2 = this;
            boolean r0 = r2.mo473b()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.List<androidx.appcompat.view.menu.e> r0 = r2.f763f0
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            androidx.appcompat.view.menu.e r1 = (androidx.appcompat.view.menu.C0211e) r1
            r2.m484o(r1)
            goto Ld
        L1d:
            java.util.List<androidx.appcompat.view.menu.e> r0 = r2.f763f0
            r0.clear()
            android.view.View r0 = r2.f770m0
            r2.f771n0 = r0
            if (r0 == 0) goto L43
            android.view.ViewTreeObserver r1 = r2.f780w0
            if (r1 != 0) goto L2e
            r1 = 1
            goto L2f
        L2e:
            r1 = 0
        L2f:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r2.f780w0 = r0
            if (r1 == 0) goto L3c
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.f765h0
            r0.addOnGlobalLayoutListener(r1)
        L3c:
            android.view.View r0 = r2.f771n0
            android.view.View$OnAttachStateChangeListener r1 = r2.f766i0
            r0.addOnAttachStateChangeListener(r1)
        L43:
            return
    }

    @Override // p194l.InterfaceC4155f
    public void dismiss() {
            r4 = this;
            java.util.List<androidx.appcompat.view.menu.b$d> r0 = r4.f764g0
            int r0 = r0.size()
            if (r0 <= 0) goto L28
            java.util.List<androidx.appcompat.view.menu.b$d> r1 = r4.f764g0
            androidx.appcompat.view.menu.b$d[] r2 = new androidx.appcompat.view.menu.ViewOnKeyListenerC0208b.d[r0]
            java.lang.Object[] r1 = r1.toArray(r2)
            androidx.appcompat.view.menu.b$d[] r1 = (androidx.appcompat.view.menu.ViewOnKeyListenerC0208b.d[]) r1
            int r0 = r0 + (-1)
        L14:
            if (r0 < 0) goto L28
            r2 = r1[r0]
            androidx.appcompat.widget.l0 r3 = r2.f790a
            boolean r3 = r3.mo473b()
            if (r3 == 0) goto L25
            androidx.appcompat.widget.l0 r2 = r2.f790a
            r2.dismiss()
        L25:
            int r0 = r0 + (-1)
            goto L14
        L28:
            return
    }

    @Override // p194l.AbstractC4153d
    /* renamed from: f */
    public void mo476f(android.view.View r3) {
            r2 = this;
            android.view.View r0 = r2.f770m0
            if (r0 == r3) goto L14
            r2.f770m0 = r3
            int r0 = r2.f768k0
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            int r3 = p227n0.C4661t.d.m10575d(r3)
            int r3 = android.view.Gravity.getAbsoluteGravity(r0, r3)
            r2.f769l0 = r3
        L14:
            return
    }

    @Override // p194l.InterfaceC4155f
    /* renamed from: g */
    public android.widget.ListView mo477g() {
            r2 = this;
            java.util.List<androidx.appcompat.view.menu.b$d> r0 = r2.f764g0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La
            r0 = 0
            goto L1c
        La:
            java.util.List<androidx.appcompat.view.menu.b$d> r0 = r2.f764g0
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            androidx.appcompat.view.menu.b$d r0 = (androidx.appcompat.view.menu.ViewOnKeyListenerC0208b.d) r0
            androidx.appcompat.widget.l0 r0 = r0.f790a
            androidx.appcompat.widget.f0 r0 = r0.f1329a0
        L1c:
            return r0
    }

    @Override // p194l.AbstractC4153d
    /* renamed from: h */
    public void mo478h(boolean r1) {
            r0 = this;
            r0.f777t0 = r1
            return
    }

    @Override // p194l.AbstractC4153d
    /* renamed from: i */
    public void mo479i(int r3) {
            r2 = this;
            int r0 = r2.f768k0
            if (r0 == r3) goto L14
            r2.f768k0 = r3
            android.view.View r0 = r2.f770m0
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            int r0 = p227n0.C4661t.d.m10575d(r0)
            int r3 = android.view.Gravity.getAbsoluteGravity(r3, r0)
            r2.f769l0 = r3
        L14:
            return
    }

    @Override // p194l.AbstractC4153d
    /* renamed from: j */
    public void mo480j(int r2) {
            r1 = this;
            r0 = 1
            r1.f773p0 = r0
            r1.f775r0 = r2
            return
    }

    @Override // p194l.AbstractC4153d
    /* renamed from: k */
    public void mo481k(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.f781x0 = r1
            return
    }

    @Override // p194l.AbstractC4153d
    /* renamed from: l */
    public void mo482l(boolean r1) {
            r0 = this;
            r0.f778u0 = r1
            return
    }

    @Override // p194l.AbstractC4153d
    /* renamed from: m */
    public void mo483m(int r2) {
            r1 = this;
            r0 = 1
            r1.f774q0 = r0
            r1.f776s0 = r2
            return
    }

    /* renamed from: o */
    public final void m484o(androidx.appcompat.view.menu.C0211e r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            android.content.Context r2 = r0.f757Z
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            androidx.appcompat.view.menu.d r3 = new androidx.appcompat.view.menu.d
            boolean r4 = r0.f761d0
            r5 = 2131558411(0x7f0d000b, float:1.8742137E38)
            r3.<init>(r1, r2, r4, r5)
            boolean r4 = r16.mo473b()
            r5 = 1
            if (r4 != 0) goto L22
            boolean r4 = r0.f777t0
            if (r4 == 0) goto L22
            r3.f803a0 = r5
            goto L2e
        L22:
            boolean r4 = r16.mo473b()
            if (r4 == 0) goto L2e
            boolean r4 = p194l.AbstractC4153d.m9212n(r17)
            r3.f803a0 = r4
        L2e:
            android.content.Context r4 = r0.f757Z
            int r6 = r0.f758a0
            r7 = 0
            int r4 = p194l.AbstractC4153d.m9211e(r3, r7, r4, r6)
            androidx.appcompat.widget.l0 r6 = new androidx.appcompat.widget.l0
            android.content.Context r8 = r0.f757Z
            int r9 = r0.f759b0
            int r10 = r0.f760c0
            r6.<init>(r8, r7, r9, r10)
            androidx.appcompat.widget.k0 r8 = r0.f767j0
            r6.f1371A0 = r8
            r6.f1342n0 = r0
            android.widget.PopupWindow r8 = r6.f1351w0
            r8.setOnDismissListener(r0)
            android.view.View r8 = r0.f770m0
            r6.f1341m0 = r8
            int r8 = r0.f769l0
            r6.f1338j0 = r8
            r6.m741s(r5)
            android.widget.PopupWindow r8 = r6.f1351w0
            r9 = 2
            r8.setInputMethodMode(r9)
            r6.mo738p(r3)
            r6.m740r(r4)
            int r3 = r0.f769l0
            r6.f1338j0 = r3
            java.util.List<androidx.appcompat.view.menu.b$d> r3 = r0.f764g0
            int r3 = r3.size()
            r8 = 0
            if (r3 <= 0) goto Le6
            java.util.List<androidx.appcompat.view.menu.b$d> r3 = r0.f764g0
            int r10 = r3.size()
            int r10 = r10 - r5
            java.lang.Object r3 = r3.get(r10)
            androidx.appcompat.view.menu.b$d r3 = (androidx.appcompat.view.menu.ViewOnKeyListenerC0208b.d) r3
            androidx.appcompat.view.menu.e r10 = r3.f791b
            int r11 = r10.size()
            r12 = 0
        L85:
            if (r12 >= r11) goto L9b
            android.view.MenuItem r13 = r10.getItem(r12)
            boolean r14 = r13.hasSubMenu()
            if (r14 == 0) goto L98
            android.view.SubMenu r14 = r13.getSubMenu()
            if (r1 != r14) goto L98
            goto L9c
        L98:
            int r12 = r12 + 1
            goto L85
        L9b:
            r13 = r7
        L9c:
            if (r13 != 0) goto L9f
            goto Le8
        L9f:
            androidx.appcompat.widget.l0 r10 = r3.f790a
            androidx.appcompat.widget.f0 r10 = r10.f1329a0
            android.widget.ListAdapter r11 = r10.getAdapter()
            boolean r12 = r11 instanceof android.widget.HeaderViewListAdapter
            if (r12 == 0) goto Lb8
            android.widget.HeaderViewListAdapter r11 = (android.widget.HeaderViewListAdapter) r11
            int r12 = r11.getHeadersCount()
            android.widget.ListAdapter r11 = r11.getWrappedAdapter()
            androidx.appcompat.view.menu.d r11 = (androidx.appcompat.view.menu.C0210d) r11
            goto Lbb
        Lb8:
            androidx.appcompat.view.menu.d r11 = (androidx.appcompat.view.menu.C0210d) r11
            r12 = 0
        Lbb:
            int r14 = r11.getCount()
            r15 = 0
        Lc0:
            r9 = -1
            if (r15 >= r14) goto Lce
            androidx.appcompat.view.menu.g r7 = r11.m497b(r15)
            if (r13 != r7) goto Lca
            goto Lcf
        Lca:
            int r15 = r15 + 1
            r7 = 0
            goto Lc0
        Lce:
            r15 = -1
        Lcf:
            if (r15 != r9) goto Ld2
            goto Le7
        Ld2:
            int r15 = r15 + r12
            int r7 = r10.getFirstVisiblePosition()
            int r15 = r15 - r7
            if (r15 < 0) goto Le7
            int r7 = r10.getChildCount()
            if (r15 < r7) goto Le1
            goto Le7
        Le1:
            android.view.View r7 = r10.getChildAt(r15)
            goto Le8
        Le6:
            r3 = 0
        Le7:
            r7 = 0
        Le8:
            if (r7 == 0) goto L1b5
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r9 > r10) goto L108
            java.lang.reflect.Method r9 = androidx.appcompat.widget.C0288l0.f1370B0
            if (r9 == 0) goto L10d
            android.widget.PopupWindow r10 = r6.f1351w0     // Catch: java.lang.Exception -> L100
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L100
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L100
            r11[r8] = r12     // Catch: java.lang.Exception -> L100
            r9.invoke(r10, r11)     // Catch: java.lang.Exception -> L100
            goto L10d
        L100:
            java.lang.String r9 = "MenuPopupWindow"
            java.lang.String r10 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r9, r10)
            goto L10d
        L108:
            android.widget.PopupWindow r9 = r6.f1351w0
            r9.setTouchModal(r8)
        L10d:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 23
            if (r9 < r10) goto L119
            android.widget.PopupWindow r10 = r6.f1351w0
            r11 = 0
            r10.setEnterTransition(r11)
        L119:
            java.util.List<androidx.appcompat.view.menu.b$d> r10 = r0.f764g0
            int r11 = r10.size()
            int r11 = r11 - r5
            java.lang.Object r10 = r10.get(r11)
            androidx.appcompat.view.menu.b$d r10 = (androidx.appcompat.view.menu.ViewOnKeyListenerC0208b.d) r10
            androidx.appcompat.widget.l0 r10 = r10.f790a
            androidx.appcompat.widget.f0 r10 = r10.f1329a0
            r11 = 2
            int[] r12 = new int[r11]
            r10.getLocationOnScreen(r12)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            android.view.View r13 = r0.f771n0
            r13.getWindowVisibleDisplayFrame(r11)
            int r13 = r0.f772o0
            if (r13 != r5) goto L14b
            r12 = r12[r8]
            int r10 = r10.getWidth()
            int r10 = r10 + r12
            int r10 = r10 + r4
            int r11 = r11.right
            if (r10 <= r11) goto L150
            goto L152
        L14b:
            r10 = r12[r8]
            int r10 = r10 - r4
            if (r10 >= 0) goto L152
        L150:
            r10 = 1
            goto L153
        L152:
            r10 = 0
        L153:
            if (r10 != r5) goto L157
            r11 = 1
            goto L158
        L157:
            r11 = 0
        L158:
            r0.f772o0 = r10
            r10 = 26
            r12 = 5
            if (r9 < r10) goto L164
            r6.f1341m0 = r7
            r9 = 0
            r13 = 0
            goto L195
        L164:
            r9 = 2
            int[] r10 = new int[r9]
            android.view.View r13 = r0.f770m0
            r13.getLocationOnScreen(r10)
            int[] r9 = new int[r9]
            r7.getLocationOnScreen(r9)
            int r13 = r0.f769l0
            r13 = r13 & 7
            if (r13 != r12) goto L18b
            r13 = r10[r8]
            android.view.View r14 = r0.f770m0
            int r14 = r14.getWidth()
            int r14 = r14 + r13
            r10[r8] = r14
            r13 = r9[r8]
            int r14 = r7.getWidth()
            int r14 = r14 + r13
            r9[r8] = r14
        L18b:
            r13 = r9[r8]
            r14 = r10[r8]
            int r13 = r13 - r14
            r9 = r9[r5]
            r10 = r10[r5]
            int r9 = r9 - r10
        L195:
            int r10 = r0.f769l0
            r10 = r10 & r12
            if (r10 != r12) goto L1a2
            if (r11 == 0) goto L19d
            goto L1a8
        L19d:
            int r4 = r7.getWidth()
            goto L1aa
        L1a2:
            if (r11 == 0) goto L1aa
            int r4 = r7.getWidth()
        L1a8:
            int r13 = r13 + r4
            goto L1ab
        L1aa:
            int r13 = r13 - r4
        L1ab:
            r6.f1332d0 = r13
            r6.f1337i0 = r5
            r6.f1336h0 = r5
            r6.m735j(r9)
            goto L1d3
        L1b5:
            boolean r4 = r0.f773p0
            if (r4 == 0) goto L1bd
            int r4 = r0.f775r0
            r6.f1332d0 = r4
        L1bd:
            boolean r4 = r0.f774q0
            if (r4 == 0) goto L1c6
            int r4 = r0.f776s0
            r6.m735j(r4)
        L1c6:
            android.graphics.Rect r4 = r0.f17213Y
            if (r4 == 0) goto L1d0
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>(r4)
            goto L1d1
        L1d0:
            r11 = 0
        L1d1:
            r6.f1349u0 = r11
        L1d3:
            androidx.appcompat.view.menu.b$d r4 = new androidx.appcompat.view.menu.b$d
            int r5 = r0.f772o0
            r4.<init>(r6, r1, r5)
            java.util.List<androidx.appcompat.view.menu.b$d> r5 = r0.f764g0
            r5.add(r4)
            r6.mo475d()
            androidx.appcompat.widget.f0 r4 = r6.f1329a0
            r4.setOnKeyListener(r0)
            if (r3 != 0) goto L212
            boolean r3 = r0.f778u0
            if (r3 == 0) goto L212
            java.lang.CharSequence r3 = r1.f820m
            if (r3 == 0) goto L212
            r3 = 2131558418(0x7f0d0012, float:1.8742151E38)
            android.view.View r2 = r2.inflate(r3, r4, r8)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r3 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.setEnabled(r8)
            java.lang.CharSequence r1 = r1.f820m
            r3.setText(r1)
            r1 = 0
            r4.addHeaderView(r2, r1, r8)
            r6.mo475d()
        L212:
            return
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
            r5 = this;
            java.util.List<androidx.appcompat.view.menu.b$d> r0 = r5.f764g0
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L1e
            java.util.List<androidx.appcompat.view.menu.b$d> r3 = r5.f764g0
            java.lang.Object r3 = r3.get(r2)
            androidx.appcompat.view.menu.b$d r3 = (androidx.appcompat.view.menu.ViewOnKeyListenerC0208b.d) r3
            androidx.appcompat.widget.l0 r4 = r3.f790a
            boolean r4 = r4.mo473b()
            if (r4 != 0) goto L1b
            goto L1f
        L1b:
            int r2 = r2 + 1
            goto L8
        L1e:
            r3 = 0
        L1f:
            if (r3 == 0) goto L26
            androidx.appcompat.view.menu.e r0 = r3.f791b
            r0.m500c(r1)
        L26:
            return
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            int r1 = r3.getAction()
            r3 = 1
            if (r1 != r3) goto Lf
            r1 = 82
            if (r2 != r1) goto Lf
            r0.dismiss()
            return r3
        Lf:
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: t */
    public void mo485t(android.os.Parcelable r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: u */
    public boolean mo486u(androidx.appcompat.view.menu.SubMenuC0218l r5) {
            r4 = this;
            java.util.List<androidx.appcompat.view.menu.b$d> r0 = r4.f764g0
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            androidx.appcompat.view.menu.b$d r1 = (androidx.appcompat.view.menu.ViewOnKeyListenerC0208b.d) r1
            androidx.appcompat.view.menu.e r3 = r1.f791b
            if (r5 != r3) goto L6
            androidx.appcompat.widget.l0 r5 = r1.f790a
            androidx.appcompat.widget.f0 r5 = r5.f1329a0
            r5.requestFocus()
            return r2
        L1f:
            boolean r0 = r5.hasVisibleItems()
            if (r0 == 0) goto L41
            android.content.Context r0 = r4.f757Z
            r5.m499b(r4, r0)
            boolean r0 = r4.mo473b()
            if (r0 == 0) goto L34
            r4.m484o(r5)
            goto L39
        L34:
            java.util.List<androidx.appcompat.view.menu.e> r0 = r4.f763f0
            r0.add(r5)
        L39:
            androidx.appcompat.view.menu.i$a r0 = r4.f779v0
            if (r0 == 0) goto L40
            r0.mo526b(r5)
        L40:
            return r2
        L41:
            r5 = 0
            return r5
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: v */
    public void mo487v(boolean r3) {
            r2 = this;
            java.util.List<androidx.appcompat.view.menu.b$d> r3 = r2.f764g0
            java.util.Iterator r3 = r3.iterator()
        L6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.next()
            androidx.appcompat.view.menu.b$d r0 = (androidx.appcompat.view.menu.ViewOnKeyListenerC0208b.d) r0
            androidx.appcompat.widget.l0 r0 = r0.f790a
            androidx.appcompat.widget.f0 r0 = r0.f1329a0
            android.widget.ListAdapter r0 = r0.getAdapter()
            boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
            if (r1 == 0) goto L24
            android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
            android.widget.ListAdapter r0 = r0.getWrappedAdapter()
        L24:
            androidx.appcompat.view.menu.d r0 = (androidx.appcompat.view.menu.C0210d) r0
            r0.notifyDataSetChanged()
            goto L6
        L2a:
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: w */
    public boolean mo488w() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: x */
    public android.os.Parcelable mo489x() {
            r1 = this;
            r0 = 0
            return r0
    }
}
