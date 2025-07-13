package p124h7;

/* renamed from: h7.ud */
/* loaded from: classes.dex */
public final class C2895ud implements p124h7.InterfaceC2553bd<p124h7.C2895ud> {

    /* renamed from: Y */
    public java.lang.String f11945Y;

    public C2895ud() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public final p124h7.C2895ud m7178a(java.lang.String r7) {
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.NullPointerException -> L1e org.json.JSONException -> L20
            r0.<init>(r7)     // Catch: java.lang.NullPointerException -> L1e org.json.JSONException -> L20
            java.lang.String r1 = "error"
            java.lang.String r0 = r0.getString(r1)     // Catch: java.lang.NullPointerException -> L1e org.json.JSONException -> L20
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.NullPointerException -> L1e org.json.JSONException -> L20
            r1.<init>(r0)     // Catch: java.lang.NullPointerException -> L1e org.json.JSONException -> L20
            java.lang.String r0 = "code"
            r1.getInt(r0)     // Catch: java.lang.NullPointerException -> L1e org.json.JSONException -> L20
            java.lang.String r0 = "message"
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.NullPointerException -> L1e org.json.JSONException -> L20
            r6.f11945Y = r0     // Catch: java.lang.NullPointerException -> L1e org.json.JSONException -> L20
            return r6
        L1e:
            r0 = move-exception
            goto L21
        L20:
            r0 = move-exception
        L21:
            java.lang.String r1 = "h7.ud"
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = java.lang.String.valueOf(r7)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 52
            int r3 = r3 + r4
            r5.<init>(r3)
            java.lang.String r3 = "Failed to parse error for string ["
            r5.append(r3)
            r5.append(r7)
            java.lang.String r4 = "] with exception: "
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            android.util.Log.e(r1, r2)
            h7.kb r1 = new h7.kb
            java.lang.String r2 = java.lang.String.valueOf(r7)
            int r2 = r2.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 35
            r4.<init>(r2)
            java.lang.String r2 = "]"
            java.lang.String r7 = p083f.C1932s.m4774a(r4, r3, r7, r2)
            r1.<init>(r7, r0)
            throw r1
    }

    @Override // p124h7.InterfaceC2553bd
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2553bd mo6512e(java.lang.String r1) {
            r0 = this;
            r0.m7178a(r1)
            return r0
    }
}
