package md;

/* renamed from: md.t */
/* loaded from: classes.dex */
public final class C4579t {
    private final java.lang.String collected;

    public C4579t(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "collected"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.collected = r2
            return
    }

    public static /* synthetic */ md.C4579t copy$default(md.C4579t r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = r0.collected
        L6:
            md.t r0 = r0.copy(r1)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.collected
            return r0
    }

    public final md.C4579t copy(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "collected"
            p214m2.C4339q.m9706k(r2, r0)
            md.t r0 = new md.t
            r0.<init>(r2)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof md.C4579t
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            md.t r4 = (md.C4579t) r4
            java.lang.String r1 = r3.collected
            java.lang.String r4 = r4.collected
            boolean r4 = p214m2.C4339q.m9702c(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final java.lang.String getCollected() {
            r1 = this;
            java.lang.String r0 = r1.collected
            return r0
    }

    public final double getValueShell() {
            r4 = this;
            java.lang.String r0 = r4.collected
            java.lang.String r1 = " "
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 0
            r3 = 6
            java.util.List r0 = p362uh.C6467m.m13080k0(r0, r1, r2, r2, r3)
            int r1 = r0.size()
            r2 = 2
            if (r1 != r2) goto L20
            java.lang.Object r0 = p062dh.C1473i.m3995G(r0)
            java.lang.String r0 = (java.lang.String) r0
            double r0 = java.lang.Double.parseDouble(r0)
            goto L22
        L20:
            r0 = 0
        L22:
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.collected
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "GreenRabbitRow(collected="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.collected
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
