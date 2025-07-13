package p236n9;

/* renamed from: n9.e */
/* loaded from: classes.dex */
public final class C4704e implements p093f9.InterfaceC2085c {

    /* renamed from: c */
    public static final java.util.Collection<java.lang.Integer> f18793c = null;

    /* renamed from: d */
    public static final byte[] f18794d = null;

    /* renamed from: e */
    public static final byte[] f18795e = null;

    /* renamed from: a */
    public final p236n9.C4700a f18796a;

    /* renamed from: b */
    public final byte[] f18797b;

    static {
            r0 = 1
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            r1 = 64
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            p236n9.C4704e.f18793c = r0
            r0 = 16
            byte[] r1 = new byte[r0]
            p236n9.C4704e.f18794d = r1
            byte[] r0 = new byte[r0]
            r0 = {x0020: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1} // fill-array
            p236n9.C4704e.f18795e = r0
            return
    }

    public C4704e(byte[] r4) {
            r3 = this;
            r3.<init>()
            java.util.Collection<java.lang.Integer> r0 = p236n9.C4704e.f18793c
            int r1 = r4.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L2c
            r0 = 0
            int r1 = r4.length
            int r1 = r1 / 2
            byte[] r0 = java.util.Arrays.copyOfRange(r4, r0, r1)
            int r1 = r4.length
            int r1 = r1 / 2
            int r2 = r4.length
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r1, r2)
            r3.f18797b = r4
            n9.a r4 = new n9.a
            r1 = 16
            r4.<init>(r0, r1)
            r3.f18796a = r4
            return
        L2c:
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            java.lang.String r1 = "invalid key size: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            int r4 = r4.length
            java.lang.String r2 = " bytes; key must have 64 bytes"
            java.lang.String r4 = p381w.C6764e.m13690a(r1, r4, r2)
            r0.<init>(r4)
            throw r0
    }

    @Override // p093f9.InterfaceC2085c
    /* renamed from: a */
    public byte[] mo5508a(byte[] r9, byte[] r10) {
            r8 = this;
            int r0 = r9.length
            r1 = 2147483631(0x7fffffef, float:NaN)
            if (r0 > r1) goto L55
            n9.l<n9.m$a, javax.crypto.Cipher> r0 = p236n9.C4711l.f18821e
            java.lang.String r1 = "AES/CTR/NoPadding"
            java.lang.Object r0 = r0.m10770a(r1)
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            r1 = 2
            byte[][] r2 = new byte[r1][]
            r3 = 0
            r2[r3] = r10
            r10 = 1
            r2[r10] = r9
            byte[] r2 = r8.m10753c(r2)
            java.lang.Object r4 = r2.clone()
            byte[] r4 = (byte[]) r4
            r5 = 8
            r6 = r4[r5]
            r6 = r6 & 127(0x7f, float:1.78E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            r5 = 12
            r6 = r4[r5]
            r6 = r6 & 127(0x7f, float:1.78E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            javax.crypto.spec.SecretKeySpec r5 = new javax.crypto.spec.SecretKeySpec
            byte[] r6 = r8.f18797b
            java.lang.String r7 = "AES"
            r5.<init>(r6, r7)
            javax.crypto.spec.IvParameterSpec r6 = new javax.crypto.spec.IvParameterSpec
            r6.<init>(r4)
            r0.init(r10, r5, r6)
            byte[] r9 = r0.doFinal(r9)
            byte[][] r0 = new byte[r1][]
            r0[r3] = r2
            r0[r10] = r9
            byte[] r9 = p185k7.C3828h5.m8589d(r0)
            return r9
        L55:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r10 = "plaintext too long"
            r9.<init>(r10)
            throw r9
    }

    @Override // p093f9.InterfaceC2085c
    /* renamed from: b */
    public byte[] mo5509b(byte[] r9, byte[] r10) {
            r8 = this;
            int r0 = r9.length
            r1 = 16
            if (r0 < r1) goto L6e
            n9.l<n9.m$a, javax.crypto.Cipher> r0 = p236n9.C4711l.f18821e
            java.lang.String r2 = "AES/CTR/NoPadding"
            java.lang.Object r0 = r0.m10770a(r2)
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            r2 = 0
            byte[] r3 = java.util.Arrays.copyOfRange(r9, r2, r1)
            java.lang.Object r4 = r3.clone()
            byte[] r4 = (byte[]) r4
            r5 = 8
            r6 = r4[r5]
            r6 = r6 & 127(0x7f, float:1.78E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            r5 = 12
            r6 = r4[r5]
            r6 = r6 & 127(0x7f, float:1.78E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            javax.crypto.spec.SecretKeySpec r5 = new javax.crypto.spec.SecretKeySpec
            byte[] r6 = r8.f18797b
            java.lang.String r7 = "AES"
            r5.<init>(r6, r7)
            javax.crypto.spec.IvParameterSpec r6 = new javax.crypto.spec.IvParameterSpec
            r6.<init>(r4)
            r4 = 2
            r0.init(r4, r5, r6)
            int r5 = r9.length
            byte[] r9 = java.util.Arrays.copyOfRange(r9, r1, r5)
            byte[] r0 = r0.doFinal(r9)
            int r9 = r9.length
            if (r9 != 0) goto L54
            if (r0 != 0) goto L54
            boolean r9 = p185k7.C4038x4.m9095h()
            if (r9 == 0) goto L54
            byte[] r0 = new byte[r2]
        L54:
            byte[][] r9 = new byte[r4][]
            r9[r2] = r10
            r10 = 1
            r9[r10] = r0
            byte[] r9 = r8.m10753c(r9)
            boolean r9 = p185k7.C3828h5.m8594i(r3, r9)
            if (r9 == 0) goto L66
            return r0
        L66:
            javax.crypto.AEADBadTagException r9 = new javax.crypto.AEADBadTagException
            java.lang.String r10 = "Integrity check failed."
            r9.<init>(r10)
            throw r9
        L6e:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r10 = "Ciphertext too short."
            r9.<init>(r10)
            throw r9
    }

    /* renamed from: c */
    public final byte[] m10753c(byte[]... r7) {
            r6 = this;
            int r0 = r7.length
            if (r0 != 0) goto Lc
            n9.a r7 = r6.f18796a
            byte[] r0 = p236n9.C4704e.f18795e
            byte[] r7 = r7.mo5537b(r0)
            return r7
        Lc:
            n9.a r0 = r6.f18796a
            byte[] r1 = p236n9.C4704e.f18794d
            byte[] r0 = r0.mo5537b(r1)
            r1 = 0
            r2 = 0
        L16:
            int r3 = r7.length
            int r3 = r3 + (-1)
            if (r2 >= r3) goto L35
            r3 = r7[r2]
            if (r3 != 0) goto L22
            byte[] r3 = new byte[r1]
            goto L24
        L22:
            r3 = r7[r2]
        L24:
            byte[] r0 = p074e9.C1805a.m4521f(r0)
            n9.a r4 = r6.f18796a
            byte[] r3 = r4.mo5537b(r3)
            byte[] r0 = p185k7.C3828h5.m8583L(r0, r3)
            int r2 = r2 + 1
            goto L16
        L35:
            int r2 = r7.length
            int r2 = r2 + (-1)
            r7 = r7[r2]
            int r2 = r7.length
            r3 = 16
            if (r2 < r3) goto L63
            int r2 = r7.length
            int r3 = r0.length
            if (r2 < r3) goto L5b
            int r2 = r7.length
            int r3 = r0.length
            int r2 = r2 - r3
            int r3 = r7.length
            byte[] r7 = java.util.Arrays.copyOf(r7, r3)
        L4b:
            int r3 = r0.length
            if (r1 >= r3) goto L6f
            int r3 = r2 + r1
            r4 = r7[r3]
            r5 = r0[r1]
            r4 = r4 ^ r5
            byte r4 = (byte) r4
            r7[r3] = r4
            int r1 = r1 + 1
            goto L4b
        L5b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "xorEnd requires a.length >= b.length"
            r7.<init>(r0)
            throw r7
        L63:
            byte[] r7 = p074e9.C1805a.m4518c(r7)
            byte[] r0 = p074e9.C1805a.m4521f(r0)
            byte[] r7 = p185k7.C3828h5.m8583L(r7, r0)
        L6f:
            n9.a r0 = r6.f18796a
            byte[] r7 = r0.mo5537b(r7)
            return r7
    }
}
