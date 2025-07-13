package p411x9;

/* renamed from: x9.u */
/* loaded from: classes.dex */
public final class C7002u {

    /* renamed from: a */
    public static final java.util.Map<java.lang.String, java.lang.String> f27298a = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            p411x9.C7002u.f27298a = r0
            java.lang.String r1 = "auth/invalid-provider-id"
            java.lang.String r2 = "INVALID_PROVIDER_ID"
            r0.put(r1, r2)
            java.lang.String r1 = "auth/invalid-cert-hash"
            java.lang.String r2 = "INVALID_CERT_HASH"
            r0.put(r1, r2)
            java.lang.String r1 = "auth/network-request-failed"
            java.lang.String r2 = "WEB_NETWORK_REQUEST_FAILED"
            r0.put(r1, r2)
            java.lang.String r1 = "auth/web-storage-unsupported"
            java.lang.String r2 = "WEB_STORAGE_UNSUPPORTED"
            r0.put(r1, r2)
            java.lang.String r1 = "auth/operation-not-allowed"
            java.lang.String r2 = "OPERATION_NOT_ALLOWED"
            r0.put(r1, r2)
            return
    }

    /* renamed from: a */
    public static com.google.android.gms.common.api.Status m14148a(java.lang.String r5) {
            java.lang.String r0 = "WEB_INTERNAL_ERROR:"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L77
            r1.<init>(r5)     // Catch: org.json.JSONException -> L77
            java.lang.String r2 = "code"
            java.lang.String r2 = r1.getString(r2)     // Catch: org.json.JSONException -> L77
            java.lang.String r3 = "message"
            java.lang.String r1 = r1.getString(r3)     // Catch: org.json.JSONException -> L77
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: org.json.JSONException -> L77
            if (r3 != 0) goto L5e
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L77
            if (r3 != 0) goto L5e
            java.util.Map<java.lang.String, java.lang.String> r3 = p411x9.C7002u.f27298a     // Catch: org.json.JSONException -> L77
            r4 = r3
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: org.json.JSONException -> L77
            boolean r4 = r4.containsKey(r2)     // Catch: org.json.JSONException -> L77
            if (r4 == 0) goto L5e
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch: org.json.JSONException -> L77
            java.lang.Object r2 = r3.get(r2)     // Catch: org.json.JSONException -> L77
            java.lang.String r2 = (java.lang.String) r2     // Catch: org.json.JSONException -> L77
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch: org.json.JSONException -> L77
            int r3 = r3.length()     // Catch: org.json.JSONException -> L77
            int r3 = r3 + 1
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch: org.json.JSONException -> L77
            int r4 = r4.length()     // Catch: org.json.JSONException -> L77
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L77
            r4.<init>(r3)     // Catch: org.json.JSONException -> L77
            r4.append(r2)     // Catch: org.json.JSONException -> L77
            java.lang.String r2 = ":"
            r4.append(r2)     // Catch: org.json.JSONException -> L77
            r4.append(r1)     // Catch: org.json.JSONException -> L77
            java.lang.String r1 = r4.toString()     // Catch: org.json.JSONException -> L77
            com.google.android.gms.common.api.Status r5 = p074e9.C1805a.m4514B(r1)     // Catch: org.json.JSONException -> L77
            return r5
        L5e:
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch: org.json.JSONException -> L77
            int r2 = r1.length()     // Catch: org.json.JSONException -> L77
            if (r2 == 0) goto L6d
            java.lang.String r1 = r0.concat(r1)     // Catch: org.json.JSONException -> L77
            goto L72
        L6d:
            java.lang.String r1 = new java.lang.String     // Catch: org.json.JSONException -> L77
            r1.<init>(r0)     // Catch: org.json.JSONException -> L77
        L72:
            com.google.android.gms.common.api.Status r5 = p074e9.C1805a.m4514B(r1)     // Catch: org.json.JSONException -> L77
            return r5
        L77:
            r1 = move-exception
            java.lang.String r1 = r1.getLocalizedMessage()
            java.lang.String r2 = java.lang.String.valueOf(r5)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 23
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = "[ "
            p179k1.C3661s.m8090a(r4, r0, r5, r2, r1)
            java.lang.String r5 = " ]"
            r4.append(r5)
            java.lang.String r5 = r4.toString()
            com.google.android.gms.common.api.Status r5 = p074e9.C1805a.m4514B(r5)
            return r5
    }
}
