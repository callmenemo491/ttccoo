package ag;

/* renamed from: ag.k */
/* loaded from: classes.dex */
public final class C0098k extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4728b0 f320c;

    /* renamed from: d */
    public final ch.InterfaceC0977d f321d;

    /* renamed from: e */
    public final androidx.lifecycle.C0437d0<java.util.List<java.lang.String>> f322e;

    /* renamed from: f */
    public final androidx.lifecycle.C0437d0<md.C4537a0> f323f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<md.C4552f0> f324g;

    /* renamed from: h */
    public final androidx.lifecycle.LiveData<java.lang.Double> f325h;

    /* renamed from: i */
    public final androidx.lifecycle.C0437d0<java.lang.Integer> f326i;

    /* renamed from: j */
    public final androidx.lifecycle.LiveData<java.lang.Integer> f327j;

    /* renamed from: k */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f328k;

    /* renamed from: ag.k$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f329Z;

        public a(android.app.Application r1) {
                r0 = this;
                r0.f329Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f329Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    /* renamed from: ag.k$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<md.C4537a0, md.C4552f0, java.lang.Double> {

        /* renamed from: Z */
        public static final ag.C0098k.b f330Z = null;

        static {
                ag.k$b r0 = new ag.k$b
                r0.<init>()
                ag.C0098k.b.f330Z = r0
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
        public java.lang.Double mo122l(md.C4537a0 r7, md.C4552f0 r8) {
                r6 = this;
                md.a0 r7 = (md.C4537a0) r7
                md.f0 r8 = (md.C4552f0) r8
                r0 = 0
                if (r7 == 0) goto L65
                if (r8 != 0) goto Lb
                goto L65
            Lb:
                java.util.List r2 = r7.getRarities()
                java.util.ArrayList r3 = new java.util.ArrayList
                r4 = 10
                int r4 = p062dh.C1469e.m3992D(r2, r4)
                r3.<init>(r4)
                java.util.Iterator r2 = r2.iterator()
            L1e:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L46
                java.lang.Object r4 = r2.next()
                md.b0 r4 = (md.C4540b0) r4
                int r5 = r4.getValue()
                if (r5 != 0) goto L32
                r4 = r0
                goto L3e
            L32:
                java.lang.String r5 = r4.getKey()
                int r4 = r4.getValue()
                double r4 = r8.hourlyClaim(r5, r4)
            L3e:
                java.lang.Double r4 = java.lang.Double.valueOf(r4)
                r3.add(r4)
                goto L1e
            L46:
                java.util.Iterator r8 = r3.iterator()
            L4a:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L5c
                java.lang.Object r2 = r8.next()
                java.lang.Number r2 = (java.lang.Number) r2
                double r2 = r2.doubleValue()
                double r0 = r0 + r2
                goto L4a
            L5c:
                double r7 = r7.valueToClaim(r0)
                java.lang.Double r7 = java.lang.Double.valueOf(r7)
                goto L69
            L65:
                java.lang.Double r7 = java.lang.Double.valueOf(r0)
            L69:
                return r7
        }
    }

    public C0098k(android.app.Application r2, p238nd.C4728b0 r3) {
            r1 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.f320c = r3
            ag.k$a r3 = new ag.k$a
            r3.<init>(r2)
            ch.d r2 = p185k7.C4038x4.m9096i(r3)
            r1.f321d = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f322e = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f323f = r2
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r1.f324g = r3
            ag.k$b r0 = ag.C0098k.b.f330Z
            androidx.lifecycle.LiveData r2 = p185k7.C4038x4.m9090c(r2, r3, r0)
            r1.f325h = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.<init>(r3)
            r1.f326i = r2
            r1.f327j = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f328k = r2
            return
    }

    /* renamed from: d */
    public final void m133d() {
            r5 = this;
            nd.b0 r0 = r5.f320c
            id.b r0 = r0.m10795h()
            if (r0 != 0) goto L9
            return
        L9:
            h2.j r1 = new h2.j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            nd.v0 r3 = p238nd.C4781v0.f19121e
            java.lang.String r4 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r3, r4)
            p214m2.C4339q.m9704i(r3)
            java.lang.String r3 = r3.m10837a()
            r2.append(r3)
            java.lang.String r3 = "/v1/assets?owner="
            r2.append(r3)
            java.lang.String r0 = r0.f12559a
            java.lang.String r3 = "&collection_name=novarallywax%2Colivelandnft%2Cpromorplanet&schema_name=olivetrees%2Cdiscordhero%2Cvehicles%2Cdrivers%2Cfanart&page=1&limit=1000"
            java.lang.String r0 = p346u.C6269n.m12888a(r2, r0, r3)
            ag.c r2 = new ag.c
            r3 = 0
            r2.<init>(r5, r3)
            qf.d r4 = p294qf.C5636d.f21927d
            r1.<init>(r3, r0, r2, r4)
            g2.o r0 = r5.m134e()
            r0.m5814a(r1)
            return
    }

    /* renamed from: e */
    public final p105g2.C2221o m134e() {
            r1 = this;
            ch.d r0 = r1.f321d
            java.lang.Object r0 = r0.getValue()
            g2.o r0 = (p105g2.C2221o) r0
            return r0
    }

    /* renamed from: f */
    public final void m135f() {
            r6 = this;
            nd.v0 r0 = p238nd.C4781v0.f19121e
            java.lang.String r1 = "Please for EndpointManager us initialize() before getting the instance."
            java.lang.String r0 = p377vd.C6638g.m13493a(r0, r1, r0)
            ag.c r2 = new ag.c
            r3 = 2
            r2.<init>(r6, r3)
            qf.c r3 = p294qf.C5635c.f21921d
            ag.i r4 = new ag.i
            java.lang.String r5 = "{\n    \"code\": \"novarallysnk\",\n    \"json\": true,\n    \"limit\": 250,\n    \"lower_bound\": \"\",\n    \"reverse\": false,\n    \"scope\": \"novarallysnk\",\n    \"show_payer\": false,\n    \"table\": \"staking\",\n    \"table_key\": \"\",\n    \"upper_bound\": \"\"\n}"
            r4.<init>(r5, r0, r2, r3)
            g2.o r0 = r6.m134e()
            r0.m5814a(r4)
            nd.b0 r0 = r6.f320c
            id.b r0 = r0.m10795h()
            if (r0 != 0) goto L27
            goto L59
        L27:
            java.lang.String r2 = "\n            {\n                \"code\": \"novarallysnk\",\n                \"json\": true,\n                \"limit\": 250,\n                \"lower_bound\": \""
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.String r3 = r0.f12559a
            r2.append(r3)
            java.lang.String r3 = "\",\n                \"reverse\": false,\n                \"scope\": \"novarallysnk\",\n                \"show_payer\": false,\n                \"table\": \"user\",\n                \"table_key\": \"\",\n                \"upper_bound\": \""
            r2.append(r3)
            java.lang.String r0 = r0.f12559a
            java.lang.String r3 = "\"\n            }"
            java.lang.String r0 = p377vd.C6637f.m13492a(r2, r0, r3)
            nd.v0 r2 = p238nd.C4781v0.f19121e
            java.lang.String r1 = p377vd.C6638g.m13493a(r2, r1, r2)
            ag.c r2 = new ag.c
            r3 = 1
            r2.<init>(r6, r3)
            ff.c r3 = p099ff.C2157c.f9898c
            ag.g r4 = new ag.g
            r4.<init>(r0, r1, r2, r3)
            g2.o r0 = r6.m134e()
            r0.m5814a(r4)
        L59:
            r6.m133d()
            return
    }
}
