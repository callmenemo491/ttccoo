package p396we;

/* renamed from: we.b */
/* loaded from: classes.dex */
public final class C6845b {
    private final java.lang.String account;
    private final java.util.List<java.lang.String> balances;

    public C6845b(java.lang.String r2, java.util.List<java.lang.String> r3) {
            r1 = this;
            java.lang.String r0 = "account"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "balances"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.account = r2
            r1.balances = r3
            return
    }

    public static /* synthetic */ p396we.C6845b copy$default(p396we.C6845b r0, java.lang.String r1, java.util.List r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = r0.account
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.util.List<java.lang.String> r2 = r0.balances
        Lc:
            we.b r0 = r0.copy(r1, r2)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.account
            return r0
    }

    public final java.util.List<java.lang.String> component2() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.balances
            return r0
    }

    public final p396we.C6845b copy(java.lang.String r2, java.util.List<java.lang.String> r3) {
            r1 = this;
            java.lang.String r0 = "account"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "balances"
            p214m2.C4339q.m9706k(r3, r0)
            we.b r0 = new we.b
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p396we.C6845b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            we.b r5 = (p396we.C6845b) r5
            java.lang.String r1 = r4.account
            java.lang.String r3 = r5.account
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List<java.lang.String> r1 = r4.balances
            java.util.List<java.lang.String> r5 = r5.balances
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

    public final java.util.List<java.lang.String> getBalances() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.balances
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.account
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List<java.lang.String> r1 = r2.balances
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "BalanceBrawlers(account="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.account
            r0.append(r1)
            java.lang.String r1 = ", balances="
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r3.balances
            r2 = 41
            java.lang.String r0 = p213m1.C4320f.m9652a(r0, r1, r2)
            return r0
    }
}
