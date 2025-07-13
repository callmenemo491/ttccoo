package com.google.android.gms.measurement.internal;

@com.google.android.gms.common.util.DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends p185k7.AbstractBinderC3904n0 {

    /* renamed from: a */
    public com.google.android.gms.measurement.internal.C1113d f5656a;

    /* renamed from: b */
    public final java.util.Map<java.lang.Integer, p249o7.InterfaceC5090r4> f5657b;

    public AppMeasurementDynamiteService() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f5656a = r0
            s.a r0 = new s.a
            r0.<init>()
            r1.f5657b = r0
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void beginAdUnitExposure(java.lang.String r2, long r3) {
            r1 = this;
            r1.m3129x()
            com.google.android.gms.measurement.internal.d r0 = r1.f5656a
            o7.y1 r0 = r0.m3169n()
            r0.m11447j(r2, r3)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void clearConditionalUserProperty(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
            r1 = this;
            r1.m3129x()
            com.google.android.gms.measurement.internal.d r0 = r1.f5656a
            o7.d5 r0 = r0.m3176v()
            r0.m11129J(r2, r3, r4)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void clearMeasurementEnabled(long r3) {
            r2 = this;
            r2.m3129x()
            com.google.android.gms.measurement.internal.d r3 = r2.f5656a
            o7.d5 r3 = r3.m3176v()
            r3.m11419j()
            com.google.android.gms.measurement.internal.d r4 = r3.f5736a
            o7.f4 r4 = r4.mo3160b()
            h6.a0 r0 = new h6.a0
            r1 = 0
            r0.<init>(r3, r1)
            r4.m11176s(r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void endAdUnitExposure(java.lang.String r2, long r3) {
            r1 = this;
            r1.m3129x()
            com.google.android.gms.measurement.internal.d r0 = r1.f5656a
            o7.y1 r0 = r0.m3169n()
            r0.m11448k(r2, r3)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void generateEventId(p185k7.InterfaceC3956r0 r4) {
            r3 = this;
            r3.m3129x()
            com.google.android.gms.measurement.internal.d r0 = r3.f5656a
            com.google.android.gms.measurement.internal.f r0 = r0.m3158A()
            long r0 = r0.m3227o0()
            r3.m3129x()
            com.google.android.gms.measurement.internal.d r2 = r3.f5656a
            com.google.android.gms.measurement.internal.f r2 = r2.m3158A()
            r2.m3203H(r4, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void getAppInstanceId(p185k7.InterfaceC3956r0 r4) {
            r3 = this;
            r3.m3129x()
            com.google.android.gms.measurement.internal.d r0 = r3.f5656a
            o7.f4 r0 = r0.mo3160b()
            o7.u4 r1 = new o7.u4
            r2 = 0
            r1.<init>(r3, r4, r2)
            r0.m11176s(r1)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void getCachedAppInstanceId(p185k7.InterfaceC3956r0 r3) {
            r2 = this;
            r2.m3129x()
            com.google.android.gms.measurement.internal.d r0 = r2.f5656a
            o7.d5 r0 = r0.m3176v()
            java.lang.String r0 = r0.m11127G()
            r2.m3129x()
            com.google.android.gms.measurement.internal.d r1 = r2.f5656a
            com.google.android.gms.measurement.internal.f r1 = r1.m3158A()
            r1.m3204I(r3, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void getConditionalUserProperties(java.lang.String r3, java.lang.String r4, p185k7.InterfaceC3956r0 r5) {
            r2 = this;
            r2.m3129x()
            com.google.android.gms.measurement.internal.d r0 = r2.f5656a
            o7.f4 r0 = r0.mo3160b()
            e7.b r1 = new e7.b
            r1.<init>(r2, r5, r3, r4)
            r0.m11176s(r1)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void getCurrentScreenClass(p185k7.InterfaceC3956r0 r3) {
            r2 = this;
            r2.m3129x()
            com.google.android.gms.measurement.internal.d r0 = r2.f5656a
            o7.d5 r0 = r0.m3176v()
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.m5 r0 = r0.m3178x()
            o7.j5 r0 = r0.f19846c
            if (r0 == 0) goto L16
            java.lang.String r0 = r0.f19788b
            goto L17
        L16:
            r0 = 0
        L17:
            r2.m3129x()
            com.google.android.gms.measurement.internal.d r1 = r2.f5656a
            com.google.android.gms.measurement.internal.f r1 = r1.m3158A()
            r1.m3204I(r3, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void getCurrentScreenName(p185k7.InterfaceC3956r0 r3) {
            r2 = this;
            r2.m3129x()
            com.google.android.gms.measurement.internal.d r0 = r2.f5656a
            o7.d5 r0 = r0.m3176v()
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.m5 r0 = r0.m3178x()
            o7.j5 r0 = r0.f19846c
            if (r0 == 0) goto L16
            java.lang.String r0 = r0.f19787a
            goto L17
        L16:
            r0 = 0
        L17:
            r2.m3129x()
            com.google.android.gms.measurement.internal.d r1 = r2.f5656a
            com.google.android.gms.measurement.internal.f r1 = r1.m3158A()
            r1.m3204I(r3, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void getGmpAppId(p185k7.InterfaceC3956r0 r5) {
            r4 = this;
            r4.m3129x()
            com.google.android.gms.measurement.internal.d r0 = r4.f5656a
            o7.d5 r0 = r0.m3176v()
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            java.lang.String r2 = r1.f5711b
            if (r2 == 0) goto L10
            goto L2a
        L10:
            android.content.Context r2 = r1.f5710a     // Catch: java.lang.IllegalStateException -> L1b
            java.lang.String r1 = r1.f5728s     // Catch: java.lang.IllegalStateException -> L1b
            java.lang.String r3 = "google_app_id"
            java.lang.String r2 = p185k7.C3836i.m8635t(r2, r3, r1)     // Catch: java.lang.IllegalStateException -> L1b
            goto L2a
        L1b:
            r1 = move-exception
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5672f
            java.lang.String r2 = "getGoogleAppId failed with exception"
            r0.m11170d(r2, r1)
            r2 = 0
        L2a:
            r4.m3129x()
            com.google.android.gms.measurement.internal.d r0 = r4.f5656a
            com.google.android.gms.measurement.internal.f r0 = r0.m3158A()
            r0.m3204I(r5, r2)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void getMaxUserProperties(java.lang.String r2, p185k7.InterfaceC3956r0 r3) {
            r1 = this;
            r1.m3129x()
            com.google.android.gms.measurement.internal.d r0 = r1.f5656a
            o7.d5 r0 = r0.m3176v()
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            com.google.android.gms.measurement.internal.d r2 = r0.f5736a
            java.util.Objects.requireNonNull(r2)
            r1.m3129x()
            com.google.android.gms.measurement.internal.d r2 = r1.f5656a
            com.google.android.gms.measurement.internal.f r2 = r2.m3158A()
            r0 = 25
            r2.m3202G(r3, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void getTestFlag(p185k7.InterfaceC3956r0 r9, int r10) {
            r8 = this;
            r8.m3129x()
            r0 = 1
            if (r10 == 0) goto Lf0
            r1 = 2
            if (r10 == r0) goto Lbf
            r0 = 4
            if (r10 == r1) goto L75
            r1 = 3
            if (r10 == r1) goto L44
            if (r10 == r0) goto L12
            return
        L12:
            com.google.android.gms.measurement.internal.d r10 = r8.f5656a
            com.google.android.gms.measurement.internal.f r10 = r10.m3158A()
            com.google.android.gms.measurement.internal.d r0 = r8.f5656a
            o7.d5 r0 = r0.m3176v()
            java.util.Objects.requireNonNull(r0)
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            o7.f4 r1 = r1.mo3160b()
            o7.z4 r6 = new o7.z4
            r3 = 0
            r6.<init>(r0, r2, r3)
            r3 = 15000(0x3a98, double:7.411E-320)
            java.lang.String r5 = "boolean test flag value"
            java.lang.Object r0 = r1.m11173p(r2, r3, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r10.m3198C(r9, r0)
            return
        L44:
            com.google.android.gms.measurement.internal.d r10 = r8.f5656a
            com.google.android.gms.measurement.internal.f r10 = r10.m3158A()
            com.google.android.gms.measurement.internal.d r0 = r8.f5656a
            o7.d5 r0 = r0.m3176v()
            java.util.Objects.requireNonNull(r0)
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            com.google.android.gms.measurement.internal.d r2 = r0.f5736a
            o7.f4 r2 = r2.mo3160b()
            o7.z4 r7 = new o7.z4
            r7.<init>(r0, r3, r1)
            r4 = 15000(0x3a98, double:7.411E-320)
            java.lang.String r6 = "int test flag value"
            java.lang.Object r0 = r2.m11173p(r3, r4, r6, r7)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r10.m3202G(r9, r0)
            return
        L75:
            com.google.android.gms.measurement.internal.d r10 = r8.f5656a
            com.google.android.gms.measurement.internal.f r10 = r10.m3158A()
            com.google.android.gms.measurement.internal.d r1 = r8.f5656a
            o7.d5 r1 = r1.m3176v()
            java.util.Objects.requireNonNull(r1)
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a
            o7.f4 r2 = r2.mo3160b()
            o7.z4 r7 = new o7.z4
            r7.<init>(r1, r3, r0)
            r4 = 15000(0x3a98, double:7.411E-320)
            java.lang.String r6 = "double test flag value"
            java.lang.Object r0 = r2.m11173p(r3, r4, r6, r7)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "r"
            r2.putDouble(r3, r0)
            r9.mo8749D(r2)     // Catch: android.os.RemoteException -> Lb0
            return
        Lb0:
            r9 = move-exception
            com.google.android.gms.measurement.internal.d r10 = r10.f5736a
            com.google.android.gms.measurement.internal.b r10 = r10.mo3162d()
            o7.f3 r10 = r10.f5675i
            java.lang.String r0 = "Error returning double value to wrapper"
            r10.m11170d(r0, r9)
            return
        Lbf:
            com.google.android.gms.measurement.internal.d r10 = r8.f5656a
            com.google.android.gms.measurement.internal.f r10 = r10.m3158A()
            com.google.android.gms.measurement.internal.d r0 = r8.f5656a
            o7.d5 r0 = r0.m3176v()
            java.util.Objects.requireNonNull(r0)
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            com.google.android.gms.measurement.internal.d r2 = r0.f5736a
            o7.f4 r2 = r2.mo3160b()
            o7.z4 r7 = new o7.z4
            r7.<init>(r0, r3, r1)
            r4 = 15000(0x3a98, double:7.411E-320)
            java.lang.String r6 = "long test flag value"
            java.lang.Object r0 = r2.m11173p(r3, r4, r6, r7)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r10.m3203H(r9, r0)
            return
        Lf0:
            com.google.android.gms.measurement.internal.d r10 = r8.f5656a
            com.google.android.gms.measurement.internal.f r10 = r10.m3158A()
            com.google.android.gms.measurement.internal.d r1 = r8.f5656a
            o7.d5 r1 = r1.m3176v()
            java.util.Objects.requireNonNull(r1)
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a
            o7.f4 r2 = r2.mo3160b()
            o7.z4 r7 = new o7.z4
            r7.<init>(r1, r3, r0)
            r4 = 15000(0x3a98, double:7.411E-320)
            java.lang.String r6 = "String test flag value"
            java.lang.Object r0 = r2.m11173p(r3, r4, r6, r7)
            java.lang.String r0 = (java.lang.String) r0
            r10.m3204I(r9, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void getUserProperties(java.lang.String r9, java.lang.String r10, boolean r11, p185k7.InterfaceC3956r0 r12) {
            r8 = this;
            r8.m3129x()
            com.google.android.gms.measurement.internal.d r0 = r8.f5656a
            o7.f4 r0 = r0.mo3160b()
            j6.g r7 = new j6.g
            r1 = r7
            r2 = r8
            r3 = r12
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r0.m11176s(r7)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void initForTests(java.util.Map r1) {
            r0 = this;
            r0.m3129x()
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void initialize(p408x6.InterfaceC6957a r2, p185k7.C4034x0 r3, long r4) {
            r1 = this;
            com.google.android.gms.measurement.internal.d r0 = r1.f5656a
            if (r0 != 0) goto L1a
            java.lang.Object r2 = p408x6.BinderC6958b.m14124H(r2)
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.d r2 = com.google.android.gms.measurement.internal.C1113d.m3157u(r2, r3, r4)
            r1.f5656a = r2
            return
        L1a:
            com.google.android.gms.measurement.internal.b r2 = r0.mo3162d()
            o7.f3 r2 = r2.f5675i
            java.lang.String r3 = "Attempting to initialize multiple times"
            r2.m11169c(r3)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void isDataCollectionEnabled(p185k7.InterfaceC3956r0 r4) {
            r3 = this;
            r3.m3129x()
            com.google.android.gms.measurement.internal.d r0 = r3.f5656a
            o7.f4 r0 = r0.mo3160b()
            o7.u4 r1 = new o7.u4
            r2 = 1
            r1.<init>(r3, r4, r2)
            r0.m11176s(r1)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void logEvent(java.lang.String r11, java.lang.String r12, android.os.Bundle r13, boolean r14, boolean r15, long r16) {
            r10 = this;
            r10.m3129x()
            r0 = r10
            com.google.android.gms.measurement.internal.d r1 = r0.f5656a
            o7.d5 r2 = r1.m3176v()
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r2.m11132o(r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void logEventAndBundle(java.lang.String r8, java.lang.String r9, android.os.Bundle r10, p185k7.InterfaceC3956r0 r11, long r12) {
            r7 = this;
            r7.m3129x()
            com.google.android.gms.common.internal.C1101a.m3100e(r9)
            android.os.Bundle r0 = new android.os.Bundle
            if (r10 == 0) goto Le
            r0.<init>(r10)
            goto L11
        Le:
            r0.<init>()
        L11:
            java.lang.String r4 = "app"
            java.lang.String r1 = "_o"
            r0.putString(r1, r4)
            o7.q r0 = new o7.q
            o7.o r3 = new o7.o
            r3.<init>(r10)
            r1 = r0
            r2 = r9
            r5 = r12
            r1.<init>(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.d r9 = r7.f5656a
            o7.f4 r9 = r9.mo3160b()
            e7.b r10 = new e7.b
            r10.<init>(r7, r11, r0, r8)
            r9.m11176s(r10)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void logHealthData(int r10, java.lang.String r11, p408x6.InterfaceC6957a r12, p408x6.InterfaceC6957a r13, p408x6.InterfaceC6957a r14) {
            r9 = this;
            r9.m3129x()
            r0 = 0
            if (r12 != 0) goto L8
            r6 = r0
            goto Ld
        L8:
            java.lang.Object r12 = p408x6.BinderC6958b.m14124H(r12)
            r6 = r12
        Ld:
            if (r13 != 0) goto L11
            r7 = r0
            goto L16
        L11:
            java.lang.Object r12 = p408x6.BinderC6958b.m14124H(r13)
            r7 = r12
        L16:
            if (r14 != 0) goto L19
            goto L1d
        L19:
            java.lang.Object r0 = p408x6.BinderC6958b.m14124H(r14)
        L1d:
            r8 = r0
            com.google.android.gms.measurement.internal.d r12 = r9.f5656a
            com.google.android.gms.measurement.internal.b r1 = r12.mo3162d()
            r3 = 1
            r4 = 0
            r2 = r10
            r5 = r11
            r1.m3145y(r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void onActivityCreated(p408x6.InterfaceC6957a r1, android.os.Bundle r2, long r3) {
            r0 = this;
            r0.m3129x()
            com.google.android.gms.measurement.internal.d r3 = r0.f5656a
            o7.d5 r3 = r3.m3176v()
            o7.c5 r3 = r3.f19632c
            if (r3 == 0) goto L1f
            com.google.android.gms.measurement.internal.d r4 = r0.f5656a
            o7.d5 r4 = r4.m3176v()
            r4.m11130m()
            java.lang.Object r1 = p408x6.BinderC6958b.m14124H(r1)
            android.app.Activity r1 = (android.app.Activity) r1
            r3.onActivityCreated(r1, r2)
        L1f:
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void onActivityDestroyed(p408x6.InterfaceC6957a r1, long r2) {
            r0 = this;
            r0.m3129x()
            com.google.android.gms.measurement.internal.d r2 = r0.f5656a
            o7.d5 r2 = r2.m3176v()
            o7.c5 r2 = r2.f19632c
            if (r2 == 0) goto L1f
            com.google.android.gms.measurement.internal.d r3 = r0.f5656a
            o7.d5 r3 = r3.m3176v()
            r3.m11130m()
            java.lang.Object r1 = p408x6.BinderC6958b.m14124H(r1)
            android.app.Activity r1 = (android.app.Activity) r1
            r2.onActivityDestroyed(r1)
        L1f:
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void onActivityPaused(p408x6.InterfaceC6957a r1, long r2) {
            r0 = this;
            r0.m3129x()
            com.google.android.gms.measurement.internal.d r2 = r0.f5656a
            o7.d5 r2 = r2.m3176v()
            o7.c5 r2 = r2.f19632c
            if (r2 == 0) goto L1f
            com.google.android.gms.measurement.internal.d r3 = r0.f5656a
            o7.d5 r3 = r3.m3176v()
            r3.m11130m()
            java.lang.Object r1 = p408x6.BinderC6958b.m14124H(r1)
            android.app.Activity r1 = (android.app.Activity) r1
            r2.onActivityPaused(r1)
        L1f:
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void onActivityResumed(p408x6.InterfaceC6957a r1, long r2) {
            r0 = this;
            r0.m3129x()
            com.google.android.gms.measurement.internal.d r2 = r0.f5656a
            o7.d5 r2 = r2.m3176v()
            o7.c5 r2 = r2.f19632c
            if (r2 == 0) goto L1f
            com.google.android.gms.measurement.internal.d r3 = r0.f5656a
            o7.d5 r3 = r3.m3176v()
            r3.m11130m()
            java.lang.Object r1 = p408x6.BinderC6958b.m14124H(r1)
            android.app.Activity r1 = (android.app.Activity) r1
            r2.onActivityResumed(r1)
        L1f:
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void onActivitySaveInstanceState(p408x6.InterfaceC6957a r2, p185k7.InterfaceC3956r0 r3, long r4) {
            r1 = this;
            r1.m3129x()
            com.google.android.gms.measurement.internal.d r4 = r1.f5656a
            o7.d5 r4 = r4.m3176v()
            o7.c5 r4 = r4.f19632c
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            if (r4 == 0) goto L24
            com.google.android.gms.measurement.internal.d r0 = r1.f5656a
            o7.d5 r0 = r0.m3176v()
            r0.m11130m()
            java.lang.Object r2 = p408x6.BinderC6958b.m14124H(r2)
            android.app.Activity r2 = (android.app.Activity) r2
            r4.onActivitySaveInstanceState(r2, r5)
        L24:
            r3.mo8749D(r5)     // Catch: android.os.RemoteException -> L28
            return
        L28:
            r2 = move-exception
            com.google.android.gms.measurement.internal.d r3 = r1.f5656a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5675i
            java.lang.String r4 = "Error returning bundle value to wrapper"
            r3.m11170d(r4, r2)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void onActivityStarted(p408x6.InterfaceC6957a r1, long r2) {
            r0 = this;
            r0.m3129x()
            com.google.android.gms.measurement.internal.d r2 = r0.f5656a
            o7.d5 r2 = r2.m3176v()
            o7.c5 r2 = r2.f19632c
            if (r2 == 0) goto L1c
            com.google.android.gms.measurement.internal.d r2 = r0.f5656a
            o7.d5 r2 = r2.m3176v()
            r2.m11130m()
            java.lang.Object r1 = p408x6.BinderC6958b.m14124H(r1)
            android.app.Activity r1 = (android.app.Activity) r1
        L1c:
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void onActivityStopped(p408x6.InterfaceC6957a r1, long r2) {
            r0 = this;
            r0.m3129x()
            com.google.android.gms.measurement.internal.d r2 = r0.f5656a
            o7.d5 r2 = r2.m3176v()
            o7.c5 r2 = r2.f19632c
            if (r2 == 0) goto L1c
            com.google.android.gms.measurement.internal.d r2 = r0.f5656a
            o7.d5 r2 = r2.m3176v()
            r2.m11130m()
            java.lang.Object r1 = p408x6.BinderC6958b.m14124H(r1)
            android.app.Activity r1 = (android.app.Activity) r1
        L1c:
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void performAction(android.os.Bundle r1, p185k7.InterfaceC3956r0 r2, long r3) {
            r0 = this;
            r0.m3129x()
            r1 = 0
            r2.mo8749D(r1)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    /* renamed from: registerOnMeasurementEventListener */
    public void mo3127x37dae114(p185k7.InterfaceC3995u0 r4) {
            r3 = this;
            r3.m3129x()
            java.util.Map<java.lang.Integer, o7.r4> r0 = r3.f5657b
            monitor-enter(r0)
            java.util.Map<java.lang.Integer, o7.r4> r1 = r3.f5657b     // Catch: java.lang.Throwable -> L4a
            int r2 = r4.mo8753f()     // Catch: java.lang.Throwable -> L4a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L4a
            o7.r4 r1 = (p249o7.InterfaceC5090r4) r1     // Catch: java.lang.Throwable -> L4a
            if (r1 != 0) goto L2a
            o7.t6 r1 = new o7.t6     // Catch: java.lang.Throwable -> L4a
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L4a
            java.util.Map<java.lang.Integer, o7.r4> r2 = r3.f5657b     // Catch: java.lang.Throwable -> L4a
            int r4 = r4.mo8753f()     // Catch: java.lang.Throwable -> L4a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L4a
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> L4a
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            com.google.android.gms.measurement.internal.d r4 = r3.f5656a
            o7.d5 r4 = r4.m3176v()
            r4.m11419j()
            java.util.Set<o7.r4> r0 = r4.f19634e
            boolean r0 = r0.add(r1)
            if (r0 != 0) goto L49
            com.google.android.gms.measurement.internal.d r4 = r4.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5675i
            java.lang.String r0 = "OnEventListener already registered"
            r4.m11169c(r0)
        L49:
            return
        L4a:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r4
    }

    @Override // p185k7.InterfaceC3917o0
    public void resetAnalyticsData(long r5) {
            r4 = this;
            r4.m3129x()
            com.google.android.gms.measurement.internal.d r0 = r4.f5656a
            o7.d5 r0 = r0.m3176v()
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r1 = r0.f19636g
            r2 = 0
            r1.set(r2)
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            o7.f4 r1 = r1.mo3160b()
            o7.x4 r2 = new o7.x4
            r3 = 1
            r2.<init>(r0, r5, r3)
            r1.m11176s(r2)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void setConditionalUserProperty(android.os.Bundle r2, long r3) {
            r1 = this;
            r1.m3129x()
            if (r2 != 0) goto L13
            com.google.android.gms.measurement.internal.d r2 = r1.f5656a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5672f
            java.lang.String r3 = "Conditional user property must not be null"
            r2.m11169c(r3)
            return
        L13:
            com.google.android.gms.measurement.internal.d r0 = r1.f5656a
            o7.d5 r0 = r0.m3176v()
            r0.m11139v(r2, r3)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void setConsent(android.os.Bundle r5, long r6) {
            r4 = this;
            r4.m3129x()
            com.google.android.gms.measurement.internal.d r0 = r4.f5656a
            o7.d5 r0 = r0.m3176v()
            java.util.Objects.requireNonNull(r0)
            p185k7.C3991t9.m9017c()
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            o7.f r1 = r1.f5716g
            r2 = 0
            o7.u2<java.lang.Boolean> r3 = p249o7.C5120v2.f20117r0
            boolean r1 = r1.m11162v(r2, r3)
            if (r1 == 0) goto L2b
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            o7.f4 r1 = r1.mo3160b()
            o7.w4 r2 = new o7.w4
            r2.<init>(r0, r5, r6)
            r1.m11177t(r2)
            goto L2e
        L2b:
            r0.m11124D(r5, r6)
        L2e:
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void setConsentThirdParty(android.os.Bundle r3, long r4) {
            r2 = this;
            r2.m3129x()
            com.google.android.gms.measurement.internal.d r0 = r2.f5656a
            o7.d5 r0 = r0.m3176v()
            r1 = -20
            r0.m11140w(r3, r1, r4)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void setCurrentScreen(p408x6.InterfaceC6957a r3, java.lang.String r4, java.lang.String r5, long r6) {
            r2 = this;
            r2.m3129x()
            com.google.android.gms.measurement.internal.d r6 = r2.f5656a
            o7.m5 r6 = r6.m3178x()
            java.lang.Object r3 = p408x6.BinderC6958b.m14124H(r3)
            android.app.Activity r3 = (android.app.Activity) r3
            com.google.android.gms.measurement.internal.d r7 = r6.f5736a
            o7.f r7 = r7.f5716g
            boolean r7 = r7.m11163w()
            if (r7 != 0) goto L28
            com.google.android.gms.measurement.internal.d r3 = r6.f5736a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5677k
            java.lang.String r4 = "setCurrentScreen cannot be called while screen reporting is disabled."
        L23:
            r3.m11169c(r4)
            goto Lf0
        L28:
            o7.j5 r7 = r6.f19846c
            if (r7 != 0) goto L37
            com.google.android.gms.measurement.internal.d r3 = r6.f5736a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5677k
            java.lang.String r4 = "setCurrentScreen cannot be called while no activity active"
            goto L23
        L37:
            java.util.Map<android.app.Activity, o7.j5> r0 = r6.f19849f
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L4a
            com.google.android.gms.measurement.internal.d r3 = r6.f5736a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5677k
            java.lang.String r4 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            goto L23
        L4a:
            if (r5 != 0) goto L56
            java.lang.Class r5 = r3.getClass()
            java.lang.String r0 = "Activity"
            java.lang.String r5 = r6.m11323q(r5, r0)
        L56:
            java.lang.String r0 = r7.f19788b
            boolean r0 = com.google.android.gms.measurement.internal.C1115f.m3188Z(r0, r5)
            java.lang.String r7 = r7.f19787a
            boolean r7 = com.google.android.gms.measurement.internal.C1115f.m3188Z(r7, r4)
            if (r0 == 0) goto L72
            if (r7 != 0) goto L67
            goto L72
        L67:
            com.google.android.gms.measurement.internal.d r3 = r6.f5736a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5677k
            java.lang.String r4 = "setCurrentScreen cannot be called with the same class and name"
            goto L23
        L72:
            r7 = 100
            if (r4 == 0) goto L9e
            int r0 = r4.length()
            if (r0 <= 0) goto L88
            int r0 = r4.length()
            com.google.android.gms.measurement.internal.d r1 = r6.f5736a
            java.util.Objects.requireNonNull(r1)
            if (r0 > r7) goto L88
            goto L9e
        L88:
            com.google.android.gms.measurement.internal.d r3 = r6.f5736a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5677k
            int r4 = r4.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid screen name length in setCurrentScreen. Length"
        L9a:
            r3.m11170d(r5, r4)
            goto Lf0
        L9e:
            if (r5 == 0) goto Lc5
            int r0 = r5.length()
            if (r0 <= 0) goto Lb2
            int r0 = r5.length()
            com.google.android.gms.measurement.internal.d r1 = r6.f5736a
            java.util.Objects.requireNonNull(r1)
            if (r0 > r7) goto Lb2
            goto Lc5
        Lb2:
            com.google.android.gms.measurement.internal.d r3 = r6.f5736a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5677k
            int r4 = r5.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid class name length in setCurrentScreen. Length"
            goto L9a
        Lc5:
            com.google.android.gms.measurement.internal.d r7 = r6.f5736a
            com.google.android.gms.measurement.internal.b r7 = r7.mo3162d()
            o7.f3 r7 = r7.f5680n
            if (r4 != 0) goto Ld2
            java.lang.String r0 = "null"
            goto Ld3
        Ld2:
            r0 = r4
        Ld3:
            java.lang.String r1 = "Setting current screen to name, class"
            r7.m11171e(r1, r0, r5)
            o7.j5 r7 = new o7.j5
            com.google.android.gms.measurement.internal.d r0 = r6.f5736a
            com.google.android.gms.measurement.internal.f r0 = r0.m3158A()
            long r0 = r0.m3227o0()
            r7.<init>(r4, r5, r0)
            java.util.Map<android.app.Activity, o7.j5> r4 = r6.f19849f
            r4.put(r3, r7)
            r4 = 1
            r6.m11319m(r3, r7, r4)
        Lf0:
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void setDataCollectionEnabled(boolean r4) {
            r3 = this;
            r3.m3129x()
            com.google.android.gms.measurement.internal.d r0 = r3.f5656a
            o7.d5 r0 = r0.m3176v()
            r0.m11419j()
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            o7.f4 r1 = r1.mo3160b()
            o7.l3 r2 = new o7.l3
            r2.<init>(r0, r4)
            r1.m11176s(r2)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void setDefaultEventParameters(android.os.Bundle r5) {
            r4 = this;
            r4.m3129x()
            com.google.android.gms.measurement.internal.d r0 = r4.f5656a
            o7.d5 r0 = r0.m3176v()
            if (r5 != 0) goto Ld
            r5 = 0
            goto L13
        Ld:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>(r5)
            r5 = r1
        L13:
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            o7.f4 r1 = r1.mo3160b()
            o7.v4 r2 = new o7.v4
            r3 = 0
            r2.<init>(r0, r5, r3)
            r1.m11176s(r2)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void setEventInterceptor(p185k7.InterfaceC3995u0 r3) {
            r2 = this;
            r2.m3129x()
            androidx.appcompat.widget.x r0 = new androidx.appcompat.widget.x
            r0.<init>(r2, r3)
            com.google.android.gms.measurement.internal.d r3 = r2.f5656a
            o7.f4 r3 = r3.mo3160b()
            boolean r3 = r3.m11178u()
            if (r3 == 0) goto L1e
            com.google.android.gms.measurement.internal.d r3 = r2.f5656a
            o7.d5 r3 = r3.m3176v()
            r3.m11142y(r0)
            return
        L1e:
            com.google.android.gms.measurement.internal.d r3 = r2.f5656a
            o7.f4 r3 = r3.mo3160b()
            h6.a0 r1 = new h6.a0
            r1.<init>(r2, r0)
            r3.m11176s(r1)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void setInstanceIdProvider(p185k7.InterfaceC4021w0 r1) {
            r0 = this;
            r0.m3129x()
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void setMeasurementEnabled(boolean r2, long r3) {
            r1 = this;
            r1.m3129x()
            com.google.android.gms.measurement.internal.d r3 = r1.f5656a
            o7.d5 r3 = r3.m3176v()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3.m11419j()
            com.google.android.gms.measurement.internal.d r4 = r3.f5736a
            o7.f4 r4 = r4.mo3160b()
            h6.a0 r0 = new h6.a0
            r0.<init>(r3, r2)
            r4.m11176s(r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void setMinimumSessionDuration(long r1) {
            r0 = this;
            r0.m3129x()
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void setSessionTimeoutDuration(long r5) {
            r4 = this;
            r4.m3129x()
            com.google.android.gms.measurement.internal.d r0 = r4.f5656a
            o7.d5 r0 = r0.m3176v()
            com.google.android.gms.measurement.internal.d r1 = r0.f5736a
            o7.f4 r1 = r1.mo3160b()
            o7.x4 r2 = new o7.x4
            r3 = 0
            r2.<init>(r0, r5, r3)
            r1.m11176s(r2)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void setUserId(java.lang.String r9, long r10) {
            r8 = this;
            r8.m3129x()
            if (r9 == 0) goto L19
            int r0 = r9.length()
            if (r0 != 0) goto L19
            com.google.android.gms.measurement.internal.d r9 = r8.f5656a
            com.google.android.gms.measurement.internal.b r9 = r9.mo3162d()
            o7.f3 r9 = r9.f5675i
            java.lang.String r10 = "User ID must be non-empty"
            r9.m11169c(r10)
            return
        L19:
            com.google.android.gms.measurement.internal.d r0 = r8.f5656a
            o7.d5 r1 = r0.m3176v()
            r2 = 0
            r5 = 1
            java.lang.String r3 = "_id"
            r4 = r9
            r6 = r10
            r1.m11122B(r2, r3, r4, r5, r6)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public void setUserProperty(java.lang.String r8, java.lang.String r9, p408x6.InterfaceC6957a r10, boolean r11, long r12) {
            r7 = this;
            r7.m3129x()
            java.lang.Object r3 = p408x6.BinderC6958b.m14124H(r10)
            com.google.android.gms.measurement.internal.d r10 = r7.f5656a
            o7.d5 r0 = r10.m3176v()
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            r0.m11122B(r1, r2, r3, r4, r5)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    /* renamed from: unregisterOnMeasurementEventListener */
    public void mo3128x89e2096d(p185k7.InterfaceC3995u0 r4) {
            r3 = this;
            r3.m3129x()
            java.util.Map<java.lang.Integer, o7.r4> r0 = r3.f5657b
            monitor-enter(r0)
            java.util.Map<java.lang.Integer, o7.r4> r1 = r3.f5657b     // Catch: java.lang.Throwable -> L3d
            int r2 = r4.mo8753f()     // Catch: java.lang.Throwable -> L3d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> L3d
            o7.r4 r1 = (p249o7.InterfaceC5090r4) r1     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto L1e
            o7.t6 r1 = new o7.t6
            r1.<init>(r3, r4)
        L1e:
            com.google.android.gms.measurement.internal.d r4 = r3.f5656a
            o7.d5 r4 = r4.m3176v()
            r4.m11419j()
            java.util.Set<o7.r4> r0 = r4.f19634e
            boolean r0 = r0.remove(r1)
            if (r0 != 0) goto L3c
            com.google.android.gms.measurement.internal.d r4 = r4.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5675i
            java.lang.String r0 = "OnEventListener had not been registered"
            r4.m11169c(r0)
        L3c:
            return
        L3d:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            throw r4
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"scion"})
    /* renamed from: x */
    public final void m3129x() {
            r2 = this;
            com.google.android.gms.measurement.internal.d r0 = r2.f5656a
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Attempting to perform action before initialize."
            r0.<init>(r1)
            throw r0
    }
}
