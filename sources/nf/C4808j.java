package nf;

/* renamed from: nf.j */
/* loaded from: classes.dex */
public final class C4808j {
    private final java.util.List<java.lang.String> animal_templates;
    private final int slots;
    private final int template_id;
    private final int type;

    public C4808j(java.util.List<java.lang.String> r2, int r3, int r4, int r5) {
            r1 = this;
            java.lang.String r0 = "animal_templates"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.animal_templates = r2
            r1.slots = r3
            r1.template_id = r4
            r1.type = r5
            return
    }

    public static /* synthetic */ nf.C4808j copy$default(nf.C4808j r0, java.util.List r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.util.List<java.lang.String> r1 = r0.animal_templates
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            int r2 = r0.slots
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            int r3 = r0.template_id
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            int r4 = r0.type
        L18:
            nf.j r0 = r0.copy(r1, r2, r3, r4)
            return r0
    }

    public final java.util.List<java.lang.String> component1() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.animal_templates
            return r0
    }

    public final int component2() {
            r1 = this;
            int r0 = r1.slots
            return r0
    }

    public final int component3() {
            r1 = this;
            int r0 = r1.template_id
            return r0
    }

    public final int component4() {
            r1 = this;
            int r0 = r1.type
            return r0
    }

    public final nf.C4808j copy(java.util.List<java.lang.String> r2, int r3, int r4, int r5) {
            r1 = this;
            java.lang.String r0 = "animal_templates"
            p214m2.C4339q.m9706k(r2, r0)
            nf.j r0 = new nf.j
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof nf.C4808j
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            nf.j r5 = (nf.C4808j) r5
            java.util.List<java.lang.String> r1 = r4.animal_templates
            java.util.List<java.lang.String> r3 = r5.animal_templates
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.slots
            int r3 = r5.slots
            if (r1 == r3) goto L1e
            return r2
        L1e:
            int r1 = r4.template_id
            int r3 = r5.template_id
            if (r1 == r3) goto L25
            return r2
        L25:
            int r1 = r4.type
            int r5 = r5.type
            if (r1 == r5) goto L2c
            return r2
        L2c:
            return r0
    }

    public final java.util.List<java.lang.String> getAnimal_templates() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.animal_templates
            return r0
    }

    public final int getSlots() {
            r1 = this;
            int r0 = r1.slots
            return r0
    }

    public final int getTemplate_id() {
            r1 = this;
            int r0 = r1.template_id
            return r0
    }

    public final int getType() {
            r1 = this;
            int r0 = r1.type
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.util.List<java.lang.String> r0 = r2.animal_templates
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.slots
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.template_id
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.type
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Confbuilding(animal_templates="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.util.List<java.lang.String> r1 = r3.animal_templates
            r0.append(r1)
            java.lang.String r1 = ", slots="
            r0.append(r1)
            int r1 = r3.slots
            r0.append(r1)
            java.lang.String r1 = ", template_id="
            r0.append(r1)
            int r1 = r3.template_id
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            int r1 = r3.type
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
