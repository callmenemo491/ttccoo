package p233n6;

/* renamed from: n6.a */
/* loaded from: classes.dex */
public final class C4691a extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p233n6.C4691a> CREATOR = null;

    /* renamed from: Y */
    public final int f18716Y;

    /* renamed from: Z */
    public final android.net.Uri f18717Z;

    /* renamed from: a0 */
    public final int f18718a0;

    /* renamed from: b0 */
    public final int f18719b0;

    static {
            n6.b r0 = new n6.b
            r0.<init>()
            p233n6.C4691a.CREATOR = r0
            return
    }

    public C4691a(int r1, android.net.Uri r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f18716Y = r1
            r0.f18717Z = r2
            r0.f18718a0 = r3
            r0.f18719b0 = r4
            return
    }

    public C4691a(@androidx.annotation.RecentlyNonNull android.net.Uri r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f18716Y = r0
            r1.f18717Z = r2
            r1.f18718a0 = r3
            r1.f18719b0 = r4
            if (r2 == 0) goto L1b
            if (r3 < 0) goto L13
            if (r4 < 0) goto L13
            return
        L13:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "width and height must not be negative"
            r2.<init>(r3)
            throw r2
        L1b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "url cannot be null"
            r2.<init>(r3)
            throw r2
    }

    public C4691a(@androidx.annotation.RecentlyNonNull org.json.JSONObject r5) {
            r4 = this;
            android.net.Uri r0 = android.net.Uri.EMPTY
            java.lang.String r1 = "url"
            boolean r2 = r5.has(r1)
            if (r2 == 0) goto L12
            java.lang.String r1 = r5.getString(r1)     // Catch: org.json.JSONException -> L12
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch: org.json.JSONException -> L12
        L12:
            java.lang.String r1 = "width"
            r2 = 0
            int r1 = r5.optInt(r1, r2)
            java.lang.String r3 = "height"
            int r5 = r5.optInt(r3, r2)
            r4.<init>(r0, r1, r5)
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L25
            boolean r2 = r5 instanceof p233n6.C4691a
            if (r2 != 0) goto Lc
            goto L25
        Lc:
            n6.a r5 = (p233n6.C4691a) r5
            android.net.Uri r2 = r4.f18717Z
            android.net.Uri r3 = r5.f18717Z
            boolean r2 = p248o6.C4924o.m11074a(r2, r3)
            if (r2 == 0) goto L25
            int r2 = r4.f18718a0
            int r3 = r5.f18718a0
            if (r2 != r3) goto L25
            int r2 = r4.f18719b0
            int r5 = r5.f18719b0
            if (r2 != r5) goto L25
            return r0
        L25:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            android.net.Uri r1 = r3.f18717Z
            r2 = 0
            r0[r2] = r1
            int r1 = r3.f18718a0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r1 = r3.f18719b0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @androidx.annotation.RecentlyNonNull
    public final java.lang.String toString() {
            r4 = this;
            java.util.Locale r0 = java.util.Locale.US
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r4.f18718a0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            int r2 = r4.f18719b0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            android.net.Uri r2 = r4.f18717Z
            java.lang.String r2 = r2.toString()
            r3 = 2
            r1[r3] = r2
            java.lang.String r2 = "Image %dx%d %s"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r6, int r7) {
            r5 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r6, r0)
            r1 = 1
            int r2 = r5.f18716Y
            r3 = 4
            p270p6.C5369c.m11724l(r6, r1, r3)
            r6.writeInt(r2)
            r1 = 2
            android.net.Uri r2 = r5.f18717Z
            r4 = 0
            p270p6.C5369c.m11718f(r6, r1, r2, r7, r4)
            r7 = 3
            int r1 = r5.f18718a0
            p270p6.C5369c.m11724l(r6, r7, r3)
            r6.writeInt(r1)
            int r7 = r5.f18719b0
            p270p6.C5369c.m11724l(r6, r3, r3)
            r6.writeInt(r7)
            p270p6.C5369c.m11726n(r6, r0)
            return
    }
}
