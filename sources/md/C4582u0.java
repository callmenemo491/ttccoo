package md;

/* renamed from: md.u0 */
/* loaded from: classes.dex */
public final class C4582u0 {
    private final java.lang.String asset_id;
    private final md.C4584v0 data;
    private final java.lang.String name;

    public C4582u0(java.lang.String r2, java.lang.String r3, md.C4584v0 r4) {
            r1 = this;
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.asset_id = r2
            r1.name = r3
            r1.data = r4
            return
    }

    public static /* synthetic */ md.C4582u0 copy$default(md.C4582u0 r0, java.lang.String r1, java.lang.String r2, md.C4584v0 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = r0.asset_id
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.lang.String r2 = r0.name
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            md.v0 r3 = r0.data
        L12:
            md.u0 r0 = r0.copy(r1, r2, r3)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.asset_id
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final md.C4584v0 component3() {
            r1 = this;
            md.v0 r0 = r1.data
            return r0
    }

    public final md.C4582u0 copy(java.lang.String r2, java.lang.String r3, md.C4584v0 r4) {
            r1 = this;
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r4, r0)
            md.u0 r0 = new md.u0
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof md.C4582u0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            md.u0 r5 = (md.C4582u0) r5
            java.lang.String r1 = r4.asset_id
            java.lang.String r3 = r5.asset_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.name
            java.lang.String r3 = r5.name
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            md.v0 r1 = r4.data
            md.v0 r5 = r5.data
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final java.lang.String getAsset_id() {
            r1 = this;
            java.lang.String r0 = r1.asset_id
            return r0
    }

    public final md.C4584v0 getData() {
            r1 = this;
            md.v0 r0 = r1.data
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final java.util.List<io.tacocrypto.app.p156ui.secret.EnumC3251c> getToolTypes() {
            r7 = this;
            md.v0 r0 = r7.data
            java.lang.String r0 = r0.getRarity()
            java.lang.String r1 = "vip"
            boolean r0 = p214m2.C4339q.m9702c(r0, r1)
            if (r0 == 0) goto L17
            io.tacocrypto.app.ui.secret.c[] r0 = io.tacocrypto.app.p156ui.secret.EnumC3251c.values()
            java.util.List r0 = p062dh.C1468d.m3991M(r0)
            goto L48
        L17:
            md.v0 r0 = r7.data
            java.lang.String r0 = r0.getVariant()
            if (r0 == 0) goto L46
            md.v0 r0 = r7.data
            java.lang.String r0 = r0.getVariant()
            io.tacocrypto.app.ui.secret.c[] r1 = io.tacocrypto.app.p156ui.secret.EnumC3251c.values()
            r2 = 0
            int r3 = r1.length
        L2b:
            if (r2 >= r3) goto L3e
            r4 = r1[r2]
            java.lang.String r5 = r4.m7734k()
            r6 = 1
            boolean r5 = p362uh.C6463i.m13053J(r5, r0, r6)
            if (r5 == 0) goto L3b
            goto L3f
        L3b:
            int r2 = r2 + 1
            goto L2b
        L3e:
            r4 = 0
        L3f:
            if (r4 == 0) goto L46
            java.util.List r0 = p074e9.C1805a.m4528m(r4)
            goto L48
        L46:
            dh.k r0 = p062dh.C1475k.f7237Y
        L48:
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.asset_id
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.name
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            md.v0 r1 = r3.data
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Tool(asset_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.asset_id
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = ", data="
            r0.append(r1)
            md.v0 r1 = r2.data
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
