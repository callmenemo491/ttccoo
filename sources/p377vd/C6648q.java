package p377vd;

/* renamed from: vd.q */
/* loaded from: classes.dex */
public final class C6648q extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4728b0 f25837c;

    /* renamed from: d */
    public final ch.InterfaceC0977d f25838d;

    /* renamed from: e */
    public final androidx.lifecycle.LiveData<ch.C0978e<id.C3131b, java.lang.Boolean>> f25839e;

    /* renamed from: f */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f25840f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<p377vd.C6651t> f25841g;

    /* renamed from: h */
    public final androidx.lifecycle.LiveData<p377vd.C6651t> f25842h;

    /* renamed from: i */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f25843i;

    /* renamed from: j */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f25844j;

    /* renamed from: k */
    public md.C4545d f25845k;

    /* renamed from: l */
    public final androidx.lifecycle.C0437d0<md.C4545d> f25846l;

    /* renamed from: m */
    public final androidx.lifecycle.LiveData<md.C4545d> f25847m;

    /* renamed from: n */
    public final androidx.lifecycle.C0437d0<md.C4557i> f25848n;

    /* renamed from: o */
    public final androidx.lifecycle.LiveData<md.C4557i> f25849o;

    /* renamed from: p */
    public ch.C0978e<? extends java.util.List<md.C4553g>, java.lang.Long> f25850p;

    /* renamed from: q */
    public android.os.CountDownTimer f25851q;

    /* renamed from: vd.q$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f25852Z;

        public a(android.app.Application r1) {
                r0 = this;
                r0.f25852Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f25852Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    public C6648q(android.app.Application r2, p238nd.C4728b0 r3) {
            r1 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.f25837c = r3
            vd.q$a r0 = new vd.q$a
            r0.<init>(r2)
            ch.d r2 = p185k7.C4038x4.m9096i(r0)
            r1.f25838d = r2
            androidx.lifecycle.LiveData<ch.e<id.b, java.lang.Boolean>> r2 = r3.f18903B
            r1.f25839e = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f25840f = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f25841g = r2
            r1.f25842h = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f25843i = r2
            r1.f25844j = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f25846l = r2
            r1.f25847m = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f25848n = r2
            r1.f25849o = r2
            return
    }

    /* renamed from: d */
    public static final java.lang.Object m13494d(p377vd.C6648q r3, long r4, p101fh.InterfaceC2172d r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "\n            {\n                \"code\": \"banner.taco\",\n                \"scope\": \"banner.taco\",\n                \"table\": \"banners\",\n                \"json\": true,\n                \"limit\": 2,\n                \"index_position\": 2,\n                \"key_type\": \"i64\",\n                \"lower_bound\": \""
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = "\",\n                \"upper_bound\": \""
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = "\",\n            }"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = p362uh.C6459e.m13046C(r0)
            fh.j r1 = new fh.j
            fh.d r6 = gh.C2390b.m6127q(r6)
            r1.<init>(r6)
            nd.v0 r6 = p238nd.C4781v0.f19121e
            java.lang.String r2 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r6, r2)
            java.lang.String r6 = r6.m10839c()
            vd.m r2 = new vd.m
            r2.<init>(r1, r4)
            vd.n r4 = new vd.n
            r4.<init>(r1)
            vd.k r5 = new vd.k
            r5.<init>(r6, r0, r2, r4)
            g2.o r3 = r3.m13496f()
            r3.m5814a(r5)
            java.lang.Object r3 = r1.m5741a()
            return r3
    }

    /* renamed from: e */
    public final void m13495e() {
            r5 = this;
            ch.e<? extends java.util.List<md.g>, java.lang.Long> r0 = r5.f25850p
            r1 = 0
            if (r0 == 0) goto La
            A r0 = r0.f5050Y
            java.util.List r0 = (java.util.List) r0
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r0 != 0) goto Lf
            dh.k r0 = p062dh.C1475k.f7237Y
        Lf:
            int r2 = r0.size()
            r3 = 1
            if (r2 != r3) goto L24
            java.lang.Object r0 = p062dh.C1473i.m3996H(r0)
            md.g r0 = (md.C4553g) r0
            if (r0 == 0) goto Lac
            md.i r1 = r0.toBannerUI()
            goto Lac
        L24:
            int r2 = r0.size()
            r3 = 2
            if (r2 != r3) goto L47
            java.lang.String r2 = "UTC"
            java.util.TimeZone r2 = java.util.TimeZone.getTimeZone(r2)
            java.util.Calendar r2 = java.util.Calendar.getInstance(r2)
            r4 = 12
            int r2 = r2.get(r4)
            int r2 = r2 % r3
            java.lang.Object r0 = r0.get(r2)
            md.g r0 = (md.C4553g) r0
            md.i r0 = r0.toBannerUI()
            goto L48
        L47:
            r0 = r1
        L48:
            if (r0 != 0) goto Lab
            o9.d r0 = p251o9.C5180d.m11494c()
            java.lang.Class<gb.l> r2 = gb.C2322l.class
            r0.m11497a()
            y9.i r0 = r0.f20315d
            java.lang.Object r0 = r0.mo14246a(r2)
            gb.l r0 = (gb.C2322l) r0
            gb.c r0 = r0.m6081c()
            java.lang.String r2 = "FirebaseRemoteConfig.getInstance()"
            p214m2.C4339q.m9703h(r0, r2)
            java.lang.String r2 = "banners"
            ha.b r0 = p074e9.C1805a.m4525j(r0, r2)
            java.lang.String r0 = r0.m7366a()
            java.lang.String r2 = "remoteConfig[BANNERS_KEY].asString()"
            p214m2.C4339q.m9705j(r0, r2)
            jb.j r2 = new jb.j     // Catch: java.lang.Throwable -> L86
            r2.<init>()     // Catch: java.lang.Throwable -> L86
            vg.q r3 = new vg.q     // Catch: java.lang.Throwable -> L86
            r3.<init>()     // Catch: java.lang.Throwable -> L86
            java.lang.reflect.Type r3 = r3.f21382b     // Catch: java.lang.Throwable -> L86
            java.lang.Object r0 = r2.m7929c(r0, r3)     // Catch: java.lang.Throwable -> L86
            md.h r0 = (md.C4555h) r0     // Catch: java.lang.Throwable -> L86
            goto L8b
        L86:
            r0 = move-exception
            java.lang.Object r0 = p074e9.C1805a.m4520e(r0)
        L8b:
            boolean r2 = r0 instanceof ch.C0979f.a
            if (r2 == 0) goto L90
            r0 = r1
        L90:
            md.h r0 = (md.C4555h) r0
            if (r0 == 0) goto Lac
            md.i r1 = new md.i
            java.lang.String r2 = r0.getBanner_mobile_img()
            java.lang.String r3 = ""
            if (r2 != 0) goto L9f
            r2 = r3
        L9f:
            java.lang.String r0 = r0.getBanner_mobile_link()
            if (r0 != 0) goto La6
            goto La7
        La6:
            r3 = r0
        La7:
            r1.<init>(r2, r3)
            goto Lac
        Lab:
            r1 = r0
        Lac:
            androidx.lifecycle.d0<md.i> r0 = r5.f25848n
            r0.mo1415j(r1)
            return
    }

    /* renamed from: f */
    public final p105g2.C2221o m13496f() {
            r1 = this;
            ch.d r0 = r1.f25838d
            java.lang.Object r0 = r0.getValue()
            g2.o r0 = (p105g2.C2221o) r0
            return r0
    }

    /* renamed from: g */
    public final void m13497g() {
            r10 = this;
            android.os.CountDownTimer r0 = r10.f25851q
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            nd.b0 r0 = r10.f25837c
            id.b r0 = r0.m10795h()
            if (r0 != 0) goto L22
            androidx.lifecycle.d0<vd.t> r0 = r10.f25841g
            vd.t r7 = new vd.t
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 12
            java.lang.String r3 = "Choose an account"
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r0.mo7l(r7)
            goto L6d
        L22:
            java.lang.String r0 = r0.f12559a
            androidx.lifecycle.d0<vd.t> r1 = r10.f25841g
            vd.t r8 = new vd.t
            r9 = 0
            r5 = 0
            r6 = 0
            r7 = 12
            java.lang.String r4 = "Loading..."
            r2 = r8
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r1.mo7l(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "\n            {\n                \"code\": \"p.taco\",\n                \"json\": true,\n                \"limit\": 1,\n                \"lower_bound\": \""
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = "\",\n                \"scope\": \"p.taco\",\n                \"table\": \"claimer\",\n                \"upper_bound\": \""
            r1.append(r2)
            java.lang.String r2 = "\"\n            }"
            java.lang.String r0 = p377vd.C6637f.m13492a(r1, r0, r2)
            nd.v0 r1 = p238nd.C4781v0.f19121e
            java.lang.String r2 = "Please for EndpointManager us initialize() before getting the instance."
            java.lang.String r1 = p377vd.C6638g.m13493a(r1, r2, r1)
            vd.e r2 = new vd.e
            r2.<init>(r10, r9)
            vd.d r3 = new vd.d
            r3.<init>(r10, r9)
            vd.o r4 = new vd.o
            r4.<init>(r0, r1, r2, r3)
            g2.o r0 = r10.m13496f()
            r0.m5814a(r4)
        L6d:
            return
    }
}
