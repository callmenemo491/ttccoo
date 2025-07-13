package p193kj;

/* renamed from: kj.b */
/* loaded from: classes.dex */
public class C4141b {

    /* renamed from: a */
    public java.math.BigInteger f17164a;

    /* renamed from: b */
    public java.math.BigInteger f17165b;

    /* renamed from: c */
    public java.math.BigInteger f17166c;

    public C4141b(java.math.BigInteger r1, java.math.BigInteger r2, java.math.BigInteger r3, int r4, int r5, java.math.BigInteger r6, p193kj.C4142c r7) {
            r0 = this;
            r0.<init>()
            if (r5 == 0) goto L1e
            int r6 = r1.bitLength()
            if (r5 > r6) goto L16
            if (r5 < r4) goto Le
            goto L1e
        Le:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "when l value specified, it may not be less than m value"
            r1.<init>(r2)
            throw r1
        L16:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "when l value specified, it must satisfy 2^(l-1) <= p"
            r1.<init>(r2)
            throw r1
        L1e:
            int r5 = r1.bitLength()
            if (r4 > r5) goto L2b
            r0.f17164a = r2
            r0.f17165b = r1
            r0.f17166c = r3
            return
        L2b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "unsafe p value so small specific l required"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p193kj.C4141b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            kj.b r4 = (p193kj.C4141b) r4
            java.math.BigInteger r0 = r3.f17166c
            if (r0 == 0) goto L15
            java.math.BigInteger r2 = r4.f17166c
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1a
            return r1
        L15:
            java.math.BigInteger r0 = r4.f17166c
            if (r0 == 0) goto L1a
            return r1
        L1a:
            java.math.BigInteger r0 = r4.f17165b
            java.math.BigInteger r2 = r3.f17165b
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2f
            java.math.BigInteger r4 = r4.f17164a
            java.math.BigInteger r0 = r3.f17164a
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L2f
            r1 = 1
        L2f:
            return r1
    }

    public int hashCode() {
            r2 = this;
            java.math.BigInteger r0 = r2.f17165b
            int r0 = r0.hashCode()
            java.math.BigInteger r1 = r2.f17164a
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            java.math.BigInteger r1 = r2.f17166c
            if (r1 == 0) goto L16
            int r1 = r1.hashCode()
            goto L17
        L16:
            r1 = 0
        L17:
            r0 = r0 ^ r1
            return r0
    }
}
