package p105g2;

/* renamed from: g2.g */
/* loaded from: classes.dex */
public class C2213g implements p105g2.InterfaceC2223q {

    /* renamed from: a */
    public final java.util.concurrent.Executor f10123a;

    /* renamed from: g2.g$a */
    public class a implements java.util.concurrent.Executor {

        /* renamed from: Y */
        public final /* synthetic */ android.os.Handler f10124Y;

        public a(p105g2.C2213g r1, android.os.Handler r2) {
                r0 = this;
                r0.f10124Y = r2
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r2) {
                r1 = this;
                android.os.Handler r0 = r1.f10124Y
                r0.post(r2)
                return
        }
    }

    /* renamed from: g2.g$b */
    public static class b implements java.lang.Runnable {

        /* renamed from: Y */
        public final p105g2.AbstractC2220n f10125Y;

        /* renamed from: Z */
        public final p105g2.C2222p f10126Z;

        /* renamed from: a0 */
        public final java.lang.Runnable f10127a0;

        public b(p105g2.AbstractC2220n r1, p105g2.C2222p r2, java.lang.Runnable r3) {
                r0 = this;
                r0.<init>()
                r0.f10125Y = r1
                r0.f10126Z = r2
                r0.f10127a0 = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                g2.n r0 = r3.f10125Y
                boolean r0 = r0.m5808r()
                if (r0 == 0) goto L10
                g2.n r0 = r3.f10125Y
                java.lang.String r1 = "canceled-at-delivery"
                r0.m5804k(r1)
                return
            L10:
                g2.p r0 = r3.f10126Z
                g2.t r1 = r0.f10173c
                if (r1 != 0) goto L18
                r2 = 1
                goto L19
            L18:
                r2 = 0
            L19:
                if (r2 == 0) goto L23
                g2.n r1 = r3.f10125Y
                T r0 = r0.f10171a
                r1.mo5803h(r0)
                goto L30
            L23:
                g2.n r0 = r3.f10125Y
                java.lang.Object r2 = r0.f10144c0
                monitor-enter(r2)
                g2.p$a r0 = r0.f10145d0     // Catch: java.lang.Throwable -> L4d
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
                if (r0 == 0) goto L30
                r0.mo118a(r1)
            L30:
                g2.p r0 = r3.f10126Z
                boolean r0 = r0.f10174d
                if (r0 == 0) goto L3e
                g2.n r0 = r3.f10125Y
                java.lang.String r1 = "intermediate-response"
                r0.m5801e(r1)
                goto L45
            L3e:
                g2.n r0 = r3.f10125Y
                java.lang.String r1 = "done"
                r0.m5804k(r1)
            L45:
                java.lang.Runnable r0 = r3.f10127a0
                if (r0 == 0) goto L4c
                r0.run()
            L4c:
                return
            L4d:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
                throw r0
        }
    }

    public C2213g(android.os.Handler r2) {
            r1 = this;
            r1.<init>()
            g2.g$a r0 = new g2.g$a
            r0.<init>(r1, r2)
            r1.f10123a = r0
            return
    }

    /* renamed from: a */
    public void m5799a(p105g2.AbstractC2220n<?> r3, p105g2.C2222p<?> r4, java.lang.Runnable r5) {
            r2 = this;
            java.lang.Object r0 = r3.f10144c0
            monitor-enter(r0)
            r1 = 1
            r3.f10150i0 = r1     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = "post-response"
            r3.m5801e(r0)
            java.util.concurrent.Executor r0 = r2.f10123a
            g2.g$b r1 = new g2.g$b
            r1.<init>(r3, r4, r5)
            r0.execute(r1)
            return
        L17:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r3
    }
}
