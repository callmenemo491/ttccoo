package p276pd;

/* renamed from: pd.u1 */
/* loaded from: classes.dex */
public final class C5463u1 implements p276pd.InterfaceC5460t1 {
    private final java.lang.String owner;
    private final java.lang.String ram_payer;
    private final java.lang.String symbol;

    public C5463u1(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "owner"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "symbol"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "ram_payer"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.owner = r2
            r1.symbol = r3
            r1.ram_payer = r4
            return
    }

    public static /* synthetic */ p276pd.C5463u1 copy$default(p276pd.C5463u1 r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = r0.owner
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.lang.String r2 = r0.symbol
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            java.lang.String r3 = r0.ram_payer
        L12:
            pd.u1 r0 = r0.copy(r1, r2, r3)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.owner
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.symbol
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.ram_payer
            return r0
    }

    public final p276pd.C5463u1 copy(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "owner"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "symbol"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "ram_payer"
            p214m2.C4339q.m9706k(r4, r0)
            pd.u1 r0 = new pd.u1
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p276pd.C5463u1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            pd.u1 r5 = (p276pd.C5463u1) r5
            java.lang.String r1 = r4.owner
            java.lang.String r3 = r5.owner
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.symbol
            java.lang.String r3 = r5.symbol
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.ram_payer
            java.lang.String r5 = r5.ram_payer
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final java.lang.String getGetOwner() {
            r1 = this;
            java.lang.String r0 = r1.owner
            return r0
    }

    public final java.lang.String getGetRamPayer() {
            r1 = this;
            java.lang.String r0 = r1.ram_payer
            return r0
    }

    public final byte[] getGetSymbol() {
            r1 = this;
            java.lang.String r0 = r1.symbol
            byte[] r0 = p185k7.C4038x4.m9094g(r0)
            return r0
    }

    @Override // p276pd.InterfaceC5460t1
    public java.lang.String getHex() {
            r2 = this;
            pd.a r0 = new pd.a
            dd.b r1 = p059dd.EnumC1428b.f7113Y
            r0.<init>(r1)
            pd.a r0 = r0.squishOpenTokenArgs(r2)
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

    public final java.lang.String getRam_payer() {
            r1 = this;
            java.lang.String r0 = r1.ram_payer
            return r0
    }

    public final java.lang.String getSymbol() {
            r1 = this;
            java.lang.String r0 = r1.symbol
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.owner
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.symbol
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.ram_payer
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "OpenTokenArgs(owner="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.owner
            r0.append(r1)
            java.lang.String r1 = ", symbol="
            r0.append(r1)
            java.lang.String r1 = r3.symbol
            r0.append(r1)
            java.lang.String r1 = ", ram_payer="
            r0.append(r1)
            java.lang.String r1 = r3.ram_payer
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
