package p429y6;

/* renamed from: y6.c */
/* loaded from: classes.dex */
public final class C7122c extends p053d7.C1340b implements p429y6.InterfaceC7123d {
    public C7122c(android.os.IBinder r3) {
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.dynamite.IDynamiteLoader"
            r1 = 2
            r2.<init>(r3, r0, r1)
            return
    }

    @Override // p429y6.InterfaceC7123d
    /* renamed from: B1 */
    public final p408x6.InterfaceC6957a mo14236B1(p408x6.InterfaceC6957a r2, java.lang.String r3, int r4) {
            r1 = this;
            android.os.Parcel r0 = r1.m3839v()
            p110g7.C2296b.m6062b(r0, r2)
            r0.writeString(r3)
            r0.writeInt(r4)
            r2 = 4
            android.os.Parcel r2 = r1.m3835l2(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            x6.a r3 = p408x6.InterfaceC6957a.a.m14123x(r3)
            r2.recycle()
            return r3
    }

    @Override // p429y6.InterfaceC7123d
    /* renamed from: C */
    public final p408x6.InterfaceC6957a mo14237C(p408x6.InterfaceC6957a r2, java.lang.String r3, int r4, p408x6.InterfaceC6957a r5) {
            r1 = this;
            android.os.Parcel r0 = r1.m3839v()
            p110g7.C2296b.m6062b(r0, r2)
            r0.writeString(r3)
            r0.writeInt(r4)
            p110g7.C2296b.m6062b(r0, r5)
            r2 = 8
            android.os.Parcel r2 = r1.m3835l2(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            x6.a r3 = p408x6.InterfaceC6957a.a.m14123x(r3)
            r2.recycle()
            return r3
    }

    @Override // p429y6.InterfaceC7123d
    /* renamed from: P1 */
    public final int mo14238P1(p408x6.InterfaceC6957a r2, java.lang.String r3, boolean r4) {
            r1 = this;
            android.os.Parcel r0 = r1.m3839v()
            p110g7.C2296b.m6062b(r0, r2)
            r0.writeString(r3)
            r0.writeInt(r4)
            r2 = 5
            android.os.Parcel r2 = r1.m3835l2(r2, r0)
            int r3 = r2.readInt()
            r2.recycle()
            return r3
    }

    @Override // p429y6.InterfaceC7123d
    /* renamed from: V0 */
    public final p408x6.InterfaceC6957a mo14239V0(p408x6.InterfaceC6957a r2, java.lang.String r3, int r4) {
            r1 = this;
            android.os.Parcel r0 = r1.m3839v()
            p110g7.C2296b.m6062b(r0, r2)
            r0.writeString(r3)
            r0.writeInt(r4)
            r2 = 2
            android.os.Parcel r2 = r1.m3835l2(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            x6.a r3 = p408x6.InterfaceC6957a.a.m14123x(r3)
            r2.recycle()
            return r3
    }

    @Override // p429y6.InterfaceC7123d
    /* renamed from: b */
    public final int mo14240b() {
            r2 = this;
            android.os.Parcel r0 = r2.m3839v()
            r1 = 6
            android.os.Parcel r0 = r2.m3835l2(r1, r0)
            int r1 = r0.readInt()
            r0.recycle()
            return r1
    }

    @Override // p429y6.InterfaceC7123d
    /* renamed from: i1 */
    public final p408x6.InterfaceC6957a mo14241i1(p408x6.InterfaceC6957a r2, java.lang.String r3, boolean r4, long r5) {
            r1 = this;
            android.os.Parcel r0 = r1.m3839v()
            p110g7.C2296b.m6062b(r0, r2)
            r0.writeString(r3)
            r0.writeInt(r4)
            r0.writeLong(r5)
            r2 = 7
            android.os.Parcel r2 = r1.m3835l2(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            x6.a r3 = p408x6.InterfaceC6957a.a.m14123x(r3)
            r2.recycle()
            return r3
    }

    @Override // p429y6.InterfaceC7123d
    /* renamed from: w1 */
    public final int mo14242w1(p408x6.InterfaceC6957a r2, java.lang.String r3, boolean r4) {
            r1 = this;
            android.os.Parcel r0 = r1.m3839v()
            p110g7.C2296b.m6062b(r0, r2)
            r0.writeString(r3)
            r0.writeInt(r4)
            r2 = 3
            android.os.Parcel r2 = r1.m3835l2(r2, r0)
            int r3 = r2.readInt()
            r2.recycle()
            return r3
    }
}
