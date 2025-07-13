package p124h7;

/* renamed from: h7.g9 */
/* loaded from: classes.dex */
public final class C2639g9 extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p124h7.C2639g9> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f11540Y;

    /* renamed from: Z */
    public final p124h7.C2681if f11541Z;

    static {
            h7.h9 r0 = new h7.h9
            r0.<init>()
            p124h7.C2639g9.CREATOR = r0
            return
    }

    public C2639g9(java.lang.String r1, p124h7.C2681if r2) {
            r0 = this;
            r0.<init>()
            r0.f11540Y = r1
            r0.f11541Z = r2
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r5, r0)
            r1 = 1
            java.lang.String r2 = r4.f11540Y
            r3 = 0
            p270p6.C5369c.m11719g(r5, r1, r2, r3)
            r1 = 2
            h7.if r2 = r4.f11541Z
            p270p6.C5369c.m11718f(r5, r1, r2, r6, r3)
            p270p6.C5369c.m11726n(r5, r0)
            return
    }
}
