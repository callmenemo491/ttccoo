package p286q6;

/* renamed from: q6.a */
/* loaded from: classes.dex */
public final class C5578a extends p053d7.C1340b implements p286q6.InterfaceC5579b {
    public C5578a(android.os.IBinder r3) {
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.service.IClientTelemetryService"
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    @Override // p286q6.InterfaceC5579b
    /* renamed from: T */
    public final void mo11868T(p248o6.C4930r r4) {
            r3 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            java.lang.String r1 = r3.f6854c
            r0.writeInterfaceToken(r1)
            int r1 = p053d7.C1341c.f6855a
            r1 = 0
            r2 = 1
            if (r4 != 0) goto L13
            r0.writeInt(r1)
            goto L19
        L13:
            r0.writeInt(r2)
            r4.writeToParcel(r0, r1)
        L19:
            android.os.IBinder r4 = r3.f6853b     // Catch: java.lang.Throwable -> L23
            r1 = 0
            r4.transact(r2, r0, r1, r2)     // Catch: java.lang.Throwable -> L23
            r0.recycle()
            return
        L23:
            r4 = move-exception
            r0.recycle()
            throw r4
    }
}
