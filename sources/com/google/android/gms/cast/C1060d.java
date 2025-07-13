package com.google.android.gms.cast;

@android.annotation.SuppressLint({"UseSparseArrays"})
/* renamed from: com.google.android.gms.cast.d */
/* loaded from: classes.dex */
public final class C1060d extends p201l6.C4183c<com.google.android.gms.cast.C1057a.b> implements com.google.android.gms.cast.InterfaceC1061e {

    /* renamed from: F */
    public static final p123h6.C2489b f5412F = null;

    /* renamed from: G */
    public static final p201l6.C4181a<com.google.android.gms.cast.C1057a.b> f5413G = null;

    /* renamed from: A */
    public final java.util.Map<java.lang.Long, p327s7.C5986j<java.lang.Void>> f5414A;

    /* renamed from: B */
    public final java.util.Map<java.lang.String, com.google.android.gms.cast.C1057a.d> f5415B;

    /* renamed from: C */
    public final com.google.android.gms.cast.C1057a.c f5416C;

    /* renamed from: D */
    public final java.util.List<p036c6.C0873a1> f5417D;

    /* renamed from: E */
    public int f5418E;

    /* renamed from: j */
    public final com.google.android.gms.cast.BinderC1059c f5419j;

    /* renamed from: k */
    public android.os.Handler f5420k;

    /* renamed from: l */
    public boolean f5421l;

    /* renamed from: m */
    public boolean f5422m;

    /* renamed from: n */
    public p327s7.C5986j<com.google.android.gms.cast.C1057a.a> f5423n;

    /* renamed from: o */
    public p327s7.C5986j<com.google.android.gms.common.api.Status> f5424o;

    /* renamed from: p */
    public final java.util.concurrent.atomic.AtomicLong f5425p;

    /* renamed from: q */
    public final java.lang.Object f5426q;

    /* renamed from: r */
    public final java.lang.Object f5427r;

    /* renamed from: s */
    public p036c6.C0879d f5428s;

    /* renamed from: t */
    public java.lang.String f5429t;

    /* renamed from: u */
    public double f5430u;

    /* renamed from: v */
    public boolean f5431v;

    /* renamed from: w */
    public int f5432w;

    /* renamed from: x */
    public int f5433x;

    /* renamed from: y */
    public p036c6.C0921y f5434y;

    /* renamed from: z */
    public final com.google.android.gms.cast.CastDevice f5435z;

    static {
            h6.b r0 = new h6.b
            java.lang.String r1 = "CastClient"
            r0.<init>(r1)
            com.google.android.gms.cast.C1060d.f5412F = r0
            com.google.android.gms.cast.b r0 = new com.google.android.gms.cast.b
            r0.<init>()
            l6.a r1 = new l6.a
            l6.a$f<h6.e0> r2 = p123h6.C2502i.f11297b
            java.lang.String r3 = "Cast.API_CXLESS"
            r1.<init>(r3, r0, r2)
            com.google.android.gms.cast.C1060d.f5413G = r1
            return
    }

    public C1060d(android.content.Context r3, com.google.android.gms.cast.C1057a.b r4) {
            r2 = this;
            l6.a<com.google.android.gms.cast.a$b> r0 = com.google.android.gms.cast.C1060d.f5413G
            l6.c$a r1 = p201l6.C4183c.a.f17355c
            r2.<init>(r3, r0, r4, r1)
            com.google.android.gms.cast.c r3 = new com.google.android.gms.cast.c
            r3.<init>(r2)
            r2.f5419j = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r2.f5426q = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r2.f5427r = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = java.util.Collections.synchronizedList(r3)
            r2.f5417D = r3
            java.lang.String r3 = "CastOptions cannot be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r4, r3)
            com.google.android.gms.cast.a$c r3 = r4.f5405Z
            r2.f5416C = r3
            com.google.android.gms.cast.CastDevice r3 = r4.f5404Y
            r2.f5435z = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r2.f5414A = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r2.f5415B = r3
            java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
            r0 = 0
            r3.<init>(r0)
            r2.f5425p = r3
            r3 = 1
            r2.f5418E = r3
            r2.m2968n()
            return
    }

    /* renamed from: e */
    public static void m2958e(com.google.android.gms.cast.C1060d r2, long r3, int r5) {
            java.util.Map<java.lang.Long, s7.j<java.lang.Void>> r0 = r2.f5414A
            monitor-enter(r0)
            java.util.Map<java.lang.Long, s7.j<java.lang.Void>> r1 = r2.f5414A     // Catch: java.lang.Throwable -> L2a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L2a
            s7.j r4 = (p327s7.C5986j) r4     // Catch: java.lang.Throwable -> L2a
            java.util.Map<java.lang.Long, s7.j<java.lang.Void>> r2 = r2.f5414A     // Catch: java.lang.Throwable -> L2a
            r2.remove(r3)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L29
            if (r5 != 0) goto L20
            r2 = 0
            s7.q<TResult> r3 = r4.f23075a
            r3.m12473r(r2)
            return
        L20:
            l6.b r2 = m2960g(r5)
            s7.q<TResult> r3 = r4.f23075a
            r3.m12472q(r2)
        L29:
            return
        L2a:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r2
    }

    /* renamed from: f */
    public static void m2959f(com.google.android.gms.cast.C1060d r4, int r5) {
            java.lang.Object r0 = r4.f5427r
            monitor-enter(r0)
            s7.j<com.google.android.gms.common.api.Status> r1 = r4.f5424o     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L9:
            r2 = 0
            if (r5 != 0) goto L1a
            com.google.android.gms.common.api.Status r5 = new com.google.android.gms.common.api.Status     // Catch: java.lang.Throwable -> L18
            r3 = 0
            r5.<init>(r3, r2)     // Catch: java.lang.Throwable -> L18
            s7.q<TResult> r1 = r1.f23075a     // Catch: java.lang.Throwable -> L18
            r1.m12473r(r5)     // Catch: java.lang.Throwable -> L18
            goto L23
        L18:
            r4 = move-exception
            goto L27
        L1a:
            l6.b r5 = m2960g(r5)     // Catch: java.lang.Throwable -> L18
            s7.q<TResult> r1 = r1.f23075a     // Catch: java.lang.Throwable -> L18
            r1.m12472q(r5)     // Catch: java.lang.Throwable -> L18
        L23:
            r4.f5424o = r2     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r4
    }

    /* renamed from: g */
    public static p201l6.C4182b m2960g(int r2) {
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 0
            r0.<init>(r2, r1)
            l6.b r2 = p248o6.C4897b.m11034a(r0)
            return r2
    }

    /* renamed from: o */
    public static android.os.Handler m2961o(com.google.android.gms.cast.C1060d r2) {
            android.os.Handler r0 = r2.f5420k
            if (r0 != 0) goto Ld
            e7.k r0 = new e7.k
            android.os.Looper r1 = r2.f17351f
            r0.<init>(r1)
            r2.f5420k = r0
        Ld:
            android.os.Handler r2 = r2.f5420k
            return r2
    }

    /* renamed from: h */
    public final p327s7.AbstractC5985i<java.lang.Boolean> m2962h(p123h6.InterfaceC2499g r5) {
            r4 = this;
            android.os.Looper r0 = r4.f17351f
            java.lang.String r1 = "Listener must not be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r5, r1)
            java.lang.String r1 = "Looper must not be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r0, r1)
            com.google.android.gms.common.api.internal.c r1 = new com.google.android.gms.common.api.internal.c
            java.lang.String r2 = "castDeviceControllerListenerKey"
            r1.<init>(r0, r5, r2)
            com.google.android.gms.common.api.internal.c$a<L> r5 = r1.f5597b
            java.lang.String r0 = "Key must not be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r5, r0)
            r0 = 8415(0x20df, float:1.1792E-41)
            com.google.android.gms.common.api.internal.b r1 = r4.f17354i
            java.util.Objects.requireNonNull(r1)
            s7.j r2 = new s7.j
            r2.<init>()
            r1.m3056b(r2, r0, r4)
            com.google.android.gms.common.api.internal.s r0 = new com.google.android.gms.common.api.internal.s
            r0.<init>(r5, r2)
            android.os.Handler r5 = r1.f5573k0
            m6.p r3 = new m6.p
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f5569g0
            int r1 = r1.get()
            r3.<init>(r0, r1, r4)
            r0 = 13
            android.os.Message r0 = r5.obtainMessage(r0, r3)
            r5.sendMessage(r0)
            s7.q<TResult> r5 = r2.f23075a
            return r5
    }

    /* renamed from: i */
    public final void m2963i() {
            r2 = this;
            int r0 = r2.f5418E
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            java.lang.String r1 = "Not connected to device"
            com.google.android.gms.common.internal.C1101a.m3106k(r0, r1)
            return
    }

    /* renamed from: j */
    public final void m2964j() {
            r3 = this;
            h6.b r0 = com.google.android.gms.cast.C1060d.f5412F
            java.lang.String r1 = "removing all MessageReceivedCallbacks"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0.m6376a(r1, r2)
            java.util.Map<java.lang.String, com.google.android.gms.cast.a$d> r0 = r3.f5415B
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.google.android.gms.cast.a$d> r1 = r3.f5415B     // Catch: java.lang.Throwable -> L14
            r1.clear()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
    }

    /* renamed from: k */
    public final void m2965k(p327s7.C5986j<com.google.android.gms.cast.C1057a.a> r3) {
            r2 = this;
            java.lang.Object r0 = r2.f5426q
            monitor-enter(r0)
            s7.j<com.google.android.gms.cast.a$a> r1 = r2.f5423n     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto Lc
            r1 = 2477(0x9ad, float:3.471E-42)
            r2.m2966l(r1)     // Catch: java.lang.Throwable -> L10
        Lc:
            r2.f5423n = r3     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    /* renamed from: l */
    public final void m2966l(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.f5426q
            monitor-enter(r0)
            s7.j<com.google.android.gms.cast.a$a> r1 = r2.f5423n     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            l6.b r3 = m2960g(r3)     // Catch: java.lang.Throwable -> L11
            s7.q<TResult> r1 = r1.f23075a     // Catch: java.lang.Throwable -> L11
            r1.m12472q(r3)     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r3 = move-exception
            goto L18
        L13:
            r3 = 0
            r2.f5423n = r3     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    /* renamed from: m */
    public final p327s7.AbstractC5985i<java.lang.Void> m2967m() {
            r2 = this;
            m6.k$a r0 = p218m6.AbstractC4398k.m9834a()
            c6.c0 r1 = p036c6.C0878c0.f4744Y
            r0.f17961a = r1
            r1 = 8403(0x20d3, float:1.1775E-41)
            r0.f17964d = r1
            m6.k r0 = r0.m9835a()
            r1 = 1
            s7.i r0 = r2.m9328d(r1, r0)
            r2.m2964j()
            com.google.android.gms.cast.c r1 = r2.f5419j
            r2.m2962h(r1)
            return r0
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"device"})
    /* renamed from: n */
    public final double m2968n() {
            r6 = this;
            com.google.android.gms.cast.CastDevice r0 = r6.f5435z
            r1 = 2048(0x800, float:2.87E-42)
            boolean r0 = r0.m2928Y(r1)
            r1 = 4581421828931458171(0x3f947ae147ae147b, double:0.02)
            if (r0 == 0) goto L10
            return r1
        L10:
            com.google.android.gms.cast.CastDevice r0 = r6.f5435z
            r3 = 4
            boolean r0 = r0.m2928Y(r3)
            r3 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            if (r0 == 0) goto L35
            com.google.android.gms.cast.CastDevice r0 = r6.f5435z
            r5 = 1
            boolean r0 = r0.m2928Y(r5)
            if (r0 != 0) goto L35
            com.google.android.gms.cast.CastDevice r0 = r6.f5435z
            java.lang.String r0 = r0.f5354c0
            java.lang.String r5 = "Chromecast Audio"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L34
            return r3
        L34:
            return r1
        L35:
            return r3
    }
}
