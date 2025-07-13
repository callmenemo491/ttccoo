package p260oi;

/* renamed from: oi.b */
/* loaded from: classes.dex */
public class C5280b extends p260oi.C5279a0 {

    /* renamed from: h */
    public static final long f20489h = 0;

    /* renamed from: i */
    public static final long f20490i = 0;

    /* renamed from: j */
    public static p260oi.C5280b f20491j;

    /* renamed from: k */
    public static final p260oi.C5280b.a f20492k = null;

    /* renamed from: e */
    public boolean f20493e;

    /* renamed from: f */
    public p260oi.C5280b f20494f;

    /* renamed from: g */
    public long f20495g;

    /* renamed from: oi.b$a */
    public static final class a {
        public a(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public final p260oi.C5280b m11533a() {
                r9 = this;
                java.lang.Class<oi.b> r0 = p260oi.C5280b.class
                oi.b r1 = p260oi.C5280b.f20491j
                p214m2.C4339q.m9704i(r1)
                oi.b r1 = r1.f20494f
                r2 = 0
                long r3 = java.lang.System.nanoTime()
                if (r1 != 0) goto L2c
                long r5 = p260oi.C5280b.f20489h
                r0.wait(r5)
                oi.b r0 = p260oi.C5280b.f20491j
                p214m2.C4339q.m9704i(r0)
                oi.b r0 = r0.f20494f
                if (r0 != 0) goto L2b
                long r0 = java.lang.System.nanoTime()
                long r0 = r0 - r3
                long r3 = p260oi.C5280b.f20490i
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 < 0) goto L2b
                oi.b r2 = p260oi.C5280b.f20491j
            L2b:
                return r2
            L2c:
                long r5 = r1.f20495g
                long r5 = r5 - r3
                r3 = 0
                int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r7 <= 0) goto L42
                r3 = 1000000(0xf4240, double:4.940656E-318)
                long r7 = r5 / r3
                long r3 = r3 * r7
                long r5 = r5 - r3
                int r1 = (int) r5
                r0.wait(r7, r1)
                return r2
            L42:
                oi.b r0 = p260oi.C5280b.f20491j
                p214m2.C4339q.m9704i(r0)
                oi.b r3 = r1.f20494f
                r0.f20494f = r3
                r1.f20494f = r2
                return r1
        }
    }

    /* renamed from: oi.b$b */
    public static final class b extends java.lang.Thread {
        public b() {
                r1 = this;
                java.lang.String r0 = "Okio Watchdog"
                r1.<init>(r0)
                r0 = 1
                r1.setDaemon(r0)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r3 = this;
            L0:
                java.lang.Class<oi.b> r0 = p260oi.C5280b.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                oi.b$a r1 = p260oi.C5280b.f20492k     // Catch: java.lang.Throwable -> L19
                oi.b r1 = r1.m11533a()     // Catch: java.lang.Throwable -> L19
                oi.b r2 = p260oi.C5280b.f20491j     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L12
                r1 = 0
                p260oi.C5280b.f20491j = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.InterruptedException -> L0
                return
            L12:
                monitor-exit(r0)     // Catch: java.lang.InterruptedException -> L0
                if (r1 == 0) goto L0
                r1.mo5761k()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.InterruptedException -> L0
                throw r1     // Catch: java.lang.InterruptedException -> L0
        }
    }

    static {
            oi.b$a r0 = new oi.b$a
            r1 = 0
            r0.<init>(r1)
            p260oi.C5280b.f20492k = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 60
            long r0 = r0.toMillis(r1)
            p260oi.C5280b.f20489h = r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r2.toNanos(r0)
            p260oi.C5280b.f20490i = r0
            return
    }

    public C5280b() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: h */
    public final void m11531h() {
            r9 = this;
            boolean r0 = r9.f20493e
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L79
            long r2 = r9.f20488c
            boolean r0 = r9.f20486a
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L13
            if (r0 != 0) goto L13
            return
        L13:
            r9.f20493e = r1
            java.lang.Class<oi.b> r1 = p260oi.C5280b.class
            monitor-enter(r1)
            oi.b r4 = p260oi.C5280b.f20491j     // Catch: java.lang.Throwable -> L76
            if (r4 != 0) goto L2b
            oi.b r4 = new oi.b     // Catch: java.lang.Throwable -> L76
            r4.<init>()     // Catch: java.lang.Throwable -> L76
            p260oi.C5280b.f20491j = r4     // Catch: java.lang.Throwable -> L76
            oi.b$b r4 = new oi.b$b     // Catch: java.lang.Throwable -> L76
            r4.<init>()     // Catch: java.lang.Throwable -> L76
            r4.start()     // Catch: java.lang.Throwable -> L76
        L2b:
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L76
            if (r6 == 0) goto L3d
            if (r0 == 0) goto L3d
            long r6 = r9.mo11526c()     // Catch: java.lang.Throwable -> L76
            long r6 = r6 - r4
            long r2 = java.lang.Math.min(r2, r6)     // Catch: java.lang.Throwable -> L76
            goto L3f
        L3d:
            if (r6 == 0) goto L41
        L3f:
            long r2 = r2 + r4
            goto L47
        L41:
            if (r0 == 0) goto L70
            long r2 = r9.mo11526c()     // Catch: java.lang.Throwable -> L76
        L47:
            r9.f20495g = r2     // Catch: java.lang.Throwable -> L76
            long r2 = r2 - r4
            oi.b r0 = p260oi.C5280b.f20491j     // Catch: java.lang.Throwable -> L76
        L4c:
            p214m2.C4339q.m9704i(r0)     // Catch: java.lang.Throwable -> L76
            oi.b r6 = r0.f20494f     // Catch: java.lang.Throwable -> L76
            if (r6 == 0) goto L61
            p214m2.C4339q.m9704i(r6)     // Catch: java.lang.Throwable -> L76
            long r6 = r6.f20495g     // Catch: java.lang.Throwable -> L76
            long r6 = r6 - r4
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 >= 0) goto L5e
            goto L61
        L5e:
            oi.b r0 = r0.f20494f     // Catch: java.lang.Throwable -> L76
            goto L4c
        L61:
            oi.b r2 = r0.f20494f     // Catch: java.lang.Throwable -> L76
            r9.f20494f = r2     // Catch: java.lang.Throwable -> L76
            r0.f20494f = r9     // Catch: java.lang.Throwable -> L76
            oi.b r2 = p260oi.C5280b.f20491j     // Catch: java.lang.Throwable -> L76
            if (r0 != r2) goto L6e
            r1.notify()     // Catch: java.lang.Throwable -> L76
        L6e:
            monitor-exit(r1)
            return
        L70:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L76
            r0.<init>()     // Catch: java.lang.Throwable -> L76
            throw r0     // Catch: java.lang.Throwable -> L76
        L76:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L79:
            java.lang.String r0 = "Unbalanced enter/exit"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: i */
    public final boolean m11532i() {
            r4 = this;
            boolean r0 = r4.f20493e
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r4.f20493e = r1
            java.lang.Class<oi.b> r0 = p260oi.C5280b.class
            monitor-enter(r0)
            oi.b r2 = p260oi.C5280b.f20491j     // Catch: java.lang.Throwable -> L20
        Ld:
            if (r2 == 0) goto L1d
            oi.b r3 = r2.f20494f     // Catch: java.lang.Throwable -> L20
            if (r3 != r4) goto L1b
            oi.b r3 = r4.f20494f     // Catch: java.lang.Throwable -> L20
            r2.f20494f = r3     // Catch: java.lang.Throwable -> L20
            r2 = 0
            r4.f20494f = r2     // Catch: java.lang.Throwable -> L20
            goto L1e
        L1b:
            r2 = r3
            goto Ld
        L1d:
            r1 = 1
        L1e:
            monitor-exit(r0)
            return r1
        L20:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* renamed from: j */
    public java.io.IOException mo7667j(java.io.IOException r3) {
            r2 = this;
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "timeout"
            r0.<init>(r1)
            if (r3 == 0) goto Lc
            r0.initCause(r3)
        Lc:
            return r0
    }

    /* renamed from: k */
    public void mo5761k() {
            r0 = this;
            return
    }
}
