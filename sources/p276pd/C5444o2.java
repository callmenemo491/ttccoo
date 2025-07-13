package p276pd;

/* renamed from: pd.o2 */
/* loaded from: classes.dex */
public final class C5444o2 implements p276pd.InterfaceC5460t1 {
    private final p276pd.C5471x0 amount;
    private final java.lang.String owner;

    public C5444o2(java.lang.String r2, p276pd.C5471x0 r3) {
            r1 = this;
            java.lang.String r0 = "owner"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "amount"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.owner = r2
            r1.amount = r3
            return
    }

    public static /* synthetic */ p276pd.C5444o2 copy$default(p276pd.C5444o2 r0, java.lang.String r1, p276pd.C5471x0 r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = r0.owner
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            pd.x0 r2 = r0.amount
        Lc:
            pd.o2 r0 = r0.copy(r1, r2)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.owner
            return r0
    }

    public final p276pd.C5471x0 component2() {
            r1 = this;
            pd.x0 r0 = r1.amount
            return r0
    }

    public final p276pd.C5444o2 copy(java.lang.String r2, p276pd.C5471x0 r3) {
            r1 = this;
            java.lang.String r0 = "owner"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "amount"
            p214m2.C4339q.m9706k(r3, r0)
            pd.o2 r0 = new pd.o2
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p276pd.C5444o2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            pd.o2 r5 = (p276pd.C5444o2) r5
            java.lang.String r1 = r4.owner
            java.lang.String r3 = r5.owner
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            pd.x0 r1 = r4.amount
            pd.x0 r5 = r5.amount
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final p276pd.C5471x0 getAmount() {
            r1 = this;
            pd.x0 r0 = r1.amount
            return r0
    }

    public final p276pd.C5471x0 getGetAmount() {
            r1 = this;
            pd.x0 r0 = r1.amount
            return r0
    }

    public final java.lang.String getGetOwner() {
            r1 = this;
            java.lang.String r0 = r1.owner
            return r0
    }

    @Override // p276pd.InterfaceC5460t1
    public java.lang.String getHex() {
            r2 = this;
            pd.a r0 = new pd.a
            dd.b r1 = p059dd.EnumC1428b.f7113Y
            r0.<init>(r1)
            pd.a r0 = r0.squishWithdrawBluDACMiningArgs(r2)
            java.lang.String r0 = r0.toHex()
            java.lang.String r1 = "AbiBinaryGenTransactions\u2026   this\n        ).toHex()"
            p214m2.C4339q.m9705j(r0, r1)
            return r0
    }

    @Override // p276pd.InterfaceC5460t1
    public java.lang.String getJson() {
            r1 = this;
            java.lang.String r0 = p276pd.InterfaceC5460t1.a.getJson(r1)
            return r0
    }

    public final java.lang.String getOwner() {
            r1 = this;
            java.lang.String r0 = r1.owner
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.owner
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            pd.x0 r1 = r2.amount
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "WithdrawBluDACMiningArgs(owner="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.owner
            r0.append(r1)
            java.lang.String r1 = ", amount="
            r0.append(r1)
            pd.x0 r1 = r2.amount
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
