package p249o7;

/* renamed from: o7.p5 */
/* loaded from: classes.dex */
public final class RunnableC5075p5 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f19941Y;

    /* renamed from: Z */
    public final /* synthetic */ p249o7.C5116u6 f19942Z;

    /* renamed from: a0 */
    public final /* synthetic */ p249o7.C5123v5 f19943a0;

    public RunnableC5075p5(p249o7.C5123v5 r2, p249o7.C5116u6 r3, int r4) {
            r1 = this;
            r1.f19941Y = r4
            r0 = 1
            if (r4 == r0) goto L23
            r0 = 2
            if (r4 == r0) goto L1b
            r0 = 3
            if (r4 == r0) goto L13
            r1.f19943a0 = r2
            r1.f19942Z = r3
            r1.<init>()
            return
        L13:
            r1.f19943a0 = r2
            r1.f19942Z = r3
            r1.<init>()
            return
        L1b:
            r1.f19943a0 = r2
            r1.f19942Z = r3
            r1.<init>()
            return
        L23:
            r1.f19943a0 = r2
            r1.f19942Z = r3
            r1.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f19941Y
            java.lang.String r1 = "null reference"
            switch(r0) {
                case 0: goto L86;
                case 1: goto L3e;
                case 2: goto L9;
                default: goto L7;
            }
        L7:
            goto Lbb
        L9:
            o7.v5 r0 = r4.f19943a0
            o7.z2 r2 = r0.f20135d
            if (r2 != 0) goto L1d
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5672f
            java.lang.String r1 = "Failed to send measurementEnabled to service"
            r0.m11169c(r1)
            goto L3d
        L1d:
            o7.u6 r0 = r4.f19942Z     // Catch: android.os.RemoteException -> L2d
            java.util.Objects.requireNonNull(r0, r1)     // Catch: android.os.RemoteException -> L2d
            o7.u6 r0 = r4.f19942Z     // Catch: android.os.RemoteException -> L2d
            r2.mo11306m0(r0)     // Catch: android.os.RemoteException -> L2d
            o7.v5 r0 = r4.f19943a0     // Catch: android.os.RemoteException -> L2d
            r0.m11433t()     // Catch: android.os.RemoteException -> L2d
            goto L3d
        L2d:
            r0 = move-exception
            o7.v5 r1 = r4.f19943a0
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5672f
            java.lang.String r2 = "Failed to send measurementEnabled to the service"
            r1.m11170d(r2, r0)
        L3d:
            return
        L3e:
            o7.v5 r0 = r4.f19943a0
            o7.z2 r2 = r0.f20135d
            if (r2 != 0) goto L52
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5672f
            java.lang.String r1 = "Discarding data. Failed to send app launch"
            r0.m11169c(r1)
            goto L85
        L52:
            o7.u6 r0 = r4.f19942Z     // Catch: android.os.RemoteException -> L75
            java.util.Objects.requireNonNull(r0, r1)     // Catch: android.os.RemoteException -> L75
            o7.u6 r0 = r4.f19942Z     // Catch: android.os.RemoteException -> L75
            r2.mo11296P(r0)     // Catch: android.os.RemoteException -> L75
            o7.v5 r0 = r4.f19943a0     // Catch: android.os.RemoteException -> L75
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a     // Catch: android.os.RemoteException -> L75
            o7.b3 r0 = r0.m3173r()     // Catch: android.os.RemoteException -> L75
            r0.m11108o()     // Catch: android.os.RemoteException -> L75
            o7.v5 r0 = r4.f19943a0     // Catch: android.os.RemoteException -> L75
            r1 = 0
            o7.u6 r3 = r4.f19942Z     // Catch: android.os.RemoteException -> L75
            r0.m11426m(r2, r1, r3)     // Catch: android.os.RemoteException -> L75
            o7.v5 r0 = r4.f19943a0     // Catch: android.os.RemoteException -> L75
            r0.m11433t()     // Catch: android.os.RemoteException -> L75
            goto L85
        L75:
            r0 = move-exception
            o7.v5 r1 = r4.f19943a0
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5672f
            java.lang.String r2 = "Failed to send app launch to the service"
            r1.m11170d(r2, r0)
        L85:
            return
        L86:
            o7.v5 r0 = r4.f19943a0
            o7.z2 r2 = r0.f20135d
            if (r2 != 0) goto L9a
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5672f
            java.lang.String r1 = "Failed to reset data on the service: not connected to service"
            r0.m11169c(r1)
            goto Lba
        L9a:
            o7.u6 r0 = r4.f19942Z     // Catch: android.os.RemoteException -> La5
            java.util.Objects.requireNonNull(r0, r1)     // Catch: android.os.RemoteException -> La5
            o7.u6 r0 = r4.f19942Z     // Catch: android.os.RemoteException -> La5
            r2.mo11295J1(r0)     // Catch: android.os.RemoteException -> La5
            goto Lb5
        La5:
            r0 = move-exception
            o7.v5 r1 = r4.f19943a0
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5672f
            java.lang.String r2 = "Failed to reset data on the service: remote exception"
            r1.m11170d(r2, r0)
        Lb5:
            o7.v5 r0 = r4.f19943a0
            r0.m11433t()
        Lba:
            return
        Lbb:
            o7.v5 r0 = r4.f19943a0
            o7.z2 r2 = r0.f20135d
            if (r2 != 0) goto Lcf
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5672f
            java.lang.String r1 = "Failed to send consent settings to service"
            r0.m11169c(r1)
            goto Lef
        Lcf:
            o7.u6 r0 = r4.f19942Z     // Catch: android.os.RemoteException -> Ldf
            java.util.Objects.requireNonNull(r0, r1)     // Catch: android.os.RemoteException -> Ldf
            o7.u6 r0 = r4.f19942Z     // Catch: android.os.RemoteException -> Ldf
            r2.mo11298W0(r0)     // Catch: android.os.RemoteException -> Ldf
            o7.v5 r0 = r4.f19943a0     // Catch: android.os.RemoteException -> Ldf
            r0.m11433t()     // Catch: android.os.RemoteException -> Ldf
            goto Lef
        Ldf:
            r0 = move-exception
            o7.v5 r1 = r4.f19943a0
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5672f
            java.lang.String r2 = "Failed to send consent settings to the service"
            r1.m11170d(r2, r0)
        Lef:
            return
    }
}
