package md;

/* renamed from: md.z0 */
/* loaded from: classes.dex */
public final class C4592z0 {
    private final java.lang.String balance;
    private final java.lang.String claimable;

    public C4592z0(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "balance"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "claimable"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.balance = r2
            r1.claimable = r3
            return
    }

    public static /* synthetic */ md.C4592z0 copy$default(md.C4592z0 r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = r0.balance
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.lang.String r2 = r0.claimable
        Lc:
            md.z0 r0 = r0.copy(r1, r2)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.balance
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.claimable
            return r0
    }

    public final md.C4592z0 copy(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "balance"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "claimable"
            p214m2.C4339q.m9706k(r3, r0)
            md.z0 r0 = new md.z0
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof md.C4592z0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            md.z0 r5 = (md.C4592z0) r5
            java.lang.String r1 = r4.balance
            java.lang.String r3 = r5.balance
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.claimable
            java.lang.String r5 = r5.claimable
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final java.lang.String getBalance() {
            r1 = this;
            java.lang.String r0 = r1.balance
            return r0
    }

    public final java.lang.String getClaimable() {
            r1 = this;
            java.lang.String r0 = r1.claimable
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.balance
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.claimable
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "UpliftBalancePayload(balance="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.balance
            r0.append(r1)
            java.lang.String r1 = ", claimable="
            r0.append(r1)
            java.lang.String r1 = r3.claimable
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
