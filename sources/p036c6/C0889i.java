package p036c6;

/* renamed from: c6.i */
/* loaded from: classes.dex */
public class C0889i extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p036c6.C0889i> CREATOR = null;

    /* renamed from: c0 */
    public static final p123h6.C2489b f4773c0 = null;

    /* renamed from: Y */
    public final long f4774Y;

    /* renamed from: Z */
    public final long f4775Z;

    /* renamed from: a0 */
    public final boolean f4776a0;

    /* renamed from: b0 */
    public final boolean f4777b0;

    static {
            h6.b r0 = new h6.b
            java.lang.String r1 = "MediaLiveSeekableRange"
            r0.<init>(r1)
            p036c6.C0889i.f4773c0 = r0
            c6.l0 r0 = new c6.l0
            r0.<init>()
            p036c6.C0889i.CREATOR = r0
            return
    }

    public C0889i(long r3, long r5, boolean r7, boolean r8) {
            r2 = this;
            r2.<init>()
            r0 = 0
            long r3 = java.lang.Math.max(r3, r0)
            r2.f4774Y = r3
            long r3 = java.lang.Math.max(r5, r0)
            r2.f4775Z = r3
            r2.f4776a0 = r7
            r2.f4777b0 = r8
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p036c6.C0889i
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c6.i r8 = (p036c6.C0889i) r8
            long r3 = r7.f4774Y
            long r5 = r8.f4774Y
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L29
            long r3 = r7.f4775Z
            long r5 = r8.f4775Z
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L29
            boolean r1 = r7.f4776a0
            boolean r3 = r8.f4776a0
            if (r1 != r3) goto L29
            boolean r1 = r7.f4777b0
            boolean r8 = r8.f4777b0
            if (r1 != r8) goto L29
            return r0
        L29:
            return r2
    }

    public int hashCode() {
            r3 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r1 = r3.f4774Y
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            long r1 = r3.f4775Z
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            boolean r1 = r3.f4776a0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            boolean r1 = r3.f4777b0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r5, int r6) {
            r4 = this;
            r6 = 20293(0x4f45, float:2.8437E-41)
            int r6 = p270p6.C5369c.m11723k(r5, r6)
            long r0 = r4.f4774Y
            r2 = 2
            r3 = 8
            p270p6.C5369c.m11724l(r5, r2, r3)
            r5.writeLong(r0)
            long r0 = r4.f4775Z
            r2 = 3
            p270p6.C5369c.m11724l(r5, r2, r3)
            r5.writeLong(r0)
            boolean r0 = r4.f4776a0
            r1 = 4
            p270p6.C5369c.m11724l(r5, r1, r1)
            r5.writeInt(r0)
            boolean r0 = r4.f4777b0
            r2 = 5
            p270p6.C5369c.m11724l(r5, r2, r1)
            r5.writeInt(r0)
            p270p6.C5369c.m11726n(r5, r6)
            return
    }
}
