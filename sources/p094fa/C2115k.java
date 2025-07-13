package p094fa;

/* renamed from: fa.k */
/* loaded from: classes.dex */
public final class C2115k extends p094fa.AbstractC2103a0.e.d {

    /* renamed from: a */
    public final long f9736a;

    /* renamed from: b */
    public final java.lang.String f9737b;

    /* renamed from: c */
    public final p094fa.AbstractC2103a0.e.d.a f9738c;

    /* renamed from: d */
    public final p094fa.AbstractC2103a0.e.d.c f9739d;

    /* renamed from: e */
    public final p094fa.AbstractC2103a0.e.d.AbstractC7389d f9740e;

    /* renamed from: fa.k$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: fa.k$b */
    public static final class b extends p094fa.AbstractC2103a0.e.d.b {

        /* renamed from: a */
        public java.lang.Long f9741a;

        /* renamed from: b */
        public java.lang.String f9742b;

        /* renamed from: c */
        public p094fa.AbstractC2103a0.e.d.a f9743c;

        /* renamed from: d */
        public p094fa.AbstractC2103a0.e.d.c f9744d;

        /* renamed from: e */
        public p094fa.AbstractC2103a0.e.d.AbstractC7389d f9745e;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        public b(p094fa.AbstractC2103a0.e.d r3, p094fa.C2115k.a r4) {
                r2 = this;
                r2.<init>()
                fa.k r3 = (p094fa.C2115k) r3
                long r0 = r3.f9736a
                java.lang.Long r4 = java.lang.Long.valueOf(r0)
                r2.f9741a = r4
                java.lang.String r4 = r3.f9737b
                r2.f9742b = r4
                fa.a0$e$d$a r4 = r3.f9738c
                r2.f9743c = r4
                fa.a0$e$d$c r4 = r3.f9739d
                r2.f9744d = r4
                fa.a0$e$d$d r3 = r3.f9740e
                r2.f9745e = r3
                return
        }

        @Override // p094fa.AbstractC2103a0.e.d.b
        /* renamed from: a */
        public p094fa.AbstractC2103a0.e.d mo5649a() {
                r10 = this;
                java.lang.Long r0 = r10.f9741a
                if (r0 != 0) goto L7
                java.lang.String r0 = " timestamp"
                goto L9
            L7:
                java.lang.String r0 = ""
            L9:
                java.lang.String r1 = r10.f9742b
                if (r1 != 0) goto L13
                java.lang.String r1 = " type"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L13:
                fa.a0$e$d$a r1 = r10.f9743c
                if (r1 != 0) goto L1d
                java.lang.String r1 = " app"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L1d:
                fa.a0$e$d$c r1 = r10.f9744d
                if (r1 != 0) goto L27
                java.lang.String r1 = " device"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L27:
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L43
                fa.k r0 = new fa.k
                java.lang.Long r1 = r10.f9741a
                long r3 = r1.longValue()
                java.lang.String r5 = r10.f9742b
                fa.a0$e$d$a r6 = r10.f9743c
                fa.a0$e$d$c r7 = r10.f9744d
                fa.a0$e$d$d r8 = r10.f9745e
                r9 = 0
                r2 = r0
                r2.<init>(r3, r5, r6, r7, r8, r9)
                return r0
            L43:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Missing required properties:"
                java.lang.String r0 = p064e.C1493g.m4049a(r2, r0)
                r1.<init>(r0)
                throw r1
        }

        /* renamed from: b */
        public p094fa.AbstractC2103a0.e.d.b m5686b(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.f9741a = r1
                return r0
        }

        /* renamed from: c */
        public p094fa.AbstractC2103a0.e.d.b m5687c(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null type"
                java.util.Objects.requireNonNull(r2, r0)
                r1.f9742b = r2
                return r1
        }
    }

    public C2115k(long r1, java.lang.String r3, p094fa.AbstractC2103a0.e.d.a r4, p094fa.AbstractC2103a0.e.d.c r5, p094fa.AbstractC2103a0.e.d.AbstractC7389d r6, p094fa.C2115k.a r7) {
            r0 = this;
            r0.<init>()
            r0.f9736a = r1
            r0.f9737b = r3
            r0.f9738c = r4
            r0.f9739d = r5
            r0.f9740e = r6
            return
    }

    @Override // p094fa.AbstractC2103a0.e.d
    /* renamed from: a */
    public p094fa.AbstractC2103a0.e.d.a mo5612a() {
            r1 = this;
            fa.a0$e$d$a r0 = r1.f9738c
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d
    /* renamed from: b */
    public p094fa.AbstractC2103a0.e.d.c mo5613b() {
            r1 = this;
            fa.a0$e$d$c r0 = r1.f9739d
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d
    /* renamed from: c */
    public p094fa.AbstractC2103a0.e.d.AbstractC7389d mo5614c() {
            r1 = this;
            fa.a0$e$d$d r0 = r1.f9740e
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d
    /* renamed from: d */
    public long mo5615d() {
            r2 = this;
            long r0 = r2.f9736a
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d
    /* renamed from: e */
    public java.lang.String mo5616e() {
            r1 = this;
            java.lang.String r0 = r1.f9737b
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p094fa.AbstractC2103a0.e.d
            r2 = 0
            if (r1 == 0) goto L4d
            fa.a0$e$d r8 = (p094fa.AbstractC2103a0.e.d) r8
            long r3 = r7.f9736a
            long r5 = r8.mo5615d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L4b
            java.lang.String r1 = r7.f9737b
            java.lang.String r3 = r8.mo5616e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4b
            fa.a0$e$d$a r1 = r7.f9738c
            fa.a0$e$d$a r3 = r8.mo5612a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4b
            fa.a0$e$d$c r1 = r7.f9739d
            fa.a0$e$d$c r3 = r8.mo5613b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4b
            fa.a0$e$d$d r1 = r7.f9740e
            fa.a0$e$d$d r8 = r8.mo5614c()
            if (r1 != 0) goto L44
            if (r8 != 0) goto L4b
            goto L4c
        L44:
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L4b
            goto L4c
        L4b:
            r0 = 0
        L4c:
            return r0
        L4d:
            return r2
    }

    @Override // p094fa.AbstractC2103a0.e.d
    /* renamed from: f */
    public p094fa.AbstractC2103a0.e.d.b mo5617f() {
            r2 = this;
            fa.k$b r0 = new fa.k$b
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.f9736a
            r2 = 32
            long r2 = r0 >>> r2
            long r0 = r0 ^ r2
            int r1 = (int) r0
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r0
            int r1 = r1 * r0
            java.lang.String r2 = r4.f9737b
            int r2 = r2.hashCode()
            r1 = r1 ^ r2
            int r1 = r1 * r0
            fa.a0$e$d$a r2 = r4.f9738c
            int r2 = r2.hashCode()
            r1 = r1 ^ r2
            int r1 = r1 * r0
            fa.a0$e$d$c r2 = r4.f9739d
            int r2 = r2.hashCode()
            r1 = r1 ^ r2
            int r1 = r1 * r0
            fa.a0$e$d$d r0 = r4.f9740e
            if (r0 != 0) goto L2f
            r0 = 0
            goto L33
        L2f:
            int r0 = r0.hashCode()
        L33:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Event{timestamp="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            long r1 = r3.f9736a
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            java.lang.String r1 = r3.f9737b
            r0.append(r1)
            java.lang.String r1 = ", app="
            r0.append(r1)
            fa.a0$e$d$a r1 = r3.f9738c
            r0.append(r1)
            java.lang.String r1 = ", device="
            r0.append(r1)
            fa.a0$e$d$c r1 = r3.f9739d
            r0.append(r1)
            java.lang.String r1 = ", log="
            r0.append(r1)
            fa.a0$e$d$d r1 = r3.f9740e
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
