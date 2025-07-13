package p124h7;

/* renamed from: h7.ff */
/* loaded from: classes.dex */
public final class C2627ff implements p124h7.InterfaceC2553bd<p124h7.C2627ff> {

    /* renamed from: Y */
    public java.lang.String f11518Y;

    public C2627ff() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p124h7.InterfaceC2553bd
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2553bd mo6512e(java.lang.String r3) {
            r2 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.NullPointerException -> L1a org.json.JSONException -> L1c
            r0.<init>(r3)     // Catch: java.lang.NullPointerException -> L1a org.json.JSONException -> L1c
            java.lang.String r1 = "phoneResponseInfo"
            org.json.JSONObject r0 = r0.optJSONObject(r1)     // Catch: java.lang.NullPointerException -> L1a org.json.JSONException -> L1c
            if (r0 == 0) goto L19
            java.lang.String r1 = "sessionInfo"
            java.lang.String r0 = r0.optString(r1)     // Catch: java.lang.NullPointerException -> L1a org.json.JSONException -> L1c
            java.lang.String r0 = p353u6.C6347j.m12998a(r0)     // Catch: java.lang.NullPointerException -> L1a org.json.JSONException -> L1c
            r2.f11518Y = r0     // Catch: java.lang.NullPointerException -> L1a org.json.JSONException -> L1c
        L19:
            return r2
        L1a:
            r0 = move-exception
            goto L1d
        L1c:
            r0 = move-exception
        L1d:
            java.lang.String r1 = "ff"
            h7.kb r3 = p036c6.C0906q0.m2613a(r0, r1, r3)
            throw r3
    }
}
