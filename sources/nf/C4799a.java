package nf;

/* renamed from: nf.a */
/* loaded from: classes.dex */
public final class C4799a {
    private final java.lang.String asset_id;
    private final java.lang.String building_asset_id;
    private final int last_harvest;
    private final java.lang.String owner;
    private final int template_id;

    public C4799a(java.lang.String r2, java.lang.String r3, int r4, java.lang.String r5, int r6) {
            r1 = this;
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "building_asset_id"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "owner"
            p214m2.C4339q.m9706k(r5, r0)
            r1.<init>()
            r1.asset_id = r2
            r1.building_asset_id = r3
            r1.last_harvest = r4
            r1.owner = r5
            r1.template_id = r6
            return
    }

    public static /* synthetic */ nf.C4799a copy$default(nf.C4799a r3, java.lang.String r4, java.lang.String r5, int r6, java.lang.String r7, int r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r4 = r3.asset_id
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            java.lang.String r5 = r3.building_asset_id
        Lc:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L13
            int r6 = r3.last_harvest
        L13:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L1a
            java.lang.String r7 = r3.owner
        L1a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L21
            int r8 = r3.template_id
        L21:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            nf.a r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.asset_id
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.building_asset_id
            return r0
    }

    public final int component3() {
            r1 = this;
            int r0 = r1.last_harvest
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.owner
            return r0
    }

    public final int component5() {
            r1 = this;
            int r0 = r1.template_id
            return r0
    }

    public final nf.C4799a copy(java.lang.String r8, java.lang.String r9, int r10, java.lang.String r11, int r12) {
            r7 = this;
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "building_asset_id"
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "owner"
            p214m2.C4339q.m9706k(r11, r0)
            nf.a r0 = new nf.a
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof nf.C4799a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            nf.a r5 = (nf.C4799a) r5
            java.lang.String r1 = r4.asset_id
            java.lang.String r3 = r5.asset_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.building_asset_id
            java.lang.String r3 = r5.building_asset_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            int r1 = r4.last_harvest
            int r3 = r5.last_harvest
            if (r1 == r3) goto L29
            return r2
        L29:
            java.lang.String r1 = r4.owner
            java.lang.String r3 = r5.owner
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            int r1 = r4.template_id
            int r5 = r5.template_id
            if (r1 == r5) goto L3b
            return r2
        L3b:
            return r0
    }

    public final java.lang.String getAsset_id() {
            r1 = this;
            java.lang.String r0 = r1.asset_id
            return r0
    }

    public final java.lang.String getBuilding_asset_id() {
            r1 = this;
            java.lang.String r0 = r1.building_asset_id
            return r0
    }

    public final int getLast_harvest() {
            r1 = this;
            int r0 = r1.last_harvest
            return r0
    }

    public final java.lang.String getOwner() {
            r1 = this;
            java.lang.String r0 = r1.owner
            return r0
    }

    public final int getTemplate_id() {
            r1 = this;
            int r0 = r1.template_id
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.asset_id
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.building_asset_id
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            int r1 = r3.last_harvest
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.owner
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            int r1 = r3.template_id
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "AnimalStaked(asset_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.asset_id
            r0.append(r1)
            java.lang.String r1 = ", building_asset_id="
            r0.append(r1)
            java.lang.String r1 = r3.building_asset_id
            r0.append(r1)
            java.lang.String r1 = ", last_harvest="
            r0.append(r1)
            int r1 = r3.last_harvest
            r0.append(r1)
            java.lang.String r1 = ", owner="
            r0.append(r1)
            java.lang.String r1 = r3.owner
            r0.append(r1)
            java.lang.String r1 = ", template_id="
            r0.append(r1)
            int r1 = r3.template_id
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
