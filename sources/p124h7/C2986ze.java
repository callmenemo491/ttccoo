package p124h7;

/* renamed from: h7.ze */
/* loaded from: classes.dex */
public final class C2986ze implements p124h7.InterfaceC2553bd<p124h7.C2986ze> {

    /* renamed from: Y */
    public java.lang.String f12071Y;

    public C2986ze() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p124h7.InterfaceC2553bd
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2553bd mo6512e(java.lang.String r4) {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.NullPointerException -> L13 org.json.JSONException -> L15
            r0.<init>(r4)     // Catch: java.lang.NullPointerException -> L13 org.json.JSONException -> L15
            java.lang.String r1 = "sessionInfo"
            r2 = 0
            java.lang.String r0 = r0.optString(r1, r2)     // Catch: java.lang.NullPointerException -> L13 org.json.JSONException -> L15
            java.lang.String r0 = p353u6.C6347j.m12998a(r0)     // Catch: java.lang.NullPointerException -> L13 org.json.JSONException -> L15
            r3.f12071Y = r0     // Catch: java.lang.NullPointerException -> L13 org.json.JSONException -> L15
            return r3
        L13:
            r0 = move-exception
            goto L16
        L15:
            r0 = move-exception
        L16:
            java.lang.String r1 = "ze"
            h7.kb r4 = p036c6.C0906q0.m2613a(r0, r1, r4)
            throw r4
    }
}
