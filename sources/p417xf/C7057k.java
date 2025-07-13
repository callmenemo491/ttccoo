package p417xf;

/* renamed from: xf.k */
/* loaded from: classes.dex */
public final class C7057k {
    private final java.lang.String asset_id;
    private final java.lang.String template_mint;

    public C7057k(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "template_mint"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.asset_id = r2
            r1.template_mint = r3
            return
    }

    public static /* synthetic */ p417xf.C7057k copy$default(p417xf.C7057k r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = r0.asset_id
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.lang.String r2 = r0.template_mint
        Lc:
            xf.k r0 = r0.copy(r1, r2)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.asset_id
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.template_mint
            return r0
    }

    public final p417xf.C7057k copy(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "template_mint"
            p214m2.C4339q.m9706k(r3, r0)
            xf.k r0 = new xf.k
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p417xf.C7057k
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xf.k r5 = (p417xf.C7057k) r5
            java.lang.String r1 = r4.asset_id
            java.lang.String r3 = r5.asset_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.template_mint
            java.lang.String r5 = r5.template_mint
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final java.lang.String getAsset_id() {
            r1 = this;
            java.lang.String r0 = r1.asset_id
            return r0
    }

    public final java.lang.String getTemplate_mint() {
            r1 = this;
            java.lang.String r0 = r1.template_mint
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.asset_id
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.template_mint
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "NFTAsset(asset_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.asset_id
            r0.append(r1)
            java.lang.String r1 = ", template_mint="
            r0.append(r1)
            java.lang.String r1 = r3.template_mint
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
