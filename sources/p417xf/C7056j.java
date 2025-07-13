package p417xf;

/* renamed from: xf.j */
/* loaded from: classes.dex */
public final class C7056j {
    private final double median;
    private final double value;

    public C7056j(double r1, double r3) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            r0.median = r3
            return
    }

    public static /* synthetic */ p417xf.C7056j copy$default(p417xf.C7056j r0, double r1, double r3, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            double r1 = r0.value
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lc
            double r3 = r0.median
        Lc:
            xf.j r0 = r0.copy(r1, r3)
            return r0
    }

    public final double component1() {
            r2 = this;
            double r0 = r2.value
            return r0
    }

    public final double component2() {
            r2 = this;
            double r0 = r2.median
            return r0
    }

    public final p417xf.C7056j copy(double r2, double r4) {
            r1 = this;
            xf.j r0 = new xf.j
            r0.<init>(r2, r4)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p417xf.C7056j
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xf.j r6 = (p417xf.C7056j) r6
            double r3 = r5.value
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.value
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L1f
            return r2
        L1f:
            double r3 = r5.median
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.median
            java.lang.Double r6 = java.lang.Double.valueOf(r3)
            boolean r6 = p214m2.C4339q.m9702c(r1, r6)
            if (r6 != 0) goto L32
            return r2
        L32:
            return r0
    }

    public final double getMedian() {
            r2 = this;
            double r0 = r2.median
            return r0
    }

    public final double getValue() {
            r2 = this;
            double r0 = r2.value
            return r0
    }

    public int hashCode() {
            r7 = this;
            double r0 = r7.value
            long r0 = java.lang.Double.doubleToLongBits(r0)
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            int r1 = r1 * 31
            double r3 = r7.median
            long r3 = java.lang.Double.doubleToLongBits(r3)
            long r5 = r3 >>> r2
            long r2 = r3 ^ r5
            int r0 = (int) r2
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "DelphioracleRow(value="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            double r1 = r3.value
            r0.append(r1)
            java.lang.String r1 = ", median="
            r0.append(r1)
            double r1 = r3.median
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
