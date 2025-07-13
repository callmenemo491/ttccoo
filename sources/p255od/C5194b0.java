package p255od;

/* renamed from: od.b0 */
/* loaded from: classes.dex */
public final class C5194b0 implements java.io.Serializable {
    private double amount;
    private final java.lang.String contract;
    private final java.lang.String currency;
    private final int decimals;

    public C5194b0(double r2, java.lang.String r4, java.lang.String r5, int r6) {
            r1 = this;
            java.lang.String r0 = "currency"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "contract"
            p214m2.C4339q.m9706k(r5, r0)
            r1.<init>()
            r1.amount = r2
            r1.currency = r4
            r1.contract = r5
            r1.decimals = r6
            return
    }

    public static /* synthetic */ p255od.C5194b0 copy$default(p255od.C5194b0 r6, double r7, java.lang.String r9, java.lang.String r10, int r11, int r12, java.lang.Object r13) {
            r13 = r12 & 1
            if (r13 == 0) goto L6
            double r7 = r6.amount
        L6:
            r1 = r7
            r7 = r12 & 2
            if (r7 == 0) goto Ld
            java.lang.String r9 = r6.currency
        Ld:
            r3 = r9
            r7 = r12 & 4
            if (r7 == 0) goto L14
            java.lang.String r10 = r6.contract
        L14:
            r4 = r10
            r7 = r12 & 8
            if (r7 == 0) goto L1b
            int r11 = r6.decimals
        L1b:
            r5 = r11
            r0 = r6
            od.b0 r6 = r0.copy(r1, r3, r4, r5)
            return r6
    }

    public final double component1() {
            r2 = this;
            double r0 = r2.amount
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.currency
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.contract
            return r0
    }

    public final int component4() {
            r1 = this;
            int r0 = r1.decimals
            return r0
    }

    public final p255od.C5194b0 copy(double r8, java.lang.String r10, java.lang.String r11, int r12) {
            r7 = this;
            java.lang.String r0 = "currency"
            p214m2.C4339q.m9706k(r10, r0)
            java.lang.String r0 = "contract"
            p214m2.C4339q.m9706k(r11, r0)
            od.b0 r0 = new od.b0
            r1 = r0
            r2 = r8
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r4, r5, r6)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p255od.C5194b0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.b0 r6 = (p255od.C5194b0) r6
            double r3 = r5.amount
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.amount
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L1f
            return r2
        L1f:
            java.lang.String r1 = r5.currency
            java.lang.String r3 = r6.currency
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2a
            return r2
        L2a:
            java.lang.String r1 = r5.contract
            java.lang.String r3 = r6.contract
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L35
            return r2
        L35:
            int r1 = r5.decimals
            int r6 = r6.decimals
            if (r1 == r6) goto L3c
            return r2
        L3c:
            return r0
    }

    public final double getAmount() {
            r2 = this;
            double r0 = r2.amount
            return r0
    }

    public final java.lang.String getAmountString() {
            r5 = this;
            double r0 = r5.amount
            int r2 = r5.decimals
            r3 = 0
            r4 = 2
            java.lang.String r0 = vg.C6672m.m13535v(r0, r2, r3, r4)
            return r0
    }

    public final java.lang.String getContract() {
            r1 = this;
            java.lang.String r0 = r1.contract
            return r0
    }

    public final java.lang.String getCurrency() {
            r1 = this;
            java.lang.String r0 = r1.currency
            return r0
    }

    public final int getDecimals() {
            r1 = this;
            int r0 = r1.decimals
            return r0
    }

    public final java.lang.String getImage() {
            r2 = this;
            java.lang.String r0 = r2.currency
            java.lang.String r1 = r2.contract
            java.lang.String r0 = p097fd.C2139a.m5698b(r0, r1)
            return r0
    }

    public int hashCode() {
            r4 = this;
            double r0 = r4.amount
            long r0 = java.lang.Double.doubleToLongBits(r0)
            r2 = 32
            long r2 = r0 >>> r2
            long r0 = r0 ^ r2
            int r1 = (int) r0
            int r1 = r1 * 31
            java.lang.String r0 = r4.currency
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r0, r1, r2)
            java.lang.String r1 = r4.contract
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            int r1 = r4.decimals
            int r0 = r0 + r1
            return r0
    }

    public final void setAmount(double r1) {
            r0 = this;
            r0.amount = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "MyBalance(amount="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            double r1 = r3.amount
            r0.append(r1)
            java.lang.String r1 = ", currency="
            r0.append(r1)
            java.lang.String r1 = r3.currency
            r0.append(r1)
            java.lang.String r1 = ", contract="
            r0.append(r1)
            java.lang.String r1 = r3.contract
            r0.append(r1)
            java.lang.String r1 = ", decimals="
            r0.append(r1)
            int r1 = r3.decimals
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
