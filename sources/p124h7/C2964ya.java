package p124h7;

/* renamed from: h7.ya */
/* loaded from: classes.dex */
public final class C2964ya extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p124h7.C2964ya> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f12035Y;

    /* renamed from: Z */
    public final java.util.List<p124h7.C2788oe> f12036Z;

    /* renamed from: a0 */
    public final p375v9.C6605j0 f12037a0;

    static {
            h7.za r0 = new h7.za
            r0.<init>()
            p124h7.C2964ya.CREATOR = r0
            return
    }

    public C2964ya(java.lang.String r1, java.util.List<p124h7.C2788oe> r2, p375v9.C6605j0 r3) {
            r0 = this;
            r0.<init>()
            r0.f12035Y = r1
            r0.f12036Z = r2
            r0.f12037a0 = r3
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r5, r0)
            r1 = 1
            java.lang.String r2 = r4.f12035Y
            r3 = 0
            p270p6.C5369c.m11719g(r5, r1, r2, r3)
            r1 = 2
            java.util.List<h7.oe> r2 = r4.f12036Z
            p270p6.C5369c.m11722j(r5, r1, r2, r3)
            r1 = 3
            v9.j0 r2 = r4.f12037a0
            p270p6.C5369c.m11718f(r5, r1, r2, r6, r3)
            p270p6.C5369c.m11726n(r5, r0)
            return
    }
}
