package nf;

/* renamed from: nf.f */
/* loaded from: classes.dex */
public final class C4804f {
    private final int cooldown;
    private final int food;
    private final java.lang.String label;
    private final int resource_count;
    private final java.lang.String resource_type;
    private final int sest_amount;
    private final int template_id;
    private final int water;

    public C4804f(int r2, int r3, java.lang.String r4, int r5, java.lang.String r6, int r7, int r8, int r9) {
            r1 = this;
            java.lang.String r0 = "label"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "resource_type"
            p214m2.C4339q.m9706k(r6, r0)
            r1.<init>()
            r1.cooldown = r2
            r1.food = r3
            r1.label = r4
            r1.resource_count = r5
            r1.resource_type = r6
            r1.sest_amount = r7
            r1.template_id = r8
            r1.water = r9
            return
    }

    public static /* synthetic */ nf.C4804f copy$default(nf.C4804f r9, int r10, int r11, java.lang.String r12, int r13, java.lang.String r14, int r15, int r16, int r17, int r18, java.lang.Object r19) {
            r0 = r9
            r1 = r18
            r2 = r1 & 1
            if (r2 == 0) goto La
            int r2 = r0.cooldown
            goto Lb
        La:
            r2 = r10
        Lb:
            r3 = r1 & 2
            if (r3 == 0) goto L12
            int r3 = r0.food
            goto L13
        L12:
            r3 = r11
        L13:
            r4 = r1 & 4
            if (r4 == 0) goto L1a
            java.lang.String r4 = r0.label
            goto L1b
        L1a:
            r4 = r12
        L1b:
            r5 = r1 & 8
            if (r5 == 0) goto L22
            int r5 = r0.resource_count
            goto L23
        L22:
            r5 = r13
        L23:
            r6 = r1 & 16
            if (r6 == 0) goto L2a
            java.lang.String r6 = r0.resource_type
            goto L2b
        L2a:
            r6 = r14
        L2b:
            r7 = r1 & 32
            if (r7 == 0) goto L32
            int r7 = r0.sest_amount
            goto L33
        L32:
            r7 = r15
        L33:
            r8 = r1 & 64
            if (r8 == 0) goto L3a
            int r8 = r0.template_id
            goto L3c
        L3a:
            r8 = r16
        L3c:
            r1 = r1 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L43
            int r1 = r0.water
            goto L45
        L43:
            r1 = r17
        L45:
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r14 = r6
            r15 = r7
            r16 = r8
            r17 = r1
            nf.f r0 = r9.copy(r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
    }

    public final int component1() {
            r1 = this;
            int r0 = r1.cooldown
            return r0
    }

    public final int component2() {
            r1 = this;
            int r0 = r1.food
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

    public final int component7() {
            r1 = this;
            int r0 = r1.template_id
            return r0
    }

    public final int component8() {
            r1 = this;
            int r0 = r1.water
            return r0
    }

    public final nf.C4804f copy(int r11, int r12, java.lang.String r13, int r14, java.lang.String r15, int r16, int r17, int r18) {
            r10 = this;
            java.lang.String r0 = "label"
            r4 = r13
            p214m2.C4339q.m9706k(r13, r0)
            java.lang.String r0 = "resource_type"
            r6 = r15
            p214m2.C4339q.m9706k(r15, r0)
            nf.f r0 = new nf.f
            r1 = r0
            r2 = r11
            r3 = r12
            r5 = r14
            r7 = r16
            r8 = r17
            r9 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof nf.C4804f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            nf.f r5 = (nf.C4804f) r5
            int r1 = r4.cooldown
            int r3 = r5.cooldown
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.food
            int r3 = r5.food
            if (r1 == r3) goto L1a
            return r2
        L1a:
            java.lang.String r1 = r4.label
            java.lang.String r3 = r5.label
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L25
            return r2
        L25:
            int r1 = r4.resource_count
            int r3 = r5.resource_count
            if (r1 == r3) goto L2c
            return r2
        L2c:
            java.lang.String r1 = r4.resource_type
            java.lang.String r3 = r5.resource_type
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L37
            return r2
        L37:
            int r1 = r4.sest_amount
            int r3 = r5.sest_amount
            if (r1 == r3) goto L3e
            return r2
        L3e:
            int r1 = r4.template_id
            int r3 = r5.template_id
            if (r1 == r3) goto L45
            return r2
        L45:
            int r1 = r4.water
            int r5 = r5.water
            if (r1 == r5) goto L4c
            return r2
        L4c:
            return r0
    }

    public final int getCooldown() {
            r1 = this;
            int r0 = r1.cooldown
            return r0
    }

    public final int getFood() {
            r1 = this;
            int r0 = r1.food
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

    public final int getTemplate_id() {
            r1 = this;
            int r0 = r1.template_id
            return r0
    }

    public final int getWater() {
            r1 = this;
            int r0 = r1.water
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.cooldown
            int r0 = r0 * 31
            int r1 = r3.food
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.label
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            int r1 = r3.resource_count
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.resource_type
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            int r1 = r3.sest_amount
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.template_id
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.water
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ConfBuildOut(cooldown="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r3.cooldown
            r0.append(r1)
            java.lang.String r1 = ", food="
            r0.append(r1)
            int r1 = r3.food
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
            r0.append(r1)
            java.lang.String r1 = ", template_id="
            r0.append(r1)
            int r1 = r3.template_id
            r0.append(r1)
            java.lang.String r1 = ", water="
            r0.append(r1)
            int r1 = r3.water
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
