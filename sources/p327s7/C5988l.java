package p327s7;

/* renamed from: s7.l */
/* loaded from: classes.dex */
public final class C5988l {

    /* renamed from: s7.l$a */
    public interface a<T> extends p327s7.InterfaceC5979c, p327s7.InterfaceC5981e, p327s7.InterfaceC5982f<T> {
    }

    /* renamed from: s7.l$b */
    public static final class b implements p327s7.C5988l.a {

        /* renamed from: Y */
        public final java.util.concurrent.CountDownLatch f23079Y;

        public b(p123h6.RunnableC2488a0 r2) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch
                r0 = 1
                r2.<init>(r0)
                r1.f23079Y = r2
                return
        }

        @Override // p327s7.InterfaceC5979c
        /* renamed from: a */
        public final void mo7372a() {
                r1 = this;
                java.util.concurrent.CountDownLatch r0 = r1.f23079Y
                r0.countDown()
                return
        }

        @Override // p327s7.InterfaceC5981e
        /* renamed from: c */
        public final void mo4109c(java.lang.Exception r1) {
                r0 = this;
                java.util.concurrent.CountDownLatch r1 = r0.f23079Y
                r1.countDown()
                return
        }

        @Override // p327s7.InterfaceC5982f
        /* renamed from: d */
        public final void mo1270d(java.lang.Object r1) {
                r0 = this;
                java.util.concurrent.CountDownLatch r1 = r0.f23079Y
                r1.countDown()
                return
        }
    }

    /* renamed from: s7.l$c */
    public static final class c implements p327s7.C5988l.a {

        /* renamed from: Y */
        public final java.lang.Object f23080Y;

        /* renamed from: Z */
        public final int f23081Z;

        /* renamed from: a0 */
        public final p327s7.C5993q<java.lang.Void> f23082a0;

        /* renamed from: b0 */
        public int f23083b0;

        /* renamed from: c0 */
        public int f23084c0;

        /* renamed from: d0 */
        public int f23085d0;

        /* renamed from: e0 */
        public java.lang.Exception f23086e0;

        /* renamed from: f0 */
        public boolean f23087f0;

        public c(int r2, p327s7.C5993q<java.lang.Void> r3) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.f23080Y = r0
                r1.f23081Z = r2
                r1.f23082a0 = r3
                return
        }

        @Override // p327s7.InterfaceC5979c
        /* renamed from: a */
        public final void mo7372a() {
                r3 = this;
                java.lang.Object r0 = r3.f23080Y
                monitor-enter(r0)
                int r1 = r3.f23085d0     // Catch: java.lang.Throwable -> L10
                r2 = 1
                int r1 = r1 + r2
                r3.f23085d0 = r1     // Catch: java.lang.Throwable -> L10
                r3.f23087f0 = r2     // Catch: java.lang.Throwable -> L10
                r3.m12469b()     // Catch: java.lang.Throwable -> L10
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
                return
            L10:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
                throw r1
        }

        /* renamed from: b */
        public final void m12469b() {
                r6 = this;
                int r0 = r6.f23083b0
                int r1 = r6.f23084c0
                int r0 = r0 + r1
                int r1 = r6.f23085d0
                int r0 = r0 + r1
                int r1 = r6.f23081Z
                if (r0 != r1) goto L4c
                java.lang.Exception r0 = r6.f23086e0
                if (r0 == 0) goto L3c
                s7.q<java.lang.Void> r0 = r6.f23082a0
                java.util.concurrent.ExecutionException r1 = new java.util.concurrent.ExecutionException
                int r2 = r6.f23084c0
                int r3 = r6.f23081Z
                r4 = 54
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>(r4)
                r5.append(r2)
                java.lang.String r2 = " out of "
                r5.append(r2)
                r5.append(r3)
                java.lang.String r2 = " underlying tasks failed"
                r5.append(r2)
                java.lang.String r2 = r5.toString()
                java.lang.Exception r3 = r6.f23086e0
                r1.<init>(r2, r3)
                r0.m12472q(r1)
                return
            L3c:
                boolean r0 = r6.f23087f0
                if (r0 == 0) goto L46
                s7.q<java.lang.Void> r0 = r6.f23082a0
                r0.m12474s()
                return
            L46:
                s7.q<java.lang.Void> r0 = r6.f23082a0
                r1 = 0
                r0.m12473r(r1)
            L4c:
                return
        }

        @Override // p327s7.InterfaceC5981e
        /* renamed from: c */
        public final void mo4109c(java.lang.Exception r3) {
                r2 = this;
                java.lang.Object r0 = r2.f23080Y
                monitor-enter(r0)
                int r1 = r2.f23084c0     // Catch: java.lang.Throwable -> L10
                int r1 = r1 + 1
                r2.f23084c0 = r1     // Catch: java.lang.Throwable -> L10
                r2.f23086e0 = r3     // Catch: java.lang.Throwable -> L10
                r2.m12469b()     // Catch: java.lang.Throwable -> L10
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
                return
            L10:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
                throw r3
        }

        @Override // p327s7.InterfaceC5982f
        /* renamed from: d */
        public final void mo1270d(java.lang.Object r2) {
                r1 = this;
                java.lang.Object r2 = r1.f23080Y
                monitor-enter(r2)
                int r0 = r1.f23083b0     // Catch: java.lang.Throwable -> Le
                int r0 = r0 + 1
                r1.f23083b0 = r0     // Catch: java.lang.Throwable -> Le
                r1.m12469b()     // Catch: java.lang.Throwable -> Le
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
                return
            Le:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
                throw r0
        }
    }

    /* renamed from: a */
    public static <TResult> TResult m12460a(p327s7.AbstractC5985i<TResult> r2) {
            java.lang.String r0 = "Must not be called on the main application thread"
            com.google.android.gms.common.internal.C1101a.m3102g(r0)
            java.lang.String r0 = "Task must not be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r2, r0)
            boolean r0 = r2.mo12454l()
            if (r0 == 0) goto L15
            java.lang.Object r2 = m12467h(r2)
            return r2
        L15:
            s7.l$b r0 = new s7.l$b
            r1 = 0
            r0.<init>(r1)
            m12468i(r2, r0)
            java.util.concurrent.CountDownLatch r0 = r0.f23079Y
            r0.await()
            java.lang.Object r2 = m12467h(r2)
            return r2
    }

    /* renamed from: b */
    public static <TResult> TResult m12461b(p327s7.AbstractC5985i<TResult> r2, long r3, java.util.concurrent.TimeUnit r5) {
            java.lang.String r0 = "Must not be called on the main application thread"
            com.google.android.gms.common.internal.C1101a.m3102g(r0)
            java.lang.String r0 = "Task must not be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r2, r0)
            java.lang.String r0 = "TimeUnit must not be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r5, r0)
            boolean r0 = r2.mo12454l()
            if (r0 == 0) goto L1a
            java.lang.Object r2 = m12467h(r2)
            return r2
        L1a:
            s7.l$b r0 = new s7.l$b
            r1 = 0
            r0.<init>(r1)
            m12468i(r2, r0)
            java.util.concurrent.CountDownLatch r0 = r0.f23079Y
            boolean r3 = r0.await(r3, r5)
            if (r3 == 0) goto L30
            java.lang.Object r2 = m12467h(r2)
            return r2
        L30:
            java.util.concurrent.TimeoutException r2 = new java.util.concurrent.TimeoutException
            java.lang.String r3 = "Timed out waiting for Task"
            r2.<init>(r3)
            throw r2
    }

    @java.lang.Deprecated
    /* renamed from: c */
    public static <TResult> p327s7.AbstractC5985i<TResult> m12462c(java.util.concurrent.Executor r2, java.util.concurrent.Callable<TResult> r3) {
            java.lang.String r0 = "Executor must not be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r2, r0)
            s7.q r0 = new s7.q
            r0.<init>()
            h6.a0 r1 = new h6.a0
            r1.<init>(r0, r3)
            r2.execute(r1)
            return r0
    }

    /* renamed from: d */
    public static <TResult> p327s7.AbstractC5985i<TResult> m12463d(java.lang.Exception r1) {
            s7.q r0 = new s7.q
            r0.<init>()
            r0.m12472q(r1)
            return r0
    }

    /* renamed from: e */
    public static <TResult> p327s7.AbstractC5985i<TResult> m12464e(TResult r1) {
            s7.q r0 = new s7.q
            r0.<init>()
            r0.m12473r(r1)
            return r0
    }

    /* renamed from: f */
    public static p327s7.AbstractC5985i<java.lang.Void> m12465f(java.util.Collection<? extends p327s7.AbstractC5985i<?>> r3) {
            if (r3 == 0) goto L42
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L9
            goto L42
        L9:
            java.util.Iterator r0 = r3.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            s7.i r1 = (p327s7.AbstractC5985i) r1
            java.lang.String r2 = "null tasks are not accepted"
            java.util.Objects.requireNonNull(r1, r2)
            goto Ld
        L1f:
            s7.q r0 = new s7.q
            r0.<init>()
            s7.l$c r1 = new s7.l$c
            int r2 = r3.size()
            r1.<init>(r2, r0)
            java.util.Iterator r3 = r3.iterator()
        L31:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L41
            java.lang.Object r2 = r3.next()
            s7.i r2 = (p327s7.AbstractC5985i) r2
            m12468i(r2, r1)
            goto L31
        L41:
            return r0
        L42:
            r3 = 0
            s7.i r3 = m12464e(r3)
            return r3
    }

    /* renamed from: g */
    public static p327s7.AbstractC5985i<java.util.List<p327s7.AbstractC5985i<?>>> m12466g(com.google.android.gms.tasks.Task<?>... r2) {
            int r0 = r2.length
            if (r0 != 0) goto Lc
            java.util.List r2 = java.util.Collections.emptyList()
            s7.i r2 = m12464e(r2)
            return r2
        Lc:
            java.util.List r2 = java.util.Arrays.asList(r2)
            if (r2 == 0) goto L2b
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L19
            goto L2b
        L19:
            s7.i r0 = m12465f(r2)
            h7.rb r1 = new h7.rb
            r1.<init>(r2)
            s7.q r0 = (p327s7.C5993q) r0
            java.util.concurrent.Executor r2 = p327s7.C5987k.f23076a
            s7.i r2 = r0.mo12449g(r2, r1)
            goto L33
        L2b:
            java.util.List r2 = java.util.Collections.emptyList()
            s7.i r2 = m12464e(r2)
        L33:
            return r2
    }

    /* renamed from: h */
    public static <TResult> TResult m12467h(p327s7.AbstractC5985i<TResult> r1) {
            boolean r0 = r1.mo12455m()
            if (r0 == 0) goto Lb
            java.lang.Object r1 = r1.mo12451i()
            return r1
        Lb:
            boolean r0 = r1.mo12453k()
            if (r0 == 0) goto L19
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Task is already canceled"
            r1.<init>(r0)
            throw r1
        L19:
            java.util.concurrent.ExecutionException r0 = new java.util.concurrent.ExecutionException
            java.lang.Exception r1 = r1.mo12450h()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: i */
    public static <T> void m12468i(p327s7.AbstractC5985i<T> r1, p327s7.C5988l.a<? super T> r2) {
            java.util.concurrent.Executor r0 = p327s7.C5987k.f23077b
            r1.mo12446d(r0, r2)
            r1.mo12445c(r0, r2)
            r1.mo12443a(r0, r2)
            return
    }
}
