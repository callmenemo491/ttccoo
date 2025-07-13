package p164j6;

/* renamed from: j6.j */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3436j implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f14902Y;

    /* renamed from: Z */
    public final p164j6.ServiceConnectionC3435i f14903Z;

    public RunnableC3436j(p164j6.ServiceConnectionC3435i r2, int r3) {
            r1 = this;
            r1.f14902Y = r3
            r0 = 1
            if (r3 == r0) goto L14
            r0 = 2
            if (r3 == r0) goto Le
            r1.<init>()
            r1.f14903Z = r2
            return
        Le:
            r1.<init>()
            r1.f14903Z = r2
            return
        L14:
            r1.<init>()
            r1.f14903Z = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r8 = this;
            int r0 = r8.f14902Y
            r1 = 2
            switch(r0) {
                case 0: goto Ld7;
                case 1: goto L8;
                default: goto L6;
            }
        L6:
            goto Le9
        L8:
            j6.i r0 = r8.f14903Z
        La:
            monitor-enter(r0)
            int r2 = r0.f14896Y     // Catch: java.lang.Throwable -> Ld4
            if (r2 == r1) goto L10
            goto L1b
        L10:
            java.util.Queue<j6.n<?>> r2 = r0.f14899b0     // Catch: java.lang.Throwable -> Ld4
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Ld4
            if (r2 == 0) goto L1d
            r0.m7903c()     // Catch: java.lang.Throwable -> Ld4
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld4
            return
        L1d:
            java.util.Queue<j6.n<?>> r2 = r0.f14899b0     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> Ld4
            j6.n r2 = (p164j6.AbstractC3440n) r2     // Catch: java.lang.Throwable -> Ld4
            android.util.SparseArray<j6.n<?>> r3 = r0.f14900c0     // Catch: java.lang.Throwable -> Ld4
            int r4 = r2.f14905a     // Catch: java.lang.Throwable -> Ld4
            r3.put(r4, r2)     // Catch: java.lang.Throwable -> Ld4
            j6.h r3 = r0.f14901d0     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object r3 = r3.f14893a0     // Catch: java.lang.Throwable -> Ld4
            java.util.concurrent.ScheduledExecutorService r3 = (java.util.concurrent.ScheduledExecutorService) r3     // Catch: java.lang.Throwable -> Ld4
            h6.a0 r4 = new h6.a0     // Catch: java.lang.Throwable -> Ld4
            r4.<init>(r0, r2)     // Catch: java.lang.Throwable -> Ld4
            r5 = 30
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> Ld4
            r3.schedule(r4, r5, r7)     // Catch: java.lang.Throwable -> Ld4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r3 = "MessengerIpcClient"
            r4 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L68
            java.lang.String r3 = "MessengerIpcClient"
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r5 = r4.length()
            int r5 = r5 + 8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Sending "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            android.util.Log.d(r3, r4)
        L68:
            j6.h r3 = r0.f14901d0
            java.lang.Object r3 = r3.f14892Z
            android.content.Context r3 = (android.content.Context) r3
            android.os.Messenger r4 = r0.f14897Z
            android.os.Message r5 = android.os.Message.obtain()
            int r6 = r2.f14907c
            r5.what = r6
            int r6 = r2.f14905a
            r5.arg1 = r6
            r5.replyTo = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = "oneWay"
            boolean r7 = r2.mo7905d()
            r4.putBoolean(r6, r7)
            java.lang.String r6 = "pkg"
            java.lang.String r3 = r3.getPackageName()
            r4.putString(r6, r3)
            java.lang.String r3 = "data"
            android.os.Bundle r2 = r2.f14908d
            r4.putBundle(r3, r2)
            r5.setData(r4)
            androidx.appcompat.widget.x r2 = r0.f14898a0     // Catch: android.os.RemoteException -> Lca
            java.lang.Object r3 = r2.f1481Z     // Catch: android.os.RemoteException -> Lca
            r4 = r3
            android.os.Messenger r4 = (android.os.Messenger) r4     // Catch: android.os.RemoteException -> Lca
            if (r4 == 0) goto Laf
            android.os.Messenger r3 = (android.os.Messenger) r3     // Catch: android.os.RemoteException -> Lca
            r3.send(r5)     // Catch: android.os.RemoteException -> Lca
            goto La
        Laf:
            java.lang.Object r2 = r2.f1482a0     // Catch: android.os.RemoteException -> Lca
            r3 = r2
            j6.d r3 = (p164j6.C3430d) r3     // Catch: android.os.RemoteException -> Lca
            if (r3 == 0) goto Lc2
            j6.d r2 = (p164j6.C3430d) r2     // Catch: android.os.RemoteException -> Lca
            android.os.Messenger r2 = r2.f14883Y     // Catch: android.os.RemoteException -> Lca
            java.util.Objects.requireNonNull(r2)     // Catch: android.os.RemoteException -> Lca
            r2.send(r5)     // Catch: android.os.RemoteException -> Lca
            goto La
        Lc2:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: android.os.RemoteException -> Lca
            java.lang.String r3 = "Both messengers are null"
            r2.<init>(r3)     // Catch: android.os.RemoteException -> Lca
            throw r2     // Catch: android.os.RemoteException -> Lca
        Lca:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            r0.m7901a(r1, r2)
            goto La
        Ld4:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld4
            throw r1
        Ld7:
            j6.i r0 = r8.f14903Z
            monitor-enter(r0)
            int r1 = r0.f14896Y     // Catch: java.lang.Throwable -> Le6
            r2 = 1
            if (r1 != r2) goto Le4
            java.lang.String r1 = "Timed out while binding"
            r0.m7901a(r2, r1)     // Catch: java.lang.Throwable -> Le6
        Le4:
            monitor-exit(r0)
            return
        Le6:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        Le9:
            j6.i r0 = r8.f14903Z
            java.lang.String r2 = "Service disconnected"
            r0.m7901a(r1, r2)
            return
    }
}
