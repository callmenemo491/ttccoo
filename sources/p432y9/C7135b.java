package p432y9;

/* renamed from: y9.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C7135b implements p432y9.InterfaceC7139f {

    /* renamed from: a */
    public final /* synthetic */ int f27557a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.Object f27558b;

    public /* synthetic */ C7135b(com.google.firebase.crashlytics.CrashlyticsRegistrar r2) {
            r1 = this;
            r0 = 2
            r1.f27557a = r0
            r1.<init>()
            r1.f27558b = r2
            return
    }

    public /* synthetic */ C7135b(java.lang.Object r2, int r3) {
            r1 = this;
            r1.f27557a = r3
            r0 = 1
            r1.<init>()
            r1.f27558b = r2
            return
    }

    @Override // p432y9.InterfaceC7139f
    /* renamed from: a */
    public final java.lang.Object mo3940a(p432y9.InterfaceC7137d r39) {
            r38 = this;
            r1 = r38
            int r0 = r1.f27557a
            switch(r0) {
                case 0: goto Lb;
                case 1: goto L8;
                default: goto L7;
            }
        L7:
            goto Le
        L8:
            java.lang.Object r0 = r1.f27558b
            return r0
        Lb:
            java.lang.Object r0 = r1.f27558b
            return r0
        Le:
            java.lang.Object r0 = r1.f27558b
            com.google.firebase.crashlytics.CrashlyticsRegistrar r0 = (com.google.firebase.crashlytics.CrashlyticsRegistrar) r0
            java.util.Objects.requireNonNull(r0)
            java.lang.Class<o9.d> r0 = p251o9.C5180d.class
            r2 = r39
            y9.s r2 = (p432y9.C7152s) r2
            java.lang.Object r0 = r2.mo14246a(r0)
            o9.d r0 = (p251o9.C5180d) r0
            java.lang.Class<aa.a> r3 = p011aa.InterfaceC0045a.class
            wa.a r3 = r2.mo14257e(r3)
            java.lang.Class<s9.a> r4 = p329s9.InterfaceC5997a.class
            wa.a r4 = r2.mo14257e(r4)
            java.lang.Class<xa.d> r5 = p412xa.InterfaceC7011d.class
            java.lang.Object r2 = r2.mo14246a(r5)
            xa.d r2 = (p412xa.InterfaceC7011d) r2
            r0.m11497a()
            android.content.Context r11 = r0.f20312a
            java.lang.String r5 = r11.getPackageName()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Initializing Firebase Crashlytics "
            r6.append(r7)
            java.lang.String r7 = "18.2.3"
            r6.append(r7)
            java.lang.String r7 = " for "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "FirebaseCrashlytics"
            r13 = 0
            android.util.Log.i(r7, r6, r13)
            da.d0 r12 = new da.d0
            r12.<init>(r0)
            da.h0 r15 = new da.h0
            r15.<init>(r11, r5, r2, r12)
            aa.b r6 = new aa.b
            r6.<init>(r3)
            z9.b r2 = new z9.b
            r2.<init>(r4)
            java.lang.String r3 = "Crashlytics Exception Handler"
            java.util.concurrent.ExecutorService r10 = p056da.C1359g0.m3874a(r3)
            da.y r14 = new da.y
            z9.a r8 = new z9.a
            r9 = 0
            r8.<init>(r2, r9)
            z9.a r7 = new z9.a
            r5 = 1
            r7.<init>(r2, r5)
            r3 = r14
            r4 = r0
            r2 = 1
            r5 = r15
            r16 = r7
            r7 = r12
            r2 = 0
            r9 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.m11497a()
            o9.h r0 = r0.f20314c
            java.lang.String r0 = r0.f20325b
            java.lang.String r5 = p056da.C1354e.m3862f(r11)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Mapping file ID is: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "FirebaseCrashlytics"
            r10 = 3
            boolean r4 = android.util.Log.isLoggable(r4, r10)
            if (r4 == 0) goto Lbe
            java.lang.String r4 = "FirebaseCrashlytics"
            android.util.Log.d(r4, r3, r13)
        Lbe:
            na.a r9 = new na.a
            r9.<init>(r11)
            java.lang.String r7 = r11.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L467
            java.lang.String r8 = r15.m3878d()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L467
            android.content.pm.PackageManager r3 = r11.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L467
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r7, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L467
            int r4 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L467
            java.lang.String r22 = java.lang.Integer.toString(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L467
            java.lang.String r3 = r3.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L467
            if (r3 != 0) goto Ldf
            java.lang.String r3 = "0.0"
        Ldf:
            r21 = r3
            da.a r6 = new da.a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L467
            r3 = r6
            r4 = r0
            r37 = r6
            r6 = r8
            r2 = r8
            r8 = r22
            r16 = r9
            r9 = r21
            r10 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L467
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Installer package name is: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "FirebaseCrashlytics"
            r4 = 2
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L113
            java.lang.String r3 = "FirebaseCrashlytics"
            android.util.Log.v(r3, r2, r13)
        L113:
            java.lang.String r2 = "com.google.firebase.crashlytics.startup"
            java.util.concurrent.ExecutorService r2 = p056da.C1359g0.m3874a(r2)
            y.e r3 = new y.e
            r5 = 22
            r3.<init>(r5)
            java.lang.String r5 = r15.m3878d()
            m2.q r8 = new m2.q
            r6 = 21
            r8.<init>(r6)
            h7.rb r9 = new h7.rb
            r9.<init>(r8)
            k7.h4 r10 = new k7.h4
            r10.<init>(r11, r4)
            java.util.Locale r6 = java.util.Locale.US
            r7 = 1
            java.lang.Object[] r13 = new java.lang.Object[r7]
            r7 = 0
            r13[r7] = r0
            java.lang.String r7 = "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings"
            java.lang.String r7 = java.lang.String.format(r6, r7, r13)
            androidx.fragment.app.l0 r13 = new androidx.fragment.app.l0
            r13.<init>(r7, r3)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r7 = android.os.Build.MANUFACTURER
            java.lang.String r7 = r15.m3879e(r7)
            r16 = 0
            r3[r16] = r7
            java.lang.String r7 = android.os.Build.MODEL
            java.lang.String r7 = r15.m3879e(r7)
            r16 = 1
            r3[r16] = r7
            java.lang.String r7 = "%s/%s"
            java.lang.String r3 = java.lang.String.format(r6, r7, r3)
            java.lang.String r6 = android.os.Build.VERSION.INCREMENTAL
            java.lang.String r17 = r15.m3879e(r6)
            java.lang.String r6 = android.os.Build.VERSION.RELEASE
            java.lang.String r18 = r15.m3879e(r6)
            r6 = 4
            java.lang.String[] r7 = new java.lang.String[r6]
            java.lang.String r19 = p056da.C1354e.m3862f(r11)
            r20 = 0
            r7[r20] = r19
            r7[r16] = r0
            r7[r4] = r21
            r4 = 3
            r7[r4] = r22
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1 = 0
        L188:
            if (r1 >= r6) goto L1ae
            r6 = r7[r1]
            r19 = r7
            if (r6 == 0) goto L1a4
            java.lang.String r7 = "-"
            r20 = r14
            java.lang.String r14 = ""
            java.lang.String r6 = r6.replace(r7, r14)
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r6 = r6.toLowerCase(r7)
            r4.add(r6)
            goto L1a6
        L1a4:
            r20 = r14
        L1a6:
            int r1 = r1 + 1
            r7 = r19
            r14 = r20
            r6 = 4
            goto L188
        L1ae:
            r20 = r14
            java.util.Collections.sort(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        L1bc:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L1cc
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            r1.append(r6)
            goto L1bc
        L1cc:
            java.lang.String r1 = r1.toString()
            int r4 = r1.length()
            if (r4 <= 0) goto L1db
            java.lang.String r1 = p056da.C1354e.m3869m(r1)
            goto L1dc
        L1db:
            r1 = 0
        L1dc:
            if (r5 == 0) goto L1e0
            r5 = 4
            goto L1e1
        L1e0:
            r5 = 1
        L1e1:
            int r23 = p365v.C6480g.m13151d(r5)
            la.e r7 = new la.e
            r4 = r20
            r14 = r7
            r5 = r15
            r15 = r0
            r16 = r3
            r19 = r5
            r20 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            ka.b r1 = new ka.b
            r5 = r1
            r6 = r11
            r11 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            android.content.Context r0 = r1.f16994a
            android.content.SharedPreferences r0 = p056da.C1354e.m3864h(r0)
            java.lang.String r3 = "existing_instance_identifier"
            java.lang.String r5 = ""
            java.lang.String r0 = r0.getString(r3, r5)
            la.e r3 = r1.f16995b
            java.lang.Object r3 = r3.f17403f
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = r0.equals(r3)
            r3 = 1
            r0 = r0 ^ r3
            if (r0 != 0) goto L237
            la.d r0 = r1.m9170a(r3)
            if (r0 == 0) goto L237
            java.util.concurrent.atomic.AtomicReference<la.c> r3 = r1.f17001h
            r3.set(r0)
            java.util.concurrent.atomic.AtomicReference<s7.j<la.a>> r3 = r1.f17002i
            java.lang.Object r3 = r3.get()
            s7.j r3 = (p327s7.C5986j) r3
            la.a r0 = r0.f17394a
            r3.m12459b(r0)
            r3 = 0
            s7.i r0 = p327s7.C5988l.m12464e(r3)
            goto L27c
        L237:
            r0 = 3
            la.d r3 = r1.m9170a(r0)
            if (r3 == 0) goto L250
            java.util.concurrent.atomic.AtomicReference<la.c> r0 = r1.f17001h
            r0.set(r3)
            java.util.concurrent.atomic.AtomicReference<s7.j<la.a>> r0 = r1.f17002i
            java.lang.Object r0 = r0.get()
            s7.j r0 = (p327s7.C5986j) r0
            la.a r3 = r3.f17394a
            r0.m12459b(r3)
        L250:
            da.d0 r0 = r1.f17000g
            s7.j<java.lang.Void> r3 = r0.f6890g
            s7.q<TResult> r3 = r3.f23075a
            java.lang.Object r5 = r0.f6886c
            monitor-enter(r5)
            s7.j<java.lang.Void> r0 = r0.f6887d     // Catch: java.lang.Throwable -> L464
            s7.q<TResult> r0 = r0.f23075a     // Catch: java.lang.Throwable -> L464
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L464
            java.util.concurrent.ExecutorService r5 = p056da.C1375o0.f6943a
            s7.j r5 = new s7.j
            r5.<init>()
            da.m0 r6 = new da.m0
            r7 = 0
            r6.<init>(r5, r7)
            r3.mo12447e(r2, r6)
            r0.mo12447e(r2, r6)
            s7.q<TResult> r0 = r5.f23075a
            ka.a r3 = new ka.a
            r3.<init>(r1)
            s7.i r0 = r0.mo12456n(r2, r3)
        L27c:
            z9.d r3 = new z9.d
            r3.<init>()
            r0.mo12447e(r2, r3)
            android.content.Context r0 = r4.f6981a
            java.lang.String r3 = "com.crashlytics.RequireBuildId"
            r5 = 1
            boolean r0 = p056da.C1354e.m3860d(r0, r3, r5)
            r3 = r37
            java.lang.String r5 = r3.f6863b
            java.lang.String r6 = "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account."
            java.lang.String r7 = "FirebaseCrashlytics"
            if (r0 != 0) goto L2a5
            r0 = 2
            boolean r0 = android.util.Log.isLoggable(r7, r0)
            if (r0 == 0) goto L2ab
            java.lang.String r0 = "Configured not to require a build ID."
            r5 = 0
            android.util.Log.v(r7, r0, r5)
            goto L2ab
        L2a5:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L2ad
        L2ab:
            r9 = 1
            goto L2fd
        L2ad:
            java.lang.String r0 = "."
            android.util.Log.e(r7, r0)
            java.lang.String r5 = ".     |  | "
            android.util.Log.e(r7, r5)
            java.lang.String r5 = ".     |  |"
            android.util.Log.e(r7, r5)
            android.util.Log.e(r7, r5)
            java.lang.String r8 = ".   \\ |  | /"
            android.util.Log.e(r7, r8)
            java.lang.String r8 = ".    \\    /"
            android.util.Log.e(r7, r8)
            java.lang.String r8 = ".     \\  /"
            android.util.Log.e(r7, r8)
            java.lang.String r8 = ".      \\/"
            android.util.Log.e(r7, r8)
            android.util.Log.e(r7, r0)
            android.util.Log.e(r7, r6)
            android.util.Log.e(r7, r0)
            java.lang.String r8 = ".      /\\"
            android.util.Log.e(r7, r8)
            java.lang.String r8 = ".     /  \\"
            android.util.Log.e(r7, r8)
            java.lang.String r8 = ".    /    \\"
            android.util.Log.e(r7, r8)
            java.lang.String r8 = ".   / |  | \\"
            android.util.Log.e(r7, r8)
            android.util.Log.e(r7, r5)
            android.util.Log.e(r7, r5)
            android.util.Log.e(r7, r5)
            android.util.Log.e(r7, r0)
            r9 = 0
        L2fd:
            if (r9 == 0) goto L45e
            k7.h4 r0 = new k7.h4     // Catch: java.lang.Exception -> L442
            android.content.Context r5 = r4.f6981a     // Catch: java.lang.Exception -> L442
            r6 = 1
            r0.<init>(r5, r6)     // Catch: java.lang.Exception -> L442
            androidx.appcompat.widget.x r5 = new androidx.appcompat.widget.x     // Catch: java.lang.Exception -> L442
            java.lang.String r6 = "crash_marker"
            r5.<init>(r6, r0)     // Catch: java.lang.Exception -> L442
            r4.f6985e = r5     // Catch: java.lang.Exception -> L442
            androidx.appcompat.widget.x r5 = new androidx.appcompat.widget.x     // Catch: java.lang.Exception -> L442
            java.lang.String r6 = "initialization_marker"
            r5.<init>(r6, r0)     // Catch: java.lang.Exception -> L442
            r4.f6984d = r5     // Catch: java.lang.Exception -> L442
            androidx.fragment.app.l0 r5 = new androidx.fragment.app.l0     // Catch: java.lang.Exception -> L442
            r6 = 18
            r5.<init>(r6)     // Catch: java.lang.Exception -> L442
            da.y$b r6 = new da.y$b     // Catch: java.lang.Exception -> L442
            r6.<init>(r0)     // Catch: java.lang.Exception -> L442
            ea.b r8 = new ea.b     // Catch: java.lang.Exception -> L442
            android.content.Context r9 = r4.f6981a     // Catch: java.lang.Exception -> L442
            r8.<init>(r9, r6)     // Catch: java.lang.Exception -> L442
            ma.a r9 = new ma.a     // Catch: java.lang.Exception -> L442
            r10 = 1024(0x400, float:1.435E-42)
            r11 = 1
            ma.c[] r12 = new ma.InterfaceC4509c[r11]     // Catch: java.lang.Exception -> L442
            ma.b r13 = new ma.b     // Catch: java.lang.Exception -> L442
            r14 = 10
            r13.<init>(r14, r11)     // Catch: java.lang.Exception -> L442
            r14 = 0
            r12[r14] = r13     // Catch: java.lang.Exception -> L442
            r9.<init>(r10, r12)     // Catch: java.lang.Exception -> L442
            android.content.Context r10 = r4.f6981a     // Catch: java.lang.Exception -> L442
            da.h0 r12 = r4.f6987g     // Catch: java.lang.Exception -> L442
            r23 = r10
            r24 = r12
            r25 = r0
            r26 = r3
            r27 = r8
            r28 = r5
            r29 = r9
            r30 = r1
            da.l0 r34 = p056da.C1369l0.m3886c(r23, r24, r25, r26, r27, r28, r29, r30)     // Catch: java.lang.Exception -> L442
            da.r r9 = new da.r     // Catch: java.lang.Exception -> L442
            android.content.Context r10 = r4.f6981a     // Catch: java.lang.Exception -> L442
            da.f r12 = r4.f6991k     // Catch: java.lang.Exception -> L442
            da.h0 r13 = r4.f6987g     // Catch: java.lang.Exception -> L442
            da.d0 r15 = r4.f6982b     // Catch: java.lang.Exception -> L442
            androidx.appcompat.widget.x r11 = r4.f6985e     // Catch: java.lang.Exception -> L442
            aa.a r14 = r4.f6992l     // Catch: java.lang.Exception -> L442
            r16 = r2
            ba.a r2 = r4.f6989i     // Catch: java.lang.Exception -> L440
            r23 = r9
            r24 = r10
            r25 = r12
            r26 = r13
            r27 = r15
            r28 = r0
            r29 = r11
            r30 = r3
            r31 = r5
            r32 = r8
            r33 = r6
            r35 = r14
            r36 = r2
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch: java.lang.Exception -> L440
            r4.f6986f = r9     // Catch: java.lang.Exception -> L440
            androidx.appcompat.widget.x r0 = r4.f6984d     // Catch: java.lang.Exception -> L440
            java.io.File r0 = r0.m822m()     // Catch: java.lang.Exception -> L440
            boolean r0 = r0.exists()     // Catch: java.lang.Exception -> L440
            da.f r2 = r4.f6991k     // Catch: java.lang.Exception -> L440
            da.z r3 = new da.z     // Catch: java.lang.Exception -> L440
            r3.<init>(r4)     // Catch: java.lang.Exception -> L440
            s7.i r2 = r2.m3872b(r3)     // Catch: java.lang.Exception -> L440
            java.lang.Object r2 = p056da.C1375o0.m3893a(r2)     // Catch: java.lang.Exception -> L3a9
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Exception -> L3a9
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L440
            r3.equals(r2)     // Catch: java.lang.Exception -> L440
        L3a9:
            da.r r2 = r4.f6986f     // Catch: java.lang.Exception -> L440
            java.lang.Thread$UncaughtExceptionHandler r3 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch: java.lang.Exception -> L440
            da.f r5 = r2.f6952d     // Catch: java.lang.Exception -> L440
            da.u r6 = new da.u     // Catch: java.lang.Exception -> L440
            r6.<init>(r2)     // Catch: java.lang.Exception -> L440
            r5.m3872b(r6)     // Catch: java.lang.Exception -> L440
            da.l r5 = new da.l     // Catch: java.lang.Exception -> L440
            r5.<init>(r2)     // Catch: java.lang.Exception -> L440
            da.c0 r6 = new da.c0     // Catch: java.lang.Exception -> L440
            aa.a r8 = r2.f6958j     // Catch: java.lang.Exception -> L440
            r6.<init>(r5, r1, r3, r8)     // Catch: java.lang.Exception -> L440
            r2.f6962n = r6     // Catch: java.lang.Exception -> L440
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r6)     // Catch: java.lang.Exception -> L440
            if (r0 == 0) goto L431
            android.content.Context r0 = r4.f6981a     // Catch: java.lang.Exception -> L440
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            int r2 = r0.checkCallingOrSelfPermission(r2)     // Catch: java.lang.Exception -> L440
            if (r2 != 0) goto L3d8
            r9 = 1
            goto L3d9
        L3d8:
            r9 = 0
        L3d9:
            if (r9 == 0) goto L3f2
            java.lang.String r2 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch: java.lang.Exception -> L440
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Exception -> L440
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L440
            if (r0 == 0) goto L3f0
            boolean r0 = r0.isConnectedOrConnecting()     // Catch: java.lang.Exception -> L440
            if (r0 == 0) goto L3f0
            goto L3f2
        L3f0:
            r9 = 0
            goto L3f3
        L3f2:
            r9 = 1
        L3f3:
            if (r9 == 0) goto L431
            java.lang.String r0 = "Crashlytics did not finish previous background initialization. Initializing synchronously."
            r2 = 3
            boolean r3 = android.util.Log.isLoggable(r7, r2)     // Catch: java.lang.Exception -> L440
            if (r3 == 0) goto L402
            r2 = 0
            android.util.Log.d(r7, r0, r2)     // Catch: java.lang.Exception -> L440
        L402:
            da.x r0 = new da.x     // Catch: java.lang.Exception -> L440
            r0.<init>(r4, r1)     // Catch: java.lang.Exception -> L440
            java.util.concurrent.ExecutorService r2 = r4.f6990j     // Catch: java.lang.Exception -> L440
            java.util.concurrent.Future r0 = r2.submit(r0)     // Catch: java.lang.Exception -> L440
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r7, r2)     // Catch: java.lang.Exception -> L440
            if (r2 == 0) goto L41a
            java.lang.String r2 = "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously."
            r3 = 0
            android.util.Log.d(r7, r2, r3)     // Catch: java.lang.Exception -> L440
        L41a:
            r2 = 4
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.util.concurrent.TimeoutException -> L422 java.util.concurrent.ExecutionException -> L426 java.lang.InterruptedException -> L42a java.lang.Exception -> L440
            r0.get(r2, r5)     // Catch: java.util.concurrent.TimeoutException -> L422 java.util.concurrent.ExecutionException -> L426 java.lang.InterruptedException -> L42a java.lang.Exception -> L440
            goto L44d
        L422:
            r0 = move-exception
            java.lang.String r2 = "Crashlytics timed out during initialization."
            goto L42d
        L426:
            r0 = move-exception
            java.lang.String r2 = "Crashlytics encountered a problem during initialization."
            goto L42d
        L42a:
            r0 = move-exception
            java.lang.String r2 = "Crashlytics was interrupted during initialization."
        L42d:
            android.util.Log.e(r7, r2, r0)     // Catch: java.lang.Exception -> L440
            goto L44d
        L431:
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r7, r0)
            if (r0 == 0) goto L43e
            java.lang.String r0 = "Successfully configured exception handler."
            r2 = 0
            android.util.Log.d(r7, r0, r2)
        L43e:
            r9 = 1
            goto L44e
        L440:
            r0 = move-exception
            goto L445
        L442:
            r0 = move-exception
            r16 = r2
        L445:
            java.lang.String r2 = "Crashlytics was not started due to an exception during initialization"
            android.util.Log.e(r7, r2, r0)
            r2 = 0
            r4.f6986f = r2
        L44d:
            r9 = 0
        L44e:
            z9.e r0 = new z9.e
            r0.<init>(r9, r4, r1)
            r1 = r16
            p327s7.C5988l.m12462c(r1, r0)
            z9.f r13 = new z9.f
            r13.<init>(r4)
            goto L471
        L45e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L464:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L464
            throw r0
        L467:
            r0 = move-exception
            r2 = r13
            java.lang.String r1 = "Error retrieving app package info."
            java.lang.String r3 = "FirebaseCrashlytics"
            android.util.Log.e(r3, r1, r0)
            r13 = r2
        L471:
            return r13
    }
}
