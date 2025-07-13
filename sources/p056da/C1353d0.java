package p056da;

/* renamed from: da.d0 */
/* loaded from: classes.dex */
public class C1353d0 {

    /* renamed from: a */
    public final android.content.SharedPreferences f6884a;

    /* renamed from: b */
    public final p251o9.C5180d f6885b;

    /* renamed from: c */
    public final java.lang.Object f6886c;

    /* renamed from: d */
    public p327s7.C5986j<java.lang.Void> f6887d;

    /* renamed from: e */
    public boolean f6888e;

    /* renamed from: f */
    public java.lang.Boolean f6889f;

    /* renamed from: g */
    public final p327s7.C5986j<java.lang.Void> f6890g;

    public C1353d0(p251o9.C5180d r7) {
            r6 = this;
            r6.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r6.f6886c = r0
            s7.j r0 = new s7.j
            r0.<init>()
            r6.f6887d = r0
            r0 = 0
            r6.f6888e = r0
            s7.j r1 = new s7.j
            r1.<init>()
            r6.f6890g = r1
            r7.m11497a()
            android.content.Context r1 = r7.f20312a
            r6.f6885b = r7
            android.content.SharedPreferences r7 = p056da.C1354e.m3864h(r1)
            r6.f6884a = r7
            java.lang.String r2 = "firebase_crashlytics_collection_enabled"
            boolean r3 = r7.contains(r2)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L3d
            r6.f6888e = r0
            boolean r7 = r7.getBoolean(r2, r4)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L3e
        L3d:
            r7 = r5
        L3e:
            if (r7 != 0) goto L84
            java.lang.String r7 = "firebase_crashlytics_collection_enabled"
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r2 == 0) goto L71
            java.lang.String r1 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r1 == 0) goto L71
            android.os.Bundle r2 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r2 == 0) goto L71
            boolean r2 = r2.containsKey(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r2 == 0) goto L71
            android.os.Bundle r1 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            boolean r7 = r1.getBoolean(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            goto L72
        L69:
            r7 = move-exception
            java.lang.String r1 = "FirebaseCrashlytics"
            java.lang.String r2 = "Could not read data collection permission from manifest"
            android.util.Log.e(r1, r2, r7)
        L71:
            r7 = r5
        L72:
            if (r7 != 0) goto L78
            r6.f6888e = r0
            r7 = r5
            goto L84
        L78:
            r6.f6888e = r4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r7 = r0.equals(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
        L84:
            r6.f6889f = r7
            java.lang.Object r7 = r6.f6886c
            monitor-enter(r7)
            boolean r0 = r6.m3855a()     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L94
            s7.j<java.lang.Void> r0 = r6.f6887d     // Catch: java.lang.Throwable -> L96
            r0.m12459b(r5)     // Catch: java.lang.Throwable -> L96
        L94:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L96
            return
        L96:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L96
            throw r0
    }

    /* renamed from: a */
    public synchronized boolean m3855a() {
            r1 = this;
            monitor-enter(r1)
            java.lang.Boolean r0 = r1.f6889f     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto La
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L15
            goto L10
        La:
            o9.d r0 = r1.f6885b     // Catch: java.lang.Throwable -> L15
            boolean r0 = r0.m11500h()     // Catch: java.lang.Throwable -> L15
        L10:
            r1.m3856b(r0)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)
            return r0
        L15:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    /* renamed from: b */
    public final void m3856b(boolean r5) {
            r4 = this;
            if (r5 == 0) goto L5
            java.lang.String r5 = "ENABLED"
            goto L7
        L5:
            java.lang.String r5 = "DISABLED"
        L7:
            java.lang.Boolean r0 = r4.f6889f
            if (r0 != 0) goto Le
            java.lang.String r0 = "global Firebase setting"
            goto L17
        Le:
            boolean r0 = r4.f6888e
            if (r0 == 0) goto L15
            java.lang.String r0 = "firebase_crashlytics_collection_enabled manifest flag"
            goto L17
        L15:
            java.lang.String r0 = "API"
        L17:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r5 = 1
            r1[r5] = r0
            java.lang.String r0 = "Crashlytics automatic data collection %s by %s."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r1 = 3
            java.lang.String r3 = "FirebaseCrashlytics"
            boolean r1 = android.util.Log.isLoggable(r3, r1)
            if (r1 == 0) goto L30
            r2 = 1
        L30:
            if (r2 == 0) goto L36
            r5 = 0
            android.util.Log.d(r3, r0, r5)
        L36:
            return
    }
}
