package me;

/* renamed from: me.a */
/* loaded from: classes.dex */
public final class C4593a implements java.io.Serializable {
    private final java.lang.String contract1;
    private final java.lang.String contract2;
    private final int fee;
    private final java.lang.String name;
    private final int pair_id;
    private final double pool1SupplyAmount;
    private final double pool2SupplyAmount;
    private final int precision1;
    private final int precision2;
    private final java.lang.String symbol1;
    private final java.lang.String symbol2;
    private final double totalSupplyAmount;

    public C4593a(int r9, java.lang.String r10, double r11, double r13, double r15, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, int r22, int r23) {
            r8 = this;
            r0 = r8
            r1 = r10
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            java.lang.String r6 = "name"
            p214m2.C4339q.m9706k(r10, r6)
            java.lang.String r6 = "symbol1"
            p214m2.C4339q.m9706k(r2, r6)
            java.lang.String r6 = "symbol2"
            p214m2.C4339q.m9706k(r3, r6)
            java.lang.String r6 = "contract1"
            p214m2.C4339q.m9706k(r4, r6)
            java.lang.String r6 = "contract2"
            p214m2.C4339q.m9706k(r5, r6)
            r8.<init>()
            r6 = r9
            r0.pair_id = r6
            r0.name = r1
            r6 = r11
            r0.totalSupplyAmount = r6
            r6 = r13
            r0.pool1SupplyAmount = r6
            r6 = r15
            r0.pool2SupplyAmount = r6
            r0.symbol1 = r2
            r0.symbol2 = r3
            r0.contract1 = r4
            r0.contract2 = r5
            r1 = r21
            r0.precision1 = r1
            r1 = r22
            r0.precision2 = r1
            r1 = r23
            r0.fee = r1
            return
    }

    public static /* synthetic */ me.C4593a copy$default(me.C4593a r16, int r17, java.lang.String r18, double r19, double r21, double r23, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, int r29, int r30, int r31, int r32, java.lang.Object r33) {
            r0 = r16
            r1 = r32
            r2 = r1 & 1
            if (r2 == 0) goto Lb
            int r2 = r0.pair_id
            goto Ld
        Lb:
            r2 = r17
        Ld:
            r3 = r1 & 2
            if (r3 == 0) goto L14
            java.lang.String r3 = r0.name
            goto L16
        L14:
            r3 = r18
        L16:
            r4 = r1 & 4
            if (r4 == 0) goto L1d
            double r4 = r0.totalSupplyAmount
            goto L1f
        L1d:
            r4 = r19
        L1f:
            r6 = r1 & 8
            if (r6 == 0) goto L26
            double r6 = r0.pool1SupplyAmount
            goto L28
        L26:
            r6 = r21
        L28:
            r8 = r1 & 16
            if (r8 == 0) goto L2f
            double r8 = r0.pool2SupplyAmount
            goto L31
        L2f:
            r8 = r23
        L31:
            r10 = r1 & 32
            if (r10 == 0) goto L38
            java.lang.String r10 = r0.symbol1
            goto L3a
        L38:
            r10 = r25
        L3a:
            r11 = r1 & 64
            if (r11 == 0) goto L41
            java.lang.String r11 = r0.symbol2
            goto L43
        L41:
            r11 = r26
        L43:
            r12 = r1 & 128(0x80, float:1.8E-43)
            if (r12 == 0) goto L4a
            java.lang.String r12 = r0.contract1
            goto L4c
        L4a:
            r12 = r27
        L4c:
            r13 = r1 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L53
            java.lang.String r13 = r0.contract2
            goto L55
        L53:
            r13 = r28
        L55:
            r14 = r1 & 512(0x200, float:7.17E-43)
            if (r14 == 0) goto L5c
            int r14 = r0.precision1
            goto L5e
        L5c:
            r14 = r29
        L5e:
            r15 = r1 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L65
            int r15 = r0.precision2
            goto L67
        L65:
            r15 = r30
        L67:
            r1 = r1 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L6e
            int r1 = r0.fee
            goto L70
        L6e:
            r1 = r31
        L70:
            r17 = r2
            r18 = r3
            r19 = r4
            r21 = r6
            r23 = r8
            r25 = r10
            r26 = r11
            r27 = r12
            r28 = r13
            r29 = r14
            r30 = r15
            r31 = r1
            me.a r0 = r16.copy(r17, r18, r19, r21, r23, r25, r26, r27, r28, r29, r30, r31)
            return r0
    }

    public final int component1() {
            r1 = this;
            int r0 = r1.pair_id
            return r0
    }

    public final int component10() {
            r1 = this;
            int r0 = r1.precision1
            return r0
    }

    public final int component11() {
            r1 = this;
            int r0 = r1.precision2
            return r0
    }

    public final int component12() {
            r1 = this;
            int r0 = r1.fee
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final double component3() {
            r2 = this;
            double r0 = r2.totalSupplyAmount
            return r0
    }

    public final double component4() {
            r2 = this;
            double r0 = r2.pool1SupplyAmount
            return r0
    }

    public final double component5() {
            r2 = this;
            double r0 = r2.pool2SupplyAmount
            return r0
    }

    public final java.lang.String component6() {
            r1 = this;
            java.lang.String r0 = r1.symbol1
            return r0
    }

    public final java.lang.String component7() {
            r1 = this;
            java.lang.String r0 = r1.symbol2
            return r0
    }

    public final java.lang.String component8() {
            r1 = this;
            java.lang.String r0 = r1.contract1
            return r0
    }

    public final java.lang.String component9() {
            r1 = this;
            java.lang.String r0 = r1.contract2
            return r0
    }

    public final me.C4593a copy(int r18, java.lang.String r19, double r20, double r22, double r24, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, int r30, int r31, int r32) {
            r17 = this;
            java.lang.String r0 = "name"
            r3 = r19
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "symbol1"
            r10 = r26
            p214m2.C4339q.m9706k(r10, r0)
            java.lang.String r0 = "symbol2"
            r11 = r27
            p214m2.C4339q.m9706k(r11, r0)
            java.lang.String r0 = "contract1"
            r12 = r28
            p214m2.C4339q.m9706k(r12, r0)
            java.lang.String r0 = "contract2"
            r13 = r29
            p214m2.C4339q.m9706k(r13, r0)
            me.a r0 = new me.a
            r1 = r0
            r2 = r18
            r4 = r20
            r6 = r22
            r8 = r24
            r14 = r30
            r15 = r31
            r16 = r32
            r1.<init>(r2, r3, r4, r6, r8, r10, r11, r12, r13, r14, r15, r16)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof me.C4593a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            me.a r6 = (me.C4593a) r6
            int r1 = r5.pair_id
            int r3 = r6.pair_id
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r5.name
            java.lang.String r3 = r6.name
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            double r3 = r5.totalSupplyAmount
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.totalSupplyAmount
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L31
            return r2
        L31:
            double r3 = r5.pool1SupplyAmount
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.pool1SupplyAmount
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L44
            return r2
        L44:
            double r3 = r5.pool2SupplyAmount
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.pool2SupplyAmount
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L57
            return r2
        L57:
            java.lang.String r1 = r5.symbol1
            java.lang.String r3 = r6.symbol1
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L62
            return r2
        L62:
            java.lang.String r1 = r5.symbol2
            java.lang.String r3 = r6.symbol2
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L6d
            return r2
        L6d:
            java.lang.String r1 = r5.contract1
            java.lang.String r3 = r6.contract1
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L78
            return r2
        L78:
            java.lang.String r1 = r5.contract2
            java.lang.String r3 = r6.contract2
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L83
            return r2
        L83:
            int r1 = r5.precision1
            int r3 = r6.precision1
            if (r1 == r3) goto L8a
            return r2
        L8a:
            int r1 = r5.precision2
            int r3 = r6.precision2
            if (r1 == r3) goto L91
            return r2
        L91:
            int r1 = r5.fee
            int r6 = r6.fee
            if (r1 == r6) goto L98
            return r2
        L98:
            return r0
    }

    public final java.lang.String getContract1() {
            r1 = this;
            java.lang.String r0 = r1.contract1
            return r0
    }

    public final java.lang.String getContract2() {
            r1 = this;
            java.lang.String r0 = r1.contract2
            return r0
    }

    public final int getFee() {
            r1 = this;
            int r0 = r1.fee
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final int getPair_id() {
            r1 = this;
            int r0 = r1.pair_id
            return r0
    }

    public final double getPool1SupplyAmount() {
            r2 = this;
            double r0 = r2.pool1SupplyAmount
            return r0
    }

    public final double getPool2SupplyAmount() {
            r2 = this;
            double r0 = r2.pool2SupplyAmount
            return r0
    }

    public final int getPrecision1() {
            r1 = this;
            int r0 = r1.precision1
            return r0
    }

    public final int getPrecision2() {
            r1 = this;
            int r0 = r1.precision2
            return r0
    }

    public final java.lang.String getSymbol1() {
            r1 = this;
            java.lang.String r0 = r1.symbol1
            return r0
    }

    public final java.lang.String getSymbol2() {
            r1 = this;
            java.lang.String r0 = r1.symbol2
            return r0
    }

    public final double getTotalSupplyAmount() {
            r2 = this;
            double r0 = r2.totalSupplyAmount
            return r0
    }

    public int hashCode() {
            r6 = this;
            int r0 = r6.pair_id
            int r0 = r0 * 31
            java.lang.String r1 = r6.name
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            double r1 = r6.totalSupplyAmount
            long r1 = java.lang.Double.doubleToLongBits(r1)
            r3 = 32
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            double r1 = r6.pool1SupplyAmount
            long r1 = java.lang.Double.doubleToLongBits(r1)
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            double r1 = r6.pool2SupplyAmount
            long r1 = java.lang.Double.doubleToLongBits(r1)
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r1 = r6.symbol1
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r6.symbol2
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r6.contract1
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r6.contract2
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            int r1 = r6.precision1
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.precision2
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.fee
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Adlsfjkasjajaj(pair_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r3.pair_id
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r3.name
            r0.append(r1)
            java.lang.String r1 = ", totalSupplyAmount="
            r0.append(r1)
            double r1 = r3.totalSupplyAmount
            r0.append(r1)
            java.lang.String r1 = ", pool1SupplyAmount="
            r0.append(r1)
            double r1 = r3.pool1SupplyAmount
            r0.append(r1)
            java.lang.String r1 = ", pool2SupplyAmount="
            r0.append(r1)
            double r1 = r3.pool2SupplyAmount
            r0.append(r1)
            java.lang.String r1 = ", symbol1="
            r0.append(r1)
            java.lang.String r1 = r3.symbol1
            r0.append(r1)
            java.lang.String r1 = ", symbol2="
            r0.append(r1)
            java.lang.String r1 = r3.symbol2
            r0.append(r1)
            java.lang.String r1 = ", contract1="
            r0.append(r1)
            java.lang.String r1 = r3.contract1
            r0.append(r1)
            java.lang.String r1 = ", contract2="
            r0.append(r1)
            java.lang.String r1 = r3.contract2
            r0.append(r1)
            java.lang.String r1 = ", precision1="
            r0.append(r1)
            int r1 = r3.precision1
            r0.append(r1)
            java.lang.String r1 = ", precision2="
            r0.append(r1)
            int r1 = r3.precision2
            r0.append(r1)
            java.lang.String r1 = ", fee="
            r0.append(r1)
            int r1 = r3.fee
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
