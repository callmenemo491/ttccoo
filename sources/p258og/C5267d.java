package p258og;

/* renamed from: og.d */
/* loaded from: classes.dex */
public final class C5267d extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4728b0 f20446c;

    /* renamed from: d */
    public final ch.InterfaceC0977d f20447d;

    /* renamed from: e */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f20448e;

    /* renamed from: f */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f20449f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<java.lang.Double> f20450g;

    /* renamed from: h */
    public final androidx.lifecycle.LiveData<java.lang.Double> f20451h;

    /* renamed from: i */
    public final androidx.lifecycle.C0437d0<java.lang.Double> f20452i;

    /* renamed from: j */
    public final androidx.lifecycle.LiveData<java.lang.Double> f20453j;

    /* renamed from: k */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f20454k;

    /* renamed from: l */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f20455l;

    /* renamed from: m */
    public final androidx.lifecycle.C0437d0<vg.C6661b<ch.C0985l>> f20456m;

    /* renamed from: n */
    public java.lang.String f20457n;

    /* renamed from: og.d$a */
    public static final class a {
        public boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof p258og.C5267d.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                og.d$a r4 = (p258og.C5267d.a) r4
                java.util.Objects.requireNonNull(r4)
                r4 = 0
                boolean r4 = p214m2.C4339q.m9702c(r4, r4)
                if (r4 != 0) goto L17
                return r2
            L17:
                return r0
        }

        public int hashCode() {
                r1 = this;
                r0 = 0
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "MessageResponse(message=null)"
                return r0
        }
    }

    /* renamed from: og.d$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.Boolean, java.lang.Boolean, java.lang.Boolean> {

        /* renamed from: Z */
        public static final p258og.C5267d.b f20458Z = null;

        static {
                og.d$b r0 = new og.d$b
                r0.<init>()
                p258og.C5267d.b.f20458Z = r0
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
        public java.lang.Boolean mo122l(java.lang.Boolean r2, java.lang.Boolean r3) {
                r1 = this;
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                boolean r2 = p214m2.C4339q.m9702c(r2, r0)
                if (r2 == 0) goto Lf
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                goto L1b
            Lf:
                if (r3 == 0) goto L16
                boolean r2 = r3.booleanValue()
                goto L17
            L16:
                r2 = 0
            L17:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            L1b:
                return r2
        }
    }

    /* renamed from: og.d$c */
    public static final class c extends p119h2.C2448j {

        /* renamed from: p0 */
        public final /* synthetic */ java.lang.String f20459p0;

        /* renamed from: q0 */
        public final /* synthetic */ java.lang.String f20460q0;

        public c(java.lang.String r1, java.lang.String r2, p258og.C5267d.d<T> r3, p258og.C5267d.e r4) {
                r0 = this;
                r0.f20459p0 = r1
                r0.f20460q0 = r2
                r1 = 1
                java.lang.String r2 = "https://tools.uplift.art:3033/v1/world/account/claim-upliftium"
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: l */
        public byte[] mo116l() {
                r2 = this;
                java.lang.String r0 = r2.f20459p0
                java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
                byte[] r0 = r0.getBytes(r1)
                java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: p */
        public java.util.Map<java.lang.String, java.lang.String> mo5806p() {
                r6 = this;
                r0 = 10
                ch.e[] r0 = new ch.C0978e[r0]
                ch.e r1 = new ch.e
                java.lang.String r2 = "Content-Type"
                java.lang.String r3 = "application/json"
                r1.<init>(r2, r3)
                r2 = 0
                r0[r2] = r1
                r1 = 1
                java.lang.String r2 = r6.f20460q0
                ch.e r4 = new ch.e
                java.lang.String r5 = "Authorization"
                r4.<init>(r5, r2)
                r0[r1] = r4
                r1 = 2
                ch.e r2 = new ch.e
                java.lang.String r4 = "Origin"
                java.lang.String r5 = "https://enter.theuplift.world"
                r2.<init>(r4, r5)
                r0[r1] = r2
                r1 = 3
                ch.e r2 = new ch.e
                java.lang.String r4 = "Referer"
                java.lang.String r5 = "https://enter.theuplift.world/"
                r2.<init>(r4, r5)
                r0[r1] = r2
                r1 = 4
                ch.e r2 = new ch.e
                java.lang.String r4 = "Host"
                java.lang.String r5 = "tools.uplift.art:3033"
                r2.<init>(r4, r5)
                r0[r1] = r2
                r1 = 5
                ch.e r2 = new ch.e
                java.lang.String r4 = "Sec-Fetch-Dest"
                java.lang.String r5 = "empty"
                r2.<init>(r4, r5)
                r0[r1] = r2
                r1 = 6
                ch.e r2 = new ch.e
                java.lang.String r4 = "Sec-Fetch-Mode"
                java.lang.String r5 = "cors"
                r2.<init>(r4, r5)
                r0[r1] = r2
                r1 = 7
                ch.e r2 = new ch.e
                java.lang.String r4 = "Sec-Fetch-Site"
                java.lang.String r5 = "cross-site"
                r2.<init>(r4, r5)
                r0[r1] = r2
                r1 = 8
                ch.e r2 = new ch.e
                java.lang.String r4 = "X-Requested-With"
                java.lang.String r5 = "XmlHttpRequest"
                r2.<init>(r4, r5)
                r0[r1] = r2
                r1 = 9
                ch.e r2 = new ch.e
                java.lang.String r4 = "Accept"
                r2.<init>(r4, r3)
                r0[r1] = r2
                java.util.Map r0 = p062dh.C1480p.m4014s(r0)
                return r0
        }
    }

    /* renamed from: og.d$d */
    public static final class d<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p101fh.InterfaceC2172d<md.C4541b1> f20461a;

        public d(p101fh.InterfaceC2172d<? super md.C4541b1> r1) {
                r0 = this;
                r0.f20461a = r1
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r4) {
                r3 = this;
                java.lang.String r4 = (java.lang.String) r4
                fh.d<md.b1> r0 = r3.f20461a
                java.lang.String r1 = "response"
                jb.j r1 = p238nd.C4754k.m10827a(r4, r1)
                og.f r2 = new og.f
                r2.<init>()
                java.lang.reflect.Type r2 = r2.f21382b
                java.lang.Object r4 = r1.m7929c(r4, r2)
                r0.mo5707k(r4)
                return
        }
    }

    /* renamed from: og.d$e */
    public static final class e implements p105g2.C2222p.a {

        /* renamed from: a */
        public final /* synthetic */ p101fh.InterfaceC2172d<md.C4541b1> f20462a;

        public e(p101fh.InterfaceC2172d<? super md.C4541b1> r1) {
                r0 = this;
                r0.f20462a = r1
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.a
        /* renamed from: a */
        public final void mo118a(p105g2.C2226t r3) {
                r2 = this;
                fh.d<md.b1> r0 = r2.f20462a
                java.lang.String r1 = "it"
                p214m2.C4339q.m9705j(r3, r1)
                java.lang.Object r3 = p074e9.C1805a.m4520e(r3)
                r0.mo5707k(r3)
                return
        }
    }

    /* renamed from: og.d$f */
    public static final class f extends p119h2.C2448j {

        /* renamed from: p0 */
        public final /* synthetic */ java.lang.String f20463p0;

        public f(java.lang.String r1, java.lang.String r2, p258og.C5267d.g<T> r3, p258og.C5267d.h r4) {
                r0 = this;
                r0.f20463p0 = r1
                r1 = 1
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: l */
        public byte[] mo116l() {
                r2 = this;
                java.lang.String r0 = r2.f20463p0
                java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
                byte[] r0 = r0.getBytes(r1)
                java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: og.d$g */
    public static final class g<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p101fh.InterfaceC2172d<md.C4536a> f20464a;

        public g(p101fh.InterfaceC2172d<? super md.C4536a> r1) {
                r0 = this;
                r0.f20464a = r1
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r4) {
                r3 = this;
                java.lang.String r4 = (java.lang.String) r4
                fh.d<md.a> r0 = r3.f20464a
                java.lang.String r1 = "response"
                jb.j r1 = p238nd.C4754k.m10827a(r4, r1)
                og.i r2 = new og.i
                r2.<init>()
                java.lang.reflect.Type r2 = r2.f21382b
                java.lang.Object r4 = r1.m7929c(r4, r2)
                r0.mo5707k(r4)
                return
        }
    }

    /* renamed from: og.d$h */
    public static final class h implements p105g2.C2222p.a {

        /* renamed from: a */
        public final /* synthetic */ p101fh.InterfaceC2172d<md.C4536a> f20465a;

        public h(p101fh.InterfaceC2172d<? super md.C4536a> r1) {
                r0 = this;
                r0.f20465a = r1
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.a
        /* renamed from: a */
        public final void mo118a(p105g2.C2226t r3) {
                r2 = this;
                fh.d<md.a> r0 = r2.f20465a
                java.lang.String r1 = "it"
                p214m2.C4339q.m9705j(r3, r1)
                java.lang.Object r3 = p074e9.C1805a.m4520e(r3)
                r0.mo5707k(r3)
                return
        }
    }

    /* renamed from: og.d$i */
    public static final class i extends p119h2.C2448j {

        /* renamed from: p0 */
        public final /* synthetic */ java.lang.String f20466p0;

        public i(java.lang.String r2, p258og.C5267d.j<T> r3, p258og.C5267d.k r4) {
                r1 = this;
                r1.f20466p0 = r2
                r2 = 1
                java.lang.String r0 = "https://tools.uplift.art:3033/v1/world/account/auth"
                r1.<init>(r2, r0, r3, r4)
                return
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: l */
        public byte[] mo116l() {
                r2 = this;
                java.lang.String r0 = r2.f20466p0
                java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
                byte[] r0 = r0.getBytes(r1)
                java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: p */
        public java.util.Map<java.lang.String, java.lang.String> mo5806p() {
                r3 = this;
                ch.e r0 = new ch.e
                java.lang.String r1 = "Content-Type"
                java.lang.String r2 = "application/json"
                r0.<init>(r1, r2)
                java.util.Map r0 = p185k7.C4038x4.m9098k(r0)
                return r0
        }
    }

    /* renamed from: og.d$j */
    public static final class j<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p101fh.InterfaceC2172d<md.C4590y0> f20467a;

        public j(p101fh.InterfaceC2172d<? super md.C4590y0> r1) {
                r0 = this;
                r0.f20467a = r1
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r4) {
                r3 = this;
                java.lang.String r4 = (java.lang.String) r4
                fh.d<md.y0> r0 = r3.f20467a
                java.lang.String r1 = "response"
                jb.j r1 = p238nd.C4754k.m10827a(r4, r1)
                og.j r2 = new og.j
                r2.<init>()
                java.lang.reflect.Type r2 = r2.f21382b
                java.lang.Object r4 = r1.m7929c(r4, r2)
                r0.mo5707k(r4)
                return
        }
    }

    /* renamed from: og.d$k */
    public static final class k implements p105g2.C2222p.a {

        /* renamed from: a */
        public final /* synthetic */ p101fh.InterfaceC2172d<md.C4590y0> f20468a;

        public k(p101fh.InterfaceC2172d<? super md.C4590y0> r1) {
                r0 = this;
                r0.f20468a = r1
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.a
        /* renamed from: a */
        public final void mo118a(p105g2.C2226t r3) {
                r2 = this;
                fh.d<md.y0> r0 = r2.f20468a
                java.lang.String r1 = "it"
                p214m2.C4339q.m9705j(r3, r1)
                java.lang.Object r3 = p074e9.C1805a.m4520e(r3)
                r0.mo5707k(r3)
                return
        }
    }

    /* renamed from: og.d$l */
    public static final class l extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f20469Z;

        public l(android.app.Application r1) {
                r0 = this;
                r0.f20469Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f20469Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    public C5267d(android.app.Application r3, p238nd.C4728b0 r4) {
            r2 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r4, r0)
            r2.<init>()
            r2.f20446c = r4
            og.d$l r4 = new og.d$l
            r4.<init>(r3)
            ch.d r3 = p185k7.C4038x4.m9096i(r4)
            r2.f20447d = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r2.f20448e = r3
            r2.f20449f = r3
            androidx.lifecycle.d0 r4 = new androidx.lifecycle.d0
            r0 = 0
            r4.<init>(r0)
            r2.f20450g = r4
            r2.f20451h = r4
            androidx.lifecycle.d0 r4 = new androidx.lifecycle.d0
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.<init>(r0)
            r2.f20452i = r4
            r2.f20453j = r4
            k1.b r0 = p179k1.C3642b.f16075x0
            androidx.lifecycle.LiveData r4 = androidx.lifecycle.C0455m0.m1450a(r4, r0)
            og.d$b r0 = p258og.C5267d.b.f20458Z
            androidx.lifecycle.LiveData r3 = p185k7.C4038x4.m9090c(r3, r4, r0)
            r2.f20454k = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r2.f20455l = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r2.f20456m = r3
            return
    }

    /* renamed from: d */
    public final java.lang.Object m11519d(java.lang.String r3, java.lang.String r4, java.lang.String r5, p101fh.InterfaceC2172d<? super md.C4541b1> r6) {
            r2 = this;
            fh.j r0 = new fh.j
            fh.d r6 = gh.C2390b.m6127q(r6)
            r0.<init>(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "\n             {\n                \"chainAccount\": \""
            r6.append(r1)
            r6.append(r3)
            java.lang.String r3 = "\",\n                \"chainType\": \"WAX\",\n                \"minecraftUUID\": \""
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = "\"\n            }"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.String r3 = p362uh.C6459e.m13046C(r3)
            java.lang.String r4 = "Bearer "
            java.lang.String r4 = p064e.C1493g.m4049a(r4, r5)
            og.d$d r5 = new og.d$d
            r5.<init>(r0)
            og.d$e r6 = new og.d$e
            r6.<init>(r0)
            og.d$c r1 = new og.d$c
            r1.<init>(r3, r4, r5, r6)
            g2.o r3 = r2.m11522g()
            r3.m5814a(r1)
            java.lang.Object r3 = r0.m5741a()
            return r3
    }

    /* renamed from: e */
    public final java.lang.Object m11520e(java.lang.String r5, p101fh.InterfaceC2172d<? super md.C4536a> r6) {
            r4 = this;
            fh.j r0 = new fh.j
            fh.d r6 = gh.C2390b.m6127q(r6)
            r0.<init>(r6)
            java.lang.String r6 = "{\"account_name\": \""
            java.lang.String r1 = "\"}"
            java.lang.String r5 = android.support.v4.media.C0145d.m257a(r6, r5, r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            nd.v0 r1 = p238nd.C4781v0.f19121e
            java.lang.String r2 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r1, r2)
            java.lang.String r1 = r1.f19124c
            java.lang.String r2 = "/v1/chain/get_account"
            java.lang.String r6 = p346u.C6269n.m12888a(r6, r1, r2)
            og.d$g r1 = new og.d$g
            r1.<init>(r0)
            og.d$h r2 = new og.d$h
            r2.<init>(r0)
            og.d$f r3 = new og.d$f
            r3.<init>(r5, r6, r1, r2)
            g2.o r5 = r4.m11522g()
            r5.m5814a(r3)
            java.lang.Object r5 = r0.m5741a()
            return r5
    }

    /* renamed from: f */
    public final java.lang.Object m11521f(java.lang.String r10, java.lang.String r11, p255od.C5230t0 r12, p101fh.InterfaceC2172d<? super md.C4590y0> r13) {
            r9 = this;
            fh.j r0 = new fh.j
            fh.d r13 = gh.C2390b.m6127q(r13)
            r0.<init>(r13)
            java.lang.String r13 = "\n            {\n                \"block_num\": \""
            java.lang.StringBuilder r13 = android.support.v4.media.C0144c.m256a(r13)
            java.math.BigInteger r1 = r12.getBlock_num()
            r13.append(r1)
            java.lang.String r1 = "\",\n                \"chainAccount\": \""
            r13.append(r1)
            r13.append(r10)
            java.lang.String r10 = "\",\n                \"chainPermission\": \"active\",\n                \"chainType\": \"WAX\",\n                \"key\": \""
            r13.append(r10)
            r13.append(r11)
            java.lang.String r10 = "\",\n                \"nonce\": \"23849328\",\n                \"serializedTx\": {\n                    \"data\": "
            r13.append(r10)
            java.lang.String r10 = r12.getSerializedTx()
            r13.append(r10)
            java.lang.String r10 = ",\n                    \"type\": \"Buffer\"\n                },\n                \"signatures\": "
            r13.append(r10)
            java.util.List r1 = r12.getSignatures()
            java.lang.String r10 = "<this>"
            p214m2.C4339q.m9706k(r1, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r11 = 91
            r10.append(r11)
            java.lang.String r2 = "\",\""
            java.lang.String r3 = "\""
            java.lang.String r4 = "\""
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 56
            java.lang.String r11 = p062dh.C1473i.m4000L(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.append(r11)
            r11 = 93
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r13.append(r10)
            java.lang.String r10 = "\n            }"
            r13.append(r10)
            java.lang.String r10 = r13.toString()
            java.lang.String r10 = p362uh.C6459e.m13046C(r10)
            og.d$j r11 = new og.d$j
            r11.<init>(r0)
            og.d$k r12 = new og.d$k
            r12.<init>(r0)
            og.d$i r13 = new og.d$i
            r13.<init>(r10, r11, r12)
            g2.o r10 = r9.m11522g()
            r10.m5814a(r13)
            java.lang.Object r10 = r0.m5741a()
            return r10
    }

    /* renamed from: g */
    public final p105g2.C2221o m11522g() {
            r1 = this;
            ch.d r0 = r1.f20447d
            java.lang.Object r0 = r0.getValue()
            g2.o r0 = (p105g2.C2221o) r0
            return r0
    }

    /* renamed from: h */
    public final void m11523h() {
            r4 = this;
            nd.b0 r0 = r4.f20446c
            id.b r0 = r0.m10795h()
            if (r0 != 0) goto L9
            goto L2b
        L9:
            java.lang.String r1 = "\n            { \n\t            \"chainAccount\": \""
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r0 = r0.f12559a
            java.lang.String r2 = "\",\n\t            \"chainType\": \"WAX\"\n            }"
            java.lang.String r0 = p377vd.C6637f.m13492a(r1, r0, r2)
            og.c r1 = new og.c
            r2 = 0
            r1.<init>(r4, r2)
            nd.r r2 = p238nd.C4772r.f19099g
            og.h r3 = new og.h
            r3.<init>(r0, r1, r2)
            g2.o r0 = r4.m11522g()
            r0.m5814a(r3)
        L2b:
            return
    }
}
