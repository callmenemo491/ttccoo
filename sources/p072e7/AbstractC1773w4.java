package p072e7;

/* renamed from: e7.w4 */
/* loaded from: classes.dex */
public abstract class AbstractC1773w4<V> extends p072e7.AbstractC1791y4 implements com.google.common.util.concurrent.ListenableFuture<V> {

    /* renamed from: b0 */
    public static final boolean f7828b0 = false;

    /* renamed from: c0 */
    public static final java.util.logging.Logger f7829c0 = null;

    /* renamed from: d0 */
    public static final p072e7.AbstractC1677m4 f7830d0 = null;

    /* renamed from: e0 */
    public static final java.lang.Object f7831e0 = null;

    /* renamed from: Y */
    public volatile java.lang.Object f7832Y;

    /* renamed from: Z */
    public volatile p072e7.C1707p4 f7833Z;

    /* renamed from: a0 */
    public volatile p072e7.C1764v4 f7834a0;

    static {
            java.lang.Class<e7.v4> r0 = p072e7.C1764v4.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> Lf
            boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> Lf
            goto L10
        Lf:
            r1 = 0
        L10:
            p072e7.AbstractC1773w4.f7828b0 = r1
            java.lang.Class<e7.w4> r1 = p072e7.AbstractC1773w4.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            p072e7.AbstractC1773w4.f7829c0 = r1
            r1 = 0
            e7.u4 r2 = new e7.u4     // Catch: java.lang.Throwable -> L27
            r2.<init>()     // Catch: java.lang.Throwable -> L27
            r5 = r1
            r8 = r5
            goto L66
        L27:
            r2 = move-exception
            e7.q4 r9 = new e7.q4     // Catch: java.lang.Throwable -> L5c
            java.lang.Class<java.lang.Thread> r3 = java.lang.Thread.class
            java.lang.String r4 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r3, r4)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r3)     // Catch: java.lang.Throwable -> L5c
            java.lang.Class<e7.w4> r3 = p072e7.AbstractC1773w4.class
            java.lang.String r6 = "a0"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r0, r6)     // Catch: java.lang.Throwable -> L5c
            java.lang.Class<e7.w4> r0 = p072e7.AbstractC1773w4.class
            java.lang.Class<e7.p4> r3 = p072e7.C1707p4.class
            java.lang.String r7 = "Z"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r3, r7)     // Catch: java.lang.Throwable -> L5c
            java.lang.Class<e7.w4> r0 = p072e7.AbstractC1773w4.class
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            java.lang.String r8 = "Y"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r3, r8)     // Catch: java.lang.Throwable -> L5c
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5c
            r8 = r1
            r5 = r2
            r2 = r9
            goto L66
        L5c:
            r0 = move-exception
            r1 = r0
            e7.s4 r0 = new e7.s4
            r0.<init>()
            r8 = r1
            r5 = r2
            r2 = r0
        L66:
            p072e7.AbstractC1773w4.f7830d0 = r2
            if (r8 == 0) goto L86
            java.util.logging.Logger r6 = p072e7.AbstractC1773w4.f7829c0
            java.util.logging.Level r7 = java.util.logging.Level.SEVERE
            java.lang.String r2 = "com.google.common.util.concurrent.AbstractFuture"
            java.lang.String r3 = "<clinit>"
            java.lang.String r4 = "UnsafeAtomicHelper is broken!"
            r0 = r6
            r1 = r7
            r0.logp(r1, r2, r3, r4, r5)
            java.lang.String r5 = "com.google.common.util.concurrent.AbstractFuture"
            java.lang.String r0 = "<clinit>"
            java.lang.String r1 = "SafeAtomicHelper is broken!"
            r3 = r6
            r4 = r7
            r6 = r0
            r7 = r1
            r3.logp(r4, r5, r6, r7, r8)
        L86:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p072e7.AbstractC1773w4.f7831e0 = r0
            return
    }

    public AbstractC1773w4() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static <V> V m4472a(java.util.concurrent.Future<V> r2) {
            r0 = 0
        L1:
            r1 = r2
            e7.w4 r1 = (p072e7.AbstractC1773w4) r1     // Catch: java.lang.Throwable -> L12 java.lang.InterruptedException -> L1e
            java.lang.Object r2 = r1.get()     // Catch: java.lang.Throwable -> L12 java.lang.InterruptedException -> L1e
            if (r0 == 0) goto L11
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L11:
            return r2
        L12:
            r2 = move-exception
            if (r0 != 0) goto L16
            goto L1d
        L16:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L1d:
            throw r2
        L1e:
            r0 = 1
            goto L1
    }

    /* renamed from: c */
    public static void m4473c(p072e7.AbstractC1773w4<?> r4) {
        L0:
            e7.v4 r0 = r4.f7834a0
            e7.m4 r1 = p072e7.AbstractC1773w4.f7830d0
            e7.v4 r2 = p072e7.C1764v4.f7812c
            boolean r1 = r1.mo4339e(r4, r0, r2)
            if (r1 == 0) goto L0
        Lc:
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.Thread r2 = r0.f7813a
            if (r2 == 0) goto L18
            r0.f7813a = r1
            java.util.concurrent.locks.LockSupport.unpark(r2)
        L18:
            e7.v4 r0 = r0.f7814b
            goto Lc
        L1b:
            e7.p4 r0 = r4.f7833Z
            e7.m4 r2 = p072e7.AbstractC1773w4.f7830d0
            e7.p4 r3 = p072e7.C1707p4.f7732d
            boolean r2 = r2.mo4337c(r4, r0, r3)
            if (r2 == 0) goto L1b
            r4 = r1
        L28:
            if (r0 == 0) goto L31
            e7.p4 r2 = r0.f7735c
            r0.f7735c = r4
            r4 = r0
            r0 = r2
            goto L28
        L31:
            if (r4 == 0) goto L4b
            e7.p4 r0 = r4.f7735c
            java.lang.Runnable r2 = r4.f7733a
            java.util.Objects.requireNonNull(r2)
            boolean r3 = r2 instanceof p072e7.RunnableC1727r4
            if (r3 != 0) goto L48
            java.util.concurrent.Executor r4 = r4.f7734b
            java.util.Objects.requireNonNull(r4)
            m4474d(r2, r4)
            r4 = r0
            goto L31
        L48:
            e7.r4 r2 = (p072e7.RunnableC1727r4) r2
            throw r1
        L4b:
            return
    }

    /* renamed from: d */
    public static void m4474d(java.lang.Runnable r6, java.util.concurrent.Executor r7) {
            r7.execute(r6)     // Catch: java.lang.RuntimeException -> L4
            return
        L4:
            r5 = move-exception
            java.util.logging.Logger r0 = p072e7.AbstractC1773w4.f7829c0
            java.util.logging.Level r1 = java.util.logging.Level.SEVERE
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r2 = r6.length()
            int r3 = r7.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 57
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = "RuntimeException while executing runnable "
            r4.append(r2)
            r4.append(r6)
            java.lang.String r6 = " with executor "
            r4.append(r6)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            java.lang.String r2 = "com.google.common.util.concurrent.AbstractFuture"
            java.lang.String r3 = "executeListener"
            r0.logp(r1, r2, r3, r4, r5)
            return
    }

    /* renamed from: f */
    public static final V m4475f(java.lang.Object r2) {
            boolean r0 = r2 instanceof p072e7.C1687n4
            if (r0 != 0) goto L18
            boolean r0 = r2 instanceof p072e7.C1697o4
            if (r0 != 0) goto Le
            java.lang.Object r0 = p072e7.AbstractC1773w4.f7831e0
            if (r2 != r0) goto Ld
            r2 = 0
        Ld:
            return r2
        Le:
            java.util.concurrent.ExecutionException r0 = new java.util.concurrent.ExecutionException
            e7.o4 r2 = (p072e7.C1697o4) r2
            java.lang.Throwable r2 = r2.f7713a
            r0.<init>(r2)
            throw r0
        L18:
            e7.n4 r2 = (p072e7.C1687n4) r2
            java.lang.Throwable r2 = r2.f7699b
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "Task was cancelled."
            r0.<init>(r1)
            r0.initCause(r2)
            throw r0
    }

    /* renamed from: b */
    public final void m4476b(java.lang.StringBuilder r4) {
            r3 = this;
            java.lang.String r0 = "]"
            java.lang.Object r1 = m4472a(r3)     // Catch: java.lang.RuntimeException -> L34 java.util.concurrent.CancellationException -> L44 java.util.concurrent.ExecutionException -> L47
            java.lang.String r2 = "SUCCESS, result=["
            r4.append(r2)     // Catch: java.lang.RuntimeException -> L34 java.util.concurrent.CancellationException -> L44 java.util.concurrent.ExecutionException -> L47
            if (r1 != 0) goto L10
            java.lang.String r1 = "null"
            goto L2d
        L10:
            if (r1 != r3) goto L15
            java.lang.String r1 = "this future"
            goto L2d
        L15:
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.RuntimeException -> L34 java.util.concurrent.CancellationException -> L44 java.util.concurrent.ExecutionException -> L47
            java.lang.String r2 = r2.getName()     // Catch: java.lang.RuntimeException -> L34 java.util.concurrent.CancellationException -> L44 java.util.concurrent.ExecutionException -> L47
            r4.append(r2)     // Catch: java.lang.RuntimeException -> L34 java.util.concurrent.CancellationException -> L44 java.util.concurrent.ExecutionException -> L47
            java.lang.String r2 = "@"
            r4.append(r2)     // Catch: java.lang.RuntimeException -> L34 java.util.concurrent.CancellationException -> L44 java.util.concurrent.ExecutionException -> L47
            int r1 = java.lang.System.identityHashCode(r1)     // Catch: java.lang.RuntimeException -> L34 java.util.concurrent.CancellationException -> L44 java.util.concurrent.ExecutionException -> L47
            java.lang.String r1 = java.lang.Integer.toHexString(r1)     // Catch: java.lang.RuntimeException -> L34 java.util.concurrent.CancellationException -> L44 java.util.concurrent.ExecutionException -> L47
        L2d:
            r4.append(r1)     // Catch: java.lang.RuntimeException -> L34 java.util.concurrent.CancellationException -> L44 java.util.concurrent.ExecutionException -> L47
            r4.append(r0)     // Catch: java.lang.RuntimeException -> L34 java.util.concurrent.CancellationException -> L44 java.util.concurrent.ExecutionException -> L47
            return
        L34:
            r0 = move-exception
            java.lang.String r1 = "UNKNOWN, cause=["
            r4.append(r1)
            java.lang.Class r0 = r0.getClass()
            r4.append(r0)
            java.lang.String r0 = " thrown from get()]"
            goto L54
        L44:
            java.lang.String r0 = "CANCELLED"
            goto L54
        L47:
            r1 = move-exception
            java.lang.String r2 = "FAILURE, cause=["
            r4.append(r2)
            java.lang.Throwable r1 = r1.getCause()
            r4.append(r1)
        L54:
            r4.append(r0)
            return
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r7) {
            r6 = this;
            java.lang.Object r0 = r6.f7832Y
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            boolean r4 = r0 instanceof p072e7.RunnableC1727r4
            r3 = r3 | r4
            if (r3 == 0) goto L47
            boolean r3 = p072e7.AbstractC1773w4.f7828b0
            if (r3 == 0) goto L1f
            e7.n4 r3 = new e7.n4
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r7, r4)
            goto L2a
        L1f:
            if (r7 == 0) goto L24
            e7.n4 r7 = p072e7.C1687n4.f7696c
            goto L26
        L24:
            e7.n4 r7 = p072e7.C1687n4.f7697d
        L26:
            r3 = r7
            java.util.Objects.requireNonNull(r3)
        L2a:
            e7.m4 r7 = p072e7.AbstractC1773w4.f7830d0
            boolean r7 = r7.mo4338d(r6, r0, r3)
            if (r7 == 0) goto L41
            m4473c(r6)
            boolean r7 = r0 instanceof p072e7.RunnableC1727r4
            if (r7 != 0) goto L3a
            goto L48
        L3a:
            e7.r4 r0 = (p072e7.RunnableC1727r4) r0
            java.util.Objects.requireNonNull(r0)
            r7 = 0
            throw r7
        L41:
            java.lang.Object r0 = r6.f7832Y
            boolean r7 = r0 instanceof p072e7.RunnableC1727r4
            if (r7 != 0) goto L2a
        L47:
            r1 = 0
        L48:
            return r1
    }

    /* renamed from: e */
    public final void m4477e(p072e7.C1764v4 r5) {
            r4 = this;
            r0 = 0
            r5.f7813a = r0
        L3:
            e7.v4 r5 = r4.f7834a0
            e7.v4 r1 = p072e7.C1764v4.f7812c
            if (r5 == r1) goto L28
            r1 = r0
        La:
            if (r5 == 0) goto L28
            e7.v4 r2 = r5.f7814b
            java.lang.Thread r3 = r5.f7813a
            if (r3 == 0) goto L14
            r1 = r5
            goto L26
        L14:
            if (r1 == 0) goto L1d
            r1.f7814b = r2
            java.lang.Thread r5 = r1.f7813a
            if (r5 != 0) goto L26
            goto L3
        L1d:
            e7.m4 r3 = p072e7.AbstractC1773w4.f7830d0
            boolean r5 = r3.mo4339e(r4, r5, r2)
            if (r5 != 0) goto L26
            goto L3
        L26:
            r5 = r2
            goto La
        L28:
            return
    }

    @Override // java.util.concurrent.Future
    public final V get() {
            r6 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L64
            java.lang.Object r0 = r6.f7832Y
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            boolean r4 = r0 instanceof p072e7.RunnableC1727r4
            r4 = r4 ^ r2
            r3 = r3 & r4
            if (r3 == 0) goto L1a
            java.lang.Object r0 = m4475f(r0)
            return r0
        L1a:
            e7.v4 r0 = r6.f7834a0
            e7.v4 r3 = p072e7.C1764v4.f7812c
            if (r0 == r3) goto L5a
            e7.v4 r3 = new e7.v4
            r3.<init>()
        L25:
            e7.m4 r4 = p072e7.AbstractC1773w4.f7830d0
            r4.mo4335a(r3, r0)
            boolean r0 = r4.mo4339e(r6, r0, r3)
            if (r0 == 0) goto L54
        L30:
            java.util.concurrent.locks.LockSupport.park(r6)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L4b
            java.lang.Object r0 = r6.f7832Y
            if (r0 == 0) goto L3f
            r4 = 1
            goto L40
        L3f:
            r4 = 0
        L40:
            boolean r5 = r0 instanceof p072e7.RunnableC1727r4
            r5 = r5 ^ r2
            r4 = r4 & r5
            if (r4 == 0) goto L30
            java.lang.Object r0 = m4475f(r0)
            return r0
        L4b:
            r6.m4477e(r3)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L54:
            e7.v4 r0 = r6.f7834a0
            e7.v4 r4 = p072e7.C1764v4.f7812c
            if (r0 != r4) goto L25
        L5a:
            java.lang.Object r0 = r6.f7832Y
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r0 = m4475f(r0)
            return r0
        L64:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
    }

    @Override // java.util.concurrent.Future
    public final V get(long r13, java.util.concurrent.TimeUnit r15) {
            r12 = this;
            long r0 = r15.toNanos(r13)
            boolean r2 = java.lang.Thread.interrupted()
            if (r2 != 0) goto L1b3
            java.lang.Object r2 = r12.f7832Y
            if (r2 == 0) goto L10
            r3 = 1
            goto L11
        L10:
            r3 = 0
        L11:
            boolean r4 = r2 instanceof p072e7.RunnableC1727r4
            r4 = r4 ^ 1
            r3 = r3 & r4
            if (r3 == 0) goto L1d
            java.lang.Object r13 = m4475f(r2)
            return r13
        L1d:
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L29
            long r4 = java.lang.System.nanoTime()
            long r4 = r4 + r0
            goto L2a
        L29:
            r4 = r2
        L2a:
            r6 = 1000(0x3e8, double:4.94E-321)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 < 0) goto L92
            e7.v4 r8 = r12.f7834a0
            e7.v4 r9 = p072e7.C1764v4.f7812c
            if (r8 == r9) goto L88
            e7.v4 r9 = new e7.v4
            r9.<init>()
        L3b:
            e7.m4 r10 = p072e7.AbstractC1773w4.f7830d0
            r10.mo4335a(r9, r8)
            boolean r8 = r10.mo4339e(r12, r8, r9)
            if (r8 == 0) goto L82
        L46:
            r10 = 2147483647999999999(0x1dcd64ffffffffff, double:3.98785104510193E-165)
            long r0 = java.lang.Math.min(r0, r10)
            java.util.concurrent.locks.LockSupport.parkNanos(r12, r0)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L79
            java.lang.Object r0 = r12.f7832Y
            if (r0 == 0) goto L5e
            r1 = 1
            goto L5f
        L5e:
            r1 = 0
        L5f:
            boolean r8 = r0 instanceof p072e7.RunnableC1727r4
            r8 = r8 ^ 1
            r1 = r1 & r8
            if (r1 == 0) goto L6b
            java.lang.Object r13 = m4475f(r0)
            return r13
        L6b:
            long r0 = java.lang.System.nanoTime()
            long r0 = r4 - r0
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 >= 0) goto L46
            r12.m4477e(r9)
            goto L92
        L79:
            r12.m4477e(r9)
            java.lang.InterruptedException r13 = new java.lang.InterruptedException
            r13.<init>()
            throw r13
        L82:
            e7.v4 r8 = r12.f7834a0
            e7.v4 r10 = p072e7.C1764v4.f7812c
            if (r8 != r10) goto L3b
        L88:
            java.lang.Object r13 = r12.f7832Y
            java.util.Objects.requireNonNull(r13)
            java.lang.Object r13 = m4475f(r13)
            return r13
        L92:
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 <= 0) goto Lbc
            java.lang.Object r0 = r12.f7832Y
            if (r0 == 0) goto L9c
            r1 = 1
            goto L9d
        L9c:
            r1 = 0
        L9d:
            boolean r8 = r0 instanceof p072e7.RunnableC1727r4
            r8 = r8 ^ 1
            r1 = r1 & r8
            if (r1 == 0) goto La9
            java.lang.Object r13 = m4475f(r0)
            return r13
        La9:
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto Lb6
            long r0 = java.lang.System.nanoTime()
            long r0 = r4 - r0
            goto L92
        Lb6:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException
            r13.<init>()
            throw r13
        Lbc:
            java.lang.String r4 = r12.toString()
            java.lang.String r5 = r15.toString()
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r8)
            java.lang.String r9 = r15.toString()
            java.lang.String r8 = r9.toLowerCase(r8)
            java.lang.String r9 = java.lang.String.valueOf(r8)
            int r9 = r9.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r9 = r9 + 28
            r10.<init>(r9)
            java.lang.String r9 = "Waited "
            r10.append(r9)
            r10.append(r13)
            java.lang.String r13 = " "
            r10.append(r13)
            r10.append(r8)
            java.lang.String r14 = r10.toString()
            long r8 = r0 + r6
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 >= 0) goto L17d
            java.lang.String r8 = " (plus "
            java.lang.String r14 = r14.concat(r8)
            long r0 = -r0
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r8 = r15.convert(r0, r8)
            long r10 = r15.toNanos(r8)
            long r0 = r0 - r10
            int r15 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r15 == 0) goto L118
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L116
            goto L118
        L116:
            r2 = 0
            goto L119
        L118:
            r2 = 1
        L119:
            if (r15 <= 0) goto L153
            java.lang.String r14 = java.lang.String.valueOf(r14)
            int r15 = r14.length()
            java.lang.String r3 = java.lang.String.valueOf(r5)
            int r3 = r3.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r15 = r15 + 21
            int r15 = r15 + r3
            r6.<init>(r15)
            r6.append(r14)
            r6.append(r8)
            r6.append(r13)
            r6.append(r5)
            java.lang.String r14 = r6.toString()
            if (r2 == 0) goto L14b
            java.lang.String r15 = ","
            java.lang.String r14 = r14.concat(r15)
        L14b:
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r14 = r14.concat(r13)
        L153:
            if (r2 == 0) goto L173
            java.lang.String r13 = java.lang.String.valueOf(r14)
            int r14 = r13.length()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            int r14 = r14 + 33
            r15.<init>(r14)
            r15.append(r13)
            r15.append(r0)
            java.lang.String r13 = " nanoseconds "
            r15.append(r13)
            java.lang.String r14 = r15.toString()
        L173:
            java.lang.String r13 = java.lang.String.valueOf(r14)
            java.lang.String r14 = "delay)"
            java.lang.String r14 = r13.concat(r14)
        L17d:
            boolean r13 = r12.isDone()
            if (r13 == 0) goto L193
            java.util.concurrent.TimeoutException r13 = new java.util.concurrent.TimeoutException
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r15 = " but future completed as timeout expired"
            java.lang.String r14 = r14.concat(r15)
            r13.<init>(r14)
            throw r13
        L193:
            java.util.concurrent.TimeoutException r13 = new java.util.concurrent.TimeoutException
            java.lang.String r15 = java.lang.String.valueOf(r14)
            int r15 = r15.length()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r15 = r15 + 5
            int r1 = r4.length()
            int r1 = r1 + r15
            r0.<init>(r1)
            java.lang.String r15 = " for "
            java.lang.String r14 = p083f.C1932s.m4774a(r0, r14, r15, r4)
            r13.<init>(r14)
            throw r13
        L1b3:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException
            r13.<init>()
            throw r13
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
            r1 = this;
            java.lang.Object r0 = r1.f7832Y
            boolean r0 = r0 instanceof p072e7.C1687n4
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
            r3 = this;
            java.lang.Object r0 = r3.f7832Y
            r1 = 1
            if (r0 == 0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            boolean r0 = r0 instanceof p072e7.RunnableC1727r4
            r0 = r0 ^ r1
            r0 = r0 & r2
            return r0
    }

    public final java.lang.String toString() {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r9.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L1e
            java.lang.Class r1 = r9.getClass()
            java.lang.String r1 = r1.getSimpleName()
            goto L26
        L1e:
            java.lang.Class r1 = r9.getClass()
            java.lang.String r1 = r1.getName()
        L26:
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r9)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            java.lang.Object r1 = r9.f7832Y
            boolean r1 = r1 instanceof p072e7.C1687n4
            java.lang.String r2 = "]"
            if (r1 == 0) goto L4d
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto Le6
        L4d:
            boolean r1 = r9.isDone()
            if (r1 == 0) goto L58
            r9.m4476b(r0)
            goto Le6
        L58:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r9.f7832Y
            boolean r4 = r3 instanceof p072e7.RunnableC1727r4
            java.lang.String r5 = "Exception thrown from implementation: "
            r6 = 0
            if (r4 == 0) goto L86
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            e7.r4 r3 = (p072e7.RunnableC1727r4) r3
            java.util.Objects.requireNonNull(r3)
            r0.append(r6)     // Catch: java.lang.StackOverflowError -> L78 java.lang.RuntimeException -> L7a
            goto Ld3
        L78:
            r3 = move-exception
            goto L7b
        L7a:
            r3 = move-exception
        L7b:
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
            goto Ld3
        L86:
            boolean r3 = r9 instanceof java.util.concurrent.ScheduledFuture     // Catch: java.lang.StackOverflowError -> Lba java.lang.RuntimeException -> Lbc
            if (r3 == 0) goto Lac
            r3 = r9
            java.util.concurrent.ScheduledFuture r3 = (java.util.concurrent.ScheduledFuture) r3     // Catch: java.lang.StackOverflowError -> Lba java.lang.RuntimeException -> Lbc
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.StackOverflowError -> Lba java.lang.RuntimeException -> Lbc
            long r3 = r3.getDelay(r4)     // Catch: java.lang.StackOverflowError -> Lba java.lang.RuntimeException -> Lbc
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.StackOverflowError -> Lba java.lang.RuntimeException -> Lbc
            r8 = 41
            r7.<init>(r8)     // Catch: java.lang.StackOverflowError -> Lba java.lang.RuntimeException -> Lbc
            java.lang.String r8 = "remaining delay=["
            r7.append(r8)     // Catch: java.lang.StackOverflowError -> Lba java.lang.RuntimeException -> Lbc
            r7.append(r3)     // Catch: java.lang.StackOverflowError -> Lba java.lang.RuntimeException -> Lbc
            java.lang.String r3 = " ms]"
            r7.append(r3)     // Catch: java.lang.StackOverflowError -> Lba java.lang.RuntimeException -> Lbc
            java.lang.String r3 = r7.toString()     // Catch: java.lang.StackOverflowError -> Lba java.lang.RuntimeException -> Lbc
            goto Lad
        Lac:
            r3 = r6
        Lad:
            int r4 = p072e7.C1672m.f7688a     // Catch: java.lang.StackOverflowError -> Lba java.lang.RuntimeException -> Lbc
            if (r3 == 0) goto Lc9
            boolean r4 = r3.isEmpty()     // Catch: java.lang.StackOverflowError -> Lba java.lang.RuntimeException -> Lbc
            if (r4 == 0) goto Lb8
            goto Lc9
        Lb8:
            r6 = r3
            goto Lc9
        Lba:
            r3 = move-exception
            goto Lbd
        Lbc:
            r3 = move-exception
        Lbd:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r6 = r5.concat(r3)
        Lc9:
            if (r6 == 0) goto Ld6
            java.lang.String r3 = ", info=["
            r0.append(r3)
            r0.append(r6)
        Ld3:
            r0.append(r2)
        Ld6:
            boolean r3 = r9.isDone()
            if (r3 == 0) goto Le6
            int r3 = r0.length()
            r0.delete(r1, r3)
            r9.m4476b(r0)
        Le6:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
