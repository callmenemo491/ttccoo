package p417xf;

/* renamed from: xf.n */
/* loaded from: classes.dex */
public final class C7060n {
    private final java.lang.String assets;
    private final p417xf.C7054h collection;

    public C7060n(p417xf.C7054h r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "collection"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "assets"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.collection = r2
            r1.assets = r3
            return
    }

    public static /* synthetic */ p417xf.C7060n copy$default(p417xf.C7060n r0, p417xf.C7054h r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            xf.h r1 = r0.collection
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.lang.String r2 = r0.assets
        Lc:
            xf.n r0 = r0.copy(r1, r2)
            return r0
    }

    public final p417xf.C7054h component1() {
            r1 = this;
            xf.h r0 = r1.collection
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.assets
            return r0
    }

    public final p417xf.C7060n copy(p417xf.C7054h r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "collection"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "assets"
            p214m2.C4339q.m9706k(r3, r0)
            xf.n r0 = new xf.n
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p417xf.C7060n
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xf.n r5 = (p417xf.C7060n) r5
            xf.h r1 = r4.collection
            xf.h r3 = r5.collection
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.assets
            java.lang.String r5 = r5.assets
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final java.lang.String getAssets() {
            r1 = this;
            java.lang.String r0 = r1.assets
            return r0
    }

    public final p417xf.C7054h getCollection() {
            r1 = this;
            xf.h r0 = r1.collection
            return r0
    }

    public int hashCode() {
            r2 = this;
            xf.h r0 = r2.collection
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.assets
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "NFTCollection(collection="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            xf.h r1 = r3.collection
            r0.append(r1)
            java.lang.String r1 = ", assets="
            r0.append(r1)
            java.lang.String r1 = r3.assets
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
