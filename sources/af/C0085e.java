package af;

/* renamed from: af.e */
/* loaded from: classes.dex */
public final class C0085e extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4728b0 f270c;

    /* renamed from: d */
    public final ch.InterfaceC0977d f271d;

    /* renamed from: e */
    public final androidx.lifecycle.LiveData<ch.C0978e<id.C3131b, java.lang.Boolean>> f272e;

    /* renamed from: f */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f273f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<java.util.List<ch.C0978e<af.EnumC0087g, md.C4587x>>> f274g;

    /* renamed from: h */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f275h;

    /* renamed from: i */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f276i;

    /* renamed from: j */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f277j;

    /* renamed from: k */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f278k;

    /* renamed from: l */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f279l;

    /* renamed from: m */
    public final androidx.lifecycle.C0437d0<java.lang.Long> f280m;

    /* renamed from: n */
    public final androidx.lifecycle.C0437d0<java.lang.Long> f281n;

    /* renamed from: o */
    public final androidx.lifecycle.C0437d0<java.lang.Long> f282o;

    /* renamed from: p */
    public final androidx.lifecycle.C0437d0<java.lang.Long> f283p;

    /* renamed from: q */
    public final androidx.lifecycle.C0437d0<java.lang.Long> f284q;

    /* renamed from: r */
    public android.os.CountDownTimer f285r;

    /* renamed from: s */
    public android.os.CountDownTimer f286s;

    /* renamed from: t */
    public android.os.CountDownTimer f287t;

    /* renamed from: u */
    public android.os.CountDownTimer f288u;

    /* renamed from: af.e$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.Boolean, java.lang.String, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ af.C0085e f289Z;

        public a(af.C0085e r1) {
                r0 = this;
                r0.f289Z = r1
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
                af.e r0 = r4.f289Z
                androidx.lifecycle.d0<vg.b<ah.a>> r1 = r0.f273f
                if (r5 == 0) goto L54
                androidx.lifecycle.d0<java.lang.Boolean> r5 = r0.f275h
                java.lang.Boolean r6 = java.lang.Boolean.FALSE
                r5.mo7l(r6)
                af.e r5 = r4.f289Z
                androidx.lifecycle.d0<java.lang.Boolean> r5 = r5.f276i
                r5.mo7l(r6)
                af.e r5 = r4.f289Z
                androidx.lifecycle.d0<java.lang.Boolean> r5 = r5.f277j
                r5.mo7l(r6)
                af.e r5 = r4.f289Z
                androidx.lifecycle.d0<java.lang.Boolean> r5 = r5.f278k
                r5.mo7l(r6)
                android.os.Handler r5 = new android.os.Handler
                android.os.Looper r6 = android.os.Looper.getMainLooper()
                r5.<init>(r6)
                af.e r6 = r4.f289Z
                f1.f r0 = new f1.f
                r0.<init>(r6)
                r2 = 1000(0x3e8, double:4.94E-321)
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
                goto L65
            L54:
                r0.m130f()
                vg.b r0 = new vg.b
                ah.a r5 = new ah.a
                zg.d r2 = p458zg.EnumC7332d.f28068Z
                java.lang.String r3 = "Transaction Error"
                r5.<init>(r3, r6, r2)
                r0.<init>(r5)
            L65:
                r1.mo7l(r0)
                ch.l r5 = ch.C0985l.f5061a
                return r5
        }
    }

    /* renamed from: af.e$b */
    public static final class b extends p119h2.C2448j {

        /* renamed from: p0 */
        public final /* synthetic */ java.lang.String f290p0;

        public b(java.lang.String r1, java.lang.String r2, p105g2.C2222p.b<java.lang.String> r3, p105g2.C2222p.a r4) {
                r0 = this;
                r0.f290p0 = r1
                r1 = 1
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: l */
        public byte[] mo116l() {
                r2 = this;
                java.lang.String r0 = r2.f290p0
                java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
                byte[] r0 = r0.getBytes(r1)
                java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: af.e$c */
    public static final class c extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f291Z;

        public c(android.app.Application r1) {
                r0 = this;
                r0.f291Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f291Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    /* renamed from: af.e$d */
    public static final class d extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.util.List<? extends ch.C0978e<? extends af.EnumC0087g, ? extends md.C4587x>>, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ af.C0085e f292Z;

        public d(af.C0085e r1) {
                r0 = this;
                r0.f292Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(java.util.List<? extends ch.C0978e<? extends af.EnumC0087g, ? extends md.C4587x>> r14) {
                r13 = this;
                java.util.List r14 = (java.util.List) r14
                java.lang.String r0 = "list"
                p214m2.C4339q.m9706k(r14, r0)
                af.g[] r0 = af.EnumC0087g.values()
                java.util.List r0 = p062dh.C1468d.m3991M(r0)
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r3 = p062dh.C1469e.m3992D(r0, r2)
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L1e:
                boolean r3 = r0.hasNext()
                r4 = 0
                r5 = 0
                r6 = 1
                if (r3 == 0) goto L56
                java.lang.Object r3 = r0.next()
                af.g r3 = (af.EnumC0087g) r3
                java.util.Iterator r5 = r14.iterator()
            L31:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L48
                java.lang.Object r6 = r5.next()
                r7 = r6
                ch.e r7 = (ch.C0978e) r7
                A r7 = r7.f5050Y
                if (r7 != r3) goto L44
                r7 = 1
                goto L45
            L44:
                r7 = 0
            L45:
                if (r7 == 0) goto L31
                goto L49
            L48:
                r6 = r4
            L49:
                ch.e r6 = (ch.C0978e) r6
                if (r6 != 0) goto L52
                ch.e r6 = new ch.e
                r6.<init>(r3, r4)
            L52:
                r1.add(r6)
                goto L1e
            L56:
                af.e r14 = r13.f292Z
                androidx.lifecycle.d0<java.util.List<ch.e<af.g, md.x>>> r14 = r14.f274g
                r14.mo7l(r1)
                java.lang.String r14 = "UTC"
                java.util.TimeZone r14 = java.util.TimeZone.getTimeZone(r14)
                java.util.Calendar r14 = java.util.Calendar.getInstance(r14)
                r0 = 13
                r3 = -3
                r14.add(r0, r3)
                long r7 = r14.getTimeInMillis()
                java.util.ArrayList r14 = new java.util.ArrayList
                int r0 = p062dh.C1469e.m3992D(r1, r2)
                r14.<init>(r0)
                java.util.Iterator r0 = r1.iterator()
            L7e:
                boolean r1 = r0.hasNext()
                r2 = -1
                if (r1 == 0) goto Lc4
                java.lang.Object r1 = r0.next()
                ch.e r1 = (ch.C0978e) r1
                A r9 = r1.f5050Y
                B r1 = r1.f5051Z
                md.x r1 = (md.C4587x) r1
                if (r1 == 0) goto Lba
                java.lang.String r1 = r1.getNextClaim()
                if (r1 == 0) goto Lba
                java.lang.String r10 = "+0000"
                java.lang.String r1 = p064e.C1493g.m4049a(r1, r10)
                if (r1 == 0) goto Lba
                java.lang.String r10 = "yyyy-MM-dd'T'HH:mm:ss.SSSZ"
                java.util.Calendar r1 = vg.C6664e.m13502c(r1, r10)
                if (r1 == 0) goto Lba
                long r10 = r1.getTimeInMillis()
                int r1 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r1 > 0) goto Lb3
                goto Lb5
            Lb3:
                long r2 = r10 - r7
            Lb5:
                java.lang.Long r1 = java.lang.Long.valueOf(r2)
                goto Lbb
            Lba:
                r1 = r4
            Lbb:
                ch.e r2 = new ch.e
                r2.<init>(r9, r1)
                r14.add(r2)
                goto L7e
            Lc4:
                af.e r0 = r13.f292Z
                android.os.CountDownTimer r1 = r0.f285r
                if (r1 == 0) goto Lcd
                r1.cancel()
            Lcd:
                android.os.CountDownTimer r1 = r0.f286s
                if (r1 == 0) goto Ld4
                r1.cancel()
            Ld4:
                android.os.CountDownTimer r1 = r0.f287t
                if (r1 == 0) goto Ldb
                r1.cancel()
            Ldb:
                android.os.CountDownTimer r1 = r0.f288u
                if (r1 == 0) goto Le2
                r1.cancel()
            Le2:
                java.util.Iterator r1 = r14.iterator()
            Le6:
                boolean r7 = r1.hasNext()
                r8 = 0
                if (r7 == 0) goto L10b
                java.lang.Object r7 = r1.next()
                r10 = r7
                ch.e r10 = (ch.C0978e) r10
                B r10 = r10.f5051Z
                java.lang.Long r10 = (java.lang.Long) r10
                if (r10 == 0) goto L100
                long r10 = r10.longValue()
                goto L101
            L100:
                r10 = r8
            L101:
                int r12 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r12 != 0) goto L107
                r10 = 1
                goto L108
            L107:
                r10 = 0
            L108:
                if (r10 == 0) goto Le6
                r4 = r7
            L10b:
                if (r4 == 0) goto L10e
                r5 = 1
            L10e:
                androidx.lifecycle.d0<java.lang.Boolean> r1 = r0.f279l
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
                r1.mo7l(r2)
                if (r5 == 0) goto L122
                androidx.lifecycle.d0<java.lang.Long> r1 = r0.f284q
                java.lang.Long r2 = java.lang.Long.valueOf(r8)
                r1.mo7l(r2)
            L122:
                java.util.Iterator r14 = r14.iterator()
            L126:
                boolean r1 = r14.hasNext()
                if (r1 == 0) goto L175
                java.lang.Object r1 = r14.next()
                ch.e r1 = (ch.C0978e) r1
                A r2 = r1.f5050Y
                af.g r2 = (af.EnumC0087g) r2
                B r1 = r1.f5051Z
                java.lang.Long r1 = (java.lang.Long) r1
                int r2 = r2.ordinal()
                if (r2 == 0) goto L16a
                if (r2 == r6) goto L15f
                r3 = 2
                if (r2 == r3) goto L154
                r3 = 3
                if (r2 == r3) goto L149
                goto L126
            L149:
                androidx.lifecycle.d0<java.lang.Boolean> r2 = r0.f278k
                androidx.lifecycle.d0<java.lang.Long> r3 = r0.f283p
                android.os.CountDownTimer r1 = r0.m131g(r1, r2, r3)
                r0.f288u = r1
                goto L126
            L154:
                androidx.lifecycle.d0<java.lang.Boolean> r2 = r0.f277j
                androidx.lifecycle.d0<java.lang.Long> r3 = r0.f282o
                android.os.CountDownTimer r1 = r0.m131g(r1, r2, r3)
                r0.f287t = r1
                goto L126
            L15f:
                androidx.lifecycle.d0<java.lang.Boolean> r2 = r0.f276i
                androidx.lifecycle.d0<java.lang.Long> r3 = r0.f281n
                android.os.CountDownTimer r1 = r0.m131g(r1, r2, r3)
                r0.f286s = r1
                goto L126
            L16a:
                androidx.lifecycle.d0<java.lang.Boolean> r2 = r0.f275h
                androidx.lifecycle.d0<java.lang.Long> r3 = r0.f280m
                android.os.CountDownTimer r1 = r0.m131g(r1, r2, r3)
                r0.f285r = r1
                goto L126
            L175:
                ch.l r14 = ch.C0985l.f5061a
                return r14
        }
    }

    /* renamed from: af.e$e */
    public static final class e extends android.os.CountDownTimer {

        /* renamed from: a */
        public final /* synthetic */ androidx.lifecycle.C0437d0<java.lang.Long> f293a;

        /* renamed from: b */
        public final /* synthetic */ androidx.lifecycle.C0437d0<java.lang.Boolean> f294b;

        /* renamed from: c */
        public final /* synthetic */ af.C0085e f295c;

        public e(java.lang.Long r1, androidx.lifecycle.C0437d0<java.lang.Long> r2, androidx.lifecycle.C0437d0<java.lang.Boolean> r3, af.C0085e r4) {
                r0 = this;
                r0.f293a = r2
                r0.f294b = r3
                r0.f295c = r4
                long r1 = r1.longValue()
                r3 = 1000(0x3e8, double:4.94E-321)
                r0.<init>(r1, r3)
                return
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
                r4 = this;
                androidx.lifecycle.d0<java.lang.Boolean> r0 = r4.f294b
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r0.mo7l(r1)
                androidx.lifecycle.d0<java.lang.Long> r0 = r4.f293a
                r2 = 0
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r0.mo7l(r2)
                af.e r0 = r4.f295c
                androidx.lifecycle.d0<java.lang.Boolean> r0 = r0.f279l
                r0.mo7l(r1)
                af.e r0 = r4.f295c
                androidx.lifecycle.d0<java.lang.Long> r0 = r0.f284q
                r0.mo7l(r2)
                return
        }

        @Override // android.os.CountDownTimer
        public void onTick(long r2) {
                r1 = this;
                androidx.lifecycle.d0<java.lang.Long> r0 = r1.f293a
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r0.mo7l(r2)
                return
        }
    }

    public C0085e(android.app.Application r4, p238nd.C4728b0 r5) {
            r3 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r5, r0)
            r3.<init>()
            r3.f270c = r5
            af.e$c r0 = new af.e$c
            r0.<init>(r4)
            ch.d r4 = p185k7.C4038x4.m9096i(r0)
            r3.f271d = r4
            androidx.lifecycle.LiveData<ch.e<id.b, java.lang.Boolean>> r4 = r5.f18903B
            r3.f272e = r4
            androidx.lifecycle.d0 r4 = new androidx.lifecycle.d0
            r4.<init>()
            r3.f273f = r4
            af.g[] r4 = af.EnumC0087g.values()
            java.util.List r4 = p062dh.C1468d.m3991M(r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = p062dh.C1469e.m3992D(r4, r0)
            r5.<init>(r0)
            java.util.Iterator r4 = r4.iterator()
        L3c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L52
            java.lang.Object r0 = r4.next()
            af.g r0 = (af.EnumC0087g) r0
            ch.e r1 = new ch.e
            r2 = 0
            r1.<init>(r0, r2)
            r5.add(r1)
            goto L3c
        L52:
            androidx.lifecycle.d0 r4 = new androidx.lifecycle.d0
            r4.<init>(r5)
            r3.f274g = r4
            androidx.lifecycle.d0 r4 = new androidx.lifecycle.d0
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.<init>(r5)
            r3.f275h = r4
            androidx.lifecycle.d0 r4 = new androidx.lifecycle.d0
            r4.<init>(r5)
            r3.f276i = r4
            androidx.lifecycle.d0 r4 = new androidx.lifecycle.d0
            r4.<init>(r5)
            r3.f277j = r4
            androidx.lifecycle.d0 r4 = new androidx.lifecycle.d0
            r4.<init>(r5)
            r3.f278k = r4
            androidx.lifecycle.d0 r4 = new androidx.lifecycle.d0
            r4.<init>(r5)
            r3.f279l = r4
            androidx.lifecycle.d0 r4 = new androidx.lifecycle.d0
            r4.<init>()
            r3.f280m = r4
            androidx.lifecycle.d0 r4 = new androidx.lifecycle.d0
            r4.<init>()
            r3.f281n = r4
            androidx.lifecycle.d0 r4 = new androidx.lifecycle.d0
            r4.<init>()
            r3.f282o = r4
            androidx.lifecycle.d0 r4 = new androidx.lifecycle.d0
            r4.<init>()
            r3.f283p = r4
            androidx.lifecycle.d0 r4 = new androidx.lifecycle.d0
            r4.<init>()
            r3.f284q = r4
            return
    }

    /* renamed from: e */
    public static final void m128e(af.C0085e r13, id.C3131b r14, java.util.List<? extends af.EnumC0087g> r15, java.util.List<? extends ch.C0978e<? extends af.EnumC0087g, md.C4587x>> r16, mh.InterfaceC4620l<? super java.util.List<? extends ch.C0978e<? extends af.EnumC0087g, md.C4587x>>, ch.C0985l> r17) {
            r7 = r14
            java.lang.Object r0 = p062dh.C1473i.m3996H(r15)
            r5 = r0
            af.g r5 = (af.EnumC0087g) r5
            if (r5 != 0) goto L12
            r8 = r16
            r9 = r17
            r9.mo107b(r8)
            return
        L12:
            r8 = r16
            r9 = r17
            java.lang.String r0 = r5.f301Y
            java.lang.String r1 = "\n            {\n               \"code\": \""
            java.lang.String r2 = "\",\n               \"json\": true,\n               \"limit\": 1,\n               \"lower_bound\": \""
            java.lang.StringBuilder r1 = androidx.activity.result.C0196d.m449a(r1, r0, r2)
            java.lang.String r2 = r7.f12559a
            java.lang.String r3 = "\",\n               \"scope\": \""
            java.lang.String r4 = "\",\n               \"table\": \"claims\",\n               \"upper_bound\": \""
            p179k1.C3661s.m8090a(r1, r2, r3, r0, r4)
            java.lang.String r0 = r7.f12559a
            java.lang.String r2 = "\"\n            }"
            java.lang.String r10 = p377vd.C6637f.m13492a(r1, r0, r2)
            nd.v0 r0 = p238nd.C4781v0.f19121e
            java.lang.String r1 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r0, r1)
            java.lang.String r11 = r0.m10839c()
            af.d r12 = new af.d
            r0 = r12
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            af.c r6 = new af.c
            r0 = r6
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            af.e$b r0 = new af.e$b
            r0.<init>(r10, r11, r12, r6)
            r1 = r13
            ch.d r1 = r1.f271d
            java.lang.Object r1 = r1.getValue()
            g2.o r1 = (p105g2.C2221o) r1
            r1.m5814a(r0)
            return
    }

    @Override // androidx.lifecycle.AbstractC0457n0
    /* renamed from: b */
    public void mo8b() {
            r1 = this;
            android.os.CountDownTimer r0 = r1.f285r
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            android.os.CountDownTimer r0 = r1.f286s
            if (r0 == 0) goto Le
            r0.cancel()
        Le:
            android.os.CountDownTimer r0 = r1.f287t
            if (r0 == 0) goto L15
            r0.cancel()
        L15:
            android.os.CountDownTimer r0 = r1.f288u
            if (r0 == 0) goto L1c
            r0.cancel()
        L1c:
            return
    }

    /* renamed from: d */
    public final void m129d(android.content.Context r17, af.EnumC0087g r18) {
            r16 = this;
            r0 = r16
            if (r18 != 0) goto L50
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            androidx.lifecycle.d0<java.lang.Boolean> r2 = r0.f275h
            java.lang.Object r2 = r2.m1411d()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = p214m2.C4339q.m9702c(r2, r3)
            if (r2 == 0) goto L1c
            af.g r2 = af.EnumC0087g.f296Z
            r1.add(r2)
        L1c:
            androidx.lifecycle.d0<java.lang.Boolean> r2 = r0.f276i
            java.lang.Object r2 = r2.m1411d()
            boolean r2 = p214m2.C4339q.m9702c(r2, r3)
            if (r2 == 0) goto L2d
            af.g r2 = af.EnumC0087g.f297a0
            r1.add(r2)
        L2d:
            androidx.lifecycle.d0<java.lang.Boolean> r2 = r0.f277j
            java.lang.Object r2 = r2.m1411d()
            boolean r2 = p214m2.C4339q.m9702c(r2, r3)
            if (r2 == 0) goto L3e
            af.g r2 = af.EnumC0087g.f298b0
            r1.add(r2)
        L3e:
            androidx.lifecycle.d0<java.lang.Boolean> r2 = r0.f278k
            java.lang.Object r2 = r2.m1411d()
            boolean r2 = p214m2.C4339q.m9702c(r2, r3)
            if (r2 == 0) goto L54
            af.g r2 = af.EnumC0087g.f299c0
            r1.add(r2)
            goto L54
        L50:
            java.util.List r1 = p074e9.C1805a.m4528m(r18)
        L54:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L70
            androidx.lifecycle.d0<vg.b<ah.a>> r1 = r0.f273f
            zg.d r2 = p458zg.EnumC7332d.f28069a0
            vg.b r3 = new vg.b
            ah.a r4 = new ah.a
            java.lang.String r5 = "Wait"
            java.lang.String r6 = "You have to wait for at least one CLAIM"
            r4.<init>(r5, r6, r2)
            r3.<init>(r4)
            r1.mo7l(r3)
            return
        L70:
            nd.b0 r2 = r0.f270c
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r5 = p062dh.C1469e.m3992D(r1, r4)
            r3.<init>(r5)
            java.util.Iterator r5 = r1.iterator()
        L81:
            boolean r6 = r5.hasNext()
            r7 = 1
            if (r6 == 0) goto Lcd
            java.lang.Object r6 = r5.next()
            af.g r6 = (af.EnumC0087g) r6
            int r6 = r6.ordinal()
            if (r6 == 0) goto Lc0
            if (r6 == r7) goto Lb6
            r7 = 2
            if (r6 == r7) goto Lac
            r8 = 3
            if (r6 != r8) goto La6
            ch.e r6 = new ch.e
            java.lang.String r7 = "bottleofsoap"
            java.lang.String r8 = "6,PUFT"
            r6.<init>(r7, r8)
            goto Lc9
        La6:
            e7.y7 r1 = new e7.y7
            r1.<init>(r7)
            throw r1
        Lac:
            ch.e r6 = new ch.e
            java.lang.String r7 = "e.rplanet"
            java.lang.String r8 = "4,AETHER"
            r6.<init>(r7, r8)
            goto Lc9
        Lb6:
            ch.e r6 = new ch.e
            java.lang.String r7 = "gnokentokens"
            java.lang.String r8 = "4,GNOKEN"
            r6.<init>(r7, r8)
            goto Lc9
        Lc0:
            ch.e r6 = new ch.e
            java.lang.String r7 = "tokencrafter"
            java.lang.String r8 = "4,CAIT"
            r6.<init>(r7, r8)
        Lc9:
            r3.add(r6)
            goto L81
        Lcd:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = p062dh.C1469e.m3992D(r1, r4)
            r5.<init>(r6)
            java.util.Iterator r1 = r1.iterator()
        Lda:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto Lf1
            java.lang.Object r6 = r1.next()
            af.g r6 = (af.EnumC0087g) r6
            od.m r8 = new od.m
            java.lang.String r6 = r6.f301Y
            r8.<init>(r6)
            r5.add(r8)
            goto Lda
        Lf1:
            af.e$a r1 = new af.e$a
            r1.<init>(r0)
            java.util.Objects.requireNonNull(r2)
            r2.f18918n = r1
            id.b r1 = r2.m10795h()
            if (r1 != 0) goto L103
            goto L19d
        L103:
            java.lang.String r6 = r1.f12559a
            int r8 = r6.length()
            if (r8 != 0) goto L10d
            r8 = 1
            goto L10e
        L10d:
            r8 = 0
        L10e:
            if (r8 != 0) goto L19e
            one.block.eosiojava.models.rpcProvider.Authorization r8 = new one.block.eosiojava.models.rpcProvider.Authorization
            java.lang.String r9 = r2.f18911g
            r8.<init>(r6, r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = p062dh.C1469e.m3992D(r3, r4)
            r10.<init>(r11)
            java.util.Iterator r3 = r3.iterator()
        L129:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L151
            java.lang.Object r11 = r3.next()
            ch.e r11 = (ch.C0978e) r11
            nd.w0 r12 = new nd.w0
            A r13 = r11.f5050Y
            java.lang.String r13 = (java.lang.String) r13
            pd.u1 r14 = new pd.u1
            B r11 = r11.f5051Z
            java.lang.String r11 = (java.lang.String) r11
            r14.<init>(r6, r11, r6)
            java.util.List r11 = p074e9.C1805a.m4528m(r8)
            java.lang.String r15 = "open"
            r12.<init>(r13, r15, r14, r11)
            r10.add(r12)
            goto L129
        L151:
            r9.addAll(r10)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = p062dh.C1469e.m3992D(r5, r4)
            r3.<init>(r4)
            java.util.Iterator r4 = r5.iterator()
        L161:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L185
            java.lang.Object r5 = r4.next()
            od.m r5 = (p255od.C5215m) r5
            nd.w0 r10 = new nd.w0
            java.lang.String r5 = r5.getContract()
            pd.k2 r11 = new pd.k2
            r11.<init>(r6)
            java.util.List r12 = p074e9.C1805a.m4528m(r8)
            java.lang.String r13 = "claim"
            r10.<init>(r5, r13, r11, r12)
            r3.add(r10)
            goto L161
        L185:
            r9.addAll(r3)
            b3.b r3 = new b3.b
            r3.<init>(r7)
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r4 = r3.f3814a
            r4.addAll(r9)
            nd.a r4 = p238nd.EnumC4724a.f18870a0
            r3.m2209d(r4, r8)
            r4 = 0
            r5 = r17
            r2.m10804r(r5, r1, r3, r4)
        L19d:
            return
        L19e:
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r2 = "USER_NOT_SIGNED"
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: f */
    public final void m130f() {
            r4 = this;
            androidx.lifecycle.LiveData<ch.e<id.b, java.lang.Boolean>> r0 = r4.f272e
            java.lang.Object r0 = r0.m1411d()
            ch.e r0 = (ch.C0978e) r0
            if (r0 == 0) goto L23
            A r0 = r0.f5050Y
            id.b r0 = (id.C3131b) r0
            if (r0 != 0) goto L11
            goto L23
        L11:
            af.e$d r1 = new af.e$d
            r1.<init>(r4)
            af.g[] r2 = af.EnumC0087g.values()
            java.util.List r2 = p062dh.C1468d.m3991M(r2)
            dh.k r3 = p062dh.C1475k.f7237Y
            m128e(r4, r0, r2, r3, r1)
        L23:
            return
    }

    /* renamed from: g */
    public final android.os.CountDownTimer m131g(java.lang.Long r6, androidx.lifecycle.C0437d0<java.lang.Boolean> r7, androidx.lifecycle.C0437d0<java.lang.Long> r8) {
            r5 = this;
            if (r6 == 0) goto L1c
            long r0 = r6.longValue()
            double r0 = (double) r0
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1c
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r7.mo7l(r0)
            af.e$e r0 = new af.e$e
            r0.<init>(r6, r8, r7, r5)
            android.os.CountDownTimer r6 = r0.start()
            goto L34
        L1c:
            if (r6 == 0) goto L27
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.mo7l(r0)
        L27:
            if (r6 == 0) goto L2b
            r6 = 1
            goto L2c
        L2b:
            r6 = 0
        L2c:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r7.mo7l(r6)
            r6 = 0
        L34:
            return r6
    }
}
