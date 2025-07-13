package gg;

/* renamed from: gg.g */
/* loaded from: classes.dex */
public final class C2369g extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4728b0 f10708c;

    /* renamed from: d */
    public final ch.InterfaceC0977d f10709d;

    /* renamed from: e */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f10710e;

    /* renamed from: f */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f10711f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<java.lang.Double> f10712g;

    /* renamed from: h */
    public final androidx.lifecycle.C0437d0<java.lang.Double> f10713h;

    /* renamed from: i */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f10714i;

    /* renamed from: j */
    public final androidx.lifecycle.C0437d0<java.util.List<p255od.C5206h0>> f10715j;

    /* renamed from: k */
    public final androidx.lifecycle.C0437d0<java.lang.Double> f10716k;

    /* renamed from: l */
    public final androidx.lifecycle.C0437d0<java.lang.Long> f10717l;

    /* renamed from: m */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f10718m;

    /* renamed from: n */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f10719n;

    /* renamed from: o */
    public final androidx.lifecycle.C0437d0<vg.C6661b<java.lang.String>> f10720o;

    /* renamed from: p */
    public android.os.CountDownTimer f10721p;

    /* renamed from: q */
    public android.os.CountDownTimer f10722q;

    /* renamed from: gg.g$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.Boolean, java.lang.String, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ gg.C2369g f10723Z;

        public a(gg.C2369g r1) {
                r0 = this;
                r0.f10723Z = r1
                r1 = 2
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public ch.C0985l mo122l(java.lang.Boolean r5, java.lang.String r6) {
                r4 = this;
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                java.lang.String r6 = (java.lang.String) r6
                gg.g r0 = r4.f10723Z
                androidx.lifecycle.d0<vg.b<ah.a>> r1 = r0.f10719n
                if (r5 == 0) goto L44
                androidx.lifecycle.d0<java.lang.Double> r5 = r0.f10713h
                r2 = 0
                java.lang.Double r6 = java.lang.Double.valueOf(r2)
                r5.mo7l(r6)
                android.os.Handler r5 = new android.os.Handler
                android.os.Looper r6 = android.os.Looper.getMainLooper()
                r5.<init>(r6)
                gg.g r6 = r4.f10723Z
                gg.f r0 = new gg.f
                r2 = 0
                r0.<init>(r6, r2)
                r2 = 1500(0x5dc, double:7.41E-321)
                r5.postDelayed(r0, r2)
                java.lang.String r5 = "Claim success"
                r6 = 0
                java.lang.String r0 = "title"
                p214m2.C4339q.m9706k(r5, r0)
                vg.b r0 = new vg.b
                ah.a r2 = new ah.a
                zg.d r3 = p458zg.EnumC7332d.f28067Y
                r2.<init>(r5, r6, r3)
                r0.<init>(r2)
                goto L55
            L44:
                r0.m6109j()
                vg.b r0 = new vg.b
                ah.a r5 = new ah.a
                zg.d r2 = p458zg.EnumC7332d.f28068Z
                java.lang.String r3 = "Transaction Error"
                r5.<init>(r3, r6, r2)
                r0.<init>(r5)
            L55:
                r1.mo7l(r0)
                ch.l r5 = ch.C0985l.f5061a
                return r5
        }
    }

    /* renamed from: gg.g$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f10724Z;

        public b(android.app.Application r1) {
                r0 = this;
                r0.f10724Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f10724Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.rplanet.RPlanetToolViewModel$refresh$1", m7452f = "RPlanetToolViewModel.kt", m7453l = {95, 96, 97, 98, 102}, m7454m = "invokeSuspend")
    /* renamed from: gg.g$c */
    public static final class c extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

        /* renamed from: c0 */
        public java.lang.Object f10725c0;

        /* renamed from: d0 */
        public java.lang.Object f10726d0;

        /* renamed from: e0 */
        public java.lang.Object f10727e0;

        /* renamed from: f0 */
        public java.lang.Object f10728f0;

        /* renamed from: g0 */
        public int f10729g0;

        /* renamed from: h0 */
        public /* synthetic */ java.lang.Object f10730h0;

        /* renamed from: i0 */
        public final /* synthetic */ gg.C2369g f10731i0;

        /* renamed from: j0 */
        public final /* synthetic */ java.lang.String f10732j0;

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.rplanet.RPlanetToolViewModel$refresh$1$1$1", m7452f = "RPlanetToolViewModel.kt", m7453l = {}, m7454m = "invokeSuspend")
        /* renamed from: gg.g$c$a */
        public static final class a extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

            /* renamed from: c0 */
            public final /* synthetic */ gg.C2369g f10733c0;

            public a(gg.C2369g r1, p101fh.InterfaceC2172d<? super gg.C2369g.c.a> r2) {
                    r0 = this;
                    r0.f10733c0 = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r2, p101fh.InterfaceC2172d<?> r3) {
                    r1 = this;
                    gg.g$c$a r2 = new gg.g$c$a
                    gg.g r0 = r1.f10733c0
                    r2.<init>(r0, r3)
                    return r2
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r2, p101fh.InterfaceC2172d<? super ch.C0985l> r3) {
                    r1 = this;
                    vh.b0 r2 = (p379vh.InterfaceC6686b0) r2
                    fh.d r3 = (p101fh.InterfaceC2172d) r3
                    gg.g$c$a r2 = new gg.g$c$a
                    gg.g r0 = r1.f10733c0
                    r2.<init>(r0, r3)
                    ch.l r3 = ch.C0985l.f5061a
                    r2.mo123o(r3)
                    return r3
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r5) {
                    r4 = this;
                    p074e9.C1805a.m4540y(r5)
                    gg.g r5 = r4.f10733c0
                    android.os.CountDownTimer r0 = r5.f10722q
                    if (r0 == 0) goto Lc
                    r0.cancel()
                Lc:
                    java.lang.String r0 = "UTC"
                    java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
                    java.util.Calendar r0 = java.util.Calendar.getInstance(r0)
                    r1 = 12
                    int r1 = r0.get(r1)
                    int r1 = r1 * 60
                    r2 = 13
                    int r0 = r0.get(r2)
                    int r0 = r0 + r1
                    int r0 = 3600 - r0
                    long r0 = (long) r0
                    r2 = 1000(0x3e8, double:4.94E-321)
                    long r0 = r0 * r2
                    gg.b0 r2 = new gg.b0
                    r2.<init>(r0, r5)
                    android.os.CountDownTimer r0 = r2.start()
                    r5.f10722q = r0
                    ch.l r5 = ch.C0985l.f5061a
                    return r5
            }
        }

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.rplanet.RPlanetToolViewModel$refresh$1$1$aetherPowerFuture$1", m7452f = "RPlanetToolViewModel.kt", m7453l = {91}, m7454m = "invokeSuspend")
        /* renamed from: gg.g$c$b */
        public static final class b extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.lang.Double>>, java.lang.Object> {

            /* renamed from: c0 */
            public int f10734c0;

            /* renamed from: d0 */
            public /* synthetic */ java.lang.Object f10735d0;

            /* renamed from: e0 */
            public final /* synthetic */ gg.C2369g f10736e0;

            /* renamed from: f0 */
            public final /* synthetic */ java.lang.String f10737f0;

            public b(gg.C2369g r1, java.lang.String r2, p101fh.InterfaceC2172d<? super gg.C2369g.c.b> r3) {
                    r0 = this;
                    r0.f10736e0 = r1
                    r0.f10737f0 = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r4, p101fh.InterfaceC2172d<?> r5) {
                    r3 = this;
                    gg.g$c$b r0 = new gg.g$c$b
                    gg.g r1 = r3.f10736e0
                    java.lang.String r2 = r3.f10737f0
                    r0.<init>(r1, r2, r5)
                    r0.f10735d0 = r4
                    return r0
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r4, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.lang.Double>> r5) {
                    r3 = this;
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    fh.d r5 = (p101fh.InterfaceC2172d) r5
                    gg.g$c$b r0 = new gg.g$c$b
                    gg.g r1 = r3.f10736e0
                    java.lang.String r2 = r3.f10737f0
                    r0.<init>(r1, r2, r5)
                    r0.f10735d0 = r4
                    ch.l r4 = ch.C0985l.f5061a
                    java.lang.Object r4 = r0.mo123o(r4)
                    return r4
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r4) {
                    r3 = this;
                    gh.a r0 = gh.EnumC2389a.f10764Y
                    int r1 = r3.f10734c0
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    p074e9.C1805a.m4540y(r4)     // Catch: java.lang.Throwable -> Ld
                    goto L2b
                Ld:
                    r4 = move-exception
                    goto L37
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    p074e9.C1805a.m4540y(r4)
                    java.lang.Object r4 = r3.f10735d0
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    gg.g r4 = r3.f10736e0
                    java.lang.String r1 = r3.f10737f0
                    r3.f10734c0 = r2     // Catch: java.lang.Throwable -> Ld
                    java.lang.Object r4 = gg.C2369g.m6104e(r4, r1, r3)     // Catch: java.lang.Throwable -> Ld
                    if (r4 != r0) goto L2b
                    return r0
                L2b:
                    hg.a r4 = (p133hg.C3037a) r4     // Catch: java.lang.Throwable -> Ld
                    double r0 = r4.getAetherDouble()     // Catch: java.lang.Throwable -> Ld
                    java.lang.Double r4 = new java.lang.Double     // Catch: java.lang.Throwable -> Ld
                    r4.<init>(r0)     // Catch: java.lang.Throwable -> Ld
                    goto L3b
                L37:
                    java.lang.Object r4 = p074e9.C1805a.m4520e(r4)
                L3b:
                    ch.f r0 = new ch.f
                    r0.<init>(r4)
                    return r0
            }
        }

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.rplanet.RPlanetToolViewModel$refresh$1$1$claimLimitFuture$1", m7452f = "RPlanetToolViewModel.kt", m7453l = {94}, m7454m = "invokeSuspend")
        /* renamed from: gg.g$c$c, reason: collision with other inner class name */
        public static final class C7394c extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0979f<? extends p133hg.C3038b>>, java.lang.Object> {

            /* renamed from: c0 */
            public int f10738c0;

            /* renamed from: d0 */
            public /* synthetic */ java.lang.Object f10739d0;

            /* renamed from: e0 */
            public final /* synthetic */ gg.C2369g f10740e0;

            /* renamed from: f0 */
            public final /* synthetic */ java.lang.String f10741f0;

            public C7394c(gg.C2369g r1, java.lang.String r2, p101fh.InterfaceC2172d<? super gg.C2369g.c.C7394c> r3) {
                    r0 = this;
                    r0.f10740e0 = r1
                    r0.f10741f0 = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r4, p101fh.InterfaceC2172d<?> r5) {
                    r3 = this;
                    gg.g$c$c r0 = new gg.g$c$c
                    gg.g r1 = r3.f10740e0
                    java.lang.String r2 = r3.f10741f0
                    r0.<init>(r1, r2, r5)
                    r0.f10739d0 = r4
                    return r0
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r4, p101fh.InterfaceC2172d<? super ch.C0979f<? extends p133hg.C3038b>> r5) {
                    r3 = this;
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    fh.d r5 = (p101fh.InterfaceC2172d) r5
                    gg.g$c$c r0 = new gg.g$c$c
                    gg.g r1 = r3.f10740e0
                    java.lang.String r2 = r3.f10741f0
                    r0.<init>(r1, r2, r5)
                    r0.f10739d0 = r4
                    ch.l r4 = ch.C0985l.f5061a
                    java.lang.Object r4 = r0.mo123o(r4)
                    return r4
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r4) {
                    r3 = this;
                    gh.a r0 = gh.EnumC2389a.f10764Y
                    int r1 = r3.f10738c0
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
                    java.lang.Object r4 = r3.f10739d0
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    gg.g r4 = r3.f10740e0
                    java.lang.String r1 = r3.f10741f0
                    r3.f10738c0 = r2     // Catch: java.lang.Throwable -> Ld
                    java.lang.Object r4 = gg.C2369g.m6105f(r4, r1, r3)     // Catch: java.lang.Throwable -> Ld
                    if (r4 != r0) goto L2b
                    return r0
                L2b:
                    hg.b r4 = (p133hg.C3038b) r4     // Catch: java.lang.Throwable -> Ld
                    goto L32
                L2e:
                    java.lang.Object r4 = p074e9.C1805a.m4520e(r4)
                L32:
                    ch.f r0 = new ch.f
                    r0.<init>(r4)
                    return r0
            }
        }

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.rplanet.RPlanetToolViewModel$refresh$1$1$listLandFuture$1", m7452f = "RPlanetToolViewModel.kt", m7453l = {93}, m7454m = "invokeSuspend")
        /* renamed from: gg.g$c$d */
        public static final class d extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.util.List<? extends p255od.C5206h0>>>, java.lang.Object> {

            /* renamed from: c0 */
            public int f10742c0;

            /* renamed from: d0 */
            public /* synthetic */ java.lang.Object f10743d0;

            /* renamed from: e0 */
            public final /* synthetic */ gg.C2369g f10744e0;

            /* renamed from: f0 */
            public final /* synthetic */ java.lang.String f10745f0;

            public d(gg.C2369g r1, java.lang.String r2, p101fh.InterfaceC2172d<? super gg.C2369g.c.d> r3) {
                    r0 = this;
                    r0.f10744e0 = r1
                    r0.f10745f0 = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r4, p101fh.InterfaceC2172d<?> r5) {
                    r3 = this;
                    gg.g$c$d r0 = new gg.g$c$d
                    gg.g r1 = r3.f10744e0
                    java.lang.String r2 = r3.f10745f0
                    r0.<init>(r1, r2, r5)
                    r0.f10743d0 = r4
                    return r0
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r4, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.util.List<? extends p255od.C5206h0>>> r5) {
                    r3 = this;
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    fh.d r5 = (p101fh.InterfaceC2172d) r5
                    gg.g$c$d r0 = new gg.g$c$d
                    gg.g r1 = r3.f10744e0
                    java.lang.String r2 = r3.f10745f0
                    r0.<init>(r1, r2, r5)
                    r0.f10743d0 = r4
                    ch.l r4 = ch.C0985l.f5061a
                    java.lang.Object r4 = r0.mo123o(r4)
                    return r4
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r4) {
                    r3 = this;
                    gh.a r0 = gh.EnumC2389a.f10764Y
                    int r1 = r3.f10742c0
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
                    java.lang.Object r4 = r3.f10743d0
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    gg.g r4 = r3.f10744e0
                    java.lang.String r1 = r3.f10745f0
                    r3.f10742c0 = r2     // Catch: java.lang.Throwable -> Ld
                    java.lang.Object r4 = gg.C2369g.m6106g(r4, r1, r3)     // Catch: java.lang.Throwable -> Ld
                    if (r4 != r0) goto L2b
                    return r0
                L2b:
                    od.j0 r4 = (p255od.C5210j0) r4     // Catch: java.lang.Throwable -> Ld
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

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.rplanet.RPlanetToolViewModel$refresh$1$1$unclaimedFuture$1", m7452f = "RPlanetToolViewModel.kt", m7453l = {92}, m7454m = "invokeSuspend")
        /* renamed from: gg.g$c$e */
        public static final class e extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.lang.Double>>, java.lang.Object> {

            /* renamed from: c0 */
            public int f10746c0;

            /* renamed from: d0 */
            public /* synthetic */ java.lang.Object f10747d0;

            /* renamed from: e0 */
            public final /* synthetic */ gg.C2369g f10748e0;

            /* renamed from: f0 */
            public final /* synthetic */ java.lang.String f10749f0;

            public e(gg.C2369g r1, java.lang.String r2, p101fh.InterfaceC2172d<? super gg.C2369g.c.e> r3) {
                    r0 = this;
                    r0.f10748e0 = r1
                    r0.f10749f0 = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r4, p101fh.InterfaceC2172d<?> r5) {
                    r3 = this;
                    gg.g$c$e r0 = new gg.g$c$e
                    gg.g r1 = r3.f10748e0
                    java.lang.String r2 = r3.f10749f0
                    r0.<init>(r1, r2, r5)
                    r0.f10747d0 = r4
                    return r0
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r4, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.lang.Double>> r5) {
                    r3 = this;
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    fh.d r5 = (p101fh.InterfaceC2172d) r5
                    gg.g$c$e r0 = new gg.g$c$e
                    gg.g r1 = r3.f10748e0
                    java.lang.String r2 = r3.f10749f0
                    r0.<init>(r1, r2, r5)
                    r0.f10747d0 = r4
                    ch.l r4 = ch.C0985l.f5061a
                    java.lang.Object r4 = r0.mo123o(r4)
                    return r4
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r4) {
                    r3 = this;
                    gh.a r0 = gh.EnumC2389a.f10764Y
                    int r1 = r3.f10746c0
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    p074e9.C1805a.m4540y(r4)     // Catch: java.lang.Throwable -> Ld
                    goto L2b
                Ld:
                    r4 = move-exception
                    goto L37
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    p074e9.C1805a.m4540y(r4)
                    java.lang.Object r4 = r3.f10747d0
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    gg.g r4 = r3.f10748e0
                    java.lang.String r1 = r3.f10749f0
                    r3.f10746c0 = r2     // Catch: java.lang.Throwable -> Ld
                    java.lang.Object r4 = gg.C2369g.m6103d(r4, r1, r3)     // Catch: java.lang.Throwable -> Ld
                    if (r4 != r0) goto L2b
                    return r0
                L2b:
                    hg.a r4 = (p133hg.C3037a) r4     // Catch: java.lang.Throwable -> Ld
                    double r0 = r4.getAetherDouble()     // Catch: java.lang.Throwable -> Ld
                    java.lang.Double r4 = new java.lang.Double     // Catch: java.lang.Throwable -> Ld
                    r4.<init>(r0)     // Catch: java.lang.Throwable -> Ld
                    goto L3b
                L37:
                    java.lang.Object r4 = p074e9.C1805a.m4520e(r4)
                L3b:
                    ch.f r0 = new ch.f
                    r0.<init>(r4)
                    return r0
            }
        }

        public c(gg.C2369g r1, java.lang.String r2, p101fh.InterfaceC2172d<? super gg.C2369g.c> r3) {
                r0 = this;
                r0.f10731i0 = r1
                r0.f10732j0 = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: h */
        public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r4, p101fh.InterfaceC2172d<?> r5) {
                r3 = this;
                gg.g$c r0 = new gg.g$c
                gg.g r1 = r3.f10731i0
                java.lang.String r2 = r3.f10732j0
                r0.<init>(r1, r2, r5)
                r0.f10730h0 = r4
                return r0
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r4, p101fh.InterfaceC2172d<? super ch.C0985l> r5) {
                r3 = this;
                vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                fh.d r5 = (p101fh.InterfaceC2172d) r5
                gg.g$c r0 = new gg.g$c
                gg.g r1 = r3.f10731i0
                java.lang.String r2 = r3.f10732j0
                r0.<init>(r1, r2, r5)
                r0.f10730h0 = r4
                ch.l r4 = ch.C0985l.f5061a
                java.lang.Object r4 = r0.mo123o(r4)
                return r4
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r19) {
                r18 = this;
                r1 = r18
                gh.a r0 = gh.EnumC2389a.f10764Y
                int r2 = r1.f10729g0
                r3 = 4
                r4 = 5
                r5 = 3
                r6 = 2
                r7 = 1
                r8 = 0
                if (r2 == 0) goto L82
                if (r2 == r7) goto L65
                if (r2 == r6) goto L4c
                if (r2 == r5) goto L3b
                if (r2 == r3) goto L2b
                if (r2 != r4) goto L23
                java.lang.Object r0 = r1.f10730h0
                gg.g r0 = (gg.C2369g) r0
                p074e9.C1805a.m4540y(r19)     // Catch: java.lang.Throwable -> L190
                r2 = r19
                goto L176
            L23:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L2b:
                java.lang.Object r2 = r1.f10725c0
                vh.f0 r2 = (p379vh.InterfaceC6698f0) r2
                java.lang.Object r3 = r1.f10730h0
                gg.g r3 = (gg.C2369g) r3
                p074e9.C1805a.m4540y(r19)     // Catch: java.lang.Throwable -> L190
                r6 = r3
                r3 = r19
                goto L143
            L3b:
                java.lang.Object r2 = r1.f10726d0
                vh.f0 r2 = (p379vh.InterfaceC6698f0) r2
                java.lang.Object r5 = r1.f10725c0
                vh.f0 r5 = (p379vh.InterfaceC6698f0) r5
                java.lang.Object r6 = r1.f10730h0
                gg.g r6 = (gg.C2369g) r6
                p074e9.C1805a.m4540y(r19)     // Catch: java.lang.Throwable -> L190
                goto L133
            L4c:
                java.lang.Object r2 = r1.f10727e0
                androidx.lifecycle.d0 r2 = (androidx.lifecycle.C0437d0) r2
                java.lang.Object r6 = r1.f10726d0
                vh.f0 r6 = (p379vh.InterfaceC6698f0) r6
                java.lang.Object r9 = r1.f10725c0
                vh.f0 r9 = (p379vh.InterfaceC6698f0) r9
                java.lang.Object r10 = r1.f10730h0
                gg.g r10 = (gg.C2369g) r10
                p074e9.C1805a.m4540y(r19)     // Catch: java.lang.Throwable -> L190
                r4 = r6
                r3 = r9
                r6 = r19
                goto L10c
            L65:
                java.lang.Object r2 = r1.f10728f0
                androidx.lifecycle.d0 r2 = (androidx.lifecycle.C0437d0) r2
                java.lang.Object r9 = r1.f10727e0
                vh.f0 r9 = (p379vh.InterfaceC6698f0) r9
                java.lang.Object r10 = r1.f10726d0
                vh.f0 r10 = (p379vh.InterfaceC6698f0) r10
                java.lang.Object r11 = r1.f10725c0
                vh.f0 r11 = (p379vh.InterfaceC6698f0) r11
                java.lang.Object r12 = r1.f10730h0
                gg.g r12 = (gg.C2369g) r12
                p074e9.C1805a.m4540y(r19)     // Catch: java.lang.Throwable -> L190
                r4 = r9
                r3 = r10
                r10 = r19
                goto Lec
            L82:
                p074e9.C1805a.m4540y(r19)
                java.lang.Object r2 = r1.f10730h0
                vh.b0 r2 = (p379vh.InterfaceC6686b0) r2
                gg.g r15 = r1.f10731i0
                java.lang.String r14 = r1.f10732j0
                r10 = 0
                gg.g$c$b r12 = new gg.g$c$b     // Catch: java.lang.Throwable -> L190
                r12.<init>(r15, r14, r8)     // Catch: java.lang.Throwable -> L190
                r13 = 3
                r16 = 0
                r11 = 0
                r9 = r2
                r4 = r14
                r14 = r16
                vh.f0 r16 = p101fh.C2174f.m5714d(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L190
                r10 = 0
                gg.g$c$e r12 = new gg.g$c$e     // Catch: java.lang.Throwable -> L190
                r12.<init>(r15, r4, r8)     // Catch: java.lang.Throwable -> L190
                r13 = 3
                r14 = 0
                r11 = 0
                r9 = r2
                vh.f0 r14 = p101fh.C2174f.m5714d(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L190
                r10 = 0
                gg.g$c$d r12 = new gg.g$c$d     // Catch: java.lang.Throwable -> L190
                r12.<init>(r15, r4, r8)     // Catch: java.lang.Throwable -> L190
                r13 = 3
                r17 = 0
                r11 = 0
                r9 = r2
                r3 = r14
                r14 = r17
                vh.f0 r14 = p101fh.C2174f.m5714d(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L190
                r10 = 0
                gg.g$c$c r12 = new gg.g$c$c     // Catch: java.lang.Throwable -> L190
                r12.<init>(r15, r4, r8)     // Catch: java.lang.Throwable -> L190
                r13 = 3
                r4 = 0
                r11 = 0
                r9 = r2
                r2 = r14
                r14 = r4
                vh.f0 r4 = p101fh.C2174f.m5714d(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L190
                androidx.lifecycle.d0<java.lang.Double> r9 = r15.f10712g     // Catch: java.lang.Throwable -> L190
                r1.f10730h0 = r15     // Catch: java.lang.Throwable -> L190
                r1.f10725c0 = r3     // Catch: java.lang.Throwable -> L190
                r1.f10726d0 = r2     // Catch: java.lang.Throwable -> L190
                r1.f10727e0 = r4     // Catch: java.lang.Throwable -> L190
                r1.f10728f0 = r9     // Catch: java.lang.Throwable -> L190
                r1.f10729g0 = r7     // Catch: java.lang.Throwable -> L190
                r10 = r16
                vh.g0 r10 = (p379vh.C6701g0) r10     // Catch: java.lang.Throwable -> L190
                java.lang.Object r10 = r10.mo13566Q(r1)     // Catch: java.lang.Throwable -> L190
                if (r10 != r0) goto Le8
                return r0
            Le8:
                r11 = r3
                r12 = r15
                r3 = r2
                r2 = r9
            Lec:
                ch.f r10 = (ch.C0979f) r10     // Catch: java.lang.Throwable -> L190
                java.lang.Object r9 = r10.f5052Y     // Catch: java.lang.Throwable -> L190
                p074e9.C1805a.m4540y(r9)     // Catch: java.lang.Throwable -> L190
                r2.mo1415j(r9)     // Catch: java.lang.Throwable -> L190
                androidx.lifecycle.d0<java.lang.Double> r2 = r12.f10713h     // Catch: java.lang.Throwable -> L190
                r1.f10730h0 = r12     // Catch: java.lang.Throwable -> L190
                r1.f10725c0 = r3     // Catch: java.lang.Throwable -> L190
                r1.f10726d0 = r4     // Catch: java.lang.Throwable -> L190
                r1.f10727e0 = r2     // Catch: java.lang.Throwable -> L190
                r1.f10728f0 = r8     // Catch: java.lang.Throwable -> L190
                r1.f10729g0 = r6     // Catch: java.lang.Throwable -> L190
                java.lang.Object r6 = r11.mo13566Q(r1)     // Catch: java.lang.Throwable -> L190
                if (r6 != r0) goto L10b
                return r0
            L10b:
                r10 = r12
            L10c:
                ch.f r6 = (ch.C0979f) r6     // Catch: java.lang.Throwable -> L190
                java.lang.Object r6 = r6.f5052Y     // Catch: java.lang.Throwable -> L190
                p074e9.C1805a.m4540y(r6)     // Catch: java.lang.Throwable -> L190
                r2.mo1415j(r6)     // Catch: java.lang.Throwable -> L190
                vh.z r2 = p379vh.C6716l0.f26007a     // Catch: java.lang.Throwable -> L190
                vh.k1 r2 = p459zh.C7346l.f28106a     // Catch: java.lang.Throwable -> L190
                gg.g$c$a r6 = new gg.g$c$a     // Catch: java.lang.Throwable -> L190
                r6.<init>(r10, r8)     // Catch: java.lang.Throwable -> L190
                r1.f10730h0 = r10     // Catch: java.lang.Throwable -> L190
                r1.f10725c0 = r3     // Catch: java.lang.Throwable -> L190
                r1.f10726d0 = r4     // Catch: java.lang.Throwable -> L190
                r1.f10727e0 = r8     // Catch: java.lang.Throwable -> L190
                r1.f10729g0 = r5     // Catch: java.lang.Throwable -> L190
                java.lang.Object r2 = p101fh.C2174f.m5710A(r2, r6, r1)     // Catch: java.lang.Throwable -> L190
                if (r2 != r0) goto L130
                return r0
            L130:
                r5 = r3
                r2 = r4
                r6 = r10
            L133:
                r1.f10730h0 = r6     // Catch: java.lang.Throwable -> L190
                r1.f10725c0 = r2     // Catch: java.lang.Throwable -> L190
                r1.f10726d0 = r8     // Catch: java.lang.Throwable -> L190
                r3 = 4
                r1.f10729g0 = r3     // Catch: java.lang.Throwable -> L190
                java.lang.Object r3 = r5.mo13566Q(r1)     // Catch: java.lang.Throwable -> L190
                if (r3 != r0) goto L143
                return r0
            L143:
                ch.f r3 = (ch.C0979f) r3     // Catch: java.lang.Throwable -> L190
                java.lang.Object r3 = r3.f5052Y     // Catch: java.lang.Throwable -> L190
                p074e9.C1805a.m4540y(r3)     // Catch: java.lang.Throwable -> L190
                java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L190
                androidx.lifecycle.d0<java.util.List<od.h0>> r4 = r6.f10715j     // Catch: java.lang.Throwable -> L190
                r4.mo1415j(r3)     // Catch: java.lang.Throwable -> L190
                androidx.lifecycle.d0<java.util.List<od.h0>> r4 = r6.f10715j     // Catch: java.lang.Throwable -> L190
                r4.mo1415j(r3)     // Catch: java.lang.Throwable -> L190
                androidx.lifecycle.d0<java.lang.Boolean> r4 = r6.f10714i     // Catch: java.lang.Throwable -> L190
                boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L190
                if (r3 != 0) goto L15f
                goto L160
            L15f:
                r7 = 0
            L160:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L190
                r4.mo1415j(r3)     // Catch: java.lang.Throwable -> L190
                r1.f10730h0 = r6     // Catch: java.lang.Throwable -> L190
                r1.f10725c0 = r8     // Catch: java.lang.Throwable -> L190
                r3 = 5
                r1.f10729g0 = r3     // Catch: java.lang.Throwable -> L190
                java.lang.Object r2 = r2.mo13566Q(r1)     // Catch: java.lang.Throwable -> L190
                if (r2 != r0) goto L175
                return r0
            L175:
                r0 = r6
            L176:
                ch.f r2 = (ch.C0979f) r2     // Catch: java.lang.Throwable -> L190
                java.lang.Object r2 = r2.f5052Y     // Catch: java.lang.Throwable -> L190
                p074e9.C1805a.m4540y(r2)     // Catch: java.lang.Throwable -> L190
                hg.b r2 = (p133hg.C3038b) r2     // Catch: java.lang.Throwable -> L190
                androidx.lifecycle.d0<java.lang.Double> r0 = r0.f10716k     // Catch: java.lang.Throwable -> L190
                double r2 = p133hg.C3039c.getClaimLimit(r2)     // Catch: java.lang.Throwable -> L190
                java.lang.Double r4 = new java.lang.Double     // Catch: java.lang.Throwable -> L190
                r4.<init>(r2)     // Catch: java.lang.Throwable -> L190
                r0.mo1415j(r4)     // Catch: java.lang.Throwable -> L190
                ch.l r0 = ch.C0985l.f5061a     // Catch: java.lang.Throwable -> L190
                goto L195
            L190:
                r0 = move-exception
                java.lang.Object r0 = p074e9.C1805a.m4520e(r0)
            L195:
                gg.g r2 = r1.f10731i0
                java.lang.Throwable r0 = ch.C0979f.m2690b(r0)
                if (r0 == 0) goto L1b4
                java.lang.String r0 = vg.C6672m.m13514a(r0)
                androidx.lifecycle.d0<vg.b<ah.a>> r2 = r2.f10719n
                vg.b r3 = new vg.b
                ah.a r4 = new ah.a
                zg.d r5 = p458zg.EnumC7332d.f28068Z
                java.lang.String r6 = "Error"
                r4.<init>(r6, r0, r5)
                r3.<init>(r4)
                r2.mo1415j(r3)
            L1b4:
                gg.g r0 = r1.f10731i0
                android.os.CountDownTimer r2 = r0.f10721p
                if (r2 == 0) goto L1bd
                r2.cancel()
            L1bd:
                gg.a0 r2 = new gg.a0
                r2.<init>(r0)
                android.os.CountDownTimer r2 = r2.start()
                r0.f10721p = r2
                gg.g r0 = r1.f10731i0
                androidx.lifecycle.d0<java.lang.Boolean> r0 = r0.f10710e
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                r0.mo1415j(r2)
                ch.l r0 = ch.C0985l.f5061a
                return r0
        }
    }

    public C2369g(android.app.Application r2, p238nd.C4728b0 r3) {
            r1 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.f10708c = r3
            gg.g$b r0 = new gg.g$b
            r0.<init>(r2)
            ch.d r2 = p185k7.C4038x4.m9096i(r0)
            r1.f10709d = r2
            java.util.Objects.requireNonNull(r3)
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f10710e = r2
            r1.f10711f = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f10712g = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f10713h = r2
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.<init>(r0)
            r1.f10714i = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r1.f10715j = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r1.f10716k = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r1.f10717l = r3
            k1.c r3 = p179k1.C3644c.f16104z0
            androidx.lifecycle.LiveData r2 = androidx.lifecycle.C0455m0.m1450a(r2, r3)
            r1.f10718m = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f10719n = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f10720o = r2
            return
    }

    /* renamed from: d */
    public static final java.lang.Object m6103d(gg.C2369g r4, java.lang.String r5, p101fh.InterfaceC2172d r6) {
            java.util.Objects.requireNonNull(r4)
            fh.j r0 = new fh.j
            fh.d r6 = gh.C2390b.m6127q(r6)
            r0.<init>(r6)
            java.lang.String r6 = " { \"account\": \""
            java.lang.String r1 = "\" }"
            java.lang.String r5 = android.support.v4.media.C0145d.m257a(r6, r5, r1)
            gg.l r6 = new gg.l
            r6.<init>(r0)
            gg.m r1 = new gg.m
            r1.<init>(r0)
            gg.j r2 = new gg.j
            java.lang.String r3 = "https://rplanet.io/api/get_collected"
            r2.<init>(r3, r5, r6, r1)
            g2.o r4 = r4.m6108i()
            r4.m5814a(r2)
            java.lang.Object r4 = r0.m5741a()
            return r4
    }

    /* renamed from: e */
    public static final java.lang.Object m6104e(gg.C2369g r4, java.lang.String r5, p101fh.InterfaceC2172d r6) {
            java.util.Objects.requireNonNull(r4)
            fh.j r0 = new fh.j
            fh.d r6 = gh.C2390b.m6127q(r6)
            r0.<init>(r6)
            java.lang.String r6 = " { \"account\": \""
            java.lang.String r1 = "\" }"
            java.lang.String r5 = android.support.v4.media.C0145d.m257a(r6, r5, r1)
            gg.p r6 = new gg.p
            r6.<init>(r0)
            gg.q r1 = new gg.q
            r1.<init>(r0)
            gg.n r2 = new gg.n
            java.lang.String r3 = "https://rplanet.io/api/get_reward"
            r2.<init>(r3, r5, r6, r1)
            g2.o r4 = r4.m6108i()
            r4.m5814a(r2)
            java.lang.Object r4 = r0.m5741a()
            return r4
    }

    /* renamed from: f */
    public static final java.lang.Object m6105f(gg.C2369g r4, java.lang.String r5, p101fh.InterfaceC2172d r6) {
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
            java.lang.String r2 = "\n               {\n                 \"json\": true,\n                 \"code\": \"s.rplanet\",\n                 \"scope\": \"s.rplanet\",\n                 \"table\": \"claimlimits\",\n                 \"lower_bound\": \""
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = "\",\n                 \"upper_bound\": \""
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = "\",\n                 \"index_position\": 1,\n                 \"key_type\": \"name\",\n                 \"limit\": 1,\n                 \"reverse\": false,\n                 \"show_payer\": false\n               }\n            "
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = p362uh.C6459e.m13046C(r5)
            gg.t r1 = new gg.t
            r1.<init>(r0)
            gg.u r2 = new gg.u
            r2.<init>(r0)
            gg.r r3 = new gg.r
            r3.<init>(r6, r5, r1, r2)
            g2.o r4 = r4.m6108i()
            r4.m5814a(r3)
            java.lang.Object r4 = r0.m5741a()
            return r4
    }

    /* renamed from: g */
    public static final java.lang.Object m6106g(gg.C2369g r3, java.lang.String r4, p101fh.InterfaceC2172d r5) {
            java.util.Objects.requireNonNull(r3)
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
            java.lang.String r1 = "/v1/assets?owner="
            r5.append(r1)
            r5.append(r4)
            java.lang.String r4 = "&collection_name=rplanet&schema_name=lands%2Clands2%2Clands3&page=1&limit=1000&order=desc&sort=asset_id"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            gg.y r5 = new gg.y
            r5.<init>(r0)
            gg.z r1 = new gg.z
            r1.<init>(r0)
            gg.w r2 = new gg.w
            r2.<init>(r4, r5, r1)
            g2.o r3 = r3.m6108i()
            r3.m5814a(r2)
            java.lang.Object r3 = r0.m5741a()
            return r3
    }

    @Override // androidx.lifecycle.AbstractC0457n0
    /* renamed from: b */
    public void mo8b() {
            r1 = this;
            android.os.CountDownTimer r0 = r1.f10721p
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            android.os.CountDownTimer r0 = r1.f10722q
            if (r0 == 0) goto Le
            r0.cancel()
        Le:
            return
    }

    /* renamed from: h */
    public final void m6107h(android.content.Context r9, boolean r10) {
            r8 = this;
            java.lang.String r0 = "context"
            p214m2.C4339q.m9706k(r9, r0)
            androidx.lifecycle.d0<java.lang.Double> r1 = r8.f10713h
            java.lang.Object r1 = r1.m1411d()
            java.lang.Double r1 = (java.lang.Double) r1
            if (r1 != 0) goto L15
            r1 = 0
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
        L15:
            double r1 = r1.doubleValue()
            int r1 = (int) r1
            androidx.lifecycle.d0<java.lang.Double> r2 = r8.f10716k
            java.lang.Object r2 = r2.m1411d()
            java.lang.Double r2 = (java.lang.Double) r2
            if (r2 != 0) goto L2d
            r2 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
        L2d:
            double r2 = r2.doubleValue()
            int r2 = (int) r2
            if (r10 != 0) goto L49
            if (r1 <= r2) goto L49
            androidx.lifecycle.d0<vg.b<java.lang.String>> r9 = r8.f10720o
            vg.b r10 = new vg.b
            java.lang.String r0 = "Mined: "
            java.lang.String r3 = " \nClaim Limit: "
            java.lang.String r0 = p243o1.C4872b.m11020a(r0, r1, r3, r2)
            r10.<init>(r0)
            r9.mo7l(r10)
            return
        L49:
            nd.b0 r10 = r8.f10708c
            gg.g$a r1 = new gg.g$a
            r1.<init>(r8)
            java.util.Objects.requireNonNull(r10)
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "completion"
            p214m2.C4339q.m9706k(r1, r0)
            r10.f18918n = r1
            id.b r0 = r10.m10795h()
            if (r0 != 0) goto L64
            goto L9c
        L64:
            java.lang.String r1 = r0.f12559a
            int r2 = r1.length()
            r3 = 1
            if (r2 != 0) goto L6f
            r2 = 1
            goto L70
        L6f:
            r2 = 0
        L70:
            if (r2 != 0) goto L9d
            one.block.eosiojava.models.rpcProvider.Authorization r2 = new one.block.eosiojava.models.rpcProvider.Authorization
            java.lang.String r4 = r10.f18911g
            r2.<init>(r1, r4)
            b3.b r4 = new b3.b
            r4.<init>(r3)
            nd.w0 r3 = new nd.w0
            pd.r0 r5 = new pd.r0
            r5.<init>(r1)
            java.util.List r1 = p074e9.C1805a.m4528m(r2)
            java.lang.String r6 = "s.rplanet"
            java.lang.String r7 = "claim"
            r3.<init>(r6, r7, r5, r1)
            r4.m2208c(r3)
            nd.a r1 = p238nd.EnumC4724a.f18872b0
            r4.m2209d(r1, r2)
            r1 = 0
            r10.m10804r(r9, r0, r4, r1)
        L9c:
            return
        L9d:
            java.lang.Exception r9 = new java.lang.Exception
            java.lang.String r10 = "USER_NOT_SIGNED"
            r9.<init>(r10)
            throw r9
    }

    /* renamed from: i */
    public final p105g2.C2221o m6108i() {
            r1 = this;
            ch.d r0 = r1.f10709d
            java.lang.Object r0 = r0.getValue()
            g2.o r0 = (p105g2.C2221o) r0
            return r0
    }

    /* renamed from: j */
    public final void m6109j() {
            r9 = this;
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r9.f10710e
            java.lang.Object r0 = r0.m1411d()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto Lf
            return
        Lf:
            nd.b0 r0 = r9.f10708c
            id.b r0 = r0.m10795h()
            if (r0 == 0) goto L3d
            java.lang.String r0 = r0.f12559a
            if (r0 != 0) goto L1c
            goto L3d
        L1c:
            androidx.lifecycle.d0<java.lang.Boolean> r2 = r9.f10710e
            r2.mo7l(r1)
            androidx.lifecycle.d0<java.lang.Long> r1 = r9.f10717l
            r2 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.mo7l(r2)
            vh.b0 r3 = p064e.C1488b.m4037d(r9)
            r4 = 0
            gg.g$c r6 = new gg.g$c
            r1 = 0
            r6.<init>(r9, r0, r1)
            r7 = 3
            r8 = 0
            r5 = 0
            p101fh.C2174f.m5714d(r3, r4, r5, r6, r7, r8)
        L3d:
            return
    }
}
