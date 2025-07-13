package com.google.android.gms.cast;

/* loaded from: classes.dex */
public final class MediaTrack extends p270p6.AbstractC5367a implements com.google.android.gms.common.internal.ReflectedParcelable {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<com.google.android.gms.cast.MediaTrack> CREATOR = null;

    /* renamed from: Y */
    public long f5393Y;

    /* renamed from: Z */
    public int f5394Z;

    /* renamed from: a0 */
    public java.lang.String f5395a0;

    /* renamed from: b0 */
    public java.lang.String f5396b0;

    /* renamed from: c0 */
    public java.lang.String f5397c0;

    /* renamed from: d0 */
    public final java.lang.String f5398d0;

    /* renamed from: e0 */
    public int f5399e0;

    /* renamed from: f0 */
    public final java.util.List<java.lang.String> f5400f0;

    /* renamed from: g0 */
    public java.lang.String f5401g0;

    /* renamed from: h0 */
    public final org.json.JSONObject f5402h0;

    static {
            c6.u0 r0 = new c6.u0
            r0.<init>()
            com.google.android.gms.cast.MediaTrack.CREATOR = r0
            return
    }

    public MediaTrack(long r1, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8, java.util.List<java.lang.String> r9, org.json.JSONObject r10) {
            r0 = this;
            r0.<init>()
            r0.f5393Y = r1
            r0.f5394Z = r3
            r0.f5395a0 = r4
            r0.f5396b0 = r5
            r0.f5397c0 = r6
            r0.f5398d0 = r7
            r0.f5399e0 = r8
            r0.f5400f0 = r9
            r0.f5402h0 = r10
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.gms.cast.MediaTrack
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.cast.MediaTrack r8 = (com.google.android.gms.cast.MediaTrack) r8
            org.json.JSONObject r1 = r7.f5402h0
            if (r1 == 0) goto L12
            r3 = 0
            goto L13
        L12:
            r3 = 1
        L13:
            org.json.JSONObject r4 = r8.f5402h0
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
            long r3 = r7.f5393Y
            long r5 = r8.f5393Y
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L70
            int r1 = r7.f5394Z
            int r3 = r8.f5394Z
            if (r1 != r3) goto L70
            java.lang.String r1 = r7.f5395a0
            java.lang.String r3 = r8.f5395a0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L70
            java.lang.String r1 = r7.f5396b0
            java.lang.String r3 = r8.f5396b0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L70
            java.lang.String r1 = r7.f5397c0
            java.lang.String r3 = r8.f5397c0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L70
            java.lang.String r1 = r7.f5398d0
            java.lang.String r3 = r8.f5398d0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L70
            int r1 = r7.f5399e0
            int r3 = r8.f5399e0
            if (r1 != r3) goto L70
            java.util.List<java.lang.String> r1 = r7.f5400f0
            java.util.List<java.lang.String> r8 = r8.f5400f0
            boolean r8 = p123h6.C2487a.m6368g(r1, r8)
            if (r8 == 0) goto L70
            return r0
        L70:
            return r2
    }

    public int hashCode() {
            r3 = this;
            r0 = 9
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r1 = r3.f5393Y
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = r3.f5394Z
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = r3.f5395a0
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = r3.f5396b0
            r2 = 3
            r0[r2] = r1
            java.lang.String r1 = r3.f5397c0
            r2 = 4
            r0[r2] = r1
            java.lang.String r1 = r3.f5398d0
            r2 = 5
            r0[r2] = r1
            int r1 = r3.f5399e0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 6
            r0[r2] = r1
            java.util.List<java.lang.String> r1 = r3.f5400f0
            r2 = 7
            r0[r2] = r1
            org.json.JSONObject r1 = r3.f5402h0
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2 = 8
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r6, int r7) {
            r5 = this;
            org.json.JSONObject r7 = r5.f5402h0
            if (r7 != 0) goto L6
            r7 = 0
            goto La
        L6:
            java.lang.String r7 = r7.toString()
        La:
            r5.f5401g0 = r7
            r7 = 20293(0x4f45, float:2.8437E-41)
            int r7 = p270p6.C5369c.m11723k(r6, r7)
            r0 = 2
            long r1 = r5.f5393Y
            r3 = 8
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeLong(r1)
            r0 = 3
            int r1 = r5.f5394Z
            r2 = 4
            p270p6.C5369c.m11724l(r6, r0, r2)
            r6.writeInt(r1)
            java.lang.String r0 = r5.f5395a0
            r1 = 0
            p270p6.C5369c.m11719g(r6, r2, r0, r1)
            r0 = 5
            java.lang.String r4 = r5.f5396b0
            p270p6.C5369c.m11719g(r6, r0, r4, r1)
            r0 = 6
            java.lang.String r4 = r5.f5397c0
            p270p6.C5369c.m11719g(r6, r0, r4, r1)
            r0 = 7
            java.lang.String r4 = r5.f5398d0
            p270p6.C5369c.m11719g(r6, r0, r4, r1)
            int r0 = r5.f5399e0
            p270p6.C5369c.m11724l(r6, r3, r2)
            r6.writeInt(r0)
            r0 = 9
            java.util.List<java.lang.String> r2 = r5.f5400f0
            p270p6.C5369c.m11720h(r6, r0, r2, r1)
            r0 = 10
            java.lang.String r2 = r5.f5401g0
            p270p6.C5369c.m11719g(r6, r0, r2, r1)
            p270p6.C5369c.m11726n(r6, r7)
            return
    }
}
