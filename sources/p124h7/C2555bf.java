package p124h7;

/* renamed from: h7.bf */
/* loaded from: classes.dex */
public final class C2555bf implements p124h7.InterfaceC2553bd<p124h7.C2555bf> {

    /* renamed from: Y */
    public java.lang.String f11408Y;

    /* renamed from: Z */
    public p124h7.C2860se f11409Z;

    /* renamed from: a0 */
    public java.lang.String f11410a0;

    /* renamed from: b0 */
    public java.lang.String f11411b0;

    /* renamed from: c0 */
    public long f11412c0;

    public C2555bf() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p124h7.InterfaceC2553bd
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2553bd mo6512e(java.lang.String r5) {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.NullPointerException -> L62 org.json.JSONException -> L64
            r0.<init>(r5)     // Catch: java.lang.NullPointerException -> L62 org.json.JSONException -> L64
            java.lang.String r1 = "email"
            r2 = 0
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L62 org.json.JSONException -> L64
            java.lang.String r1 = p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> L62 org.json.JSONException -> L64
            r4.f11408Y = r1     // Catch: java.lang.NullPointerException -> L62 org.json.JSONException -> L64
            java.lang.String r1 = "passwordHash"
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L62 org.json.JSONException -> L64
            p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> L62 org.json.JSONException -> L64
            java.lang.String r1 = "emailVerified"
            r3 = 0
            r0.optBoolean(r1, r3)     // Catch: java.lang.NullPointerException -> L62 org.json.JSONException -> L64
            java.lang.String r1 = "displayName"
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L62 org.json.JSONException -> L64
            p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> L62 org.json.JSONException -> L64
            java.lang.String r1 = "photoUrl"
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L62 org.json.JSONException -> L64
            p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> L62 org.json.JSONException -> L64
            java.lang.String r1 = "providerUserInfo"
            org.json.JSONArray r1 = r0.optJSONArray(r1)     // Catch: java.lang.NullPointerException -> L62 org.json.JSONException -> L64
            h7.se r1 = p124h7.C2860se.m7138X(r1)     // Catch: java.lang.NullPointerException -> L62 org.json.JSONException -> L64
            r4.f11409Z = r1     // Catch: java.lang.NullPointerException -> L62 org.json.JSONException -> L64
            java.lang.String r1 = "idToken"
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L62 org.json.JSONException -> L64
            java.lang.String r1 = p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> L62 org.json.JSONException -> L64
            r4.f11410a0 = r1     // Catch: java.lang.NullPointerException -> L62 org.json.JSONException -> L64
            java.lang.String r1 = "refreshToken"
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L62 org.json.JSONException -> L64
            java.lang.String r1 = p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> L62 org.json.JSONException -> L64
            r4.f11411b0 = r1     // Catch: java.lang.NullPointerException -> L62 org.json.JSONException -> L64
            java.lang.String r1 = "expiresIn"
            r2 = 0
            long r0 = r0.optLong(r1, r2)     // Catch: java.lang.NullPointerException -> L62 org.json.JSONException -> L64
            r4.f11412c0 = r0     // Catch: java.lang.NullPointerException -> L62 org.json.JSONException -> L64
            return r4
        L62:
            r0 = move-exception
            goto L65
        L64:
            r0 = move-exception
        L65:
            java.lang.String r1 = "bf"
            h7.kb r5 = p036c6.C0906q0.m2613a(r0, r1, r5)
            throw r5
    }
}
