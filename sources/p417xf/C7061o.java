package p417xf;

/* renamed from: xf.o */
/* loaded from: classes.dex */
public final class C7061o {
    private final int assets;
    private final java.util.List<p417xf.C7060n> collections;
    private final java.util.List<p417xf.C7065s> templates;

    public C7061o(java.util.List<p417xf.C7060n> r2, java.util.List<p417xf.C7065s> r3, int r4) {
            r1 = this;
            java.lang.String r0 = "collections"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "templates"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.collections = r2
            r1.templates = r3
            r1.assets = r4
            return
    }

    public static /* synthetic */ p417xf.C7061o copy$default(p417xf.C7061o r0, java.util.List r1, java.util.List r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.util.List<xf.n> r1 = r0.collections
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.util.List<xf.s> r2 = r0.templates
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            int r3 = r0.assets
        L12:
            xf.o r0 = r0.copy(r1, r2, r3)
            return r0
    }

    public final java.util.List<p417xf.C7060n> component1() {
            r1 = this;
            java.util.List<xf.n> r0 = r1.collections
            return r0
    }

    public final java.util.List<p417xf.C7065s> component2() {
            r1 = this;
            java.util.List<xf.s> r0 = r1.templates
            return r0
    }

    public final int component3() {
            r1 = this;
            int r0 = r1.assets
            return r0
    }

    public final p417xf.C7061o copy(java.util.List<p417xf.C7060n> r2, java.util.List<p417xf.C7065s> r3, int r4) {
            r1 = this;
            java.lang.String r0 = "collections"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "templates"
            p214m2.C4339q.m9706k(r3, r0)
            xf.o r0 = new xf.o
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p417xf.C7061o
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xf.o r5 = (p417xf.C7061o) r5
            java.util.List<xf.n> r1 = r4.collections
            java.util.List<xf.n> r3 = r5.collections
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List<xf.s> r1 = r4.templates
            java.util.List<xf.s> r3 = r5.templates
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            int r1 = r4.assets
            int r5 = r5.assets
            if (r1 == r5) goto L29
            return r2
        L29:
            return r0
    }

    public final int getAssets() {
            r1 = this;
            int r0 = r1.assets
            return r0
    }

    public final java.util.List<p417xf.C7060n> getCollections() {
            r1 = this;
            java.util.List<xf.n> r0 = r1.collections
            return r0
    }

    public final java.util.List<p417xf.C7065s> getTemplates() {
            r1 = this;
            java.util.List<xf.s> r0 = r1.templates
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.util.List<xf.n> r0 = r3.collections
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List<xf.s> r1 = r3.templates
            r2 = 31
            int r0 = p255od.C5212k0.m11509a(r1, r0, r2)
            int r1 = r3.assets
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "NFTData(collections="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.util.List<xf.n> r1 = r3.collections
            r0.append(r1)
            java.lang.String r1 = ", templates="
            r0.append(r1)
            java.util.List<xf.s> r1 = r3.templates
            r0.append(r1)
            java.lang.String r1 = ", assets="
            r0.append(r1)
            int r1 = r3.assets
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
