package ae;

/* renamed from: ae.i */
/* loaded from: classes.dex */
public final class C0080i extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4728b0 f225c;

    /* renamed from: d */
    public final ch.InterfaceC0977d f226d;

    /* renamed from: e */
    public final androidx.lifecycle.C0437d0<p041ce.C0955f> f227e;

    /* renamed from: f */
    public final androidx.lifecycle.LiveData<p041ce.C0955f> f228f;

    /* renamed from: g */
    public p041ce.C0955f f229g;

    /* renamed from: h */
    public final androidx.lifecycle.C0437d0<vg.C6661b<ch.C0985l>> f230h;

    /* renamed from: i */
    public boolean f231i;

    /* renamed from: j */
    public android.os.Handler f232j;

    /* renamed from: ae.i$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f233Z;

        public a(android.app.Application r1) {
                r0 = this;
                r0.f233Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f233Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.request.detail.RequestDetailViewModel$refresh$1", m7452f = "RequestDetailViewModel.kt", m7453l = {57, 69, 80}, m7454m = "invokeSuspend")
    /* renamed from: ae.i$b */
    public static final class b extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

        /* renamed from: c0 */
        public int f234c0;

        /* renamed from: d0 */
        public /* synthetic */ java.lang.Object f235d0;

        /* renamed from: e0 */
        public final /* synthetic */ ae.C0080i f236e0;

        /* renamed from: ae.i$b$a */
        public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<mg.C4607e, java.lang.Comparable<?>> {

            /* renamed from: Z */
            public static final ae.C0080i.b.a f237Z = null;

            static {
                    ae.i$b$a r0 = new ae.i$b$a
                    r0.<init>()
                    ae.C0080i.b.a.f237Z = r0
                    return
            }

            public a() {
                    r1 = this;
                    r0 = 1
                    r1.<init>(r0)
                    return
            }

            @Override // mh.InterfaceC4620l
            /* renamed from: b */
            public java.lang.Comparable<?> mo107b(mg.C4607e r2) {
                    r1 = this;
                    mg.e r2 = (mg.C4607e) r2
                    java.lang.String r0 = "it"
                    p214m2.C4339q.m9706k(r2, r0)
                    java.lang.String r2 = r2.getBlockTime()
                    return r2
            }
        }

        /* renamed from: ae.i$b$b, reason: collision with other inner class name */
        public static final class C7362b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<mg.C4607e, java.lang.Comparable<?>> {

            /* renamed from: Z */
            public static final ae.C0080i.b.C7362b f238Z = null;

            static {
                    ae.i$b$b r0 = new ae.i$b$b
                    r0.<init>()
                    ae.C0080i.b.C7362b.f238Z = r0
                    return
            }

            public C7362b() {
                    r1 = this;
                    r0 = 1
                    r1.<init>(r0)
                    return
            }

            @Override // mh.InterfaceC4620l
            /* renamed from: b */
            public java.lang.Comparable<?> mo107b(mg.C4607e r3) {
                    r2 = this;
                    mg.e r3 = (mg.C4607e) r3
                    java.lang.String r0 = "it"
                    p214m2.C4339q.m9706k(r3, r0)
                    mg.b r3 = r3.getActionTrace()
                    mg.f r3 = r3.getReceipt()
                    long r0 = r3.getGlobalSequence()
                    java.lang.Long r3 = java.lang.Long.valueOf(r0)
                    return r3
            }
        }

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.request.detail.RequestDetailViewModel$refresh$1$2$1", m7452f = "RequestDetailViewModel.kt", m7453l = {}, m7454m = "invokeSuspend")
        /* renamed from: ae.i$b$c */
        public static final class c extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

            /* renamed from: c0 */
            public final /* synthetic */ mg.C4607e f239c0;

            /* renamed from: d0 */
            public final /* synthetic */ ae.C0080i f240d0;

            public c(mg.C4607e r1, ae.C0080i r2, p101fh.InterfaceC2172d<? super ae.C0080i.b.c> r3) {
                    r0 = this;
                    r0.f239c0 = r1
                    r0.f240d0 = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                    r2 = this;
                    ae.i$b$c r3 = new ae.i$b$c
                    mg.e r0 = r2.f239c0
                    ae.i r1 = r2.f240d0
                    r3.<init>(r0, r1, r4)
                    return r3
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
                    r2 = this;
                    vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                    fh.d r4 = (p101fh.InterfaceC2172d) r4
                    ae.i$b$c r3 = new ae.i$b$c
                    mg.e r0 = r2.f239c0
                    ae.i r1 = r2.f240d0
                    r3.<init>(r0, r1, r4)
                    ch.l r4 = ch.C0985l.f5061a
                    java.lang.Object r3 = r3.mo123o(r4)
                    return r3
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r6) {
                    r5 = this;
                    p074e9.C1805a.m4540y(r6)
                    mg.e r6 = r5.f239c0
                    if (r6 == 0) goto L16
                    ae.i r6 = r5.f240d0
                    androidx.lifecycle.d0<vg.b<ch.l>> r6 = r6.f230h
                    vg.b r0 = new vg.b
                    ch.l r1 = ch.C0985l.f5061a
                    r0.<init>(r1)
                    r6.mo7l(r0)
                    return r1
                L16:
                    ae.i r6 = r5.f240d0
                    android.os.Handler r0 = new android.os.Handler
                    android.os.Looper r1 = android.os.Looper.getMainLooper()
                    r0.<init>(r1)
                    ae.i r1 = r5.f240d0
                    ae.d r2 = new ae.d
                    r3 = 1
                    r2.<init>(r1, r3)
                    r3 = 5000(0x1388, double:2.4703E-320)
                    r0.postDelayed(r2, r3)
                    r6.f232j = r0
                    ch.l r6 = ch.C0985l.f5061a
                    return r6
            }
        }

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.request.detail.RequestDetailViewModel$refresh$1$3$1", m7452f = "RequestDetailViewModel.kt", m7453l = {}, m7454m = "invokeSuspend")
        /* renamed from: ae.i$b$d */
        public static final class d extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

            /* renamed from: c0 */
            public final /* synthetic */ ae.C0080i f241c0;

            public d(ae.C0080i r1, p101fh.InterfaceC2172d<? super ae.C0080i.b.d> r2) {
                    r0 = this;
                    r0.f241c0 = r1
                    r1 = 2
                    r0.<init>(r1, r2)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r2, p101fh.InterfaceC2172d<?> r3) {
                    r1 = this;
                    ae.i$b$d r2 = new ae.i$b$d
                    ae.i r0 = r1.f241c0
                    r2.<init>(r0, r3)
                    return r2
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r2, p101fh.InterfaceC2172d<? super ch.C0985l> r3) {
                    r1 = this;
                    vh.b0 r2 = (p379vh.InterfaceC6686b0) r2
                    fh.d r3 = (p101fh.InterfaceC2172d) r3
                    ae.i$b$d r2 = new ae.i$b$d
                    ae.i r0 = r1.f241c0
                    r2.<init>(r0, r3)
                    ch.l r3 = ch.C0985l.f5061a
                    r2.mo123o(r3)
                    return r3
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r6) {
                    r5 = this;
                    p074e9.C1805a.m4540y(r6)
                    ae.i r6 = r5.f241c0
                    android.os.Handler r0 = new android.os.Handler
                    android.os.Looper r1 = android.os.Looper.getMainLooper()
                    r0.<init>(r1)
                    ae.i r1 = r5.f241c0
                    ae.d r2 = new ae.d
                    r3 = 2
                    r2.<init>(r1, r3)
                    r3 = 5000(0x1388, double:2.4703E-320)
                    r0.postDelayed(r2, r3)
                    r6.f232j = r0
                    ch.l r6 = ch.C0985l.f5061a
                    return r6
            }
        }

        public b(ae.C0080i r1, p101fh.InterfaceC2172d<? super ae.C0080i.b> r2) {
                r0 = this;
                r0.f236e0 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: h */
        public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                r2 = this;
                ae.i$b r0 = new ae.i$b
                ae.i r1 = r2.f236e0
                r0.<init>(r1, r4)
                r0.f235d0 = r3
                return r0
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
                r2 = this;
                vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                fh.d r4 = (p101fh.InterfaceC2172d) r4
                ae.i$b r0 = new ae.i$b
                ae.i r1 = r2.f236e0
                r0.<init>(r1, r4)
                r0.f235d0 = r3
                ch.l r3 = ch.C0985l.f5061a
                java.lang.Object r3 = r0.mo123o(r3)
                return r3
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r14) {
                r13 = this;
                gh.a r0 = gh.EnumC2389a.f10764Y
                int r1 = r13.f234c0
                r2 = 1
                r3 = 0
                java.lang.String r4 = ""
                r5 = 3
                r6 = 2
                if (r1 == 0) goto L2e
                if (r1 == r2) goto L26
                if (r1 == r6) goto L1f
                if (r1 != r5) goto L17
                p074e9.C1805a.m4540y(r14)
                goto L154
            L17:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1f:
                java.lang.Object r1 = r13.f235d0
                p074e9.C1805a.m4540y(r14)
                goto L131
            L26:
                java.lang.Object r1 = r13.f235d0
                ae.i r1 = (ae.C0080i) r1
                p074e9.C1805a.m4540y(r14)     // Catch: java.lang.Throwable -> Lf4
                goto L4f
            L2e:
                p074e9.C1805a.m4540y(r14)
                java.lang.Object r14 = r13.f235d0
                vh.b0 r14 = (p379vh.InterfaceC6686b0) r14
                ae.i r1 = r13.f236e0
                nd.b0 r14 = r1.f225c     // Catch: java.lang.Throwable -> Lf4
                id.b r14 = r14.m10795h()     // Catch: java.lang.Throwable -> Lf4
                if (r14 == 0) goto L43
                java.lang.String r14 = r14.f12559a     // Catch: java.lang.Throwable -> Lf4
                if (r14 != 0) goto L44
            L43:
                r14 = r4
            L44:
                r13.f235d0 = r1     // Catch: java.lang.Throwable -> Lf4
                r13.f234c0 = r2     // Catch: java.lang.Throwable -> Lf4
                java.lang.Object r14 = ae.C0080i.m119d(r1, r14, r13)     // Catch: java.lang.Throwable -> Lf4
                if (r14 != r0) goto L4f
                return r0
            L4f:
                mg.d r14 = (mg.C4606d) r14     // Catch: java.lang.Throwable -> Lf4
                java.util.List r14 = r14.getActions()     // Catch: java.lang.Throwable -> Lf4
                java.util.Set r14 = p062dh.C1473i.m4011W(r14)     // Catch: java.lang.Throwable -> Lf4
                java.util.List r14 = p062dh.C1473i.m4007S(r14)     // Catch: java.lang.Throwable -> Lf4
                mh.l[] r7 = new mh.InterfaceC4620l[r6]     // Catch: java.lang.Throwable -> Lf4
                ae.i$b$a r8 = ae.C0080i.b.a.f237Z     // Catch: java.lang.Throwable -> Lf4
                r9 = 0
                r7[r9] = r8     // Catch: java.lang.Throwable -> Lf4
                ae.i$b$b r8 = ae.C0080i.b.C7362b.f238Z     // Catch: java.lang.Throwable -> Lf4
                r7[r2] = r8     // Catch: java.lang.Throwable -> Lf4
                java.util.Comparator r7 = p079eh.C1850a.m4596a(r7)     // Catch: java.lang.Throwable -> Lf4
                java.util.List r14 = p062dh.C1473i.m4004P(r14, r7)     // Catch: java.lang.Throwable -> Lf4
                java.util.List r14 = p062dh.C1473i.m4003O(r14)     // Catch: java.lang.Throwable -> Lf4
                boolean r7 = r1.f231i     // Catch: java.lang.Throwable -> Lf4
                if (r7 == 0) goto L7b
                ch.l r14 = ch.C0985l.f5061a     // Catch: java.lang.Throwable -> Lf4
                return r14
            L7b:
                java.util.Iterator r14 = r14.iterator()     // Catch: java.lang.Throwable -> Lf4
            L7f:
                boolean r7 = r14.hasNext()     // Catch: java.lang.Throwable -> Lf4
                if (r7 == 0) goto L102
                java.lang.Object r7 = r14.next()     // Catch: java.lang.Throwable -> Lf4
                r8 = r7
                mg.e r8 = (mg.C4607e) r8     // Catch: java.lang.Throwable -> Lf4
                nd.b0 r10 = r1.f225c     // Catch: java.lang.Throwable -> Lf4
                id.b r10 = r10.m10795h()     // Catch: java.lang.Throwable -> Lf4
                if (r10 == 0) goto L98
                java.lang.String r10 = r10.f12559a     // Catch: java.lang.Throwable -> Lf4
                if (r10 != 0) goto L99
            L98:
                r10 = r4
            L99:
                ng.b r10 = r8.getTransactionType(r10)     // Catch: java.lang.Throwable -> Lf4
                ng.b r11 = ng.EnumC4820b.f19209a0     // Catch: java.lang.Throwable -> Lf4
                if (r10 == r11) goto La2
                goto Lfa
            La2:
                mg.b r10 = r8.getActionTrace()     // Catch: java.lang.Throwable -> Lf4
                mg.a r10 = r10.getAct()     // Catch: java.lang.Throwable -> Lf4
                java.lang.String r10 = r10.getMemo()     // Catch: java.lang.Throwable -> Lf4
                mg.b r8 = r8.getActionTrace()     // Catch: java.lang.Throwable -> Lf4
                mg.a r8 = r8.getAct()     // Catch: java.lang.Throwable -> Lf4
                java.lang.String r8 = r8.getQuantity()     // Catch: java.lang.Throwable -> Lf4
                ce.f r11 = r1.f229g     // Catch: java.lang.Throwable -> Lf4
                java.lang.String r12 = "transferRequest"
                if (r11 == 0) goto Lfe
                java.lang.String r11 = r11.f4957d0     // Catch: java.lang.Throwable -> Lf4
                boolean r10 = p214m2.C4339q.m9702c(r10, r11)     // Catch: java.lang.Throwable -> Lf4
                if (r10 == 0) goto Lfa
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf4
                r10.<init>()     // Catch: java.lang.Throwable -> Lf4
                ce.f r11 = r1.f229g     // Catch: java.lang.Throwable -> Lf4
                if (r11 == 0) goto Lf6
                java.lang.String r11 = r11.f4952Y     // Catch: java.lang.Throwable -> Lf4
                r10.append(r11)     // Catch: java.lang.Throwable -> Lf4
                r11 = 32
                r10.append(r11)     // Catch: java.lang.Throwable -> Lf4
                ce.f r11 = r1.f229g     // Catch: java.lang.Throwable -> Lf4
                if (r11 == 0) goto Lf0
                java.lang.String r11 = r11.f4953Z     // Catch: java.lang.Throwable -> Lf4
                r10.append(r11)     // Catch: java.lang.Throwable -> Lf4
                java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> Lf4
                boolean r8 = p214m2.C4339q.m9702c(r8, r10)     // Catch: java.lang.Throwable -> Lf4
                if (r8 == 0) goto Lfa
                r8 = 1
                goto Lfb
            Lf0:
                p214m2.C4339q.m9713w(r12)     // Catch: java.lang.Throwable -> Lf4
                throw r3     // Catch: java.lang.Throwable -> Lf4
            Lf4:
                r14 = move-exception
                goto L107
            Lf6:
                p214m2.C4339q.m9713w(r12)     // Catch: java.lang.Throwable -> Lf4
                throw r3     // Catch: java.lang.Throwable -> Lf4
            Lfa:
                r8 = 0
            Lfb:
                if (r8 == 0) goto L7f
                goto L103
            Lfe:
                p214m2.C4339q.m9713w(r12)     // Catch: java.lang.Throwable -> Lf4
                throw r3     // Catch: java.lang.Throwable -> Lf4
            L102:
                r7 = r3
            L103:
                mg.e r7 = (mg.C4607e) r7     // Catch: java.lang.Throwable -> Lf4
                r1 = r7
                goto L10c
            L107:
                java.lang.Object r14 = p074e9.C1805a.m4520e(r14)
                r1 = r14
            L10c:
                ae.i r14 = r13.f236e0
                boolean r4 = r1 instanceof ch.C0979f.a
                r2 = r2 ^ r4
                if (r2 == 0) goto L131
                r2 = r1
                mg.e r2 = (mg.C4607e) r2
                boolean r4 = r14.f231i
                if (r4 == 0) goto L11d
                ch.l r14 = ch.C0985l.f5061a
                return r14
            L11d:
                vh.z r4 = p379vh.C6716l0.f26007a
                vh.k1 r4 = p459zh.C7346l.f28106a
                ae.i$b$c r7 = new ae.i$b$c
                r7.<init>(r2, r14, r3)
                r13.f235d0 = r1
                r13.f234c0 = r6
                java.lang.Object r14 = p101fh.C2174f.m5710A(r4, r7, r13)
                if (r14 != r0) goto L131
                return r0
            L131:
                ae.i r14 = r13.f236e0
                java.lang.Throwable r2 = ch.C0979f.m2690b(r1)
                if (r2 == 0) goto L154
                boolean r2 = r14.f231i
                if (r2 == 0) goto L140
                ch.l r14 = ch.C0985l.f5061a
                return r14
            L140:
                vh.z r2 = p379vh.C6716l0.f26007a
                vh.k1 r2 = p459zh.C7346l.f28106a
                ae.i$b$d r4 = new ae.i$b$d
                r4.<init>(r14, r3)
                r13.f235d0 = r1
                r13.f234c0 = r5
                java.lang.Object r14 = p101fh.C2174f.m5710A(r2, r4, r13)
                if (r14 != r0) goto L154
                return r0
            L154:
                ch.l r14 = ch.C0985l.f5061a
                return r14
        }
    }

    public C0080i(android.app.Application r2, p238nd.C4728b0 r3) {
            r1 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.f225c = r3
            ae.i$a r3 = new ae.i$a
            r3.<init>(r2)
            ch.d r2 = p185k7.C4038x4.m9096i(r3)
            r1.f226d = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f227e = r2
            r1.f228f = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f230h = r2
            return
    }

    /* renamed from: d */
    public static final java.lang.Object m119d(ae.C0080i r4, java.lang.String r5, p101fh.InterfaceC2172d r6) {
            fh.j r0 = new fh.j
            fh.d r6 = gh.C2390b.m6127q(r6)
            r0.<init>(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "\n            {\n                \"account_name\": \""
            r6.append(r1)
            r6.append(r5)
            java.lang.String r5 = "\",\n                \"pos\": -1,\n                \"offset\": -50\n            }"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r5 = p362uh.C6459e.m13046C(r5)
            ae.g r6 = new ae.g
            r6.<init>(r0)
            ae.h r1 = new ae.h
            r1.<init>(r0)
            ae.e r2 = new ae.e
            java.lang.String r3 = "https://wax.greymass.com/v1/history/get_actions"
            r2.<init>(r3, r5, r6, r1)
            ch.d r4 = r4.f226d
            java.lang.Object r4 = r4.getValue()
            g2.o r4 = (p105g2.C2221o) r4
            r4.m5814a(r2)
            java.lang.Object r4 = r0.m5741a()
            return r4
    }

    @Override // androidx.lifecycle.AbstractC0457n0
    /* renamed from: b */
    public void mo8b() {
            r2 = this;
            r0 = 1
            r2.f231i = r0
            android.os.Handler r0 = r2.f232j
            if (r0 == 0) goto Lb
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
        Lb:
            return
    }

    /* renamed from: e */
    public final void m120e() {
            r6 = this;
            vh.b0 r0 = p064e.C1488b.m4037d(r6)
            ae.i$b r3 = new ae.i$b
            r1 = 0
            r3.<init>(r6, r1)
            r2 = 0
            r4 = 3
            r5 = 0
            p101fh.C2174f.m5728r(r0, r1, r2, r3, r4, r5)
            return
    }
}
