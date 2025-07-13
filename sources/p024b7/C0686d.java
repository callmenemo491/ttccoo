package p024b7;

/* renamed from: b7.d */
/* loaded from: classes.dex */
public final class C0686d implements p024b7.InterfaceC0684b, android.os.IInterface {

    /* renamed from: a */
    public final android.os.IBinder f3873a;

    public C0686d(android.os.IBinder r1) {
            r0 = this;
            r0.<init>()
            r0.f3873a = r1
            return
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
            r1 = this;
            android.os.IBinder r0 = r1.f3873a
            return r0
    }

    @Override // p024b7.InterfaceC0684b
    /* renamed from: r */
    public final java.lang.String mo2245r() {
            r2 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            java.lang.String r1 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"
            r0.writeInterfaceToken(r1)
            r1 = 1
            android.os.Parcel r0 = r2.m2247v(r1, r0)
            java.lang.String r1 = r0.readString()
            r0.recycle()
            return r1
    }

    @Override // p024b7.InterfaceC0684b
    /* renamed from: s1 */
    public final boolean mo2246s1(boolean r3) {
            r2 = this;
            android.os.Parcel r3 = android.os.Parcel.obtain()
            java.lang.String r0 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"
            r3.writeInterfaceToken(r0)
            int r0 = p024b7.C0683a.f3871a
            r0 = 1
            r3.writeInt(r0)
            r1 = 2
            android.os.Parcel r3 = r2.m2247v(r1, r3)
            int r1 = r3.readInt()
            if (r1 == 0) goto L1b
            goto L1c
        L1b:
            r0 = 0
        L1c:
            r3.recycle()
            return r0
    }

    /* renamed from: v */
    public final android.os.Parcel m2247v(int r4, android.os.Parcel r5) {
            r3 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.IBinder r1 = r3.f3873a     // Catch: java.lang.Throwable -> L11 java.lang.RuntimeException -> L13
            r2 = 0
            r1.transact(r4, r5, r0, r2)     // Catch: java.lang.Throwable -> L11 java.lang.RuntimeException -> L13
            r0.readException()     // Catch: java.lang.Throwable -> L11 java.lang.RuntimeException -> L13
            r5.recycle()
            return r0
        L11:
            r4 = move-exception
            goto L18
        L13:
            r4 = move-exception
            r0.recycle()     // Catch: java.lang.Throwable -> L11
            throw r4     // Catch: java.lang.Throwable -> L11
        L18:
            r5.recycle()
            throw r4
    }
}
