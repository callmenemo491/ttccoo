package je;

/* renamed from: je.a */
/* loaded from: classes.dex */
public final class C3579a implements java.io.Serializable {

    /* renamed from: Y */
    public final java.lang.String f15690Y;

    /* renamed from: Z */
    public final int f15691Z;

    /* renamed from: a0 */
    public final java.lang.String f15692a0;

    /* renamed from: b0 */
    public final double f15693b0;

    public C3579a(java.lang.String r2, int r3, java.lang.String r4, double r5) {
            r1 = this;
            java.lang.String r0 = "symbol"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "contract"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.f15690Y = r2
            r1.f15691Z = r3
            r1.f15692a0 = r4
            r1.f15693b0 = r5
            return
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof je.C3579a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            je.a r6 = (je.C3579a) r6
            java.lang.String r1 = r5.f15690Y
            java.lang.String r3 = r6.f15690Y
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r5.f15691Z
            int r3 = r6.f15691Z
            if (r1 == r3) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r5.f15692a0
            java.lang.String r3 = r6.f15692a0
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            double r3 = r5.f15693b0
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.f15693b0
            java.lang.Double r6 = java.lang.Double.valueOf(r3)
            boolean r6 = p214m2.C4339q.m9702c(r1, r6)
            if (r6 != 0) goto L3c
            return r2
        L3c:
            return r0
    }

    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.f15690Y
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r5.f15691Z
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r5.f15692a0
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            double r1 = r5.f15693b0
            long r1 = java.lang.Double.doubleToLongBits(r1)
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "MarketConversion(symbol="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f15690Y
            r0.append(r1)
            java.lang.String r1 = ", precision="
            r0.append(r1)
            int r1 = r3.f15691Z
            r0.append(r1)
            java.lang.String r1 = ", contract="
            r0.append(r1)
            java.lang.String r1 = r3.f15692a0
            r0.append(r1)
            java.lang.String r1 = ", rate="
            r0.append(r1)
            double r1 = r3.f15693b0
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
