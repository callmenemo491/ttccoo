package p344te;

/* renamed from: te.f */
/* loaded from: classes.dex */
public final class C6224f implements java.io.Serializable {
    private final java.lang.String amount;

    @p189kb.InterfaceC4079b("token_contract")
    private final java.lang.String tokenContract;

    @p189kb.InterfaceC4079b("token_precision")
    private final int tokenPrecision;

    @p189kb.InterfaceC4079b("token_symbol")
    private final java.lang.String tokenSymbol;

    public C6224f(java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            java.lang.String r0 = "amount"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "tokenContract"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "tokenSymbol"
            p214m2.C4339q.m9706k(r5, r0)
            r1.<init>()
            r1.amount = r2
            r1.tokenPrecision = r3
            r1.tokenContract = r4
            r1.tokenSymbol = r5
            return
    }

    public static /* synthetic */ p344te.C6224f copy$default(p344te.C6224f r0, java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.lang.String r1 = r0.amount
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            int r2 = r0.tokenPrecision
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            java.lang.String r3 = r0.tokenContract
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            java.lang.String r4 = r0.tokenSymbol
        L18:
            te.f r0 = r0.copy(r1, r2, r3, r4)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.amount
            return r0
    }

    public final int component2() {
            r1 = this;
            int r0 = r1.tokenPrecision
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.tokenContract
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.tokenSymbol
            return r0
    }

    public final p344te.C6224f copy(java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            java.lang.String r0 = "amount"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "tokenContract"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "tokenSymbol"
            p214m2.C4339q.m9706k(r5, r0)
            te.f r0 = new te.f
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p344te.C6224f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            te.f r5 = (p344te.C6224f) r5
            java.lang.String r1 = r4.amount
            java.lang.String r3 = r5.amount
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.tokenPrecision
            int r3 = r5.tokenPrecision
            if (r1 == r3) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r4.tokenContract
            java.lang.String r3 = r5.tokenContract
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            java.lang.String r1 = r4.tokenSymbol
            java.lang.String r5 = r5.tokenSymbol
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L34
            return r2
        L34:
            return r0
    }

    public final java.lang.String getAmount() {
            r1 = this;
            java.lang.String r0 = r1.amount
            return r0
    }

    public final double getAmountDouble() {
            r4 = this;
            java.lang.String r0 = r4.amount
            java.lang.Double r0 = p362uh.C6462h.m13048E(r0)
            if (r0 == 0) goto L12
            double r0 = r0.doubleValue()
            r2 = 100000000(0x5f5e100, float:2.3122341E-35)
            double r2 = (double) r2
            double r0 = r0 / r2
            goto L14
        L12:
            r0 = 0
        L14:
            return r0
    }

    public final java.lang.String getAmountString() {
            r4 = this;
            java.lang.String r0 = r4.amount
            java.lang.Double r0 = p362uh.C6462h.m13048E(r0)
            if (r0 == 0) goto L18
            double r0 = r0.doubleValue()
            r2 = 100000000(0x5f5e100, float:2.3122341E-35)
            double r2 = (double) r2
            double r0 = r0 / r2
            r2 = 0
            r3 = 2
            java.lang.String r0 = vg.C6672m.m13535v(r0, r3, r2, r3)
            goto L1a
        L18:
            java.lang.String r0 = "---"
        L1a:
            return r0
    }

    public final java.lang.String getTokenContract() {
            r1 = this;
            java.lang.String r0 = r1.tokenContract
            return r0
    }

    public final int getTokenPrecision() {
            r1 = this;
            int r0 = r1.tokenPrecision
            return r0
    }

    public final java.lang.String getTokenSymbol() {
            r1 = this;
            java.lang.String r0 = r1.tokenSymbol
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.amount
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r3.tokenPrecision
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.tokenContract
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.tokenSymbol
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Price(amount="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.amount
            r0.append(r1)
            java.lang.String r1 = ", tokenPrecision="
            r0.append(r1)
            int r1 = r3.tokenPrecision
            r0.append(r1)
            java.lang.String r1 = ", tokenContract="
            r0.append(r1)
            java.lang.String r1 = r3.tokenContract
            r0.append(r1)
            java.lang.String r1 = ", tokenSymbol="
            r0.append(r1)
            java.lang.String r1 = r3.tokenSymbol
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
