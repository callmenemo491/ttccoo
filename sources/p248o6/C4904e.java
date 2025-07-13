package p248o6;

/* renamed from: o6.e */
/* loaded from: classes.dex */
public class C4904e extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p248o6.C4904e> CREATOR = null;

    /* renamed from: Y */
    public final p248o6.C4928q f19475Y;

    /* renamed from: Z */
    public final boolean f19476Z;

    /* renamed from: a0 */
    public final boolean f19477a0;

    /* renamed from: b0 */
    public final int[] f19478b0;

    /* renamed from: c0 */
    public final int f19479c0;

    static {
            o6.j0 r0 = new o6.j0
            r0.<init>()
            p248o6.C4904e.CREATOR = r0
            return
    }

    public C4904e(@androidx.annotation.RecentlyNonNull p248o6.C4928q r1, boolean r2, boolean r3, int[] r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.f19475Y = r1
            r0.f19476Z = r2
            r0.f19477a0 = r3
            r0.f19478b0 = r4
            r0.f19479c0 = r5
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r5, int r6) {
            r4 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r5, r0)
            o6.q r1 = r4.f19475Y
            r2 = 1
            r3 = 0
            p270p6.C5369c.m11718f(r5, r2, r1, r6, r3)
            boolean r6 = r4.f19476Z
            r1 = 2
            r2 = 4
            p270p6.C5369c.m11724l(r5, r1, r2)
            r5.writeInt(r6)
            boolean r6 = r4.f19477a0
            r1 = 3
            p270p6.C5369c.m11724l(r5, r1, r2)
            r5.writeInt(r6)
            int[] r6 = r4.f19478b0
            if (r6 != 0) goto L25
            goto L2f
        L25:
            int r1 = p270p6.C5369c.m11723k(r5, r2)
            r5.writeIntArray(r6)
            p270p6.C5369c.m11726n(r5, r1)
        L2f:
            r6 = 5
            int r1 = r4.f19479c0
            p270p6.C5369c.m11724l(r5, r6, r2)
            r5.writeInt(r1)
            p270p6.C5369c.m11726n(r5, r0)
            return
    }
}
