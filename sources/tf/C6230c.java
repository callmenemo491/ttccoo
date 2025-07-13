package tf;

/* renamed from: tf.c */
/* loaded from: classes.dex */
public final class C6230c extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final ch.InterfaceC0977d f24178c;

    /* renamed from: d */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f24179d;

    /* renamed from: e */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f24180e;

    /* renamed from: f */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f24181f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<java.util.List<tf.C6230c.a>> f24182g;

    /* renamed from: h */
    public final androidx.lifecycle.LiveData<java.util.List<tf.C6230c.a>> f24183h;

    /* renamed from: i */
    public final java.lang.String f24184i;

    /* renamed from: j */
    public final androidx.lifecycle.LiveData<java.lang.String> f24185j;

    /* renamed from: k */
    public final androidx.lifecycle.C0437d0<java.lang.Integer> f24186k;

    /* renamed from: l */
    public final androidx.lifecycle.LiveData<java.lang.Integer> f24187l;

    /* renamed from: m */
    public final androidx.lifecycle.C0437d0<java.lang.Double> f24188m;

    /* renamed from: n */
    public final androidx.lifecycle.LiveData<java.lang.Double> f24189n;

    /* renamed from: o */
    public final androidx.lifecycle.C0437d0<java.lang.String> f24190o;

    /* renamed from: p */
    public final androidx.lifecycle.LiveData<java.lang.String> f24191p;

    /* renamed from: q */
    public java.util.Map<java.lang.String, ? extends java.util.List<p417xf.C7050d>> f24192q;

    /* renamed from: r */
    public final androidx.lifecycle.C0437d0<vg.C6661b<io.tacocrypto.app.p156ui.tools.nftwallet.model.CollectionDataUi>> f24193r;

    /* renamed from: tf.c$a */
    public static final class a {

        /* renamed from: a */
        public final p417xf.C7060n f24194a;

        /* renamed from: b */
        public java.lang.Double f24195b;

        /* renamed from: c */
        public final java.lang.String f24196c;

        public a(p417xf.C7060n r2, java.lang.Double r3, java.lang.String r4) {
                r1 = this;
                java.lang.String r0 = "NFTCollection"
                p214m2.C4339q.m9706k(r2, r0)
                r1.<init>()
                r1.f24194a = r2
                r1.f24195b = r3
                r1.f24196c = r4
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof tf.C6230c.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                tf.c$a r5 = (tf.C6230c.a) r5
                xf.n r1 = r4.f24194a
                xf.n r3 = r5.f24194a
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.Double r1 = r4.f24195b
                java.lang.Double r3 = r5.f24195b
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                java.lang.String r1 = r4.f24196c
                java.lang.String r5 = r5.f24196c
                boolean r5 = p214m2.C4339q.m9702c(r1, r5)
                if (r5 != 0) goto L2d
                return r2
            L2d:
                return r0
        }

        public int hashCode() {
                r3 = this;
                xf.n r0 = r3.f24194a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.Double r1 = r3.f24195b
                r2 = 0
                if (r1 != 0) goto Lf
                r1 = 0
                goto L13
            Lf:
                int r1 = r1.hashCode()
            L13:
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r3.f24196c
                if (r1 != 0) goto L1b
                goto L1f
            L1b:
                int r2 = r1.hashCode()
            L1f:
                int r0 = r0 + r2
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "NFTDataUi(NFTCollection="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                xf.n r1 = r3.f24194a
                r0.append(r1)
                java.lang.String r1 = ", priceWax="
                r0.append(r1)
                java.lang.Double r1 = r3.f24195b
                r0.append(r1)
                java.lang.String r1 = ", valueDollarString="
                r0.append(r1)
                java.lang.String r1 = r3.f24196c
                r2 = 41
                java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
                return r0
        }
    }

    /* renamed from: tf.c$b */
    public static final class b extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f24197Z;

        public b(android.app.Application r1) {
                r0 = this;
                r0.f24197Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f24197Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    public C6230c(android.app.Application r3, p238nd.C4728b0 r4) {
            r2 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r4, r0)
            r2.<init>()
            tf.c$b r0 = new tf.c$b
            r0.<init>(r3)
            ch.d r3 = p185k7.C4038x4.m9096i(r0)
            r2.f24178c = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r2.f24179d = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r2.f24180e = r3
            r2.f24181f = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r2.f24182g = r3
            r2.f24183h = r3
            id.b r3 = r4.m10795h()
            if (r3 == 0) goto L3b
            java.lang.String r3 = r3.f12559a
            if (r3 != 0) goto L3d
        L3b:
            java.lang.String r3 = ""
        L3d:
            r2.f24184i = r3
            androidx.lifecycle.d0 r4 = new androidx.lifecycle.d0
            r4.<init>(r3)
            r2.f24185j = r4
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.<init>(r4)
            r2.f24186k = r3
            r2.f24187l = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r0 = 0
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            r3.<init>(r4)
            r2.f24188m = r3
            r2.f24189n = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            java.lang.String r4 = "--"
            r3.<init>(r4)
            r2.f24190o = r3
            r2.f24191p = r3
            dh.l r3 = p062dh.C1476l.f7238Y
            r2.f24192q = r3
            androidx.lifecycle.d0 r3 = new androidx.lifecycle.d0
            r3.<init>()
            r2.f24193r = r3
            return
    }

    /* renamed from: d */
    public static final java.lang.Object m12823d(tf.C6230c r3, java.lang.String r4, p101fh.InterfaceC2172d r5) {
            fh.j r0 = new fh.j
            fh.d r5 = gh.C2390b.m6127q(r5)
            r0.<init>(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            nd.v0 r1 = p238nd.C4781v0.f19121e
            java.lang.String r2 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r1, r2)
            java.lang.String r1 = r1.m10837a()
            r5.append(r1)
            java.lang.String r1 = "/v1/accounts/"
            r5.append(r1)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            tf.g r5 = new tf.g
            r5.<init>(r0)
            tf.h r1 = new tf.h
            r1.<init>(r0)
            tf.e r2 = new tf.e
            r2.<init>(r4, r5, r1)
            ch.d r3 = r3.f24178c
            java.lang.Object r3 = r3.getValue()
            g2.o r3 = (p105g2.C2221o) r3
            r3.m5814a(r2)
            java.lang.Object r3 = r0.m5741a()
            return r3
    }

    /* renamed from: e */
    public static final java.lang.Object m12824e(tf.C6230c r9, java.util.List r10, p101fh.InterfaceC2172d r11) {
            java.util.Objects.requireNonNull(r9)
            fh.j r0 = new fh.j
            fh.d r11 = gh.C2390b.m6127q(r11)
            r0.<init>(r11)
            java.lang.String r2 = ","
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 62
            r1 = r10
            java.lang.String r10 = p062dh.C1473i.m4000L(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            nd.v0 r1 = p238nd.C4781v0.f19121e
            java.lang.String r2 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r1, r2)
            java.lang.String r1 = r1.m10838b()
            r11.append(r1)
            java.lang.String r1 = "/v1/prices/templates?template_id="
            r11.append(r1)
            r11.append(r10)
            java.lang.String r10 = "&page=1&limit=100&order=desc"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            tf.k r11 = new tf.k
            r11.<init>(r0)
            tf.l r1 = new tf.l
            r1.<init>(r0)
            tf.i r2 = new tf.i
            r2.<init>(r10, r11, r1)
            ch.d r9 = r9.f24178c
            java.lang.Object r9 = r9.getValue()
            g2.o r9 = (p105g2.C2221o) r9
            r9.m5814a(r2)
            java.lang.Object r9 = r0.m5741a()
            return r9
    }

    /* renamed from: f */
    public final void m12825f() {
            r8 = this;
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r8.f24180e
            java.lang.Object r0 = r0.m1411d()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto Lf
            goto L25
        Lf:
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r8.f24180e
            r0.mo7l(r1)
            vh.b0 r2 = p064e.C1488b.m4037d(r8)
            r3 = 0
            tf.d r5 = new tf.d
            r0 = 0
            r5.<init>(r8, r0)
            r6 = 3
            r7 = 0
            r4 = 0
            p101fh.C2174f.m5714d(r2, r3, r4, r5, r6, r7)
        L25:
            return
    }
}
