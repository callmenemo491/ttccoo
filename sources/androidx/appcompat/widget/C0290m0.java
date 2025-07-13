package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.m0 */
/* loaded from: classes.dex */
public final class C0290m0 {

    /* renamed from: h */
    public static final android.graphics.PorterDuff.Mode f1378h = null;

    /* renamed from: i */
    public static androidx.appcompat.widget.C0290m0 f1379i;

    /* renamed from: j */
    public static final androidx.appcompat.widget.C0290m0.c f1380j = null;

    /* renamed from: a */
    public java.util.WeakHashMap<android.content.Context, p319s.C5942i<android.content.res.ColorStateList>> f1381a;

    /* renamed from: b */
    public p319s.C5941h<java.lang.String, androidx.appcompat.widget.C0290m0.e> f1382b;

    /* renamed from: c */
    public p319s.C5942i<java.lang.String> f1383c;

    /* renamed from: d */
    public final java.util.WeakHashMap<android.content.Context, p319s.C5938e<java.lang.ref.WeakReference<android.graphics.drawable.Drawable.ConstantState>>> f1384d;

    /* renamed from: e */
    public android.util.TypedValue f1385e;

    /* renamed from: f */
    public boolean f1386f;

    /* renamed from: g */
    public androidx.appcompat.widget.C0290m0.f f1387g;

    /* renamed from: androidx.appcompat.widget.m0$a */
    public static class a implements androidx.appcompat.widget.C0290m0.e {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.C0290m0.e
        /* renamed from: a */
        public android.graphics.drawable.Drawable mo767a(android.content.Context r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4, android.content.res.Resources.Theme r5) {
                r1 = this;
                android.content.res.Resources r0 = r2.getResources()     // Catch: java.lang.Exception -> L9
                h.b r2 = p116h.C2431b.m6156g(r2, r0, r3, r4, r5)     // Catch: java.lang.Exception -> L9
                return r2
            L9:
                r2 = move-exception
                java.lang.String r3 = "AsldcInflateDelegate"
                java.lang.String r4 = "Exception while inflating <animated-selector>"
                android.util.Log.e(r3, r4, r2)
                r2 = 0
                return r2
        }
    }

    /* renamed from: androidx.appcompat.widget.m0$b */
    public static class b implements androidx.appcompat.widget.C0290m0.e {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.C0290m0.e
        /* renamed from: a */
        public android.graphics.drawable.Drawable mo767a(android.content.Context r4, org.xmlpull.v1.XmlPullParser r5, android.util.AttributeSet r6, android.content.res.Resources.Theme r7) {
                r3 = this;
                r0 = 0
                android.content.res.Resources r1 = r4.getResources()     // Catch: java.lang.Exception -> Le
                u1.c r2 = new u1.c     // Catch: java.lang.Exception -> Le
                r2.<init>(r4, r0, r0)     // Catch: java.lang.Exception -> Le
                r2.inflate(r1, r5, r6, r7)     // Catch: java.lang.Exception -> Le
                return r2
            Le:
                r4 = move-exception
                java.lang.String r5 = "AvdcInflateDelegate"
                java.lang.String r6 = "Exception while inflating <animated-vector>"
                android.util.Log.e(r5, r6, r4)
                return r0
        }
    }

    /* renamed from: androidx.appcompat.widget.m0$c */
    public static class c extends p319s.C5939f<java.lang.Integer, android.graphics.PorterDuffColorFilter> {
        public c(int r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* renamed from: androidx.appcompat.widget.m0$d */
    public static class d implements androidx.appcompat.widget.C0290m0.e {
        public d() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.C0290m0.e
        /* renamed from: a */
        public android.graphics.drawable.Drawable mo767a(android.content.Context r4, org.xmlpull.v1.XmlPullParser r5, android.util.AttributeSet r6, android.content.res.Resources.Theme r7) {
                r3 = this;
                java.lang.String r0 = r6.getClassAttribute()
                if (r0 == 0) goto L35
                java.lang.Class<androidx.appcompat.widget.m0$d> r1 = androidx.appcompat.widget.C0290m0.d.class
                java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Exception -> L2d
                java.lang.Class r0 = r1.loadClass(r0)     // Catch: java.lang.Exception -> L2d
                java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
                java.lang.Class r0 = r0.asSubclass(r1)     // Catch: java.lang.Exception -> L2d
                r1 = 0
                java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L2d
                java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L2d
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L2d
                java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L2d
                android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0     // Catch: java.lang.Exception -> L2d
                android.content.res.Resources r4 = r4.getResources()     // Catch: java.lang.Exception -> L2d
                r0.inflate(r4, r5, r6, r7)     // Catch: java.lang.Exception -> L2d
                return r0
            L2d:
                r4 = move-exception
                java.lang.String r5 = "DrawableDelegate"
                java.lang.String r6 = "Exception while inflating <drawable>"
                android.util.Log.e(r5, r6, r4)
            L35:
                r4 = 0
                return r4
        }
    }

    /* renamed from: androidx.appcompat.widget.m0$e */
    public interface e {
        /* renamed from: a */
        android.graphics.drawable.Drawable mo767a(android.content.Context r1, org.xmlpull.v1.XmlPullParser r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4);
    }

    /* renamed from: androidx.appcompat.widget.m0$f */
    public interface f {
    }

    /* renamed from: androidx.appcompat.widget.m0$g */
    public static class g implements androidx.appcompat.widget.C0290m0.e {
        public g() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.C0290m0.e
        /* renamed from: a */
        public android.graphics.drawable.Drawable mo767a(android.content.Context r1, org.xmlpull.v1.XmlPullParser r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4) {
                r0 = this;
                android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Exception -> L9
                u1.g r1 = p348u1.C6289g.m12916a(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L9
                return r1
            L9:
                r1 = move-exception
                java.lang.String r2 = "VdcInflateDelegate"
                java.lang.String r3 = "Exception while inflating <vector>"
                android.util.Log.e(r2, r3, r1)
                r1 = 0
                return r1
        }
    }

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            androidx.appcompat.widget.C0290m0.f1378h = r0
            androidx.appcompat.widget.m0$c r0 = new androidx.appcompat.widget.m0$c
            r1 = 6
            r0.<init>(r1)
            androidx.appcompat.widget.C0290m0.f1380j = r0
            return
    }

    public C0290m0() {
            r2 = this;
            r2.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = 0
            r0.<init>(r1)
            r2.f1384d = r0
            return
    }

    /* renamed from: d */
    public static synchronized androidx.appcompat.widget.C0290m0 m754d() {
            java.lang.Class<androidx.appcompat.widget.m0> r0 = androidx.appcompat.widget.C0290m0.class
            monitor-enter(r0)
            androidx.appcompat.widget.m0 r1 = androidx.appcompat.widget.C0290m0.f1379i     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L11
            androidx.appcompat.widget.m0 r1 = new androidx.appcompat.widget.m0     // Catch: java.lang.Throwable -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L15
            androidx.appcompat.widget.C0290m0.f1379i = r1     // Catch: java.lang.Throwable -> L15
            m756j(r1)     // Catch: java.lang.Throwable -> L15
        L11:
            androidx.appcompat.widget.m0 r1 = androidx.appcompat.widget.C0290m0.f1379i     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            return r1
        L15:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* renamed from: h */
    public static synchronized android.graphics.PorterDuffColorFilter m755h(int r4, android.graphics.PorterDuff.Mode r5) {
            java.lang.Class<androidx.appcompat.widget.m0> r0 = androidx.appcompat.widget.C0290m0.class
            monitor-enter(r0)
            androidx.appcompat.widget.m0$c r1 = androidx.appcompat.widget.C0290m0.f1380j     // Catch: java.lang.Throwable -> L36
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> L36
            int r2 = r4 + 31
            int r2 = r2 * 31
            int r3 = r5.hashCode()     // Catch: java.lang.Throwable -> L36
            int r3 = r3 + r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L36
            java.lang.Object r3 = r1.m12329b(r3)     // Catch: java.lang.Throwable -> L36
            android.graphics.PorterDuffColorFilter r3 = (android.graphics.PorterDuffColorFilter) r3     // Catch: java.lang.Throwable -> L36
            if (r3 != 0) goto L34
            android.graphics.PorterDuffColorFilter r3 = new android.graphics.PorterDuffColorFilter     // Catch: java.lang.Throwable -> L36
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L36
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> L36
            int r4 = r5.hashCode()     // Catch: java.lang.Throwable -> L36
            int r4 = r4 + r2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = r1.m12330c(r4, r3)     // Catch: java.lang.Throwable -> L36
            android.graphics.PorterDuffColorFilter r4 = (android.graphics.PorterDuffColorFilter) r4     // Catch: java.lang.Throwable -> L36
        L34:
            monitor-exit(r0)
            return r3
        L36:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    /* renamed from: j */
    public static void m756j(androidx.appcompat.widget.C0290m0 r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 >= r1) goto L2e
            androidx.appcompat.widget.m0$g r0 = new androidx.appcompat.widget.m0$g
            r0.<init>()
            java.lang.String r1 = "vector"
            r2.m757a(r1, r0)
            androidx.appcompat.widget.m0$b r0 = new androidx.appcompat.widget.m0$b
            r0.<init>()
            java.lang.String r1 = "animated-vector"
            r2.m757a(r1, r0)
            androidx.appcompat.widget.m0$a r0 = new androidx.appcompat.widget.m0$a
            r0.<init>()
            java.lang.String r1 = "animated-selector"
            r2.m757a(r1, r0)
            androidx.appcompat.widget.m0$d r0 = new androidx.appcompat.widget.m0$d
            r0.<init>()
            java.lang.String r1 = "drawable"
            r2.m757a(r1, r0)
        L2e:
            return
    }

    /* renamed from: a */
    public final void m757a(java.lang.String r2, androidx.appcompat.widget.C0290m0.e r3) {
            r1 = this;
            s.h<java.lang.String, androidx.appcompat.widget.m0$e> r0 = r1.f1382b
            if (r0 != 0) goto Lb
            s.h r0 = new s.h
            r0.<init>()
            r1.f1382b = r0
        Lb:
            s.h<java.lang.String, androidx.appcompat.widget.m0$e> r0 = r1.f1382b
            r0.put(r2, r3)
            return
    }

    /* renamed from: b */
    public final synchronized boolean m758b(android.content.Context r3, long r4, android.graphics.drawable.Drawable r6) {
            r2 = this;
            monitor-enter(r2)
            android.graphics.drawable.Drawable$ConstantState r6 = r6.getConstantState()     // Catch: java.lang.Throwable -> L28
            if (r6 == 0) goto L25
            java.util.WeakHashMap<android.content.Context, s.e<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r2.f1384d     // Catch: java.lang.Throwable -> L28
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L28
            s.e r0 = (p319s.C5938e) r0     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L1b
            s.e r0 = new s.e     // Catch: java.lang.Throwable -> L28
            r0.<init>()     // Catch: java.lang.Throwable -> L28
            java.util.WeakHashMap<android.content.Context, s.e<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r1 = r2.f1384d     // Catch: java.lang.Throwable -> L28
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L28
        L1b:
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L28
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L28
            r0.m12326g(r4, r3)     // Catch: java.lang.Throwable -> L28
            r3 = 1
            goto L26
        L25:
            r3 = 0
        L26:
            monitor-exit(r2)
            return r3
        L28:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    /* renamed from: c */
    public final android.graphics.drawable.Drawable m759c(android.content.Context r8, int r9) {
            r7 = this;
            android.util.TypedValue r0 = r7.f1385e
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r7.f1385e = r0
        Lb:
            android.util.TypedValue r0 = r7.f1385e
            android.content.res.Resources r1 = r8.getResources()
            r2 = 1
            r1.getValue(r9, r0, r2)
            int r1 = r0.assetCookie
            long r3 = (long) r1
            r1 = 32
            long r3 = r3 << r1
            int r1 = r0.data
            long r5 = (long) r1
            long r3 = r3 | r5
            android.graphics.drawable.Drawable r1 = r7.m760e(r8, r3)
            if (r1 == 0) goto L26
            return r1
        L26:
            androidx.appcompat.widget.m0$f r1 = r7.f1387g
            r5 = 0
            if (r1 != 0) goto L2c
            goto L6d
        L2c:
            androidx.appcompat.widget.k$a r1 = (androidx.appcompat.widget.C0285k.a) r1
            r6 = 2131230743(0x7f080017, float:1.8077547E38)
            if (r9 != r6) goto L4f
            android.graphics.drawable.LayerDrawable r5 = new android.graphics.drawable.LayerDrawable
            r9 = 2
            android.graphics.drawable.Drawable[] r9 = new android.graphics.drawable.Drawable[r9]
            r1 = 0
            r6 = 2131230742(0x7f080016, float:1.8077545E38)
            android.graphics.drawable.Drawable r6 = r7.m761f(r8, r6)
            r9[r1] = r6
            r1 = 2131230744(0x7f080018, float:1.807755E38)
            android.graphics.drawable.Drawable r1 = r7.m761f(r8, r1)
            r9[r2] = r1
            r5.<init>(r9)
            goto L6d
        L4f:
            r2 = 2131230778(0x7f08003a, float:1.8077618E38)
            if (r9 != r2) goto L58
            r9 = 2131165243(0x7f07003b, float:1.7944698E38)
            goto L69
        L58:
            r2 = 2131230777(0x7f080039, float:1.8077616E38)
            if (r9 != r2) goto L61
            r9 = 2131165244(0x7f07003c, float:1.79447E38)
            goto L69
        L61:
            r2 = 2131230779(0x7f08003b, float:1.807762E38)
            if (r9 != r2) goto L6d
            r9 = 2131165245(0x7f07003d, float:1.7944702E38)
        L69:
            android.graphics.drawable.LayerDrawable r5 = r1.m750c(r7, r8, r9)
        L6d:
            if (r5 == 0) goto L77
            int r9 = r0.changingConfigurations
            r5.setChangingConfigurations(r9)
            r7.m758b(r8, r3, r5)
        L77:
            return r5
    }

    /* renamed from: e */
    public final synchronized android.graphics.drawable.Drawable m760e(android.content.Context r4, long r5) {
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, s.e<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f1384d     // Catch: java.lang.Throwable -> L41
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L41
            s.e r0 = (p319s.C5938e) r0     // Catch: java.lang.Throwable -> L41
            r1 = 0
            if (r0 != 0) goto Le
            monitor-exit(r3)
            return r1
        Le:
            java.lang.Object r2 = r0.m12325f(r5, r1)     // Catch: java.lang.Throwable -> L41
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L41
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L28
            android.content.res.Resources r4 = r4.getResources()     // Catch: java.lang.Throwable -> L41
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch: java.lang.Throwable -> L41
            monitor-exit(r3)
            return r4
        L28:
            long[] r4 = r0.f22780Z     // Catch: java.lang.Throwable -> L41
            int r2 = r0.f22782b0     // Catch: java.lang.Throwable -> L41
            int r4 = p319s.C5937d.m12315b(r4, r2, r5)     // Catch: java.lang.Throwable -> L41
            if (r4 < 0) goto L3f
            java.lang.Object[] r5 = r0.f22781a0     // Catch: java.lang.Throwable -> L41
            r6 = r5[r4]     // Catch: java.lang.Throwable -> L41
            java.lang.Object r2 = p319s.C5938e.f22778c0     // Catch: java.lang.Throwable -> L41
            if (r6 == r2) goto L3f
            r5[r4] = r2     // Catch: java.lang.Throwable -> L41
            r4 = 1
            r0.f22779Y = r4     // Catch: java.lang.Throwable -> L41
        L3f:
            monitor-exit(r3)
            return r1
        L41:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    /* renamed from: f */
    public synchronized android.graphics.drawable.Drawable m761f(android.content.Context r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            android.graphics.drawable.Drawable r2 = r1.m762g(r2, r3, r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return r2
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    /* renamed from: g */
    public synchronized android.graphics.drawable.Drawable m762g(android.content.Context r5, int r6, boolean r7) {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f1386f     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L6
            goto L2b
        L6:
            r0 = 1
            r4.f1386f = r0     // Catch: java.lang.Throwable -> L4a
            r1 = 2131230805(0x7f080055, float:1.8077673E38)
            android.graphics.drawable.Drawable r1 = r4.m761f(r5, r1)     // Catch: java.lang.Throwable -> L4a
            r2 = 0
            if (r1 == 0) goto L4c
            boolean r3 = r1 instanceof p348u1.C6289g     // Catch: java.lang.Throwable -> L4a
            if (r3 != 0) goto L29
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L4a
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L28
            goto L29
        L28:
            r0 = 0
        L29:
            if (r0 == 0) goto L4c
        L2b:
            android.graphics.drawable.Drawable r0 = r4.m764k(r5, r6)     // Catch: java.lang.Throwable -> L4a
            if (r0 != 0) goto L35
            android.graphics.drawable.Drawable r0 = r4.m759c(r5, r6)     // Catch: java.lang.Throwable -> L4a
        L35:
            if (r0 != 0) goto L3d
            java.lang.Object r0 = p046d0.C1259a.f6733a     // Catch: java.lang.Throwable -> L4a
            android.graphics.drawable.Drawable r0 = p046d0.C1259a.b.m3710b(r5, r6)     // Catch: java.lang.Throwable -> L4a
        L3d:
            if (r0 == 0) goto L43
            android.graphics.drawable.Drawable r0 = r4.m765l(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L4a
        L43:
            if (r0 == 0) goto L48
            androidx.appcompat.widget.C0271e0.m708b(r0)     // Catch: java.lang.Throwable -> L4a
        L48:
            monitor-exit(r4)
            return r0
        L4a:
            r5 = move-exception
            goto L56
        L4c:
            r4.f1386f = r2     // Catch: java.lang.Throwable -> L4a
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4a
            java.lang.String r6 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L4a
            throw r5     // Catch: java.lang.Throwable -> L4a
        L56:
            monitor-exit(r4)
            throw r5
    }

    /* renamed from: i */
    public synchronized android.content.res.ColorStateList m763i(android.content.Context r4, int r5) {
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, s.i<android.content.res.ColorStateList>> r0 = r3.f1381a     // Catch: java.lang.Throwable -> L49
            r1 = 0
            if (r0 == 0) goto L15
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L49
            s.i r0 = (p319s.C5942i) r0     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L15
            java.lang.Object r0 = r0.m12349e(r5, r1)     // Catch: java.lang.Throwable -> L49
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch: java.lang.Throwable -> L49
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 != 0) goto L4b
            androidx.appcompat.widget.m0$f r0 = r3.f1387g     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L1d
            goto L23
        L1d:
            androidx.appcompat.widget.k$a r0 = (androidx.appcompat.widget.C0285k.a) r0     // Catch: java.lang.Throwable -> L49
            android.content.res.ColorStateList r1 = r0.m751d(r4, r5)     // Catch: java.lang.Throwable -> L49
        L23:
            if (r1 == 0) goto L47
            java.util.WeakHashMap<android.content.Context, s.i<android.content.res.ColorStateList>> r0 = r3.f1381a     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L30
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch: java.lang.Throwable -> L49
            r0.<init>()     // Catch: java.lang.Throwable -> L49
            r3.f1381a = r0     // Catch: java.lang.Throwable -> L49
        L30:
            java.util.WeakHashMap<android.content.Context, s.i<android.content.res.ColorStateList>> r0 = r3.f1381a     // Catch: java.lang.Throwable -> L49
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L49
            s.i r0 = (p319s.C5942i) r0     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L44
            s.i r0 = new s.i     // Catch: java.lang.Throwable -> L49
            r0.<init>()     // Catch: java.lang.Throwable -> L49
            java.util.WeakHashMap<android.content.Context, s.i<android.content.res.ColorStateList>> r2 = r3.f1381a     // Catch: java.lang.Throwable -> L49
            r2.put(r4, r0)     // Catch: java.lang.Throwable -> L49
        L44:
            r0.m12345a(r5, r1)     // Catch: java.lang.Throwable -> L49
        L47:
            r0 = r1
            goto L4b
        L49:
            r4 = move-exception
            goto L4d
        L4b:
            monitor-exit(r3)
            return r0
        L4d:
            monitor-exit(r3)
            throw r4
    }

    /* renamed from: k */
    public final android.graphics.drawable.Drawable m764k(android.content.Context r11, int r12) {
            r10 = this;
            s.h<java.lang.String, androidx.appcompat.widget.m0$e> r0 = r10.f1382b
            r1 = 0
            if (r0 == 0) goto Lb7
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb7
            s.i<java.lang.String> r0 = r10.f1383c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L28
            java.lang.Object r0 = r0.m12349e(r12, r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L27
            if (r0 == 0) goto L2f
            s.h<java.lang.String, androidx.appcompat.widget.m0$e> r3 = r10.f1382b
            java.lang.Object r0 = r3.getOrDefault(r0, r1)
            if (r0 != 0) goto L2f
        L27:
            return r1
        L28:
            s.i r0 = new s.i
            r0.<init>()
            r10.f1383c = r0
        L2f:
            android.util.TypedValue r0 = r10.f1385e
            if (r0 != 0) goto L3a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f1385e = r0
        L3a:
            android.util.TypedValue r0 = r10.f1385e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            int r4 = r0.assetCookie
            long r4 = (long) r4
            r6 = 32
            long r4 = r4 << r6
            int r6 = r0.data
            long r6 = (long) r6
            long r4 = r4 | r6
            android.graphics.drawable.Drawable r6 = r10.m760e(r11, r4)
            if (r6 == 0) goto L55
            return r6
        L55:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto Laf
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto Laf
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch: java.lang.Exception -> La7
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch: java.lang.Exception -> La7
        L6d:
            int r8 = r1.next()     // Catch: java.lang.Exception -> La7
            r9 = 2
            if (r8 == r9) goto L77
            if (r8 == r3) goto L77
            goto L6d
        L77:
            if (r8 != r9) goto L9f
            java.lang.String r3 = r1.getName()     // Catch: java.lang.Exception -> La7
            s.i<java.lang.String> r8 = r10.f1383c     // Catch: java.lang.Exception -> La7
            r8.m12345a(r12, r3)     // Catch: java.lang.Exception -> La7
            s.h<java.lang.String, androidx.appcompat.widget.m0$e> r8 = r10.f1382b     // Catch: java.lang.Exception -> La7
            java.lang.Object r3 = r8.get(r3)     // Catch: java.lang.Exception -> La7
            androidx.appcompat.widget.m0$e r3 = (androidx.appcompat.widget.C0290m0.e) r3     // Catch: java.lang.Exception -> La7
            if (r3 == 0) goto L94
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch: java.lang.Exception -> La7
            android.graphics.drawable.Drawable r6 = r3.mo767a(r11, r1, r7, r8)     // Catch: java.lang.Exception -> La7
        L94:
            if (r6 == 0) goto Laf
            int r0 = r0.changingConfigurations     // Catch: java.lang.Exception -> La7
            r6.setChangingConfigurations(r0)     // Catch: java.lang.Exception -> La7
            r10.m758b(r11, r4, r6)     // Catch: java.lang.Exception -> La7
            goto Laf
        L9f:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Exception -> La7
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch: java.lang.Exception -> La7
            throw r11     // Catch: java.lang.Exception -> La7
        La7:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        Laf:
            if (r6 != 0) goto Lb6
            s.i<java.lang.String> r11 = r10.f1383c
            r11.m12345a(r12, r2)
        Lb6:
            return r6
        Lb7:
            return r1
    }

    /* renamed from: l */
    public final android.graphics.drawable.Drawable m765l(android.content.Context r12, int r13, boolean r14, android.graphics.drawable.Drawable r15) {
            r11 = this;
            android.content.res.ColorStateList r0 = r11.m763i(r12, r13)
            r1 = 0
            if (r0 == 0) goto L2d
            boolean r12 = androidx.appcompat.widget.C0271e0.m707a(r15)
            if (r12 == 0) goto L11
            android.graphics.drawable.Drawable r15 = r15.mutate()
        L11:
            android.graphics.drawable.Drawable r15 = p103g0.C2200a.m5792h(r15)
            r15.setTintList(r0)
            androidx.appcompat.widget.m0$f r12 = r11.f1387g
            if (r12 != 0) goto L1d
            goto L26
        L1d:
            androidx.appcompat.widget.k$a r12 = (androidx.appcompat.widget.C0285k.a) r12
            r12 = 2131230792(0x7f080048, float:1.8077647E38)
            if (r13 != r12) goto L26
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
        L26:
            if (r1 == 0) goto Lb2
            r15.setTintMode(r1)
            goto Lb2
        L2d:
            androidx.appcompat.widget.m0$f r0 = r11.f1387g
            if (r0 == 0) goto La9
            androidx.appcompat.widget.k$a r0 = (androidx.appcompat.widget.C0285k.a) r0
            r2 = 1
            r3 = 16908301(0x102000d, float:2.3877265E-38)
            r4 = 16908303(0x102000f, float:2.387727E-38)
            r5 = 16908288(0x1020000, float:2.387723E-38)
            r6 = 2130968821(0x7f0400f5, float:1.7546306E38)
            r7 = 2130968823(0x7f0400f7, float:1.754631E38)
            r8 = 2131230787(0x7f080043, float:1.8077637E38)
            if (r13 != r8) goto L6e
            r8 = r15
            android.graphics.drawable.LayerDrawable r8 = (android.graphics.drawable.LayerDrawable) r8
            android.graphics.drawable.Drawable r5 = r8.findDrawableByLayerId(r5)
            int r9 = androidx.appcompat.widget.C0304t0.m789c(r12, r7)
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.C0285k.f1357b
            r0.m752e(r5, r9, r10)
            android.graphics.drawable.Drawable r4 = r8.findDrawableByLayerId(r4)
            int r5 = androidx.appcompat.widget.C0304t0.m789c(r12, r7)
            r0.m752e(r4, r5, r10)
            android.graphics.drawable.Drawable r3 = r8.findDrawableByLayerId(r3)
            int r4 = androidx.appcompat.widget.C0304t0.m789c(r12, r6)
            r0.m752e(r3, r4, r10)
            goto La6
        L6e:
            r8 = 2131230778(0x7f08003a, float:1.8077618E38)
            if (r13 == r8) goto L80
            r8 = 2131230777(0x7f080039, float:1.8077616E38)
            if (r13 == r8) goto L80
            r8 = 2131230779(0x7f08003b, float:1.807762E38)
            if (r13 != r8) goto L7e
            goto L80
        L7e:
            r2 = 0
            goto La6
        L80:
            r8 = r15
            android.graphics.drawable.LayerDrawable r8 = (android.graphics.drawable.LayerDrawable) r8
            android.graphics.drawable.Drawable r5 = r8.findDrawableByLayerId(r5)
            int r7 = androidx.appcompat.widget.C0304t0.m788b(r12, r7)
            android.graphics.PorterDuff$Mode r9 = androidx.appcompat.widget.C0285k.f1357b
            r0.m752e(r5, r7, r9)
            android.graphics.drawable.Drawable r4 = r8.findDrawableByLayerId(r4)
            int r5 = androidx.appcompat.widget.C0304t0.m789c(r12, r6)
            r0.m752e(r4, r5, r9)
            android.graphics.drawable.Drawable r3 = r8.findDrawableByLayerId(r3)
            int r4 = androidx.appcompat.widget.C0304t0.m789c(r12, r6)
            r0.m752e(r3, r4, r9)
        La6:
            if (r2 == 0) goto La9
            goto Lb2
        La9:
            boolean r12 = r11.m766m(r12, r13, r15)
            if (r12 != 0) goto Lb2
            if (r14 == 0) goto Lb2
            r15 = r1
        Lb2:
            return r15
    }

    /* renamed from: m */
    public boolean m766m(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
            r7 = this;
            androidx.appcompat.widget.m0$f r0 = r7.f1387g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L72
            androidx.appcompat.widget.k$a r0 = (androidx.appcompat.widget.C0285k.a) r0
            java.util.Objects.requireNonNull(r0)
            android.graphics.PorterDuff$Mode r3 = androidx.appcompat.widget.C0285k.f1357b
            int[] r4 = r0.f1360a
            boolean r4 = r0.m748a(r4, r9)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            if (r4 == 0) goto L1d
            r5 = 2130968823(0x7f0400f7, float:1.754631E38)
            goto L49
        L1d:
            int[] r4 = r0.f1362c
            boolean r4 = r0.m748a(r4, r9)
            if (r4 == 0) goto L29
            r5 = 2130968821(0x7f0400f5, float:1.7546306E38)
            goto L49
        L29:
            int[] r4 = r0.f1363d
            boolean r0 = r0.m748a(r4, r9)
            if (r0 == 0) goto L34
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L49
        L34:
            r0 = 2131230764(0x7f08002c, float:1.807759E38)
            if (r9 != r0) goto L44
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r0 = java.lang.Math.round(r0)
            goto L4b
        L44:
            r0 = 2131230746(0x7f08001a, float:1.8077553E38)
            if (r9 != r0) goto L4d
        L49:
            r9 = r5
            r0 = -1
        L4b:
            r4 = 1
            goto L50
        L4d:
            r9 = 0
            r0 = -1
            r4 = 0
        L50:
            if (r4 == 0) goto L6e
            boolean r4 = androidx.appcompat.widget.C0271e0.m707a(r10)
            if (r4 == 0) goto L5c
            android.graphics.drawable.Drawable r10 = r10.mutate()
        L5c:
            int r8 = androidx.appcompat.widget.C0304t0.m789c(r8, r9)
            android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.C0285k.m743c(r8, r3)
            r10.setColorFilter(r8)
            if (r0 == r6) goto L6c
            r10.setAlpha(r0)
        L6c:
            r8 = 1
            goto L6f
        L6e:
            r8 = 0
        L6f:
            if (r8 == 0) goto L72
            goto L73
        L72:
            r1 = 0
        L73:
            return r1
    }
}
