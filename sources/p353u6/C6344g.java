package p353u6;

/* renamed from: u6.g */
/* loaded from: classes.dex */
public final class C6344g {
    static {
            java.lang.String r0 = "\\\\."
            java.util.regex.Pattern.compile(r0)
            java.lang.String r0 = "[\\\\\"/\b\f\n\r\t]"
            java.util.regex.Pattern.compile(r0)
            return
    }

    /* renamed from: a */
    public static boolean m12994a(java.lang.Object r5, java.lang.Object r6) {
            r0 = 1
            if (r5 != 0) goto L6
            if (r6 != 0) goto L6
            return r0
        L6:
            r1 = 0
            if (r5 == 0) goto L87
            if (r6 != 0) goto Ld
            goto L87
        Ld:
            boolean r2 = r5 instanceof org.json.JSONObject
            if (r2 == 0) goto L50
            boolean r2 = r6 instanceof org.json.JSONObject
            if (r2 == 0) goto L50
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            int r2 = r5.length()
            int r3 = r6.length()
            if (r2 == r3) goto L24
            return r1
        L24:
            java.util.Iterator r2 = r5.keys()
        L28:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4f
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r6.has(r3)
            if (r4 != 0) goto L3b
            return r1
        L3b:
            java.lang.String r4 = "null reference"
            java.util.Objects.requireNonNull(r3, r4)     // Catch: org.json.JSONException -> L4e
            java.lang.Object r4 = r5.get(r3)     // Catch: org.json.JSONException -> L4e
            java.lang.Object r3 = r6.get(r3)     // Catch: org.json.JSONException -> L4e
            boolean r3 = m12994a(r4, r3)     // Catch: org.json.JSONException -> L4e
            if (r3 != 0) goto L28
        L4e:
            return r1
        L4f:
            return r0
        L50:
            boolean r2 = r5 instanceof org.json.JSONArray
            if (r2 == 0) goto L82
            boolean r2 = r6 instanceof org.json.JSONArray
            if (r2 == 0) goto L82
            org.json.JSONArray r5 = (org.json.JSONArray) r5
            org.json.JSONArray r6 = (org.json.JSONArray) r6
            int r2 = r5.length()
            int r3 = r6.length()
            if (r2 == r3) goto L67
            return r1
        L67:
            r2 = 0
        L68:
            int r3 = r5.length()
            if (r2 >= r3) goto L81
            java.lang.Object r3 = r5.get(r2)     // Catch: org.json.JSONException -> L80
            java.lang.Object r4 = r6.get(r2)     // Catch: org.json.JSONException -> L80
            boolean r3 = m12994a(r3, r4)     // Catch: org.json.JSONException -> L80
            if (r3 != 0) goto L7d
            return r1
        L7d:
            int r2 = r2 + 1
            goto L68
        L80:
            return r1
        L81:
            return r0
        L82:
            boolean r5 = r5.equals(r6)
            return r5
        L87:
            return r1
    }
}
