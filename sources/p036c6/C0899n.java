package p036c6;

/* renamed from: c6.n */
/* loaded from: classes.dex */
public class C0899n extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p036c6.C0899n> CREATOR = null;

    /* renamed from: Y */
    public com.google.android.gms.cast.MediaInfo f4811Y;

    /* renamed from: Z */
    public int f4812Z;

    /* renamed from: a0 */
    public boolean f4813a0;

    /* renamed from: b0 */
    public double f4814b0;

    /* renamed from: c0 */
    public double f4815c0;

    /* renamed from: d0 */
    public double f4816d0;

    /* renamed from: e0 */
    public long[] f4817e0;

    /* renamed from: f0 */
    public java.lang.String f4818f0;

    /* renamed from: g0 */
    public org.json.JSONObject f4819g0;

    static {
            c6.s0 r0 = new c6.s0
            r0.<init>()
            p036c6.C0899n.CREATOR = r0
            return
    }

    public C0899n(com.google.android.gms.cast.MediaInfo r3, int r4, boolean r5, double r6, double r8, double r10, long[] r12, java.lang.String r13) {
            r2 = this;
            r2.<init>()
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r2.f4814b0 = r0
            r2.f4811Y = r3
            r2.f4812Z = r4
            r2.f4813a0 = r5
            r2.f4814b0 = r6
            r2.f4815c0 = r8
            r2.f4816d0 = r10
            r2.f4817e0 = r12
            r2.f4818f0 = r13
            r3 = 0
            if (r13 == 0) goto L27
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L22
            r4.<init>(r13)     // Catch: org.json.JSONException -> L22
            r2.f4819g0 = r4     // Catch: org.json.JSONException -> L22
            return
        L22:
            r2.f4819g0 = r3
            r2.f4818f0 = r3
            return
        L27:
            r2.f4819g0 = r3
            return
    }

    public C0899n(@androidx.annotation.RecentlyNonNull org.json.JSONObject r13) {
            r12 = this;
            r1 = 0
            r2 = 0
            r3 = 1
            r4 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r6 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            r8 = 0
            r10 = 0
            r11 = 0
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r6, r8, r10, r11)
            r12.m2607X(r13)
            return
    }

    /* renamed from: X */
    public boolean m2607X(@androidx.annotation.RecentlyNonNull org.json.JSONObject r12) {
            r11 = this;
            java.lang.String r0 = "media"
            boolean r1 = r12.has(r0)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L17
            com.google.android.gms.cast.MediaInfo r1 = new com.google.android.gms.cast.MediaInfo
            org.json.JSONObject r0 = r12.getJSONObject(r0)
            r1.<init>(r0)
            r11.f4811Y = r1
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            java.lang.String r1 = "itemId"
            boolean r4 = r12.has(r1)
            if (r4 == 0) goto L2b
            int r1 = r12.getInt(r1)
            int r4 = r11.f4812Z
            if (r4 == r1) goto L2b
            r11.f4812Z = r1
            r0 = 1
        L2b:
            java.lang.String r1 = "autoplay"
            boolean r4 = r12.has(r1)
            if (r4 == 0) goto L3e
            boolean r1 = r12.getBoolean(r1)
            boolean r4 = r11.f4813a0
            if (r4 == r1) goto L3e
            r11.f4813a0 = r1
            r0 = 1
        L3e:
            java.lang.String r1 = "startTime"
            double r4 = r12.optDouble(r1)
            boolean r1 = java.lang.Double.isNaN(r4)
            double r6 = r11.f4814b0
            boolean r6 = java.lang.Double.isNaN(r6)
            r7 = 4502148214488346440(0x3e7ad7f29abcaf48, double:1.0E-7)
            if (r1 == r6) goto L56
            goto L68
        L56:
            boolean r1 = java.lang.Double.isNaN(r4)
            if (r1 != 0) goto L6b
            double r9 = r11.f4814b0
            double r9 = r4 - r9
            double r9 = java.lang.Math.abs(r9)
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 <= 0) goto L6b
        L68:
            r11.f4814b0 = r4
            r0 = 1
        L6b:
            java.lang.String r1 = "playbackDuration"
            boolean r4 = r12.has(r1)
            if (r4 == 0) goto L86
            double r4 = r12.getDouble(r1)
            double r9 = r11.f4815c0
            double r9 = r4 - r9
            double r9 = java.lang.Math.abs(r9)
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 <= 0) goto L86
            r11.f4815c0 = r4
            r0 = 1
        L86:
            java.lang.String r1 = "preloadTime"
            boolean r4 = r12.has(r1)
            if (r4 == 0) goto La1
            double r4 = r12.getDouble(r1)
            double r9 = r11.f4816d0
            double r9 = r4 - r9
            double r9 = java.lang.Math.abs(r9)
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 <= 0) goto La1
            r11.f4816d0 = r4
            r0 = 1
        La1:
            java.lang.String r1 = "activeTrackIds"
            boolean r4 = r12.has(r1)
            if (r4 == 0) goto Lda
            org.json.JSONArray r1 = r12.getJSONArray(r1)
            int r4 = r1.length()
            long[] r5 = new long[r4]
            r6 = 0
        Lb4:
            if (r6 >= r4) goto Lbf
            long r7 = r1.getLong(r6)
            r5[r6] = r7
            int r6 = r6 + 1
            goto Lb4
        Lbf:
            long[] r1 = r11.f4817e0
            if (r1 != 0) goto Lc5
        Lc3:
            r2 = 1
            goto Ldb
        Lc5:
            int r1 = r1.length
            if (r1 == r4) goto Lc9
            goto Lc3
        Lc9:
            r1 = 0
        Lca:
            if (r1 >= r4) goto Ldb
            long[] r6 = r11.f4817e0
            r7 = r6[r1]
            r9 = r5[r1]
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 == 0) goto Ld7
            goto Lc3
        Ld7:
            int r1 = r1 + 1
            goto Lca
        Lda:
            r5 = 0
        Ldb:
            if (r2 == 0) goto Le0
            r11.f4817e0 = r5
            r0 = 1
        Le0:
            java.lang.String r1 = "customData"
            boolean r2 = r12.has(r1)
            if (r2 == 0) goto Lef
            org.json.JSONObject r12 = r12.getJSONObject(r1)
            r11.f4819g0 = r12
            return r3
        Lef:
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p036c6.C0899n
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c6.n r8 = (p036c6.C0899n) r8
            org.json.JSONObject r1 = r7.f4819g0
            if (r1 == 0) goto L12
            r3 = 0
            goto L13
        L12:
            r3 = 1
        L13:
            org.json.JSONObject r4 = r8.f4819g0
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
            com.google.android.gms.cast.MediaInfo r1 = r7.f4811Y
            com.google.android.gms.cast.MediaInfo r3 = r8.f4811Y
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L72
            int r1 = r7.f4812Z
            int r3 = r8.f4812Z
            if (r1 != r3) goto L72
            boolean r1 = r7.f4813a0
            boolean r3 = r8.f4813a0
            if (r1 != r3) goto L72
            double r3 = r7.f4814b0
            boolean r1 = java.lang.Double.isNaN(r3)
            if (r1 == 0) goto L4f
            double r3 = r8.f4814b0
            boolean r1 = java.lang.Double.isNaN(r3)
            if (r1 != 0) goto L57
        L4f:
            double r3 = r7.f4814b0
            double r5 = r8.f4814b0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L72
        L57:
            double r3 = r7.f4815c0
            double r5 = r8.f4815c0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L72
            double r3 = r7.f4816d0
            double r5 = r8.f4816d0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L72
            long[] r1 = r7.f4817e0
            long[] r8 = r8.f4817e0
            boolean r8 = java.util.Arrays.equals(r1, r8)
            if (r8 == 0) goto L72
            return r0
        L72:
            return r2
    }

    public int hashCode() {
            r3 = this;
            r0 = 8
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.cast.MediaInfo r1 = r3.f4811Y
            r2 = 0
            r0[r2] = r1
            int r1 = r3.f4812Z
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            boolean r1 = r3.f4813a0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            double r1 = r3.f4814b0
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            double r1 = r3.f4815c0
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            double r1 = r3.f4816d0
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r2 = 5
            r0[r2] = r1
            long[] r1 = r3.f4817e0
            int r1 = java.util.Arrays.hashCode(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 6
            r0[r2] = r1
            org.json.JSONObject r1 = r3.f4819g0
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2 = 7
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r6, int r7) {
            r5 = this;
            org.json.JSONObject r0 = r5.f4819g0
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            java.lang.String r0 = r0.toString()
        La:
            r5.f4818f0 = r0
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r6, r0)
            r1 = 2
            com.google.android.gms.cast.MediaInfo r2 = r5.f4811Y
            r3 = 0
            p270p6.C5369c.m11718f(r6, r1, r2, r7, r3)
            r7 = 3
            int r1 = r5.f4812Z
            r2 = 4
            p270p6.C5369c.m11724l(r6, r7, r2)
            r6.writeInt(r1)
            boolean r7 = r5.f4813a0
            p270p6.C5369c.m11724l(r6, r2, r2)
            r6.writeInt(r7)
            r7 = 5
            double r1 = r5.f4814b0
            r4 = 8
            p270p6.C5369c.m11724l(r6, r7, r4)
            r6.writeDouble(r1)
            r7 = 6
            double r1 = r5.f4815c0
            p270p6.C5369c.m11724l(r6, r7, r4)
            r6.writeDouble(r1)
            r7 = 7
            double r1 = r5.f4816d0
            p270p6.C5369c.m11724l(r6, r7, r4)
            r6.writeDouble(r1)
            long[] r7 = r5.f4817e0
            p270p6.C5369c.m11716d(r6, r4, r7, r3)
            r7 = 9
            java.lang.String r1 = r5.f4818f0
            p270p6.C5369c.m11719g(r6, r7, r1, r3)
            p270p6.C5369c.m11726n(r6, r0)
            return
    }
}
