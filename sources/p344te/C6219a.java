package p344te;

/* renamed from: te.a */
/* loaded from: classes.dex */
public final class C6219a implements java.io.Serializable {
    private final java.lang.String assetID;
    private final double collectionFee;
    private final java.lang.String collectionName;
    private final java.lang.String imageURL;
    private final java.lang.String name;
    private final double suggestedMedianDouble;
    private final java.lang.String template_id;
    private final java.lang.String videoURL;

    public C6219a(java.lang.String r2, java.lang.String r3, java.lang.String r4, double r5, double r7, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r1 = this;
            java.lang.String r0 = "assetID"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "collectionName"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "template_id"
            p214m2.C4339q.m9706k(r9, r0)
            r1.<init>()
            r1.assetID = r2
            r1.name = r3
            r1.collectionName = r4
            r1.collectionFee = r5
            r1.suggestedMedianDouble = r7
            r1.template_id = r9
            r1.imageURL = r10
            r1.videoURL = r11
            return
    }

    public static /* synthetic */ p344te.C6219a copy$default(p344te.C6219a r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, double r15, double r17, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, java.lang.Object r23) {
            r0 = r11
            r1 = r22
            r2 = r1 & 1
            if (r2 == 0) goto La
            java.lang.String r2 = r0.assetID
            goto Lb
        La:
            r2 = r12
        Lb:
            r3 = r1 & 2
            if (r3 == 0) goto L12
            java.lang.String r3 = r0.name
            goto L13
        L12:
            r3 = r13
        L13:
            r4 = r1 & 4
            if (r4 == 0) goto L1a
            java.lang.String r4 = r0.collectionName
            goto L1b
        L1a:
            r4 = r14
        L1b:
            r5 = r1 & 8
            if (r5 == 0) goto L22
            double r5 = r0.collectionFee
            goto L23
        L22:
            r5 = r15
        L23:
            r7 = r1 & 16
            if (r7 == 0) goto L2a
            double r7 = r0.suggestedMedianDouble
            goto L2c
        L2a:
            r7 = r17
        L2c:
            r9 = r1 & 32
            if (r9 == 0) goto L33
            java.lang.String r9 = r0.template_id
            goto L35
        L33:
            r9 = r19
        L35:
            r10 = r1 & 64
            if (r10 == 0) goto L3c
            java.lang.String r10 = r0.imageURL
            goto L3e
        L3c:
            r10 = r20
        L3e:
            r1 = r1 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L45
            java.lang.String r1 = r0.videoURL
            goto L47
        L45:
            r1 = r21
        L47:
            r12 = r2
            r13 = r3
            r14 = r4
            r15 = r5
            r17 = r7
            r19 = r9
            r20 = r10
            r21 = r1
            te.a r0 = r11.copy(r12, r13, r14, r15, r17, r19, r20, r21)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.assetID
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.collectionName
            return r0
    }

    public final double component4() {
            r2 = this;
            double r0 = r2.collectionFee
            return r0
    }

    public final double component5() {
            r2 = this;
            double r0 = r2.suggestedMedianDouble
            return r0
    }

    public final java.lang.String component6() {
            r1 = this;
            java.lang.String r0 = r1.template_id
            return r0
    }

    public final java.lang.String component7() {
            r1 = this;
            java.lang.String r0 = r1.imageURL
            return r0
    }

    public final java.lang.String component8() {
            r1 = this;
            java.lang.String r0 = r1.videoURL
            return r0
    }

    public final p344te.C6219a copy(java.lang.String r13, java.lang.String r14, java.lang.String r15, double r16, double r18, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
            r12 = this;
            java.lang.String r0 = "assetID"
            r2 = r13
            p214m2.C4339q.m9706k(r13, r0)
            java.lang.String r0 = "name"
            r3 = r14
            p214m2.C4339q.m9706k(r14, r0)
            java.lang.String r0 = "collectionName"
            r4 = r15
            p214m2.C4339q.m9706k(r15, r0)
            java.lang.String r0 = "template_id"
            r9 = r20
            p214m2.C4339q.m9706k(r9, r0)
            te.a r0 = new te.a
            r1 = r0
            r5 = r16
            r7 = r18
            r10 = r21
            r11 = r22
            r1.<init>(r2, r3, r4, r5, r7, r9, r10, r11)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p344te.C6219a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            te.a r6 = (p344te.C6219a) r6
            java.lang.String r1 = r5.assetID
            java.lang.String r3 = r6.assetID
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r5.name
            java.lang.String r3 = r6.name
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r5.collectionName
            java.lang.String r3 = r6.collectionName
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            double r3 = r5.collectionFee
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.collectionFee
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L40
            return r2
        L40:
            double r3 = r5.suggestedMedianDouble
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.suggestedMedianDouble
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L53
            return r2
        L53:
            java.lang.String r1 = r5.template_id
            java.lang.String r3 = r6.template_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L5e
            return r2
        L5e:
            java.lang.String r1 = r5.imageURL
            java.lang.String r3 = r6.imageURL
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L69
            return r2
        L69:
            java.lang.String r1 = r5.videoURL
            java.lang.String r6 = r6.videoURL
            boolean r6 = p214m2.C4339q.m9702c(r1, r6)
            if (r6 != 0) goto L74
            return r2
        L74:
            return r0
    }

    public final java.lang.String getAssetID() {
            r1 = this;
            java.lang.String r0 = r1.assetID
            return r0
    }

    public final double getCollectionFee() {
            r2 = this;
            double r0 = r2.collectionFee
            return r0
    }

    public final java.lang.String getCollectionName() {
            r1 = this;
            java.lang.String r0 = r1.collectionName
            return r0
    }

    public final java.lang.String getImageURL() {
            r1 = this;
            java.lang.String r0 = r1.imageURL
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final double getSuggestedMedianDouble() {
            r2 = this;
            double r0 = r2.suggestedMedianDouble
            return r0
    }

    public final java.lang.String getTemplate_id() {
            r1 = this;
            java.lang.String r0 = r1.template_id
            return r0
    }

    public final java.lang.String getVideoURL() {
            r1 = this;
            java.lang.String r0 = r1.videoURL
            return r0
    }

    public int hashCode() {
            r6 = this;
            java.lang.String r0 = r6.assetID
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r6.name
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r6.collectionName
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            double r1 = r6.collectionFee
            long r1 = java.lang.Double.doubleToLongBits(r1)
            r3 = 32
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            double r1 = r6.suggestedMedianDouble
            long r1 = java.lang.Double.doubleToLongBits(r1)
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r1 = r6.template_id
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r6.imageURL
            r2 = 0
            if (r1 != 0) goto L41
            r1 = 0
            goto L45
        L41:
            int r1 = r1.hashCode()
        L45:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r6.videoURL
            if (r1 != 0) goto L4d
            goto L51
        L4d:
            int r2 = r1.hashCode()
        L51:
            int r0 = r0 + r2
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "AssetListing(assetID="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.assetID
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r3.name
            r0.append(r1)
            java.lang.String r1 = ", collectionName="
            r0.append(r1)
            java.lang.String r1 = r3.collectionName
            r0.append(r1)
            java.lang.String r1 = ", collectionFee="
            r0.append(r1)
            double r1 = r3.collectionFee
            r0.append(r1)
            java.lang.String r1 = ", suggestedMedianDouble="
            r0.append(r1)
            double r1 = r3.suggestedMedianDouble
            r0.append(r1)
            java.lang.String r1 = ", template_id="
            r0.append(r1)
            java.lang.String r1 = r3.template_id
            r0.append(r1)
            java.lang.String r1 = ", imageURL="
            r0.append(r1)
            java.lang.String r1 = r3.imageURL
            r0.append(r1)
            java.lang.String r1 = ", videoURL="
            r0.append(r1)
            java.lang.String r1 = r3.videoURL
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
