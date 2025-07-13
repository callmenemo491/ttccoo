package p248o6;

/* renamed from: o6.s0 */
/* loaded from: classes.dex */
public final class C4933s0 extends p053d7.C1340b implements p248o6.InterfaceC4931r0 {
    public C4933s0(android.os.IBinder r3) {
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.ICertData"
            r1 = 2
            r2.<init>(r3, r0, r1)
            return
    }

    @Override // p248o6.InterfaceC4931r0
    /* renamed from: b */
    public final p408x6.InterfaceC6957a mo8176b() {
            r2 = this;
            android.os.Parcel r0 = r2.m3839v()
            r1 = 1
            android.os.Parcel r0 = r2.m3835l2(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            x6.a r1 = p408x6.InterfaceC6957a.a.m14123x(r1)
            r0.recycle()
            return r1
    }

    @Override // p248o6.InterfaceC4931r0
    /* renamed from: c */
    public final int mo8177c() {
            r2 = this;
            android.os.Parcel r0 = r2.m3839v()
            r1 = 2
            android.os.Parcel r0 = r2.m3835l2(r1, r0)
            int r1 = r0.readInt()
            r0.recycle()
            return r1
    }
}
