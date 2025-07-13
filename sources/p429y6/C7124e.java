package p429y6;

/* renamed from: y6.e */
/* loaded from: classes.dex */
public final class C7124e extends p053d7.C1340b implements p429y6.InterfaceC7125f {
    public C7124e(android.os.IBinder r3) {
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.dynamite.IDynamiteLoaderV2"
            r1 = 2
            r2.<init>(r3, r0, r1)
            return
    }

    @Override // p429y6.InterfaceC7125f
    /* renamed from: C */
    public final p408x6.InterfaceC6957a mo14243C(p408x6.InterfaceC6957a r2, java.lang.String r3, int r4, p408x6.InterfaceC6957a r5) {
            r1 = this;
            android.os.Parcel r0 = r1.m3839v()
            p110g7.C2296b.m6062b(r0, r2)
            r0.writeString(r3)
            r0.writeInt(r4)
            p110g7.C2296b.m6062b(r0, r5)
            r2 = 2
            android.os.Parcel r2 = r1.m3835l2(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            x6.a r3 = p408x6.InterfaceC6957a.a.m14123x(r3)
            r2.recycle()
            return r3
    }

    @Override // p429y6.InterfaceC7125f
    /* renamed from: f2 */
    public final p408x6.InterfaceC6957a mo14244f2(p408x6.InterfaceC6957a r2, java.lang.String r3, int r4, p408x6.InterfaceC6957a r5) {
            r1 = this;
            android.os.Parcel r0 = r1.m3839v()
            p110g7.C2296b.m6062b(r0, r2)
            r0.writeString(r3)
            r0.writeInt(r4)
            p110g7.C2296b.m6062b(r0, r5)
            r2 = 3
            android.os.Parcel r2 = r1.m3835l2(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            x6.a r3 = p408x6.InterfaceC6957a.a.m14123x(r3)
            r2.recycle()
            return r3
    }
}
