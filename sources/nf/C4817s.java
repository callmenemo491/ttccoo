package nf;

/* renamed from: nf.s */
/* loaded from: classes.dex */
public final class C4817s {
    private final java.lang.String barn_id;
    private final java.lang.String max_capacity;
    private final java.util.List<nf.C4817s.a> products;
    private final java.lang.String products_tot_sum;

    /* renamed from: nf.s$a */
    public static final class a {
        private final java.lang.String key;
        private final int value;

        public a(java.lang.String r2, int r3) {
                r1 = this;
                java.lang.String r0 = "key"
                p214m2.C4339q.m9706k(r2, r0)
                r1.<init>()
                r1.key = r2
                r1.value = r3
                return
        }

        public static /* synthetic */ nf.C4817s.a copy$default(nf.C4817s.a r0, java.lang.String r1, int r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                java.lang.String r1 = r0.key
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                int r2 = r0.value
            Lc:
                nf.s$a r0 = r0.copy(r1, r2)
                return r0
        }

        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.key
                return r0
        }

        public final int component2() {
                r1 = this;
                int r0 = r1.value
                return r0
        }

        public final nf.C4817s.a copy(java.lang.String r2, int r3) {
                r1 = this;
                java.lang.String r0 = "key"
                p214m2.C4339q.m9706k(r2, r0)
                nf.s$a r0 = new nf.s$a
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof nf.C4817s.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                nf.s$a r5 = (nf.C4817s.a) r5
                java.lang.String r1 = r4.key
                java.lang.String r3 = r5.key
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                int r1 = r4.value
                int r5 = r5.value
                if (r1 == r5) goto L1e
                return r2
            L1e:
                return r0
        }

        public final java.lang.String getKey() {
                r1 = this;
                java.lang.String r0 = r1.key
                return r0
        }

        public final int getValue() {
                r1 = this;
                int r0 = r1.value
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.key
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                int r1 = r2.value
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "Product(key="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r3.key
                r0.append(r1)
                java.lang.String r1 = ", value="
                r0.append(r1)
                int r1 = r3.value
                r2 = 41
                java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
                return r0
        }
    }

    public C4817s(java.lang.String r2, java.util.List<nf.C4817s.a> r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            java.lang.String r0 = "barn_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "products"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "max_capacity"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "products_tot_sum"
            p214m2.C4339q.m9706k(r5, r0)
            r1.<init>()
            r1.barn_id = r2
            r1.products = r3
            r1.max_capacity = r4
            r1.products_tot_sum = r5
            return
    }

    public static /* synthetic */ nf.C4817s copy$default(nf.C4817s r0, java.lang.String r1, java.util.List r2, java.lang.String r3, java.lang.String r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.lang.String r1 = r0.barn_id
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            java.util.List<nf.s$a> r2 = r0.products
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            java.lang.String r3 = r0.max_capacity
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            java.lang.String r4 = r0.products_tot_sum
        L18:
            nf.s r0 = r0.copy(r1, r2, r3, r4)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.barn_id
            return r0
    }

    public final java.util.List<nf.C4817s.a> component2() {
            r1 = this;
            java.util.List<nf.s$a> r0 = r1.products
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.max_capacity
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.products_tot_sum
            return r0
    }

    public final nf.C4817s copy(java.lang.String r2, java.util.List<nf.C4817s.a> r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            java.lang.String r0 = "barn_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "products"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "max_capacity"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "products_tot_sum"
            p214m2.C4339q.m9706k(r5, r0)
            nf.s r0 = new nf.s
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof nf.C4817s
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            nf.s r5 = (nf.C4817s) r5
            java.lang.String r1 = r4.barn_id
            java.lang.String r3 = r5.barn_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List<nf.s$a> r1 = r4.products
            java.util.List<nf.s$a> r3 = r5.products
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.max_capacity
            java.lang.String r3 = r5.max_capacity
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.products_tot_sum
            java.lang.String r5 = r5.products_tot_sum
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L38
            return r2
        L38:
            return r0
    }

    public final java.lang.String getBarn_id() {
            r1 = this;
            java.lang.String r0 = r1.barn_id
            return r0
    }

    public final java.lang.String getMax_capacity() {
            r1 = this;
            java.lang.String r0 = r1.max_capacity
            return r0
    }

    public final java.util.List<nf.C4817s.a> getProducts() {
            r1 = this;
            java.util.List<nf.s$a> r0 = r1.products
            return r0
    }

    public final java.lang.String getProducts_tot_sum() {
            r1 = this;
            java.lang.String r0 = r1.products_tot_sum
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.barn_id
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List<nf.s$a> r1 = r3.products
            r2 = 31
            int r0 = p255od.C5212k0.m11509a(r1, r0, r2)
            java.lang.String r1 = r3.max_capacity
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.products_tot_sum
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "UserBarnData(barn_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.barn_id
            r0.append(r1)
            java.lang.String r1 = ", products="
            r0.append(r1)
            java.util.List<nf.s$a> r1 = r3.products
            r0.append(r1)
            java.lang.String r1 = ", max_capacity="
            r0.append(r1)
            java.lang.String r1 = r3.max_capacity
            r0.append(r1)
            java.lang.String r1 = ", products_tot_sum="
            r0.append(r1)
            java.lang.String r1 = r3.products_tot_sum
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
