package p249o7;

/* renamed from: o7.f4 */
/* loaded from: classes.dex */
public final class C4994f4 extends p249o7.AbstractC5050m4 {

    /* renamed from: k */
    public static final java.util.concurrent.atomic.AtomicLong f19675k = null;

    /* renamed from: c */
    public p249o7.C4986e4 f19676c;

    /* renamed from: d */
    public p249o7.C4986e4 f19677d;

    /* renamed from: e */
    public final java.util.concurrent.PriorityBlockingQueue<p249o7.C4978d4<?>> f19678e;

    /* renamed from: f */
    public final java.util.concurrent.BlockingQueue<p249o7.C4978d4<?>> f19679f;

    /* renamed from: g */
    public final java.lang.Thread.UncaughtExceptionHandler f19680g;

    /* renamed from: h */
    public final java.lang.Thread.UncaughtExceptionHandler f19681h;

    /* renamed from: i */
    public final java.lang.Object f19682i;

    /* renamed from: j */
    public final java.util.concurrent.Semaphore f19683j;

    static {
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = -9223372036854775808
            r0.<init>(r1)
            p249o7.C4994f4.f19675k = r0
            return
    }

    public C4994f4(com.google.android.gms.measurement.internal.C1113d r2) {
            r1 = this;
            r1.<init>(r2)
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.f19682i = r2
            java.util.concurrent.Semaphore r2 = new java.util.concurrent.Semaphore
            r0 = 2
            r2.<init>(r0)
            r1.f19683j = r2
            java.util.concurrent.PriorityBlockingQueue r2 = new java.util.concurrent.PriorityBlockingQueue
            r2.<init>()
            r1.f19678e = r2
            java.util.concurrent.LinkedBlockingQueue r2 = new java.util.concurrent.LinkedBlockingQueue
            r2.<init>()
            r1.f19679f = r2
            o7.c4 r2 = new o7.c4
            java.lang.String r0 = "Thread death: Uncaught exception on worker thread"
            r2.<init>(r1, r0)
            r1.f19680g = r2
            o7.c4 r2 = new o7.c4
            java.lang.String r0 = "Thread death: Uncaught exception on network thread"
            r2.<init>(r1, r0)
            r1.f19681h = r2
            return
    }

    @Override // com.google.android.gms.measurement.internal.C1114e
    /* renamed from: h */
    public final void mo3182h() {
            r2 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            o7.e4 r1 = r2.f19677d
            if (r0 != r1) goto L9
            return
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Call expected from network thread"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.measurement.internal.C1114e
    /* renamed from: i */
    public final void mo3183i() {
            r2 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            o7.e4 r1 = r2.f19676c
            if (r0 != r1) goto L9
            return
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Call expected from worker thread"
            r0.<init>(r1)
            throw r0
    }

    @Override // p249o7.AbstractC5050m4
    /* renamed from: k */
    public final boolean mo3138k() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: p */
    public final <T> T m11173p(java.util.concurrent.atomic.AtomicReference<T> r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
            r1 = this;
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a     // Catch: java.lang.Throwable -> L54
            o7.f4 r0 = r0.mo3160b()     // Catch: java.lang.Throwable -> L54
            r0.m11176s(r6)     // Catch: java.lang.Throwable -> L54
            r2.wait(r3)     // Catch: java.lang.InterruptedException -> L33 java.lang.Throwable -> L54
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L32
            com.google.android.gms.measurement.internal.d r3 = r1.f5736a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5675i
            java.lang.String r4 = "Timed out waiting for "
            int r6 = r5.length()
            if (r6 == 0) goto L29
            java.lang.String r4 = r4.concat(r5)
            goto L2f
        L29:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            r4 = r5
        L2f:
            r3.m11169c(r4)
        L32:
            return r2
        L33:
            com.google.android.gms.measurement.internal.d r3 = r1.f5736a     // Catch: java.lang.Throwable -> L54
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()     // Catch: java.lang.Throwable -> L54
            o7.f3 r3 = r3.f5675i     // Catch: java.lang.Throwable -> L54
            java.lang.String r4 = "Interrupted waiting for "
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L54
            if (r6 == 0) goto L48
            java.lang.String r4 = r4.concat(r5)     // Catch: java.lang.Throwable -> L54
            goto L4e
        L48:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L54
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L54
            r4 = r5
        L4e:
            r3.m11169c(r4)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            r2 = 0
            return r2
        L54:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            throw r3
    }

    /* renamed from: q */
    public final <V> java.util.concurrent.Future<V> m11174q(java.util.concurrent.Callable<V> r3) {
            r2 = this;
            r2.m11315l()
            o7.d4 r0 = new o7.d4
            r1 = 0
            r0.<init>(r2, r3, r1)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            o7.e4 r1 = r2.f19676c
            if (r3 != r1) goto L2a
            java.util.concurrent.PriorityBlockingQueue<o7.d4<?>> r3 = r2.f19678e
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L26
            com.google.android.gms.measurement.internal.d r3 = r2.f5736a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5675i
            java.lang.String r1 = "Callable skipped the worker queue."
            r3.m11169c(r1)
        L26:
            r0.run()
            goto L2d
        L2a:
            r2.m11179v(r0)
        L2d:
            return r0
    }

    /* renamed from: r */
    public final void m11175r(java.lang.Runnable r4) {
            r3 = this;
            r3.m11315l()
            o7.d4 r0 = new o7.d4
            java.lang.String r1 = "Task exception on network thread"
            r2 = 0
            r0.<init>(r3, r4, r2, r1)
            java.lang.Object r4 = r3.f19682i
            monitor-enter(r4)
            java.util.concurrent.BlockingQueue<o7.d4<?>> r1 = r3.f19679f     // Catch: java.lang.Throwable -> L3b
            r1.add(r0)     // Catch: java.lang.Throwable -> L3b
            o7.e4 r0 = r3.f19677d     // Catch: java.lang.Throwable -> L3b
            if (r0 != 0) goto L2d
            o7.e4 r0 = new o7.e4     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = "Measurement Network"
            java.util.concurrent.BlockingQueue<o7.d4<?>> r2 = r3.f19679f     // Catch: java.lang.Throwable -> L3b
            r0.<init>(r3, r1, r2)     // Catch: java.lang.Throwable -> L3b
            r3.f19677d = r0     // Catch: java.lang.Throwable -> L3b
            java.lang.Thread$UncaughtExceptionHandler r1 = r3.f19681h     // Catch: java.lang.Throwable -> L3b
            r0.setUncaughtExceptionHandler(r1)     // Catch: java.lang.Throwable -> L3b
            o7.e4 r0 = r3.f19677d     // Catch: java.lang.Throwable -> L3b
            r0.start()     // Catch: java.lang.Throwable -> L3b
            goto L36
        L2d:
            java.lang.Object r1 = r0.f19660Y     // Catch: java.lang.Throwable -> L3b
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r0 = r0.f19660Y     // Catch: java.lang.Throwable -> L38
            r0.notifyAll()     // Catch: java.lang.Throwable -> L38
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L38
        L36:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3b
            return
        L38:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L38
            throw r0     // Catch: java.lang.Throwable -> L3b
        L3b:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3b
            throw r0
    }

    /* renamed from: s */
    public final void m11176s(java.lang.Runnable r4) {
            r3 = this;
            r3.m11315l()
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r4, r0)
            o7.d4 r0 = new o7.d4
            r1 = 0
            java.lang.String r2 = "Task exception on worker thread"
            r0.<init>(r3, r4, r1, r2)
            r3.m11179v(r0)
            return
    }

    /* renamed from: t */
    public final void m11177t(java.lang.Runnable r4) {
            r3 = this;
            r3.m11315l()
            o7.d4 r0 = new o7.d4
            r1 = 1
            java.lang.String r2 = "Task exception on worker thread"
            r0.<init>(r3, r4, r1, r2)
            r3.m11179v(r0)
            return
    }

    /* renamed from: u */
    public final boolean m11178u() {
            r2 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            o7.e4 r1 = r2.f19676c
            if (r0 != r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    /* renamed from: v */
    public final void m11179v(p249o7.C4978d4<?> r4) {
            r3 = this;
            java.lang.Object r0 = r3.f19682i
            monitor-enter(r0)
            java.util.concurrent.PriorityBlockingQueue<o7.d4<?>> r1 = r3.f19678e     // Catch: java.lang.Throwable -> L30
            r1.add(r4)     // Catch: java.lang.Throwable -> L30
            o7.e4 r4 = r3.f19676c     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L22
            o7.e4 r4 = new o7.e4     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = "Measurement Worker"
            java.util.concurrent.PriorityBlockingQueue<o7.d4<?>> r2 = r3.f19678e     // Catch: java.lang.Throwable -> L30
            r4.<init>(r3, r1, r2)     // Catch: java.lang.Throwable -> L30
            r3.f19676c = r4     // Catch: java.lang.Throwable -> L30
            java.lang.Thread$UncaughtExceptionHandler r1 = r3.f19680g     // Catch: java.lang.Throwable -> L30
            r4.setUncaughtExceptionHandler(r1)     // Catch: java.lang.Throwable -> L30
            o7.e4 r4 = r3.f19676c     // Catch: java.lang.Throwable -> L30
            r4.start()     // Catch: java.lang.Throwable -> L30
            goto L2b
        L22:
            java.lang.Object r1 = r4.f19660Y     // Catch: java.lang.Throwable -> L30
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r4 = r4.f19660Y     // Catch: java.lang.Throwable -> L2d
            r4.notifyAll()     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            return
        L2d:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            throw r4     // Catch: java.lang.Throwable -> L30
        L30:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r4
    }
}
