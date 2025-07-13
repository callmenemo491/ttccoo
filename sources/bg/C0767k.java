package bg;

/* renamed from: bg.k */
/* loaded from: classes.dex */
public final class C0767k extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4728b0 f4113c;

    /* renamed from: d */
    public final ch.InterfaceC0977d f4114d;

    /* renamed from: e */
    public final androidx.lifecycle.C0437d0<java.util.List<java.lang.String>> f4115e;

    /* renamed from: f */
    public final androidx.lifecycle.C0437d0<md.C4560j0> f4116f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<md.C4568n0> f4117g;

    /* renamed from: h */
    public final androidx.lifecycle.LiveData<java.lang.Double> f4118h;

    /* renamed from: i */
    public final androidx.lifecycle.LiveData<java.lang.Integer> f4119i;

    /* renamed from: j */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f4120j;

    /* renamed from: bg.k$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f4121Z;

        public a(android.app.Application r1) {
                r0 = this;
                r0.f4121Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f4121Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    /* renamed from: bg.k$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<md.C4560j0, md.C4568n0, java.lang.Double> {

        /* renamed from: Z */
        public static final bg.C0767k.b f4122Z = null;

        static {
                bg.k$b r0 = new bg.k$b
                r0.<init>()
                bg.C0767k.b.f4122Z = r0
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
        public java.lang.Double mo122l(md.C4560j0 r8, md.C4568n0 r9) {
                r7 = this;
                md.j0 r8 = (md.C4560j0) r8
                md.n0 r9 = (md.C4568n0) r9
                r0 = 0
                if (r8 == 0) goto L6e
                if (r9 != 0) goto Lb
                goto L6e
            Lb:
                java.util.List r2 = r8.getRarities()
                java.util.ArrayList r3 = new java.util.ArrayList
                r4 = 10
                int r4 = p062dh.C1469e.m3992D(r2, r4)
                r3.<init>(r4)
                java.util.Iterator r2 = r2.iterator()
            L1e:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L4f
                java.lang.Object r4 = r2.next()
                md.k0 r4 = (md.C4562k0) r4
                int r5 = r4.getValue()
                if (r5 != 0) goto L31
                goto L3d
            L31:
                md.g0$a r5 = md.EnumC4554g0.Companion
                java.lang.String r6 = r4.getKey()
                md.g0 r5 = r5.findByKey(r6)
                if (r5 != 0) goto L3f
            L3d:
                r4 = r0
                goto L47
            L3f:
                int r4 = r4.getValue()
                double r4 = r9.hourlyClaim(r5, r4)
            L47:
                java.lang.Double r4 = java.lang.Double.valueOf(r4)
                r3.add(r4)
                goto L1e
            L4f:
                java.util.Iterator r9 = r3.iterator()
            L53:
                boolean r2 = r9.hasNext()
                if (r2 == 0) goto L65
                java.lang.Object r2 = r9.next()
                java.lang.Number r2 = (java.lang.Number) r2
                double r2 = r2.doubleValue()
                double r0 = r0 + r2
                goto L53
            L65:
                double r8 = r8.valueToClaim(r0)
                java.lang.Double r8 = java.lang.Double.valueOf(r8)
                goto L72
            L6e:
                java.lang.Double r8 = java.lang.Double.valueOf(r0)
            L72:
                return r8
        }
    }

    public C0767k(android.app.Application r2, p238nd.C4728b0 r3) {
            r1 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.f4113c = r3
            bg.k$a r3 = new bg.k$a
            r3.<init>(r2)
            ch.d r2 = p185k7.C4038x4.m9096i(r3)
            r1.f4114d = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f4115e = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f4116f = r2
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r1.f4117g = r3
            bg.k$b r0 = bg.C0767k.b.f4122Z
            androidx.lifecycle.LiveData r3 = p185k7.C4038x4.m9090c(r2, r3, r0)
            r1.f4118h = r3
            androidx.room.a r3 = androidx.room.C0618a.f3673w0
            androidx.lifecycle.LiveData r2 = androidx.lifecycle.C0455m0.m1450a(r2, r3)
            r1.f4119i = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f4120j = r2
            return
    }

    /* renamed from: d */
    public final void m2357d() {
            r6 = this;
            nd.b0 r0 = r6.f4113c
            id.b r0 = r0.m10795h()
            if (r0 != 0) goto L9
            return
        L9:
            h2.j r1 = new h2.j
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            nd.v0 r4 = p238nd.C4781v0.f19121e
            java.lang.String r5 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r4, r5)
            p214m2.C4339q.m9704i(r4)
            java.lang.String r4 = r4.m10837a()
            r3.append(r4)
            java.lang.String r4 = "/v1/assets?owner="
            r3.append(r4)
            java.lang.String r0 = r0.f12559a
            java.lang.String r4 = "&collection_name=olivelandnft&page=1&limit=1000&order=desc&sort=asset_id"
            java.lang.String r0 = p346u.C6269n.m12888a(r3, r0, r4)
            bg.c r3 = new bg.c
            r4 = 2
            r3.<init>(r6, r4)
            qf.c r4 = p294qf.C5635c.f21922e
            r1.<init>(r2, r0, r3, r4)
            g2.o r0 = r6.m2358e()
            r0.m5814a(r1)
            return
    }

    /* renamed from: e */
    public final p105g2.C2221o m2358e() {
            r1 = this;
            ch.d r0 = r1.f4114d
            java.lang.Object r0 = r0.getValue()
            g2.o r0 = (p105g2.C2221o) r0
            return r0
    }

    /* renamed from: f */
    public final void m2359f() {
            r6 = this;
            nd.v0 r0 = p238nd.C4781v0.f19121e
            java.lang.String r1 = "Please for EndpointManager us initialize() before getting the instance."
            java.lang.String r0 = p377vd.C6638g.m13493a(r0, r1, r0)
            bg.c r2 = new bg.c
            r3 = 1
            r2.<init>(r6, r3)
            ff.c r3 = p099ff.C2157c.f9899d
            bg.i r4 = new bg.i
            java.lang.String r5 = "{\n    \"code\": \"olivelandstk\",\n    \"json\": true,\n    \"limit\": 250,\n    \"lower_bound\": \"\",\n    \"reverse\": false,\n    \"scope\": \"olivelandstk\",\n    \"show_payer\": false,\n    \"table\": \"staking\",\n    \"table_key\": \"\",\n    \"upper_bound\": \"\"\n}"
            r4.<init>(r5, r0, r2, r3)
            g2.o r0 = r6.m2358e()
            r0.m5814a(r4)
            nd.b0 r0 = r6.f4113c
            id.b r0 = r0.m10795h()
            if (r0 != 0) goto L27
            goto L59
        L27:
            java.lang.String r2 = "\n            {\n                \"code\": \"olivelandstk\",\n                \"json\": true,\n                \"limit\": 250,\n                \"lower_bound\": \""
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.String r3 = r0.f12559a
            r2.append(r3)
            java.lang.String r3 = "\",\n                \"reverse\": false,\n                \"scope\": \"olivelandstk\",\n                \"show_payer\": false,\n                \"table\": \"user\",\n                \"table_key\": \"\",\n                \"upper_bound\": \""
            r2.append(r3)
            java.lang.String r0 = r0.f12559a
            java.lang.String r3 = "\"\n            }"
            java.lang.String r0 = p377vd.C6637f.m13492a(r2, r0, r3)
            nd.v0 r2 = p238nd.C4781v0.f19121e
            java.lang.String r1 = p377vd.C6638g.m13493a(r2, r1, r2)
            bg.c r2 = new bg.c
            r3 = 0
            r2.<init>(r6, r3)
            qf.d r3 = p294qf.C5636d.f21928e
            bg.g r4 = new bg.g
            r4.<init>(r0, r1, r2, r3)
            g2.o r0 = r6.m2358e()
            r0.m5814a(r4)
        L59:
            r6.m2357d()
            return
    }
}
