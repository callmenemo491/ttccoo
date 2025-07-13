package kg;

/* renamed from: kg.d */
/* loaded from: classes.dex */
public final class C4124d {
    private final java.lang.String account;
    private final java.util.List<kg.C4124d.a> bonus;
    private final java.util.List<kg.C4124d.b> extractors;
    private final int last_claim;
    private final long to_claim;

    /* renamed from: kg.d$a */
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

        public static /* synthetic */ kg.C4124d.a copy$default(kg.C4124d.a r0, java.lang.String r1, int r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                java.lang.String r1 = r0.key
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                int r2 = r0.value
            Lc:
                kg.d$a r0 = r0.copy(r1, r2)
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

        public final kg.C4124d.a copy(java.lang.String r2, int r3) {
                r1 = this;
                java.lang.String r0 = "key"
                p214m2.C4339q.m9706k(r2, r0)
                kg.d$a r0 = new kg.d$a
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof kg.C4124d.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kg.d$a r5 = (kg.C4124d.a) r5
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
                java.lang.String r0 = "Bonus(key="
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

    /* renamed from: kg.d$b */
    public static final class b {
        private final java.lang.String key;
        private final int value;

        public b(java.lang.String r2, int r3) {
                r1 = this;
                java.lang.String r0 = "key"
                p214m2.C4339q.m9706k(r2, r0)
                r1.<init>()
                r1.key = r2
                r1.value = r3
                return
        }

        public static /* synthetic */ kg.C4124d.b copy$default(kg.C4124d.b r0, java.lang.String r1, int r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                java.lang.String r1 = r0.key
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                int r2 = r0.value
            Lc:
                kg.d$b r0 = r0.copy(r1, r2)
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

        public final kg.C4124d.b copy(java.lang.String r2, int r3) {
                r1 = this;
                java.lang.String r0 = "key"
                p214m2.C4339q.m9706k(r2, r0)
                kg.d$b r0 = new kg.d$b
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof kg.C4124d.b
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kg.d$b r5 = (kg.C4124d.b) r5
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
                java.lang.String r0 = "Extractor(key="
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

    public C4124d(java.lang.String r2, java.util.List<kg.C4124d.a> r3, java.util.List<kg.C4124d.b> r4, int r5, long r6) {
            r1 = this;
            java.lang.String r0 = "account"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "bonus"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "extractors"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.account = r2
            r1.bonus = r3
            r1.extractors = r4
            r1.last_claim = r5
            r1.to_claim = r6
            return
    }

    public static /* synthetic */ kg.C4124d copy$default(kg.C4124d r4, java.lang.String r5, java.util.List r6, java.util.List r7, int r8, long r9, int r11, java.lang.Object r12) {
            r12 = r11 & 1
            if (r12 == 0) goto L6
            java.lang.String r5 = r4.account
        L6:
            r12 = r11 & 2
            if (r12 == 0) goto Lc
            java.util.List<kg.d$a> r6 = r4.bonus
        Lc:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L13
            java.util.List<kg.d$b> r7 = r4.extractors
        L13:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L1a
            int r8 = r4.last_claim
        L1a:
            r1 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L21
            long r9 = r4.to_claim
        L21:
            r2 = r9
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            kg.d r4 = r6.copy(r7, r8, r9, r10, r11)
            return r4
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.account
            return r0
    }

    public final java.util.List<kg.C4124d.a> component2() {
            r1 = this;
            java.util.List<kg.d$a> r0 = r1.bonus
            return r0
    }

    public final java.util.List<kg.C4124d.b> component3() {
            r1 = this;
            java.util.List<kg.d$b> r0 = r1.extractors
            return r0
    }

    public final int component4() {
            r1 = this;
            int r0 = r1.last_claim
            return r0
    }

    public final long component5() {
            r2 = this;
            long r0 = r2.to_claim
            return r0
    }

    public final kg.C4124d copy(java.lang.String r9, java.util.List<kg.C4124d.a> r10, java.util.List<kg.C4124d.b> r11, int r12, long r13) {
            r8 = this;
            java.lang.String r0 = "account"
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "bonus"
            p214m2.C4339q.m9706k(r10, r0)
            java.lang.String r0 = "extractors"
            p214m2.C4339q.m9706k(r11, r0)
            kg.d r0 = new kg.d
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof kg.C4124d
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kg.d r8 = (kg.C4124d) r8
            java.lang.String r1 = r7.account
            java.lang.String r3 = r8.account
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List<kg.d$a> r1 = r7.bonus
            java.util.List<kg.d$a> r3 = r8.bonus
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.util.List<kg.d$b> r1 = r7.extractors
            java.util.List<kg.d$b> r3 = r8.extractors
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            int r1 = r7.last_claim
            int r3 = r8.last_claim
            if (r1 == r3) goto L34
            return r2
        L34:
            long r3 = r7.to_claim
            long r5 = r8.to_claim
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L3d
            return r2
        L3d:
            return r0
    }

    public final java.lang.String getAccount() {
            r1 = this;
            java.lang.String r0 = r1.account
            return r0
    }

    public final java.util.List<kg.C4124d.a> getBonus() {
            r1 = this;
            java.util.List<kg.d$a> r0 = r1.bonus
            return r0
    }

    public final java.util.List<kg.C4124d.b> getExtractors() {
            r1 = this;
            java.util.List<kg.d$b> r0 = r1.extractors
            return r0
    }

    public final int getLast_claim() {
            r1 = this;
            int r0 = r1.last_claim
            return r0
    }

    public final long getTo_claim() {
            r2 = this;
            long r0 = r2.to_claim
            return r0
    }

    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.account
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List<kg.d$a> r1 = r5.bonus
            r2 = 31
            int r0 = p255od.C5212k0.m11509a(r1, r0, r2)
            java.util.List<kg.d$b> r1 = r5.extractors
            int r0 = p255od.C5212k0.m11509a(r1, r0, r2)
            int r1 = r5.last_claim
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r5.to_claim
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "TUClaimer(account="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.account
            r0.append(r1)
            java.lang.String r1 = ", bonus="
            r0.append(r1)
            java.util.List<kg.d$a> r1 = r3.bonus
            r0.append(r1)
            java.lang.String r1 = ", extractors="
            r0.append(r1)
            java.util.List<kg.d$b> r1 = r3.extractors
            r0.append(r1)
            java.lang.String r1 = ", last_claim="
            r0.append(r1)
            int r1 = r3.last_claim
            r0.append(r1)
            java.lang.String r1 = ", to_claim="
            r0.append(r1)
            long r1 = r3.to_claim
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
