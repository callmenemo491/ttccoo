package nf;

/* renamed from: nf.n */
/* loaded from: classes.dex */
public final class C4812n {
    private final java.lang.String asset_id;
    private final long last_harvest;
    private final java.lang.String owner;
    private final int template_id;

    public C4812n(java.lang.String r2, int r3, java.lang.String r4, long r5) {
            r1 = this;
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "owner"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.asset_id = r2
            r1.template_id = r3
            r1.owner = r4
            r1.last_harvest = r5
            return
    }

    public static /* synthetic */ nf.C4812n copy$default(nf.C4812n r3, java.lang.String r4, int r5, java.lang.String r6, long r7, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r4 = r3.asset_id
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            int r5 = r3.template_id
        Lc:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L13
            java.lang.String r6 = r3.owner
        L13:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L1a
            long r7 = r3.last_harvest
        L1a:
            r1 = r7
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            nf.n r3 = r5.copy(r6, r7, r8, r9)
            return r3
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.asset_id
            return r0
    }

    public final int component2() {
            r1 = this;
            int r0 = r1.template_id
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.owner
            return r0
    }

    public final long component4() {
            r2 = this;
            long r0 = r2.last_harvest
            return r0
    }

    public final nf.C4812n copy(java.lang.String r8, int r9, java.lang.String r10, long r11) {
            r7 = this;
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "owner"
            p214m2.C4339q.m9706k(r10, r0)
            nf.n r0 = new nf.n
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof nf.C4812n
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            nf.n r8 = (nf.C4812n) r8
            java.lang.String r1 = r7.asset_id
            java.lang.String r3 = r8.asset_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r7.template_id
            int r3 = r8.template_id
            if (r1 == r3) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r7.owner
            java.lang.String r3 = r8.owner
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            long r3 = r7.last_harvest
            long r5 = r8.last_harvest
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L32
            return r2
        L32:
            return r0
    }

    public final java.lang.String getAsset_id() {
            r1 = this;
            java.lang.String r0 = r1.asset_id
            return r0
    }

    public final long getLast_harvest() {
            r2 = this;
            long r0 = r2.last_harvest
            return r0
    }

    public final java.lang.String getOwner() {
            r1 = this;
            java.lang.String r0 = r1.owner
            return r0
    }

    public final int getTemplate_id() {
            r1 = this;
            int r0 = r1.template_id
            return r0
    }

    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.asset_id
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r5.template_id
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r5.owner
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            long r1 = r5.last_harvest
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "FlowerStaked(asset_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.asset_id
            r0.append(r1)
            java.lang.String r1 = ", template_id="
            r0.append(r1)
            int r1 = r3.template_id
            r0.append(r1)
            java.lang.String r1 = ", owner="
            r0.append(r1)
            java.lang.String r1 = r3.owner
            r0.append(r1)
            java.lang.String r1 = ", last_harvest="
            r0.append(r1)
            long r1 = r3.last_harvest
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
