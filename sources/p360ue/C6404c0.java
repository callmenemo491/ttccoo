package p360ue;

/* renamed from: ue.c0 */
/* loaded from: classes.dex */
public final class C6404c0 implements java.io.Serializable {

    /* renamed from: Y */
    public final java.lang.String f24937Y;

    /* renamed from: Z */
    public final java.lang.String f24938Z;

    /* renamed from: a0 */
    public final java.lang.String f24939a0;

    /* renamed from: b0 */
    public final java.lang.String f24940b0;

    /* renamed from: c0 */
    public final java.lang.String f24941c0;

    /* renamed from: d0 */
    public final java.lang.String f24942d0;

    /* renamed from: e0 */
    public final int f24943e0;

    /* renamed from: f0 */
    public final int f24944f0;

    /* renamed from: g0 */
    public final double f24945g0;

    /* renamed from: h0 */
    public final long f24946h0;

    public C6404c0(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8, int r9, double r10, long r12) {
            r1 = this;
            java.lang.String r0 = "assets_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "template_id"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "rarity"
            p214m2.C4339q.m9706k(r6, r0)
            java.lang.String r0 = "slotId"
            p214m2.C4339q.m9706k(r7, r0)
            r1.<init>()
            r1.f24937Y = r2
            r1.f24938Z = r3
            r1.f24939a0 = r4
            r1.f24940b0 = r5
            r1.f24941c0 = r6
            r1.f24942d0 = r7
            r1.f24943e0 = r8
            r1.f24944f0 = r9
            r1.f24945g0 = r10
            r1.f24946h0 = r12
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p360ue.C6404c0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ue.c0 r8 = (p360ue.C6404c0) r8
            java.lang.String r1 = r7.f24937Y
            java.lang.String r3 = r8.f24937Y
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.f24938Z
            java.lang.String r3 = r8.f24938Z
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r7.f24939a0
            java.lang.String r3 = r8.f24939a0
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r7.f24940b0
            java.lang.String r3 = r8.f24940b0
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r7.f24941c0
            java.lang.String r3 = r8.f24941c0
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r1 = r7.f24942d0
            java.lang.String r3 = r8.f24942d0
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            int r1 = r7.f24943e0
            int r3 = r8.f24943e0
            if (r1 == r3) goto L55
            return r2
        L55:
            int r1 = r7.f24944f0
            int r3 = r8.f24944f0
            if (r1 == r3) goto L5c
            return r2
        L5c:
            double r3 = r7.f24945g0
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r8.f24945g0
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L6f
            return r2
        L6f:
            long r3 = r7.f24946h0
            long r5 = r8.f24946h0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L78
            return r2
        L78:
            return r0
    }

    public int hashCode() {
            r6 = this;
            java.lang.String r0 = r6.f24937Y
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r6.f24938Z
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r6.f24939a0
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r6.f24940b0
            if (r1 != 0) goto L1c
            r1 = 0
            goto L20
        L1c:
            int r1 = r1.hashCode()
        L20:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r6.f24941c0
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r6.f24942d0
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            int r1 = r6.f24943e0
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.f24944f0
            int r0 = r0 + r1
            int r0 = r0 * 31
            double r1 = r6.f24945g0
            long r1 = java.lang.Double.doubleToLongBits(r1)
            r3 = 32
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r6.f24946h0
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "BrawlerUI(assets_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f24937Y
            r0.append(r1)
            java.lang.String r1 = ", template_id="
            r0.append(r1)
            java.lang.String r1 = r3.f24938Z
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r3.f24939a0
            r0.append(r1)
            java.lang.String r1 = ", imageURL="
            r0.append(r1)
            java.lang.String r1 = r3.f24940b0
            r0.append(r1)
            java.lang.String r1 = ", rarity="
            r0.append(r1)
            java.lang.String r1 = r3.f24941c0
            r0.append(r1)
            java.lang.String r1 = ", slotId="
            r0.append(r1)
            java.lang.String r1 = r3.f24942d0
            r0.append(r1)
            java.lang.String r1 = ", health="
            r0.append(r1)
            int r1 = r3.f24943e0
            r0.append(r1)
            java.lang.String r1 = ", max_health="
            r0.append(r1)
            int r1 = r3.f24944f0
            r0.append(r1)
            java.lang.String r1 = ", health_cost="
            r0.append(r1)
            double r1 = r3.f24945g0
            r0.append(r1)
            java.lang.String r1 = ", available="
            r0.append(r1)
            long r1 = r3.f24946h0
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
