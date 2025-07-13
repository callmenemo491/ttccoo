package eg;

/* renamed from: eg.m */
/* loaded from: classes.dex */
public final class C1849m extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final ch.InterfaceC0977d f8018c;

    /* renamed from: d */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f8019d;

    /* renamed from: e */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f8020e;

    /* renamed from: f */
    public final androidx.lifecycle.C0437d0<java.util.List<ch.C0978e<p100fg.C2162a, p100fg.C2166e>>> f8021f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<java.lang.Double> f8022g;

    /* renamed from: h */
    public final androidx.lifecycle.LiveData<java.lang.Double> f8023h;

    /* renamed from: i */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f8024i;

    /* renamed from: j */
    public final java.lang.String f8025j;

    /* renamed from: eg.m$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f8026Z;

        public a(android.app.Application r1) {
                r0 = this;
                r0.f8026Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f8026Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.reptilium.ReptiliumToolViewModel$refresh$1", m7452f = "ReptiliumToolViewModel.kt", m7453l = {58, 59, 67, 75}, m7454m = "invokeSuspend")
    /* renamed from: eg.m$b */
    public static final class b extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

        /* renamed from: c0 */
        public int f8027c0;

        /* renamed from: d0 */
        public /* synthetic */ java.lang.Object f8028d0;

        /* renamed from: e0 */
        public final /* synthetic */ eg.C1849m f8029e0;

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.reptilium.ReptiliumToolViewModel$refresh$1$2$1", m7452f = "ReptiliumToolViewModel.kt", m7453l = {}, m7454m = "invokeSuspend")
        /* renamed from: eg.m$b$a */
        public static final class a extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

            /* renamed from: c0 */
            public final /* synthetic */ eg.C1849m f8030c0;

            /* renamed from: d0 */
            public final /* synthetic */ java.util.List<ch.C0978e<p100fg.C2162a, p100fg.C2166e>> f8031d0;

            public a(eg.C1849m r1, java.util.List<ch.C0978e<p100fg.C2162a, p100fg.C2166e>> r2, p101fh.InterfaceC2172d<? super eg.C1849m.b.a> r3) {
                    r0 = this;
                    r0.f8030c0 = r1
                    r0.f8031d0 = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                    r2 = this;
                    eg.m$b$a r3 = new eg.m$b$a
                    eg.m r0 = r2.f8030c0
                    java.util.List<ch.e<fg.a, fg.e>> r1 = r2.f8031d0
                    r3.<init>(r0, r1, r4)
                    return r3
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
                    r2 = this;
                    vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                    fh.d r4 = (p101fh.InterfaceC2172d) r4
                    eg.m$b$a r3 = new eg.m$b$a
                    eg.m r0 = r2.f8030c0
                    java.util.List<ch.e<fg.a, fg.e>> r1 = r2.f8031d0
                    r3.<init>(r0, r1, r4)
                    ch.l r4 = ch.C0985l.f5061a
                    r3.mo123o(r4)
                    return r4
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r8) {
                    r7 = this;
                    p074e9.C1805a.m4540y(r8)
                    eg.m r8 = r7.f8030c0
                    androidx.lifecycle.d0<java.lang.Boolean> r8 = r8.f8019d
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r8.mo7l(r0)
                    eg.m r8 = r7.f8030c0
                    androidx.lifecycle.d0<java.util.List<ch.e<fg.a, fg.e>>> r8 = r8.f8021f
                    java.util.List<ch.e<fg.a, fg.e>> r0 = r7.f8031d0
                    r8.mo7l(r0)
                    java.util.List<ch.e<fg.a, fg.e>> r8 = r7.f8031d0
                    java.util.Iterator r8 = r8.iterator()
                    r0 = 0
                L1d:
                    boolean r2 = r8.hasNext()
                    if (r2 == 0) goto L3e
                    java.lang.Object r2 = r8.next()
                    ch.e r2 = (ch.C0978e) r2
                    A r3 = r2.f5050Y
                    fg.a r3 = (p100fg.C2162a) r3
                    int r3 = r3.getAssetsNumber()
                    double r3 = (double) r3
                    B r2 = r2.f5051Z
                    fg.e r2 = (p100fg.C2166e) r2
                    double r5 = r2.getRplmValue()
                    double r5 = r5 * r3
                    double r0 = r0 + r5
                    goto L1d
                L3e:
                    eg.m r8 = r7.f8030c0
                    androidx.lifecycle.d0<java.lang.Double> r8 = r8.f8022g
                    java.lang.Double r2 = new java.lang.Double
                    r2.<init>(r0)
                    r8.mo7l(r2)
                    ch.l r8 = ch.C0985l.f5061a
                    return r8
            }
        }

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.reptilium.ReptiliumToolViewModel$refresh$1$3$1", m7452f = "ReptiliumToolViewModel.kt", m7453l = {}, m7454m = "invokeSuspend")
        /* renamed from: eg.m$b$b, reason: collision with other inner class name */
        public static final class C7374b extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

            /* renamed from: c0 */
            public final /* synthetic */ eg.C1849m f8032c0;

            /* renamed from: d0 */
            public final /* synthetic */ java.lang.String f8033d0;

            public C7374b(eg.C1849m r1, java.lang.String r2, p101fh.InterfaceC2172d<? super eg.C1849m.b.C7374b> r3) {
                    r0 = this;
                    r0.f8032c0 = r1
                    r0.f8033d0 = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                    r2 = this;
                    eg.m$b$b r3 = new eg.m$b$b
                    eg.m r0 = r2.f8032c0
                    java.lang.String r1 = r2.f8033d0
                    r3.<init>(r0, r1, r4)
                    return r3
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
                    r2 = this;
                    vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                    fh.d r4 = (p101fh.InterfaceC2172d) r4
                    eg.m$b$b r3 = new eg.m$b$b
                    eg.m r0 = r2.f8032c0
                    java.lang.String r1 = r2.f8033d0
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
                    eg.m r6 = r5.f8032c0
                    androidx.lifecycle.d0<java.lang.Boolean> r6 = r6.f8019d
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r6.mo7l(r0)
                    eg.m r6 = r5.f8032c0
                    androidx.lifecycle.d0<vg.b<ah.a>> r6 = r6.f8024i
                    java.lang.String r0 = r5.f8033d0
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

        public b(eg.C1849m r1, p101fh.InterfaceC2172d<? super eg.C1849m.b> r2) {
                r0 = this;
                r0.f8029e0 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: h */
        public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                r2 = this;
                eg.m$b r0 = new eg.m$b
                eg.m r1 = r2.f8029e0
                r0.<init>(r1, r4)
                r0.f8028d0 = r3
                return r0
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
                r2 = this;
                vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                fh.d r4 = (p101fh.InterfaceC2172d) r4
                eg.m$b r0 = new eg.m$b
                eg.m r1 = r2.f8029e0
                r0.<init>(r1, r4)
                r0.f8028d0 = r3
                ch.l r3 = ch.C0985l.f5061a
                java.lang.Object r3 = r0.mo123o(r3)
                return r3
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r14) {
                r13 = this;
                gh.a r0 = gh.EnumC2389a.f10764Y
                int r1 = r13.f8027c0
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L37
                if (r1 == r5) goto L2f
                if (r1 == r4) goto L27
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                p074e9.C1805a.m4540y(r14)
                goto Lff
            L18:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L20:
                java.lang.Object r1 = r13.f8028d0
                p074e9.C1805a.m4540y(r14)
                goto Ldf
            L27:
                java.lang.Object r1 = r13.f8028d0
                java.util.List r1 = (java.util.List) r1
                p074e9.C1805a.m4540y(r14)     // Catch: java.lang.Throwable -> Lbb
                goto L61
            L2f:
                java.lang.Object r1 = r13.f8028d0
                eg.m r1 = (eg.C1849m) r1
                p074e9.C1805a.m4540y(r14)     // Catch: java.lang.Throwable -> Lbb
                goto L4b
            L37:
                p074e9.C1805a.m4540y(r14)
                java.lang.Object r14 = r13.f8028d0
                vh.b0 r14 = (p379vh.InterfaceC6686b0) r14
                eg.m r1 = r13.f8029e0
                r13.f8028d0 = r1     // Catch: java.lang.Throwable -> Lbb
                r13.f8027c0 = r5     // Catch: java.lang.Throwable -> Lbb
                java.lang.Object r14 = eg.C1849m.m4594e(r1, r13)     // Catch: java.lang.Throwable -> Lbb
                if (r14 != r0) goto L4b
                return r0
            L4b:
                fg.f r14 = (p100fg.C2167f) r14     // Catch: java.lang.Throwable -> Lbb
                java.util.List r14 = r14.getData()     // Catch: java.lang.Throwable -> Lbb
                java.lang.String r7 = r1.f8025j     // Catch: java.lang.Throwable -> Lbb
                r13.f8028d0 = r14     // Catch: java.lang.Throwable -> Lbb
                r13.f8027c0 = r4     // Catch: java.lang.Throwable -> Lbb
                java.lang.Object r1 = eg.C1849m.m4593d(r1, r7, r13)     // Catch: java.lang.Throwable -> Lbb
                if (r1 != r0) goto L5e
                return r0
            L5e:
                r12 = r1
                r1 = r14
                r14 = r12
            L61:
                fg.c r14 = (p100fg.C2164c) r14     // Catch: java.lang.Throwable -> Lbb
                fg.b r14 = r14.getData()     // Catch: java.lang.Throwable -> Lbb
                java.util.List r14 = r14.getTemplates()     // Catch: java.lang.Throwable -> Lbb
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lbb
                r4.<init>()     // Catch: java.lang.Throwable -> Lbb
                java.util.Iterator r14 = r14.iterator()     // Catch: java.lang.Throwable -> Lbb
            L74:
                boolean r7 = r14.hasNext()     // Catch: java.lang.Throwable -> Lbb
                if (r7 == 0) goto Lb9
                java.lang.Object r7 = r14.next()     // Catch: java.lang.Throwable -> Lbb
                fg.a r7 = (p100fg.C2162a) r7     // Catch: java.lang.Throwable -> Lbb
                java.util.Iterator r8 = r1.iterator()     // Catch: java.lang.Throwable -> Lbb
            L84:
                boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> Lbb
                if (r9 == 0) goto La0
                java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> Lbb
                r10 = r9
                fg.e r10 = (p100fg.C2166e) r10     // Catch: java.lang.Throwable -> Lbb
                java.lang.String r10 = r10.getTemplate_id()     // Catch: java.lang.Throwable -> Lbb
                java.lang.String r11 = r7.getTemplate_id()     // Catch: java.lang.Throwable -> Lbb
                boolean r10 = p214m2.C4339q.m9702c(r10, r11)     // Catch: java.lang.Throwable -> Lbb
                if (r10 == 0) goto L84
                goto La1
            La0:
                r9 = r6
            La1:
                fg.e r9 = (p100fg.C2166e) r9     // Catch: java.lang.Throwable -> Lbb
                if (r9 == 0) goto Lb2
                java.lang.String r8 = r9.getRplmString()     // Catch: java.lang.Throwable -> Lbb
                if (r8 != 0) goto Lac
                goto Lb2
            Lac:
                ch.e r8 = new ch.e     // Catch: java.lang.Throwable -> Lbb
                r8.<init>(r7, r9)     // Catch: java.lang.Throwable -> Lbb
                goto Lb3
            Lb2:
                r8 = r6
            Lb3:
                if (r8 == 0) goto L74
                r4.add(r8)     // Catch: java.lang.Throwable -> Lbb
                goto L74
            Lb9:
                r1 = r4
                goto Lc1
            Lbb:
                r14 = move-exception
                java.lang.Object r14 = p074e9.C1805a.m4520e(r14)
                r1 = r14
            Lc1:
                eg.m r14 = r13.f8029e0
                boolean r4 = r1 instanceof ch.C0979f.a
                r4 = r4 ^ r5
                if (r4 == 0) goto Ldf
                r4 = r1
                java.util.List r4 = (java.util.List) r4
                vh.z r5 = p379vh.C6716l0.f26007a
                vh.k1 r5 = p459zh.C7346l.f28106a
                eg.m$b$a r7 = new eg.m$b$a
                r7.<init>(r14, r4, r6)
                r13.f8028d0 = r1
                r13.f8027c0 = r3
                java.lang.Object r14 = p101fh.C2174f.m5710A(r5, r7, r13)
                if (r14 != r0) goto Ldf
                return r0
            Ldf:
                eg.m r14 = r13.f8029e0
                java.lang.Throwable r3 = ch.C0979f.m2690b(r1)
                if (r3 == 0) goto Lff
                java.lang.String r3 = vg.C6672m.m13514a(r3)
                vh.z r4 = p379vh.C6716l0.f26007a
                vh.k1 r4 = p459zh.C7346l.f28106a
                eg.m$b$b r5 = new eg.m$b$b
                r5.<init>(r14, r3, r6)
                r13.f8028d0 = r1
                r13.f8027c0 = r2
                java.lang.Object r14 = p101fh.C2174f.m5710A(r4, r5, r13)
                if (r14 != r0) goto Lff
                return r0
            Lff:
                ch.l r14 = ch.C0985l.f5061a
                return r14
        }
    }

    public C1849m(android.app.Application r2, p238nd.C4728b0 r3) {
            r1 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            eg.m$a r0 = new eg.m$a
            r0.<init>(r2)
            ch.d r2 = p185k7.C4038x4.m9096i(r0)
            r1.f8018c = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f8019d = r2
            r1.f8020e = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f8021f = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r0 = 0
            r2.<init>(r0)
            r1.f8022g = r2
            r1.f8023h = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f8024i = r2
            id.b r2 = r3.m10795h()
            if (r2 == 0) goto L43
            java.lang.String r2 = r2.f12559a
            if (r2 != 0) goto L45
        L43:
            java.lang.String r2 = ""
        L45:
            r1.f8025j = r2
            return
    }

    /* renamed from: d */
    public static final java.lang.Object m4593d(eg.C1849m r3, java.lang.String r4, p101fh.InterfaceC2172d r5) {
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
            java.lang.String r1 = "/v1/accounts/"
            r5.append(r1)
            r5.append(r4)
            java.lang.String r4 = "/nft.reptile"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            eg.g r5 = new eg.g
            r5.<init>(r0)
            eg.h r1 = new eg.h
            r1.<init>(r0)
            eg.e r2 = new eg.e
            r2.<init>(r4, r5, r1)
            ch.d r3 = r3.f8018c
            java.lang.Object r3 = r3.getValue()
            g2.o r3 = (p105g2.C2221o) r3
            r3.m5814a(r2)
            java.lang.Object r3 = r0.m5741a()
            return r3
    }

    /* renamed from: e */
    public static final java.lang.Object m4594e(eg.C1849m r4, p101fh.InterfaceC2172d r5) {
            java.util.Objects.requireNonNull(r4)
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
            java.lang.String r1 = "/v1/templates?collection_name=nft.reptile&has_assets=true&limit=1000"
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            eg.k r1 = new eg.k
            r1.<init>(r0)
            eg.l r2 = new eg.l
            r2.<init>(r0)
            eg.i r3 = new eg.i
            r3.<init>(r5, r1, r2)
            ch.d r4 = r4.f8018c
            java.lang.Object r4 = r4.getValue()
            g2.o r4 = (p105g2.C2221o) r4
            r4.m5814a(r3)
            java.lang.Object r4 = r0.m5741a()
            return r4
    }

    /* renamed from: f */
    public final void m4595f() {
            r8 = this;
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r8.f8019d
            java.lang.Object r0 = r0.m1411d()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto Lf
            return
        Lf:
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r8.f8019d
            r0.mo7l(r1)
            vh.b0 r2 = p064e.C1488b.m4037d(r8)
            r3 = 0
            eg.m$b r5 = new eg.m$b
            r0 = 0
            r5.<init>(r8, r0)
            r6 = 3
            r7 = 0
            r4 = 0
            p101fh.C2174f.m5728r(r2, r3, r4, r5, r6, r7)
            return
    }
}
