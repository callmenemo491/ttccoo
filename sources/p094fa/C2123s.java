package p094fa;

/* renamed from: fa.s */
/* loaded from: classes.dex */
public final class C2123s extends p094fa.AbstractC2103a0.e.d.c {

    /* renamed from: a */
    public final java.lang.Double f9786a;

    /* renamed from: b */
    public final int f9787b;

    /* renamed from: c */
    public final boolean f9788c;

    /* renamed from: d */
    public final int f9789d;

    /* renamed from: e */
    public final long f9790e;

    /* renamed from: f */
    public final long f9791f;

    /* renamed from: fa.s$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: fa.s$b */
    public static final class b extends p094fa.AbstractC2103a0.e.d.c.a {

        /* renamed from: a */
        public java.lang.Double f9792a;

        /* renamed from: b */
        public java.lang.Integer f9793b;

        /* renamed from: c */
        public java.lang.Boolean f9794c;

        /* renamed from: d */
        public java.lang.Integer f9795d;

        /* renamed from: e */
        public java.lang.Long f9796e;

        /* renamed from: f */
        public java.lang.Long f9797f;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public p094fa.AbstractC2103a0.e.d.c m5690a() {
                r12 = this;
                java.lang.Integer r0 = r12.f9793b
                if (r0 != 0) goto L7
                java.lang.String r0 = " batteryVelocity"
                goto L9
            L7:
                java.lang.String r0 = ""
            L9:
                java.lang.Boolean r1 = r12.f9794c
                if (r1 != 0) goto L13
                java.lang.String r1 = " proximityOn"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L13:
                java.lang.Integer r1 = r12.f9795d
                if (r1 != 0) goto L1d
                java.lang.String r1 = " orientation"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L1d:
                java.lang.Long r1 = r12.f9796e
                if (r1 != 0) goto L27
                java.lang.String r1 = " ramUsed"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L27:
                java.lang.Long r1 = r12.f9797f
                if (r1 != 0) goto L31
                java.lang.String r1 = " diskUsed"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L31:
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L5f
                fa.s r0 = new fa.s
                java.lang.Double r3 = r12.f9792a
                java.lang.Integer r1 = r12.f9793b
                int r4 = r1.intValue()
                java.lang.Boolean r1 = r12.f9794c
                boolean r5 = r1.booleanValue()
                java.lang.Integer r1 = r12.f9795d
                int r6 = r1.intValue()
                java.lang.Long r1 = r12.f9796e
                long r7 = r1.longValue()
                java.lang.Long r1 = r12.f9797f
                long r9 = r1.longValue()
                r11 = 0
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7, r9, r11)
                return r0
            L5f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Missing required properties:"
                java.lang.String r0 = p064e.C1493g.m4049a(r2, r0)
                r1.<init>(r0)
                throw r1
        }
    }

    public C2123s(java.lang.Double r1, int r2, boolean r3, int r4, long r5, long r7, p094fa.C2123s.a r9) {
            r0 = this;
            r0.<init>()
            r0.f9786a = r1
            r0.f9787b = r2
            r0.f9788c = r3
            r0.f9789d = r4
            r0.f9790e = r5
            r0.f9791f = r7
            return
    }

    @Override // p094fa.AbstractC2103a0.e.d.c
    /* renamed from: a */
    public java.lang.Double mo5650a() {
            r1 = this;
            java.lang.Double r0 = r1.f9786a
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.c
    /* renamed from: b */
    public int mo5651b() {
            r1 = this;
            int r0 = r1.f9787b
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.c
    /* renamed from: c */
    public long mo5652c() {
            r2 = this;
            long r0 = r2.f9791f
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.c
    /* renamed from: d */
    public int mo5653d() {
            r1 = this;
            int r0 = r1.f9789d
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.c
    /* renamed from: e */
    public long mo5654e() {
            r2 = this;
            long r0 = r2.f9790e
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p094fa.AbstractC2103a0.e.d.c
            r2 = 0
            if (r1 == 0) goto L4f
            fa.a0$e$d$c r8 = (p094fa.AbstractC2103a0.e.d.c) r8
            java.lang.Double r1 = r7.f9786a
            if (r1 != 0) goto L16
            java.lang.Double r1 = r8.mo5650a()
            if (r1 != 0) goto L4d
            goto L20
        L16:
            java.lang.Double r3 = r8.mo5650a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4d
        L20:
            int r1 = r7.f9787b
            int r3 = r8.mo5651b()
            if (r1 != r3) goto L4d
            boolean r1 = r7.f9788c
            boolean r3 = r8.mo5655f()
            if (r1 != r3) goto L4d
            int r1 = r7.f9789d
            int r3 = r8.mo5653d()
            if (r1 != r3) goto L4d
            long r3 = r7.f9790e
            long r5 = r8.mo5654e()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L4d
            long r3 = r7.f9791f
            long r5 = r8.mo5652c()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L4d
            goto L4e
        L4d:
            r0 = 0
        L4e:
            return r0
        L4f:
            return r2
    }

    @Override // p094fa.AbstractC2103a0.e.d.c
    /* renamed from: f */
    public boolean mo5655f() {
            r1 = this;
            boolean r0 = r1.f9788c
            return r0
    }

    public int hashCode() {
            r7 = this;
            java.lang.Double r0 = r7.f9786a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r7.f9787b
            r0 = r0 ^ r2
            int r0 = r0 * r1
            boolean r2 = r7.f9788c
            if (r2 == 0) goto L1c
            r2 = 1231(0x4cf, float:1.725E-42)
            goto L1e
        L1c:
            r2 = 1237(0x4d5, float:1.733E-42)
        L1e:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r7.f9789d
            r0 = r0 ^ r2
            int r0 = r0 * r1
            long r2 = r7.f9790e
            r4 = 32
            long r5 = r2 >>> r4
            long r2 = r2 ^ r5
            int r3 = (int) r2
            r0 = r0 ^ r3
            int r0 = r0 * r1
            long r1 = r7.f9791f
            long r3 = r1 >>> r4
            long r1 = r1 ^ r3
            int r2 = (int) r1
            r0 = r0 ^ r2
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Device{batteryLevel="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Double r1 = r3.f9786a
            r0.append(r1)
            java.lang.String r1 = ", batteryVelocity="
            r0.append(r1)
            int r1 = r3.f9787b
            r0.append(r1)
            java.lang.String r1 = ", proximityOn="
            r0.append(r1)
            boolean r1 = r3.f9788c
            r0.append(r1)
            java.lang.String r1 = ", orientation="
            r0.append(r1)
            int r1 = r3.f9789d
            r0.append(r1)
            java.lang.String r1 = ", ramUsed="
            r0.append(r1)
            long r1 = r3.f9790e
            r0.append(r1)
            java.lang.String r1 = ", diskUsed="
            r0.append(r1)
            long r1 = r3.f9791f
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
