package nf;

/* renamed from: nf.e */
/* loaded from: classes.dex */
public final class C4803e {
    private final java.lang.String asset_id;
    private final long last_harvest;
    private final int template_id;

    public C4803e(java.lang.String r2, long r3, int r5) {
            r1 = this;
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.asset_id = r2
            r1.last_harvest = r3
            r1.template_id = r5
            return
    }

    public static /* synthetic */ nf.C4803e copy$default(nf.C4803e r0, java.lang.String r1, long r2, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.lang.String r1 = r0.asset_id
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            long r2 = r0.last_harvest
        Lc:
            r5 = r5 & 4
            if (r5 == 0) goto L12
            int r4 = r0.template_id
        L12:
            nf.e r0 = r0.copy(r1, r2, r4)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.asset_id
            return r0
    }

    public final long component2() {
            r2 = this;
            long r0 = r2.last_harvest
            return r0
    }

    public final int component3() {
            r1 = this;
            int r0 = r1.template_id
            return r0
    }

    public final nf.C4803e copy(java.lang.String r2, long r3, int r5) {
            r1 = this;
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r2, r0)
            nf.e r0 = new nf.e
            r0.<init>(r2, r3, r5)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof nf.C4803e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            nf.e r8 = (nf.C4803e) r8
            java.lang.String r1 = r7.asset_id
            java.lang.String r3 = r8.asset_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.last_harvest
            long r5 = r8.last_harvest
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L20
            return r2
        L20:
            int r1 = r7.template_id
            int r8 = r8.template_id
            if (r1 == r8) goto L27
            return r2
        L27:
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
            long r1 = r5.last_harvest
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r5.template_id
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "BuildoutRow(asset_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.asset_id
            r0.append(r1)
            java.lang.String r1 = ", last_harvest="
            r0.append(r1)
            long r1 = r3.last_harvest
            r0.append(r1)
            java.lang.String r1 = ", template_id="
            r0.append(r1)
            int r1 = r3.template_id
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
