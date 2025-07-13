package p344te;

/* renamed from: te.g */
/* loaded from: classes.dex */
public final class C6225g implements java.io.Serializable {

    @p189kb.InterfaceC4079b("asset_id")
    private final java.lang.String assetID;
    private final p344te.C6221c collection;
    private final p344te.C6225g.a data;

    @p189kb.InterfaceC4079b("is_transferable")
    private final boolean isTransferable;
    private final java.util.List<p344te.C6220b> prices;
    private final p417xf.C7066t template;

    /* renamed from: te.g$a */
    public static final class a {
        private final java.lang.String img;
        private final java.lang.String name;

        public a(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.img = r2
                return
        }

        private final java.lang.String component2() {
                r1 = this;
                java.lang.String r0 = r1.img
                return r0
        }

        public static /* synthetic */ p344te.C6225g.a copy$default(p344te.C6225g.a r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                java.lang.String r1 = r0.name
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                java.lang.String r2 = r0.img
            Lc:
                te.g$a r0 = r0.copy(r1, r2)
                return r0
        }

        public final java.lang.String component1() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        public final p344te.C6225g.a copy(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                te.g$a r0 = new te.g$a
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof p344te.C6225g.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                te.g$a r5 = (p344te.C6225g.a) r5
                java.lang.String r1 = r4.name
                java.lang.String r3 = r5.name
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.img
                java.lang.String r5 = r5.img
                boolean r5 = p214m2.C4339q.m9702c(r1, r5)
                if (r5 != 0) goto L22
                return r2
            L22:
                return r0
        }

        public final java.lang.String getImageURL() {
                r4 = this;
                java.lang.String r0 = r4.img
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                r1 = 2
                java.lang.String r2 = "http"
                r3 = 0
                boolean r0 = p362uh.C6463i.m13061R(r0, r2, r3, r1)
                if (r0 == 0) goto L13
                java.lang.String r0 = r4.img
                return r0
            L13:
                java.lang.String r0 = r4.img
                if (r0 == 0) goto L1d
                boolean r0 = p362uh.C6463i.m13054K(r0)
                if (r0 == 0) goto L1e
            L1d:
                r3 = 1
            L1e:
                if (r3 == 0) goto L23
                java.lang.String r0 = ""
                goto L32
            L23:
                java.lang.String r0 = "https://cdn.tacocrypto.io/default/resize:fit:400:400:0/plain/"
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r4.img
                r0.append(r1)
                java.lang.String r0 = r0.toString()
            L32:
                return r0
        }

        public final java.lang.String getName() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        public int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.name
                r1 = 0
                if (r0 != 0) goto L7
                r0 = 0
                goto Lb
            L7:
                int r0 = r0.hashCode()
            Lb:
                int r0 = r0 * 31
                java.lang.String r2 = r3.img
                if (r2 != 0) goto L12
                goto L16
            L12:
                int r1 = r2.hashCode()
            L16:
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "Data(name="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r1 = r3.name
                r0.append(r1)
                java.lang.String r1 = ", img="
                r0.append(r1)
                java.lang.String r1 = r3.img
                r2 = 41
                java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
                return r0
        }
    }

    public C6225g(java.lang.String r2, p344te.C6225g.a r3, boolean r4, p344te.C6221c r5, p417xf.C7066t r6, java.util.List<p344te.C6220b> r7) {
            r1 = this;
            java.lang.String r0 = "assetID"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "collection"
            p214m2.C4339q.m9706k(r5, r0)
            java.lang.String r0 = "prices"
            p214m2.C4339q.m9706k(r7, r0)
            r1.<init>()
            r1.assetID = r2
            r1.data = r3
            r1.isTransferable = r4
            r1.collection = r5
            r1.template = r6
            r1.prices = r7
            return
    }

    public static /* synthetic */ p344te.C6225g copy$default(p344te.C6225g r4, java.lang.String r5, p344te.C6225g.a r6, boolean r7, p344te.C6221c r8, p417xf.C7066t r9, java.util.List r10, int r11, java.lang.Object r12) {
            r12 = r11 & 1
            if (r12 == 0) goto L6
            java.lang.String r5 = r4.assetID
        L6:
            r12 = r11 & 2
            if (r12 == 0) goto Lc
            te.g$a r6 = r4.data
        Lc:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L13
            boolean r7 = r4.isTransferable
        L13:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L1a
            te.c r8 = r4.collection
        L1a:
            r1 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L21
            xf.t r9 = r4.template
        L21:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L28
            java.util.List<te.b> r10 = r4.prices
        L28:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            te.g r4 = r6.copy(r7, r8, r9, r10, r11, r12)
            return r4
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.assetID
            return r0
    }

    public final p344te.C6225g.a component2() {
            r1 = this;
            te.g$a r0 = r1.data
            return r0
    }

    public final boolean component3() {
            r1 = this;
            boolean r0 = r1.isTransferable
            return r0
    }

    public final p344te.C6221c component4() {
            r1 = this;
            te.c r0 = r1.collection
            return r0
    }

    public final p417xf.C7066t component5() {
            r1 = this;
            xf.t r0 = r1.template
            return r0
    }

    public final java.util.List<p344te.C6220b> component6() {
            r1 = this;
            java.util.List<te.b> r0 = r1.prices
            return r0
    }

    public final p344te.C6225g copy(java.lang.String r9, p344te.C6225g.a r10, boolean r11, p344te.C6221c r12, p417xf.C7066t r13, java.util.List<p344te.C6220b> r14) {
            r8 = this;
            java.lang.String r0 = "assetID"
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "collection"
            p214m2.C4339q.m9706k(r12, r0)
            java.lang.String r0 = "prices"
            p214m2.C4339q.m9706k(r14, r0)
            te.g r0 = new te.g
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p344te.C6225g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            te.g r5 = (p344te.C6225g) r5
            java.lang.String r1 = r4.assetID
            java.lang.String r3 = r5.assetID
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            te.g$a r1 = r4.data
            te.g$a r3 = r5.data
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            boolean r1 = r4.isTransferable
            boolean r3 = r5.isTransferable
            if (r1 == r3) goto L29
            return r2
        L29:
            te.c r1 = r4.collection
            te.c r3 = r5.collection
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            xf.t r1 = r4.template
            xf.t r3 = r5.template
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            java.util.List<te.b> r1 = r4.prices
            java.util.List<te.b> r5 = r5.prices
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L4a
            return r2
        L4a:
            return r0
    }

    public final java.lang.String getAssetID() {
            r1 = this;
            java.lang.String r0 = r1.assetID
            return r0
    }

    public final p344te.C6221c getCollection() {
            r1 = this;
            te.c r0 = r1.collection
            return r0
    }

    public final p344te.C6225g.a getData() {
            r1 = this;
            te.g$a r0 = r1.data
            return r0
    }

    public final java.util.List<p344te.C6220b> getPrices() {
            r1 = this;
            java.util.List<te.b> r0 = r1.prices
            return r0
    }

    public final p417xf.C7066t getTemplate() {
            r1 = this;
            xf.t r0 = r1.template
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.assetID
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            te.g$a r1 = r3.data
            r2 = 0
            if (r1 != 0) goto Lf
            r1 = 0
            goto L13
        Lf:
            int r1 = r1.hashCode()
        L13:
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r3.isTransferable
            if (r1 == 0) goto L1b
            r1 = 1
        L1b:
            int r0 = r0 + r1
            int r0 = r0 * 31
            te.c r1 = r3.collection
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            xf.t r0 = r3.template
            if (r0 != 0) goto L2c
            goto L30
        L2c:
            int r2 = r0.hashCode()
        L30:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.util.List<te.b> r0 = r3.prices
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final boolean isTransferable() {
            r1 = this;
            boolean r0 = r1.isTransferable
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "SaleAsset(assetID="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.assetID
            r0.append(r1)
            java.lang.String r1 = ", data="
            r0.append(r1)
            te.g$a r1 = r3.data
            r0.append(r1)
            java.lang.String r1 = ", isTransferable="
            r0.append(r1)
            boolean r1 = r3.isTransferable
            r0.append(r1)
            java.lang.String r1 = ", collection="
            r0.append(r1)
            te.c r1 = r3.collection
            r0.append(r1)
            java.lang.String r1 = ", template="
            r0.append(r1)
            xf.t r1 = r3.template
            r0.append(r1)
            java.lang.String r1 = ", prices="
            r0.append(r1)
            java.util.List<te.b> r1 = r3.prices
            r2 = 41
            java.lang.String r0 = p213m1.C4320f.m9652a(r0, r1, r2)
            return r0
    }
}
