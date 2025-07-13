package p344te;

/* renamed from: te.c */
/* loaded from: classes.dex */
public final class C6221c implements java.io.Serializable {

    @p189kb.InterfaceC4079b("market_fee")
    private final double collectionFee;

    @p189kb.InterfaceC4079b("collection_name")
    private final java.lang.String collectionName;
    private final java.lang.String name;

    public C6221c(java.lang.String r2, java.lang.String r3, double r4) {
            r1 = this;
            java.lang.String r0 = "collectionName"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.collectionName = r2
            r1.name = r3
            r1.collectionFee = r4
            return
    }

    public static /* synthetic */ p344te.C6221c copy$default(p344te.C6221c r0, java.lang.String r1, java.lang.String r2, double r3, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.lang.String r1 = r0.collectionName
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            java.lang.String r2 = r0.name
        Lc:
            r5 = r5 & 4
            if (r5 == 0) goto L12
            double r3 = r0.collectionFee
        L12:
            te.c r0 = r0.copy(r1, r2, r3)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.collectionName
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final double component3() {
            r2 = this;
            double r0 = r2.collectionFee
            return r0
    }

    public final p344te.C6221c copy(java.lang.String r2, java.lang.String r3, double r4) {
            r1 = this;
            java.lang.String r0 = "collectionName"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r3, r0)
            te.c r0 = new te.c
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p344te.C6221c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            te.c r6 = (p344te.C6221c) r6
            java.lang.String r1 = r5.collectionName
            java.lang.String r3 = r6.collectionName
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
            double r3 = r5.collectionFee
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.collectionFee
            java.lang.Double r6 = java.lang.Double.valueOf(r3)
            boolean r6 = p214m2.C4339q.m9702c(r1, r6)
            if (r6 != 0) goto L35
            return r2
        L35:
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

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.collectionName
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r5.name
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            double r1 = r5.collectionFee
            long r1 = java.lang.Double.doubleToLongBits(r1)
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Collection(collectionName="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.collectionName
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r3.name
            r0.append(r1)
            java.lang.String r1 = ", collectionFee="
            r0.append(r1)
            double r1 = r3.collectionFee
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
