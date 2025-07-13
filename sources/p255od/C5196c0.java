package p255od;

/* renamed from: od.c0 */
/* loaded from: classes.dex */
public final class C5196c0 {
    private final java.lang.String asset_id;
    private final java.lang.String memo;

    /* renamed from: to */
    private final java.lang.String f20343to;

    public C5196c0(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "to"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "memo"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.f20343to = r2
            r1.asset_id = r3
            r1.memo = r4
            return
    }

    public static /* synthetic */ p255od.C5196c0 copy$default(p255od.C5196c0 r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = r0.f20343to
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.lang.String r2 = r0.asset_id
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            java.lang.String r3 = r0.memo
        L12:
            od.c0 r0 = r0.copy(r1, r2, r3)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.f20343to
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.asset_id
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.memo
            return r0
    }

    public final p255od.C5196c0 copy(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "to"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "asset_id"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "memo"
            p214m2.C4339q.m9706k(r4, r0)
            od.c0 r0 = new od.c0
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p255od.C5196c0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.c0 r5 = (p255od.C5196c0) r5
            java.lang.String r1 = r4.f20343to
            java.lang.String r3 = r5.f20343to
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.asset_id
            java.lang.String r3 = r5.asset_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.memo
            java.lang.String r5 = r5.memo
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

    public final java.lang.String getMemo() {
            r1 = this;
            java.lang.String r0 = r1.memo
            return r0
    }

    public final java.lang.String getTo() {
            r1 = this;
            java.lang.String r0 = r1.f20343to
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f20343to
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.asset_id
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.memo
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final ch.C0978e<java.lang.Boolean, java.lang.String> isValid() {
            r3 = this;
            java.lang.String r0 = r3.f20343to
            boolean r0 = p362uh.C6463i.m13054K(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = "Insert a valid address to continue"
            goto L17
        Lb:
            java.lang.String r0 = r3.asset_id
            boolean r0 = p362uh.C6463i.m13054K(r0)
            if (r0 == 0) goto L16
            java.lang.String r0 = "Select a valid mint to continue"
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L21
            ch.e r1 = new ch.e
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.<init>(r2, r0)
            return r1
        L21:
            ch.e r0 = new ch.e
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "NFTAtomicTransfer(to="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f20343to
            r0.append(r1)
            java.lang.String r1 = ", asset_id="
            r0.append(r1)
            java.lang.String r1 = r3.asset_id
            r0.append(r1)
            java.lang.String r1 = ", memo="
            r0.append(r1)
            java.lang.String r1 = r3.memo
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
