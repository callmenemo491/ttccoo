package p193kj;

/* renamed from: kj.f */
/* loaded from: classes.dex */
public class C4145f implements p240nj.InterfaceC4844b {

    /* renamed from: Y */
    public p240nj.AbstractC4845c f17175Y;

    /* renamed from: Z */
    public byte[] f17176Z;

    /* renamed from: a0 */
    public p240nj.AbstractC4848f f17177a0;

    /* renamed from: b0 */
    public java.math.BigInteger f17178b0;

    /* renamed from: c0 */
    public java.math.BigInteger f17179c0;

    public C4145f(p240nj.AbstractC4845c r2, p240nj.AbstractC4848f r3, java.math.BigInteger r4, java.math.BigInteger r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "curve"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "n"
            java.util.Objects.requireNonNull(r4, r0)
            r1.f17175Y = r2
            if (r3 == 0) goto L45
            nj.f r2 = p240nj.C4843a.m10865e(r2, r3)
            nj.f r2 = r2.m10934o()
            boolean r3 = r2.m10930k()
            if (r3 != 0) goto L3d
            r3 = 0
            r0 = 1
            boolean r3 = r2.m10929j(r3, r0)
            if (r3 == 0) goto L35
            r1.f17177a0 = r2
            r1.f17178b0 = r4
            r1.f17179c0 = r5
            r2 = 0
            byte[] r2 = p400wj.C6888a.m13951c(r2)
            r1.f17176Z = r2
            return
        L35:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Point not on curve"
            r2.<init>(r3)
            throw r2
        L3d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Point at infinity"
            r2.<init>(r3)
            throw r2
        L45:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Point has null value"
            r2.<init>(r3)
            throw r2
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p193kj.C4145f
            r2 = 0
            if (r1 == 0) goto L36
            kj.f r5 = (p193kj.C4145f) r5
            nj.c r1 = r4.f17175Y
            nj.c r3 = r5.f17175Y
            boolean r1 = r1.m10878k(r3)
            if (r1 == 0) goto L34
            nj.f r1 = r4.f17177a0
            nj.f r3 = r5.f17177a0
            boolean r1 = r1.m10922c(r3)
            if (r1 == 0) goto L34
            java.math.BigInteger r1 = r4.f17178b0
            java.math.BigInteger r3 = r5.f17178b0
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L34
            java.math.BigInteger r1 = r4.f17179c0
            java.math.BigInteger r5 = r5.f17179c0
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L34
            goto L35
        L34:
            r0 = 0
        L35:
            return r0
        L36:
            return r2
    }

    public int hashCode() {
            r2 = this;
            nj.c r0 = r2.f17175Y
            int r0 = r0.hashCode()
            int r0 = r0 * 37
            nj.f r1 = r2.f17177a0
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            int r0 = r0 * 37
            java.math.BigInteger r1 = r2.f17178b0
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            int r0 = r0 * 37
            java.math.BigInteger r1 = r2.f17179c0
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }
}
