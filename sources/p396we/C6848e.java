package p396we;

/* renamed from: we.e */
/* loaded from: classes.dex */
public final class C6848e {
    private final java.lang.String health_cost;
    private final int health_max;
    private final java.lang.String template_id;

    public C6848e(java.lang.String r2, java.lang.String r3, int r4) {
            r1 = this;
            java.lang.String r0 = "template_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "health_cost"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.template_id = r2
            r1.health_cost = r3
            r1.health_max = r4
            return
    }

    private final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.health_cost
            return r0
    }

    public static /* synthetic */ p396we.C6848e copy$default(p396we.C6848e r0, java.lang.String r1, java.lang.String r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = r0.template_id
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.lang.String r2 = r0.health_cost
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            int r3 = r0.health_max
        L12:
            we.e r0 = r0.copy(r1, r2, r3)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.template_id
            return r0
    }

    public final int component3() {
            r1 = this;
            int r0 = r1.health_max
            return r0
    }

    public final p396we.C6848e copy(java.lang.String r2, java.lang.String r3, int r4) {
            r1 = this;
            java.lang.String r0 = "template_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "health_cost"
            p214m2.C4339q.m9706k(r3, r0)
            we.e r0 = new we.e
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p396we.C6848e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            we.e r5 = (p396we.C6848e) r5
            java.lang.String r1 = r4.template_id
            java.lang.String r3 = r5.template_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.health_cost
            java.lang.String r3 = r5.health_cost
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            int r1 = r4.health_max
            int r5 = r5.health_max
            if (r1 == r5) goto L29
            return r2
        L29:
            return r0
    }

    public final double getHealthCostValue() {
            r4 = this;
            java.lang.String r0 = r4.health_cost
            java.lang.String r1 = " "
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 0
            r3 = 6
            java.util.List r0 = p362uh.C6467m.m13080k0(r0, r1, r2, r2, r3)
            java.lang.Object r0 = p062dh.C1473i.m3995G(r0)
            java.lang.String r0 = (java.lang.String) r0
            double r0 = java.lang.Double.parseDouble(r0)
            return r0
    }

    public final int getHealth_max() {
            r1 = this;
            int r0 = r1.health_max
            return r0
    }

    public final java.lang.String getTemplate_id() {
            r1 = this;
            java.lang.String r0 = r1.template_id
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.template_id
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.health_cost
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            int r1 = r3.health_max
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ConfigTemplate(template_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.template_id
            r0.append(r1)
            java.lang.String r1 = ", health_cost="
            r0.append(r1)
            java.lang.String r1 = r3.health_cost
            r0.append(r1)
            java.lang.String r1 = ", health_max="
            r0.append(r1)
            int r1 = r3.health_max
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
