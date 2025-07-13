package p133hg;

/* renamed from: hg.a */
/* loaded from: classes.dex */
public final class C3037a {
    private final java.lang.String result;

    public C3037a(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "result"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.result = r2
            return
    }

    public static /* synthetic */ p133hg.C3037a copy$default(p133hg.C3037a r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = r0.result
        L6:
            hg.a r0 = r0.copy(r1)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.result
            return r0
    }

    public final p133hg.C3037a copy(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "result"
            p214m2.C4339q.m9706k(r2, r0)
            hg.a r0 = new hg.a
            r0.<init>(r2)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p133hg.C3037a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            hg.a r4 = (p133hg.C3037a) r4
            java.lang.String r1 = r3.result
            java.lang.String r4 = r4.result
            boolean r4 = p214m2.C4339q.m9702c(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final double getAetherDouble() {
            r4 = this;
            java.lang.String r0 = r4.result
            java.lang.String r1 = " "
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 0
            r3 = 6
            java.util.List r0 = p362uh.C6467m.m13080k0(r0, r1, r2, r2, r3)
            java.lang.Object r0 = p062dh.C1473i.m3996H(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L21
            java.lang.Double r0 = p362uh.C6462h.m13048E(r0)
            if (r0 == 0) goto L21
            double r0 = r0.doubleValue()
            goto L23
        L21:
            r0 = 0
        L23:
            return r0
    }

    public final java.lang.String getResult() {
            r1 = this;
            java.lang.String r0 = r1.result
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.result
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "AetherCollected(result="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.result
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
