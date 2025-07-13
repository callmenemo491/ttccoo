package p227n0;

/* renamed from: n0.a0 */
/* loaded from: classes.dex */
public class C4642a0 {

    /* renamed from: b */
    public static final p227n0.C4642a0 f18505b = null;

    /* renamed from: a */
    public final p227n0.C4642a0.k f18506a;

    @android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: n0.a0$a */
    public static class a {

        /* renamed from: a */
        public static java.lang.reflect.Field f18507a;

        /* renamed from: b */
        public static java.lang.reflect.Field f18508b;

        /* renamed from: c */
        public static java.lang.reflect.Field f18509c;

        /* renamed from: d */
        public static boolean f18510d;

        static {
                java.lang.Class<android.view.View> r0 = android.view.View.class
                java.lang.String r1 = "mAttachInfo"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.ReflectiveOperationException -> L2d
                p227n0.C4642a0.a.f18507a = r0     // Catch: java.lang.ReflectiveOperationException -> L2d
                r1 = 1
                r0.setAccessible(r1)     // Catch: java.lang.ReflectiveOperationException -> L2d
                java.lang.String r0 = "android.view.View$AttachInfo"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ReflectiveOperationException -> L2d
                java.lang.String r2 = "mStableInsets"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L2d
                p227n0.C4642a0.a.f18508b = r2     // Catch: java.lang.ReflectiveOperationException -> L2d
                r2.setAccessible(r1)     // Catch: java.lang.ReflectiveOperationException -> L2d
                java.lang.String r2 = "mContentInsets"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L2d
                p227n0.C4642a0.a.f18509c = r0     // Catch: java.lang.ReflectiveOperationException -> L2d
                r0.setAccessible(r1)     // Catch: java.lang.ReflectiveOperationException -> L2d
                p227n0.C4642a0.a.f18510d = r1     // Catch: java.lang.ReflectiveOperationException -> L2d
                goto L44
            L2d:
                r0 = move-exception
                java.lang.String r1 = "Failed to get visible insets from AttachInfo "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r2 = r0.getMessage()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "WindowInsetsCompat"
                android.util.Log.w(r2, r1, r0)
            L44:
                return
        }
    }

    /* renamed from: n0.a0$b */
    public static class b extends p227n0.C4642a0.e {

        /* renamed from: d */
        public static java.lang.reflect.Field f18511d = null;

        /* renamed from: e */
        public static boolean f18512e = false;

        /* renamed from: f */
        public static java.lang.reflect.Constructor<android.view.WindowInsets> f18513f = null;

        /* renamed from: g */
        public static boolean f18514g = false;

        /* renamed from: b */
        public android.view.WindowInsets f18515b;

        /* renamed from: c */
        public p084f0.C1940c f18516c;

        public b() {
                r1 = this;
                r1.<init>()
                android.view.WindowInsets r0 = m10471e()
                r1.f18515b = r0
                return
        }

        public b(p227n0.C4642a0 r1) {
                r0 = this;
                r0.<init>(r1)
                android.view.WindowInsets r1 = r1.m10470g()
                r0.f18515b = r1
                return
        }

        /* renamed from: e */
        public static android.view.WindowInsets m10471e() {
                boolean r0 = p227n0.C4642a0.b.f18512e
                r1 = 1
                java.lang.String r2 = "WindowInsetsCompat"
                if (r0 != 0) goto L1a
                java.lang.Class<android.view.WindowInsets> r0 = android.view.WindowInsets.class
                java.lang.String r3 = "CONSUMED"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.ReflectiveOperationException -> L12
                p227n0.C4642a0.b.f18511d = r0     // Catch: java.lang.ReflectiveOperationException -> L12
                goto L18
            L12:
                r0 = move-exception
                java.lang.String r3 = "Could not retrieve WindowInsets.CONSUMED field"
                android.util.Log.i(r2, r3, r0)
            L18:
                p227n0.C4642a0.b.f18512e = r1
            L1a:
                java.lang.reflect.Field r0 = p227n0.C4642a0.b.f18511d
                r3 = 0
                if (r0 == 0) goto L33
                java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.ReflectiveOperationException -> L2d
                android.view.WindowInsets r0 = (android.view.WindowInsets) r0     // Catch: java.lang.ReflectiveOperationException -> L2d
                if (r0 == 0) goto L33
                android.view.WindowInsets r4 = new android.view.WindowInsets     // Catch: java.lang.ReflectiveOperationException -> L2d
                r4.<init>(r0)     // Catch: java.lang.ReflectiveOperationException -> L2d
                return r4
            L2d:
                r0 = move-exception
                java.lang.String r4 = "Could not get value from WindowInsets.CONSUMED field"
                android.util.Log.i(r2, r4, r0)
            L33:
                boolean r0 = p227n0.C4642a0.b.f18514g
                r4 = 0
                if (r0 != 0) goto L4f
                java.lang.Class<android.view.WindowInsets> r0 = android.view.WindowInsets.class
                java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.ReflectiveOperationException -> L47
                java.lang.Class<android.graphics.Rect> r6 = android.graphics.Rect.class
                r5[r4] = r6     // Catch: java.lang.ReflectiveOperationException -> L47
                java.lang.reflect.Constructor r0 = r0.getConstructor(r5)     // Catch: java.lang.ReflectiveOperationException -> L47
                p227n0.C4642a0.b.f18513f = r0     // Catch: java.lang.ReflectiveOperationException -> L47
                goto L4d
            L47:
                r0 = move-exception
                java.lang.String r5 = "Could not retrieve WindowInsets(Rect) constructor"
                android.util.Log.i(r2, r5, r0)
            L4d:
                p227n0.C4642a0.b.f18514g = r1
            L4f:
                java.lang.reflect.Constructor<android.view.WindowInsets> r0 = p227n0.C4642a0.b.f18513f
                if (r0 == 0) goto L69
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.ReflectiveOperationException -> L63
                android.graphics.Rect r5 = new android.graphics.Rect     // Catch: java.lang.ReflectiveOperationException -> L63
                r5.<init>()     // Catch: java.lang.ReflectiveOperationException -> L63
                r1[r4] = r5     // Catch: java.lang.ReflectiveOperationException -> L63
                java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.ReflectiveOperationException -> L63
                android.view.WindowInsets r0 = (android.view.WindowInsets) r0     // Catch: java.lang.ReflectiveOperationException -> L63
                return r0
            L63:
                r0 = move-exception
                java.lang.String r1 = "Could not invoke WindowInsets(Rect) constructor"
                android.util.Log.i(r2, r1, r0)
            L69:
                return r3
        }

        @Override // p227n0.C4642a0.e
        /* renamed from: b */
        public p227n0.C4642a0 mo10472b() {
                r3 = this;
                r3.m10475a()
                android.view.WindowInsets r0 = r3.f18515b
                n0.a0 r0 = p227n0.C4642a0.m10463h(r0)
                n0.a0$k r1 = r0.f18506a
                r2 = 0
                r1.mo10481l(r2)
                f0.c r1 = r3.f18516c
                n0.a0$k r2 = r0.f18506a
                r2.mo10489n(r1)
                return r0
        }

        @Override // p227n0.C4642a0.e
        /* renamed from: c */
        public void mo10473c(p084f0.C1940c r1) {
                r0 = this;
                r0.f18516c = r1
                return
        }

        @Override // p227n0.C4642a0.e
        /* renamed from: d */
        public void mo10474d(p084f0.C1940c r5) {
                r4 = this;
                android.view.WindowInsets r0 = r4.f18515b
                if (r0 == 0) goto L12
                int r1 = r5.f8481a
                int r2 = r5.f8482b
                int r3 = r5.f8483c
                int r5 = r5.f8484d
                android.view.WindowInsets r5 = r0.replaceSystemWindowInsets(r1, r2, r3, r5)
                r4.f18515b = r5
            L12:
                return
        }
    }

    /* renamed from: n0.a0$c */
    public static class c extends p227n0.C4642a0.e {

        /* renamed from: b */
        public final android.view.WindowInsets.Builder f18517b;

        public c() {
                r1 = this;
                r1.<init>()
                android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
                r0.<init>()
                r1.f18517b = r0
                return
        }

        public c(p227n0.C4642a0 r2) {
                r1 = this;
                r1.<init>(r2)
                android.view.WindowInsets r2 = r2.m10470g()
                android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
                if (r2 == 0) goto Lf
                r0.<init>(r2)
                goto L12
            Lf:
                r0.<init>()
            L12:
                r1.f18517b = r0
                return
        }

        @Override // p227n0.C4642a0.e
        /* renamed from: b */
        public p227n0.C4642a0 mo10472b() {
                r3 = this;
                r3.m10475a()
                android.view.WindowInsets$Builder r0 = r3.f18517b
                android.view.WindowInsets r0 = r0.build()
                n0.a0 r0 = p227n0.C4642a0.m10463h(r0)
                n0.a0$k r1 = r0.f18506a
                r2 = 0
                r1.mo10481l(r2)
                return r0
        }

        @Override // p227n0.C4642a0.e
        /* renamed from: c */
        public void mo10473c(p084f0.C1940c r2) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.f18517b
                android.graphics.Insets r2 = r2.m4829c()
                r0.setStableInsets(r2)
                return
        }

        @Override // p227n0.C4642a0.e
        /* renamed from: d */
        public void mo10474d(p084f0.C1940c r2) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.f18517b
                android.graphics.Insets r2 = r2.m4829c()
                r0.setSystemWindowInsets(r2)
                return
        }
    }

    /* renamed from: n0.a0$d */
    public static class d extends p227n0.C4642a0.c {
        public d() {
                r0 = this;
                r0.<init>()
                return
        }

        public d(p227n0.C4642a0 r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* renamed from: n0.a0$e */
    public static class e {

        /* renamed from: a */
        public final p227n0.C4642a0 f18518a;

        public e() {
                r2 = this;
                n0.a0 r0 = new n0.a0
                r1 = 0
                r0.<init>(r1)
                r2.<init>(r0)
                return
        }

        public e(p227n0.C4642a0 r1) {
                r0 = this;
                r0.<init>()
                r0.f18518a = r1
                return
        }

        /* renamed from: a */
        public final void m10475a() {
                r0 = this;
                return
        }

        /* renamed from: b */
        public p227n0.C4642a0 mo10472b() {
                r0 = this;
                r0 = 0
                throw r0
        }

        /* renamed from: c */
        public void mo10473c(p084f0.C1940c r1) {
                r0 = this;
                r0 = 0
                throw r0
        }

        /* renamed from: d */
        public void mo10474d(p084f0.C1940c r1) {
                r0 = this;
                r0 = 0
                throw r0
        }
    }

    /* renamed from: n0.a0$f */
    public static class f extends p227n0.C4642a0.k {

        /* renamed from: h */
        public static boolean f18519h = false;

        /* renamed from: i */
        public static java.lang.reflect.Method f18520i;

        /* renamed from: j */
        public static java.lang.Class<?> f18521j;

        /* renamed from: k */
        public static java.lang.reflect.Field f18522k;

        /* renamed from: l */
        public static java.lang.reflect.Field f18523l;

        /* renamed from: c */
        public final android.view.WindowInsets f18524c;

        /* renamed from: d */
        public p084f0.C1940c[] f18525d;

        /* renamed from: e */
        public p084f0.C1940c f18526e;

        /* renamed from: f */
        public p227n0.C4642a0 f18527f;

        /* renamed from: g */
        public p084f0.C1940c f18528g;

        public f(p227n0.C4642a0 r1, android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.f18526e = r1
                r0.f18524c = r2
                return
        }

        @android.annotation.SuppressLint({"PrivateApi"})
        /* renamed from: p */
        public static void m10476p() {
                r0 = 1
                java.lang.Class<android.view.View> r1 = android.view.View.class
                java.lang.String r2 = "getViewRootImpl"
                r3 = 0
                java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.ReflectiveOperationException -> L37
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.ReflectiveOperationException -> L37
                p227n0.C4642a0.f.f18520i = r1     // Catch: java.lang.ReflectiveOperationException -> L37
                java.lang.String r1 = "android.view.View$AttachInfo"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ReflectiveOperationException -> L37
                p227n0.C4642a0.f.f18521j = r1     // Catch: java.lang.ReflectiveOperationException -> L37
                java.lang.String r2 = "mVisibleInsets"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L37
                p227n0.C4642a0.f.f18522k = r1     // Catch: java.lang.ReflectiveOperationException -> L37
                java.lang.String r1 = "android.view.ViewRootImpl"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ReflectiveOperationException -> L37
                java.lang.String r2 = "mAttachInfo"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L37
                p227n0.C4642a0.f.f18523l = r1     // Catch: java.lang.ReflectiveOperationException -> L37
                java.lang.reflect.Field r1 = p227n0.C4642a0.f.f18522k     // Catch: java.lang.ReflectiveOperationException -> L37
                r1.setAccessible(r0)     // Catch: java.lang.ReflectiveOperationException -> L37
                java.lang.reflect.Field r1 = p227n0.C4642a0.f.f18523l     // Catch: java.lang.ReflectiveOperationException -> L37
                r1.setAccessible(r0)     // Catch: java.lang.ReflectiveOperationException -> L37
                goto L4e
            L37:
                r1 = move-exception
                java.lang.String r2 = "Failed to get visible insets. (Reflection error). "
                java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
                java.lang.String r3 = r1.getMessage()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "WindowInsetsCompat"
                android.util.Log.e(r3, r2, r1)
            L4e:
                p227n0.C4642a0.f.f18519h = r0
                return
        }

        @Override // p227n0.C4642a0.k
        /* renamed from: d */
        public void mo10477d(android.view.View r1) {
                r0 = this;
                f0.c r1 = r0.m10483o(r1)
                if (r1 != 0) goto L8
                f0.c r1 = p084f0.C1940c.f8480e
            L8:
                r0.m10484q(r1)
                return
        }

        @Override // p227n0.C4642a0.k
        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = super.equals(r2)
                if (r0 != 0) goto L8
                r2 = 0
                return r2
            L8:
                n0.a0$f r2 = (p227n0.C4642a0.f) r2
                f0.c r0 = r1.f18528g
                f0.c r2 = r2.f18528g
                boolean r2 = java.util.Objects.equals(r0, r2)
                return r2
        }

        @Override // p227n0.C4642a0.k
        /* renamed from: h */
        public final p084f0.C1940c mo10478h() {
                r4 = this;
                f0.c r0 = r4.f18526e
                if (r0 != 0) goto L22
                android.view.WindowInsets r0 = r4.f18524c
                int r0 = r0.getSystemWindowInsetLeft()
                android.view.WindowInsets r1 = r4.f18524c
                int r1 = r1.getSystemWindowInsetTop()
                android.view.WindowInsets r2 = r4.f18524c
                int r2 = r2.getSystemWindowInsetRight()
                android.view.WindowInsets r3 = r4.f18524c
                int r3 = r3.getSystemWindowInsetBottom()
                f0.c r0 = p084f0.C1940c.m4827a(r0, r1, r2, r3)
                r4.f18526e = r0
            L22:
                f0.c r0 = r4.f18526e
                return r0
        }

        @Override // p227n0.C4642a0.k
        /* renamed from: i */
        public p227n0.C4642a0 mo10479i(int r4, int r5, int r6, int r7) {
                r3 = this;
                android.view.WindowInsets r0 = r3.f18524c
                n0.a0 r0 = p227n0.C4642a0.m10463h(r0)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 30
                if (r1 < r2) goto L12
                n0.a0$d r1 = new n0.a0$d
                r1.<init>(r0)
                goto L21
            L12:
                r2 = 29
                if (r1 < r2) goto L1c
                n0.a0$c r1 = new n0.a0$c
                r1.<init>(r0)
                goto L21
            L1c:
                n0.a0$b r1 = new n0.a0$b
                r1.<init>(r0)
            L21:
                f0.c r0 = r3.mo10478h()
                f0.c r0 = p227n0.C4642a0.m10462e(r0, r4, r5, r6, r7)
                r1.mo10474d(r0)
                f0.c r0 = r3.mo10487g()
                f0.c r4 = p227n0.C4642a0.m10462e(r0, r4, r5, r6, r7)
                r1.mo10473c(r4)
                n0.a0 r4 = r1.mo10472b()
                return r4
        }

        @Override // p227n0.C4642a0.k
        /* renamed from: k */
        public boolean mo10480k() {
                r1 = this;
                android.view.WindowInsets r0 = r1.f18524c
                boolean r0 = r0.isRound()
                return r0
        }

        @Override // p227n0.C4642a0.k
        /* renamed from: l */
        public void mo10481l(p084f0.C1940c[] r1) {
                r0 = this;
                r0.f18525d = r1
                return
        }

        @Override // p227n0.C4642a0.k
        /* renamed from: m */
        public void mo10482m(p227n0.C4642a0 r1) {
                r0 = this;
                r0.f18527f = r1
                return
        }

        /* renamed from: o */
        public final p084f0.C1940c m10483o(android.view.View r6) {
                r5 = this;
                java.lang.String r0 = "WindowInsetsCompat"
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 30
                if (r1 >= r2) goto L64
                boolean r1 = p227n0.C4642a0.f.f18519h
                if (r1 != 0) goto Lf
                m10476p()
            Lf:
                java.lang.reflect.Method r1 = p227n0.C4642a0.f.f18520i
                r2 = 0
                if (r1 == 0) goto L63
                java.lang.Class<?> r3 = p227n0.C4642a0.f.f18521j
                if (r3 == 0) goto L63
                java.lang.reflect.Field r3 = p227n0.C4642a0.f.f18522k
                if (r3 != 0) goto L1d
                goto L63
            L1d:
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.ReflectiveOperationException -> L4e
                java.lang.Object r6 = r1.invoke(r6, r3)     // Catch: java.lang.ReflectiveOperationException -> L4e
                if (r6 != 0) goto L31
                java.lang.String r6 = "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden"
                java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.ReflectiveOperationException -> L4e
                r1.<init>()     // Catch: java.lang.ReflectiveOperationException -> L4e
                android.util.Log.w(r0, r6, r1)     // Catch: java.lang.ReflectiveOperationException -> L4e
                return r2
            L31:
                java.lang.reflect.Field r1 = p227n0.C4642a0.f.f18523l     // Catch: java.lang.ReflectiveOperationException -> L4e
                java.lang.Object r6 = r1.get(r6)     // Catch: java.lang.ReflectiveOperationException -> L4e
                java.lang.reflect.Field r1 = p227n0.C4642a0.f.f18522k     // Catch: java.lang.ReflectiveOperationException -> L4e
                java.lang.Object r6 = r1.get(r6)     // Catch: java.lang.ReflectiveOperationException -> L4e
                android.graphics.Rect r6 = (android.graphics.Rect) r6     // Catch: java.lang.ReflectiveOperationException -> L4e
                if (r6 == 0) goto L4d
                int r1 = r6.left     // Catch: java.lang.ReflectiveOperationException -> L4e
                int r3 = r6.top     // Catch: java.lang.ReflectiveOperationException -> L4e
                int r4 = r6.right     // Catch: java.lang.ReflectiveOperationException -> L4e
                int r6 = r6.bottom     // Catch: java.lang.ReflectiveOperationException -> L4e
                f0.c r2 = p084f0.C1940c.m4827a(r1, r3, r4, r6)     // Catch: java.lang.ReflectiveOperationException -> L4e
            L4d:
                return r2
            L4e:
                r6 = move-exception
                java.lang.String r1 = "Failed to get visible insets. (Reflection error). "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r3 = r6.getMessage()
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                android.util.Log.e(r0, r1, r6)
            L63:
                return r2
            L64:
                java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead."
                r6.<init>(r0)
                throw r6
        }

        /* renamed from: q */
        public void m10484q(p084f0.C1940c r1) {
                r0 = this;
                r0.f18528g = r1
                return
        }
    }

    /* renamed from: n0.a0$g */
    public static class g extends p227n0.C4642a0.f {

        /* renamed from: m */
        public p084f0.C1940c f18529m;

        public g(p227n0.C4642a0 r1, android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.f18529m = r1
                return
        }

        @Override // p227n0.C4642a0.k
        /* renamed from: b */
        public p227n0.C4642a0 mo10485b() {
                r1 = this;
                android.view.WindowInsets r0 = r1.f18524c
                android.view.WindowInsets r0 = r0.consumeStableInsets()
                n0.a0 r0 = p227n0.C4642a0.m10463h(r0)
                return r0
        }

        @Override // p227n0.C4642a0.k
        /* renamed from: c */
        public p227n0.C4642a0 mo10486c() {
                r1 = this;
                android.view.WindowInsets r0 = r1.f18524c
                android.view.WindowInsets r0 = r0.consumeSystemWindowInsets()
                n0.a0 r0 = p227n0.C4642a0.m10463h(r0)
                return r0
        }

        @Override // p227n0.C4642a0.k
        /* renamed from: g */
        public final p084f0.C1940c mo10487g() {
                r4 = this;
                f0.c r0 = r4.f18529m
                if (r0 != 0) goto L22
                android.view.WindowInsets r0 = r4.f18524c
                int r0 = r0.getStableInsetLeft()
                android.view.WindowInsets r1 = r4.f18524c
                int r1 = r1.getStableInsetTop()
                android.view.WindowInsets r2 = r4.f18524c
                int r2 = r2.getStableInsetRight()
                android.view.WindowInsets r3 = r4.f18524c
                int r3 = r3.getStableInsetBottom()
                f0.c r0 = p084f0.C1940c.m4827a(r0, r1, r2, r3)
                r4.f18529m = r0
            L22:
                f0.c r0 = r4.f18529m
                return r0
        }

        @Override // p227n0.C4642a0.k
        /* renamed from: j */
        public boolean mo10488j() {
                r1 = this;
                android.view.WindowInsets r0 = r1.f18524c
                boolean r0 = r0.isConsumed()
                return r0
        }

        @Override // p227n0.C4642a0.k
        /* renamed from: n */
        public void mo10489n(p084f0.C1940c r1) {
                r0 = this;
                r0.f18529m = r1
                return
        }
    }

    /* renamed from: n0.a0$h */
    public static class h extends p227n0.C4642a0.g {
        public h(p227n0.C4642a0 r1, android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // p227n0.C4642a0.k
        /* renamed from: a */
        public p227n0.C4642a0 mo10490a() {
                r1 = this;
                android.view.WindowInsets r0 = r1.f18524c
                android.view.WindowInsets r0 = r0.consumeDisplayCutout()
                n0.a0 r0 = p227n0.C4642a0.m10463h(r0)
                return r0
        }

        @Override // p227n0.C4642a0.k
        /* renamed from: e */
        public p227n0.C4645d mo10491e() {
                r2 = this;
                android.view.WindowInsets r0 = r2.f18524c
                android.view.DisplayCutout r0 = r0.getDisplayCutout()
                if (r0 != 0) goto La
                r0 = 0
                goto L10
            La:
                n0.d r1 = new n0.d
                r1.<init>(r0)
                r0 = r1
            L10:
                return r0
        }

        @Override // p227n0.C4642a0.f, p227n0.C4642a0.k
        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof p227n0.C4642a0.h
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                n0.a0$h r5 = (p227n0.C4642a0.h) r5
                android.view.WindowInsets r1 = r4.f18524c
                android.view.WindowInsets r3 = r5.f18524c
                boolean r1 = java.util.Objects.equals(r1, r3)
                if (r1 == 0) goto L21
                f0.c r1 = r4.f18528g
                f0.c r5 = r5.f18528g
                boolean r5 = java.util.Objects.equals(r1, r5)
                if (r5 == 0) goto L21
                goto L22
            L21:
                r0 = 0
            L22:
                return r0
        }

        @Override // p227n0.C4642a0.k
        public int hashCode() {
                r1 = this;
                android.view.WindowInsets r0 = r1.f18524c
                int r0 = r0.hashCode()
                return r0
        }
    }

    /* renamed from: n0.a0$i */
    public static class i extends p227n0.C4642a0.h {

        /* renamed from: n */
        public p084f0.C1940c f18530n;

        /* renamed from: o */
        public p084f0.C1940c f18531o;

        /* renamed from: p */
        public p084f0.C1940c f18532p;

        public i(p227n0.C4642a0 r1, android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.f18530n = r1
                r0.f18531o = r1
                r0.f18532p = r1
                return
        }

        @Override // p227n0.C4642a0.k
        /* renamed from: f */
        public p084f0.C1940c mo10492f() {
                r1 = this;
                f0.c r0 = r1.f18531o
                if (r0 != 0) goto L10
                android.view.WindowInsets r0 = r1.f18524c
                android.graphics.Insets r0 = r0.getMandatorySystemGestureInsets()
                f0.c r0 = p084f0.C1940c.m4828b(r0)
                r1.f18531o = r0
            L10:
                f0.c r0 = r1.f18531o
                return r0
        }

        @Override // p227n0.C4642a0.f, p227n0.C4642a0.k
        /* renamed from: i */
        public p227n0.C4642a0 mo10479i(int r2, int r3, int r4, int r5) {
                r1 = this;
                android.view.WindowInsets r0 = r1.f18524c
                android.view.WindowInsets r2 = r0.inset(r2, r3, r4, r5)
                n0.a0 r2 = p227n0.C4642a0.m10463h(r2)
                return r2
        }

        @Override // p227n0.C4642a0.g, p227n0.C4642a0.k
        /* renamed from: n */
        public void mo10489n(p084f0.C1940c r1) {
                r0 = this;
                return
        }
    }

    /* renamed from: n0.a0$j */
    public static class j extends p227n0.C4642a0.i {

        /* renamed from: q */
        public static final p227n0.C4642a0 f18533q = null;

        static {
                android.view.WindowInsets r0 = android.view.WindowInsets.CONSUMED
                n0.a0 r0 = p227n0.C4642a0.m10463h(r0)
                p227n0.C4642a0.j.f18533q = r0
                return
        }

        public j(p227n0.C4642a0 r1, android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // p227n0.C4642a0.f, p227n0.C4642a0.k
        /* renamed from: d */
        public final void mo10477d(android.view.View r1) {
                r0 = this;
                return
        }
    }

    /* renamed from: n0.a0$k */
    public static class k {

        /* renamed from: b */
        public static final p227n0.C4642a0 f18534b = null;

        /* renamed from: a */
        public final p227n0.C4642a0 f18535a;

        static {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                if (r0 < r1) goto Lc
                n0.a0$d r0 = new n0.a0$d
                r0.<init>()
                goto L1b
            Lc:
                r1 = 29
                if (r0 < r1) goto L16
                n0.a0$c r0 = new n0.a0$c
                r0.<init>()
                goto L1b
            L16:
                n0.a0$b r0 = new n0.a0$b
                r0.<init>()
            L1b:
                n0.a0 r0 = r0.mo10472b()
                n0.a0$k r0 = r0.f18506a
                n0.a0 r0 = r0.mo10490a()
                n0.a0$k r0 = r0.f18506a
                n0.a0 r0 = r0.mo10485b()
                n0.a0$k r0 = r0.f18506a
                n0.a0 r0 = r0.mo10486c()
                p227n0.C4642a0.k.f18534b = r0
                return
        }

        public k(p227n0.C4642a0 r1) {
                r0 = this;
                r0.<init>()
                r0.f18535a = r1
                return
        }

        /* renamed from: a */
        public p227n0.C4642a0 mo10490a() {
                r1 = this;
                n0.a0 r0 = r1.f18535a
                return r0
        }

        /* renamed from: b */
        public p227n0.C4642a0 mo10485b() {
                r1 = this;
                n0.a0 r0 = r1.f18535a
                return r0
        }

        /* renamed from: c */
        public p227n0.C4642a0 mo10486c() {
                r1 = this;
                n0.a0 r0 = r1.f18535a
                return r0
        }

        /* renamed from: d */
        public void mo10477d(android.view.View r1) {
                r0 = this;
                return
        }

        /* renamed from: e */
        public p227n0.C4645d mo10491e() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof p227n0.C4642a0.k
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                n0.a0$k r5 = (p227n0.C4642a0.k) r5
                boolean r1 = r4.mo10480k()
                boolean r3 = r5.mo10480k()
                if (r1 != r3) goto L4b
                boolean r1 = r4.mo10488j()
                boolean r3 = r5.mo10488j()
                if (r1 != r3) goto L4b
                f0.c r1 = r4.mo10478h()
                f0.c r3 = r5.mo10478h()
                boolean r1 = java.util.Objects.equals(r1, r3)
                if (r1 == 0) goto L4b
                f0.c r1 = r4.mo10487g()
                f0.c r3 = r5.mo10487g()
                boolean r1 = java.util.Objects.equals(r1, r3)
                if (r1 == 0) goto L4b
                n0.d r1 = r4.mo10491e()
                n0.d r5 = r5.mo10491e()
                boolean r5 = java.util.Objects.equals(r1, r5)
                if (r5 == 0) goto L4b
                goto L4c
            L4b:
                r0 = 0
            L4c:
                return r0
        }

        /* renamed from: f */
        public p084f0.C1940c mo10492f() {
                r1 = this;
                f0.c r0 = r1.mo10478h()
                return r0
        }

        /* renamed from: g */
        public p084f0.C1940c mo10487g() {
                r1 = this;
                f0.c r0 = p084f0.C1940c.f8480e
                return r0
        }

        /* renamed from: h */
        public p084f0.C1940c mo10478h() {
                r1 = this;
                f0.c r0 = p084f0.C1940c.f8480e
                return r0
        }

        public int hashCode() {
                r3 = this;
                r0 = 5
                java.lang.Object[] r0 = new java.lang.Object[r0]
                boolean r1 = r3.mo10480k()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                boolean r1 = r3.mo10488j()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r2 = 1
                r0[r2] = r1
                f0.c r1 = r3.mo10478h()
                r2 = 2
                r0[r2] = r1
                f0.c r1 = r3.mo10487g()
                r2 = 3
                r0[r2] = r1
                n0.d r1 = r3.mo10491e()
                r2 = 4
                r0[r2] = r1
                int r0 = java.util.Objects.hash(r0)
                return r0
        }

        /* renamed from: i */
        public p227n0.C4642a0 mo10479i(int r1, int r2, int r3, int r4) {
                r0 = this;
                n0.a0 r1 = p227n0.C4642a0.k.f18534b
                return r1
        }

        /* renamed from: j */
        public boolean mo10488j() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* renamed from: k */
        public boolean mo10480k() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* renamed from: l */
        public void mo10481l(p084f0.C1940c[] r1) {
                r0 = this;
                return
        }

        /* renamed from: m */
        public void mo10482m(p227n0.C4642a0 r1) {
                r0 = this;
                return
        }

        /* renamed from: n */
        public void mo10489n(p084f0.C1940c r1) {
                r0 = this;
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L9
            n0.a0 r0 = p227n0.C4642a0.j.f18533q
            goto Lb
        L9:
            n0.a0 r0 = p227n0.C4642a0.k.f18534b
        Lb:
            p227n0.C4642a0.f18505b = r0
            return
    }

    public C4642a0(android.view.WindowInsets r3) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lf
            n0.a0$j r0 = new n0.a0$j
            r0.<init>(r2, r3)
            goto L28
        Lf:
            r1 = 29
            if (r0 < r1) goto L19
            n0.a0$i r0 = new n0.a0$i
            r0.<init>(r2, r3)
            goto L28
        L19:
            r1 = 28
            if (r0 < r1) goto L23
            n0.a0$h r0 = new n0.a0$h
            r0.<init>(r2, r3)
            goto L28
        L23:
            n0.a0$g r0 = new n0.a0$g
            r0.<init>(r2, r3)
        L28:
            r2.f18506a = r0
            return
    }

    public C4642a0(p227n0.C4642a0 r1) {
            r0 = this;
            r0.<init>()
            n0.a0$k r1 = new n0.a0$k
            r1.<init>(r0)
            r0.f18506a = r1
            return
    }

    /* renamed from: e */
    public static p084f0.C1940c m10462e(p084f0.C1940c r5, int r6, int r7, int r8, int r9) {
            int r0 = r5.f8481a
            int r0 = r0 - r6
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            int r2 = r5.f8482b
            int r2 = r2 - r7
            int r2 = java.lang.Math.max(r1, r2)
            int r3 = r5.f8483c
            int r3 = r3 - r8
            int r3 = java.lang.Math.max(r1, r3)
            int r4 = r5.f8484d
            int r4 = r4 - r9
            int r1 = java.lang.Math.max(r1, r4)
            if (r0 != r6) goto L26
            if (r2 != r7) goto L26
            if (r3 != r8) goto L26
            if (r1 != r9) goto L26
            return r5
        L26:
            f0.c r5 = p084f0.C1940c.m4827a(r0, r2, r3, r1)
            return r5
    }

    /* renamed from: h */
    public static p227n0.C4642a0 m10463h(android.view.WindowInsets r1) {
            r0 = 0
            n0.a0 r1 = m10464i(r1, r0)
            return r1
    }

    /* renamed from: i */
    public static p227n0.C4642a0 m10464i(android.view.WindowInsets r2, android.view.View r3) {
            n0.a0 r0 = new n0.a0
            java.util.Objects.requireNonNull(r2)
            r0.<init>(r2)
            if (r3 == 0) goto L2f
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            boolean r2 = p227n0.C4661t.f.m10587b(r3)
            if (r2 == 0) goto L2f
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r2 < r1) goto L1d
            n0.a0 r2 = p227n0.C4661t.i.m10622a(r3)
            goto L21
        L1d:
            n0.a0 r2 = p227n0.C4661t.h.m10605j(r3)
        L21:
            n0.a0$k r1 = r0.f18506a
            r1.mo10482m(r2)
            android.view.View r2 = r3.getRootView()
            n0.a0$k r3 = r0.f18506a
            r3.mo10477d(r2)
        L2f:
            return r0
    }

    @java.lang.Deprecated
    /* renamed from: a */
    public int m10465a() {
            r1 = this;
            n0.a0$k r0 = r1.f18506a
            f0.c r0 = r0.mo10478h()
            int r0 = r0.f8484d
            return r0
    }

    @java.lang.Deprecated
    /* renamed from: b */
    public int m10466b() {
            r1 = this;
            n0.a0$k r0 = r1.f18506a
            f0.c r0 = r0.mo10478h()
            int r0 = r0.f8481a
            return r0
    }

    @java.lang.Deprecated
    /* renamed from: c */
    public int m10467c() {
            r1 = this;
            n0.a0$k r0 = r1.f18506a
            f0.c r0 = r0.mo10478h()
            int r0 = r0.f8483c
            return r0
    }

    @java.lang.Deprecated
    /* renamed from: d */
    public int m10468d() {
            r1 = this;
            n0.a0$k r0 = r1.f18506a
            f0.c r0 = r0.mo10478h()
            int r0 = r0.f8482b
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p227n0.C4642a0
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            n0.a0 r2 = (p227n0.C4642a0) r2
            n0.a0$k r0 = r1.f18506a
            n0.a0$k r2 = r2.f18506a
            boolean r2 = java.util.Objects.equals(r0, r2)
            return r2
    }

    /* renamed from: f */
    public boolean m10469f() {
            r1 = this;
            n0.a0$k r0 = r1.f18506a
            boolean r0 = r0.mo10488j()
            return r0
    }

    /* renamed from: g */
    public android.view.WindowInsets m10470g() {
            r2 = this;
            n0.a0$k r0 = r2.f18506a
            boolean r1 = r0 instanceof p227n0.C4642a0.f
            if (r1 == 0) goto Lb
            n0.a0$f r0 = (p227n0.C4642a0.f) r0
            android.view.WindowInsets r0 = r0.f18524c
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public int hashCode() {
            r1 = this;
            n0.a0$k r0 = r1.f18506a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            return r0
    }
}
