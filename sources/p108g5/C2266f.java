package p108g5;

/* renamed from: g5.f */
/* loaded from: classes.dex */
public final class C2266f extends p108g5.AbstractC2262d<p108g5.C2266f.e> {

    /* renamed from: t */
    public static final p088f4.C2018j0 f10333t = null;

    /* renamed from: j */
    public final java.util.List<p108g5.C2266f.e> f10334j;

    /* renamed from: k */
    public final java.util.Set<p108g5.C2266f.d> f10335k;

    /* renamed from: l */
    public android.os.Handler f10336l;

    /* renamed from: m */
    public final java.util.List<p108g5.C2266f.e> f10337m;

    /* renamed from: n */
    public final java.util.IdentityHashMap<p108g5.InterfaceC2280o, p108g5.C2266f.e> f10338n;

    /* renamed from: o */
    public final java.util.Map<java.lang.Object, p108g5.C2266f.e> f10339o;

    /* renamed from: p */
    public final java.util.Set<p108g5.C2266f.e> f10340p;

    /* renamed from: q */
    public boolean f10341q;

    /* renamed from: r */
    public java.util.Set<p108g5.C2266f.d> f10342r;

    /* renamed from: s */
    public p108g5.InterfaceC2265e0 f10343s;

    /* renamed from: g5.f$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: g5.f$b */
    public static final class b extends p088f4.AbstractC1990a {

        /* renamed from: c0 */
        public final int f10344c0;

        /* renamed from: d0 */
        public final int f10345d0;

        /* renamed from: e0 */
        public final int[] f10346e0;

        /* renamed from: f0 */
        public final int[] f10347f0;

        /* renamed from: g0 */
        public final p088f4.AbstractC2031n1[] f10348g0;

        /* renamed from: h0 */
        public final java.lang.Object[] f10349h0;

        /* renamed from: i0 */
        public final java.util.HashMap<java.lang.Object, java.lang.Integer> f10350i0;

        public b(java.util.Collection<p108g5.C2266f.e> r5, p108g5.InterfaceC2265e0 r6, boolean r7) {
                r4 = this;
                r4.<init>(r7, r6)
                int r6 = r5.size()
                int[] r7 = new int[r6]
                r4.f10346e0 = r7
                int[] r7 = new int[r6]
                r4.f10347f0 = r7
                f4.n1[] r7 = new p088f4.AbstractC2031n1[r6]
                r4.f10348g0 = r7
                java.lang.Object[] r6 = new java.lang.Object[r6]
                r4.f10349h0 = r6
                java.util.HashMap r6 = new java.util.HashMap
                r6.<init>()
                r4.f10350i0 = r6
                java.util.Iterator r5 = r5.iterator()
                r6 = 0
                r7 = 0
                r0 = 0
            L25:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L66
                java.lang.Object r1 = r5.next()
                g5.f$e r1 = (p108g5.C2266f.e) r1
                f4.n1[] r2 = r4.f10348g0
                g5.m r3 = r1.f10353a
                g5.m$a r3 = r3.f10399n
                r2[r0] = r3
                int[] r3 = r4.f10347f0
                r3[r0] = r6
                int[] r3 = r4.f10346e0
                r3[r0] = r7
                r2 = r2[r0]
                int r2 = r2.mo5180q()
                int r6 = r6 + r2
                f4.n1[] r2 = r4.f10348g0
                r2 = r2[r0]
                int r2 = r2.mo5179j()
                int r7 = r7 + r2
                java.lang.Object[] r2 = r4.f10349h0
                java.lang.Object r1 = r1.f10354b
                r2[r0] = r1
                java.util.HashMap<java.lang.Object, java.lang.Integer> r1 = r4.f10350i0
                r2 = r2[r0]
                int r3 = r0 + 1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1.put(r2, r0)
                r0 = r3
                goto L25
            L66:
                r4.f10344c0 = r6
                r4.f10345d0 = r7
                return
        }

        @Override // p088f4.AbstractC1990a
        /* renamed from: B */
        public p088f4.AbstractC2031n1 mo5084B(int r2) {
                r1 = this;
                f4.n1[] r0 = r1.f10348g0
                r2 = r0[r2]
                return r2
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: j */
        public int mo5179j() {
                r1 = this;
                int r0 = r1.f10345d0
                return r0
        }

        @Override // p088f4.AbstractC2031n1
        /* renamed from: q */
        public int mo5180q() {
                r1 = this;
                int r0 = r1.f10344c0
                return r0
        }

        @Override // p088f4.AbstractC1990a
        /* renamed from: t */
        public int mo5094t(java.lang.Object r2) {
                r1 = this;
                java.util.HashMap<java.lang.Object, java.lang.Integer> r0 = r1.f10350i0
                java.lang.Object r2 = r0.get(r2)
                java.lang.Integer r2 = (java.lang.Integer) r2
                if (r2 != 0) goto Lc
                r2 = -1
                goto L10
            Lc:
                int r2 = r2.intValue()
            L10:
                return r2
        }

        @Override // p088f4.AbstractC1990a
        /* renamed from: u */
        public int mo5095u(int r3) {
                r2 = this;
                int[] r0 = r2.f10346e0
                int r3 = r3 + 1
                r1 = 0
                int r3 = p371v5.C6552b0.m13311d(r0, r3, r1, r1)
                return r3
        }

        @Override // p088f4.AbstractC1990a
        /* renamed from: v */
        public int mo5096v(int r3) {
                r2 = this;
                int[] r0 = r2.f10347f0
                int r3 = r3 + 1
                r1 = 0
                int r3 = p371v5.C6552b0.m13311d(r0, r3, r1, r1)
                return r3
        }

        @Override // p088f4.AbstractC1990a
        /* renamed from: w */
        public java.lang.Object mo5097w(int r2) {
                r1 = this;
                java.lang.Object[] r0 = r1.f10349h0
                r2 = r0[r2]
                return r2
        }

        @Override // p088f4.AbstractC1990a
        /* renamed from: x */
        public int mo5098x(int r2) {
                r1 = this;
                int[] r0 = r1.f10346e0
                r2 = r0[r2]
                return r2
        }

        @Override // p088f4.AbstractC1990a
        /* renamed from: y */
        public int mo5099y(int r2) {
                r1 = this;
                int[] r0 = r1.f10347f0
                r2 = r0[r2]
                return r2
        }
    }

    /* renamed from: g5.f$c */
    public static final class c extends p108g5.AbstractC2256a {
        public c(p108g5.C2266f.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p108g5.InterfaceC2283r
        /* renamed from: a */
        public p088f4.C2018j0 mo6009a() {
                r1 = this;
                f4.j0 r0 = p108g5.C2266f.f10333t
                return r0
        }

        @Override // p108g5.InterfaceC2283r
        /* renamed from: c */
        public p108g5.InterfaceC2280o mo6010c(p108g5.InterfaceC2283r.a r1, p352u5.C6324m r2, long r3) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // p108g5.InterfaceC2283r
        /* renamed from: d */
        public void mo5989d() {
                r0 = this;
                return
        }

        @Override // p108g5.InterfaceC2283r
        /* renamed from: n */
        public void mo6011n(p108g5.InterfaceC2280o r1) {
                r0 = this;
                return
        }

        @Override // p108g5.AbstractC2256a
        /* renamed from: q */
        public void mo5941q(p352u5.InterfaceC6317g0 r1) {
                r0 = this;
                return
        }

        @Override // p108g5.AbstractC2256a
        /* renamed from: s */
        public void mo5943s() {
                r0 = this;
                return
        }
    }

    /* renamed from: g5.f$d */
    public static final class d {

        /* renamed from: a */
        public final android.os.Handler f10351a;

        /* renamed from: b */
        public final java.lang.Runnable f10352b;
    }

    /* renamed from: g5.f$e */
    public static final class e {

        /* renamed from: a */
        public final p108g5.C2278m f10353a;

        /* renamed from: b */
        public final java.lang.Object f10354b;

        /* renamed from: c */
        public final java.util.List<p108g5.InterfaceC2283r.a> f10355c;

        /* renamed from: d */
        public int f10356d;

        /* renamed from: e */
        public int f10357e;

        /* renamed from: f */
        public boolean f10358f;

        public e(p108g5.InterfaceC2283r r2, boolean r3) {
                r1 = this;
                r1.<init>()
                g5.m r0 = new g5.m
                r0.<init>(r2, r3)
                r1.f10353a = r0
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.f10355c = r2
                java.lang.Object r2 = new java.lang.Object
                r2.<init>()
                r1.f10354b = r2
                return
        }
    }

    /* renamed from: g5.f$f */
    public static final class f<T> {

        /* renamed from: a */
        public final int f10359a;

        /* renamed from: b */
        public final T f10360b;

        /* renamed from: c */
        public final p108g5.C2266f.d f10361c;

        public f(int r1, T r2, p108g5.C2266f.d r3) {
                r0 = this;
                r0.<init>()
                r0.f10359a = r1
                r0.f10360b = r2
                r0.f10361c = r3
                return
        }
    }

    static {
            f4.j0$d$a r0 = new f4.j0$d$a
            r0.<init>()
            f4.j0$f$a r1 = new f4.j0$f$a
            r2 = 0
            r1.<init>(r2)
            java.util.List r8 = java.util.Collections.emptyList()
            b9.n<java.lang.Object> r10 = p026b9.C0693c0.f3898c0
            f4.j0$g$a r13 = new f4.j0$g$a
            r13.<init>()
            android.net.Uri r4 = android.net.Uri.EMPTY
            android.net.Uri r3 = r1.f9007b
            if (r3 == 0) goto L23
            java.util.UUID r3 = r1.f9006a
            if (r3 == 0) goto L21
            goto L23
        L21:
            r3 = 0
            goto L24
        L23:
            r3 = 1
        L24:
            p371v5.C6549a.m13291e(r3)
            if (r4 == 0) goto L43
            f4.j0$i r14 = new f4.j0$i
            java.util.UUID r3 = r1.f9006a
            if (r3 == 0) goto L36
            f4.j0$f r3 = new f4.j0$f
            r3.<init>(r1, r2)
            r6 = r3
            goto L37
        L36:
            r6 = r2
        L37:
            r7 = 0
            r12 = 0
            r5 = 0
            r9 = 0
            r11 = 0
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r18 = r14
            goto L45
        L43:
            r18 = r2
        L45:
            f4.j0 r1 = new f4.j0
            f4.j0$e r17 = r0.m5265a()
            java.util.Objects.requireNonNull(r13)
            f4.j0$g r0 = new f4.j0$g
            r0.<init>(r13, r2)
            f4.k0 r20 = p088f4.C2021k0.f9094F0
            r21 = 0
            java.lang.String r16 = ""
            r15 = r1
            r19 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21)
            p108g5.C2266f.f10333t = r1
            return
    }

    public C2266f(p108g5.InterfaceC2283r... r5) {
            r4 = this;
            g5.e0$a r0 = new g5.e0$a
            r1 = 0
            r0.<init>(r1)
            r4.<init>()
            int r2 = r5.length
        La:
            if (r1 >= r2) goto L14
            r3 = r5[r1]
            java.util.Objects.requireNonNull(r3)
            int r1 = r1 + 1
            goto La
        L14:
            int[] r1 = r0.f10331b
            int r1 = r1.length
            if (r1 <= 0) goto L1d
            g5.e0 r0 = r0.mo6003h()
        L1d:
            r4.f10343s = r0
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            r4.f10338n = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.f10339o = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f10334j = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.f10337m = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r4.f10342r = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r4.f10335k = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r4.f10340p = r1
            java.util.List r5 = java.util.Arrays.asList(r5)
            monitor-enter(r4)
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L5f
            r1 = 0
            r4.m6013y(r0, r5, r1, r1)     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r4)
            return
        L5f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    /* renamed from: A */
    public final void m6004A() {
            r3 = this;
            java.util.Set<g5.f$e> r0 = r3.f10340p
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            g5.f$e r1 = (p108g5.C2266f.e) r1
            java.util.List<g5.r$a> r2 = r1.f10355c
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L6
            java.util.HashMap<T, g5.d$b<T>> r2 = r3.f10318g
            java.lang.Object r1 = r2.get(r1)
            g5.d$b r1 = (p108g5.AbstractC2262d.b) r1
            java.util.Objects.requireNonNull(r1)
            g5.r r2 = r1.f10325a
            g5.r$b r1 = r1.f10326b
            r2.mo5933h(r1)
            r0.remove()
            goto L6
        L30:
            return
    }

    /* renamed from: B */
    public final synchronized void m6005B(java.util.Set<p108g5.C2266f.d> r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.Iterator r0 = r4.iterator()     // Catch: java.lang.Throwable -> L20
        L5:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L20
            g5.f$d r1 = (p108g5.C2266f.d) r1     // Catch: java.lang.Throwable -> L20
            android.os.Handler r2 = r1.f10351a     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r1 = r1.f10352b     // Catch: java.lang.Throwable -> L20
            r2.post(r1)     // Catch: java.lang.Throwable -> L20
            goto L5
        L19:
            java.util.Set<g5.f$d> r0 = r3.f10335k     // Catch: java.lang.Throwable -> L20
            r0.removeAll(r4)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r3)
            return
        L20:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    /* renamed from: C */
    public final void m6006C(p108g5.C2266f.e r3) {
            r2 = this;
            boolean r0 = r3.f10358f
            if (r0 == 0) goto L31
            java.util.List<g5.r$a> r0 = r3.f10355c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L31
            java.util.Set<g5.f$e> r0 = r2.f10340p
            r0.remove(r3)
            java.util.HashMap<T, g5.d$b<T>> r0 = r2.f10318g
            java.lang.Object r3 = r0.remove(r3)
            g5.d$b r3 = (p108g5.AbstractC2262d.b) r3
            java.util.Objects.requireNonNull(r3)
            g5.r r0 = r3.f10325a
            g5.r$b r1 = r3.f10326b
            r0.mo5934i(r1)
            g5.r r0 = r3.f10325a
            g5.d<T>$a r1 = r3.f10327c
            r0.mo5937l(r1)
            g5.r r0 = r3.f10325a
            g5.d<T>$a r3 = r3.f10327c
            r0.mo5936k(r3)
        L31:
            return
    }

    /* renamed from: D */
    public final void m6007D(p108g5.C2266f.d r3) {
            r2 = this;
            boolean r0 = r2.f10341q
            if (r0 != 0) goto L14
            android.os.Handler r0 = r2.f10336l
            java.util.Objects.requireNonNull(r0)
            r1 = 4
            android.os.Message r0 = r0.obtainMessage(r1)
            r0.sendToTarget()
            r0 = 1
            r2.f10341q = r0
        L14:
            if (r3 == 0) goto L1b
            java.util.Set<g5.f$d> r0 = r2.f10342r
            r0.add(r3)
        L1b:
            return
    }

    /* renamed from: E */
    public final void m6008E() {
            r5 = this;
            r0 = 0
            r5.f10341q = r0
            java.util.Set<g5.f$d> r1 = r5.f10342r
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r5.f10342r = r2
            g5.f$b r2 = new g5.f$b
            java.util.List<g5.f$e> r3 = r5.f10337m
            g5.e0 r4 = r5.f10343s
            r2.<init>(r3, r4, r0)
            r5.m5942r(r2)
            android.os.Handler r0 = r5.f10336l
            java.util.Objects.requireNonNull(r0)
            r2 = 5
            android.os.Message r0 = r0.obtainMessage(r2, r1)
            r0.sendToTarget()
            return
    }

    @Override // p108g5.InterfaceC2283r
    /* renamed from: a */
    public p088f4.C2018j0 mo6009a() {
            r1 = this;
            f4.j0 r0 = p108g5.C2266f.f10333t
            return r0
    }

    @Override // p108g5.InterfaceC2283r
    /* renamed from: c */
    public p108g5.InterfaceC2280o mo6010c(p108g5.InterfaceC2283r.a r4, p352u5.C6324m r5, long r6) {
            r3 = this;
            java.lang.Object r0 = r4.f10415a
            r1 = r0
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r1 = r1.first
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            g5.r$a r4 = r4.m6031b(r0)
            java.util.Map<java.lang.Object, g5.f$e> r0 = r3.f10339o
            java.lang.Object r0 = r0.get(r1)
            g5.f$e r0 = (p108g5.C2266f.e) r0
            if (r0 != 0) goto L2d
            g5.f$e r0 = new g5.f$e
            g5.f$c r1 = new g5.f$c
            r2 = 0
            r1.<init>(r2)
            r2 = 0
            r0.<init>(r1, r2)
            r1 = 1
            r0.f10358f = r1
            g5.m r1 = r0.f10353a
            r3.m5993w(r0, r1)
        L2d:
            java.util.Set<g5.f$e> r1 = r3.f10340p
            r1.add(r0)
            java.util.HashMap<T, g5.d$b<T>> r1 = r3.f10318g
            java.lang.Object r1 = r1.get(r0)
            g5.d$b r1 = (p108g5.AbstractC2262d.b) r1
            java.util.Objects.requireNonNull(r1)
            g5.r r2 = r1.f10325a
            g5.r$b r1 = r1.f10326b
            r2.mo5932g(r1)
            java.util.List<g5.r$a> r1 = r0.f10355c
            r1.add(r4)
            g5.m r1 = r0.f10353a
            g5.l r4 = r1.m6026x(r4, r5, r6)
            java.util.IdentityHashMap<g5.o, g5.f$e> r5 = r3.f10338n
            r5.put(r4, r0)
            r3.m6004A()
            return r4
    }

    @Override // p108g5.AbstractC2256a, p108g5.InterfaceC2283r
    /* renamed from: f */
    public synchronized p088f4.AbstractC2031n1 mo5931f() {
            r4 = this;
            monitor-enter(r4)
            g5.e0 r0 = r4.f10343s     // Catch: java.lang.Throwable -> L2c
            int r0 = r0.mo5996a()     // Catch: java.lang.Throwable -> L2c
            java.util.List<g5.f$e> r1 = r4.f10334j     // Catch: java.lang.Throwable -> L2c
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L2c
            r2 = 0
            if (r0 == r1) goto L21
            g5.e0 r0 = r4.f10343s     // Catch: java.lang.Throwable -> L2c
            g5.e0 r0 = r0.mo6003h()     // Catch: java.lang.Throwable -> L2c
            java.util.List<g5.f$e> r1 = r4.f10334j     // Catch: java.lang.Throwable -> L2c
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L2c
            g5.e0 r0 = r0.mo5999d(r2, r1)     // Catch: java.lang.Throwable -> L2c
            goto L23
        L21:
            g5.e0 r0 = r4.f10343s     // Catch: java.lang.Throwable -> L2c
        L23:
            g5.f$b r1 = new g5.f$b     // Catch: java.lang.Throwable -> L2c
            java.util.List<g5.f$e> r3 = r4.f10334j     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r3, r0, r2)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r4)
            return r1
        L2c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    @Override // p108g5.InterfaceC2283r
    /* renamed from: n */
    public void mo6011n(p108g5.InterfaceC2280o r3) {
            r2 = this;
            java.util.IdentityHashMap<g5.o, g5.f$e> r0 = r2.f10338n
            java.lang.Object r0 = r0.remove(r3)
            g5.f$e r0 = (p108g5.C2266f.e) r0
            java.util.Objects.requireNonNull(r0)
            g5.m r1 = r0.f10353a
            r1.mo6011n(r3)
            java.util.List<g5.r$a> r1 = r0.f10355c
            g5.l r3 = (p108g5.C2277l) r3
            g5.r$a r3 = r3.f10388Y
            r1.remove(r3)
            java.util.IdentityHashMap<g5.o, g5.f$e> r3 = r2.f10338n
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L24
            r2.m6004A()
        L24:
            r2.m6006C(r0)
            return
    }

    @Override // p108g5.AbstractC2262d, p108g5.AbstractC2256a
    /* renamed from: o */
    public void mo5939o() {
            r1 = this;
            super.mo5939o()
            java.util.Set<g5.f$e> r0 = r1.f10340p
            r0.clear()
            return
    }

    @Override // p108g5.AbstractC2262d, p108g5.AbstractC2256a
    /* renamed from: p */
    public void mo5940p() {
            r0 = this;
            return
    }

    @Override // p108g5.AbstractC2256a
    /* renamed from: q */
    public synchronized void mo5941q(p352u5.InterfaceC6317g0 r3) {
            r2 = this;
            monitor-enter(r2)
            r2.f10320i = r3     // Catch: java.lang.Throwable -> L3b
            android.os.Handler r3 = p371v5.C6552b0.m13317j()     // Catch: java.lang.Throwable -> L3b
            r2.f10319h = r3     // Catch: java.lang.Throwable -> L3b
            android.os.Handler r3 = new android.os.Handler     // Catch: java.lang.Throwable -> L3b
            g5.e r0 = new g5.e     // Catch: java.lang.Throwable -> L3b
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L3b
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L3b
            r2.f10336l = r3     // Catch: java.lang.Throwable -> L3b
            java.util.List<g5.f$e> r3 = r2.f10334j     // Catch: java.lang.Throwable -> L3b
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L21
            r2.m6008E()     // Catch: java.lang.Throwable -> L3b
            goto L39
        L21:
            g5.e0 r3 = r2.f10343s     // Catch: java.lang.Throwable -> L3b
            java.util.List<g5.f$e> r0 = r2.f10334j     // Catch: java.lang.Throwable -> L3b
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L3b
            r1 = 0
            g5.e0 r3 = r3.mo5999d(r1, r0)     // Catch: java.lang.Throwable -> L3b
            r2.f10343s = r3     // Catch: java.lang.Throwable -> L3b
            java.util.List<g5.f$e> r3 = r2.f10334j     // Catch: java.lang.Throwable -> L3b
            r2.m6012x(r1, r3)     // Catch: java.lang.Throwable -> L3b
            r3 = 0
            r2.m6007D(r3)     // Catch: java.lang.Throwable -> L3b
        L39:
            monitor-exit(r2)
            return
        L3b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // p108g5.AbstractC2262d, p108g5.AbstractC2256a
    /* renamed from: s */
    public synchronized void mo5943s() {
            r2 = this;
            monitor-enter(r2)
            super.mo5943s()     // Catch: java.lang.Throwable -> L34
            java.util.List<g5.f$e> r0 = r2.f10337m     // Catch: java.lang.Throwable -> L34
            r0.clear()     // Catch: java.lang.Throwable -> L34
            java.util.Set<g5.f$e> r0 = r2.f10340p     // Catch: java.lang.Throwable -> L34
            r0.clear()     // Catch: java.lang.Throwable -> L34
            java.util.Map<java.lang.Object, g5.f$e> r0 = r2.f10339o     // Catch: java.lang.Throwable -> L34
            r0.clear()     // Catch: java.lang.Throwable -> L34
            g5.e0 r0 = r2.f10343s     // Catch: java.lang.Throwable -> L34
            g5.e0 r0 = r0.mo6003h()     // Catch: java.lang.Throwable -> L34
            r2.f10343s = r0     // Catch: java.lang.Throwable -> L34
            android.os.Handler r0 = r2.f10336l     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L25
            r1 = 0
            r0.removeCallbacksAndMessages(r1)     // Catch: java.lang.Throwable -> L34
            r2.f10336l = r1     // Catch: java.lang.Throwable -> L34
        L25:
            r0 = 0
            r2.f10341q = r0     // Catch: java.lang.Throwable -> L34
            java.util.Set<g5.f$d> r0 = r2.f10342r     // Catch: java.lang.Throwable -> L34
            r0.clear()     // Catch: java.lang.Throwable -> L34
            java.util.Set<g5.f$d> r0 = r2.f10335k     // Catch: java.lang.Throwable -> L34
            r2.m6005B(r0)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r2)
            return
        L34:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // p108g5.AbstractC2262d
    /* renamed from: t */
    public p108g5.InterfaceC2283r.a mo5990t(p108g5.C2266f.e r7, p108g5.InterfaceC2283r.a r8) {
            r6 = this;
            g5.f$e r7 = (p108g5.C2266f.e) r7
            r0 = 0
        L3:
            java.util.List<g5.r$a> r1 = r7.f10355c
            int r1 = r1.size()
            if (r0 >= r1) goto L2b
            java.util.List<g5.r$a> r1 = r7.f10355c
            java.lang.Object r1 = r1.get(r0)
            g5.r$a r1 = (p108g5.InterfaceC2283r.a) r1
            long r1 = r1.f10418d
            long r3 = r8.f10418d
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L28
            java.lang.Object r0 = r8.f10415a
            java.lang.Object r7 = r7.f10354b
            android.util.Pair r7 = android.util.Pair.create(r7, r0)
            g5.r$a r7 = r8.m6031b(r7)
            goto L2c
        L28:
            int r0 = r0 + 1
            goto L3
        L2b:
            r7 = 0
        L2c:
            return r7
    }

    @Override // p108g5.AbstractC2262d
    /* renamed from: u */
    public int mo5991u(p108g5.C2266f.e r1, int r2) {
            r0 = this;
            g5.f$e r1 = (p108g5.C2266f.e) r1
            int r1 = r1.f10357e
            int r2 = r2 + r1
            return r2
    }

    @Override // p108g5.AbstractC2262d
    /* renamed from: v */
    public void mo5992v(p108g5.C2266f.e r2, p108g5.InterfaceC2283r r3, p088f4.AbstractC2031n1 r4) {
            r1 = this;
            g5.f$e r2 = (p108g5.C2266f.e) r2
            int r3 = r2.f10356d
            int r3 = r3 + 1
            java.util.List<g5.f$e> r0 = r1.f10337m
            int r0 = r0.size()
            if (r3 >= r0) goto L2e
            java.util.List<g5.f$e> r3 = r1.f10337m
            int r0 = r2.f10356d
            int r0 = r0 + 1
            java.lang.Object r3 = r3.get(r0)
            g5.f$e r3 = (p108g5.C2266f.e) r3
            int r4 = r4.mo5180q()
            int r3 = r3.f10357e
            int r0 = r2.f10357e
            int r3 = r3 - r0
            int r4 = r4 - r3
            if (r4 == 0) goto L2e
            int r2 = r2.f10356d
            int r2 = r2 + 1
            r3 = 0
            r1.m6014z(r2, r3, r4)
        L2e:
            r2 = 0
            r1.m6007D(r2)
            return
    }

    /* renamed from: x */
    public final void m6012x(int r6, java.util.Collection<p108g5.C2266f.e> r7) {
            r5 = this;
            java.util.Iterator r7 = r7.iterator()
        L4:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r0 = r7.next()
            g5.f$e r0 = (p108g5.C2266f.e) r0
            int r1 = r6 + 1
            r2 = 0
            if (r6 <= 0) goto L2f
            java.util.List<g5.f$e> r3 = r5.f10337m
            int r4 = r6 + (-1)
            java.lang.Object r3 = r3.get(r4)
            g5.f$e r3 = (p108g5.C2266f.e) r3
            g5.m r4 = r3.f10353a
            g5.m$a r4 = r4.f10399n
            int r3 = r3.f10357e
            int r4 = r4.mo5180q()
            int r4 = r4 + r3
            r0.f10356d = r6
            r0.f10357e = r4
            goto L33
        L2f:
            r0.f10356d = r6
            r0.f10357e = r2
        L33:
            r0.f10358f = r2
            java.util.List<g5.r$a> r2 = r0.f10355c
            r2.clear()
            g5.m r2 = r0.f10353a
            g5.m$a r2 = r2.f10399n
            int r2 = r2.mo5180q()
            r3 = 1
            r5.m6014z(r6, r3, r2)
            java.util.List<g5.f$e> r2 = r5.f10337m
            r2.add(r6, r0)
            java.util.Map<java.lang.Object, g5.f$e> r6 = r5.f10339o
            java.lang.Object r2 = r0.f10354b
            r6.put(r2, r0)
            g5.m r6 = r0.f10353a
            r5.m5993w(r0, r6)
            java.util.HashSet<g5.r$b> r6 = r5.f10256b
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r3
            if (r6 == 0) goto L6e
            java.util.IdentityHashMap<g5.o, g5.f$e> r6 = r5.f10338n
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L6e
            java.util.Set<g5.f$e> r6 = r5.f10340p
            r6.add(r0)
            goto L80
        L6e:
            java.util.HashMap<T, g5.d$b<T>> r6 = r5.f10318g
            java.lang.Object r6 = r6.get(r0)
            g5.d$b r6 = (p108g5.AbstractC2262d.b) r6
            java.util.Objects.requireNonNull(r6)
            g5.r r0 = r6.f10325a
            g5.r$b r6 = r6.f10326b
            r0.mo5933h(r6)
        L80:
            r6 = r1
            goto L4
        L82:
            return
    }

    /* renamed from: y */
    public final void m6013y(int r5, java.util.Collection<p108g5.InterfaceC2283r> r6, android.os.Handler r7, java.lang.Runnable r8) {
            r4 = this;
            r7 = 1
            p371v5.C6549a.m13288b(r7)
            android.os.Handler r7 = r4.f10336l
            java.util.Iterator r8 = r6.iterator()
        La:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r8.next()
            g5.r r0 = (p108g5.InterfaceC2283r) r0
            java.util.Objects.requireNonNull(r0)
            goto La
        L1a:
            java.util.ArrayList r8 = new java.util.ArrayList
            int r0 = r6.size()
            r8.<init>(r0)
            java.util.Iterator r0 = r6.iterator()
        L27:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            g5.r r1 = (p108g5.InterfaceC2283r) r1
            g5.f$e r3 = new g5.f$e
            r3.<init>(r1, r2)
            r8.add(r3)
            goto L27
        L3d:
            java.util.List<g5.f$e> r0 = r4.f10334j
            r0.addAll(r5, r8)
            if (r7 == 0) goto L57
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L57
            r6 = 0
            g5.f$f r0 = new g5.f$f
            r0.<init>(r5, r8, r6)
            android.os.Message r5 = r7.obtainMessage(r2, r0)
            r5.sendToTarget()
        L57:
            return
    }

    /* renamed from: z */
    public final void m6014z(int r3, int r4, int r5) {
            r2 = this;
        L0:
            java.util.List<g5.f$e> r0 = r2.f10337m
            int r0 = r0.size()
            if (r3 >= r0) goto L1d
            java.util.List<g5.f$e> r0 = r2.f10337m
            java.lang.Object r0 = r0.get(r3)
            g5.f$e r0 = (p108g5.C2266f.e) r0
            int r1 = r0.f10356d
            int r1 = r1 + r4
            r0.f10356d = r1
            int r1 = r0.f10357e
            int r1 = r1 + r5
            r0.f10357e = r1
            int r3 = r3 + 1
            goto L0
        L1d:
            return
    }
}
