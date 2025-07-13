package p036c6;

/* renamed from: c6.w */
/* loaded from: classes.dex */
public final class C0917w extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p036c6.C0917w> CREATOR = null;

    /* renamed from: Y */
    public final float f4871Y;

    /* renamed from: Z */
    public final float f4872Z;

    /* renamed from: a0 */
    public final float f4873a0;

    static {
            c6.x r0 = new c6.x
            r0.<init>()
            p036c6.C0917w.CREATOR = r0
            return
    }

    public C0917w(float r1, float r2, float r3) {
            r0 = this;
            r0.<init>()
            r0.f4871Y = r1
            r0.f4872Z = r2
            r0.f4873a0 = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p036c6.C0917w
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c6.w r5 = (p036c6.C0917w) r5
            float r1 = r4.f4871Y
            float r3 = r5.f4871Y
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L25
            float r1 = r4.f4872Z
            float r3 = r5.f4872Z
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L25
            float r1 = r4.f4873a0
            float r5 = r5.f4873a0
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 != 0) goto L25
            return r0
        L25:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            float r1 = r3.f4871Y
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            float r1 = r3.f4872Z
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            float r1 = r3.f4873a0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            r0 = 2
            float r1 = r3.f4871Y
            r2 = 4
            p270p6.C5369c.m11724l(r4, r0, r2)
            r4.writeFloat(r1)
            r0 = 3
            float r1 = r3.f4872Z
            p270p6.C5369c.m11724l(r4, r0, r2)
            r4.writeFloat(r1)
            float r0 = r3.f4873a0
            p270p6.C5369c.m11724l(r4, r2, r2)
            r4.writeFloat(r0)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
