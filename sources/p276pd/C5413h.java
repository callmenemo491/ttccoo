package p276pd;

/* renamed from: pd.h */
/* loaded from: classes.dex */
public final class C5413h implements p276pd.InterfaceC5460t1 {
    private final java.util.List<java.lang.String> asset_ids;
    private final java.lang.String listing_price;
    private final java.lang.String maker_marketplace;
    private final java.lang.String seller;
    private final java.lang.String settlement_symbol;

    public C5413h(java.lang.String r2, java.util.List<java.lang.String> r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r1 = this;
            java.lang.String r0 = "seller"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "asset_ids"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "listing_price"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "settlement_symbol"
            p214m2.C4339q.m9706k(r5, r0)
            java.lang.String r0 = "maker_marketplace"
            p214m2.C4339q.m9706k(r6, r0)
            r1.<init>()
            r1.seller = r2
            r1.asset_ids = r3
            r1.listing_price = r4
            r1.settlement_symbol = r5
            r1.maker_marketplace = r6
            return
    }

    public static /* synthetic */ p276pd.C5413h copy$default(p276pd.C5413h r3, java.lang.String r4, java.util.List r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r4 = r3.seller
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            java.util.List<java.lang.String> r5 = r3.asset_ids
        Lc:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L13
            java.lang.String r6 = r3.listing_price
        L13:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L1a
            java.lang.String r7 = r3.settlement_symbol
        L1a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L21
            java.lang.String r8 = r3.maker_marketplace
        L21:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            pd.h r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.seller
            return r0
    }

    public final java.util.List<java.lang.String> component2() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.asset_ids
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.listing_price
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.settlement_symbol
            return r0
    }

    public final java.lang.String component5() {
            r1 = this;
            java.lang.String r0 = r1.maker_marketplace
            return r0
    }

    public final p276pd.C5413h copy(java.lang.String r8, java.util.List<java.lang.String> r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r7 = this;
            java.lang.String r0 = "seller"
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "asset_ids"
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "listing_price"
            p214m2.C4339q.m9706k(r10, r0)
            java.lang.String r0 = "settlement_symbol"
            p214m2.C4339q.m9706k(r11, r0)
            java.lang.String r0 = "maker_marketplace"
            p214m2.C4339q.m9706k(r12, r0)
            pd.h r0 = new pd.h
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
            boolean r1 = r5 instanceof p276pd.C5413h
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            pd.h r5 = (p276pd.C5413h) r5
            java.lang.String r1 = r4.seller
            java.lang.String r3 = r5.seller
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List<java.lang.String> r1 = r4.asset_ids
            java.util.List<java.lang.String> r3 = r5.asset_ids
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.listing_price
            java.lang.String r3 = r5.listing_price
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.settlement_symbol
            java.lang.String r3 = r5.settlement_symbol
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.maker_marketplace
            java.lang.String r5 = r5.maker_marketplace
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L43
            return r2
        L43:
            return r0
    }

    public final java.util.List<java.lang.String> getAsset_ids() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.asset_ids
            return r0
    }

    public final byte[] getGetAssetIds() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.asset_ids
            byte[] r0 = p185k7.C4038x4.m9093f(r0)
            return r0
    }

    public final java.lang.String getGetListingPrice() {
            r1 = this;
            java.lang.String r0 = r1.listing_price
            return r0
    }

    public final java.lang.String getGetMakerMarketplace() {
            r1 = this;
            java.lang.String r0 = r1.maker_marketplace
            return r0
    }

    public final java.lang.String getGetSeller() {
            r1 = this;
            java.lang.String r0 = r1.seller
            return r0
    }

    public final byte[] getGetSettlementSymbol() {
            r1 = this;
            java.lang.String r0 = r1.settlement_symbol
            byte[] r0 = p185k7.C4038x4.m9094g(r0)
            return r0
    }

    @Override // p276pd.InterfaceC5460t1
    public java.lang.String getHex() {
            r2 = this;
            pd.a r0 = new pd.a
            dd.b r1 = p059dd.EnumC1428b.f7113Y
            r0.<init>(r1)
            pd.a r0 = r0.squishAtomicAnnounceSaleArgs(r2)
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

    public final java.lang.String getListing_price() {
            r1 = this;
            java.lang.String r0 = r1.listing_price
            return r0
    }

    public final java.lang.String getMaker_marketplace() {
            r1 = this;
            java.lang.String r0 = r1.maker_marketplace
            return r0
    }

    public final java.lang.String getSeller() {
            r1 = this;
            java.lang.String r0 = r1.seller
            return r0
    }

    public final java.lang.String getSettlement_symbol() {
            r1 = this;
            java.lang.String r0 = r1.settlement_symbol
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.seller
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List<java.lang.String> r1 = r3.asset_ids
            r2 = 31
            int r0 = p255od.C5212k0.m11509a(r1, r0, r2)
            java.lang.String r1 = r3.listing_price
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.settlement_symbol
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.maker_marketplace
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "AtomicAnnounceSaleArgs(seller="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.seller
            r0.append(r1)
            java.lang.String r1 = ", asset_ids="
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r3.asset_ids
            r0.append(r1)
            java.lang.String r1 = ", listing_price="
            r0.append(r1)
            java.lang.String r1 = r3.listing_price
            r0.append(r1)
            java.lang.String r1 = ", settlement_symbol="
            r0.append(r1)
            java.lang.String r1 = r3.settlement_symbol
            r0.append(r1)
            java.lang.String r1 = ", maker_marketplace="
            r0.append(r1)
            java.lang.String r1 = r3.maker_marketplace
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
