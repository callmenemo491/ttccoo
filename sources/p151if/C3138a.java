package p151if;

/* renamed from: if.a */
/* loaded from: classes.dex */
public final class C3138a {
    private final java.lang.String userName;
    private final p151if.C3138a.a wallet;

    /* renamed from: if.a$a */
    public static final class a {
        private final java.lang.String name;

        public a(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "name"
                p214m2.C4339q.m9706k(r2, r0)
                r1.<init>()
                r1.name = r2
                return
        }

        public static /* synthetic */ p151if.C3138a.a copy$default(p151if.C3138a.a r0, java.lang.String r1, int r2, java.lang.Object r3) {
                r2 = r2 & 1
                if (r2 == 0) goto L6
                java.lang.String r1 = r0.name
            L6:
                if.a$a r0 = r0.copy(r1)
                return r0
        }

        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        public final p151if.C3138a.a copy(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "name"
                p214m2.C4339q.m9706k(r2, r0)
                if.a$a r0 = new if.a$a
                r0.<init>(r2)
                return r0
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof p151if.C3138a.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                if.a$a r4 = (p151if.C3138a.a) r4
                java.lang.String r1 = r3.name
                java.lang.String r4 = r4.name
                boolean r4 = p214m2.C4339q.m9702c(r1, r4)
                if (r4 != 0) goto L17
                return r2
            L17:
                return r0
        }

        public final java.lang.String getName() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.String r0 = r1.name
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "Wallet(name="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r3.name
                r2 = 41
                java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
                return r0
        }
    }

    public C3138a(java.lang.String r2, p151if.C3138a.a r3) {
            r1 = this;
            java.lang.String r0 = "userName"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "wallet"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.userName = r2
            r1.wallet = r3
            return
    }

    public static /* synthetic */ p151if.C3138a copy$default(p151if.C3138a r0, java.lang.String r1, p151if.C3138a.a r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = r0.userName
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            if.a$a r2 = r0.wallet
        Lc:
            if.a r0 = r0.copy(r1, r2)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.userName
            return r0
    }

    public final p151if.C3138a.a component2() {
            r1 = this;
            if.a$a r0 = r1.wallet
            return r0
    }

    public final p151if.C3138a copy(java.lang.String r2, p151if.C3138a.a r3) {
            r1 = this;
            java.lang.String r0 = "userName"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "wallet"
            p214m2.C4339q.m9706k(r3, r0)
            if.a r0 = new if.a
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p151if.C3138a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            if.a r5 = (p151if.C3138a) r5
            java.lang.String r1 = r4.userName
            java.lang.String r3 = r5.userName
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            if.a$a r1 = r4.wallet
            if.a$a r5 = r5.wallet
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final java.lang.String getUserName() {
            r1 = this;
            java.lang.String r0 = r1.userName
            return r0
    }

    public final p151if.C3138a.a getWallet() {
            r1 = this;
            if.a$a r0 = r1.wallet
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.userName
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            if.a$a r1 = r2.wallet
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "ColonizeAccountInfo(userName="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.userName
            r0.append(r1)
            java.lang.String r1 = ", wallet="
            r0.append(r1)
            if.a$a r1 = r2.wallet
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
