package p185k7;

/* renamed from: k7.c0 */
/* loaded from: classes.dex */
public class BinderC3753c0 extends android.os.Binder implements android.os.IInterface {
    public BinderC3753c0(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.attachInterface(r0, r1)
            return
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
            r0 = this;
            return r0
    }

    @Override // android.os.Binder
    public boolean onTransact(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) {
            r1 = this;
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r2 <= r0) goto Ld
            boolean r0 = super.onTransact(r2, r3, r4, r5)
            if (r0 == 0) goto L14
            r2 = 1
            return r2
        Ld:
            java.lang.String r0 = r1.getInterfaceDescriptor()
            r3.enforceInterface(r0)
        L14:
            boolean r2 = r1.mo8231v(r2, r3, r4, r5)
            return r2
    }

    /* renamed from: v */
    public boolean mo8231v(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
            r0 = this;
            r0 = 0
            throw r0
    }
}
