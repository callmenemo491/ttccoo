package p057db;

/* renamed from: db.v */
/* loaded from: classes.dex */
public class C1421v {

    /* renamed from: a */
    public final android.content.Context f7095a;

    /* renamed from: b */
    public java.lang.String f7096b;

    /* renamed from: c */
    public java.lang.String f7097c;

    /* renamed from: d */
    public int f7098d;

    /* renamed from: e */
    public int f7099e;

    public C1421v(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f7099e = r0
            r1.f7095a = r2
            return
    }

    /* renamed from: b */
    public static java.lang.String m3946b(p251o9.C5180d r3) {
            r3.m11497a()
            o9.h r0 = r3.f20314c
            java.lang.String r0 = r0.f20328e
            if (r0 == 0) goto La
            return r0
        La:
            r3.m11497a()
            o9.h r3 = r3.f20314c
            java.lang.String r3 = r3.f20325b
            java.lang.String r0 = "1:"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L1a
            return r3
        L1a:
            java.lang.String r0 = ":"
            java.lang.String[] r3 = r3.split(r0)
            int r0 = r3.length
            r1 = 2
            r2 = 0
            if (r0 >= r1) goto L26
            return r2
        L26:
            r0 = 1
            r3 = r3[r0]
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L30
            return r2
        L30:
            return r3
    }

    /* renamed from: a */
    public synchronized java.lang.String m3947a() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = r1.f7096b     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto L8
            r1.m3950e()     // Catch: java.lang.Throwable -> Lc
        L8:
            java.lang.String r0 = r1.f7096b     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return r0
        Lc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    /* renamed from: c */
    public final android.content.pm.PackageInfo m3948c(java.lang.String r4) {
            r3 = this;
            android.content.Context r0 = r3.f7095a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc
            r1 = 0
            android.content.pm.PackageInfo r4 = r0.getPackageInfo(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc
            return r4
        Lc:
            r4 = move-exception
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r0 = r4.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 23
            r1.<init>(r0)
            java.lang.String r0 = "Failed to find package "
            java.lang.String r2 = "FirebaseMessaging"
            p031c1.C0842j.m2517a(r1, r0, r4, r2)
            r4 = 0
            return r4
    }

    /* renamed from: d */
    public boolean m3949d() {
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.f7099e     // Catch: java.lang.Throwable -> L81
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto Lb
        L8:
            monitor-exit(r6)
            goto L7d
        Lb:
            android.content.Context r0 = r6.f7095a     // Catch: java.lang.Throwable -> L81
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L81
            java.lang.String r4 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r5 = "com.google.android.gms"
            int r4 = r0.checkPermission(r4, r5)     // Catch: java.lang.Throwable -> L81
            r5 = -1
            if (r4 != r5) goto L26
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "Google Play services missing or without correct permission."
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> L81
            monitor-exit(r6)
            r0 = 0
            goto L7d
        L26:
            boolean r4 = p353u6.C6345h.m12995a()     // Catch: java.lang.Throwable -> L81
            if (r4 != 0) goto L4a
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = "com.google.android.c2dm.intent.REGISTER"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = "com.google.android.gms"
            r4.setPackage(r5)     // Catch: java.lang.Throwable -> L81
            java.util.List r4 = r0.queryIntentServices(r4, r3)     // Catch: java.lang.Throwable -> L81
            if (r4 == 0) goto L4a
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L81
            if (r4 > 0) goto L45
            goto L4a
        L45:
            r6.f7099e = r2     // Catch: java.lang.Throwable -> L81
            monitor-exit(r6)
            r0 = 1
            goto L7d
        L4a:
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = "com.google.iid.TOKEN_REQUEST"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = "com.google.android.gms"
            r4.setPackage(r5)     // Catch: java.lang.Throwable -> L81
            java.util.List r0 = r0.queryBroadcastReceivers(r4, r3)     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L68
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L81
            if (r0 > 0) goto L63
            goto L68
        L63:
            r6.f7099e = r1     // Catch: java.lang.Throwable -> L81
            monitor-exit(r6)
            r0 = 2
            goto L7d
        L68:
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r4 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r0, r4)     // Catch: java.lang.Throwable -> L81
            boolean r0 = p353u6.C6345h.m12995a()     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L79
            r6.f7099e = r1     // Catch: java.lang.Throwable -> L81
            r0 = 2
            goto L8
        L79:
            r6.f7099e = r2     // Catch: java.lang.Throwable -> L81
            r0 = 1
            goto L8
        L7d:
            if (r0 == 0) goto L80
            return r2
        L80:
            return r3
        L81:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
    }

    /* renamed from: e */
    public final synchronized void m3950e() {
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f7095a     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L1d
            android.content.pm.PackageInfo r0 = r2.m3948c(r0)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1b
            int r1 = r0.versionCode     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch: java.lang.Throwable -> L1d
            r2.f7096b = r1     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r0.versionName     // Catch: java.lang.Throwable -> L1d
            r2.f7097c = r0     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)
            return
        L1b:
            monitor-exit(r2)
            return
        L1d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }
}
