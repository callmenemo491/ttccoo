package p375v9;

/* renamed from: v9.x */
/* loaded from: classes.dex */
public class C6626x extends p375v9.AbstractC6590c {
    public static final android.os.Parcelable.Creator<p375v9.C6626x> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f25808Y;

    static {
            v9.e0 r0 = new v9.e0
            r0.<init>()
            p375v9.C6626x.CREATOR = r0
            return
    }

    public C6626x(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r1.f25808Y = r2
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            r0 = 1
            java.lang.String r1 = r3.f25808Y
            r2 = 0
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
