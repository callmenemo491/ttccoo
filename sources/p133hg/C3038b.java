package p133hg;

/* renamed from: hg.b */
/* loaded from: classes.dex */
public final class C3038b {
    private final int extended_at;
    private final java.lang.String limit;

    public C3038b(int r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "limit"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.extended_at = r2
            r1.limit = r3
            return
    }

    public static /* synthetic */ p133hg.C3038b copy$default(p133hg.C3038b r0, int r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            int r1 = r0.extended_at
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.lang.String r2 = r0.limit
        Lc:
            hg.b r0 = r0.copy(r1, r2)
            return r0
    }

    public final int component1() {
            r1 = this;
            int r0 = r1.extended_at
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.limit
            return r0
    }

    public final p133hg.C3038b copy(int r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "limit"
            p214m2.C4339q.m9706k(r3, r0)
            hg.b r0 = new hg.b
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p133hg.C3038b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            hg.b r5 = (p133hg.C3038b) r5
            int r1 = r4.extended_at
            int r3 = r5.extended_at
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.limit
            java.lang.String r5 = r5.limit
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int getExtended_at() {
            r1 = this;
            int r0 = r1.extended_at
            return r0
    }

    public final java.lang.String getLimit() {
            r1 = this;
            java.lang.String r0 = r1.limit
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.extended_at
            int r0 = r0 * 31
            java.lang.String r1 = r2.limit
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ClaimLimit(extended_at="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r3.extended_at
            r0.append(r1)
            java.lang.String r1 = ", limit="
            r0.append(r1)
            java.lang.String r1 = r3.limit
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
