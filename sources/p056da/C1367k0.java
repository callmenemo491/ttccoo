package p056da;

/* renamed from: da.k0 */
/* loaded from: classes.dex */
public class C1367k0 {

    /* renamed from: a */
    public final java.io.File f6924a;

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset.forName(r0)
            return
    }

    public C1367k0(java.io.File r1) {
            r0 = this;
            r0.<init>()
            r0.f6924a = r1
            return
    }

    /* renamed from: b */
    public static java.util.Map<java.lang.String, java.lang.String> m3882b(java.lang.String r5) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r5)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Iterator r1 = r0.keys()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r0.isNull(r2)
            r4 = 0
            if (r3 != 0) goto L25
            java.lang.String r4 = r0.optString(r2, r4)
        L25:
            r5.put(r2, r4)
            goto Le
        L29:
            return r5
    }

    /* renamed from: a */
    public java.io.File m3883a(java.lang.String r5) {
            r4 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r4.f6924a
            java.lang.String r2 = "keys"
            java.lang.String r3 = ".meta"
            java.lang.String r5 = android.support.v4.media.C0145d.m257a(r5, r2, r3)
            r0.<init>(r1, r5)
            return r0
    }
}
