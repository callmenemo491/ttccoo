package p208lg;

/* renamed from: lg.k */
/* loaded from: classes.dex */
public final class C4303k extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final ch.InterfaceC0977d f17553c;

    /* renamed from: d */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f17554d;

    /* renamed from: e */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f17555e;

    /* renamed from: f */
    public final androidx.lifecycle.C0437d0<java.util.List<mg.C4605c>> f17556f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f17557g;

    /* renamed from: h */
    public final java.lang.String f17558h;

    /* renamed from: i */
    public long f17559i;

    /* renamed from: lg.k$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f17560Z;

        public a(android.app.Application r1) {
                r0 = this;
                r0.f17560Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f17560Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.transactions.TransactionsToolViewModel$refresh$1", m7452f = "TransactionsToolViewModel.kt", m7453l = {54, 74, 87}, m7454m = "invokeSuspend")
    /* renamed from: lg.k$b */
    public static final class b extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

        /* renamed from: c0 */
        public int f17561c0;

        /* renamed from: d0 */
        public /* synthetic */ java.lang.Object f17562d0;

        /* renamed from: e0 */
        public final /* synthetic */ p208lg.C4303k f17563e0;

        /* renamed from: lg.k$b$a */
        public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<mg.C4607e, java.lang.Comparable<?>> {

            /* renamed from: Z */
            public static final p208lg.C4303k.b.a f17564Z = null;

            static {
                    lg.k$b$a r0 = new lg.k$b$a
                    r0.<init>()
                    p208lg.C4303k.b.a.f17564Z = r0
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

        /* renamed from: lg.k$b$b, reason: collision with other inner class name */
        public static final class C7403b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<mg.C4607e, java.lang.Comparable<?>> {

            /* renamed from: Z */
            public static final p208lg.C4303k.b.C7403b f17565Z = null;

            static {
                    lg.k$b$b r0 = new lg.k$b$b
                    r0.<init>()
                    p208lg.C4303k.b.C7403b.f17565Z = r0
                    return
            }

            public C7403b() {
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

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.transactions.TransactionsToolViewModel$refresh$1$2$1", m7452f = "TransactionsToolViewModel.kt", m7453l = {}, m7454m = "invokeSuspend")
        /* renamed from: lg.k$b$c */
        public static final class c extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

            /* renamed from: c0 */
            public final /* synthetic */ p208lg.C4303k f17566c0;

            /* renamed from: d0 */
            public final /* synthetic */ java.util.List<mg.C4605c> f17567d0;

            /* renamed from: e0 */
            public final /* synthetic */ long f17568e0;

            public c(p208lg.C4303k r1, java.util.List<mg.C4605c> r2, long r3, p101fh.InterfaceC2172d<? super p208lg.C4303k.b.c> r5) {
                    r0 = this;
                    r0.f17566c0 = r1
                    r0.f17567d0 = r2
                    r0.f17568e0 = r3
                    r1 = 2
                    r0.<init>(r1, r5)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r7, p101fh.InterfaceC2172d<?> r8) {
                    r6 = this;
                    lg.k$b$c r7 = new lg.k$b$c
                    lg.k r1 = r6.f17566c0
                    java.util.List<mg.c> r2 = r6.f17567d0
                    long r3 = r6.f17568e0
                    r0 = r7
                    r5 = r8
                    r0.<init>(r1, r2, r3, r5)
                    return r7
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r7, p101fh.InterfaceC2172d<? super ch.C0985l> r8) {
                    r6 = this;
                    vh.b0 r7 = (p379vh.InterfaceC6686b0) r7
                    r5 = r8
                    fh.d r5 = (p101fh.InterfaceC2172d) r5
                    lg.k$b$c r7 = new lg.k$b$c
                    lg.k r1 = r6.f17566c0
                    java.util.List<mg.c> r2 = r6.f17567d0
                    long r3 = r6.f17568e0
                    r0 = r7
                    r0.<init>(r1, r2, r3, r5)
                    ch.l r8 = ch.C0985l.f5061a
                    r7.mo123o(r8)
                    return r8
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r6) {
                    r5 = this;
                    p074e9.C1805a.m4540y(r6)
                    lg.k r6 = r5.f17566c0
                    androidx.lifecycle.d0<java.lang.Boolean> r6 = r6.f17554d
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r6.mo7l(r0)
                    lg.k r6 = r5.f17566c0
                    long r0 = r6.f17559i
                    r2 = -1
                    int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r4 != 0) goto L1e
                    androidx.lifecycle.d0<java.util.List<mg.c>> r6 = r6.f17556f
                    java.util.List<mg.c> r0 = r5.f17567d0
                    r6.mo7l(r0)
                    goto L3e
                L1e:
                    androidx.lifecycle.d0<java.util.List<mg.c>> r6 = r6.f17556f
                    java.lang.Object r6 = r6.m1411d()
                    java.util.List r6 = (java.util.List) r6
                    if (r6 == 0) goto L2d
                    java.util.List r6 = p062dh.C1473i.m4009U(r6)
                    goto L32
                L2d:
                    java.util.ArrayList r6 = new java.util.ArrayList
                    r6.<init>()
                L32:
                    java.util.List<mg.c> r0 = r5.f17567d0
                    r6.addAll(r0)
                    lg.k r0 = r5.f17566c0
                    androidx.lifecycle.d0<java.util.List<mg.c>> r0 = r0.f17556f
                    r0.mo1415j(r6)
                L3e:
                    lg.k r6 = r5.f17566c0
                    long r0 = r5.f17568e0
                    r6.f17559i = r0
                    ch.l r6 = ch.C0985l.f5061a
                    return r6
            }
        }

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.transactions.TransactionsToolViewModel$refresh$1$3$1", m7452f = "TransactionsToolViewModel.kt", m7453l = {}, m7454m = "invokeSuspend")
        /* renamed from: lg.k$b$d */
        public static final class d extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

            /* renamed from: c0 */
            public final /* synthetic */ p208lg.C4303k f17569c0;

            /* renamed from: d0 */
            public final /* synthetic */ java.lang.String f17570d0;

            public d(p208lg.C4303k r1, java.lang.String r2, p101fh.InterfaceC2172d<? super p208lg.C4303k.b.d> r3) {
                    r0 = this;
                    r0.f17569c0 = r1
                    r0.f17570d0 = r2
                    r1 = 2
                    r0.<init>(r1, r3)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                    r2 = this;
                    lg.k$b$d r3 = new lg.k$b$d
                    lg.k r0 = r2.f17569c0
                    java.lang.String r1 = r2.f17570d0
                    r3.<init>(r0, r1, r4)
                    return r3
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
                    r2 = this;
                    vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                    fh.d r4 = (p101fh.InterfaceC2172d) r4
                    lg.k$b$d r3 = new lg.k$b$d
                    lg.k r0 = r2.f17569c0
                    java.lang.String r1 = r2.f17570d0
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
                    lg.k r6 = r5.f17569c0
                    androidx.lifecycle.d0<java.lang.Boolean> r6 = r6.f17554d
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r6.mo7l(r0)
                    lg.k r6 = r5.f17569c0
                    androidx.lifecycle.d0<vg.b<ah.a>> r6 = r6.f17557g
                    java.lang.String r0 = r5.f17570d0
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

        public b(p208lg.C4303k r1, p101fh.InterfaceC2172d<? super p208lg.C4303k.b> r2) {
                r0 = this;
                r0.f17563e0 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: h */
        public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                r2 = this;
                lg.k$b r0 = new lg.k$b
                lg.k r1 = r2.f17563e0
                r0.<init>(r1, r4)
                r0.f17562d0 = r3
                return r0
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
                r2 = this;
                vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                fh.d r4 = (p101fh.InterfaceC2172d) r4
                lg.k$b r0 = new lg.k$b
                lg.k r1 = r2.f17563e0
                r0.<init>(r1, r4)
                r0.f17562d0 = r3
                ch.l r3 = ch.C0985l.f5061a
                java.lang.Object r3 = r0.mo123o(r3)
                return r3
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r24) {
                r23 = this;
                r1 = r23
                gh.a r2 = gh.EnumC2389a.f10764Y
                int r0 = r1.f17561c0
                r3 = 3
                r4 = 0
                r5 = 2
                r6 = 1
                if (r0 == 0) goto L30
                if (r0 == r6) goto L26
                if (r0 == r5) goto L1f
                if (r0 != r3) goto L17
                p074e9.C1805a.m4540y(r24)
                goto L189
            L17:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L1f:
                java.lang.Object r0 = r1.f17562d0
                p074e9.C1805a.m4540y(r24)
                goto L168
            L26:
                java.lang.Object r0 = r1.f17562d0
                lg.k r0 = (p208lg.C4303k) r0
                p074e9.C1805a.m4540y(r24)     // Catch: java.lang.Throwable -> L136
                r7 = r24
                goto L48
            L30:
                p074e9.C1805a.m4540y(r24)
                java.lang.Object r0 = r1.f17562d0
                vh.b0 r0 = (p379vh.InterfaceC6686b0) r0
                lg.k r0 = r1.f17563e0
                java.lang.String r7 = r0.f17558h     // Catch: java.lang.Throwable -> L136
                long r8 = r0.f17559i     // Catch: java.lang.Throwable -> L136
                r1.f17562d0 = r0     // Catch: java.lang.Throwable -> L136
                r1.f17561c0 = r6     // Catch: java.lang.Throwable -> L136
                java.lang.Object r7 = p208lg.C4303k.m9592d(r0, r7, r8, r1)     // Catch: java.lang.Throwable -> L136
                if (r7 != r2) goto L48
                return r2
            L48:
                mg.d r7 = (mg.C4606d) r7     // Catch: java.lang.Throwable -> L136
                java.util.List r7 = r7.getActions()     // Catch: java.lang.Throwable -> L136
                java.lang.Object r8 = p062dh.C1473i.m3996H(r7)     // Catch: java.lang.Throwable -> L136
                mg.e r8 = (mg.C4607e) r8     // Catch: java.lang.Throwable -> L136
                if (r8 == 0) goto L5b
                long r8 = r8.getAccountActionSeq()     // Catch: java.lang.Throwable -> L136
                goto L5d
            L5b:
                r8 = 0
            L5d:
                java.util.Set r7 = p062dh.C1473i.m4011W(r7)     // Catch: java.lang.Throwable -> L136
                java.util.List r7 = p062dh.C1473i.m4007S(r7)     // Catch: java.lang.Throwable -> L136
                mh.l[] r10 = new mh.InterfaceC4620l[r5]     // Catch: java.lang.Throwable -> L136
                r11 = 0
                lg.k$b$a r12 = p208lg.C4303k.b.a.f17564Z     // Catch: java.lang.Throwable -> L136
                r10[r11] = r12     // Catch: java.lang.Throwable -> L136
                lg.k$b$b r11 = p208lg.C4303k.b.C7403b.f17565Z     // Catch: java.lang.Throwable -> L136
                r10[r6] = r11     // Catch: java.lang.Throwable -> L136
                java.util.Comparator r10 = p079eh.C1850a.m4596a(r10)     // Catch: java.lang.Throwable -> L136
                java.util.List r7 = p062dh.C1473i.m4004P(r7, r10)     // Catch: java.lang.Throwable -> L136
                java.util.List r7 = p062dh.C1473i.m4003O(r7)     // Catch: java.lang.Throwable -> L136
                java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L136
                r11 = 10
                int r11 = p062dh.C1469e.m3992D(r7, r11)     // Catch: java.lang.Throwable -> L136
                r10.<init>(r11)     // Catch: java.lang.Throwable -> L136
                java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L136
            L8b:
                boolean r11 = r7.hasNext()     // Catch: java.lang.Throwable -> L136
                if (r11 == 0) goto L12a
                java.lang.Object r11 = r7.next()     // Catch: java.lang.Throwable -> L136
                mg.e r11 = (mg.C4607e) r11     // Catch: java.lang.Throwable -> L136
                java.lang.String r12 = r0.f17558h     // Catch: java.lang.Throwable -> L136
                ng.b r14 = r11.getTransactionType(r12)     // Catch: java.lang.Throwable -> L136
                android.text.SpannableStringBuilder r17 = ng.C4819a.m10846a(r14, r11)     // Catch: java.lang.Throwable -> L136
                mg.c r12 = new mg.c     // Catch: java.lang.Throwable -> L136
                mg.b r13 = r11.getActionTrace()     // Catch: java.lang.Throwable -> L136
                java.lang.String r15 = r13.getTrxID()     // Catch: java.lang.Throwable -> L136
                mg.b r13 = r11.getActionTrace()     // Catch: java.lang.Throwable -> L136
                mg.a r13 = r13.getAct()     // Catch: java.lang.Throwable -> L136
                java.lang.String r16 = r13.getAccount()     // Catch: java.lang.Throwable -> L136
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L136
                r13.<init>()     // Catch: java.lang.Throwable -> L136
                mg.b r18 = r11.getActionTrace()     // Catch: java.lang.Throwable -> L136
                mg.a r18 = r18.getAct()     // Catch: java.lang.Throwable -> L136
                java.lang.String r3 = r18.getAccount()     // Catch: java.lang.Throwable -> L136
                r13.append(r3)     // Catch: java.lang.Throwable -> L136
                java.lang.String r3 = " - "
                r13.append(r3)     // Catch: java.lang.Throwable -> L136
                mg.b r3 = r11.getActionTrace()     // Catch: java.lang.Throwable -> L136
                mg.a r3 = r3.getAct()     // Catch: java.lang.Throwable -> L136
                java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L136
                r13.append(r3)     // Catch: java.lang.Throwable -> L136
                java.lang.String r18 = r13.toString()     // Catch: java.lang.Throwable -> L136
                java.lang.String r3 = r11.getBlockTime()     // Catch: java.lang.Throwable -> L136
                java.lang.String r13 = "yyyy-MM-dd'T'HH:mm:ss.SSS"
                java.util.Calendar r3 = vg.C6664e.m13502c(r3, r13)     // Catch: java.lang.Throwable -> L136
                if (r3 == 0) goto Lf6
                java.lang.String r13 = "MMM dd, yyyy hh:mm:ss aaa"
                java.lang.String r3 = vg.C6664e.m13504e(r3, r13, r4, r5)     // Catch: java.lang.Throwable -> L136
                goto Lfa
            Lf6:
                java.lang.String r3 = r11.getBlockTime()     // Catch: java.lang.Throwable -> L136
            Lfa:
                r19 = r3
                mg.b r3 = r11.getActionTrace()     // Catch: java.lang.Throwable -> L136
                mg.a r3 = r3.getAct()     // Catch: java.lang.Throwable -> L136
                java.lang.String r20 = r3.getQuantity()     // Catch: java.lang.Throwable -> L136
                mg.b r3 = r11.getActionTrace()     // Catch: java.lang.Throwable -> L136
                mg.a r3 = r3.getAct()     // Catch: java.lang.Throwable -> L136
                java.lang.String r21 = r3.getCurrency()     // Catch: java.lang.Throwable -> L136
                mg.b r3 = r11.getActionTrace()     // Catch: java.lang.Throwable -> L136
                mg.a r3 = r3.getAct()     // Catch: java.lang.Throwable -> L136
                java.lang.String r22 = r3.getImageURL()     // Catch: java.lang.Throwable -> L136
                r13 = r12
                r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> L136
                r10.add(r12)     // Catch: java.lang.Throwable -> L136
                r3 = 3
                goto L8b
            L12a:
                java.lang.Long r0 = new java.lang.Long     // Catch: java.lang.Throwable -> L136
                r0.<init>(r8)     // Catch: java.lang.Throwable -> L136
                ch.e r3 = new ch.e     // Catch: java.lang.Throwable -> L136
                r3.<init>(r10, r0)     // Catch: java.lang.Throwable -> L136
                r0 = r3
                goto L13b
            L136:
                r0 = move-exception
                java.lang.Object r0 = p074e9.C1805a.m4520e(r0)
            L13b:
                lg.k r8 = r1.f17563e0
                boolean r3 = r0 instanceof ch.C0979f.a
                r3 = r3 ^ r6
                if (r3 == 0) goto L168
                r3 = r0
                ch.e r3 = (ch.C0978e) r3
                A r6 = r3.f5050Y
                r9 = r6
                java.util.List r9 = (java.util.List) r9
                B r3 = r3.f5051Z
                java.lang.Number r3 = (java.lang.Number) r3
                long r10 = r3.longValue()
                vh.z r3 = p379vh.C6716l0.f26007a
                vh.k1 r3 = p459zh.C7346l.f28106a
                lg.k$b$c r6 = new lg.k$b$c
                r12 = 0
                r7 = r6
                r7.<init>(r8, r9, r10, r12)
                r1.f17562d0 = r0
                r1.f17561c0 = r5
                java.lang.Object r3 = p101fh.C2174f.m5710A(r3, r6, r1)
                if (r3 != r2) goto L168
                return r2
            L168:
                lg.k r3 = r1.f17563e0
                java.lang.Throwable r5 = ch.C0979f.m2690b(r0)
                if (r5 == 0) goto L189
                java.lang.String r5 = vg.C6672m.m13514a(r5)
                vh.z r6 = p379vh.C6716l0.f26007a
                vh.k1 r6 = p459zh.C7346l.f28106a
                lg.k$b$d r7 = new lg.k$b$d
                r7.<init>(r3, r5, r4)
                r1.f17562d0 = r0
                r3 = 3
                r1.f17561c0 = r3
                java.lang.Object r0 = p101fh.C2174f.m5710A(r6, r7, r1)
                if (r0 != r2) goto L189
                return r2
            L189:
                ch.l r0 = ch.C0985l.f5061a
                return r0
        }
    }

    public C4303k(android.app.Application r2, p238nd.C4728b0 r3) {
            r1 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            lg.k$a r0 = new lg.k$a
            r0.<init>(r2)
            ch.d r2 = p185k7.C4038x4.m9096i(r0)
            r1.f17553c = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f17554d = r2
            r1.f17555e = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            dh.k r0 = p062dh.C1475k.f7237Y
            r2.<init>(r0)
            r1.f17556f = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f17557g = r2
            id.b r2 = r3.m10795h()
            if (r2 == 0) goto L3b
            java.lang.String r2 = r2.f12559a
            if (r2 != 0) goto L3d
        L3b:
            java.lang.String r2 = ""
        L3d:
            r1.f17558h = r2
            r2 = -1
            r1.f17559i = r2
            return
    }

    /* renamed from: d */
    public static final java.lang.Object m9592d(p208lg.C4303k r2, java.lang.String r3, long r4, p101fh.InterfaceC2172d r6) {
            fh.j r0 = new fh.j
            fh.d r6 = gh.C2390b.m6127q(r6)
            r0.<init>(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "\n            {\n                \"account_name\": \""
            r6.append(r1)
            r6.append(r3)
            java.lang.String r3 = "\",\n                \"pos\": "
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = ",\n                \"offset\": -100\n            }"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.String r3 = p362uh.C6459e.m13046C(r3)
            lg.i r4 = new lg.i
            r4.<init>(r0)
            lg.j r5 = new lg.j
            r5.<init>(r0)
            lg.g r6 = new lg.g
            java.lang.String r1 = "https://wax.greymass.com/v1/history/get_actions"
            r6.<init>(r1, r3, r4, r5)
            ch.d r2 = r2.f17553c
            java.lang.Object r2 = r2.getValue()
            g2.o r2 = (p105g2.C2221o) r2
            r2.m5814a(r6)
            java.lang.Object r2 = r0.m5741a()
            return r2
    }

    /* renamed from: f */
    public static /* synthetic */ void m9593f(p208lg.C4303k r0, boolean r1, int r2) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            r0.m9594e(r1)
            return
    }

    /* renamed from: e */
    public final void m9594e(boolean r9) {
            r8 = this;
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r8.f17554d
            java.lang.Object r0 = r0.m1411d()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 != 0) goto L35
            if (r9 != 0) goto L19
            long r2 = r8.f17559i
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L19
            goto L35
        L19:
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r8.f17554d
            r0.mo7l(r1)
            if (r9 == 0) goto L24
            r0 = -1
            r8.f17559i = r0
        L24:
            vh.b0 r2 = p064e.C1488b.m4037d(r8)
            r3 = 0
            lg.k$b r5 = new lg.k$b
            r9 = 0
            r5.<init>(r8, r9)
            r6 = 3
            r7 = 0
            r4 = 0
            p101fh.C2174f.m5728r(r2, r3, r4, r5, r6, r7)
        L35:
            return
    }
}
