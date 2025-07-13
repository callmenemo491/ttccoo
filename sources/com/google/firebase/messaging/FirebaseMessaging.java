package com.google.firebase.messaging;

/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: j */
    public static final long f6603j = 0;

    /* renamed from: k */
    @android.annotation.SuppressLint({"StaticFieldLeak"})
    public static com.google.firebase.messaging.C1246a f6604k;

    /* renamed from: l */
    @android.annotation.SuppressLint({"FirebaseUnknownNullness"})
    public static p335t3.InterfaceC6154g f6605l;

    /* renamed from: m */
    public static java.util.concurrent.ScheduledExecutorService f6606m;

    /* renamed from: a */
    public final p251o9.C5180d f6607a;

    /* renamed from: b */
    public final va.InterfaceC6629a f6608b;

    /* renamed from: c */
    public final p412xa.InterfaceC7011d f6609c;

    /* renamed from: d */
    public final android.content.Context f6610d;

    /* renamed from: e */
    public final p057db.C1417r f6611e;

    /* renamed from: f */
    public final p057db.C1425z f6612f;

    /* renamed from: g */
    public final com.google.firebase.messaging.FirebaseMessaging.C1245a f6613g;

    /* renamed from: h */
    public final p057db.C1421v f6614h;

    /* renamed from: i */
    public boolean f6615i;

    /* renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    public class C1245a {

        /* renamed from: a */
        public final p342ta.InterfaceC6206d f6616a;

        /* renamed from: b */
        public boolean f6617b;

        /* renamed from: c */
        public p342ta.InterfaceC6204b<p251o9.C5177a> f6618c;

        /* renamed from: d */
        public java.lang.Boolean f6619d;

        /* renamed from: e */
        public final /* synthetic */ com.google.firebase.messaging.FirebaseMessaging f6620e;

        public C1245a(com.google.firebase.messaging.FirebaseMessaging r1, p342ta.InterfaceC6206d r2) {
                r0 = this;
                r0.f6620e = r1
                r0.<init>()
                r0.f6616a = r2
                return
        }

        /* renamed from: a */
        public synchronized void m3662a() {
                r3 = this;
                monitor-enter(r3)
                boolean r0 = r3.f6617b     // Catch: java.lang.Throwable -> L22
                if (r0 == 0) goto L7
                monitor-exit(r3)
                return
            L7:
                java.lang.Boolean r0 = r3.m3664c()     // Catch: java.lang.Throwable -> L22
                r3.f6619d = r0     // Catch: java.lang.Throwable -> L22
                if (r0 != 0) goto L1d
                db.o r0 = new db.o     // Catch: java.lang.Throwable -> L22
                r0.<init>(r3)     // Catch: java.lang.Throwable -> L22
                r3.f6618c = r0     // Catch: java.lang.Throwable -> L22
                ta.d r1 = r3.f6616a     // Catch: java.lang.Throwable -> L22
                java.lang.Class<o9.a> r2 = p251o9.C5177a.class
                r1.mo12808a(r2, r0)     // Catch: java.lang.Throwable -> L22
            L1d:
                r0 = 1
                r3.f6617b = r0     // Catch: java.lang.Throwable -> L22
                monitor-exit(r3)
                return
            L22:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
        }

        /* renamed from: b */
        public synchronized boolean m3663b() {
                r1 = this;
                monitor-enter(r1)
                r1.m3662a()     // Catch: java.lang.Throwable -> L17
                java.lang.Boolean r0 = r1.f6619d     // Catch: java.lang.Throwable -> L17
                if (r0 == 0) goto Ld
                boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L17
                goto L15
            Ld:
                com.google.firebase.messaging.FirebaseMessaging r0 = r1.f6620e     // Catch: java.lang.Throwable -> L17
                o9.d r0 = r0.f6607a     // Catch: java.lang.Throwable -> L17
                boolean r0 = r0.m11500h()     // Catch: java.lang.Throwable -> L17
            L15:
                monitor-exit(r1)
                return r0
            L17:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
        }

        /* renamed from: c */
        public final java.lang.Boolean m3664c() {
                r6 = this;
                java.lang.String r0 = "firebase_messaging_auto_init_enabled"
                com.google.firebase.messaging.FirebaseMessaging r1 = r6.f6620e
                o9.d r1 = r1.f6607a
                r1.m11497a()
                android.content.Context r1 = r1.f20312a
                java.lang.String r2 = "com.google.firebase.messaging"
                r3 = 0
                android.content.SharedPreferences r2 = r1.getSharedPreferences(r2, r3)
                java.lang.String r4 = "auto_init"
                boolean r5 = r2.contains(r4)
                if (r5 == 0) goto L23
                boolean r0 = r2.getBoolean(r4, r3)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            L23:
                android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
                if (r2 == 0) goto L4a
                java.lang.String r1 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
                r3 = 128(0x80, float:1.8E-43)
                android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
                if (r1 == 0) goto L4a
                android.os.Bundle r2 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
                if (r2 == 0) goto L4a
                boolean r2 = r2.containsKey(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
                if (r2 == 0) goto L4a
                android.os.Bundle r1 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
                boolean r0 = r1.getBoolean(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
                return r0
            L4a:
                r0 = 0
                return r0
        }
    }

    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.HOURS
            r1 = 8
            long r0 = r0.toSeconds(r1)
            com.google.firebase.messaging.FirebaseMessaging.f6603j = r0
            return
    }

    public FirebaseMessaging(p251o9.C5180d r21, va.InterfaceC6629a r22, p392wa.InterfaceC6823b<p095fb.InterfaceC2137g> r23, p392wa.InterfaceC6823b<ua.InterfaceC6369d> r24, p412xa.InterfaceC7011d r25, p335t3.InterfaceC6154g r26, p342ta.InterfaceC6206d r27) {
            r20 = this;
            r8 = r20
            r0 = r21
            r7 = r22
            db.v r9 = new db.v
            r21.m11497a()
            android.content.Context r1 = r0.f20312a
            r9.<init>(r1)
            db.r r10 = new db.r
            r1 = r10
            r2 = r21
            r3 = r9
            r4 = r23
            r5 = r24
            r6 = r25
            r1.<init>(r2, r3, r4, r5, r6)
            v6.a r1 = new v6.a
            java.lang.String r2 = "Firebase-Messaging-Task"
            r1.<init>(r2)
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newSingleThreadExecutor(r1)
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = new java.util.concurrent.ScheduledThreadPoolExecutor
            v6.a r3 = new v6.a
            java.lang.String r4 = "Firebase-Messaging-Init"
            r3.<init>(r4)
            r11 = 1
            r2.<init>(r11, r3)
            r20.<init>()
            r3 = 0
            r8.f6615i = r3
            com.google.firebase.messaging.FirebaseMessaging.f6605l = r26
            r8.f6607a = r0
            r8.f6608b = r7
            r5 = r25
            r8.f6609c = r5
            com.google.firebase.messaging.FirebaseMessaging$a r4 = new com.google.firebase.messaging.FirebaseMessaging$a
            r6 = r27
            r4.<init>(r8, r6)
            r8.f6613g = r4
            r21.m11497a()
            android.content.Context r4 = r0.f20312a
            r8.f6610d = r4
            db.m r6 = new db.m
            r6.<init>()
            r8.f6614h = r9
            r8.f6611e = r10
            db.z r12 = new db.z
            r12.<init>(r1)
            r8.f6612f = r12
            r21.m11497a()
            android.content.Context r0 = r0.f20312a
            boolean r1 = r0 instanceof android.app.Application
            if (r1 == 0) goto L76
            android.app.Application r0 = (android.app.Application) r0
            r0.registerActivityLifecycleCallbacks(r6)
            goto L8e
        L76:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r1 = r1 + 125
            r6.<init>(r1)
            java.lang.String r1 = "Context "
            java.lang.String r12 = " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result."
            java.lang.String r13 = "FirebaseMessaging"
            p057db.C1387a.m3905a(r6, r1, r0, r12, r13)
        L8e:
            if (r7 == 0) goto L98
            db.n r0 = new db.n
            r0.<init>(r8, r3)
            r7.m13481b(r0)
        L98:
            java.lang.Class<com.google.firebase.messaging.FirebaseMessaging> r1 = com.google.firebase.messaging.FirebaseMessaging.class
            monitor-enter(r1)
            com.google.firebase.messaging.a r0 = com.google.firebase.messaging.FirebaseMessaging.f6604k     // Catch: java.lang.Throwable -> Lfe
            if (r0 != 0) goto La6
            com.google.firebase.messaging.a r0 = new com.google.firebase.messaging.a     // Catch: java.lang.Throwable -> Lfe
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Lfe
            com.google.firebase.messaging.FirebaseMessaging.f6604k = r0     // Catch: java.lang.Throwable -> Lfe
        La6:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lfe
            f6.i r0 = new f6.i
            r0.<init>(r8)
            r2.execute(r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = new java.util.concurrent.ScheduledThreadPoolExecutor
            v6.a r1 = new v6.a
            java.lang.String r2 = "Firebase-Messaging-Topics-Io"
            r1.<init>(r2)
            r0.<init>(r11, r1)
            int r1 = p057db.C1400g0.f7038k
            db.f0 r12 = new db.f0
            r1 = r12
            r2 = r4
            r3 = r0
            r4 = r20
            r5 = r25
            r6 = r9
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            s7.i r0 = p327s7.C5988l.m12462c(r0, r12)
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r17 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r18 = new java.util.concurrent.LinkedBlockingQueue
            r18.<init>()
            v6.a r2 = new v6.a
            java.lang.String r3 = "Firebase-Messaging-Trigger-Topics-Io"
            r2.<init>(r3)
            r13 = 0
            r14 = 1
            r15 = 30
            r12 = r1
            r19 = r2
            r12.<init>(r13, r14, r15, r17, r18, r19)
            db.n r2 = new db.n
            r2.<init>(r8, r11)
            s7.q r0 = (p327s7.C5993q) r0
            z2.n r3 = r0.f23097b
            s7.n r4 = new s7.n
            r4.<init>(r1, r2)
            r3.m14310g(r4)
            r0.m12476u()
            return
        Lfe:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lfe
            throw r0
    }

    @androidx.annotation.Keep
    public static synchronized com.google.firebase.messaging.FirebaseMessaging getInstance(p251o9.C5180d r2) {
            java.lang.Class<com.google.firebase.messaging.FirebaseMessaging> r0 = com.google.firebase.messaging.FirebaseMessaging.class
            monitor-enter(r0)
            r2.m11497a()     // Catch: java.lang.Throwable -> L15
            y9.i r2 = r2.f20315d     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r2.mo14246a(r0)     // Catch: java.lang.Throwable -> L15
            com.google.firebase.messaging.FirebaseMessaging r2 = (com.google.firebase.messaging.FirebaseMessaging) r2     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "Firebase Messaging component is not present"
            com.google.android.gms.common.internal.C1101a.m3104i(r2, r1)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            return r2
        L15:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    /* renamed from: a */
    public java.lang.String m3653a() {
            r6 = this;
            va.a r0 = r6.f6608b
            if (r0 == 0) goto L18
            s7.i r0 = r0.m13480a()     // Catch: java.lang.InterruptedException -> Lf java.util.concurrent.ExecutionException -> L11
            java.lang.Object r0 = p327s7.C5988l.m12460a(r0)     // Catch: java.lang.InterruptedException -> Lf java.util.concurrent.ExecutionException -> L11
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.InterruptedException -> Lf java.util.concurrent.ExecutionException -> L11
            return r0
        Lf:
            r0 = move-exception
            goto L12
        L11:
            r0 = move-exception
        L12:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L18:
            com.google.firebase.messaging.a$a r0 = r6.m3656d()
            boolean r1 = r6.m3661i(r0)
            if (r1 != 0) goto L25
            java.lang.String r0 = r0.f6625a
            return r0
        L25:
            o9.d r1 = r6.f6607a
            java.lang.String r1 = p057db.C1421v.m3946b(r1)
            xa.d r2 = r6.f6609c
            s7.i r2 = r2.mo14165r()
            v6.a r3 = new v6.a
            java.lang.String r4 = "Firebase-Messaging-Network-Io"
            r3.<init>(r4)
            java.util.concurrent.ExecutorService r3 = java.util.concurrent.Executors.newSingleThreadExecutor(r3)
            androidx.appcompat.widget.x r4 = new androidx.appcompat.widget.x
            r4.<init>(r6, r1)
            s7.i r2 = r2.mo12449g(r3, r4)
            java.lang.Object r2 = p327s7.C5988l.m12460a(r2)     // Catch: java.lang.InterruptedException -> L68 java.util.concurrent.ExecutionException -> L6a
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.InterruptedException -> L68 java.util.concurrent.ExecutionException -> L6a
            com.google.firebase.messaging.a r3 = com.google.firebase.messaging.FirebaseMessaging.f6604k     // Catch: java.lang.InterruptedException -> L68 java.util.concurrent.ExecutionException -> L6a
            java.lang.String r4 = r6.m3655c()     // Catch: java.lang.InterruptedException -> L68 java.util.concurrent.ExecutionException -> L6a
            db.v r5 = r6.f6614h     // Catch: java.lang.InterruptedException -> L68 java.util.concurrent.ExecutionException -> L6a
            java.lang.String r5 = r5.m3947a()     // Catch: java.lang.InterruptedException -> L68 java.util.concurrent.ExecutionException -> L6a
            r3.m3670b(r4, r1, r2, r5)     // Catch: java.lang.InterruptedException -> L68 java.util.concurrent.ExecutionException -> L6a
            if (r0 == 0) goto L64
            java.lang.String r0 = r0.f6625a     // Catch: java.lang.InterruptedException -> L68 java.util.concurrent.ExecutionException -> L6a
            boolean r0 = r2.equals(r0)     // Catch: java.lang.InterruptedException -> L68 java.util.concurrent.ExecutionException -> L6a
            if (r0 != 0) goto L67
        L64:
            r6.m3657e(r2)     // Catch: java.lang.InterruptedException -> L68 java.util.concurrent.ExecutionException -> L6a
        L67:
            return r2
        L68:
            r0 = move-exception
            goto L6b
        L6a:
            r0 = move-exception
        L6b:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: b */
    public void m3654b(java.lang.Runnable r5, long r6) {
            r4 = this;
            java.lang.Class<com.google.firebase.messaging.FirebaseMessaging> r0 = com.google.firebase.messaging.FirebaseMessaging.class
            monitor-enter(r0)
            java.util.concurrent.ScheduledExecutorService r1 = com.google.firebase.messaging.FirebaseMessaging.f6606m     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L16
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = new java.util.concurrent.ScheduledThreadPoolExecutor     // Catch: java.lang.Throwable -> L1f
            v6.a r2 = new v6.a     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = "TAG"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1f
            r3 = 1
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L1f
            com.google.firebase.messaging.FirebaseMessaging.f6606m = r1     // Catch: java.lang.Throwable -> L1f
        L16:
            java.util.concurrent.ScheduledExecutorService r1 = com.google.firebase.messaging.FirebaseMessaging.f6606m     // Catch: java.lang.Throwable -> L1f
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L1f
            r1.schedule(r5, r6, r2)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return
        L1f:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r5
    }

    /* renamed from: c */
    public final java.lang.String m3655c() {
            r2 = this;
            o9.d r0 = r2.f6607a
            r0.m11497a()
            java.lang.String r0 = r0.f20313b
            java.lang.String r1 = "[DEFAULT]"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L12
            java.lang.String r0 = ""
            goto L18
        L12:
            o9.d r0 = r2.f6607a
            java.lang.String r0 = r0.m11498e()
        L18:
            return r0
    }

    /* renamed from: d */
    public com.google.firebase.messaging.C1246a.a m3656d() {
            r4 = this;
            com.google.firebase.messaging.a r0 = com.google.firebase.messaging.FirebaseMessaging.f6604k
            java.lang.String r1 = r4.m3655c()
            o9.d r2 = r4.f6607a
            java.lang.String r2 = p057db.C1421v.m3946b(r2)
            monitor-enter(r0)
            android.content.SharedPreferences r3 = r0.f6622a     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = r0.m3669a(r1, r2)     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            java.lang.String r1 = r3.getString(r1, r2)     // Catch: java.lang.Throwable -> L1e
            com.google.firebase.messaging.a$a r1 = com.google.firebase.messaging.C1246a.a.m3672b(r1)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)
            return r1
        L1e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* renamed from: e */
    public final void m3657e(java.lang.String r5) {
            r4 = this;
            o9.d r0 = r4.f6607a
            r0.m11497a()
            java.lang.String r0 = r0.f20313b
            java.lang.String r1 = "[DEFAULT]"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4e
            r0 = 3
            java.lang.String r1 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L38
            o9.d r0 = r4.f6607a
            r0.m11497a()
            java.lang.String r0 = r0.f20313b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Invoking onNewToken for app: "
            int r3 = r0.length()
            if (r3 == 0) goto L30
            java.lang.String r0 = r2.concat(r0)
            goto L35
        L30:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L35:
            android.util.Log.d(r1, r0)
        L38:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.firebase.messaging.NEW_TOKEN"
            r0.<init>(r1)
            java.lang.String r1 = "token"
            r0.putExtra(r1, r5)
            db.l r5 = new db.l
            android.content.Context r1 = r4.f6610d
            r5.<init>(r1)
            r5.m3933b(r0)
        L4e:
            return
    }

    /* renamed from: f */
    public synchronized void m3658f(boolean r1) {
            r0 = this;
            monitor-enter(r0)
            r0.f6615i = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* renamed from: g */
    public final void m3659g() {
            r2 = this;
            va.a r0 = r2.f6608b
            if (r0 == 0) goto L8
            r0.m13482c()
            return
        L8:
            com.google.firebase.messaging.a$a r0 = r2.m3656d()
            boolean r0 = r2.m3661i(r0)
            if (r0 == 0) goto L21
            monitor-enter(r2)
            boolean r0 = r2.f6615i     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L1c
            r0 = 0
            r2.m3660h(r0)     // Catch: java.lang.Throwable -> L1e
        L1c:
            monitor-exit(r2)
            return
        L1e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L21:
            return
    }

    /* renamed from: h */
    public synchronized void m3660h(long r5) {
            r4 = this;
            monitor-enter(r4)
            r0 = 30
            long r2 = r5 + r5
            long r0 = java.lang.Math.max(r0, r2)     // Catch: java.lang.Throwable -> L1c
            long r2 = com.google.firebase.messaging.FirebaseMessaging.f6603j     // Catch: java.lang.Throwable -> L1c
            long r0 = java.lang.Math.min(r0, r2)     // Catch: java.lang.Throwable -> L1c
            db.c0 r2 = new db.c0     // Catch: java.lang.Throwable -> L1c
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L1c
            r4.m3654b(r2, r5)     // Catch: java.lang.Throwable -> L1c
            r5 = 1
            r4.f6615i = r5     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r4)
            return
        L1c:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    /* renamed from: i */
    public boolean m3661i(com.google.firebase.messaging.C1246a.a r9) {
            r8 = this;
            r0 = 1
            if (r9 == 0) goto L27
            db.v r1 = r8.f6614h
            java.lang.String r1 = r1.m3947a()
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r9.f6627c
            long r6 = com.google.firebase.messaging.C1246a.a.f6624d
            long r4 = r4 + r6
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L22
            java.lang.String r9 = r9.f6626b
            boolean r9 = r1.equals(r9)
            if (r9 != 0) goto L20
            goto L22
        L20:
            r9 = 0
            goto L23
        L22:
            r9 = 1
        L23:
            if (r9 == 0) goto L26
            goto L27
        L26:
            return r6
        L27:
            return r0
    }
}
