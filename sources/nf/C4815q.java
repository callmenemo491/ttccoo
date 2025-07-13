package nf;

/* renamed from: nf.q */
/* loaded from: classes.dex */
public final class C4815q {
    private final long amount;

    public C4815q(long r1) {
            r0 = this;
            r0.<init>()
            r0.amount = r1
            return
    }

    public static /* synthetic */ nf.C4815q copy$default(nf.C4815q r0, long r1, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            long r1 = r0.amount
        L6:
            nf.q r0 = r0.copy(r1)
            return r0
    }

    public final long component1() {
            r2 = this;
            long r0 = r2.amount
            return r0
    }

    public final nf.C4815q copy(long r2) {
            r1 = this;
            nf.q r0 = new nf.q
            r0.<init>(r2)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof nf.C4815q
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            nf.q r8 = (nf.C4815q) r8
            long r3 = r7.amount
            long r5 = r8.amount
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L15
            return r2
        L15:
            return r0
    }

    public final long getAmount() {
            r2 = this;
            long r0 = r2.amount
            return r0
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.amount
            r2 = 32
            long r2 = r0 >>> r2
            long r0 = r0 ^ r2
            int r1 = (int) r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "SestStaked(amount="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            long r1 = r3.amount
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
