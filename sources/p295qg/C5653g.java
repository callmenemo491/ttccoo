package p295qg;

/* renamed from: qg.g */
/* loaded from: classes.dex */
public final class C5653g {
    private final java.lang.String account;
    private final java.util.List<p295qg.C5651e> data;
    private final long last_claim;
    private final java.lang.String unclaimed;

    public C5653g(java.lang.String r2, long r3, java.lang.String r5, java.util.List<p295qg.C5651e> r6) {
            r1 = this;
            java.lang.String r0 = "account"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "unclaimed"
            p214m2.C4339q.m9706k(r5, r0)
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r6, r0)
            r1.<init>()
            r1.account = r2
            r1.last_claim = r3
            r1.unclaimed = r5
            r1.data = r6
            return
    }

    public static /* synthetic */ p295qg.C5653g copy$default(p295qg.C5653g r3, java.lang.String r4, long r5, java.lang.String r7, java.util.List r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r4 = r3.account
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            long r5 = r3.last_claim
        Lc:
            r0 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L13
            java.lang.String r7 = r3.unclaimed
        L13:
            r10 = r7
            r5 = r9 & 8
            if (r5 == 0) goto L1a
            java.util.List<qg.e> r8 = r3.data
        L1a:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r0
            r9 = r10
            r10 = r2
            qg.g r3 = r5.copy(r6, r7, r9, r10)
            return r3
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.account
            return r0
    }

    public final long component2() {
            r2 = this;
            long r0 = r2.last_claim
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.unclaimed
            return r0
    }

    public final java.util.List<p295qg.C5651e> component4() {
            r1 = this;
            java.util.List<qg.e> r0 = r1.data
            return r0
    }

    public final p295qg.C5653g copy(java.lang.String r8, long r9, java.lang.String r11, java.util.List<p295qg.C5651e> r12) {
            r7 = this;
            java.lang.String r0 = "account"
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "unclaimed"
            p214m2.C4339q.m9706k(r11, r0)
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r12, r0)
            qg.g r0 = new qg.g
            r1 = r0
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r5, r6)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p295qg.C5653g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qg.g r8 = (p295qg.C5653g) r8
            java.lang.String r1 = r7.account
            java.lang.String r3 = r8.account
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.last_claim
            long r5 = r8.last_claim
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L20
            return r2
        L20:
            java.lang.String r1 = r7.unclaimed
            java.lang.String r3 = r8.unclaimed
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2b
            return r2
        L2b:
            java.util.List<qg.e> r1 = r7.data
            java.util.List<qg.e> r8 = r8.data
            boolean r8 = p214m2.C4339q.m9702c(r1, r8)
            if (r8 != 0) goto L36
            return r2
        L36:
            return r0
    }

    public final java.lang.String getAccount() {
            r1 = this;
            java.lang.String r0 = r1.account
            return r0
    }

    public final java.util.List<p295qg.C5651e> getData() {
            r1 = this;
            java.util.List<qg.e> r0 = r1.data
            return r0
    }

    public final long getLast_claim() {
            r2 = this;
            long r0 = r2.last_claim
            return r0
    }

    public final java.lang.String getUnclaimed() {
            r1 = this;
            java.lang.String r0 = r1.unclaimed
            return r0
    }

    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.account
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            long r1 = r5.last_claim
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r1 = r5.unclaimed
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.util.List<qg.e> r1 = r5.data
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "VirtualDreamRow(account="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.account
            r0.append(r1)
            java.lang.String r1 = ", last_claim="
            r0.append(r1)
            long r1 = r3.last_claim
            r0.append(r1)
            java.lang.String r1 = ", unclaimed="
            r0.append(r1)
            java.lang.String r1 = r3.unclaimed
            r0.append(r1)
            java.lang.String r1 = ", data="
            r0.append(r1)
            java.util.List<qg.e> r1 = r3.data
            r2 = 41
            java.lang.String r0 = p213m1.C4320f.m9652a(r0, r1, r2)
            return r0
    }
}
