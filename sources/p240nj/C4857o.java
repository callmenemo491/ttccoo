package p240nj;

/* renamed from: nj.o */
/* loaded from: classes.dex */
public class C4857o {

    /* renamed from: a */
    public final java.math.BigInteger f19305a;

    /* renamed from: b */
    public final int f19306b;

    public C4857o(java.math.BigInteger r1, int r2) {
            r0 = this;
            r0.<init>()
            if (r2 < 0) goto La
            r0.f19305a = r1
            r0.f19306b = r2
            return
        La:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "scale may not be negative"
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: a */
    public p240nj.C4857o m10976a(p240nj.C4857o r3) {
            r2 = this;
            int r0 = r2.f19306b
            int r1 = r3.f19306b
            if (r0 != r1) goto L16
            nj.o r0 = new nj.o
            java.math.BigInteger r1 = r2.f19305a
            java.math.BigInteger r3 = r3.f19305a
            java.math.BigInteger r3 = r1.add(r3)
            int r1 = r2.f19306b
            r0.<init>(r3, r1)
            return r0
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Only SimpleBigDecimal of same scale allowed in arithmetic operations"
            r3.<init>(r0)
            throw r3
    }

    /* renamed from: b */
    public int m10977b(java.math.BigInteger r3) {
            r2 = this;
            java.math.BigInteger r0 = r2.f19305a
            int r1 = r2.f19306b
            java.math.BigInteger r3 = r3.shiftLeft(r1)
            int r3 = r0.compareTo(r3)
            return r3
    }

    /* renamed from: c */
    public java.math.BigInteger m10978c() {
            r4 = this;
            nj.o r0 = new nj.o
            java.math.BigInteger r1 = p240nj.InterfaceC4844b.f19244S
            r2 = 1
            r0.<init>(r1, r2)
            int r3 = r4.f19306b
            if (r3 < 0) goto L27
            if (r3 != r2) goto Lf
            goto L1a
        Lf:
            nj.o r0 = new nj.o
            int r2 = r3 + (-1)
            java.math.BigInteger r1 = r1.shiftLeft(r2)
            r0.<init>(r1, r3)
        L1a:
            nj.o r0 = r4.m10976a(r0)
            java.math.BigInteger r1 = r0.f19305a
            int r0 = r0.f19306b
            java.math.BigInteger r0 = r1.shiftRight(r0)
            return r0
        L27:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "scale may not be negative"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: d */
    public p240nj.C4857o m10979d(p240nj.C4857o r3) {
            r2 = this;
            nj.o r0 = new nj.o
            java.math.BigInteger r1 = r3.f19305a
            java.math.BigInteger r1 = r1.negate()
            int r3 = r3.f19306b
            r0.<init>(r1, r3)
            nj.o r3 = r2.m10976a(r0)
            return r3
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p240nj.C4857o
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            nj.o r5 = (p240nj.C4857o) r5
            java.math.BigInteger r1 = r4.f19305a
            java.math.BigInteger r3 = r5.f19305a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1d
            int r1 = r4.f19306b
            int r5 = r5.f19306b
            if (r1 != r5) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.math.BigInteger r0 = r2.f19305a
            int r0 = r0.hashCode()
            int r1 = r2.f19306b
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r8 = this;
            int r0 = r8.f19306b
            if (r0 != 0) goto Lb
            java.math.BigInteger r0 = r8.f19305a
            java.lang.String r0 = r0.toString()
            return r0
        Lb:
            java.math.BigInteger r1 = r8.f19305a
            java.math.BigInteger r0 = r1.shiftRight(r0)
            java.math.BigInteger r1 = r8.f19305a
            int r2 = r8.f19306b
            java.math.BigInteger r2 = r0.shiftLeft(r2)
            java.math.BigInteger r1 = r1.subtract(r2)
            java.math.BigInteger r2 = r8.f19305a
            int r2 = r2.signum()
            r3 = -1
            if (r2 != r3) goto L32
            java.math.BigInteger r2 = p240nj.InterfaceC4844b.f19244S
            int r4 = r8.f19306b
            java.math.BigInteger r2 = r2.shiftLeft(r4)
            java.math.BigInteger r1 = r2.subtract(r1)
        L32:
            int r2 = r0.signum()
            if (r2 != r3) goto L46
            java.math.BigInteger r2 = p240nj.InterfaceC4844b.f19243R
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L46
            java.math.BigInteger r2 = p240nj.InterfaceC4844b.f19244S
            java.math.BigInteger r0 = r0.add(r2)
        L46:
            java.lang.String r0 = r0.toString()
            int r2 = r8.f19306b
            char[] r2 = new char[r2]
            r3 = 2
            java.lang.String r1 = r1.toString(r3)
            int r3 = r1.length()
            int r4 = r8.f19306b
            int r4 = r4 - r3
            r5 = 0
            r6 = 0
        L5c:
            if (r6 >= r4) goto L65
            r7 = 48
            r2[r6] = r7
            int r6 = r6 + 1
            goto L5c
        L65:
            if (r5 >= r3) goto L72
            int r6 = r4 + r5
            char r7 = r1.charAt(r5)
            r2[r6] = r7
            int r5 = r5 + 1
            goto L65
        L72:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>(r0)
            java.lang.String r0 = "."
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
