package nf;

/* renamed from: nf.h */
/* loaded from: classes.dex */
public final class C4806h {

    /* renamed from: id */
    private final int f19204id;
    private final java.util.List<nf.C4806h.a> withdraw_fees;
    private final java.util.List<java.lang.Object> withdraw_mins;

    /* renamed from: nf.h$a */
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

        public static /* synthetic */ nf.C4806h.a copy$default(nf.C4806h.a r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                java.lang.String r1 = r0.key
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                java.lang.String r2 = r0.value
            Lc:
                nf.h$a r0 = r0.copy(r1, r2)
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

        public final nf.C4806h.a copy(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "key"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "value"
                p214m2.C4339q.m9706k(r3, r0)
                nf.h$a r0 = new nf.h$a
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof nf.C4806h.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                nf.h$a r5 = (nf.C4806h.a) r5
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
                java.lang.String r0 = "WithdrawFee(key="
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

    public C4806h(int r2, java.util.List<nf.C4806h.a> r3, java.util.List<java.lang.Object> r4) {
            r1 = this;
            java.lang.String r0 = "withdraw_fees"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "withdraw_mins"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.f19204id = r2
            r1.withdraw_fees = r3
            r1.withdraw_mins = r4
            return
    }

    public static /* synthetic */ nf.C4806h copy$default(nf.C4806h r0, int r1, java.util.List r2, java.util.List r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            int r1 = r0.f19204id
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.util.List<nf.h$a> r2 = r0.withdraw_fees
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            java.util.List<java.lang.Object> r3 = r0.withdraw_mins
        L12:
            nf.h r0 = r0.copy(r1, r2, r3)
            return r0
    }

    public final int component1() {
            r1 = this;
            int r0 = r1.f19204id
            return r0
    }

    public final java.util.List<nf.C4806h.a> component2() {
            r1 = this;
            java.util.List<nf.h$a> r0 = r1.withdraw_fees
            return r0
    }

    public final java.util.List<java.lang.Object> component3() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.withdraw_mins
            return r0
    }

    public final nf.C4806h copy(int r2, java.util.List<nf.C4806h.a> r3, java.util.List<java.lang.Object> r4) {
            r1 = this;
            java.lang.String r0 = "withdraw_fees"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "withdraw_mins"
            p214m2.C4339q.m9706k(r4, r0)
            nf.h r0 = new nf.h
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof nf.C4806h
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            nf.h r5 = (nf.C4806h) r5
            int r1 = r4.f19204id
            int r3 = r5.f19204id
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.List<nf.h$a> r1 = r4.withdraw_fees
            java.util.List<nf.h$a> r3 = r5.withdraw_fees
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.util.List<java.lang.Object> r1 = r4.withdraw_mins
            java.util.List<java.lang.Object> r5 = r5.withdraw_mins
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L29
            return r2
        L29:
            return r0
    }

    public final int getId() {
            r1 = this;
            int r0 = r1.f19204id
            return r0
    }

    public final java.util.List<nf.C4806h.a> getWithdraw_fees() {
            r1 = this;
            java.util.List<nf.h$a> r0 = r1.withdraw_fees
            return r0
    }

    public final java.util.List<java.lang.Object> getWithdraw_mins() {
            r1 = this;
            java.util.List<java.lang.Object> r0 = r1.withdraw_mins
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.f19204id
            int r0 = r0 * 31
            java.util.List<nf.h$a> r1 = r3.withdraw_fees
            r2 = 31
            int r0 = p255od.C5212k0.m11509a(r1, r0, r2)
            java.util.List<java.lang.Object> r1 = r3.withdraw_mins
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ConfWallet(id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r3.f19204id
            r0.append(r1)
            java.lang.String r1 = ", withdraw_fees="
            r0.append(r1)
            java.util.List<nf.h$a> r1 = r3.withdraw_fees
            r0.append(r1)
            java.lang.String r1 = ", withdraw_mins="
            r0.append(r1)
            java.util.List<java.lang.Object> r1 = r3.withdraw_mins
            r2 = 41
            java.lang.String r0 = p213m1.C4320f.m9652a(r0, r1, r2)
            return r0
    }
}
