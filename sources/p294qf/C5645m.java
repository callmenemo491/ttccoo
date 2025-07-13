package p294qf;

/* renamed from: qf.m */
/* loaded from: classes.dex */
public final class C5645m extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4728b0 f21938c;

    /* renamed from: d */
    public final ch.InterfaceC0977d f21939d;

    /* renamed from: e */
    public final androidx.lifecycle.C0437d0<java.util.List<java.lang.String>> f21940e;

    /* renamed from: f */
    public final androidx.lifecycle.C0437d0<java.util.List<md.C4537a0>> f21941f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<java.util.List<md.C4575r>> f21942g;

    /* renamed from: h */
    public final androidx.lifecycle.LiveData<java.lang.Double> f21943h;

    /* renamed from: i */
    public final androidx.lifecycle.C0437d0<java.lang.Integer> f21944i;

    /* renamed from: j */
    public final androidx.lifecycle.LiveData<java.lang.Integer> f21945j;

    /* renamed from: k */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f21946k;

    /* renamed from: qf.m$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f21947Z;

        public a(android.app.Application r1) {
                r0 = this;
                r0.f21947Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f21947Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    /* renamed from: qf.m$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.util.List<? extends md.C4537a0>, java.util.List<? extends md.C4575r>, java.lang.Double> {

        /* renamed from: Z */
        public static final p294qf.C5645m.b f21948Z = null;

        static {
                qf.m$b r0 = new qf.m$b
                r0.<init>()
                p294qf.C5645m.b.f21948Z = r0
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
        public java.lang.Double mo122l(java.util.List<? extends md.C4537a0> r11, java.util.List<? extends md.C4575r> r12) {
                r10 = this;
                java.util.List r11 = (java.util.List) r11
                java.util.List r12 = (java.util.List) r12
                r0 = 0
                if (r11 == 0) goto Lc1
                if (r12 != 0) goto Lc
                goto Lc1
            Lc:
                java.util.ArrayList r2 = new java.util.ArrayList
                r3 = 10
                int r4 = p062dh.C1469e.m3992D(r11, r3)
                r2.<init>(r4)
                java.util.Iterator r11 = r11.iterator()
            L1b:
                boolean r4 = r11.hasNext()
                if (r4 == 0) goto Lab
                java.lang.Object r4 = r11.next()
                md.a0 r4 = (md.C4537a0) r4
                java.util.Iterator r5 = r12.iterator()
            L2b:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L47
                java.lang.Object r6 = r5.next()
                r7 = r6
                md.r r7 = (md.C4575r) r7
                java.lang.String r7 = r7.getPool()
                java.lang.String r8 = r4.getPool()
                boolean r7 = p214m2.C4339q.m9702c(r7, r8)
                if (r7 == 0) goto L2b
                goto L48
            L47:
                r6 = 0
            L48:
                md.r r6 = (md.C4575r) r6
                if (r6 != 0) goto L4e
                r4 = r0
                goto La2
            L4e:
                java.util.List r5 = r4.getRarities()
                java.util.ArrayList r7 = new java.util.ArrayList
                int r8 = p062dh.C1469e.m3992D(r5, r3)
                r7.<init>(r8)
                java.util.Iterator r5 = r5.iterator()
            L5f:
                boolean r8 = r5.hasNext()
                if (r8 == 0) goto L87
                java.lang.Object r8 = r5.next()
                md.b0 r8 = (md.C4540b0) r8
                int r9 = r8.getValue()
                if (r9 != 0) goto L73
                r8 = r0
                goto L7f
            L73:
                java.lang.String r9 = r8.getKey()
                int r8 = r8.getValue()
                double r8 = r6.hourlyClaim(r9, r8)
            L7f:
                java.lang.Double r8 = java.lang.Double.valueOf(r8)
                r7.add(r8)
                goto L5f
            L87:
                java.util.Iterator r5 = r7.iterator()
                r6 = r0
            L8c:
                boolean r8 = r5.hasNext()
                if (r8 == 0) goto L9e
                java.lang.Object r8 = r5.next()
                java.lang.Number r8 = (java.lang.Number) r8
                double r8 = r8.doubleValue()
                double r6 = r6 + r8
                goto L8c
            L9e:
                double r4 = r4.valueToClaim(r6)
            La2:
                java.lang.Double r4 = java.lang.Double.valueOf(r4)
                r2.add(r4)
                goto L1b
            Lab:
                java.util.Iterator r11 = r2.iterator()
            Laf:
                boolean r12 = r11.hasNext()
                if (r12 == 0) goto Lc1
                java.lang.Object r12 = r11.next()
                java.lang.Number r12 = (java.lang.Number) r12
                double r2 = r12.doubleValue()
                double r0 = r0 + r2
                goto Laf
            Lc1:
                java.lang.Double r11 = java.lang.Double.valueOf(r0)
                return r11
        }
    }

    public C5645m(android.app.Application r2, p238nd.C4728b0 r3) {
            r1 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.f21938c = r3
            qf.m$a r3 = new qf.m$a
            r3.<init>(r2)
            ch.d r2 = p185k7.C4038x4.m9096i(r3)
            r1.f21939d = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f21940e = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f21941f = r2
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r1.f21942g = r3
            qf.m$b r0 = p294qf.C5645m.b.f21948Z
            androidx.lifecycle.LiveData r2 = p185k7.C4038x4.m9090c(r2, r3, r0)
            r1.f21943h = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.<init>(r3)
            r1.f21944i = r2
            r1.f21945j = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f21946k = r2
            return
    }

    /* renamed from: d */
    public final void m11931d() {
            r5 = this;
            nd.b0 r0 = r5.f21938c
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
            java.lang.String r3 = "&collection_name=godsnlegends&schema_name=godslegends1%2Cgodslegendsx&page=1&limit=1000"
            java.lang.String r0 = p346u.C6269n.m12888a(r2, r0, r3)
            qf.e r2 = new qf.e
            r3 = 0
            r2.<init>(r5, r3)
            qf.c r4 = p294qf.C5635c.f21919b
            r1.<init>(r3, r0, r2, r4)
            g2.o r0 = r5.m11932e()
            r0.m5814a(r1)
            return
    }

    /* renamed from: e */
    public final p105g2.C2221o m11932e() {
            r1 = this;
            ch.d r0 = r1.f21939d
            java.lang.Object r0 = r0.getValue()
            g2.o r0 = (p105g2.C2221o) r0
            return r0
    }

    /* renamed from: f */
    public final void m11933f() {
            r6 = this;
            nd.v0 r0 = p238nd.C4781v0.f19121e
            java.lang.String r1 = "Please for EndpointManager us initialize() before getting the instance."
            java.lang.String r0 = p377vd.C6638g.m13493a(r0, r1, r0)
            qf.e r2 = new qf.e
            r3 = 2
            r2.<init>(r6, r3)
            qf.d r3 = p294qf.C5636d.f21925b
            qf.k r4 = new qf.k
            java.lang.String r5 = "{\n    \"code\": \"godsxlegends\",\n    \"json\": true,\n    \"limit\": 250,\n    \"lower_bound\": \"\",\n    \"reverse\": false,\n    \"scope\": \"godsxlegends\",\n    \"show_payer\": false,\n    \"table\": \"staking\",\n    \"table_key\": \"\",\n    \"upper_bound\": \"\"\n}"
            r4.<init>(r5, r0, r2, r3)
            g2.o r0 = r6.m11932e()
            r0.m5814a(r4)
            nd.b0 r0 = r6.f21938c
            id.b r0 = r0.m10795h()
            if (r0 != 0) goto L27
            goto L59
        L27:
            java.lang.String r2 = "\n            {\n                \"code\": \"godsxlegends\",\n                \"json\": true,\n                \"limit\": 250,\n                \"lower_bound\": \""
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.String r3 = r0.f12559a
            r2.append(r3)
            java.lang.String r3 = "\",\n                \"reverse\": false,\n                \"scope\": \"godsxlegends\",\n                \"show_payer\": false,\n                \"table\": \"user\",\n                \"table_key\": \"\",\n                \"upper_bound\": \""
            r2.append(r3)
            java.lang.String r0 = r0.f12559a
            java.lang.String r3 = "\"\n            }"
            java.lang.String r0 = p377vd.C6637f.m13492a(r2, r0, r3)
            nd.v0 r2 = p238nd.C4781v0.f19121e
            java.lang.String r1 = p377vd.C6638g.m13493a(r2, r1, r2)
            qf.e r2 = new qf.e
            r3 = 1
            r2.<init>(r6, r3)
            nd.r r3 = p238nd.C4772r.f19096d
            qf.i r4 = new qf.i
            r4.<init>(r0, r1, r2, r3)
            g2.o r0 = r6.m11932e()
            r0.m5814a(r4)
        L59:
            r6.m11931d()
            return
    }
}
