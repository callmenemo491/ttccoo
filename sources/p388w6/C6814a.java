package p388w6;

/* renamed from: w6.a */
/* loaded from: classes.dex */
public class C6814a {

    /* renamed from: a */
    public static android.content.Context f26523a;

    /* renamed from: b */
    public static java.lang.Boolean f26524b;

    /* renamed from: a */
    public static synchronized boolean m13883a(@androidx.annotation.RecentlyNonNull android.content.Context r4) {
            java.lang.Class<w6.a> r0 = p388w6.C6814a.class
            monitor-enter(r0)
            android.content.Context r1 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L4a
            android.content.Context r2 = p388w6.C6814a.f26523a     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L17
            java.lang.Boolean r3 = p388w6.C6814a.f26524b     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L17
            if (r2 != r1) goto L17
            boolean r4 = r3.booleanValue()     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r0)
            return r4
        L17:
            r2 = 0
            p388w6.C6814a.f26524b = r2     // Catch: java.lang.Throwable -> L4a
            boolean r2 = p353u6.C6345h.m12995a()     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L2f
            android.content.pm.PackageManager r4 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L4a
            boolean r4 = r4.isInstantApp()     // Catch: java.lang.Throwable -> L4a
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L4a
        L2c:
            p388w6.C6814a.f26524b = r4     // Catch: java.lang.Throwable -> L4a
            goto L40
        L2f:
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L3d java.lang.Throwable -> L4a
            java.lang.String r2 = "com.google.android.instantapps.supervisor.InstantAppsRuntime"
            r4.loadClass(r2)     // Catch: java.lang.ClassNotFoundException -> L3d java.lang.Throwable -> L4a
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.ClassNotFoundException -> L3d java.lang.Throwable -> L4a
            p388w6.C6814a.f26524b = r4     // Catch: java.lang.ClassNotFoundException -> L3d java.lang.Throwable -> L4a
            goto L40
        L3d:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L4a
            goto L2c
        L40:
            p388w6.C6814a.f26523a = r1     // Catch: java.lang.Throwable -> L4a
            java.lang.Boolean r4 = p388w6.C6814a.f26524b     // Catch: java.lang.Throwable -> L4a
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r0)
            return r4
        L4a:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }
}
