package p154ii;

/* renamed from: ii.f */
/* loaded from: classes.dex */
public final class C3179f implements java.io.Closeable {

    /* renamed from: A0 */
    public static final p154ii.C3193t f12715A0 = null;

    /* renamed from: B0 */
    public static final p154ii.C3179f f12716B0 = null;

    /* renamed from: Y */
    public final boolean f12717Y;

    /* renamed from: Z */
    public final p154ii.C3179f.c f12718Z;

    /* renamed from: a0 */
    public final java.util.Map<java.lang.Integer, p154ii.C3188o> f12719a0;

    /* renamed from: b0 */
    public final java.lang.String f12720b0;

    /* renamed from: c0 */
    public int f12721c0;

    /* renamed from: d0 */
    public int f12722d0;

    /* renamed from: e0 */
    public boolean f12723e0;

    /* renamed from: f0 */
    public final p080ei.C1857e f12724f0;

    /* renamed from: g0 */
    public final p080ei.C1856d f12725g0;

    /* renamed from: h0 */
    public final p080ei.C1856d f12726h0;

    /* renamed from: i0 */
    public final p080ei.C1856d f12727i0;

    /* renamed from: j0 */
    public final p154ii.InterfaceC3192s f12728j0;

    /* renamed from: k0 */
    public long f12729k0;

    /* renamed from: l0 */
    public long f12730l0;

    /* renamed from: m0 */
    public long f12731m0;

    /* renamed from: n0 */
    public long f12732n0;

    /* renamed from: o0 */
    public long f12733o0;

    /* renamed from: p0 */
    public long f12734p0;

    /* renamed from: q0 */
    public final p154ii.C3193t f12735q0;

    /* renamed from: r0 */
    public p154ii.C3193t f12736r0;

    /* renamed from: s0 */
    public long f12737s0;

    /* renamed from: t0 */
    public long f12738t0;

    /* renamed from: u0 */
    public long f12739u0;

    /* renamed from: v0 */
    public long f12740v0;

    /* renamed from: w0 */
    public final java.net.Socket f12741w0;

    /* renamed from: x0 */
    public final p154ii.C3189p f12742x0;

    /* renamed from: y0 */
    public final p154ii.C3179f.d f12743y0;

    /* renamed from: z0 */
    public final java.util.Set<java.lang.Integer> f12744z0;

    /* renamed from: ii.f$a */
    public static final class a extends p080ei.AbstractC1853a {

        /* renamed from: e */
        public final /* synthetic */ p154ii.C3179f f12745e;

        /* renamed from: f */
        public final /* synthetic */ long f12746f;

        public a(java.lang.String r1, java.lang.String r2, p154ii.C3179f r3, long r4) {
                r0 = this;
                r0.f12745e = r3
                r0.f12746f = r4
                r1 = 1
                r0.<init>(r2, r1)
                return
        }

        @Override // p080ei.AbstractC1853a
        /* renamed from: a */
        public long mo4598a() {
                r9 = this;
                ii.f r0 = r9.f12745e
                monitor-enter(r0)
                ii.f r1 = r9.f12745e     // Catch: java.lang.Throwable -> L29
                long r2 = r1.f12730l0     // Catch: java.lang.Throwable -> L29
                long r4 = r1.f12729k0     // Catch: java.lang.Throwable -> L29
                r6 = 0
                r7 = 1
                int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r8 >= 0) goto L11
                r2 = 1
                goto L17
            L11:
                r2 = 1
                long r4 = r4 + r2
                r1.f12729k0 = r4     // Catch: java.lang.Throwable -> L29
                r2 = 0
            L17:
                monitor-exit(r0)
                if (r2 == 0) goto L23
                r0 = 0
                ii.b r2 = p154ii.EnumC3175b.f12674a0
                r1.m7633a(r2, r2, r0)
                r0 = -1
                goto L28
            L23:
                r1.m7630Q(r6, r7, r6)
                long r0 = r9.f12746f
            L28:
                return r0
            L29:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }
    }

    /* renamed from: ii.f$b */
    public static final class b {

        /* renamed from: a */
        public java.net.Socket f12747a;

        /* renamed from: b */
        public java.lang.String f12748b;

        /* renamed from: c */
        public p260oi.InterfaceC5286h f12749c;

        /* renamed from: d */
        public p260oi.InterfaceC5285g f12750d;

        /* renamed from: e */
        public p154ii.C3179f.c f12751e;

        /* renamed from: f */
        public p154ii.InterfaceC3192s f12752f;

        /* renamed from: g */
        public int f12753g;

        /* renamed from: h */
        public boolean f12754h;

        /* renamed from: i */
        public final p080ei.C1857e f12755i;

        public b(boolean r2, p080ei.C1857e r3) {
                r1 = this;
                java.lang.String r0 = "taskRunner"
                p214m2.C4339q.m9706k(r3, r0)
                r1.<init>()
                r1.f12754h = r2
                r1.f12755i = r3
                ii.f$c r2 = p154ii.C3179f.c.f12756a
                r1.f12751e = r2
                ii.s r2 = p154ii.InterfaceC3192s.f12851a
                r1.f12752f = r2
                return
        }
    }

    /* renamed from: ii.f$c */
    public static abstract class c {

        /* renamed from: a */
        public static final p154ii.C3179f.c f12756a = null;

        /* renamed from: ii.f$c$a */
        public static final class a extends p154ii.C3179f.c {
            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // p154ii.C3179f.c
            /* renamed from: b */
            public void mo5763b(p154ii.C3188o r3) {
                    r2 = this;
                    java.lang.String r0 = "stream"
                    p214m2.C4339q.m9706k(r3, r0)
                    ii.b r0 = p154ii.EnumC3175b.f12677d0
                    r1 = 0
                    r3.m7655c(r0, r1)
                    return
            }
        }

        static {
                ii.f$c$a r0 = new ii.f$c$a
                r0.<init>()
                p154ii.C3179f.c.f12756a = r0
                return
        }

        public c() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public void mo5762a(p154ii.C3179f r2, p154ii.C3193t r3) {
                r1 = this;
                java.lang.String r0 = "connection"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r2 = "settings"
                p214m2.C4339q.m9706k(r3, r2)
                return
        }

        /* renamed from: b */
        public abstract void mo5763b(p154ii.C3188o r1);
    }

    /* renamed from: ii.f$d */
    public final class d implements p154ii.C3187n.b, mh.InterfaceC4609a<ch.C0985l> {

        /* renamed from: Y */
        public final p154ii.C3187n f12757Y;

        /* renamed from: Z */
        public final /* synthetic */ p154ii.C3179f f12758Z;

        /* renamed from: ii.f$d$a */
        public static final class a extends p080ei.AbstractC1853a {

            /* renamed from: e */
            public final /* synthetic */ p154ii.C3188o f12759e;

            /* renamed from: f */
            public final /* synthetic */ p154ii.C3179f.d f12760f;

            /* renamed from: g */
            public final /* synthetic */ java.util.List f12761g;

            public a(java.lang.String r1, boolean r2, java.lang.String r3, boolean r4, p154ii.C3188o r5, p154ii.C3179f.d r6, p154ii.C3188o r7, int r8, java.util.List r9, boolean r10) {
                    r0 = this;
                    r0.f12759e = r5
                    r0.f12760f = r6
                    r0.f12761g = r9
                    r0.<init>(r3, r4)
                    return
            }

            @Override // p080ei.AbstractC1853a
            /* renamed from: a */
            public long mo4598a() {
                    r4 = this;
                    ii.f$d r0 = r4.f12760f     // Catch: java.io.IOException -> Lc
                    ii.f r0 = r0.f12758Z     // Catch: java.io.IOException -> Lc
                    ii.f$c r0 = r0.f12718Z     // Catch: java.io.IOException -> Lc
                    ii.o r1 = r4.f12759e     // Catch: java.io.IOException -> Lc
                    r0.mo5763b(r1)     // Catch: java.io.IOException -> Lc
                    goto L2f
                Lc:
                    r0 = move-exception
                    ji.e$a r1 = p175ji.C3615e.f15897c
                    ji.e r1 = p175ji.C3615e.f15895a
                    java.lang.String r2 = "Http2Connection.Listener failure for "
                    java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
                    ii.f$d r3 = r4.f12760f
                    ii.f r3 = r3.f12758Z
                    java.lang.String r3 = r3.f12720b0
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    r3 = 4
                    r1.m8049i(r2, r3, r0)
                    ii.o r1 = r4.f12759e     // Catch: java.io.IOException -> L2f
                    ii.b r2 = p154ii.EnumC3175b.f12674a0     // Catch: java.io.IOException -> L2f
                    r1.m7655c(r2, r0)     // Catch: java.io.IOException -> L2f
                L2f:
                    r0 = -1
                    return r0
            }
        }

        /* renamed from: ii.f$d$b */
        public static final class b extends p080ei.AbstractC1853a {

            /* renamed from: e */
            public final /* synthetic */ p154ii.C3179f.d f12762e;

            /* renamed from: f */
            public final /* synthetic */ int f12763f;

            /* renamed from: g */
            public final /* synthetic */ int f12764g;

            public b(java.lang.String r1, boolean r2, java.lang.String r3, boolean r4, p154ii.C3179f.d r5, int r6, int r7) {
                    r0 = this;
                    r0.f12762e = r5
                    r0.f12763f = r6
                    r0.f12764g = r7
                    r0.<init>(r3, r4)
                    return
            }

            @Override // p080ei.AbstractC1853a
            /* renamed from: a */
            public long mo4598a() {
                    r4 = this;
                    ii.f$d r0 = r4.f12762e
                    ii.f r0 = r0.f12758Z
                    int r1 = r4.f12763f
                    int r2 = r4.f12764g
                    r3 = 1
                    r0.m7630Q(r3, r1, r2)
                    r0 = -1
                    return r0
            }
        }

        /* renamed from: ii.f$d$c */
        public static final class c extends p080ei.AbstractC1853a {

            /* renamed from: e */
            public final /* synthetic */ p154ii.C3179f.d f12765e;

            /* renamed from: f */
            public final /* synthetic */ boolean f12766f;

            /* renamed from: g */
            public final /* synthetic */ p154ii.C3193t f12767g;

            public c(java.lang.String r1, boolean r2, java.lang.String r3, boolean r4, p154ii.C3179f.d r5, boolean r6, p154ii.C3193t r7) {
                    r0 = this;
                    r0.f12765e = r5
                    r0.f12766f = r6
                    r0.f12767g = r7
                    r0.<init>(r3, r4)
                    return
            }

            @Override // p080ei.AbstractC1853a
            /* renamed from: a */
            public long mo4598a() {
                    r21 = this;
                    r1 = r21
                    ii.f$d r13 = r1.f12765e
                    boolean r9 = r1.f12766f
                    ii.t r10 = r1.f12767g
                    java.util.Objects.requireNonNull(r13)
                    java.lang.String r0 = "settings"
                    p214m2.C4339q.m9706k(r10, r0)
                    nh.p r14 = new nh.p
                    r14.<init>()
                    nh.q r15 = new nh.q
                    r15.<init>()
                    nh.q r0 = new nh.q
                    r0.<init>()
                    ii.f r2 = r13.f12758Z
                    ii.p r12 = r2.f12742x0
                    monitor-enter(r12)
                    ii.f r11 = r13.f12758Z     // Catch: java.lang.Throwable -> L112
                    monitor-enter(r11)     // Catch: java.lang.Throwable -> L112
                    ii.f r2 = r13.f12758Z     // Catch: java.lang.Throwable -> L109
                    ii.t r2 = r2.f12736r0     // Catch: java.lang.Throwable -> L109
                    if (r9 == 0) goto L2f
                    r3 = r10
                    goto L3a
                L2f:
                    ii.t r3 = new ii.t     // Catch: java.lang.Throwable -> L109
                    r3.<init>()     // Catch: java.lang.Throwable -> L109
                    r3.m7684b(r2)     // Catch: java.lang.Throwable -> L109
                    r3.m7684b(r10)     // Catch: java.lang.Throwable -> L109
                L3a:
                    r0.f19232Y = r3     // Catch: java.lang.Throwable -> L109
                    int r3 = r3.m7683a()     // Catch: java.lang.Throwable -> L109
                    long r3 = (long) r3     // Catch: java.lang.Throwable -> L109
                    int r2 = r2.m7683a()     // Catch: java.lang.Throwable -> L109
                    long r5 = (long) r2     // Catch: java.lang.Throwable -> L109
                    long r3 = r3 - r5
                    r14.f19231Y = r3     // Catch: java.lang.Throwable -> L109
                    r7 = 0
                    r6 = 0
                    int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                    if (r2 == 0) goto L76
                    ii.f r2 = r13.f12758Z     // Catch: java.lang.Throwable -> L109
                    java.util.Map<java.lang.Integer, ii.o> r2 = r2.f12719a0     // Catch: java.lang.Throwable -> L109
                    boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L109
                    if (r2 == 0) goto L5b
                    goto L76
                L5b:
                    ii.f r2 = r13.f12758Z     // Catch: java.lang.Throwable -> L109
                    java.util.Map<java.lang.Integer, ii.o> r2 = r2.f12719a0     // Catch: java.lang.Throwable -> L109
                    java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L109
                    ii.o[] r3 = new p154ii.C3188o[r6]     // Catch: java.lang.Throwable -> L109
                    java.lang.Object[] r2 = r2.toArray(r3)     // Catch: java.lang.Throwable -> L109
                    if (r2 == 0) goto L6e
                    ii.o[] r2 = (p154ii.C3188o[]) r2     // Catch: java.lang.Throwable -> L109
                    goto L77
                L6e:
                    java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L109
                    java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T>"
                    r0.<init>(r2)     // Catch: java.lang.Throwable -> L109
                    throw r0     // Catch: java.lang.Throwable -> L109
                L76:
                    r2 = 0
                L77:
                    r15.f19232Y = r2     // Catch: java.lang.Throwable -> L109
                    ii.f r2 = r13.f12758Z     // Catch: java.lang.Throwable -> L109
                    T r3 = r0.f19232Y     // Catch: java.lang.Throwable -> L109
                    ii.t r3 = (p154ii.C3193t) r3     // Catch: java.lang.Throwable -> L109
                    java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Throwable -> L109
                    java.lang.String r4 = "<set-?>"
                    p214m2.C4339q.m9706k(r3, r4)     // Catch: java.lang.Throwable -> L109
                    r2.f12736r0 = r3     // Catch: java.lang.Throwable -> L109
                    ii.f r2 = r13.f12758Z     // Catch: java.lang.Throwable -> L109
                    ei.d r5 = r2.f12727i0     // Catch: java.lang.Throwable -> L109
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L109
                    r2.<init>()     // Catch: java.lang.Throwable -> L109
                    ii.f r3 = r13.f12758Z     // Catch: java.lang.Throwable -> L109
                    java.lang.String r3 = r3.f12720b0     // Catch: java.lang.Throwable -> L109
                    r2.append(r3)     // Catch: java.lang.Throwable -> L109
                    java.lang.String r3 = " onSettings"
                    r2.append(r3)     // Catch: java.lang.Throwable -> L109
                    java.lang.String r16 = r2.toString()     // Catch: java.lang.Throwable -> L109
                    r17 = 1
                    ii.g r4 = new ii.g     // Catch: java.lang.Throwable -> L109
                    r2 = r4
                    r3 = r16
                    r18 = r4
                    r4 = r17
                    r19 = r5
                    r5 = r16
                    r16 = 0
                    r6 = r17
                    r7 = r13
                    r8 = r0
                    r17 = r11
                    r11 = r14
                    r20 = r12
                    r12 = r15
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L107
                    r3 = r18
                    r2 = r19
                    r4 = 0
                    r2.m4616c(r3, r4)     // Catch: java.lang.Throwable -> L107
                    monitor-exit(r17)     // Catch: java.lang.Throwable -> L110
                    ii.f r2 = r13.f12758Z     // Catch: java.io.IOException -> Ld6 java.lang.Throwable -> L110
                    ii.p r2 = r2.f12742x0     // Catch: java.io.IOException -> Ld6 java.lang.Throwable -> L110
                    T r0 = r0.f19232Y     // Catch: java.io.IOException -> Ld6 java.lang.Throwable -> L110
                    ii.t r0 = (p154ii.C3193t) r0     // Catch: java.io.IOException -> Ld6 java.lang.Throwable -> L110
                    r2.m7673a(r0)     // Catch: java.io.IOException -> Ld6 java.lang.Throwable -> L110
                    goto Lde
                Ld6:
                    r0 = move-exception
                    ii.f r2 = r13.f12758Z     // Catch: java.lang.Throwable -> L110
                    ii.b r3 = p154ii.EnumC3175b.f12674a0     // Catch: java.lang.Throwable -> L110
                    r2.m7633a(r3, r3, r0)     // Catch: java.lang.Throwable -> L110
                Lde:
                    monitor-exit(r20)
                    T r0 = r15.f19232Y
                    ii.o[] r0 = (p154ii.C3188o[]) r0
                    if (r0 == 0) goto L104
                    p214m2.C4339q.m9704i(r0)
                    int r2 = r0.length
                    r6 = 0
                Lea:
                    if (r6 >= r2) goto L104
                    r3 = r0[r6]
                    monitor-enter(r3)
                    long r7 = r14.f19231Y     // Catch: java.lang.Throwable -> L101
                    long r9 = r3.f12815d     // Catch: java.lang.Throwable -> L101
                    long r9 = r9 + r7
                    r3.f12815d = r9     // Catch: java.lang.Throwable -> L101
                    int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                    if (r9 <= 0) goto Lfd
                    r3.notifyAll()     // Catch: java.lang.Throwable -> L101
                Lfd:
                    monitor-exit(r3)
                    int r6 = r6 + 1
                    goto Lea
                L101:
                    r0 = move-exception
                    monitor-exit(r3)
                    throw r0
                L104:
                    r2 = -1
                    return r2
                L107:
                    r0 = move-exception
                    goto L10e
                L109:
                    r0 = move-exception
                    r17 = r11
                    r20 = r12
                L10e:
                    monitor-exit(r17)     // Catch: java.lang.Throwable -> L110
                    throw r0     // Catch: java.lang.Throwable -> L110
                L110:
                    r0 = move-exception
                    goto L115
                L112:
                    r0 = move-exception
                    r20 = r12
                L115:
                    monitor-exit(r20)
                    throw r0
            }
        }

        public d(p154ii.C3179f r1, p154ii.C3187n r2) {
                r0 = this;
                r0.f12758Z = r1
                r0.<init>()
                r0.f12757Y = r2
                return
        }

        @Override // p154ii.C3187n.b
        /* renamed from: a */
        public void mo7638a(int r11, p154ii.EnumC3175b r12) {
                r10 = this;
                ii.f r0 = r10.f12758Z
                boolean r0 = r0.m7635i(r11)
                if (r0 == 0) goto L3b
                ii.f r6 = r10.f12758Z
                java.util.Objects.requireNonNull(r6)
                ei.d r0 = r6.f12726h0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r6.f12720b0
                r1.append(r2)
                r2 = 91
                r1.append(r2)
                r1.append(r11)
                java.lang.String r2 = "] onReset"
                r1.append(r2)
                java.lang.String r4 = r1.toString()
                ii.k r9 = new ii.k
                r5 = 1
                r1 = r9
                r2 = r4
                r3 = r5
                r7 = r11
                r8 = r12
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                r11 = 0
                r0.m4616c(r9, r11)
                return
            L3b:
                ii.f r0 = r10.f12758Z
                ii.o r11 = r0.m7636l(r11)
                if (r11 == 0) goto L46
                r11.m7663k(r12)
            L46:
                return
        }

        @Override // p154ii.C3187n.b
        /* renamed from: c */
        public void mo7639c(int r4, p154ii.EnumC3175b r5, p260oi.C5287i r6) {
                r3 = this;
                java.lang.String r5 = "debugData"
                p214m2.C4339q.m9706k(r6, r5)
                r6.mo11585h()
                ii.f r5 = r3.f12758Z
                monitor-enter(r5)
                ii.f r6 = r3.f12758Z     // Catch: java.lang.Throwable -> L4b
                java.util.Map<java.lang.Integer, ii.o> r6 = r6.f12719a0     // Catch: java.lang.Throwable -> L4b
                java.util.Collection r6 = r6.values()     // Catch: java.lang.Throwable -> L4b
                r0 = 0
                ii.o[] r1 = new p154ii.C3188o[r0]     // Catch: java.lang.Throwable -> L4b
                java.lang.Object[] r6 = r6.toArray(r1)     // Catch: java.lang.Throwable -> L4b
                if (r6 == 0) goto L43
                ii.o[] r6 = (p154ii.C3188o[]) r6     // Catch: java.lang.Throwable -> L4b
                ii.f r1 = r3.f12758Z     // Catch: java.lang.Throwable -> L4b
                r2 = 1
                r1.f12723e0 = r2     // Catch: java.lang.Throwable -> L4b
                monitor-exit(r5)
                int r5 = r6.length
            L25:
                if (r0 >= r5) goto L42
                r1 = r6[r0]
                int r2 = r1.f12824m
                if (r2 <= r4) goto L3f
                boolean r2 = r1.m7660h()
                if (r2 == 0) goto L3f
                ii.b r2 = p154ii.EnumC3175b.f12677d0
                r1.m7663k(r2)
                ii.f r2 = r3.f12758Z
                int r1 = r1.f12824m
                r2.m7636l(r1)
            L3f:
                int r0 = r0 + 1
                goto L25
            L42:
                return
            L43:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L4b
                java.lang.String r6 = "null cannot be cast to non-null type kotlin.Array<T>"
                r4.<init>(r6)     // Catch: java.lang.Throwable -> L4b
                throw r4     // Catch: java.lang.Throwable -> L4b
            L4b:
                r4 = move-exception
                monitor-exit(r5)
                throw r4
        }

        @Override // p154ii.C3187n.b
        /* renamed from: d */
        public void mo7640d() {
                r0 = this;
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public ch.C0985l mo15e() {
                r5 = this;
                ii.b r0 = p154ii.EnumC3175b.f12675b0
                r1 = 0
                ii.n r2 = r5.f12757Y     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L22
                r2.m7650i(r5)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L22
            L8:
                ii.n r2 = r5.f12757Y     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L22
                r3 = 0
                boolean r2 = r2.m7649h(r3, r5)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L22
                if (r2 == 0) goto L12
                goto L8
            L12:
                ii.b r2 = p154ii.EnumC3175b.f12673Z     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L22
                ii.b r0 = p154ii.EnumC3175b.f12678e0     // Catch: java.io.IOException -> L1c java.lang.Throwable -> L33
                ii.f r3 = r5.f12758Z
                r3.m7633a(r2, r0, r1)
                goto L2b
            L1c:
                r1 = move-exception
                goto L24
            L1e:
                r2 = move-exception
                r3 = r2
                r2 = r0
                goto L34
            L22:
                r1 = move-exception
                r2 = r0
            L24:
                ii.b r0 = p154ii.EnumC3175b.f12674a0     // Catch: java.lang.Throwable -> L33
                ii.f r2 = r5.f12758Z
                r2.m7633a(r0, r0, r1)
            L2b:
                ii.n r0 = r5.f12757Y
                ci.C0988c.m2698c(r0)
                ch.l r0 = ch.C0985l.f5061a
                return r0
            L33:
                r3 = move-exception
            L34:
                ii.f r4 = r5.f12758Z
                r4.m7633a(r2, r0, r1)
                ii.n r0 = r5.f12757Y
                ci.C0988c.m2698c(r0)
                throw r3
        }

        @Override // p154ii.C3187n.b
        /* renamed from: f */
        public void mo7641f(boolean r12, int r13, int r14) {
                r11 = this;
                if (r12 == 0) goto L30
                ii.f r12 = r11.f12758Z
                monitor-enter(r12)
                r14 = 1
                r0 = 1
                if (r13 == r14) goto L24
                r14 = 2
                if (r13 == r14) goto L1c
                r14 = 3
                if (r13 == r14) goto L11
                goto L2b
            L11:
                ii.f r13 = r11.f12758Z     // Catch: java.lang.Throwable -> L2d
                long r2 = r13.f12733o0     // Catch: java.lang.Throwable -> L2d
                long r2 = r2 + r0
                r13.f12733o0 = r2     // Catch: java.lang.Throwable -> L2d
                r13.notifyAll()     // Catch: java.lang.Throwable -> L2d
                goto L2b
            L1c:
                ii.f r13 = r11.f12758Z     // Catch: java.lang.Throwable -> L2d
                long r2 = r13.f12732n0     // Catch: java.lang.Throwable -> L2d
                long r2 = r2 + r0
                r13.f12732n0 = r2     // Catch: java.lang.Throwable -> L2d
                goto L2b
            L24:
                ii.f r13 = r11.f12758Z     // Catch: java.lang.Throwable -> L2d
                long r2 = r13.f12730l0     // Catch: java.lang.Throwable -> L2d
                long r2 = r2 + r0
                r13.f12730l0 = r2     // Catch: java.lang.Throwable -> L2d
            L2b:
                monitor-exit(r12)
                goto L54
            L2d:
                r13 = move-exception
                monitor-exit(r12)
                throw r13
            L30:
                ii.f r12 = r11.f12758Z
                ei.d r12 = r12.f12725g0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                ii.f r1 = r11.f12758Z
                java.lang.String r1 = r1.f12720b0
                java.lang.String r2 = " ping"
                java.lang.String r6 = p346u.C6269n.m12888a(r0, r1, r2)
                r0 = 0
                r7 = 1
                ii.f$d$b r2 = new ii.f$d$b
                r3 = r2
                r4 = r6
                r5 = r7
                r8 = r11
                r9 = r13
                r10 = r14
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                r12.m4616c(r2, r0)
            L54:
                return
        }

        @Override // p154ii.C3187n.b
        /* renamed from: h */
        public void mo7642h(int r1, int r2, int r3, boolean r4) {
                r0 = this;
                return
        }

        @Override // p154ii.C3187n.b
        /* renamed from: j */
        public void mo7643j(boolean r13, p154ii.C3193t r14) {
                r12 = this;
                ii.f r0 = r12.f12758Z
                ei.d r0 = r0.f12725g0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                ii.f r2 = r12.f12758Z
                java.lang.String r2 = r2.f12720b0
                java.lang.String r3 = " applyAndAckSettings"
                java.lang.String r7 = p346u.C6269n.m12888a(r1, r2, r3)
                r1 = 0
                r8 = 1
                ii.f$d$c r3 = new ii.f$d$c
                r4 = r3
                r5 = r7
                r6 = r8
                r9 = r12
                r10 = r13
                r11 = r14
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                r0.m4616c(r3, r1)
                return
        }

        @Override // p154ii.C3187n.b
        /* renamed from: k */
        public void mo7644k(boolean r17, int r18, int r19, java.util.List<p154ii.C3176c> r20) {
                r16 = this;
                r12 = r16
                r0 = r18
                ii.f r1 = r12.f12758Z
                boolean r1 = r1.m7635i(r0)
                r7 = 91
                r13 = 0
                if (r1 == 0) goto L43
                ii.f r6 = r12.f12758Z
                java.util.Objects.requireNonNull(r6)
                ei.d r10 = r6.f12726h0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r6.f12720b0
                r1.append(r2)
                r1.append(r7)
                r1.append(r0)
                java.lang.String r2 = "] onHeaders"
                r1.append(r2)
                java.lang.String r4 = r1.toString()
                ii.i r11 = new ii.i
                r5 = 1
                r1 = r11
                r2 = r4
                r3 = r5
                r7 = r18
                r8 = r20
                r9 = r17
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                r10.m4616c(r11, r13)
                return
            L43:
                ii.f r15 = r12.f12758Z
                monitor-enter(r15)
                ii.f r1 = r12.f12758Z     // Catch: java.lang.Throwable -> Lcd
                ii.o r8 = r1.m7634h(r0)     // Catch: java.lang.Throwable -> Lcd
                if (r8 != 0) goto Lc2
                ii.f r1 = r12.f12758Z     // Catch: java.lang.Throwable -> Lcd
                boolean r2 = r1.f12723e0     // Catch: java.lang.Throwable -> Lcd
                if (r2 == 0) goto L56
                monitor-exit(r15)
                return
            L56:
                int r2 = r1.f12721c0     // Catch: java.lang.Throwable -> Lcd
                if (r0 > r2) goto L5c
                monitor-exit(r15)
                return
            L5c:
                int r2 = r0 % 2
                int r1 = r1.f12722d0     // Catch: java.lang.Throwable -> Lcd
                int r1 = r1 % 2
                if (r2 != r1) goto L66
                monitor-exit(r15)
                return
            L66:
                bi.v r6 = ci.C0988c.m2715t(r20)     // Catch: java.lang.Throwable -> Lcd
                ii.o r9 = new ii.o     // Catch: java.lang.Throwable -> Lcd
                ii.f r3 = r12.f12758Z     // Catch: java.lang.Throwable -> Lcd
                r4 = 0
                r1 = r9
                r2 = r18
                r5 = r17
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lcd
                ii.f r1 = r12.f12758Z     // Catch: java.lang.Throwable -> Lcd
                r1.f12721c0 = r0     // Catch: java.lang.Throwable -> Lcd
                java.util.Map<java.lang.Integer, ii.o> r1 = r1.f12719a0     // Catch: java.lang.Throwable -> Lcd
                java.lang.Integer r2 = java.lang.Integer.valueOf(r18)     // Catch: java.lang.Throwable -> Lcd
                r1.put(r2, r9)     // Catch: java.lang.Throwable -> Lcd
                ii.f r1 = r12.f12758Z     // Catch: java.lang.Throwable -> Lcd
                ei.e r1 = r1.f12724f0     // Catch: java.lang.Throwable -> Lcd
                ei.d r11 = r1.m4624f()     // Catch: java.lang.Throwable -> Lcd
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcd
                r1.<init>()     // Catch: java.lang.Throwable -> Lcd
                ii.f r2 = r12.f12758Z     // Catch: java.lang.Throwable -> Lcd
                java.lang.String r2 = r2.f12720b0     // Catch: java.lang.Throwable -> Lcd
                r1.append(r2)     // Catch: java.lang.Throwable -> Lcd
                r1.append(r7)     // Catch: java.lang.Throwable -> Lcd
                r1.append(r0)     // Catch: java.lang.Throwable -> Lcd
                java.lang.String r2 = "] onStream"
                r1.append(r2)     // Catch: java.lang.Throwable -> Lcd
                java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> Lcd
                r5 = 1
                ii.f$d$a r10 = new ii.f$d$a     // Catch: java.lang.Throwable -> Lcd
                r1 = r10
                r2 = r4
                r3 = r5
                r6 = r9
                r7 = r16
                r9 = r18
                r0 = r10
                r10 = r20
                r13 = r11
                r11 = r17
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lcd
                r1 = 0
                r13.m4616c(r0, r1)     // Catch: java.lang.Throwable -> Lcd
                monitor-exit(r15)
                return
            Lc2:
                monitor-exit(r15)
                bi.v r0 = ci.C0988c.m2715t(r20)
                r1 = r17
                r8.m7662j(r0, r1)
                return
            Lcd:
                r0 = move-exception
                monitor-exit(r15)
                throw r0
        }

        @Override // p154ii.C3187n.b
        /* renamed from: m */
        public void mo7645m(int r4, long r5) {
                r3 = this;
                if (r4 != 0) goto L13
                ii.f r4 = r3.f12758Z
                monitor-enter(r4)
                ii.f r0 = r3.f12758Z     // Catch: java.lang.Throwable -> L10
                long r1 = r0.f12740v0     // Catch: java.lang.Throwable -> L10
                long r1 = r1 + r5
                r0.f12740v0 = r1     // Catch: java.lang.Throwable -> L10
                r0.notifyAll()     // Catch: java.lang.Throwable -> L10
                goto L2a
            L10:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
            L13:
                ii.f r0 = r3.f12758Z
                ii.o r4 = r0.m7634h(r4)
                if (r4 == 0) goto L2f
                monitor-enter(r4)
                long r0 = r4.f12815d     // Catch: java.lang.Throwable -> L2c
                long r0 = r0 + r5
                r4.f12815d = r0     // Catch: java.lang.Throwable -> L2c
                r0 = 0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 <= 0) goto L2a
                r4.notifyAll()     // Catch: java.lang.Throwable -> L2c
            L2a:
                monitor-exit(r4)
                goto L2f
            L2c:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
            L2f:
                return
        }

        @Override // p154ii.C3187n.b
        /* renamed from: n */
        public void mo7646n(int r12, int r13, java.util.List<p154ii.C3176c> r14) {
                r11 = this;
                ii.f r5 = r11.f12758Z
                java.util.Objects.requireNonNull(r5)
                monitor-enter(r5)
                java.util.Set<java.lang.Integer> r12 = r5.f12744z0     // Catch: java.lang.Throwable -> L51
                java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> L51
                boolean r12 = r12.contains(r0)     // Catch: java.lang.Throwable -> L51
                if (r12 == 0) goto L19
                ii.b r12 = p154ii.EnumC3175b.f12674a0     // Catch: java.lang.Throwable -> L51
                r5.m7631R(r13, r12)     // Catch: java.lang.Throwable -> L51
                monitor-exit(r5)
                goto L50
            L19:
                java.util.Set<java.lang.Integer> r12 = r5.f12744z0     // Catch: java.lang.Throwable -> L51
                java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> L51
                r12.add(r0)     // Catch: java.lang.Throwable -> L51
                monitor-exit(r5)
                ei.d r12 = r5.f12726h0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r5.f12720b0
                r0.append(r1)
                r1 = 91
                r0.append(r1)
                r0.append(r13)
                java.lang.String r1 = "] onRequest"
                r0.append(r1)
                java.lang.String r3 = r0.toString()
                r8 = 0
                r4 = 1
                ii.j r10 = new ii.j
                r0 = r10
                r1 = r3
                r2 = r4
                r6 = r13
                r7 = r14
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                r12.m4616c(r10, r8)
            L50:
                return
            L51:
                r12 = move-exception
                monitor-exit(r5)
                throw r12
        }

        @Override // p154ii.C3187n.b
        /* renamed from: o */
        public void mo7647o(boolean r18, int r19, p260oi.InterfaceC5286h r20, int r21) {
                r17 = this;
                r1 = r17
                r0 = r19
                r2 = r20
                r10 = r21
                java.lang.String r3 = "source"
                p214m2.C4339q.m9706k(r2, r3)
                ii.f r3 = r1.f12758Z
                boolean r3 = r3.m7635i(r0)
                r12 = 0
                if (r3 == 0) goto L5d
                ii.f r7 = r1.f12758Z
                java.util.Objects.requireNonNull(r7)
                java.lang.String r3 = "source"
                p214m2.C4339q.m9706k(r2, r3)
                oi.e r9 = new oi.e
                r9.<init>()
                long r3 = (long) r10
                r2.mo11566k0(r3)
                r2.mo4683j0(r9, r3)
                ei.d r14 = r7.f12726h0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r7.f12720b0
                r2.append(r3)
                r3 = 91
                r2.append(r3)
                r2.append(r0)
                java.lang.String r3 = "] onData"
                r2.append(r3)
                java.lang.String r5 = r2.toString()
                ii.h r15 = new ii.h
                r6 = 1
                r2 = r15
                r3 = r5
                r4 = r6
                r8 = r19
                r10 = r21
                r11 = r18
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r14.m4616c(r15, r12)
                return
            L5d:
                ii.f r3 = r1.f12758Z
                ii.o r3 = r3.m7634h(r0)
                if (r3 != 0) goto L76
                ii.f r3 = r1.f12758Z
                ii.b r4 = p154ii.EnumC3175b.f12674a0
                r3.m7631R(r0, r4)
                ii.f r0 = r1.f12758Z
                long r3 = (long) r10
                r0.m7628A(r3)
                r2.mo11559b(r3)
                return
            L76:
                java.lang.String r0 = "source"
                p214m2.C4339q.m9706k(r2, r0)
                byte[] r0 = ci.C0988c.f5065a
                ii.o$b r0 = r3.f12818g
                long r4 = (long) r10
                java.util.Objects.requireNonNull(r0)
                java.lang.String r6 = "source"
                p214m2.C4339q.m9706k(r2, r6)
            L88:
                r6 = 1
                int r7 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
                if (r7 <= 0) goto L108
                ii.o r7 = r0.f12835d0
                monitor-enter(r7)
                boolean r8 = r0.f12834c0     // Catch: java.lang.Throwable -> L105
                oi.e r9 = r0.f12831Z     // Catch: java.lang.Throwable -> L105
                long r9 = r9.f20501Z     // Catch: java.lang.Throwable -> L105
                long r9 = r9 + r4
                long r14 = r0.f12833b0     // Catch: java.lang.Throwable -> L105
                r11 = 0
                int r16 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r16 <= 0) goto La0
                r9 = 1
                goto La1
            La0:
                r9 = 0
            La1:
                monitor-exit(r7)
                if (r9 == 0) goto Laf
                r2.mo11559b(r4)
                ii.o r0 = r0.f12835d0
                ii.b r2 = p154ii.EnumC3175b.f12676c0
                r0.m7657e(r2)
                goto L108
            Laf:
                if (r8 == 0) goto Lb5
                r2.mo11559b(r4)
                goto L108
            Lb5:
                oi.e r7 = r0.f12830Y
                long r7 = r2.mo4683j0(r7, r4)
                r9 = -1
                int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r14 == 0) goto Lff
                long r4 = r4 - r7
                ii.o r7 = r0.f12835d0
                monitor-enter(r7)
                boolean r8 = r0.f12832a0     // Catch: java.lang.Throwable -> Lfc
                if (r8 == 0) goto Ld1
                oi.e r6 = r0.f12830Y     // Catch: java.lang.Throwable -> Lfc
                long r8 = r6.f20501Z     // Catch: java.lang.Throwable -> Lfc
                r6.mo11559b(r8)     // Catch: java.lang.Throwable -> Lfc
                goto Lf3
            Ld1:
                oi.e r8 = r0.f12831Z     // Catch: java.lang.Throwable -> Lfc
                long r9 = r8.f20501Z     // Catch: java.lang.Throwable -> Lfc
                int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
                if (r14 != 0) goto Lda
                goto Ldb
            Lda:
                r6 = 0
            Ldb:
                oi.e r9 = r0.f12830Y     // Catch: java.lang.Throwable -> Lfc
                r8.m11538C0(r9)     // Catch: java.lang.Throwable -> Lfc
                if (r6 == 0) goto Lf2
                ii.o r6 = r0.f12835d0     // Catch: java.lang.Throwable -> Lfc
                if (r6 == 0) goto Lea
                r6.notifyAll()     // Catch: java.lang.Throwable -> Lfc
                goto Lf2
            Lea:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> Lfc
                java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
                r0.<init>(r2)     // Catch: java.lang.Throwable -> Lfc
                throw r0     // Catch: java.lang.Throwable -> Lfc
            Lf2:
                r8 = r12
            Lf3:
                monitor-exit(r7)
                int r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r6 <= 0) goto L88
                r0.m7666a(r8)
                goto L88
            Lfc:
                r0 = move-exception
                monitor-exit(r7)
                throw r0
            Lff:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
            L105:
                r0 = move-exception
                monitor-exit(r7)
                throw r0
            L108:
                if (r18 == 0) goto L10f
                bi.v r0 = ci.C0988c.f5066b
                r3.m7662j(r0, r6)
            L10f:
                return
        }
    }

    /* renamed from: ii.f$e */
    public static final class e extends p080ei.AbstractC1853a {

        /* renamed from: e */
        public final /* synthetic */ p154ii.C3179f f12768e;

        /* renamed from: f */
        public final /* synthetic */ int f12769f;

        /* renamed from: g */
        public final /* synthetic */ p154ii.EnumC3175b f12770g;

        public e(java.lang.String r1, boolean r2, java.lang.String r3, boolean r4, p154ii.C3179f r5, int r6, p154ii.EnumC3175b r7) {
                r0 = this;
                r0.f12768e = r5
                r0.f12769f = r6
                r0.f12770g = r7
                r0.<init>(r3, r4)
                return
        }

        @Override // p080ei.AbstractC1853a
        /* renamed from: a */
        public long mo4598a() {
                r4 = this;
                ii.f r0 = r4.f12768e     // Catch: java.io.IOException -> L14
                int r1 = r4.f12769f     // Catch: java.io.IOException -> L14
                ii.b r2 = r4.f12770g     // Catch: java.io.IOException -> L14
                java.util.Objects.requireNonNull(r0)     // Catch: java.io.IOException -> L14
                java.lang.String r3 = "statusCode"
                p214m2.C4339q.m9706k(r2, r3)     // Catch: java.io.IOException -> L14
                ii.p r0 = r0.f12742x0     // Catch: java.io.IOException -> L14
                r0.m7670L(r1, r2)     // Catch: java.io.IOException -> L14
                goto L1c
            L14:
                r0 = move-exception
                ii.f r1 = r4.f12768e
                ii.b r2 = p154ii.EnumC3175b.f12674a0
                r1.m7633a(r2, r2, r0)
            L1c:
                r0 = -1
                return r0
        }
    }

    /* renamed from: ii.f$f */
    public static final class f extends p080ei.AbstractC1853a {

        /* renamed from: e */
        public final /* synthetic */ p154ii.C3179f f12771e;

        /* renamed from: f */
        public final /* synthetic */ int f12772f;

        /* renamed from: g */
        public final /* synthetic */ long f12773g;

        public f(java.lang.String r1, boolean r2, java.lang.String r3, boolean r4, p154ii.C3179f r5, int r6, long r7) {
                r0 = this;
                r0.f12771e = r5
                r0.f12772f = r6
                r0.f12773g = r7
                r0.<init>(r3, r4)
                return
        }

        @Override // p080ei.AbstractC1853a
        /* renamed from: a */
        public long mo4598a() {
                r4 = this;
                ii.f r0 = r4.f12771e     // Catch: java.io.IOException -> Lc
                ii.p r0 = r0.f12742x0     // Catch: java.io.IOException -> Lc
                int r1 = r4.f12772f     // Catch: java.io.IOException -> Lc
                long r2 = r4.f12773g     // Catch: java.io.IOException -> Lc
                r0.m7671Q(r1, r2)     // Catch: java.io.IOException -> Lc
                goto L14
            Lc:
                r0 = move-exception
                ii.f r1 = r4.f12771e
                ii.b r2 = p154ii.EnumC3175b.f12674a0
                r1.m7633a(r2, r2, r0)
            L14:
                r0 = -1
                return r0
        }
    }

    static {
            ii.t r0 = new ii.t
            r0.<init>()
            r1 = 7
            r2 = 65535(0xffff, float:9.1834E-41)
            r0.m7685c(r1, r2)
            r1 = 5
            r2 = 16384(0x4000, float:2.2959E-41)
            r0.m7685c(r1, r2)
            p154ii.C3179f.f12715A0 = r0
            return
    }

    public C3179f(p154ii.C3179f.b r12) {
            r11 = this;
            r11.<init>()
            boolean r0 = r12.f12754h
            r11.f12717Y = r0
            ii.f$c r1 = r12.f12751e
            r11.f12718Z = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r11.f12719a0 = r1
            java.lang.String r1 = r12.f12748b
            r2 = 0
            if (r1 == 0) goto Lb0
            r11.f12720b0 = r1
            boolean r3 = r12.f12754h
            if (r3 == 0) goto L1f
            r3 = 3
            goto L20
        L1f:
            r3 = 2
        L20:
            r11.f12722d0 = r3
            ei.e r3 = r12.f12755i
            r11.f12724f0 = r3
            ei.d r4 = r3.m4624f()
            r11.f12725g0 = r4
            ei.d r5 = r3.m4624f()
            r11.f12726h0 = r5
            ei.d r3 = r3.m4624f()
            r11.f12727i0 = r3
            ii.s r3 = r12.f12752f
            r11.f12728j0 = r3
            ii.t r3 = new ii.t
            r3.<init>()
            boolean r5 = r12.f12754h
            if (r5 == 0) goto L4b
            r5 = 7
            r6 = 16777216(0x1000000, float:2.3509887E-38)
            r3.m7685c(r5, r6)
        L4b:
            r11.f12735q0 = r3
            ii.t r3 = p154ii.C3179f.f12715A0
            r11.f12736r0 = r3
            int r3 = r3.m7683a()
            long r5 = (long) r3
            r11.f12740v0 = r5
            java.net.Socket r3 = r12.f12747a
            if (r3 == 0) goto Laa
            r11.f12741w0 = r3
            ii.p r3 = new ii.p
            oi.g r5 = r12.f12750d
            if (r5 == 0) goto La4
            r3.<init>(r5, r0)
            r11.f12742x0 = r3
            ii.f$d r3 = new ii.f$d
            ii.n r5 = new ii.n
            oi.h r6 = r12.f12749c
            if (r6 == 0) goto L9e
            r5.<init>(r6, r0)
            r3.<init>(r11, r5)
            r11.f12743y0 = r3
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r11.f12744z0 = r0
            int r12 = r12.f12753g
            if (r12 == 0) goto L9d
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r2 = (long) r12
            long r2 = r0.toNanos(r2)
            java.lang.String r12 = " ping"
            java.lang.String r7 = p064e.C1493g.m4049a(r1, r12)
            ii.f$a r12 = new ii.f$a
            r5 = r12
            r6 = r7
            r8 = r11
            r9 = r2
            r5.<init>(r6, r7, r8, r9)
            r4.m4616c(r12, r2)
        L9d:
            return
        L9e:
            java.lang.String r12 = "source"
            p214m2.C4339q.m9713w(r12)
            throw r2
        La4:
            java.lang.String r12 = "sink"
            p214m2.C4339q.m9713w(r12)
            throw r2
        Laa:
            java.lang.String r12 = "socket"
            p214m2.C4339q.m9713w(r12)
            throw r2
        Lb0:
            java.lang.String r12 = "connectionName"
            p214m2.C4339q.m9713w(r12)
            throw r2
    }

    /* renamed from: A */
    public final synchronized void m7628A(long r4) {
            r3 = this;
            monitor-enter(r3)
            long r0 = r3.f12737s0     // Catch: java.lang.Throwable -> L21
            long r0 = r0 + r4
            r3.f12737s0 = r0     // Catch: java.lang.Throwable -> L21
            long r4 = r3.f12738t0     // Catch: java.lang.Throwable -> L21
            long r0 = r0 - r4
            ii.t r4 = r3.f12735q0     // Catch: java.lang.Throwable -> L21
            int r4 = r4.m7683a()     // Catch: java.lang.Throwable -> L21
            int r4 = r4 / 2
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L21
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L1f
            r4 = 0
            r3.m7632S(r4, r0)     // Catch: java.lang.Throwable -> L21
            long r4 = r3.f12738t0     // Catch: java.lang.Throwable -> L21
            long r4 = r4 + r0
            r3.f12738t0 = r4     // Catch: java.lang.Throwable -> L21
        L1f:
            monitor-exit(r3)
            return
        L21:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    /* renamed from: L */
    public final void m7629L(int r9, boolean r10, p260oi.C5283e r11, long r12) {
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            ii.p r12 = r8.f12742x0
            r12.m7674h(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r3 = r8.f12739u0     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            long r5 = r8.f12740v0     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L32
            java.util.Map<java.lang.Integer, ii.o> r3 = r8.f12719a0     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            if (r3 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            goto L12
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
        L32:
            long r5 = r5 - r3
            long r3 = java.lang.Math.min(r12, r5)     // Catch: java.lang.Throwable -> L57
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L57
            ii.p r3 = r8.f12742x0     // Catch: java.lang.Throwable -> L57
            int r3 = r3.f12839Z     // Catch: java.lang.Throwable -> L57
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L57
            long r4 = r8.f12739u0     // Catch: java.lang.Throwable -> L57
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L57
            long r4 = r4 + r6
            r8.f12739u0 = r4     // Catch: java.lang.Throwable -> L57
            monitor-exit(r8)
            long r12 = r12 - r6
            ii.p r4 = r8.f12742x0
            if (r10 == 0) goto L52
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L52
            r5 = 1
            goto L53
        L52:
            r5 = 0
        L53:
            r4.m7674h(r5, r9, r11, r3)
            goto Ld
        L57:
            r9 = move-exception
            goto L66
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L57
            r9.interrupt()     // Catch: java.lang.Throwable -> L57
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L57
            r9.<init>()     // Catch: java.lang.Throwable -> L57
            throw r9     // Catch: java.lang.Throwable -> L57
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
    }

    /* renamed from: Q */
    public final void m7630Q(boolean r2, int r3, int r4) {
            r1 = this;
            ii.p r0 = r1.f12742x0     // Catch: java.io.IOException -> L6
            r0.m7669A(r2, r3, r4)     // Catch: java.io.IOException -> L6
            goto Lc
        L6:
            r2 = move-exception
            ii.b r3 = p154ii.EnumC3175b.f12674a0
            r1.m7633a(r3, r3, r2)
        Lc:
            return
    }

    /* renamed from: R */
    public final void m7631R(int r12, p154ii.EnumC3175b r13) {
            r11 = this;
            ei.d r0 = r11.f12725g0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r11.f12720b0
            r1.append(r2)
            r2 = 91
            r1.append(r2)
            r1.append(r12)
            java.lang.String r2 = "] writeSynReset"
            r1.append(r2)
            java.lang.String r6 = r1.toString()
            ii.f$e r1 = new ii.f$e
            r7 = 1
            r3 = r1
            r4 = r6
            r5 = r7
            r8 = r11
            r9 = r12
            r10 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r12 = 0
            r0.m4616c(r1, r12)
            return
    }

    /* renamed from: S */
    public final void m7632S(int r13, long r14) {
            r12 = this;
            ei.d r0 = r12.f12725g0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r12.f12720b0
            r1.append(r2)
            r2 = 91
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = "] windowUpdate"
            r1.append(r2)
            java.lang.String r6 = r1.toString()
            ii.f$f r1 = new ii.f$f
            r7 = 1
            r3 = r1
            r4 = r6
            r5 = r7
            r8 = r12
            r9 = r13
            r10 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r13 = 0
            r0.m4616c(r1, r13)
            return
    }

    /* renamed from: a */
    public final void m7633a(p154ii.EnumC3175b r4, p154ii.EnumC3175b r5, java.io.IOException r6) {
            r3 = this;
            byte[] r0 = ci.C0988c.f5065a
            r3.m7637n(r4)     // Catch: java.io.IOException -> L5
        L5:
            r4 = 0
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, ii.o> r0 = r3.f12719a0     // Catch: java.lang.Throwable -> L58
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L58
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L30
            java.util.Map<java.lang.Integer, ii.o> r4 = r3.f12719a0     // Catch: java.lang.Throwable -> L58
            java.util.Collection r4 = r4.values()     // Catch: java.lang.Throwable -> L58
            ii.o[] r0 = new p154ii.C3188o[r1]     // Catch: java.lang.Throwable -> L58
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch: java.lang.Throwable -> L58
            if (r4 == 0) goto L28
            ii.o[] r4 = (p154ii.C3188o[]) r4     // Catch: java.lang.Throwable -> L58
            java.util.Map<java.lang.Integer, ii.o> r0 = r3.f12719a0     // Catch: java.lang.Throwable -> L58
            r0.clear()     // Catch: java.lang.Throwable -> L58
            goto L30
        L28:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L58
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L58
            throw r4     // Catch: java.lang.Throwable -> L58
        L30:
            monitor-exit(r3)
            if (r4 == 0) goto L3e
            int r0 = r4.length
        L34:
            if (r1 >= r0) goto L3e
            r2 = r4[r1]
            r2.m7655c(r5, r6)     // Catch: java.io.IOException -> L3b
        L3b:
            int r1 = r1 + 1
            goto L34
        L3e:
            ii.p r4 = r3.f12742x0     // Catch: java.io.IOException -> L43
            r4.close()     // Catch: java.io.IOException -> L43
        L43:
            java.net.Socket r4 = r3.f12741w0     // Catch: java.io.IOException -> L48
            r4.close()     // Catch: java.io.IOException -> L48
        L48:
            ei.d r4 = r3.f12725g0
            r4.m4618e()
            ei.d r4 = r3.f12726h0
            r4.m4618e()
            ei.d r4 = r3.f12727i0
            r4.m4618e()
            return
        L58:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            ii.b r0 = p154ii.EnumC3175b.f12673Z
            ii.b r1 = p154ii.EnumC3175b.f12678e0
            r2 = 0
            r3.m7633a(r0, r1, r2)
            return
    }

    /* renamed from: h */
    public final synchronized p154ii.C3188o m7634h(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, ii.o> r0 = r1.f12719a0     // Catch: java.lang.Throwable -> Lf
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> Lf
            ii.o r2 = (p154ii.C3188o) r2     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return r2
        Lf:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    /* renamed from: i */
    public final boolean m7635i(int r2) {
            r1 = this;
            r0 = 1
            if (r2 == 0) goto L7
            r2 = r2 & r0
            if (r2 != 0) goto L7
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    /* renamed from: l */
    public final synchronized p154ii.C3188o m7636l(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, ii.o> r0 = r1.f12719a0     // Catch: java.lang.Throwable -> L12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L12
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L12
            ii.o r2 = (p154ii.C3188o) r2     // Catch: java.lang.Throwable -> L12
            r1.notifyAll()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return r2
        L12:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    /* renamed from: n */
    public final void m7637n(p154ii.EnumC3175b r5) {
            r4 = this;
            ii.p r0 = r4.f12742x0
            monitor-enter(r0)
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r4.f12723e0     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto Lb
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)
            return
        Lb:
            r1 = 1
            r4.f12723e0 = r1     // Catch: java.lang.Throwable -> L1a
            int r1 = r4.f12721c0     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
            ii.p r2 = r4.f12742x0     // Catch: java.lang.Throwable -> L1d
            byte[] r3 = ci.C0988c.f5065a     // Catch: java.lang.Throwable -> L1d
            r2.m7676l(r1, r5, r3)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)
            return
        L1a:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
            throw r5     // Catch: java.lang.Throwable -> L1d
        L1d:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
    }
}
