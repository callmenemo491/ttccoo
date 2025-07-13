package p249o7;

/* renamed from: o7.u5 */
/* loaded from: classes.dex */
public final class ServiceConnectionC5115u5 implements android.content.ServiceConnection, p248o6.AbstractC4900c.a, p248o6.AbstractC4900c.b {

    /* renamed from: Y */
    public volatile boolean f20028Y;

    /* renamed from: Z */
    public volatile p249o7.C4977d3 f20029Z;

    /* renamed from: a0 */
    public final /* synthetic */ p249o7.C5123v5 f20030a0;

    public ServiceConnectionC5115u5(p249o7.C5123v5 r1) {
            r0 = this;
            r0.f20030a0 = r1
            r0.<init>()
            return
    }

    @Override // p248o6.AbstractC4900c.a
    /* renamed from: H */
    public final void mo11054H(android.os.Bundle r4) {
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onConnected"
            com.google.android.gms.common.internal.C1101a.m3099d(r4)
            monitor-enter(r3)
            o7.d3 r4 = r3.f20029Z     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L29
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r4, r0)     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L29
            o7.d3 r4 = r3.f20029Z     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L29
            android.os.IInterface r4 = r4.m11053y()     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L29
            o7.z2 r4 = (p249o7.InterfaceC5152z2) r4     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L29
            o7.v5 r0 = r3.f20030a0     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L29
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L29
            o7.f4 r0 = r0.mo3160b()     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L29
            o7.s5 r1 = new o7.s5     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L29
            r2 = 1
            r1.<init>(r3, r4, r2)     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L29
            r0.m11176s(r1)     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L29
            goto L2f
        L27:
            r4 = move-exception
            goto L31
        L29:
            r4 = 0
            r3.f20029Z = r4     // Catch: java.lang.Throwable -> L27
            r4 = 0
            r3.f20028Y = r4     // Catch: java.lang.Throwable -> L27
        L2f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            return
        L31:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            throw r4
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.C1101a.m3099d(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L1f
            r3.f20028Y = r4     // Catch: java.lang.Throwable -> L1c
            o7.v5 r4 = r3.f20030a0     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.measurement.internal.d r4 = r4.f5736a     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()     // Catch: java.lang.Throwable -> L1c
            o7.f3 r4 = r4.f5672f     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = "Service connected with null binder"
            r4.m11169c(r5)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r4 = move-exception
            goto L95
        L1f:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch: java.lang.Throwable -> L1c android.os.RemoteException -> L60
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch: java.lang.Throwable -> L1c android.os.RemoteException -> L60
            if (r2 == 0) goto L50
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch: java.lang.Throwable -> L1c android.os.RemoteException -> L60
            boolean r2 = r1 instanceof p249o7.InterfaceC5152z2     // Catch: java.lang.Throwable -> L1c android.os.RemoteException -> L60
            if (r2 == 0) goto L3a
            o7.z2 r1 = (p249o7.InterfaceC5152z2) r1     // Catch: java.lang.Throwable -> L1c android.os.RemoteException -> L60
        L38:
            r0 = r1
            goto L40
        L3a:
            o7.w2 r1 = new o7.w2     // Catch: java.lang.Throwable -> L1c android.os.RemoteException -> L60
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L1c android.os.RemoteException -> L60
            goto L38
        L40:
            o7.v5 r5 = r3.f20030a0     // Catch: java.lang.Throwable -> L1c android.os.RemoteException -> L60
            com.google.android.gms.measurement.internal.d r5 = r5.f5736a     // Catch: java.lang.Throwable -> L1c android.os.RemoteException -> L60
            com.google.android.gms.measurement.internal.b r5 = r5.mo3162d()     // Catch: java.lang.Throwable -> L1c android.os.RemoteException -> L60
            o7.f3 r5 = r5.f5680n     // Catch: java.lang.Throwable -> L1c android.os.RemoteException -> L60
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.m11169c(r1)     // Catch: java.lang.Throwable -> L1c android.os.RemoteException -> L60
            goto L6f
        L50:
            o7.v5 r5 = r3.f20030a0     // Catch: java.lang.Throwable -> L1c android.os.RemoteException -> L60
            com.google.android.gms.measurement.internal.d r5 = r5.f5736a     // Catch: java.lang.Throwable -> L1c android.os.RemoteException -> L60
            com.google.android.gms.measurement.internal.b r5 = r5.mo3162d()     // Catch: java.lang.Throwable -> L1c android.os.RemoteException -> L60
            o7.f3 r5 = r5.f5672f     // Catch: java.lang.Throwable -> L1c android.os.RemoteException -> L60
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.m11170d(r2, r1)     // Catch: java.lang.Throwable -> L1c android.os.RemoteException -> L60
            goto L6f
        L60:
            o7.v5 r5 = r3.f20030a0     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.measurement.internal.d r5 = r5.f5736a     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.measurement.internal.b r5 = r5.mo3162d()     // Catch: java.lang.Throwable -> L1c
            o7.f3 r5 = r5.f5672f     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.m11169c(r1)     // Catch: java.lang.Throwable -> L1c
        L6f:
            if (r0 != 0) goto L83
            r3.f20028Y = r4     // Catch: java.lang.Throwable -> L1c
            t6.a r4 = p338t6.C6181a.m12748b()     // Catch: java.lang.Throwable -> L1c java.lang.IllegalArgumentException -> L93
            o7.v5 r5 = r3.f20030a0     // Catch: java.lang.Throwable -> L1c java.lang.IllegalArgumentException -> L93
            com.google.android.gms.measurement.internal.d r0 = r5.f5736a     // Catch: java.lang.Throwable -> L1c java.lang.IllegalArgumentException -> L93
            android.content.Context r0 = r0.f5710a     // Catch: java.lang.Throwable -> L1c java.lang.IllegalArgumentException -> L93
            o7.u5 r5 = r5.f20134c     // Catch: java.lang.Throwable -> L1c java.lang.IllegalArgumentException -> L93
            r4.m12750c(r0, r5)     // Catch: java.lang.Throwable -> L1c java.lang.IllegalArgumentException -> L93
            goto L93
        L83:
            o7.v5 r5 = r3.f20030a0     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.measurement.internal.d r5 = r5.f5736a     // Catch: java.lang.Throwable -> L1c
            o7.f4 r5 = r5.mo3160b()     // Catch: java.lang.Throwable -> L1c
            o7.s5 r1 = new o7.s5     // Catch: java.lang.Throwable -> L1c
            r1.<init>(r3, r0, r4)     // Catch: java.lang.Throwable -> L1c
            r5.m11176s(r1)     // Catch: java.lang.Throwable -> L1c
        L93:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1c
            return
        L95:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1c
            throw r4
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName r3) {
            r2 = this;
            java.lang.String r0 = "MeasurementServiceConnection.onServiceDisconnected"
            com.google.android.gms.common.internal.C1101a.m3099d(r0)
            o7.v5 r0 = r2.f20030a0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5679m
            java.lang.String r1 = "Service disconnected"
            r0.m11169c(r1)
            o7.v5 r0 = r2.f20030a0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.f4 r0 = r0.mo3160b()
            h6.a0 r1 = new h6.a0
            r1.<init>(r2, r3)
            r0.m11176s(r1)
            return
    }

    @Override // p248o6.AbstractC4900c.a
    /* renamed from: v */
    public final void mo11055v(int r3) {
            r2 = this;
            java.lang.String r3 = "MeasurementServiceConnection.onConnectionSuspended"
            com.google.android.gms.common.internal.C1101a.m3099d(r3)
            o7.v5 r3 = r2.f20030a0
            com.google.android.gms.measurement.internal.d r3 = r3.f5736a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5679m
            java.lang.String r0 = "Service connection suspended"
            r3.m11169c(r0)
            o7.v5 r3 = r2.f20030a0
            com.google.android.gms.measurement.internal.d r3 = r3.f5736a
            o7.f4 r3 = r3.mo3160b()
            o7.t5 r0 = new o7.t5
            r1 = 0
            r0.<init>(r2, r1)
            r3.m11176s(r0)
            return
    }

    @Override // p248o6.AbstractC4900c.b
    /* renamed from: x */
    public final void mo11056x(p184k6.C3698b r4) {
            r3 = this;
            java.lang.String r0 = "MeasurementServiceConnection.onConnectionFailed"
            com.google.android.gms.common.internal.C1101a.m3099d(r0)
            o7.v5 r0 = r3.f20030a0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r1 = r0.f5718i
            r2 = 0
            if (r1 == 0) goto L17
            boolean r1 = r1.m11318o()
            if (r1 == 0) goto L17
            com.google.android.gms.measurement.internal.b r0 = r0.f5718i
            goto L18
        L17:
            r0 = r2
        L18:
            if (r0 == 0) goto L21
            o7.f3 r0 = r0.f5675i
            java.lang.String r1 = "Service connection failed"
            r0.m11170d(r1, r4)
        L21:
            monitor-enter(r3)
            r4 = 0
            r3.f20028Y = r4     // Catch: java.lang.Throwable -> L3a
            r3.f20029Z = r2     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3a
            o7.v5 r4 = r3.f20030a0
            com.google.android.gms.measurement.internal.d r4 = r4.f5736a
            o7.f4 r4 = r4.mo3160b()
            o7.t5 r0 = new o7.t5
            r1 = 1
            r0.<init>(r3, r1)
            r4.m11176s(r0)
            return
        L3a:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3a
            throw r4
    }
}
