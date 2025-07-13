package p276pd;

/* renamed from: pd.b */
/* loaded from: classes.dex */
public final class C5389b implements p276pd.InterfaceC5460t1 {
    private final java.lang.String scope;
    private final java.lang.String user;

    public C5389b(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "user"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "scope"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.user = r2
            r1.scope = r3
            return
    }

    public static /* synthetic */ p276pd.C5389b copy$default(p276pd.C5389b r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = r0.user
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.lang.String r2 = r0.scope
        Lc:
            pd.b r0 = r0.copy(r1, r2)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.user
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.scope
            return r0
    }

    public final p276pd.C5389b copy(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "user"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "scope"
            p214m2.C4339q.m9706k(r3, r0)
            pd.b r0 = new pd.b
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p276pd.C5389b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            pd.b r5 = (p276pd.C5389b) r5
            java.lang.String r1 = r4.user
            java.lang.String r3 = r5.user
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.scope
            java.lang.String r5 = r5.scope
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final java.lang.String getGetScope() {
            r1 = this;
            java.lang.String r0 = r1.scope
            return r0
    }

    public final java.lang.String getGetUser() {
            r1 = this;
            java.lang.String r0 = r1.user
            return r0
    }

    @Override // p276pd.InterfaceC5460t1
    public java.lang.String getHex() {
            r2 = this;
            pd.a r0 = new pd.a
            dd.b r1 = p059dd.EnumC1428b.f7113Y
            r0.<init>(r1)
            pd.a r0 = r0.squishActionTacoArgs(r2)
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

    public final java.lang.String getScope() {
            r1 = this;
            java.lang.String r0 = r1.scope
            return r0
    }

    public final java.lang.String getUser() {
            r1 = this;
            java.lang.String r0 = r1.user
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.user
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.scope
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ActionTacoArgs(user="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.user
            r0.append(r1)
            java.lang.String r1 = ", scope="
            r0.append(r1)
            java.lang.String r1 = r3.scope
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
