package p094fa;

/* renamed from: fa.x */
/* loaded from: classes.dex */
public final class C2128x extends p094fa.AbstractC2107c0.a {

    /* renamed from: a */
    public final java.lang.String f9807a;

    /* renamed from: b */
    public final java.lang.String f9808b;

    /* renamed from: c */
    public final java.lang.String f9809c;

    /* renamed from: d */
    public final java.lang.String f9810d;

    /* renamed from: e */
    public final int f9811e;

    /* renamed from: f */
    public final java.lang.String f9812f;

    public C2128x(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, java.lang.String r7) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null appIdentifier"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f9807a = r2
            java.lang.String r2 = "Null versionCode"
            java.util.Objects.requireNonNull(r3, r2)
            r1.f9808b = r3
            java.lang.String r2 = "Null versionName"
            java.util.Objects.requireNonNull(r4, r2)
            r1.f9809c = r4
            java.lang.String r2 = "Null installUuid"
            java.util.Objects.requireNonNull(r5, r2)
            r1.f9810d = r5
            r1.f9811e = r6
            r1.f9812f = r7
            return
    }

    @Override // p094fa.AbstractC2107c0.a
    /* renamed from: a */
    public java.lang.String mo5666a() {
            r1 = this;
            java.lang.String r0 = r1.f9807a
            return r0
    }

    @Override // p094fa.AbstractC2107c0.a
    /* renamed from: b */
    public int mo5667b() {
            r1 = this;
            int r0 = r1.f9811e
            return r0
    }

    @Override // p094fa.AbstractC2107c0.a
    /* renamed from: c */
    public java.lang.String mo5668c() {
            r1 = this;
            java.lang.String r0 = r1.f9810d
            return r0
    }

    @Override // p094fa.AbstractC2107c0.a
    /* renamed from: d */
    public java.lang.String mo5669d() {
            r1 = this;
            java.lang.String r0 = r1.f9812f
            return r0
    }

    @Override // p094fa.AbstractC2107c0.a
    /* renamed from: e */
    public java.lang.String mo5670e() {
            r1 = this;
            java.lang.String r0 = r1.f9808b
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p094fa.AbstractC2107c0.a
            r2 = 0
            if (r1 == 0) goto L57
            fa.c0$a r5 = (p094fa.AbstractC2107c0.a) r5
            java.lang.String r1 = r4.f9807a
            java.lang.String r3 = r5.mo5666a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L55
            java.lang.String r1 = r4.f9808b
            java.lang.String r3 = r5.mo5670e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L55
            java.lang.String r1 = r4.f9809c
            java.lang.String r3 = r5.mo5671f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L55
            java.lang.String r1 = r4.f9810d
            java.lang.String r3 = r5.mo5668c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L55
            int r1 = r4.f9811e
            int r3 = r5.mo5667b()
            if (r1 != r3) goto L55
            java.lang.String r1 = r4.f9812f
            java.lang.String r5 = r5.mo5669d()
            if (r1 != 0) goto L4e
            if (r5 != 0) goto L55
            goto L56
        L4e:
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L55
            goto L56
        L55:
            r0 = 0
        L56:
            return r0
        L57:
            return r2
    }

    @Override // p094fa.AbstractC2107c0.a
    /* renamed from: f */
    public java.lang.String mo5671f() {
            r1 = this;
            java.lang.String r0 = r1.f9809c
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f9807a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r3.f9808b
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r3.f9809c
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r2 = r3.f9810d
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.f9811e
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r1 = r3.f9812f
            if (r1 != 0) goto L32
            r1 = 0
            goto L36
        L32:
            int r1 = r1.hashCode()
        L36:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "AppData{appIdentifier="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f9807a
            r0.append(r1)
            java.lang.String r1 = ", versionCode="
            r0.append(r1)
            java.lang.String r1 = r3.f9808b
            r0.append(r1)
            java.lang.String r1 = ", versionName="
            r0.append(r1)
            java.lang.String r1 = r3.f9809c
            r0.append(r1)
            java.lang.String r1 = ", installUuid="
            r0.append(r1)
            java.lang.String r1 = r3.f9810d
            r0.append(r1)
            java.lang.String r1 = ", deliveryMechanism="
            r0.append(r1)
            int r1 = r3.f9811e
            r0.append(r1)
            java.lang.String r1 = ", unityVersion="
            r0.append(r1)
            java.lang.String r1 = r3.f9812f
            java.lang.String r2 = "}"
            java.lang.String r0 = p346u.C6269n.m12888a(r0, r1, r2)
            return r0
    }
}
