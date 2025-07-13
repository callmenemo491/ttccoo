package md;

/* renamed from: md.u */
/* loaded from: classes.dex */
public final class C4581u {
    private final long available;
    private final long max;
    private final long used;

    public C4581u(long r1, long r3, long r5) {
            r0 = this;
            r0.<init>()
            r0.used = r1
            r0.available = r3
            r0.max = r5
            return
    }

    public static /* synthetic */ md.C4581u copy$default(md.C4581u r7, long r8, long r10, long r12, int r14, java.lang.Object r15) {
            r15 = r14 & 1
            if (r15 == 0) goto L6
            long r8 = r7.used
        L6:
            r1 = r8
            r8 = r14 & 2
            if (r8 == 0) goto Ld
            long r10 = r7.available
        Ld:
            r3 = r10
            r8 = r14 & 4
            if (r8 == 0) goto L14
            long r12 = r7.max
        L14:
            r5 = r12
            r0 = r7
            md.u r7 = r0.copy(r1, r3, r5)
            return r7
    }

    public final long component1() {
            r2 = this;
            long r0 = r2.used
            return r0
    }

    public final long component2() {
            r2 = this;
            long r0 = r2.available
            return r0
    }

    public final long component3() {
            r2 = this;
            long r0 = r2.max
            return r0
    }

    public final md.C4581u copy(long r9, long r11, long r13) {
            r8 = this;
            md.u r7 = new md.u
            r0 = r7
            r1 = r9
            r3 = r11
            r5 = r13
            r0.<init>(r1, r3, r5)
            return r7
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof md.C4581u
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            md.u r8 = (md.C4581u) r8
            long r3 = r7.used
            long r5 = r8.used
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            long r3 = r7.available
            long r5 = r8.available
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L1e
            return r2
        L1e:
            long r3 = r7.max
            long r5 = r8.max
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L27
            return r2
        L27:
            return r0
    }

    public final long getAvailable() {
            r2 = this;
            long r0 = r2.available
            return r0
    }

    public final long getMax() {
            r2 = this;
            long r0 = r2.max
            return r0
    }

    public final long getUsed() {
            r2 = this;
            long r0 = r2.used
            return r0
    }

    public int hashCode() {
            r7 = this;
            long r0 = r7.used
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            int r1 = r1 * 31
            long r3 = r7.available
            long r5 = r3 >>> r2
            long r3 = r3 ^ r5
            int r0 = (int) r3
            int r1 = r1 + r0
            int r1 = r1 * 31
            long r3 = r7.max
            long r5 = r3 >>> r2
            long r2 = r3 ^ r5
            int r0 = (int) r2
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Limit(used="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            long r1 = r3.used
            r0.append(r1)
            java.lang.String r1 = ", available="
            r0.append(r1)
            long r1 = r3.available
            r0.append(r1)
            java.lang.String r1 = ", max="
            r0.append(r1)
            long r1 = r3.max
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
