package p375v9;

/* renamed from: v9.w */
/* loaded from: classes.dex */
public class C6625w extends p375v9.AbstractC6621s {
    public static final android.os.Parcelable.Creator<p375v9.C6625w> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f25804Y;

    /* renamed from: Z */
    public final java.lang.String f25805Z;

    /* renamed from: a0 */
    public final long f25806a0;

    /* renamed from: b0 */
    public final java.lang.String f25807b0;

    static {
            v9.d0 r0 = new v9.d0
            r0.<init>()
            p375v9.C6625w.CREATOR = r0
            return
    }

    public C6625w(java.lang.String r1, java.lang.String r2, long r3, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            r0.f25804Y = r1
            r0.f25805Z = r2
            r0.f25806a0 = r3
            com.google.android.gms.common.internal.C1101a.m3100e(r5)
            r0.f25807b0 = r5
            return
    }

    @Override // p375v9.AbstractC6621s
    /* renamed from: X */
    public org.json.JSONObject mo13476X() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "factorIdKey"
            java.lang.String r2 = "phone"
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L2d
            java.lang.String r1 = "uid"
            java.lang.String r2 = r4.f25804Y     // Catch: org.json.JSONException -> L2d
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L2d
            java.lang.String r1 = "displayName"
            java.lang.String r2 = r4.f25805Z     // Catch: org.json.JSONException -> L2d
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L2d
            java.lang.String r1 = "enrollmentTimestamp"
            long r2 = r4.f25806a0     // Catch: org.json.JSONException -> L2d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: org.json.JSONException -> L2d
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L2d
            java.lang.String r1 = "phoneNumber"
            java.lang.String r2 = r4.f25807b0     // Catch: org.json.JSONException -> L2d
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L2d
            return r0
        L2d:
            r0 = move-exception
            java.lang.String r1 = "PhoneMultiFactorInfo"
            java.lang.String r2 = "Failed to jsonify this object"
            android.util.Log.d(r1, r2)
            h7.g8 r1 = new h7.g8
            r1.<init>(r0)
            throw r1
    }

    @Override // android.os.Parcelable
    @android.annotation.SuppressLint({"FirebaseUnknownNullness"})
    public void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            r7 = 20293(0x4f45, float:2.8437E-41)
            int r7 = p270p6.C5369c.m11723k(r6, r7)
            java.lang.String r0 = r5.f25804Y
            r1 = 1
            r2 = 0
            p270p6.C5369c.m11719g(r6, r1, r0, r2)
            java.lang.String r0 = r5.f25805Z
            r1 = 2
            p270p6.C5369c.m11719g(r6, r1, r0, r2)
            long r0 = r5.f25806a0
            r3 = 3
            r4 = 8
            p270p6.C5369c.m11724l(r6, r3, r4)
            r6.writeLong(r0)
            java.lang.String r0 = r5.f25807b0
            r1 = 4
            p270p6.C5369c.m11719g(r6, r1, r0, r2)
            p270p6.C5369c.m11726n(r6, r7)
            return
    }
}
