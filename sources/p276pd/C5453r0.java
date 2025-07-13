package p276pd;

/* renamed from: pd.r0 */
/* loaded from: classes.dex */
public final class C5453r0 implements p276pd.InterfaceC5460t1 {

    /* renamed from: to */
    private final java.lang.String f21398to;

    public C5453r0(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "to"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.f21398to = r2
            return
    }

    public static /* synthetic */ p276pd.C5453r0 copy$default(p276pd.C5453r0 r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = r0.f21398to
        L6:
            pd.r0 r0 = r0.copy(r1)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.f21398to
            return r0
    }

    public final p276pd.C5453r0 copy(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "to"
            p214m2.C4339q.m9706k(r2, r0)
            pd.r0 r0 = new pd.r0
            r0.<init>(r2)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p276pd.C5453r0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            pd.r0 r4 = (p276pd.C5453r0) r4
            java.lang.String r1 = r3.f21398to
            java.lang.String r4 = r4.f21398to
            boolean r4 = p214m2.C4339q.m9702c(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final java.lang.String getGetTo() {
            r1 = this;
            java.lang.String r0 = r1.f21398to
            return r0
    }

    @Override // p276pd.InterfaceC5460t1
    public java.lang.String getHex() {
            r2 = this;
            pd.a r0 = new pd.a
            dd.b r1 = p059dd.EnumC1428b.f7113Y
            r0.<init>(r1)
            pd.a r0 = r0.squishClaimRplanetAetherArgs(r2)
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

    public final java.lang.String getTo() {
            r1 = this;
            java.lang.String r0 = r1.f21398to
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f21398to
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ClaimRplanetAetherArgs(to="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f21398to
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
