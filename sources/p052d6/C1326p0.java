package p052d6;

/* renamed from: d6.p0 */
/* loaded from: classes.dex */
public final class C1326p0 extends p053d7.C1340b implements p052d6.InterfaceC1330r0 {
    public C1326p0(android.os.IBinder r3) {
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.cast.framework.ICastSession"
            r1 = 1
            r2.<init>(r3, r0, r1)
            return
    }

    @Override // p052d6.InterfaceC1330r0
    /* renamed from: Q1 */
    public final void mo3823Q1(android.os.Bundle r2) {
            r1 = this;
            android.os.Parcel r2 = r1.m3834k2()
            r0 = 0
            p072e7.C1632i.m4225b(r2, r0)
            r0 = 1
            r1.m3837n2(r0, r2)
            return
    }

    @Override // p052d6.InterfaceC1330r0
    /* renamed from: U1 */
    public final void mo3824U1(boolean r2, int r3) {
            r1 = this;
            android.os.Parcel r3 = r1.m3834k2()
            int r0 = p072e7.C1632i.f7582a
            r3.writeInt(r2)
            r2 = 0
            r3.writeInt(r2)
            r2 = 6
            r1.m3837n2(r2, r3)
            return
    }

    @Override // p052d6.InterfaceC1330r0
    /* renamed from: Y */
    public final void mo3825Y(p184k6.C3698b r2) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            p072e7.C1632i.m4225b(r0, r2)
            r2 = 3
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p052d6.InterfaceC1330r0
    /* renamed from: r0 */
    public final void mo3826r0(p036c6.C0879d r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            p072e7.C1632i.m4225b(r0, r2)
            r0.writeString(r3)
            r0.writeString(r4)
            r0.writeInt(r5)
            r2 = 4
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p052d6.InterfaceC1330r0
    /* renamed from: s */
    public final void mo3827s(int r2) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            r0.writeInt(r2)
            r2 = 5
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p052d6.InterfaceC1330r0
    /* renamed from: w */
    public final void mo3828w(int r2) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            r0.writeInt(r2)
            r2 = 2
            r1.m3837n2(r2, r0)
            return
    }
}
