package p094fa;

/* renamed from: fa.b */
/* loaded from: classes.dex */
public final class C2104b extends p094fa.AbstractC2103a0 {

    /* renamed from: b */
    public final java.lang.String f9650b;

    /* renamed from: c */
    public final java.lang.String f9651c;

    /* renamed from: d */
    public final int f9652d;

    /* renamed from: e */
    public final java.lang.String f9653e;

    /* renamed from: f */
    public final java.lang.String f9654f;

    /* renamed from: g */
    public final java.lang.String f9655g;

    /* renamed from: h */
    public final p094fa.AbstractC2103a0.e f9656h;

    /* renamed from: i */
    public final p094fa.AbstractC2103a0.d f9657i;

    /* renamed from: fa.b$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: fa.b$b */
    public static final class b extends p094fa.AbstractC2103a0.b {

        /* renamed from: a */
        public java.lang.String f9658a;

        /* renamed from: b */
        public java.lang.String f9659b;

        /* renamed from: c */
        public java.lang.Integer f9660c;

        /* renamed from: d */
        public java.lang.String f9661d;

        /* renamed from: e */
        public java.lang.String f9662e;

        /* renamed from: f */
        public java.lang.String f9663f;

        /* renamed from: g */
        public p094fa.AbstractC2103a0.e f9664g;

        /* renamed from: h */
        public p094fa.AbstractC2103a0.d f9665h;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        public b(p094fa.AbstractC2103a0 r1, p094fa.C2104b.a r2) {
                r0 = this;
                r0.<init>()
                fa.b r1 = (p094fa.C2104b) r1
                java.lang.String r2 = r1.f9650b
                r0.f9658a = r2
                java.lang.String r2 = r1.f9651c
                r0.f9659b = r2
                int r2 = r1.f9652d
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.f9660c = r2
                java.lang.String r2 = r1.f9653e
                r0.f9661d = r2
                java.lang.String r2 = r1.f9654f
                r0.f9662e = r2
                java.lang.String r2 = r1.f9655g
                r0.f9663f = r2
                fa.a0$e r2 = r1.f9656h
                r0.f9664g = r2
                fa.a0$d r1 = r1.f9657i
                r0.f9665h = r1
                return
        }

        @Override // p094fa.AbstractC2103a0.b
        /* renamed from: a */
        public p094fa.AbstractC2103a0 mo5575a() {
                r12 = this;
                java.lang.String r0 = r12.f9658a
                if (r0 != 0) goto L7
                java.lang.String r0 = " sdkVersion"
                goto L9
            L7:
                java.lang.String r0 = ""
            L9:
                java.lang.String r1 = r12.f9659b
                if (r1 != 0) goto L13
                java.lang.String r1 = " gmpAppId"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L13:
                java.lang.Integer r1 = r12.f9660c
                if (r1 != 0) goto L1d
                java.lang.String r1 = " platform"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L1d:
                java.lang.String r1 = r12.f9661d
                if (r1 != 0) goto L27
                java.lang.String r1 = " installationUuid"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L27:
                java.lang.String r1 = r12.f9662e
                if (r1 != 0) goto L31
                java.lang.String r1 = " buildVersion"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L31:
                java.lang.String r1 = r12.f9663f
                if (r1 != 0) goto L3b
                java.lang.String r1 = " displayVersion"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L3b:
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L5d
                fa.b r0 = new fa.b
                java.lang.String r3 = r12.f9658a
                java.lang.String r4 = r12.f9659b
                java.lang.Integer r1 = r12.f9660c
                int r5 = r1.intValue()
                java.lang.String r6 = r12.f9661d
                java.lang.String r7 = r12.f9662e
                java.lang.String r8 = r12.f9663f
                fa.a0$e r9 = r12.f9664g
                fa.a0$d r10 = r12.f9665h
                r11 = 0
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return r0
            L5d:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Missing required properties:"
                java.lang.String r0 = p064e.C1493g.m4049a(r2, r0)
                r1.<init>(r0)
                throw r1
        }
    }

    public C2104b(java.lang.String r1, java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, p094fa.AbstractC2103a0.e r7, p094fa.AbstractC2103a0.d r8, p094fa.C2104b.a r9) {
            r0 = this;
            r0.<init>()
            r0.f9650b = r1
            r0.f9651c = r2
            r0.f9652d = r3
            r0.f9653e = r4
            r0.f9654f = r5
            r0.f9655g = r6
            r0.f9656h = r7
            r0.f9657i = r8
            return
    }

    @Override // p094fa.AbstractC2103a0
    /* renamed from: a */
    public java.lang.String mo5557a() {
            r1 = this;
            java.lang.String r0 = r1.f9654f
            return r0
    }

    @Override // p094fa.AbstractC2103a0
    /* renamed from: b */
    public java.lang.String mo5558b() {
            r1 = this;
            java.lang.String r0 = r1.f9655g
            return r0
    }

    @Override // p094fa.AbstractC2103a0
    /* renamed from: c */
    public java.lang.String mo5559c() {
            r1 = this;
            java.lang.String r0 = r1.f9651c
            return r0
    }

    @Override // p094fa.AbstractC2103a0
    /* renamed from: d */
    public java.lang.String mo5560d() {
            r1 = this;
            java.lang.String r0 = r1.f9653e
            return r0
    }

    @Override // p094fa.AbstractC2103a0
    /* renamed from: e */
    public p094fa.AbstractC2103a0.d mo5561e() {
            r1 = this;
            fa.a0$d r0 = r1.f9657i
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p094fa.AbstractC2103a0
            r2 = 0
            if (r1 == 0) goto L78
            fa.a0 r5 = (p094fa.AbstractC2103a0) r5
            java.lang.String r1 = r4.f9650b
            java.lang.String r3 = r5.mo5563g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L76
            java.lang.String r1 = r4.f9651c
            java.lang.String r3 = r5.mo5559c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L76
            int r1 = r4.f9652d
            int r3 = r5.mo5562f()
            if (r1 != r3) goto L76
            java.lang.String r1 = r4.f9653e
            java.lang.String r3 = r5.mo5560d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L76
            java.lang.String r1 = r4.f9654f
            java.lang.String r3 = r5.mo5557a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L76
            java.lang.String r1 = r4.f9655g
            java.lang.String r3 = r5.mo5558b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L76
            fa.a0$e r1 = r4.f9656h
            if (r1 != 0) goto L5a
            fa.a0$e r1 = r5.mo5564h()
            if (r1 != 0) goto L76
            goto L64
        L5a:
            fa.a0$e r3 = r5.mo5564h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L76
        L64:
            fa.a0$d r1 = r4.f9657i
            fa.a0$d r5 = r5.mo5561e()
            if (r1 != 0) goto L6f
            if (r5 != 0) goto L76
            goto L77
        L6f:
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L76
            goto L77
        L76:
            r0 = 0
        L77:
            return r0
        L78:
            return r2
    }

    @Override // p094fa.AbstractC2103a0
    /* renamed from: f */
    public int mo5562f() {
            r1 = this;
            int r0 = r1.f9652d
            return r0
    }

    @Override // p094fa.AbstractC2103a0
    /* renamed from: g */
    public java.lang.String mo5563g() {
            r1 = this;
            java.lang.String r0 = r1.f9650b
            return r0
    }

    @Override // p094fa.AbstractC2103a0
    /* renamed from: h */
    public p094fa.AbstractC2103a0.e mo5564h() {
            r1 = this;
            fa.a0$e r0 = r1.f9656h
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f9650b
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r4.f9651c
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r4.f9652d
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.f9653e
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.f9654f
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.f9655g
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            fa.a0$e r2 = r4.f9656h
            r3 = 0
            if (r2 != 0) goto L3c
            r2 = 0
            goto L40
        L3c:
            int r2 = r2.hashCode()
        L40:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            fa.a0$d r1 = r4.f9657i
            if (r1 != 0) goto L48
            goto L4c
        L48:
            int r3 = r1.hashCode()
        L4c:
            r0 = r0 ^ r3
            return r0
    }

    @Override // p094fa.AbstractC2103a0
    /* renamed from: i */
    public p094fa.AbstractC2103a0.b mo5565i() {
            r2 = this;
            fa.b$b r0 = new fa.b$b
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "CrashlyticsReport{sdkVersion="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.f9650b
            r0.append(r1)
            java.lang.String r1 = ", gmpAppId="
            r0.append(r1)
            java.lang.String r1 = r2.f9651c
            r0.append(r1)
            java.lang.String r1 = ", platform="
            r0.append(r1)
            int r1 = r2.f9652d
            r0.append(r1)
            java.lang.String r1 = ", installationUuid="
            r0.append(r1)
            java.lang.String r1 = r2.f9653e
            r0.append(r1)
            java.lang.String r1 = ", buildVersion="
            r0.append(r1)
            java.lang.String r1 = r2.f9654f
            r0.append(r1)
            java.lang.String r1 = ", displayVersion="
            r0.append(r1)
            java.lang.String r1 = r2.f9655g
            r0.append(r1)
            java.lang.String r1 = ", session="
            r0.append(r1)
            fa.a0$e r1 = r2.f9656h
            r0.append(r1)
            java.lang.String r1 = ", ndkPayload="
            r0.append(r1)
            fa.a0$d r1 = r2.f9657i
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
