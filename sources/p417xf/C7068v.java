package p417xf;

/* renamed from: xf.v */
/* loaded from: classes.dex */
public final class C7068v {
    private final java.lang.String suggested_median;
    private final java.lang.String token_symbol;

    public C7068v(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "suggested_median"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "token_symbol"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.suggested_median = r2
            r1.token_symbol = r3
            return
    }

    public static /* synthetic */ p417xf.C7068v copy$default(p417xf.C7068v r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = r0.suggested_median
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.lang.String r2 = r0.token_symbol
        Lc:
            xf.v r0 = r0.copy(r1, r2)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.suggested_median
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.token_symbol
            return r0
    }

    public final p417xf.C7068v copy(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "suggested_median"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "token_symbol"
            p214m2.C4339q.m9706k(r3, r0)
            xf.v r0 = new xf.v
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p417xf.C7068v
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xf.v r5 = (p417xf.C7068v) r5
            java.lang.String r1 = r4.suggested_median
            java.lang.String r3 = r5.suggested_median
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.token_symbol
            java.lang.String r5 = r5.token_symbol
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final java.lang.String getSuggested_median() {
            r1 = this;
            java.lang.String r0 = r1.suggested_median
            return r0
    }

    public final java.lang.String getToken_symbol() {
            r1 = this;
            java.lang.String r0 = r1.token_symbol
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.suggested_median
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.token_symbol
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "PriceCollection(suggested_median="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.suggested_median
            r0.append(r1)
            java.lang.String r1 = ", token_symbol="
            r0.append(r1)
            java.lang.String r1 = r3.token_symbol
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
