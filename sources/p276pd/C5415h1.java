package p276pd;

/* renamed from: pd.h1 */
/* loaded from: classes.dex */
public final class C5415h1 implements p276pd.InterfaceC5460t1 {
    private final java.lang.String account;
    private final java.lang.String target;
    private final java.lang.String value;

    public C5415h1(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "account"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "value"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "target"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.account = r2
            r1.value = r3
            r1.target = r4
            return
    }

    public static /* synthetic */ p276pd.C5415h1 copy$default(p276pd.C5415h1 r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = r0.account
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.lang.String r2 = r0.value
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            java.lang.String r3 = r0.target
        L12:
            pd.h1 r0 = r0.copy(r1, r2, r3)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.account
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.target
            return r0
    }

    public final p276pd.C5415h1 copy(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "account"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "value"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "target"
            p214m2.C4339q.m9706k(r4, r0)
            pd.h1 r0 = new pd.h1
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p276pd.C5415h1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            pd.h1 r5 = (p276pd.C5415h1) r5
            java.lang.String r1 = r4.account
            java.lang.String r3 = r5.account
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.value
            java.lang.String r3 = r5.value
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.target
            java.lang.String r5 = r5.target
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final java.lang.String getAccount() {
            r1 = this;
            java.lang.String r0 = r1.account
            return r0
    }

    public final java.lang.String getGetAccount() {
            r1 = this;
            java.lang.String r0 = r1.account
            return r0
    }

    public final java.lang.String getGetTarget() {
            r1 = this;
            java.lang.String r0 = r1.target
            return r0
    }

    public final java.lang.String getGetValue() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }

    @Override // p276pd.InterfaceC5460t1
    public java.lang.String getHex() {
            r2 = this;
            pd.a r0 = new pd.a
            dd.b r1 = p059dd.EnumC1428b.f7113Y
            r0.<init>(r1)
            pd.a r0 = r0.squishFTStakeArgs(r2)
            java.lang.String r0 = r0.toHex()
            java.lang.String r1 = "AbiBinaryGenTransactions\u2026   this\n        ).toHex()"
            p214m2.C4339q.m9705j(r0, r1)
            return r0
    }

    @Override // p276pd.InterfaceC5460t1
    public java.lang.String getJson() {
            r1 = this;
            java.lang.String r0 = p276pd.InterfaceC5460t1.a.getJson(r1)
            return r0
    }

    public final java.lang.String getTarget() {
            r1 = this;
            java.lang.String r0 = r1.target
            return r0
    }

    public final java.lang.String getValue() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.account
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.value
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.target
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "FTStakeArgs(account="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.account
            r0.append(r1)
            java.lang.String r1 = ", value="
            r0.append(r1)
            java.lang.String r1 = r3.value
            r0.append(r1)
            java.lang.String r1 = ", target="
            r0.append(r1)
            java.lang.String r1 = r3.target
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
