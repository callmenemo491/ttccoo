package md;

/* renamed from: md.e1 */
/* loaded from: classes.dex */
public final class C4550e1 {
    private final java.lang.String staked;

    public C4550e1(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.staked = r1
            return
    }

    public static /* synthetic */ md.C4550e1 copy$default(md.C4550e1 r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = r0.staked
        L6:
            md.e1 r0 = r0.copy(r1)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.staked
            return r0
    }

    public final md.C4550e1 copy(java.lang.String r2) {
            r1 = this;
            md.e1 r0 = new md.e1
            r0.<init>(r2)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof md.C4550e1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            md.e1 r4 = (md.C4550e1) r4
            java.lang.String r1 = r3.staked
            java.lang.String r4 = r4.staked
            boolean r4 = p214m2.C4339q.m9702c(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final java.lang.String getStaked() {
            r1 = this;
            java.lang.String r0 = r1.staked
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.staked
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "VoterInfo(staked="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.staked
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
