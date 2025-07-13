package p078ef;

/* renamed from: ef.g */
/* loaded from: classes.dex */
public final class C1836g {

    /* renamed from: a */
    public final double f7998a;

    /* renamed from: b */
    public double f7999b;

    public C1836g(double r1, double r3) {
            r0 = this;
            r0.<init>()
            r0.f7998a = r1
            r0.f7999b = r3
            return
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p078ef.C1836g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ef.g r6 = (p078ef.C1836g) r6
            double r3 = r5.f7998a
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.f7998a
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L1f
            return r2
        L1f:
            double r3 = r5.f7999b
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.f7999b
            java.lang.Double r6 = java.lang.Double.valueOf(r3)
            boolean r6 = p214m2.C4339q.m9702c(r1, r6)
            if (r6 != 0) goto L32
            return r2
        L32:
            return r0
    }

    public int hashCode() {
            r7 = this;
            double r0 = r7.f7998a
            long r0 = java.lang.Double.doubleToLongBits(r0)
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            int r1 = r1 * 31
            double r3 = r7.f7999b
            long r3 = java.lang.Double.doubleToLongBits(r3)
            long r5 = r3 >>> r2
            long r2 = r3 ^ r5
            int r0 = (int) r2
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "TotalOrcsLudioUi(orcsToClaim="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            double r1 = r3.f7998a
            r0.append(r1)
            java.lang.String r1 = ", ludioToClaim="
            r0.append(r1)
            double r1 = r3.f7999b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
