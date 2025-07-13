package p255od;

/* renamed from: od.h */
/* loaded from: classes.dex */
public final class C5205h {
    private final java.lang.String account_name;
    private final java.util.List<p255od.C5203g> balances;

    public C5205h(java.util.List<p255od.C5203g> r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.balances = r1
            r0.account_name = r2
            return
    }

    public static /* synthetic */ p255od.C5205h copy$default(p255od.C5205h r0, java.util.List r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.util.List<od.g> r1 = r0.balances
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.lang.String r2 = r0.account_name
        Lc:
            od.h r0 = r0.copy(r1, r2)
            return r0
    }

    public final java.util.List<p255od.C5203g> component1() {
            r1 = this;
            java.util.List<od.g> r0 = r1.balances
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.account_name
            return r0
    }

    public final p255od.C5205h copy(java.util.List<p255od.C5203g> r2, java.lang.String r3) {
            r1 = this;
            od.h r0 = new od.h
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p255od.C5205h
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.h r5 = (p255od.C5205h) r5
            java.util.List<od.g> r1 = r4.balances
            java.util.List<od.g> r3 = r5.balances
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.account_name
            java.lang.String r5 = r5.account_name
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final java.lang.String getAccount_name() {
            r1 = this;
            java.lang.String r0 = r1.account_name
            return r0
    }

    public final java.util.List<p255od.C5203g> getBalances() {
            r1 = this;
            java.util.List<od.g> r0 = r1.balances
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.util.List<od.g> r0 = r3.balances
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            java.lang.String r2 = r3.account_name
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
            java.lang.String r0 = "BalanceResponse(balances="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.util.List<od.g> r1 = r3.balances
            r0.append(r1)
            java.lang.String r1 = ", account_name="
            r0.append(r1)
            java.lang.String r1 = r3.account_name
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
