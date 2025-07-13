package p371v5;

/* renamed from: v5.x */
/* loaded from: classes.dex */
public final class C6574x implements p371v5.InterfaceC6563m {

    /* renamed from: b */
    public static final java.util.List<p371v5.C6574x.b> f25718b = null;

    /* renamed from: a */
    public final android.os.Handler f25719a;

    /* renamed from: v5.x$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: v5.x$b */
    public static final class b implements p371v5.InterfaceC6563m.a {

        /* renamed from: a */
        public android.os.Message f25720a;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        public b(p371v5.C6574x.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public final void m13427a() {
                r3 = this;
                r0 = 0
                r3.f25720a = r0
                java.util.List<v5.x$b> r0 = p371v5.C6574x.f25718b
                monitor-enter(r0)
                r1 = r0
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L19
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L19
                r2 = 50
                if (r1 >= r2) goto L17
                r1 = r0
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L19
                r1.add(r3)     // Catch: java.lang.Throwable -> L19
            L17:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1
        }

        /* renamed from: b */
        public void m13428b() {
                r1 = this;
                android.os.Message r0 = r1.f25720a
                java.util.Objects.requireNonNull(r0)
                r0.sendToTarget()
                r1.m13427a()
                return
        }
    }

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 50
            r0.<init>(r1)
            p371v5.C6574x.f25718b = r0
            return
    }

    public C6574x(android.os.Handler r1) {
            r0 = this;
            r0.<init>()
            r0.f25719a = r1
            return
    }

    /* renamed from: l */
    public static p371v5.C6574x.b m13426l() {
            java.util.List<v5.x$b> r0 = p371v5.C6574x.f25718b
            monitor-enter(r0)
            r1 = r0
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L29
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L13
            v5.x$b r1 = new v5.x$b     // Catch: java.lang.Throwable -> L29
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L29
            goto L25
        L13:
            r1 = r0
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L29
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L29
            int r1 = r1 + (-1)
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L29
            java.lang.Object r1 = r2.remove(r1)     // Catch: java.lang.Throwable -> L29
            v5.x$b r1 = (p371v5.C6574x.b) r1     // Catch: java.lang.Throwable -> L29
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return r1
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r1
        L29:
            r1 = move-exception
            goto L27
    }

    @Override // p371v5.InterfaceC6563m
    /* renamed from: a */
    public boolean mo13353a(int r2) {
            r1 = this;
            android.os.Handler r0 = r1.f25719a
            boolean r2 = r0.hasMessages(r2)
            return r2
    }

    @Override // p371v5.InterfaceC6563m
    /* renamed from: b */
    public p371v5.InterfaceC6563m.a mo13354b(int r3, int r4, int r5) {
            r2 = this;
            v5.x$b r0 = m13426l()
            android.os.Handler r1 = r2.f25719a
            android.os.Message r3 = r1.obtainMessage(r3, r4, r5)
            r0.f25720a = r3
            return r0
    }

    @Override // p371v5.InterfaceC6563m
    /* renamed from: c */
    public boolean mo13355c(int r2) {
            r1 = this;
            android.os.Handler r0 = r1.f25719a
            boolean r2 = r0.sendEmptyMessage(r2)
            return r2
    }

    @Override // p371v5.InterfaceC6563m
    /* renamed from: d */
    public p371v5.InterfaceC6563m.a mo13356d(int r3, int r4, int r5, java.lang.Object r6) {
            r2 = this;
            v5.x$b r0 = m13426l()
            android.os.Handler r1 = r2.f25719a
            android.os.Message r3 = r1.obtainMessage(r3, r4, r5, r6)
            r0.f25720a = r3
            return r0
    }

    @Override // p371v5.InterfaceC6563m
    /* renamed from: e */
    public boolean mo13357e(p371v5.InterfaceC6563m.a r3) {
            r2 = this;
            v5.x$b r3 = (p371v5.C6574x.b) r3
            android.os.Handler r0 = r2.f25719a
            android.os.Message r1 = r3.f25720a
            java.util.Objects.requireNonNull(r1)
            boolean r0 = r0.sendMessageAtFrontOfQueue(r1)
            r3.m13427a()
            return r0
    }

    @Override // p371v5.InterfaceC6563m
    /* renamed from: f */
    public boolean mo13358f(int r2, long r3) {
            r1 = this;
            android.os.Handler r0 = r1.f25719a
            boolean r2 = r0.sendEmptyMessageAtTime(r2, r3)
            return r2
    }

    @Override // p371v5.InterfaceC6563m
    /* renamed from: g */
    public void mo13359g(int r2) {
            r1 = this;
            android.os.Handler r0 = r1.f25719a
            r0.removeMessages(r2)
            return
    }

    @Override // p371v5.InterfaceC6563m
    /* renamed from: h */
    public p371v5.InterfaceC6563m.a mo13360h(int r3, java.lang.Object r4) {
            r2 = this;
            v5.x$b r0 = m13426l()
            android.os.Handler r1 = r2.f25719a
            android.os.Message r3 = r1.obtainMessage(r3, r4)
            r0.f25720a = r3
            return r0
    }

    @Override // p371v5.InterfaceC6563m
    /* renamed from: i */
    public void mo13361i(java.lang.Object r2) {
            r1 = this;
            android.os.Handler r2 = r1.f25719a
            r0 = 0
            r2.removeCallbacksAndMessages(r0)
            return
    }

    @Override // p371v5.InterfaceC6563m
    /* renamed from: j */
    public boolean mo13362j(java.lang.Runnable r2) {
            r1 = this;
            android.os.Handler r0 = r1.f25719a
            boolean r2 = r0.post(r2)
            return r2
    }

    @Override // p371v5.InterfaceC6563m
    /* renamed from: k */
    public p371v5.InterfaceC6563m.a mo13363k(int r3) {
            r2 = this;
            v5.x$b r0 = m13426l()
            android.os.Handler r1 = r2.f25719a
            android.os.Message r3 = r1.obtainMessage(r3)
            r0.f25720a = r3
            return r0
    }
}
