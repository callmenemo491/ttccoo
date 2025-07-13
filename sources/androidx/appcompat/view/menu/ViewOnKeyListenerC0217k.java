package androidx.appcompat.view.menu;

/* renamed from: androidx.appcompat.view.menu.k */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0217k extends p194l.AbstractC4153d implements android.widget.PopupWindow.OnDismissListener, android.view.View.OnKeyListener {

    /* renamed from: Z */
    public final android.content.Context f879Z;

    /* renamed from: a0 */
    public final androidx.appcompat.view.menu.C0211e f880a0;

    /* renamed from: b0 */
    public final androidx.appcompat.view.menu.C0210d f881b0;

    /* renamed from: c0 */
    public final boolean f882c0;

    /* renamed from: d0 */
    public final int f883d0;

    /* renamed from: e0 */
    public final int f884e0;

    /* renamed from: f0 */
    public final int f885f0;

    /* renamed from: g0 */
    public final androidx.appcompat.widget.C0288l0 f886g0;

    /* renamed from: h0 */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f887h0;

    /* renamed from: i0 */
    public final android.view.View.OnAttachStateChangeListener f888i0;

    /* renamed from: j0 */
    public android.widget.PopupWindow.OnDismissListener f889j0;

    /* renamed from: k0 */
    public android.view.View f890k0;

    /* renamed from: l0 */
    public android.view.View f891l0;

    /* renamed from: m0 */
    public androidx.appcompat.view.menu.InterfaceC0215i.a f892m0;

    /* renamed from: n0 */
    public android.view.ViewTreeObserver f893n0;

    /* renamed from: o0 */
    public boolean f894o0;

    /* renamed from: p0 */
    public boolean f895p0;

    /* renamed from: q0 */
    public int f896q0;

    /* renamed from: r0 */
    public int f897r0;

    /* renamed from: s0 */
    public boolean f898s0;

    /* renamed from: androidx.appcompat.view.menu.k$a */
    public class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.view.menu.ViewOnKeyListenerC0217k f899Y;

        public a(androidx.appcompat.view.menu.ViewOnKeyListenerC0217k r1) {
                r0 = this;
                r0.f899Y = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
                r2 = this;
                androidx.appcompat.view.menu.k r0 = r2.f899Y
                boolean r0 = r0.mo473b()
                if (r0 == 0) goto L28
                androidx.appcompat.view.menu.k r0 = r2.f899Y
                androidx.appcompat.widget.l0 r1 = r0.f886g0
                boolean r1 = r1.f1350v0
                if (r1 != 0) goto L28
                android.view.View r0 = r0.f891l0
                if (r0 == 0) goto L23
                boolean r0 = r0.isShown()
                if (r0 != 0) goto L1b
                goto L23
            L1b:
                androidx.appcompat.view.menu.k r0 = r2.f899Y
                androidx.appcompat.widget.l0 r0 = r0.f886g0
                r0.mo475d()
                goto L28
            L23:
                androidx.appcompat.view.menu.k r0 = r2.f899Y
                r0.dismiss()
            L28:
                return
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$b */
    public class b implements android.view.View.OnAttachStateChangeListener {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.view.menu.ViewOnKeyListenerC0217k f900Y;

        public b(androidx.appcompat.view.menu.ViewOnKeyListenerC0217k r1) {
                r0 = this;
                r0.f900Y = r1
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
                androidx.appcompat.view.menu.k r0 = r2.f900Y
                android.view.ViewTreeObserver r0 = r0.f893n0
                if (r0 == 0) goto L1d
                boolean r0 = r0.isAlive()
                if (r0 != 0) goto L14
                androidx.appcompat.view.menu.k r0 = r2.f900Y
                android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
                r0.f893n0 = r1
            L14:
                androidx.appcompat.view.menu.k r0 = r2.f900Y
                android.view.ViewTreeObserver r1 = r0.f893n0
                android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r0.f887h0
                r1.removeGlobalOnLayoutListener(r0)
            L1d:
                r3.removeOnAttachStateChangeListener(r2)
                return
        }
    }

    public ViewOnKeyListenerC0217k(android.content.Context r4, androidx.appcompat.view.menu.C0211e r5, android.view.View r6, int r7, int r8, boolean r9) {
            r3 = this;
            r3.<init>()
            androidx.appcompat.view.menu.k$a r0 = new androidx.appcompat.view.menu.k$a
            r0.<init>(r3)
            r3.f887h0 = r0
            androidx.appcompat.view.menu.k$b r0 = new androidx.appcompat.view.menu.k$b
            r0.<init>(r3)
            r3.f888i0 = r0
            r0 = 0
            r3.f897r0 = r0
            r3.f879Z = r4
            r3.f880a0 = r5
            r3.f882c0 = r9
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r4)
            androidx.appcompat.view.menu.d r1 = new androidx.appcompat.view.menu.d
            r2 = 2131558419(0x7f0d0013, float:1.8742153E38)
            r1.<init>(r5, r0, r9, r2)
            r3.f881b0 = r1
            r3.f884e0 = r7
            r3.f885f0 = r8
            android.content.res.Resources r9 = r4.getResources()
            android.util.DisplayMetrics r0 = r9.getDisplayMetrics()
            int r0 = r0.widthPixels
            int r0 = r0 / 2
            r1 = 2131165207(0x7f070017, float:1.7944625E38)
            int r9 = r9.getDimensionPixelSize(r1)
            int r9 = java.lang.Math.max(r0, r9)
            r3.f883d0 = r9
            r3.f890k0 = r6
            androidx.appcompat.widget.l0 r6 = new androidx.appcompat.widget.l0
            r9 = 0
            r6.<init>(r4, r9, r7, r8)
            r3.f886g0 = r6
            r5.m499b(r3, r4)
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: A */
    public void mo468A(androidx.appcompat.view.menu.InterfaceC0215i.a r1) {
            r0 = this;
            r0.f892m0 = r1
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: a */
    public void mo472a(androidx.appcompat.view.menu.C0211e r2, boolean r3) {
            r1 = this;
            androidx.appcompat.view.menu.e r0 = r1.f880a0
            if (r2 == r0) goto L5
            return
        L5:
            r1.dismiss()
            androidx.appcompat.view.menu.i$a r0 = r1.f892m0
            if (r0 == 0) goto Lf
            r0.mo525a(r2, r3)
        Lf:
            return
    }

    @Override // p194l.InterfaceC4155f
    /* renamed from: b */
    public boolean mo473b() {
            r1 = this;
            boolean r0 = r1.f894o0
            if (r0 != 0) goto Le
            androidx.appcompat.widget.l0 r0 = r1.f886g0
            boolean r0 = r0.mo473b()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // p194l.AbstractC4153d
    /* renamed from: c */
    public void mo474c(androidx.appcompat.view.menu.C0211e r1) {
            r0 = this;
            return
    }

    @Override // p194l.InterfaceC4155f
    /* renamed from: d */
    public void mo475d() {
            r7 = this;
            boolean r0 = r7.mo473b()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lb
        L8:
            r1 = 1
            goto Lc7
        Lb:
            boolean r0 = r7.f894o0
            if (r0 != 0) goto Lc7
            android.view.View r0 = r7.f890k0
            if (r0 != 0) goto L15
            goto Lc7
        L15:
            r7.f891l0 = r0
            androidx.appcompat.widget.l0 r0 = r7.f886g0
            android.widget.PopupWindow r0 = r0.f1351w0
            r0.setOnDismissListener(r7)
            androidx.appcompat.widget.l0 r0 = r7.f886g0
            r0.f1342n0 = r7
            r0.m741s(r2)
            android.view.View r0 = r7.f891l0
            android.view.ViewTreeObserver r3 = r7.f893n0
            if (r3 != 0) goto L2d
            r3 = 1
            goto L2e
        L2d:
            r3 = 0
        L2e:
            android.view.ViewTreeObserver r4 = r0.getViewTreeObserver()
            r7.f893n0 = r4
            if (r3 == 0) goto L3b
            android.view.ViewTreeObserver$OnGlobalLayoutListener r3 = r7.f887h0
            r4.addOnGlobalLayoutListener(r3)
        L3b:
            android.view.View$OnAttachStateChangeListener r3 = r7.f888i0
            r0.addOnAttachStateChangeListener(r3)
            androidx.appcompat.widget.l0 r3 = r7.f886g0
            r3.f1341m0 = r0
            int r0 = r7.f897r0
            r3.f1338j0 = r0
            boolean r0 = r7.f895p0
            r3 = 0
            if (r0 != 0) goto L5b
            androidx.appcompat.view.menu.d r0 = r7.f881b0
            android.content.Context r4 = r7.f879Z
            int r5 = r7.f883d0
            int r0 = p194l.AbstractC4153d.m9211e(r0, r3, r4, r5)
            r7.f896q0 = r0
            r7.f895p0 = r2
        L5b:
            androidx.appcompat.widget.l0 r0 = r7.f886g0
            int r4 = r7.f896q0
            r0.m740r(r4)
            androidx.appcompat.widget.l0 r0 = r7.f886g0
            r4 = 2
            android.widget.PopupWindow r0 = r0.f1351w0
            r0.setInputMethodMode(r4)
            androidx.appcompat.widget.l0 r0 = r7.f886g0
            android.graphics.Rect r4 = r7.f17213Y
            java.util.Objects.requireNonNull(r0)
            if (r4 == 0) goto L79
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r4)
            goto L7a
        L79:
            r5 = r3
        L7a:
            r0.f1349u0 = r5
            androidx.appcompat.widget.l0 r0 = r7.f886g0
            r0.mo475d()
            androidx.appcompat.widget.l0 r0 = r7.f886g0
            androidx.appcompat.widget.f0 r0 = r0.f1329a0
            r0.setOnKeyListener(r7)
            boolean r4 = r7.f898s0
            if (r4 == 0) goto Lb9
            androidx.appcompat.view.menu.e r4 = r7.f880a0
            java.lang.CharSequence r4 = r4.f820m
            if (r4 == 0) goto Lb9
            android.content.Context r4 = r7.f879Z
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r5 = 2131558418(0x7f0d0012, float:1.8742151E38)
            android.view.View r4 = r4.inflate(r5, r0, r1)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto Lb3
            androidx.appcompat.view.menu.e r6 = r7.f880a0
            java.lang.CharSequence r6 = r6.f820m
            r5.setText(r6)
        Lb3:
            r4.setEnabled(r1)
            r0.addHeaderView(r4, r3, r1)
        Lb9:
            androidx.appcompat.widget.l0 r0 = r7.f886g0
            androidx.appcompat.view.menu.d r1 = r7.f881b0
            r0.mo738p(r1)
            androidx.appcompat.widget.l0 r0 = r7.f886g0
            r0.mo475d()
            goto L8
        Lc7:
            if (r1 == 0) goto Lca
            return
        Lca:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "StandardMenuPopup cannot be used without an anchor"
            r0.<init>(r1)
            throw r0
    }

    @Override // p194l.InterfaceC4155f
    public void dismiss() {
            r1 = this;
            boolean r0 = r1.mo473b()
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.l0 r0 = r1.f886g0
            r0.dismiss()
        Lb:
            return
    }

    @Override // p194l.AbstractC4153d
    /* renamed from: f */
    public void mo476f(android.view.View r1) {
            r0 = this;
            r0.f890k0 = r1
            return
    }

    @Override // p194l.InterfaceC4155f
    /* renamed from: g */
    public android.widget.ListView mo477g() {
            r1 = this;
            androidx.appcompat.widget.l0 r0 = r1.f886g0
            androidx.appcompat.widget.f0 r0 = r0.f1329a0
            return r0
    }

    @Override // p194l.AbstractC4153d
    /* renamed from: h */
    public void mo478h(boolean r2) {
            r1 = this;
            androidx.appcompat.view.menu.d r0 = r1.f881b0
            r0.f803a0 = r2
            return
    }

    @Override // p194l.AbstractC4153d
    /* renamed from: i */
    public void mo479i(int r1) {
            r0 = this;
            r0.f897r0 = r1
            return
    }

    @Override // p194l.AbstractC4153d
    /* renamed from: j */
    public void mo480j(int r2) {
            r1 = this;
            androidx.appcompat.widget.l0 r0 = r1.f886g0
            r0.f1332d0 = r2
            return
    }

    @Override // p194l.AbstractC4153d
    /* renamed from: k */
    public void mo481k(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.f889j0 = r1
            return
    }

    @Override // p194l.AbstractC4153d
    /* renamed from: l */
    public void mo482l(boolean r1) {
            r0 = this;
            r0.f898s0 = r1
            return
    }

    @Override // p194l.AbstractC4153d
    /* renamed from: m */
    public void mo483m(int r2) {
            r1 = this;
            androidx.appcompat.widget.l0 r0 = r1.f886g0
            r0.f1333e0 = r2
            r2 = 1
            r0.f1335g0 = r2
            return
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
            r2 = this;
            r0 = 1
            r2.f894o0 = r0
            androidx.appcompat.view.menu.e r1 = r2.f880a0
            r1.m500c(r0)
            android.view.ViewTreeObserver r0 = r2.f893n0
            if (r0 == 0) goto L24
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L1a
            android.view.View r0 = r2.f891l0
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r2.f893n0 = r0
        L1a:
            android.view.ViewTreeObserver r0 = r2.f893n0
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.f887h0
            r0.removeGlobalOnLayoutListener(r1)
            r0 = 0
            r2.f893n0 = r0
        L24:
            android.view.View r0 = r2.f891l0
            android.view.View$OnAttachStateChangeListener r1 = r2.f888i0
            r0.removeOnAttachStateChangeListener(r1)
            android.widget.PopupWindow$OnDismissListener r0 = r2.f889j0
            if (r0 == 0) goto L32
            r0.onDismiss()
        L32:
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
    public boolean mo486u(androidx.appcompat.view.menu.SubMenuC0218l r10) {
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L78
            androidx.appcompat.view.menu.h r0 = new androidx.appcompat.view.menu.h
            android.content.Context r3 = r9.f879Z
            android.view.View r5 = r9.f891l0
            boolean r6 = r9.f882c0
            int r7 = r9.f884e0
            int r8 = r9.f885f0
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.i$a r2 = r9.f892m0
            r0.m544d(r2)
            boolean r2 = p194l.AbstractC4153d.m9212n(r10)
            r0.f873h = r2
            l.d r3 = r0.f875j
            if (r3 == 0) goto L2a
            r3.mo478h(r2)
        L2a:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f889j0
            r0.f876k = r2
            r2 = 0
            r9.f889j0 = r2
            androidx.appcompat.view.menu.e r2 = r9.f880a0
            r2.m500c(r1)
            androidx.appcompat.widget.l0 r2 = r9.f886g0
            int r3 = r2.f1332d0
            boolean r4 = r2.f1335g0
            if (r4 != 0) goto L40
            r2 = 0
            goto L42
        L40:
            int r2 = r2.f1333e0
        L42:
            int r4 = r9.f897r0
            android.view.View r5 = r9.f890k0
            java.util.WeakHashMap<android.view.View, n0.w> r6 = p227n0.C4661t.f18570a
            int r5 = p227n0.C4661t.d.m10575d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L5c
            android.view.View r4 = r9.f890k0
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L5c:
            boolean r4 = r0.m542b()
            r5 = 1
            if (r4 == 0) goto L64
            goto L6d
        L64:
            android.view.View r4 = r0.f871f
            if (r4 != 0) goto L6a
            r0 = 0
            goto L6e
        L6a:
            r0.m545e(r3, r2, r5, r5)
        L6d:
            r0 = 1
        L6e:
            if (r0 == 0) goto L78
            androidx.appcompat.view.menu.i$a r0 = r9.f892m0
            if (r0 == 0) goto L77
            r0.mo526b(r10)
        L77:
            return r5
        L78:
            return r1
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: v */
    public void mo487v(boolean r1) {
            r0 = this;
            r1 = 0
            r0.f895p0 = r1
            androidx.appcompat.view.menu.d r1 = r0.f881b0
            if (r1 == 0) goto La
            r1.notifyDataSetChanged()
        La:
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
