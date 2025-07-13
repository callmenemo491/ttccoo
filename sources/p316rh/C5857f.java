package p316rh;

/* renamed from: rh.f */
/* loaded from: classes.dex */
public final class C5857f extends p316rh.C5855d {
    static {
            rh.f r0 = new rh.f
            r1 = 1
            r3 = 0
            r0.<init>(r1, r3)
            return
    }

    public C5857f(long r8, long r10) {
            r7 = this;
            r5 = 1
            r0 = r7
            r1 = r8
            r3 = r10
            r0.<init>(r1, r3, r5)
            return
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof p316rh.C5857f
            if (r0 == 0) goto L27
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L13
            r0 = r6
            rh.f r0 = (p316rh.C5857f) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L25
        L13:
            long r0 = r5.f22656Y
            rh.f r6 = (p316rh.C5857f) r6
            long r2 = r6.f22656Y
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L27
            long r0 = r5.f22657Z
            long r2 = r6.f22657Z
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L27
        L25:
            r6 = 1
            goto L28
        L27:
            r6 = 0
        L28:
            return r6
    }

    public int hashCode() {
            r7 = this;
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto L1b
        L8:
            r0 = 31
            long r0 = (long) r0
            long r2 = r7.f22656Y
            r4 = 32
            long r5 = r2 >>> r4
            long r2 = r2 ^ r5
            long r0 = r0 * r2
            long r2 = r7.f22657Z
            long r4 = r2 >>> r4
            long r2 = r2 ^ r4
            long r0 = r0 + r2
            int r0 = (int) r0
        L1b:
            return r0
    }

    public boolean isEmpty() {
            r5 = this;
            long r0 = r5.f22656Y
            long r2 = r5.f22657Z
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r3.f22656Y
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            long r1 = r3.f22657Z
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
