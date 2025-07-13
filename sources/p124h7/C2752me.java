package p124h7;

/* renamed from: h7.me */
/* loaded from: classes.dex */
public final class C2752me extends p270p6.AbstractC5367a implements p124h7.InterfaceC2553bd<p124h7.C2752me> {
    public static final android.os.Parcelable.Creator<p124h7.C2752me> CREATOR = null;

    /* renamed from: d0 */
    public static final java.lang.String f11771d0 = null;

    /* renamed from: Y */
    public java.lang.String f11772Y;

    /* renamed from: Z */
    public java.lang.String f11773Z;

    /* renamed from: a0 */
    public java.lang.Long f11774a0;

    /* renamed from: b0 */
    public java.lang.String f11775b0;

    /* renamed from: c0 */
    public java.lang.Long f11776c0;

    static {
            java.lang.Class<h7.me> r0 = p124h7.C2752me.class
            java.lang.String r0 = r0.getSimpleName()
            p124h7.C2752me.f11771d0 = r0
            h7.ne r0 = new h7.ne
            r0.<init>()
            p124h7.C2752me.CREATOR = r0
            return
    }

    public C2752me() {
            r2 = this;
            r2.<init>()
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.f11776c0 = r0
            return
    }

    public C2752me(java.lang.String r3, java.lang.String r4, java.lang.Long r5, java.lang.String r6) {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.<init>()
            r2.f11772Y = r3
            r2.f11773Z = r4
            r2.f11774a0 = r5
            r2.f11775b0 = r6
            r2.f11776c0 = r0
            return
    }

    public C2752me(java.lang.String r1, java.lang.String r2, java.lang.Long r3, java.lang.String r4, java.lang.Long r5) {
            r0 = this;
            r0.<init>()
            r0.f11772Y = r1
            r0.f11773Z = r2
            r0.f11774a0 = r3
            r0.f11775b0 = r4
            r0.f11776c0 = r5
            return
    }

    /* renamed from: X */
    public static p124h7.C2752me m6985X(java.lang.String r5) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3c
            r0.<init>(r5)     // Catch: org.json.JSONException -> L3c
            h7.me r5 = new h7.me     // Catch: org.json.JSONException -> L3c
            r5.<init>()     // Catch: org.json.JSONException -> L3c
            java.lang.String r1 = "refresh_token"
            r2 = 0
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: org.json.JSONException -> L3c
            r5.f11772Y = r1     // Catch: org.json.JSONException -> L3c
            java.lang.String r1 = "access_token"
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: org.json.JSONException -> L3c
            r5.f11773Z = r1     // Catch: org.json.JSONException -> L3c
            java.lang.String r1 = "expires_in"
            long r3 = r0.optLong(r1)     // Catch: org.json.JSONException -> L3c
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch: org.json.JSONException -> L3c
            r5.f11774a0 = r1     // Catch: org.json.JSONException -> L3c
            java.lang.String r1 = "token_type"
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: org.json.JSONException -> L3c
            r5.f11775b0 = r1     // Catch: org.json.JSONException -> L3c
            java.lang.String r1 = "issued_at"
            long r0 = r0.optLong(r1)     // Catch: org.json.JSONException -> L3c
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: org.json.JSONException -> L3c
            r5.f11776c0 = r0     // Catch: org.json.JSONException -> L3c
            return r5
        L3c:
            r5 = move-exception
            java.lang.String r0 = p124h7.C2752me.f11771d0
            java.lang.String r1 = "Failed to read GetTokenResponse from JSONObject"
            android.util.Log.d(r0, r1)
            h7.g8 r0 = new h7.g8
            r0.<init>(r5)
            throw r0
    }

    /* renamed from: Y */
    public final java.lang.String m6986Y() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "refresh_token"
            java.lang.String r2 = r3.f11772Y     // Catch: org.json.JSONException -> L2d
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L2d
            java.lang.String r1 = "access_token"
            java.lang.String r2 = r3.f11773Z     // Catch: org.json.JSONException -> L2d
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L2d
            java.lang.String r1 = "expires_in"
            java.lang.Long r2 = r3.f11774a0     // Catch: org.json.JSONException -> L2d
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L2d
            java.lang.String r1 = "token_type"
            java.lang.String r2 = r3.f11775b0     // Catch: org.json.JSONException -> L2d
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L2d
            java.lang.String r1 = "issued_at"
            java.lang.Long r2 = r3.f11776c0     // Catch: org.json.JSONException -> L2d
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L2d
            java.lang.String r0 = r0.toString()     // Catch: org.json.JSONException -> L2d
            return r0
        L2d:
            r0 = move-exception
            java.lang.String r1 = p124h7.C2752me.f11771d0
            java.lang.String r2 = "Failed to convert GetTokenResponse to JSON"
            android.util.Log.d(r1, r2)
            h7.g8 r1 = new h7.g8
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: Z */
    public final boolean m6987Z() {
            r8 = this;
            java.lang.Long r0 = r8.f11776c0
            long r0 = r0.longValue()
            java.lang.Long r2 = r8.f11774a0
            long r2 = r2.longValue()
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 300000(0x493e0, double:1.482197E-318)
            long r4 = r4 + r6
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r6
            long r2 = r2 + r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L1f
            r0 = 1
            return r0
        L1f:
            r0 = 0
            return r0
    }

    @Override // p124h7.InterfaceC2553bd
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2553bd mo6512e(java.lang.String r5) {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.NullPointerException -> L42 org.json.JSONException -> L44
            r0.<init>(r5)     // Catch: java.lang.NullPointerException -> L42 org.json.JSONException -> L44
            java.lang.String r1 = "refresh_token"
            java.lang.String r1 = r0.optString(r1)     // Catch: java.lang.NullPointerException -> L42 org.json.JSONException -> L44
            java.lang.String r1 = p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> L42 org.json.JSONException -> L44
            r4.f11772Y = r1     // Catch: java.lang.NullPointerException -> L42 org.json.JSONException -> L44
            java.lang.String r1 = "access_token"
            java.lang.String r1 = r0.optString(r1)     // Catch: java.lang.NullPointerException -> L42 org.json.JSONException -> L44
            java.lang.String r1 = p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> L42 org.json.JSONException -> L44
            r4.f11773Z = r1     // Catch: java.lang.NullPointerException -> L42 org.json.JSONException -> L44
            java.lang.String r1 = "expires_in"
            r2 = 0
            long r1 = r0.optLong(r1, r2)     // Catch: java.lang.NullPointerException -> L42 org.json.JSONException -> L44
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.NullPointerException -> L42 org.json.JSONException -> L44
            r4.f11774a0 = r1     // Catch: java.lang.NullPointerException -> L42 org.json.JSONException -> L44
            java.lang.String r1 = "token_type"
            java.lang.String r0 = r0.optString(r1)     // Catch: java.lang.NullPointerException -> L42 org.json.JSONException -> L44
            java.lang.String r0 = p353u6.C6347j.m12998a(r0)     // Catch: java.lang.NullPointerException -> L42 org.json.JSONException -> L44
            r4.f11775b0 = r0     // Catch: java.lang.NullPointerException -> L42 org.json.JSONException -> L44
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.NullPointerException -> L42 org.json.JSONException -> L44
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.NullPointerException -> L42 org.json.JSONException -> L44
            r4.f11776c0 = r0     // Catch: java.lang.NullPointerException -> L42 org.json.JSONException -> L44
            return r4
        L42:
            r0 = move-exception
            goto L45
        L44:
            r0 = move-exception
        L45:
            java.lang.String r1 = p124h7.C2752me.f11771d0
            h7.kb r5 = p036c6.C0906q0.m2613a(r0, r1, r5)
            throw r5
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            r7 = 20293(0x4f45, float:2.8437E-41)
            int r7 = p270p6.C5369c.m11723k(r6, r7)
            java.lang.String r0 = r5.f11772Y
            r1 = 2
            r2 = 0
            p270p6.C5369c.m11719g(r6, r1, r0, r2)
            java.lang.String r0 = r5.f11773Z
            r1 = 3
            p270p6.C5369c.m11719g(r6, r1, r0, r2)
            java.lang.Long r0 = r5.f11774a0
            if (r0 != 0) goto L1a
            r0 = 0
            goto L1e
        L1a:
            long r0 = r0.longValue()
        L1e:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 4
            p270p6.C5369c.m11717e(r6, r1, r0, r2)
            r0 = 5
            java.lang.String r1 = r5.f11775b0
            p270p6.C5369c.m11719g(r6, r0, r1, r2)
            r0 = 6
            java.lang.Long r1 = r5.f11776c0
            long r3 = r1.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            p270p6.C5369c.m11717e(r6, r0, r1, r2)
            p270p6.C5369c.m11726n(r6, r7)
            return
    }
}
