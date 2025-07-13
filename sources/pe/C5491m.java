package pe;

/* renamed from: pe.m */
/* loaded from: classes.dex */
public final class C5491m extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4728b0 f21423c;

    /* renamed from: d */
    public final ch.InterfaceC0977d f21424d;

    /* renamed from: e */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f21425e;

    /* renamed from: f */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f21426f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<java.util.List<p293qe.C5632e>> f21427g;

    /* renamed from: h */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f21428h;

    /* renamed from: i */
    public final androidx.lifecycle.LiveData<java.lang.String> f21429i;

    /* renamed from: j */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f21430j;

    /* renamed from: pe.m$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f21431Z;

        public a(android.app.Application r1) {
                r0 = this;
                r0.f21431Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f21431Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    public C5491m(android.app.Application r2, p238nd.C4728b0 r3) {
            r1 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.f21423c = r3
            pe.m$a r3 = new pe.m$a
            r3.<init>(r2)
            ch.d r2 = p185k7.C4038x4.m9096i(r3)
            r1.f21424d = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f21425e = r2
            r1.f21426f = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            dh.k r3 = p062dh.C1475k.f7237Y
            r2.<init>(r3)
            r1.f21427g = r2
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r1.f21428h = r3
            k1.b r3 = p179k1.C3642b.f16071t0
            androidx.lifecycle.LiveData r3 = androidx.lifecycle.C0455m0.m1450a(r2, r3)
            r1.f21429i = r3
            androidx.room.a r3 = androidx.room.C0618a.f3670t0
            androidx.lifecycle.LiveData r2 = androidx.lifecycle.C0455m0.m1450a(r2, r3)
            r1.f21430j = r2
            return
    }

    /* renamed from: d */
    public final void m11771d() {
            r5 = this;
            nd.b0 r0 = r5.f21423c
            id.b r0 = r0.m10795h()
            if (r0 == 0) goto L4f
            java.lang.String r0 = r0.f12559a
            if (r0 != 0) goto Ld
            goto L4f
        Ld:
            androidx.lifecycle.d0<java.lang.Boolean> r1 = r5.f21425e
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.mo7l(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "\n            {\n                \"code\": \"m.federation\",\n                \"index_position\": 1,\n                \"json\": true,\n                \"key_type\": \"\",\n                \"limit\": 250,\n                \"lower_bound\": \""
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = "\",\n                \"reverse\": false,\n                \"scope\": \"m.federation\",\n                \"show_payer\": false,\n                \"table\": \"claims\",\n                \"table_key\": \"\",\n                \"upper_bound\": \""
            r1.append(r2)
            java.lang.String r2 = "\"\n            }"
            java.lang.String r0 = p377vd.C6637f.m13492a(r1, r0, r2)
            nd.v0 r1 = p238nd.C4781v0.f19121e
            java.lang.String r2 = "Please for EndpointManager us initialize() before getting the instance."
            java.lang.String r1 = p377vd.C6638g.m13493a(r1, r2, r1)
            nd.s r2 = new nd.s
            r2.<init>(r5)
            pe.g r3 = new pe.g
            r4 = 0
            r3.<init>(r5, r4)
            pe.k r4 = new pe.k
            r4.<init>(r0, r1, r2, r3)
            ch.d r0 = r5.f21424d
            java.lang.Object r0 = r0.getValue()
            g2.o r0 = (p105g2.C2221o) r0
            r0.m5814a(r4)
        L4f:
            return
    }
}
