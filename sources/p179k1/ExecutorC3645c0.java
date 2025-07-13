package p179k1;

/* renamed from: k1.c0 */
/* loaded from: classes.dex */
public class ExecutorC3645c0 implements java.util.concurrent.Executor {

    /* renamed from: Y */
    public final java.util.concurrent.Executor f16106Y;

    /* renamed from: Z */
    public final java.util.ArrayDeque<java.lang.Runnable> f16107Z;

    /* renamed from: a0 */
    public java.lang.Runnable f16108a0;

    /* renamed from: k1.c0$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ java.lang.Runnable f16109Y;

        /* renamed from: Z */
        public final /* synthetic */ p179k1.ExecutorC3645c0 f16110Z;

        public a(p179k1.ExecutorC3645c0 r1, java.lang.Runnable r2) {
                r0 = this;
                r0.f16110Z = r1
                r0.f16109Y = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.Runnable r0 = r2.f16109Y     // Catch: java.lang.Throwable -> Lb
                r0.run()     // Catch: java.lang.Throwable -> Lb
                k1.c0 r0 = r2.f16110Z
                r0.m8079a()
                return
            Lb:
                r0 = move-exception
                k1.c0 r1 = r2.f16110Z
                r1.m8079a()
                throw r0
        }
    }

    public ExecutorC3645c0(java.util.concurrent.Executor r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.f16107Z = r0
            r1.f16106Y = r2
            return
    }

    /* renamed from: a */
    public synchronized void m8079a() {
            r2 = this;
            monitor-enter(r2)
            java.util.ArrayDeque<java.lang.Runnable> r0 = r2.f16107Z     // Catch: java.lang.Throwable -> L14
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L14
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L14
            r2.f16108a0 = r0     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L12
            java.util.concurrent.Executor r1 = r2.f16106Y     // Catch: java.lang.Throwable -> L14
            r1.execute(r0)     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r2)
            return
        L14:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(java.lang.Runnable r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.ArrayDeque<java.lang.Runnable> r0 = r2.f16107Z     // Catch: java.lang.Throwable -> L14
            k1.c0$a r1 = new k1.c0$a     // Catch: java.lang.Throwable -> L14
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L14
            r0.offer(r1)     // Catch: java.lang.Throwable -> L14
            java.lang.Runnable r3 = r2.f16108a0     // Catch: java.lang.Throwable -> L14
            if (r3 != 0) goto L12
            r2.m8079a()     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r2)
            return
        L14:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
