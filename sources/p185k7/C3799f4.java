package p185k7;

/* renamed from: k7.f4 */
/* loaded from: classes.dex */
public final class C3799f4 {

    /* renamed from: a */
    public static volatile p185k7.AbstractC3960r4<java.lang.Boolean> f16631a;

    /* renamed from: b */
    public static final java.lang.Object f16632b = null;

    static {
            k7.q4<java.lang.Object> r0 = p185k7.C3947q4.f16843Y
            p185k7.C3799f4.f16631a = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p185k7.C3799f4.f16632b = r0
            return
    }

    /* renamed from: a */
    public static boolean m8530a(android.content.Context r5, android.net.Uri r6) {
            java.lang.String r6 = r6.getAuthority()
            java.lang.String r0 = "com.google.android.gms.phenotype"
            boolean r0 = r0.equals(r6)
            r1 = 0
            if (r0 != 0) goto L2e
            java.lang.String r5 = java.lang.String.valueOf(r6)
            int r5 = r5.length()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r5 = r5 + 91
            r0.<init>(r5)
            r0.append(r6)
            java.lang.String r5 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            r0.append(r5)
            java.lang.String r5 = "PhenotypeClientHelper"
            java.lang.String r6 = r0.toString()
            android.util.Log.e(r5, r6)
            return r1
        L2e:
            k7.r4<java.lang.Boolean> r6 = p185k7.C3799f4.f16631a
            boolean r6 = r6.mo8908b()
            if (r6 == 0) goto L43
        L36:
            k7.r4<java.lang.Boolean> r5 = p185k7.C3799f4.f16631a
            java.lang.Object r5 = r5.mo8907a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L43:
            java.lang.Object r6 = p185k7.C3799f4.f16632b
            monitor-enter(r6)
            k7.r4<java.lang.Boolean> r0 = p185k7.C3799f4.f16631a     // Catch: java.lang.Throwable -> La8
            boolean r0 = r0.mo8908b()     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto L5c
            k7.r4<java.lang.Boolean> r5 = p185k7.C3799f4.f16631a     // Catch: java.lang.Throwable -> La8
            java.lang.Object r5 = r5.mo8907a()     // Catch: java.lang.Throwable -> La8
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> La8
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> La8
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La8
            return r5
        L5c:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> La8
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto L69
            goto L8a
        L69:
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "com.google.android.gms.phenotype"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> La8
            r4 = 29
            if (r3 >= r4) goto L77
            r3 = 0
            goto L79
        L77:
            r3 = 268435456(0x10000000, float:2.524355E-29)
        L79:
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r3)     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto L9b
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> La8
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> La8
            if (r0 != 0) goto L8a
            goto L9b
        L8a:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> La8
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b java.lang.Throwable -> La8
            int r5 = r5.flags     // Catch: java.lang.Throwable -> La8
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L9b
            r1 = 1
        L9b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> La8
            k7.s4 r0 = new k7.s4     // Catch: java.lang.Throwable -> La8
            r0.<init>(r5)     // Catch: java.lang.Throwable -> La8
            p185k7.C3799f4.f16631a = r0     // Catch: java.lang.Throwable -> La8
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La8
            goto L36
        La8:
            r5 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La8
            throw r5
    }
}
