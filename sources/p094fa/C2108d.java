package p094fa;

/* renamed from: fa.d */
/* loaded from: classes.dex */
public final class C2108d extends p094fa.AbstractC2103a0.c {

    /* renamed from: a */
    public final java.lang.String f9683a;

    /* renamed from: b */
    public final java.lang.String f9684b;

    /* renamed from: fa.d$a */
    public static /* synthetic */ class a {
    }

    public C2108d(java.lang.String r1, java.lang.String r2, p094fa.C2108d.a r3) {
            r0 = this;
            r0.<init>()
            r0.f9683a = r1
            r0.f9684b = r2
            return
    }

    @Override // p094fa.AbstractC2103a0.c
    /* renamed from: a */
    public java.lang.String mo5576a() {
            r1 = this;
            java.lang.String r0 = r1.f9683a
            return r0
    }

    @Override // p094fa.AbstractC2103a0.c
    /* renamed from: b */
    public java.lang.String mo5577b() {
            r1 = this;
            java.lang.String r0 = r1.f9684b
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p094fa.AbstractC2103a0.c
            r2 = 0
            if (r1 == 0) goto L26
            fa.a0$c r5 = (p094fa.AbstractC2103a0.c) r5
            java.lang.String r1 = r4.f9683a
            java.lang.String r3 = r5.mo5576a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L24
            java.lang.String r1 = r4.f9684b
            java.lang.String r5 = r5.mo5577b()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L24
            goto L25
        L24:
            r0 = 0
        L25:
            return r0
        L26:
            return r2
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f9683a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r1 = r2.f9684b
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "CustomAttribute{key="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f9683a
            r0.append(r1)
            java.lang.String r1 = ", value="
            r0.append(r1)
            java.lang.String r1 = r3.f9684b
            java.lang.String r2 = "}"
            java.lang.String r0 = p346u.C6269n.m12888a(r0, r1, r2)
            return r0
    }
}
