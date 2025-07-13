package p036c6;

/* renamed from: c6.r */
/* loaded from: classes.dex */
public final class C0907r extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p036c6.C0907r> CREATOR = null;

    /* renamed from: Y */
    public float f4852Y;

    /* renamed from: Z */
    public int f4853Z;

    /* renamed from: a0 */
    public int f4854a0;

    /* renamed from: b0 */
    public int f4855b0;

    /* renamed from: c0 */
    public int f4856c0;

    /* renamed from: d0 */
    public int f4857d0;

    /* renamed from: e0 */
    public int f4858e0;

    /* renamed from: f0 */
    public int f4859f0;

    /* renamed from: g0 */
    public java.lang.String f4860g0;

    /* renamed from: h0 */
    public int f4861h0;

    /* renamed from: i0 */
    public int f4862i0;

    /* renamed from: j0 */
    public java.lang.String f4863j0;

    /* renamed from: k0 */
    public org.json.JSONObject f4864k0;

    static {
            c6.x0 r0 = new c6.x0
            r0.<init>()
            p036c6.C0907r.CREATOR = r0
            return
    }

    public C0907r() {
            r13 = this;
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r3 = 0
            r4 = -1
            r5 = 0
            r6 = -1
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = -1
            r11 = -1
            r12 = 0
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    public C0907r(float r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, java.lang.String r9, int r10, int r11, java.lang.String r12) {
            r0 = this;
            r0.<init>()
            r0.f4852Y = r1
            r0.f4853Z = r2
            r0.f4854a0 = r3
            r0.f4855b0 = r4
            r0.f4856c0 = r5
            r0.f4857d0 = r6
            r0.f4858e0 = r7
            r0.f4859f0 = r8
            r0.f4860g0 = r9
            r0.f4861h0 = r10
            r0.f4862i0 = r11
            r0.f4863j0 = r12
            r1 = 0
            if (r12 == 0) goto L2b
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L26
            r2.<init>(r12)     // Catch: org.json.JSONException -> L26
            r0.f4864k0 = r2     // Catch: org.json.JSONException -> L26
            return
        L26:
            r0.f4864k0 = r1
            r0.f4863j0 = r1
            return
        L2b:
            r0.f4864k0 = r1
            return
    }

    /* renamed from: X */
    public static final int m2632X(java.lang.String r7) {
            r0 = 0
            if (r7 == 0) goto L3e
            int r1 = r7.length()
            r2 = 9
            if (r1 != r2) goto L3e
            char r1 = r7.charAt(r0)
            r3 = 35
            if (r1 != r3) goto L3e
            r1 = 1
            r3 = 3
            java.lang.String r1 = r7.substring(r1, r3)     // Catch: java.lang.NumberFormatException -> L3e
            r4 = 16
            int r1 = java.lang.Integer.parseInt(r1, r4)     // Catch: java.lang.NumberFormatException -> L3e
            r5 = 5
            java.lang.String r3 = r7.substring(r3, r5)     // Catch: java.lang.NumberFormatException -> L3e
            int r3 = java.lang.Integer.parseInt(r3, r4)     // Catch: java.lang.NumberFormatException -> L3e
            r6 = 7
            java.lang.String r5 = r7.substring(r5, r6)     // Catch: java.lang.NumberFormatException -> L3e
            int r5 = java.lang.Integer.parseInt(r5, r4)     // Catch: java.lang.NumberFormatException -> L3e
            java.lang.String r7 = r7.substring(r6, r2)     // Catch: java.lang.NumberFormatException -> L3e
            int r7 = java.lang.Integer.parseInt(r7, r4)     // Catch: java.lang.NumberFormatException -> L3e
            int r7 = android.graphics.Color.argb(r7, r1, r3, r5)     // Catch: java.lang.NumberFormatException -> L3e
            return r7
        L3e:
            return r0
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof p036c6.C0907r
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c6.r r7 = (p036c6.C0907r) r7
            org.json.JSONObject r1 = r6.f4864k0
            if (r1 == 0) goto L12
            r3 = 0
            goto L13
        L12:
            r3 = 1
        L13:
            org.json.JSONObject r4 = r7.f4864k0
            if (r4 == 0) goto L19
            r5 = 0
            goto L1a
        L19:
            r5 = 1
        L1a:
            if (r3 == r5) goto L1d
            return r2
        L1d:
            if (r1 == 0) goto L29
            if (r4 == 0) goto L29
            boolean r1 = p353u6.C6344g.m12994a(r1, r4)
            if (r1 == 0) goto L28
            goto L29
        L28:
            return r2
        L29:
            float r1 = r6.f4852Y
            float r3 = r7.f4852Y
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L72
            int r1 = r6.f4853Z
            int r3 = r7.f4853Z
            if (r1 != r3) goto L72
            int r1 = r6.f4854a0
            int r3 = r7.f4854a0
            if (r1 != r3) goto L72
            int r1 = r6.f4855b0
            int r3 = r7.f4855b0
            if (r1 != r3) goto L72
            int r1 = r6.f4856c0
            int r3 = r7.f4856c0
            if (r1 != r3) goto L72
            int r1 = r6.f4857d0
            int r3 = r7.f4857d0
            if (r1 != r3) goto L72
            int r1 = r6.f4858e0
            int r3 = r7.f4858e0
            if (r1 != r3) goto L72
            int r1 = r6.f4859f0
            int r3 = r7.f4859f0
            if (r1 != r3) goto L72
            java.lang.String r1 = r6.f4860g0
            java.lang.String r3 = r7.f4860g0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L72
            int r1 = r6.f4861h0
            int r3 = r7.f4861h0
            if (r1 != r3) goto L72
            int r1 = r6.f4862i0
            int r7 = r7.f4862i0
            if (r1 != r7) goto L72
            return r0
        L72:
            return r2
    }

    public int hashCode() {
            r3 = this;
            r0 = 12
            java.lang.Object[] r0 = new java.lang.Object[r0]
            float r1 = r3.f4852Y
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = r3.f4853Z
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r1 = r3.f4854a0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            int r1 = r3.f4855b0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            int r1 = r3.f4856c0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            int r1 = r3.f4857d0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 5
            r0[r2] = r1
            int r1 = r3.f4858e0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 6
            r0[r2] = r1
            int r1 = r3.f4859f0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 7
            r0[r2] = r1
            java.lang.String r1 = r3.f4860g0
            r2 = 8
            r0[r2] = r1
            int r1 = r3.f4861h0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 9
            r0[r2] = r1
            int r1 = r3.f4862i0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 10
            r0[r2] = r1
            org.json.JSONObject r1 = r3.f4864k0
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2 = 11
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r5, int r6) {
            r4 = this;
            org.json.JSONObject r6 = r4.f4864k0
            if (r6 != 0) goto L6
            r6 = 0
            goto La
        L6:
            java.lang.String r6 = r6.toString()
        La:
            r4.f4863j0 = r6
            r6 = 20293(0x4f45, float:2.8437E-41)
            int r6 = p270p6.C5369c.m11723k(r5, r6)
            r0 = 2
            float r1 = r4.f4852Y
            r2 = 4
            p270p6.C5369c.m11724l(r5, r0, r2)
            r5.writeFloat(r1)
            r0 = 3
            int r1 = r4.f4853Z
            p270p6.C5369c.m11724l(r5, r0, r2)
            r5.writeInt(r1)
            int r0 = r4.f4854a0
            p270p6.C5369c.m11724l(r5, r2, r2)
            r5.writeInt(r0)
            r0 = 5
            int r1 = r4.f4855b0
            p270p6.C5369c.m11724l(r5, r0, r2)
            r5.writeInt(r1)
            r0 = 6
            int r1 = r4.f4856c0
            p270p6.C5369c.m11724l(r5, r0, r2)
            r5.writeInt(r1)
            r0 = 7
            int r1 = r4.f4857d0
            p270p6.C5369c.m11724l(r5, r0, r2)
            r5.writeInt(r1)
            r0 = 8
            int r1 = r4.f4858e0
            p270p6.C5369c.m11724l(r5, r0, r2)
            r5.writeInt(r1)
            r0 = 9
            int r1 = r4.f4859f0
            p270p6.C5369c.m11724l(r5, r0, r2)
            r5.writeInt(r1)
            r0 = 10
            java.lang.String r1 = r4.f4860g0
            r3 = 0
            p270p6.C5369c.m11719g(r5, r0, r1, r3)
            r0 = 11
            int r1 = r4.f4861h0
            p270p6.C5369c.m11724l(r5, r0, r2)
            r5.writeInt(r1)
            r0 = 12
            int r1 = r4.f4862i0
            p270p6.C5369c.m11724l(r5, r0, r2)
            r5.writeInt(r1)
            r0 = 13
            java.lang.String r1 = r4.f4863j0
            p270p6.C5369c.m11719g(r5, r0, r1, r3)
            p270p6.C5369c.m11726n(r5, r6)
            return
    }
}
