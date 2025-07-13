package p185k7;

/* renamed from: k7.o1 */
/* loaded from: classes.dex */
public final class C3918o1 {

    /* renamed from: g */
    public static volatile p185k7.C3918o1 f16790g;

    /* renamed from: a */
    public final java.util.concurrent.ExecutorService f16791a;

    /* renamed from: b */
    public final p234n7.C4693a f16792b;

    /* renamed from: c */
    public final java.util.List<android.util.Pair<p249o7.InterfaceC5090r4, p185k7.BinderC3866k1>> f16793c;

    /* renamed from: d */
    public int f16794d;

    /* renamed from: e */
    public boolean f16795e;

    /* renamed from: f */
    public volatile p185k7.InterfaceC3917o0 f16796f;

    public C3918o1(android.content.Context r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, android.os.Bundle r13) {
            r8 = this;
            r8.<init>()
            k7.h1 r7 = new k7.h1
            r7.<init>()
            java.util.concurrent.ThreadPoolExecutor r10 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            r1 = 1
            r2 = 1
            r3 = 60
            r0 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r0 = 1
            r10.allowCoreThreadTimeOut(r0)
            java.util.concurrent.ExecutorService r10 = java.util.concurrent.Executors.unconfigurableExecutorService(r10)
            r8.f16791a = r10
            n7.a r10 = new n7.a
            r10.<init>(r8)
            r8.f16792b = r10
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r8.f16793c = r10
            java.lang.String r10 = p249o7.C4962b4.m11110a(r9)     // Catch: java.lang.IllegalStateException -> L3b
            java.lang.String r1 = "google_app_id"
            p185k7.C3836i.m8635t(r9, r1, r10)     // Catch: java.lang.IllegalStateException -> L3b
            goto L3c
        L3b:
        L3c:
            java.lang.String r10 = "FA"
            if (r11 == 0) goto L48
            if (r12 == 0) goto L48
            java.lang.String r0 = "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy"
            android.util.Log.v(r10, r0)
            goto L5a
        L48:
            r1 = 0
            if (r11 != 0) goto L4d
            r2 = 1
            goto L4e
        L4d:
            r2 = 0
        L4e:
            if (r12 != 0) goto L51
            goto L52
        L51:
            r0 = 0
        L52:
            r0 = r0 ^ r2
            if (r0 == 0) goto L5a
            java.lang.String r0 = "Specified origin or custom app id is null. Both parameters will be ignored."
            android.util.Log.w(r10, r0)
        L5a:
            k7.b1 r0 = new k7.b1
            r1 = r0
            r2 = r8
            r3 = r11
            r4 = r12
            r5 = r9
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.concurrent.ExecutorService r11 = r8.f16791a
            r11.execute(r0)
            android.content.Context r9 = r9.getApplicationContext()
            android.app.Application r9 = (android.app.Application) r9
            if (r9 != 0) goto L78
            java.lang.String r9 = "Unable to register lifecycle notifications. Application null."
            android.util.Log.w(r10, r9)
            return
        L78:
            k7.n1 r10 = new k7.n1
            r10.<init>(r8)
            r9.registerActivityLifecycleCallbacks(r10)
            return
    }

    /* renamed from: c */
    public static p185k7.C3918o1 m8850c(android.content.Context r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, android.os.Bundle r10) {
            java.lang.String r7 = "null reference"
            java.util.Objects.requireNonNull(r6, r7)
            k7.o1 r7 = p185k7.C3918o1.f16790g
            if (r7 != 0) goto L22
            java.lang.Class<k7.o1> r7 = p185k7.C3918o1.class
            monitor-enter(r7)
            k7.o1 r8 = p185k7.C3918o1.f16790g     // Catch: java.lang.Throwable -> L1f
            if (r8 != 0) goto L1d
            k7.o1 r8 = new k7.o1     // Catch: java.lang.Throwable -> L1f
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r8
            r1 = r6
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L1f
            p185k7.C3918o1.f16790g = r8     // Catch: java.lang.Throwable -> L1f
        L1d:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L1f
            goto L22
        L1f:
            r6 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L1f
            throw r6
        L22:
            k7.o1 r6 = p185k7.C3918o1.f16790g
            return r6
    }

    /* renamed from: a */
    public final void m8851a(java.lang.Exception r3, boolean r4, boolean r5) {
            r2 = this;
            boolean r0 = r2.f16795e
            r0 = r0 | r4
            r2.f16795e = r0
            java.lang.String r0 = "FA"
            if (r4 == 0) goto Lf
            java.lang.String r4 = "Data collection startup failed. No data will be collected."
            android.util.Log.w(r0, r4, r3)
            return
        Lf:
            java.lang.String r4 = "Error with data collection. Data lost."
            if (r5 == 0) goto L1d
            k7.g1 r5 = new k7.g1
            r5.<init>(r2, r4, r3)
            java.util.concurrent.ExecutorService r1 = r2.f16791a
            r1.execute(r5)
        L1d:
            android.util.Log.w(r0, r4, r3)
            return
    }

    /* renamed from: b */
    public final int m8852b(java.lang.String r4) {
            r3 = this;
            k7.k0 r0 = new k7.k0
            r0.<init>()
            k7.g1 r1 = new k7.g1
            r1.<init>(r3, r4, r0)
            java.util.concurrent.ExecutorService r4 = r3.f16791a
            r4.execute(r1)
            r1 = 10000(0x2710, double:4.9407E-320)
            android.os.Bundle r4 = r0.m8751x(r1)
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            java.lang.Object r4 = p185k7.BinderC3865k0.m8748k2(r4, r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 != 0) goto L22
            r4 = 25
            return r4
        L22:
            int r4 = r4.intValue()
            return r4
    }

    /* renamed from: d */
    public final java.util.List<android.os.Bundle> m8853d(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            k7.k0 r0 = new k7.k0
            r0.<init>()
            k7.a1 r1 = new k7.a1
            r1.<init>(r2, r3, r4, r0)
            java.util.concurrent.ExecutorService r3 = r2.f16791a
            r3.execute(r1)
            r3 = 5000(0x1388, double:2.4703E-320)
            android.os.Bundle r3 = r0.m8751x(r3)
            java.lang.Class<java.util.List> r4 = java.util.List.class
            java.lang.Object r3 = p185k7.BinderC3865k0.m8748k2(r3, r4)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L23
            java.util.List r3 = java.util.Collections.emptyList()
        L23:
            return r3
    }

    /* renamed from: e */
    public final java.util.Map<java.lang.String, java.lang.Object> m8854e(java.lang.String r9, java.lang.String r10, boolean r11) {
            r8 = this;
            k7.k0 r6 = new k7.k0
            r6.<init>()
            k7.f1 r7 = new k7.f1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ExecutorService r9 = r8.f16791a
            r9.execute(r7)
            r9 = 5000(0x1388, double:2.4703E-320)
            android.os.Bundle r9 = r6.m8751x(r9)
            if (r9 == 0) goto L56
            int r10 = r9.size()
            if (r10 != 0) goto L24
            goto L56
        L24:
            java.util.HashMap r10 = new java.util.HashMap
            int r11 = r9.size()
            r10.<init>(r11)
            java.util.Set r11 = r9.keySet()
            java.util.Iterator r11 = r11.iterator()
        L35:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r0 = r11.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r9.get(r0)
            boolean r2 = r1 instanceof java.lang.Double
            if (r2 != 0) goto L51
            boolean r2 = r1 instanceof java.lang.Long
            if (r2 != 0) goto L51
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L35
        L51:
            r10.put(r0, r1)
            goto L35
        L55:
            return r10
        L56:
            java.util.Map r9 = java.util.Collections.emptyMap()
            return r9
    }

    /* renamed from: f */
    public final void m8855f(java.lang.String r10, java.lang.String r11, android.os.Bundle r12) {
            r9 = this;
            k7.i1 r8 = new k7.i1
            r2 = 0
            r6 = 1
            r7 = 1
            r0 = r8
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.util.concurrent.ExecutorService r10 = r9.f16791a
            r10.execute(r8)
            return
    }
}
