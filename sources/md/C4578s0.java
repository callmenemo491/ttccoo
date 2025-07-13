package md;

/* renamed from: md.s0 */
/* loaded from: classes.dex */
public final class C4578s0 {
    private final java.lang.String CPUBoostPerAsset;
    private final java.lang.String boostLimit;
    private final java.lang.String depositAsset;
    private final double durationInMinutes;
    private final java.lang.String ownerContract;

    public C4578s0(java.lang.String r2, java.lang.String r3, java.lang.String r4, double r5, java.lang.String r7) {
            r1 = this;
            java.lang.String r0 = "CPUBoostPerAsset"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "boostLimit"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "depositAsset"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "ownerContract"
            p214m2.C4339q.m9706k(r7, r0)
            r1.<init>()
            r1.CPUBoostPerAsset = r2
            r1.boostLimit = r3
            r1.depositAsset = r4
            r1.durationInMinutes = r5
            r1.ownerContract = r7
            return
    }

    public static /* synthetic */ md.C4578s0 copy$default(md.C4578s0 r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, double r8, java.lang.String r10, int r11, java.lang.Object r12) {
            r12 = r11 & 1
            if (r12 == 0) goto L6
            java.lang.String r5 = r4.CPUBoostPerAsset
        L6:
            r12 = r11 & 2
            if (r12 == 0) goto Lc
            java.lang.String r6 = r4.boostLimit
        Lc:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L13
            java.lang.String r7 = r4.depositAsset
        L13:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L1a
            double r8 = r4.durationInMinutes
        L1a:
            r1 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L21
            java.lang.String r10 = r4.ownerContract
        L21:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r12 = r3
            md.s0 r4 = r6.copy(r7, r8, r9, r10, r12)
            return r4
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.CPUBoostPerAsset
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.boostLimit
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.depositAsset
            return r0
    }

    public final double component4() {
            r2 = this;
            double r0 = r2.durationInMinutes
            return r0
    }

    public final java.lang.String component5() {
            r1 = this;
            java.lang.String r0 = r1.ownerContract
            return r0
    }

    public final md.C4578s0 copy(java.lang.String r9, java.lang.String r10, java.lang.String r11, double r12, java.lang.String r14) {
            r8 = this;
            java.lang.String r0 = "CPUBoostPerAsset"
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "boostLimit"
            p214m2.C4339q.m9706k(r10, r0)
            java.lang.String r0 = "depositAsset"
            p214m2.C4339q.m9706k(r11, r0)
            java.lang.String r0 = "ownerContract"
            p214m2.C4339q.m9706k(r14, r0)
            md.s0 r0 = new md.s0
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r7)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof md.C4578s0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            md.s0 r6 = (md.C4578s0) r6
            java.lang.String r1 = r5.CPUBoostPerAsset
            java.lang.String r3 = r6.CPUBoostPerAsset
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r5.boostLimit
            java.lang.String r3 = r6.boostLimit
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r5.depositAsset
            java.lang.String r3 = r6.depositAsset
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            double r3 = r5.durationInMinutes
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.durationInMinutes
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L40
            return r2
        L40:
            java.lang.String r1 = r5.ownerContract
            java.lang.String r6 = r6.ownerContract
            boolean r6 = p214m2.C4339q.m9702c(r1, r6)
            if (r6 != 0) goto L4b
            return r2
        L4b:
            return r0
    }

    public final java.lang.String getBoostLimit() {
            r1 = this;
            java.lang.String r0 = r1.boostLimit
            return r0
    }

    public final double getBoostLimitDouble() {
            r4 = this;
            java.lang.String r0 = r4.boostLimit
            java.lang.String r1 = " "
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 0
            r3 = 6
            java.util.List r0 = p362uh.C6467m.m13080k0(r0, r1, r2, r2, r3)
            java.lang.Object r0 = p062dh.C1473i.m3995G(r0)
            java.lang.String r0 = (java.lang.String) r0
            double r0 = java.lang.Double.parseDouble(r0)
            return r0
    }

    public final java.lang.String getCPUBoostPerAsset() {
            r1 = this;
            java.lang.String r0 = r1.CPUBoostPerAsset
            return r0
    }

    public final double getCPUBoostPerAssetDouble() {
            r4 = this;
            java.lang.String r0 = r4.CPUBoostPerAsset
            java.lang.String r1 = " "
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 0
            r3 = 6
            java.util.List r0 = p362uh.C6467m.m13080k0(r0, r1, r2, r2, r3)
            java.lang.Object r0 = p062dh.C1473i.m3995G(r0)
            java.lang.String r0 = (java.lang.String) r0
            double r0 = java.lang.Double.parseDouble(r0)
            return r0
    }

    public final java.lang.String getContract() {
            r1 = this;
            java.lang.String r0 = r1.ownerContract
            return r0
    }

    public final java.lang.String getDepositAsset() {
            r1 = this;
            java.lang.String r0 = r1.depositAsset
            return r0
    }

    public final double getDepositAssetDouble() {
            r4 = this;
            java.lang.String r0 = r4.depositAsset
            java.lang.String r1 = " "
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 0
            r3 = 6
            java.util.List r0 = p362uh.C6467m.m13080k0(r0, r1, r2, r2, r3)
            java.lang.Object r0 = p062dh.C1473i.m3995G(r0)
            java.lang.String r0 = (java.lang.String) r0
            double r0 = java.lang.Double.parseDouble(r0)
            return r0
    }

    public final double getDurationInMinutes() {
            r2 = this;
            double r0 = r2.durationInMinutes
            return r0
    }

    public final double getMultiplayer() {
            r4 = this;
            double r0 = r4.getCPUBoostPerAssetDouble()
            double r2 = r4.getDepositAssetDouble()
            double r0 = r0 / r2
            return r0
    }

    public final java.lang.String getOwnerContract() {
            r1 = this;
            java.lang.String r0 = r1.ownerContract
            return r0
    }

    public final int getPrecision() {
            r4 = this;
            java.lang.String r0 = r4.depositAsset
            java.lang.String r1 = " "
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 0
            r3 = 6
            java.util.List r0 = p362uh.C6467m.m13080k0(r0, r1, r2, r2, r3)
            java.lang.Object r0 = p062dh.C1473i.m3996H(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L2c
            java.lang.String r1 = "."
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.util.List r0 = p362uh.C6467m.m13080k0(r0, r1, r2, r2, r3)
            java.lang.Object r0 = p062dh.C1473i.m4002N(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L2c
            int r2 = r0.length()
        L2c:
            return r2
    }

    public final java.lang.String getSymbol() {
            r4 = this;
            java.lang.String r0 = r4.depositAsset
            java.lang.String r1 = " "
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 0
            r3 = 6
            java.util.List r0 = p362uh.C6467m.m13080k0(r0, r1, r2, r2, r3)
            r1 = 1
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.CPUBoostPerAsset
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r5.boostLimit
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r5.depositAsset
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            double r1 = r5.durationInMinutes
            long r1 = java.lang.Double.doubleToLongBits(r1)
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r1 = r5.ownerContract
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "RentCpuRow(CPUBoostPerAsset="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.CPUBoostPerAsset
            r0.append(r1)
            java.lang.String r1 = ", boostLimit="
            r0.append(r1)
            java.lang.String r1 = r3.boostLimit
            r0.append(r1)
            java.lang.String r1 = ", depositAsset="
            r0.append(r1)
            java.lang.String r1 = r3.depositAsset
            r0.append(r1)
            java.lang.String r1 = ", durationInMinutes="
            r0.append(r1)
            double r1 = r3.durationInMinutes
            r0.append(r1)
            java.lang.String r1 = ", ownerContract="
            r0.append(r1)
            java.lang.String r1 = r3.ownerContract
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
