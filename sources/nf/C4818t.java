package nf;

/* renamed from: nf.t */
/* loaded from: classes.dex */
public final class C4818t {
    private final java.util.List<nf.C4818t.a> balances;

    /* renamed from: nf.t$a */
    public static final class a {
        private final java.lang.String key;
        private final java.lang.String value;

        public a(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "key"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "value"
                p214m2.C4339q.m9706k(r3, r0)
                r1.<init>()
                r1.key = r2
                r1.value = r3
                return
        }

        public static /* synthetic */ nf.C4818t.a copy$default(nf.C4818t.a r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                java.lang.String r1 = r0.key
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                java.lang.String r2 = r0.value
            Lc:
                nf.t$a r0 = r0.copy(r1, r2)
                return r0
        }

        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.key
                return r0
        }

        public final java.lang.String component2() {
                r1 = this;
                java.lang.String r0 = r1.value
                return r0
        }

        public final nf.C4818t.a copy(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "key"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "value"
                p214m2.C4339q.m9706k(r3, r0)
                nf.t$a r0 = new nf.t$a
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof nf.C4818t.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                nf.t$a r5 = (nf.C4818t.a) r5
                java.lang.String r1 = r4.key
                java.lang.String r3 = r5.key
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.value
                java.lang.String r5 = r5.value
                boolean r5 = p214m2.C4339q.m9702c(r1, r5)
                if (r5 != 0) goto L22
                return r2
            L22:
                return r0
        }

        public final java.lang.String getKey() {
                r1 = this;
                java.lang.String r0 = r1.key
                return r0
        }

        public final java.lang.String getValue() {
                r1 = this;
                java.lang.String r0 = r1.value
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.key
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r2.value
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "Balance(key="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r3.key
                r0.append(r1)
                java.lang.String r1 = ", value="
                r0.append(r1)
                java.lang.String r1 = r3.value
                r2 = 41
                java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
                return r0
        }
    }

    public C4818t(java.util.List<nf.C4818t.a> r2) {
            r1 = this;
            java.lang.String r0 = "balances"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.balances = r2
            return
    }

    public static /* synthetic */ nf.C4818t copy$default(nf.C4818t r0, java.util.List r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.util.List<nf.t$a> r1 = r0.balances
        L6:
            nf.t r0 = r0.copy(r1)
            return r0
    }

    public final java.util.List<nf.C4818t.a> component1() {
            r1 = this;
            java.util.List<nf.t$a> r0 = r1.balances
            return r0
    }

    public final nf.C4818t copy(java.util.List<nf.C4818t.a> r2) {
            r1 = this;
            java.lang.String r0 = "balances"
            p214m2.C4339q.m9706k(r2, r0)
            nf.t r0 = new nf.t
            r0.<init>(r2)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof nf.C4818t
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            nf.t r4 = (nf.C4818t) r4
            java.util.List<nf.t$a> r1 = r3.balances
            java.util.List<nf.t$a> r4 = r4.balances
            boolean r4 = p214m2.C4339q.m9702c(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final java.util.List<nf.C4818t.a> getBalances() {
            r1 = this;
            java.util.List<nf.t$a> r0 = r1.balances
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.util.List<nf.t$a> r0 = r1.balances
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "WalletFT(balances="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.util.List<nf.t$a> r1 = r3.balances
            r2 = 41
            java.lang.String r0 = p213m1.C4320f.m9652a(r0, r1, r2)
            return r0
    }
}
