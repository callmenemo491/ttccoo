package p353u6;

/* renamed from: u6.k */
/* loaded from: classes.dex */
public final class C6348k {
    /* renamed from: a */
    public static boolean m13000a(@androidx.annotation.RecentlyNonNull android.content.Context r3, int r4) {
            java.lang.String r0 = "com.google.android.gms"
            boolean r4 = m13001b(r3, r4, r0)
            r1 = 0
            if (r4 != 0) goto La
            return r1
        La:
            android.content.pm.PackageManager r4 = r3.getPackageManager()
            r2 = 64
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3e
            k6.i r3 = p184k6.C3706i.m8168a(r3)
            java.util.Objects.requireNonNull(r3)
            if (r4 != 0) goto L1e
            goto L3d
        L1e:
            boolean r0 = p184k6.C3706i.m8170d(r4, r1)
            r2 = 1
            if (r0 == 0) goto L27
        L25:
            r1 = 1
            goto L3d
        L27:
            boolean r4 = p184k6.C3706i.m8170d(r4, r2)
            if (r4 == 0) goto L3d
            android.content.Context r3 = r3.f16416a
            boolean r3 = p184k6.C3705h.m8167a(r3)
            if (r3 == 0) goto L36
            goto L25
        L36:
            java.lang.String r3 = "GoogleSignatureVerifier"
            java.lang.String r4 = "Test-keys aren't accepted on this build."
            android.util.Log.w(r3, r4)
        L3d:
            return r1
        L3e:
            r3 = 3
            java.lang.String r4 = "UidVerifier"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L4c
            java.lang.String r3 = "Package manager can't find google play services package, defaulting to false"
            android.util.Log.d(r4, r3)
        L4c:
            return r1
    }

    @android.annotation.TargetApi(19)
    /* renamed from: b */
    public static boolean m13001b(@androidx.annotation.RecentlyNonNull android.content.Context r1, int r2, @androidx.annotation.RecentlyNonNull java.lang.String r3) {
            w6.b r1 = p388w6.C6816c.m13887a(r1)
            java.util.Objects.requireNonNull(r1)
            android.content.Context r1 = r1.f26525a     // Catch: java.lang.SecurityException -> L20
            java.lang.String r0 = "appops"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch: java.lang.SecurityException -> L20
            android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1     // Catch: java.lang.SecurityException -> L20
            if (r1 == 0) goto L18
            r1.checkPackage(r2, r3)     // Catch: java.lang.SecurityException -> L20
            r1 = 1
            goto L21
        L18:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.SecurityException -> L20
            java.lang.String r2 = "context.getSystemService(Context.APP_OPS_SERVICE) is null"
            r1.<init>(r2)     // Catch: java.lang.SecurityException -> L20
            throw r1     // Catch: java.lang.SecurityException -> L20
        L20:
            r1 = 0
        L21:
            return r1
    }
}
