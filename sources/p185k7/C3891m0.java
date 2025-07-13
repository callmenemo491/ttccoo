package p185k7;

/* renamed from: k7.m0 */
/* loaded from: classes.dex */
public final class C3891m0 extends p053d7.C1340b implements p185k7.InterfaceC3917o0 {
    public C3891m0(android.os.IBinder r3) {
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService"
            r1 = 4
            r2.<init>(r3, r0, r1)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public final void beginAdUnitExposure(java.lang.String r2, long r3) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            r0.writeString(r2)
            r0.writeLong(r3)
            r2 = 23
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public final void clearConditionalUserProperty(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            r0.writeString(r2)
            r0.writeString(r3)
            p185k7.C3767d0.m8367b(r0, r4)
            r2 = 9
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public final void endAdUnitExposure(java.lang.String r2, long r3) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            r0.writeString(r2)
            r0.writeLong(r3)
            r2 = 24
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public final void generateEventId(p185k7.InterfaceC3956r0 r2) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            p185k7.C3767d0.m8368c(r0, r2)
            r2 = 22
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public final void getCachedAppInstanceId(p185k7.InterfaceC3956r0 r2) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            p185k7.C3767d0.m8368c(r0, r2)
            r2 = 19
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public final void getConditionalUserProperties(java.lang.String r2, java.lang.String r3, p185k7.InterfaceC3956r0 r4) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            r0.writeString(r2)
            r0.writeString(r3)
            p185k7.C3767d0.m8368c(r0, r4)
            r2 = 10
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public final void getCurrentScreenClass(p185k7.InterfaceC3956r0 r2) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            p185k7.C3767d0.m8368c(r0, r2)
            r2 = 17
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public final void getCurrentScreenName(p185k7.InterfaceC3956r0 r2) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            p185k7.C3767d0.m8368c(r0, r2)
            r2 = 16
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public final void getGmpAppId(p185k7.InterfaceC3956r0 r2) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            p185k7.C3767d0.m8368c(r0, r2)
            r2 = 21
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public final void getMaxUserProperties(java.lang.String r2, p185k7.InterfaceC3956r0 r3) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            r0.writeString(r2)
            p185k7.C3767d0.m8368c(r0, r3)
            r2 = 6
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public final void getUserProperties(java.lang.String r2, java.lang.String r3, boolean r4, p185k7.InterfaceC3956r0 r5) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            r0.writeString(r2)
            r0.writeString(r3)
            java.lang.ClassLoader r2 = p185k7.C3767d0.f16553a
            r0.writeInt(r4)
            p185k7.C3767d0.m8368c(r0, r5)
            r2 = 5
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public final void initialize(p408x6.InterfaceC6957a r2, p185k7.C4034x0 r3, long r4) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            p185k7.C3767d0.m8368c(r0, r2)
            p185k7.C3767d0.m8367b(r0, r3)
            r0.writeLong(r4)
            r2 = 1
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public final void logEvent(java.lang.String r2, java.lang.String r3, android.os.Bundle r4, boolean r5, boolean r6, long r7) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            r0.writeString(r2)
            r0.writeString(r3)
            p185k7.C3767d0.m8367b(r0, r4)
            r0.writeInt(r5)
            r0.writeInt(r6)
            r0.writeLong(r7)
            r2 = 2
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public final void logHealthData(int r2, java.lang.String r3, p408x6.InterfaceC6957a r4, p408x6.InterfaceC6957a r5, p408x6.InterfaceC6957a r6) {
            r1 = this;
            android.os.Parcel r2 = r1.m3834k2()
            r0 = 5
            r2.writeInt(r0)
            r2.writeString(r3)
            p185k7.C3767d0.m8368c(r2, r4)
            p185k7.C3767d0.m8368c(r2, r5)
            p185k7.C3767d0.m8368c(r2, r6)
            r3 = 33
            r1.m3837n2(r3, r2)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public final void onActivityCreated(p408x6.InterfaceC6957a r2, android.os.Bundle r3, long r4) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            p185k7.C3767d0.m8368c(r0, r2)
            p185k7.C3767d0.m8367b(r0, r3)
            r0.writeLong(r4)
            r2 = 27
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public final void onActivityDestroyed(p408x6.InterfaceC6957a r2, long r3) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            p185k7.C3767d0.m8368c(r0, r2)
            r0.writeLong(r3)
            r2 = 28
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public final void onActivityPaused(p408x6.InterfaceC6957a r2, long r3) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            p185k7.C3767d0.m8368c(r0, r2)
            r0.writeLong(r3)
            r2 = 29
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public final void onActivityResumed(p408x6.InterfaceC6957a r2, long r3) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            p185k7.C3767d0.m8368c(r0, r2)
            r0.writeLong(r3)
            r2 = 30
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public final void onActivitySaveInstanceState(p408x6.InterfaceC6957a r2, p185k7.InterfaceC3956r0 r3, long r4) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            p185k7.C3767d0.m8368c(r0, r2)
            p185k7.C3767d0.m8368c(r0, r3)
            r0.writeLong(r4)
            r2 = 31
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public final void onActivityStarted(p408x6.InterfaceC6957a r2, long r3) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            p185k7.C3767d0.m8368c(r0, r2)
            r0.writeLong(r3)
            r2 = 25
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public final void onActivityStopped(p408x6.InterfaceC6957a r2, long r3) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            p185k7.C3767d0.m8368c(r0, r2)
            r0.writeLong(r3)
            r2 = 26
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    /* renamed from: registerOnMeasurementEventListener */
    public final void mo3127x37dae114(p185k7.InterfaceC3995u0 r2) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            p185k7.C3767d0.m8368c(r0, r2)
            r2 = 35
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public final void setConditionalUserProperty(android.os.Bundle r2, long r3) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            p185k7.C3767d0.m8367b(r0, r2)
            r0.writeLong(r3)
            r2 = 8
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public final void setCurrentScreen(p408x6.InterfaceC6957a r2, java.lang.String r3, java.lang.String r4, long r5) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            p185k7.C3767d0.m8368c(r0, r2)
            r0.writeString(r3)
            r0.writeString(r4)
            r0.writeLong(r5)
            r2 = 15
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public final void setDataCollectionEnabled(boolean r3) {
            r2 = this;
            android.os.Parcel r0 = r2.m3834k2()
            java.lang.ClassLoader r1 = p185k7.C3767d0.f16553a
            r0.writeInt(r3)
            r3 = 39
            r2.m3837n2(r3, r0)
            return
    }

    @Override // p185k7.InterfaceC3917o0
    public final void setUserProperty(java.lang.String r2, java.lang.String r3, p408x6.InterfaceC6957a r4, boolean r5, long r6) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            r0.writeString(r2)
            r0.writeString(r3)
            p185k7.C3767d0.m8368c(r0, r4)
            r0.writeInt(r5)
            r0.writeLong(r6)
            r2 = 4
            r1.m3837n2(r2, r0)
            return
    }
}
