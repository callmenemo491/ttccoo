package p248o6;

/* renamed from: o6.b0 */
/* loaded from: classes.dex */
public final class C4898b0 extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p248o6.C4898b0> CREATOR = null;

    /* renamed from: Y */
    public final int f19409Y;

    /* renamed from: Z */
    public final int f19410Z;

    /* renamed from: a0 */
    public final int f19411a0;

    /* renamed from: b0 */
    public final long f19412b0;

    /* renamed from: c0 */
    public final long f19413c0;

    static {
            o6.a0 r0 = new o6.a0
            r0.<init>()
            p248o6.C4898b0.CREATOR = r0
            return
    }

    public C4898b0(int r1, int r2, int r3, long r4, long r6) {
            r0 = this;
            r0.<init>()
            r0.f19409Y = r1
            r0.f19410Z = r2
            r0.f19411a0 = r3
            r0.f19412b0 = r4
            r0.f19413c0 = r6
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r6 = 20293(0x4f45, float:2.8437E-41)
            int r6 = p270p6.C5369c.m11723k(r5, r6)
            r0 = 1
            int r1 = r4.f19409Y
            r2 = 4
            p270p6.C5369c.m11724l(r5, r0, r2)
            r5.writeInt(r1)
            r0 = 2
            int r1 = r4.f19410Z
            p270p6.C5369c.m11724l(r5, r0, r2)
            r5.writeInt(r1)
            r0 = 3
            int r1 = r4.f19411a0
            p270p6.C5369c.m11724l(r5, r0, r2)
            r5.writeInt(r1)
            long r0 = r4.f19412b0
            r3 = 8
            p270p6.C5369c.m11724l(r5, r2, r3)
            r5.writeLong(r0)
            r0 = 5
            long r1 = r4.f19413c0
            p270p6.C5369c.m11724l(r5, r0, r3)
            r5.writeLong(r1)
            p270p6.C5369c.m11726n(r5, r6)
            return
    }
}
