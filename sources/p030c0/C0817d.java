package p030c0;

/* renamed from: c0.d */
/* loaded from: classes.dex */
public final class C0817d {

    /* renamed from: a */
    public static final java.lang.Class<?> f4426a = null;

    /* renamed from: b */
    public static final java.lang.reflect.Field f4427b = null;

    /* renamed from: c */
    public static final java.lang.reflect.Field f4428c = null;

    /* renamed from: d */
    public static final java.lang.reflect.Method f4429d = null;

    /* renamed from: e */
    public static final java.lang.reflect.Method f4430e = null;

    /* renamed from: f */
    public static final java.lang.reflect.Method f4431f = null;

    /* renamed from: g */
    public static final android.os.Handler f4432g = null;

    /* renamed from: c0.d$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ p030c0.C0817d.c f4433Y;

        /* renamed from: Z */
        public final /* synthetic */ java.lang.Object f4434Z;

        public a(p030c0.C0817d.c r1, java.lang.Object r2) {
                r0 = this;
                r0.f4433Y = r1
                r0.f4434Z = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                c0.d$c r0 = r2.f4433Y
                java.lang.Object r1 = r2.f4434Z
                r0.f4437Y = r1
                return
        }
    }

    /* renamed from: c0.d$b */
    public class b implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ android.app.Application f4435Y;

        /* renamed from: Z */
        public final /* synthetic */ p030c0.C0817d.c f4436Z;

        public b(android.app.Application r1, p030c0.C0817d.c r2) {
                r0 = this;
                r0.f4435Y = r1
                r0.f4436Z = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                android.app.Application r0 = r2.f4435Y
                c0.d$c r1 = r2.f4436Z
                r0.unregisterActivityLifecycleCallbacks(r1)
                return
        }
    }

    /* renamed from: c0.d$c */
    public static final class c implements android.app.Application.ActivityLifecycleCallbacks {

        /* renamed from: Y */
        public java.lang.Object f4437Y;

        /* renamed from: Z */
        public android.app.Activity f4438Z;

        /* renamed from: a0 */
        public final int f4439a0;

        /* renamed from: b0 */
        public boolean f4440b0;

        /* renamed from: c0 */
        public boolean f4441c0;

        /* renamed from: d0 */
        public boolean f4442d0;

        public c(android.app.Activity r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f4440b0 = r0
                r1.f4441c0 = r0
                r1.f4442d0 = r0
                r1.f4438Z = r2
                int r2 = r2.hashCode()
                r1.f4439a0 = r2
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity r2) {
                r1 = this;
                android.app.Activity r0 = r1.f4438Z
                if (r0 != r2) goto La
                r2 = 0
                r1.f4438Z = r2
                r2 = 1
                r1.f4441c0 = r2
            La:
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity r6) {
                r5 = this;
                boolean r0 = r5.f4441c0
                if (r0 == 0) goto L42
                boolean r0 = r5.f4442d0
                if (r0 != 0) goto L42
                boolean r0 = r5.f4440b0
                if (r0 != 0) goto L42
                java.lang.Object r0 = r5.f4437Y
                int r1 = r5.f4439a0
                r2 = 0
                r3 = 1
                java.lang.reflect.Field r4 = p030c0.C0817d.f4428c     // Catch: java.lang.Throwable -> L33
                java.lang.Object r4 = r4.get(r6)     // Catch: java.lang.Throwable -> L33
                if (r4 != r0) goto L3b
                int r0 = r6.hashCode()     // Catch: java.lang.Throwable -> L33
                if (r0 == r1) goto L21
                goto L3b
            L21:
                java.lang.reflect.Field r0 = p030c0.C0817d.f4427b     // Catch: java.lang.Throwable -> L33
                java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L33
                android.os.Handler r0 = p030c0.C0817d.f4432g     // Catch: java.lang.Throwable -> L33
                c0.e r1 = new c0.e     // Catch: java.lang.Throwable -> L33
                r1.<init>(r6, r4)     // Catch: java.lang.Throwable -> L33
                r0.postAtFrontOfQueue(r1)     // Catch: java.lang.Throwable -> L33
                r2 = 1
                goto L3b
            L33:
                r6 = move-exception
                java.lang.String r0 = "ActivityRecreator"
                java.lang.String r1 = "Exception while fetching field values"
                android.util.Log.e(r0, r1, r6)
            L3b:
                if (r2 == 0) goto L42
                r5.f4442d0 = r3
                r6 = 0
                r5.f4437Y = r6
            L42:
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity r2) {
                r1 = this;
                android.app.Activity r0 = r1.f4438Z
                if (r0 != r2) goto L7
                r2 = 1
                r1.f4440b0 = r2
            L7:
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity r1) {
                r0 = this;
                return
        }
    }

    static {
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            p030c0.C0817d.f4432g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L15
            goto L16
        L15:
            r2 = r1
        L16:
            p030c0.C0817d.f4426a = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L23
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r3 = r1
        L24:
            p030c0.C0817d.f4427b = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L30
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L30
            goto L31
        L30:
            r0 = r1
        L31:
            p030c0.C0817d.f4428c = r0
            java.lang.Class<?> r0 = p030c0.C0817d.f4426a
            r3 = 3
            java.lang.String r4 = "performStopActivity"
            r5 = 2
            r6 = 0
            if (r0 != 0) goto L3e
        L3c:
            r0 = r1
            goto L53
        L3e:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L3c
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L3c
            r7[r2] = r8     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L3c
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L3c
        L53:
            p030c0.C0817d.f4429d = r0
            java.lang.Class<?> r0 = p030c0.C0817d.f4426a
            if (r0 != 0) goto L5b
        L59:
            r0 = r1
            goto L6c
        L5b:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L59
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L59
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L59
            r7[r2] = r8     // Catch: java.lang.Throwable -> L59
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L59
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L59
        L6c:
            p030c0.C0817d.f4430e = r0
            java.lang.Class<?> r0 = p030c0.C0817d.f4426a
            boolean r4 = m2464a()
            if (r4 == 0) goto Lad
            if (r0 != 0) goto L79
            goto Lad
        L79:
            java.lang.String r4 = "requestRelaunchActivity"
            r7 = 9
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> Lad
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> Lad
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r2] = r6     // Catch: java.lang.Throwable -> Lad
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r5] = r6     // Catch: java.lang.Throwable -> Lad
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lad
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lad
            r3 = 4
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lad
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lad
            r3 = 5
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch: java.lang.Throwable -> Lad
            r3 = 6
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch: java.lang.Throwable -> Lad
            r3 = 7
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lad
            r3 = 8
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lad
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> Lad
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> Lad
            r1 = r0
        Lad:
            p030c0.C0817d.f4431f = r1
            return
    }

    /* renamed from: a */
    public static boolean m2464a() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 == r1) goto Ld
            r1 = 27
            if (r0 != r1) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    /* renamed from: b */
    public static boolean m2465b(android.app.Activity r10) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 28
            if (r0 < r2) goto Lb
            r10.recreate()
            return r1
        Lb:
            boolean r0 = m2464a()
            r2 = 0
            if (r0 == 0) goto L17
            java.lang.reflect.Method r0 = p030c0.C0817d.f4431f
            if (r0 != 0) goto L17
            return r2
        L17:
            java.lang.reflect.Method r0 = p030c0.C0817d.f4430e
            if (r0 != 0) goto L20
            java.lang.reflect.Method r0 = p030c0.C0817d.f4429d
            if (r0 != 0) goto L20
            return r2
        L20:
            java.lang.reflect.Field r0 = p030c0.C0817d.f4428c     // Catch: java.lang.Throwable -> L91
            java.lang.Object r0 = r0.get(r10)     // Catch: java.lang.Throwable -> L91
            if (r0 != 0) goto L29
            return r2
        L29:
            java.lang.reflect.Field r3 = p030c0.C0817d.f4427b     // Catch: java.lang.Throwable -> L91
            java.lang.Object r3 = r3.get(r10)     // Catch: java.lang.Throwable -> L91
            if (r3 != 0) goto L32
            return r2
        L32:
            android.app.Application r4 = r10.getApplication()     // Catch: java.lang.Throwable -> L91
            c0.d$c r5 = new c0.d$c     // Catch: java.lang.Throwable -> L91
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L91
            r4.registerActivityLifecycleCallbacks(r5)     // Catch: java.lang.Throwable -> L91
            android.os.Handler r6 = p030c0.C0817d.f4432g     // Catch: java.lang.Throwable -> L91
            c0.d$a r7 = new c0.d$a     // Catch: java.lang.Throwable -> L91
            r7.<init>(r5, r0)     // Catch: java.lang.Throwable -> L91
            r6.post(r7)     // Catch: java.lang.Throwable -> L91
            boolean r7 = m2464a()     // Catch: java.lang.Throwable -> L85
            if (r7 == 0) goto L79
            java.lang.reflect.Method r10 = p030c0.C0817d.f4431f     // Catch: java.lang.Throwable -> L85
            r7 = 9
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L85
            r7[r2] = r0     // Catch: java.lang.Throwable -> L85
            r0 = 0
            r7[r1] = r0     // Catch: java.lang.Throwable -> L85
            r8 = 2
            r7[r8] = r0     // Catch: java.lang.Throwable -> L85
            r8 = 3
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L85
            r7[r8] = r9     // Catch: java.lang.Throwable -> L85
            r8 = 4
            java.lang.Boolean r9 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L85
            r7[r8] = r9     // Catch: java.lang.Throwable -> L85
            r8 = 5
            r7[r8] = r0     // Catch: java.lang.Throwable -> L85
            r8 = 6
            r7[r8] = r0     // Catch: java.lang.Throwable -> L85
            r0 = 7
            r7[r0] = r9     // Catch: java.lang.Throwable -> L85
            r0 = 8
            r7[r0] = r9     // Catch: java.lang.Throwable -> L85
            r10.invoke(r3, r7)     // Catch: java.lang.Throwable -> L85
            goto L7c
        L79:
            r10.recreate()     // Catch: java.lang.Throwable -> L85
        L7c:
            c0.d$b r10 = new c0.d$b     // Catch: java.lang.Throwable -> L91
            r10.<init>(r4, r5)     // Catch: java.lang.Throwable -> L91
            r6.post(r10)     // Catch: java.lang.Throwable -> L91
            return r1
        L85:
            r10 = move-exception
            android.os.Handler r0 = p030c0.C0817d.f4432g     // Catch: java.lang.Throwable -> L91
            c0.d$b r1 = new c0.d$b     // Catch: java.lang.Throwable -> L91
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L91
            r0.post(r1)     // Catch: java.lang.Throwable -> L91
            throw r10     // Catch: java.lang.Throwable -> L91
        L91:
            return r2
    }
}
