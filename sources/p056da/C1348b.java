package p056da;

/* renamed from: da.b */
/* loaded from: classes.dex */
public final class C1348b extends p056da.AbstractC1349b0 {

    /* renamed from: a */
    public final p094fa.AbstractC2103a0 f6875a;

    /* renamed from: b */
    public final java.lang.String f6876b;

    public C1348b(p094fa.AbstractC2103a0 r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null report"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f6875a = r2
            java.lang.String r2 = "Null sessionId"
            java.util.Objects.requireNonNull(r3, r2)
            r1.f6876b = r3
            return
    }

    @Override // p056da.AbstractC1349b0
    /* renamed from: a */
    public p094fa.AbstractC2103a0 mo3850a() {
            r1 = this;
            fa.a0 r0 = r1.f6875a
            return r0
    }

    @Override // p056da.AbstractC1349b0
    /* renamed from: b */
    public java.lang.String mo3851b() {
            r1 = this;
            java.lang.String r0 = r1.f6876b
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p056da.AbstractC1349b0
            r2 = 0
            if (r1 == 0) goto L26
            da.b0 r5 = (p056da.AbstractC1349b0) r5
            fa.a0 r1 = r4.f6875a
            fa.a0 r3 = r5.mo3850a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L24
            java.lang.String r1 = r4.f6876b
            java.lang.String r5 = r5.mo3851b()
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
            fa.a0 r0 = r2.f6875a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r1 = r2.f6876b
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "CrashlyticsReportWithSessionId{report="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            fa.a0 r1 = r3.f6875a
            r0.append(r1)
            java.lang.String r1 = ", sessionId="
            r0.append(r1)
            java.lang.String r1 = r3.f6876b
            java.lang.String r2 = "}"
            java.lang.String r0 = p346u.C6269n.m12888a(r0, r1, r2)
            return r0
    }
}
