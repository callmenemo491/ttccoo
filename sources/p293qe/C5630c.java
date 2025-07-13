package p293qe;

/* renamed from: qe.c */
/* loaded from: classes.dex */
public final class C5630c {
    private final java.lang.String miner;
    private final java.util.List<java.lang.Integer> template_ids;

    public C5630c(java.lang.String r2, java.util.List<java.lang.Integer> r3) {
            r1 = this;
            java.lang.String r0 = "miner"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "template_ids"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.miner = r2
            r1.template_ids = r3
            return
    }

    public static /* synthetic */ p293qe.C5630c copy$default(p293qe.C5630c r0, java.lang.String r1, java.util.List r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = r0.miner
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.util.List<java.lang.Integer> r2 = r0.template_ids
        Lc:
            qe.c r0 = r0.copy(r1, r2)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.miner
            return r0
    }

    public final java.util.List<java.lang.Integer> component2() {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.template_ids
            return r0
    }

    public final p293qe.C5630c copy(java.lang.String r2, java.util.List<java.lang.Integer> r3) {
            r1 = this;
            java.lang.String r0 = "miner"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "template_ids"
            p214m2.C4339q.m9706k(r3, r0)
            qe.c r0 = new qe.c
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p293qe.C5630c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qe.c r5 = (p293qe.C5630c) r5
            java.lang.String r1 = r4.miner
            java.lang.String r3 = r5.miner
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List<java.lang.Integer> r1 = r4.template_ids
            java.util.List<java.lang.Integer> r5 = r5.template_ids
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final java.lang.String getMiner() {
            r1 = this;
            java.lang.String r0 = r1.miner
            return r0
    }

    public final java.util.List<java.lang.Integer> getTemplate_ids() {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.template_ids
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.miner
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List<java.lang.Integer> r1 = r2.template_ids
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "NftsRow(miner="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.miner
            r0.append(r1)
            java.lang.String r1 = ", template_ids="
            r0.append(r1)
            java.util.List<java.lang.Integer> r1 = r3.template_ids
            r2 = 41
            java.lang.String r0 = p213m1.C4320f.m9652a(r0, r1, r2)
            return r0
    }
}
