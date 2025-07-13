package p287q7;

/* renamed from: q7.l */
/* loaded from: classes.dex */
public final class C5594l extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p287q7.C5594l> CREATOR = null;

    /* renamed from: Y */
    public final int f21740Y;

    /* renamed from: Z */
    public final p184k6.C3698b f21741Z;

    /* renamed from: a0 */
    public final p248o6.C4903d0 f21742a0;

    static {
            q7.n r0 = new q7.n
            r0.<init>()
            p287q7.C5594l.CREATOR = r0
            return
    }

    public C5594l() {
            r3 = this;
            k6.b r0 = new k6.b
            r1 = 8
            r2 = 0
            r0.<init>(r1, r2)
            r3.<init>()
            r1 = 1
            r3.f21740Y = r1
            r3.f21741Z = r0
            r3.f21742a0 = r2
            return
    }

    public C5594l(int r1, p184k6.C3698b r2, p248o6.C4903d0 r3) {
            r0 = this;
            r0.<init>()
            r0.f21740Y = r1
            r0.f21741Z = r2
            r0.f21742a0 = r3
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r5, r0)
            r1 = 1
            int r2 = r4.f21740Y
            r3 = 4
            p270p6.C5369c.m11724l(r5, r1, r3)
            r5.writeInt(r2)
            r1 = 2
            k6.b r2 = r4.f21741Z
            r3 = 0
            p270p6.C5369c.m11718f(r5, r1, r2, r6, r3)
            r1 = 3
            o6.d0 r2 = r4.f21742a0
            p270p6.C5369c.m11718f(r5, r1, r2, r6, r3)
            p270p6.C5369c.m11726n(r5, r0)
            return
    }
}
