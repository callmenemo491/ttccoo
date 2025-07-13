package p456ze;

/* renamed from: ze.e */
/* loaded from: classes.dex */
public final class C7312e {

    /* renamed from: id */
    private final int f28011id;
    private final java.util.List<p456ze.C7312e.a> unclaimed_funds;
    private final p456ze.C7312e.b unclaimed_mining;

    /* renamed from: ze.e$a */
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

        public static /* synthetic */ p456ze.C7312e.a copy$default(p456ze.C7312e.a r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                java.lang.String r1 = r0.contract
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                java.lang.String r2 = r0.quantity
            Lc:
                ze.e$a r0 = r0.copy(r1, r2)
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

        public final p456ze.C7312e.a copy(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "contract"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "quantity"
                p214m2.C4339q.m9706k(r3, r0)
                ze.e$a r0 = new ze.e$a
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof p456ze.C7312e.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                ze.e$a r5 = (p456ze.C7312e.a) r5
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
                java.lang.String r0 = "UnclaimedFund(contract="
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

    /* renamed from: ze.e$b */
    public static final class b {
        private final java.lang.String contract;
        private final java.lang.String quantity;

        public b(java.lang.String r2, java.lang.String r3) {
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

        public static /* synthetic */ p456ze.C7312e.b copy$default(p456ze.C7312e.b r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                java.lang.String r1 = r0.contract
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                java.lang.String r2 = r0.quantity
            Lc:
                ze.e$b r0 = r0.copy(r1, r2)
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

        public final p456ze.C7312e.b copy(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "contract"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "quantity"
                p214m2.C4339q.m9706k(r3, r0)
                ze.e$b r0 = new ze.e$b
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof p456ze.C7312e.b
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                ze.e$b r5 = (p456ze.C7312e.b) r5
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
                java.lang.String r0 = "UnclaimedMining(contract="
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

    public C7312e(int r2, java.util.List<p456ze.C7312e.a> r3, p456ze.C7312e.b r4) {
            r1 = this;
            java.lang.String r0 = "unclaimed_funds"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "unclaimed_mining"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.f28011id = r2
            r1.unclaimed_funds = r3
            r1.unclaimed_mining = r4
            return
    }

    public static /* synthetic */ p456ze.C7312e copy$default(p456ze.C7312e r0, int r1, java.util.List r2, p456ze.C7312e.b r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            int r1 = r0.f28011id
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.util.List<ze.e$a> r2 = r0.unclaimed_funds
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            ze.e$b r3 = r0.unclaimed_mining
        L12:
            ze.e r0 = r0.copy(r1, r2, r3)
            return r0
    }

    public final int component1() {
            r1 = this;
            int r0 = r1.f28011id
            return r0
    }

    public final java.util.List<p456ze.C7312e.a> component2() {
            r1 = this;
            java.util.List<ze.e$a> r0 = r1.unclaimed_funds
            return r0
    }

    public final p456ze.C7312e.b component3() {
            r1 = this;
            ze.e$b r0 = r1.unclaimed_mining
            return r0
    }

    public final p456ze.C7312e copy(int r2, java.util.List<p456ze.C7312e.a> r3, p456ze.C7312e.b r4) {
            r1 = this;
            java.lang.String r0 = "unclaimed_funds"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "unclaimed_mining"
            p214m2.C4339q.m9706k(r4, r0)
            ze.e r0 = new ze.e
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p456ze.C7312e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ze.e r5 = (p456ze.C7312e) r5
            int r1 = r4.f28011id
            int r3 = r5.f28011id
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.List<ze.e$a> r1 = r4.unclaimed_funds
            java.util.List<ze.e$a> r3 = r5.unclaimed_funds
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            ze.e$b r1 = r4.unclaimed_mining
            ze.e$b r5 = r5.unclaimed_mining
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L29
            return r2
        L29:
            return r0
    }

    public final int getId() {
            r1 = this;
            int r0 = r1.f28011id
            return r0
    }

    public final java.util.List<p456ze.C7312e.a> getUnclaimed_funds() {
            r1 = this;
            java.util.List<ze.e$a> r0 = r1.unclaimed_funds
            return r0
    }

    public final p456ze.C7312e.b getUnclaimed_mining() {
            r1 = this;
            ze.e$b r0 = r1.unclaimed_mining
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.f28011id
            int r0 = r0 * 31
            java.util.List<ze.e$a> r1 = r3.unclaimed_funds
            r2 = 31
            int r0 = p255od.C5212k0.m11509a(r1, r0, r2)
            ze.e$b r1 = r3.unclaimed_mining
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "BluDACTranche(id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r2.f28011id
            r0.append(r1)
            java.lang.String r1 = ", unclaimed_funds="
            r0.append(r1)
            java.util.List<ze.e$a> r1 = r2.unclaimed_funds
            r0.append(r1)
            java.lang.String r1 = ", unclaimed_mining="
            r0.append(r1)
            ze.e$b r1 = r2.unclaimed_mining
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
