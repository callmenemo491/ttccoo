package p369v3;

/* renamed from: v3.k */
/* loaded from: classes.dex */
public final class C6507k extends p369v3.AbstractC6513q {

    /* renamed from: a */
    public final long f25231a;

    /* renamed from: b */
    public final java.lang.Integer f25232b;

    /* renamed from: c */
    public final long f25233c;

    /* renamed from: d */
    public final byte[] f25234d;

    /* renamed from: e */
    public final java.lang.String f25235e;

    /* renamed from: f */
    public final long f25236f;

    /* renamed from: g */
    public final p369v3.AbstractC6516t f25237g;

    /* renamed from: v3.k$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: v3.k$b */
    public static final class b extends p369v3.AbstractC6513q.a {

        /* renamed from: a */
        public java.lang.Long f25238a;

        /* renamed from: b */
        public java.lang.Integer f25239b;

        /* renamed from: c */
        public java.lang.Long f25240c;

        /* renamed from: d */
        public byte[] f25241d;

        /* renamed from: e */
        public java.lang.String f25242e;

        /* renamed from: f */
        public java.lang.Long f25243f;

        /* renamed from: g */
        public p369v3.AbstractC6516t f25244g;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public C6507k(long r1, java.lang.Integer r3, long r4, byte[] r6, java.lang.String r7, long r8, p369v3.AbstractC6516t r10, p369v3.C6507k.a r11) {
            r0 = this;
            r0.<init>()
            r0.f25231a = r1
            r0.f25232b = r3
            r0.f25233c = r4
            r0.f25234d = r6
            r0.f25235e = r7
            r0.f25236f = r8
            r0.f25237g = r10
            return
    }

    @Override // p369v3.AbstractC6513q
    /* renamed from: a */
    public java.lang.Integer mo13223a() {
            r1 = this;
            java.lang.Integer r0 = r1.f25232b
            return r0
    }

    @Override // p369v3.AbstractC6513q
    /* renamed from: b */
    public long mo13224b() {
            r2 = this;
            long r0 = r2.f25231a
            return r0
    }

    @Override // p369v3.AbstractC6513q
    /* renamed from: c */
    public long mo13225c() {
            r2 = this;
            long r0 = r2.f25233c
            return r0
    }

    @Override // p369v3.AbstractC6513q
    /* renamed from: d */
    public p369v3.AbstractC6516t mo13226d() {
            r1 = this;
            v3.t r0 = r1.f25237g
            return r0
    }

    @Override // p369v3.AbstractC6513q
    /* renamed from: e */
    public byte[] mo13227e() {
            r1 = this;
            byte[] r0 = r1.f25234d
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p369v3.AbstractC6513q
            r2 = 0
            if (r1 == 0) goto L7d
            v3.q r8 = (p369v3.AbstractC6513q) r8
            long r3 = r7.f25231a
            long r5 = r8.mo13224b()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L7b
            java.lang.Integer r1 = r7.f25232b
            if (r1 != 0) goto L20
            java.lang.Integer r1 = r8.mo13223a()
            if (r1 != 0) goto L7b
            goto L2a
        L20:
            java.lang.Integer r3 = r8.mo13223a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L7b
        L2a:
            long r3 = r7.f25233c
            long r5 = r8.mo13225c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L7b
            byte[] r1 = r7.f25234d
            boolean r3 = r8 instanceof p369v3.C6507k
            if (r3 == 0) goto L40
            r3 = r8
            v3.k r3 = (p369v3.C6507k) r3
            byte[] r3 = r3.f25234d
            goto L44
        L40:
            byte[] r3 = r8.mo13227e()
        L44:
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L7b
            java.lang.String r1 = r7.f25235e
            if (r1 != 0) goto L55
            java.lang.String r1 = r8.mo13228f()
            if (r1 != 0) goto L7b
            goto L5f
        L55:
            java.lang.String r3 = r8.mo13228f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L7b
        L5f:
            long r3 = r7.f25236f
            long r5 = r8.mo13229g()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L7b
            v3.t r1 = r7.f25237g
            v3.t r8 = r8.mo13226d()
            if (r1 != 0) goto L74
            if (r8 != 0) goto L7b
            goto L7c
        L74:
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L7b
            goto L7c
        L7b:
            r0 = 0
        L7c:
            return r0
        L7d:
            return r2
    }

    @Override // p369v3.AbstractC6513q
    /* renamed from: f */
    public java.lang.String mo13228f() {
            r1 = this;
            java.lang.String r0 = r1.f25235e
            return r0
    }

    @Override // p369v3.AbstractC6513q
    /* renamed from: g */
    public long mo13229g() {
            r2 = this;
            long r0 = r2.f25236f
            return r0
    }

    public int hashCode() {
            r9 = this;
            long r0 = r9.f25231a
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r0
            int r1 = r1 * r0
            java.lang.Integer r3 = r9.f25232b
            r4 = 0
            if (r3 != 0) goto L15
            r3 = 0
            goto L19
        L15:
            int r3 = r3.hashCode()
        L19:
            r1 = r1 ^ r3
            int r1 = r1 * r0
            long r5 = r9.f25233c
            long r7 = r5 >>> r2
            long r5 = r5 ^ r7
            int r3 = (int) r5
            r1 = r1 ^ r3
            int r1 = r1 * r0
            byte[] r3 = r9.f25234d
            int r3 = java.util.Arrays.hashCode(r3)
            r1 = r1 ^ r3
            int r1 = r1 * r0
            java.lang.String r3 = r9.f25235e
            if (r3 != 0) goto L34
            r3 = 0
            goto L38
        L34:
            int r3 = r3.hashCode()
        L38:
            r1 = r1 ^ r3
            int r1 = r1 * r0
            long r5 = r9.f25236f
            long r2 = r5 >>> r2
            long r2 = r2 ^ r5
            int r3 = (int) r2
            r1 = r1 ^ r3
            int r1 = r1 * r0
            v3.t r0 = r9.f25237g
            if (r0 != 0) goto L49
            goto L4d
        L49:
            int r4 = r0.hashCode()
        L4d:
            r0 = r1 ^ r4
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "LogEvent{eventTimeMs="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            long r1 = r3.f25231a
            r0.append(r1)
            java.lang.String r1 = ", eventCode="
            r0.append(r1)
            java.lang.Integer r1 = r3.f25232b
            r0.append(r1)
            java.lang.String r1 = ", eventUptimeMs="
            r0.append(r1)
            long r1 = r3.f25233c
            r0.append(r1)
            java.lang.String r1 = ", sourceExtension="
            r0.append(r1)
            byte[] r1 = r3.f25234d
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = ", sourceExtensionJsonProto3="
            r0.append(r1)
            java.lang.String r1 = r3.f25235e
            r0.append(r1)
            java.lang.String r1 = ", timezoneOffsetSeconds="
            r0.append(r1)
            long r1 = r3.f25236f
            r0.append(r1)
            java.lang.String r1 = ", networkConnectionInfo="
            r0.append(r1)
            v3.t r1 = r3.f25237g
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
