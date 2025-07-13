package p021b4;

/* renamed from: b4.a */
/* loaded from: classes.dex */
public final class C0664a extends p021b4.AbstractC0667d {

    /* renamed from: b */
    public final long f3826b;

    /* renamed from: c */
    public final int f3827c;

    /* renamed from: d */
    public final int f3828d;

    /* renamed from: e */
    public final long f3829e;

    /* renamed from: f */
    public final int f3830f;

    /* renamed from: b4.a$a */
    public static /* synthetic */ class a {
    }

    public C0664a(long r1, int r3, int r4, long r5, int r7, p021b4.C0664a.a r8) {
            r0 = this;
            r0.<init>()
            r0.f3826b = r1
            r0.f3827c = r3
            r0.f3828d = r4
            r0.f3829e = r5
            r0.f3830f = r7
            return
    }

    @Override // p021b4.AbstractC0667d
    /* renamed from: a */
    public int mo2216a() {
            r1 = this;
            int r0 = r1.f3828d
            return r0
    }

    @Override // p021b4.AbstractC0667d
    /* renamed from: b */
    public long mo2217b() {
            r2 = this;
            long r0 = r2.f3829e
            return r0
    }

    @Override // p021b4.AbstractC0667d
    /* renamed from: c */
    public int mo2218c() {
            r1 = this;
            int r0 = r1.f3827c
            return r0
    }

    @Override // p021b4.AbstractC0667d
    /* renamed from: d */
    public int mo2219d() {
            r1 = this;
            int r0 = r1.f3830f
            return r0
    }

    @Override // p021b4.AbstractC0667d
    /* renamed from: e */
    public long mo2220e() {
            r2 = this;
            long r0 = r2.f3826b
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p021b4.AbstractC0667d
            r2 = 0
            if (r1 == 0) goto L3a
            b4.d r8 = (p021b4.AbstractC0667d) r8
            long r3 = r7.f3826b
            long r5 = r8.mo2220e()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L38
            int r1 = r7.f3827c
            int r3 = r8.mo2218c()
            if (r1 != r3) goto L38
            int r1 = r7.f3828d
            int r3 = r8.mo2216a()
            if (r1 != r3) goto L38
            long r3 = r7.f3829e
            long r5 = r8.mo2217b()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L38
            int r1 = r7.f3830f
            int r8 = r8.mo2219d()
            if (r1 != r8) goto L38
            goto L39
        L38:
            r0 = 0
        L39:
            return r0
        L3a:
            return r2
    }

    public int hashCode() {
            r7 = this;
            long r0 = r7.f3826b
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r0
            int r1 = r1 * r0
            int r3 = r7.f3827c
            r1 = r1 ^ r3
            int r1 = r1 * r0
            int r3 = r7.f3828d
            r1 = r1 ^ r3
            int r1 = r1 * r0
            long r3 = r7.f3829e
            long r5 = r3 >>> r2
            long r2 = r5 ^ r3
            int r3 = (int) r2
            r1 = r1 ^ r3
            int r1 = r1 * r0
            int r0 = r7.f3830f
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "EventStoreConfig{maxStorageSizeInBytes="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            long r1 = r3.f3826b
            r0.append(r1)
            java.lang.String r1 = ", loadBatchSize="
            r0.append(r1)
            int r1 = r3.f3827c
            r0.append(r1)
            java.lang.String r1 = ", criticalSectionEnterTimeoutMs="
            r0.append(r1)
            int r1 = r3.f3828d
            r0.append(r1)
            java.lang.String r1 = ", eventCleanUpAge="
            r0.append(r1)
            long r1 = r3.f3829e
            r0.append(r1)
            java.lang.String r1 = ", maxBlobByteSizePerRow="
            r0.append(r1)
            int r1 = r3.f3830f
            java.lang.String r2 = "}"
            java.lang.String r0 = p381w.C6764e.m13690a(r0, r1, r2)
            return r0
    }
}
