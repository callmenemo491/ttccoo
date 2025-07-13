package p314rf;

/* renamed from: rf.l */
/* loaded from: classes.dex */
public final class C5844l extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4728b0 f22605c;

    /* renamed from: d */
    public final ch.InterfaceC0977d f22606d;

    /* renamed from: e */
    public final androidx.lifecycle.C0437d0<java.lang.Double> f22607e;

    /* renamed from: f */
    public final androidx.lifecycle.C0437d0<java.lang.Double> f22608f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<java.lang.Double> f22609g;

    /* renamed from: h */
    public final androidx.lifecycle.LiveData<java.lang.Double> f22610h;

    /* renamed from: i */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f22611i;

    /* renamed from: j */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f22612j;

    /* renamed from: rf.l$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f22613Z;

        public a(android.app.Application r1) {
                r0 = this;
                r0.f22613Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f22613Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    /* renamed from: rf.l$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4625q<java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double> {

        /* renamed from: Z */
        public static final p314rf.C5844l.b f22614Z = null;

        static {
                rf.l$b r0 = new rf.l$b
                r0.<init>()
                p314rf.C5844l.b.f22614Z = r0
                return
        }

        public b() {
                r1 = this;
                r0 = 3
                r1.<init>(r0)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public java.lang.Double mo115i(java.lang.Double r5, java.lang.Double r6, java.lang.Double r7) {
                r4 = this;
                java.lang.Double r5 = (java.lang.Double) r5
                java.lang.Double r6 = (java.lang.Double) r6
                java.lang.Double r7 = (java.lang.Double) r7
                r0 = 0
                if (r5 == 0) goto Lf
                double r2 = r5.doubleValue()
                goto L10
            Lf:
                r2 = r0
            L10:
                if (r6 == 0) goto L17
                double r5 = r6.doubleValue()
                goto L18
            L17:
                r5 = r0
            L18:
                double r2 = r2 + r5
                if (r7 == 0) goto L1f
                double r0 = r7.doubleValue()
            L1f:
                double r2 = r2 + r0
                java.lang.Double r5 = java.lang.Double.valueOf(r2)
                return r5
        }
    }

    public C5844l(android.app.Application r3, p238nd.C4728b0 r4) {
            r2 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r4, r0)
            r2.<init>()
            r2.f22605c = r4
            rf.l$a r4 = new rf.l$a
            r4.<init>(r3)
            ch.d r3 = p185k7.C4038x4.m9096i(r4)
            r2.f22606d = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r0 = 0
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            r3.<init>(r4)
            r2.f22607e = r3
            androidx.lifecycle.d0 r0 = new androidx.lifecycle.d0
            r0.<init>(r4)
            r2.f22608f = r0
            androidx.lifecycle.d0 r1 = new androidx.lifecycle.d0
            r1.<init>(r4)
            r2.f22609g = r1
            rf.l$b r4 = p314rf.C5844l.b.f22614Z
            androidx.lifecycle.LiveData r3 = p185k7.C4038x4.m9088a(r3, r0, r1, r4)
            r2.f22610h = r3
            k1.c r4 = p179k1.C3644c.f16101w0
            androidx.lifecycle.LiveData r3 = androidx.lifecycle.C0455m0.m1450a(r3, r4)
            r2.f22611i = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r2.f22612j = r3
            return
    }

    /* renamed from: d */
    public final p105g2.C2221o m12198d() {
            r1 = this;
            ch.d r0 = r1.f22606d
            java.lang.Object r0 = r0.getValue()
            g2.o r0 = (p105g2.C2221o) r0
            return r0
    }

    /* renamed from: e */
    public final void m12199e() {
            r7 = this;
            nd.b0 r0 = r7.f22605c
            id.b r0 = r0.m10795h()
            java.lang.String r1 = "Please for EndpointManager us initialize() before getting the instance."
            java.lang.String r2 = "\"\n            }"
            if (r0 != 0) goto Ld
            goto L3d
        Ld:
            java.lang.String r3 = "\n            {\n                \"code\": \"staking.gr\",\n                \"json\": true,\n                \"limit\": 1,\n                \"lower_bound\": \""
            java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
            java.lang.String r4 = r0.f12559a
            r3.append(r4)
            java.lang.String r4 = "\",\n                \"scope\": \"staking.gr\",\n                \"table\": \"accounts\",\n                \"upper_bound\": \""
            r3.append(r4)
            java.lang.String r0 = r0.f12559a
            java.lang.String r0 = p377vd.C6637f.m13492a(r3, r0, r2)
            nd.v0 r3 = p238nd.C4781v0.f19121e
            java.lang.String r3 = p377vd.C6638g.m13493a(r3, r1, r3)
            rf.d r4 = new rf.d
            r5 = 0
            r4.<init>(r7, r5)
            qf.c r5 = p294qf.C5635c.f21920c
            rf.j r6 = new rf.j
            r6.<init>(r0, r3, r4, r5)
            g2.o r0 = r7.m12198d()
            r0.m5814a(r6)
        L3d:
            nd.b0 r0 = r7.f22605c
            id.b r0 = r0.m10795h()
            if (r0 != 0) goto L46
            goto L76
        L46:
            java.lang.String r3 = "\n            {\n                \"code\": \"driveless.gr\",\n                \"json\": true,\n                \"limit\": 1,\n                \"lower_bound\": \""
            java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
            java.lang.String r4 = r0.f12559a
            r3.append(r4)
            java.lang.String r4 = "\",\n                \"scope\": \"greenrabbit\",\n                \"table\": \"accounts\",\n                \"upper_bound\": \""
            r3.append(r4)
            java.lang.String r0 = r0.f12559a
            java.lang.String r0 = p377vd.C6637f.m13492a(r3, r0, r2)
            nd.v0 r3 = p238nd.C4781v0.f19121e
            java.lang.String r3 = p377vd.C6638g.m13493a(r3, r1, r3)
            rf.d r4 = new rf.d
            r5 = 1
            r4.<init>(r7, r5)
            nd.r r5 = p238nd.C4772r.f19097e
            rf.h r6 = new rf.h
            r6.<init>(r0, r3, r4, r5)
            g2.o r0 = r7.m12198d()
            r0.m5814a(r6)
        L76:
            nd.b0 r0 = r7.f22605c
            id.b r0 = r0.m10795h()
            if (r0 != 0) goto L7f
            goto Laf
        L7f:
            java.lang.String r3 = "\n            {\n                \"code\": \"driveless.gr\",\n            \"json\": true,\n            \"limit\": 1,\n            \"lower_bound\": \""
            java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
            java.lang.String r4 = r0.f12559a
            r3.append(r4)
            java.lang.String r4 = "\",\n            \"scope\": \"nvenomsnftzs\",\n            \"table\": \"accounts\",\n            \"upper_bound\": \""
            r3.append(r4)
            java.lang.String r0 = r0.f12559a
            java.lang.String r0 = p377vd.C6637f.m13492a(r3, r0, r2)
            nd.v0 r2 = p238nd.C4781v0.f19121e
            java.lang.String r1 = p377vd.C6638g.m13493a(r2, r1, r2)
            rf.d r2 = new rf.d
            r3 = 2
            r2.<init>(r7, r3)
            qf.d r3 = p294qf.C5636d.f21926c
            rf.f r4 = new rf.f
            r4.<init>(r0, r1, r2, r3)
            g2.o r0 = r7.m12198d()
            r0.m5814a(r4)
        Laf:
            return
    }
}
