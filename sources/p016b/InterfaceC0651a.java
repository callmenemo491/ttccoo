package p016b;

/* renamed from: b.a */
/* loaded from: classes.dex */
public interface InterfaceC0651a extends android.os.IInterface {

    /* renamed from: b.a$a */
    public static abstract class a extends android.os.Binder implements p016b.InterfaceC0651a {

        /* renamed from: a */
        public static final /* synthetic */ int f3790a = 0;

        /* renamed from: b.a$a$a, reason: collision with other inner class name */
        public static class C7366a implements p016b.InterfaceC0651a {

            /* renamed from: a */
            public android.os.IBinder f3791a;

            public C7366a(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.f3791a = r1
                    return
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.f3791a
                    return r0
            }

            @Override // p016b.InterfaceC0651a
            /* renamed from: g2 */
            public void mo2196g2(int r3, android.os.Bundle r4) {
                    r2 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.os.IResultReceiver"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L29
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L29
                    r3 = 0
                    r1 = 1
                    if (r4 == 0) goto L17
                    r0.writeInt(r1)     // Catch: java.lang.Throwable -> L29
                    r4.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L29
                    goto L1a
                L17:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L29
                L1a:
                    android.os.IBinder r3 = r2.f3791a     // Catch: java.lang.Throwable -> L29
                    r4 = 0
                    boolean r3 = r3.transact(r1, r0, r4, r1)     // Catch: java.lang.Throwable -> L29
                    if (r3 != 0) goto L25
                    int r3 = p016b.InterfaceC0651a.a.f3790a     // Catch: java.lang.Throwable -> L29
                L25:
                    r0.recycle()
                    return
                L29:
                    r3 = move-exception
                    r0.recycle()
                    throw r3
            }
        }

        public a() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "android.support.v4.os.IResultReceiver"
                r1.attachInterface(r1, r0)
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
                r0 = 1
                java.lang.String r1 = "android.support.v4.os.IResultReceiver"
                if (r4 == r0) goto L13
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r2) goto Lf
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            Lf:
                r6.writeString(r1)
                return r0
            L13:
                r5.enforceInterface(r1)
                int r4 = r5.readInt()
                int r6 = r5.readInt()
                if (r6 == 0) goto L29
                android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r6.createFromParcel(r5)
                android.os.Bundle r5 = (android.os.Bundle) r5
                goto L2a
            L29:
                r5 = 0
            L2a:
                r6 = r3
                b.b$b r6 = (p016b.C0652b.b) r6
                r6.mo2196g2(r4, r5)
                return r0
        }
    }

    /* renamed from: g2 */
    void mo2196g2(int r1, android.os.Bundle r2);
}
