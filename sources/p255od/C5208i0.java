package p255od;

/* renamed from: od.i0 */
/* loaded from: classes.dex */
public final class C5208i0 {
    private final double base_rate;
    private final double last_claim;
    private final int level;
    private final p255od.EnumC5192a0 mineral;

    public C5208i0(int r1, double r2, p255od.EnumC5192a0 r4, double r5) {
            r0 = this;
            r0.<init>()
            r0.level = r1
            r0.last_claim = r2
            r0.mineral = r4
            r0.base_rate = r5
            return
    }

    public static /* synthetic */ p255od.C5208i0 copy$default(p255od.C5208i0 r4, int r5, double r6, p255od.EnumC5192a0 r8, double r9, int r11, java.lang.Object r12) {
            r12 = r11 & 1
            if (r12 == 0) goto L6
            int r5 = r4.level
        L6:
            r12 = r11 & 2
            if (r12 == 0) goto Lc
            double r6 = r4.last_claim
        Lc:
            r0 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L13
            od.a0 r8 = r4.mineral
        L13:
            r12 = r8
            r6 = r11 & 8
            if (r6 == 0) goto L1a
            double r9 = r4.base_rate
        L1a:
            r2 = r9
            r6 = r4
            r7 = r5
            r8 = r0
            r10 = r12
            r11 = r2
            od.i0 r4 = r6.copy(r7, r8, r10, r11)
            return r4
    }

    public final int component1() {
            r1 = this;
            int r0 = r1.level
            return r0
    }

    public final double component2() {
            r2 = this;
            double r0 = r2.last_claim
            return r0
    }

    public final p255od.EnumC5192a0 component3() {
            r1 = this;
            od.a0 r0 = r1.mineral
            return r0
    }

    public final double component4() {
            r2 = this;
            double r0 = r2.base_rate
            return r0
    }

    public final p255od.C5208i0 copy(int r9, double r10, p255od.EnumC5192a0 r12, double r13) {
            r8 = this;
            od.i0 r7 = new od.i0
            r0 = r7
            r1 = r9
            r2 = r10
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r4, r5)
            return r7
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p255od.C5208i0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.i0 r6 = (p255od.C5208i0) r6
            int r1 = r5.level
            int r3 = r6.level
            if (r1 == r3) goto L13
            return r2
        L13:
            double r3 = r5.last_claim
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.last_claim
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L26
            return r2
        L26:
            od.a0 r1 = r5.mineral
            od.a0 r3 = r6.mineral
            if (r1 == r3) goto L2d
            return r2
        L2d:
            double r3 = r5.base_rate
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.base_rate
            java.lang.Double r6 = java.lang.Double.valueOf(r3)
            boolean r6 = p214m2.C4339q.m9702c(r1, r6)
            if (r6 != 0) goto L40
            return r2
        L40:
            return r0
    }

    public final double getBase_rate() {
            r2 = this;
            double r0 = r2.base_rate
            return r0
    }

    public final double getLast_claim() {
            r2 = this;
            double r0 = r2.last_claim
            return r0
    }

    public final int getLevel() {
            r1 = this;
            int r0 = r1.level
            return r0
    }

    public final p255od.EnumC5192a0 getMineral() {
            r1 = this;
            od.a0 r0 = r1.mineral
            return r0
    }

    public int hashCode() {
            r6 = this;
            int r0 = r6.level
            int r0 = r0 * 31
            double r1 = r6.last_claim
            long r1 = java.lang.Double.doubleToLongBits(r1)
            r3 = 32
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            od.a0 r1 = r6.mineral
            if (r1 != 0) goto L19
            r1 = 0
            goto L1d
        L19:
            int r1 = r1.hashCode()
        L1d:
            int r0 = r0 + r1
            int r0 = r0 * 31
            double r1 = r6.base_rate
            long r1 = java.lang.Double.doubleToLongBits(r1)
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "RplanetLandData(level="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r3.level
            r0.append(r1)
            java.lang.String r1 = ", last_claim="
            r0.append(r1)
            double r1 = r3.last_claim
            r0.append(r1)
            java.lang.String r1 = ", mineral="
            r0.append(r1)
            od.a0 r1 = r3.mineral
            r0.append(r1)
            java.lang.String r1 = ", base_rate="
            r0.append(r1)
            double r1 = r3.base_rate
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
