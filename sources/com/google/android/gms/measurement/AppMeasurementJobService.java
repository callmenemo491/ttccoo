package com.google.android.gms.measurement;

@android.annotation.TargetApi(24)
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends android.app.job.JobService implements p249o7.InterfaceC5147y5 {

    /* renamed from: Y */
    public p249o7.C5155z5<com.google.android.gms.measurement.AppMeasurementJobService> f5653Y;

    public AppMeasurementJobService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p249o7.InterfaceC5147y5
    /* renamed from: E */
    public final boolean mo3122E(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // p249o7.InterfaceC5147y5
    /* renamed from: a */
    public final void mo3123a(android.content.Intent r1) {
            r0 = this;
            return
    }

    @Override // p249o7.InterfaceC5147y5
    @android.annotation.TargetApi(24)
    /* renamed from: b */
    public final void mo3124b(android.app.job.JobParameters r1, boolean r2) {
            r0 = this;
            r2 = 0
            r0.jobFinished(r1, r2)
            return
    }

    /* renamed from: c */
    public final p249o7.C5155z5<com.google.android.gms.measurement.AppMeasurementJobService> m3125c() {
            r1 = this;
            o7.z5<com.google.android.gms.measurement.AppMeasurementJobService> r0 = r1.f5653Y
            if (r0 != 0) goto Lb
            o7.z5 r0 = new o7.z5
            r0.<init>(r1)
            r1.f5653Y = r0
        Lb:
            o7.z5<com.google.android.gms.measurement.AppMeasurementJobService> r0 = r1.f5653Y
            return r0
    }

    @Override // android.app.Service
    public void onCreate() {
            r2 = this;
            super.onCreate()
            o7.z5 r0 = r2.m3125c()
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
            o7.z5 r0 = r2.m3125c()
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
            o7.z5 r0 = r1.m3125c()
            r0.m11458a(r2)
            return
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(android.app.job.JobParameters r6) {
            r5 = this;
            o7.z5 r0 = r5.m3125c()
            T extends android.content.Context & o7.y5 r1 = r0.f20206a
            r2 = 0
            com.google.android.gms.measurement.internal.d r1 = com.google.android.gms.measurement.internal.C1113d.m3157u(r1, r2, r2)
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            android.os.PersistableBundle r2 = r6.getExtras()
            java.lang.String r3 = "action"
            java.lang.String r2 = r2.getString(r3)
            o7.f3 r3 = r1.f5680n
            java.lang.String r4 = "Local AppMeasurementJobService called. action"
            r3.m11170d(r4, r2)
            java.lang.String r3 = "com.google.android.gms.measurement.UPLOAD"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L3f
            c6.h0 r2 = new c6.h0
            r2.<init>(r0, r1, r6)
            T extends android.content.Context & o7.y5 r6 = r0.f20206a
            o7.m6 r6 = p249o7.C5052m6.m11328O(r6)
            o7.f4 r0 = r6.mo3160b()
            h6.a0 r1 = new h6.a0
            r1.<init>(r6, r2)
            r0.m11176s(r1)
        L3f:
            r6 = 1
            return r6
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(android.app.job.JobParameters r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent r2) {
            r1 = this;
            o7.z5 r0 = r1.m3125c()
            r0.m11459b(r2)
            r2 = 1
            return r2
    }
}
