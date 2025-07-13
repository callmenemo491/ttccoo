package p057db;

/* renamed from: db.h0 */
/* loaded from: classes.dex */
public class RunnableC1402h0 implements java.lang.Runnable {

    /* renamed from: d0 */
    public static final java.lang.Object f7049d0 = null;

    /* renamed from: e0 */
    public static java.lang.Boolean f7050e0;

    /* renamed from: f0 */
    public static java.lang.Boolean f7051f0;

    /* renamed from: Y */
    public final android.content.Context f7052Y;

    /* renamed from: Z */
    public final p057db.C1421v f7053Z;

    /* renamed from: a0 */
    public final android.os.PowerManager.WakeLock f7054a0;

    /* renamed from: b0 */
    public final p057db.C1400g0 f7055b0;

    /* renamed from: c0 */
    public final long f7056c0;

    /* renamed from: db.h0$a */
    public class a extends android.content.BroadcastReceiver {

        /* renamed from: a */
        public p057db.RunnableC1402h0 f7057a;

        /* renamed from: b */
        public final /* synthetic */ p057db.RunnableC1402h0 f7058b;

        public a(p057db.RunnableC1402h0 r1, p057db.RunnableC1402h0 r2) {
                r0 = this;
                r0.f7058b = r1
                r0.<init>()
                r0.f7057a = r2
                return
        }

        /* renamed from: a */
        public void m3930a() {
                r3 = this;
                boolean r0 = p057db.RunnableC1402h0.m3925a()
                if (r0 == 0) goto Ld
                java.lang.String r0 = "FirebaseMessaging"
                java.lang.String r1 = "Connectivity change received registered"
                android.util.Log.d(r0, r1)
            Ld:
                db.h0 r0 = r3.f7058b
                android.content.Context r0 = r0.f7052Y
                android.content.IntentFilter r1 = new android.content.IntentFilter
                java.lang.String r2 = "android.net.conn.CONNECTIVITY_CHANGE"
                r1.<init>(r2)
                r0.registerReceiver(r3, r1)
                return
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(android.content.Context r5, android.content.Intent r6) {
                r4 = this;
                monitor-enter(r4)
                db.h0 r6 = r4.f7057a     // Catch: java.lang.Throwable -> L31
                if (r6 != 0) goto L7
                monitor-exit(r4)
                return
            L7:
                boolean r6 = r6.m3929e()     // Catch: java.lang.Throwable -> L31
                if (r6 != 0) goto Lf
                monitor-exit(r4)
                return
            Lf:
                boolean r6 = p057db.RunnableC1402h0.m3925a()     // Catch: java.lang.Throwable -> L31
                if (r6 == 0) goto L1c
                java.lang.String r6 = "FirebaseMessaging"
                java.lang.String r0 = "Connectivity changed. Starting background sync."
                android.util.Log.d(r6, r0)     // Catch: java.lang.Throwable -> L31
            L1c:
                db.h0 r6 = r4.f7057a     // Catch: java.lang.Throwable -> L31
                db.g0 r0 = r6.f7055b0     // Catch: java.lang.Throwable -> L31
                r1 = 0
                java.util.concurrent.ScheduledExecutorService r0 = r0.f7045g     // Catch: java.lang.Throwable -> L31
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L31
                r0.schedule(r6, r1, r3)     // Catch: java.lang.Throwable -> L31
                r5.unregisterReceiver(r4)     // Catch: java.lang.Throwable -> L31
                r5 = 0
                r4.f7057a = r5     // Catch: java.lang.Throwable -> L31
                monitor-exit(r4)
                return
            L31:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p057db.RunnableC1402h0.f7049d0 = r0
            return
    }

    public RunnableC1402h0(p057db.C1400g0 r1, android.content.Context r2, p057db.C1421v r3, long r4) {
            r0 = this;
            r0.<init>()
            r0.f7055b0 = r1
            r0.f7052Y = r2
            r0.f7056c0 = r4
            r0.f7053Z = r3
            java.lang.String r1 = "power"
            java.lang.Object r1 = r2.getSystemService(r1)
            android.os.PowerManager r1 = (android.os.PowerManager) r1
            r2 = 1
            java.lang.String r3 = "wake:com.google.firebase.messaging"
            android.os.PowerManager$WakeLock r1 = r1.newWakeLock(r2, r3)
            r0.f7054a0 = r1
            return
    }

    /* renamed from: a */
    public static boolean m3925a() {
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r1)
            r3 = 0
            if (r2 != 0) goto L16
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r2 != r4) goto L17
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L17
        L16:
            r3 = 1
        L17:
            return r3
    }

    /* renamed from: b */
    public static boolean m3926b(android.content.Context r3) {
            java.lang.Object r0 = p057db.RunnableC1402h0.f7049d0
            monitor-enter(r0)
            java.lang.Boolean r1 = p057db.RunnableC1402h0.f7051f0     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto Le
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r3 = m3927c(r3, r2, r1)     // Catch: java.lang.Throwable -> L1e
            goto L12
        Le:
            boolean r3 = r1.booleanValue()     // Catch: java.lang.Throwable -> L1e
        L12:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L1e
            p057db.RunnableC1402h0.f7051f0 = r3     // Catch: java.lang.Throwable -> L1e
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return r3
        L1e:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r3
    }

    /* renamed from: c */
    public static boolean m3927c(android.content.Context r2, java.lang.String r3, java.lang.Boolean r4) {
            if (r4 == 0) goto L7
            boolean r2 = r4.booleanValue()
            return r2
        L7:
            int r2 = r2.checkCallingOrSelfPermission(r3)
            r4 = 0
            if (r2 != 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            if (r2 != 0) goto L3c
            r0 = 3
            java.lang.String r1 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L3c
            int r2 = r3.length()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r2 = r2 + 142
            r0.<init>(r2)
            java.lang.String r2 = "Missing Permission: "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            android.util.Log.d(r1, r2)
            return r4
        L3c:
            return r2
    }

    /* renamed from: d */
    public static boolean m3928d(android.content.Context r3) {
            java.lang.Object r0 = p057db.RunnableC1402h0.f7049d0
            monitor-enter(r0)
            java.lang.Boolean r1 = p057db.RunnableC1402h0.f7050e0     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto Le
            java.lang.String r2 = "android.permission.WAKE_LOCK"
            boolean r3 = m3927c(r3, r2, r1)     // Catch: java.lang.Throwable -> L1e
            goto L12
        Le:
            boolean r3 = r1.booleanValue()     // Catch: java.lang.Throwable -> L1e
        L12:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L1e
            p057db.RunnableC1402h0.f7050e0 = r3     // Catch: java.lang.Throwable -> L1e
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return r3
        L1e:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r3
    }

    /* renamed from: e */
    public final synchronized boolean m3929e() {
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f7052Y     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L20
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L12
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L20
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L1e
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L1e
            r0 = 1
        L1c:
            monitor-exit(r2)
            return r0
        L1e:
            r0 = 0
            goto L1c
        L20:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // java.lang.Runnable
    @android.annotation.SuppressLint({"Wakelock"})
    public void run() {
            r6 = this;
            java.lang.String r0 = "TopicsSyncTask's wakelock was already released due to timeout."
            java.lang.String r1 = "FirebaseMessaging"
            android.content.Context r2 = r6.f7052Y
            boolean r2 = m3928d(r2)
            if (r2 == 0) goto L13
            android.os.PowerManager$WakeLock r2 = r6.f7054a0
            long r3 = p057db.C1391c.f7007a
            r2.acquire(r3)
        L13:
            r2 = 0
            db.g0 r3 = r6.f7055b0     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            r4 = 1
            r3.m3922e(r4)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            db.v r3 = r6.f7053Z     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            boolean r3 = r3.m3949d()     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            if (r3 != 0) goto L39
            db.g0 r3 = r6.f7055b0     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            r3.m3922e(r2)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            android.content.Context r2 = r6.f7052Y
            boolean r2 = m3928d(r2)
            if (r2 == 0) goto L38
            android.os.PowerManager$WakeLock r2 = r6.f7054a0     // Catch: java.lang.RuntimeException -> L35
            r2.release()     // Catch: java.lang.RuntimeException -> L35
            return
        L35:
            android.util.Log.i(r1, r0)
        L38:
            return
        L39:
            android.content.Context r3 = r6.f7052Y     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            boolean r3 = m3926b(r3)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            if (r3 == 0) goto L61
            boolean r3 = r6.m3929e()     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            if (r3 != 0) goto L61
            db.h0$a r3 = new db.h0$a     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            r3.<init>(r6, r6)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            r3.m3930a()     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            android.content.Context r2 = r6.f7052Y
            boolean r2 = m3928d(r2)
            if (r2 == 0) goto L60
            android.os.PowerManager$WakeLock r2 = r6.f7054a0     // Catch: java.lang.RuntimeException -> L5d
            r2.release()     // Catch: java.lang.RuntimeException -> L5d
            return
        L5d:
            android.util.Log.i(r1, r0)
        L60:
            return
        L61:
            db.g0 r3 = r6.f7055b0     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            boolean r3 = r3.m3923f()     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            if (r3 == 0) goto L6f
            db.g0 r3 = r6.f7055b0     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            r3.m3922e(r2)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            goto L76
        L6f:
            db.g0 r3 = r6.f7055b0     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            long r4 = r6.f7056c0     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            r3.m3924g(r4)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
        L76:
            android.content.Context r2 = r6.f7052Y
            boolean r2 = m3928d(r2)
            if (r2 == 0) goto Lbe
            android.os.PowerManager$WakeLock r2 = r6.f7054a0     // Catch: java.lang.RuntimeException -> L84
            r2.release()     // Catch: java.lang.RuntimeException -> L84
            return
        L84:
            android.util.Log.i(r1, r0)
            return
        L88:
            r2 = move-exception
            goto Lbf
        L8a:
            r3 = move-exception
            java.lang.String r4 = "Failed to sync topics. Won't retry sync. "
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L88
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L88
            int r5 = r3.length()     // Catch: java.lang.Throwable -> L88
            if (r5 == 0) goto La0
            java.lang.String r3 = r4.concat(r3)     // Catch: java.lang.Throwable -> L88
            goto La5
        La0:
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L88
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L88
        La5:
            android.util.Log.e(r1, r3)     // Catch: java.lang.Throwable -> L88
            db.g0 r3 = r6.f7055b0     // Catch: java.lang.Throwable -> L88
            r3.m3922e(r2)     // Catch: java.lang.Throwable -> L88
            android.content.Context r2 = r6.f7052Y
            boolean r2 = m3928d(r2)
            if (r2 == 0) goto Lbe
            android.os.PowerManager$WakeLock r2 = r6.f7054a0     // Catch: java.lang.RuntimeException -> Lbb
            r2.release()     // Catch: java.lang.RuntimeException -> Lbb
            return
        Lbb:
            android.util.Log.i(r1, r0)
        Lbe:
            return
        Lbf:
            android.content.Context r3 = r6.f7052Y
            boolean r3 = m3928d(r3)
            if (r3 == 0) goto Ld0
            android.os.PowerManager$WakeLock r3 = r6.f7054a0     // Catch: java.lang.RuntimeException -> Lcd
            r3.release()     // Catch: java.lang.RuntimeException -> Lcd
            goto Ld0
        Lcd:
            android.util.Log.i(r1, r0)
        Ld0:
            throw r2
    }
}
