package io.tacocrypto.app.p156ui.tools.nftwallet.main;

/* loaded from: classes.dex */
public final class NFTAssetUI implements java.io.Serializable {

    /* renamed from: Y */
    public final java.lang.String f14479Y;

    /* renamed from: Z */
    public final java.lang.String f14480Z;

    /* renamed from: a0 */
    public final java.lang.String f14481a0;

    /* renamed from: b0 */
    public final java.lang.String f14482b0;

    /* renamed from: c0 */
    public final java.lang.String f14483c0;

    /* renamed from: d0 */
    public final java.lang.String f14484d0;

    /* renamed from: e0 */
    public final java.lang.String f14485e0;

    /* renamed from: f0 */
    public java.lang.Integer f14486f0;

    /* renamed from: g0 */
    public final java.lang.String f14487g0;

    /* renamed from: h0 */
    public java.lang.String f14488h0;

    public NFTAssetUI(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.Integer r8, java.lang.String r9, java.lang.String r10, int r11) {
            r0 = this;
            r8 = r11 & 512(0x200, float:7.17E-43)
            r11 = 0
            if (r8 == 0) goto L6
            r10 = r11
        L6:
            java.lang.String r8 = "asset_id"
            p214m2.C4339q.m9706k(r1, r8)
            java.lang.String r8 = "valueWaxString"
            p214m2.C4339q.m9706k(r9, r8)
            r0.<init>()
            r0.f14479Y = r1
            r0.f14480Z = r2
            r0.f14481a0 = r3
            r0.f14482b0 = r4
            r0.f14483c0 = r5
            r0.f14484d0 = r6
            r0.f14485e0 = r7
            r0.f14486f0 = r11
            r0.f14487g0 = r9
            r0.f14488h0 = r10
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTAssetUI
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI r5 = (io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTAssetUI) r5
            java.lang.String r1 = r4.f14479Y
            java.lang.String r3 = r5.f14479Y
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f14480Z
            java.lang.String r3 = r5.f14480Z
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f14481a0
            java.lang.String r3 = r5.f14481a0
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.f14482b0
            java.lang.String r3 = r5.f14482b0
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.f14483c0
            java.lang.String r3 = r5.f14483c0
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r1 = r4.f14484d0
            java.lang.String r3 = r5.f14484d0
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.lang.String r1 = r4.f14485e0
            java.lang.String r3 = r5.f14485e0
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            java.lang.Integer r1 = r4.f14486f0
            java.lang.Integer r3 = r5.f14486f0
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L64
            return r2
        L64:
            java.lang.String r1 = r4.f14487g0
            java.lang.String r3 = r5.f14487g0
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L6f
            return r2
        L6f:
            java.lang.String r1 = r4.f14488h0
            java.lang.String r5 = r5.f14488h0
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L7a
            return r2
        L7a:
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f14479Y
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r4.f14480Z
            r2 = 0
            if (r1 != 0) goto Lf
            r1 = 0
            goto L13
        Lf:
            int r1 = r1.hashCode()
        L13:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r4.f14481a0
            if (r1 != 0) goto L1c
            r1 = 0
            goto L20
        L1c:
            int r1 = r1.hashCode()
        L20:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r4.f14482b0
            if (r1 != 0) goto L29
            r1 = 0
            goto L2d
        L29:
            int r1 = r1.hashCode()
        L2d:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r4.f14483c0
            if (r1 != 0) goto L36
            r1 = 0
            goto L3a
        L36:
            int r1 = r1.hashCode()
        L3a:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r4.f14484d0
            if (r1 != 0) goto L43
            r1 = 0
            goto L47
        L43:
            int r1 = r1.hashCode()
        L47:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r4.f14485e0
            if (r1 != 0) goto L50
            r1 = 0
            goto L54
        L50:
            int r1 = r1.hashCode()
        L54:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Integer r1 = r4.f14486f0
            if (r1 != 0) goto L5d
            r1 = 0
            goto L61
        L5d:
            int r1 = r1.hashCode()
        L61:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r4.f14487g0
            r3 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r3)
            java.lang.String r1 = r4.f14488h0
            if (r1 != 0) goto L71
            goto L75
        L71:
            int r2 = r1.hashCode()
        L75:
            int r0 = r0 + r2
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "NFTAssetUI(asset_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f14479Y
            r0.append(r1)
            java.lang.String r1 = ", template_id="
            r0.append(r1)
            java.lang.String r1 = r3.f14480Z
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r3.f14481a0
            r0.append(r1)
            java.lang.String r1 = ", img="
            r0.append(r1)
            java.lang.String r1 = r3.f14482b0
            r0.append(r1)
            java.lang.String r1 = ", video="
            r0.append(r1)
            java.lang.String r1 = r3.f14483c0
            r0.append(r1)
            java.lang.String r1 = ", collection_name="
            r0.append(r1)
            java.lang.String r1 = r3.f14484d0
            r0.append(r1)
            java.lang.String r1 = ", template_mint="
            r0.append(r1)
            java.lang.String r1 = r3.f14485e0
            r0.append(r1)
            java.lang.String r1 = ", collection_verify="
            r0.append(r1)
            java.lang.Integer r1 = r3.f14486f0
            r0.append(r1)
            java.lang.String r1 = ", valueWaxString="
            r0.append(r1)
            java.lang.String r1 = r3.f14487g0
            r0.append(r1)
            java.lang.String r1 = ", valueDollarString="
            r0.append(r1)
            java.lang.String r1 = r3.f14488h0
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
