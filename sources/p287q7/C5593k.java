package p287q7;

/* renamed from: q7.k */
/* loaded from: classes.dex */
public final class C5593k extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p287q7.C5593k> CREATOR = null;

    /* renamed from: Y */
    public final int f21738Y;

    /* renamed from: Z */
    public final p248o6.C4901c0 f21739Z;

    static {
            q7.m r0 = new q7.m
            r0.<init>()
            p287q7.C5593k.CREATOR = r0
            return
    }

    public C5593k(int r1, p248o6.C4901c0 r2) {
            r0 = this;
            r0.<init>()
            r0.f21738Y = r1
            r0.f21739Z = r2
            return
    }

    public C5593k(p248o6.C4901c0 r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f21738Y = r0
            r1.f21739Z = r2
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r5, r0)
            r1 = 1
            int r2 = r4.f21738Y
            r3 = 4
            p270p6.C5369c.m11724l(r5, r1, r3)
            r5.writeInt(r2)
            r1 = 2
            o6.c0 r2 = r4.f21739Z
            r3 = 0
            p270p6.C5369c.m11718f(r5, r1, r2, r6, r3)
            p270p6.C5369c.m11726n(r5, r0)
            return
    }
}
