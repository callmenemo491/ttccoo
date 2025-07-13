package p124h7;

/* renamed from: h7.p8 */
/* loaded from: classes.dex */
public final class C2800p8 extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p124h7.C2800p8> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f11828Y;

    /* renamed from: Z */
    public final java.lang.String f11829Z;

    /* renamed from: a0 */
    public final java.lang.String f11830a0;

    static {
            h7.q8 r0 = new h7.q8
            r0.<init>()
            p124h7.C2800p8.CREATOR = r0
            return
    }

    public C2800p8(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.f11828Y = r1
            r0.f11829Z = r2
            r0.f11830a0 = r3
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            r0 = 1
            java.lang.String r1 = r3.f11828Y
            r2 = 0
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            r0 = 2
            java.lang.String r1 = r3.f11829Z
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            r0 = 3
            java.lang.String r1 = r3.f11830a0
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
