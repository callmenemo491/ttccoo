package p255od;

/* renamed from: od.n */
/* loaded from: classes.dex */
public final class C5217n {
    private final java.lang.String asset_id;
    private final p255od.C5219o data;

    public C5217n(java.lang.String r2, p255od.C5219o r3) {
            r1 = this;
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.asset_id = r2
            r1.data = r3
            return
    }

    public static /* synthetic */ p255od.C5217n copy$default(p255od.C5217n r0, java.lang.String r1, p255od.C5219o r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = r0.asset_id
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            od.o r2 = r0.data
        Lc:
            od.n r0 = r0.copy(r1, r2)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.asset_id
            return r0
    }

    public final p255od.C5219o component2() {
            r1 = this;
            od.o r0 = r1.data
            return r0
    }

    public final p255od.C5217n copy(java.lang.String r2, p255od.C5219o r3) {
            r1 = this;
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r3, r0)
            od.n r0 = new od.n
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p255od.C5217n
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.n r5 = (p255od.C5217n) r5
            java.lang.String r1 = r4.asset_id
            java.lang.String r3 = r5.asset_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            od.o r1 = r4.data
            od.o r5 = r5.data
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final java.lang.String getAsset_id() {
            r1 = this;
            java.lang.String r0 = r1.asset_id
            return r0
    }

    public final p255od.C5219o getData() {
            r1 = this;
            od.o r0 = r1.data
            return r0
    }

    public final double getLudioToClaim() {
            r4 = this;
            double r0 = r4.getOrcsToClaim()
            r2 = 25
            double r2 = (double) r2
            double r0 = r0 / r2
            return r0
    }

    public final double getOrcsToClaim() {
            r4 = this;
            od.o r0 = r4.data
            java.lang.String r0 = r0.getPartial_dead_orcs_counter()
            od.o r1 = r4.data
            java.lang.Double r1 = r1.getCo_owners_amount()
            r2 = 0
            if (r0 == 0) goto L22
            if (r1 != 0) goto L13
            goto L22
        L13:
            java.lang.Double r0 = p362uh.C6462h.m13048E(r0)
            if (r0 == 0) goto L1d
            double r2 = r0.doubleValue()
        L1d:
            double r0 = r1.doubleValue()
            double r2 = r2 / r0
        L22:
            return r2
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.asset_id
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            od.o r1 = r2.data
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "ClashdomeLand(asset_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.asset_id
            r0.append(r1)
            java.lang.String r1 = ", data="
            r0.append(r1)
            od.o r1 = r2.data
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
