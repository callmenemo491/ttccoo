package p317ri;

/* renamed from: ri.o1 */
/* loaded from: classes.dex */
public class C5902o1 {

    /* renamed from: a */
    public static java.lang.Long f22724a;

    /* renamed from: b */
    public static final java.util.Map f22725b = null;

    static {
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            p317ri.C5902o1.f22724a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            p317ri.C5902o1.f22725b = r0
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r1 = "en"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L20
            goto L3a
        L20:
            java.util.Locale[] r0 = java.util.Locale.getAvailableLocales()
            r2 = 0
        L25:
            int r3 = r0.length
            if (r2 == r3) goto L3a
            r3 = r0[r2]
            java.lang.String r3 = r3.getLanguage()
            boolean r3 = r1.equalsIgnoreCase(r3)
            if (r3 == 0) goto L37
            r0 = r0[r2]
            goto L3d
        L37:
            int r2 = r2 + 1
            goto L25
        L3a:
            java.util.Locale.getDefault()
        L3d:
            return
    }
}
