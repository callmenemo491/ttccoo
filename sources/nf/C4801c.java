package nf;

/* renamed from: nf.c */
/* loaded from: classes.dex */
public final class C4801c {
    private final nf.C4800b.b.a immutable_data;
    private final java.lang.String name;
    private final java.lang.String template_id;

    public C4801c(java.lang.String r2, java.lang.String r3, nf.C4800b.b.a r4) {
            r1 = this;
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "template_id"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "immutable_data"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.name = r2
            r1.template_id = r3
            r1.immutable_data = r4
            return
    }

    public static /* synthetic */ nf.C4801c copy$default(nf.C4801c r0, java.lang.String r1, java.lang.String r2, nf.C4800b.b.a r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = r0.name
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.lang.String r2 = r0.template_id
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            nf.b$b$a r3 = r0.immutable_data
        L12:
            nf.c r0 = r0.copy(r1, r2, r3)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.template_id
            return r0
    }

    public final nf.C4800b.b.a component3() {
            r1 = this;
            nf.b$b$a r0 = r1.immutable_data
            return r0
    }

    public final nf.C4801c copy(java.lang.String r2, java.lang.String r3, nf.C4800b.b.a r4) {
            r1 = this;
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "template_id"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "immutable_data"
            p214m2.C4339q.m9706k(r4, r0)
            nf.c r0 = new nf.c
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof nf.C4801c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            nf.c r5 = (nf.C4801c) r5
            java.lang.String r1 = r4.name
            java.lang.String r3 = r5.name
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
            nf.b$b$a r1 = r4.immutable_data
            nf.b$b$a r5 = r5.immutable_data
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final nf.C4800b.b.a getImmutable_data() {
            r1 = this;
            nf.b$b$a r0 = r1.immutable_data
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
            r3 = this;
            java.lang.String r0 = r3.name
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.template_id
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            nf.b$b$a r1 = r3.immutable_data
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final nf.C4800b toAssets(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "assetId"
            p214m2.C4339q.m9706k(r6, r0)
            nf.b r0 = new nf.b
            java.lang.String r1 = r5.name
            nf.b$b r2 = new nf.b$b
            java.lang.String r3 = r5.template_id
            nf.b$b$a r4 = r5.immutable_data
            r2.<init>(r3, r4)
            r0.<init>(r6, r1, r2)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "AtomicTemplateFarming(name="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = ", template_id="
            r0.append(r1)
            java.lang.String r1 = r2.template_id
            r0.append(r1)
            java.lang.String r1 = ", immutable_data="
            r0.append(r1)
            nf.b$b$a r1 = r2.immutable_data
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
