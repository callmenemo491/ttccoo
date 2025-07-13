package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.a1 */
/* loaded from: classes.dex */
public class C0260a1 implements androidx.appcompat.widget.InterfaceC0268d0 {

    /* renamed from: a */
    public androidx.appcompat.widget.Toolbar f1202a;

    /* renamed from: b */
    public int f1203b;

    /* renamed from: c */
    public android.view.View f1204c;

    /* renamed from: d */
    public android.view.View f1205d;

    /* renamed from: e */
    public android.graphics.drawable.Drawable f1206e;

    /* renamed from: f */
    public android.graphics.drawable.Drawable f1207f;

    /* renamed from: g */
    public android.graphics.drawable.Drawable f1208g;

    /* renamed from: h */
    public boolean f1209h;

    /* renamed from: i */
    public java.lang.CharSequence f1210i;

    /* renamed from: j */
    public java.lang.CharSequence f1211j;

    /* renamed from: k */
    public java.lang.CharSequence f1212k;

    /* renamed from: l */
    public android.view.Window.Callback f1213l;

    /* renamed from: m */
    public boolean f1214m;

    /* renamed from: n */
    public androidx.appcompat.widget.C0264c f1215n;

    /* renamed from: o */
    public int f1216o;

    /* renamed from: p */
    public android.graphics.drawable.Drawable f1217p;

    /* renamed from: androidx.appcompat.widget.a1$a */
    public class a extends p227n0.C4666y {

        /* renamed from: a */
        public boolean f1218a;

        /* renamed from: b */
        public final /* synthetic */ int f1219b;

        /* renamed from: c */
        public final /* synthetic */ androidx.appcompat.widget.C0260a1 f1220c;

        public a(androidx.appcompat.widget.C0260a1 r1, int r2) {
                r0 = this;
                r0.f1220c = r1
                r0.f1219b = r2
                r0.<init>()
                r1 = 0
                r0.f1218a = r1
                return
        }

        @Override // p227n0.C4666y, p227n0.InterfaceC4665x
        /* renamed from: a */
        public void mo653a(android.view.View r1) {
                r0 = this;
                r1 = 1
                r0.f1218a = r1
                return
        }

        @Override // p227n0.InterfaceC4665x
        /* renamed from: b */
        public void mo654b(android.view.View r2) {
                r1 = this;
                boolean r2 = r1.f1218a
                if (r2 != 0) goto Ld
                androidx.appcompat.widget.a1 r2 = r1.f1220c
                androidx.appcompat.widget.Toolbar r2 = r2.f1202a
                int r0 = r1.f1219b
                r2.setVisibility(r0)
            Ld:
                return
        }

        @Override // p227n0.C4666y, p227n0.InterfaceC4665x
        /* renamed from: c */
        public void mo655c(android.view.View r2) {
                r1 = this;
                androidx.appcompat.widget.a1 r2 = r1.f1220c
                androidx.appcompat.widget.Toolbar r2 = r2.f1202a
                r0 = 0
                r2.setVisibility(r0)
                return
        }
    }

    public C0260a1(androidx.appcompat.widget.Toolbar r6, boolean r7) {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.f1216o = r0
            r5.f1202a = r6
            java.lang.CharSequence r1 = r6.getTitle()
            r5.f1210i = r1
            java.lang.CharSequence r1 = r6.getSubtitle()
            r5.f1211j = r1
            java.lang.CharSequence r1 = r5.f1210i
            r2 = 1
            if (r1 == 0) goto L1b
            r1 = 1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            r5.f1209h = r1
            android.graphics.drawable.Drawable r1 = r6.getNavigationIcon()
            r5.f1208g = r1
            android.content.Context r6 = r6.getContext()
            int[] r1 = p064e.C1495i.f7258a
            r3 = 2130968582(0x7f040006, float:1.7545822E38)
            r4 = 0
            androidx.appcompat.widget.y0 r6 = androidx.appcompat.widget.C0314y0.m848r(r6, r4, r1, r3, r0)
            r1 = 15
            android.graphics.drawable.Drawable r3 = r6.m855g(r1)
            r5.f1217p = r3
            if (r7 == 0) goto L14f
            r7 = 27
            java.lang.CharSequence r7 = r6.m863o(r7)
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L57
            r5.f1209h = r2
            r5.f1210i = r7
            int r1 = r5.f1203b
            r1 = r1 & 8
            if (r1 == 0) goto L57
            androidx.appcompat.widget.Toolbar r1 = r5.f1202a
            r1.setTitle(r7)
        L57:
            r7 = 25
            java.lang.CharSequence r7 = r6.m863o(r7)
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L70
            r5.f1211j = r7
            int r1 = r5.f1203b
            r1 = r1 & 8
            if (r1 == 0) goto L70
            androidx.appcompat.widget.Toolbar r1 = r5.f1202a
            r1.setSubtitle(r7)
        L70:
            r7 = 20
            android.graphics.drawable.Drawable r7 = r6.m855g(r7)
            if (r7 == 0) goto L7d
            r5.f1207f = r7
            r5.m692y()
        L7d:
            r7 = 17
            android.graphics.drawable.Drawable r7 = r6.m855g(r7)
            if (r7 == 0) goto L8a
            r5.f1206e = r7
            r5.m692y()
        L8a:
            android.graphics.drawable.Drawable r7 = r5.f1208g
            if (r7 != 0) goto L97
            android.graphics.drawable.Drawable r7 = r5.f1217p
            if (r7 == 0) goto L97
            r5.f1208g = r7
            r5.m691x()
        L97:
            r7 = 10
            int r7 = r6.m858j(r7, r0)
            r5.mo682o(r7)
            r7 = 9
            int r7 = r6.m861m(r7, r0)
            if (r7 == 0) goto Ldd
            androidx.appcompat.widget.Toolbar r1 = r5.f1202a
            android.content.Context r1 = r1.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            androidx.appcompat.widget.Toolbar r2 = r5.f1202a
            android.view.View r7 = r1.inflate(r7, r2, r0)
            android.view.View r1 = r5.f1205d
            if (r1 == 0) goto Lc7
            int r2 = r5.f1203b
            r2 = r2 & 16
            if (r2 == 0) goto Lc7
            androidx.appcompat.widget.Toolbar r2 = r5.f1202a
            r2.removeView(r1)
        Lc7:
            r5.f1205d = r7
            if (r7 == 0) goto Ld6
            int r1 = r5.f1203b
            r1 = r1 & 16
            if (r1 == 0) goto Ld6
            androidx.appcompat.widget.Toolbar r1 = r5.f1202a
            r1.addView(r7)
        Ld6:
            int r7 = r5.f1203b
            r7 = r7 | 16
            r5.mo682o(r7)
        Ldd:
            r7 = 13
            int r7 = r6.m860l(r7, r0)
            if (r7 <= 0) goto Lf2
            androidx.appcompat.widget.Toolbar r1 = r5.f1202a
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r1.height = r7
            androidx.appcompat.widget.Toolbar r7 = r5.f1202a
            r7.setLayoutParams(r1)
        Lf2:
            r7 = 7
            r1 = -1
            int r7 = r6.m853e(r7, r1)
            r2 = 3
            int r1 = r6.m853e(r2, r1)
            if (r7 >= 0) goto L101
            if (r1 < 0) goto L113
        L101:
            androidx.appcompat.widget.Toolbar r2 = r5.f1202a
            int r7 = java.lang.Math.max(r7, r0)
            int r1 = java.lang.Math.max(r1, r0)
            r2.m625d()
            androidx.appcompat.widget.o0 r2 = r2.f1156t0
            r2.m773a(r7, r1)
        L113:
            r7 = 28
            int r7 = r6.m861m(r7, r0)
            if (r7 == 0) goto L12a
            androidx.appcompat.widget.Toolbar r1 = r5.f1202a
            android.content.Context r2 = r1.getContext()
            r1.f1148l0 = r7
            android.widget.TextView r1 = r1.f1138b0
            if (r1 == 0) goto L12a
            r1.setTextAppearance(r2, r7)
        L12a:
            r7 = 26
            int r7 = r6.m861m(r7, r0)
            if (r7 == 0) goto L141
            androidx.appcompat.widget.Toolbar r1 = r5.f1202a
            android.content.Context r2 = r1.getContext()
            r1.f1149m0 = r7
            android.widget.TextView r1 = r1.f1139c0
            if (r1 == 0) goto L141
            r1.setTextAppearance(r2, r7)
        L141:
            r7 = 22
            int r7 = r6.m861m(r7, r0)
            if (r7 == 0) goto L164
            androidx.appcompat.widget.Toolbar r0 = r5.f1202a
            r0.setPopupTheme(r7)
            goto L164
        L14f:
            androidx.appcompat.widget.Toolbar r7 = r5.f1202a
            android.graphics.drawable.Drawable r7 = r7.getNavigationIcon()
            if (r7 == 0) goto L160
            androidx.appcompat.widget.Toolbar r7 = r5.f1202a
            android.graphics.drawable.Drawable r7 = r7.getNavigationIcon()
            r5.f1217p = r7
            goto L162
        L160:
            r1 = 11
        L162:
            r5.f1203b = r1
        L164:
            android.content.res.TypedArray r6 = r6.f1501b
            r6.recycle()
            int r6 = r5.f1216o
            r7 = 2131951617(0x7f130001, float:1.9539654E38)
            if (r7 != r6) goto L171
            goto L191
        L171:
            r5.f1216o = r7
            androidx.appcompat.widget.Toolbar r6 = r5.f1202a
            java.lang.CharSequence r6 = r6.getNavigationContentDescription()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L191
            int r6 = r5.f1216o
            if (r6 != 0) goto L184
            goto L18c
        L184:
            android.content.Context r7 = r5.mo670c()
            java.lang.String r4 = r7.getString(r6)
        L18c:
            r5.f1212k = r4
            r5.m690w()
        L191:
            androidx.appcompat.widget.Toolbar r6 = r5.f1202a
            java.lang.CharSequence r6 = r6.getNavigationContentDescription()
            r5.f1212k = r6
            androidx.appcompat.widget.Toolbar r6 = r5.f1202a
            androidx.appcompat.widget.z0 r7 = new androidx.appcompat.widget.z0
            r7.<init>(r5)
            r6.setNavigationOnClickListener(r7)
            return
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    /* renamed from: a */
    public void mo668a(android.view.Menu r6, androidx.appcompat.view.menu.InterfaceC0215i.a r7) {
            r5 = this;
            androidx.appcompat.widget.c r0 = r5.f1215n
            if (r0 != 0) goto L16
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            androidx.appcompat.widget.Toolbar r1 = r5.f1202a
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            r5.f1215n = r0
            r1 = 2131361862(0x7f0a0046, float:1.8343488E38)
            r0.f756g0 = r1
        L16:
            androidx.appcompat.widget.c r0 = r5.f1215n
            r0.f752c0 = r7
            androidx.appcompat.widget.Toolbar r7 = r5.f1202a
            androidx.appcompat.view.menu.e r6 = (androidx.appcompat.view.menu.C0211e) r6
            if (r6 != 0) goto L25
            androidx.appcompat.widget.ActionMenuView r1 = r7.f1137a0
            if (r1 != 0) goto L25
            goto L83
        L25:
            r7.m627f()
            androidx.appcompat.widget.ActionMenuView r1 = r7.f1137a0
            androidx.appcompat.view.menu.e r1 = r1.f958p0
            if (r1 != r6) goto L2f
            goto L83
        L2f:
            if (r1 == 0) goto L3b
            androidx.appcompat.widget.c r2 = r7.f1133J0
            r1.m517t(r2)
            androidx.appcompat.widget.Toolbar$d r2 = r7.f1134K0
            r1.m517t(r2)
        L3b:
            androidx.appcompat.widget.Toolbar$d r1 = r7.f1134K0
            if (r1 != 0) goto L46
            androidx.appcompat.widget.Toolbar$d r1 = new androidx.appcompat.widget.Toolbar$d
            r1.<init>(r7)
            r7.f1134K0 = r1
        L46:
            r1 = 1
            r0.f1232p0 = r1
            if (r6 == 0) goto L58
            android.content.Context r1 = r7.f1146j0
            r6.m499b(r0, r1)
            androidx.appcompat.widget.Toolbar$d r1 = r7.f1134K0
            android.content.Context r2 = r7.f1146j0
            r6.m499b(r1, r2)
            goto L75
        L58:
            android.content.Context r6 = r7.f1146j0
            r2 = 0
            r0.mo493s(r6, r2)
            androidx.appcompat.widget.Toolbar$d r6 = r7.f1134K0
            androidx.appcompat.view.menu.e r3 = r6.f1166Y
            if (r3 == 0) goto L6b
            androidx.appcompat.view.menu.g r4 = r6.f1167Z
            if (r4 == 0) goto L6b
            r3.mo501d(r4)
        L6b:
            r6.f1166Y = r2
            r0.mo487v(r1)
            androidx.appcompat.widget.Toolbar$d r6 = r7.f1134K0
            r6.mo487v(r1)
        L75:
            androidx.appcompat.widget.ActionMenuView r6 = r7.f1137a0
            int r1 = r7.f1147k0
            r6.setPopupTheme(r1)
            androidx.appcompat.widget.ActionMenuView r6 = r7.f1137a0
            r6.setPresenter(r0)
            r7.f1133J0 = r0
        L83:
            return
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    /* renamed from: b */
    public boolean mo669b() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f1202a
            boolean r0 = r0.m638p()
            return r0
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    /* renamed from: c */
    public android.content.Context mo670c() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f1202a
            android.content.Context r0 = r0.getContext()
            return r0
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    public void collapseActionView() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f1202a
            androidx.appcompat.widget.Toolbar$d r0 = r0.f1134K0
            if (r0 != 0) goto L8
            r0 = 0
            goto La
        L8:
            androidx.appcompat.view.menu.g r0 = r0.f1167Z
        La:
            if (r0 == 0) goto Lf
            r0.collapseActionView()
        Lf:
            return
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    /* renamed from: d */
    public void mo671d() {
            r1 = this;
            r0 = 1
            r1.f1214m = r0
            return
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    /* renamed from: e */
    public boolean mo672e() {
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f1202a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f1137a0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L22
            androidx.appcompat.widget.c r0 = r0.f962t0
            if (r0 == 0) goto L1e
            androidx.appcompat.widget.c$c r3 = r0.f1236t0
            if (r3 != 0) goto L19
            boolean r0 = r0.m698f()
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = 0
            goto L1a
        L19:
            r0 = 1
        L1a:
            if (r0 == 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 == 0) goto L22
            r1 = 1
        L22:
            return r1
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    /* renamed from: f */
    public boolean mo673f() {
            r3 = this;
            androidx.appcompat.widget.Toolbar r0 = r3.f1202a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f1137a0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            androidx.appcompat.widget.c r0 = r0.f962t0
            if (r0 == 0) goto L14
            boolean r0 = r0.m696d()
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L18
            r1 = 1
        L18:
            return r1
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    /* renamed from: g */
    public boolean mo674g() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f1202a
            boolean r0 = r0.m645v()
            return r0
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    public java.lang.CharSequence getTitle() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f1202a
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    /* renamed from: h */
    public boolean mo675h() {
            r2 = this;
            androidx.appcompat.widget.Toolbar r0 = r2.f1202a
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L12
            androidx.appcompat.widget.ActionMenuView r0 = r0.f1137a0
            if (r0 == 0) goto L12
            boolean r0 = r0.f961s0
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    /* renamed from: i */
    public void mo676i() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f1202a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f1137a0
            if (r0 == 0) goto Ld
            androidx.appcompat.widget.c r0 = r0.f962t0
            if (r0 == 0) goto Ld
            r0.m694b()
        Ld:
            return
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    /* renamed from: j */
    public void mo677j(int r2) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f1202a
            r0.setVisibility(r2)
            return
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    /* renamed from: k */
    public void mo678k(androidx.appcompat.widget.C0296p0 r2) {
            r1 = this;
            android.view.View r2 = r1.f1204c
            if (r2 == 0) goto L11
            android.view.ViewParent r2 = r2.getParent()
            androidx.appcompat.widget.Toolbar r0 = r1.f1202a
            if (r2 != r0) goto L11
            android.view.View r2 = r1.f1204c
            r0.removeView(r2)
        L11:
            r2 = 0
            r1.f1204c = r2
            return
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    /* renamed from: l */
    public android.view.ViewGroup mo679l() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f1202a
            return r0
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    /* renamed from: m */
    public void mo680m(boolean r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    /* renamed from: n */
    public boolean mo681n() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f1202a
            androidx.appcompat.widget.Toolbar$d r0 = r0.f1134K0
            if (r0 == 0) goto Lc
            androidx.appcompat.view.menu.g r0 = r0.f1167Z
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    /* renamed from: o */
    public void mo682o(int r4) {
            r3 = this;
            int r0 = r3.f1203b
            r0 = r0 ^ r4
            r3.f1203b = r4
            if (r0 == 0) goto L52
            r1 = r0 & 4
            if (r1 == 0) goto L15
            r1 = r4 & 4
            if (r1 == 0) goto L12
            r3.m690w()
        L12:
            r3.m691x()
        L15:
            r1 = r0 & 3
            if (r1 == 0) goto L1c
            r3.m692y()
        L1c:
            r1 = r0 & 8
            if (r1 == 0) goto L3b
            r1 = r4 & 8
            if (r1 == 0) goto L30
            androidx.appcompat.widget.Toolbar r1 = r3.f1202a
            java.lang.CharSequence r2 = r3.f1210i
            r1.setTitle(r2)
            androidx.appcompat.widget.Toolbar r1 = r3.f1202a
            java.lang.CharSequence r2 = r3.f1211j
            goto L38
        L30:
            androidx.appcompat.widget.Toolbar r1 = r3.f1202a
            r2 = 0
            r1.setTitle(r2)
            androidx.appcompat.widget.Toolbar r1 = r3.f1202a
        L38:
            r1.setSubtitle(r2)
        L3b:
            r0 = r0 & 16
            if (r0 == 0) goto L52
            android.view.View r0 = r3.f1205d
            if (r0 == 0) goto L52
            r4 = r4 & 16
            if (r4 == 0) goto L4d
            androidx.appcompat.widget.Toolbar r4 = r3.f1202a
            r4.addView(r0)
            goto L52
        L4d:
            androidx.appcompat.widget.Toolbar r4 = r3.f1202a
            r4.removeView(r0)
        L52:
            return
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    /* renamed from: p */
    public int mo683p() {
            r1 = this;
            int r0 = r1.f1203b
            return r0
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    /* renamed from: q */
    public void mo684q(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.mo670c()
            android.graphics.drawable.Drawable r2 = p102g.C2199a.m5784b(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.f1207f = r2
            r1.m692y()
            return
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    /* renamed from: r */
    public int mo685r() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    /* renamed from: s */
    public p227n0.C4664w mo686s(int r3, long r4) {
            r2 = this;
            androidx.appcompat.widget.Toolbar r0 = r2.f1202a
            n0.w r0 = p227n0.C4661t.m10526b(r0)
            if (r3 != 0) goto Lb
            r1 = 1065353216(0x3f800000, float:1.0)
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r0.m10668a(r1)
            r0.m10670c(r4)
            androidx.appcompat.widget.a1$a r4 = new androidx.appcompat.widget.a1$a
            r4.<init>(r2, r3)
            java.lang.ref.WeakReference<android.view.View> r3 = r0.f18590a
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L24
            r0.m10672e(r3, r4)
        L24:
            return r0
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    public void setIcon(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.mo670c()
            android.graphics.drawable.Drawable r2 = p102g.C2199a.m5784b(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.f1206e = r2
            r1.m692y()
            return
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    public void setIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.f1206e = r1
            r0.m692y()
            return
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    public void setWindowCallback(android.view.Window.Callback r1) {
            r0 = this;
            r0.f1213l = r1
            return
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    public void setWindowTitle(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = r1.f1209h
            if (r0 != 0) goto L11
            r1.f1210i = r2
            int r0 = r1.f1203b
            r0 = r0 & 8
            if (r0 == 0) goto L11
            androidx.appcompat.widget.Toolbar r0 = r1.f1202a
            r0.setTitle(r2)
        L11:
            return
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    /* renamed from: t */
    public void mo687t() {
            r2 = this;
            java.lang.String r0 = "ToolbarWidgetWrapper"
            java.lang.String r1 = "Progress display unsupported"
            android.util.Log.i(r0, r1)
            return
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    /* renamed from: u */
    public void mo688u() {
            r2 = this;
            java.lang.String r0 = "ToolbarWidgetWrapper"
            java.lang.String r1 = "Progress display unsupported"
            android.util.Log.i(r0, r1)
            return
    }

    @Override // androidx.appcompat.widget.InterfaceC0268d0
    /* renamed from: v */
    public void mo689v(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.f1202a
            r0.setCollapsible(r2)
            return
    }

    /* renamed from: w */
    public final void m690w() {
            r2 = this;
            int r0 = r2.f1203b
            r0 = r0 & 4
            if (r0 == 0) goto L1d
            java.lang.CharSequence r0 = r2.f1212k
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L16
            androidx.appcompat.widget.Toolbar r0 = r2.f1202a
            int r1 = r2.f1216o
            r0.setNavigationContentDescription(r1)
            goto L1d
        L16:
            androidx.appcompat.widget.Toolbar r0 = r2.f1202a
            java.lang.CharSequence r1 = r2.f1212k
            r0.setNavigationContentDescription(r1)
        L1d:
            return
    }

    /* renamed from: x */
    public final void m691x() {
            r2 = this;
            int r0 = r2.f1203b
            r0 = r0 & 4
            if (r0 == 0) goto L10
            androidx.appcompat.widget.Toolbar r0 = r2.f1202a
            android.graphics.drawable.Drawable r1 = r2.f1208g
            if (r1 == 0) goto Ld
            goto L13
        Ld:
            android.graphics.drawable.Drawable r1 = r2.f1217p
            goto L13
        L10:
            androidx.appcompat.widget.Toolbar r0 = r2.f1202a
            r1 = 0
        L13:
            r0.setNavigationIcon(r1)
            return
    }

    /* renamed from: y */
    public final void m692y() {
            r2 = this;
            int r0 = r2.f1203b
            r1 = r0 & 2
            if (r1 == 0) goto L12
            r0 = r0 & 1
            if (r0 == 0) goto Lf
            android.graphics.drawable.Drawable r0 = r2.f1207f
            if (r0 == 0) goto Lf
            goto L13
        Lf:
            android.graphics.drawable.Drawable r0 = r2.f1206e
            goto L13
        L12:
            r0 = 0
        L13:
            androidx.appcompat.widget.Toolbar r1 = r2.f1202a
            r1.setLogo(r0)
            return
    }
}
