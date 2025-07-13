package p293qe;

/* renamed from: qe.e */
/* loaded from: classes.dex */
public final class C5632e {
    private final p293qe.C5631d immutable_data;
    private final java.lang.String name;
    private final java.lang.String template_id;

    public C5632e(java.lang.String r2, p293qe.C5631d r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "template_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "immutable_data"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.template_id = r2
            r1.immutable_data = r3
            r1.name = r4
            return
    }

    public static /* synthetic */ p293qe.C5632e copy$default(p293qe.C5632e r0, java.lang.String r1, p293qe.C5631d r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = r0.template_id
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            qe.d r2 = r0.immutable_data
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            java.lang.String r3 = r0.name
        L12:
            qe.e r0 = r0.copy(r1, r2, r3)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.template_id
            return r0
    }

    public final p293qe.C5631d component2() {
            r1 = this;
            qe.d r0 = r1.immutable_data
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final p293qe.C5632e copy(java.lang.String r2, p293qe.C5631d r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "template_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "immutable_data"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r4, r0)
            qe.e r0 = new qe.e
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p293qe.C5632e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qe.e r5 = (p293qe.C5632e) r5
            java.lang.String r1 = r4.template_id
            java.lang.String r3 = r5.template_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            qe.d r1 = r4.immutable_data
            qe.d r3 = r5.immutable_data
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.name
            java.lang.String r5 = r5.name
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final p293qe.C5631d getImmutable_data() {
            r1 = this;
            qe.d r0 = r1.immutable_data
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
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
            qe.d r1 = r2.immutable_data
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r2.name
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "TemplateResponse(template_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.template_id
            r0.append(r1)
            java.lang.String r1 = ", immutable_data="
            r0.append(r1)
            qe.d r1 = r3.immutable_data
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r3.name
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
