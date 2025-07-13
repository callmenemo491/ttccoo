package bi;

/* renamed from: bi.p */
/* loaded from: classes.dex */
public final class C0796p {

    /* renamed from: a */
    public java.util.concurrent.ExecutorService f4322a;

    /* renamed from: b */
    public final java.util.ArrayDeque<fi.C2181c.a> f4323b;

    /* renamed from: c */
    public final java.util.ArrayDeque<fi.C2181c.a> f4324c;

    /* renamed from: d */
    public final java.util.ArrayDeque<fi.C2181c> f4325d;

    public C0796p() {
            r1 = this;
            r1.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.f4323b = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.f4324c = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.f4325d = r0
            return
    }

    /* renamed from: a */
    public final <T> void m2417a(java.util.Deque<T> r1, T r2) {
            r0 = this;
            monitor-enter(r0)
            boolean r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto Lc
            monitor-exit(r0)
            r0.m2419c()
            return
        Lc:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = "Call wasn't in-flight!"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L14
            throw r1     // Catch: java.lang.Throwable -> L14
        L14:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* renamed from: b */
    public final void m2418b(fi.C2181c.a r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r2.f9957Y
            r0.decrementAndGet()
            java.util.ArrayDeque<fi.c$a> r0 = r1.f4324c
            r1.m2417a(r0, r2)
            return
    }

    /* renamed from: c */
    public final boolean m2419c() {
            r15 = this;
            byte[] r0 = ci.C0988c.f5065a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r15)
            java.util.ArrayDeque<fi.c$a> r1 = r15.f4323b     // Catch: java.lang.Throwable -> Lf1
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r2 = "readyAsyncCalls.iterator()"
            p214m2.C4339q.m9705j(r1, r2)     // Catch: java.lang.Throwable -> Lf1
        L13:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lf1
            if (r2 == 0) goto L45
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Lf1
            fi.c$a r2 = (fi.C2181c.a) r2     // Catch: java.lang.Throwable -> Lf1
            java.util.ArrayDeque<fi.c$a> r3 = r15.f4324c     // Catch: java.lang.Throwable -> Lf1
            int r3 = r3.size()     // Catch: java.lang.Throwable -> Lf1
            r4 = 64
            if (r3 < r4) goto L2a
            goto L45
        L2a:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f9957Y     // Catch: java.lang.Throwable -> Lf1
            int r3 = r3.get()     // Catch: java.lang.Throwable -> Lf1
            r4 = 5
            if (r3 < r4) goto L34
            goto L13
        L34:
            r1.remove()     // Catch: java.lang.Throwable -> Lf1
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f9957Y     // Catch: java.lang.Throwable -> Lf1
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> Lf1
            r0.add(r2)     // Catch: java.lang.Throwable -> Lf1
            java.util.ArrayDeque<fi.c$a> r3 = r15.f4324c     // Catch: java.lang.Throwable -> Lf1
            r3.add(r2)     // Catch: java.lang.Throwable -> Lf1
            goto L13
        L45:
            monitor-enter(r15)     // Catch: java.lang.Throwable -> Lf1
            java.util.ArrayDeque<fi.c$a> r1 = r15.f4324c     // Catch: java.lang.Throwable -> Lee
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Lee
            java.util.ArrayDeque<fi.c> r2 = r15.f4325d     // Catch: java.lang.Throwable -> Lee
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Lee
            int r1 = r1 + r2
            monitor-exit(r15)     // Catch: java.lang.Throwable -> Lf1
            r2 = 0
            if (r1 <= 0) goto L59
            r1 = 1
            goto L5a
        L59:
            r1 = 0
        L5a:
            monitor-exit(r15)
            int r3 = r0.size()
            r4 = 0
        L60:
            if (r4 >= r3) goto Led
            java.lang.Object r5 = r0.get(r4)
            fi.c$a r5 = (fi.C2181c.a) r5
            monitor-enter(r15)
            java.util.concurrent.ExecutorService r6 = r15.f4322a     // Catch: java.lang.Throwable -> Lea
            if (r6 != 0) goto L9f
            java.util.concurrent.ThreadPoolExecutor r6 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> Lea
            r8 = 0
            r9 = 2147483647(0x7fffffff, float:NaN)
            r10 = 60
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> Lea
            java.util.concurrent.SynchronousQueue r13 = new java.util.concurrent.SynchronousQueue     // Catch: java.lang.Throwable -> Lea
            r13.<init>()     // Catch: java.lang.Throwable -> Lea
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lea
            r7.<init>()     // Catch: java.lang.Throwable -> Lea
            java.lang.String r14 = ci.C0988c.f5071g     // Catch: java.lang.Throwable -> Lea
            r7.append(r14)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r14 = " Dispatcher"
            r7.append(r14)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lea
            java.lang.String r14 = "name"
            p214m2.C4339q.m9706k(r7, r14)     // Catch: java.lang.Throwable -> Lea
            ci.b r14 = new ci.b     // Catch: java.lang.Throwable -> Lea
            r14.<init>(r7, r2)     // Catch: java.lang.Throwable -> Lea
            r7 = r6
            r7.<init>(r8, r9, r10, r12, r13, r14)     // Catch: java.lang.Throwable -> Lea
            r15.f4322a = r6     // Catch: java.lang.Throwable -> Lea
        L9f:
            java.util.concurrent.ExecutorService r6 = r15.f4322a     // Catch: java.lang.Throwable -> Lea
            p214m2.C4339q.m9704i(r6)     // Catch: java.lang.Throwable -> Lea
            monitor-exit(r15)
            java.util.Objects.requireNonNull(r5)
            java.lang.String r7 = "executorService"
            p214m2.C4339q.m9706k(r6, r7)
            fi.c r7 = r5.f9959a0
            bi.a0 r7 = r7.f9954n0
            bi.p r7 = r7.f4138Y
            byte[] r7 = ci.C0988c.f5065a
            r6.execute(r5)     // Catch: java.lang.Throwable -> Lb9 java.util.concurrent.RejectedExecutionException -> Lbb
            goto Ldd
        Lb9:
            r0 = move-exception
            goto Le0
        Lbb:
            r6 = move-exception
            java.io.InterruptedIOException r7 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r8 = "executor rejected"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Lb9
            r7.initCause(r6)     // Catch: java.lang.Throwable -> Lb9
            fi.c r6 = r5.f9959a0     // Catch: java.lang.Throwable -> Lb9
            r6.m5758j(r7)     // Catch: java.lang.Throwable -> Lb9
            bi.g r6 = r5.f9958Z     // Catch: java.lang.Throwable -> Lb9
            fi.c r8 = r5.f9959a0     // Catch: java.lang.Throwable -> Lb9
            ek.p$a r6 = (p082ek.C1903p.a) r6     // Catch: java.lang.Throwable -> Lb9
            r6.m4681a(r8, r7)     // Catch: java.lang.Throwable -> Lb9
            fi.c r6 = r5.f9959a0
            bi.a0 r6 = r6.f9954n0
            bi.p r6 = r6.f4138Y
            r6.m2418b(r5)
        Ldd:
            int r4 = r4 + 1
            goto L60
        Le0:
            fi.c r1 = r5.f9959a0
            bi.a0 r1 = r1.f9954n0
            bi.p r1 = r1.f4138Y
            r1.m2418b(r5)
            throw r0
        Lea:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        Led:
            return r1
        Lee:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> Lf1
            throw r0     // Catch: java.lang.Throwable -> Lf1
        Lf1:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
    }
}
