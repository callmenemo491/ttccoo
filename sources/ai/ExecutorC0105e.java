package ai;

/* renamed from: ai.e */
/* loaded from: classes.dex */
public final class ExecutorC0105e extends p379vh.AbstractC6740t0 implements ai.InterfaceC0110j, java.util.concurrent.Executor {

    /* renamed from: e0 */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f361e0 = null;

    /* renamed from: Z */
    public final ai.C0103c f362Z;

    /* renamed from: a0 */
    public final int f363a0;

    /* renamed from: b0 */
    public final java.lang.String f364b0;

    /* renamed from: c0 */
    public final int f365c0;

    /* renamed from: d0 */
    public final java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> f366d0;
    private volatile /* synthetic */ int inFlightTasks;

    static {
            java.lang.Class<ai.e> r0 = ai.ExecutorC0105e.class
            java.lang.String r1 = "inFlightTasks"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            ai.ExecutorC0105e.f361e0 = r0
            return
    }

    public ExecutorC0105e(ai.C0103c r1, int r2, java.lang.String r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f362Z = r1
            r0.f363a0 = r2
            r0.f364b0 = r3
            r0.f365c0 = r4
            java.util.concurrent.ConcurrentLinkedQueue r1 = new java.util.concurrent.ConcurrentLinkedQueue
            r1.<init>()
            r0.f366d0 = r1
            r1 = 0
            r0.inFlightTasks = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Close cannot be invoked on LimitingBlockingDispatcher"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r2) {
            r1 = this;
            r0 = 0
            r1.m159z0(r2, r0)
            return
    }

    @Override // ai.InterfaceC0110j
    /* renamed from: l */
    public void mo157l() {
            r4 = this;
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r0 = r4.f366d0
            java.lang.Object r0 = r0.poll()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1 = 1
            if (r0 == 0) goto L22
            ai.c r2 = r4.f362Z
            java.util.Objects.requireNonNull(r2)
            ai.a r3 = r2.f360d0     // Catch: java.util.concurrent.RejectedExecutionException -> L16
            r3.m145l(r0, r4, r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L16
            goto L21
        L16:
            vh.d0 r1 = p379vh.RunnableC6692d0.f25967e0
            ai.a r2 = r2.f360d0
            ai.i r0 = r2.m143h(r0, r4)
            r1.m13649G0(r0)
        L21:
            return
        L22:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = ai.ExecutorC0105e.f361e0
            r0.decrementAndGet(r4)
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r0 = r4.f366d0
            java.lang.Object r0 = r0.poll()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 != 0) goto L32
            return
        L32:
            r4.m159z0(r0, r1)
            return
    }

    @Override // ai.InterfaceC0110j
    /* renamed from: s0 */
    public int mo158s0() {
            r1 = this;
            int r0 = r1.f365c0
            return r0
    }

    @Override // p379vh.AbstractC6755z
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.f364b0
            if (r0 != 0) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "[dispatcher = "
            r0.append(r1)
            ai.c r1 = r2.f362Z
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L23:
            return r0
    }

    @Override // p379vh.AbstractC6755z
    /* renamed from: x0 */
    public void mo156x0(p101fh.InterfaceC2175g r1, java.lang.Runnable r2) {
            r0 = this;
            r1 = 0
            r0.m159z0(r2, r1)
            return
    }

    /* renamed from: z0 */
    public final void m159z0(java.lang.Runnable r4, boolean r5) {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = ai.ExecutorC0105e.f361e0
            int r1 = r0.incrementAndGet(r3)
            int r2 = r3.f363a0
            if (r1 > r2) goto L21
            ai.c r0 = r3.f362Z
            java.util.Objects.requireNonNull(r0)
            ai.a r1 = r0.f360d0     // Catch: java.util.concurrent.RejectedExecutionException -> L15
            r1.m145l(r4, r3, r5)     // Catch: java.util.concurrent.RejectedExecutionException -> L15
            goto L20
        L15:
            vh.d0 r5 = p379vh.RunnableC6692d0.f25967e0
            ai.a r0 = r0.f360d0
            ai.i r4 = r0.m143h(r4, r3)
            r5.m13649G0(r4)
        L20:
            return
        L21:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r1 = r3.f366d0
            r1.add(r4)
            int r4 = r0.decrementAndGet(r3)
            int r0 = r3.f363a0
            if (r4 < r0) goto L2f
            return
        L2f:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r4 = r3.f366d0
            java.lang.Object r4 = r4.poll()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            if (r4 != 0) goto L0
            return
    }
}
