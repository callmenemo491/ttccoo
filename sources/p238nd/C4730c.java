package p238nd;

/* renamed from: nd.c */
/* loaded from: classes.dex */
public final class C4730c {

    /* renamed from: j */
    @android.annotation.SuppressLint({"StaticFieldLeak"})
    public static volatile p238nd.C4730c f18962j;

    /* renamed from: a */
    public final android.content.Context f18963a;

    /* renamed from: b */
    public final ch.InterfaceC0977d f18964b;

    /* renamed from: c */
    public final ch.InterfaceC0977d f18965c;

    /* renamed from: d */
    public final ch.InterfaceC0977d f18966d;

    /* renamed from: e */
    public final ch.InterfaceC0977d f18967e;

    /* renamed from: f */
    public final ch.InterfaceC0977d f18968f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<vg.C6661b<ch.C0985l>> f18969g;

    /* renamed from: h */
    public final java.util.Map<java.lang.String, p238nd.C4730c.a> f18970h;

    /* renamed from: i */
    public final java.util.Set<java.lang.String> f18971i;

    /* renamed from: nd.c$a */
    public static final class a {

        /* renamed from: a */
        public final p198l3.C4173g f18972a;

        /* renamed from: b */
        public final double f18973b;

        /* renamed from: c */
        public final boolean f18974c;

        /* renamed from: d */
        public final boolean f18975d;

        /* renamed from: e */
        public final int f18976e;

        public a(p198l3.C4173g r1, double r2, boolean r4, boolean r5, int r6) {
                r0 = this;
                r0.<init>()
                r0.f18972a = r1
                r0.f18973b = r2
                r0.f18974c = r4
                r0.f18975d = r5
                r0.f18976e = r6
                return
        }

        public boolean equals(java.lang.Object r6) {
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L4
                return r0
            L4:
                boolean r1 = r6 instanceof p238nd.C4730c.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                nd.c$a r6 = (p238nd.C4730c.a) r6
                l3.g r1 = r5.f18972a
                l3.g r3 = r6.f18972a
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                double r3 = r5.f18973b
                java.lang.Double r1 = java.lang.Double.valueOf(r3)
                double r3 = r6.f18973b
                java.lang.Double r3 = java.lang.Double.valueOf(r3)
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L2a
                return r2
            L2a:
                boolean r1 = r5.f18974c
                boolean r3 = r6.f18974c
                if (r1 == r3) goto L31
                return r2
            L31:
                boolean r1 = r5.f18975d
                boolean r3 = r6.f18975d
                if (r1 == r3) goto L38
                return r2
            L38:
                int r1 = r5.f18976e
                int r6 = r6.f18976e
                if (r1 == r6) goto L3f
                return r2
            L3f:
                return r0
        }

        public int hashCode() {
                r5 = this;
                l3.g r0 = r5.f18972a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                double r1 = r5.f18973b
                long r1 = java.lang.Double.doubleToLongBits(r1)
                r3 = 32
                long r3 = r1 >>> r3
                long r1 = r1 ^ r3
                int r2 = (int) r1
                int r0 = r0 + r2
                int r0 = r0 * 31
                boolean r1 = r5.f18974c
                r2 = 1
                if (r1 == 0) goto L1d
                r1 = 1
            L1d:
                int r0 = r0 + r1
                int r0 = r0 * 31
                boolean r1 = r5.f18975d
                if (r1 == 0) goto L25
                goto L26
            L25:
                r2 = r1
            L26:
                int r0 = r0 + r2
                int r0 = r0 * 31
                int r1 = r5.f18976e
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "ChartData(data="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                l3.g r1 = r3.f18972a
                r0.append(r1)
                java.lang.String r1 = ", diff="
                r0.append(r1)
                double r1 = r3.f18973b
                r0.append(r1)
                java.lang.String r1 = ", isPositive="
                r0.append(r1)
                boolean r1 = r3.f18974c
                r0.append(r1)
                java.lang.String r1 = ", isEmpty="
                r0.append(r1)
                boolean r1 = r3.f18975d
                r0.append(r1)
                java.lang.String r1 = ", graphType="
                r0.append(r1)
                int r1 = r3.f18976e
                r2 = 41
                java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
                return r0
        }
    }

    public C4730c(android.content.Context r1, p239nh.C4826f r2) {
            r0 = this;
            r0.<init>()
            r0.f18963a = r1
            nd.o r1 = new nd.o
            r1.<init>(r0)
            ch.d r1 = p185k7.C4038x4.m9096i(r1)
            r0.f18964b = r1
            nd.f r1 = new nd.f
            r1.<init>(r0)
            ch.d r1 = p185k7.C4038x4.m9096i(r1)
            r0.f18965c = r1
            nd.g r1 = new nd.g
            r1.<init>(r0)
            ch.d r1 = p185k7.C4038x4.m9096i(r1)
            r0.f18966d = r1
            nd.d r1 = new nd.d
            r1.<init>(r0)
            ch.d r1 = p185k7.C4038x4.m9096i(r1)
            r0.f18967e = r1
            nd.e r1 = new nd.e
            r1.<init>(r0)
            ch.d r1 = p185k7.C4038x4.m9096i(r1)
            r0.f18968f = r1
            androidx.lifecycle.d0 r1 = new androidx.lifecycle.d0
            r1.<init>()
            r0.f18969g = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.f18970h = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f18971i = r1
            return
    }

    /* renamed from: a */
    public static final java.lang.Object m10810a(p238nd.C4730c r6, io.tacocrypto.app.p156ui.balance.EnumC3214d r7, p101fh.InterfaceC2172d r8) {
            java.util.Objects.requireNonNull(r6)
            java.lang.String r0 = "WAX"
            boolean r1 = r8 instanceof p238nd.C4748i
            if (r1 == 0) goto L18
            r1 = r8
            nd.i r1 = (p238nd.C4748i) r1
            int r2 = r1.f19051d0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f19051d0 = r2
            goto L1d
        L18:
            nd.i r1 = new nd.i
            r1.<init>(r6, r8)
        L1d:
            java.lang.Object r8 = r1.f19049b0
            gh.a r2 = gh.EnumC2389a.f10764Y
            int r3 = r1.f19051d0
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L35
            if (r3 != r5) goto L2d
            p074e9.C1805a.m4540y(r8)     // Catch: java.lang.Throwable -> L94
            goto L46
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            p074e9.C1805a.m4540y(r8)
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L94
            r8 = 0
            r1.f19051d0 = r5     // Catch: java.lang.Throwable -> L94
            java.lang.Object r8 = m10813e(r6, r7, r8, r1, r4)     // Catch: java.lang.Throwable -> L94
            if (r8 != r2) goto L46
            goto Lb3
        L46:
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Throwable -> L94
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L94
            r6.<init>()     // Catch: java.lang.Throwable -> L94
            java.util.Set r7 = r8.entrySet()     // Catch: java.lang.Throwable -> L94
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L94
        L55:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L94
            if (r8 == 0) goto L99
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L94
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch: java.lang.Throwable -> L94
            java.lang.Object r1 = r8.getValue()     // Catch: java.lang.Throwable -> L94
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L94
            java.lang.Object r1 = p062dh.C1473i.m3996H(r1)     // Catch: java.lang.Throwable -> L94
            od.l r1 = (p255od.C5213l) r1     // Catch: java.lang.Throwable -> L94
            r2 = 0
            if (r1 != 0) goto L71
            goto L86
        L71:
            java.lang.String r3 = r1.getP1()     // Catch: java.lang.Throwable -> L94
            boolean r3 = p362uh.C6467m.m13064U(r3, r0, r2, r4)     // Catch: java.lang.Throwable -> L94
            if (r3 != 0) goto L85
            java.lang.String r1 = r1.getP2()     // Catch: java.lang.Throwable -> L94
            boolean r1 = p362uh.C6467m.m13064U(r1, r0, r2, r4)     // Catch: java.lang.Throwable -> L94
            if (r1 == 0) goto L86
        L85:
            r2 = 1
        L86:
            if (r2 == 0) goto L55
            java.lang.Object r1 = r8.getKey()     // Catch: java.lang.Throwable -> L94
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L94
            r6.put(r1, r8)     // Catch: java.lang.Throwable -> L94
            goto L55
        L94:
            r6 = move-exception
            java.lang.Object r6 = p074e9.C1805a.m4520e(r6)
        L99:
            boolean r7 = r6 instanceof ch.C0979f.a
            r7 = r7 ^ r5
            if (r7 == 0) goto La2
            r2 = r6
            java.util.Map r2 = (java.util.Map) r2
            goto Lb3
        La2:
            java.lang.Throwable r6 = ch.C0979f.m2690b(r6)
            if (r6 == 0) goto Lb1
            java.lang.String r7 = "swap_analytics"
            hk.a$b r7 = hk.C3053a.m7466a(r7)
            r7.mo7470d(r6)
        Lb1:
            dh.l r2 = p062dh.C1476l.f7238Y
        Lb3:
            return r2
    }

    /* renamed from: b */
    public static final double m10811b(p238nd.C4730c r6, p255od.C5213l r7) {
            java.util.Objects.requireNonNull(r6)
            java.lang.String r6 = r7.getP1()
            r0 = 0
            r1 = 2
            java.lang.String r2 = "WAX"
            boolean r6 = p362uh.C6467m.m13064U(r6, r2, r0, r1)
            r1 = 6
            r2 = 32
            r3 = 1
            if (r6 == 0) goto L38
            java.lang.String r6 = r7.getP1()
            char[] r4 = new char[r3]
            r4[r0] = r2
            java.util.List r6 = p362uh.C6467m.m13079j0(r6, r4, r0, r0, r1)
            java.lang.Object r6 = r6.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            double r4 = java.lang.Double.parseDouble(r6)
            java.lang.String r6 = r7.getP2()
            char[] r7 = new char[r3]
            r7[r0] = r2
            java.util.List r6 = p362uh.C6467m.m13079j0(r6, r7, r0, r0, r1)
            goto L5a
        L38:
            java.lang.String r6 = r7.getP2()
            char[] r4 = new char[r3]
            r4[r0] = r2
            java.util.List r6 = p362uh.C6467m.m13079j0(r6, r4, r0, r0, r1)
            java.lang.Object r6 = r6.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            double r4 = java.lang.Double.parseDouble(r6)
            java.lang.String r6 = r7.getP1()
            char[] r7 = new char[r3]
            r7[r0] = r2
            java.util.List r6 = p362uh.C6467m.m13079j0(r6, r7, r0, r0, r1)
        L5a:
            java.lang.Object r6 = r6.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            double r6 = java.lang.Double.parseDouble(r6)
            double r4 = r4 / r6
            return r4
    }

    /* renamed from: c */
    public static final p198l3.C4173g m10812c(p238nd.C4730c r4, java.util.List r5, boolean r6) {
            java.util.Objects.requireNonNull(r4)
            l3.h r0 = new l3.h
            java.lang.String r1 = ""
            r0.<init>(r5, r1)
            r5 = 3
            r0.f17289C = r5
            r5 = 1045220557(0x3e4ccccd, float:0.2)
            r0.f17294H = r5
            r5 = 1072064102(0x3fe66666, float:1.8)
            float r5 = p323s3.AbstractC5952f.m12377d(r5)
            r0.f17298A = r5
            r5 = 1065353216(0x3f800000, float:1.0)
            float r5 = p323s3.AbstractC5952f.m12377d(r5)
            r0.f17292F = r5
            r5 = 0
            r0.f17303t = r5
            r1 = 1
            r0.f17299B = r1
            r0.f17296J = r5
            r0.f17305v = r5
            if (r6 == 0) goto L3c
            ch.d r2 = r4.f18967e
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            goto L48
        L3c:
            ch.d r2 = r4.f18968f
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
        L48:
            java.util.List<java.lang.Integer> r3 = r0.f17254a
            if (r3 != 0) goto L53
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f17254a = r3
        L53:
            java.util.List<java.lang.Integer> r3 = r0.f17254a
            r3.clear()
            java.util.List<java.lang.Integer> r3 = r0.f17254a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            if (r6 == 0) goto L6c
            ch.d r4 = r4.f18965c
            java.lang.Object r4 = r4.getValue()
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
            goto L74
        L6c:
            ch.d r4 = r4.f18966d
            java.lang.Object r4 = r4.getValue()
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
        L74:
            r0.f17301y = r4
            l3.g r4 = new l3.g
            p3.e[] r6 = new p267p3.InterfaceC5351e[r1]
            r6[r5] = r0
            r4.<init>(r6)
            java.util.List<T extends p3.d<? extends l3.f>> r6 = r4.f17278i
            java.util.Iterator r6 = r6.iterator()
        L85:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L95
            java.lang.Object r0 = r6.next()
            p3.d r0 = (p267p3.InterfaceC5350d) r0
            r0.mo9230N(r5)
            goto L85
        L95:
            return r4
    }

    /* renamed from: e */
    public static java.lang.Object m10813e(p238nd.C4730c r1, java.lang.String r2, java.lang.String r3, p101fh.InterfaceC2172d r4, int r5) {
            fh.j r3 = new fh.j
            fh.d r4 = gh.C2390b.m6127q(r4)
            r3.<init>(r4)
            java.lang.String r4 = "https://assets.tacostudios.io/swap/swap_analytics/"
            java.lang.String r5 = ".json"
            java.lang.String r2 = android.support.v4.media.C0145d.m257a(r4, r2, r5)
            nd.m r4 = new nd.m
            r4.<init>(r3)
            nd.n r5 = new nd.n
            r5.<init>(r3)
            nd.j r0 = new nd.j
            r0.<init>(r2, r4, r5)
            ch.d r1 = r1.f18964b
            java.lang.Object r1 = r1.getValue()
            g2.o r1 = (p105g2.C2221o) r1
            r1.m5814a(r0)
            java.lang.Object r1 = r3.m5741a()
            return r1
    }

    /* renamed from: d */
    public final void m10814d() {
            r2 = this;
            ch.d r0 = r2.f18964b
            java.lang.Object r0 = r0.getValue()
            g2.o r0 = (p105g2.C2221o) r0
            java.lang.String r1 = "Aubsowilod9sk8473sj9"
            r0.m5815b(r1)
            java.util.Map<java.lang.String, nd.c$a> r0 = r2.f18970h
            r0.clear()
            java.util.Set<java.lang.String> r0 = r2.f18971i
            r0.clear()
            return
    }
}
