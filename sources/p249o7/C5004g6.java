package p249o7;

/* renamed from: o7.g6 */
/* loaded from: classes.dex */
public final class C5004g6 extends p249o7.AbstractC5020i6 {

    /* renamed from: d */
    public final android.app.AlarmManager f19708d;

    /* renamed from: e */
    public p249o7.AbstractC5029k f19709e;

    /* renamed from: f */
    public java.lang.Integer f19710f;

    public C5004g6(p249o7.C5052m6 r2) {
            r1 = this;
            r1.<init>(r2)
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a
            android.content.Context r2 = r2.f5710a
            java.lang.String r0 = "alarm"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.app.AlarmManager r2 = (android.app.AlarmManager) r2
            r1.f19708d = r2
            return
    }

    @Override // p249o7.AbstractC5020i6
    /* renamed from: l */
    public final boolean mo11089l() {
            r2 = this;
            android.app.AlarmManager r0 = r2.f19708d
            if (r0 == 0) goto Lb
            android.app.PendingIntent r1 = r2.m11195o()
            r0.cancel(r1)
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L14
            r2.m11197q()
        L14:
            r0 = 0
            return r0
    }

    /* renamed from: m */
    public final void m11193m() {
            r2 = this;
            r2.m11247j()
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5680n
            java.lang.String r1 = "Unscheduling upload"
            r0.m11169c(r1)
            android.app.AlarmManager r0 = r2.f19708d
            if (r0 == 0) goto L1b
            android.app.PendingIntent r1 = r2.m11195o()
            r0.cancel(r1)
        L1b:
            o7.k r0 = r2.m11196p()
            r0.m11284a()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L2b
            r2.m11197q()
        L2b:
            return
    }

    /* renamed from: n */
    public final int m11194n() {
            r3 = this;
            java.lang.Integer r0 = r3.f19710f
            if (r0 != 0) goto L2c
            com.google.android.gms.measurement.internal.d r0 = r3.f5736a
            android.content.Context r0 = r0.f5710a
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "measurement"
            int r2 = r0.length()
            if (r2 == 0) goto L1d
            java.lang.String r0 = r1.concat(r0)
            goto L22
        L1d:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L22:
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.f19710f = r0
        L2c:
            java.lang.Integer r0 = r3.f19710f
            int r0 = r0.intValue()
            return r0
    }

    /* renamed from: o */
    public final android.app.PendingIntent m11195o() {
            r4 = this;
            com.google.android.gms.measurement.internal.d r0 = r4.f5736a
            android.content.Context r0 = r0.f5710a
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "com.google.android.gms.measurement.AppMeasurementReceiver"
            android.content.Intent r1 = r1.setClassName(r0, r2)
            java.lang.String r2 = "com.google.android.gms.measurement.UPLOAD"
            android.content.Intent r1 = r1.setAction(r2)
            int r2 = p185k7.C3823h0.f16658a
            r3 = 0
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r0, r3, r1, r2)
            return r0
    }

    /* renamed from: p */
    public final p249o7.AbstractC5029k m11196p() {
            r2 = this;
            o7.k r0 = r2.f19709e
            if (r0 != 0) goto Lf
            o7.c6 r0 = new o7.c6
            o7.m6 r1 = r2.f19756b
            com.google.android.gms.measurement.internal.d r1 = r1.f19871l
            r0.<init>(r2, r1)
            r2.f19709e = r0
        Lf:
            o7.k r0 = r2.f19709e
            return r0
    }

    @android.annotation.TargetApi(24)
    /* renamed from: q */
    public final void m11197q() {
            r2 = this;
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            android.content.Context r0 = r0.f5710a
            java.lang.String r1 = "jobscheduler"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.job.JobScheduler r0 = (android.app.job.JobScheduler) r0
            if (r0 == 0) goto L15
            int r1 = r2.m11194n()
            r0.cancel(r1)
        L15:
            return
    }
}
