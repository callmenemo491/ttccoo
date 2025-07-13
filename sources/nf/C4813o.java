package nf;

/* renamed from: nf.o */
/* loaded from: classes.dex */
public final class C4813o {
    private final java.lang.String building_asset_id;

    /* renamed from: id */
    private final java.lang.String f19206id;
    private final long last_harvest;
    private final java.lang.String owner;
    private final java.lang.String plant_id;

    public C4813o(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, long r6) {
            r1 = this;
            java.lang.String r0 = "id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "building_asset_id"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "owner"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "plant_id"
            p214m2.C4339q.m9706k(r5, r0)
            r1.<init>()
            r1.f19206id = r2
            r1.building_asset_id = r3
            r1.owner = r4
            r1.plant_id = r5
            r1.last_harvest = r6
            return
    }

    public static /* synthetic */ nf.C4813o copy$default(nf.C4813o r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, long r9, int r11, java.lang.Object r12) {
            r12 = r11 & 1
            if (r12 == 0) goto L6
            java.lang.String r5 = r4.f19206id
        L6:
            r12 = r11 & 2
            if (r12 == 0) goto Lc
            java.lang.String r6 = r4.building_asset_id
        Lc:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L13
            java.lang.String r7 = r4.owner
        L13:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L1a
            java.lang.String r8 = r4.plant_id
        L1a:
            r1 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L21
            long r9 = r4.last_harvest
        L21:
            r2 = r9
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            nf.o r4 = r6.copy(r7, r8, r9, r10, r11)
            return r4
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.f19206id
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.building_asset_id
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.owner
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.plant_id
            return r0
    }

    public final long component5() {
            r2 = this;
            long r0 = r2.last_harvest
            return r0
    }

    public final nf.C4813o copy(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, long r13) {
            r8 = this;
            java.lang.String r0 = "id"
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "building_asset_id"
            p214m2.C4339q.m9706k(r10, r0)
            java.lang.String r0 = "owner"
            p214m2.C4339q.m9706k(r11, r0)
            java.lang.String r0 = "plant_id"
            p214m2.C4339q.m9706k(r12, r0)
            nf.o r0 = new nf.o
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof nf.C4813o
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            nf.o r8 = (nf.C4813o) r8
            java.lang.String r1 = r7.f19206id
            java.lang.String r3 = r8.f19206id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.building_asset_id
            java.lang.String r3 = r8.building_asset_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r7.owner
            java.lang.String r3 = r8.owner
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r7.plant_id
            java.lang.String r3 = r8.plant_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            long r3 = r7.last_harvest
            long r5 = r8.last_harvest
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L41
            return r2
        L41:
            return r0
    }

    public final java.lang.String getBuilding_asset_id() {
            r1 = this;
            java.lang.String r0 = r1.building_asset_id
            return r0
    }

    public final java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.f19206id
            return r0
    }

    public final long getLast_harvest() {
            r2 = this;
            long r0 = r2.last_harvest
            return r0
    }

    public final java.lang.String getOwner() {
            r1 = this;
            java.lang.String r0 = r1.owner
            return r0
    }

    public final java.lang.String getPlant_id() {
            r1 = this;
            java.lang.String r0 = r1.plant_id
            return r0
    }

    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.f19206id
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r5.building_asset_id
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r5.owner
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r5.plant_id
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            long r1 = r5.last_harvest
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "PlantStaked(id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f19206id
            r0.append(r1)
            java.lang.String r1 = ", building_asset_id="
            r0.append(r1)
            java.lang.String r1 = r3.building_asset_id
            r0.append(r1)
            java.lang.String r1 = ", owner="
            r0.append(r1)
            java.lang.String r1 = r3.owner
            r0.append(r1)
            java.lang.String r1 = ", plant_id="
            r0.append(r1)
            java.lang.String r1 = r3.plant_id
            r0.append(r1)
            java.lang.String r1 = ", last_harvest="
            r0.append(r1)
            long r1 = r3.last_harvest
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
