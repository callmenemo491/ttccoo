package p100fg;

/* renamed from: fg.e */
/* loaded from: classes.dex */
public final class C2166e {
    private final java.util.Map<java.lang.String, java.lang.Object> immutable_data;
    private final p100fg.C2165d schema;
    private final java.lang.String template_id;

    public C2166e(java.lang.String r2, java.util.Map<java.lang.String, ? extends java.lang.Object> r3, p100fg.C2165d r4) {
            r1 = this;
            java.lang.String r0 = "template_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "immutable_data"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "schema"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.template_id = r2
            r1.immutable_data = r3
            r1.schema = r4
            return
    }

    public static /* synthetic */ p100fg.C2166e copy$default(p100fg.C2166e r0, java.lang.String r1, java.util.Map r2, p100fg.C2165d r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = r0.template_id
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.util.Map<java.lang.String, java.lang.Object> r2 = r0.immutable_data
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            fg.d r3 = r0.schema
        L12:
            fg.e r0 = r0.copy(r1, r2, r3)
            return r0
    }

    private final boolean isBreeder() {
            r2 = this;
            fg.d r0 = r2.schema
            java.lang.String r0 = r0.getSchema_name()
            java.lang.String r1 = "breedernft"
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.template_id
            return r0
    }

    public final java.util.Map<java.lang.String, java.lang.Object> component2() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.immutable_data
            return r0
    }

    public final p100fg.C2165d component3() {
            r1 = this;
            fg.d r0 = r1.schema
            return r0
    }

    public final p100fg.C2166e copy(java.lang.String r2, java.util.Map<java.lang.String, ? extends java.lang.Object> r3, p100fg.C2165d r4) {
            r1 = this;
            java.lang.String r0 = "template_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "immutable_data"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "schema"
            p214m2.C4339q.m9706k(r4, r0)
            fg.e r0 = new fg.e
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p100fg.C2166e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fg.e r5 = (p100fg.C2166e) r5
            java.lang.String r1 = r4.template_id
            java.lang.String r3 = r5.template_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.immutable_data
            java.util.Map<java.lang.String, java.lang.Object> r3 = r5.immutable_data
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            fg.d r1 = r4.schema
            fg.d r5 = r5.schema
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getImmutable_data() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.immutable_data
            return r0
    }

    public final java.lang.String getName() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.immutable_data
            java.lang.String r1 = "name"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.toString()
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public final java.lang.String getRarity() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.immutable_data
            java.lang.String r1 = "Rarity"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.toString()
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public final java.lang.String getRplmString() {
            r5 = this;
            java.util.List r0 = p100fg.C2168g.access$getOverrides$p()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            r3 = r1
            ch.e r3 = (ch.C0978e) r3
            A r3 = r3.f5050Y
            java.lang.String r4 = r5.template_id
            boolean r3 = p214m2.C4339q.m9702c(r3, r4)
            if (r3 == 0) goto L8
            goto L22
        L21:
            r1 = r2
        L22:
            ch.e r1 = (ch.C0978e) r1
            if (r1 == 0) goto L2b
            B r0 = r1.f5051Z
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L2b:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.immutable_data
            java.lang.String r1 = "RPLM/Week"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L3b
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L56
        L3b:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.immutable_data
            java.lang.String r1 = "RPLM Per Week"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L4a
        L45:
            java.lang.String r0 = r0.toString()
            goto L56
        L4a:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.immutable_data
            java.lang.String r1 = "Reptilium Per Week"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L55
            goto L45
        L55:
            r0 = r2
        L56:
            if (r0 == 0) goto L70
            java.lang.Double r0 = p362uh.C6462h.m13048E(r0)
            if (r0 == 0) goto L70
            double r0 = r0.doubleValue()
            boolean r2 = r5.isBreeder()
            if (r2 == 0) goto L6b
            r2 = 2
            double r2 = (double) r2
            double r0 = r0 / r2
        L6b:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L70:
            return r2
    }

    public final double getRplmValue() {
            r2 = this;
            java.lang.String r0 = r2.getRplmString()
            if (r0 == 0) goto L11
            java.lang.Double r0 = p362uh.C6462h.m13048E(r0)
            if (r0 == 0) goto L11
            double r0 = r0.doubleValue()
            goto L13
        L11:
            r0 = 0
        L13:
            return r0
    }

    public final p100fg.C2165d getSchema() {
            r1 = this;
            fg.d r0 = r1.schema
            return r0
    }

    public final java.lang.String getTemplate_id() {
            r1 = this;
            java.lang.String r0 = r1.template_id
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.template_id
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.immutable_data
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            fg.d r0 = r2.schema
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "ReptileTemplates(template_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.template_id
            r0.append(r1)
            java.lang.String r1 = ", immutable_data="
            r0.append(r1)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.immutable_data
            r0.append(r1)
            java.lang.String r1 = ", schema="
            r0.append(r1)
            fg.d r1 = r2.schema
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
