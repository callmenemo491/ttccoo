package p400wj;

/* renamed from: wj.b */
/* loaded from: classes.dex */
public final class C6889b {

    /* renamed from: a */
    public static final java.math.BigInteger f26791a = null;

    /* renamed from: b */
    public static final java.math.BigInteger f26792b = null;

    static {
            r0 = 0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            p400wj.C6889b.f26791a = r0
            r0 = 1
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            p400wj.C6889b.f26792b = r0
            r0 = 2
            java.math.BigInteger.valueOf(r0)
            r0 = 3
            java.math.BigInteger.valueOf(r0)
            return
    }

    /* renamed from: a */
    public static java.math.BigInteger m13956a(byte[] r2, int r3, int r4) {
            if (r3 != 0) goto L5
            int r0 = r2.length
            if (r4 == r0) goto Lc
        L5:
            byte[] r0 = new byte[r4]
            r1 = 0
            java.lang.System.arraycopy(r2, r3, r0, r1, r4)
            r2 = r0
        Lc:
            java.math.BigInteger r3 = new java.math.BigInteger
            r4 = 1
            r3.<init>(r4, r2)
            return r3
    }
}
