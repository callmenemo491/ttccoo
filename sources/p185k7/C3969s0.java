package p185k7;

/* renamed from: k7.s0 */
/* loaded from: classes.dex */
public final class C3969s0 extends p053d7.C1340b implements p185k7.InterfaceC3995u0 {
    public C3969s0(android.os.IBinder r3) {
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.measurement.api.internal.IEventHandlerProxy"
            r1 = 4
            r2.<init>(r3, r0, r1)
            return
    }

    @Override // p185k7.InterfaceC3995u0
    /* renamed from: U */
    public final void mo8752U(java.lang.String r2, java.lang.String r3, android.os.Bundle r4, long r5) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            r0.writeString(r2)
            r0.writeString(r3)
            p185k7.C3767d0.m8367b(r0, r4)
            r0.writeLong(r5)
            r2 = 1
            r1.m3837n2(r2, r0)
            return
    }

    @Override // p185k7.InterfaceC3995u0
    /* renamed from: f */
    public final int mo8753f() {
            r2 = this;
            android.os.Parcel r0 = r2.m3834k2()
            r1 = 2
            android.os.Parcel r0 = r2.m3836m2(r1, r0)
            int r1 = r0.readInt()
            r0.recycle()
            return r1
    }
}
