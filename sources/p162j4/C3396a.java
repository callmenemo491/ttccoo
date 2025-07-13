package p162j4;

/* renamed from: j4.a */
/* loaded from: classes.dex */
public class C3396a implements p162j4.InterfaceC3400e {

    /* renamed from: a */
    public final java.util.List<p162j4.C3399d.b> f14661a;

    /* renamed from: b */
    public final p162j4.InterfaceC3412q f14662b;

    /* renamed from: c */
    public final p162j4.C3396a.a f14663c;

    /* renamed from: d */
    public final p162j4.C3396a.b f14664d;

    /* renamed from: e */
    public final int f14665e;

    /* renamed from: f */
    public final boolean f14666f;

    /* renamed from: g */
    public final boolean f14667g;

    /* renamed from: h */
    public final java.util.HashMap<java.lang.String, java.lang.String> f14668h;

    /* renamed from: i */
    public final p371v5.C6559i<p162j4.InterfaceC3403h.a> f14669i;

    /* renamed from: j */
    public final p352u5.InterfaceC6307b0 f14670j;

    /* renamed from: k */
    public final p162j4.InterfaceC3419x f14671k;

    /* renamed from: l */
    public final java.util.UUID f14672l;

    /* renamed from: m */
    public final p162j4.C3396a.e f14673m;

    /* renamed from: n */
    public int f14674n;

    /* renamed from: o */
    public int f14675o;

    /* renamed from: p */
    public android.os.HandlerThread f14676p;

    /* renamed from: q */
    public p162j4.C3396a.c f14677q;

    /* renamed from: r */
    public p142i4.InterfaceC3068b f14678r;

    /* renamed from: s */
    public p162j4.InterfaceC3400e.a f14679s;

    /* renamed from: t */
    public byte[] f14680t;

    /* renamed from: u */
    public byte[] f14681u;

    /* renamed from: v */
    public p162j4.InterfaceC3412q.a f14682v;

    /* renamed from: w */
    public p162j4.InterfaceC3412q.d f14683w;

    /* renamed from: j4.a$a */
    public interface a {
    }

    /* renamed from: j4.a$b */
    public interface b {
    }

    @android.annotation.SuppressLint({"HandlerLeak"})
    /* renamed from: j4.a$c */
    public class c extends android.os.Handler {

        /* renamed from: a */
        public boolean f14684a;

        /* renamed from: b */
        public final /* synthetic */ p162j4.C3396a f14685b;

        public c(p162j4.C3396a r1, android.os.Looper r2) {
                r0 = this;
                r0.f14685b = r1
                r0.<init>(r2)
                return
        }

        /* renamed from: a */
        public void m7805a(int r9, java.lang.Object r10, boolean r11) {
                r8 = this;
                j4.a$d r7 = new j4.a$d
                java.util.concurrent.atomic.AtomicLong r0 = p108g5.C2276k.f10386b
                long r1 = r0.getAndIncrement()
                long r4 = android.os.SystemClock.elapsedRealtime()
                r0 = r7
                r3 = r11
                r6 = r10
                r0.<init>(r1, r3, r4, r6)
                android.os.Message r9 = r8.obtainMessage(r9, r7)
                r9.sendToTarget()
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r11) {
                r10 = this;
                java.lang.Object r0 = r11.obj
                j4.a$d r0 = (p162j4.C3396a.d) r0
                r1 = 1
                int r2 = r11.what     // Catch: p162j4.C3420y -> L1d java.lang.Exception -> L37
                if (r2 == 0) goto L25
                if (r2 != r1) goto L1f
                j4.a r2 = r10.f14685b     // Catch: p162j4.C3420y -> L1d java.lang.Exception -> L37
                j4.x r3 = r2.f14671k     // Catch: p162j4.C3420y -> L1d java.lang.Exception -> L37
                java.util.UUID r2 = r2.f14672l     // Catch: p162j4.C3420y -> L1d java.lang.Exception -> L37
                java.lang.Object r4 = r0.f14688c     // Catch: p162j4.C3420y -> L1d java.lang.Exception -> L37
                j4.q$a r4 = (p162j4.InterfaceC3412q.a) r4     // Catch: p162j4.C3420y -> L1d java.lang.Exception -> L37
                j4.v r3 = (p162j4.C3417v) r3     // Catch: p162j4.C3420y -> L1d java.lang.Exception -> L37
                byte[] r1 = r3.m7855a(r2, r4)     // Catch: p162j4.C3420y -> L1d java.lang.Exception -> L37
                goto Ldf
            L1d:
                r2 = move-exception
                goto L41
            L1f:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: p162j4.C3420y -> L1d java.lang.Exception -> L37
                r2.<init>()     // Catch: p162j4.C3420y -> L1d java.lang.Exception -> L37
                throw r2     // Catch: p162j4.C3420y -> L1d java.lang.Exception -> L37
            L25:
                j4.a r2 = r10.f14685b     // Catch: p162j4.C3420y -> L1d java.lang.Exception -> L37
                j4.x r3 = r2.f14671k     // Catch: p162j4.C3420y -> L1d java.lang.Exception -> L37
                java.util.UUID r2 = r2.f14672l     // Catch: p162j4.C3420y -> L1d java.lang.Exception -> L37
                java.lang.Object r4 = r0.f14688c     // Catch: p162j4.C3420y -> L1d java.lang.Exception -> L37
                j4.q$d r4 = (p162j4.InterfaceC3412q.d) r4     // Catch: p162j4.C3420y -> L1d java.lang.Exception -> L37
                j4.v r3 = (p162j4.C3417v) r3     // Catch: p162j4.C3420y -> L1d java.lang.Exception -> L37
                byte[] r1 = r3.m7856c(r2, r4)     // Catch: p162j4.C3420y -> L1d java.lang.Exception -> L37
                goto Ldf
            L37:
                r1 = move-exception
                java.lang.String r2 = "DefaultDrmSession"
                java.lang.String r3 = "Key/provisioning request produced an unexpected exception. Not retrying."
                p371v5.C6565o.m13370c(r2, r3, r1)
                goto Ldf
            L41:
                java.lang.Object r3 = r11.obj
                j4.a$d r3 = (p162j4.C3396a.d) r3
                boolean r4 = r3.f14687b
                r5 = 0
                if (r4 != 0) goto L4d
            L4a:
                r1 = 0
                goto Ldb
            L4d:
                int r4 = r3.f14689d
                int r4 = r4 + r1
                r3.f14689d = r4
                j4.a r6 = r10.f14685b
                u5.b0 r6 = r6.f14670j
                u5.s r6 = (p352u5.C6330s) r6
                r7 = 3
                int r6 = r6.m12982a(r7)
                if (r4 <= r6) goto L60
                goto L4a
            L60:
                g5.k r4 = new g5.k
                android.os.SystemClock.elapsedRealtime()
                android.os.SystemClock.elapsedRealtime()
                java.lang.Throwable r4 = r2.getCause()
                boolean r4 = r4 instanceof java.io.IOException
                if (r4 == 0) goto L77
                java.lang.Throwable r4 = r2.getCause()
                java.io.IOException r4 = (java.io.IOException) r4
                goto L80
            L77:
                j4.a$f r4 = new j4.a$f
                java.lang.Throwable r6 = r2.getCause()
                r4.<init>(r6)
            L80:
                j4.a r6 = r10.f14685b
                u5.b0 r6 = r6.f14670j
                int r3 = r3.f14689d
                u5.s r6 = (p352u5.C6330s) r6
                boolean r6 = r4 instanceof p088f4.C2044s0
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                if (r6 != 0) goto Lc4
                boolean r6 = r4 instanceof java.io.FileNotFoundException
                if (r6 != 0) goto Lc4
                boolean r6 = r4 instanceof p352u5.C6332u
                if (r6 != 0) goto Lc4
                boolean r6 = r4 instanceof p352u5.C6309c0.h
                if (r6 != 0) goto Lc4
                int r6 = p352u5.C6321j.f24696Z
            L9f:
                if (r4 == 0) goto Lb5
                boolean r6 = r4 instanceof p352u5.C6321j
                if (r6 == 0) goto Lb0
                r6 = r4
                u5.j r6 = (p352u5.C6321j) r6
                int r6 = r6.f24697Y
                r9 = 2008(0x7d8, float:2.814E-42)
                if (r6 != r9) goto Lb0
                r4 = 1
                goto Lb6
            Lb0:
                java.lang.Throwable r4 = r4.getCause()
                goto L9f
            Lb5:
                r4 = 0
            Lb6:
                if (r4 == 0) goto Lb9
                goto Lc4
            Lb9:
                int r3 = r3 - r1
                int r3 = r3 * 1000
                r4 = 5000(0x1388, float:7.006E-42)
                int r3 = java.lang.Math.min(r3, r4)
                long r3 = (long) r3
                goto Lc5
            Lc4:
                r3 = r7
            Lc5:
                int r6 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r6 != 0) goto Lca
                goto L4a
            Lca:
                monitor-enter(r10)
                boolean r6 = r10.f14684a     // Catch: java.lang.Throwable -> L105
                if (r6 != 0) goto Ld8
                android.os.Message r5 = android.os.Message.obtain(r11)     // Catch: java.lang.Throwable -> L105
                r10.sendMessageDelayed(r5, r3)     // Catch: java.lang.Throwable -> L105
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L105
                goto Ldb
            Ld8:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L105
                goto L4a
            Ldb:
                if (r1 == 0) goto Lde
                return
            Lde:
                r1 = r2
            Ldf:
                j4.a r2 = r10.f14685b
                u5.b0 r2 = r2.f14670j
                long r3 = r0.f14686a
                java.util.Objects.requireNonNull(r2)
                monitor-enter(r10)
                boolean r2 = r10.f14684a     // Catch: java.lang.Throwable -> L102
                if (r2 != 0) goto L100
                j4.a r2 = r10.f14685b     // Catch: java.lang.Throwable -> L102
                j4.a$e r2 = r2.f14673m     // Catch: java.lang.Throwable -> L102
                int r11 = r11.what     // Catch: java.lang.Throwable -> L102
                java.lang.Object r0 = r0.f14688c     // Catch: java.lang.Throwable -> L102
                android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch: java.lang.Throwable -> L102
                android.os.Message r11 = r2.obtainMessage(r11, r0)     // Catch: java.lang.Throwable -> L102
                r11.sendToTarget()     // Catch: java.lang.Throwable -> L102
            L100:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L102
                return
            L102:
                r11 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L102
                throw r11
            L105:
                r11 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L105
                throw r11
        }
    }

    /* renamed from: j4.a$d */
    public static final class d {

        /* renamed from: a */
        public final long f14686a;

        /* renamed from: b */
        public final boolean f14687b;

        /* renamed from: c */
        public final java.lang.Object f14688c;

        /* renamed from: d */
        public int f14689d;

        public d(long r1, boolean r3, long r4, java.lang.Object r6) {
                r0 = this;
                r0.<init>()
                r0.f14686a = r1
                r0.f14687b = r3
                r0.f14688c = r6
                return
        }
    }

    @android.annotation.SuppressLint({"HandlerLeak"})
    /* renamed from: j4.a$e */
    public class e extends android.os.Handler {

        /* renamed from: a */
        public final /* synthetic */ p162j4.C3396a f14690a;

        public e(p162j4.C3396a r1, android.os.Looper r2) {
                r0 = this;
                r0.f14690a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r8) {
                r7 = this;
                java.lang.Object r0 = r8.obj
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r1 = r0.first
                java.lang.Object r0 = r0.second
                int r8 = r8.what
                r2 = 0
                r3 = 0
                r4 = 2
                r5 = 1
                if (r8 == 0) goto L85
                if (r8 == r5) goto L14
                goto Le0
            L14:
                j4.a r8 = r7.f14690a
                j4.q$a r6 = r8.f14682v
                if (r1 != r6) goto Le0
                boolean r1 = r8.m7798j()
                if (r1 != 0) goto L22
                goto Le0
            L22:
                r8.f14682v = r3
                boolean r1 = r0 instanceof java.lang.Exception
                if (r1 == 0) goto L2f
                java.lang.Exception r0 = (java.lang.Exception) r0
                r8.m7800l(r0, r2)
                goto Le0
            L2f:
                byte[] r0 = (byte[]) r0     // Catch: java.lang.Exception -> L80
                int r1 = r8.f14665e     // Catch: java.lang.Exception -> L80
                r2 = 3
                if (r1 != r2) goto L5e
                j4.q r1 = r8.f14662b     // Catch: java.lang.Exception -> L80
                byte[] r2 = r8.f14681u     // Catch: java.lang.Exception -> L80
                int r3 = p371v5.C6552b0.f25624a     // Catch: java.lang.Exception -> L80
                r1.mo7845f(r2, r0)     // Catch: java.lang.Exception -> L80
                v5.i<j4.h$a> r0 = r8.f14669i     // Catch: java.lang.Exception -> L80
                java.lang.Object r1 = r0.f25644Y     // Catch: java.lang.Exception -> L80
                monitor-enter(r1)     // Catch: java.lang.Exception -> L80
                java.util.Set<E> r0 = r0.f25646a0     // Catch: java.lang.Throwable -> L5b
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L5b
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L80
            L4b:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L80
                if (r1 == 0) goto Le0
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L80
                j4.h$a r1 = (p162j4.InterfaceC3403h.a) r1     // Catch: java.lang.Exception -> L80
                r1.m7824b()     // Catch: java.lang.Exception -> L80
                goto L4b
            L5b:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L5b
                throw r0     // Catch: java.lang.Exception -> L80
            L5e:
                j4.q r1 = r8.f14662b     // Catch: java.lang.Exception -> L80
                byte[] r2 = r8.f14680t     // Catch: java.lang.Exception -> L80
                byte[] r0 = r1.mo7845f(r2, r0)     // Catch: java.lang.Exception -> L80
                int r1 = r8.f14665e     // Catch: java.lang.Exception -> L80
                if (r1 == r4) goto L70
                if (r1 != 0) goto L77
                byte[] r1 = r8.f14681u     // Catch: java.lang.Exception -> L80
                if (r1 == 0) goto L77
            L70:
                if (r0 == 0) goto L77
                int r1 = r0.length     // Catch: java.lang.Exception -> L80
                if (r1 == 0) goto L77
                r8.f14681u = r0     // Catch: java.lang.Exception -> L80
            L77:
                r0 = 4
                r8.f14674n = r0     // Catch: java.lang.Exception -> L80
                k1.d r0 = p179k1.C3646d.f16120i0     // Catch: java.lang.Exception -> L80
                r8.m7796h(r0)     // Catch: java.lang.Exception -> L80
                goto Le0
            L80:
                r0 = move-exception
                r8.m7800l(r0, r5)
                goto Le0
            L85:
                j4.a r8 = r7.f14690a
                j4.q$d r6 = r8.f14683w
                if (r1 != r6) goto Le0
                int r1 = r8.f14674n
                if (r1 == r4) goto L96
                boolean r1 = r8.m7798j()
                if (r1 != 0) goto L96
                goto Le0
            L96:
                r8.f14683w = r3
                boolean r1 = r0 instanceof java.lang.Exception
                if (r1 == 0) goto La6
                j4.a$a r8 = r8.f14663c
                java.lang.Exception r0 = (java.lang.Exception) r0
                j4.b$f r8 = (p162j4.C3397b.f) r8
                r8.m7819a(r0, r2)
                goto Le0
            La6:
                j4.q r1 = r8.f14662b     // Catch: java.lang.Exception -> Ld8
                byte[] r0 = (byte[]) r0     // Catch: java.lang.Exception -> Ld8
                r1.mo7847h(r0)     // Catch: java.lang.Exception -> Ld8
                j4.a$a r8 = r8.f14663c
                j4.b$f r8 = (p162j4.C3397b.f) r8
                r8.f14721b = r3
                java.util.Set<j4.a> r0 = r8.f14720a
                b9.n r0 = p026b9.AbstractC0714n.m2311w(r0)
                java.util.Set<j4.a> r8 = r8.f14720a
                r8.clear()
                b9.a r8 = r0.m2313A()
            Lc2:
                boolean r0 = r8.hasNext()
                if (r0 == 0) goto Le0
                java.lang.Object r0 = r8.next()
                j4.a r0 = (p162j4.C3396a) r0
                boolean r1 = r0.m7801m()
                if (r1 == 0) goto Lc2
                r0.m7797i(r5)
                goto Lc2
            Ld8:
                r0 = move-exception
                j4.a$a r8 = r8.f14663c
                j4.b$f r8 = (p162j4.C3397b.f) r8
                r8.m7819a(r0, r5)
            Le0:
                return
        }
    }

    /* renamed from: j4.a$f */
    public static final class f extends java.io.IOException {
        public f(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public C3396a(java.util.UUID r2, p162j4.InterfaceC3412q r3, p162j4.C3396a.a r4, p162j4.C3396a.b r5, java.util.List<p162j4.C3399d.b> r6, int r7, boolean r8, boolean r9, byte[] r10, java.util.HashMap<java.lang.String, java.lang.String> r11, p162j4.InterfaceC3419x r12, android.os.Looper r13, p352u5.InterfaceC6307b0 r14) {
            r1 = this;
            r1.<init>()
            r0 = 1
            if (r7 == r0) goto L9
            r0 = 3
            if (r7 != r0) goto Lc
        L9:
            java.util.Objects.requireNonNull(r10)
        Lc:
            r1.f14672l = r2
            r1.f14663c = r4
            r1.f14664d = r5
            r1.f14662b = r3
            r1.f14665e = r7
            r1.f14666f = r8
            r1.f14667g = r9
            if (r10 == 0) goto L20
            r1.f14681u = r10
            r2 = 0
            goto L27
        L20:
            java.util.Objects.requireNonNull(r6)
            java.util.List r2 = java.util.Collections.unmodifiableList(r6)
        L27:
            r1.f14661a = r2
            r1.f14668h = r11
            r1.f14671k = r12
            v5.i r2 = new v5.i
            r2.<init>()
            r1.f14669i = r2
            r1.f14670j = r14
            r2 = 2
            r1.f14674n = r2
            j4.a$e r2 = new j4.a$e
            r2.<init>(r1, r13)
            r1.f14673m = r2
            return
    }

    @Override // p162j4.InterfaceC3400e
    /* renamed from: a */
    public boolean mo7789a() {
            r1 = this;
            boolean r0 = r1.f14666f
            return r0
    }

    @Override // p162j4.InterfaceC3400e
    /* renamed from: b */
    public final java.util.UUID mo7790b() {
            r1 = this;
            java.util.UUID r0 = r1.f14672l
            return r0
    }

    @Override // p162j4.InterfaceC3400e
    /* renamed from: c */
    public void mo7791c(p162j4.InterfaceC3403h.a r9) {
            r8 = this;
            int r0 = r8.f14675o
            if (r0 > 0) goto Lc
            java.lang.String r9 = "DefaultDrmSession"
            java.lang.String r0 = "release() called on a session that's already fully released."
            android.util.Log.e(r9, r0)
            return
        Lc:
            r1 = 1
            int r0 = r0 - r1
            r8.f14675o = r0
            r2 = 0
            if (r0 != 0) goto L46
            r0 = 0
            r8.f14674n = r0
            j4.a$e r0 = r8.f14673m
            int r3 = p371v5.C6552b0.f25624a
            r0.removeCallbacksAndMessages(r2)
            j4.a$c r0 = r8.f14677q
            monitor-enter(r0)
            r0.removeCallbacksAndMessages(r2)     // Catch: java.lang.Throwable -> L43
            r0.f14684a = r1     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            r8.f14677q = r2
            android.os.HandlerThread r0 = r8.f14676p
            r0.quit()
            r8.f14676p = r2
            r8.f14678r = r2
            r8.f14679s = r2
            r8.f14682v = r2
            r8.f14683w = r2
            byte[] r0 = r8.f14680t
            if (r0 == 0) goto L46
            j4.q r3 = r8.f14662b
            r3.mo7844e(r0)
            r8.f14680t = r2
            goto L46
        L43:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        L46:
            if (r9 == 0) goto La3
            v5.i<j4.h$a> r0 = r8.f14669i
            java.lang.Object r3 = r0.f25644Y
            monitor-enter(r3)
            java.util.Map<E, java.lang.Integer> r4 = r0.f25645Z     // Catch: java.lang.Throwable -> La0
            java.lang.Object r4 = r4.get(r9)     // Catch: java.lang.Throwable -> La0
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> La0
            if (r4 != 0) goto L59
        L57:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La0
            goto L94
        L59:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La0
            java.util.List<E> r6 = r0.f25647b0     // Catch: java.lang.Throwable -> La0
            r5.<init>(r6)     // Catch: java.lang.Throwable -> La0
            r5.remove(r9)     // Catch: java.lang.Throwable -> La0
            java.util.List r5 = java.util.Collections.unmodifiableList(r5)     // Catch: java.lang.Throwable -> La0
            r0.f25647b0 = r5     // Catch: java.lang.Throwable -> La0
            int r5 = r4.intValue()     // Catch: java.lang.Throwable -> La0
            if (r5 != r1) goto L85
            java.util.Map<E, java.lang.Integer> r4 = r0.f25645Z     // Catch: java.lang.Throwable -> La0
            r4.remove(r9)     // Catch: java.lang.Throwable -> La0
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Throwable -> La0
            java.util.Set<E> r5 = r0.f25646a0     // Catch: java.lang.Throwable -> La0
            r4.<init>(r5)     // Catch: java.lang.Throwable -> La0
            r4.remove(r9)     // Catch: java.lang.Throwable -> La0
            java.util.Set r4 = java.util.Collections.unmodifiableSet(r4)     // Catch: java.lang.Throwable -> La0
            r0.f25646a0 = r4     // Catch: java.lang.Throwable -> La0
            goto L57
        L85:
            java.util.Map<E, java.lang.Integer> r0 = r0.f25645Z     // Catch: java.lang.Throwable -> La0
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> La0
            int r4 = r4 - r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> La0
            r0.put(r9, r4)     // Catch: java.lang.Throwable -> La0
            goto L57
        L94:
            v5.i<j4.h$a> r0 = r8.f14669i
            int r0 = r0.m13344a(r9)
            if (r0 != 0) goto La3
            r9.m7828f()
            goto La3
        La0:
            r9 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La0
            throw r9
        La3:
            j4.a$b r9 = r8.f14664d
            int r0 = r8.f14675o
            j4.b$g r9 = (p162j4.C3397b.g) r9
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != r1) goto Lda
            j4.b r1 = r9.f14722a
            int r5 = r1.f14705p
            if (r5 <= 0) goto Lda
            long r5 = r1.f14701l
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto Lda
            java.util.Set<j4.a> r0 = r1.f14704o
            r0.add(r8)
            j4.b r0 = r9.f14722a
            android.os.Handler r0 = r0.f14710u
            java.util.Objects.requireNonNull(r0)
            f1.f r1 = new f1.f
            r1.<init>(r8)
            long r2 = android.os.SystemClock.uptimeMillis()
            j4.b r4 = r9.f14722a
            long r4 = r4.f14701l
            long r2 = r2 + r4
            r0.postAtTime(r1, r8, r2)
            goto L12e
        Lda:
            if (r0 != 0) goto L12e
            j4.b r0 = r9.f14722a
            java.util.List<j4.a> r0 = r0.f14702m
            r0.remove(r8)
            j4.b r0 = r9.f14722a
            j4.a r1 = r0.f14707r
            if (r1 != r8) goto Leb
            r0.f14707r = r2
        Leb:
            j4.a r1 = r0.f14708s
            if (r1 != r8) goto Lf1
            r0.f14708s = r2
        Lf1:
            j4.b$f r0 = r0.f14698i
            java.util.Set<j4.a> r1 = r0.f14720a
            r1.remove(r8)
            j4.a r1 = r0.f14721b
            if (r1 != r8) goto L117
            r0.f14721b = r2
            java.util.Set<j4.a> r1 = r0.f14720a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L117
            java.util.Set<j4.a> r1 = r0.f14720a
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            j4.a r1 = (p162j4.C3396a) r1
            r0.f14721b = r1
            r1.m7803o()
        L117:
            j4.b r0 = r9.f14722a
            long r1 = r0.f14701l
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L12e
            android.os.Handler r0 = r0.f14710u
            java.util.Objects.requireNonNull(r0)
            r0.removeCallbacksAndMessages(r8)
            j4.b r0 = r9.f14722a
            java.util.Set<j4.a> r0 = r0.f14704o
            r0.remove(r8)
        L12e:
            j4.b r9 = r9.f14722a
            r9.m7815j()
            return
    }

    @Override // p162j4.InterfaceC3400e
    /* renamed from: d */
    public void mo7792d(p162j4.InterfaceC3403h.a r8) {
            r7 = this;
            int r0 = r7.f14675o
            r1 = 0
            if (r0 >= 0) goto L1f
            java.lang.String r2 = "DefaultDrmSession"
            r3 = 51
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Session reference count less than zero: "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.e(r2, r0)
            r7.f14675o = r1
        L1f:
            r0 = 1
            if (r8 == 0) goto L68
            v5.i<j4.h$a> r2 = r7.f14669i
            java.lang.Object r3 = r2.f25644Y
            monitor-enter(r3)
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L65
            java.util.List<E> r5 = r2.f25647b0     // Catch: java.lang.Throwable -> L65
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L65
            r4.add(r8)     // Catch: java.lang.Throwable -> L65
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)     // Catch: java.lang.Throwable -> L65
            r2.f25647b0 = r4     // Catch: java.lang.Throwable -> L65
            java.util.Map<E, java.lang.Integer> r4 = r2.f25645Z     // Catch: java.lang.Throwable -> L65
            java.lang.Object r4 = r4.get(r8)     // Catch: java.lang.Throwable -> L65
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L65
            if (r4 != 0) goto L51
            java.util.HashSet r5 = new java.util.HashSet     // Catch: java.lang.Throwable -> L65
            java.util.Set<E> r6 = r2.f25646a0     // Catch: java.lang.Throwable -> L65
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L65
            r5.add(r8)     // Catch: java.lang.Throwable -> L65
            java.util.Set r5 = java.util.Collections.unmodifiableSet(r5)     // Catch: java.lang.Throwable -> L65
            r2.f25646a0 = r5     // Catch: java.lang.Throwable -> L65
        L51:
            java.util.Map<E, java.lang.Integer> r2 = r2.f25645Z     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L5b
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L65
            int r4 = r4 + r0
            goto L5c
        L5b:
            r4 = 1
        L5c:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L65
            r2.put(r8, r4)     // Catch: java.lang.Throwable -> L65
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L65
            goto L68
        L65:
            r8 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L65
            throw r8
        L68:
            int r2 = r7.f14675o
            int r2 = r2 + r0
            r7.f14675o = r2
            if (r2 != r0) goto L9b
            int r8 = r7.f14674n
            r2 = 2
            if (r8 != r2) goto L75
            r1 = 1
        L75:
            p371v5.C6549a.m13291e(r1)
            android.os.HandlerThread r8 = new android.os.HandlerThread
            java.lang.String r1 = "ExoPlayer:DrmRequestHandler"
            r8.<init>(r1)
            r7.f14676p = r8
            r8.start()
            j4.a$c r8 = new j4.a$c
            android.os.HandlerThread r1 = r7.f14676p
            android.os.Looper r1 = r1.getLooper()
            r8.<init>(r7, r1)
            r7.f14677q = r8
            boolean r8 = r7.m7801m()
            if (r8 == 0) goto Lb0
            r7.m7797i(r0)
            goto Lb0
        L9b:
            if (r8 == 0) goto Lb0
            boolean r1 = r7.m7798j()
            if (r1 == 0) goto Lb0
            v5.i<j4.h$a> r1 = r7.f14669i
            int r1 = r1.m13344a(r8)
            if (r1 != r0) goto Lb0
            int r0 = r7.f14674n
            r8.m7826d(r0)
        Lb0:
            j4.a$b r8 = r7.f14664d
            j4.b$g r8 = (p162j4.C3397b.g) r8
            j4.b r0 = r8.f14722a
            long r1 = r0.f14701l
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto Ld0
            java.util.Set<j4.a> r0 = r0.f14704o
            r0.remove(r7)
            j4.b r8 = r8.f14722a
            android.os.Handler r8 = r8.f14710u
            java.util.Objects.requireNonNull(r8)
            r8.removeCallbacksAndMessages(r7)
        Ld0:
            return
    }

    @Override // p162j4.InterfaceC3400e
    /* renamed from: e */
    public boolean mo7793e(java.lang.String r3) {
            r2 = this;
            j4.q r0 = r2.f14662b
            byte[] r1 = r2.f14680t
            p371v5.C6549a.m13292f(r1)
            byte[] r1 = (byte[]) r1
            boolean r3 = r0.mo7841b(r1, r3)
            return r3
    }

    @Override // p162j4.InterfaceC3400e
    /* renamed from: f */
    public final p162j4.InterfaceC3400e.a mo7794f() {
            r2 = this;
            int r0 = r2.f14674n
            r1 = 1
            if (r0 != r1) goto L8
            j4.e$a r0 = r2.f14679s
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // p162j4.InterfaceC3400e
    /* renamed from: g */
    public final p142i4.InterfaceC3068b mo7795g() {
            r1 = this;
            i4.b r0 = r1.f14678r
            return r0
    }

    @Override // p162j4.InterfaceC3400e
    public final int getState() {
            r1 = this;
            int r0 = r1.f14674n
            return r0
    }

    /* renamed from: h */
    public final void m7796h(p371v5.InterfaceC6558h<p162j4.InterfaceC3403h.a> r3) {
            r2 = this;
            v5.i<j4.h$a> r0 = r2.f14669i
            java.lang.Object r1 = r0.f25644Y
            monitor-enter(r1)
            java.util.Set<E> r0 = r0.f25646a0     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            j4.h$a r1 = (p162j4.InterfaceC3403h.a) r1
            r3.mo2143a(r1)
            goto Lc
        L1c:
            return
        L1d:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sessionId"})
    /* renamed from: i */
    public final void m7797i(boolean r10) {
            r9 = this;
            boolean r0 = r9.f14667g
            if (r0 == 0) goto L5
            return
        L5:
            byte[] r0 = r9.f14680t
            int r1 = p371v5.C6552b0.f25624a
            int r1 = r9.f14665e
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L3d
            if (r1 == r4) goto L3d
            if (r1 == r3) goto L2a
            r0 = 3
            if (r1 == r0) goto L19
            goto L10b
        L19:
            byte[] r1 = r9.f14681u
            java.util.Objects.requireNonNull(r1)
            byte[] r1 = r9.f14680t
            java.util.Objects.requireNonNull(r1)
            byte[] r1 = r9.f14681u
            r9.m7802n(r1, r0, r10)
            goto L10b
        L2a:
            byte[] r1 = r9.f14681u
            if (r1 == 0) goto Lda
            j4.q r5 = r9.f14662b     // Catch: java.lang.Exception -> L35
            r5.mo7842c(r0, r1)     // Catch: java.lang.Exception -> L35
            r2 = 1
            goto L39
        L35:
            r1 = move-exception
            r9.m7799k(r1, r4)
        L39:
            if (r2 == 0) goto L10b
            goto Lda
        L3d:
            byte[] r1 = r9.f14681u
            if (r1 != 0) goto L46
            r9.m7802n(r0, r4, r10)
            goto L10b
        L46:
            int r5 = r9.f14674n
            r6 = 4
            if (r5 == r6) goto L58
            j4.q r5 = r9.f14662b     // Catch: java.lang.Exception -> L52
            r5.mo7842c(r0, r1)     // Catch: java.lang.Exception -> L52
            r2 = 1
            goto L56
        L52:
            r1 = move-exception
            r9.m7799k(r1, r4)
        L56:
            if (r2 == 0) goto L10b
        L58:
            java.util.UUID r1 = p088f4.C2017j.f8967d
            java.util.UUID r2 = r9.f14672l
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L68
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto Lb8
        L68:
            java.util.Map r1 = r9.m7804p()
            if (r1 != 0) goto L70
            r1 = 0
            goto La1
        L70:
            android.util.Pair r2 = new android.util.Pair
            java.lang.String r4 = "LicenseDurationRemaining"
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.NumberFormatException -> L86
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.NumberFormatException -> L86
            if (r4 == 0) goto L86
            long r4 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NumberFormatException -> L86
            goto L87
        L86:
            r4 = r7
        L87:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "PlaybackDurationRemaining"
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.NumberFormatException -> L99
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L99
            if (r1 == 0) goto L99
            long r7 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L99
        L99:
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r2.<init>(r4, r1)
            r1 = r2
        La1:
            java.util.Objects.requireNonNull(r1)
            java.lang.Object r2 = r1.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r1 = java.lang.Math.min(r4, r1)
        Lb8:
            int r4 = r9.f14665e
            if (r4 != 0) goto Lde
            r4 = 60
            int r7 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r7 > 0) goto Lde
            java.lang.String r4 = "DefaultDrmSession"
            r5 = 88
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Offline license has expired or will expire soon. Remaining seconds: "
            r6.append(r5)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            android.util.Log.d(r4, r1)
        Lda:
            r9.m7802n(r0, r3, r10)
            goto L10b
        Lde:
            r4 = 0
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 > 0) goto Led
            j4.w r10 = new j4.w
            r10.<init>()
            r9.m7799k(r10, r3)
            goto L10b
        Led:
            r9.f14674n = r6
            v5.i<j4.h$a> r10 = r9.f14669i
            java.lang.Object r0 = r10.f25644Y
            monitor-enter(r0)
            java.util.Set<E> r10 = r10.f25646a0     // Catch: java.lang.Throwable -> L10c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10c
            java.util.Iterator r10 = r10.iterator()
        Lfb:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L10b
            java.lang.Object r0 = r10.next()
            j4.h$a r0 = (p162j4.InterfaceC3403h.a) r0
            r0.m7825c()
            goto Lfb
        L10b:
            return
        L10c:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10c
            throw r10
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* renamed from: j */
    public final boolean m7798j() {
            r2 = this;
            int r0 = r2.f14674n
            r1 = 3
            if (r0 == r1) goto Lb
            r1 = 4
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    /* renamed from: k */
    public final void m7799k(java.lang.Exception r8, int r9) {
            r7 = this;
            j4.e$a r0 = new j4.e$a
            int r1 = p371v5.C6552b0.f25624a
            r2 = 21
            r3 = 1
            if (r1 < r2) goto L14
            boolean r2 = p162j4.C3408m.m7837a(r8)
            if (r2 == 0) goto L14
            int r9 = p162j4.C3408m.m7838b(r8)
            goto L5f
        L14:
            r2 = 23
            r4 = 6006(0x1776, float:8.416E-42)
            if (r1 < r2) goto L23
            boolean r2 = p162j4.C3409n.m7839a(r8)
            if (r2 == 0) goto L23
        L20:
            r9 = 6006(0x1776, float:8.416E-42)
            goto L5f
        L23:
            r2 = 6002(0x1772, float:8.41E-42)
            r5 = 18
            if (r1 < r5) goto L32
            boolean r6 = p162j4.C3407l.m7836b(r8)
            if (r6 == 0) goto L32
        L2f:
            r9 = 6002(0x1772, float:8.41E-42)
            goto L5f
        L32:
            if (r1 < r5) goto L3d
            boolean r1 = p162j4.C3407l.m7835a(r8)
            if (r1 == 0) goto L3d
            r9 = 6007(0x1777, float:8.418E-42)
            goto L5f
        L3d:
            boolean r1 = r8 instanceof p162j4.C3421z
            if (r1 == 0) goto L44
            r9 = 6001(0x1771, float:8.409E-42)
            goto L5f
        L44:
            boolean r1 = r8 instanceof p162j4.C3397b.d
            if (r1 == 0) goto L4b
            r9 = 6003(0x1773, float:8.412E-42)
            goto L5f
        L4b:
            boolean r1 = r8 instanceof p162j4.C3418w
            if (r1 == 0) goto L52
            r9 = 6008(0x1778, float:8.419E-42)
            goto L5f
        L52:
            if (r9 != r3) goto L55
            goto L20
        L55:
            r1 = 2
            if (r9 != r1) goto L5b
            r9 = 6004(0x1774, float:8.413E-42)
            goto L5f
        L5b:
            r1 = 3
            if (r9 != r1) goto L7b
            goto L2f
        L5f:
            r0.<init>(r8, r9)
            r7.f14679s = r0
            java.lang.String r9 = "DefaultDrmSession"
            java.lang.String r0 = "DRM session error"
            p371v5.C6565o.m13369b(r9, r0, r8)
            u3.b r9 = new u3.b
            r9.<init>(r8)
            r7.m7796h(r9)
            int r8 = r7.f14674n
            r9 = 4
            if (r8 == r9) goto L7a
            r7.f14674n = r3
        L7a:
            return
        L7b:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>()
            throw r8
    }

    /* renamed from: l */
    public final void m7800l(java.lang.Exception r2, boolean r3) {
            r1 = this;
            boolean r0 = r2 instanceof android.media.NotProvisionedException
            if (r0 == 0) goto L18
            j4.a$a r2 = r1.f14663c
            j4.b$f r2 = (p162j4.C3397b.f) r2
            java.util.Set<j4.a> r3 = r2.f14720a
            r3.add(r1)
            j4.a r3 = r2.f14721b
            if (r3 == 0) goto L12
            goto L20
        L12:
            r2.f14721b = r1
            r1.m7803o()
            goto L20
        L18:
            if (r3 == 0) goto L1c
            r3 = 1
            goto L1d
        L1c:
            r3 = 2
        L1d:
            r1.m7799k(r2, r3)
        L20:
            return
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* renamed from: m */
    public final boolean m7801m() {
            r4 = this;
            boolean r0 = r4.m7798j()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            j4.q r0 = r4.f14662b     // Catch: java.lang.Exception -> L40 android.media.NotProvisionedException -> L45
            byte[] r0 = r0.mo7851l()     // Catch: java.lang.Exception -> L40 android.media.NotProvisionedException -> L45
            r4.f14680t = r0     // Catch: java.lang.Exception -> L40 android.media.NotProvisionedException -> L45
            j4.q r2 = r4.f14662b     // Catch: java.lang.Exception -> L40 android.media.NotProvisionedException -> L45
            i4.b r0 = r2.mo7850k(r0)     // Catch: java.lang.Exception -> L40 android.media.NotProvisionedException -> L45
            r4.f14678r = r0     // Catch: java.lang.Exception -> L40 android.media.NotProvisionedException -> L45
            r0 = 3
            r4.f14674n = r0     // Catch: java.lang.Exception -> L40 android.media.NotProvisionedException -> L45
            v5.i<j4.h$a> r2 = r4.f14669i     // Catch: java.lang.Exception -> L40 android.media.NotProvisionedException -> L45
            java.lang.Object r3 = r2.f25644Y     // Catch: java.lang.Exception -> L40 android.media.NotProvisionedException -> L45
            monitor-enter(r3)     // Catch: java.lang.Exception -> L40 android.media.NotProvisionedException -> L45
            java.util.Set<E> r2 = r2.f25646a0     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3d
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L40 android.media.NotProvisionedException -> L45
        L27:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> L40 android.media.NotProvisionedException -> L45
            if (r3 == 0) goto L37
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L40 android.media.NotProvisionedException -> L45
            j4.h$a r3 = (p162j4.InterfaceC3403h.a) r3     // Catch: java.lang.Exception -> L40 android.media.NotProvisionedException -> L45
            r3.m7826d(r0)     // Catch: java.lang.Exception -> L40 android.media.NotProvisionedException -> L45
            goto L27
        L37:
            byte[] r0 = r4.f14680t     // Catch: java.lang.Exception -> L40 android.media.NotProvisionedException -> L45
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Exception -> L40 android.media.NotProvisionedException -> L45
            return r1
        L3d:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3d
            throw r0     // Catch: java.lang.Exception -> L40 android.media.NotProvisionedException -> L45
        L40:
            r0 = move-exception
            r4.m7799k(r0, r1)
            goto L59
        L45:
            j4.a$a r0 = r4.f14663c
            j4.b$f r0 = (p162j4.C3397b.f) r0
            java.util.Set<j4.a> r1 = r0.f14720a
            r1.add(r4)
            j4.a r1 = r0.f14721b
            if (r1 == 0) goto L54
            goto L59
        L54:
            r0.f14721b = r4
            r4.m7803o()
        L59:
            r0 = 0
            return r0
    }

    /* renamed from: n */
    public final void m7802n(byte[] r5, int r6, boolean r7) {
            r4 = this;
            r0 = 1
            j4.q r1 = r4.f14662b     // Catch: java.lang.Exception -> L18
            java.util.List<j4.d$b> r2 = r4.f14661a     // Catch: java.lang.Exception -> L18
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r4.f14668h     // Catch: java.lang.Exception -> L18
            j4.q$a r5 = r1.mo7848i(r5, r2, r6, r3)     // Catch: java.lang.Exception -> L18
            r4.f14682v = r5     // Catch: java.lang.Exception -> L18
            j4.a$c r6 = r4.f14677q     // Catch: java.lang.Exception -> L18
            int r1 = p371v5.C6552b0.f25624a     // Catch: java.lang.Exception -> L18
            java.util.Objects.requireNonNull(r5)     // Catch: java.lang.Exception -> L18
            r6.m7805a(r0, r5, r7)     // Catch: java.lang.Exception -> L18
            goto L1c
        L18:
            r5 = move-exception
            r4.m7800l(r5, r0)
        L1c:
            return
    }

    /* renamed from: o */
    public void m7803o() {
            r4 = this;
            j4.q r0 = r4.f14662b
            j4.q$d r0 = r0.mo7846g()
            r4.f14683w = r0
            j4.a$c r1 = r4.f14677q
            int r2 = p371v5.C6552b0.f25624a
            r2 = 0
            java.util.Objects.requireNonNull(r0)
            r3 = 1
            r1.m7805a(r2, r0, r3)
            return
    }

    /* renamed from: p */
    public java.util.Map<java.lang.String, java.lang.String> m7804p() {
            r2 = this;
            byte[] r0 = r2.f14680t
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            j4.q r1 = r2.f14662b
            java.util.Map r0 = r1.mo7843d(r0)
        Lc:
            return r0
    }
}
