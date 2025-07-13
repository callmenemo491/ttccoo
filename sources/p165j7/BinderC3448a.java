package p165j7;

/* renamed from: j7.a */
/* loaded from: classes.dex */
public class BinderC3448a extends android.os.Binder implements android.os.IInterface {
    public BinderC3448a(java.lang.String r1) {
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
    public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            r4 = this;
            r0 = 0
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            if (r5 <= r1) goto Lb
            boolean r8 = super.onTransact(r5, r6, r7, r8)
            goto L13
        Lb:
            java.lang.String r8 = r4.getInterfaceDescriptor()
            r6.enforceInterface(r8)
            r8 = 0
        L13:
            r1 = 1
            if (r8 == 0) goto L17
            return r1
        L17:
            r8 = r4
            z6.b r8 = (p449z6.AbstractBinderC7253b) r8
            if (r5 == r1) goto L8a
            r2 = 2
            if (r5 == r2) goto L6e
            r2 = 3
            if (r5 == r2) goto L57
            r2 = 4
            if (r5 == r2) goto L40
            r2 = 5
            if (r5 == r2) goto L29
            goto L99
        L29:
            java.lang.String r5 = r6.readString()
            java.lang.String r0 = r6.readString()
            int r6 = r6.readInt()
            java.lang.String r5 = r8.getStringFlagValue(r5, r0, r6)
            r7.writeNoException()
            r7.writeString(r5)
            goto L98
        L40:
            java.lang.String r5 = r6.readString()
            long r2 = r6.readLong()
            int r6 = r6.readInt()
            long r5 = r8.getLongFlagValue(r5, r2, r6)
            r7.writeNoException()
            r7.writeLong(r5)
            goto L98
        L57:
            java.lang.String r5 = r6.readString()
            int r0 = r6.readInt()
            int r6 = r6.readInt()
            int r5 = r8.getIntFlagValue(r5, r0, r6)
            r7.writeNoException()
            r7.writeInt(r5)
            goto L98
        L6e:
            java.lang.String r5 = r6.readString()
            int r2 = p165j7.C3449b.f14919a
            int r2 = r6.readInt()
            if (r2 == 0) goto L7b
            r0 = 1
        L7b:
            int r6 = r6.readInt()
            boolean r5 = r8.getBooleanFlagValue(r5, r0, r6)
            r7.writeNoException()
            r7.writeInt(r5)
            goto L98
        L8a:
            android.os.IBinder r5 = r6.readStrongBinder()
            x6.a r5 = p408x6.InterfaceC6957a.a.m14123x(r5)
            r8.init(r5)
            r7.writeNoException()
        L98:
            r0 = 1
        L99:
            return r0
    }
}
