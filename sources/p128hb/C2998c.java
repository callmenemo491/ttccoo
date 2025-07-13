package p128hb;

/* renamed from: hb.c */
/* loaded from: classes.dex */
public class C2998c {

    /* renamed from: d */
    public static final java.util.Map<java.lang.String, p128hb.C2998c> f12093d = null;

    /* renamed from: e */
    public static final java.util.concurrent.Executor f12094e = null;

    /* renamed from: a */
    public final java.util.concurrent.ExecutorService f12095a;

    /* renamed from: b */
    public final p128hb.C3002g f12096b;

    /* renamed from: c */
    public p327s7.AbstractC5985i<p128hb.C2999d> f12097c;

    /* renamed from: hb.c$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: hb.c$b */
    public static class b<TResult> implements p327s7.InterfaceC5982f<TResult>, p327s7.InterfaceC5981e, p327s7.InterfaceC5979c {

        /* renamed from: Y */
        public final java.util.concurrent.CountDownLatch f12098Y;

        public b(p128hb.C2998c.a r2) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch
                r0 = 1
                r2.<init>(r0)
                r1.f12098Y = r2
                return
        }

        @Override // p327s7.InterfaceC5979c
        /* renamed from: a */
        public void mo7372a() {
                r1 = this;
                java.util.concurrent.CountDownLatch r0 = r1.f12098Y
                r0.countDown()
                return
        }

        @Override // p327s7.InterfaceC5981e
        /* renamed from: c */
        public void mo4109c(java.lang.Exception r1) {
                r0 = this;
                java.util.concurrent.CountDownLatch r1 = r0.f12098Y
                r1.countDown()
                return
        }

        @Override // p327s7.InterfaceC5982f
        /* renamed from: d */
        public void mo1270d(TResult r1) {
                r0 = this;
                java.util.concurrent.CountDownLatch r1 = r0.f12098Y
                r1.countDown()
                return
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            p128hb.C2998c.f12093d = r0
            hb.a r0 = p128hb.ExecutorC2996a.f12089Y
            p128hb.C2998c.f12094e = r0
            return
    }

    public C2998c(java.util.concurrent.ExecutorService r1, p128hb.C3002g r2) {
            r0 = this;
            r0.<init>()
            r0.f12095a = r1
            r0.f12096b = r2
            r1 = 0
            r0.f12097c = r1
            return
    }

    /* renamed from: a */
    public static <TResult> TResult m7369a(p327s7.AbstractC5985i<TResult> r2, long r3, java.util.concurrent.TimeUnit r5) {
            hb.c$b r0 = new hb.c$b
            r1 = 0
            r0.<init>(r1)
            java.util.concurrent.Executor r1 = p128hb.C2998c.f12094e
            r2.mo12446d(r1, r0)
            r2.mo12445c(r1, r0)
            r2.mo12443a(r1, r0)
            java.util.concurrent.CountDownLatch r0 = r0.f12098Y
            boolean r3 = r0.await(r3, r5)
            if (r3 == 0) goto L2e
            boolean r3 = r2.mo12455m()
            if (r3 == 0) goto L24
            java.lang.Object r2 = r2.mo12451i()
            return r2
        L24:
            java.util.concurrent.ExecutionException r3 = new java.util.concurrent.ExecutionException
            java.lang.Exception r2 = r2.mo12450h()
            r3.<init>(r2)
            throw r3
        L2e:
            java.util.concurrent.TimeoutException r2 = new java.util.concurrent.TimeoutException
            java.lang.String r3 = "Task await timed out."
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: b */
    public synchronized p327s7.AbstractC5985i<p128hb.C2999d> m7370b() {
            r3 = this;
            monitor-enter(r3)
            s7.i<hb.d> r0 = r3.f12097c     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L13
            boolean r0 = r0.mo12454l()     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L25
            s7.i<hb.d> r0 = r3.f12097c     // Catch: java.lang.Throwable -> L29
            boolean r0 = r0.mo12455m()     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L25
        L13:
            java.util.concurrent.ExecutorService r0 = r3.f12095a     // Catch: java.lang.Throwable -> L29
            hb.g r1 = r3.f12096b     // Catch: java.lang.Throwable -> L29
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> L29
            gb.i r2 = new gb.i     // Catch: java.lang.Throwable -> L29
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L29
            s7.i r0 = p327s7.C5988l.m12462c(r0, r2)     // Catch: java.lang.Throwable -> L29
            r3.f12097c = r0     // Catch: java.lang.Throwable -> L29
        L25:
            s7.i<hb.d> r0 = r3.f12097c     // Catch: java.lang.Throwable -> L29
            monitor-exit(r3)
            return r0
        L29:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    /* renamed from: c */
    public p327s7.AbstractC5985i<p128hb.C2999d> m7371c(p128hb.C2999d r5) {
            r4 = this;
            java.util.concurrent.ExecutorService r0 = r4.f12095a
            gb.a r1 = new gb.a
            r1.<init>(r4, r5)
            s7.i r0 = p327s7.C5988l.m12462c(r0, r1)
            java.util.concurrent.ExecutorService r1 = r4.f12095a
            hb.b r2 = new hb.b
            r3 = 1
            r2.<init>(r4, r3, r5)
            s7.i r5 = r0.mo12456n(r1, r2)
            return r5
    }
}
