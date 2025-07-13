package p344te;

/* renamed from: te.h */
/* loaded from: classes.dex */
public final class C6226h {
    private final java.lang.String buyer;
    private final long price;
    private final int token_precision;
    private final java.lang.String token_symbol;

    public C6226h(long r2, java.lang.String r4, int r5, java.lang.String r6) {
            r1 = this;
            java.lang.String r0 = "token_symbol"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "buyer"
            p214m2.C4339q.m9706k(r6, r0)
            r1.<init>()
            r1.price = r2
            r1.token_symbol = r4
            r1.token_precision = r5
            r1.buyer = r6
            return
    }

    public static /* synthetic */ p344te.C6226h copy$default(p344te.C6226h r6, long r7, java.lang.String r9, int r10, java.lang.String r11, int r12, java.lang.Object r13) {
            r13 = r12 & 1
            if (r13 == 0) goto L6
            long r7 = r6.price
        L6:
            r1 = r7
            r7 = r12 & 2
            if (r7 == 0) goto Ld
            java.lang.String r9 = r6.token_symbol
        Ld:
            r3 = r9
            r7 = r12 & 4
            if (r7 == 0) goto L14
            int r10 = r6.token_precision
        L14:
            r4 = r10
            r7 = r12 & 8
            if (r7 == 0) goto L1b
            java.lang.String r11 = r6.buyer
        L1b:
            r5 = r11
            r0 = r6
            te.h r6 = r0.copy(r1, r3, r4, r5)
            return r6
    }

    public final long component1() {
            r2 = this;
            long r0 = r2.price
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.token_symbol
            return r0
    }

    public final int component3() {
            r1 = this;
            int r0 = r1.token_precision
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.buyer
            return r0
    }

    public final p344te.C6226h copy(long r8, java.lang.String r10, int r11, java.lang.String r12) {
            r7 = this;
            java.lang.String r0 = "token_symbol"
            p214m2.C4339q.m9706k(r10, r0)
            java.lang.String r0 = "buyer"
            p214m2.C4339q.m9706k(r12, r0)
            te.h r0 = new te.h
            r1 = r0
            r2 = r8
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r4, r5, r6)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p344te.C6226h
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            te.h r8 = (p344te.C6226h) r8
            long r3 = r7.price
            long r5 = r8.price
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            java.lang.String r1 = r7.token_symbol
            java.lang.String r3 = r8.token_symbol
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L20
            return r2
        L20:
            int r1 = r7.token_precision
            int r3 = r8.token_precision
            if (r1 == r3) goto L27
            return r2
        L27:
            java.lang.String r1 = r7.buyer
            java.lang.String r8 = r8.buyer
            boolean r8 = p214m2.C4339q.m9702c(r1, r8)
            if (r8 != 0) goto L32
            return r2
        L32:
            return r0
    }

    public final java.lang.String getBuyer() {
            r1 = this;
            java.lang.String r0 = r1.buyer
            return r0
    }

    public final long getPrice() {
            r2 = this;
            long r0 = r2.price
            return r0
    }

    public final java.lang.Double getPriceWax() {
            r4 = this;
            java.lang.String r0 = r4.token_symbol
            java.lang.String r1 = "WAX"
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L18
            long r0 = r4.price
            double r0 = (double) r0
            r2 = 4726483295884279808(0x4197d78400000000, double:1.0E8)
            double r0 = r0 / r2
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    public final int getToken_precision() {
            r1 = this;
            int r0 = r1.token_precision
            return r0
    }

    public final java.lang.String getToken_symbol() {
            r1 = this;
            java.lang.String r0 = r1.token_symbol
            return r0
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.price
            r2 = 32
            long r2 = r0 >>> r2
            long r0 = r0 ^ r2
            int r1 = (int) r0
            int r1 = r1 * 31
            java.lang.String r0 = r4.token_symbol
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r0, r1, r2)
            int r1 = r4.token_precision
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r4.buyer
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "SaleAtomic(price="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            long r1 = r3.price
            r0.append(r1)
            java.lang.String r1 = ", token_symbol="
            r0.append(r1)
            java.lang.String r1 = r3.token_symbol
            r0.append(r1)
            java.lang.String r1 = ", token_precision="
            r0.append(r1)
            int r1 = r3.token_precision
            r0.append(r1)
            java.lang.String r1 = ", buyer="
            r0.append(r1)
            java.lang.String r1 = r3.buyer
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
