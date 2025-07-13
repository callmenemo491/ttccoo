package p012ab;

/* renamed from: ab.b */
/* loaded from: classes.dex */
public final class C0050b extends p012ab.AbstractC0054f {

    /* renamed from: a */
    public final java.lang.String f107a;

    /* renamed from: b */
    public final long f108b;

    /* renamed from: c */
    public final p012ab.AbstractC0054f.b f109c;

    /* renamed from: ab.b$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: ab.b$b */
    public static final class b extends p012ab.AbstractC0054f.a {

        /* renamed from: a */
        public java.lang.String f110a;

        /* renamed from: b */
        public java.lang.Long f111b;

        /* renamed from: c */
        public p012ab.AbstractC0054f.b f112c;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p012ab.AbstractC0054f.a
        /* renamed from: a */
        public p012ab.AbstractC0054f mo64a() {
                r8 = this;
                java.lang.Long r0 = r8.f111b
                if (r0 != 0) goto L7
                java.lang.String r0 = " tokenExpirationTimestamp"
                goto L9
            L7:
                java.lang.String r0 = ""
            L9:
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L21
                ab.b r0 = new ab.b
                java.lang.String r3 = r8.f110a
                java.lang.Long r1 = r8.f111b
                long r4 = r1.longValue()
                ab.f$b r6 = r8.f112c
                r7 = 0
                r2 = r0
                r2.<init>(r3, r4, r6, r7)
                return r0
            L21:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Missing required properties:"
                java.lang.String r0 = p064e.C1493g.m4049a(r2, r0)
                r1.<init>(r0)
                throw r1
        }

        @Override // p012ab.AbstractC0054f.a
        /* renamed from: b */
        public p012ab.AbstractC0054f.a mo65b(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.f111b = r1
                return r0
        }
    }

    public C0050b(java.lang.String r1, long r2, p012ab.AbstractC0054f.b r4, p012ab.C0050b.a r5) {
            r0 = this;
            r0.<init>()
            r0.f107a = r1
            r0.f108b = r2
            r0.f109c = r4
            return
    }

    @Override // p012ab.AbstractC0054f
    /* renamed from: b */
    public p012ab.AbstractC0054f.b mo61b() {
            r1 = this;
            ab.f$b r0 = r1.f109c
            return r0
    }

    @Override // p012ab.AbstractC0054f
    /* renamed from: c */
    public java.lang.String mo62c() {
            r1 = this;
            java.lang.String r0 = r1.f107a
            return r0
    }

    @Override // p012ab.AbstractC0054f
    /* renamed from: d */
    public long mo63d() {
            r2 = this;
            long r0 = r2.f108b
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p012ab.AbstractC0054f
            r2 = 0
            if (r1 == 0) goto L3e
            ab.f r8 = (p012ab.AbstractC0054f) r8
            java.lang.String r1 = r7.f107a
            if (r1 != 0) goto L16
            java.lang.String r1 = r8.mo62c()
            if (r1 != 0) goto L3c
            goto L20
        L16:
            java.lang.String r3 = r8.mo62c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3c
        L20:
            long r3 = r7.f108b
            long r5 = r8.mo63d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L3c
            ab.f$b r1 = r7.f109c
            ab.f$b r8 = r8.mo61b()
            if (r1 != 0) goto L35
            if (r8 != 0) goto L3c
            goto L3d
        L35:
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L3c
            goto L3d
        L3c:
            r0 = 0
        L3d:
            return r0
        L3e:
            return r2
    }

    public int hashCode() {
            r7 = this;
            java.lang.String r0 = r7.f107a
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
            long r3 = r7.f108b
            r5 = 32
            long r5 = r3 >>> r5
            long r3 = r3 ^ r5
            int r4 = (int) r3
            r0 = r0 ^ r4
            int r0 = r0 * r2
            ab.f$b r2 = r7.f109c
            if (r2 != 0) goto L21
            goto L25
        L21:
            int r1 = r2.hashCode()
        L25:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "TokenResult{token="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f107a
            r0.append(r1)
            java.lang.String r1 = ", tokenExpirationTimestamp="
            r0.append(r1)
            long r1 = r3.f108b
            r0.append(r1)
            java.lang.String r1 = ", responseCode="
            r0.append(r1)
            ab.f$b r1 = r3.f109c
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
