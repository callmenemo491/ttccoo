package p266p2;

/* renamed from: p2.a */
/* loaded from: classes.dex */
public final class ExecutorServiceC5346a implements java.util.concurrent.ExecutorService {

    /* renamed from: Z */
    public static final long f21256Z = 0;

    /* renamed from: a0 */
    public static volatile int f21257a0;

    /* renamed from: Y */
    public final java.util.concurrent.ExecutorService f21258Y;

    /* renamed from: p2.a$a */
    public static final class a implements java.util.concurrent.ThreadFactory {

        /* renamed from: a */
        public final java.lang.String f21259a;

        /* renamed from: b */
        public final boolean f21260b;

        /* renamed from: c */
        public int f21261c;

        /* renamed from: p2.a$a$a, reason: collision with other inner class name */
        public class C7414a extends java.lang.Thread {

            /* renamed from: Y */
            public final /* synthetic */ p266p2.ExecutorServiceC5346a.a f21262Y;

            public C7414a(p266p2.ExecutorServiceC5346a.a r1, java.lang.Runnable r2, java.lang.String r3) {
                    r0 = this;
                    r0.f21262Y = r1
                    r0.<init>(r2, r3)
                    return
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                    r3 = this;
                    r0 = 9
                    android.os.Process.setThreadPriority(r0)
                    p2.a$a r0 = r3.f21262Y
                    boolean r0 = r0.f21260b
                    if (r0 == 0) goto L1f
                    android.os.StrictMode$ThreadPolicy$Builder r0 = new android.os.StrictMode$ThreadPolicy$Builder
                    r0.<init>()
                    android.os.StrictMode$ThreadPolicy$Builder r0 = r0.detectNetwork()
                    android.os.StrictMode$ThreadPolicy$Builder r0 = r0.penaltyDeath()
                    android.os.StrictMode$ThreadPolicy r0 = r0.build()
                    android.os.StrictMode.setThreadPolicy(r0)
                L1f:
                    super.run()     // Catch: java.lang.Throwable -> L23
                    goto L37
                L23:
                    r0 = move-exception
                    p2.a$a r1 = r3.f21262Y
                    java.util.Objects.requireNonNull(r1)
                    r1 = 6
                    java.lang.String r2 = "GlideExecutor"
                    boolean r1 = android.util.Log.isLoggable(r2, r1)
                    if (r1 == 0) goto L37
                    java.lang.String r1 = "Request threw uncaught throwable"
                    android.util.Log.e(r2, r1, r0)
                L37:
                    return
            }
        }

        public a(java.lang.String r1, p266p2.ExecutorServiceC5346a.b r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.f21259a = r1
                r0.f21260b = r3
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized java.lang.Thread newThread(java.lang.Runnable r4) {
                r3 = this;
                monitor-enter(r3)
                p2.a$a$a r0 = new p2.a$a$a     // Catch: java.lang.Throwable -> L2b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
                r1.<init>()     // Catch: java.lang.Throwable -> L2b
                java.lang.String r2 = "glide-"
                r1.append(r2)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r2 = r3.f21259a     // Catch: java.lang.Throwable -> L2b
                r1.append(r2)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r2 = "-thread-"
                r1.append(r2)     // Catch: java.lang.Throwable -> L2b
                int r2 = r3.f21261c     // Catch: java.lang.Throwable -> L2b
                r1.append(r2)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2b
                r0.<init>(r3, r4, r1)     // Catch: java.lang.Throwable -> L2b
                int r4 = r3.f21261c     // Catch: java.lang.Throwable -> L2b
                int r4 = r4 + 1
                r3.f21261c = r4     // Catch: java.lang.Throwable -> L2b
                monitor-exit(r3)
                return r0
            L2b:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
        }
    }

    /* renamed from: p2.a$b */
    public interface b {

        /* renamed from: a */
        public static final p266p2.ExecutorServiceC5346a.b f21263a = null;

        /* renamed from: p2.a$b$a */
        public class a implements p266p2.ExecutorServiceC5346a.b {
            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        static {
                p2.a$b$a r0 = new p2.a$b$a
                r0.<init>()
                p266p2.ExecutorServiceC5346a.b.f21263a = r0
                return
        }
    }

    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 10
            long r0 = r0.toMillis(r1)
            p266p2.ExecutorServiceC5346a.f21256Z = r0
            return
    }

    public ExecutorServiceC5346a(java.util.concurrent.ExecutorService r1) {
            r0 = this;
            r0.<init>()
            r0.f21258Y = r1
            return
    }

    /* renamed from: a */
    public static int m11653a() {
            int r0 = p266p2.ExecutorServiceC5346a.f21257a0
            if (r0 != 0) goto L13
            r0 = 4
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            int r1 = r1.availableProcessors()
            int r0 = java.lang.Math.min(r0, r1)
            p266p2.ExecutorServiceC5346a.f21257a0 = r0
        L13:
            int r0 = p266p2.ExecutorServiceC5346a.f21257a0
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.f21258Y
            boolean r2 = r0.awaitTermination(r2, r4)
            return r2
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.f21258Y
            r0.execute(r2)
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.f21258Y
            java.util.List r2 = r0.invokeAll(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2, long r3, java.util.concurrent.TimeUnit r5) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.f21258Y
            java.util.List r2 = r0.invokeAll(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.f21258Y
            java.lang.Object r2 = r0.invokeAny(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2, long r3, java.util.concurrent.TimeUnit r5) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.f21258Y
            java.lang.Object r2 = r0.invokeAny(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.f21258Y
            boolean r0 = r0.isShutdown()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.f21258Y
            boolean r0 = r0.isTerminated()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.f21258Y
            r0.shutdown()
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.List<java.lang.Runnable> shutdownNow() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.f21258Y
            java.util.List r0 = r0.shutdownNow()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.concurrent.Future<?> submit(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.f21258Y
            java.util.concurrent.Future r2 = r0.submit(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.concurrent.Future<T> submit(java.lang.Runnable r2, T r3) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.f21258Y
            java.util.concurrent.Future r2 = r0.submit(r2, r3)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.f21258Y
            java.util.concurrent.Future r2 = r0.submit(r2)
            return r2
    }

    public java.lang.String toString() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.f21258Y
            java.lang.String r0 = r0.toString()
            return r0
    }
}
