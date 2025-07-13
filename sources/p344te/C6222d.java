package p344te;

/* renamed from: te.d */
/* loaded from: classes.dex */
public final class C6222d implements java.io.Serializable {
    private final java.util.List<p344te.C6225g> assets;

    @p189kb.InterfaceC4079b("offer_id")
    private final java.lang.String offerID;
    private final p344te.C6224f price;

    @p189kb.InterfaceC4079b("sale_id")
    private final java.lang.String saleID;

    public C6222d(java.lang.String r2, java.lang.String r3, p344te.C6224f r4, java.util.List<p344te.C6225g> r5) {
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
            return
    }

    public static /* synthetic */ p344te.C6222d copy$default(p344te.C6222d r0, java.lang.String r1, java.lang.String r2, p344te.C6224f r3, java.util.List r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.lang.String r1 = r0.saleID
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            java.lang.String r2 = r0.offerID
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            te.f r3 = r0.price
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            java.util.List<te.g> r4 = r0.assets
        L18:
            te.d r0 = r0.copy(r1, r2, r3, r4)
            return r0
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

    public final java.util.List<p344te.C6225g> component4() {
            r1 = this;
            java.util.List<te.g> r0 = r1.assets
            return r0
    }

    public final p344te.C6222d copy(java.lang.String r2, java.lang.String r3, p344te.C6224f r4, java.util.List<p344te.C6225g> r5) {
            r1 = this;
            java.lang.String r0 = "saleID"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "offerID"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "price"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "assets"
            p214m2.C4339q.m9706k(r5, r0)
            te.d r0 = new te.d
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p344te.C6222d
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            te.d r5 = (p344te.C6222d) r5
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
            java.util.List<te.g> r1 = r4.assets
            java.util.List<te.g> r5 = r5.assets
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L38
            return r2
        L38:
            return r0
    }

    public final java.util.List<p344te.C6225g> getAssets() {
            r1 = this;
            java.util.List<te.g> r0 = r1.assets
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
            java.util.List<te.g> r0 = r3.assets
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final p344te.C6223e toMListingModel() {
            r20 = this;
            r0 = r20
            java.lang.String r2 = r0.saleID
            java.lang.String r3 = r0.offerID
            te.f r4 = r0.price
            java.util.List<te.g> r1 = r0.assets
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L95
            java.lang.Object r6 = r1.next()
            te.g r6 = (p344te.C6225g) r6
            xf.t r7 = r6.getTemplate()
            if (r7 == 0) goto L8a
            xf.p r7 = r7.toNFTDetailUI()
            if (r7 != 0) goto L2c
            goto L8a
        L2c:
            te.a r19 = new te.a
            java.lang.String r9 = r6.getAssetID()
            te.g$a r8 = r6.getData()
            if (r8 == 0) goto L3e
            java.lang.String r8 = r8.getName()
            if (r8 != 0) goto L46
        L3e:
            java.lang.String r8 = r7.getName()
            if (r8 != 0) goto L46
            java.lang.String r8 = "no name"
        L46:
            r10 = r8
            te.c r8 = r6.getCollection()
            java.lang.String r11 = r8.getCollectionName()
            te.c r8 = r6.getCollection()
            double r12 = r8.getCollectionFee()
            java.util.List r8 = r6.getPrices()
            java.lang.Object r8 = p062dh.C1473i.m3996H(r8)
            te.b r8 = (p344te.C6220b) r8
            if (r8 == 0) goto L68
            double r14 = r8.getSuggestedMedianDouble()
            goto L6a
        L68:
            r14 = 0
        L6a:
            java.lang.String r16 = r7.getTemplate_id()
            te.g$a r6 = r6.getData()
            if (r6 == 0) goto L7a
            java.lang.String r6 = r6.getImageURL()
            if (r6 != 0) goto L7e
        L7a:
            java.lang.String r6 = r7.getImageURL()
        L7e:
            r17 = r6
            java.lang.String r18 = r7.getVideoURL()
            r8 = r19
            r8.<init>(r9, r10, r11, r12, r14, r16, r17, r18)
            goto L8c
        L8a:
            r19 = 0
        L8c:
            r6 = r19
            if (r6 == 0) goto L13
            r5.add(r6)
            goto L13
        L95:
            r6 = 0
            te.e r7 = new te.e
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r7
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "DataAsset(saleID="
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
            java.util.List<te.g> r1 = r3.assets
            r2 = 41
            java.lang.String r0 = p213m1.C4320f.m9652a(r0, r1, r2)
            return r0
    }
}
