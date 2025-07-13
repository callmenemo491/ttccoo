package p071e6;

/* renamed from: e6.d */
/* loaded from: classes.dex */
public class C1527d extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p071e6.C1527d> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f7404Y;

    /* renamed from: Z */
    public final int f7405Z;

    /* renamed from: a0 */
    public final java.lang.String f7406a0;

    static {
            e6.e0 r0 = new e6.e0
            r0.<init>()
            p071e6.C1527d.CREATOR = r0
            return
    }

    public C1527d(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.f7404Y = r1
            r0.f7405Z = r2
            r0.f7406a0 = r3
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r5, int r6) {
            r4 = this;
            r6 = 20293(0x4f45, float:2.8437E-41)
            int r6 = p270p6.C5369c.m11723k(r5, r6)
            java.lang.String r0 = r4.f7404Y
            r1 = 2
            r2 = 0
            p270p6.C5369c.m11719g(r5, r1, r0, r2)
            int r0 = r4.f7405Z
            r1 = 3
            r3 = 4
            p270p6.C5369c.m11724l(r5, r1, r3)
            r5.writeInt(r0)
            java.lang.String r0 = r4.f7406a0
            p270p6.C5369c.m11719g(r5, r3, r0, r2)
            p270p6.C5369c.m11726n(r5, r6)
            return
    }
}
