package p072e7;

/* renamed from: e7.z5 */
/* loaded from: classes.dex */
public final class C1801z5 extends p053d7.C1340b implements p072e7.InterfaceC1775w6 {
    public C1801z5(android.os.IBinder r3) {
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.cast.framework.internal.ICastDynamiteModule"
            r1 = 1
            r2.<init>(r3, r0, r1)
            return
    }

    @Override // p072e7.InterfaceC1775w6
    /* renamed from: N0 */
    public final p052d6.InterfaceC1324o0 mo4478N0(p408x6.InterfaceC6957a r2, p052d6.C1297b r3, p072e7.InterfaceC1711p8 r4, java.util.Map r5) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            p072e7.C1632i.m4227d(r0, r2)
            p072e7.C1632i.m4225b(r0, r3)
            p072e7.C1632i.m4227d(r0, r4)
            r0.writeMap(r5)
            r2 = 1
            android.os.Parcel r2 = r1.m3836m2(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            int r4 = p052d6.AbstractBinderC1322n0.f6848a
            if (r3 != 0) goto L1f
            r3 = 0
            goto L33
        L1f:
            java.lang.String r4 = "com.google.android.gms.cast.framework.ICastContext"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof p052d6.InterfaceC1324o0
            if (r5 == 0) goto L2d
            r3 = r4
            d6.o0 r3 = (p052d6.InterfaceC1324o0) r3
            goto L33
        L2d:
            d6.m0 r4 = new d6.m0
            r4.<init>(r3)
            r3 = r4
        L33:
            r2.recycle()
            return r3
    }

    @Override // p072e7.InterfaceC1775w6
    /* renamed from: Y0 */
    public final p052d6.InterfaceC1323o mo4479Y0(p408x6.InterfaceC6957a r2, p408x6.InterfaceC6957a r3, p408x6.InterfaceC6957a r4) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            p072e7.C1632i.m4227d(r0, r2)
            p072e7.C1632i.m4227d(r0, r3)
            p072e7.C1632i.m4227d(r0, r4)
            r2 = 5
            android.os.Parcel r2 = r1.m3836m2(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            int r4 = p052d6.AbstractBinderC1321n.f6847a
            if (r3 != 0) goto L1c
            r3 = 0
            goto L30
        L1c:
            java.lang.String r4 = "com.google.android.gms.cast.framework.IReconnectionService"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof p052d6.InterfaceC1323o
            if (r0 == 0) goto L2a
            r3 = r4
            d6.o r3 = (p052d6.InterfaceC1323o) r3
            goto L30
        L2a:
            d6.m r4 = new d6.m
            r4.<init>(r3)
            r3 = r4
        L30:
            r2.recycle()
            return r3
    }

    @Override // p072e7.InterfaceC1775w6
    /* renamed from: c2 */
    public final p090f6.InterfaceC2072g mo4480c2(p408x6.InterfaceC6957a r1, p090f6.InterfaceC2073h r2, int r3, int r4, boolean r5, long r6, int r8, int r9, int r10) {
            r0 = this;
            android.os.Parcel r5 = r0.m3834k2()
            p072e7.C1632i.m4227d(r5, r1)
            p072e7.C1632i.m4227d(r5, r2)
            r5.writeInt(r3)
            r5.writeInt(r4)
            r1 = 0
            r5.writeInt(r1)
            r1 = 2097152(0x200000, double:1.036131E-317)
            r5.writeLong(r1)
            r1 = 5
            r5.writeInt(r1)
            r1 = 333(0x14d, float:4.67E-43)
            r5.writeInt(r1)
            r1 = 10000(0x2710, float:1.4013E-41)
            r5.writeInt(r1)
            r1 = 6
            android.os.Parcel r1 = r0.m3836m2(r1, r5)
            android.os.IBinder r2 = r1.readStrongBinder()
            int r3 = p090f6.AbstractBinderC2071f.f9476a
            if (r2 != 0) goto L37
            r2 = 0
            goto L4b
        L37:
            java.lang.String r3 = "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof p090f6.InterfaceC2072g
            if (r4 == 0) goto L45
            r2 = r3
            f6.g r2 = (p090f6.InterfaceC2072g) r2
            goto L4b
        L45:
            f6.e r3 = new f6.e
            r3.<init>(r2)
            r2 = r3
        L4b:
            r1.recycle()
            return r2
    }

    @Override // p072e7.InterfaceC1775w6
    /* renamed from: h1 */
    public final p052d6.InterfaceC1330r0 mo4481h1(p052d6.C1297b r2, p408x6.InterfaceC6957a r3, p052d6.InterfaceC1318l0 r4) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            p072e7.C1632i.m4225b(r0, r2)
            p072e7.C1632i.m4227d(r0, r3)
            p072e7.C1632i.m4227d(r0, r4)
            r2 = 3
            android.os.Parcel r2 = r1.m3836m2(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            int r4 = p052d6.AbstractBinderC1328q0.f6850a
            if (r3 != 0) goto L1c
            r3 = 0
            goto L30
        L1c:
            java.lang.String r4 = "com.google.android.gms.cast.framework.ICastSession"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof p052d6.InterfaceC1330r0
            if (r0 == 0) goto L2a
            r3 = r4
            d6.r0 r3 = (p052d6.InterfaceC1330r0) r3
            goto L30
        L2a:
            d6.p0 r4 = new d6.p0
            r4.<init>(r3)
            r3 = r4
        L30:
            r2.recycle()
            return r3
    }

    @Override // p072e7.InterfaceC1775w6
    /* renamed from: v1 */
    public final p052d6.InterfaceC1329r mo4482v1(java.lang.String r2, java.lang.String r3, p052d6.InterfaceC1336x r4) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            r0.writeString(r2)
            r0.writeString(r3)
            p072e7.C1632i.m4227d(r0, r4)
            r2 = 2
            android.os.Parcel r2 = r1.m3836m2(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            int r4 = p052d6.AbstractBinderC1327q.f6849a
            if (r3 != 0) goto L1c
            r3 = 0
            goto L30
        L1c:
            java.lang.String r4 = "com.google.android.gms.cast.framework.ISession"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof p052d6.InterfaceC1329r
            if (r0 == 0) goto L2a
            r3 = r4
            d6.r r3 = (p052d6.InterfaceC1329r) r3
            goto L30
        L2a:
            d6.p r4 = new d6.p
            r4.<init>(r3)
            r3 = r4
        L30:
            r2.recycle()
            return r3
    }
}
