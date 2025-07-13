package p124h7;

/* renamed from: h7.z9 */
/* loaded from: classes.dex */
public final class C2981z9 extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p124h7.C2981z9> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f12062Y;

    /* renamed from: Z */
    public final java.lang.String f12063Z;

    static {
            h7.aa r0 = new h7.aa
            r0.<init>()
            p124h7.C2981z9.CREATOR = r0
            return
    }

    public C2981z9(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f12062Y = r1
            r0.f12063Z = r2
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            r0 = 1
            java.lang.String r1 = r3.f12062Y
            r2 = 0
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            r0 = 2
            java.lang.String r1 = r3.f12063Z
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
