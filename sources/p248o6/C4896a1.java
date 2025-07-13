package p248o6;

@java.lang.Deprecated
/* renamed from: o6.a1 */
/* loaded from: classes.dex */
public final class C4896a1 extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p248o6.C4896a1> CREATOR = null;

    /* renamed from: Y */
    public final int f19408Y;

    static {
            o6.b1 r0 = new o6.b1
            r0.<init>()
            p248o6.C4896a1.CREATOR = r0
            return
    }

    public C4896a1(int r1) {
            r0 = this;
            r0.<init>()
            r0.f19408Y = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            r0 = 1
            int r1 = r3.f19408Y
            r2 = 4
            p270p6.C5369c.m11724l(r4, r0, r2)
            r4.writeInt(r1)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
