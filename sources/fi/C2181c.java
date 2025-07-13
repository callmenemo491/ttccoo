package fi;

/* renamed from: fi.c */
/* loaded from: classes.dex */
public final class C2181c implements bi.InterfaceC0780f {

    /* renamed from: Y */
    public final fi.C2186h f9939Y;

    /* renamed from: Z */
    public final bi.AbstractC0799s f9940Z;

    /* renamed from: a0 */
    public final fi.C2181c.c f9941a0;

    /* renamed from: b0 */
    public final java.util.concurrent.atomic.AtomicBoolean f9942b0;

    /* renamed from: c0 */
    public java.lang.Object f9943c0;

    /* renamed from: d0 */
    public p453zb.C7273e f9944d0;

    /* renamed from: e0 */
    public fi.C2185g f9945e0;

    /* renamed from: f0 */
    public boolean f9946f0;

    /* renamed from: g0 */
    public fi.C2180b f9947g0;

    /* renamed from: h0 */
    public boolean f9948h0;

    /* renamed from: i0 */
    public boolean f9949i0;

    /* renamed from: j0 */
    public boolean f9950j0;

    /* renamed from: k0 */
    public volatile boolean f9951k0;

    /* renamed from: l0 */
    public volatile fi.C2180b f9952l0;

    /* renamed from: m0 */
    public volatile fi.C2185g f9953m0;

    /* renamed from: n0 */
    public final bi.C0771a0 f9954n0;

    /* renamed from: o0 */
    public final bi.C0775c0 f9955o0;

    /* renamed from: p0 */
    public final boolean f9956p0;

    /* renamed from: fi.c$a */
    public final class a implements java.lang.Runnable {

        /* renamed from: Y */
        public volatile java.util.concurrent.atomic.AtomicInteger f9957Y;

        /* renamed from: Z */
        public final bi.InterfaceC0782g f9958Z;

        /* renamed from: a0 */
        public final /* synthetic */ fi.C2181c f9959a0;

        public a(fi.C2181c r1, bi.InterfaceC0782g r2) {
                r0 = this;
                r0.f9959a0 = r1
                r0.<init>()
                r0.f9958Z = r2
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r2 = 0
                r1.<init>(r2)
                r0.f9957Y = r1
                return
        }

        /* renamed from: a */
        public final java.lang.String m5760a() {
                r1 = this;
                fi.c r0 = r1.f9959a0
                bi.c0 r0 = r0.f9955o0
                bi.w r0 = r0.f4194b
                java.lang.String r0 = r0.f4349e
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                java.lang.String r0 = "OkHttp "
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                fi.c r1 = r6.f9959a0
                bi.c0 r1 = r1.f9955o0
                bi.w r1 = r1.f4194b
                java.lang.String r1 = r1.m2445g()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r2 = "currentThread"
                p214m2.C4339q.m9705j(r1, r2)
                java.lang.String r2 = r1.getName()
                r1.setName(r0)
                fi.c r0 = r6.f9959a0     // Catch: java.lang.Throwable -> Lbc
                fi.c$c r0 = r0.f9941a0     // Catch: java.lang.Throwable -> Lbc
                r0.m11531h()     // Catch: java.lang.Throwable -> Lbc
                r0 = 0
                fi.c r3 = r6.f9959a0     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L7a
                bi.g0 r0 = r3.m5756f()     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L7a
                bi.g r3 = r6.f9958Z     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L48
                fi.c r4 = r6.f9959a0     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L48
                ek.p$a r3 = (p082ek.C1903p.a) r3     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L48
                r3.m4682b(r4, r0)     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L48
                fi.c r0 = r6.f9959a0     // Catch: java.lang.Throwable -> Lbc
            L40:
                bi.a0 r0 = r0.f9954n0     // Catch: java.lang.Throwable -> Lbc
                goto La9
            L43:
                r0 = move-exception
                r3 = 1
                r3 = r0
                r0 = 1
                goto L4e
            L48:
                r0 = move-exception
                r3 = 1
                r3 = r0
                r0 = 1
                goto L7b
            L4d:
                r3 = move-exception
            L4e:
                fi.c r4 = r6.f9959a0     // Catch: java.lang.Throwable -> L78
                r4.cancel()     // Catch: java.lang.Throwable -> L78
                if (r0 != 0) goto L77
                java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L78
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
                r4.<init>()     // Catch: java.lang.Throwable -> L78
                java.lang.String r5 = "canceled due to "
                r4.append(r5)     // Catch: java.lang.Throwable -> L78
                r4.append(r3)     // Catch: java.lang.Throwable -> L78
                java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L78
                r0.<init>(r4)     // Catch: java.lang.Throwable -> L78
                p185k7.C3836i.m8616a(r0, r3)     // Catch: java.lang.Throwable -> L78
                bi.g r4 = r6.f9958Z     // Catch: java.lang.Throwable -> L78
                fi.c r5 = r6.f9959a0     // Catch: java.lang.Throwable -> L78
                ek.p$a r4 = (p082ek.C1903p.a) r4     // Catch: java.lang.Throwable -> L78
                r4.m4681a(r5, r0)     // Catch: java.lang.Throwable -> L78
            L77:
                throw r3     // Catch: java.lang.Throwable -> L78
            L78:
                r0 = move-exception
                goto Lb2
            L7a:
                r3 = move-exception
            L7b:
                if (r0 == 0) goto L9d
                ji.e$a r0 = p175ji.C3615e.f15897c     // Catch: java.lang.Throwable -> L78
                ji.e r0 = p175ji.C3615e.f15895a     // Catch: java.lang.Throwable -> L78
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
                r4.<init>()     // Catch: java.lang.Throwable -> L78
                java.lang.String r5 = "Callback failure for "
                r4.append(r5)     // Catch: java.lang.Throwable -> L78
                fi.c r5 = r6.f9959a0     // Catch: java.lang.Throwable -> L78
                java.lang.String r5 = fi.C2181c.m5751a(r5)     // Catch: java.lang.Throwable -> L78
                r4.append(r5)     // Catch: java.lang.Throwable -> L78
                java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L78
                r5 = 4
                r0.m8049i(r4, r5, r3)     // Catch: java.lang.Throwable -> L78
                goto La6
            L9d:
                bi.g r0 = r6.f9958Z     // Catch: java.lang.Throwable -> L78
                fi.c r4 = r6.f9959a0     // Catch: java.lang.Throwable -> L78
                ek.p$a r0 = (p082ek.C1903p.a) r0     // Catch: java.lang.Throwable -> L78
                r0.m4681a(r4, r3)     // Catch: java.lang.Throwable -> L78
            La6:
                fi.c r0 = r6.f9959a0     // Catch: java.lang.Throwable -> Lbc
                goto L40
            La9:
                bi.p r0 = r0.f4138Y     // Catch: java.lang.Throwable -> Lbc
                r0.m2418b(r6)     // Catch: java.lang.Throwable -> Lbc
                r1.setName(r2)
                return
            Lb2:
                fi.c r3 = r6.f9959a0     // Catch: java.lang.Throwable -> Lbc
                bi.a0 r3 = r3.f9954n0     // Catch: java.lang.Throwable -> Lbc
                bi.p r3 = r3.f4138Y     // Catch: java.lang.Throwable -> Lbc
                r3.m2418b(r6)     // Catch: java.lang.Throwable -> Lbc
                throw r0     // Catch: java.lang.Throwable -> Lbc
            Lbc:
                r0 = move-exception
                r1.setName(r2)
                throw r0
        }
    }

    /* renamed from: fi.c$b */
    public static final class b extends java.lang.ref.WeakReference<fi.C2181c> {

        /* renamed from: a */
        public final java.lang.Object f9960a;

        public b(fi.C2181c r1, java.lang.Object r2) {
                r0 = this;
                r0.<init>(r1)
                r0.f9960a = r2
                return
        }
    }

    /* renamed from: fi.c$c */
    public static final class c extends p260oi.C5280b {

        /* renamed from: l */
        public final /* synthetic */ fi.C2181c f9961l;

        public c(fi.C2181c r1) {
                r0 = this;
                r0.f9961l = r1
                r0.<init>()
                return
        }

        @Override // p260oi.C5280b
        /* renamed from: k */
        public void mo5761k() {
                r1 = this;
                fi.c r0 = r1.f9961l
                r0.cancel()
                return
        }
    }

    public C2181c(bi.C0771a0 r2, bi.C0775c0 r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "client"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "originalRequest"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.f9954n0 = r2
            r1.f9955o0 = r3
            r1.f9956p0 = r4
            h7.rb r3 = r2.f4139Z
            java.lang.Object r3 = r3.f11884Z
            fi.h r3 = (fi.C2186h) r3
            r1.f9939Y = r3
            bi.s$b r2 = r2.f4142c0
            bi.s r2 = r2.mo2423a(r1)
            r1.f9940Z = r2
            fi.c$c r2 = new fi.c$c
            r2.<init>(r1)
            r3 = 0
            long r3 = (long) r3
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2.mo11530g(r3, r0)
            r1.f9941a0 = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>()
            r1.f9942b0 = r2
            r2 = 1
            r1.f9950j0 = r2
            return
    }

    /* renamed from: a */
    public static final java.lang.String m5751a(fi.C2181c r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r2.f9951k0
            if (r1 == 0) goto Lc
            java.lang.String r1 = "canceled "
            goto Le
        Lc:
            java.lang.String r1 = ""
        Le:
            r0.append(r1)
            boolean r1 = r2.f9956p0
            if (r1 == 0) goto L18
            java.lang.String r1 = "web socket"
            goto L1a
        L18:
            java.lang.String r1 = "call"
        L1a:
            r0.append(r1)
            java.lang.String r1 = " to "
            r0.append(r1)
            bi.c0 r2 = r2.f9955o0
            bi.w r2 = r2.f4194b
            java.lang.String r2 = r2.m2445g()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // bi.InterfaceC0780f
    /* renamed from: Q */
    public void mo2376Q(bi.InterfaceC0782g r6) {
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f9942b0
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L72
            r5.m5754d()
            bi.a0 r0 = r5.f9954n0
            bi.p r0 = r0.f4138Y
            fi.c$a r1 = new fi.c$a
            r1.<init>(r5, r6)
            java.util.Objects.requireNonNull(r0)
            monitor-enter(r0)
            java.util.ArrayDeque<fi.c$a> r6 = r0.f4323b     // Catch: java.lang.Throwable -> L6f
            r6.add(r1)     // Catch: java.lang.Throwable -> L6f
            fi.c r6 = r1.f9959a0     // Catch: java.lang.Throwable -> L6f
            boolean r6 = r6.f9956p0     // Catch: java.lang.Throwable -> L6f
            if (r6 != 0) goto L6a
            java.lang.String r6 = r1.m5760a()     // Catch: java.lang.Throwable -> L6f
            java.util.ArrayDeque<fi.c$a> r2 = r0.f4324c     // Catch: java.lang.Throwable -> L6f
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L6f
        L2f:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L46
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L6f
            fi.c$a r3 = (fi.C2181c.a) r3     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = r3.m5760a()     // Catch: java.lang.Throwable -> L6f
            boolean r4 = p214m2.C4339q.m9702c(r4, r6)     // Catch: java.lang.Throwable -> L6f
            if (r4 == 0) goto L2f
            goto L64
        L46:
            java.util.ArrayDeque<fi.c$a> r2 = r0.f4323b     // Catch: java.lang.Throwable -> L6f
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L6f
        L4c:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L63
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L6f
            fi.c$a r3 = (fi.C2181c.a) r3     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = r3.m5760a()     // Catch: java.lang.Throwable -> L6f
            boolean r4 = p214m2.C4339q.m9702c(r4, r6)     // Catch: java.lang.Throwable -> L6f
            if (r4 == 0) goto L4c
            goto L64
        L63:
            r3 = 0
        L64:
            if (r3 == 0) goto L6a
            java.util.concurrent.atomic.AtomicInteger r6 = r3.f9957Y     // Catch: java.lang.Throwable -> L6f
            r1.f9957Y = r6     // Catch: java.lang.Throwable -> L6f
        L6a:
            monitor-exit(r0)
            r0.m2419c()
            return
        L6f:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L72:
            java.lang.String r6 = "Already Executed"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
    }

    /* renamed from: b */
    public final void m5752b(fi.C2185g r3) {
            r2 = this;
            byte[] r0 = ci.C0988c.f5065a
            fi.g r0 = r2.f9945e0
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L1a
            r2.f9945e0 = r3
            java.util.List<java.lang.ref.Reference<fi.c>> r3 = r3.f9980o
            fi.c$b r0 = new fi.c$b
            java.lang.Object r1 = r2.f9943c0
            r0.<init>(r2, r1)
            r3.add(r0)
            return
        L1a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    /* renamed from: c */
    public final <E extends java.io.IOException> E m5753c(E r3) {
            r2 = this;
            byte[] r0 = ci.C0988c.f5065a
            fi.g r0 = r2.f9945e0
            if (r0 == 0) goto L32
            monitor-enter(r0)
            java.net.Socket r1 = r2.m5759k()     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)
            fi.g r0 = r2.f9945e0
            if (r0 != 0) goto L1b
            if (r1 == 0) goto L15
            ci.C0988c.m2699d(r1)
        L15:
            bi.s r0 = r2.f9940Z
            java.util.Objects.requireNonNull(r0)
            goto L32
        L1b:
            if (r1 != 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L23
            goto L32
        L23:
            java.lang.String r3 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L2f:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L32:
            boolean r0 = r2.f9946f0
            if (r0 == 0) goto L37
            goto L3f
        L37:
            fi.c$c r0 = r2.f9941a0
            boolean r0 = r0.m11532i()
            if (r0 != 0) goto L41
        L3f:
            r0 = r3
            goto L4d
        L41:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "timeout"
            r0.<init>(r1)
            if (r3 == 0) goto L4d
            r0.initCause(r3)
        L4d:
            if (r3 == 0) goto L55
            bi.s r3 = r2.f9940Z
            p214m2.C4339q.m9704i(r0)
            goto L57
        L55:
            bi.s r3 = r2.f9940Z
        L57:
            java.util.Objects.requireNonNull(r3)
            return r0
    }

    @Override // bi.InterfaceC0780f
    public void cancel() {
            r1 = this;
            boolean r0 = r1.f9951k0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.f9951k0 = r0
            fi.b r0 = r1.f9952l0
            if (r0 == 0) goto L11
            gi.d r0 = r0.f9927f
            r0.cancel()
        L11:
            fi.g r0 = r1.f9953m0
            if (r0 == 0) goto L1c
            java.net.Socket r0 = r0.f9967b
            if (r0 == 0) goto L1c
            ci.C0988c.m2699d(r0)
        L1c:
            bi.s r0 = r1.f9940Z
            java.util.Objects.requireNonNull(r0)
            return
    }

    public java.lang.Object clone() {
            r4 = this;
            fi.c r0 = new fi.c
            bi.a0 r1 = r4.f9954n0
            bi.c0 r2 = r4.f9955o0
            boolean r3 = r4.f9956p0
            r0.<init>(r1, r2, r3)
            return r0
    }

    /* renamed from: d */
    public final void m5754d() {
            r2 = this;
            ji.e$a r0 = p175ji.C3615e.f15897c
            ji.e r0 = p175ji.C3615e.f15895a
            java.lang.String r1 = "response.body().close()"
            java.lang.Object r0 = r0.mo8044g(r1)
            r2.f9943c0 = r0
            bi.s r0 = r2.f9940Z
            java.util.Objects.requireNonNull(r0)
            java.lang.String r0 = "call"
            p214m2.C4339q.m9706k(r2, r0)
            return
    }

    /* renamed from: e */
    public final void m5755e(boolean r4) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f9950j0     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L1b
            monitor-exit(r3)
            r0 = 0
            if (r4 == 0) goto L18
            fi.b r4 = r3.f9952l0
            if (r4 == 0) goto L18
            gi.d r1 = r4.f9927f
            r1.cancel()
            fi.c r1 = r4.f9924c
            r2 = 1
            r1.m5757g(r4, r2, r2, r0)
        L18:
            r3.f9947g0 = r0
            return
        L1b:
            java.lang.String r4 = "released"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L27
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L27
            throw r0     // Catch: java.lang.Throwable -> L27
        L27:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    /* renamed from: f */
    public final bi.C0783g0 m5756f() {
            r10 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            bi.a0 r0 = r10.f9954n0
            java.util.List<bi.x> r0 = r0.f4140a0
            p062dh.C1471g.m3994F(r2, r0)
            gi.i r0 = new gi.i
            bi.a0 r1 = r10.f9954n0
            r0.<init>(r1)
            r2.add(r0)
            gi.a r0 = new gi.a
            bi.a0 r1 = r10.f9954n0
            bi.o r1 = r1.f4147h0
            r0.<init>(r1)
            r2.add(r0)
            di.a r0 = new di.a
            bi.a0 r1 = r10.f9954n0
            java.util.Objects.requireNonNull(r1)
            r0.<init>()
            r2.add(r0)
            fi.a r0 = fi.C2179a.f9921a
            r2.add(r0)
            boolean r0 = r10.f9956p0
            if (r0 != 0) goto L3f
            bi.a0 r0 = r10.f9954n0
            java.util.List<bi.x> r0 = r0.f4141b0
            p062dh.C1471g.m3994F(r2, r0)
        L3f:
            gi.b r0 = new gi.b
            boolean r1 = r10.f9956p0
            r0.<init>(r1)
            r2.add(r0)
            gi.g r9 = new gi.g
            r3 = 0
            r4 = 0
            bi.c0 r5 = r10.f9955o0
            bi.a0 r0 = r10.f9954n0
            int r6 = r0.f4159t0
            int r7 = r0.f4160u0
            int r8 = r0.f4161v0
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            bi.c0 r2 = r10.f9955o0     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            bi.g0 r2 = r9.m6150c(r2)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            boolean r3 = r10.f9951k0     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            if (r3 != 0) goto L6c
            r10.m5758j(r1)
            return r2
        L6c:
            ci.C0988c.m2698c(r2)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            throw r2     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
        L77:
            r2 = move-exception
            goto L8c
        L79:
            r0 = move-exception
            java.io.IOException r0 = r10.m5758j(r0)     // Catch: java.lang.Throwable -> L89
            if (r0 != 0) goto L88
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L89
            throw r0     // Catch: java.lang.Throwable -> L89
        L88:
            throw r0     // Catch: java.lang.Throwable -> L89
        L89:
            r0 = move-exception
            r2 = r0
            r0 = 1
        L8c:
            if (r0 != 0) goto L91
            r10.m5758j(r1)
        L91:
            throw r2
    }

    /* renamed from: g */
    public final <E extends java.io.IOException> E m5757g(fi.C2180b r3, boolean r4, boolean r5, E r6) {
            r2 = this;
            fi.b r0 = r2.f9952l0
            boolean r3 = p214m2.C4339q.m9702c(r3, r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto Lb
            return r6
        Lb:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L16
            boolean r1 = r2.f9948h0     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L1c
            goto L16
        L14:
            r3 = move-exception
            goto L3d
        L16:
            if (r5 == 0) goto L3f
            boolean r1 = r2.f9949i0     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L3f
        L1c:
            if (r4 == 0) goto L20
            r2.f9948h0 = r3     // Catch: java.lang.Throwable -> L14
        L20:
            if (r5 == 0) goto L24
            r2.f9949i0 = r3     // Catch: java.lang.Throwable -> L14
        L24:
            boolean r4 = r2.f9948h0     // Catch: java.lang.Throwable -> L14
            if (r4 != 0) goto L2e
            boolean r5 = r2.f9949i0     // Catch: java.lang.Throwable -> L14
            if (r5 != 0) goto L2e
            r5 = 1
            goto L2f
        L2e:
            r5 = 0
        L2f:
            if (r4 != 0) goto L3a
            boolean r4 = r2.f9949i0     // Catch: java.lang.Throwable -> L14
            if (r4 != 0) goto L3a
            boolean r4 = r2.f9950j0     // Catch: java.lang.Throwable -> L14
            if (r4 != 0) goto L3a
            r3 = 1
        L3a:
            r4 = r3
            r3 = r5
            goto L40
        L3d:
            monitor-exit(r2)
            throw r3
        L3f:
            r4 = 0
        L40:
            monitor-exit(r2)
            if (r3 == 0) goto L55
            r3 = 0
            r2.f9952l0 = r3
            fi.g r3 = r2.f9945e0
            if (r3 == 0) goto L55
            monitor-enter(r3)
            int r5 = r3.f9977l     // Catch: java.lang.Throwable -> L52
            int r5 = r5 + r0
            r3.f9977l = r5     // Catch: java.lang.Throwable -> L52
            monitor-exit(r3)
            goto L55
        L52:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L55:
            if (r4 == 0) goto L5c
            java.io.IOException r3 = r2.m5753c(r6)
            return r3
        L5c:
            return r6
    }

    @Override // bi.InterfaceC0780f
    /* renamed from: h */
    public bi.C0783g0 mo2377h() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f9942b0
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L3f
            fi.c$c r0 = r3.f9941a0
            r0.m11531h()
            r3.m5754d()
            bi.a0 r0 = r3.f9954n0     // Catch: java.lang.Throwable -> L31
            bi.p r0 = r0.f4138Y     // Catch: java.lang.Throwable -> L31
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L31
            java.util.ArrayDeque<fi.c> r1 = r0.f4325d     // Catch: java.lang.Throwable -> L2e
            r1.add(r3)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            bi.g0 r0 = r3.m5756f()     // Catch: java.lang.Throwable -> L31
            bi.a0 r1 = r3.f9954n0
            bi.p r1 = r1.f4138Y
            java.util.Objects.requireNonNull(r1)
            java.util.ArrayDeque<fi.c> r2 = r1.f4325d
            r1.m2417a(r2, r3)
            return r0
        L2e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r1     // Catch: java.lang.Throwable -> L31
        L31:
            r0 = move-exception
            bi.a0 r1 = r3.f9954n0
            bi.p r1 = r1.f4138Y
            java.util.Objects.requireNonNull(r1)
            java.util.ArrayDeque<fi.c> r2 = r1.f4325d
            r1.m2417a(r2, r3)
            throw r0
        L3f:
            java.lang.String r0 = "Already Executed"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // bi.InterfaceC0780f
    /* renamed from: i */
    public bi.C0775c0 mo2378i() {
            r1 = this;
            bi.c0 r0 = r1.f9955o0
            return r0
    }

    /* renamed from: j */
    public final java.io.IOException m5758j(java.io.IOException r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f9950j0     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            if (r0 == 0) goto L12
            r2.f9950j0 = r1     // Catch: java.lang.Throwable -> L1a
            boolean r0 = r2.f9948h0     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L12
            boolean r0 = r2.f9949i0     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L12
            r0 = 1
            r1 = 1
        L12:
            monitor-exit(r2)
            if (r1 == 0) goto L19
            java.io.IOException r3 = r2.m5753c(r3)
        L19:
            return r3
        L1a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    /* renamed from: k */
    public final java.net.Socket m5759k() {
            r7 = this;
            fi.g r0 = r7.f9945e0
            p214m2.C4339q.m9704i(r0)
            byte[] r1 = ci.C0988c.f5065a
            java.util.List<java.lang.ref.Reference<fi.c>> r1 = r0.f9980o
            java.util.Iterator r2 = r1.iterator()
            r3 = 0
            r4 = 0
        Lf:
            boolean r5 = r2.hasNext()
            r6 = -1
            if (r5 == 0) goto L2c
            java.lang.Object r5 = r2.next()
            java.lang.ref.Reference r5 = (java.lang.ref.Reference) r5
            java.lang.Object r5 = r5.get()
            fi.c r5 = (fi.C2181c) r5
            boolean r5 = p214m2.C4339q.m9702c(r5, r7)
            if (r5 == 0) goto L29
            goto L2d
        L29:
            int r4 = r4 + 1
            goto Lf
        L2c:
            r4 = -1
        L2d:
            r2 = 1
            if (r4 == r6) goto L32
            r5 = 1
            goto L33
        L32:
            r5 = 0
        L33:
            if (r5 == 0) goto L7f
            r1.remove(r4)
            r4 = 0
            r7.f9945e0 = r4
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L7e
            long r5 = java.lang.System.nanoTime()
            r0.f9981p = r5
            fi.h r1 = r7.f9939Y
            java.util.Objects.requireNonNull(r1)
            byte[] r5 = ci.C0988c.f5065a
            boolean r5 = r0.f9974i
            if (r5 != 0) goto L61
            int r5 = r1.f9987e
            if (r5 != 0) goto L57
            goto L61
        L57:
            ei.d r2 = r1.f9984b
            fi.h$a r1 = r1.f9985c
            r5 = 0
            r2.m4616c(r1, r5)
            goto L76
        L61:
            r0.f9974i = r2
            java.util.concurrent.ConcurrentLinkedQueue<fi.g> r2 = r1.f9986d
            r2.remove(r0)
            java.util.concurrent.ConcurrentLinkedQueue<fi.g> r2 = r1.f9986d
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L75
            ei.d r1 = r1.f9984b
            r1.m4614a()
        L75:
            r3 = 1
        L76:
            if (r3 == 0) goto L7e
            java.net.Socket r0 = r0.f9968c
            p214m2.C4339q.m9704i(r0)
            return r0
        L7e:
            return r4
        L7f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // bi.InterfaceC0780f
    /* renamed from: l */
    public boolean mo2379l() {
            r1 = this;
            boolean r0 = r1.f9951k0
            return r0
    }
}
