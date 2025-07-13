package p379vh;

/* renamed from: vh.d0 */
/* loaded from: classes.dex */
public final class RunnableC6692d0 extends p379vh.AbstractC6728p0 implements java.lang.Runnable {
    private static volatile java.lang.Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: e0 */
    public static final p379vh.RunnableC6692d0 f25967e0 = null;

    /* renamed from: f0 */
    public static final long f25968f0 = 0;

    static {
            vh.d0 r0 = new vh.d0
            r0.<init>()
            p379vh.RunnableC6692d0.f25967e0 = r0
            r1 = 0
            r0.m13645C0(r1)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r3 = "kotlinx.coroutines.DefaultExecutor.keepAlive"
            java.lang.Long r1 = java.lang.Long.getLong(r3, r1)     // Catch: java.lang.SecurityException -> L16
            goto L1a
        L16:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L1a:
            long r1 = r1.longValue()
            long r0 = r0.toNanos(r1)
            p379vh.RunnableC6692d0.f25968f0 = r0
            return
    }

    public RunnableC6692d0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p379vh.AbstractC6731q0
    /* renamed from: F0 */
    public java.lang.Thread mo13561F0() {
            r2 = this;
            java.lang.Thread r0 = p379vh.RunnableC6692d0._thread
            if (r0 != 0) goto L1e
            monitor-enter(r2)
            java.lang.Thread r0 = p379vh.RunnableC6692d0._thread     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L19
            java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "kotlinx.coroutines.DefaultExecutor"
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L1b
            p379vh.RunnableC6692d0._thread = r0     // Catch: java.lang.Throwable -> L1b
            r1 = 1
            r0.setDaemon(r1)     // Catch: java.lang.Throwable -> L1b
            r0.start()     // Catch: java.lang.Throwable -> L1b
        L19:
            monitor-exit(r2)
            goto L1e
        L1b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L1e:
            return r0
    }

    /* renamed from: M0 */
    public final synchronized void m13562M0() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.m13563N0()     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L9
            monitor-exit(r1)
            return
        L9:
            r0 = 3
            p379vh.RunnableC6692d0.debugStatus = r0     // Catch: java.lang.Throwable -> L14
            r1.m13653K0()     // Catch: java.lang.Throwable -> L14
            r1.notifyAll()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            return
        L14:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    /* renamed from: N0 */
    public final boolean m13563N0() {
            r2 = this;
            int r0 = p379vh.RunnableC6692d0.debugStatus
            r1 = 2
            if (r0 == r1) goto Lb
            r1 = 3
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r12 = this;
            vh.s1 r0 = p379vh.C6738s1.f26034a
            java.lang.ThreadLocal<vh.o0> r0 = p379vh.C6738s1.f26035b
            r0.set(r12)
            r0 = 0
            monitor-enter(r12)     // Catch: java.lang.Throwable -> L83
            boolean r1 = r12.m13563N0()     // Catch: java.lang.Throwable -> L80
            if (r1 == 0) goto L12
            r1 = 0
        L10:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L83
            goto L19
        L12:
            r1 = 1
            p379vh.RunnableC6692d0.debugStatus = r1     // Catch: java.lang.Throwable -> L80
            r12.notifyAll()     // Catch: java.lang.Throwable -> L80
            goto L10
        L19:
            if (r1 != 0) goto L2a
            p379vh.RunnableC6692d0._thread = r0
            r12.m13562M0()
            boolean r0 = r12.m13651I0()
            if (r0 != 0) goto L29
            r12.mo13561F0()
        L29:
            return
        L2a:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = r1
        L30:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L83
            long r5 = r12.m13652J0()     // Catch: java.lang.Throwable -> L83
            r7 = 0
            int r9 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r9 != 0) goto L62
            long r9 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L83
            int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r11 != 0) goto L48
            long r3 = p379vh.RunnableC6692d0.f25968f0     // Catch: java.lang.Throwable -> L83
            long r3 = r3 + r9
        L48:
            long r9 = r3 - r9
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 > 0) goto L5d
            p379vh.RunnableC6692d0._thread = r0
            r12.m13562M0()
            boolean r0 = r12.m13651I0()
            if (r0 != 0) goto L5c
            r12.mo13561F0()
        L5c:
            return
        L5d:
            long r5 = p209lh.C4304a.m9615i(r5, r9)     // Catch: java.lang.Throwable -> L83
            goto L63
        L62:
            r3 = r1
        L63:
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L30
            boolean r7 = r12.m13563N0()     // Catch: java.lang.Throwable -> L83
            if (r7 == 0) goto L7c
            p379vh.RunnableC6692d0._thread = r0
            r12.m13562M0()
            boolean r0 = r12.m13651I0()
            if (r0 != 0) goto L7b
            r12.mo13561F0()
        L7b:
            return
        L7c:
            java.util.concurrent.locks.LockSupport.parkNanos(r12, r5)     // Catch: java.lang.Throwable -> L83
            goto L30
        L80:
            r1 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L83
            throw r1     // Catch: java.lang.Throwable -> L83
        L83:
            r1 = move-exception
            p379vh.RunnableC6692d0._thread = r0
            r12.m13562M0()
            boolean r0 = r12.m13651I0()
            if (r0 != 0) goto L92
            r12.mo13561F0()
        L92:
            throw r1
    }
}
