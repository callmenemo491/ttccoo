package nf;

/* renamed from: nf.g */
/* loaded from: classes.dex */
public final class C4805g {
    private final int cbit_amount;
    private final int cooldown;
    private final java.lang.String label;
    private final int template_id;

    public C4805g(int r2, java.lang.String r3, int r4, int r5) {
            r1 = this;
            java.lang.String r0 = "label"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.template_id = r2
            r1.label = r3
            r1.cbit_amount = r4
            r1.cooldown = r5
            return
    }

    public static /* synthetic */ nf.C4805g copy$default(nf.C4805g r0, int r1, java.lang.String r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            int r1 = r0.template_id
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            java.lang.String r2 = r0.label
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            int r3 = r0.cbit_amount
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            int r4 = r0.cooldown
        L18:
            nf.g r0 = r0.copy(r1, r2, r3, r4)
            return r0
    }

    public final int component1() {
            r1 = this;
            int r0 = r1.template_id
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.label
            return r0
    }

    public final int component3() {
            r1 = this;
            int r0 = r1.cbit_amount
            return r0
    }

    public final int component4() {
            r1 = this;
            int r0 = r1.cooldown
            return r0
    }

    public final nf.C4805g copy(int r2, java.lang.String r3, int r4, int r5) {
            r1 = this;
            java.lang.String r0 = "label"
            p214m2.C4339q.m9706k(r3, r0)
            nf.g r0 = new nf.g
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof nf.C4805g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            nf.g r5 = (nf.C4805g) r5
            int r1 = r4.template_id
            int r3 = r5.template_id
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.label
            java.lang.String r3 = r5.label
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            int r1 = r4.cbit_amount
            int r3 = r5.cbit_amount
            if (r1 == r3) goto L25
            return r2
        L25:
            int r1 = r4.cooldown
            int r5 = r5.cooldown
            if (r1 == r5) goto L2c
            return r2
        L2c:
            return r0
    }

    public final int getCbit_amount() {
            r1 = this;
            int r0 = r1.cbit_amount
            return r0
    }

    public final int getCooldown() {
            r1 = this;
            int r0 = r1.cooldown
            return r0
    }

    public final java.lang.String getLabel() {
            r1 = this;
            java.lang.String r0 = r1.label
            return r0
    }

    public final int getTemplate_id() {
            r1 = this;
            int r0 = r1.template_id
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.template_id
            int r0 = r0 * 31
            java.lang.String r1 = r3.label
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            int r1 = r3.cbit_amount
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.cooldown
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ConfFlower(template_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r3.template_id
            r0.append(r1)
            java.lang.String r1 = ", label="
            r0.append(r1)
            java.lang.String r1 = r3.label
            r0.append(r1)
            java.lang.String r1 = ", cbit_amount="
            r0.append(r1)
            int r1 = r3.cbit_amount
            r0.append(r1)
            java.lang.String r1 = ", cooldown="
            r0.append(r1)
            int r1 = r3.cooldown
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
