package p456ze;

/* renamed from: ze.f */
/* loaded from: classes.dex */
public final class C7313f {
    private final double bluEarned;
    private final java.lang.String imageToken;
    private final java.lang.String name;
    private final double percentage;
    private final java.lang.String staked;

    public C7313f(java.lang.String r2, java.lang.String r3, double r4, double r6, java.lang.String r8) {
            r1 = this;
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "imageToken"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "staked"
            p214m2.C4339q.m9706k(r8, r0)
            r1.<init>()
            r1.name = r2
            r1.imageToken = r3
            r1.percentage = r4
            r1.bluEarned = r6
            r1.staked = r8
            return
    }

    public static /* synthetic */ p456ze.C7313f copy$default(p456ze.C7313f r5, java.lang.String r6, java.lang.String r7, double r8, double r10, java.lang.String r12, int r13, java.lang.Object r14) {
            r14 = r13 & 1
            if (r14 == 0) goto L6
            java.lang.String r6 = r5.name
        L6:
            r14 = r13 & 2
            if (r14 == 0) goto Lc
            java.lang.String r7 = r5.imageToken
        Lc:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L13
            double r8 = r5.percentage
        L13:
            r0 = r8
            r7 = r13 & 8
            if (r7 == 0) goto L1a
            double r10 = r5.bluEarned
        L1a:
            r2 = r10
            r7 = r13 & 16
            if (r7 == 0) goto L21
            java.lang.String r12 = r5.staked
        L21:
            r4 = r12
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r0
            r12 = r2
            r14 = r4
            ze.f r5 = r7.copy(r8, r9, r10, r12, r14)
            return r5
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.imageToken
            return r0
    }

    public final double component3() {
            r2 = this;
            double r0 = r2.percentage
            return r0
    }

    public final double component4() {
            r2 = this;
            double r0 = r2.bluEarned
            return r0
    }

    public final java.lang.String component5() {
            r1 = this;
            java.lang.String r0 = r1.staked
            return r0
    }

    public final p456ze.C7313f copy(java.lang.String r10, java.lang.String r11, double r12, double r14, java.lang.String r16) {
            r9 = this;
            java.lang.String r0 = "name"
            r2 = r10
            p214m2.C4339q.m9706k(r10, r0)
            java.lang.String r0 = "imageToken"
            r3 = r11
            p214m2.C4339q.m9706k(r11, r0)
            java.lang.String r0 = "staked"
            r8 = r16
            p214m2.C4339q.m9706k(r8, r0)
            ze.f r0 = new ze.f
            r1 = r0
            r4 = r12
            r6 = r14
            r1.<init>(r2, r3, r4, r6, r8)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p456ze.C7313f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ze.f r6 = (p456ze.C7313f) r6
            java.lang.String r1 = r5.name
            java.lang.String r3 = r6.name
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r5.imageToken
            java.lang.String r3 = r6.imageToken
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            double r3 = r5.percentage
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.percentage
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L35
            return r2
        L35:
            double r3 = r5.bluEarned
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.bluEarned
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L48
            return r2
        L48:
            java.lang.String r1 = r5.staked
            java.lang.String r6 = r6.staked
            boolean r6 = p214m2.C4339q.m9702c(r1, r6)
            if (r6 != 0) goto L53
            return r2
        L53:
            return r0
    }

    public final double getBluEarned() {
            r2 = this;
            double r0 = r2.bluEarned
            return r0
    }

    public final java.lang.String getImageToken() {
            r1 = this;
            java.lang.String r0 = r1.imageToken
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final double getPercentage() {
            r2 = this;
            double r0 = r2.percentage
            return r0
    }

    public final java.lang.String getStaked() {
            r1 = this;
            java.lang.String r0 = r1.staked
            return r0
    }

    public int hashCode() {
            r6 = this;
            java.lang.String r0 = r6.name
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r6.imageToken
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            double r1 = r6.percentage
            long r1 = java.lang.Double.doubleToLongBits(r1)
            r3 = 32
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            double r1 = r6.bluEarned
            long r1 = java.lang.Double.doubleToLongBits(r1)
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r1 = r6.staked
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "PoolBluDacUI(name="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.name
            r0.append(r1)
            java.lang.String r1 = ", imageToken="
            r0.append(r1)
            java.lang.String r1 = r3.imageToken
            r0.append(r1)
            java.lang.String r1 = ", percentage="
            r0.append(r1)
            double r1 = r3.percentage
            r0.append(r1)
            java.lang.String r1 = ", bluEarned="
            r0.append(r1)
            double r1 = r3.bluEarned
            r0.append(r1)
            java.lang.String r1 = ", staked="
            r0.append(r1)
            java.lang.String r1 = r3.staked
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
