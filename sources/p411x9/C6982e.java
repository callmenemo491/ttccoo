package p411x9;

/* renamed from: x9.e */
/* loaded from: classes.dex */
public final class C6982e extends p375v9.AbstractC6622t {
    public static final android.os.Parcelable.Creator<p411x9.C6982e> CREATOR = null;

    /* renamed from: Y */
    public final java.util.List<p375v9.C6625w> f27258Y;

    /* renamed from: Z */
    public final p411x9.C6986g f27259Z;

    /* renamed from: a0 */
    public final java.lang.String f27260a0;

    /* renamed from: b0 */
    public final p375v9.C6605j0 f27261b0;

    /* renamed from: c0 */
    public final p411x9.C6985f0 f27262c0;

    static {
            x9.f r0 = new x9.f
            r0.<init>()
            p411x9.C6982e.CREATOR = r0
            return
    }

    public C6982e(java.util.List<p375v9.C6625w> r3, p411x9.C6986g r4, java.lang.String r5, p375v9.C6605j0 r6, p411x9.C6985f0 r7) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f27258Y = r0
            java.util.Iterator r3 = r3.iterator()
        Le:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r3.next()
            v9.s r0 = (p375v9.AbstractC6621s) r0
            boolean r1 = r0 instanceof p375v9.C6625w
            if (r1 == 0) goto Le
            java.util.List<v9.w> r1 = r2.f27258Y
            v9.w r0 = (p375v9.C6625w) r0
            r1.add(r0)
            goto Le
        L26:
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r4, r3)
            r2.f27259Z = r4
            com.google.android.gms.common.internal.C1101a.m3100e(r5)
            r2.f27260a0 = r5
            r2.f27261b0 = r6
            r2.f27262c0 = r7
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r5, r0)
            r1 = 1
            java.util.List<v9.w> r2 = r4.f27258Y
            r3 = 0
            p270p6.C5369c.m11722j(r5, r1, r2, r3)
            r1 = 2
            x9.g r2 = r4.f27259Z
            p270p6.C5369c.m11718f(r5, r1, r2, r6, r3)
            r1 = 3
            java.lang.String r2 = r4.f27260a0
            p270p6.C5369c.m11719g(r5, r1, r2, r3)
            r1 = 4
            v9.j0 r2 = r4.f27261b0
            p270p6.C5369c.m11718f(r5, r1, r2, r6, r3)
            r1 = 5
            x9.f0 r2 = r4.f27262c0
            p270p6.C5369c.m11718f(r5, r1, r2, r6, r3)
            p270p6.C5369c.m11726n(r5, r0)
            return
    }
}
