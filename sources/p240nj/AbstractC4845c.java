package p240nj;

/* renamed from: nj.c */
/* loaded from: classes.dex */
public abstract class AbstractC4845c {

    /* renamed from: a */
    public sj.InterfaceC6080a f19248a;

    /* renamed from: b */
    public p240nj.AbstractC4846d f19249b;

    /* renamed from: c */
    public p240nj.AbstractC4846d f19250c;

    /* renamed from: d */
    public java.math.BigInteger f19251d;

    /* renamed from: e */
    public java.math.BigInteger f19252e;

    /* renamed from: f */
    public int f19253f;

    /* renamed from: g */
    public p318rj.InterfaceC5932a f19254g;

    /* renamed from: h */
    public p124h7.AbstractC2947xb f19255h;

    /* renamed from: nj.c$a */
    public class a implements p240nj.InterfaceC4847e {

        /* renamed from: a */
        public final /* synthetic */ int f19256a;

        /* renamed from: b */
        public final /* synthetic */ int f19257b;

        /* renamed from: c */
        public final /* synthetic */ byte[] f19258c;

        /* renamed from: d */
        public final /* synthetic */ p240nj.AbstractC4845c f19259d;

        public a(p240nj.AbstractC4845c r1, int r2, int r3, byte[] r4) {
                r0 = this;
                r0.f19259d = r1
                r0.f19256a = r2
                r0.f19257b = r3
                r0.f19258c = r4
                r0.<init>()
                return
        }

        @Override // p240nj.InterfaceC4847e
        /* renamed from: a */
        public int mo10888a() {
                r1 = this;
                int r0 = r1.f19256a
                return r0
        }

        @Override // p240nj.InterfaceC4847e
        /* renamed from: b */
        public p240nj.AbstractC4848f mo10889b(int r12) {
                r11 = this;
                int r0 = r11.f19257b
                byte[] r1 = new byte[r0]
                byte[] r0 = new byte[r0]
                r2 = 0
                r3 = 0
                r4 = 0
            L9:
                int r5 = r11.f19256a
                r6 = 1
                if (r3 >= r5) goto L39
                r5 = r3 ^ r12
                int r5 = r5 - r6
                int r5 = r5 >> 31
                r6 = 0
            L14:
                int r7 = r11.f19257b
                if (r6 >= r7) goto L33
                r8 = r1[r6]
                byte[] r9 = r11.f19258c
                int r10 = r4 + r6
                r10 = r9[r10]
                r10 = r10 & r5
                r8 = r8 ^ r10
                byte r8 = (byte) r8
                r1[r6] = r8
                r8 = r0[r6]
                int r7 = r7 + r4
                int r7 = r7 + r6
                r7 = r9[r7]
                r7 = r7 & r5
                r7 = r7 ^ r8
                byte r7 = (byte) r7
                r0[r6] = r7
                int r6 = r6 + 1
                goto L14
            L33:
                int r7 = r7 * 2
                int r4 = r4 + r7
                int r3 = r3 + 1
                goto L9
            L39:
                nj.c r12 = r11.f19259d
                java.math.BigInteger r3 = new java.math.BigInteger
                r3.<init>(r6, r1)
                nj.d r1 = r12.mo10879l(r3)
                nj.c r3 = r11.f19259d
                java.math.BigInteger r4 = new java.math.BigInteger
                r4.<init>(r6, r0)
                nj.d r0 = r3.mo10879l(r4)
                nj.f r12 = r12.mo10874g(r1, r0, r2)
                return r12
        }
    }

    /* renamed from: nj.c$b */
    public static abstract class b extends p240nj.AbstractC4845c {

        /* renamed from: i */
        public java.math.BigInteger[] f19260i;

        public b(int r6, int r7, int r8, int r9) {
                r5 = this;
                if (r7 == 0) goto L4c
                r0 = 2
                r1 = 1
                r2 = 3
                r3 = 0
                if (r8 != 0) goto L1f
                if (r9 != 0) goto L17
                int[] r8 = new int[r2]
                r8[r3] = r3
                r8[r1] = r7
                r8[r0] = r6
                sj.e r6 = sj.AbstractC6081b.m12529a(r8)
                goto L35
            L17:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "k3 must be 0 if k2 == 0"
                r6.<init>(r7)
                throw r6
            L1f:
                if (r8 <= r7) goto L44
                if (r9 <= r8) goto L3c
                r4 = 5
                int[] r4 = new int[r4]
                r4[r3] = r3
                r4[r1] = r7
                r4[r0] = r8
                r4[r2] = r9
                r7 = 4
                r4[r7] = r6
                sj.e r6 = sj.AbstractC6081b.m12529a(r4)
            L35:
                r5.<init>(r6)
                r6 = 0
                r5.f19260i = r6
                return
            L3c:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "k3 must be > k2"
                r6.<init>(r7)
                throw r6
            L44:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "k2 must be > k1"
                r6.<init>(r7)
                throw r6
            L4c:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "k1 must be > 0"
                r6.<init>(r7)
                throw r6
        }

        @Override // p240nj.AbstractC4845c
        /* renamed from: f */
        public p240nj.AbstractC4848f mo10873f(java.math.BigInteger r3, java.math.BigInteger r4, boolean r5) {
                r2 = this;
                nj.d r3 = r2.mo10879l(r3)
                nj.d r4 = r2.mo10879l(r4)
                int r0 = r2.f19253f
                r1 = 5
                if (r0 == r1) goto L11
                r1 = 6
                if (r0 == r1) goto L11
                goto L32
            L11:
                boolean r0 = r3.mo10901i()
                if (r0 == 0) goto L2a
                nj.d r0 = r4.mo10907o()
                nj.d r1 = r2.f19250c
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L24
                goto L32
            L24:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                r3.<init>()
                throw r3
            L2a:
                nj.d r4 = r4.mo10896d(r3)
                nj.d r4 = r4.mo10893a(r3)
            L32:
                nj.f r3 = r2.mo10874g(r3, r4, r5)
                return r3
        }

        @Override // p240nj.AbstractC4845c
        /* renamed from: j */
        public p240nj.AbstractC4848f mo10877j(int r4, java.math.BigInteger r5) {
                r3 = this;
                nj.d r5 = r3.mo10879l(r5)
                boolean r0 = r5.mo10901i()
                r1 = 1
                if (r0 == 0) goto L12
                nj.d r4 = r3.f19250c
                nj.d r4 = r4.mo10906n()
                goto L52
            L12:
                nj.d r0 = r5.mo10907o()
                nj.d r0 = r0.mo10899g()
                nj.d r2 = r3.f19250c
                nj.d r0 = r0.mo10902j(r2)
                nj.d r2 = r3.f19249b
                nj.d r0 = r0.mo10893a(r2)
                nj.d r0 = r0.mo10893a(r5)
                nj.d r0 = r3.m10891v(r0)
                if (r0 == 0) goto L51
                boolean r2 = r0.mo10911s()
                if (r4 != r1) goto L38
                r4 = 1
                goto L39
            L38:
                r4 = 0
            L39:
                if (r2 == r4) goto L3f
                nj.d r0 = r0.mo10894b()
            L3f:
                int r4 = r3.f19253f
                r2 = 5
                if (r4 == r2) goto L4c
                r2 = 6
                if (r4 == r2) goto L4c
                nj.d r4 = r0.mo10902j(r5)
                goto L52
            L4c:
                nj.d r4 = r0.mo10893a(r5)
                goto L52
            L51:
                r4 = 0
            L52:
                if (r4 == 0) goto L59
                nj.f r4 = r3.mo10874g(r5, r4, r1)
                return r4
            L59:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Invalid point compression"
                r4.<init>(r5)
                throw r4
        }

        /* renamed from: u */
        public boolean mo10890u() {
                r1 = this;
                java.math.BigInteger r0 = r1.f19251d
                if (r0 == 0) goto L22
                java.math.BigInteger r0 = r1.f19252e
                if (r0 == 0) goto L22
                nj.d r0 = r1.f19250c
                boolean r0 = r0.mo10900h()
                if (r0 == 0) goto L22
                nj.d r0 = r1.f19249b
                boolean r0 = r0.mo10901i()
                if (r0 != 0) goto L20
                nj.d r0 = r1.f19249b
                boolean r0 = r0.mo10900h()
                if (r0 == 0) goto L22
            L20:
                r0 = 1
                goto L23
            L22:
                r0 = 0
            L23:
                return r0
        }

        /* renamed from: v */
        public p240nj.AbstractC4846d m10891v(p240nj.AbstractC4846d r9) {
                r8 = this;
                boolean r0 = r9.mo10901i()
                if (r0 == 0) goto L7
                return r9
            L7:
                java.math.BigInteger r0 = p240nj.InterfaceC4844b.f19243R
                nj.d r0 = r8.mo10879l(r0)
                int r1 = r8.mo10880m()
                java.util.Random r2 = new java.util.Random
                r2.<init>()
            L16:
                java.math.BigInteger r3 = new java.math.BigInteger
                r3.<init>(r1, r2)
                nj.d r3 = r8.mo10879l(r3)
                r4 = 1
                r5 = r9
                r6 = r0
            L22:
                if (r4 >= r1) goto L3b
                nj.d r5 = r5.mo10907o()
                nj.d r6 = r6.mo10907o()
                nj.d r7 = r5.mo10902j(r3)
                nj.d r6 = r6.mo10893a(r7)
                nj.d r5 = r5.mo10893a(r9)
                int r4 = r4 + 1
                goto L22
            L3b:
                boolean r3 = r5.mo10901i()
                if (r3 != 0) goto L43
                r9 = 0
                return r9
            L43:
                nj.d r3 = r6.mo10907o()
                nj.d r3 = r3.mo10893a(r6)
                boolean r3 = r3.mo10901i()
                if (r3 != 0) goto L16
                return r6
        }
    }

    /* renamed from: nj.c$c */
    public static abstract class c extends p240nj.AbstractC4845c {
        public c(java.math.BigInteger r4) {
                r3 = this;
                sj.a r0 = sj.AbstractC6081b.f23444a
                int r0 = r4.bitLength()
                int r1 = r4.signum()
                if (r1 <= 0) goto L2b
                r1 = 2
                if (r0 < r1) goto L2b
                r2 = 3
                if (r0 >= r2) goto L21
                int r0 = r4.intValue()
                if (r0 == r1) goto L1e
                if (r0 == r2) goto L1b
                goto L21
            L1b:
                sj.a r4 = sj.AbstractC6081b.f23445b
                goto L27
            L1e:
                sj.a r4 = sj.AbstractC6081b.f23444a
                goto L27
            L21:
                sj.f r0 = new sj.f
                r0.<init>(r4)
                r4 = r0
            L27:
                r3.<init>(r4)
                return
            L2b:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "'characteristic' must be >= 2"
                r4.<init>(r0)
                throw r4
        }

        @Override // p240nj.AbstractC4845c
        /* renamed from: j */
        public p240nj.AbstractC4848f mo10877j(int r4, java.math.BigInteger r5) {
                r3 = this;
                nj.d r5 = r3.mo10879l(r5)
                nj.d r0 = r5.mo10907o()
                nj.d r1 = r3.f19249b
                nj.d r0 = r0.mo10893a(r1)
                nj.d r0 = r0.mo10902j(r5)
                nj.d r1 = r3.f19250c
                nj.d r0 = r0.mo10893a(r1)
                nj.d r0 = r0.mo10906n()
                if (r0 == 0) goto L33
                boolean r1 = r0.mo10911s()
                r2 = 1
                if (r4 != r2) goto L27
                r4 = 1
                goto L28
            L27:
                r4 = 0
            L28:
                if (r1 == r4) goto L2e
                nj.d r0 = r0.mo10905m()
            L2e:
                nj.f r4 = r3.mo10874g(r5, r0, r2)
                return r4
            L33:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Invalid point compression"
                r4.<init>(r5)
                throw r4
        }
    }

    /* renamed from: nj.c$d */
    public class d {

        /* renamed from: a */
        public int f19261a;

        /* renamed from: b */
        public p318rj.InterfaceC5932a f19262b;

        /* renamed from: c */
        public p124h7.AbstractC2947xb f19263c;

        /* renamed from: d */
        public final /* synthetic */ p240nj.AbstractC4845c f19264d;

        public d(p240nj.AbstractC4845c r1, int r2, p318rj.InterfaceC5932a r3, p124h7.AbstractC2947xb r4) {
                r0 = this;
                r0.f19264d = r1
                r0.<init>()
                r0.f19261a = r2
                r0.f19262b = r3
                r0.f19263c = r4
                return
        }

        /* renamed from: a */
        public p240nj.AbstractC4845c m10892a() {
                r2 = this;
                nj.c r0 = r2.f19264d
                int r1 = r2.f19261a
                boolean r0 = r0.mo10886s(r1)
                if (r0 == 0) goto L2e
                nj.c r0 = r2.f19264d
                nj.c r0 = r0.mo10868a()
                nj.c r1 = r2.f19264d
                if (r0 == r1) goto L26
                monitor-enter(r0)
                int r1 = r2.f19261a     // Catch: java.lang.Throwable -> L23
                r0.f19253f = r1     // Catch: java.lang.Throwable -> L23
                rj.a r1 = r2.f19262b     // Catch: java.lang.Throwable -> L23
                r0.f19254g = r1     // Catch: java.lang.Throwable -> L23
                h7.xb r1 = r2.f19263c     // Catch: java.lang.Throwable -> L23
                r0.f19255h = r1     // Catch: java.lang.Throwable -> L23
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
                return r0
            L23:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
                throw r1
            L26:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "implementation returned current curve"
                r0.<init>(r1)
                throw r0
            L2e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "unsupported coordinate system"
                r0.<init>(r1)
                throw r0
        }
    }

    /* renamed from: nj.c$e */
    public static class e extends p240nj.AbstractC4845c.b {

        /* renamed from: j */
        public int f19265j;

        /* renamed from: k */
        public int f19266k;

        /* renamed from: l */
        public int f19267l;

        /* renamed from: m */
        public int f19268m;

        /* renamed from: n */
        public p240nj.AbstractC4848f.d f19269n;

        /* renamed from: nj.c$e$a */
        public class a implements p240nj.InterfaceC4847e {

            /* renamed from: a */
            public final /* synthetic */ int f19270a;

            /* renamed from: b */
            public final /* synthetic */ int f19271b;

            /* renamed from: c */
            public final /* synthetic */ long[] f19272c;

            /* renamed from: d */
            public final /* synthetic */ int[] f19273d;

            /* renamed from: e */
            public final /* synthetic */ p240nj.AbstractC4845c.e f19274e;

            public a(p240nj.AbstractC4845c.e r1, int r2, int r3, long[] r4, int[] r5) {
                    r0 = this;
                    r0.f19274e = r1
                    r0.f19270a = r2
                    r0.f19271b = r3
                    r0.f19272c = r4
                    r0.f19273d = r5
                    r0.<init>()
                    return
            }

            @Override // p240nj.InterfaceC4847e
            /* renamed from: a */
            public int mo10888a() {
                    r1 = this;
                    int r0 = r1.f19270a
                    return r0
            }

            @Override // p240nj.InterfaceC4847e
            /* renamed from: b */
            public p240nj.AbstractC4848f mo10889b(int r15) {
                    r14 = this;
                    int r0 = r14.f19271b
                    long[] r1 = new long[r0]
                    long[] r0 = new long[r0]
                    r2 = 0
                    r3 = 0
                    r4 = 0
                L9:
                    int r5 = r14.f19270a
                    if (r3 >= r5) goto L3a
                    r5 = r3 ^ r15
                    int r5 = r5 + (-1)
                    int r5 = r5 >> 31
                    long r5 = (long) r5
                    r7 = 0
                L15:
                    int r8 = r14.f19271b
                    if (r7 >= r8) goto L34
                    r9 = r1[r7]
                    long[] r11 = r14.f19272c
                    int r12 = r4 + r7
                    r12 = r11[r12]
                    long r12 = r12 & r5
                    long r9 = r9 ^ r12
                    r1[r7] = r9
                    r9 = r0[r7]
                    int r8 = r8 + r4
                    int r8 = r8 + r7
                    r12 = r11[r8]
                    long r11 = r12 & r5
                    long r8 = r9 ^ r11
                    r0[r7] = r8
                    int r7 = r7 + 1
                    goto L15
                L34:
                    int r8 = r8 * 2
                    int r4 = r4 + r8
                    int r3 = r3 + 1
                    goto L9
                L3a:
                    nj.c$e r15 = r14.f19274e
                    nj.d$c r3 = new nj.d$c
                    int r4 = r15.f19265j
                    int[] r5 = r14.f19273d
                    nj.l r6 = new nj.l
                    r6.<init>(r1)
                    r3.<init>(r4, r5, r6)
                    nj.d$c r1 = new nj.d$c
                    nj.c$e r4 = r14.f19274e
                    int r4 = r4.f19265j
                    int[] r5 = r14.f19273d
                    nj.l r6 = new nj.l
                    r6.<init>(r0)
                    r1.<init>(r4, r5, r6)
                    nj.f$d r0 = new nj.f$d
                    r0.<init>(r15, r3, r1, r2)
                    return r0
            }
        }

        public e(int r1, int r2, int r3, int r4, java.math.BigInteger r5, java.math.BigInteger r6, java.math.BigInteger r7, java.math.BigInteger r8) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                r0.f19265j = r1
                r0.f19266k = r2
                r0.f19267l = r3
                r0.f19268m = r4
                r0.f19251d = r7
                r0.f19252e = r8
                nj.f$d r1 = new nj.f$d
                r2 = 0
                r3 = 0
                r1.<init>(r0, r2, r2, r3)
                r0.f19269n = r1
                nj.d r1 = r0.mo10879l(r5)
                r0.f19249b = r1
                nj.d r1 = r0.mo10879l(r6)
                r0.f19250c = r1
                r1 = 6
                r0.f19253f = r1
                return
        }

        public e(int r1, int r2, int r3, int r4, p240nj.AbstractC4846d r5, p240nj.AbstractC4846d r6, java.math.BigInteger r7, java.math.BigInteger r8) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                r0.f19265j = r1
                r0.f19266k = r2
                r0.f19267l = r3
                r0.f19268m = r4
                r0.f19251d = r7
                r0.f19252e = r8
                nj.f$d r1 = new nj.f$d
                r2 = 0
                r3 = 0
                r1.<init>(r0, r2, r2, r3)
                r0.f19269n = r1
                r0.f19249b = r5
                r0.f19250c = r6
                r1 = 6
                r0.f19253f = r1
                return
        }

        public e(int r10, int r11, java.math.BigInteger r12, java.math.BigInteger r13, java.math.BigInteger r14, java.math.BigInteger r15) {
                r9 = this;
                r3 = 0
                r4 = 0
                r0 = r9
                r1 = r10
                r2 = r11
                r5 = r12
                r6 = r13
                r7 = r14
                r8 = r15
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return
        }

        @Override // p240nj.AbstractC4845c
        /* renamed from: a */
        public p240nj.AbstractC4845c mo10868a() {
                r10 = this;
                nj.c$e r9 = new nj.c$e
                int r1 = r10.f19265j
                int r2 = r10.f19266k
                int r3 = r10.f19267l
                int r4 = r10.f19268m
                nj.d r5 = r10.f19249b
                nj.d r6 = r10.f19250c
                java.math.BigInteger r7 = r10.f19251d
                java.math.BigInteger r8 = r10.f19252e
                r0 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        @Override // p240nj.AbstractC4845c
        /* renamed from: c */
        public p240nj.InterfaceC4847e mo10870c(p240nj.AbstractC4848f[] r10, int r11, int r12) {
                r9 = this;
                int r0 = r9.f19265j
                int r0 = r0 + 63
                int r4 = r0 >>> 6
                int r0 = r9.f19267l
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L12
                int r3 = r9.f19268m
                if (r3 != 0) goto L12
                r3 = 1
                goto L13
            L12:
                r3 = 0
            L13:
                r5 = 2
                if (r3 == 0) goto L1e
                int[] r0 = new int[r1]
                int r1 = r9.f19266k
                r0[r2] = r1
                r6 = r0
                goto L2c
            L1e:
                r3 = 3
                int[] r3 = new int[r3]
                int r6 = r9.f19266k
                r3[r2] = r6
                r3[r1] = r0
                int r0 = r9.f19268m
                r3[r5] = r0
                r6 = r3
            L2c:
                int r0 = r12 * r4
                int r0 = r0 * 2
                long[] r5 = new long[r0]
                r0 = 0
                r1 = 0
            L34:
                if (r0 >= r12) goto L57
                int r3 = r11 + r0
                r3 = r10[r3]
                nj.d r7 = r3.f19287b
                nj.d$c r7 = (p240nj.AbstractC4846d.c) r7
                nj.l r7 = r7.f19281b0
                long[] r7 = r7.f19304Y
                int r8 = r7.length
                java.lang.System.arraycopy(r7, r2, r5, r1, r8)
                int r1 = r1 + r4
                nj.d r3 = r3.f19288c
                nj.d$c r3 = (p240nj.AbstractC4846d.c) r3
                nj.l r3 = r3.f19281b0
                long[] r3 = r3.f19304Y
                int r7 = r3.length
                java.lang.System.arraycopy(r3, r2, r5, r1, r7)
                int r1 = r1 + r4
                int r0 = r0 + 1
                goto L34
            L57:
                nj.c$e$a r10 = new nj.c$e$a
                r1 = r10
                r2 = r9
                r3 = r12
                r1.<init>(r2, r3, r4, r5, r6)
                return r10
        }

        @Override // p240nj.AbstractC4845c
        /* renamed from: d */
        public p124h7.AbstractC2947xb mo10871d() {
                r2 = this;
                boolean r0 = r2.mo10890u()
                if (r0 == 0) goto Lc
                nj.v r0 = new nj.v
                r0.<init>()
                return r0
            Lc:
                rj.a r0 = r2.f19254g
                boolean r1 = r0 instanceof p318rj.InterfaceC5932a
                if (r1 == 0) goto L18
                nj.k r1 = new nj.k
                r1.<init>(r2, r0)
                goto L1d
            L18:
                nj.r r1 = new nj.r
                r1.<init>()
            L1d:
                return r1
        }

        @Override // p240nj.AbstractC4845c
        /* renamed from: g */
        public p240nj.AbstractC4848f mo10874g(p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3, boolean r4) {
                r1 = this;
                nj.f$d r0 = new nj.f$d
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        @Override // p240nj.AbstractC4845c
        /* renamed from: h */
        public p240nj.AbstractC4848f mo10875h(p240nj.AbstractC4846d r8, p240nj.AbstractC4846d r9, p240nj.AbstractC4846d[] r10, boolean r11) {
                r7 = this;
                nj.f$d r6 = new nj.f$d
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }

        @Override // p240nj.AbstractC4845c
        /* renamed from: l */
        public p240nj.AbstractC4846d mo10879l(java.math.BigInteger r8) {
                r7 = this;
                nj.d$c r6 = new nj.d$c
                int r1 = r7.f19265j
                int r2 = r7.f19266k
                int r3 = r7.f19267l
                int r4 = r7.f19268m
                r0 = r6
                r5 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }

        @Override // p240nj.AbstractC4845c
        /* renamed from: m */
        public int mo10880m() {
                r1 = this;
                int r0 = r1.f19265j
                return r0
        }

        @Override // p240nj.AbstractC4845c
        /* renamed from: n */
        public p240nj.AbstractC4848f mo10881n() {
                r1 = this;
                nj.f$d r0 = r1.f19269n
                return r0
        }

        @Override // p240nj.AbstractC4845c
        /* renamed from: s */
        public boolean mo10886s(int r3) {
                r2 = this;
                r0 = 1
                if (r3 == 0) goto La
                if (r3 == r0) goto La
                r1 = 6
                if (r3 == r1) goto La
                r3 = 0
                return r3
            La:
                return r0
        }
    }

    /* renamed from: nj.c$f */
    public static class f extends p240nj.AbstractC4845c.c {

        /* renamed from: i */
        public java.math.BigInteger f19275i;

        /* renamed from: j */
        public java.math.BigInteger f19276j;

        /* renamed from: k */
        public p240nj.AbstractC4848f.e f19277k;

        public f(java.math.BigInteger r8, java.math.BigInteger r9, java.math.BigInteger r10, java.math.BigInteger r11, java.math.BigInteger r12) {
                r7 = this;
                r7.<init>(r8)
                r7.f19275i = r8
                int r0 = r8.bitLength()
                r1 = 96
                r2 = 0
                if (r0 < r1) goto L29
                int r1 = r0 + (-64)
                java.math.BigInteger r1 = r8.shiftRight(r1)
                long r3 = r1.longValue()
                r5 = -1
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 != 0) goto L29
                java.math.BigInteger r1 = p240nj.InterfaceC4844b.f19244S
                java.math.BigInteger r0 = r1.shiftLeft(r0)
                java.math.BigInteger r8 = r0.subtract(r8)
                goto L2a
            L29:
                r8 = r2
            L2a:
                r7.f19276j = r8
                nj.f$e r8 = new nj.f$e
                r0 = 0
                r8.<init>(r7, r2, r2, r0)
                r7.f19277k = r8
                nj.d$d r8 = new nj.d$d
                java.math.BigInteger r0 = r7.f19275i
                java.math.BigInteger r1 = r7.f19276j
                r8.<init>(r0, r1, r9)
                r7.f19249b = r8
                nj.d$d r8 = new nj.d$d
                java.math.BigInteger r9 = r7.f19275i
                java.math.BigInteger r0 = r7.f19276j
                r8.<init>(r9, r0, r10)
                r7.f19250c = r8
                r7.f19251d = r11
                r7.f19252e = r12
                r8 = 4
                r7.f19253f = r8
                return
        }

        public f(java.math.BigInteger r2, java.math.BigInteger r3, p240nj.AbstractC4846d r4, p240nj.AbstractC4846d r5, java.math.BigInteger r6, java.math.BigInteger r7) {
                r1 = this;
                r1.<init>(r2)
                r1.f19275i = r2
                r1.f19276j = r3
                nj.f$e r2 = new nj.f$e
                r3 = 0
                r0 = 0
                r2.<init>(r1, r3, r3, r0)
                r1.f19277k = r2
                r1.f19249b = r4
                r1.f19250c = r5
                r1.f19251d = r6
                r1.f19252e = r7
                r2 = 4
                r1.f19253f = r2
                return
        }

        @Override // p240nj.AbstractC4845c
        /* renamed from: a */
        public p240nj.AbstractC4845c mo10868a() {
                r8 = this;
                nj.c$f r7 = new nj.c$f
                java.math.BigInteger r1 = r8.f19275i
                java.math.BigInteger r2 = r8.f19276j
                nj.d r3 = r8.f19249b
                nj.d r4 = r8.f19250c
                java.math.BigInteger r5 = r8.f19251d
                java.math.BigInteger r6 = r8.f19252e
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }

        @Override // p240nj.AbstractC4845c
        /* renamed from: g */
        public p240nj.AbstractC4848f mo10874g(p240nj.AbstractC4846d r2, p240nj.AbstractC4846d r3, boolean r4) {
                r1 = this;
                nj.f$e r0 = new nj.f$e
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        @Override // p240nj.AbstractC4845c
        /* renamed from: h */
        public p240nj.AbstractC4848f mo10875h(p240nj.AbstractC4846d r8, p240nj.AbstractC4846d r9, p240nj.AbstractC4846d[] r10, boolean r11) {
                r7 = this;
                nj.f$e r6 = new nj.f$e
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }

        @Override // p240nj.AbstractC4845c
        /* renamed from: l */
        public p240nj.AbstractC4846d mo10879l(java.math.BigInteger r4) {
                r3 = this;
                nj.d$d r0 = new nj.d$d
                java.math.BigInteger r1 = r3.f19275i
                java.math.BigInteger r2 = r3.f19276j
                r0.<init>(r1, r2, r4)
                return r0
        }

        @Override // p240nj.AbstractC4845c
        /* renamed from: m */
        public int mo10880m() {
                r1 = this;
                java.math.BigInteger r0 = r1.f19275i
                int r0 = r0.bitLength()
                return r0
        }

        @Override // p240nj.AbstractC4845c
        /* renamed from: n */
        public p240nj.AbstractC4848f mo10881n() {
                r1 = this;
                nj.f$e r0 = r1.f19277k
                return r0
        }

        @Override // p240nj.AbstractC4845c
        /* renamed from: o */
        public p240nj.AbstractC4848f mo10882o(p240nj.AbstractC4848f r9) {
                r8 = this;
                nj.c r0 = r9.f19286a
                if (r8 == r0) goto L4c
                int r0 = r8.f19253f
                r1 = 2
                if (r0 != r1) goto L4c
                boolean r0 = r9.m10930k()
                if (r0 != 0) goto L4c
                nj.c r0 = r9.f19286a
                int r0 = r0.f19253f
                if (r0 == r1) goto L1c
                r1 = 3
                if (r0 == r1) goto L1c
                r1 = 4
                if (r0 == r1) goto L1c
                goto L4c
            L1c:
                nj.f$e r0 = new nj.f$e
                nj.d r1 = r9.f19287b
                java.math.BigInteger r1 = r1.mo10912t()
                nj.d r4 = r8.mo10879l(r1)
                nj.d r1 = r9.f19288c
                java.math.BigInteger r1 = r1.mo10912t()
                nj.d r5 = r8.mo10879l(r1)
                r1 = 1
                nj.d[] r6 = new p240nj.AbstractC4846d[r1]
                nj.d[] r1 = r9.f19289d
                r2 = 0
                r1 = r1[r2]
                java.math.BigInteger r1 = r1.mo10912t()
                nj.d r1 = r8.mo10879l(r1)
                r6[r2] = r1
                boolean r7 = r9.f19290e
                r2 = r0
                r3 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                return r0
            L4c:
                nj.f r9 = super.mo10882o(r9)
                return r9
        }

        @Override // p240nj.AbstractC4845c
        /* renamed from: s */
        public boolean mo10886s(int r3) {
                r2 = this;
                r0 = 1
                if (r3 == 0) goto Ld
                if (r3 == r0) goto Ld
                r1 = 2
                if (r3 == r1) goto Ld
                r1 = 4
                if (r3 == r1) goto Ld
                r3 = 0
                return r3
            Ld:
                return r0
        }
    }

    public AbstractC4845c(sj.InterfaceC6080a r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f19253f = r0
            r0 = 0
            r1.f19254g = r0
            r1.f19255h = r0
            r1.f19248a = r2
            return
    }

    /* renamed from: a */
    public abstract p240nj.AbstractC4845c mo10868a();

    /* renamed from: b */
    public synchronized p240nj.AbstractC4845c.d m10869b() {
            r4 = this;
            monitor-enter(r4)
            nj.c$d r0 = new nj.c$d     // Catch: java.lang.Throwable -> Le
            int r1 = r4.f19253f     // Catch: java.lang.Throwable -> Le
            rj.a r2 = r4.f19254g     // Catch: java.lang.Throwable -> Le
            h7.xb r3 = r4.f19255h     // Catch: java.lang.Throwable -> Le
            r0.<init>(r4, r1, r2, r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r4)
            return r0
        Le:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    /* renamed from: c */
    public p240nj.InterfaceC4847e mo10870c(p240nj.AbstractC4848f[] r13, int r14, int r15) {
            r12 = this;
            int r0 = r12.mo10880m()
            int r0 = r0 + 7
            int r0 = r0 >>> 3
            int r1 = r15 * r0
            int r1 = r1 * 2
            byte[] r1 = new byte[r1]
            r2 = 0
            r3 = 0
            r4 = 0
        L11:
            if (r3 >= r15) goto L4a
            int r5 = r14 + r3
            r5 = r13[r5]
            nj.d r6 = r5.f19287b
            java.math.BigInteger r6 = r6.mo10912t()
            byte[] r6 = r6.toByteArray()
            nj.d r5 = r5.f19288c
            java.math.BigInteger r5 = r5.mo10912t()
            byte[] r5 = r5.toByteArray()
            int r7 = r6.length
            r8 = 1
            if (r7 <= r0) goto L31
            r7 = 1
            goto L32
        L31:
            r7 = 0
        L32:
            int r9 = r6.length
            int r9 = r9 - r7
            int r10 = r5.length
            if (r10 <= r0) goto L38
            goto L39
        L38:
            r8 = 0
        L39:
            int r10 = r5.length
            int r10 = r10 - r8
            int r4 = r4 + r0
            int r11 = r4 - r9
            java.lang.System.arraycopy(r6, r7, r1, r11, r9)
            int r4 = r4 + r0
            int r6 = r4 - r10
            java.lang.System.arraycopy(r5, r8, r1, r6, r10)
            int r3 = r3 + 1
            goto L11
        L4a:
            nj.c$a r13 = new nj.c$a
            r13.<init>(r12, r15, r0, r1)
            return r13
    }

    /* renamed from: d */
    public p124h7.AbstractC2947xb mo10871d() {
            r2 = this;
            rj.a r0 = r2.f19254g
            boolean r1 = r0 instanceof p318rj.InterfaceC5932a
            if (r1 == 0) goto Lc
            nj.k r1 = new nj.k
            r1.<init>(r2, r0)
            return r1
        Lc:
            nj.r r0 = new nj.r
            r0.<init>()
            return r0
    }

    /* renamed from: e */
    public p240nj.AbstractC4848f m10872e(java.math.BigInteger r2, java.math.BigInteger r3) {
            r1 = this;
            r0 = 0
            nj.f r2 = r1.mo10873f(r2, r3, r0)
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 == r2) goto L11
            boolean r0 = r2 instanceof p240nj.AbstractC4845c
            if (r0 == 0) goto Lf
            nj.c r2 = (p240nj.AbstractC4845c) r2
            boolean r2 = r1.m10878k(r2)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            return r2
    }

    /* renamed from: f */
    public p240nj.AbstractC4848f mo10873f(java.math.BigInteger r1, java.math.BigInteger r2, boolean r3) {
            r0 = this;
            nj.d r1 = r0.mo10879l(r1)
            nj.d r2 = r0.mo10879l(r2)
            nj.f r1 = r0.mo10874g(r1, r2, r3)
            return r1
    }

    /* renamed from: g */
    public abstract p240nj.AbstractC4848f mo10874g(p240nj.AbstractC4846d r1, p240nj.AbstractC4846d r2, boolean r3);

    /* renamed from: h */
    public abstract p240nj.AbstractC4848f mo10875h(p240nj.AbstractC4846d r1, p240nj.AbstractC4846d r2, p240nj.AbstractC4846d[] r3, boolean r4);

    public int hashCode() {
            r3 = this;
            sj.a r0 = r3.f19248a
            int r0 = r0.hashCode()
            nj.d r1 = r3.f19249b
            java.math.BigInteger r1 = r1.mo10912t()
            int r1 = r1.hashCode()
            r2 = 8
            int r1 = java.lang.Integer.rotateLeft(r1, r2)
            r0 = r0 ^ r1
            nj.d r1 = r3.f19250c
            java.math.BigInteger r1 = r1.mo10912t()
            int r1 = r1.hashCode()
            r2 = 16
            int r1 = java.lang.Integer.rotateLeft(r1, r2)
            r0 = r0 ^ r1
            return r0
    }

    /* renamed from: i */
    public p240nj.AbstractC4848f m10876i(byte[] r8) {
            r7 = this;
            int r0 = r7.mo10880m()
            r1 = 7
            int r0 = r0 + r1
            int r0 = r0 / 8
            r2 = 0
            r3 = r8[r2]
            r4 = 1
            if (r3 == 0) goto La7
            r5 = 2
            if (r3 == r5) goto L81
            r5 = 3
            if (r3 == r5) goto L81
            r5 = 4
            if (r3 == r5) goto L64
            r5 = 6
            if (r3 == r5) goto L36
            if (r3 != r1) goto L1d
            goto L36
        L1d:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid point encoding 0x"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            r1 = 16
            java.lang.String r1 = java.lang.Integer.toString(r3, r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L36:
            int r5 = r8.length
            int r6 = r0 * 2
            int r6 = r6 + r4
            if (r5 != r6) goto L5c
            java.math.BigInteger r4 = p400wj.C6889b.m13956a(r8, r4, r0)
            int r5 = r0 + 1
            java.math.BigInteger r8 = p400wj.C6889b.m13956a(r8, r5, r0)
            boolean r0 = r8.testBit(r2)
            if (r3 != r1) goto L4d
            r2 = 1
        L4d:
            if (r0 != r2) goto L54
            nj.f r8 = r7.m10887t(r4, r8)
            goto Lae
        L54:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Inconsistent Y coordinate in hybrid encoding"
            r8.<init>(r0)
            throw r8
        L5c:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Incorrect length for hybrid encoding"
            r8.<init>(r0)
            throw r8
        L64:
            int r1 = r8.length
            int r2 = r0 * 2
            int r2 = r2 + r4
            if (r1 != r2) goto L79
            java.math.BigInteger r1 = p400wj.C6889b.m13956a(r8, r4, r0)
            int r2 = r0 + 1
            java.math.BigInteger r8 = p400wj.C6889b.m13956a(r8, r2, r0)
            nj.f r8 = r7.m10887t(r1, r8)
            goto Lae
        L79:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Incorrect length for uncompressed encoding"
            r8.<init>(r0)
            throw r8
        L81:
            int r1 = r8.length
            int r2 = r0 + 1
            if (r1 != r2) goto L9f
            r1 = r3 & 1
            java.math.BigInteger r8 = p400wj.C6889b.m13956a(r8, r4, r0)
            nj.f r8 = r7.mo10877j(r1, r8)
            boolean r0 = r8.m10929j(r4, r4)
            if (r0 == 0) goto L97
            goto Lae
        L97:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid point"
            r8.<init>(r0)
            throw r8
        L9f:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Incorrect length for compressed encoding"
            r8.<init>(r0)
            throw r8
        La7:
            int r8 = r8.length
            if (r8 != r4) goto Lc0
            nj.f r8 = r7.mo10881n()
        Lae:
            if (r3 == 0) goto Lbf
            boolean r0 = r8.m10930k()
            if (r0 != 0) goto Lb7
            goto Lbf
        Lb7:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid infinity encoding"
            r8.<init>(r0)
            throw r8
        Lbf:
            return r8
        Lc0:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Incorrect length for infinity encoding"
            r8.<init>(r0)
            throw r8
    }

    /* renamed from: j */
    public abstract p240nj.AbstractC4848f mo10877j(int r1, java.math.BigInteger r2);

    /* renamed from: k */
    public boolean m10878k(p240nj.AbstractC4845c r3) {
            r2 = this;
            if (r2 == r3) goto L35
            if (r3 == 0) goto L33
            sj.a r0 = r2.f19248a
            sj.a r1 = r3.f19248a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L33
            nj.d r0 = r2.f19249b
            java.math.BigInteger r0 = r0.mo10912t()
            nj.d r1 = r3.f19249b
            java.math.BigInteger r1 = r1.mo10912t()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L33
            nj.d r0 = r2.f19250c
            java.math.BigInteger r0 = r0.mo10912t()
            nj.d r3 = r3.f19250c
            java.math.BigInteger r3 = r3.mo10912t()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L33
            goto L35
        L33:
            r3 = 0
            goto L36
        L35:
            r3 = 1
        L36:
            return r3
    }

    /* renamed from: l */
    public abstract p240nj.AbstractC4846d mo10879l(java.math.BigInteger r1);

    /* renamed from: m */
    public abstract int mo10880m();

    /* renamed from: n */
    public abstract p240nj.AbstractC4848f mo10881n();

    /* renamed from: o */
    public p240nj.AbstractC4848f mo10882o(p240nj.AbstractC4848f r3) {
            r2 = this;
            nj.c r0 = r3.f19286a
            if (r2 != r0) goto L5
            return r3
        L5:
            boolean r0 = r3.m10930k()
            if (r0 == 0) goto L10
            nj.f r3 = r2.mo10881n()
            return r3
        L10:
            nj.f r3 = r3.m10934o()
            nj.d r0 = r3.f19287b
            java.math.BigInteger r0 = r0.mo10912t()
            nj.d r1 = r3.mo10927h()
            java.math.BigInteger r1 = r1.mo10912t()
            boolean r3 = r3.f19290e
            nj.f r3 = r2.mo10873f(r0, r1, r3)
            return r3
    }

    /* renamed from: p */
    public void m10883p(p240nj.AbstractC4848f[] r4) {
            r3 = this;
            int r0 = r4.length
            r1 = 0
            r2 = 0
            r3.m10884q(r4, r1, r0, r2)
            return
    }

    /* renamed from: q */
    public void m10884q(p240nj.AbstractC4848f[] r9, int r10, int r11, p240nj.AbstractC4846d r12) {
            r8 = this;
            if (r10 < 0) goto Lb1
            if (r11 < 0) goto Lb1
            int r0 = r9.length
            int r0 = r0 - r11
            if (r10 > r0) goto Lb1
            r0 = 0
            r1 = 0
        La:
            if (r1 >= r11) goto L22
            int r2 = r10 + r1
            r2 = r9[r2]
            if (r2 == 0) goto L1f
            nj.c r2 = r2.f19286a
            if (r8 != r2) goto L17
            goto L1f
        L17:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "'points' entries must be null or on this curve"
            r9.<init>(r10)
            throw r9
        L1f:
            int r1 = r1 + 1
            goto La
        L22:
            int r1 = r8.f19253f
            if (r1 == 0) goto La6
            r2 = 5
            if (r1 == r2) goto La6
            nj.d[] r1 = new p240nj.AbstractC4846d[r11]
            int[] r2 = new int[r11]
            r3 = 0
            r4 = 0
        L2f:
            if (r3 >= r11) goto L4d
            int r5 = r10 + r3
            r6 = r9[r5]
            if (r6 == 0) goto L4a
            if (r12 != 0) goto L3f
            boolean r7 = r6.m10931l()
            if (r7 != 0) goto L4a
        L3f:
            nj.d r6 = r6.mo10928i(r0)
            r1[r4] = r6
            int r6 = r4 + 1
            r2[r4] = r5
            r4 = r6
        L4a:
            int r3 = r3 + 1
            goto L2f
        L4d:
            if (r4 != 0) goto L50
            return
        L50:
            nj.d[] r10 = new p240nj.AbstractC4846d[r4]
            r11 = r1[r0]
            r10[r0] = r11
            r11 = 0
        L57:
            int r11 = r11 + 1
            if (r11 >= r4) goto L6a
            int r3 = r11 + (-1)
            r3 = r10[r3]
            int r5 = r0 + r11
            r5 = r1[r5]
            nj.d r3 = r3.mo10902j(r5)
            r10[r11] = r3
            goto L57
        L6a:
            int r11 = r11 + (-1)
            if (r12 == 0) goto L76
            r3 = r10[r11]
            nj.d r12 = r3.mo10902j(r12)
            r10[r11] = r12
        L76:
            r12 = r10[r11]
            nj.d r12 = r12.mo10899g()
        L7c:
            if (r11 <= 0) goto L92
            int r3 = r11 + (-1)
            int r11 = r11 + 0
            r5 = r1[r11]
            r6 = r10[r3]
            nj.d r6 = r6.mo10902j(r12)
            r1[r11] = r6
            nj.d r12 = r12.mo10902j(r5)
            r11 = r3
            goto L7c
        L92:
            r1[r0] = r12
        L94:
            if (r0 >= r4) goto La5
            r10 = r2[r0]
            r11 = r9[r10]
            r12 = r1[r0]
            nj.f r11 = r11.m10935p(r12)
            r9[r10] = r11
            int r0 = r0 + 1
            goto L94
        La5:
            return
        La6:
            if (r12 != 0) goto La9
            return
        La9:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "'iso' not valid for affine coordinates"
            r9.<init>(r10)
            throw r9
        Lb1:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "invalid range specified for 'points'"
            r9.<init>(r10)
            throw r9
    }

    /* renamed from: r */
    public p240nj.InterfaceC4856n m10885r(p240nj.AbstractC4848f r3, java.lang.String r4, p240nj.InterfaceC4855m r5) {
            r2 = this;
            if (r3 == 0) goto L2c
            nj.c r0 = r3.f19286a
            if (r2 != r0) goto L2c
            monitor-enter(r3)
            java.util.Hashtable r0 = r3.f19291f     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L13
            java.util.Hashtable r0 = new java.util.Hashtable     // Catch: java.lang.Throwable -> L29
            r1 = 4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L29
            r3.f19291f = r0     // Catch: java.lang.Throwable -> L29
        L13:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            monitor-enter(r0)
            java.lang.Object r3 = r0.get(r4)     // Catch: java.lang.Throwable -> L26
            nj.n r3 = (p240nj.InterfaceC4856n) r3     // Catch: java.lang.Throwable -> L26
            nj.n r5 = r5.mo10945a(r3)     // Catch: java.lang.Throwable -> L26
            if (r5 == r3) goto L24
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L26
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            return r5
        L26:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r3
        L29:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            throw r4
        L2c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "'point' must be non-null and on this curve"
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: s */
    public boolean mo10886s(int r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 1
            goto L5
        L4:
            r1 = 0
        L5:
            return r1
    }

    /* renamed from: t */
    public p240nj.AbstractC4848f m10887t(java.math.BigInteger r2, java.math.BigInteger r3) {
            r1 = this;
            r0 = 0
            nj.f r2 = r1.mo10873f(r2, r3, r0)
            r3 = 1
            boolean r3 = r2.m10929j(r0, r3)
            if (r3 == 0) goto Ld
            return r2
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Invalid point coordinates"
            r2.<init>(r3)
            throw r2
    }
}
