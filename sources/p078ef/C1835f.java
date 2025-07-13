package p078ef;

/* renamed from: ef.f */
/* loaded from: classes.dex */
public final class C1835f extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4728b0 f7990c;

    /* renamed from: d */
    public final ch.InterfaceC0977d f7991d;

    /* renamed from: e */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f7992e;

    /* renamed from: f */
    public final androidx.lifecycle.C0437d0<java.util.List<p255od.C5217n>> f7993f;

    /* renamed from: g */
    public final androidx.lifecycle.LiveData<p078ef.C1836g> f7994g;

    /* renamed from: h */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f7995h;

    /* renamed from: i */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f7996i;

    /* renamed from: ef.f$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f7997Z;

        public a(android.app.Application r1) {
                r0 = this;
                r0.f7997Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f7997Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    public C1835f(android.app.Application r2, p238nd.C4728b0 r3) {
            r1 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.f7990c = r3
            ef.f$a r3 = new ef.f$a
            r3.<init>(r2)
            ch.d r2 = p185k7.C4038x4.m9096i(r3)
            r1.f7991d = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f7992e = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f7993f = r2
            k1.d r3 = p179k1.C3646d.f16130s0
            androidx.lifecycle.LiveData r2 = androidx.lifecycle.C0455m0.m1450a(r2, r3)
            r1.f7994g = r2
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r1.f7995h = r3
            k1.c r3 = p179k1.C3644c.f16100v0
            androidx.lifecycle.LiveData r2 = androidx.lifecycle.C0455m0.m1450a(r2, r3)
            r1.f7996i = r2
            return
    }

    /* renamed from: d */
    public final void m4591d() {
            r4 = this;
            nd.b0 r0 = r4.f7990c
            id.b r0 = r0.m10795h()
            if (r0 != 0) goto L9
            goto L4d
        L9:
            androidx.lifecycle.d0<java.lang.Boolean> r1 = r4.f7992e
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.mo7l(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            nd.v0 r2 = p238nd.C4781v0.f19121e
            java.lang.String r3 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r2, r3)
            p214m2.C4339q.m9704i(r2)
            java.lang.String r2 = r2.m10837a()
            r1.append(r2)
            java.lang.String r2 = "/v1/assets?page=1&limit=1000&owner="
            r1.append(r2)
            java.lang.String r0 = r0.f12559a
            java.lang.String r2 = "&collection_name=clashdomenft&schema_name=lands"
            java.lang.String r0 = p346u.C6269n.m12888a(r1, r0, r2)
            nd.s r1 = new nd.s
            r1.<init>(r4)
            wd.g r2 = new wd.g
            r2.<init>(r4)
            ef.d r3 = new ef.d
            r3.<init>(r0, r1, r2)
            ch.d r0 = r4.f7991d
            java.lang.Object r0 = r0.getValue()
            g2.o r0 = (p105g2.C2221o) r0
            r0.m5814a(r3)
        L4d:
            return
    }
}
