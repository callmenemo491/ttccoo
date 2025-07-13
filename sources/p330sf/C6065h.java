package p330sf;

/* renamed from: sf.h */
/* loaded from: classes.dex */
public final class C6065h extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final ch.InterfaceC0977d f23407c;

    /* renamed from: d */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f23408d;

    /* renamed from: e */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f23409e;

    /* renamed from: f */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f23410f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<io.tacocrypto.app.p156ui.tools.nftwallet.model.CollectionDataUi> f23411g;

    /* renamed from: h */
    public final androidx.lifecycle.LiveData<io.tacocrypto.app.p156ui.tools.nftwallet.model.CollectionDataUi> f23412h;

    /* renamed from: i */
    public final androidx.lifecycle.C0437d0<java.util.List<ch.C0978e<p417xf.C7050d, p417xf.C7062p>>> f23413i;

    /* renamed from: j */
    public final androidx.lifecycle.LiveData<java.util.List<ch.C0978e<p417xf.C7050d, p417xf.C7062p>>> f23414j;

    /* renamed from: k */
    public java.lang.String f23415k;

    /* renamed from: sf.h$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f23416Z;

        public a(android.app.Application r1) {
                r0 = this;
                r0.f23416Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f23416Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    public C6065h(android.app.Application r2, p238nd.C4728b0 r3) {
            r1 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            sf.h$a r3 = new sf.h$a
            r3.<init>(r2)
            ch.d r2 = p185k7.C4038x4.m9096i(r3)
            r1.f23407c = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f23408d = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f23409e = r2
            r1.f23410f = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f23411g = r2
            r1.f23412h = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f23413i = r2
            r1.f23414j = r2
            return
    }

    /* renamed from: d */
    public static final java.lang.Object m12523d(p330sf.C6065h r9, java.lang.String r10, java.util.List r11, p101fh.InterfaceC2172d r12) {
            fh.j r0 = new fh.j
            fh.d r12 = gh.C2390b.m6127q(r12)
            r0.<init>(r12)
            java.lang.String r2 = ","
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 62
            r1 = r11
            java.lang.String r11 = p062dh.C1473i.m4000L(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            nd.v0 r1 = p238nd.C4781v0.f19121e
            java.lang.String r2 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r1, r2)
            java.lang.String r1 = r1.m10837a()
            r12.append(r1)
            java.lang.String r1 = "/v1/templates?collection_name="
            r12.append(r1)
            r12.append(r10)
            java.lang.String r10 = "&ids="
            r12.append(r10)
            r12.append(r11)
            java.lang.String r10 = "&limit=1000"
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            sf.f r11 = new sf.f
            r11.<init>(r0)
            sf.g r12 = new sf.g
            r12.<init>(r0)
            sf.d r1 = new sf.d
            r1.<init>(r10, r11, r12)
            ch.d r9 = r9.f23407c
            java.lang.Object r9 = r9.getValue()
            g2.o r9 = (p105g2.C2221o) r9
            r9.m5814a(r1)
            java.lang.Object r9 = r0.m5741a()
            return r9
    }

    /* renamed from: e */
    public final void m12524e() {
            r9 = this;
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r9.f23409e
            java.lang.Object r0 = r0.m1411d()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto Lf
            goto L58
        Lf:
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r9.f23409e
            r0.mo7l(r1)
            androidx.lifecycle.d0<java.util.List<ch.e<xf.d, xf.p>>> r0 = r9.f23413i
            java.lang.Object r0 = r0.m1411d()
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L20
            dh.k r0 = p062dh.C1475k.f7237Y
        L20:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = p062dh.C1469e.m3992D(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r0.next()
            ch.e r2 = (ch.C0978e) r2
            A r2 = r2.f5050Y
            xf.d r2 = (p417xf.C7050d) r2
            java.lang.String r2 = r2.getTemplate_id()
            r1.add(r2)
            goto L2f
        L47:
            vh.b0 r3 = p064e.C1488b.m4037d(r9)
            r4 = 0
            sf.c r6 = new sf.c
            r0 = 0
            r6.<init>(r9, r1, r0)
            r7 = 3
            r8 = 0
            r5 = 0
            p101fh.C2174f.m5714d(r3, r4, r5, r6, r7, r8)
        L58:
            return
    }
}
