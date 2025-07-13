package me;

/* renamed from: me.b */
/* loaded from: classes.dex */
public final class C4594b {
    private final double liquidity1;
    private final double liquidity2;
    private final int pair_id;

    public C4594b(double r1, double r3, int r5) {
            r0 = this;
            r0.<init>()
            r0.liquidity1 = r1
            r0.liquidity2 = r3
            r0.pair_id = r5
            return
    }

    public static /* synthetic */ me.C4594b copy$default(me.C4594b r6, double r7, double r9, int r11, int r12, java.lang.Object r13) {
            r13 = r12 & 1
            if (r13 == 0) goto L6
            double r7 = r6.liquidity1
        L6:
            r1 = r7
            r7 = r12 & 2
            if (r7 == 0) goto Ld
            double r9 = r6.liquidity2
        Ld:
            r3 = r9
            r7 = r12 & 4
            if (r7 == 0) goto L14
            int r11 = r6.pair_id
        L14:
            r5 = r11
            r0 = r6
            me.b r6 = r0.copy(r1, r3, r5)
            return r6
    }

    public final double component1() {
            r2 = this;
            double r0 = r2.liquidity1
            return r0
    }

    public final double component2() {
            r2 = this;
            double r0 = r2.liquidity2
            return r0
    }

    public final int component3() {
            r1 = this;
            int r0 = r1.pair_id
            return r0
    }

    public final me.C4594b copy(double r8, double r10, int r12) {
            r7 = this;
            me.b r6 = new me.b
            r0 = r6
            r1 = r8
            r3 = r10
            r5 = r12
            r0.<init>(r1, r3, r5)
            return r6
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof me.C4594b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            me.b r6 = (me.C4594b) r6
            double r3 = r5.liquidity1
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.liquidity1
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L1f
            return r2
        L1f:
            double r3 = r5.liquidity2
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.liquidity2
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L32
            return r2
        L32:
            int r1 = r5.pair_id
            int r6 = r6.pair_id
            if (r1 == r6) goto L39
            return r2
        L39:
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

    public final int getPair_id() {
            r1 = this;
            int r0 = r1.pair_id
            return r0
    }

    public int hashCode() {
            r7 = this;
            double r0 = r7.liquidity1
            long r0 = java.lang.Double.doubleToLongBits(r0)
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            int r1 = r1 * 31
            double r3 = r7.liquidity2
            long r3 = java.lang.Double.doubleToLongBits(r3)
            long r5 = r3 >>> r2
            long r2 = r3 ^ r5
            int r0 = (int) r2
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r7.pair_id
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "LiquidityResponse(liquidity1="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            double r1 = r3.liquidity1
            r0.append(r1)
            java.lang.String r1 = ", liquidity2="
            r0.append(r1)
            double r1 = r3.liquidity2
            r0.append(r1)
            java.lang.String r1 = ", pair_id="
            r0.append(r1)
            int r1 = r3.pair_id
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
