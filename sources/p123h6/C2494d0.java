package p123h6;

/* renamed from: h6.d0 */
/* loaded from: classes.dex */
public final class C2494d0 extends p248o6.AbstractC4910h<p123h6.C2495e> {

    /* renamed from: S0 */
    public static final p123h6.C2489b f11262S0 = null;

    /* renamed from: T0 */
    public static final java.lang.Object f11263T0 = null;

    /* renamed from: U0 */
    public static final java.lang.Object f11264U0 = null;

    /* renamed from: A0 */
    public final com.google.android.gms.cast.CastDevice f11265A0;

    /* renamed from: B0 */
    public final com.google.android.gms.cast.C1057a.c f11266B0;

    /* renamed from: C0 */
    public final java.util.Map<java.lang.String, com.google.android.gms.cast.C1057a.d> f11267C0;

    /* renamed from: D0 */
    public final long f11268D0;

    /* renamed from: E0 */
    public final android.os.Bundle f11269E0;

    /* renamed from: F0 */
    public p123h6.BinderC2492c0 f11270F0;

    /* renamed from: G0 */
    public java.lang.String f11271G0;

    /* renamed from: H0 */
    public boolean f11272H0;

    /* renamed from: I0 */
    public boolean f11273I0;

    /* renamed from: J0 */
    public boolean f11274J0;

    /* renamed from: K0 */
    public double f11275K0;

    /* renamed from: L0 */
    public p036c6.C0921y f11276L0;

    /* renamed from: M0 */
    public int f11277M0;

    /* renamed from: N0 */
    public int f11278N0;

    /* renamed from: O0 */
    public java.lang.String f11279O0;

    /* renamed from: P0 */
    public java.lang.String f11280P0;

    /* renamed from: Q0 */
    public android.os.Bundle f11281Q0;

    /* renamed from: R0 */
    public final java.util.Map<java.lang.Long, p218m6.InterfaceC4390c<com.google.android.gms.common.api.Status>> f11282R0;

    /* renamed from: z0 */
    public p036c6.C0879d f11283z0;

    static {
            h6.b r0 = new h6.b
            java.lang.String r1 = "CastClientImpl"
            r0.<init>(r1)
            p123h6.C2494d0.f11262S0 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p123h6.C2494d0.f11263T0 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p123h6.C2494d0.f11264U0 = r0
            return
    }

    /* renamed from: K */
    public static void m6382K(p123h6.C2494d0 r1, long r2, int r4) {
            java.util.Map<java.lang.Long, m6.c<com.google.android.gms.common.api.Status>> r0 = r1.f11282R0
            monitor-enter(r0)
            java.util.Map<java.lang.Long, m6.c<com.google.android.gms.common.api.Status>> r1 = r1.f11282R0     // Catch: java.lang.Throwable -> L1c
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> L1c
            m6.c r1 = (p218m6.InterfaceC4390c) r1     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1b
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r3 = 0
            r2.<init>(r4, r3)
            r1.m9833a(r2)
        L1b:
            return
        L1c:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r1
    }

    /* renamed from: L */
    public static void m6383L(p123h6.C2494d0 r0, int r1) {
            java.lang.Object r0 = p123h6.C2494d0.f11264U0
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    @Override // p248o6.AbstractC4900c
    /* renamed from: A */
    public final java.lang.String mo2635A() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE"
            return r0
    }

    @Override // p248o6.AbstractC4900c
    /* renamed from: C */
    public final void mo6384C(p184k6.C3698b r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            java.lang.System.currentTimeMillis()
            r0.m6387N()
            return
    }

    @Override // p248o6.AbstractC4900c
    /* renamed from: D */
    public final void mo6385D(int r6, android.os.IBinder r7, android.os.Bundle r8, int r9) {
            r5 = this;
            h6.b r0 = p123h6.C2494d0.f11262S0
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "in onPostInitHandler; statusCode=%d"
            r0.m6376a(r3, r2)
            r0 = 2300(0x8fc, float:3.223E-42)
            if (r6 == 0) goto L17
            if (r6 != r0) goto L1b
        L17:
            r5.f11273I0 = r1
            r5.f11274J0 = r1
        L1b:
            if (r6 != r0) goto L2a
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r5.f11281Q0 = r6
            java.lang.String r0 = "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING"
            r6.putBoolean(r0, r1)
            r6 = 0
        L2a:
            super.mo6385D(r6, r7, r8, r9)
            return
    }

    /* renamed from: M */
    public final void m6386M() {
            r3 = this;
            r0 = -1
            r3.f11277M0 = r0
            r3.f11278N0 = r0
            r0 = 0
            r3.f11283z0 = r0
            r3.f11271G0 = r0
            r1 = 0
            r3.f11275K0 = r1
            r3.m6388O()
            r1 = 0
            r3.f11272H0 = r1
            r3.f11276L0 = r0
            return
    }

    /* renamed from: N */
    public final void m6387N() {
            r3 = this;
            h6.b r0 = p123h6.C2494d0.f11262S0
            java.lang.String r1 = "removing all MessageReceivedCallbacks"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0.m6376a(r1, r2)
            java.util.Map<java.lang.String, com.google.android.gms.cast.a$d> r0 = r3.f11267C0
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.google.android.gms.cast.a$d> r1 = r3.f11267C0     // Catch: java.lang.Throwable -> L14
            r1.clear()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
    }

    /* renamed from: O */
    public final double m6388O() {
            r6 = this;
            com.google.android.gms.cast.CastDevice r0 = r6.f11265A0
            java.lang.String r1 = "device should not be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r0, r1)
            com.google.android.gms.cast.CastDevice r0 = r6.f11265A0
            r1 = 2048(0x800, float:2.87E-42)
            boolean r0 = r0.m2928Y(r1)
            r1 = 4581421828931458171(0x3f947ae147ae147b, double:0.02)
            if (r0 == 0) goto L17
            return r1
        L17:
            com.google.android.gms.cast.CastDevice r0 = r6.f11265A0
            r3 = 4
            boolean r0 = r0.m2928Y(r3)
            r3 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            if (r0 == 0) goto L3c
            com.google.android.gms.cast.CastDevice r0 = r6.f11265A0
            r5 = 1
            boolean r0 = r0.m2928Y(r5)
            if (r0 != 0) goto L3c
            com.google.android.gms.cast.CastDevice r0 = r6.f11265A0
            java.lang.String r0 = r0.f5354c0
            java.lang.String r5 = "Chromecast Audio"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L3b
            return r3
        L3b:
            return r1
        L3c:
            return r3
    }

    @Override // p248o6.AbstractC4900c, p201l6.C4181a.e
    /* renamed from: h */
    public final int mo2636h() {
            r1 = this;
            r0 = 12800000(0xc35000, float:1.793662E-38)
            return r0
    }

    @Override // p248o6.AbstractC4900c, p201l6.C4181a.e
    /* renamed from: n */
    public final void mo6389n() {
            r5 = this;
            h6.b r0 = p123h6.C2494d0.f11262S0
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            h6.c0 r2 = r5.f11270F0
            r3 = 0
            r1[r3] = r2
            boolean r2 = r5.m11040a()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4 = 1
            r1[r4] = r2
            java.lang.String r2 = "disconnect(); ServiceListener=%s, isConnected=%b"
            r0.m6376a(r2, r1)
            h6.c0 r1 = r5.f11270F0
            r2 = 0
            r5.f11270F0 = r2
            if (r1 == 0) goto L59
            java.util.concurrent.atomic.AtomicReference<h6.d0> r1 = r1.f11260a
            java.lang.Object r1 = r1.getAndSet(r2)
            h6.d0 r1 = (p123h6.C2494d0) r1
            if (r1 != 0) goto L2c
            goto L30
        L2c:
            r1.m6386M()
            r2 = r1
        L30:
            if (r2 != 0) goto L33
            goto L59
        L33:
            r5.m6387N()
            android.os.IInterface r0 = r5.m11053y()     // Catch: java.lang.Throwable -> L43 java.lang.IllegalStateException -> L45 android.os.RemoteException -> L47
            h6.e r0 = (p123h6.C2495e) r0     // Catch: java.lang.Throwable -> L43 java.lang.IllegalStateException -> L45 android.os.RemoteException -> L47
            r0.m6392p2()     // Catch: java.lang.Throwable -> L43 java.lang.IllegalStateException -> L45 android.os.RemoteException -> L47
            super.mo6389n()
            return
        L43:
            r0 = move-exception
            goto L55
        L45:
            r0 = move-exception
            goto L48
        L47:
            r0 = move-exception
        L48:
            h6.b r1 = p123h6.C2494d0.f11262S0     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "Error while disconnecting the controller interface"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L43
            r1.m6377b(r0, r2, r3)     // Catch: java.lang.Throwable -> L43
            super.mo6389n()
            return
        L55:
            super.mo6389n()
            throw r0
        L59:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "already disposed, so short-circuiting"
            r0.m6376a(r2, r1)
            return
    }

    @Override // p248o6.AbstractC4900c
    /* renamed from: s */
    public final /* synthetic */ android.os.IInterface mo2637s(android.os.IBinder r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            goto L18
        L4:
            java.lang.String r0 = "com.google.android.gms.cast.internal.ICastDeviceController"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof p123h6.C2495e
            if (r1 == 0) goto L12
            r3 = r0
            h6.e r3 = (p123h6.C2495e) r3
            goto L18
        L12:
            h6.e r0 = new h6.e
            r0.<init>(r3)
            r3 = r0
        L18:
            return r3
    }

    @Override // p248o6.AbstractC4900c
    /* renamed from: v */
    public final android.os.Bundle mo6390v() {
            r2 = this;
            android.os.Bundle r0 = r2.f11281Q0
            r1 = 0
            if (r0 == 0) goto L8
            r2.f11281Q0 = r1
            return r0
        L8:
            return r1
    }

    @Override // p248o6.AbstractC4900c
    /* renamed from: w */
    public final android.os.Bundle mo6391w() {
            r5 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            h6.b r1 = p123h6.C2494d0.f11262S0
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r5.f11279O0
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = r5.f11280P0
            r4 = 1
            r2[r4] = r3
            java.lang.String r3 = "getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s"
            r1.m6376a(r3, r2)
            com.google.android.gms.cast.CastDevice r1 = r5.f11265A0
            java.util.Objects.requireNonNull(r1)
            java.lang.String r2 = "com.google.android.gms.cast.EXTRA_CAST_DEVICE"
            r0.putParcelable(r2, r1)
            long r1 = r5.f11268D0
            java.lang.String r3 = "com.google.android.gms.cast.EXTRA_CAST_FLAGS"
            r0.putLong(r3, r1)
            android.os.Bundle r1 = r5.f11269E0
            if (r1 == 0) goto L31
            r0.putAll(r1)
        L31:
            h6.c0 r1 = new h6.c0
            r1.<init>(r5)
            r5.f11270F0 = r1
            com.google.android.gms.common.internal.BinderWrapper r2 = new com.google.android.gms.common.internal.BinderWrapper
            r2.<init>(r1)
            java.lang.String r1 = "listener"
            r0.putParcelable(r1, r2)
            java.lang.String r1 = r5.f11279O0
            if (r1 == 0) goto L54
            java.lang.String r2 = "last_application_id"
            r0.putString(r2, r1)
            java.lang.String r1 = r5.f11280P0
            if (r1 == 0) goto L54
            java.lang.String r2 = "last_session_id"
            r0.putString(r2, r1)
        L54:
            return r0
    }

    @Override // p248o6.AbstractC4900c
    /* renamed from: z */
    public final java.lang.String mo2639z() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.cast.internal.ICastDeviceController"
            return r0
    }
}
