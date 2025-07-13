package ai;

/* renamed from: ai.a */
/* loaded from: classes.dex */
public final class ExecutorC0101a implements java.util.concurrent.Executor, java.io.Closeable {

    /* renamed from: f0 */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f335f0 = null;

    /* renamed from: g0 */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f336g0 = null;

    /* renamed from: h0 */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f337h0 = null;

    /* renamed from: i0 */
    public static final p459zh.C7350p f338i0 = null;

    /* renamed from: Y */
    public final int f339Y;

    /* renamed from: Z */
    public final int f340Z;
    private volatile /* synthetic */ int _isTerminated;

    /* renamed from: a0 */
    public final long f341a0;

    /* renamed from: b0 */
    public final java.lang.String f342b0;

    /* renamed from: c0 */
    public final ai.C0104d f343c0;
    public volatile /* synthetic */ long controlState;

    /* renamed from: d0 */
    public final ai.C0104d f344d0;

    /* renamed from: e0 */
    public final java.util.concurrent.atomic.AtomicReferenceArray<ai.ExecutorC0101a.a> f345e0;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: ai.a$a */
    public final class a extends java.lang.Thread {

        /* renamed from: f0 */
        public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f346f0 = null;

        /* renamed from: Y */
        public final ai.C0113m f347Y;

        /* renamed from: Z */
        public int f348Z;

        /* renamed from: a0 */
        public long f349a0;

        /* renamed from: b0 */
        public long f350b0;

        /* renamed from: c0 */
        public int f351c0;

        /* renamed from: d0 */
        public boolean f352d0;

        /* renamed from: e0 */
        public final /* synthetic */ ai.ExecutorC0101a f353e0;
        private volatile int indexInArray;
        private volatile java.lang.Object nextParkedWorker;
        public volatile /* synthetic */ int workerCtl;

        static {
                java.lang.Class<ai.a$a> r0 = ai.ExecutorC0101a.a.class
                java.lang.String r1 = "workerCtl"
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
                ai.ExecutorC0101a.a.f346f0 = r0
                return
        }

        public a(ai.ExecutorC0101a r1, int r2) {
                r0 = this;
                r0.f353e0 = r1
                r0.f353e0 = r1
                r0.<init>()
                r1 = 1
                r0.setDaemon(r1)
                ai.m r1 = new ai.m
                r1.<init>()
                r0.f347Y = r1
                r1 = 4
                r0.f348Z = r1
                r1 = 0
                r0.workerCtl = r1
                zh.p r1 = ai.ExecutorC0101a.f338i0
                r0.nextParkedWorker = r1
                ph.c$a r1 = ph.AbstractC5526c.f21525Y
                int r1 = r1.mo11783b()
                r0.f351c0 = r1
                r0.m152f(r2)
                return
        }

        /* renamed from: a */
        public final ai.AbstractRunnableC0109i m147a(boolean r10) {
                r9 = this;
                int r0 = r9.f348Z
                r1 = 0
                r2 = 1
                if (r0 != r2) goto L7
                goto L2e
            L7:
                ai.a r0 = r9.f353e0
            L9:
                long r5 = r0.controlState
                r3 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r3 = r3 & r5
                r7 = 42
                long r3 = r3 >> r7
                int r4 = (int) r3
                if (r4 != 0) goto L19
                r0 = 0
                goto L2a
            L19:
                r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r7 = r5 - r3
                java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = ai.ExecutorC0101a.f336g0
                r4 = r0
                boolean r3 = r3.compareAndSet(r4, r5, r7)
                if (r3 == 0) goto L9
                r0 = 1
            L2a:
                if (r0 == 0) goto L30
                r9.f348Z = r2
            L2e:
                r0 = 1
                goto L31
            L30:
                r0 = 0
            L31:
                if (r0 == 0) goto L67
                if (r10 == 0) goto L5c
                ai.a r10 = r9.f353e0
                int r10 = r10.f339Y
                int r10 = r10 * 2
                int r10 = r9.m150d(r10)
                if (r10 != 0) goto L42
                goto L43
            L42:
                r2 = 0
            L43:
                if (r2 == 0) goto L4b
                ai.i r10 = r9.m151e()
                if (r10 != 0) goto L66
            L4b:
                ai.m r10 = r9.f347Y
                ai.i r10 = r10.m164e()
                if (r10 != 0) goto L66
                if (r2 != 0) goto L62
                ai.i r10 = r9.m151e()
                if (r10 != 0) goto L66
                goto L62
            L5c:
                ai.i r10 = r9.m151e()
                if (r10 != 0) goto L66
            L62:
                ai.i r10 = r9.m155i(r1)
            L66:
                return r10
            L67:
                if (r10 == 0) goto L71
                ai.m r10 = r9.f347Y
                ai.i r10 = r10.m164e()
                if (r10 != 0) goto L7b
            L71:
                ai.a r10 = r9.f353e0
                ai.d r10 = r10.f344d0
                java.lang.Object r10 = r10.m14429d()
                ai.i r10 = (ai.AbstractRunnableC0109i) r10
            L7b:
                if (r10 != 0) goto L81
                ai.i r10 = r9.m155i(r2)
            L81:
                return r10
        }

        /* renamed from: b */
        public final int m148b() {
                r1 = this;
                int r0 = r1.indexInArray
                return r0
        }

        /* renamed from: c */
        public final java.lang.Object m149c() {
                r1 = this;
                java.lang.Object r0 = r1.nextParkedWorker
                return r0
        }

        /* renamed from: d */
        public final int m150d(int r4) {
                r3 = this;
                int r0 = r3.f351c0
                int r1 = r0 << 13
                r0 = r0 ^ r1
                int r1 = r0 >> 17
                r0 = r0 ^ r1
                int r1 = r0 << 5
                r0 = r0 ^ r1
                r3.f351c0 = r0
                int r1 = r4 + (-1)
                r2 = r1 & r4
                if (r2 != 0) goto L16
                r4 = r0 & r1
                return r4
            L16:
                r1 = 2147483647(0x7fffffff, float:NaN)
                r0 = r0 & r1
                int r0 = r0 % r4
                return r0
        }

        /* renamed from: e */
        public final ai.AbstractRunnableC0109i m151e() {
                r1 = this;
                r0 = 2
                int r0 = r1.m150d(r0)
                if (r0 != 0) goto L1e
                ai.a r0 = r1.f353e0
                ai.d r0 = r0.f343c0
                java.lang.Object r0 = r0.m14429d()
                ai.i r0 = (ai.AbstractRunnableC0109i) r0
                if (r0 != 0) goto L1d
                ai.a r0 = r1.f353e0
                ai.d r0 = r0.f344d0
            L17:
                java.lang.Object r0 = r0.m14429d()
                ai.i r0 = (ai.AbstractRunnableC0109i) r0
            L1d:
                return r0
            L1e:
                ai.a r0 = r1.f353e0
                ai.d r0 = r0.f344d0
                java.lang.Object r0 = r0.m14429d()
                ai.i r0 = (ai.AbstractRunnableC0109i) r0
                if (r0 != 0) goto L2f
                ai.a r0 = r1.f353e0
                ai.d r0 = r0.f343c0
                goto L17
            L2f:
                return r0
        }

        /* renamed from: f */
        public final void m152f(int r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                ai.a r1 = r2.f353e0
                java.lang.String r1 = r1.f342b0
                r0.append(r1)
                java.lang.String r1 = "-worker-"
                r0.append(r1)
                if (r3 != 0) goto L16
                java.lang.String r1 = "TERMINATED"
                goto L1a
            L16:
                java.lang.String r1 = java.lang.String.valueOf(r3)
            L1a:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.setName(r0)
                r2.indexInArray = r3
                return
        }

        /* renamed from: g */
        public final void m153g(java.lang.Object r1) {
                r0 = this;
                r0.nextParkedWorker = r1
                return
        }

        /* renamed from: h */
        public final boolean m154h(int r7) {
                r6 = this;
                int r0 = r6.f348Z
                r1 = 1
                if (r0 != r1) goto L6
                goto L7
            L6:
                r1 = 0
            L7:
                if (r1 == 0) goto L15
                ai.a r2 = r6.f353e0
                java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = ai.ExecutorC0101a.f336g0
                r4 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                r3.addAndGet(r2, r4)
            L15:
                if (r0 == r7) goto L19
                r6.f348Z = r7
            L19:
                return r1
        }

        /* renamed from: i */
        public final ai.AbstractRunnableC0109i m155i(boolean r19) {
                r18 = this;
                r0 = r18
                ai.a r1 = r0.f353e0
                long r1 = r1.controlState
                r3 = 2097151(0x1fffff, double:1.0361303E-317)
                long r1 = r1 & r3
                int r2 = (int) r1
                r1 = 2
                r3 = 0
                if (r2 >= r1) goto L10
                return r3
            L10:
                int r1 = r0.m150d(r2)
                ai.a r4 = r0.f353e0
                r5 = 0
                r8 = 0
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L1d:
                r11 = 0
                if (r8 >= r2) goto L6a
                r13 = 1
                int r1 = r1 + r13
                if (r1 <= r2) goto L26
                r1 = 1
            L26:
                java.util.concurrent.atomic.AtomicReferenceArray<ai.a$a> r13 = r4.f345e0
                java.lang.Object r13 = r13.get(r1)
                ai.a$a r13 = (ai.ExecutorC0101a.a) r13
                if (r13 == 0) goto L66
                if (r13 == r0) goto L66
                r14 = -1
                ai.m r3 = r0.f347Y
                ai.m r13 = r13.f347Y
                if (r19 == 0) goto L41
                long r16 = r3.m166g(r13)
                r6 = r16
                goto L53
            L41:
                java.util.Objects.requireNonNull(r3)
                ai.i r6 = r13.m165f()
                if (r6 == 0) goto L4f
                r3.m160a(r6, r5)
                r6 = r14
                goto L53
            L4f:
                long r6 = r3.m167h(r13, r5)
            L53:
                int r3 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
                if (r3 != 0) goto L5e
                ai.m r1 = r0.f347Y
                ai.i r1 = r1.m164e()
                return r1
            L5e:
                int r3 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r3 <= 0) goto L66
                long r9 = java.lang.Math.min(r9, r6)
            L66:
                int r8 = r8 + 1
                r3 = 0
                goto L1d
            L6a:
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r1 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r1 == 0) goto L74
                goto L75
            L74:
                r9 = r11
            L75:
                r0.f350b0 = r9
                r1 = 0
                return r1
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r17 = this;
                r1 = r17
            L2:
                r0 = 0
                r2 = 1
                r3 = 0
            L5:
                ai.a r4 = r1.f353e0
                boolean r4 = r4.isTerminated()
                r5 = 5
                if (r4 != 0) goto L125
                int r4 = r1.f348Z
                if (r4 == r5) goto L125
                boolean r4 = r1.f352d0
                ai.i r4 = r1.m147a(r4)
                r6 = 0
                r8 = 3
                if (r4 == 0) goto L56
                r1.f350b0 = r6
                r0 = 2
                ai.j r2 = r4.f370Z
                int r2 = r2.mo158s0()
                r1.f349a0 = r6
                int r3 = r1.f348Z
                if (r3 != r8) goto L2e
                r1.f348Z = r0
            L2e:
                if (r2 != 0) goto L31
                goto L3c
            L31:
                boolean r0 = r1.m154h(r0)
                if (r0 == 0) goto L3c
                ai.a r0 = r1.f353e0
                r0.m139R()
            L3c:
                ai.a r0 = r1.f353e0
                r0.m138Q(r4)
                if (r2 != 0) goto L44
                goto L2
            L44:
                ai.a r0 = r1.f353e0
                java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = ai.ExecutorC0101a.f336g0
                r3 = -2097152(0xffffffffffe00000, double:NaN)
                r2.addAndGet(r0, r3)
                int r0 = r1.f348Z
                if (r0 == r5) goto L2
                r0 = 4
                r1.f348Z = r0
                goto L2
            L56:
                r1.f352d0 = r0
                long r9 = r1.f350b0
                int r4 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r4 == 0) goto L70
                if (r3 != 0) goto L62
                r3 = 1
                goto L5
            L62:
                r1.m154h(r8)
                java.lang.Thread.interrupted()
                long r2 = r1.f350b0
                java.util.concurrent.locks.LockSupport.parkNanos(r2)
                r1.f350b0 = r6
                goto L2
            L70:
                java.lang.Object r4 = r1.nextParkedWorker
                zh.p r9 = ai.ExecutorC0101a.f338i0
                if (r4 == r9) goto L78
                r4 = 1
                goto L79
            L78:
                r4 = 0
            L79:
                if (r4 != 0) goto L81
                ai.a r4 = r1.f353e0
                r4.m136A(r1)
                goto L5
            L81:
                r4 = -1
                r1.workerCtl = r4
            L84:
                java.lang.Object r9 = r1.nextParkedWorker
                zh.p r10 = ai.ExecutorC0101a.f338i0
                if (r9 == r10) goto L8c
                r9 = 1
                goto L8d
            L8c:
                r9 = 0
            L8d:
                if (r9 == 0) goto L5
                int r9 = r1.workerCtl
                if (r9 != r4) goto L5
                ai.a r9 = r1.f353e0
                boolean r9 = r9.isTerminated()
                if (r9 != 0) goto L5
                int r9 = r1.f348Z
                if (r9 != r5) goto La1
                goto L5
            La1:
                r1.m154h(r8)
                java.lang.Thread.interrupted()
                long r9 = r1.f349a0
                int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r11 != 0) goto Lb8
                long r9 = java.lang.System.nanoTime()
                ai.a r11 = r1.f353e0
                long r11 = r11.f341a0
                long r9 = r9 + r11
                r1.f349a0 = r9
            Lb8:
                ai.a r9 = r1.f353e0
                long r9 = r9.f341a0
                java.util.concurrent.locks.LockSupport.parkNanos(r9)
                long r9 = java.lang.System.nanoTime()
                long r11 = r1.f349a0
                long r9 = r9 - r11
                int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r11 < 0) goto L84
                r1.f349a0 = r6
                ai.a r9 = r1.f353e0
                java.util.concurrent.atomic.AtomicReferenceArray<ai.a$a> r10 = r9.f345e0
                monitor-enter(r10)
                boolean r11 = r9.isTerminated()     // Catch: java.lang.Throwable -> L122
                if (r11 == 0) goto Ld8
                goto Lec
            Ld8:
                long r11 = r9.controlState     // Catch: java.lang.Throwable -> L122
                r13 = 2097151(0x1fffff, double:1.0361303E-317)
                long r11 = r11 & r13
                int r12 = (int) r11     // Catch: java.lang.Throwable -> L122
                int r11 = r9.f339Y     // Catch: java.lang.Throwable -> L122
                if (r12 > r11) goto Le4
                goto Lec
            Le4:
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r11 = ai.ExecutorC0101a.a.f346f0     // Catch: java.lang.Throwable -> L122
                boolean r11 = r11.compareAndSet(r1, r4, r2)     // Catch: java.lang.Throwable -> L122
                if (r11 != 0) goto Lee
            Lec:
                monitor-exit(r10)
                goto L84
            Lee:
                int r11 = r1.indexInArray     // Catch: java.lang.Throwable -> L122
                r1.m152f(r0)     // Catch: java.lang.Throwable -> L122
                r9.m137L(r1, r11, r0)     // Catch: java.lang.Throwable -> L122
                java.util.concurrent.atomic.AtomicLongFieldUpdater r12 = ai.ExecutorC0101a.f336g0     // Catch: java.lang.Throwable -> L122
                long r15 = r12.getAndDecrement(r9)     // Catch: java.lang.Throwable -> L122
                long r12 = r15 & r13
                int r13 = (int) r12     // Catch: java.lang.Throwable -> L122
                if (r13 == r11) goto L117
                java.util.concurrent.atomic.AtomicReferenceArray<ai.a$a> r12 = r9.f345e0     // Catch: java.lang.Throwable -> L122
                java.lang.Object r12 = r12.get(r13)     // Catch: java.lang.Throwable -> L122
                p214m2.C4339q.m9704i(r12)     // Catch: java.lang.Throwable -> L122
                ai.a$a r12 = (ai.ExecutorC0101a.a) r12     // Catch: java.lang.Throwable -> L122
                java.util.concurrent.atomic.AtomicReferenceArray<ai.a$a> r14 = r9.f345e0     // Catch: java.lang.Throwable -> L122
                r14.set(r11, r12)     // Catch: java.lang.Throwable -> L122
                r12.m152f(r11)     // Catch: java.lang.Throwable -> L122
                r9.m137L(r12, r13, r11)     // Catch: java.lang.Throwable -> L122
            L117:
                java.util.concurrent.atomic.AtomicReferenceArray<ai.a$a> r9 = r9.f345e0     // Catch: java.lang.Throwable -> L122
                r11 = 0
                r9.set(r13, r11)     // Catch: java.lang.Throwable -> L122
                monitor-exit(r10)
                r1.f348Z = r5
                goto L84
            L122:
                r0 = move-exception
                monitor-exit(r10)
                throw r0
            L125:
                r1.m154h(r5)
                return
        }
    }

    static {
            zh.p r0 = new zh.p
            java.lang.String r1 = "NOT_IN_STACK"
            r0.<init>(r1)
            ai.ExecutorC0101a.f338i0 = r0
            java.lang.Class<ai.a> r0 = ai.ExecutorC0101a.class
            java.lang.String r1 = "parkedWorkersStack"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r0, r1)
            ai.ExecutorC0101a.f335f0 = r0
            java.lang.Class<ai.a> r0 = ai.ExecutorC0101a.class
            java.lang.String r1 = "controlState"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r0, r1)
            ai.ExecutorC0101a.f336g0 = r0
            java.lang.Class<ai.a> r0 = ai.ExecutorC0101a.class
            java.lang.String r1 = "_isTerminated"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            ai.ExecutorC0101a.f337h0 = r0
            return
    }

    public ExecutorC0101a(int r5, int r6, long r7, java.lang.String r9) {
            r4 = this;
            r4.<init>()
            r4.f339Y = r5
            r4.f340Z = r6
            r4.f341a0 = r7
            r4.f342b0 = r9
            r9 = 1
            r0 = 0
            if (r5 < r9) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L93
            if (r6 < r5) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            java.lang.String r2 = "Max pool size "
            if (r1 == 0) goto L83
            r1 = 2097150(0x1ffffe, float:2.938733E-39)
            if (r6 > r1) goto L24
            r1 = 1
            goto L25
        L24:
            r1 = 0
        L25:
            if (r1 == 0) goto L73
            r1 = 0
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 <= 0) goto L2f
            r3 = 1
            goto L30
        L2f:
            r3 = 0
        L30:
            if (r3 == 0) goto L53
            ai.d r7 = new ai.d
            r7.<init>()
            r4.f343c0 = r7
            ai.d r7 = new ai.d
            r7.<init>()
            r4.f344d0 = r7
            r4.parkedWorkersStack = r1
            java.util.concurrent.atomic.AtomicReferenceArray r7 = new java.util.concurrent.atomic.AtomicReferenceArray
            int r6 = r6 + r9
            r7.<init>(r6)
            r4.f345e0 = r7
            long r5 = (long) r5
            r7 = 42
            long r5 = r5 << r7
            r4.controlState = r5
            r4._isTerminated = r0
            return
        L53:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Idle worker keep alive time "
            r5.append(r6)
            r5.append(r7)
            java.lang.String r6 = " must be positive"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L73:
            java.lang.String r5 = " should not exceed maximal supported number of threads 2097150"
            java.lang.String r5 = android.support.v4.media.C0146e.m258a(r2, r6, r5)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L83:
            java.lang.String r7 = " should be greater than or equals to core pool size "
            java.lang.String r5 = p243o1.C4872b.m11020a(r2, r6, r7, r5)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L93:
            java.lang.String r6 = "Core pool size "
            java.lang.String r7 = " should be at least 1"
            java.lang.String r5 = android.support.v4.media.C0146e.m258a(r6, r5, r7)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    /* renamed from: A */
    public final boolean m136A(ai.ExecutorC0101a.a r9) {
            r8 = this;
            java.lang.Object r0 = r9.m149c()
            zh.p r1 = ai.ExecutorC0101a.f338i0
            if (r0 == r1) goto La
            r9 = 0
            return r9
        La:
            long r2 = r8.parkedWorkersStack
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r2
            int r1 = (int) r0
            r4 = 2097152(0x200000, double:1.036131E-317)
            long r4 = r4 + r2
            r6 = -2097152(0xffffffffffe00000, double:NaN)
            long r4 = r4 & r6
            int r0 = r9.m148b()
            java.util.concurrent.atomic.AtomicReferenceArray<ai.a$a> r6 = r8.f345e0
            java.lang.Object r1 = r6.get(r1)
            r9.m153g(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = ai.ExecutorC0101a.f335f0
            long r6 = (long) r0
            long r4 = r4 | r6
            r0 = r1
            r1 = r8
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto La
            r9 = 1
            return r9
    }

    /* renamed from: L */
    public final void m137L(ai.ExecutorC0101a.a r9, int r10, int r11) {
            r8 = this;
        L0:
            long r2 = r8.parkedWorkersStack
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r2
            int r1 = (int) r0
            r4 = 2097152(0x200000, double:1.036131E-317)
            long r4 = r4 + r2
            r6 = -2097152(0xffffffffffe00000, double:NaN)
            long r4 = r4 & r6
            if (r1 != r10) goto L19
            if (r11 != 0) goto L18
            int r1 = r8.m146n(r9)
            goto L19
        L18:
            r1 = r11
        L19:
            if (r1 >= 0) goto L1c
            goto L0
        L1c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = ai.ExecutorC0101a.f335f0
            long r6 = (long) r1
            long r4 = r4 | r6
            r1 = r8
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            return
    }

    /* renamed from: Q */
    public final void m138Q(ai.AbstractRunnableC0109i r3) {
            r2 = this;
            r3.run()     // Catch: java.lang.Throwable -> L4
            goto L10
        L4:
            r3 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L11
            java.lang.Thread$UncaughtExceptionHandler r1 = r0.getUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L11
            r1.uncaughtException(r0, r3)     // Catch: java.lang.Throwable -> L11
        L10:
            return
        L11:
            r3 = move-exception
            throw r3
    }

    /* renamed from: R */
    public final void m139R() {
            r2 = this;
            boolean r0 = r2.m141V()
            if (r0 == 0) goto L7
            return
        L7:
            long r0 = r2.controlState
            boolean r0 = r2.m140S(r0)
            if (r0 == 0) goto L10
            return
        L10:
            r2.m141V()
            return
    }

    /* renamed from: S */
    public final boolean m140S(long r5) {
            r4 = this;
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r5
            int r1 = (int) r0
            r2 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r5 = r5 & r2
            r0 = 21
            long r5 = r5 >> r0
            int r6 = (int) r5
            int r1 = r1 - r6
            r5 = 0
            if (r1 >= 0) goto L14
            r1 = 0
        L14:
            int r6 = r4.f339Y
            if (r1 >= r6) goto L29
            int r6 = r4.m142a()
            r0 = 1
            if (r6 != r0) goto L26
            int r1 = r4.f339Y
            if (r1 <= r0) goto L26
            r4.m142a()
        L26:
            if (r6 <= 0) goto L29
            return r0
        L29:
            return r5
    }

    /* renamed from: V */
    public final boolean m141V() {
            r9 = this;
        L0:
            long r2 = r9.parkedWorkersStack
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r2
            int r1 = (int) r0
            java.util.concurrent.atomic.AtomicReferenceArray<ai.a$a> r0 = r9.f345e0
            java.lang.Object r0 = r0.get(r1)
            r6 = r0
            ai.a$a r6 = (ai.ExecutorC0101a.a) r6
            if (r6 != 0) goto L14
            r6 = 0
            goto L35
        L14:
            r0 = 2097152(0x200000, double:1.036131E-317)
            long r0 = r0 + r2
            r4 = -2097152(0xffffffffffe00000, double:NaN)
            long r0 = r0 & r4
            int r4 = r9.m146n(r6)
            if (r4 >= 0) goto L23
            goto L0
        L23:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = ai.ExecutorC0101a.f335f0
            long r7 = (long) r4
            long r7 = r7 | r0
            r0 = r5
            r1 = r9
            r4 = r7
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            zh.p r0 = ai.ExecutorC0101a.f338i0
            r6.m153g(r0)
        L35:
            r0 = 0
            if (r6 != 0) goto L39
            return r0
        L39:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = ai.ExecutorC0101a.a.f346f0
            r2 = -1
            boolean r0 = r1.compareAndSet(r6, r2, r0)
            if (r0 == 0) goto L0
            java.util.concurrent.locks.LockSupport.unpark(r6)
            r0 = 1
            return r0
    }

    /* renamed from: a */
    public final int m142a() {
            r10 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<ai.a$a> r0 = r10.f345e0
            monitor-enter(r0)
            int r1 = r10._isTerminated     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto La
            r1 = -1
        L8:
            monitor-exit(r0)
            return r1
        La:
            long r1 = r10.controlState     // Catch: java.lang.Throwable -> L77
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r1 & r3
            int r6 = (int) r5     // Catch: java.lang.Throwable -> L77
            r7 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r7
            r5 = 21
            long r1 = r1 >> r5
            int r2 = (int) r1     // Catch: java.lang.Throwable -> L77
            int r1 = r6 - r2
            r2 = 0
            if (r1 >= 0) goto L22
            r1 = 0
        L22:
            int r5 = r10.f339Y     // Catch: java.lang.Throwable -> L77
            if (r1 < r5) goto L28
            monitor-exit(r0)
            return r2
        L28:
            int r5 = r10.f340Z     // Catch: java.lang.Throwable -> L77
            if (r6 < r5) goto L2e
            monitor-exit(r0)
            return r2
        L2e:
            long r5 = r10.controlState     // Catch: java.lang.Throwable -> L77
            long r5 = r5 & r3
            int r6 = (int) r5     // Catch: java.lang.Throwable -> L77
            r5 = 1
            int r6 = r6 + r5
            if (r6 <= 0) goto L40
            java.util.concurrent.atomic.AtomicReferenceArray<ai.a$a> r7 = r10.f345e0     // Catch: java.lang.Throwable -> L77
            java.lang.Object r7 = r7.get(r6)     // Catch: java.lang.Throwable -> L77
            if (r7 != 0) goto L40
            r7 = 1
            goto L41
        L40:
            r7 = 0
        L41:
            if (r7 == 0) goto L6b
            ai.a$a r7 = new ai.a$a     // Catch: java.lang.Throwable -> L77
            r7.<init>(r10, r6)     // Catch: java.lang.Throwable -> L77
            java.util.concurrent.atomic.AtomicReferenceArray<ai.a$a> r8 = r10.f345e0     // Catch: java.lang.Throwable -> L77
            r8.set(r6, r7)     // Catch: java.lang.Throwable -> L77
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = ai.ExecutorC0101a.f336g0     // Catch: java.lang.Throwable -> L77
            long r8 = r8.incrementAndGet(r10)     // Catch: java.lang.Throwable -> L77
            long r3 = r3 & r8
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L77
            if (r6 != r4) goto L58
            r2 = 1
        L58:
            if (r2 == 0) goto L5f
            r7.start()     // Catch: java.lang.Throwable -> L77
            int r1 = r1 + r5
            goto L8
        L5f:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L77
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L77
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L77
            throw r2     // Catch: java.lang.Throwable -> L77
        L6b:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L77
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L77
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L77
            throw r2     // Catch: java.lang.Throwable -> L77
        L77:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r10 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = ai.ExecutorC0101a.f337h0
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r10, r1, r2)
            if (r0 != 0) goto Lc
            goto L9b
        Lc:
            ai.a$a r0 = r10.m144i()
            java.util.concurrent.atomic.AtomicReferenceArray<ai.a$a> r3 = r10.f345e0
            monitor-enter(r3)
            long r4 = r10.controlState     // Catch: java.lang.Throwable -> La0
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r3)
            r4 = 0
            if (r2 > r5) goto L66
            r3 = 1
        L1f:
            int r6 = r3 + 1
            java.util.concurrent.atomic.AtomicReferenceArray<ai.a$a> r7 = r10.f345e0
            java.lang.Object r7 = r7.get(r3)
            p214m2.C4339q.m9704i(r7)
            ai.a$a r7 = (ai.ExecutorC0101a.a) r7
            if (r7 == r0) goto L61
        L2e:
            boolean r8 = r7.isAlive()
            if (r8 == 0) goto L3d
            java.util.concurrent.locks.LockSupport.unpark(r7)
            r8 = 10000(0x2710, double:4.9407E-320)
            r7.join(r8)
            goto L2e
        L3d:
            ai.m r7 = r7.f347Y
            ai.d r8 = r10.f344d0
            java.util.Objects.requireNonNull(r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = ai.C0113m.f377b
            java.lang.Object r9 = r9.getAndSet(r7, r4)
            ai.i r9 = (ai.AbstractRunnableC0109i) r9
            if (r9 != 0) goto L4f
            goto L52
        L4f:
            r8.m14426a(r9)
        L52:
            ai.i r9 = r7.m165f()
            if (r9 != 0) goto L5a
            r9 = 0
            goto L5e
        L5a:
            r8.m14426a(r9)
            r9 = 1
        L5e:
            if (r9 == 0) goto L61
            goto L52
        L61:
            if (r3 != r5) goto L64
            goto L66
        L64:
            r3 = r6
            goto L1f
        L66:
            ai.d r1 = r10.f344d0
            r1.m14427b()
            ai.d r1 = r10.f343c0
            r1.m14427b()
        L70:
            if (r0 != 0) goto L74
            r1 = r4
            goto L78
        L74:
            ai.i r1 = r0.m147a(r2)
        L78:
            if (r1 != 0) goto L9c
            ai.d r1 = r10.f343c0
            java.lang.Object r1 = r1.m14429d()
            ai.i r1 = (ai.AbstractRunnableC0109i) r1
            if (r1 != 0) goto L9c
            ai.d r1 = r10.f344d0
            java.lang.Object r1 = r1.m14429d()
            ai.i r1 = (ai.AbstractRunnableC0109i) r1
            if (r1 != 0) goto L9c
            if (r0 != 0) goto L91
            goto L95
        L91:
            r1 = 5
            r0.m154h(r1)
        L95:
            r0 = 0
            r10.parkedWorkersStack = r0
            r10.controlState = r0
        L9b:
            return
        L9c:
            r10.m138Q(r1)
            goto L70
        La0:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r3) {
            r2 = this;
            ai.g r0 = ai.C0107g.f368Y
            r1 = 0
            r2.m145l(r3, r0, r1)
            return
    }

    /* renamed from: h */
    public final ai.AbstractRunnableC0109i m143h(java.lang.Runnable r4, ai.InterfaceC0110j r5) {
            r3 = this;
            ai.h r0 = ai.C0112l.f376e
            ai.f r0 = (ai.C0106f) r0
            java.util.Objects.requireNonNull(r0)
            long r0 = java.lang.System.nanoTime()
            boolean r2 = r4 instanceof ai.AbstractRunnableC0109i
            if (r2 == 0) goto L16
            ai.i r4 = (ai.AbstractRunnableC0109i) r4
            r4.f369Y = r0
            r4.f370Z = r5
            return r4
        L16:
            ai.k r2 = new ai.k
            r2.<init>(r4, r0, r5)
            return r2
    }

    /* renamed from: i */
    public final ai.ExecutorC0101a.a m144i() {
            r3 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof ai.ExecutorC0101a.a
            r2 = 0
            if (r1 == 0) goto Lc
            ai.a$a r0 = (ai.ExecutorC0101a.a) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 != 0) goto L10
            goto L19
        L10:
            ai.a r1 = r0.f353e0
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 == 0) goto L19
            r2 = r0
        L19:
            return r2
    }

    public final boolean isTerminated() {
            r1 = this;
            int r0 = r1._isTerminated
            return r0
    }

    /* renamed from: l */
    public final void m145l(java.lang.Runnable r5, ai.InterfaceC0110j r6, boolean r7) {
            r4 = this;
            ai.i r5 = r4.m143h(r5, r6)
            ai.a$a r6 = r4.m144i()
            r0 = 1
            if (r6 != 0) goto Lc
            goto L1f
        Lc:
            int r1 = r6.f348Z
            r2 = 5
            if (r1 != r2) goto L12
            goto L1f
        L12:
            ai.j r1 = r5.f370Z
            int r1 = r1.mo158s0()
            if (r1 != 0) goto L21
            int r1 = r6.f348Z
            r2 = 2
            if (r1 != r2) goto L21
        L1f:
            r1 = r5
            goto L29
        L21:
            r6.f352d0 = r0
            ai.m r1 = r6.f347Y
            ai.i r1 = r1.m160a(r5, r7)
        L29:
            r2 = 0
            if (r1 == 0) goto L53
            ai.j r3 = r1.f370Z
            int r3 = r3.mo158s0()
            if (r3 != r0) goto L36
            r3 = 1
            goto L37
        L36:
            r3 = 0
        L37:
            if (r3 == 0) goto L3c
            ai.d r3 = r4.f344d0
            goto L3e
        L3c:
            ai.d r3 = r4.f343c0
        L3e:
            boolean r1 = r3.m14426a(r1)
            if (r1 == 0) goto L45
            goto L53
        L45:
            java.util.concurrent.RejectedExecutionException r5 = new java.util.concurrent.RejectedExecutionException
            java.lang.String r6 = r4.f342b0
            java.lang.String r7 = " was terminated"
            java.lang.String r6 = p214m2.C4339q.m9711u(r6, r7)
            r5.<init>(r6)
            throw r5
        L53:
            if (r7 == 0) goto L58
            if (r6 == 0) goto L58
            goto L59
        L58:
            r0 = 0
        L59:
            ai.j r5 = r5.f370Z
            int r5 = r5.mo158s0()
            if (r5 != 0) goto L68
            if (r0 == 0) goto L64
            return
        L64:
            r4.m139R()
            goto L85
        L68:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = ai.ExecutorC0101a.f336g0
            r6 = 2097152(0x200000, double:1.036131E-317)
            long r5 = r5.addAndGet(r4, r6)
            if (r0 == 0) goto L74
            goto L85
        L74:
            boolean r7 = r4.m141V()
            if (r7 == 0) goto L7b
            goto L85
        L7b:
            boolean r5 = r4.m140S(r5)
            if (r5 == 0) goto L82
            goto L85
        L82:
            r4.m141V()
        L85:
            return
    }

    /* renamed from: n */
    public final int m146n(ai.ExecutorC0101a.a r2) {
            r1 = this;
        L0:
            java.lang.Object r2 = r2.m149c()
            zh.p r0 = ai.ExecutorC0101a.f338i0
            if (r2 != r0) goto La
            r2 = -1
            return r2
        La:
            if (r2 != 0) goto Le
            r2 = 0
            return r2
        Le:
            ai.a$a r2 = (ai.ExecutorC0101a.a) r2
            int r0 = r2.m148b()
            if (r0 == 0) goto L0
            return r0
    }

    public java.lang.String toString() {
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.concurrent.atomic.AtomicReferenceArray<ai.a$a> r1 = r12.f345e0
            int r1 = r1.length()
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            if (r2 >= r1) goto L78
            r8 = 1
        L14:
            int r9 = r8 + 1
            java.util.concurrent.atomic.AtomicReferenceArray<ai.a$a> r10 = r12.f345e0
            java.lang.Object r8 = r10.get(r8)
            ai.a$a r8 = (ai.ExecutorC0101a.a) r8
            if (r8 != 0) goto L21
            goto L73
        L21:
            ai.m r10 = r8.f347Y
            int r10 = r10.m163d()
            int r8 = r8.f348Z
            int r8 = p365v.C6480g.m13148b(r8)
            if (r8 == 0) goto L5d
            if (r8 == r2) goto L50
            r11 = 2
            if (r8 == r11) goto L4d
            r11 = 3
            if (r8 == r11) goto L3e
            r10 = 4
            if (r8 == r10) goto L3b
            goto L73
        L3b:
            int r7 = r7 + 1
            goto L73
        L3e:
            int r6 = r6 + 1
            if (r10 <= 0) goto L73
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r10)
            r10 = 100
            goto L69
        L4d:
            int r5 = r5 + 1
            goto L73
        L50:
            int r4 = r4 + 1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r10)
            r10 = 98
            goto L69
        L5d:
            int r3 = r3 + 1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r10)
            r10 = 99
        L69:
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r0.add(r8)
        L73:
            if (r9 < r1) goto L76
            goto L78
        L76:
            r8 = r9
            goto L14
        L78:
            long r1 = r12.controlState
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r12.f342b0
            r8.append(r9)
            r9 = 64
            r8.append(r9)
            java.lang.String r9 = gh.C2390b.m6121k(r12)
            r8.append(r9)
            java.lang.String r9 = "[Pool Size {core = "
            r8.append(r9)
            int r9 = r12.f339Y
            r8.append(r9)
            java.lang.String r9 = ", max = "
            r8.append(r9)
            int r9 = r12.f340Z
            r8.append(r9)
            java.lang.String r9 = "}, Worker States {CPU = "
            r8.append(r9)
            r8.append(r3)
            java.lang.String r3 = ", blocking = "
            r8.append(r3)
            r8.append(r4)
            java.lang.String r3 = ", parked = "
            r8.append(r3)
            r8.append(r5)
            java.lang.String r3 = ", dormant = "
            r8.append(r3)
            r8.append(r6)
            java.lang.String r3 = ", terminated = "
            r8.append(r3)
            r8.append(r7)
            java.lang.String r3 = "}, running workers queues = "
            r8.append(r3)
            r8.append(r0)
            java.lang.String r0 = ", global CPU queue size = "
            r8.append(r0)
            ai.d r0 = r12.f343c0
            int r0 = r0.m14428c()
            r8.append(r0)
            java.lang.String r0 = ", global blocking queue size = "
            r8.append(r0)
            ai.d r0 = r12.f344d0
            int r0 = r0.m14428c()
            r8.append(r0)
            java.lang.String r0 = ", Control State {created workers= "
            r8.append(r0)
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r1
            int r0 = (int) r3
            r8.append(r0)
            java.lang.String r0 = ", blocking tasks = "
            r8.append(r0)
            r3 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r3 = r3 & r1
            r0 = 21
            long r3 = r3 >> r0
            int r0 = (int) r3
            r8.append(r0)
            java.lang.String r0 = ", CPUs acquired = "
            r8.append(r0)
            int r0 = r12.f339Y
            r3 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r1 = r1 & r3
            r3 = 42
            long r1 = r1 >> r3
            int r2 = (int) r1
            int r0 = r0 - r2
            r8.append(r0)
            java.lang.String r0 = "}]"
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            return r0
    }
}
