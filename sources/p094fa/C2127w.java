package p094fa;

/* renamed from: fa.w */
/* loaded from: classes.dex */
public final class C2127w extends p094fa.AbstractC2107c0 {

    /* renamed from: a */
    public final p094fa.AbstractC2107c0.a f9804a;

    /* renamed from: b */
    public final p094fa.AbstractC2107c0.c f9805b;

    /* renamed from: c */
    public final p094fa.AbstractC2107c0.b f9806c;

    public C2127w(p094fa.AbstractC2107c0.a r2, p094fa.AbstractC2107c0.c r3, p094fa.AbstractC2107c0.b r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null appData"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f9804a = r2
            java.lang.String r2 = "Null osData"
            java.util.Objects.requireNonNull(r3, r2)
            r1.f9805b = r3
            java.lang.String r2 = "Null deviceData"
            java.util.Objects.requireNonNull(r4, r2)
            r1.f9806c = r4
            return
    }

    @Override // p094fa.AbstractC2107c0
    /* renamed from: a */
    public p094fa.AbstractC2107c0.a mo5663a() {
            r1 = this;
            fa.c0$a r0 = r1.f9804a
            return r0
    }

    @Override // p094fa.AbstractC2107c0
    /* renamed from: b */
    public p094fa.AbstractC2107c0.b mo5664b() {
            r1 = this;
            fa.c0$b r0 = r1.f9806c
            return r0
    }

    @Override // p094fa.AbstractC2107c0
    /* renamed from: c */
    public p094fa.AbstractC2107c0.c mo5665c() {
            r1 = this;
            fa.c0$c r0 = r1.f9805b
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p094fa.AbstractC2107c0
            r2 = 0
            if (r1 == 0) goto L32
            fa.c0 r5 = (p094fa.AbstractC2107c0) r5
            fa.c0$a r1 = r4.f9804a
            fa.c0$a r3 = r5.mo5663a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L30
            fa.c0$c r1 = r4.f9805b
            fa.c0$c r3 = r5.mo5665c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L30
            fa.c0$b r1 = r4.f9806c
            fa.c0$b r5 = r5.mo5664b()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L30
            goto L31
        L30:
            r0 = 0
        L31:
            return r0
        L32:
            return r2
    }

    public int hashCode() {
            r3 = this;
            fa.c0$a r0 = r3.f9804a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            fa.c0$c r2 = r3.f9805b
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            fa.c0$b r1 = r3.f9806c
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "StaticSessionData{appData="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            fa.c0$a r1 = r2.f9804a
            r0.append(r1)
            java.lang.String r1 = ", osData="
            r0.append(r1)
            fa.c0$c r1 = r2.f9805b
            r0.append(r1)
            java.lang.String r1 = ", deviceData="
            r0.append(r1)
            fa.c0$b r1 = r2.f9806c
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
