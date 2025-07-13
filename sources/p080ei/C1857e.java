package p080ei;

/* renamed from: ei.e */
/* loaded from: classes.dex */
public final class C1857e {

    /* renamed from: h */
    public static final p080ei.C1857e f8048h = null;

    /* renamed from: i */
    public static final java.util.logging.Logger f8049i = null;

    /* renamed from: j */
    public static final p080ei.C1857e.b f8050j = null;

    /* renamed from: a */
    public int f8051a;

    /* renamed from: b */
    public boolean f8052b;

    /* renamed from: c */
    public long f8053c;

    /* renamed from: d */
    public final java.util.List<p080ei.C1856d> f8054d;

    /* renamed from: e */
    public final java.util.List<p080ei.C1856d> f8055e;

    /* renamed from: f */
    public final java.lang.Runnable f8056f;

    /* renamed from: g */
    public final p080ei.C1857e.a f8057g;

    /* renamed from: ei.e$a */
    public interface a {
        /* renamed from: a */
        void mo4625a(p080ei.C1857e r1);

        /* renamed from: b */
        void mo4626b(p080ei.C1857e r1, long r2);

        /* renamed from: c */
        long mo4627c();

        void execute(java.lang.Runnable r1);
    }

    /* renamed from: ei.e$b */
    public static final class b {
        public b(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: ei.e$c */
    public static final class c implements p080ei.C1857e.a {

        /* renamed from: a */
        public final java.util.concurrent.ThreadPoolExecutor f8058a;

        public c(java.util.concurrent.ThreadFactory r10) {
                r9 = this;
                r9.<init>()
                java.util.concurrent.ThreadPoolExecutor r8 = new java.util.concurrent.ThreadPoolExecutor
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
                java.util.concurrent.SynchronousQueue r6 = new java.util.concurrent.SynchronousQueue
                r6.<init>()
                r1 = 0
                r2 = 2147483647(0x7fffffff, float:NaN)
                r3 = 60
                r0 = r8
                r7 = r10
                r0.<init>(r1, r2, r3, r5, r6, r7)
                r9.f8058a = r8
                return
        }

        @Override // p080ei.C1857e.a
        /* renamed from: a */
        public void mo4625a(p080ei.C1857e r1) {
                r0 = this;
                r1.notify()
                return
        }

        @Override // p080ei.C1857e.a
        /* renamed from: b */
        public void mo4626b(p080ei.C1857e r8, long r9) {
                r7 = this;
                r0 = 1000000(0xf4240, double:4.940656E-318)
                long r2 = r9 / r0
                long r0 = r0 * r2
                long r0 = r9 - r0
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 > 0) goto L13
                int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r6 <= 0) goto L17
            L13:
                int r9 = (int) r0
                r8.wait(r2, r9)
            L17:
                return
        }

        @Override // p080ei.C1857e.a
        /* renamed from: c */
        public long mo4627c() {
                r2 = this;
                long r0 = java.lang.System.nanoTime()
                return r0
        }

        @Override // p080ei.C1857e.a
        public void execute(java.lang.Runnable r2) {
                r1 = this;
                java.lang.String r0 = "runnable"
                p214m2.C4339q.m9706k(r2, r0)
                java.util.concurrent.ThreadPoolExecutor r0 = r1.f8058a
                r0.execute(r2)
                return
        }
    }

    /* renamed from: ei.e$d */
    public static final class d implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ p080ei.C1857e f8059Y;

        public d(p080ei.C1857e r1) {
                r0 = this;
                r0.f8059Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
            L0:
                ei.e r0 = r8.f8059Y
                monitor-enter(r0)
                ei.e r1 = r8.f8059Y     // Catch: java.lang.Throwable -> L7c
                ei.a r1 = r1.m4621c()     // Catch: java.lang.Throwable -> L7c
                monitor-exit(r0)
                if (r1 == 0) goto L7b
                ei.d r0 = r1.f8037a
                p214m2.C4339q.m9704i(r0)
                r2 = -1
                ei.e$b r4 = p080ei.C1857e.f8050j
                java.util.logging.Logger r4 = p080ei.C1857e.f8049i
                java.util.logging.Level r5 = java.util.logging.Level.FINE
                boolean r4 = r4.isLoggable(r5)
                if (r4 == 0) goto L2c
                ei.e r2 = r0.f8046e
                ei.e$a r2 = r2.f8057g
                long r2 = r2.mo4627c()
                java.lang.String r5 = "starting"
                p080ei.C1854b.m4599a(r1, r0, r5)
            L2c:
                ei.e r5 = r8.f8059Y     // Catch: java.lang.Throwable -> L51
                p080ei.C1857e.m4619a(r5, r1)     // Catch: java.lang.Throwable -> L51
                if (r4 == 0) goto L0
                ei.e r4 = r0.f8046e
                ei.e$a r4 = r4.f8057g
                long r4 = r4.mo4627c()
                long r4 = r4 - r2
                java.lang.String r2 = "finished run in "
                java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
                java.lang.String r3 = p080ei.C1854b.m4603e(r4)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                p080ei.C1854b.m4599a(r1, r0, r2)
                goto L0
            L51:
                r5 = move-exception
                ei.e r6 = r8.f8059Y     // Catch: java.lang.Throwable -> L5a
                ei.e$a r6 = r6.f8057g     // Catch: java.lang.Throwable -> L5a
                r6.execute(r8)     // Catch: java.lang.Throwable -> L5a
                throw r5     // Catch: java.lang.Throwable -> L5a
            L5a:
                r5 = move-exception
                if (r4 == 0) goto L7a
                ei.e r4 = r0.f8046e
                ei.e$a r4 = r4.f8057g
                long r6 = r4.mo4627c()
                long r6 = r6 - r2
                java.lang.String r2 = "failed a run in "
                java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
                java.lang.String r3 = p080ei.C1854b.m4603e(r6)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                p080ei.C1854b.m4599a(r1, r0, r2)
            L7a:
                throw r5
            L7b:
                return
            L7c:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }
    }

    static {
            ei.e$b r0 = new ei.e$b
            r1 = 0
            r0.<init>(r1)
            p080ei.C1857e.f8050j = r0
            ei.e r0 = new ei.e
            ei.e$c r1 = new ei.e$c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ci.C0988c.f5071g
            r2.append(r3)
            java.lang.String r3 = " TaskRunner"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "name"
            p214m2.C4339q.m9706k(r2, r3)
            ci.b r3 = new ci.b
            r4 = 1
            r3.<init>(r2, r4)
            r1.<init>(r3)
            r0.<init>(r1)
            p080ei.C1857e.f8048h = r0
            java.lang.Class<ei.e> r0 = p080ei.C1857e.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            java.lang.String r1 = "Logger.getLogger(TaskRunner::class.java.name)"
            p214m2.C4339q.m9705j(r0, r1)
            p080ei.C1857e.f8049i = r0
            return
    }

    public C1857e(p080ei.C1857e.a r1) {
            r0 = this;
            r0.<init>()
            r0.f8057g = r1
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.f8051a = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f8054d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f8055e = r1
            ei.e$d r1 = new ei.e$d
            r1.<init>(r0)
            r0.f8056f = r1
            return
    }

    /* renamed from: a */
    public static final void m4619a(p080ei.C1857e r5, p080ei.AbstractC1853a r6) {
            java.util.Objects.requireNonNull(r5)
            byte[] r0 = ci.C0988c.f5065a
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "currentThread"
            p214m2.C4339q.m9705j(r0, r1)
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = r6.f8039c
            r0.setName(r2)
            long r2 = r6.mo4598a()     // Catch: java.lang.Throwable -> L27
            monitor-enter(r5)
            r5.m4620b(r6, r2)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r5)
            r0.setName(r1)
            return
        L24:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L27:
            r2 = move-exception
            monitor-enter(r5)
            r3 = -1
            r5.m4620b(r6, r3)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r5)
            r0.setName(r1)
            throw r2
        L33:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    /* renamed from: b */
    public final void m4620b(p080ei.AbstractC1853a r7, long r8) {
            r6 = this;
            byte[] r0 = ci.C0988c.f5065a
            ei.d r0 = r7.f8037a
            p214m2.C4339q.m9704i(r0)
            ei.a r1 = r0.f8043b
            r2 = 1
            r3 = 0
            if (r1 != r7) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            if (r1 == 0) goto L3c
            boolean r1 = r0.f8045d
            r0.f8045d = r3
            r3 = 0
            r0.f8043b = r3
            java.util.List<ei.d> r3 = r6.f8054d
            r3.remove(r0)
            r3 = -1
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 == 0) goto L2d
            if (r1 != 0) goto L2d
            boolean r1 = r0.f8042a
            if (r1 != 0) goto L2d
            r0.m4617d(r7, r8, r2)
        L2d:
            java.util.List<ei.a> r7 = r0.f8044c
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r2
            if (r7 == 0) goto L3b
            java.util.List<ei.d> r7 = r6.f8055e
            r7.add(r0)
        L3b:
            return
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Check failed."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    /* renamed from: c */
    public final p080ei.AbstractC1853a m4621c() {
            r15 = this;
            byte[] r0 = ci.C0988c.f5065a
        L2:
            java.util.List<ei.d> r0 = r15.f8055e
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto Lc
            return r1
        Lc:
            ei.e$a r0 = r15.f8057g
            long r2 = r0.mo4627c()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List<ei.d> r0 = r15.f8055e
            java.util.Iterator r0 = r0.iterator()
            r6 = r1
        L1e:
            boolean r7 = r0.hasNext()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L4c
            java.lang.Object r7 = r0.next()
            ei.d r7 = (p080ei.C1856d) r7
            java.util.List<ei.a> r7 = r7.f8044c
            java.lang.Object r7 = r7.get(r9)
            ei.a r7 = (p080ei.AbstractC1853a) r7
            long r10 = r7.f8038b
            long r10 = r10 - r2
            r12 = 0
            long r10 = java.lang.Math.max(r12, r10)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L46
            long r4 = java.lang.Math.min(r10, r4)
            goto L1e
        L46:
            if (r6 == 0) goto L4a
            r0 = 1
            goto L4d
        L4a:
            r6 = r7
            goto L1e
        L4c:
            r0 = 0
        L4d:
            if (r6 == 0) goto L82
            byte[] r1 = ci.C0988c.f5065a
            r1 = -1
            r6.f8038b = r1
            ei.d r1 = r6.f8037a
            p214m2.C4339q.m9704i(r1)
            java.util.List<ei.a> r2 = r1.f8044c
            r2.remove(r6)
            java.util.List<ei.d> r2 = r15.f8055e
            r2.remove(r1)
            r1.f8043b = r6
            java.util.List<ei.d> r2 = r15.f8054d
            r2.add(r1)
            if (r0 != 0) goto L7a
            boolean r0 = r15.f8052b
            if (r0 != 0) goto L81
            java.util.List<ei.d> r0 = r15.f8055e
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r8
            if (r0 == 0) goto L81
        L7a:
            ei.e$a r0 = r15.f8057g
            java.lang.Runnable r1 = r15.f8056f
            r0.execute(r1)
        L81:
            return r6
        L82:
            boolean r0 = r15.f8052b
            if (r0 == 0) goto L93
            long r6 = r15.f8053c
            long r6 = r6 - r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L92
            ei.e$a r0 = r15.f8057g
            r0.mo4625a(r15)
        L92:
            return r1
        L93:
            r15.f8052b = r8
            long r2 = r2 + r4
            r15.f8053c = r2
            ei.e$a r0 = r15.f8057g     // Catch: java.lang.Throwable -> La1 java.lang.InterruptedException -> La3
            r0.mo4626b(r15, r4)     // Catch: java.lang.Throwable -> La1 java.lang.InterruptedException -> La3
        L9d:
            r15.f8052b = r9
            goto L2
        La1:
            r0 = move-exception
            goto La7
        La3:
            r15.m4622d()     // Catch: java.lang.Throwable -> La1
            goto L9d
        La7:
            r15.f8052b = r9
            throw r0
    }

    /* renamed from: d */
    public final void m4622d() {
            r2 = this;
            java.util.List<ei.d> r0 = r2.f8054d
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L18
            java.util.List<ei.d> r1 = r2.f8054d
            java.lang.Object r1 = r1.get(r0)
            ei.d r1 = (p080ei.C1856d) r1
            r1.m4615b()
            int r0 = r0 + (-1)
            goto L8
        L18:
            java.util.List<ei.d> r0 = r2.f8055e
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L20:
            if (r0 < 0) goto L3d
            java.util.List<ei.d> r1 = r2.f8055e
            java.lang.Object r1 = r1.get(r0)
            ei.d r1 = (p080ei.C1856d) r1
            r1.m4615b()
            java.util.List<ei.a> r1 = r1.f8044c
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3a
            java.util.List<ei.d> r1 = r2.f8055e
            r1.remove(r0)
        L3a:
            int r0 = r0 + (-1)
            goto L20
        L3d:
            return
    }

    /* renamed from: e */
    public final void m4623e(p080ei.C1856d r3) {
            r2 = this;
            byte[] r0 = ci.C0988c.f5065a
            ei.a r0 = r3.f8043b
            if (r0 != 0) goto L26
            java.util.List<ei.a> r0 = r3.f8044c
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L21
            java.util.List<ei.d> r0 = r2.f8055e
            java.lang.String r1 = "$this$addIfAbsent"
            p214m2.C4339q.m9706k(r0, r1)
            boolean r1 = r0.contains(r3)
            if (r1 != 0) goto L26
            r0.add(r3)
            goto L26
        L21:
            java.util.List<ei.d> r0 = r2.f8055e
            r0.remove(r3)
        L26:
            boolean r3 = r2.f8052b
            if (r3 == 0) goto L30
            ei.e$a r3 = r2.f8057g
            r3.mo4625a(r2)
            goto L37
        L30:
            ei.e$a r3 = r2.f8057g
            java.lang.Runnable r0 = r2.f8056f
            r3.execute(r0)
        L37:
            return
    }

    /* renamed from: f */
    public final p080ei.C1856d m4624f() {
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f8051a     // Catch: java.lang.Throwable -> L1f
            int r1 = r0 + 1
            r4.f8051a = r1     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r4)
            ei.d r1 = new ei.d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 81
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r4, r0)
            return r1
        L1f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }
}
