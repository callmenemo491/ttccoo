package p214m2;

/* renamed from: m2.l */
/* loaded from: classes.dex */
public class C4334l implements p214m2.InterfaceC4336n, p244o2.InterfaceC4885i.a, p214m2.C4340r.a {

    /* renamed from: h */
    public static final boolean f17724h = false;

    /* renamed from: a */
    public final androidx.appcompat.widget.C0311x f17725a;

    /* renamed from: b */
    public final p214m2.C4339q f17726b;

    /* renamed from: c */
    public final p244o2.InterfaceC4885i f17727c;

    /* renamed from: d */
    public final p214m2.C4334l.b f17728d;

    /* renamed from: e */
    public final p214m2.C4348z f17729e;

    /* renamed from: f */
    public final p214m2.C4334l.a f17730f;

    /* renamed from: g */
    public final p214m2.C4321a f17731g;

    /* renamed from: m2.l$a */
    public static class a {

        /* renamed from: a */
        public final p214m2.RunnableC4331i.d f17732a;

        /* renamed from: b */
        public final p212m0.InterfaceC4313c<p214m2.RunnableC4331i<?>> f17733b;

        /* renamed from: c */
        public int f17734c;

        /* renamed from: m2.l$a$a, reason: collision with other inner class name */
        public class C7405a implements p120h3.C2451a.b<p214m2.RunnableC4331i<?>> {

            /* renamed from: a */
            public final /* synthetic */ p214m2.C4334l.a f17735a;

            public C7405a(p214m2.C4334l.a r1) {
                    r0 = this;
                    r0.f17735a = r1
                    r0.<init>()
                    return
            }

            @Override // p120h3.C2451a.b
            /* renamed from: a */
            public p214m2.RunnableC4331i<?> mo6229a() {
                    r3 = this;
                    m2.i r0 = new m2.i
                    m2.l$a r1 = r3.f17735a
                    m2.i$d r2 = r1.f17732a
                    m0.c<m2.i<?>> r1 = r1.f17733b
                    r0.<init>(r2, r1)
                    return r0
            }
        }

        public a(p214m2.RunnableC4331i.d r3) {
                r2 = this;
                r2.<init>()
                m2.l$a$a r0 = new m2.l$a$a
                r0.<init>(r2)
                r1 = 150(0x96, float:2.1E-43)
                m0.c r0 = p120h3.C2451a.m6227a(r1, r0)
                r2.f17733b = r0
                r2.f17732a = r3
                return
        }
    }

    /* renamed from: m2.l$b */
    public static class b {

        /* renamed from: a */
        public final p266p2.ExecutorServiceC5346a f17736a;

        /* renamed from: b */
        public final p266p2.ExecutorServiceC5346a f17737b;

        /* renamed from: c */
        public final p266p2.ExecutorServiceC5346a f17738c;

        /* renamed from: d */
        public final p266p2.ExecutorServiceC5346a f17739d;

        /* renamed from: e */
        public final p214m2.InterfaceC4336n f17740e;

        /* renamed from: f */
        public final p214m2.C4340r.a f17741f;

        /* renamed from: g */
        public final p212m0.InterfaceC4313c<p214m2.C4335m<?>> f17742g;

        /* renamed from: m2.l$b$a */
        public class a implements p120h3.C2451a.b<p214m2.C4335m<?>> {

            /* renamed from: a */
            public final /* synthetic */ p214m2.C4334l.b f17743a;

            public a(p214m2.C4334l.b r1) {
                    r0 = this;
                    r0.f17743a = r1
                    r0.<init>()
                    return
            }

            @Override // p120h3.C2451a.b
            /* renamed from: a */
            public p214m2.C4335m<?> mo6229a() {
                    r9 = this;
                    m2.m r8 = new m2.m
                    m2.l$b r0 = r9.f17743a
                    p2.a r1 = r0.f17736a
                    p2.a r2 = r0.f17737b
                    p2.a r3 = r0.f17738c
                    p2.a r4 = r0.f17739d
                    m2.n r5 = r0.f17740e
                    m2.r$a r6 = r0.f17741f
                    m0.c<m2.m<?>> r7 = r0.f17742g
                    r0 = r8
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                    return r8
            }
        }

        public b(p266p2.ExecutorServiceC5346a r3, p266p2.ExecutorServiceC5346a r4, p266p2.ExecutorServiceC5346a r5, p266p2.ExecutorServiceC5346a r6, p214m2.InterfaceC4336n r7, p214m2.C4340r.a r8) {
                r2 = this;
                r2.<init>()
                m2.l$b$a r0 = new m2.l$b$a
                r0.<init>(r2)
                r1 = 150(0x96, float:2.1E-43)
                m0.c r0 = p120h3.C2451a.m6227a(r1, r0)
                r2.f17742g = r0
                r2.f17736a = r3
                r2.f17737b = r4
                r2.f17738c = r5
                r2.f17739d = r6
                r2.f17740e = r7
                r2.f17741f = r8
                return
        }
    }

    /* renamed from: m2.l$c */
    public static class c implements p214m2.RunnableC4331i.d {

        /* renamed from: a */
        public final p244o2.InterfaceC4877a.a f17744a;

        /* renamed from: b */
        public volatile p244o2.InterfaceC4877a f17745b;

        public c(p244o2.InterfaceC4877a.a r1) {
                r0 = this;
                r0.<init>()
                r0.f17744a = r1
                return
        }

        /* renamed from: a */
        public p244o2.InterfaceC4877a m9691a() {
                r5 = this;
                o2.a r0 = r5.f17745b
                if (r0 != 0) goto L50
                monitor-enter(r5)
                o2.a r0 = r5.f17745b     // Catch: java.lang.Throwable -> L4d
                if (r0 != 0) goto L40
                o2.a$a r0 = r5.f17744a     // Catch: java.lang.Throwable -> L4d
                o2.d r0 = (p244o2.C4880d) r0     // Catch: java.lang.Throwable -> L4d
                o2.d$a r1 = r0.f19363b     // Catch: java.lang.Throwable -> L4d
                o2.f r1 = (p244o2.C4882f) r1     // Catch: java.lang.Throwable -> L4d
                android.content.Context r2 = r1.f19369a     // Catch: java.lang.Throwable -> L4d
                java.io.File r2 = r2.getCacheDir()     // Catch: java.lang.Throwable -> L4d
                r3 = 0
                if (r2 != 0) goto L1c
                r2 = r3
                goto L28
            L1c:
                java.lang.String r4 = r1.f19370b     // Catch: java.lang.Throwable -> L4d
                if (r4 == 0) goto L28
                java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L4d
                java.lang.String r1 = r1.f19370b     // Catch: java.lang.Throwable -> L4d
                r4.<init>(r2, r1)     // Catch: java.lang.Throwable -> L4d
                r2 = r4
            L28:
                if (r2 != 0) goto L2b
                goto L3e
            L2b:
                boolean r1 = r2.isDirectory()     // Catch: java.lang.Throwable -> L4d
                if (r1 != 0) goto L37
                boolean r1 = r2.mkdirs()     // Catch: java.lang.Throwable -> L4d
                if (r1 == 0) goto L3e
            L37:
                long r0 = r0.f19362a     // Catch: java.lang.Throwable -> L4d
                o2.e r3 = new o2.e     // Catch: java.lang.Throwable -> L4d
                r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> L4d
            L3e:
                r5.f17745b = r3     // Catch: java.lang.Throwable -> L4d
            L40:
                o2.a r0 = r5.f17745b     // Catch: java.lang.Throwable -> L4d
                if (r0 != 0) goto L4b
                o2.b r0 = new o2.b     // Catch: java.lang.Throwable -> L4d
                r0.<init>()     // Catch: java.lang.Throwable -> L4d
                r5.f17745b = r0     // Catch: java.lang.Throwable -> L4d
            L4b:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L4d
                goto L50
            L4d:
                r0 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L4d
                throw r0
            L50:
                o2.a r0 = r5.f17745b
                return r0
        }
    }

    /* renamed from: m2.l$d */
    public class d {

        /* renamed from: a */
        public final p214m2.C4335m<?> f17746a;

        /* renamed from: b */
        public final p033c3.InterfaceC0863i f17747b;

        /* renamed from: c */
        public final /* synthetic */ p214m2.C4334l f17748c;

        public d(p214m2.C4334l r1, p033c3.InterfaceC0863i r2, p214m2.C4335m<?> r3) {
                r0 = this;
                r0.f17748c = r1
                r0.<init>()
                r0.f17747b = r2
                r0.f17746a = r3
                return
        }
    }

    static {
            java.lang.String r0 = "Engine"
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            p214m2.C4334l.f17724h = r0
            return
    }

    public C4334l(p244o2.InterfaceC4885i r9, p244o2.InterfaceC4877a.a r10, p266p2.ExecutorServiceC5346a r11, p266p2.ExecutorServiceC5346a r12, p266p2.ExecutorServiceC5346a r13, p266p2.ExecutorServiceC5346a r14, boolean r15) {
            r8 = this;
            r8.<init>()
            r8.f17727c = r9
            m2.l$c r0 = new m2.l$c
            r0.<init>(r10)
            m2.a r10 = new m2.a
            r10.<init>(r15)
            r8.f17731g = r10
            monitor-enter(r8)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L4b
            r10.f17617d = r8     // Catch: java.lang.Throwable -> L48
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4b
            m2.q r10 = new m2.q
            r15 = 0
            r10.<init>(r15)
            r8.f17726b = r10
            androidx.appcompat.widget.x r10 = new androidx.appcompat.widget.x
            r15 = 3
            r10.<init>(r15)
            r8.f17725a = r10
            m2.l$b r10 = new m2.l$b
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r8
            r7 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.f17728d = r10
            m2.l$a r10 = new m2.l$a
            r10.<init>(r0)
            r8.f17730f = r10
            m2.z r10 = new m2.z
            r10.<init>()
            r8.f17729e = r10
            o2.h r9 = (p244o2.C4884h) r9
            r9.f19371e = r8
            return
        L48:
            r9 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L48
            throw r9     // Catch: java.lang.Throwable -> L4b
        L4b:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4b
            throw r9
    }

    /* renamed from: d */
    public static void m9684d(java.lang.String r1, long r2, p180k2.InterfaceC3671c r4) {
            java.lang.String r0 = " in "
            java.lang.StringBuilder r1 = android.support.v4.media.C0143b.m255a(r1, r0)
            double r2 = p106g3.C2234f.m5833a(r2)
            r1.append(r2)
            java.lang.String r2 = "ms, key: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Engine"
            android.util.Log.v(r2, r1)
            return
    }

    @Override // p214m2.C4340r.a
    /* renamed from: a */
    public void mo9685a(p180k2.InterfaceC3671c r4, p214m2.C4340r<?> r5) {
            r3 = this;
            m2.a r0 = r3.f17731g
            monitor-enter(r0)
            java.util.Map<k2.c, m2.a$b> r1 = r0.f17615b     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r1 = r1.remove(r4)     // Catch: java.lang.Throwable -> L2a
            m2.a$b r1 = (p214m2.C4321a.b) r1     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L13
            r2 = 0
            r1.f17621c = r2     // Catch: java.lang.Throwable -> L2a
            r1.clear()     // Catch: java.lang.Throwable -> L2a
        L13:
            monitor-exit(r0)
            boolean r0 = r5.f17792Y
            if (r0 == 0) goto L23
            o2.i r0 = r3.f17727c
            o2.h r0 = (p244o2.C4884h) r0
            java.lang.Object r4 = r0.m5837d(r4, r5)
            m2.w r4 = (p214m2.InterfaceC4345w) r4
            goto L29
        L23:
            m2.z r4 = r3.f17729e
            r0 = 0
            r4.m9733a(r5, r0)
        L29:
            return
        L2a:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    /* renamed from: b */
    public <R> p214m2.C4334l.d m9686b(com.bumptech.glide.C1001e r25, java.lang.Object r26, p180k2.InterfaceC3671c r27, int r28, int r29, java.lang.Class<?> r30, java.lang.Class<R> r31, com.bumptech.glide.EnumC1003g r32, p214m2.AbstractC4333k r33, java.util.Map<java.lang.Class<?>, p180k2.InterfaceC3676h<?>> r34, boolean r35, boolean r36, p180k2.C3673e r37, boolean r38, boolean r39, boolean r40, boolean r41, p033c3.InterfaceC0863i r42, java.util.concurrent.Executor r43) {
            r24 = this;
            r15 = r24
            boolean r0 = p214m2.C4334l.f17724h
            if (r0 == 0) goto Ld
            int r0 = p106g3.C2234f.f10203b
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()
            goto Lf
        Ld:
            r0 = 0
        Lf:
            r13 = r0
            m2.q r0 = r15.f17726b
            java.util.Objects.requireNonNull(r0)
            m2.o r0 = new m2.o
            r1 = r0
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            r6 = r34
            r7 = r30
            r8 = r31
            r9 = r37
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            monitor-enter(r24)
            r12 = r38
            m2.r r1 = r15.m9687c(r0, r12, r13)     // Catch: java.lang.Throwable -> L73
            if (r1 != 0) goto L66
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r33
            r11 = r34
            r12 = r35
            r22 = r13
            r13 = r36
            r14 = r37
            r15 = r38
            r16 = r39
            r17 = r40
            r18 = r41
            r19 = r42
            r20 = r43
            r21 = r0
            m2.l$d r0 = r1.m9690g(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> L73
            monitor-exit(r24)     // Catch: java.lang.Throwable -> L73
            return r0
        L66:
            monitor-exit(r24)     // Catch: java.lang.Throwable -> L73
            com.bumptech.glide.load.a r0 = com.bumptech.glide.load.EnumC1008a.f5184c0
            r2 = 0
            r3 = r42
            c3.j r3 = (p033c3.C0864j) r3
            r3.m2588p(r1, r0, r2)
            r0 = 0
            return r0
        L73:
            r0 = move-exception
            monitor-exit(r24)     // Catch: java.lang.Throwable -> L73
            throw r0
    }

    /* renamed from: c */
    public final p214m2.C4340r<?> m9687c(p214m2.C4337o r9, boolean r10, long r11) {
            r8 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            m2.a r10 = r8.f17731g
            monitor-enter(r10)
            java.util.Map<k2.c, m2.a$b> r1 = r10.f17615b     // Catch: java.lang.Throwable -> L80
            java.lang.Object r1 = r1.get(r9)     // Catch: java.lang.Throwable -> L80
            m2.a$b r1 = (p214m2.C4321a.b) r1     // Catch: java.lang.Throwable -> L80
            if (r1 != 0) goto L14
            monitor-exit(r10)
            r2 = r0
            goto L20
        L14:
            java.lang.Object r2 = r1.get()     // Catch: java.lang.Throwable -> L80
            m2.r r2 = (p214m2.C4340r) r2     // Catch: java.lang.Throwable -> L80
            if (r2 != 0) goto L1f
            r10.m9654b(r1)     // Catch: java.lang.Throwable -> L80
        L1f:
            monitor-exit(r10)
        L20:
            if (r2 == 0) goto L25
            r2.m9719b()
        L25:
            if (r2 == 0) goto L31
            boolean r10 = p214m2.C4334l.f17724h
            if (r10 == 0) goto L30
            java.lang.String r10 = "Loaded resource from active resources"
            m9684d(r10, r11, r9)
        L30:
            return r2
        L31:
            o2.i r10 = r8.f17727c
            o2.h r10 = (p244o2.C4884h) r10
            monitor-enter(r10)
            java.util.Map<T, g3.g$a<Y>> r1 = r10.f10204a     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r1 = r1.remove(r9)     // Catch: java.lang.Throwable -> L7d
            g3.g$a r1 = (p106g3.C2235g.a) r1     // Catch: java.lang.Throwable -> L7d
            if (r1 != 0) goto L42
            r1 = r0
            goto L4c
        L42:
            long r2 = r10.f10207d     // Catch: java.lang.Throwable -> L7d
            int r4 = r1.f10209b     // Catch: java.lang.Throwable -> L7d
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L7d
            long r2 = r2 - r4
            r10.f10207d = r2     // Catch: java.lang.Throwable -> L7d
            Y r1 = r1.f10208a     // Catch: java.lang.Throwable -> L7d
        L4c:
            monitor-exit(r10)
            r3 = r1
            m2.w r3 = (p214m2.InterfaceC4345w) r3
            if (r3 != 0) goto L54
            r3 = r0
            goto L66
        L54:
            boolean r10 = r3 instanceof p214m2.C4340r
            if (r10 == 0) goto L5b
            m2.r r3 = (p214m2.C4340r) r3
            goto L66
        L5b:
            m2.r r10 = new m2.r
            r4 = 1
            r5 = 1
            r2 = r10
            r6 = r9
            r7 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            r3 = r10
        L66:
            if (r3 == 0) goto L70
            r3.m9719b()
            m2.a r10 = r8.f17731g
            r10.m9653a(r9, r3)
        L70:
            if (r3 == 0) goto L7c
            boolean r10 = p214m2.C4334l.f17724h
            if (r10 == 0) goto L7b
            java.lang.String r10 = "Loaded resource from cache"
            m9684d(r10, r11, r9)
        L7b:
            return r3
        L7c:
            return r0
        L7d:
            r9 = move-exception
            monitor-exit(r10)
            throw r9
        L80:
            r9 = move-exception
            monitor-exit(r10)
            throw r9
    }

    /* renamed from: e */
    public synchronized void m9688e(p214m2.C4335m<?> r2, p180k2.InterfaceC3671c r3, p214m2.C4340r<?> r4) {
            r1 = this;
            monitor-enter(r1)
            if (r4 == 0) goto Lc
            boolean r0 = r4.f17792Y     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto Lc
            m2.a r0 = r1.f17731g     // Catch: java.lang.Throwable -> L26
            r0.m9653a(r3, r4)     // Catch: java.lang.Throwable -> L26
        Lc:
            androidx.appcompat.widget.x r4 = r1.f17725a     // Catch: java.lang.Throwable -> L26
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Throwable -> L26
            boolean r0 = r2.f17765n0     // Catch: java.lang.Throwable -> L26
            java.util.Map r4 = r4.m821l(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.Object r0 = r4.get(r3)     // Catch: java.lang.Throwable -> L26
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L24
            r4.remove(r3)     // Catch: java.lang.Throwable -> L26
        L24:
            monitor-exit(r1)
            return
        L26:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    /* renamed from: f */
    public void m9689f(p214m2.InterfaceC4345w<?> r2) {
            r1 = this;
            boolean r0 = r2 instanceof p214m2.C4340r
            if (r0 == 0) goto La
            m2.r r2 = (p214m2.C4340r) r2
            r2.m9722e()
            return
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot release anything but an EngineResource"
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: g */
    public final <R> p214m2.C4334l.d m9690g(com.bumptech.glide.C1001e r17, java.lang.Object r18, p180k2.InterfaceC3671c r19, int r20, int r21, java.lang.Class<?> r22, java.lang.Class<R> r23, com.bumptech.glide.EnumC1003g r24, p214m2.AbstractC4333k r25, java.util.Map<java.lang.Class<?>, p180k2.InterfaceC3676h<?>> r26, boolean r27, boolean r28, p180k2.C3673e r29, boolean r30, boolean r31, boolean r32, boolean r33, p033c3.InterfaceC0863i r34, java.util.concurrent.Executor r35, p214m2.C4337o r36, long r37) {
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r24
            r7 = r25
            r8 = r29
            r9 = r33
            r10 = r34
            r11 = r35
            r12 = r36
            r13 = r37
            androidx.appcompat.widget.x r15 = r1.f17725a
            if (r9 == 0) goto L23
            java.lang.Object r15 = r15.f1482a0
            goto L25
        L23:
            java.lang.Object r15 = r15.f1481Z
        L25:
            java.util.Map r15 = (java.util.Map) r15
            java.lang.Object r15 = r15.get(r12)
            m2.m r15 = (p214m2.C4335m) r15
            if (r15 == 0) goto L41
            r15.m9692a(r10, r11)
            boolean r0 = p214m2.C4334l.f17724h
            if (r0 == 0) goto L3b
            java.lang.String r0 = "Added to existing load"
            m9684d(r0, r13, r12)
        L3b:
            m2.l$d r0 = new m2.l$d
            r0.<init>(r1, r10, r15)
            return r0
        L41:
            m2.l$b r15 = r1.f17728d
            m0.c<m2.m<?>> r15 = r15.f17742g
            java.lang.Object r15 = r15.mo6231b()
            m2.m r15 = (p214m2.C4335m) r15
            java.lang.String r13 = "Argument must not be null"
            java.util.Objects.requireNonNull(r15, r13)
            monitor-enter(r15)
            r15.f17761j0 = r12     // Catch: java.lang.Throwable -> L118
            r13 = r30
            r15.f17762k0 = r13     // Catch: java.lang.Throwable -> L118
            r13 = r31
            r15.f17763l0 = r13     // Catch: java.lang.Throwable -> L118
            r13 = r32
            r15.f17764m0 = r13     // Catch: java.lang.Throwable -> L118
            r15.f17765n0 = r9     // Catch: java.lang.Throwable -> L118
            monitor-exit(r15)
            m2.l$a r13 = r1.f17730f
            m0.c<m2.i<?>> r14 = r13.f17733b
            java.lang.Object r14 = r14.mo6231b()
            m2.i r14 = (p214m2.RunnableC4331i) r14
            java.lang.String r10 = "Argument must not be null"
            java.util.Objects.requireNonNull(r14, r10)
            int r10 = r13.f17734c
            int r11 = r10 + 1
            r13.f17734c = r11
            m2.h<R> r11 = r14.f17668Y
            m2.i$d r13 = r14.f17671b0
            r11.f17648c = r0
            r11.f17649d = r2
            r11.f17659n = r3
            r11.f17650e = r4
            r11.f17651f = r5
            r11.f17661p = r7
            r1 = r22
            r11.f17652g = r1
            r11.f17653h = r13
            r1 = r23
            r11.f17656k = r1
            r11.f17660o = r6
            r11.f17654i = r8
            r1 = r26
            r11.f17655j = r1
            r1 = r27
            r11.f17662q = r1
            r1 = r28
            r11.f17663r = r1
            r14.f17675f0 = r0
            r14.f17676g0 = r3
            r14.f17677h0 = r6
            r14.f17678i0 = r12
            r14.f17679j0 = r4
            r14.f17680k0 = r5
            r14.f17681l0 = r7
            r14.f17688s0 = r9
            r14.f17682m0 = r8
            r14.f17683n0 = r15
            r14.f17684o0 = r10
            m2.i$f r0 = p214m2.RunnableC4331i.f.f17704Y
            r14.f17686q0 = r0
            r14.f17689t0 = r2
            r1 = r16
            androidx.appcompat.widget.x r0 = r1.f17725a
            java.util.Objects.requireNonNull(r0)
            boolean r2 = r15.f17765n0
            java.util.Map r0 = r0.m821l(r2)
            r0.put(r12, r15)
            r0 = r34
            r2 = r35
            r15.m9692a(r0, r2)
            monitor-enter(r15)
            r15.f17772u0 = r14     // Catch: java.lang.Throwable -> L115
            m2.i$g r2 = p214m2.RunnableC4331i.g.f17708Y     // Catch: java.lang.Throwable -> L115
            m2.i$g r2 = r14.m9670r(r2)     // Catch: java.lang.Throwable -> L115
            m2.i$g r3 = p214m2.RunnableC4331i.g.f17709Z     // Catch: java.lang.Throwable -> L115
            if (r2 == r3) goto Le8
            m2.i$g r3 = p214m2.RunnableC4331i.g.f17710a0     // Catch: java.lang.Throwable -> L115
            if (r2 != r3) goto Le6
            goto Le8
        Le6:
            r2 = 0
            goto Le9
        Le8:
            r2 = 1
        Le9:
            if (r2 == 0) goto Lee
            p2.a r2 = r15.f17756e0     // Catch: java.lang.Throwable -> L115
            goto Lfe
        Lee:
            boolean r2 = r15.f17763l0     // Catch: java.lang.Throwable -> L115
            if (r2 == 0) goto Lf5
            p2.a r2 = r15.f17758g0     // Catch: java.lang.Throwable -> L115
            goto Lfe
        Lf5:
            boolean r2 = r15.f17764m0     // Catch: java.lang.Throwable -> L115
            if (r2 == 0) goto Lfc
            p2.a r2 = r15.f17759h0     // Catch: java.lang.Throwable -> L115
            goto Lfe
        Lfc:
            p2.a r2 = r15.f17757f0     // Catch: java.lang.Throwable -> L115
        Lfe:
            java.util.concurrent.ExecutorService r2 = r2.f21258Y     // Catch: java.lang.Throwable -> L115
            r2.execute(r14)     // Catch: java.lang.Throwable -> L115
            monitor-exit(r15)
            boolean r2 = p214m2.C4334l.f17724h
            if (r2 == 0) goto L10f
            java.lang.String r2 = "Started new load"
            r3 = r37
            m9684d(r2, r3, r12)
        L10f:
            m2.l$d r2 = new m2.l$d
            r2.<init>(r1, r0, r15)
            return r2
        L115:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L118:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
    }
}
