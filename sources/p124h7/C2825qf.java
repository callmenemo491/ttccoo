package p124h7;

/* renamed from: h7.qf */
/* loaded from: classes.dex */
public final class C2825qf implements p124h7.InterfaceC2553bd<p124h7.C2825qf> {

    /* renamed from: Y */
    public java.lang.String f11871Y;

    /* renamed from: Z */
    public java.lang.String f11872Z;

    public C2825qf() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p124h7.InterfaceC2553bd
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2553bd mo6512e(java.lang.String r4) {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.NullPointerException -> L1f org.json.JSONException -> L21
            r0.<init>(r4)     // Catch: java.lang.NullPointerException -> L1f org.json.JSONException -> L21
            java.lang.String r1 = "idToken"
            r2 = 0
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L1f org.json.JSONException -> L21
            java.lang.String r1 = p353u6.C6347j.m12998a(r1)     // Catch: java.lang.NullPointerException -> L1f org.json.JSONException -> L21
            r3.f11871Y = r1     // Catch: java.lang.NullPointerException -> L1f org.json.JSONException -> L21
            java.lang.String r1 = "refreshToken"
            java.lang.String r0 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L1f org.json.JSONException -> L21
            java.lang.String r0 = p353u6.C6347j.m12998a(r0)     // Catch: java.lang.NullPointerException -> L1f org.json.JSONException -> L21
            r3.f11872Z = r0     // Catch: java.lang.NullPointerException -> L1f org.json.JSONException -> L21
            return r3
        L1f:
            r0 = move-exception
            goto L22
        L21:
            r0 = move-exception
        L22:
            java.lang.String r1 = "qf"
            h7.kb r4 = p036c6.C0906q0.m2613a(r0, r1, r4)
            throw r4
    }
}
