package bf;

/* renamed from: bf.p */
/* loaded from: classes.dex */
public final class C0756p extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4728b0 f4071c;

    /* renamed from: d */
    public final ch.InterfaceC0977d f4072d;

    /* renamed from: e */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f4073e;

    /* renamed from: f */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f4074f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<java.lang.Long> f4075g;

    /* renamed from: h */
    public final androidx.lifecycle.LiveData<java.lang.Long> f4076h;

    /* renamed from: i */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f4077i;

    /* renamed from: bf.p$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f4078Z;

        public a(android.app.Application r1) {
                r0 = this;
                r0.f4078Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f4078Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.castles.CastleNftToolViewModel$refresh$1", m7452f = "CastleNftToolViewModel.kt", m7453l = {57, 58, 59}, m7454m = "invokeSuspend")
    /* renamed from: bf.p$b */
    public static final class b extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

        /* renamed from: c0 */
        public java.lang.Object f4079c0;

        /* renamed from: d0 */
        public java.lang.Object f4080d0;

        /* renamed from: e0 */
        public int f4081e0;

        /* renamed from: f0 */
        public /* synthetic */ java.lang.Object f4082f0;

        /* renamed from: g0 */
        public final /* synthetic */ bf.C0756p f4083g0;

        /* renamed from: h0 */
        public final /* synthetic */ java.lang.String f4084h0;

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.castles.CastleNftToolViewModel$refresh$1$1$bonusFuture$1", m7452f = "CastleNftToolViewModel.kt", m7453l = {55}, m7454m = "invokeSuspend")
        /* renamed from: bf.p$b$a */
        public static final class a extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.util.List<? extends cf.C0956a>>>, java.lang.Object> {

            /* renamed from: c0 */
            public int f4085c0;

            /* renamed from: d0 */
            public /* synthetic */ java.lang.Object f4086d0;

            /* renamed from: e0 */
            public final /* synthetic */ bf.C0756p f4087e0;

            public a(bf.C0756p r1, p101fh.InterfaceC2172d<? super bf.C0756p.b.a> r2) {
                    r0 = this;
                    r0.f4087e0 = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                    r2 = this;
                    bf.p$b$a r0 = new bf.p$b$a
                    bf.p r1 = r2.f4087e0
                    r0.<init>(r1, r4)
                    r0.f4086d0 = r3
                    return r0
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.util.List<? extends cf.C0956a>>> r4) {
                    r2 = this;
                    vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                    fh.d r4 = (p101fh.InterfaceC2172d) r4
                    bf.p$b$a r0 = new bf.p$b$a
                    bf.p r1 = r2.f4087e0
                    r0.<init>(r1, r4)
                    r0.f4086d0 = r3
                    ch.l r3 = ch.C0985l.f5061a
                    java.lang.Object r3 = r0.mo123o(r3)
                    return r3
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r4) {
                    r3 = this;
                    gh.a r0 = gh.EnumC2389a.f10764Y
                    int r1 = r3.f4085c0
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    p074e9.C1805a.m4540y(r4)     // Catch: java.lang.Throwable -> Ld
                    goto L29
                Ld:
                    r4 = move-exception
                    goto L30
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    p074e9.C1805a.m4540y(r4)
                    java.lang.Object r4 = r3.f4086d0
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    bf.p r4 = r3.f4087e0
                    r3.f4085c0 = r2     // Catch: java.lang.Throwable -> Ld
                    java.lang.Object r4 = bf.C0756p.m2351d(r4, r3)     // Catch: java.lang.Throwable -> Ld
                    if (r4 != r0) goto L29
                    return r0
                L29:
                    md.j r4 = (md.C4559j) r4     // Catch: java.lang.Throwable -> Ld
                    java.util.List r4 = r4.getRows()     // Catch: java.lang.Throwable -> Ld
                    goto L34
                L30:
                    java.lang.Object r4 = p074e9.C1805a.m4520e(r4)
                L34:
                    ch.f r0 = new ch.f
                    r0.<init>(r4)
                    return r0
            }
        }

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.castles.CastleNftToolViewModel$refresh$1$1$factorsFuture$1", m7452f = "CastleNftToolViewModel.kt", m7453l = {54}, m7454m = "invokeSuspend")
        /* renamed from: bf.p$b$b, reason: collision with other inner class name */
        public static final class C7369b extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.util.List<? extends cf.C0958c>>>, java.lang.Object> {

            /* renamed from: c0 */
            public int f4088c0;

            /* renamed from: d0 */
            public /* synthetic */ java.lang.Object f4089d0;

            /* renamed from: e0 */
            public final /* synthetic */ bf.C0756p f4090e0;

            public C7369b(bf.C0756p r1, p101fh.InterfaceC2172d<? super bf.C0756p.b.C7369b> r2) {
                    r0 = this;
                    r0.f4090e0 = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                    r2 = this;
                    bf.p$b$b r0 = new bf.p$b$b
                    bf.p r1 = r2.f4090e0
                    r0.<init>(r1, r4)
                    r0.f4089d0 = r3
                    return r0
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.util.List<? extends cf.C0958c>>> r4) {
                    r2 = this;
                    vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                    fh.d r4 = (p101fh.InterfaceC2172d) r4
                    bf.p$b$b r0 = new bf.p$b$b
                    bf.p r1 = r2.f4090e0
                    r0.<init>(r1, r4)
                    r0.f4089d0 = r3
                    ch.l r3 = ch.C0985l.f5061a
                    java.lang.Object r3 = r0.mo123o(r3)
                    return r3
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r4) {
                    r3 = this;
                    gh.a r0 = gh.EnumC2389a.f10764Y
                    int r1 = r3.f4088c0
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    p074e9.C1805a.m4540y(r4)     // Catch: java.lang.Throwable -> Ld
                    goto L29
                Ld:
                    r4 = move-exception
                    goto L30
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    p074e9.C1805a.m4540y(r4)
                    java.lang.Object r4 = r3.f4089d0
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    bf.p r4 = r3.f4090e0
                    r3.f4088c0 = r2     // Catch: java.lang.Throwable -> Ld
                    java.lang.Object r4 = bf.C0756p.m2352e(r4, r3)     // Catch: java.lang.Throwable -> Ld
                    if (r4 != r0) goto L29
                    return r0
                L29:
                    md.j r4 = (md.C4559j) r4     // Catch: java.lang.Throwable -> Ld
                    java.util.List r4 = r4.getRows()     // Catch: java.lang.Throwable -> Ld
                    goto L34
                L30:
                    java.lang.Object r4 = p074e9.C1805a.m4520e(r4)
                L34:
                    ch.f r0 = new ch.f
                    r0.<init>(r4)
                    return r0
            }
        }

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.castles.CastleNftToolViewModel$refresh$1$1$userInfoFuture$1", m7452f = "CastleNftToolViewModel.kt", m7453l = {53}, m7454m = "invokeSuspend")
        /* renamed from: bf.p$b$c */
        public static final class c extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0979f<? extends cf.C0957b>>, java.lang.Object> {

            /* renamed from: c0 */
            public int f4091c0;

            /* renamed from: d0 */
            public /* synthetic */ java.lang.Object f4092d0;

            /* renamed from: e0 */
            public final /* synthetic */ bf.C0756p f4093e0;

            /* renamed from: f0 */
            public final /* synthetic */ java.lang.String f4094f0;

            public c(bf.C0756p r1, java.lang.String r2, p101fh.InterfaceC2172d<? super bf.C0756p.b.c> r3) {
                    r0 = this;
                    r0.f4093e0 = r1
                    r0.f4094f0 = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r4, p101fh.InterfaceC2172d<?> r5) {
                    r3 = this;
                    bf.p$b$c r0 = new bf.p$b$c
                    bf.p r1 = r3.f4093e0
                    java.lang.String r2 = r3.f4094f0
                    r0.<init>(r1, r2, r5)
                    r0.f4092d0 = r4
                    return r0
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r4, p101fh.InterfaceC2172d<? super ch.C0979f<? extends cf.C0957b>> r5) {
                    r3 = this;
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    fh.d r5 = (p101fh.InterfaceC2172d) r5
                    bf.p$b$c r0 = new bf.p$b$c
                    bf.p r1 = r3.f4093e0
                    java.lang.String r2 = r3.f4094f0
                    r0.<init>(r1, r2, r5)
                    r0.f4092d0 = r4
                    ch.l r4 = ch.C0985l.f5061a
                    java.lang.Object r4 = r0.mo123o(r4)
                    return r4
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r4) {
                    r3 = this;
                    gh.a r0 = gh.EnumC2389a.f10764Y
                    int r1 = r3.f4091c0
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    p074e9.C1805a.m4540y(r4)     // Catch: java.lang.Throwable -> Ld
                    goto L2b
                Ld:
                    r4 = move-exception
                    goto L38
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    p074e9.C1805a.m4540y(r4)
                    java.lang.Object r4 = r3.f4092d0
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    bf.p r4 = r3.f4093e0
                    java.lang.String r1 = r3.f4094f0
                    r3.f4091c0 = r2     // Catch: java.lang.Throwable -> Ld
                    java.lang.Object r4 = bf.C0756p.m2353f(r4, r1, r3)     // Catch: java.lang.Throwable -> Ld
                    if (r4 != r0) goto L2b
                    return r0
                L2b:
                    md.j r4 = (md.C4559j) r4     // Catch: java.lang.Throwable -> Ld
                    java.util.List r4 = r4.getRows()     // Catch: java.lang.Throwable -> Ld
                    java.lang.Object r4 = p062dh.C1473i.m3996H(r4)     // Catch: java.lang.Throwable -> Ld
                    cf.b r4 = (cf.C0957b) r4     // Catch: java.lang.Throwable -> Ld
                    goto L3c
                L38:
                    java.lang.Object r4 = p074e9.C1805a.m4520e(r4)
                L3c:
                    ch.f r0 = new ch.f
                    r0.<init>(r4)
                    return r0
            }
        }

        public b(bf.C0756p r1, java.lang.String r2, p101fh.InterfaceC2172d<? super bf.C0756p.b> r3) {
                r0 = this;
                r0.f4083g0 = r1
                r0.f4084h0 = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: h */
        public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r4, p101fh.InterfaceC2172d<?> r5) {
                r3 = this;
                bf.p$b r0 = new bf.p$b
                bf.p r1 = r3.f4083g0
                java.lang.String r2 = r3.f4084h0
                r0.<init>(r1, r2, r5)
                r0.f4082f0 = r4
                return r0
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r4, p101fh.InterfaceC2172d<? super ch.C0985l> r5) {
                r3 = this;
                vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                fh.d r5 = (p101fh.InterfaceC2172d) r5
                bf.p$b r0 = new bf.p$b
                bf.p r1 = r3.f4083g0
                java.lang.String r2 = r3.f4084h0
                r0.<init>(r1, r2, r5)
                r0.f4082f0 = r4
                ch.l r4 = ch.C0985l.f5061a
                java.lang.Object r4 = r0.mo123o(r4)
                return r4
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r23) {
                r22 = this;
                r1 = r22
                java.lang.String r0 = "types"
                gh.a r2 = gh.EnumC2389a.f10764Y
                int r3 = r1.f4081e0
                r4 = 1
                r5 = 2
                r6 = 3
                if (r3 == 0) goto L5c
                if (r3 == r4) goto L44
                if (r3 == r5) goto L2f
                if (r3 != r6) goto L27
                java.lang.Object r2 = r1.f4080d0
                cf.b r2 = (cf.C0957b) r2
                java.lang.Object r3 = r1.f4079c0
                java.util.List r3 = (java.util.List) r3
                java.lang.Object r6 = r1.f4082f0
                bf.p r6 = (bf.C0756p) r6
                p074e9.C1805a.m4540y(r23)     // Catch: java.lang.Throwable -> L29b
                r13 = r6
                r6 = r23
                goto Ld6
            L27:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L2f:
                java.lang.Object r3 = r1.f4080d0
                cf.b r3 = (cf.C0957b) r3
                java.lang.Object r7 = r1.f4079c0
                vh.f0 r7 = (p379vh.InterfaceC6698f0) r7
                java.lang.Object r8 = r1.f4082f0
                bf.p r8 = (bf.C0756p) r8
                p074e9.C1805a.m4540y(r23)     // Catch: java.lang.Throwable -> L29b
                r13 = r8
                r8 = r3
                r3 = r23
                goto Lbd
            L44:
                java.lang.Object r3 = r1.f4080d0
                vh.f0 r3 = (p379vh.InterfaceC6698f0) r3
                java.lang.Object r7 = r1.f4079c0
                vh.f0 r7 = (p379vh.InterfaceC6698f0) r7
                java.lang.Object r8 = r1.f4082f0
                bf.p r8 = (bf.C0756p) r8
                p074e9.C1805a.m4540y(r23)     // Catch: java.lang.Throwable -> L29b
                r13 = r8
                r8 = r23
                r21 = r7
                r7 = r3
                r3 = r21
                goto La5
            L5c:
                p074e9.C1805a.m4540y(r23)
                java.lang.Object r3 = r1.f4082f0
                vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                bf.p r13 = r1.f4083g0
                java.lang.String r7 = r1.f4084h0
                r8 = 0
                bf.p$b$c r10 = new bf.p$b$c     // Catch: java.lang.Throwable -> L29b
                r14 = 0
                r10.<init>(r13, r7, r14)     // Catch: java.lang.Throwable -> L29b
                r11 = 3
                r12 = 0
                r9 = 0
                r7 = r3
                vh.f0 r15 = p101fh.C2174f.m5714d(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L29b
                r8 = 0
                bf.p$b$b r10 = new bf.p$b$b     // Catch: java.lang.Throwable -> L29b
                r10.<init>(r13, r14)     // Catch: java.lang.Throwable -> L29b
                r11 = 3
                r12 = 0
                r9 = 0
                r7 = r3
                vh.f0 r12 = p101fh.C2174f.m5714d(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L29b
                r8 = 0
                bf.p$b$a r10 = new bf.p$b$a     // Catch: java.lang.Throwable -> L29b
                r10.<init>(r13, r14)     // Catch: java.lang.Throwable -> L29b
                r11 = 3
                r14 = 0
                r9 = 0
                r7 = r3
                r3 = r12
                r12 = r14
                vh.f0 r7 = p101fh.C2174f.m5714d(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L29b
                r1.f4082f0 = r13     // Catch: java.lang.Throwable -> L29b
                r1.f4079c0 = r3     // Catch: java.lang.Throwable -> L29b
                r1.f4080d0 = r7     // Catch: java.lang.Throwable -> L29b
                r1.f4081e0 = r4     // Catch: java.lang.Throwable -> L29b
                vh.g0 r15 = (p379vh.C6701g0) r15     // Catch: java.lang.Throwable -> L29b
                java.lang.Object r8 = r15.mo13566Q(r1)     // Catch: java.lang.Throwable -> L29b
                if (r8 != r2) goto La5
                return r2
            La5:
                ch.f r8 = (ch.C0979f) r8     // Catch: java.lang.Throwable -> L29b
                java.lang.Object r8 = r8.f5052Y     // Catch: java.lang.Throwable -> L29b
                p074e9.C1805a.m4540y(r8)     // Catch: java.lang.Throwable -> L29b
                cf.b r8 = (cf.C0957b) r8     // Catch: java.lang.Throwable -> L29b
                r1.f4082f0 = r13     // Catch: java.lang.Throwable -> L29b
                r1.f4079c0 = r7     // Catch: java.lang.Throwable -> L29b
                r1.f4080d0 = r8     // Catch: java.lang.Throwable -> L29b
                r1.f4081e0 = r5     // Catch: java.lang.Throwable -> L29b
                java.lang.Object r3 = r3.mo13566Q(r1)     // Catch: java.lang.Throwable -> L29b
                if (r3 != r2) goto Lbd
                return r2
            Lbd:
                ch.f r3 = (ch.C0979f) r3     // Catch: java.lang.Throwable -> L29b
                java.lang.Object r3 = r3.f5052Y     // Catch: java.lang.Throwable -> L29b
                p074e9.C1805a.m4540y(r3)     // Catch: java.lang.Throwable -> L29b
                java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L29b
                r1.f4082f0 = r13     // Catch: java.lang.Throwable -> L29b
                r1.f4079c0 = r3     // Catch: java.lang.Throwable -> L29b
                r1.f4080d0 = r8     // Catch: java.lang.Throwable -> L29b
                r1.f4081e0 = r6     // Catch: java.lang.Throwable -> L29b
                java.lang.Object r6 = r7.mo13566Q(r1)     // Catch: java.lang.Throwable -> L29b
                if (r6 != r2) goto Ld5
                return r2
            Ld5:
                r2 = r8
            Ld6:
                ch.f r6 = (ch.C0979f) r6     // Catch: java.lang.Throwable -> L29b
                java.lang.Object r6 = r6.f5052Y     // Catch: java.lang.Throwable -> L29b
                p074e9.C1805a.m4540y(r6)     // Catch: java.lang.Throwable -> L29b
                java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L29b
                if (r2 != 0) goto Le4
                ch.l r0 = ch.C0985l.f5061a     // Catch: java.lang.Throwable -> L29b
                return r0
            Le4:
                java.lang.String r7 = "UTC"
                java.util.TimeZone r7 = java.util.TimeZone.getTimeZone(r7)     // Catch: java.lang.Throwable -> L29b
                java.util.Calendar r7 = java.util.Calendar.getInstance(r7)     // Catch: java.lang.Throwable -> L29b
                long r7 = r7.getTimeInMillis()     // Catch: java.lang.Throwable -> L29b
                r9 = 1000(0x3e8, float:1.401E-42)
                long r9 = (long) r9     // Catch: java.lang.Throwable -> L29b
                long r7 = r7 / r9
                cf.b$a r9 = r2.getData()     // Catch: java.lang.Throwable -> L29b
                java.lang.String r9 = r9.getLast_claim()     // Catch: java.lang.Throwable -> L29b
                long r9 = java.lang.Long.parseLong(r9)     // Catch: java.lang.Throwable -> L29b
                long r7 = r7 - r9
                java.util.Iterator r9 = r3.iterator()     // Catch: java.lang.Throwable -> L29b
            L107:
                boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> L29b
                java.lang.String r11 = "Collection contains no element matching the predicate."
                if (r10 == 0) goto L295
                java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L29b
                r12 = r10
                cf.c r12 = (cf.C0958c) r12     // Catch: java.lang.Throwable -> L29b
                java.lang.String r12 = r12.getType()     // Catch: java.lang.Throwable -> L29b
                boolean r12 = p214m2.C4339q.m9702c(r12, r0)     // Catch: java.lang.Throwable -> L29b
                if (r12 == 0) goto L291
                cf.c r10 = (cf.C0958c) r10     // Catch: java.lang.Throwable -> L29b
                java.lang.String r9 = r10.getFactor()     // Catch: java.lang.Throwable -> L29b
                double r9 = java.lang.Double.parseDouble(r9)     // Catch: java.lang.Throwable -> L29b
                java.util.Iterator r12 = r6.iterator()     // Catch: java.lang.Throwable -> L29b
            L12e:
                boolean r14 = r12.hasNext()     // Catch: java.lang.Throwable -> L29b
                if (r14 == 0) goto L28b
                java.lang.Object r14 = r12.next()     // Catch: java.lang.Throwable -> L29b
                r15 = r14
                cf.a r15 = (cf.C0956a) r15     // Catch: java.lang.Throwable -> L29b
                java.lang.String r15 = r15.getBonus_name()     // Catch: java.lang.Throwable -> L29b
                java.lang.String r4 = "factions"
                boolean r4 = p214m2.C4339q.m9702c(r15, r4)     // Catch: java.lang.Throwable -> L29b
                if (r4 == 0) goto L286
                cf.a r14 = (cf.C0956a) r14     // Catch: java.lang.Throwable -> L29b
                java.lang.String r4 = r14.getFactor()     // Catch: java.lang.Throwable -> L29b
                double r14 = java.lang.Double.parseDouble(r4)     // Catch: java.lang.Throwable -> L29b
                java.util.Iterator r4 = r6.iterator()     // Catch: java.lang.Throwable -> L29b
            L155:
                boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L29b
                if (r6 == 0) goto L280
                java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L29b
                r12 = r6
                cf.a r12 = (cf.C0956a) r12     // Catch: java.lang.Throwable -> L29b
                java.lang.String r12 = r12.getBonus_name()     // Catch: java.lang.Throwable -> L29b
                boolean r12 = p214m2.C4339q.m9702c(r12, r0)     // Catch: java.lang.Throwable -> L29b
                if (r12 == 0) goto L27c
                cf.a r6 = (cf.C0956a) r6     // Catch: java.lang.Throwable -> L29b
                java.lang.String r0 = r6.getFactor()     // Catch: java.lang.Throwable -> L29b
                double r16 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.Throwable -> L29b
                cf.b$a r0 = r2.getData()     // Catch: java.lang.Throwable -> L29b
                java.util.List r0 = r0.getTypes()     // Catch: java.lang.Throwable -> L29b
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L29b
                r18 = 0
            L184:
                boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L29b
                if (r4 == 0) goto L1c7
                java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L29b
                cf.b$a$a r4 = (cf.C0957b.a.C7370a) r4     // Catch: java.lang.Throwable -> L29b
                int r6 = r4.getValue()     // Catch: java.lang.Throwable -> L29b
                r23 = r0
                if (r6 < r5) goto L1b1
                r6 = 1
                double r0 = (double) r6     // Catch: java.lang.Throwable -> L29b
                int r12 = r4.getValue()     // Catch: java.lang.Throwable -> L29b
                double r5 = (double) r12     // Catch: java.lang.Throwable -> L29b
                double r5 = r5 * r16
                double r5 = r5 + r0
                double r0 = (double) r7     // Catch: java.lang.Throwable -> L29b
                double r0 = r0 * r9
                int r4 = r4.getValue()     // Catch: java.lang.Throwable -> L29b
                r20 = r13
                double r12 = (double) r4     // Catch: java.lang.Throwable -> L29b
                double r0 = r0 * r12
                double r0 = r0 * r5
                goto L1bd
            L1b1:
                r20 = r13
                int r0 = r4.getValue()     // Catch: java.lang.Throwable -> L29b
                double r0 = (double) r0     // Catch: java.lang.Throwable -> L29b
                double r4 = (double) r7     // Catch: java.lang.Throwable -> L29b
                double r4 = r4 * r9
                double r0 = r0 * r4
            L1bd:
                double r18 = r18 + r0
                r5 = 2
                r1 = r22
                r0 = r23
                r13 = r20
                goto L184
            L1c7:
                r20 = r13
                cf.b$a r0 = r2.getData()     // Catch: java.lang.Throwable -> L29b
                java.util.List r0 = r0.getCastles()     // Catch: java.lang.Throwable -> L29b
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L29b
            L1d5:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L29b
                if (r1 == 0) goto L221
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L29b
                cf.b$a$a r1 = (cf.C0957b.a.C7370a) r1     // Catch: java.lang.Throwable -> L29b
                java.util.Iterator r4 = r3.iterator()     // Catch: java.lang.Throwable -> L29b
            L1e5:
                boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L29b
                if (r5 == 0) goto L21b
                java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L29b
                r6 = r5
                cf.c r6 = (cf.C0958c) r6     // Catch: java.lang.Throwable -> L29b
                java.lang.String r6 = r6.getType()     // Catch: java.lang.Throwable -> L29b
                java.lang.String r12 = r1.getKey()     // Catch: java.lang.Throwable -> L29b
                boolean r6 = p214m2.C4339q.m9702c(r6, r12)     // Catch: java.lang.Throwable -> L29b
                if (r6 == 0) goto L1e5
                cf.c r5 = (cf.C0958c) r5     // Catch: java.lang.Throwable -> L29b
                java.lang.String r4 = r5.getFactor()     // Catch: java.lang.Throwable -> L29b
                double r4 = java.lang.Double.parseDouble(r4)     // Catch: java.lang.Throwable -> L29b
                int r1 = r1.getValue()     // Catch: java.lang.Throwable -> L29b
                double r12 = (double) r1     // Catch: java.lang.Throwable -> L29b
                r23 = r0
                double r0 = (double) r7     // Catch: java.lang.Throwable -> L29b
                double r0 = r0 * r4
                double r0 = r0 * r12
                double r18 = r0 + r18
                r0 = r23
                goto L1d5
            L21b:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L29b
                r0.<init>(r11)     // Catch: java.lang.Throwable -> L29b
                throw r0     // Catch: java.lang.Throwable -> L29b
            L221:
                cf.b$a r0 = r2.getData()     // Catch: java.lang.Throwable -> L29b
                java.util.List r0 = r0.getFactions()     // Catch: java.lang.Throwable -> L29b
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L29b
            L22d:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L29b
                if (r1 == 0) goto L256
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L29b
                cf.b$a$a r1 = (cf.C0957b.a.C7370a) r1     // Catch: java.lang.Throwable -> L29b
                int r3 = r1.getValue()     // Catch: java.lang.Throwable -> L29b
                r5 = 2
                if (r3 < r5) goto L22d
                int r3 = r1.getValue()     // Catch: java.lang.Throwable -> L29b
                double r3 = (double) r3     // Catch: java.lang.Throwable -> L29b
                double r3 = r3 * r14
                double r11 = (double) r7     // Catch: java.lang.Throwable -> L29b
                double r11 = r11 * r9
                int r1 = r1.getValue()     // Catch: java.lang.Throwable -> L29b
                double r5 = (double) r1     // Catch: java.lang.Throwable -> L29b
                double r11 = r11 * r5
                double r11 = r11 * r3
                double r18 = r11 + r18
                goto L22d
            L256:
                r13 = r20
                androidx.lifecycle.d0<java.lang.Long> r0 = r13.f4075g     // Catch: java.lang.Throwable -> L29b
                long r1 = r2.getUnclaimedValue()     // Catch: java.lang.Throwable -> L29b
                boolean r3 = java.lang.Double.isNaN(r18)     // Catch: java.lang.Throwable -> L29b
                if (r3 != 0) goto L274
                long r3 = java.lang.Math.round(r18)     // Catch: java.lang.Throwable -> L29b
                long r1 = r1 + r3
                java.lang.Long r3 = new java.lang.Long     // Catch: java.lang.Throwable -> L29b
                r3.<init>(r1)     // Catch: java.lang.Throwable -> L29b
                r0.mo1415j(r3)     // Catch: java.lang.Throwable -> L29b
                ch.l r0 = ch.C0985l.f5061a     // Catch: java.lang.Throwable -> L29b
                goto L2a0
            L274:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L29b
                java.lang.String r1 = "Cannot round NaN value."
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L29b
                throw r0     // Catch: java.lang.Throwable -> L29b
            L27c:
                r1 = r22
                goto L155
            L280:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L29b
                r0.<init>(r11)     // Catch: java.lang.Throwable -> L29b
                throw r0     // Catch: java.lang.Throwable -> L29b
            L286:
                r4 = 1
                r1 = r22
                goto L12e
            L28b:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L29b
                r0.<init>(r11)     // Catch: java.lang.Throwable -> L29b
                throw r0     // Catch: java.lang.Throwable -> L29b
            L291:
                r1 = r22
                goto L107
            L295:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L29b
                r0.<init>(r11)     // Catch: java.lang.Throwable -> L29b
                throw r0     // Catch: java.lang.Throwable -> L29b
            L29b:
                r0 = move-exception
                java.lang.Object r0 = p074e9.C1805a.m4520e(r0)
            L2a0:
                r1 = r22
                bf.p r2 = r1.f4083g0
                java.lang.Throwable r0 = ch.C0979f.m2690b(r0)
                if (r0 == 0) goto L2c1
                java.lang.String r0 = vg.C6672m.m13514a(r0)
                androidx.lifecycle.d0<vg.b<ah.a>> r2 = r2.f4077i
                vg.b r3 = new vg.b
                ah.a r4 = new ah.a
                zg.d r5 = p458zg.EnumC7332d.f28068Z
                java.lang.String r6 = "Error"
                r4.<init>(r6, r0, r5)
                r3.<init>(r4)
                r2.mo1415j(r3)
            L2c1:
                bf.p r0 = r1.f4083g0
                androidx.lifecycle.d0<java.lang.Boolean> r0 = r0.f4073e
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                r0.mo1415j(r2)
                ch.l r0 = ch.C0985l.f5061a
                return r0
        }
    }

    public C0756p(android.app.Application r2, p238nd.C4728b0 r3) {
            r1 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.f4071c = r3
            bf.p$a r3 = new bf.p$a
            r3.<init>(r2)
            ch.d r2 = p185k7.C4038x4.m9096i(r3)
            r1.f4072d = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f4073e = r2
            r1.f4074f = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f4075g = r2
            r1.f4076h = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f4077i = r2
            return
    }

    /* renamed from: d */
    public static final java.lang.Object m2351d(bf.C0756p r5, p101fh.InterfaceC2172d r6) {
            java.util.Objects.requireNonNull(r5)
            fh.j r0 = new fh.j
            fh.d r6 = gh.C2390b.m6127q(r6)
            r0.<init>(r6)
            nd.v0 r6 = p238nd.C4781v0.f19121e
            java.lang.String r1 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r6, r1)
            java.lang.String r6 = r6.m10839c()
            bf.f r1 = new bf.f
            r1.<init>(r0)
            bf.g r2 = new bf.g
            r2.<init>(r0)
            bf.d r3 = new bf.d
            java.lang.String r4 = "{\n    \"code\": \"msourcestake\",\n    \"json\": true,\n    \"limit\": 10000,\n    \"reverse\": false,\n    \"scope\": \"msourcestake\",\n    \"table\": \"bonus\",\n    \"upper_bound\": \"\",\n    \"lower_bound\": \"\"\n}"
            r3.<init>(r6, r4, r1, r2)
            g2.o r5 = r5.m2354g()
            r5.m5814a(r3)
            java.lang.Object r5 = r0.m5741a()
            return r5
    }

    /* renamed from: e */
    public static final java.lang.Object m2352e(bf.C0756p r5, p101fh.InterfaceC2172d r6) {
            java.util.Objects.requireNonNull(r5)
            fh.j r0 = new fh.j
            fh.d r6 = gh.C2390b.m6127q(r6)
            r0.<init>(r6)
            nd.v0 r6 = p238nd.C4781v0.f19121e
            java.lang.String r1 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r6, r1)
            java.lang.String r6 = r6.m10839c()
            bf.j r1 = new bf.j
            r1.<init>(r0)
            bf.k r2 = new bf.k
            r2.<init>(r0)
            bf.h r3 = new bf.h
            java.lang.String r4 = "{\n    \"code\": \"msourcestake\",\n    \"json\": true,\n    \"limit\": 10000,\n    \"reverse\": false,\n    \"scope\": \"msourcestake\",\n    \"table\": \"factors\",\n    \"upper_bound\": \"\",\n    \"lower_bound\": \"\"\n}"
            r3.<init>(r6, r4, r1, r2)
            g2.o r5 = r5.m2354g()
            r5.m5814a(r3)
            java.lang.Object r5 = r0.m5741a()
            return r5
    }

    /* renamed from: f */
    public static final java.lang.Object m2353f(bf.C0756p r4, java.lang.String r5, p101fh.InterfaceC2172d r6) {
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
            java.lang.String r2 = "\n            {\n                \"code\": \"msourcestake\",\n                \"json\": true,\n                \"limit\": 10000,\n                \"reverse\": false,\n                \"scope\": \"msourcestake\",\n                \"table\": \"users\",\n                \"upper_bound\": \""
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = "\",\n                \"lower_bound\": \""
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = "\"\n            }"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = p362uh.C6459e.m13046C(r5)
            bf.n r1 = new bf.n
            r1.<init>(r0)
            bf.o r2 = new bf.o
            r2.<init>(r0)
            bf.l r3 = new bf.l
            r3.<init>(r6, r5, r1, r2)
            g2.o r4 = r4.m2354g()
            r4.m5814a(r3)
            java.lang.Object r4 = r0.m5741a()
            return r4
    }

    /* renamed from: g */
    public final p105g2.C2221o m2354g() {
            r1 = this;
            ch.d r0 = r1.f4072d
            java.lang.Object r0 = r0.getValue()
            g2.o r0 = (p105g2.C2221o) r0
            return r0
    }

    /* renamed from: h */
    public final void m2355h() {
            r9 = this;
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r9.f4073e
            java.lang.Object r0 = r0.m1411d()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto Lf
            return
        Lf:
            nd.b0 r0 = r9.f4071c
            id.b r0 = r0.m10795h()
            if (r0 == 0) goto L32
            java.lang.String r0 = r0.f12559a
            if (r0 != 0) goto L1c
            goto L32
        L1c:
            androidx.lifecycle.d0<java.lang.Boolean> r2 = r9.f4073e
            r2.mo7l(r1)
            vh.b0 r3 = p064e.C1488b.m4037d(r9)
            r4 = 0
            bf.p$b r6 = new bf.p$b
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
