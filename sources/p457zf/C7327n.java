package p457zf;

/* renamed from: zf.n */
/* loaded from: classes.dex */
public final class C7327n extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4728b0 f28045c;

    /* renamed from: d */
    public final io.tacocrypto.app.database.AppDatabase f28046d;

    /* renamed from: e */
    public final ch.InterfaceC0977d f28047e;

    /* renamed from: f */
    public final androidx.lifecycle.C0437d0<vg.C6661b<java.lang.String>> f28048f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f28049g;

    /* renamed from: h */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f28050h;

    /* renamed from: i */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f28051i;

    /* renamed from: j */
    public final java.lang.String f28052j;

    /* renamed from: k */
    public final androidx.lifecycle.C0437d0<vg.C6661b<ch.C0985l>> f28053k;

    /* renamed from: l */
    public java.util.List<p417xf.C7057k> f28054l;

    /* renamed from: m */
    public final androidx.lifecycle.C0437d0<vg.C6661b<java.util.List<p417xf.C7057k>>> f28055m;

    /* renamed from: n */
    public final androidx.lifecycle.LiveData<vg.C6661b<java.util.List<p417xf.C7057k>>> f28056n;

    /* renamed from: o */
    public final androidx.lifecycle.C0437d0<p417xf.C7057k> f28057o;

    /* renamed from: p */
    public final androidx.lifecycle.C0437d0<java.lang.String> f28058p;

    /* renamed from: q */
    public final androidx.lifecycle.C0437d0<java.lang.String> f28059q;

    /* renamed from: r */
    public java.lang.String f28060r;

    /* renamed from: s */
    public boolean f28061s;

    /* renamed from: zf.n$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f28062Z;

        public a(android.app.Application r1) {
                r0 = this;
                r0.f28062Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f28062Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    public C7327n(android.app.Application r2, p238nd.C4728b0 r3, io.tacocrypto.app.database.AppDatabase r4) {
            r1 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "appDatabase"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.f28045c = r3
            r1.f28046d = r4
            zf.n$a r4 = new zf.n$a
            r4.<init>(r2)
            ch.d r2 = p185k7.C4038x4.m9096i(r4)
            r1.f28047e = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f28048f = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f28049g = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f28050h = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f28051i = r2
            id.b r2 = r3.m10795h()
            if (r2 == 0) goto L47
            java.lang.String r2 = r2.f12559a
            if (r2 != 0) goto L49
        L47:
            java.lang.String r2 = ""
        L49:
            r1.f28052j = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f28053k = r2
            dh.k r2 = p062dh.C1475k.f7237Y
            r1.f28054l = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f28055m = r2
            r1.f28056n = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f28057o = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f28058p = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f28059q = r2
            r2 = 1
            r1.f28061s = r2
            return
    }

    /* renamed from: d */
    public static final java.lang.Object m14399d(p457zf.C7327n r3, java.lang.String r4, java.lang.String r5, p101fh.InterfaceC2172d r6) {
            fh.j r0 = new fh.j
            fh.d r6 = gh.C2390b.m6127q(r6)
            r0.<init>(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            nd.v0 r1 = p238nd.C4781v0.f19121e
            java.lang.String r2 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r1, r2)
            java.lang.String r1 = r1.m10837a()
            r6.append(r1)
            java.lang.String r1 = "/v1/assets?template_id="
            r6.append(r1)
            r6.append(r4)
            java.lang.String r4 = "&owner="
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = "&limit=1000"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            zf.l r5 = new zf.l
            r5.<init>(r0)
            zf.m r6 = new zf.m
            r6.<init>(r0)
            zf.j r1 = new zf.j
            r1.<init>(r4, r5, r6)
            ch.d r3 = r3.f28047e
            java.lang.Object r3 = r3.getValue()
            g2.o r3 = (p105g2.C2221o) r3
            r3.m5814a(r1)
            java.lang.Object r3 = r0.m5741a()
            return r3
    }

    /* renamed from: e */
    public final void m14400e() {
            r8 = this;
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r8.f28051i
            java.lang.Object r0 = r0.m1411d()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto Lf
            goto L25
        Lf:
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r8.f28051i
            r0.mo7l(r1)
            vh.b0 r2 = p064e.C1488b.m4037d(r8)
            r3 = 0
            zf.i r5 = new zf.i
            r0 = 0
            r5.<init>(r8, r0)
            r6 = 3
            r7 = 0
            r4 = 0
            p101fh.C2174f.m5714d(r2, r3, r4, r5, r6, r7)
        L25:
            return
    }

    /* renamed from: f */
    public final void m14401f(java.lang.String r4) {
            r3 = this;
            androidx.lifecycle.d0<java.lang.String> r0 = r3.f28058p
            r0.mo7l(r4)
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r4.<init>(r0)
            zf.h r0 = new zf.h
            r1 = 0
            r0.<init>(r3, r1)
            r1 = 200(0xc8, double:9.9E-322)
            r4.postDelayed(r0, r1)
            return
    }
}
