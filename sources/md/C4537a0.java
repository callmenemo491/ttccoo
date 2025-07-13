package md;

/* renamed from: md.a0 */
/* loaded from: classes.dex */
public final class C4537a0 {
    private final long last_claim;
    private final java.lang.String pool;
    private final java.util.List<md.C4540b0> rarities;
    private final int total_nfts;
    private final java.lang.String unclaimed;

    public C4537a0(java.lang.String r2, long r3, java.lang.String r5, int r6, java.util.List<md.C4540b0> r7) {
            r1 = this;
            java.lang.String r0 = "pool"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "unclaimed"
            p214m2.C4339q.m9706k(r5, r0)
            java.lang.String r0 = "rarities"
            p214m2.C4339q.m9706k(r7, r0)
            r1.<init>()
            r1.pool = r2
            r1.last_claim = r3
            r1.unclaimed = r5
            r1.total_nfts = r6
            r1.rarities = r7
            return
    }

    public static /* synthetic */ md.C4537a0 copy$default(md.C4537a0 r4, java.lang.String r5, long r6, java.lang.String r8, int r9, java.util.List r10, int r11, java.lang.Object r12) {
            r12 = r11 & 1
            if (r12 == 0) goto L6
            java.lang.String r5 = r4.pool
        L6:
            r12 = r11 & 2
            if (r12 == 0) goto Lc
            long r6 = r4.last_claim
        Lc:
            r0 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L13
            java.lang.String r8 = r4.unclaimed
        L13:
            r12 = r8
            r6 = r11 & 8
            if (r6 == 0) goto L1a
            int r9 = r4.total_nfts
        L1a:
            r2 = r9
            r6 = r11 & 16
            if (r6 == 0) goto L21
            java.util.List<md.b0> r10 = r4.rarities
        L21:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r0
            r10 = r12
            r11 = r2
            r12 = r3
            md.a0 r4 = r6.copy(r7, r8, r10, r11, r12)
            return r4
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.pool
            return r0
    }

    public final long component2() {
            r2 = this;
            long r0 = r2.last_claim
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.unclaimed
            return r0
    }

    public final int component4() {
            r1 = this;
            int r0 = r1.total_nfts
            return r0
    }

    public final java.util.List<md.C4540b0> component5() {
            r1 = this;
            java.util.List<md.b0> r0 = r1.rarities
            return r0
    }

    public final md.C4537a0 copy(java.lang.String r9, long r10, java.lang.String r12, int r13, java.util.List<md.C4540b0> r14) {
            r8 = this;
            java.lang.String r0 = "pool"
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "unclaimed"
            p214m2.C4339q.m9706k(r12, r0)
            java.lang.String r0 = "rarities"
            p214m2.C4339q.m9706k(r14, r0)
            md.a0 r0 = new md.a0
            r1 = r0
            r2 = r9
            r3 = r10
            r5 = r12
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r5, r6, r7)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof md.C4537a0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            md.a0 r8 = (md.C4537a0) r8
            java.lang.String r1 = r7.pool
            java.lang.String r3 = r8.pool
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.last_claim
            long r5 = r8.last_claim
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L20
            return r2
        L20:
            java.lang.String r1 = r7.unclaimed
            java.lang.String r3 = r8.unclaimed
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2b
            return r2
        L2b:
            int r1 = r7.total_nfts
            int r3 = r8.total_nfts
            if (r1 == r3) goto L32
            return r2
        L32:
            java.util.List<md.b0> r1 = r7.rarities
            java.util.List<md.b0> r8 = r8.rarities
            boolean r8 = p214m2.C4339q.m9702c(r1, r8)
            if (r8 != 0) goto L3d
            return r2
        L3d:
            return r0
    }

    public final double getHours() {
            r4 = this;
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0)
            long r0 = r0.getTimeInMillis()
            r2 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r2
            long r0 = r0 / r2
            long r2 = r4.last_claim
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)
            double r0 = (double) r0
            r2 = 4660134898793709568(0x40ac200000000000, double:3600.0)
            double r0 = r0 / r2
            double r0 = java.lang.Math.floor(r0)
            return r0
    }

    public final long getLast_claim() {
            r2 = this;
            long r0 = r2.last_claim
            return r0
    }

    public final java.lang.String getPool() {
            r1 = this;
            java.lang.String r0 = r1.pool
            return r0
    }

    public final java.util.List<md.C4540b0> getRarities() {
            r1 = this;
            java.util.List<md.b0> r0 = r1.rarities
            return r0
    }

    public final int getTotal_nfts() {
            r1 = this;
            int r0 = r1.total_nfts
            return r0
    }

    public final java.lang.String getUnclaimed() {
            r1 = this;
            java.lang.String r0 = r1.unclaimed
            return r0
    }

    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.pool
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            long r1 = r5.last_claim
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r1 = r5.unclaimed
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            int r1 = r5.total_nfts
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<md.b0> r1 = r5.rarities
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "NovaRallyData(pool="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.pool
            r0.append(r1)
            java.lang.String r1 = ", last_claim="
            r0.append(r1)
            long r1 = r3.last_claim
            r0.append(r1)
            java.lang.String r1 = ", unclaimed="
            r0.append(r1)
            java.lang.String r1 = r3.unclaimed
            r0.append(r1)
            java.lang.String r1 = ", total_nfts="
            r0.append(r1)
            int r1 = r3.total_nfts
            r0.append(r1)
            java.lang.String r1 = ", rarities="
            r0.append(r1)
            java.util.List<md.b0> r1 = r3.rarities
            r2 = 41
            java.lang.String r0 = p213m1.C4320f.m9652a(r0, r1, r2)
            return r0
    }

    public final double valueToClaim(double r3) {
            r2 = this;
            double r0 = r2.getHours()
            double r0 = r0 * r3
            return r0
    }
}
