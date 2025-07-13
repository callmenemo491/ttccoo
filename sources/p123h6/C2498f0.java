package p123h6;

/* renamed from: h6.f0 */
/* loaded from: classes.dex */
public final class C2498f0 extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p123h6.C2498f0> CREATOR = null;

    /* renamed from: Y */
    public double f11289Y;

    /* renamed from: Z */
    public boolean f11290Z;

    /* renamed from: a0 */
    public int f11291a0;

    /* renamed from: b0 */
    public p036c6.C0879d f11292b0;

    /* renamed from: c0 */
    public int f11293c0;

    /* renamed from: d0 */
    public p036c6.C0921y f11294d0;

    /* renamed from: e0 */
    public double f11295e0;

    static {
            h6.g0 r0 = new h6.g0
            r0.<init>()
            p123h6.C2498f0.CREATOR = r0
            return
    }

    public C2498f0() {
            r4 = this;
            r4.<init>()
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r4.f11289Y = r0
            r2 = 0
            r4.f11290Z = r2
            r2 = -1
            r4.f11291a0 = r2
            r3 = 0
            r4.f11292b0 = r3
            r4.f11293c0 = r2
            r4.f11294d0 = r3
            r4.f11295e0 = r0
            return
    }

    public C2498f0(double r1, boolean r3, int r4, p036c6.C0879d r5, int r6, p036c6.C0921y r7, double r8) {
            r0 = this;
            r0.<init>()
            r0.f11289Y = r1
            r0.f11290Z = r3
            r0.f11291a0 = r4
            r0.f11292b0 = r5
            r0.f11293c0 = r6
            r0.f11294d0 = r7
            r0.f11295e0 = r8
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p123h6.C2498f0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            h6.f0 r8 = (p123h6.C2498f0) r8
            double r3 = r7.f11289Y
            double r5 = r8.f11289Y
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L41
            boolean r1 = r7.f11290Z
            boolean r3 = r8.f11290Z
            if (r1 != r3) goto L41
            int r1 = r7.f11291a0
            int r3 = r8.f11291a0
            if (r1 != r3) goto L41
            c6.d r1 = r7.f11292b0
            c6.d r3 = r8.f11292b0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L41
            int r1 = r7.f11293c0
            int r3 = r8.f11293c0
            if (r1 != r3) goto L41
            c6.y r1 = r7.f11294d0
            boolean r1 = p123h6.C2487a.m6368g(r1, r1)
            if (r1 == 0) goto L41
            double r3 = r7.f11295e0
            double r5 = r8.f11295e0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L41
            return r0
        L41:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            r0 = 7
            java.lang.Object[] r0 = new java.lang.Object[r0]
            double r1 = r3.f11289Y
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            boolean r1 = r3.f11290Z
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r1 = r3.f11291a0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            c6.d r1 = r3.f11292b0
            r2 = 3
            r0[r2] = r1
            int r1 = r3.f11293c0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            c6.y r1 = r3.f11294d0
            r2 = 5
            r0[r2] = r1
            double r1 = r3.f11295e0
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r2 = 6
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r7, int r8) {
            r6 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r7, r0)
            r1 = 2
            double r2 = r6.f11289Y
            r4 = 8
            p270p6.C5369c.m11724l(r7, r1, r4)
            r7.writeDouble(r2)
            r1 = 3
            boolean r2 = r6.f11290Z
            r3 = 4
            p270p6.C5369c.m11724l(r7, r1, r3)
            r7.writeInt(r2)
            int r1 = r6.f11291a0
            p270p6.C5369c.m11724l(r7, r3, r3)
            r7.writeInt(r1)
            r1 = 5
            c6.d r2 = r6.f11292b0
            r5 = 0
            p270p6.C5369c.m11718f(r7, r1, r2, r8, r5)
            r1 = 6
            int r2 = r6.f11293c0
            p270p6.C5369c.m11724l(r7, r1, r3)
            r7.writeInt(r2)
            r1 = 7
            c6.y r2 = r6.f11294d0
            p270p6.C5369c.m11718f(r7, r1, r2, r8, r5)
            double r1 = r6.f11295e0
            p270p6.C5369c.m11724l(r7, r4, r4)
            r7.writeDouble(r1)
            p270p6.C5369c.m11726n(r7, r0)
            return
    }
}
