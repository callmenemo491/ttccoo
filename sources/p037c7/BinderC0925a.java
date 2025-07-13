package p037c7;

/* renamed from: c7.a */
/* loaded from: classes.dex */
public class BinderC0925a extends android.os.Binder implements android.os.IInterface {
    public BinderC0925a(java.lang.String r1) {
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
    public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
            r3 = this;
            r0 = 0
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            if (r4 <= r1) goto Lb
            boolean r6 = super.onTransact(r4, r5, r6, r7)
            goto L13
        Lb:
            java.lang.String r6 = r3.getInterfaceDescriptor()
            r5.enforceInterface(r6)
            r6 = 0
        L13:
            r7 = 1
            if (r6 == 0) goto L17
            return r7
        L17:
            r6 = r3
            c7.f r6 = (p037c7.AbstractBinderC0930f) r6
            if (r4 != r7) goto L4d
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r4 = com.google.android.gms.common.api.Status.CREATOR
            int r1 = p037c7.C0927c.f4878a
            int r1 = r5.readInt()
            r2 = 0
            if (r1 != 0) goto L29
            r4 = r2
            goto L2f
        L29:
            java.lang.Object r4 = r4.createFromParcel(r5)
            android.os.Parcelable r4 = (android.os.Parcelable) r4
        L2f:
            com.google.android.gms.common.api.Status r4 = (com.google.android.gms.common.api.Status) r4
            c7.j r6 = (p037c7.BinderC0934j) r6
            s7.j r5 = r6.f4880a
            int r6 = r4.f5536Z
            if (r6 > 0) goto L3a
            r0 = 1
        L3a:
            if (r0 == 0) goto L42
            s7.q<TResult> r4 = r5.f23075a
            r4.m12473r(r2)
            goto L4c
        L42:
            l6.b r6 = new l6.b
            r6.<init>(r4)
            s7.q<TResult> r4 = r5.f23075a
            r4.m12472q(r6)
        L4c:
            r0 = 1
        L4d:
            return r0
    }
}
