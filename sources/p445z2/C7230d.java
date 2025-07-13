package p445z2;

/* renamed from: z2.d */
/* loaded from: classes.dex */
public final class C7230d implements p445z2.InterfaceC7228b {

    /* renamed from: Y */
    public final android.content.Context f27802Y;

    /* renamed from: Z */
    public final p445z2.InterfaceC7228b.a f27803Z;

    /* renamed from: a0 */
    public boolean f27804a0;

    /* renamed from: b0 */
    public boolean f27805b0;

    /* renamed from: c0 */
    public final android.content.BroadcastReceiver f27806c0;

    /* renamed from: z2.d$a */
    public class a extends android.content.BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ p445z2.C7230d f27807a;

        public a(p445z2.C7230d r1) {
                r0 = this;
                r0.f27807a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r2, android.content.Intent r3) {
                r1 = this;
                z2.d r3 = r1.f27807a
                boolean r0 = r3.f27804a0
                boolean r2 = r3.m14291a(r2)
                r3.f27804a0 = r2
                z2.d r2 = r1.f27807a
                boolean r2 = r2.f27804a0
                if (r0 == r2) goto L49
                java.lang.String r2 = "ConnectivityMonitor"
                r3 = 3
                boolean r2 = android.util.Log.isLoggable(r2, r3)
                if (r2 == 0) goto L2f
                java.lang.String r2 = "ConnectivityMonitor"
                java.lang.String r3 = "connectivity changed, isConnected: "
                java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
                z2.d r0 = r1.f27807a
                boolean r0 = r0.f27804a0
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                android.util.Log.d(r2, r3)
            L2f:
                z2.d r2 = r1.f27807a
                z2.b$a r3 = r2.f27803Z
                boolean r2 = r2.f27804a0
                com.bumptech.glide.j$b r3 = (com.bumptech.glide.ComponentCallbacks2C1006j.b) r3
                java.util.Objects.requireNonNull(r3)
                if (r2 == 0) goto L49
                com.bumptech.glide.j r2 = r3.f5178b
                monitor-enter(r2)
                z2.n r3 = r3.f5177a     // Catch: java.lang.Throwable -> L46
                r3.m14307d()     // Catch: java.lang.Throwable -> L46
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L46
                goto L49
            L46:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L46
                throw r3
            L49:
                return
        }
    }

    public C7230d(android.content.Context r2, p445z2.InterfaceC7228b.a r3) {
            r1 = this;
            r1.<init>()
            z2.d$a r0 = new z2.d$a
            r0.<init>(r1)
            r1.f27806c0 = r0
            android.content.Context r2 = r2.getApplicationContext()
            r1.f27802Y = r2
            r1.f27803Z = r3
            return
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public boolean m14291a(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "connectivity"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r4, r0)
            r0 = 1
            android.net.NetworkInfo r4 = r4.getActiveNetworkInfo()     // Catch: java.lang.RuntimeException -> L1d
            if (r4 == 0) goto L1b
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L1b
            goto L1c
        L1b:
            r0 = 0
        L1c:
            return r0
        L1d:
            r4 = move-exception
            r1 = 5
            java.lang.String r2 = "ConnectivityMonitor"
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto L2c
            java.lang.String r1 = "Failed to determine connectivity status when connectivity changed"
            android.util.Log.w(r2, r1, r4)
        L2c:
            return r0
    }

    @Override // p445z2.InterfaceC7235i
    /* renamed from: d */
    public void mo2567d() {
            r2 = this;
            boolean r0 = r2.f27805b0
            if (r0 != 0) goto L5
            goto Lf
        L5:
            android.content.Context r0 = r2.f27802Y
            android.content.BroadcastReceiver r1 = r2.f27806c0
            r0.unregisterReceiver(r1)
            r0 = 0
            r2.f27805b0 = r0
        Lf:
            return
    }

    @Override // p445z2.InterfaceC7235i
    /* renamed from: l */
    public void mo2575l() {
            r4 = this;
            boolean r0 = r4.f27805b0
            if (r0 == 0) goto L5
            goto L2e
        L5:
            android.content.Context r0 = r4.f27802Y
            boolean r0 = r4.m14291a(r0)
            r4.f27804a0 = r0
            android.content.Context r0 = r4.f27802Y     // Catch: java.lang.SecurityException -> L1f
            android.content.BroadcastReceiver r1 = r4.f27806c0     // Catch: java.lang.SecurityException -> L1f
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch: java.lang.SecurityException -> L1f
            java.lang.String r3 = "android.net.conn.CONNECTIVITY_CHANGE"
            r2.<init>(r3)     // Catch: java.lang.SecurityException -> L1f
            r0.registerReceiver(r1, r2)     // Catch: java.lang.SecurityException -> L1f
            r0 = 1
            r4.f27805b0 = r0     // Catch: java.lang.SecurityException -> L1f
            goto L2e
        L1f:
            r0 = move-exception
            r1 = 5
            java.lang.String r2 = "ConnectivityMonitor"
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto L2e
            java.lang.String r1 = "Failed to register"
            android.util.Log.w(r2, r1, r0)
        L2e:
            return
    }

    @Override // p445z2.InterfaceC7235i
    /* renamed from: m */
    public void mo2576m() {
            r0 = this;
            return
    }
}
