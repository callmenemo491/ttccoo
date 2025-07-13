package p052d6;

/* renamed from: d6.m0 */
/* loaded from: classes.dex */
public final class C1320m0 extends p053d7.C1340b implements p052d6.InterfaceC1324o0 {
    public C1320m0(android.os.IBinder r3) {
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.cast.framework.ICastContext"
            r1 = 1
            r2.<init>(r3, r0, r1)
            return
    }

    @Override // p052d6.InterfaceC1324o0
    /* renamed from: e */
    public final p052d6.InterfaceC1332t mo3812e() {
            r4 = this;
            android.os.Parcel r0 = r4.m3834k2()
            r1 = 5
            android.os.Parcel r0 = r4.m3836m2(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L11
            r1 = 0
            goto L25
        L11:
            java.lang.String r2 = "com.google.android.gms.cast.framework.ISessionManager"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof p052d6.InterfaceC1332t
            if (r3 == 0) goto L1f
            r1 = r2
            d6.t r1 = (p052d6.InterfaceC1332t) r1
            goto L25
        L1f:
            d6.s r2 = new d6.s
            r2.<init>(r1)
            r1 = r2
        L25:
            r0.recycle()
            return r1
    }

    @Override // p052d6.InterfaceC1324o0
    /* renamed from: h */
    public final p052d6.InterfaceC1317l mo3813h() {
            r4 = this;
            android.os.Parcel r0 = r4.m3834k2()
            r1 = 6
            android.os.Parcel r0 = r4.m3836m2(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L11
            r1 = 0
            goto L25
        L11:
            java.lang.String r2 = "com.google.android.gms.cast.framework.IDiscoveryManager"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof p052d6.InterfaceC1317l
            if (r3 == 0) goto L1f
            r1 = r2
            d6.l r1 = (p052d6.InterfaceC1317l) r1
            goto L25
        L1f:
            d6.k r2 = new d6.k
            r2.<init>(r1)
            r1 = r2
        L25:
            r0.recycle()
            return r1
    }

    @Override // p052d6.InterfaceC1324o0
    /* renamed from: i */
    public final boolean mo3814i() {
            r2 = this;
            android.os.Parcel r0 = r2.m3834k2()
            r1 = 12
            android.os.Parcel r0 = r2.m3836m2(r1, r0)
            int r1 = p072e7.C1632i.f7582a
            int r1 = r0.readInt()
            if (r1 == 0) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            r0.recycle()
            return r1
    }
}
