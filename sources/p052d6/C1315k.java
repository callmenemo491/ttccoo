package p052d6;

/* renamed from: d6.k */
/* loaded from: classes.dex */
public final class C1315k extends p053d7.C1340b implements p052d6.InterfaceC1317l {
    public C1315k(android.os.IBinder r3) {
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.cast.framework.IDiscoveryManager"
            r1 = 1
            r2.<init>(r3, r0, r1)
            return
    }

    @Override // p052d6.InterfaceC1317l
    /* renamed from: d */
    public final p408x6.InterfaceC6957a mo3807d() {
            r2 = this;
            android.os.Parcel r0 = r2.m3834k2()
            r1 = 5
            android.os.Parcel r0 = r2.m3836m2(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            x6.a r1 = p408x6.InterfaceC6957a.a.m14123x(r1)
            r0.recycle()
            return r1
    }
}
