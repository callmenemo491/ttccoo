package p255od;

/* renamed from: od.r0 */
/* loaded from: classes.dex */
public final class C5226r0 {

    /* renamed from: id */
    private final int f20351id;
    private final java.lang.String template_id;
    private final java.lang.String type;

    public C5226r0(int r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "template_id"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "type"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.f20351id = r2
            r1.template_id = r3
            r1.type = r4
            return
    }

    public static /* synthetic */ p255od.C5226r0 copy$default(p255od.C5226r0 r0, int r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            int r1 = r0.f20351id
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.lang.String r2 = r0.template_id
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            java.lang.String r3 = r0.type
        L12:
            od.r0 r0 = r0.copy(r1, r2, r3)
            return r0
    }

    public final int component1() {
            r1 = this;
            int r0 = r1.f20351id
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.template_id
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }

    public final p255od.C5226r0 copy(int r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "template_id"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "type"
            p214m2.C4339q.m9706k(r4, r0)
            od.r0 r0 = new od.r0
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p255od.C5226r0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.r0 r5 = (p255od.C5226r0) r5
            int r1 = r4.f20351id
            int r3 = r5.f20351id
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.template_id
            java.lang.String r3 = r5.template_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r4.type
            java.lang.String r5 = r5.type
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L29
            return r2
        L29:
            return r0
    }

    public final int getId() {
            r1 = this;
            int r0 = r1.f20351id
            return r0
    }

    public final java.lang.String getTemplate_id() {
            r1 = this;
            java.lang.String r0 = r1.template_id
            return r0
    }

    public final java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.f20351id
            int r0 = r0 * 31
            java.lang.String r1 = r3.template_id
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.type
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "TemplatePlayerTaco(id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r3.f20351id
            r0.append(r1)
            java.lang.String r1 = ", template_id="
            r0.append(r1)
            java.lang.String r1 = r3.template_id
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            java.lang.String r1 = r3.type
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
