package p411x9;

/* renamed from: x9.m */
/* loaded from: classes.dex */
public final class C6994m {

    /* renamed from: a */
    public static final p306r6.C5797a f27288a = null;

    static {
            r6.a r0 = new r6.a
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "JSONParser"
            r0.<init>(r2, r1)
            p411x9.C6994m.f27288a = r0
            return
    }

    /* renamed from: a */
    public static java.util.List<java.lang.Object> m14142a(org.json.JSONArray r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.length()
            if (r1 >= r2) goto L2b
            java.lang.Object r2 = r4.get(r1)
            boolean r3 = r2 instanceof org.json.JSONArray
            if (r3 == 0) goto L1b
            org.json.JSONArray r2 = (org.json.JSONArray) r2
            java.util.List r2 = m14142a(r2)
            goto L25
        L1b:
            boolean r3 = r2 instanceof org.json.JSONObject
            if (r3 == 0) goto L25
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            java.util.Map r2 = m14145d(r2)
        L25:
            r0.add(r2)
            int r1 = r1 + 1
            goto L6
        L2b:
            return r0
    }

    /* renamed from: b */
    public static java.util.Map<java.lang.String, java.lang.Object> m14143b(java.lang.String r4) {
            com.google.android.gms.common.internal.C1101a.m3100e(r4)
            h7.v8 r0 = new h7.v8
            r0.<init>()
            h7.hd r1 = new h7.hd
            h7.rb r2 = new h7.rb
            r2.<init>(r0)
            r1.<init>(r2)
            java.util.List r0 = r1.m6809i(r4)
            int r1 = r0.size()
            r2 = 2
            r3 = 0
            if (r1 >= r2) goto L3d
            r6.a r0 = p411x9.C6994m.f27288a
            java.lang.String r1 = "Invalid idToken "
            int r2 = r4.length()
            if (r2 == 0) goto L2d
            java.lang.String r4 = r1.concat(r4)
            goto L32
        L2d:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1)
        L32:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0.m12161b(r4, r1)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            return r4
        L3d:
            r4 = 1
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L61
            if (r4 != 0) goto L4a
            r4 = 0
            goto L50
        L4a:
            r1 = 11
            byte[] r4 = android.util.Base64.decode(r4, r1)     // Catch: java.io.UnsupportedEncodingException -> L61
        L50:
            java.lang.String r1 = "UTF-8"
            r0.<init>(r4, r1)     // Catch: java.io.UnsupportedEncodingException -> L61
            java.util.Map r4 = m14144c(r0)     // Catch: java.io.UnsupportedEncodingException -> L61
            if (r4 != 0) goto L60
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.io.UnsupportedEncodingException -> L61
            r4.<init>()     // Catch: java.io.UnsupportedEncodingException -> L61
        L60:
            return r4
        L61:
            r4 = move-exception
            r6.a r0 = p411x9.C6994m.f27288a
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = r0.f22479a
            java.lang.String r3 = "Unable to decode token"
            java.lang.String r0 = r0.m12162c(r3, r1)
            android.util.Log.e(r2, r0, r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            return r4
    }

    /* renamed from: c */
    public static java.util.Map<java.lang.String, java.lang.Object> m14144c(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L17
            r0.<init>(r2)     // Catch: java.lang.Exception -> L17
            java.lang.Object r2 = org.json.JSONObject.NULL     // Catch: java.lang.Exception -> L17
            if (r0 == r2) goto L16
            java.util.Map r2 = m14145d(r0)     // Catch: java.lang.Exception -> L17
            return r2
        L16:
            return r1
        L17:
            r2 = move-exception
            java.lang.String r0 = "JSONParser"
            java.lang.String r1 = "Failed to parse JSONObject into Map."
            android.util.Log.d(r0, r1)
            h7.g8 r0 = new h7.g8
            r0.<init>(r2)
            throw r0
    }

    /* renamed from: d */
    public static java.util.Map<java.lang.String, java.lang.Object> m14145d(org.json.JSONObject r5) {
            s.a r0 = new s.a
            r0.<init>()
            java.util.Iterator r1 = r5.keys()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r5.get(r2)
            boolean r4 = r3 instanceof org.json.JSONArray
            if (r4 == 0) goto L24
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            java.util.List r3 = m14142a(r3)
            goto L2e
        L24:
            boolean r4 = r3 instanceof org.json.JSONObject
            if (r4 == 0) goto L2e
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            java.util.Map r3 = m14145d(r3)
        L2e:
            r0.put(r2, r3)
            goto L9
        L32:
            return r0
    }
}
