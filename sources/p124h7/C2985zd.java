package p124h7;

/* renamed from: h7.zd */
/* loaded from: classes.dex */
public final class C2985zd implements p124h7.InterfaceC2553bd<p124h7.C2985zd> {

    /* renamed from: Y */
    public java.lang.String f12065Y;

    /* renamed from: Z */
    public java.lang.String f12066Z;

    /* renamed from: a0 */
    public boolean f12067a0;

    /* renamed from: b0 */
    public long f12068b0;

    /* renamed from: c0 */
    public java.util.List<p124h7.C2788oe> f12069c0;

    /* renamed from: d0 */
    public java.lang.String f12070d0;

    public C2985zd() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p124h7.InterfaceC2553bd
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2553bd mo6512e(java.lang.String r6) {
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.NullPointerException -> L48 org.json.JSONException -> L4a
            r0.<init>(r6)     // Catch: java.lang.NullPointerException -> L48 org.json.JSONException -> L4a
            java.lang.String r1 = "localId"
            r2 = 0
            r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L48 org.json.JSONException -> L4a
            java.lang.String r1 = "email"
            r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L48 org.json.JSONException -> L4a
            java.lang.String r1 = "idToken"
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L48 org.json.JSONException -> L4a
            r5.f12065Y = r1     // Catch: java.lang.NullPointerException -> L48 org.json.JSONException -> L4a
            java.lang.String r1 = "refreshToken"
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L48 org.json.JSONException -> L4a
            r5.f12066Z = r1     // Catch: java.lang.NullPointerException -> L48 org.json.JSONException -> L4a
            java.lang.String r1 = "isNewUser"
            r3 = 0
            boolean r1 = r0.optBoolean(r1, r3)     // Catch: java.lang.NullPointerException -> L48 org.json.JSONException -> L4a
            r5.f12067a0 = r1     // Catch: java.lang.NullPointerException -> L48 org.json.JSONException -> L4a
            java.lang.String r1 = "expiresIn"
            r3 = 0
            long r3 = r0.optLong(r1, r3)     // Catch: java.lang.NullPointerException -> L48 org.json.JSONException -> L4a
            r5.f12068b0 = r3     // Catch: java.lang.NullPointerException -> L48 org.json.JSONException -> L4a
            java.lang.String r1 = "mfaInfo"
            org.json.JSONArray r1 = r0.optJSONArray(r1)     // Catch: java.lang.NullPointerException -> L48 org.json.JSONException -> L4a
            java.util.List r1 = p124h7.C2788oe.m7023Y(r1)     // Catch: java.lang.NullPointerException -> L48 org.json.JSONException -> L4a
            r5.f12069c0 = r1     // Catch: java.lang.NullPointerException -> L48 org.json.JSONException -> L4a
            java.lang.String r1 = "mfaPendingCredential"
            java.lang.String r0 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L48 org.json.JSONException -> L4a
            r5.f12070d0 = r0     // Catch: java.lang.NullPointerException -> L48 org.json.JSONException -> L4a
            return r5
        L48:
            r0 = move-exception
            goto L4b
        L4a:
            r0 = move-exception
        L4b:
            java.lang.String r1 = "zd"
            h7.kb r6 = p036c6.C0906q0.m2613a(r0, r1, r6)
            throw r6
    }
}
