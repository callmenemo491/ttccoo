package com.google.android.gms.measurement;

/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends p443z0.AbstractC7223a implements p249o7.InterfaceC5121v3 {

    /* renamed from: a0 */
    public p249o7.C5129w3 f5654a0;

    public AppMeasurementReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r6, android.content.Intent r7) {
            r5 = this;
            o7.w3 r0 = r5.f5654a0
            if (r0 != 0) goto Lb
            o7.w3 r0 = new o7.w3
            r0.<init>(r5)
            r5.f5654a0 = r0
        Lb:
            o7.w3 r0 = r5.f5654a0
            java.util.Objects.requireNonNull(r0)
            r1 = 0
            com.google.android.gms.measurement.internal.d r1 = com.google.android.gms.measurement.internal.C1113d.m3157u(r6, r1, r1)
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            if (r7 != 0) goto L21
            o7.f3 r6 = r1.f5675i
            java.lang.String r7 = "Receiver called with null intent"
            goto Lab
        L21:
            java.lang.String r7 = r7.getAction()
            o7.f3 r2 = r1.f5680n
            java.lang.String r3 = "Local receiver got"
            r2.m11170d(r3, r7)
            java.lang.String r2 = "com.google.android.gms.measurement.UPLOAD"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L9f
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r2 = "com.google.android.gms.measurement.AppMeasurementService"
            android.content.Intent r7 = r7.setClassName(r6, r2)
            java.lang.String r2 = "com.google.android.gms.measurement.UPLOAD"
            r7.setAction(r2)
            o7.f3 r1 = r1.f5680n
            java.lang.String r2 = "Starting wakeful intent."
            r1.m11169c(r2)
            o7.v3 r0 = r0.f20144a
            com.google.android.gms.measurement.AppMeasurementReceiver r0 = (com.google.android.gms.measurement.AppMeasurementReceiver) r0
            java.util.Objects.requireNonNull(r0)
            android.util.SparseArray<android.os.PowerManager$WakeLock> r0 = p443z0.AbstractC7223a.f27795Y
            monitor-enter(r0)
            int r1 = p443z0.AbstractC7223a.f27796Z     // Catch: java.lang.Throwable -> L9c
            int r2 = r1 + 1
            p443z0.AbstractC7223a.f27796Z = r2     // Catch: java.lang.Throwable -> L9c
            r3 = 1
            if (r2 > 0) goto L60
            p443z0.AbstractC7223a.f27796Z = r3     // Catch: java.lang.Throwable -> L9c
        L60:
            java.lang.String r2 = "androidx.contentpager.content.wakelockid"
            r7.putExtra(r2, r1)     // Catch: java.lang.Throwable -> L9c
            android.content.ComponentName r7 = r6.startService(r7)     // Catch: java.lang.Throwable -> L9c
            if (r7 != 0) goto L6c
            goto L9a
        L6c:
            java.lang.String r2 = "power"
            java.lang.Object r6 = r6.getSystemService(r2)     // Catch: java.lang.Throwable -> L9c
            android.os.PowerManager r6 = (android.os.PowerManager) r6     // Catch: java.lang.Throwable -> L9c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9c
            r2.<init>()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r4 = "androidx.core:wake:"
            r2.append(r4)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r7 = r7.flattenToShortString()     // Catch: java.lang.Throwable -> L9c
            r2.append(r7)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L9c
            android.os.PowerManager$WakeLock r6 = r6.newWakeLock(r3, r7)     // Catch: java.lang.Throwable -> L9c
            r7 = 0
            r6.setReferenceCounted(r7)     // Catch: java.lang.Throwable -> L9c
            r2 = 60000(0xea60, double:2.9644E-319)
            r6.acquire(r2)     // Catch: java.lang.Throwable -> L9c
            r0.put(r1, r6)     // Catch: java.lang.Throwable -> L9c
        L9a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9c
            goto Lae
        L9c:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9c
            throw r6
        L9f:
            java.lang.String r6 = "com.android.vending.INSTALL_REFERRER"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto Lae
            o7.f3 r6 = r1.f5675i
            java.lang.String r7 = "Install Referrer Broadcasts are deprecated"
        Lab:
            r6.m11169c(r7)
        Lae:
            return
    }
}
