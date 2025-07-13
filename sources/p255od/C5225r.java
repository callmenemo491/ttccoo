package p255od;

/* renamed from: od.r */
/* loaded from: classes.dex */
public final class C5225r {
    public static final p255od.C5225r.a Companion = null;
    private final java.lang.String account;
    private final java.lang.String memo;
    private final java.lang.String quantity;
    private final java.lang.String symbol;

    /* renamed from: to */
    private final java.lang.String f20350to;

    /* renamed from: od.r$a */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final java.util.List<p255od.C5225r> getTacoSwapConversionObjects(je.C3579a r11, je.C3579a r12, double r13, java.lang.String r15) {
                r10 = this;
                java.lang.String r0 = "from"
                p214m2.C4339q.m9706k(r11, r0)
                java.lang.String r0 = "to"
                p214m2.C4339q.m9706k(r12, r0)
                java.lang.String r0 = "amountStr"
                p214m2.C4339q.m9706k(r15, r0)
                java.lang.Double r15 = p362uh.C6462h.m13048E(r15)
                if (r15 == 0) goto L78
                double r0 = r15.doubleValue()
                r2 = 4636716180731382989(0x4058eccccccccccd, double:99.7)
                double r2 = r2 * r0
                r4 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
                double r2 = r2 * r4
                double r2 = r2 * r13
                r13 = 4599075939470750515(0x3fd3333333333333, double:0.3)
                double r4 = r2 * r13
                r15 = 100
                double r6 = (double) r15
                double r4 = r4 / r6
                double r2 = r2 - r4
                double r13 = r13 * r2
                double r13 = r13 / r6
                double r2 = r2 - r13
                od.r r13 = new od.r
                int r14 = r11.f15691Z
                r15 = 0
                r4 = 2
                java.lang.String r6 = vg.C6672m.m13535v(r0, r14, r15, r4)
                java.lang.String r7 = r11.f15690Y
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                int r0 = r12.f15691Z
                java.lang.String r15 = vg.C6672m.m13535v(r2, r0, r15, r4)
                r14.append(r15)
                r15 = 32
                r14.append(r15)
                java.lang.String r15 = r12.f15690Y
                r14.append(r15)
                r15 = 64
                r14.append(r15)
                java.lang.String r12 = r12.f15692a0
                r14.append(r12)
                java.lang.String r8 = r14.toString()
                java.lang.String r9 = r11.f15692a0
                java.lang.String r5 = "swap.taco"
                r4 = r13
                r4.<init>(r5, r6, r7, r8, r9)
                java.util.List r11 = p074e9.C1805a.m4528m(r13)
                return r11
            L78:
                dh.k r11 = p062dh.C1475k.f7237Y
                return r11
        }
    }

    static {
            od.r$a r0 = new od.r$a
            r1 = 0
            r0.<init>(r1)
            p255od.C5225r.Companion = r0
            return
    }

    public C5225r(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r1 = this;
            java.lang.String r0 = "to"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "quantity"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "symbol"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "memo"
            p214m2.C4339q.m9706k(r5, r0)
            java.lang.String r0 = "account"
            p214m2.C4339q.m9706k(r6, r0)
            r1.<init>()
            r1.f20350to = r2
            r1.quantity = r3
            r1.symbol = r4
            r1.memo = r5
            r1.account = r6
            return
    }

    public static /* synthetic */ p255od.C5225r copy$default(p255od.C5225r r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r4 = r3.f20350to
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            java.lang.String r5 = r3.quantity
        Lc:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L13
            java.lang.String r6 = r3.symbol
        L13:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L1a
            java.lang.String r7 = r3.memo
        L1a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L21
            java.lang.String r8 = r3.account
        L21:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            od.r r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.f20350to
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.quantity
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.symbol
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.memo
            return r0
    }

    public final java.lang.String component5() {
            r1 = this;
            java.lang.String r0 = r1.account
            return r0
    }

    public final p255od.C5225r copy(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r7 = this;
            java.lang.String r0 = "to"
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "quantity"
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "symbol"
            p214m2.C4339q.m9706k(r10, r0)
            java.lang.String r0 = "memo"
            p214m2.C4339q.m9706k(r11, r0)
            java.lang.String r0 = "account"
            p214m2.C4339q.m9706k(r12, r0)
            od.r r0 = new od.r
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
            boolean r1 = r5 instanceof p255od.C5225r
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.r r5 = (p255od.C5225r) r5
            java.lang.String r1 = r4.f20350to
            java.lang.String r3 = r5.f20350to
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.quantity
            java.lang.String r3 = r5.quantity
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.symbol
            java.lang.String r3 = r5.symbol
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.memo
            java.lang.String r3 = r5.memo
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.account
            java.lang.String r5 = r5.account
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L43
            return r2
        L43:
            return r0
    }

    public final java.lang.String getAccount() {
            r1 = this;
            java.lang.String r0 = r1.account
            return r0
    }

    public final java.lang.String getMemo() {
            r1 = this;
            java.lang.String r0 = r1.memo
            return r0
    }

    public final java.lang.String getQuantity() {
            r1 = this;
            java.lang.String r0 = r1.quantity
            return r0
    }

    public final java.lang.String getSymbol() {
            r1 = this;
            java.lang.String r0 = r1.symbol
            return r0
    }

    public final java.lang.String getTo() {
            r1 = this;
            java.lang.String r0 = r1.f20350to
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f20350to
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.quantity
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.symbol
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.memo
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.account
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final ch.C0978e<java.lang.Boolean, java.lang.String> isValid() {
            r5 = this;
            java.lang.String r0 = r5.quantity
            java.lang.Double r0 = p362uh.C6462h.m13048E(r0)
            r1 = 0
            if (r0 == 0) goto Lf
            double r3 = r0.doubleValue()
            goto L10
        Lf:
            r3 = r1
        L10:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L17
            java.lang.String r0 = "Insert a valid quantity to continue"
            goto L46
        L17:
            java.lang.String r0 = r5.f20350to
            boolean r0 = p362uh.C6463i.m13054K(r0)
            if (r0 == 0) goto L22
            java.lang.String r0 = "Insert a valid address to continue"
            goto L46
        L22:
            java.lang.String r0 = r5.f20350to
            int r0 = r0.length()
            r1 = 12
            if (r0 <= r1) goto L2f
            java.lang.String r0 = "Account name cannot be more than 12 characters"
            goto L46
        L2f:
            java.lang.String r0 = r5.symbol
            boolean r0 = p362uh.C6463i.m13054K(r0)
            if (r0 == 0) goto L3a
            java.lang.String r0 = "Select a valid balance to continue"
            goto L46
        L3a:
            java.lang.String r0 = r5.account
            boolean r0 = p362uh.C6463i.m13054K(r0)
            if (r0 == 0) goto L45
            java.lang.String r0 = "Error refresh"
            goto L46
        L45:
            r0 = 0
        L46:
            if (r0 == 0) goto L50
            ch.e r1 = new ch.e
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.<init>(r2, r0)
            return r1
        L50:
            ch.e r0 = new ch.e
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            return r0
    }

    public final java.lang.String quantityFormatter() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.quantity
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            java.lang.String r1 = r2.symbol
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "EOSTransferObject(to="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f20350to
            r0.append(r1)
            java.lang.String r1 = ", quantity="
            r0.append(r1)
            java.lang.String r1 = r3.quantity
            r0.append(r1)
            java.lang.String r1 = ", symbol="
            r0.append(r1)
            java.lang.String r1 = r3.symbol
            r0.append(r1)
            java.lang.String r1 = ", memo="
            r0.append(r1)
            java.lang.String r1 = r3.memo
            r0.append(r1)
            java.lang.String r1 = ", account="
            r0.append(r1)
            java.lang.String r1 = r3.account
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
