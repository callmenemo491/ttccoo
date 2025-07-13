package p369v3;

/* renamed from: v3.l */
/* loaded from: classes.dex */
public final class C6508l extends p369v3.AbstractC6514r {

    /* renamed from: a */
    public final long f25245a;

    /* renamed from: b */
    public final long f25246b;

    /* renamed from: c */
    public final p369v3.AbstractC6512p f25247c;

    /* renamed from: d */
    public final java.lang.Integer f25248d;

    /* renamed from: e */
    public final java.lang.String f25249e;

    /* renamed from: f */
    public final java.util.List<p369v3.AbstractC6513q> f25250f;

    /* renamed from: g */
    public final p369v3.EnumC6517u f25251g;

    /* renamed from: v3.l$a */
    public static /* synthetic */ class a {
    }

    public C6508l(long r1, long r3, p369v3.AbstractC6512p r5, java.lang.Integer r6, java.lang.String r7, java.util.List r8, p369v3.EnumC6517u r9, p369v3.C6508l.a r10) {
            r0 = this;
            r0.<init>()
            r0.f25245a = r1
            r0.f25246b = r3
            r0.f25247c = r5
            r0.f25248d = r6
            r0.f25249e = r7
            r0.f25250f = r8
            r0.f25251g = r9
            return
    }

    @Override // p369v3.AbstractC6514r
    /* renamed from: a */
    public p369v3.AbstractC6512p mo13230a() {
            r1 = this;
            v3.p r0 = r1.f25247c
            return r0
    }

    @Override // p369v3.AbstractC6514r
    /* renamed from: b */
    public java.util.List<p369v3.AbstractC6513q> mo13231b() {
            r1 = this;
            java.util.List<v3.q> r0 = r1.f25250f
            return r0
    }

    @Override // p369v3.AbstractC6514r
    /* renamed from: c */
    public java.lang.Integer mo13232c() {
            r1 = this;
            java.lang.Integer r0 = r1.f25248d
            return r0
    }

    @Override // p369v3.AbstractC6514r
    /* renamed from: d */
    public java.lang.String mo13233d() {
            r1 = this;
            java.lang.String r0 = r1.f25249e
            return r0
    }

    @Override // p369v3.AbstractC6514r
    /* renamed from: e */
    public p369v3.EnumC6517u mo13234e() {
            r1 = this;
            v3.u r0 = r1.f25251g
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p369v3.AbstractC6514r
            r2 = 0
            if (r1 == 0) goto L87
            v3.r r8 = (p369v3.AbstractC6514r) r8
            long r3 = r7.f25245a
            long r5 = r8.mo13235f()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L85
            long r3 = r7.f25246b
            long r5 = r8.mo13236g()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L85
            v3.p r1 = r7.f25247c
            if (r1 != 0) goto L2a
            v3.p r1 = r8.mo13230a()
            if (r1 != 0) goto L85
            goto L34
        L2a:
            v3.p r3 = r8.mo13230a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L85
        L34:
            java.lang.Integer r1 = r7.f25248d
            if (r1 != 0) goto L3f
            java.lang.Integer r1 = r8.mo13232c()
            if (r1 != 0) goto L85
            goto L49
        L3f:
            java.lang.Integer r3 = r8.mo13232c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L85
        L49:
            java.lang.String r1 = r7.f25249e
            if (r1 != 0) goto L54
            java.lang.String r1 = r8.mo13233d()
            if (r1 != 0) goto L85
            goto L5e
        L54:
            java.lang.String r3 = r8.mo13233d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L85
        L5e:
            java.util.List<v3.q> r1 = r7.f25250f
            if (r1 != 0) goto L69
            java.util.List r1 = r8.mo13231b()
            if (r1 != 0) goto L85
            goto L73
        L69:
            java.util.List r3 = r8.mo13231b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L85
        L73:
            v3.u r1 = r7.f25251g
            v3.u r8 = r8.mo13234e()
            if (r1 != 0) goto L7e
            if (r8 != 0) goto L85
            goto L86
        L7e:
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L85
            goto L86
        L85:
            r0 = 0
        L86:
            return r0
        L87:
            return r2
    }

    @Override // p369v3.AbstractC6514r
    /* renamed from: f */
    public long mo13235f() {
            r2 = this;
            long r0 = r2.f25245a
            return r0
    }

    @Override // p369v3.AbstractC6514r
    /* renamed from: g */
    public long mo13236g() {
            r2 = this;
            long r0 = r2.f25246b
            return r0
    }

    public int hashCode() {
            r7 = this;
            long r0 = r7.f25245a
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r0
            int r1 = r1 * r0
            long r3 = r7.f25246b
            long r5 = r3 >>> r2
            long r2 = r5 ^ r3
            int r3 = (int) r2
            r1 = r1 ^ r3
            int r1 = r1 * r0
            v3.p r2 = r7.f25247c
            r3 = 0
            if (r2 != 0) goto L1f
            r2 = 0
            goto L23
        L1f:
            int r2 = r2.hashCode()
        L23:
            r1 = r1 ^ r2
            int r1 = r1 * r0
            java.lang.Integer r2 = r7.f25248d
            if (r2 != 0) goto L2c
            r2 = 0
            goto L30
        L2c:
            int r2 = r2.hashCode()
        L30:
            r1 = r1 ^ r2
            int r1 = r1 * r0
            java.lang.String r2 = r7.f25249e
            if (r2 != 0) goto L39
            r2 = 0
            goto L3d
        L39:
            int r2 = r2.hashCode()
        L3d:
            r1 = r1 ^ r2
            int r1 = r1 * r0
            java.util.List<v3.q> r2 = r7.f25250f
            if (r2 != 0) goto L46
            r2 = 0
            goto L4a
        L46:
            int r2 = r2.hashCode()
        L4a:
            r1 = r1 ^ r2
            int r1 = r1 * r0
            v3.u r0 = r7.f25251g
            if (r0 != 0) goto L52
            goto L56
        L52:
            int r3 = r0.hashCode()
        L56:
            r0 = r1 ^ r3
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "LogRequest{requestTimeMs="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            long r1 = r3.f25245a
            r0.append(r1)
            java.lang.String r1 = ", requestUptimeMs="
            r0.append(r1)
            long r1 = r3.f25246b
            r0.append(r1)
            java.lang.String r1 = ", clientInfo="
            r0.append(r1)
            v3.p r1 = r3.f25247c
            r0.append(r1)
            java.lang.String r1 = ", logSource="
            r0.append(r1)
            java.lang.Integer r1 = r3.f25248d
            r0.append(r1)
            java.lang.String r1 = ", logSourceName="
            r0.append(r1)
            java.lang.String r1 = r3.f25249e
            r0.append(r1)
            java.lang.String r1 = ", logEvents="
            r0.append(r1)
            java.util.List<v3.q> r1 = r3.f25250f
            r0.append(r1)
            java.lang.String r1 = ", qosTier="
            r0.append(r1)
            v3.u r1 = r3.f25251g
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
