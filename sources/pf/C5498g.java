package pf;

/* renamed from: pf.g */
/* loaded from: classes.dex */
public final class C5498g extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4728b0 f21453c;

    /* renamed from: d */
    public final ch.InterfaceC0977d f21454d;

    /* renamed from: e */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f21455e;

    /* renamed from: f */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f21456f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<vg.C6661b<ch.C0978e<java.lang.String, java.lang.String>>> f21457g;

    /* renamed from: h */
    public final androidx.lifecycle.C0437d0<io.tacocrypto.app.EnumC3199a> f21458h;

    /* renamed from: i */
    public boolean f21459i;

    /* renamed from: j */
    public final androidx.lifecycle.C0437d0<ch.C0978e<java.lang.Double, java.lang.Double>> f21460j;

    /* renamed from: k */
    public final androidx.lifecycle.LiveData<java.lang.String> f21461k;

    /* renamed from: l */
    public final androidx.lifecycle.C0437d0<java.util.List<nf.C4806h.a>> f21462l;

    /* renamed from: m */
    public final androidx.lifecycle.LiveData<java.lang.String> f21463m;

    /* renamed from: n */
    public final androidx.lifecycle.C0437d0<java.lang.String> f21464n;

    /* renamed from: pf.g$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<io.tacocrypto.app.EnumC3199a, ch.C0978e<? extends java.lang.Double, ? extends java.lang.Double>, java.lang.Double> {

        /* renamed from: Z */
        public static final pf.C5498g.a f21465Z = null;

        static {
                pf.g$a r0 = new pf.g$a
                r0.<init>()
                pf.C5498g.a.f21465Z = r0
                return
        }

        public a() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Double mo122l(io.tacocrypto.app.EnumC3199a r4, ch.C0978e<? extends java.lang.Double, ? extends java.lang.Double> r5) {
                r3 = this;
                io.tacocrypto.app.a r4 = (io.tacocrypto.app.EnumC3199a) r4
                ch.e r5 = (ch.C0978e) r5
                r0 = 0
                if (r4 == 0) goto L23
                if (r5 != 0) goto Lb
                goto L23
            Lb:
                int r4 = r4.ordinal()
                r2 = 19
                if (r4 == r2) goto L1b
                r2 = 20
                if (r4 == r2) goto L18
                goto L23
            L18:
                B r4 = r5.f5051Z
                goto L1d
            L1b:
                A r4 = r5.f5050Y
            L1d:
                java.lang.Number r4 = (java.lang.Number) r4
                double r0 = r4.doubleValue()
            L23:
                java.lang.Double r4 = java.lang.Double.valueOf(r0)
                return r4
        }
    }

    /* renamed from: pf.g$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<io.tacocrypto.app.EnumC3199a, java.util.List<? extends nf.C4806h.a>, java.lang.String> {

        /* renamed from: Z */
        public static final pf.C5498g.b f21466Z = null;

        static {
                pf.g$b r0 = new pf.g$b
                r0.<init>()
                pf.C5498g.b.f21466Z = r0
                return
        }

        public b() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.String mo122l(io.tacocrypto.app.EnumC3199a r4, java.util.List<? extends nf.C4806h.a> r5) {
                r3 = this;
                io.tacocrypto.app.a r4 = (io.tacocrypto.app.EnumC3199a) r4
                java.util.List r5 = (java.util.List) r5
                if (r4 == 0) goto L53
                if (r5 != 0) goto L9
                goto L53
            L9:
                java.util.Iterator r5 = r5.iterator()
            Ld:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L27
                java.lang.Object r0 = r5.next()
                r1 = r0
                nf.h$a r1 = (nf.C4806h.a) r1
                java.lang.String r1 = r1.getKey()
                java.lang.String r2 = r4.f14242Y
                boolean r1 = p214m2.C4339q.m9702c(r1, r2)
                if (r1 == 0) goto Ld
                goto L28
            L27:
                r0 = 0
            L28:
                nf.h$a r0 = (nf.C4806h.a) r0
                if (r0 == 0) goto L53
                java.lang.String r4 = r0.getValue()
                if (r4 == 0) goto L53
                double r4 = java.lang.Double.parseDouble(r4)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 100
                double r1 = (double) r1
                double r4 = r4 * r1
                r1 = 0
                r2 = 2
                java.lang.String r4 = vg.C6672m.m13535v(r4, r2, r1, r2)
                r0.append(r4)
                r4 = 37
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                goto L55
            L53:
                java.lang.String r4 = "--%"
            L55:
                return r4
        }
    }

    /* renamed from: pf.g$c */
    public static final class c extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f21467Z;

        public c(android.app.Application r1) {
                r0 = this;
                r0.f21467Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f21467Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.farmingtales.wallet.WalletFTDialogViewModel$refresh$1", m7452f = "WalletFTDialogViewModel.kt", m7453l = {105, 110, 111, 118, 123}, m7454m = "invokeSuspend")
    /* renamed from: pf.g$d */
    public static final class d extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

        /* renamed from: c0 */
        public java.lang.Object f21468c0;

        /* renamed from: d0 */
        public int f21469d0;

        /* renamed from: e0 */
        public /* synthetic */ java.lang.Object f21470e0;

        /* renamed from: f0 */
        public final /* synthetic */ pf.C5498g f21471f0;

        /* renamed from: g0 */
        public final /* synthetic */ java.lang.String f21472g0;

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.farmingtales.wallet.WalletFTDialogViewModel$refresh$1$2$1", m7452f = "WalletFTDialogViewModel.kt", m7453l = {}, m7454m = "invokeSuspend")
        /* renamed from: pf.g$d$a */
        public static final class a extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

            /* renamed from: c0 */
            public final /* synthetic */ pf.C5498g f21473c0;

            public a(pf.C5498g r1, p101fh.InterfaceC2172d<? super pf.C5498g.d.a> r2) {
                    r0 = this;
                    r0.f21473c0 = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r2, p101fh.InterfaceC2172d<?> r3) {
                    r1 = this;
                    pf.g$d$a r2 = new pf.g$d$a
                    pf.g r0 = r1.f21473c0
                    r2.<init>(r0, r3)
                    return r2
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r2, p101fh.InterfaceC2172d<? super ch.C0985l> r3) {
                    r1 = this;
                    vh.b0 r2 = (p379vh.InterfaceC6686b0) r2
                    fh.d r3 = (p101fh.InterfaceC2172d) r3
                    pf.g$d$a r2 = new pf.g$d$a
                    pf.g r0 = r1.f21473c0
                    r2.<init>(r0, r3)
                    ch.l r2 = ch.C0985l.f5061a
                    p074e9.C1805a.m4540y(r2)
                    androidx.lifecycle.d0<java.lang.Boolean> r3 = r0.f21455e
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r3.mo7l(r0)
                    return r2
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r2) {
                    r1 = this;
                    p074e9.C1805a.m4540y(r2)
                    pf.g r2 = r1.f21473c0
                    androidx.lifecycle.d0<java.lang.Boolean> r2 = r2.f21455e
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r2.mo7l(r0)
                    ch.l r2 = ch.C0985l.f5061a
                    return r2
            }
        }

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.farmingtales.wallet.WalletFTDialogViewModel$refresh$1$3$1", m7452f = "WalletFTDialogViewModel.kt", m7453l = {}, m7454m = "invokeSuspend")
        /* renamed from: pf.g$d$b */
        public static final class b extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

            /* renamed from: c0 */
            public final /* synthetic */ pf.C5498g f21474c0;

            /* renamed from: d0 */
            public final /* synthetic */ java.lang.String f21475d0;

            public b(pf.C5498g r1, java.lang.String r2, p101fh.InterfaceC2172d<? super pf.C5498g.d.b> r3) {
                    r0 = this;
                    r0.f21474c0 = r1
                    r0.f21475d0 = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                    r2 = this;
                    pf.g$d$b r3 = new pf.g$d$b
                    pf.g r0 = r2.f21474c0
                    java.lang.String r1 = r2.f21475d0
                    r3.<init>(r0, r1, r4)
                    return r3
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
                    r2 = this;
                    vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                    fh.d r4 = (p101fh.InterfaceC2172d) r4
                    pf.g$d$b r3 = new pf.g$d$b
                    pf.g r0 = r2.f21474c0
                    java.lang.String r1 = r2.f21475d0
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
                    pf.g r6 = r5.f21474c0
                    androidx.lifecycle.d0<java.lang.Boolean> r6 = r6.f21455e
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r6.mo7l(r0)
                    pf.g r6 = r5.f21474c0
                    androidx.lifecycle.d0<vg.b<ah.a>> r6 = r6.f21456f
                    java.lang.String r0 = r5.f21475d0
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

        public d(pf.C5498g r1, java.lang.String r2, p101fh.InterfaceC2172d<? super pf.C5498g.d> r3) {
                r0 = this;
                r0.f21471f0 = r1
                r0.f21472g0 = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: h */
        public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r4, p101fh.InterfaceC2172d<?> r5) {
                r3 = this;
                pf.g$d r0 = new pf.g$d
                pf.g r1 = r3.f21471f0
                java.lang.String r2 = r3.f21472g0
                r0.<init>(r1, r2, r5)
                r0.f21470e0 = r4
                return r0
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r4, p101fh.InterfaceC2172d<? super ch.C0985l> r5) {
                r3 = this;
                vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                fh.d r5 = (p101fh.InterfaceC2172d) r5
                pf.g$d r0 = new pf.g$d
                pf.g r1 = r3.f21471f0
                java.lang.String r2 = r3.f21472g0
                r0.<init>(r1, r2, r5)
                r0.f21470e0 = r4
                ch.l r4 = ch.C0985l.f5061a
                java.lang.Object r4 = r0.mo123o(r4)
                return r4
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r20) {
                r19 = this;
                r1 = r19
                gh.a r2 = gh.EnumC2389a.f10764Y
                int r0 = r1.f21469d0
                java.lang.String r3 = "CBIT"
                java.lang.String r4 = "SEST"
                r5 = 5
                r6 = 4
                r7 = 3
                r8 = 2
                r9 = 1
                r10 = 0
                if (r0 == 0) goto L5a
                if (r0 == r9) goto L50
                if (r0 == r8) goto L40
                if (r0 == r7) goto L30
                if (r0 == r6) goto L29
                if (r0 != r5) goto L21
                p074e9.C1805a.m4540y(r20)
                goto L1f5
            L21:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L29:
                java.lang.Object r0 = r1.f21470e0
                p074e9.C1805a.m4540y(r20)
                goto L1d3
            L30:
                java.lang.Object r0 = r1.f21468c0
                nf.h r0 = (nf.C4806h) r0
                java.lang.Object r7 = r1.f21470e0
                pf.g r7 = (pf.C5498g) r7
                p074e9.C1805a.m4540y(r20)     // Catch: java.lang.Throwable -> L1ae
                r8 = r0
                r0 = r20
                goto L108
            L40:
                java.lang.Object r0 = r1.f21468c0
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r8 = r1.f21470e0
                pf.g r8 = (pf.C5498g) r8
                p074e9.C1805a.m4540y(r20)     // Catch: java.lang.Throwable -> L1ae
                r11 = r8
                r8 = r20
                goto Lee
            L50:
                java.lang.Object r0 = r1.f21470e0
                pf.g r0 = (pf.C5498g) r0
                p074e9.C1805a.m4540y(r20)     // Catch: java.lang.Throwable -> L1ae
                r7 = r20
                goto L76
            L5a:
                p074e9.C1805a.m4540y(r20)
                java.lang.Object r0 = r1.f21470e0
                vh.b0 r0 = (p379vh.InterfaceC6686b0) r0
                pf.g r0 = r1.f21471f0
                java.lang.String r11 = r1.f21472g0
                boolean r12 = r0.f21459i     // Catch: java.lang.Throwable -> L1ae
                if (r12 == 0) goto Ldc
                nd.b0 r7 = r0.f21453c     // Catch: java.lang.Throwable -> L1ae
                r1.f21470e0 = r0     // Catch: java.lang.Throwable -> L1ae
                r1.f21469d0 = r9     // Catch: java.lang.Throwable -> L1ae
                java.lang.Object r7 = p238nd.C4728b0.m10789e(r7, r10, r1, r9)     // Catch: java.lang.Throwable -> L1ae
                if (r7 != r2) goto L76
                return r2
            L76:
                java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L1ae
                java.util.Iterator r8 = r7.iterator()     // Catch: java.lang.Throwable -> L1ae
            L7c:
                boolean r11 = r8.hasNext()     // Catch: java.lang.Throwable -> L1ae
                if (r11 == 0) goto L94
                java.lang.Object r11 = r8.next()     // Catch: java.lang.Throwable -> L1ae
                r12 = r11
                od.b0 r12 = (p255od.C5194b0) r12     // Catch: java.lang.Throwable -> L1ae
                java.lang.String r12 = r12.getCurrency()     // Catch: java.lang.Throwable -> L1ae
                boolean r12 = p214m2.C4339q.m9702c(r12, r4)     // Catch: java.lang.Throwable -> L1ae
                if (r12 == 0) goto L7c
                goto L95
            L94:
                r11 = r10
            L95:
                od.b0 r11 = (p255od.C5194b0) r11     // Catch: java.lang.Throwable -> L1ae
                r12 = 0
                if (r11 == 0) goto La0
                double r14 = r11.getAmount()     // Catch: java.lang.Throwable -> L1ae
                goto La1
            La0:
                r14 = r12
            La1:
                java.util.Iterator r4 = r7.iterator()     // Catch: java.lang.Throwable -> L1ae
            La5:
                boolean r7 = r4.hasNext()     // Catch: java.lang.Throwable -> L1ae
                if (r7 == 0) goto Lbd
                java.lang.Object r7 = r4.next()     // Catch: java.lang.Throwable -> L1ae
                r8 = r7
                od.b0 r8 = (p255od.C5194b0) r8     // Catch: java.lang.Throwable -> L1ae
                java.lang.String r8 = r8.getCurrency()     // Catch: java.lang.Throwable -> L1ae
                boolean r8 = p214m2.C4339q.m9702c(r8, r3)     // Catch: java.lang.Throwable -> L1ae
                if (r8 == 0) goto La5
                goto Lbe
            Lbd:
                r7 = r10
            Lbe:
                od.b0 r7 = (p255od.C5194b0) r7     // Catch: java.lang.Throwable -> L1ae
                if (r7 == 0) goto Lc6
                double r12 = r7.getAmount()     // Catch: java.lang.Throwable -> L1ae
            Lc6:
                androidx.lifecycle.d0<ch.e<java.lang.Double, java.lang.Double>> r0 = r0.f21460j     // Catch: java.lang.Throwable -> L1ae
                java.lang.Double r3 = new java.lang.Double     // Catch: java.lang.Throwable -> L1ae
                r3.<init>(r14)     // Catch: java.lang.Throwable -> L1ae
                java.lang.Double r4 = new java.lang.Double     // Catch: java.lang.Throwable -> L1ae
                r4.<init>(r12)     // Catch: java.lang.Throwable -> L1ae
                ch.e r7 = new ch.e     // Catch: java.lang.Throwable -> L1ae
                r7.<init>(r3, r4)     // Catch: java.lang.Throwable -> L1ae
                r0.mo1415j(r7)     // Catch: java.lang.Throwable -> L1ae
                goto L1ab
            Ldc:
                r1.f21470e0 = r0     // Catch: java.lang.Throwable -> L1ae
                r1.f21468c0 = r11     // Catch: java.lang.Throwable -> L1ae
                r1.f21469d0 = r8     // Catch: java.lang.Throwable -> L1ae
                java.lang.Object r8 = pf.C5498g.m11775d(r0, r1)     // Catch: java.lang.Throwable -> L1ae
                if (r8 != r2) goto Le9
                return r2
            Le9:
                r18 = r11
                r11 = r0
                r0 = r18
            Lee:
                md.j r8 = (md.C4559j) r8     // Catch: java.lang.Throwable -> L1ae
                java.util.List r8 = r8.getRows()     // Catch: java.lang.Throwable -> L1ae
                java.lang.Object r8 = p062dh.C1473i.m3996H(r8)     // Catch: java.lang.Throwable -> L1ae
                nf.h r8 = (nf.C4806h) r8     // Catch: java.lang.Throwable -> L1ae
                r1.f21470e0 = r11     // Catch: java.lang.Throwable -> L1ae
                r1.f21468c0 = r8     // Catch: java.lang.Throwable -> L1ae
                r1.f21469d0 = r7     // Catch: java.lang.Throwable -> L1ae
                java.lang.Object r0 = pf.C5498g.m11776e(r11, r0, r1)     // Catch: java.lang.Throwable -> L1ae
                if (r0 != r2) goto L107
                return r2
            L107:
                r7 = r11
            L108:
                md.j r0 = (md.C4559j) r0     // Catch: java.lang.Throwable -> L1ae
                java.util.List r0 = r0.getRows()     // Catch: java.lang.Throwable -> L1ae
                java.lang.Object r0 = p062dh.C1473i.m3996H(r0)     // Catch: java.lang.Throwable -> L1ae
                nf.t r0 = (nf.C4818t) r0     // Catch: java.lang.Throwable -> L1ae
                if (r0 == 0) goto L148
                java.util.List r13 = r0.getBalances()     // Catch: java.lang.Throwable -> L1ae
                if (r13 == 0) goto L148
                java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L1ae
            L120:
                boolean r14 = r13.hasNext()     // Catch: java.lang.Throwable -> L1ae
                if (r14 == 0) goto L138
                java.lang.Object r14 = r13.next()     // Catch: java.lang.Throwable -> L1ae
                r15 = r14
                nf.t$a r15 = (nf.C4818t.a) r15     // Catch: java.lang.Throwable -> L1ae
                java.lang.String r15 = r15.getKey()     // Catch: java.lang.Throwable -> L1ae
                boolean r15 = p214m2.C4339q.m9702c(r15, r4)     // Catch: java.lang.Throwable -> L1ae
                if (r15 == 0) goto L120
                goto L139
            L138:
                r14 = r10
            L139:
                nf.t$a r14 = (nf.C4818t.a) r14     // Catch: java.lang.Throwable -> L1ae
                if (r14 == 0) goto L148
                java.lang.String r4 = r14.getValue()     // Catch: java.lang.Throwable -> L1ae
                if (r4 == 0) goto L148
                long r13 = java.lang.Long.parseLong(r4)     // Catch: java.lang.Throwable -> L1ae
                goto L14a
            L148:
                r13 = 0
            L14a:
                double r13 = (double) r13     // Catch: java.lang.Throwable -> L1ae
                r15 = 4666723172467343360(0x40c3880000000000, double:10000.0)
                double r13 = r13 / r15
                if (r0 == 0) goto L186
                java.util.List r0 = r0.getBalances()     // Catch: java.lang.Throwable -> L1ae
                if (r0 == 0) goto L186
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1ae
            L15d:
                boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L1ae
                if (r4 == 0) goto L176
                java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L1ae
                r17 = r4
                nf.t$a r17 = (nf.C4818t.a) r17     // Catch: java.lang.Throwable -> L1ae
                java.lang.String r11 = r17.getKey()     // Catch: java.lang.Throwable -> L1ae
                boolean r11 = p214m2.C4339q.m9702c(r11, r3)     // Catch: java.lang.Throwable -> L1ae
                if (r11 == 0) goto L15d
                goto L177
            L176:
                r4 = r10
            L177:
                nf.t$a r4 = (nf.C4818t.a) r4     // Catch: java.lang.Throwable -> L1ae
                if (r4 == 0) goto L186
                java.lang.String r0 = r4.getValue()     // Catch: java.lang.Throwable -> L1ae
                if (r0 == 0) goto L186
                long r11 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> L1ae
                goto L188
            L186:
                r11 = 0
            L188:
                double r3 = (double) r11     // Catch: java.lang.Throwable -> L1ae
                double r3 = r3 / r15
                androidx.lifecycle.d0<ch.e<java.lang.Double, java.lang.Double>> r0 = r7.f21460j     // Catch: java.lang.Throwable -> L1ae
                java.lang.Double r11 = new java.lang.Double     // Catch: java.lang.Throwable -> L1ae
                r11.<init>(r13)     // Catch: java.lang.Throwable -> L1ae
                java.lang.Double r12 = new java.lang.Double     // Catch: java.lang.Throwable -> L1ae
                r12.<init>(r3)     // Catch: java.lang.Throwable -> L1ae
                ch.e r3 = new ch.e     // Catch: java.lang.Throwable -> L1ae
                r3.<init>(r11, r12)     // Catch: java.lang.Throwable -> L1ae
                r0.mo1415j(r3)     // Catch: java.lang.Throwable -> L1ae
                androidx.lifecycle.d0<java.util.List<nf.h$a>> r0 = r7.f21462l     // Catch: java.lang.Throwable -> L1ae
                if (r8 == 0) goto L1a7
                java.util.List r3 = r8.getWithdraw_fees()     // Catch: java.lang.Throwable -> L1ae
                goto L1a8
            L1a7:
                r3 = r10
            L1a8:
                r0.mo1415j(r3)     // Catch: java.lang.Throwable -> L1ae
            L1ab:
                ch.l r0 = ch.C0985l.f5061a     // Catch: java.lang.Throwable -> L1ae
                goto L1b3
            L1ae:
                r0 = move-exception
                java.lang.Object r0 = p074e9.C1805a.m4520e(r0)
            L1b3:
                pf.g r3 = r1.f21471f0
                boolean r4 = r0 instanceof ch.C0979f.a
                r4 = r4 ^ r9
                if (r4 == 0) goto L1d3
                r4 = r0
                ch.l r4 = (ch.C0985l) r4
                vh.z r4 = p379vh.C6716l0.f26007a
                vh.k1 r4 = p459zh.C7346l.f28106a
                pf.g$d$a r7 = new pf.g$d$a
                r7.<init>(r3, r10)
                r1.f21470e0 = r0
                r1.f21468c0 = r10
                r1.f21469d0 = r6
                java.lang.Object r3 = p101fh.C2174f.m5710A(r4, r7, r1)
                if (r3 != r2) goto L1d3
                return r2
            L1d3:
                pf.g r3 = r1.f21471f0
                java.lang.Throwable r4 = ch.C0979f.m2690b(r0)
                if (r4 == 0) goto L1f5
                java.lang.String r4 = vg.C6672m.m13514a(r4)
                vh.z r6 = p379vh.C6716l0.f26007a
                vh.k1 r6 = p459zh.C7346l.f28106a
                pf.g$d$b r7 = new pf.g$d$b
                r7.<init>(r3, r4, r10)
                r1.f21470e0 = r0
                r1.f21468c0 = r10
                r1.f21469d0 = r5
                java.lang.Object r0 = p101fh.C2174f.m5710A(r6, r7, r1)
                if (r0 != r2) goto L1f5
                return r2
            L1f5:
                ch.l r0 = ch.C0985l.f5061a
                return r0
        }
    }

    public C5498g(android.app.Application r3, p238nd.C4728b0 r4) {
            r2 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r4, r0)
            r2.<init>()
            r2.f21453c = r4
            pf.g$c r4 = new pf.g$c
            r4.<init>(r3)
            ch.d r3 = p185k7.C4038x4.m9096i(r4)
            r2.f21454d = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r2.f21455e = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r2.f21456f = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r2.f21457g = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            io.tacocrypto.app.a r4 = io.tacocrypto.app.EnumC3199a.f14235t0
            r3.<init>(r4)
            r2.f21458h = r3
            androidx.lifecycle.d0 r4 = new androidx.lifecycle.d0
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.<init>(r0)
            androidx.lifecycle.d0 r4 = new androidx.lifecycle.d0
            ch.e r1 = new ch.e
            r1.<init>(r0, r0)
            r4.<init>(r1)
            r2.f21460j = r4
            pf.g$a r0 = pf.C5498g.a.f21465Z
            androidx.lifecycle.LiveData r4 = p185k7.C4038x4.m9090c(r3, r4, r0)
            of.e r0 = new of.e
            r0.<init>(r2)
            androidx.lifecycle.LiveData r4 = androidx.lifecycle.C0455m0.m1450a(r4, r0)
            r2.f21461k = r4
            androidx.lifecycle.d0 r4 = new androidx.lifecycle.d0
            r4.<init>()
            r2.f21462l = r4
            pf.g$b r0 = pf.C5498g.b.f21466Z
            androidx.lifecycle.LiveData r3 = p185k7.C4038x4.m9090c(r3, r4, r0)
            r2.f21463m = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            java.lang.String r4 = ""
            r3.<init>(r4)
            r2.f21464n = r3
            return
    }

    /* renamed from: d */
    public static final java.lang.Object m11775d(pf.C5498g r5, p101fh.InterfaceC2172d r6) {
            fh.j r0 = new fh.j
            fh.d r6 = gh.C2390b.m6127q(r6)
            r0.<init>(r6)
            nd.v0 r6 = p238nd.C4781v0.f19121e
            java.lang.String r1 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r6, r1)
            java.lang.String r6 = r6.m10839c()
            pf.j r1 = new pf.j
            r1.<init>(r0)
            pf.k r2 = new pf.k
            r2.<init>(r0)
            pf.h r3 = new pf.h
            java.lang.String r4 = "{\n    \"code\": \"farminggames\",\n    \"json\": true,\n    \"limit\": 1,\n    \"scope\": \"farminggames\",\n    \"table\": \"confwallet\"\n}"
            r3.<init>(r6, r4, r1, r2)
            ch.d r5 = r5.f21454d
            java.lang.Object r5 = r5.getValue()
            g2.o r5 = (p105g2.C2221o) r5
            r5.m5814a(r3)
            java.lang.Object r5 = r0.m5741a()
            return r5
    }

    /* renamed from: e */
    public static final java.lang.Object m11776e(pf.C5498g r4, java.lang.String r5, p101fh.InterfaceC2172d r6) {
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
            java.lang.String r2 = "\n            {\n                \"code\": \"farminggames\",\n                \"json\": true,\n                \"limit\": 1,\n                \"lower_bound\": \""
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = "\",\n                \"scope\": \"farminggames\",\n                \"table\": \"wallet\",\n                \"upper_bound\": \""
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = "\"\n            }"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = p362uh.C6459e.m13046C(r5)
            pf.n r1 = new pf.n
            r1.<init>(r0)
            pf.o r2 = new pf.o
            r2.<init>(r0)
            pf.l r3 = new pf.l
            r3.<init>(r6, r5, r1, r2)
            ch.d r4 = r4.f21454d
            java.lang.Object r4 = r4.getValue()
            g2.o r4 = (p105g2.C2221o) r4
            r4.m5814a(r3)
            java.lang.Object r4 = r0.m5741a()
            return r4
    }

    /* renamed from: f */
    public final void m11777f() {
            r9 = this;
            nd.b0 r0 = r9.f21453c
            id.b r0 = r0.m10795h()
            if (r0 == 0) goto L32
            java.lang.String r0 = r0.f12559a
            if (r0 != 0) goto Ld
            goto L32
        Ld:
            androidx.lifecycle.d0<java.lang.Boolean> r1 = r9.f21455e
            java.lang.Object r1 = r1.m1411d()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = p214m2.C4339q.m9702c(r1, r2)
            if (r1 == 0) goto L1c
            return
        L1c:
            androidx.lifecycle.d0<java.lang.Boolean> r1 = r9.f21455e
            r1.mo7l(r2)
            vh.b0 r3 = p064e.C1488b.m4037d(r9)
            r4 = 0
            pf.g$d r6 = new pf.g$d
            r1 = 0
            r6.<init>(r9, r0, r1)
            r7 = 3
            r8 = 0
            r5 = 0
            p101fh.C2174f.m5728r(r3, r4, r5, r6, r7, r8)
        L32:
            return
    }
}
