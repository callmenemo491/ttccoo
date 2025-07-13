package p105g2;

/* renamed from: g2.v */
/* loaded from: classes.dex */
public class C2228v implements p105g2.AbstractC2220n.b {

    /* renamed from: a */
    public final java.util.Map<java.lang.String, java.util.List<p105g2.AbstractC2220n<?>>> f10184a;

    /* renamed from: b */
    public final p105g2.InterfaceC2223q f10185b;

    /* renamed from: c */
    public final p105g2.C2210d f10186c;

    /* renamed from: d */
    public final java.util.concurrent.BlockingQueue<p105g2.AbstractC2220n<?>> f10187d;

    public C2228v(p105g2.C2210d r2, java.util.concurrent.BlockingQueue<p105g2.AbstractC2220n<?>> r3, p105g2.InterfaceC2223q r4) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f10184a = r0
            r1.f10185b = r4
            r1.f10186c = r2
            r1.f10187d = r3
            return
    }

    /* renamed from: a */
    public synchronized boolean m5825a(p105g2.AbstractC2220n<?> r6) {
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = r6.m5805o()     // Catch: java.lang.Throwable -> L58
            java.util.Map<java.lang.String, java.util.List<g2.n<?>>> r1 = r5.f10184a     // Catch: java.lang.Throwable -> L58
            boolean r1 = r1.containsKey(r0)     // Catch: java.lang.Throwable -> L58
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3a
            java.util.Map<java.lang.String, java.util.List<g2.n<?>>> r1 = r5.f10184a     // Catch: java.lang.Throwable -> L58
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L58
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L58
            if (r1 != 0) goto L1e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L58
            r1.<init>()     // Catch: java.lang.Throwable -> L58
        L1e:
            java.lang.String r4 = "waiting-for-response"
            r6.m5801e(r4)     // Catch: java.lang.Throwable -> L58
            r1.add(r6)     // Catch: java.lang.Throwable -> L58
            java.util.Map<java.lang.String, java.util.List<g2.n<?>>> r6 = r5.f10184a     // Catch: java.lang.Throwable -> L58
            r6.put(r0, r1)     // Catch: java.lang.Throwable -> L58
            boolean r6 = p105g2.C2227u.f10176a     // Catch: java.lang.Throwable -> L58
            if (r6 == 0) goto L38
            java.lang.String r6 = "Request for cacheKey=%s is in flight, putting on hold."
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L58
            r1[r3] = r0     // Catch: java.lang.Throwable -> L58
            p105g2.C2227u.m5820b(r6, r1)     // Catch: java.lang.Throwable -> L58
        L38:
            monitor-exit(r5)
            return r2
        L3a:
            java.util.Map<java.lang.String, java.util.List<g2.n<?>>> r1 = r5.f10184a     // Catch: java.lang.Throwable -> L58
            r4 = 0
            r1.put(r0, r4)     // Catch: java.lang.Throwable -> L58
            java.lang.Object r1 = r6.f10144c0     // Catch: java.lang.Throwable -> L58
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L58
            r6.f10154m0 = r5     // Catch: java.lang.Throwable -> L55
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L55
            boolean r6 = p105g2.C2227u.f10176a     // Catch: java.lang.Throwable -> L58
            if (r6 == 0) goto L53
            java.lang.String r6 = "new request, sending to network %s"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L58
            r1[r3] = r0     // Catch: java.lang.Throwable -> L58
            p105g2.C2227u.m5820b(r6, r1)     // Catch: java.lang.Throwable -> L58
        L53:
            monitor-exit(r5)
            return r3
        L55:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L55
            throw r6     // Catch: java.lang.Throwable -> L58
        L58:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    /* renamed from: b */
    public synchronized void m5826b(p105g2.AbstractC2220n<?> r7) {
            r6 = this;
            monitor-enter(r6)
            java.lang.String r7 = r7.m5805o()     // Catch: java.lang.Throwable -> L6e
            java.util.Map<java.lang.String, java.util.List<g2.n<?>>> r0 = r6.f10184a     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = r0.remove(r7)     // Catch: java.lang.Throwable -> L6e
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L6c
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6e
            if (r1 != 0) goto L6c
            boolean r1 = p105g2.C2227u.f10176a     // Catch: java.lang.Throwable -> L6e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2f
            java.lang.String r1 = "%d waiting requests for cacheKey=%s; resend to network"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L6e
            int r5 = r0.size()     // Catch: java.lang.Throwable -> L6e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L6e
            r4[r3] = r5     // Catch: java.lang.Throwable -> L6e
            r4[r2] = r7     // Catch: java.lang.Throwable -> L6e
            p105g2.C2227u.m5822d(r1, r4)     // Catch: java.lang.Throwable -> L6e
        L2f:
            java.lang.Object r1 = r0.remove(r3)     // Catch: java.lang.Throwable -> L6e
            g2.n r1 = (p105g2.AbstractC2220n) r1     // Catch: java.lang.Throwable -> L6e
            java.util.Map<java.lang.String, java.util.List<g2.n<?>>> r4 = r6.f10184a     // Catch: java.lang.Throwable -> L6e
            r4.put(r7, r0)     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r7 = r1.f10144c0     // Catch: java.lang.Throwable -> L6e
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L6e
            r1.f10154m0 = r6     // Catch: java.lang.Throwable -> L69
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L69
            g2.d r7 = r6.f10186c     // Catch: java.lang.Throwable -> L6e
            if (r7 == 0) goto L6c
            java.util.concurrent.BlockingQueue<g2.n<?>> r7 = r6.f10187d     // Catch: java.lang.Throwable -> L6e
            if (r7 == 0) goto L6c
            r7.put(r1)     // Catch: java.lang.InterruptedException -> L4c java.lang.Throwable -> L6e
            goto L6c
        L4c:
            r7 = move-exception
            java.lang.String r0 = "Couldn't add request to queue. %s"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L6e
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L6e
            r1[r3] = r7     // Catch: java.lang.Throwable -> L6e
            p105g2.C2227u.m5821c(r0, r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L6e
            r7.interrupt()     // Catch: java.lang.Throwable -> L6e
            g2.d r7 = r6.f10186c     // Catch: java.lang.Throwable -> L6e
            r7.f10119c0 = r2     // Catch: java.lang.Throwable -> L6e
            r7.interrupt()     // Catch: java.lang.Throwable -> L6e
            goto L6c
        L69:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L69
            throw r0     // Catch: java.lang.Throwable -> L6e
        L6c:
            monitor-exit(r6)
            return
        L6e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }
}
