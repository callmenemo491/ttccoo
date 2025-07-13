package p295qg;

/* renamed from: qg.e */
/* loaded from: classes.dex */
public final class C5651e {
    private final java.util.List<p295qg.C5652f> inventory;
    private final java.lang.String pool;

    public C5651e(java.lang.String r2, java.util.List<p295qg.C5652f> r3) {
            r1 = this;
            java.lang.String r0 = "pool"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "inventory"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.pool = r2
            r1.inventory = r3
            return
    }

    public static /* synthetic */ p295qg.C5651e copy$default(p295qg.C5651e r0, java.lang.String r1, java.util.List r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = r0.pool
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.util.List<qg.f> r2 = r0.inventory
        Lc:
            qg.e r0 = r0.copy(r1, r2)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.pool
            return r0
    }

    public final java.util.List<p295qg.C5652f> component2() {
            r1 = this;
            java.util.List<qg.f> r0 = r1.inventory
            return r0
    }

    public final p295qg.C5651e copy(java.lang.String r2, java.util.List<p295qg.C5652f> r3) {
            r1 = this;
            java.lang.String r0 = "pool"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "inventory"
            p214m2.C4339q.m9706k(r3, r0)
            qg.e r0 = new qg.e
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p295qg.C5651e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qg.e r5 = (p295qg.C5651e) r5
            java.lang.String r1 = r4.pool
            java.lang.String r3 = r5.pool
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List<qg.f> r1 = r4.inventory
            java.util.List<qg.f> r5 = r5.inventory
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final java.util.List<p295qg.C5652f> getInventory() {
            r1 = this;
            java.util.List<qg.f> r0 = r1.inventory
            return r0
    }

    public final java.lang.String getPool() {
            r1 = this;
            java.lang.String r0 = r1.pool
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.pool
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List<qg.f> r1 = r2.inventory
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "VirtualDreamData(pool="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.pool
            r0.append(r1)
            java.lang.String r1 = ", inventory="
            r0.append(r1)
            java.util.List<qg.f> r1 = r3.inventory
            r2 = 41
            java.lang.String r0 = p213m1.C4320f.m9652a(r0, r1, r2)
            return r0
    }
}
