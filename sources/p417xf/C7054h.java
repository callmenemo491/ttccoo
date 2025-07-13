package p417xf;

/* renamed from: xf.h */
/* loaded from: classes.dex */
public final class C7054h {

    @p189kb.InterfaceC4079b("allow_notify")
    private final boolean allowNotify;
    private final java.lang.String author;

    @p189kb.InterfaceC4079b("authorized_accounts")
    private final java.util.List<java.lang.String> authorizedAccounts;

    @p189kb.InterfaceC4079b("collection_name")
    private final java.lang.String collectionName;
    private final java.lang.String contract;
    private final p417xf.C7052f data;
    private final java.lang.String img;

    @p189kb.InterfaceC4079b("market_fee")
    private final double marketFee;
    private final java.lang.String name;

    public C7054h(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7, java.util.List<java.lang.String> r8, double r9, p417xf.C7052f r11) {
            r1 = this;
            java.lang.String r0 = "contract"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "collectionName"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "author"
            p214m2.C4339q.m9706k(r6, r0)
            java.lang.String r0 = "authorizedAccounts"
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r11, r0)
            r1.<init>()
            r1.contract = r2
            r1.collectionName = r3
            r1.name = r4
            r1.img = r5
            r1.author = r6
            r1.allowNotify = r7
            r1.authorizedAccounts = r8
            r1.marketFee = r9
            r1.data = r11
            return
    }

    public static /* synthetic */ p417xf.C7054h copy$default(p417xf.C7054h r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, boolean r17, java.util.List r18, double r19, p417xf.C7052f r21, int r22, java.lang.Object r23) {
            r0 = r11
            r1 = r22
            r2 = r1 & 1
            if (r2 == 0) goto La
            java.lang.String r2 = r0.contract
            goto Lb
        La:
            r2 = r12
        Lb:
            r3 = r1 & 2
            if (r3 == 0) goto L12
            java.lang.String r3 = r0.collectionName
            goto L13
        L12:
            r3 = r13
        L13:
            r4 = r1 & 4
            if (r4 == 0) goto L1a
            java.lang.String r4 = r0.name
            goto L1b
        L1a:
            r4 = r14
        L1b:
            r5 = r1 & 8
            if (r5 == 0) goto L22
            java.lang.String r5 = r0.img
            goto L23
        L22:
            r5 = r15
        L23:
            r6 = r1 & 16
            if (r6 == 0) goto L2a
            java.lang.String r6 = r0.author
            goto L2c
        L2a:
            r6 = r16
        L2c:
            r7 = r1 & 32
            if (r7 == 0) goto L33
            boolean r7 = r0.allowNotify
            goto L35
        L33:
            r7 = r17
        L35:
            r8 = r1 & 64
            if (r8 == 0) goto L3c
            java.util.List<java.lang.String> r8 = r0.authorizedAccounts
            goto L3e
        L3c:
            r8 = r18
        L3e:
            r9 = r1 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L45
            double r9 = r0.marketFee
            goto L47
        L45:
            r9 = r19
        L47:
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L4e
            xf.f r1 = r0.data
            goto L50
        L4e:
            r1 = r21
        L50:
            r12 = r2
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r21 = r1
            xf.h r0 = r11.copy(r12, r13, r14, r15, r16, r17, r18, r19, r21)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.contract
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.collectionName
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.img
            return r0
    }

    public final java.lang.String component5() {
            r1 = this;
            java.lang.String r0 = r1.author
            return r0
    }

    public final boolean component6() {
            r1 = this;
            boolean r0 = r1.allowNotify
            return r0
    }

    public final java.util.List<java.lang.String> component7() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.authorizedAccounts
            return r0
    }

    public final double component8() {
            r2 = this;
            double r0 = r2.marketFee
            return r0
    }

    public final p417xf.C7052f component9() {
            r1 = this;
            xf.f r0 = r1.data
            return r0
    }

    public final p417xf.C7054h copy(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, boolean r18, java.util.List<java.lang.String> r19, double r20, p417xf.C7052f r22) {
            r12 = this;
            java.lang.String r0 = "contract"
            r2 = r13
            p214m2.C4339q.m9706k(r13, r0)
            java.lang.String r0 = "collectionName"
            r3 = r14
            p214m2.C4339q.m9706k(r14, r0)
            java.lang.String r0 = "name"
            r4 = r15
            p214m2.C4339q.m9706k(r15, r0)
            java.lang.String r0 = "author"
            r6 = r17
            p214m2.C4339q.m9706k(r6, r0)
            java.lang.String r0 = "authorizedAccounts"
            r8 = r19
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "data"
            r11 = r22
            p214m2.C4339q.m9706k(r11, r0)
            xf.h r0 = new xf.h
            r1 = r0
            r5 = r16
            r7 = r18
            r9 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r11)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p417xf.C7054h
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xf.h r6 = (p417xf.C7054h) r6
            java.lang.String r1 = r5.contract
            java.lang.String r3 = r6.contract
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r5.collectionName
            java.lang.String r3 = r6.collectionName
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r5.name
            java.lang.String r3 = r6.name
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r5.img
            java.lang.String r3 = r6.img
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r5.author
            java.lang.String r3 = r6.author
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            boolean r1 = r5.allowNotify
            boolean r3 = r6.allowNotify
            if (r1 == r3) goto L4a
            return r2
        L4a:
            java.util.List<java.lang.String> r1 = r5.authorizedAccounts
            java.util.List<java.lang.String> r3 = r6.authorizedAccounts
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L55
            return r2
        L55:
            double r3 = r5.marketFee
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.marketFee
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L68
            return r2
        L68:
            xf.f r1 = r5.data
            xf.f r6 = r6.data
            boolean r6 = p214m2.C4339q.m9702c(r1, r6)
            if (r6 != 0) goto L73
            return r2
        L73:
            return r0
    }

    public final boolean getAllowNotify() {
            r1 = this;
            boolean r0 = r1.allowNotify
            return r0
    }

    public final java.lang.String getAuthor() {
            r1 = this;
            java.lang.String r0 = r1.author
            return r0
    }

    public final java.util.List<java.lang.String> getAuthorizedAccounts() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.authorizedAccounts
            return r0
    }

    public final java.lang.String getCollectionName() {
            r1 = this;
            java.lang.String r0 = r1.collectionName
            return r0
    }

    public final java.lang.String getContract() {
            r1 = this;
            java.lang.String r0 = r1.contract
            return r0
    }

    public final p417xf.C7052f getData() {
            r1 = this;
            xf.f r0 = r1.data
            return r0
    }

    public final java.lang.String getImageURL() {
            r5 = this;
            java.lang.String r0 = r5.img
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L11
            r3 = 2
            java.lang.String r4 = "http"
            boolean r0 = p362uh.C6463i.m13061R(r0, r4, r2, r3)
            if (r0 != r1) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L17
            java.lang.String r0 = r5.img
            goto L37
        L17:
            java.lang.String r0 = r5.img
            if (r0 == 0) goto L23
            boolean r0 = p362uh.C6463i.m13054K(r0)
            if (r0 == 0) goto L22
            goto L23
        L22:
            r1 = 0
        L23:
            if (r1 == 0) goto L28
            java.lang.String r0 = ""
            goto L37
        L28:
            java.lang.String r0 = "https://cdn.tacocrypto.io/default/resize:fit:400:400:0/plain/"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r5.img
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L37:
            return r0
    }

    public final java.lang.String getImg() {
            r1 = this;
            java.lang.String r0 = r1.img
            return r0
    }

    public final double getMarketFee() {
            r2 = this;
            double r0 = r2.marketFee
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.contract
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r5.collectionName
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r5.name
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r5.img
            if (r1 != 0) goto L1c
            r1 = 0
            goto L20
        L1c:
            int r1 = r1.hashCode()
        L20:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r5.author
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            boolean r1 = r5.allowNotify
            if (r1 == 0) goto L30
            r1 = 1
        L30:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<java.lang.String> r1 = r5.authorizedAccounts
            r2 = 31
            int r0 = p255od.C5212k0.m11509a(r1, r0, r2)
            double r1 = r5.marketFee
            long r1 = java.lang.Double.doubleToLongBits(r1)
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            xf.f r1 = r5.data
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "CollectionInfo(contract="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.contract
            r0.append(r1)
            java.lang.String r1 = ", collectionName="
            r0.append(r1)
            java.lang.String r1 = r3.collectionName
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r3.name
            r0.append(r1)
            java.lang.String r1 = ", img="
            r0.append(r1)
            java.lang.String r1 = r3.img
            r0.append(r1)
            java.lang.String r1 = ", author="
            r0.append(r1)
            java.lang.String r1 = r3.author
            r0.append(r1)
            java.lang.String r1 = ", allowNotify="
            r0.append(r1)
            boolean r1 = r3.allowNotify
            r0.append(r1)
            java.lang.String r1 = ", authorizedAccounts="
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r3.authorizedAccounts
            r0.append(r1)
            java.lang.String r1 = ", marketFee="
            r0.append(r1)
            double r1 = r3.marketFee
            r0.append(r1)
            java.lang.String r1 = ", data="
            r0.append(r1)
            xf.f r1 = r3.data
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
