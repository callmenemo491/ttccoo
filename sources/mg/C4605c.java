package mg;

/* renamed from: mg.c */
/* loaded from: classes.dex */
public final class C4605c {
    private final java.lang.String actionName;
    private final android.text.SpannableStringBuilder body;
    private final java.lang.String contract;
    private final java.lang.String date;

    /* renamed from: id */
    private final java.lang.String f18481id;
    private final java.lang.String quantity;
    private final java.lang.String token;
    private final java.lang.String tokenImageURL;
    private final ng.EnumC4820b type;

    public C4605c(ng.EnumC4820b r2, java.lang.String r3, java.lang.String r4, android.text.SpannableStringBuilder r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r1 = this;
            java.lang.String r0 = "type"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "id"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "contract"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "body"
            p214m2.C4339q.m9706k(r5, r0)
            java.lang.String r0 = "actionName"
            p214m2.C4339q.m9706k(r6, r0)
            java.lang.String r0 = "date"
            p214m2.C4339q.m9706k(r7, r0)
            r1.<init>()
            r1.type = r2
            r1.f18481id = r3
            r1.contract = r4
            r1.body = r5
            r1.actionName = r6
            r1.date = r7
            r1.quantity = r8
            r1.token = r9
            r1.tokenImageURL = r10
            return
    }

    public static /* synthetic */ mg.C4605c copy$default(mg.C4605c r10, ng.EnumC4820b r11, java.lang.String r12, java.lang.String r13, android.text.SpannableStringBuilder r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20, java.lang.Object r21) {
            r0 = r10
            r1 = r20
            r2 = r1 & 1
            if (r2 == 0) goto La
            ng.b r2 = r0.type
            goto Lb
        La:
            r2 = r11
        Lb:
            r3 = r1 & 2
            if (r3 == 0) goto L12
            java.lang.String r3 = r0.f18481id
            goto L13
        L12:
            r3 = r12
        L13:
            r4 = r1 & 4
            if (r4 == 0) goto L1a
            java.lang.String r4 = r0.contract
            goto L1b
        L1a:
            r4 = r13
        L1b:
            r5 = r1 & 8
            if (r5 == 0) goto L22
            android.text.SpannableStringBuilder r5 = r0.body
            goto L23
        L22:
            r5 = r14
        L23:
            r6 = r1 & 16
            if (r6 == 0) goto L2a
            java.lang.String r6 = r0.actionName
            goto L2b
        L2a:
            r6 = r15
        L2b:
            r7 = r1 & 32
            if (r7 == 0) goto L32
            java.lang.String r7 = r0.date
            goto L34
        L32:
            r7 = r16
        L34:
            r8 = r1 & 64
            if (r8 == 0) goto L3b
            java.lang.String r8 = r0.quantity
            goto L3d
        L3b:
            r8 = r17
        L3d:
            r9 = r1 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L44
            java.lang.String r9 = r0.token
            goto L46
        L44:
            r9 = r18
        L46:
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L4d
            java.lang.String r1 = r0.tokenImageURL
            goto L4f
        L4d:
            r1 = r19
        L4f:
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r9
            r19 = r1
            mg.c r0 = r10.copy(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
    }

    public final ng.EnumC4820b component1() {
            r1 = this;
            ng.b r0 = r1.type
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.f18481id
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.contract
            return r0
    }

    public final android.text.SpannableStringBuilder component4() {
            r1 = this;
            android.text.SpannableStringBuilder r0 = r1.body
            return r0
    }

    public final java.lang.String component5() {
            r1 = this;
            java.lang.String r0 = r1.actionName
            return r0
    }

    public final java.lang.String component6() {
            r1 = this;
            java.lang.String r0 = r1.date
            return r0
    }

    public final java.lang.String component7() {
            r1 = this;
            java.lang.String r0 = r1.quantity
            return r0
    }

    public final java.lang.String component8() {
            r1 = this;
            java.lang.String r0 = r1.token
            return r0
    }

    public final java.lang.String component9() {
            r1 = this;
            java.lang.String r0 = r1.tokenImageURL
            return r0
    }

    public final mg.C4605c copy(ng.EnumC4820b r12, java.lang.String r13, java.lang.String r14, android.text.SpannableStringBuilder r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
            r11 = this;
            java.lang.String r0 = "type"
            r2 = r12
            p214m2.C4339q.m9706k(r12, r0)
            java.lang.String r0 = "id"
            r3 = r13
            p214m2.C4339q.m9706k(r13, r0)
            java.lang.String r0 = "contract"
            r4 = r14
            p214m2.C4339q.m9706k(r14, r0)
            java.lang.String r0 = "body"
            r5 = r15
            p214m2.C4339q.m9706k(r15, r0)
            java.lang.String r0 = "actionName"
            r6 = r16
            p214m2.C4339q.m9706k(r6, r0)
            java.lang.String r0 = "date"
            r7 = r17
            p214m2.C4339q.m9706k(r7, r0)
            mg.c r0 = new mg.c
            r1 = r0
            r8 = r18
            r9 = r19
            r10 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof mg.C4605c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            mg.c r5 = (mg.C4605c) r5
            ng.b r1 = r4.type
            ng.b r3 = r5.type
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.f18481id
            java.lang.String r3 = r5.f18481id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r4.contract
            java.lang.String r3 = r5.contract
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            android.text.SpannableStringBuilder r1 = r4.body
            android.text.SpannableStringBuilder r3 = r5.body
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            java.lang.String r1 = r4.actionName
            java.lang.String r3 = r5.actionName
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            java.lang.String r1 = r4.date
            java.lang.String r3 = r5.date
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L4a
            return r2
        L4a:
            java.lang.String r1 = r4.quantity
            java.lang.String r3 = r5.quantity
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L55
            return r2
        L55:
            java.lang.String r1 = r4.token
            java.lang.String r3 = r5.token
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L60
            return r2
        L60:
            java.lang.String r1 = r4.tokenImageURL
            java.lang.String r5 = r5.tokenImageURL
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L6b
            return r2
        L6b:
            return r0
    }

    public final java.lang.String getActionName() {
            r1 = this;
            java.lang.String r0 = r1.actionName
            return r0
    }

    public final android.text.SpannableStringBuilder getBody() {
            r1 = this;
            android.text.SpannableStringBuilder r0 = r1.body
            return r0
    }

    public final java.lang.String getContract() {
            r1 = this;
            java.lang.String r0 = r1.contract
            return r0
    }

    public final java.lang.String getDate() {
            r1 = this;
            java.lang.String r0 = r1.date
            return r0
    }

    public final java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.f18481id
            return r0
    }

    public final java.lang.String getQuantity() {
            r1 = this;
            java.lang.String r0 = r1.quantity
            return r0
    }

    public final java.lang.String getToken() {
            r1 = this;
            java.lang.String r0 = r1.token
            return r0
    }

    public final java.lang.String getTokenImageURL() {
            r1 = this;
            java.lang.String r0 = r1.tokenImageURL
            return r0
    }

    public final java.lang.String getTransactionUrl() {
            r2 = this;
            java.lang.String r0 = "https://wax.bloks.io/transaction/"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.f18481id
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final ng.EnumC4820b getType() {
            r1 = this;
            ng.b r0 = r1.type
            return r0
    }

    public int hashCode() {
            r3 = this;
            ng.b r0 = r3.type
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.f18481id
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.contract
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            android.text.SpannableStringBuilder r1 = r3.body
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.actionName
            int r0 = p213m1.C4319e.m9651a(r0, r1, r2)
            java.lang.String r1 = r3.date
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.quantity
            r2 = 0
            if (r1 != 0) goto L32
            r1 = 0
            goto L36
        L32:
            int r1 = r1.hashCode()
        L36:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.token
            if (r1 != 0) goto L3f
            r1 = 0
            goto L43
        L3f:
            int r1 = r1.hashCode()
        L43:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.tokenImageURL
            if (r1 != 0) goto L4b
            goto L4f
        L4b:
            int r2 = r1.hashCode()
        L4f:
            int r0 = r0 + r2
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Bloks(type="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            ng.b r1 = r3.type
            r0.append(r1)
            java.lang.String r1 = ", id="
            r0.append(r1)
            java.lang.String r1 = r3.f18481id
            r0.append(r1)
            java.lang.String r1 = ", contract="
            r0.append(r1)
            java.lang.String r1 = r3.contract
            r0.append(r1)
            java.lang.String r1 = ", body="
            r0.append(r1)
            android.text.SpannableStringBuilder r1 = r3.body
            r0.append(r1)
            java.lang.String r1 = ", actionName="
            r0.append(r1)
            java.lang.String r1 = r3.actionName
            r0.append(r1)
            java.lang.String r1 = ", date="
            r0.append(r1)
            java.lang.String r1 = r3.date
            r0.append(r1)
            java.lang.String r1 = ", quantity="
            r0.append(r1)
            java.lang.String r1 = r3.quantity
            r0.append(r1)
            java.lang.String r1 = ", token="
            r0.append(r1)
            java.lang.String r1 = r3.token
            r0.append(r1)
            java.lang.String r1 = ", tokenImageURL="
            r0.append(r1)
            java.lang.String r1 = r3.tokenImageURL
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
