package p094fa;

/* renamed from: fa.e */
/* loaded from: classes.dex */
public final class C2109e extends p094fa.AbstractC2103a0.d {

    /* renamed from: a */
    public final p094fa.C2105b0<p094fa.AbstractC2103a0.d.a> f9685a;

    /* renamed from: b */
    public final java.lang.String f9686b;

    /* renamed from: fa.e$a */
    public static /* synthetic */ class a {
    }

    public C2109e(p094fa.C2105b0 r1, java.lang.String r2, p094fa.C2109e.a r3) {
            r0 = this;
            r0.<init>()
            r0.f9685a = r1
            r0.f9686b = r2
            return
    }

    @Override // p094fa.AbstractC2103a0.d
    /* renamed from: a */
    public p094fa.C2105b0<p094fa.AbstractC2103a0.d.a> mo5578a() {
            r1 = this;
            fa.b0<fa.a0$d$a> r0 = r1.f9685a
            return r0
    }

    @Override // p094fa.AbstractC2103a0.d
    /* renamed from: b */
    public java.lang.String mo5579b() {
            r1 = this;
            java.lang.String r0 = r1.f9686b
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p094fa.AbstractC2103a0.d
            r2 = 0
            if (r1 == 0) goto L2b
            fa.a0$d r5 = (p094fa.AbstractC2103a0.d) r5
            fa.b0<fa.a0$d$a> r1 = r4.f9685a
            fa.b0 r3 = r5.mo5578a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L29
            java.lang.String r1 = r4.f9686b
            java.lang.String r5 = r5.mo5579b()
            if (r1 != 0) goto L22
            if (r5 != 0) goto L29
            goto L2a
        L22:
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L29
            goto L2a
        L29:
            r0 = 0
        L2a:
            return r0
        L2b:
            return r2
    }

    public int hashCode() {
            r2 = this;
            fa.b0<fa.a0$d$a> r0 = r2.f9685a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r1 = r2.f9686b
            if (r1 != 0) goto L12
            r1 = 0
            goto L16
        L12:
            int r1 = r1.hashCode()
        L16:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "FilesPayload{files="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            fa.b0<fa.a0$d$a> r1 = r3.f9685a
            r0.append(r1)
            java.lang.String r1 = ", orgId="
            r0.append(r1)
            java.lang.String r1 = r3.f9686b
            java.lang.String r2 = "}"
            java.lang.String r0 = p346u.C6269n.m12888a(r0, r1, r2)
            return r0
    }
}
