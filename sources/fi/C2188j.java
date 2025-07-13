package fi;

/* renamed from: fi.j */
/* loaded from: classes.dex */
public final class C2188j {

    /* renamed from: a */
    public java.util.List<? extends java.net.Proxy> f9991a;

    /* renamed from: b */
    public int f9992b;

    /* renamed from: c */
    public java.util.List<? extends java.net.InetSocketAddress> f9993c;

    /* renamed from: d */
    public final java.util.List<bi.C0789j0> f9994d;

    /* renamed from: e */
    public final bi.C0770a f9995e;

    /* renamed from: f */
    public final p095fb.C2133c f9996f;

    /* renamed from: g */
    public final bi.InterfaceC0780f f9997g;

    /* renamed from: h */
    public final bi.AbstractC0799s f9998h;

    /* renamed from: fi.j$a */
    public static final class a {

        /* renamed from: a */
        public int f9999a;

        /* renamed from: b */
        public final java.util.List<bi.C0789j0> f10000b;

        public a(java.util.List<bi.C0789j0> r1) {
                r0 = this;
                r0.<init>()
                r0.f10000b = r1
                return
        }

        /* renamed from: a */
        public final boolean m5778a() {
                r2 = this;
                int r0 = r2.f9999a
                java.util.List<bi.j0> r1 = r2.f10000b
                int r1 = r1.size()
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        /* renamed from: b */
        public final bi.C0789j0 m5779b() {
                r3 = this;
                boolean r0 = r3.m5778a()
                if (r0 == 0) goto L15
                java.util.List<bi.j0> r0 = r3.f10000b
                int r1 = r3.f9999a
                int r2 = r1 + 1
                r3.f9999a = r2
                java.lang.Object r0 = r0.get(r1)
                bi.j0 r0 = (bi.C0789j0) r0
                return r0
            L15:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }
    }

    public C2188j(bi.C0770a r2, p095fb.C2133c r3, bi.InterfaceC0780f r4, bi.AbstractC0799s r5) {
            r1 = this;
            java.lang.String r0 = "address"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "routeDatabase"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "call"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "eventListener"
            p214m2.C4339q.m9706k(r5, r0)
            r1.<init>()
            r1.f9995e = r2
            r1.f9996f = r3
            r1.f9997g = r4
            r1.f9998h = r5
            dh.k r3 = p062dh.C1475k.f7237Y
            r1.f9991a = r3
            r1.f9993c = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.f9994d = r3
            bi.w r3 = r2.f4124a
            java.net.Proxy r4 = r2.f4133j
            java.lang.String r5 = "url"
            p214m2.C4339q.m9706k(r3, r5)
            r5 = 0
            if (r4 == 0) goto L3d
            java.util.List r2 = p074e9.C1805a.m4528m(r4)
            goto L76
        L3d:
            java.net.URI r3 = r3.m2446h()
            java.lang.String r4 = r3.getHost()
            r0 = 1
            if (r4 != 0) goto L53
            java.net.Proxy[] r2 = new java.net.Proxy[r0]
            java.net.Proxy r3 = java.net.Proxy.NO_PROXY
            r2[r5] = r3
            java.util.List r2 = ci.C0988c.m2706k(r2)
            goto L76
        L53:
            java.net.ProxySelector r2 = r2.f4134k
            java.util.List r2 = r2.select(r3)
            if (r2 == 0) goto L64
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L62
            goto L64
        L62:
            r3 = 0
            goto L65
        L64:
            r3 = 1
        L65:
            if (r3 == 0) goto L72
            java.net.Proxy[] r2 = new java.net.Proxy[r0]
            java.net.Proxy r3 = java.net.Proxy.NO_PROXY
            r2[r5] = r3
            java.util.List r2 = ci.C0988c.m2706k(r2)
            goto L76
        L72:
            java.util.List r2 = ci.C0988c.m2717v(r2)
        L76:
            r1.f9991a = r2
            r1.f9992b = r5
            return
    }

    /* renamed from: a */
    public final boolean m5776a() {
            r2 = this;
            boolean r0 = r2.m5777b()
            r1 = 1
            if (r0 != 0) goto L12
            java.util.List<bi.j0> r0 = r2.f9994d
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r1
            if (r0 == 0) goto L11
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    /* renamed from: b */
    public final boolean m5777b() {
            r2 = this;
            int r0 = r2.f9992b
            java.util.List<? extends java.net.Proxy> r1 = r2.f9991a
            int r1 = r1.size()
            if (r0 >= r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }
}
