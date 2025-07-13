package p094fa;

/* renamed from: fa.f */
/* loaded from: classes.dex */
public final class C2110f extends p094fa.AbstractC2103a0.d.a {

    /* renamed from: a */
    public final java.lang.String f9687a;

    /* renamed from: b */
    public final byte[] f9688b;

    /* renamed from: fa.f$a */
    public static /* synthetic */ class a {
    }

    public C2110f(java.lang.String r1, byte[] r2, p094fa.C2110f.a r3) {
            r0 = this;
            r0.<init>()
            r0.f9687a = r1
            r0.f9688b = r2
            return
    }

    @Override // p094fa.AbstractC2103a0.d.a
    /* renamed from: a */
    public byte[] mo5580a() {
            r1 = this;
            byte[] r0 = r1.f9688b
            return r0
    }

    @Override // p094fa.AbstractC2103a0.d.a
    /* renamed from: b */
    public java.lang.String mo5581b() {
            r1 = this;
            java.lang.String r0 = r1.f9687a
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p094fa.AbstractC2103a0.d.a
            r2 = 0
            if (r1 == 0) goto L2f
            fa.a0$d$a r5 = (p094fa.AbstractC2103a0.d.a) r5
            java.lang.String r1 = r4.f9687a
            java.lang.String r3 = r5.mo5581b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2d
            byte[] r1 = r4.f9688b
            boolean r3 = r5 instanceof p094fa.C2110f
            if (r3 == 0) goto L22
            fa.f r5 = (p094fa.C2110f) r5
            byte[] r5 = r5.f9688b
            goto L26
        L22:
            byte[] r5 = r5.mo5580a()
        L26:
            boolean r5 = java.util.Arrays.equals(r1, r5)
            if (r5 == 0) goto L2d
            goto L2e
        L2d:
            r0 = 0
        L2e:
            return r0
        L2f:
            return r2
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f9687a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            byte[] r1 = r2.f9688b
            int r1 = java.util.Arrays.hashCode(r1)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "File{filename="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.f9687a
            r0.append(r1)
            java.lang.String r1 = ", contents="
            r0.append(r1)
            byte[] r1 = r2.f9688b
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
