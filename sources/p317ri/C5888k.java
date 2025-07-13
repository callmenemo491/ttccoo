package p317ri;

/* renamed from: ri.k */
/* loaded from: classes.dex */
public class C5888k extends p317ri.AbstractC5912s {

    /* renamed from: Y */
    public final byte[] f22709Y;

    public C5888k(long r1) {
            r0 = this;
            r0.<init>()
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            byte[] r1 = r1.toByteArray()
            r0.f22709Y = r1
            return
    }

    public C5888k(java.math.BigInteger r1) {
            r0 = this;
            r0.<init>()
            byte[] r1 = r1.toByteArray()
            r0.f22709Y = r1
            return
    }

    public C5888k(byte[] r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "org.bouncycastle.asn1.allow_unsafe_integer"
            boolean r0 = p400wj.C6891d.m13957a(r0)
            if (r0 != 0) goto L1a
            boolean r0 = m12241F(r2)
            if (r0 != 0) goto L12
            goto L1a
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "malformed integer"
            r2.<init>(r3)
            throw r2
        L1a:
            if (r3 == 0) goto L20
            byte[] r2 = p400wj.C6888a.m13951c(r2)
        L20:
            r1.f22709Y = r2
            return
    }

    /* renamed from: C */
    public static p317ri.C5888k m12240C(java.lang.Object r2) {
            if (r2 == 0) goto L40
            boolean r0 = r2 instanceof p317ri.C5888k
            if (r0 == 0) goto L7
            goto L40
        L7:
            boolean r0 = r2 instanceof byte[]
            if (r0 == 0) goto L25
            byte[] r2 = (byte[]) r2     // Catch: java.lang.Exception -> L14
            ri.s r2 = p317ri.AbstractC5912s.m12271u(r2)     // Catch: java.lang.Exception -> L14
            ri.k r2 = (p317ri.C5888k) r2     // Catch: java.lang.Exception -> L14
            return r2
        L14:
            r2 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "encoding error in getInstance: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = androidx.fragment.app.C0390k0.m1221a(r2, r1)
            r0.<init>(r2)
            throw r0
        L25:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "illegal object in getInstance: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
        L40:
            ri.k r2 = (p317ri.C5888k) r2
            return r2
    }

    /* renamed from: F */
    public static boolean m12241F(byte[] r4) {
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 <= r2) goto L1c
            r0 = r4[r1]
            if (r0 != 0) goto L10
            r0 = r4[r2]
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 != 0) goto L10
            return r2
        L10:
            r0 = r4[r1]
            r3 = -1
            if (r0 != r3) goto L1c
            r4 = r4[r2]
            r4 = r4 & 128(0x80, float:1.8E-43)
            if (r4 == 0) goto L1c
            return r2
        L1c:
            return r1
    }

    /* renamed from: D */
    public java.math.BigInteger m12242D() {
            r3 = this;
            java.math.BigInteger r0 = new java.math.BigInteger
            byte[] r1 = r3.f22709Y
            r2 = 1
            r0.<init>(r2, r1)
            return r0
    }

    /* renamed from: E */
    public java.math.BigInteger m12243E() {
            r2 = this;
            java.math.BigInteger r0 = new java.math.BigInteger
            byte[] r1 = r2.f22709Y
            r0.<init>(r1)
            return r0
    }

    @Override // p317ri.AbstractC5894m
    public int hashCode() {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            byte[] r2 = r4.f22709Y
            int r3 = r2.length
            if (r0 == r3) goto L12
            r2 = r2[r0]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r0 % 4
            int r2 = r2 << r3
            r1 = r1 ^ r2
            int r0 = r0 + 1
            goto L2
        L12:
            return r1
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: n */
    public boolean mo12203n(p317ri.AbstractC5912s r2) {
            r1 = this;
            boolean r0 = r2 instanceof p317ri.C5888k
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            ri.k r2 = (p317ri.C5888k) r2
            byte[] r0 = r1.f22709Y
            byte[] r2 = r2.f22709Y
            boolean r2 = p400wj.C6888a.m13949a(r0, r2)
            return r2
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: p */
    public void mo12204p(p317ri.C5906q r3) {
            r2 = this;
            byte[] r0 = r2.f22709Y
            r1 = 2
            r3.m12266e(r1, r0)
            return
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: q */
    public int mo12205q() {
            r2 = this;
            byte[] r0 = r2.f22709Y
            int r0 = r0.length
            int r0 = p317ri.C5923v1.m12290a(r0)
            int r0 = r0 + 1
            byte[] r1 = r2.f22709Y
            int r1 = r1.length
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.math.BigInteger r0 = r1.m12243E()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // p317ri.AbstractC5912s
    /* renamed from: w */
    public boolean mo12206w() {
            r1 = this;
            r0 = 0
            return r0
    }
}
