package p083f;

/* renamed from: f.x */
/* loaded from: classes.dex */
public class C1937x extends p083f.AbstractC1914a implements androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0223d {

    /* renamed from: A */
    public static final android.view.animation.Interpolator f8444A = null;

    /* renamed from: z */
    public static final android.view.animation.Interpolator f8445z = null;

    /* renamed from: a */
    public android.content.Context f8446a;

    /* renamed from: b */
    public android.content.Context f8447b;

    /* renamed from: c */
    public androidx.appcompat.widget.ActionBarOverlayLayout f8448c;

    /* renamed from: d */
    public androidx.appcompat.widget.ActionBarContainer f8449d;

    /* renamed from: e */
    public androidx.appcompat.widget.InterfaceC0268d0 f8450e;

    /* renamed from: f */
    public androidx.appcompat.widget.ActionBarContextView f8451f;

    /* renamed from: g */
    public android.view.View f8452g;

    /* renamed from: h */
    public boolean f8453h;

    /* renamed from: i */
    public p083f.C1937x.d f8454i;

    /* renamed from: j */
    public p177k.AbstractC3617a f8455j;

    /* renamed from: k */
    public p177k.AbstractC3617a.a f8456k;

    /* renamed from: l */
    public boolean f8457l;

    /* renamed from: m */
    public java.util.ArrayList<p083f.AbstractC1914a.b> f8458m;

    /* renamed from: n */
    public boolean f8459n;

    /* renamed from: o */
    public int f8460o;

    /* renamed from: p */
    public boolean f8461p;

    /* renamed from: q */
    public boolean f8462q;

    /* renamed from: r */
    public boolean f8463r;

    /* renamed from: s */
    public boolean f8464s;

    /* renamed from: t */
    public p177k.C3623g f8465t;

    /* renamed from: u */
    public boolean f8466u;

    /* renamed from: v */
    public boolean f8467v;

    /* renamed from: w */
    public final p227n0.InterfaceC4665x f8468w;

    /* renamed from: x */
    public final p227n0.InterfaceC4665x f8469x;

    /* renamed from: y */
    public final p227n0.InterfaceC4667z f8470y;

    /* renamed from: f.x$a */
    public class a extends p227n0.C4666y {

        /* renamed from: a */
        public final /* synthetic */ p083f.C1937x f8471a;

        public a(p083f.C1937x r1) {
                r0 = this;
                r0.f8471a = r1
                r0.<init>()
                return
        }

        @Override // p227n0.InterfaceC4665x
        /* renamed from: b */
        public void mo654b(android.view.View r4) {
                r3 = this;
                f.x r4 = r3.f8471a
                boolean r0 = r4.f8461p
                if (r0 == 0) goto L15
                android.view.View r4 = r4.f8452g
                if (r4 == 0) goto L15
                r0 = 0
                r4.setTranslationY(r0)
                f.x r4 = r3.f8471a
                androidx.appcompat.widget.ActionBarContainer r4 = r4.f8449d
                r4.setTranslationY(r0)
            L15:
                f.x r4 = r3.f8471a
                androidx.appcompat.widget.ActionBarContainer r4 = r4.f8449d
                r0 = 8
                r4.setVisibility(r0)
                f.x r4 = r3.f8471a
                androidx.appcompat.widget.ActionBarContainer r4 = r4.f8449d
                r0 = 0
                r4.setTransitioning(r0)
                f.x r4 = r3.f8471a
                r0 = 0
                r4.f8465t = r0
                k.a$a r1 = r4.f8456k
                if (r1 == 0) goto L38
                k.a r2 = r4.f8455j
                r1.mo4761d(r2)
                r4.f8455j = r0
                r4.f8456k = r0
            L38:
                f.x r4 = r3.f8471a
                androidx.appcompat.widget.ActionBarOverlayLayout r4 = r4.f8448c
                if (r4 == 0) goto L43
                java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
                p227n0.C4661t.g.m10595c(r4)
            L43:
                return
        }
    }

    /* renamed from: f.x$b */
    public class b extends p227n0.C4666y {

        /* renamed from: a */
        public final /* synthetic */ p083f.C1937x f8472a;

        public b(p083f.C1937x r1) {
                r0 = this;
                r0.f8472a = r1
                r0.<init>()
                return
        }

        @Override // p227n0.InterfaceC4665x
        /* renamed from: b */
        public void mo654b(android.view.View r2) {
                r1 = this;
                f.x r2 = r1.f8472a
                r0 = 0
                r2.f8465t = r0
                androidx.appcompat.widget.ActionBarContainer r2 = r2.f8449d
                r2.requestLayout()
                return
        }
    }

    /* renamed from: f.x$c */
    public class c implements p227n0.InterfaceC4667z {

        /* renamed from: a */
        public final /* synthetic */ p083f.C1937x f8473a;

        public c(p083f.C1937x r1) {
                r0 = this;
                r0.f8473a = r1
                r0.<init>()
                return
        }
    }

    /* renamed from: f.x$d */
    public class d extends p177k.AbstractC3617a implements androidx.appcompat.view.menu.C0211e.a {

        /* renamed from: a0 */
        public final android.content.Context f8474a0;

        /* renamed from: b0 */
        public final androidx.appcompat.view.menu.C0211e f8475b0;

        /* renamed from: c0 */
        public p177k.AbstractC3617a.a f8476c0;

        /* renamed from: d0 */
        public java.lang.ref.WeakReference<android.view.View> f8477d0;

        /* renamed from: e0 */
        public final /* synthetic */ p083f.C1937x f8478e0;

        public d(p083f.C1937x r1, android.content.Context r2, p177k.AbstractC3617a.a r3) {
                r0 = this;
                r0.f8478e0 = r1
                r0.<init>()
                r0.f8474a0 = r2
                r0.f8476c0 = r3
                androidx.appcompat.view.menu.e r1 = new androidx.appcompat.view.menu.e
                r1.<init>(r2)
                r2 = 1
                r1.f819l = r2
                r0.f8475b0 = r1
                r1.f812e = r0
                return
        }

        @Override // androidx.appcompat.view.menu.C0211e.a
        /* renamed from: a */
        public boolean mo523a(androidx.appcompat.view.menu.C0211e r1, android.view.MenuItem r2) {
                r0 = this;
                k.a$a r1 = r0.f8476c0
                if (r1 == 0) goto L9
                boolean r1 = r1.mo4758a(r0, r2)
                return r1
            L9:
                r1 = 0
                return r1
        }

        @Override // androidx.appcompat.view.menu.C0211e.a
        /* renamed from: b */
        public void mo524b(androidx.appcompat.view.menu.C0211e r1) {
                r0 = this;
                k.a$a r1 = r0.f8476c0
                if (r1 != 0) goto L5
                return
            L5:
                r0.mo4808i()
                f.x r1 = r0.f8478e0
                androidx.appcompat.widget.ActionBarContextView r1 = r1.f8451f
                androidx.appcompat.widget.c r1 = r1.f1180d0
                if (r1 == 0) goto L13
                r1.m699g()
            L13:
                return
        }

        @Override // p177k.AbstractC3617a
        /* renamed from: c */
        public void mo4802c() {
                r3 = this;
                f.x r0 = r3.f8478e0
                f.x$d r1 = r0.f8454i
                if (r1 == r3) goto L7
                return
            L7:
                boolean r1 = r0.f8462q
                r2 = 0
                r1 = r1 ^ 1
                if (r1 != 0) goto L15
                r0.f8455j = r3
                k.a$a r1 = r3.f8476c0
                r0.f8456k = r1
                goto L1a
            L15:
                k.a$a r0 = r3.f8476c0
                r0.mo4761d(r3)
            L1a:
                r0 = 0
                r3.f8476c0 = r0
                f.x r1 = r3.f8478e0
                r1.m4798d(r2)
                f.x r1 = r3.f8478e0
                androidx.appcompat.widget.ActionBarContextView r1 = r1.f8451f
                android.view.View r2 = r1.f915k0
                if (r2 != 0) goto L2d
                r1.m551h()
            L2d:
                f.x r1 = r3.f8478e0
                androidx.appcompat.widget.d0 r1 = r1.f8450e
                android.view.ViewGroup r1 = r1.mo679l()
                r2 = 32
                r1.sendAccessibilityEvent(r2)
                f.x r1 = r3.f8478e0
                androidx.appcompat.widget.ActionBarOverlayLayout r2 = r1.f8448c
                boolean r1 = r1.f8467v
                r2.setHideOnContentScrollEnabled(r1)
                f.x r1 = r3.f8478e0
                r1.f8454i = r0
                return
        }

        @Override // p177k.AbstractC3617a
        /* renamed from: d */
        public android.view.View mo4803d() {
                r1 = this;
                java.lang.ref.WeakReference<android.view.View> r0 = r1.f8477d0
                if (r0 == 0) goto Lb
                java.lang.Object r0 = r0.get()
                android.view.View r0 = (android.view.View) r0
                goto Lc
            Lb:
                r0 = 0
            Lc:
                return r0
        }

        @Override // p177k.AbstractC3617a
        /* renamed from: e */
        public android.view.Menu mo4804e() {
                r1 = this;
                androidx.appcompat.view.menu.e r0 = r1.f8475b0
                return r0
        }

        @Override // p177k.AbstractC3617a
        /* renamed from: f */
        public android.view.MenuInflater mo4805f() {
                r2 = this;
                k.f r0 = new k.f
                android.content.Context r1 = r2.f8474a0
                r0.<init>(r1)
                return r0
        }

        @Override // p177k.AbstractC3617a
        /* renamed from: g */
        public java.lang.CharSequence mo4806g() {
                r1 = this;
                f.x r0 = r1.f8478e0
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f8451f
                java.lang.CharSequence r0 = r0.getSubtitle()
                return r0
        }

        @Override // p177k.AbstractC3617a
        /* renamed from: h */
        public java.lang.CharSequence mo4807h() {
                r1 = this;
                f.x r0 = r1.f8478e0
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f8451f
                java.lang.CharSequence r0 = r0.getTitle()
                return r0
        }

        @Override // p177k.AbstractC3617a
        /* renamed from: i */
        public void mo4808i() {
                r2 = this;
                f.x r0 = r2.f8478e0
                f.x$d r0 = r0.f8454i
                if (r0 == r2) goto L7
                return
            L7:
                androidx.appcompat.view.menu.e r0 = r2.f8475b0
                r0.m522y()
                k.a$a r0 = r2.f8476c0     // Catch: java.lang.Throwable -> L19
                androidx.appcompat.view.menu.e r1 = r2.f8475b0     // Catch: java.lang.Throwable -> L19
                r0.mo4760c(r2, r1)     // Catch: java.lang.Throwable -> L19
                androidx.appcompat.view.menu.e r0 = r2.f8475b0
                r0.m521x()
                return
            L19:
                r0 = move-exception
                androidx.appcompat.view.menu.e r1 = r2.f8475b0
                r1.m521x()
                throw r0
        }

        @Override // p177k.AbstractC3617a
        /* renamed from: j */
        public boolean mo4809j() {
                r1 = this;
                f.x r0 = r1.f8478e0
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f8451f
                boolean r0 = r0.f923s0
                return r0
        }

        @Override // p177k.AbstractC3617a
        /* renamed from: k */
        public void mo4810k(android.view.View r2) {
                r1 = this;
                f.x r0 = r1.f8478e0
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f8451f
                r0.setCustomView(r2)
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.f8477d0 = r0
                return
        }

        @Override // p177k.AbstractC3617a
        /* renamed from: l */
        public void mo4811l(int r2) {
                r1 = this;
                f.x r0 = r1.f8478e0
                android.content.Context r0 = r0.f8446a
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r2 = r0.getString(r2)
                f.x r0 = r1.f8478e0
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f8451f
                r0.setSubtitle(r2)
                return
        }

        @Override // p177k.AbstractC3617a
        /* renamed from: m */
        public void mo4812m(java.lang.CharSequence r2) {
                r1 = this;
                f.x r0 = r1.f8478e0
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f8451f
                r0.setSubtitle(r2)
                return
        }

        @Override // p177k.AbstractC3617a
        /* renamed from: n */
        public void mo4813n(int r2) {
                r1 = this;
                f.x r0 = r1.f8478e0
                android.content.Context r0 = r0.f8446a
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r2 = r0.getString(r2)
                f.x r0 = r1.f8478e0
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f8451f
                r0.setTitle(r2)
                return
        }

        @Override // p177k.AbstractC3617a
        /* renamed from: o */
        public void mo4814o(java.lang.CharSequence r2) {
                r1 = this;
                f.x r0 = r1.f8478e0
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f8451f
                r0.setTitle(r2)
                return
        }

        @Override // p177k.AbstractC3617a
        /* renamed from: p */
        public void mo4815p(boolean r2) {
                r1 = this;
                r1.f15936Z = r2
                f.x r0 = r1.f8478e0
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f8451f
                r0.setTitleOptional(r2)
                return
        }
    }

    static {
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            p083f.C1937x.f8445z = r0
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            p083f.C1937x.f8444A = r0
            return
    }

    public C1937x(android.app.Activity r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f8458m = r0
            r0 = 0
            r1.f8460o = r0
            r0 = 1
            r1.f8461p = r0
            r1.f8464s = r0
            f.x$a r0 = new f.x$a
            r0.<init>(r1)
            r1.f8468w = r0
            f.x$b r0 = new f.x$b
            r0.<init>(r1)
            r1.f8469x = r0
            f.x$c r0 = new f.x$c
            r0.<init>(r1)
            r1.f8470y = r0
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            r1.m4799e(r2)
            if (r3 != 0) goto L42
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r2.findViewById(r3)
            r1.f8452g = r2
        L42:
            return
    }

    public C1937x(android.app.Dialog r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f8458m = r0
            r0 = 0
            r1.f8460o = r0
            r0 = 1
            r1.f8461p = r0
            r1.f8464s = r0
            f.x$a r0 = new f.x$a
            r0.<init>(r1)
            r1.f8468w = r0
            f.x$b r0 = new f.x$b
            r0.<init>(r1)
            r1.f8469x = r0
            f.x$c r0 = new f.x$c
            r0.<init>(r1)
            r1.f8470y = r0
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            r1.m4799e(r2)
            return
    }

    @Override // p083f.AbstractC1914a
    /* renamed from: a */
    public void mo4698a(boolean r4) {
            r3 = this;
            boolean r0 = r3.f8457l
            if (r4 != r0) goto L5
            return
        L5:
            r3.f8457l = r4
            java.util.ArrayList<f.a$b> r0 = r3.f8458m
            int r0 = r0.size()
            r1 = 0
        Le:
            if (r1 >= r0) goto L1e
            java.util.ArrayList<f.a$b> r2 = r3.f8458m
            java.lang.Object r2 = r2.get(r1)
            f.a$b r2 = (p083f.AbstractC1914a.b) r2
            r2.m4701a(r4)
            int r1 = r1 + 1
            goto Le
        L1e:
            return
    }

    @Override // p083f.AbstractC1914a
    /* renamed from: b */
    public android.content.Context mo4699b() {
            r4 = this;
            android.content.Context r0 = r4.f8447b
            if (r0 != 0) goto L28
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r4.f8446a
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r2 = 2130968587(0x7f04000b, float:1.7545832E38)
            r3 = 1
            r1.resolveAttribute(r2, r0, r3)
            int r0 = r0.resourceId
            if (r0 == 0) goto L24
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            android.content.Context r2 = r4.f8446a
            r1.<init>(r2, r0)
            r4.f8447b = r1
            goto L28
        L24:
            android.content.Context r0 = r4.f8446a
            r4.f8447b = r0
        L28:
            android.content.Context r0 = r4.f8447b
            return r0
    }

    @Override // p083f.AbstractC1914a
    /* renamed from: c */
    public void mo4700c(boolean r4) {
            r3 = this;
            boolean r0 = r3.f8453h
            if (r0 != 0) goto L1c
            r0 = 4
            if (r4 == 0) goto L9
            r4 = 4
            goto La
        L9:
            r4 = 0
        La:
            androidx.appcompat.widget.d0 r1 = r3.f8450e
            int r1 = r1.mo683p()
            r2 = 1
            r3.f8453h = r2
            androidx.appcompat.widget.d0 r2 = r3.f8450e
            r4 = r4 & r0
            r0 = r1 & (-5)
            r4 = r4 | r0
            r2.mo682o(r4)
        L1c:
            return
    }

    /* renamed from: d */
    public void m4798d(boolean r9) {
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L15
            boolean r1 = r8.f8463r
            if (r1 != 0) goto L25
            r1 = 1
            r8.f8463r = r1
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = r8.f8448c
            if (r2 == 0) goto L11
            r2.setShowingForActionMode(r1)
        L11:
            r8.m4801g(r0)
            goto L25
        L15:
            boolean r1 = r8.f8463r
            if (r1 == 0) goto L25
            r8.f8463r = r0
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = r8.f8448c
            if (r1 == 0) goto L22
            r1.setShowingForActionMode(r0)
        L22:
            r8.m4801g(r0)
        L25:
            androidx.appcompat.widget.ActionBarContainer r1 = r8.f8449d
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            boolean r1 = p227n0.C4661t.f.m10588c(r1)
            r2 = 4
            r3 = 8
            if (r1 == 0) goto L8a
            r4 = 100
            r6 = 200(0xc8, double:9.9E-322)
            if (r9 == 0) goto L45
            androidx.appcompat.widget.d0 r9 = r8.f8450e
            n0.w r9 = r9.mo686s(r2, r4)
            androidx.appcompat.widget.ActionBarContextView r1 = r8.f8451f
            n0.w r0 = r1.m652e(r0, r6)
            goto L51
        L45:
            androidx.appcompat.widget.d0 r9 = r8.f8450e
            n0.w r0 = r9.mo686s(r0, r6)
            androidx.appcompat.widget.ActionBarContextView r9 = r8.f8451f
            n0.w r9 = r9.m652e(r3, r4)
        L51:
            k.g r1 = new k.g
            r1.<init>()
            java.util.ArrayList<n0.w> r2 = r1.f15994a
            r2.add(r9)
            java.lang.ref.WeakReference<android.view.View> r9 = r9.f18590a
            java.lang.Object r9 = r9.get()
            android.view.View r9 = (android.view.View) r9
            if (r9 == 0) goto L6e
            android.view.ViewPropertyAnimator r9 = r9.animate()
            long r2 = r9.getDuration()
            goto L70
        L6e:
            r2 = 0
        L70:
            java.lang.ref.WeakReference<android.view.View> r9 = r0.f18590a
            java.lang.Object r9 = r9.get()
            android.view.View r9 = (android.view.View) r9
            if (r9 == 0) goto L81
            android.view.ViewPropertyAnimator r9 = r9.animate()
            r9.setStartDelay(r2)
        L81:
            java.util.ArrayList<n0.w> r9 = r1.f15994a
            r9.add(r0)
            r1.m8070b()
            goto La1
        L8a:
            if (r9 == 0) goto L97
            androidx.appcompat.widget.d0 r9 = r8.f8450e
            r9.mo677j(r2)
            androidx.appcompat.widget.ActionBarContextView r9 = r8.f8451f
            r9.setVisibility(r0)
            goto La1
        L97:
            androidx.appcompat.widget.d0 r9 = r8.f8450e
            r9.mo677j(r0)
            androidx.appcompat.widget.ActionBarContextView r9 = r8.f8451f
            r9.setVisibility(r3)
        La1:
            return
    }

    /* renamed from: e */
    public final void m4799e(android.view.View r7) {
            r6 = this;
            r0 = 2131362088(0x7f0a0128, float:1.8343947E38)
            android.view.View r0 = r7.findViewById(r0)
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r6.f8448c = r0
            if (r0 == 0) goto L10
            r0.setActionBarVisibilityCallback(r6)
        L10:
            r0 = 2131361850(0x7f0a003a, float:1.8343464E38)
            android.view.View r0 = r7.findViewById(r0)
            boolean r1 = r0 instanceof androidx.appcompat.widget.InterfaceC0268d0
            if (r1 == 0) goto L1e
            androidx.appcompat.widget.d0 r0 = (androidx.appcompat.widget.InterfaceC0268d0) r0
            goto L28
        L1e:
            boolean r1 = r0 instanceof androidx.appcompat.widget.Toolbar
            if (r1 == 0) goto Le3
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            androidx.appcompat.widget.d0 r0 = r0.getWrapper()
        L28:
            r6.f8450e = r0
            r0 = 2131361858(0x7f0a0042, float:1.834348E38)
            android.view.View r0 = r7.findViewById(r0)
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r6.f8451f = r0
            r0 = 2131361852(0x7f0a003c, float:1.8343468E38)
            android.view.View r7 = r7.findViewById(r0)
            androidx.appcompat.widget.ActionBarContainer r7 = (androidx.appcompat.widget.ActionBarContainer) r7
            r6.f8449d = r7
            androidx.appcompat.widget.d0 r0 = r6.f8450e
            if (r0 == 0) goto Lc6
            androidx.appcompat.widget.ActionBarContextView r1 = r6.f8451f
            if (r1 == 0) goto Lc6
            if (r7 == 0) goto Lc6
            android.content.Context r7 = r0.mo670c()
            r6.f8446a = r7
            androidx.appcompat.widget.d0 r7 = r6.f8450e
            int r7 = r7.mo683p()
            r7 = r7 & 4
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L5e
            r7 = 1
            goto L5f
        L5e:
            r7 = 0
        L5f:
            if (r7 == 0) goto L63
            r6.f8453h = r0
        L63:
            android.content.Context r2 = r6.f8446a
            android.content.pm.ApplicationInfo r3 = r2.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            r4 = 14
            if (r3 >= r4) goto L71
            r3 = 1
            goto L72
        L71:
            r3 = 0
        L72:
            if (r3 != 0) goto L79
            if (r7 == 0) goto L77
            goto L79
        L77:
            r7 = 0
            goto L7a
        L79:
            r7 = 1
        L7a:
            androidx.appcompat.widget.d0 r3 = r6.f8450e
            r3.mo680m(r7)
            android.content.res.Resources r7 = r2.getResources()
            r2 = 2131034112(0x7f050000, float:1.7678732E38)
            boolean r7 = r7.getBoolean(r2)
            r6.m4800f(r7)
            android.content.Context r7 = r6.f8446a
            r2 = 0
            int[] r3 = p064e.C1495i.f7258a
            r5 = 2130968582(0x7f040006, float:1.7545822E38)
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r2, r3, r5, r1)
            boolean r2 = r7.getBoolean(r4, r1)
            if (r2 == 0) goto Lb2
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = r6.f8448c
            boolean r3 = r2.f935h0
            if (r3 == 0) goto Laa
            r6.f8467v = r0
            r2.setHideOnContentScrollEnabled(r0)
            goto Lb2
        Laa:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"
            r7.<init>(r0)
            throw r7
        Lb2:
            r0 = 12
            int r0 = r7.getDimensionPixelSize(r0, r1)
            if (r0 == 0) goto Lc2
            float r0 = (float) r0
            androidx.appcompat.widget.ActionBarContainer r1 = r6.f8449d
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            p227n0.C4661t.h.m10614s(r1, r0)
        Lc2:
            r7.recycle()
            return
        Lc6:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<f.x> r1 = p083f.C1937x.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " can only be used with a compatible window decor layout"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        Le3:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't make a decor toolbar out of "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            if (r0 == 0) goto Lf6
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            goto Lf8
        Lf6:
            java.lang.String r0 = "null"
        Lf8:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.<init>(r0)
            throw r7
    }

    /* renamed from: f */
    public final void m4800f(boolean r5) {
            r4 = this;
            r4.f8459n = r5
            r0 = 0
            if (r5 != 0) goto L10
            androidx.appcompat.widget.d0 r5 = r4.f8450e
            r5.mo678k(r0)
            androidx.appcompat.widget.ActionBarContainer r5 = r4.f8449d
            r5.setTabContainer(r0)
            goto L1a
        L10:
            androidx.appcompat.widget.ActionBarContainer r5 = r4.f8449d
            r5.setTabContainer(r0)
            androidx.appcompat.widget.d0 r5 = r4.f8450e
            r5.mo678k(r0)
        L1a:
            androidx.appcompat.widget.d0 r5 = r4.f8450e
            int r5 = r5.mo685r()
            r0 = 2
            r1 = 1
            r2 = 0
            if (r5 != r0) goto L27
            r5 = 1
            goto L28
        L27:
            r5 = 0
        L28:
            androidx.appcompat.widget.d0 r0 = r4.f8450e
            boolean r3 = r4.f8459n
            if (r3 != 0) goto L32
            if (r5 == 0) goto L32
            r3 = 1
            goto L33
        L32:
            r3 = 0
        L33:
            r0.mo689v(r3)
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r4.f8448c
            boolean r3 = r4.f8459n
            if (r3 != 0) goto L3f
            if (r5 == 0) goto L3f
            goto L40
        L3f:
            r1 = 0
        L40:
            r0.setHasNonEmbeddedTabs(r1)
            return
    }

    /* renamed from: g */
    public final void m4801g(boolean r9) {
            r8 = this;
            boolean r0 = r8.f8462q
            boolean r1 = r8.f8463r
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L9
            goto Ld
        L9:
            if (r0 == 0) goto Ld
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            r4 = 250(0xfa, double:1.235E-321)
            r1 = 2
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            if (r0 == 0) goto Lcb
            boolean r0 = r8.f8464s
            if (r0 != 0) goto L155
            r8.f8464s = r2
            k.g r0 = r8.f8465t
            if (r0 == 0) goto L23
            r0.m8069a()
        L23:
            androidx.appcompat.widget.ActionBarContainer r0 = r8.f8449d
            r0.setVisibility(r3)
            int r0 = r8.f8460o
            r3 = 0
            if (r0 != 0) goto La6
            boolean r0 = r8.f8466u
            if (r0 != 0) goto L33
            if (r9 == 0) goto La6
        L33:
            androidx.appcompat.widget.ActionBarContainer r0 = r8.f8449d
            r0.setTranslationY(r3)
            androidx.appcompat.widget.ActionBarContainer r0 = r8.f8449d
            int r0 = r0.getHeight()
            int r0 = -r0
            float r0 = (float) r0
            if (r9 == 0) goto L50
            int[] r9 = new int[r1]
            r9 = {x0156: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            androidx.appcompat.widget.ActionBarContainer r1 = r8.f8449d
            r1.getLocationInWindow(r9)
            r9 = r9[r2]
            float r9 = (float) r9
            float r0 = r0 - r9
        L50:
            androidx.appcompat.widget.ActionBarContainer r9 = r8.f8449d
            r9.setTranslationY(r0)
            k.g r9 = new k.g
            r9.<init>()
            androidx.appcompat.widget.ActionBarContainer r1 = r8.f8449d
            n0.w r1 = p227n0.C4661t.m10526b(r1)
            r1.m10674g(r3)
            n0.z r2 = r8.f8470y
            r1.m10673f(r2)
            boolean r2 = r9.f15998e
            if (r2 != 0) goto L71
            java.util.ArrayList<n0.w> r2 = r9.f15994a
            r2.add(r1)
        L71:
            boolean r1 = r8.f8461p
            if (r1 == 0) goto L8e
            android.view.View r1 = r8.f8452g
            if (r1 == 0) goto L8e
            r1.setTranslationY(r0)
            android.view.View r0 = r8.f8452g
            n0.w r0 = p227n0.C4661t.m10526b(r0)
            r0.m10674g(r3)
            boolean r1 = r9.f15998e
            if (r1 != 0) goto L8e
            java.util.ArrayList<n0.w> r1 = r9.f15994a
            r1.add(r0)
        L8e:
            android.view.animation.Interpolator r0 = p083f.C1937x.f8444A
            boolean r1 = r9.f15998e
            if (r1 != 0) goto L96
            r9.f15996c = r0
        L96:
            if (r1 != 0) goto L9a
            r9.f15995b = r4
        L9a:
            n0.x r0 = r8.f8469x
            if (r1 != 0) goto La0
            r9.f15997d = r0
        La0:
            r8.f8465t = r9
            r9.m8070b()
            goto Lc0
        La6:
            androidx.appcompat.widget.ActionBarContainer r9 = r8.f8449d
            r9.setAlpha(r6)
            androidx.appcompat.widget.ActionBarContainer r9 = r8.f8449d
            r9.setTranslationY(r3)
            boolean r9 = r8.f8461p
            if (r9 == 0) goto Lbb
            android.view.View r9 = r8.f8452g
            if (r9 == 0) goto Lbb
            r9.setTranslationY(r3)
        Lbb:
            n0.x r9 = r8.f8469x
            r9.mo654b(r7)
        Lc0:
            androidx.appcompat.widget.ActionBarOverlayLayout r9 = r8.f8448c
            if (r9 == 0) goto L155
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            p227n0.C4661t.g.m10595c(r9)
            goto L155
        Lcb:
            boolean r0 = r8.f8464s
            if (r0 == 0) goto L155
            r8.f8464s = r3
            k.g r0 = r8.f8465t
            if (r0 == 0) goto Ld8
            r0.m8069a()
        Ld8:
            int r0 = r8.f8460o
            if (r0 != 0) goto L150
            boolean r0 = r8.f8466u
            if (r0 != 0) goto Le2
            if (r9 == 0) goto L150
        Le2:
            androidx.appcompat.widget.ActionBarContainer r0 = r8.f8449d
            r0.setAlpha(r6)
            androidx.appcompat.widget.ActionBarContainer r0 = r8.f8449d
            r0.setTransitioning(r2)
            k.g r0 = new k.g
            r0.<init>()
            androidx.appcompat.widget.ActionBarContainer r3 = r8.f8449d
            int r3 = r3.getHeight()
            int r3 = -r3
            float r3 = (float) r3
            if (r9 == 0) goto L109
            int[] r9 = new int[r1]
            r9 = {x015e: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            androidx.appcompat.widget.ActionBarContainer r1 = r8.f8449d
            r1.getLocationInWindow(r9)
            r9 = r9[r2]
            float r9 = (float) r9
            float r3 = r3 - r9
        L109:
            androidx.appcompat.widget.ActionBarContainer r9 = r8.f8449d
            n0.w r9 = p227n0.C4661t.m10526b(r9)
            r9.m10674g(r3)
            n0.z r1 = r8.f8470y
            r9.m10673f(r1)
            boolean r1 = r0.f15998e
            if (r1 != 0) goto L120
            java.util.ArrayList<n0.w> r1 = r0.f15994a
            r1.add(r9)
        L120:
            boolean r9 = r8.f8461p
            if (r9 == 0) goto L138
            android.view.View r9 = r8.f8452g
            if (r9 == 0) goto L138
            n0.w r9 = p227n0.C4661t.m10526b(r9)
            r9.m10674g(r3)
            boolean r1 = r0.f15998e
            if (r1 != 0) goto L138
            java.util.ArrayList<n0.w> r1 = r0.f15994a
            r1.add(r9)
        L138:
            android.view.animation.Interpolator r9 = p083f.C1937x.f8445z
            boolean r1 = r0.f15998e
            if (r1 != 0) goto L140
            r0.f15996c = r9
        L140:
            if (r1 != 0) goto L144
            r0.f15995b = r4
        L144:
            n0.x r9 = r8.f8468w
            if (r1 != 0) goto L14a
            r0.f15997d = r9
        L14a:
            r8.f8465t = r0
            r0.m8070b()
            goto L155
        L150:
            n0.x r9 = r8.f8468w
            r9.mo654b(r7)
        L155:
            return
    }
}
