package p255od;

/* renamed from: od.u */
/* loaded from: classes.dex */
public final class C5231u {
    private final java.lang.String asset_id;
    private final java.lang.String contract;
    private final java.lang.String name;
    private final java.lang.String owner;
    private final p255od.C5224q0 template;

    public C5231u(java.lang.String r2, java.lang.String r3, java.lang.String r4, p255od.C5224q0 r5, java.lang.String r6) {
            r1 = this;
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "contract"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "owner"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "template"
            p214m2.C4339q.m9706k(r5, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r6, r0)
            r1.<init>()
            r1.asset_id = r2
            r1.contract = r3
            r1.owner = r4
            r1.template = r5
            r1.name = r6
            return
    }

    public static /* synthetic */ p255od.C5231u copy$default(p255od.C5231u r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, p255od.C5224q0 r7, java.lang.String r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r4 = r3.asset_id
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            java.lang.String r5 = r3.contract
        Lc:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L13
            java.lang.String r6 = r3.owner
        L13:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L1a
            od.q0 r7 = r3.template
        L1a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L21
            java.lang.String r8 = r3.name
        L21:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            od.u r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.asset_id
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.contract
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.owner
            return r0
    }

    public final p255od.C5224q0 component4() {
            r1 = this;
            od.q0 r0 = r1.template
            return r0
    }

    public final java.lang.String component5() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final p255od.C5231u copy(java.lang.String r8, java.lang.String r9, java.lang.String r10, p255od.C5224q0 r11, java.lang.String r12) {
            r7 = this;
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "contract"
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "owner"
            p214m2.C4339q.m9706k(r10, r0)
            java.lang.String r0 = "template"
            p214m2.C4339q.m9706k(r11, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r12, r0)
            od.u r0 = new od.u
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p255od.C5231u
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.u r5 = (p255od.C5231u) r5
            java.lang.String r1 = r4.asset_id
            java.lang.String r3 = r5.asset_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.contract
            java.lang.String r3 = r5.contract
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.owner
            java.lang.String r3 = r5.owner
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            od.q0 r1 = r4.template
            od.q0 r3 = r5.template
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.name
            java.lang.String r5 = r5.name
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L43
            return r2
        L43:
            return r0
    }

    public final java.lang.String getAsset_id() {
            r1 = this;
            java.lang.String r0 = r1.asset_id
            return r0
    }

    public final java.lang.String getContract() {
            r1 = this;
            java.lang.String r0 = r1.contract
            return r0
    }

    public final java.lang.String getImage() {
            r2 = this;
            java.lang.String r0 = "https://assets.tacostudios.io/ingredients/"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            od.q0 r1 = r2.template
            od.t r1 = r1.getImmutable_data()
            java.lang.String r1 = r1.getType()
            r0.append(r1)
            java.lang.String r1 = ".png"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final java.lang.String getOwner() {
            r1 = this;
            java.lang.String r0 = r1.owner
            return r0
    }

    public final p255od.C5224q0 getTemplate() {
            r1 = this;
            od.q0 r0 = r1.template
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.asset_id
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.contract
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.owner
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            od.q0 r1 = r3.template
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.name
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Ingredient(asset_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.asset_id
            r0.append(r1)
            java.lang.String r1 = ", contract="
            r0.append(r1)
            java.lang.String r1 = r3.contract
            r0.append(r1)
            java.lang.String r1 = ", owner="
            r0.append(r1)
            java.lang.String r1 = r3.owner
            r0.append(r1)
            java.lang.String r1 = ", template="
            r0.append(r1)
            od.q0 r1 = r3.template
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r3.name
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
