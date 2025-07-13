package p255od;

/* renamed from: od.h0 */
/* loaded from: classes.dex */
public final class C5206h0 {

    @p189kb.InterfaceC4079b("asset_id")
    private final java.lang.String assetID;
    private final p255od.C5208i0 data;
    private final java.lang.String name;

    public C5206h0(java.lang.String r2, java.lang.String r3, p255od.C5208i0 r4) {
            r1 = this;
            java.lang.String r0 = "assetID"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.assetID = r2
            r1.name = r3
            r1.data = r4
            return
    }

    public static /* synthetic */ p255od.C5206h0 copy$default(p255od.C5206h0 r0, java.lang.String r1, java.lang.String r2, p255od.C5208i0 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = r0.assetID
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.lang.String r2 = r0.name
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            od.i0 r3 = r0.data
        L12:
            od.h0 r0 = r0.copy(r1, r2, r3)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.assetID
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final p255od.C5208i0 component3() {
            r1 = this;
            od.i0 r0 = r1.data
            return r0
    }

    public final p255od.C5206h0 copy(java.lang.String r2, java.lang.String r3, p255od.C5208i0 r4) {
            r1 = this;
            java.lang.String r0 = "assetID"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r4, r0)
            od.h0 r0 = new od.h0
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p255od.C5206h0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.h0 r5 = (p255od.C5206h0) r5
            java.lang.String r1 = r4.assetID
            java.lang.String r3 = r5.assetID
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.name
            java.lang.String r3 = r5.name
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            od.i0 r1 = r4.data
            od.i0 r5 = r5.data
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final java.lang.String getAssetID() {
            r1 = this;
            java.lang.String r0 = r1.assetID
            return r0
    }

    public final p255od.C5208i0 getData() {
            r1 = this;
            od.i0 r0 = r1.data
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final double getValueToClaim() {
            r6 = this;
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0)
            long r0 = r0.getTimeInMillis()
            r2 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r2
            long r0 = r0 / r2
            double r0 = (double) r0
            od.i0 r2 = r6.data
            double r2 = r2.getLast_claim()
            double r0 = r0 - r2
            double r0 = java.lang.Math.abs(r0)
            long r0 = (long) r0
            double r0 = (double) r0
            r2 = 4660134898793709568(0x40ac200000000000, double:3600.0)
            double r0 = r0 / r2
            od.i0 r2 = r6.data
            double r2 = r2.getBase_rate()
            double r2 = r2 * r0
            r0 = 4607272490792564818(0x3ff051eb851eb852, double:1.02)
            od.i0 r4 = r6.data
            int r4 = r4.getLevel()
            double r4 = (double) r4
            double r0 = java.lang.Math.pow(r0, r4)
            double r0 = r0 * r2
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.assetID
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.name
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            od.i0 r1 = r3.data
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "RplanetLand(assetID="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.assetID
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = ", data="
            r0.append(r1)
            od.i0 r1 = r2.data
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
