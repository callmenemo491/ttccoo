package za;

/* renamed from: za.a */
/* loaded from: classes.dex */
public final class C7265a extends za.AbstractC7268d {

    /* renamed from: b */
    public final java.lang.String f27874b;

    /* renamed from: c */
    public final za.C7267c.a f27875c;

    /* renamed from: d */
    public final java.lang.String f27876d;

    /* renamed from: e */
    public final java.lang.String f27877e;

    /* renamed from: f */
    public final long f27878f;

    /* renamed from: g */
    public final long f27879g;

    /* renamed from: h */
    public final java.lang.String f27880h;

    /* renamed from: za.a$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: za.a$b */
    public static final class b extends za.AbstractC7268d.a {

        /* renamed from: a */
        public java.lang.String f27881a;

        /* renamed from: b */
        public za.C7267c.a f27882b;

        /* renamed from: c */
        public java.lang.String f27883c;

        /* renamed from: d */
        public java.lang.String f27884d;

        /* renamed from: e */
        public java.lang.Long f27885e;

        /* renamed from: f */
        public java.lang.Long f27886f;

        /* renamed from: g */
        public java.lang.String f27887g;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        public b(za.AbstractC7268d r3, za.C7265a.a r4) {
                r2 = this;
                r2.<init>()
                za.a r3 = (za.C7265a) r3
                java.lang.String r4 = r3.f27874b
                r2.f27881a = r4
                za.c$a r4 = r3.f27875c
                r2.f27882b = r4
                java.lang.String r4 = r3.f27876d
                r2.f27883c = r4
                java.lang.String r4 = r3.f27877e
                r2.f27884d = r4
                long r0 = r3.f27878f
                java.lang.Long r4 = java.lang.Long.valueOf(r0)
                r2.f27885e = r4
                long r0 = r3.f27879g
                java.lang.Long r4 = java.lang.Long.valueOf(r0)
                r2.f27886f = r4
                java.lang.String r3 = r3.f27880h
                r2.f27887g = r3
                return
        }

        @Override // za.AbstractC7268d.a
        /* renamed from: a */
        public za.AbstractC7268d mo14350a() {
                r13 = this;
                za.c$a r0 = r13.f27882b
                if (r0 != 0) goto L7
                java.lang.String r0 = " registrationStatus"
                goto L9
            L7:
                java.lang.String r0 = ""
            L9:
                java.lang.Long r1 = r13.f27885e
                if (r1 != 0) goto L13
                java.lang.String r1 = " expiresInSecs"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L13:
                java.lang.Long r1 = r13.f27886f
                if (r1 != 0) goto L1d
                java.lang.String r1 = " tokenCreationEpochInSecs"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L1d:
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L41
                za.a r0 = new za.a
                java.lang.String r3 = r13.f27881a
                za.c$a r4 = r13.f27882b
                java.lang.String r5 = r13.f27883c
                java.lang.String r6 = r13.f27884d
                java.lang.Long r1 = r13.f27885e
                long r7 = r1.longValue()
                java.lang.Long r1 = r13.f27886f
                long r9 = r1.longValue()
                java.lang.String r11 = r13.f27887g
                r12 = 0
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7, r9, r11, r12)
                return r0
            L41:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Missing required properties:"
                java.lang.String r0 = p064e.C1493g.m4049a(r2, r0)
                r1.<init>(r0)
                throw r1
        }

        @Override // za.AbstractC7268d.a
        /* renamed from: b */
        public za.AbstractC7268d.a mo14351b(za.C7267c.a r2) {
                r1 = this;
                java.lang.String r0 = "Null registrationStatus"
                java.util.Objects.requireNonNull(r2, r0)
                r1.f27882b = r2
                return r1
        }

        /* renamed from: c */
        public za.AbstractC7268d.a m14352c(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.f27885e = r1
                return r0
        }

        /* renamed from: d */
        public za.AbstractC7268d.a m14353d(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.f27886f = r1
                return r0
        }
    }

    public C7265a(java.lang.String r1, za.C7267c.a r2, java.lang.String r3, java.lang.String r4, long r5, long r7, java.lang.String r9, za.C7265a.a r10) {
            r0 = this;
            r0.<init>()
            r0.f27874b = r1
            r0.f27875c = r2
            r0.f27876d = r3
            r0.f27877e = r4
            r0.f27878f = r5
            r0.f27879g = r7
            r0.f27880h = r9
            return
    }

    @Override // za.AbstractC7268d
    /* renamed from: a */
    public java.lang.String mo14342a() {
            r1 = this;
            java.lang.String r0 = r1.f27876d
            return r0
    }

    @Override // za.AbstractC7268d
    /* renamed from: b */
    public long mo14343b() {
            r2 = this;
            long r0 = r2.f27878f
            return r0
    }

    @Override // za.AbstractC7268d
    /* renamed from: c */
    public java.lang.String mo14344c() {
            r1 = this;
            java.lang.String r0 = r1.f27874b
            return r0
    }

    @Override // za.AbstractC7268d
    /* renamed from: d */
    public java.lang.String mo14345d() {
            r1 = this;
            java.lang.String r0 = r1.f27880h
            return r0
    }

    @Override // za.AbstractC7268d
    /* renamed from: e */
    public java.lang.String mo14346e() {
            r1 = this;
            java.lang.String r0 = r1.f27877e
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof za.AbstractC7268d
            r2 = 0
            if (r1 == 0) goto L7e
            za.d r8 = (za.AbstractC7268d) r8
            java.lang.String r1 = r7.f27874b
            if (r1 != 0) goto L16
            java.lang.String r1 = r8.mo14344c()
            if (r1 != 0) goto L7c
            goto L20
        L16:
            java.lang.String r3 = r8.mo14344c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L7c
        L20:
            za.c$a r1 = r7.f27875c
            za.c$a r3 = r8.mo14347f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L7c
            java.lang.String r1 = r7.f27876d
            if (r1 != 0) goto L37
            java.lang.String r1 = r8.mo14342a()
            if (r1 != 0) goto L7c
            goto L41
        L37:
            java.lang.String r3 = r8.mo14342a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L7c
        L41:
            java.lang.String r1 = r7.f27877e
            if (r1 != 0) goto L4c
            java.lang.String r1 = r8.mo14346e()
            if (r1 != 0) goto L7c
            goto L56
        L4c:
            java.lang.String r3 = r8.mo14346e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L7c
        L56:
            long r3 = r7.f27878f
            long r5 = r8.mo14343b()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L7c
            long r3 = r7.f27879g
            long r5 = r8.mo14348g()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L7c
            java.lang.String r1 = r7.f27880h
            java.lang.String r8 = r8.mo14345d()
            if (r1 != 0) goto L75
            if (r8 != 0) goto L7c
            goto L7d
        L75:
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L7c
            goto L7d
        L7c:
            r0 = 0
        L7d:
            return r0
        L7e:
            return r2
    }

    @Override // za.AbstractC7268d
    /* renamed from: f */
    public za.C7267c.a mo14347f() {
            r1 = this;
            za.c$a r0 = r1.f27875c
            return r0
    }

    @Override // za.AbstractC7268d
    /* renamed from: g */
    public long mo14348g() {
            r2 = this;
            long r0 = r2.f27879g
            return r0
    }

    public int hashCode() {
            r8 = this;
            java.lang.String r0 = r8.f27874b
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            r2 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r2
            int r0 = r0 * r2
            za.c$a r3 = r8.f27875c
            int r3 = r3.hashCode()
            r0 = r0 ^ r3
            int r0 = r0 * r2
            java.lang.String r3 = r8.f27876d
            if (r3 != 0) goto L20
            r3 = 0
            goto L24
        L20:
            int r3 = r3.hashCode()
        L24:
            r0 = r0 ^ r3
            int r0 = r0 * r2
            java.lang.String r3 = r8.f27877e
            if (r3 != 0) goto L2d
            r3 = 0
            goto L31
        L2d:
            int r3 = r3.hashCode()
        L31:
            r0 = r0 ^ r3
            int r0 = r0 * r2
            long r3 = r8.f27878f
            r5 = 32
            long r6 = r3 >>> r5
            long r3 = r3 ^ r6
            int r4 = (int) r3
            r0 = r0 ^ r4
            int r0 = r0 * r2
            long r3 = r8.f27879g
            long r5 = r3 >>> r5
            long r3 = r3 ^ r5
            int r4 = (int) r3
            r0 = r0 ^ r4
            int r0 = r0 * r2
            java.lang.String r2 = r8.f27880h
            if (r2 != 0) goto L4d
            goto L51
        L4d:
            int r1 = r2.hashCode()
        L51:
            r0 = r0 ^ r1
            return r0
    }

    @Override // za.AbstractC7268d
    /* renamed from: k */
    public za.AbstractC7268d.a mo14349k() {
            r2 = this;
            za.a$b r0 = new za.a$b
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "PersistedInstallationEntry{firebaseInstallationId="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f27874b
            r0.append(r1)
            java.lang.String r1 = ", registrationStatus="
            r0.append(r1)
            za.c$a r1 = r3.f27875c
            r0.append(r1)
            java.lang.String r1 = ", authToken="
            r0.append(r1)
            java.lang.String r1 = r3.f27876d
            r0.append(r1)
            java.lang.String r1 = ", refreshToken="
            r0.append(r1)
            java.lang.String r1 = r3.f27877e
            r0.append(r1)
            java.lang.String r1 = ", expiresInSecs="
            r0.append(r1)
            long r1 = r3.f27878f
            r0.append(r1)
            java.lang.String r1 = ", tokenCreationEpochInSecs="
            r0.append(r1)
            long r1 = r3.f27879g
            r0.append(r1)
            java.lang.String r1 = ", fisError="
            r0.append(r1)
            java.lang.String r1 = r3.f27880h
            java.lang.String r2 = "}"
            java.lang.String r0 = p346u.C6269n.m12888a(r0, r1, r2)
            return r0
    }
}
