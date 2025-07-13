package md;

/* renamed from: md.l */
/* loaded from: classes.dex */
public final class C4563l {
    private final java.util.List<md.C4561k> rows;

    public C4563l(java.util.List<md.C4561k> r2) {
            r1 = this;
            java.lang.String r0 = "rows"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.rows = r2
            return
    }

    public static /* synthetic */ md.C4563l copy$default(md.C4563l r0, java.util.List r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.util.List<md.k> r1 = r0.rows
        L6:
            md.l r0 = r0.copy(r1)
            return r0
    }

    public final java.util.List<md.C4561k> component1() {
            r1 = this;
            java.util.List<md.k> r0 = r1.rows
            return r0
    }

    public final md.C4563l copy(java.util.List<md.C4561k> r2) {
            r1 = this;
            java.lang.String r0 = "rows"
            p214m2.C4339q.m9706k(r2, r0)
            md.l r0 = new md.l
            r0.<init>(r2)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof md.C4563l
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            md.l r4 = (md.C4563l) r4
            java.util.List<md.k> r1 = r3.rows
            java.util.List<md.k> r4 = r4.rows
            boolean r4 = p214m2.C4339q.m9702c(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final java.util.List<md.C4561k> getRows() {
            r1 = this;
            java.util.List<md.k> r0 = r1.rows
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.util.List<md.k> r0 = r1.rows
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ClaimTacoRows(rows="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.util.List<md.k> r1 = r3.rows
            r2 = 41
            java.lang.String r0 = p213m1.C4320f.m9652a(r0, r1, r2)
            return r0
    }
}
