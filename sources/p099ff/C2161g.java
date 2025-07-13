package p099ff;

/* renamed from: ff.g */
/* loaded from: classes.dex */
public final class C2161g extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4728b0 f9903c;

    /* renamed from: d */
    public final ch.InterfaceC0977d f9904d;

    /* renamed from: e */
    public final androidx.lifecycle.C0437d0<java.lang.Double> f9905e;

    /* renamed from: f */
    public final androidx.lifecycle.LiveData<java.lang.Double> f9906f;

    /* renamed from: g */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f9907g;

    /* renamed from: h */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f9908h;

    /* renamed from: ff.g$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f9909Z;

        public a(android.app.Application r1) {
                r0 = this;
                r0.f9909Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f9909Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    public C2161g(android.app.Application r3, p238nd.C4728b0 r4) {
            r2 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r4, r0)
            r2.<init>()
            r2.f9903c = r4
            ff.g$a r4 = new ff.g$a
            r4.<init>(r3)
            ch.d r3 = p185k7.C4038x4.m9096i(r4)
            r2.f9904d = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r0 = 0
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            r3.<init>(r4)
            r2.f9905e = r3
            r2.f9906f = r3
            k1.d r4 = p179k1.C3646d.f16131t0
            androidx.lifecycle.LiveData r3 = androidx.lifecycle.C0455m0.m1450a(r3, r4)
            r2.f9907g = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r2.f9908h = r3
            return
    }

    /* renamed from: d */
    public final void m5704d() {
            r5 = this;
            nd.b0 r0 = r5.f9903c
            id.b r0 = r0.m10795h()
            if (r0 != 0) goto L9
            goto L40
        L9:
            java.lang.String r1 = "\n            {\n                \"code\": \"stk.pirates\",\n                \"json\": true,\n                \"limit\": 1,\n                \"lower_bound\": \""
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = r0.f12559a
            r1.append(r2)
            java.lang.String r2 = "\",\n                \"scope\": \"stk.pirates\",\n                \"table\": \"users\",\n                \"upper_bound\": \""
            r1.append(r2)
            java.lang.String r0 = r0.f12559a
            java.lang.String r2 = "\"\n            }"
            java.lang.String r0 = p377vd.C6637f.m13492a(r1, r0, r2)
            nd.v0 r1 = p238nd.C4781v0.f19121e
            java.lang.String r2 = "Please for EndpointManager us initialize() before getting the instance."
            java.lang.String r1 = p377vd.C6638g.m13493a(r1, r2, r1)
            nd.s r2 = new nd.s
            r2.<init>(r5)
            ff.c r3 = p099ff.C2157c.f9897b
            ff.f r4 = new ff.f
            r4.<init>(r0, r1, r2, r3)
            ch.d r0 = r5.f9904d
            java.lang.Object r0 = r0.getValue()
            g2.o r0 = (p105g2.C2221o) r0
            r0.m5814a(r4)
        L40:
            return
    }
}
