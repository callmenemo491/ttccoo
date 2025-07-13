package p417xf;

/* renamed from: xf.s */
/* loaded from: classes.dex */
public final class C7065s {
    private final java.lang.String assets;
    private final java.lang.String collection_name;
    private final java.lang.String template_id;

    public C7065s(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "collection_name"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "assets"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.collection_name = r2
            r1.template_id = r3
            r1.assets = r4
            return
    }

    public static /* synthetic */ p417xf.C7065s copy$default(p417xf.C7065s r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = r0.collection_name
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.lang.String r2 = r0.template_id
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            java.lang.String r3 = r0.assets
        L12:
            xf.s r0 = r0.copy(r1, r2, r3)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.collection_name
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.template_id
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.assets
            return r0
    }

    public final p417xf.C7065s copy(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "collection_name"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "assets"
            p214m2.C4339q.m9706k(r4, r0)
            xf.s r0 = new xf.s
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p417xf.C7065s
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xf.s r5 = (p417xf.C7065s) r5
            java.lang.String r1 = r4.collection_name
            java.lang.String r3 = r5.collection_name
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
            java.lang.String r1 = r4.assets
            java.lang.String r5 = r5.assets
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final java.lang.String getAssets() {
            r1 = this;
            java.lang.String r0 = r1.assets
            return r0
    }

    public final java.lang.String getCollection_name() {
            r1 = this;
            java.lang.String r0 = r1.collection_name
            return r0
    }

    public final java.lang.String getTemplate_id() {
            r1 = this;
            java.lang.String r0 = r1.template_id
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.collection_name
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.template_id
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.assets
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "NFTTemplate(collection_name="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.collection_name
            r0.append(r1)
            java.lang.String r1 = ", template_id="
            r0.append(r1)
            java.lang.String r1 = r3.template_id
            r0.append(r1)
            java.lang.String r1 = ", assets="
            r0.append(r1)
            java.lang.String r1 = r3.assets
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
