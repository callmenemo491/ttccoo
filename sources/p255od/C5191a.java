package p255od;

/* renamed from: od.a */
/* loaded from: classes.dex */
public final class C5191a {
    private final int fee;

    /* renamed from: id */
    private final int f20342id;
    private final p255od.C5200e0 pool1;
    private final p255od.C5200e0 pool2;
    private final java.lang.String supply;

    public C5191a(int r2, java.lang.String r3, p255od.C5200e0 r4, p255od.C5200e0 r5, int r6) {
            r1 = this;
            java.lang.String r0 = "supply"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "pool1"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "pool2"
            p214m2.C4339q.m9706k(r5, r0)
            r1.<init>()
            r1.f20342id = r2
            r1.supply = r3
            r1.pool1 = r4
            r1.pool2 = r5
            r1.fee = r6
            return
    }

    public static /* synthetic */ p255od.C5191a copy$default(p255od.C5191a r3, int r4, java.lang.String r5, p255od.C5200e0 r6, p255od.C5200e0 r7, int r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            int r4 = r3.f20342id
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            java.lang.String r5 = r3.supply
        Lc:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L13
            od.e0 r6 = r3.pool1
        L13:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L1a
            od.e0 r7 = r3.pool2
        L1a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L21
            int r8 = r3.fee
        L21:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            od.a r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
    }

    public final me.C4593a alfjk() {
            r26 = this;
            r0 = r26
            java.lang.String r1 = r0.supply
            java.lang.String r2 = " "
            java.lang.String[] r3 = new java.lang.String[]{r2}
            r4 = 0
            r5 = 6
            java.util.List r1 = p362uh.C6467m.m13080k0(r1, r3, r4, r4, r5)
            java.lang.Object r1 = p062dh.C1473i.m3996H(r1)
            java.lang.String r1 = (java.lang.String) r1
            r6 = 0
            if (r1 == 0) goto L26
            java.lang.Double r1 = p362uh.C6462h.m13048E(r1)
            if (r1 == 0) goto L26
            double r8 = r1.doubleValue()
            r13 = r8
            goto L27
        L26:
            r13 = r6
        L27:
            java.lang.String r1 = r0.supply
            java.lang.String[] r3 = new java.lang.String[]{r2}
            java.util.List r1 = p362uh.C6467m.m13080k0(r1, r3, r4, r4, r5)
            java.lang.Object r1 = p062dh.C1473i.m4002N(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = ""
            if (r1 != 0) goto L3d
            r12 = r3
            goto L3e
        L3d:
            r12 = r1
        L3e:
            od.e0 r1 = r0.pool1
            java.lang.String r1 = r1.getQuantity()
            java.lang.String[] r8 = new java.lang.String[]{r2}
            java.util.List r1 = p362uh.C6467m.m13080k0(r1, r8, r4, r4, r5)
            java.lang.Object r1 = p062dh.C1473i.m3996H(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L5e
            java.lang.Double r1 = p362uh.C6462h.m13048E(r1)
            if (r1 == 0) goto L5e
            double r6 = r1.doubleValue()
        L5e:
            r15 = r6
            od.e0 r1 = r0.pool2
            java.lang.String r1 = r1.getQuantity()
            java.lang.String[] r6 = new java.lang.String[]{r2}
            java.util.List r1 = p362uh.C6467m.m13080k0(r1, r6, r4, r4, r5)
            java.lang.Object r1 = p062dh.C1473i.m3996H(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L80
            java.lang.Double r1 = p362uh.C6462h.m13048E(r1)
            if (r1 == 0) goto L80
            double r6 = r1.doubleValue()
            goto L82
        L80:
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L82:
            r17 = r6
            od.e0 r1 = r0.pool1
            java.lang.String r1 = r1.getQuantity()
            java.lang.String[] r6 = new java.lang.String[]{r2}
            java.util.List r1 = p362uh.C6467m.m13080k0(r1, r6, r4, r4, r5)
            java.lang.Object r1 = p062dh.C1473i.m4002N(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L9d
            r19 = r3
            goto L9f
        L9d:
            r19 = r1
        L9f:
            od.e0 r1 = r0.pool2
            java.lang.String r1 = r1.getQuantity()
            java.lang.String[] r6 = new java.lang.String[]{r2}
            java.util.List r1 = p362uh.C6467m.m13080k0(r1, r6, r4, r4, r5)
            java.lang.Object r1 = p062dh.C1473i.m4002N(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto Lb8
            r20 = r3
            goto Lba
        Lb8:
            r20 = r1
        Lba:
            od.e0 r1 = r0.pool1
            java.lang.String r1 = r1.getQuantity()
            java.lang.String r3 = "."
            r6 = 2
            boolean r7 = p362uh.C6467m.m13064U(r1, r3, r4, r6)
            if (r7 == 0) goto Lf0
            java.lang.String[] r7 = new java.lang.String[]{r2}
            java.util.List r1 = p362uh.C6467m.m13080k0(r1, r7, r4, r4, r5)
            java.lang.Object r1 = p062dh.C1473i.m3996H(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Lf0
            java.lang.String[] r7 = new java.lang.String[]{r3}
            java.util.List r1 = p362uh.C6467m.m13080k0(r1, r7, r4, r4, r5)
            java.lang.Object r1 = p062dh.C1473i.m4002N(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Lf0
            int r1 = r1.length()
            r23 = r1
            goto Lf2
        Lf0:
            r23 = 0
        Lf2:
            od.e0 r1 = r0.pool2
            java.lang.String r1 = r1.getQuantity()
            boolean r6 = p362uh.C6467m.m13064U(r1, r3, r4, r6)
            if (r6 == 0) goto L125
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.util.List r1 = p362uh.C6467m.m13080k0(r1, r2, r4, r4, r5)
            java.lang.Object r1 = p062dh.C1473i.m3996H(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L125
            java.lang.String[] r2 = new java.lang.String[]{r3}
            java.util.List r1 = p362uh.C6467m.m13080k0(r1, r2, r4, r4, r5)
            java.lang.Object r1 = p062dh.C1473i.m4002N(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L125
            int r4 = r1.length()
            r24 = r4
            goto L127
        L125:
            r24 = 0
        L127:
            me.a r1 = new me.a
            int r11 = r0.f20342id
            od.e0 r2 = r0.pool1
            java.lang.String r21 = r2.getContract()
            od.e0 r2 = r0.pool2
            java.lang.String r22 = r2.getContract()
            int r2 = r0.fee
            r10 = r1
            r25 = r2
            r10.<init>(r11, r12, r13, r15, r17, r19, r20, r21, r22, r23, r24, r25)
            return r1
    }

    public final int component1() {
            r1 = this;
            int r0 = r1.f20342id
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.supply
            return r0
    }

    public final p255od.C5200e0 component3() {
            r1 = this;
            od.e0 r0 = r1.pool1
            return r0
    }

    public final p255od.C5200e0 component4() {
            r1 = this;
            od.e0 r0 = r1.pool2
            return r0
    }

    public final int component5() {
            r1 = this;
            int r0 = r1.fee
            return r0
    }

    public final p255od.C5191a copy(int r8, java.lang.String r9, p255od.C5200e0 r10, p255od.C5200e0 r11, int r12) {
            r7 = this;
            java.lang.String r0 = "supply"
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "pool1"
            p214m2.C4339q.m9706k(r10, r0)
            java.lang.String r0 = "pool2"
            p214m2.C4339q.m9706k(r11, r0)
            od.a r0 = new od.a
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
            boolean r1 = r5 instanceof p255od.C5191a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.a r5 = (p255od.C5191a) r5
            int r1 = r4.f20342id
            int r3 = r5.f20342id
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.supply
            java.lang.String r3 = r5.supply
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            od.e0 r1 = r4.pool1
            od.e0 r3 = r5.pool1
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            od.e0 r1 = r4.pool2
            od.e0 r3 = r5.pool2
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            int r1 = r4.fee
            int r5 = r5.fee
            if (r1 == r5) goto L3b
            return r2
        L3b:
            return r0
    }

    public final int getFee() {
            r1 = this;
            int r0 = r1.fee
            return r0
    }

    public final int getId() {
            r1 = this;
            int r0 = r1.f20342id
            return r0
    }

    public final p255od.C5200e0 getPool1() {
            r1 = this;
            od.e0 r0 = r1.pool1
            return r0
    }

    public final p255od.C5200e0 getPool2() {
            r1 = this;
            od.e0 r0 = r1.pool2
            return r0
    }

    public final java.lang.String getSupply() {
            r1 = this;
            java.lang.String r0 = r1.supply
            return r0
    }

    public final java.lang.String getSupplySymbol() {
            r4 = this;
            java.lang.String r0 = r4.supply
            java.lang.String r1 = " "
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 0
            r3 = 6
            java.util.List r0 = p362uh.C6467m.m13080k0(r0, r1, r2, r2, r3)
            java.lang.Object r0 = p062dh.C1473i.m4001M(r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.f20342id
            int r0 = r0 * 31
            java.lang.String r1 = r3.supply
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            od.e0 r1 = r3.pool1
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            od.e0 r0 = r3.pool2
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.fee
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "AlcorPairRow(id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r3.f20342id
            r0.append(r1)
            java.lang.String r1 = ", supply="
            r0.append(r1)
            java.lang.String r1 = r3.supply
            r0.append(r1)
            java.lang.String r1 = ", pool1="
            r0.append(r1)
            od.e0 r1 = r3.pool1
            r0.append(r1)
            java.lang.String r1 = ", pool2="
            r0.append(r1)
            od.e0 r1 = r3.pool2
            r0.append(r1)
            java.lang.String r1 = ", fee="
            r0.append(r1)
            int r1 = r3.fee
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
