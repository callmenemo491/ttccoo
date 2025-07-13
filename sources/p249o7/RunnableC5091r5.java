package p249o7;

/* renamed from: o7.r5 */
/* loaded from: classes.dex */
public final class RunnableC5091r5 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f19974Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.Object f19975Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.String f19976a0;

    /* renamed from: b0 */
    public final /* synthetic */ java.lang.String f19977b0;

    /* renamed from: c0 */
    public final /* synthetic */ p249o7.C5116u6 f19978c0;

    /* renamed from: d0 */
    public final /* synthetic */ p249o7.C5123v5 f19979d0;

    public RunnableC5091r5(p249o7.C5123v5 r2, java.lang.String r3, java.lang.String r4, p249o7.C5116u6 r5, p185k7.InterfaceC3956r0 r6) {
            r1 = this;
            r0 = 1
            r1.f19974Y = r0
            r1.f19979d0 = r2
            r1.f19976a0 = r3
            r1.f19977b0 = r4
            r1.f19978c0 = r5
            r1.f19975Z = r6
            r1.<init>()
            return
    }

    public RunnableC5091r5(p249o7.C5123v5 r2, java.util.concurrent.atomic.AtomicReference r3, java.lang.String r4, java.lang.String r5, p249o7.C5116u6 r6) {
            r1 = this;
            r0 = 0
            r1.f19974Y = r0
            r1.f19979d0 = r2
            r1.f19975Z = r3
            r1.f19976a0 = r4
            r1.f19977b0 = r5
            r1.f19978c0 = r6
            r1.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            int r0 = r7.f19974Y
            switch(r0) {
                case 0: goto L7;
                default: goto L5;
            }
        L5:
            goto L9a
        L7:
            java.lang.Object r0 = r7.f19975Z
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            monitor-enter(r0)
            r1 = 0
            o7.v5 r2 = r7.f19979d0     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            o7.z2 r3 = r2.f20135d     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            if (r3 != 0) goto L37
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            o7.f3 r2 = r2.f5672f     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            java.lang.String r3 = "(legacy) Failed to get conditional properties; not connected to service"
            java.lang.String r4 = r7.f19976a0     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            java.lang.String r5 = r7.f19977b0     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            r2.m11172f(r3, r1, r4, r5)     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            java.lang.Object r2 = r7.f19975Z     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            java.util.List r3 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            r2.set(r3)     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            java.lang.Object r1 = r7.f19975Z     // Catch: java.lang.Throwable -> L97
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch: java.lang.Throwable -> L97
        L33:
            r1.notify()     // Catch: java.lang.Throwable -> L97
            goto L8d
        L37:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            if (r2 == 0) goto L53
            o7.u6 r2 = r7.f19978c0     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            java.lang.String r4 = "null reference"
            java.util.Objects.requireNonNull(r2, r4)     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            java.lang.Object r2 = r7.f19975Z     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            java.lang.String r4 = r7.f19976a0     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            java.lang.String r5 = r7.f19977b0     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            o7.u6 r6 = r7.f19978c0     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            java.util.List r3 = r3.mo11302a2(r4, r5, r6)     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            goto L5f
        L53:
            java.lang.Object r2 = r7.f19975Z     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            java.lang.String r4 = r7.f19976a0     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            java.lang.String r5 = r7.f19977b0     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            java.util.List r3 = r3.mo11303b1(r1, r4, r5)     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
        L5f:
            r2.set(r3)     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            o7.v5 r2 = r7.f19979d0     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
            r2.m11433t()     // Catch: java.lang.Throwable -> L6a android.os.RemoteException -> L6c
        L67:
            java.lang.Object r1 = r7.f19975Z     // Catch: java.lang.Throwable -> L97
            goto L8a
        L6a:
            r1 = move-exception
            goto L8f
        L6c:
            r2 = move-exception
            o7.v5 r3 = r7.f19979d0     // Catch: java.lang.Throwable -> L6a
            com.google.android.gms.measurement.internal.d r3 = r3.f5736a     // Catch: java.lang.Throwable -> L6a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()     // Catch: java.lang.Throwable -> L6a
            o7.f3 r3 = r3.f5672f     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = "(legacy) Failed to get conditional properties; remote exception"
            java.lang.String r5 = r7.f19976a0     // Catch: java.lang.Throwable -> L6a
            r3.m11172f(r4, r1, r5, r2)     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r1 = r7.f19975Z     // Catch: java.lang.Throwable -> L6a
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch: java.lang.Throwable -> L6a
            java.util.List r2 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L6a
            r1.set(r2)     // Catch: java.lang.Throwable -> L6a
            goto L67
        L8a:
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch: java.lang.Throwable -> L97
            goto L33
        L8d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L97
            return
        L8f:
            java.lang.Object r2 = r7.f19975Z     // Catch: java.lang.Throwable -> L97
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch: java.lang.Throwable -> L97
            r2.notify()     // Catch: java.lang.Throwable -> L97
            throw r1     // Catch: java.lang.Throwable -> L97
        L97:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L97
            throw r1
        L9a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            o7.v5 r1 = r7.f19979d0     // Catch: java.lang.Throwable -> Ld2 android.os.RemoteException -> Ld4
            o7.z2 r2 = r1.f20135d     // Catch: java.lang.Throwable -> Ld2 android.os.RemoteException -> Ld4
            if (r2 != 0) goto Lb7
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a     // Catch: java.lang.Throwable -> Ld2 android.os.RemoteException -> Ld4
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()     // Catch: java.lang.Throwable -> Ld2 android.os.RemoteException -> Ld4
            o7.f3 r1 = r1.f5672f     // Catch: java.lang.Throwable -> Ld2 android.os.RemoteException -> Ld4
            java.lang.String r2 = "Failed to get conditional properties; not connected to service"
            java.lang.String r3 = r7.f19976a0     // Catch: java.lang.Throwable -> Ld2 android.os.RemoteException -> Ld4
            java.lang.String r4 = r7.f19977b0     // Catch: java.lang.Throwable -> Ld2 android.os.RemoteException -> Ld4
            r1.m11171e(r2, r3, r4)     // Catch: java.lang.Throwable -> Ld2 android.os.RemoteException -> Ld4
            goto Le8
        Lb7:
            o7.u6 r1 = r7.f19978c0     // Catch: java.lang.Throwable -> Ld2 android.os.RemoteException -> Ld4
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r1, r3)     // Catch: java.lang.Throwable -> Ld2 android.os.RemoteException -> Ld4
            java.lang.String r1 = r7.f19976a0     // Catch: java.lang.Throwable -> Ld2 android.os.RemoteException -> Ld4
            java.lang.String r3 = r7.f19977b0     // Catch: java.lang.Throwable -> Ld2 android.os.RemoteException -> Ld4
            o7.u6 r4 = r7.f19978c0     // Catch: java.lang.Throwable -> Ld2 android.os.RemoteException -> Ld4
            java.util.List r1 = r2.mo11302a2(r1, r3, r4)     // Catch: java.lang.Throwable -> Ld2 android.os.RemoteException -> Ld4
            java.util.ArrayList r0 = com.google.android.gms.measurement.internal.C1115f.m3194u(r1)     // Catch: java.lang.Throwable -> Ld2 android.os.RemoteException -> Ld4
            o7.v5 r1 = r7.f19979d0     // Catch: java.lang.Throwable -> Ld2 android.os.RemoteException -> Ld4
            r1.m11433t()     // Catch: java.lang.Throwable -> Ld2 android.os.RemoteException -> Ld4
            goto Le8
        Ld2:
            r1 = move-exception
            goto Lf8
        Ld4:
            r1 = move-exception
            o7.v5 r2 = r7.f19979d0     // Catch: java.lang.Throwable -> Ld2
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a     // Catch: java.lang.Throwable -> Ld2
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.Throwable -> Ld2
            o7.f3 r2 = r2.f5672f     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r3 = "Failed to get conditional properties; remote exception"
            java.lang.String r4 = r7.f19976a0     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r5 = r7.f19977b0     // Catch: java.lang.Throwable -> Ld2
            r2.m11172f(r3, r4, r5, r1)     // Catch: java.lang.Throwable -> Ld2
        Le8:
            o7.v5 r1 = r7.f19979d0
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            com.google.android.gms.measurement.internal.f r1 = r1.m3158A()
            java.lang.Object r2 = r7.f19975Z
            k7.r0 r2 = (p185k7.InterfaceC3956r0) r2
            r1.m3199D(r2, r0)
            return
        Lf8:
            o7.v5 r2 = r7.f19979d0
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a
            com.google.android.gms.measurement.internal.f r2 = r2.m3158A()
            java.lang.Object r3 = r7.f19975Z
            k7.r0 r3 = (p185k7.InterfaceC3956r0) r3
            r2.m3199D(r3, r0)
            throw r1
    }
}
