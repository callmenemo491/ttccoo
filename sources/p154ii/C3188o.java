package p154ii;

/* renamed from: ii.o */
/* loaded from: classes.dex */
public final class C3188o {

    /* renamed from: a */
    public long f12812a;

    /* renamed from: b */
    public long f12813b;

    /* renamed from: c */
    public long f12814c;

    /* renamed from: d */
    public long f12815d;

    /* renamed from: e */
    public final java.util.ArrayDeque<bi.C0802v> f12816e;

    /* renamed from: f */
    public boolean f12817f;

    /* renamed from: g */
    public final p154ii.C3188o.b f12818g;

    /* renamed from: h */
    public final p154ii.C3188o.a f12819h;

    /* renamed from: i */
    public final p154ii.C3188o.c f12820i;

    /* renamed from: j */
    public final p154ii.C3188o.c f12821j;

    /* renamed from: k */
    public p154ii.EnumC3175b f12822k;

    /* renamed from: l */
    public java.io.IOException f12823l;

    /* renamed from: m */
    public final int f12824m;

    /* renamed from: n */
    public final p154ii.C3179f f12825n;

    /* renamed from: ii.o$a */
    public final class a implements p260oi.InterfaceC5302x {

        /* renamed from: Y */
        public final p260oi.C5283e f12826Y;

        /* renamed from: Z */
        public boolean f12827Z;

        /* renamed from: a0 */
        public boolean f12828a0;

        /* renamed from: b0 */
        public final /* synthetic */ p154ii.C3188o f12829b0;

        public a(p154ii.C3188o r1, boolean r2) {
                r0 = this;
                r0.f12829b0 = r1
                r0.<init>()
                r0.f12828a0 = r2
                oi.e r1 = new oi.e
                r1.<init>()
                r0.f12826Y = r1
                return
        }

        /* renamed from: a */
        public final void m7665a(boolean r13) {
                r12 = this;
                ii.o r0 = r12.f12829b0
                monitor-enter(r0)
                ii.o r1 = r12.f12829b0     // Catch: java.lang.Throwable -> L8c
                ii.o$c r1 = r1.f12821j     // Catch: java.lang.Throwable -> L8c
                r1.m11531h()     // Catch: java.lang.Throwable -> L8c
            La:
                ii.o r1 = r12.f12829b0     // Catch: java.lang.Throwable -> L83
                long r2 = r1.f12814c     // Catch: java.lang.Throwable -> L83
                long r4 = r1.f12815d     // Catch: java.lang.Throwable -> L83
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L28
                boolean r2 = r12.f12828a0     // Catch: java.lang.Throwable -> L83
                if (r2 != 0) goto L28
                boolean r2 = r12.f12827Z     // Catch: java.lang.Throwable -> L83
                if (r2 != 0) goto L28
                ii.b r1 = r1.m7658f()     // Catch: java.lang.Throwable -> L83
                if (r1 != 0) goto L28
                ii.o r1 = r12.f12829b0     // Catch: java.lang.Throwable -> L83
                r1.m7664l()     // Catch: java.lang.Throwable -> L83
                goto La
            L28:
                ii.o r1 = r12.f12829b0     // Catch: java.lang.Throwable -> L8c
                ii.o$c r1 = r1.f12821j     // Catch: java.lang.Throwable -> L8c
                r1.m7668l()     // Catch: java.lang.Throwable -> L8c
                ii.o r1 = r12.f12829b0     // Catch: java.lang.Throwable -> L8c
                r1.m7654b()     // Catch: java.lang.Throwable -> L8c
                ii.o r1 = r12.f12829b0     // Catch: java.lang.Throwable -> L8c
                long r2 = r1.f12815d     // Catch: java.lang.Throwable -> L8c
                long r4 = r1.f12814c     // Catch: java.lang.Throwable -> L8c
                long r2 = r2 - r4
                oi.e r1 = r12.f12826Y     // Catch: java.lang.Throwable -> L8c
                long r4 = r1.f20501Z     // Catch: java.lang.Throwable -> L8c
                long r10 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L8c
                ii.o r1 = r12.f12829b0     // Catch: java.lang.Throwable -> L8c
                long r2 = r1.f12814c     // Catch: java.lang.Throwable -> L8c
                long r2 = r2 + r10
                r1.f12814c = r2     // Catch: java.lang.Throwable -> L8c
                if (r13 == 0) goto L5d
                oi.e r13 = r12.f12826Y     // Catch: java.lang.Throwable -> L8c
                long r2 = r13.f20501Z     // Catch: java.lang.Throwable -> L8c
                int r13 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r13 != 0) goto L5d
                ii.b r13 = r1.m7658f()     // Catch: java.lang.Throwable -> L8c
                if (r13 != 0) goto L5d
                r13 = 1
                r8 = 1
                goto L5f
            L5d:
                r13 = 0
                r8 = 0
            L5f:
                monitor-exit(r0)
                ii.o r13 = r12.f12829b0
                ii.o$c r13 = r13.f12821j
                r13.m11531h()
                ii.o r13 = r12.f12829b0     // Catch: java.lang.Throwable -> L7a
                ii.f r6 = r13.f12825n     // Catch: java.lang.Throwable -> L7a
                int r7 = r13.f12824m     // Catch: java.lang.Throwable -> L7a
                oi.e r9 = r12.f12826Y     // Catch: java.lang.Throwable -> L7a
                r6.m7629L(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L7a
                ii.o r13 = r12.f12829b0
                ii.o$c r13 = r13.f12821j
                r13.m7668l()
                return
            L7a:
                r13 = move-exception
                ii.o r0 = r12.f12829b0
                ii.o$c r0 = r0.f12821j
                r0.m7668l()
                throw r13
            L83:
                r13 = move-exception
                ii.o r1 = r12.f12829b0     // Catch: java.lang.Throwable -> L8c
                ii.o$c r1 = r1.f12821j     // Catch: java.lang.Throwable -> L8c
                r1.m7668l()     // Catch: java.lang.Throwable -> L8c
                throw r13     // Catch: java.lang.Throwable -> L8c
            L8c:
                r13 = move-exception
                monitor-exit(r0)
                throw r13
        }

        @Override // p260oi.InterfaceC5302x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r14 = this;
                ii.o r0 = r14.f12829b0
                byte[] r1 = ci.C0988c.f5065a
                monitor-enter(r0)
                boolean r1 = r14.f12827Z     // Catch: java.lang.Throwable -> L5f
                if (r1 == 0) goto Lb
                monitor-exit(r0)
                return
            Lb:
                ii.o r1 = r14.f12829b0     // Catch: java.lang.Throwable -> L5f
                ii.b r1 = r1.m7658f()     // Catch: java.lang.Throwable -> L5f
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L17
                r1 = 1
                goto L18
            L17:
                r1 = 0
            L18:
                monitor-exit(r0)
                ii.o r0 = r14.f12829b0
                ii.o$a r4 = r0.f12819h
                boolean r4 = r4.f12828a0
                if (r4 != 0) goto L47
                oi.e r4 = r14.f12826Y
                long r4 = r4.f20501Z
                r6 = 0
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 <= 0) goto L2c
                r2 = 1
            L2c:
                if (r2 == 0) goto L3a
            L2e:
                oi.e r0 = r14.f12826Y
                long r0 = r0.f20501Z
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 <= 0) goto L47
                r14.m7665a(r3)
                goto L2e
            L3a:
                if (r1 == 0) goto L47
                ii.f r8 = r0.f12825n
                int r9 = r0.f12824m
                r10 = 1
                r11 = 0
                r12 = 0
                r8.m7629L(r9, r10, r11, r12)
            L47:
                ii.o r0 = r14.f12829b0
                monitor-enter(r0)
                r14.f12827Z = r3     // Catch: java.lang.Throwable -> L5c
                monitor-exit(r0)
                ii.o r0 = r14.f12829b0
                ii.f r0 = r0.f12825n
                ii.p r0 = r0.f12742x0
                r0.flush()
                ii.o r0 = r14.f12829b0
                r0.m7653a()
                return
            L5c:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L5f:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        @Override // p260oi.InterfaceC5302x
        /* renamed from: d */
        public p260oi.C5279a0 mo7464d() {
                r1 = this;
                ii.o r0 = r1.f12829b0
                ii.o$c r0 = r0.f12821j
                return r0
        }

        @Override // p260oi.InterfaceC5302x, java.io.Flushable
        public void flush() {
                r5 = this;
                ii.o r0 = r5.f12829b0
                byte[] r1 = ci.C0988c.f5065a
                monitor-enter(r0)
                ii.o r1 = r5.f12829b0     // Catch: java.lang.Throwable -> L24
                r1.m7654b()     // Catch: java.lang.Throwable -> L24
                monitor-exit(r0)
            Lb:
                oi.e r0 = r5.f12826Y
                long r0 = r0.f20501Z
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L23
                r0 = 0
                r5.m7665a(r0)
                ii.o r0 = r5.f12829b0
                ii.f r0 = r0.f12825n
                ii.p r0 = r0.f12742x0
                r0.flush()
                goto Lb
            L23:
                return
            L24:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        @Override // p260oi.InterfaceC5302x
        /* renamed from: p0 */
        public void mo5749p0(p260oi.C5283e r3, long r4) {
                r2 = this;
                java.lang.String r0 = "source"
                p214m2.C4339q.m9706k(r3, r0)
                byte[] r0 = ci.C0988c.f5065a
                oi.e r0 = r2.f12826Y
                r0.mo5749p0(r3, r4)
            Lc:
                oi.e r3 = r2.f12826Y
                long r3 = r3.f20501Z
                r0 = 16384(0x4000, double:8.095E-320)
                int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r5 < 0) goto L1b
                r3 = 0
                r2.m7665a(r3)
                goto Lc
            L1b:
                return
        }
    }

    /* renamed from: ii.o$b */
    public final class b implements p260oi.InterfaceC5304z {

        /* renamed from: Y */
        public final p260oi.C5283e f12830Y;

        /* renamed from: Z */
        public final p260oi.C5283e f12831Z;

        /* renamed from: a0 */
        public boolean f12832a0;

        /* renamed from: b0 */
        public final long f12833b0;

        /* renamed from: c0 */
        public boolean f12834c0;

        /* renamed from: d0 */
        public final /* synthetic */ p154ii.C3188o f12835d0;

        public b(p154ii.C3188o r1, long r2, boolean r4) {
                r0 = this;
                r0.f12835d0 = r1
                r0.<init>()
                r0.f12833b0 = r2
                r0.f12834c0 = r4
                oi.e r1 = new oi.e
                r1.<init>()
                r0.f12830Y = r1
                oi.e r1 = new oi.e
                r1.<init>()
                r0.f12831Z = r1
                return
        }

        /* renamed from: a */
        public final void m7666a(long r3) {
                r2 = this;
                ii.o r0 = r2.f12835d0
                byte[] r1 = ci.C0988c.f5065a
                ii.f r0 = r0.f12825n
                r0.m7628A(r3)
                return
        }

        @Override // p260oi.InterfaceC5304z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r5 = this;
                ii.o r0 = r5.f12835d0
                monitor-enter(r0)
                r1 = 1
                r5.f12832a0 = r1     // Catch: java.lang.Throwable -> L2c
                oi.e r1 = r5.f12831Z     // Catch: java.lang.Throwable -> L2c
                long r2 = r1.f20501Z     // Catch: java.lang.Throwable -> L2c
                r1.mo11559b(r2)     // Catch: java.lang.Throwable -> L2c
                ii.o r1 = r5.f12835d0     // Catch: java.lang.Throwable -> L2c
                if (r1 == 0) goto L24
                r1.notifyAll()     // Catch: java.lang.Throwable -> L2c
                monitor-exit(r0)
                r0 = 0
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 <= 0) goto L1e
                r5.m7666a(r2)
            L1e:
                ii.o r0 = r5.f12835d0
                r0.m7653a()
                return
            L24:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L2c
                java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L2c
                throw r1     // Catch: java.lang.Throwable -> L2c
            L2c:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        @Override // p260oi.InterfaceC5304z
        /* renamed from: d */
        public p260oi.C5279a0 mo7463d() {
                r1 = this;
                ii.o r0 = r1.f12835d0
                ii.o$c r0 = r0.f12820i
                return r0
        }

        @Override // p260oi.InterfaceC5304z
        /* renamed from: j0 */
        public long mo4683j0(p260oi.C5283e r12, long r13) {
                r11 = this;
                java.lang.String r0 = "sink"
                p214m2.C4339q.m9706k(r12, r0)
                r0 = 0
                int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
                if (r2 < 0) goto Ld
                r2 = 1
                goto Le
            Ld:
                r2 = 0
            Le:
                if (r2 == 0) goto Lb9
            L10:
                r2 = 0
                ii.o r3 = r11.f12835d0
                monitor-enter(r3)
                ii.o r4 = r11.f12835d0     // Catch: java.lang.Throwable -> Lb6
                ii.o$c r4 = r4.f12820i     // Catch: java.lang.Throwable -> Lb6
                r4.m11531h()     // Catch: java.lang.Throwable -> Lb6
                ii.o r4 = r11.f12835d0     // Catch: java.lang.Throwable -> Lad
                ii.b r4 = r4.m7658f()     // Catch: java.lang.Throwable -> Lad
                if (r4 == 0) goto L38
                ii.o r2 = r11.f12835d0     // Catch: java.lang.Throwable -> Lad
                java.io.IOException r2 = r2.f12823l     // Catch: java.lang.Throwable -> Lad
                if (r2 == 0) goto L2a
                goto L38
            L2a:
                ii.u r2 = new ii.u     // Catch: java.lang.Throwable -> Lad
                ii.o r4 = r11.f12835d0     // Catch: java.lang.Throwable -> Lad
                ii.b r4 = r4.m7658f()     // Catch: java.lang.Throwable -> Lad
                p214m2.C4339q.m9704i(r4)     // Catch: java.lang.Throwable -> Lad
                r2.<init>(r4)     // Catch: java.lang.Throwable -> Lad
            L38:
                boolean r4 = r11.f12832a0     // Catch: java.lang.Throwable -> Lad
                if (r4 != 0) goto La5
                oi.e r4 = r11.f12831Z     // Catch: java.lang.Throwable -> Lad
                long r5 = r4.f20501Z     // Catch: java.lang.Throwable -> Lad
                r7 = -1
                int r9 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r9 <= 0) goto L79
                long r0 = java.lang.Math.min(r13, r5)     // Catch: java.lang.Throwable -> Lad
                long r0 = r4.mo4683j0(r12, r0)     // Catch: java.lang.Throwable -> Lad
                ii.o r4 = r11.f12835d0     // Catch: java.lang.Throwable -> Lad
                long r5 = r4.f12812a     // Catch: java.lang.Throwable -> Lad
                long r5 = r5 + r0
                r4.f12812a = r5     // Catch: java.lang.Throwable -> Lad
                long r9 = r4.f12813b     // Catch: java.lang.Throwable -> Lad
                long r5 = r5 - r9
                if (r2 != 0) goto L88
                ii.f r4 = r4.f12825n     // Catch: java.lang.Throwable -> Lad
                ii.t r4 = r4.f12735q0     // Catch: java.lang.Throwable -> Lad
                int r4 = r4.m7683a()     // Catch: java.lang.Throwable -> Lad
                int r4 = r4 / 2
                long r9 = (long) r4     // Catch: java.lang.Throwable -> Lad
                int r4 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r4 < 0) goto L88
                ii.o r4 = r11.f12835d0     // Catch: java.lang.Throwable -> Lad
                ii.f r9 = r4.f12825n     // Catch: java.lang.Throwable -> Lad
                int r4 = r4.f12824m     // Catch: java.lang.Throwable -> Lad
                r9.m7632S(r4, r5)     // Catch: java.lang.Throwable -> Lad
                ii.o r4 = r11.f12835d0     // Catch: java.lang.Throwable -> Lad
                long r5 = r4.f12812a     // Catch: java.lang.Throwable -> Lad
                r4.f12813b = r5     // Catch: java.lang.Throwable -> Lad
                goto L88
            L79:
                boolean r0 = r11.f12834c0     // Catch: java.lang.Throwable -> Lad
                if (r0 != 0) goto L87
                if (r2 != 0) goto L87
                ii.o r0 = r11.f12835d0     // Catch: java.lang.Throwable -> Lad
                r0.m7664l()     // Catch: java.lang.Throwable -> Lad
                r0 = 1
                r4 = r7
                goto L8b
            L87:
                r0 = r7
            L88:
                r4 = 0
                r4 = r0
                r0 = 0
            L8b:
                ii.o r1 = r11.f12835d0     // Catch: java.lang.Throwable -> Lb6
                ii.o$c r1 = r1.f12820i     // Catch: java.lang.Throwable -> Lb6
                r1.m7668l()     // Catch: java.lang.Throwable -> Lb6
                monitor-exit(r3)
                if (r0 == 0) goto L99
                r0 = 0
                goto L10
            L99:
                int r12 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r12 == 0) goto La1
                r11.m7666a(r4)
                return r4
            La1:
                if (r2 != 0) goto La4
                return r7
            La4:
                throw r2
            La5:
                java.io.IOException r12 = new java.io.IOException     // Catch: java.lang.Throwable -> Lad
                java.lang.String r13 = "stream closed"
                r12.<init>(r13)     // Catch: java.lang.Throwable -> Lad
                throw r12     // Catch: java.lang.Throwable -> Lad
            Lad:
                r12 = move-exception
                ii.o r13 = r11.f12835d0     // Catch: java.lang.Throwable -> Lb6
                ii.o$c r13 = r13.f12820i     // Catch: java.lang.Throwable -> Lb6
                r13.m7668l()     // Catch: java.lang.Throwable -> Lb6
                throw r12     // Catch: java.lang.Throwable -> Lb6
            Lb6:
                r12 = move-exception
                monitor-exit(r3)
                throw r12
            Lb9:
                java.lang.String r12 = "byteCount < 0: "
                java.lang.String r12 = p382w0.C6774a.m13748a(r12, r13)
                java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                java.lang.String r12 = r12.toString()
                r13.<init>(r12)
                throw r13
        }
    }

    /* renamed from: ii.o$c */
    public final class c extends p260oi.C5280b {

        /* renamed from: l */
        public final /* synthetic */ p154ii.C3188o f12836l;

        public c(p154ii.C3188o r1) {
                r0 = this;
                r0.f12836l = r1
                r0.<init>()
                return
        }

        @Override // p260oi.C5280b
        /* renamed from: j */
        public java.io.IOException mo7667j(java.io.IOException r3) {
                r2 = this;
                java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
                java.lang.String r1 = "timeout"
                r0.<init>(r1)
                if (r3 == 0) goto Lc
                r0.initCause(r3)
            Lc:
                return r0
        }

        @Override // p260oi.C5280b
        /* renamed from: k */
        public void mo5761k() {
                r10 = this;
                ii.o r0 = r10.f12836l
                ii.b r1 = p154ii.EnumC3175b.f12678e0
                r0.m7657e(r1)
                ii.o r0 = r10.f12836l
                ii.f r6 = r0.f12825n
                monitor-enter(r6)
                long r0 = r6.f12732n0     // Catch: java.lang.Throwable -> L45
                long r2 = r6.f12731m0     // Catch: java.lang.Throwable -> L45
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 >= 0) goto L16
                monitor-exit(r6)
                goto L44
            L16:
                r0 = 1
                long r2 = r2 + r0
                r6.f12731m0 = r2     // Catch: java.lang.Throwable -> L45
                long r0 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L45
                r2 = 1000000000(0x3b9aca00, float:0.0047237873)
                long r2 = (long) r2     // Catch: java.lang.Throwable -> L45
                long r0 = r0 + r2
                r6.f12734p0 = r0     // Catch: java.lang.Throwable -> L45
                monitor-exit(r6)
                ei.d r0 = r6.f12725g0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r6.f12720b0
                java.lang.String r3 = " ping"
                java.lang.String r4 = p346u.C6269n.m12888a(r1, r2, r3)
                r7 = 0
                r5 = 1
                ii.l r9 = new ii.l
                r1 = r9
                r2 = r4
                r3 = r5
                r1.<init>(r2, r3, r4, r5, r6)
                r0.m4616c(r9, r7)
            L44:
                return
            L45:
                r0 = move-exception
                monitor-exit(r6)
                throw r0
        }

        /* renamed from: l */
        public final void m7668l() {
                r2 = this;
                boolean r0 = r2.m11532i()
                if (r0 != 0) goto L7
                return
            L7:
                java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
                java.lang.String r1 = "timeout"
                r0.<init>(r1)
                throw r0
        }
    }

    public C3188o(int r4, p154ii.C3179f r5, boolean r6, boolean r7, bi.C0802v r8) {
            r3 = this;
            java.lang.String r0 = "connection"
            p214m2.C4339q.m9706k(r5, r0)
            r3.<init>()
            r3.f12824m = r4
            r3.f12825n = r5
            ii.t r4 = r5.f12736r0
            int r4 = r4.m7683a()
            long r0 = (long) r4
            r3.f12815d = r0
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            r3.f12816e = r4
            ii.o$b r0 = new ii.o$b
            ii.t r5 = r5.f12735q0
            int r5 = r5.m7683a()
            long r1 = (long) r5
            r0.<init>(r3, r1, r7)
            r3.f12818g = r0
            ii.o$a r5 = new ii.o$a
            r5.<init>(r3, r6)
            r3.f12819h = r5
            ii.o$c r5 = new ii.o$c
            r5.<init>(r3)
            r3.f12820i = r5
            ii.o$c r5 = new ii.o$c
            r5.<init>(r3)
            r3.f12821j = r5
            if (r8 == 0) goto L59
            boolean r5 = r3.m7660h()
            r5 = r5 ^ 1
            if (r5 == 0) goto L4d
            r4.add(r8)
            goto L5f
        L4d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "locally-initiated streams shouldn't have headers yet"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L59:
            boolean r4 = r3.m7660h()
            if (r4 == 0) goto L60
        L5f:
            return
        L60:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "remotely-initiated streams should have headers"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    /* renamed from: a */
    public final void m7653a() {
            r2 = this;
            byte[] r0 = ci.C0988c.f5065a
            monitor-enter(r2)
            ii.o$b r0 = r2.f12818g     // Catch: java.lang.Throwable -> L32
            boolean r1 = r0.f12834c0     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L19
            boolean r0 = r0.f12832a0     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L19
            ii.o$a r0 = r2.f12819h     // Catch: java.lang.Throwable -> L32
            boolean r1 = r0.f12828a0     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L17
            boolean r0 = r0.f12827Z     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L19
        L17:
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            boolean r1 = r2.m7661i()     // Catch: java.lang.Throwable -> L32
            monitor-exit(r2)
            if (r0 == 0) goto L28
            ii.b r0 = p154ii.EnumC3175b.f12678e0
            r1 = 0
            r2.m7655c(r0, r1)
            goto L31
        L28:
            if (r1 != 0) goto L31
            ii.f r0 = r2.f12825n
            int r1 = r2.f12824m
            r0.m7636l(r1)
        L31:
            return
        L32:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    /* renamed from: b */
    public final void m7654b() {
            r2 = this;
            ii.o$a r0 = r2.f12819h
            boolean r1 = r0.f12827Z
            if (r1 != 0) goto L27
            boolean r0 = r0.f12828a0
            if (r0 != 0) goto L1f
            ii.b r0 = r2.f12822k
            if (r0 == 0) goto L1e
            java.io.IOException r0 = r2.f12823l
            if (r0 == 0) goto L13
            goto L1d
        L13:
            ii.u r0 = new ii.u
            ii.b r1 = r2.f12822k
            p214m2.C4339q.m9704i(r1)
            r0.<init>(r1)
        L1d:
            throw r0
        L1e:
            return
        L1f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "stream finished"
            r0.<init>(r1)
            throw r0
        L27:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "stream closed"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: c */
    public final void m7655c(p154ii.EnumC3175b r2, java.io.IOException r3) {
            r1 = this;
            boolean r3 = r1.m7656d(r2, r3)
            if (r3 != 0) goto L7
            return
        L7:
            ii.f r3 = r1.f12825n
            int r0 = r1.f12824m
            java.util.Objects.requireNonNull(r3)
            ii.p r3 = r3.f12742x0
            r3.m7670L(r0, r2)
            return
    }

    /* renamed from: d */
    public final boolean m7656d(p154ii.EnumC3175b r3, java.io.IOException r4) {
            r2 = this;
            byte[] r0 = ci.C0988c.f5065a
            monitor-enter(r2)
            ii.b r0 = r2.f12822k     // Catch: java.lang.Throwable -> L29
            r1 = 0
            if (r0 == 0) goto La
            monitor-exit(r2)
            return r1
        La:
            ii.o$b r0 = r2.f12818g     // Catch: java.lang.Throwable -> L29
            boolean r0 = r0.f12834c0     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L18
            ii.o$a r0 = r2.f12819h     // Catch: java.lang.Throwable -> L29
            boolean r0 = r0.f12828a0     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L18
            monitor-exit(r2)
            return r1
        L18:
            r2.f12822k = r3     // Catch: java.lang.Throwable -> L29
            r2.f12823l = r4     // Catch: java.lang.Throwable -> L29
            r2.notifyAll()     // Catch: java.lang.Throwable -> L29
            monitor-exit(r2)
            ii.f r3 = r2.f12825n
            int r4 = r2.f12824m
            r3.m7636l(r4)
            r3 = 1
            return r3
        L29:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    /* renamed from: e */
    public final void m7657e(p154ii.EnumC3175b r3) {
            r2 = this;
            r0 = 0
            boolean r0 = r2.m7656d(r3, r0)
            if (r0 != 0) goto L8
            return
        L8:
            ii.f r0 = r2.f12825n
            int r1 = r2.f12824m
            r0.m7631R(r1, r3)
            return
    }

    /* renamed from: f */
    public final synchronized p154ii.EnumC3175b m7658f() {
            r1 = this;
            monitor-enter(r1)
            ii.b r0 = r1.f12822k     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    /* renamed from: g */
    public final p260oi.InterfaceC5302x m7659g() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f12817f     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto Le
            boolean r0 = r2.m7660h()     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            if (r0 == 0) goto L15
            monitor-exit(r2)
            ii.o$a r0 = r2.f12819h
            return r0
        L15:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L21
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L21
            throw r1     // Catch: java.lang.Throwable -> L21
        L21:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    /* renamed from: h */
    public final boolean m7660h() {
            r4 = this;
            int r0 = r4.f12824m
            r1 = 1
            r0 = r0 & r1
            r2 = 0
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            ii.f r3 = r4.f12825n
            boolean r3 = r3.f12717Y
            if (r3 != r0) goto L11
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    /* renamed from: i */
    public final synchronized boolean m7661i() {
            r3 = this;
            monitor-enter(r3)
            ii.b r0 = r3.f12822k     // Catch: java.lang.Throwable -> L25
            r1 = 0
            if (r0 == 0) goto L8
            monitor-exit(r3)
            return r1
        L8:
            ii.o$b r0 = r3.f12818g     // Catch: java.lang.Throwable -> L25
            boolean r2 = r0.f12834c0     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L12
            boolean r0 = r0.f12832a0     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L22
        L12:
            ii.o$a r0 = r3.f12819h     // Catch: java.lang.Throwable -> L25
            boolean r2 = r0.f12828a0     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L1c
            boolean r0 = r0.f12827Z     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L22
        L1c:
            boolean r0 = r3.f12817f     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L22
            monitor-exit(r3)
            return r1
        L22:
            r0 = 1
            monitor-exit(r3)
            return r0
        L25:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    /* renamed from: j */
    public final void m7662j(bi.C0802v r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "headers"
            p214m2.C4339q.m9706k(r3, r0)
            byte[] r0 = ci.C0988c.f5065a
            monitor-enter(r2)
            boolean r0 = r2.f12817f     // Catch: java.lang.Throwable -> L35
            r1 = 1
            if (r0 == 0) goto L16
            if (r4 != 0) goto L10
            goto L16
        L10:
            ii.o$b r3 = r2.f12818g     // Catch: java.lang.Throwable -> L35
            java.util.Objects.requireNonNull(r3)     // Catch: java.lang.Throwable -> L35
            goto L1d
        L16:
            r2.f12817f = r1     // Catch: java.lang.Throwable -> L35
            java.util.ArrayDeque<bi.v> r0 = r2.f12816e     // Catch: java.lang.Throwable -> L35
            r0.add(r3)     // Catch: java.lang.Throwable -> L35
        L1d:
            if (r4 == 0) goto L23
            ii.o$b r3 = r2.f12818g     // Catch: java.lang.Throwable -> L35
            r3.f12834c0 = r1     // Catch: java.lang.Throwable -> L35
        L23:
            boolean r3 = r2.m7661i()     // Catch: java.lang.Throwable -> L35
            r2.notifyAll()     // Catch: java.lang.Throwable -> L35
            monitor-exit(r2)
            if (r3 != 0) goto L34
            ii.f r3 = r2.f12825n
            int r4 = r2.f12824m
            r3.m7636l(r4)
        L34:
            return
        L35:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    /* renamed from: k */
    public final synchronized void m7663k(p154ii.EnumC3175b r2) {
            r1 = this;
            monitor-enter(r1)
            ii.b r0 = r1.f12822k     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto La
            r1.f12822k = r2     // Catch: java.lang.Throwable -> Lc
            r1.notifyAll()     // Catch: java.lang.Throwable -> Lc
        La:
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    /* renamed from: l */
    public final void m7664l() {
            r1 = this;
            r1.wait()     // Catch: java.lang.InterruptedException -> L4
            return
        L4:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>()
            throw r0
    }
}
