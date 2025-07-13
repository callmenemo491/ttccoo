package p057db;

/* renamed from: db.c0 */
/* loaded from: classes.dex */
public class RunnableC1392c0 implements java.lang.Runnable {

    /* renamed from: Y */
    public final long f7008Y;

    /* renamed from: Z */
    public final android.os.PowerManager.WakeLock f7009Z;

    /* renamed from: a0 */
    public final com.google.firebase.messaging.FirebaseMessaging f7010a0;

    /* renamed from: db.c0$a */
    public static class a extends android.content.BroadcastReceiver {

        /* renamed from: a */
        public p057db.RunnableC1392c0 f7011a;

        public a(p057db.RunnableC1392c0 r1) {
                r0 = this;
                r0.<init>()
                r0.f7011a = r1
                return
        }

        /* renamed from: a */
        public void m3914a() {
                r2 = this;
                boolean r0 = p057db.RunnableC1392c0.m3911a()
                if (r0 == 0) goto Ld
                java.lang.String r0 = "FirebaseMessaging"
                java.lang.String r1 = "Connectivity change received registered"
                android.util.Log.d(r0, r1)
            Ld:
                android.content.IntentFilter r0 = new android.content.IntentFilter
                java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
                r0.<init>(r1)
                db.c0 r1 = r2.f7011a
                com.google.firebase.messaging.FirebaseMessaging r1 = r1.f7010a0
                android.content.Context r1 = r1.f6610d
                r1.registerReceiver(r2, r0)
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r3, android.content.Intent r4) {
                r2 = this;
                db.c0 r3 = r2.f7011a
                if (r3 != 0) goto L5
                return
            L5:
                boolean r3 = r3.m3912b()
                if (r3 != 0) goto Lc
                return
            Lc:
                boolean r3 = p057db.RunnableC1392c0.m3911a()
                if (r3 == 0) goto L19
                java.lang.String r3 = "FirebaseMessaging"
                java.lang.String r4 = "Connectivity changed. Starting background sync."
                android.util.Log.d(r3, r4)
            L19:
                db.c0 r3 = r2.f7011a
                com.google.firebase.messaging.FirebaseMessaging r4 = r3.f7010a0
                r0 = 0
                r4.m3654b(r3, r0)
                db.c0 r3 = r2.f7011a
                com.google.firebase.messaging.FirebaseMessaging r3 = r3.f7010a0
                android.content.Context r3 = r3.f6610d
                r3.unregisterReceiver(r2)
                r3 = 0
                r2.f7011a = r3
                return
        }
    }

    @android.annotation.SuppressLint({"InvalidWakeLockTag"})
    public RunnableC1392c0(com.google.firebase.messaging.FirebaseMessaging r9, long r10) {
            r8 = this;
            r8.<init>()
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            v6.a r7 = new v6.a
            java.lang.String r1 = "firebase-iid-executor"
            r7.<init>(r1)
            r1 = 0
            r2 = 1
            r3 = 30
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r8.f7010a0 = r9
            r8.f7008Y = r10
            android.content.Context r9 = r9.f6610d
            java.lang.String r10 = "power"
            java.lang.Object r9 = r9.getSystemService(r10)
            android.os.PowerManager r9 = (android.os.PowerManager) r9
            r10 = 1
            java.lang.String r11 = "fiid-sync"
            android.os.PowerManager$WakeLock r9 = r9.newWakeLock(r10, r11)
            r8.f7009Z = r9
            r10 = 0
            r9.setReferenceCounted(r10)
            return
    }

    /* renamed from: a */
    public static boolean m3911a() {
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r1)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L19
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r2 != r5) goto L1a
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L18
            goto L19
        L18:
            return r3
        L19:
            r3 = 1
        L1a:
            return r3
    }

    /* renamed from: b */
    public boolean m3912b() {
            r2 = this;
            com.google.firebase.messaging.FirebaseMessaging r0 = r2.f7010a0
            android.content.Context r0 = r0.f6610d
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            if (r0 == 0) goto L13
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 == 0) goto L1e
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L1e
            r0 = 1
            return r0
        L1e:
            r0 = 0
            return r0
    }

    /* renamed from: c */
    public boolean m3913c() {
            r6 = this;
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 1
            r2 = 0
            com.google.firebase.messaging.FirebaseMessaging r3 = r6.f7010a0     // Catch: java.lang.SecurityException -> L1f java.io.IOException -> L22
            java.lang.String r3 = r3.m3653a()     // Catch: java.lang.SecurityException -> L1f java.io.IOException -> L22
            if (r3 != 0) goto L12
            java.lang.String r3 = "Token retrieval failed: null"
            android.util.Log.e(r0, r3)     // Catch: java.lang.SecurityException -> L1f java.io.IOException -> L22
            return r2
        L12:
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r0, r3)     // Catch: java.lang.SecurityException -> L1f java.io.IOException -> L22
            if (r3 == 0) goto L1e
            java.lang.String r3 = "Token successfully retrieved"
            android.util.Log.d(r0, r3)     // Catch: java.lang.SecurityException -> L1f java.io.IOException -> L22
        L1e:
            return r1
        L1f:
            java.lang.String r1 = "Token retrieval failed with SecurityException. Will retry token retrieval"
            goto L67
        L22:
            r3 = move-exception
            java.lang.String r4 = r3.getMessage()
            java.lang.String r5 = "SERVICE_NOT_AVAILABLE"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L41
            java.lang.String r5 = "INTERNAL_SERVER_ERROR"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L41
            java.lang.String r5 = "InternalServerError"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L40
            goto L41
        L40:
            r1 = 0
        L41:
            if (r1 == 0) goto L5f
            java.lang.String r1 = r3.getMessage()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 52
            r4.<init>(r3)
            java.lang.String r3 = "Token retrieval failed: "
            java.lang.String r5 = ". Will retry token retrieval"
            java.lang.String r1 = p083f.C1932s.m4774a(r4, r3, r1, r5)
            goto L67
        L5f:
            java.lang.String r1 = r3.getMessage()
            if (r1 != 0) goto L6b
            java.lang.String r1 = "Token retrieval failed without exception message. Will retry token retrieval"
        L67:
            android.util.Log.w(r0, r1)
            return r2
        L6b:
            throw r3
    }

    @Override // java.lang.Runnable
    @android.annotation.SuppressLint({"WakelockTimeout"})
    public void run() {
            r5 = this;
            db.a0 r0 = p057db.C1388a0.m3906a()
            com.google.firebase.messaging.FirebaseMessaging r1 = r5.f7010a0
            android.content.Context r1 = r1.f6610d
            boolean r0 = r0.m3908c(r1)
            if (r0 == 0) goto L13
            android.os.PowerManager$WakeLock r0 = r5.f7009Z
            r0.acquire()
        L13:
            r0 = 0
            com.google.firebase.messaging.FirebaseMessaging r1 = r5.f7010a0     // Catch: java.io.IOException -> L8b java.lang.Throwable -> L8d
            r2 = 1
            r1.m3658f(r2)     // Catch: java.io.IOException -> L8b java.lang.Throwable -> L8d
            com.google.firebase.messaging.FirebaseMessaging r1 = r5.f7010a0     // Catch: java.io.IOException -> L8b java.lang.Throwable -> L8d
            db.v r1 = r1.f6614h     // Catch: java.io.IOException -> L8b java.lang.Throwable -> L8d
            boolean r1 = r1.m3949d()     // Catch: java.io.IOException -> L8b java.lang.Throwable -> L8d
            if (r1 != 0) goto L3d
            com.google.firebase.messaging.FirebaseMessaging r1 = r5.f7010a0     // Catch: java.io.IOException -> L8b java.lang.Throwable -> L8d
            r1.m3658f(r0)     // Catch: java.io.IOException -> L8b java.lang.Throwable -> L8d
            db.a0 r0 = p057db.C1388a0.m3906a()
            com.google.firebase.messaging.FirebaseMessaging r1 = r5.f7010a0
            android.content.Context r1 = r1.f6610d
            boolean r0 = r0.m3908c(r1)
            if (r0 == 0) goto L3c
        L37:
            android.os.PowerManager$WakeLock r0 = r5.f7009Z
            r0.release()
        L3c:
            return
        L3d:
            db.a0 r1 = p057db.C1388a0.m3906a()     // Catch: java.io.IOException -> L8b java.lang.Throwable -> L8d
            com.google.firebase.messaging.FirebaseMessaging r2 = r5.f7010a0     // Catch: java.io.IOException -> L8b java.lang.Throwable -> L8d
            android.content.Context r2 = r2.f6610d     // Catch: java.io.IOException -> L8b java.lang.Throwable -> L8d
            boolean r1 = r1.m3907b(r2)     // Catch: java.io.IOException -> L8b java.lang.Throwable -> L8d
            if (r1 == 0) goto L69
            boolean r1 = r5.m3912b()     // Catch: java.io.IOException -> L8b java.lang.Throwable -> L8d
            if (r1 != 0) goto L69
            db.c0$a r1 = new db.c0$a     // Catch: java.io.IOException -> L8b java.lang.Throwable -> L8d
            r1.<init>(r5)     // Catch: java.io.IOException -> L8b java.lang.Throwable -> L8d
            r1.m3914a()     // Catch: java.io.IOException -> L8b java.lang.Throwable -> L8d
            db.a0 r0 = p057db.C1388a0.m3906a()
            com.google.firebase.messaging.FirebaseMessaging r1 = r5.f7010a0
            android.content.Context r1 = r1.f6610d
            boolean r0 = r0.m3908c(r1)
            if (r0 == 0) goto L68
            goto L37
        L68:
            return
        L69:
            boolean r1 = r5.m3913c()     // Catch: java.io.IOException -> L8b java.lang.Throwable -> L8d
            if (r1 == 0) goto L75
            com.google.firebase.messaging.FirebaseMessaging r1 = r5.f7010a0     // Catch: java.io.IOException -> L8b java.lang.Throwable -> L8d
            r1.m3658f(r0)     // Catch: java.io.IOException -> L8b java.lang.Throwable -> L8d
            goto L7c
        L75:
            com.google.firebase.messaging.FirebaseMessaging r1 = r5.f7010a0     // Catch: java.io.IOException -> L8b java.lang.Throwable -> L8d
            long r2 = r5.f7008Y     // Catch: java.io.IOException -> L8b java.lang.Throwable -> L8d
            r1.m3660h(r2)     // Catch: java.io.IOException -> L8b java.lang.Throwable -> L8d
        L7c:
            db.a0 r0 = p057db.C1388a0.m3906a()
            com.google.firebase.messaging.FirebaseMessaging r1 = r5.f7010a0
            android.content.Context r1 = r1.f6610d
            boolean r0 = r0.m3908c(r1)
            if (r0 == 0) goto Lcd
            goto L37
        L8b:
            r1 = move-exception
            goto L8f
        L8d:
            r0 = move-exception
            goto Lce
        L8f:
            java.lang.String r2 = "FirebaseMessaging"
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L8d
            int r3 = r3.length()     // Catch: java.lang.Throwable -> L8d
            int r3 = r3 + 93
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = "Topic sync or token retrieval failed on hard failure exceptions: "
            r4.append(r3)     // Catch: java.lang.Throwable -> L8d
            r4.append(r1)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r1 = ". Won't retry the operation."
            r4.append(r1)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L8d
            android.util.Log.e(r2, r1)     // Catch: java.lang.Throwable -> L8d
            com.google.firebase.messaging.FirebaseMessaging r1 = r5.f7010a0     // Catch: java.lang.Throwable -> L8d
            r1.m3658f(r0)     // Catch: java.lang.Throwable -> L8d
            db.a0 r0 = p057db.C1388a0.m3906a()
            com.google.firebase.messaging.FirebaseMessaging r1 = r5.f7010a0
            android.content.Context r1 = r1.f6610d
            boolean r0 = r0.m3908c(r1)
            if (r0 == 0) goto Lcd
            goto L37
        Lcd:
            return
        Lce:
            db.a0 r1 = p057db.C1388a0.m3906a()
            com.google.firebase.messaging.FirebaseMessaging r2 = r5.f7010a0
            android.content.Context r2 = r2.f6610d
            boolean r1 = r1.m3908c(r2)
            if (r1 != 0) goto Ldd
            goto Le2
        Ldd:
            android.os.PowerManager$WakeLock r1 = r5.f7009Z
            r1.release()
        Le2:
            throw r0
    }
}
