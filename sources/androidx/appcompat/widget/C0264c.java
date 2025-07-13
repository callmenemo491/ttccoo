package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.c */
/* loaded from: classes.dex */
public class C0264c extends androidx.appcompat.view.menu.AbstractC0207a {

    /* renamed from: h0 */
    public androidx.appcompat.widget.C0264c.d f1224h0;

    /* renamed from: i0 */
    public android.graphics.drawable.Drawable f1225i0;

    /* renamed from: j0 */
    public boolean f1226j0;

    /* renamed from: k0 */
    public boolean f1227k0;

    /* renamed from: l0 */
    public boolean f1228l0;

    /* renamed from: m0 */
    public int f1229m0;

    /* renamed from: n0 */
    public int f1230n0;

    /* renamed from: o0 */
    public int f1231o0;

    /* renamed from: p0 */
    public boolean f1232p0;

    /* renamed from: q0 */
    public final android.util.SparseBooleanArray f1233q0;

    /* renamed from: r0 */
    public androidx.appcompat.widget.C0264c.e f1234r0;

    /* renamed from: s0 */
    public androidx.appcompat.widget.C0264c.a f1235s0;

    /* renamed from: t0 */
    public androidx.appcompat.widget.C0264c.c f1236t0;

    /* renamed from: u0 */
    public androidx.appcompat.widget.C0264c.b f1237u0;

    /* renamed from: v0 */
    public final androidx.appcompat.widget.C0264c.f f1238v0;

    /* renamed from: w0 */
    public int f1239w0;

    /* renamed from: androidx.appcompat.widget.c$a */
    public class a extends androidx.appcompat.view.menu.C0214h {

        /* renamed from: m */
        public final /* synthetic */ androidx.appcompat.widget.C0264c f1240m;

        public a(androidx.appcompat.widget.C0264c r8, android.content.Context r9, androidx.appcompat.view.menu.SubMenuC0218l r10, android.view.View r11) {
                r7 = this;
                r7.f1240m = r8
                r4 = 0
                r5 = 2130968609(0x7f040021, float:1.7545876E38)
                r6 = 0
                r0 = r7
                r1 = r9
                r2 = r10
                r3 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6)
                androidx.appcompat.view.menu.g r9 = r10.f901A
                boolean r9 = r9.m533g()
                if (r9 != 0) goto L20
                androidx.appcompat.widget.c$d r9 = r8.f1224h0
                if (r9 != 0) goto L1e
                androidx.appcompat.view.menu.j r9 = r8.f755f0
                android.view.View r9 = (android.view.View) r9
            L1e:
                r7.f871f = r9
            L20:
                androidx.appcompat.widget.c$f r8 = r8.f1238v0
                r7.m544d(r8)
                return
        }

        @Override // androidx.appcompat.view.menu.C0214h
        /* renamed from: c */
        public void mo543c() {
                r2 = this;
                androidx.appcompat.widget.c r0 = r2.f1240m
                r1 = 0
                r0.f1235s0 = r1
                r1 = 0
                r0.f1239w0 = r1
                super.mo543c()
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    public class b extends androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0206b {

        /* renamed from: a */
        public final /* synthetic */ androidx.appcompat.widget.C0264c f1241a;

        public b(androidx.appcompat.widget.C0264c r1) {
                r0 = this;
                r0.f1241a = r1
                r0.<init>()
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c */
    public class c implements java.lang.Runnable {

        /* renamed from: Y */
        public androidx.appcompat.widget.C0264c.e f1242Y;

        /* renamed from: Z */
        public final /* synthetic */ androidx.appcompat.widget.C0264c f1243Z;

        public c(androidx.appcompat.widget.C0264c r1, androidx.appcompat.widget.C0264c.e r2) {
                r0 = this;
                r0.f1243Z = r1
                r0.<init>()
                r0.f1242Y = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.appcompat.widget.c r0 = r2.f1243Z
                androidx.appcompat.view.menu.e r0 = r0.f750a0
                if (r0 == 0) goto Ld
                androidx.appcompat.view.menu.e$a r1 = r0.f812e
                if (r1 == 0) goto Ld
                r1.mo524b(r0)
            Ld:
                androidx.appcompat.widget.c r0 = r2.f1243Z
                androidx.appcompat.view.menu.j r0 = r0.f755f0
                android.view.View r0 = (android.view.View) r0
                if (r0 == 0) goto L29
                android.os.IBinder r0 = r0.getWindowToken()
                if (r0 == 0) goto L29
                androidx.appcompat.widget.c$e r0 = r2.f1242Y
                boolean r0 = r0.m546f()
                if (r0 == 0) goto L29
                androidx.appcompat.widget.c r0 = r2.f1243Z
                androidx.appcompat.widget.c$e r1 = r2.f1242Y
                r0.f1234r0 = r1
            L29:
                androidx.appcompat.widget.c r0 = r2.f1243Z
                r1 = 0
                r0.f1236t0 = r1
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    public class d extends androidx.appcompat.widget.AppCompatImageView implements androidx.appcompat.widget.ActionMenuView.InterfaceC0225a {

        /* renamed from: c0 */
        public final /* synthetic */ androidx.appcompat.widget.C0264c f1244c0;

        /* renamed from: androidx.appcompat.widget.c$d$a */
        public class a extends androidx.appcompat.widget.AbstractViewOnTouchListenerC0280h0 {

            /* renamed from: h0 */
            public final /* synthetic */ androidx.appcompat.widget.C0264c.d f1245h0;

            public a(androidx.appcompat.widget.C0264c.d r1, android.view.View r2, androidx.appcompat.widget.C0264c r3) {
                    r0 = this;
                    r0.f1245h0 = r1
                    r0.<init>(r2)
                    return
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0280h0
            /* renamed from: b */
            public p194l.InterfaceC4155f mo462b() {
                    r1 = this;
                    androidx.appcompat.widget.c$d r0 = r1.f1245h0
                    androidx.appcompat.widget.c r0 = r0.f1244c0
                    androidx.appcompat.widget.c$e r0 = r0.f1234r0
                    if (r0 != 0) goto La
                    r0 = 0
                    return r0
                La:
                    l.d r0 = r0.m541a()
                    return r0
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0280h0
            /* renamed from: c */
            public boolean mo463c() {
                    r1 = this;
                    androidx.appcompat.widget.c$d r0 = r1.f1245h0
                    androidx.appcompat.widget.c r0 = r0.f1244c0
                    r0.m699g()
                    r0 = 1
                    return r0
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0280h0
            /* renamed from: d */
            public boolean mo700d() {
                    r2 = this;
                    androidx.appcompat.widget.c$d r0 = r2.f1245h0
                    androidx.appcompat.widget.c r0 = r0.f1244c0
                    androidx.appcompat.widget.c$c r1 = r0.f1236t0
                    if (r1 == 0) goto La
                    r0 = 0
                    return r0
                La:
                    r0.m696d()
                    r0 = 1
                    return r0
            }
        }

        public d(androidx.appcompat.widget.C0264c r3, android.content.Context r4) {
                r2 = this;
                r2.f1244c0 = r3
                r0 = 0
                r1 = 2130968608(0x7f040020, float:1.7545874E38)
                r2.<init>(r4, r0, r1)
                r4 = 1
                r2.setClickable(r4)
                r2.setFocusable(r4)
                r0 = 0
                r2.setVisibility(r0)
                r2.setEnabled(r4)
                java.lang.CharSequence r4 = r2.getContentDescription()
                androidx.appcompat.widget.C0263b1.m693a(r2, r4)
                androidx.appcompat.widget.c$d$a r4 = new androidx.appcompat.widget.c$d$a
                r4.<init>(r2, r2, r3)
                r2.setOnTouchListener(r4)
                return
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0225a
        /* renamed from: a */
        public boolean mo456a() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0225a
        /* renamed from: b */
        public boolean mo457b() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.view.View
        public boolean performClick() {
                r2 = this;
                boolean r0 = super.performClick()
                r1 = 1
                if (r0 == 0) goto L8
                return r1
            L8:
                r0 = 0
                r2.playSoundEffect(r0)
                androidx.appcompat.widget.c r0 = r2.f1244c0
                r0.m699g()
                return r1
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int r5, int r6, int r7, int r8) {
                r4 = this;
                boolean r5 = super.setFrame(r5, r6, r7, r8)
                android.graphics.drawable.Drawable r6 = r4.getDrawable()
                android.graphics.drawable.Drawable r7 = r4.getBackground()
                if (r6 == 0) goto L3f
                if (r7 == 0) goto L3f
                int r6 = r4.getWidth()
                int r8 = r4.getHeight()
                int r0 = java.lang.Math.max(r6, r8)
                int r0 = r0 / 2
                int r1 = r4.getPaddingLeft()
                int r2 = r4.getPaddingRight()
                int r1 = r1 - r2
                int r2 = r4.getPaddingTop()
                int r3 = r4.getPaddingBottom()
                int r2 = r2 - r3
                int r6 = r6 + r1
                int r6 = r6 / 2
                int r8 = r8 + r2
                int r8 = r8 / 2
                int r1 = r6 - r0
                int r2 = r8 - r0
                int r6 = r6 + r0
                int r8 = r8 + r0
                r7.setHotspotBounds(r1, r2, r6, r8)
            L3f:
                return r5
        }
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    public class e extends androidx.appcompat.view.menu.C0214h {

        /* renamed from: m */
        public final /* synthetic */ androidx.appcompat.widget.C0264c f1246m;

        public e(androidx.appcompat.widget.C0264c r8, android.content.Context r9, androidx.appcompat.view.menu.C0211e r10, android.view.View r11, boolean r12) {
                r7 = this;
                r7.f1246m = r8
                r5 = 2130968609(0x7f040021, float:1.7545876E38)
                r6 = 0
                r0 = r7
                r1 = r9
                r2 = r10
                r3 = r11
                r4 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r9 = 8388613(0x800005, float:1.175495E-38)
                r7.f872g = r9
                androidx.appcompat.widget.c$f r8 = r8.f1238v0
                r7.m544d(r8)
                return
        }

        @Override // androidx.appcompat.view.menu.C0214h
        /* renamed from: c */
        public void mo543c() {
                r2 = this;
                androidx.appcompat.widget.c r0 = r2.f1246m
                androidx.appcompat.view.menu.e r0 = r0.f750a0
                if (r0 == 0) goto La
                r1 = 1
                r0.m500c(r1)
            La:
                androidx.appcompat.widget.c r0 = r2.f1246m
                r1 = 0
                r0.f1234r0 = r1
                super.mo543c()
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    public class f implements androidx.appcompat.view.menu.InterfaceC0215i.a {

        /* renamed from: Y */
        public final /* synthetic */ androidx.appcompat.widget.C0264c f1247Y;

        public f(androidx.appcompat.widget.C0264c r1) {
                r0 = this;
                r0.f1247Y = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0215i.a
        /* renamed from: a */
        public void mo525a(androidx.appcompat.view.menu.C0211e r3, boolean r4) {
                r2 = this;
                boolean r0 = r3 instanceof androidx.appcompat.view.menu.SubMenuC0218l
                if (r0 == 0) goto Lc
                androidx.appcompat.view.menu.e r0 = r3.mo508k()
                r1 = 0
                r0.m500c(r1)
            Lc:
                androidx.appcompat.widget.c r0 = r2.f1247Y
                androidx.appcompat.view.menu.i$a r0 = r0.f752c0
                if (r0 == 0) goto L15
                r0.mo525a(r3, r4)
            L15:
                return
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0215i.a
        /* renamed from: b */
        public boolean mo526b(androidx.appcompat.view.menu.C0211e r4) {
                r3 = this;
                androidx.appcompat.widget.c r0 = r3.f1247Y
                androidx.appcompat.view.menu.e r1 = r0.f750a0
                r2 = 0
                if (r4 != r1) goto L8
                return r2
            L8:
                r1 = r4
                androidx.appcompat.view.menu.l r1 = (androidx.appcompat.view.menu.SubMenuC0218l) r1
                androidx.appcompat.view.menu.g r1 = r1.f901A
                int r1 = r1.f839a
                r0.f1239w0 = r1
                androidx.appcompat.view.menu.i$a r0 = r0.f752c0
                if (r0 == 0) goto L19
                boolean r2 = r0.mo526b(r4)
            L19:
                return r2
        }
    }

    @android.annotation.SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.appcompat.widget.c$g */
    public static class g implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.C0264c.g> CREATOR = null;

        /* renamed from: Y */
        public int f1248Y;

        /* renamed from: androidx.appcompat.widget.c$g$a */
        public class a implements android.os.Parcelable.Creator<androidx.appcompat.widget.C0264c.g> {
            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public androidx.appcompat.widget.C0264c.g createFromParcel(android.os.Parcel r2) {
                    r1 = this;
                    androidx.appcompat.widget.c$g r0 = new androidx.appcompat.widget.c$g
                    r0.<init>(r2)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public androidx.appcompat.widget.C0264c.g[] newArray(int r1) {
                    r0 = this;
                    androidx.appcompat.widget.c$g[] r1 = new androidx.appcompat.widget.C0264c.g[r1]
                    return r1
            }
        }

        static {
                androidx.appcompat.widget.c$g$a r0 = new androidx.appcompat.widget.c$g$a
                r0.<init>()
                androidx.appcompat.widget.C0264c.g.CREATOR = r0
                return
        }

        public g() {
                r0 = this;
                r0.<init>()
                return
        }

        public g(android.os.Parcel r1) {
                r0 = this;
                r0.<init>()
                int r1 = r1.readInt()
                r0.f1248Y = r1
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                int r2 = r0.f1248Y
                r1.writeInt(r2)
                return
        }
    }

    public C0264c(android.content.Context r3) {
            r2 = this;
            r0 = 2131558403(0x7f0d0003, float:1.874212E38)
            r1 = 2131558402(0x7f0d0002, float:1.8742119E38)
            r2.<init>(r3, r0, r1)
            android.util.SparseBooleanArray r3 = new android.util.SparseBooleanArray
            r3.<init>()
            r2.f1233q0 = r3
            androidx.appcompat.widget.c$f r3 = new androidx.appcompat.widget.c$f
            r3.<init>(r2)
            r2.f1238v0 = r3
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: a */
    public void mo472a(androidx.appcompat.view.menu.C0211e r2, boolean r3) {
            r1 = this;
            r1.m694b()
            androidx.appcompat.view.menu.i$a r0 = r1.f752c0
            if (r0 == 0) goto La
            r0.mo525a(r2, r3)
        La:
            return
    }

    /* renamed from: b */
    public boolean m694b() {
            r2 = this;
            boolean r0 = r2.m696d()
            boolean r1 = r2.m697e()
            r0 = r0 | r1
            return r0
    }

    /* renamed from: c */
    public android.view.View m695c(androidx.appcompat.view.menu.C0213g r4, android.view.View r5, android.view.ViewGroup r6) {
            r3 = this;
            android.view.View r0 = r4.getActionView()
            r1 = 0
            if (r0 == 0) goto Ld
            boolean r2 = r4.m532f()
            if (r2 == 0) goto L3e
        Ld:
            boolean r0 = r5 instanceof androidx.appcompat.view.menu.InterfaceC0216j.a
            if (r0 == 0) goto L14
            androidx.appcompat.view.menu.j$a r5 = (androidx.appcompat.view.menu.InterfaceC0216j.a) r5
            goto L1e
        L14:
            android.view.LayoutInflater r5 = r3.f751b0
            int r0 = r3.f754e0
            android.view.View r5 = r5.inflate(r0, r6, r1)
            androidx.appcompat.view.menu.j$a r5 = (androidx.appcompat.view.menu.InterfaceC0216j.a) r5
        L1e:
            r5.mo459d(r4, r1)
            androidx.appcompat.view.menu.j r0 = r3.f755f0
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            r2 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r2 = (androidx.appcompat.view.menu.ActionMenuItemView) r2
            r2.setItemInvoker(r0)
            androidx.appcompat.widget.c$b r0 = r3.f1237u0
            if (r0 != 0) goto L36
            androidx.appcompat.widget.c$b r0 = new androidx.appcompat.widget.c$b
            r0.<init>(r3)
            r3.f1237u0 = r0
        L36:
            androidx.appcompat.widget.c$b r0 = r3.f1237u0
            r2.setPopupCallback(r0)
            r0 = r5
            android.view.View r0 = (android.view.View) r0
        L3e:
            boolean r4 = r4.f837C
            if (r4 == 0) goto L44
            r1 = 8
        L44:
            r0.setVisibility(r1)
            androidx.appcompat.widget.ActionMenuView r6 = (androidx.appcompat.widget.ActionMenuView) r6
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            boolean r5 = r6.checkLayoutParams(r4)
            if (r5 != 0) goto L5a
            androidx.appcompat.widget.ActionMenuView$c r4 = r6.m576m(r4)
            r0.setLayoutParams(r4)
        L5a:
            return r0
    }

    /* renamed from: d */
    public boolean m696d() {
            r3 = this;
            androidx.appcompat.widget.c$c r0 = r3.f1236t0
            r1 = 1
            if (r0 == 0) goto L12
            androidx.appcompat.view.menu.j r2 = r3.f755f0
            if (r2 == 0) goto L12
            android.view.View r2 = (android.view.View) r2
            r2.removeCallbacks(r0)
            r0 = 0
            r3.f1236t0 = r0
            return r1
        L12:
            androidx.appcompat.widget.c$e r0 = r3.f1234r0
            if (r0 == 0) goto L22
            boolean r2 = r0.m542b()
            if (r2 == 0) goto L21
            l.d r0 = r0.f875j
            r0.dismiss()
        L21:
            return r1
        L22:
            r0 = 0
            return r0
    }

    /* renamed from: e */
    public boolean m697e() {
            r2 = this;
            androidx.appcompat.widget.c$a r0 = r2.f1235s0
            if (r0 == 0) goto L11
            boolean r1 = r0.m542b()
            if (r1 == 0) goto Lf
            l.d r0 = r0.f875j
            r0.dismiss()
        Lf:
            r0 = 1
            return r0
        L11:
            r0 = 0
            return r0
    }

    /* renamed from: f */
    public boolean m698f() {
            r1 = this;
            androidx.appcompat.widget.c$e r0 = r1.f1234r0
            if (r0 == 0) goto Lc
            boolean r0 = r0.m542b()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    /* renamed from: g */
    public boolean m699g() {
            r7 = this;
            boolean r0 = r7.f1227k0
            if (r0 == 0) goto L3f
            boolean r0 = r7.m698f()
            if (r0 != 0) goto L3f
            androidx.appcompat.view.menu.e r0 = r7.f750a0
            if (r0 == 0) goto L3f
            androidx.appcompat.view.menu.j r1 = r7.f755f0
            if (r1 == 0) goto L3f
            androidx.appcompat.widget.c$c r1 = r7.f1236t0
            if (r1 != 0) goto L3f
            r0.m506i()
            java.util.ArrayList<androidx.appcompat.view.menu.g> r0 = r0.f817j
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3f
            androidx.appcompat.widget.c$e r0 = new androidx.appcompat.widget.c$e
            android.content.Context r3 = r7.f749Z
            androidx.appcompat.view.menu.e r4 = r7.f750a0
            androidx.appcompat.widget.c$d r5 = r7.f1224h0
            r6 = 1
            r1 = r0
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            androidx.appcompat.widget.c$c r1 = new androidx.appcompat.widget.c$c
            r1.<init>(r7, r0)
            r7.f1236t0 = r1
            androidx.appcompat.view.menu.j r0 = r7.f755f0
            android.view.View r0 = (android.view.View) r0
            r0.post(r1)
            r0 = 1
            return r0
        L3f:
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: s */
    public void mo493s(android.content.Context r5, androidx.appcompat.view.menu.C0211e r6) {
            r4 = this;
            r4.f749Z = r5
            android.view.LayoutInflater.from(r5)
            r4.f750a0 = r6
            android.content.res.Resources r6 = r5.getResources()
            boolean r0 = r4.f1228l0
            if (r0 != 0) goto L12
            r0 = 1
            r4.f1227k0 = r0
        L12:
            android.content.res.Resources r0 = r5.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            r1 = 2
            int r0 = r0 / r1
            r4.f1229m0 = r0
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r0 = r5.screenWidthDp
            int r2 = r5.screenHeightDp
            int r5 = r5.smallestScreenWidthDp
            r3 = 600(0x258, float:8.41E-43)
            if (r5 > r3) goto L5a
            if (r0 > r3) goto L5a
            r5 = 720(0x2d0, float:1.009E-42)
            r3 = 960(0x3c0, float:1.345E-42)
            if (r0 <= r3) goto L3c
            if (r2 > r5) goto L5a
        L3c:
            if (r0 <= r5) goto L41
            if (r2 <= r3) goto L41
            goto L5a
        L41:
            r5 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r5) goto L58
            r5 = 480(0x1e0, float:6.73E-43)
            r3 = 640(0x280, float:8.97E-43)
            if (r0 <= r3) goto L4d
            if (r2 > r5) goto L58
        L4d:
            if (r0 <= r5) goto L52
            if (r2 <= r3) goto L52
            goto L58
        L52:
            r5 = 360(0x168, float:5.04E-43)
            if (r0 < r5) goto L5b
            r1 = 3
            goto L5b
        L58:
            r1 = 4
            goto L5b
        L5a:
            r1 = 5
        L5b:
            r4.f1231o0 = r1
            int r5 = r4.f1229m0
            boolean r0 = r4.f1227k0
            r1 = 0
            if (r0 == 0) goto L90
            androidx.appcompat.widget.c$d r0 = r4.f1224h0
            if (r0 != 0) goto L88
            androidx.appcompat.widget.c$d r0 = new androidx.appcompat.widget.c$d
            android.content.Context r2 = r4.f748Y
            r0.<init>(r4, r2)
            r4.f1224h0 = r0
            boolean r2 = r4.f1226j0
            r3 = 0
            if (r2 == 0) goto L7f
            android.graphics.drawable.Drawable r2 = r4.f1225i0
            r0.setImageDrawable(r2)
            r4.f1225i0 = r1
            r4.f1226j0 = r3
        L7f:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            androidx.appcompat.widget.c$d r1 = r4.f1224h0
            r1.measure(r0, r0)
        L88:
            androidx.appcompat.widget.c$d r0 = r4.f1224h0
            int r0 = r0.getMeasuredWidth()
            int r5 = r5 - r0
            goto L92
        L90:
            r4.f1224h0 = r1
        L92:
            r4.f1230n0 = r5
            android.util.DisplayMetrics r5 = r6.getDisplayMetrics()
            float r5 = r5.density
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: t */
    public void mo485t(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.appcompat.widget.C0264c.g
            if (r0 != 0) goto L5
            return
        L5:
            androidx.appcompat.widget.c$g r2 = (androidx.appcompat.widget.C0264c.g) r2
            int r2 = r2.f1248Y
            if (r2 <= 0) goto L1c
            androidx.appcompat.view.menu.e r0 = r1.f750a0
            android.view.MenuItem r2 = r0.findItem(r2)
            if (r2 == 0) goto L1c
            android.view.SubMenu r2 = r2.getSubMenu()
            androidx.appcompat.view.menu.l r2 = (androidx.appcompat.view.menu.SubMenuC0218l) r2
            r1.mo486u(r2)
        L1c:
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: u */
    public boolean mo486u(androidx.appcompat.view.menu.SubMenuC0218l r9) {
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = r9
        L9:
            androidx.appcompat.view.menu.e r2 = r0.f902z
            androidx.appcompat.view.menu.e r3 = r8.f750a0
            if (r2 == r3) goto L13
            r0 = r2
            androidx.appcompat.view.menu.l r0 = (androidx.appcompat.view.menu.SubMenuC0218l) r0
            goto L9
        L13:
            androidx.appcompat.view.menu.g r0 = r0.f901A
            androidx.appcompat.view.menu.j r2 = r8.f755f0
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = 0
            if (r2 != 0) goto L1d
            goto L3a
        L1d:
            int r4 = r2.getChildCount()
            r5 = 0
        L22:
            if (r5 >= r4) goto L3a
            android.view.View r6 = r2.getChildAt(r5)
            boolean r7 = r6 instanceof androidx.appcompat.view.menu.InterfaceC0216j.a
            if (r7 == 0) goto L37
            r7 = r6
            androidx.appcompat.view.menu.j$a r7 = (androidx.appcompat.view.menu.InterfaceC0216j.a) r7
            androidx.appcompat.view.menu.g r7 = r7.getItemData()
            if (r7 != r0) goto L37
            r3 = r6
            goto L3a
        L37:
            int r5 = r5 + 1
            goto L22
        L3a:
            if (r3 != 0) goto L3d
            return r1
        L3d:
            androidx.appcompat.view.menu.g r0 = r9.f901A
            int r0 = r0.f839a
            r8.f1239w0 = r0
            int r0 = r9.size()
            r2 = 0
        L48:
            r4 = 1
            if (r2 >= r0) goto L60
            android.view.MenuItem r5 = r9.getItem(r2)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L5d
            android.graphics.drawable.Drawable r5 = r5.getIcon()
            if (r5 == 0) goto L5d
            r1 = 1
            goto L60
        L5d:
            int r2 = r2 + 1
            goto L48
        L60:
            androidx.appcompat.widget.c$a r0 = new androidx.appcompat.widget.c$a
            android.content.Context r2 = r8.f749Z
            r0.<init>(r8, r2, r9, r3)
            r8.f1235s0 = r0
            r0.f873h = r1
            l.d r0 = r0.f875j
            if (r0 == 0) goto L72
            r0.mo478h(r1)
        L72:
            androidx.appcompat.widget.c$a r0 = r8.f1235s0
            boolean r0 = r0.m546f()
            if (r0 == 0) goto L82
            androidx.appcompat.view.menu.i$a r0 = r8.f752c0
            if (r0 == 0) goto L81
            r0.mo526b(r9)
        L81:
            return r4
        L82:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: v */
    public void mo487v(boolean r12) {
            r11 = this;
            androidx.appcompat.view.menu.j r12 = r11.f755f0
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            r0 = 0
            r1 = 1
            r2 = 0
            if (r12 != 0) goto Lb
            goto L7c
        Lb:
            androidx.appcompat.view.menu.e r3 = r11.f750a0
            if (r3 == 0) goto L62
            r3.m506i()
            androidx.appcompat.view.menu.e r3 = r11.f750a0
            java.util.ArrayList r3 = r3.m509l()
            int r4 = r3.size()
            r5 = 0
            r6 = 0
        L1e:
            if (r5 >= r4) goto L63
            java.lang.Object r7 = r3.get(r5)
            androidx.appcompat.view.menu.g r7 = (androidx.appcompat.view.menu.C0213g) r7
            boolean r8 = r7.m533g()
            if (r8 == 0) goto L5f
            android.view.View r8 = r12.getChildAt(r6)
            boolean r9 = r8 instanceof androidx.appcompat.view.menu.InterfaceC0216j.a
            if (r9 == 0) goto L3c
            r9 = r8
            androidx.appcompat.view.menu.j$a r9 = (androidx.appcompat.view.menu.InterfaceC0216j.a) r9
            androidx.appcompat.view.menu.g r9 = r9.getItemData()
            goto L3d
        L3c:
            r9 = r0
        L3d:
            android.view.View r10 = r11.m695c(r7, r8, r12)
            if (r7 == r9) goto L49
            r10.setPressed(r2)
            r10.jumpDrawablesToCurrentState()
        L49:
            if (r10 == r8) goto L5d
            android.view.ViewParent r7 = r10.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            if (r7 == 0) goto L56
            r7.removeView(r10)
        L56:
            androidx.appcompat.view.menu.j r7 = r11.f755f0
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r7.addView(r10, r6)
        L5d:
            int r6 = r6 + 1
        L5f:
            int r5 = r5 + 1
            goto L1e
        L62:
            r6 = 0
        L63:
            int r3 = r12.getChildCount()
            if (r6 >= r3) goto L7c
            android.view.View r3 = r12.getChildAt(r6)
            androidx.appcompat.widget.c$d r4 = r11.f1224h0
            if (r3 != r4) goto L73
            r3 = 0
            goto L77
        L73:
            r12.removeViewAt(r6)
            r3 = 1
        L77:
            if (r3 != 0) goto L63
            int r6 = r6 + 1
            goto L63
        L7c:
            androidx.appcompat.view.menu.j r12 = r11.f755f0
            android.view.View r12 = (android.view.View) r12
            r12.requestLayout()
            androidx.appcompat.view.menu.e r12 = r11.f750a0
            if (r12 == 0) goto L9e
            r12.m506i()
            java.util.ArrayList<androidx.appcompat.view.menu.g> r12 = r12.f816i
            int r3 = r12.size()
            r4 = 0
        L91:
            if (r4 >= r3) goto L9e
            java.lang.Object r5 = r12.get(r4)
            androidx.appcompat.view.menu.g r5 = (androidx.appcompat.view.menu.C0213g) r5
            n0.b r5 = r5.f835A
            int r4 = r4 + 1
            goto L91
        L9e:
            androidx.appcompat.view.menu.e r12 = r11.f750a0
            if (r12 == 0) goto La7
            r12.m506i()
            java.util.ArrayList<androidx.appcompat.view.menu.g> r0 = r12.f817j
        La7:
            boolean r12 = r11.f1227k0
            if (r12 == 0) goto Lc1
            if (r0 == 0) goto Lc1
            int r12 = r0.size()
            if (r12 != r1) goto Lbe
            java.lang.Object r12 = r0.get(r2)
            androidx.appcompat.view.menu.g r12 = (androidx.appcompat.view.menu.C0213g) r12
            boolean r12 = r12.f837C
            r2 = r12 ^ 1
            goto Lc1
        Lbe:
            if (r12 <= 0) goto Lc1
            r2 = 1
        Lc1:
            androidx.appcompat.widget.c$d r12 = r11.f1224h0
            if (r2 == 0) goto Lf3
            if (r12 != 0) goto Ld0
            androidx.appcompat.widget.c$d r12 = new androidx.appcompat.widget.c$d
            android.content.Context r0 = r11.f748Y
            r12.<init>(r11, r0)
            r11.f1224h0 = r12
        Ld0:
            androidx.appcompat.widget.c$d r12 = r11.f1224h0
            android.view.ViewParent r12 = r12.getParent()
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            androidx.appcompat.view.menu.j r0 = r11.f755f0
            if (r12 == r0) goto L104
            if (r12 == 0) goto Le3
            androidx.appcompat.widget.c$d r0 = r11.f1224h0
            r12.removeView(r0)
        Le3:
            androidx.appcompat.view.menu.j r12 = r11.f755f0
            androidx.appcompat.widget.ActionMenuView r12 = (androidx.appcompat.widget.ActionMenuView) r12
            androidx.appcompat.widget.c$d r0 = r11.f1224h0
            androidx.appcompat.widget.ActionMenuView$c r2 = r12.m575l()
            r2.f969a = r1
            r12.addView(r0, r2)
            goto L104
        Lf3:
            if (r12 == 0) goto L104
            android.view.ViewParent r12 = r12.getParent()
            androidx.appcompat.view.menu.j r0 = r11.f755f0
            if (r12 != r0) goto L104
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            androidx.appcompat.widget.c$d r12 = r11.f1224h0
            r0.removeView(r12)
        L104:
            androidx.appcompat.view.menu.j r12 = r11.f755f0
            androidx.appcompat.widget.ActionMenuView r12 = (androidx.appcompat.widget.ActionMenuView) r12
            boolean r0 = r11.f1227k0
            r12.setOverflowReserved(r0)
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: w */
    public boolean mo488w() {
            r16 = this;
            r0 = r16
            androidx.appcompat.view.menu.e r1 = r0.f750a0
            r3 = 0
            if (r1 == 0) goto L10
            java.util.ArrayList r1 = r1.m509l()
            int r4 = r1.size()
            goto L12
        L10:
            r1 = 0
            r4 = 0
        L12:
            int r5 = r0.f1231o0
            int r6 = r0.f1230n0
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            androidx.appcompat.view.menu.j r8 = r0.f755f0
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L22:
            r13 = 2
            r14 = 1
            if (r9 >= r4) goto L54
            java.lang.Object r15 = r1.get(r9)
            androidx.appcompat.view.menu.g r15 = (androidx.appcompat.view.menu.C0213g) r15
            int r3 = r15.f863y
            r2 = r3 & 2
            if (r2 != r13) goto L34
            r2 = 1
            goto L35
        L34:
            r2 = 0
        L35:
            if (r2 == 0) goto L3a
            int r12 = r12 + 1
            goto L47
        L3a:
            r2 = r3 & 1
            if (r2 != r14) goto L40
            r2 = 1
            goto L41
        L40:
            r2 = 0
        L41:
            if (r2 == 0) goto L46
            int r11 = r11 + 1
            goto L47
        L46:
            r10 = 1
        L47:
            boolean r2 = r0.f1232p0
            if (r2 == 0) goto L50
            boolean r2 = r15.f837C
            if (r2 == 0) goto L50
            r5 = 0
        L50:
            int r9 = r9 + 1
            r3 = 0
            goto L22
        L54:
            boolean r2 = r0.f1227k0
            if (r2 == 0) goto L5f
            if (r10 != 0) goto L5d
            int r11 = r11 + r12
            if (r11 <= r5) goto L5f
        L5d:
            int r5 = r5 + (-1)
        L5f:
            int r5 = r5 - r12
            android.util.SparseBooleanArray r2 = r0.f1233q0
            r2.clear()
            r3 = 0
            r9 = 0
        L67:
            if (r3 >= r4) goto L107
            java.lang.Object r10 = r1.get(r3)
            androidx.appcompat.view.menu.g r10 = (androidx.appcompat.view.menu.C0213g) r10
            int r11 = r10.f863y
            r12 = r11 & 2
            if (r12 != r13) goto L77
            r12 = 1
            goto L78
        L77:
            r12 = 0
        L78:
            if (r12 == 0) goto L96
            r12 = 0
            android.view.View r11 = r0.m695c(r10, r12, r8)
            r11.measure(r7, r7)
            int r11 = r11.getMeasuredWidth()
            int r6 = r6 - r11
            if (r9 != 0) goto L8a
            r9 = r11
        L8a:
            int r11 = r10.f840b
            if (r11 == 0) goto L91
            r2.put(r11, r14)
        L91:
            r10.m538l(r14)
            goto Lfb
        L96:
            r11 = r11 & 1
            if (r11 != r14) goto L9c
            r11 = 1
            goto L9d
        L9c:
            r11 = 0
        L9d:
            if (r11 == 0) goto Lfd
            int r11 = r10.f840b
            boolean r12 = r2.get(r11)
            if (r5 > 0) goto La9
            if (r12 == 0) goto Lad
        La9:
            if (r6 <= 0) goto Lad
            r15 = 1
            goto Lae
        Lad:
            r15 = 0
        Lae:
            r13 = 0
            if (r15 == 0) goto Lc8
            android.view.View r14 = r0.m695c(r10, r13, r8)
            r14.measure(r7, r7)
            int r14 = r14.getMeasuredWidth()
            int r6 = r6 - r14
            if (r9 != 0) goto Lc0
            r9 = r14
        Lc0:
            int r14 = r6 + r9
            if (r14 <= 0) goto Lc6
            r14 = 1
            goto Lc7
        Lc6:
            r14 = 0
        Lc7:
            r15 = r15 & r14
        Lc8:
            if (r15 == 0) goto Ld1
            if (r11 == 0) goto Ld1
            r14 = 1
            r2.put(r11, r14)
            goto Lf4
        Ld1:
            if (r12 == 0) goto Lf4
            r12 = 0
            r2.put(r11, r12)
            r12 = 0
        Ld8:
            if (r12 >= r3) goto Lf4
            java.lang.Object r14 = r1.get(r12)
            androidx.appcompat.view.menu.g r14 = (androidx.appcompat.view.menu.C0213g) r14
            int r13 = r14.f840b
            if (r13 != r11) goto Lf0
            boolean r13 = r14.m533g()
            if (r13 == 0) goto Lec
            int r5 = r5 + 1
        Lec:
            r13 = 0
            r14.m538l(r13)
        Lf0:
            int r12 = r12 + 1
            r13 = 0
            goto Ld8
        Lf4:
            if (r15 == 0) goto Lf8
            int r5 = r5 + (-1)
        Lf8:
            r10.m538l(r15)
        Lfb:
            r11 = 0
            goto L101
        Lfd:
            r11 = 0
            r10.m538l(r11)
        L101:
            int r3 = r3 + 1
            r13 = 2
            r14 = 1
            goto L67
        L107:
            r3 = 1
            return r3
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0215i
    /* renamed from: x */
    public android.os.Parcelable mo489x() {
            r2 = this;
            androidx.appcompat.widget.c$g r0 = new androidx.appcompat.widget.c$g
            r0.<init>()
            int r1 = r2.f1239w0
            r0.f1248Y = r1
            return r0
    }
}
