package p375v9;

/* renamed from: v9.y */
/* loaded from: classes.dex */
public class C6627y extends p375v9.AbstractC6590c {
    public static final android.os.Parcelable.Creator<p375v9.C6627y> CREATOR = null;

    /* renamed from: Y */
    public java.lang.String f25809Y;

    /* renamed from: Z */
    public java.lang.String f25810Z;

    static {
            v9.f0 r0 = new v9.f0
            r0.<init>()
            p375v9.C6627y.CREATOR = r0
            return
    }

    public C6627y(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r1.f25809Y = r2
            com.google.android.gms.common.internal.C1101a.m3100e(r3)
            r1.f25810Z = r3
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            r0 = 1
            java.lang.String r1 = r3.f25809Y
            r2 = 0
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            r0 = 2
            java.lang.String r1 = r3.f25810Z
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
