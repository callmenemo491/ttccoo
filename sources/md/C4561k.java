package md;

/* renamed from: md.k */
/* loaded from: classes.dex */
public final class C4561k {
    private final int last_claim;

    public C4561k(int r1) {
            r0 = this;
            r0.<init>()
            r0.last_claim = r1
            return
    }

    public static /* synthetic */ md.C4561k copy$default(md.C4561k r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            int r1 = r0.last_claim
        L6:
            md.k r0 = r0.copy(r1)
            return r0
    }

    public final int component1() {
            r1 = this;
            int r0 = r1.last_claim
            return r0
    }

    public final md.C4561k copy(int r2) {
            r1 = this;
            md.k r0 = new md.k
            r0.<init>(r2)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof md.C4561k
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            md.k r4 = (md.C4561k) r4
            int r1 = r3.last_claim
            int r4 = r4.last_claim
            if (r1 == r4) goto L13
            return r2
        L13:
            return r0
    }

    public final int getLast_claim() {
            r1 = this;
            int r0 = r1.last_claim
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.last_claim
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ClaimTacoRow(last_claim="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r3.last_claim
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
