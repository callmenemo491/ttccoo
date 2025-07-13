package p287q7;

/* renamed from: q7.g */
/* loaded from: classes.dex */
public final class C5589g extends p053d7.C1340b implements p287q7.InterfaceC5590h {
    public C5589g(android.os.IBinder r3) {
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.signin.internal.ISignInService"
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    @Override // p287q7.InterfaceC5590h
    /* renamed from: R0 */
    public final void mo11870R0(p287q7.C5593k r4, p287q7.InterfaceC5588f r5) {
            r3 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            java.lang.String r1 = r3.f6854c
            r0.writeInterfaceToken(r1)
            int r1 = p053d7.C1341c.f6855a
            r1 = 1
            r0.writeInt(r1)
            r1 = 0
            r4.writeToParcel(r0, r1)
            d7.a r5 = (p053d7.BinderC1339a) r5
            r0.writeStrongBinder(r5)
            r4 = 12
            android.os.Parcel r5 = android.os.Parcel.obtain()
            android.os.IBinder r2 = r3.f6853b     // Catch: java.lang.Throwable -> L2d
            r2.transact(r4, r0, r5, r1)     // Catch: java.lang.Throwable -> L2d
            r5.readException()     // Catch: java.lang.Throwable -> L2d
            r0.recycle()
            r5.recycle()
            return
        L2d:
            r4 = move-exception
            r0.recycle()
            r5.recycle()
            throw r4
    }
}
