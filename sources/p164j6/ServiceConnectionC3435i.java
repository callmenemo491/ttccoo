package p164j6;

/* renamed from: j6.i */
/* loaded from: classes.dex */
public final class ServiceConnectionC3435i implements android.content.ServiceConnection {

    /* renamed from: Y */
    public int f14896Y;

    /* renamed from: Z */
    public final android.os.Messenger f14897Z;

    /* renamed from: a0 */
    public androidx.appcompat.widget.C0311x f14898a0;

    /* renamed from: b0 */
    public final java.util.Queue<p164j6.AbstractC3440n<?>> f14899b0;

    /* renamed from: c0 */
    public final android.util.SparseArray<p164j6.AbstractC3440n<?>> f14900c0;

    /* renamed from: d0 */
    public final /* synthetic */ p164j6.C3434h f14901d0;

    public ServiceConnectionC3435i(p164j6.C3434h r3, p036c6.C0906q0 r4) {
            r2 = this;
            r2.f14901d0 = r3
            r2.<init>()
            r3 = 0
            r2.f14896Y = r3
            android.os.Messenger r3 = new android.os.Messenger
            f7.a r4 = new f7.a
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            j6.k r1 = new j6.k
            r1.<init>(r2)
            r4.<init>(r0, r1)
            r3.<init>(r4)
            r2.f14897Z = r3
            java.util.ArrayDeque r3 = new java.util.ArrayDeque
            r3.<init>()
            r2.f14899b0 = r3
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r2.f14900c0 = r3
            return
    }

    /* renamed from: a */
    public final synchronized void m7901a(int r6, java.lang.String r7) {
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "MessengerIpcClient"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto L26
            java.lang.String r0 = "MessengerIpcClient"
            java.lang.String r2 = "Disconnected: "
            java.lang.String r3 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> Lb8
            int r4 = r3.length()     // Catch: java.lang.Throwable -> Lb8
            if (r4 == 0) goto L1d
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> Lb8
            goto L23
        L1d:
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> Lb8
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lb8
            r2 = r3
        L23:
            android.util.Log.d(r0, r2)     // Catch: java.lang.Throwable -> Lb8
        L26:
            int r0 = r5.f14896Y     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto Lb2
            r2 = 2
            r3 = 1
            r4 = 4
            if (r0 == r3) goto L56
            if (r0 == r2) goto L56
            if (r0 == r1) goto L52
            if (r0 != r4) goto L37
            monitor-exit(r5)
            return
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb8
            int r7 = r5.f14896Y     // Catch: java.lang.Throwable -> Lb8
            r0 = 26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb8
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r0 = "Unknown state: "
            r1.append(r0)     // Catch: java.lang.Throwable -> Lb8
            r1.append(r7)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> Lb8
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lb8
            throw r6     // Catch: java.lang.Throwable -> Lb8
        L52:
            r5.f14896Y = r4     // Catch: java.lang.Throwable -> Lb8
            monitor-exit(r5)
            return
        L56:
            java.lang.String r0 = "MessengerIpcClient"
            boolean r0 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto L65
            java.lang.String r0 = "MessengerIpcClient"
            java.lang.String r1 = "Unbinding service"
            android.util.Log.v(r0, r1)     // Catch: java.lang.Throwable -> Lb8
        L65:
            r5.f14896Y = r4     // Catch: java.lang.Throwable -> Lb8
            t6.a r0 = p338t6.C6181a.m12748b()     // Catch: java.lang.Throwable -> Lb8
            j6.h r1 = r5.f14901d0     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r1 = r1.f14892Z     // Catch: java.lang.Throwable -> Lb8
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Throwable -> Lb8
            r0.m12750c(r1, r5)     // Catch: java.lang.Throwable -> Lb8
            j6.m r0 = new j6.m     // Catch: java.lang.Throwable -> Lb8
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> Lb8
            java.util.Queue<j6.n<?>> r6 = r5.f14899b0     // Catch: java.lang.Throwable -> Lb8
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> Lb8
        L7f:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> Lb8
            if (r7 == 0) goto L8f
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> Lb8
            j6.n r7 = (p164j6.AbstractC3440n) r7     // Catch: java.lang.Throwable -> Lb8
            r7.m7907b(r0)     // Catch: java.lang.Throwable -> Lb8
            goto L7f
        L8f:
            java.util.Queue<j6.n<?>> r6 = r5.f14899b0     // Catch: java.lang.Throwable -> Lb8
            r6.clear()     // Catch: java.lang.Throwable -> Lb8
            r6 = 0
        L95:
            android.util.SparseArray<j6.n<?>> r7 = r5.f14900c0     // Catch: java.lang.Throwable -> Lb8
            int r7 = r7.size()     // Catch: java.lang.Throwable -> Lb8
            if (r6 >= r7) goto Lab
            android.util.SparseArray<j6.n<?>> r7 = r5.f14900c0     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r7 = r7.valueAt(r6)     // Catch: java.lang.Throwable -> Lb8
            j6.n r7 = (p164j6.AbstractC3440n) r7     // Catch: java.lang.Throwable -> Lb8
            r7.m7907b(r0)     // Catch: java.lang.Throwable -> Lb8
            int r6 = r6 + 1
            goto L95
        Lab:
            android.util.SparseArray<j6.n<?>> r6 = r5.f14900c0     // Catch: java.lang.Throwable -> Lb8
            r6.clear()     // Catch: java.lang.Throwable -> Lb8
            monitor-exit(r5)
            return
        Lb2:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb8
            r6.<init>()     // Catch: java.lang.Throwable -> Lb8
            throw r6     // Catch: java.lang.Throwable -> Lb8
        Lb8:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    /* renamed from: b */
    public final synchronized boolean m7902b(p164j6.AbstractC3440n<?> r6) {
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f14896Y     // Catch: java.lang.Throwable -> La2
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L4c
            if (r0 == r2) goto L45
            if (r0 == r1) goto L30
            r6 = 3
            if (r0 == r6) goto L2e
            r6 = 4
            if (r0 != r6) goto L13
            goto L2e
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La2
            int r0 = r5.f14896Y     // Catch: java.lang.Throwable -> La2
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r2.<init>(r1)     // Catch: java.lang.Throwable -> La2
            java.lang.String r1 = "Unknown state: "
            r2.append(r1)     // Catch: java.lang.Throwable -> La2
            r2.append(r0)     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> La2
            r6.<init>(r0)     // Catch: java.lang.Throwable -> La2
            throw r6     // Catch: java.lang.Throwable -> La2
        L2e:
            monitor-exit(r5)
            return r3
        L30:
            java.util.Queue<j6.n<?>> r0 = r5.f14899b0     // Catch: java.lang.Throwable -> La2
            r0.add(r6)     // Catch: java.lang.Throwable -> La2
            j6.h r6 = r5.f14901d0     // Catch: java.lang.Throwable -> La2
            java.lang.Object r6 = r6.f14893a0     // Catch: java.lang.Throwable -> La2
            java.util.concurrent.ScheduledExecutorService r6 = (java.util.concurrent.ScheduledExecutorService) r6     // Catch: java.lang.Throwable -> La2
            j6.j r0 = new j6.j     // Catch: java.lang.Throwable -> La2
            r0.<init>(r5, r2)     // Catch: java.lang.Throwable -> La2
            r6.execute(r0)     // Catch: java.lang.Throwable -> La2
            monitor-exit(r5)
            return r2
        L45:
            java.util.Queue<j6.n<?>> r0 = r5.f14899b0     // Catch: java.lang.Throwable -> La2
            r0.add(r6)     // Catch: java.lang.Throwable -> La2
            monitor-exit(r5)
            return r2
        L4c:
            java.util.Queue<j6.n<?>> r0 = r5.f14899b0     // Catch: java.lang.Throwable -> La2
            r0.add(r6)     // Catch: java.lang.Throwable -> La2
            int r6 = r5.f14896Y     // Catch: java.lang.Throwable -> La2
            if (r6 != 0) goto L57
            r6 = 1
            goto L58
        L57:
            r6 = 0
        L58:
            com.google.android.gms.common.internal.C1101a.m3105j(r6)     // Catch: java.lang.Throwable -> La2
            java.lang.String r6 = "MessengerIpcClient"
            boolean r6 = android.util.Log.isLoggable(r6, r1)     // Catch: java.lang.Throwable -> La2
            if (r6 == 0) goto L6a
            java.lang.String r6 = "MessengerIpcClient"
            java.lang.String r0 = "Starting bind to GmsCore"
            android.util.Log.v(r6, r0)     // Catch: java.lang.Throwable -> La2
        L6a:
            r5.f14896Y = r2     // Catch: java.lang.Throwable -> La2
            android.content.Intent r6 = new android.content.Intent     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = "com.google.android.gms"
            r6.setPackage(r0)     // Catch: java.lang.Throwable -> La2
            t6.a r0 = p338t6.C6181a.m12748b()     // Catch: java.lang.Throwable -> La2
            j6.h r1 = r5.f14901d0     // Catch: java.lang.Throwable -> La2
            java.lang.Object r1 = r1.f14892Z     // Catch: java.lang.Throwable -> La2
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Throwable -> La2
            boolean r6 = r0.m12749a(r1, r6, r5, r2)     // Catch: java.lang.Throwable -> La2
            if (r6 != 0) goto L8e
            java.lang.String r6 = "Unable to bind to service"
            r5.m7901a(r3, r6)     // Catch: java.lang.Throwable -> La2
            goto La0
        L8e:
            j6.h r6 = r5.f14901d0     // Catch: java.lang.Throwable -> La2
            java.lang.Object r6 = r6.f14893a0     // Catch: java.lang.Throwable -> La2
            java.util.concurrent.ScheduledExecutorService r6 = (java.util.concurrent.ScheduledExecutorService) r6     // Catch: java.lang.Throwable -> La2
            j6.j r0 = new j6.j     // Catch: java.lang.Throwable -> La2
            r0.<init>(r5, r3)     // Catch: java.lang.Throwable -> La2
            r3 = 30
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> La2
            r6.schedule(r0, r3, r1)     // Catch: java.lang.Throwable -> La2
        La0:
            monitor-exit(r5)
            return r2
        La2:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    /* renamed from: c */
    public final synchronized void m7903c() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f14896Y     // Catch: java.lang.Throwable -> L37
            r1 = 2
            if (r0 != r1) goto L35
            java.util.Queue<j6.n<?>> r0 = r2.f14899b0     // Catch: java.lang.Throwable -> L37
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L35
            android.util.SparseArray<j6.n<?>> r0 = r2.f14900c0     // Catch: java.lang.Throwable -> L37
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L35
            java.lang.String r0 = "MessengerIpcClient"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L25
            java.lang.String r0 = "MessengerIpcClient"
            java.lang.String r1 = "Finished handling requests, unbinding"
            android.util.Log.v(r0, r1)     // Catch: java.lang.Throwable -> L37
        L25:
            r0 = 3
            r2.f14896Y = r0     // Catch: java.lang.Throwable -> L37
            t6.a r0 = p338t6.C6181a.m12748b()     // Catch: java.lang.Throwable -> L37
            j6.h r1 = r2.f14901d0     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r1.f14892Z     // Catch: java.lang.Throwable -> L37
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Throwable -> L37
            r0.m12750c(r1, r2)     // Catch: java.lang.Throwable -> L37
        L35:
            monitor-exit(r2)
            return
        L37:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName r2, android.os.IBinder r3) {
            r1 = this;
            java.lang.String r2 = "MessengerIpcClient"
            r0 = 2
            boolean r0 = android.util.Log.isLoggable(r2, r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = "Service connected"
            android.util.Log.v(r2, r0)
        Le:
            j6.h r2 = r1.f14901d0
            java.lang.Object r2 = r2.f14893a0
            java.util.concurrent.ScheduledExecutorService r2 = (java.util.concurrent.ScheduledExecutorService) r2
            h6.a0 r0 = new h6.a0
            r0.<init>(r1, r3)
            r2.execute(r0)
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName r3) {
            r2 = this;
            java.lang.String r3 = "MessengerIpcClient"
            r0 = 2
            boolean r1 = android.util.Log.isLoggable(r3, r0)
            if (r1 == 0) goto Le
            java.lang.String r1 = "Service disconnected"
            android.util.Log.v(r3, r1)
        Le:
            j6.h r3 = r2.f14901d0
            java.lang.Object r3 = r3.f14893a0
            java.util.concurrent.ScheduledExecutorService r3 = (java.util.concurrent.ScheduledExecutorService) r3
            j6.j r1 = new j6.j
            r1.<init>(r2, r0)
            r3.execute(r1)
            return
    }
}
