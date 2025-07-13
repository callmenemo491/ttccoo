package p052d6;

/* renamed from: d6.s */
/* loaded from: classes.dex */
public final class C1331s extends p053d7.C1340b implements p052d6.InterfaceC1332t {
    public C1331s(android.os.IBinder r3) {
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.cast.framework.ISessionManager"
            r1 = 1
            r2.<init>(r3, r0, r1)
            return
    }

    @Override // p052d6.InterfaceC1332t
    /* renamed from: e */
    public final p408x6.InterfaceC6957a mo3829e() {
            r2 = this;
            android.os.Parcel r0 = r2.m3834k2()
            r1 = 7
            android.os.Parcel r0 = r2.m3836m2(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            x6.a r1 = p408x6.InterfaceC6957a.a.m14123x(r1)
            r0.recycle()
            return r1
    }

    @Override // p052d6.InterfaceC1332t
    /* renamed from: h */
    public final p408x6.InterfaceC6957a mo3830h() {
            r2 = this;
            android.os.Parcel r0 = r2.m3834k2()
            r1 = 1
            android.os.Parcel r0 = r2.m3836m2(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            x6.a r1 = p408x6.InterfaceC6957a.a.m14123x(r1)
            r0.recycle()
            return r1
    }

    @Override // p052d6.InterfaceC1332t
    /* renamed from: n0 */
    public final void mo3831n0(p052d6.InterfaceC1334v r2) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            p072e7.C1632i.m4227d(r0, r2)
            r2 = 2
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p052d6.InterfaceC1332t
    /* renamed from: s0 */
    public final void mo3832s0(boolean r2, boolean r3) {
            r1 = this;
            android.os.Parcel r2 = r1.m3834k2()
            int r0 = p072e7.C1632i.f7582a
            r0 = 1
            r2.writeInt(r0)
            r2.writeInt(r3)
            r3 = 6
            r1.m3837n2(r3, r2)
            return
    }
}
