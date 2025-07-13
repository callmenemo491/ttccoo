package p456ze;

/* renamed from: ze.c */
/* loaded from: classes.dex */
public final class C7310c {
    private final long entry_time;
    private final int last_tranche_id;
    private final java.lang.String mine;
    private final p456ze.C7310c.a mining;

    /* renamed from: ze.c$a */
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

        public static /* synthetic */ p456ze.C7310c.a copy$default(p456ze.C7310c.a r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                java.lang.String r1 = r0.contract
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                java.lang.String r2 = r0.quantity
            Lc:
                ze.c$a r0 = r0.copy(r1, r2)
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

        public final p456ze.C7310c.a copy(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "contract"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "quantity"
                p214m2.C4339q.m9706k(r3, r0)
                ze.c$a r0 = new ze.c$a
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof p456ze.C7310c.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                ze.c$a r5 = (p456ze.C7310c.a) r5
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
                java.lang.String r0 = "Mining(contract="
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

    public C7310c(java.lang.String r2, long r3, int r5, p456ze.C7310c.a r6) {
            r1 = this;
            java.lang.String r0 = "mine"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "mining"
            p214m2.C4339q.m9706k(r6, r0)
            r1.<init>()
            r1.mine = r2
            r1.entry_time = r3
            r1.last_tranche_id = r5
            r1.mining = r6
            return
    }

    public static /* synthetic */ p456ze.C7310c copy$default(p456ze.C7310c r3, java.lang.String r4, long r5, int r7, p456ze.C7310c.a r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r4 = r3.mine
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            long r5 = r3.entry_time
        Lc:
            r0 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L13
            int r7 = r3.last_tranche_id
        L13:
            r10 = r7
            r5 = r9 & 8
            if (r5 == 0) goto L1a
            ze.c$a r8 = r3.mining
        L1a:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r0
            r9 = r10
            r10 = r2
            ze.c r3 = r5.copy(r6, r7, r9, r10)
            return r3
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.mine
            return r0
    }

    public final long component2() {
            r2 = this;
            long r0 = r2.entry_time
            return r0
    }

    public final int component3() {
            r1 = this;
            int r0 = r1.last_tranche_id
            return r0
    }

    public final p456ze.C7310c.a component4() {
            r1 = this;
            ze.c$a r0 = r1.mining
            return r0
    }

    public final p456ze.C7310c copy(java.lang.String r8, long r9, int r11, p456ze.C7310c.a r12) {
            r7 = this;
            java.lang.String r0 = "mine"
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "mining"
            p214m2.C4339q.m9706k(r12, r0)
            ze.c r0 = new ze.c
            r1 = r0
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r5, r6)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p456ze.C7310c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ze.c r8 = (p456ze.C7310c) r8
            java.lang.String r1 = r7.mine
            java.lang.String r3 = r8.mine
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.entry_time
            long r5 = r8.entry_time
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L20
            return r2
        L20:
            int r1 = r7.last_tranche_id
            int r3 = r8.last_tranche_id
            if (r1 == r3) goto L27
            return r2
        L27:
            ze.c$a r1 = r7.mining
            ze.c$a r8 = r8.mining
            boolean r8 = p214m2.C4339q.m9702c(r1, r8)
            if (r8 != 0) goto L32
            return r2
        L32:
            return r0
    }

    public final long getEntry_time() {
            r2 = this;
            long r0 = r2.entry_time
            return r0
    }

    public final int getLast_tranche_id() {
            r1 = this;
            int r0 = r1.last_tranche_id
            return r0
    }

    public final java.lang.String getMine() {
            r1 = this;
            java.lang.String r0 = r1.mine
            return r0
    }

    public final p456ze.C7310c.a getMining() {
            r1 = this;
            ze.c$a r0 = r1.mining
            return r0
    }

    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.mine
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            long r1 = r5.entry_time
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r5.last_tranche_id
            int r0 = r0 + r1
            int r0 = r0 * 31
            ze.c$a r1 = r5.mining
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "BluDACMyPool(mine="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.mine
            r0.append(r1)
            java.lang.String r1 = ", entry_time="
            r0.append(r1)
            long r1 = r3.entry_time
            r0.append(r1)
            java.lang.String r1 = ", last_tranche_id="
            r0.append(r1)
            int r1 = r3.last_tranche_id
            r0.append(r1)
            java.lang.String r1 = ", mining="
            r0.append(r1)
            ze.c$a r1 = r3.mining
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
