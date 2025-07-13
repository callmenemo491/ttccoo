package sj;

/* renamed from: sj.b */
/* loaded from: classes.dex */
public abstract class AbstractC6081b {

    /* renamed from: a */
    public static final sj.InterfaceC6080a f23444a = null;

    /* renamed from: b */
    public static final sj.InterfaceC6080a f23445b = null;

    static {
            sj.f r0 = new sj.f
            r1 = 2
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            r0.<init>(r1)
            sj.AbstractC6081b.f23444a = r0
            sj.f r0 = new sj.f
            r1 = 3
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            r0.<init>(r1)
            sj.AbstractC6081b.f23445b = r0
            return
    }

    /* renamed from: a */
    public static sj.InterfaceC6084e m12529a(int[] r3) {
            r0 = 0
            r0 = r3[r0]
            if (r0 != 0) goto L29
            r0 = 1
        L6:
            int r1 = r3.length
            if (r0 >= r1) goto L1c
            r1 = r3[r0]
            int r2 = r0 + (-1)
            r2 = r3[r2]
            if (r1 <= r2) goto L14
            int r0 = r0 + 1
            goto L6
        L14:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Polynomial exponents must be montonically increasing"
            r3.<init>(r0)
            throw r3
        L1c:
            sj.d r0 = new sj.d
            sj.a r1 = sj.AbstractC6081b.f23444a
            sj.c r2 = new sj.c
            r2.<init>(r3)
            r0.<init>(r1, r2)
            return r0
        L29:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Irreducible polynomials in GF(2) must have constant term"
            r3.<init>(r0)
            throw r3
    }
}
