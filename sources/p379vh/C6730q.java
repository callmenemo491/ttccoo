package p379vh;

/* renamed from: vh.q */
/* loaded from: classes.dex */
public final class C6730q extends p379vh.AbstractC6740t0 {

    /* renamed from: Z */
    public static final p379vh.C6730q f26024Z = null;

    /* renamed from: a0 */
    public static final int f26025a0 = 0;
    private static volatile java.util.concurrent.Executor pool;

    static {
            vh.q r0 = new vh.q
            r0.<init>()
            p379vh.C6730q.f26024Z = r0
            java.lang.String r0 = "kotlinx.coroutines.default.parallelism"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 != 0) goto L13
            r0 = -1
            goto L24
        L13:
            java.lang.Integer r1 = p362uh.C6462h.m13049F(r0)
            if (r1 == 0) goto L27
            int r2 = r1.intValue()
            r3 = 1
            if (r2 < r3) goto L27
            int r0 = r1.intValue()
        L24:
            p379vh.C6730q.f26025a0 = r0
            return
        L27:
            java.lang.String r1 = "Expected positive number in kotlinx.coroutines.default.parallelism, but has "
            java.lang.String r0 = p214m2.C4339q.m9711u(r1, r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public C6730q() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: A0 */
    public final java.util.concurrent.ExecutorService m13659A0() {
            r7 = this;
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 == 0) goto Lb
            java.util.concurrent.ExecutorService r0 = r7.m13661z0()
            return r0
        Lb:
            r0 = 0
            java.lang.String r1 = "java.util.concurrent.ForkJoinPool"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L13
            goto L14
        L13:
            r1 = r0
        L14:
            if (r1 != 0) goto L1b
            java.util.concurrent.ExecutorService r0 = r7.m13661z0()
            return r0
        L1b:
            int r2 = p379vh.C6730q.f26025a0
            r3 = 1
            r4 = 0
            if (r2 >= 0) goto L6e
            java.lang.String r2 = "commonPool"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L36
            java.lang.reflect.Method r2 = r1.getMethod(r2, r5)     // Catch: java.lang.Throwable -> L36
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r2.invoke(r0, r5)     // Catch: java.lang.Throwable -> L36
            boolean r5 = r2 instanceof java.util.concurrent.ExecutorService     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L36
            java.util.concurrent.ExecutorService r2 = (java.util.concurrent.ExecutorService) r2     // Catch: java.lang.Throwable -> L36
            goto L37
        L36:
            r2 = r0
        L37:
            if (r2 != 0) goto L3a
            goto L6e
        L3a:
            vh.q r5 = p379vh.C6730q.f26024Z
            java.util.Objects.requireNonNull(r5)
            vh.p r5 = p379vh.RunnableC6727p.f26015Y
            r2.submit(r5)
            java.lang.String r5 = "getPoolSize"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L59
            java.lang.reflect.Method r5 = r1.getMethod(r5, r6)     // Catch: java.lang.Throwable -> L59
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L59
            java.lang.Object r5 = r5.invoke(r2, r6)     // Catch: java.lang.Throwable -> L59
            boolean r6 = r5 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L59
            if (r6 == 0) goto L59
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L59
            goto L5a
        L59:
            r5 = r0
        L5a:
            if (r5 != 0) goto L5d
            goto L65
        L5d:
            int r5 = r5.intValue()
            if (r5 < r3) goto L65
            r5 = 1
            goto L66
        L65:
            r5 = 0
        L66:
            if (r5 == 0) goto L69
            goto L6a
        L69:
            r2 = r0
        L6a:
            if (r2 != 0) goto L6d
            goto L6e
        L6d:
            return r2
        L6e:
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L92
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L92
            r2[r4] = r5     // Catch: java.lang.Throwable -> L92
            java.lang.reflect.Constructor r1 = r1.getConstructor(r2)     // Catch: java.lang.Throwable -> L92
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L92
            vh.q r3 = p379vh.C6730q.f26024Z     // Catch: java.lang.Throwable -> L92
            int r3 = r3.m13660B0()     // Catch: java.lang.Throwable -> L92
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L92
            r2[r4] = r3     // Catch: java.lang.Throwable -> L92
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Throwable -> L92
            boolean r2 = r1 instanceof java.util.concurrent.ExecutorService     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto L93
            java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1     // Catch: java.lang.Throwable -> L92
            r0 = r1
            goto L93
        L92:
        L93:
            if (r0 != 0) goto L99
            java.util.concurrent.ExecutorService r0 = r7.m13661z0()
        L99:
            return r0
    }

    /* renamed from: B0 */
    public final int m13660B0() {
            r3 = this;
            int r0 = p379vh.C6730q.f26025a0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r0.intValue()
            r2 = 1
            if (r1 <= 0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            if (r1 == 0) goto L13
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 != 0) goto L24
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            int r0 = r0 - r2
            if (r0 >= r2) goto L22
            goto L28
        L22:
            r2 = r0
            goto L28
        L24:
            int r2 = r0.intValue()
        L28:
            return r2
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Close cannot be invoked on CommonPool"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // p379vh.AbstractC6755z
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "CommonPool"
            return r0
    }

    @Override // p379vh.AbstractC6755z
    /* renamed from: x0 */
    public void mo156x0(p101fh.InterfaceC2175g r1, java.lang.Runnable r2) {
            r0 = this;
            java.util.concurrent.Executor r1 = p379vh.C6730q.pool     // Catch: java.util.concurrent.RejectedExecutionException -> L18
            if (r1 != 0) goto L14
            monitor-enter(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L18
            java.util.concurrent.Executor r1 = p379vh.C6730q.pool     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto Lf
            java.util.concurrent.ExecutorService r1 = r0.m13659A0()     // Catch: java.lang.Throwable -> L11
            p379vh.C6730q.pool = r1     // Catch: java.lang.Throwable -> L11
        Lf:
            monitor-exit(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L18
            goto L14
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L18
            throw r1     // Catch: java.util.concurrent.RejectedExecutionException -> L18
        L14:
            r1.execute(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L18
            goto L1d
        L18:
            vh.d0 r1 = p379vh.RunnableC6692d0.f25967e0
            r1.m13649G0(r2)
        L1d:
            return
    }

    /* renamed from: z0 */
    public final java.util.concurrent.ExecutorService m13661z0() {
            r3 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            int r1 = r3.m13660B0()
            v5.a0 r2 = new v5.a0
            r2.<init>(r0)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r1, r2)
            return r0
    }
}
