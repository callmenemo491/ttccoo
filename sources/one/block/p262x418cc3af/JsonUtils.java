package one.block.p262x418cc3af;

/* loaded from: classes.dex */
public class JsonUtils {
    public JsonUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.json.JSONObject getJsonFromMap(java.util.Map<java.lang.String, java.lang.Object> r5) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Set r1 = r5.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r5.get(r2)
            boolean r4 = r3 instanceof java.util.Map
            if (r4 == 0) goto L27
            java.util.Map r3 = (java.util.Map) r3
            org.json.JSONObject r3 = getJsonFromMap(r3)
        L27:
            r0.put(r2, r3)
            goto Ld
        L2b:
            return r0
    }

    public static java.lang.String jsonString(java.util.Map<java.lang.String, java.lang.Object> r2) {
            org.json.JSONObject r2 = getJsonFromMap(r2)     // Catch: org.json.JSONException -> L9
            java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> L9
            return r2
        L9:
            r2 = move-exception
            java.lang.String r0 = "JsonUtils"
            java.lang.String r1 = "Error converting map to JSON."
            android.util.Log.e(r0, r1, r2)
            r2 = 0
            return r2
    }
}
