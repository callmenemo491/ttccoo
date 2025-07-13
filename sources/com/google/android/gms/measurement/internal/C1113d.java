package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.d */
/* loaded from: classes.dex */
public final class C1113d implements p249o7.InterfaceC5058n4 {

    /* renamed from: H */
    public static volatile com.google.android.gms.measurement.internal.C1113d f5702H;

    /* renamed from: A */
    public volatile java.lang.Boolean f5703A;

    /* renamed from: B */
    public java.lang.Boolean f5704B;

    /* renamed from: C */
    public java.lang.Boolean f5705C;

    /* renamed from: D */
    public volatile boolean f5706D;

    /* renamed from: E */
    public int f5707E;

    /* renamed from: F */
    public final java.util.concurrent.atomic.AtomicInteger f5708F;

    /* renamed from: G */
    public final long f5709G;

    /* renamed from: a */
    public final android.content.Context f5710a;

    /* renamed from: b */
    public final java.lang.String f5711b;

    /* renamed from: c */
    public final java.lang.String f5712c;

    /* renamed from: d */
    public final java.lang.String f5713d;

    /* renamed from: e */
    public final boolean f5714e;

    /* renamed from: f */
    public final p367v1.C6488b f5715f;

    /* renamed from: g */
    public final p249o7.C4989f f5716g;

    /* renamed from: h */
    public final com.google.android.gms.measurement.internal.C1112c f5717h;

    /* renamed from: i */
    public final com.google.android.gms.measurement.internal.C1111b f5718i;

    /* renamed from: j */
    public final p249o7.C4994f4 f5719j;

    /* renamed from: k */
    public final p249o7.C4996f6 f5720k;

    /* renamed from: l */
    public final com.google.android.gms.measurement.internal.C1115f f5721l;

    /* renamed from: m */
    public final p249o7.C4969c3 f5722m;

    /* renamed from: n */
    public final p353u6.InterfaceC6340c f5723n;

    /* renamed from: o */
    public final p249o7.C5051m5 f5724o;

    /* renamed from: p */
    public final p249o7.C4979d5 f5725p;

    /* renamed from: q */
    public final p249o7.C5143y1 f5726q;

    /* renamed from: r */
    public final p249o7.C5011h5 f5727r;

    /* renamed from: s */
    public final java.lang.String f5728s;

    /* renamed from: t */
    public p249o7.C4961b3 f5729t;

    /* renamed from: u */
    public p249o7.C5123v5 f5730u;

    /* renamed from: v */
    public p249o7.C5037l f5731v;

    /* renamed from: w */
    public com.google.android.gms.measurement.internal.C1110a f5732w;

    /* renamed from: x */
    public boolean f5733x;

    /* renamed from: y */
    public java.lang.Boolean f5734y;

    /* renamed from: z */
    public long f5735z;

    public C1113d(p249o7.C5098s4 r10) {
            r9 = this;
            r9.<init>()
            r0 = 0
            r9.f5733x = r0
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>(r0)
            r9.f5708F = r1
            android.content.Context r1 = r10.f19990a
            v1.b r2 = new v1.b
            r3 = 26
            r2.<init>(r3)
            r9.f5715f = r2
            p185k7.C3836i.f16668a = r2
            r9.f5710a = r1
            java.lang.String r2 = r10.f19991b
            r9.f5711b = r2
            java.lang.String r2 = r10.f19992c
            r9.f5712c = r2
            java.lang.String r2 = r10.f19993d
            r9.f5713d = r2
            boolean r2 = r10.f19997h
            r9.f5714e = r2
            java.lang.Boolean r2 = r10.f19994e
            r9.f5703A = r2
            java.lang.String r2 = r10.f19999j
            r9.f5728s = r2
            r2 = 1
            r9.f5706D = r2
            k7.x0 r3 = r10.f19996g
            if (r3 == 0) goto L5d
            android.os.Bundle r4 = r3.f16942e0
            if (r4 == 0) goto L5d
            java.lang.String r5 = "measurementEnabled"
            java.lang.Object r4 = r4.get(r5)
            boolean r5 = r4 instanceof java.lang.Boolean
            if (r5 == 0) goto L4d
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r9.f5704B = r4
        L4d:
            android.os.Bundle r3 = r3.f16942e0
            java.lang.String r4 = "measurementDeactivated"
            java.lang.Object r3 = r3.get(r4)
            boolean r4 = r3 instanceof java.lang.Boolean
            if (r4 == 0) goto L5d
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r9.f5705C = r3
        L5d:
            java.lang.Object r3 = p185k7.AbstractC3921o4.f16797f
            monitor-enter(r3)
            k7.n4 r4 = p185k7.AbstractC3921o4.f16798g     // Catch: java.lang.Throwable -> L193
            android.content.Context r5 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L193
            if (r5 == 0) goto L69
            goto L6a
        L69:
            r5 = r1
        L6a:
            if (r4 == 0) goto L72
            android.content.Context r4 = r4.mo8840a()     // Catch: java.lang.Throwable -> L193
            if (r4 == r5) goto Lab
        L72:
            p185k7.C4050y3.m9151c()     // Catch: java.lang.Throwable -> L193
            p185k7.C3934p4.m8878b()     // Catch: java.lang.Throwable -> L193
            java.lang.Class<k7.d4> r4 = p185k7.C3771d4.class
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L193
            k7.d4 r6 = p185k7.C3771d4.f16554c     // Catch: java.lang.Throwable -> L190
            if (r6 == 0) goto L92
            android.content.Context r7 = r6.f16555a     // Catch: java.lang.Throwable -> L190
            if (r7 == 0) goto L92
            android.database.ContentObserver r6 = r6.f16556b     // Catch: java.lang.Throwable -> L190
            if (r6 == 0) goto L92
            android.content.ContentResolver r6 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L190
            k7.d4 r7 = p185k7.C3771d4.f16554c     // Catch: java.lang.Throwable -> L190
            android.database.ContentObserver r7 = r7.f16556b     // Catch: java.lang.Throwable -> L190
            r6.unregisterContentObserver(r7)     // Catch: java.lang.Throwable -> L190
        L92:
            r6 = 0
            p185k7.C3771d4.f16554c = r6     // Catch: java.lang.Throwable -> L190
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L193
            k7.h4 r4 = new k7.h4     // Catch: java.lang.Throwable -> L193
            r4.<init>(r5, r0)     // Catch: java.lang.Throwable -> L193
            k7.t4 r4 = p185k7.C4038x4.m9103p(r4)     // Catch: java.lang.Throwable -> L193
            k7.w3 r6 = new k7.w3     // Catch: java.lang.Throwable -> L193
            r6.<init>(r5, r4)     // Catch: java.lang.Throwable -> L193
            p185k7.AbstractC3921o4.f16798g = r6     // Catch: java.lang.Throwable -> L193
            java.util.concurrent.atomic.AtomicInteger r4 = p185k7.AbstractC3921o4.f16799h     // Catch: java.lang.Throwable -> L193
            r4.incrementAndGet()     // Catch: java.lang.Throwable -> L193
        Lab:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L193
            u6.d r3 = p353u6.C6341d.f24789a
            r9.f5723n = r3
            java.lang.Long r3 = r10.f19998i
            if (r3 == 0) goto Lb9
            long r3 = r3.longValue()
            goto Lbd
        Lb9:
            long r3 = java.lang.System.currentTimeMillis()
        Lbd:
            r9.f5709G = r3
            o7.f r3 = new o7.f
            r3.<init>(r9)
            r9.f5716g = r3
            com.google.android.gms.measurement.internal.c r3 = new com.google.android.gms.measurement.internal.c
            r3.<init>(r9)
            r3.m11316m()
            r9.f5717h = r3
            com.google.android.gms.measurement.internal.b r3 = new com.google.android.gms.measurement.internal.b
            r3.<init>(r9)
            r3.m11316m()
            r9.f5718i = r3
            com.google.android.gms.measurement.internal.f r3 = new com.google.android.gms.measurement.internal.f
            r3.<init>(r9)
            r3.m11316m()
            r9.f5721l = r3
            com.google.android.gms.measurement.internal.e r3 = new com.google.android.gms.measurement.internal.e
            r4 = 2
            r3.<init>(r9, r4)
            o7.c3 r4 = new o7.c3
            r4.<init>(r3)
            r9.f5722m = r4
            o7.y1 r3 = new o7.y1
            r3.<init>(r9)
            r9.f5726q = r3
            o7.m5 r3 = new o7.m5
            r3.<init>(r9)
            r3.m11420k()
            r9.f5724o = r3
            o7.d5 r3 = new o7.d5
            r3.<init>(r9)
            r3.m11420k()
            r9.f5725p = r3
            o7.f6 r3 = new o7.f6
            r3.<init>(r9)
            r3.m11420k()
            r9.f5720k = r3
            o7.h5 r3 = new o7.h5
            r3.<init>(r9)
            r3.m11316m()
            r9.f5727r = r3
            o7.f4 r3 = new o7.f4
            r3.<init>(r9)
            r3.m11316m()
            r9.f5719j = r3
            k7.x0 r4 = r10.f19996g
            if (r4 == 0) goto L137
            long r4 = r4.f16937Z
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L137
            goto L138
        L137:
            r0 = 1
        L138:
            android.content.Context r1 = r1.getApplicationContext()
            boolean r1 = r1 instanceof android.app.Application
            if (r1 == 0) goto L17c
            o7.d5 r1 = r9.m3176v()
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a
            android.content.Context r2 = r2.f5710a
            android.content.Context r2 = r2.getApplicationContext()
            boolean r2 = r2 instanceof android.app.Application
            if (r2 == 0) goto L187
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a
            android.content.Context r2 = r2.f5710a
            android.content.Context r2 = r2.getApplicationContext()
            android.app.Application r2 = (android.app.Application) r2
            o7.c5 r4 = r1.f19632c
            if (r4 != 0) goto L165
            o7.c5 r4 = new o7.c5
            r4.<init>(r1)
            r1.f19632c = r4
        L165:
            if (r0 == 0) goto L187
            o7.c5 r0 = r1.f19632c
            r2.unregisterActivityLifecycleCallbacks(r0)
            o7.c5 r0 = r1.f19632c
            r2.registerActivityLifecycleCallbacks(r0)
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5680n
            java.lang.String r1 = "Registered activity lifecycle callback"
            goto L184
        L17c:
            com.google.android.gms.measurement.internal.b r0 = r9.mo3162d()
            o7.f3 r0 = r0.f5675i
            java.lang.String r1 = "Application context is not an Application"
        L184:
            r0.m11169c(r1)
        L187:
            h6.a0 r0 = new h6.a0
            r0.<init>(r9, r10)
            r3.m11176s(r0)
            return
        L190:
            r10 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L193
            throw r10     // Catch: java.lang.Throwable -> L193
        L193:
            r10 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L193
            throw r10
    }

    /* renamed from: j */
    public static final void m3154j() {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unexpected call on client side"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: k */
    public static final void m3155k(p249o7.AbstractC5097s3 r3) {
            if (r3 == 0) goto L26
            boolean r0 = r3.f19989b
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r1 = r3.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 27
            r2.<init>(r1)
            java.lang.String r1 = "Component not initialized: "
            java.lang.String r3 = p346u.C6269n.m12888a(r2, r1, r3)
            r0.<init>(r3)
            throw r0
        L26:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Component not created"
            r3.<init>(r0)
            throw r3
    }

    /* renamed from: l */
    public static final void m3156l(p249o7.AbstractC5050m4 r3) {
            if (r3 == 0) goto L28
            boolean r0 = r3.m11318o()
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r1 = r3.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 27
            r2.<init>(r1)
            java.lang.String r1 = "Component not initialized: "
            java.lang.String r3 = p346u.C6269n.m12888a(r2, r1, r3)
            r0.<init>(r3)
            throw r0
        L28:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Component not created"
            r3.<init>(r0)
            throw r3
    }

    /* renamed from: u */
    public static com.google.android.gms.measurement.internal.C1113d m3157u(android.content.Context r12, p185k7.C4034x0 r13, java.lang.Long r14) {
            if (r13 == 0) goto L1e
            java.lang.String r0 = r13.f16940c0
            if (r0 == 0) goto La
            java.lang.String r0 = r13.f16941d0
            if (r0 != 0) goto L1e
        La:
            k7.x0 r0 = new k7.x0
            long r2 = r13.f16936Y
            long r4 = r13.f16937Z
            boolean r6 = r13.f16938a0
            java.lang.String r7 = r13.f16939b0
            r8 = 0
            r9 = 0
            android.os.Bundle r10 = r13.f16942e0
            r11 = 0
            r1 = r0
            r1.<init>(r2, r4, r6, r7, r8, r9, r10, r11)
            r13 = r0
        L1e:
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r12, r0)
            android.content.Context r0 = r12.getApplicationContext()
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r0, r1)
            com.google.android.gms.measurement.internal.d r0 = com.google.android.gms.measurement.internal.C1113d.f5702H
            if (r0 != 0) goto L48
            java.lang.Class<com.google.android.gms.measurement.internal.d> r0 = com.google.android.gms.measurement.internal.C1113d.class
            monitor-enter(r0)
            com.google.android.gms.measurement.internal.d r1 = com.google.android.gms.measurement.internal.C1113d.f5702H     // Catch: java.lang.Throwable -> L45
            if (r1 != 0) goto L43
            o7.s4 r1 = new o7.s4     // Catch: java.lang.Throwable -> L45
            r1.<init>(r12, r13, r14)     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.measurement.internal.d r12 = new com.google.android.gms.measurement.internal.d     // Catch: java.lang.Throwable -> L45
            r12.<init>(r1)     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.measurement.internal.C1113d.f5702H = r12     // Catch: java.lang.Throwable -> L45
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            goto L6d
        L45:
            r12 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r12
        L48:
            if (r13 == 0) goto L6d
            android.os.Bundle r12 = r13.f16942e0
            if (r12 == 0) goto L6d
            java.lang.String r14 = "dataCollectionDefaultEnabled"
            boolean r12 = r12.containsKey(r14)
            if (r12 == 0) goto L6d
            com.google.android.gms.measurement.internal.d r12 = com.google.android.gms.measurement.internal.C1113d.f5702H
            java.lang.String r14 = "null reference"
            java.util.Objects.requireNonNull(r12, r14)
            com.google.android.gms.measurement.internal.d r12 = com.google.android.gms.measurement.internal.C1113d.f5702H
            android.os.Bundle r13 = r13.f16942e0
            java.lang.String r14 = "dataCollectionDefaultEnabled"
            boolean r13 = r13.getBoolean(r14)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r12.f5703A = r13
        L6d:
            com.google.android.gms.measurement.internal.d r12 = com.google.android.gms.measurement.internal.C1113d.f5702H
            java.lang.String r13 = "null reference"
            java.util.Objects.requireNonNull(r12, r13)
            com.google.android.gms.measurement.internal.d r12 = com.google.android.gms.measurement.internal.C1113d.f5702H
            return r12
    }

    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: A */
    public final com.google.android.gms.measurement.internal.C1115f m3158A() {
            r2 = this;
            com.google.android.gms.measurement.internal.f r0 = r2.f5721l
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Component not created"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: a */
    public final boolean m3159a() {
            r1 = this;
            java.lang.Boolean r0 = r1.f5703A
            if (r0 == 0) goto Le
            java.lang.Boolean r0 = r1.f5703A
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    @Override // p249o7.InterfaceC5058n4
    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: b */
    public final p249o7.C4994f4 mo3160b() {
            r1 = this;
            o7.f4 r0 = r1.f5719j
            m3156l(r0)
            o7.f4 r0 = r1.f5719j
            return r0
    }

    @Override // p249o7.InterfaceC5058n4
    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: c */
    public final android.content.Context mo3161c() {
            r1 = this;
            android.content.Context r0 = r1.f5710a
            return r0
    }

    @Override // p249o7.InterfaceC5058n4
    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: d */
    public final com.google.android.gms.measurement.internal.C1111b mo3162d() {
            r1 = this;
            com.google.android.gms.measurement.internal.b r0 = r1.f5718i
            m3156l(r0)
            com.google.android.gms.measurement.internal.b r0 = r1.f5718i
            return r0
    }

    @Override // p249o7.InterfaceC5058n4
    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: e */
    public final p353u6.InterfaceC6340c mo3163e() {
            r1 = this;
            u6.c r0 = r1.f5723n
            return r0
    }

    @Override // p249o7.InterfaceC5058n4
    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: f */
    public final p367v1.C6488b mo3164f() {
            r1 = this;
            v1.b r0 = r1.f5715f
            return r0
    }

    /* renamed from: g */
    public final boolean m3165g() {
            r1 = this;
            int r0 = r1.m3168m()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: h */
    public final boolean m3166h() {
            r1 = this;
            java.lang.String r0 = r1.f5711b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            return r0
    }

    /* renamed from: i */
    public final boolean m3167i() {
            r8 = this;
            boolean r0 = r8.f5733x
            if (r0 == 0) goto Ld7
            o7.f4 r0 = r8.mo3160b()
            r0.mo3183i()
            java.lang.Boolean r0 = r8.f5734y
            if (r0 == 0) goto L35
            long r1 = r8.f5735z
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L35
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Ld0
            u6.c r0 = r8.f5723n
            u6.d r0 = (p353u6.C6341d) r0
            java.util.Objects.requireNonNull(r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r8.f5735z
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)
            r2 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Ld0
        L35:
            u6.c r0 = r8.f5723n
            u6.d r0 = (p353u6.C6341d) r0
            java.util.Objects.requireNonNull(r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r8.f5735z = r0
            com.google.android.gms.measurement.internal.f r0 = r8.m3158A()
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r0 = r0.m3213R(r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L82
            com.google.android.gms.measurement.internal.f r0 = r8.m3158A()
            java.lang.String r3 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = r0.m3213R(r3)
            if (r0 == 0) goto L82
            android.content.Context r0 = r8.f5710a
            w6.b r0 = p388w6.C6816c.m13887a(r0)
            boolean r0 = r0.m13886c()
            if (r0 != 0) goto L80
            o7.f r0 = r8.f5716g
            boolean r0 = r0.m11166z()
            if (r0 != 0) goto L80
            android.content.Context r0 = r8.f5710a
            boolean r0 = com.google.android.gms.measurement.internal.C1115f.m3186X(r0)
            if (r0 == 0) goto L82
            android.content.Context r0 = r8.f5710a
            boolean r0 = com.google.android.gms.measurement.internal.C1115f.m3187Y(r0)
            if (r0 == 0) goto L82
        L80:
            r0 = 1
            goto L83
        L82:
            r0 = 0
        L83:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.f5734y = r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Ld0
            com.google.android.gms.measurement.internal.f r0 = r8.m3158A()
            com.google.android.gms.measurement.internal.a r3 = r8.m3172q()
            java.lang.String r3 = r3.m3133o()
            com.google.android.gms.measurement.internal.a r4 = r8.m3172q()
            r4.m11419j()
            java.lang.String r4 = r4.f5667l
            com.google.android.gms.measurement.internal.a r5 = r8.m3172q()
            r5.m11419j()
            java.lang.String r6 = r5.f5668m
            java.lang.String r7 = "null reference"
            java.util.Objects.requireNonNull(r6, r7)
            java.lang.String r5 = r5.f5668m
            boolean r0 = r0.m3206K(r3, r4, r5)
            if (r0 != 0) goto Lc9
            com.google.android.gms.measurement.internal.a r0 = r8.m3172q()
            r0.m11419j()
            java.lang.String r0 = r0.f5667l
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lca
        Lc9:
            r1 = 1
        Lca:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r8.f5734y = r0
        Ld0:
            java.lang.Boolean r0 = r8.f5734y
            boolean r0 = r0.booleanValue()
            return r0
        Ld7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: m */
    public final int m3168m() {
            r4 = this;
            o7.f4 r0 = r4.mo3160b()
            r0.mo3183i()
            o7.f r0 = r4.f5716g
            boolean r0 = r0.m11164x()
            if (r0 == 0) goto L11
            r0 = 1
            return r0
        L11:
            java.lang.Boolean r0 = r4.f5705C
            if (r0 == 0) goto L1e
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1c
            goto L1e
        L1c:
            r0 = 2
            return r0
        L1e:
            o7.f4 r0 = r4.mo3160b()
            r0.mo3183i()
            boolean r0 = r4.f5706D
            if (r0 != 0) goto L2c
            r0 = 8
            return r0
        L2c:
            com.google.android.gms.measurement.internal.c r0 = r4.m3175t()
            java.lang.Boolean r0 = r0.m3149r()
            r1 = 0
            if (r0 == 0) goto L40
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3e
            return r1
        L3e:
            r0 = 3
            return r0
        L40:
            o7.f r0 = r4.f5716g
            com.google.android.gms.measurement.internal.d r2 = r0.f5736a
            v1.b r2 = r2.f5715f
            java.lang.String r2 = "firebase_analytics_collection_enabled"
            java.lang.Boolean r0 = r0.m11160t(r2)
            if (r0 == 0) goto L57
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L55
            return r1
        L55:
            r0 = 4
            return r0
        L57:
            java.lang.Boolean r0 = r4.f5704B
            if (r0 == 0) goto L64
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L62
            return r1
        L62:
            r0 = 5
            return r0
        L64:
            o7.f r0 = r4.f5716g
            r2 = 0
            o7.u2<java.lang.Boolean> r3 = p249o7.C5120v2.f20075T
            boolean r0 = r0.m11162v(r2, r3)
            if (r0 == 0) goto L7e
            java.lang.Boolean r0 = r4.f5703A
            if (r0 == 0) goto L7e
            java.lang.Boolean r0 = r4.f5703A
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7c
            return r1
        L7c:
            r0 = 7
            return r0
        L7e:
            return r1
    }

    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: n */
    public final p249o7.C5143y1 m3169n() {
            r2 = this;
            o7.y1 r0 = r2.f5726q
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Component not created"
            r0.<init>(r1)
            throw r0
    }

    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: o */
    public final p249o7.C4989f m3170o() {
            r1 = this;
            o7.f r0 = r1.f5716g
            return r0
    }

    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: p */
    public final p249o7.C5037l m3171p() {
            r1 = this;
            o7.l r0 = r1.f5731v
            m3156l(r0)
            o7.l r0 = r1.f5731v
            return r0
    }

    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: q */
    public final com.google.android.gms.measurement.internal.C1110a m3172q() {
            r1 = this;
            com.google.android.gms.measurement.internal.a r0 = r1.f5732w
            m3155k(r0)
            com.google.android.gms.measurement.internal.a r0 = r1.f5732w
            return r0
    }

    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: r */
    public final p249o7.C4961b3 m3173r() {
            r1 = this;
            o7.b3 r0 = r1.f5729t
            m3155k(r0)
            o7.b3 r0 = r1.f5729t
            return r0
    }

    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: s */
    public final p249o7.C4969c3 m3174s() {
            r1 = this;
            o7.c3 r0 = r1.f5722m
            return r0
    }

    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: t */
    public final com.google.android.gms.measurement.internal.C1112c m3175t() {
            r2 = this;
            com.google.android.gms.measurement.internal.c r0 = r2.f5717h
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Component not created"
            r0.<init>(r1)
            throw r0
    }

    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: v */
    public final p249o7.C4979d5 m3176v() {
            r1 = this;
            o7.d5 r0 = r1.f5725p
            m3155k(r0)
            o7.d5 r0 = r1.f5725p
            return r0
    }

    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: w */
    public final p249o7.C5011h5 m3177w() {
            r1 = this;
            o7.h5 r0 = r1.f5727r
            m3156l(r0)
            o7.h5 r0 = r1.f5727r
            return r0
    }

    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: x */
    public final p249o7.C5051m5 m3178x() {
            r1 = this;
            o7.m5 r0 = r1.f5724o
            m3155k(r0)
            o7.m5 r0 = r1.f5724o
            return r0
    }

    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: y */
    public final p249o7.C5123v5 m3179y() {
            r1 = this;
            o7.v5 r0 = r1.f5730u
            m3155k(r0)
            o7.v5 r0 = r1.f5730u
            return r0
    }

    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: z */
    public final p249o7.C4996f6 m3180z() {
            r1 = this;
            o7.f6 r0 = r1.f5720k
            m3155k(r0)
            o7.f6 r0 = r1.f5720k
            return r0
    }
}
