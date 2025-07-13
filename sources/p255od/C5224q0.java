package p255od;

/* renamed from: od.q0 */
/* loaded from: classes.dex */
public final class C5224q0 {
    private final p255od.C5229t immutable_data;
    private final java.lang.String template_id;

    public C5224q0(java.lang.String r2, p255od.C5229t r3) {
            r1 = this;
            java.lang.String r0 = "template_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "immutable_data"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.template_id = r2
            r1.immutable_data = r3
            return
    }

    public static /* synthetic */ p255od.C5224q0 copy$default(p255od.C5224q0 r0, java.lang.String r1, p255od.C5229t r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = r0.template_id
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            od.t r2 = r0.immutable_data
        Lc:
            od.q0 r0 = r0.copy(r1, r2)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.template_id
            return r0
    }

    public final p255od.C5229t component2() {
            r1 = this;
            od.t r0 = r1.immutable_data
            return r0
    }

    public final p255od.C5224q0 copy(java.lang.String r2, p255od.C5229t r3) {
            r1 = this;
            java.lang.String r0 = "template_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "immutable_data"
            p214m2.C4339q.m9706k(r3, r0)
            od.q0 r0 = new od.q0
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p255od.C5224q0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.q0 r5 = (p255od.C5224q0) r5
            java.lang.String r1 = r4.template_id
            java.lang.String r3 = r5.template_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            od.t r1 = r4.immutable_data
            od.t r5 = r5.immutable_data
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final p255od.C5229t getImmutable_data() {
            r1 = this;
            od.t r0 = r1.immutable_data
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
            od.t r1 = r2.immutable_data
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Template(template_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.template_id
            r0.append(r1)
            java.lang.String r1 = ", immutable_data="
            r0.append(r1)
            od.t r1 = r2.immutable_data
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
