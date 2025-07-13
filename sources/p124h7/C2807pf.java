package p124h7;

/* renamed from: h7.pf */
/* loaded from: classes.dex */
public final class C2807pf implements p124h7.InterfaceC2553bd<p124h7.C2807pf> {

    /* renamed from: Y */
    public java.lang.String f11836Y;

    /* renamed from: Z */
    public java.lang.String f11837Z;

    /* renamed from: a0 */
    public long f11838a0;

    /* renamed from: b0 */
    public boolean f11839b0;

    /* renamed from: c0 */
    public java.lang.String f11840c0;

    /* renamed from: d0 */
    public java.lang.String f11841d0;

    public C2807pf() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p124h7.InterfaceC2553bd
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2553bd mo6512e(java.lang.String r6) {
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.NullPointerException -> L53 org.json.JSONException -> L55
            r0.<init>(r6)     // Catch: java.lang.NullPointerException -> L53 org.json.JSONException -> L55
            java.lang.String r1 = "idToken"
            r2 = 0
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L53 org.json.JSONException -> L55
            java.lang.String r1 = p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> L53 org.json.JSONException -> L55
            r5.f11836Y = r1     // Catch: java.lang.NullPointerException -> L53 org.json.JSONException -> L55
            java.lang.String r1 = "refreshToken"
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L53 org.json.JSONException -> L55
            java.lang.String r1 = p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> L53 org.json.JSONException -> L55
            r5.f11837Z = r1     // Catch: java.lang.NullPointerException -> L53 org.json.JSONException -> L55
            java.lang.String r1 = "expiresIn"
            r3 = 0
            long r3 = r0.optLong(r1, r3)     // Catch: java.lang.NullPointerException -> L53 org.json.JSONException -> L55
            r5.f11838a0 = r3     // Catch: java.lang.NullPointerException -> L53 org.json.JSONException -> L55
            java.lang.String r1 = "localId"
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L53 org.json.JSONException -> L55
            p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> L53 org.json.JSONException -> L55
            java.lang.String r1 = "isNewUser"
            r3 = 0
            boolean r1 = r0.optBoolean(r1, r3)     // Catch: java.lang.NullPointerException -> L53 org.json.JSONException -> L55
            r5.f11839b0 = r1     // Catch: java.lang.NullPointerException -> L53 org.json.JSONException -> L55
            java.lang.String r1 = "temporaryProof"
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L53 org.json.JSONException -> L55
            java.lang.String r1 = p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> L53 org.json.JSONException -> L55
            r5.f11840c0 = r1     // Catch: java.lang.NullPointerException -> L53 org.json.JSONException -> L55
            java.lang.String r1 = "phoneNumber"
            java.lang.String r0 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L53 org.json.JSONException -> L55
            java.lang.String r0 = p353u6.C6347j.m12998a(r0)     // Catch: java.lang.NullPointerException -> L53 org.json.JSONException -> L55
            r5.f11841d0 = r0     // Catch: java.lang.NullPointerException -> L53 org.json.JSONException -> L55
            return r5
        L53:
            r0 = move-exception
            goto L56
        L55:
            r0 = move-exception
        L56:
            java.lang.String r1 = "pf"
            h7.kb r6 = p036c6.C0906q0.m2613a(r0, r1, r6)
            throw r6
    }
}
