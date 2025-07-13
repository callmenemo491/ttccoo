package p177k;

/* renamed from: k.f */
/* loaded from: classes.dex */
public class C3622f extends android.view.MenuInflater {

    /* renamed from: e */
    public static final java.lang.Class<?>[] f15954e = null;

    /* renamed from: f */
    public static final java.lang.Class<?>[] f15955f = null;

    /* renamed from: a */
    public final java.lang.Object[] f15956a;

    /* renamed from: b */
    public final java.lang.Object[] f15957b;

    /* renamed from: c */
    public android.content.Context f15958c;

    /* renamed from: d */
    public java.lang.Object f15959d;

    /* renamed from: k.f$a */
    public static class a implements android.view.MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        public static final java.lang.Class<?>[] f15960c = null;

        /* renamed from: a */
        public java.lang.Object f15961a;

        /* renamed from: b */
        public java.lang.reflect.Method f15962b;

        static {
                r0 = 1
                java.lang.Class[] r0 = new java.lang.Class[r0]
                r1 = 0
                java.lang.Class<android.view.MenuItem> r2 = android.view.MenuItem.class
                r0[r1] = r2
                p177k.C3622f.a.f15960c = r0
                return
        }

        public a(java.lang.Object r5, java.lang.String r6) {
                r4 = this;
                r4.<init>()
                r4.f15961a = r5
                java.lang.Class r5 = r5.getClass()
                java.lang.Class<?>[] r0 = p177k.C3622f.a.f15960c     // Catch: java.lang.Exception -> L12
                java.lang.reflect.Method r0 = r5.getMethod(r6, r0)     // Catch: java.lang.Exception -> L12
                r4.f15962b = r0     // Catch: java.lang.Exception -> L12
                return
            L12:
                r0 = move-exception
                android.view.InflateException r1 = new android.view.InflateException
                java.lang.String r2 = "Couldn't resolve menu item onClick handler "
                java.lang.String r3 = " in class "
                java.lang.StringBuilder r6 = androidx.activity.result.C0196d.m449a(r2, r6, r3)
                java.lang.String r5 = r5.getName()
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                r1.<init>(r5)
                r1.initCause(r0)
                throw r1
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(android.view.MenuItem r6) {
                r5 = this;
                java.lang.reflect.Method r0 = r5.f15962b     // Catch: java.lang.Exception -> L2b
                java.lang.Class r0 = r0.getReturnType()     // Catch: java.lang.Exception -> L2b
                java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L2b
                r2 = 0
                r3 = 1
                if (r0 != r1) goto L1f
                java.lang.reflect.Method r0 = r5.f15962b     // Catch: java.lang.Exception -> L2b
                java.lang.Object r1 = r5.f15961a     // Catch: java.lang.Exception -> L2b
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L2b
                r3[r2] = r6     // Catch: java.lang.Exception -> L2b
                java.lang.Object r6 = r0.invoke(r1, r3)     // Catch: java.lang.Exception -> L2b
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Exception -> L2b
                boolean r6 = r6.booleanValue()     // Catch: java.lang.Exception -> L2b
                return r6
            L1f:
                java.lang.reflect.Method r0 = r5.f15962b     // Catch: java.lang.Exception -> L2b
                java.lang.Object r1 = r5.f15961a     // Catch: java.lang.Exception -> L2b
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L2b
                r4[r2] = r6     // Catch: java.lang.Exception -> L2b
                r0.invoke(r1, r4)     // Catch: java.lang.Exception -> L2b
                return r3
            L2b:
                r6 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r6)
                throw r0
        }
    }

    /* renamed from: k.f$b */
    public class b {

        /* renamed from: A */
        public java.lang.CharSequence f15963A;

        /* renamed from: B */
        public java.lang.CharSequence f15964B;

        /* renamed from: C */
        public android.content.res.ColorStateList f15965C;

        /* renamed from: D */
        public android.graphics.PorterDuff.Mode f15966D;

        /* renamed from: E */
        public final /* synthetic */ p177k.C3622f f15967E;

        /* renamed from: a */
        public android.view.Menu f15968a;

        /* renamed from: b */
        public int f15969b;

        /* renamed from: c */
        public int f15970c;

        /* renamed from: d */
        public int f15971d;

        /* renamed from: e */
        public int f15972e;

        /* renamed from: f */
        public boolean f15973f;

        /* renamed from: g */
        public boolean f15974g;

        /* renamed from: h */
        public boolean f15975h;

        /* renamed from: i */
        public int f15976i;

        /* renamed from: j */
        public int f15977j;

        /* renamed from: k */
        public java.lang.CharSequence f15978k;

        /* renamed from: l */
        public java.lang.CharSequence f15979l;

        /* renamed from: m */
        public int f15980m;

        /* renamed from: n */
        public char f15981n;

        /* renamed from: o */
        public int f15982o;

        /* renamed from: p */
        public char f15983p;

        /* renamed from: q */
        public int f15984q;

        /* renamed from: r */
        public int f15985r;

        /* renamed from: s */
        public boolean f15986s;

        /* renamed from: t */
        public boolean f15987t;

        /* renamed from: u */
        public boolean f15988u;

        /* renamed from: v */
        public int f15989v;

        /* renamed from: w */
        public int f15990w;

        /* renamed from: x */
        public java.lang.String f15991x;

        /* renamed from: y */
        public java.lang.String f15992y;

        /* renamed from: z */
        public p227n0.AbstractC4643b f15993z;

        public b(p177k.C3622f r1, android.view.Menu r2) {
                r0 = this;
                r0.f15967E = r1
                r0.<init>()
                r1 = 0
                r0.f15965C = r1
                r0.f15966D = r1
                r0.f15968a = r2
                r1 = 0
                r0.f15969b = r1
                r0.f15970c = r1
                r0.f15971d = r1
                r0.f15972e = r1
                r1 = 1
                r0.f15973f = r1
                r0.f15974g = r1
                return
        }

        /* renamed from: a */
        public android.view.SubMenu m8066a() {
                r5 = this;
                r0 = 1
                r5.f15975h = r0
                android.view.Menu r0 = r5.f15968a
                int r1 = r5.f15969b
                int r2 = r5.f15976i
                int r3 = r5.f15977j
                java.lang.CharSequence r4 = r5.f15978k
                android.view.SubMenu r0 = r0.addSubMenu(r1, r2, r3, r4)
                android.view.MenuItem r1 = r0.getItem()
                r5.m8068c(r1)
                return r0
        }

        /* renamed from: b */
        public final <T> T m8067b(java.lang.String r3, java.lang.Class<?>[] r4, java.lang.Object[] r5) {
                r2 = this;
                k.f r0 = r2.f15967E     // Catch: java.lang.Exception -> L1a
                android.content.Context r0 = r0.f15958c     // Catch: java.lang.Exception -> L1a
                java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Exception -> L1a
                r1 = 0
                java.lang.Class r0 = java.lang.Class.forName(r3, r1, r0)     // Catch: java.lang.Exception -> L1a
                java.lang.reflect.Constructor r4 = r0.getConstructor(r4)     // Catch: java.lang.Exception -> L1a
                r0 = 1
                r4.setAccessible(r0)     // Catch: java.lang.Exception -> L1a
                java.lang.Object r3 = r4.newInstance(r5)     // Catch: java.lang.Exception -> L1a
                return r3
            L1a:
                r4 = move-exception
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "Cannot instantiate class: "
                r5.append(r0)
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                java.lang.String r5 = "SupportMenuInflater"
                android.util.Log.w(r5, r3, r4)
                r3 = 0
                return r3
        }

        /* renamed from: c */
        public final void m8068c(android.view.MenuItem r8) {
                r7 = this;
                boolean r0 = r7.f15986s
                android.view.MenuItem r0 = r8.setChecked(r0)
                boolean r1 = r7.f15987t
                android.view.MenuItem r0 = r0.setVisible(r1)
                boolean r1 = r7.f15988u
                android.view.MenuItem r0 = r0.setEnabled(r1)
                int r1 = r7.f15985r
                r2 = 0
                r3 = 1
                if (r1 < r3) goto L1a
                r1 = 1
                goto L1b
            L1a:
                r1 = 0
            L1b:
                android.view.MenuItem r0 = r0.setCheckable(r1)
                java.lang.CharSequence r1 = r7.f15979l
                android.view.MenuItem r0 = r0.setTitleCondensed(r1)
                int r1 = r7.f15980m
                r0.setIcon(r1)
                int r0 = r7.f15989v
                if (r0 < 0) goto L31
                r8.setShowAsAction(r0)
            L31:
                java.lang.String r0 = r7.f15992y
                if (r0 == 0) goto L62
                k.f r0 = r7.f15967E
                android.content.Context r0 = r0.f15958c
                boolean r0 = r0.isRestricted()
                if (r0 != 0) goto L5a
                k.f$a r0 = new k.f$a
                k.f r1 = r7.f15967E
                java.lang.Object r4 = r1.f15959d
                if (r4 != 0) goto L4f
                android.content.Context r4 = r1.f15958c
                java.lang.Object r4 = r1.m8064a(r4)
                r1.f15959d = r4
            L4f:
                java.lang.Object r1 = r1.f15959d
                java.lang.String r4 = r7.f15992y
                r0.<init>(r1, r4)
                r8.setOnMenuItemClickListener(r0)
                goto L62
            L5a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "The android:onClick attribute cannot be used within a restricted context"
                r8.<init>(r0)
                throw r8
            L62:
                int r0 = r7.f15985r
                r1 = 2
                if (r0 < r1) goto La7
                boolean r0 = r8 instanceof androidx.appcompat.view.menu.C0213g
                if (r0 == 0) goto L72
                r0 = r8
                androidx.appcompat.view.menu.g r0 = (androidx.appcompat.view.menu.C0213g) r0
                r0.m537k(r3)
                goto La7
            L72:
                boolean r0 = r8 instanceof p194l.MenuItemC4152c
                if (r0 == 0) goto La7
                r0 = r8
                l.c r0 = (p194l.MenuItemC4152c) r0
                java.lang.reflect.Method r1 = r0.f17204e     // Catch: java.lang.Exception -> L9f
                if (r1 != 0) goto L91
                i0.b r1 = r0.f17203d     // Catch: java.lang.Exception -> L9f
                java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Exception -> L9f
                java.lang.String r4 = "setExclusiveCheckable"
                java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L9f
                java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L9f
                r5[r2] = r6     // Catch: java.lang.Exception -> L9f
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L9f
                r0.f17204e = r1     // Catch: java.lang.Exception -> L9f
            L91:
                java.lang.reflect.Method r1 = r0.f17204e     // Catch: java.lang.Exception -> L9f
                i0.b r0 = r0.f17203d     // Catch: java.lang.Exception -> L9f
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L9f
                java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L9f
                r4[r2] = r5     // Catch: java.lang.Exception -> L9f
                r1.invoke(r0, r4)     // Catch: java.lang.Exception -> L9f
                goto La7
            L9f:
                r0 = move-exception
                java.lang.String r1 = "MenuItemWrapper"
                java.lang.String r4 = "Error while calling setExclusiveCheckable"
                android.util.Log.w(r1, r4, r0)
            La7:
                java.lang.String r0 = r7.f15991x
                if (r0 == 0) goto Lbb
                java.lang.Class<?>[] r1 = p177k.C3622f.f15954e
                k.f r2 = r7.f15967E
                java.lang.Object[] r2 = r2.f15956a
                java.lang.Object r0 = r7.m8067b(r0, r1, r2)
                android.view.View r0 = (android.view.View) r0
                r8.setActionView(r0)
                r2 = 1
            Lbb:
                int r0 = r7.f15990w
                if (r0 <= 0) goto Lcc
                if (r2 != 0) goto Lc5
                r8.setActionView(r0)
                goto Lcc
            Lc5:
                java.lang.String r0 = "SupportMenuInflater"
                java.lang.String r1 = "Ignoring attribute 'itemActionViewLayout'. Action view already specified."
                android.util.Log.w(r0, r1)
            Lcc:
                n0.b r0 = r7.f15993z
                if (r0 == 0) goto Le2
                boolean r1 = r8 instanceof p138i0.InterfaceMenuItemC3056b
                if (r1 == 0) goto Ldb
                r1 = r8
                i0.b r1 = (p138i0.InterfaceMenuItemC3056b) r1
                r1.mo529b(r0)
                goto Le2
            Ldb:
                java.lang.String r0 = "MenuItemCompat"
                java.lang.String r1 = "setActionProvider: item does not implement SupportMenuItem; ignoring"
                android.util.Log.w(r0, r1)
            Le2:
                java.lang.CharSequence r0 = r7.f15963A
                boolean r1 = r8 instanceof p138i0.InterfaceMenuItemC3056b
                r2 = 26
                if (r1 == 0) goto Lf1
                r3 = r8
                i0.b r3 = (p138i0.InterfaceMenuItemC3056b) r3
                r3.setContentDescription(r0)
                goto Lf8
            Lf1:
                int r3 = android.os.Build.VERSION.SDK_INT
                if (r3 < r2) goto Lf8
                r8.setContentDescription(r0)
            Lf8:
                java.lang.CharSequence r0 = r7.f15964B
                if (r1 == 0) goto L103
                r3 = r8
                i0.b r3 = (p138i0.InterfaceMenuItemC3056b) r3
                r3.setTooltipText(r0)
                goto L10a
            L103:
                int r3 = android.os.Build.VERSION.SDK_INT
                if (r3 < r2) goto L10a
                r8.setTooltipText(r0)
            L10a:
                char r0 = r7.f15981n
                int r3 = r7.f15982o
                if (r1 == 0) goto L117
                r4 = r8
                i0.b r4 = (p138i0.InterfaceMenuItemC3056b) r4
                r4.setAlphabeticShortcut(r0, r3)
                goto L11e
            L117:
                int r4 = android.os.Build.VERSION.SDK_INT
                if (r4 < r2) goto L11e
                r8.setAlphabeticShortcut(r0, r3)
            L11e:
                char r0 = r7.f15983p
                int r3 = r7.f15984q
                if (r1 == 0) goto L12b
                r4 = r8
                i0.b r4 = (p138i0.InterfaceMenuItemC3056b) r4
                r4.setNumericShortcut(r0, r3)
                goto L132
            L12b:
                int r4 = android.os.Build.VERSION.SDK_INT
                if (r4 < r2) goto L132
                r8.setNumericShortcut(r0, r3)
            L132:
                android.graphics.PorterDuff$Mode r0 = r7.f15966D
                if (r0 == 0) goto L146
                if (r1 == 0) goto L13f
                r3 = r8
                i0.b r3 = (p138i0.InterfaceMenuItemC3056b) r3
                r3.setIconTintMode(r0)
                goto L146
            L13f:
                int r3 = android.os.Build.VERSION.SDK_INT
                if (r3 < r2) goto L146
                r8.setIconTintMode(r0)
            L146:
                android.content.res.ColorStateList r0 = r7.f15965C
                if (r0 == 0) goto L159
                if (r1 == 0) goto L152
                i0.b r8 = (p138i0.InterfaceMenuItemC3056b) r8
                r8.setIconTintList(r0)
                goto L159
            L152:
                int r1 = android.os.Build.VERSION.SDK_INT
                if (r1 < r2) goto L159
                r8.setIconTintList(r0)
            L159:
                return
        }
    }

    static {
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            p177k.C3622f.f15954e = r0
            p177k.C3622f.f15955f = r0
            return
    }

    public C3622f(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            r2.f15958c = r3
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r2.f15956a = r0
            r2.f15957b = r0
            return
    }

    /* renamed from: a */
    public final java.lang.Object m8064a(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L5
            return r2
        L5:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L13
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            java.lang.Object r2 = r1.m8064a(r2)
        L13:
            return r2
    }

    /* renamed from: b */
    public final void m8065b(org.xmlpull.v1.XmlPullParser r17, android.util.AttributeSet r18, android.view.Menu r19) {
            r16 = this;
            r0 = r16
            r1 = r18
            k.f$b r2 = new k.f$b
            r3 = r19
            r2.<init>(r0, r3)
            int r3 = r17.getEventType()
        Lf:
            java.lang.String r4 = "menu"
            r5 = 2
            r6 = 1
            if (r3 != r5) goto L30
            java.lang.String r3 = r17.getName()
            boolean r7 = r3.equals(r4)
            if (r7 == 0) goto L24
            int r3 = r17.next()
            goto L36
        L24:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Expecting menu, got "
            java.lang.String r2 = p064e.C1493g.m4049a(r2, r3)
            r1.<init>(r2)
            throw r1
        L30:
            int r3 = r17.next()
            if (r3 != r6) goto L23a
        L36:
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L3a:
            if (r8 != 0) goto L239
            if (r3 == r6) goto L231
            java.lang.String r11 = "item"
            java.lang.String r12 = "group"
            r13 = 3
            if (r3 == r5) goto La9
            if (r3 == r13) goto L49
            goto Le9
        L49:
            java.lang.String r3 = r17.getName()
            if (r9 == 0) goto L5d
            boolean r13 = r3.equals(r10)
            if (r13 == 0) goto L5d
            r3 = 0
            r9 = 0
            r11 = r17
            r10 = r9
            r9 = 0
            goto L22b
        L5d:
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L71
            r2.f15969b = r7
            r2.f15970c = r7
            r2.f15971d = r7
            r2.f15972e = r7
            r2.f15973f = r6
            r2.f15974g = r6
            goto Le9
        L71:
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L9d
            boolean r3 = r2.f15975h
            if (r3 != 0) goto Le9
            n0.b r3 = r2.f15993z
            if (r3 == 0) goto L89
            boolean r3 = r3.mo9206a()
            if (r3 == 0) goto L89
            r2.m8066a()
            goto Le9
        L89:
            r2.f15975h = r6
            android.view.Menu r3 = r2.f15968a
            int r11 = r2.f15969b
            int r12 = r2.f15976i
            int r13 = r2.f15977j
            java.lang.CharSequence r14 = r2.f15978k
            android.view.MenuItem r3 = r3.add(r11, r12, r13, r14)
            r2.m8068c(r3)
            goto Le9
        L9d:
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Le9
            r3 = 1
            r11 = r17
            r8 = 1
            goto L22b
        La9:
            if (r9 == 0) goto Lac
            goto Le9
        Lac:
            java.lang.String r3 = r17.getName()
            boolean r12 = r3.equals(r12)
            r14 = 5
            r15 = 4
            if (r12 == 0) goto Led
            k.f r3 = r2.f15967E
            android.content.Context r3 = r3.f15958c
            int[] r11 = p064e.C1495i.f7272o
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r1, r11)
            int r11 = r3.getResourceId(r6, r7)
            r2.f15969b = r11
            int r11 = r3.getInt(r13, r7)
            r2.f15970c = r11
            int r11 = r3.getInt(r15, r7)
            r2.f15971d = r11
            int r11 = r3.getInt(r14, r7)
            r2.f15972e = r11
            boolean r11 = r3.getBoolean(r5, r6)
            r2.f15973f = r11
            boolean r11 = r3.getBoolean(r7, r6)
            r2.f15974g = r11
            r3.recycle()
        Le9:
            r11 = r17
            goto L22b
        Led:
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L217
            k.f r3 = r2.f15967E
            android.content.Context r3 = r3.f15958c
            int[] r11 = p064e.C1495i.f7273p
            androidx.appcompat.widget.y0 r3 = androidx.appcompat.widget.C0314y0.m847q(r3, r1, r11)
            int r11 = r3.m861m(r5, r7)
            r2.f15976i = r11
            int r11 = r2.f15970c
            int r11 = r3.m858j(r14, r11)
            int r12 = r2.f15971d
            r14 = 6
            int r12 = r3.m858j(r14, r12)
            r14 = -65536(0xffffffffffff0000, float:NaN)
            r11 = r11 & r14
            r14 = 65535(0xffff, float:9.1834E-41)
            r12 = r12 & r14
            r11 = r11 | r12
            r2.f15977j = r11
            r11 = 7
            java.lang.CharSequence r11 = r3.m863o(r11)
            r2.f15978k = r11
            r11 = 8
            java.lang.CharSequence r11 = r3.m863o(r11)
            r2.f15979l = r11
            int r11 = r3.m861m(r7, r7)
            r2.f15980m = r11
            r11 = 9
            java.lang.String r11 = r3.m862n(r11)
            if (r11 != 0) goto L139
            r11 = 0
            goto L13d
        L139:
            char r11 = r11.charAt(r7)
        L13d:
            r2.f15981n = r11
            r11 = 16
            r12 = 4096(0x1000, float:5.74E-42)
            int r11 = r3.m858j(r11, r12)
            r2.f15982o = r11
            r11 = 10
            java.lang.String r11 = r3.m862n(r11)
            if (r11 != 0) goto L153
            r11 = 0
            goto L157
        L153:
            char r11 = r11.charAt(r7)
        L157:
            r2.f15983p = r11
            r11 = 20
            int r11 = r3.m858j(r11, r12)
            r2.f15984q = r11
            r11 = 11
            boolean r12 = r3.m864p(r11)
            if (r12 == 0) goto L16e
            boolean r11 = r3.m849a(r11, r7)
            goto L170
        L16e:
            int r11 = r2.f15972e
        L170:
            r2.f15985r = r11
            boolean r11 = r3.m849a(r13, r7)
            r2.f15986s = r11
            boolean r11 = r2.f15973f
            boolean r11 = r3.m849a(r15, r11)
            r2.f15987t = r11
            boolean r11 = r2.f15974g
            boolean r11 = r3.m849a(r6, r11)
            r2.f15988u = r11
            r11 = 21
            r12 = -1
            int r11 = r3.m858j(r11, r12)
            r2.f15989v = r11
            r11 = 12
            java.lang.String r11 = r3.m862n(r11)
            r2.f15992y = r11
            r11 = 13
            int r11 = r3.m861m(r11, r7)
            r2.f15990w = r11
            r11 = 15
            java.lang.String r11 = r3.m862n(r11)
            r2.f15991x = r11
            r11 = 14
            java.lang.String r11 = r3.m862n(r11)
            if (r11 == 0) goto L1b3
            r13 = 1
            goto L1b4
        L1b3:
            r13 = 0
        L1b4:
            if (r13 == 0) goto L1cb
            int r14 = r2.f15990w
            if (r14 != 0) goto L1cb
            java.lang.String r14 = r2.f15991x
            if (r14 != 0) goto L1cb
            java.lang.Class<?>[] r13 = p177k.C3622f.f15955f
            k.f r14 = r2.f15967E
            java.lang.Object[] r14 = r14.f15957b
            java.lang.Object r11 = r2.m8067b(r11, r13, r14)
            n0.b r11 = (p227n0.AbstractC4643b) r11
            goto L1d5
        L1cb:
            if (r13 == 0) goto L1d4
            java.lang.String r11 = "SupportMenuInflater"
            java.lang.String r13 = "Ignoring attribute 'actionProviderClass'. Action view already specified."
            android.util.Log.w(r11, r13)
        L1d4:
            r11 = 0
        L1d5:
            r2.f15993z = r11
            r11 = 17
            java.lang.CharSequence r11 = r3.m863o(r11)
            r2.f15963A = r11
            r11 = 22
            java.lang.CharSequence r11 = r3.m863o(r11)
            r2.f15964B = r11
            r11 = 19
            boolean r13 = r3.m864p(r11)
            if (r13 == 0) goto L1fd
            int r11 = r3.m858j(r11, r12)
            android.graphics.PorterDuff$Mode r12 = r2.f15966D
            android.graphics.PorterDuff$Mode r11 = androidx.appcompat.widget.C0271e0.m710d(r11, r12)
            r2.f15966D = r11
            r11 = 0
            goto L200
        L1fd:
            r11 = 0
            r2.f15966D = r11
        L200:
            r12 = 18
            boolean r13 = r3.m864p(r12)
            if (r13 == 0) goto L20c
            android.content.res.ColorStateList r11 = r3.m851c(r12)
        L20c:
            r2.f15965C = r11
            android.content.res.TypedArray r3 = r3.f1501b
            r3.recycle()
            r2.f15975h = r7
            goto Le9
        L217:
            boolean r11 = r3.equals(r4)
            if (r11 == 0) goto L227
            android.view.SubMenu r3 = r2.m8066a()
            r11 = r17
            r0.m8065b(r11, r1, r3)
            goto L22b
        L227:
            r11 = r17
            r9 = 1
            r10 = r3
        L22b:
            int r3 = r17.next()
            goto L3a
        L231:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unexpected end of document"
            r1.<init>(r2)
            throw r1
        L239:
            return
        L23a:
            r11 = r17
            goto Lf
    }

    @Override // android.view.MenuInflater
    public void inflate(int r4, android.view.Menu r5) {
            r3 = this;
            java.lang.String r0 = "Error inflating menu XML"
            boolean r1 = r5 instanceof p138i0.InterfaceMenuC3055a
            if (r1 != 0) goto La
            super.inflate(r4, r5)
            return
        La:
            r1 = 0
            android.content.Context r2 = r3.f15958c     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L29
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L29
            android.content.res.XmlResourceParser r1 = r2.getLayout(r4)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L29
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r1)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L29
            r3.m8065b(r1, r4, r5)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L29
            r1.close()
            return
        L20:
            r4 = move-exception
            goto L30
        L22:
            r4 = move-exception
            android.view.InflateException r5 = new android.view.InflateException     // Catch: java.lang.Throwable -> L20
            r5.<init>(r0, r4)     // Catch: java.lang.Throwable -> L20
            throw r5     // Catch: java.lang.Throwable -> L20
        L29:
            r4 = move-exception
            android.view.InflateException r5 = new android.view.InflateException     // Catch: java.lang.Throwable -> L20
            r5.<init>(r0, r4)     // Catch: java.lang.Throwable -> L20
            throw r5     // Catch: java.lang.Throwable -> L20
        L30:
            if (r1 == 0) goto L35
            r1.close()
        L35:
            throw r4
    }
}
