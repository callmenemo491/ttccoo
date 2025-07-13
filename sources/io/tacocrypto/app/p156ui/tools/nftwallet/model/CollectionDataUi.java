package io.tacocrypto.app.p156ui.tools.nftwallet.model;

/* loaded from: classes.dex */
public final class CollectionDataUi implements java.io.Serializable {
    private final java.lang.String collectionName;
    private final java.lang.String displayName;
    private final java.lang.String imageUrl;
    private final java.lang.Double priceWax;
    private final java.lang.String valueDollarString;

    public CollectionDataUi(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.Double r5, java.lang.String r6) {
            r1 = this;
            java.lang.String r0 = "collectionName"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.displayName = r2
            r1.collectionName = r3
            r1.imageUrl = r4
            r1.priceWax = r5
            r1.valueDollarString = r6
            return
    }

    public /* synthetic */ CollectionDataUi(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.Double r11, java.lang.String r12, int r13, p239nh.C4826f r14) {
            r7 = this;
            r14 = r13 & 8
            r0 = 0
            if (r14 == 0) goto L7
            r5 = r0
            goto L8
        L7:
            r5 = r11
        L8:
            r11 = r13 & 16
            if (r11 == 0) goto Le
            r6 = r0
            goto Lf
        Le:
            r6 = r12
        Lf:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public static /* synthetic */ io.tacocrypto.app.p156ui.tools.nftwallet.model.CollectionDataUi copy$default(io.tacocrypto.app.p156ui.tools.nftwallet.model.CollectionDataUi r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.Double r7, java.lang.String r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r4 = r3.displayName
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            java.lang.String r5 = r3.collectionName
        Lc:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L13
            java.lang.String r6 = r3.imageUrl
        L13:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L1a
            java.lang.Double r7 = r3.priceWax
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
            io.tacocrypto.app.ui.tools.nftwallet.model.CollectionDataUi r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.displayName
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.collectionName
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.imageUrl
            return r0
    }

    public final java.lang.Double component4() {
            r1 = this;
            java.lang.Double r0 = r1.priceWax
            return r0
    }

    public final java.lang.String component5() {
            r1 = this;
            java.lang.String r0 = r1.valueDollarString
            return r0
    }

    public final io.tacocrypto.app.p156ui.tools.nftwallet.model.CollectionDataUi copy(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.Double r11, java.lang.String r12) {
            r7 = this;
            java.lang.String r0 = "collectionName"
            p214m2.C4339q.m9706k(r9, r0)
            io.tacocrypto.app.ui.tools.nftwallet.model.CollectionDataUi r0 = new io.tacocrypto.app.ui.tools.nftwallet.model.CollectionDataUi
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
            boolean r1 = r5 instanceof io.tacocrypto.app.p156ui.tools.nftwallet.model.CollectionDataUi
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            io.tacocrypto.app.ui.tools.nftwallet.model.CollectionDataUi r5 = (io.tacocrypto.app.p156ui.tools.nftwallet.model.CollectionDataUi) r5
            java.lang.String r1 = r4.displayName
            java.lang.String r3 = r5.displayName
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.collectionName
            java.lang.String r3 = r5.collectionName
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.imageUrl
            java.lang.String r3 = r5.imageUrl
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.Double r1 = r4.priceWax
            java.lang.Double r3 = r5.priceWax
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

    public final java.lang.String getCollectionName() {
            r1 = this;
            java.lang.String r0 = r1.collectionName
            return r0
    }

    public final java.lang.String getDisplayName() {
            r1 = this;
            java.lang.String r0 = r1.displayName
            return r0
    }

    public final java.lang.String getImageUrl() {
            r1 = this;
            java.lang.String r0 = r1.imageUrl
            return r0
    }

    public final java.lang.Double getPriceWax() {
            r1 = this;
            java.lang.Double r0 = r1.priceWax
            return r0
    }

    public final java.lang.String getValueDollarString() {
            r1 = this;
            java.lang.String r0 = r1.valueDollarString
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.displayName
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            java.lang.String r2 = r4.collectionName
            r3 = 31
            int r0 = p213m1.C4319e.m9651a(r2, r0, r3)
            java.lang.String r2 = r4.imageUrl
            if (r2 != 0) goto L1b
            r2 = 0
            goto L1f
        L1b:
            int r2 = r2.hashCode()
        L1f:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Double r2 = r4.priceWax
            if (r2 != 0) goto L28
            r2 = 0
            goto L2c
        L28:
            int r2 = r2.hashCode()
        L2c:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r4.valueDollarString
            if (r2 != 0) goto L34
            goto L38
        L34:
            int r1 = r2.hashCode()
        L38:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "CollectionDataUi(displayName="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.displayName
            r0.append(r1)
            java.lang.String r1 = ", collectionName="
            r0.append(r1)
            java.lang.String r1 = r3.collectionName
            r0.append(r1)
            java.lang.String r1 = ", imageUrl="
            r0.append(r1)
            java.lang.String r1 = r3.imageUrl
            r0.append(r1)
            java.lang.String r1 = ", priceWax="
            r0.append(r1)
            java.lang.Double r1 = r3.priceWax
            r0.append(r1)
            java.lang.String r1 = ", valueDollarString="
            r0.append(r1)
            java.lang.String r1 = r3.valueDollarString
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
