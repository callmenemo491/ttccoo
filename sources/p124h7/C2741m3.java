package p124h7;

/* renamed from: h7.m3 */
/* loaded from: classes.dex */
public final class C2741m3 implements p124h7.InterfaceC2703k1 {

    /* renamed from: a */
    public final javax.crypto.SecretKey f11760a;

    public C2741m3(java.lang.String r3, java.security.KeyStore r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            java.security.Key r4 = r4.getKey(r3, r0)
            javax.crypto.SecretKey r4 = (javax.crypto.SecretKey) r4
            r2.f11760a = r4
            if (r4 != 0) goto L2a
            java.security.InvalidKeyException r4 = new java.security.InvalidKeyException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "Keystore cannot load the key with ID: "
            int r1 = r3.length()
            if (r1 == 0) goto L21
            java.lang.String r3 = r0.concat(r3)
            goto L26
        L21:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
        L26:
            r4.<init>(r3)
            throw r4
        L2a:
            return
    }

    @Override // p124h7.InterfaceC2703k1
    /* renamed from: a */
    public final byte[] mo6933a(byte[] r5, byte[] r6) {
            r4 = this;
            byte[] r5 = r4.m6966c(r5, r6)     // Catch: java.security.GeneralSecurityException -> L5 java.security.ProviderException -> L7
            return r5
        L5:
            r0 = move-exception
            goto L8
        L7:
            r0 = move-exception
        L8:
            java.lang.String r1 = "m3"
            java.lang.String r2 = "encountered a potentially transient KeyStore error, will wait and retry"
            android.util.Log.w(r1, r2, r0)
            double r0 = java.lang.Math.random()
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r2
            int r0 = (int) r0
            long r0 = (long) r0
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L1c
        L1c:
            byte[] r5 = r4.m6966c(r5, r6)
            return r5
    }

    @Override // p124h7.InterfaceC2703k1
    /* renamed from: b */
    public final byte[] mo6934b(byte[] r5, byte[] r6) {
            r4 = this;
            byte[] r5 = r4.m6967d(r5, r6)     // Catch: java.security.GeneralSecurityException -> L5 java.security.ProviderException -> L7
            return r5
        L5:
            r0 = move-exception
            goto L8
        L7:
            r0 = move-exception
        L8:
            java.lang.String r1 = "m3"
            java.lang.String r2 = "encountered a potentially transient KeyStore error, will wait and retry"
            android.util.Log.w(r1, r2, r0)
            double r0 = java.lang.Math.random()
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r2
            int r0 = (int) r0
            long r0 = (long) r0
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L1c
        L1c:
            byte[] r5 = r4.m6967d(r5, r6)
            return r5
    }

    /* renamed from: c */
    public final byte[] m6966c(byte[] r7, byte[] r8) {
            r6 = this;
            int r0 = r7.length
            r1 = 28
            if (r0 < r1) goto L25
            javax.crypto.spec.GCMParameterSpec r1 = new javax.crypto.spec.GCMParameterSpec
            r2 = 128(0x80, float:1.8E-43)
            r3 = 0
            r4 = 12
            r1.<init>(r2, r7, r3, r4)
            java.lang.String r2 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)
            r3 = 2
            javax.crypto.SecretKey r5 = r6.f11760a
            r2.init(r3, r5, r1)
            r2.updateAAD(r8)
            int r0 = r0 + (-12)
            byte[] r7 = r2.doFinal(r7, r4, r0)
            return r7
        L25:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r8 = "ciphertext too short"
            r7.<init>(r8)
            throw r7
    }

    /* renamed from: d */
    public final byte[] m6967d(byte[] r9, byte[] r10) {
            r8 = this;
            int r3 = r9.length
            r0 = 2147483619(0x7fffffe3, float:NaN)
            if (r3 > r0) goto L2d
            int r0 = r3 + 28
            byte[] r6 = new byte[r0]
            java.lang.String r0 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r7 = javax.crypto.Cipher.getInstance(r0)
            r0 = 1
            javax.crypto.SecretKey r1 = r8.f11760a
            r7.init(r0, r1)
            r7.updateAAD(r10)
            r2 = 0
            r5 = 12
            r0 = r7
            r1 = r9
            r4 = r6
            r0.doFinal(r1, r2, r3, r4, r5)
            byte[] r9 = r7.getIV()
            r10 = 12
            r0 = 0
            java.lang.System.arraycopy(r9, r0, r6, r0, r10)
            return r6
        L2d:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r10 = "plaintext too long"
            r9.<init>(r10)
            throw r9
    }
}
