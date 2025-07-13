package p124h7;

/* renamed from: h7.cf */
/* loaded from: classes.dex */
public final class C2573cf implements p124h7.InterfaceC2553bd<p124h7.C2573cf> {

    /* renamed from: Y */
    public java.lang.String f11424Y;

    /* renamed from: Z */
    public java.lang.String f11425Z;

    /* renamed from: a0 */
    public long f11426a0;

    public C2573cf() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p124h7.InterfaceC2553bd
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2553bd mo6512e(java.lang.String r5) {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.NullPointerException -> L3b org.json.JSONException -> L3d
            r0.<init>(r5)     // Catch: java.lang.NullPointerException -> L3b org.json.JSONException -> L3d
            java.lang.String r1 = "idToken"
            r2 = 0
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L3b org.json.JSONException -> L3d
            java.lang.String r1 = p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> L3b org.json.JSONException -> L3d
            r4.f11424Y = r1     // Catch: java.lang.NullPointerException -> L3b org.json.JSONException -> L3d
            java.lang.String r1 = "displayName"
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L3b org.json.JSONException -> L3d
            p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> L3b org.json.JSONException -> L3d
            java.lang.String r1 = "email"
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L3b org.json.JSONException -> L3d
            p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> L3b org.json.JSONException -> L3d
            java.lang.String r1 = "refreshToken"
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L3b org.json.JSONException -> L3d
            java.lang.String r1 = p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> L3b org.json.JSONException -> L3d
            r4.f11425Z = r1     // Catch: java.lang.NullPointerException -> L3b org.json.JSONException -> L3d
            java.lang.String r1 = "expiresIn"
            r2 = 0
            long r0 = r0.optLong(r1, r2)     // Catch: java.lang.NullPointerException -> L3b org.json.JSONException -> L3d
            r4.f11426a0 = r0     // Catch: java.lang.NullPointerException -> L3b org.json.JSONException -> L3d
            return r4
        L3b:
            r0 = move-exception
            goto L3e
        L3d:
            r0 = move-exception
        L3e:
            java.lang.String r1 = "cf"
            h7.kb r5 = p036c6.C0906q0.m2613a(r0, r1, r5)
            throw r5
    }
}
