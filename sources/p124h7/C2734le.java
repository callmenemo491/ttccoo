package p124h7;

/* renamed from: h7.le */
/* loaded from: classes.dex */
public final class C2734le implements p124h7.InterfaceC2553bd<p124h7.C2734le> {

    /* renamed from: Y */
    public java.util.List<java.lang.String> f11749Y;

    public C2734le() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public final p124h7.C2734le m6965a(java.lang.String r5) {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L28
            r0.<init>(r5)     // Catch: org.json.JSONException -> L28
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: org.json.JSONException -> L28
            r1.<init>()     // Catch: org.json.JSONException -> L28
            r4.f11749Y = r1     // Catch: org.json.JSONException -> L28
            java.lang.String r1 = "authorizedDomains"
            org.json.JSONArray r0 = r0.optJSONArray(r1)     // Catch: org.json.JSONException -> L28
            if (r0 == 0) goto L27
            r1 = 0
        L15:
            int r2 = r0.length()     // Catch: org.json.JSONException -> L28
            if (r1 >= r2) goto L27
            java.util.List<java.lang.String> r2 = r4.f11749Y     // Catch: org.json.JSONException -> L28
            java.lang.String r3 = r0.getString(r1)     // Catch: org.json.JSONException -> L28
            r2.add(r3)     // Catch: org.json.JSONException -> L28
            int r1 = r1 + 1
            goto L15
        L27:
            return r4
        L28:
            r0 = move-exception
            java.lang.String r1 = "le"
            h7.kb r5 = p036c6.C0906q0.m2613a(r0, r1, r5)
            throw r5
    }

    @Override // p124h7.InterfaceC2553bd
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2553bd mo6512e(java.lang.String r1) {
            r0 = this;
            r0.m6965a(r1)
            return r0
    }
}
