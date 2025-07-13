package p185k7;

/* renamed from: k7.y3 */
/* loaded from: classes.dex */
public final class C4050y3 implements p185k7.InterfaceC3743b4 {

    /* renamed from: g */
    public static final java.util.Map<android.net.Uri, p185k7.C4050y3> f16960g = null;

    /* renamed from: h */
    public static final java.lang.String[] f16961h = null;

    /* renamed from: a */
    public final android.content.ContentResolver f16962a;

    /* renamed from: b */
    public final android.net.Uri f16963b;

    /* renamed from: c */
    public final android.database.ContentObserver f16964c;

    /* renamed from: d */
    public final java.lang.Object f16965d;

    /* renamed from: e */
    public volatile java.util.Map<java.lang.String, java.lang.String> f16966e;

    /* renamed from: f */
    public final java.util.List<p185k7.InterfaceC4063z3> f16967f;

    static {
            s.a r0 = new s.a
            r0.<init>()
            p185k7.C4050y3.f16960g = r0
            java.lang.String r0 = "key"
            java.lang.String r1 = "value"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            p185k7.C4050y3.f16961h = r0
            return
    }

    public C4050y3(android.content.ContentResolver r3, android.net.Uri r4) {
            r2 = this;
            r2.<init>()
            k7.x3 r0 = new k7.x3
            r0.<init>(r2)
            r2.f16964c = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2.f16965d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.f16967f = r1
            java.util.Objects.requireNonNull(r3)
            java.util.Objects.requireNonNull(r4)
            r2.f16962a = r3
            r2.f16963b = r4
            r1 = 0
            r3.registerContentObserver(r4, r1, r0)
            return
    }

    /* renamed from: a */
    public static p185k7.C4050y3 m9150a(android.content.ContentResolver r4, android.net.Uri r5) {
            java.lang.Class<k7.y3> r0 = p185k7.C4050y3.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, k7.y3> r1 = p185k7.C4050y3.f16960g     // Catch: java.lang.Throwable -> L1b
            r2 = r1
            s.h r2 = (p319s.C5941h) r2     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> L1b
            k7.y3 r2 = (p185k7.C4050y3) r2     // Catch: java.lang.Throwable -> L1b
            if (r2 != 0) goto L1e
            k7.y3 r3 = new k7.y3     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1e
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1e
            s.h r1 = (p319s.C5941h) r1     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1d
            r1.put(r5, r3)     // Catch: java.lang.Throwable -> L1b java.lang.SecurityException -> L1d
            goto L1d
        L1b:
            r4 = move-exception
            goto L20
        L1d:
            r2 = r3
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r2
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r4
    }

    /* renamed from: c */
    public static synchronized void m9151c() {
            java.lang.Class<k7.y3> r0 = p185k7.C4050y3.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, k7.y3> r1 = p185k7.C4050y3.f16960g     // Catch: java.lang.Throwable -> L2c
            s.a r1 = (p319s.C5934a) r1     // Catch: java.lang.Throwable -> L2c
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2c
        Lf:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2c
            k7.y3 r2 = (p185k7.C4050y3) r2     // Catch: java.lang.Throwable -> L2c
            android.content.ContentResolver r3 = r2.f16962a     // Catch: java.lang.Throwable -> L2c
            android.database.ContentObserver r2 = r2.f16964c     // Catch: java.lang.Throwable -> L2c
            r3.unregisterContentObserver(r2)     // Catch: java.lang.Throwable -> L2c
            goto Lf
        L23:
            java.util.Map<android.net.Uri, k7.y3> r1 = p185k7.C4050y3.f16960g     // Catch: java.lang.Throwable -> L2c
            s.h r1 = (p319s.C5941h) r1     // Catch: java.lang.Throwable -> L2c
            r1.clear()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r0)
            return
        L2c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* renamed from: b */
    public final java.util.Map<java.lang.String, java.lang.String> m9152b() {
            r4 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f16966e
            if (r0 != 0) goto L38
            java.lang.Object r1 = r4.f16965d
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f16966e     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L33
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L35
            h7.rb r2 = new h7.rb     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L20
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L20
            java.lang.Object r2 = p052d6.C1306f0.m3776e(r2)     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L20
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L20
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L35
            goto L2b
        L1e:
            r2 = move-exception
            goto L2f
        L20:
            java.lang.String r2 = "ConfigurationContentLoader"
            java.lang.String r3 = "PhenotypeFlag unable to load ContentProvider, using default values"
            android.util.Log.e(r2, r3)     // Catch: java.lang.Throwable -> L1e
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L35
            r2 = 0
        L2b:
            r4.f16966e = r2     // Catch: java.lang.Throwable -> L35
            r0 = r2
            goto L33
        L2f:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L35
            throw r2     // Catch: java.lang.Throwable -> L35
        L33:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L35
            goto L38
        L35:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L35
            throw r0
        L38:
            if (r0 == 0) goto L3b
            return r0
        L3b:
            java.util.Map r0 = java.util.Collections.emptyMap()
            return r0
    }

    @Override // p185k7.InterfaceC3743b4
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ java.lang.Object mo8224f(java.lang.String r2) {
            r1 = this;
            java.util.Map r0 = r1.m9152b()
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }
}
