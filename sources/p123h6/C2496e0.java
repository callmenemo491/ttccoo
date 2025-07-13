package p123h6;

/* renamed from: h6.e0 */
/* loaded from: classes.dex */
public final class C2496e0 extends p248o6.AbstractC4910h<p123h6.C2495e> {

    /* renamed from: D0 */
    public static final p123h6.C2489b f11284D0 = null;

    /* renamed from: A0 */
    public final long f11285A0;

    /* renamed from: B0 */
    public final android.os.Bundle f11286B0;

    /* renamed from: C0 */
    public final java.lang.String f11287C0;

    /* renamed from: z0 */
    public final com.google.android.gms.cast.CastDevice f11288z0;

    static {
            h6.b r0 = new h6.b
            java.lang.String r1 = "CastClientImplCxless"
            r0.<init>(r1)
            p123h6.C2496e0.f11284D0 = r0
            return
    }

    public C2496e0(android.content.Context r9, android.os.Looper r10, p248o6.C4902d r11, com.google.android.gms.cast.CastDevice r12, long r13, android.os.Bundle r15, java.lang.String r16, p201l6.AbstractC4184d.a r17, p201l6.AbstractC4184d.b r18) {
            r8 = this;
            r7 = r8
            r3 = 10
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r11
            r5 = r17
            r6 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = r12
            r7.f11288z0 = r0
            r0 = r13
            r7.f11285A0 = r0
            r0 = r15
            r7.f11286B0 = r0
            r0 = r16
            r7.f11287C0 = r0
            return
    }

    @Override // p248o6.AbstractC4900c
    /* renamed from: A */
    public final java.lang.String mo2635A() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE"
            return r0
    }

    @Override // p248o6.AbstractC4900c
    /* renamed from: E */
    public final boolean mo6393E() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // p248o6.AbstractC4900c, p201l6.C4181a.e
    /* renamed from: h */
    public final int mo2636h() {
            r1 = this;
            r0 = 19390000(0x127de30, float:3.0832467E-38)
            return r0
    }

    @Override // p248o6.AbstractC4900c, p201l6.C4181a.e
    /* renamed from: n */
    public final void mo6389n() {
            r4 = this;
            android.os.IInterface r0 = r4.m11053y()     // Catch: java.lang.Throwable -> Ld java.lang.IllegalStateException -> Lf android.os.RemoteException -> L11
            h6.e r0 = (p123h6.C2495e) r0     // Catch: java.lang.Throwable -> Ld java.lang.IllegalStateException -> Lf android.os.RemoteException -> L11
            r0.m6392p2()     // Catch: java.lang.Throwable -> Ld java.lang.IllegalStateException -> Lf android.os.RemoteException -> L11
            super.mo6389n()
            return
        Ld:
            r0 = move-exception
            goto L20
        Lf:
            r0 = move-exception
            goto L12
        L11:
            r0 = move-exception
        L12:
            h6.b r1 = p123h6.C2496e0.f11284D0     // Catch: java.lang.Throwable -> Ld
            java.lang.String r2 = "Error while disconnecting the controller interface"
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Ld
            r1.m6377b(r0, r2, r3)     // Catch: java.lang.Throwable -> Ld
            super.mo6389n()
            return
        L20:
            super.mo6389n()
            throw r0
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
    /* renamed from: u */
    public final p184k6.C3701d[] mo2638u() {
            r1 = this;
            k6.d[] r0 = p036c6.C0872a0.f4729e
            return r0
    }

    @Override // p248o6.AbstractC4900c
    /* renamed from: w */
    public final android.os.Bundle mo6391w() {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            h6.b r1 = p123h6.C2496e0.f11284D0
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "getRemoteService()"
            r1.m6376a(r3, r2)
            com.google.android.gms.cast.CastDevice r1 = r4.f11288z0
            java.util.Objects.requireNonNull(r1)
            java.lang.String r2 = "com.google.android.gms.cast.EXTRA_CAST_DEVICE"
            r0.putParcelable(r2, r1)
            long r1 = r4.f11285A0
            java.lang.String r3 = "com.google.android.gms.cast.EXTRA_CAST_FLAGS"
            r0.putLong(r3, r1)
            java.lang.String r1 = r4.f11287C0
            java.lang.String r2 = "connectionless_client_record_id"
            r0.putString(r2, r1)
            android.os.Bundle r1 = r4.f11286B0
            if (r1 == 0) goto L2e
            r0.putAll(r1)
        L2e:
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
