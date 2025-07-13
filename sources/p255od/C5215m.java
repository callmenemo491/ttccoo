package p255od;

/* renamed from: od.m */
/* loaded from: classes.dex */
public final class C5215m {
    private final java.lang.String contract;

    public C5215m(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "contract"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.contract = r2
            return
    }

    public static /* synthetic */ p255od.C5215m copy$default(p255od.C5215m r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = r0.contract
        L6:
            od.m r0 = r0.copy(r1)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.contract
            return r0
    }

    public final p255od.C5215m copy(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "contract"
            p214m2.C4339q.m9706k(r2, r0)
            od.m r0 = new od.m
            r0.<init>(r2)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p255od.C5215m
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.m r4 = (p255od.C5215m) r4
            java.lang.String r1 = r3.contract
            java.lang.String r4 = r4.contract
            boolean r4 = p214m2.C4339q.m9702c(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final java.lang.String getContract() {
            r1 = this;
            java.lang.String r0 = r1.contract
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.contract
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ClaimCaitObject(contract="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.contract
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
