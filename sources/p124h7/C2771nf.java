package p124h7;

/* renamed from: h7.nf */
/* loaded from: classes.dex */
public final class C2771nf implements p124h7.InterfaceC2553bd<p124h7.C2771nf> {

    /* renamed from: Y */
    public java.lang.String f11789Y;

    /* renamed from: Z */
    public java.lang.String f11790Z;

    /* renamed from: a0 */
    public long f11791a0;

    /* renamed from: b0 */
    public java.util.List<p124h7.C2788oe> f11792b0;

    /* renamed from: c0 */
    public java.lang.String f11793c0;

    public C2771nf() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p124h7.InterfaceC2553bd
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2553bd mo6512e(java.lang.String r6) {
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.NullPointerException -> L61 org.json.JSONException -> L63
            r0.<init>(r6)     // Catch: java.lang.NullPointerException -> L61 org.json.JSONException -> L63
            java.lang.String r1 = "localId"
            r2 = 0
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L61 org.json.JSONException -> L63
            p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> L61 org.json.JSONException -> L63
            java.lang.String r1 = "email"
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L61 org.json.JSONException -> L63
            p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> L61 org.json.JSONException -> L63
            java.lang.String r1 = "displayName"
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L61 org.json.JSONException -> L63
            p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> L61 org.json.JSONException -> L63
            java.lang.String r1 = "idToken"
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L61 org.json.JSONException -> L63
            java.lang.String r1 = p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> L61 org.json.JSONException -> L63
            r5.f11789Y = r1     // Catch: java.lang.NullPointerException -> L61 org.json.JSONException -> L63
            java.lang.String r1 = "photoUrl"
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L61 org.json.JSONException -> L63
            p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> L61 org.json.JSONException -> L63
            java.lang.String r1 = "refreshToken"
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L61 org.json.JSONException -> L63
            java.lang.String r1 = p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> L61 org.json.JSONException -> L63
            r5.f11790Z = r1     // Catch: java.lang.NullPointerException -> L61 org.json.JSONException -> L63
            java.lang.String r1 = "expiresIn"
            r3 = 0
            long r3 = r0.optLong(r1, r3)     // Catch: java.lang.NullPointerException -> L61 org.json.JSONException -> L63
            r5.f11791a0 = r3     // Catch: java.lang.NullPointerException -> L61 org.json.JSONException -> L63
            java.lang.String r1 = "mfaInfo"
            org.json.JSONArray r1 = r0.optJSONArray(r1)     // Catch: java.lang.NullPointerException -> L61 org.json.JSONException -> L63
            java.util.List r1 = p124h7.C2788oe.m7023Y(r1)     // Catch: java.lang.NullPointerException -> L61 org.json.JSONException -> L63
            r5.f11792b0 = r1     // Catch: java.lang.NullPointerException -> L61 org.json.JSONException -> L63
            java.lang.String r1 = "mfaPendingCredential"
            java.lang.String r0 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L61 org.json.JSONException -> L63
            r5.f11793c0 = r0     // Catch: java.lang.NullPointerException -> L61 org.json.JSONException -> L63
            return r5
        L61:
            r0 = move-exception
            goto L64
        L63:
            r0 = move-exception
        L64:
            java.lang.String r1 = "nf"
            h7.kb r6 = p036c6.C0906q0.m2613a(r0, r1, r6)
            throw r6
    }
}
