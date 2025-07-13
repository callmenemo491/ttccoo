package p185k7;

/* renamed from: k7.e0 */
/* loaded from: classes.dex */
public final class C3781e0 extends p053d7.C1340b implements p185k7.InterfaceC3809g0 {
    public C3781e0(android.os.IBinder r3) {
            r2 = this;
            java.lang.String r0 = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService"
            r1 = 4
            r2.<init>(r3, r0, r1)
            return
    }

    @Override // p185k7.InterfaceC3809g0
    /* renamed from: D */
    public final android.os.Bundle mo8507D(android.os.Bundle r2) {
            r1 = this;
            android.os.Parcel r0 = r1.m3834k2()
            p185k7.C3767d0.m8367b(r0, r2)
            r2 = 1
            android.os.Parcel r2 = r1.m3836m2(r2, r0)
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = p185k7.C3767d0.m8366a(r2, r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r2.recycle()
            return r0
    }
}
