package p057db;

/* renamed from: db.m0 */
/* loaded from: classes.dex */
public class ServiceConnectionC1412m0 implements android.content.ServiceConnection {

    /* renamed from: Y */
    public final android.content.Context f7073Y;

    /* renamed from: Z */
    public final android.content.Intent f7074Z;

    /* renamed from: a0 */
    public final java.util.concurrent.ScheduledExecutorService f7075a0;

    /* renamed from: b0 */
    public final java.util.Queue<p057db.ServiceConnectionC1412m0.a> f7076b0;

    /* renamed from: c0 */
    public p057db.BinderC1410l0 f7077c0;

    /* renamed from: d0 */
    public boolean f7078d0;

    /* renamed from: db.m0$a */
    public static class a {

        /* renamed from: a */
        public final android.content.Intent f7079a;

        /* renamed from: b */
        public final p327s7.C5986j<java.lang.Void> f7080b;

        public a(android.content.Intent r2) {
                r1 = this;
                r1.<init>()
                s7.j r0 = new s7.j
                r0.<init>()
                r1.f7080b = r0
                r1.f7079a = r2
                return
        }

        /* renamed from: a */
        public void m3938a() {
                r2 = this;
                s7.j<java.lang.Void> r0 = r2.f7080b
                r1 = 0
                r0.m12459b(r1)
                return
        }
    }

    public ServiceConnectionC1412m0(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = new java.util.concurrent.ScheduledThreadPoolExecutor
            v6.a r0 = new v6.a
            java.lang.String r1 = "Firebase-FirebaseInstanceIdServiceConnection"
            r0.<init>(r1)
            r1 = 0
            r4.<init>(r1, r0)
            r2.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.f7076b0 = r0
            r2.f7078d0 = r1
            android.content.Context r3 = r3.getApplicationContext()
            r2.f7073Y = r3
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.firebase.MESSAGING_EVENT"
            r0.<init>(r1)
            java.lang.String r3 = r3.getPackageName()
            android.content.Intent r3 = r0.setPackage(r3)
            r2.f7074Z = r3
            r2.f7075a0 = r4
            return
    }

    /* renamed from: a */
    public final void m3935a() {
            r1 = this;
        L0:
            java.util.Queue<db.m0$a> r0 = r1.f7076b0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L14
            java.util.Queue<db.m0$a> r0 = r1.f7076b0
            java.lang.Object r0 = r0.poll()
            db.m0$a r0 = (p057db.ServiceConnectionC1412m0.a) r0
            r0.m3938a()
            goto L0
        L14:
            return
    }

    /* renamed from: b */
    public final synchronized void m3936b() {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto Lb
            goto L12
        Lb:
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r2 = "flush queue called"
            android.util.Log.d(r0, r2)     // Catch: java.lang.Throwable -> L57
        L12:
            java.util.Queue<db.m0$a> r0 = r3.f7076b0     // Catch: java.lang.Throwable -> L57
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L55
            java.lang.String r0 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L29
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r2 = "found intent to be delivered"
            android.util.Log.d(r0, r2)     // Catch: java.lang.Throwable -> L57
        L29:
            db.l0 r0 = r3.f7077c0     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L50
            boolean r0 = r0.isBinderAlive()     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L50
            java.lang.String r0 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L42
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r2 = "binder is alive, sending the intent."
            android.util.Log.d(r0, r2)     // Catch: java.lang.Throwable -> L57
        L42:
            java.util.Queue<db.m0$a> r0 = r3.f7076b0     // Catch: java.lang.Throwable -> L57
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L57
            db.m0$a r0 = (p057db.ServiceConnectionC1412m0.a) r0     // Catch: java.lang.Throwable -> L57
            db.l0 r2 = r3.f7077c0     // Catch: java.lang.Throwable -> L57
            r2.m3934a(r0)     // Catch: java.lang.Throwable -> L57
            goto L12
        L50:
            r3.m3937c()     // Catch: java.lang.Throwable -> L57
            monitor-exit(r3)
            return
        L55:
            monitor-exit(r3)
            return
        L57:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    /* renamed from: c */
    public final void m3937c() {
            r5 = this;
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            r2 = 1
            if (r1 == 0) goto L23
            boolean r1 = r5.f7078d0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 39
            r3.<init>(r4)
            java.lang.String r4 = "binder is dead. start connection? "
            r3.append(r4)
            r1 = r1 ^ r2
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.d(r0, r1)
        L23:
            boolean r1 = r5.f7078d0
            if (r1 == 0) goto L28
            return
        L28:
            r5.f7078d0 = r2
            t6.a r1 = p338t6.C6181a.m12748b()     // Catch: java.lang.SecurityException -> L41
            android.content.Context r2 = r5.f7073Y     // Catch: java.lang.SecurityException -> L41
            android.content.Intent r3 = r5.f7074Z     // Catch: java.lang.SecurityException -> L41
            r4 = 65
            boolean r1 = r1.m12749a(r2, r3, r5, r4)     // Catch: java.lang.SecurityException -> L41
            if (r1 == 0) goto L3b
            return
        L3b:
            java.lang.String r1 = "binding to the service failed"
            android.util.Log.e(r0, r1)     // Catch: java.lang.SecurityException -> L41
            goto L47
        L41:
            r1 = move-exception
            java.lang.String r2 = "Exception while binding the service"
            android.util.Log.e(r0, r2, r1)
        L47:
            r0 = 0
            r5.f7078d0 = r0
            r5.m3935a()
            return
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L2a
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L5f
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
            int r0 = r0 + 20
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "onServiceConnected: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L5f
            r1.append(r3)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r3 = "FirebaseMessaging"
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L5f
            android.util.Log.d(r3, r0)     // Catch: java.lang.Throwable -> L5f
        L2a:
            r3 = 0
            r2.f7078d0 = r3     // Catch: java.lang.Throwable -> L5f
            boolean r3 = r4 instanceof p057db.BinderC1410l0     // Catch: java.lang.Throwable -> L5f
            if (r3 != 0) goto L56
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L5f
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
            int r4 = r4 + 28
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r4 = "Invalid service connection: "
            r0.append(r4)     // Catch: java.lang.Throwable -> L5f
            r0.append(r3)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r3 = "FirebaseMessaging"
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L5f
            android.util.Log.e(r3, r4)     // Catch: java.lang.Throwable -> L5f
            r2.m3935a()     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r2)
            return
        L56:
            db.l0 r4 = (p057db.BinderC1410l0) r4     // Catch: java.lang.Throwable -> L5f
            r2.f7077c0 = r4     // Catch: java.lang.Throwable -> L5f
            r2.m3936b()     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r2)
            return
        L5f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName r4) {
            r3 = this;
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L27
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r4.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 23
            r2.<init>(r1)
            java.lang.String r1 = "onServiceDisconnected: "
            r2.append(r1)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            android.util.Log.d(r0, r4)
        L27:
            r3.m3936b()
            return
    }
}
