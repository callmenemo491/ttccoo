package org.bitcoinj.core;

/* loaded from: classes.dex */
public class Sha256Hash implements java.io.Serializable, java.lang.Comparable<org.bitcoinj.core.Sha256Hash> {

    /* renamed from: Y */
    public final byte[] f21228Y;

    static {
            r0 = 32
            byte[] r0 = new byte[r0]
            org.bitcoinj.core.Sha256Hash r1 = new org.bitcoinj.core.Sha256Hash
            r1.<init>(r0)
            return
    }

    public Sha256Hash(byte[] r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            r1 = 32
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            p124h7.C2939x3.m7276b(r0)
            r2.f21228Y = r3
            return
    }

    /* renamed from: e */
    public static byte[] m11640e(byte[] r3) {
            int r0 = r3.length
            java.lang.String r1 = "SHA-256"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.security.NoSuchAlgorithmException -> L10
            r2 = 0
            r1.update(r3, r2, r0)
            byte[] r3 = r1.digest()
            return r3
        L10:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r3)
            throw r0
    }

    /* renamed from: g */
    public static byte[] m11641g(byte[] r3) {
            int r0 = r3.length
            java.lang.String r1 = "SHA-256"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.security.NoSuchAlgorithmException -> L14
            r2 = 0
            r1.update(r3, r2, r0)
            byte[] r3 = r1.digest()
            byte[] r3 = r1.digest(r3)
            return r3
        L14:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r3)
            throw r0
    }

    @Override // java.lang.Comparable
    public int compareTo(org.bitcoinj.core.Sha256Hash r4) {
            r3 = this;
            org.bitcoinj.core.Sha256Hash r4 = (org.bitcoinj.core.Sha256Hash) r4
            r0 = 31
        L4:
            if (r0 < 0) goto L1d
            byte[] r1 = r3.f21228Y
            r1 = r1[r0]
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte[] r2 = r4.f21228Y
            r2 = r2[r0]
            r2 = r2 & 255(0xff, float:3.57E-43)
            if (r1 <= r2) goto L16
            r4 = 1
            goto L1e
        L16:
            if (r1 >= r2) goto L1a
            r4 = -1
            goto L1e
        L1a:
            int r0 = r0 + (-1)
            goto L4
        L1d:
            r4 = 0
        L1e:
            return r4
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<org.bitcoinj.core.Sha256Hash> r0 = org.bitcoinj.core.Sha256Hash.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            byte[] r0 = r2.f21228Y
            org.bitcoinj.core.Sha256Hash r3 = (org.bitcoinj.core.Sha256Hash) r3
            byte[] r3 = r3.f21228Y
            boolean r3 = java.util.Arrays.equals(r0, r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r5 = this;
            byte[] r0 = r5.f21228Y
            r1 = 28
            r1 = r0[r1]
            r2 = 29
            r2 = r0[r2]
            r3 = 30
            r3 = r0[r3]
            r4 = 31
            r0 = r0[r4]
            int r1 = r1 << 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            r1 = r1 | r2
            r2 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r1 = r1 | r2
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            return r0
    }

    public java.lang.String toString() {
            r8 = this;
            c9.a r0 = p297qi.C5657c.f21953a
            byte[] r1 = r8.f21228Y
            java.util.Objects.requireNonNull(r0)
            int r2 = r1.length
            r3 = 0
            int r4 = r2 + 0
            int r5 = r1.length
            p124h7.C2939x3.m7283i(r3, r4, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = r0
            c9.a$e r5 = (p039c9.AbstractC0936a.e) r5
            c9.a$a r5 = r5.f4912b
            int r6 = r5.f4907e
            int r5 = r5.f4908f
            java.math.RoundingMode r7 = java.math.RoundingMode.CEILING
            int r5 = p055d9.C1345a.m3842a(r2, r5, r7)
            int r5 = r5 * r6
            r4.<init>(r5)
            r0.mo2655b(r4, r1, r3, r2)     // Catch: java.io.IOException -> L2d
            java.lang.String r0 = r4.toString()
            return r0
        L2d:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }
}
