package p379vh;

/* renamed from: vh.u0 */
/* loaded from: classes.dex */
public final class C6743u0 extends p379vh.AbstractC6740t0 implements p379vh.InterfaceC6704h0 {

    /* renamed from: Z */
    public final java.util.concurrent.Executor f26041Z;

    public C6743u0(java.util.concurrent.Executor r5) {
            r4 = this;
            r4.<init>()
            r4.f26041Z = r5
            java.lang.reflect.Method r0 = p459zh.C7337c.f28082a
            r0 = 0
            boolean r1 = r5 instanceof java.util.concurrent.ScheduledThreadPoolExecutor     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto Lf
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = (java.util.concurrent.ScheduledThreadPoolExecutor) r5     // Catch: java.lang.Throwable -> L22
            goto L10
        Lf:
            r5 = 0
        L10:
            if (r5 != 0) goto L13
            goto L22
        L13:
            java.lang.reflect.Method r1 = p459zh.C7337c.f28082a     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L18
            goto L22
        L18:
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L22
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L22
            r2[r0] = r3     // Catch: java.lang.Throwable -> L22
            r1.invoke(r5, r2)     // Catch: java.lang.Throwable -> L22
        L22:
            return
    }

    @Override // p379vh.InterfaceC6704h0
    /* renamed from: b0 */
    public void mo13615b0(long r6, p379vh.InterfaceC6703h<? super ch.C0985l> r8) {
            r5 = this;
            java.util.concurrent.Executor r0 = r5.f26041Z
            boolean r1 = r0 instanceof java.util.concurrent.ScheduledExecutorService
            r2 = 0
            if (r1 == 0) goto La
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 != 0) goto Le
            goto L2d
        Le:
            h6.a0 r1 = new h6.a0
            r1.<init>(r5, r8)
            r3 = r8
            vh.i r3 = (p379vh.C6706i) r3
            fh.g r3 = r3.f25998c0
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.RejectedExecutionException -> L1f
            java.util.concurrent.ScheduledFuture r2 = r0.schedule(r1, r6, r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L1f
            goto L2d
        L1f:
            r0 = move-exception
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            java.lang.String r4 = "The task was rejected"
            r1.<init>(r4)
            r1.initCause(r0)
            p209lh.C4304a.m9611e(r3, r1)
        L2d:
            if (r2 == 0) goto L3a
            vh.e r6 = new vh.e
            r6.<init>(r2)
            vh.i r8 = (p379vh.C6706i) r8
            r8.mo13609d(r6)
            return
        L3a:
            vh.d0 r0 = p379vh.RunnableC6692d0.f25967e0
            r0.mo13615b0(r6, r8)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.f26041Z
            boolean r1 = r0 instanceof java.util.concurrent.ExecutorService
            if (r1 == 0) goto L9
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            goto La
        L9:
            r0 = 0
        La:
            if (r0 != 0) goto Ld
            goto L10
        Ld:
            r0.shutdown()
        L10:
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p379vh.C6743u0
            if (r0 == 0) goto Le
            vh.u0 r2 = (p379vh.C6743u0) r2
            java.util.concurrent.Executor r2 = r2.f26041Z
            java.util.concurrent.Executor r0 = r1.f26041Z
            if (r2 != r0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.f26041Z
            int r0 = java.lang.System.identityHashCode(r0)
            return r0
    }

    @Override // p379vh.AbstractC6755z
    public java.lang.String toString() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.f26041Z
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // p379vh.AbstractC6755z
    /* renamed from: x0 */
    public void mo156x0(p101fh.InterfaceC2175g r4, java.lang.Runnable r5) {
            r3 = this;
            java.util.concurrent.Executor r0 = r3.f26041Z     // Catch: java.util.concurrent.RejectedExecutionException -> L6
            r0.execute(r5)     // Catch: java.util.concurrent.RejectedExecutionException -> L6
            goto L1c
        L6:
            r0 = move-exception
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            java.lang.String r2 = "The task was rejected"
            r1.<init>(r2)
            r1.initCause(r0)
            p209lh.C4304a.m9611e(r4, r1)
            vh.z r4 = p379vh.C6716l0.f26008b
            ai.e r4 = (ai.ExecutorC0105e) r4
            r0 = 0
            r4.m159z0(r5, r0)
        L1c:
            return
    }
}
