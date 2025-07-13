package md;

/* renamed from: md.n */
/* loaded from: classes.dex */
public final class C4567n {
    private final java.lang.String unclaimed;

    public C4567n(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "unclaimed"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.unclaimed = r2
            return
    }

    public static /* synthetic */ md.C4567n copy$default(md.C4567n r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = r0.unclaimed
        L6:
            md.n r0 = r0.copy(r1)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.unclaimed
            return r0
    }

    public final md.C4567n copy(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "unclaimed"
            p214m2.C4339q.m9706k(r2, r0)
            md.n r0 = new md.n
            r0.<init>(r2)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof md.C4567n
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            md.n r4 = (md.C4567n) r4
            java.lang.String r1 = r3.unclaimed
            java.lang.String r4 = r4.unclaimed
            boolean r4 = p214m2.C4339q.m9702c(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final java.lang.String getUnclaimed() {
            r1 = this;
            java.lang.String r0 = r1.unclaimed
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.unclaimed
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "CoinPiratesRow(unclaimed="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.unclaimed
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
