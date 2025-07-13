package p249o7;

/* renamed from: o7.t3 */
/* loaded from: classes.dex */
public final class ServiceConnectionC5105t3 implements android.content.ServiceConnection {

    /* renamed from: Y */
    public final java.lang.String f20006Y;

    /* renamed from: Z */
    public final /* synthetic */ p249o7.C5113u3 f20007Z;

    public ServiceConnectionC5105t3(p249o7.C5113u3 r1, java.lang.String r2) {
            r0 = this;
            r0.f20007Z = r1
            r0.<init>()
            r0.f20006Y = r2
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName r2, android.os.IBinder r3) {
            r1 = this;
            if (r3 == 0) goto L59
            int r2 = p185k7.AbstractBinderC3795f0.f16623a     // Catch: java.lang.RuntimeException -> L48
            java.lang.String r2 = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService"
            android.os.IInterface r2 = r3.queryLocalInterface(r2)     // Catch: java.lang.RuntimeException -> L48
            boolean r0 = r2 instanceof p185k7.InterfaceC3809g0     // Catch: java.lang.RuntimeException -> L48
            if (r0 == 0) goto L11
            k7.g0 r2 = (p185k7.InterfaceC3809g0) r2     // Catch: java.lang.RuntimeException -> L48
            goto L16
        L11:
            k7.e0 r2 = new k7.e0     // Catch: java.lang.RuntimeException -> L48
            r2.<init>(r3)     // Catch: java.lang.RuntimeException -> L48
        L16:
            if (r2 != 0) goto L28
            o7.u3 r2 = r1.f20007Z     // Catch: java.lang.RuntimeException -> L48
            com.google.android.gms.measurement.internal.d r2 = r2.f20024a     // Catch: java.lang.RuntimeException -> L48
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()     // Catch: java.lang.RuntimeException -> L48
            o7.f3 r2 = r2.f5675i     // Catch: java.lang.RuntimeException -> L48
            java.lang.String r3 = "Install Referrer Service implementation was not found"
            r2.m11169c(r3)     // Catch: java.lang.RuntimeException -> L48
            return
        L28:
            o7.u3 r3 = r1.f20007Z     // Catch: java.lang.RuntimeException -> L48
            com.google.android.gms.measurement.internal.d r3 = r3.f20024a     // Catch: java.lang.RuntimeException -> L48
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()     // Catch: java.lang.RuntimeException -> L48
            o7.f3 r3 = r3.f5680n     // Catch: java.lang.RuntimeException -> L48
            java.lang.String r0 = "Install Referrer Service connected"
            r3.m11169c(r0)     // Catch: java.lang.RuntimeException -> L48
            o7.u3 r3 = r1.f20007Z     // Catch: java.lang.RuntimeException -> L48
            com.google.android.gms.measurement.internal.d r3 = r3.f20024a     // Catch: java.lang.RuntimeException -> L48
            o7.f4 r3 = r3.mo3160b()     // Catch: java.lang.RuntimeException -> L48
            c6.h0 r0 = new c6.h0     // Catch: java.lang.RuntimeException -> L48
            r0.<init>(r1, r2, r1)     // Catch: java.lang.RuntimeException -> L48
            r3.m11176s(r0)     // Catch: java.lang.RuntimeException -> L48
            return
        L48:
            r2 = move-exception
            o7.u3 r3 = r1.f20007Z
            com.google.android.gms.measurement.internal.d r3 = r3.f20024a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5675i
            java.lang.String r0 = "Exception occurred while calling Install Referrer API"
            r3.m11170d(r0, r2)
            return
        L59:
            o7.u3 r2 = r1.f20007Z
            com.google.android.gms.measurement.internal.d r2 = r2.f20024a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5675i
            java.lang.String r3 = "Install Referrer connection returned with null binder"
            r2.m11169c(r3)
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName r2) {
            r1 = this;
            o7.u3 r2 = r1.f20007Z
            com.google.android.gms.measurement.internal.d r2 = r2.f20024a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5680n
            java.lang.String r0 = "Install Referrer Service disconnected"
            r2.m11169c(r0)
            return
    }
}
