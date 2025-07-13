package p248o6;

/* renamed from: o6.u0 */
/* loaded from: classes.dex */
public final class C4937u0 extends p053d7.C1340b implements p248o6.InterfaceC4918l {
    public C4937u0(android.os.IBinder r3) {
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.IGmsCallbacks"
            r1 = 2
            r2.<init>(r3, r0, r1)
            return
    }

    @Override // p248o6.InterfaceC4918l
    /* renamed from: h2 */
    public final void mo11063h2(int r3, android.os.IBinder r4, android.os.Bundle r5) {
            r2 = this;
            android.os.Parcel r5 = r2.m3839v()
            r5.writeInt(r3)
            r5.writeStrongBinder(r4)
            r3 = 0
            p110g7.C2296b.m6063c(r5, r3)
            android.os.Parcel r3 = android.os.Parcel.obtain()
            android.os.IBinder r4 = r2.f6853b     // Catch: java.lang.Throwable -> L23
            r0 = 0
            r1 = 1
            r4.transact(r1, r5, r3, r0)     // Catch: java.lang.Throwable -> L23
            r3.readException()     // Catch: java.lang.Throwable -> L23
            r5.recycle()
            r3.recycle()
            return
        L23:
            r4 = move-exception
            r5.recycle()
            r3.recycle()
            throw r4
    }
}
