package p255od;

/* renamed from: od.s0 */
/* loaded from: classes.dex */
public final class C5228s0 {
    private final java.util.List<java.lang.String> asset_ids;
    private final java.lang.String memo;

    /* renamed from: to */
    private final java.lang.String f20352to;

    public C5228s0(java.lang.String r2, java.util.List<java.lang.String> r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "to"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "asset_ids"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "memo"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.f20352to = r2
            r1.asset_ids = r3
            r1.memo = r4
            return
    }

    public static /* synthetic */ p255od.C5228s0 copy$default(p255od.C5228s0 r0, java.lang.String r1, java.util.List r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = r0.f20352to
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.util.List<java.lang.String> r2 = r0.asset_ids
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            java.lang.String r3 = r0.memo
        L12:
            od.s0 r0 = r0.copy(r1, r2, r3)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.f20352to
            return r0
    }

    public final java.util.List<java.lang.String> component2() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.asset_ids
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.memo
            return r0
    }

    public final p255od.C5228s0 copy(java.lang.String r2, java.util.List<java.lang.String> r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "to"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "asset_ids"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "memo"
            p214m2.C4339q.m9706k(r4, r0)
            od.s0 r0 = new od.s0
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p255od.C5228s0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.s0 r5 = (p255od.C5228s0) r5
            java.lang.String r1 = r4.f20352to
            java.lang.String r3 = r5.f20352to
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List<java.lang.String> r1 = r4.asset_ids
            java.util.List<java.lang.String> r3 = r5.asset_ids
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.memo
            java.lang.String r5 = r5.memo
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final java.util.List<java.lang.String> getAsset_ids() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.asset_ids
            return r0
    }

    public final java.lang.String getMemo() {
            r1 = this;
            java.lang.String r0 = r1.memo
            return r0
    }

    public final java.lang.String getTo() {
            r1 = this;
            java.lang.String r0 = r1.f20352to
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f20352to
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List<java.lang.String> r1 = r3.asset_ids
            r2 = 31
            int r0 = p255od.C5212k0.m11509a(r1, r0, r2)
            java.lang.String r1 = r3.memo
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "TransferNFT(to="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f20352to
            r0.append(r1)
            java.lang.String r1 = ", asset_ids="
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r3.asset_ids
            r0.append(r1)
            java.lang.String r1 = ", memo="
            r0.append(r1)
            java.lang.String r1 = r3.memo
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
