package p088f4;

/* renamed from: f4.r0 */
/* loaded from: classes.dex */
public final class C2042r0 {

    /* renamed from: a */
    public final java.util.List<p088f4.C2042r0.c> f9296a;

    /* renamed from: b */
    public final java.util.IdentityHashMap<p108g5.InterfaceC2280o, p088f4.C2042r0.c> f9297b;

    /* renamed from: c */
    public final java.util.Map<java.lang.Object, p088f4.C2042r0.c> f9298c;

    /* renamed from: d */
    public final p088f4.C2042r0.d f9299d;

    /* renamed from: e */
    public final p108g5.InterfaceC2286u.a f9300e;

    /* renamed from: f */
    public final p162j4.InterfaceC3403h.a f9301f;

    /* renamed from: g */
    public final java.util.HashMap<p088f4.C2042r0.c, p088f4.C2042r0.b> f9302g;

    /* renamed from: h */
    public final java.util.Set<p088f4.C2042r0.c> f9303h;

    /* renamed from: i */
    public p108g5.InterfaceC2265e0 f9304i;

    /* renamed from: j */
    public boolean f9305j;

    /* renamed from: k */
    public p352u5.InterfaceC6317g0 f9306k;

    /* renamed from: f4.r0$a */
    public final class a implements p108g5.InterfaceC2286u, p162j4.InterfaceC3403h {

        /* renamed from: Y */
        public final p088f4.C2042r0.c f9307Y;

        /* renamed from: Z */
        public p108g5.InterfaceC2286u.a f9308Z;

        /* renamed from: a0 */
        public p162j4.InterfaceC3403h.a f9309a0;

        /* renamed from: b0 */
        public final /* synthetic */ p088f4.C2042r0 f9310b0;

        public a(p088f4.C2042r0 r2, p088f4.C2042r0.c r3) {
                r1 = this;
                r1.f9310b0 = r2
                r1.<init>()
                g5.u$a r0 = r2.f9300e
                r1.f9308Z = r0
                j4.h$a r2 = r2.f9301f
                r1.f9309a0 = r2
                r1.f9307Y = r3
                return
        }

        @Override // p108g5.InterfaceC2286u
        /* renamed from: D */
        public void mo5395D(int r1, p108g5.InterfaceC2283r.a r2, p108g5.C2276k r3, p108g5.C2279n r4) {
                r0 = this;
                boolean r1 = r0.m5398a(r1, r2)
                if (r1 == 0) goto Lb
                g5.u$a r1 = r0.f9308Z
                r1.m6037f(r3, r4)
            Lb:
                return
        }

        @Override // p162j4.InterfaceC3403h
        /* renamed from: E */
        public void mo5396E(int r1, p108g5.InterfaceC2283r.a r2) {
                r0 = this;
                boolean r1 = r0.m5398a(r1, r2)
                if (r1 == 0) goto Lb
                j4.h$a r1 = r0.f9309a0
                r1.m7825c()
            Lb:
                return
        }

        @Override // p162j4.InterfaceC3403h
        /* renamed from: P */
        public void mo5397P(int r1, p108g5.InterfaceC2283r.a r2) {
                r0 = this;
                boolean r1 = r0.m5398a(r1, r2)
                if (r1 == 0) goto Lb
                j4.h$a r1 = r0.f9309a0
                r1.m7828f()
            Lb:
                return
        }

        /* renamed from: a */
        public final boolean m5398a(int r10, p108g5.InterfaceC2283r.a r11) {
                r9 = this;
                r0 = 0
                if (r11 == 0) goto L33
                f4.r0$c r1 = r9.f9307Y
                r2 = 0
                r3 = 0
            L7:
                java.util.List<g5.r$a> r4 = r1.f9316c
                int r4 = r4.size()
                if (r3 >= r4) goto L30
                java.util.List<g5.r$a> r4 = r1.f9316c
                java.lang.Object r4 = r4.get(r3)
                g5.r$a r4 = (p108g5.InterfaceC2283r.a) r4
                long r4 = r4.f10418d
                long r6 = r11.f10418d
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 != 0) goto L2d
                java.lang.Object r0 = r11.f10415a
                java.lang.Object r1 = r1.f9315b
                android.util.Pair r0 = android.util.Pair.create(r1, r0)
                g5.r$a r11 = r11.m6031b(r0)
                r0 = r11
                goto L30
            L2d:
                int r3 = r3 + 1
                goto L7
            L30:
                if (r0 != 0) goto L33
                return r2
            L33:
                f4.r0$c r11 = r9.f9307Y
                int r11 = r11.f9317d
                int r10 = r10 + r11
                g5.u$a r11 = r9.f9308Z
                int r1 = r11.f10431a
                if (r1 != r10) goto L46
                g5.r$a r11 = r11.f10432b
                boolean r11 = p371v5.C6552b0.m13308a(r11, r0)
                if (r11 != 0) goto L52
            L46:
                f4.r0 r11 = r9.f9310b0
                g5.u$a r11 = r11.f9300e
                r1 = 0
                g5.u$a r11 = r11.m6038g(r10, r0, r1)
                r9.f9308Z = r11
            L52:
                j4.h$a r11 = r9.f9309a0
                int r1 = r11.f14743a
                if (r1 != r10) goto L60
                g5.r$a r11 = r11.f14744b
                boolean r11 = p371v5.C6552b0.m13308a(r11, r0)
                if (r11 != 0) goto L6a
            L60:
                f4.r0 r11 = r9.f9310b0
                j4.h$a r11 = r11.f9301f
                j4.h$a r10 = r11.m7829g(r10, r0)
                r9.f9309a0 = r10
            L6a:
                r10 = 1
                return r10
        }

        @Override // p162j4.InterfaceC3403h
        /* renamed from: e0 */
        public void mo5399e0(int r1, p108g5.InterfaceC2283r.a r2) {
                r0 = this;
                boolean r1 = r0.m5398a(r1, r2)
                if (r1 == 0) goto Lb
                j4.h$a r1 = r0.f9309a0
                r1.m7823a()
            Lb:
                return
        }

        @Override // p162j4.InterfaceC3403h
        /* renamed from: g0 */
        public void mo5400g0(int r1, p108g5.InterfaceC2283r.a r2) {
                r0 = this;
                boolean r1 = r0.m5398a(r1, r2)
                if (r1 == 0) goto Lb
                j4.h$a r1 = r0.f9309a0
                r1.m7824b()
            Lb:
                return
        }

        @Override // p108g5.InterfaceC2286u
        /* renamed from: i */
        public void mo5401i(int r1, p108g5.InterfaceC2283r.a r2, p108g5.C2276k r3, p108g5.C2279n r4) {
                r0 = this;
                boolean r1 = r0.m5398a(r1, r2)
                if (r1 == 0) goto Lb
                g5.u$a r1 = r0.f9308Z
                r1.m6034c(r3, r4)
            Lb:
                return
        }

        @Override // p162j4.InterfaceC3403h
        /* renamed from: o */
        public void mo5402o(int r1, p108g5.InterfaceC2283r.a r2, int r3) {
                r0 = this;
                boolean r1 = r0.m5398a(r1, r2)
                if (r1 == 0) goto Lb
                j4.h$a r1 = r0.f9309a0
                r1.m7826d(r3)
            Lb:
                return
        }

        @Override // p108g5.InterfaceC2286u
        /* renamed from: p */
        public void mo5403p(int r1, p108g5.InterfaceC2283r.a r2, p108g5.C2279n r3) {
                r0 = this;
                boolean r1 = r0.m5398a(r1, r2)
                if (r1 == 0) goto Lb
                g5.u$a r1 = r0.f9308Z
                r1.m6033b(r3)
            Lb:
                return
        }

        @Override // p108g5.InterfaceC2286u
        /* renamed from: s */
        public void mo5404s(int r1, p108g5.InterfaceC2283r.a r2, p108g5.C2276k r3, p108g5.C2279n r4, java.io.IOException r5, boolean r6) {
                r0 = this;
                boolean r1 = r0.m5398a(r1, r2)
                if (r1 == 0) goto Lb
                g5.u$a r1 = r0.f9308Z
                r1.m6036e(r3, r4, r5, r6)
            Lb:
                return
        }

        @Override // p108g5.InterfaceC2286u
        /* renamed from: w */
        public void mo5405w(int r1, p108g5.InterfaceC2283r.a r2, p108g5.C2276k r3, p108g5.C2279n r4) {
                r0 = this;
                boolean r1 = r0.m5398a(r1, r2)
                if (r1 == 0) goto Lb
                g5.u$a r1 = r0.f9308Z
                r1.m6035d(r3, r4)
            Lb:
                return
        }

        @Override // p162j4.InterfaceC3403h
        /* renamed from: x */
        public void mo5406x(int r1, p108g5.InterfaceC2283r.a r2, java.lang.Exception r3) {
                r0 = this;
                boolean r1 = r0.m5398a(r1, r2)
                if (r1 == 0) goto Lb
                j4.h$a r1 = r0.f9309a0
                r1.m7827e(r3)
            Lb:
                return
        }
    }

    /* renamed from: f4.r0$b */
    public static final class b {

        /* renamed from: a */
        public final p108g5.InterfaceC2283r f9311a;

        /* renamed from: b */
        public final p108g5.InterfaceC2283r.b f9312b;

        /* renamed from: c */
        public final p088f4.C2042r0.a f9313c;

        public b(p108g5.InterfaceC2283r r1, p108g5.InterfaceC2283r.b r2, p088f4.C2042r0.a r3) {
                r0 = this;
                r0.<init>()
                r0.f9311a = r1
                r0.f9312b = r2
                r0.f9313c = r3
                return
        }
    }

    /* renamed from: f4.r0$c */
    public static final class c implements p088f4.InterfaceC2036p0 {

        /* renamed from: a */
        public final p108g5.C2278m f9314a;

        /* renamed from: b */
        public final java.lang.Object f9315b;

        /* renamed from: c */
        public final java.util.List<p108g5.InterfaceC2283r.a> f9316c;

        /* renamed from: d */
        public int f9317d;

        /* renamed from: e */
        public boolean f9318e;

        public c(p108g5.InterfaceC2283r r2, boolean r3) {
                r1 = this;
                r1.<init>()
                g5.m r0 = new g5.m
                r0.<init>(r2, r3)
                r1.f9314a = r0
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.f9316c = r2
                java.lang.Object r2 = new java.lang.Object
                r2.<init>()
                r1.f9315b = r2
                return
        }

        @Override // p088f4.InterfaceC2036p0
        /* renamed from: a */
        public java.lang.Object mo5378a() {
                r1 = this;
                java.lang.Object r0 = r1.f9315b
                return r0
        }

        @Override // p088f4.InterfaceC2036p0
        /* renamed from: b */
        public p088f4.AbstractC2031n1 mo5379b() {
                r1 = this;
                g5.m r0 = r1.f9314a
                g5.m$a r0 = r0.f10399n
                return r0
        }
    }

    /* renamed from: f4.r0$d */
    public interface d {
    }

    public C2042r0(p088f4.C2042r0.d r3, p107g4.C2254p r4, android.os.Handler r5) {
            r2 = this;
            r2.<init>()
            r2.f9299d = r3
            g5.e0$a r3 = new g5.e0$a
            r0 = 0
            r3.<init>(r0)
            r2.f9304i = r3
            java.util.IdentityHashMap r3 = new java.util.IdentityHashMap
            r3.<init>()
            r2.f9297b = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r2.f9298c = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f9296a = r3
            g5.u$a r3 = new g5.u$a
            r3.<init>()
            r2.f9300e = r3
            j4.h$a r0 = new j4.h$a
            r0.<init>()
            r2.f9301f = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.f9302g = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r2.f9303h = r1
            if (r4 == 0) goto L54
            java.util.concurrent.CopyOnWriteArrayList<g5.u$a$a> r3 = r3.f10433c
            g5.u$a$a r1 = new g5.u$a$a
            r1.<init>(r5, r4)
            r3.add(r1)
            java.util.concurrent.CopyOnWriteArrayList<j4.h$a$a> r3 = r0.f14745c
            j4.h$a$a r0 = new j4.h$a$a
            r0.<init>(r5, r4)
            r3.add(r0)
        L54:
            return
    }

    /* renamed from: a */
    public p088f4.AbstractC2031n1 m5386a(int r5, java.util.List<p088f4.C2042r0.c> r6, p108g5.InterfaceC2265e0 r7) {
            r4 = this;
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L7c
            r4.f9304i = r7
            r7 = r5
        L9:
            int r0 = r6.size()
            int r0 = r0 + r5
            if (r7 >= r0) goto L7c
            int r0 = r7 - r5
            java.lang.Object r0 = r6.get(r0)
            f4.r0$c r0 = (p088f4.C2042r0.c) r0
            r1 = 0
            if (r7 <= 0) goto L33
            java.util.List<f4.r0$c> r2 = r4.f9296a
            int r3 = r7 + (-1)
            java.lang.Object r2 = r2.get(r3)
            f4.r0$c r2 = (p088f4.C2042r0.c) r2
            g5.m r3 = r2.f9314a
            g5.m$a r3 = r3.f10399n
            int r2 = r2.f9317d
            int r3 = r3.mo5180q()
            int r3 = r3 + r2
            r0.f9317d = r3
            goto L35
        L33:
            r0.f9317d = r1
        L35:
            r0.f9318e = r1
            java.util.List<g5.r$a> r1 = r0.f9316c
            r1.clear()
            g5.m r1 = r0.f9314a
            g5.m$a r1 = r1.f10399n
            int r1 = r1.mo5180q()
            r4.m5387b(r7, r1)
            java.util.List<f4.r0$c> r1 = r4.f9296a
            r1.add(r7, r0)
            java.util.Map<java.lang.Object, f4.r0$c> r1 = r4.f9298c
            java.lang.Object r2 = r0.f9315b
            r1.put(r2, r0)
            boolean r1 = r4.f9305j
            if (r1 == 0) goto L79
            r4.m5392g(r0)
            java.util.IdentityHashMap<g5.o, f4.r0$c> r1 = r4.f9297b
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L68
            java.util.Set<f4.r0$c> r1 = r4.f9303h
            r1.add(r0)
            goto L79
        L68:
            java.util.HashMap<f4.r0$c, f4.r0$b> r1 = r4.f9302g
            java.lang.Object r0 = r1.get(r0)
            f4.r0$b r0 = (p088f4.C2042r0.b) r0
            if (r0 == 0) goto L79
            g5.r r1 = r0.f9311a
            g5.r$b r0 = r0.f9312b
            r1.mo5933h(r0)
        L79:
            int r7 = r7 + 1
            goto L9
        L7c:
            f4.n1 r5 = r4.m5388c()
            return r5
    }

    /* renamed from: b */
    public final void m5387b(int r3, int r4) {
            r2 = this;
        L0:
            java.util.List<f4.r0$c> r0 = r2.f9296a
            int r0 = r0.size()
            if (r3 >= r0) goto L18
            java.util.List<f4.r0$c> r0 = r2.f9296a
            java.lang.Object r0 = r0.get(r3)
            f4.r0$c r0 = (p088f4.C2042r0.c) r0
            int r1 = r0.f9317d
            int r1 = r1 + r4
            r0.f9317d = r1
            int r3 = r3 + 1
            goto L0
        L18:
            return
    }

    /* renamed from: c */
    public p088f4.AbstractC2031n1 m5388c() {
            r3 = this;
            java.util.List<f4.r0$c> r0 = r3.f9296a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            f4.n1 r0 = p088f4.AbstractC2031n1.f9223Y
            return r0
        Lb:
            r0 = 0
            r1 = 0
        Ld:
            java.util.List<f4.r0$c> r2 = r3.f9296a
            int r2 = r2.size()
            if (r0 >= r2) goto L2b
            java.util.List<f4.r0$c> r2 = r3.f9296a
            java.lang.Object r2 = r2.get(r0)
            f4.r0$c r2 = (p088f4.C2042r0.c) r2
            r2.f9317d = r1
            g5.m r2 = r2.f9314a
            g5.m$a r2 = r2.f10399n
            int r2 = r2.mo5180q()
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto Ld
        L2b:
            f4.b1 r0 = new f4.b1
            java.util.List<f4.r0$c> r1 = r3.f9296a
            g5.e0 r2 = r3.f9304i
            r0.<init>(r1, r2)
            return r0
    }

    /* renamed from: d */
    public final void m5389d() {
            r3 = this;
            java.util.Set<f4.r0$c> r0 = r3.f9303h
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            f4.r0$c r1 = (p088f4.C2042r0.c) r1
            java.util.List<g5.r$a> r2 = r1.f9316c
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L6
            java.util.HashMap<f4.r0$c, f4.r0$b> r2 = r3.f9302g
            java.lang.Object r1 = r2.get(r1)
            f4.r0$b r1 = (p088f4.C2042r0.b) r1
            if (r1 == 0) goto L2b
            g5.r r2 = r1.f9311a
            g5.r$b r1 = r1.f9312b
            r2.mo5933h(r1)
        L2b:
            r0.remove()
            goto L6
        L2f:
            return
    }

    /* renamed from: e */
    public int m5390e() {
            r1 = this;
            java.util.List<f4.r0$c> r0 = r1.f9296a
            int r0 = r0.size()
            return r0
    }

    /* renamed from: f */
    public final void m5391f(p088f4.C2042r0.c r4) {
            r3 = this;
            boolean r0 = r4.f9318e
            if (r0 == 0) goto L31
            java.util.List<g5.r$a> r0 = r4.f9316c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L31
            java.util.HashMap<f4.r0$c, f4.r0$b> r0 = r3.f9302g
            java.lang.Object r0 = r0.remove(r4)
            f4.r0$b r0 = (p088f4.C2042r0.b) r0
            java.util.Objects.requireNonNull(r0)
            g5.r r1 = r0.f9311a
            g5.r$b r2 = r0.f9312b
            r1.mo5934i(r2)
            g5.r r1 = r0.f9311a
            f4.r0$a r2 = r0.f9313c
            r1.mo5937l(r2)
            g5.r r1 = r0.f9311a
            f4.r0$a r0 = r0.f9313c
            r1.mo5936k(r0)
            java.util.Set<f4.r0$c> r0 = r3.f9303h
            r0.remove(r4)
        L31:
            return
    }

    /* renamed from: g */
    public final void m5392g(p088f4.C2042r0.c r7) {
            r6 = this;
            g5.m r0 = r7.f9314a
            f4.q0 r1 = new f4.q0
            r1.<init>(r6)
            f4.r0$a r2 = new f4.r0$a
            r2.<init>(r6, r7)
            java.util.HashMap<f4.r0$c, f4.r0$b> r3 = r6.f9302g
            f4.r0$b r4 = new f4.r0$b
            r4.<init>(r0, r1, r2)
            r3.put(r7, r4)
            android.os.Looper r7 = p371v5.C6552b0.m13322o()
            android.os.Handler r3 = new android.os.Handler
            r4 = 0
            r3.<init>(r7, r4)
            java.util.Objects.requireNonNull(r0)
            g5.u$a r7 = r0.f10257c
            java.util.Objects.requireNonNull(r7)
            java.util.concurrent.CopyOnWriteArrayList<g5.u$a$a> r7 = r7.f10433c
            g5.u$a$a r5 = new g5.u$a$a
            r5.<init>(r3, r2)
            r7.add(r5)
            android.os.Looper r7 = p371v5.C6552b0.m13322o()
            android.os.Handler r3 = new android.os.Handler
            r3.<init>(r7, r4)
            j4.h$a r7 = r0.f10258d
            java.util.Objects.requireNonNull(r7)
            java.util.concurrent.CopyOnWriteArrayList<j4.h$a$a> r7 = r7.f14745c
            j4.h$a$a r4 = new j4.h$a$a
            r4.<init>(r3, r2)
            r7.add(r4)
            u5.g0 r7 = r6.f9306k
            r0.mo5935j(r1, r7)
            return
    }

    /* renamed from: h */
    public void m5393h(p108g5.InterfaceC2280o r3) {
            r2 = this;
            java.util.IdentityHashMap<g5.o, f4.r0$c> r0 = r2.f9297b
            java.lang.Object r0 = r0.remove(r3)
            f4.r0$c r0 = (p088f4.C2042r0.c) r0
            java.util.Objects.requireNonNull(r0)
            g5.m r1 = r0.f9314a
            r1.mo6011n(r3)
            java.util.List<g5.r$a> r1 = r0.f9316c
            g5.l r3 = (p108g5.C2277l) r3
            g5.r$a r3 = r3.f10388Y
            r1.remove(r3)
            java.util.IdentityHashMap<g5.o, f4.r0$c> r3 = r2.f9297b
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L24
            r2.m5389d()
        L24:
            r2.m5391f(r0)
            return
    }

    /* renamed from: i */
    public final void m5394i(int r5, int r6) {
            r4 = this;
            r0 = 1
            int r6 = r6 - r0
        L2:
            if (r6 < r5) goto L2b
            java.util.List<f4.r0$c> r1 = r4.f9296a
            java.lang.Object r1 = r1.remove(r6)
            f4.r0$c r1 = (p088f4.C2042r0.c) r1
            java.util.Map<java.lang.Object, f4.r0$c> r2 = r4.f9298c
            java.lang.Object r3 = r1.f9315b
            r2.remove(r3)
            g5.m r2 = r1.f9314a
            g5.m$a r2 = r2.f10399n
            int r2 = r2.mo5180q()
            int r2 = -r2
            r4.m5387b(r6, r2)
            r1.f9318e = r0
            boolean r2 = r4.f9305j
            if (r2 == 0) goto L28
            r4.m5391f(r1)
        L28:
            int r6 = r6 + (-1)
            goto L2
        L2b:
            return
    }
}
