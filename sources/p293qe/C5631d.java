package p293qe;

/* renamed from: qe.d */
/* loaded from: classes.dex */
public final class C5631d {
    private final java.lang.String img;
    private final java.lang.String rarity;

    public C5631d(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "img"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "rarity"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.img = r2
            r1.rarity = r3
            return
    }

    public static /* synthetic */ p293qe.C5631d copy$default(p293qe.C5631d r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = r0.img
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.lang.String r2 = r0.rarity
        Lc:
            qe.d r0 = r0.copy(r1, r2)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.img
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.rarity
            return r0
    }

    public final p293qe.C5631d copy(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "img"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "rarity"
            p214m2.C4339q.m9706k(r3, r0)
            qe.d r0 = new qe.d
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p293qe.C5631d
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qe.d r5 = (p293qe.C5631d) r5
            java.lang.String r1 = r4.img
            java.lang.String r3 = r5.img
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.rarity
            java.lang.String r5 = r5.rarity
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final java.lang.String getImageURL() {
            r2 = this;
            java.lang.String r0 = "https://cloudflare-ipfs.com/ipfs/"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.img
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final java.lang.String getImg() {
            r1 = this;
            java.lang.String r0 = r1.img
            return r0
    }

    public final java.lang.String getRarity() {
            r1 = this;
            java.lang.String r0 = r1.rarity
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.img
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.rarity
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "TemplateData(img="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.img
            r0.append(r1)
            java.lang.String r1 = ", rarity="
            r0.append(r1)
            java.lang.String r1 = r3.rarity
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
