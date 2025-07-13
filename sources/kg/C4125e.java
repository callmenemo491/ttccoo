package kg;

/* renamed from: kg.e */
/* loaded from: classes.dex */
public final class C4125e {
    private final java.lang.String label;
    private final java.lang.String template_id;
    private final java.lang.String value;

    public C4125e(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "label"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "template_id"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "value"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.label = r2
            r1.template_id = r3
            r1.value = r4
            return
    }

    public static /* synthetic */ kg.C4125e copy$default(kg.C4125e r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = r0.label
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.lang.String r2 = r0.template_id
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            java.lang.String r3 = r0.value
        L12:
            kg.e r0 = r0.copy(r1, r2, r3)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.label
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.template_id
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }

    public final kg.C4125e copy(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "label"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "template_id"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "value"
            p214m2.C4339q.m9706k(r4, r0)
            kg.e r0 = new kg.e
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kg.C4125e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kg.e r5 = (kg.C4125e) r5
            java.lang.String r1 = r4.label
            java.lang.String r3 = r5.label
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.template_id
            java.lang.String r3 = r5.template_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.value
            java.lang.String r5 = r5.value
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final java.lang.String getLabel() {
            r1 = this;
            java.lang.String r0 = r1.label
            return r0
    }

    public final java.lang.String getTemplate_id() {
            r1 = this;
            java.lang.String r0 = r1.template_id
            return r0
    }

    public final java.lang.String getValue() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.label
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.template_id
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.value
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "TUConfigBonus(label="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.label
            r0.append(r1)
            java.lang.String r1 = ", template_id="
            r0.append(r1)
            java.lang.String r1 = r3.template_id
            r0.append(r1)
            java.lang.String r1 = ", value="
            r0.append(r1)
            java.lang.String r1 = r3.value
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
