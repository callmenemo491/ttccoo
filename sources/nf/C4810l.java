package nf;

/* renamed from: nf.l */
/* loaded from: classes.dex */
public final class C4810l {
    private final int cooldown;

    /* renamed from: id */
    private final java.lang.String f19205id;
    private final java.lang.String label;
    private final int resource_count;
    private final java.lang.String resource_type;
    private final int sest_amount;

    public C4810l(int r2, java.lang.String r3, java.lang.String r4, int r5, java.lang.String r6, int r7) {
            r1 = this;
            java.lang.String r0 = "id"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "label"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "resource_type"
            p214m2.C4339q.m9706k(r6, r0)
            r1.<init>()
            r1.cooldown = r2
            r1.f19205id = r3
            r1.label = r4
            r1.resource_count = r5
            r1.resource_type = r6
            r1.sest_amount = r7
            return
    }

    public static /* synthetic */ nf.C4810l copy$default(nf.C4810l r4, int r5, java.lang.String r6, java.lang.String r7, int r8, java.lang.String r9, int r10, int r11, java.lang.Object r12) {
            r12 = r11 & 1
            if (r12 == 0) goto L6
            int r5 = r4.cooldown
        L6:
            r12 = r11 & 2
            if (r12 == 0) goto Lc
            java.lang.String r6 = r4.f19205id
        Lc:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L13
            java.lang.String r7 = r4.label
        L13:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L1a
            int r8 = r4.resource_count
        L1a:
            r1 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L21
            java.lang.String r9 = r4.resource_type
        L21:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L28
            int r10 = r4.sest_amount
        L28:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            nf.l r4 = r6.copy(r7, r8, r9, r10, r11, r12)
            return r4
    }

    public final int component1() {
            r1 = this;
            int r0 = r1.cooldown
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.f19205id
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.label
            return r0
    }

    public final int component4() {
            r1 = this;
            int r0 = r1.resource_count
            return r0
    }

    public final java.lang.String component5() {
            r1 = this;
            java.lang.String r0 = r1.resource_type
            return r0
    }

    public final int component6() {
            r1 = this;
            int r0 = r1.sest_amount
            return r0
    }

    public final nf.C4810l copy(int r9, java.lang.String r10, java.lang.String r11, int r12, java.lang.String r13, int r14) {
            r8 = this;
            java.lang.String r0 = "id"
            p214m2.C4339q.m9706k(r10, r0)
            java.lang.String r0 = "label"
            p214m2.C4339q.m9706k(r11, r0)
            java.lang.String r0 = "resource_type"
            p214m2.C4339q.m9706k(r13, r0)
            nf.l r0 = new nf.l
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof nf.C4810l
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            nf.l r5 = (nf.C4810l) r5
            int r1 = r4.cooldown
            int r3 = r5.cooldown
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.f19205id
            java.lang.String r3 = r5.f19205id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r4.label
            java.lang.String r3 = r5.label
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            int r1 = r4.resource_count
            int r3 = r5.resource_count
            if (r1 == r3) goto L30
            return r2
        L30:
            java.lang.String r1 = r4.resource_type
            java.lang.String r3 = r5.resource_type
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L3b
            return r2
        L3b:
            int r1 = r4.sest_amount
            int r5 = r5.sest_amount
            if (r1 == r5) goto L42
            return r2
        L42:
            return r0
    }

    public final int getCooldown() {
            r1 = this;
            int r0 = r1.cooldown
            return r0
    }

    public final java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.f19205id
            return r0
    }

    public final java.lang.String getLabel() {
            r1 = this;
            java.lang.String r0 = r1.label
            return r0
    }

    public final int getResource_count() {
            r1 = this;
            int r0 = r1.resource_count
            return r0
    }

    public final java.lang.String getResource_type() {
            r1 = this;
            java.lang.String r0 = r1.resource_type
            return r0
    }

    public final int getSest_amount() {
            r1 = this;
            int r0 = r1.sest_amount
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.cooldown
            int r0 = r0 * 31
            java.lang.String r1 = r3.f19205id
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.label
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            int r1 = r3.resource_count
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.resource_type
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            int r1 = r3.sest_amount
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Confplant(cooldown="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r3.cooldown
            r0.append(r1)
            java.lang.String r1 = ", id="
            r0.append(r1)
            java.lang.String r1 = r3.f19205id
            r0.append(r1)
            java.lang.String r1 = ", label="
            r0.append(r1)
            java.lang.String r1 = r3.label
            r0.append(r1)
            java.lang.String r1 = ", resource_count="
            r0.append(r1)
            int r1 = r3.resource_count
            r0.append(r1)
            java.lang.String r1 = ", resource_type="
            r0.append(r1)
            java.lang.String r1 = r3.resource_type
            r0.append(r1)
            java.lang.String r1 = ", sest_amount="
            r0.append(r1)
            int r1 = r3.sest_amount
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
