package p179k1;

/* renamed from: k1.q */
/* loaded from: classes.dex */
public interface InterfaceC3659q extends android.os.IInterface {

    /* renamed from: k1.q$a */
    public static abstract class a extends android.os.Binder implements p179k1.InterfaceC3659q {

        /* renamed from: a */
        public static final /* synthetic */ int f16158a = 0;

        /* renamed from: k1.q$a$a, reason: collision with other inner class name */
        public static class C7399a implements p179k1.InterfaceC3659q {

            /* renamed from: a */
            public android.os.IBinder f16159a;

            public C7399a(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.f16159a = r1
                    return
            }

            @Override // p179k1.InterfaceC3659q
            /* renamed from: G0 */
            public void mo8088G0(java.lang.String[] r4) {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "androidx.room.IMultiInstanceInvalidationCallback"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1c
                    r0.writeStringArray(r4)     // Catch: java.lang.Throwable -> L1c
                    android.os.IBinder r4 = r3.f16159a     // Catch: java.lang.Throwable -> L1c
                    r1 = 0
                    r2 = 1
                    boolean r4 = r4.transact(r2, r0, r1, r2)     // Catch: java.lang.Throwable -> L1c
                    if (r4 != 0) goto L18
                    int r4 = p179k1.InterfaceC3659q.a.f16158a     // Catch: java.lang.Throwable -> L1c
                L18:
                    r0.recycle()
                    return
                L1c:
                    r4 = move-exception
                    r0.recycle()
                    throw r4
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.f16159a
                    return r0
            }
        }

        /* renamed from: v */
        public static p179k1.InterfaceC3659q m8089v(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "androidx.room.IMultiInstanceInvalidationCallback"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof p179k1.InterfaceC3659q
                if (r1 == 0) goto L13
                k1.q r0 = (p179k1.InterfaceC3659q) r0
                return r0
            L13:
                k1.q$a$a r0 = new k1.q$a$a
                r0.<init>(r2)
                return r0
        }
    }

    /* renamed from: G0 */
    void mo8088G0(java.lang.String[] r1);
}
