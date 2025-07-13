package p411x9;

/* renamed from: x9.p */
/* loaded from: classes.dex */
public final class C6997p {

    /* renamed from: a */
    public static final java.util.List<java.lang.String> f27290a = null;

    /* renamed from: b */
    public static final p411x9.C6997p f27291b = null;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r1 = "firebaseAppName"
            java.lang.String r2 = "firebaseUserUid"
            java.lang.String r3 = "operation"
            java.lang.String r4 = "tenantId"
            java.lang.String r5 = "verifyAssertionRequest"
            java.lang.String r6 = "statusCode"
            java.lang.String r7 = "statusMessage"
            java.lang.String r8 = "timestamp"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            p411x9.C6997p.f27290a = r0
            x9.p r0 = new x9.p
            r0.<init>()
            p411x9.C6997p.f27291b = r0
            return
    }

    public C6997p() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static final void m14146a(android.content.SharedPreferences r2) {
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.util.List<java.lang.String> r0 = p411x9.C6997p.f27290a
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r2.remove(r1)
            goto Lc
        L1c:
            r2.commit()
            return
    }
}
