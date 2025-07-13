package p385w3;

/* renamed from: w3.a */
/* loaded from: classes.dex */
public final class C6779a extends p385w3.AbstractC6784f {

    /* renamed from: a */
    public final java.lang.String f26306a;

    /* renamed from: b */
    public final java.lang.Integer f26307b;

    /* renamed from: c */
    public final p385w3.C6783e f26308c;

    /* renamed from: d */
    public final long f26309d;

    /* renamed from: e */
    public final long f26310e;

    /* renamed from: f */
    public final java.util.Map<java.lang.String, java.lang.String> f26311f;

    /* renamed from: w3.a$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: w3.a$b */
    public static final class b extends p385w3.AbstractC6784f.a {

        /* renamed from: a */
        public java.lang.String f26312a;

        /* renamed from: b */
        public java.lang.Integer f26313b;

        /* renamed from: c */
        public p385w3.C6783e f26314c;

        /* renamed from: d */
        public java.lang.Long f26315d;

        /* renamed from: e */
        public java.lang.Long f26316e;

        /* renamed from: f */
        public java.util.Map<java.lang.String, java.lang.String> f26317f;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p385w3.AbstractC6784f.a
        /* renamed from: b */
        public p385w3.AbstractC6784f mo13792b() {
                r12 = this;
                java.lang.String r0 = r12.f26312a
                if (r0 != 0) goto L7
                java.lang.String r0 = " transportName"
                goto L9
            L7:
                java.lang.String r0 = ""
            L9:
                w3.e r1 = r12.f26314c
                if (r1 != 0) goto L13
                java.lang.String r1 = " encodedPayload"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L13:
                java.lang.Long r1 = r12.f26315d
                if (r1 != 0) goto L1d
                java.lang.String r1 = " eventMillis"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L1d:
                java.lang.Long r1 = r12.f26316e
                if (r1 != 0) goto L27
                java.lang.String r1 = " uptimeMillis"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L27:
                java.util.Map<java.lang.String, java.lang.String> r1 = r12.f26317f
                if (r1 != 0) goto L31
                java.lang.String r1 = " autoMetadata"
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r1)
            L31:
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L53
                w3.a r0 = new w3.a
                java.lang.String r3 = r12.f26312a
                java.lang.Integer r4 = r12.f26313b
                w3.e r5 = r12.f26314c
                java.lang.Long r1 = r12.f26315d
                long r6 = r1.longValue()
                java.lang.Long r1 = r12.f26316e
                long r8 = r1.longValue()
                java.util.Map<java.lang.String, java.lang.String> r10 = r12.f26317f
                r11 = 0
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r8, r10, r11)
                return r0
            L53:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Missing required properties:"
                java.lang.String r0 = p064e.C1493g.m4049a(r2, r0)
                r1.<init>(r0)
                throw r1
        }

        @Override // p385w3.AbstractC6784f.a
        /* renamed from: c */
        public java.util.Map<java.lang.String, java.lang.String> mo13793c() {
                r2 = this;
                java.util.Map<java.lang.String, java.lang.String> r0 = r2.f26317f
                if (r0 == 0) goto L5
                return r0
            L5:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Property \"autoMetadata\" has not been set"
                r0.<init>(r1)
                throw r0
        }

        /* renamed from: d */
        public p385w3.AbstractC6784f.a m13794d(p385w3.C6783e r2) {
                r1 = this;
                java.lang.String r0 = "Null encodedPayload"
                java.util.Objects.requireNonNull(r2, r0)
                r1.f26314c = r2
                return r1
        }

        /* renamed from: e */
        public p385w3.AbstractC6784f.a m13795e(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.f26315d = r1
                return r0
        }

        /* renamed from: f */
        public p385w3.AbstractC6784f.a m13796f(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "Null transportName"
                java.util.Objects.requireNonNull(r2, r0)
                r1.f26312a = r2
                return r1
        }

        /* renamed from: g */
        public p385w3.AbstractC6784f.a m13797g(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.f26316e = r1
                return r0
        }
    }

    public C6779a(java.lang.String r1, java.lang.Integer r2, p385w3.C6783e r3, long r4, long r6, java.util.Map r8, p385w3.C6779a.a r9) {
            r0 = this;
            r0.<init>()
            r0.f26306a = r1
            r0.f26307b = r2
            r0.f26308c = r3
            r0.f26309d = r4
            r0.f26310e = r6
            r0.f26311f = r8
            return
    }

    @Override // p385w3.AbstractC6784f
    /* renamed from: b */
    public java.util.Map<java.lang.String, java.lang.String> mo13786b() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f26311f
            return r0
    }

    @Override // p385w3.AbstractC6784f
    /* renamed from: c */
    public java.lang.Integer mo13787c() {
            r1 = this;
            java.lang.Integer r0 = r1.f26307b
            return r0
    }

    @Override // p385w3.AbstractC6784f
    /* renamed from: d */
    public p385w3.C6783e mo13788d() {
            r1 = this;
            w3.e r0 = r1.f26308c
            return r0
    }

    @Override // p385w3.AbstractC6784f
    /* renamed from: e */
    public long mo13789e() {
            r2 = this;
            long r0 = r2.f26309d
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p385w3.AbstractC6784f
            r2 = 0
            if (r1 == 0) goto L5b
            w3.f r8 = (p385w3.AbstractC6784f) r8
            java.lang.String r1 = r7.f26306a
            java.lang.String r3 = r8.mo13790g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L59
            java.lang.Integer r1 = r7.f26307b
            if (r1 != 0) goto L22
            java.lang.Integer r1 = r8.mo13787c()
            if (r1 != 0) goto L59
            goto L2c
        L22:
            java.lang.Integer r3 = r8.mo13787c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L59
        L2c:
            w3.e r1 = r7.f26308c
            w3.e r3 = r8.mo13788d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L59
            long r3 = r7.f26309d
            long r5 = r8.mo13789e()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L59
            long r3 = r7.f26310e
            long r5 = r8.mo13791h()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L59
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.f26311f
            java.util.Map r8 = r8.mo13786b()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L59
            goto L5a
        L59:
            r0 = 0
        L5a:
            return r0
        L5b:
            return r2
    }

    @Override // p385w3.AbstractC6784f
    /* renamed from: g */
    public java.lang.String mo13790g() {
            r1 = this;
            java.lang.String r0 = r1.f26306a
            return r0
    }

    @Override // p385w3.AbstractC6784f
    /* renamed from: h */
    public long mo13791h() {
            r2 = this;
            long r0 = r2.f26310e
            return r0
    }

    public int hashCode() {
            r7 = this;
            java.lang.String r0 = r7.f26306a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.Integer r2 = r7.f26307b
            if (r2 != 0) goto L12
            r2 = 0
            goto L16
        L12:
            int r2 = r2.hashCode()
        L16:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            w3.e r2 = r7.f26308c
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            long r2 = r7.f26309d
            r4 = 32
            long r5 = r2 >>> r4
            long r2 = r2 ^ r5
            int r3 = (int) r2
            r0 = r0 ^ r3
            int r0 = r0 * r1
            long r2 = r7.f26310e
            long r4 = r2 >>> r4
            long r2 = r2 ^ r4
            int r3 = (int) r2
            r0 = r0 ^ r3
            int r0 = r0 * r1
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.f26311f
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "EventInternal{transportName="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f26306a
            r0.append(r1)
            java.lang.String r1 = ", code="
            r0.append(r1)
            java.lang.Integer r1 = r3.f26307b
            r0.append(r1)
            java.lang.String r1 = ", encodedPayload="
            r0.append(r1)
            w3.e r1 = r3.f26308c
            r0.append(r1)
            java.lang.String r1 = ", eventMillis="
            r0.append(r1)
            long r1 = r3.f26309d
            r0.append(r1)
            java.lang.String r1 = ", uptimeMillis="
            r0.append(r1)
            long r1 = r3.f26310e
            r0.append(r1)
            java.lang.String r1 = ", autoMetadata="
            r0.append(r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.f26311f
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
