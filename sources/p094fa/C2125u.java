package p094fa;

/* renamed from: fa.u */
/* loaded from: classes.dex */
public final class C2125u extends p094fa.AbstractC2103a0.e.AbstractC7390e {

    /* renamed from: a */
    public final int f9799a;

    /* renamed from: b */
    public final java.lang.String f9800b;

    /* renamed from: c */
    public final java.lang.String f9801c;

    /* renamed from: d */
    public final boolean f9802d;

    /* renamed from: fa.u$a */
    public static /* synthetic */ class a {
    }

    public C2125u(int r1, java.lang.String r2, java.lang.String r3, boolean r4, p094fa.C2125u.a r5) {
            r0 = this;
            r0.<init>()
            r0.f9799a = r1
            r0.f9800b = r2
            r0.f9801c = r3
            r0.f9802d = r4
            return
    }

    @Override // p094fa.AbstractC2103a0.e.AbstractC7390e
    /* renamed from: a */
    public java.lang.String mo5657a() {
            r1 = this;
            java.lang.String r0 = r1.f9801c
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.AbstractC7390e
    /* renamed from: b */
    public int mo5658b() {
            r1 = this;
            int r0 = r1.f9799a
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.AbstractC7390e
    /* renamed from: c */
    public java.lang.String mo5659c() {
            r1 = this;
            java.lang.String r0 = r1.f9800b
            return r0
    }

    @Override // p094fa.AbstractC2103a0.e.AbstractC7390e
    /* renamed from: d */
    public boolean mo5660d() {
            r1 = this;
            boolean r0 = r1.f9802d
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p094fa.AbstractC2103a0.e.AbstractC7390e
            r2 = 0
            if (r1 == 0) goto L36
            fa.a0$e$e r5 = (p094fa.AbstractC2103a0.e.AbstractC7390e) r5
            int r1 = r4.f9799a
            int r3 = r5.mo5658b()
            if (r1 != r3) goto L34
            java.lang.String r1 = r4.f9800b
            java.lang.String r3 = r5.mo5659c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L34
            java.lang.String r1 = r4.f9801c
            java.lang.String r3 = r5.mo5657a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L34
            boolean r1 = r4.f9802d
            boolean r5 = r5.mo5660d()
            if (r1 != r5) goto L34
            goto L35
        L34:
            r0 = 0
        L35:
            return r0
        L36:
            return r2
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.f9799a
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r3.f9800b
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r3.f9801c
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            boolean r1 = r3.f9802d
            if (r1 == 0) goto L21
            r1 = 1231(0x4cf, float:1.725E-42)
            goto L23
        L21:
            r1 = 1237(0x4d5, float:1.733E-42)
        L23:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "OperatingSystem{platform="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r2.f9799a
            r0.append(r1)
            java.lang.String r1 = ", version="
            r0.append(r1)
            java.lang.String r1 = r2.f9800b
            r0.append(r1)
            java.lang.String r1 = ", buildVersion="
            r0.append(r1)
            java.lang.String r1 = r2.f9801c
            r0.append(r1)
            java.lang.String r1 = ", jailbroken="
            r0.append(r1)
            boolean r1 = r2.f9802d
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
