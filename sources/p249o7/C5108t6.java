package p249o7;

/* renamed from: o7.t6 */
/* loaded from: classes.dex */
public final class C5108t6 implements p249o7.InterfaceC5090r4 {

    /* renamed from: a */
    public final p185k7.InterfaceC3995u0 f20012a;

    /* renamed from: b */
    public final /* synthetic */ com.google.android.gms.measurement.internal.AppMeasurementDynamiteService f20013b;

    public C5108t6(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r1, p185k7.InterfaceC3995u0 r2) {
            r0 = this;
            r0.f20013b = r1
            r0.<init>()
            r0.f20012a = r2
            return
    }

    @Override // p249o7.InterfaceC5090r4
    /* renamed from: a */
    public final void mo11418a(java.lang.String r7, java.lang.String r8, android.os.Bundle r9, long r10) {
            r6 = this;
            k7.u0 r0 = r6.f20012a     // Catch: android.os.RemoteException -> La
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.mo8752U(r1, r2, r3, r4)     // Catch: android.os.RemoteException -> La
            return
        La:
            r7 = move-exception
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r8 = r6.f20013b
            com.google.android.gms.measurement.internal.d r8 = r8.f5656a
            if (r8 == 0) goto L1c
            com.google.android.gms.measurement.internal.b r8 = r8.mo3162d()
            o7.f3 r8 = r8.f5675i
            java.lang.String r9 = "Event listener threw exception"
            r8.m11170d(r9, r7)
        L1c:
            return
    }
}
