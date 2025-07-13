package p052d6;

/* renamed from: d6.m */
/* loaded from: classes.dex */
public final class C1319m extends p053d7.C1340b implements p052d6.InterfaceC1323o {
    public C1319m(android.os.IBinder r3) {
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.cast.framework.IReconnectionService"
            r1 = 1
            r2.<init>(r3, r0, r1)
            return
    }

    @Override // p052d6.InterfaceC1323o
    /* renamed from: K1 */
    public final android.os.IBinder mo3808K1(android.content.Intent r2) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            p072e7.C1632i.m4225b(r0, r2)
            r2 = 3
            android.os.Parcel r2 = r1.m3836m2(r2, r0)
            android.os.IBinder r0 = r2.readStrongBinder()
            r2.recycle()
            return r0
    }

    @Override // p052d6.InterfaceC1323o
    /* renamed from: d2 */
    public final int mo3809d2(android.content.Intent r2, int r3, int r4) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            p072e7.C1632i.m4225b(r0, r2)
            r0.writeInt(r3)
            r0.writeInt(r4)
            r2 = 2
            android.os.Parcel r2 = r1.m3836m2(r2, r0)
            int r3 = r2.readInt()
            r2.recycle()
            return r3
    }

    @Override // p052d6.InterfaceC1323o
    /* renamed from: e */
    public final void mo3810e() {
            r2 = this;
            android.os.Parcel r0 = r2.m3834k2()
            r1 = 1
            r2.m3837n2(r1, r0)
            return
    }

    @Override // p052d6.InterfaceC1323o
    /* renamed from: g */
    public final void mo3811g() {
            r2 = this;
            android.os.Parcel r0 = r2.m3834k2()
            r1 = 4
            r2.m3837n2(r1, r0)
            return
    }
}
