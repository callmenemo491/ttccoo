package p094fa;

/* renamed from: fa.h */
/* loaded from: classes.dex */
public final class C2112h extends p094fa.AbstractC2103a0.e.a {

    /* renamed from: a */
    public final java.lang.String f9711a;

    /* renamed from: b */
    public final java.lang.String f9712b;

    /* renamed from: c */
    public final java.lang.String f9713c;

    /* renamed from: d */
    public final p094fa.AbstractC2103a0.e.a.AbstractC7382a f9714d;

    /* renamed from: e */
    public final java.lang.String f9715e;

    /* renamed from: f */
    public final java.lang.String f9716f;

    /* renamed from: g */
    public final java.lang.String f9717g;

    /* renamed from: fa.h$a */
    public static /* synthetic */ class a {
    }

    public C2112h(java.lang.String r1, java.lang.String r2, java.lang.String r3, p094fa.AbstractC2103a0.e.a.AbstractC7382a r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, p094fa.C2112h.a r8) {
            r0 = this;
            r0.<init>()
            r0.f9711a = r1
            r0.f9712b = r2
            r0.f9713c = r3
            r1 = 0
            r0.f9714d = r1
            r0.f9715e = r5
            r0.f9716f = r6
            r0.f9717g = r7
            return
    }

    @Override // p094fa.AbstractC2103a0.e.a
    /* renamed from: a */
    public java.lang.String mo5594a() {
            r1 = this;
            java.lang.String r0 = r1.f9716f
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.a
    /* renamed from: b */
    public java.lang.String mo5595b() {
            r1 = this;
            java.lang.String r0 = r1.f9717g
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.a
    /* renamed from: c */
    public java.lang.String mo5596c() {
            r1 = this;
            java.lang.String r0 = r1.f9713c
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.a
    /* renamed from: d */
    public java.lang.String mo5597d() {
            r1 = this;
            java.lang.String r0 = r1.f9711a
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.a
    /* renamed from: e */
    public java.lang.String mo5598e() {
            r1 = this;
            java.lang.String r0 = r1.f9715e
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p094fa.AbstractC2103a0.e.a
            r2 = 0
            if (r1 == 0) goto L8b
            fa.a0$e$a r5 = (p094fa.AbstractC2103a0.e.a) r5
            java.lang.String r1 = r4.f9711a
            java.lang.String r3 = r5.mo5597d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
            java.lang.String r1 = r4.f9712b
            java.lang.String r3 = r5.mo5600g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
            java.lang.String r1 = r4.f9713c
            if (r1 != 0) goto L2e
            java.lang.String r1 = r5.mo5596c()
            if (r1 != 0) goto L89
            goto L38
        L2e:
            java.lang.String r3 = r5.mo5596c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
        L38:
            fa.a0$e$a$a r1 = r4.f9714d
            if (r1 != 0) goto L43
            fa.a0$e$a$a r1 = r5.mo5599f()
            if (r1 != 0) goto L89
            goto L4d
        L43:
            fa.a0$e$a$a r3 = r5.mo5599f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
        L4d:
            java.lang.String r1 = r4.f9715e
            if (r1 != 0) goto L58
            java.lang.String r1 = r5.mo5598e()
            if (r1 != 0) goto L89
            goto L62
        L58:
            java.lang.String r3 = r5.mo5598e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
        L62:
            java.lang.String r1 = r4.f9716f
            if (r1 != 0) goto L6d
            java.lang.String r1 = r5.mo5594a()
            if (r1 != 0) goto L89
            goto L77
        L6d:
            java.lang.String r3 = r5.mo5594a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
        L77:
            java.lang.String r1 = r4.f9717g
            java.lang.String r5 = r5.mo5595b()
            if (r1 != 0) goto L82
            if (r5 != 0) goto L89
            goto L8a
        L82:
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L89
            goto L8a
        L89:
            r0 = 0
        L8a:
            return r0
        L8b:
            return r2
    }

    @Override // p094fa.AbstractC2103a0.e.a
    /* renamed from: f */
    public p094fa.AbstractC2103a0.e.a.AbstractC7382a mo5599f() {
            r1 = this;
            fa.a0$e$a$a r0 = r1.f9714d
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.a
    /* renamed from: g */
    public java.lang.String mo5600g() {
            r1 = this;
            java.lang.String r0 = r1.f9712b
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f9711a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r4.f9712b
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.f9713c
            r3 = 0
            if (r2 != 0) goto L1c
            r2 = 0
            goto L20
        L1c:
            int r2 = r2.hashCode()
        L20:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            fa.a0$e$a$a r2 = r4.f9714d
            if (r2 != 0) goto L29
            r2 = 0
            goto L2d
        L29:
            int r2 = r2.hashCode()
        L2d:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.f9715e
            if (r2 != 0) goto L36
            r2 = 0
            goto L3a
        L36:
            int r2 = r2.hashCode()
        L3a:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.f9716f
            if (r2 != 0) goto L43
            r2 = 0
            goto L47
        L43:
            int r2 = r2.hashCode()
        L47:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r1 = r4.f9717g
            if (r1 != 0) goto L4f
            goto L53
        L4f:
            int r3 = r1.hashCode()
        L53:
            r0 = r0 ^ r3
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Application{identifier="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f9711a
            r0.append(r1)
            java.lang.String r1 = ", version="
            r0.append(r1)
            java.lang.String r1 = r3.f9712b
            r0.append(r1)
            java.lang.String r1 = ", displayVersion="
            r0.append(r1)
            java.lang.String r1 = r3.f9713c
            r0.append(r1)
            java.lang.String r1 = ", organization="
            r0.append(r1)
            fa.a0$e$a$a r1 = r3.f9714d
            r0.append(r1)
            java.lang.String r1 = ", installationUuid="
            r0.append(r1)
            java.lang.String r1 = r3.f9715e
            r0.append(r1)
            java.lang.String r1 = ", developmentPlatform="
            r0.append(r1)
            java.lang.String r1 = r3.f9716f
            r0.append(r1)
            java.lang.String r1 = ", developmentPlatformVersion="
            r0.append(r1)
            java.lang.String r1 = r3.f9717g
            java.lang.String r2 = "}"
            java.lang.String r0 = p346u.C6269n.m12888a(r0, r1, r2)
            return r0
    }
}
