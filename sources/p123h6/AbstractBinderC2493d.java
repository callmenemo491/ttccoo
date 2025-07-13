package p123h6;

/* renamed from: h6.d */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2493d extends p072e7.BinderC1622h {
    public AbstractBinderC2493d() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.cast.internal.IBundleCallback"
            r1.<init>(r0)
            return
    }

    @Override // p072e7.BinderC1622h
    /* renamed from: v */
    public final boolean mo3764v(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
            r0 = this;
            r3 = 1
            if (r1 != r3) goto L2c
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = p072e7.C1632i.m4224a(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r2 = r0
            h6.v r2 = (p123h6.BinderC2515v) r2
            int r4 = r2.f11338a
            switch(r4) {
                case 0: goto L1c;
                case 1: goto L14;
                default: goto L13;
            }
        L13:
            goto L24
        L14:
            s7.j r2 = r2.f11339b
            s7.q<TResult> r2 = r2.f23075a
            r2.m12473r(r1)
            goto L2b
        L1c:
            s7.j r2 = r2.f11339b
            s7.q<TResult> r2 = r2.f23075a
            r2.m12473r(r1)
            goto L2b
        L24:
            s7.j r2 = r2.f11339b
            s7.q<TResult> r2 = r2.f23075a
            r2.m12473r(r1)
        L2b:
            return r3
        L2c:
            r1 = 0
            return r1
    }
}
