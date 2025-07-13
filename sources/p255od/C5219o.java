package p255od;

/* renamed from: od.o */
/* loaded from: classes.dex */
public final class C5219o {

    @p189kb.InterfaceC4079b("co-owners_amount")
    private final java.lang.Double co_owners_amount;

    @p189kb.InterfaceC4079b("partial_dead_orcs_counter")
    private final java.lang.String partial_dead_orcs_counter;

    public C5219o(java.lang.Double r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.co_owners_amount = r1
            r0.partial_dead_orcs_counter = r2
            return
    }

    public static /* synthetic */ p255od.C5219o copy$default(p255od.C5219o r0, java.lang.Double r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.Double r1 = r0.co_owners_amount
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.lang.String r2 = r0.partial_dead_orcs_counter
        Lc:
            od.o r0 = r0.copy(r1, r2)
            return r0
    }

    public final java.lang.Double component1() {
            r1 = this;
            java.lang.Double r0 = r1.co_owners_amount
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.partial_dead_orcs_counter
            return r0
    }

    public final p255od.C5219o copy(java.lang.Double r2, java.lang.String r3) {
            r1 = this;
            od.o r0 = new od.o
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p255od.C5219o
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.o r5 = (p255od.C5219o) r5
            java.lang.Double r1 = r4.co_owners_amount
            java.lang.Double r3 = r5.co_owners_amount
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.partial_dead_orcs_counter
            java.lang.String r5 = r5.partial_dead_orcs_counter
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final java.lang.Double getCo_owners_amount() {
            r1 = this;
            java.lang.Double r0 = r1.co_owners_amount
            return r0
    }

    public final java.lang.String getPartial_dead_orcs_counter() {
            r1 = this;
            java.lang.String r0 = r1.partial_dead_orcs_counter
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.Double r0 = r3.co_owners_amount
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            java.lang.String r2 = r3.partial_dead_orcs_counter
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r1 = r2.hashCode()
        L16:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ClashdomeLandData(co_owners_amount="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Double r1 = r3.co_owners_amount
            r0.append(r1)
            java.lang.String r1 = ", partial_dead_orcs_counter="
            r0.append(r1)
            java.lang.String r1 = r3.partial_dead_orcs_counter
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
