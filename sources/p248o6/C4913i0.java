package p248o6;

/* renamed from: o6.i0 */
/* loaded from: classes.dex */
public final class C4913i0 extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p248o6.C4913i0> CREATOR = null;

    /* renamed from: Y */
    public android.os.Bundle f19503Y;

    /* renamed from: Z */
    public p184k6.C3701d[] f19504Z;

    /* renamed from: a0 */
    public int f19505a0;

    /* renamed from: b0 */
    public p248o6.C4904e f19506b0;

    static {
            o6.h0 r0 = new o6.h0
            r0.<init>()
            p248o6.C4913i0.CREATOR = r0
            return
    }

    public C4913i0() {
            r0 = this;
            r0.<init>()
            return
    }

    public C4913i0(android.os.Bundle r1, p184k6.C3701d[] r2, int r3, p248o6.C4904e r4) {
            r0 = this;
            r0.<init>()
            r0.f19503Y = r1
            r0.f19504Z = r2
            r0.f19505a0 = r3
            r0.f19506b0 = r4
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r6, r0)
            r1 = 1
            android.os.Bundle r2 = r5.f19503Y
            r3 = 0
            p270p6.C5369c.m11714b(r6, r1, r2, r3)
            r1 = 2
            k6.d[] r2 = r5.f19504Z
            p270p6.C5369c.m11721i(r6, r1, r2, r7, r3)
            r1 = 3
            int r2 = r5.f19505a0
            r4 = 4
            p270p6.C5369c.m11724l(r6, r1, r4)
            r6.writeInt(r2)
            o6.e r1 = r5.f19506b0
            p270p6.C5369c.m11718f(r6, r4, r1, r7, r3)
            p270p6.C5369c.m11726n(r6, r0)
            return
    }
}
