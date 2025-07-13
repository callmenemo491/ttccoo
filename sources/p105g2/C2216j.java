package p105g2;

/* renamed from: g2.j */
/* loaded from: classes.dex */
public class C2216j extends java.lang.Thread {

    /* renamed from: Y */
    public final java.util.concurrent.BlockingQueue<p105g2.AbstractC2220n<?>> f10130Y;

    /* renamed from: Z */
    public final p105g2.InterfaceC2215i f10131Z;

    /* renamed from: a0 */
    public final p105g2.InterfaceC2208b f10132a0;

    /* renamed from: b0 */
    public final p105g2.InterfaceC2223q f10133b0;

    /* renamed from: c0 */
    public volatile boolean f10134c0;

    public C2216j(java.util.concurrent.BlockingQueue<p105g2.AbstractC2220n<?>> r2, p105g2.InterfaceC2215i r3, p105g2.InterfaceC2208b r4, p105g2.InterfaceC2223q r5) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f10134c0 = r0
            r1.f10130Y = r2
            r1.f10131Z = r3
            r1.f10132a0 = r4
            r1.f10133b0 = r5
            return
    }

    /* renamed from: a */
    public final void m5800a() {
            r9 = this;
            java.util.concurrent.BlockingQueue<g2.n<?>> r0 = r9.f10130Y
            java.lang.Object r0 = r0.take()
            g2.n r0 = (p105g2.AbstractC2220n) r0
            java.lang.String r1 = "post-error"
            android.os.SystemClock.elapsedRealtime()
            r2 = 3
            r0.m5813w(r2)
            r2 = 0
            r3 = 4
            java.lang.String r4 = "network-queue-take"
            r0.m5801e(r4)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
            boolean r4 = r0.m5808r()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
            if (r4 == 0) goto L2b
            java.lang.String r4 = "network-discard-cancelled"
            r0.m5804k(r4)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
        L23:
            r0.m5810t()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
        L26:
            r0.m5813w(r3)
            goto Lda
        L2b:
            int r4 = r0.f10143b0     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
            android.net.TrafficStats.setThreadStatsTag(r4)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
            g2.i r4 = r9.f10131Z     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
            h2.b r4 = (p119h2.C2440b) r4     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
            g2.l r4 = r4.m6191a(r0)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
            java.lang.String r5 = "network-http-complete"
            r0.m5801e(r5)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
            boolean r5 = r4.f10139e     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
            if (r5 == 0) goto L4d
            boolean r5 = r0.m5807q()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
            if (r5 == 0) goto L4d
            java.lang.String r4 = "not-modified"
            r0.m5804k(r4)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
            goto L23
        L4d:
            g2.p r4 = r0.mo5812v(r4)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
            java.lang.String r5 = "network-parse-complete"
            r0.m5801e(r5)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
            boolean r5 = r0.f10148g0     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
            if (r5 == 0) goto L70
            g2.b$a r5 = r4.f10172b     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
            if (r5 == 0) goto L70
            g2.b r5 = r9.f10132a0     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
            java.lang.String r6 = r0.m5805o()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
            g2.b$a r7 = r4.f10172b     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
            h2.d r5 = (p119h2.C2442d) r5     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
            r5.m6207f(r6, r7)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
            java.lang.String r5 = "network-cache-written"
            r0.m5801e(r5)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
        L70:
            r0.m5809s()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
            g2.q r5 = r9.f10133b0     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
            g2.g r5 = (p105g2.C2213g) r5     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
            r5.m5799a(r0, r4, r2)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
            r0.m5811u(r4)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 p105g2.C2226t -> Lb8
            goto L26
        L7e:
            r1 = move-exception
            goto Ldb
        L80:
            r4 = move-exception
            java.lang.String r5 = "Unhandled exception %s"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L7e
            r7 = 0
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L7e
            r6[r7] = r8     // Catch: java.lang.Throwable -> L7e
            java.lang.String r5 = p105g2.C2227u.m5819a(r5, r6)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r6 = "Volley"
            android.util.Log.e(r6, r5, r4)     // Catch: java.lang.Throwable -> L7e
            g2.t r5 = new g2.t     // Catch: java.lang.Throwable -> L7e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L7e
            android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L7e
            g2.q r4 = r9.f10133b0     // Catch: java.lang.Throwable -> L7e
            g2.g r4 = (p105g2.C2213g) r4     // Catch: java.lang.Throwable -> L7e
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Throwable -> L7e
            r0.m5801e(r1)     // Catch: java.lang.Throwable -> L7e
            g2.p r1 = new g2.p     // Catch: java.lang.Throwable -> L7e
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L7e
            java.util.concurrent.Executor r4 = r4.f10123a     // Catch: java.lang.Throwable -> L7e
            g2.g$b r5 = new g2.g$b     // Catch: java.lang.Throwable -> L7e
            r5.<init>(r0, r1, r2)     // Catch: java.lang.Throwable -> L7e
            r4.execute(r5)     // Catch: java.lang.Throwable -> L7e
            goto Ld5
        Lb8:
            r4 = move-exception
            android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L7e
            g2.q r5 = r9.f10133b0     // Catch: java.lang.Throwable -> L7e
            g2.g r5 = (p105g2.C2213g) r5     // Catch: java.lang.Throwable -> L7e
            java.util.Objects.requireNonNull(r5)     // Catch: java.lang.Throwable -> L7e
            r0.m5801e(r1)     // Catch: java.lang.Throwable -> L7e
            g2.p r1 = new g2.p     // Catch: java.lang.Throwable -> L7e
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L7e
            java.util.concurrent.Executor r4 = r5.f10123a     // Catch: java.lang.Throwable -> L7e
            g2.g$b r5 = new g2.g$b     // Catch: java.lang.Throwable -> L7e
            r5.<init>(r0, r1, r2)     // Catch: java.lang.Throwable -> L7e
            r4.execute(r5)     // Catch: java.lang.Throwable -> L7e
        Ld5:
            r0.m5810t()     // Catch: java.lang.Throwable -> L7e
            goto L26
        Lda:
            return
        Ldb:
            r0.m5813w(r3)
            throw r1
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
            r2 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
        L5:
            r2.m5800a()     // Catch: java.lang.InterruptedException -> L9
            goto L5
        L9:
            boolean r0 = r2.f10134c0
            if (r0 == 0) goto L15
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            return
        L15:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it"
            p105g2.C2227u.m5821c(r1, r0)
            goto L5
    }
}
