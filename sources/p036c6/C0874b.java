package p036c6;

/* renamed from: c6.b */
/* loaded from: classes.dex */
public class C0874b extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p036c6.C0874b> CREATOR = null;

    /* renamed from: Y */
    public final long f4730Y;

    /* renamed from: Z */
    public final java.lang.String f4731Z;

    /* renamed from: a0 */
    public final long f4732a0;

    /* renamed from: b0 */
    public final boolean f4733b0;

    /* renamed from: c0 */
    public final java.lang.String[] f4734c0;

    /* renamed from: d0 */
    public final boolean f4735d0;

    /* renamed from: e0 */
    public final boolean f4736e0;

    static {
            c6.d0 r0 = new c6.d0
            r0.<init>()
            p036c6.C0874b.CREATOR = r0
            return
    }

    public C0874b(long r1, @androidx.annotation.RecentlyNonNull java.lang.String r3, long r4, boolean r6, @androidx.annotation.RecentlyNonNull java.lang.String[] r7, boolean r8, boolean r9) {
            r0 = this;
            r0.<init>()
            r0.f4730Y = r1
            r0.f4731Z = r3
            r0.f4732a0 = r4
            r0.f4733b0 = r6
            r0.f4734c0 = r7
            r0.f4735d0 = r8
            r0.f4736e0 = r9
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p036c6.C0874b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c6.b r8 = (p036c6.C0874b) r8
            java.lang.String r1 = r7.f4731Z
            java.lang.String r3 = r8.f4731Z
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L43
            long r3 = r7.f4730Y
            long r5 = r8.f4730Y
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L43
            long r3 = r7.f4732a0
            long r5 = r8.f4732a0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L43
            boolean r1 = r7.f4733b0
            boolean r3 = r8.f4733b0
            if (r1 != r3) goto L43
            java.lang.String[] r1 = r7.f4734c0
            java.lang.String[] r3 = r8.f4734c0
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L43
            boolean r1 = r7.f4735d0
            boolean r3 = r8.f4735d0
            if (r1 != r3) goto L43
            boolean r1 = r7.f4736e0
            boolean r8 = r8.f4736e0
            if (r1 != r8) goto L43
            return r0
        L43:
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f4731Z
            int r0 = r0.hashCode()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r5, int r6) {
            r4 = this;
            r6 = 20293(0x4f45, float:2.8437E-41)
            int r6 = p270p6.C5369c.m11723k(r5, r6)
            r0 = 2
            long r1 = r4.f4730Y
            r3 = 8
            p270p6.C5369c.m11724l(r5, r0, r3)
            r5.writeLong(r1)
            r0 = 3
            java.lang.String r1 = r4.f4731Z
            r2 = 0
            p270p6.C5369c.m11719g(r5, r0, r1, r2)
            long r0 = r4.f4732a0
            r2 = 4
            p270p6.C5369c.m11724l(r5, r2, r3)
            r5.writeLong(r0)
            r0 = 5
            boolean r1 = r4.f4733b0
            p270p6.C5369c.m11724l(r5, r0, r2)
            r5.writeInt(r1)
            r0 = 6
            java.lang.String[] r1 = r4.f4734c0
            if (r1 != 0) goto L30
            goto L3a
        L30:
            int r0 = p270p6.C5369c.m11723k(r5, r0)
            r5.writeStringArray(r1)
            p270p6.C5369c.m11726n(r5, r0)
        L3a:
            r0 = 7
            boolean r1 = r4.f4735d0
            p270p6.C5369c.m11724l(r5, r0, r2)
            r5.writeInt(r1)
            boolean r0 = r4.f4736e0
            p270p6.C5369c.m11724l(r5, r3, r2)
            r5.writeInt(r0)
            p270p6.C5369c.m11726n(r5, r6)
            return
    }
}
