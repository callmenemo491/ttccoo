package p124h7;

/* renamed from: h7.oe */
/* loaded from: classes.dex */
public final class C2788oe extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p124h7.C2788oe> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f11807Y;

    /* renamed from: Z */
    public final java.lang.String f11808Z;

    /* renamed from: a0 */
    public final java.lang.String f11809a0;

    /* renamed from: b0 */
    public final long f11810b0;

    static {
            h7.pe r0 = new h7.pe
            r0.<init>()
            p124h7.C2788oe.CREATOR = r0
            return
    }

    public C2788oe(java.lang.String r1, java.lang.String r2, java.lang.String r3, long r4) {
            r0 = this;
            r0.<init>()
            r0.f11807Y = r1
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r0.f11808Z = r2
            r0.f11809a0 = r3
            r0.f11810b0 = r4
            return
    }

    /* renamed from: X */
    public static p124h7.C2788oe m7022X(org.json.JSONObject r9) {
            h7.oe r6 = new h7.oe
            java.lang.String r0 = "phoneInfo"
            r1 = 0
            java.lang.String r2 = r9.optString(r0, r1)
            java.lang.String r0 = "mfaEnrollmentId"
            java.lang.String r3 = r9.optString(r0, r1)
            java.lang.String r0 = "displayName"
            java.lang.String r4 = r9.optString(r0, r1)
            java.lang.String r0 = "enrolledAt"
            boolean r1 = r9.has(r0)
            r7 = 0
            if (r1 != 0) goto L20
            goto L34
        L20:
            org.json.JSONObject r0 = r9.optJSONObject(r0)
            if (r0 == 0) goto L34
            java.lang.String r1 = "seconds"
            boolean r5 = r0.has(r1)
            if (r5 != 0) goto L2f
            goto L34
        L2f:
            long r0 = r0.optLong(r1, r7)
            r7 = r0
        L34:
            r0 = r6
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r7
            r0.<init>(r1, r2, r3, r4)
            java.lang.String r0 = "unobfuscatedPhoneInfo"
            r9.optString(r0)
            return r6
    }

    /* renamed from: Y */
    public static java.util.List<p124h7.C2788oe> m7023Y(org.json.JSONArray r3) {
            if (r3 == 0) goto L24
            int r0 = r3.length()
            if (r0 != 0) goto L9
            goto L24
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        Lf:
            int r2 = r3.length()
            if (r1 >= r2) goto L23
            org.json.JSONObject r2 = r3.getJSONObject(r1)
            h7.oe r2 = m7022X(r2)
            r0.add(r2)
            int r1 = r1 + 1
            goto Lf
        L23:
            return r0
        L24:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            return r3
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r6 = 20293(0x4f45, float:2.8437E-41)
            int r6 = p270p6.C5369c.m11723k(r5, r6)
            r0 = 1
            java.lang.String r1 = r4.f11807Y
            r2 = 0
            p270p6.C5369c.m11719g(r5, r0, r1, r2)
            r0 = 2
            java.lang.String r1 = r4.f11808Z
            p270p6.C5369c.m11719g(r5, r0, r1, r2)
            r0 = 3
            java.lang.String r1 = r4.f11809a0
            p270p6.C5369c.m11719g(r5, r0, r1, r2)
            r0 = 4
            long r1 = r4.f11810b0
            r3 = 8
            p270p6.C5369c.m11724l(r5, r0, r3)
            r5.writeLong(r1)
            p270p6.C5369c.m11726n(r5, r6)
            return
    }
}
