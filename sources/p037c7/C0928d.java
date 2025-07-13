package p037c7;

/* renamed from: c7.d */
/* loaded from: classes.dex */
public final class C0928d implements p037c7.InterfaceC0929e, android.os.IInterface {

    /* renamed from: a */
    public final android.os.IBinder f4879a;

    public C0928d(android.os.IBinder r1) {
            r0 = this;
            r0.<init>()
            r0.f4879a = r1
            return
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
            r1 = this;
            android.os.IBinder r0 = r1.f4879a
            return r0
    }

    @Override // p037c7.InterfaceC0929e
    /* renamed from: y0 */
    public final void mo2634y0(p037c7.InterfaceC0931g r5) {
            r4 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            java.lang.String r1 = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService"
            r0.writeInterfaceToken(r1)
            int r1 = p037c7.C0927c.f4878a
            c7.a r5 = (p037c7.BinderC0925a) r5
            r0.writeStrongBinder(r5)
            r5 = 1
            android.os.Parcel r1 = android.os.Parcel.obtain()
            android.os.IBinder r2 = r4.f4879a     // Catch: java.lang.Throwable -> L25
            r3 = 0
            r2.transact(r5, r0, r1, r3)     // Catch: java.lang.Throwable -> L25
            r1.readException()     // Catch: java.lang.Throwable -> L25
            r0.recycle()
            r1.recycle()
            return
        L25:
            r5 = move-exception
            r0.recycle()
            r1.recycle()
            throw r5
    }
}
