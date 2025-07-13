package me;

/* renamed from: me.c */
/* loaded from: classes.dex */
public final class C4595c implements java.io.Serializable {
    private final me.C4593a data;
    private final double liquidity1;
    private final double liquidity2;
    private final int precision;
    private final double totalMySupplyAmount;

    public C4595c(me.C4593a r2, double r3, int r5, double r6, double r8) {
            r1 = this;
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.data = r2
            r1.totalMySupplyAmount = r3
            r1.precision = r5
            r1.liquidity1 = r6
            r1.liquidity2 = r8
            return
    }

    public static /* synthetic */ me.C4595c copy$default(me.C4595c r9, me.C4593a r10, double r11, int r13, double r14, double r16, int r18, java.lang.Object r19) {
            r0 = r9
            r1 = r18 & 1
            if (r1 == 0) goto L8
            me.a r1 = r0.data
            goto L9
        L8:
            r1 = r10
        L9:
            r2 = r18 & 2
            if (r2 == 0) goto L10
            double r2 = r0.totalMySupplyAmount
            goto L11
        L10:
            r2 = r11
        L11:
            r4 = r18 & 4
            if (r4 == 0) goto L18
            int r4 = r0.precision
            goto L19
        L18:
            r4 = r13
        L19:
            r5 = r18 & 8
            if (r5 == 0) goto L20
            double r5 = r0.liquidity1
            goto L21
        L20:
            r5 = r14
        L21:
            r7 = r18 & 16
            if (r7 == 0) goto L28
            double r7 = r0.liquidity2
            goto L2a
        L28:
            r7 = r16
        L2a:
            r10 = r1
            r11 = r2
            r13 = r4
            r14 = r5
            r16 = r7
            me.c r0 = r9.copy(r10, r11, r13, r14, r16)
            return r0
    }

    private final java.lang.String getEarning(double r3, double r5, double r7) {
            r2 = this;
            r0 = 100
            double r0 = (double) r0
            double r3 = r3 / r0
            double r3 = r3 * r5
            double r3 = r3 - r7
            r5 = 6
            r6 = 0
            r7 = 2
            java.lang.String r3 = vg.C6672m.m13535v(r3, r5, r6, r7)
            return r3
    }

    public final me.C4593a component1() {
            r1 = this;
            me.a r0 = r1.data
            return r0
    }

    public final double component2() {
            r2 = this;
            double r0 = r2.totalMySupplyAmount
            return r0
    }

    public final int component3() {
            r1 = this;
            int r0 = r1.precision
            return r0
    }

    public final double component4() {
            r2 = this;
            double r0 = r2.liquidity1
            return r0
    }

    public final double component5() {
            r2 = this;
            double r0 = r2.liquidity2
            return r0
    }

    public final me.C4595c copy(me.C4593a r11, double r12, int r14, double r15, double r17) {
            r10 = this;
            java.lang.String r0 = "data"
            r2 = r11
            p214m2.C4339q.m9706k(r11, r0)
            me.c r0 = new me.c
            r1 = r0
            r3 = r12
            r5 = r14
            r6 = r15
            r8 = r17
            r1.<init>(r2, r3, r5, r6, r8)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof me.C4595c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            me.c r6 = (me.C4595c) r6
            me.a r1 = r5.data
            me.a r3 = r6.data
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            double r3 = r5.totalMySupplyAmount
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.totalMySupplyAmount
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2a
            return r2
        L2a:
            int r1 = r5.precision
            int r3 = r6.precision
            if (r1 == r3) goto L31
            return r2
        L31:
            double r3 = r5.liquidity1
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.liquidity1
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L44
            return r2
        L44:
            double r3 = r5.liquidity2
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.liquidity2
            java.lang.Double r6 = java.lang.Double.valueOf(r3)
            boolean r6 = p214m2.C4339q.m9702c(r1, r6)
            if (r6 != 0) goto L57
            return r2
        L57:
            return r0
    }

    public final me.C4593a getData() {
            r1 = this;
            me.a r0 = r1.data
            return r0
    }

    public final java.lang.String getEarning1() {
            r7 = this;
            double r1 = r7.getShare()
            me.a r0 = r7.data
            double r3 = r0.getPool1SupplyAmount()
            double r5 = r7.liquidity1
            r0 = r7
            java.lang.String r0 = r0.getEarning(r1, r3, r5)
            return r0
    }

    public final java.lang.String getEarning2() {
            r7 = this;
            double r1 = r7.getShare()
            me.a r0 = r7.data
            double r3 = r0.getPool2SupplyAmount()
            double r5 = r7.liquidity2
            r0 = r7
            java.lang.String r0 = r0.getEarning(r1, r3, r5)
            return r0
    }

    public final double getLiquidity1() {
            r2 = this;
            double r0 = r2.liquidity1
            return r0
    }

    public final double getLiquidity2() {
            r2 = this;
            double r0 = r2.liquidity2
            return r0
    }

    public final int getPrecision() {
            r1 = this;
            int r0 = r1.precision
            return r0
    }

    public final double getShare() {
            r4 = this;
            double r0 = r4.totalMySupplyAmount
            me.a r2 = r4.data
            double r2 = r2.getTotalSupplyAmount()
            double r0 = r0 / r2
            r2 = 100
            double r2 = (double) r2
            double r0 = r0 * r2
            return r0
    }

    public final double getTotalMySupplyAmount() {
            r2 = this;
            double r0 = r2.totalMySupplyAmount
            return r0
    }

    public int hashCode() {
            r6 = this;
            me.a r0 = r6.data
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            double r1 = r6.totalMySupplyAmount
            long r1 = java.lang.Double.doubleToLongBits(r1)
            r3 = 32
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r6.precision
            int r0 = r0 + r1
            int r0 = r0 * 31
            double r1 = r6.liquidity1
            long r1 = java.lang.Double.doubleToLongBits(r1)
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            double r1 = r6.liquidity2
            long r1 = java.lang.Double.doubleToLongBits(r1)
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "PoolDataWithMy(data="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            me.a r1 = r3.data
            r0.append(r1)
            java.lang.String r1 = ", totalMySupplyAmount="
            r0.append(r1)
            double r1 = r3.totalMySupplyAmount
            r0.append(r1)
            java.lang.String r1 = ", precision="
            r0.append(r1)
            int r1 = r3.precision
            r0.append(r1)
            java.lang.String r1 = ", liquidity1="
            r0.append(r1)
            double r1 = r3.liquidity1
            r0.append(r1)
            java.lang.String r1 = ", liquidity2="
            r0.append(r1)
            double r1 = r3.liquidity2
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
