package p094fa;

/* renamed from: fa.p */
/* loaded from: classes.dex */
public final class C2120p extends p094fa.AbstractC2103a0.e.d.a.b.c {

    /* renamed from: a */
    public final java.lang.String f9770a;

    /* renamed from: b */
    public final java.lang.String f9771b;

    /* renamed from: c */
    public final long f9772c;

    /* renamed from: fa.p$a */
    public static /* synthetic */ class a {
    }

    public C2120p(java.lang.String r1, java.lang.String r2, long r3, p094fa.C2120p.a r5) {
            r0 = this;
            r0.<init>()
            r0.f9770a = r1
            r0.f9771b = r2
            r0.f9772c = r3
            return
    }

    @Override // p094fa.AbstractC2103a0.e.d.a.b.c
    /* renamed from: a */
    public long mo5638a() {
            r2 = this;
            long r0 = r2.f9772c
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.a.b.c
    /* renamed from: b */
    public java.lang.String mo5639b() {
            r1 = this;
            java.lang.String r0 = r1.f9771b
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.d.a.b.c
    /* renamed from: c */
    public java.lang.String mo5640c() {
            r1 = this;
            java.lang.String r0 = r1.f9770a
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p094fa.AbstractC2103a0.e.d.a.b.c
            r2 = 0
            if (r1 == 0) goto L30
            fa.a0$e$d$a$b$c r8 = (p094fa.AbstractC2103a0.e.d.a.b.c) r8
            java.lang.String r1 = r7.f9770a
            java.lang.String r3 = r8.mo5640c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2e
            java.lang.String r1 = r7.f9771b
            java.lang.String r3 = r8.mo5639b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2e
            long r3 = r7.f9772c
            long r5 = r8.mo5638a()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L2e
            goto L2f
        L2e:
            r0 = 0
        L2f:
            return r0
        L30:
            return r2
    }

    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.f9770a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r5.f9771b
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            long r1 = r5.f9772c
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            r0 = r0 ^ r2
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Signal{name="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f9770a
            r0.append(r1)
            java.lang.String r1 = ", code="
            r0.append(r1)
            java.lang.String r1 = r3.f9771b
            r0.append(r1)
            java.lang.String r1 = ", address="
            r0.append(r1)
            long r1 = r3.f9772c
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
