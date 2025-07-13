package p151if;

/* renamed from: if.c */
/* loaded from: classes.dex */
public final class C3140c {
    private final boolean more;
    private final java.lang.String next_key;
    private final java.util.List<p151if.C3140c.a> rows;

    /* renamed from: if.c$a */
    public static final class a {
        private final java.lang.String account;
        private final java.lang.String lastreward;
        private final java.util.List<java.lang.String> quantities;

        public a(java.lang.String r2, java.lang.String r3, java.util.List<java.lang.String> r4) {
                r1 = this;
                java.lang.String r0 = "account"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "lastreward"
                p214m2.C4339q.m9706k(r3, r0)
                java.lang.String r0 = "quantities"
                p214m2.C4339q.m9706k(r4, r0)
                r1.<init>()
                r1.account = r2
                r1.lastreward = r3
                r1.quantities = r4
                return
        }

        public static /* synthetic */ p151if.C3140c.a copy$default(p151if.C3140c.a r0, java.lang.String r1, java.lang.String r2, java.util.List r3, int r4, java.lang.Object r5) {
                r5 = r4 & 1
                if (r5 == 0) goto L6
                java.lang.String r1 = r0.account
            L6:
                r5 = r4 & 2
                if (r5 == 0) goto Lc
                java.lang.String r2 = r0.lastreward
            Lc:
                r4 = r4 & 4
                if (r4 == 0) goto L12
                java.util.List<java.lang.String> r3 = r0.quantities
            L12:
                if.c$a r0 = r0.copy(r1, r2, r3)
                return r0
        }

        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.account
                return r0
        }

        public final java.lang.String component2() {
                r1 = this;
                java.lang.String r0 = r1.lastreward
                return r0
        }

        public final java.util.List<java.lang.String> component3() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.quantities
                return r0
        }

        public final p151if.C3140c.a copy(java.lang.String r2, java.lang.String r3, java.util.List<java.lang.String> r4) {
                r1 = this;
                java.lang.String r0 = "account"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "lastreward"
                p214m2.C4339q.m9706k(r3, r0)
                java.lang.String r0 = "quantities"
                p214m2.C4339q.m9706k(r4, r0)
                if.c$a r0 = new if.c$a
                r0.<init>(r2, r3, r4)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof p151if.C3140c.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                if.c$a r5 = (p151if.C3140c.a) r5
                java.lang.String r1 = r4.account
                java.lang.String r3 = r5.account
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.lastreward
                java.lang.String r3 = r5.lastreward
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                java.util.List<java.lang.String> r1 = r4.quantities
                java.util.List<java.lang.String> r5 = r5.quantities
                boolean r5 = p214m2.C4339q.m9702c(r1, r5)
                if (r5 != 0) goto L2d
                return r2
            L2d:
                return r0
        }

        public final java.lang.String getAccount() {
                r1 = this;
                java.lang.String r0 = r1.account
                return r0
        }

        public final java.lang.String getLastreward() {
                r1 = this;
                java.lang.String r0 = r1.lastreward
                return r0
        }

        public final java.util.List<java.lang.String> getQuantities() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.quantities
                return r0
        }

        public int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.account
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r3.lastreward
                r2 = 31
                int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
                java.util.List<java.lang.String> r1 = r3.quantities
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "Row(account="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r3.account
                r0.append(r1)
                java.lang.String r1 = ", lastreward="
                r0.append(r1)
                java.lang.String r1 = r3.lastreward
                r0.append(r1)
                java.lang.String r1 = ", quantities="
                r0.append(r1)
                java.util.List<java.lang.String> r1 = r3.quantities
                r2 = 41
                java.lang.String r0 = p213m1.C4320f.m9652a(r0, r1, r2)
                return r0
        }
    }

    public C3140c(boolean r2, java.lang.String r3, java.util.List<p151if.C3140c.a> r4) {
            r1 = this;
            java.lang.String r0 = "next_key"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "rows"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.more = r2
            r1.next_key = r3
            r1.rows = r4
            return
    }

    public static /* synthetic */ p151if.C3140c copy$default(p151if.C3140c r0, boolean r1, java.lang.String r2, java.util.List r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            boolean r1 = r0.more
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.lang.String r2 = r0.next_key
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            java.util.List<if.c$a> r3 = r0.rows
        L12:
            if.c r0 = r0.copy(r1, r2, r3)
            return r0
    }

    public final boolean component1() {
            r1 = this;
            boolean r0 = r1.more
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.next_key
            return r0
    }

    public final java.util.List<p151if.C3140c.a> component3() {
            r1 = this;
            java.util.List<if.c$a> r0 = r1.rows
            return r0
    }

    public final p151if.C3140c copy(boolean r2, java.lang.String r3, java.util.List<p151if.C3140c.a> r4) {
            r1 = this;
            java.lang.String r0 = "next_key"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "rows"
            p214m2.C4339q.m9706k(r4, r0)
            if.c r0 = new if.c
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p151if.C3140c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            if.c r5 = (p151if.C3140c) r5
            boolean r1 = r4.more
            boolean r3 = r5.more
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.next_key
            java.lang.String r3 = r5.next_key
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.util.List<if.c$a> r1 = r4.rows
            java.util.List<if.c$a> r5 = r5.rows
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L29
            return r2
        L29:
            return r0
    }

    public final boolean getMore() {
            r1 = this;
            boolean r0 = r1.more
            return r0
    }

    public final java.lang.String getNext_key() {
            r1 = this;
            java.lang.String r0 = r1.next_key
            return r0
    }

    public final java.util.List<p151if.C3140c.a> getRows() {
            r1 = this;
            java.util.List<if.c$a> r0 = r1.rows
            return r0
    }

    public int hashCode() {
            r3 = this;
            boolean r0 = r3.more
            if (r0 == 0) goto L5
            r0 = 1
        L5:
            int r0 = r0 * 31
            java.lang.String r1 = r3.next_key
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.util.List<if.c$a> r1 = r3.rows
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ColonizeMarsResponse(more="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            boolean r1 = r3.more
            r0.append(r1)
            java.lang.String r1 = ", next_key="
            r0.append(r1)
            java.lang.String r1 = r3.next_key
            r0.append(r1)
            java.lang.String r1 = ", rows="
            r0.append(r1)
            java.util.List<if.c$a> r1 = r3.rows
            r2 = 41
            java.lang.String r0 = p213m1.C4320f.m9652a(r0, r1, r2)
            return r0
    }
}
