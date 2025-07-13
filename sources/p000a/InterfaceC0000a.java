package p000a;

/* renamed from: a.a */
/* loaded from: classes.dex */
public interface InterfaceC0000a extends android.os.IInterface {

    /* renamed from: a.a$a */
    public static abstract class a extends android.os.Binder implements p000a.InterfaceC0000a {

        /* renamed from: a */
        public static final /* synthetic */ int f0a = 0;

        /* renamed from: a.a$a$a, reason: collision with other inner class name */
        public static class C7361a implements p000a.InterfaceC0000a {

            /* renamed from: a */
            public android.os.IBinder f1a;

            public C7361a(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.f1a = r1
                    return
            }

            @Override // p000a.InterfaceC0000a
            /* renamed from: S1 */
            public void mo0S1(java.lang.String r3, int r4, java.lang.String r5, android.app.Notification r6) {
                    r2 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.app.INotificationSideChannel"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L2f
                    r0.writeString(r3)     // Catch: java.lang.Throwable -> L2f
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L2f
                    r0.writeString(r5)     // Catch: java.lang.Throwable -> L2f
                    r3 = 0
                    r4 = 1
                    if (r6 == 0) goto L1d
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L2f
                    r6.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L2f
                    goto L20
                L1d:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L2f
                L20:
                    android.os.IBinder r3 = r2.f1a     // Catch: java.lang.Throwable -> L2f
                    r5 = 0
                    boolean r3 = r3.transact(r4, r0, r5, r4)     // Catch: java.lang.Throwable -> L2f
                    if (r3 != 0) goto L2b
                    int r3 = p000a.InterfaceC0000a.a.f0a     // Catch: java.lang.Throwable -> L2f
                L2b:
                    r0.recycle()
                    return
                L2f:
                    r3 = move-exception
                    r0.recycle()
                    throw r3
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.f1a
                    return r0
            }
        }
    }

    /* renamed from: S1 */
    void mo0S1(java.lang.String r1, int r2, java.lang.String r3, android.app.Notification r4);
}
