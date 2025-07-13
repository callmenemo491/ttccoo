package p052d6;

/* renamed from: d6.p */
/* loaded from: classes.dex */
public final class C1325p extends p053d7.C1340b implements p052d6.InterfaceC1329r {
    public C1325p(android.os.IBinder r3) {
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.cast.framework.ISession"
            r1 = 1
            r2.<init>(r3, r0, r1)
            return
    }

    @Override // p052d6.InterfaceC1329r
    /* renamed from: B */
    public final void mo3815B(int r2) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            r0.writeInt(r2)
            r2 = 12
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p052d6.InterfaceC1329r
    /* renamed from: I */
    public final boolean mo3816I() {
            r2 = this;
            android.os.Parcel r0 = r2.m3834k2()
            r1 = 9
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

    @Override // p052d6.InterfaceC1329r
    /* renamed from: Y1 */
    public final void mo3817Y1(int r2) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            r0.writeInt(r2)
            r2 = 13
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p052d6.InterfaceC1329r
    /* renamed from: d */
    public final int mo3818d() {
            r2 = this;
            android.os.Parcel r0 = r2.m3834k2()
            r1 = 17
            android.os.Parcel r0 = r2.m3836m2(r1, r0)
            int r1 = r0.readInt()
            r0.recycle()
            return r1
    }

    @Override // p052d6.InterfaceC1329r
    /* renamed from: e */
    public final p408x6.InterfaceC6957a mo3819e() {
            r2 = this;
            android.os.Parcel r0 = r2.m3834k2()
            r1 = 1
            android.os.Parcel r0 = r2.m3836m2(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            x6.a r1 = p408x6.InterfaceC6957a.a.m14123x(r1)
            r0.recycle()
            return r1
    }

    @Override // p052d6.InterfaceC1329r
    /* renamed from: h */
    public final int mo3820h() {
            r2 = this;
            android.os.Parcel r0 = r2.m3834k2()
            r1 = 18
            android.os.Parcel r0 = r2.m3836m2(r1, r0)
            int r1 = r0.readInt()
            r0.recycle()
            return r1
    }

    @Override // p052d6.InterfaceC1329r
    /* renamed from: l */
    public final boolean mo3821l() {
            r2 = this;
            android.os.Parcel r0 = r2.m3834k2()
            r1 = 5
            android.os.Parcel r0 = r2.m3836m2(r1, r0)
            int r1 = p072e7.C1632i.f7582a
            int r1 = r0.readInt()
            if (r1 == 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            r0.recycle()
            return r1
    }

    @Override // p052d6.InterfaceC1329r
    /* renamed from: w */
    public final void mo3822w(int r2) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            r0.writeInt(r2)
            r2 = 15
            r1.m3837n2(r2, r0)
            return
    }
}
