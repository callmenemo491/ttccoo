package p098fe;

/* renamed from: fe.j */
/* loaded from: classes.dex */
public final class C2149j extends androidx.lifecycle.C0432b {

    /* renamed from: A */
    public final androidx.lifecycle.C0437d0<java.lang.String> f9852A;

    /* renamed from: B */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f9853B;

    /* renamed from: d */
    public final p238nd.C4728b0 f9854d;

    /* renamed from: e */
    public final io.tacocrypto.app.database.AppDatabase f9855e;

    /* renamed from: f */
    public final p238nd.C4753j1 f9856f;

    /* renamed from: g */
    public final p238nd.C4756k1 f9857g;

    /* renamed from: h */
    public final ch.InterfaceC0977d f9858h;

    /* renamed from: i */
    public final ch.InterfaceC0977d f9859i;

    /* renamed from: j */
    public final androidx.lifecycle.LiveData<ch.C0978e<id.C3131b, java.lang.Boolean>> f9860j;

    /* renamed from: k */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f9861k;

    /* renamed from: l */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f9862l;

    /* renamed from: m */
    public final androidx.lifecycle.C0437d0<vg.C6661b<java.lang.Double>> f9863m;

    /* renamed from: n */
    public final androidx.lifecycle.C0437d0<vg.C6661b<java.lang.Boolean>> f9864n;

    /* renamed from: o */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f9865o;

    /* renamed from: p */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f9866p;

    /* renamed from: q */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f9867q;

    /* renamed from: r */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f9868r;

    /* renamed from: s */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f9869s;

    /* renamed from: t */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f9870t;

    /* renamed from: u */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f9871u;

    /* renamed from: v */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f9872v;

    /* renamed from: w */
    public final androidx.lifecycle.C0437d0<md.C4536a> f9873w;

    /* renamed from: x */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f9874x;

    /* renamed from: y */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f9875y;

    /* renamed from: z */
    public final androidx.lifecycle.C0437d0<java.lang.String> f9876z;

    /* renamed from: fe.j$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p238nd.C4730c> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f9877Z;

        public a(android.app.Application r1) {
                r0 = this;
                r0.f9877Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p238nd.C4730c mo15e() {
                r4 = this;
                android.app.Application r0 = r4.f9877Z
                java.lang.String r1 = "context"
                p214m2.C4339q.m9706k(r0, r1)
                nd.c r1 = p238nd.C4730c.f18962j
                if (r1 != 0) goto L28
                java.lang.Class<nd.c> r1 = p238nd.C4730c.class
                monitor-enter(r1)
                nd.c r2 = p238nd.C4730c.f18962j     // Catch: java.lang.Throwable -> L25
                if (r2 != 0) goto L23
                nd.c r2 = new nd.c     // Catch: java.lang.Throwable -> L25
                android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L25
                java.lang.String r3 = "context.applicationContext"
                p214m2.C4339q.m9705j(r0, r3)     // Catch: java.lang.Throwable -> L25
                r3 = 0
                r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L25
                p238nd.C4730c.f18962j = r2     // Catch: java.lang.Throwable -> L25
            L23:
                monitor-exit(r1)
                goto L28
            L25:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            L28:
                nd.c r0 = p238nd.C4730c.f18962j
                p214m2.C4339q.m9704i(r0)
                return r0
        }
    }

    /* renamed from: fe.j$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f9878Z;

        public b(android.app.Application r1) {
                r0 = this;
                r0.f9878Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f9878Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.settings.SettingsViewModel$refresh$1", m7452f = "SettingsViewModel.kt", m7453l = {137}, m7454m = "invokeSuspend")
    /* renamed from: fe.j$c */
    public static final class c extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

        /* renamed from: c0 */
        public int f9879c0;

        /* renamed from: d0 */
        public /* synthetic */ java.lang.Object f9880d0;

        /* renamed from: e0 */
        public final /* synthetic */ p098fe.C2149j f9881e0;

        public c(p098fe.C2149j r1, p101fh.InterfaceC2172d<? super p098fe.C2149j.c> r2) {
                r0 = this;
                r0.f9881e0 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: h */
        public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                r2 = this;
                fe.j$c r0 = new fe.j$c
                fe.j r1 = r2.f9881e0
                r0.<init>(r1, r4)
                r0.f9880d0 = r3
                return r0
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
                r2 = this;
                vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
                fh.d r4 = (p101fh.InterfaceC2172d) r4
                fe.j$c r0 = new fe.j$c
                fe.j r1 = r2.f9881e0
                r0.<init>(r1, r4)
                r0.f9880d0 = r3
                ch.l r3 = ch.C0985l.f5061a
                java.lang.Object r3 = r0.mo123o(r3)
                return r3
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r12) {
                r11 = this;
                gh.a r0 = gh.EnumC2389a.f10764Y
                int r1 = r11.f9879c0
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 != r3) goto L16
                java.lang.Object r0 = r11.f9880d0
                androidx.lifecycle.d0 r0 = (androidx.lifecycle.C0437d0) r0
                p074e9.C1805a.m4540y(r12)     // Catch: java.lang.Throwable -> L13
                goto L9d
            L13:
                r12 = move-exception
                goto La0
            L16:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1e:
                p074e9.C1805a.m4540y(r12)
                java.lang.Object r12 = r11.f9880d0
                vh.b0 r12 = (p379vh.InterfaceC6686b0) r12
                fe.j r12 = r11.f9881e0
                nd.k1 r12 = r12.f9857g
                boolean r12 = r12.m10830c()
                if (r12 != 0) goto L7c
                fe.j r12 = r11.f9881e0
                nd.b0 r12 = r12.f9854d
                androidx.lifecycle.LiveData<java.util.List<id.b>> r12 = r12.f18925u
                java.lang.Object r12 = r12.m1411d()
                java.util.List r12 = (java.util.List) r12
                if (r12 != 0) goto L3f
                dh.k r12 = p062dh.C1475k.f7237Y
            L3f:
                fe.j r1 = r11.f9881e0
                nd.k1 r1 = r1.f9857g
                java.util.ArrayList r4 = new java.util.ArrayList
                r5 = 10
                int r5 = p062dh.C1469e.m3992D(r12, r5)
                r4.<init>(r5)
                java.util.Iterator r12 = r12.iterator()
            L52:
                boolean r5 = r12.hasNext()
                if (r5 == 0) goto L64
                java.lang.Object r5 = r12.next()
                id.b r5 = (id.C3131b) r5
                java.lang.String r5 = r5.f12559a
                r4.add(r5)
                goto L52
            L64:
                java.util.Objects.requireNonNull(r1)
                boolean r12 = r1.f19063f
                if (r12 == 0) goto L6c
                goto L7c
            L6c:
                r1.f19063f = r3
                vh.v0 r5 = p379vh.C6746v0.f26044Y
                r6 = 0
                nd.n1 r8 = new nd.n1
                r8.<init>(r1, r4, r2)
                r9 = 3
                r10 = 0
                r7 = 0
                p101fh.C2174f.m5714d(r5, r6, r7, r8, r9, r10)
            L7c:
                fe.j r12 = r11.f9881e0
                nd.b0 r12 = r12.f9854d
                id.b r12 = r12.m10795h()
                if (r12 == 0) goto L89
                java.lang.String r12 = r12.f12559a
                goto L8a
            L89:
                r12 = r2
            L8a:
                fe.j r1 = r11.f9881e0
                androidx.lifecycle.d0<md.a> r4 = r1.f9873w
                p214m2.C4339q.m9704i(r12)     // Catch: java.lang.Throwable -> La2
                r11.f9880d0 = r4     // Catch: java.lang.Throwable -> La2
                r11.f9879c0 = r3     // Catch: java.lang.Throwable -> La2
                java.lang.Object r12 = p098fe.C2149j.m5699d(r1, r12, r11)     // Catch: java.lang.Throwable -> La2
                if (r12 != r0) goto L9c
                return r0
            L9c:
                r0 = r4
            L9d:
                md.a r12 = (md.C4536a) r12     // Catch: java.lang.Throwable -> L13
                goto La8
            La0:
                r4 = r0
                goto La3
            La2:
                r12 = move-exception
            La3:
                java.lang.Object r12 = p074e9.C1805a.m4520e(r12)
                r0 = r4
            La8:
                boolean r1 = r12 instanceof ch.C0979f.a
                if (r1 == 0) goto Lad
                goto Lae
            Lad:
                r2 = r12
            Lae:
                r0.mo7l(r2)
                fe.j r12 = r11.f9881e0
                androidx.lifecycle.d0<java.lang.Boolean> r12 = r12.f9861k
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                r12.mo7l(r0)
                ch.l r12 = ch.C0985l.f5061a
                return r12
        }
    }

    public C2149j(android.app.Application r2, p238nd.C4728b0 r3, io.tacocrypto.app.database.AppDatabase r4, p238nd.C4753j1 r5, p238nd.C4756k1 r6) {
            r1 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "appDatabase"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "preferenceStorage"
            p214m2.C4339q.m9706k(r5, r0)
            java.lang.String r0 = "secretToolManager"
            p214m2.C4339q.m9706k(r6, r0)
            r1.<init>(r2)
            r1.f9854d = r3
            r1.f9855e = r4
            r1.f9856f = r5
            r1.f9857g = r6
            fe.j$b r4 = new fe.j$b
            r4.<init>(r2)
            ch.d r4 = p185k7.C4038x4.m9096i(r4)
            r1.f9858h = r4
            fe.j$a r4 = new fe.j$a
            r4.<init>(r2)
            ch.d r2 = p185k7.C4038x4.m9096i(r4)
            r1.f9859i = r2
            androidx.lifecycle.LiveData<ch.e<id.b, java.lang.Boolean>> r2 = r3.f18903B
            r1.f9860j = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f9861k = r2
            r1.f9862l = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f9863m = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f9864n = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            boolean r3 = r5.m10823d()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.<init>(r3)
            r1.f9865o = r2
            r1.f9866p = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            boolean r3 = r5.m10822c()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.<init>(r3)
            r1.f9867q = r2
            r1.f9868r = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            boolean r3 = r5.m10821b()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.<init>(r3)
            r1.f9869s = r2
            r1.f9870t = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            android.content.SharedPreferences r3 = r5.m10820a()
            java.lang.String r4 = "showNFTPlayerValue"
            r5 = 0
            boolean r3 = r3.getBoolean(r4, r5)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.<init>(r3)
            r1.f9871u = r2
            r1.f9872v = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r3 = 0
            r2.<init>(r3)
            r1.f9873w = r2
            androidx.lifecycle.LiveData<java.util.Set<io.tacocrypto.app.ui.secret.c>> r2 = r6.f19061d
            fe.i r3 = new fe.i
            r3.<init>(r1, r5)
            androidx.lifecycle.LiveData r2 = androidx.lifecycle.C0455m0.m1450a(r2, r3)
            r1.f9874x = r2
            androidx.lifecycle.LiveData<java.util.Set<io.tacocrypto.app.ui.secret.c>> r2 = r6.f19061d
            fe.i r3 = new fe.i
            r4 = 1
            r3.<init>(r1, r4)
            androidx.lifecycle.LiveData r2 = androidx.lifecycle.C0455m0.m1450a(r2, r3)
            r1.f9875y = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            nd.v0 r3 = p238nd.C4781v0.f19121e
            java.lang.String r4 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r3, r4)
            java.lang.String r3 = r3.f19124c
            r2.<init>(r3)
            r1.f9876z = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            nd.v0 r3 = p238nd.C4781v0.f19121e
            java.util.Objects.requireNonNull(r3, r4)
            nd.v0$a r3 = r3.f19125d
            java.lang.String r3 = r3.f19146Y
            r2.<init>(r3)
            r1.f9852A = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f9853B = r2
            return
    }

    /* renamed from: d */
    public static final java.lang.Object m5699d(p098fe.C2149j r4, java.lang.String r5, p101fh.InterfaceC2172d r6) {
            java.util.Objects.requireNonNull(r4)
            fh.j r0 = new fh.j
            fh.d r6 = gh.C2390b.m6127q(r6)
            r0.<init>(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            nd.v0 r1 = p238nd.C4781v0.f19121e
            java.lang.String r2 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r1, r2)
            java.lang.String r1 = r1.f19124c
            java.lang.String r2 = "/v1/chain/get_account"
            java.lang.String r6 = p346u.C6269n.m12888a(r6, r1, r2)
            java.lang.String r1 = "{\"account_name\": \""
            java.lang.String r2 = "\"}"
            java.lang.String r5 = android.support.v4.media.C0145d.m257a(r1, r5, r2)
            fe.m r1 = new fe.m
            r1.<init>(r0)
            fe.n r2 = new fe.n
            r2.<init>(r0)
            fe.k r3 = new fe.k
            r3.<init>(r6, r5, r1, r2)
            ch.d r4 = r4.f9858h
            java.lang.Object r4 = r4.getValue()
            g2.o r4 = (p105g2.C2221o) r4
            r4.m5814a(r3)
            java.lang.Object r4 = r0.m5741a()
            return r4
    }

    /* renamed from: e */
    public final void m5700e() {
            r8 = this;
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r8.f9861k
            java.lang.Object r0 = r0.m1411d()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto Lf
            return
        Lf:
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r8.f9861k
            r0.mo7l(r1)
            vh.b0 r2 = p064e.C1488b.m4037d(r8)
            r3 = 0
            fe.j$c r5 = new fe.j$c
            r0 = 0
            r5.<init>(r8, r0)
            r6 = 3
            r7 = 0
            r4 = 0
            p101fh.C2174f.m5728r(r2, r3, r4, r5, r6, r7)
            return
    }
}
