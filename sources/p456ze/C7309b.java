package p456ze;

/* renamed from: ze.b */
/* loaded from: classes.dex */
public final class C7309b {
    private final p456ze.C7309b.a balance;

    /* renamed from: id */
    private final int f28010id;

    /* renamed from: ze.b$a */
    public static final class a {
        private final java.lang.String contract;
        private final java.lang.String quantity;

        public a(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "contract"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "quantity"
                p214m2.C4339q.m9706k(r3, r0)
                r1.<init>()
                r1.contract = r2
                r1.quantity = r3
                return
        }

        public static /* synthetic */ p456ze.C7309b.a copy$default(p456ze.C7309b.a r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                java.lang.String r1 = r0.contract
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                java.lang.String r2 = r0.quantity
            Lc:
                ze.b$a r0 = r0.copy(r1, r2)
                return r0
        }

        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.contract
                return r0
        }

        public final java.lang.String component2() {
                r1 = this;
                java.lang.String r0 = r1.quantity
                return r0
        }

        public final p456ze.C7309b.a copy(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "contract"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "quantity"
                p214m2.C4339q.m9706k(r3, r0)
                ze.b$a r0 = new ze.b$a
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof p456ze.C7309b.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                ze.b$a r5 = (p456ze.C7309b.a) r5
                java.lang.String r1 = r4.contract
                java.lang.String r3 = r5.contract
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.quantity
                java.lang.String r5 = r5.quantity
                boolean r5 = p214m2.C4339q.m9702c(r1, r5)
                if (r5 != 0) goto L22
                return r2
            L22:
                return r0
        }

        public final java.lang.String getContract() {
                r1 = this;
                java.lang.String r0 = r1.contract
                return r0
        }

        public final java.lang.String getQuantity() {
                r1 = this;
                java.lang.String r0 = r1.quantity
                return r0
        }

        public final double getQuantityValue() {
                r4 = this;
                java.lang.String r0 = r4.quantity
                java.lang.String r1 = " "
                java.lang.String[] r1 = new java.lang.String[]{r1}
                r2 = 0
                r3 = 6
                java.util.List r0 = p362uh.C6467m.m13080k0(r0, r1, r2, r2, r3)
                java.lang.Object r0 = p062dh.C1473i.m3995G(r0)
                java.lang.String r0 = (java.lang.String) r0
                double r0 = java.lang.Double.parseDouble(r0)
                return r0
        }

        public final java.lang.String getSymbol() {
                r4 = this;
                java.lang.String r0 = r4.quantity
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
                r2 = this;
                java.lang.String r0 = r2.contract
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r2.quantity
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "Balance(contract="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r3.contract
                r0.append(r1)
                java.lang.String r1 = ", quantity="
                r0.append(r1)
                java.lang.String r1 = r3.quantity
                r2 = 41
                java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
                return r0
        }
    }

    public C7309b(p456ze.C7309b.a r2, int r3) {
            r1 = this;
            java.lang.String r0 = "balance"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.balance = r2
            r1.f28010id = r3
            return
    }

    public static /* synthetic */ p456ze.C7309b copy$default(p456ze.C7309b r0, p456ze.C7309b.a r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            ze.b$a r1 = r0.balance
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            int r2 = r0.f28010id
        Lc:
            ze.b r0 = r0.copy(r1, r2)
            return r0
    }

    public final p456ze.C7309b.a component1() {
            r1 = this;
            ze.b$a r0 = r1.balance
            return r0
    }

    public final int component2() {
            r1 = this;
            int r0 = r1.f28010id
            return r0
    }

    public final p456ze.C7309b copy(p456ze.C7309b.a r2, int r3) {
            r1 = this;
            java.lang.String r0 = "balance"
            p214m2.C4339q.m9706k(r2, r0)
            ze.b r0 = new ze.b
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p456ze.C7309b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ze.b r5 = (p456ze.C7309b) r5
            ze.b$a r1 = r4.balance
            ze.b$a r3 = r5.balance
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.f28010id
            int r5 = r5.f28010id
            if (r1 == r5) goto L1e
            return r2
        L1e:
            return r0
    }

    public final p456ze.C7309b.a getBalance() {
            r1 = this;
            ze.b$a r0 = r1.balance
            return r0
    }

    public final int getId() {
            r1 = this;
            int r0 = r1.f28010id
            return r0
    }

    public int hashCode() {
            r2 = this;
            ze.b$a r0 = r2.balance
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.f28010id
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "BluDACBank(balance="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            ze.b$a r1 = r3.balance
            r0.append(r1)
            java.lang.String r1 = ", id="
            r0.append(r1)
            int r1 = r3.f28010id
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
