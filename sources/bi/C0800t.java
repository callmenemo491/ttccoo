package bi;

/* renamed from: bi.t */
/* loaded from: classes.dex */
public final class C0800t extends bi.AbstractC0781f0 {

    /* renamed from: d */
    public static final bi.C0805y f4328d = null;

    /* renamed from: b */
    public final java.util.List<java.lang.String> f4329b;

    /* renamed from: c */
    public final java.util.List<java.lang.String> f4330c;

    /* renamed from: bi.t$a */
    public static final class a {

        /* renamed from: a */
        public final java.util.List<java.lang.String> f4331a;

        /* renamed from: b */
        public final java.util.List<java.lang.String> f4332b;

        /* renamed from: c */
        public final java.nio.charset.Charset f4333c;

        public a() {
                r1 = this;
                r0 = 0
                r1.<init>()
                r1.f4333c = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f4331a = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f4332b = r0
                return
        }
    }

    static {
            bi.y$a r0 = bi.C0805y.f4365f
            java.lang.String r0 = "application/x-www-form-urlencoded"
            bi.y r0 = bi.C0805y.a.m2459a(r0)
            bi.C0800t.f4328d = r0
            return
    }

    public C0800t(java.util.List<java.lang.String> r2, java.util.List<java.lang.String> r3) {
            r1 = this;
            java.lang.String r0 = "encodedNames"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "encodedValues"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            java.util.List r2 = ci.C0988c.m2717v(r2)
            r1.f4329b = r2
            java.util.List r2 = ci.C0988c.m2717v(r3)
            r1.f4330c = r2
            return
    }

    @Override // bi.AbstractC0781f0
    /* renamed from: a */
    public long mo2371a() {
            r2 = this;
            r0 = 0
            r1 = 1
            long r0 = r2.m2424d(r0, r1)
            return r0
    }

    @Override // bi.AbstractC0781f0
    /* renamed from: b */
    public bi.C0805y mo2372b() {
            r1 = this;
            bi.y r0 = bi.C0800t.f4328d
            return r0
    }

    @Override // bi.AbstractC0781f0
    /* renamed from: c */
    public void mo2373c(p260oi.InterfaceC5285g r2) {
            r1 = this;
            java.lang.String r0 = "sink"
            p214m2.C4339q.m9706k(r2, r0)
            r0 = 0
            r1.m2424d(r2, r0)
            return
    }

    /* renamed from: d */
    public final long m2424d(p260oi.InterfaceC5285g r4, boolean r5) {
            r3 = this;
            if (r5 == 0) goto L8
            oi.e r4 = new oi.e
            r4.<init>()
            goto Lf
        L8:
            p214m2.C4339q.m9704i(r4)
            oi.e r4 = r4.mo11561c()
        Lf:
            r0 = 0
            java.util.List<java.lang.String> r1 = r3.f4329b
            int r1 = r1.size()
        L16:
            if (r0 >= r1) goto L3d
            if (r0 <= 0) goto L1f
            r2 = 38
            r4.m11539D0(r2)
        L1f:
            java.util.List<java.lang.String> r2 = r3.f4329b
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            r4.m11547I0(r2)
            r2 = 61
            r4.m11539D0(r2)
            java.util.List<java.lang.String> r2 = r3.f4330c
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            r4.m11547I0(r2)
            int r0 = r0 + 1
            goto L16
        L3d:
            if (r5 == 0) goto L45
            long r0 = r4.f20501Z
            r4.mo11559b(r0)
            goto L47
        L45:
            r0 = 0
        L47:
            return r0
    }
}
