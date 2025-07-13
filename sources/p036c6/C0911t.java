package p036c6;

/* renamed from: c6.t */
/* loaded from: classes.dex */
public final class C0911t extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p036c6.C0911t> CREATOR = null;

    /* renamed from: b0 */
    public static final p123h6.C2489b f4867b0 = null;

    /* renamed from: Y */
    public int f4868Y;

    /* renamed from: Z */
    public int f4869Z;

    /* renamed from: a0 */
    public int f4870a0;

    static {
            h6.b r0 = new h6.b
            java.lang.String r1 = "VideoInfo"
            r0.<init>(r1)
            p036c6.C0911t.f4867b0 = r0
            c6.z0 r0 = new c6.z0
            r0.<init>()
            p036c6.C0911t.CREATOR = r0
            return
    }

    public C0911t(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f4868Y = r1
            r0.f4869Z = r2
            r0.f4870a0 = r3
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p036c6.C0911t
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c6.t r5 = (p036c6.C0911t) r5
            int r1 = r4.f4869Z
            int r3 = r5.f4869Z
            if (r1 != r3) goto L1f
            int r1 = r4.f4868Y
            int r3 = r5.f4868Y
            if (r1 != r3) goto L1f
            int r1 = r4.f4870a0
            int r5 = r5.f4870a0
            if (r1 != r5) goto L1f
            return r0
        L1f:
            return r2
    }

    public int hashCode() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.f4869Z
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = r3.f4868Y
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r1 = r3.f4870a0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            int r0 = r3.f4868Y
            r1 = 2
            r2 = 4
            p270p6.C5369c.m11724l(r4, r1, r2)
            r4.writeInt(r0)
            int r0 = r3.f4869Z
            r1 = 3
            p270p6.C5369c.m11724l(r4, r1, r2)
            r4.writeInt(r0)
            int r0 = r3.f4870a0
            p270p6.C5369c.m11724l(r4, r2, r2)
            r4.writeInt(r0)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
