package p255od;

/* renamed from: od.z */
/* loaded from: classes.dex */
public final class C5238z {
    private final p255od.C5227s base_token;
    private final double base_token_quantity;

    /* renamed from: id */
    private final java.lang.String f20353id;
    private final java.lang.Boolean isInverted;
    private final double last_price;
    private final p255od.C5227s quote_token;
    private final double quote_token_quantity;

    public C5238z(java.lang.String r2, p255od.C5227s r3, p255od.C5227s r4, double r5, double r7, double r9, java.lang.Boolean r11) {
            r1 = this;
            java.lang.String r0 = "id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "base_token"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "quote_token"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.f20353id = r2
            r1.base_token = r3
            r1.quote_token = r4
            r1.base_token_quantity = r5
            r1.quote_token_quantity = r7
            r1.last_price = r9
            r1.isInverted = r11
            return
    }

    public static /* synthetic */ p255od.C5238z copy$default(p255od.C5238z r11, java.lang.String r12, p255od.C5227s r13, p255od.C5227s r14, double r15, double r17, double r19, java.lang.Boolean r21, int r22, java.lang.Object r23) {
            r0 = r11
            r1 = r22 & 1
            if (r1 == 0) goto L8
            java.lang.String r1 = r0.f20353id
            goto L9
        L8:
            r1 = r12
        L9:
            r2 = r22 & 2
            if (r2 == 0) goto L10
            od.s r2 = r0.base_token
            goto L11
        L10:
            r2 = r13
        L11:
            r3 = r22 & 4
            if (r3 == 0) goto L18
            od.s r3 = r0.quote_token
            goto L19
        L18:
            r3 = r14
        L19:
            r4 = r22 & 8
            if (r4 == 0) goto L20
            double r4 = r0.base_token_quantity
            goto L21
        L20:
            r4 = r15
        L21:
            r6 = r22 & 16
            if (r6 == 0) goto L28
            double r6 = r0.quote_token_quantity
            goto L2a
        L28:
            r6 = r17
        L2a:
            r8 = r22 & 32
            if (r8 == 0) goto L31
            double r8 = r0.last_price
            goto L33
        L31:
            r8 = r19
        L33:
            r10 = r22 & 64
            if (r10 == 0) goto L3a
            java.lang.Boolean r10 = r0.isInverted
            goto L3c
        L3a:
            r10 = r21
        L3c:
            r12 = r1
            r13 = r2
            r14 = r3
            r15 = r4
            r17 = r6
            r19 = r8
            r21 = r10
            od.z r0 = r11.copy(r12, r13, r14, r15, r17, r19, r21)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.f20353id
            return r0
    }

    public final p255od.C5227s component2() {
            r1 = this;
            od.s r0 = r1.base_token
            return r0
    }

    public final p255od.C5227s component3() {
            r1 = this;
            od.s r0 = r1.quote_token
            return r0
    }

    public final double component4() {
            r2 = this;
            double r0 = r2.base_token_quantity
            return r0
    }

    public final double component5() {
            r2 = this;
            double r0 = r2.quote_token_quantity
            return r0
    }

    public final double component6() {
            r2 = this;
            double r0 = r2.last_price
            return r0
    }

    public final java.lang.Boolean component7() {
            r1 = this;
            java.lang.Boolean r0 = r1.isInverted
            return r0
    }

    public final p255od.C5238z copy(java.lang.String r13, p255od.C5227s r14, p255od.C5227s r15, double r16, double r18, double r20, java.lang.Boolean r22) {
            r12 = this;
            java.lang.String r0 = "id"
            r2 = r13
            p214m2.C4339q.m9706k(r13, r0)
            java.lang.String r0 = "base_token"
            r3 = r14
            p214m2.C4339q.m9706k(r14, r0)
            java.lang.String r0 = "quote_token"
            r4 = r15
            p214m2.C4339q.m9706k(r15, r0)
            od.z r0 = new od.z
            r1 = r0
            r5 = r16
            r7 = r18
            r9 = r20
            r11 = r22
            r1.<init>(r2, r3, r4, r5, r7, r9, r11)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p255od.C5238z
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.z r6 = (p255od.C5238z) r6
            java.lang.String r1 = r5.f20353id
            java.lang.String r3 = r6.f20353id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            od.s r1 = r5.base_token
            od.s r3 = r6.base_token
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            od.s r1 = r5.quote_token
            od.s r3 = r6.quote_token
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            double r3 = r5.base_token_quantity
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.base_token_quantity
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L40
            return r2
        L40:
            double r3 = r5.quote_token_quantity
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.quote_token_quantity
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L53
            return r2
        L53:
            double r3 = r5.last_price
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.last_price
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L66
            return r2
        L66:
            java.lang.Boolean r1 = r5.isInverted
            java.lang.Boolean r6 = r6.isInverted
            boolean r6 = p214m2.C4339q.m9702c(r1, r6)
            if (r6 != 0) goto L71
            return r2
        L71:
            return r0
    }

    public final p255od.C5227s getBase_token() {
            r1 = this;
            od.s r0 = r1.base_token
            return r0
    }

    public final double getBase_token_quantity() {
            r2 = this;
            double r0 = r2.base_token_quantity
            return r0
    }

    public final java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.f20353id
            return r0
    }

    public final double getLast_price() {
            r2 = this;
            double r0 = r2.last_price
            return r0
    }

    public final p255od.C5227s getQuote_token() {
            r1 = this;
            od.s r0 = r1.quote_token
            return r0
    }

    public final double getQuote_token_quantity() {
            r2 = this;
            double r0 = r2.quote_token_quantity
            return r0
    }

    public int hashCode() {
            r6 = this;
            java.lang.String r0 = r6.f20353id
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            od.s r1 = r6.base_token
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            od.s r0 = r6.quote_token
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            double r1 = r6.base_token_quantity
            long r1 = java.lang.Double.doubleToLongBits(r1)
            r3 = 32
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            double r1 = r6.quote_token_quantity
            long r1 = java.lang.Double.doubleToLongBits(r1)
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            double r1 = r6.last_price
            long r1 = java.lang.Double.doubleToLongBits(r1)
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Boolean r1 = r6.isInverted
            if (r1 != 0) goto L49
            r1 = 0
            goto L4d
        L49:
            int r1 = r1.hashCode()
        L4d:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.Boolean isInverted() {
            r1 = this;
            java.lang.Boolean r0 = r1.isInverted
            return r0
    }

    public final je.C3579a toBaseMarketConversion() {
            r7 = this;
            je.a r6 = new je.a
            od.s r0 = r7.base_token
            od.o0 r0 = r0.getSymbol()
            java.lang.String r1 = r0.getName()
            od.s r0 = r7.base_token
            od.o0 r0 = r0.getSymbol()
            int r2 = r0.getPrecision()
            od.s r0 = r7.base_token
            java.lang.String r3 = r0.getContract()
            double r4 = r7.last_price
            r0 = r6
            r0.<init>(r1, r2, r3, r4)
            return r6
    }

    public final je.C3579a toQuoteMarketConversion() {
            r9 = this;
            je.a r6 = new je.a
            od.s r0 = r9.quote_token
            od.o0 r0 = r0.getSymbol()
            java.lang.String r1 = r0.getName()
            od.s r0 = r9.quote_token
            od.o0 r0 = r0.getSymbol()
            int r2 = r0.getPrecision()
            od.s r0 = r9.quote_token
            java.lang.String r3 = r0.getContract()
            r0 = 1
            double r4 = (double) r0
            double r7 = r9.last_price
            double r4 = r4 / r7
            r0 = r6
            r0.<init>(r1, r2, r3, r4)
            return r6
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Market(id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f20353id
            r0.append(r1)
            java.lang.String r1 = ", base_token="
            r0.append(r1)
            od.s r1 = r3.base_token
            r0.append(r1)
            java.lang.String r1 = ", quote_token="
            r0.append(r1)
            od.s r1 = r3.quote_token
            r0.append(r1)
            java.lang.String r1 = ", base_token_quantity="
            r0.append(r1)
            double r1 = r3.base_token_quantity
            r0.append(r1)
            java.lang.String r1 = ", quote_token_quantity="
            r0.append(r1)
            double r1 = r3.quote_token_quantity
            r0.append(r1)
            java.lang.String r1 = ", last_price="
            r0.append(r1)
            double r1 = r3.last_price
            r0.append(r1)
            java.lang.String r1 = ", isInverted="
            r0.append(r1)
            java.lang.Boolean r1 = r3.isInverted
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
