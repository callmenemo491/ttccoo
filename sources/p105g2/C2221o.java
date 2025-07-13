package p105g2;

/* renamed from: g2.o */
/* loaded from: classes.dex */
public class C2221o {

    /* renamed from: a */
    public final java.util.concurrent.atomic.AtomicInteger f10160a;

    /* renamed from: b */
    public final java.util.Set<p105g2.AbstractC2220n<?>> f10161b;

    /* renamed from: c */
    public final java.util.concurrent.PriorityBlockingQueue<p105g2.AbstractC2220n<?>> f10162c;

    /* renamed from: d */
    public final java.util.concurrent.PriorityBlockingQueue<p105g2.AbstractC2220n<?>> f10163d;

    /* renamed from: e */
    public final p105g2.InterfaceC2208b f10164e;

    /* renamed from: f */
    public final p105g2.InterfaceC2215i f10165f;

    /* renamed from: g */
    public final p105g2.InterfaceC2223q f10166g;

    /* renamed from: h */
    public final p105g2.C2216j[] f10167h;

    /* renamed from: i */
    public p105g2.C2210d f10168i;

    /* renamed from: j */
    public final java.util.List<p105g2.C2221o.b> f10169j;

    /* renamed from: k */
    public final java.util.List<p105g2.C2221o.a> f10170k;

    /* renamed from: g2.o$a */
    public interface a {
        /* renamed from: a */
        void m5817a(p105g2.AbstractC2220n<?> r1, int r2);
    }

    @java.lang.Deprecated
    /* renamed from: g2.o$b */
    public interface b<T> {
        /* renamed from: a */
        void m5818a(p105g2.AbstractC2220n<T> r1);
    }

    public C2221o(p105g2.InterfaceC2208b r4, p105g2.InterfaceC2215i r5) {
            r3 = this;
            g2.g r0 = new g2.g
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r0.<init>(r1)
            r3.<init>()
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>()
            r3.f10160a = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r3.f10161b = r1
            java.util.concurrent.PriorityBlockingQueue r1 = new java.util.concurrent.PriorityBlockingQueue
            r1.<init>()
            r3.f10162c = r1
            java.util.concurrent.PriorityBlockingQueue r1 = new java.util.concurrent.PriorityBlockingQueue
            r1.<init>()
            r3.f10163d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.f10169j = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.f10170k = r1
            r3.f10164e = r4
            r3.f10165f = r5
            r4 = 4
            g2.j[] r4 = new p105g2.C2216j[r4]
            r3.f10167h = r4
            r3.f10166g = r0
            return
    }

    /* renamed from: a */
    public <T> p105g2.AbstractC2220n<T> m5814a(p105g2.AbstractC2220n<T> r3) {
            r2 = this;
            r3.f10147f0 = r2
            java.util.Set<g2.n<?>> r0 = r2.f10161b
            monitor-enter(r0)
            java.util.Set<g2.n<?>> r1 = r2.f10161b     // Catch: java.lang.Throwable -> L30
            r1.add(r3)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            java.util.concurrent.atomic.AtomicInteger r0 = r2.f10160a
            int r0 = r0.incrementAndGet()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.f10146e0 = r0
            java.lang.String r0 = "add-to-queue"
            r3.m5801e(r0)
            r0 = 0
            r2.m5816c(r3, r0)
            boolean r0 = r3.f10148g0
            if (r0 != 0) goto L2a
            java.util.concurrent.PriorityBlockingQueue<g2.n<?>> r0 = r2.f10163d
            r0.add(r3)
            goto L2f
        L2a:
            java.util.concurrent.PriorityBlockingQueue<g2.n<?>> r0 = r2.f10162c
            r0.add(r3)
        L2f:
            return r3
        L30:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r3
    }

    /* renamed from: b */
    public void m5815b(java.lang.Object r5) {
            r4 = this;
            java.util.Set<g2.n<?>> r0 = r4.f10161b
            monitor-enter(r0)
            java.util.Set<g2.n<?>> r1 = r4.f10161b     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L24
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L22
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L24
            g2.n r2 = (p105g2.AbstractC2220n) r2     // Catch: java.lang.Throwable -> L24
            java.lang.Object r3 = r2.f10153l0     // Catch: java.lang.Throwable -> L24
            if (r3 != r5) goto L1b
            r3 = 1
            goto L1c
        L1b:
            r3 = 0
        L1c:
            if (r3 == 0) goto L9
            r2.mo5802g()     // Catch: java.lang.Throwable -> L24
            goto L9
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r5
    }

    /* renamed from: c */
    public void m5816c(p105g2.AbstractC2220n<?> r4, int r5) {
            r3 = this;
            java.util.List<g2.o$a> r0 = r3.f10170k
            monitor-enter(r0)
            java.util.List<g2.o$a> r1 = r3.f10170k     // Catch: java.lang.Throwable -> L1b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L19
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1b
            g2.o$a r2 = (p105g2.C2221o.a) r2     // Catch: java.lang.Throwable -> L1b
            r2.m5817a(r4, r5)     // Catch: java.lang.Throwable -> L1b
            goto L9
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r4
    }
}
