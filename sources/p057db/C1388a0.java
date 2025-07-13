package p057db;

/* renamed from: db.a0 */
/* loaded from: classes.dex */
public class C1388a0 {

    /* renamed from: e */
    public static p057db.C1388a0 f6996e;

    /* renamed from: a */
    public java.lang.String f6997a;

    /* renamed from: b */
    public java.lang.Boolean f6998b;

    /* renamed from: c */
    public java.lang.Boolean f6999c;

    /* renamed from: d */
    public final java.util.Queue<android.content.Intent> f7000d;

    public C1388a0() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f6997a = r0
            r1.f6998b = r0
            r1.f6999c = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.f7000d = r0
            return
    }

    /* renamed from: a */
    public static synchronized p057db.C1388a0 m3906a() {
            java.lang.Class<db.a0> r0 = p057db.C1388a0.class
            monitor-enter(r0)
            db.a0 r1 = p057db.C1388a0.f6996e     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            db.a0 r1 = new db.a0     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            p057db.C1388a0.f6996e = r1     // Catch: java.lang.Throwable -> L12
        Le:
            db.a0 r1 = p057db.C1388a0.f6996e     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* renamed from: b */
    public boolean m3907b(android.content.Context r2) {
            r1 = this;
            java.lang.Boolean r0 = r1.f6999c
            if (r0 != 0) goto L15
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            int r2 = r2.checkCallingOrSelfPermission(r0)
            if (r2 != 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.f6999c = r2
        L15:
            java.lang.Boolean r2 = r1.f6998b
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L2b
            r2 = 3
            java.lang.String r0 = "FirebaseMessaging"
            boolean r2 = android.util.Log.isLoggable(r0, r2)
            if (r2 == 0) goto L2b
            java.lang.String r2 = "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest"
            android.util.Log.d(r0, r2)
        L2b:
            java.lang.Boolean r2 = r1.f6999c
            boolean r2 = r2.booleanValue()
            return r2
    }

    /* renamed from: c */
    public boolean m3908c(android.content.Context r2) {
            r1 = this;
            java.lang.Boolean r0 = r1.f6998b
            if (r0 != 0) goto L15
            java.lang.String r0 = "android.permission.WAKE_LOCK"
            int r2 = r2.checkCallingOrSelfPermission(r0)
            if (r2 != 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.f6998b = r2
        L15:
            java.lang.Boolean r2 = r1.f6998b
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L2b
            r2 = 3
            java.lang.String r0 = "FirebaseMessaging"
            boolean r2 = android.util.Log.isLoggable(r0, r2)
            if (r2 == 0) goto L2b
            java.lang.String r2 = "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest"
            android.util.Log.d(r0, r2)
        L2b:
            java.lang.Boolean r2 = r1.f6998b
            boolean r2 = r2.booleanValue()
            return r2
    }
}
