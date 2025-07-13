package p060df;

/* renamed from: df.g */
/* loaded from: classes.dex */
public final class C1451g extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4728b0 f7185c;

    /* renamed from: d */
    public final ch.InterfaceC0977d f7186d;

    /* renamed from: e */
    public final androidx.lifecycle.C0437d0<p060df.C1445a> f7187e;

    /* renamed from: f */
    public final androidx.lifecycle.LiveData<p060df.C1445a> f7188f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f7189g;

    /* renamed from: h */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f7190h;

    /* renamed from: df.g$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f7191Z;

        public a(android.app.Application r1) {
                r0 = this;
                r0.f7191Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f7191Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    public C1451g(android.app.Application r12, p238nd.C4728b0 r13) {
            r11 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r12, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r13, r0)
            r11.<init>()
            r11.f7185c = r13
            df.g$a r13 = new df.g$a
            r13.<init>(r12)
            ch.d r12 = p185k7.C4038x4.m9096i(r13)
            r11.f7186d = r12
            androidx.lifecycle.d0 r12 = new androidx.lifecycle.d0
            r12.<init>()
            androidx.lifecycle.d0 r12 = new androidx.lifecycle.d0
            df.a r13 = new df.a
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 63
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r6, r8, r10)
            r12.<init>(r13)
            r11.f7187e = r12
            r11.f7188f = r12
            androidx.lifecycle.d0 r13 = new androidx.lifecycle.d0
            r13.<init>()
            r11.f7189g = r13
            k1.b r13 = p179k1.C3642b.f16072u0
            androidx.lifecycle.LiveData r12 = androidx.lifecycle.C0455m0.m1450a(r12, r13)
            r11.f7190h = r12
            return
    }

    /* renamed from: d */
    public final void m3976d() {
            r5 = this;
            nd.b0 r0 = r5.f7185c
            id.b r0 = r0.m10795h()
            if (r0 != 0) goto L9
            goto L36
        L9:
            java.lang.String r1 = "\n            {\n                \"code\": \"yard.century\",\n                \"index_position\": 1,\n                \"json\": true,\n                \"key_type\": \"\",\n                \"limit\": 10000,\n                \"lower_bound\": \"\",\n                \"reverse\": false,\n                \"scope\": \""
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r0 = r0.f12559a
            java.lang.String r2 = "\",\n                \"show_payer\": false,\n                \"table\": \"assets\",\n                \"upper_bound\": \"\"\n            }"
            java.lang.String r0 = p377vd.C6637f.m13492a(r1, r0, r2)
            nd.v0 r1 = p238nd.C4781v0.f19121e
            java.lang.String r2 = "Please for EndpointManager us initialize() before getting the instance."
            java.lang.String r1 = p377vd.C6638g.m13493a(r1, r2, r1)
            nd.s r2 = new nd.s
            r2.<init>(r5)
            nd.r r3 = p238nd.C4772r.f19095c
            df.e r4 = new df.e
            r4.<init>(r0, r1, r2, r3)
            ch.d r0 = r5.f7186d
            java.lang.Object r0 = r0.getValue()
            g2.o r0 = (p105g2.C2221o) r0
            r0.m5814a(r4)
        L36:
            return
    }
}
