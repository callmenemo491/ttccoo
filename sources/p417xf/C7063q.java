package p417xf;

/* renamed from: xf.q */
/* loaded from: classes.dex */
public final class C7063q {
    private final java.lang.String average;

    @p189kb.InterfaceC4079b("collection_name")
    private final java.lang.String collectionName;
    private final java.lang.String max;
    private final java.lang.String median;
    private final java.lang.String min;

    @p189kb.InterfaceC4079b("suggested_average")
    private final java.lang.String suggestedAverage;

    @p189kb.InterfaceC4079b("suggested_median")
    private final java.lang.String suggestedMedian;

    @p189kb.InterfaceC4079b("template_id")
    private final java.lang.String templateID;

    @p189kb.InterfaceC4079b("token_contract")
    private final java.lang.String tokenContract;

    @p189kb.InterfaceC4079b("token_precision")
    private final int tokenPrecision;

    @p189kb.InterfaceC4079b("token_symbol")
    private final java.lang.String tokenSymbol;

    public C7063q(java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r1 = this;
            java.lang.String r0 = "tokenSymbol"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "tokenContract"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "collectionName"
            p214m2.C4339q.m9706k(r5, r0)
            java.lang.String r0 = "templateID"
            p214m2.C4339q.m9706k(r6, r0)
            java.lang.String r0 = "average"
            p214m2.C4339q.m9706k(r7, r0)
            java.lang.String r0 = "median"
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "suggestedAverage"
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "suggestedMedian"
            p214m2.C4339q.m9706k(r10, r0)
            java.lang.String r0 = "min"
            p214m2.C4339q.m9706k(r11, r0)
            java.lang.String r0 = "max"
            p214m2.C4339q.m9706k(r12, r0)
            r1.<init>()
            r1.tokenSymbol = r2
            r1.tokenPrecision = r3
            r1.tokenContract = r4
            r1.collectionName = r5
            r1.templateID = r6
            r1.average = r7
            r1.median = r8
            r1.suggestedAverage = r9
            r1.suggestedMedian = r10
            r1.min = r11
            r1.max = r12
            return
    }

    public static /* synthetic */ p417xf.C7063q copy$default(p417xf.C7063q r12, java.lang.String r13, int r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, int r24, java.lang.Object r25) {
            r0 = r12
            r1 = r24
            r2 = r1 & 1
            if (r2 == 0) goto La
            java.lang.String r2 = r0.tokenSymbol
            goto Lb
        La:
            r2 = r13
        Lb:
            r3 = r1 & 2
            if (r3 == 0) goto L12
            int r3 = r0.tokenPrecision
            goto L13
        L12:
            r3 = r14
        L13:
            r4 = r1 & 4
            if (r4 == 0) goto L1a
            java.lang.String r4 = r0.tokenContract
            goto L1b
        L1a:
            r4 = r15
        L1b:
            r5 = r1 & 8
            if (r5 == 0) goto L22
            java.lang.String r5 = r0.collectionName
            goto L24
        L22:
            r5 = r16
        L24:
            r6 = r1 & 16
            if (r6 == 0) goto L2b
            java.lang.String r6 = r0.templateID
            goto L2d
        L2b:
            r6 = r17
        L2d:
            r7 = r1 & 32
            if (r7 == 0) goto L34
            java.lang.String r7 = r0.average
            goto L36
        L34:
            r7 = r18
        L36:
            r8 = r1 & 64
            if (r8 == 0) goto L3d
            java.lang.String r8 = r0.median
            goto L3f
        L3d:
            r8 = r19
        L3f:
            r9 = r1 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L46
            java.lang.String r9 = r0.suggestedAverage
            goto L48
        L46:
            r9 = r20
        L48:
            r10 = r1 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L4f
            java.lang.String r10 = r0.suggestedMedian
            goto L51
        L4f:
            r10 = r21
        L51:
            r11 = r1 & 512(0x200, float:7.17E-43)
            if (r11 == 0) goto L58
            java.lang.String r11 = r0.min
            goto L5a
        L58:
            r11 = r22
        L5a:
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L61
            java.lang.String r1 = r0.max
            goto L63
        L61:
            r1 = r23
        L63:
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r11
            r23 = r1
            xf.q r0 = r12.copy(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.tokenSymbol
            return r0
    }

    public final java.lang.String component10() {
            r1 = this;
            java.lang.String r0 = r1.min
            return r0
    }

    public final java.lang.String component11() {
            r1 = this;
            java.lang.String r0 = r1.max
            return r0
    }

    public final int component2() {
            r1 = this;
            int r0 = r1.tokenPrecision
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.tokenContract
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.collectionName
            return r0
    }

    public final java.lang.String component5() {
            r1 = this;
            java.lang.String r0 = r1.templateID
            return r0
    }

    public final java.lang.String component6() {
            r1 = this;
            java.lang.String r0 = r1.average
            return r0
    }

    public final java.lang.String component7() {
            r1 = this;
            java.lang.String r0 = r1.median
            return r0
    }

    public final java.lang.String component8() {
            r1 = this;
            java.lang.String r0 = r1.suggestedAverage
            return r0
    }

    public final java.lang.String component9() {
            r1 = this;
            java.lang.String r0 = r1.suggestedMedian
            return r0
    }

    public final p417xf.C7063q copy(java.lang.String r14, int r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24) {
            r13 = this;
            java.lang.String r0 = "tokenSymbol"
            r2 = r14
            p214m2.C4339q.m9706k(r14, r0)
            java.lang.String r0 = "tokenContract"
            r4 = r16
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "collectionName"
            r5 = r17
            p214m2.C4339q.m9706k(r5, r0)
            java.lang.String r0 = "templateID"
            r6 = r18
            p214m2.C4339q.m9706k(r6, r0)
            java.lang.String r0 = "average"
            r7 = r19
            p214m2.C4339q.m9706k(r7, r0)
            java.lang.String r0 = "median"
            r8 = r20
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "suggestedAverage"
            r9 = r21
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "suggestedMedian"
            r10 = r22
            p214m2.C4339q.m9706k(r10, r0)
            java.lang.String r0 = "min"
            r11 = r23
            p214m2.C4339q.m9706k(r11, r0)
            java.lang.String r0 = "max"
            r12 = r24
            p214m2.C4339q.m9706k(r12, r0)
            xf.q r0 = new xf.q
            r1 = r0
            r3 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p417xf.C7063q
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xf.q r5 = (p417xf.C7063q) r5
            java.lang.String r1 = r4.tokenSymbol
            java.lang.String r3 = r5.tokenSymbol
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.tokenPrecision
            int r3 = r5.tokenPrecision
            if (r1 == r3) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r4.tokenContract
            java.lang.String r3 = r5.tokenContract
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            java.lang.String r1 = r4.collectionName
            java.lang.String r3 = r5.collectionName
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            java.lang.String r1 = r4.templateID
            java.lang.String r3 = r5.templateID
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            java.lang.String r1 = r4.average
            java.lang.String r3 = r5.average
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L4a
            return r2
        L4a:
            java.lang.String r1 = r4.median
            java.lang.String r3 = r5.median
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L55
            return r2
        L55:
            java.lang.String r1 = r4.suggestedAverage
            java.lang.String r3 = r5.suggestedAverage
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L60
            return r2
        L60:
            java.lang.String r1 = r4.suggestedMedian
            java.lang.String r3 = r5.suggestedMedian
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L6b
            return r2
        L6b:
            java.lang.String r1 = r4.min
            java.lang.String r3 = r5.min
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L76
            return r2
        L76:
            java.lang.String r1 = r4.max
            java.lang.String r5 = r5.max
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L81
            return r2
        L81:
            return r0
    }

    public final java.lang.String getAverage() {
            r1 = this;
            java.lang.String r0 = r1.average
            return r0
    }

    public final java.lang.String getCollectionName() {
            r1 = this;
            java.lang.String r0 = r1.collectionName
            return r0
    }

    public final java.lang.String getMax() {
            r1 = this;
            java.lang.String r0 = r1.max
            return r0
    }

    public final java.lang.String getMedian() {
            r1 = this;
            java.lang.String r0 = r1.median
            return r0
    }

    public final java.lang.String getMin() {
            r1 = this;
            java.lang.String r0 = r1.min
            return r0
    }

    public final java.lang.String getSuggestedAverage() {
            r1 = this;
            java.lang.String r0 = r1.suggestedAverage
            return r0
    }

    public final java.lang.String getSuggestedMedian() {
            r1 = this;
            java.lang.String r0 = r1.suggestedMedian
            return r0
    }

    public final java.lang.String getTemplateID() {
            r1 = this;
            java.lang.String r0 = r1.templateID
            return r0
    }

    public final java.lang.String getTokenContract() {
            r1 = this;
            java.lang.String r0 = r1.tokenContract
            return r0
    }

    public final int getTokenPrecision() {
            r1 = this;
            int r0 = r1.tokenPrecision
            return r0
    }

    public final java.lang.String getTokenSymbol() {
            r1 = this;
            java.lang.String r0 = r1.tokenSymbol
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.tokenSymbol
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r3.tokenPrecision
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.tokenContract
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.collectionName
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.templateID
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.average
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.median
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.suggestedAverage
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.suggestedMedian
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.min
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.max
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "NFTPriceData(tokenSymbol="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.tokenSymbol
            r0.append(r1)
            java.lang.String r1 = ", tokenPrecision="
            r0.append(r1)
            int r1 = r3.tokenPrecision
            r0.append(r1)
            java.lang.String r1 = ", tokenContract="
            r0.append(r1)
            java.lang.String r1 = r3.tokenContract
            r0.append(r1)
            java.lang.String r1 = ", collectionName="
            r0.append(r1)
            java.lang.String r1 = r3.collectionName
            r0.append(r1)
            java.lang.String r1 = ", templateID="
            r0.append(r1)
            java.lang.String r1 = r3.templateID
            r0.append(r1)
            java.lang.String r1 = ", average="
            r0.append(r1)
            java.lang.String r1 = r3.average
            r0.append(r1)
            java.lang.String r1 = ", median="
            r0.append(r1)
            java.lang.String r1 = r3.median
            r0.append(r1)
            java.lang.String r1 = ", suggestedAverage="
            r0.append(r1)
            java.lang.String r1 = r3.suggestedAverage
            r0.append(r1)
            java.lang.String r1 = ", suggestedMedian="
            r0.append(r1)
            java.lang.String r1 = r3.suggestedMedian
            r0.append(r1)
            java.lang.String r1 = ", min="
            r0.append(r1)
            java.lang.String r1 = r3.min
            r0.append(r1)
            java.lang.String r1 = ", max="
            r0.append(r1)
            java.lang.String r1 = r3.max
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
