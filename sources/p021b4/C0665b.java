package p021b4;

/* renamed from: b4.b */
/* loaded from: classes.dex */
public final class C0665b extends p021b4.AbstractC0671h {

    /* renamed from: a */
    public final long f3831a;

    /* renamed from: b */
    public final p385w3.AbstractC6787i f3832b;

    /* renamed from: c */
    public final p385w3.AbstractC6784f f3833c;

    public C0665b(long r1, p385w3.AbstractC6787i r3, p385w3.AbstractC6784f r4) {
            r0 = this;
            r0.<init>()
            r0.f3831a = r1
            java.lang.String r1 = "Null transportContext"
            java.util.Objects.requireNonNull(r3, r1)
            r0.f3832b = r3
            java.lang.String r1 = "Null event"
            java.util.Objects.requireNonNull(r4, r1)
            r0.f3833c = r4
            return
    }

    @Override // p021b4.AbstractC0671h
    /* renamed from: a */
    public p385w3.AbstractC6784f mo2221a() {
            r1 = this;
            w3.f r0 = r1.f3833c
            return r0
    }

    @Override // p021b4.AbstractC0671h
    /* renamed from: b */
    public long mo2222b() {
            r2 = this;
            long r0 = r2.f3831a
            return r0
    }

    @Override // p021b4.AbstractC0671h
    /* renamed from: c */
    public p385w3.AbstractC6787i mo2223c() {
            r1 = this;
            w3.i r0 = r1.f3832b
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p021b4.AbstractC0671h
            r2 = 0
            if (r1 == 0) goto L30
            b4.h r8 = (p021b4.AbstractC0671h) r8
            long r3 = r7.f3831a
            long r5 = r8.mo2222b()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L2e
            w3.i r1 = r7.f3832b
            w3.i r3 = r8.mo2223c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2e
            w3.f r1 = r7.f3833c
            w3.f r8 = r8.mo2221a()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L2e
            goto L2f
        L2e:
            r0 = 0
        L2f:
            return r0
        L30:
            return r2
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.f3831a
            r2 = 32
            long r2 = r0 >>> r2
            long r0 = r0 ^ r2
            int r1 = (int) r0
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r0
            int r1 = r1 * r0
            w3.i r2 = r4.f3832b
            int r2 = r2.hashCode()
            r1 = r1 ^ r2
            int r1 = r1 * r0
            w3.f r0 = r4.f3833c
            int r0 = r0.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "PersistedEvent{id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            long r1 = r3.f3831a
            r0.append(r1)
            java.lang.String r1 = ", transportContext="
            r0.append(r1)
            w3.i r1 = r3.f3832b
            r0.append(r1)
            java.lang.String r1 = ", event="
            r0.append(r1)
            w3.f r1 = r3.f3833c
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
