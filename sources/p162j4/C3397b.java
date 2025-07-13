package p162j4;

/* renamed from: j4.b */
/* loaded from: classes.dex */
public class C3397b implements p162j4.InterfaceC3405j {

    /* renamed from: b */
    public final java.util.UUID f14691b;

    /* renamed from: c */
    public final p162j4.InterfaceC3412q.c f14692c;

    /* renamed from: d */
    public final p162j4.InterfaceC3419x f14693d;

    /* renamed from: e */
    public final java.util.HashMap<java.lang.String, java.lang.String> f14694e;

    /* renamed from: f */
    public final boolean f14695f;

    /* renamed from: g */
    public final int[] f14696g;

    /* renamed from: h */
    public final boolean f14697h;

    /* renamed from: i */
    public final p162j4.C3397b.f f14698i;

    /* renamed from: j */
    public final p352u5.InterfaceC6307b0 f14699j;

    /* renamed from: k */
    public final p162j4.C3397b.g f14700k;

    /* renamed from: l */
    public final long f14701l;

    /* renamed from: m */
    public final java.util.List<p162j4.C3396a> f14702m;

    /* renamed from: n */
    public final java.util.Set<p162j4.C3397b.e> f14703n;

    /* renamed from: o */
    public final java.util.Set<p162j4.C3396a> f14704o;

    /* renamed from: p */
    public int f14705p;

    /* renamed from: q */
    public p162j4.InterfaceC3412q f14706q;

    /* renamed from: r */
    public p162j4.C3396a f14707r;

    /* renamed from: s */
    public p162j4.C3396a f14708s;

    /* renamed from: t */
    public android.os.Looper f14709t;

    /* renamed from: u */
    public android.os.Handler f14710u;

    /* renamed from: v */
    public int f14711v;

    /* renamed from: w */
    public byte[] f14712w;

    /* renamed from: x */
    public volatile p162j4.C3397b.c f14713x;

    /* renamed from: j4.b$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: j4.b$b */
    public class b implements p162j4.InterfaceC3412q.b {

        /* renamed from: a */
        public final /* synthetic */ p162j4.C3397b f14714a;

        public b(p162j4.C3397b r1, p162j4.C3397b.a r2) {
                r0 = this;
                r0.f14714a = r1
                r0.<init>()
                return
        }
    }

    @android.annotation.SuppressLint({"HandlerLeak"})
    /* renamed from: j4.b$c */
    public class c extends android.os.Handler {

        /* renamed from: a */
        public final /* synthetic */ p162j4.C3397b f14715a;

        public c(p162j4.C3397b r1, android.os.Looper r2) {
                r0 = this;
                r0.f14715a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r5) {
                r4 = this;
                java.lang.Object r0 = r5.obj
                byte[] r0 = (byte[]) r0
                if (r0 != 0) goto L7
                return
            L7:
                j4.b r1 = r4.f14715a
                java.util.List<j4.a> r1 = r1.f14702m
                java.util.Iterator r1 = r1.iterator()
            Lf:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L38
                java.lang.Object r2 = r1.next()
                j4.a r2 = (p162j4.C3396a) r2
                byte[] r3 = r2.f14680t
                boolean r3 = java.util.Arrays.equals(r3, r0)
                if (r3 == 0) goto Lf
                int r5 = r5.what
                r0 = 2
                if (r5 == r0) goto L29
                goto L38
            L29:
                int r5 = r2.f14665e
                if (r5 != 0) goto L38
                int r5 = r2.f14674n
                r0 = 4
                if (r5 != r0) goto L38
                int r5 = p371v5.C6552b0.f25624a
                r5 = 0
                r2.m7797i(r5)
            L38:
                return
        }
    }

    /* renamed from: j4.b$d */
    public static final class d extends java.lang.Exception {
        public d(java.util.UUID r2, p162j4.C3397b.a r3) {
                r1 = this;
                java.lang.String r2 = java.lang.String.valueOf(r2)
                int r3 = r2.length()
                int r3 = r3 + 29
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r3)
                java.lang.String r3 = "Media does not support uuid: "
                r0.append(r3)
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r1.<init>(r2)
                return
        }
    }

    /* renamed from: j4.b$e */
    public class e implements p162j4.InterfaceC3405j.b {

        /* renamed from: Y */
        public final p162j4.InterfaceC3403h.a f14716Y;

        /* renamed from: Z */
        public p162j4.InterfaceC3400e f14717Z;

        /* renamed from: a0 */
        public boolean f14718a0;

        /* renamed from: b0 */
        public final /* synthetic */ p162j4.C3397b f14719b0;

        public e(p162j4.C3397b r1, p162j4.InterfaceC3403h.a r2) {
                r0 = this;
                r0.f14719b0 = r1
                r0.<init>()
                r0.f14716Y = r2
                return
        }

        @Override // p162j4.InterfaceC3405j.b
        public void release() {
                r2 = this;
                j4.b r0 = r2.f14719b0
                android.os.Handler r0 = r0.f14710u
                java.util.Objects.requireNonNull(r0)
                f1.f r1 = new f1.f
                r1.<init>(r2)
                p371v5.C6552b0.m13300D(r0, r1)
                return
        }
    }

    /* renamed from: j4.b$f */
    public class f implements p162j4.C3396a.a {

        /* renamed from: a */
        public final java.util.Set<p162j4.C3396a> f14720a;

        /* renamed from: b */
        public p162j4.C3396a f14721b;

        public f() {
                r1 = this;
                r1.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.f14720a = r0
                return
        }

        /* renamed from: a */
        public void m7819a(java.lang.Exception r4, boolean r5) {
                r3 = this;
                r0 = 0
                r3.f14721b = r0
                java.util.Set<j4.a> r0 = r3.f14720a
                b9.n r0 = p026b9.AbstractC0714n.m2311w(r0)
                java.util.Set<j4.a> r1 = r3.f14720a
                r1.clear()
                b9.a r0 = r0.m2313A()
            L12:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L27
                java.lang.Object r1 = r0.next()
                j4.a r1 = (p162j4.C3396a) r1
                if (r5 == 0) goto L22
                r2 = 1
                goto L23
            L22:
                r2 = 3
            L23:
                r1.m7799k(r4, r2)
                goto L12
            L27:
                return
        }
    }

    /* renamed from: j4.b$g */
    public class g implements p162j4.C3396a.b {

        /* renamed from: a */
        public final /* synthetic */ p162j4.C3397b f14722a;

        public g(p162j4.C3397b r1, p162j4.C3397b.a r2) {
                r0 = this;
                r0.f14722a = r1
                r0.<init>()
                return
        }
    }

    public C3397b(java.util.UUID r2, p162j4.InterfaceC3412q.c r3, p162j4.InterfaceC3419x r4, java.util.HashMap r5, boolean r6, int[] r7, boolean r8, p352u5.InterfaceC6307b0 r9, long r10, p162j4.C3397b.a r12) {
            r1 = this;
            r1.<init>()
            java.util.Objects.requireNonNull(r2)
            java.util.UUID r12 = p088f4.C2017j.f8965b
            boolean r12 = r12.equals(r2)
            r12 = r12 ^ 1
            java.lang.String r0 = "Use C.CLEARKEY_UUID instead"
            p371v5.C6549a.m13289c(r12, r0)
            r1.f14691b = r2
            r1.f14692c = r3
            r1.f14693d = r4
            r1.f14694e = r5
            r1.f14695f = r6
            r1.f14696g = r7
            r1.f14697h = r8
            r1.f14699j = r9
            j4.b$f r2 = new j4.b$f
            r2.<init>()
            r1.f14698i = r2
            j4.b$g r2 = new j4.b$g
            r3 = 0
            r2.<init>(r1, r3)
            r1.f14700k = r2
            r2 = 0
            r1.f14711v = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f14702m = r2
            java.util.Set r2 = p026b9.C0707j0.m2302e()
            r1.f14703n = r2
            java.util.Set r2 = p026b9.C0707j0.m2302e()
            r1.f14704o = r2
            r1.f14701l = r10
            return
    }

    /* renamed from: e */
    public static boolean m7806e(p162j4.InterfaceC3400e r3) {
            j4.a r3 = (p162j4.C3396a) r3
            int r0 = r3.f14674n
            r1 = 1
            if (r0 != r1) goto L1d
            int r0 = p371v5.C6552b0.f25624a
            r2 = 19
            if (r0 < r2) goto L1e
            j4.e$a r3 = r3.mo7794f()
            java.util.Objects.requireNonNull(r3)
            java.lang.Throwable r3 = r3.getCause()
            boolean r3 = r3 instanceof android.media.ResourceBusyException
            if (r3 == 0) goto L1d
            goto L1e
        L1d:
            r1 = 0
        L1e:
            return r1
    }

    /* renamed from: h */
    public static java.util.List<p162j4.C3399d.b> m7807h(p162j4.C3399d r5, java.util.UUID r6, boolean r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.f14729b0
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L9:
            int r3 = r5.f14729b0
            if (r2 >= r3) goto L39
            j4.d$b[] r3 = r5.f14726Y
            r3 = r3[r2]
            boolean r4 = r3.m7822a(r6)
            if (r4 != 0) goto L2a
            java.util.UUID r4 = p088f4.C2017j.f8966c
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L28
            java.util.UUID r4 = p088f4.C2017j.f8965b
            boolean r4 = r3.m7822a(r4)
            if (r4 == 0) goto L28
            goto L2a
        L28:
            r4 = 0
            goto L2b
        L2a:
            r4 = 1
        L2b:
            if (r4 == 0) goto L36
            byte[] r4 = r3.f14734c0
            if (r4 != 0) goto L33
            if (r7 == 0) goto L36
        L33:
            r0.add(r3)
        L36:
            int r2 = r2 + 1
            goto L9
        L39:
            return r0
    }

    @Override // p162j4.InterfaceC3405j
    /* renamed from: a */
    public p162j4.InterfaceC3405j.b mo7808a(android.os.Looper r2, p162j4.InterfaceC3403h.a r3, p088f4.C2003e0 r4) {
            r1 = this;
            int r0 = r1.f14705p
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            p371v5.C6549a.m13291e(r0)
            r1.m7814i(r2)
            j4.b$e r2 = new j4.b$e
            r2.<init>(r1, r3)
            android.os.Handler r3 = r1.f14710u
            java.util.Objects.requireNonNull(r3)
            a4.c r0 = new a4.c
            r0.<init>(r2, r4)
            r3.post(r0)
            return r2
    }

    @Override // p162j4.InterfaceC3405j
    /* renamed from: b */
    public p162j4.InterfaceC3400e mo7809b(android.os.Looper r3, p162j4.InterfaceC3403h.a r4, p088f4.C2003e0 r5) {
            r2 = this;
            int r0 = r2.f14705p
            r1 = 1
            if (r0 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            p371v5.C6549a.m13291e(r0)
            r2.m7814i(r3)
            j4.e r3 = r2.m7811d(r3, r4, r5, r1)
            return r3
    }

    @Override // p162j4.InterfaceC3405j
    /* renamed from: c */
    public int mo7810c(p088f4.C2003e0 r7) {
            r6 = this;
            j4.q r0 = r6.f14706q
            java.util.Objects.requireNonNull(r0)
            int r0 = r0.mo7849j()
            j4.d r1 = r7.f8899m0
            r2 = 0
            if (r1 != 0) goto L2b
            java.lang.String r7 = r7.f8896j0
            int r7 = p371v5.C6567q.m13377g(r7)
            int[] r1 = r6.f14696g
            int r3 = p371v5.C6552b0.f25624a
            r3 = 0
        L19:
            int r4 = r1.length
            r5 = -1
            if (r3 >= r4) goto L25
            r4 = r1[r3]
            if (r4 != r7) goto L22
            goto L26
        L22:
            int r3 = r3 + 1
            goto L19
        L25:
            r3 = -1
        L26:
            if (r3 == r5) goto L29
            goto L2a
        L29:
            r0 = 0
        L2a:
            return r0
        L2b:
            byte[] r7 = r6.f14712w
            r3 = 1
            if (r7 == 0) goto L31
            goto L9e
        L31:
            java.util.UUID r7 = r6.f14691b
            java.util.List r7 = m7807h(r1, r7, r3)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L71
            int r7 = r1.f14729b0
            if (r7 != r3) goto L9f
            j4.d$b[] r7 = r1.f14726Y
            r7 = r7[r2]
            java.util.UUID r4 = p088f4.C2017j.f8965b
            boolean r7 = r7.m7822a(r4)
            if (r7 == 0) goto L9f
            java.util.UUID r7 = r6.f14691b
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r4 = r7.length()
            int r4 = r4 + 72
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "DrmInitData only contains common PSSH SchemeData. Assuming support for: "
            r5.append(r4)
            r5.append(r7)
            java.lang.String r7 = r5.toString()
            java.lang.String r4 = "DefaultDrmSessionMgr"
            android.util.Log.w(r4, r7)
        L71:
            java.lang.String r7 = r1.f14728a0
            if (r7 == 0) goto L9e
            java.lang.String r1 = "cenc"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L7e
            goto L9e
        L7e:
            java.lang.String r1 = "cbcs"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L8d
            int r7 = p371v5.C6552b0.f25624a
            r1 = 25
            if (r7 < r1) goto L9f
            goto L9e
        L8d:
            java.lang.String r1 = "cbc1"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L9f
            java.lang.String r1 = "cens"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L9e
            goto L9f
        L9e:
            r2 = 1
        L9f:
            if (r2 == 0) goto La2
            goto La3
        La2:
            r0 = 1
        La3:
            return r0
    }

    /* renamed from: d */
    public final p162j4.InterfaceC3400e m7811d(android.os.Looper r6, p162j4.InterfaceC3403h.a r7, p088f4.C2003e0 r8, boolean r9) {
            r5 = this;
            j4.b$c r0 = r5.f14713x
            if (r0 != 0) goto Lb
            j4.b$c r0 = new j4.b$c
            r0.<init>(r5, r6)
            r5.f14713x = r0
        Lb:
            j4.d r6 = r8.f8899m0
            r0 = 0
            r1 = 0
            if (r6 != 0) goto L61
            java.lang.String r6 = r8.f8896j0
            int r6 = p371v5.C6567q.m13377g(r6)
            j4.q r7 = r5.f14706q
            java.util.Objects.requireNonNull(r7)
            int r8 = r7.mo7849j()
            r2 = 2
            r3 = 1
            if (r8 != r2) goto L2a
            boolean r8 = p162j4.C3413r.f14755d
            if (r8 == 0) goto L2a
            r8 = 1
            goto L2b
        L2a:
            r8 = 0
        L2b:
            if (r8 != 0) goto L60
            int[] r8 = r5.f14696g
            int r2 = p371v5.C6552b0.f25624a
        L31:
            int r2 = r8.length
            r4 = -1
            if (r1 >= r2) goto L3d
            r2 = r8[r1]
            if (r2 != r6) goto L3a
            goto L3e
        L3a:
            int r1 = r1 + 1
            goto L31
        L3d:
            r1 = -1
        L3e:
            if (r1 == r4) goto L60
            int r6 = r7.mo7849j()
            if (r6 != r3) goto L47
            goto L60
        L47:
            j4.a r6 = r5.f14707r
            if (r6 != 0) goto L5b
            b9.a<java.lang.Object> r6 = p026b9.AbstractC0714n.f3979Z
            b9.n<java.lang.Object> r6 = p026b9.C0693c0.f3898c0
            j4.a r6 = r5.m7813g(r6, r3, r0, r9)
            java.util.List<j4.a> r7 = r5.f14702m
            r7.add(r6)
            r5.f14707r = r6
            goto L5e
        L5b:
            r6.mo7792d(r0)
        L5e:
            j4.a r0 = r5.f14707r
        L60:
            return r0
        L61:
            byte[] r8 = r5.f14712w
            if (r8 != 0) goto L94
            java.util.UUID r8 = r5.f14691b
            java.util.List r6 = m7807h(r6, r8, r1)
            r8 = r6
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L95
            j4.b$d r6 = new j4.b$d
            java.util.UUID r8 = r5.f14691b
            r6.<init>(r8, r0)
            java.lang.String r8 = "DefaultDrmSessionMgr"
            java.lang.String r9 = "DRM error"
            p371v5.C6565o.m13369b(r8, r9, r6)
            if (r7 == 0) goto L87
            r7.m7827e(r6)
        L87:
            j4.p r7 = new j4.p
            j4.e$a r8 = new j4.e$a
            r9 = 6003(0x1773, float:8.412E-42)
            r8.<init>(r6, r9)
            r7.<init>(r8)
            return r7
        L94:
            r6 = r0
        L95:
            boolean r8 = r5.f14695f
            if (r8 != 0) goto L9c
            j4.a r0 = r5.f14708s
            goto Lb7
        L9c:
            java.util.List<j4.a> r8 = r5.f14702m
            java.util.Iterator r8 = r8.iterator()
        La2:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lb7
            java.lang.Object r2 = r8.next()
            j4.a r2 = (p162j4.C3396a) r2
            java.util.List<j4.d$b> r3 = r2.f14661a
            boolean r3 = p371v5.C6552b0.m13308a(r3, r6)
            if (r3 == 0) goto La2
            r0 = r2
        Lb7:
            if (r0 != 0) goto Lc9
            j4.a r0 = r5.m7813g(r6, r1, r7, r9)
            boolean r6 = r5.f14695f
            if (r6 != 0) goto Lc3
            r5.f14708s = r0
        Lc3:
            java.util.List<j4.a> r6 = r5.f14702m
            r6.add(r0)
            goto Lcc
        Lc9:
            r0.mo7792d(r7)
        Lcc:
            return r0
    }

    /* renamed from: f */
    public final p162j4.C3396a m7812f(java.util.List<p162j4.C3399d.b> r17, boolean r18, p162j4.InterfaceC3403h.a r19) {
            r16 = this;
            r0 = r16
            j4.q r1 = r0.f14706q
            java.util.Objects.requireNonNull(r1)
            boolean r1 = r0.f14697h
            r9 = r1 | r18
            j4.a r1 = new j4.a
            java.util.UUID r3 = r0.f14691b
            j4.q r4 = r0.f14706q
            j4.b$f r5 = r0.f14698i
            j4.b$g r6 = r0.f14700k
            int r8 = r0.f14711v
            byte[] r11 = r0.f14712w
            java.util.HashMap<java.lang.String, java.lang.String> r12 = r0.f14694e
            j4.x r13 = r0.f14693d
            android.os.Looper r14 = r0.f14709t
            java.util.Objects.requireNonNull(r14)
            u5.b0 r15 = r0.f14699j
            r2 = r1
            r7 = r17
            r10 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2 = r19
            r1.mo7792d(r2)
            long r2 = r0.f14701l
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L40
            r2 = 0
            r1.mo7792d(r2)
        L40:
            return r1
    }

    /* renamed from: g */
    public final p162j4.C3396a m7813g(java.util.List<p162j4.C3399d.b> r8, boolean r9, p162j4.InterfaceC3403h.a r10, boolean r11) {
            r7 = this;
            j4.a r0 = r7.m7812f(r8, r9, r10)
            boolean r1 = m7806e(r0)
            r2 = 0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L2b
            java.util.Set<j4.a> r1 = r7.f14704o
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L2b
            r7.m7816k()
            r0.mo7791c(r10)
            long r5 = r7.f14701l
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 == 0) goto L27
            r0.mo7791c(r2)
        L27:
            j4.a r0 = r7.m7812f(r8, r9, r10)
        L2b:
            boolean r1 = m7806e(r0)
            if (r1 == 0) goto L59
            if (r11 == 0) goto L59
            java.util.Set<j4.b$e> r11 = r7.f14703n
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L59
            r7.m7817l()
            java.util.Set<j4.a> r11 = r7.f14704o
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L49
            r7.m7816k()
        L49:
            r0.mo7791c(r10)
            long r5 = r7.f14701l
            int r11 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r11 == 0) goto L55
            r0.mo7791c(r2)
        L55:
            j4.a r0 = r7.m7812f(r8, r9, r10)
        L59:
            return r0
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    /* renamed from: i */
    public final synchronized void m7814i(android.os.Looper r2) {
            r1 = this;
            monitor-enter(r1)
            android.os.Looper r0 = r1.f14709t     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto Lf
            r1.f14709t = r2     // Catch: java.lang.Throwable -> L1e
            android.os.Handler r0 = new android.os.Handler     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1e
            r1.f14710u = r0     // Catch: java.lang.Throwable -> L1e
            goto L1c
        Lf:
            if (r0 != r2) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            p371v5.C6549a.m13291e(r2)     // Catch: java.lang.Throwable -> L1e
            android.os.Handler r2 = r1.f14710u     // Catch: java.lang.Throwable -> L1e
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Throwable -> L1e
        L1c:
            monitor-exit(r1)
            return
        L1e:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    /* renamed from: j */
    public final void m7815j() {
            r1 = this;
            j4.q r0 = r1.f14706q
            if (r0 == 0) goto L23
            int r0 = r1.f14705p
            if (r0 != 0) goto L23
            java.util.List<j4.a> r0 = r1.f14702m
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L23
            java.util.Set<j4.b$e> r0 = r1.f14703n
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L23
            j4.q r0 = r1.f14706q
            java.util.Objects.requireNonNull(r0)
            r0.release()
            r0 = 0
            r1.f14706q = r0
        L23:
            return
    }

    /* renamed from: k */
    public final void m7816k() {
            r3 = this;
            java.util.Set<j4.a> r0 = r3.f14704o
            b9.p r0 = p026b9.AbstractC0716p.m2326u(r0)
            b9.m0 r0 = r0.mo2270n()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            j4.e r1 = (p162j4.InterfaceC3400e) r1
            r2 = 0
            r1.mo7791c(r2)
            goto La
        L1b:
            return
    }

    /* renamed from: l */
    public final void m7817l() {
            r4 = this;
            java.util.Set<j4.b$e> r0 = r4.f14703n
            b9.p r0 = p026b9.AbstractC0716p.m2326u(r0)
            b9.m0 r0 = r0.mo2270n()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            j4.b$e r1 = (p162j4.C3397b.e) r1
            j4.b r2 = r1.f14719b0
            android.os.Handler r2 = r2.f14710u
            java.util.Objects.requireNonNull(r2)
            f1.f r3 = new f1.f
            r3.<init>(r1)
            p371v5.C6552b0.m13300D(r2, r3)
            goto La
        L26:
            return
    }

    @Override // p162j4.InterfaceC3405j
    /* renamed from: o */
    public final void mo7818o() {
            r6 = this;
            int r0 = r6.f14705p
            int r1 = r0 + 1
            r6.f14705p = r1
            if (r0 == 0) goto L9
            return
        L9:
            j4.q r0 = r6.f14706q
            r1 = 0
            if (r0 != 0) goto L21
            j4.q$c r0 = r6.f14692c
            java.util.UUID r2 = r6.f14691b
            j4.q r0 = r0.mo7852a(r2)
            r6.f14706q = r0
            j4.b$b r2 = new j4.b$b
            r2.<init>(r6, r1)
            r0.mo7840a(r2)
            goto L43
        L21:
            long r2 = r6.f14701l
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L43
            r0 = 0
        L2d:
            java.util.List<j4.a> r2 = r6.f14702m
            int r2 = r2.size()
            if (r0 >= r2) goto L43
            java.util.List<j4.a> r2 = r6.f14702m
            java.lang.Object r2 = r2.get(r0)
            j4.a r2 = (p162j4.C3396a) r2
            r2.mo7792d(r1)
            int r0 = r0 + 1
            goto L2d
        L43:
            return
    }

    @Override // p162j4.InterfaceC3405j
    public final void release() {
            r5 = this;
            int r0 = r5.f14705p
            int r0 = r0 + (-1)
            r5.f14705p = r0
            if (r0 == 0) goto L9
            return
        L9:
            long r0 = r5.f14701l
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L2f
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<j4.a> r1 = r5.f14702m
            r0.<init>(r1)
            r1 = 0
        L1c:
            int r2 = r0.size()
            if (r1 >= r2) goto L2f
            java.lang.Object r2 = r0.get(r1)
            j4.a r2 = (p162j4.C3396a) r2
            r3 = 0
            r2.mo7791c(r3)
            int r1 = r1 + 1
            goto L1c
        L2f:
            r5.m7817l()
            r5.m7815j()
            return
    }
}
