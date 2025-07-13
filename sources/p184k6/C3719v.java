package p184k6;

/* renamed from: k6.v */
/* loaded from: classes.dex */
public final class C3719v extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p184k6.C3719v> CREATOR = null;

    /* renamed from: Y */
    public final boolean f16437Y;

    /* renamed from: Z */
    public final java.lang.String f16438Z;

    /* renamed from: a0 */
    public final int f16439a0;

    static {
            k6.x r0 = new k6.x
            r0.<init>()
            p184k6.C3719v.CREATOR = r0
            return
    }

    public C3719v(boolean r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f16437Y = r1
            r0.f16438Z = r2
            com.google.android.gms.common.a r1 = com.google.android.gms.common.EnumC1078a.m3040e(r3)
            int r1 = r1.f5527Y
            r0.f16439a0 = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r6 = 20293(0x4f45, float:2.8437E-41)
            int r6 = p270p6.C5369c.m11723k(r5, r6)
            r0 = 1
            boolean r1 = r4.f16437Y
            r2 = 4
            p270p6.C5369c.m11724l(r5, r0, r2)
            r5.writeInt(r1)
            r0 = 2
            java.lang.String r1 = r4.f16438Z
            r3 = 0
            p270p6.C5369c.m11719g(r5, r0, r1, r3)
            r0 = 3
            int r1 = r4.f16439a0
            p270p6.C5369c.m11724l(r5, r0, r2)
            r5.writeInt(r1)
            p270p6.C5369c.m11726n(r5, r6)
            return
    }
}
