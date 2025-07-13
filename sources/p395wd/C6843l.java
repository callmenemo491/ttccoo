package p395wd;

/* renamed from: wd.l */
/* loaded from: classes.dex */
public final class C6843l extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4728b0 f26596c;

    /* renamed from: d */
    public final ch.InterfaceC0977d f26597d;

    /* renamed from: e */
    public final androidx.lifecycle.C0437d0<java.util.List<p255od.C5235w>> f26598e;

    /* renamed from: f */
    public final androidx.lifecycle.LiveData<java.util.List<p255od.C5235w>> f26599f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f26600g;

    /* renamed from: wd.l$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f26601Z;

        public a(android.app.Application r1) {
                r0 = this;
                r0.f26601Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f26601Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    public C6843l(android.app.Application r2, p238nd.C4728b0 r3) {
            r1 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.f26596c = r3
            wd.l$a r3 = new wd.l$a
            r3.<init>(r2)
            ch.d r2 = p185k7.C4038x4.m9096i(r3)
            r1.f26597d = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f26598e = r2
            r1.f26599f = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f26600g = r2
            return
    }

    /* renamed from: d */
    public final void m13916d() {
            r4 = this;
            nd.b0 r0 = r4.f26596c
            id.b r0 = r0.m10795h()
            if (r0 == 0) goto L49
            java.lang.String r0 = r0.f12559a
            if (r0 != 0) goto Ld
            goto L49
        Ld:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            nd.v0 r2 = p238nd.C4781v0.f19121e
            java.lang.String r3 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r2, r3)
            p214m2.C4339q.m9704i(r2)
            java.lang.String r2 = r2.m10837a()
            r1.append(r2)
            java.lang.String r2 = "/v1/assets?page=1&limit=1000&order=desc&sort=asset_id&collection_name=taco&burned=false&schema_name=ingredient&owner="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            nd.s r1 = new nd.s
            r1.<init>(r4)
            wd.g r2 = new wd.g
            r2.<init>(r4)
            wd.j r3 = new wd.j
            r3.<init>(r0, r1, r2)
            ch.d r0 = r4.f26597d
            java.lang.Object r0 = r0.getValue()
            g2.o r0 = (p105g2.C2221o) r0
            r0.m5814a(r3)
        L49:
            return
    }
}
