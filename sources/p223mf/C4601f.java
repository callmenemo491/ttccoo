package p223mf;

/* renamed from: mf.f */
/* loaded from: classes.dex */
public final class C4601f extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4728b0 f18456c;

    /* renamed from: d */
    public final ch.InterfaceC0977d f18457d;

    /* renamed from: e */
    public final ch.InterfaceC0977d f18458e;

    /* renamed from: f */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f18459f;

    /* renamed from: g */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f18460g;

    /* renamed from: h */
    public final androidx.lifecycle.C0437d0<java.util.List<p223mf.C4601f.a>> f18461h;

    /* renamed from: i */
    public final androidx.lifecycle.LiveData<java.util.List<p223mf.C4601f.a>> f18462i;

    /* renamed from: j */
    public final androidx.lifecycle.C0437d0<ch.C0978e<java.lang.Integer, java.lang.Integer>> f18463j;

    /* renamed from: k */
    public final androidx.lifecycle.LiveData<ch.C0978e<java.lang.Integer, java.lang.Integer>> f18464k;

    /* renamed from: l */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f18465l;

    /* renamed from: m */
    public final androidx.lifecycle.C0437d0<vg.C6661b<java.lang.String>> f18466m;

    /* renamed from: mf.f$a */
    public static final class a {

        /* renamed from: a */
        public final java.lang.String f18467a;

        /* renamed from: b */
        public final java.lang.String f18468b;

        /* renamed from: c */
        public final int f18469c;

        /* renamed from: d */
        public final java.lang.Double f18470d;

        public a(java.lang.String r2, java.lang.String r3, int r4, java.lang.Double r5) {
                r1 = this;
                java.lang.String r0 = "type"
                p214m2.C4339q.m9706k(r2, r0)
                r1.<init>()
                r1.f18467a = r2
                r1.f18468b = r3
                r1.f18469c = r4
                r1.f18470d = r5
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof p223mf.C4601f.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                mf.f$a r5 = (p223mf.C4601f.a) r5
                java.lang.String r1 = r4.f18467a
                java.lang.String r3 = r5.f18467a
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.f18468b
                java.lang.String r3 = r5.f18468b
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                int r1 = r4.f18469c
                int r3 = r5.f18469c
                if (r1 == r3) goto L29
                return r2
            L29:
                java.lang.Double r1 = r4.f18470d
                java.lang.Double r5 = r5.f18470d
                boolean r5 = p214m2.C4339q.m9702c(r1, r5)
                if (r5 != 0) goto L34
                return r2
            L34:
                return r0
        }

        public int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.f18467a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r3.f18468b
                r2 = 0
                if (r1 != 0) goto Lf
                r1 = 0
                goto L13
            Lf:
                int r1 = r1.hashCode()
            L13:
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r3.f18469c
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.Double r1 = r3.f18470d
                if (r1 != 0) goto L20
                goto L24
            L20:
                int r2 = r1.hashCode()
            L24:
                int r0 = r0 + r2
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "ProductFT(type="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r2.f18467a
                r0.append(r1)
                java.lang.String r1 = ", label="
                r0.append(r1)
                java.lang.String r1 = r2.f18468b
                r0.append(r1)
                java.lang.String r1 = ", value="
                r0.append(r1)
                int r1 = r2.f18469c
                r0.append(r1)
                java.lang.String r1 = ", sestValue="
                r0.append(r1)
                java.lang.Double r1 = r2.f18470d
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: mf.f$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p397wg.C6882c> {

        /* renamed from: Z */
        public final /* synthetic */ p223mf.C4601f f18471Z;

        public b(p223mf.C4601f r1) {
                r0 = this;
                r0.f18471Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p397wg.C6882c mo15e() {
                r3 = this;
                wg.c r0 = new wg.c
                mf.f r1 = r3.f18471Z
                ch.d r1 = r1.f18457d
                java.lang.Object r1 = r1.getValue()
                g2.o r1 = (p105g2.C2221o) r1
                mf.f r2 = r3.f18471Z
                nd.b0 r2 = r2.f18456c
                r0.<init>(r1, r2)
                return r0
        }
    }

    /* renamed from: mf.f$c */
    public static final class c extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f18472Z;

        public c(android.app.Application r1) {
                r0 = this;
                r0.f18472Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f18472Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.farmingtales.barn.FarmingTalesToolBarnViewModel$refresh$1", m7452f = "FarmingTalesToolBarnViewModel.kt", m7453l = {55, 56, 71, 76}, m7454m = "invokeSuspend")
    /* renamed from: mf.f$d */
    public static final class d extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0979f<? extends ch.C0985l>>, java.lang.Object> {

        /* renamed from: c0 */
        public java.lang.Object f18473c0;

        /* renamed from: d0 */
        public int f18474d0;

        /* renamed from: e0 */
        public /* synthetic */ java.lang.Object f18475e0;

        /* renamed from: f0 */
        public final /* synthetic */ p223mf.C4601f f18476f0;

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.farmingtales.barn.FarmingTalesToolBarnViewModel$refresh$1$2$1", m7452f = "FarmingTalesToolBarnViewModel.kt", m7453l = {}, m7454m = "invokeSuspend")
        /* renamed from: mf.f$d$a */
        public static final class a extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

            /* renamed from: c0 */
            public final /* synthetic */ p223mf.C4601f f18477c0;

            public a(p223mf.C4601f r1, p101fh.InterfaceC2172d<? super p223mf.C4601f.d.a> r2) {
                    r0 = this;
                    r0.f18477c0 = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r2, p101fh.InterfaceC2172d<?> r3) {
                    r1 = this;
                    mf.f$d$a r2 = new mf.f$d$a
                    mf.f r0 = r1.f18477c0
                    r2.<init>(r0, r3)
                    return r2
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r2, p101fh.InterfaceC2172d<? super ch.C0985l> r3) {
                    r1 = this;
                    vh.b0 r2 = (p379vh.InterfaceC6686b0) r2
                    fh.d r3 = (p101fh.InterfaceC2172d) r3
                    mf.f$d$a r2 = new mf.f$d$a
                    mf.f r0 = r1.f18477c0
                    r2.<init>(r0, r3)
                    ch.l r2 = ch.C0985l.f5061a
                    p074e9.C1805a.m4540y(r2)
                    androidx.lifecycle.d0<java.lang.Boolean> r3 = r0.f18459f
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r3.mo7l(r0)
                    return r2
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r2) {
                    r1 = this;
                    p074e9.C1805a.m4540y(r2)
                    mf.f r2 = r1.f18477c0
                    androidx.lifecycle.d0<java.lang.Boolean> r2 = r2.f18459f
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r2.mo7l(r0)
                    ch.l r2 = ch.C0985l.f5061a
                    return r2
            }
        }

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.farmingtales.barn.FarmingTalesToolBarnViewModel$refresh$1$3$1", m7452f = "FarmingTalesToolBarnViewModel.kt", m7453l = {}, m7454m = "invokeSuspend")
        /* renamed from: mf.f$d$b */
        public static final class b extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

            /* renamed from: c0 */
            public final /* synthetic */ p223mf.C4601f f18478c0;

            /* renamed from: d0 */
            public final /* synthetic */ java.lang.String f18479d0;

            public b(p223mf.C4601f r1, java.lang.String r2, p101fh.InterfaceC2172d<? super p223mf.C4601f.d.b> r3) {
                    r0 = this;
                    r0.f18478c0 = r1
                    r0.f18479d0 = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                    r2 = this;
                    mf.f$d$b r3 = new mf.f$d$b
                    mf.f r0 = r2.f18478c0
                    java.lang.String r1 = r2.f18479d0
                    r3.<init>(r0, r1, r4)
                    return r3
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
                    r2 = this;
                    vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                    fh.d r4 = (p101fh.InterfaceC2172d) r4
                    mf.f$d$b r3 = new mf.f$d$b
                    mf.f r0 = r2.f18478c0
                    java.lang.String r1 = r2.f18479d0
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
                    mf.f r6 = r5.f18478c0
                    androidx.lifecycle.d0<java.lang.Boolean> r6 = r6.f18459f
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r6.mo7l(r0)
                    mf.f r6 = r5.f18478c0
                    androidx.lifecycle.d0<vg.b<ah.a>> r6 = r6.f18465l
                    java.lang.String r0 = r5.f18479d0
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

        public d(p223mf.C4601f r1, p101fh.InterfaceC2172d<? super p223mf.C4601f.d> r2) {
                r0 = this;
                r0.f18476f0 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: h */
        public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                r2 = this;
                mf.f$d r0 = new mf.f$d
                mf.f r1 = r2.f18476f0
                r0.<init>(r1, r4)
                r0.f18475e0 = r3
                return r0
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0979f<? extends ch.C0985l>> r4) {
                r2 = this;
                vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                fh.d r4 = (p101fh.InterfaceC2172d) r4
                mf.f$d r0 = new mf.f$d
                mf.f r1 = r2.f18476f0
                r0.<init>(r1, r4)
                r0.f18475e0 = r3
                ch.l r3 = ch.C0985l.f5061a
                java.lang.Object r3 = r0.mo123o(r3)
                return r3
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r20) {
                r19 = this;
                r1 = r19
                gh.a r2 = gh.EnumC2389a.f10764Y
                int r0 = r1.f18474d0
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r0 == 0) goto L44
                if (r0 == r6) goto L3a
                if (r0 == r5) goto L2b
                if (r0 == r4) goto L24
                if (r0 != r3) goto L1c
                java.lang.Object r0 = r1.f18475e0
                p074e9.C1805a.m4540y(r20)
                goto L171
            L1c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L24:
                java.lang.Object r0 = r1.f18475e0
                p074e9.C1805a.m4540y(r20)
                goto L14f
            L2b:
                java.lang.Object r0 = r1.f18473c0
                nf.s r0 = (nf.C4817s) r0
                java.lang.Object r5 = r1.f18475e0
                mf.f r5 = (p223mf.C4601f) r5
                p074e9.C1805a.m4540y(r20)     // Catch: java.lang.Throwable -> L12a
                r8 = r5
                r5 = r20
                goto L7c
            L3a:
                java.lang.Object r0 = r1.f18475e0
                mf.f r0 = (p223mf.C4601f) r0
                p074e9.C1805a.m4540y(r20)     // Catch: java.lang.Throwable -> L12a
                r8 = r20
                goto L60
            L44:
                p074e9.C1805a.m4540y(r20)
                java.lang.Object r0 = r1.f18475e0
                vh.b0 r0 = (p379vh.InterfaceC6686b0) r0
                mf.f r0 = r1.f18476f0
                ch.d r8 = r0.f18458e     // Catch: java.lang.Throwable -> L12a
                java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L12a
                wg.c r8 = (p397wg.C6882c) r8     // Catch: java.lang.Throwable -> L12a
                r1.f18475e0 = r0     // Catch: java.lang.Throwable -> L12a
                r1.f18474d0 = r6     // Catch: java.lang.Throwable -> L12a
                java.lang.Object r8 = r8.m13944t(r1)     // Catch: java.lang.Throwable -> L12a
                if (r8 != r2) goto L60
                return r2
            L60:
                nf.s r8 = (nf.C4817s) r8     // Catch: java.lang.Throwable -> L12a
                ch.d r9 = r0.f18458e     // Catch: java.lang.Throwable -> L12a
                java.lang.Object r9 = r9.getValue()     // Catch: java.lang.Throwable -> L12a
                wg.c r9 = (p397wg.C6882c) r9     // Catch: java.lang.Throwable -> L12a
                r1.f18475e0 = r0     // Catch: java.lang.Throwable -> L12a
                r1.f18473c0 = r8     // Catch: java.lang.Throwable -> L12a
                r1.f18474d0 = r5     // Catch: java.lang.Throwable -> L12a
                java.lang.Object r5 = r9.m13933i(r1)     // Catch: java.lang.Throwable -> L12a
                if (r5 != r2) goto L77
                return r2
            L77:
                r18 = r8
                r8 = r0
                r0 = r18
            L7c:
                java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L12a
                if (r0 == 0) goto La4
                androidx.lifecycle.d0<ch.e<java.lang.Integer, java.lang.Integer>> r9 = r8.f18463j     // Catch: java.lang.Throwable -> L12a
                java.lang.String r10 = r0.getProducts_tot_sum()     // Catch: java.lang.Throwable -> L12a
                int r10 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.Throwable -> L12a
                java.lang.Integer r11 = new java.lang.Integer     // Catch: java.lang.Throwable -> L12a
                r11.<init>(r10)     // Catch: java.lang.Throwable -> L12a
                java.lang.String r10 = r0.getMax_capacity()     // Catch: java.lang.Throwable -> L12a
                int r10 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.Throwable -> L12a
                java.lang.Integer r12 = new java.lang.Integer     // Catch: java.lang.Throwable -> L12a
                r12.<init>(r10)     // Catch: java.lang.Throwable -> L12a
                ch.e r10 = new ch.e     // Catch: java.lang.Throwable -> L12a
                r10.<init>(r11, r12)     // Catch: java.lang.Throwable -> L12a
                r9.mo1415j(r10)     // Catch: java.lang.Throwable -> L12a
            La4:
                if (r0 == 0) goto Lab
                java.util.List r0 = r0.getProducts()     // Catch: java.lang.Throwable -> L12a
                goto Lac
            Lab:
                r0 = r7
            Lac:
                if (r0 != 0) goto Lb0
                dh.k r0 = p062dh.C1475k.f7237Y     // Catch: java.lang.Throwable -> L12a
            Lb0:
                java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L12a
                r10 = 10
                int r10 = p062dh.C1469e.m3992D(r0, r10)     // Catch: java.lang.Throwable -> L12a
                r9.<init>(r10)     // Catch: java.lang.Throwable -> L12a
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12a
            Lbf:
                boolean r10 = r0.hasNext()     // Catch: java.lang.Throwable -> L12a
                if (r10 == 0) goto L122
                java.lang.Object r10 = r0.next()     // Catch: java.lang.Throwable -> L12a
                nf.s$a r10 = (nf.C4817s.a) r10     // Catch: java.lang.Throwable -> L12a
                java.util.Iterator r11 = r5.iterator()     // Catch: java.lang.Throwable -> L12a
            Lcf:
                boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> L12a
                if (r12 == 0) goto Leb
                java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> L12a
                r13 = r12
                nf.p r13 = (nf.C4814p) r13     // Catch: java.lang.Throwable -> L12a
                java.lang.String r13 = r13.getProduct_name()     // Catch: java.lang.Throwable -> L12a
                java.lang.String r14 = r10.getKey()     // Catch: java.lang.Throwable -> L12a
                boolean r13 = p214m2.C4339q.m9702c(r13, r14)     // Catch: java.lang.Throwable -> L12a
                if (r13 == 0) goto Lcf
                goto Lec
            Leb:
                r12 = r7
            Lec:
                nf.p r12 = (nf.C4814p) r12     // Catch: java.lang.Throwable -> L12a
                java.lang.String r11 = r10.getKey()     // Catch: java.lang.Throwable -> L12a
                java.lang.String r13 = r10.getKey()     // Catch: java.lang.Throwable -> L12a
                java.lang.String r13 = p223mf.C4596a.m10448a(r13)     // Catch: java.lang.Throwable -> L12a
                int r10 = r10.getValue()     // Catch: java.lang.Throwable -> L12a
                if (r12 == 0) goto L118
                java.lang.String r12 = r12.getSest_value()     // Catch: java.lang.Throwable -> L12a
                if (r12 == 0) goto L118
                int r12 = java.lang.Integer.parseInt(r12)     // Catch: java.lang.Throwable -> L12a
                double r14 = (double) r12     // Catch: java.lang.Throwable -> L12a
                r16 = 4666723172467343360(0x40c3880000000000, double:10000.0)
                double r14 = r14 / r16
                java.lang.Double r12 = new java.lang.Double     // Catch: java.lang.Throwable -> L12a
                r12.<init>(r14)     // Catch: java.lang.Throwable -> L12a
                goto L119
            L118:
                r12 = r7
            L119:
                mf.f$a r14 = new mf.f$a     // Catch: java.lang.Throwable -> L12a
                r14.<init>(r11, r13, r10, r12)     // Catch: java.lang.Throwable -> L12a
                r9.add(r14)     // Catch: java.lang.Throwable -> L12a
                goto Lbf
            L122:
                androidx.lifecycle.d0<java.util.List<mf.f$a>> r0 = r8.f18461h     // Catch: java.lang.Throwable -> L12a
                r0.mo1415j(r9)     // Catch: java.lang.Throwable -> L12a
                ch.l r0 = ch.C0985l.f5061a     // Catch: java.lang.Throwable -> L12a
                goto L12f
            L12a:
                r0 = move-exception
                java.lang.Object r0 = p074e9.C1805a.m4520e(r0)
            L12f:
                mf.f r5 = r1.f18476f0
                boolean r8 = r0 instanceof ch.C0979f.a
                r6 = r6 ^ r8
                if (r6 == 0) goto L14f
                r6 = r0
                ch.l r6 = (ch.C0985l) r6
                vh.z r6 = p379vh.C6716l0.f26007a
                vh.k1 r6 = p459zh.C7346l.f28106a
                mf.f$d$a r8 = new mf.f$d$a
                r8.<init>(r5, r7)
                r1.f18475e0 = r0
                r1.f18473c0 = r7
                r1.f18474d0 = r4
                java.lang.Object r4 = p101fh.C2174f.m5710A(r6, r8, r1)
                if (r4 != r2) goto L14f
                return r2
            L14f:
                mf.f r4 = r1.f18476f0
                java.lang.Throwable r5 = ch.C0979f.m2690b(r0)
                if (r5 == 0) goto L171
                java.lang.String r5 = vg.C6672m.m13514a(r5)
                vh.z r6 = p379vh.C6716l0.f26007a
                vh.k1 r6 = p459zh.C7346l.f28106a
                mf.f$d$b r8 = new mf.f$d$b
                r8.<init>(r4, r5, r7)
                r1.f18475e0 = r0
                r1.f18473c0 = r7
                r1.f18474d0 = r3
                java.lang.Object r3 = p101fh.C2174f.m5710A(r6, r8, r1)
                if (r3 != r2) goto L171
                return r2
            L171:
                ch.f r2 = new ch.f
                r2.<init>(r0)
                return r2
        }
    }

    public C4601f(android.app.Application r2, p238nd.C4728b0 r3) {
            r1 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.f18456c = r3
            mf.f$c r3 = new mf.f$c
            r3.<init>(r2)
            ch.d r2 = p185k7.C4038x4.m9096i(r3)
            r1.f18457d = r2
            mf.f$b r2 = new mf.f$b
            r2.<init>(r1)
            ch.d r2 = p185k7.C4038x4.m9096i(r2)
            r1.f18458e = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f18459f = r2
            r1.f18460g = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f18461h = r2
            r1.f18462i = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r3 = 0
            r2.<init>(r3)
            r1.f18463j = r2
            r1.f18464k = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f18465l = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f18466m = r2
            return
    }

    /* renamed from: d */
    public final void m10450d() {
            r8 = this;
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r8.f18459f
            java.lang.Object r0 = r0.m1411d()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto Lf
            return
        Lf:
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r8.f18459f
            r0.mo7l(r1)
            vh.b0 r2 = p064e.C1488b.m4037d(r8)
            r3 = 0
            mf.f$d r5 = new mf.f$d
            r0 = 0
            r5.<init>(r8, r0)
            r6 = 3
            r7 = 0
            r4 = 0
            p101fh.C2174f.m5714d(r2, r3, r4, r5, r6, r7)
            return
    }
}
