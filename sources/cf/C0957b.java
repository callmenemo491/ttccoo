package cf;

/* renamed from: cf.b */
/* loaded from: classes.dex */
public final class C0957b {
    private final java.lang.String account;
    private final cf.C0957b.a data;

    /* renamed from: cf.b$a */
    public static final class a {
        private final java.util.List<cf.C0957b.a.C7370a> castles;
        private final java.util.List<cf.C0957b.a.C7370a> factions;
        private final java.lang.String last_claim;
        private final java.util.List<cf.C0957b.a.C7370a> types;
        private final java.lang.String unclaimed;

        /* renamed from: cf.b$a$a, reason: collision with other inner class name */
        public static final class C7370a {
            private final java.lang.String key;
            private final int value;

            public C7370a(java.lang.String r2, int r3) {
                    r1 = this;
                    java.lang.String r0 = "key"
                    p214m2.C4339q.m9706k(r2, r0)
                    r1.<init>()
                    r1.key = r2
                    r1.value = r3
                    return
            }

            public static /* synthetic */ cf.C0957b.a.C7370a copy$default(cf.C0957b.a.C7370a r0, java.lang.String r1, int r2, int r3, java.lang.Object r4) {
                    r4 = r3 & 1
                    if (r4 == 0) goto L6
                    java.lang.String r1 = r0.key
                L6:
                    r3 = r3 & 2
                    if (r3 == 0) goto Lc
                    int r2 = r0.value
                Lc:
                    cf.b$a$a r0 = r0.copy(r1, r2)
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

            public final cf.C0957b.a.C7370a copy(java.lang.String r2, int r3) {
                    r1 = this;
                    java.lang.String r0 = "key"
                    p214m2.C4339q.m9706k(r2, r0)
                    cf.b$a$a r0 = new cf.b$a$a
                    r0.<init>(r2, r3)
                    return r0
            }

            public boolean equals(java.lang.Object r5) {
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    boolean r1 = r5 instanceof cf.C0957b.a.C7370a
                    r2 = 0
                    if (r1 != 0) goto La
                    return r2
                La:
                    cf.b$a$a r5 = (cf.C0957b.a.C7370a) r5
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
                    java.lang.String r0 = "TypeData(key="
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

        public a(java.util.List<cf.C0957b.a.C7370a> r2, java.util.List<cf.C0957b.a.C7370a> r3, java.lang.String r4, java.util.List<cf.C0957b.a.C7370a> r5, java.lang.String r6) {
                r1 = this;
                java.lang.String r0 = "castles"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "factions"
                p214m2.C4339q.m9706k(r3, r0)
                java.lang.String r0 = "last_claim"
                p214m2.C4339q.m9706k(r4, r0)
                java.lang.String r0 = "types"
                p214m2.C4339q.m9706k(r5, r0)
                java.lang.String r0 = "unclaimed"
                p214m2.C4339q.m9706k(r6, r0)
                r1.<init>()
                r1.castles = r2
                r1.factions = r3
                r1.last_claim = r4
                r1.types = r5
                r1.unclaimed = r6
                return
        }

        public static /* synthetic */ cf.C0957b.a copy$default(cf.C0957b.a r3, java.util.List r4, java.util.List r5, java.lang.String r6, java.util.List r7, java.lang.String r8, int r9, java.lang.Object r10) {
                r10 = r9 & 1
                if (r10 == 0) goto L6
                java.util.List<cf.b$a$a> r4 = r3.castles
            L6:
                r10 = r9 & 2
                if (r10 == 0) goto Lc
                java.util.List<cf.b$a$a> r5 = r3.factions
            Lc:
                r10 = r5
                r5 = r9 & 4
                if (r5 == 0) goto L13
                java.lang.String r6 = r3.last_claim
            L13:
                r0 = r6
                r5 = r9 & 8
                if (r5 == 0) goto L1a
                java.util.List<cf.b$a$a> r7 = r3.types
            L1a:
                r1 = r7
                r5 = r9 & 16
                if (r5 == 0) goto L21
                java.lang.String r8 = r3.unclaimed
            L21:
                r2 = r8
                r5 = r3
                r6 = r4
                r7 = r10
                r8 = r0
                r9 = r1
                r10 = r2
                cf.b$a r3 = r5.copy(r6, r7, r8, r9, r10)
                return r3
        }

        public final java.util.List<cf.C0957b.a.C7370a> component1() {
                r1 = this;
                java.util.List<cf.b$a$a> r0 = r1.castles
                return r0
        }

        public final java.util.List<cf.C0957b.a.C7370a> component2() {
                r1 = this;
                java.util.List<cf.b$a$a> r0 = r1.factions
                return r0
        }

        public final java.lang.String component3() {
                r1 = this;
                java.lang.String r0 = r1.last_claim
                return r0
        }

        public final java.util.List<cf.C0957b.a.C7370a> component4() {
                r1 = this;
                java.util.List<cf.b$a$a> r0 = r1.types
                return r0
        }

        public final java.lang.String component5() {
                r1 = this;
                java.lang.String r0 = r1.unclaimed
                return r0
        }

        public final cf.C0957b.a copy(java.util.List<cf.C0957b.a.C7370a> r8, java.util.List<cf.C0957b.a.C7370a> r9, java.lang.String r10, java.util.List<cf.C0957b.a.C7370a> r11, java.lang.String r12) {
                r7 = this;
                java.lang.String r0 = "castles"
                p214m2.C4339q.m9706k(r8, r0)
                java.lang.String r0 = "factions"
                p214m2.C4339q.m9706k(r9, r0)
                java.lang.String r0 = "last_claim"
                p214m2.C4339q.m9706k(r10, r0)
                java.lang.String r0 = "types"
                p214m2.C4339q.m9706k(r11, r0)
                java.lang.String r0 = "unclaimed"
                p214m2.C4339q.m9706k(r12, r0)
                cf.b$a r0 = new cf.b$a
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
                boolean r1 = r5 instanceof cf.C0957b.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                cf.b$a r5 = (cf.C0957b.a) r5
                java.util.List<cf.b$a$a> r1 = r4.castles
                java.util.List<cf.b$a$a> r3 = r5.castles
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.util.List<cf.b$a$a> r1 = r4.factions
                java.util.List<cf.b$a$a> r3 = r5.factions
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                java.lang.String r1 = r4.last_claim
                java.lang.String r3 = r5.last_claim
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L2d
                return r2
            L2d:
                java.util.List<cf.b$a$a> r1 = r4.types
                java.util.List<cf.b$a$a> r3 = r5.types
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L38
                return r2
            L38:
                java.lang.String r1 = r4.unclaimed
                java.lang.String r5 = r5.unclaimed
                boolean r5 = p214m2.C4339q.m9702c(r1, r5)
                if (r5 != 0) goto L43
                return r2
            L43:
                return r0
        }

        public final java.util.List<cf.C0957b.a.C7370a> getCastles() {
                r1 = this;
                java.util.List<cf.b$a$a> r0 = r1.castles
                return r0
        }

        public final java.util.List<cf.C0957b.a.C7370a> getFactions() {
                r1 = this;
                java.util.List<cf.b$a$a> r0 = r1.factions
                return r0
        }

        public final java.lang.String getLast_claim() {
                r1 = this;
                java.lang.String r0 = r1.last_claim
                return r0
        }

        public final java.util.List<cf.C0957b.a.C7370a> getTypes() {
                r1 = this;
                java.util.List<cf.b$a$a> r0 = r1.types
                return r0
        }

        public final java.lang.String getUnclaimed() {
                r1 = this;
                java.lang.String r0 = r1.unclaimed
                return r0
        }

        public int hashCode() {
                r3 = this;
                java.util.List<cf.b$a$a> r0 = r3.castles
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.util.List<cf.b$a$a> r1 = r3.factions
                r2 = 31
                int r0 = p255od.C5212k0.m11509a(r1, r0, r2)
                java.lang.String r1 = r3.last_claim
                int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
                java.util.List<cf.b$a$a> r1 = r3.types
                int r0 = p255od.C5212k0.m11509a(r1, r0, r2)
                java.lang.String r1 = r3.unclaimed
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "Data(castles="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.util.List<cf.b$a$a> r1 = r3.castles
                r0.append(r1)
                java.lang.String r1 = ", factions="
                r0.append(r1)
                java.util.List<cf.b$a$a> r1 = r3.factions
                r0.append(r1)
                java.lang.String r1 = ", last_claim="
                r0.append(r1)
                java.lang.String r1 = r3.last_claim
                r0.append(r1)
                java.lang.String r1 = ", types="
                r0.append(r1)
                java.util.List<cf.b$a$a> r1 = r3.types
                r0.append(r1)
                java.lang.String r1 = ", unclaimed="
                r0.append(r1)
                java.lang.String r1 = r3.unclaimed
                r2 = 41
                java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
                return r0
        }
    }

    public C0957b(java.lang.String r2, cf.C0957b.a r3) {
            r1 = this;
            java.lang.String r0 = "account"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.account = r2
            r1.data = r3
            return
    }

    public static /* synthetic */ cf.C0957b copy$default(cf.C0957b r0, java.lang.String r1, cf.C0957b.a r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = r0.account
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            cf.b$a r2 = r0.data
        Lc:
            cf.b r0 = r0.copy(r1, r2)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.account
            return r0
    }

    public final cf.C0957b.a component2() {
            r1 = this;
            cf.b$a r0 = r1.data
            return r0
    }

    public final cf.C0957b copy(java.lang.String r2, cf.C0957b.a r3) {
            r1 = this;
            java.lang.String r0 = "account"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r3, r0)
            cf.b r0 = new cf.b
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof cf.C0957b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            cf.b r5 = (cf.C0957b) r5
            java.lang.String r1 = r4.account
            java.lang.String r3 = r5.account
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            cf.b$a r1 = r4.data
            cf.b$a r5 = r5.data
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final java.lang.String getAccount() {
            r1 = this;
            java.lang.String r0 = r1.account
            return r0
    }

    public final cf.C0957b.a getData() {
            r1 = this;
            cf.b$a r0 = r1.data
            return r0
    }

    public final long getUnclaimedValue() {
            r4 = this;
            cf.b$a r0 = r4.data
            java.lang.String r0 = r0.getUnclaimed()
            java.lang.String r1 = " "
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 0
            r3 = 6
            java.util.List r0 = p362uh.C6467m.m13080k0(r0, r1, r2, r2, r3)
            java.lang.Object r0 = p062dh.C1473i.m3996H(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L25
            java.lang.Long r0 = p362uh.C6462h.m13050G(r0)
            if (r0 == 0) goto L25
            long r0 = r0.longValue()
            goto L27
        L25:
            r0 = 0
        L27:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.account
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            cf.b$a r1 = r2.data
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "CastleUser(account="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.account
            r0.append(r1)
            java.lang.String r1 = ", data="
            r0.append(r1)
            cf.b$a r1 = r2.data
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
