package p248o6;

/* renamed from: o6.r */
/* loaded from: classes.dex */
public final class C4930r extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p248o6.C4930r> CREATOR = null;

    /* renamed from: Y */
    public final int f19541Y;

    /* renamed from: Z */
    public java.util.List<p248o6.C4898b0> f19542Z;

    static {
            o6.t r0 = new o6.t
            r0.<init>()
            p248o6.C4930r.CREATOR = r0
            return
    }

    public C4930r(int r1, java.util.List<p248o6.C4898b0> r2) {
            r0 = this;
            r0.<init>()
            r0.f19541Y = r1
            r0.f19542Z = r2
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            r0 = 1
            int r1 = r3.f19541Y
            r2 = 4
            p270p6.C5369c.m11724l(r4, r0, r2)
            r4.writeInt(r1)
            r0 = 2
            java.util.List<o6.b0> r1 = r3.f19542Z
            r2 = 0
            p270p6.C5369c.m11722j(r4, r0, r1, r2)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
