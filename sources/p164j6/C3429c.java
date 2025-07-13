package p164j6;

/* renamed from: j6.c */
/* loaded from: classes.dex */
public class C3429c {

    /* renamed from: h */
    public static int f14874h;

    /* renamed from: i */
    public static android.app.PendingIntent f14875i;

    /* renamed from: a */
    public final p319s.C5941h<java.lang.String, p327s7.C5986j<android.os.Bundle>> f14876a;

    /* renamed from: b */
    public final android.content.Context f14877b;

    /* renamed from: c */
    public final p164j6.C3441o f14878c;

    /* renamed from: d */
    public final java.util.concurrent.ScheduledExecutorService f14879d;

    /* renamed from: e */
    public android.os.Messenger f14880e;

    /* renamed from: f */
    public android.os.Messenger f14881f;

    /* renamed from: g */
    public p164j6.C3430d f14882g;

    public C3429c(android.content.Context r5) {
            r4 = this;
            r4.<init>()
            s.h r0 = new s.h
            r0.<init>()
            r4.f14876a = r0
            r4.f14877b = r5
            j6.o r0 = new j6.o
            r0.<init>(r5)
            r4.f14878c = r0
            android.os.Messenger r5 = new android.os.Messenger
            j6.t r0 = new j6.t
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r4, r1)
            r5.<init>(r0)
            r4.f14880e = r5
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = new java.util.concurrent.ScheduledThreadPoolExecutor
            r0 = 1
            r5.<init>(r0)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r2 = 60
            r5.setKeepAliveTime(r2, r1)
            r5.allowCoreThreadTimeOut(r0)
            r4.f14879d = r5
            return
    }

    /* renamed from: a */
    public final void m7885a(java.lang.String r4, android.os.Bundle r5) {
            r3 = this;
            s.h<java.lang.String, s7.j<android.os.Bundle>> r0 = r3.f14876a
            monitor-enter(r0)
            s.h<java.lang.String, s7.j<android.os.Bundle>> r1 = r3.f14876a     // Catch: java.lang.Throwable -> L31
            java.lang.Object r1 = r1.remove(r4)     // Catch: java.lang.Throwable -> L31
            s7.j r1 = (p327s7.C5986j) r1     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L2a
            java.lang.String r5 = "Rpc"
            java.lang.String r1 = "Missing callback for "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L31
            int r2 = r4.length()     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L20
            java.lang.String r4 = r1.concat(r4)     // Catch: java.lang.Throwable -> L31
            goto L25
        L20:
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L31
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L31
        L25:
            android.util.Log.w(r5, r4)     // Catch: java.lang.Throwable -> L31
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            return
        L2a:
            s7.q<TResult> r4 = r1.f23075a     // Catch: java.lang.Throwable -> L31
            r4.m12473r(r5)     // Catch: java.lang.Throwable -> L31
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            return
        L31:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r4
    }

    /* renamed from: b */
    public final p327s7.AbstractC5985i<android.os.Bundle> m7886b(android.os.Bundle r9) {
            r8 = this;
            java.lang.Class<j6.c> r0 = p164j6.C3429c.class
            monitor-enter(r0)
            int r1 = p164j6.C3429c.f14874h     // Catch: java.lang.Throwable -> L112
            int r2 = r1 + 1
            p164j6.C3429c.f14874h = r2     // Catch: java.lang.Throwable -> L112
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch: java.lang.Throwable -> L112
            monitor-exit(r0)
            s7.j r2 = new s7.j
            r2.<init>()
            s.h<java.lang.String, s7.j<android.os.Bundle>> r3 = r8.f14876a
            monitor-enter(r3)
            s.h<java.lang.String, s7.j<android.os.Bundle>> r4 = r8.f14876a     // Catch: java.lang.Throwable -> L10f
            r4.put(r1, r2)     // Catch: java.lang.Throwable -> L10f
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L10f
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)
            j6.o r4 = r8.f14878c
            int r4 = r4.m7909a()
            r5 = 2
            if (r4 != r5) goto L32
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            goto L34
        L32:
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
        L34:
            r3.setAction(r4)
            r3.putExtras(r9)
            android.content.Context r9 = r8.f14877b
            monitor-enter(r0)
            android.app.PendingIntent r4 = p164j6.C3429c.f14875i     // Catch: java.lang.Throwable -> L10c
            if (r4 != 0) goto L52
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L10c
            r4.<init>()     // Catch: java.lang.Throwable -> L10c
            java.lang.String r6 = "com.google.example.invalidpackage"
            r4.setPackage(r6)     // Catch: java.lang.Throwable -> L10c
            r6 = 0
            android.app.PendingIntent r9 = android.app.PendingIntent.getBroadcast(r9, r6, r4, r6)     // Catch: java.lang.Throwable -> L10c
            p164j6.C3429c.f14875i = r9     // Catch: java.lang.Throwable -> L10c
        L52:
            java.lang.String r9 = "app"
            android.app.PendingIntent r4 = p164j6.C3429c.f14875i     // Catch: java.lang.Throwable -> L10c
            r3.putExtra(r9, r4)     // Catch: java.lang.Throwable -> L10c
            monitor-exit(r0)
            java.lang.String r9 = "kid"
            r0 = 5
            int r0 = p064e.C1489c.m4038a(r1, r0)
            java.lang.String r4 = "|ID|"
            java.lang.String r6 = "|"
            java.lang.String r0 = p088f4.C2035p.m5377a(r0, r4, r1, r6)
            r3.putExtra(r9, r0)
            java.lang.String r9 = "Rpc"
            r0 = 3
            boolean r9 = android.util.Log.isLoggable(r9, r0)
            if (r9 == 0) goto L99
            java.lang.String r9 = "Rpc"
            android.os.Bundle r4 = r3.getExtras()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r6 = r4.length()
            int r6 = r6 + 8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "Sending "
            r7.append(r6)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            android.util.Log.d(r9, r4)
        L99:
            java.lang.String r9 = "google.messenger"
            android.os.Messenger r4 = r8.f14880e
            r3.putExtra(r9, r4)
            android.os.Messenger r9 = r8.f14881f
            if (r9 != 0) goto La8
            j6.d r9 = r8.f14882g
            if (r9 == 0) goto Ld1
        La8:
            android.os.Message r9 = android.os.Message.obtain()
            r9.obj = r3
            android.os.Messenger r4 = r8.f14881f     // Catch: android.os.RemoteException -> Lc1
            if (r4 == 0) goto Lb6
            r4.send(r9)     // Catch: android.os.RemoteException -> Lc1
            goto Le4
        Lb6:
            j6.d r4 = r8.f14882g     // Catch: android.os.RemoteException -> Lc1
            android.os.Messenger r4 = r4.f14883Y     // Catch: android.os.RemoteException -> Lc1
            java.util.Objects.requireNonNull(r4)     // Catch: android.os.RemoteException -> Lc1
            r4.send(r9)     // Catch: android.os.RemoteException -> Lc1
            goto Le4
        Lc1:
            java.lang.String r9 = "Rpc"
            boolean r9 = android.util.Log.isLoggable(r9, r0)
            if (r9 == 0) goto Ld1
            java.lang.String r9 = "Rpc"
            java.lang.String r0 = "Messenger failed, fallback to startService"
            android.util.Log.d(r9, r0)
        Ld1:
            j6.o r9 = r8.f14878c
            int r9 = r9.m7909a()
            if (r9 != r5) goto Ldf
            android.content.Context r9 = r8.f14877b
            r9.sendBroadcast(r3)
            goto Le4
        Ldf:
            android.content.Context r9 = r8.f14877b
            r9.startService(r3)
        Le4:
            java.util.concurrent.ScheduledExecutorService r9 = r8.f14879d
            f6.i r0 = new f6.i
            r0.<init>(r2)
            r3 = 30
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.ScheduledFuture r9 = r9.schedule(r0, r3, r5)
            s7.q<TResult> r0 = r2.f23075a
            java.util.concurrent.Executor r3 = p164j6.ExecutorC3447u.f14918Y
            j6.s r4 = new j6.s
            r4.<init>(r8, r1, r9)
            z2.n r9 = r0.f23097b
            s7.n r1 = new s7.n
            r1.<init>(r3, r4)
            r9.m14310g(r1)
            r0.m12476u()
            s7.q<TResult> r9 = r2.f23075a
            return r9
        L10c:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        L10f:
            r9 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L10f
            throw r9
        L112:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
    }
}
