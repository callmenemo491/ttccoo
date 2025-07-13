package nf;

/* renamed from: nf.m */
/* loaded from: classes.dex */
public final class C4811m {
    private final int food;
    private final int food_max;
    private final java.lang.String owner;
    private final int water;
    private final int water_max;

    public C4811m(java.lang.String r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            java.lang.String r0 = "owner"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.owner = r2
            r1.food = r3
            r1.food_max = r4
            r1.water = r5
            r1.water_max = r6
            return
    }

    public static /* synthetic */ nf.C4811m copy$default(nf.C4811m r3, java.lang.String r4, int r5, int r6, int r7, int r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r4 = r3.owner
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            int r5 = r3.food
        Lc:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L13
            int r6 = r3.food_max
        L13:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L1a
            int r7 = r3.water
        L1a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L21
            int r8 = r3.water_max
        L21:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            nf.m r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.owner
            return r0
    }

    public final int component2() {
            r1 = this;
            int r0 = r1.food
            return r0
    }

    public final int component3() {
            r1 = this;
            int r0 = r1.food_max
            return r0
    }

    public final int component4() {
            r1 = this;
            int r0 = r1.water
            return r0
    }

    public final int component5() {
            r1 = this;
            int r0 = r1.water_max
            return r0
    }

    public final nf.C4811m copy(java.lang.String r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            java.lang.String r0 = "owner"
            p214m2.C4339q.m9706k(r8, r0)
            nf.m r0 = new nf.m
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
            boolean r1 = r5 instanceof nf.C4811m
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            nf.m r5 = (nf.C4811m) r5
            java.lang.String r1 = r4.owner
            java.lang.String r3 = r5.owner
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.food
            int r3 = r5.food
            if (r1 == r3) goto L1e
            return r2
        L1e:
            int r1 = r4.food_max
            int r3 = r5.food_max
            if (r1 == r3) goto L25
            return r2
        L25:
            int r1 = r4.water
            int r3 = r5.water
            if (r1 == r3) goto L2c
            return r2
        L2c:
            int r1 = r4.water_max
            int r5 = r5.water_max
            if (r1 == r5) goto L33
            return r2
        L33:
            return r0
    }

    public final int getFood() {
            r1 = this;
            int r0 = r1.food
            return r0
    }

    public final int getFood_max() {
            r1 = this;
            int r0 = r1.food_max
            return r0
    }

    public final java.lang.String getOwner() {
            r1 = this;
            java.lang.String r0 = r1.owner
            return r0
    }

    public final int getWater() {
            r1 = this;
            int r0 = r1.water
            return r0
    }

    public final int getWater_max() {
            r1 = this;
            int r0 = r1.water_max
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.owner
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.food
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.food_max
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.water
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.water_max
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "FTResource(owner="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.owner
            r0.append(r1)
            java.lang.String r1 = ", food="
            r0.append(r1)
            int r1 = r3.food
            r0.append(r1)
            java.lang.String r1 = ", food_max="
            r0.append(r1)
            int r1 = r3.food_max
            r0.append(r1)
            java.lang.String r1 = ", water="
            r0.append(r1)
            int r1 = r3.water
            r0.append(r1)
            java.lang.String r1 = ", water_max="
            r0.append(r1)
            int r1 = r3.water_max
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
