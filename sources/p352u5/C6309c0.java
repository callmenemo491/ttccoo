package p352u5;

/* renamed from: u5.c0 */
/* loaded from: classes.dex */
public final class C6309c0 {

    /* renamed from: d */
    public static final p352u5.C6309c0.c f24632d = null;

    /* renamed from: e */
    public static final p352u5.C6309c0.c f24633e = null;

    /* renamed from: a */
    public final java.util.concurrent.ExecutorService f24634a;

    /* renamed from: b */
    public p352u5.C6309c0.d<? extends p352u5.C6309c0.e> f24635b;

    /* renamed from: c */
    public java.io.IOException f24636c;

    /* renamed from: u5.c0$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: u5.c0$b */
    public interface b<T extends p352u5.C6309c0.e> {
        /* renamed from: d */
        void mo6045d(T r1, long r2, long r4, boolean r6);

        /* renamed from: g */
        void mo6046g(T r1, long r2, long r4);

        /* renamed from: h */
        p352u5.C6309c0.c mo6047h(T r1, long r2, long r4, java.io.IOException r6, int r7);
    }

    /* renamed from: u5.c0$c */
    public static final class c {

        /* renamed from: a */
        public final int f24637a;

        /* renamed from: b */
        public final long f24638b;

        public c(int r1, long r2, p352u5.C6309c0.a r4) {
                r0 = this;
                r0.<init>()
                r0.f24637a = r1
                r0.f24638b = r2
                return
        }
    }

    @android.annotation.SuppressLint({"HandlerLeak"})
    /* renamed from: u5.c0$d */
    public final class d<T extends p352u5.C6309c0.e> extends android.os.Handler implements java.lang.Runnable {

        /* renamed from: Y */
        public final int f24639Y;

        /* renamed from: Z */
        public final T f24640Z;

        /* renamed from: a0 */
        public final long f24641a0;

        /* renamed from: b0 */
        public p352u5.C6309c0.b<T> f24642b0;

        /* renamed from: c0 */
        public java.io.IOException f24643c0;

        /* renamed from: d0 */
        public int f24644d0;

        /* renamed from: e0 */
        public java.lang.Thread f24645e0;

        /* renamed from: f0 */
        public boolean f24646f0;

        /* renamed from: g0 */
        public volatile boolean f24647g0;

        /* renamed from: h0 */
        public final /* synthetic */ p352u5.C6309c0 f24648h0;

        public d(p352u5.C6309c0 r1, android.os.Looper r2, T r3, p352u5.C6309c0.b<T> r4, int r5, long r6) {
                r0 = this;
                r0.f24648h0 = r1
                r0.<init>(r2)
                r0.f24640Z = r3
                r0.f24642b0 = r4
                r0.f24639Y = r5
                r0.f24641a0 = r6
                return
        }

        /* renamed from: a */
        public void m12950a(boolean r9) {
                r8 = this;
                r8.f24647g0 = r9
                r0 = 0
                r8.f24643c0 = r0
                r1 = 0
                boolean r2 = r8.hasMessages(r1)
                r3 = 1
                if (r2 == 0) goto L18
                r8.f24646f0 = r3
                r8.removeMessages(r1)
                if (r9 != 0) goto L29
                r8.sendEmptyMessage(r3)
                goto L29
            L18:
                monitor-enter(r8)
                r8.f24646f0 = r3     // Catch: java.lang.Throwable -> L45
                T extends u5.c0$e r1 = r8.f24640Z     // Catch: java.lang.Throwable -> L45
                g5.y$a r1 = (p108g5.C2290y.a) r1     // Catch: java.lang.Throwable -> L45
                r1.f10486h = r3     // Catch: java.lang.Throwable -> L45
                java.lang.Thread r1 = r8.f24645e0     // Catch: java.lang.Throwable -> L45
                if (r1 == 0) goto L28
                r1.interrupt()     // Catch: java.lang.Throwable -> L45
            L28:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L45
            L29:
                if (r9 == 0) goto L44
                u5.c0 r9 = r8.f24648h0
                r9.f24635b = r0
                long r3 = android.os.SystemClock.elapsedRealtime()
                u5.c0$b<T extends u5.c0$e> r1 = r8.f24642b0
                java.util.Objects.requireNonNull(r1)
                T extends u5.c0$e r2 = r8.f24640Z
                long r5 = r8.f24641a0
                long r5 = r3 - r5
                r7 = 1
                r1.mo6045d(r2, r3, r5, r7)
                r8.f24642b0 = r0
            L44:
                return
            L45:
                r9 = move-exception
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L45
                throw r9
        }

        /* renamed from: b */
        public void m12951b(long r6) {
                r5 = this;
                u5.c0 r0 = r5.f24648h0
                u5.c0$d<? extends u5.c0$e> r0 = r0.f24635b
                r1 = 0
                if (r0 != 0) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                p371v5.C6549a.m13291e(r0)
                u5.c0 r0 = r5.f24648h0
                r0.f24635b = r5
                r2 = 0
                int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r4 <= 0) goto L1b
                r5.sendEmptyMessageDelayed(r1, r6)
                goto L23
            L1b:
                r6 = 0
                r5.f24643c0 = r6
                java.util.concurrent.ExecutorService r6 = r0.f24634a
                r6.execute(r5)
            L23:
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r13) {
                r12 = this;
                boolean r0 = r12.f24647g0
                if (r0 == 0) goto L5
                return
            L5:
                int r0 = r13.what
                r1 = 0
                if (r0 != 0) goto L19
                r12.f24643c0 = r1
                u5.c0 r13 = r12.f24648h0
                java.util.concurrent.ExecutorService r0 = r13.f24634a
                u5.c0$d<? extends u5.c0$e> r13 = r13.f24635b
                java.util.Objects.requireNonNull(r13)
                r0.execute(r13)
                return
            L19:
                r2 = 3
                if (r0 == r2) goto L9a
                u5.c0 r0 = r12.f24648h0
                r0.f24635b = r1
                long r5 = android.os.SystemClock.elapsedRealtime()
                long r0 = r12.f24641a0
                long r7 = r5 - r0
                u5.c0$b<T extends u5.c0$e> r3 = r12.f24642b0
                java.util.Objects.requireNonNull(r3)
                boolean r0 = r12.f24646f0
                if (r0 == 0) goto L38
                T extends u5.c0$e r4 = r12.f24640Z
                r9 = 0
                r3.mo6045d(r4, r5, r7, r9)
                return
            L38:
                int r0 = r13.what
                r1 = 1
                if (r0 == r1) goto L82
                r11 = 2
                if (r0 == r11) goto L41
                goto L99
            L41:
                java.lang.Object r13 = r13.obj
                r9 = r13
                java.io.IOException r9 = (java.io.IOException) r9
                r12.f24643c0 = r9
                int r13 = r12.f24644d0
                int r10 = r13 + 1
                r12.f24644d0 = r10
                T extends u5.c0$e r4 = r12.f24640Z
                u5.c0$c r13 = r3.mo6047h(r4, r5, r7, r9, r10)
                int r0 = r13.f24637a
                if (r0 != r2) goto L5f
                u5.c0 r13 = r12.f24648h0
                java.io.IOException r0 = r12.f24643c0
                r13.f24636c = r0
                goto L99
            L5f:
                if (r0 == r11) goto L99
                if (r0 != r1) goto L65
                r12.f24644d0 = r1
            L65:
                long r0 = r13.f24638b
                r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r13 == 0) goto L71
                goto L7e
            L71:
                int r13 = r12.f24644d0
                int r13 = r13 + (-1)
                int r13 = r13 * 1000
                r0 = 5000(0x1388, float:7.006E-42)
                int r13 = java.lang.Math.min(r13, r0)
                long r0 = (long) r13
            L7e:
                r12.m12951b(r0)
                goto L99
            L82:
                T extends u5.c0$e r4 = r12.f24640Z     // Catch: java.lang.RuntimeException -> L88
                r3.mo6046g(r4, r5, r7)     // Catch: java.lang.RuntimeException -> L88
                goto L99
            L88:
                r13 = move-exception
                java.lang.String r0 = "LoadTask"
                java.lang.String r1 = "Unexpected exception handling load completed"
                p371v5.C6565o.m13369b(r0, r1, r13)
                u5.c0 r0 = r12.f24648h0
                u5.c0$h r1 = new u5.c0$h
                r1.<init>(r13)
                r0.f24636c = r1
            L99:
                return
            L9a:
                java.lang.Object r13 = r13.obj
                java.lang.Error r13 = (java.lang.Error) r13
                throw r13
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                r0 = 2
                monitor-enter(r5)     // Catch: java.lang.Error -> L59 java.lang.OutOfMemoryError -> L6e java.lang.Exception -> L87 java.io.IOException -> L99
                boolean r1 = r5.f24646f0     // Catch: java.lang.Throwable -> L56
                r2 = 1
                if (r1 != 0) goto L9
                r1 = 1
                goto La
            L9:
                r1 = 0
            La:
                java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L56
                r5.f24645e0 = r3     // Catch: java.lang.Throwable -> L56
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L56
                if (r1 == 0) goto L43
                java.lang.String r1 = "load:"
                T extends u5.c0$e r3 = r5.f24640Z     // Catch: java.lang.Error -> L59 java.lang.OutOfMemoryError -> L6e java.lang.Exception -> L87 java.io.IOException -> L99
                java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Error -> L59 java.lang.OutOfMemoryError -> L6e java.lang.Exception -> L87 java.io.IOException -> L99
                java.lang.String r3 = r3.getSimpleName()     // Catch: java.lang.Error -> L59 java.lang.OutOfMemoryError -> L6e java.lang.Exception -> L87 java.io.IOException -> L99
                int r4 = r3.length()     // Catch: java.lang.Error -> L59 java.lang.OutOfMemoryError -> L6e java.lang.Exception -> L87 java.io.IOException -> L99
                if (r4 == 0) goto L2a
                java.lang.String r1 = r1.concat(r3)     // Catch: java.lang.Error -> L59 java.lang.OutOfMemoryError -> L6e java.lang.Exception -> L87 java.io.IOException -> L99
                goto L30
            L2a:
                java.lang.String r3 = new java.lang.String     // Catch: java.lang.Error -> L59 java.lang.OutOfMemoryError -> L6e java.lang.Exception -> L87 java.io.IOException -> L99
                r3.<init>(r1)     // Catch: java.lang.Error -> L59 java.lang.OutOfMemoryError -> L6e java.lang.Exception -> L87 java.io.IOException -> L99
                r1 = r3
            L30:
                p371v5.C6549a.m13287a(r1)     // Catch: java.lang.Error -> L59 java.lang.OutOfMemoryError -> L6e java.lang.Exception -> L87 java.io.IOException -> L99
                T extends u5.c0$e r1 = r5.f24640Z     // Catch: java.lang.Throwable -> L3e
                g5.y$a r1 = (p108g5.C2290y.a) r1     // Catch: java.lang.Throwable -> L3e
                r1.m6057b()     // Catch: java.lang.Throwable -> L3e
                p371v5.C6549a.m13293g()     // Catch: java.lang.Error -> L59 java.lang.OutOfMemoryError -> L6e java.lang.Exception -> L87 java.io.IOException -> L99
                goto L43
            L3e:
                r1 = move-exception
                p371v5.C6549a.m13293g()     // Catch: java.lang.Error -> L59 java.lang.OutOfMemoryError -> L6e java.lang.Exception -> L87 java.io.IOException -> L99
                throw r1     // Catch: java.lang.Error -> L59 java.lang.OutOfMemoryError -> L6e java.lang.Exception -> L87 java.io.IOException -> L99
            L43:
                monitor-enter(r5)     // Catch: java.lang.Error -> L59 java.lang.OutOfMemoryError -> L6e java.lang.Exception -> L87 java.io.IOException -> L99
                r1 = 0
                r5.f24645e0 = r1     // Catch: java.lang.Throwable -> L53
                java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L53
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L53
                boolean r1 = r5.f24647g0     // Catch: java.lang.Error -> L59 java.lang.OutOfMemoryError -> L6e java.lang.Exception -> L87 java.io.IOException -> L99
                if (r1 != 0) goto La3
                r5.sendEmptyMessage(r2)     // Catch: java.lang.Error -> L59 java.lang.OutOfMemoryError -> L6e java.lang.Exception -> L87 java.io.IOException -> L99
                goto La3
            L53:
                r1 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L53
                throw r1     // Catch: java.lang.Error -> L59 java.lang.OutOfMemoryError -> L6e java.lang.Exception -> L87 java.io.IOException -> L99
            L56:
                r1 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L56
                throw r1     // Catch: java.lang.Error -> L59 java.lang.OutOfMemoryError -> L6e java.lang.Exception -> L87 java.io.IOException -> L99
            L59:
                r0 = move-exception
                boolean r1 = r5.f24647g0
                if (r1 != 0) goto L6d
                java.lang.String r1 = "LoadTask"
                java.lang.String r2 = "Unexpected error loading stream"
                p371v5.C6565o.m13369b(r1, r2, r0)
                r1 = 3
                android.os.Message r1 = r5.obtainMessage(r1, r0)
                r1.sendToTarget()
            L6d:
                throw r0
            L6e:
                r1 = move-exception
                boolean r2 = r5.f24647g0
                if (r2 != 0) goto La3
                java.lang.String r2 = "LoadTask"
                java.lang.String r3 = "OutOfMemory error loading stream"
                p371v5.C6565o.m13369b(r2, r3, r1)
                u5.c0$h r2 = new u5.c0$h
                r2.<init>(r1)
            L7f:
                android.os.Message r0 = r5.obtainMessage(r0, r2)
            L83:
                r0.sendToTarget()
                goto La3
            L87:
                r1 = move-exception
                boolean r2 = r5.f24647g0
                if (r2 != 0) goto La3
                java.lang.String r2 = "LoadTask"
                java.lang.String r3 = "Unexpected exception loading stream"
                p371v5.C6565o.m13369b(r2, r3, r1)
                u5.c0$h r2 = new u5.c0$h
                r2.<init>(r1)
                goto L7f
            L99:
                r1 = move-exception
                boolean r2 = r5.f24647g0
                if (r2 != 0) goto La3
                android.os.Message r0 = r5.obtainMessage(r0, r1)
                goto L83
            La3:
                return
        }
    }

    /* renamed from: u5.c0$e */
    public interface e {
    }

    /* renamed from: u5.c0$f */
    public interface f {
    }

    /* renamed from: u5.c0$g */
    public static final class g implements java.lang.Runnable {

        /* renamed from: Y */
        public final p352u5.C6309c0.f f24649Y;

        public g(p352u5.C6309c0.f r1) {
                r0 = this;
                r0.<init>()
                r0.f24649Y = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                u5.c0$f r0 = r8.f24649Y
                g5.y r0 = (p108g5.C2290y) r0
                g5.b0[] r1 = r0.f10469q0
                int r2 = r1.length
                r3 = 0
            L8:
                r4 = 0
                if (r3 >= r2) goto L21
                r5 = r1[r3]
                r6 = 1
                r5.m5987s(r6)
                j4.e r6 = r5.f10293i
                if (r6 == 0) goto L1e
                j4.h$a r7 = r5.f10289e
                r6.mo7791c(r7)
                r5.f10293i = r4
                r5.f10292h = r4
            L1e:
                int r3 = r3 + 1
                goto L8
            L21:
                g5.w r0 = r0.f10462j0
                androidx.fragment.app.l0 r0 = (androidx.fragment.app.C0392l0) r0
                java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r1 = r0.f2231a0
                m4.i r1 = (p216m4.InterfaceC4364i) r1
                if (r1 == 0) goto L30
                r1.release()
                r0.f2231a0 = r4
            L30:
                r0.f2232b0 = r4
                return
        }
    }

    /* renamed from: u5.c0$h */
    public static final class h extends java.io.IOException {
        public h(java.lang.Throwable r5) {
                r4 = this;
                java.lang.Class r0 = r5.getClass()
                java.lang.String r0 = r0.getSimpleName()
                java.lang.String r1 = r5.getMessage()
                int r2 = r0.length()
                int r2 = r2 + 13
                int r2 = p064e.C1489c.m4038a(r1, r2)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r2)
                java.lang.String r2 = "Unexpected "
                r3.append(r2)
                r3.append(r0)
                java.lang.String r0 = ": "
                r3.append(r0)
                r3.append(r1)
                java.lang.String r0 = r3.toString()
                r4.<init>(r0, r5)
                return
        }
    }

    static {
            u5.c0$c r0 = new u5.c0$c
            r1 = 2
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 0
            r0.<init>(r1, r2, r4)
            p352u5.C6309c0.f24632d = r0
            u5.c0$c r0 = new u5.c0$c
            r1 = 3
            r0.<init>(r1, r2, r4)
            p352u5.C6309c0.f24633e = r0
            return
    }

    public C6309c0(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.length()
            java.lang.String r1 = "ExoPlayer:Loader:"
            if (r0 == 0) goto L10
            java.lang.String r3 = r1.concat(r3)
            goto L15
        L10:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
        L15:
            int r0 = p371v5.C6552b0.f25624a
            v5.a0 r0 = new v5.a0
            r0.<init>(r3)
            java.util.concurrent.ExecutorService r3 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            r2.f24634a = r3
            return
    }

    /* renamed from: a */
    public static p352u5.C6309c0.c m12948a(boolean r2, long r3) {
            u5.c0$c r0 = new u5.c0$c
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    /* renamed from: b */
    public boolean m12949b() {
            r1 = this;
            u5.c0$d<? extends u5.c0$e> r0 = r1.f24635b
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
