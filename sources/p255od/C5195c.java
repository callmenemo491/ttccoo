package p255od;

/* renamed from: od.c */
/* loaded from: classes.dex */
public final class C5195c {
    private final double assetAmount1;
    private final double assetAmount2;
    private final java.lang.String contract1;
    private final java.lang.String contract2;
    private final java.lang.String name;
    private final int precision;
    private final int precision1;
    private final int precision2;
    private final double quantity;
    private final java.lang.String symbol1;
    private final java.lang.String symbol2;

    public C5195c(java.lang.String r2, double r3, int r5, double r6, int r8, java.lang.String r9, java.lang.String r10, double r11, int r13, java.lang.String r14, java.lang.String r15) {
            r1 = this;
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "symbol1"
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "contract1"
            p214m2.C4339q.m9706k(r10, r0)
            java.lang.String r0 = "symbol2"
            p214m2.C4339q.m9706k(r14, r0)
            java.lang.String r0 = "contract2"
            p214m2.C4339q.m9706k(r15, r0)
            r1.<init>()
            r1.name = r2
            r1.quantity = r3
            r1.precision = r5
            r1.assetAmount1 = r6
            r1.precision1 = r8
            r1.symbol1 = r9
            r1.contract1 = r10
            r1.assetAmount2 = r11
            r1.precision2 = r13
            r1.symbol2 = r14
            r1.contract2 = r15
            return
    }

    public static /* synthetic */ p255od.C5195c copy$default(p255od.C5195c r15, java.lang.String r16, double r17, int r19, double r20, int r22, java.lang.String r23, java.lang.String r24, double r25, int r27, java.lang.String r28, java.lang.String r29, int r30, java.lang.Object r31) {
            r0 = r15
            r1 = r30
            r2 = r1 & 1
            if (r2 == 0) goto La
            java.lang.String r2 = r0.name
            goto Lc
        La:
            r2 = r16
        Lc:
            r3 = r1 & 2
            if (r3 == 0) goto L13
            double r3 = r0.quantity
            goto L15
        L13:
            r3 = r17
        L15:
            r5 = r1 & 4
            if (r5 == 0) goto L1c
            int r5 = r0.precision
            goto L1e
        L1c:
            r5 = r19
        L1e:
            r6 = r1 & 8
            if (r6 == 0) goto L25
            double r6 = r0.assetAmount1
            goto L27
        L25:
            r6 = r20
        L27:
            r8 = r1 & 16
            if (r8 == 0) goto L2e
            int r8 = r0.precision1
            goto L30
        L2e:
            r8 = r22
        L30:
            r9 = r1 & 32
            if (r9 == 0) goto L37
            java.lang.String r9 = r0.symbol1
            goto L39
        L37:
            r9 = r23
        L39:
            r10 = r1 & 64
            if (r10 == 0) goto L40
            java.lang.String r10 = r0.contract1
            goto L42
        L40:
            r10 = r24
        L42:
            r11 = r1 & 128(0x80, float:1.8E-43)
            if (r11 == 0) goto L49
            double r11 = r0.assetAmount2
            goto L4b
        L49:
            r11 = r25
        L4b:
            r13 = r1 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L52
            int r13 = r0.precision2
            goto L54
        L52:
            r13 = r27
        L54:
            r14 = r1 & 512(0x200, float:7.17E-43)
            if (r14 == 0) goto L5b
            java.lang.String r14 = r0.symbol2
            goto L5d
        L5b:
            r14 = r28
        L5d:
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L64
            java.lang.String r1 = r0.contract2
            goto L66
        L64:
            r1 = r29
        L66:
            r16 = r2
            r17 = r3
            r19 = r5
            r20 = r6
            r22 = r8
            r23 = r9
            r24 = r10
            r25 = r11
            r27 = r13
            r28 = r14
            r29 = r1
            od.c r0 = r15.copy(r16, r17, r19, r20, r22, r23, r24, r25, r27, r28, r29)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final java.lang.String component10() {
            r1 = this;
            java.lang.String r0 = r1.symbol2
            return r0
    }

    public final java.lang.String component11() {
            r1 = this;
            java.lang.String r0 = r1.contract2
            return r0
    }

    public final double component2() {
            r2 = this;
            double r0 = r2.quantity
            return r0
    }

    public final int component3() {
            r1 = this;
            int r0 = r1.precision
            return r0
    }

    public final double component4() {
            r2 = this;
            double r0 = r2.assetAmount1
            return r0
    }

    public final int component5() {
            r1 = this;
            int r0 = r1.precision1
            return r0
    }

    public final java.lang.String component6() {
            r1 = this;
            java.lang.String r0 = r1.symbol1
            return r0
    }

    public final java.lang.String component7() {
            r1 = this;
            java.lang.String r0 = r1.contract1
            return r0
    }

    public final double component8() {
            r2 = this;
            double r0 = r2.assetAmount2
            return r0
    }

    public final int component9() {
            r1 = this;
            int r0 = r1.precision2
            return r0
    }

    public final p255od.C5195c copy(java.lang.String r17, double r18, int r20, double r21, int r23, java.lang.String r24, java.lang.String r25, double r26, int r28, java.lang.String r29, java.lang.String r30) {
            r16 = this;
            java.lang.String r0 = "name"
            r2 = r17
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "symbol1"
            r9 = r24
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "contract1"
            r10 = r25
            p214m2.C4339q.m9706k(r10, r0)
            java.lang.String r0 = "symbol2"
            r14 = r29
            p214m2.C4339q.m9706k(r14, r0)
            java.lang.String r0 = "contract2"
            r15 = r30
            p214m2.C4339q.m9706k(r15, r0)
            od.c r0 = new od.c
            r1 = r0
            r3 = r18
            r5 = r20
            r6 = r21
            r8 = r23
            r11 = r26
            r13 = r28
            r1.<init>(r2, r3, r5, r6, r8, r9, r10, r11, r13, r14, r15)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p255od.C5195c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.c r6 = (p255od.C5195c) r6
            java.lang.String r1 = r5.name
            java.lang.String r3 = r6.name
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            double r3 = r5.quantity
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.quantity
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2a
            return r2
        L2a:
            int r1 = r5.precision
            int r3 = r6.precision
            if (r1 == r3) goto L31
            return r2
        L31:
            double r3 = r5.assetAmount1
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.assetAmount1
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L44
            return r2
        L44:
            int r1 = r5.precision1
            int r3 = r6.precision1
            if (r1 == r3) goto L4b
            return r2
        L4b:
            java.lang.String r1 = r5.symbol1
            java.lang.String r3 = r6.symbol1
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L56
            return r2
        L56:
            java.lang.String r1 = r5.contract1
            java.lang.String r3 = r6.contract1
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L61
            return r2
        L61:
            double r3 = r5.assetAmount2
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.assetAmount2
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L74
            return r2
        L74:
            int r1 = r5.precision2
            int r3 = r6.precision2
            if (r1 == r3) goto L7b
            return r2
        L7b:
            java.lang.String r1 = r5.symbol2
            java.lang.String r3 = r6.symbol2
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L86
            return r2
        L86:
            java.lang.String r1 = r5.contract2
            java.lang.String r6 = r6.contract2
            boolean r6 = p214m2.C4339q.m9702c(r1, r6)
            if (r6 != 0) goto L91
            return r2
        L91:
            return r0
    }

    public final double getAssetAmount1() {
            r2 = this;
            double r0 = r2.assetAmount1
            return r0
    }

    public final double getAssetAmount2() {
            r2 = this;
            double r0 = r2.assetAmount2
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

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final int getPrecision() {
            r1 = this;
            int r0 = r1.precision
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

    public final double getQuantity() {
            r2 = this;
            double r0 = r2.quantity
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

    public int hashCode() {
            r6 = this;
            java.lang.String r0 = r6.name
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            double r1 = r6.quantity
            long r1 = java.lang.Double.doubleToLongBits(r1)
            r3 = 32
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r6.precision
            int r0 = r0 + r1
            int r0 = r0 * 31
            double r1 = r6.assetAmount1
            long r1 = java.lang.Double.doubleToLongBits(r1)
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r6.precision1
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r6.symbol1
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r6.contract1
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            double r1 = r6.assetAmount2
            long r1 = java.lang.Double.doubleToLongBits(r1)
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r6.precision2
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r6.symbol2
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r6.contract2
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "AlcorProvideLiquidity(name="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.name
            r0.append(r1)
            java.lang.String r1 = ", quantity="
            r0.append(r1)
            double r1 = r3.quantity
            r0.append(r1)
            java.lang.String r1 = ", precision="
            r0.append(r1)
            int r1 = r3.precision
            r0.append(r1)
            java.lang.String r1 = ", assetAmount1="
            r0.append(r1)
            double r1 = r3.assetAmount1
            r0.append(r1)
            java.lang.String r1 = ", precision1="
            r0.append(r1)
            int r1 = r3.precision1
            r0.append(r1)
            java.lang.String r1 = ", symbol1="
            r0.append(r1)
            java.lang.String r1 = r3.symbol1
            r0.append(r1)
            java.lang.String r1 = ", contract1="
            r0.append(r1)
            java.lang.String r1 = r3.contract1
            r0.append(r1)
            java.lang.String r1 = ", assetAmount2="
            r0.append(r1)
            double r1 = r3.assetAmount2
            r0.append(r1)
            java.lang.String r1 = ", precision2="
            r0.append(r1)
            int r1 = r3.precision2
            r0.append(r1)
            java.lang.String r1 = ", symbol2="
            r0.append(r1)
            java.lang.String r1 = r3.symbol2
            r0.append(r1)
            java.lang.String r1 = ", contract2="
            r0.append(r1)
            java.lang.String r1 = r3.contract2
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
