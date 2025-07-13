package p249o7;

/* renamed from: o7.n5 */
/* loaded from: classes.dex */
public final class RunnableC5059n5 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f19905Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.String f19906Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.String f19907a0;

    /* renamed from: b0 */
    public final /* synthetic */ p249o7.C5116u6 f19908b0;

    /* renamed from: c0 */
    public final /* synthetic */ boolean f19909c0;

    /* renamed from: d0 */
    public final /* synthetic */ java.lang.Object f19910d0;

    /* renamed from: e0 */
    public final /* synthetic */ p249o7.C5123v5 f19911e0;

    public RunnableC5059n5(p249o7.C5123v5 r2, java.lang.String r3, java.lang.String r4, p249o7.C5116u6 r5, boolean r6, p185k7.InterfaceC3956r0 r7) {
            r1 = this;
            r0 = 0
            r1.f19905Y = r0
            r1.f19911e0 = r2
            r1.f19906Z = r3
            r1.f19907a0 = r4
            r1.f19908b0 = r5
            r1.f19909c0 = r6
            r1.f19910d0 = r7
            r1.<init>()
            return
    }

    public RunnableC5059n5(p249o7.C5123v5 r2, java.util.concurrent.atomic.AtomicReference r3, java.lang.String r4, java.lang.String r5, p249o7.C5116u6 r6, boolean r7) {
            r1 = this;
            r0 = 1
            r1.f19905Y = r0
            r1.f19911e0 = r2
            r1.f19910d0 = r3
            r1.f19906Z = r4
            r1.f19907a0 = r5
            r1.f19908b0 = r6
            r1.f19909c0 = r7
            r1.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r8 = this;
            int r0 = r8.f19905Y
            switch(r0) {
                case 0: goto L7;
                default: goto L5;
            }
        L5:
            goto Lc6
        L7:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            o7.v5 r1 = r8.f19911e0     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            o7.z2 r2 = r1.f20135d     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            if (r2 != 0) goto L34
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            o7.f3 r1 = r1.f5672f     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            java.lang.String r2 = "Failed to get user properties; not connected to service"
            java.lang.String r3 = r8.f19906Z     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            java.lang.String r4 = r8.f19907a0     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            r1.m11171e(r2, r3, r4)     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            o7.v5 r1 = r8.f19911e0
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            com.google.android.gms.measurement.internal.f r1 = r1.m3158A()
            java.lang.Object r2 = r8.f19910d0
            k7.r0 r2 = (p185k7.InterfaceC3956r0) r2
            r1.m3200E(r2, r0)
            goto Lb2
        L34:
            o7.u6 r1 = r8.f19908b0     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r1, r3)     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            java.lang.String r1 = r8.f19906Z     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            java.lang.String r3 = r8.f19907a0     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            boolean r4 = r8.f19909c0     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            o7.u6 r5 = r8.f19908b0     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            java.util.List r1 = r2.mo11311x1(r1, r3, r4, r5)     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            r2.<init>()     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            if (r1 != 0) goto L4f
            goto L85
        L4f:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
        L53:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            if (r3 == 0) goto L85
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            o7.p6 r3 = (p249o7.C5076p6) r3     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            java.lang.String r4 = r3.f19948c0     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            if (r4 == 0) goto L69
            java.lang.String r3 = r3.f19945Z     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            r2.putString(r3, r4)     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            goto L53
        L69:
            java.lang.Long r4 = r3.f19947b0     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            if (r4 == 0) goto L77
            java.lang.String r3 = r3.f19945Z     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            r2.putLong(r3, r4)     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            goto L53
        L77:
            java.lang.Double r4 = r3.f19950e0     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            if (r4 == 0) goto L53
            java.lang.String r3 = r3.f19945Z     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            double r4 = r4.doubleValue()     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            r2.putDouble(r3, r4)     // Catch: java.lang.Throwable -> L8d android.os.RemoteException -> L8f
            goto L53
        L85:
            o7.v5 r0 = r8.f19911e0     // Catch: android.os.RemoteException -> L8b java.lang.Throwable -> Lb3
            r0.m11433t()     // Catch: android.os.RemoteException -> L8b java.lang.Throwable -> Lb3
            goto La3
        L8b:
            r0 = move-exception
            goto L92
        L8d:
            r1 = move-exception
            goto Lb6
        L8f:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L92:
            o7.v5 r1 = r8.f19911e0     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a     // Catch: java.lang.Throwable -> Lb3
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()     // Catch: java.lang.Throwable -> Lb3
            o7.f3 r1 = r1.f5672f     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r3 = "Failed to get user properties; remote exception"
            java.lang.String r4 = r8.f19906Z     // Catch: java.lang.Throwable -> Lb3
            r1.m11171e(r3, r4, r0)     // Catch: java.lang.Throwable -> Lb3
        La3:
            o7.v5 r0 = r8.f19911e0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.f r0 = r0.m3158A()
            java.lang.Object r1 = r8.f19910d0
            k7.r0 r1 = (p185k7.InterfaceC3956r0) r1
            r0.m3200E(r1, r2)
        Lb2:
            return
        Lb3:
            r0 = move-exception
            r1 = r0
            r0 = r2
        Lb6:
            o7.v5 r2 = r8.f19911e0
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a
            com.google.android.gms.measurement.internal.f r2 = r2.m3158A()
            java.lang.Object r3 = r8.f19910d0
            k7.r0 r3 = (p185k7.InterfaceC3956r0) r3
            r2.m3200E(r3, r0)
            throw r1
        Lc6:
            java.lang.Object r0 = r8.f19910d0
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            monitor-enter(r0)
            r1 = 0
            o7.v5 r2 = r8.f19911e0     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            o7.z2 r3 = r2.f20135d     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            if (r3 != 0) goto Lf6
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            o7.f3 r2 = r2.f5672f     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            java.lang.String r3 = "(legacy) Failed to get user properties; not connected to service"
            java.lang.String r4 = r8.f19906Z     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            java.lang.String r5 = r8.f19907a0     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            r2.m11172f(r3, r1, r4, r5)     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            java.lang.Object r2 = r8.f19910d0     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            java.util.List r3 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            r2.set(r3)     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            java.lang.Object r1 = r8.f19910d0     // Catch: java.lang.Throwable -> L15a
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch: java.lang.Throwable -> L15a
        Lf2:
            r1.notify()     // Catch: java.lang.Throwable -> L15a
            goto L150
        Lf6:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            if (r2 == 0) goto L114
            o7.u6 r2 = r8.f19908b0     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            java.lang.String r4 = "null reference"
            java.util.Objects.requireNonNull(r2, r4)     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            java.lang.Object r2 = r8.f19910d0     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            java.lang.String r4 = r8.f19906Z     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            java.lang.String r5 = r8.f19907a0     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            boolean r6 = r8.f19909c0     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            o7.u6 r7 = r8.f19908b0     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            java.util.List r3 = r3.mo11311x1(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            goto L122
        L114:
            java.lang.Object r2 = r8.f19910d0     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            java.lang.String r4 = r8.f19906Z     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            java.lang.String r5 = r8.f19907a0     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            boolean r6 = r8.f19909c0     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            java.util.List r3 = r3.mo11307p0(r1, r4, r5, r6)     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
        L122:
            r2.set(r3)     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            o7.v5 r2 = r8.f19911e0     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
            r2.m11433t()     // Catch: java.lang.Throwable -> L12d android.os.RemoteException -> L12f
        L12a:
            java.lang.Object r1 = r8.f19910d0     // Catch: java.lang.Throwable -> L15a
            goto L14d
        L12d:
            r1 = move-exception
            goto L152
        L12f:
            r2 = move-exception
            o7.v5 r3 = r8.f19911e0     // Catch: java.lang.Throwable -> L12d
            com.google.android.gms.measurement.internal.d r3 = r3.f5736a     // Catch: java.lang.Throwable -> L12d
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()     // Catch: java.lang.Throwable -> L12d
            o7.f3 r3 = r3.f5672f     // Catch: java.lang.Throwable -> L12d
            java.lang.String r4 = "(legacy) Failed to get user properties; remote exception"
            java.lang.String r5 = r8.f19906Z     // Catch: java.lang.Throwable -> L12d
            r3.m11172f(r4, r1, r5, r2)     // Catch: java.lang.Throwable -> L12d
            java.lang.Object r1 = r8.f19910d0     // Catch: java.lang.Throwable -> L12d
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch: java.lang.Throwable -> L12d
            java.util.List r2 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L12d
            r1.set(r2)     // Catch: java.lang.Throwable -> L12d
            goto L12a
        L14d:
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch: java.lang.Throwable -> L15a
            goto Lf2
        L150:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15a
            return
        L152:
            java.lang.Object r2 = r8.f19910d0     // Catch: java.lang.Throwable -> L15a
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch: java.lang.Throwable -> L15a
            r2.notify()     // Catch: java.lang.Throwable -> L15a
            throw r1     // Catch: java.lang.Throwable -> L15a
        L15a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15a
            throw r1
    }
}
