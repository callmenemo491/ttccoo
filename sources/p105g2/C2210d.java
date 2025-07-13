package p105g2;

/* renamed from: g2.d */
/* loaded from: classes.dex */
public class C2210d extends java.lang.Thread {

    /* renamed from: e0 */
    public static final boolean f10114e0 = false;

    /* renamed from: Y */
    public final java.util.concurrent.BlockingQueue<p105g2.AbstractC2220n<?>> f10115Y;

    /* renamed from: Z */
    public final java.util.concurrent.BlockingQueue<p105g2.AbstractC2220n<?>> f10116Z;

    /* renamed from: a0 */
    public final p105g2.InterfaceC2208b f10117a0;

    /* renamed from: b0 */
    public final p105g2.InterfaceC2223q f10118b0;

    /* renamed from: c0 */
    public volatile boolean f10119c0;

    /* renamed from: d0 */
    public final p105g2.C2228v f10120d0;

    static {
            boolean r0 = p105g2.C2227u.f10176a
            p105g2.C2210d.f10114e0 = r0
            return
    }

    public C2210d(java.util.concurrent.BlockingQueue<p105g2.AbstractC2220n<?>> r2, java.util.concurrent.BlockingQueue<p105g2.AbstractC2220n<?>> r3, p105g2.InterfaceC2208b r4, p105g2.InterfaceC2223q r5) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f10119c0 = r0
            r1.f10115Y = r2
            r1.f10116Z = r3
            r1.f10117a0 = r4
            r1.f10118b0 = r5
            g2.v r2 = new g2.v
            r2.<init>(r1, r3, r5)
            r1.f10120d0 = r2
            return
    }

    /* renamed from: a */
    public final void m5798a() {
            r12 = this;
            java.util.concurrent.BlockingQueue<g2.n<?>> r0 = r12.f10115Y
            java.lang.Object r0 = r0.take()
            g2.n r0 = (p105g2.AbstractC2220n) r0
            java.lang.String r1 = "cache-queue-take"
            r0.m5801e(r1)
            r1 = 1
            r0.m5813w(r1)
            r2 = 2
            boolean r3 = r0.m5808r()     // Catch: java.lang.Throwable -> Lea
            if (r3 == 0) goto L22
            java.lang.String r1 = "cache-discard-canceled"
            r0.m5804k(r1)     // Catch: java.lang.Throwable -> Lea
        L1d:
            r0.m5813w(r2)
            goto Le9
        L22:
            g2.b r3 = r12.f10117a0     // Catch: java.lang.Throwable -> Lea
            java.lang.String r4 = r0.m5805o()     // Catch: java.lang.Throwable -> Lea
            h2.d r3 = (p119h2.C2442d) r3     // Catch: java.lang.Throwable -> Lea
            g2.b$a r3 = r3.m6202a(r4)     // Catch: java.lang.Throwable -> Lea
            if (r3 != 0) goto L43
            java.lang.String r1 = "cache-miss"
            r0.m5801e(r1)     // Catch: java.lang.Throwable -> Lea
            g2.v r1 = r12.f10120d0     // Catch: java.lang.Throwable -> Lea
            boolean r1 = r1.m5825a(r0)     // Catch: java.lang.Throwable -> Lea
            if (r1 != 0) goto L1d
            java.util.concurrent.BlockingQueue<g2.n<?>> r1 = r12.f10116Z     // Catch: java.lang.Throwable -> Lea
        L3f:
            r1.put(r0)     // Catch: java.lang.Throwable -> Lea
            goto L1d
        L43:
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lea
            long r6 = r3.f10108e     // Catch: java.lang.Throwable -> Lea
            r8 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 >= 0) goto L50
            r6 = 1
            goto L51
        L50:
            r6 = 0
        L51:
            if (r6 == 0) goto L65
            java.lang.String r1 = "cache-hit-expired"
            r0.m5801e(r1)     // Catch: java.lang.Throwable -> Lea
            r0.f10152k0 = r3     // Catch: java.lang.Throwable -> Lea
            g2.v r1 = r12.f10120d0     // Catch: java.lang.Throwable -> Lea
            boolean r1 = r1.m5825a(r0)     // Catch: java.lang.Throwable -> Lea
            if (r1 != 0) goto L1d
            java.util.concurrent.BlockingQueue<g2.n<?>> r1 = r12.f10116Z     // Catch: java.lang.Throwable -> Lea
            goto L3f
        L65:
            java.lang.String r6 = "cache-hit"
            r0.m5801e(r6)     // Catch: java.lang.Throwable -> Lea
            g2.l r6 = new g2.l     // Catch: java.lang.Throwable -> Lea
            byte[] r7 = r3.f10104a     // Catch: java.lang.Throwable -> Lea
            java.util.Map<java.lang.String, java.lang.String> r9 = r3.f10110g     // Catch: java.lang.Throwable -> Lea
            r6.<init>(r7, r9)     // Catch: java.lang.Throwable -> Lea
            g2.p r6 = r0.mo5812v(r6)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r7 = "cache-hit-parsed"
            r0.m5801e(r7)     // Catch: java.lang.Throwable -> Lea
            g2.t r7 = r6.f10173c     // Catch: java.lang.Throwable -> Lea
            if (r7 != 0) goto L82
            r7 = 1
            goto L83
        L82:
            r7 = 0
        L83:
            r9 = 0
            if (r7 != 0) goto Lb4
            java.lang.String r1 = "cache-parsing-failed"
            r0.m5801e(r1)     // Catch: java.lang.Throwable -> Lea
            g2.b r1 = r12.f10117a0     // Catch: java.lang.Throwable -> Lea
            java.lang.String r3 = r0.m5805o()     // Catch: java.lang.Throwable -> Lea
            h2.d r1 = (p119h2.C2442d) r1     // Catch: java.lang.Throwable -> Lea
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lea
            g2.b$a r4 = r1.m6202a(r3)     // Catch: java.lang.Throwable -> Lb1
            if (r4 == 0) goto La3
            r5 = 0
            r4.f10109f = r5     // Catch: java.lang.Throwable -> Lb1
            r4.f10108e = r5     // Catch: java.lang.Throwable -> Lb1
            r1.m6207f(r3, r4)     // Catch: java.lang.Throwable -> Lb1
        La3:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lea
            r0.f10152k0 = r9     // Catch: java.lang.Throwable -> Lea
            g2.v r1 = r12.f10120d0     // Catch: java.lang.Throwable -> Lea
            boolean r1 = r1.m5825a(r0)     // Catch: java.lang.Throwable -> Lea
            if (r1 != 0) goto L1d
            java.util.concurrent.BlockingQueue<g2.n<?>> r1 = r12.f10116Z     // Catch: java.lang.Throwable -> Lea
            goto L3f
        Lb1:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lea
            throw r3     // Catch: java.lang.Throwable -> Lea
        Lb4:
            long r10 = r3.f10109f     // Catch: java.lang.Throwable -> Lea
            int r7 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r7 >= 0) goto Lbb
            r8 = 1
        Lbb:
            if (r8 != 0) goto Lc2
            g2.q r1 = r12.f10118b0     // Catch: java.lang.Throwable -> Lea
        Lbf:
            g2.g r1 = (p105g2.C2213g) r1     // Catch: java.lang.Throwable -> Lea
            goto Le4
        Lc2:
            java.lang.String r4 = "cache-hit-refresh-needed"
            r0.m5801e(r4)     // Catch: java.lang.Throwable -> Lea
            r0.f10152k0 = r3     // Catch: java.lang.Throwable -> Lea
            r6.f10174d = r1     // Catch: java.lang.Throwable -> Lea
            g2.v r1 = r12.f10120d0     // Catch: java.lang.Throwable -> Lea
            boolean r1 = r1.m5825a(r0)     // Catch: java.lang.Throwable -> Lea
            if (r1 != 0) goto Le1
            g2.q r1 = r12.f10118b0     // Catch: java.lang.Throwable -> Lea
            g2.c r3 = new g2.c     // Catch: java.lang.Throwable -> Lea
            r3.<init>(r12, r0)     // Catch: java.lang.Throwable -> Lea
            g2.g r1 = (p105g2.C2213g) r1     // Catch: java.lang.Throwable -> Lea
            r1.m5799a(r0, r6, r3)     // Catch: java.lang.Throwable -> Lea
            goto L1d
        Le1:
            g2.q r1 = r12.f10118b0     // Catch: java.lang.Throwable -> Lea
            goto Lbf
        Le4:
            r1.m5799a(r0, r6, r9)     // Catch: java.lang.Throwable -> Lea
            goto L1d
        Le9:
            return
        Lea:
            r1 = move-exception
            r0.m5813w(r2)
            throw r1
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
            r3 = this;
            boolean r0 = p105g2.C2210d.f10114e0
            r1 = 0
            if (r0 == 0) goto Lc
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "start new dispatcher"
            p105g2.C2227u.m5822d(r2, r0)
        Lc:
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            g2.b r0 = r3.f10117a0
            h2.d r0 = (p119h2.C2442d) r0
            r0.m6205d()
        L18:
            r3.m5798a()     // Catch: java.lang.InterruptedException -> L1c
            goto L18
        L1c:
            boolean r0 = r3.f10119c0
            if (r0 == 0) goto L28
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            return
        L28:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it"
            p105g2.C2227u.m5821c(r2, r0)
            goto L18
    }
}
