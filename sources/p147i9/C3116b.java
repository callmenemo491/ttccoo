package p147i9;

/* renamed from: i9.b */
/* loaded from: classes.dex */
public final class C3116b implements p093f9.InterfaceC2083a {

    /* renamed from: a */
    public final javax.crypto.SecretKey f12512a;

    public C3116b(java.lang.String r2, java.security.KeyStore r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            java.security.Key r3 = r3.getKey(r2, r0)
            javax.crypto.SecretKey r3 = (javax.crypto.SecretKey) r3
            r1.f12512a = r3
            if (r3 == 0) goto Lf
            return
        Lf:
            java.security.InvalidKeyException r3 = new java.security.InvalidKeyException
            java.lang.String r0 = "Keystore cannot load the key with ID: "
            java.lang.String r2 = p064e.C1493g.m4049a(r0, r2)
            r3.<init>(r2)
            throw r3
    }

    @Override // p093f9.InterfaceC2083a
    /* renamed from: a */
    public byte[] mo5506a(byte[] r10, byte[] r11) {
            r9 = this;
            int r0 = r10.length
            r1 = 2147483619(0x7fffffe3, float:NaN)
            if (r0 > r1) goto L30
            int r0 = r10.length
            r1 = 12
            int r0 = r0 + r1
            int r0 = r0 + 16
            byte[] r0 = new byte[r0]
            java.lang.String r2 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r8 = javax.crypto.Cipher.getInstance(r2)
            r2 = 1
            javax.crypto.SecretKey r3 = r9.f12512a
            r8.init(r2, r3)
            r8.updateAAD(r11)
            r4 = 0
            int r5 = r10.length
            r7 = 12
            r2 = r8
            r3 = r10
            r6 = r0
            r2.doFinal(r3, r4, r5, r6, r7)
            byte[] r10 = r8.getIV()
            r11 = 0
            java.lang.System.arraycopy(r10, r11, r0, r11, r1)
            return r0
        L30:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "plaintext too long"
            r10.<init>(r11)
            throw r10
    }

    @Override // p093f9.InterfaceC2083a
    /* renamed from: b */
    public byte[] mo5507b(byte[] r6, byte[] r7) {
            r5 = this;
            int r0 = r6.length
            r1 = 28
            if (r0 < r1) goto L25
            javax.crypto.spec.GCMParameterSpec r0 = new javax.crypto.spec.GCMParameterSpec
            r1 = 128(0x80, float:1.8E-43)
            r2 = 0
            r3 = 12
            r0.<init>(r1, r6, r2, r3)
            java.lang.String r1 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)
            r2 = 2
            javax.crypto.SecretKey r4 = r5.f12512a
            r1.init(r2, r4, r0)
            r1.updateAAD(r7)
            int r7 = r6.length
            int r7 = r7 - r3
            byte[] r6 = r1.doFinal(r6, r3, r7)
            return r6
        L25:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "ciphertext too short"
            r6.<init>(r7)
            throw r6
    }
}
