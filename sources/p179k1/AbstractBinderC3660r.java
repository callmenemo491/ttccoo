package p179k1;

/* renamed from: k1.r */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3660r extends android.os.Binder implements android.os.IInterface {
    public AbstractBinderC3660r() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "androidx.room.IMultiInstanceInvalidationService"
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
            java.lang.String r0 = "androidx.room.IMultiInstanceInvalidationService"
            r1 = 1
            if (r4 == r1) goto L5c
            r2 = 2
            if (r4 == r2) goto L2b
            r2 = 3
            if (r4 == r2) goto L19
            r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r4 == r2) goto L15
            boolean r4 = super.onTransact(r4, r5, r6, r7)
            return r4
        L15:
            r6.writeString(r0)
            return r1
        L19:
            r5.enforceInterface(r0)
            int r4 = r5.readInt()
            java.lang.String[] r5 = r5.createStringArray()
            r6 = r3
            androidx.room.MultiInstanceInvalidationService$b r6 = (androidx.room.MultiInstanceInvalidationService.BinderC0617b) r6
            r6.m2141v(r4, r5)
            return r1
        L2b:
            r5.enforceInterface(r0)
            android.os.IBinder r4 = r5.readStrongBinder()
            k1.q r4 = p179k1.InterfaceC3659q.a.m8089v(r4)
            int r5 = r5.readInt()
            r7 = r3
            androidx.room.MultiInstanceInvalidationService$b r7 = (androidx.room.MultiInstanceInvalidationService.BinderC0617b) r7
            androidx.room.MultiInstanceInvalidationService r0 = r7.f3649a
            android.os.RemoteCallbackList<k1.q> r2 = r0.f3646a0
            monitor-enter(r2)
            androidx.room.MultiInstanceInvalidationService r0 = r7.f3649a     // Catch: java.lang.Throwable -> L59
            android.os.RemoteCallbackList<k1.q> r0 = r0.f3646a0     // Catch: java.lang.Throwable -> L59
            r0.unregister(r4)     // Catch: java.lang.Throwable -> L59
            androidx.room.MultiInstanceInvalidationService r4 = r7.f3649a     // Catch: java.lang.Throwable -> L59
            java.util.HashMap<java.lang.Integer, java.lang.String> r4 = r4.f3645Z     // Catch: java.lang.Throwable -> L59
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L59
            r4.remove(r5)     // Catch: java.lang.Throwable -> L59
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L59
            r6.writeNoException()
            return r1
        L59:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L59
            throw r4
        L5c:
            r5.enforceInterface(r0)
            android.os.IBinder r4 = r5.readStrongBinder()
            k1.q r4 = p179k1.InterfaceC3659q.a.m8089v(r4)
            java.lang.String r5 = r5.readString()
            r7 = r3
            androidx.room.MultiInstanceInvalidationService$b r7 = (androidx.room.MultiInstanceInvalidationService.BinderC0617b) r7
            int r4 = r7.m2142x(r4, r5)
            r6.writeNoException()
            r6.writeInt(r4)
            return r1
    }
}
