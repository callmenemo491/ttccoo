package p248o6;

/* renamed from: o6.q */
/* loaded from: classes.dex */
public class C4928q extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p248o6.C4928q> CREATOR = null;

    /* renamed from: Y */
    public final int f19533Y;

    /* renamed from: Z */
    public final boolean f19534Z;

    /* renamed from: a0 */
    public final boolean f19535a0;

    /* renamed from: b0 */
    public final int f19536b0;

    /* renamed from: c0 */
    public final int f19537c0;

    static {
            o6.z0 r0 = new o6.z0
            r0.<init>()
            p248o6.C4928q.CREATOR = r0
            return
    }

    public C4928q(int r1, boolean r2, boolean r3, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.f19533Y = r1
            r0.f19534Z = r2
            r0.f19535a0 = r3
            r0.f19536b0 = r4
            r0.f19537c0 = r5
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            int r0 = r3.f19533Y
            r1 = 1
            r2 = 4
            p270p6.C5369c.m11724l(r4, r1, r2)
            r4.writeInt(r0)
            boolean r0 = r3.f19534Z
            r1 = 2
            p270p6.C5369c.m11724l(r4, r1, r2)
            r4.writeInt(r0)
            boolean r0 = r3.f19535a0
            r1 = 3
            p270p6.C5369c.m11724l(r4, r1, r2)
            r4.writeInt(r0)
            int r0 = r3.f19536b0
            p270p6.C5369c.m11724l(r4, r2, r2)
            r4.writeInt(r0)
            int r0 = r3.f19537c0
            r1 = 5
            p270p6.C5369c.m11724l(r4, r1, r2)
            r4.writeInt(r0)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
