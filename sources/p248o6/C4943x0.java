package p248o6;

/* renamed from: o6.x0 */
/* loaded from: classes.dex */
public final class C4943x0 extends p053d7.C1340b implements p248o6.InterfaceC4941w0 {
    public C4943x0(android.os.IBinder r3) {
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.IGoogleCertificatesApi"
            r1 = 2
            r2.<init>(r3, r0, r1)
            return
    }

    @Override // p248o6.InterfaceC4941w0
    /* renamed from: M0 */
    public final p184k6.C3719v mo11082M0(p184k6.C3717t r2) {
            r1 = this;
            android.os.Parcel r0 = r1.m3839v()
            p110g7.C2296b.m6063c(r0, r2)
            r2 = 6
            android.os.Parcel r2 = r1.m3835l2(r2, r0)
            android.os.Parcelable$Creator<k6.v> r0 = p184k6.C3719v.CREATOR
            android.os.Parcelable r0 = p110g7.C2296b.m6061a(r2, r0)
            k6.v r0 = (p184k6.C3719v) r0
            r2.recycle()
            return r0
    }

    @Override // p248o6.InterfaceC4941w0
    /* renamed from: a */
    public final boolean mo11083a() {
            r2 = this;
            android.os.Parcel r0 = r2.m3839v()
            r1 = 7
            android.os.Parcel r0 = r2.m3835l2(r1, r0)
            int r1 = p110g7.C2296b.f10516a
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

    @Override // p248o6.InterfaceC4941w0
    /* renamed from: c0 */
    public final boolean mo11084c0(p184k6.C3723z r2, p408x6.InterfaceC6957a r3) {
            r1 = this;
            android.os.Parcel r0 = r1.m3839v()
            p110g7.C2296b.m6063c(r0, r2)
            p110g7.C2296b.m6062b(r0, r3)
            r2 = 5
            android.os.Parcel r2 = r1.m3835l2(r2, r0)
            int r3 = r2.readInt()
            if (r3 == 0) goto L17
            r3 = 1
            goto L18
        L17:
            r3 = 0
        L18:
            r2.recycle()
            return r3
    }
}
