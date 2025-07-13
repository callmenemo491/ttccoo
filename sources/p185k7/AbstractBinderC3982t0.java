package p185k7;

/* renamed from: k7.t0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3982t0 extends p185k7.BinderC3753c0 implements p185k7.InterfaceC3995u0 {
    public AbstractBinderC3982t0() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.measurement.api.internal.IEventHandlerProxy"
            r1.<init>(r0)
            return
    }

    @Override // p185k7.BinderC3753c0
    /* renamed from: v */
    public final boolean mo8231v(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
            r6 = this;
            r10 = 1
            if (r7 == r10) goto L16
            r8 = 2
            if (r7 == r8) goto L8
            r7 = 0
            return r7
        L8:
            r7 = r6
            k7.k1 r7 = (p185k7.BinderC3866k1) r7
            int r7 = r7.mo8753f()
            r9.writeNoException()
            r9.writeInt(r7)
            goto L34
        L16:
            java.lang.String r1 = r8.readString()
            java.lang.String r2 = r8.readString()
            android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = p185k7.C3767d0.m8366a(r8, r7)
            r3 = r7
            android.os.Bundle r3 = (android.os.Bundle) r3
            long r4 = r8.readLong()
            r0 = r6
            k7.k1 r0 = (p185k7.BinderC3866k1) r0
            r0.mo8752U(r1, r2, r3, r4)
            r9.writeNoException()
        L34:
            return r10
    }
}
