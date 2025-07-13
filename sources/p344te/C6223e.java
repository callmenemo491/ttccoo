package p344te;

/* renamed from: te.e */
/* loaded from: classes.dex */
public final class C6223e implements java.io.Serializable {
    private final java.util.List<p344te.C6219a> assets;
    private final java.lang.String offerID;
    private final p344te.C6224f price;
    private final java.lang.String saleID;
    private java.lang.String valueDollarString;

    public C6223e(java.lang.String r2, java.lang.String r3, p344te.C6224f r4, java.util.List<p344te.C6219a> r5, java.lang.String r6) {
            r1 = this;
            java.lang.String r0 = "saleID"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "offerID"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "price"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "assets"
            p214m2.C4339q.m9706k(r5, r0)
            r1.<init>()
            r1.saleID = r2
            r1.offerID = r3
            r1.price = r4
            r1.assets = r5
            r1.valueDollarString = r6
            return
    }

    public static /* synthetic */ p344te.C6223e copy$default(p344te.C6223e r3, java.lang.String r4, java.lang.String r5, p344te.C6224f r6, java.util.List r7, java.lang.String r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r4 = r3.saleID
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            java.lang.String r5 = r3.offerID
        Lc:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L13
            te.f r6 = r3.price
        L13:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L1a
            java.util.List<te.a> r7 = r3.assets
        L1a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L21
            java.lang.String r8 = r3.valueDollarString
        L21:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            te.e r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.saleID
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.offerID
            return r0
    }

    public final p344te.C6224f component3() {
            r1 = this;
            te.f r0 = r1.price
            return r0
    }

    public final java.util.List<p344te.C6219a> component4() {
            r1 = this;
            java.util.List<te.a> r0 = r1.assets
            return r0
    }

    public final java.lang.String component5() {
            r1 = this;
            java.lang.String r0 = r1.valueDollarString
            return r0
    }

    public final p344te.C6223e copy(java.lang.String r8, java.lang.String r9, p344te.C6224f r10, java.util.List<p344te.C6219a> r11, java.lang.String r12) {
            r7 = this;
            java.lang.String r0 = "saleID"
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "offerID"
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "price"
            p214m2.C4339q.m9706k(r10, r0)
            java.lang.String r0 = "assets"
            p214m2.C4339q.m9706k(r11, r0)
            te.e r0 = new te.e
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
            boolean r1 = r5 instanceof p344te.C6223e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            te.e r5 = (p344te.C6223e) r5
            java.lang.String r1 = r4.saleID
            java.lang.String r3 = r5.saleID
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.offerID
            java.lang.String r3 = r5.offerID
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            te.f r1 = r4.price
            te.f r3 = r5.price
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.util.List<te.a> r1 = r4.assets
            java.util.List<te.a> r3 = r5.assets
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.valueDollarString
            java.lang.String r5 = r5.valueDollarString
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L43
            return r2
        L43:
            return r0
    }

    public final java.util.List<p344te.C6219a> getAssets() {
            r1 = this;
            java.util.List<te.a> r0 = r1.assets
            return r0
    }

    public final java.lang.String getListingName() {
            r2 = this;
            java.util.List<te.a> r0 = r2.assets
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L16
            java.util.List<te.a> r0 = r2.assets
            java.lang.Object r0 = p062dh.C1473i.m3995G(r0)
            te.a r0 = (p344te.C6219a) r0
            java.lang.String r0 = r0.getName()
            goto L2d
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.List<te.a> r1 = r2.assets
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = " NFT Bundle"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L2d:
            return r0
    }

    public final java.lang.String getOfferID() {
            r1 = this;
            java.lang.String r0 = r1.offerID
            return r0
    }

    public final p344te.C6224f getPrice() {
            r1 = this;
            te.f r0 = r1.price
            return r0
    }

    public final java.lang.String getSaleID() {
            r1 = this;
            java.lang.String r0 = r1.saleID
            return r0
    }

    public final java.lang.String getValueDollarString() {
            r1 = this;
            java.lang.String r0 = r1.valueDollarString
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.saleID
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.offerID
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            te.f r1 = r3.price
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List<te.a> r0 = r3.assets
            int r0 = p255od.C5212k0.m11509a(r0, r1, r2)
            java.lang.String r1 = r3.valueDollarString
            if (r1 != 0) goto L25
            r1 = 0
            goto L29
        L25:
            int r1 = r1.hashCode()
        L29:
            int r0 = r0 + r1
            return r0
    }

    public final void setValueDollarString(java.lang.String r1) {
            r0 = this;
            r0.valueDollarString = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "MListingModel(saleID="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.saleID
            r0.append(r1)
            java.lang.String r1 = ", offerID="
            r0.append(r1)
            java.lang.String r1 = r3.offerID
            r0.append(r1)
            java.lang.String r1 = ", price="
            r0.append(r1)
            te.f r1 = r3.price
            r0.append(r1)
            java.lang.String r1 = ", assets="
            r0.append(r1)
            java.util.List<te.a> r1 = r3.assets
            r0.append(r1)
            java.lang.String r1 = ", valueDollarString="
            r0.append(r1)
            java.lang.String r1 = r3.valueDollarString
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
