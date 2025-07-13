package je;

/* renamed from: je.l */
/* loaded from: classes.dex */
public final class C3590l implements java.io.Serializable {

    /* renamed from: Y */
    public final java.lang.String f15725Y;

    /* renamed from: Z */
    public final java.lang.String f15726Z;

    /* renamed from: a0 */
    public final java.lang.String f15727a0;

    /* renamed from: b0 */
    public final java.lang.String f15728b0;

    /* renamed from: c0 */
    public final double f15729c0;

    /* renamed from: d0 */
    public final je.EnumC3580b f15730d0;

    public C3590l(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, double r6, je.EnumC3580b r8) {
            r1 = this;
            java.lang.String r0 = "from"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "to"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "fromContract"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "toContract"
            p214m2.C4339q.m9706k(r5, r0)
            r1.<init>()
            r1.f15725Y = r2
            r1.f15726Z = r3
            r1.f15727a0 = r4
            r1.f15728b0 = r5
            r1.f15729c0 = r6
            r1.f15730d0 = r8
            return
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof je.C3590l
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            je.l r6 = (je.C3590l) r6
            java.lang.String r1 = r5.f15725Y
            java.lang.String r3 = r6.f15725Y
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r5.f15726Z
            java.lang.String r3 = r6.f15726Z
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r5.f15727a0
            java.lang.String r3 = r6.f15727a0
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r5.f15728b0
            java.lang.String r3 = r6.f15728b0
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            double r3 = r5.f15729c0
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.f15729c0
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L4b
            return r2
        L4b:
            je.b r1 = r5.f15730d0
            je.b r6 = r6.f15730d0
            if (r1 == r6) goto L52
            return r2
        L52:
            return r0
    }

    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.f15725Y
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r5.f15726Z
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r5.f15727a0
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r5.f15728b0
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            double r1 = r5.f15729c0
            long r1 = java.lang.Double.doubleToLongBits(r1)
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            je.b r1 = r5.f15730d0
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "TradeElement(from="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f15725Y
            r0.append(r1)
            java.lang.String r1 = ", to="
            r0.append(r1)
            java.lang.String r1 = r3.f15726Z
            r0.append(r1)
            java.lang.String r1 = ", fromContract="
            r0.append(r1)
            java.lang.String r1 = r3.f15727a0
            r0.append(r1)
            java.lang.String r1 = ", toContract="
            r0.append(r1)
            java.lang.String r1 = r3.f15728b0
            r0.append(r1)
            java.lang.String r1 = ", rate="
            r0.append(r1)
            double r1 = r3.f15729c0
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            je.b r1 = r3.f15730d0
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
