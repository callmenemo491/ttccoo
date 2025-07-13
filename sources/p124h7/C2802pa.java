package p124h7;

/* renamed from: h7.pa */
/* loaded from: classes.dex */
public final class C2802pa extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p124h7.C2802pa> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f11831Y;

    /* renamed from: Z */
    public final java.lang.String f11832Z;

    static {
            h7.qa r0 = new h7.qa
            r0.<init>()
            p124h7.C2802pa.CREATOR = r0
            return
    }

    public C2802pa(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f11831Y = r1
            r0.f11832Z = r2
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            r0 = 1
            java.lang.String r1 = r3.f11831Y
            r2 = 0
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            r0 = 2
            java.lang.String r1 = r3.f11832Z
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
