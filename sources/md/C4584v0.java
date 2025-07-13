package md;

/* renamed from: md.v0 */
/* loaded from: classes.dex */
public final class C4584v0 {
    private final java.lang.String rarity;
    private final java.lang.String variant;

    public C4584v0(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.rarity = r1
            r0.variant = r2
            return
    }

    public static /* synthetic */ md.C4584v0 copy$default(md.C4584v0 r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = r0.rarity
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.lang.String r2 = r0.variant
        Lc:
            md.v0 r0 = r0.copy(r1, r2)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.rarity
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.variant
            return r0
    }

    public final md.C4584v0 copy(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            md.v0 r0 = new md.v0
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof md.C4584v0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            md.v0 r5 = (md.C4584v0) r5
            java.lang.String r1 = r4.rarity
            java.lang.String r3 = r5.rarity
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.variant
            java.lang.String r5 = r5.variant
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final java.lang.String getRarity() {
            r1 = this;
            java.lang.String r0 = r1.rarity
            return r0
    }

    public final java.lang.String getVariant() {
            r1 = this;
            java.lang.String r0 = r1.variant
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.rarity
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            java.lang.String r2 = r3.variant
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r1 = r2.hashCode()
        L16:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ToolData(rarity="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.rarity
            r0.append(r1)
            java.lang.String r1 = ", variant="
            r0.append(r1)
            java.lang.String r1 = r3.variant
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
