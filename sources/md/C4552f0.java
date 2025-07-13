package md;

/* renamed from: md.f0 */
/* loaded from: classes.dex */
public final class C4552f0 {
    private final double hourly_max;
    private final java.lang.String pool;
    private final java.util.List<md.C4543c0> rarities;
    private final int total_nfts;

    public C4552f0(java.lang.String r2, double r3, int r5, java.util.List<md.C4543c0> r6) {
            r1 = this;
            java.lang.String r0 = "pool"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "rarities"
            p214m2.C4339q.m9706k(r6, r0)
            r1.<init>()
            r1.pool = r2
            r1.hourly_max = r3
            r1.total_nfts = r5
            r1.rarities = r6
            return
    }

    public static /* synthetic */ md.C4552f0 copy$default(md.C4552f0 r3, java.lang.String r4, double r5, int r7, java.util.List r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r4 = r3.pool
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            double r5 = r3.hourly_max
        Lc:
            r0 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L13
            int r7 = r3.total_nfts
        L13:
            r10 = r7
            r5 = r9 & 8
            if (r5 == 0) goto L1a
            java.util.List<md.c0> r8 = r3.rarities
        L1a:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r0
            r9 = r10
            r10 = r2
            md.f0 r3 = r5.copy(r6, r7, r9, r10)
            return r3
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.pool
            return r0
    }

    public final double component2() {
            r2 = this;
            double r0 = r2.hourly_max
            return r0
    }

    public final int component3() {
            r1 = this;
            int r0 = r1.total_nfts
            return r0
    }

    public final java.util.List<md.C4543c0> component4() {
            r1 = this;
            java.util.List<md.c0> r0 = r1.rarities
            return r0
    }

    public final md.C4552f0 copy(java.lang.String r8, double r9, int r11, java.util.List<md.C4543c0> r12) {
            r7 = this;
            java.lang.String r0 = "pool"
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "rarities"
            p214m2.C4339q.m9706k(r12, r0)
            md.f0 r0 = new md.f0
            r1 = r0
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r5, r6)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof md.C4552f0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            md.f0 r6 = (md.C4552f0) r6
            java.lang.String r1 = r5.pool
            java.lang.String r3 = r6.pool
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            double r3 = r5.hourly_max
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.hourly_max
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2a
            return r2
        L2a:
            int r1 = r5.total_nfts
            int r3 = r6.total_nfts
            if (r1 == r3) goto L31
            return r2
        L31:
            java.util.List<md.c0> r1 = r5.rarities
            java.util.List<md.c0> r6 = r6.rarities
            boolean r6 = p214m2.C4339q.m9702c(r1, r6)
            if (r6 != 0) goto L3c
            return r2
        L3c:
            return r0
    }

    public final double getHourly_max() {
            r2 = this;
            double r0 = r2.hourly_max
            return r0
    }

    public final java.lang.String getPool() {
            r1 = this;
            java.lang.String r0 = r1.pool
            return r0
    }

    public final java.util.List<md.C4543c0> getRarities() {
            r1 = this;
            java.util.List<md.c0> r0 = r1.rarities
            return r0
    }

    public final double getRegisteredPool() {
            r9 = this;
            java.util.List<md.c0> r0 = r9.rarities
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = p062dh.C1469e.m3992D(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L57
            java.lang.Object r2 = r0.next()
            md.c0 r2 = (md.C4543c0) r2
            java.lang.String r5 = r2.getValue()
            java.lang.Double r5 = p362uh.C6462h.m13048E(r5)
            if (r5 == 0) goto L2e
            double r5 = r5.doubleValue()
            goto L2f
        L2e:
            r5 = r3
        L2f:
            java.util.Map r7 = md.C4549e0.getNovaRallyCardRarities()
            java.lang.String r8 = r9.pool
            java.lang.Object r7 = r7.get(r8)
            java.util.Map r7 = (java.util.Map) r7
            if (r7 == 0) goto L4d
            java.lang.String r2 = r2.getKey()
            java.lang.Object r2 = r7.get(r2)
            java.lang.Double r2 = (java.lang.Double) r2
            if (r2 == 0) goto L4d
            double r3 = r2.doubleValue()
        L4d:
            double r5 = r5 * r3
            java.lang.Double r2 = java.lang.Double.valueOf(r5)
            r1.add(r2)
            goto L11
        L57:
            java.util.Iterator r0 = r1.iterator()
        L5b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r0.next()
            java.lang.Number r1 = (java.lang.Number) r1
            double r1 = r1.doubleValue()
            double r3 = r3 + r1
            goto L5b
        L6d:
            return r3
    }

    public final int getTotal_nfts() {
            r1 = this;
            int r0 = r1.total_nfts
            return r0
    }

    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.pool
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            double r1 = r5.hourly_max
            long r1 = java.lang.Double.doubleToLongBits(r1)
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r5.total_nfts
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<md.c0> r1 = r5.rarities
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final double hourlyClaim(java.lang.String r5, int r6) {
            r4 = this;
            java.lang.String r0 = "rarity"
            p214m2.C4339q.m9706k(r5, r0)
            java.util.Map r0 = md.C4549e0.getNovaRallyCardRarities()
            java.lang.String r1 = r4.pool
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L33
            java.lang.Object r5 = r0.get(r5)
            java.lang.Double r5 = (java.lang.Double) r5
            if (r5 == 0) goto L33
            double r0 = r5.doubleValue()
            double r2 = r4.getRegisteredPool()
            double r0 = vg.C6664e.m13506g(r0, r2)
            double r2 = r4.hourly_max
            double r0 = r0 * r2
            double r5 = (double) r6
            double r0 = r0 * r5
            double r5 = java.lang.Math.floor(r0)
            return r5
        L33:
            r5 = 0
            return r5
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "NovaRallyPoolRow(pool="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.pool
            r0.append(r1)
            java.lang.String r1 = ", hourly_max="
            r0.append(r1)
            double r1 = r3.hourly_max
            r0.append(r1)
            java.lang.String r1 = ", total_nfts="
            r0.append(r1)
            int r1 = r3.total_nfts
            r0.append(r1)
            java.lang.String r1 = ", rarities="
            r0.append(r1)
            java.util.List<md.c0> r1 = r3.rarities
            r2 = 41
            java.lang.String r0 = p213m1.C4320f.m9652a(r0, r1, r2)
            return r0
    }
}
