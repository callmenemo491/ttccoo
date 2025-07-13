package p124h7;

/* renamed from: h7.ha */
/* loaded from: classes.dex */
public final class C2658ha extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p124h7.C2658ha> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f11576Y;

    /* renamed from: Z */
    public final java.lang.String f11577Z;

    /* renamed from: a0 */
    public final java.lang.String f11578a0;

    /* renamed from: b0 */
    public final long f11579b0;

    /* renamed from: c0 */
    public final boolean f11580c0;

    /* renamed from: d0 */
    public final boolean f11581d0;

    /* renamed from: e0 */
    public final java.lang.String f11582e0;

    /* renamed from: f0 */
    public final java.lang.String f11583f0;

    /* renamed from: g0 */
    public final boolean f11584g0;

    static {
            h7.ia r0 = new h7.ia
            r0.<init>()
            p124h7.C2658ha.CREATOR = r0
            return
    }

    public C2658ha(java.lang.String r1, java.lang.String r2, java.lang.String r3, long r4, boolean r6, boolean r7, java.lang.String r8, java.lang.String r9, boolean r10) {
            r0 = this;
            r0.<init>()
            r0.f11576Y = r1
            r0.f11577Z = r2
            r0.f11578a0 = r3
            r0.f11579b0 = r4
            r0.f11580c0 = r6
            r0.f11581d0 = r7
            r0.f11582e0 = r8
            r0.f11583f0 = r9
            r0.f11584g0 = r10
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            r7 = 20293(0x4f45, float:2.8437E-41)
            int r7 = p270p6.C5369c.m11723k(r6, r7)
            r0 = 1
            java.lang.String r1 = r5.f11576Y
            r2 = 0
            p270p6.C5369c.m11719g(r6, r0, r1, r2)
            r0 = 2
            java.lang.String r1 = r5.f11577Z
            p270p6.C5369c.m11719g(r6, r0, r1, r2)
            r0 = 3
            java.lang.String r1 = r5.f11578a0
            p270p6.C5369c.m11719g(r6, r0, r1, r2)
            long r0 = r5.f11579b0
            r3 = 4
            r4 = 8
            p270p6.C5369c.m11724l(r6, r3, r4)
            r6.writeLong(r0)
            r0 = 5
            boolean r1 = r5.f11580c0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            r0 = 6
            boolean r1 = r5.f11581d0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            r0 = 7
            java.lang.String r1 = r5.f11582e0
            p270p6.C5369c.m11719g(r6, r0, r1, r2)
            java.lang.String r0 = r5.f11583f0
            p270p6.C5369c.m11719g(r6, r4, r0, r2)
            r0 = 9
            boolean r1 = r5.f11584g0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            p270p6.C5369c.m11726n(r6, r7)
            return
    }
}
