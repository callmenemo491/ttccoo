package p124h7;

/* renamed from: h7.i9 */
/* loaded from: classes.dex */
public final class C2675i9 extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p124h7.C2675i9> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f11625Y;

    /* renamed from: Z */
    public final p375v9.C6624v f11626Z;

    static {
            h7.j9 r0 = new h7.j9
            r0.<init>()
            p124h7.C2675i9.CREATOR = r0
            return
    }

    public C2675i9(java.lang.String r1, p375v9.C6624v r2) {
            r0 = this;
            r0.<init>()
            r0.f11625Y = r1
            r0.f11626Z = r2
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r5, r0)
            r1 = 1
            java.lang.String r2 = r4.f11625Y
            r3 = 0
            p270p6.C5369c.m11719g(r5, r1, r2, r3)
            r1 = 2
            v9.v r2 = r4.f11626Z
            p270p6.C5369c.m11718f(r5, r1, r2, r6, r3)
            p270p6.C5369c.m11726n(r5, r0)
            return
    }
}
