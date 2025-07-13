package p124h7;

/* renamed from: h7.kf */
/* loaded from: classes.dex */
public final class C2717kf implements p124h7.InterfaceC2553bd<p124h7.C2717kf> {

    /* renamed from: Y */
    public boolean f11709Y;

    /* renamed from: Z */
    public java.lang.String f11710Z;

    /* renamed from: a0 */
    public java.lang.String f11711a0;

    /* renamed from: b0 */
    public long f11712b0;

    /* renamed from: c0 */
    public java.lang.String f11713c0;

    /* renamed from: d0 */
    public java.lang.String f11714d0;

    /* renamed from: e0 */
    public java.lang.String f11715e0;

    /* renamed from: f0 */
    public boolean f11716f0;

    /* renamed from: g0 */
    public java.lang.String f11717g0;

    /* renamed from: h0 */
    public java.lang.String f11718h0;

    /* renamed from: i0 */
    public java.lang.String f11719i0;

    /* renamed from: j0 */
    public java.lang.String f11720j0;

    /* renamed from: k0 */
    public java.lang.String f11721k0;

    /* renamed from: l0 */
    public java.lang.String f11722l0;

    /* renamed from: m0 */
    public java.util.List<p124h7.C2788oe> f11723m0;

    /* renamed from: n0 */
    public java.lang.String f11724n0;

    public C2717kf() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public final p375v9.C6605j0 m6949a() {
            r9 = this;
            java.lang.String r0 = r9.f11717g0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L13
            java.lang.String r0 = r9.f11718h0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L11
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
            java.lang.String r2 = r9.f11714d0
            java.lang.String r3 = r9.f11718h0
            java.lang.String r4 = r9.f11717g0
            java.lang.String r6 = r9.f11721k0
            java.lang.String r7 = r9.f11719i0
            java.lang.String r0 = "Must specify a non-empty providerId"
            com.google.android.gms.common.internal.C1101a.m3101f(r2, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L37
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L2f
            goto L37
        L2f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must specify an idToken or an accessToken."
            r0.<init>(r1)
            throw r0
        L37:
            v9.j0 r0 = new v9.j0
            r5 = 0
            r8 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @Override // p124h7.InterfaceC2553bd
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2553bd mo6512e(java.lang.String r7) {
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            r0.<init>(r7)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = "needConfirmation"
            r2 = 0
            boolean r1 = r0.optBoolean(r1, r2)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            r6.f11709Y = r1     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = "needEmail"
            r0.optBoolean(r1, r2)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = "idToken"
            r3 = 0
            java.lang.String r1 = r0.optString(r1, r3)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            r6.f11710Z = r1     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = "refreshToken"
            java.lang.String r1 = r0.optString(r1, r3)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            r6.f11711a0 = r1     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = "expiresIn"
            r4 = 0
            long r4 = r0.optLong(r1, r4)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            r6.f11712b0 = r4     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = "localId"
            java.lang.String r1 = r0.optString(r1, r3)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = "email"
            java.lang.String r1 = r0.optString(r1, r3)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            r6.f11713c0 = r1     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = "displayName"
            java.lang.String r1 = r0.optString(r1, r3)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = "photoUrl"
            java.lang.String r1 = r0.optString(r1, r3)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = "providerId"
            java.lang.String r1 = r0.optString(r1, r3)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            r6.f11714d0 = r1     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = "rawUserInfo"
            java.lang.String r1 = r0.optString(r1, r3)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            r6.f11715e0 = r1     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = "isNewUser"
            boolean r1 = r0.optBoolean(r1, r2)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            r6.f11716f0 = r1     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = "oauthAccessToken"
            java.lang.String r1 = r0.optString(r1, r3)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            r6.f11717g0 = r1     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = "oauthIdToken"
            java.lang.String r1 = r0.optString(r1, r3)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            r6.f11718h0 = r1     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = "errorMessage"
            java.lang.String r1 = r0.optString(r1, r3)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            r6.f11720j0 = r1     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = "pendingToken"
            java.lang.String r1 = r0.optString(r1, r3)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            r6.f11721k0 = r1     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = "tenantId"
            java.lang.String r1 = r0.optString(r1, r3)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            r6.f11722l0 = r1     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = "mfaInfo"
            org.json.JSONArray r1 = r0.optJSONArray(r1)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.util.List r1 = p124h7.C2788oe.m7023Y(r1)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            r6.f11723m0 = r1     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = "mfaPendingCredential"
            java.lang.String r1 = r0.optString(r1, r3)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            r6.f11724n0 = r1     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r1 = "oauthTokenSecret"
            java.lang.String r0 = r0.optString(r1, r3)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            java.lang.String r0 = p353u6.C6347j.m12998a(r0)     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            r6.f11719i0 = r0     // Catch: java.lang.NullPointerException -> Ld6 org.json.JSONException -> Ld8
            return r6
        Ld6:
            r0 = move-exception
            goto Ld9
        Ld8:
            r0 = move-exception
        Ld9:
            java.lang.String r1 = "kf"
            h7.kb r7 = p036c6.C0906q0.m2613a(r0, r1, r7)
            throw r7
    }
}
