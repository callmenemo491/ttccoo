package p124h7;

/* renamed from: h7.ce */
/* loaded from: classes.dex */
public final class C2572ce implements p124h7.InterfaceC2553bd<p124h7.C2572ce> {

    /* renamed from: Y */
    public java.lang.String f11422Y;

    /* renamed from: Z */
    public java.lang.String f11423Z;

    public C2572ce() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p124h7.InterfaceC2553bd
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2553bd mo6512e(java.lang.String r4) {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.NullPointerException -> L17 org.json.JSONException -> L19
            r0.<init>(r4)     // Catch: java.lang.NullPointerException -> L17 org.json.JSONException -> L19
            java.lang.String r1 = "idToken"
            r2 = 0
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L17 org.json.JSONException -> L19
            r3.f11422Y = r1     // Catch: java.lang.NullPointerException -> L17 org.json.JSONException -> L19
            java.lang.String r1 = "refreshToken"
            java.lang.String r0 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L17 org.json.JSONException -> L19
            r3.f11423Z = r0     // Catch: java.lang.NullPointerException -> L17 org.json.JSONException -> L19
            return r3
        L17:
            r0 = move-exception
            goto L1a
        L19:
            r0 = move-exception
        L1a:
            java.lang.String r1 = "ce"
            h7.kb r4 = p036c6.C0906q0.m2613a(r0, r1, r4)
            throw r4
    }
}
