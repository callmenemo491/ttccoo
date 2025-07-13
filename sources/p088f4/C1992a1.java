package p088f4;

/* renamed from: f4.a1 */
/* loaded from: classes.dex */
public final class C1992a1 {

    /* renamed from: a */
    public final p088f4.C1992a1.b f8775a;

    /* renamed from: b */
    public final p088f4.C1992a1.a f8776b;

    /* renamed from: c */
    public final p371v5.InterfaceC6553c f8777c;

    /* renamed from: d */
    public final p088f4.AbstractC2031n1 f8778d;

    /* renamed from: e */
    public int f8779e;

    /* renamed from: f */
    public java.lang.Object f8780f;

    /* renamed from: g */
    public android.os.Looper f8781g;

    /* renamed from: h */
    public int f8782h;

    /* renamed from: i */
    public boolean f8783i;

    /* renamed from: j */
    public boolean f8784j;

    /* renamed from: k */
    public boolean f8785k;

    /* renamed from: f4.a1$a */
    public interface a {
    }

    /* renamed from: f4.a1$b */
    public interface b {
        /* renamed from: n */
        void mo5108n(int r1, java.lang.Object r2);
    }

    public C1992a1(p088f4.C1992a1.a r1, p088f4.C1992a1.b r2, p088f4.AbstractC2031n1 r3, int r4, p371v5.InterfaceC6553c r5, android.os.Looper r6) {
            r0 = this;
            r0.<init>()
            r0.f8776b = r1
            r0.f8775a = r2
            r0.f8778d = r3
            r0.f8781g = r6
            r0.f8777c = r5
            r0.f8782h = r4
            return
    }

    /* renamed from: a */
    public synchronized boolean m5103a(long r7) {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f8783i     // Catch: java.lang.Throwable -> L48
            p371v5.C6549a.m13291e(r0)     // Catch: java.lang.Throwable -> L48
            android.os.Looper r0 = r6.f8781g     // Catch: java.lang.Throwable -> L48
            java.lang.Thread r0 = r0.getThread()     // Catch: java.lang.Throwable -> L48
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L48
            if (r0 == r1) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            p371v5.C6549a.m13291e(r0)     // Catch: java.lang.Throwable -> L48
            v5.c r0 = r6.f8777c     // Catch: java.lang.Throwable -> L48
            long r0 = r0.mo13337d()     // Catch: java.lang.Throwable -> L48
            long r0 = r0 + r7
        L1f:
            boolean r2 = r6.f8785k     // Catch: java.lang.Throwable -> L48
            if (r2 != 0) goto L3a
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 <= 0) goto L3a
            v5.c r2 = r6.f8777c     // Catch: java.lang.Throwable -> L48
            r2.mo13336c()     // Catch: java.lang.Throwable -> L48
            r6.wait(r7)     // Catch: java.lang.Throwable -> L48
            v5.c r7 = r6.f8777c     // Catch: java.lang.Throwable -> L48
            long r7 = r7.mo13337d()     // Catch: java.lang.Throwable -> L48
            long r7 = r0 - r7
            goto L1f
        L3a:
            if (r2 == 0) goto L40
            boolean r7 = r6.f8784j     // Catch: java.lang.Throwable -> L48
            monitor-exit(r6)
            return r7
        L40:
            java.util.concurrent.TimeoutException r7 = new java.util.concurrent.TimeoutException     // Catch: java.lang.Throwable -> L48
            java.lang.String r8 = "Message delivery timed out."
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L48
            throw r7     // Catch: java.lang.Throwable -> L48
        L48:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    /* renamed from: b */
    public synchronized boolean m5104b() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            monitor-exit(r1)
            return r0
    }

    /* renamed from: c */
    public synchronized void m5105c(boolean r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f8784j     // Catch: java.lang.Throwable -> Le
            r2 = r2 | r0
            r1.f8784j = r2     // Catch: java.lang.Throwable -> Le
            r2 = 1
            r1.f8785k = r2     // Catch: java.lang.Throwable -> Le
            r1.notifyAll()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        Le:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    /* renamed from: d */
    public p088f4.C1992a1 m5106d() {
            r3 = this;
            boolean r0 = r3.f8783i
            r1 = 1
            r0 = r0 ^ r1
            p371v5.C6549a.m13291e(r0)
            r3.f8783i = r1
            f4.a1$a r0 = r3.f8776b
            f4.b0 r0 = (p088f4.C1994b0) r0
            monitor-enter(r0)
            boolean r1 = r0.f8830x0     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L29
            android.os.HandlerThread r1 = r0.f8813g0     // Catch: java.lang.Throwable -> L36
            boolean r1 = r1.isAlive()     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L1b
            goto L29
        L1b:
            v5.m r1 = r0.f8812f0     // Catch: java.lang.Throwable -> L36
            r2 = 14
            v5.m$a r1 = r1.mo13360h(r2, r3)     // Catch: java.lang.Throwable -> L36
            v5.x$b r1 = (p371v5.C6574x.b) r1     // Catch: java.lang.Throwable -> L36
            r1.m13428b()     // Catch: java.lang.Throwable -> L36
            goto L34
        L29:
            java.lang.String r1 = "ExoPlayerImplInternal"
            java.lang.String r2 = "Ignoring messages sent after release."
            android.util.Log.w(r1, r2)     // Catch: java.lang.Throwable -> L36
            r1 = 0
            r3.m5105c(r1)     // Catch: java.lang.Throwable -> L36
        L34:
            monitor-exit(r0)
            return r3
        L36:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* renamed from: e */
    public p088f4.C1992a1 m5107e(int r2) {
            r1 = this;
            boolean r0 = r1.f8783i
            r0 = r0 ^ 1
            p371v5.C6549a.m13291e(r0)
            r1.f8779e = r2
            return r1
    }
}
