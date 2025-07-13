package p185k7;

/* renamed from: k7.x0 */
/* loaded from: classes.dex */
public final class C4034x0 extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p185k7.C4034x0> CREATOR = null;

    /* renamed from: Y */
    public final long f16936Y;

    /* renamed from: Z */
    public final long f16937Z;

    /* renamed from: a0 */
    public final boolean f16938a0;

    /* renamed from: b0 */
    public final java.lang.String f16939b0;

    /* renamed from: c0 */
    public final java.lang.String f16940c0;

    /* renamed from: d0 */
    public final java.lang.String f16941d0;

    /* renamed from: e0 */
    public final android.os.Bundle f16942e0;

    /* renamed from: f0 */
    public final java.lang.String f16943f0;

    static {
            k7.y0 r0 = new k7.y0
            r0.<init>()
            p185k7.C4034x0.CREATOR = r0
            return
    }

    public C4034x0(long r1, long r3, boolean r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, android.os.Bundle r9, java.lang.String r10) {
            r0 = this;
            r0.<init>()
            r0.f16936Y = r1
            r0.f16937Z = r3
            r0.f16938a0 = r5
            r0.f16939b0 = r6
            r0.f16940c0 = r7
            r0.f16941d0 = r8
            r0.f16942e0 = r9
            r0.f16943f0 = r10
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r6 = 20293(0x4f45, float:2.8437E-41)
            int r6 = p270p6.C5369c.m11723k(r5, r6)
            r0 = 1
            long r1 = r4.f16936Y
            r3 = 8
            p270p6.C5369c.m11724l(r5, r0, r3)
            r5.writeLong(r1)
            r0 = 2
            long r1 = r4.f16937Z
            p270p6.C5369c.m11724l(r5, r0, r3)
            r5.writeLong(r1)
            r0 = 3
            boolean r1 = r4.f16938a0
            r2 = 4
            p270p6.C5369c.m11724l(r5, r0, r2)
            r5.writeInt(r1)
            java.lang.String r0 = r4.f16939b0
            r1 = 0
            p270p6.C5369c.m11719g(r5, r2, r0, r1)
            r0 = 5
            java.lang.String r2 = r4.f16940c0
            p270p6.C5369c.m11719g(r5, r0, r2, r1)
            r0 = 6
            java.lang.String r2 = r4.f16941d0
            p270p6.C5369c.m11719g(r5, r0, r2, r1)
            r0 = 7
            android.os.Bundle r2 = r4.f16942e0
            p270p6.C5369c.m11714b(r5, r0, r2, r1)
            java.lang.String r0 = r4.f16943f0
            p270p6.C5369c.m11719g(r5, r3, r0, r1)
            p270p6.C5369c.m11726n(r5, r6)
            return
    }
}
