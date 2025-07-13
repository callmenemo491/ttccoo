package p255od;

/* renamed from: od.g */
/* loaded from: classes.dex */
public final class C5203g {
    private final java.lang.String amount;
    private final java.lang.String contract;
    private final java.lang.String currency;
    private final java.lang.String decimals;

    public C5203g(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.amount = r1
            r0.currency = r2
            r0.contract = r3
            r0.decimals = r4
            return
    }

    public static /* synthetic */ p255od.C5203g copy$default(p255od.C5203g r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.lang.String r1 = r0.amount
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            java.lang.String r2 = r0.currency
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            java.lang.String r3 = r0.contract
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            java.lang.String r4 = r0.decimals
        L18:
            od.g r0 = r0.copy(r1, r2, r3, r4)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.amount
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

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.decimals
            return r0
    }

    public final p255od.C5203g copy(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            od.g r0 = new od.g
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p255od.C5203g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.g r5 = (p255od.C5203g) r5
            java.lang.String r1 = r4.amount
            java.lang.String r3 = r5.amount
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.currency
            java.lang.String r3 = r5.currency
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.contract
            java.lang.String r3 = r5.contract
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.decimals
            java.lang.String r5 = r5.decimals
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L38
            return r2
        L38:
            return r0
    }

    public final java.lang.String getAmount() {
            r1 = this;
            java.lang.String r0 = r1.amount
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

    public final java.lang.String getDecimals() {
            r1 = this;
            java.lang.String r0 = r1.decimals
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.amount
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            java.lang.String r2 = r3.currency
            if (r2 != 0) goto L13
            r2 = 0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r3.contract
            if (r2 != 0) goto L20
            r2 = 0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r3.decimals
            if (r2 != 0) goto L2c
            goto L30
        L2c:
            int r1 = r2.hashCode()
        L30:
            int r0 = r0 + r1
            return r0
    }

    public final p255od.C5194b0 toMyBalance() {
            r8 = this;
            od.b0 r6 = new od.b0
            java.lang.String r0 = r8.amount
            r1 = 0
            if (r0 == 0) goto L2c
            java.lang.Double r0 = p362uh.C6462h.m13048E(r0)
            if (r0 == 0) goto L2c
            double r2 = r0.doubleValue()
            java.lang.String r4 = r8.currency
            if (r4 != 0) goto L16
            return r1
        L16:
            java.lang.String r5 = r8.contract
            if (r5 != 0) goto L1b
            return r1
        L1b:
            java.lang.String r0 = r8.decimals
            if (r0 == 0) goto L2c
            int r7 = java.lang.Integer.parseInt(r0)
            r0 = r6
            r1 = r2
            r3 = r4
            r4 = r5
            r5 = r7
            r0.<init>(r1, r3, r4, r5)
            return r6
        L2c:
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Balance(amount="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.amount
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
            java.lang.String r1 = r3.decimals
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
