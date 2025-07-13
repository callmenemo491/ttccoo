package com.google.android.gms.measurement;

/* loaded from: classes.dex */
public final class AppMeasurementService extends android.app.Service implements p249o7.InterfaceC5147y5 {

    /* renamed from: Y */
    public p249o7.C5155z5<com.google.android.gms.measurement.AppMeasurementService> f5655Y;

    public AppMeasurementService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p249o7.InterfaceC5147y5
    /* renamed from: E */
    public final boolean mo3122E(int r1) {
            r0 = this;
            boolean r1 = r0.stopSelfResult(r1)
            return r1
    }

    @Override // p249o7.InterfaceC5147y5
    /* renamed from: a */
    public final void mo3123a(android.content.Intent r5) {
            r4 = this;
            android.util.SparseArray<android.os.PowerManager$WakeLock> r0 = p443z0.AbstractC7223a.f27795Y
            java.lang.String r0 = "androidx.contentpager.content.wakelockid"
            r1 = 0
            int r5 = r5.getIntExtra(r0, r1)
            if (r5 != 0) goto Lc
            goto L36
        Lc:
            android.util.SparseArray<android.os.PowerManager$WakeLock> r0 = p443z0.AbstractC7223a.f27795Y
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r5)     // Catch: java.lang.Throwable -> L37
            android.os.PowerManager$WakeLock r1 = (android.os.PowerManager.WakeLock) r1     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L1f
            r1.release()     // Catch: java.lang.Throwable -> L37
            r0.remove(r5)     // Catch: java.lang.Throwable -> L37
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            goto L36
        L1f:
            java.lang.String r1 = "WakefulBroadcastReceiv."
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r2.<init>()     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = "No active wake lock id #"
            r2.append(r3)     // Catch: java.lang.Throwable -> L37
            r2.append(r5)     // Catch: java.lang.Throwable -> L37
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L37
            android.util.Log.w(r1, r5)     // Catch: java.lang.Throwable -> L37
            goto L1d
        L36:
            return
        L37:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r5
    }

    @Override // p249o7.InterfaceC5147y5
    /* renamed from: b */
    public final void mo3124b(android.app.job.JobParameters r1, boolean r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    /* renamed from: c */
    public final p249o7.C5155z5<com.google.android.gms.measurement.AppMeasurementService> m3126c() {
            r1 = this;
            o7.z5<com.google.android.gms.measurement.AppMeasurementService> r0 = r1.f5655Y
            if (r0 != 0) goto Lb
            o7.z5 r0 = new o7.z5
            r0.<init>(r1)
            r1.f5655Y = r0
        Lb:
            o7.z5<com.google.android.gms.measurement.AppMeasurementService> r0 = r1.f5655Y
            return r0
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r4) {
            r3 = this;
            o7.z5 r0 = r3.m3126c()
            java.util.Objects.requireNonNull(r0)
            r1 = 0
            if (r4 != 0) goto L16
            com.google.android.gms.measurement.internal.b r4 = r0.m11460c()
            o7.f3 r4 = r4.f5672f
            java.lang.String r0 = "onBind called with null intent"
            r4.m11169c(r0)
            goto L39
        L16:
            java.lang.String r4 = r4.getAction()
            java.lang.String r2 = "com.google.android.gms.measurement.START"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L2e
            o7.l4 r1 = new o7.l4
            T extends android.content.Context & o7.y5 r4 = r0.f20206a
            o7.m6 r4 = p249o7.C5052m6.m11328O(r4)
            r1.<init>(r4)
            goto L39
        L2e:
            com.google.android.gms.measurement.internal.b r0 = r0.m11460c()
            o7.f3 r0 = r0.f5675i
            java.lang.String r2 = "onBind received unknown action"
            r0.m11170d(r2, r4)
        L39:
            return r1
    }

    @Override // android.app.Service
    public void onCreate() {
            r2 = this;
            super.onCreate()
            o7.z5 r0 = r2.m3126c()
            T extends android.content.Context & o7.y5 r0 = r0.f20206a
            r1 = 0
            com.google.android.gms.measurement.internal.d r0 = com.google.android.gms.measurement.internal.C1113d.m3157u(r0, r1, r1)
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5680n
            java.lang.String r1 = "Local AppMeasurementService is starting up"
            r0.m11169c(r1)
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r2 = this;
            o7.z5 r0 = r2.m3126c()
            T extends android.content.Context & o7.y5 r0 = r0.f20206a
            r1 = 0
            com.google.android.gms.measurement.internal.d r0 = com.google.android.gms.measurement.internal.C1113d.m3157u(r0, r1, r1)
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5680n
            java.lang.String r1 = "Local AppMeasurementService is shutting down"
            r0.m11169c(r1)
            super.onDestroy()
            return
    }

    @Override // android.app.Service
    public void onRebind(android.content.Intent r2) {
            r1 = this;
            o7.z5 r0 = r1.m3126c()
            r0.m11458a(r2)
            return
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r6, int r7, int r8) {
            r5 = this;
            o7.z5 r7 = r5.m3126c()
            T extends android.content.Context & o7.y5 r0 = r7.f20206a
            r1 = 0
            com.google.android.gms.measurement.internal.d r0 = com.google.android.gms.measurement.internal.C1113d.m3157u(r0, r1, r1)
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            if (r6 != 0) goto L19
            o7.f3 r6 = r0.f5675i
            java.lang.String r7 = "AppMeasurementService started with null intent"
            r6.m11169c(r7)
            goto L47
        L19:
            java.lang.String r1 = r6.getAction()
            o7.f3 r2 = r0.f5680n
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            java.lang.String r4 = "Local AppMeasurementService called. startId, action"
            r2.m11171e(r4, r3, r1)
            java.lang.String r2 = "com.google.android.gms.measurement.UPLOAD"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L47
            o7.x5 r1 = new o7.x5
            r1.<init>(r7, r8, r0, r6)
            T extends android.content.Context & o7.y5 r6 = r7.f20206a
            o7.m6 r6 = p249o7.C5052m6.m11328O(r6)
            o7.f4 r7 = r6.mo3160b()
            h6.a0 r8 = new h6.a0
            r8.<init>(r6, r1)
            r7.m11176s(r8)
        L47:
            r6 = 2
            return r6
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent r2) {
            r1 = this;
            o7.z5 r0 = r1.m3126c()
            r0.m11459b(r2)
            r2 = 1
            return r2
    }
}
