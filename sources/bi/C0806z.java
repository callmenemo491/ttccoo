package bi;

/* renamed from: bi.z */
/* loaded from: classes.dex */
public final class C0806z extends bi.AbstractC0781f0 {

    /* renamed from: f */
    public static final bi.C0805y f4369f = null;

    /* renamed from: g */
    public static final bi.C0805y f4370g = null;

    /* renamed from: h */
    public static final byte[] f4371h = null;

    /* renamed from: i */
    public static final byte[] f4372i = null;

    /* renamed from: j */
    public static final byte[] f4373j = null;

    /* renamed from: b */
    public final bi.C0805y f4374b;

    /* renamed from: c */
    public long f4375c;

    /* renamed from: d */
    public final p260oi.C5287i f4376d;

    /* renamed from: e */
    public final java.util.List<bi.C0806z.b> f4377e;

    /* renamed from: bi.z$a */
    public static final class a {

        /* renamed from: a */
        public final p260oi.C5287i f4378a;

        /* renamed from: b */
        public bi.C0805y f4379b;

        /* renamed from: c */
        public final java.util.List<bi.C0806z.b> f4380c;

        public a() {
                r2 = this;
                java.util.UUID r0 = java.util.UUID.randomUUID()
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "UUID.randomUUID().toString()"
                p214m2.C4339q.m9705j(r0, r1)
                java.lang.String r1 = "boundary"
                p214m2.C4339q.m9706k(r0, r1)
                r2.<init>()
                oi.i$a r1 = p260oi.C5287i.f20505c0
                oi.i r0 = r1.m11596b(r0)
                r2.f4378a = r0
                bi.y r0 = bi.C0806z.f4369f
                r2.f4379b = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.f4380c = r0
                return
        }
    }

    /* renamed from: bi.z$b */
    public static final class b {

        /* renamed from: a */
        public final bi.C0802v f4381a;

        /* renamed from: b */
        public final bi.AbstractC0781f0 f4382b;

        public b(bi.C0802v r1, bi.AbstractC0781f0 r2, p239nh.C4826f r3) {
                r0 = this;
                r0.<init>()
                r0.f4381a = r1
                r0.f4382b = r2
                return
        }
    }

    static {
            bi.y$a r0 = bi.C0805y.f4365f
            java.lang.String r0 = "multipart/mixed"
            bi.y r0 = bi.C0805y.a.m2459a(r0)
            bi.C0806z.f4369f = r0
            java.lang.String r0 = "multipart/alternative"
            bi.C0805y.a.m2459a(r0)
            java.lang.String r0 = "multipart/digest"
            bi.C0805y.a.m2459a(r0)
            java.lang.String r0 = "multipart/parallel"
            bi.C0805y.a.m2459a(r0)
            java.lang.String r0 = "multipart/form-data"
            bi.y r0 = bi.C0805y.a.m2459a(r0)
            bi.C0806z.f4370g = r0
            r0 = 2
            byte[] r1 = new byte[r0]
            r2 = 58
            byte r2 = (byte) r2
            r3 = 0
            r1[r3] = r2
            r2 = 32
            byte r2 = (byte) r2
            r4 = 1
            r1[r4] = r2
            bi.C0806z.f4371h = r1
            byte[] r1 = new byte[r0]
            r2 = 13
            byte r2 = (byte) r2
            r1[r3] = r2
            r2 = 10
            byte r2 = (byte) r2
            r1[r4] = r2
            bi.C0806z.f4372i = r1
            byte[] r0 = new byte[r0]
            r1 = 45
            byte r1 = (byte) r1
            r0[r3] = r1
            r0[r4] = r1
            bi.C0806z.f4373j = r0
            return
    }

    public C0806z(p260oi.C5287i r2, bi.C0805y r3, java.util.List<bi.C0806z.b> r4) {
            r1 = this;
            java.lang.String r0 = "boundaryByteString"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "type"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.f4376d = r2
            r1.f4377e = r4
            bi.y$a r4 = bi.C0805y.f4365f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "; boundary="
            r4.append(r3)
            java.lang.String r2 = r2.m11592s()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            bi.y r2 = bi.C0805y.a.m2459a(r2)
            r1.f4374b = r2
            r2 = -1
            r1.f4375c = r2
            return
    }

    @Override // bi.AbstractC0781f0
    /* renamed from: a */
    public long mo2371a() {
            r5 = this;
            long r0 = r5.f4375c
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L10
            r0 = 0
            r1 = 1
            long r0 = r5.m2461d(r0, r1)
            r5.f4375c = r0
        L10:
            return r0
    }

    @Override // bi.AbstractC0781f0
    /* renamed from: b */
    public bi.C0805y mo2372b() {
            r1 = this;
            bi.y r0 = r1.f4374b
            return r0
    }

    @Override // bi.AbstractC0781f0
    /* renamed from: c */
    public void mo2373c(p260oi.InterfaceC5285g r2) {
            r1 = this;
            java.lang.String r0 = "sink"
            p214m2.C4339q.m9706k(r2, r0)
            r0 = 0
            r1.m2461d(r2, r0)
            return
    }

    /* renamed from: d */
    public final long m2461d(p260oi.InterfaceC5285g r13, boolean r14) {
            r12 = this;
            if (r14 == 0) goto L9
            oi.e r13 = new oi.e
            r13.<init>()
            r0 = r13
            goto La
        L9:
            r0 = 0
        La:
            java.util.List<bi.z$b> r1 = r12.f4377e
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = 0
        L14:
            if (r5 >= r1) goto Laa
            java.util.List<bi.z$b> r6 = r12.f4377e
            java.lang.Object r6 = r6.get(r5)
            bi.z$b r6 = (bi.C0806z.b) r6
            bi.v r7 = r6.f4381a
            bi.f0 r6 = r6.f4382b
            p214m2.C4339q.m9704i(r13)
            byte[] r8 = bi.C0806z.f4373j
            r13.mo11551O(r8)
            oi.i r8 = r12.f4376d
            r13.mo11546I(r8)
            byte[] r8 = bi.C0806z.f4372i
            r13.mo11551O(r8)
            if (r7 == 0) goto L5b
            int r8 = r7.size()
            r9 = 0
        L3b:
            if (r9 >= r8) goto L5b
            java.lang.String r10 = r7.m2429e(r9)
            oi.g r10 = r13.mo11567l0(r10)
            byte[] r11 = bi.C0806z.f4371h
            oi.g r10 = r10.mo11551O(r11)
            java.lang.String r11 = r7.m2431i(r9)
            oi.g r10 = r10.mo11567l0(r11)
            byte[] r11 = bi.C0806z.f4372i
            r10.mo11551O(r11)
            int r9 = r9 + 1
            goto L3b
        L5b:
            bi.y r7 = r6.mo2372b()
            if (r7 == 0) goto L72
            java.lang.String r8 = "Content-Type: "
            oi.g r8 = r13.mo11567l0(r8)
            java.lang.String r7 = r7.f4366a
            oi.g r7 = r8.mo11567l0(r7)
            byte[] r8 = bi.C0806z.f4372i
            r7.mo11551O(r8)
        L72:
            long r7 = r6.mo2371a()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L8c
            java.lang.String r9 = "Content-Length: "
            oi.g r9 = r13.mo11567l0(r9)
            oi.g r9 = r9.mo11570n0(r7)
            byte[] r10 = bi.C0806z.f4372i
            r9.mo11551O(r10)
            goto L97
        L8c:
            if (r14 == 0) goto L97
            p214m2.C4339q.m9704i(r0)
            long r13 = r0.f20501Z
            r0.mo11559b(r13)
            return r9
        L97:
            byte[] r9 = bi.C0806z.f4372i
            r13.mo11551O(r9)
            if (r14 == 0) goto La0
            long r3 = r3 + r7
            goto La3
        La0:
            r6.mo2373c(r13)
        La3:
            r13.mo11551O(r9)
            int r5 = r5 + 1
            goto L14
        Laa:
            p214m2.C4339q.m9704i(r13)
            byte[] r1 = bi.C0806z.f4373j
            r13.mo11551O(r1)
            oi.i r2 = r12.f4376d
            r13.mo11546I(r2)
            r13.mo11551O(r1)
            byte[] r1 = bi.C0806z.f4372i
            r13.mo11551O(r1)
            if (r14 == 0) goto Lca
            p214m2.C4339q.m9704i(r0)
            long r13 = r0.f20501Z
            long r3 = r3 + r13
            r0.mo11559b(r13)
        Lca:
            return r3
    }
}
