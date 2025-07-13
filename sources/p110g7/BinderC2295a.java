package p110g7;

/* renamed from: g7.a */
/* loaded from: classes.dex */
public class BinderC2295a extends android.os.Binder implements android.os.IInterface {
    public BinderC2295a(java.lang.String r1) {
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
            if (r2 <= r0) goto La
            boolean r0 = super.onTransact(r2, r3, r4, r5)
            goto L12
        La:
            java.lang.String r0 = r1.getInterfaceDescriptor()
            r3.enforceInterface(r0)
            r0 = 0
        L12:
            if (r0 == 0) goto L16
            r2 = 1
            return r2
        L16:
            boolean r2 = r1.mo6060v(r2, r3, r4, r5)
            return r2
    }

    /* renamed from: v */
    public boolean mo6060v(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
            r0 = this;
            r1 = 0
            return r1
    }
}
