package p071e6;

/* renamed from: e6.b */
/* loaded from: classes.dex */
public class C1523b extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p071e6.C1523b> CREATOR = null;

    /* renamed from: Y */
    public final int f7397Y;

    /* renamed from: Z */
    public final int f7398Z;

    /* renamed from: a0 */
    public final int f7399a0;

    static {
            e6.w r0 = new e6.w
            r0.<init>()
            p071e6.C1523b.CREATOR = r0
            return
    }

    public C1523b(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f7397Y = r1
            r0.f7398Z = r2
            r0.f7399a0 = r3
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            r0 = 2
            int r1 = r3.f7397Y
            r2 = 4
            p270p6.C5369c.m11724l(r4, r0, r2)
            r4.writeInt(r1)
            r0 = 3
            int r1 = r3.f7398Z
            p270p6.C5369c.m11724l(r4, r0, r2)
            r4.writeInt(r1)
            int r0 = r3.f7399a0
            p270p6.C5369c.m11724l(r4, r2, r2)
            r4.writeInt(r0)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
