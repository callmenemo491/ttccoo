package p255od;

/* renamed from: od.j */
/* loaded from: classes.dex */
public final class C5209j {
    private final java.lang.String asset_id;
    private final java.lang.String asset_name;
    private final java.lang.String rarity;
    private final int rate;
    private final java.lang.String schema;
    private final int staked_time;

    public C5209j(java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, java.lang.String r6, int r7) {
            r1 = this;
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "asset_name"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "rarity"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "schema"
            p214m2.C4339q.m9706k(r6, r0)
            r1.<init>()
            r1.asset_id = r2
            r1.asset_name = r3
            r1.rarity = r4
            r1.rate = r5
            r1.schema = r6
            r1.staked_time = r7
            return
    }

    public static /* synthetic */ p255od.C5209j copy$default(p255od.C5209j r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8, java.lang.String r9, int r10, int r11, java.lang.Object r12) {
            r12 = r11 & 1
            if (r12 == 0) goto L6
            java.lang.String r5 = r4.asset_id
        L6:
            r12 = r11 & 2
            if (r12 == 0) goto Lc
            java.lang.String r6 = r4.asset_name
        Lc:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L13
            java.lang.String r7 = r4.rarity
        L13:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L1a
            int r8 = r4.rate
        L1a:
            r1 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L21
            java.lang.String r9 = r4.schema
        L21:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L28
            int r10 = r4.staked_time
        L28:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            od.j r4 = r6.copy(r7, r8, r9, r10, r11, r12)
            return r4
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.asset_id
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.asset_name
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.rarity
            return r0
    }

    public final int component4() {
            r1 = this;
            int r0 = r1.rate
            return r0
    }

    public final java.lang.String component5() {
            r1 = this;
            java.lang.String r0 = r1.schema
            return r0
    }

    public final int component6() {
            r1 = this;
            int r0 = r1.staked_time
            return r0
    }

    public final p255od.C5209j copy(java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, java.lang.String r13, int r14) {
            r8 = this;
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "asset_name"
            p214m2.C4339q.m9706k(r10, r0)
            java.lang.String r0 = "rarity"
            p214m2.C4339q.m9706k(r11, r0)
            java.lang.String r0 = "schema"
            p214m2.C4339q.m9706k(r13, r0)
            od.j r0 = new od.j
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p255od.C5209j
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.j r5 = (p255od.C5209j) r5
            java.lang.String r1 = r4.asset_id
            java.lang.String r3 = r5.asset_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.asset_name
            java.lang.String r3 = r5.asset_name
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.rarity
            java.lang.String r3 = r5.rarity
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            int r1 = r4.rate
            int r3 = r5.rate
            if (r1 == r3) goto L34
            return r2
        L34:
            java.lang.String r1 = r4.schema
            java.lang.String r3 = r5.schema
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            int r1 = r4.staked_time
            int r5 = r5.staked_time
            if (r1 == r5) goto L46
            return r2
        L46:
            return r0
    }

    public final java.lang.String getAsset_id() {
            r1 = this;
            java.lang.String r0 = r1.asset_id
            return r0
    }

    public final java.lang.String getAsset_name() {
            r1 = this;
            java.lang.String r0 = r1.asset_name
            return r0
    }

    public final java.lang.String getRarity() {
            r1 = this;
            java.lang.String r0 = r1.rarity
            return r0
    }

    public final int getRate() {
            r1 = this;
            int r0 = r1.rate
            return r0
    }

    public final java.lang.String getSchema() {
            r1 = this;
            java.lang.String r0 = r1.schema
            return r0
    }

    public final int getStaked_time() {
            r1 = this;
            int r0 = r1.staked_time
            return r0
    }

    public final double getValueToClaim() {
            r4 = this;
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0)
            long r0 = r0.getTimeInMillis()
            r2 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r2
            long r0 = r0 / r2
            int r2 = r4.staked_time
            long r2 = (long) r2
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)
            double r0 = (double) r0
            r2 = 4660134898793709568(0x40ac200000000000, double:3600.0)
            double r0 = r0 / r2
            double r0 = java.lang.Math.floor(r0)
            int r2 = r4.rate
            double r2 = (double) r2
            double r0 = r0 * r2
            r2 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            double r0 = r0 * r2
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.asset_id
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.asset_name
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.rarity
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            int r1 = r3.rate
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.schema
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            int r1 = r3.staked_time
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "CenturyTrainAsset(asset_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.asset_id
            r0.append(r1)
            java.lang.String r1 = ", asset_name="
            r0.append(r1)
            java.lang.String r1 = r3.asset_name
            r0.append(r1)
            java.lang.String r1 = ", rarity="
            r0.append(r1)
            java.lang.String r1 = r3.rarity
            r0.append(r1)
            java.lang.String r1 = ", rate="
            r0.append(r1)
            int r1 = r3.rate
            r0.append(r1)
            java.lang.String r1 = ", schema="
            r0.append(r1)
            java.lang.String r1 = r3.schema
            r0.append(r1)
            java.lang.String r1 = ", staked_time="
            r0.append(r1)
            int r1 = r3.staked_time
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
