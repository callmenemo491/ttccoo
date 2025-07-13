package p379vh;

/* renamed from: vh.p0 */
/* loaded from: classes.dex */
public abstract class AbstractC6728p0 extends p379vh.AbstractC6731q0 implements p379vh.InterfaceC6704h0 {

    /* renamed from: c0 */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f26016c0 = null;

    /* renamed from: d0 */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f26017d0 = null;
    private volatile /* synthetic */ java.lang.Object _delayed;
    private volatile /* synthetic */ int _isCompleted;
    private volatile /* synthetic */ java.lang.Object _queue;

    /* renamed from: vh.p0$a */
    public final class a extends p379vh.AbstractC6728p0.b {

        /* renamed from: b0 */
        public final p379vh.InterfaceC6703h<ch.C0985l> f26018b0;

        /* renamed from: c0 */
        public final /* synthetic */ p379vh.AbstractC6728p0 f26019c0;

        public a(p379vh.AbstractC6728p0 r1, long r2, p379vh.InterfaceC6703h<? super ch.C0985l> r4) {
                r0 = this;
                r0.f26019c0 = r1
                r0.<init>(r2)
                r0.f26018b0 = r4
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                vh.h<ch.l> r0 = r3.f26018b0
                vh.p0 r1 = r3.f26019c0
                ch.l r2 = ch.C0985l.f5061a
                r0.mo13612p(r1, r2)
                return
        }

        @Override // p379vh.AbstractC6728p0.b
        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = super.toString()
                vh.h<ch.l> r1 = r2.f26018b0
                java.lang.String r0 = p214m2.C4339q.m9711u(r0, r1)
                return r0
        }
    }

    /* renamed from: vh.p0$b */
    public static abstract class b implements java.lang.Runnable, java.lang.Comparable<p379vh.AbstractC6728p0.b>, p379vh.InterfaceC6719m0, p459zh.InterfaceC7354t {

        /* renamed from: Y */
        public long f26020Y;

        /* renamed from: Z */
        public java.lang.Object f26021Z;

        /* renamed from: a0 */
        public int f26022a0;

        public b(long r1) {
                r0 = this;
                r0.<init>()
                r0.f26020Y = r1
                r1 = -1
                r0.f26022a0 = r1
                return
        }

        @Override // java.lang.Comparable
        public int compareTo(p379vh.AbstractC6728p0.b r5) {
                r4 = this;
                vh.p0$b r5 = (p379vh.AbstractC6728p0.b) r5
                long r0 = r4.f26020Y
                long r2 = r5.f26020Y
                long r0 = r0 - r2
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 <= 0) goto Lf
                r5 = 1
                goto L14
            Lf:
                if (r5 >= 0) goto L13
                r5 = -1
                goto L14
            L13:
                r5 = 0
            L14:
                return r5
        }

        @Override // p459zh.InterfaceC7354t
        /* renamed from: e */
        public int mo13655e() {
                r1 = this;
                int r0 = r1.f26022a0
                return r0
        }

        @Override // p459zh.InterfaceC7354t
        /* renamed from: g */
        public void mo13656g(int r1) {
                r0 = this;
                r0.f26022a0 = r1
                return
        }

        @Override // p379vh.InterfaceC6719m0
        /* renamed from: h */
        public final synchronized void mo13570h() {
                r3 = this;
                monitor-enter(r3)
                java.lang.Object r0 = r3.f26021Z     // Catch: java.lang.Throwable -> L2b
                zh.p r1 = p379vh.C6734r0.f26026a     // Catch: java.lang.Throwable -> L2b
                if (r0 != r1) goto L9
                monitor-exit(r3)
                return
            L9:
                boolean r2 = r0 instanceof p379vh.AbstractC6728p0.c     // Catch: java.lang.Throwable -> L2b
                if (r2 == 0) goto L10
                vh.p0$c r0 = (p379vh.AbstractC6728p0.c) r0     // Catch: java.lang.Throwable -> L2b
                goto L11
            L10:
                r0 = 0
            L11:
                if (r0 != 0) goto L14
                goto L24
            L14:
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L2b
                zh.s r2 = r3.mo13657l()     // Catch: java.lang.Throwable -> L28
                if (r2 != 0) goto L1c
                goto L23
            L1c:
                int r2 = r3.mo13655e()     // Catch: java.lang.Throwable -> L28
                r0.m14441d(r2)     // Catch: java.lang.Throwable -> L28
            L23:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            L24:
                r3.f26021Z = r1     // Catch: java.lang.Throwable -> L2b
                monitor-exit(r3)
                return
            L28:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
                throw r1     // Catch: java.lang.Throwable -> L2b
            L2b:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
        }

        @Override // p459zh.InterfaceC7354t
        /* renamed from: l */
        public p459zh.C7353s<?> mo13657l() {
                r2 = this;
                java.lang.Object r0 = r2.f26021Z
                boolean r1 = r0 instanceof p459zh.C7353s
                if (r1 == 0) goto L9
                zh.s r0 = (p459zh.C7353s) r0
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Override // p459zh.InterfaceC7354t
        /* renamed from: o */
        public void mo13658o(p459zh.C7353s<?> r3) {
                r2 = this;
                java.lang.Object r0 = r2.f26021Z
                zh.p r1 = p379vh.C6734r0.f26026a
                if (r0 == r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                if (r0 == 0) goto Le
                r2.f26021Z = r3
                return
            Le:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Failed requirement."
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "Delayed[nanos="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                long r1 = r3.f26020Y
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: vh.p0$c */
    public static final class c extends p459zh.C7353s<p379vh.AbstractC6728p0.b> {

        /* renamed from: b */
        public long f26023b;

        public c(long r1) {
                r0 = this;
                r0.<init>()
                r0.f26023b = r1
                return
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class<vh.p0> r1 = p379vh.AbstractC6728p0.class
            java.lang.String r2 = "_queue"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            p379vh.AbstractC6728p0.f26016c0 = r2
            java.lang.String r2 = "_delayed"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            p379vh.AbstractC6728p0.f26017d0 = r0
            return
    }

    public AbstractC6728p0() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._queue = r0
            r1._delayed = r0
            r0 = 0
            r1._isCompleted = r0
            return
    }

    /* renamed from: G0 */
    public final void m13649G0(java.lang.Runnable r2) {
            r1 = this;
            boolean r0 = r1.m13650H0(r2)
            if (r0 == 0) goto L14
            java.lang.Thread r2 = r1.mo13561F0()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r0 == r2) goto L19
            java.util.concurrent.locks.LockSupport.unpark(r2)
            goto L19
        L14:
            vh.d0 r0 = p379vh.RunnableC6692d0.f25967e0
            r0.m13649G0(r2)
        L19:
            return
    }

    /* renamed from: H0 */
    public final boolean m13650H0(java.lang.Runnable r6) {
            r5 = this;
        L0:
            java.lang.Object r0 = r5._queue
            int r1 = r5._isCompleted
            r2 = 0
            if (r1 == 0) goto L8
            return r2
        L8:
            r1 = 1
            if (r0 != 0) goto L15
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p379vh.AbstractC6728p0.f26016c0
            r2 = 0
            boolean r0 = r0.compareAndSet(r5, r2, r6)
            if (r0 == 0) goto L0
            return r1
        L15:
            boolean r3 = r0 instanceof p459zh.C7345k
            if (r3 == 0) goto L34
            r3 = r0
            zh.k r3 = (p459zh.C7345k) r3
            int r4 = r3.m14430a(r6)
            if (r4 == 0) goto L33
            if (r4 == r1) goto L29
            r0 = 2
            if (r4 == r0) goto L28
            goto L0
        L28:
            return r2
        L29:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p379vh.AbstractC6728p0.f26016c0
            zh.k r2 = r3.m14434e()
            r1.compareAndSet(r5, r0, r2)
            goto L0
        L33:
            return r1
        L34:
            zh.p r3 = p379vh.C6734r0.f26027b
            if (r0 != r3) goto L39
            return r2
        L39:
            zh.k r2 = new zh.k
            r3 = 8
            r2.<init>(r3, r1)
            r3 = r0
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.m14430a(r3)
            r2.m14430a(r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = p379vh.AbstractC6728p0.f26016c0
            boolean r0 = r3.compareAndSet(r5, r0, r2)
            if (r0 == 0) goto L0
            return r1
    }

    /* renamed from: I0 */
    public boolean m13651I0() {
            r4 = this;
            w5.c r0 = r4.f26014b0
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L7
            goto Ld
        L7:
            int r3 = r0.f26409b
            int r0 = r0.f26410c
            if (r3 != r0) goto Lf
        Ld:
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 != 0) goto L13
            return r2
        L13:
            java.lang.Object r0 = r4._delayed
            vh.p0$c r0 = (p379vh.AbstractC6728p0.c) r0
            if (r0 == 0) goto L20
            boolean r0 = r0.m14440c()
            if (r0 != 0) goto L20
            return r2
        L20:
            java.lang.Object r0 = r4._queue
            if (r0 != 0) goto L25
            goto L36
        L25:
            boolean r3 = r0 instanceof p459zh.C7345k
            if (r3 == 0) goto L30
            zh.k r0 = (p459zh.C7345k) r0
            boolean r1 = r0.m14433d()
            goto L36
        L30:
            zh.p r3 = p379vh.C6734r0.f26027b
            if (r0 != r3) goto L35
            goto L36
        L35:
            r1 = 0
        L36:
            return r1
    }

    /* renamed from: J0 */
    public long m13652J0() {
            r12 = this;
            boolean r0 = r12.m13647E0()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.Object r0 = r12._delayed
            vh.p0$c r0 = (p379vh.AbstractC6728p0.c) r0
            r3 = 1
            r4 = 0
            r5 = 0
            if (r0 == 0) goto L4c
            boolean r6 = r0.m14440c()
            if (r6 != 0) goto L4c
            long r6 = java.lang.System.nanoTime()
        L1c:
            monitor-enter(r0)
            zh.t r8 = r0.m14439b()     // Catch: java.lang.Throwable -> L49
            if (r8 != 0) goto L26
            monitor-exit(r0)
            r8 = r5
            goto L44
        L26:
            vh.p0$b r8 = (p379vh.AbstractC6728p0.b) r8     // Catch: java.lang.Throwable -> L49
            long r9 = r8.f26020Y     // Catch: java.lang.Throwable -> L49
            long r9 = r6 - r9
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 < 0) goto L32
            r9 = 1
            goto L33
        L32:
            r9 = 0
        L33:
            if (r9 == 0) goto L3a
            boolean r8 = r12.m13650H0(r8)     // Catch: java.lang.Throwable -> L49
            goto L3b
        L3a:
            r8 = 0
        L3b:
            if (r8 == 0) goto L42
            zh.t r8 = r0.m14441d(r4)     // Catch: java.lang.Throwable -> L49
            goto L43
        L42:
            r8 = r5
        L43:
            monitor-exit(r0)
        L44:
            vh.p0$b r8 = (p379vh.AbstractC6728p0.b) r8
            if (r8 != 0) goto L1c
            goto L4c
        L49:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L4c:
            java.lang.Object r0 = r12._queue
            if (r0 != 0) goto L52
        L50:
            r7 = r5
            goto L7e
        L52:
            boolean r6 = r0 instanceof p459zh.C7345k
            if (r6 == 0) goto L6e
            r6 = r0
            zh.k r6 = (p459zh.C7345k) r6
            java.lang.Object r7 = r6.m14435f()
            zh.p r8 = p459zh.C7345k.f28100g
            if (r7 == r8) goto L64
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L7e
        L64:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = p379vh.AbstractC6728p0.f26016c0
            zh.k r6 = r6.m14434e()
            r7.compareAndSet(r12, r0, r6)
            goto L4c
        L6e:
            zh.p r6 = p379vh.C6734r0.f26027b
            if (r0 != r6) goto L73
            goto L50
        L73:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = p379vh.AbstractC6728p0.f26016c0
            boolean r6 = r6.compareAndSet(r12, r0, r5)
            if (r6 == 0) goto L4c
            r7 = r0
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L7e:
            if (r7 == 0) goto L84
            r7.run()
            return r1
        L84:
            w5.c r0 = r12.f26014b0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto L8e
            goto L98
        L8e:
            int r8 = r0.f26409b
            int r0 = r0.f26410c
            if (r8 != r0) goto L95
            goto L96
        L95:
            r3 = 0
        L96:
            if (r3 == 0) goto L9a
        L98:
            r3 = r6
            goto L9b
        L9a:
            r3 = r1
        L9b:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto La0
            goto Ldb
        La0:
            java.lang.Object r0 = r12._queue
            if (r0 != 0) goto La5
            goto Lb2
        La5:
            boolean r3 = r0 instanceof p459zh.C7345k
            if (r3 == 0) goto Ld6
            zh.k r0 = (p459zh.C7345k) r0
            boolean r0 = r0.m14433d()
            if (r0 != 0) goto Lb2
            goto Ldb
        Lb2:
            java.lang.Object r0 = r12._delayed
            vh.p0$c r0 = (p379vh.AbstractC6728p0.c) r0
            if (r0 != 0) goto Lb9
            goto Lc2
        Lb9:
            monitor-enter(r0)
            zh.t r3 = r0.m14439b()     // Catch: java.lang.Throwable -> Ld3
            monitor-exit(r0)
            r5 = r3
            vh.p0$b r5 = (p379vh.AbstractC6728p0.b) r5
        Lc2:
            if (r5 != 0) goto Lc5
            goto Lda
        Lc5:
            long r3 = r5.f26020Y
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto Ld1
            goto Ldb
        Ld1:
            r1 = r3
            goto Ldb
        Ld3:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        Ld6:
            zh.p r3 = p379vh.C6734r0.f26027b
            if (r0 != r3) goto Ldb
        Lda:
            r1 = r6
        Ldb:
            return r1
    }

    /* renamed from: K0 */
    public final void m13653K0() {
            r1 = this;
            r0 = 0
            r1._queue = r0
            r1._delayed = r0
            return
    }

    /* renamed from: L0 */
    public final void m13654L0(long r13, p379vh.AbstractC6728p0.b r15) {
            r12 = this;
            int r0 = r12._isCompleted
            r1 = 2
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == 0) goto La
            r0 = 1
            goto L62
        La:
            java.lang.Object r0 = r12._delayed
            vh.p0$c r0 = (p379vh.AbstractC6728p0.c) r0
            if (r0 != 0) goto L21
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p379vh.AbstractC6728p0.f26017d0
            vh.p0$c r5 = new vh.p0$c
            r5.<init>(r13)
            r0.compareAndSet(r12, r4, r5)
            java.lang.Object r0 = r12._delayed
            p214m2.C4339q.m9704i(r0)
            vh.p0$c r0 = (p379vh.AbstractC6728p0.c) r0
        L21:
            monitor-enter(r15)
            java.lang.Object r5 = r15.f26021Z     // Catch: java.lang.Throwable -> La4
            zh.p r6 = p379vh.C6734r0.f26026a     // Catch: java.lang.Throwable -> La4
            if (r5 != r6) goto L2a
            r0 = 2
            goto L61
        L2a:
            monitor-enter(r0)     // Catch: java.lang.Throwable -> La4
            zh.t r5 = r0.m14439b()     // Catch: java.lang.Throwable -> La1
            vh.p0$b r5 = (p379vh.AbstractC6728p0.b) r5     // Catch: java.lang.Throwable -> La1
            int r6 = r12._isCompleted     // Catch: java.lang.Throwable -> La1
            if (r6 == 0) goto L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La4
            r0 = 1
            goto L61
        L38:
            r6 = 0
            if (r5 != 0) goto L3e
            r8 = r13
            goto L4f
        L3e:
            long r8 = r5.f26020Y     // Catch: java.lang.Throwable -> La1
            long r10 = r8 - r13
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 < 0) goto L47
            r8 = r13
        L47:
            long r10 = r0.f26023b     // Catch: java.lang.Throwable -> La1
            long r10 = r8 - r10
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 <= 0) goto L51
        L4f:
            r0.f26023b = r8     // Catch: java.lang.Throwable -> La1
        L51:
            long r8 = r15.f26020Y     // Catch: java.lang.Throwable -> La1
            long r10 = r0.f26023b     // Catch: java.lang.Throwable -> La1
            long r8 = r8 - r10
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 >= 0) goto L5c
            r15.f26020Y = r10     // Catch: java.lang.Throwable -> La1
        L5c:
            r0.m14438a(r15)     // Catch: java.lang.Throwable -> La1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La4
            r0 = 0
        L61:
            monitor-exit(r15)
        L62:
            if (r0 == 0) goto L7b
            if (r0 == r3) goto L75
            if (r0 != r1) goto L69
            goto L9d
        L69:
            java.lang.String r13 = "unexpected result"
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
        L75:
            vh.d0 r0 = p379vh.RunnableC6692d0.f25967e0
            r0.m13654L0(r13, r15)
            goto L9d
        L7b:
            java.lang.Object r13 = r12._delayed
            vh.p0$c r13 = (p379vh.AbstractC6728p0.c) r13
            if (r13 != 0) goto L82
            goto L8b
        L82:
            monitor-enter(r13)
            zh.t r14 = r13.m14439b()     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r13)
            r4 = r14
            vh.p0$b r4 = (p379vh.AbstractC6728p0.b) r4
        L8b:
            if (r4 != r15) goto L8e
            r2 = 1
        L8e:
            if (r2 == 0) goto L9d
            java.lang.Thread r13 = r12.mo13561F0()
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            if (r14 == r13) goto L9d
            java.util.concurrent.locks.LockSupport.unpark(r13)
        L9d:
            return
        L9e:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        La1:
            r13 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La4
            throw r13     // Catch: java.lang.Throwable -> La4
        La4:
            r13 = move-exception
            monitor-exit(r15)
            throw r13
    }

    @Override // p379vh.InterfaceC6704h0
    /* renamed from: b0 */
    public void mo13615b0(long r4, p379vh.InterfaceC6703h<? super ch.C0985l> r6) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            goto L1b
        L7:
            r0 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L16
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L1b
        L16:
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r4
        L1b:
            r4 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L39
            long r4 = java.lang.System.nanoTime()
            vh.p0$a r2 = new vh.p0$a
            long r0 = r0 + r4
            r2.<init>(r3, r0, r6)
            vh.e r0 = new vh.e
            r0.<init>(r2)
            r6.mo13609d(r0)
            r3.m13654L0(r4, r2)
        L39:
            return
    }

    @Override // p379vh.AbstractC6725o0
    public void shutdown() {
            r6 = this;
            vh.s1 r0 = p379vh.C6738s1.f26034a
            java.lang.ThreadLocal<vh.o0> r0 = p379vh.C6738s1.f26035b
            r1 = 0
            r0.set(r1)
            r0 = 1
            r6._isCompleted = r0
        Lb:
            java.lang.Object r2 = r6._queue
            if (r2 != 0) goto L1a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = p379vh.AbstractC6728p0.f26016c0
            zh.p r3 = p379vh.C6734r0.f26027b
            boolean r2 = r2.compareAndSet(r6, r1, r3)
            if (r2 == 0) goto Lb
            goto L3e
        L1a:
            boolean r3 = r2 instanceof p459zh.C7345k
            if (r3 == 0) goto L24
            zh.k r2 = (p459zh.C7345k) r2
            r2.m14431b()
            goto L3e
        L24:
            zh.p r3 = p379vh.C6734r0.f26027b
            if (r2 != r3) goto L29
            goto L3e
        L29:
            zh.k r3 = new zh.k
            r4 = 8
            r3.<init>(r4, r0)
            r4 = r2
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.m14430a(r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = p379vh.AbstractC6728p0.f26016c0
            boolean r2 = r4.compareAndSet(r6, r2, r3)
            if (r2 == 0) goto Lb
        L3e:
            long r2 = r6.m13652J0()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L49
            goto L3e
        L49:
            long r2 = java.lang.System.nanoTime()
        L4d:
            java.lang.Object r0 = r6._delayed
            vh.p0$c r0 = (p379vh.AbstractC6728p0.c) r0
            if (r0 != 0) goto L55
            r0 = r1
            goto L5b
        L55:
            zh.t r0 = r0.m14442e()
            vh.p0$b r0 = (p379vh.AbstractC6728p0.b) r0
        L5b:
            if (r0 != 0) goto L5e
            return
        L5e:
            vh.d0 r4 = p379vh.RunnableC6692d0.f25967e0
            r4.m13654L0(r2, r0)
            goto L4d
    }

    @Override // p379vh.AbstractC6755z
    /* renamed from: x0 */
    public final void mo156x0(p101fh.InterfaceC2175g r1, java.lang.Runnable r2) {
            r0 = this;
            r0.m13649G0(r2)
            return
    }
}
