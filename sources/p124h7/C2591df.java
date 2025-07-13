package p124h7;

/* renamed from: h7.df */
/* loaded from: classes.dex */
public final class C2591df implements p124h7.InterfaceC2553bd<p124h7.C2591df> {

    /* renamed from: Y */
    public java.lang.String f11467Y;

    public C2591df() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p124h7.InterfaceC2553bd
    /* renamed from: e */
    public final p124h7.InterfaceC2553bd mo6512e(java.lang.String r3) {
            r2 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.NullPointerException -> L27 org.json.JSONException -> L29
            r0.<init>(r3)     // Catch: java.lang.NullPointerException -> L27 org.json.JSONException -> L29
            java.lang.String r1 = "phoneSessionInfo"
            org.json.JSONObject r0 = r0.optJSONObject(r1)     // Catch: java.lang.NullPointerException -> L27 org.json.JSONException -> L29
            if (r0 == 0) goto L26
            java.lang.String r1 = "sessionInfo"
            java.lang.String r0 = r0.optString(r1)     // Catch: java.lang.NullPointerException -> L27 org.json.JSONException -> L29
            int r1 = p124h7.C2896ue.f11946a     // Catch: java.lang.NullPointerException -> L27 org.json.JSONException -> L29
            if (r0 == 0) goto L20
            boolean r1 = r0.isEmpty()     // Catch: java.lang.NullPointerException -> L27 org.json.JSONException -> L29
            if (r1 == 0) goto L1e
            goto L20
        L1e:
            r1 = 0
            goto L21
        L20:
            r1 = 1
        L21:
            if (r1 == 0) goto L24
            r0 = 0
        L24:
            r2.f11467Y = r0     // Catch: java.lang.NullPointerException -> L27 org.json.JSONException -> L29
        L26:
            return r2
        L27:
            r0 = move-exception
            goto L2a
        L29:
            r0 = move-exception
        L2a:
            java.lang.String r1 = "df"
            h7.kb r3 = p036c6.C0906q0.m2613a(r0, r1, r3)
            throw r3
    }
}
