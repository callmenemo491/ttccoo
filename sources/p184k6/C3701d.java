package p184k6;

/* renamed from: k6.d */
/* loaded from: classes.dex */
public class C3701d extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p184k6.C3701d> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f16401Y;

    /* renamed from: Z */
    @java.lang.Deprecated
    public final int f16402Z;

    /* renamed from: a0 */
    public final long f16403a0;

    static {
            k6.l r0 = new k6.l
            r0.<init>()
            p184k6.C3701d.CREATOR = r0
            return
    }

    public C3701d(@androidx.annotation.RecentlyNonNull java.lang.String r1, int r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.f16401Y = r1
            r0.f16402Z = r2
            r0.f16403a0 = r3
            return
    }

    public C3701d(@androidx.annotation.RecentlyNonNull java.lang.String r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.f16401Y = r1
            r0.f16403a0 = r2
            r1 = -1
            r0.f16402Z = r1
            return
    }

    /* renamed from: X */
    public long m8162X() {
            r5 = this;
            long r0 = r5.f16403a0
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            int r0 = r5.f16402Z
            long r0 = (long) r0
        Lb:
            return r0
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof p184k6.C3701d
            r1 = 0
            if (r0 == 0) goto L29
            k6.d r7 = (p184k6.C3701d) r7
            java.lang.String r0 = r6.f16401Y
            if (r0 == 0) goto L13
            java.lang.String r2 = r7.f16401Y
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1b
        L13:
            java.lang.String r0 = r6.f16401Y
            if (r0 != 0) goto L29
            java.lang.String r0 = r7.f16401Y
            if (r0 != 0) goto L29
        L1b:
            long r2 = r6.m8162X()
            long r4 = r7.m8162X()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L29
            r7 = 1
            return r7
        L29:
            return r1
    }

    public int hashCode() {
            r4 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r4.f16401Y
            r2 = 0
            r0[r2] = r1
            r1 = 1
            long r2 = r4.m8162X()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0[r1] = r2
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @androidx.annotation.RecentlyNonNull
    public java.lang.String toString() {
            r3 = this;
            o6.o$a r0 = new o6.o$a
            r1 = 0
            r0.<init>(r3, r1)
            java.lang.String r1 = r3.f16401Y
            java.lang.String r2 = "name"
            r0.m11075a(r2, r1)
            long r1 = r3.m8162X()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "version"
            r0.m11075a(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r5, int r6) {
            r4 = this;
            r6 = 20293(0x4f45, float:2.8437E-41)
            int r6 = p270p6.C5369c.m11723k(r5, r6)
            r0 = 1
            java.lang.String r1 = r4.f16401Y
            r2 = 0
            p270p6.C5369c.m11719g(r5, r0, r1, r2)
            r0 = 2
            int r1 = r4.f16402Z
            r2 = 4
            p270p6.C5369c.m11724l(r5, r0, r2)
            r5.writeInt(r1)
            r0 = 3
            long r1 = r4.m8162X()
            r3 = 8
            p270p6.C5369c.m11724l(r5, r0, r3)
            r5.writeLong(r1)
            p270p6.C5369c.m11726n(r5, r6)
            return
    }
}
