package p152ig;

/* renamed from: ig.h */
/* loaded from: classes.dex */
public final class C3153h extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4728b0 f12607c;

    /* renamed from: d */
    public final ch.InterfaceC0977d f12608d;

    /* renamed from: e */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f12609e;

    /* renamed from: f */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f12610f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<p152ig.C3142a> f12611g;

    /* renamed from: h */
    public final androidx.lifecycle.LiveData<p152ig.C3142a> f12612h;

    /* renamed from: i */
    public final androidx.lifecycle.C0437d0<java.lang.Double> f12613i;

    /* renamed from: j */
    public final androidx.lifecycle.LiveData<java.lang.Double> f12614j;

    /* renamed from: k */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f12615k;

    /* renamed from: l */
    public java.util.List<java.lang.String> f12616l;

    /* renamed from: m */
    public p152ig.C3153h.a f12617m;

    /* renamed from: n */
    public android.os.CountDownTimer f12618n;

    /* renamed from: ig.h$a */
    public static final class a {

        /* renamed from: a */
        public final double f12619a;

        /* renamed from: b */
        public final double f12620b;

        /* renamed from: c */
        public final int f12621c;

        /* renamed from: d */
        public final double f12622d;

        public a(double r1, double r3, int r5, double r6) {
                r0 = this;
                r0.<init>()
                r0.f12619a = r1
                r0.f12620b = r3
                r0.f12621c = r5
                r0.f12622d = r6
                return
        }

        /* renamed from: a */
        public final double m7609a() {
                r8 = this;
                java.lang.String r0 = "UTC"
                java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
                java.util.Calendar r0 = java.util.Calendar.getInstance(r0)
                long r0 = r0.getTimeInMillis()
                r2 = 1000(0x3e8, float:1.401E-42)
                long r2 = (long) r2
                long r0 = r0 / r2
                double r2 = r8.f12622d
                double r4 = r8.f12619a
                int r6 = r8.f12621c
                long r6 = (long) r6
                long r0 = r0 - r6
                double r0 = (double) r0
                r6 = 4660134898793709568(0x40ac200000000000, double:3600.0)
                double r0 = r0 / r6
                double r0 = r0 * r4
                double r0 = r0 + r2
                double r2 = r8.f12620b
                r4 = 100
                double r4 = (double) r4
                double r2 = r2 / r4
                double r2 = r2 * r0
                double r2 = r2 + r0
                return r2
        }

        public boolean equals(java.lang.Object r6) {
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L4
                return r0
            L4:
                boolean r1 = r6 instanceof p152ig.C3153h.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                ig.h$a r6 = (p152ig.C3153h.a) r6
                double r3 = r5.f12619a
                java.lang.Double r1 = java.lang.Double.valueOf(r3)
                double r3 = r6.f12619a
                java.lang.Double r3 = java.lang.Double.valueOf(r3)
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L1f
                return r2
            L1f:
                double r3 = r5.f12620b
                java.lang.Double r1 = java.lang.Double.valueOf(r3)
                double r3 = r6.f12620b
                java.lang.Double r3 = java.lang.Double.valueOf(r3)
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L32
                return r2
            L32:
                int r1 = r5.f12621c
                int r3 = r6.f12621c
                if (r1 == r3) goto L39
                return r2
            L39:
                double r3 = r5.f12622d
                java.lang.Double r1 = java.lang.Double.valueOf(r3)
                double r3 = r6.f12622d
                java.lang.Double r6 = java.lang.Double.valueOf(r3)
                boolean r6 = p214m2.C4339q.m9702c(r1, r6)
                if (r6 != 0) goto L4c
                return r2
            L4c:
                return r0
        }

        public int hashCode() {
                r7 = this;
                double r0 = r7.f12619a
                long r0 = java.lang.Double.doubleToLongBits(r0)
                r2 = 32
                long r3 = r0 >>> r2
                long r0 = r0 ^ r3
                int r1 = (int) r0
                int r1 = r1 * 31
                double r3 = r7.f12620b
                long r3 = java.lang.Double.doubleToLongBits(r3)
                long r5 = r3 >>> r2
                long r3 = r3 ^ r5
                int r0 = (int) r3
                int r1 = r1 + r0
                int r1 = r1 * 31
                int r0 = r7.f12621c
                int r1 = r1 + r0
                int r1 = r1 * 31
                double r3 = r7.f12622d
                long r3 = java.lang.Double.doubleToLongBits(r3)
                long r5 = r3 >>> r2
                long r2 = r3 ^ r5
                int r0 = (int) r2
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "ClaimCalculate(totalHour="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                double r1 = r3.f12619a
                r0.append(r1)
                java.lang.String r1 = ", bonusMultiplier="
                r0.append(r1)
                double r1 = r3.f12620b
                r0.append(r1)
                java.lang.String r1 = ", last_claim="
                r0.append(r1)
                int r1 = r3.f12621c
                r0.append(r1)
                java.lang.String r1 = ", to_claim="
                r0.append(r1)
                double r1 = r3.f12622d
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: ig.h$b */
    public static final class b extends p119h2.C2448j {
        public b(java.lang.String r2, p152ig.C3153h.c<T> r3, p152ig.C3153h.d r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r0, r2, r3, r4)
                return
        }
    }

    /* renamed from: ig.h$c */
    public static final class c<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p101fh.InterfaceC2172d<kg.C4122b> f12623a;

        public c(p101fh.InterfaceC2172d<? super kg.C4122b> r1) {
                r0 = this;
                r0.f12623a = r1
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r4) {
                r3 = this;
                java.lang.String r4 = (java.lang.String) r4
                fh.d<kg.b> r0 = r3.f12623a
                java.lang.String r1 = "response"
                jb.j r1 = p238nd.C4754k.m10827a(r4, r1)
                ig.a0 r2 = new ig.a0
                r2.<init>()
                java.lang.reflect.Type r2 = r2.f21382b
                java.lang.Object r4 = r1.m7929c(r4, r2)
                r0.mo5707k(r4)
                return
        }
    }

    /* renamed from: ig.h$d */
    public static final class d implements p105g2.C2222p.a {

        /* renamed from: a */
        public final /* synthetic */ p101fh.InterfaceC2172d<kg.C4122b> f12624a;

        public d(p101fh.InterfaceC2172d<? super kg.C4122b> r1) {
                r0 = this;
                r0.f12624a = r1
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.a
        /* renamed from: a */
        public final void mo118a(p105g2.C2226t r3) {
                r2 = this;
                fh.d<kg.b> r0 = r2.f12624a
                java.lang.String r1 = "it"
                p214m2.C4339q.m9705j(r3, r1)
                java.lang.Object r3 = p074e9.C1805a.m4520e(r3)
                r0.mo5707k(r3)
                return
        }
    }

    /* renamed from: ig.h$e */
    public static final class e extends p119h2.C2448j {
        public e(java.lang.String r2, p152ig.C3153h.f<T> r3, p152ig.C3153h.g r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r0, r2, r3, r4)
                return
        }
    }

    /* renamed from: ig.h$f */
    public static final class f<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p101fh.InterfaceC2172d<kg.C4122b> f12625a;

        public f(p101fh.InterfaceC2172d<? super kg.C4122b> r1) {
                r0 = this;
                r0.f12625a = r1
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r4) {
                r3 = this;
                java.lang.String r4 = (java.lang.String) r4
                fh.d<kg.b> r0 = r3.f12625a
                java.lang.String r1 = "response"
                jb.j r1 = p238nd.C4754k.m10827a(r4, r1)
                ig.b0 r2 = new ig.b0
                r2.<init>()
                java.lang.reflect.Type r2 = r2.f21382b
                java.lang.Object r4 = r1.m7929c(r4, r2)
                r0.mo5707k(r4)
                return
        }
    }

    /* renamed from: ig.h$g */
    public static final class g implements p105g2.C2222p.a {

        /* renamed from: a */
        public final /* synthetic */ p101fh.InterfaceC2172d<kg.C4122b> f12626a;

        public g(p101fh.InterfaceC2172d<? super kg.C4122b> r1) {
                r0 = this;
                r0.f12626a = r1
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.a
        /* renamed from: a */
        public final void mo118a(p105g2.C2226t r3) {
                r2 = this;
                fh.d<kg.b> r0 = r2.f12626a
                java.lang.String r1 = "it"
                p214m2.C4339q.m9705j(r3, r1)
                java.lang.Object r3 = p074e9.C1805a.m4520e(r3)
                r0.mo5707k(r3)
                return
        }
    }

    /* renamed from: ig.h$h */
    public static final class h extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f12627Z;

        public h(android.app.Application r1) {
                r0 = this;
                r0.f12627Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f12627Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.tacouniverse.TacoUniverseToolViewModel$refresh$1", m7452f = "TacoUniverseToolViewModel.kt", m7453l = {80, 81, 85, 91, 93, 94, 138, 144}, m7454m = "invokeSuspend")
    /* renamed from: ig.h$i */
    public static final class i extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0979f<? extends ch.C0985l>>, java.lang.Object> {

        /* renamed from: c0 */
        public java.lang.Object f12628c0;

        /* renamed from: d0 */
        public java.lang.Object f12629d0;

        /* renamed from: e0 */
        public java.lang.Object f12630e0;

        /* renamed from: f0 */
        public java.lang.Object f12631f0;

        /* renamed from: g0 */
        public java.lang.Object f12632g0;

        /* renamed from: h0 */
        public int f12633h0;

        /* renamed from: i0 */
        public /* synthetic */ java.lang.Object f12634i0;

        /* renamed from: j0 */
        public final /* synthetic */ p152ig.C3153h f12635j0;

        /* renamed from: k0 */
        public final /* synthetic */ java.lang.String f12636k0;

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.tacouniverse.TacoUniverseToolViewModel$refresh$1$1$bonusAtomicFuture$1", m7452f = "TacoUniverseToolViewModel.kt", m7453l = {74}, m7454m = "invokeSuspend")
        /* renamed from: ig.h$i$a */
        public static final class a extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.util.List<? extends kg.C4121a>>>, java.lang.Object> {

            /* renamed from: c0 */
            public int f12637c0;

            /* renamed from: d0 */
            public /* synthetic */ java.lang.Object f12638d0;

            /* renamed from: e0 */
            public final /* synthetic */ p152ig.C3153h f12639e0;

            /* renamed from: f0 */
            public final /* synthetic */ java.lang.String f12640f0;

            public a(p152ig.C3153h r1, java.lang.String r2, p101fh.InterfaceC2172d<? super p152ig.C3153h.i.a> r3) {
                    r0 = this;
                    r0.f12639e0 = r1
                    r0.f12640f0 = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r4, p101fh.InterfaceC2172d<?> r5) {
                    r3 = this;
                    ig.h$i$a r0 = new ig.h$i$a
                    ig.h r1 = r3.f12639e0
                    java.lang.String r2 = r3.f12640f0
                    r0.<init>(r1, r2, r5)
                    r0.f12638d0 = r4
                    return r0
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r4, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.util.List<? extends kg.C4121a>>> r5) {
                    r3 = this;
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    fh.d r5 = (p101fh.InterfaceC2172d) r5
                    ig.h$i$a r0 = new ig.h$i$a
                    ig.h r1 = r3.f12639e0
                    java.lang.String r2 = r3.f12640f0
                    r0.<init>(r1, r2, r5)
                    r0.f12638d0 = r4
                    ch.l r4 = ch.C0985l.f5061a
                    java.lang.Object r4 = r0.mo123o(r4)
                    return r4
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r4) {
                    r3 = this;
                    gh.a r0 = gh.EnumC2389a.f10764Y
                    int r1 = r3.f12637c0
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    p074e9.C1805a.m4540y(r4)     // Catch: java.lang.Throwable -> Ld
                    goto L2b
                Ld:
                    r4 = move-exception
                    goto L32
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    p074e9.C1805a.m4540y(r4)
                    java.lang.Object r4 = r3.f12638d0
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    ig.h r4 = r3.f12639e0
                    java.lang.String r1 = r3.f12640f0
                    r3.f12637c0 = r2     // Catch: java.lang.Throwable -> Ld
                    java.lang.Object r4 = r4.m7605h(r1, r3)     // Catch: java.lang.Throwable -> Ld
                    if (r4 != r0) goto L2b
                    return r0
                L2b:
                    kg.b r4 = (kg.C4122b) r4     // Catch: java.lang.Throwable -> Ld
                    java.util.List r4 = r4.getData()     // Catch: java.lang.Throwable -> Ld
                    goto L36
                L32:
                    java.lang.Object r4 = p074e9.C1805a.m4520e(r4)
                L36:
                    ch.f r0 = new ch.f
                    r0.<init>(r4)
                    return r0
            }
        }

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.tacouniverse.TacoUniverseToolViewModel$refresh$1$1$bonusChainFuture$1", m7452f = "TacoUniverseToolViewModel.kt", m7453l = {75}, m7454m = "invokeSuspend")
        /* renamed from: ig.h$i$b */
        public static final class b extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.util.List<? extends kg.C4123c>>>, java.lang.Object> {

            /* renamed from: c0 */
            public int f12641c0;

            /* renamed from: d0 */
            public /* synthetic */ java.lang.Object f12642d0;

            /* renamed from: e0 */
            public final /* synthetic */ p152ig.C3153h f12643e0;

            /* renamed from: f0 */
            public final /* synthetic */ java.lang.String f12644f0;

            public b(p152ig.C3153h r1, java.lang.String r2, p101fh.InterfaceC2172d<? super p152ig.C3153h.i.b> r3) {
                    r0 = this;
                    r0.f12643e0 = r1
                    r0.f12644f0 = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r4, p101fh.InterfaceC2172d<?> r5) {
                    r3 = this;
                    ig.h$i$b r0 = new ig.h$i$b
                    ig.h r1 = r3.f12643e0
                    java.lang.String r2 = r3.f12644f0
                    r0.<init>(r1, r2, r5)
                    r0.f12642d0 = r4
                    return r0
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r4, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.util.List<? extends kg.C4123c>>> r5) {
                    r3 = this;
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    fh.d r5 = (p101fh.InterfaceC2172d) r5
                    ig.h$i$b r0 = new ig.h$i$b
                    ig.h r1 = r3.f12643e0
                    java.lang.String r2 = r3.f12644f0
                    r0.<init>(r1, r2, r5)
                    r0.f12642d0 = r4
                    ch.l r4 = ch.C0985l.f5061a
                    java.lang.Object r4 = r0.mo123o(r4)
                    return r4
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r4) {
                    r3 = this;
                    gh.a r0 = gh.EnumC2389a.f10764Y
                    int r1 = r3.f12641c0
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    p074e9.C1805a.m4540y(r4)     // Catch: java.lang.Throwable -> Ld
                    goto L2b
                Ld:
                    r4 = move-exception
                    goto L2e
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    p074e9.C1805a.m4540y(r4)
                    java.lang.Object r4 = r3.f12642d0
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    ig.h r4 = r3.f12643e0
                    java.lang.String r1 = r3.f12644f0
                    r3.f12641c0 = r2     // Catch: java.lang.Throwable -> Ld
                    java.lang.Object r4 = p152ig.C3153h.m7601d(r4, r1, r3)     // Catch: java.lang.Throwable -> Ld
                    if (r4 != r0) goto L2b
                    return r0
                L2b:
                    java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> Ld
                    goto L32
                L2e:
                    java.lang.Object r4 = p074e9.C1805a.m4520e(r4)
                L32:
                    ch.f r0 = new ch.f
                    r0.<init>(r4)
                    return r0
            }
        }

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.tacouniverse.TacoUniverseToolViewModel$refresh$1$1$claimerFuture$1", m7452f = "TacoUniverseToolViewModel.kt", m7453l = {76}, m7454m = "invokeSuspend")
        /* renamed from: ig.h$i$c */
        public static final class c extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0979f<? extends kg.C4124d>>, java.lang.Object> {

            /* renamed from: c0 */
            public int f12645c0;

            /* renamed from: d0 */
            public /* synthetic */ java.lang.Object f12646d0;

            /* renamed from: e0 */
            public final /* synthetic */ p152ig.C3153h f12647e0;

            /* renamed from: f0 */
            public final /* synthetic */ java.lang.String f12648f0;

            public c(p152ig.C3153h r1, java.lang.String r2, p101fh.InterfaceC2172d<? super p152ig.C3153h.i.c> r3) {
                    r0 = this;
                    r0.f12647e0 = r1
                    r0.f12648f0 = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r4, p101fh.InterfaceC2172d<?> r5) {
                    r3 = this;
                    ig.h$i$c r0 = new ig.h$i$c
                    ig.h r1 = r3.f12647e0
                    java.lang.String r2 = r3.f12648f0
                    r0.<init>(r1, r2, r5)
                    r0.f12646d0 = r4
                    return r0
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r4, p101fh.InterfaceC2172d<? super ch.C0979f<? extends kg.C4124d>> r5) {
                    r3 = this;
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    fh.d r5 = (p101fh.InterfaceC2172d) r5
                    ig.h$i$c r0 = new ig.h$i$c
                    ig.h r1 = r3.f12647e0
                    java.lang.String r2 = r3.f12648f0
                    r0.<init>(r1, r2, r5)
                    r0.f12646d0 = r4
                    ch.l r4 = ch.C0985l.f5061a
                    java.lang.Object r4 = r0.mo123o(r4)
                    return r4
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r4) {
                    r3 = this;
                    gh.a r0 = gh.EnumC2389a.f10764Y
                    int r1 = r3.f12645c0
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    p074e9.C1805a.m4540y(r4)     // Catch: java.lang.Throwable -> Ld
                    goto L2b
                Ld:
                    r4 = move-exception
                    goto L2e
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    p074e9.C1805a.m4540y(r4)
                    java.lang.Object r4 = r3.f12646d0
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    ig.h r4 = r3.f12647e0
                    java.lang.String r1 = r3.f12648f0
                    r3.f12645c0 = r2     // Catch: java.lang.Throwable -> Ld
                    java.lang.Object r4 = p152ig.C3153h.m7602e(r4, r1, r3)     // Catch: java.lang.Throwable -> Ld
                    if (r4 != r0) goto L2b
                    return r0
                L2b:
                    kg.d r4 = (kg.C4124d) r4     // Catch: java.lang.Throwable -> Ld
                    goto L32
                L2e:
                    java.lang.Object r4 = p074e9.C1805a.m4520e(r4)
                L32:
                    ch.f r0 = new ch.f
                    r0.<init>(r4)
                    return r0
            }
        }

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.tacouniverse.TacoUniverseToolViewModel$refresh$1$1$configBonusFuture$1", m7452f = "TacoUniverseToolViewModel.kt", m7453l = {78}, m7454m = "invokeSuspend")
        /* renamed from: ig.h$i$d */
        public static final class d extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.util.List<? extends kg.C4125e>>>, java.lang.Object> {

            /* renamed from: c0 */
            public int f12649c0;

            /* renamed from: d0 */
            public /* synthetic */ java.lang.Object f12650d0;

            /* renamed from: e0 */
            public final /* synthetic */ p152ig.C3153h f12651e0;

            public d(p152ig.C3153h r1, p101fh.InterfaceC2172d<? super p152ig.C3153h.i.d> r2) {
                    r0 = this;
                    r0.f12651e0 = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                    r2 = this;
                    ig.h$i$d r0 = new ig.h$i$d
                    ig.h r1 = r2.f12651e0
                    r0.<init>(r1, r4)
                    r0.f12650d0 = r3
                    return r0
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.util.List<? extends kg.C4125e>>> r4) {
                    r2 = this;
                    vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                    fh.d r4 = (p101fh.InterfaceC2172d) r4
                    ig.h$i$d r0 = new ig.h$i$d
                    ig.h r1 = r2.f12651e0
                    r0.<init>(r1, r4)
                    r0.f12650d0 = r3
                    ch.l r3 = ch.C0985l.f5061a
                    java.lang.Object r3 = r0.mo123o(r3)
                    return r3
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r4) {
                    r3 = this;
                    gh.a r0 = gh.EnumC2389a.f10764Y
                    int r1 = r3.f12649c0
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    p074e9.C1805a.m4540y(r4)     // Catch: java.lang.Throwable -> Ld
                    goto L29
                Ld:
                    r4 = move-exception
                    goto L2c
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    p074e9.C1805a.m4540y(r4)
                    java.lang.Object r4 = r3.f12650d0
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    ig.h r4 = r3.f12651e0
                    r3.f12649c0 = r2     // Catch: java.lang.Throwable -> Ld
                    java.lang.Object r4 = p152ig.C3153h.m7603f(r4, r3)     // Catch: java.lang.Throwable -> Ld
                    if (r4 != r0) goto L29
                    return r0
                L29:
                    java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> Ld
                    goto L30
                L2c:
                    java.lang.Object r4 = p074e9.C1805a.m4520e(r4)
                L30:
                    ch.f r0 = new ch.f
                    r0.<init>(r4)
                    return r0
            }
        }

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.tacouniverse.TacoUniverseToolViewModel$refresh$1$1$configExtractorsFuture$1", m7452f = "TacoUniverseToolViewModel.kt", m7453l = {77}, m7454m = "invokeSuspend")
        /* renamed from: ig.h$i$e */
        public static final class e extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.util.List<? extends kg.C4126f>>>, java.lang.Object> {

            /* renamed from: c0 */
            public int f12652c0;

            /* renamed from: d0 */
            public /* synthetic */ java.lang.Object f12653d0;

            /* renamed from: e0 */
            public final /* synthetic */ p152ig.C3153h f12654e0;

            public e(p152ig.C3153h r1, p101fh.InterfaceC2172d<? super p152ig.C3153h.i.e> r2) {
                    r0 = this;
                    r0.f12654e0 = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                    r2 = this;
                    ig.h$i$e r0 = new ig.h$i$e
                    ig.h r1 = r2.f12654e0
                    r0.<init>(r1, r4)
                    r0.f12653d0 = r3
                    return r0
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.util.List<? extends kg.C4126f>>> r4) {
                    r2 = this;
                    vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                    fh.d r4 = (p101fh.InterfaceC2172d) r4
                    ig.h$i$e r0 = new ig.h$i$e
                    ig.h r1 = r2.f12654e0
                    r0.<init>(r1, r4)
                    r0.f12653d0 = r3
                    ch.l r3 = ch.C0985l.f5061a
                    java.lang.Object r3 = r0.mo123o(r3)
                    return r3
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r4) {
                    r3 = this;
                    gh.a r0 = gh.EnumC2389a.f10764Y
                    int r1 = r3.f12652c0
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    p074e9.C1805a.m4540y(r4)     // Catch: java.lang.Throwable -> Ld
                    goto L29
                Ld:
                    r4 = move-exception
                    goto L2c
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    p074e9.C1805a.m4540y(r4)
                    java.lang.Object r4 = r3.f12653d0
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    ig.h r4 = r3.f12654e0
                    r3.f12652c0 = r2     // Catch: java.lang.Throwable -> Ld
                    java.lang.Object r4 = p152ig.C3153h.m7604g(r4, r3)     // Catch: java.lang.Throwable -> Ld
                    if (r4 != r0) goto L29
                    return r0
                L29:
                    java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> Ld
                    goto L30
                L2c:
                    java.lang.Object r4 = p074e9.C1805a.m4520e(r4)
                L30:
                    ch.f r0 = new ch.f
                    r0.<init>(r4)
                    return r0
            }
        }

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.tacouniverse.TacoUniverseToolViewModel$refresh$1$2$1", m7452f = "TacoUniverseToolViewModel.kt", m7453l = {}, m7454m = "invokeSuspend")
        /* renamed from: ig.h$i$f */
        public static final class f extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

            /* renamed from: c0 */
            public final /* synthetic */ p152ig.C3153h f12655c0;

            public f(p152ig.C3153h r1, p101fh.InterfaceC2172d<? super p152ig.C3153h.i.f> r2) {
                    r0 = this;
                    r0.f12655c0 = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r2, p101fh.InterfaceC2172d<?> r3) {
                    r1 = this;
                    ig.h$i$f r2 = new ig.h$i$f
                    ig.h r0 = r1.f12655c0
                    r2.<init>(r0, r3)
                    return r2
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r2, p101fh.InterfaceC2172d<? super ch.C0985l> r3) {
                    r1 = this;
                    vh.b0 r2 = (p379vh.InterfaceC6686b0) r2
                    fh.d r3 = (p101fh.InterfaceC2172d) r3
                    ig.h$i$f r2 = new ig.h$i$f
                    ig.h r0 = r1.f12655c0
                    r2.<init>(r0, r3)
                    ch.l r3 = ch.C0985l.f5061a
                    r2.mo123o(r3)
                    return r3
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r2) {
                    r1 = this;
                    p074e9.C1805a.m4540y(r2)
                    ig.h r2 = r1.f12655c0
                    androidx.lifecycle.d0<java.lang.Boolean> r2 = r2.f12609e
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r2.mo7l(r0)
                    ig.h r2 = r1.f12655c0
                    android.os.CountDownTimer r0 = r2.f12618n
                    if (r0 == 0) goto L15
                    r0.cancel()
                L15:
                    ig.d0 r0 = new ig.d0
                    r0.<init>(r2)
                    android.os.CountDownTimer r0 = r0.start()
                    r2.f12618n = r0
                    ch.l r2 = ch.C0985l.f5061a
                    return r2
            }
        }

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.tacouniverse.TacoUniverseToolViewModel$refresh$1$3$1", m7452f = "TacoUniverseToolViewModel.kt", m7453l = {}, m7454m = "invokeSuspend")
        /* renamed from: ig.h$i$g */
        public static final class g extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

            /* renamed from: c0 */
            public final /* synthetic */ p152ig.C3153h f12656c0;

            /* renamed from: d0 */
            public final /* synthetic */ java.lang.String f12657d0;

            public g(p152ig.C3153h r1, java.lang.String r2, p101fh.InterfaceC2172d<? super p152ig.C3153h.i.g> r3) {
                    r0 = this;
                    r0.f12656c0 = r1
                    r0.f12657d0 = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                    r2 = this;
                    ig.h$i$g r3 = new ig.h$i$g
                    ig.h r0 = r2.f12656c0
                    java.lang.String r1 = r2.f12657d0
                    r3.<init>(r0, r1, r4)
                    return r3
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
                    r2 = this;
                    vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                    fh.d r4 = (p101fh.InterfaceC2172d) r4
                    ig.h$i$g r3 = new ig.h$i$g
                    ig.h r0 = r2.f12656c0
                    java.lang.String r1 = r2.f12657d0
                    r3.<init>(r0, r1, r4)
                    ch.l r4 = ch.C0985l.f5061a
                    r3.mo123o(r4)
                    return r4
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r6) {
                    r5 = this;
                    p074e9.C1805a.m4540y(r6)
                    ig.h r6 = r5.f12656c0
                    androidx.lifecycle.d0<java.lang.Boolean> r6 = r6.f12609e
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r6.mo7l(r0)
                    ig.h r6 = r5.f12656c0
                    androidx.lifecycle.d0<vg.b<ah.a>> r6 = r6.f12615k
                    java.lang.String r0 = r5.f12657d0
                    vg.b r1 = new vg.b
                    ah.a r2 = new ah.a
                    zg.d r3 = p458zg.EnumC7332d.f28068Z
                    java.lang.String r4 = "Error"
                    r2.<init>(r4, r0, r3)
                    r1.<init>(r2)
                    r6.mo7l(r1)
                    ch.l r6 = ch.C0985l.f5061a
                    return r6
            }
        }

        /* renamed from: ig.h$i$h */
        public static final class h<T> implements java.util.Comparator {
            public h() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // java.util.Comparator
            public final int compare(T r3, T r4) {
                    r2 = this;
                    jg.a r4 = (p173jg.C3609a) r4
                    double r0 = r4.f15872b
                    java.lang.Double r4 = java.lang.Double.valueOf(r0)
                    jg.a r3 = (p173jg.C3609a) r3
                    double r0 = r3.f15872b
                    java.lang.Double r3 = java.lang.Double.valueOf(r0)
                    int r3 = p079eh.C1850a.m4597b(r4, r3)
                    return r3
            }
        }

        /* renamed from: ig.h$i$i, reason: collision with other inner class name */
        public static final class C7395i<T> implements java.util.Comparator {
            public C7395i() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // java.util.Comparator
            public final int compare(T r3, T r4) {
                    r2 = this;
                    jg.a r4 = (p173jg.C3609a) r4
                    double r0 = r4.f15872b
                    java.lang.Double r4 = java.lang.Double.valueOf(r0)
                    jg.a r3 = (p173jg.C3609a) r3
                    double r0 = r3.f15872b
                    java.lang.Double r3 = java.lang.Double.valueOf(r0)
                    int r3 = p079eh.C1850a.m4597b(r4, r3)
                    return r3
            }
        }

        public i(p152ig.C3153h r1, java.lang.String r2, p101fh.InterfaceC2172d<? super p152ig.C3153h.i> r3) {
                r0 = this;
                r0.f12635j0 = r1
                r0.f12636k0 = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: h */
        public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r4, p101fh.InterfaceC2172d<?> r5) {
                r3 = this;
                ig.h$i r0 = new ig.h$i
                ig.h r1 = r3.f12635j0
                java.lang.String r2 = r3.f12636k0
                r0.<init>(r1, r2, r5)
                r0.f12634i0 = r4
                return r0
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r4, p101fh.InterfaceC2172d<? super ch.C0979f<? extends ch.C0985l>> r5) {
                r3 = this;
                vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                fh.d r5 = (p101fh.InterfaceC2172d) r5
                ig.h$i r0 = new ig.h$i
                ig.h r1 = r3.f12635j0
                java.lang.String r2 = r3.f12636k0
                r0.<init>(r1, r2, r5)
                r0.f12634i0 = r4
                ch.l r4 = ch.C0985l.f5061a
                java.lang.Object r4 = r0.mo123o(r4)
                return r4
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r30) {
                r29 = this;
                r1 = r29
                gh.a r2 = gh.EnumC2389a.f10764Y
                int r0 = r1.f12633h0
                r5 = 1
                r6 = 0
                switch(r0) {
                    case 0: goto Lcb;
                    case 1: goto Laa;
                    case 2: goto L89;
                    case 3: goto L6f;
                    case 4: goto L56;
                    case 5: goto L39;
                    case 6: goto L21;
                    case 7: goto L1a;
                    case 8: goto L13;
                    default: goto Lb;
                }
            Lb:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L13:
                java.lang.Object r0 = r1.f12634i0
                p074e9.C1805a.m4540y(r30)
                goto L5a4
            L1a:
                java.lang.Object r0 = r1.f12634i0
                p074e9.C1805a.m4540y(r30)
                goto L577
            L21:
                java.lang.Object r0 = r1.f12630e0
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r7 = r1.f12629d0
                java.util.List r7 = (java.util.List) r7
                java.lang.Object r8 = r1.f12628c0
                kg.d r8 = (kg.C4124d) r8
                java.lang.Object r9 = r1.f12634i0
                ig.h r9 = (p152ig.C3153h) r9
                p074e9.C1805a.m4540y(r30)     // Catch: java.lang.Throwable -> L547
                r3 = r0
                r0 = r30
                goto L2f3
            L39:
                java.lang.Object r0 = r1.f12630e0
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r7 = r1.f12629d0
                kg.d r7 = (kg.C4124d) r7
                java.lang.Object r8 = r1.f12628c0
                vh.f0 r8 = (p379vh.InterfaceC6698f0) r8
                java.lang.Object r9 = r1.f12634i0
                ig.h r9 = (p152ig.C3153h) r9
                p074e9.C1805a.m4540y(r30)     // Catch: java.lang.Throwable -> L547
                r4 = r30
                r28 = r7
                r7 = r0
                r0 = r8
                r8 = r28
                goto L2d8
            L56:
                java.lang.Object r0 = r1.f12630e0
                kg.d r0 = (kg.C4124d) r0
                java.lang.Object r7 = r1.f12629d0
                vh.f0 r7 = (p379vh.InterfaceC6698f0) r7
                java.lang.Object r8 = r1.f12628c0
                vh.f0 r8 = (p379vh.InterfaceC6698f0) r8
                java.lang.Object r9 = r1.f12634i0
                ig.h r9 = (p152ig.C3153h) r9
                p074e9.C1805a.m4540y(r30)     // Catch: java.lang.Throwable -> L547
                r3 = r30
            L6b:
                r4 = r8
                r8 = r7
                goto L2ba
            L6f:
                java.lang.Object r0 = r1.f12630e0
                vh.f0 r0 = (p379vh.InterfaceC6698f0) r0
                java.lang.Object r7 = r1.f12629d0
                vh.f0 r7 = (p379vh.InterfaceC6698f0) r7
                java.lang.Object r8 = r1.f12628c0
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r9 = r1.f12634i0
                ig.h r9 = (p152ig.C3153h) r9
                p074e9.C1805a.m4540y(r30)     // Catch: java.lang.Throwable -> L547
                r3 = r8
                r8 = r7
                r7 = r0
                r0 = r30
                goto L1f6
            L89:
                java.lang.Object r0 = r1.f12632g0
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r7 = r1.f12631f0
                vh.f0 r7 = (p379vh.InterfaceC6698f0) r7
                java.lang.Object r8 = r1.f12630e0
                vh.f0 r8 = (p379vh.InterfaceC6698f0) r8
                java.lang.Object r9 = r1.f12629d0
                vh.f0 r9 = (p379vh.InterfaceC6698f0) r9
                java.lang.Object r10 = r1.f12628c0
                java.lang.String r10 = (java.lang.String) r10
                java.lang.Object r11 = r1.f12634i0
                ig.h r11 = (p152ig.C3153h) r11
                p074e9.C1805a.m4540y(r30)     // Catch: java.lang.Throwable -> L547
                r3 = r30
                r4 = r8
            La7:
                r8 = r10
                goto L18e
            Laa:
                java.lang.Object r0 = r1.f12632g0
                vh.f0 r0 = (p379vh.InterfaceC6698f0) r0
                java.lang.Object r7 = r1.f12631f0
                vh.f0 r7 = (p379vh.InterfaceC6698f0) r7
                java.lang.Object r8 = r1.f12630e0
                vh.f0 r8 = (p379vh.InterfaceC6698f0) r8
                java.lang.Object r9 = r1.f12629d0
                vh.f0 r9 = (p379vh.InterfaceC6698f0) r9
                java.lang.Object r10 = r1.f12628c0
                java.lang.String r10 = (java.lang.String) r10
                java.lang.Object r11 = r1.f12634i0
                ig.h r11 = (p152ig.C3153h) r11
                p074e9.C1805a.m4540y(r30)     // Catch: java.lang.Throwable -> L547
                r3 = r9
                r9 = r8
                r8 = r30
                goto L147
            Lcb:
                p074e9.C1805a.m4540y(r30)
                java.lang.Object r0 = r1.f12634i0
                vh.b0 r0 = (p379vh.InterfaceC6686b0) r0
                ig.h r13 = r1.f12635j0
                java.lang.String r14 = r1.f12636k0
                r8 = 0
                ig.h$i$a r10 = new ig.h$i$a     // Catch: java.lang.Throwable -> L547
                r10.<init>(r13, r14, r6)     // Catch: java.lang.Throwable -> L547
                r11 = 3
                r12 = 0
                r9 = 0
                r7 = r0
                vh.f0 r15 = p101fh.C2174f.m5714d(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L547
                r8 = 0
                ig.h$i$b r10 = new ig.h$i$b     // Catch: java.lang.Throwable -> L547
                r10.<init>(r13, r14, r6)     // Catch: java.lang.Throwable -> L547
                r11 = 3
                r12 = 0
                r9 = 0
                r7 = r0
                vh.f0 r12 = p101fh.C2174f.m5714d(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L547
                r8 = 0
                ig.h$i$c r10 = new ig.h$i$c     // Catch: java.lang.Throwable -> L547
                r10.<init>(r13, r14, r6)     // Catch: java.lang.Throwable -> L547
                r11 = 3
                r16 = 0
                r9 = 0
                r7 = r0
                r3 = r12
                r12 = r16
                vh.f0 r12 = p101fh.C2174f.m5714d(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L547
                r8 = 0
                ig.h$i$e r10 = new ig.h$i$e     // Catch: java.lang.Throwable -> L547
                r10.<init>(r13, r6)     // Catch: java.lang.Throwable -> L547
                r11 = 3
                r16 = 0
                r9 = 0
                r7 = r0
                r4 = r12
                r12 = r16
                vh.f0 r12 = p101fh.C2174f.m5714d(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L547
                r8 = 0
                ig.h$i$d r10 = new ig.h$i$d     // Catch: java.lang.Throwable -> L547
                r10.<init>(r13, r6)     // Catch: java.lang.Throwable -> L547
                r11 = 3
                r16 = 0
                r9 = 0
                r7 = r0
                r0 = r12
                r12 = r16
                vh.f0 r7 = p101fh.C2174f.m5714d(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L547
                r1.f12634i0 = r13     // Catch: java.lang.Throwable -> L547
                r1.f12628c0 = r14     // Catch: java.lang.Throwable -> L547
                r1.f12629d0 = r3     // Catch: java.lang.Throwable -> L547
                r1.f12630e0 = r4     // Catch: java.lang.Throwable -> L547
                r1.f12631f0 = r0     // Catch: java.lang.Throwable -> L547
                r1.f12632g0 = r7     // Catch: java.lang.Throwable -> L547
                r1.f12633h0 = r5     // Catch: java.lang.Throwable -> L547
                vh.g0 r15 = (p379vh.C6701g0) r15     // Catch: java.lang.Throwable -> L547
                java.lang.Object r8 = r15.mo13566Q(r1)     // Catch: java.lang.Throwable -> L547
                if (r8 != r2) goto L13f
                return r2
            L13f:
                r9 = r4
                r11 = r13
                r10 = r14
                r28 = r7
                r7 = r0
                r0 = r28
            L147:
                ch.f r8 = (ch.C0979f) r8     // Catch: java.lang.Throwable -> L547
                java.lang.Object r4 = r8.f5052Y     // Catch: java.lang.Throwable -> L547
                p074e9.C1805a.m4540y(r4)     // Catch: java.lang.Throwable -> L547
                java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> L547
                java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L547
                r12 = 10
                int r13 = p062dh.C1469e.m3992D(r4, r12)     // Catch: java.lang.Throwable -> L547
                r8.<init>(r13)     // Catch: java.lang.Throwable -> L547
                java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L547
            L15f:
                boolean r12 = r4.hasNext()     // Catch: java.lang.Throwable -> L547
                if (r12 == 0) goto L173
                java.lang.Object r12 = r4.next()     // Catch: java.lang.Throwable -> L547
                kg.a r12 = (kg.C4121a) r12     // Catch: java.lang.Throwable -> L547
                java.lang.String r12 = r12.getAsset_id()     // Catch: java.lang.Throwable -> L547
                r8.add(r12)     // Catch: java.lang.Throwable -> L547
                goto L15f
            L173:
                r1.f12634i0 = r11     // Catch: java.lang.Throwable -> L547
                r1.f12628c0 = r10     // Catch: java.lang.Throwable -> L547
                r1.f12629d0 = r9     // Catch: java.lang.Throwable -> L547
                r1.f12630e0 = r7     // Catch: java.lang.Throwable -> L547
                r1.f12631f0 = r0     // Catch: java.lang.Throwable -> L547
                r1.f12632g0 = r8     // Catch: java.lang.Throwable -> L547
                r4 = 2
                r1.f12633h0 = r4     // Catch: java.lang.Throwable -> L547
                java.lang.Object r3 = r3.mo13566Q(r1)     // Catch: java.lang.Throwable -> L547
                if (r3 != r2) goto L189
                return r2
            L189:
                r4 = r7
                r7 = r0
                r0 = r8
                goto La7
            L18e:
                ch.f r3 = (ch.C0979f) r3     // Catch: java.lang.Throwable -> L547
                java.lang.Object r3 = r3.f5052Y     // Catch: java.lang.Throwable -> L547
                p074e9.C1805a.m4540y(r3)     // Catch: java.lang.Throwable -> L547
                java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L547
                java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L547
                r10.<init>()     // Catch: java.lang.Throwable -> L547
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L547
            L1a0:
                boolean r12 = r0.hasNext()     // Catch: java.lang.Throwable -> L547
                if (r12 == 0) goto L1da
                java.lang.Object r12 = r0.next()     // Catch: java.lang.Throwable -> L547
                r13 = r12
                java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L547
                java.util.Iterator r14 = r3.iterator()     // Catch: java.lang.Throwable -> L547
            L1b1:
                boolean r15 = r14.hasNext()     // Catch: java.lang.Throwable -> L547
                if (r15 == 0) goto L1cc
                java.lang.Object r15 = r14.next()     // Catch: java.lang.Throwable -> L547
                r16 = r15
                kg.c r16 = (kg.C4123c) r16     // Catch: java.lang.Throwable -> L547
                java.lang.String r6 = r16.getAsset_id()     // Catch: java.lang.Throwable -> L547
                boolean r6 = p214m2.C4339q.m9702c(r6, r13)     // Catch: java.lang.Throwable -> L547
                if (r6 == 0) goto L1ca
                goto L1cd
            L1ca:
                r6 = 0
                goto L1b1
            L1cc:
                r15 = 0
            L1cd:
                if (r15 == 0) goto L1d1
                r6 = 1
                goto L1d2
            L1d1:
                r6 = 0
            L1d2:
                r6 = r6 ^ r5
                if (r6 == 0) goto L1d8
                r10.add(r12)     // Catch: java.lang.Throwable -> L547
            L1d8:
                r6 = 0
                goto L1a0
            L1da:
                r11.f12616l = r10     // Catch: java.lang.Throwable -> L547
                r1.f12634i0 = r11     // Catch: java.lang.Throwable -> L547
                r1.f12628c0 = r8     // Catch: java.lang.Throwable -> L547
                r1.f12629d0 = r4     // Catch: java.lang.Throwable -> L547
                r1.f12630e0 = r7     // Catch: java.lang.Throwable -> L547
                r3 = 0
                r1.f12631f0 = r3     // Catch: java.lang.Throwable -> L547
                r1.f12632g0 = r3     // Catch: java.lang.Throwable -> L547
                r0 = 3
                r1.f12633h0 = r0     // Catch: java.lang.Throwable -> L547
                java.lang.Object r0 = r9.mo13566Q(r1)     // Catch: java.lang.Throwable -> L547
                if (r0 != r2) goto L1f3
                return r2
            L1f3:
                r3 = r8
                r9 = r11
                r8 = r4
            L1f6:
                ch.f r0 = (ch.C0979f) r0     // Catch: java.lang.Throwable -> L547
                java.lang.Object r0 = r0.f5052Y     // Catch: java.lang.Throwable -> L547
                boolean r4 = r0 instanceof ch.C0979f.a     // Catch: java.lang.Throwable -> L547
                if (r4 == 0) goto L1ff
                r0 = 0
            L1ff:
                kg.d r0 = (kg.C4124d) r0     // Catch: java.lang.Throwable -> L547
                if (r0 != 0) goto L205
                goto L544
            L205:
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L547
                r4.<init>()     // Catch: java.lang.Throwable -> L547
                java.util.List r6 = r0.getExtractors()     // Catch: java.lang.Throwable -> L547
                java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L547
                r10.<init>()     // Catch: java.lang.Throwable -> L547
                java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L547
            L217:
                boolean r11 = r6.hasNext()     // Catch: java.lang.Throwable -> L547
                if (r11 == 0) goto L233
                java.lang.Object r11 = r6.next()     // Catch: java.lang.Throwable -> L547
                r12 = r11
                kg.d$b r12 = (kg.C4124d.b) r12     // Catch: java.lang.Throwable -> L547
                int r12 = r12.getValue()     // Catch: java.lang.Throwable -> L547
                if (r12 <= 0) goto L22c
                r12 = 1
                goto L22d
            L22c:
                r12 = 0
            L22d:
                if (r12 == 0) goto L217
                r10.add(r11)     // Catch: java.lang.Throwable -> L547
                goto L217
            L233:
                java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L547
                r11 = 10
                int r12 = p062dh.C1469e.m3992D(r10, r11)     // Catch: java.lang.Throwable -> L547
                r6.<init>(r12)     // Catch: java.lang.Throwable -> L547
                java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L547
            L242:
                boolean r11 = r10.hasNext()     // Catch: java.lang.Throwable -> L547
                if (r11 == 0) goto L256
                java.lang.Object r11 = r10.next()     // Catch: java.lang.Throwable -> L547
                kg.d$b r11 = (kg.C4124d.b) r11     // Catch: java.lang.Throwable -> L547
                java.lang.String r11 = r11.getKey()     // Catch: java.lang.Throwable -> L547
                r6.add(r11)     // Catch: java.lang.Throwable -> L547
                goto L242
            L256:
                r4.addAll(r6)     // Catch: java.lang.Throwable -> L547
                java.util.List r6 = r0.getBonus()     // Catch: java.lang.Throwable -> L547
                java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L547
                r10.<init>()     // Catch: java.lang.Throwable -> L547
                java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L547
            L266:
                boolean r11 = r6.hasNext()     // Catch: java.lang.Throwable -> L547
                if (r11 == 0) goto L282
                java.lang.Object r11 = r6.next()     // Catch: java.lang.Throwable -> L547
                r12 = r11
                kg.d$a r12 = (kg.C4124d.a) r12     // Catch: java.lang.Throwable -> L547
                int r12 = r12.getValue()     // Catch: java.lang.Throwable -> L547
                if (r12 <= 0) goto L27b
                r12 = 1
                goto L27c
            L27b:
                r12 = 0
            L27c:
                if (r12 == 0) goto L266
                r10.add(r11)     // Catch: java.lang.Throwable -> L547
                goto L266
            L282:
                java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L547
                r11 = 10
                int r12 = p062dh.C1469e.m3992D(r10, r11)     // Catch: java.lang.Throwable -> L547
                r6.<init>(r12)     // Catch: java.lang.Throwable -> L547
                java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L547
            L291:
                boolean r11 = r10.hasNext()     // Catch: java.lang.Throwable -> L547
                if (r11 == 0) goto L2a5
                java.lang.Object r11 = r10.next()     // Catch: java.lang.Throwable -> L547
                kg.d$a r11 = (kg.C4124d.a) r11     // Catch: java.lang.Throwable -> L547
                java.lang.String r11 = r11.getKey()     // Catch: java.lang.Throwable -> L547
                r6.add(r11)     // Catch: java.lang.Throwable -> L547
                goto L291
            L2a5:
                r4.addAll(r6)     // Catch: java.lang.Throwable -> L547
                r1.f12634i0 = r9     // Catch: java.lang.Throwable -> L547
                r1.f12628c0 = r8     // Catch: java.lang.Throwable -> L547
                r1.f12629d0 = r7     // Catch: java.lang.Throwable -> L547
                r1.f12630e0 = r0     // Catch: java.lang.Throwable -> L547
                r6 = 4
                r1.f12633h0 = r6     // Catch: java.lang.Throwable -> L547
                java.lang.Object r3 = r9.m7606i(r3, r4, r1)     // Catch: java.lang.Throwable -> L547
                if (r3 != r2) goto L6b
                return r2
            L2ba:
                kg.b r3 = (kg.C4122b) r3     // Catch: java.lang.Throwable -> L547
                java.util.List r3 = r3.getData()     // Catch: java.lang.Throwable -> L547
                r1.f12634i0 = r9     // Catch: java.lang.Throwable -> L547
                r1.f12628c0 = r8     // Catch: java.lang.Throwable -> L547
                r1.f12629d0 = r0     // Catch: java.lang.Throwable -> L547
                r1.f12630e0 = r3     // Catch: java.lang.Throwable -> L547
                r6 = 5
                r1.f12633h0 = r6     // Catch: java.lang.Throwable -> L547
                java.lang.Object r4 = r4.mo13566Q(r1)     // Catch: java.lang.Throwable -> L547
                if (r4 != r2) goto L2d2
                return r2
            L2d2:
                r7 = r3
                r28 = r8
                r8 = r0
                r0 = r28
            L2d8:
                ch.f r4 = (ch.C0979f) r4     // Catch: java.lang.Throwable -> L547
                java.lang.Object r3 = r4.f5052Y     // Catch: java.lang.Throwable -> L547
                p074e9.C1805a.m4540y(r3)     // Catch: java.lang.Throwable -> L547
                java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L547
                r1.f12634i0 = r9     // Catch: java.lang.Throwable -> L547
                r1.f12628c0 = r8     // Catch: java.lang.Throwable -> L547
                r1.f12629d0 = r7     // Catch: java.lang.Throwable -> L547
                r1.f12630e0 = r3     // Catch: java.lang.Throwable -> L547
                r4 = 6
                r1.f12633h0 = r4     // Catch: java.lang.Throwable -> L547
                java.lang.Object r0 = r0.mo13566Q(r1)     // Catch: java.lang.Throwable -> L547
                if (r0 != r2) goto L2f3
                return r2
            L2f3:
                ch.f r0 = (ch.C0979f) r0     // Catch: java.lang.Throwable -> L547
                java.lang.Object r0 = r0.f5052Y     // Catch: java.lang.Throwable -> L547
                p074e9.C1805a.m4540y(r0)     // Catch: java.lang.Throwable -> L547
                java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L547
                java.util.List r4 = r8.getExtractors()     // Catch: java.lang.Throwable -> L547
                java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L547
                r6.<init>()     // Catch: java.lang.Throwable -> L547
                java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L547
            L309:
                boolean r10 = r4.hasNext()     // Catch: java.lang.Throwable -> L547
                if (r10 == 0) goto L325
                java.lang.Object r10 = r4.next()     // Catch: java.lang.Throwable -> L547
                r11 = r10
                kg.d$b r11 = (kg.C4124d.b) r11     // Catch: java.lang.Throwable -> L547
                int r11 = r11.getValue()     // Catch: java.lang.Throwable -> L547
                if (r11 <= 0) goto L31e
                r11 = 1
                goto L31f
            L31e:
                r11 = 0
            L31f:
                if (r11 == 0) goto L309
                r6.add(r10)     // Catch: java.lang.Throwable -> L547
                goto L309
            L325:
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L547
                r10 = 10
                int r11 = p062dh.C1469e.m3992D(r6, r10)     // Catch: java.lang.Throwable -> L547
                r4.<init>(r11)     // Catch: java.lang.Throwable -> L547
                java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L547
            L334:
                boolean r10 = r6.hasNext()     // Catch: java.lang.Throwable -> L547
                java.lang.String r11 = "Collection contains no element matching the predicate."
                if (r10 == 0) goto L3e3
                java.lang.Object r10 = r6.next()     // Catch: java.lang.Throwable -> L547
                kg.d$b r10 = (kg.C4124d.b) r10     // Catch: java.lang.Throwable -> L547
                java.util.Iterator r12 = r7.iterator()     // Catch: java.lang.Throwable -> L547
            L346:
                boolean r13 = r12.hasNext()     // Catch: java.lang.Throwable -> L547
                if (r13 == 0) goto L366
                java.lang.Object r13 = r12.next()     // Catch: java.lang.Throwable -> L547
                r14 = r13
                kg.a r14 = (kg.C4121a) r14     // Catch: java.lang.Throwable -> L547
                kg.a$a r14 = r14.getTemplate()     // Catch: java.lang.Throwable -> L547
                java.lang.String r14 = r14.getTemplate_id()     // Catch: java.lang.Throwable -> L547
                java.lang.String r15 = r10.getKey()     // Catch: java.lang.Throwable -> L547
                boolean r14 = p214m2.C4339q.m9702c(r14, r15)     // Catch: java.lang.Throwable -> L547
                if (r14 == 0) goto L346
                goto L367
            L366:
                r13 = 0
            L367:
                kg.a r13 = (kg.C4121a) r13     // Catch: java.lang.Throwable -> L547
                java.util.Iterator r12 = r3.iterator()     // Catch: java.lang.Throwable -> L547
            L36d:
                boolean r14 = r12.hasNext()     // Catch: java.lang.Throwable -> L547
                if (r14 == 0) goto L3dd
                java.lang.Object r14 = r12.next()     // Catch: java.lang.Throwable -> L547
                r15 = r14
                kg.f r15 = (kg.C4126f) r15     // Catch: java.lang.Throwable -> L547
                java.lang.String r15 = r15.getTemplate_id()     // Catch: java.lang.Throwable -> L547
                java.lang.String r5 = r10.getKey()     // Catch: java.lang.Throwable -> L547
                boolean r5 = p214m2.C4339q.m9702c(r15, r5)     // Catch: java.lang.Throwable -> L547
                if (r5 == 0) goto L3db
                kg.f r14 = (kg.C4126f) r14     // Catch: java.lang.Throwable -> L547
                if (r13 == 0) goto L392
                java.lang.String r5 = r13.getName()     // Catch: java.lang.Throwable -> L547
                if (r5 != 0) goto L396
            L392:
                java.lang.String r5 = r14.getLabel()     // Catch: java.lang.Throwable -> L547
            L396:
                r18 = r5
                int r5 = r14.getValue()     // Catch: java.lang.Throwable -> L547
                double r11 = (double) r5     // Catch: java.lang.Throwable -> L547
                r14 = 4600156803381319434(0x3fd70a3d70a3d70a, double:0.36)
                double r11 = r11 * r14
                int r5 = r10.getValue()     // Catch: java.lang.Throwable -> L547
                double r14 = (double) r5     // Catch: java.lang.Throwable -> L547
                double r19 = r11 * r14
                if (r13 == 0) goto L3c8
                kg.a$a r5 = r13.getTemplate()     // Catch: java.lang.Throwable -> L547
                if (r5 == 0) goto L3c8
                kg.a$a$a r5 = r5.getImmutable_data()     // Catch: java.lang.Throwable -> L547
                if (r5 == 0) goto L3c8
                java.lang.String r11 = r5.getStatic_img()     // Catch: java.lang.Throwable -> L547
                if (r11 != 0) goto L3c4
                java.lang.String r5 = r5.getImg()     // Catch: java.lang.Throwable -> L547
                goto L3c5
            L3c4:
                r5 = r11
            L3c5:
                r21 = r5
                goto L3ca
            L3c8:
                r21 = 0
            L3ca:
                int r22 = r10.getValue()     // Catch: java.lang.Throwable -> L547
                jg.a r5 = new jg.a     // Catch: java.lang.Throwable -> L547
                r17 = r5
                r17.<init>(r18, r19, r21, r22)     // Catch: java.lang.Throwable -> L547
                r4.add(r5)     // Catch: java.lang.Throwable -> L547
                r5 = 1
                goto L334
            L3db:
                r5 = 1
                goto L36d
            L3dd:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L547
                r0.<init>(r11)     // Catch: java.lang.Throwable -> L547
                throw r0     // Catch: java.lang.Throwable -> L547
            L3e3:
                ig.h$i$h r3 = new ig.h$i$h     // Catch: java.lang.Throwable -> L547
                r3.<init>()     // Catch: java.lang.Throwable -> L547
                java.util.List r18 = p062dh.C1473i.m4004P(r4, r3)     // Catch: java.lang.Throwable -> L547
                java.util.List r3 = r8.getBonus()     // Catch: java.lang.Throwable -> L547
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L547
                r4.<init>()     // Catch: java.lang.Throwable -> L547
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L547
            L3f9:
                boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L547
                if (r5 == 0) goto L415
                java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L547
                r6 = r5
                kg.d$a r6 = (kg.C4124d.a) r6     // Catch: java.lang.Throwable -> L547
                int r6 = r6.getValue()     // Catch: java.lang.Throwable -> L547
                if (r6 <= 0) goto L40e
                r6 = 1
                goto L40f
            L40e:
                r6 = 0
            L40f:
                if (r6 == 0) goto L3f9
                r4.add(r5)     // Catch: java.lang.Throwable -> L547
                goto L3f9
            L415:
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L547
                r5 = 10
                int r5 = p062dh.C1469e.m3992D(r4, r5)     // Catch: java.lang.Throwable -> L547
                r3.<init>(r5)     // Catch: java.lang.Throwable -> L547
                java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L547
            L424:
                boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L547
                if (r5 == 0) goto L4cf
                java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L547
                kg.d$a r5 = (kg.C4124d.a) r5     // Catch: java.lang.Throwable -> L547
                java.util.Iterator r6 = r7.iterator()     // Catch: java.lang.Throwable -> L547
            L434:
                boolean r10 = r6.hasNext()     // Catch: java.lang.Throwable -> L547
                if (r10 == 0) goto L454
                java.lang.Object r10 = r6.next()     // Catch: java.lang.Throwable -> L547
                r12 = r10
                kg.a r12 = (kg.C4121a) r12     // Catch: java.lang.Throwable -> L547
                kg.a$a r12 = r12.getTemplate()     // Catch: java.lang.Throwable -> L547
                java.lang.String r12 = r12.getTemplate_id()     // Catch: java.lang.Throwable -> L547
                java.lang.String r13 = r5.getKey()     // Catch: java.lang.Throwable -> L547
                boolean r12 = p214m2.C4339q.m9702c(r12, r13)     // Catch: java.lang.Throwable -> L547
                if (r12 == 0) goto L434
                goto L455
            L454:
                r10 = 0
            L455:
                kg.a r10 = (kg.C4121a) r10     // Catch: java.lang.Throwable -> L547
                java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.Throwable -> L547
            L45b:
                boolean r12 = r6.hasNext()     // Catch: java.lang.Throwable -> L547
                if (r12 == 0) goto L4c9
                java.lang.Object r12 = r6.next()     // Catch: java.lang.Throwable -> L547
                r13 = r12
                kg.e r13 = (kg.C4125e) r13     // Catch: java.lang.Throwable -> L547
                java.lang.String r13 = r13.getTemplate_id()     // Catch: java.lang.Throwable -> L547
                java.lang.String r14 = r5.getKey()     // Catch: java.lang.Throwable -> L547
                boolean r13 = p214m2.C4339q.m9702c(r13, r14)     // Catch: java.lang.Throwable -> L547
                if (r13 == 0) goto L45b
                kg.e r12 = (kg.C4125e) r12     // Catch: java.lang.Throwable -> L547
                if (r10 == 0) goto L480
                java.lang.String r6 = r10.getName()     // Catch: java.lang.Throwable -> L547
                if (r6 != 0) goto L484
            L480:
                java.lang.String r6 = r12.getLabel()     // Catch: java.lang.Throwable -> L547
            L484:
                r20 = r6
                java.lang.String r6 = r12.getValue()     // Catch: java.lang.Throwable -> L547
                double r12 = java.lang.Double.parseDouble(r6)     // Catch: java.lang.Throwable -> L547
                r6 = 100
                double r14 = (double) r6     // Catch: java.lang.Throwable -> L547
                double r12 = r12 * r14
                int r6 = r5.getValue()     // Catch: java.lang.Throwable -> L547
                double r14 = (double) r6     // Catch: java.lang.Throwable -> L547
                double r21 = r12 * r14
                if (r10 == 0) goto L4b7
                kg.a$a r6 = r10.getTemplate()     // Catch: java.lang.Throwable -> L547
                if (r6 == 0) goto L4b7
                kg.a$a$a r6 = r6.getImmutable_data()     // Catch: java.lang.Throwable -> L547
                if (r6 == 0) goto L4b7
                java.lang.String r10 = r6.getStatic_img()     // Catch: java.lang.Throwable -> L547
                if (r10 != 0) goto L4b3
                java.lang.String r6 = r6.getImg()     // Catch: java.lang.Throwable -> L547
                goto L4b4
            L4b3:
                r6 = r10
            L4b4:
                r23 = r6
                goto L4b9
            L4b7:
                r23 = 0
            L4b9:
                int r24 = r5.getValue()     // Catch: java.lang.Throwable -> L547
                jg.a r5 = new jg.a     // Catch: java.lang.Throwable -> L547
                r19 = r5
                r19.<init>(r20, r21, r23, r24)     // Catch: java.lang.Throwable -> L547
                r3.add(r5)     // Catch: java.lang.Throwable -> L547
                goto L424
            L4c9:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L547
                r0.<init>(r11)     // Catch: java.lang.Throwable -> L547
                throw r0     // Catch: java.lang.Throwable -> L547
            L4cf:
                ig.h$i$i r0 = new ig.h$i$i     // Catch: java.lang.Throwable -> L547
                r0.<init>()     // Catch: java.lang.Throwable -> L547
                java.util.List r19 = p062dh.C1473i.m4004P(r3, r0)     // Catch: java.lang.Throwable -> L547
                java.util.Iterator r0 = r18.iterator()     // Catch: java.lang.Throwable -> L547
                r3 = 0
                r5 = r3
            L4df:
                boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L547
                if (r7 == 0) goto L4ef
                java.lang.Object r7 = r0.next()     // Catch: java.lang.Throwable -> L547
                jg.a r7 = (p173jg.C3609a) r7     // Catch: java.lang.Throwable -> L547
                double r10 = r7.f15872b     // Catch: java.lang.Throwable -> L547
                double r5 = r5 + r10
                goto L4df
            L4ef:
                java.util.Iterator r0 = r19.iterator()     // Catch: java.lang.Throwable -> L547
            L4f3:
                boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L547
                if (r7 == 0) goto L503
                java.lang.Object r7 = r0.next()     // Catch: java.lang.Throwable -> L547
                jg.a r7 = (p173jg.C3609a) r7     // Catch: java.lang.Throwable -> L547
                double r10 = r7.f15872b     // Catch: java.lang.Throwable -> L547
                double r3 = r3 + r10
                goto L4f3
            L503:
                r10 = 4621819117588971520(0x4024000000000000, double:10.0)
                double r3 = java.lang.Math.min(r3, r10)     // Catch: java.lang.Throwable -> L547
                ig.h$a r0 = new ig.h$a     // Catch: java.lang.Throwable -> L547
                int r25 = r8.getLast_claim()     // Catch: java.lang.Throwable -> L547
                long r7 = r8.getTo_claim()     // Catch: java.lang.Throwable -> L547
                double r7 = (double) r7     // Catch: java.lang.Throwable -> L547
                r10 = 4666723172467343360(0x40c3880000000000, double:10000.0)
                double r26 = r7 / r10
                r20 = r0
                r21 = r5
                r23 = r3
                r20.<init>(r21, r23, r25, r26)     // Catch: java.lang.Throwable -> L547
                androidx.lifecycle.d0<java.lang.Double> r7 = r9.f12613i     // Catch: java.lang.Throwable -> L547
                double r10 = r0.m7609a()     // Catch: java.lang.Throwable -> L547
                java.lang.Double r8 = new java.lang.Double     // Catch: java.lang.Throwable -> L547
                r8.<init>(r10)     // Catch: java.lang.Throwable -> L547
                r7.mo1415j(r8)     // Catch: java.lang.Throwable -> L547
                r9.f12617m = r0     // Catch: java.lang.Throwable -> L547
                androidx.lifecycle.d0<ig.a> r0 = r9.f12611g     // Catch: java.lang.Throwable -> L547
                ig.a r7 = new ig.a     // Catch: java.lang.Throwable -> L547
                r17 = r7
                r20 = r5
                r22 = r3
                r17.<init>(r18, r19, r20, r22)     // Catch: java.lang.Throwable -> L547
                r0.mo1415j(r7)     // Catch: java.lang.Throwable -> L547
            L544:
                ch.l r0 = ch.C0985l.f5061a     // Catch: java.lang.Throwable -> L547
                goto L54c
            L547:
                r0 = move-exception
                java.lang.Object r0 = p074e9.C1805a.m4520e(r0)
            L54c:
                ig.h r3 = r1.f12635j0
                boolean r4 = r0 instanceof ch.C0979f.a
                r5 = 1
                r4 = r4 ^ r5
                if (r4 == 0) goto L577
                r4 = r0
                ch.l r4 = (ch.C0985l) r4
                vh.z r4 = p379vh.C6716l0.f26007a
                vh.k1 r4 = p459zh.C7346l.f28106a
                ig.h$i$f r5 = new ig.h$i$f
                r6 = 0
                r5.<init>(r3, r6)
                r1.f12634i0 = r0
                r1.f12628c0 = r6
                r1.f12629d0 = r6
                r1.f12630e0 = r6
                r1.f12631f0 = r6
                r1.f12632g0 = r6
                r3 = 7
                r1.f12633h0 = r3
                java.lang.Object r3 = p101fh.C2174f.m5710A(r4, r5, r1)
                if (r3 != r2) goto L577
                return r2
            L577:
                ig.h r3 = r1.f12635j0
                java.lang.Throwable r4 = ch.C0979f.m2690b(r0)
                if (r4 == 0) goto L5a4
                java.lang.String r4 = vg.C6672m.m13514a(r4)
                vh.z r5 = p379vh.C6716l0.f26007a
                vh.k1 r5 = p459zh.C7346l.f28106a
                ig.h$i$g r6 = new ig.h$i$g
                r7 = 0
                r6.<init>(r3, r4, r7)
                r1.f12634i0 = r0
                r1.f12628c0 = r7
                r1.f12629d0 = r7
                r1.f12630e0 = r7
                r1.f12631f0 = r7
                r1.f12632g0 = r7
                r3 = 8
                r1.f12633h0 = r3
                java.lang.Object r3 = p101fh.C2174f.m5710A(r5, r6, r1)
                if (r3 != r2) goto L5a4
                return r2
            L5a4:
                ch.f r2 = new ch.f
                r2.<init>(r0)
                return r2
        }
    }

    public C3153h(android.app.Application r3, p238nd.C4728b0 r4) {
            r2 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r4, r0)
            r2.<init>()
            r2.f12607c = r4
            ig.h$h r4 = new ig.h$h
            r4.<init>(r3)
            ch.d r3 = p185k7.C4038x4.m9096i(r4)
            r2.f12608d = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r2.f12609e = r3
            r2.f12610f = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r4 = 0
            r3.<init>(r4)
            r2.f12611g = r3
            r2.f12612h = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r0 = 0
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            r3.<init>(r4)
            r2.f12613i = r3
            r2.f12614j = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r2.f12615k = r3
            dh.k r3 = p062dh.C1475k.f7237Y
            r2.f12616l = r3
            return
    }

    /* renamed from: d */
    public static final java.lang.Object m7601d(p152ig.C3153h r4, java.lang.String r5, p101fh.InterfaceC2172d r6) {
            java.util.Objects.requireNonNull(r4)
            fh.j r0 = new fh.j
            fh.d r6 = gh.C2390b.m6127q(r6)
            r0.<init>(r6)
            nd.v0 r6 = p238nd.C4781v0.f19121e
            java.lang.String r1 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r6, r1)
            java.lang.String r6 = r6.m10839c()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "\n                {\n                    \"json\": true,\n                    \"code\": \"g.taco\",\n                    \"scope\": \""
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = "\",\n                    \"table\": \"bonus\",\n                    \"limit\": \"1000\"\n                }"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = p362uh.C6459e.m13046C(r5)
            ig.m r1 = new ig.m
            r1.<init>(r0)
            ig.n r2 = new ig.n
            r2.<init>(r0)
            ig.k r3 = new ig.k
            r3.<init>(r6, r5, r1, r2)
            g2.o r4 = r4.m7607j()
            r4.m5814a(r3)
            java.lang.Object r4 = r0.m5741a()
            return r4
    }

    /* renamed from: e */
    public static final java.lang.Object m7602e(p152ig.C3153h r4, java.lang.String r5, p101fh.InterfaceC2172d r6) {
            java.util.Objects.requireNonNull(r4)
            fh.j r0 = new fh.j
            fh.d r6 = gh.C2390b.m6127q(r6)
            r0.<init>(r6)
            nd.v0 r6 = p238nd.C4781v0.f19121e
            java.lang.String r1 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r6, r1)
            java.lang.String r6 = r6.m10839c()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "\n                {\n                    \"json\": true,\n                    \"code\": \"g.taco\",\n                    \"scope\": \"g.taco\",\n                    \"table\": \"claimers\",\n                    \"lower_bound\": \""
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = "\",\n                    \"upper_bound\": \""
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = "\",\n                    \"limit\": \"1\"\n                }"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = p362uh.C6459e.m13046C(r5)
            ig.q r1 = new ig.q
            r1.<init>(r0)
            ig.r r2 = new ig.r
            r2.<init>(r0)
            ig.o r3 = new ig.o
            r3.<init>(r6, r5, r1, r2)
            g2.o r4 = r4.m7607j()
            r4.m5814a(r3)
            java.lang.Object r4 = r0.m5741a()
            return r4
    }

    /* renamed from: f */
    public static final java.lang.Object m7603f(p152ig.C3153h r5, p101fh.InterfaceC2172d r6) {
            java.util.Objects.requireNonNull(r5)
            fh.j r0 = new fh.j
            fh.d r6 = gh.C2390b.m6127q(r6)
            r0.<init>(r6)
            nd.v0 r6 = p238nd.C4781v0.f19121e
            java.lang.String r1 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r6, r1)
            java.lang.String r6 = r6.m10839c()
            ig.u r1 = new ig.u
            r1.<init>(r0)
            ig.v r2 = new ig.v
            r2.<init>(r0)
            ig.s r3 = new ig.s
            java.lang.String r4 = "{\n    \"json\": true,\n    \"code\": \"g.taco\",\n    \"scope\": \"g.taco\",\n    \"table\": \"configbonus\",\n    \"limit\": \"1000\"\n}"
            r3.<init>(r6, r4, r1, r2)
            g2.o r5 = r5.m7607j()
            r5.m5814a(r3)
            java.lang.Object r5 = r0.m5741a()
            return r5
    }

    /* renamed from: g */
    public static final java.lang.Object m7604g(p152ig.C3153h r5, p101fh.InterfaceC2172d r6) {
            java.util.Objects.requireNonNull(r5)
            fh.j r0 = new fh.j
            fh.d r6 = gh.C2390b.m6127q(r6)
            r0.<init>(r6)
            nd.v0 r6 = p238nd.C4781v0.f19121e
            java.lang.String r1 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r6, r1)
            java.lang.String r6 = r6.m10839c()
            ig.y r1 = new ig.y
            r1.<init>(r0)
            ig.z r2 = new ig.z
            r2.<init>(r0)
            ig.w r3 = new ig.w
            java.lang.String r4 = "{\n    \"json\": true,\n    \"code\": \"g.taco\",\n    \"scope\": \"g.taco\",\n    \"table\": \"configextr\",\n    \"limit\": \"1000\"\n}"
            r3.<init>(r6, r4, r1, r2)
            g2.o r5 = r5.m7607j()
            r5.m5814a(r3)
            java.lang.Object r5 = r0.m5741a()
            return r5
    }

    @Override // androidx.lifecycle.AbstractC0457n0
    /* renamed from: b */
    public void mo8b() {
            r1 = this;
            android.os.CountDownTimer r0 = r1.f12618n
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            return
    }

    /* renamed from: h */
    public final java.lang.Object m7605h(java.lang.String r4, p101fh.InterfaceC2172d<? super kg.C4122b> r5) {
            r3 = this;
            fh.j r0 = new fh.j
            fh.d r5 = gh.C2390b.m6127q(r5)
            r0.<init>(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            nd.v0 r1 = p238nd.C4781v0.f19121e
            java.lang.String r2 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r1, r2)
            java.lang.String r1 = r1.m10837a()
            r5.append(r1)
            java.lang.String r1 = "/v1/assets?page=1&limit=1000&collection_name=taco&burned=false&schema_name=membership,bonus,promo,exclusive&owner="
            r5.append(r1)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            ig.h$c r5 = new ig.h$c
            r5.<init>(r0)
            ig.h$d r1 = new ig.h$d
            r1.<init>(r0)
            ig.h$b r2 = new ig.h$b
            r2.<init>(r4, r5, r1)
            g2.o r4 = r3.m7607j()
            r4.m5814a(r2)
            java.lang.Object r4 = r0.m5741a()
            return r4
    }

    /* renamed from: i */
    public final java.lang.Object m7606i(java.lang.String r10, java.util.List<java.lang.String> r11, p101fh.InterfaceC2172d<? super kg.C4122b> r12) {
            r9 = this;
            fh.j r0 = new fh.j
            fh.d r12 = gh.C2390b.m6127q(r12)
            r0.<init>(r12)
            java.lang.String r2 = ","
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 62
            r1 = r11
            java.lang.String r11 = p062dh.C1473i.m4000L(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            nd.v0 r1 = p238nd.C4781v0.f19121e
            java.lang.String r2 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r1, r2)
            java.lang.String r1 = r1.m10837a()
            r12.append(r1)
            java.lang.String r1 = "/v1/assets?page=1&limit=1000&order=desc&sort=asset_id&template_id="
            r12.append(r1)
            r12.append(r11)
            java.lang.String r11 = "&owner="
            r12.append(r11)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            ig.h$f r11 = new ig.h$f
            r11.<init>(r0)
            ig.h$g r12 = new ig.h$g
            r12.<init>(r0)
            ig.h$e r1 = new ig.h$e
            r1.<init>(r10, r11, r12)
            g2.o r10 = r9.m7607j()
            r10.m5814a(r1)
            java.lang.Object r10 = r0.m5741a()
            return r10
    }

    /* renamed from: j */
    public final p105g2.C2221o m7607j() {
            r1 = this;
            ch.d r0 = r1.f12608d
            java.lang.Object r0 = r0.getValue()
            g2.o r0 = (p105g2.C2221o) r0
            return r0
    }

    /* renamed from: k */
    public final void m7608k() {
            r9 = this;
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r9.f12609e
            java.lang.Object r0 = r0.m1411d()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto Lf
            return
        Lf:
            nd.b0 r0 = r9.f12607c
            id.b r0 = r0.m10795h()
            if (r0 == 0) goto L32
            java.lang.String r0 = r0.f12559a
            if (r0 != 0) goto L1c
            goto L32
        L1c:
            androidx.lifecycle.d0<java.lang.Boolean> r2 = r9.f12609e
            r2.mo7l(r1)
            vh.b0 r3 = p064e.C1488b.m4037d(r9)
            r4 = 0
            ig.h$i r6 = new ig.h$i
            r1 = 0
            r6.<init>(r9, r0, r1)
            r7 = 3
            r8 = 0
            r5 = 0
            p101fh.C2174f.m5714d(r3, r4, r5, r6, r7, r8)
        L32:
            return
    }
}
