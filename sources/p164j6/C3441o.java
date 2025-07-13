package p164j6;

/* renamed from: j6.o */
/* loaded from: classes.dex */
public final class C3441o {

    /* renamed from: a */
    public final android.content.Context f14909a;

    /* renamed from: b */
    public int f14910b;

    /* renamed from: c */
    public int f14911c;

    public C3441o(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f14911c = r0
            r1.f14909a = r2
            return
    }

    /* renamed from: a */
    public final synchronized int m7909a() {
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f14911c     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L7
            monitor-exit(r5)
            return r0
        L7:
            android.content.Context r0 = r5.f14909a     // Catch: java.lang.Throwable -> L84
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L84
            android.content.Context r1 = r5.f14909a     // Catch: java.lang.Throwable -> L84
            w6.b r1 = p388w6.C6816c.m13887a(r1)     // Catch: java.lang.Throwable -> L84
            java.lang.String r2 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r3 = "com.google.android.gms"
            android.content.Context r1 = r1.f26525a     // Catch: java.lang.Throwable -> L84
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L84
            int r1 = r1.checkPermission(r2, r3)     // Catch: java.lang.Throwable -> L84
            r2 = -1
            r3 = 0
            if (r1 != r2) goto L2e
            java.lang.String r0 = "Metadata"
            java.lang.String r1 = "Google Play services missing or without correct permission."
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> L84
            monitor-exit(r5)
            return r3
        L2e:
            boolean r1 = p353u6.C6345h.m12995a()     // Catch: java.lang.Throwable -> L84
            r2 = 1
            if (r1 != 0) goto L51
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch: java.lang.Throwable -> L84
            java.util.List r1 = r0.queryIntentServices(r1, r3)     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L51
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L84
            if (r1 <= 0) goto L51
            r5.f14911c = r2     // Catch: java.lang.Throwable -> L84
            monitor-exit(r5)
            return r2
        L51:
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch: java.lang.Throwable -> L84
            java.util.List r0 = r0.queryBroadcastReceivers(r1, r3)     // Catch: java.lang.Throwable -> L84
            r1 = 2
            if (r0 == 0) goto L6e
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L84
            if (r0 <= 0) goto L6e
            r5.f14911c = r1     // Catch: java.lang.Throwable -> L84
            monitor-exit(r5)
            return r1
        L6e:
            java.lang.String r0 = "Metadata"
            java.lang.String r3 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r0, r3)     // Catch: java.lang.Throwable -> L84
            boolean r0 = p353u6.C6345h.m12995a()     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L7e
            r5.f14911c = r1     // Catch: java.lang.Throwable -> L84
            goto L80
        L7e:
            r5.f14911c = r2     // Catch: java.lang.Throwable -> L84
        L80:
            int r0 = r5.f14911c     // Catch: java.lang.Throwable -> L84
            monitor-exit(r5)
            return r0
        L84:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    /* renamed from: b */
    public final android.content.pm.PackageInfo m7910b(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = r2.f14909a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12
            w6.b r0 = p388w6.C6816c.m13887a(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12
            r1 = 0
            android.content.Context r0 = r0.f26525a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12
            return r3
        L12:
            r3 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r0 = r3.length()
            int r0 = r0 + 23
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Failed to find package "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r0 = "Metadata"
            android.util.Log.w(r0, r3)
            r3 = 0
            return r3
    }
}
