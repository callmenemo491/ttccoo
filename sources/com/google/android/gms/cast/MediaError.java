package com.google.android.gms.cast;

/* loaded from: classes.dex */
public class MediaError extends p270p6.AbstractC5367a implements com.google.android.gms.common.internal.ReflectedParcelable {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<com.google.android.gms.cast.MediaError> CREATOR = null;

    /* renamed from: Y */
    public java.lang.String f5367Y;

    /* renamed from: Z */
    public long f5368Z;

    /* renamed from: a0 */
    public final java.lang.Integer f5369a0;

    /* renamed from: b0 */
    public final java.lang.String f5370b0;

    /* renamed from: c0 */
    public java.lang.String f5371c0;

    /* renamed from: d0 */
    public final org.json.JSONObject f5372d0;

    static {
            c6.j0 r0 = new c6.j0
            r0.<init>()
            com.google.android.gms.cast.MediaError.CREATOR = r0
            return
    }

    public MediaError(java.lang.String r1, long r2, java.lang.Integer r4, java.lang.String r5, org.json.JSONObject r6) {
            r0 = this;
            r0.<init>()
            r0.f5367Y = r1
            r0.f5368Z = r2
            r0.f5369a0 = r4
            r0.f5370b0 = r5
            r0.f5372d0 = r6
            return
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: X */
    public static com.google.android.gms.cast.MediaError m2929X(@androidx.annotation.RecentlyNonNull org.json.JSONObject r9) {
            java.lang.String r0 = "type"
            java.lang.String r1 = "ERROR"
            java.lang.String r3 = r9.optString(r0, r1)
            java.lang.String r0 = "requestId"
            long r4 = r9.optLong(r0)
            java.lang.String r0 = "detailedErrorCode"
            boolean r1 = r9.has(r0)
            r2 = 0
            if (r1 == 0) goto L21
            int r0 = r9.optInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6 = r0
            goto L22
        L21:
            r6 = r2
        L22:
            java.lang.String r0 = "reason"
            java.lang.String r7 = p123h6.C2487a.m6364c(r9, r0)
            java.lang.String r0 = "customData"
            boolean r1 = r9.has(r0)
            if (r1 == 0) goto L36
            org.json.JSONObject r9 = r9.optJSONObject(r0)
            r8 = r9
            goto L37
        L36:
            r8 = r2
        L37:
            com.google.android.gms.cast.MediaError r9 = new com.google.android.gms.cast.MediaError
            r2 = r9
            r2.<init>(r3, r4, r6, r7, r8)
            return r9
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r6, int r7) {
            r5 = this;
            org.json.JSONObject r7 = r5.f5372d0
            if (r7 != 0) goto L6
            r7 = 0
            goto La
        L6:
            java.lang.String r7 = r7.toString()
        La:
            r5.f5371c0 = r7
            r7 = 20293(0x4f45, float:2.8437E-41)
            int r7 = p270p6.C5369c.m11723k(r6, r7)
            r0 = 2
            java.lang.String r1 = r5.f5367Y
            r2 = 0
            p270p6.C5369c.m11719g(r6, r0, r1, r2)
            r0 = 3
            long r3 = r5.f5368Z
            r1 = 8
            p270p6.C5369c.m11724l(r6, r0, r1)
            r6.writeLong(r3)
            java.lang.Integer r0 = r5.f5369a0
            if (r0 != 0) goto L29
            goto L34
        L29:
            r1 = 4
            p270p6.C5369c.m11724l(r6, r1, r1)
            int r0 = r0.intValue()
            r6.writeInt(r0)
        L34:
            r0 = 5
            java.lang.String r1 = r5.f5370b0
            p270p6.C5369c.m11719g(r6, r0, r1, r2)
            r0 = 6
            java.lang.String r1 = r5.f5371c0
            p270p6.C5369c.m11719g(r6, r0, r1, r2)
            p270p6.C5369c.m11726n(r6, r7)
            return
    }
}
