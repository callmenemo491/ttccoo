package p193kj;

/* renamed from: kj.d */
/* loaded from: classes.dex */
public class C4143d {

    /* renamed from: a */
    public java.math.BigInteger f17169a;

    /* renamed from: b */
    public java.math.BigInteger f17170b;

    /* renamed from: c */
    public java.math.BigInteger f17171c;

    /* renamed from: d */
    public p193kj.C4144e f17172d;

    public C4143d(java.math.BigInteger r1, java.math.BigInteger r2, java.math.BigInteger r3, p193kj.C4144e r4) {
            r0 = this;
            r0.<init>()
            r0.f17169a = r3
            r0.f17171c = r1
            r0.f17170b = r2
            r0.f17172d = r4
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p193kj.C4143d
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            kj.d r4 = (p193kj.C4143d) r4
            java.math.BigInteger r0 = r4.f17171c
            java.math.BigInteger r2 = r3.f17171c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L27
            java.math.BigInteger r0 = r4.f17170b
            java.math.BigInteger r2 = r3.f17170b
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L27
            java.math.BigInteger r4 = r4.f17169a
            java.math.BigInteger r0 = r3.f17169a
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L27
            r1 = 1
        L27:
            return r1
    }

    public int hashCode() {
            r2 = this;
            java.math.BigInteger r0 = r2.f17171c
            int r0 = r0.hashCode()
            java.math.BigInteger r1 = r2.f17170b
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            java.math.BigInteger r1 = r2.f17169a
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }
}
