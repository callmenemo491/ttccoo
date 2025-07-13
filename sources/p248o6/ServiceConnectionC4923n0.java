package p248o6;

/* renamed from: o6.n0 */
/* loaded from: classes.dex */
public final class ServiceConnectionC4923n0 implements android.content.ServiceConnection, p248o6.InterfaceC4927p0 {

    /* renamed from: Y */
    public final java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection> f19520Y;

    /* renamed from: Z */
    public int f19521Z;

    /* renamed from: a0 */
    public boolean f19522a0;

    /* renamed from: b0 */
    public android.os.IBinder f19523b0;

    /* renamed from: c0 */
    public final p248o6.AbstractC4912i.a f19524c0;

    /* renamed from: d0 */
    public android.content.ComponentName f19525d0;

    /* renamed from: e0 */
    public final /* synthetic */ p248o6.C4919l0 f19526e0;

    public ServiceConnectionC4923n0(p248o6.C4919l0 r1, p248o6.AbstractC4912i.a r2) {
            r0 = this;
            r0.f19526e0 = r1
            r0.<init>()
            r0.f19524c0 = r2
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f19520Y = r1
            r1 = 2
            r0.f19521Z = r1
            return
    }

    /* renamed from: a */
    public final void m11073a(java.lang.String r10) {
            r9 = this;
            r0 = 3
            r9.f19521Z = r0
            o6.l0 r0 = r9.f19526e0
            t6.a r1 = r0.f19512f
            android.content.Context r2 = r0.f19510d
            o6.i$a r0 = r9.f19524c0
            java.lang.String r3 = r0.f19499a
            r4 = 0
            if (r3 == 0) goto L88
            boolean r3 = r0.f19502d
            if (r3 == 0) goto L78
            java.lang.String r3 = "ConnectionStatusConfig"
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = r0.f19499a
            java.lang.String r7 = "serviceActionBundleKey"
            r5.putString(r7, r6)
            android.content.ContentResolver r6 = r2.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L2f
            android.net.Uri r7 = p248o6.AbstractC4912i.a.f19498e     // Catch: java.lang.IllegalArgumentException -> L2f
            java.lang.String r8 = "serviceIntentCall"
            android.os.Bundle r5 = r6.call(r7, r8, r4, r5)     // Catch: java.lang.IllegalArgumentException -> L2f
            goto L4f
        L2f:
            r5 = move-exception
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            int r6 = r6 + 34
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "Dynamic intent resolution failed: "
            r7.append(r6)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            android.util.Log.w(r3, r5)
            r5 = r4
        L4f:
            if (r5 != 0) goto L52
            goto L5a
        L52:
            java.lang.String r4 = "serviceResponseIntentKey"
            android.os.Parcelable r4 = r5.getParcelable(r4)
            android.content.Intent r4 = (android.content.Intent) r4
        L5a:
            if (r4 != 0) goto L78
            java.lang.String r5 = "Dynamic lookup for intent failed for action: "
            java.lang.String r6 = r0.f19499a
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r7 = r6.length()
            if (r7 == 0) goto L6f
            java.lang.String r5 = r5.concat(r6)
            goto L75
        L6f:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r5)
            r5 = r6
        L75:
            android.util.Log.w(r3, r5)
        L78:
            if (r4 != 0) goto L92
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = r0.f19499a
            r3.<init>(r4)
            java.lang.String r0 = r0.f19500b
            android.content.Intent r0 = r3.setPackage(r0)
            goto L91
        L88:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.Intent r0 = r0.setComponent(r4)
        L91:
            r4 = r0
        L92:
            o6.i$a r0 = r9.f19524c0
            int r6 = r0.f19501c
            r3 = r10
            r5 = r9
            boolean r10 = r1.m12751d(r2, r3, r4, r5, r6)
            r9.f19522a0 = r10
            if (r10 == 0) goto Lb5
            o6.l0 r10 = r9.f19526e0
            android.os.Handler r10 = r10.f19511e
            r0 = 1
            o6.i$a r1 = r9.f19524c0
            android.os.Message r10 = r10.obtainMessage(r0, r1)
            o6.l0 r0 = r9.f19526e0
            android.os.Handler r1 = r0.f19511e
            long r2 = r0.f19514h
            r1.sendMessageDelayed(r10, r2)
            return
        Lb5:
            r10 = 2
            r9.f19521Z = r10
            o6.l0 r10 = r9.f19526e0     // Catch: java.lang.IllegalArgumentException -> Lc1
            t6.a r0 = r10.f19512f     // Catch: java.lang.IllegalArgumentException -> Lc1
            android.content.Context r10 = r10.f19510d     // Catch: java.lang.IllegalArgumentException -> Lc1
            r0.m12750c(r10, r9)     // Catch: java.lang.IllegalArgumentException -> Lc1
        Lc1:
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName r5, android.os.IBinder r6) {
            r4 = this;
            o6.l0 r0 = r4.f19526e0
            java.util.HashMap<o6.i$a, o6.n0> r0 = r0.f19509c
            monitor-enter(r0)
            o6.l0 r1 = r4.f19526e0     // Catch: java.lang.Throwable -> L31
            android.os.Handler r1 = r1.f19511e     // Catch: java.lang.Throwable -> L31
            o6.i$a r2 = r4.f19524c0     // Catch: java.lang.Throwable -> L31
            r3 = 1
            r1.removeMessages(r3, r2)     // Catch: java.lang.Throwable -> L31
            r4.f19523b0 = r6     // Catch: java.lang.Throwable -> L31
            r4.f19525d0 = r5     // Catch: java.lang.Throwable -> L31
            java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection> r1 = r4.f19520Y     // Catch: java.lang.Throwable -> L31
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L31
        L1d:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L31
            android.content.ServiceConnection r2 = (android.content.ServiceConnection) r2     // Catch: java.lang.Throwable -> L31
            r2.onServiceConnected(r5, r6)     // Catch: java.lang.Throwable -> L31
            goto L1d
        L2d:
            r4.f19521Z = r3     // Catch: java.lang.Throwable -> L31
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            return
        L31:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r5
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName r5) {
            r4 = this;
            o6.l0 r0 = r4.f19526e0
            java.util.HashMap<o6.i$a, o6.n0> r0 = r0.f19509c
            monitor-enter(r0)
            o6.l0 r1 = r4.f19526e0     // Catch: java.lang.Throwable -> L33
            android.os.Handler r1 = r1.f19511e     // Catch: java.lang.Throwable -> L33
            r2 = 1
            o6.i$a r3 = r4.f19524c0     // Catch: java.lang.Throwable -> L33
            r1.removeMessages(r2, r3)     // Catch: java.lang.Throwable -> L33
            r1 = 0
            r4.f19523b0 = r1     // Catch: java.lang.Throwable -> L33
            r4.f19525d0 = r5     // Catch: java.lang.Throwable -> L33
            java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection> r1 = r4.f19520Y     // Catch: java.lang.Throwable -> L33
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L33
        L1e:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L33
            android.content.ServiceConnection r2 = (android.content.ServiceConnection) r2     // Catch: java.lang.Throwable -> L33
            r2.onServiceDisconnected(r5)     // Catch: java.lang.Throwable -> L33
            goto L1e
        L2e:
            r5 = 2
            r4.f19521Z = r5     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r5
    }
}
