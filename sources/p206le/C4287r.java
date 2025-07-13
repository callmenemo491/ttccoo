package p206le;

/* renamed from: le.r */
/* loaded from: classes.dex */
public final class C4287r extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public p238nd.C4728b0 f17493c;

    /* renamed from: d */
    public final ch.InterfaceC0977d f17494d;

    /* renamed from: e */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f17495e;

    /* renamed from: f */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f17496f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<java.util.List<me.C4595c>> f17497g;

    /* renamed from: h */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f17498h;

    /* renamed from: i */
    public final java.lang.String f17499i;

    /* renamed from: le.r$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f17500Z;

        public a(android.app.Application r1) {
                r0 = this;
                r0.f17500Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f17500Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.alcor.AlcorToolViewModel$refresh$1", m7452f = "AlcorToolViewModel.kt", m7453l = {56, 57, 59, 83, 89}, m7454m = "invokeSuspend")
    /* renamed from: le.r$b */
    public static final class b extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

        /* renamed from: c0 */
        public java.lang.Object f17501c0;

        /* renamed from: d0 */
        public int f17502d0;

        /* renamed from: e0 */
        public /* synthetic */ java.lang.Object f17503e0;

        /* renamed from: f0 */
        public final /* synthetic */ p206le.C4287r f17504f0;

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.alcor.AlcorToolViewModel$refresh$1$1$suspendAllPair$1", m7452f = "AlcorToolViewModel.kt", m7453l = {53}, m7454m = "invokeSuspend")
        /* renamed from: le.r$b$a */
        public static final class a extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0979f<? extends p255od.C5193b>>, java.lang.Object> {

            /* renamed from: c0 */
            public int f17505c0;

            /* renamed from: d0 */
            public /* synthetic */ java.lang.Object f17506d0;

            /* renamed from: e0 */
            public final /* synthetic */ p206le.C4287r f17507e0;

            public a(p206le.C4287r r1, p101fh.InterfaceC2172d<? super p206le.C4287r.b.a> r2) {
                    r0 = this;
                    r0.f17507e0 = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                    r2 = this;
                    le.r$b$a r0 = new le.r$b$a
                    le.r r1 = r2.f17507e0
                    r0.<init>(r1, r4)
                    r0.f17506d0 = r3
                    return r0
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0979f<? extends p255od.C5193b>> r4) {
                    r2 = this;
                    vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                    fh.d r4 = (p101fh.InterfaceC2172d) r4
                    le.r$b$a r0 = new le.r$b$a
                    le.r r1 = r2.f17507e0
                    r0.<init>(r1, r4)
                    r0.f17506d0 = r3
                    ch.l r3 = ch.C0985l.f5061a
                    java.lang.Object r3 = r0.mo123o(r3)
                    return r3
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r4) {
                    r3 = this;
                    gh.a r0 = gh.EnumC2389a.f10764Y
                    int r1 = r3.f17505c0
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
                    java.lang.Object r4 = r3.f17506d0
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    le.r r4 = r3.f17507e0
                    r3.f17505c0 = r2     // Catch: java.lang.Throwable -> Ld
                    java.lang.Object r4 = p206le.C4287r.m9587d(r4, r3)     // Catch: java.lang.Throwable -> Ld
                    if (r4 != r0) goto L29
                    return r0
                L29:
                    od.b r4 = (p255od.C5193b) r4     // Catch: java.lang.Throwable -> Ld
                    goto L30
                L2c:
                    java.lang.Object r4 = p074e9.C1805a.m4520e(r4)
                L30:
                    ch.f r0 = new ch.f
                    r0.<init>(r4)
                    return r0
            }
        }

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.alcor.AlcorToolViewModel$refresh$1$1$suspendBalanceMyAlcor$1", m7452f = "AlcorToolViewModel.kt", m7453l = {55}, m7454m = "invokeSuspend")
        /* renamed from: le.r$b$b, reason: collision with other inner class name */
        public static final class C7402b extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0979f<? extends p255od.C5205h>>, java.lang.Object> {

            /* renamed from: c0 */
            public int f17508c0;

            /* renamed from: d0 */
            public /* synthetic */ java.lang.Object f17509d0;

            /* renamed from: e0 */
            public final /* synthetic */ p206le.C4287r f17510e0;

            public C7402b(p206le.C4287r r1, p101fh.InterfaceC2172d<? super p206le.C4287r.b.C7402b> r2) {
                    r0 = this;
                    r0.f17510e0 = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                    r2 = this;
                    le.r$b$b r0 = new le.r$b$b
                    le.r r1 = r2.f17510e0
                    r0.<init>(r1, r4)
                    r0.f17509d0 = r3
                    return r0
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0979f<? extends p255od.C5205h>> r4) {
                    r2 = this;
                    vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                    fh.d r4 = (p101fh.InterfaceC2172d) r4
                    le.r$b$b r0 = new le.r$b$b
                    le.r r1 = r2.f17510e0
                    r0.<init>(r1, r4)
                    r0.f17509d0 = r3
                    ch.l r3 = ch.C0985l.f5061a
                    java.lang.Object r3 = r0.mo123o(r3)
                    return r3
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r4) {
                    r3 = this;
                    gh.a r0 = gh.EnumC2389a.f10764Y
                    int r1 = r3.f17508c0
                    r2 = 1
                    if (r1 == 0) goto L15
                    if (r1 != r2) goto Ld
                    p074e9.C1805a.m4540y(r4)     // Catch: java.lang.Throwable -> L2f
                    goto L2c
                Ld:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L15:
                    p074e9.C1805a.m4540y(r4)
                    java.lang.Object r4 = r3.f17509d0
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    le.r r4 = r3.f17510e0
                    nd.b0 r1 = r4.f17493c     // Catch: java.lang.Throwable -> L2f
                    java.lang.String r4 = r4.f17499i     // Catch: java.lang.Throwable -> L2f
                    r3.f17508c0 = r2     // Catch: java.lang.Throwable -> L2f
                    r2 = 0
                    java.lang.Object r4 = r1.m10791c(r4, r2, r3)     // Catch: java.lang.Throwable -> L2f
                    if (r4 != r0) goto L2c
                    return r0
                L2c:
                    od.h r4 = (p255od.C5205h) r4     // Catch: java.lang.Throwable -> L2f
                    goto L34
                L2f:
                    r4 = move-exception
                    java.lang.Object r4 = p074e9.C1805a.m4520e(r4)
                L34:
                    ch.f r0 = new ch.f
                    r0.<init>(r4)
                    return r0
            }
        }

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.alcor.AlcorToolViewModel$refresh$1$1$suspendMyPair$1", m7452f = "AlcorToolViewModel.kt", m7453l = {54}, m7454m = "invokeSuspend")
        /* renamed from: le.r$b$c */
        public static final class c extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.util.List<? extends me.C4594b>>>, java.lang.Object> {

            /* renamed from: c0 */
            public int f17511c0;

            /* renamed from: d0 */
            public /* synthetic */ java.lang.Object f17512d0;

            /* renamed from: e0 */
            public final /* synthetic */ p206le.C4287r f17513e0;

            public c(p206le.C4287r r1, p101fh.InterfaceC2172d<? super p206le.C4287r.b.c> r2) {
                    r0 = this;
                    r0.f17513e0 = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                    r2 = this;
                    le.r$b$c r0 = new le.r$b$c
                    le.r r1 = r2.f17513e0
                    r0.<init>(r1, r4)
                    r0.f17512d0 = r3
                    return r0
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0979f<? extends java.util.List<? extends me.C4594b>>> r4) {
                    r2 = this;
                    vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                    fh.d r4 = (p101fh.InterfaceC2172d) r4
                    le.r$b$c r0 = new le.r$b$c
                    le.r r1 = r2.f17513e0
                    r0.<init>(r1, r4)
                    r0.f17512d0 = r3
                    ch.l r3 = ch.C0985l.f5061a
                    java.lang.Object r3 = r0.mo123o(r3)
                    return r3
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r4) {
                    r3 = this;
                    gh.a r0 = gh.EnumC2389a.f10764Y
                    int r1 = r3.f17511c0
                    r2 = 1
                    if (r1 == 0) goto L15
                    if (r1 != r2) goto Ld
                    p074e9.C1805a.m4540y(r4)     // Catch: java.lang.Throwable -> L2c
                    goto L29
                Ld:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L15:
                    p074e9.C1805a.m4540y(r4)
                    java.lang.Object r4 = r3.f17512d0
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    le.r r4 = r3.f17513e0
                    java.lang.String r1 = r4.f17499i     // Catch: java.lang.Throwable -> L2c
                    r3.f17511c0 = r2     // Catch: java.lang.Throwable -> L2c
                    java.lang.Object r4 = p206le.C4287r.m9588e(r4, r1, r3)     // Catch: java.lang.Throwable -> L2c
                    if (r4 != r0) goto L29
                    return r0
                L29:
                    java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L2c
                    goto L31
                L2c:
                    r4 = move-exception
                    java.lang.Object r4 = p074e9.C1805a.m4520e(r4)
                L31:
                    ch.f r0 = new ch.f
                    r0.<init>(r4)
                    return r0
            }
        }

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.alcor.AlcorToolViewModel$refresh$1$2$1", m7452f = "AlcorToolViewModel.kt", m7453l = {}, m7454m = "invokeSuspend")
        /* renamed from: le.r$b$d */
        public static final class d extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

            /* renamed from: c0 */
            public final /* synthetic */ p206le.C4287r f17514c0;

            /* renamed from: d0 */
            public final /* synthetic */ java.util.List<me.C4595c> f17515d0;

            public d(p206le.C4287r r1, java.util.List<me.C4595c> r2, p101fh.InterfaceC2172d<? super p206le.C4287r.b.d> r3) {
                    r0 = this;
                    r0.f17514c0 = r1
                    r0.f17515d0 = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                    r2 = this;
                    le.r$b$d r3 = new le.r$b$d
                    le.r r0 = r2.f17514c0
                    java.util.List<me.c> r1 = r2.f17515d0
                    r3.<init>(r0, r1, r4)
                    return r3
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
                    r2 = this;
                    vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                    fh.d r4 = (p101fh.InterfaceC2172d) r4
                    le.r$b$d r3 = new le.r$b$d
                    le.r r0 = r2.f17514c0
                    java.util.List<me.c> r1 = r2.f17515d0
                    r3.<init>(r0, r1, r4)
                    ch.l r4 = ch.C0985l.f5061a
                    r3.mo123o(r4)
                    return r4
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r2) {
                    r1 = this;
                    p074e9.C1805a.m4540y(r2)
                    le.r r2 = r1.f17514c0
                    androidx.lifecycle.d0<java.lang.Boolean> r2 = r2.f17495e
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r2.mo7l(r0)
                    le.r r2 = r1.f17514c0
                    androidx.lifecycle.d0<java.util.List<me.c>> r2 = r2.f17497g
                    java.util.List<me.c> r0 = r1.f17515d0
                    r2.mo7l(r0)
                    ch.l r2 = ch.C0985l.f5061a
                    return r2
            }
        }

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.alcor.AlcorToolViewModel$refresh$1$3$1", m7452f = "AlcorToolViewModel.kt", m7453l = {}, m7454m = "invokeSuspend")
        /* renamed from: le.r$b$e */
        public static final class e extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

            /* renamed from: c0 */
            public final /* synthetic */ p206le.C4287r f17516c0;

            /* renamed from: d0 */
            public final /* synthetic */ java.lang.String f17517d0;

            public e(p206le.C4287r r1, java.lang.String r2, p101fh.InterfaceC2172d<? super p206le.C4287r.b.e> r3) {
                    r0 = this;
                    r0.f17516c0 = r1
                    r0.f17517d0 = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                    r2 = this;
                    le.r$b$e r3 = new le.r$b$e
                    le.r r0 = r2.f17516c0
                    java.lang.String r1 = r2.f17517d0
                    r3.<init>(r0, r1, r4)
                    return r3
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
                    r2 = this;
                    vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                    fh.d r4 = (p101fh.InterfaceC2172d) r4
                    le.r$b$e r3 = new le.r$b$e
                    le.r r0 = r2.f17516c0
                    java.lang.String r1 = r2.f17517d0
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
                    le.r r6 = r5.f17516c0
                    androidx.lifecycle.d0<java.lang.Boolean> r6 = r6.f17495e
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r6.mo7l(r0)
                    le.r r6 = r5.f17516c0
                    androidx.lifecycle.d0<vg.b<ah.a>> r6 = r6.f17498h
                    java.lang.String r0 = r5.f17517d0
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

        public b(p206le.C4287r r1, p101fh.InterfaceC2172d<? super p206le.C4287r.b> r2) {
                r0 = this;
                r0.f17504f0 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: h */
        public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                r2 = this;
                le.r$b r0 = new le.r$b
                le.r r1 = r2.f17504f0
                r0.<init>(r1, r4)
                r0.f17503e0 = r3
                return r0
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
                r2 = this;
                vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                fh.d r4 = (p101fh.InterfaceC2172d) r4
                le.r$b r0 = new le.r$b
                le.r r1 = r2.f17504f0
                r0.<init>(r1, r4)
                r0.f17503e0 = r3
                ch.l r3 = ch.C0985l.f5061a
                java.lang.Object r3 = r0.mo123o(r3)
                return r3
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r25) {
                r24 = this;
                r1 = r24
                gh.a r2 = gh.EnumC2389a.f10764Y
                int r0 = r1.f17502d0
                r3 = 1
                r4 = 5
                r5 = 4
                r6 = 3
                r7 = 2
                r8 = 0
                if (r0 == 0) goto L5a
                if (r0 == r3) goto L4c
                if (r0 == r7) goto L3c
                if (r0 == r6) goto L2c
                if (r0 == r5) goto L25
                if (r0 != r4) goto L1d
                p074e9.C1805a.m4540y(r25)
                goto L20a
            L1d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L25:
                java.lang.Object r0 = r1.f17503e0
                p074e9.C1805a.m4540y(r25)
                goto L1e8
            L2c:
                java.lang.Object r0 = r1.f17501c0
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r6 = r1.f17503e0
                java.util.List r6 = (java.util.List) r6
                p074e9.C1805a.m4540y(r25)     // Catch: java.lang.Throwable -> L1c3
                r7 = r6
                r6 = r25
                goto Ld7
            L3c:
                java.lang.Object r0 = r1.f17501c0
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r7 = r1.f17503e0
                vh.f0 r7 = (p379vh.InterfaceC6698f0) r7
                p074e9.C1805a.m4540y(r25)     // Catch: java.lang.Throwable -> L1c3
                r9 = r7
                r7 = r25
                goto Lc1
            L4c:
                java.lang.Object r0 = r1.f17501c0
                vh.f0 r0 = (p379vh.InterfaceC6698f0) r0
                java.lang.Object r9 = r1.f17503e0
                vh.f0 r9 = (p379vh.InterfaceC6698f0) r9
                p074e9.C1805a.m4540y(r25)     // Catch: java.lang.Throwable -> L1c3
                r10 = r25
                goto La5
            L5a:
                p074e9.C1805a.m4540y(r25)
                java.lang.Object r0 = r1.f17503e0
                vh.b0 r0 = (p379vh.InterfaceC6686b0) r0
                le.r r15 = r1.f17504f0
                r10 = 0
                le.r$b$a r12 = new le.r$b$a     // Catch: java.lang.Throwable -> L1c3
                r12.<init>(r15, r8)     // Catch: java.lang.Throwable -> L1c3
                r13 = 3
                r14 = 0
                r11 = 0
                r9 = r0
                vh.f0 r16 = p101fh.C2174f.m5714d(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L1c3
                r10 = 0
                le.r$b$c r12 = new le.r$b$c     // Catch: java.lang.Throwable -> L1c3
                r12.<init>(r15, r8)     // Catch: java.lang.Throwable -> L1c3
                r13 = 3
                r14 = 0
                r11 = 0
                r9 = r0
                vh.f0 r14 = p101fh.C2174f.m5714d(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L1c3
                r10 = 0
                le.r$b$b r12 = new le.r$b$b     // Catch: java.lang.Throwable -> L1c3
                r12.<init>(r15, r8)     // Catch: java.lang.Throwable -> L1c3
                r13 = 3
                r15 = 0
                r11 = 0
                r9 = r0
                r0 = r14
                r14 = r15
                vh.f0 r9 = p101fh.C2174f.m5714d(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L1c3
                r1.f17503e0 = r0     // Catch: java.lang.Throwable -> L1c3
                r1.f17501c0 = r9     // Catch: java.lang.Throwable -> L1c3
                r1.f17502d0 = r3     // Catch: java.lang.Throwable -> L1c3
                r10 = r16
                vh.g0 r10 = (p379vh.C6701g0) r10     // Catch: java.lang.Throwable -> L1c3
                java.lang.Object r10 = r10.mo13566Q(r1)     // Catch: java.lang.Throwable -> L1c3
                if (r10 != r2) goto La0
                return r2
            La0:
                r23 = r9
                r9 = r0
                r0 = r23
            La5:
                ch.f r10 = (ch.C0979f) r10     // Catch: java.lang.Throwable -> L1c3
                java.lang.Object r10 = r10.f5052Y     // Catch: java.lang.Throwable -> L1c3
                p074e9.C1805a.m4540y(r10)     // Catch: java.lang.Throwable -> L1c3
                od.b r10 = (p255od.C5193b) r10     // Catch: java.lang.Throwable -> L1c3
                java.util.List r10 = r10.getRows()     // Catch: java.lang.Throwable -> L1c3
                r1.f17503e0 = r0     // Catch: java.lang.Throwable -> L1c3
                r1.f17501c0 = r10     // Catch: java.lang.Throwable -> L1c3
                r1.f17502d0 = r7     // Catch: java.lang.Throwable -> L1c3
                java.lang.Object r7 = r9.mo13566Q(r1)     // Catch: java.lang.Throwable -> L1c3
                if (r7 != r2) goto Lbf
                return r2
            Lbf:
                r9 = r0
                r0 = r10
            Lc1:
                ch.f r7 = (ch.C0979f) r7     // Catch: java.lang.Throwable -> L1c3
                java.lang.Object r7 = r7.f5052Y     // Catch: java.lang.Throwable -> L1c3
                p074e9.C1805a.m4540y(r7)     // Catch: java.lang.Throwable -> L1c3
                java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L1c3
                r1.f17503e0 = r7     // Catch: java.lang.Throwable -> L1c3
                r1.f17501c0 = r0     // Catch: java.lang.Throwable -> L1c3
                r1.f17502d0 = r6     // Catch: java.lang.Throwable -> L1c3
                java.lang.Object r6 = r9.mo13566Q(r1)     // Catch: java.lang.Throwable -> L1c3
                if (r6 != r2) goto Ld7
                return r2
            Ld7:
                ch.f r6 = (ch.C0979f) r6     // Catch: java.lang.Throwable -> L1c3
                java.lang.Object r6 = r6.f5052Y     // Catch: java.lang.Throwable -> L1c3
                p074e9.C1805a.m4540y(r6)     // Catch: java.lang.Throwable -> L1c3
                od.h r6 = (p255od.C5205h) r6     // Catch: java.lang.Throwable -> L1c3
                java.util.List r6 = r6.getBalances()     // Catch: java.lang.Throwable -> L1c3
                if (r6 == 0) goto L12b
                java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1c3
                r9.<init>()     // Catch: java.lang.Throwable -> L1c3
                java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L1c3
            Lef:
                boolean r10 = r6.hasNext()     // Catch: java.lang.Throwable -> L1c3
                if (r10 == 0) goto L10c
                java.lang.Object r10 = r6.next()     // Catch: java.lang.Throwable -> L1c3
                r11 = r10
                od.g r11 = (p255od.C5203g) r11     // Catch: java.lang.Throwable -> L1c3
                java.lang.String r11 = r11.getContract()     // Catch: java.lang.Throwable -> L1c3
                java.lang.String r12 = "alcorammswap"
                boolean r11 = p214m2.C4339q.m9702c(r11, r12)     // Catch: java.lang.Throwable -> L1c3
                if (r11 == 0) goto Lef
                r9.add(r10)     // Catch: java.lang.Throwable -> L1c3
                goto Lef
            L10c:
                java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1c3
                r6.<init>()     // Catch: java.lang.Throwable -> L1c3
                java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L1c3
            L115:
                boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> L1c3
                if (r10 == 0) goto L12d
                java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L1c3
                od.g r10 = (p255od.C5203g) r10     // Catch: java.lang.Throwable -> L1c3
                od.b0 r10 = r10.toMyBalance()     // Catch: java.lang.Throwable -> L1c3
                if (r10 == 0) goto L115
                r6.add(r10)     // Catch: java.lang.Throwable -> L1c3
                goto L115
            L12b:
                dh.k r6 = p062dh.C1475k.f7237Y     // Catch: java.lang.Throwable -> L1c3
            L12d:
                java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1c3
                r9.<init>()     // Catch: java.lang.Throwable -> L1c3
                java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L1c3
            L136:
                boolean r10 = r7.hasNext()     // Catch: java.lang.Throwable -> L1c3
                if (r10 == 0) goto L1c1
                java.lang.Object r10 = r7.next()     // Catch: java.lang.Throwable -> L1c3
                me.b r10 = (me.C4594b) r10     // Catch: java.lang.Throwable -> L1c3
                java.util.Iterator r11 = r0.iterator()     // Catch: java.lang.Throwable -> L1c3
            L146:
                boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> L1c3
                if (r12 == 0) goto L163
                java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> L1c3
                r14 = r12
                od.a r14 = (p255od.C5191a) r14     // Catch: java.lang.Throwable -> L1c3
                int r14 = r14.getId()     // Catch: java.lang.Throwable -> L1c3
                int r15 = r10.getPair_id()     // Catch: java.lang.Throwable -> L1c3
                if (r14 != r15) goto L15f
                r14 = 1
                goto L160
            L15f:
                r14 = 0
            L160:
                if (r14 == 0) goto L146
                goto L164
            L163:
                r12 = r8
            L164:
                od.a r12 = (p255od.C5191a) r12     // Catch: java.lang.Throwable -> L1c3
                if (r12 != 0) goto L169
                goto L1b9
            L169:
                me.a r15 = r12.alfjk()     // Catch: java.lang.Throwable -> L1c3
                java.util.Iterator r11 = r6.iterator()     // Catch: java.lang.Throwable -> L1c3
            L171:
                boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> L1c3
                if (r12 == 0) goto L18d
                java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> L1c3
                r14 = r12
                od.b0 r14 = (p255od.C5194b0) r14     // Catch: java.lang.Throwable -> L1c3
                java.lang.String r14 = r14.getCurrency()     // Catch: java.lang.Throwable -> L1c3
                java.lang.String r13 = r15.getName()     // Catch: java.lang.Throwable -> L1c3
                boolean r13 = p214m2.C4339q.m9702c(r14, r13)     // Catch: java.lang.Throwable -> L1c3
                if (r13 == 0) goto L171
                goto L18e
            L18d:
                r12 = r8
            L18e:
                od.b0 r12 = (p255od.C5194b0) r12     // Catch: java.lang.Throwable -> L1c3
                if (r12 == 0) goto L1b9
                double r13 = r12.getAmount()     // Catch: java.lang.Throwable -> L1c3
                r16 = 0
                int r11 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
                if (r11 != 0) goto L19e
                r13 = 1
                goto L19f
            L19e:
                r13 = 0
            L19f:
                if (r13 == 0) goto L1a2
                goto L1b9
            L1a2:
                me.c r11 = new me.c     // Catch: java.lang.Throwable -> L1c3
                double r16 = r12.getAmount()     // Catch: java.lang.Throwable -> L1c3
                int r18 = r12.getDecimals()     // Catch: java.lang.Throwable -> L1c3
                double r19 = r10.getLiquidity1()     // Catch: java.lang.Throwable -> L1c3
                double r21 = r10.getLiquidity2()     // Catch: java.lang.Throwable -> L1c3
                r14 = r11
                r14.<init>(r15, r16, r18, r19, r21)     // Catch: java.lang.Throwable -> L1c3
                goto L1ba
            L1b9:
                r11 = r8
            L1ba:
                if (r11 == 0) goto L136
                r9.add(r11)     // Catch: java.lang.Throwable -> L1c3
                goto L136
            L1c1:
                r0 = r9
                goto L1c8
            L1c3:
                r0 = move-exception
                java.lang.Object r0 = p074e9.C1805a.m4520e(r0)
            L1c8:
                le.r r6 = r1.f17504f0
                boolean r7 = r0 instanceof ch.C0979f.a
                r3 = r3 ^ r7
                if (r3 == 0) goto L1e8
                r3 = r0
                java.util.List r3 = (java.util.List) r3
                vh.z r7 = p379vh.C6716l0.f26007a
                vh.k1 r7 = p459zh.C7346l.f28106a
                le.r$b$d r9 = new le.r$b$d
                r9.<init>(r6, r3, r8)
                r1.f17503e0 = r0
                r1.f17501c0 = r8
                r1.f17502d0 = r5
                java.lang.Object r3 = p101fh.C2174f.m5710A(r7, r9, r1)
                if (r3 != r2) goto L1e8
                return r2
            L1e8:
                le.r r3 = r1.f17504f0
                java.lang.Throwable r5 = ch.C0979f.m2690b(r0)
                if (r5 == 0) goto L20a
                java.lang.String r5 = vg.C6672m.m13514a(r5)
                vh.z r6 = p379vh.C6716l0.f26007a
                vh.k1 r6 = p459zh.C7346l.f28106a
                le.r$b$e r7 = new le.r$b$e
                r7.<init>(r3, r5, r8)
                r1.f17503e0 = r0
                r1.f17501c0 = r8
                r1.f17502d0 = r4
                java.lang.Object r0 = p101fh.C2174f.m5710A(r6, r7, r1)
                if (r0 != r2) goto L20a
                return r2
            L20a:
                ch.l r0 = ch.C0985l.f5061a
                return r0
        }
    }

    public C4287r(android.app.Application r2, p238nd.C4728b0 r3) {
            r1 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.f17493c = r3
            le.r$a r3 = new le.r$a
            r3.<init>(r2)
            ch.d r2 = p185k7.C4038x4.m9096i(r3)
            r1.f17494d = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f17495e = r2
            r1.f17496f = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f17497g = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f17498h = r2
            nd.b0 r2 = r1.f17493c
            id.b r2 = r2.m10795h()
            if (r2 == 0) goto L3d
            java.lang.String r2 = r2.f12559a
            if (r2 != 0) goto L3f
        L3d:
            java.lang.String r2 = ""
        L3f:
            r1.f17499i = r2
            return
    }

    /* renamed from: d */
    public static final java.lang.Object m9587d(p206le.C4287r r5, p101fh.InterfaceC2172d r6) {
            java.util.Objects.requireNonNull(r5)
            fh.j r0 = new fh.j
            fh.d r6 = gh.C2390b.m6127q(r6)
            r0.<init>(r6)
            nd.v0 r6 = p238nd.C4781v0.f19121e
            java.lang.String r1 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r6, r1)
            java.lang.String r6 = r6.m10839c()
            le.l r1 = new le.l
            r1.<init>(r0)
            le.m r2 = new le.m
            r2.<init>(r0)
            le.j r3 = new le.j
            java.lang.String r4 = "{\n    \"code\": \"alcorammswap\",\n    \"json\": true,\n    \"limit\": 1000,\n    \"lower_bound\": \"\",\n    \"scope\": \"alcorammswap\",\n    \"table\": \"pairs\",\n    \"upper_bound\": \"\"\n}"
            r3.<init>(r6, r4, r1, r2)
            ch.d r5 = r5.f17494d
            java.lang.Object r5 = r5.getValue()
            g2.o r5 = (p105g2.C2221o) r5
            r5.m5814a(r3)
            java.lang.Object r5 = r0.m5741a()
            return r5
    }

    /* renamed from: e */
    public static final java.lang.Object m9588e(p206le.C4287r r3, java.lang.String r4, p101fh.InterfaceC2172d r5) {
            fh.j r0 = new fh.j
            fh.d r5 = gh.C2390b.m6127q(r5)
            r0.<init>(r5)
            java.lang.String r5 = "https://wax.alcor.exchange/api/account/"
            java.lang.String r1 = "/liquidity_positions"
            java.lang.String r4 = android.support.v4.media.C0145d.m257a(r5, r4, r1)
            le.p r5 = new le.p
            r5.<init>(r0)
            le.q r1 = new le.q
            r1.<init>(r0)
            le.n r2 = new le.n
            r2.<init>(r4, r5, r1)
            ch.d r3 = r3.f17494d
            java.lang.Object r3 = r3.getValue()
            g2.o r3 = (p105g2.C2221o) r3
            r3.m5814a(r2)
            java.lang.Object r3 = r0.m5741a()
            return r3
    }

    /* renamed from: f */
    public final void m9589f() {
            r8 = this;
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r8.f17495e
            java.lang.Object r0 = r0.m1411d()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto Lf
            return
        Lf:
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r8.f17495e
            r0.mo7l(r1)
            vh.b0 r2 = p064e.C1488b.m4037d(r8)
            r3 = 0
            le.r$b r5 = new le.r$b
            r0 = 0
            r5.<init>(r8, r0)
            r6 = 3
            r7 = 0
            r4 = 0
            p101fh.C2174f.m5728r(r2, r3, r4, r5, r6, r7)
            return
    }
}
