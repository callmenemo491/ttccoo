package p124h7;

/* renamed from: h7.e9 */
/* loaded from: classes.dex */
public final class C2603e9 extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p124h7.C2603e9> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f11478Y;

    /* renamed from: Z */
    public final java.lang.String f11479Z;

    /* renamed from: a0 */
    public final java.lang.String f11480a0;

    static {
            h7.f9 r0 = new h7.f9
            r0.<init>()
            p124h7.C2603e9.CREATOR = r0
            return
    }

    public C2603e9(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.f11478Y = r1
            r0.f11479Z = r2
            r0.f11480a0 = r3
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            r0 = 1
            java.lang.String r1 = r3.f11478Y
            r2 = 0
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            r0 = 2
            java.lang.String r1 = r3.f11479Z
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            r0 = 3
            java.lang.String r1 = r3.f11480a0
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
