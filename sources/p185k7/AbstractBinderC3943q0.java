package p185k7;

/* renamed from: k7.q0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3943q0 extends p185k7.BinderC3753c0 implements p185k7.InterfaceC3956r0 {
    public AbstractBinderC3943q0() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            r1.<init>(r0)
            return
    }

    @Override // p185k7.BinderC3753c0
    /* renamed from: v */
    public final boolean mo8231v(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
            r0 = this;
            r4 = 1
            if (r1 != r4) goto L15
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = p185k7.C3767d0.m8366a(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r2 = r0
            k7.k0 r2 = (p185k7.BinderC3865k0) r2
            r2.mo8749D(r1)
            r3.writeNoException()
            return r4
        L15:
            r1 = 0
            return r1
    }
}
