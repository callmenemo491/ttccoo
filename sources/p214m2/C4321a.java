package p214m2;

/* renamed from: m2.a */
/* loaded from: classes.dex */
public final class C4321a {

    /* renamed from: a */
    public final boolean f17614a;

    /* renamed from: b */
    public final java.util.Map<p180k2.InterfaceC3671c, p214m2.C4321a.b> f17615b;

    /* renamed from: c */
    public final java.lang.ref.ReferenceQueue<p214m2.C4340r<?>> f17616c;

    /* renamed from: d */
    public p214m2.C4340r.a f17617d;

    /* renamed from: m2.a$a */
    public class a implements java.util.concurrent.ThreadFactory {

        /* renamed from: m2.a$a$a, reason: collision with other inner class name */
        public class RunnableC7404a implements java.lang.Runnable {

            /* renamed from: Y */
            public final /* synthetic */ java.lang.Runnable f17618Y;

            public RunnableC7404a(p214m2.C4321a.a r1, java.lang.Runnable r2) {
                    r0 = this;
                    r0.f17618Y = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r1 = this;
                    r0 = 10
                    android.os.Process.setThreadPriority(r0)
                    java.lang.Runnable r0 = r1.f17618Y
                    r0.run()
                    return
            }
        }

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable r3) {
                r2 = this;
                java.lang.Thread r0 = new java.lang.Thread
                m2.a$a$a r1 = new m2.a$a$a
                r1.<init>(r2, r3)
                java.lang.String r3 = "glide-active-resources"
                r0.<init>(r1, r3)
                return r0
        }
    }

    /* renamed from: m2.a$b */
    public static final class b extends java.lang.ref.WeakReference<p214m2.C4340r<?>> {

        /* renamed from: a */
        public final p180k2.InterfaceC3671c f17619a;

        /* renamed from: b */
        public final boolean f17620b;

        /* renamed from: c */
        public p214m2.InterfaceC4345w<?> f17621c;

        public b(p180k2.InterfaceC3671c r1, p214m2.C4340r<?> r2, java.lang.ref.ReferenceQueue<? super p214m2.C4340r<?>> r3, boolean r4) {
                r0 = this;
                r0.<init>(r2, r3)
                java.lang.String r3 = "Argument must not be null"
                java.util.Objects.requireNonNull(r1, r3)
                r0.f17619a = r1
                boolean r1 = r2.f17792Y
                if (r1 == 0) goto L16
                if (r4 == 0) goto L16
                m2.w<Z> r1 = r2.f17794a0
                java.util.Objects.requireNonNull(r1, r3)
                goto L17
            L16:
                r1 = 0
            L17:
                r0.f17621c = r1
                boolean r1 = r2.f17792Y
                r0.f17620b = r1
                return
        }
    }

    public C4321a(boolean r3) {
            r2 = this;
            m2.a$a r0 = new m2.a$a
            r0.<init>()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            r2.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.f17615b = r1
            java.lang.ref.ReferenceQueue r1 = new java.lang.ref.ReferenceQueue
            r1.<init>()
            r2.f17616c = r1
            r2.f17614a = r3
            m2.b r3 = new m2.b
            r3.<init>(r2)
            r0.execute(r3)
            return
    }

    /* renamed from: a */
    public synchronized void m9653a(p180k2.InterfaceC3671c r4, p214m2.C4340r<?> r5) {
            r3 = this;
            monitor-enter(r3)
            m2.a$b r0 = new m2.a$b     // Catch: java.lang.Throwable -> L1c
            java.lang.ref.ReferenceQueue<m2.r<?>> r1 = r3.f17616c     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r3.f17614a     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r4, r5, r1, r2)     // Catch: java.lang.Throwable -> L1c
            java.util.Map<k2.c, m2.a$b> r5 = r3.f17615b     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r4 = r5.put(r4, r0)     // Catch: java.lang.Throwable -> L1c
            m2.a$b r4 = (p214m2.C4321a.b) r4     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L1a
            r5 = 0
            r4.f17621c = r5     // Catch: java.lang.Throwable -> L1c
            r4.clear()     // Catch: java.lang.Throwable -> L1c
        L1a:
            monitor-exit(r3)
            return
        L1c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    /* renamed from: b */
    public void m9654b(p214m2.C4321a.b r8) {
            r7 = this;
            monitor-enter(r7)
            java.util.Map<k2.c, m2.a$b> r0 = r7.f17615b     // Catch: java.lang.Throwable -> L28
            k2.c r1 = r8.f17619a     // Catch: java.lang.Throwable -> L28
            r0.remove(r1)     // Catch: java.lang.Throwable -> L28
            boolean r0 = r8.f17620b     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L26
            m2.w<?> r2 = r8.f17621c     // Catch: java.lang.Throwable -> L28
            if (r2 != 0) goto L11
            goto L26
        L11:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L28
            m2.r r0 = new m2.r
            r3 = 1
            r4 = 0
            k2.c r5 = r8.f17619a
            m2.r$a r6 = r7.f17617d
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            m2.r$a r1 = r7.f17617d
            k2.c r8 = r8.f17619a
            r1.mo9685a(r8, r0)
            return
        L26:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L28
            return
        L28:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L28
            throw r8
    }
}
