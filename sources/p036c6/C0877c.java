package p036c6;

/* renamed from: c6.c */
/* loaded from: classes.dex */
public class C0877c extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p036c6.C0877c> CREATOR = null;

    /* renamed from: d0 */
    public static final p123h6.C2489b f4738d0 = null;

    /* renamed from: Y */
    public final long f4739Y;

    /* renamed from: Z */
    public final long f4740Z;

    /* renamed from: a0 */
    public final java.lang.String f4741a0;

    /* renamed from: b0 */
    public final java.lang.String f4742b0;

    /* renamed from: c0 */
    public final long f4743c0;

    static {
            h6.b r0 = new h6.b
            java.lang.String r1 = "AdBreakStatus"
            r0.<init>(r1)
            p036c6.C0877c.f4738d0 = r0
            c6.n0 r0 = new c6.n0
            r0.<init>()
            p036c6.C0877c.CREATOR = r0
            return
    }

    public C0877c(long r1, long r3, java.lang.String r5, java.lang.String r6, long r7) {
            r0 = this;
            r0.<init>()
            r0.f4739Y = r1
            r0.f4740Z = r3
            r0.f4741a0 = r5
            r0.f4742b0 = r6
            r0.f4743c0 = r7
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p036c6.C0877c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c6.c r8 = (p036c6.C0877c) r8
            long r3 = r7.f4739Y
            long r5 = r8.f4739Y
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L39
            long r3 = r7.f4740Z
            long r5 = r8.f4740Z
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L39
            java.lang.String r1 = r7.f4741a0
            java.lang.String r3 = r8.f4741a0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L39
            java.lang.String r1 = r7.f4742b0
            java.lang.String r3 = r8.f4742b0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L39
            long r3 = r7.f4743c0
            long r5 = r8.f4743c0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L39
            return r0
        L39:
            return r2
    }

    public int hashCode() {
            r3 = this;
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r1 = r3.f4739Y
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            long r1 = r3.f4740Z
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = r3.f4741a0
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = r3.f4742b0
            r2 = 3
            r0[r2] = r1
            long r1 = r3.f4743c0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r5, int r6) {
            r4 = this;
            r6 = 20293(0x4f45, float:2.8437E-41)
            int r6 = p270p6.C5369c.m11723k(r5, r6)
            long r0 = r4.f4739Y
            r2 = 2
            r3 = 8
            p270p6.C5369c.m11724l(r5, r2, r3)
            r5.writeLong(r0)
            long r0 = r4.f4740Z
            r2 = 3
            p270p6.C5369c.m11724l(r5, r2, r3)
            r5.writeLong(r0)
            java.lang.String r0 = r4.f4741a0
            r1 = 4
            r2 = 0
            p270p6.C5369c.m11719g(r5, r1, r0, r2)
            java.lang.String r0 = r4.f4742b0
            r1 = 5
            p270p6.C5369c.m11719g(r5, r1, r0, r2)
            long r0 = r4.f4743c0
            r2 = 6
            p270p6.C5369c.m11724l(r5, r2, r3)
            r5.writeLong(r0)
            p270p6.C5369c.m11726n(r5, r6)
            return
    }
}
