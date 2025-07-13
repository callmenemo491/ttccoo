package p255od;

/* renamed from: od.s */
/* loaded from: classes.dex */
public final class C5227s {
    private final java.lang.String contract;
    private final java.lang.String str;
    private final p255od.C5220o0 symbol;

    public C5227s(java.lang.String r2, p255od.C5220o0 r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "contract"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "symbol"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "str"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.contract = r2
            r1.symbol = r3
            r1.str = r4
            return
    }

    public static /* synthetic */ p255od.C5227s copy$default(p255od.C5227s r0, java.lang.String r1, p255od.C5220o0 r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = r0.contract
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            od.o0 r2 = r0.symbol
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            java.lang.String r3 = r0.str
        L12:
            od.s r0 = r0.copy(r1, r2, r3)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.contract
            return r0
    }

    public final p255od.C5220o0 component2() {
            r1 = this;
            od.o0 r0 = r1.symbol
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.str
            return r0
    }

    public final p255od.C5227s copy(java.lang.String r2, p255od.C5220o0 r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "contract"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "symbol"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "str"
            p214m2.C4339q.m9706k(r4, r0)
            od.s r0 = new od.s
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p255od.C5227s
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.s r5 = (p255od.C5227s) r5
            java.lang.String r1 = r4.contract
            java.lang.String r3 = r5.contract
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            od.o0 r1 = r4.symbol
            od.o0 r3 = r5.symbol
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.str
            java.lang.String r5 = r5.str
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final java.lang.String getContract() {
            r1 = this;
            java.lang.String r0 = r1.contract
            return r0
    }

    public final java.lang.String getImage() {
            r2 = this;
            od.o0 r0 = r2.symbol
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r2.contract
            java.lang.String r0 = p097fd.C2139a.m5698b(r0, r1)
            return r0
    }

    public final java.lang.String getStr() {
            r1 = this;
            java.lang.String r0 = r1.str
            return r0
    }

    public final p255od.C5220o0 getSymbol() {
            r1 = this;
            od.o0 r0 = r1.symbol
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.contract
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            od.o0 r1 = r2.symbol
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r2.str
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final boolean isWax() {
            r2 = this;
            java.lang.String r0 = r2.contract
            java.lang.String r1 = "eosio.token"
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L1a
            od.o0 r0 = r2.symbol
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "WAX"
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "EToken(contract="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.contract
            r0.append(r1)
            java.lang.String r1 = ", symbol="
            r0.append(r1)
            od.o0 r1 = r3.symbol
            r0.append(r1)
            java.lang.String r1 = ", str="
            r0.append(r1)
            java.lang.String r1 = r3.str
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
