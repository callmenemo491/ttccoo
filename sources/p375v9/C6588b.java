package p375v9;

/* renamed from: v9.b */
/* loaded from: classes.dex */
public class C6588b {

    /* renamed from: c */
    public static final /* synthetic */ int f25772c = 0;

    /* renamed from: a */
    public final java.lang.String f25773a;

    /* renamed from: b */
    public final java.lang.String f25774b;

    static {
            v9.i0 r0 = new v9.i0
            r0.<init>()
            return
    }

    public C6588b(java.lang.String r7) {
            r6 = this;
            r6.<init>()
            java.lang.String r0 = "apiKey"
            java.lang.String r1 = m13456a(r7, r0)
            java.lang.String r2 = "oobCode"
            java.lang.String r3 = m13456a(r7, r2)
            java.lang.String r4 = "mode"
            java.lang.String r5 = m13456a(r7, r4)
            if (r1 == 0) goto L39
            if (r3 == 0) goto L39
            if (r5 == 0) goto L39
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            com.google.android.gms.common.internal.C1101a.m3100e(r3)
            r6.f25773a = r3
            com.google.android.gms.common.internal.C1101a.m3100e(r5)
            java.lang.String r0 = "continueUrl"
            m13456a(r7, r0)
            java.lang.String r0 = "languageCode"
            m13456a(r7, r0)
            java.lang.String r0 = "tenantId"
            java.lang.String r7 = m13456a(r7, r0)
            r6.f25774b = r7
            return
        L39:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r0
            r0 = 1
            r1[r0] = r2
            r0 = 2
            r1[r0] = r4
            java.lang.String r0 = "%s, %s and %s are required in a valid action code URL"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r7.<init>(r0)
            throw r7
    }

    /* renamed from: a */
    public static java.lang.String m13456a(java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "link"
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.util.Set r1 = r3.getQueryParameterNames()     // Catch: java.lang.Throwable -> L2b
            boolean r2 = r1.contains(r4)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L15
            java.lang.String r3 = r3.getQueryParameter(r4)     // Catch: java.lang.Throwable -> L2b
            return r3
        L15:
            boolean r1 = r1.contains(r0)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L2b
            java.lang.String r3 = r3.getQueryParameter(r0)     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.common.internal.C1101a.m3100e(r3)     // Catch: java.lang.Throwable -> L2b
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = r3.getQueryParameter(r4)     // Catch: java.lang.Throwable -> L2b
            return r3
        L2b:
            r3 = 0
            return r3
    }
}
