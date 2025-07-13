package p417xf;

/* renamed from: xf.d */
/* loaded from: classes.dex */
public final class C7050d implements java.io.Serializable {
    private final int assets;
    private double priceWax;
    private final java.lang.String template_id;
    private java.lang.String valueDollarString;

    public C7050d(java.lang.String r2, int r3, double r4, java.lang.String r6) {
            r1 = this;
            java.lang.String r0 = "template_id"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.template_id = r2
            r1.assets = r3
            r1.priceWax = r4
            r1.valueDollarString = r6
            return
    }

    public /* synthetic */ C7050d(java.lang.String r7, int r8, double r9, java.lang.String r11, int r12, p239nh.C4826f r13) {
            r6 = this;
            r12 = r12 & 8
            if (r12 == 0) goto L5
            r11 = 0
        L5:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r5)
            return
    }

    public static /* synthetic */ p417xf.C7050d copy$default(p417xf.C7050d r3, java.lang.String r4, int r5, double r6, java.lang.String r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r4 = r3.template_id
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            int r5 = r3.assets
        Lc:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L13
            double r6 = r3.priceWax
        L13:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L1a
            java.lang.String r8 = r3.valueDollarString
        L1a:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r10 = r2
            xf.d r3 = r5.copy(r6, r7, r8, r10)
            return r3
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.template_id
            return r0
    }

    public final int component2() {
            r1 = this;
            int r0 = r1.assets
            return r0
    }

    public final double component3() {
            r2 = this;
            double r0 = r2.priceWax
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.valueDollarString
            return r0
    }

    public final p417xf.C7050d copy(java.lang.String r8, int r9, double r10, java.lang.String r12) {
            r7 = this;
            java.lang.String r0 = "template_id"
            p214m2.C4339q.m9706k(r8, r0)
            xf.d r0 = new xf.d
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            r1.<init>(r2, r3, r4, r6)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p417xf.C7050d
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xf.d r6 = (p417xf.C7050d) r6
            java.lang.String r1 = r5.template_id
            java.lang.String r3 = r6.template_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r5.assets
            int r3 = r6.assets
            if (r1 == r3) goto L1e
            return r2
        L1e:
            double r3 = r5.priceWax
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.priceWax
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L31
            return r2
        L31:
            java.lang.String r1 = r5.valueDollarString
            java.lang.String r6 = r6.valueDollarString
            boolean r6 = p214m2.C4339q.m9702c(r1, r6)
            if (r6 != 0) goto L3c
            return r2
        L3c:
            return r0
    }

    public final int getAssets() {
            r1 = this;
            int r0 = r1.assets
            return r0
    }

    public final double getPriceWax() {
            r2 = this;
            double r0 = r2.priceWax
            return r0
    }

    public final java.lang.String getTemplate_id() {
            r1 = this;
            java.lang.String r0 = r1.template_id
            return r0
    }

    public final java.lang.String getValueDollarString() {
            r1 = this;
            java.lang.String r0 = r1.valueDollarString
            return r0
    }

    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.template_id
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r5.assets
            int r0 = r0 + r1
            int r0 = r0 * 31
            double r1 = r5.priceWax
            long r1 = java.lang.Double.doubleToLongBits(r1)
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r1 = r5.valueDollarString
            if (r1 != 0) goto L22
            r1 = 0
            goto L26
        L22:
            int r1 = r1.hashCode()
        L26:
            int r0 = r0 + r1
            return r0
    }

    public final void setPriceWax(double r1) {
            r0 = this;
            r0.priceWax = r1
            return
    }

    public final void setValueDollarString(java.lang.String r1) {
            r0 = this;
            r0.valueDollarString = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "AssetTemplatePrice(template_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.template_id
            r0.append(r1)
            java.lang.String r1 = ", assets="
            r0.append(r1)
            int r1 = r3.assets
            r0.append(r1)
            java.lang.String r1 = ", priceWax="
            r0.append(r1)
            double r1 = r3.priceWax
            r0.append(r1)
            java.lang.String r1 = ", valueDollarString="
            r0.append(r1)
            java.lang.String r1 = r3.valueDollarString
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
