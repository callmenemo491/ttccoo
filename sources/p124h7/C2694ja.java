package p124h7;

/* renamed from: h7.ja */
/* loaded from: classes.dex */
public final class C2694ja extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p124h7.C2694ja> CREATOR = null;

    /* renamed from: Y */
    public final p375v9.C6625w f11671Y;

    /* renamed from: Z */
    public final java.lang.String f11672Z;

    /* renamed from: a0 */
    public final java.lang.String f11673a0;

    /* renamed from: b0 */
    public final long f11674b0;

    /* renamed from: c0 */
    public final boolean f11675c0;

    /* renamed from: d0 */
    public final boolean f11676d0;

    /* renamed from: e0 */
    public final java.lang.String f11677e0;

    /* renamed from: f0 */
    public final java.lang.String f11678f0;

    /* renamed from: g0 */
    public final boolean f11679g0;

    static {
            h7.ka r0 = new h7.ka
            r0.<init>()
            p124h7.C2694ja.CREATOR = r0
            return
    }

    public C2694ja(p375v9.C6625w r1, java.lang.String r2, java.lang.String r3, long r4, boolean r6, boolean r7, java.lang.String r8, java.lang.String r9, boolean r10) {
            r0 = this;
            r0.<init>()
            r0.f11671Y = r1
            r0.f11672Z = r2
            r0.f11673a0 = r3
            r0.f11674b0 = r4
            r0.f11675c0 = r6
            r0.f11676d0 = r7
            r0.f11677e0 = r8
            r0.f11678f0 = r9
            r0.f11679g0 = r10
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r6, r0)
            r1 = 1
            v9.w r2 = r5.f11671Y
            r3 = 0
            p270p6.C5369c.m11718f(r6, r1, r2, r7, r3)
            r7 = 2
            java.lang.String r1 = r5.f11672Z
            p270p6.C5369c.m11719g(r6, r7, r1, r3)
            r7 = 3
            java.lang.String r1 = r5.f11673a0
            p270p6.C5369c.m11719g(r6, r7, r1, r3)
            long r1 = r5.f11674b0
            r7 = 4
            r4 = 8
            p270p6.C5369c.m11724l(r6, r7, r4)
            r6.writeLong(r1)
            r1 = 5
            boolean r2 = r5.f11675c0
            p270p6.C5369c.m11724l(r6, r1, r7)
            r6.writeInt(r2)
            r1 = 6
            boolean r2 = r5.f11676d0
            p270p6.C5369c.m11724l(r6, r1, r7)
            r6.writeInt(r2)
            r1 = 7
            java.lang.String r2 = r5.f11677e0
            p270p6.C5369c.m11719g(r6, r1, r2, r3)
            java.lang.String r1 = r5.f11678f0
            p270p6.C5369c.m11719g(r6, r4, r1, r3)
            r1 = 9
            boolean r2 = r5.f11679g0
            p270p6.C5369c.m11724l(r6, r1, r7)
            r6.writeInt(r2)
            p270p6.C5369c.m11726n(r6, r0)
            return
    }
}
