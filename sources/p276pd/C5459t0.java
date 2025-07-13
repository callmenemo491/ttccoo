package p276pd;

/* renamed from: pd.t0 */
/* loaded from: classes.dex */
public final class C5459t0 implements p276pd.InterfaceC5460t1 {
    private final java.util.List<java.lang.String> land_ids;
    private final java.lang.String owner;

    public C5459t0(java.lang.String r2, java.util.List<java.lang.String> r3) {
            r1 = this;
            java.lang.String r0 = "owner"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "land_ids"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.owner = r2
            r1.land_ids = r3
            return
    }

    public static /* synthetic */ p276pd.C5459t0 copy$default(p276pd.C5459t0 r0, java.lang.String r1, java.util.List r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = r0.owner
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.util.List<java.lang.String> r2 = r0.land_ids
        Lc:
            pd.t0 r0 = r0.copy(r1, r2)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.owner
            return r0
    }

    public final java.util.List<java.lang.String> component2() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.land_ids
            return r0
    }

    public final p276pd.C5459t0 copy(java.lang.String r2, java.util.List<java.lang.String> r3) {
            r1 = this;
            java.lang.String r0 = "owner"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "land_ids"
            p214m2.C4339q.m9706k(r3, r0)
            pd.t0 r0 = new pd.t0
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p276pd.C5459t0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            pd.t0 r5 = (p276pd.C5459t0) r5
            java.lang.String r1 = r4.owner
            java.lang.String r3 = r5.owner
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List<java.lang.String> r1 = r4.land_ids
            java.util.List<java.lang.String> r5 = r5.land_ids
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final byte[] getGetLandIds() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.land_ids
            byte[] r0 = p185k7.C4038x4.m9093f(r0)
            return r0
    }

    public final java.lang.String getGetOwner() {
            r1 = this;
            java.lang.String r0 = r1.owner
            return r0
    }

    @Override // p276pd.InterfaceC5460t1
    public java.lang.String getHex() {
            r2 = this;
            pd.a r0 = new pd.a
            dd.b r1 = p059dd.EnumC1428b.f7113Y
            r0.<init>(r1)
            pd.a r0 = r0.squishClaimRplanetLandArgs(r2)
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

    public final java.util.List<java.lang.String> getLand_ids() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.land_ids
            return r0
    }

    public final java.lang.String getOwner() {
            r1 = this;
            java.lang.String r0 = r1.owner
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.owner
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List<java.lang.String> r1 = r2.land_ids
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ClaimRplanetLandArgs(owner="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.owner
            r0.append(r1)
            java.lang.String r1 = ", land_ids="
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r3.land_ids
            r2 = 41
            java.lang.String r0 = p213m1.C4320f.m9652a(r0, r1, r2)
            return r0
    }
}
