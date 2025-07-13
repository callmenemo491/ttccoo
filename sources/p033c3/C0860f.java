package p033c3;

/* renamed from: c3.f */
/* loaded from: classes.dex */
public class C0860f<R> implements p033c3.InterfaceFutureC0857c<R>, p033c3.InterfaceC0861g<R> {

    /* renamed from: g0 */
    public static final p033c3.C0860f.a f4653g0 = null;

    /* renamed from: Y */
    public final int f4654Y;

    /* renamed from: Z */
    public final int f4655Z;

    /* renamed from: a0 */
    public R f4656a0;

    /* renamed from: b0 */
    public p033c3.InterfaceC0858d f4657b0;

    /* renamed from: c0 */
    public boolean f4658c0;

    /* renamed from: d0 */
    public boolean f4659d0;

    /* renamed from: e0 */
    public boolean f4660e0;

    /* renamed from: f0 */
    public p214m2.C4341s f4661f0;

    /* renamed from: c3.f$a */
    public static class a {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            c3.f$a r0 = new c3.f$a
            r0.<init>()
            p033c3.C0860f.f4653g0 = r0
            return
    }

    public C0860f(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f4654Y = r1
            r0.f4655Z = r2
            return
    }

    @Override // p033c3.InterfaceC0861g
    /* renamed from: a */
    public synchronized boolean mo2564a(p214m2.C4341s r1, java.lang.Object r2, p049d3.InterfaceC1275g<R> r3, boolean r4) {
            r0 = this;
            monitor-enter(r0)
            r2 = 1
            r0.f4660e0 = r2     // Catch: java.lang.Throwable -> Lc
            r0.f4661f0 = r1     // Catch: java.lang.Throwable -> Lc
            r0.notifyAll()     // Catch: java.lang.Throwable -> Lc
            r1 = 0
            monitor-exit(r0)
            return r1
        Lc:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // p049d3.InterfaceC1275g
    /* renamed from: b */
    public synchronized void mo2565b(R r1, p068e3.InterfaceC1513b<? super R> r2) {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }

    @Override // p049d3.InterfaceC1275g
    /* renamed from: c */
    public synchronized void mo2566c(android.graphics.drawable.Drawable r1) {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isDone()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto La
            r3 = 0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1f
            return r3
        La:
            r0 = 1
            r2.f4658c0 = r0     // Catch: java.lang.Throwable -> L1f
            r2.notifyAll()     // Catch: java.lang.Throwable -> L1f
            r1 = 0
            if (r3 == 0) goto L18
            c3.d r3 = r2.f4657b0     // Catch: java.lang.Throwable -> L1f
            r2.f4657b0 = r1     // Catch: java.lang.Throwable -> L1f
            r1 = r3
        L18:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L1e
            r1.clear()
        L1e:
            return r0
        L1f:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1f
            throw r3
    }

    @Override // p445z2.InterfaceC7235i
    /* renamed from: d */
    public void mo2567d() {
            r0 = this;
            return
    }

    @Override // p049d3.InterfaceC1275g
    /* renamed from: e */
    public void mo2568e(p049d3.InterfaceC1274f r3) {
            r2 = this;
            int r0 = r2.f4654Y
            int r1 = r2.f4655Z
            c3.j r3 = (p033c3.C0864j) r3
            r3.mo2579b(r0, r1)
            return
    }

    @Override // p049d3.InterfaceC1275g
    /* renamed from: f */
    public void mo2569f(android.graphics.drawable.Drawable r1) {
            r0 = this;
            return
    }

    @Override // p049d3.InterfaceC1275g
    /* renamed from: g */
    public synchronized void mo2570g(p033c3.InterfaceC0858d r1) {
            r0 = this;
            monitor-enter(r0)
            r0.f4657b0 = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // java.util.concurrent.Future
    public R get() {
            r2 = this;
            r0 = 0
            java.lang.Object r0 = r2.m2577n(r0)     // Catch: java.util.concurrent.TimeoutException -> L6
            return r0
        L6:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.concurrent.Future
    public R get(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            long r1 = r3.toMillis(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r0.m2577n(r1)
            return r1
    }

    @Override // p033c3.InterfaceC0861g
    /* renamed from: h */
    public synchronized boolean mo2571h(R r1, java.lang.Object r2, p049d3.InterfaceC1275g<R> r3, com.bumptech.glide.load.EnumC1008a r4, boolean r5) {
            r0 = this;
            monitor-enter(r0)
            r2 = 1
            r0.f4659d0 = r2     // Catch: java.lang.Throwable -> Lc
            r0.f4656a0 = r1     // Catch: java.lang.Throwable -> Lc
            r0.notifyAll()     // Catch: java.lang.Throwable -> Lc
            r1 = 0
            monitor-exit(r0)
            return r1
        Lc:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // p049d3.InterfaceC1275g
    /* renamed from: i */
    public void mo2572i(p049d3.InterfaceC1274f r1) {
            r0 = this;
            return
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f4658c0     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f4658c0     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L10
            boolean r0 = r1.f4659d0     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L10
            boolean r0 = r1.f4660e0     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto Le
            goto L10
        Le:
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            monitor-exit(r1)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // p049d3.InterfaceC1275g
    /* renamed from: j */
    public synchronized p033c3.InterfaceC0858d mo2573j() {
            r1 = this;
            monitor-enter(r1)
            c3.d r0 = r1.f4657b0     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // p049d3.InterfaceC1275g
    /* renamed from: k */
    public void mo2574k(android.graphics.drawable.Drawable r1) {
            r0 = this;
            return
    }

    @Override // p445z2.InterfaceC7235i
    /* renamed from: l */
    public void mo2575l() {
            r0 = this;
            return
    }

    @Override // p445z2.InterfaceC7235i
    /* renamed from: m */
    public void mo2576m() {
            r0 = this;
            return
    }

    /* renamed from: n */
    public final synchronized R m2577n(java.lang.Long r6) {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.isDone()     // Catch: java.lang.Throwable -> L91
            if (r0 != 0) goto L16
            boolean r0 = p106g3.C2238j.m5848h()     // Catch: java.lang.Throwable -> L91
            if (r0 == 0) goto Le
            goto L16
        Le:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L91
            java.lang.String r0 = "You must call this method on a background thread"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L91
            throw r6     // Catch: java.lang.Throwable -> L91
        L16:
            boolean r0 = r5.f4658c0     // Catch: java.lang.Throwable -> L91
            if (r0 != 0) goto L8b
            boolean r0 = r5.f4660e0     // Catch: java.lang.Throwable -> L91
            if (r0 != 0) goto L83
            boolean r0 = r5.f4659d0     // Catch: java.lang.Throwable -> L91
            if (r0 == 0) goto L26
            R r6 = r5.f4656a0     // Catch: java.lang.Throwable -> L91
            monitor-exit(r5)
            return r6
        L26:
            r0 = 0
            if (r6 != 0) goto L2e
            r5.wait(r0)     // Catch: java.lang.Throwable -> L91
            goto L53
        L2e:
            long r2 = r6.longValue()     // Catch: java.lang.Throwable -> L91
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L53
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L91
            long r2 = r6.longValue()     // Catch: java.lang.Throwable -> L91
            long r2 = r2 + r0
        L3f:
            boolean r6 = r5.isDone()     // Catch: java.lang.Throwable -> L91
            if (r6 != 0) goto L53
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L53
            long r0 = r2 - r0
            r5.wait(r0)     // Catch: java.lang.Throwable -> L91
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L91
            goto L3f
        L53:
            boolean r6 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L91
            if (r6 != 0) goto L7d
            boolean r6 = r5.f4660e0     // Catch: java.lang.Throwable -> L91
            if (r6 != 0) goto L75
            boolean r6 = r5.f4658c0     // Catch: java.lang.Throwable -> L91
            if (r6 != 0) goto L6f
            boolean r6 = r5.f4659d0     // Catch: java.lang.Throwable -> L91
            if (r6 == 0) goto L69
            R r6 = r5.f4656a0     // Catch: java.lang.Throwable -> L91
            monitor-exit(r5)
            return r6
        L69:
            java.util.concurrent.TimeoutException r6 = new java.util.concurrent.TimeoutException     // Catch: java.lang.Throwable -> L91
            r6.<init>()     // Catch: java.lang.Throwable -> L91
            throw r6     // Catch: java.lang.Throwable -> L91
        L6f:
            java.util.concurrent.CancellationException r6 = new java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L91
            r6.<init>()     // Catch: java.lang.Throwable -> L91
            throw r6     // Catch: java.lang.Throwable -> L91
        L75:
            java.util.concurrent.ExecutionException r6 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L91
            m2.s r0 = r5.f4661f0     // Catch: java.lang.Throwable -> L91
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L91
            throw r6     // Catch: java.lang.Throwable -> L91
        L7d:
            java.lang.InterruptedException r6 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> L91
            r6.<init>()     // Catch: java.lang.Throwable -> L91
            throw r6     // Catch: java.lang.Throwable -> L91
        L83:
            java.util.concurrent.ExecutionException r6 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L91
            m2.s r0 = r5.f4661f0     // Catch: java.lang.Throwable -> L91
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L91
            throw r6     // Catch: java.lang.Throwable -> L91
        L8b:
            java.util.concurrent.CancellationException r6 = new java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L91
            r6.<init>()     // Catch: java.lang.Throwable -> L91
            throw r6     // Catch: java.lang.Throwable -> L91
        L91:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }
}
