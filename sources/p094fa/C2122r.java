package p094fa;

/* renamed from: fa.r */
/* loaded from: classes.dex */
public final class C2122r extends p094fa.AbstractC2103a0.e.d.a.b.AbstractC7386d.AbstractC7387a {

    /* renamed from: a */
    public final long f9776a;

    /* renamed from: b */
    public final java.lang.String f9777b;

    /* renamed from: c */
    public final java.lang.String f9778c;

    /* renamed from: d */
    public final long f9779d;

    /* renamed from: e */
    public final int f9780e;

    /* renamed from: fa.r$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: fa.r$b */
    public static final class b extends p094fa.AbstractC2103a0.e.d.a.b.AbstractC7386d.AbstractC7387a.AbstractC7388a {

        /* renamed from: a */
        public java.lang.Long f9781a;

        /* renamed from: b */
        public java.lang.String f9782b;

        /* renamed from: c */
        public java.lang.String f9783c;

        /* renamed from: d */
        public java.lang.Long f9784d;

        /* renamed from: e */
        public java.lang.Integer f9785e;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public p094fa.AbstractC2103a0.e.d.a.b.AbstractC7386d.AbstractC7387a m5689a() {
                r11 = this;
                java.lang.Long r0 = r11.f9781a
                if (r0 != 0) goto L7
                java.lang.String r0 = " pc"
                goto L9
            L7:
                java.lang.String r0 = ""
            L9:
                java.lang.String r1 = r11.f9782b
                if (r1 != 0) goto L13
                java.lang.String r1 = " symbol"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L13:
                java.lang.Long r1 = r11.f9784d
                if (r1 != 0) goto L1d
                java.lang.String r1 = " offset"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L1d:
                java.lang.Integer r1 = r11.f9785e
                if (r1 != 0) goto L27
                java.lang.String r1 = " importance"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L27:
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L4b
                fa.r r0 = new fa.r
                java.lang.Long r1 = r11.f9781a
                long r3 = r1.longValue()
                java.lang.String r5 = r11.f9782b
                java.lang.String r6 = r11.f9783c
                java.lang.Long r1 = r11.f9784d
                long r7 = r1.longValue()
                java.lang.Integer r1 = r11.f9785e
                int r9 = r1.intValue()
                r10 = 0
                r2 = r0
                r2.<init>(r3, r5, r6, r7, r9, r10)
                return r0
            L4b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Missing required properties:"
                java.lang.String r0 = p064e.C1493g.m4049a(r2, r0)
                r1.<init>(r0)
                throw r1
        }
    }

    public C2122r(long r1, java.lang.String r3, java.lang.String r4, long r5, int r7, p094fa.C2122r.a r8) {
            r0 = this;
            r0.<init>()
            r0.f9776a = r1
            r0.f9777b = r3
            r0.f9778c = r4
            r0.f9779d = r5
            r0.f9780e = r7
            return
    }

    @Override // p094fa.AbstractC2103a0.e.d.a.b.AbstractC7386d.AbstractC7387a
    /* renamed from: a */
    public java.lang.String mo5644a() {
            r1 = this;
            java.lang.String r0 = r1.f9778c
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.a.b.AbstractC7386d.AbstractC7387a
    /* renamed from: b */
    public int mo5645b() {
            r1 = this;
            int r0 = r1.f9780e
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.a.b.AbstractC7386d.AbstractC7387a
    /* renamed from: c */
    public long mo5646c() {
            r2 = this;
            long r0 = r2.f9779d
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.a.b.AbstractC7386d.AbstractC7387a
    /* renamed from: d */
    public long mo5647d() {
            r2 = this;
            long r0 = r2.f9776a
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.a.b.AbstractC7386d.AbstractC7387a
    /* renamed from: e */
    public java.lang.String mo5648e() {
            r1 = this;
            java.lang.String r0 = r1.f9777b
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p094fa.AbstractC2103a0.e.d.a.b.AbstractC7386d.AbstractC7387a
            r2 = 0
            if (r1 == 0) goto L4b
            fa.a0$e$d$a$b$d$a r8 = (p094fa.AbstractC2103a0.e.d.a.b.AbstractC7386d.AbstractC7387a) r8
            long r3 = r7.f9776a
            long r5 = r8.mo5647d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L49
            java.lang.String r1 = r7.f9777b
            java.lang.String r3 = r8.mo5648e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L49
            java.lang.String r1 = r7.f9778c
            if (r1 != 0) goto L2c
            java.lang.String r1 = r8.mo5644a()
            if (r1 != 0) goto L49
            goto L36
        L2c:
            java.lang.String r3 = r8.mo5644a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L49
        L36:
            long r3 = r7.f9779d
            long r5 = r8.mo5646c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L49
            int r1 = r7.f9780e
            int r8 = r8.mo5645b()
            if (r1 != r8) goto L49
            goto L4a
        L49:
            r0 = 0
        L4a:
            return r0
        L4b:
            return r2
    }

    public int hashCode() {
            r7 = this;
            long r0 = r7.f9776a
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r0
            int r1 = r1 * r0
            java.lang.String r3 = r7.f9777b
            int r3 = r3.hashCode()
            r1 = r1 ^ r3
            int r1 = r1 * r0
            java.lang.String r3 = r7.f9778c
            if (r3 != 0) goto L1d
            r3 = 0
            goto L21
        L1d:
            int r3 = r3.hashCode()
        L21:
            r1 = r1 ^ r3
            int r1 = r1 * r0
            long r3 = r7.f9779d
            long r5 = r3 >>> r2
            long r2 = r5 ^ r3
            int r3 = (int) r2
            r1 = r1 ^ r3
            int r1 = r1 * r0
            int r0 = r7.f9780e
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Frame{pc="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            long r1 = r3.f9776a
            r0.append(r1)
            java.lang.String r1 = ", symbol="
            r0.append(r1)
            java.lang.String r1 = r3.f9777b
            r0.append(r1)
            java.lang.String r1 = ", file="
            r0.append(r1)
            java.lang.String r1 = r3.f9778c
            r0.append(r1)
            java.lang.String r1 = ", offset="
            r0.append(r1)
            long r1 = r3.f9779d
            r0.append(r1)
            java.lang.String r1 = ", importance="
            r0.append(r1)
            int r1 = r3.f9780e
            java.lang.String r2 = "}"
            java.lang.String r0 = p381w.C6764e.m13690a(r0, r1, r2)
            return r0
    }
}
